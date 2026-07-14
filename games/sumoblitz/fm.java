/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm implements mh {
    static String field_a;
    static qr field_b;

    public static void a(byte param0) {
        if (param0 >= -100) {
            fm.a((byte) -19);
        }
        field_a = null;
        field_b = null;
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          if (param2 == 5592405) {
            break L0;
          } else {
            fm.a((byte) 119);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (param0.field_p < var6) {
            var6 = 1;
            L2: while (true) {
              if (var6 > 5) {
                return;
              } else {
                L3: {
                  var7 = -(param0.field_q >> -790897375) + (param0.field_q + (param4 + param0.field_r) + (-5 - -var6));
                  var8 = -(2 * var6) + (param0.field_q >> 1987058209);
                  var9 = (-4 + param0.field_p >> 984733729) + (param1 + param0.field_v + var6);
                  if (var9 < lk.field_i) {
                    break L3;
                  } else {
                    if (lk.field_e <= var9) {
                      break L3;
                    } else {
                      L4: {
                        if (lk.field_k < var7) {
                          lk.field_a[var9 * lk.field_b - (-var7 - -1)] = eb.a(16711422, lk.field_a[var7 + (var9 * lk.field_b - 1)]) >> -753764543;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (var7 + var8 < lk.field_j) {
                        lk.field_a[var8 + (var9 * lk.field_b - -var7)] = eb.a(8355711, lk.field_a[var9 * lk.field_b + var7 - -var8] >> -1558945407);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                lk.f(var7, var9, var8, 0);
                var6++;
                continue L2;
              }
            }
          } else {
            var7 = 152 - -(48 * var6 / param0.field_p);
            var8 = var7 << -779123760 | var7 << -1695338296 | var7;
            lk.f(param4 - -param0.field_r, var6 + param0.field_v + param1, param0.field_q, var8);
            var6++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Age:";
        field_b = new qr();
    }
}
