/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static nb field_a;
    static int field_b;

    final static int a(byte param0, CharSequence param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          var3 = 0;
          if (param0 <= -111) {
            break L0;
          } else {
            field_b = 12;
            break L0;
          }
        }
        var4 = param1.length();
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param2 == param1.charAt(var5)) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -68) {
            return;
        }
        field_a = null;
    }

    final static boolean b(byte param0) {
        if (param0 != 9) {
            vs.a((byte) 108);
        }
        return ms.field_a;
    }

    final static boolean a(int[] param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        ub var5_ref_ub = null;
        int var5 = 0;
        int var6_int = 0;
        ub var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (kw.field_c == ga.field_j) {
          L0: {
            var4 = 96 / ((param1 - -72) / 53);
            var2 = wq.a(-45);
            if (0 == jo.field_c) {
              break L0;
            } else {
              if (lq.field_b < 0) {
                var5_ref_ub = (ub) (Object) un.field_b.b(-99);
                if (var5_ref_ub == null) {
                  break L0;
                } else {
                  if ((var2 ^ -1L) >= (var5_ref_ub.field_m ^ -1L)) {
                    break L0;
                  } else {
                    var5_ref_ub.b(false);
                    gu.field_d = var5_ref_ub.field_k.length;
                    ig.field_a.field_p = 0;
                    var6_int = 0;
                    L1: while (true) {
                      if (var6_int >= gu.field_d) {
                        li.field_r = vb.field_I;
                        vb.field_I = ur.field_Q;
                        ur.field_Q = iw.field_a;
                        iw.field_a = var5_ref_ub.field_l;
                        return true;
                      } else {
                        ig.field_a.field_n[var6_int] = var5_ref_ub.field_k[var6_int];
                        var6_int++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L2: while (true) {
            L3: {
              if ((lq.field_b ^ -1) > -1) {
                ig.field_a.field_p = 0;
                if (ju.b(-1, 1)) {
                  lq.field_b = ig.field_a.i(255);
                  ig.field_a.field_p = 0;
                  gu.field_d = param0[lq.field_b];
                  break L3;
                } else {
                  return false;
                }
              } else {
                break L3;
              }
            }
            if (lt.a((byte) 119)) {
              if (jo.field_c != 0) {
                L4: {
                  var5 = jo.field_c;
                  if (0.0 == au.field_k) {
                    break L4;
                  } else {
                    var5 = (int)((double)var5 + fd.field_d.nextGaussian() * au.field_k);
                    if (var5 < 0) {
                      var5 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                var6 = new ub((long)var5 + var2, lq.field_b, new byte[gu.field_d]);
                var7 = 0;
                L5: while (true) {
                  if (gu.field_d <= var7) {
                    un.field_b.a((ms) (Object) var6, (byte) 39);
                    lq.field_b = -1;
                    continue L2;
                  } else {
                    var6.field_k[var7] = ig.field_a.field_n[var7];
                    var7++;
                    continue L5;
                  }
                }
              } else {
                li.field_r = vb.field_I;
                vb.field_I = ur.field_Q;
                ur.field_Q = iw.field_a;
                iw.field_a = lq.field_b;
                lq.field_b = -1;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nb(0);
    }
}
