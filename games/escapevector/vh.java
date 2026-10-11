/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends hg {
    static int field_i;
    int field_j;
    int field_n;
    int field_m;
    boolean field_h;
    int field_k;
    int field_g;
    int field_l;

    final static om[] e(int param0) {
        RuntimeException var1 = null;
        om[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -90) {
            field_i = -121;
          }
          stackIn_4_0 = new om[]{co.field_b, qi.field_P, eb.field_L, pl.field_m, ci.field_d, pj.field_k, sj.field_l, ea.field_g, ki.field_H, bf.field_L, le.field_a, an.field_c, mg.field_g, wa.field_d};
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "vh.A(" + param0 + ')');
        }
    }

    final static String a(String param0, mf param1, String param2, int param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.b(0)) {
            stackIn_2_0 = (String) (param0);
            return stackIn_2_0;
          }
          if (param3 == -12920) {
            stackIn_7_0 = param2 + " - " + param1.a(-125) + "%";
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("vh.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        try {
          if (param1) {
            return;
          }
          var4_int = ma.field_a.field_n;
          var5 = (this.field_l >> 16) - param2;
          if (var5 >= -1 &&
            481 > var5) {
            var6 = -param0 + (this.field_j >> 16);
            do {
              if (var6 < -1) {
                var6 = var6 + var4_int;
                break;
              }
              var6 = var6 - var4_int;
            } while (var11 == 0);
            while (true) {
              if (var6 >= 641) {
                return;
              }
              if (var11 != 0) {
                return;
              }
              if (this.field_k == 1) {
                var9 = 4198404;
                var8 = 8413216;
                var7 = 16769152;
              } else {
                var7 = 8446207;
                var9 = 266304;
                var8 = 2121856;
              }
              var10 = this.field_m << 2;
              if (var10 < 256) {
                var8 = (-16711936 & (var8 & 16711935) * var10 | (var8 & 65280) * var10 & 16711680) >>> 8;
                var7 = (-16711936 & var10 * (16711935 & var7) | 16711680 & (65280 & var7) * var10) >>> 8;
                var9 = (-16711936 & var10 * (var9 & 16711935) | 16711680 & var10 * (65280 & var9)) >>> 8;
              }
              em.a(var6, var5, var7);
              em.a(-1 + var6, var5, var8);
              em.a(var6 + 1, var5, var8);
              em.a(var6, -1 + var5, var8);
              em.a(var6, var5 + 1, var8);
              em.a(-1 + var6, -1 + var5, var9);
              em.a(var6 + 1, -1 + var5, var9);
              em.a(var6 - 1, 1 + var5, var9);
              em.a(1 + var6, 1 + var5, var9);
              var6 = var6 + var4_int;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var4), "vh.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int f(int param0) {
        RuntimeException var1 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 87) {
            vh.a((byte) 46);
          }
          if (aj.b(-90)) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          if (!bj.e((byte) 104)) {
            stackIn_12_0 = 1;
            return stackIn_12_0;
          }
          stackIn_10_0 = 2;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "vh.E(" + param0 + ')');
        }
    }

    final static void a(ia param0, int param1, int param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
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
        int stackIn_43_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = EscapeVector.field_A;
        try {
          var5_int = nm.a(3 * (-param1 + param2), (byte) 78);
          if (param4 != 4198) {
            field_i = 9;
          }
          var6 = 3 * param1;
          var7 = -10 + var5_int;
          g.h(-115);
          if (param0.field_I > 0 &&
            null != param0.field_n) {
            cj.a((byte) -99);
          }
          aj.field_d = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param0.field_D)))) {
            var9 = param0.field_e[var8];
            var10 = param0.field_o[var8];
            var11 = param0.field_f[var8];
            stackOut_13_0 = param3;
            stackIn_52_0 = stackOut_13_0 ? 1 : 0;
            stackIn_14_0 = stackOut_13_0;
            if (var19 == 0) {
              if (stackIn_14_0) {
                var12 = on.field_g[var9];
                var13 = ni.field_D[var9];
                var14 = on.field_g[var10] - var12;
                var15 = on.field_g[var11] - var12;
                var16 = -var13 + ni.field_D[var10];
                var17 = ni.field_D[var11] - var13;
              }
              if (!stackIn_14_0 ||
                !(0 <= var14 * var17 - var16 * var15)) {
                var12Lifetime1 = km.field_j[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = km.field_j[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = km.field_j[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + var14 + (var12Lifetime1 + var13Lifetime1);
                      if (var7 >= 0) {
                        stackIn_32_0 = var15 >> var7;
                      } else {
                        stackIn_32_0 = var15 << -var7;
                      }
                      var16 = -stackIn_32_0 + (al.field_f.length - 1);
                      var17 = al.field_f[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_43_0 = var16;
                          if (stackIn_43_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = al.field_f[var16];
                          continue;
                        }
                        stackIn_43_0Lifetime1 = var17 + (var16 << 4);
                        var18 = stackIn_43_0Lifetime1;
                        bc.field_f[var18] = var8;
                        al.field_f[var16] = 1 + var17;
                        if (param0.field_I > 0 &&
                          param0.field_n != null) {
                          dupTemp$0 = param0.field_n[var8];
                          ul.field_I[dupTemp$0] = ul.field_I[dupTemp$0] + 1;
                        }
                        aj.field_d = aj.field_d + 1;
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
            stackIn_52_0 = ~param0.field_I;
          }
          if (stackIn_52_0 < -1 &&
            null != param0.field_n) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(ul.field_I.length <= var9Lifetime1)) {
              var10Lifetime1 = ul.field_I[var9Lifetime1];
              ul.field_I[var9Lifetime1] = var8Lifetime1;
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
          stackIn_68_0 = var5;
          stackIn_68_1 = new StringBuilder().append("vh.D(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -22) {
            vh.a((String) null, (mf) null, (String) null, -6);
          }
          if (mg.field_e.a(-107)) {
            return;
          }
          mg.field_e.c(param0 - 20223);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "vh.C(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        try {
          this.field_k = param5;
          this.field_g = param3;
          this.field_l = param6;
          this.field_j = param0;
          this.field_m = param7;
          this.field_h = param1;
          this.field_n = param2;
          if (param4 >= -118) {
            vh.f(-128);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void d(int param0) {
        try {
          int var2_int = 54 / ((param0 - 40) / 51);
          this.a(0, true, 0, 0, (byte) -125, 0, 0, 0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vh.H(" + param0 + ')');
        }
    }

    vh(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          this.a(param0, false, param2, param3, (byte) -122, param4, param1, param5);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
