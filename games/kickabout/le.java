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
            L1: {
              field_a = null;
              if (param1 instanceof bs) {
                break L1;
              } else {
                var2 = "";
                if (var13 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var14_ref = (bs) (Object) param1;
            var2 = var14_ref.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            param1 = var14_ref.field_e;
            break L0;
          }
          L2: {
            L3: {
              var15 = new StringWriter();
              var4 = new PrintWriter((Writer) (Object) var15);
              param1.printStackTrace(var4);
              var4.close();
              var5 = var15.toString();
              var11 = var5;
              var2 = var11;
              var11 = var5;
              var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
              var7 = var6.readLine();
              var11 = var7;
              var2 = var11;
              var11 = var7;
              var8 = var6.readLine();
              var11 = var8;
              var2 = var11;
              var11 = var8;
              if (var8 != null) {
                break L3;
              } else {
                if (var13 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 - -1);
              if (var9 == -1) {
                break L4;
              } else {
                var11 = var8.substring(0, var9);
                break L4;
              }
            }
            L5: {
              var11 = var8;
              var2 = var11;
              var2 = var11;
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
              if (0 == (var9 ^ -1)) {
                break L5;
              } else {
                if (-1 != var10) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
            var2 = var2 + 32;
            break L2;
          }
          var2 = var2 + "| " + var7;
          return var2;
        } else {
          L6: {
            L7: {
              if (param1 instanceof bs) {
                break L7;
              } else {
                var2 = "";
                if (var13 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            var14_ref = (bs) (Object) param1;
            var2 = var14_ref.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            param1 = var14_ref.field_e;
            break L6;
          }
          L8: {
            L9: {
              var15 = new StringWriter();
              var4 = new PrintWriter((Writer) (Object) var15);
              param1.printStackTrace(var4);
              var4.close();
              var5 = var15.toString();
              var11 = var5;
              var2 = var11;
              var11 = var5;
              var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
              var7 = var6.readLine();
              var11 = var7;
              var2 = var11;
              var11 = var7;
              var8 = var6.readLine();
              var11 = var8;
              var2 = var11;
              var11 = var8;
              if (var8 != null) {
                break L9;
              } else {
                if (var13 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 - -1);
              if (var9 == -1) {
                break L10;
              } else {
                var11 = var8.substring(0, var9);
                break L10;
              }
            }
            L11: {
              var11 = var8;
              var2 = var11;
              var2 = var11;
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
              if (0 == (var9 ^ -1)) {
                break L11;
              } else {
                if (-1 != var10) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
            }
            var2 = var2 + 32;
            break L8;
          }
          var2 = var2 + "| " + var7;
          return var2;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          field_e = null;
          field_b = null;
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new tf();
        field_b = "Updates will sent to the email address you've given";
        field_c = "kit style";
        field_a = "Add friend";
    }
}
