/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static sb field_c;
    static ea field_d;
    static int field_b;
    static String field_a;

    final static ed a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        ed stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -75) {
                break L1;
              } else {
                rf.a((byte) -48);
                break L1;
              }
            }
            if (bd.field_h != ci.field_e) {
              L2: {
                if (bd.field_h != kd.field_p) {
                  break L2;
                } else {
                  if (param1.equals(ic.field_m)) {
                    bd.field_h = mc.field_t;
                    stackIn_11_0 = sd.field_d;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              ic.field_m = param1;
              sd.field_d = null;
              bd.field_h = ci.field_e;
              stackIn_9_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("rf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ed) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ed) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == 13) {
          L0: {
            if (rj.field_f == 13) {
              stackIn_7_0 = 1;
              break L0;
            } else {
              if (ul.field_b <= 0) {
                stackIn_7_0 = 0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 != -56) {
            rf.a((byte) -36);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_c = new sb(256);
        field_a = "Logging in...";
    }
}
