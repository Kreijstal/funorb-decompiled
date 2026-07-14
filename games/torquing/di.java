/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends af {
    static int[] field_e;
    static String field_c;
    private sm field_d;

    final static void a(int param0, byte param1, int param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        param0--;
        param4--;
        var5 = param4 + -7;
        L0: while (true) {
          if (var5 > param0) {
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            continue L0;
          } else {
            L1: while (true) {
              if (param0 >= param4) {
                var6 = -59 / ((-50 - param1) / 39);
                return;
              } else {
                param0++;
                param3[param0] = param2;
                continue L1;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_e = null;
        if (param0 == -7) {
            return;
        }
        Object var2 = null;
        di.a(-29, (byte) -24, 121, (int[]) null, -98);
    }

    final void b(int param0) {
        if (param0 != 6) {
            ((di) this).b(77);
            ((di) this).field_d.a(0, 0);
            return;
        }
        ((di) this).field_d.a(0, 0);
    }

    final static dn a(int param0, String[] param1) {
        dn var2 = new dn(false);
        var2.field_d = param1;
        if (param0 != 0) {
            field_c = null;
            return var2;
        }
        return var2;
    }

    di(sm param0) {
        ((di) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "OVER <%0>";
    }
}
