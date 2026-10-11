/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qva extends kva implements hdb {
    static gj field_k;
    static oib field_j;

    public final void b(int param0) {
        super.b(param0);
    }

    qva(jp param0, int param1, boolean param2, int[][] param3) {
        super(param0, 34067, qua.field_d, mj.field_f, 6 * param1 * param1, param2);
        int var5_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7 = 0;
        int var5_intLifetime1;
        try {
          this.field_h.a((ura) (this), -110);
          if (param2) {
            for (var5_int = 0; var5_int < 6; var5_int++) {
              this.a((byte) 14, 34069 + var5_int, param1, param1, param3[var5_int]);
            }
            return;
          }
          var7 = 0;
          var5_intLifetime1 = var7;
          while (var7 < 6) {
            jaggl.OpenGL.glTexImage2Di(var7 + 34069, 0, this.e((byte) -31), param1, param1, 0, una.a(-29328, this.field_f), this.field_h.field_Nc, param3[var7], 0);
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("qva.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void a(tu param0, int param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qva.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != 6) {
          qva.a(-55);
          field_k = null;
          return;
        }
        field_k = null;
    }

    static {
        field_k = new gj();
        field_j = null;
    }
}
