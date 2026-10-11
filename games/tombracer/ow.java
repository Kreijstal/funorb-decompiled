/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ow extends wv {
    static boolean field_s;
    private dea field_r;
    static int[] field_q;

    final void a(byte param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        super.a((byte) 89);
        if (param0 <= 78) {
          this.field_r = (dea) null;
        }
        if (null == rba.field_a) {
          return;
        }
        if (!vpa.a(54)) {
          if (!rba.field_a.field_D) {
            this.a(22174, uja.field_e);
          } else {
            if (!rba.field_a.d((byte) 100)) {
              this.a(22174, mi.field_l);
            } else {
              this.a(22174, sja.field_h);
            }
          }
        } else {
          if (!rba.field_a.field_D) {
            this.a(22174, ma.field_f);
          } else {
            if (!rba.field_a.d((byte) 68)) {
              this.a(22174, hi.field_q);
            } else {
              this.a(22174, sk.field_f);
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        int var3 = super.a((byte) 112, param1);
        if (param0 < 111) {
          return 125;
        }
        if (this.field_m[param1].field_g == 5) {
          var3 -= 10;
          return var3;
        }
        if (this.field_m[param1].field_g != 6) {
          return var3;
        }
        var3 -= 10;
        return var3;
    }

    final int g(int param0, int param1) {
        int var4 = 0;
        int var3;
        int var6;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        int var5;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_n;
        if (param1 != 30) {
          return -25;
        }
        for (var4 = 0; param0 > var4; var4++) {
          if (this.field_m[var4].field_g != 5) {
            stackIn_11_0 = (6 == this.field_m[var4].field_g) ? 1 : 0;
          } else {
            stackIn_11_0 = 1;
          }
          var5 = stackIn_11_0;
          stackIn_13_0 = var3;
          if (var5 != 0) {
            stackIn_14_1 = this.field_m[var4].d(11919) / 2;
          } else {
            stackIn_14_1 = this.field_i;
          }
          var3 = stackIn_13_0 + stackIn_14_1;
          if (this.field_m[var4].field_g == 5) {
            var3 += 10;
          }
        }
        if (this.field_m[param0].field_g != 5) {
          return var3;
        }
        var3 += 10;
        return var3;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        this.field_r.c(-72);
    }

    final static void a(byte param0, String[] param1) {
        try {
          if (on.field_b != null) {
            on.field_b.field_y.a(13597, param1);
          }
          if (md.field_F != null) {
            md.field_F.field_x.a(13597, param1);
          }
          int var2_int = -77 % ((-37 - param0) / 57);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ow.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ow(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_r = new dea();
    }

    final void c(int param0) {
        ira.a(false, -1, (byte) -125);
        if (param0 != -6) {
          this.c(49);
        }
    }

    final int a(int param0, byte param1) {
        int var3 = super.a(param0, param1);
        if (5 == this.field_m[param0].field_g) {
          var3 -= 10;
          return var3;
        }
        if (this.field_m[param0].field_g != 6) {
          return var3;
        }
        var3 -= 10;
        return var3;
    }

    final void a(byte param0, boolean param1) {
        super.a(param0, param1);
        int var3 = this.field_m[1].field_i - 70 + this.field_r.e(93) - 150;
        tp.field_K.a((aaa.a(false) >> 1) - (tp.field_K.a() >> 1), var3);
    }

    final static jea a(int param0, int param1, int param2, int param3, il param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, byte param12) {
        jea var13 = null;
        RuntimeException var13_ref = null;
        jea stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new jea(0L, (jea) null);
          var13.field_w = sva.a(param11, param2, 4);
          var13.field_C = sva.a(param1, param10, 4);
          var13.field_db = sva.a(param0, param5, 4);
          if (param12 >= -75) {
            field_s = true;
          }
          var13.field_n = sva.a(param6, param9, 4);
          var13.field_M = sva.a(param7, param8, 4);
          var13.field_H = param4;
          var13.field_ib = param3;
          stackIn_3_0 = var13;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_6_0 = var13_ref;
          stackIn_6_1 = new StringBuilder().append("ow.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    public static void d(int param0) {
        int var1 = -126 % ((param0 - 20) / 55);
        field_q = null;
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var5 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2);
        this.field_r.a((byte) -120, param0, !param1 ? true : false);
        if (rba.field_a == null) {
          return;
        }
        if (rba.field_a.field_k == null) {
          return;
        }
        if (!rba.field_a.field_D) {
          return;
        }
        if (rba.field_a.d((byte) 92)) {
          return;
        }
        int var4 = rba.field_a.field_k.field_b;
        if (1 == (1 & var4 >> rba.field_a.field_x)) {
          this.field_m[1].field_e = pc.field_g.toUpperCase();
          return;
        }
        if (var4 == 0) {
          this.field_m[1].field_e = lda.field_I.toUpperCase();
          return;
        }
        this.field_m[1].field_e = jf.field_s.toUpperCase();
    }

    static {
        field_q = new int[128];
    }
}
