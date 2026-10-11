/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mda extends c implements fo, ffa, gma {
    private int field_i;
    private la field_q;
    private int field_n;
    static jea field_v;
    private int field_k;
    private int field_l;
    private int field_r;
    private int field_t;
    private boolean field_o;
    private int field_u;
    private int field_p;
    private int field_s;
    private int field_j;
    private int field_m;
    private int field_w;

    final static void b(int param0, byte param1) {
        int var3 = 0;
        upa var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 > -101) {
            mda.b(-10, (byte) -8);
          }
          var4 = (upa) (ina.field_d.f(-80));
          while (var4 != null) {
            ip.a(var4, param0, 2147);
            var4 = (upa) (ina.field_d.e(121));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "mda.S(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          return true;
        }
        return this.field_o;
    }

    private final void a(int param0, int param1, int param2, la param3, int param4, int param5) {
        try {
          this.field_o = false;
          this.field_q = param3;
          this.field_l = param4 * 2;
          this.field_m = 0;
          this.field_n = param2;
          this.field_s = param0;
          this.field_i = iia.d(param1 * param5, 786432, 2);
          this.field_t = 0;
          this.field_k = this.field_l;
          this.s(0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mda.R(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        if (this.field_s == 1) {
          int var6 = 80 / ((-23 - param1) / 56);
          return this.field_q.a((ffa) (this), (gma) (this), 1, this.field_k, param3, 12, this.field_k, this.field_p, param4, param0, this.field_j, param2, true);
        }
        return 0;
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_s != 1) {
            return false;
          }
          if (param0 != -1) {
            this.field_i = 97;
          }
          var5_int = eha.a(this.field_k, 12, this.field_j, this.field_k, param3, this.field_p, 2);
          if (var5_int == -1) {
            return false;
          }
          var6 = wm.a(4096, var5_int, 108);
          param3.a(var6, (byte) 47);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("mda.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void a(la param0, int param1) {
        try {
          this.field_p = param0.a(this.field_p, (byte) 71);
          if (param1 >= -16) {
            mda.b(-115, (byte) 124, 61, -21);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mda.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int b(int param0) {
        int var2 = -50 % ((param0 - 1) / 45);
        if (this.field_s != 1) {
          return 0;
        }
        return this.field_k >> 17;
    }

    public final int d(int param0) {
        if (param0 != 3) {
          return -56;
        }
        return this.field_p;
    }

    final void a(uw param0, int param1) {
        try {
          if (param1 != 5465) {
            this.field_m = -24;
          }
          param0.a((byte) 111, 6, (fo) (this));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mda.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int a(up param0, int param1, pc param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (eha.a(this.field_k, param1, this.field_j, this.field_k, param2, this.field_p, 2) < 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          stackIn_5_0 = this.a(param0, -6);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("mda.ED(");
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final boolean a(byte param0, boolean param1) {
        boolean stackIn_7_0 = false;
        if (param0 != -55) {
          return true;
        }
        if (this.field_s == 1) {
          stackIn_7_0 = true;
        } else {
          if (param1) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_s &&
            this.a((byte) 110, param4, param6, param0, param3)) {
            return true;
          }
          if (param2 >= 55) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_11_0 = var9;
          stackIn_11_1 = new StringBuilder().append("mda.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final boolean a(gma param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 61) {
            this.field_l = -102;
          }
          stackIn_5_0 = (this.field_s == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mda.DA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(up param0, ep param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.i(-1);
          if (param2 >= -97) {
            this.field_q = (la) null;
          }
          stackIn_3_0 = this.a(param0, var4_int, param1.d(3), 0, param1.e(9648), var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("mda.SD(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public final int b(byte param0) {
        int var2 = 12 % ((param0 + 23) / 53);
        return this.field_p;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
          return 2;
        }
        return 0;
    }

    public final int g(byte param0) {
        if (param0 != 115) {
          this.f((byte) -93);
          return 0;
        }
        return 0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 == -78) {
          this.field_j = param2;
          this.field_p = param0;
          return;
        }
        ep var6 = (ep) null;
        this.a((up) null, (ep) null, -22);
        this.field_j = param2;
        this.field_p = param0;
    }

    final static boolean b(int param0, byte param1, int param2, int param3) {
        if (fua.field_g) {
          return apa.field_c.a((byte) -121, fna.field_h, kda.field_td);
        }
        if (vo.field_b) {
          return mj.c(param1 + 2097196, param0, param3);
        }
        if (dfa.a(param0, false, param3)) {
          return true;
        }
        if (ok.field_s) {
          return false;
        }
        if (param1 == -44) {
          return eqa.a(param2, true, param0);
        }
        mda.j((byte) -121);
        return eqa.a(param2, true, param0);
    }

    public final int e(int param0) {
        if (param0 == 9648) {
          return this.field_j;
        }
        ffa var3 = (ffa) null;
        this.a(-103, (gma) null, -104, -49, -55, (ffa) null, -28, -39);
        return this.field_j;
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
          this.field_r = 45;
          return this.field_j;
        }
        return this.field_j;
    }

    public final int g(int param0) {
        if (param0 != -25787) {
          this.field_j = 118;
          return 0;
        }
        return 0;
    }

    private final int a(up param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          if (param1 != -6) {
            stackIn_3_0 = 114;
            return stackIn_3_0;
          }
          if (0 == this.field_s) {
            if (param0.field_j == 3) {
              this.field_m = this.field_m + 25;
            } else {
              if (param0.field_j == 5) {
                this.i((byte) -127);
                this.field_q.b(param1 + 30103, this.field_k / 2, 1, this.field_j, this.field_p);
                var3_int = param0.field_b;
              }
            }
          } else {
            if (this.field_s == 1) {
              if (param0.field_j == 3) {
                this.i((byte) -126);
                this.field_q.b(30097, this.field_k / 2, 0, this.field_j, this.field_p);
                var3_int = param0.field_b;
              } else {
                if (param0.field_j != 5 &&
                  param0.field_j == 0) {
                  this.field_k = this.field_k - 262144;
                  this.n(786432);
                  var3_int = param0.field_b;
                }
              }
            }
          }
          stackIn_17_0 = var3_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("mda.K(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void i(byte param0) {
        this.field_o = true;
        if (param0 > -120) {
          return;
        }
        this.field_q.field_u.a((ffa) (this), (byte) 82);
    }

    public final int a(boolean param0) {
        if (!param0) {
          return 18;
        }
        return 11 * (1 + this.field_w);
    }

    public static void j(byte param0) {
        if (param0 != 87) {
          mda.b(-56, (byte) 104, -90, 106);
          field_v = null;
          return;
        }
        field_v = null;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        boolean stackIn_17_0 = false;
        boolean stackIn_27_0 = false;
        boolean stackIn_34_0 = false;
        if (param0 <= 68) {
          this.field_t = -15;
          if (!this.a((byte) -55, param1)) {
            return false;
          }
          if (param4 != 0) {
            this.s(0);
            this.a(param3, (byte) -36, param2, param4, param5);
            if (this.field_u + param4 != this.field_p) {
              return false;
            }
            if (this.field_j != this.field_r + param3) {
              return false;
            }
            return true;
          }
          if (param3 == 0) {
            return true;
          }
          this.s(0);
          this.a(param3, (byte) -36, param2, param4, param5);
          if (this.field_u + param4 != this.field_p) {
            return false;
          }
          stackIn_17_0 = (this.field_j == this.field_r + param3);
          return stackIn_17_0;
        }
        if (!this.a((byte) -55, param1)) {
          return false;
        }
        if (param4 != 0) {
          this.s(0);
          this.a(param3, (byte) -36, param2, param4, param5);
          stackIn_27_0 = (this.field_u + param4 == this.field_p) && (this.field_j == this.field_r + param3);
          return stackIn_27_0;
        }
        if (param3 == 0) {
          return true;
        }
        this.s(0);
        this.a(param3, (byte) -36, param2, param4, param5);
        stackIn_34_0 = (this.field_u + param4 == this.field_p) && (this.field_j == this.field_r + param3);
        return stackIn_34_0;
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 == 110) {
          return io.a(param4, this.field_j, (byte) -70, param3, this.field_p, param1, this.field_k, this.field_k, param2);
        }
        this.f(-11);
        return io.a(param4, this.field_j, (byte) -70, param3, this.field_p, param1, this.field_k, this.field_k, param2);
    }

    public final int i(int param0) {
        if (param0 <= 90) {
          mda.b(122, (byte) -32, 39, 92);
          return this.field_u;
        }
        return this.field_u;
    }

    public final boolean l(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    public final void a(int param0, iq param1) {
        try {
          if (param0 <= 103) {
            this.b(-91);
          }
          dea.field_a.a(this, 95, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mda.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6;
        int var6Lifetime1;
        if (1 != this.field_s) {
          return;
        }
        this.s(0);
        var6 = 0;
        if (param1 > -11) {
          return;
        }
        if (param3 != 0) {
          var6 = 1;
          this.field_p = this.field_p + param3;
        }
        if (var6 != 0 &&
          2 == this.a(this.field_p - this.field_u, -104, param4, 0, param2)) {
          this.field_p = this.field_u;
        }
        var6Lifetime1 = 0;
        if (0 != param0) {
          this.field_j = this.field_j + param0;
          var6Lifetime1 = 1;
        }
        if (var6Lifetime1 != 0 &&
          this.a(0, -103, param4, this.e(9648) - this.field_r, param2) == 2) {
          this.field_j = this.field_r;
        }
        if (this.field_j == this.field_r &&
          this.field_p == this.field_u) {
          return;
        }
        this.field_q.field_u.a((ffa) (this), -123);
        this.field_q.field_u.b((ffa) (this), 7073);
        return;
    }

    final int r(int param0) {
        int var2 = -27 % ((param0 - 55) / 55);
        return this.field_s;
    }

    public final int a(byte param0) {
        if (param0 != 55) {
          return -104;
        }
        return this.field_k;
    }

    private final void s(int param0) {
        this.field_u = this.field_p;
        if (param0 == 0) {
          this.field_r = this.field_j;
          return;
        }
        this.field_j = -105;
        this.field_r = this.field_j;
    }

    public final la f(byte param0) {
        int var2 = 38 / ((param0 - 0) / 61);
        return this.field_q;
    }

    final void a(la param0, int param1, int param2, int param3, int param4, int param5) {
        qea var7 = null;
        int var8 = 0;
        try {
          var7 = param0.q(-79);
          if (param4 == 0) {
            var8 = 200 + var7.a(100, 0);
          } else {
            var8 = 0;
          }
          if (param2 <= 36) {
            this.field_t = -51;
          }
          this.a(param4, 1, var8, param0, param5, 2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mda.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int t(int param0) {
        if (param0 != 1) {
          this.field_m = -125;
          return this.field_k;
        }
        return this.field_k;
    }

    final void h(byte param0) {
        this.field_k = this.field_l;
        if (param0 == -1) {
          this.field_m = 0;
          return;
        }
        this.c((byte) 100);
        this.field_m = 0;
    }

    public final boolean a(int param0) {
        int var2 = 7 % ((param0 - 6) / 46);
        return 1 == this.field_s ? true : false;
    }

    final c d(boolean param0) {
        if (!param0) {
          this.k(117);
          return (c) ((Object) new mda());
        }
        return (c) ((Object) new mda());
    }

    private final void n(int param0) {
        if (param0 > this.field_k) {
          this.i((byte) -121);
        }
    }

    public final boolean h(int param0) {
        if (param0 != 18407) {
          return true;
        }
        return this.field_o;
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
          return 75;
        }
        return 0;
    }

    final void a(int param0, boolean param1) {
        float var3;
        hca var5;
        hca var6;
        hca var7;
        float var3Lifetime1;
        float var3Lifetime2;
        if (this.field_o) {
          return;
        }
        if (param1) {
          this.field_q.field_u.a((ffa) (this), -50);
          if (0 < this.field_n) {
            var3 = (float)this.field_m / (float)this.field_n;
            this.field_k = (int)((float)(this.field_i - this.field_l) * var3 + (float)this.field_l);
          }
          this.n(param0 ^ -786433);
          this.field_q.field_u.b((ffa) (this), 7073);
          if (~this.field_s != param0) {
            return;
          }
          var5 = this.field_q.u(-37);
          if (this.a((byte) 110, var5.e(9648), var5.d(3), var5.a((byte) 55), var5.c(param0 ^ 104))) {
            var5.G(31027);
          }
          return;
        }
        if (this.field_t > 0) {
          this.field_t = this.field_t - 1;
        } else {
          if (this.field_n > 0) {
            this.field_m = this.field_m + 1;
            if (this.field_n <= this.field_m) {
              this.i((byte) -126);
              return;
            }
            this.field_q.field_u.a((ffa) (this), -50);
            if (0 < this.field_n) {
              var3Lifetime1 = (float)this.field_m / (float)this.field_n;
              this.field_k = (int)((float)(this.field_i - this.field_l) * var3Lifetime1 + (float)this.field_l);
            }
            this.n(param0 ^ -786433);
            this.field_q.field_u.b((ffa) (this), 7073);
            if (~this.field_s != param0) {
              return;
            }
            var6 = this.field_q.u(-37);
            if (this.a((byte) 110, var6.e(9648), var6.d(3), var6.a((byte) 55), var6.c(param0 ^ 104))) {
              var6.G(31027);
            }
            return;
          }
        }
        this.field_q.field_u.a((ffa) (this), -50);
        if (0 < this.field_n) {
          var3Lifetime2 = (float)this.field_m / (float)this.field_n;
          this.field_k = (int)((float)(this.field_i - this.field_l) * var3Lifetime2 + (float)this.field_l);
        }
        this.n(param0 ^ -786433);
        this.field_q.field_u.b((ffa) (this), 7073);
        if (~this.field_s != param0) {
          return;
        }
        var7 = this.field_q.u(-37);
        if (this.a((byte) 110, var7.e(9648), var7.d(3), var7.a((byte) 55), var7.c(param0 ^ 104))) {
          var7.G(31027);
        }
        return;
    }

    public final boolean a(gma param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_q = (la) null;
          }
          stackIn_3_0 = this.a(param0, (byte) 61);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mda.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(int param0, gma param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param1, (byte) 61)) {
            return false;
          }
          if (param0 > -77) {
            this.field_n = -69;
          }
          this.i((byte) -128);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mda.OD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
          this.field_s = 113;
        }
    }

    public final int k(int param0) {
        if (param0 != -21185) {
          this.field_m = -67;
          return this.field_r;
        }
        return this.field_r;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) 110, param4, param2, param5, param1)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param3 != 0) {
            this.field_q = (la) null;
          }
          stackIn_6_0 = this.a(param0, -6);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("mda.WC(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    mda() {
        int fieldTemp$0 = ui.field_a;
        ui.field_a = ui.field_a + 1;
        this.field_w = fieldTemp$0;
    }

    public final int c(int param0) {
        if (param0 >= -11) {
          this.field_l = 88;
          return this.field_k;
        }
        return this.field_k;
    }

    public final boolean j(int param0) {
        if (param0 != -1) {
          this.a((byte) -105, false);
          return false;
        }
        return false;
    }

    public final boolean b(boolean param0) {
        if (param0) {
          return this.field_s == 1 ? true : false;
        }
        this.field_w = -99;
        return this.field_s == 1 ? true : false;
    }

    static {
    }
}
