/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static String field_d;
    static String field_h;
    static int field_b;
    static int field_f;
    static int field_e;
    static boolean field_a;
    static qc field_c;
    static int field_i;
    static String[] field_g;

    final static void a(String param0, int param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        mi.field_I = stackIn_3_0 != 0;
        if (param1 != 480) {
          return;
        } else {
          va.field_d = true;
          Geoblox.field_y = new f(kd.field_e, hh.field_c, param0, cf.field_i, mi.field_I);
          kd.field_e.a(false, (el) (Object) Geoblox.field_y);
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 30970) {
            return;
        }
        field_h = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 60;
        field_f = 14;
        field_d = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_h = "Names cannot contain consecutive spaces";
        field_e = 0;
        field_i = 480;
        field_g = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
