/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tb {
    static dl[] field_e;
    static int field_g;
    bh[] field_h;
    static wb field_b;
    static tj field_d;
    static String field_f;
    static String field_c;
    static int field_a;

    final int a(byte param0, int param1, String param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = CrazyCrystals.field_B;
        try {
          var5_int = 0;
          if (param0 <= 74) {
            field_c = (String) null;
          }
          var6 = 0;
          var7 = param2.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param2.charAt(var8);
            if (var9 != 60) {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            } else {
              var6 = 1;
            }
          }
          if (var5_int > 0) {
            stackIn_21_0 = (param1 - param3 << 8) / var5_int;
            return stackIn_21_0;
          }
          stackIn_23_0 = 0;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("tb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, ng param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          mc.field_q = param1.c((byte) -7) << 5;
          if (param0 != -31416) {
            field_d = (tj) null;
          }
          var2_int = param1.h(255);
          jn.field_q = (7 & var2_int) << 18;
          mc.field_q = mc.field_q + (var2_int >> 3);
          jn.field_q = jn.field_q + (param1.c((byte) -7) << 2);
          var2_intLifetime1 = param1.h(255);
          of.field_D = 2064384 & var2_intLifetime1 << 15;
          jn.field_q = jn.field_q + (var2_intLifetime1 >> 6);
          of.field_D = of.field_D + (param1.h(255) << 7);
          var2_intLifetime2 = param1.h(param0 ^ -31305);
          jd.field_I = var2_intLifetime2 << 16 & 65536;
          of.field_D = of.field_D + (var2_intLifetime2 >> 1);
          jd.field_I = jd.field_I + param1.c((byte) -7);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, hp param1, byte param2) {
        md var8 = null;
        md var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        try {
          if (param2 > -122) {
            String var7 = (String) null;
            tb.a(114, true, 91, -82, (String) null);
          }
          var8 = tp.field_f;
          var9 = var8;
          var9.d(8, param0);
          var9.field_f = var9.field_f + 1;
          var4 = var9.field_f;
          var9.a(true, 1);
          var9.c(-161478600, param1.field_n);
          var9.c(-161478600, param1.field_k);
          var9.c(-161478600, param1.field_j);
          var9.a(param1.field_l, -16384);
          var9.a(param1.field_f, -16384);
          var9.a(param1.field_o, -16384);
          var9.a(param1.field_h, -16384);
          var9.a(true, param1.field_p.length);
          for (var5 = 0; var5 < param1.field_p.length; var5++) {
            var8.a(param1.field_p[var5], -16384);
          }
          var9.b(var4, (byte) -75);
          var9.c((byte) 68, var9.field_f - var4);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0) {
        int var4 = 0;
        int var2;
        bh[] var3;
        bh var5;
        int var7;
        int var6;
        var7 = CrazyCrystals.field_B;
        var2 = -1;
        if (null != this.field_h) {
          var3 = this.field_h;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.b(-2288);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        if (param0 >= 78) {
          return var2;
        }
        return -8;
    }

    final static void a(int param0, boolean param1, int param2, int param3, String param4) {
        try {
          if (param1) {
            tb.a(false);
          }
          an.field_q.a(param4, -1 + param3, param0, 0, -1);
          an.field_q.a(param4, param3 + 1, param0, 0, -1);
          an.field_q.a(param4, param3, param0 - 1, 0, -1);
          an.field_q.a(param4, param3, 1 + param0, 0, -1);
          an.field_q.a(param4, param3, param0, param2, -1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        bh var4 = null;
        int var5 = CrazyCrystals.field_B;
        if (param1 != 62) {
          hp var6 = (hp) null;
          tb.a(-55, (hp) null, (byte) 111);
        }
        for (var3 = 0; var3 < this.field_h.length; var3++) {
          var4 = this.field_h[var3];
          if (param0 < var4.field_e.length) {
            return var3;
          }
          param0 = param0 - (var4.field_e.length - 1);
        }
        return this.field_h.length;
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
        if (param0 != -2267) {
          field_f = (String) null;
        }
    }

    final int a(int param0, int param1) {
        bh var5 = null;
        int var6 = CrazyCrystals.field_B;
        bh[] var7 = this.field_h;
        bh[] var3 = var7;
        int var4 = 0;
        if (param1 != 1) {
          return -125;
        }
        while (var7.length > var4) {
          var5 = var7[var4];
          if (!(param0 >= var5.field_e.length)) {
            return var5.field_e[param0];
          }
          param0 = param0 - (-1 + var5.field_e.length);
          var4++;
        }
        return 0;
    }

    final int a(byte param0) {
        String var3;
        int stackIn_7_0 = 0;
        if (param0 != -90) {
          var3 = (String) null;
          this.a((byte) 90, -21, (String) null, 101);
        }
        if (null != this.field_h &&
          this.field_h.length > 0) {
          stackIn_7_0 = this.field_h[this.field_h.length - 1].field_b - this.field_h[0].field_f;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final int a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        bh var6;
        int var7;
        int var8;
        var8 = CrazyCrystals.field_B;
        if (this.field_h != null &&
          this.field_h.length != 0 &&
          param0 >= this.field_h[0].field_f) {
          if (param0 > this.field_h[this.field_h.length - 1].field_b) {
            return -1;
          }
          if (1 == this.field_h.length) {
            return this.field_h[0].a(-64, param1);
          }
          var4 = 0;
          var5 = 0;
          if (param2 != 51) {
            this.a(85, 75);
          }
          while (var5 < this.field_h.length) {
            var6 = this.field_h[var5];
            if (param0 >= var6.field_f &&
              var6.field_b >= param0) {
              var7 = var6.a(param2 - 92, param1);
              if (var7 != -1) {
                return var7 + var4;
              }
              return -1;
            }
            var4 = var4 + (var6.field_e.length - 1);
            var5++;
          }
          return -1;
        }
        return -1;
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        long var4 = 0L;
        int var6 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          var1_int = 0;
          var2 = 0;
          while (ge.b(-42)) {
            lb.field_l.f(0);
            if (lb.field_l.a(true)) {
              var1_int = 1;
            }
            if (pj.field_q != 13) {
              continue;
            }
            var2 = 1;
          }
          lb.field_l.a(0, be.a(-1013410975, to.field_a, dp.field_h), be.a(-1013410975, qh.field_i, bm.field_h));
          if (lb.field_l.a(param0)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            lb.field_l.field_c >= 0) {
            var3 = sn.field_a[lb.field_l.field_c];
            if (var3 == 2 ||
              var3 == 5) {
              gn.f(false);
            }
          } else {
            if (var2 != 0 &&
              am.field_g != 2) {
              gn.f(false);
            }
          }
          if (0 == var3 &&
            am.field_g == 2) {
            var4 = lo.a((byte) -67) - wm.field_d;
            var6 = (int)((10999L - var4) / 1000L);
            if (0 >= var6) {
              var3 = 2;
              a.a(108, 5, true);
            }
          }
          stackIn_26_0 = var3;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "tb.H(" + param0 + ')');
        }
    }

    static {
        field_c = "Player Name: ";
        field_f = "Dig through the earth to let the rocks fall. Take your time; you can support the rocks!";
        field_b = new wb();
    }
}
