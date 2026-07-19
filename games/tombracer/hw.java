/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw {
    static jea field_a;

    public static void a(int param0) {
        if (param0 > -44) {
            field_a = (jea) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2, bo param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kh var9 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (vpa.a(38)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = ql.field_k;
              var9.k(param2, -2988);
              if (param0 == -111) {
                L1: {
                  L2: {
                    var9.field_h = var9.field_h + param1;
                    var5 = var9.field_h;
                    param3.a(200, var9);
                    var6 = -var5 + var9.field_h;
                    var7 = param1;
                    if (0 != var7) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (-2 != (var7 ^ -1)) {
                        break L4;
                      } else {
                        if (var8 == 0) {
                          var9.d(var6, (byte) -111);
                          if (var8 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    if ((var7 ^ -1) == -3) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                  var9.b(var6, (byte) -105);
                  return;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("hw.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
    }
}
