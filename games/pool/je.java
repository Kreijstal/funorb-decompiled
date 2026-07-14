/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static String field_c;
    static String field_a;
    static String field_b;

    final static void a(sj param0, int param1, int param2, int param3, String param4, byte param5, int param6, int param7, int param8) {
        na.field_a = param6;
        nr.field_X = param4;
        ei.field_B = param8;
        qf.field_f = param2;
        ci.field_k = param1;
        om.field_v = param7;
        fe.field_M = param0;
        wn.field_h = param3;
        if (param5 >= -61) {
          field_b = null;
          sq.field_c = (no) (Object) new ug();
          ri.field_U = new rn(param0);
          nk.field_m = new qd(sq.field_c, ri.field_U);
          return;
        } else {
          sq.field_c = (no) (Object) new ug();
          ri.field_U = new rn(param0);
          nk.field_m = new qd(sq.field_c, ri.field_U);
          return;
        }
    }

    final static boolean b(byte param0) {
        if (param0 >= 95) {
          if (fk.field_gb != null) {
            if (!fk.field_gb.e(100)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          je.a((byte) -44);
          if (fk.field_gb != null) {
            if (!fk.field_gb.e(100)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 > -122) {
            field_c = null;
        }
    }

    final static void a(int param0, int param1, boolean param2, byte[] param3, int param4, boolean param5) {
        oq var6 = null;
        int var7 = 0;
        int var8 = 0;
        oq stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        oq stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        oq stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        oq stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        oq stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        oq stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        oq stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        oq stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        oq stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        oq stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        oq stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        oq stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        var6 = ej.field_j;
        var6.b(param5, param0);
        var6.field_v = var6.field_v + 1;
        var7 = var6.field_v;
        var6.a(4, false);
        var6.a(param1, param5);
        var8 = param4;
        if (param2) {
          L0: {
            // wide iinc 8 128
            var6.a(var8, param5);
            var6.a(param3, (byte) 0, 0, param3.length);
            stackOut_5_0 = (oq) var6;
            stackOut_5_1 = var6.field_v - var7;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5) {
              stackOut_7_0 = (oq) (Object) stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (oq) (Object) stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          ((oq) (Object) stackIn_8_0).b(stackIn_8_1, stackIn_8_2 != 0);
          return;
        } else {
          L1: {
            var6.a(var8, param5);
            var6.a(param3, (byte) 0, 0, param3.length);
            stackOut_1_0 = (oq) var6;
            stackOut_1_1 = var6.field_v - var7;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (param5) {
              stackOut_3_0 = (oq) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L1;
            } else {
              stackOut_2_0 = (oq) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L1;
            }
          }
          ((oq) (Object) stackIn_4_0).b(stackIn_4_1, stackIn_4_2 != 0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Click or press F10 to open Quick Chat";
        field_b = "Tips";
        field_a = "To enter <u=ffffff>shot mode</u>: <col=99ff99>Press</col> <img=4>, or <img=0> click on the cue ball once.";
    }
}
