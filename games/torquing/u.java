/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends am {
    static int[] field_v;
    static vh field_t;
    static double field_s;
    static int[] field_w;
    private int field_u;

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param0 <= 86) {
          L0: {
            int[] discarded$2 = ((u) this).a((byte) 80, 91);
            var4 = ((u) this).field_l.a(param1, 25657);
            var3 = var4;
            if (((u) this).field_l.field_b) {
              dk.a(var4, 0, ci.field_c, ((u) this).field_u);
              break L0;
            } else {
              break L0;
            }
          }
          return var4;
        } else {
          L1: {
            var4 = ((u) this).field_l.a(param1, 25657);
            var3 = var4;
            if (((u) this).field_l.field_b) {
              dk.a(var4, 0, ci.field_c, ((u) this).field_u);
              break L1;
            } else {
              break L1;
            }
          }
          return var4;
        }
    }

    final static int[] a(int param0, int[] param1, int param2) {
        int[] var3 = null;
        int[] var4 = null;
        if (param0 != 32681) {
          return null;
        } else {
          var4 = new int[param2];
          var3 = var4;
          dk.a(param1, 0, var4, 0, param2);
          return var4;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = param2;
          if (0 == var4) {
            ((u) this).field_u = (param0.i((byte) -101) << 130693324) / 255;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 35) {
          int[] discarded$2 = ((u) this).a((byte) -38, 62);
          return;
        } else {
          return;
        }
    }

    public u() {
        this(4096);
    }

    private u(int param0) {
        super(0, true);
        ((u) this).field_u = 4096;
        ((u) this).field_u = param0;
    }

    public static void g(byte param0) {
        if (param0 > -41) {
          field_w = null;
          field_v = null;
          field_t = null;
          field_w = null;
          return;
        } else {
          field_v = null;
          field_t = null;
          field_w = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[1024];
        field_s = 0.0;
        field_w = new int[8192];
    }
}
