/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tj extends pe {
    private int field_K;
    static rc field_G;
    static volatile boolean field_F;
    static int field_J;
    boolean field_H;
    private wi field_E;
    static int field_I;

    private final int h(int param0) {
        if (param0 == -660264703) {
          return !this.field_H ? 0 : this.field_E.f(param0 ^ -660264703) != this ? 0 : 256;
        }
        return 75;
    }

    abstract void b(int param0, int param1, int param2);

    boolean a(int param0) {
        if (param0 != 16) {
          return true;
        }
        this.field_K = this.h(-660264703);
        if (this.field_K != 0) {
          return false;
        }
        if (!this.field_H) {
          return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2) {
        this.a(110, ik.field_K - param1 >> 1, param1, param2, dh.field_a - param2 >> 1);
        if (param0 != 6154) {
          String var5 = (String) null;
          tj.a(-85, (String) null);
        }
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          try {
            if (!vh.field_k.startsWith("win")) {
              return false;
            }
            if (param0 <= 81) {
              field_F = true;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param1.length() > var3; var3++) {
              if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("tj.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    boolean g(int param0) {
        if (param0 != 1) {
          return true;
        }
        int var2 = this.h(-660264703);
        int var3 = -this.field_K + var2;
        if (var3 > 0) {
          this.field_K = this.field_K + (-1 + (var3 + 8)) / 8;
        }
        if (var3 < 0) {
          this.field_K = this.field_K + (1 + (-16 + var3)) / 16;
        }
        if (this.field_K != 0) {
          return false;
        }
        if (var2 == 0) {
          return !this.field_H ? true : false;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_K == 0) {
          return;
        }
        if (this.field_K >= 256) {
          if (param2 == 0) {
            this.b(this.field_o + param0, -1, this.field_l + param3);
            super.a(param0, param1 ^ 0, param2, param3);
            return;
          }
          return;
        }
        if (ei.field_n == null) {
          ei.field_n = new o(this.field_r, this.field_n);
          ud.a(ei.field_n, false);
          ed.d();
          this.b(param1, -1, 0);
          super.a(-this.field_o - param0, 0, param2, -this.field_l - param3);
          bb.b(4);
          ei.field_n.c(this.field_o + param0, param3 + this.field_l, this.field_K);
          return;
        }
        if (this.field_r > ei.field_n.field_z) {
          ei.field_n = new o(this.field_r, this.field_n);
          ud.a(ei.field_n, false);
          ed.d();
          this.b(param1, -1, 0);
          super.a(-this.field_o - param0, 0, param2, -this.field_l - param3);
          bb.b(4);
          ei.field_n.c(this.field_o + param0, param3 + this.field_l, this.field_K);
          return;
        }
        if (this.field_n > ei.field_n.field_p) {
          ei.field_n = new o(this.field_r, this.field_n);
          ud.a(ei.field_n, false);
          ed.d();
          this.b(param1, -1, 0);
          super.a(-this.field_o - param0, 0, param2, -this.field_l - param3);
          bb.b(4);
          ei.field_n.c(this.field_o + param0, param3 + this.field_l, this.field_K);
          return;
        }
        ud.a(ei.field_n, false);
        ed.d();
        this.b(param1, -1, 0);
        super.a(-this.field_o - param0, 0, param2, -this.field_l - param3);
        bb.b(4);
        ei.field_n.c(this.field_o + param0, param3 + this.field_l, this.field_K);
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          kk.field_yb = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          if (param0 != 3088) {
            String var6 = (String) null;
            tj.a(-110, (String) null);
          }
          fa.a(var4, var2, false, var3, param1);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "tj.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(boolean param0) {
        field_G = null;
        if (!param0) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          tj.a(82, (java.applet.Applet) null);
        }
    }

    final static String[] a(String param0, int param1, char param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = wizardrun.field_H;
        try {
          var10 = (CharSequence) ((Object) param0);
          var3_int = ok.a(param2, var10, (byte) 75);
          var4 = new String[var3_int + 1];
          if (param1 != -22710) {
            field_G = (rc) null;
          }
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param2 != param0.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("tj.DB(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final ub d(int param0) {
        ub var2 = super.d(param0);
        if (var2 != null) {
          return var2;
        }
        return (ub) (this);
    }

    tj(wi param0, int param1, int param2) {
        super(dh.field_a - param1 >> 1, -param2 + ik.field_K >> 1, param1, param2, (bf) null);
        try {
          this.field_H = false;
          this.field_E = param0;
          this.field_K = 0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_F = false;
        field_I = 0;
        field_G = new rc();
    }
}
