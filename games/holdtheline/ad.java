/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static ll field_b;
    static int field_c;
    static boolean field_a;
    static int[] field_d;

    public static void b(byte param0) {
        int var1 = -20 / ((81 - param0) / 40);
        field_d = null;
        field_b = null;
    }

    final static ui a(int param0, int param1, el param2) {
        if (param0 != 255) {
            return null;
        }
        return lg.a(db.a(param2, 100, param1), (byte) -68);
    }

    final static boolean a(int param0) {
        ki var1 = null;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        ki var5 = null;
        var3 = HoldTheLine.field_D;
        var5 = (ki) (Object) sl.field_b.b((byte) 94);
        var1 = var5;
        if (var1 != null) {
          L0: {
            if (param0 > 80) {
              break L0;
            } else {
              var4 = null;
              ad.a((int[]) null, 0.6495102643966675f, (byte) -45, 0.5647060871124268f, (hj) null);
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (var2 >= var1.field_p) {
              return true;
            } else {
              L2: {
                if (null != var5.field_k[var2]) {
                  if (0 != var5.field_k[var2].field_d) {
                    break L2;
                  } else {
                    return false;
                  }
                } else {
                  break L2;
                }
              }
              if (null != var5.field_l[var2]) {
                if (0 == var5.field_l[var2].field_d) {
                  return false;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0) {
        int var1 = 10 / ((-30 - param0) / 44);
        if (0 != (ra.field_ab ^ -1)) {
            mn.field_b = ld.field_b << -1956267568 | ra.field_ab;
        } else {
            if (!(!na.field_k)) {
                mn.field_b = -1;
                qj.field_I = -1;
            }
        }
        hm.a((byte) 66, mn.field_b);
        ra.field_ab = -1;
    }

    final static void a(int[] param0, float param1, byte param2, float param3, hj param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var24 = HoldTheLine.field_D;
        gf.a();
        gf.a(param0, 0, param0.length);
        gf.c();
        var5 = 51 % ((param2 - 26) / 33);
        L0: while (true) {
          if (!gf.d()) {
            return;
          } else {
            L1: {
              var6 = gf.field_g;
              if ((var6 ^ -1) > -1) {
                var6 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = gf.field_b;
              if (var7 >= tc.field_j) {
                var7 = -1 + tc.field_j;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var8 = gf.field_a;
              if (var8 < 0) {
                var8 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (tc.field_c <= var8) {
                var8 = -1 + tc.field_c;
                break L4;
              } else {
                break L4;
              }
            }
            var9 = var6 % param4.field_s;
            var10 = var8 % param4.field_y;
            var11 = var8 * tc.field_j + var6;
            var12 = var10 * param4.field_s + var9;
            var13 = param4.field_s - var9;
            var14 = -var6 + var7;
            L5: while (true) {
              var14--;
              if (0 > var14) {
                continue L0;
              } else {
                L6: {
                  var15 = tc.field_b[var11] & 16711680;
                  var16 = tc.field_b[var11] & 65280;
                  var17 = tc.field_b[var11] & 255;
                  var18 = 16711680 & param4.field_z[var12];
                  var19 = 65280 & param4.field_z[var12];
                  var20 = 255 & param4.field_z[var12];
                  if (param3 >= 0.0f) {
                    var21 = (int)(param3 * 256.0f);
                    var22 = 256 - var21;
                    var18 = var21 * 16711680 + var22 * var18 >>> -232238296;
                    var19 = var21 * 65280 + var19 * var22 >>> 1721527208;
                    var20 = var20 * var22 + 255 * var21 >>> -531361112;
                    break L6;
                  } else {
                    var21 = (int)((1.0f + param3) * 256.0f);
                    var19 = var21 * var19 >>> 207692680;
                    var18 = var18 * var21 >>> 1630221640;
                    var20 = var20 * var21 >>> -1641947256;
                    break L6;
                  }
                }
                var21 = (int)(param1 * (float)(-var15 + var18)) + var15;
                var22 = (int)(param1 * (float)(-var16 + var19)) + var16;
                var23 = (int)((float)(-var17 + var20) * param1) + var17;
                tc.field_b[var11] = kc.a(pk.a(255, var23), kc.a(pk.a(var22, 65280), pk.a(var21, 16711680)));
                var11++;
                var12++;
                var13--;
                if (var13 == 0) {
                  var12 = var10 * param4.field_s;
                  var13 = param4.field_s;
                  continue L5;
                } else {
                  continue L5;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ll();
    }
}
