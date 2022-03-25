package jadetec;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

import java.util.Scanner;

public class SlrJade extends Agent{
    public void setup() {
        addBehaviour(new MyOneShotBehaviour());
        }
    }
    class MyOneShotBehaviour extends OneShotBehaviour {
        @Override
        public void action() {
            int valo;
            System.out.println("-Agente activado-");
            Dataset dat = new Dataset();
            Scanner in=new Scanner(System.in);
            valo =in.nextInt();
            dat.datos(valo);
        }

        @Override
            public int onEnd() {
            System.out.println("\n-Agente muriendo-");
            myAgent.doDelete();
            return super.onEnd();
        }
    }
