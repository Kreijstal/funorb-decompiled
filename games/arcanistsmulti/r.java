/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static le field_b;
    private static long[] field_d;
    static String field_a;
    static String field_c;
    static String field_e;

    final static void a(boolean param0) {
        ed.j(120);
        if (param0) {
            Object var2 = null;
            qb discarded$0 = r.a(51, -102, 48, (eg) null);
        }
        oc.a(112, nn.field_p, tl.field_a[0].field_n, dh.field_Gb, ga.field_r, ra.field_h);
    }

    final static qb a(int param0, int param1, int param2, eg param3) {
        if (!fc.a(-126, param3, param2, param1)) {
            return null;
        }
        if (param0 != -17928) {
            field_a = null;
        }
        return wh.a(-112);
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != 8) {
            Object var2 = null;
            ho discarded$0 = r.a((String) null, 56);
        }
    }

    final static ho a(String param0, int param1) {
        L0: {
          if (param1 == 256) {
            break L0;
          } else {
            r.a(121);
            break L0;
          }
        }
        if (sk.field_a != hb.field_Gb) {
          L1: {
            if (pa.field_g != hb.field_Gb) {
              break L1;
            } else {
              if (param0.equals((Object) (Object) ji.field_j)) {
                hb.field_Gb = uj.field_h;
                return fh.field_i;
              } else {
                break L1;
              }
            }
          }
          hb.field_Gb = sk.field_a;
          ji.field_j = param0;
          fh.field_i = null;
          return null;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_d = new long[256];
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -257) {
            field_a = "Please remove <%0> from your ignore list first.";
            field_c = "You just fell into the water. Try not to do this in future, as outside of this training area it will result in injury.";
            field_e = "Return to game";
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                field_d[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) == 1L) {
                  var0 = var0 >>> 1284508929 ^ -3932672073523589310L;
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
