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
        if (param0 >= -81) {
          field_g = (uf) null;
          field_g = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                if (param0 == -51764539) {
                  stackIn_8_0 = var3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = 51;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var3 = lf.a(param1.charAt(var4), (byte) 85) + ((var3 << -51764539) - var3);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("ae.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    private ae() throws Throwable {
        throw new Error();
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Bounce.field_N;
        try {
          L0: {
            if (0 == param5) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param5 = param5 + param2;
              var7_int = param4;
              var8 = param1;
              L1: while (true) {
                L2: {
                  var9 = param3[var8];
                  if (-1 >= (var9 ^ -1)) {
                    var7_int++;
                    break L2;
                  } else {
                    var7_int = this.field_e[var7_int];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    dupTemp$0 = this.field_e[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L4;
                    } else {
                      incrementValue$1 = param2;
                      param2++;
                      param0[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param5 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (-1 != (var9 & 64 ^ -1)) {
                      var7_int = this.field_e[var7_int];
                      break L5;
                    } else {
                      var7_int++;
                      break L5;
                    }
                  }
                  L6: {
                    dupTemp$2 = this.field_e[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 < 0) {
                      incrementValue$3 = param2;
                      param2++;
                      param0[incrementValue$3] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_e[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    dupTemp$4 = this.field_e[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L8;
                    } else {
                      incrementValue$5 = param2;
                      param2++;
                      param0[incrementValue$5] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_e[var7_int];
                      break L9;
                    }
                  }
                  L10: {
                    dupTemp$6 = this.field_e[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 >= 0) {
                      break L10;
                    } else {
                      incrementValue$7 = param2;
                      param2++;
                      param0[incrementValue$7] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_e[var7_int];
                      break L11;
                    } else {
                      var7_int++;
                      break L11;
                    }
                  }
                  L12: {
                    dupTemp$8 = this.field_e[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param2;
                      param2++;
                      param0[incrementValue$9] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_e[var7_int];
                      break L13;
                    }
                  }
                  L14: {
                    dupTemp$10 = this.field_e[var7_int];
                    var10 = dupTemp$10;
                    if (-1 >= (dupTemp$10 ^ -1)) {
                      break L14;
                    } else {
                      incrementValue$11 = param2;
                      param2++;
                      param0[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param2 >= param5) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (-1 == (2 & var9 ^ -1)) {
                      var7_int++;
                      break L15;
                    } else {
                      var7_int = this.field_e[var7_int];
                      break L15;
                    }
                  }
                  L16: {
                    dupTemp$12 = this.field_e[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 < 0) {
                      incrementValue$13 = param2;
                      param2++;
                      param0[incrementValue$13] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_e[var7_int];
                      break L17;
                    }
                  }
                  dupTemp$14 = this.field_e[var7_int];
                  var10 = dupTemp$14;
                  if (dupTemp$14 < 0) {
                    incrementValue$15 = param2;
                    param2++;
                    param0[incrementValue$15] = (byte)(var10 ^ -1);
                    if (param2 >= param5) {
                      break L3;
                    } else {
                      var7_int = 0;
                      var8++;
                      continue L1;
                    }
                  } else {
                    var8++;
                    continue L1;
                  }
                }
                stackIn_63_0 = -param1 + var8 - -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var7);

            stackIn_66_1 = new StringBuilder().append("ae.B(");

            if (param0 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L18;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L19;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L19;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_67_0), stackIn_70_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_63_0;
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
        ga var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        L0: {
          var13 = Bounce.field_N;
          if (!(param1 instanceof ga)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (ga) ((Object) param1);
            var2 = var14.field_a + " | ";
            param1 = var14.field_e;
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        if (param0 > -68) {
          return (String) null;
        } else {
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
                var10 = var8.indexOf(')', var9 - -1);
                if (0 == (var9 ^ -1)) {
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
                if (-1 == var9) {
                  break L3;
                } else {
                  if (var10 == -1) {
                    break L3;
                  } else {
                    var12 = var8.indexOf(".java:", var9);
                    if ((var12 ^ -1) <= -1) {
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
    }

    static {
        field_f = 0;
        field_b = true;
        field_g = new uf();
        field_d = "Password: ";
    }
}
