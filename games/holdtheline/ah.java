/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    hl field_e;
    static rg field_a;
    static int field_b;
    static gn field_d;
    private hl field_c;

    final static int a(vj param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lb var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10Lifetime1;
        try {
          var11 = (lb) (param0);
          var5 = var11.field_r.field_f;
          var6 = var11.field_s.field_f;
          var7 = var11.field_r.field_h;
          var8 = var11.field_s.field_h;
          if (var5 == var6) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = 27 / ((param1 - 31) / 32);
          if (var5 > var6) {
            var10 = var5;
            var5 = var6;
            var6 = var10;
            var10Lifetime1 = var7;
            var7 = var8;
            var8 = var10Lifetime1;
          }
          if (param2 <= var5) {
            stackIn_11_0 = 0;
            return stackIn_11_0;
          }
          if (var6 < param2) {
            return 0;
          }
          if ((-var5 + param2) * (-var7 + var8) <= (-var7 + param3) * (-var5 + var6)) {
            stackIn_16_0 = 0;
            return stackIn_16_0;
          }
          stackIn_14_0 = 1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ah.M(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final hl c(byte param0) {
        hl var2 = this.field_c;
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        }
        int var3 = 110 % ((32 - param0) / 54);
        this.field_c = var2.field_h;
        return var2;
    }

    final static void b(boolean param0) {
        oi.field_f = param0 ? true : false;
        aa.field_j = null;
        dg.field_b = null;
        qg.field_b = null;
        pb.field_a = null;
    }

    private final void a(hl param0, byte param1, ah param2) {
        hl var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.field_e.field_a;
          this.field_e.field_a = param0.field_a;
          param0.field_a.field_h = this.field_e;
          if (param0 != this.field_e) {
            param0.field_a = param2.field_e.field_a;
            param0.field_a.field_h = param0;
            var4.field_h = param2.field_e;
            param2.field_e.field_a = var4;
          }
          if (param1 < -98) {
            return;
          }
          field_b = 68;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("ah.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
        field_d = null;
    }

    final boolean b(int param0) {
        if (param0 == 0) {
          return this.field_e.field_h == this.field_e ? true : false;
        }
        field_d = (gn) null;
        return this.field_e.field_h == this.field_e ? true : false;
    }

    final static void a(hl param0, int param1, hl param2) {
        try {
          if (null != param2.field_a) {
            param2.d(0);
          }
          param2.field_h = param0;
          param2.field_a = param0.field_a;
          if (param1 != 0) {
            field_a = (rg) null;
          }
          param2.field_a.field_h = param2;
          param2.field_h.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ah.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, hl param1) {
        if (param0 >= -61) {
          return;
        }
        try {
          if (param1.field_a != null) {
            param1.d(0);
          }
          param1.field_h = this.field_e;
          param1.field_a = this.field_e.field_a;
          param1.field_a.field_h = param1;
          param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ah.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, byte param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (il.field_a != null &&
            !il.field_a.equals(param1.getParameter("settings"))) {
            var3 = il.field_a;
            var4 = var3;
            var4 = var3;
          }
          if (null != hg.field_M &&
            !hg.field_M.equals(param1.getParameter("session"))) {
            var4 = hg.field_M;
          }
          if (param2 > 6) {
            stackIn_10_0 = ab.a((String) (var3), (String) (var4), param0, (byte) -118, -1);
            return stackIn_10_0;
          }
          stackIn_8_0 = (java.net.URL) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ah.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        hl var2;
        int var3;
        var3 = HoldTheLine.field_D;
        while (true) {
          var2 = this.field_e.field_h;
          if (this.field_e != var2) {
            var2.d(0);
            continue;
          }
          break;
        }
        if (param0 == 29020) {
          this.field_c = null;
          return;
        }
        field_d = (gn) null;
        this.field_c = null;
        return;
    }

    final hl d(byte param0) {
        if (param0 != 124) {
          return (hl) null;
        }
        hl var2 = this.field_e.field_a;
        if (this.field_e == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final hl c(int param0) {
        hl var2 = null;
        hl var2Lifetime1;
        if (param0 != -4140) {
          this.field_e = (hl) null;
          var2 = this.field_c;
          if (this.field_e == var2) {
            this.field_c = null;
            return null;
          }
          this.field_c = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_c;
        if (this.field_e == var2Lifetime1) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    final hl a(byte param0) {
        if (param0 != 74) {
          return (hl) null;
        }
        hl var2 = this.field_e.field_a;
        if (this.field_e != var2) {
          var2.d(0);
          return var2;
        }
        return null;
    }

    final void a(int param0, ah param1) {
        try {
          if (param0 != -30510) {
            field_b = -18;
          }
          this.a(this.field_e.field_h, (byte) -123, param1);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ah.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(hl param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_a != null) {
            param0.d(0);
          }
          param0.field_h = this.field_e.field_h;
          param0.field_a = this.field_e;
          param0.field_a.field_h = param0;
          param0.field_h.field_a = param0;
          if (!param1) {
            return;
          }
          this.field_e = (hl) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ah.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final hl b(byte param0) {
        hl var2 = this.field_e.field_h;
        if (param0 <= 84) {
          ah.a(true);
          if (this.field_e != var2) {
            this.field_c = var2.field_h;
            return var2;
          }
          this.field_c = null;
          return null;
        }
        if (this.field_e != var2) {
          this.field_c = var2.field_h;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    public ah() {
        this.field_e = new hl();
        this.field_e.field_a = this.field_e;
        this.field_e.field_h = this.field_e;
    }

    static {
    }
}
