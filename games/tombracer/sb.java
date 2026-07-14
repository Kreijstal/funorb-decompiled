/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static boolean field_b;
    static int field_d;
    static upa field_a;
    static String field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            Object var2 = null;
            int[] discarded$0 = sb.a(121, (int[]) null);
        }
    }

    final static int[] a(int param0, int[] param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          var7 = new int[pd.a(param1, 2048)];
          var2 = var7;
          var3 = 0;
          var4 = param0;
          if (param1.length <= var4) {
            break L0;
          } else {
            L1: {
              if (param1[var4] != 0) {
                var5 = 0;
                L2: while (true) {
                  if (32 <= var5) {
                    break L1;
                  } else {
                    if ((1 << var5 & param1[var4]) == 0) {
                      var5++;
                      var5++;
                      var5++;
                      continue L2;
                    } else {
                      var3++;
                      var7[var3] = fh.a(var5, var4 << -1533565403);
                      var5++;
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                var4++;
                break L1;
              }
            }
            var4++;
            var4++;
            break L0;
          }
        }
        return var7;
    }

    final static void a(int param0, cn param1, cn param2, cn param3, cn param4) {
        bja.field_a = param4;
        qoa.field_b = param1;
        ua.field_a = param2;
        nj.field_v = param3;
        ns.field_j = new nda(qoa.field_b, nj.field_v);
        bia.field_J = new u[237];
        int var5 = -51 % ((param0 - 32) / 59);
        fna.field_j = new qua[4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_c = "Accept <%0> into this game";
    }
}
