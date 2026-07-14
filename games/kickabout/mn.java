/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn implements gj {
    static rv field_c;
    static String field_d;
    static int[] field_b;
    static int field_a;
    static ff field_e;
    static String field_f;

    public static void a(byte param0) {
        int var1 = 10 % ((param0 - -5) / 42);
        field_c = null;
        field_d = null;
        field_b = null;
        field_f = null;
        field_e = null;
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ut var9 = null;
        var7 = -123 / ((59 - param0) / 53);
        var6 = param3.field_t + param4;
        var8 = param3.field_g + param2;
        kj.a(12105912, var8, var6, param3.field_i, param3.field_n);
        var9 = jc.field_g[1];
        if (param3 instanceof wi) {
          if (((wi) (Object) param3).field_A) {
            var9.c((-var9.field_o + param3.field_n >> -484312191) + (1 + var6), 1 + (var8 + (-var9.field_v + param3.field_i >> 429498401)), 256);
            if (param3.b(44)) {
              ob.b(2, param3.field_n - 4, var8 + 2, -4 + param3.field_i, 2 + var6);
              return;
            } else {
              return;
            }
          } else {
            if (param3.b(44)) {
              ob.b(2, param3.field_n - 4, var8 + 2, -4 + param3.field_i, 2 + var6);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3.b(44)) {
            ob.b(2, param3.field_n - 4, var8 + 2, -4 + param3.field_i, 2 + var6);
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Clan";
        field_a = 256;
        field_b = new int[4];
        field_c = new rv();
        field_e = new ff(11, 0, 1, 2);
        field_f = "Accept";
    }
}
