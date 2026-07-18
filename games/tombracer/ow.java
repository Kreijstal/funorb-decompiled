/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ow extends wv {
    static boolean field_s;
    private dea field_r;
    static int[] field_q;

    final void a(byte param0) {
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        super.a((byte) 89);
        if (param0 <= 78) {
          ((ow) this).field_r = null;
          if (null != rba.field_a) {
            if (!vpa.a(54)) {
              if (rba.field_a.field_D) {
                if (!rba.field_a.d((byte) 100)) {
                  ((ow) this).a(22174, mi.field_l);
                  return;
                } else {
                  ((ow) this).a(22174, sja.field_h);
                  return;
                }
              } else {
                ((ow) this).a(22174, uja.field_e);
                return;
              }
            } else {
              if (rba.field_a.field_D) {
                if (!rba.field_a.d((byte) 68)) {
                  ((ow) this).a(22174, hi.field_q);
                  return;
                } else {
                  ((ow) this).a(22174, sk.field_f);
                  return;
                }
              } else {
                ((ow) this).a(22174, ma.field_f);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          if (null != rba.field_a) {
            if (!vpa.a(54)) {
              if (rba.field_a.field_D) {
                if (!rba.field_a.d((byte) 100)) {
                  ((ow) this).a(22174, mi.field_l);
                  return;
                } else {
                  ((ow) this).a(22174, sja.field_h);
                  return;
                }
              } else {
                ((ow) this).a(22174, uja.field_e);
                return;
              }
            } else {
              if (rba.field_a.field_D) {
                if (!rba.field_a.d((byte) 68)) {
                  ((ow) this).a(22174, hi.field_q);
                  return;
                } else {
                  ((ow) this).a(22174, sk.field_f);
                  return;
                }
              } else {
                ((ow) this).a(22174, ma.field_f);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        var3 = super.a((byte) 112, param1);
        if (param0 >= 111) {
          if (((ow) this).field_m[param1].field_g != 5) {
            if (((ow) this).field_m[param1].field_g == 6) {
              var3 -= 10;
              return var3;
            } else {
              return var3;
            }
          } else {
            var3 -= 10;
            return var3;
          }
        } else {
          return 125;
        }
    }

    final int g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = ((ow) this).field_n;
        if (param1 != 30) {
          return -25;
        } else {
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              L1: {
                if (((ow) this).field_m[param0].field_g == 5) {
                  var3 += 10;
                  break L1;
                } else {
                  break L1;
                }
              }
              return var3;
            } else {
              L2: {
                if (((ow) this).field_m[var4].field_g != 5) {
                  if (6 == ((ow) this).field_m[var4].field_g) {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_9_0 = stackOut_6_0;
                    break L2;
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_9_0 = stackOut_4_0;
                  break L2;
                }
              }
              L3: {
                var5 = stackIn_9_0;
                stackOut_9_0 = var3;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (var5 != 0) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = ((ow) this).field_m[var4].d(11919) / 2;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L3;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = ((ow) this).field_i;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L3;
                }
              }
              var3 = stackIn_12_0 + stackIn_12_1;
              if (((ow) this).field_m[var4].field_g == 5) {
                var3 += 10;
                var4++;
                var4++;
                continue L0;
              } else {
                var4++;
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        ((ow) this).field_r.c(-72);
    }

    final static void a(byte param0, String[] param1) {
        try {
            if (!(on.field_b == null)) {
                on.field_b.field_y.a(13597, param1);
            }
            if (!(md.field_F == null)) {
                md.field_F.field_x.a(13597, param1);
            }
            int var2_int = -77 % ((-37 - param0) / 57);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ow.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ow(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((ow) this).field_r = new dea();
    }

    final void c(int param0) {
        ira.a(false, -1, (byte) -125);
        if (param0 != -6) {
            ((ow) this).c(49);
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        var3 = super.a(param0, param1);
        if (5 != ((ow) this).field_m[param0].field_g) {
          if (((ow) this).field_m[param0].field_g == 6) {
            var3 -= 10;
            return var3;
          } else {
            return var3;
          }
        } else {
          var3 -= 10;
          return var3;
        }
    }

    final void a(byte param0, boolean param1) {
        super.a(param0, param1);
        int var3 = ((ow) this).field_m[1].field_i + -70 + ((ow) this).field_r.e(93) - 150;
        tp.field_K.a((aaa.a(false) >> 1) + -(tp.field_K.a() >> 1), var3);
    }

    final static jea a(int param0, int param1, int param2, int param3, il param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, byte param12) {
        jea var13 = null;
        RuntimeException var13_ref = null;
        jea stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jea stackOut_2_0 = null;
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
              var13 = new jea(0L, (jea) null);
              var13.field_w = sva.a(param11, param2, 4);
              var13.field_C = sva.a(param1, param10, 4);
              var13.field_db = sva.a(param0, param5, 4);
              if (param12 < -75) {
                break L1;
              } else {
                field_s = true;
                break L1;
              }
            }
            var13.field_n = sva.a(param6, param9, 4);
            var13.field_M = sva.a(param7, param8, 4);
            var13.field_H = param4;
            var13.field_ib = param3;
            stackOut_2_0 = (jea) var13;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var13_ref;
            stackOut_4_1 = new StringBuilder().append("ow.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_3_0;
    }

    public static void d(int param0) {
        int var1 = -126 % ((param0 - 20) / 55);
        field_q = null;
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        dea stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        boolean stackIn_1_2 = false;
        dea stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_2_2 = false;
        dea stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_3_2 = false;
        int stackIn_3_3 = 0;
        dea stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        boolean stackOut_0_2 = false;
        dea stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        boolean stackOut_2_2 = false;
        int stackOut_2_3 = 0;
        dea stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        boolean stackOut_1_2 = false;
        int stackOut_1_3 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          super.a(param0, param1, param2);
          stackOut_0_0 = ((ow) this).field_r;
          stackOut_0_1 = -120;
          stackOut_0_2 = param0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (param1) {
            stackOut_2_0 = (dea) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = (dea) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
        ((dea) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0);
        if (rba.field_a != null) {
          if (rba.field_a.field_k != null) {
            if (rba.field_a.field_D) {
              if (!rba.field_a.d((byte) 92)) {
                var4 = rba.field_a.field_k.field_b;
                if (1 != (1 & var4 >> rba.field_a.field_x)) {
                  if (var4 != 0) {
                    ((ow) this).field_m[1].field_e = jf.field_s.toUpperCase();
                    return;
                  } else {
                    ((ow) this).field_m[1].field_e = lda.field_I.toUpperCase();
                    return;
                  }
                } else {
                  ((ow) this).field_m[1].field_e = pc.field_g.toUpperCase();
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[128];
    }
}
