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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        el stackIn_6_0 = null;
        el stackIn_7_0 = null;
        el stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        el stackIn_9_0 = null;
        el stackIn_10_0 = null;
        el stackIn_11_0 = null;
        el stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        el stackIn_13_0 = null;
        el stackIn_14_0 = null;
        el stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        el stackIn_16_0 = null;
        el stackIn_17_0 = null;
        el stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        el stackIn_19_0 = null;
        el stackIn_20_0 = null;
        el stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        el stackIn_22_0 = null;
        el stackIn_23_0 = null;
        el stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        el stackOut_5_0 = null;
        el stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        el stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        el stackOut_8_0 = null;
        el stackOut_9_0 = null;
        el stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        el stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        el stackOut_12_0 = null;
        el stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        el stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        el stackOut_15_0 = null;
        el stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        el stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        el stackOut_18_0 = null;
        el stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        el stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        el stackOut_21_0 = null;
        el stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        el stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          var9 = TetraLink.field_J;
          if (param0) {
            param2.field_jc = param3.d((byte) -99);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          param2.field_rc = param3.d((byte) -99);
          param2.field_ic = param3.d((byte) -99);
          if (param1) {
            break L1;
          } else {
            field_l = -120;
            break L1;
          }
        }
        L2: {
          var4 = param3.d((byte) -99);
          stackOut_5_0 = (el) param2;
          stackIn_7_0 = stackOut_5_0;
          stackIn_6_0 = stackOut_5_0;
          if ((128 & var4) == 0) {
            stackOut_7_0 = (el) (Object) stackIn_7_0;
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L2;
          } else {
            stackOut_6_0 = (el) (Object) stackIn_6_0;
            stackOut_6_1 = 1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            break L2;
          }
        }
        L3: {
          L4: {
            stackIn_8_0.field_uc = stackIn_8_1 != 0;
            stackOut_8_0 = (el) param2;
            stackIn_11_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param2.field_uc) {
              break L4;
            } else {
              stackOut_9_0 = (el) (Object) stackIn_9_0;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (param2.field_rc <= param2.field_jc) {
                break L4;
              } else {
                stackOut_10_0 = (el) (Object) stackIn_10_0;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L3;
              }
            }
          }
          stackOut_11_0 = (el) (Object) stackIn_11_0;
          stackOut_11_1 = 0;
          stackIn_12_0 = stackOut_11_0;
          stackIn_12_1 = stackOut_11_1;
          break L3;
        }
        L5: {
          stackIn_12_0.field_xc = stackIn_12_1 != 0;
          stackOut_12_0 = (el) param2;
          stackIn_14_0 = stackOut_12_0;
          stackIn_13_0 = stackOut_12_0;
          if ((var4 & 32) == 0) {
            stackOut_14_0 = (el) (Object) stackIn_14_0;
            stackOut_14_1 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            break L5;
          } else {
            stackOut_13_0 = (el) (Object) stackIn_13_0;
            stackOut_13_1 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            break L5;
          }
        }
        L6: {
          stackIn_15_0.field_mc = stackIn_15_1 != 0;
          stackOut_15_0 = (el) param2;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if ((var4 & 8) == -1) {
            stackOut_17_0 = (el) (Object) stackIn_17_0;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L6;
          } else {
            stackOut_16_0 = (el) (Object) stackIn_16_0;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L6;
          }
        }
        L7: {
          stackIn_18_0.field_kc = stackIn_18_1 != 0;
          stackOut_18_0 = (el) param2;
          stackIn_20_0 = stackOut_18_0;
          stackIn_19_0 = stackOut_18_0;
          if (-1 == (64 & var4)) {
            stackOut_20_0 = (el) (Object) stackIn_20_0;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L7;
          } else {
            stackOut_19_0 = (el) (Object) stackIn_19_0;
            stackOut_19_1 = 1;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            break L7;
          }
        }
        L8: {
          stackIn_21_0.field_Kb = stackIn_21_1 != 0;
          stackOut_21_0 = (el) param2;
          stackIn_23_0 = stackOut_21_0;
          stackIn_22_0 = stackOut_21_0;
          if (0 != (16 & var4)) {
            stackOut_23_0 = (el) (Object) stackIn_23_0;
            stackOut_23_1 = 2;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            break L8;
          } else {
            stackOut_22_0 = (el) (Object) stackIn_22_0;
            stackOut_22_1 = 1;
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            break L8;
          }
        }
        L9: {
          stackIn_24_0.field_Zb = stackIn_24_1;
          if (0 == (var4 & 4)) {
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L9;
          } else {
            stackOut_25_0 = 1;
            stackIn_27_0 = stackOut_25_0;
            break L9;
          }
        }
        L10: {
          var5 = stackIn_27_0;
          if (-1 == (2 & var4 ^ -1)) {
            stackOut_29_0 = 0;
            stackIn_30_0 = stackOut_29_0;
            break L10;
          } else {
            stackOut_28_0 = 1;
            stackIn_30_0 = stackOut_28_0;
            break L10;
          }
        }
        L11: {
          var6 = stackIn_30_0;
          param3.b(param2.field_sc.length, 0, param2.field_sc, 126);
          param2.field_Qb = param3.e(127);
          param2.field_Ac = k.a(0) + -(long)param3.f(123);
          if (var5 == 0) {
            param2.field_bc = -1;
            break L11;
          } else {
            param2.field_bc = param3.f(-122);
            break L11;
          }
        }
        L12: {
          param2.field_cc = param3.c(255);
          var7 = param3.field_t;
          param2.field_ec = param3.g((byte) 81);
          if (var6 == 0) {
            param2.field_fc = null;
            break L12;
          } else {
            param2.field_fc = new String[param2.field_jc];
            param3.field_t = var7;
            var8 = 0;
            L13: while (true) {
              if (var8 >= param2.field_jc) {
                break L12;
              } else {
                param2.field_fc[var8] = param3.g((byte) 81);
                var8++;
                continue L13;
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        if (!param0) {
            field_q = null;
        }
        bc var1 = nd.field_Lb;
        while (jl.a(false)) {
            var1.f(8, (byte) -92);
            int fieldTemp$0 = var1.field_t + 1;
            var1.field_t = var1.field_t + 1;
            var2 = fieldTemp$0;
            md.a((byte) -93, var1);
            nd.field_Lb.b(-var2 + var1.field_t, -2);
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
        if (param0 != -55) {
            field_o = false;
        }
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
        int var7 = 0;
        bh var8 = null;
        ((dh) this).field_b = new je();
        ((dh) this).field_h = 128;
        ((dh) this).field_a = 0;
        ((dh) this).field_k = param2;
        ((dh) this).field_j = param1;
        ((dh) this).field_a = ((dh) this).field_k;
        ((dh) this).field_h = param3;
        int[] var12 = param0.c(0, 0);
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var5 = var10;
        int var6 = var12.length;
        ((dh) this).field_f = new gf[param0.b(-23126, 0)];
        for (var7 = 0; var6 > var7; var7++) {
            var8 = new bh(param0.a(4, var12[var7], 0));
            ((dh) this).field_f[var12[var7]] = new gf(var8);
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
