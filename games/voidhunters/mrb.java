/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mrb extends rqa {
    mrb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              si.a(73, 62, param0[0].a(96));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("mrb.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, String param7, int param8) {
        hp.field_b.field_R = param7;
        if ((ow.field_b ^ -1) != -3) {
            dp.field_a.field_R = nh.field_o;
        } else {
            dp.field_a.field_R = pgb.field_l;
        }
        int var9_int = 495;
        int var10 = 5;
        gba.field_p.a(5, 117, -10 + var9_int, var10, param6);
        bpa.field_c.a(0, 118, -fgb.field_l.field_hb + gba.field_p.field_hb, 0, param6);
        var10 = var10 + (param8 + param6);
        fgb.field_l.a(bpa.field_c.field_hb, 125, fgb.field_l.field_hb, 0, param6);
        fhb.field_q.a(5, 118, fhb.field_q.e(26), var10, param5);
        int var11 = dp.field_a.e(49);
        dp.field_a.a(-5 + (var9_int + -var11), 29, var11, var10, param5);
        int var12 = param5 + (var10 + 5);
        hp.field_b.a(0, -69, var9_int, 0, param2);
        me.field_s.a(0, 125, var9_int, param2, var12);
        me.field_s.field_gb = uwa.a(11579568, me.field_s.field_G, 2105376, 8421504, 92, 3);
        var12 = var12 + param2;
        if (param4) {
            return;
        }
        try {
            qw.field_l.a(param3 + -(var9_int / 2), -99, var9_int, -(var12 / 2) + param1, var12);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mrb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    static {
    }
}
