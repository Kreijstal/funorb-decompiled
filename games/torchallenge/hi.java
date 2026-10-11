/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ic {
    static int[] field_G;
    int field_H;
    static ka[] field_F;

    public static void h(int param0) {
        if (param0 != -1) {
          hi.a(-17, -69, -84, 52, -66, 71);
        }
        field_F = null;
        field_G = null;
    }

    hi(ee param0) {
        super(param0.field_m, param0.field_i, param0.field_p, param0.field_l, (j) null, (gg) null);
        try {
          param0.a((byte) 112, 0, this.field_l, this.field_p, 0);
          this.field_H = 256;
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_46_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_95_0 = 0;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var7Lifetime1;
        int var20Lifetime1;
        int var22Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var24Lifetime3;
        var32 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 5;
          for (var7 = 0; var7 < var6; var7++) {
            if ((1 << var7 & vi.field_a) > 0) {
              var5_int++;
            }
          }
          if (var5_int >= 3) {
          }
          var7Lifetime1 = vb.field_a[param3][param0];
          var8 = 1 + var7Lifetime1;
          var9 = -1 + var7Lifetime1;
          var10 = gl.field_l[param3][param0][1][0];
          var11 = gl.field_l[param3][param0][1][1];
          if (param1 != 5446) {
            hi.h(-76);
          }
          var12 = var11 - var10;
          if (0 >= var12) {
            return;
          }
          if (null == vk.field_i) {
            return;
          }
          var13 = vk.field_i.field_o;
          var14 = vk.field_i.field_H;
          var15 = 1 + var13;
          var16 = var13 + 2;
          var17 = 0;
          var18 = 0;
          var19 = 0;
          var20 = 0;
          if (!pl.a(var14, -4346, var15)) {
            var22 = ic.field_E[var15][var14];
            if ((var22 & 1) <= 0) {
              if ((var22 & 2) > 0) {
                var20Lifetime1 = 16;
              } else {
                if ((4 & var22) > 0) {
                  var20Lifetime1 = 32;
                } else {
                  var20Lifetime1 = (0 < (var22 & 8)) ? 48 : 64;
                }
              }
            } else {
              var20Lifetime1 = 0;
            }
          } else {
            var20Lifetime1 = 64;
          }
          var22Lifetime1 = var14 + 1;
          var21 = pl.a(var22Lifetime1, -4346, var15) ? 1 : 0;
          var23 = 0;
          if (var21 == 0 &&
            var20Lifetime1 == 64 &&
            var22Lifetime1 < ba.field_i.field_a) {
            var24 = ic.field_E[var15][var22Lifetime1];
            if ((var24 & 1) > 0) {
              var23 = 0;
            } else {
              if (0 < (var24 & 2)) {
                var23 = 16;
              } else {
                if (0 >= (4 & var24)) {
                  var23 = (0 < (8 & var24)) ? 48 : 64;
                } else {
                  var23 = 32;
                }
              }
            }
          }
          if (var14 != param4) {
            if (var23 > 0) {
              stackIn_46_0 = (var22Lifetime1 == param4) ? 1 : 0;
            } else {
              stackIn_46_0 = 0;
            }
          } else {
            stackIn_46_0 = 1;
          }
          var24Lifetime1 = stackIn_46_0;
          if (var24Lifetime1 == 0) {
            return;
          }
          var25 = kj.field_C[0].field_v;
          var26 = var23 + var20Lifetime1 + param2 - var25;
          if (param4 == var22Lifetime1) {
            var26 = var26 - var20Lifetime1;
          }
          var27 = 0;
          var28 = 0;
          if (param4 == var14) {
            var28 = 64 + param2;
            var27 = var26;
          }
          if (param4 == var22Lifetime1) {
            var28 = param2 + 64;
            var27 = param2;
          }
          if (64 <= var8) {
            var8 -= 64;
          }
          if (var9 < 0) {
            var9 += 64;
          }
          if (64 <= var15) {
            var16 -= 64;
          }
          if (64 <= var16) {
            var16 -= 64;
          }
          var24Lifetime2 = 0;
          if (var15 == var9 ||
            var16 == var9) {
            var19 = 1;
          }
          if (var15 == var7Lifetime1 ||
            var7Lifetime1 == var16) {
            var17 = 1;
          }
          if (var15 == var8 ||
            var8 == var16) {
            var18 = 1;
          }
          if (var19 == 0) {
            if (var17 == 0) {
              stackIn_87_0 = (var18 != 0) ? 1 : 0;
            } else {
              stackIn_87_0 = 1;
            }
          } else {
            stackIn_87_0 = 1;
          }
          var24Lifetime3 = stackIn_87_0;
          if (var24Lifetime3 == 0) {
            return;
          }
          var29 = -1;
          var30 = 1;
          if (var5_int >= 3) {
            if (ol.field_a) {
              ll.a(var27, var30, var10, var7Lifetime1, var19 != 0, var18 != 0, var17 != 0, var26, var29, var28, true, var11);
              return;
            }
            var29 = -(ef.field_k >> 8 << 8) + ef.field_k;
            var30 = 2;
            var29 = var29 - 128;
            stackIn_95_0 = (0 <= var29) ? 1 : -1;
            var31 = stackIn_95_0;
            var29 = var29 * var31;
            var29 = 2 * var29;
            if (0 < var29) {
              var29--;
            }
            if (var29 <= 1) {
              var29 = 2;
            }
            if (255 < var29) {
              var29 = 255;
            }
          }
          ll.a(var27, var30, var10, var7Lifetime1, var19 != 0, var18 != 0, var17 != 0, var26, var29, var28, true, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "hi.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public hi() {
        super(0, 0, 0, 0, (j) null, (gg) null);
        this.field_H = 256;
    }

    final static qe a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        Object var6;
        qe var6_ref;
        Object var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        qe var14;
        int var8Lifetime1;
        var13 = TorChallenge.field_F ? 1 : 0;
        var6 = null;
        if (param4 <= 90) {
          hi.h(-111);
        }
        var7 = null;
        var8 = 0;
        if (bi.field_g[param1][param5][param3] == null) {
          return null;
        }
        var8Lifetime1 = bi.field_g[param1][param5][param3][0];
        if (0 >= var8Lifetime1) {
          return null;
        }
        if (8 < var8Lifetime1) {
          return null;
        }
        var12 = 0;
        while (true) {
          if (var12 >= var8Lifetime1) {
            return (qe) (var7);
          }
          if (bi.field_g[param1][param5][param3][1 + var12] < 0) {
            return null;
          }
          if (ea.field_g.length <= bi.field_g[param1][param5][param3][var12 + 1]) {
            return null;
          }
          var14 = ea.field_g[bi.field_g[param1][param5][param3][var12 + 1]];
          var6_ref = var14;
          if (var6_ref == null) {
            return null;
          }
          if (var14.field_o != param1) {
            return null;
          }
          if (param5 != var14.field_H) {
            return null;
          }
          if (8 <= var14.field_F) {
            stackIn_26_0 = (21 >= var14.field_F) ? 1 : 0;
          } else {
            stackIn_26_0 = 0;
          }
          var9 = stackIn_26_0;
          if (var14.field_L != 13) {
            if (var9 == 0) {
              stackIn_34_0 = (var14.field_F != 22) ? 1 : 0;
            } else {
              stackIn_34_0 = 0;
            }
          } else {
            stackIn_34_0 = 0;
          }
          var10 = stackIn_34_0;
          if (13 != var14.field_L &&
            var14.field_db >= 0 &&
            var14.field_F != 22) {
            stackIn_43_0 = 0;
          } else {
            stackIn_43_0 = (var9 == 0) ? 1 : 0;
          }
          var11 = stackIn_43_0;
          if (0 == param3 &&
            var9 != 0 ||
            param3 == 1 &&
            var10 != 0 ||
            param3 == 2 &&
            var11 != 0) {
            var14.a(param0, param2, var14.field_B, var14.field_H, var14.field_o, var14.field_F, 2657, var14.field_u);
            var14.a((byte) -117, param2, param0);
            var7 = var6_ref;
          }
          var12++;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 0) {
          return;
        }
        if (null == this.field_A) {
          return;
        }
        if (this.field_H == 0) {
          return;
        }
        if (this.field_H == 256) {
          this.field_A.a(this.field_i + param0, this.field_m + param1, param2, param3);
          return;
        }
        ka var5 = new ka(this.field_A.field_p, this.field_A.field_l);
        ad.a(-13, var5);
        this.field_A.a(0, 0, param2, param3);
        ie.b((byte) -9);
        var5.d(param1 + this.field_m, param0 + this.field_i, this.field_H);
    }

    static {
    }
}
