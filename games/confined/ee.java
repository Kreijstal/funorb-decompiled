/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ee extends pm {
    static String field_J;
    static int[][] field_H;
    static String field_P;
    static int[][] field_O;
    double field_K;
    double field_G;
    static int[] field_I;
    double field_M;
    boolean field_N;
    static String field_F;
    double field_L;

    private final int a(int param0, double[] param1) {
        double var3_double = 0.0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var3_double = param1[param0];
            var5 = 0;
            var6 = 1;
            L1: while (true) {
              if (var6 >= param1.length) {
                stackIn_7_0 = var5;
                break L0;
              } else {
                if (param1[var6] > var3_double) {
                  var3_double = param1[var6];
                  var5 = var6;
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ee.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean g(byte param0) {
        if (param0 <= 64) {
            this.field_K = -0.4193451825618426;
            return true;
        }
        return true;
    }

    void a(boolean param0, ee param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param1, 1.0, -85);
              if (param0) {
                break L1;
              } else {
                this.field_K = 1.2037409437819238;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ee.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final pm a(double param0, double param1, double param2, boolean param3) {
        Object var9;
        Object var10;
        int var11;
        vb var12;
        pm var13;
        pm var14;
        pm var15;
        Object var16;
        pm var16_ref;
        var16 = null;
        var11 = Confined.field_J ? 1 : 0;
        gl.field_m = param1;
        sf.field_t = 1.7976931348623157e+308;
        ll.field_b = param2;
        il.field_gb = null;
        var12 = this.field_A.field_N;
        om.field_q = param0;
        var12.a((rk) (this), 0);
        var14 = (pm) ((Object) var12.a(0));
        var9 = var14;
        var12.b((rk) (this), 6);
        if (!param3) {
          L0: {
            var13 = (pm) ((Object) var12.b(73));
            var10 = var13;
            if (var13 == null) {
              break L0;
            } else {
              if ((var13.field_D - this.field_D) * (var13.field_D - this.field_D) > sf.field_t) {
                var10 = null;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (var14 == null) {
              break L1;
            } else {
              if (sf.field_t >= (this.field_D - var14.field_D) * (-var14.field_D + this.field_D)) {
                break L1;
              } else {
                var9 = null;
                break L1;
              }
            }
          }
          L2: while (true) {
            L3: {
              if (var9 != null) {
                break L3;
              } else {
                if (var10 == null) {
                  return il.field_gb;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var9 == null) {
                break L4;
              } else {
                L5: {
                  if (var10 == null) {
                    break L5;
                  } else {
                    if (-((pm) (var9)).field_D + this.field_D < ((pm) (var10)).field_D - this.field_D) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                this.b((pm) (var9), -16654);
                var12.a((rk) (var9), 0);
                var16_ref = (pm) ((Object) var12.a(0));
                if (var16_ref == null) {
                  continue L2;
                } else {
                  if ((-var16_ref.field_D + this.field_D) * (this.field_D - var16_ref.field_D) > sf.field_t) {
                    var9 = null;
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
              }
            }
            this.b((pm) (var10), -16654);
            var12.b((rk) (var10), 6);
            var15 = (pm) ((Object) var12.b(-78));
            if (var15 == null) {
              continue L2;
            } else {
              if (sf.field_t < (-this.field_D + var15.field_D) * (-this.field_D + var15.field_D)) {
                var10 = null;
                continue L2;
              } else {
                continue L2;
              }
            }
          }
        } else {
          return (pm) null;
        }
    }

    void a(int param0, int param1) {
        if (param0 != 11878) {
            return;
        }
        this.field_t = this.field_t + this.field_G;
        this.field_N = false;
        this.field_D = this.field_D + this.field_L;
        this.field_E = this.field_E + this.field_K;
    }

    private final void b(pm param0, int param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        pm var13 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == -16654) {
                break L1;
              } else {
                var13 = (pm) null;
                this.b((pm) null, (byte) 14);
                break L1;
              }
            }
            L2: {
              if (param0.field_z) {
                break L2;
              } else {
                if (param0.a(true, (pm) (this))) {
                  var3_double = -this.field_E + param0.field_E;
                  var5 = param0.field_t - this.field_t;
                  var7 = -this.field_D + param0.field_D;
                  var9 = var7 * var7 + (var3_double * var3_double + var5 * var5) + param0.j(-7672);
                  if (var9 < sf.field_t) {
                    var11 = var5 * gl.field_m + om.field_q * var3_double + var7 * ll.field_b;
                    if (var11 < 0.0) {
                      break L2;
                    } else {
                      if (var9 * 0.9698463103929542 > var11 * var11) {
                        break L2;
                      } else {
                        il.field_gb = param0;
                        sf.field_t = var9;
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ee.Q(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public static void k(int param0) {
        field_F = null;
        field_H = (int[][]) null;
        field_O = (int[][]) null;
        field_P = null;
        if (param0 != 2) {
            return;
        }
        field_J = null;
        field_I = null;
    }

    void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        this.field_E = this.field_C * param2 + param3;
        this.field_D = this.field_C * param6 + param5;
        this.field_t = param4 * this.field_C + param1;
        double var14 = -(this.field_G * param4 + param2 * this.field_K + param6 * this.field_L);
        if (!(var14 <= 0.0)) {
            var14 = var14 * 2.0;
            this.field_L = this.field_L + var14 * param6;
            this.field_K = this.field_K + var14 * param2;
            this.field_G = this.field_G + param4 * var14;
            this.a(param0 + -232, var14);
        }
        if (param0 != 256) {
            field_J = (String) null;
        }
    }

    final boolean a(double param0, pm param1, double param2, int param3, double param4) {
        double[] var9 = null;
        RuntimeException var9_ref = null;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double[] var16 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.field_z) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var16 = param1.e(3008);
              var9 = var16;
              var10 = var16[0] - this.field_E;
              var12 = -this.field_t + var16[param3];
              var14 = var16[2] - this.field_D;
              if (param0 * var14 + (param4 * var12 + param2 * var10) < 0.0) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var9_ref);

            stackIn_10_1 = new StringBuilder().append("ee.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    void a(pm param0, int param1) {
        if (param1 >= -81) {
            return;
        }
        try {
            param0.a(true, (ee) (this));
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, double param1) {
        this.a(14170, false, 64.0 * param1);
        int var4 = -30 % ((-16 - param0) / 34);
    }

    void a(int param0, ah param1) {
        try {
            int var3_int = 61 % ((14 - param0) / 53);
            param1.a(true, (ee) (this));
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, vg param1) {
        try {
            if (param0 != -1) {
                this.field_K = -0.3138488451216291;
            }
            param1.a(true, (ee) (this));
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(kh param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(14170, false, param0.field_u);
              if (param1 > 122) {
                break L1;
              } else {
                this.a(-1.6274644343931168, -0.5484616269360983, 0.8200691142147363, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ee.P(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    double[] e(int param0) {
        if (param0 != 3008) {
            pm var3 = (pm) null;
            this.a((pm) null, 22);
        }
        return new double[]{this.field_E, this.field_t, this.field_D, this.field_K, this.field_G, this.field_L};
    }

    abstract double a(int param0, boolean param1, double param2);

    ee(hn param0, double param1, double param2, double param3, double param4, double param5) {
        super(param0, param1, param2, param3, param4);
        this.field_K = 0.0;
        this.field_G = 0.0;
        this.field_L = 0.0;
        try {
            this.field_M = param5;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(pm param0, byte param1) {
        double[] var20 = null;
        double[] var19 = null;
        double[] var18 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        try {
            var20 = param0.e(3008);
            var19 = var20;
            var18 = var19;
            double[] var3 = var18;
            var4 = -this.field_E + var20[0];
            var6 = var20[1] - this.field_t;
            if (param1 != 106) {
                field_H = (int[][]) null;
            }
            var8 = -this.field_D + var20[2];
            var10 = Math.sqrt(var6 * var6 + var4 * var4 + var8 * var8);
            if (0.001 > var10) {
                var10 = 0.001;
            }
            var8 = var8 / var10;
            var4 = var4 / var10;
            var6 = var6 / var10;
            var12 = this.field_K - var20[3];
            var14 = -var20[4] + this.field_G;
            var16 = this.field_L - var20[5];
            var10 = var6 * var14 + var4 * var12 + var8 * var16 + 0.1;
            if (0.1 > var10) {
                var10 = 0.1;
            }
            tf.field_e = var8 * var10 - var16;
            ld.field_f = -var12 + var4 * var10;
            pa.field_a = var6 * var10 - var14;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(cl param0, byte param1) {
        try {
            param0.a(true, (ee) (this));
            int var3_int = -86 / ((param1 - -35) / 60);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(ee param0, double param1, int param2) {
        double var19 = 0.0;
        double var21 = 0.0;
        double var5_double = -this.field_E + param0.field_E;
        double var7 = -this.field_t + param0.field_t;
        double var9 = param0.field_D - this.field_D;
        double var11 = var9 * var9 + (var5_double * var5_double + var7 * var7);
        if (var11 >= 0.000001) {
            var11 = Math.sqrt(var11);
            var5_double = var5_double / var11;
            var7 = var7 / var11;
            var9 = var9 / var11;
        } else {
            var9 = 0.0;
            var5_double = 0.0;
            var7 = 1.0;
        }
        double var13 = (this.field_M * this.field_K + param0.field_M * param0.field_K) / (this.field_M + param0.field_M);
        double var15 = (param0.field_M * param0.field_G + this.field_G * this.field_M) / (param0.field_M + this.field_M);
        this.field_K = this.field_K - var13;
        double var17 = (this.field_L * this.field_M + param0.field_M * param0.field_L) / (this.field_M + param0.field_M);
        this.field_G = this.field_G - var15;
        this.field_L = this.field_L - var17;
        if (param2 >= -51) {
            return;
        }
        try {
            param0.field_G = param0.field_G - var15;
            param0.field_K = param0.field_K - var13;
            param0.field_L = param0.field_L - var17;
            var19 = this.field_K * var5_double + var7 * this.field_G + this.field_L * var9;
            var21 = -(param0.field_G * var7 + param0.field_K * var5_double + var9 * param0.field_L);
            if (!(0.0 >= var19 + var21)) {
                param1 = param1 + 1.0;
                this.field_L = this.field_L - param1 * var19 * var9;
                this.field_K = this.field_K - param1 * var19 * var5_double;
                this.field_G = this.field_G - param1 * var19 * var7;
                param0.field_G = param0.field_G + var7 * (var21 * param1);
                param0.field_L = param0.field_L + var21 * param1 * var9;
                param0.field_K = param0.field_K + var21 * param1 * var5_double;
                this.a(62, var19 * param1);
                param0.a(94, param1 * var21);
            }
            this.field_G = this.field_G + var15;
            this.field_L = this.field_L + var17;
            this.field_K = this.field_K + var13;
            param0.field_L = param0.field_L + var17;
            param0.field_G = param0.field_G + var15;
            param0.field_K = param0.field_K + var13;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(da param0, boolean param1) {
        double stackIn_10_0 = 0.0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var3 = null;
        RuntimeException var3_ref = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        da var26 = null;
        double[] var27 = null;
        double[] var28 = null;
        double[] var29 = null;
        try {
          L0: {
            L1: {
              var29 = new double[12];
              var28 = var29;
              var27 = var28;
              var3 = var27;
              param0.a((byte) 20, var29);
              var4 = var29[9];
              var6 = var29[10];
              var8 = var29[11];
              if (param1) {
                break L1;
              } else {
                var26 = (da) null;
                this.a((da) null, true);
                break L1;
              }
            }
            L2: {
              var10 = ld.field_f;
              var12 = pa.field_a;
              var14 = tf.field_e;
              var16 = Math.sqrt(var14 * var14 + (var12 * var12 + var10 * var10));
              if (0.01 > var16) {
                var16 = 0.01;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var12 = var12 / var16;
              var14 = var14 / var16;
              var10 = var10 / var16;
              var18 = var6 * var14 - var12 * var8;
              var20 = var8 * var10 - var14 * var4;
              var22 = var4 * var12 - var6 * var10;
              var16 = Math.sqrt(var20 * var20 + var18 * var18 + var22 * var22);
              if (var16 >= 0.0001) {
                L4: {
                  if (var16 >= 0.999) {
                    stackIn_10_0 = 0.02;
                    break L4;
                  } else {
                    stackIn_10_0 = Math.asin(var16);
                    break L4;
                  }
                }
                L5: {
                  var24 = stackIn_10_0;
                  var22 = var22 / var16;
                  var20 = var20 / var16;
                  if (0.02 < var24) {
                    var24 = 0.02;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var18 = var18 / var16;
                hd.field_e.a(var24, var22, var18, var20, 7);
                param0.a(-91, hd.field_e);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ee.HA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
    }

    void a(int param0, hf param1) {
        try {
            if (param0 >= -29) {
                this.a(19, 0.6826226506172444, 0.5623858788480278, 0.7056895288642552, -0.8758068971631948, -1.64897438613869, -1.046208021627717);
            }
            param1.a(true, (ee) (this));
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, mb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.a(true, (ee) (this));
              if (param0 == -23154) {
                break L1;
              } else {
                this.field_L = -0.4803378919303036;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ee.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(boolean param0, double param1, int param2) {
        double var5;
        double var7;
        double var9;
        double var11;
        pm var13;
        L0: {
          var5 = ld.field_f;
          var7 = pa.field_a;
          var9 = tf.field_e;
          if (param2 == 27871) {
            break L0;
          } else {
            var13 = (pm) null;
            this.b((pm) null, 22);
            break L0;
          }
        }
        L1: {
          var11 = var9 * var9 + (var7 * var7 + var5 * var5);
          if (var11 < param1 * param1) {
            break L1;
          } else {
            var11 = param1 / Math.sqrt(var11);
            var9 = var9 * var11;
            var5 = var5 * var11;
            var7 = var7 * var11;
            break L1;
          }
        }
        L2: {
          if (param0) {
            var11 = Math.sqrt(this.field_K * this.field_K + this.field_G * this.field_G + this.field_L * this.field_L);
            if (var11 >= 0.001) {
              this.field_G = this.field_G + var7;
              this.field_L = this.field_L + var9;
              this.field_K = this.field_K + var5;
              var11 = var11 / Math.sqrt(this.field_G * this.field_G + this.field_K * this.field_K + this.field_L * this.field_L);
              this.field_L = this.field_L * var11;
              this.field_K = this.field_K * var11;
              this.field_G = this.field_G * var11;
              break L2;
            } else {
              break L2;
            }
          } else {
            this.field_G = this.field_G + var7;
            this.field_L = this.field_L + var9;
            this.field_K = this.field_K + var5;
            break L2;
          }
        }
    }

    final static void a(mi param0, byte param1) {
        nf var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new nf(param0.a(-75, "final_frame.jpg", ""), (java.awt.Component) ((Object) fb.field_b));
            var3 = var2.field_u;
            var4 = var2.field_w;
            mk.b(param1 ^ 198);
            if (param1 != 70) {
                ee.k(-74);
            }
            ad.field_b = new nf(var3, var4 * 3 / 4);
            ad.field_b.d();
            var2.c(0, 0);
            ic.field_a = new nf(var3, var4 - ad.field_b.field_w);
            ic.field_a.d();
            var2.c(0, -ad.field_b.field_w);
            ic.field_a.field_v = ad.field_b.field_w;
            ib.b(false);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(pm[] param0, boolean param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        double[] var5 = null;
        int var6_int = 0;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        double var9_double = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        cl var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22 = 0;
        vb var23 = null;
        Object var24 = null;
        pm var24_ref = null;
        double[] var25 = null;
        Object var26 = null;
        pm var26_ref = null;
        Object var27 = null;
        Object var28 = null;
        double[] var30 = null;
        Object var31 = null;
        pm var31_ref = null;
        Object var32 = null;
        pm var32_ref = null;
        var24 = null;
        var26 = null;
        var31 = null;
        var32 = null;
        var18 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var23 = this.field_A.field_w;
            var4 = 0;
            var30 = new double[param0.length];
            var25 = var30;
            var5 = var25;
            var6_int = 0;
            L1: while (true) {
              if (param0.length <= var6_int) {
                L2: {
                  var23.a((rk) (this), 0);
                  var24_ref = (pm) ((Object) var23.a(0));
                  var6 = var24_ref;
                  var23.b((rk) (this), 6);
                  var26_ref = (pm) ((Object) var23.b(122));
                  var7 = var26_ref;
                  if (var24_ref == null) {
                    break L2;
                  } else {
                    if ((this.field_D - var24_ref.field_D) * (-var24_ref.field_D + this.field_D) <= var30[var4]) {
                      break L2;
                    } else {
                      var6 = null;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var26_ref == null) {
                    break L3;
                  } else {
                    if (var30[var4] >= (var26_ref.field_D - this.field_D) * (-this.field_D + var26_ref.field_D)) {
                      break L3;
                    } else {
                      var7 = null;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (!param1) {
                    break L4;
                  } else {
                    var19 = (cl) null;
                    this.a((cl) null, (byte) -6);
                    break L4;
                  }
                }
                L5: while (true) {
                  L6: {
                    if (var6 != null) {
                      break L6;
                    } else {
                      if (var7 == null) {
                        var8 = 0;
                        var9 = 1;
                        L7: while (true) {
                          if (param0.length <= var9) {
                            break L0;
                          } else {
                            L8: {
                              if (param0[var9] != null) {
                                break L8;
                              } else {
                                incrementValue$0 = var8;
                                var8++;
                                param0[var9] = param0[incrementValue$0];
                                break L8;
                              }
                            }
                            var9++;
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  L9: {
                    if (var6 == null) {
                      break L9;
                    } else {
                      L10: {
                        if (var7 == null) {
                          break L10;
                        } else {
                          if (this.field_D - ((pm) (var6)).field_D >= ((pm) (var7)).field_D - this.field_D) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        var20 = var6;
                        var27 = var20;
                        if (((pm) (var27)).field_z) {
                          break L11;
                        } else {
                          if (!((pm) (var27)).a(true, (pm) (this))) {
                            break L11;
                          } else {
                            var9_double = -this.field_E + ((pm) (var27)).field_E;
                            var11 = ((pm) (var27)).field_t - this.field_t;
                            var13 = -this.field_D + ((pm) (var27)).field_D;
                            var15 = var13 * var13 + (var11 * var11 + var9_double * var9_double);
                            var17 = 0;
                            L12: while (true) {
                              if (param0.length <= var17) {
                                break L11;
                              } else {
                                L13: {
                                  if (null == param0[var17]) {
                                    break L13;
                                  } else {
                                    if (var30[var17] > var15) {
                                      break L13;
                                    } else {
                                      var17++;
                                      continue L12;
                                    }
                                  }
                                }
                                param0[var17] = (pm) (var20);
                                var30[var17] = var15;
                                if (var4 != var17) {
                                  break L11;
                                } else {
                                  var4 = this.a(0, var30);
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                      }
                      var23.a((rk) (var6), 0);
                      var6 = (pm) ((Object) var23.a(0));
                      if (null == var6) {
                        continue L5;
                      } else {
                        if ((this.field_D - ((pm) (var6)).field_D) * (this.field_D - ((pm) (var6)).field_D) <= var30[var4]) {
                          continue L5;
                        } else {
                          var6 = null;
                          continue L5;
                        }
                      }
                    }
                  }
                  L14: {
                    var21 = var7;
                    var28 = var21;
                    if (((pm) (var28)).field_z) {
                      break L14;
                    } else {
                      if (!((pm) (var28)).a(true, (pm) (this))) {
                        break L14;
                      } else {
                        var9_double = ((pm) (var28)).field_E - this.field_E;
                        var11 = ((pm) (var28)).field_t - this.field_t;
                        var13 = -this.field_D + ((pm) (var28)).field_D;
                        var15 = var11 * var11 + var9_double * var9_double + var13 * var13;
                        var22 = 0;
                        var17 = var22;
                        L15: while (true) {
                          if (var22 >= param0.length) {
                            break L14;
                          } else {
                            L16: {
                              if (null == param0[var22]) {
                                break L16;
                              } else {
                                if (var30[var22] <= var15) {
                                  var22++;
                                  continue L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            param0[var22] = (pm) (var21);
                            var30[var22] = var15;
                            if (var22 == var4) {
                              var4 = this.a(0, var30);
                              break L14;
                            } else {
                              var23.b((rk) (var7), 6);
                              var31_ref = (pm) ((Object) var23.b(-71));
                              if (var31_ref == null) {
                                continue L5;
                              } else {
                                if (var30[var4] >= (-this.field_D + var31_ref.field_D) * (-this.field_D + var31_ref.field_D)) {
                                  continue L5;
                                } else {
                                  var7 = null;
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var23.b((rk) (var7), 6);
                  var32_ref = (pm) ((Object) var23.b(-71));
                  if (var32_ref == null) {
                    continue L5;
                  } else {
                    if (var30[var4] >= (-this.field_D + var32_ref.field_D) * (-this.field_D + var32_ref.field_D)) {
                      continue L5;
                    } else {
                      var7 = null;
                      continue L5;
                    }
                  }
                }
              } else {
                param0[var6_int] = null;
                var5[var6_int] = 1.7976931348623157e+308;
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var3);

            stackIn_55_1 = new StringBuilder().append("ee.BA(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L17;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L17;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
    }

    void a(byte param0, sa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.a(true, (ee) (this));
              if (param0 == 9) {
                break L1;
              } else {
                this.field_M = -0.688303011888119;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ee.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    void a(hm param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(14170, false, param0.field_u);
              if (param1) {
                break L1;
              } else {
                this.field_L = -0.23152132377068765;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ee.CA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(ee param0, int param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        sa var17 = null;
        try {
          L0: {
            L1: {
              var3_double = param0.field_E - this.field_E;
              var5 = -this.field_t + param0.field_t;
              var7 = param0.field_D - this.field_D;
              var9 = Math.sqrt(var3_double * var3_double + var5 * var5 + var7 * var7);
              if (var9 >= 0.001) {
                break L1;
              } else {
                var9 = 0.001;
                break L1;
              }
            }
            L2: {
              var5 = var5 / var9;
              var3_double = var3_double / var9;
              var7 = var7 / var9;
              if (param1 == 12) {
                break L2;
              } else {
                var17 = (sa) null;
                this.a((byte) -51, (sa) null);
                break L2;
              }
            }
            L3: {
              var11 = -param0.field_K + this.field_K;
              var13 = -param0.field_G + this.field_G;
              var15 = this.field_L - param0.field_L;
              var9 = var5 * var13 + var3_double * var11 + var7 * var15 + 0.1;
              if (0.1 > var9) {
                var9 = 0.1;
                break L3;
              } else {
                break L3;
              }
            }
            pa.field_a = var9 * var5 - var13;
            ld.field_f = -var11 + var9 * var3_double;
            tf.field_e = var9 * var7 - var15;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ee.U(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    boolean i(int param0) {
        if (param0 != 8) {
            return false;
        }
        return true;
    }

    void a(boolean param0, il param1) {
        try {
            if (param0) {
                this.field_N = true;
            }
            param1.a(true, (ee) (this));
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ee.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_P = "1 metre to Level <%1>";
        field_J = "<col=FFFFFF>Homing missiles:</col> these are much like concussion missiles, except they will automatically select a target and attempt to steer into it. Use <col=FFFFFF><%0></col> to fire. Can be unreliable with small, fast-moving aliens.";
        field_I = new int[]{15, 8, 12, 9};
        field_O = new int[][]{new int[field_I[0]], new int[field_I[1]], new int[field_I[2]], new int[field_I[3]]};
        field_H = new int[][]{new int[field_I[0]], new int[field_I[1]], new int[field_I[2]], new int[field_I[3]]};
    }
}
