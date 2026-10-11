/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dja extends nv implements ut {
    static jea field_p;
    private jma field_n;
    static int field_r;
    private boolean field_q;
    private int field_o;
    private int field_t;
    static String[] field_s;

    public static void l(int param0) {
        field_s = null;
        if (param0 != 1) {
          field_r = 91;
        }
        field_p = null;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          this.c(56);
        }
        param0 = fs.a((byte) 122, param0, this.field_t);
        return this.field_n.a(105, param0);
    }

    final void k(int param0) {
        int var2;
        npa var3;
        ffa[] var4;
        int var5;
        int var6;
        int var5Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.field_n.f((byte) -56)) {
          this.c(false);
        }
        var2 = 0;
        var3 = this.b(true).field_u;
        var4 = var3.a((byte) -26, this.field_g);
        for (var5 = 0; var5 < var4.length; var5++) {
          if (this.a(var4[var5], (byte) -103)) {
            var2 = var2 + var4[var5].b(75);
          }
        }
        this.field_t = var2;
        var5Lifetime1 = 0;
        if (param0 != 5418) {
          return;
        }
        if (0 < var2 &&
          this.field_o <= var2) {
          var5Lifetime1 = 1;
        }
        this.field_n.a((byte) -14, var5Lifetime1 != 0);
    }

    public final int c(int param0) {
        if (param0 != 17832) {
          this.k(121);
        }
        return 3364198;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) -127, this.field_o, 8);
          param1.a((byte) -128, !this.field_q ? 0 : 1, 1);
          this.field_n.a(this.h((byte) 117), (byte) 117, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dja.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dja(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_o = param1.b((byte) 44, 8);
          if (param0.field_E <= 10) {
            this.field_o = this.field_o / 5;
          }
          if (9 <= param0.field_E) {
            this.field_q = 1 != param1.b((byte) 44, 1) ? false : true;
          }
          this.field_n = new jma(15, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final int b(int param0) {
        int var2 = 33 % ((param0 + 46) / 45);
        return this.field_o;
    }

    dja(la param0, boolean param1) {
        super(param0, param1);
        try {
          this.field_o = 50;
          this.field_n = new jma(15);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
          field_s = (String[]) null;
        }
        return 17;
    }

    public final int g(byte param0) {
        if (param0 != -108) {
          return -69;
        }
        return 8969727;
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
          this.field_q = true;
        }
        return this.field_n;
    }

    final void a(int param0, boolean param1) {
        this.field_o = param0;
        if (!param1) {
          dja.l(56);
        }
    }

    private final boolean a(ffa param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.a(124)) {
            return false;
          }
          if (param1 > -73) {
            this.k(15);
          }
          if (this.field_g == param0) {
            return false;
          }
          if (!this.field_q) {
            if (!io.a(this.field_g.c(-73), param0.e(9648), (byte) -89, this.field_g.a((byte) 55), param0.d(3), this.field_g.e(9648), param0.a((byte) 55), param0.c(-43), this.field_g.d(3))) {
              return false;
            }
          } else {
            if (!ck.a(param0.d(3), param0.a((byte) 55), this.field_g.d(3), this.field_g.c(-113), this.field_g.a((byte) 55), param0.e(9648), (byte) 67, this.field_g.e(9648), param0.c(-51))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("dja.P(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void g(int param0) {
        super.g(param0);
        this.field_n.a((byte) 48, this.h((byte) 125));
    }

    public final int j(byte param0) {
        if (param0 != -108) {
          this.field_q = true;
        }
        return this.field_t;
    }

    final static boolean a(byte param0, char param1) {
        int var2;
        boolean stackIn_8_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var2 = -39 % ((param0 + 76) / 36);
        if ((param1 < 65 ||
          param1 > 90) && (param1 < 97 ||
          param1 > 122)) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        if (hka.field_b != null &&
          hka.field_b.a(13)) {
          wp.a(param2 ^ 105);
          return true;
        }
        if (null != fj.field_c &&
          fj.field_c.b(true)) {
          fj.field_c = null;
          wp.a(-1);
          return true;
        }
        if (param2 != -106) {
          field_s = (String[]) null;
        }
        if (bc.a(true)) {
          return true;
        }
        if (mda.b(param3, (byte) -44, param1, param0)) {
          return true;
        }
        return false;
    }

    static {
        field_r = 7;
    }
}
