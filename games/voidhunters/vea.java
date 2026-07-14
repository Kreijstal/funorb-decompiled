/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vea extends rqa {
    private static long[] field_o;
    static soa field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_o = null;
        }
        return new nc(ceb.field_p);
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 0) {
            field_o = null;
        }
    }

    vea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_o = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 <= -257) {
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 <= var3) {
                field_o[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L != (var0 & 1L)) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 885506881 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
