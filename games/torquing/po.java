/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends am {
    private int field_A;
    static int field_z;
    static String[] field_t;
    static int field_u;
    private int field_v;
    private int field_s;
    static volatile int field_w;
    static String field_y;
    static int[] field_x;

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        Object var5 = null;
        if (param1 != 35) {
          L0: {
            var5 = null;
            ((po) this).a((fj) null, 56, 26);
            var4 = param2;
            if (var4 == 0) {
              this.b(4080, param0.e((byte) 62));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var4 = param2;
            if (var4 == 0) {
              this.b(4080, param0.e((byte) 62));
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public po() {
        this(0);
    }

    private final void b(int param0, int param1) {
        ((po) this).field_A = (param1 & 255) << 786159204;
        ((po) this).field_v = (param1 & 16711680) >> 324326572;
        ((po) this).field_s = param1 >> -1775937404 & param0;
    }

    public static void g(byte param0) {
        field_x = null;
        int var1 = 100 % ((49 - param0) / 48);
        field_y = null;
        field_t = null;
    }

    private po(int param0) {
        super(0, false);
        this.b(4080, param0);
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[][] var9 = null;
        var8 = Torquing.field_u;
        var9 = ((po) this).field_r.a(15142, param1);
        var3 = var9;
        if (param0 == -29116) {
          if (!((po) this).field_r.field_b) {
            return var9;
          } else {
            var4 = var9[0];
            var5 = var9[1];
            var6 = var9[2];
            var7 = 0;
            L0: while (true) {
              if (ci.field_c <= var7) {
                return var9;
              } else {
                var4[var7] = ((po) this).field_v;
                var5[var7] = ((po) this).field_s;
                var6[var7] = ((po) this).field_A;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new String[3];
        field_u = -1;
        field_w = 0;
        field_z = -1;
        field_y = "Creating your account";
        field_x = new int[3];
    }
}
