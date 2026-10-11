/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ugb extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -119) {
            stackIn_4_0 = new nc(qua.field_b);
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ugb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, pgb param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = VoidHunters.field_G;
        try {
          var2_int = kmb.field_a;
          if (param1.field_a != param0) {
            if (param1.field_a == 4) {
              var2_intLifetime1 = bja.field_p[param1.field_a];
            } else {
              if (param1.field_i == wqa.field_a) {
                var2_intLifetime1 = rqa.field_m[param1.field_a];
              } else {
                var2_intLifetime1 = bja.field_p[param1.field_a];
              }
            }
          } else {
            if (param1.field_k) {
              var2_intLifetime1 = kmb.field_a;
            } else {
              if (0 == param1.field_f &&
                param1.field_h == 0) {
                var2_intLifetime1 = rqa.field_m[param1.field_a];
              } else {
                var2_intLifetime1 = bja.field_p[param1.field_a];
              }
            }
          }
          stackIn_14_0 = var2_intLifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ugb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    ugb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
