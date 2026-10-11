/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static hl[] field_c;
    static jl[] field_a;
    static int[] field_b;

    final static id[] a(ue param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ue stackIn_2_0 = null;
        String stackIn_2_1 = null;
        boolean stackIn_3_2 = false;
        id[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(param2, param3);
          stackIn_2_0 = (ue) (param0);
          stackIn_2_1 = (String) (param1);
          stackIn_3_2 = !(param3);
          var5 = ((ue) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_3_2, var4_int);
          stackIn_7_0 = ji.a(!param3, param0, var5, var4_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("fg.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 6) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, hl[] param1, int param2, int param3) {
        try {
          if (param0 != 32513) {
            field_b = (int[]) null;
          }
          u.field_c = new gi(param1);
          qf.field_g = param2;
          qc.field_g = param3;
          nc.a((byte) 83);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fg.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
