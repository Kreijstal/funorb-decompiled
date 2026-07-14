/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static int field_b;
    static he[] field_a;

    public static void a(byte param0) {
        if (param0 > -117) {
            return;
        }
        field_a = null;
    }

    final static long a(int param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = 0L;
          var4 = param1.length();
          if (param0 >= 42) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 >= var4) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 > 90) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(1 + (var6 - 65));
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (var6 <= 122) {
                      var2 = var2 + (long)(-97 + (1 + var6));
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (var6 > 57) {
                    break L3;
                  } else {
                    var2 = var2 + (long)(27 - -var6 - 48);
                    break L3;
                  }
                }
              }
              if (-177917621779460414L < (var2 ^ -1L)) {
                var5++;
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L6: while (true) {
            L7: {
              if ((var2 % 37L ^ -1L) != -1L) {
                break L7;
              } else {
                if (var2 == 0L) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    final static void a(int param0) {
        ae.field_hb = new nh[]{hb.field_a, ad.field_t, oi.field_d, cl.field_p, li.field_i, al.field_b, kc.field_p, rk.field_e, hj.field_e, cl.field_s, kc.field_q, qa.field_M, nd.field_L, sa.field_c, mh.field_c, DrPhlogistonSavesTheEarth.field_J, jj.field_c, am.field_o, ik.field_b, bd.field_P, nc.field_K, null, lh.field_p, f.field_i[param0], le.field_d, qf.field_b, cj.field_d, kc.field_p, db.field_e, lh.field_p};
    }

    static {
    }
}
