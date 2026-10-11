/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements ol {
    static float field_r;
    private e field_p;
    static byte[][] field_j;
    private int field_l;
    private int field_n;
    static byte[] field_d;
    static int field_g;
    private int field_f;
    private int field_b;
    private int field_a;
    static String field_k;
    private int field_q;
    private int field_h;
    private int field_o;
    static String field_i;
    private int field_c;
    private int field_e;
    private int field_m;

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 <= 57) {
            lj.b(114);
          }
          field_i = null;
          field_j = (byte[][]) null;
          field_d = null;
          field_k = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "lj.C(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        double stackIn_7_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != vg.field_I) {
            mn.a(false);
            fe.g(1);
            stackIn_7_0 = (vg.field_I.field_e == 1) ? 0.0 : 3.141592653589793;
            sj.field_o = (float)stackIn_7_0;
            if (Virogrid.field_F) {
              sj.field_o = 3.1415927410125732f;
            }
          } else {
            sj.field_o = 3.1415927410125732f;
          }
          if (param0 < 96) {
            return;
          }
          el.a(true, (byte) -106);
          vm.field_d[0] = (double)field_r * Math.sin((double)cf.field_c);
          vm.field_d[2] = (double)field_r * Math.cos((double)cf.field_c);
          gb.c((byte) -44);
          ka.a(false, (byte) 87);
          vm.$cfr$intArgs$a$45c25716b3df(30, u.field_t);
          var1_int = sh.a(4712, 3);
          if (kn.field_B == var1_int) {
            var1_int = (1 + kn.field_B) % 3;
          }
          kn.field_B = var1_int;
          ei.a(0, oi.field_c[var1_int + 1]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) runtimeException), "lj.D(" + param0 + ')');
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        fi stackIn_4_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        gn var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          if (param1 instanceof gn) {
            stackIn_4_0 = (fi) (param1);
          } else {
            stackIn_4_0 = null;
          }
          var6 = (gn) (stackIn_4_0);
          if (var6 != null) {
            param2 = param2 & var6.field_C;
          }
          if (param4 != -23294) {
            this.a(107, (fi) null, true, -95, -123);
          }
          var7 = 5592405;
          df.b(param0 + param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, this.field_l);
          if (param2) {
            var7 = 16777215;
          }
          var8 = param0 - (-param1.field_l - this.field_f);
          var9 = this.field_a + (param3 + param1.field_u);
          df.f(var8, var9, this.field_n, this.field_o, 5592405);
          df.b(var8, var9, this.field_n, this.field_o, var7);
          if (var6.field_z) {
            df.a(var8, var9, this.field_n + var8, this.field_o + var9, 1);
            df.a(var8 + this.field_n, var9, var8, this.field_o + var9, 1);
          }
          if (null != this.field_p) {
            var10 = this.field_n + (this.field_f + this.field_e);
            this.field_p.a(param1.field_n, var10 + (param1.field_l + param0), param1.field_u + param3 + this.field_q, param1.field_g - var10 - this.field_e, -(this.field_e << 1) + param1.field_m, this.field_c, this.field_b, this.field_h, this.field_m, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_24_0 = var6_ref;
          stackIn_24_1 = new StringBuilder().append("lj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, wm param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_36_0Lifetime1;
        int stackIn_36_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = pn.a(3 * (param0 - param3), (byte) -75);
          var6 = param3 * 3;
          a.b(12);
          if (!param1) {
            return;
          }
          var7 = -10 + var5_int;
          if (param4.field_a > 0 &&
            null != param4.field_z) {
            em.b(0);
          }
          ck.field_f = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_k > var8)))) {
            var9 = param4.field_J[var8];
            var10 = param4.field_e[var8];
            var11 = param4.field_j[var8];
            stackOut_11_0 = param2;
            stackIn_46_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (var19 == 0) {
              if (stackIn_12_0) {
                var12 = en.field_Hb[var9];
                var13 = ld.field_h[var9];
                var14 = en.field_Hb[var10] - var12;
                var15 = en.field_Hb[var11] - var12;
                var16 = ld.field_h[var10] - var13;
                var17 = -var13 + ld.field_h[var11];
              }
              if (!stackIn_12_0 ||
                !(var14 * var17 - var15 * var16 >= 0)) {
                var12Lifetime1 = dn.field_a[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = dn.field_a[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = dn.field_a[var11];
                    if (-2147483648 != var14) {
                      var15 = -var6 + var12Lifetime1 + var13Lifetime1 + var14;
                      stackIn_25_0 = da.field_g.length;
                      stackIn_25_1 = -1;
                      if (0 <= var7) {
                        stackIn_26_2 = var15 >> var7;
                      } else {
                        stackIn_26_2 = var15 << -var7;
                      }
                      var16 = stackIn_25_0 + (stackIn_25_1 - stackIn_26_2);
                      var17 = da.field_g[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_36_0 = ~var16;
                          stackIn_36_1 = -1;
                          if (stackIn_36_0 > stackIn_36_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = da.field_g[var16];
                          continue;
                        }
                        stackIn_36_0Lifetime1 = var16 << 4;
                        stackIn_36_1Lifetime1 = var17;
                        var18 = stackIn_36_0Lifetime1 + stackIn_36_1Lifetime1;
                        bf.field_m[var18] = var8;
                        da.field_g[var16] = 1 + var17;
                        if (param4.field_a > 0 &&
                          param4.field_z != null) {
                          dupTemp$0 = param4.field_z[var8];
                          ph.field_o[dupTemp$0] = ph.field_o[dupTemp$0] + 1;
                        }
                        ck.field_f = ck.field_f + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_46_0 = ~param4.field_a;
          }
          if (stackIn_46_0 < -1 &&
            param4.field_z != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= ph.field_o.length)) {
              var10Lifetime1 = ph.field_o[var9Lifetime1];
              ph.field_o[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_62_0 = var5;
          stackIn_62_1 = new StringBuilder().append("lj.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(')').toString());
        }
    }

    final static void a(boolean param0, jc param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          ve.field_s = param1.c((byte) 83) << 5;
          var2_int = param1.g(11132);
          ve.field_s = ve.field_s + (var2_int >> 3);
          ng.field_X = (var2_int & 7) << 18;
          ng.field_X = ng.field_X + (param1.c((byte) -43) << 2);
          var2_intLifetime1 = param1.g(11132);
          if (!param0) {
            field_r = 0.6400812864303589f;
          }
          ng.field_X = ng.field_X + (var2_intLifetime1 >> 6);
          ug.field_b = (63 & var2_intLifetime1) << 15;
          ug.field_b = ug.field_b + (param1.g(11132) << 7);
          var2_intLifetime2 = param1.g(11132);
          lm.field_j = (var2_intLifetime2 & 1) << 16;
          ug.field_b = ug.field_b + (var2_intLifetime2 >> 1);
          lm.field_j = lm.field_j + param1.c((byte) 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("lj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    lj(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = 1;
        this.field_m = 1;
        try {
          this.field_l = param9;
          this.field_e = param1;
          this.field_p = param0;
          this.field_a = param6;
          this.field_n = param8;
          this.field_q = param2;
          this.field_f = param5;
          this.field_c = param3;
          this.field_o = param7;
          this.field_b = param4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("lj.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static int c(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -28791807) {
            lj.b(43);
          }
          stackIn_4_0 = um.field_Fb;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "lj.A(" + param0 + ')');
        }
    }

    static {
        field_k = "The game options are not all set.";
        field_i = "<%0> has dropped out.";
    }
}
