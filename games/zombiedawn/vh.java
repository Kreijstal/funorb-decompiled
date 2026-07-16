/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static ec field_a;
    static vn[] field_e;
    static nk field_d;
    static int field_b;
    static sd field_c;

    final static void a(v param0, int param1, int param2, int param3, int param4, byte param5) {
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
        Object var21 = null;
        L0: {
          var20 = ZombieDawn.field_J;
          var6 = (param1 + -param2 << -847806680) / param0.field_a;
          param3 = param3 + param0.field_g;
          param4 = param4 + param0.field_h;
          var7 = (param2 << -1192303608) + var6 * param0.field_g;
          var8 = bi.field_f * param4 + param3;
          var9 = 0;
          var10 = param0.field_d;
          var11 = param0.field_j;
          var12 = -var11 + bi.field_f;
          var13 = 0;
          if ((param4 ^ -1) <= (bi.field_l ^ -1)) {
            break L0;
          } else {
            var14 = bi.field_l + -param4;
            param4 = bi.field_l;
            var10 = var10 - var14;
            var9 = var9 + var11 * var14;
            var8 = var8 + bi.field_f * var14;
            break L0;
          }
        }
        L1: {
          if ((bi.field_d ^ -1) <= (var10 + param4 ^ -1)) {
            break L1;
          } else {
            var10 = var10 - (param4 + (var10 + -bi.field_d));
            break L1;
          }
        }
        L2: {
          if ((bi.field_g ^ -1) >= (param3 ^ -1)) {
            break L2;
          } else {
            var14 = bi.field_g - param3;
            var7 = var7 + var14 * var6;
            param3 = bi.field_g;
            var8 = var8 + var14;
            var9 = var9 + var14;
            var12 = var12 + var14;
            var13 = var13 + var14;
            var11 = var11 - var14;
            break L2;
          }
        }
        L3: {
          if (param3 - -var11 > bi.field_b) {
            var14 = var11 + param3 - bi.field_b;
            var12 = var12 + var14;
            var11 = var11 - var14;
            var13 = var13 + var14;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param5 == 84) {
            break L4;
          } else {
            var21 = null;
            vh.a((v) null, -118, 46, -65, -1, (byte) -59);
            break L4;
          }
        }
        L5: {
          if (-1 <= (var11 ^ -1)) {
            break L5;
          } else {
            if ((var10 ^ -1) < -1) {
              param4 = -var10;
              L6: while (true) {
                if ((param4 ^ -1) <= -1) {
                  return;
                } else {
                  var14 = var7;
                  param3 = -var11;
                  L7: while (true) {
                    if (-1 >= (param3 ^ -1)) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param4++;
                      continue L6;
                    } else {
                      L8: {
                        var15 = var14 >> 534418600;
                        var16 = -var15 + 256;
                        var14 = var14 + var6;
                        if ((var15 ^ -1) > -1) {
                          var9++;
                          var8++;
                          break L8;
                        } else {
                          L9: {
                            int incrementValue$1 = var9;
                            var9++;
                            var17 = param0.field_l[param0.field_k[incrementValue$1] & 255];
                            if (0 == var17) {
                              break L9;
                            } else {
                              if ((var15 ^ -1) >= -256) {
                                var18 = bi.field_c[var8];
                                var19 = 16711935 & (16711935 & var17) * var15 + var16 * (var18 & 16711935) >> -1379809112;
                                bi.field_c[var8] = (eg.a(eg.a(var17, 65280) * var15 + var16 * eg.a(65280, var18), 16711732) >> -1099542808) + var19;
                                break L9;
                              } else {
                                bi.field_c[var8] = var17;
                                break L9;
                              }
                            }
                          }
                          var8++;
                          break L8;
                        }
                      }
                      param3++;
                      continue L7;
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = 92 % ((param0 - -17) / 32);
        field_d = null;
        field_e = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new nk(2);
        field_b = 0;
        field_c = new sd();
    }
}
