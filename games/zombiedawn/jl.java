/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends bj {
    static int[] field_s;
    private Object field_t;
    static cg field_v;
    static uc field_u;

    final Object d(byte param0) {
        if (param0 < 49) {
            field_s = null;
            return ((jl) this).field_t;
        }
        return ((jl) this).field_t;
    }

    public static void e(byte param0) {
        int var1 = -65;
        field_u = null;
        field_v = null;
        field_s = null;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            Object var3 = null;
            byte[] discarded$0 = jl.a((byte[]) null, (byte) 35);
            return false;
        }
        return false;
    }

    jl(Object param0, int param1) {
        super(param1);
        try {
            ((jl) this).field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "jl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param0.length;
              var3 = new byte[var2_int];
              if (param1 == 45) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            gp.a(param0, 0, var3, 0, var2_int);
            stackOut_2_0 = (byte[]) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("jl.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[8192];
        field_v = new cg(13, 0, 1, 0);
    }
}
