/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fh {
    private static String[] field_f;
    static ia[] field_e;
    static int[] field_d;
    static boolean field_a;
    private static String[] field_h;
    private static String[] field_b;
    private static String[] field_i;
    static String[][] field_c;
    static ih field_g;

    public static void a(byte param0) {
        field_i = null;
        field_f = null;
        field_b = null;
        field_h = null;
        field_d = null;
        field_g = null;
        field_c = null;
        field_e = null;
    }

    abstract byte[] a(int param0);

    final static void b(int param0) {
        lj.a(17, 27);
    }

    abstract void a(boolean param0, byte[] param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Eggtimer", "FuelEconomy", "13", "TunnelPractice", "TunnelsOfDestruction", "GunRunner", "TwistsAndTurns", "EscapeToVectory", "passages", "CavernOfDestruction", "15", "GunCaves", "Spelunking", "rorschach", "ContainmentNetwork", "DendriticDestruction"};
        field_d = new int[]{2, 3, 4};
        field_h = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
        field_i = new String[]{"antigrav", "Breach", "cataclysm", "Dash", "DeepVertigo", "divided", "ExplosiveExit", "GravityChamber", "14", "orb", "pinball", "pulse", "12", "UpwardsAndOnwards", "AsteroidsNormal", "Asteroids"};
        field_b = field_h;
        field_c = new String[][]{field_b, field_h, field_f, field_i};
    }
}
