/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends ca {
    static java.awt.Image field_f;
    long[][] field_p;
    int field_o;
    boolean field_h;
    static pf field_g;
    String[][] field_i;
    static boolean field_k;
    static String[] field_j;
    int field_n;
    int field_m;
    int[][] field_l;

    public static void c(boolean param0) {
        field_g = null;
        field_j = null;
        field_f = null;
    }

    final static boolean c() {
        return null != od.field_f;
    }

    final static void a(ki param0, byte param1, ki param2, boolean param3, ki param4) {
        try {
            int discarded$0 = 113;
            bd.field_u = hg.a("");
            bd.field_u.a(false, (byte) -114);
            int var5_int = 57;
            dj.a(param2, (byte) 122, param4, param0);
            sd.a(125);
            tg.field_c = tl.field_h;
            qc.field_g = tl.field_h;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "gj.D(" + (param0 != null ? "{...}" : "null") + 44 + 33 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, lj param1, boolean param2, int param3, java.awt.Component param4, be param5) {
        try {
            int discarded$0 = 1;
            fg.a(22050, 1024, 22050, param4, param5, true, param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "gj.B(" + 22050 + 44 + (param1 != null ? "{...}" : "null") + 44 + 1 + 44 + 1024 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    gj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_j = new String[]{"Noobo", "Swarmo", "Zoomo", "Tougho", "Bombo", "Flybo", "Chompo", "Irono", "Awesomeo", "Fast Blaster", "Chain Shooter", "Big Blammer", "Beam Burner", "Boss Splorber", "Boss Blorber", "Boss Annihorber", "Playing with Fire", "Orb Evasion", "Shock Horror", "On the Fence", "Sneako", "Splitto", "Orb Defender", "Ghost-free Zone"};
    }
}
