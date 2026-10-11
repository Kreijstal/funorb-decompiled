/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ff extends pl {
    private String[] field_I;
    static oj field_H;
    private oi field_G;
    private dd field_F;
    static int field_J;

    final void b(int param0, int param1, int param2, int param3) {
        super.b(-120, param1, param2, param3);
        int var5 = param1 - this.field_o;
        int var6 = -this.field_l + param2;
        if (param0 > -45) {
          this.a(-20, (byte) -111, 69, -112);
        }
        dd var7 = this.a((byte) -117, var6, var5);
        if (var7 != null &&
          null != this.field_s) {
          ((ng) ((Object) this.field_s)).a(var7.field_k, this, param3, 111);
        }
    }

    ff(String param0, bf param1) {
        super(param0, (ce) null);
        this.field_F = null;
        try {
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        int var1 = 65 % ((param0 - 84) / 40);
        field_H = null;
    }

    String c(boolean param0) {
        if (this.field_F == null) {
          return null;
        }
        if (null == this.field_I) {
          return null;
        }
        if (param0) {
          return (String) null;
        }
        if (this.field_F.field_k >= this.field_I.length) {
          return null;
        }
        return this.field_I[this.field_F.field_k];
    }

    final static sc c(int param0, int param1, int param2, int param3) {
        sc var4 = new sc();
        var4.field_n = new int[param1];
        var4.field_k = param3;
        tg.field_c.a(var4, false);
        ld.a(param0, var4, param2 ^ param2);
        return var4;
    }

    void a(int param0, int param1, int param2, ub param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0 ^ 0, param1, param2, param3);
          if (param0 != 10000536) {
            this.field_G = (oi) null;
          }
          this.field_F = null;
          if (this.field_v) {
            var5_int = pg.field_n - param2 - this.field_o;
            var6 = -this.field_l + (fi.field_B - param1);
            this.field_F = this.a((byte) -120, var6, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ff.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.a(127, param0, ((qe) ((Object) this.field_w)).a((byte) 89, (ub) (this)), param2, param3);
        if (param1 != 61) {
          field_H = (oj) null;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        qe var5 = (qe) ((Object) this.field_w);
        dd var6 = this.field_F;
        if (var6 != null) {
          var7 = var5.a((ub) (this), param1 + 0, param0);
          var8 = var5.a(true, param3, (ub) (this));
          do {
            nh.a((byte) 69, 2 + var6.field_o, var6.field_j + (var8 - 2), 2 + var6.field_n, var7 + (var6.field_i - 2));
            var6 = var6.field_l;
          } while (var6 != null);
        }
    }

    final static nj a(int param0, int param1, byte param2, int param3, int param4) {
        nj var5;
        int var6;
        nj var5Lifetime1;
        var6 = wizardrun.field_H;
        var5 = (nj) (pc.field_l.b((byte) 93));
        while (var5 != null) {
          if (param1 == var5.field_l) {
            return var5;
          }
          var5 = (nj) (pc.field_l.d(8192));
        }
        var5Lifetime1 = new nj();
        var5Lifetime1.field_j = param0;
        var5Lifetime1.field_l = param1;
        var5Lifetime1.field_o = param4;
        pc.field_l.a(var5Lifetime1, false);
        ri.a(var5Lifetime1, param3, (byte) 121);
        if (param2 != 59) {
          ff.a(88, 105, (byte) -48, -68, 37);
        }
        return var5Lifetime1;
    }

    final void e(int param0) {
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        qe var3;
        af var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        fg var12;
        int var13;
        int var14;
        dd var15;
        int var16;
        int var7Lifetime1;
        var16 = wizardrun.field_H;
        this.field_G = new oi();
        var2 = param0;
        var3 = (qe) ((Object) this.field_w);
        var4 = var3.a((ub) (this), (byte) 116);
        while (true) {
          var5 = this.field_k.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_k.indexOf(">", var5);
          var6 = this.field_k.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_k.indexOf("</hotspot>", var5);
          var8 = var4.a((byte) 110, var5);
          var9 = var4.a((byte) 89, var2);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_d[var11];
            if (var11 == var8) {
              stackIn_7_0 = var4.a(62, var5);
            } else {
              stackIn_7_0 = var12.field_e[0];
            }
            var13 = stackIn_7_0;
            if (var11 == var9) {
              stackIn_12_0 = var4.a(62, var2);
            } else {
              if (var12 != null) {
                stackIn_12_0 = var12.field_e[-1 + var12.field_e.length];
              } else {
                stackIn_12_0 = 0;
              }
            }
            var14 = stackIn_12_0;
            var15 = new dd(var7Lifetime1, var13, var12.field_a, var14 - var13, Math.max(var3.a((byte) -104), -var12.field_a + var12.field_b));
            if (var10 != null) {
              ((dd) (var10)).field_l = var15;
            }
            var10 = var15;
            this.field_G.a(var15, false);
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        String[] var7 = null;
        String[] var8 = null;
        int var5 = 0;
        int var6 = wizardrun.field_H;
        try {
          if (param0 != 1) {
            this.field_F = (dd) null;
          }
          if (null == this.field_I ||
            param2 >= this.field_I.length) {
            var7 = new String[1 + param2];
            var8 = var7;
            String[] var4 = var8;
            if (this.field_I != null) {
              for (var5 = 0; this.field_I.length > var5; var5++) {
                var7[var5] = this.field_I[var5];
              }
            }
            this.field_I = var8;
          }
          this.field_I[param2] = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ff.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    boolean a(ub param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ff.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(126, param1, param2, param3, param4);
        if (param0 < 108) {
          return;
        }
        this.e(0);
    }

    private final dd a(byte param0, int param1, int param2) {
        dd var4;
        dd var5;
        int var6;
        var6 = wizardrun.field_H;
        if (param0 > -91) {
          return (dd) null;
        }
        var4 = (dd) (this.field_G.b((byte) 80));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_i <= param2 &&
              param1 >= var5.field_j &&
              var5.field_i + var5.field_o > param2 &&
              param1 <= var5.field_j + var5.field_n) {
              return var4;
            }
            var5 = var5.field_l;
          }
          var4 = (dd) (this.field_G.d(8192));
        }
        return null;
    }

    static {
        field_H = new oj();
    }
}
