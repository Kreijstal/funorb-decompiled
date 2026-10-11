/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    private uk field_g;
    static di field_d;
    private int field_b;
    static String[][] field_f;
    static String field_c;
    private qi field_h;
    private int field_a;
    static String field_e;

    private final void a(long param0, int param1) {
        kk var4 = (kk) (this.field_g.a(-28010, param0));
        this.a(param1, var4);
    }

    fg(int param0) {
        this(param0, param0);
    }

    final void a(int param0, Object param1, long param2) {
        try {
          this.a(0, 1, param1, param2);
          int var5_int = 99 % ((-17 - param0) / 62);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, kk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            param1.a((byte) -117);
            param1.a(false);
            this.field_b = this.field_b + param1.field_y;
          }
          if (param0 == 0) {
            return;
          }
          this.a(-28L, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, Object param2, long param3) {
        kk var6 = null;
        fd var6_ref = null;
        int var7 = Pool.field_O;
        try {
          if (param1 > this.field_a) {
            throw new IllegalStateException();
          }
          this.a(param3, param0);
          this.field_b = this.field_b - param1;
          while (this.field_b < 0) {
            var6 = (kk) (this.field_h.a(-97));
            this.a(0, var6);
          }
          var6_ref = new fd(param2, param1);
          this.field_g.a(var6_ref, true, param3);
          this.field_h.a((byte) -62, var6_ref);
          ((kk) ((Object) var6_ref)).field_m = 0L;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final Object a(long param0, boolean param1) {
        kk var8 = null;
        Object var9 = null;
        fd var6 = null;
        fd var6Lifetime1;
        if (!param1) {
          field_f = (String[][]) null;
          var8 = (kk) (this.field_g.a(-28010, param0));
          kk var7 = var8;
          if (var8 == null) {
            return null;
          }
          var9 = var8.c((byte) 121);
          Object var5 = var9;
          if (var9 == null) {
            var8.a((byte) -117);
            var8.a(false);
            this.field_b = this.field_b + var8.field_y;
            return null;
          }
          if (!var8.e(-74)) {
            this.field_h.a((byte) -36, var8);
            var8.field_m = 0L;
            return var9;
          }
          var6 = new fd(var9, var8.field_y);
          this.field_g.a(var6, param1, var8.field_c);
          this.field_h.a((byte) -36, var6);
          ((kk) ((Object) var6)).field_m = 0L;
          var8.a((byte) -117);
          var8.a(!param1 ? true : false);
          return var9;
        }
        kk var10 = (kk) (this.field_g.a(-28010, param0));
        if (var10 == null) {
          return null;
        }
        Object var11 = var10.c((byte) 121);
        if (var11 == null) {
          var10.a((byte) -117);
          var10.a(false);
          this.field_b = this.field_b + var10.field_y;
          return null;
        }
        if (!var10.e(-74)) {
          this.field_h.a((byte) -36, var10);
          var10.field_m = 0L;
          return var11;
        }
        var6Lifetime1 = new fd(var11, var10.field_y);
        this.field_g.a(var6Lifetime1, param1, var10.field_c);
        this.field_h.a((byte) -36, var6Lifetime1);
        ((kk) ((Object) var6Lifetime1)).field_m = 0L;
        var10.a((byte) -117);
        var10.a(!param1 ? true : false);
        return var11;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            ar.field_g = param2;
            try {
              if (param1 > -103) {
                field_c = (String) null;
              }
              var6 = param0.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param2.length() != 0) {
                var5Lifetime6 = var7 + "; Expires=" + hn.a(rl.a((byte) -120) + 94608000000L, false) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              mo.a("document.cookie=\"" + var5Lifetime6 + "\"", param0, (byte) 35);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            uk.a(558370049, param0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("fg.B(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private fg(int param0, int param1) {
        int var3;
        this.field_h = new qi();
        this.field_a = param0;
        this.field_b = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_g = new uk(var3);
            return;
          }
          if (param1 > var3) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_g = new uk(var3);
        return;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 == 0) {
          field_d = null;
          field_f = (String[][]) null;
          field_c = null;
          return;
        }
        field_d = (di) null;
        field_d = null;
        field_f = (String[][]) null;
        field_c = null;
    }

    static {
        field_c = "Continue";
        field_e = "Chat is currently disabled.";
    }
}
