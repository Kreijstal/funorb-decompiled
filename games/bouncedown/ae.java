/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae {
    static int[] field_c;
    static volatile boolean field_b;
    static int field_f;
    private int[] field_e;
    static uf field_g;
    static wi field_a;
    static String field_d;

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                if (param0 == -51764539) {
                  stackOut_7_0 = var3;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_5_0 = 51;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                var3 = lf.a(param1.charAt(var4), (byte) 85) + ((var3 << 5) - var3);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ae.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    private ae() throws Throwable {
        throw new Error();
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var11 = Bounce.field_N;
        try {
          L0: {
            if (0 == param5) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param5 = param5 + param2;
              var7_int = param4;
              var8 = param1;
              L1: while (true) {
                L2: {
                  var9 = param3[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L2;
                  } else {
                    var7_int = ((ae) this).field_e[var7_int];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var10 = ((ae) this).field_e[var7_int];
                    if (((ae) this).field_e[var7_int] >= 0) {
                      break L4;
                    } else {
                      int incrementValue$7 = param2;
                      param2++;
                      param0[incrementValue$7] = (byte)var10;
                      if (param5 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (-1 != (var9 & 64)) {
                      var7_int = ((ae) this).field_e[var7_int];
                      break L5;
                    } else {
                      var7_int++;
                      break L5;
                    }
                  }
                  L6: {
                    var10 = ((ae) this).field_e[var7_int];
                    if (((ae) this).field_e[var7_int] < 0) {
                      int incrementValue$8 = param2;
                      param2++;
                      param0[incrementValue$8] = (byte)(~var10);
                      if (param5 > param2) {
                        var7_int = 0;
                        break L6;
                      } else {
                        break L3;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((var9 & 32) != 0) {
                      var7_int = ((ae) this).field_e[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    var10 = ((ae) this).field_e[var7_int];
                    if (((ae) this).field_e[var7_int] >= 0) {
                      break L8;
                    } else {
                      int incrementValue$9 = param2;
                      param2++;
                      param0[incrementValue$9] = (byte)(~var10);
                      if (param2 < param5) {
                        var7_int = 0;
                        break L8;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L9: {
                    if ((var9 & 16) == 0) {
                      var7_int++;
                      break L9;
                    } else {
                      var7_int = ((ae) this).field_e[var7_int];
                      break L9;
                    }
                  }
                  L10: {
                    var10 = ((ae) this).field_e[var7_int];
                    if (((ae) this).field_e[var7_int] >= 0) {
                      break L10;
                    } else {
                      int incrementValue$10 = param2;
                      param2++;
                      param0[incrementValue$10] = (byte)(~var10);
                      if (param5 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if ((8 & var9) != 0) {
                      var7_int = ((ae) this).field_e[var7_int];
                      break L11;
                    } else {
                      var7_int++;
                      break L11;
                    }
                  }
                  L12: {
                    var10 = ((ae) this).field_e[var7_int];
                    if (((ae) this).field_e[var7_int] < 0) {
                      int incrementValue$11 = param2;
                      param2++;
                      param0[incrementValue$11] = (byte)(~var10);
                      if (param2 < param5) {
                        var7_int = 0;
                        break L12;
                      } else {
                        break L3;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (0 == (4 & var9)) {
                      var7_int++;
                      break L13;
                    } else {
                      var7_int = ((ae) this).field_e[var7_int];
                      break L13;
                    }
                  }
                  L14: {
                    var10 = ((ae) this).field_e[var7_int];
                    if (((ae) this).field_e[var7_int] >= 0) {
                      break L14;
                    } else {
                      int incrementValue$12 = param2;
                      param2++;
                      param0[incrementValue$12] = (byte)var10;
                      if (param2 >= param5) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (-1 == (2 & var9)) {
                      var7_int++;
                      break L15;
                    } else {
                      var7_int = ((ae) this).field_e[var7_int];
                      break L15;
                    }
                  }
                  L16: {
                    var10 = ((ae) this).field_e[var7_int];
                    if (((ae) this).field_e[var7_int] < 0) {
                      int incrementValue$13 = param2;
                      param2++;
                      param0[incrementValue$13] = (byte)(~var10);
                      if (param5 > param2) {
                        var7_int = 0;
                        break L16;
                      } else {
                        return -param1 + var8 - -1;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((var9 & 1) == 0) {
                      var7_int++;
                      break L17;
                    } else {
                      var7_int = ((ae) this).field_e[var7_int];
                      break L17;
                    }
                  }
                  L18: {
                    var10 = ((ae) this).field_e[var7_int];
                    if (((ae) this).field_e[var7_int] >= 0) {
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackOut_61_0 = -param1 + var8 - -1;
                stackIn_62_0 = stackOut_61_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var7;
            stackOut_63_1 = new StringBuilder().append("ae.B(");
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L19;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L19;
            }
          }
          L20: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param3 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L20;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L20;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_62_0;
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
        ga var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Bounce.field_N;
          if (!(param1 instanceof ga)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (ga) (Object) param1;
            var2 = var14.field_a + " | ";
            param1 = var14.field_e;
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
            return var2;
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
              if (-1 == var9) {
                break L3;
              } else {
                if (var10 == -1) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_b = true;
        field_g = new uf();
        field_d = "Password: ";
    }
}
