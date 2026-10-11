/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    ub field_i;
    dh field_l;
    int field_h;
    int field_g;
    int field_m;
    ub field_q;
    int field_p;
    private int field_c;
    static String[] field_e;
    int field_f;
    int field_j;
    static int field_k;
    static mh field_n;
    ub field_b;
    ub field_r;
    int field_a;
    static String field_d;
    ub field_o;
    private boolean field_s;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_n = null;
        if (param0 != -31063) {
          field_e = (String[]) null;
        }
    }

    final void a(dh param0, int param1) {
        um var17 = null;
        up var4 = null;
        jp[] var5 = null;
        fb var16 = null;
        fb var18 = null;
        int var7_int = 0;
        up var6 = null;
        up var7 = null;
        pf discarded$0 = null;
        dg discarded$1 = null;
        up var8 = null;
        jp[] var9 = null;
        jp[] var10 = null;
        jp dupTemp$2 = null;
        up var11 = null;
        up var12 = null;
        jp var13 = null;
        up var14 = null;
        up var19 = null;
        int var15 = BrickABrac.field_J ? 1 : 0;
        up var14Lifetime1;
        up var14Lifetime2;
        try {
          var17 = new um(param0, 2, 2, 2236962, 1, 1, 1, param0.field_F + param0.field_P + 2);
          var17.field_r = 16777215;
          this.field_i = (ub) ((Object) var17);
          var4 = new up();
          var17.a(-86, var4);
          var4.field_s = 15658734;
          var4.field_c = 11711154;
          this.field_l = param0;
          this.field_f = 3;
          this.field_a = 3;
          this.field_p = 5592405;
          this.field_m = -1;
          this.field_h = 3;
          this.field_c = 15658734;
          this.field_j = 15658734;
          this.field_g = 3;
          var4.b(0, 113).a(false, 15658734).a(ul.a(7829367, 10066329, (byte) 66, 8947848), -2147483648);
          var4.b(1, 110).a(ul.a(13421772, 10066329, (byte) 115, 11184810), -2147483648);
          var4.b(3, 118).a(ul.a(10066329, 7829367, (byte) 115, 8947848), param1 ^ -2134061876).b(1, (byte) -50).a(0, 1);
          var5 = new jp[9];
          var16 = new fb(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.field_G.length > var7_int; var7_int++) {
            var16.field_G[var7_int] = 1077952576;
          }
          var5[4] = (jp) ((Object) var18);
          var4.b(4, 121).a(true, false).a(var5, -2147483648);
          var4.b(5, param1 ^ 13421757).a(fj.a(0, 0, 65793, 1, 0), param1 ^ -2134061876).a(true, false).a(false, -1);
          this.field_q = (ub) ((Object) var4);
          var6 = new up(var4, true);
          var6.field_f = 0;
          var7 = new up(var4, true);
          var7.field_f = 0;
          var7.a(kc.a(8947848, false), false);
          var7.b(1, 110).a(kc.a(11184810, false), param1 + 2134061876).a(false, 2236962);
          this.field_o = (ub) ((Object) new ei(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new pf(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new dg(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new up();
          var17.a(-68, var8);
          var8.b(0, 105).a(ul.a(10066329, 7829367, (byte) 124, 15658734), -2147483648).a(false, 1118481).a(-1, (byte) -69);
          var8.b(4, 108).a(true, false).a(var5, -2147483648);
          this.field_b = (ub) ((Object) var8);
          var9 = new jp[9];
          var9[4] = new jp(2, 1);
          var10 = new jp[9];
          var10[4] = new jp(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_G = new int[]{6710886, 7829367};
          var10[4].field_G = new int[]{6710886, 7829367};
          var11 = new up();
          var12 = new up();
          var11.a(true, 0, var9);
          var12.a(true, 0, var10);
          var13 = new jp(7, 4);
          var13.field_G = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, param1, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new up(var4, true);
          var14.a(-1553, var13.e());
          var13.f();
          var14Lifetime1 = new up(var4, true);
          var14Lifetime1.a(-1553, var13.e());
          var13.f();
          var14Lifetime2 = new up(var4, true);
          var14Lifetime2.a(-1553, var13.e());
          var13.f();
          var19 = new up(var4, true);
          var19.a(-1553, var13);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "eh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte[] param0, boolean param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        byte[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        wq stackIn_30_2 = null;
        boolean stackIn_31_3;
        byte[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        wq stackIn_40_2 = null;
        boolean stackIn_41_3 = false;
        int stackIn_43_0 = 0;
        int stackIn_44_1 = 0;
        byte[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        wq stackIn_54_2 = null;
        boolean stackIn_55_3 = false;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wq var16 = null;
        wq var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          var16 = new wq(param0);
          var17 = var16;
          var17.field_l = -2 + param0.length;
          nl.field_c = var17.i(65280);
          cn.field_a = new byte[nl.field_c][];
          jh.field_b = new int[nl.field_c];
          dl.field_d = new int[nl.field_c];
          gg.field_t = new int[nl.field_c];
          tm.field_b = new boolean[nl.field_c];
          bj.field_S = new byte[nl.field_c][];
          ag.field_K = new int[nl.field_c];
          var17.field_l = -(8 * nl.field_c) + (-7 + param0.length);
          cf.field_d = var17.i(65280);
          ek.field_db = var17.i(65280);
          var3 = 1 + (var17.l(255) & 255);
          for (var4 = 0; nl.field_c > var4; var4++) {
            ag.field_K[var4] = var16.i(65280);
          }
          for (var4Lifetime1 = 0; nl.field_c > var4Lifetime1; var4Lifetime1++) {
            dl.field_d[var4Lifetime1] = var17.i(65280);
          }
          for (var4Lifetime2 = 0; nl.field_c > var4Lifetime2; var4Lifetime2++) {
            jh.field_b[var4Lifetime2] = var17.i(65280);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < nl.field_c; var4Lifetime3++) {
            gg.field_t[var4Lifetime3] = var17.i(65280);
          }
          var17.field_l = -(3 * (var3 - 1)) + (-(nl.field_c * 8) + param0.length - 7);
          qp.field_c = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            qp.field_c[var4Lifetime4] = var17.e((byte) -34);
            if (0 == qp.field_c[var4Lifetime4]) {
              qp.field_c[var4Lifetime4] = 1;
            }
          }
          if (param1) {
            field_d = (String) null;
          }
          var17.field_l = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < nl.field_c; var4Lifetime5++) {
            var5 = jh.field_b[var4Lifetime5];
            var6 = gg.field_t[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            cn.field_a[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            bj.field_S[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.l(255);
            if ((1 & var11) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.b(true);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  stackIn_54_0 = var9;
                  stackIn_54_1 = var12;
                  stackIn_54_2 = var17;
                  stackIn_55_3 = !(param1);
                  dupTemp$0 = ((wq) (Object) stackIn_54_2).b(stackIn_55_3);
                  stackIn_54_0[stackIn_54_1] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_57_0 = var10;
                  if (var13 == -1) {
                    stackIn_58_1 = 0;
                  } else {
                    stackIn_58_1 = 1;
                  }
                  var10 = stackIn_57_0 | stackIn_58_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  stackIn_30_0 = var8;
                  stackIn_30_1 = var12 + var13 * var5;
                  stackIn_30_2 = var17;
                  stackIn_31_3 = !(param1);
                  stackIn_30_0[stackIn_30_1] = ((wq) (Object) stackIn_30_2).b(stackIn_31_3);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    stackIn_40_0 = var9;
                    stackIn_40_1 = var12 + var13 * var5;
                    stackIn_40_2 = var17;
                    stackIn_41_3 = !(param1);
                    dupTemp$1 = ((wq) (Object) stackIn_40_2).b(stackIn_41_3);
                    stackIn_40_0[stackIn_40_1] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_43_0 = var10;
                    if (-1 == var14) {
                      stackIn_44_1 = 0;
                    } else {
                      stackIn_44_1 = 1;
                    }
                    var10 = stackIn_43_0 | stackIn_44_1;
                  }
                }
              }
            }
            tm.field_b[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_63_0 = var2;
          stackIn_63_1 = new StringBuilder().append("eh.J(");
          if (param0 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        pi var2 = k.field_h;
        var2.e(-13413, param1);
        if (!param0) {
          eh.a('￪', (byte) -120);
        }
        var2.a(-101, 2);
        var2.a(-103, 4);
        var2.a(-109, qf.p(248));
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = -9 % ((11 - param3) / 49);
        lb.d(param1, param2, param5, param4, param0);
    }

    private final void a(int param0, String param1, int param2, int param3) {
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
          var5_int = this.field_l.c(param1);
          var6 = this.field_l.field_B + this.field_l.field_P;
          if (param0 != 8081) {
            return;
          }
          var7 = param3;
          if (lb.field_c < 6 + var7 + var5_int) {
            var7 = -6 + (lb.field_c - var5_int);
          }
          var8 = param2 - (this.field_l.field_B - 32);
          if (6 + (var8 + var6) > lb.field_d) {
            var8 = -var6 + lb.field_d - 6;
          }
          lb.e(var7, var8, var5_int + 6, var6 + 6, this.field_c);
          lb.g(1 + var7, 1 + var8, var5_int + 4, var6 + 4, this.field_p);
          this.field_l.c(param1, var7 + 3, this.field_l.field_B + var8 + 3, this.field_c, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("eh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, String param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_s) {
            this.a(param3, 8947848, param1, param2);
          } else {
            this.a(8081, param3, param1, param2);
          }
          if (!param0) {
            this.field_j = -47;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("eh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_6_0 = false;
        if (param1 <= 27) {
          return true;
        }
        stackIn_6_0 = (param0 >= 48) && (param0 <= 57);
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 115 / ((param5 + 18) / 63);
        lb.d(param3, param0, param6, param4, param2, param1);
    }

    final static void a(boolean param0, boolean param1) {
        if (sq.field_c != null) {
          lb.b(lb.field_i, lb.field_b, lb.field_f - lb.field_i, lb.field_j - lb.field_b);
          sq.field_c.a(true, param0);
        }
        if (!param1) {
          field_k = -26;
        }
    }

    final static java.awt.Frame a(int param0, tg param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        hg[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        hg[] var10 = null;
        ql var11 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!param1.b(-122)) {
            return null;
          }
          if (0 == param4) {
            var10 = lj.a(true, param1);
            var6 = var10;
            if (var6 == null) {
              stackIn_7_0 = null;
              return (java.awt.Frame) (stackIn_7_0);
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (var10[var8].field_d == param5 &&
                var10[var8].field_c == param2 && ((param0 == 0 ||
                param0 == var10[var8].field_f) &&
                (var7_int == 0 ||
                !(var10[var8].field_h <= param4)))) {
                param4 = var10[var8].field_h;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param1.a(param0, -35, param2, param4, param5);
          while (0 == var11.field_f) {
            wj.a(-126, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_e);
          if (param3 <= 80) {
            eh.a('4', (byte) 78);
          }
          if (var7 == null) {
            return null;
          }
          if (var11.field_f != 2) {
            stackIn_40_0 = var7;
            return stackIn_40_0;
          }
          sq.a(param1, -20954, var7);
          stackIn_38_0 = null;
          return (java.awt.Frame) (stackIn_38_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_43_0 = var6_ref;
          stackIn_43_1 = new StringBuilder().append("eh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
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
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = this.field_h + this.field_f;
          var6 = this.field_a + this.field_g;
          var7 = this.field_m;
          if (param1 != 8947848) {
            field_d = (String) null;
          }
          if (var7 == -1) {
            var7 = this.field_l.field_F + this.field_l.field_P;
          }
          var8 = lb.field_c >> 2;
          var9 = this.field_l.c(param0);
          var10 = this.field_l.field_P + this.field_l.field_F;
          var11 = 1;
          if (var9 > var8 ||
            param0.indexOf("<br>") != -1) {
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + var9 % var8 + var13) / var13) + var8;
            }
            if (null == an.field_j) {
              an.field_j = new String[16];
            }
            var11Lifetime1 = this.field_l.a(param0, new int[]{var12}, an.field_j);
            var9 = 0;
            var10 = var10 + (-1 + var11Lifetime1) * var7;
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_l.c(an.field_j[var13Lifetime2]);
              if (var14 > var9) {
                var9 = var14;
              }
            }
          }
          var12 = param3;
          if (var12 + var9 + var5_int > lb.field_c) {
            var12 = lb.field_c - var9 - var5_int;
          }
          var13Lifetime1 = -this.field_l.field_B + (param2 + 32);
          if (var13Lifetime1 + var10 + var6 > lb.field_d) {
            var13Lifetime1 = -var6 - var10 + param2;
          }
          lb.e(var12, var13Lifetime1, var5_int + var9, var10 + var6, this.field_j);
          lb.g(var12 + 1, 1 + var13Lifetime1, var5_int + (var9 - 2), var10 + (var6 - 2), this.field_p);
          this.field_l.a(param0, this.field_h + var12, var13Lifetime1 + this.field_g, var9, var10, this.field_c, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("eh.L(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public eh() {
        this.field_s = true;
    }

    static {
        field_d = "Multiball: spilts your ball into eight other balls.";
    }
}
