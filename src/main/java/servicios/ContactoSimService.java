package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ContactoSimService implements InterfazContactoSim {
    private List<Entidad> entidades;
    private List<DatosSolicitud> solicitudes;

    public ContactoSimService() {
        entidades = new ArrayList<>();
        solicitudes = new ArrayList<>();

        String[] nombres = {"Nombre 1", "Nombre 2", "Nombre 3", "Nombre 4", "Nombre 5"};
        String[] descripciones = {"Descripcion 1", "Descripcion 2", "Descripcion 3", "Descripcion 4", "Descripcion 5"};

        for (int i = 0; i < 5; i++) {
            Entidad e = new Entidad();
            e.setId(i);
            e.setName(nombres[i]);
            e.setDescripcion(descripciones[i]);
            entidades.add(e);
        }
    }

    @Override
    public int solicitarSimulation(DatosSolicitud sol){
        this.solicitudes.add(sol);
        return new Random().nextInt(10000);
    }

    @Override
    public DatosSimulation descargarDatos(int ticket){
        return new DatosSimulation();
    }
    @Override
    public List<Entidad> getEntities(){
        return entidades;
    }
    @Override
    public boolean isValidEntityId(){
        return true;
    }
}
