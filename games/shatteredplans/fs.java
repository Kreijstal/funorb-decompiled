/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    int field_x;
    bi field_c;
    int field_A;
    int field_s;
    bi field_e;
    bi field_b;
    pf field_i;
    lo field_m;
    int field_g;
    bi field_r;
    bi field_p;
    bi field_v;
    static bi[] field_a;
    bi field_o;
    int field_w;
    int[] field_u;
    static int field_z;
    int[] field_f;
    boolean[] field_h;
    bi field_n;
    int field_k;
    static fg field_l;
    bi field_d;
    um field_q;
    String field_t;
    static String field_j;
    static int[] field_y;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!sr.field_h) {
            return false;
          }
          if (em.field_h == 2 &&
            null != nd.field_k) {
            var3 = (CharSequence) ((Object) param1);
            if (nd.field_k.equals(ji.a(var3, true))) {
              var2_int = -10 % ((param0 + 1) / 38);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("fs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 4) {
          field_y = null;
          field_j = null;
          field_l = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        fs.a(-14, (String) null);
        field_y = null;
        field_j = null;
        field_l = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1) {
        gr.a(true, param1, 0);
        if (param0 <= 85) {
          field_l = (fg) null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        ol.field_e = param0;
        ri.field_O = param1;
        if (param2) {
          field_z = -11;
        }
    }

    fs(int param0, String param1, int param2, int param3, int param4) {
        try {
          this.field_k = param3;
          this.field_s = param4;
          this.field_x = param0;
          this.field_g = param2;
          this.field_t = param1;
          this.field_i = new pf();
          this.field_w = 0;
          this.field_f = null;
          this.field_u = new int[4];
          this.field_h = null;
          this.field_A = 0;
          this.field_m = null;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "fs.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_z = 360;
        field_l = new fg();
        field_j = "Breaking real-world laws";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$7ffe4b125357(int param0, boolean param1) {
        gr.a(true, param1, 0);
        if (param0 <= 85) {
          field_l = (fg) null;
        }
    }
}
