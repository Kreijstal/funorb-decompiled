/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends de implements ih, wr {
    static byte[][][] field_j;
    af field_h;
    static int field_k;
    static boolean field_m;
    static fj field_l;
    static String[] field_n;
    static String field_i;

    final ba a(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ba stackIn_2_0 = null;
        ba stackIn_6_0 = null;
        ba stackIn_10_0 = null;
        ba stackIn_13_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_h.a(-32410);
          var3 = this.field_h.i(0);
          if (param0 < 24) {
            stackIn_2_0 = (ba) null;
            return stackIn_2_0;
          }
          var4 = this.field_h.c(false);
          var5 = hd.b(false);
          if (var4 < 1890) {
            stackIn_6_0 = ir.field_a;
            return stackIn_6_0;
          }
          if (var5 - 3 < var4) {
            stackIn_10_0 = ir.field_a;
            return stackIn_10_0;
          }
          if (!vg.a(-4151, var3, var2_int, var4)) {
            stackIn_13_0 = ir.field_a;
            return stackIn_13_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return ir.field_a;
        }
        return qm.field_G;
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 == -3) {
          field_n = null;
          field_j = (byte[][][]) null;
          field_i = null;
          return;
        }
        df.g(-60);
        field_n = null;
        field_j = (byte[][][]) null;
        field_i = null;
    }

    public df() {
    }

    public final void a(int param0, kp param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 >= -10) {
            field_m = false;
            this.b(18340);
          } else {
            this.b(18340);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("df.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final boolean c(int param0) {
        if (param0 != -12211) {
          this.c(1);
          return this.field_h.e(false);
        }
        return this.field_h.e(false);
    }

    final String f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        if (param0 >= -68) {
          return (String) null;
        }
        try {
          var2_int = this.field_h.a(-32410);
          var3 = this.field_h.i(0);
          var4 = this.field_h.c(false);
          var5 = hd.b(false);
          if (1890 <= var4 &&
            var4 <= -3 + var5) {
            if (vg.a(-4151, var3, var2_int, var4)) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
          } else {
            stackIn_6_0 = Vertigo2.a(new String[]{"1890", Integer.toString(-3 + var5)}, ea.field_f, 7);
            return stackIn_6_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return lb.field_a;
    }

    public final void a(byte param0, kp param1) {
        try {
          if (param0 <= 16) {
            field_j = (byte[][][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "df.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new String[]{"By rating", "By win percentage"};
        field_i = "Type your email address again to make sure it's correct";
    }
}
