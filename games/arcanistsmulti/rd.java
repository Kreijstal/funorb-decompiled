/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd implements qi {
    static int field_a;
    static String field_f;
    static int field_b;
    static String field_c;
    static String field_d;
    static int[] field_e;

    final static ma b(int param0) {
        if (param0 == -15438) {
          return new ma(0, 0, MusicCrossfadeStream.field_n.field_p, 0, (WidgetPainter) null, MusicCrossfadeStream.field_n.field_x, MusicCrossfadeStream.field_n.field_g, MusicCrossfadeStream.field_n.field_p, MusicCrossfadeStream.field_n.field_p, MusicCrossfadeStream.field_n.field_z, MusicCrossfadeStream.field_n.field_j, false, true, 32768, 0);
        }
        field_f = (String) null;
        return new ma(0, 0, MusicCrossfadeStream.field_n.field_p, 0, (WidgetPainter) null, MusicCrossfadeStream.field_n.field_x, MusicCrossfadeStream.field_n.field_g, MusicCrossfadeStream.field_n.field_p, MusicCrossfadeStream.field_n.field_p, MusicCrossfadeStream.field_n.field_z, MusicCrossfadeStream.field_n.field_j, false, true, 32768, 0);
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_f = null;
        field_d = null;
        field_c = null;
        if (param0 != 0) {
          field_f = (String) null;
        }
    }

    public final void a(int param0, int param1, int param2) {
        ri.a(param0, 2, param1);
        int var4 = 27 / ((59 - param2) / 47);
    }

    static {
        field_f = "Show players in <%0>'s game";
        field_c = "<%0> is not on your friend list.";
        field_e = new int[]{1, 1, 3, 3, 2, 2, 4, 2, 3, 2, 3, 3, 0, 1, 0, 0, 3, 2, 0, 0, 2, 2, 2, 4, 0, 0, 3, 0, 0, 0, 2, 3, 4, 4, 2, 2, 0, 0, 3, 3, 0, 3, 4, 0, 4, 3, 2, 4, 0, 0, 0, 1, 0, 2, 3, 3, 4, 4, 2, 4, 3, 2, 0, 0, 4, 4, 0, 4, 2, 3, 3, 3, 3, 2, 0, 2, 4, 4, 2, 4, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 4, 3, 4, 2, 2, 3, 0, 2, 4, 0, 2, 2, 0, 0, 4, 2, 3, 4, 0, 3, 1, 2, 4, 0, 3, 0, 0, 0, 4, 3, 3, 1, 0, 3, 2, 3, 0, 0, 0, 0, 2, 0, 2, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 2, 0, 2, 3, 3, 3, 3, 3};
        field_d = "Rating";
    }
}
