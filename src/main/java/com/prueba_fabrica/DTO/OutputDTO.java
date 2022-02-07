package com.prueba_fabrica.DTO;

public class OutputDTO {

    private String INPUT;
    private String OUTPUT;

    public OutputDTO(String INPUT, String OUTPUT) {
        this.INPUT = INPUT;
        this.OUTPUT = OUTPUT;
    }

    public OutputDTO(String INPUT) {
        this.INPUT = INPUT;
    }

    public OutputDTO() {
    }

    public String getINPUT() {
        return INPUT;
    }

    public void setINPUT(String INPUT) {
        this.INPUT = INPUT;
    }

    public String getOUTPUT() {
        return OUTPUT;
    }

    public void setOUTPUT(String OUTPUT) {
        this.OUTPUT = OUTPUT;
    }

    @Override
    public String toString() {
        return "OutputDTO{" +
                "INPUT='" + INPUT + '\'' +
                ", OUTPUT='" + OUTPUT + '\'' +
                '}';
    }
}
