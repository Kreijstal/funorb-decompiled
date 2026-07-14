/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static int field_h;
    int field_b;
    static String field_c;
    int field_f;
    static int[] field_g;
    int field_d;
    int field_j;
    static int[] field_e;
    int field_i;
    String field_a;

    final static void a(int param0) {
        bn.c(0);
        vf.a((byte) -117, 4);
        if (param0 != 1849965346) {
            bd.b(51);
        }
    }

    final static void a(kg param0, byte param1) {
        int var2 = 0;
        qg.field_h = param0.a((byte) 25) << 877770405;
        var2 = param0.c(32);
        eh.field_R = (7 & var2) << -332183886;
        qg.field_h = qg.field_h + (var2 >> 32047843);
        eh.field_R = eh.field_R + (param0.a((byte) 25) << 1849965346);
        var2 = param0.c(32);
        eh.field_R = eh.field_R + (var2 >> -1336201530);
        ll.field_d = var2 << 497640463 & 2064384;
        ll.field_d = ll.field_d + (param0.c(32) << -96225913);
        var2 = param0.c(32);
        ll.field_d = ll.field_d + (var2 >> -1753590527);
        dj.field_gb = var2 << -1199372112 & 65536;
        dj.field_gb = dj.field_gb + param0.a((byte) 25);
        if (param1 != -45) {
          bd.b(112);
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_e = null;
        field_c = null;
        if (!param0) {
            field_c = null;
        }
    }

    bd(int param0, String param1, ok param2) {
        ((bd) this).field_d = param0;
        ((bd) this).field_a = param1;
        ((bd) this).field_f = 100 + param2.c(((bd) this).field_a);
        ((bd) this).field_i = 30;
    }

    final static void b(int param0) {
        qm.field_z = null;
        if (param0 != -4487) {
            return;
        }
        gh.field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading extra data";
        field_g = new int[128];
    }
}
