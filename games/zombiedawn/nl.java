/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends al {
    static volatile int field_s;
    static dj field_p;
    static vn field_r;
    private int field_n;
    static int[] field_o;
    static dj field_t;
    private int field_q;
    static cg field_m;

    final static void a(lg param0, byte param1) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          rn.field_b = param0;
          if (rn.field_b != null &&
            rn.field_b.field_c) {
            stackIn_5_0 = 1;
          } else {
            stackIn_5_0 = 0;
          }
          p.b(stackIn_5_0, 27102);
          if (param1 > -89) {
            field_s = -115;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("nl.BA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var20 = 0;
        String[] var2;
        String[] var3;
        String var4;
        String var5;
        tj var6;
        oi var7;
        int var8;
        int var9;
        int var10;
        vn var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        String var19;
        int var21;
        String[] var22;
        vn var23;
        String var24;
        String var25;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        var21 = ZombieDawn.field_J;
        super.a((byte) -71);
        li.a(false);
        var22 = hk.field_J;
        var2 = var22;
        var3 = gd.field_C;
        var4 = kj.field_d;
        var5 = eo.field_j;
        var6 = sg.field_jb;
        var7 = bj.field_q;
        if (this.field_d == 6) {
          var7.a(me.field_Hb, bd.field_d, id.field_M + 288 - 14, 16777215, 0);
        }
        var8 = na.field_f;
        var9 = 288;
        for (var10 = 0; var22.length > var10; var10++) {
          if (this.e(var10, -30858)) {
            var9Lifetime1 = id.field_M + cg.field_g[var10];
            var8Lifetime1 = ld.field_k[var10] + vh.field_b;
            if (this.field_d == 6) {
              bi.a(-3 + var8Lifetime1, -3 + var9Lifetime1, 38, 38, 6, 3355443, 128);
              if (this.g(var10, -7)) {
                if (this.field_q == var10) {
                  bi.a(-3 + var8Lifetime1, var9Lifetime1 - 3, 38, 38, 6, 0, 128);
                }
                if (this.field_n == var10) {
                  bi.e(-3 + var8Lifetime1, -3 + var9Lifetime1, 38, 38, 6, 16777215);
                }
                var11 = this.c(var10, true);
                if (var11 == null) {
                  var11 = e.field_G;
                }
                var11.g(var8Lifetime1, var9Lifetime1);
              }
            } else {
              if (this.field_q == var10) {
                bi.a(-3 + var8Lifetime1, var9Lifetime1 - 3, 38, 38, 6, 0, 128);
              }
              if (this.field_n == var10) {
                bi.e(-3 + var8Lifetime1, -3 + var9Lifetime1, 38, 38, 6, 16777215);
              }
              var11 = this.c(var10, true);
              if (var11 == null) {
                var11 = e.field_G;
              }
              var11.g(var8Lifetime1, var9Lifetime1);
            }
          }
        }
        var9Lifetime2 = 384;
        var7.a(m.field_C, bd.field_d, id.field_M + var9Lifetime2 + 32, 16777215, 0);
        var10Lifetime1 = -1;
        if (param0 >= -35) {
          return;
        }
        if (-1 == this.field_q) {
          if (this.field_n != -1) {
            var10Lifetime1 = this.field_n;
          }
        } else {
          var10Lifetime1 = this.field_q;
        }
        if (var10Lifetime1 != -1 &&
          this.e(var10Lifetime1, -30858)) {
          var23 = this.c(var10Lifetime1, true);
          var23.b(110 + vh.field_b, 140 + id.field_M - 32);
          var6.a(var22[var10Lifetime1], vh.field_b + 260, id.field_M + 80, 300, 85, 0, 0, 1, 2, 35);
          var12 = 280 + vh.field_b;
          var13 = -32 + id.field_M + 200;
          var14 = 280;
          var15 = 100;
          var16 = var7.field_I + var7.field_x;
          if (this.f(var10Lifetime1, -21) &&
            !this.g(var10Lifetime1, -7)) {
            var25 = sh.field_f;
            var7.a(var25, var12, var13, var14, var15, 16777215, 0, 0, 0, var16);
          } else {
            var24 = var3[var10Lifetime1];
            var18 = var16 * var7.a(var24, var12, var13, var14, var15, 16777215, 0, 0, 0, var16);
            var13 = var13 + (6 + (var18 + var16));
            var19 = var5 + 100 * cb.field_N[var10Lifetime1];
            var7.c(var19, var12, var13, 16777215, 0);
            var12 = var12 + (var7.b(var19) + 12);
            var7.c(var4, var12, var13, 16777215, 0);
            var12 = var12 + var7.b(var4);
            for (var20 = 0; var20 < cb.field_N[var10Lifetime1]; var20++) {
              hm.field_E.b(var20 * (hm.field_E.field_r >> 1) + var12, var13 - hm.field_E.field_q + 2);
            }
          }
        }
    }

    final static void a(int param0, fi param1, byte param2, dj param3) {
        try {
          mj.field_b = nk.a((byte) 122) * param0 / 1000;
          tp.a((byte) 124, param3);
          ae.a(param3, (byte) -128);
          mn.a(param3, true);
          ta.a(255);
          hg.a((byte) -101);
          int var4_int = -67 / ((param2 - 2) / 56);
          ej.field_x = 0 - mj.field_b;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "nl.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_o = null;
        field_m = null;
        field_r = null;
        field_t = null;
        if (param0 <= 64) {
          nl.d((byte) -77);
        }
    }

    private final vn c(int param0, boolean param1) {
        if (this.g(param0, -7)) {
          return ed.field_a[param0];
        }
        if (be.field_j <= 0 &&
          uc.field_a[param0]) {
          return hf.field_E;
        }
        if (!param1) {
          field_p = (dj) null;
        }
        return e.field_G;
    }

    final int c(int param0, int param1) {
        if (this.field_d == param1) {
          return (param0 == 0 ? 100 : 350) + vh.field_b;
        }
        if (!po.w(13296)) {
          return bd.field_d - (this.field_i >> 1);
        }
        return (param0 != 0 ? 470 : 50) + vh.field_b;
    }

    final void a(byte param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        var6 = ZombieDawn.field_J;
        super.a((byte) 85, param1);
        this.field_n = -1;
        var3 = -vh.field_b + ha.field_b;
        var4 = -id.field_M + ei.field_K;
        var5 = 0;
        L1: while (true) {
          if (ld.field_k.length > var5) {
            if (var3 >= ld.field_k[var5] &&
              40 + ld.field_k[var5] > var3 &&
              var4 >= cg.field_g[var5] &&
              var4 < 40 + cg.field_g[var5]) {
              this.field_n = var5;
              if (this.field_d != 6) {
                break L1;
              }
              if (0 > this.field_n) {
                break L1;
              }
              if (this.g(this.field_n, -7)) {
                break L1;
              }
              this.field_n = -1;
              break L1;
            }
            var5++;
            continue;
          }
          break;
        }
        if (ci.field_d != 0) {
          if (this.field_q != this.field_n) {
            if (this.field_n != -1) {
              this.field_q = this.field_n;
            }
          } else {
            this.field_q = -1;
          }
          var5Lifetime1 = 45 % ((param0 + 39) / 61);
        } else {
          var5Lifetime1 = 45 % ((param0 + 39) / 61);
        }
        return;
    }

    final void a(byte param0, int param1, boolean param2) {
        int var12 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var10;
        int var11;
        int var13;
        var13 = ZombieDawn.field_J;
        super.a((byte) 73, param1, param2);
        this.field_q = -1;
        this.field_n = -1;
        if (param0 < 65) {
          this.field_q = 92;
        }
        var4 = 32;
        for (var5 = 0; wf.field_P.length > var5; var5++) {
          if (!this.e(var5, -30858)) {
            var4--;
          }
        }
        na.field_f = 120;
        var5 = 0;
        do {
          var5++;
          var6 = (int)Math.ceil((double)((float)var4 / (float)var5));
        } while (var6 > 14);
        na.field_f = 320 - (-40 + 40 * var6) / 2;
        var7 = na.field_f;
        var8 = 288;
        var8 = var8 + (120 - 40 * var5) / 2;
        var9 = new int[]{var6, var6, var6, 0};
        if (var4 % var5 != 1) {
          if (var4 % var5 != 2) {
            na.field_f = na.field_f - 20;
            var7 = na.field_f;
          } else {
            var9[1] = var9[1] - 1;
            var7 -= 20;
          }
        } else {
          var9[0] = var9[0] - 1;
          var9[2] = var9[2] - 1;
        }
        var10 = 0;
        var11 = 0;
        for (var12 = 0; var12 < 32; var12++) {
          if (this.e(var12, -30858)) {
            ld.field_k[var12] = var7;
            cg.field_g[var12] = var8;
            var7 += 40;
            var10++;
            if (var10 == var9[var11]) {
              var8 += 40;
              var7 = na.field_f;
              var10 = 0;
              var11++;
              if (var9[-1 + var11] < var9[var11]) {
                var7 -= 20;
              }
            }
          }
        }
        return;
    }

    private final boolean g(int param0, int param1) {
        int[] var4 = param1 != ~this.field_d ? dj.field_i : kg.field_g;
        int[] var3 = var4;
        return vi.a(param0, var4, -112);
    }

    nl(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_n = -1;
        this.field_q = -1;
    }

    private final boolean e(int param0, int param1) {
        boolean stackIn_10_0 = false;
        if (param1 != -30858) {
          return false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.g(param0, -7) && (!wf.field_P[param0] ||
          uc.field_a[param0] &&
          !(be.field_j > 0) &&
          !(lo.field_j >= 2))) {
          stackIn_10_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_10_0 = true;
        }
        return stackIn_10_0;
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          byte[] var4 = (byte[]) null;
          nl.a(-87, -56, -85, (byte[]) null);
        }
        if (!po.w(13296) ||
          this.field_d == 6) {
          return this.c(param1, 6) + this.field_i;
        }
        if (0 == param1) {
          return this.c(param1, 6) + 350;
        }
        return 100 + this.c(param1, 6);
    }

    private final boolean f(int param0, int param1) {
        boolean stackIn_9_0 = false;
        if (param1 != -21) {
          return true;
        }
        stackIn_9_0 = (param0 == 29) || (param0 == 30) || (param0 == 31) || (param0 == 20);
        return stackIn_9_0;
    }

    final static void c(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawn.field_J;
        try {
          if (param0 != -30006) {
            return;
          }
          var5 = je.field_b;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "nl.HA(" + param0 + ')');
        }
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        bd var5 = null;
        byte[] var6 = null;
        var7 = ZombieDawn.field_J;
        try {
          if (param2 > -115) {
            nl.c(91);
          }
          if (param0 > 0) {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; var5_int < param1; var5_int++) {
              var8[var5_int] = param3[var5_int + param0];
            }
          } else {
            var4 = param3;
          }
          var5 = new bd();
          var5.a(71);
          var5.a(true, var4, (long)(8 * param1));
          var6 = new byte[64];
          var5.a(var6, 0, -128);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("nl.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_s = 0;
        field_m = new cg(9, 0, 4, 1);
    }
}
