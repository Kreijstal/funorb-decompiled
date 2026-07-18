/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sea extends nv {
    static String field_q;
    static String field_o;
    private aia[] field_n;
    static String field_p;

    final int a(int param0, up param1, pc param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        aia var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = ((sea) this).field_g.d(3);
              var5 = ((sea) this).field_g.e(9648);
              var6 = param2.field_d + -var4_int;
              if (param0 < -85) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            var7 = -var4_int + param2.field_e;
            var8 = -var5 + param2.field_k;
            var9 = -var5 + param2.field_a;
            var10 = 0;
            L2: while (true) {
              if (var10 >= ((sea) this).field_n.length) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L3: {
                  var11 = ((sea) this).field_n[var10];
                  var12 = var4_int + var11.a((byte) 110);
                  var13 = var5 + var11.f(0);
                  var14 = eha.a(var11.g(0), 12, var13, var11.g(0), param2, var12, 2);
                  if (var14 > 0) {
                    var15 = wm.a(4096, var14, 15);
                    this.a(var8 + gqa.a(-var8 + var9, (byte) 24, var15), var6 - -gqa.a(var7 - var6, (byte) 24, var15), var11, (byte) -102, param1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("sea.S(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final int a(int param0, ep param1, up param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == 25940) {
              var4_int = param1.i(-1);
              stackOut_3_0 = ((sea) this).a(var4_int, var4_int, param2, param1.d(param0 ^ 25943), (byte) 125, param1.e(param0 ^ 16612));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 123;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("sea.BC(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final aia b(int param0, int param1) {
        int var3 = 15 / ((-50 - param0) / 56);
        return ((sea) this).field_n[param1];
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            this.d(param0);
            param1.a(26492, true, 3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sea.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 27508) {
            field_o = null;
        }
        field_o = null;
        field_p = null;
        field_q = null;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return 91;
        }
        return param0;
    }

    final void h(int param0) {
        int var3 = 0;
        aia var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        super.h(param0);
        aia[] var6 = ((sea) this).field_n;
        aia[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.c(126);
        }
    }

    final void k(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != 5418) {
            return;
        }
        int var2 = ((sea) this).field_g.d(3);
        int var3 = ((sea) this).field_g.e(9648);
        for (var4 = 0; ((sea) this).field_n.length > var4; var4++) {
            ((sea) this).field_n[var4].a(var2, ((sea) this).field_g.c(-112), ((sea) this).field_g.a((byte) 55), var3, (byte) -80, ((sea) this).field_g.r(0), ((sea) this).field_g.f((byte) 77));
        }
        var4 = ((sea) this).d(8031) ? 1 : 0;
        for (var5 = 0; var5 < ((sea) this).field_n.length; var5++) {
            ((sea) this).field_n[var5].a(111, var4 != 0, var3, var2, ((sea) this).m((byte) 19));
        }
    }

    final int a(boolean param0) {
        if (param0) {
            field_p = null;
        }
        return 15;
    }

    final static boolean l(int param0) {
        aj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        aj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (aj) (Object) al.field_g.f(-80);
            var1 = var4;
            if (var1 != null) {
              L1: {
                if (param0 == 10371) {
                  break L1;
                } else {
                  boolean discarded$2 = sea.l(41);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var1.field_f <= var2) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L3: {
                    if (null == var4.field_j[var2]) {
                      break L3;
                    } else {
                      if (var4.field_j[var2].field_b == 0) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (null == var4.field_k[var2]) {
                      break L4;
                    } else {
                      if (var4.field_k[var2].field_b != 0) {
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1_ref, "sea.P(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    sea(la param0, boolean param1) {
        super(param0, param1);
    }

    private final void a(int param0, int param1, aia param2, byte param3, up param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param3 <= -34) {
                break L1;
              } else {
                float[] discarded$2 = sea.a(0.6912761926651001f, -0.5952900052070618f, -96, -20, 0.25126492977142334f, -40, 39, 3);
                break L1;
              }
            }
            L2: {
              if (param4.field_j == 3) {
                param2.a(param1, param4.field_b, param0, true);
                break L2;
              } else {
                if (param4.field_j != 4) {
                  break L2;
                } else {
                  param2.a(param1, param0, param4.field_b, (byte) 99);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("sea.L(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 3) {
            Object var3 = null;
            int discarded$0 = ((sea) this).a(-115, (ep) null, (up) null);
        }
        return ((sea) this).field_n.length;
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        aia var10_ref_aia = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = ((sea) this).field_g.d(3);
            var8 = ((sea) this).field_g.e(9648);
            var9 = 0;
            L1: while (true) {
              if (((sea) this).field_n.length <= var9) {
                var10 = -90 / ((param4 - 62) / 52);
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L2: {
                  var10_ref_aia = ((sea) this).field_n[var9];
                  var11 = var10_ref_aia.a((byte) 91) + var7_int;
                  var12 = var8 + var10_ref_aia.f(0);
                  if (io.a(param1, var12, (byte) -61, param0, var11, param5, var10_ref_aia.g(0), var10_ref_aia.g(0), param3)) {
                    this.a(-((sea) this).field_g.e(9648) + param5, -((sea) this).field_g.d(3) + param3, var10_ref_aia, (byte) -115, param2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7;
            stackOut_9_1 = new StringBuilder().append("sea.UB(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_8_0;
    }

    final static float[] a(float param0, float param1, int param2, int param3, float param4, int param5, int param6, int param7) {
        float[] var8 = null;
        float[] var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float[] var13 = null;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float[] var17 = null;
        float[] var18 = null;
        float[] var19 = null;
        float[] var20 = null;
        float[] var21 = null;
        float[] var22 = null;
        float[] var23 = null;
        float[] var24 = null;
        float[] var25 = null;
        float[] var26 = null;
        L0: {
          var25 = new float[9];
          var23 = var25;
          var21 = var23;
          var19 = var21;
          var17 = var19;
          var8 = var17;
          var18 = new float[9];
          var9 = var18;
          var10 = (float)Math.cos((double)((float)param5 * 0.02454369328916073f));
          if (param2 == 16486) {
            break L0;
          } else {
            float[] discarded$1 = sea.a(1.2596310377120972f, 1.2713145017623901f, -99, -49, -0.6455500721931458f, 23, -23, -74);
            break L0;
          }
        }
        L1: {
          L2: {
            var11 = (float)Math.sin((double)((float)param5 * 0.02454369328916073f));
            var17[3] = 0.0f;
            var25[0] = var10;
            var17[7] = 0.0f;
            var25[8] = var10;
            var17[6] = -var11;
            var12 = -var10 + 1.0f;
            var17[1] = 0.0f;
            var17[5] = 0.0f;
            var17[4] = 1.0f;
            var25[2] = var11;
            var26 = new float[9];
            var24 = var26;
            var22 = var24;
            var20 = var22;
            var13 = var20;
            var14 = 1.0f;
            var10 = (float)param7 / 32767.0f;
            var15 = 0.0f;
            var12 = -var10 + 1.0f;
            var11 = -(float)Math.sqrt((double)(-(var10 * var10) + 1.0f));
            var16 = (float)Math.sqrt((double)(param3 * param3 + param6 * param6));
            if (0.0f != var16) {
              break L2;
            } else {
              if (var10 == 0.0f) {
                var9 = var17;
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (var16 != 0.0f) {
              var14 = (float)(-param3) / var16;
              var15 = (float)param6 / var16;
              break L3;
            } else {
              break L3;
            }
          }
          var13[8] = var10 + var15 * var15 * var12;
          var13[6] = var14 * var15 * var12;
          var13[0] = var10 + var12 * (var14 * var14);
          var13[5] = var14 * var11;
          var13[1] = var11 * var15;
          var13[7] = var11 * -var14;
          var13[2] = var12 * (var14 * var15);
          var26[4] = var10;
          var13[3] = -var15 * var11;
          var18[0] = var25[2] * var26[6] + (var26[3] * var25[1] + var25[0] * var26[0]);
          var18[1] = var25[2] * var26[7] + (var26[1] * var25[0] + var26[4] * var25[1]);
          var18[3] = var25[4] * var26[3] + var26[0] * var25[3] + var26[6] * var25[5];
          var18[2] = var25[0] * var26[2] + var26[5] * var25[1] + var25[2] * var26[8];
          var18[4] = var26[7] * var25[5] + (var26[4] * var25[4] + var25[3] * var26[1]);
          var18[5] = var26[8] * var25[5] + (var26[2] * var25[3] + var25[4] * var26[5]);
          var18[6] = var25[6] * var26[0] + var25[7] * var26[3] + var25[8] * var26[6];
          var18[7] = var25[8] * var26[7] + (var25[7] * var26[4] + var26[1] * var25[6]);
          var18[8] = var26[2] * var25[6] + var25[7] * var26[5] + var25[8] * var26[8];
          break L1;
        }
        var9[2] = var9[2] * param4;
        var9[1] = var9[1] * param4;
        var9[7] = var9[7] * param1;
        var9[3] = var9[3] * param0;
        var9[8] = var9[8] * param1;
        var9[6] = var9[6] * param1;
        var9[5] = var9[5] * param0;
        var9[4] = var9[4] * param0;
        var9[0] = var9[0] * param4;
        return var9;
    }

    static int c(int param0, int param1) {
        return param0 & param1;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            int discarded$0 = ((sea) this).a(false);
            return true;
        }
        return true;
    }

    sea(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var2 = ((sea) this).field_g.c(-33);
          var3 = ((sea) this).field_g.a((byte) 55);
          if (param0) {
            break L0;
          } else {
            ((sea) this).field_n = null;
            break L0;
          }
        }
        L1: {
          var4 = 1572864;
          var5 = (var2 >> 16) * (var3 >> 16) / ((var4 >> 16) * (var4 >> 16)) >> 2;
          if (50 < var5) {
            var5 = 50;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          L3: {
            if (-var4 + var2 <= 0) {
              break L3;
            } else {
              if (-var4 + var3 > 0) {
                ((sea) this).field_n = new aia[var5];
                var6 = 0;
                L4: while (true) {
                  if (var5 <= var6) {
                    break L2;
                  } else {
                    var7 = var4 / 2 + ((sea) this).o((byte) 46).a(-var4 + var2, 0) - var2 / 2;
                    var8 = -(var3 / 2) + (((sea) this).o((byte) 46).a(var3 + -var4, 0) + var4 / 2);
                    ((sea) this).field_n[var6] = new aia(var7, var8, var4);
                    var6++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
          }
          ((sea) this).field_n = new aia[]{};
          break L2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Instructions";
        field_o = null;
        field_p = "+15 Coins";
    }
}
