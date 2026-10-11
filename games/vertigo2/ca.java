/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static cr field_f;
    static int field_g;
    static cr field_h;
    static int[] field_a;
    static String field_e;
    static int field_b;
    static volatile int field_c;
    static String field_d;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param7 < 101) {
          return;
        }
        try {
          hb.field_j.field_S = param6;
          if (2 != ui.field_g) {
            oa.field_s.field_S = ml.field_x;
          } else {
            oa.field_s.field_S = nj.field_c;
          }
          var9_int = 495;
          var10 = 5;
          gg.field_o.a(88, -10 + var9_int, param3, var10, 5);
          dj.field_d.a(97, -ui.field_b.field_Fb + gg.field_o.field_Fb, param3, 0, 0);
          var10 = var10 + (param8 + param3);
          ui.field_b.a(83, ui.field_b.field_Fb, param3, 0, dj.field_d.field_Fb);
          kk.field_a.a(94, kk.field_a.j(-21391), param1, var10, 5);
          var11 = oa.field_s.j(-21391);
          oa.field_s.a(120, var11, param1, var10, -5 + var9_int - var11);
          hb.field_j.a(121, var9_int, param4, 0, 0);
          var12 = 5 + var10 + param1;
          lm.field_F.a(120, var9_int, var12, param4, 0);
          lm.field_F.field_Bb = vl.a(lm.field_F.field_db, 3, 0, 2105376, 11579568, 8421504);
          var12 = var12 + param4;
          gk.field_c.a(72, var9_int, var12, param0 - var12 / 2, -(var9_int / 2) + param5);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ca.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static er[] a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        er[] var7 = new er[9];
        er[] var4 = var7;
        if (param0 <= -73) {
          var7[0] = ed.a(param3, param2, false);
          for (var5 = 1; var5 < 9; var5++) {
            var7[var5] = var7[0];
          }
          var4[4] = ed.a(param1, 64, false);
          return var4;
        }
        return (er[]) null;
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int stackIn_17_0 = 0;
        boolean stackIn_18_1 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_28_1 = false;
        int stackIn_39_0 = 0;
        boolean stackIn_40_1 = false;
        boolean stackIn_48_0 = false;
        int stackIn_53_0 = 0;
        boolean stackIn_54_1 = false;
        boolean stackIn_61_0 = false;
        int stackIn_66_0 = 0;
        boolean stackIn_67_1 = false;
        int stackIn_77_0 = 0;
        boolean stackIn_82_0 = false;
        int stackIn_87_0 = 0;
        boolean stackIn_88_1 = false;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        if (ln.field_d != null) {
          ln.field_d.a(param0, (byte) -28);
        }
        if (param1 != -16237) {
          return;
        }
        if (null == oe.field_pb) {
          va.field_s.b(119);
          if (qh.field_g) {
            if (!lc.field_d) {
              return;
            }
            if (am.field_b) {
              stackIn_77_0 = (il.field_a) ? 1 : 0;
            } else {
              stackIn_77_0 = 0;
            }
            var2 = stackIn_77_0;
            stackIn_82_0 = (param0) && (m.h(param1 + 16109)) && (var2 == 0);
            ff.a(stackIn_82_0, 11182);
            if (var2 == 0) {
              return;
            }
            stackIn_87_0 = 100;
            stackIn_88_1 = (param0) && (m.h(-121));
            uc.$cfr$intArgs$a$7ffe4b125357(stackIn_87_0, stackIn_88_1);
          }
          return;
        }
        oe.field_pb.a(param0, (byte) -28);
        va.field_s.b(119);
        if (!qh.field_g) {
          return;
        }
        if (!lc.field_d) {
          return;
        }
        if (!am.field_b) {
          var2Lifetime1 = 0;
          if (!param0) {
            ff.a(false, 11182);
            if (var2Lifetime1 != 0) {
              stackIn_17_0 = 100;
              stackIn_18_1 = (param0) && (m.h(-121));
              uc.$cfr$intArgs$a$7ffe4b125357(stackIn_17_0, stackIn_18_1);
            }
            return;
          }
          if (!m.h(param1 + 16109)) {
            ff.a(false, 11182);
            if (var2Lifetime1 != 0) {
              stackIn_27_0 = 100;
              stackIn_28_1 = (param0) && (m.h(-121));
              uc.$cfr$intArgs$a$7ffe4b125357(stackIn_27_0, stackIn_28_1);
            }
            return;
          }
          ff.a((var2Lifetime1 == 0), 11182);
          if (var2Lifetime1 != 0) {
            stackIn_39_0 = 100;
            stackIn_40_1 = (param0) && (m.h(-121));
            uc.$cfr$intArgs$a$7ffe4b125357(stackIn_39_0, stackIn_40_1);
          }
          return;
        }
        if (!il.field_a) {
          var2Lifetime2 = 0;
          stackIn_48_0 = (param0) && (m.h(param1 + 16109)) && (var2Lifetime2 == 0);
          ff.a(stackIn_48_0, 11182);
          if (var2Lifetime2 != 0) {
            stackIn_53_0 = 100;
            stackIn_54_1 = (param0) && (m.h(-121));
            uc.$cfr$intArgs$a$7ffe4b125357(stackIn_53_0, stackIn_54_1);
          }
          return;
        }
        var2Lifetime3 = 1;
        stackIn_61_0 = (param0) && (m.h(param1 + 16109)) && (var2Lifetime3 == 0);
        ff.a(stackIn_61_0, 11182);
        if (var2Lifetime3 == 0) {
          return;
        }
        stackIn_66_0 = 100;
        stackIn_67_1 = (param0) && (m.h(-121));
        uc.$cfr$intArgs$a$7ffe4b125357(stackIn_66_0, stackIn_67_1);
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_f = null;
        field_h = null;
        if (param0 == -90) {
          field_e = null;
          return;
        }
        ca.a((byte) 63);
        field_e = null;
    }

    static {
        field_e = "<%0> has resigned.";
        field_c = -1;
        field_d = "Accept";
    }
}
