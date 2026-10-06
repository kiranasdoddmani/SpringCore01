package ISA;
/*

 Here We-Faces Some-Problem i.e We Don't Want to Get-Our Personal Information But Extends KeyWord Which Require
  all-Methods Which are Present in Notification
    Example :- Hello() method in Notification, Notification has Their Personal Information i.e Hello Method
      they don't to Share but unfortunatly it overides to it causes an Inheritance-illusion

   Bcz of Inheritance-illusion We use Principal's
    1. IS-A RelationShip  [Inheritance]
    2. HAS-A RelationShip [Composition]

   This is tightly-Coupled menas One-Class is Totaly Depend on Anthor-Class

     Hence, We Use Spring-Core ,is LooslyCoupled
     SpringCore Which helps to Create an IOC and DependencyInjection,Which helps to Manage the Creating the Objects

 */
public class Main{
    public static void main(String[] args) {
        WhatsAppNotification WhatsApp=new WhatsAppNotification();
        WhatsApp.Send();
        WhatsApp.Hello();
        EmailNotification email=new EmailNotification();
        email.Send();
    }
}