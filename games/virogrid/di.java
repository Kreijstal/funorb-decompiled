/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends qe {
    private String field_s;
    static int field_o;
    static km field_n;
    private boolean field_p;
    static p field_v;
    static String field_q;
    static boolean[] field_r;
    static String field_t;
    static String field_u;

    final wl a(String param0, boolean param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        wl stackIn_2_0 = null;
        wl stackIn_10_0 = null;
        wl stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          if (!ee.a(88, var5)) {
            stackIn_2_0 = ee.field_c;
            return stackIn_2_0;
          }
          if (!param1) {
            var4 = (String) null;
            this.a((String) null, false);
          }
          if (!param0.equals(this.field_s)) {
            var3 = sh.a(648093968, param0);
            if (var3 != null &&
              var3.field_e == null) {
              this.field_s = param0;
              this.field_p = var3.field_a;
            } else {
              stackIn_10_0 = te.field_d;
              return stackIn_10_0;
            }
          }
          if (this.field_p) {
            stackIn_15_0 = bm.field_i;
          } else {
            stackIn_15_0 = ee.field_c;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("di.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(boolean param0) {
        if (param0) {
          return;
        }
        this.field_s = null;
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ck var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -26358) {
            field_u = (String) null;
          }
          var5 = (CharSequence) ((Object) param1);
          var3 = ce.a(-1, var5);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!param1.equals(this.field_s)) {
            var4 = sh.a(param0 ^ -648103910, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.field_e != null) {
              return null;
            }
            this.field_s = param1;
            this.field_p = var4.field_a;
          }
          if (this.field_p) {
            stackIn_16_0 = sh.field_sb;
            return stackIn_16_0;
          }
          stackIn_14_0 = dm.field_t;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("di.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    di(wa param0) {
        super(param0);
        this.field_p = false;
    }

    public static void h(int param0) {
        field_r = null;
        field_q = null;
        if (param0 >= 34) {
          field_v = null;
          field_u = null;
          field_t = null;
          field_n = null;
          return;
        }
        sc var2 = (sc) null;
        di.a((sc) null, -36, true);
        field_v = null;
        field_u = null;
        field_t = null;
        field_n = null;
    }

    final static id c(byte param0) {
        if (null == ca.field_Q) {
          ca.field_Q = new id();
          ca.field_Q.a((byte) 119, dj.field_h);
          ca.field_Q.field_n = 5;
          ca.field_Q.field_e = 2763306;
          ca.field_Q.field_g = 6;
          ca.field_Q.field_o = dk.field_j;
          ca.field_Q.field_k = 14;
          ca.field_Q.field_s = 7697781;
          ca.field_Q.field_q = 0;
          ca.field_Q.field_m = 4;
          if (param0 == -6) {
            return ca.field_Q;
          }
          return (id) null;
        }
        if (param0 == -6) {
          return ca.field_Q;
        }
        return (id) null;
    }

    final static void a(sc param0, int param1, boolean param2) {
        try {
          la.a(-1, 256, param2, param0);
          int var3_int = -19 / ((param1 - 65) / 42);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "di.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_v = new p();
        field_q = "The following settings need to be changed:  ";
        field_r = new boolean[64];
        field_t = "You have <%0> unread messages!";
        field_u = "Decline invitation to <%0>'s game";
    }
}
