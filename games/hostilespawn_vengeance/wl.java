/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static int[] field_d;
    static bm field_c;
    static String field_a;
    static boolean field_b;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 < 109) {
          wl.a(58);
        }
    }

    final static int b(int param0) {
        int var2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          var1_int = 0;
          for (var2 = 0; var2 < 6; var2++) {
            var1_int = var1_int + al.field_U[var2];
          }
          if (param0 != 25685) {
            wl.c(-10);
          }
          stackIn_7_0 = var1_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "wl.B(" + param0 + ')');
        }
    }

    final static na c(int param0) {
        if (param0 == 11) {
          if (q.field_j == null) {
            q.field_j = new na();
            q.field_j.a(jd.field_s, (byte) 99);
            q.field_j.field_a = 2763306;
            q.field_j.field_f = 7697781;
            q.field_j.field_i = jn.field_G;
            q.field_j.field_l = 4;
            q.field_j.field_g = 5;
            q.field_j.field_o = 14;
            q.field_j.field_p = 6;
            q.field_j.field_r = 0;
          }
          return q.field_j;
        }
        return (na) null;
    }

    static {
        field_d = new int[]{0, 3, 33, 2, 14, 11};
        field_a = "Selects your primary weapon, or left-click on the weapon in your HUD.";
        field_c = new bm();
    }
}
