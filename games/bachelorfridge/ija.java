/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ija extends td {
    static String field_p;

    final ii a(op param0, int param1) {
        aga var3 = null;
        aga var4 = null;
        rb var5 = null;
        Object var6 = null;
        L0: {
          var3 = ((ija) this).field_h.a(91, param0);
          var4 = ((ija) this).field_j.a(param1 ^ 35, param0);
          if (var4 == null) {
            break L0;
          } else {
            if (!var4.i(-127)) {
              L1: {
                var5 = new rb(((ija) this).field_g, new nq(var3), ((ija) this).field_j);
                if (param1 == 3) {
                  break L1;
                } else {
                  var6 = null;
                  ija.a((byte) -120, (gs) null);
                  break L1;
                }
              }
              var5.field_o.a((bw) (Object) new iv(new nq(var4), false, 1, 0, 39), true);
              return (ii) (Object) var5;
            } else {
              break L0;
            }
          }
        }
        return (ii) (Object) new ew(new nq(var3));
    }

    ija(int param0, aga param1, nq param2) {
        super(param0, param1);
        ((ija) this).field_j = param2;
    }

    final static void a(byte param0, gs param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= qs.field_n) {
                oma.field_a[param1.a((byte) 124)] = oma.field_a[param1.a((byte) 124)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (qs.field_n <= var3) {
                    var3 = 16 / ((-12 - param0) / 59);
                    qs.field_n = var2;
                    qs.field_n = qs.field_n + 1;
                    kw.field_k[qs.field_n] = param1;
                    return;
                  } else {
                    L3: {
                      if (kw.field_k[var3].field_p == param1.field_p) {
                        var4 = kw.field_k[var3].a((byte) 119);
                        if (oma.field_a[var4] > on.field_t) {
                          oma.field_a[var4] = oma.field_a[var4] - 1;
                          var3++;
                          continue L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    kw.field_k[var2] = kw.field_k[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (param1.field_p == kw.field_k[var2].field_p) {
                  oma.field_a[kw.field_k[var2].a((byte) 124)] = oma.field_a[kw.field_k[var2].a((byte) 124)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            oma.field_a[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        field_p = null;
        if (param0 != -4) {
            field_p = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Email address is unavailable";
    }
}
