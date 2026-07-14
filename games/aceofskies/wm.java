/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends o {
    static pa[] field_i;
    static int field_h;
    int field_k;
    private static long[] field_l;
    int field_g;
    static int field_j;

    public static void b(int param0) {
        field_i = null;
        if (param0 != 256) {
            field_l = (long[]) null;
        }
        field_l = null;
    }

    public wm() {
        super(new kc(0.0, 0.0));
        ((wm) this).field_g = 0;
        ((wm) this).field_k = 0;
    }

    final void a(int param0, int param1, kc param2) {
        ((wm) this).field_d.a(param2, true);
        ((wm) this).field_g = 400;
        if (param1 > -97) {
            wm.b(-119);
        }
        ((wm) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_h = 4;
        field_l = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_j = 10;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_l[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L ^ -1L) == -2L) {
                  var0 = var0 >>> -1215380543 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
