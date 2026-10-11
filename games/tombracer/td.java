/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends vpa {
    private int field_t;
    private int field_p;
    private int field_s;
    private iu[] field_o;
    static int field_r;
    static String field_n;
    static String field_q;
    static String field_u;

    final static void b(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = c.field_g;
          var1 = var5;
          if (param0 != -62) {
            field_q = (String) null;
          }
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "td.C(" + param0 + ')');
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param0.field_f) {
            stackIn_6_0 = (param0.b((byte) -34)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param0 instanceof rj) {
            param4 = param4 & ((rj) (param0)).field_y;
          }
          if (param4) {
            if (var6_int != 0) {
              stackIn_13_0 = this.field_s;
            } else {
              stackIn_13_0 = this.field_t;
            }
          } else {
            stackIn_13_0 = this.field_p;
          }
          var7 = stackIn_13_0;
          if (param2 != 16777215) {
            return;
          }
          wca.a(var7, this.field_o, (param0.field_p - this.field_o[0].field_k >> 1) + (param0.field_n + param3), 20278, param1 + param0.field_i, param0.field_m);
          stackIn_18_0 = (param4) ? 16777215 : 7105644;
          var8 = stackIn_18_0;
          this.field_e.a(param0.field_o, param0.field_i + param1, param0.field_n + (param3 - 2), param0.field_m, param0.field_p, var8, -1, 1, 1, this.field_e.field_w);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("td.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public td() {
        this(2188450, 2591221, 9543);
    }

    private td(int param0, int param1, int param2) {
        this.field_p = param2;
        this.field_s = param1;
        this.field_o = nga.field_n;
        this.field_t = param0;
        this.field_e = ft.field_c;
    }

    public static void b(int param0) {
        if (param0 > -112) {
          return;
        }
        field_u = null;
        field_n = null;
        field_q = null;
    }

    static {
        field_r = 0;
        field_n = "Skeletons";
        field_u = "Crumbly blocks";
        field_q = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
