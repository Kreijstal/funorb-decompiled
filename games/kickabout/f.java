/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static int field_a;
    static String field_b;
    static boolean field_c;
    static int field_d;

    final static int a(byte param0, int param1, int param2, int param3, int param4) {
        ut var5 = null;
        L0: {
          if (10 > param1) {
            break L0;
          } else {
            param4 = f.a((byte) 120, param1 / 10, param2, param3, param4);
            break L0;
          }
        }
        if (param0 <= 109) {
          int discarded$1 = f.a((byte) -108, -67, -1, 23, 75);
          var5 = tb.field_q[param1 % 10];
          var5.c(-var5.field_s + param4, param3, param2);
          return var5.field_q + param4 + 3;
        } else {
          var5 = tb.field_q[param1 % 10];
          var5.c(-var5.field_s + param4, param3, param2);
          return var5.field_q + param4 + 3;
        }
    }

    final static void a(sj param0, byte param1) {
        try {
            ad.field_d[0] = qm.a(param0, "", "KaB_park_menu");
            sk.a(80, 8, 0);
            ad.field_d[1] = qm.a(param0, "", "KaB_beach_atmospherics_loop_lvl1_2");
            sk.a(73, 8, 1);
            int var2_int = -54;
            ad.field_d[2] = qm.a(param0, "", "KaB_park_atmospherics_loop_lvl1_2");
            sk.a(94, 8, 2);
            ad.field_d[3] = qm.a(param0, "", "KaB_street_atmospherics_loop_lvl1_2");
            sk.a(-119, 8, 3);
            ad.field_d[4] = qm.a(param0, "", "KaB_crowd_loop_MIDDLE_PITCH_lvl3");
            sk.a(83, 8, 4);
            ad.field_d[5] = qm.a(param0, "", "KaB_crowd_loop_END_PITCH_lvl3");
            sk.a(98, 8, 5);
            ad.field_d[6] = qm.a(param0, "", "KaB_crowd_loop_MIDDLE_PITCH_lvl4");
            sk.a(-53, 8, 6);
            ad.field_d[7] = qm.a(param0, "", "KaB_crowd_loop_END_PITCH_lvl4");
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "f.C(" + (param0 != null ? "{...}" : "null") + 44 + -122 + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 104;
        field_b = "Buyout smaller than Bid";
    }
}
