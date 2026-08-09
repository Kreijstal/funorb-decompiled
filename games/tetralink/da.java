/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class da {
    static String field_h;
    static String field_i;
    static int[] field_d;
    static String field_a;
    static int[] field_g;
    static int field_e;
    static String field_c;
    static int[][] field_b;
    static hl field_f;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 > -8) {
          return;
        } else {
          field_g = null;
          field_i = null;
          field_b = (int[][]) null;
          field_h = null;
          field_d = null;
          return;
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        Object var14;
        cn var14_ref;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        var14 = null;
        var13 = TetraLink.field_J;
        if (param0 != 118) {
          L0: {
            field_h = (String) null;
            if (param1 instanceof cn) {
              var14_ref = (cn) ((Object) param1);
              param1 = var14_ref.field_a;
              var2 = var14_ref.field_d + " | ";
              var11 = var2;
              var2 = var11;
              var11 = var2;
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
          var11 = var5;
          var2 = var11;
          var11 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
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
              return var2;
            } else {
              L2: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (-1 != var9) {
                  var11 = var8.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var8;
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
                var18 = var17.substring(1 + var17.lastIndexOf('\t'));
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                var2 = var19;
                if (-1 == var9) {
                  break L3;
                } else {
                  if (0 == (var10 ^ -1)) {
                    break L3;
                  } else {
                    var12 = var8.indexOf(".java:", var9);
                    if (0 <= var12) {
                      var2 = var19 + var8.substring(5 + var12, var10);
                      break L3;
                    } else {
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
          L4: {
            if (param1 instanceof cn) {
              var14_ref = (cn) ((Object) param1);
              param1 = var14_ref.field_a;
              var2 = var14_ref.field_d + " | ";
              var11 = var2;
              var2 = var11;
              var11 = var2;
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
          var11 = var5;
          var2 = var11;
          var11 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var7 = var6.readLine();
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L5: while (true) {
            var8 = var6.readLine();
            var11 = var8;
            var2 = var11;
            var11 = var8;
            if (var8 == null) {
              var2 = var2 + "| " + var7;
              return var2;
            } else {
              L6: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (-1 != var9) {
                  var11 = var8.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L6;
                } else {
                  var11 = var8;
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
                var18 = var17.substring(1 + var17.lastIndexOf('\t'));
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                var2 = var19;
                if (-1 == var9) {
                  break L7;
                } else {
                  if (0 == (var10 ^ -1)) {
                    break L7;
                  } else {
                    var12 = var8.indexOf(".java:", var9);
                    if (0 <= var12) {
                      var2 = var19 + var8.substring(5 + var12, var10);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              var2 = var2 + ' ';
              continue L5;
            }
          }
        }
    }

    final static boolean a(ah param0, ah param1, int param2, ah param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.c(100)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.a("commonui", (byte) -124)) {
                L1: {
                  var4_int = 51 / ((param2 - 43) / 40);
                  if (!param1.c(113)) {
                    break L1;
                  } else {
                    if (param1.a("commonui", (byte) -122)) {
                      L2: {
                        if (!param3.c(102)) {
                          break L2;
                        } else {
                          if (param3.a("button.gif", (byte) -102)) {
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("da.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final static void a(int param0, int param1, ve param2, int param3, int param4, ve param5) {
        try {
            if (param3 >= -100) {
                da.a(64);
            }
            aa.field_Wb = param5;
            cd.field_e = param0;
            ao.field_a = param1;
            bn.field_b = param2;
            hc.field_q = param4;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "da.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              me.a((java.awt.Component) ((Object) param1), 250);
              sd.a((java.awt.Component) ((Object) param1), 33);
              if (null == qf.field_k) {
                break L1;
              } else {
                qf.field_k.b(-115, (java.awt.Component) ((Object) param1));
                break L1;
              }
            }
            if (param0 < -55) {
              break L0;
            } else {
              field_i = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("da.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_d = new int[8192];
        field_h = "Report abuse";
        field_c = "Your ignore list is full. Max of 100 hit.";
        field_a = "Please try changing the following settings:  ";
    }
}
