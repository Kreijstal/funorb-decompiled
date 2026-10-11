/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    io field_d;
    io field_b;
    io field_m;
    private boolean field_l;
    int field_r;
    int field_q;
    int field_f;
    int field_k;
    int field_e;
    int field_t;
    int field_p;
    io field_g;
    io field_a;
    rb field_c;
    io field_n;
    io field_s;
    private int field_j;
    int field_h;
    int field_o;
    int field_i;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        g.$cfr$intArgs$a$3aedf8649552(param3, 99, param1, param4, param0);
        if (param2 > -60) {
          this.field_k = 55;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        bi.e(param3, param4, param5, param0, param1);
        if (param2 != -14) {
          this.field_f = 122;
        }
    }

    final static vk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        vk var7 = null;
        int var8 = 0;
        vk stackIn_3_0 = null;
        vk stackIn_6_0 = null;
        vk stackIn_9_0 = null;
        vk stackIn_13_0 = null;
        vk stackIn_18_0 = null;
        vk stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          if (param1 != 8947848) {
            stackIn_3_0 = (vk) null;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = bg.field_l;
            return stackIn_6_0;
          }
          if (var2_int > 255) {
            stackIn_9_0 = fg.field_m;
            return stackIn_9_0;
          }
          var3 = de.a('.', param0, -124);
          if (2 > var3.length) {
            stackIn_13_0 = bg.field_l;
            return stackIn_13_0;
          }
          var4 = var3;
          var5 = 0;
          while (true) {
            if (var4.length <= var5) {
              stackIn_21_0 = wh.a(var3[-1 + var3.length], false);
              return stackIn_21_0;
            }
            var6 = var4[var5];
            var7 = tg.a(-126, var6);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_18_0 = var7;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("of.G(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        var4 = ZombieDawn.field_J;
        try {
          if (vo.field_a != null &&
            vo.field_a[0] != null) {
            var1_int = vo.field_a[0].field_w;
            vo.field_a[0].e(0, 0);
            vo.field_a[1].e(-var1_int + bd.field_e, 0);
            vo.field_a[2].e(0, nh.field_P - var1_int);
            vo.field_a[3].e(-var1_int + bd.field_e, -var1_int + nh.field_P);
            g.$cfr$intArgs$a$3aedf8649552(0, 99, -var1_int + bd.field_e, nh.field_P, var1_int);
            if (param0 != 11690) {
              return;
            }
            var3 = nh.field_P - var1_int;
            for (var2 = var1_int; var2 < bi.field_b; var2 = var2 + ch.field_a.field_w) {
              ch.field_a.e(var2, 0);
              ch.field_a.f(var2, var3);
            }
            bi.f(0, var1_int, bd.field_e, nh.field_P - var1_int);
            var2Lifetime1 = -var1_int + bd.field_e;
            for (var3Lifetime1 = var1_int; bi.field_d > var3Lifetime1; var3Lifetime1 = var3Lifetime1 + hi.field_x.field_t) {
              hi.field_x.e(0, var3Lifetime1);
              hi.field_x.c(var2Lifetime1, var3Lifetime1);
            }
            pa.a(-21189);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "of.F(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 >= -100) {
            return;
          }
          if (this.field_l) {
            this.a(param1, param2, param0, 0);
          } else {
            this.a(param2, param1, param0, (byte) 53);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("of.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(String param0, int param1, int param2, byte param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_c.b(param0);
          var6 = this.field_c.field_x + this.field_c.field_w;
          if (param3 != 53) {
            this.a(60, -58, (byte) 14, 69, -115);
          }
          var7 = param1;
          if (bi.field_f < 6 + (var5_int + var7)) {
            var7 = -6 + (-var5_int + bi.field_f);
          }
          var8 = param2 - (this.field_c.field_w - 32);
          if (bi.field_a < var8 + var6 + 6) {
            var8 = -6 + (-var6 + bi.field_a);
          }
          bi.c(var7, var8, 6 + var5_int, 6 + var6, this.field_j);
          bi.b(var7 + 1, var8 + 1, var5_int + 4, var6 + 4, this.field_k);
          this.field_c.c(param0, var7 + 3, this.field_c.field_w + 3 + var8, this.field_j, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("of.J(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, rb param1) {
        vf var17 = null;
        qo var4 = null;
        vn[] var5 = null;
        cd var16 = null;
        cd var18 = null;
        int var7_int = 0;
        qo var6 = null;
        qo var7 = null;
        t discarded$0 = null;
        el discarded$1 = null;
        qo var8 = null;
        vn[] var9 = null;
        vn[] var10 = null;
        vn dupTemp$2 = null;
        qo var11 = null;
        qo var12 = null;
        vn var13 = null;
        qo var14 = null;
        qo var19 = null;
        int var15 = ZombieDawn.field_J;
        qo var14Lifetime1;
        qo var14Lifetime2;
        try {
          var17 = new vf(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_I + param1.field_x);
          this.field_n = (io) ((Object) var17);
          var17.field_l = 16777215;
          var4 = new qo();
          var17.a(var4, (byte) 106);
          this.field_h = 3;
          this.field_q = 3;
          var4.field_j = 11711154;
          var4.field_a = 15658734;
          this.field_k = 5592405;
          this.field_c = param1;
          this.field_r = 3;
          this.field_e = 3;
          this.field_i = 15658734;
          this.field_j = 15658734;
          this.field_t = -1;
          var4.a((byte) 73, 0).b((byte) -21, 15658734).a(tb.c(10066329, 8947848, -2967, 7829367), param0 ^ 37);
          var4.a((byte) 73, 1).a(tb.c(10066329, 11184810, -2967, 13421772), 33);
          var4.a((byte) 73, 3).a(tb.c(7829367, 8947848, param0 - 2971, 10066329), param0 ^ 37).a((byte) 126, 1).a(1, (byte) 57);
          var5 = new vn[9];
          var16 = new cd(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.field_z.length > var7_int; var7_int++) {
            var16.field_z[var7_int] = 1077952576;
          }
          var5[4] = (vn) ((Object) var18);
          var4.a((byte) 73, 4).a(true, (byte) 74).a(var5, 33);
          var4.a((byte) 73, 5).a(ab.a(0, (byte) -36, 0, 0, 65793), 33).a(true, (byte) -113).b((byte) -21, -1);
          this.field_a = (io) ((Object) var4);
          var6 = new qo(var4, true);
          var6.field_h = 0;
          var7 = new qo(var4, true);
          var7.field_h = 0;
          var7.a(69, bm.a((byte) -75, 8947848));
          var7.a((byte) 73, 1).a(bm.a((byte) -107, 11184810), param0 ^ 37).b((byte) -21, 2236962);
          this.field_g = (io) ((Object) new vl(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new t(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new el(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new qo();
          var17.a(var8, (byte) -57);
          var8.a((byte) 73, 0).a(tb.c(7829367, 15658734, param0 ^ -2963, 10066329), param0 + 29).b((byte) -21, 1118481).a(-1, param0 ^ -107);
          var8.a((byte) 73, param0).a(true, (byte) 72).a(var5, param0 + 29);
          this.field_b = (io) ((Object) var8);
          var9 = new vn[9];
          var10 = new vn[9];
          var9[4] = new vn(2, 1);
          var10[4] = new vn(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_z = new int[]{6710886, 7829367};
          var10[4].field_z = new int[]{6710886, 7829367};
          var11 = new qo();
          var12 = new qo();
          var11.a(1, var9, 0);
          var12.a(1, var10, 0);
          this.field_m = (io) ((Object) var4);
          this.field_s = (io) ((Object) var12);
          var13 = new vn(7, 4);
          var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          this.field_p = 10;
          var14 = new qo(var4, true);
          var14.a(var13.e(), 0);
          var13.b();
          var14Lifetime1 = new qo(var4, true);
          var14Lifetime1.a(var13.e(), param0 - 4);
          var13.b();
          var14Lifetime2 = new qo(var4, true);
          var14Lifetime2.a(var13.e(), 0);
          var13.b();
          var19 = new qo(var4, true);
          var19.a(var13, 0);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "of.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        if (param0 != 3) {
          return;
        }
        pa.a(-21189);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = ZombieDawn.field_J;
        try {
          var5_int = this.field_e + this.field_r;
          var6 = this.field_q + this.field_h;
          var7 = this.field_t;
          if (var7 == -1) {
            var7 = this.field_c.field_I + this.field_c.field_x;
          }
          var8 = bi.field_f >> 2;
          var9 = this.field_c.b(param1);
          var10 = this.field_c.field_I + this.field_c.field_x;
          var11 = 1;
          if (var9 > var8 ||
            -1 != param1.indexOf("<br>")) {
            if (kb.field_j == null) {
              kb.field_j = new String[16];
            }
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((var9 % var8 + var13 - 1) / var13) + var8;
            }
            var11Lifetime1 = this.field_c.a(param1, new int[]{var12}, kb.field_j);
            var9 = 0;
            var10 = var10 + var7 * (-1 + var11Lifetime1);
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_c.b(kb.field_j[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param0;
          if (var5_int + (var9 + var12) > bi.field_f) {
            var12 = -var9 + bi.field_f - var5_int;
          }
          var13Lifetime1 = -this.field_c.field_w + (param2 + 32);
          if (bi.field_a < var13Lifetime1 - (-var10 - var6)) {
            var13Lifetime1 = -var6 - var10 + param2;
          }
          bi.c(var12, var13Lifetime1, var5_int + var9, var10 + var6, this.field_i);
          bi.b(var12 + 1, var13Lifetime1 + 1, -2 + var9 + var5_int, var10 + var6 - 2, this.field_k);
          this.field_c.a(param1, var12 + this.field_r, this.field_q + var13Lifetime1, var9, var10, this.field_j, -1, 0, param3, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("of.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        bi.a(param3, param0, param2, param1, param6, param4);
        if (param5 > -88) {
          String var9 = (String) null;
          of.a((String) null, -19);
        }
    }

    public of() {
        this.field_l = true;
    }

    static {
    }
}
