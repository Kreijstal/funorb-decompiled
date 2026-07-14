/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pbb implements wwa {
    static String field_a;

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        var6 = 0;
        L0: while (true) {
          if (param1.field_f < var6) {
            var6 = 1;
            L1: while (true) {
              if (5 < var6) {
                var6 = 113 / ((-27 - param0) / 35);
                return;
              } else {
                L2: {
                  var7 = var6 + -5 + (param1.field_g + param2 + (param1.field_h + -(param1.field_h >> -652030847)));
                  var8 = -(2 * var6) + (param1.field_h >> 1074748993);
                  var9 = (param1.field_f - 4 >> 133978913) + (param3 - (-param1.field_r + -var6));
                  if (dma.field_c > var9) {
                    break L2;
                  } else {
                    if (var9 >= dma.field_f) {
                      break L2;
                    } else {
                      L3: {
                        if (var7 > dma.field_d) {
                          dma.field_i[-1 + (var9 * dma.field_g - -var7)] = dla.a(8355711, dma.field_i[-1 + var9 * dma.field_g + var7] >> -1588388127);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (dma.field_a <= var7 + var8) {
                        break L2;
                      } else {
                        dma.field_i[dma.field_g * var9 - (-var7 - var8)] = dla.a(dma.field_i[var8 + var7 + dma.field_g * var9] >> 141862849, 8355711);
                        break L2;
                      }
                    }
                  }
                }
                dma.h(var7, var9, var8, 0);
                var6++;
                continue L1;
              }
            }
          } else {
            var7 = 152 - -(48 * var6 / param1.field_f);
            var8 = var7 | (var7 << -822635064 | var7 << -1761727952);
            dma.h(param1.field_g + param2, var6 + param1.field_r + param3, param1.field_h, var8);
            var6++;
            continue L0;
          }
        }
    }

    final static ha a(asb param0, int param1, int param2, d param3, java.awt.Canvas param4) {
        long var6 = 0L;
        jp var8 = null;
        jaggl.OpenGL var9 = null;
        if (!sab.e((byte) 121)) {
          throw new RuntimeException("");
        } else {
          if (!gpb.a("jaggl", (byte) 114)) {
            throw new RuntimeException("");
          } else {
            var9 = new jaggl.OpenGL();
            var6 = var9.init(param4, 8, 8, 8, 24, 0, param1);
            if (var6 == 0L) {
              throw new RuntimeException("");
            } else {
              var8 = new jp(var9, param4, var6, param3, param0, param1);
              if (param2 != -1588388127) {
                return null;
              } else {
                var8.z(-31089);
                return (ha) (Object) var8;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_a = null;
        if (param0 == -652030847) {
          return;
        } else {
          var2 = null;
          ha discarded$2 = pbb.a((asb) null, 54, 122, (d) null, (java.awt.Canvas) null);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Protect your VIP";
    }
}
