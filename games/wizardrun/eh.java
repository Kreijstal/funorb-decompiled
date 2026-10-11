/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh implements bf {
    private vd field_b;
    static String field_i;
    private int field_f;
    static String field_h;
    private int field_j;
    private int field_d;
    static uh field_e;
    private int field_a;
    private int field_c;
    private int field_g;

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        int var10 = 0;
        ub stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        vb var12 = null;
        var11 = wizardrun.field_H;
        try {
          if (!(param2 instanceof vb)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (ub) (param2);
          }
          var12 = (vb) (stackIn_4_0);
          ed.c(param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, this.field_a);
          if (var12 != null) {
          }
          var7 = -(2 * var12.field_G) + param2.field_r;
          var8 = var12.field_G + (param2.field_o + param0);
          if (!param3) {
            return;
          }
          var9 = param2.field_l + param1 + var12.field_J;
          ed.e(var8, var9, var8 + var7, var9, this.field_j);
          for (var10 = -1 + var12.d(0); var10 >= 0; var10--) {
            ed.a(var12.b(-10455, var10) * var7 / var12.e(1) + var8, var9, this.field_d, this.field_f);
          }
          if (this.field_b == null) {
            return;
          }
          this.field_b.b(var12.field_k, var8 + var7 / 2, var12.field_J + var9 + this.field_b.field_E, this.field_c, this.field_g);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("eh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 != 2) {
          eh.b(-17);
          field_e = null;
          field_i = null;
          return;
        }
        field_e = null;
        field_i = null;
    }

    eh(vd param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_d = param5;
          this.field_g = param2;
          this.field_j = param3;
          this.field_f = param6;
          this.field_c = param1;
          this.field_b = param0;
          this.field_a = param4;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "eh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static long a(int param0) {
        if (param0 != 2) {
          field_e = (uh) null;
          return d.a((byte) 75) - eg.field_C;
        }
        return d.a((byte) 75) - eg.field_C;
    }

    static {
        field_h = "Email is valid";
        field_e = null;
        field_i = " </col>Stage:<col=ffff00>";
    }
}
