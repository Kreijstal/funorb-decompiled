/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fva extends loa {
    static int[] field_c;
    static String field_b;

    final void a(int param0, int param1, hj param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param1 < 73) {
            return;
        }
        try {
            for (var5_int = 1; -1 + param2.field_f > var5_int; var5_int += 2) {
                for (var6 = 1; param2.field_a - 1 > var6; var6 += 2) {
                    param2.a(var6, -1, 0, var5_int);
                }
            }
            this.a(param2, param3, param0, 21619);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fva.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final boolean a(int param0, hj param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 >= param2) {
                break L1;
              } else {
                if (0 >= param0) {
                  break L1;
                } else {
                  if (-1 + param1.field_f <= param2) {
                    break L1;
                  } else {
                    if (-1 + param1.field_a <= param0) {
                      break L1;
                    } else {
                      if (param3 <= -53) {
                        var5_int = param1.b((byte) -5, param0, param2);
                        if ((var5_int ^ -1) != 0) {
                          stackIn_13_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          return true;
                        }
                      } else {
                        stackIn_9_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("fva.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -112 % ((-17 - param0) / 46);
        field_c = null;
        field_b = null;
    }

    private final void a(hj param0, int param1, int param2, int param3) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hj var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 21619) {
                break L1;
              } else {
                var11 = (hj) null;
                this.a((hj) null, -65, 4, -46);
                break L1;
              }
            }
            var14 = this.a(4, param3 + -23971);
            var13 = var14;
            var12 = var13;
            var5 = var12;
            var6 = 0;
            L2: while (true) {
              if ((var6 ^ -1) <= -5) {
                break L0;
              } else {
                L3: {
                  var7 = var14[var6];
                  var8 = param1 + 2 * dma.field_k[var7][0];
                  var9 = dma.field_k[var7][1] * 2 + param2;
                  if (!this.a(var9, param0, var8, -74)) {
                    break L3;
                  } else {
                    this.a(param2, (byte) -42, param0, param1, var9, var8);
                    this.a(param0, var8, var9, 21619);
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("fva.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    fva(qea param0) {
        super(param0);
    }

    static {
        field_c = new int[8192];
        field_b = "<%0> chose reward: <%1>";
    }
}
