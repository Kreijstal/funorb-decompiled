/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static String field_c;
    static String field_a;

    final static String b(int param0) {
        if (!cd.field_j) {
            if (vl.field_H >= ib.field_d) {
                if (!(kj.field_r + ib.field_d <= vl.field_H)) {
                    return nl.field_f;
                }
            }
        }
        if (param0 == 32) {
            return null;
        }
        Object var2 = null;
        qg.a((q) null, true);
        return null;
    }

    public static void b(boolean param0) {
        if (param0) {
            Object var2 = null;
            qg.a((q) null, false);
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final synchronized static long a(boolean param0) {
        long var1 = System.currentTimeMillis();
        if (we.field_c > var1) {
            pa.field_b = pa.field_b + (we.field_c - var1);
        }
        we.field_c = var1;
        if (param0) {
            field_c = null;
        }
        return pa.field_b + var1;
    }

    final static nj a(String[] args, int param1) {
        nj var2 = new nj(false);
        var2.field_a = args;
        if (param1 < 61) {
            return null;
        }
        return var2;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 <= 10) {
            qg.a(-17);
        }
        if ((kc.field_b ^ -1) >= -33) {
            qd.a(false, 0);
        } else {
            var1 = kc.field_b % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            qd.a(false, kc.field_b + -var1);
        }
    }

    final static void a(q param0, boolean param1) {
        int var2 = 0;
        q var3 = null;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param0.field_n != null) {
          if (param1) {
            L0: {
              L1: {
                if (-1 != param0.field_b) {
                  break L1;
                } else {
                  if (-1 != param0.field_f) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= rk.field_ab) {
                  break L0;
                } else {
                  var3 = rl.field_C[var2];
                  if ((var3.field_e ^ -1) == -3) {
                    if (var3.field_b == param0.field_b) {
                      if (param0.field_f == var3.field_f) {
                        return;
                      } else {
                        var2++;
                        continue L2;
                      }
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (null == param0.field_i) {
                break L3;
              } else {
                break L3;
              }
            }
            nj.a(param0, (byte) 94);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You are not currently logged in to the<nbsp>game.";
        field_a = "?";
    }
}
