/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends r {
    static java.awt.Color field_p;
    static int[][] field_s;
    static int field_o;
    static String field_r;
    static String field_q;
    static String field_n;

    final wd a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var4 = (CharSequence) (Object) param1;
        if (!ii.a(12969, var4)) {
          return ml.field_K;
        } else {
          if (param0 == 160) {
            var6 = (CharSequence) (Object) param1;
            var3 = pl.a(var6, -9816);
            if (-1 > var3) {
              if (-131 < var3) {
                return ml.field_K;
              } else {
                return hm.field_b;
              }
            } else {
              return ml.field_K;
            }
          } else {
            ga.c((byte) -73);
            var5 = (CharSequence) (Object) param1;
            var3 = pl.a(var5, -9816);
            if (-1 > var3) {
              if (-131 < var3) {
                return ml.field_K;
              } else {
                return hm.field_b;
              }
            } else {
              return ml.field_K;
            }
          }
        }
    }

    final String a(byte param0, String param1) {
        if (((ga) this).a(160, param1) == ml.field_K) {
            return h.field_a;
        }
        int var3 = 83 % ((param0 - 24) / 46);
        return null;
    }

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
        if (param0 <= 111) {
          field_o = 23;
          field_n = null;
          field_s = null;
          field_r = null;
          return;
        } else {
          field_n = null;
          field_s = null;
          field_r = null;
          return;
        }
    }

    ga(c param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new java.awt.Color(10040319);
        field_r = "<%0>Fans:<%1> These blow fleas to the sides.";
        field_n = "Play the game without logging in just yet";
        field_s = new int[][]{new int[3], new int[8], new int[7], new int[8], new int[7], new int[3], new int[4]};
        field_q = "Sometimes you will find that you want to place a tile to keep the fleas on one side of a large area, but they are too spread out for this to work. When this happens, try shrinking the space gradually by placing tiles from the edge towards the middle.";
    }
}
