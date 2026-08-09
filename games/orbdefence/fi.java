/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi implements td {
    static String field_a;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        hj var8 = null;
        try {
          L0: {
            L1: {
              var6_int = param1 + param2.field_s;
              var7 = param0 + param2.field_n;
              if (param3 == -4394) {
                break L1;
              } else {
                fi.a(-11);
                break L1;
              }
            }
            L2: {
              tl.a(param2.field_r, var7, var6_int, param2.field_m, 127);
              var8 = wd.field_C[1];
              if (!(param2 instanceof s)) {
                break L2;
              } else {
                if (!((s) ((Object) param2)).field_D) {
                  break L2;
                } else {
                  var8.e((-var8.field_s + param2.field_m >> 149414625) + 1 + var6_int, (-var8.field_t + param2.field_r >> -249748127) + var7 + 1, 256);
                  break L2;
                }
              }
            }
            if (param2.d(-81)) {
              wh.a(-4 + param2.field_m, false, var6_int + 2, param2.field_r - 4, var7 + 2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("fi.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        String stackIn_10_0 = null;
        int stackIn_13_0 = 0;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3 = rg.a(param2, param1, 0);
            if (var3 == null) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param1.length() <= var4) {
                      break L3;
                    } else {
                      stackOut_6_0 = vg.a(param1.charAt(var4), -22118);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          stackIn_10_0 = pl.field_i;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var4++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = param0;
                  break L2;
                }
                if (stackIn_13_0 != 1) {
                  field_a = (String) null;
                  stackIn_16_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("fi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return (String) ((Object) stackIn_16_0);
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -8601) {
            return;
        }
        field_a = null;
    }

    static {
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
