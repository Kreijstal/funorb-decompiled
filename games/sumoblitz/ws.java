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
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 116) {
                break L1;
              } else {
                field_b = -70;
                break L1;
              }
            }
            if (param0 == io.field_i) {
              stackIn_25_0 = 5120;
              decompiledRegionSelector0 = 7;
              break L0;
            } else {
              if (param0 != io.field_f) {
                if (io.field_c != param0) {
                  if (param0 != io.field_g) {
                    if (param0 == io.field_k) {
                      stackIn_23_0 = 5123;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      if (param0 != io.field_h) {
                        if (param0 == io.field_e) {
                          stackIn_21_0 = 5131;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (param0 != io.field_d) {
                            throw new IllegalArgumentException("");
                          } else {
                            stackIn_19_0 = 5126;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_15_0 = 5125;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_11_0 = 5121;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = 5124;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_5_0 = 5122;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("ws.B(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L2;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      return stackIn_25_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 52) {
            field_a = (String) null;
            return is.field_b;
        }
        return is.field_b;
    }

    public static void a(byte param0) {
        if (param0 != -71) {
            field_b = -48;
            field_a = null;
            return;
        }
        field_a = null;
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
        su var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        L0: {
          var13 = Sumoblitz.field_L ? 1 : 0;
          if (param1 instanceof su) {
            var14 = (su) ((Object) param1);
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
            if (param0 != 71) {
              return (String) null;
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
              var2 = var19;
              if (0 == (var9 ^ -1)) {
                break L3;
              } else {
                if ((var10 ^ -1) == 0) {
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
            var2 = var2 + ' ';
            continue L1;
          }
        }
    }

    static {
        field_a = "to keep fullscreen or";
    }
}
