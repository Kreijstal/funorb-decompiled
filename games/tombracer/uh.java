/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends vg {
    private int field_q;
    static jea field_h;
    private int field_j;
    private int field_l;
    static it field_k;
    private int field_p;
    private aga field_o;
    private int field_f;
    private int field_n;
    private boolean field_r;
    private boolean field_g;
    static String field_i;
    private int[] field_m;

    public static void d(int param0) {
        field_h = null;
        field_k = null;
        field_i = null;
        if (param0 != 0) {
          field_h = (jea) null;
        }
    }

    final void a(int param0, int param1) {
        int var3 = -39 % ((-18 - param1) / 50);
        this.field_l = param0;
    }

    final int a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        if (this.f(1)) {
          return -1;
        }
        if (this.field_p == 0) {
          return -1;
        }
        if (this.field_o == null) {
          return -1;
        }
        if (null == this.field_o.field_c) {
          return -1;
        }
        if (0.05000000074505806f >= this.field_o.field_c.b(0)) {
          return -1;
        }
        if (this.field_o.field_c.c(-122) == 0) {
          return -1;
        }
        var5 = -this.field_j + param1 >> 16;
        var6 = -this.field_f + param2 >> 16;
        var7 = -this.field_q + param0 >> 16;
        if (param3 <= -33) {
          return -(var7 * var7 + var5 * var5 + var6 * var6 >> 2) + this.field_p;
        }
        field_k = (it) null;
        return -(var7 * var7 + var5 * var5 + var6 * var6 >> 2) + this.field_p;
    }

    final aga a(int param0) {
        if (param0 <= 4) {
          this.a(-31, -23, 62, -98);
          return this.field_o;
        }
        return this.field_o;
    }

    final static mu a(String param0, int param1) {
        String var2 = null;
        mu var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        mu stackIn_14_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (bla.field_G == null) {
            return null;
          }
          var7 = (CharSequence) ((Object) param0);
          var2 = jd.a(1, var7);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (mu) (bla.field_G.a(-114, (long)var2.hashCode()));
          var4 = -95 / ((param1 + 46) / 54);
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_tb);
            var5 = jd.a(1, var8);
            if (var5 == null) {
              var5 = var3.field_tb;
            }
            if (var5.equals(var2)) {
              stackIn_14_0 = var3;
              return stackIn_14_0;
            }
            var3 = (mu) (bla.field_G.b((byte) 99));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("uh.N(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        if (this.field_o == null) {
          return;
        }
        if (null == this.field_o.field_c) {
          return;
        }
        if (param0 == -10874) {
          this.field_o.field_c.a(255, param1);
          return;
        }
        field_k = (it) null;
        this.field_o.field_c.a(255, param1);
    }

    final static boolean a(byte param0) {
        lqa var1 = uv.b(false);
        if (var1 == null) {
          return false;
        }
        if (param0 != -7) {
          uh.a((byte) -8);
          if (rsa.field_s) {
            return false;
          }
          if (var1.field_i) {
            return true;
          }
          return false;
        }
        if (rsa.field_s) {
          return false;
        }
        if (var1.field_i) {
          return true;
        }
        return false;
    }

    final boolean c(int param0) {
        if (param0 != -1459852242) {
          this.a(-60);
          return this.field_r;
        }
        return this.field_r;
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (this.field_o == null ||
          this.field_o.field_c == null) {
          return;
        }
        this.field_m[0] = this.field_j >> 14;
        this.field_m[1] = -this.field_q >> 14;
        this.field_m[2] = -this.field_f >> 14;
        this.field_o.field_c.a(this.field_m[1], this.field_m[0], (byte) -127, this.field_m[2]);
        if (param0 >= 21) {
          var3 = this.field_o.field_c.a((byte) 107);
          this.field_p = var3 * (var3 * 2);
          this.field_o.a(false, param1 + this.field_n, -1814184927);
          return;
        }
        uh.a((byte) 98);
        var3Lifetime1 = this.field_o.field_c.a((byte) 107);
        this.field_p = var3Lifetime1 * (var3Lifetime1 * 2);
        this.field_o.a(false, param1 + this.field_n, -1814184927);
    }

    final void d(int param0, int param1) {
        int var3 = 12 / ((40 - param1) / 59);
        if (this.field_o == null) {
          return;
        }
        if (null != this.field_o.field_c) {
          this.field_o.field_c.a((byte) 62, param0);
          return;
        }
    }

    final int b(int param0) {
        if (param0 < 104) {
          this.field_j = -79;
          return this.field_l;
        }
        return this.field_l;
    }

    final void a(boolean param0, int param1) {
        if (param1 == 1011094480) {
          this.field_g = param0 ? true : false;
          return;
        }
        field_k = (it) null;
        this.field_g = param0 ? true : false;
    }

    final boolean f(int param0) {
        if (param0 != 1) {
          this.field_n = 64;
          return this.field_g;
        }
        return this.field_g;
    }

    final void e(int param0) {
        this.field_r = true;
        if (param0 != 2) {
          this.field_o = (aga) null;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 > 82) {
          this.field_q = param0;
          this.field_j = param3;
          this.field_f = param2;
          return;
        }
        this.field_o = (aga) null;
        this.field_q = param0;
        this.field_j = param3;
        this.field_f = param2;
    }

    final void b(int param0, int param1) {
        if (param1 != 0) {
          this.c(-107, 111);
          this.field_n = param0;
          return;
        }
        this.field_n = param0;
    }

    uh(aga param0) {
        this.field_r = false;
        this.field_m = new int[3];
        this.field_g = false;
        try {
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Invite <%0> to this game";
        field_k = new it();
    }
}
