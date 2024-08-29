package com.evoltech.abogados.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class QueryDTO {
    private String pregunta;
    private String respuesta;
    private Date fecha;

    Logger logger = LoggerFactory.getLogger(QueryDTO.class.getName());

    public QueryDTO(){
        logger.info("Iniciando el DTO");
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta(){
        return  respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }
}
