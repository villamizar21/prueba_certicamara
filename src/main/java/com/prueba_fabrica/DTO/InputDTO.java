package com.prueba_fabrica.DTO;

public class InputDTO {

    private String INPUT;

    public InputDTO(String INPUT) {
        this.INPUT = INPUT;
    }

    public InputDTO() {
    }

    public String getINPUT() {
        return INPUT;
    }

    public void setINPUT(String INPUT) {
        this.INPUT = INPUT;
    }

    @Override
    public String toString() {
        return "InputDTO{" +
                "INPUT='" + INPUT + '\'' +
                '}';
    }
}
