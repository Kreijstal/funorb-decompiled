/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh implements m {
    private gf[] field_f;
    static jb field_d;
    static String field_c;
    static boolean field_o;
    static wk field_q;
    static int field_l;
    static rm[] field_n;
    static int field_m;
    static kh[] field_g;
    static int field_i;
    static int field_e;
    static hl field_p;
    private je field_b;
    private ah field_j;
    private int field_h;
    private int field_k;
    private int field_a;

    final static void a(int param0) {
        dl var1 = (dl) (Object) oa.field_u.c((byte) 125);
        if (var1 == null) {
            throw new IllegalStateException();
        }
        ra.a(var1.field_t, var1.field_p, var1.field_o);
        if (param0 != -581) {
            return;
        }
        ra.a(var1.field_r, var1.field_q, var1.field_u, var1.field_s);
        var1.field_t = null;
        fm.field_a.a((mc) (Object) var1, false);
    }

    public final int b(int param0, int param1) {
        if (param0 != 6092) {
            Object var4 = null;
            dh.a(false, false, (el) null, (bh) null);
        }
        if (((dh) this).field_f[param1] == null) {
            return 0;
        }
        return ((dh) this).field_f[param1].field_o;
    }

    public final int a(int param0, int param1) {
        if (param1 != 0) {
            ((dh) this).field_b = null;
        }
        if (!((dh) this).field_f[param0].field_p) {
            return 1;
        }
        return 0;
    }

    public final int[] a(float param0, int param1, boolean param2) {
        gf var8 = null;
        gf var7 = ((dh) this).field_f[param1];
        gf var6 = var7;
        var6 = var7;
        if (!param2) {
            return null;
        }
        if (var7 == null) {
        } else {
            if (!(var7.field_u == null)) {
                if (var7.field_n == param0) {
                    ((dh) this).field_b.a((mc) (Object) var7, 124);
                    return var7.field_u;
                }
                var7.b(false);
                var7.a();
                ((dh) this).field_a = ((dh) this).field_a + 1;
            }
            if (!var7.a(param0, ((dh) this).field_h, ((dh) this).field_j)) {
                return null;
            }
            if (((dh) this).field_a != 0) {
                ((dh) this).field_a = ((dh) this).field_a - 1;
            } else {
                var8 = (gf) (Object) ((dh) this).field_b.c((byte) 126);
                var8.a();
            }
            ((dh) this).field_b.a((mc) (Object) var7, 127);
            return var7.field_u;
        }
        return null;
    }

    final static void a(boolean param0, boolean param1, el param2, bh param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        el stackIn_7_0 = null;
        el stackIn_8_0 = null;
        el stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        el stackIn_10_0 = null;
        el stackIn_11_0 = null;
        el stackIn_12_0 = null;
        el stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        el stackIn_14_0 = null;
        el stackIn_15_0 = null;
        el stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        el stackIn_17_0 = null;
        el stackIn_18_0 = null;
        el stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        el stackIn_20_0 = null;
        el stackIn_21_0 = null;
        el stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        el stackIn_23_0 = null;
        el stackIn_24_0 = null;
        el stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        el stackOut_6_0 = null;
        el stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        el stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        el stackOut_9_0 = null;
        el stackOut_10_0 = null;
        el stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        el stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        el stackOut_13_0 = null;
        el stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        el stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        el stackOut_16_0 = null;
        el stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        el stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        el stackOut_19_0 = null;
        el stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        el stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        el stackOut_22_0 = null;
        el stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        el stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0) {
                param2.field_jc = param3.d((byte) -99);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param2.field_rc = param3.d((byte) -99);
              param2.field_ic = param3.d((byte) -99);
              if (param1) {
                break L2;
              } else {
                field_l = -120;
                break L2;
              }
            }
            L3: {
              var4_int = param3.d((byte) -99);
              stackOut_6_0 = (el) param2;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if ((128 & var4_int) == 0) {
                stackOut_8_0 = (el) (Object) stackIn_8_0;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = (el) (Object) stackIn_7_0;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            L4: {
              L5: {
                stackIn_9_0.field_uc = stackIn_9_1 != 0;
                stackOut_9_0 = (el) param2;
                stackIn_12_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (!param2.field_uc) {
                  break L5;
                } else {
                  stackOut_10_0 = (el) (Object) stackIn_10_0;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (param2.field_rc <= param2.field_jc) {
                    break L5;
                  } else {
                    stackOut_11_0 = (el) (Object) stackIn_11_0;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L4;
                  }
                }
              }
              stackOut_12_0 = (el) (Object) stackIn_12_0;
              stackOut_12_1 = 0;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              break L4;
            }
            L6: {
              stackIn_13_0.field_xc = stackIn_13_1 != 0;
              stackOut_13_0 = (el) param2;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if ((var4_int & 32) == 0) {
                stackOut_15_0 = (el) (Object) stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L6;
              } else {
                stackOut_14_0 = (el) (Object) stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L6;
              }
            }
            L7: {
              stackIn_16_0.field_mc = stackIn_16_1 != 0;
              stackOut_16_0 = (el) param2;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if ((var4_int & 8) == -1) {
                stackOut_18_0 = (el) (Object) stackIn_18_0;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L7;
              } else {
                stackOut_17_0 = (el) (Object) stackIn_17_0;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L7;
              }
            }
            L8: {
              stackIn_19_0.field_kc = stackIn_19_1 != 0;
              stackOut_19_0 = (el) param2;
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (-1 == (64 & var4_int)) {
                stackOut_21_0 = (el) (Object) stackIn_21_0;
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L8;
              } else {
                stackOut_20_0 = (el) (Object) stackIn_20_0;
                stackOut_20_1 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L8;
              }
            }
            L9: {
              stackIn_22_0.field_Kb = stackIn_22_1 != 0;
              stackOut_22_0 = (el) param2;
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (0 != (16 & var4_int)) {
                stackOut_24_0 = (el) (Object) stackIn_24_0;
                stackOut_24_1 = 2;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L9;
              } else {
                stackOut_23_0 = (el) (Object) stackIn_23_0;
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L9;
              }
            }
            L10: {
              stackIn_25_0.field_Zb = stackIn_25_1;
              if (0 == (var4_int & 4)) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L10;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_28_0;
              if ((2 & var4_int) == 0) {
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L11;
              } else {
                stackOut_29_0 = 1;
                stackIn_31_0 = stackOut_29_0;
                break L11;
              }
            }
            L12: {
              var6 = stackIn_31_0;
              param3.b(param2.field_sc.length, 0, param2.field_sc, 126);
              param2.field_Qb = param3.e(127);
              param2.field_Ac = k.a(0) + -(long)param3.f(123);
              if (var5 == 0) {
                param2.field_bc = -1;
                break L12;
              } else {
                param2.field_bc = param3.f(-122);
                break L12;
              }
            }
            L13: {
              param2.field_cc = param3.c(255);
              var7 = param3.field_t;
              param2.field_ec = param3.g((byte) 81);
              if (var6 == 0) {
                param2.field_fc = null;
                break L13;
              } else {
                param2.field_fc = new String[param2.field_jc];
                param3.field_t = var7;
                var8 = 0;
                L14: while (true) {
                  if (var8 >= param2.field_jc) {
                    break L13;
                  } else {
                    param2.field_fc[var8] = param3.g((byte) 81);
                    var8++;
                    continue L14;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("dh.I(").append(param0).append(',').append(param1).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L15;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L15;
            }
          }
          L16: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param3 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L16;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L16;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ')');
        }
    }

    final static void a(boolean param0) {
        bc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TetraLink.field_J;
        try {
          L0: {
            var1 = nd.field_Lb;
            L1: while (true) {
              if (!jl.a(false)) {
                break L0;
              } else {
                var1.f(8, (byte) -92);
                int fieldTemp$5 = var1.field_t + 1;
                var1.field_t = var1.field_t + 1;
                var2 = fieldTemp$5;
                md.a((byte) -93, var1);
                nd.field_Lb.b(-var2 + var1.field_t, -2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1_ref, "dh.F(" + true + ')');
        }
    }

    public final boolean a(byte param0, int param1) {
        if (param0 != -37) {
            field_m = 14;
        }
        return ((dh) this).field_h == 64 ? true : false;
    }

    public static void a(byte param0) {
        field_n = null;
        field_q = null;
        field_g = null;
        field_c = null;
        field_p = null;
        field_d = null;
    }

    public final boolean a(boolean param0, int param1) {
        if (!param0) {
            ((dh) this).field_b = null;
            return true;
        }
        return true;
    }

    dh(ah param0, ah param1, int param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        bh var8 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
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
        ((dh) this).field_b = new je();
        ((dh) this).field_h = 128;
        ((dh) this).field_a = 0;
        try {
          L0: {
            ((dh) this).field_k = param2;
            ((dh) this).field_j = param1;
            ((dh) this).field_a = ((dh) this).field_k;
            ((dh) this).field_h = param3;
            var14 = param0.c(0, 0);
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var5 = var10;
            var6 = var14.length;
            ((dh) this).field_f = new gf[param0.b(-23126, 0)];
            var7 = 0;
            L1: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = new bh(param0.a(4, var14[var7], 0));
                ((dh) this).field_f[var14[var7]] = new gf(var8);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("dh.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_m = 0;
    }
}
