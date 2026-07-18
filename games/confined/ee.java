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
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var3_double = param1[0];
            var5 = 0;
            var6 = 1;
            L1: while (true) {
              if (var6 >= param1.length) {
                stackOut_6_0 = var5;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  if (param1[var6] <= var3_double) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ee.IA(").append(0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean g(byte param0) {
        if (param0 <= 64) {
            ((ee) this).field_K = -0.4193451825618426;
            return true;
        }
        return true;
    }

    void a(boolean param0, ee param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ee) this).a(param1, 1.0, -85);
              if (param0) {
                break L1;
              } else {
                ((ee) this).field_K = 1.2037409437819238;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ee.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final pm a(double param0, double param1, double param2, boolean param3) {
        vb var8 = null;
        pm var9 = null;
        pm var10 = null;
        int var11 = 0;
        var11 = Confined.field_J ? 1 : 0;
        gl.field_m = param1;
        sf.field_t = 1.7976931348623157e+308;
        ll.field_b = param2;
        il.field_gb = null;
        var8 = ((ee) this).field_A.field_N;
        om.field_q = param0;
        rk discarded$4 = var8.a((rk) this, 0);
        var9 = (pm) (Object) var8.a(0);
        rk discarded$5 = var8.b((rk) this, 6);
        if (!param3) {
          L0: {
            var10 = (pm) (Object) var8.b(73);
            if (var10 == null) {
              break L0;
            } else {
              if ((var10.field_D - ((ee) this).field_D) * (var10.field_D - ((ee) this).field_D) > sf.field_t) {
                var10 = null;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (var9 == null) {
              break L1;
            } else {
              if (sf.field_t >= (((ee) this).field_D - var9.field_D) * (-var9.field_D + ((ee) this).field_D)) {
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
                    if (-var9.field_D + ((ee) this).field_D < var10.field_D - ((ee) this).field_D) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                this.b(var9, -16654);
                rk discarded$6 = var8.a((rk) (Object) var9, 0);
                var9 = (pm) (Object) var8.a(0);
                if (var9 == null) {
                  continue L2;
                } else {
                  if ((-var9.field_D + ((ee) this).field_D) * (((ee) this).field_D - var9.field_D) > sf.field_t) {
                    var9 = null;
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
              }
            }
            this.b(var10, -16654);
            rk discarded$7 = var8.b((rk) (Object) var10, 6);
            var10 = (pm) (Object) var8.b(-78);
            if (var10 == null) {
              continue L2;
            } else {
              if (sf.field_t < (-((ee) this).field_D + var10.field_D) * (-((ee) this).field_D + var10.field_D)) {
                var10 = null;
                continue L2;
              } else {
                continue L2;
              }
            }
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1) {
        if (param0 != 11878) {
            return;
        }
        ((ee) this).field_t = ((ee) this).field_t + ((ee) this).field_G;
        ((ee) this).field_N = false;
        ((ee) this).field_D = ((ee) this).field_D + ((ee) this).field_L;
        ((ee) this).field_E = ((ee) this).field_E + ((ee) this).field_K;
    }

    private final void b(pm param0, int param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        Object var13 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -16654) {
                break L1;
              } else {
                var13 = null;
                ((ee) this).b((pm) null, (byte) 14);
                break L1;
              }
            }
            L2: {
              if (param0.field_z) {
                break L2;
              } else {
                if (param0.a(true, (pm) this)) {
                  var3_double = -((ee) this).field_E + param0.field_E;
                  var5 = param0.field_t - ((ee) this).field_t;
                  var7 = -((ee) this).field_D + param0.field_D;
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ee.Q(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public static void k() {
        field_F = null;
        field_H = null;
        field_O = null;
        field_P = null;
        field_J = null;
        field_I = null;
    }

    void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        ((ee) this).field_E = ((ee) this).field_C * param2 + param3;
        ((ee) this).field_D = ((ee) this).field_C * param6 + param5;
        ((ee) this).field_t = param4 * ((ee) this).field_C + param1;
        double var14 = -(((ee) this).field_G * param4 + param2 * ((ee) this).field_K + param6 * ((ee) this).field_L);
        if (!(var14 <= 0.0)) {
            var14 = var14 * 2.0;
            ((ee) this).field_L = ((ee) this).field_L + var14 * param6;
            ((ee) this).field_K = ((ee) this).field_K + var14 * param2;
            ((ee) this).field_G = ((ee) this).field_G + param4 * var14;
            ((ee) this).a(param0 + -232, var14);
        }
        if (param0 != 256) {
            field_J = null;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1.field_z) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var16 = param1.e(3008);
              var9 = var16;
              var10 = var16[0] - ((ee) this).field_E;
              var12 = -((ee) this).field_t + var16[param3];
              var14 = var16[2] - ((ee) this).field_D;
              if (param0 * var14 + (param4 * var12 + param2 * var10) < 0.0) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
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
            stackOut_8_0 = (RuntimeException) var9_ref;
            stackOut_8_1 = new StringBuilder().append("ee.V(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void a(pm param0, int param1) {
        if (param1 >= -81) {
            return;
        }
        try {
            param0.a(true, (ee) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, double param1) {
        int var4 = -30 % ((-16 - param0) / 34);
    }

    void a(int param0, ah param1) {
        try {
            int var3_int = 61 % ((14 - param0) / 53);
            param1.a(true, (ee) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, vg param1) {
        try {
            if (param0 != -1) {
                ((ee) this).field_K = -0.3138488451216291;
            }
            param1.a(true, (ee) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(kh param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 122) {
                break L1;
              } else {
                pm discarded$2 = ((ee) this).a(-1.6274644343931168, -0.5484616269360983, 0.8200691142147363, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ee.P(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    double[] e(int param0) {
        if (param0 != 3008) {
            Object var3 = null;
            ((ee) this).a((pm) null, 22);
        }
        return new double[]{((ee) this).field_E, ((ee) this).field_t, ((ee) this).field_D, ((ee) this).field_K, ((ee) this).field_G, ((ee) this).field_L};
    }

    abstract double a(int param0, boolean param1, double param2);

    ee(hn param0, double param1, double param2, double param3, double param4, double param5) {
        super(param0, param1, param2, param3, param4);
        ((ee) this).field_K = 0.0;
        ((ee) this).field_G = 0.0;
        ((ee) this).field_L = 0.0;
        try {
            ((ee) this).field_M = param5;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(pm param0, byte param1) {
        double[] var3 = null;
        RuntimeException var3_ref = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double[] var18 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var18 = param0.e(3008);
              var3 = var18;
              var4 = -((ee) this).field_E + var18[0];
              var6 = var18[1] - ((ee) this).field_t;
              if (param1 == 106) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            L2: {
              var8 = -((ee) this).field_D + var18[2];
              var10 = Math.sqrt(var6 * var6 + var4 * var4 + var8 * var8);
              if (0.001 <= var10) {
                break L2;
              } else {
                var10 = 0.001;
                break L2;
              }
            }
            L3: {
              var8 = var8 / var10;
              var4 = var4 / var10;
              var6 = var6 / var10;
              var12 = ((ee) this).field_K - var18[3];
              var14 = -var18[4] + ((ee) this).field_G;
              var16 = ((ee) this).field_L - var18[5];
              var10 = var6 * var14 + var4 * var12 + var8 * var16 + 0.1;
              if (0.1 <= var10) {
                break L3;
              } else {
                var10 = 0.1;
                break L3;
              }
            }
            tf.field_e = var8 * var10 - var16;
            ld.field_f = -var12 + var4 * var10;
            pa.field_a = var6 * var10 - var14;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ee.GA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    void a(cl param0, byte param1) {
        try {
            param0.a(true, (ee) this);
            int var3_int = -86 / ((param1 - -35) / 60);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(ee param0, double param1, int param2) {
        double var5_double = 0.0;
        RuntimeException var5 = null;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var5_double = -((ee) this).field_E + param0.field_E;
              var7 = -((ee) this).field_t + param0.field_t;
              var9 = param0.field_D - ((ee) this).field_D;
              var11 = var9 * var9 + (var5_double * var5_double + var7 * var7);
              if (var11 < 0.000001) {
                var9 = 0.0;
                var5_double = 0.0;
                var7 = 1.0;
                break L1;
              } else {
                var11 = Math.sqrt(var11);
                var5_double = var5_double / var11;
                var7 = var7 / var11;
                var9 = var9 / var11;
                break L1;
              }
            }
            var13 = (((ee) this).field_M * ((ee) this).field_K + param0.field_M * param0.field_K) / (((ee) this).field_M + param0.field_M);
            var15 = (param0.field_M * param0.field_G + ((ee) this).field_G * ((ee) this).field_M) / (param0.field_M + ((ee) this).field_M);
            ((ee) this).field_K = ((ee) this).field_K - var13;
            var17 = (((ee) this).field_L * ((ee) this).field_M + param0.field_M * param0.field_L) / (((ee) this).field_M + param0.field_M);
            ((ee) this).field_G = ((ee) this).field_G - var15;
            ((ee) this).field_L = ((ee) this).field_L - var17;
            if (param2 < -51) {
              L2: {
                param0.field_G = param0.field_G - var15;
                param0.field_K = param0.field_K - var13;
                param0.field_L = param0.field_L - var17;
                var19 = ((ee) this).field_K * var5_double + var7 * ((ee) this).field_G + ((ee) this).field_L * var9;
                var21 = -(param0.field_G * var7 + param0.field_K * var5_double + var9 * param0.field_L);
                if (0.0 < var19 + var21) {
                  param1 = param1 + 1.0;
                  ((ee) this).field_L = ((ee) this).field_L - param1 * var19 * var9;
                  ((ee) this).field_K = ((ee) this).field_K - param1 * var19 * var5_double;
                  ((ee) this).field_G = ((ee) this).field_G - param1 * var19 * var7;
                  param0.field_G = param0.field_G + var7 * (var21 * param1);
                  param0.field_L = param0.field_L + var21 * param1 * var9;
                  param0.field_K = param0.field_K + var21 * param1 * var5_double;
                  ((ee) this).a(62, var19 * param1);
                  param0.a(94, param1 * var21);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((ee) this).field_G = ((ee) this).field_G + var15;
              ((ee) this).field_L = ((ee) this).field_L + var17;
              ((ee) this).field_K = ((ee) this).field_K + var13;
              param0.field_L = param0.field_L + var17;
              param0.field_G = param0.field_G + var15;
              param0.field_K = param0.field_K + var13;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ee.KA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(da param0, boolean param1) {
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
        Object var26 = null;
        double[] var27 = null;
        double stackIn_10_0 = 0.0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_9_0 = 0.0;
        double stackOut_8_0 = 0.0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var27 = new double[12];
              var3 = var27;
              param0.a((byte) 20, var27);
              var4 = var27[9];
              var6 = var27[10];
              var8 = var27[11];
              if (param1) {
                break L1;
              } else {
                var26 = null;
                ((ee) this).a((da) null, true);
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
                    stackOut_9_0 = 0.02;
                    stackIn_10_0 = stackOut_9_0;
                    break L4;
                  } else {
                    stackOut_8_0 = Math.asin(var16);
                    stackIn_10_0 = stackOut_8_0;
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
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ee.HA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
    }

    void a(int param0, hf param1) {
        try {
            if (param0 >= -29) {
                ((ee) this).a(19, 0.6826226506172444, 0.5623858788480278, 0.7056895288642552, -0.8758068971631948, -1.64897438613869, -1.046208021627717);
            }
            param1.a(true, (ee) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, mb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.a(true, (ee) this);
              if (param0 == -23154) {
                break L1;
              } else {
                ((ee) this).field_L = -0.4803378919303036;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ee.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(boolean param0, double param1, int param2) {
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        Object var13 = null;
        L0: {
          var5 = ld.field_f;
          var7 = pa.field_a;
          var9 = tf.field_e;
          if (param2 == 27871) {
            break L0;
          } else {
            var13 = null;
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
            var11 = Math.sqrt(((ee) this).field_K * ((ee) this).field_K + ((ee) this).field_G * ((ee) this).field_G + ((ee) this).field_L * ((ee) this).field_L);
            if (var11 >= 0.001) {
              ((ee) this).field_G = ((ee) this).field_G + var7;
              ((ee) this).field_L = ((ee) this).field_L + var9;
              ((ee) this).field_K = ((ee) this).field_K + var5;
              var11 = var11 / Math.sqrt(((ee) this).field_G * ((ee) this).field_G + ((ee) this).field_K * ((ee) this).field_K + ((ee) this).field_L * ((ee) this).field_L);
              ((ee) this).field_L = ((ee) this).field_L * var11;
              ((ee) this).field_K = ((ee) this).field_K * var11;
              ((ee) this).field_G = ((ee) this).field_G * var11;
              break L2;
            } else {
              break L2;
            }
          } else {
            ((ee) this).field_G = ((ee) this).field_G + var7;
            ((ee) this).field_L = ((ee) this).field_L + var9;
            ((ee) this).field_K = ((ee) this).field_K + var5;
            break L2;
          }
        }
    }

    final static void a(mi param0) {
        nf var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new nf(param0.a(-75, "final_frame.jpg", ""), (java.awt.Component) (Object) fb.field_b);
            var3 = var2.field_u;
            var4 = var2.field_w;
            int discarded$0 = 128;
            mk.b();
            ad.field_b = new nf(var3, var4 * 3 / 4);
            ad.field_b.d();
            var2.c(0, 0);
            ic.field_a = new nf(var3, var4 - ad.field_b.field_w);
            ic.field_a.d();
            var2.c(0, -ad.field_b.field_w);
            ic.field_a.field_v = ad.field_b.field_w;
            int discarded$1 = 0;
            ib.b();
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.W(" + (param0 != null ? "{...}" : "null") + ',' + 70 + ')');
        }
    }

    final void a(pm[] param0, boolean param1) {
        RuntimeException var3 = null;
        vb var3_ref = null;
        int var4 = 0;
        double[] var5 = null;
        int var6_int = 0;
        pm var6 = null;
        pm var7 = null;
        pm var8_ref_pm = null;
        int var8 = 0;
        int var9 = 0;
        double var9_double = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        Object var19 = null;
        int var20 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var18 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var3_ref = ((ee) this).field_A.field_w;
            var4 = 0;
            var5 = new double[param0.length];
            var6_int = 0;
            L1: while (true) {
              if (param0.length <= var6_int) {
                L2: {
                  rk discarded$6 = var3_ref.a((rk) this, 0);
                  var6 = (pm) (Object) var3_ref.a(0);
                  rk discarded$7 = var3_ref.b((rk) this, 6);
                  var7 = (pm) (Object) var3_ref.b(122);
                  if (var6 == null) {
                    break L2;
                  } else {
                    if ((((ee) this).field_D - var6.field_D) * (-var6.field_D + ((ee) this).field_D) <= var5[var4]) {
                      break L2;
                    } else {
                      var6 = null;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var7 == null) {
                    break L3;
                  } else {
                    if (var5[var4] >= (var7.field_D - ((ee) this).field_D) * (-((ee) this).field_D + var7.field_D)) {
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
                    var19 = null;
                    ((ee) this).a((cl) null, (byte) -6);
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
                                int incrementValue$8 = var8;
                                var8++;
                                param0[var9] = param0[incrementValue$8];
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
                          if (((ee) this).field_D - var6.field_D >= var7.field_D - ((ee) this).field_D) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        var8_ref_pm = var6;
                        if (var8_ref_pm.field_z) {
                          break L11;
                        } else {
                          if (!var8_ref_pm.a(true, (pm) this)) {
                            break L11;
                          } else {
                            var9_double = -((ee) this).field_E + var8_ref_pm.field_E;
                            var11 = var8_ref_pm.field_t - ((ee) this).field_t;
                            var13 = -((ee) this).field_D + var8_ref_pm.field_D;
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
                                    if (var5[var17] > var15) {
                                      break L13;
                                    } else {
                                      var17++;
                                      continue L12;
                                    }
                                  }
                                }
                                param0[var17] = var8_ref_pm;
                                var5[var17] = var15;
                                if (var4 != var17) {
                                  break L11;
                                } else {
                                  var4 = this.a(0, var5);
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                      }
                      rk discarded$9 = var3_ref.a((rk) (Object) var6, 0);
                      var6 = (pm) (Object) var3_ref.a(0);
                      if (var6 == null) {
                        continue L5;
                      } else {
                        if ((((ee) this).field_D - var6.field_D) * (((ee) this).field_D - var6.field_D) <= var5[var4]) {
                          continue L5;
                        } else {
                          var6 = null;
                          continue L5;
                        }
                      }
                    }
                  }
                  L14: {
                    var8_ref_pm = var7;
                    if (var8_ref_pm.field_z) {
                      break L14;
                    } else {
                      if (!var8_ref_pm.a(true, (pm) this)) {
                        break L14;
                      } else {
                        var9_double = var8_ref_pm.field_E - ((ee) this).field_E;
                        var11 = var8_ref_pm.field_t - ((ee) this).field_t;
                        var13 = -((ee) this).field_D + var8_ref_pm.field_D;
                        var15 = var11 * var11 + var9_double * var9_double + var13 * var13;
                        var20 = 0;
                        var17 = var20;
                        L15: while (true) {
                          if (var20 >= param0.length) {
                            break L14;
                          } else {
                            L16: {
                              if (null == param0[var20]) {
                                break L16;
                              } else {
                                if (var5[var20] <= var15) {
                                  var20++;
                                  continue L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            param0[var20] = var8_ref_pm;
                            var5[var20] = var15;
                            if (var20 == var4) {
                              var4 = this.a(0, var5);
                              break L14;
                            } else {
                              rk discarded$10 = var3_ref.b((rk) (Object) var7, 6);
                              var7 = (pm) (Object) var3_ref.b(-71);
                              if (var7 == null) {
                                continue L5;
                              } else {
                                if (var5[var4] >= (-((ee) this).field_D + var7.field_D) * (-((ee) this).field_D + var7.field_D)) {
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
                  rk discarded$11 = var3_ref.b((rk) (Object) var7, 6);
                  var7 = (pm) (Object) var3_ref.b(-71);
                  if (var7 == null) {
                    continue L5;
                  } else {
                    if (var5[var4] >= (-((ee) this).field_D + var7.field_D) * (-((ee) this).field_D + var7.field_D)) {
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
            stackOut_53_0 = (RuntimeException) var3;
            stackOut_53_1 = new StringBuilder().append("ee.BA(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L17;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L17;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ',' + param1 + ')');
        }
    }

    void a(byte param0, sa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.a(true, (ee) this);
              if (param0 == 9) {
                break L1;
              } else {
                ((ee) this).field_M = -0.688303011888119;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ee.M(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    void a(hm param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((ee) this).field_L = -0.23152132377068765;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ee.CA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(ee param0, int param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        Object var17 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3_double = param0.field_E - ((ee) this).field_E;
              var5 = -((ee) this).field_t + param0.field_t;
              var7 = param0.field_D - ((ee) this).field_D;
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
                var17 = null;
                ((ee) this).a((byte) -51, (sa) null);
                break L2;
              }
            }
            L3: {
              var11 = -param0.field_K + ((ee) this).field_K;
              var13 = -param0.field_G + ((ee) this).field_G;
              var15 = ((ee) this).field_L - param0.field_L;
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ee.U(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
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
                ((ee) this).field_N = true;
            }
            param1.a(true, (ee) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "1 metre to Level <%1>";
        field_J = "<col=FFFFFF>Homing missiles:</col> these are much like concussion missiles, except they will automatically select a target and attempt to steer into it. Use <col=FFFFFF><%0></col> to fire. Can be unreliable with small, fast-moving aliens.";
        field_I = new int[]{15, 8, 12, 9};
        field_O = new int[][]{new int[field_I[0]], new int[field_I[1]], new int[field_I[2]], new int[field_I[3]]};
        field_H = new int[][]{new int[field_I[0]], new int[field_I[1]], new int[field_I[2]], new int[field_I[3]]};
    }
}
