
package com.maxxton.printer.lpr;

/**
 * Listen for PrintEvent.
 * This Listener should be attached to a LPRPrinter
 * 
 * @author Hermans.S
 * @copyright Maxxton 2015
 * @see PrintEvent
 * @see PrintJob
 */
public interface PrinterListener
{

  public void printSucceed(PrintEvent event);

  public void printFailed(PrintEvent event, LPRException e);

}