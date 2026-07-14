/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends td {
    static jla[] field_p;
    static String field_q;

    eg(int param0, aga param1, nq param2) {
        super(param0, param1);
        ((eg) this).field_j = param2;
    }

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
        if (param0 > -71) {
            eg.c((byte) -75);
        }
    }

    final ii a(op param0, int param1) {
        aga var4 = null;
        fia var5 = null;
        aga var6 = null;
        aga var7 = null;
        var6 = ((eg) this).field_h.a(param1 ^ 48, param0);
        var7 = var6;
        var4 = ((eg) this).field_j.a(79, param0);
        if (var4 != null) {
          if (!var4.i(-127)) {
            var5 = new fia(((eg) this).field_g, new nq(var7));
            var5.field_o.a((bw) (Object) new iv(new nq(var4), false, 1, 0, 32), true);
            if (param1 == 3) {
              if (var4.field_o.field_b != 1) {
                if (var4.field_o.field_b == 0) {
                  param0.field_T.field_u[var6.field_D] = true;
                  return (ii) (Object) var5;
                } else {
                  return (ii) (Object) var5;
                }
              } else {
                param0.field_T.field_u[var6.field_D] = true;
                return (ii) (Object) var5;
              }
            } else {
              field_p = null;
              if (var4.field_o.field_b != 1) {
                if (var4.field_o.field_b == 0) {
                  param0.field_T.field_u[var6.field_D] = true;
                  return (ii) (Object) var5;
                } else {
                  return (ii) (Object) var5;
                }
              } else {
                param0.field_T.field_u[var6.field_D] = true;
                return (ii) (Object) var5;
              }
            }
          } else {
            return (ii) (Object) new ew(new nq(var7));
          }
        } else {
          return (ii) (Object) new ew(new nq(var7));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new jla[16];
        field_q = "Drawn";
    }
}
