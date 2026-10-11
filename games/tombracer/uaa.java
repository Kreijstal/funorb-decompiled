/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uaa {
    static String field_d;
    static jea field_b;
    static String field_a;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 5193) {
          return;
        }
        field_a = null;
        field_d = null;
    }

    final static int a(byte param0, gqa param1) {
        int var2_int = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = sva.field_d;
          if (param1.field_d != 2) {
            if (param1.field_d == 4) {
              var2_intLifetime1 = bma.field_t[param1.field_d];
            } else {
              if (~param1.field_i != ~rb.field_r) {
                var2_intLifetime1 = bma.field_t[param1.field_d];
              } else {
                var2_intLifetime1 = pm.field_a[param1.field_d];
              }
            }
          } else {
            if (param1.field_m) {
              var2_intLifetime1 = sva.field_d;
            } else {
              if (0 == param1.field_c &&
                param1.field_o == 0) {
                var2_intLifetime1 = pm.field_a[param1.field_d];
              } else {
                var2_intLifetime1 = bma.field_t[param1.field_d];
              }
            }
          }
          var3 = 42 / ((param0 + 71) / 44);
          stackIn_14_0 = var2_intLifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("uaa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_d = "Gold Medal Award";
        field_c = "<%0> wants to join";
    }
}
