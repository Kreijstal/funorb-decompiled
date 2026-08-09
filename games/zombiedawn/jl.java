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
            field_s = (int[]) null;
            return this.field_t;
        }
        return this.field_t;
    }

    public static void e(byte param0) {
        int var1 = -65 / ((-62 - param0) / 44);
        field_u = null;
        field_v = null;
        field_s = null;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            byte[] var3 = (byte[]) null;
            jl.a((byte[]) null, (byte) 35);
            return false;
        }
        return false;
    }

    jl(Object param0, int param1) {
        super(param1);
        try {
            this.field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.length;
              var3 = new byte[var2_int];
              if (param1 == 45) {
                break L1;
              } else {
                field_u = (uc) null;
                break L1;
              }
            }
            gp.a(param0, 0, var3, 0, var2_int);
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jl.J(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_s = new int[8192];
        field_v = new cg(13, 0, 1, 0);
    }
}
