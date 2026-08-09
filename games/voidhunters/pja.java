/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pja extends le {
    static slb field_l;
    static String field_o;
    int field_p;
    int[] field_k;
    static int[] field_n;
    private int field_m;
    int field_j;
    static String field_i;

    final static void e(int param0) {
        if (bm.field_o != null) {
          if (param0 > -42) {
            return;
          } else {
            L0: {
              if (psb.field_b != null) {
                spb.a((byte) -95);
                ip.field_p.height = eta.field_a.height;
                ip.field_p.width = eta.field_a.width;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, ds param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 < -60) {
                break L1;
              } else {
                this.field_m = 105;
                break L1;
              }
            }
            L2: {
              if (0 != param0) {
                break L2;
              } else {
                this.field_m = param2.e(1869);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("pja.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            field_o = (String) null;
            return this.field_m;
        }
        return this.field_m;
    }

    final void c(int param0) {
        super.c(-75);
        if (param0 >= -23) {
            this.a(52);
            this.field_k = null;
            return;
        }
        this.field_k = null;
    }

    public pja() {
        super(0, false);
        this.field_m = -1;
    }

    final static int b(byte param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var3 = (int)(-kba.field_a.field_c + (float)param1);
        var4 = (int)((float)param2 - kba.field_a.field_b);
        if (param0 <= 83) {
          return 77;
        } else {
          L0: {
            var5 = (int)(640.0 / (double)kba.field_a.field_a);
            var6 = qua.a(var5, (byte) 119, var4, var3);
            var7 = 33554432 / var6;
            if ((var7 ^ -1) >= -129) {
              break L0;
            } else {
              var7 = 128;
              break L0;
            }
          }
          return var7;
        }
    }

    public static void d(int param0) {
        field_o = null;
        if (param0 != -1) {
            return;
        }
        field_n = null;
        field_l = null;
        field_i = null;
    }

    final boolean f(int param0) {
        ima var2;
        ima stackIn_8_0 = null;
        if (null != this.field_k) {
          return true;
        } else {
          if (this.field_m >= param0) {
            L0: {
              if (-1 >= (dbb.field_o ^ -1)) {
                stackIn_8_0 = ima.a(qnb.field_o, dbb.field_o, this.field_m);
                break L0;
              } else {
                stackIn_8_0 = ima.a(qnb.field_o, this.field_m);
                break L0;
              }
            }
            var2 = stackIn_8_0;
            var2.d();
            this.field_k = var2.b();
            this.field_p = var2.field_e;
            this.field_j = var2.field_f;
            return true;
          } else {
            return false;
          }
        }
    }

    int[][] a(int param0, int param1) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[][] var3;
        int[] var4;
        int[] var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        var11 = VoidHunters.field_G;
        if (param0 == 255) {
          var14 = this.field_d.a(param1, (byte) -110);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (this.field_d.field_g) {
            if (!this.f(0)) {
              return var3;
            } else {
              L0: {
                var4 = var14[0];
                var5 = var14[1];
                var6 = var14[2];
                stackIn_26_0 = this.field_j;

                if (noa.field_o != this.field_p) {
                  stackIn_27_0 = stackIn_26_0;
                  stackIn_27_1 = param1 * this.field_p / noa.field_o;
                  break L0;
                } else {
                  stackIn_27_0 = stackIn_26_0;
                  stackIn_27_1 = param1;
                  break L0;
                }
              }
              L1: {
                var7 = stackIn_27_0 * stackIn_27_1;
                if (this.field_j == hob.field_d) {
                  var8 = 0;
                  L2: while (true) {
                    if (hob.field_d <= var8) {
                      break L1;
                    } else {
                      incrementValue$1 = var7;
                      var7++;
                      var9 = this.field_k[incrementValue$1];
                      var6[var8] = dla.a(255, var9) << -1216890460;
                      var5[var8] = dla.a(4080, var9 >> 637544292);
                      var4[var8] = dla.a(4080, var9 >> -184761556);
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (hob.field_d <= var8) {
                      break L1;
                    } else {
                      var9 = this.field_j * var8 / hob.field_d;
                      var10 = this.field_k[var9 + var7];
                      var6[var8] = dla.a(var10, 255) << -2136079612;
                      var5[var8] = dla.a(4080, var10 >> 1838081156);
                      var4[var8] = dla.a(var10 >> -1835064180, 4080);
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
              return var3;
            }
          } else {
            return var3;
          }
        } else {
          this.a(53);
          var14 = this.field_d.a(param1, (byte) -110);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (this.field_d.field_g) {
            if (this.f(0)) {
              L4: {
                var4 = var14[0];
                var5 = var14[1];
                var6 = var14[2];
                stackIn_9_0 = this.field_j;

                if (noa.field_o != this.field_p) {
                  stackIn_10_0 = stackIn_9_0;
                  stackIn_10_1 = param1 * this.field_p / noa.field_o;
                  break L4;
                } else {
                  stackIn_10_0 = stackIn_9_0;
                  stackIn_10_1 = param1;
                  break L4;
                }
              }
              var7 = stackIn_10_0 * stackIn_10_1;
              if (this.field_j != hob.field_d) {
                var8 = 0;
                L5: while (true) {
                  if (hob.field_d > var8) {
                    var9 = this.field_j * var8 / hob.field_d;
                    var10 = this.field_k[var9 + var7];
                    var6[var8] = dla.a(var10, 255) << -2136079612;
                    var5[var8] = dla.a(4080, var10 >> 1838081156);
                    var4[var8] = dla.a(var10 >> -1835064180, 4080);
                    var8++;
                    continue L5;
                  } else {
                    return var3;
                  }
                }
              } else {
                var8 = 0;
                L6: while (true) {
                  if (hob.field_d <= var8) {
                    return var3;
                  } else {
                    incrementValue$2 = var7;
                    var7++;
                    var9 = this.field_k[incrementValue$2];
                    var6[var8] = dla.a(255, var9) << -1216890460;
                    var5[var8] = dla.a(4080, var9 >> 637544292);
                    var4[var8] = dla.a(4080, var9 >> -184761556);
                    var8++;
                    continue L6;
                  }
                }
              }
            } else {
              return var3;
            }
          } else {
            return var3;
          }
        }
    }

    static {
        field_n = new int[8192];
        field_l = new slb();
        field_i = "Left click to fire/recall the grapple";
    }
}
