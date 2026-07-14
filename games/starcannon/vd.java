/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends hh {
    static String[] field_h;
    private String field_k;
    private String field_i;
    static String[] field_f;
    static String field_e;
    static long[] field_g;
    static int field_j;

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_g = null;
        if (param0 != 32) {
            return;
        }
        field_f = null;
    }

    final s b(byte param0) {
        if (param0 != 1) {
            field_g = null;
            return j.field_d;
        }
        return j.field_d;
    }

    vd(String param0, String param1) {
        ((vd) this).field_k = param0;
        ((vd) this).field_i = param1;
    }

    final void a(byte param0, rb param1) {
        param1.a(false, ((vd) this).field_k);
        param1.a((byte) -86, ((vd) this).field_i);
        if (param0 != 69) {
            field_g = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"Defend the solar system on Easy mode", "Defeat the alien fleet on Medium mode", "Destroy the alien homeworld on Medium mode", "Defeat the alien fleet on Hard mode", "Destroy the alien homeworld on Hard mode", "Defeat the alien revenge fleet", "Max out side and back guns", "Destroy 10 cruisers", "Destroy 30 cruisers", "Destroy 50 interceptors", "Destroy 150 interceptors", "Navigate through the solar system without firing a shot", "Score 50,000 Points", "Score 100,000 Points", "Score 200,000 Points"};
        field_g = new long[32];
    }
}
