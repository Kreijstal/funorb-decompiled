/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lk extends ic implements ec {
    static String field_g;
    static dl field_e;
    private ae field_f;
    static pf field_i;
    static int field_h;
    static int field_j;

    public final void b(ae param0, int param1) {
        try {
          if (param1 != 0) {
            field_i = (pf) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lk.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0) {
        if (param0 <= 8) {
          java.net.URL var3 = (java.net.URL) null;
          lk.a((java.applet.Applet) null, (java.net.URL) null, -125);
          if (this.field_f.field_m != null) {
            return this.field_f.field_m.length() == 0 ? true : false;
          }
          return true;
        }
        if (this.field_f.field_m == null) {
          return true;
        }
        if (this.field_f.field_m.length() != 0) {
          return false;
        }
        return true;
    }

    final cg c(byte param0) {
        int var2 = 107 / ((-36 - param0) / 52);
        return this.a((byte) 102, this.field_f.field_m);
    }

    final String b(byte param0) {
        if (param0 == 36) {
          return this.b((byte) -76, this.field_f.field_m);
        }
        java.net.URL var3 = (java.net.URL) null;
        lk.a((java.applet.Applet) null, (java.net.URL) null, -64);
        return this.b((byte) -76, this.field_f.field_m);
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        int var4 = 0;
        Object var5 = null;
        java.net.URL stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -100 % ((param2 + 13) / 56);
          var3 = null;
          var5 = null;
          if (l.field_g != null &&
            !l.field_g.equals(param0.getParameter("settings"))) {
            var3 = l.field_g;
            var5 = var3;
            var5 = var3;
          }
          if (oc.field_a != null &&
            !oc.field_a.equals(param0.getParameter("session"))) {
            var5 = oc.field_a;
          }
          stackIn_8_0 = tg.a(param1, -1, (String) (var3), (String) (var5), 30403);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lk.T(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) (stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract cg a(byte param0, String param1);

    abstract String b(byte param0, String param1);

    public final void a(ae param0, int param1) {
        try {
          if (param1 != 0) {
            this.field_f = (ae) null;
          }
          this.a(param1 - 125);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lk.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    lk(ae param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = stellarshard.field_B;
        try {
          cc.a();
          fc.field_e = 11;
          ol.field_g = new int[260];
          if (param0 != 25536) {
            field_e = (dl) null;
          }
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            ol.field_g[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (ol.field_g.length > var5) {
            ol.field_g[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "lk.Q(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        field_e = null;
        field_i = null;
        field_g = null;
        int var1 = 85 % ((-18 - param0) / 55);
    }

    static {
        field_g = "Congratulations, stellarshard completed!<br>";
    }
}
