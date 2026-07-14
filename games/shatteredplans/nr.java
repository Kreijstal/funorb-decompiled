/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr extends oh {
    ln field_p;
    ln[] field_j;
    static fg field_m;
    static boolean[][] field_q;
    static bi field_k;
    static String field_n;
    static String field_o;
    static String field_s;
    int[] field_i;
    static v field_h;
    static bi[] field_r;
    static qb field_l;

    public static void a(byte param0) {
        field_r = null;
        field_o = null;
        field_l = null;
        field_n = null;
        field_s = null;
        field_k = null;
        field_m = null;
        field_h = null;
        field_q = null;
        if (param0 != 48) {
            java.awt.Container discarded$0 = nr.a(-27);
        }
    }

    final static java.awt.Container a(int param0) {
        if (param0 < 53) {
            return null;
        }
        if (!(null == uf.field_b)) {
            return (java.awt.Container) (Object) uf.field_b;
        }
        return (java.awt.Container) (Object) kq.f((byte) 125);
    }

    nr(ln param0, int param1) {
        ((nr) this).field_j = null;
        ((nr) this).field_p = param0;
    }

    nr(ln param0, int[] param1, ln[] param2) {
        int var4 = 0;
        ((nr) this).field_j = param2;
        ((nr) this).field_i = param1;
        ((nr) this).field_p = param0;
        for (var4 = 0; var4 < ((nr) this).field_i.length; var4++) {
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new fg();
        field_o = "You can ask to join this game";
        field_s = "Battles won in hostile space.";
        field_n = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
