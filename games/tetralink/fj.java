/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    boolean field_l;
    static String field_d;
    int[] field_a;
    String field_n;
    int field_j;
    String field_e;
    static String field_t;
    int field_i;
    static String field_m;
    String field_c;
    int field_k;
    static int[] field_p;
    static hl field_b;
    int field_g;
    static oh[] field_q;
    long field_r;
    static boolean field_o;
    hl field_f;
    String field_h;
    int field_s;

    final int a(byte param0) {
        if (!((fj) this).field_l) {
            // if_icmpne L31
            // if_icmplt L29
        } else {
            return 2;
        }
        if (oj.field_c == ((fj) this).field_r) {
            return 1;
        }
        if (param0 != -63) {
            int discarded$0 = ((fj) this).a((byte) -16);
        }
        if ((ji.field_Tb ^ -1) == -3) {
            if (oj.a(1, ((fj) this).field_n)) {
                return 1;
            }
        }
        return 0;
    }

    public static void a(int param0) {
        field_p = null;
        field_m = null;
        field_t = null;
        field_b = null;
        int var1 = 95 % ((-43 - param0) / 40);
        field_q = null;
        field_d = null;
    }

    fj(boolean param0) {
        ((fj) this).field_j = vi.field_c;
        ((fj) this).field_k = og.field_i;
        ((fj) this).field_n = TetraLink.field_M;
        ((fj) this).field_g = hg.field_a;
        ((fj) this).field_e = g.field_O;
        ((fj) this).field_s = n.field_O;
        ((fj) this).field_h = ml.field_fb;
        ((fj) this).field_c = ab.field_U;
        if (param0) {
            ((fj) this).field_a = ha.field_i;
        } else {
            ((fj) this).field_a = null;
        }
        ((fj) this).field_r = el.field_tc;
        ((fj) this).field_l = bo.field_s;
        ((fj) this).field_i = ng.field_u;
    }

    fj(int param0, String param1, int param2, String param3, String param4) {
        ((fj) this).field_j = param2;
        ((fj) this).field_r = 0L;
        ((fj) this).field_l = true;
        ((fj) this).field_n = param1;
        ((fj) this).field_a = null;
        ((fj) this).field_k = 0;
        ((fj) this).field_s = 0;
        ((fj) this).field_g = 0;
        ((fj) this).field_e = param1;
        ((fj) this).field_c = param3;
        ((fj) this).field_i = param0;
        ((fj) this).field_h = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = "Show chat";
        field_t = "Show game chat from my friends";
    }
}
