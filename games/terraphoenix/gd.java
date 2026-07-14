/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static int[][] field_a;
    private boolean field_f;
    static String field_b;
    static int[] field_e;
    private String field_g;
    static String field_d;
    static int field_c;

    final String a(int param0) {
        int var2 = 43 / ((param0 - 63) / 45);
        return ((gd) this).field_g;
    }

    gd(String param0) {
        this(param0, false);
    }

    final boolean c(int param0) {
        if (param0 != 1) {
            ((gd) this).field_g = null;
            return ((gd) this).field_f;
        }
        return ((gd) this).field_f;
    }

    public static void b(int param0) {
        if (param0 != 25284) {
            return;
        }
        field_d = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    gd(String param0, boolean param1) {
        ((gd) this).field_g = param0;
        ((gd) this).field_f = param1 ? true : false;
        if (((gd) this).field_g == null) {
            ((gd) this).field_g = "";
        }
        if (-1 == (((gd) this).field_g.length() ^ -1)) {
            ((gd) this).field_f = false;
        }
    }

    final static void a(int param0, ci[] param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Terraphoenix.field_V;
        if (param3 >= 114) {
          if (param1 != null) {
            if (-1 <= (param4 ^ -1)) {
              return;
            } else {
              var5 = param1[0].field_q;
              var6 = param1[2].field_q;
              var7 = param1[1].field_q;
              param1[0].b(param2, param0);
              param1[2].b(param2 + param4 + -var6, param0);
              l.b(vl.field_e);
              l.i(param2 + var5, param0, param2 - (-param4 + var6), param0 + param1[1].field_u);
              var8 = param2 + var5;
              var9 = -var6 + (param2 - -param4);
              param2 = var8;
              L0: while (true) {
                if (var9 <= param2) {
                  l.a(vl.field_e);
                  return;
                } else {
                  param1[1].b(param2, param0);
                  param2 = param2 + var7;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Back";
        field_a = new int[640][480];
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_e = new int[8192];
    }
}
