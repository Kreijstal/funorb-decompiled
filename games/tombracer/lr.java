/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends RuntimeException {
    String field_d;
    static jea field_b;
    Throwable field_a;
    static String field_e;
    static int field_c;

    final static int a(una param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == una.field_a) {
            stackIn_23_0 = 5120;
            return stackIn_23_0;
          }
          if (param0 == una.field_k) {
            stackIn_3_0 = 5122;
            return stackIn_3_0;
          }
          if (param0 == una.field_m) {
            stackIn_6_0 = 5124;
            return stackIn_6_0;
          }
          if (una.field_g == param0) {
            stackIn_9_0 = 5121;
            return stackIn_9_0;
          }
          if (una.field_f == param0) {
            stackIn_21_0 = 5123;
            return stackIn_21_0;
          }
          if (param0 == una.field_i) {
            stackIn_19_0 = 5125;
            return stackIn_19_0;
          }
          if (param0 == una.field_l) {
            stackIn_14_0 = 5131;
            return stackIn_14_0;
          }
          if (param0 == una.field_h) {
            stackIn_17_0 = 5126;
            return stackIn_17_0;
          }
          if (param1 == 5126) {
            throw new IllegalArgumentException("");
          }
          stackIn_26_0 = 1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("lr.B(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final static float a(float param0, int param1, float param2, float param3) {
        if (param1 == 5122) {
          return param0 * (-param3 + param2) + param3;
        }
        field_b = (jea) null;
        return param0 * (-param3 + param2) + param3;
    }

    lr(Throwable param0, String param1) {
        this.field_a = param0;
        this.field_d = param1;
    }

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        if (param0) {
          una var2 = (una) null;
          lr.a((una) null, 48);
        }
    }

    static {
        field_e = "Nutritious and delicious, there are rumours that this foul-smelling concoction has helpful effects when heated.";
    }
}
