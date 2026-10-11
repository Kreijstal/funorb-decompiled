/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta extends l {
    static oi field_h;
    int field_f;
    pb field_e;
    int field_g;
    int field_j;
    static String field_i;

    public static void a(boolean param0) {
        field_i = null;
        field_h = null;
        if (!param0) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          ta.a((java.applet.Applet) null, -18);
        }
    }

    private final int b(int param0) {
        int var5 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        var7 = CrazyCrystals.field_B;
        var2 = 0;
        var3 = 1;
        var4 = 1;
        if (param0 > -91) {
          return -33;
        }
        for (var5 = 0; var5 < ma.field_n.length; var5++) {
          var6 = this.field_e.a(1843275042, var5);
          if (var6 > this.field_f) {
            if (33 <= this.field_g) {
              return this.c(-1);
            }
            this.field_e.a(var5, 23041505, this);
            if (-1 + var6 > this.field_f) {
              var4 = 0;
            }
            var2 = this.field_e.a((byte) -80, var4 != 0);
            if (var4 == 0) {
              var3 = 0;
            }
          }
        }
        if (var2 == 0) {
          return 0;
        }
        this.field_e.a((byte) -89);
        this.field_f = this.field_f + 1;
        this.field_e.a(false, this, var3 != 0);
        return var2;
    }

    final l b(byte param0) {
        int var2_int = 0;
        int var3;
        int var4;
        Object var2;
        var4 = CrazyCrystals.field_B;
        if (param0 != -90) {
          return (l) null;
        }
        for (var2_int = 0; ma.field_n.length > var2_int; var2_int++) {
          var3 = this.field_e.a(param0 ^ -1843275132, var2_int) - this.field_f;
          if (var3 > 0) {
            this.field_e.a(true, var2_int, var3, this.field_f);
          }
        }
        var2 = this.e((byte) -102);
        if (var2 == null) {
          var2 = this.b(false);
        }
        return (l) (var2);
    }

    abstract l b(boolean param0);

    abstract int c(int param0);

    private final ta e(byte param0) {
        this.field_f = 0;
        this.field_e = this.field_e.b((byte) -128);
        if (this.field_e == null) {
          return null;
        }
        int var2 = -104 % ((param0 - 21) / 36);
        this.field_e.a((byte) 19, this);
        return this;
    }

    final ta d(byte param0) {
        if (param0 > -119) {
          this.field_j = -76;
        }
        return this.b(-126) > 0 ? this : this.e((byte) -56).d((byte) -123);
    }

    final l a(int param0) {
        int var2 = this.b(-115);
        if (var2 > 0) {
          return new o(var2, (l) (this)).a(param0 ^ 0);
        }
        if (param0 != -2) {
          this.field_e = (pb) null;
        }
        Object var3 = this.e((byte) -40);
        if (var3 == null) {
          var3 = this.b(false);
        }
        return ((l) (var3)).a(-2);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param1 != 19) {
                ta.a(true);
              }
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(gh.a(param0, var2, (byte) 67), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("ta.L(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ta(pb param0) {
        this.field_f = 0;
        this.field_g = 19;
        this.field_j = 0;
        try {
          this.field_e = param0;
          param0.a((byte) 19, this);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new oi();
    }
}
