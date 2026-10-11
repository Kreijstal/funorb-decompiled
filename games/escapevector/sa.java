/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends hg {
    boolean field_h;
    ed field_i;
    static String field_q;
    int field_l;
    int field_k;
    int field_j;
    private int field_s;
    private int field_m;
    boolean field_p;
    boolean field_r;
    int field_g;
    private ed field_t;
    int field_o;
    int field_n;

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        var4 = 100;
        var5 = ma.field_a.field_cb % var4;
        if (null == this.field_i) {
          return;
        }
        var6 = this.field_i.field_A;
        var7 = this.field_i.field_z;
        var8 = var6 + (var4 - var5) * 2 * var6 / var4;
        var9 = (-var5 + var4) * var7 * 2 / var4 + var7;
        if (param0) {
          this.a(false, -79, -121);
        }
        var10 = var5 * 128 / var4;
        var11 = 16711680;
        var12 = this.field_g + (-param2 - (var9 - var7) / 2);
        var13 = var9 + var12;
        var14 = 480;
        if (var13 >= 0 &&
          var12 < var14) {
          var15 = -param1 + this.field_k - (var8 - var6) / 2;
          var16 = var8 + var15;
          var17 = ma.field_a.field_n;
          em.b(var15, var12, var8, var9, var11, var10);
          if (var15 > 0 &&
            var17 <= var16) {
            return;
          }
          if (0 >= var15) {
            var15 = var15 + var17;
          } else {
            var15 = var15 - var17;
          }
          em.b(var15, var12, var8, var9, var11, var10);
          return;
        }
        return;
    }

    final static void d(byte param0) {
        if (param0 != 27) {
          sa.d((byte) -32);
        }
        je.field_a = new cn();
    }

    private final fn b(boolean param0) {
        rk[] var4 = w.c(false);
        var4 = var4;
        if (!param0) {
          return (fn) null;
        }
        if (var4 == null) {
          return null;
        }
        return var4[this.field_n].a((byte) 120, this.field_l);
    }

    final static void a(int param0, int param1, boolean param2, ed[] param3, int param4, int param5, ed[] param6, int param7, int param8, wl param9, int param10, boolean param11) {
        try {
          di.a(param3, param8, param5, param10, param0, param5, param9, param1, param6, param11, param8, param4, param9, (byte) -41, param7);
          if (param2) {
            field_q = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ')');
        }
    }

    private final ed d(int param0) {
        if (param0 != 0) {
          sa.a(22, (byte) 101);
        }
        rk[] var4 = w.c(false);
        var4 = var4;
        if (var4 == null) {
          return null;
        }
        return var4[this.field_n].a(-125, this.field_l);
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6) {
        this(param0, param1, param2, param3);
        this.field_p = param5 ? true : false;
        this.field_l = param6;
        this.field_r = param4 ? true : false;
        this.e(-7012);
    }

    final void a(boolean param0, oe param1) {
        int var4 = 0;
        int var7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        try {
          if (this.field_i == null) {
            return;
          }
          var3_int = 0;
          for (var4 = 0; this.field_i.field_x > var4; var4++) {
            var5 = var4 + (this.field_g + this.field_i.field_v);
            var6 = var5 >> 5;
            var5 = var5 & 31;
            for (var7 = 0; var7 < this.field_i.field_s; var7++) {
              var8 = var7 + (this.field_i.field_q + this.field_k);
              var9 = var8 >> 5;
              var8 = var8 & 31;
              while (var9 < 0) {
                var9 = var9 + param1.field_Mb;
              }
              var9 = var9 % param1.field_Mb;
              if (this.field_i.field_B[var3_int] != 0) {
                var10 = param1.field_V[var9 + param1.field_Mb * var6];
                if (si.field_v != var10) {
                  if (var10 == null) {
                    var10 = new int[32];
                    param1.field_V[var9 + var6 * param1.field_Mb] = new int[32];
                  }
                  var10[var5] = lb.a(var10[var5], 1 << var8);
                }
              }
              var3_int++;
            }
          }
          if (!param0) {
            this.field_j = -96;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("sa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var9Lifetime1;
        var13 = EscapeVector.field_A;
        if (this.field_i == null) {
          return;
        }
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        if (this.field_h) {
          var9Lifetime1 = this.a((byte) 54);
          if (var9Lifetime1 > 0) {
            var5 = this.field_s;
            var4 = this.field_t;
            var6 = this.field_m;
            if (var5 < 0) {
              var7 = -var5;
            }
            if (var6 < 0) {
              var8 = -var6;
            }
          }
        }
        var10 = this.field_g - param0;
        if (var10 < 480 + var8 &&
          var10 > -this.field_i.field_z) {
          var11 = -param2 + (this.field_k + ma.field_a.field_n + ma.field_a.field_n) - var7;
          var12 = this.field_i.field_A + var7 + var7;
          var11 = var11 + var12;
          var11 = var11 % ma.field_a.field_n;
          for (var11 = var11 - var12; var11 < 640; var11 = var11 + ma.field_a.field_n) {
            if (var4 == null) {
              this.field_i.e(var11, var10);
            } else {
              this.field_i.e(var11 + var7, var10);
              ((ed) (var4)).c(var5 + var11 + var7, var10 + var6, this.a((byte) 122));
            }
          }
          if (param1 <= 106) {
            this.a(false, -48, -24);
          }
          if (this.field_r) {
            this.a(false, param2, param0);
          }
          return;
        }
        return;
    }

    private final int a(byte param0) {
        double var2_double = 0.0;
        double var4 = 0.0;
        if (param0 < 36) {
          field_q = (String) null;
        }
        if (this.field_n != 2) {
          var2_double = (double)(ma.field_a.field_Zb / 8);
          if (kg.a((byte) -98, this.field_n)) {
            var2_double = (double)(ma.field_a.field_cb % 100) / 100.0;
          }
          var4 = Math.cos(3.141592653589793 * var2_double) + 2.0;
          return (int)(var4 * var4 * 28.0);
        }
        int var2 = -42 + this.field_o;
        if (var2 <= 0) {
          return 0;
        }
        return 16 * var2;
    }

    private final void e(int param0) {
        this.field_i = k.a(this.field_l, (byte) -39, this.field_n);
        this.field_t = this.d(0);
        fn var2 = this.b(true);
        if (param0 != -7012) {
          return;
        }
        if (var2 == null) {
          return;
        }
        this.field_s = var2.field_c;
        this.field_m = var2.field_b;
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        this(param0, param1, param2, param3);
        this.field_r = param4 ? true : false;
        this.field_p = param5 ? true : false;
    }

    final static void a(int param0, byte param1) {
        tj var2 = null;
        String var2_ref = null;
        String var3 = null;
        ed[] var4 = null;
        String[] var5 = null;
        tj var6 = null;
        if (hi.a(param0, -2)) {
          var2 = new tj(ic.field_n, ae.field_c, qh.field_j, true);
          re.a(1820, var2);
        }
        if (param1 >= -69) {
          return;
        }
        if (param0 == 2) {
          var2_ref = "vengeance_intro";
          var3 = "scene";
          var4 = tm.field_cb;
          var5 = me.field_o;
          var6 = new tj(var2_ref, var3, var4, var5, true);
          re.a(1820, var6);
        }
    }

    final boolean e(byte param0) {
        if (mf.a(this.field_n, -64)) {
          return false;
        }
        if (1 == this.field_n) {
          return false;
        }
        if (5 == this.field_n) {
          return false;
        }
        if (this.field_n == 6) {
          return false;
        }
        if (param0 != -5) {
          return false;
        }
        if (this.field_n != 7) {
          return true;
        }
        return false;
    }

    final void a(oe param0, byte param1) {
        int var4 = 0;
        int var7 = 0;
        int var11 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var12 = 0;
        int[] var13 = null;
        var12 = EscapeVector.field_A;
        try {
          if (this.field_i == null) {
            return;
          }
          var3_int = 0;
          if (param1 < 58) {
            this.e(-105);
          }
          for (var4 = 0; this.field_i.field_x > var4; var4++) {
            var5 = var4 + this.field_i.field_v + this.field_g;
            var6 = var5 >> 5;
            var5 = var5 & 31;
            for (var7 = 0; var7 < this.field_i.field_s; var7++) {
              var8 = var7 + (this.field_k + this.field_i.field_q);
              var9 = var8 >> 5;
              var8 = var8 & 31;
              while (0 > var9) {
                var9 = var9 + param0.field_Mb;
              }
              var9 = var9 % param0.field_Mb;
              if (null != ma.field_a.field_eb) {
                ma.field_a.field_eb.a(var9, var6, true);
              }
              if (0 != this.field_i.field_B[var3_int]) {
                var10 = param0.field_V[param0.field_Mb * var6 + var9];
                if (var10 != null) {
                  if (si.field_v == var10) {
                    var13 = new int[32];
                    var10 = var13;
                    param0.field_V[param0.field_Mb * var6 + var9] = new int[32];
                    for (var11 = 0; var11 < 32; var11++) {
                      var13[var11] = -1;
                    }
                    var10[var5] = ae.a(var10[var5], ~(1 << var8));
                  } else {
                    var10[var5] = ae.a(var10[var5], ~(1 << var8));
                  }
                }
              }
              var3_int++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("sa.C(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          wl var2 = (wl) null;
          sa.a(77, 13, true, (ed[]) null, -108, -59, (ed[]) null, -14, -30, (wl) null, -40, true);
        }
        field_q = null;
    }

    sa(int param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        Object stackIn_2_0Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        this.field_o = 0;
        this.field_g = param3;
        this.field_k = param2;
        this.field_j = param0;
        this.field_n = param1;
        stackIn_2_0 = this;
        if (param1 != 2) {
          stackIn_3_0 = this;
          stackIn_2_0Lifetime1 = stackIn_3_0;
          if (!kg.a((byte) -125, this.field_n)) {
            stackIn_4_1 = false;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_1 = true;
        }
        this.field_h = stackIn_4_1;
        this.field_p = false;
        this.field_r = false;
        this.field_l = 0;
        this.e(-7012);
    }

    static {
        field_q = "Enter the cave, find the container,<br>and land next to it to attach your tether.";
    }
}
