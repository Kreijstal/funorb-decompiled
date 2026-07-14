/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_b;
    static gh field_a;
    static String field_e;
    static int[] field_c;
    static String field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 <= 40) {
            Object var2 = null;
            int discarded$0 = hm.a((byte) 75, (int[]) null, (nk) null);
        }
    }

    final static int a(byte param0, int[] param1, nk param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        if (param0 > 116) {
          var3 = param2.e((byte) -120);
          var4 = param2.i(-121);
          var5 = 0;
          L0: while (true) {
            if (var5 >= var4) {
              return var3;
            } else {
              if (-35 != (param1[var5] ^ -1)) {
                if ((param1[var5] ^ -1) <= -1) {
                  if (param1[var5] < dn.field_Sb.length) {
                    var3 = var3 + dn.field_Sb[param1[var5]];
                    var5++;
                    continue L0;
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                return 6100;
              }
            }
          }
        } else {
          return 49;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Rockets and missiles reload faster.";
        field_d = "Set up new game";
        field_e = "SHIFT";
        field_c = new int[8192];
        field_a = null;
    }
}
