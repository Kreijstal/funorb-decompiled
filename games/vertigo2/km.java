/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends gp {
    static int field_x;
    static String field_u;
    byte[] field_t;
    static String[] field_w;
    static String field_v;

    final static void a(String param0, boolean param1, boolean param2, String param3) {
        ff.field_u = param3;
        fi.field_e = param0;
        fi.a(31820, param1, gn.field_a);
        if (!param2) {
            km.h(-35);
        }
    }

    public static void h(int param0) {
        field_w = null;
        field_u = null;
        if (param0 < 7) {
            km.i(119);
            field_v = null;
            return;
        }
        field_v = null;
    }

    km(byte[] param0) {
        ((km) this).field_t = param0;
    }

    final static void i(int param0) {
        int var1 = (qg.field_G + -640) / 2;
        int var2 = ld.field_b * ld.field_b;
        int var3 = var2 - rk.field_y * rk.field_y;
        ca.field_h.a(param0 + -100, 199, bi.field_j - 214, 90, -(var3 * 199 / var2) + var1);
        ud.field_A.a(80, 438, -124 + bi.field_j, 0, 438 * var3 / var2 + (var1 + param0));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 500;
        field_u = "Play time:";
        field_w = new String[]{"&***", "none", "can", "pole", "explain", "goblin", "oak", "jungle", "ensure", "pond", "shine", "groom", "dolphin", "sud", "nile", "softy", "stoop", "helmet", "tom", "bolter", "cloudy", "bap", "buzz", "napkin", "wave", "qed", "style", "judo", "tummy", "fable", "zebra", "vote", "harpy", "puma", "haze", "ginger", "squelch", "threat", "hunting", "sid", "clan", "misty", "ribbon", "daisy", "crown", "candy", "timber", "group", "grail", "burnt", "untidy"};
        field_v = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
