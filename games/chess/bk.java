/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends o {
    static int field_n;
    static String[] field_l;
    boolean field_m;
    int field_j;
    static int field_k;
    int[] field_o;

    final static ln a(int param0, int param1) {
        Object var3 = null;
        l stackIn_4_0 = null;
        l stackIn_8_0 = null;
        Object stackOut_7_0 = null;
        l stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        l stackOut_2_0 = null;
        if (param0 > -115) {
          L0: {
            var3 = null;
            boolean discarded$6 = bk.a((byte) -107, true, (String) null, (ol) null, (String) null, 55, (String) null);
            if (null == ae.field_f) {
              stackOut_7_0 = null;
              stackIn_8_0 = (l) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ae.field_f.a((long)param1, 3000);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return (ln) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null == ae.field_f) {
              stackOut_3_0 = null;
              stackIn_4_0 = (l) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ae.field_f.a((long)param1, 3000);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return (ln) (Object) stackIn_4_0;
        }
    }

    final static void a(int param0) {
        if (param0 != 16777215) {
            field_k = 78;
            me.field_a = null;
            return;
        }
        me.field_a = null;
    }

    final static boolean a(byte param0, boolean param1, String param2, ol param3, String param4, int param5, String param6) {
        vd var7 = null;
        vd var8 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (ji.field_T == g.field_a) {
          var8 = new vd(jh.field_e, param3);
          var7 = var8;
          jh.field_e.b((mf) (Object) var8, (byte) -93);
          if (jn.a(32359)) {
            var8.o(-10896);
            if (param0 <= 71) {
              field_k = 107;
              return true;
            } else {
              return true;
            }
          } else {
            L0: {
              lg.field_a = null;
              ih.field_Q = param6;
              g.field_a = ci.field_ub;
              cn.field_f = param5;
              jd.field_d = param2;
              oc.field_o = param4;
              if (!param1) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            wc.field_E = stackIn_6_0 != 0;
            if (param0 <= 71) {
              field_k = 107;
              return true;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        if (!param0) {
            field_k = 115;
        }
    }

    bk() {
        ((bk) this).field_m = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_k = 16777215;
    }
}
