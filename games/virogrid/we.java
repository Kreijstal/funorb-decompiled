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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
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
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 == null) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        var2 = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                        qk.field_b = 1 + (int)(var3.longValue() / 1048576L);
                        decompiledRegionSelector0 = 0;
                        break L3;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var2_ref = decompiledCaughtException;
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
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -104) {
          field_b = (String) null;
          field_c = null;
          field_e = null;
          field_j = null;
          field_f = null;
          field_i = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_j = null;
          field_f = null;
          field_i = null;
          return;
        }
    }

    final static void a(boolean param0, boolean param1) {
        L0: {
          if (ag.c(-116)) {
            param1 = false;
            break L0;
          } else {
            break L0;
          }
        }
        vm.a((byte) 32, param1);
        if (param0) {
          field_k = -1.6507269144058228f;
          rn.a(-26808);
          return;
        } else {
          rn.a(-26808);
          return;
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_7_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("we.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, byte param1, String param2, int param3, String param4) {
        try {
            di.field_n.field_K = di.field_n.field_K + wa.field_I.field_K;
            di.field_n.field_eb = param4;
            if (param1 != 21) {
                we.a(-38);
            }
            di.field_n.field_V = param2;
            di.field_n.field_E = param0;
            wa.field_I.field_tb = wa.field_I.field_tb + wa.field_I.field_K;
            wa.field_I.field_K = param3;
            di.field_n.field_K = di.field_n.field_K - wa.field_I.field_K;
            wa.field_I.field_tb = wa.field_I.field_tb - wa.field_I.field_K;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "we.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
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
