/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static nc field_d;
    static hb field_b;
    static int[] field_e;
    static boolean[] field_a;
    static String field_c;

    final static void a(eh param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              nh.field_cb.a(param0, -66);
              sa.a((byte) 18, param1, param0);
              if (param2 == 160) {
                break L1;
              } else {
                field_b = (hb) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ki.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 64) {
            return;
        }
        field_e = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(byte param0) {
        if (!(vc.a(0))) {
            return;
        }
        gj.a(-1, 4, false);
        if (param0 != 116) {
            ki.a(76);
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        eh var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -18) {
                break L1;
              } else {
                var4 = (eh) null;
                ki.a((eh) null, -37, 108);
                break L1;
              }
            }
            if (param1) {
              stackIn_6_0 = ec.field_c.a(param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = pf.field_c.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ki.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_e = new int[]{64, 96, 96, 64, 96, 96, 64, 96, 64, 160};
        field_d = null;
        field_a = new boolean[64];
        field_b = new hb("");
        field_c = "This entry doesn't match";
    }
}
