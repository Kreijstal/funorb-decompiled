/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un extends us {
    static int[] field_h;

    final static void a(phb param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        if ((3 & (param0.field_l | (param0.field_k | (param0.field_q | param0.field_p)))) == 0) {
          return;
        } else {
          L0: {
            var2 = (param0.field_k & 3) + param0.field_q;
            var3 = (param0.field_l & 3) + param0.field_p;
            var2 = var2 + 4 - (3 & var2);
            var3 = -(3 & var3) + 4 + var3;
            var4 = new int[var3 * var2];
            var5 = 0;
            var6 = (3 & param0.field_k) - -((param0.field_l & 3) * var2);
            if (param1 >= 111) {
              break L0;
            } else {
              field_h = null;
              break L0;
            }
          }
          var7 = 0;
          L1: while (true) {
            if (param0.field_p <= var7) {
              param0.field_r = var4;
              param0.field_l = param0.field_l & -4;
              param0.field_k = param0.field_k & -4;
              param0.field_q = var2;
              param0.field_p = var3;
              return;
            } else {
              var8 = 0;
              L2: while (true) {
                if (var8 >= param0.field_q) {
                  var6 = var6 + (var2 - param0.field_q);
                  var7++;
                  continue L1;
                } else {
                  var6++;
                  var5++;
                  var4[var6] = param0.field_r[var5];
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            un.a((phb) null, 3);
        }
        field_h = null;
    }

    final dka a(byte param0) {
        int var2 = -52 % ((param0 - -7) / 56);
        return cha.field_q;
    }

    un(long param0, String param1) {
        super(param0, param1);
    }

    static {
    }
}
