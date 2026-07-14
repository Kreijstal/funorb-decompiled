/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tg {
    static Random field_b;
    static int[] field_d;
    static int field_a;
    static qr field_c;

    final static boolean a(int param0, int param1, byte param2, int param3) {
        Object var5 = null;
        if (param2 < -91) {
          if (-1 >= (param1 ^ -1)) {
            if (param1 >= -12) {
              if (-2 <= param0) {
                if (oq.a((byte) -123, param3, param1) < param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var5 = null;
          tg.a(-57, (bi) null, (byte) 36, -126);
          if (-1 >= (param1 ^ -1)) {
            if (param1 >= -12) {
              if (-2 <= param0) {
                if (oq.a((byte) -123, param3, param1) < param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        int var1 = 95 % ((param0 - -56) / 38);
    }

    final static void a(int param0, bi param1, byte param2, int param3) {
        int var4 = 0;
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
        L0: {
          var16 = ShatteredPlansClient.field_F ? 1 : 0;
          param3 = param3 + param1.field_t;
          param0 = param0 + param1.field_x;
          var4 = 0;
          var5 = 0;
          var6 = param1.field_z;
          if (gf.field_i > param3) {
            var6 = var6 + (param3 + -gf.field_i);
            var4 = -param3 + gf.field_i;
            param3 = gf.field_i;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var7 = param1.field_w;
          if (param0 < gf.field_a) {
            var5 = -param0 + gf.field_a;
            var7 = var7 + (-gf.field_a + param0);
            param0 = gf.field_a;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var6 + param3 <= gf.field_l) {
            break L2;
          } else {
            var6 = gf.field_l - param3;
            break L2;
          }
        }
        L3: {
          var8 = -74 % ((param2 - -81) / 43);
          if (var7 + param0 <= gf.field_f) {
            break L3;
          } else {
            var7 = -param0 + gf.field_f;
            break L3;
          }
        }
        var9 = var4 + var5 * param1.field_z;
        var10 = -var6 + param1.field_z;
        var11 = gf.field_b * param0 - -param3;
        var12 = -var6 + gf.field_b;
        param0 = -var7;
        L4: while (true) {
          if (0 <= param0) {
            return;
          } else {
            param3 = -var6;
            L5: while (true) {
              if (0 <= param3) {
                var9 = var9 + var10;
                var11 = var11 + var12;
                param0++;
                continue L4;
              } else {
                var9++;
                var13 = 255 & param1.field_B[var9];
                if (var13 != 0) {
                  L6: {
                    var14 = gf.field_h[var11];
                    if (255 > var13) {
                      var13 = var13 >> 2;
                      var15 = var14 & 65280;
                      var14 = var14 & 16711935;
                      var14 = var14 * (256 + -var13);
                      var14 = var14 & -16711936;
                      var15 = var15 * (256 - var13);
                      var15 = var15 & 16711680;
                      var14 = (var14 | var15) >>> -1859049592;
                      var14 = var14 + var13 * 65793;
                      break L6;
                    } else {
                      var14 = 8355711 & var14 >>> 2105639873 | 8421504;
                      break L6;
                    }
                  }
                  var11++;
                  gf.field_h[var11] = var14;
                  param3++;
                  param3++;
                  continue L5;
                } else {
                  var11++;
                  param3++;
                  param3++;
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
        field_b = new Random();
        field_d = new int[8192];
    }
}
