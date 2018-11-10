package br.com.senai.fatesg.controleponto.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.model.SelectItem;
//import javax.faces.model.SelectItemGroup;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senai.fatesg.controleponto.controle.JornadaTrabalhoControl;
//import antlr.ASdebug.TokenOffsetInfo;
import br.com.senai.fatesg.controleponto.entidade.JornadaTrabalho;

@ManagedBean
public class CheckboxDiasDaSemana {
    private String[] selecioneDiasSemana;
    private List<String> diasSemana;
     
    @PostConstruct
    public void init() {
        diasSemana = new ArrayList<String>();
        diasSemana.add("Segunda");
        diasSemana.add("Terça");
        diasSemana.add("Quarta");
        diasSemana.add("Quinta");
        diasSemana.add("Sexta");
        diasSemana.add("Sabádo");
        diasSemana.add("Domingo");
         
        
    }
 
    public String[] getSelecioneDiasSemana() {
    	//JornadaTrabalho.setDiasDaSemana(selecioneDiasSemana);
    	System.out.println("Esse "+toString());
    	
        return selecioneDiasSemana;
    }
    //@Autowired
	public List<String> naoSeiNome() {
		List<String> list = new ArrayList<>();
    	for (int i = 0; i < this.selecioneDiasSemana.length; i++) {
			if(!selecioneDiasSemana[i].equals(null)) {
				list.add(selecioneDiasSemana[i]);
			}
				
		}
    	return list;
    }
 
    public void setDiasSemana(List<String> diasSemana) {
		this.diasSemana = diasSemana;
	}

	public void setSelecioneDiasSemana(String[] selecioneDiasSemana) {
        this.selecioneDiasSemana = selecioneDiasSemana;
    }
 
    public List<String> getDiasSemana() {
        return diasSemana;
    }

	@Override
	public String toString() {
		return "CheckboxDiasDaSemana [selecioneDiasSemana=" + Arrays.toString(selecioneDiasSemana) + "]";
	}
     
    
}
