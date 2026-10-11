/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr implements gj {
    private hu field_h;
    private int field_a;
    static ff field_b;
    private int field_i;
    static String field_g;
    static int field_c;
    static vd field_d;
    static String field_f;
    static dg field_e;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_g = null;
        field_e = null;
        if (param0 == 18086) {
          field_f = null;
          return;
        }
        cr.a(-74);
        field_f = null;
    }

    public cr() {
        this.field_h = gf.field_a;
        this.field_i = 1;
        this.field_a = 1;
    }

    cr(hu param0, int param1, int param2) {
        try {
          this.field_h = param0;
          this.field_a = param1;
          this.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "cr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
          field_f = (String) null;
          if (null == op.field_y) {
            return false;
          }
          if (un.field_c.a((byte) -96)) {
            return true;
          }
          return false;
        }
        if (null == op.field_y) {
          return false;
        }
        if (un.field_c.a((byte) -96)) {
          return true;
        }
        return false;
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          var7 = 43 / ((59 - param0) / 53);
          if (!param3.field_m &&
            !param3.b(45)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          this.field_h.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_q + "</u>", param4 + param3.field_t, param3.field_g + param2, param3.field_n, param3.field_i, var6_int, -1, this.field_a, this.field_i, this.field_h.field_p + this.field_h.field_G);
          if (!param3.b(93)) {
            return;
          }
          var8 = this.field_h.a(param3.field_q);
          var9 = this.field_h.field_p + this.field_h.field_G;
          var10 = param4 + param3.field_t;
          var11 = param2 + param3.field_g;
          if (this.field_a == 2) {
            var10 = var10 + (-var8 + param3.field_n);
          } else {
            if (this.field_a == 1) {
              var10 = var10 + (-var8 + param3.field_n >> 1);
            }
          }
          if (this.field_i == 2) {
            var11 = var11 + (-var9 + param3.field_i);
          } else {
            if (this.field_i == 1) {
              var11 = var11 + (-var9 + param3.field_i >> 1);
            }
          }
          ob.b(2, var8 + 4, 2 + var11, var9, var10 - 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("cr.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_g = "Cancel";
        field_b = new ff(12, 0, 1, 0);
        field_d = new vd();
        field_f = "Concluded";
    }
}
