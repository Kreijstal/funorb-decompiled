/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String[] field_h;
    boolean field_l;
    private hk[] field_d;
    th field_q;
    private int[] field_i;
    private int[] field_j;
    private int[] field_k;
    private c[][] field_s;
    private int[] field_g;
    static of[] field_r;
    private th field_n;
    static byte[] field_v;
    private boolean field_t;
    private th field_e;
    int[] field_p;
    fh field_b;
    private boolean field_o;
    kb field_m;
    static String field_c;
    private th field_f;
    static ja[] field_a;
    th field_u;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        hk var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        qj var9 = null;
        try {
          if (param1 != -11513) {
            return;
          }
          var6 = this.field_d[param2];
          if (param3 >= 0 &&
            var6.field_d.length > param3 &&
            255 != var6.field_d[param3]) {
            if (var6.field_b[param3] > this.field_m.field_H) {
              if (1000 + this.field_m.field_H < var6.field_b[param3]) {
                this.a((byte) -118, "powerup not ready", this.field_m.field_H + ": " + param2 + " tried to use a powerup slot that's not ready yet: " + param3 + " is due " + var6.field_b[param3]);
              }
              return;
            }
            var7 = var6.field_d[param3];
            var8 = var6.field_f[param3];
            var9 = new qj(this.field_m.field_H + 50, param2, var7, var8, param4, param0);
            this.field_e.a(var9, false);
            this.a(-7737, rm.a(this.field_m.field_H, param4, param0, var7, var8, param2, param1 ^ -13113, param4));
            var6.field_b[param3] = this.field_m.field_H + this.field_m.a(var8, var7, param2, false);
            return;
          }
          this.a((byte) 95, "invalid powerup slot", param2 + " tried to use invalid powerup slot: " + param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "rl.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (nb.field_a != null) {
            nb.field_a.g((byte) 118);
          }
          if (param0 >= -125) {
            return;
          }
          if (null != pj.field_I) {
            pj.field_I.l(124);
          }
          qe.d(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rl.N(" + param0 + ')');
        }
    }

    final void a(int param0, ge param1, int param2, lm param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        ge var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.e((byte) -112);
          var6 = param3.g(param2 + 1829980022);
          var7 = new ge(var5_int, var6, param3.k((byte) 121));
          if (param2 != -32422) {
            return;
          }
          var7.field_A = this;
          var7.field_x = this.field_m.a(param2 - 16744794);
          var7.field_gb = param0;
          this.field_m.field_d[var7.field_gb] = this.field_m.field_d[var7.field_gb] + param3.o(-116);
          this.field_u.a(var7, false);
          this.a(param3, var7, param1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("rl.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void b(int param0) {
        this.d(-32724);
        if (param0 != -198) {
          return;
        }
        try {
          this.a(120);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "rl.G(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_a = null;
          field_c = null;
          field_h = null;
          field_r = null;
          if (param0 < 59) {
            field_c = (String) null;
          }
          field_v = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rl.S(" + param0 + ')');
        }
    }

    private final void a(int param0, ge param1) {
        RuntimeException runtimeException = null;
        pc var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            this.field_j = (int[]) null;
          }
          param1.field_eb = false;
          if (param1.field_Z) {
            return;
          }
          var3 = aq.a(this.field_m.field_H, false, param1.field_tb.field_x, param1.field_x);
          this.a(param0 - 7735, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("rl.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, ek param1) {
        c var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1.c((byte) -70);
          if (param0 >= -21) {
            rl.a((byte) 90);
          }
          var3 = this.a(true, param1.field_C, param1.field_B);
          if (null != var3) {
            var3.a(param1, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rl.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final c a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        c stackIn_2_0 = null;
        Object stackIn_14_0 = null;
        c stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = (c) null;
            return stackIn_2_0;
          }
          if (this.field_s[0].length >= param1 &&
            param2 <= this.field_s.length &&
            param2 >= 0 &&
            0 <= param1) {
            if (null == this.field_s[param2][param1]) {
              this.field_s[param2][param1] = new c();
            }
            stackIn_20_0 = this.field_s[param2][param1];
            return stackIn_20_0;
          }
          stackIn_14_0 = null;
          return (c) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "rl.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        ge var3 = null;
        pa var4 = null;
        RuntimeException decompiledCaughtException = null;
        lm var5 = null;
        try {
          var4 = this.a((byte) -125, param1);
          if (var4 == null) {
            return;
          }
          var4.b(false);
          if (param0 != 4) {
            return;
          }
          if (var4 instanceof ge) {
            var3 = (ge) (var4);
            var3.f(true);
            var3.t(4);
            var3.r((byte) -111);
            if (var3.field_Q != 29) {
              return;
            }
            var3.a(4, (byte) -89);
            if (!ZombieDawnMulti.field_E) {
              return;
            }
          }
          if (var4 instanceof lm) {
            var5 = (lm) (var4);
            var5.n((byte) -100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "rl.U(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, ge param1, boolean param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 65) {
            this.field_l = false;
          }
          this.field_n.a(new nk(param1, param1.e((byte) -112), param1.g(1829947600), param2), false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("rl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, pa param1) {
        so var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1.field_S = false;
          if (param1.field_Z) {
            return;
          }
          if (param0 != -2) {
            this.field_s = (c[][]) null;
          }
          var3 = ng.a(param1.field_N, param0 ^ -101, param1.field_Q, param1.field_x, param1.field_G, this.field_m.field_H, param1.field_E, param1.field_db, param1.field_ab);
          this.a(-7737, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rl.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final pa a(byte param0, int param1) {
        ek var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        pa stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.c(param1, -117);
          if (null == var3) {
            stackIn_2_0 = null;
            return (pa) (stackIn_2_0);
          }
          if (!(var3 instanceof pa)) {
            throw new IllegalArgumentException("oid " + param1 + " is not a character");
          }
          if (param0 > -119) {
            field_v = (byte[]) null;
          }
          stackIn_10_0 = (pa) (var3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "rl.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        kb stackIn_87_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_91_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ge var3_ref_ge = null;
        int[] var3_ref_int__ = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ge var3_ref_geLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var3Lifetime2;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 <= 100) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = this.field_m.field_l;
          if (var3 == 0) {
            if (this.field_m.field_H < 400 &&
              this.field_m.field_t != 1) {
              return;
            }
            this.a(false, 1);
            if (var7 == 0) {
              return;
            }
          } else {
            if ((var3 != 1) &&
              (decompiledFrameRemainder0 = (var3 != 2))) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (df.field_I) {
              if (this.field_m.field_m[0] != 0) {
                return;
              }
              if (!pp.field_n) {
                return;
              }
              if (11 == hg.field_rb) {
                return;
              }
              var3_ref_ge = new ge(hc.field_c, gk.field_c, 0);
              var3_ref_ge.a(-9019, this);
              var3_ref_ge.field_gb = 0;
              var3_ref_ge.field_x = this.field_m.a(-16777216);
              this.field_m.field_K.a(-25612, var3_ref_ge);
              var3_ref_ge.field_S = true;
              op.field_m.field_f = var3_ref_ge.field_x;
              var3_ref_geLifetime1 = new ge(hc.field_c, -30 + gk.field_c, 1);
              var3_ref_geLifetime1.a(-9019, this);
              var3_ref_geLifetime1.field_gb = 0;
              var3_ref_geLifetime1.field_x = this.field_m.a(-16777216);
              this.field_m.field_K.a(-25612, var3_ref_geLifetime1);
              var3_ref_geLifetime1.field_S = true;
              return;
            }
            if (this.field_m.field_H % 32 != 0) {
              return;
            }
            var3Lifetime2 = this.field_m.field_t;
            var4_ref_int__ = this.field_m.field_m;
            var5 = 0;
            while (true) {
              if (var5 < var4_ref_int__.length) {
                var6 = var4_ref_int__[var5];
                stackIn_44_0 = 0;
                stackIn_44_1 = var6;
                if (var7 == 0) {
                  if (stackIn_44_0 == stackIn_44_1) {
                    var3Lifetime2--;
                  }
                  var5++;
                  continue;
                }
              } else {
                stackIn_44_0 = -1;
                stackIn_44_1 = ~var3Lifetime2;
              }
              break;
            }
            if ((stackIn_44_0 == stackIn_44_1 ||
              !(4500 >= this.field_m.field_H)) &&
              (!((this.field_m.field_I / 8) < this.field_m.field_g) ||
              !(this.field_m.field_H < (this.field_m.field_C - 3000)) ||
              1 >= var3Lifetime2)) {
              this.a(false, 2);
            }
            if (var7 == 0) {
              return;
            }
          }
          var2_int = this.field_m.field_t;
          var3_ref_int__ = this.field_m.field_m;
          var4 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var4 >= var3_ref_int__.length))) {
            var5Lifetime1 = var3_ref_int__[var4];
            stackIn_70_0 = ~var5Lifetime1;
            stackIn_70_1 = -1;
            if (var7 == 0) {
              if (stackIn_70_0 == stackIn_70_1) {
                var2_int--;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_70_0 = ~var2_int;
            stackIn_70_1 = -1;
          }
          if (stackIn_70_0 != stackIn_70_1 &&
            this.field_m.field_C > this.field_m.field_H) {
            return;
          }
          var3Lifetime1 = 0;
          var4Lifetime1 = 0;
          var5Lifetime2 = 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var5Lifetime2 < this.field_m.field_d.length)))) {
            stackIn_87_0 = this.field_m;
            if (var7 == 0) {
              if (stackIn_87_0.field_d[var5Lifetime2] == this.field_m.field_d[var3Lifetime1]) {
                var4Lifetime1 = 1;
              } else {
                if (this.field_m.field_d[var5Lifetime2] > this.field_m.field_d[var3Lifetime1]) {
                  var3Lifetime1 = var5Lifetime2;
                  var4Lifetime1 = 0;
                }
              }
              var5Lifetime2++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_87_0 = this.field_m;
          }
          stackIn_90_1 = -110;
          if (var4Lifetime1 == 0) {
            stackIn_91_2 = var3Lifetime1;
          } else {
            stackIn_91_2 = -1;
          }
          ((kb) (Object) stackIn_87_0).a((byte) stackIn_90_1, stackIn_91_2);
          this.a(false, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rl.B(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        md var4_ref_md = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        md var17 = null;
        int var18 = 0;
        int var19 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException decompiledCaughtException = null;
        double var10Lifetime1;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          ak.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = vn.field_c.length;
          if (param0 < 101) {
            field_h = (String[]) null;
          }
          var2 = new int[var1_int];
          var3 = 0;
          do {
            if (var3 >= var1_int) {
              var3 = ak.field_a[9] >> 8;
              break;
            }
            var4_ref_md = vn.field_c[var3];
            var4_ref_md.a((byte) -81);
            c.a(var3, (byte) 75);
            var5 = var4_ref_md.field_D + var4_ref_md.field_C >> 1;
            var6 = var4_ref_md.field_G + var4_ref_md.field_l >> 1;
            var7 = var4_ref_md.field_j + var4_ref_md.field_r >> 1;
            var8 = ak.field_a[9] >> 2;
            var9 = ak.field_a[10] >> 2;
            var10_int = ak.field_a[11] >> 2;
            var11 = hl.field_c[4] * var9 + var8 * hl.field_c[3] + var10_int * hl.field_c[5] >> 14;
            var12 = var9 * hl.field_c[7] + hl.field_c[6] * var8 + hl.field_c[8] * var10_int >> 14;
            var13 = var10_int * hl.field_c[11] + hl.field_c[10] * var9 + hl.field_c[9] * var8 >> 14;
            var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> 16;
            var3++;
          } while (var19 == 0);
          var4 = ak.field_a[10] >> 8;
          var5 = ak.field_a[11] >> 8;
          var6 = f.field_a << 4;
          var7 = 0;
          var8 = on.a(var6, -18924) >> 8;
          var9 = wn.a(-126, var6) >> 8;
          if (bd.field_g != -1 &&
            bo.field_d != -1) {
            var9 = -128;
            var7 = bd.field_g - 320;
            var8 = -bo.field_d + 240;
          }
          var10 = 256.0 / Math.sqrt((double)(var7 * var7 + (var8 * var8 + var9 * var9)));
          var8 = (int)((double)var8 * var10);
          var9 = (int)((double)var9 * var10);
          var7 = (int)((double)var7 * var10);
          var12 = -var3 + var7;
          var13 = var8 - var4;
          var14 = -var5 + var9;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12 * var12 + var13 * var13)));
          var12 = (int)((double)var12 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var13 = (int)((double)var13 * var10Lifetime1);
          var15 = 0;
          L5: while (true) {
            stackIn_20_0 = var15;
            stackIn_20_1 = vn.field_c.length;
            if (stackIn_20_0 < stackIn_20_1) {
              var16 = 0;
              if (var19 != 0) {
                return;
              }
              var17_int = 1;
              while (var17_int < vn.field_c.length) {
                stackIn_20_0 = ~var2[var16];
                stackIn_20_1 = ~var2[var17_int];
                if (stackIn_20_0 > stackIn_20_1) {
                  var16 = var17_int;
                }
                var17_int++;
              }
              var2[var16] = -2147483648;
              var17 = vn.field_c[var16];
              c.a(var16, (byte) 106);
              var18 = 0;
              while (var18 < 3) {
                hl.field_c[var18] = hl.field_c[var18] + lk.field_G[var15][var18];
                var18++;
              }
              sa.a(var17, ak.field_a, true, hl.field_c, (byte) -121, false, false);
              gh.a(var17, var7, (byte) 116, var12, var14, var9, var13, var8);
              var15++;
              continue L5;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "rl.T(" + param0 + ')');
        }
    }

    private final void a(int param0, ae param1) {
        ae var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_q.f(param0 + 35850)) {
            this.field_q.a(param0 ^ 31283, param1);
            return;
          }
          var3 = (ae) (this.field_q.a((byte) 76));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
            stackIn_15_0 = ~param1.field_f;
            stackIn_15_1 = ~var3.field_f;
            if (var4 == 0) {
              if (stackIn_15_0 <= stackIn_15_1) {
                qc.a(param1, var3, 0);
                return;
              }
              var3 = (ae) (this.field_q.c((byte) 123));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_q.a(-25612, param1);
            stackIn_15_0 = param0;
            stackIn_15_1 = -7737;
          }
          if (stackIn_15_0 != stackIn_15_1) {
            this.field_d = (hk[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("rl.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1, fc param2) {
        boolean stackIn_4_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        boolean stackIn_52_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        th var4 = null;
        RuntimeException var4_ref = null;
        ek var5_ref_ek = null;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        ek var8_ref_ek = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        int var13 = 0;
        int var14 = 0;
        Object var6Lifetime1;
        Object var10Lifetime1;
        int stackIn_36_0Lifetime1;
        int stackIn_36_1Lifetime1;
        int stackIn_64_0Lifetime1;
        int stackIn_64_1Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_b = new fh(param2);
          this.field_s = new c[(this.field_b.field_c >> 7) + 1][1 + (this.field_b.field_r >> 7)];
          this.field_m.field_H = 0;
          ip.b((byte) 97);
          this.field_n = new th();
          this.field_f = new th();
          this.field_e = new th();
          var4 = param2.a(91);
          var5_ref_ek = (ek) (var4.c(78));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var5_ref_ek == null))) {
            stackOut_3_0 = var5_ref_ek instanceof sh;
            stackIn_13_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var14 == 0) {
              if (stackIn_4_0) {
                var6 = (sh) (var5_ref_ek);
                if (((sh) (var6)).field_O < this.field_m.field_t) {
                  ((sh) (var6)).a(-9019, this);
                  ((sh) (var6)).field_O = this.field_m.field_y[((sh) (var6)).field_O];
                  this.field_f.a(var5_ref_ek, false);
                }
              }
              var5_ref_ek = (ek) (var4.b(6));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            this.field_m.field_I = 0;
            stackIn_13_0 = 2 * this.field_m.field_t;
          }
          var5 = stackIn_13_0;
          var6Lifetime1 = null;
          var7 = null;
          if (param0) {
            var7 = new ek[var5];
            var6Lifetime1 = new int[var5];
          }
          if (param1 != -6) {
            return;
          }
          var8_ref_ek = (ek) (this.field_u.c(123));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var8_ref_ek))) {
            stackIn_52_0 = var8_ref_ek instanceof lm;
            if (var14 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_52_0) {
                this.field_m.field_I = this.field_m.field_I + 1;
                if ((param0)) {
                  var9 = 2147483647;
                  var10 = (sh) (this.field_f.c(73));
                  while (var10 != null) {
                    var11 = ((sh) (var10)).e((byte) -112) - var8_ref_ek.e((byte) -112);
                    var12_int = ((sh) (var10)).g(1829947600) - var8_ref_ek.g(1829947600);
                    var13 = var11 * var11 + var12_int * var12_int;
                    stackIn_36_0 = var13;
                    stackIn_36_1 = var9;
                    if (stackIn_36_0 < stackIn_36_1) {
                      var9 = var13;
                    }
                    var10 = (sh) (this.field_f.b(6));
                  }
                  var10Lifetime1 = var8_ref_ek;
                  var11Lifetime1 = 0;
                  while (true) {
                    stackIn_36_0Lifetime1 = var11Lifetime1;
                    stackIn_36_1Lifetime1 = java.lang.reflect.Array.getLength(var6Lifetime1);
                    if (stackIn_36_0Lifetime1 >= stackIn_36_1Lifetime1) {
                      break;
                    }
                    stackIn_64_0 = ~var9;
                    stackIn_64_1 = ~((int[]) (var6Lifetime1))[var11Lifetime1];
                    if (stackIn_64_0 < stackIn_64_1) {
                      var12 = ((Object[]) (var7))[var11Lifetime1];
                      var13Lifetime1 = ((int[]) (var6Lifetime1))[var11Lifetime1];
                      ((int[]) (var6Lifetime1))[var11Lifetime1] = var9;
                      var9 = var13Lifetime1;
                      ((Object[]) (var7))[var11Lifetime1] = var10Lifetime1;
                      var10Lifetime1 = var12;
                    }
                    var11Lifetime1++;
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (!(var8_ref_ek instanceof ge)) {
                }
              }
              var8_ref_ek = (ek) (this.field_u.b(6));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_52_0 = param0;
          }
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_52_0) {
            var8 = 0;
            while (!(java.lang.reflect.Array.getLength(var7) <= var8)) {
              if (var14 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (null != ((Object[]) (var7))[var8]) {
                ((lm) (((Object[]) (var7))[var8])).p(95);
              }
              var8++;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_m.field_g = this.field_m.field_I;
            this.field_m.field_C = 9000 + 250 * this.field_m.field_I;
          }
          stackIn_64_0Lifetime1 = ~this.field_m.field_t;
          stackIn_64_1Lifetime1 = -2;
          if (stackIn_64_0Lifetime1 == stackIn_64_1Lifetime1) {
            this.field_m.field_C = 64512;
          }
          if (64512 < this.field_m.field_C) {
            this.field_m.field_C = 64512;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_74_0 = var4_ref;
          stackIn_74_1 = new StringBuilder().append("rl.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    private final lm a(int param0, int param1) {
        ek var3 = null;
        RuntimeException var3_ref = null;
        lm stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.c(param1, param0 - 417600939);
          if (param0 != 417600865) {
            this.a(-39, (pa) null);
          }
          if (null == var3) {
            throw new IllegalArgumentException("oid " + param1 + " invalid");
          }
          if (!(var3 instanceof lm)) {
            throw new IllegalArgumentException("oid " + param1 + " is not a human");
          }
          stackIn_12_0 = (lm) (var3);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "rl.DA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, byte param3) {
        try {
          this.field_n.a(new nk(this, param2, param0, param1), false);
          if (param3 >= -44) {
            this.a((byte) -68, (ge) null);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "rl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        boolean discarded$1 = false;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_m.field_l = param1;
          if (param0) {
            discarded$1 = this.b(-90, 117, 86, 71, -86, 91);
          }
          var3_int = this.field_m.field_l;
          if (var3_int == 2) {
            this.field_m.field_C = this.field_m.field_H + 3000;
          }
          this.a(-7737, new fq(this.field_m.field_H, this.field_m.field_l, this.field_m.field_C));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rl.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final ek c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ek var4 = null;
        int var5 = 0;
        ek stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = 101 / ((31 - param1) / 58);
          var4 = (ek) (this.field_u.c(101));
          while (null != var4) {
            if (var4.field_x == param0) {
              stackIn_7_0 = var4;
              return stackIn_7_0;
            }
            var4 = (ek) (this.field_u.b(6));
            if (var5 == 0) {
              continue;
            }
            break;
          }
          stackIn_10_0 = null;
          return (ek) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rl.LA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, String param1, String param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 46 / ((param0 + 53) / 59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("rl.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte param0, ge param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_Z) {
            return;
          }
          this.a(-7737, new aj(this.field_m.field_H, param1.field_x));
          param1.field_eb = false;
          var3_int = -89 / ((param0 + 48) / 48);
          param1.field_S = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("rl.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final ek a(int param0, boolean param1) {
        ek var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ek stackIn_3_0 = null;
        ek stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3 = (ek) (this.field_m.field_u.c(104));
          if (!param1) {
            stackIn_3_0 = (ek) null;
            return stackIn_3_0;
          }
          while (null != var3) {
            if (param0 == var3.field_x) {
              stackIn_9_0 = var3;
              return stackIn_9_0;
            }
            var3 = (ek) (this.field_m.field_u.b(6));
            if (var4 == 0) {
              continue;
            }
            break;
          }
          stackIn_12_0 = null;
          return (ek) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "rl.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        ge stackIn_173_0 = null;
        int stackIn_174_1 = 0;
        ge stackIn_220_0 = null;
        boolean stackIn_221_1 = false;
        int stackIn_228_1 = 0;
        boolean stackIn_229_2 = false;
        ge stackIn_244_0 = null;
        boolean stackIn_245_1 = false;
        ge stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        boolean stackIn_266_2 = false;
        boolean stackIn_286_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        ge var8 = null;
        pa var9 = null;
        lm var10 = null;
        int var11 = 0;
        int var12_int = 0;
        ek var12 = null;
        int var13 = 0;
        og var13_ref_og = null;
        int var14 = 0;
        ge var8Lifetime1;
        ge var8Lifetime2;
        ge var8Lifetime3;
        ge var8Lifetime4;
        ge var8Lifetime4Lifetime1;
        ge var8Lifetime4Lifetime2;
        ge var8Lifetime4Lifetime3;
        ge var8Lifetime4Lifetime4;
        ge var8Lifetime4Lifetime5;
        int var11Lifetime1;
        int var12_intLifetime1;
        int var13Lifetime1;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var7_int = param2;
          if (this.field_o) {
            System.out.println(this.field_m.field_H + ": executing powerup " + param1 + " with modifier " + param0);
          }
          if (this.field_m.b((byte) -105, 45, param5) &&
            param1 != 17) {
            return false;
          }
          if (param1 == 16 ||
            7 == param1 ||
            param1 == 4 ||
            3 == param1 ||
            param1 == 14 ||
            param1 == 8 ||
            param1 == 1 ||
            param1 == 2 ||
            5 == param1 ||
            param1 == 0 ||
            param1 == 18 ||
            param1 == 6) {
            var8 = this.b((byte) 87, var7_int);
            var12_int = 0;
            if (null != var8) {
              var13 = var8.field_gb;
              var12_intLifetime1 = this.field_m.b(0, var13) ? 1 : 0;
              if (var12_intLifetime1 != 0 && (param1 == 12 ||
                11 == param1 ||
                param1 == 17)) {
                var12_intLifetime1 = 0;
              }
              if (var12_intLifetime1 != 0) {
                this.a((byte) 23, var8);
                return false;
              }
            }
          }
          var12 = this.c(var7_int, -69);
          if (null != var12 &&
            var12 instanceof og) {
            var13_ref_og = (og) (var12);
            if (~var13_ref_og.field_O != ~param5) {
              this.field_k[var13_ref_og.field_O] = cr.b(this.field_k[var13_ref_og.field_O], 1);
            }
            return false;
          }
          var13Lifetime1 = param1;
          if (3 == var13Lifetime1 &&
            var14 == 0) {
            var8Lifetime1 = this.b((byte) 32, var7_int);
            if (var8Lifetime1 == null) {
              return false;
            }
            if (~var8Lifetime1.field_gb != ~param5) {
              return false;
            }
            stackIn_173_0 = var8Lifetime1;
            if (38 == param0) {
              stackIn_174_1 = 24;
            } else {
              stackIn_174_1 = 19;
            }
            ((ge) (Object) stackIn_173_0).a(stackIn_174_1, (byte) -89);
            var8Lifetime1.field_S = true;
            return true;
          }
          if (var13Lifetime1 == 7) {
            var9 = this.a((byte) -120, var7_int);
            if (var9 == null) {
              return false;
            }
            if (!(var9 instanceof lm) ||
              var9.field_Z) {
              if ((var9 instanceof ge) &&
                (param0 == 37)) {
                var8Lifetime2 = (ge) (var9);
                if (this.field_o) {
                  System.out.println("cursing, owner " + var8Lifetime2.field_gb + ", prev 0 " + var8Lifetime2.d((byte) 61, 0) + " 1 " + var8Lifetime2.d((byte) 61, 1));
                }
                if (var8Lifetime2.field_gb != param5 &&
                  var8Lifetime2.d((byte) 61, param5)) {
                  this.field_k[param5] = cr.b(this.field_k[param5], 2);
                }
                var8Lifetime2.e(93, param5);
                if (var14 != 0) {
                  var10 = this.a(417600865, var7_int);
                  if (var10.field_Q != 20 &&
                    18 != var10.field_Q) {
                    this.a(param5, (ge) null, -32422, var10);
                    var10.j(18);
                  }
                }
              }
            } else {
              var10 = this.a(417600865, var7_int);
              if (var10.field_Q != 20 &&
                18 != var10.field_Q) {
                this.a(param5, (ge) null, -32422, var10);
                var10.j(18);
              }
            }
            return true;
          }
          if (var13Lifetime1 == 4) {
            var8Lifetime3 = this.b((byte) 124, var7_int);
            if (null == var8Lifetime3) {
              return false;
            }
            stackIn_220_0 = var8Lifetime3;
            stackIn_221_1 = (param0 == 34);
            ((ge) (Object) stackIn_220_0).a(stackIn_221_1, (byte) 100);
            return true;
          }
          if ((var13Lifetime1 != 10 ||
            var14 != 0) &&
            (var13Lifetime1 != 9 ||
            var14 != 0)) {
            if (var13Lifetime1 == 13) {
              stackIn_228_1 = param4;
              stackIn_229_2 = (param0 == 36);
              this.a(stackIn_228_1, stackIn_229_2, param2, (byte) -52);
              return true;
            }
            if (var13Lifetime1 == 1) {
              var8Lifetime4 = this.b((byte) 25, var7_int);
              if (var8Lifetime4 == null) {
                return false;
              }
              var8Lifetime4.l((byte) -52);
              return true;
            }
            if (var13Lifetime1 == 2 &&
              var14 == 0) {
              var8Lifetime4Lifetime1 = this.b((byte) 32, var7_int);
              if (null == var8Lifetime4Lifetime1) {
                return false;
              }
              stackIn_244_0 = var8Lifetime4Lifetime1;
              stackIn_245_1 = (param0 == 38);
              ((ge) (Object) stackIn_244_0).b(stackIn_245_1, (byte) -127);
              return true;
            }
            if (var13Lifetime1 == 16) {
              var8Lifetime4Lifetime2 = this.b((byte) 100, var7_int);
              if (var8Lifetime4Lifetime2 == null) {
                return false;
              }
              var8Lifetime4Lifetime2.m(-6556);
              return true;
            }
            if (var13Lifetime1 == 14 &&
              var14 == 0) {
              var8Lifetime4Lifetime3 = this.b((byte) 86, var7_int);
              if (var8Lifetime4Lifetime3 == null) {
                return false;
              }
              var8Lifetime4Lifetime3.l(34);
              return true;
            }
            if (5 == var13Lifetime1 &&
              var14 == 0) {
              var8Lifetime4Lifetime4 = this.b((byte) 68, var7_int);
              if (var8Lifetime4Lifetime4 == null) {
                return false;
              }
              stackIn_265_0 = var8Lifetime4Lifetime4;
              stackIn_265_1 = 47;
              stackIn_266_2 = (param0 == 35);
              ((ge) (Object) stackIn_265_0).a(stackIn_265_1, stackIn_266_2);
              return true;
            }
            if (var13Lifetime1 == 0 &&
              var14 == 0) {
              var9 = this.a((byte) -121, var7_int);
              if (var9 == null) {
                return false;
              }
              var9.c((byte) -68, param5);
              return true;
            }
            if (18 == var13Lifetime1 &&
              var14 == 0) {
              var8Lifetime4Lifetime5 = this.b((byte) 40, var7_int);
              if (null == var8Lifetime4Lifetime5) {
                return false;
              }
              var8Lifetime4Lifetime5.e(false);
              return true;
            }
            if (15 == var13Lifetime1 &&
              var14 == 0) {
              stackIn_286_1 = (param0 == 32);
              this.a(stackIn_286_1, (byte) -108, param5, param2, param4);
              return true;
            }
            if (8 == var13Lifetime1) {
              var9 = this.a((byte) -125, var7_int);
              if (null == var9) {
                return false;
              }
              var11 = this.field_m.a((byte) 32, param5, 400);
              if (!(var9 instanceof ge)) {
                if (var9 instanceof lm) {
                  if (param0 != 34) {
                    ((lm) (var9)).a(var11 * 3 / 4, true);
                  }
                  if (param0 == 34 ||
                    var14 != 0) {
                    ((lm) (var9)).c(false);
                    if (var14 != 0) {
                      if (34 == param0) {
                        ((ge) (var9)).m((byte) 124);
                        ((ge) (var9)).d(var11, -96);
                      } else {
                        ((ge) (var9)).d(var11, -96);
                      }
                    }
                  }}
              } else {
                if (34 == param0) {
                  ((ge) (var9)).m((byte) 124);
                  if (var14 != 0) {
                    ((ge) (var9)).d(var11, -96);
                  }
                } else {
                  ((ge) (var9)).d(var11, -96);
                }
              }
              return true;
            }
            if (17 == var13Lifetime1 &&
              var14 == 0) {
              if (param4 != 65535 &&
                -1 != param4) {
                this.b(2, param5, param4, param2);
              } else {
                this.b(4, var7_int);
              }
              return true;
            }
            if (var13Lifetime1 == 11 &&
              var14 == 0) {
              this.field_m.field_a[param5] = this.field_m.a((byte) 32, param5, 500);
              return true;
            }
            if (var13Lifetime1 == 12) {
              this.field_m.field_z[param5] = this.field_m.a((byte) 32, param5, 750);
              return true;
            }
            if (param3 > -44) {
              this.b(19, 25, -67, 7);
            }
            return false;
          }
          var11Lifetime1 = this.field_m.a((byte) 32, param5, 1000);
          this.b(param1, param2, var11Lifetime1, 11564, param4);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var7), "rl.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final ge b(byte param0, int param1) {
        ek var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        ge stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 19) {
            this.b(101, -68, 16, -57, 121);
          }
          var3 = this.c(param1, -40);
          if (var3 == null) {
            if (this.a(param1, true) == null) {
              stackIn_10_0 = null;
              return (ge) (stackIn_10_0);
            }
            stackIn_8_0 = null;
            return (ge) (stackIn_8_0);
          }
          if (!(var3 instanceof ge)) {
            stackIn_15_0 = null;
            return (ge) (stackIn_15_0);
          }
          stackIn_17_0 = (ge) (var3);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "rl.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0) {
        boolean stackIn_7_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_45_0 = 0;
        br stackIn_84_0 = null;
        nk stackIn_87_0 = null;
        Object stackIn_89_0 = null;
        bf stackIn_92_0 = null;
        Object stackIn_94_0 = null;
        boolean stackIn_104_0 = false;
        int stackIn_111_0 = 0;
        boolean stackIn_129_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        nk stackOut_86_0;
        bf stackOut_91_0;
        boolean stackOut_103_0;
        br var2 = null;
        int var2_int = 0;
        nk var2_ref = null;
        bf var2_ref2 = null;
        sa var2_ref3 = null;
        RuntimeException var2_ref4 = null;
        br var3 = null;
        Object var3_ref = null;
        ce var3_ref2 = null;
        pa var4 = null;
        ce var4_ref = null;
        br var4_ref2 = null;
        qj var4_ref3 = null;
        ge var5_ref_ge = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_31_0Lifetime1;
        int stackIn_31_1Lifetime1;
        int var2_intLifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_m.field_l == 3) {
            return;
          }
          this.field_m.field_H = this.field_m.field_H + 1;
          this.field_l = false;
          var2 = this.field_u.c(86);
          boolean decompiledNaturalLoopExit4 = false;
          while (!(decompiledNaturalLoopExit4 = (!(var2 instanceof ek)))) {
            stackOut_6_0 = var2 instanceof ge;
            stackIn_17_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var6 == 0) {
              if (stackIn_7_0 &&
                ((ge) (var2)).p((byte) 53)) {
                this.field_l = true;
              }
              var2 = this.field_u.b(param0 ^ -32726);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit4) {
            stackIn_17_0 = 0;
          }
          var2_int = stackIn_17_0;
          L5: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (this.field_m.field_a.length > var2_int) {
              stackIn_31_0 = -1;
              stackIn_31_1 = ~this.field_m.field_a[var2_int];
              if (var6 != 0) {
                if (stackIn_31_0 > stackIn_31_1) {
                  stackIn_45_0 = this.field_m.field_z[var2_int];
                  break L5;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_31_0 > stackIn_31_1) {
                  this.field_m.field_a[var2_int] = this.field_m.field_a[var2_int] - 1;
                } else {
                  this.field_m.field_a[var2_int] = 0;
                }
                var2_int++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var2_int = 0;
              while (true) {
                stackIn_31_0Lifetime1 = ~var2_int;
                stackIn_31_1Lifetime1 = ~this.field_m.field_z.length;
                if (stackIn_31_0Lifetime1 <= stackIn_31_1Lifetime1) {
                  break;
                }
                stackIn_45_0 = this.field_m.field_z[var2_int];
                if (var6 != 0) {
                  break L5;
                }
                if (stackIn_45_0 > 0) {
                  this.field_m.field_z[var2_int] = this.field_m.field_z[var2_int] - 1;
                } else {
                  this.field_m.field_z[var2_int] = 0;
                }
                var2_int++;
              }
            }
            stackIn_45_0 = 0;
            break;
          }
          if (stackIn_45_0 == this.field_m.field_l) {
            return;
          }
          var2_intLifetime1 = 0;
          while (true) {
            if (var2_intLifetime1 < this.field_m.field_m.length) {
              this.field_m.field_m[var2_intLifetime1] = 0;
              var2_intLifetime1++;
              if (var6 == 0) {
                continue;
              }
            } else {
              var2 = this.field_u.c(75);
              boolean decompiledNaturalLoopExit3 = false;
              while (!(decompiledNaturalLoopExit3 = (!(var2 instanceof ek)))) {
                var3 = var2.field_d;
                ((ek) (var2)).h(param0 ^ -32763);
                stackIn_84_0 = var2;
                if (var6 == 0) {
                  if (stackIn_84_0 instanceof pa) {
                    var4 = (pa) (var2);
                    if (var4 instanceof ge &&
                      !var4.field_Z &&
                      9 != var4.field_Q &&
                      var4.field_Q != 21) {
                      this.field_m.field_m[((ge) (var4)).field_gb] = this.field_m.field_m[((ge) (var4)).field_gb] + 1;
                    }
                    if (var4.field_S) {
                      if (var4 instanceof ge) {
                        var5_ref_ge = (ge) (var4);
                        if (var5_ref_ge.field_eb) {
                          this.a(-2, var5_ref_ge);
                        }
                      }
                      this.a(-2, var4);
                    }
                  }
                  var2 = var3;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit3) {
                stackIn_84_0 = this.field_n.c(127);
              }
              var2_ref = (nk) (stackIn_84_0);
              boolean decompiledNaturalLoopExit2 = false;
              while (!(decompiledNaturalLoopExit2 = (var2_ref == null))) {
                var2_ref.a(param0 + 32843);
                stackOut_86_0 = (nk) (this.field_n.b(param0 ^ -32726));
                stackIn_89_0 = stackOut_86_0;
                stackIn_87_0 = stackOut_86_0;
                if (var6 == 0) {
                  var2_ref = stackIn_87_0;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit2) {
                stackIn_89_0 = this.field_m.field_A.c(param0 + 32810);
              }
              var2_ref2 = (bf) (stackIn_89_0);
              boolean decompiledNaturalLoopExit1 = false;
              while (!(decompiledNaturalLoopExit1 = (var2_ref2 == null))) {
                var2_ref2.c(0);
                stackOut_91_0 = (bf) (this.field_m.field_A.b(6));
                stackIn_94_0 = stackOut_91_0;
                stackIn_92_0 = stackOut_91_0;
                if (var6 == 0) {
                  var2_ref2 = stackIn_92_0;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit1) {
                stackIn_94_0 = this.field_m.field_G.c(46);
              }
              var2_ref3 = (sa) (stackIn_94_0);
              while (var2_ref3 != null) {
                var2_ref3.c(-21);
                var2_ref3 = (sa) (this.field_m.field_G.b(6));
                if (var6 == 0) {
                  continue;
                }
                break;
              }
              var2_intLifetime1 = 0;
            }
            break;
          }
          var3_ref = null;
          if (param0 != -32724) {
            field_v = (byte[]) null;
          }
          var4_ref = (ce) (this.field_m.field_s.c(param0 ^ -32670));
          while (true) {
            if (var4_ref == null) {
              stackIn_111_0 = var2_intLifetime1;
              break;
            }
            var3_ref2 = (ce) (this.field_m.field_s.b(6));
            stackOut_103_0 = var4_ref.d(-20232);
            stackIn_111_0 = stackOut_103_0 ? 1 : 0;
            stackIn_104_0 = stackOut_103_0;
            if (var6 == 0) {
              if (stackIn_104_0) {
                var2_intLifetime1 = 1;
              }
              var4_ref = var3_ref2;
              continue;
            }
            break;
          }
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_111_0 != 0) {
            var4_ref = (ce) (this.field_m.field_s.c(45));
            do {
              if (null == var4_ref) {
                this.field_b.a(48);
                break;
              }
              var4_ref.a((byte) -60);
              var4_ref = (ce) (this.field_m.field_s.b(param0 ^ -32726));
            } while (var6 == 0);
            var4_ref2 = this.field_u.c(99);
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!(var4_ref2 instanceof ek)))) {
              stackIn_129_0 = var4_ref2 instanceof ge;
              if (var6 == 0) {
                if (stackIn_129_0) {
                  ((ge) (var4_ref2)).j((byte) 82);
                }
                var4_ref2 = this.field_u.b(6);
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              decompiledFrameCompleted0 = false;
            }
            if (decompiledFrameCompleted0) {
              if (!stackIn_129_0) {
                var4_ref3 = (qj) (this.field_e.g(50));
                return;
              }
              return;
            }
          }
          while (true) {
            stackIn_129_0 = this.field_e.f(28113);
            if (stackIn_129_0) {
              return;
            }
            var4_ref3 = (qj) (this.field_e.g(50));
            if (var6 != 0) {
              return;
            }
            if (var4_ref3.field_g > this.field_m.field_H) {
              break;
            }
            var5 = this.b(var4_ref3.field_h, var4_ref3.field_q, var4_ref3.field_f, -84, var4_ref3.field_k, var4_ref3.field_n) ? 1 : 0;
            if (var5 != 0) {
              if (this.field_j[var4_ref3.field_n] == 255) {
                this.field_j[var4_ref3.field_n] = var4_ref3.field_q;
              } else {
                if (~this.field_j[var4_ref3.field_n] != ~var4_ref3.field_q) {
                  this.field_j[var4_ref3.field_n] = -2;
                }
              }
            }
          }
          this.field_e.a(-25612, var4_ref3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref4), "rl.EA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        ce stackIn_6_0;
        ce stackIn_6_1;
        fh stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_6_5;
        ce stackIn_7_0 = null;
        ce stackIn_7_1 = null;
        int stackIn_7_6 = 0;
        RuntimeException decompiledCaughtException = null;
        ce var6 = null;
        RuntimeException var6_ref = null;
        ek var7 = null;
        ge var8 = null;
        lm var8_ref = null;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 != 11564) {
            return;
          }
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = this.field_b;
          stackIn_6_3 = param1;
          stackIn_6_4 = param4;
          stackIn_6_5 = param2;
          if (9 != param0) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_6 = 0;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_6 = 1;
          }
          var6 = new ce(stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_6_5, stackIn_7_6);
          this.field_m.field_s.a(var6, false);
          if (param0 == 9) {
            var7 = (ek) (this.field_u.c(60));
            while (null != var7) {
              if (var9 != 0) {
                return;
              }
              if (var7 instanceof ge) {
                var8 = (ge) (var7);
                if (var6.a(var8.e((byte) -112), var8.g(1829947600), -1)) {
                  var8.d(200, -124);
                }
              } else {
                if (var7 instanceof lm) {
                  var8_ref = (lm) (var7);
                  if (var6.a(var8_ref.e((byte) -112), var8_ref.g(1829947600), -1)) {
                    var8_ref.a(200, true);
                  }
                }
              }
              var7 = (ek) (this.field_u.b(6));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "rl.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(pa param0, byte param1) {
        int stackIn_40_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        sh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0.field_Z) {
            return false;
          }
          if (param1 != 105) {
            return true;
          }
          var3 = (sh) (this.field_f.c(64));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
            var4 = var3.field_C - param0.field_C;
            stackIn_40_0 = -1;
            if (var7 == 0) {
              if (stackIn_40_0 <= var4 &&
                1 >= var4) {
                var4 = -param0.field_B + var3.field_B;
                if (var4 >= -1 &&
                  1 >= var4 &&
                  var3.a(param0, param1 - 84)) {
                  this.a(-7737, ak.a(var3.field_O, (byte) -111, this.field_m.field_H, param0.field_x));
                  if (!(param0 instanceof lm)) {
                    var6 = (ge) (param0);
                    var5 = 4;
                    var6.t(4);
                    this.field_i[var3.field_O] = this.field_i[var3.field_O] + 1;
                    this.field_m.field_J[var3.field_O] = this.field_m.field_J[var3.field_O] + 1;
                    if (this.field_m.b((byte) -122, 53, var3.field_O)) {
                      var5 = var5 + var5 / 2;
                    }
                  } else {
                    this.field_m.c(-118);
                    var5 = 10;
                    this.field_g[var3.field_O] = this.field_g[var3.field_O] + 1;
                    if (((lm) (param0)).field_hb) {
                      this.field_k[var3.field_O] = cr.b(this.field_k[var3.field_O], 4);
                    }
                    this.field_m.field_J[var3.field_O] = this.field_m.field_J[var3.field_O] + 3;
                    if (this.field_m.b((byte) -99, 60, var3.field_O)) {
                      var5 = var5 + var5 / 2;
                    }
                  }
                  this.field_m.field_d[var3.field_O] = this.field_m.field_d[var3.field_O] + var5;
                  this.field_m.a(param1 - 233, param0);
                  return true;
                }
              }
              var3 = (sh) (this.field_f.b(6));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_40_0 = 0;
          }
          return stackIn_40_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_44_0 = var3_ref;
          stackIn_44_1 = new StringBuilder().append("rl.AA(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        try {
          this.field_m.field_A.a(new bf(this.field_b, param2, param0, param3), false);
          if (param1 != -22930) {
            this.a(-17, false, -101, (byte) 121);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "rl.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(lm param0, ge param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1.field_Z) {
            return;
          }
          this.a(-7737, fn.a(param3, param0.field_x, param1.field_x, (byte) 116, this.field_m.field_H, param2));
          param1.field_S = false;
          if (param4 != -63) {
            this.field_b = (fh) null;
          }
          param1.field_eb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("rl.H(");
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
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(lm param0, ge param1, ge param2, boolean param3) {
        sj var5 = null;
        sj stackIn_3_0 = null;
        sj stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        sj stackIn_4_0 = null;
        sj stackIn_4_1 = null;
        int stackIn_4_3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          stackIn_3_0 = null;
          stackIn_3_1 = null;
          stackIn_3_2 = this.field_m.field_H;
          if (null == param2) {
            stackIn_4_0 = null;
            stackIn_4_1 = null;
            stackIn_4_3 = -1;
          } else {
            stackIn_4_0 = null;
            stackIn_4_1 = null;
            stackIn_4_3 = param2.field_x;
          }
          var5 = new sj(stackIn_3_2, stackIn_4_3, param0.field_x, param1.field_x, param0.field_G, param0.field_E, param1.field_gb);
          if (param3) {
            this.field_d = (hk[]) null;
          }
          this.a(-7737, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("rl.JA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1, int param2, int param3, int param4) {
        boolean stackIn_7_0 = false;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        pa[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int var8 = 0;
        br var9_ref_br = null;
        int var9 = 0;
        pa var10 = null;
        int var11 = 0;
        int var12 = 0;
        ge var13 = null;
        int var14 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          g.field_a.setSeed((long)((param4 << 5) + param3 + param2));
          var6 = new pa[this.field_u.a(0)];
          var7 = new int[this.field_u.a(0)];
          d.a(var7, 0, var7.length, 32767);
          if (param1 > -36) {
            field_r = (of[]) null;
          }
          var8 = 0;
          var9_ref_br = this.field_u.c(111);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var9_ref_br instanceof ek)))) {
            stackOut_6_0 = var9_ref_br instanceof pa;
            stackIn_37_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var14 == 0) {
              if (stackIn_7_0) {
                var10 = (pa) (var9_ref_br);
                var11 = var10.e((byte) -112) - param3;
                var12 = -param4 + var10.g(1829947600);
                if (var11 * var11 + var12 * var12 <= 14400) {
                  if (!param0 ||
                    !(var10 instanceof ge)) {
                    if (var10 instanceof lm) {
                      var6[var8] = var10;
                      var7[var8] = var10.field_x;
                      var8++;
                    }
                  } else {
                    var13 = (ge) (var10);
                    if (var13.field_gb != param2) {
                      var6[var8] = (pa) ((Object) var13);
                      var7[var8] = var13.field_x;
                      var8++;
                    }
                  }
                }
              }
              var9_ref_br = this.field_u.b(6);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            vh.a(-7255, var7, var6);
            stackIn_37_0 = 0;
          }
          var9 = stackIn_37_0;
          while (var8 > var9) {
            var10 = var6[var9];
            if (var14 != 0) {
              return;
            }
            if (var10 instanceof ge &&
              this.field_m.b(0, ((ge) (var10)).field_gb)) {
              this.a((byte) 100, (ge) (var10));
            } else {
              var6[var9].b(param2, -50);
            }
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "rl.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        bf stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        boolean stackIn_14_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_34_0 = false;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException decompiledCaughtException = null;
        bf stackOut_3_0;
        boolean stackOut_13_0;
        boolean stackOut_23_0;
        boolean stackOut_33_0;
        Object var5 = null;
        br var5_ref = null;
        RuntimeException var5_ref2 = null;
        bf var6_ref_bf = null;
        sa var6_ref_sa = null;
        ce var6_ref_ce = null;
        br var6_ref_br = null;
        int var6 = 0;
        og var7_ref_og = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_78_0Lifetime1;
        int var7Lifetime1;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5 = null;
          var6_ref_bf = (bf) (this.field_m.field_A.c(64));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var6_ref_bf == null))) {
            stackOut_3_0 = var6_ref_bf;
            stackIn_11_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var9 == 0) {
              if (((bf) (Object) stackIn_4_0).a(param3, param2, (byte) 29)) {
                var6_ref_bf.a(-98);
                return;
              }
              var6_ref_bf = (bf) (this.field_m.field_A.b(6));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_11_0 = this.field_m.field_G.c(109);
          }
          var6_ref_sa = (sa) (stackIn_11_0);
          L4: while (true) {
            if (null != var6_ref_sa) {
              var5_ref = this.field_m.field_G.b(6);
              stackOut_13_0 = var6_ref_sa.a(param3, param0 + 17308, param2);
              stackIn_44_0 = stackOut_13_0 ? 1 : 0;
              stackIn_14_0 = stackOut_13_0;
              if (var9 == 0) {
                if (stackIn_14_0) {
                  var6_ref_sa.d(-110);
                  var6_ref_sa.a(true);
                  return;
                }
                var6_ref_sa = (sa) (var5_ref);
                continue;
              }
            } else {
              var6_ref_ce = (ce) (this.field_m.field_s.c(98));
              while (true) {
                if (null != var6_ref_ce) {
                  var5_ref = this.field_m.field_s.b(6);
                  stackOut_23_0 = var6_ref_ce.a(param3, param2, -1);
                  stackIn_44_0 = stackOut_23_0 ? 1 : 0;
                  stackIn_24_0 = stackOut_23_0;
                  if (var9 != 0) {
                    break;
                  }
                  if (stackIn_24_0) {
                    var6_ref_ce.c(param0 - 28190);
                  } else {
                    var6_ref_ce = (ce) (var5_ref);
                    continue;
                  }
                }
                var6_ref_br = this.field_m.field_K.c(85);
                while (null != var6_ref_br) {
                  stackOut_33_0 = var6_ref_br instanceof og;
                  stackIn_44_0 = stackOut_33_0 ? 1 : 0;
                  stackIn_34_0 = stackOut_33_0;
                  if (var9 != 0) {
                    break L4;
                  }
                  if (stackIn_34_0) {
                    var7_ref_og = (og) (var6_ref_br);
                    if (var7_ref_og.b(param2, param3, param0 - 120)) {
                      var7_ref_og.field_R = 1;
                    }
                  }
                  var6_ref_br = this.field_m.field_K.b(param0 + 4);
                }
                stackIn_44_0 = 0;
                break;
              }
            }
            break;
          }
          var6 = stackIn_44_0;
          var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var7 < this.field_m.field_a.length)))) {
            stackIn_58_0 = var6;
            if (var9 == 0) {
              if (stackIn_58_0 == 0 &&
                this.field_m.field_a[var7] <= 0) {
                stackIn_56_0 = 0;
              } else {
                stackIn_56_0 = 1;
              }
              var6 = stackIn_56_0;
              this.field_m.field_a[var7] = 0;
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_58_0 = var6;
          }
          if (stackIn_58_0 != 0) {
            return;
          }
          var7Lifetime1 = 0;
          if (param0 != 2) {
            this.a((lm) null, (ge) null, -111, -126, (byte) -27);
          }
          var8 = 0;
          while (true) {
            if (!(this.field_m.field_z.length > var8)) {
              stackIn_78_0 = var7Lifetime1;
              break;
            }
            stackIn_78_0Lifetime1 = var7Lifetime1;
            if (var9 == 0) {
              if (stackIn_78_0Lifetime1 == 0 &&
                0 >= this.field_m.field_z[var8]) {
                stackIn_76_0 = 0;
              } else {
                stackIn_76_0 = 1;
              }
              var7Lifetime1 = stackIn_76_0;
              this.field_m.field_z[var8] = 0;
              var8++;
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5_ref2), "rl.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, ge param1, ge param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.field_Z &&
            !param1.field_Z) {
            this.a(-7737, td.a(param2.g(1829947600), this.field_m.field_H, param2.e((byte) -112), (byte) 41, param1.g(1829947600), param1.field_x, param1.e((byte) -112), param2.field_x));
            var4_int = -87 % ((param0 + 35) / 36);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("rl.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        hk var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        br var8_ref_br = null;
        lm var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var8Lifetime1;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!this.field_t) {
            this.a((byte) 52, "cheat disabled!", "player [" + param2 + "] attempted to cheat: " + param1 + ", " + param5 + ", " + param3 + ", " + param0);
            return;
          }
          System.out.println("player [" + param2 + "] cheating: " + param1 + ", " + param5 + ", " + param3 + ", " + param0);
          if (param4 != 3) {
            this.a(102, false, -116, (byte) 100);
          }
          var8 = param1;
          if (var8 == 0) {
            var8_ref_br = this.field_u.c(85);
            while (null != var8_ref_br) {
              if (var12 != 0) {
                return;
              }
              if (var8_ref_br instanceof lm) {
                var9 = (lm) (var8_ref_br);
                if (!var9.field_Z ||
                  var12 != 0) {
                  var10 = -param5 + var9.e((byte) -112);
                  var11 = -param3 + var9.g(1829947600);
                  if (var10 * var10 + var11 * var11 >= 4000 ||
                    var12 != 0) {
                    var9.field_G = param5 << 16;
                    var9.field_E = param3 << 16;
                    var9.field_S = true;
                    System.out.println("moving human oid " + var9.field_x);
                    return;
                  }
                }
              }
              var8_ref_br = this.field_u.b(6);
            }
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var8 != 1) {
            if ((var8 != 3 ||
              var12 != 0) &&
              (decompiledFrameRemainder0 = (2 != var8))) {
              return;
            }
          } else {
            this.field_m.field_d[param0] = 100;
            this.field_m.field_d[(param0 + 1) % this.field_m.field_t] = 25;
            this.field_m.field_H = 6000;
            this.a(false, 2);
            this.field_m.field_C = this.field_m.field_H + 1;
            if (var12 == 0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            this.a(false, param5);
            if (var12 == 0) {
              return;
            }
          }
          var7 = this.field_d[param2];
          var8Lifetime1 = 0;
          while (var7.field_b.length > var8Lifetime1) {
            var7.field_b[var8Lifetime1] = 0;
            var8Lifetime1++;
            if (var12 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var7_ref), "rl.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        ge var6 = null;
        RuntimeException var6_ref = null;
        ge stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.b((byte) 117, param3);
          if (var6 == null) {
            return false;
          }
          if (param0 != var6.field_gb) {
            return true;
          }
          if (21 == var6.field_Q) {
            return true;
          }
          if (param4) {
            return true;
          }
          boolean decompiledSharedTail0 = !(!var6.field_lb);
          if (!decompiledSharedTail0) {
            stackIn_22_0 = var6;
            stackIn_23_1 = !(param4);
            ((ge) (Object) stackIn_22_0).a(stackIn_23_1, this.field_b.b(var6.e((byte) -112), param2, var6.g(1829947600), param1, 8760));
            decompiledSharedTail0 = (ZombieDawnMulti.field_E);
          }
          if (decompiledSharedTail0) {
            var6.field_G = param1 << 16;
            var6.field_E = param2 << 16;
            var6.a(33, (byte) -89);
            var6.field_ab = param2;
            var6.field_N = param1;
          }
          this.a(-2, (pa) (var6));
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "rl.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    rl(kb param0, hk[] param1, boolean param2, boolean param3) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ek var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_i = new int[4];
        this.field_o = false;
        this.field_j = new int[4];
        this.field_p = new int[4];
        this.field_k = new int[4];
        this.field_g = new int[4];
        try {
          this.field_d = param1;
          this.field_t = param2;
          this.field_m = param0;
          this.field_q = new th();
          this.field_u = this.field_m.a((byte) 125);
          this.a(param3, (byte) -6, this.field_m.field_h);
          var5 = (ek) (this.field_u.c(126));
          do {
            if (var5 == null) {
              this.field_m.field_l = 0;
              break;
            }
            var5.a(-9019, this);
            var5 = (ek) (this.field_u.b(6));
          } while (var6 == 0);
          var5_int = 0;
          while (var5_int < this.field_j.length) {
            this.field_j[var5_int] = 255;
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_18_0 = var5_ref;
          stackIn_18_1 = new StringBuilder().append("rl.<init>(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = "Real-life threats";
    }
}
