package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.AssociativeArray;

import java.io.PrintWriter;

/**
 * Experiments with Associative Arrays.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class AAExperiments {

  // +---------+-----------------------------------------------------
  // | Globals |
  // +---------+

  /**
   * Log and conduct a call to `set`.
   *
   * @param pen
   *   Where to log the message.
   * @param aa
   *   The associative array we're using.
   * @param key
   *   The key to set.
   * @param val
   *   The value to set.
   */
  public static void set(PrintWriter pen, AssociativeArray<String, String> aa,
      String key, String val) {
    pen.printf("set(\"%s\", \"%s\") -> ", key, val);
    try {
      aa.set(key, val);
      pen.println("OK");
    } catch (Exception e) {
      pen.println("FAILED because " + e.toString());
    } // try/catch
  } // set(PrintWriter, AssociativeArray<String, String>, String, String)
  /**
   * Log and conduct a call to `set`.
   *
   * @param pen
   *   Where to log the message.
   * @param aa
   *   The associative array we're using.
   * @param key
   *   The key to set.
   * @param val
   *   The value to set.
   */
  public static void set2(PrintWriter pen, AssociativeArray<Integer, Integer> aa,
      Integer key, Integer val) {
    pen.printf("set(\"%s\", \"%s\") -> ", key, val);
    try {
      aa.set(key, val);
      pen.println("OK");
    } catch (Exception e) {
      pen.println("FAILED because " + e.toString());
    } // try/catch
  } // set(PrintWriter, AssociativeArray<String, String>, String, String)

  /**
   * Log and conduct a call to `get`.
   *
   * @param pen
   *   Where to log the message.
   * @param aa
   *   The associative array.
   * @param key
   *   The key.
   */
  public static void get(PrintWriter pen, AssociativeArray<String, String> aa,
      String key) {
    pen.printf("get(\"%s\") -> ", key);
    try {
      pen.println(aa.get(key));
    } catch (Exception e) {
      pen.println("[FAILED because " + e.toString() + "]");
    } // try/catch
  } // get(PrintWriter, AssociativeArray<String, String>, STring)

  /**
   * Log and conduct a call to `hasKey`.
   *
   * @param pen
   *   Where to log the message.
   * @param aa
   *   The associative array.
   * @param key
   *   The key.
   */
  public static void hasKey(PrintWriter pen,
      AssociativeArray<String, String> aa, String key) {
    pen.printf("hasKey(\"%s\") -> ", key);
    try {
      pen.println(aa.hasKey(key));
    } catch (Exception e) {
      pen.println("[FAILED because " + e.toString() + "]");
    } // try/catch
  } // hasKey(PrintWriter, AssociativeArray<String, String>, STring)

  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Run our expereiments.
   *
   * @param args
   *   Command-line parameters. (Ignored.)
   *
   * @throws Exception
   *   When something goes wrong. Usually an I/O issue or an unexpected
   *   Associative Array hiccup.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    AssociativeArray strings2strings = new AssociativeArray<String, String>();

    // The empty array should not have any key. We'll try one.
    hasKey(pen, strings2strings, "k");

    // However, after setting that key, we should be able to get it.
    set(pen, strings2strings, "k", "key");
    hasKey(pen, strings2strings, "k");
    get(pen, strings2strings, "k");

    // What happens if we try a different key?
    hasKey(pen, strings2strings, "q");
    get(pen, strings2strings, "q");

    // What happens if we try the null key?
    set(pen, strings2strings, null, "nothing");
    hasKey(pen, strings2strings, null);
    get(pen, strings2strings, null);
    AssociativeArray<Integer, Integer> arr = new AssociativeArray<Integer, Integer>();
    set2(pen, arr, 1, 5);
    set2(pen, arr, 2, 5);
    set2(pen, arr, 3, 5);
    set2(pen, arr, 4, 5);
    set2(pen, arr, 5, 5);
    set2(pen, arr, 6, 5);
    set2(pen, arr, 7, 5);
    set2(pen, arr, 8, 5);
    set2(pen, arr, 9, 5);
    set2(pen, arr, 10, 5);
    set2(pen, arr, 11, 5);
    set2(pen, arr, 12, 5);
    set2(pen, arr, 13, 5);
    set2(pen, arr, 14, 5);
    set2(pen, arr, 15, 5);
    set2(pen, arr, 16, 5);
    set2(pen, arr, 17, 5);
    set2(pen, arr, 18, 5);
    System.out.printf(arr.toString());
    AssociativeArray<Integer, Integer> newArr = arr.clone();
    System.out.printf("\n");
    System.out.printf(newArr.toString());
    // And we're done.
    pen.close();
  } // main(String[])
} // class AAExperiments
