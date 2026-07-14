/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static dd field_a;
    static int[] field_d;
    static lr field_e;
    static String field_c;
    static boolean field_f;
    static String[] field_b;

    final static void b(int param0) {
        if (param0 >= -50) {
            field_a = null;
        }
    }

    final static re a(long param0, int param1, String param2, boolean param3, String param4) {
        Object var7 = null;
        L0: {
          if (param0 != 0L) {
            break L0;
          } else {
            if (param4 != null) {
              return (re) (Object) new ca(param4, param2);
            } else {
              break L0;
            }
          }
        }
        if (!param3) {
          L1: {
            if (param1 == -16595) {
              break L1;
            } else {
              var7 = null;
              re discarded$2 = bi.a(92L, -15, (String) null, true, (String) null);
              break L1;
            }
          }
          return (re) (Object) new se(param0, param2);
        } else {
          return (re) (Object) new ub(param0, param2);
        }
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int var2 = Pool.field_O;
        if (!(0L != (pd.field_i & 1L))) {
            return false;
        }
        de.a(-106);
        if (param0 > -66) {
            bi.a(23);
        }
        for (var1 = 0; var1 < aq.field_a.length; var1++) {
            if (aq.field_a[var1].c((byte) -125)) {
                return true;
            }
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Show players in <%0>'s game";
    }
}
