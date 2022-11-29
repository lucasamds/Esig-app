package br.com.esig;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.*;

public class Main {
    private static EntityManagerFactory entityManagerFactory;
    /*
    entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.esig.app");
    EntityManager entidade = entityManagerFactory.createEntityManager();

    public void remover(int indice){
        Tarefa tarefas = null;
        try
        {
            tarefas = entidade.find(Tarefa.class, 1L);

            entidade.getTransaction().begin();
            entidade.remove(tarefas);
            entidade.getTransaction().commit();
        }
        catch(Exception e)
        {
            entidade.getTransaction().rollback();
        }
        finally {
            entidade.close();
        }
    }

    public void editar()
    {

    }
*/
    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.esig.app");


        EntityManager entidade = entityManagerFactory.createEntityManager();
/*
        //****Removendo elemento
        Tarefa tarefas = null;
        try
        {
            tarefas = entidade.find(Tarefa.class, 1L);

            entidade.getTransaction().begin();
            entidade.remove(tarefas);
            entidade.getTransaction().commit();
        }
        catch(Exception e)
        {
            entidade.getTransaction().rollback();
        }
        finally {
            entidade.close();
        }
*/
/*
        //****Editar elemento
        Tarefa tarefas = null;
        try
        {
            tarefas = entidade.find(Tarefa.class, 2L);
            tarefas.setTitulo("Mudei o titulo");
            tarefas.setDescricao("Mudei aqui tbm");

            entidade.getTransaction().begin();
            entidade.merge(tarefas);
            entidade.getTransaction().commit();
        }
        catch(Exception e)
        {
            entidade.getTransaction().rollback();
        }
        finally {
            entidade.close();
        }*/

/*
        //****Selecionar elemento pelo indice

        Tarefa tarefa = null;
        try
        {
            tarefa = entidade.find(Tarefa.class, 2L);
            System.out.println(tarefa);
        }
        catch(Exception e)
        {
            System.out.println("LIST ALL" + e.getMessage());
        }
        finally {
            entidade.close();
        }*/
/*
        //****Selecionar elementos pelo título

        List<Tarefa> tarefas = null;
        String s = "%app%";
        try
        {
            tarefas = entidade.createQuery("from Tarefa t where t.titulo LIKE 'Ter%'").getResultList();
        }
        catch(Exception e)
        {
            System.out.println("LIST ALL" + e.getMessage());
        }
        finally {
            entidade.close();
        }
        if(tarefas != null)
        {
            tarefas.forEach(System.out::println);
        }

*/

        //****Selecionar todos os elementos

        List<Tarefa> tarefas = null;
        try
        {
            tarefas = entidade.createQuery("from Tarefa").getResultList();
        }
        catch(Exception e)
        {
            System.out.println("LIST ALL" + e.getMessage());
        }
        finally {
            entidade.close();
        }
        if(tarefas != null)
        {
            tarefas.forEach(System.out::println);
        }

        //****Selecionar elementos que contenham um texto indicado
/*
        List<Tarefa> tarefas = null;
        String s = "Mudei%";
        try
        {
            tarefas = entidade.createQuery("from Tarefa t where t.titulo = :texto").setParameter("texto",s).getResultList();
        }
        catch(Exception e)
        {
            System.out.println("LIST ALL" + e.getMessage());
        }
        finally {
            entidade.close();
        }
        if(tarefas != null)
        {
            tarefas.forEach(System.out::println);
        }
*/
 /*

/*
        //*****Adicionar elemento
        Tarefa tarefa1 = new Tarefa();
        tarefa1.setTitulo("Primeiro lembrete");
        tarefa1.setDescricao("Enviar o app");
        tarefa1.setPrioridade(Prioridade.ALTA);
        tarefa1.setResponsavel("Lucas");
        Date aux = new Date();
        java.sql.Date dataSQL = new java.sql.Date(aux.getTime());
        tarefa1.setDeadline(dataSQL);

        //Tentando iniciar uma nova transação e persistir um valor
        try{
            entidade.getTransaction().begin();
            entidade.persist(tarefa1);
            entidade.getTransaction().commit();
        }
        catch (Exception e)
        {
            entidade.getTransaction().rollback();
            System.out.println("INSERT: " + e.getMessage());
        }
        finally {
            entidade.close();
        }*/
    }
}
