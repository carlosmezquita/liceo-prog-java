package com.liceolapaz.des.jcml;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ImportData {
    private String route;
    private static final List<String> PARAMETERS = Arrays.asList("dni","nombre","primer Apellido", "segundo Apellido", "fecha De Nacimiento", "salario", "número De Departamento", "dni Jefe");

    public ImportData(String route) {
        this.route = route;
        File file = new File(this.route);
        if(file.isFile()){
            try{
                Scanner scanner = new Scanner(file);
                if (scanner.hasNext()){
                    HashMap<String, String> employeeData = new HashMap<>();
                    while (scanner.hasNext()) {
                        String line = scanner.nextLine();
                        for (String parameter : PARAMETERS) {
                            if (line.toLowerCase().contains(parameter.toLowerCase())) {
                                String data = line.replaceAll(parameter + ": ", "");
                                data = data.trim();
                                String parameterNoBlank = parameter.replaceAll(" ", "");
                                employeeData.put(parameterNoBlank, data);
                            }
                            if (employeeData.size() == PARAMETERS.size()){
                                System.out.println(employeeData);
                                String dni = employeeData.get("dni");
                                String nombre = employeeData.get("nombre");
                                String primerApellido = employeeData.get("primeroApellido");
                                String segundoApellido = employeeData.get("segundoApellido");
                                Date fechaNacimiento = new SimpleDateFormat("yyyy/MM/dd").parse(employeeData.get("fechaNacimiento"));
                                double salario = Double.parseDouble(employeeData.get("salario"));
                                int numeroDepartamento = Integer.parseInt(employeeData.get("numeroDepartamento"));
                                String dniJefe = employeeData.get("dniJefe");
                                Employee employee = new Employee(dni, nombre, primerApellido, segundoApellido, fechaNacimiento, salario, numeroDepartamento, dniJefe);
                                Main.empleados.put("Empleado"+Main.empleados.size(), employee);
                                employeeData.clear();
                            }
                        }
                    }
                }

            }catch (FileNotFoundException e){
                System.out.println("El archivo especificado no existe");

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
    public void read(){


    }
}
