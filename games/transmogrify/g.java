/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends fi {
    static hi field_y;
    static boolean field_A;
    static int field_z;

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        vl var7 = null;
        RuntimeException var7_ref = null;
        vl var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, param3 ^ 0, param4, param5);
          var8 = b.field_i;
          var7 = var8;
          if (var8 != null &&
            this.b(param5, param0, -1, param1, param4)) {
            if (this.field_m instanceof s) {
              ((s) (this.field_m)).a(this, 2089, var8);
              b.field_i = null;
            } else {
              if (var8.field_m instanceof s) {
                ((s) (var8.field_m)).a(this, param3 + 2090, var8);
                b.field_i = null;
              }
            }
          }
          if (param3 == -1) {
            return;
          }
          g.i(-34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_11_0 = var7_ref;
          stackIn_11_1 = new StringBuilder().append("g.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private g(int param0, int param1, int param2, int param3, ui param4, ma param5, qg param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_v = param6;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "g.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_y = null;
        if (param0 != 19224) {
          field_z = 81;
        }
    }

    static {
        field_y = new hi();
    }
}
