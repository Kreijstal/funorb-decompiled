/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends gi {
    static he field_m;
    int field_o;
    int field_s;
    fk field_k;
    static qb field_q;
    static he field_l;
    int field_n;
    static String field_p;
    static int[] field_t;
    static vj field_h;
    int field_j;
    int field_i;
    static String field_r;

    public static void a(byte param0) {
        field_m = null;
        if (param0 != 111) {
          field_r = null;
          field_p = null;
          field_r = null;
          field_q = null;
          field_t = null;
          field_l = null;
          field_h = null;
          return;
        } else {
          field_p = null;
          field_r = null;
          field_q = null;
          field_t = null;
          field_l = null;
          field_h = null;
          return;
        }
    }

    final static nh a(int param0, vj param1, int param2, int param3) {
        Object var5 = null;
        if (param3 == 16711680) {
          if (!fl.a(param2, param1, param0, (byte) -98)) {
            return null;
          } else {
            return ta.a(param3 ^ 16732209);
          }
        } else {
          var5 = null;
          nh discarded$6 = fk.a(-100, (vj) null, -21, -59);
          if (!fl.a(param2, param1, param0, (byte) -98)) {
            return null;
          } else {
            return ta.a(param3 ^ 16732209);
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param5 >= wj.field_g) {
            break L0;
          } else {
            param1 = param1 - (wj.field_g + -param5);
            param5 = wj.field_g;
            break L0;
          }
        }
        L1: {
          if (param2 >= wj.field_e) {
            break L1;
          } else {
            param0 = param0 - (wj.field_e - param2);
            param2 = wj.field_e;
            break L1;
          }
        }
        L2: {
          if (wj.field_b >= param5 - -param1) {
            break L2;
          } else {
            param1 = -param5 + wj.field_b;
            break L2;
          }
        }
        L3: {
          if (param0 + param2 <= wj.field_j) {
            break L3;
          } else {
            param0 = -param2 + wj.field_j;
            break L3;
          }
        }
        if (param1 > 0) {
          if (-1 <= param0) {
            return;
          } else {
            var6 = param5 + wj.field_k * param2;
            var8 = 9 % ((22 - param4) / 43);
            var7 = wj.field_k - param1;
            param2 = -param0;
            L4: while (true) {
              if (-1 >= param2) {
                return;
              } else {
                param5 = -param1;
                L5: while (true) {
                  if (-1 <= param5) {
                    var6 = var6 + var7;
                    param2++;
                    continue L4;
                  } else {
                    var9 = wj.field_l[var6];
                    if (param3 < (255 & var9 >> 946325544)) {
                      if ((255 & var9 >> -1670962096) <= (255 & var9 >> -547912536)) {
                        L6: {
                          var10 = (510 & var9 >> -2084989105) + -60;
                          if (-256 > (var10 ^ -1)) {
                            var10 = 255;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var11 = 65280 & var9;
                        var11 = 65280 & (var11 >> -1217331039) - (var11 >> -2050321339);
                        var12 = (255 & var9) >> 894859075;
                        wj.field_l[var6] = li.a(li.a(var10 << 1462927920, var11), var12);
                        var6++;
                        param5++;
                        continue L5;
                      } else {
                        var6++;
                        param5++;
                        continue L5;
                      }
                    } else {
                      var6++;
                      param5++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    fk(int param0, int param1, int param2, int param3, int param4) {
        ((fk) this).field_j = param4;
        ((fk) this).field_n = param3;
        ((fk) this).field_s = param0;
        ((fk) this).field_i = param2;
        ((fk) this).field_o = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_t = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 255, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680};
        field_r = "Name is available";
    }
}
