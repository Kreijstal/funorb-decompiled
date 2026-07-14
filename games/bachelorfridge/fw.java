/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fw extends bw {
    int field_k;
    static ee field_f;
    int field_g;
    static jd field_i;
    static vr field_j;
    static long field_l;
    static pd[] field_h;

    final static void a(int param0, kv param1, int param2, int param3, boolean param4, kv param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        L0: {
          var13 = BachelorFridge.field_y;
          if (param4) {
            break L0;
          } else {
            var14 = null;
            kv[] discarded$1 = fw.a((byte) 13, (kv) null, (kv) null, (kv) null);
            break L0;
          }
        }
        L1: {
          param6 -= 3;
          if (param1.field_q >= param2) {
            break L1;
          } else {
            param2 = param1.field_q;
            break L1;
          }
        }
        var7 = 1 + param1.field_q;
        var8 = 1;
        L2: while (true) {
          if (var8 >= -1 + param1.field_p) {
            var7 = 0;
            var8 = 0;
            L3: while (true) {
              if (param1.field_p <= var8) {
                return;
              } else {
                var9 = 0;
                L4: while (true) {
                  if (var9 >= param2) {
                    var7 = var7 + (param1.field_q - param2);
                    var8++;
                    continue L3;
                  } else {
                    var10 = 255 & param1.field_v[var7];
                    var11 = param5.field_v[var7] & 255;
                    var12 = 0;
                    var12 = var12 | ((param3 >> -989578320) * var10 & 65280) << -1902216056;
                    var12 = var12 | 65280 & var10 * ((param3 & 65280) >> 1032496520);
                    var12 = var12 | var10 * (255 & param3) >> -52028888 & 255;
                    if (0 <= param1.field_v[var7]) {
                      tla.a(var9 + param0, -1898743704, var12, var8 + param6, var11);
                      var7++;
                      var9++;
                      continue L4;
                    } else {
                      var7++;
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var9 = 1;
            L5: while (true) {
              if (var9 >= param2) {
                var7 = var7 + (-param2 + param1.field_q + 1);
                var8++;
                continue L2;
              } else {
                L6: {
                  var10 = param1.field_v[var7] & 255;
                  if (var10 < (param1.field_v[var7 + param1.field_q] & 255)) {
                    var10 = param1.field_v[var7 - -param1.field_q] & 255;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var10 >= (255 & param1.field_v[-param1.field_q + var7])) {
                    break L7;
                  } else {
                    var10 = 255 & param1.field_v[var7 + -param1.field_q];
                    break L7;
                  }
                }
                L8: {
                  if (var10 < (param1.field_v[1 + param1.field_q + var7] & 255)) {
                    var10 = 255 & param1.field_v[1 + var7 - -param1.field_q];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var10 < (param1.field_v[-1 + (-param1.field_q + var7)] & 255)) {
                    var10 = param1.field_v[var7 - (param1.field_q - -1)] & 255;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var10 >= (255 & param1.field_v[param1.field_q + var7 - 1])) {
                    break L10;
                  } else {
                    var10 = 255 & param1.field_v[var7 + (param1.field_q - 1)];
                    break L10;
                  }
                }
                L11: {
                  if (var10 >= (255 & param1.field_v[1 + (var7 + -param1.field_q)])) {
                    break L11;
                  } else {
                    var10 = 255 & param1.field_v[-param1.field_q + (var7 + 1)];
                    break L11;
                  }
                }
                L12: {
                  if ((param1.field_v[var7 - -1] & 255) <= var10) {
                    break L12;
                  } else {
                    var10 = param1.field_v[1 + var7] & 255;
                    break L12;
                  }
                }
                L13: {
                  if (var10 >= (255 & param1.field_v[var7 - 1])) {
                    break L13;
                  } else {
                    var10 = 255 & param1.field_v[-1 + var7];
                    break L13;
                  }
                }
                var7++;
                param5.field_v[var7] = var10;
                var9++;
                continue L5;
              }
            }
          }
        }
    }

    final static kv[] a(byte param0, kv param1, kv param2, kv param3) {
        kv[] var5 = new kv[9];
        kv[] var4 = var5;
        var5[3] = param2;
        var5[5] = param3;
        if (param0 > -112) {
            field_h = null;
        }
        var5[4] = param1;
        return var4;
    }

    final static kv[] a(int param0, byte param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        kv[] var5 = new kv[50];
        kv[] var2 = var5;
        if (param1 != -74) {
            return null;
        }
        for (var3 = 0; 50 > var3; var3++) {
            var5[var3] = bs.a(qs.field_l[param0][var3], (byte) 112);
        }
        return var2;
    }

    fw(int param0, int param1) {
        ((fw) this).field_k = param0;
        ((fw) this).field_g = param1;
    }

    public static void a(int param0) {
        field_j = null;
        field_h = null;
        if (param0 != -8668) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new jd(1);
        field_h = new pd[50];
    }
}
