/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pbb implements wwa {
    static String field_a;

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (param1.field_f < var6_int) {
                var6_int = 1;
                L2: while (true) {
                  if (5 < var6_int) {
                    var6_int = 113 / ((-27 - param0) / 35);
                    break L0;
                  } else {
                    L3: {
                      var7 = var6_int + -5 + (param1.field_g + param2 + (param1.field_h + -(param1.field_h >> -652030847)));
                      var8 = -(2 * var6_int) + (param1.field_h >> 1074748993);
                      var9 = (param1.field_f - 4 >> 133978913) + (param3 - (-param1.field_r + -var6_int));
                      if ((dma.field_c ^ -1) < (var9 ^ -1)) {
                        break L3;
                      } else {
                        if (var9 >= dma.field_f) {
                          break L3;
                        } else {
                          L4: {
                            if (var7 > dma.field_d) {
                              dma.field_i[-1 + (var9 * dma.field_g - -var7)] = dla.a(8355711, dma.field_i[-1 + var9 * dma.field_g + var7] >> -1588388127);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          if (dma.field_a <= var7 + var8) {
                            break L3;
                          } else {
                            dma.field_i[dma.field_g * var9 - (-var7 - var8)] = dla.a(dma.field_i[var8 + var7 + dma.field_g * var9] >> 141862849, 8355711);
                            break L3;
                          }
                        }
                      }
                    }
                    dma.h(var7, var9, var8, 0);
                    var6_int++;
                    continue L2;
                  }
                }
              } else {
                var7 = 152 - -(48 * var6_int / param1.field_f);
                var8 = var7 | (var7 << -822635064 | var7 << -1761727952);
                dma.h(param1.field_g + param2, var6_int + param1.field_r + param3, param1.field_h, var8);
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("pbb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static ha a(asb param0, int param1, int param2, d param3, java.awt.Canvas param4) {
        RuntimeException var5 = null;
        long var6 = 0L;
        jp var8 = null;
        jaggl.OpenGL var9 = null;
        ha stackIn_11_0 = null;
        jp stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
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
                  if (param2 == -1588388127) {
                    var8.z(-31089);
                    stackIn_13_0 = (jp) (var8);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_11_0 = (ha) null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("pbb.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return (ha) ((Object) stackIn_13_0);
        }
    }

    public static void a(int param0) {
        java.awt.Canvas var2;
        field_a = null;
        if (param0 == -652030847) {
          return;
        } else {
          var2 = (java.awt.Canvas) null;
          pbb.a((asb) null, 54, 122, (d) null, (java.awt.Canvas) null);
          return;
        }
    }

    static {
        field_a = "Protect your VIP";
    }
}
