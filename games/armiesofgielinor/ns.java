/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ns extends oj {
    private boolean field_J;
    private int field_H;
    static String[][][] field_A;
    private int field_z;
    private int field_C;
    private int field_Q;
    static String field_D;
    static volatile long field_P;
    private jd field_N;
    static wk field_E;
    static String field_K;
    private int field_M;
    static wk[] field_y;
    private int field_L;
    static wk field_O;
    static String field_F;

    public static void a(boolean param0) {
        field_F = null;
        if (param0) {
          ns.b(false);
          field_O = null;
          field_K = null;
          field_D = null;
          field_E = null;
          field_A = null;
          field_y = null;
          return;
        } else {
          field_O = null;
          field_K = null;
          field_D = null;
          field_E = null;
          field_A = null;
          field_y = null;
          return;
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        if (param1) {
          System.out.println("Attack event debug");
          System.out.println("Unit at " + ((ns) this).field_w.field_J + "," + ((ns) this).field_w.field_w);
          var4 = -24 % ((53 - param0) / 51);
          var3 = "EventAttack: pos: (" + ((ns) this).field_w.field_J + "," + ((ns) this).field_w.field_w + ")";
          return var3;
        } else {
          var4 = -24 % ((53 - param0) / 51);
          var3 = "EventAttack: pos: (" + ((ns) this).field_w.field_J + "," + ((ns) this).field_w.field_w + ")";
          return var3;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        if (param1 >= -84) {
          ((ns) this).field_H = 109;
          return ((ns) this).a((byte) -39, param2, param0, true);
        } else {
          return ((ns) this).a((byte) -39, param2, param0, true);
        }
    }

    final static int a(boolean param0, int param1, Random param2) {
        int var3 = 0;
        int var4 = 0;
        if (-1 <= (param1 ^ -1)) {
          throw new IllegalArgumentException();
        } else {
          if (pg.a(param1, -10)) {
            return (int)((long)param1 * (4294967295L & (long)param2.nextInt()) >> -1316652512);
          } else {
            if (param0) {
              ns.b(true);
              var3 = -(int)(4294967296L % (long)param1) + -2147483648;
              L0: while (true) {
                var4 = param2.nextInt();
                if (var3 > var4) {
                  return th.a(var4, 1, param1);
                } else {
                  continue L0;
                }
              }
            } else {
              var3 = -(int)(4294967296L % (long)param1) + -2147483648;
              L1: while (true) {
                var4 = param2.nextInt();
                if (var3 > var4) {
                  return th.a(var4, 1, param1);
                } else {
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        vl.field_n.h(32161, 76);
        if (param0) {
          field_A = null;
          var1 = 0;
          L0: while (true) {
            if (5 <= var1) {
              return;
            } else {
              vl.field_n.b(true, pg.field_d.field_d[var1]);
              var1++;
              continue L0;
            }
          }
        } else {
          var1 = 0;
          L1: while (true) {
            if (5 <= var1) {
              return;
            } else {
              vl.field_n.b(true, pg.field_d.field_d[var1]);
              var1++;
              continue L1;
            }
          }
        }
    }

    final static void d(byte param0) {
        String var1 = null;
        if (!fh.field_i) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (null != qc.field_a) {
              qc.field_a.b(true);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = dg.a(-123);
          np.field_Qb = new df(var1, (String) null, true, false, false);
          if (param0 < 75) {
            ns.a(true);
            rl.field_C.a((kb) (Object) lt.field_g, 0);
            lt.field_g.a((kb) (Object) np.field_Qb, (byte) 55);
            lt.field_g.l(105);
            return;
          } else {
            rl.field_C.a((kb) (Object) lt.field_g, 0);
            lt.field_g.a((kb) (Object) np.field_Qb, (byte) 55);
            lt.field_g.l(105);
            return;
          }
        }
    }

    final void a(ha param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var6 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        at stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ag stackIn_10_2 = null;
        ag stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackIn_10_9 = 0;
        int stackIn_10_10 = 0;
        at stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ag stackIn_11_2 = null;
        ag stackIn_11_3 = null;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_11_9 = 0;
        int stackIn_11_10 = 0;
        at stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ag stackIn_12_2 = null;
        ag stackIn_12_3 = null;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_12_8 = 0;
        int stackIn_12_9 = 0;
        int stackIn_12_10 = 0;
        int stackIn_12_11 = 0;
        at stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ag stackIn_13_2 = null;
        ag stackIn_13_3 = null;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        int stackIn_13_9 = 0;
        int stackIn_13_10 = 0;
        int stackIn_13_11 = 0;
        at stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ag stackIn_14_2 = null;
        ag stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        int stackIn_14_11 = 0;
        at stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ag stackIn_15_2 = null;
        ag stackIn_15_3 = null;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        int stackIn_15_8 = 0;
        int stackIn_15_9 = 0;
        int stackIn_15_10 = 0;
        int stackIn_15_11 = 0;
        int stackIn_15_12 = 0;
        at stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ag stackIn_19_2 = null;
        ag stackIn_19_3 = null;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        int stackIn_19_6 = 0;
        int stackIn_19_7 = 0;
        int stackIn_19_8 = 0;
        int stackIn_19_9 = 0;
        int stackIn_19_10 = 0;
        at stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ag stackIn_20_2 = null;
        ag stackIn_20_3 = null;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        int stackIn_20_6 = 0;
        int stackIn_20_7 = 0;
        int stackIn_20_8 = 0;
        int stackIn_20_9 = 0;
        int stackIn_20_10 = 0;
        at stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        ag stackIn_21_2 = null;
        ag stackIn_21_3 = null;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackIn_21_6 = 0;
        int stackIn_21_7 = 0;
        int stackIn_21_8 = 0;
        int stackIn_21_9 = 0;
        int stackIn_21_10 = 0;
        int stackIn_21_11 = 0;
        at stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        ag stackIn_22_2 = null;
        ag stackIn_22_3 = null;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        int stackIn_22_7 = 0;
        int stackIn_22_8 = 0;
        int stackIn_22_9 = 0;
        int stackIn_22_10 = 0;
        int stackIn_22_11 = 0;
        at stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        ag stackIn_23_2 = null;
        ag stackIn_23_3 = null;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        int stackIn_23_8 = 0;
        int stackIn_23_9 = 0;
        int stackIn_23_10 = 0;
        int stackIn_23_11 = 0;
        at stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        ag stackIn_24_2 = null;
        ag stackIn_24_3 = null;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        int stackIn_24_8 = 0;
        int stackIn_24_9 = 0;
        int stackIn_24_10 = 0;
        int stackIn_24_11 = 0;
        int stackIn_24_12 = 0;
        at stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        ag stackIn_35_2 = null;
        ag stackIn_35_3 = null;
        int stackIn_35_4 = 0;
        int stackIn_35_5 = 0;
        int stackIn_35_6 = 0;
        int stackIn_35_7 = 0;
        int stackIn_35_8 = 0;
        int stackIn_35_9 = 0;
        int stackIn_35_10 = 0;
        at stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        ag stackIn_36_2 = null;
        ag stackIn_36_3 = null;
        int stackIn_36_4 = 0;
        int stackIn_36_5 = 0;
        int stackIn_36_6 = 0;
        int stackIn_36_7 = 0;
        int stackIn_36_8 = 0;
        int stackIn_36_9 = 0;
        int stackIn_36_10 = 0;
        at stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        ag stackIn_37_2 = null;
        ag stackIn_37_3 = null;
        int stackIn_37_4 = 0;
        int stackIn_37_5 = 0;
        int stackIn_37_6 = 0;
        int stackIn_37_7 = 0;
        int stackIn_37_8 = 0;
        int stackIn_37_9 = 0;
        int stackIn_37_10 = 0;
        int stackIn_37_11 = 0;
        at stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        ag stackIn_38_2 = null;
        ag stackIn_38_3 = null;
        int stackIn_38_4 = 0;
        int stackIn_38_5 = 0;
        int stackIn_38_6 = 0;
        int stackIn_38_7 = 0;
        int stackIn_38_8 = 0;
        int stackIn_38_9 = 0;
        int stackIn_38_10 = 0;
        int stackIn_38_11 = 0;
        at stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        ag stackIn_39_2 = null;
        ag stackIn_39_3 = null;
        int stackIn_39_4 = 0;
        int stackIn_39_5 = 0;
        int stackIn_39_6 = 0;
        int stackIn_39_7 = 0;
        int stackIn_39_8 = 0;
        int stackIn_39_9 = 0;
        int stackIn_39_10 = 0;
        int stackIn_39_11 = 0;
        at stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        ag stackIn_40_2 = null;
        ag stackIn_40_3 = null;
        int stackIn_40_4 = 0;
        int stackIn_40_5 = 0;
        int stackIn_40_6 = 0;
        int stackIn_40_7 = 0;
        int stackIn_40_8 = 0;
        int stackIn_40_9 = 0;
        int stackIn_40_10 = 0;
        int stackIn_40_11 = 0;
        int stackIn_40_12 = 0;
        at stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        ag stackIn_44_2 = null;
        ag stackIn_44_3 = null;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_44_6 = 0;
        int stackIn_44_7 = 0;
        int stackIn_44_8 = 0;
        int stackIn_44_9 = 0;
        int stackIn_44_10 = 0;
        at stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        ag stackIn_45_2 = null;
        ag stackIn_45_3 = null;
        int stackIn_45_4 = 0;
        int stackIn_45_5 = 0;
        int stackIn_45_6 = 0;
        int stackIn_45_7 = 0;
        int stackIn_45_8 = 0;
        int stackIn_45_9 = 0;
        int stackIn_45_10 = 0;
        at stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        ag stackIn_46_2 = null;
        ag stackIn_46_3 = null;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        int stackIn_46_6 = 0;
        int stackIn_46_7 = 0;
        int stackIn_46_8 = 0;
        int stackIn_46_9 = 0;
        int stackIn_46_10 = 0;
        int stackIn_46_11 = 0;
        at stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        ag stackIn_47_2 = null;
        ag stackIn_47_3 = null;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int stackIn_47_6 = 0;
        int stackIn_47_7 = 0;
        int stackIn_47_8 = 0;
        int stackIn_47_9 = 0;
        int stackIn_47_10 = 0;
        int stackIn_47_11 = 0;
        at stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        ag stackIn_48_2 = null;
        ag stackIn_48_3 = null;
        int stackIn_48_4 = 0;
        int stackIn_48_5 = 0;
        int stackIn_48_6 = 0;
        int stackIn_48_7 = 0;
        int stackIn_48_8 = 0;
        int stackIn_48_9 = 0;
        int stackIn_48_10 = 0;
        int stackIn_48_11 = 0;
        at stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        ag stackIn_49_2 = null;
        ag stackIn_49_3 = null;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        int stackIn_49_6 = 0;
        int stackIn_49_7 = 0;
        int stackIn_49_8 = 0;
        int stackIn_49_9 = 0;
        int stackIn_49_10 = 0;
        int stackIn_49_11 = 0;
        int stackIn_49_12 = 0;
        at stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        ag stackOut_43_2 = null;
        ag stackOut_43_3 = null;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int stackOut_43_6 = 0;
        int stackOut_43_7 = 0;
        int stackOut_43_8 = 0;
        int stackOut_43_9 = 0;
        int stackOut_43_10 = 0;
        at stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        ag stackOut_45_2 = null;
        ag stackOut_45_3 = null;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_45_6 = 0;
        int stackOut_45_7 = 0;
        int stackOut_45_8 = 0;
        int stackOut_45_9 = 0;
        int stackOut_45_10 = 0;
        int stackOut_45_11 = 0;
        at stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        ag stackOut_44_2 = null;
        ag stackOut_44_3 = null;
        int stackOut_44_4 = 0;
        int stackOut_44_5 = 0;
        int stackOut_44_6 = 0;
        int stackOut_44_7 = 0;
        int stackOut_44_8 = 0;
        int stackOut_44_9 = 0;
        int stackOut_44_10 = 0;
        int stackOut_44_11 = 0;
        at stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        ag stackOut_46_2 = null;
        ag stackOut_46_3 = null;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        int stackOut_46_7 = 0;
        int stackOut_46_8 = 0;
        int stackOut_46_9 = 0;
        int stackOut_46_10 = 0;
        int stackOut_46_11 = 0;
        at stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        ag stackOut_48_2 = null;
        ag stackOut_48_3 = null;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        int stackOut_48_6 = 0;
        int stackOut_48_7 = 0;
        int stackOut_48_8 = 0;
        int stackOut_48_9 = 0;
        int stackOut_48_10 = 0;
        int stackOut_48_11 = 0;
        int stackOut_48_12 = 0;
        at stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        ag stackOut_47_2 = null;
        ag stackOut_47_3 = null;
        int stackOut_47_4 = 0;
        int stackOut_47_5 = 0;
        int stackOut_47_6 = 0;
        int stackOut_47_7 = 0;
        int stackOut_47_8 = 0;
        int stackOut_47_9 = 0;
        int stackOut_47_10 = 0;
        int stackOut_47_11 = 0;
        int stackOut_47_12 = 0;
        at stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        ag stackOut_34_2 = null;
        ag stackOut_34_3 = null;
        int stackOut_34_4 = 0;
        int stackOut_34_5 = 0;
        int stackOut_34_6 = 0;
        int stackOut_34_7 = 0;
        int stackOut_34_8 = 0;
        int stackOut_34_9 = 0;
        int stackOut_34_10 = 0;
        at stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        ag stackOut_36_2 = null;
        ag stackOut_36_3 = null;
        int stackOut_36_4 = 0;
        int stackOut_36_5 = 0;
        int stackOut_36_6 = 0;
        int stackOut_36_7 = 0;
        int stackOut_36_8 = 0;
        int stackOut_36_9 = 0;
        int stackOut_36_10 = 0;
        int stackOut_36_11 = 0;
        at stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        ag stackOut_35_2 = null;
        ag stackOut_35_3 = null;
        int stackOut_35_4 = 0;
        int stackOut_35_5 = 0;
        int stackOut_35_6 = 0;
        int stackOut_35_7 = 0;
        int stackOut_35_8 = 0;
        int stackOut_35_9 = 0;
        int stackOut_35_10 = 0;
        int stackOut_35_11 = 0;
        at stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        ag stackOut_37_2 = null;
        ag stackOut_37_3 = null;
        int stackOut_37_4 = 0;
        int stackOut_37_5 = 0;
        int stackOut_37_6 = 0;
        int stackOut_37_7 = 0;
        int stackOut_37_8 = 0;
        int stackOut_37_9 = 0;
        int stackOut_37_10 = 0;
        int stackOut_37_11 = 0;
        at stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        ag stackOut_39_2 = null;
        ag stackOut_39_3 = null;
        int stackOut_39_4 = 0;
        int stackOut_39_5 = 0;
        int stackOut_39_6 = 0;
        int stackOut_39_7 = 0;
        int stackOut_39_8 = 0;
        int stackOut_39_9 = 0;
        int stackOut_39_10 = 0;
        int stackOut_39_11 = 0;
        int stackOut_39_12 = 0;
        at stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        ag stackOut_38_2 = null;
        ag stackOut_38_3 = null;
        int stackOut_38_4 = 0;
        int stackOut_38_5 = 0;
        int stackOut_38_6 = 0;
        int stackOut_38_7 = 0;
        int stackOut_38_8 = 0;
        int stackOut_38_9 = 0;
        int stackOut_38_10 = 0;
        int stackOut_38_11 = 0;
        int stackOut_38_12 = 0;
        at stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ag stackOut_18_2 = null;
        ag stackOut_18_3 = null;
        int stackOut_18_4 = 0;
        int stackOut_18_5 = 0;
        int stackOut_18_6 = 0;
        int stackOut_18_7 = 0;
        int stackOut_18_8 = 0;
        int stackOut_18_9 = 0;
        int stackOut_18_10 = 0;
        at stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        ag stackOut_20_2 = null;
        ag stackOut_20_3 = null;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        int stackOut_20_7 = 0;
        int stackOut_20_8 = 0;
        int stackOut_20_9 = 0;
        int stackOut_20_10 = 0;
        int stackOut_20_11 = 0;
        at stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ag stackOut_19_2 = null;
        ag stackOut_19_3 = null;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        int stackOut_19_6 = 0;
        int stackOut_19_7 = 0;
        int stackOut_19_8 = 0;
        int stackOut_19_9 = 0;
        int stackOut_19_10 = 0;
        int stackOut_19_11 = 0;
        at stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        ag stackOut_21_2 = null;
        ag stackOut_21_3 = null;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        int stackOut_21_7 = 0;
        int stackOut_21_8 = 0;
        int stackOut_21_9 = 0;
        int stackOut_21_10 = 0;
        int stackOut_21_11 = 0;
        at stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        ag stackOut_23_2 = null;
        ag stackOut_23_3 = null;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        int stackOut_23_9 = 0;
        int stackOut_23_10 = 0;
        int stackOut_23_11 = 0;
        int stackOut_23_12 = 0;
        at stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        ag stackOut_22_2 = null;
        ag stackOut_22_3 = null;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        int stackOut_22_8 = 0;
        int stackOut_22_9 = 0;
        int stackOut_22_10 = 0;
        int stackOut_22_11 = 0;
        int stackOut_22_12 = 0;
        at stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ag stackOut_9_2 = null;
        ag stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        int stackOut_9_9 = 0;
        int stackOut_9_10 = 0;
        at stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ag stackOut_11_2 = null;
        ag stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_11_9 = 0;
        int stackOut_11_10 = 0;
        int stackOut_11_11 = 0;
        at stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ag stackOut_10_2 = null;
        ag stackOut_10_3 = null;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        int stackOut_10_9 = 0;
        int stackOut_10_10 = 0;
        int stackOut_10_11 = 0;
        at stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ag stackOut_12_2 = null;
        ag stackOut_12_3 = null;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        int stackOut_12_9 = 0;
        int stackOut_12_10 = 0;
        int stackOut_12_11 = 0;
        at stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ag stackOut_14_2 = null;
        ag stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        int stackOut_14_7 = 0;
        int stackOut_14_8 = 0;
        int stackOut_14_9 = 0;
        int stackOut_14_10 = 0;
        int stackOut_14_11 = 0;
        int stackOut_14_12 = 0;
        at stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ag stackOut_13_2 = null;
        ag stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        int stackOut_13_9 = 0;
        int stackOut_13_10 = 0;
        int stackOut_13_11 = 0;
        int stackOut_13_12 = 0;
        if (param1 == -26661) {
          if (((ns) this).field_J) {
            return;
          } else {
            ((ns) this).field_J = true;
            ((ns) this).field_w = param0.c(((ns) this).field_M, true, ((ns) this).field_L);
            if (null != ((ns) this).field_w) {
              var3 = ((ns) this).field_w.field_J;
              var4 = ((ns) this).field_w.field_w;
              if (!((ns) this).field_w.a(((ns) this).field_N, (byte) 119)) {
                if (-5 == (((ns) this).field_N.g(0) ^ -1)) {
                  if (((ns) this).field_w.j((byte) 103)) {
                    L0: {
                      var15 = param0.a(((ns) this).field_N, var4, (byte) -128, ((ns) this).field_H, ((ns) this).field_w, ((ns) this).field_z, var3);
                      stackOut_43_0 = param0.field_l;
                      stackOut_43_1 = param1 ^ -27339;
                      stackOut_43_2 = null;
                      stackOut_43_3 = null;
                      stackOut_43_4 = ((ns) this).field_N.field_N;
                      stackOut_43_5 = var3;
                      stackOut_43_6 = var4;
                      stackOut_43_7 = ((ns) this).field_z;
                      stackOut_43_8 = ((ns) this).field_H;
                      stackOut_43_9 = var15[0];
                      stackOut_43_10 = var15[1];
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      stackIn_45_2 = stackOut_43_2;
                      stackIn_45_3 = stackOut_43_3;
                      stackIn_45_4 = stackOut_43_4;
                      stackIn_45_5 = stackOut_43_5;
                      stackIn_45_6 = stackOut_43_6;
                      stackIn_45_7 = stackOut_43_7;
                      stackIn_45_8 = stackOut_43_8;
                      stackIn_45_9 = stackOut_43_9;
                      stackIn_45_10 = stackOut_43_10;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      stackIn_44_2 = stackOut_43_2;
                      stackIn_44_3 = stackOut_43_3;
                      stackIn_44_4 = stackOut_43_4;
                      stackIn_44_5 = stackOut_43_5;
                      stackIn_44_6 = stackOut_43_6;
                      stackIn_44_7 = stackOut_43_7;
                      stackIn_44_8 = stackOut_43_8;
                      stackIn_44_9 = stackOut_43_9;
                      stackIn_44_10 = stackOut_43_10;
                      if ((1 & var15[2] ^ -1) >= -1) {
                        stackOut_45_0 = (at) (Object) stackIn_45_0;
                        stackOut_45_1 = stackIn_45_1;
                        stackOut_45_2 = null;
                        stackOut_45_3 = null;
                        stackOut_45_4 = stackIn_45_4;
                        stackOut_45_5 = stackIn_45_5;
                        stackOut_45_6 = stackIn_45_6;
                        stackOut_45_7 = stackIn_45_7;
                        stackOut_45_8 = stackIn_45_8;
                        stackOut_45_9 = stackIn_45_9;
                        stackOut_45_10 = stackIn_45_10;
                        stackOut_45_11 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        stackIn_46_2 = stackOut_45_2;
                        stackIn_46_3 = stackOut_45_3;
                        stackIn_46_4 = stackOut_45_4;
                        stackIn_46_5 = stackOut_45_5;
                        stackIn_46_6 = stackOut_45_6;
                        stackIn_46_7 = stackOut_45_7;
                        stackIn_46_8 = stackOut_45_8;
                        stackIn_46_9 = stackOut_45_9;
                        stackIn_46_10 = stackOut_45_10;
                        stackIn_46_11 = stackOut_45_11;
                        break L0;
                      } else {
                        stackOut_44_0 = (at) (Object) stackIn_44_0;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = null;
                        stackOut_44_3 = null;
                        stackOut_44_4 = stackIn_44_4;
                        stackOut_44_5 = stackIn_44_5;
                        stackOut_44_6 = stackIn_44_6;
                        stackOut_44_7 = stackIn_44_7;
                        stackOut_44_8 = stackIn_44_8;
                        stackOut_44_9 = stackIn_44_9;
                        stackOut_44_10 = stackIn_44_10;
                        stackOut_44_11 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_46_2 = stackOut_44_2;
                        stackIn_46_3 = stackOut_44_3;
                        stackIn_46_4 = stackOut_44_4;
                        stackIn_46_5 = stackOut_44_5;
                        stackIn_46_6 = stackOut_44_6;
                        stackIn_46_7 = stackOut_44_7;
                        stackIn_46_8 = stackOut_44_8;
                        stackIn_46_9 = stackOut_44_9;
                        stackIn_46_10 = stackOut_44_10;
                        stackIn_46_11 = stackOut_44_11;
                        break L0;
                      }
                    }
                    L1: {
                      stackOut_46_0 = (at) (Object) stackIn_46_0;
                      stackOut_46_1 = stackIn_46_1;
                      stackOut_46_2 = null;
                      stackOut_46_3 = null;
                      stackOut_46_4 = stackIn_46_4;
                      stackOut_46_5 = stackIn_46_5;
                      stackOut_46_6 = stackIn_46_6;
                      stackOut_46_7 = stackIn_46_7;
                      stackOut_46_8 = stackIn_46_8;
                      stackOut_46_9 = stackIn_46_9;
                      stackOut_46_10 = stackIn_46_10;
                      stackOut_46_11 = stackIn_46_11;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      stackIn_48_2 = stackOut_46_2;
                      stackIn_48_3 = stackOut_46_3;
                      stackIn_48_4 = stackOut_46_4;
                      stackIn_48_5 = stackOut_46_5;
                      stackIn_48_6 = stackOut_46_6;
                      stackIn_48_7 = stackOut_46_7;
                      stackIn_48_8 = stackOut_46_8;
                      stackIn_48_9 = stackOut_46_9;
                      stackIn_48_10 = stackOut_46_10;
                      stackIn_48_11 = stackOut_46_11;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      stackIn_47_2 = stackOut_46_2;
                      stackIn_47_3 = stackOut_46_3;
                      stackIn_47_4 = stackOut_46_4;
                      stackIn_47_5 = stackOut_46_5;
                      stackIn_47_6 = stackOut_46_6;
                      stackIn_47_7 = stackOut_46_7;
                      stackIn_47_8 = stackOut_46_8;
                      stackIn_47_9 = stackOut_46_9;
                      stackIn_47_10 = stackOut_46_10;
                      stackIn_47_11 = stackOut_46_11;
                      if (0 >= (var15[2] & 2)) {
                        stackOut_48_0 = (at) (Object) stackIn_48_0;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = null;
                        stackOut_48_3 = null;
                        stackOut_48_4 = stackIn_48_4;
                        stackOut_48_5 = stackIn_48_5;
                        stackOut_48_6 = stackIn_48_6;
                        stackOut_48_7 = stackIn_48_7;
                        stackOut_48_8 = stackIn_48_8;
                        stackOut_48_9 = stackIn_48_9;
                        stackOut_48_10 = stackIn_48_10;
                        stackOut_48_11 = stackIn_48_11;
                        stackOut_48_12 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        stackIn_49_3 = stackOut_48_3;
                        stackIn_49_4 = stackOut_48_4;
                        stackIn_49_5 = stackOut_48_5;
                        stackIn_49_6 = stackOut_48_6;
                        stackIn_49_7 = stackOut_48_7;
                        stackIn_49_8 = stackOut_48_8;
                        stackIn_49_9 = stackOut_48_9;
                        stackIn_49_10 = stackOut_48_10;
                        stackIn_49_11 = stackOut_48_11;
                        stackIn_49_12 = stackOut_48_12;
                        break L1;
                      } else {
                        stackOut_47_0 = (at) (Object) stackIn_47_0;
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = null;
                        stackOut_47_3 = null;
                        stackOut_47_4 = stackIn_47_4;
                        stackOut_47_5 = stackIn_47_5;
                        stackOut_47_6 = stackIn_47_6;
                        stackOut_47_7 = stackIn_47_7;
                        stackOut_47_8 = stackIn_47_8;
                        stackOut_47_9 = stackIn_47_9;
                        stackOut_47_10 = stackIn_47_10;
                        stackOut_47_11 = stackIn_47_11;
                        stackOut_47_12 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_49_2 = stackOut_47_2;
                        stackIn_49_3 = stackOut_47_3;
                        stackIn_49_4 = stackOut_47_4;
                        stackIn_49_5 = stackOut_47_5;
                        stackIn_49_6 = stackOut_47_6;
                        stackIn_49_7 = stackOut_47_7;
                        stackIn_49_8 = stackOut_47_8;
                        stackIn_49_9 = stackOut_47_9;
                        stackIn_49_10 = stackOut_47_10;
                        stackIn_49_11 = stackOut_47_11;
                        stackIn_49_12 = stackOut_47_12;
                        break L1;
                      }
                    }
                    new ag(stackIn_49_4, stackIn_49_5, stackIn_49_6, stackIn_49_7, stackIn_49_8, stackIn_49_9, stackIn_49_10, stackIn_49_11 != 0, stackIn_49_12 != 0, ((ns) this).field_C, ((ns) this).field_Q, ((ns) this).field_w.field_W, ((ns) this).field_N.field_W, 0);
                    ((at) (Object) stackIn_49_0).a(stackIn_49_1, (tc) (Object) stackIn_49_2);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L2: {
                    var16 = param0.a(((ns) this).field_N, var4, (byte) -128, ((ns) this).field_H, ((ns) this).field_w, ((ns) this).field_z, var3);
                    stackOut_34_0 = param0.field_l;
                    stackOut_34_1 = param1 ^ -27339;
                    stackOut_34_2 = null;
                    stackOut_34_3 = null;
                    stackOut_34_4 = ((ns) this).field_N.field_N;
                    stackOut_34_5 = var3;
                    stackOut_34_6 = var4;
                    stackOut_34_7 = ((ns) this).field_z;
                    stackOut_34_8 = ((ns) this).field_H;
                    stackOut_34_9 = var16[0];
                    stackOut_34_10 = var16[1];
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_36_4 = stackOut_34_4;
                    stackIn_36_5 = stackOut_34_5;
                    stackIn_36_6 = stackOut_34_6;
                    stackIn_36_7 = stackOut_34_7;
                    stackIn_36_8 = stackOut_34_8;
                    stackIn_36_9 = stackOut_34_9;
                    stackIn_36_10 = stackOut_34_10;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    stackIn_35_3 = stackOut_34_3;
                    stackIn_35_4 = stackOut_34_4;
                    stackIn_35_5 = stackOut_34_5;
                    stackIn_35_6 = stackOut_34_6;
                    stackIn_35_7 = stackOut_34_7;
                    stackIn_35_8 = stackOut_34_8;
                    stackIn_35_9 = stackOut_34_9;
                    stackIn_35_10 = stackOut_34_10;
                    if ((1 & var16[2] ^ -1) >= -1) {
                      stackOut_36_0 = (at) (Object) stackIn_36_0;
                      stackOut_36_1 = stackIn_36_1;
                      stackOut_36_2 = null;
                      stackOut_36_3 = null;
                      stackOut_36_4 = stackIn_36_4;
                      stackOut_36_5 = stackIn_36_5;
                      stackOut_36_6 = stackIn_36_6;
                      stackOut_36_7 = stackIn_36_7;
                      stackOut_36_8 = stackIn_36_8;
                      stackOut_36_9 = stackIn_36_9;
                      stackOut_36_10 = stackIn_36_10;
                      stackOut_36_11 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      stackIn_37_4 = stackOut_36_4;
                      stackIn_37_5 = stackOut_36_5;
                      stackIn_37_6 = stackOut_36_6;
                      stackIn_37_7 = stackOut_36_7;
                      stackIn_37_8 = stackOut_36_8;
                      stackIn_37_9 = stackOut_36_9;
                      stackIn_37_10 = stackOut_36_10;
                      stackIn_37_11 = stackOut_36_11;
                      break L2;
                    } else {
                      stackOut_35_0 = (at) (Object) stackIn_35_0;
                      stackOut_35_1 = stackIn_35_1;
                      stackOut_35_2 = null;
                      stackOut_35_3 = null;
                      stackOut_35_4 = stackIn_35_4;
                      stackOut_35_5 = stackIn_35_5;
                      stackOut_35_6 = stackIn_35_6;
                      stackOut_35_7 = stackIn_35_7;
                      stackOut_35_8 = stackIn_35_8;
                      stackOut_35_9 = stackIn_35_9;
                      stackOut_35_10 = stackIn_35_10;
                      stackOut_35_11 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_37_4 = stackOut_35_4;
                      stackIn_37_5 = stackOut_35_5;
                      stackIn_37_6 = stackOut_35_6;
                      stackIn_37_7 = stackOut_35_7;
                      stackIn_37_8 = stackOut_35_8;
                      stackIn_37_9 = stackOut_35_9;
                      stackIn_37_10 = stackOut_35_10;
                      stackIn_37_11 = stackOut_35_11;
                      break L2;
                    }
                  }
                  L3: {
                    stackOut_37_0 = (at) (Object) stackIn_37_0;
                    stackOut_37_1 = stackIn_37_1;
                    stackOut_37_2 = null;
                    stackOut_37_3 = null;
                    stackOut_37_4 = stackIn_37_4;
                    stackOut_37_5 = stackIn_37_5;
                    stackOut_37_6 = stackIn_37_6;
                    stackOut_37_7 = stackIn_37_7;
                    stackOut_37_8 = stackIn_37_8;
                    stackOut_37_9 = stackIn_37_9;
                    stackOut_37_10 = stackIn_37_10;
                    stackOut_37_11 = stackIn_37_11;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    stackIn_39_3 = stackOut_37_3;
                    stackIn_39_4 = stackOut_37_4;
                    stackIn_39_5 = stackOut_37_5;
                    stackIn_39_6 = stackOut_37_6;
                    stackIn_39_7 = stackOut_37_7;
                    stackIn_39_8 = stackOut_37_8;
                    stackIn_39_9 = stackOut_37_9;
                    stackIn_39_10 = stackOut_37_10;
                    stackIn_39_11 = stackOut_37_11;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    stackIn_38_2 = stackOut_37_2;
                    stackIn_38_3 = stackOut_37_3;
                    stackIn_38_4 = stackOut_37_4;
                    stackIn_38_5 = stackOut_37_5;
                    stackIn_38_6 = stackOut_37_6;
                    stackIn_38_7 = stackOut_37_7;
                    stackIn_38_8 = stackOut_37_8;
                    stackIn_38_9 = stackOut_37_9;
                    stackIn_38_10 = stackOut_37_10;
                    stackIn_38_11 = stackOut_37_11;
                    if (0 >= (var16[2] & 2)) {
                      stackOut_39_0 = (at) (Object) stackIn_39_0;
                      stackOut_39_1 = stackIn_39_1;
                      stackOut_39_2 = null;
                      stackOut_39_3 = null;
                      stackOut_39_4 = stackIn_39_4;
                      stackOut_39_5 = stackIn_39_5;
                      stackOut_39_6 = stackIn_39_6;
                      stackOut_39_7 = stackIn_39_7;
                      stackOut_39_8 = stackIn_39_8;
                      stackOut_39_9 = stackIn_39_9;
                      stackOut_39_10 = stackIn_39_10;
                      stackOut_39_11 = stackIn_39_11;
                      stackOut_39_12 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      stackIn_40_2 = stackOut_39_2;
                      stackIn_40_3 = stackOut_39_3;
                      stackIn_40_4 = stackOut_39_4;
                      stackIn_40_5 = stackOut_39_5;
                      stackIn_40_6 = stackOut_39_6;
                      stackIn_40_7 = stackOut_39_7;
                      stackIn_40_8 = stackOut_39_8;
                      stackIn_40_9 = stackOut_39_9;
                      stackIn_40_10 = stackOut_39_10;
                      stackIn_40_11 = stackOut_39_11;
                      stackIn_40_12 = stackOut_39_12;
                      break L3;
                    } else {
                      stackOut_38_0 = (at) (Object) stackIn_38_0;
                      stackOut_38_1 = stackIn_38_1;
                      stackOut_38_2 = null;
                      stackOut_38_3 = null;
                      stackOut_38_4 = stackIn_38_4;
                      stackOut_38_5 = stackIn_38_5;
                      stackOut_38_6 = stackIn_38_6;
                      stackOut_38_7 = stackIn_38_7;
                      stackOut_38_8 = stackIn_38_8;
                      stackOut_38_9 = stackIn_38_9;
                      stackOut_38_10 = stackIn_38_10;
                      stackOut_38_11 = stackIn_38_11;
                      stackOut_38_12 = 1;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      stackIn_40_3 = stackOut_38_3;
                      stackIn_40_4 = stackOut_38_4;
                      stackIn_40_5 = stackOut_38_5;
                      stackIn_40_6 = stackOut_38_6;
                      stackIn_40_7 = stackOut_38_7;
                      stackIn_40_8 = stackOut_38_8;
                      stackIn_40_9 = stackOut_38_9;
                      stackIn_40_10 = stackOut_38_10;
                      stackIn_40_11 = stackOut_38_11;
                      stackIn_40_12 = stackOut_38_12;
                      break L3;
                    }
                  }
                  new ag(stackIn_40_4, stackIn_40_5, stackIn_40_6, stackIn_40_7, stackIn_40_8, stackIn_40_9, stackIn_40_10, stackIn_40_11 != 0, stackIn_40_12 != 0, ((ns) this).field_C, ((ns) this).field_Q, ((ns) this).field_w.field_W, ((ns) this).field_N.field_W, 0);
                  ((at) (Object) stackIn_40_0).a(stackIn_40_1, (tc) (Object) stackIn_40_2);
                  return;
                }
              } else {
                param0.field_l.a(750, (tc) (Object) new md(var3, var4, ((ns) this).field_z, ((ns) this).field_H, ((ns) this).field_w.field_O));
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var6 = null;
          boolean discarded$1 = ((ns) this).a((at) null, (byte) 68, (ic) null);
          if (((ns) this).field_J) {
            return;
          } else {
            ((ns) this).field_J = true;
            ((ns) this).field_w = param0.c(((ns) this).field_M, true, ((ns) this).field_L);
            if (null != ((ns) this).field_w) {
              var3 = ((ns) this).field_w.field_J;
              var4 = ((ns) this).field_w.field_w;
              if (!((ns) this).field_w.a(((ns) this).field_N, (byte) 119)) {
                if (-5 == (((ns) this).field_N.g(0) ^ -1)) {
                  if (((ns) this).field_w.j((byte) 103)) {
                    L4: {
                      var14 = param0.a(((ns) this).field_N, var4, (byte) -128, ((ns) this).field_H, ((ns) this).field_w, ((ns) this).field_z, var3);
                      var10 = var14;
                      var8 = var10;
                      stackOut_18_0 = param0.field_l;
                      stackOut_18_1 = param1 ^ -27339;
                      stackOut_18_2 = null;
                      stackOut_18_3 = null;
                      stackOut_18_4 = ((ns) this).field_N.field_N;
                      stackOut_18_5 = var3;
                      stackOut_18_6 = var4;
                      stackOut_18_7 = ((ns) this).field_z;
                      stackOut_18_8 = ((ns) this).field_H;
                      stackOut_18_9 = var14[0];
                      stackOut_18_10 = var14[1];
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      stackIn_20_4 = stackOut_18_4;
                      stackIn_20_5 = stackOut_18_5;
                      stackIn_20_6 = stackOut_18_6;
                      stackIn_20_7 = stackOut_18_7;
                      stackIn_20_8 = stackOut_18_8;
                      stackIn_20_9 = stackOut_18_9;
                      stackIn_20_10 = stackOut_18_10;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      stackIn_19_3 = stackOut_18_3;
                      stackIn_19_4 = stackOut_18_4;
                      stackIn_19_5 = stackOut_18_5;
                      stackIn_19_6 = stackOut_18_6;
                      stackIn_19_7 = stackOut_18_7;
                      stackIn_19_8 = stackOut_18_8;
                      stackIn_19_9 = stackOut_18_9;
                      stackIn_19_10 = stackOut_18_10;
                      if ((1 & var14[2] ^ -1) >= -1) {
                        stackOut_20_0 = (at) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = null;
                        stackOut_20_3 = null;
                        stackOut_20_4 = stackIn_20_4;
                        stackOut_20_5 = stackIn_20_5;
                        stackOut_20_6 = stackIn_20_6;
                        stackOut_20_7 = stackIn_20_7;
                        stackOut_20_8 = stackIn_20_8;
                        stackOut_20_9 = stackIn_20_9;
                        stackOut_20_10 = stackIn_20_10;
                        stackOut_20_11 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        stackIn_21_4 = stackOut_20_4;
                        stackIn_21_5 = stackOut_20_5;
                        stackIn_21_6 = stackOut_20_6;
                        stackIn_21_7 = stackOut_20_7;
                        stackIn_21_8 = stackOut_20_8;
                        stackIn_21_9 = stackOut_20_9;
                        stackIn_21_10 = stackOut_20_10;
                        stackIn_21_11 = stackOut_20_11;
                        break L4;
                      } else {
                        stackOut_19_0 = (at) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = null;
                        stackOut_19_3 = null;
                        stackOut_19_4 = stackIn_19_4;
                        stackOut_19_5 = stackIn_19_5;
                        stackOut_19_6 = stackIn_19_6;
                        stackOut_19_7 = stackIn_19_7;
                        stackOut_19_8 = stackIn_19_8;
                        stackOut_19_9 = stackIn_19_9;
                        stackOut_19_10 = stackIn_19_10;
                        stackOut_19_11 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_21_3 = stackOut_19_3;
                        stackIn_21_4 = stackOut_19_4;
                        stackIn_21_5 = stackOut_19_5;
                        stackIn_21_6 = stackOut_19_6;
                        stackIn_21_7 = stackOut_19_7;
                        stackIn_21_8 = stackOut_19_8;
                        stackIn_21_9 = stackOut_19_9;
                        stackIn_21_10 = stackOut_19_10;
                        stackIn_21_11 = stackOut_19_11;
                        break L4;
                      }
                    }
                    L5: {
                      stackOut_21_0 = (at) (Object) stackIn_21_0;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = null;
                      stackOut_21_3 = null;
                      stackOut_21_4 = stackIn_21_4;
                      stackOut_21_5 = stackIn_21_5;
                      stackOut_21_6 = stackIn_21_6;
                      stackOut_21_7 = stackIn_21_7;
                      stackOut_21_8 = stackIn_21_8;
                      stackOut_21_9 = stackIn_21_9;
                      stackOut_21_10 = stackIn_21_10;
                      stackOut_21_11 = stackIn_21_11;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_23_3 = stackOut_21_3;
                      stackIn_23_4 = stackOut_21_4;
                      stackIn_23_5 = stackOut_21_5;
                      stackIn_23_6 = stackOut_21_6;
                      stackIn_23_7 = stackOut_21_7;
                      stackIn_23_8 = stackOut_21_8;
                      stackIn_23_9 = stackOut_21_9;
                      stackIn_23_10 = stackOut_21_10;
                      stackIn_23_11 = stackOut_21_11;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      stackIn_22_3 = stackOut_21_3;
                      stackIn_22_4 = stackOut_21_4;
                      stackIn_22_5 = stackOut_21_5;
                      stackIn_22_6 = stackOut_21_6;
                      stackIn_22_7 = stackOut_21_7;
                      stackIn_22_8 = stackOut_21_8;
                      stackIn_22_9 = stackOut_21_9;
                      stackIn_22_10 = stackOut_21_10;
                      stackIn_22_11 = stackOut_21_11;
                      if (0 >= (var14[2] & 2)) {
                        stackOut_23_0 = (at) (Object) stackIn_23_0;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = null;
                        stackOut_23_3 = null;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = stackIn_23_5;
                        stackOut_23_6 = stackIn_23_6;
                        stackOut_23_7 = stackIn_23_7;
                        stackOut_23_8 = stackIn_23_8;
                        stackOut_23_9 = stackIn_23_9;
                        stackOut_23_10 = stackIn_23_10;
                        stackOut_23_11 = stackIn_23_11;
                        stackOut_23_12 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        stackIn_24_4 = stackOut_23_4;
                        stackIn_24_5 = stackOut_23_5;
                        stackIn_24_6 = stackOut_23_6;
                        stackIn_24_7 = stackOut_23_7;
                        stackIn_24_8 = stackOut_23_8;
                        stackIn_24_9 = stackOut_23_9;
                        stackIn_24_10 = stackOut_23_10;
                        stackIn_24_11 = stackOut_23_11;
                        stackIn_24_12 = stackOut_23_12;
                        break L5;
                      } else {
                        stackOut_22_0 = (at) (Object) stackIn_22_0;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = null;
                        stackOut_22_3 = null;
                        stackOut_22_4 = stackIn_22_4;
                        stackOut_22_5 = stackIn_22_5;
                        stackOut_22_6 = stackIn_22_6;
                        stackOut_22_7 = stackIn_22_7;
                        stackOut_22_8 = stackIn_22_8;
                        stackOut_22_9 = stackIn_22_9;
                        stackOut_22_10 = stackIn_22_10;
                        stackOut_22_11 = stackIn_22_11;
                        stackOut_22_12 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_24_3 = stackOut_22_3;
                        stackIn_24_4 = stackOut_22_4;
                        stackIn_24_5 = stackOut_22_5;
                        stackIn_24_6 = stackOut_22_6;
                        stackIn_24_7 = stackOut_22_7;
                        stackIn_24_8 = stackOut_22_8;
                        stackIn_24_9 = stackOut_22_9;
                        stackIn_24_10 = stackOut_22_10;
                        stackIn_24_11 = stackOut_22_11;
                        stackIn_24_12 = stackOut_22_12;
                        break L5;
                      }
                    }
                    new ag(stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_24_8, stackIn_24_9, stackIn_24_10, stackIn_24_11 != 0, stackIn_24_12 != 0, ((ns) this).field_C, ((ns) this).field_Q, ((ns) this).field_w.field_W, ((ns) this).field_N.field_W, 0);
                    ((at) (Object) stackIn_24_0).a(stackIn_24_1, (tc) (Object) stackIn_24_2);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    var13 = param0.a(((ns) this).field_N, var4, (byte) -128, ((ns) this).field_H, ((ns) this).field_w, ((ns) this).field_z, var3);
                    var9 = var13;
                    var8 = var9;
                    stackOut_9_0 = param0.field_l;
                    stackOut_9_1 = param1 ^ -27339;
                    stackOut_9_2 = null;
                    stackOut_9_3 = null;
                    stackOut_9_4 = ((ns) this).field_N.field_N;
                    stackOut_9_5 = var3;
                    stackOut_9_6 = var4;
                    stackOut_9_7 = ((ns) this).field_z;
                    stackOut_9_8 = ((ns) this).field_H;
                    stackOut_9_9 = var13[0];
                    stackOut_9_10 = var13[1];
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_11_3 = stackOut_9_3;
                    stackIn_11_4 = stackOut_9_4;
                    stackIn_11_5 = stackOut_9_5;
                    stackIn_11_6 = stackOut_9_6;
                    stackIn_11_7 = stackOut_9_7;
                    stackIn_11_8 = stackOut_9_8;
                    stackIn_11_9 = stackOut_9_9;
                    stackIn_11_10 = stackOut_9_10;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    stackIn_10_4 = stackOut_9_4;
                    stackIn_10_5 = stackOut_9_5;
                    stackIn_10_6 = stackOut_9_6;
                    stackIn_10_7 = stackOut_9_7;
                    stackIn_10_8 = stackOut_9_8;
                    stackIn_10_9 = stackOut_9_9;
                    stackIn_10_10 = stackOut_9_10;
                    if ((1 & var13[2] ^ -1) >= -1) {
                      stackOut_11_0 = (at) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = null;
                      stackOut_11_3 = null;
                      stackOut_11_4 = stackIn_11_4;
                      stackOut_11_5 = stackIn_11_5;
                      stackOut_11_6 = stackIn_11_6;
                      stackOut_11_7 = stackIn_11_7;
                      stackOut_11_8 = stackIn_11_8;
                      stackOut_11_9 = stackIn_11_9;
                      stackOut_11_10 = stackIn_11_10;
                      stackOut_11_11 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      stackIn_12_4 = stackOut_11_4;
                      stackIn_12_5 = stackOut_11_5;
                      stackIn_12_6 = stackOut_11_6;
                      stackIn_12_7 = stackOut_11_7;
                      stackIn_12_8 = stackOut_11_8;
                      stackIn_12_9 = stackOut_11_9;
                      stackIn_12_10 = stackOut_11_10;
                      stackIn_12_11 = stackOut_11_11;
                      break L6;
                    } else {
                      stackOut_10_0 = (at) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = null;
                      stackOut_10_3 = null;
                      stackOut_10_4 = stackIn_10_4;
                      stackOut_10_5 = stackIn_10_5;
                      stackOut_10_6 = stackIn_10_6;
                      stackOut_10_7 = stackIn_10_7;
                      stackOut_10_8 = stackIn_10_8;
                      stackOut_10_9 = stackIn_10_9;
                      stackOut_10_10 = stackIn_10_10;
                      stackOut_10_11 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      stackIn_12_4 = stackOut_10_4;
                      stackIn_12_5 = stackOut_10_5;
                      stackIn_12_6 = stackOut_10_6;
                      stackIn_12_7 = stackOut_10_7;
                      stackIn_12_8 = stackOut_10_8;
                      stackIn_12_9 = stackOut_10_9;
                      stackIn_12_10 = stackOut_10_10;
                      stackIn_12_11 = stackOut_10_11;
                      break L6;
                    }
                  }
                  L7: {
                    stackOut_12_0 = (at) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = null;
                    stackOut_12_3 = null;
                    stackOut_12_4 = stackIn_12_4;
                    stackOut_12_5 = stackIn_12_5;
                    stackOut_12_6 = stackIn_12_6;
                    stackOut_12_7 = stackIn_12_7;
                    stackOut_12_8 = stackIn_12_8;
                    stackOut_12_9 = stackIn_12_9;
                    stackOut_12_10 = stackIn_12_10;
                    stackOut_12_11 = stackIn_12_11;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_14_5 = stackOut_12_5;
                    stackIn_14_6 = stackOut_12_6;
                    stackIn_14_7 = stackOut_12_7;
                    stackIn_14_8 = stackOut_12_8;
                    stackIn_14_9 = stackOut_12_9;
                    stackIn_14_10 = stackOut_12_10;
                    stackIn_14_11 = stackOut_12_11;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    stackIn_13_5 = stackOut_12_5;
                    stackIn_13_6 = stackOut_12_6;
                    stackIn_13_7 = stackOut_12_7;
                    stackIn_13_8 = stackOut_12_8;
                    stackIn_13_9 = stackOut_12_9;
                    stackIn_13_10 = stackOut_12_10;
                    stackIn_13_11 = stackOut_12_11;
                    if (0 >= (var13[2] & 2)) {
                      stackOut_14_0 = (at) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = stackIn_14_4;
                      stackOut_14_5 = stackIn_14_5;
                      stackOut_14_6 = stackIn_14_6;
                      stackOut_14_7 = stackIn_14_7;
                      stackOut_14_8 = stackIn_14_8;
                      stackOut_14_9 = stackIn_14_9;
                      stackOut_14_10 = stackIn_14_10;
                      stackOut_14_11 = stackIn_14_11;
                      stackOut_14_12 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      stackIn_15_4 = stackOut_14_4;
                      stackIn_15_5 = stackOut_14_5;
                      stackIn_15_6 = stackOut_14_6;
                      stackIn_15_7 = stackOut_14_7;
                      stackIn_15_8 = stackOut_14_8;
                      stackIn_15_9 = stackOut_14_9;
                      stackIn_15_10 = stackOut_14_10;
                      stackIn_15_11 = stackOut_14_11;
                      stackIn_15_12 = stackOut_14_12;
                      break L7;
                    } else {
                      stackOut_13_0 = (at) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = stackIn_13_4;
                      stackOut_13_5 = stackIn_13_5;
                      stackOut_13_6 = stackIn_13_6;
                      stackOut_13_7 = stackIn_13_7;
                      stackOut_13_8 = stackIn_13_8;
                      stackOut_13_9 = stackIn_13_9;
                      stackOut_13_10 = stackIn_13_10;
                      stackOut_13_11 = stackIn_13_11;
                      stackOut_13_12 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      stackIn_15_5 = stackOut_13_5;
                      stackIn_15_6 = stackOut_13_6;
                      stackIn_15_7 = stackOut_13_7;
                      stackIn_15_8 = stackOut_13_8;
                      stackIn_15_9 = stackOut_13_9;
                      stackIn_15_10 = stackOut_13_10;
                      stackIn_15_11 = stackOut_13_11;
                      stackIn_15_12 = stackOut_13_12;
                      break L7;
                    }
                  }
                  new ag(stackIn_15_4, stackIn_15_5, stackIn_15_6, stackIn_15_7, stackIn_15_8, stackIn_15_9, stackIn_15_10, stackIn_15_11 != 0, stackIn_15_12 != 0, ((ns) this).field_C, ((ns) this).field_Q, ((ns) this).field_w.field_W, ((ns) this).field_N.field_W, 0);
                  ((at) (Object) stackIn_15_0).a(stackIn_15_1, (tc) (Object) stackIn_15_2);
                  return;
                }
              } else {
                param0.field_l.a(750, (tc) (Object) new md(var3, var4, ((ns) this).field_z, ((ns) this).field_H, ((ns) this).field_w.field_O));
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    ns(int param0, int param1, int param2, int param3, jd param4, int param5, int param6) {
        ((ns) this).field_L = param0;
        ((ns) this).field_H = param3;
        ((ns) this).field_m = 27;
        ((ns) this).field_M = param1;
        ((ns) this).field_J = false;
        ((ns) this).field_C = param5;
        ((ns) this).field_N = param4;
        ((ns) this).field_z = param2;
        ((ns) this).field_Q = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new String[][][]{new String[3][], new String[3][], new String[3][], new String[3][]};
        field_D = "Invite only";
        field_P = 0L;
        field_K = "You can join this game";
        field_F = "Your rating is <%0>";
    }
}
