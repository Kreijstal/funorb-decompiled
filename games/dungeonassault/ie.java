/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends ne {
    gd field_m;
    static int[] field_k;
    static cn field_l;
    static cn field_i;
    static String field_n;
    static String[] field_j;

    ie(gd param0) {
        try {
            ((ie) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ie.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        i var1 = null;
        if (param0 < 89) {
          L0: {
            field_l = null;
            var1 = (i) (Object) cd.field_g.c(0);
            if (var1 == null) {
              var1 = new i();
              break L0;
            } else {
              break L0;
            }
          }
          var1.a(gf.field_c, gf.field_e, gf.field_j, gf.field_f, gf.field_h, gf.field_i, false, gf.field_b);
          id.field_e.a((ne) (Object) var1, false);
          return;
        } else {
          L1: {
            var1 = (i) (Object) cd.field_g.c(0);
            if (var1 == null) {
              var1 = new i();
              break L1;
            } else {
              break L1;
            }
          }
          var1.a(gf.field_c, gf.field_e, gf.field_j, gf.field_f, gf.field_h, gf.field_i, false, gf.field_b);
          id.field_e.a((ne) (Object) var1, false);
          return;
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_i = null;
        field_n = null;
        field_k = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[8192];
        field_l = new cn(270, 70);
        field_n = "Unknown";
        field_j = new String[]{"Introduction", "Story", "Renown", "Raiders", "Dungeon Rooms", "Finding Dungeons", "Raiding Dungeons", "Building Dungeons"};
    }
}
