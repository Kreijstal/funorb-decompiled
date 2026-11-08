/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static byte[][] field_b;
    static volatile int field_a;
    static String textRankingsBywinpercentage;
    static String field_c;

    final static void a(float param0, boolean param1, boolean param2, String param3) {
        try {
          if (null == md.field_i) {
            md.field_i = new vc(tm.field_l, vd.field_X);
            tm.field_l.a(0, md.field_i);
          }
          md.field_i.a(param0, false, param2, param3);
          Rasterizer.clear();
          ci.b(param1, -127);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "sm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        textRankingsBywinpercentage = null;
        field_b = (byte[][]) null;
        field_c = null;
    }

    static {
        field_b = new byte[250][];
        textRankingsBywinpercentage = "By win %";
        field_a = -1;
        field_c = "Match by...";
    }
}
