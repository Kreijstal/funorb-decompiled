/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    private int field_g;
    static String field_b;
    static int field_a;
    private br field_f;
    private int field_e;
    private br[] field_d;
    private br field_h;
    static int field_c;

    final br b(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        br var4;
        br var5;
        br var6;
        br var9;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_e <= 0) {
          do {
            if (this.field_g <= this.field_e) {
              if (param0 <= -105) {
                return null;
              }
              var4 = (br) null;
              this.a(false, -86L, (br) null);
              return null;
            }
            fieldTemp$1 = this.field_e;
            this.field_e = this.field_e + 1;
            var5 = this.field_d[fieldTemp$1].field_d;
          } while (this.field_d[-1 + this.field_e] == var5);
          this.field_h = var5.field_d;
          return var5;
        }
        if (this.field_h != this.field_d[this.field_e - 1]) {
          var9 = this.field_h;
          this.field_h = var9.field_d;
          return var9;
        }
        do {
          if (this.field_g <= this.field_e) {
            if (param0 <= -105) {
              return null;
            }
            var4 = (br) null;
            this.a(false, -86L, (br) null);
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var6 = this.field_d[fieldTemp$0].field_d;
        } while (this.field_d[-1 + this.field_e] == var6);
        this.field_h = var6.field_d;
        return var6;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < -31) {
          return;
        }
        f.a((byte) -51);
    }

    final br a(int param0, long param1) {
        br var5 = null;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        br var4 = this.field_d[(int)(param1 & (long)(this.field_g - 1))];
        br var5Lifetime1;
        if (param0 != 0) {
          this.field_g = -49;
        } else {
          this.field_f = var4.field_d;
          while (this.field_f != var4) {
            if (param1 == this.field_f.field_e) {
              var5 = this.field_f;
              this.field_f = this.field_f.field_d;
              return var5;
            }
            this.field_f = this.field_f.field_d;
          }
          this.field_f = null;
          return null;
        }
        this.field_f = var4.field_d;
        while (this.field_f != var4) {
          if (param1 == this.field_f.field_e) {
            var5Lifetime1 = this.field_f;
            this.field_f = this.field_f.field_d;
            return var5Lifetime1;
          }
          this.field_f = this.field_f.field_d;
        }
        this.field_f = null;
        return null;
    }

    final void a(boolean param0, long param1, br param2) {
        br var5 = null;
        try {
          if (param2.field_b != null) {
            param2.a(true);
          }
          if (!param0) {
            this.field_g = 88;
          }
          var5 = this.field_d[(int)(param1 & (long)(this.field_g - 1))];
          param2.field_d = var5;
          param2.field_b = var5.field_b;
          param2.field_b.field_d = param2;
          param2.field_e = param1;
          param2.field_d.field_b = param2;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "f.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final br a(int param0) {
        this.field_e = param0;
        return this.b(-119);
    }

    final static void a(java.applet.Applet param0, boolean param1, byte param2, String param3) {
        try {
          int var4_int = 0;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (go.field_l.startsWith("win") &&
              va.a(9805, param3)) {
              return;
            }
            try {
              param0.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
              var4_int = 3 / ((param2 - 39) / 61);
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              bd.a("MGR1: " + param3, (Throwable) null, false);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref;
            stackIn_9_1 = new StringBuilder().append("f.A(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    f(int param0) {
        int var2 = 0;
        br dupTemp$1 = null;
        br var3;
        this.field_e = 0;
        this.field_g = param0;
        this.field_d = new br[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new br();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.field_d = var3;
          var3.field_b = var3;
        }
    }

    static {
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_c = 0;
    }
}
