/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eva extends rqa {
    static gl field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            field_o = (gl) null;
        }
    }

    final static String a(boolean param0, Throwable param1) throws IOException {
        String var2;
        BufferedReader var6;
        String var7;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        hva var14;
        PrintWriter var20;
        StringWriter var21;
        String var22;
        BufferedReader var23;
        String var24;
        String var25;
        String var26;
        String var27;
        String var28;
        String var29;
        PrintWriter var30;
        StringWriter var31;
        String var32;
        BufferedReader var33;
        String var34;
        String var35;
        String var36;
        String var37;
        String var38;
        String var39;
        L0: {
          var13 = VoidHunters.field_G;
          if (param1 instanceof hva) {
            var14 = (hva) ((Object) param1);
            param1 = var14.field_b;
            var2 = var14.field_a + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        if (param0) {
          var21 = new StringWriter();
          var20 = new PrintWriter((Writer) ((Object) var21));
          param1.printStackTrace(var20);
          var20.close();
          var22 = var21.toString();
          var11 = var22;
          var2 = var11;
          var11 = var22;
          var23 = new BufferedReader((Reader) ((Object) new StringReader(var22)));
          var29 = var23.readLine();
          var11 = var29;
          var2 = var11;
          var11 = var29;
          L1: while (true) {
            var24 = var23.readLine();
            var11 = var24;
            var2 = var11;
            var11 = var24;
            if (var24 == null) {
              var2 = var2 + "| " + var29;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L2: {
                var9 = var24.indexOf('(');
                var10 = var24.indexOf(')', 1 + var9);
                if (var9 != -1) {
                  var11 = var24.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var24;
                  break L2;
                }
              }
              L3: {
                var25 = var11.trim();
                var2 = var25;
                var2 = var25;
                var26 = var25.substring(var25.lastIndexOf(' ') - -1);
                var2 = var26;
                var2 = var26;
                var27 = var26.substring(var26.lastIndexOf('\t') - -1);
                var2 = var27;
                var2 = var27;
                var28 = var2 + var27;
                var2 = var28;
                var2 = var28;
                var2 = var28;
                if ((var9 ^ -1) == 0) {
                  break L3;
                } else {
                  if ((var10 ^ -1) == 0) {
                    break L3;
                  } else {
                    var12 = var24.indexOf(".java:", var9);
                    if (var12 < 0) {
                      break L3;
                    } else {
                      var2 = var28 + var24.substring(var12 - -5, var10);
                      break L3;
                    }
                  }
                }
              }
              var2 = var2 + ' ';
              continue L1;
            }
          }
        } else {
          field_o = (gl) null;
          var31 = new StringWriter();
          var30 = new PrintWriter((Writer) ((Object) var31));
          param1.printStackTrace(var30);
          var30.close();
          var32 = var31.toString();
          var11 = var32;
          var2 = var11;
          var11 = var32;
          var33 = new BufferedReader((Reader) ((Object) new StringReader(var32)));
          var6 = var33;
          var39 = var33.readLine();
          var11 = var39;
          var2 = var11;
          var11 = var39;
          var7 = var39;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L4: while (true) {
            var34 = var33.readLine();
            var11 = var34;
            var2 = var11;
            var11 = var34;
            if (var34 == null) {
              var2 = var2 + "| " + var39;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L5: {
                var9 = var34.indexOf('(');
                var10 = var34.indexOf(')', 1 + var9);
                if (var9 != -1) {
                  var11 = var34.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var34;
                  break L5;
                }
              }
              L6: {
                var35 = var11.trim();
                var2 = var35;
                var2 = var35;
                var36 = var35.substring(var35.lastIndexOf(' ') - -1);
                var2 = var36;
                var2 = var36;
                var37 = var36.substring(var36.lastIndexOf('\t') - -1);
                var2 = var37;
                var2 = var37;
                var38 = var2 + var37;
                var2 = var38;
                var2 = var38;
                var2 = var38;
                if ((var9 ^ -1) == 0) {
                  break L6;
                } else {
                  if ((var10 ^ -1) == 0) {
                    break L6;
                  } else {
                    var12 = var34.indexOf(".java:", var9);
                    if (var12 < 0) {
                      break L6;
                    } else {
                      var2 = var38 + var34.substring(var12 - -5, var10);
                      break L6;
                    }
                  }
                }
              }
              var2 = var2 + ' ';
              continue L4;
            }
          }
        }
    }

    eva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                eva.a(-113);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(146, 124));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("eva.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(br param0, int param1, int param2) {
        faa var3 = null;
        try {
            var3 = dpa.field_p;
            int var4 = -115 / ((param1 - 64) / 46);
            var3.h(24335, param2);
            var3.c(0, 2);
            var3.c(0, 0);
            var3.c(0, param0.field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "eva.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_o = new gl(5);
    }
}
