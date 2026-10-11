/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me extends ca implements fb {
    private rg field_h;
    static int[] field_i;

    abstract String b(int param0, String param1);

    public final void a(int param0, rg param1) {
        try {
          if (param0 != 1330) {
            field_i = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "me.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(rg param0, int param1) {
        fe var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -55) {
            var4 = (fe) null;
            me.a(120, 109, 17, (String) null, 22, -46, 96, -16, (fe) null);
            this.a(true);
          } else {
            this.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("me.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract rc a(int param0, String param1);

    final static void a(boolean param0, int param1, int param2) {
        wd.field_j = param1;
        if (param0) {
          me.a(false, -47, 24);
          lb.field_j = param2;
          return;
        }
        lb.field_j = param2;
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 <= 118) {
          me.a((byte) 112);
        }
    }

    final String f(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return this.b(param0 - 1, this.field_h.field_k);
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = hd.a('_', (byte) -81, "", param0);
          var3 = vl.b(-1, param0);
          if (param1 < 85) {
            field_i = (int[]) null;
          }
          stackIn_7_0 = (param2.indexOf(param0) != -1) || (-1 != param2.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("me.W(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    me(rg param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean b(int param0) {
        if (param0 != -16000) {
          return false;
        }
        if (this.field_h.field_k == null) {
          return true;
        }
        if (this.field_h.field_k.length() != 0) {
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, int param7, fe param8) {
        try {
          ne.field_b = param6;
          c.field_b = param0;
          nf.field_i = param3;
          qi.field_a = param8;
          if (param2 <= 37) {
            fe var10 = (fe) null;
            me.a(44, 91, 102, (String) null, 8, 17, 66, 2, (fe) null);
          }
          of.field_c = param1;
          tl.field_c = param4;
          dk.field_h = param5;
          uh.field_f = param7;
          oh.field_h = (uh) ((Object) new tj());
          fd.field_d = new cd(param8);
          we.field_j = new dk(oh.field_h, fd.field_d);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "me.U(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final rc e(int param0) {
        if (param0 == 20456) {
          return this.a(95, this.field_h.field_k);
        }
        rg var3 = (rg) null;
        this.a(121, (rg) null);
        return this.a(95, this.field_h.field_k);
    }

    static {
        field_i = new int[8192];
    }
}
