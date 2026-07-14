/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends td {
    static java.math.BigInteger field_p;

    final static boolean c(int param0) {
        fka var1 = null;
        int var2 = 0;
        int var3 = 0;
        fka var4 = null;
        var3 = BachelorFridge.field_y;
        var4 = (fka) (Object) fd.field_z.b((byte) 90);
        var1 = var4;
        if (var1 != null) {
          if (param0 <= -38) {
            var2 = 0;
            L0: while (true) {
              if (var1.field_k > var2) {
                L1: {
                  if (var4.field_i[var2] != null) {
                    if (var4.field_i[var2].field_f == 0) {
                      return false;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if (var4.field_j[var2] != null) {
                  if (0 == var4.field_j[var2].field_f) {
                    return false;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        jl var4 = null;
        var3 = ((tg) this).field_h.a(param1 ^ 104, param0);
        var4 = new jl(((tg) this).field_g, new nq(var3));
        if (param1 != 3) {
          boolean discarded$2 = tg.c(-1);
          var4.field_o.a((bw) (Object) new iv(new nq(var3), false, 1, 0, 28), true);
          return (ii) (Object) var4;
        } else {
          var4.field_o.a((bw) (Object) new iv(new nq(var3), false, 1, 0, 28), true);
          return (ii) (Object) var4;
        }
    }

    public static void b(int param0) {
        field_p = null;
        if (param0 != 1) {
            boolean discarded$0 = tg.c(-2);
        }
    }

    tg(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
