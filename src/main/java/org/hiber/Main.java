package org.hiber;

import org.hiber.util.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
        HibernateUtil.shutDown();
    }
}