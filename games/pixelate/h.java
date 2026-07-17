/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends qm {
    static String field_O;
    static ge field_N;
    static int[] field_Y;
    static String field_U;
    static String field_S;
    static int[][] field_Z;
    static tg field_X;
    static int field_T;
    static boolean field_R;
    static tf[] field_V;
    static boolean[] field_P;
    static int field_Q;
    static int field_W;

    h(String param0, fn param1, boolean param2) {
        this(param0, param1);
        try {
            ((h) this).field_M = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "h.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private h(String param0, fn param1) {
        this(param0, field_X.field_r, param1);
        try {
            ((h) this).field_y = field_X.field_t;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "h.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private h(String param0, eb param1, fn param2) {
        super(param0, param1, param2);
        try {
            ((h) this).field_y = field_X.field_t;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "h.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ((h) this).field_M = !((h) this).field_M ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, tf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ti.a(false);
              t.a(param1.field_G, param1.field_A, param1.field_B);
              if (param0 < -58) {
                break L1;
              } else {
                field_V = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("h.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static io[] a() {
        return new io[]{ig.field_e, vm.field_a, cd.field_c};
    }

    public static void a(int param0) {
        field_U = null;
        field_P = null;
        field_S = null;
        field_N = null;
        field_X = null;
        field_V = null;
        field_Z = null;
        field_Y = null;
        field_O = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new int[8192];
        field_O = "Single-Player";
        field_S = "Join";
        field_N = new ge();
        field_P = new boolean[64];
        field_Q = -1;
    }
}
