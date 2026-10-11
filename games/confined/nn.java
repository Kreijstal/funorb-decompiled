/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends rk {
    int field_u;
    nn field_s;
    int field_m;
    int field_n;
    static fi field_q;
    int field_w;
    int field_r;
    static String field_v;
    static nf[] field_t;
    static bi field_o;
    static String[] field_p;

    final static al[] b(int param0) {
        if (param0 >= 46) {
          return new al[]{pi.field_T, tj.field_n, tk.field_f};
        }
        return (al[]) null;
    }

    public static void c(int param0) {
        if (param0 == -11650) {
          field_p = null;
          field_t = null;
          field_q = null;
          field_o = null;
          field_v = null;
          return;
        }
        field_p = (String[]) null;
        field_p = null;
        field_t = null;
        field_q = null;
        field_o = null;
        field_v = null;
    }

    final static boolean a(mi param0, mi param1, mi param2, int param3) {
        RuntimeException var4 = null;
        mi var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.b(0)) {
            return false;
          }
          if (!param0.a("commonui", 0)) {
            return false;
          }
          if (param3 <= 21) {
            var5 = (mi) null;
            nn.a((mi) null, (mi) null, (mi) null, -51);
          }
          if (param2.b(0) &&
            param2.a("commonui", 0)) {
            if (param1.b(0) &&
              param1.a("button.gif", 0)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("nn.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    nn(int param0, int param1, int param2, int param3, int param4) {
        this.field_n = param4;
        this.field_u = param0;
        this.field_r = param1;
        this.field_w = param3;
        this.field_m = param2;
    }

    static {
        field_q = new fi();
        field_v = "Fullscreen";
        field_p = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
