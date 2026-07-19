/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class npa implements dja {
    static int field_d;
    static byte[][] field_b;
    static int[] field_a;
    static double field_c;

    public final tv a(byte param0) {
        int var2 = -15 / ((-64 - param0) / 50);
        return (tv) ((Object) new umb());
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 115) {
                break L1;
              } else {
                field_b = (byte[][]) null;
                break L1;
              }
            }
            L2: {
              dma.h(param4, param0, param3 + 1, 10000536);
              dma.h(param4, param0 + param2, param3 - -1, 12105912);
              var5_int = 1;
              if (param0 - -var5_int < dma.field_c) {
                var5_int = dma.field_c - param0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param2;
              if (dma.field_f < var6 + param0) {
                var6 = dma.field_f + -param0;
                break L3;
              } else {
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = 48 * var7 / param2 + 152;
                var9 = var8 | (var8 << -61787536 | var8 << -1859139064);
                dma.field_i[dma.field_g * (param0 + var7) - -param4] = var9;
                dma.field_i[(param0 + var7) * dma.field_g - -param4 - -param3] = var9;
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "npa.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(byte param0, String param1, int param2) {
        ksa discarded$1 = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        vu var7 = null;
        vu var8 = null;
        faa var9 = null;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_7_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param1);
            if (!mn.a(var10, (byte) -118)) {
              stackOut_3_0 = tjb.field_Cb;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (iwa.field_b != 2) {
                stackOut_7_0 = ei.field_e;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = di.a(param1, param0 + -90);
                if (var8 == null) {
                  stackOut_11_0 = isa.a(dh.field_q, new String[]{param1}, 118);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  discarded$1 = mr.field_M.a(3, var8);
                  L1: while (true) {
                    var7 = (vu) ((Object) mr.field_M.a((byte) 72));
                    if (var7 == null) {
                      L2: {
                        var8.b(-3846);
                        var8.d((byte) -35);
                        vob.field_p = vob.field_p - 1;
                        var9 = dpa.field_p;
                        if (param0 == 90) {
                          break L2;
                        } else {
                          field_c = 0.9397013753078566;
                          break L2;
                        }
                      }
                      var9.h(param0 ^ 24405, param2);
                      var9.field_e = var9.field_e + 1;
                      var5 = var9.field_e;
                      var9.c(param0 + -90, 1);
                      var9.a(true, param1);
                      var9.e(var9.field_e - var5, -129);
                      stackOut_18_0 = null;
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var7.field_yb = var7.field_yb - 1;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("npa.C(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return (String) ((Object) stackIn_19_0);
            }
          }
        }
    }

    final static StringBuilder a(int param0, boolean param1, StringBuilder param2, char param3) {
        String discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              param2.setLength(param0);
              if (!param1) {
                break L1;
              } else {
                var7 = (String) null;
                discarded$2 = npa.a((byte) -60, (String) null, -96);
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              if (param0 <= var5) {
                stackOut_6_0 = (StringBuilder) (param2);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param2.setCharAt(var5, param3);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("npa.E(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_a = (int[]) null;
            field_b = (byte[][]) null;
            return;
        }
        field_b = (byte[][]) null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = (int[]) null;
            return (tv[]) ((Object) new umb[param1]);
        }
        return (tv[]) ((Object) new umb[param1]);
    }

    static {
        field_b = new byte[50][];
        field_a = new int[128];
        field_c = 0.0;
    }
}
