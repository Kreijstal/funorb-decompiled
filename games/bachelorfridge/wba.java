/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wba {
    static IntrusiveDeque field_g;
    int field_b;
    static vr field_f;
    static String[] field_a;
    static MusicTrack[] field_e;
    static int field_c;
    static String field_d;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        int var1 = 2 % ((-21 - param0) / 33);
        field_g = null;
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    wba(int param0) {
        this.field_b = param0;
    }

    static {
        field_g = new IntrusiveDeque();
        field_c = 0;
        field_e = new MusicTrack[3];
        field_d = "Report <%0> for abuse";
    }
}
