/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends vg {
    static String field_j;
    static int field_f;
    static nh field_h;
    int[] field_i;
    int field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        var15 = TombRacer.field_G ? 1 : 0;
        var6 = param0 - param1;
        var7 = 0 / ((49 - param2) / 45);
        var8 = -param5 + param4;
        if (0 != var6) {
          if (var8 != 0) {
            L0: {
              var13 = (var8 << 12) / var6;
              var14 = -(var13 * param1 >> 12) + param5;
              if (param1 < pka.field_b) {
                var11 = var14 + (var13 * pka.field_b >> 12);
                var9 = pka.field_b;
                break L0;
              } else {
                if (param1 <= ss.field_c) {
                  var9 = param1;
                  var11 = param5;
                  break L0;
                } else {
                  var11 = (var13 * ss.field_c >> 12) + var14;
                  var9 = ss.field_c;
                  break L0;
                }
              }
            }
            L1: {
              if (param0 < pka.field_b) {
                var12 = var14 + (var13 * pka.field_b >> 12);
                var10 = pka.field_b;
                break L1;
              } else {
                if (ss.field_c < param0) {
                  var12 = (ss.field_c * var13 >> 12) + var14;
                  var10 = ss.field_c;
                  break L1;
                } else {
                  var10 = param0;
                  var12 = param4;
                  break L1;
                }
              }
            }
            L2: {
              if (gca.field_d <= var11) {
                if (hc.field_h >= var11) {
                  break L2;
                } else {
                  var11 = hc.field_h;
                  var9 = (hc.field_h + -var14 << 12) / var13;
                  break L2;
                }
              } else {
                var9 = (-var14 + gca.field_d << 12) / var13;
                var11 = gca.field_d;
                break L2;
              }
            }
            L3: {
              if (gca.field_d <= var12) {
                if (var12 > hc.field_h) {
                  var10 = (hc.field_h - var14 << 12) / var13;
                  var12 = hc.field_h;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var12 = gca.field_d;
                var10 = (gca.field_d + -var14 << 12) / var13;
                break L3;
              }
            }
            ara.a(0, param3, var9, var10, var11, var12);
            return;
          } else {
            rla.a(param0, param1, (byte) -2, param3, param5);
            return;
          }
        } else {
          L4: {
            if (var8 != 0) {
              ui.a(param5, 109, param3, param1, param4);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        int var1 = -6;
        field_j = null;
        field_h = null;
    }

    final static roa b(int param0) {
        roa var1 = new roa();
        var1.field_f = new up(0, 5);
        var1.field_f.b(1, 10);
        var1.field_t = 14;
        var1.field_k = 150;
        var1.field_x = true;
        var1.field_p = 25;
        var1.field_n = 524288;
        var1.field_o = 16;
        var1.field_h = 40;
        var1.field_m = true;
        var1.field_b = 2;
        var1.field_c = true;
        var1.field_l = 524288;
        var1.field_a = 524288;
        var1.field_d = 0;
        return var1;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= ara.field_xb) {
                ara.field_xb = 0;
                break L0;
              } else {
                wea.field_d[var1_int] = null;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "ik.C(" + 5 + ')');
        }
    }

    private ik() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 5;
        field_j = "Resigned";
    }
}
