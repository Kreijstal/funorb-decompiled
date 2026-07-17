/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eva extends rqa {
    static gl field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            field_o = null;
        }
    }

    final static String a(boolean param0, Throwable param1) throws IOException {
        String var2 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        hva var14 = null;
        PrintWriter var20 = null;
        StringWriter var21 = null;
        String var22 = null;
        BufferedReader var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        PrintWriter var30 = null;
        StringWriter var31 = null;
        String var32 = null;
        BufferedReader var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var46 = null;
        L0: {
          var13 = VoidHunters.field_G;
          if (param1 instanceof hva) {
            var14 = (hva) (Object) param1;
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
          var20 = new PrintWriter((Writer) (Object) var21);
          param1.printStackTrace(var20);
          var20.close();
          var22 = var21.toString();
          var11 = var22;
          var2 = var11;
          var11 = var22;
          var23 = new BufferedReader((Reader) (Object) new StringReader(var22));
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
                if (var9 == -1) {
                  break L3;
                } else {
                  if (var10 == -1) {
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
              var2 = var2 + 32;
              continue L1;
            }
          }
        } else {
          field_o = null;
          var31 = new StringWriter();
          var30 = new PrintWriter((Writer) (Object) var31);
          param1.printStackTrace(var30);
          var30.close();
          var32 = var31.toString();
          var11 = var32;
          var2 = var11;
          var11 = var32;
          var33 = new BufferedReader((Reader) (Object) new StringReader(var32));
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
              var46 = var11;
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
                if (var9 == -1) {
                  break L6;
                } else {
                  if (var10 == -1) {
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
              var2 = var2 + 32;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = new nc((Object) (Object) frb.a(146, 124));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("eva.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
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
            throw rta.a((Throwable) (Object) runtimeException, "eva.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new gl(5);
    }
}
