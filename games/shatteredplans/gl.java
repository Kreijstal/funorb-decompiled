/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_f;
    static bi field_h;
    static boolean field_e;
    int field_c;
    static String field_b;
    static String field_a;
    int field_g;
    int field_d;

    public static void a(int param0) {
        if (param0 <= 85) {
          gl.a(80);
          field_h = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_h = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static qh a(int param0, int param1) {
        eq.field_k = new qh(0, -((4 + kb.field_y.field_o) * param0) + 451, 200, (kb.field_y.field_o + 4) * param0 - -28, ba.field_a.toUpperCase());
        fe var2 = new fe(184 + eq.field_k.field_k, 2 + eq.field_k.field_t, 11, 11, -1, (bi) null, "X", 16711680);
        var2.field_h = (Object) (Object) eq.field_k;
        eq.field_k.a((vd) (Object) var2, 8);
        lp var3 = new lp(9 + eq.field_k.field_k, 20 + eq.field_k.field_t, 182, (4 + kb.field_y.field_o) * param0);
        eq.field_k.a((vd) (Object) var3, 8);
        eq.field_k.field_z = var3;
        return eq.field_k;
    }

    final static void a(byte param0) {
        int fieldTemp$0 = di.field_m + 1;
        di.field_m = di.field_m + 1;
        if (!(fieldTemp$0 != 350)) {
            jc.a(-1, (byte) -114);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have withdrawn your request to join.";
        field_a = "Create unrated game";
        field_h = null;
    }
}
