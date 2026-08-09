/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends rk {
    static int field_n;
    static int field_m;

    final static em a(int param0, long param1, boolean param2, String param3, String param4) {
        RuntimeException var6 = null;
        mk stackIn_6_0 = null;
        ii stackIn_8_0 = null;
        ai stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != 0L) {
                break L1;
              } else {
                if (param3 != null) {
                  stackIn_8_0 = new ii(param3, param4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param2) {
              stackIn_6_0 = new mk(param1, param4);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == -26547) {
                  break L2;
                } else {
                  field_n = 56;
                  break L2;
                }
              }
              stackIn_12_0 = new ai(param1, param4);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("g.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (em) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (em) ((Object) stackIn_8_0);
          } else {
            return (em) ((Object) stackIn_12_0);
          }
        }
    }

    final static void b(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2 = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                        pi.field_H = (int)(var3.longValue() / 1048576L) - -1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2_ref = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
                if (param0 == -1) {
                  break L0;
                } else {
                  field_n = -78;
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private g() throws Throwable {
        throw new Error();
    }

    static {
    }
}
