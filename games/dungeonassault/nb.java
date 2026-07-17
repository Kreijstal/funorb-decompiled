/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static la[] field_a;
    static String field_c;
    static cn field_d;
    static int[] field_e;
    static String field_b;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void a(int param0) {
        if (param0 != 22) {
            return;
        }
        if (wh.field_d) {
            return;
        }
        wh.field_d = rf.field_S;
        if (!(!wh.field_d)) {
            ck.h(94);
            bo.g(1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Giant whirling blades concealed in the floor and walls of this room will slice less nimble raiders into chunks.<br><br>Trapped raiders permanently lose 3 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        field_e = new int[]{5, 6, 22, 23, 9};
        field_b = "Loading animations";
    }
}
