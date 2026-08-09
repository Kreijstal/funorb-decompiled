/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rt extends oj {
    static String field_B;
    private int field_y;
    static int field_D;
    private int field_C;
    static long field_z;

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -84) {
              stackIn_4_0 = this.a((byte) -39, param2, param0, true) | this.a(this.field_C, 15, param2, param0, this.field_y);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("rt.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(CharSequence param0, int param1, char param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param0.length();
            var5 = param1;
            L1: while (true) {
              if (var4 <= var5) {
                stackIn_9_0 = var3_int;
                break L0;
              } else {
                L2: {
                  if (param2 == param0.charAt(var5)) {
                    var3_int++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("rt.E(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final String a(byte param0, boolean param1) {
        int var3 = -56 / ((param0 - 53) / 51);
        return null;
    }

    public static void e(byte param0) {
        if (param0 < 78) {
            rt.g(98);
            field_B = null;
            return;
        }
        field_B = null;
    }

    final static boolean a(boolean param0, Class param1) {
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                L2: {
                  if (Integer.TYPE == param1) {
                    break L2;
                  } else {
                    if (Short.TYPE == param1) {
                      break L2;
                    } else {
                      if (param1 == Long.TYPE) {
                        break L2;
                      } else {
                        if (Byte.TYPE == param1) {
                          break L2;
                        } else {
                          if (Float.TYPE == param1) {
                            break L2;
                          } else {
                            if (param1 != Double.TYPE) {
                              stackIn_12_0 = 0;
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("rt.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 102) {
                break L1;
              } else {
                rt.e((byte) -63);
                break L1;
              }
            }
            if (kr.field_y[0] != null) {
              if (2 >= kr.field_y[0].length) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var1_int = 0;
                L2: while (true) {
                  if (kr.field_y[0].length <= var1_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (-26 != (kr.field_y[0][var1_int] ^ -1)) {
                      var1_int++;
                      continue L2;
                    } else {
                      kr.field_y[0][var1_int] = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "rt.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static int g(int param0) {
        if (param0 != 0) {
            return 45;
        }
        return wr.field_L;
    }

    final void a(ha param0, int param1) {
        try {
            param0.field_Eb[param0.field_v * this.field_w.field_w + this.field_w.field_J].field_c = null;
            param0.field_Eb[param0.field_v * this.field_C + this.field_y].field_c = this.field_w;
            param0.field_Eb[param0.field_v * this.field_C + this.field_y].field_l = false;
            this.field_w.field_w = this.field_C;
            this.field_w.field_I = false;
            if (param1 != -26661) {
                rt.e((byte) -101);
            }
            this.field_w.field_Y = this.field_w.field_t;
            this.field_w.field_J = this.field_y;
            this.field_w.field_ab = 0;
            this.field_w.a((byte) -96);
            this.field_w.field_S = false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "rt.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            L2: {
              if (param0) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            ep.a(stackIn_5_0 != 0, param1, param2);
            if (null == ad.field_I) {
              break L0;
            } else {
              op.a(-110, ad.field_I);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("rt.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    rt(jd param0, int param1, int param2) {
        try {
            this.field_w = param0;
            this.field_m = 25;
            this.field_C = param2;
            this.field_y = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "rt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_B = "Elapsed time";
    }
}
