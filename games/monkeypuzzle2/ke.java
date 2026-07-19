/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static volatile int field_g;
    static le field_i;
    static int field_c;
    static int[] field_b;
    static boolean field_a;
    static na field_d;
    static le[] field_f;
    static String field_e;
    static td[] field_h;

    public static void a(boolean param0) {
        field_i = null;
        field_b = null;
        field_d = null;
        field_e = null;
        field_f = null;
        if (param0) {
            return;
        }
        field_h = null;
    }

    final static void b(int param0) {
        he var3 = null;
        if (param0 == 8192) {
          var3 = (he) ((Object) mb.field_e.a((byte) -117));
          var3 = var3;
          if (var3 != null) {
            qc.field_N = 0;
            em.field_B = 480;
            pl.field_j = pl.field_e.b(rb.field_hb[var3.field_h], 100) + 72;
            ii.field_B = 30 + pl.field_e.a(rb.field_hb[var3.field_h], 100) * (pl.field_e.field_D + pl.field_e.field_C);
            if ((ii.field_B ^ -1) <= -63) {
              return;
            } else {
              ii.field_B = 62;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0) {
        int var1 = 51 % ((5 - param0) / 32);
        return fk.field_a;
    }

    final static void a(String param0, byte param1) {
        System.out.println("Error: " + eg.a("\n", 4, "%0a", param0));
        if (param1 < 7) {
            field_a = false;
        }
    }

    static {
        field_g = 0;
        field_b = new int[8192];
        field_e = "Player Name: ";
        field_h = new td[32];
        field_d = new na();
    }
}
