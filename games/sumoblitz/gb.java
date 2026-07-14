/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends nt {
    private boolean field_u;
    static il field_t;
    static long field_s;

    gb(int param0, int param1, int param2) {
        super(30, param0, param1, param2);
        ((gb) this).field_u = false;
    }

    public static void e(int param0) {
        if (param0 != 0) {
            return;
        }
        field_t = null;
    }

    final void a(ha param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var3 = (int)(255.0 * ((double)((gb) this).field_p / 30.0));
        var4 = 0;
        if (param1 > -121) {
          return;
        } else {
          L0: {
            if (!((gb) this).field_u) {
              var4 = (int)(8192.0 * ((double)((gb) this).field_p / 30.0));
              break L0;
            } else {
              var4 = (int)((double)(30 - ((gb) this).field_p) / 30.0 * 8192.0);
              break L0;
            }
          }
          var4 = var4 * 2;
          am.field_j[4].a((float)(((gb) this).field_k >> 167752904), (float)(((gb) this).field_o >> 1969306952), var4, 0, 1, var3 << -694286696, 1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new il();
    }
}
