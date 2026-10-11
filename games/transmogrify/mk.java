/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mk extends aj {
    static ti field_y;
    boolean field_A;
    static String field_C;
    private int field_D;
    static int field_x;
    static int[] field_w;
    static ti[] field_B;
    static String field_E;
    private da field_z;

    boolean a(byte param0) {
        this.field_D = this.l(-18555);
        if (param0 != -97) {
          return false;
        }
        if (0 != this.field_D) {
          return false;
        }
        if (!this.field_A) {
          return true;
        }
        return false;
    }

    boolean m(int param0) {
        int var2 = this.l(-18555);
        int var3 = -this.field_D + var2;
        if (var3 > param0) {
          this.field_D = this.field_D + (var3 + 8 - 1) / 8;
        }
        if (0 > var3) {
          this.field_D = this.field_D + (var3 - 15) / 16;
          if (0 != this.field_D) {
            return false;
          }
          if (0 == var2) {
            return !this.field_A ? true : false;
          }
          return false;
        }
        if (0 != this.field_D) {
          return false;
        }
        if (0 == var2) {
          return !this.field_A ? true : false;
        }
        return false;
    }

    private final int l(int param0) {
        if (param0 == -18555) {
          return !this.field_A ? 0 : this.field_z.e((byte) 14) == this ? 256 : 0;
        }
        field_y = (ti) null;
        return !this.field_A ? 0 : this.field_z.e((byte) 14) == this ? 256 : 0;
    }

    final static uk a(int param0, String param1) {
        int var2_int = 0;
        String var3 = null;
        uk var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        uk stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = 30 / ((param0 - 46) / 38);
          if (null == sj.field_u) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var3 = hj.a((byte) -126, var7);
          if (var3 == null) {
            return null;
          }
          var4 = (uk) (sj.field_u.a((long)var3.hashCode(), (byte) -72));
          while (var4 != null) {
            var8 = (CharSequence) ((Object) var4.field_eb);
            var5 = hj.a((byte) -128, var8);
            if (var5.equals(var3)) {
              stackIn_17_0 = var4;
              return stackIn_17_0;
            }
            var4 = (uk) (sj.field_u.a(-91));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("mk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static uj a(int param0, String param1, int param2) {
        uj var3 = null;
        RuntimeException var3_ref = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 242763393) {
            field_C = (String) null;
          }
          var3 = new uj(false);
          var3.field_g = param2;
          var3.field_b = param1;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("mk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    mk(da param0, int param1, int param2) {
        super(-param1 + cd.field_b >> 1, wj.field_h - param2 >> 1, param1, param2, (ui) null);
        try {
          this.field_D = 0;
          this.field_A = false;
          this.field_z = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        this.a(87, -param1 + wj.field_h >> 1, cd.field_b - param0 >> 1, param0, param1);
        if (param2) {
          field_B = (ti[]) null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = -122 % ((param3 - 77) / 34);
        if (this.field_D == 0) {
          return;
        }
        if (this.field_D >= 256) {
          if (param2 == 0) {
            this.a(this.field_n + param1, (byte) -106, param0 + this.field_p);
            super.a(param0, param1, param2, (byte) -27);
            return;
          }
          return;
        }
        if (qk.field_c == null) {
          qk.field_c = new ti(this.field_l, this.field_h);
          oj.a(qk.field_c, 256);
          sb.c();
          this.a(0, (byte) -81, 0);
          super.a(-this.field_p - param0, -this.field_n - param1, param2, (byte) -93);
          fi.c(true);
          qk.field_c.e(param0 + this.field_p, param1 + this.field_n, this.field_D);
          return;
        }
        if (this.field_l > qk.field_c.field_n) {
          qk.field_c = new ti(this.field_l, this.field_h);
          oj.a(qk.field_c, 256);
          sb.c();
          this.a(0, (byte) -81, 0);
          super.a(-this.field_p - param0, -this.field_n - param1, param2, (byte) -93);
          fi.c(true);
          qk.field_c.e(param0 + this.field_p, param1 + this.field_n, this.field_D);
          return;
        }
        if (qk.field_c.field_m >= this.field_h) {
          oj.a(qk.field_c, 256);
          sb.c();
          this.a(0, (byte) -81, 0);
          super.a(-this.field_p - param0, -this.field_n - param1, param2, (byte) -93);
          fi.c(true);
          qk.field_c.e(param0 + this.field_p, param1 + this.field_n, this.field_D);
          return;
        }
        qk.field_c = new ti(this.field_l, this.field_h);
        oj.a(qk.field_c, 256);
        sb.c();
        this.a(0, (byte) -81, 0);
        super.a(-this.field_p - param0, -this.field_n - param1, param2, (byte) -93);
        fi.c(true);
        qk.field_c.e(param0 + this.field_p, param1 + this.field_n, this.field_D);
    }

    abstract void a(int param0, byte param1, int param2);

    final qg i(int param0) {
        qg var2 = super.i(-120);
        if (var2 != null) {
          return var2;
        }
        if (param0 <= -112) {
          return (qg) (this);
        }
        field_w = (int[]) null;
        return (qg) (this);
    }

    public static void n(int param0) {
        field_y = null;
        field_w = null;
        field_B = null;
        field_E = null;
        if (param0 > -23) {
          return;
        }
        field_C = null;
    }

    static {
        field_C = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_w = new int[8192];
        field_E = "Open in popup window";
    }
}
