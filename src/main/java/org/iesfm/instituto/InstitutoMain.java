package org.iesfm.instituto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

public class InstitutoMain {

    private final static Logger log = LoggerFactory.getLogger(InstitutoMain.class);

    public static void main(String[] args) {
        try {

            ObjectMapper mapper = new ObjectMapper();
            Instituto instituto = mapper.readValue(
                    new File(Instituto.class.getResource("/federica.json").toURI()
                    ), Instituto.class);
            log.info(instituto.toString());
            log.info(instituto.getGrupos().get(0).getAlumnos().get(0).toString());

            mapper.writeValue(
                    new FileOutputStream(new File("federica2.json")),
                    instituto
            );
        } catch (URISyntaxException e) {
            log.error("", e);
        } catch (JsonProcessingException e) {
            log.error("El json no está bien formado", e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
