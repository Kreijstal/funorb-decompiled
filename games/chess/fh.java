/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static int field_e;
    int field_f;
    int field_c;
    static int field_b;
    static int field_d;
    int field_a;

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        int var5 = Chess.field_G;
        if (!(qm.a(param2, param0, (byte) 97))) {
            return false;
        }
        for (var3 = 0; (param0.length() ^ -1) < (var3 ^ -1); var3++) {
            if (!(am.a(-36, param0.charAt(var3)))) {
                return false;
            }
        }
        int var4 = 114 / ((param1 - 55) / 36);
        return true;
    }

    final static void a(byte param0, ln param1) {
        ln var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = Chess.field_G;
        if (param0 < -113) {
          param1.c(-2193);
          var2 = (ln) (Object) nk.field_t.g(-18110);
          L0: while (true) {
            if (var2 != null) {
              if (var2.a(-7, param1)) {
                var2 = (ln) (Object) nk.field_t.a((byte) -114);
                continue L0;
              } else {
                L1: {
                  if (var2 != null) {
                    he.a((o) (Object) param1, (o) (Object) var2, true);
                    break L1;
                  } else {
                    nk.field_t.a((o) (Object) param1, (byte) 125);
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (var2 != null) {
                  he.a((o) (Object) param1, (o) (Object) var2, true);
                  break L2;
                } else {
                  nk.field_t.a((o) (Object) param1, (byte) 125);
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          var4 = null;
          fh.a((byte) -34, (ln) null);
          param1.c(-2193);
          var2 = (ln) (Object) nk.field_t.g(-18110);
          L3: while (true) {
            if (var2 != null) {
              if (var2.a(-7, param1)) {
                var2 = (ln) (Object) nk.field_t.a((byte) -114);
                continue L3;
              } else {
                if (var2 != null) {
                  he.a((o) (Object) param1, (o) (Object) var2, true);
                  return;
                } else {
                  nk.field_t.a((o) (Object) param1, (byte) 125);
                  return;
                }
              }
            } else {
              if (var2 != null) {
                he.a((o) (Object) param1, (o) (Object) var2, true);
                return;
              } else {
                nk.field_t.a((o) (Object) param1, (byte) 125);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
