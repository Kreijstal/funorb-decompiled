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
                var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (var1_ref == null) {
                  break L1;
                } else {
                  try {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                    qk.field_b = 1 + (int)(var3.longValue() / 1048576L);
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return;
                  }
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
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
          field_b = null;
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
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param0 > 1) {
          if (param1 != null) {
            if (param1.length() < jc.field_m) {
              return true;
            } else {
              L0: {
                if (param1.length() > hh.field_c) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          we.a(64);
          if (param1 != null) {
            if (param1.length() >= jc.field_m) {
              if (param1.length() <= hh.field_c) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, byte param1, String param2, int param3, String param4) {
        di.field_n.field_K = di.field_n.field_K + wa.field_I.field_K;
        di.field_n.field_eb = param4;
        if (param1 != 21) {
          we.a(-38);
          di.field_n.field_V = param2;
          di.field_n.field_E = param0;
          wa.field_I.field_tb = wa.field_I.field_tb + wa.field_I.field_K;
          wa.field_I.field_K = param3;
          di.field_n.field_K = di.field_n.field_K - wa.field_I.field_K;
          wa.field_I.field_tb = wa.field_I.field_tb - wa.field_I.field_K;
          return;
        } else {
          di.field_n.field_V = param2;
          di.field_n.field_E = param0;
          wa.field_I.field_tb = wa.field_I.field_tb + wa.field_I.field_K;
          wa.field_I.field_K = param3;
          di.field_n.field_K = di.field_n.field_K - wa.field_I.field_K;
          wa.field_I.field_tb = wa.field_I.field_tb - wa.field_I.field_K;
          return;
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
