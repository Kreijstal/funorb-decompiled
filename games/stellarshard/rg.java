/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rg extends ig {
    private String[] field_G;
    private oj field_H;
    static int field_F;
    private ja field_K;
    static ua field_J;
    static String field_I;

    String d(int param0) {
        if (this.field_K == null) {
          return null;
        }
        if (this.field_G == null) {
          return null;
        }
        if (param0 != 3690) {
          rj var3 = (rj) null;
          this.a(86, (rj) null);
        }
        if (this.field_K.field_l >= this.field_G.length) {
          return null;
        }
        return this.field_G[this.field_K.field_l];
    }

    final void b(int param0, byte param1, int param2, int param3) {
        this.b(param0, param2, param3, ((pj) ((Object) this.field_u)).a((rj) (this), 28361), 23987);
        if (param1 != -11) {
          CharSequence var6 = (CharSequence) null;
          rg.a((byte) -126, (CharSequence) null);
        }
    }

    private final ja b(int param0, int param1, int param2) {
        ja var5 = null;
        int var6 = stellarshard.field_B;
        ja var4 = (ja) (this.field_H.b(-127));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_s <= param0 &&
              (var5.field_r <= param2 && var5.field_n + var5.field_s > param0) &&
              !(param2 > var5.field_o + var5.field_r)) {
              return var4;
            }
            var5 = var5.field_p;
          }
          var4 = (ja) (this.field_H.b((byte) -76));
        }
        if (param1 < -122) {
          return null;
        }
        return (ja) null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 < 39) {
          this.a(125, (byte) -86, 89, 28);
        }
        super.a(param0, param1, param2, 84);
        int var5 = param1 - this.field_w;
        int var6 = param0 - this.field_k;
        ja var7 = this.b(var5, -124, var6);
        if (var7 != null &&
          this.field_v != null) {
          ((md) ((Object) this.field_v)).a(var7.field_l, -2, this, param2);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 19) {
            stackIn_4_0 = th.a(-123, true, 10, param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rg.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void g(int param0) {
        int var1_int = 0;
        int var2 = stellarshard.field_B;
        int var1_intLifetime1;
        rb.field_u.a((byte) -115);
        if (param0 != -33) {
          return;
        }
        try {
          for (var1_int = 0; 32 > var1_int; var1_int++) {
            vg.field_t[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            ce.field_c[var1_intLifetime1] = 0L;
          }
          ol.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rg.I(" + param0 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          if (null == this.field_G ||
            param1 >= this.field_G.length) {
            var7 = new String[1 + param1];
            var8 = var7;
            var4 = var8;
            if (this.field_G != null) {
              for (var5 = 0; this.field_G.length > var5; var5++) {
                var7[var5] = this.field_G[var5];
              }
            }
            this.field_G = var8;
          }
          if (param2 != 1) {
            return;
          }
          this.field_G[param1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("rg.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(int param0, rj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2147483648) {
            this.b(-88, (byte) -84, -22, 108);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    rg(String param0, uk param1) {
        super(param0, (lf) null);
        this.field_K = null;
        try {
          this.field_u = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a((byte) 66);
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        pj var9 = (pj) ((Object) this.field_u);
        ja var6 = this.field_K;
        if (var6 == null) {
        } else {
          var7 = var9.a(param1 ^ -57, (rj) (this), param3);
          var8 = var9.a((byte) -2, (rj) (this), param2);
          do {
            og.a(-2 + var7 + var6.field_s, (byte) 105, var6.field_n + 2, 2 + var6.field_o, -2 + (var8 + var6.field_r));
            var6 = var6.field_p;
          } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var12 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        pj var3;
        vk var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        uj var13;
        int var14;
        int var15;
        ja var16;
        int var17;
        int var8Lifetime1;
        var17 = stellarshard.field_B;
        this.field_H = new oj();
        var2 = 0;
        var3 = (pj) ((Object) this.field_u);
        var5 = -101 / ((param0 + 30) / 33);
        var4 = var3.b((rj) (this), (byte) 94);
        while (true) {
          var6 = this.field_m.indexOf("<hotspot=", var2);
          if (var6 == -1) {
            return;
          }
          var8 = this.field_m.indexOf(">", var6);
          var7 = this.field_m.substring(var6 + 9, var8);
          var8Lifetime1 = Integer.parseInt(var7);
          var2 = this.field_m.indexOf("</hotspot>", var6);
          var9 = var4.a(48, var6);
          var10 = var4.a(113, var2);
          var11 = null;
          for (var12 = var9; var10 >= var12; var12++) {
            var13 = var4.field_a[var12];
            if (~var12 == ~var9) {
              stackIn_7_0 = var4.b(var6, 26);
            } else {
              stackIn_7_0 = var13.field_a[0];
            }
            var14 = stackIn_7_0;
            if (var10 != var12) {
              if (var13 != null) {
                stackIn_12_0 = var13.field_a[var13.field_a.length - 1];
              } else {
                stackIn_12_0 = 0;
              }
            } else {
              stackIn_12_0 = var4.b(var2, -127);
            }
            var15 = stackIn_12_0;
            var16 = new ja(var8Lifetime1, var14, var13.field_b, -var14 + var15, Math.max(var3.a((byte) -73), var13.field_c - var13.field_b));
            if (var11 != null) {
              ((ja) (var11)).field_p = var16;
            }
            var11 = var16;
            this.field_H.b(-71, var16);
          }
        }
    }

    public static void d(boolean param0) {
        field_J = null;
        field_I = null;
        if (!param0) {
          field_J = (ua) null;
        }
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.field_K = null;
          if (this.field_q) {
            var5_int = -this.field_w - param2 + ni.field_e;
            var6 = -param0 + eb.field_a - this.field_k;
            this.field_K = this.b(var5_int, -127, var6);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rg.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        pi discarded$0 = new pi();
        field_J = new ua(0);
    }
}
