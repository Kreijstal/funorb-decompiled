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
        ut var5Lifetime1;
        if (10 <= param1) {
          param4 = f.$cfr$intArgs$a$8e2a9e3a0d15(120, param1 / 10, param2, param3, param4);
        }
        if (param0 > 109) {
          var5 = tb.field_q[param1 % 10];
          var5.c(-var5.field_s + param4, param3, param2);
          return var5.field_q + param4 + 3;
        }
        f.$cfr$intArgs$a$8e2a9e3a0d15(-108, -67, -1, 23, 75);
        var5Lifetime1 = tb.field_q[param1 % 10];
        var5Lifetime1.c(-var5Lifetime1.field_s + param4, param3, param2);
        return var5Lifetime1.field_q + param4 + 3;
    }

    final static void a(sj param0, byte param1) {
        try {
          ad.field_d[0] = qm.a(param0, "", "KaB_park_menu");
          sk.a(80, 8, 0);
          ad.field_d[1] = qm.a(param0, "", "KaB_beach_atmospherics_loop_lvl1_2");
          sk.a(73, 8, 1);
          int var2_int = 109 / ((param1 - 28) / 61);
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
          throw nb.a((Throwable) ((Object) runtimeException), "f.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -71) {
          field_c = true;
        }
    }

    static {
        field_a = 104;
        field_b = "Buyout smaller than Bid";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$8e2a9e3a0d15(int param0, int param1, int param2, int param3, int param4) {
        ut var5 = null;
        ut var5Lifetime1;
        if (10 <= param1) {
          param4 = f.$cfr$intArgs$a$8e2a9e3a0d15(120, param1 / 10, param2, param3, param4);
        }
        if (param0 > 109) {
          var5 = tb.field_q[param1 % 10];
          var5.c(-var5.field_s + param4, param3, param2);
          return var5.field_q + param4 + 3;
        }
        f.$cfr$intArgs$a$8e2a9e3a0d15(-108, -67, -1, 23, 75);
        var5Lifetime1 = tb.field_q[param1 % 10];
        var5Lifetime1.c(-var5Lifetime1.field_s + param4, param3, param2);
        return var5Lifetime1.field_q + param4 + 3;
    }
}
