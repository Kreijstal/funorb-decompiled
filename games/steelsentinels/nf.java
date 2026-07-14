/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static hk field_b;
    static String field_d;
    static sg field_c;
    static kg field_a;

    final static int a(int[] param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          if (-1 != (param0[0] ^ -1)) {
            if (param0[0] != 55) {
              if ((param0[0] ^ -1) == -58) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_8_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_8_0;
          if (var3 == 0) {
            break L1;
          } else {
            var11 = nl.a(param0[0], (byte) 124);
            if (var11.length == param0.length) {
              var5 = 0;
              L2: while (true) {
                if (var5 >= param0.length) {
                  break L1;
                } else {
                  if (param0[var5] == var11[var5]) {
                    var5++;
                    continue L2;
                  } else {
                    var3 = 0;
                    break L1;
                  }
                }
              }
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L3: {
          var4 = nn.a(param0, (byte) 78);
          if (param2 == 44) {
            break L3;
          } else {
            field_a = null;
            break L3;
          }
        }
        L4: {
          if (-6101 > (var4 ^ -1)) {
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            break L4;
          } else {
            stackOut_19_0 = 1;
            stackIn_21_0 = stackOut_19_0;
            break L4;
          }
        }
        L5: {
          var5 = stackIn_21_0;
          var6 = 4;
          if (var3 != 0) {
            var6 = var6 | 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var5 == 0) {
            break L6;
          } else {
            var6 = var6 | 2;
            break L6;
          }
        }
        return var6;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != 55) {
            nf.a(-99);
        }
    }

    final static void a(boolean param0, gi param1, java.math.BigInteger param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          var10 = SteelSentinels.field_G;
          var7 = me.a(param4, -97);
          if (null == hb.field_c) {
            hb.field_c = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var16 = new int[4];
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var8 = var13;
        var9 = 0;
        L1: while (true) {
          if (var9 >= 4) {
            L2: {
              L3: {
                if (hj.field_H == null) {
                  break L3;
                } else {
                  if (hj.field_H.field_t.length < var7) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              hj.field_H = new gi(var7);
              break L2;
            }
            L4: {
              L5: {
                hj.field_H.field_p = 0;
                hj.field_H.a(param4, (byte) -122, param3, param6);
                hj.field_H.b(-2, var7);
                hj.field_H.a(var16, -108);
                if (sj.field_u == null) {
                  break L5;
                } else {
                  if (sj.field_u.field_t.length < 100) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              sj.field_u = new gi(100);
              break L4;
            }
            L6: {
              sj.field_u.field_p = 0;
              sj.field_u.a((byte) 122, 10);
              var12 = 0;
              var9 = var12;
              if (!param0) {
                break L6;
              } else {
                var11 = null;
                nf.a(true, (gi) null, (java.math.BigInteger) null, -45, 111, (java.math.BigInteger) null, (byte[]) null);
                break L6;
              }
            }
            L7: while (true) {
              if (var12 >= 4) {
                sj.field_u.d(param4, 17);
                sj.field_u.a(param2, param5, -10048);
                param1.a(sj.field_u.field_p, (byte) -122, 0, sj.field_u.field_t);
                param1.a(hj.field_H.field_p, (byte) -122, 0, hj.field_H.field_t);
                return;
              } else {
                sj.field_u.b(true, var16[var12]);
                var12++;
                continue L7;
              }
            }
          } else {
            var8[var9] = hb.field_c.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Solicitation";
    }
}
