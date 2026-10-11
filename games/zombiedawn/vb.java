/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends fb {
    private int field_H;
    static gi[] field_D;
    static int field_I;
    private int field_G;
    private int field_E;
    private int field_F;

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = fm.a(param1, -70);
            if (var4 != null &&
              var4.length() >= 1) {
              if (vi.a(param0 + 31153, var4.charAt(0))) {
                return false;
              }
              if (vi.a(param0 ^ 31153, var4.charAt(var4.length() - 1))) {
                return false;
              }
              var5 = 0;
              for (var6 = param0; var6 < param1.length(); var6++) {
                var7 = param1.charAt(var6);
                if (!vi.a(31153, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (0 >= var5) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("vb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(')').toString());
        }
    }

    final void g(int param0) {
        int fieldTemp$1 = 0;
        if (param0 < 95) {
          java.applet.Applet var3 = (java.applet.Applet) null;
          vb.a((byte) 55, (java.applet.Applet) null);
        }
        int fieldTemp$0 = this.field_F;
        this.field_F = this.field_F + 1;
        if (fieldTemp$0 > 17) {
          this.field_F = 0;
          fieldTemp$1 = this.field_G + 1;
          this.field_G = this.field_G + 1;
          if (2 <= fieldTemp$1) {
            this.field_G = 0;
          }
        }
        this.field_E = this.field_E + this.field_H;
        if (this.field_E > 160 ||
          this.field_E < 80) {
          this.field_H = -this.field_H;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(rc.a(-1, param1, var2), "_top");
              if (param0 != 50) {
                field_I = 97;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("vb.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    vb(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_F = 0;
        this.field_E = 96;
        this.field_H = 3;
        this.d((byte) 126);
    }

    public static void f(byte param0) {
        field_D = null;
        if (param0 > -72) {
          vb.f((byte) 11);
        }
    }

    final void a(byte param0, wk param1) {
        int var3_int = param1.a(this.a(true), (byte) -97) - 24;
        int var4 = -48 + param1.a(this.f(237239984), 0);
        if (-48 > var3_int ||
          -48 > var4 ||
          qj.field_d < var3_int ||
          var4 > me.field_Bb) {
          return;
        }
        try {
          if (param0 >= -76) {
            wk var5 = (wk) null;
            this.a((byte) 89, (wk) null);
          }
          fj.a(ad.field_g[this.field_t][this.field_G + 32], 0, 339, this.field_t == 0 ? true : false).e(var3_int - 3, var4 - 3, this.field_E);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_D = new gi[155];
        field_I = 0;
    }
}
