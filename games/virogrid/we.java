/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static String field_i;
    static String field_b;
    static String field_f;
    static int field_l;
    static int field_a;
    static km field_c;
    static mg field_e;
    static float field_k;
    static int field_d;
    static int field_h;
    static String field_j;
    static volatile int field_g;

    final static void a(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 1) {
                break L0;
              } else {
                we.a(false, true);
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref == null) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                        qk.field_b = 1 + (int)(var3.longValue() / 1048576L);
                        decompiledRegionSelector0 = 0;
                        break L3;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var2 = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L4;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var1 = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_e = null;
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (!(!ag.c(-116))) {
            param1 = false;
        }
        vm.a((byte) 32, param1);
        int discarded$0 = -26808;
        rn.a();
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 1) {
                break L1;
              } else {
                we.a(64);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length() < jc.field_m) {
                  break L2;
                } else {
                  if (param1.length() > hh.field_c) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("we.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, byte param1, String param2, int param3, String param4) {
        try {
            di.field_n.field_K = di.field_n.field_K + wa.field_I.field_K;
            di.field_n.field_eb = param4;
            di.field_n.field_V = param2;
            di.field_n.field_E = param0;
            wa.field_I.field_tb = wa.field_I.field_tb + wa.field_I.field_K;
            wa.field_I.field_K = 0;
            di.field_n.field_K = di.field_n.field_K - wa.field_I.field_K;
            wa.field_I.field_tb = wa.field_I.field_tb - wa.field_I.field_K;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "we.C(" + param0 + ',' + 21 + ',' + (param2 != null ? "{...}" : "null") + ',' + 0 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Report abuse";
        field_b = "Graphics: ";
        field_k = 0.0f;
        field_f = "Create unrated game";
        field_j = "Loading fonts";
        field_h = 2048;
        field_d = 20;
        field_g = 0;
    }
}
