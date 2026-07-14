/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dw implements wwa {
    static int field_b;
    static int[] field_a;
    static dfa field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < 113) {
            field_a = null;
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        phb var8 = null;
        int var9 = 0;
        var6 = param1.field_g + param2;
        var7 = param3 - -param1.field_r;
        npa.a(var7, (byte) 115, param1.field_f, param1.field_h, var6);
        var8 = ps.field_a[1];
        if (param1 instanceof htb) {
          if (!((htb) (Object) param1).field_u) {
            L0: {
              if (param1.e((byte) -120)) {
                aha.a(var7 + 2, param1.field_h - 4, var6 + 2, -4 + param1.field_f, (byte) -62);
                break L0;
              } else {
                break L0;
              }
            }
            var9 = -1 / ((-27 - param0) / 35);
            return;
          } else {
            L1: {
              var8.c((-var8.field_m + param1.field_h >> 695876833) + (1 + var6), 1 + (var7 + (-var8.field_n + param1.field_f >> -562634783)), 256);
              if (param1.e((byte) -120)) {
                aha.a(var7 + 2, param1.field_h - 4, var6 + 2, -4 + param1.field_f, (byte) -62);
                break L1;
              } else {
                break L1;
              }
            }
            var9 = -1 / ((-27 - param0) / 35);
            return;
          }
        } else {
          L2: {
            if (param1.e((byte) -120)) {
              aha.a(var7 + 2, param1.field_h - 4, var6 + 2, -4 + param1.field_f, (byte) -62);
              break L2;
            } else {
              break L2;
            }
          }
          var9 = -1 / ((-27 - param0) / 35);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 10;
        field_c = new dfa();
    }
}
