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
        Object var2 = null;
        field_g = null;
        field_j = null;
        if (param0) {
          var2 = null;
          gj.a((ki) null, (byte) -123, (ki) null, true, (ki) null);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static boolean c(int param0) {
        if (param0 != 1024) {
            return false;
        }
        return null != od.field_f ? true : false;
    }

    final static void a(ki param0, byte param1, ki param2, boolean param3, ki param4) {
        bd.field_u = hg.a("", (byte) 113);
        bd.field_u.a(false, (byte) -114);
        int var5 = -57 / ((-43 - param1) / 60);
        dj.a(param2, (byte) 122, param4, param0);
        sd.a(125);
        tg.field_c = tl.field_h;
        qc.field_g = tl.field_h;
    }

    final static void a(int param0, lj param1, boolean param2, int param3, java.awt.Component param4, be param5) {
        fg.a(param0, param3, param0, param4, param5, true, param1, param2);
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
