/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w {
    static wd field_e;
    bf field_o;
    static String field_i;
    static int field_a;
    static int field_l;
    static String field_j;
    static int field_r;
    bf field_q;
    bf field_n;
    bf field_h;
    int field_k;
    long field_m;
    ni field_d;
    ni field_f;
    byte field_g;
    volatile int field_b;
    volatile int field_c;
    fk field_p;

    abstract boolean b(byte param0);

    abstract void d(int param0);

    final static void a(int param0, String param1) {
        try {
          if (param0 != 61) {
            String var3 = (String) null;
            w.a(86, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "w.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        int var2 = -6 / ((-53 - param0) / 34);
        return this.f(1) >= 20 ? true : false;
    }

    abstract void a(byte param0);

    public static void c(int param0) {
        field_i = null;
        int var1 = 114 / ((param0 + 33) / 34);
        field_e = null;
        field_j = null;
    }

    abstract void a(Object param0, boolean param1, byte param2);

    final static dd[] a(int param0, int param1, int param2, rh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dd[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -54 % ((36 - param0) / 55);
          if (ha.a(param3, -32180, param2, param1)) {
            stackIn_4_0 = fc.b(-128);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (dd[]) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("w.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final fk a(int param0, boolean param1, int param2, int param3, byte param4) {
        fk stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        long var6;
        fk var8;
        var6 = (long)param2 + ((long)param3 << 32);
        var8 = new fk();
        stackIn_2_0 = var8;
        stackIn_3_1 = (!param1) ? false : true;
        stackIn_2_0.field_v = stackIn_3_1;
        var8.field_E = param4;
        var8.field_j = var6;
        if (param0 <= 126) {
          field_a = 47;
        }
        if (!param1) {
          if (this.e(-83) >= 20) {
            throw new RuntimeException();
          }
          this.field_n.a(var8, -1089421886);
          return var8;
        }
        if (this.f(1) >= 20) {
          throw new RuntimeException();
        }
        this.field_o.a(var8, -1089421886);
        return var8;
    }

    final int e(int param0) {
        if (param0 <= -52) {
          return this.field_n.a((byte) 67) + this.field_h.a((byte) 20);
        }
        this.field_d = (ni) null;
        return this.field_n.a((byte) 67) + this.field_h.a((byte) 20);
    }

    final boolean b(int param0) {
        int var2 = -126 % ((73 - param0) / 37);
        return this.e(-88) >= 20 ? true : false;
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_6_0 = null;
          String stackIn_12_0 = null;
          String stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = fleas.field_A ? 1 : 0;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (eb.a("getcookies", param1, param0 - 250));
              var5 = m.a(';', 122, var4);
              for (var6 = param0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_6_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (lj.field_g == null) {
              stackIn_14_0 = param1.getParameter("settings");
              return stackIn_14_0;
            }
            stackIn_12_0 = lj.field_g;
            return stackIn_12_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var2_ref;
            stackIn_17_1 = new StringBuilder().append("w.J(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int f(int param0) {
        if (param0 == 1) {
          return this.field_o.a((byte) 5) + this.field_q.a((byte) 9);
        }
        this.field_g = (byte) 23;
        return this.field_o.a((byte) 5) + this.field_q.a((byte) 9);
    }

    w() {
        this.field_o = new bf();
        this.field_q = new bf();
        this.field_n = new bf();
        this.field_h = new bf();
        this.field_d = new ni(6);
        this.field_c = 0;
        this.field_g = (byte) 0;
        this.field_b = 0;
        this.field_f = new ni(10);
    }

    static {
        field_e = new wd();
        field_i = "<%0>Trapdoor:<%1> if a flea stands on one of these, it opens and the flea falls through.";
        field_j = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
