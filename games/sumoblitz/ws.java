/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ws {
    static int field_b;
    static String field_a;

    final static int a(io param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (param1 > 116) {
              break L0;
            } else {
              field_b = -70;
              break L0;
            }
          }
          if (param0 == io.field_i) {
            stackOut_24_0 = 5120;
            stackIn_25_0 = stackOut_24_0;
            return stackIn_25_0;
          } else {
            if (param0 != io.field_f) {
              if (io.field_c != param0) {
                if (param0 != io.field_g) {
                  if (param0 == io.field_k) {
                    stackOut_22_0 = 5123;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0;
                  } else {
                    if (param0 != io.field_h) {
                      if (param0 == io.field_e) {
                        stackOut_20_0 = 5131;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        if (param0 != io.field_d) {
                          throw new IllegalArgumentException("");
                        } else {
                          stackOut_18_0 = 5126;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      }
                    } else {
                      stackOut_14_0 = 5125;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  }
                } else {
                  stackOut_10_0 = 5121;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = 5124;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = 5122;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("ws.B(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L1;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 41);
        }
    }

    final static boolean b(byte param0) {
        return is.field_b;
    }

    public static void a(byte param0) {
        field_a = null;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
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
        su var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Sumoblitz.field_L ? 1 : 0;
          if (param1 instanceof su) {
            var14 = (su) (Object) param1;
            var2 = var14.field_a + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            param1 = var14.field_b;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
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
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 == null) {
            var2 = var2 + "| " + var7;
            if (param0 != 71) {
              return null;
            } else {
              return var2;
            }
          } else {
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
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 == -1) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (0 <= var12) {
                    var2 = var19 + var8.substring(var12 + 5, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "to keep fullscreen or";
    }
}
