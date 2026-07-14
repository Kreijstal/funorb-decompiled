/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mt extends td {
    static int field_v;
    static sna field_q;
    static String field_t;
    static int[] field_u;
    static vr field_p;
    static int field_s;
    static int field_r;

    public static void b(int param0) {
        if (param0 != 1687) {
            return;
        }
        field_q = null;
        field_u = null;
        field_t = null;
        field_p = null;
    }

    final ii a(op param0, int param1) {
        nb var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        L0: {
          var8 = BachelorFridge.field_y;
          if (param1 == 3) {
            break L0;
          } else {
            field_s = 126;
            break L0;
          }
        }
        var9 = ((mt) this).field_h.a(param1 ^ 115, param0);
        var4 = new nb(((mt) this).field_g, new nq(var9));
        var5 = 0;
        L1: while (true) {
          if (var5 >= param0.field_d) {
            return (ii) (Object) var4;
          } else {
            var6 = 0;
            L2: while (true) {
              if ((var6 ^ -1) <= -8) {
                var5++;
                continue L1;
              } else {
                if (param0.field_S[var5].field_b[var6] != null) {
                  var7 = param0.field_S[var5].field_b[var6];
                  if (var7.field_A) {
                    if (var7.i(-116)) {
                      if (var9.field_x == var7.field_x) {
                        if (var7.field_J == var9.field_J) {
                          var4.field_o.a((bw) (Object) new iv(new nq(var9), false, 1, -var7.field_t, 0), true);
                          var4.field_o.a((bw) (Object) new pea(new nq(var7), var7.field_x, var7.field_J), true);
                          var6++;
                          continue L2;
                        } else {
                          var6++;
                          continue L2;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static sna c(int param0) {
        if (param0 != 0) {
            mt.b(24);
        }
        return rba.field_a.field_wb;
    }

    mt(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
        field_t = "More suggestions";
    }
}
