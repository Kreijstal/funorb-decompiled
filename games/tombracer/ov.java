/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ov extends nv implements mra {
    private pc field_s;
    private up field_r;
    private mg field_n;
    private int field_u;
    private boolean field_q;
    private int field_w;
    private boolean field_v;
    private boolean field_t;
    private int field_o;
    static int field_p;

    public final boolean b(int param0) {
        int var2 = -21 % ((37 - param0) / 45);
        return this.field_t;
    }

    final void a(up param0, boolean param1) {
        try {
          this.field_r = param0;
          if (!param1) {
            this.field_u = -49;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ov.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void k(int param0) {
        boolean stackIn_12_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9_int;
        la var9;
        int var10;
        pc var11;
        int var12;
        var12 = TombRacer.field_G ? 1 : 0;
        if (this.field_q &&
          this.m((byte) 19).u(-25561)) {
          this.field_t = false;
          return;
        }
        if (!this.i(12340).g(108) &&
          null != this.field_n) {
          this.field_n.d(0);
          if (this.field_n.c(0)) {
            stackIn_12_1 = !(this.field_v);
            this.field_v = stackIn_12_1;
            this.field_o = 0;
          }
        }
        this.field_t = this.field_v;
        if (!this.field_v) {
          return;
        }
        var2 = this.field_w;
        if (0 == var2) {
          var2 = 268435456;
        }
        if (0 >= this.field_u) {
          this.field_o = var2;
        } else {
          this.field_o = this.field_o + this.field_u;
          if (this.field_o > var2) {
            this.field_o = var2;
          }
        }
        var3 = this.field_g.g(-25787) >> 2;
        var4 = hua.a((byte) 111, var3);
        var5 = bua.a(0, var3);
        var6 = 131072 + iia.d(this.field_g.c(param0 - 5467), this.field_g.a((byte) 55), param0 ^ 5416) / 2;
        var7 = this.field_g.d(3) + gqa.a(var4, (byte) 24, var6);
        var8 = this.field_g.e(9648) + gqa.a(var5, (byte) 24, var6);
        this.field_s.a(var7, gqa.a(var4, (byte) 24, this.field_o) + var7, var8, gqa.a(var5, (byte) 24, this.field_o) + var8, 44);
        this.field_s.field_b = this.field_o;
        this.field_s.field_i = this.field_g.P(param0 ^ param0) << 16;
        var9_int = this.field_r.field_j;
        if (3 == var9_int) {
          this.field_s.field_j = 6;
        } else {
          if (var9_int == 2) {
            this.field_s.field_j = 7;
          } else {
            this.field_s.field_j = 5;
          }
        }
        var9 = this.b(true);
        var10 = var9.a(1, this.field_g, -66, this.field_s, this.e(6), this.field_r) ? 1 : 0;
        var9.b(false).a((byte) 120, this.field_s, this.field_r);
        if (var10 != 0) {
          var11 = this.field_s;
          while (var11 != null) {
            if (!var11.field_l) {
              return;
            }
            if (null == var11.field_h) {
              var9.b(false).a(var11, this.field_g, (byte) -123);
              var9.a(param0 ^ 5463, var11.field_a, this.field_r, 524288, 524288, var11.field_e);
            }
            var11 = var11.field_h;
          }
          return;
        }
        return;
    }

    final pc c(int param0) {
        if (param0 < 99) {
          return (pc) null;
        }
        return this.field_s;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (q.a(param1, 11955)) {
            return true;
          }
          var6 = aba.field_c;
          var2 = var6;
          var3 = 0;
          while (var3 < var6.length) {
            var4 = var6[var3];
            if (var4 != param1) {
              var3++;
              continue;
            }
            return true;
          }
          if (param0 <= 1) {
            field_p = -59;
          }
          var7 = hb.field_x;
          var2Lifetime1 = var7;
          var8 = 0;
          var3Lifetime1 = var8;
          while (var8 < var7.length) {
            var4Lifetime1 = var7[var8];
            if (var4Lifetime1 == param1) {
              return true;
            }
            var8++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "ov.R(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          if (param0) {
            this.field_u = -117;
          }
          this.field_n.a(15637, param1);
          param1.a((byte) -23, this.field_w >> 16, 10);
          this.field_r.a(param1, (byte) 125);
          param1.a((byte) 85, !this.field_q ? 0 : 1, 1);
          param1.a((byte) 45, this.field_u >> 16, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ov.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_q = false;
        }
        return 4;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime1Lifetime1;
        int var17Lifetime1Lifetime1;
        int var18Lifetime1Lifetime1;
        int var19Lifetime1Lifetime1;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          ufa.a(-57, param1);
          var7_int = 0;
          var8 = -param0 + param1;
          if (0 > var8) {
            var8 = 0;
          }
          var9 = param1;
          var10 = -param1;
          var11 = var8;
          var12 = -var8;
          var13 = -1;
          if (param3) {
            return;
          }
          if (param2 >= gca.field_d &&
            param2 <= hc.field_h) {
            var39 = vaa.field_a[param2];
            var16 = rp.a(ss.field_c, -16226, pka.field_b, param6 - param1);
            var17 = rp.a(ss.field_c, -16226, pka.field_b, param6 + param1);
            var18 = rp.a(ss.field_c, -16226, pka.field_b, param6 - var8);
            var19 = rp.a(ss.field_c, -16226, pka.field_b, param6 + var8);
            nra.a((byte) -55, param4, var18, var39, var16);
            nra.a((byte) -55, param5, var19, var39, var18);
            nra.a((byte) -55, param4, var17, var39, var19);
          }
          var14 = -1;
          while (true) {
            if (var9 <= var7_int) {
              return;
            }
            var14 += 2;
            var13 += 2;
            var10 = var10 + var13;
            var12 = var12 + var14;
            if (0 <= var12 &&
              var11 >= 1) {
              var11--;
              var12 = var12 - (var11 << 1);
              pqa.field_m[var11] = var7_int;
            }
            var7_int++;
            if (0 <= var10) {
              var9--;
              var10 = var10 - (var9 << 1);
              var15 = param2 - var9;
              var16Lifetime1 = param2 + var9;
              if (var16Lifetime1 >= gca.field_d &&
                hc.field_h >= var15) {
                if (var8 <= var9) {
                  var17Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, param6 + var7_int);
                  var18Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, -var7_int + param6);
                  if (var16Lifetime1 <= hc.field_h) {
                    nra.a((byte) -55, param4, var17Lifetime1, vaa.field_a[var16Lifetime1], var18Lifetime1);
                  }
                  if (gca.field_d <= var15) {
                    nra.a((byte) -55, param4, var17Lifetime1, vaa.field_a[var15], var18Lifetime1);
                  }
                } else {
                  var17Lifetime1 = pqa.field_m[var9];
                  var18Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, param6 + var7_int);
                  var19Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, -var7_int + param6);
                  var20 = rp.a(ss.field_c, -16226, pka.field_b, var17Lifetime1 + param6);
                  var21 = rp.a(ss.field_c, -16226, pka.field_b, -var17Lifetime1 + param6);
                  if (var16Lifetime1 <= hc.field_h) {
                    var40 = vaa.field_a[var16Lifetime1];
                    nra.a((byte) -55, param4, var21, var40, var19Lifetime1);
                    nra.a((byte) -55, param5, var20, var40, var21);
                    nra.a((byte) -55, param4, var18Lifetime1, var40, var20);
                  }
                  if (var15 >= gca.field_d) {
                    var41 = vaa.field_a[var15];
                    nra.a((byte) -55, param4, var21, var41, var19Lifetime1);
                    nra.a((byte) -55, param5, var20, var41, var21);
                    nra.a((byte) -55, param4, var18Lifetime1, var41, var20);
                  }
                }
              }
            }
            var15Lifetime1 = param2 - var7_int;
            var16Lifetime1Lifetime1 = param2 + var7_int;
            if (var16Lifetime1Lifetime1 < gca.field_d) {
              continue;
            }
            if (hc.field_h < var15Lifetime1) {
              continue;
            }
            var17Lifetime1Lifetime1 = var9 + param6;
            var18Lifetime1Lifetime1 = param6 - var9;
            if (var17Lifetime1Lifetime1 < pka.field_b) {
              continue;
            }
            if (var18Lifetime1Lifetime1 > ss.field_c) {
              continue;
            }
            var17Lifetime1Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, var17Lifetime1Lifetime1);
            var18Lifetime1Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, var18Lifetime1Lifetime1);
            if (var8 <= var7_int) {
              if (hc.field_h >= var16Lifetime1Lifetime1) {
                nra.a((byte) -55, param4, var17Lifetime1Lifetime1, vaa.field_a[var16Lifetime1Lifetime1], var18Lifetime1Lifetime1);
              }
              if (gca.field_d > var15Lifetime1) {
                continue;
              }
              nra.a((byte) -55, param4, var17Lifetime1Lifetime1, vaa.field_a[var15Lifetime1], var18Lifetime1Lifetime1);
              continue;
            }
            if (var11 < var7_int) {
              stackIn_41_0 = pqa.field_m[var7_int];
            } else {
              stackIn_41_0 = var11;
            }
            var19Lifetime1Lifetime1 = stackIn_41_0;
            var20Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, param6 + var19Lifetime1Lifetime1);
            var21Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, -var19Lifetime1Lifetime1 + param6);
            if (var16Lifetime1Lifetime1 <= hc.field_h) {
              var42 = vaa.field_a[var16Lifetime1Lifetime1];
              nra.a((byte) -55, param4, var21Lifetime1, var42, var18Lifetime1Lifetime1);
              nra.a((byte) -55, param5, var20Lifetime1, var42, var21Lifetime1);
              nra.a((byte) -55, param4, var17Lifetime1Lifetime1, var42, var20Lifetime1);
            }
            if (var15Lifetime1 < gca.field_d) {
              continue;
            }
            var43 = vaa.field_a[var15Lifetime1];
            nra.a((byte) -55, param4, var21Lifetime1, var43, var18Lifetime1Lifetime1);
            nra.a((byte) -55, param5, var20Lifetime1, var43, var21Lifetime1);
            nra.a((byte) -55, param4, var17Lifetime1Lifetime1, var43, var20Lifetime1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "ov.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ov(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_s = new pc();
        this.field_o = 0;
        try {
          this.field_n = new mg(param0.field_E, param1);
          this.field_w = param1.b((byte) 44, 10) << 16;
          this.field_r = ad.a((byte) 87, param1);
          if (8 <= param0.field_E) {
            stackIn_5_1 = (param1.b((byte) 44, 1) == 1);
            this.field_q = stackIn_5_1;
          }
          if (param0.field_E >= 11) {
            this.field_u = param1.b((byte) 44, 8) << 16;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ov.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        boolean stackIn_7_0 = false;
        if (param0 > -58) {
          return true;
        }
        stackIn_7_0 = (uk.a(param2, (byte) 2, param1)) || (pr.a(param1, -23611, param2));
        return stackIn_7_0;
    }

    final static boolean b(int param0, int param1) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = -1 % ((param0 - 63) / 46);
        stackIn_4_0 = (hb.field_t != null) && (hb.field_t.field_c == param1);
        return stackIn_4_0;
    }

    final int a(int param0, int param1) {
        param0 = upa.a(this.field_v, param0, (byte) -106);
        param0 = fs.a((byte) 127, param0, this.field_o);
        if (param1 >= -48) {
          return 84;
        }
        return param0;
    }

    public final void m(int param0) {
        int var2 = 12 % ((param0 - 28) / 49);
        if (this.field_k) {
          return;
        }
        super.m(78);
        if (!this.field_f) {
          this.field_t = false;
        }
    }

    public final void a(int param0, mg param1) {
        try {
          this.field_n = param1;
          if (param0 < 81) {
            this.p((byte) -109);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ov.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, fsa param1) {
        try {
          super.a(param0, param1);
          this.field_r.a(this.e(6), 2348);
          if (!param0) {
            this.field_q = true;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ov.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
          fsa var3 = (fsa) null;
          this.a(true, (fsa) null);
        }
        return false;
    }

    ov(la param0, boolean param1) {
        super(param0, param1);
        this.field_s = new pc();
        this.field_o = 0;
        try {
          this.field_n = new mg();
          this.field_r = new up(1, 10);
          this.field_r.b(1, 13);
          this.field_w = 0;
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ov.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, iq param1) {
        try {
          super.b(117, param1);
          if (param0 < 112) {
            this.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ov.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
