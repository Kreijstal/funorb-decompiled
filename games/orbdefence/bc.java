/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends hi {
    private String field_p;
    static int[] field_o;
    static String[] field_t;
    static hj[] field_q;
    private boolean field_n;
    static String field_s;
    static int field_r;

    final qd a(String param0, byte param1) {
        qj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        qd stackIn_3_0 = null;
        qd stackIn_9_0 = null;
        qd stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!dk.a(var4, 5408)) {
            stackIn_3_0 = vh.field_h;
            return stackIn_3_0;
          }
          if (!param0.equals(this.field_p)) {
            var3 = lf.a(param0, true);
            if (var3 != null &&
              var3.field_e == null) {
              this.field_n = var3.field_f;
              this.field_p = param0;
            } else {
              stackIn_9_0 = uj.field_b;
              return stackIn_9_0;
            }
          }
          if (param1 != -99) {
            this.b((byte) -37);
          }
          if (this.field_n) {
            stackIn_16_0 = nc.field_bb;
          } else {
            stackIn_16_0 = vh.field_h;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("bc.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        qj var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -11300) {
            field_s = (String) null;
          }
          var5 = (CharSequence) ((Object) param1);
          var3 = ki.a(-1, var5);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!param1.equals(this.field_p)) {
            var4 = lf.a(param1, true);
            if (var4 == null) {
              return null;
            }
            if (var4.field_e != null) {
              return null;
            }
            this.field_n = var4.field_f;
            this.field_p = param1;
          }
          if (this.field_n) {
            return kf.field_b;
          }
          stackIn_15_0 = j.field_c;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("bc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 != -97) {
          return;
        }
        field_t = null;
        field_s = null;
        field_o = null;
        field_q = null;
    }

    bc(vi param0) {
        super(param0);
        this.field_n = false;
    }

    final void b(byte param0) {
        this.field_p = null;
        if (param0 <= 59) {
          field_t = (String[]) null;
        }
    }

    static {
        field_s = "Type your email address again to make sure it's correct";
    }
}
