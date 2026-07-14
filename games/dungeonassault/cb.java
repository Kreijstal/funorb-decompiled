/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static int field_b;
    static md field_a;
    static String field_c;

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, ec param3, int param4, java.math.BigInteger param5, int param6) {
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
          var10 = DungeonAssault.field_K;
          var7 = wk.a(param1, 18605);
          if (rp.field_g != null) {
            break L0;
          } else {
            rp.field_g = new java.security.SecureRandom();
            break L0;
          }
        }
        L1: {
          var15 = new int[4];
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var8 = var12;
          if (param4 == 5471) {
            break L1;
          } else {
            field_a = null;
            break L1;
          }
        }
        var9 = 0;
        L2: while (true) {
          if ((var9 ^ -1) <= -5) {
            L3: {
              L4: {
                if (null == wa.field_b) {
                  break L4;
                } else {
                  if (wa.field_b.field_m.length >= var7) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              wa.field_b = new ec(var7);
              break L3;
            }
            L5: {
              L6: {
                wa.field_b.field_o = 0;
                wa.field_b.a(param2, 1, param1, param6);
                wa.field_b.g(param4 + -5468, var7);
                wa.field_b.a(var15, true);
                if (t.field_d == null) {
                  break L6;
                } else {
                  if ((t.field_d.field_m.length ^ -1) <= -101) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              t.field_d = new ec(100);
              break L5;
            }
            t.field_d.field_o = 0;
            t.field_d.a(6, 10);
            var11 = 0;
            var9 = var11;
            L7: while (true) {
              if ((var11 ^ -1) <= -5) {
                t.field_d.i(param1, param4 ^ -5422);
                t.field_d.a(param0, 2, param5);
                param3.a(t.field_d.field_m, 1, t.field_d.field_o, 0);
                param3.a(wa.field_b.field_m, param4 ^ 5470, wa.field_b.field_o, 0);
                return;
              } else {
                t.field_d.a((byte) 63, var15[var11]);
                var11++;
                continue L7;
              }
            }
          } else {
            var8[var9] = rp.field_g.nextInt();
            var9++;
            continue L2;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 27525) {
            field_c = null;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new md();
        field_c = "Rot Worms";
    }
}
