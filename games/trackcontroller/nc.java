/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends di {
    final ud a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        ud stackIn_3_0 = null;
        ud stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            if (!ej.a(false, var5)) {
              stackIn_3_0 = ef.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 < -106) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a(-109, (String) null);
                  break L1;
                }
              }
              L2: {
                var6 = (CharSequence) ((Object) param1);
                var3_int = uk.a(var6, 10);
                if (-1 <= (var3_int ^ -1)) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) < -131) {
                    break L2;
                  } else {
                    return TrackController.field_G;
                  }
                }
              }
              stackIn_10_0 = ef.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("nc.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    nc(lb param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(-117, param0) != ef.field_b) {
              if (param1 != 426) {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = ol.field_m;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("nc.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -131) {
            nc.a(false, 96);
            ki.a(true, 0, param0);
            return;
        }
        ki.a(true, 0, param0);
    }

    static {
    }
}
