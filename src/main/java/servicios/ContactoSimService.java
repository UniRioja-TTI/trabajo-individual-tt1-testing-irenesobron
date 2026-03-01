package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactoSimService implements InterfazContactoSim {
    private List<Entidad> contactos;
    private List<DatosSolicitud> solicitudes;

    public ContactoSimService() {
        contactos = new ArrayList<>();
        solicitudes = new ArrayList<>();
    }

    @Override
    public int solicitarSimulation(DatosSolicitud sol){
        return 0;
    }
    @Override
    public DatosSimulation descargarDatos(int ticket){
        return null;
    }
    @Override
    public List<Entidad> getEntities(){
        return null;
    }
    @Override
    public boolean isValidEntityId(){
        return false;
    }
}
