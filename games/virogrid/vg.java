/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends ec {
    static String field_E;
    static String[] field_J;
    static i field_B;
    static v field_H;
    static String[] field_F;
    static ic field_I;

    public static void f(int param0) {
        field_E = null;
        field_H = null;
        if (param0 > -100) {
          return;
        }
        field_B = null;
        field_F = null;
        field_I = null;
        field_J = null;
    }

    private vg(int param0, int param1, int param2, int param3, ol param4, cd param5, fi param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_x = param6;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "vg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        ce var7 = null;
        ce var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 <= 73) {
            return;
          }
          super.a(param0, param1, param2, param3, param4, 125);
          var8 = ra.field_b;
          var7 = var8;
          if (var8 != null) {
            if (!this.a(param4, param1, param0, (byte) 46, param2)) {
              return;
            }
            if (this.field_o instanceof ik) {
              ((ik) (this.field_o)).a(82, this, var8);
              ra.field_b = null;
              return;
            }
            if (var8.field_o instanceof ik) {
              ((ik) (var8.field_o)).a(120, this, var8);
              ra.field_b = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("vg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_E = "Your turn";
        field_J = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
