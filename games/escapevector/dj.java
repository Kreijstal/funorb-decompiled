/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static String field_b;
    static boolean[] field_a;
    static fn[] field_d;
    static hl field_c;

    final static void a(int param0, int param1, int param2) {
        oh var3 = null;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        eh.field_k = true;
        var3 = (oh) (Object) wa.field_c.a(false);
        L0: while (true) {
          if (var3 == null) {
            var3 = (oh) (Object) si.field_u.a(false);
            L1: while (true) {
              if (var3 == null) {
                if (param1 >= -5) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  if (var3.field_m >= 0) {
                    em.g(param2 + var3.field_i, param0 + var3.field_q, var3.field_s, hi.field_q);
                    break L2;
                  } else {
                    em.g(var3.field_i + param2, param0 + -var3.field_s + var3.field_q, var3.field_s, hi.field_q);
                    break L2;
                  }
                }
                var3 = (oh) (Object) si.field_u.b((byte) 70);
                continue L1;
              }
            }
          } else {
            L3: {
              if (-1 < (var3.field_m ^ -1)) {
                em.e(var3.field_i + -var3.field_s - -param2, param0 + var3.field_q, var3.field_s, hi.field_q);
                break L3;
              } else {
                em.e(param2 + var3.field_i, param0 + var3.field_q, var3.field_s, hi.field_q);
                break L3;
              }
            }
            var3 = (oh) (Object) wa.field_c.b((byte) 70);
            continue L0;
          }
        }
    }

    final static char a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 <= -34) {
          var2 = param1 & 255;
          if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (var2 >= 128) {
              if ((var2 ^ -1) <= -161) {
                return (char)var2;
              } else {
                L0: {
                  var3 = cn.field_c[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          }
        } else {
          char discarded$1 = dj.a(-28, (byte) 6);
          var2 = param1 & 255;
          if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (var2 < 128) {
              return (char)var2;
            } else {
              L1: {
                if ((var2 ^ -1) > -161) {
                  L2: {
                    var3 = cn.field_c[-128 + var2];
                    if (var3 == 0) {
                      var3 = 63;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var2 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (char)var2;
            }
          }
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = EscapeVector.field_A;
        boolean discarded$12 = bo.field_F.a(true, (byte) -33, oj.field_G, ph.field_a);
        bo.field_F.m(0);
        L0: while (true) {
          if (!pn.p(-116)) {
            if (param0 == 6445) {
              if (-1 != rf.field_a) {
                var1 = rf.field_a;
                lj.a(-1, param0 + -6378);
                return var1;
              } else {
                if (!ei.field_i) {
                  if (ui.field_b != dg.field_o) {
                    if (!di.field_g.b(0)) {
                      return 1;
                    } else {
                      if (dg.field_o == dn.field_q) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              }
            } else {
              return -79;
            }
          } else {
            boolean discarded$13 = bo.field_F.a(jc.field_c, nk.field_n, (byte) -116);
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        int var1 = 22 % ((param0 - 83) / 40);
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
    }
}
