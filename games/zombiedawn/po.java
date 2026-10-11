/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends ah {
    static int[] field_wb;
    static String field_Ab;
    private kd field_yb;
    static int[] field_zb;
    static int field_xb;

    final void a(wk param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          bi.d(param0.a(this.a(true), (byte) -124), param0.a(this.f(237239984), 0), 250, 16711680);
          bi.d(param0.a(this.a(true), (byte) -79), param0.a(this.f(237239984), param1 - 5060), 55, 16711935);
          var3_int = 0;
          do {
            if (!(this.field_ub > var3_int)) {
              if (param1 != 5060) {
                return;
              }
              break;
            }
            var4 = param0.a(this.field_jb[var3_int], (byte) -78);
            var5 = param0.a(this.field_gb[var3_int], param1 ^ 5060);
            bi.b(-1 + var4, var5 - 1, 3, 3, 0);
            bi.a(var4, var5, 65280);
            var3_int++;
          } while (var6 == 0);
          if (null != this.field_yb) {
            bi.e(param0.a(this.a(true), (byte) -122), param0.a(this.f(237239984), 0), param0.a(this.field_yb.a(true), (byte) -60), param0.a(this.field_yb.f(param1 + 237234924), 0), 65280);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("po.L(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void l(byte param0) {
        kd discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 52) {
            discarded$1 = this.m((byte) 55);
          }
          if (!this.a(false, false, -85, 55)) {
            if (!this.a(true, false, -102, 250)) {
              return;
            }
            if (1 == this.field_F) {
              return;
            }
            this.p(-123);
            if (ZombieDawn.field_J == 0) {
              return;
            }
          }
          this.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "po.I(" + param0 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          super.g(120);
          if (this.field_F == 10) {
            if (this.field_G == 0 &&
              this.field_N == 5) {
              this.field_U = dc.a((byte) 18, 12);
            }
            if (this.field_G == 1) {
              if (this.field_yb != null) {
                this.field_yb.c(401408, this.f(237239984), this.a(true));
                this.field_yb = null;
                if ((ZombieDawn.field_J != 0) &&
                  (this.field_G == 2)) {
                  this.e(0, -6904);
                }
              }
            } else {
              if (this.field_G == 2) {
                this.e(0, -6904);
              }
            }
          }
          if (param0 <= 95) {
            field_wb = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "po.A(" + param0 + ')');
        }
    }

    public static void v(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_zb = null;
          field_Ab = null;
          if (param0 != -31113) {
            po.a(69, -111, false, 104, (gd) null);
          }
          field_wb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "po.D(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_yb = this.m((byte) -95);
          if (this.field_yb == null) {
            return;
          }
          var2_int = this.field_yb.a(param0) - this.a(true);
          var3 = this.field_yb.f(237239984) - this.f(237239984);
          boolean decompiledSharedTail0 = !(Math.abs(var3) > Math.abs(var2_int));
          if (!decompiledSharedTail0) {
            if (0 < var3) {
              stackIn_10_1 = 2;
            } else {
              stackIn_10_1 = 0;
            }
            this.field_S = stackIn_10_1;
            decompiledSharedTail0 = (ZombieDawn.field_J != 0);
          }
          if (decompiledSharedTail0) {
            if (var2_int <= 0) {
              stackIn_17_1 = 3;
            } else {
              stackIn_17_1 = 1;
            }
            this.field_S = stackIn_17_1;
          }
          this.e(10, -6904);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "po.C(" + param0 + ')');
        }
    }

    po(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        this.field_yb = null;
        try {
          this.field_ub = 21;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "po.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, gd param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
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
        int stackIn_39_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = ZombieDawn.field_J;
        try {
          var5_int = wm.a((param3 - param1) * 3, (byte) -95);
          var6 = 3 * param1;
          nl.c(param0 ^ -30006);
          var7 = var5_int - 10;
          if (param4.field_p > 0 &&
            null != param4.field_F) {
            jd.a(91);
          }
          eh.field_A = 0;
          var8 = param0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_c > var8)))) {
            var9 = param4.field_g[var8];
            var10 = param4.field_H[var8];
            var11 = param4.field_r[var8];
            stackOut_10_0 = param2;
            stackIn_49_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var19 == 0) {
              if (stackIn_11_0) {
                var12 = to.field_a[var9];
                var13 = wc.field_Nb[var9];
                var14 = -var12 + to.field_a[var10];
                var15 = -var12 + to.field_a[var11];
                var16 = -var13 + wc.field_Nb[var10];
                var17 = wc.field_Nb[var11] - var13;
              }
              if (!stackIn_11_0 ||
                !(0 <= var14 * var17 - var15 * var16)) {
                var12Lifetime1 = pj.field_s[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = pj.field_s[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = pj.field_s[var11];
                    if (-2147483648 != var14) {
                      var15 = var14 + var12Lifetime1 + var13Lifetime1 - var6;
                      if (var7 < 0) {
                        stackIn_29_0 = var15 << -var7;
                      } else {
                        stackIn_29_0 = var15 >> var7;
                      }
                      var16 = -stackIn_29_0 + je.field_b.length - 1;
                      var17 = je.field_b[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_39_0 = var16;
                          if (stackIn_39_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = je.field_b[var16];
                          continue;
                        }
                        stackIn_39_0Lifetime1 = var17 + (var16 << 4);
                        var18 = stackIn_39_0Lifetime1;
                        uf.field_o[var18] = var8;
                        je.field_b[var16] = 1 + var17;
                        if (param4.field_p > 0 &&
                          null != param4.field_F) {
                          dupTemp$0 = param4.field_F[var8];
                          jp.field_f[dupTemp$0] = jp.field_f[dupTemp$0] + 1;
                        }
                        eh.field_A = eh.field_A + 1;
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
            stackIn_49_0 = ~param4.field_p;
          }
          if (stackIn_49_0 < -1 &&
            null != param4.field_F) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(jp.field_f.length <= var9Lifetime1)) {
              var10Lifetime1 = jp.field_f[var9Lifetime1];
              jp.field_f[var9Lifetime1] = var8Lifetime1;
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
          stackIn_65_0 = var5;
          stackIn_65_1 = new StringBuilder().append("po.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    final static void f(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ej.field_o = ob.field_b[param1];
          if (param0 != -1) {
            field_Ab = (String) null;
          }
          tm.field_h = kd.field_Fb[param1];
          if (null != qj.field_j[param1]) {
            la.field_c = qj.field_j[param1];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "po.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean w(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 13296) {
            po.f(-73, 6);
          }
          stackIn_4_0 = i.field_Y;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "po.E(" + param0 + ')');
        }
    }

    private final kd m(byte param0) {
        Object var2 = null;
        int var3 = 0;
        le var4 = null;
        int var10 = 0;
        Object stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var10 = ZombieDawn.field_J;
        try {
          var2 = null;
          var3 = -1;
          if (param0 > -60) {
            field_wb = (int[]) null;
          }
          var4 = dj.field_e.field_R.b((byte) 26);
          while (var4 instanceof fb) {
            if (var4 instanceof kd &&
              ((kd) (var4)).field_F != 8 &&
              ((kd) (var4)).x(37)) {
              var5 = ((kd) (var4)).a(true);
              var6 = ((kd) (var4)).f(237239984);
              var7 = -var5 + this.a(true);
              var8 = -var6 + this.f(237239984);
              var9 = var8 * var8 + var7 * var7;
              if (var9 < var3 ||
                -1 == var3) {
                var3 = var9;
                var2 = (kd) (var4);
              }
            }
            var4 = var4.field_b;
            if (var10 == 0) {
              continue;
            }
            break;
          }
          stackIn_22_0 = var2;
          return (kd) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (var2), "po.G(" + param0 + ')');
        }
    }

    static {
        field_Ab = "Start Game";
        field_wb = new int[]{39, 38};
        field_zb = new int[8192];
    }
}
