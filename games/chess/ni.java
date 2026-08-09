/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static String[] field_b;
    static String[] field_a;
    static jc field_c;
    static int field_d;

    final static void a(int param0, int param1, java.math.BigInteger param2, p param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              var7_int = uh.a(false, param1);
              if (null == ae.field_j) {
                ae.field_j = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            if (param4 == -21105) {
              var9 = 0;
              L2: while (true) {
                if (var9 >= 4) {
                  L3: {
                    L4: {
                      if (n.field_g == null) {
                        break L4;
                      } else {
                        if (var7_int > n.field_g.field_o.length) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    n.field_g = new p(var7_int);
                    break L3;
                  }
                  L5: {
                    L6: {
                      n.field_g.field_l = 0;
                      n.field_g.a(param6, (byte) -45, param0, param1);
                      n.field_g.a((byte) -54, var7_int);
                      n.field_g.a(var13, 12246);
                      if (vg.field_c == null) {
                        break L6;
                      } else {
                        if ((vg.field_c.field_o.length ^ -1) > -101) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    vg.field_c = new p(100);
                    break L5;
                  }
                  vg.field_c.field_l = 0;
                  vg.field_c.c(10, (byte) 94);
                  var11 = 0;
                  var9 = var11;
                  L7: while (true) {
                    if (4 <= var11) {
                      vg.field_c.b(param1, 94);
                      vg.field_c.a(param2, param5, (byte) 76);
                      param3.a(vg.field_c.field_o, (byte) -45, 0, vg.field_c.field_l);
                      param3.a(n.field_g.field_o, (byte) -45, 0, n.field_g.field_l);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      vg.field_c.d(var13[var11], (byte) -81);
                      var11++;
                      continue L7;
                    }
                  }
                } else {
                  var8[var9] = ae.field_j.nextInt();
                  var9++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("ni.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param6 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        if (sl.field_a != param0 + -eg.field_i && sl.field_a == -eg.field_i + 250) {
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
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = new jc();
    }
}
