/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le {
    static byte[][][] field_e;
    static tf field_d;
    static String field_b;
    static String field_a;
    static String field_c;

    final static String a(boolean param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        bs var14_ref = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        var14 = null;
        var13 = Kickabout.field_G;
        if (!param0) {
          L0: {
            field_a = (String) null;
            if (param1 instanceof bs) {
              var14_ref = (bs) ((Object) param1);
              var2 = var14_ref.field_d + " | ";
              var11 = var2;
              param1 = var14_ref.field_e;
              break L0;
            } else {
              var2 = "";
              break L0;
            }
          }
          var15 = new StringWriter();
          var4 = new PrintWriter((Writer) ((Object) var15));
          param1.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var2 = var5;
          var11 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var7 = var6.readLine();
          var2 = var7;
          var11 = var7;
          L1: while (true) {
            var8 = var6.readLine();
            var2 = var8;
            var11 = var8;
            var2 = var11;
            if (var8 != null) {
              L2: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', var9 - -1);
                if (var9 == -1) {
                  var11 = var8;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var8.substring(0, var9);
                  break L2;
                }
              }
              L3: {
                var16 = var11.trim();
                var2 = var16;
                var2 = var16;
                var17 = var16.substring(1 + var16.lastIndexOf(' '));
                var2 = var17;
                var2 = var17;
                var18 = var17.substring(var17.lastIndexOf('\t') + 1);
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                var2 = var19;
                if (0 == (var9 ^ -1)) {
                  break L3;
                } else {
                  if (-1 != var10) {
                    var12 = var8.indexOf(".java:", var9);
                    if (var12 >= 0) {
                      var2 = var19 + var8.substring(5 + var12, var10);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var2 = var2 + ' ';
                    continue L1;
                  }
                }
              }
              var2 = var2 + ' ';
              continue L1;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var7;
              return var2;
            }
          }
        } else {
          L4: {
            if (param1 instanceof bs) {
              var14_ref = (bs) ((Object) param1);
              var2 = var14_ref.field_d + " | ";
              var11 = var2;
              param1 = var14_ref.field_e;
              break L4;
            } else {
              var2 = "";
              break L4;
            }
          }
          var15 = new StringWriter();
          var4 = new PrintWriter((Writer) ((Object) var15));
          param1.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var2 = var5;
          var11 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var7 = var6.readLine();
          var2 = var7;
          var11 = var7;
          L5: while (true) {
            var8 = var6.readLine();
            var2 = var8;
            var11 = var8;
            var2 = var11;
            if (var8 != null) {
              L6: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', var9 - -1);
                if (var9 == -1) {
                  var11 = var8;
                  var2 = var11;
                  var2 = var11;
                  break L6;
                } else {
                  var11 = var8.substring(0, var9);
                  break L6;
                }
              }
              L7: {
                var16 = var11.trim();
                var2 = var16;
                var2 = var16;
                var17 = var16.substring(1 + var16.lastIndexOf(' '));
                var2 = var17;
                var2 = var17;
                var18 = var17.substring(var17.lastIndexOf('\t') + 1);
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                var2 = var19;
                if (0 == (var9 ^ -1)) {
                  break L7;
                } else {
                  if (-1 != var10) {
                    var12 = var8.indexOf(".java:", var9);
                    if (var12 >= 0) {
                      var2 = var19 + var8.substring(5 + var12, var10);
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    var2 = var2 + ' ';
                    continue L5;
                  }
                }
              }
              var2 = var2 + ' ';
              continue L5;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var7;
              return var2;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          field_e = (byte[][][]) null;
          field_b = null;
          field_d = null;
          field_e = (byte[][][]) null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_e = (byte[][][]) null;
          field_a = null;
          return;
        }
    }

    static {
        field_d = new tf();
        field_b = "Updates will sent to the email address you've given";
        field_c = "kit style";
        field_a = "Add friend";
    }
}
