/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static int field_b;
    static boolean field_a;
    static String field_d;
    private int[] field_c;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            dj.a();
            ml.field_d = 11;
            w.field_R = new int[260];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= w.field_R.length) {
                    break L0;
                  } else {
                    w.field_R[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                w.field_R[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ul.C(" + 8 + ')');
        }
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_66_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param5 == 256) {
              if (param2 != 0) {
                var7_int = 0;
                param2 = param2 + param1;
                var8 = param0;
                L1: while (true) {
                  L2: {
                    var9 = param3[var8];
                    if (0 <= var9) {
                      var7_int++;
                      break L2;
                    } else {
                      var7_int = ((ul) this).field_c[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = ((ul) this).field_c[var7_int];
                      if (((ul) this).field_c[var7_int] < 0) {
                        int incrementValue$8 = param1;
                        param1++;
                        param4[incrementValue$8] = (byte)(~var10);
                        if (param2 > param1) {
                          var7_int = 0;
                          break L4;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (0 == (var9 & 64)) {
                        var7_int++;
                        break L5;
                      } else {
                        var7_int = ((ul) this).field_c[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      var10 = ((ul) this).field_c[var7_int];
                      if (((ul) this).field_c[var7_int] >= 0) {
                        break L6;
                      } else {
                        int incrementValue$9 = param1;
                        param1++;
                        param4[incrementValue$9] = (byte)(~var10);
                        if (param2 <= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if ((32 & var9) == 0) {
                        var7_int++;
                        break L7;
                      } else {
                        var7_int = ((ul) this).field_c[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      var10 = ((ul) this).field_c[var7_int];
                      if (((ul) this).field_c[var7_int] < 0) {
                        int incrementValue$10 = param1;
                        param1++;
                        param4[incrementValue$10] = (byte)(~var10);
                        if (param1 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if ((var9 & 16) == 0) {
                        var7_int++;
                        break L9;
                      } else {
                        var7_int = ((ul) this).field_c[var7_int];
                        break L9;
                      }
                    }
                    L10: {
                      var10 = ((ul) this).field_c[var7_int];
                      if (((ul) this).field_c[var7_int] < 0) {
                        int incrementValue$11 = param1;
                        param1++;
                        param4[incrementValue$11] = (byte)(~var10);
                        if (param1 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((8 & var9) == 0) {
                        var7_int++;
                        break L11;
                      } else {
                        var7_int = ((ul) this).field_c[var7_int];
                        break L11;
                      }
                    }
                    L12: {
                      var10 = ((ul) this).field_c[var7_int];
                      if (((ul) this).field_c[var7_int] < 0) {
                        int incrementValue$12 = param1;
                        param1++;
                        param4[incrementValue$12] = (byte)(~var10);
                        if (param1 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if ((var9 & 4) == 0) {
                        var7_int++;
                        break L13;
                      } else {
                        var7_int = ((ul) this).field_c[var7_int];
                        break L13;
                      }
                    }
                    L14: {
                      var10 = ((ul) this).field_c[var7_int];
                      if (((ul) this).field_c[var7_int] < 0) {
                        int incrementValue$13 = param1;
                        param1++;
                        param4[incrementValue$13] = (byte)(~var10);
                        if (param1 < param2) {
                          var7_int = 0;
                          break L14;
                        } else {
                          return var8 - -1 - param0;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if ((var9 & 2) != 0) {
                        var7_int = ((ul) this).field_c[var7_int];
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    }
                    L16: {
                      var10 = ((ul) this).field_c[var7_int];
                      if (0 > ((ul) this).field_c[var7_int]) {
                        int incrementValue$14 = param1;
                        param1++;
                        param4[incrementValue$14] = (byte)(~var10);
                        if (param2 <= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (0 != (1 & var9)) {
                        var7_int = ((ul) this).field_c[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    L18: {
                      var10 = ((ul) this).field_c[var7_int];
                      if (((ul) this).field_c[var7_int] < 0) {
                        int incrementValue$15 = param1;
                        param1++;
                        param4[incrementValue$15] = (byte)(~var10);
                        if (param1 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_66_0 = var8 - -1 - param0;
                  stackIn_67_0 = stackOut_66_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = 94;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var7;
            stackOut_68_1 = new StringBuilder().append("ul.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param3 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L19;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L19;
            }
          }
          L20: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L20;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L20;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param5 + ')');
        }
        return stackIn_67_0;
    }

    public static void a(byte param0) {
        field_d = null;
    }

    private ul() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for graphics";
    }
}
