/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static String[] field_b;
    static String[] field_a;
    static jc field_c;
    static int field_d;

    final static void a(int param0, int param1, java.math.BigInteger param2, p param3, int param4, java.math.BigInteger param5, byte[] param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Chess.field_G;
          var7 = uh.a(false, param1);
          if (null == ae.field_j) {
            ae.field_j = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        if (param4 == -21105) {
          var9 = 0;
          L1: while (true) {
            if (var9 >= 4) {
              L2: {
                L3: {
                  if (n.field_g == null) {
                    break L3;
                  } else {
                    if (var7 > n.field_g.field_o.length) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                n.field_g = new p(var7);
                break L2;
              }
              L4: {
                L5: {
                  n.field_g.field_l = 0;
                  n.field_g.a(param6, (byte) -45, param0, param1);
                  n.field_g.a((byte) -54, var7);
                  n.field_g.a(var15, 12246);
                  if (vg.field_c == null) {
                    break L5;
                  } else {
                    if ((vg.field_c.field_o.length ^ -1) > -101) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                vg.field_c = new p(100);
                break L4;
              }
              vg.field_c.field_l = 0;
              vg.field_c.c(10, (byte) 94);
              var11 = 0;
              var9 = var11;
              L6: while (true) {
                if (4 <= var11) {
                  vg.field_c.b(param1, 94);
                  vg.field_c.a(param2, param5, (byte) 76);
                  param3.a(vg.field_c.field_o, (byte) -45, 0, vg.field_c.field_l);
                  param3.a(n.field_g.field_o, (byte) -45, 0, n.field_g.field_l);
                  return;
                } else {
                  vg.field_c.d(var15[var11], (byte) -81);
                  var11++;
                  continue L6;
                }
              }
            } else {
              var8[var9] = ae.field_j.nextInt();
              var9++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final static void b(int param0) {
        if (sl.field_a != param0 + -eg.field_i) {
            if (sl.field_a == -eg.field_i + 250) {
            }
        }
        sl.field_a = sl.field_a + 1;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = new jc();
    }
}
