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
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        i var1 = null;
        i var1Lifetime1;
        if (param0 >= 89) {
          var1 = (i) (cd.field_g.c(0));
          if (var1 == null) {
            var1 = new i();
          }
          var1.a(gf.field_c, gf.field_e, gf.field_j, gf.field_f, gf.field_h, gf.field_i, false, gf.field_b);
          id.field_e.a(var1, false);
          return;
        }
        field_l = (cn) null;
        var1Lifetime1 = (i) (cd.field_g.c(0));
        if (var1Lifetime1 == null) {
          var1Lifetime1 = new i();
        }
        var1Lifetime1.a(gf.field_c, gf.field_e, gf.field_j, gf.field_f, gf.field_h, gf.field_i, false, gf.field_b);
        id.field_e.a(var1Lifetime1, false);
    }

    public static void d(int param0) {
        field_j = null;
        field_i = null;
        field_n = null;
        field_k = null;
        field_l = null;
        if (param0 >= -33) {
          ie.a(54);
        }
    }

    static {
        field_k = new int[8192];
        field_l = new cn(270, 70);
        field_n = "Unknown";
        field_j = new String[]{"Introduction", "Story", "Renown", "Raiders", "Dungeon Rooms", "Finding Dungeons", "Raiding Dungeons", "Building Dungeons"};
    }
}
