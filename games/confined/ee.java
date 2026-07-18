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
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var3_double = param1[param0];
            var5 = 0;
            var6 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var6 <= ~param1.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = (param1[var6] < var3_double ? -1 : (param1[var6] == var3_double ? 0 : 1));
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 <= 0) {
                          break L4;
                        } else {
                          var3_double = param1[var6];
                          var5 = var6;
                          break L4;
                        }
                      }
                      var6++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = var5;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ee.IA(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final boolean g(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 64) {
                break L1;
              } else {
                ((ee) this).field_K = -0.4193451825618426;
                break L1;
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "ee.G(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    void a(boolean param0, ee param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final pm a(double param0, double param1, double param2, boolean param3) {
        RuntimeException var8 = null;
        vb var8_ref = null;
        pm var9 = null;
        pm var10 = null;
        int var11 = 0;
        Object stackIn_3_0 = null;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        pm stackIn_40_0 = null;
        RuntimeException decompiledCaughtException = null;
        pm stackOut_39_0 = null;
        int stackOut_35_0 = 0;
        int stackOut_28_0 = 0;
        Object stackOut_2_0 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            gl.field_m = param1;
            sf.field_t = 1.7976931348623157e+308;
            ll.field_b = param2;
            il.field_gb = null;
            var8_ref = ((ee) this).field_A.field_N;
            om.field_q = param0;
            rk discarded$4 = var8_ref.a((rk) this, 0);
            var9 = (pm) (Object) var8_ref.a(0);
            rk discarded$5 = var8_ref.b((rk) this, 6);
            if (!param3) {
              L1: {
                var10 = (pm) (Object) var8_ref.b(73);
                if (var10 == null) {
                  break L1;
                } else {
                  if ((var10.field_D - ((ee) this).field_D) * (var10.field_D - ((ee) this).field_D) > sf.field_t) {
                    var10 = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (null == var9) {
                  break L2;
                } else {
                  if (sf.field_t >= (((ee) this).field_D - var9.field_D) * (-var9.field_D + ((ee) this).field_D)) {
                    break L2;
                  } else {
                    var9 = null;
                    break L2;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (null != var9) {
                    break L4;
                  } else {
                    if (null == var10) {
                      stackOut_39_0 = il.field_gb;
                      stackIn_40_0 = stackOut_39_0;
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (var9 == null) {
                      break L6;
                    } else {
                      L7: {
                        if (var10 == null) {
                          break L7;
                        } else {
                          if (-var9.field_D + ((ee) this).field_D < var10.field_D - ((ee) this).field_D) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.b(var9, -16654);
                      rk discarded$6 = var8_ref.a((rk) (Object) var9, 0);
                      var9 = (pm) (Object) var8_ref.a(0);
                      if (null == var9) {
                        continue L3;
                      } else {
                        stackOut_35_0 = ((-var9.field_D + ((ee) this).field_D) * (((ee) this).field_D - var9.field_D) < sf.field_t ? -1 : ((-var9.field_D + ((ee) this).field_D) * (((ee) this).field_D - var9.field_D) == sf.field_t ? 0 : 1));
                        stackIn_36_0 = stackOut_35_0;
                        break L5;
                      }
                    }
                  }
                  this.b(var10, -16654);
                  rk discarded$7 = var8_ref.b((rk) (Object) var10, 6);
                  var10 = (pm) (Object) var8_ref.b(-78);
                  if (var10 == null) {
                    continue L3;
                  } else {
                    stackOut_28_0 = (sf.field_t < (-((ee) this).field_D + var10.field_D) * (-((ee) this).field_D + var10.field_D) ? -1 : (sf.field_t == (-((ee) this).field_D + var10.field_D) * (-((ee) this).field_D + var10.field_D) ? 0 : 1));
                    stackIn_36_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (var11 != 0) {
                      break L5;
                    } else {
                      if (stackIn_29_0 < 0) {
                        var10 = null;
                        continue L3;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
                if (stackIn_36_0 > 0) {
                  var9 = null;
                  continue L3;
                } else {
                  continue L3;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (pm) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var8, "ee.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_40_0;
    }

    void a(int param0, int param1) {
        if (param0 != 11878) {
            return;
        }
        try {
            ((ee) this).field_t = ((ee) this).field_t + ((ee) this).field_G;
            ((ee) this).field_N = false;
            ((ee) this).field_D = ((ee) this).field_D + ((ee) this).field_L;
            ((ee) this).field_E = ((ee) this).field_E + ((ee) this).field_K;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.S(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(pm param0, int param1) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -16654) {
                break L1;
              } else {
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
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("ee.Q(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
    }

    public static void k(int param0) {
        field_F = null;
        field_H = null;
        field_O = null;
        field_P = null;
        if (param0 != 2) {
            return;
        }
        try {
            field_J = null;
            field_I = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.O(" + param0 + ')');
        }
    }

    void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        double var14_double = 0.0;
        RuntimeException var14 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((ee) this).field_E = ((ee) this).field_C * param2 + param3;
              ((ee) this).field_D = ((ee) this).field_C * param6 + param5;
              ((ee) this).field_t = param4 * ((ee) this).field_C + param1;
              var14_double = -(((ee) this).field_G * param4 + param2 * ((ee) this).field_K + param6 * ((ee) this).field_L);
              if (var14_double > 0.0) {
                var14_double = var14_double * 2.0;
                ((ee) this).field_L = ((ee) this).field_L + var14_double * param6;
                ((ee) this).field_K = ((ee) this).field_K + var14_double * param2;
                ((ee) this).field_G = ((ee) this).field_G + param4 * var14_double;
                ((ee) this).a(param0 + -232, var14_double);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 256) {
                break L2;
              } else {
                field_J = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var14, "ee.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean a(double param0, pm param1, double param2, int param3, double param4) {
        double[] var9 = null;
        RuntimeException var9_ref = null;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1.field_z) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var9 = param1.e(3008);
              var10 = var9[0] - ((ee) this).field_E;
              var12 = -((ee) this).field_t + var9[param3];
              var14 = var9[2] - ((ee) this).field_D;
              if (param0 * var14 + (param4 * var12 + param2 * var10) < 0.0) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var9_ref;
            stackOut_12_1 = new StringBuilder().append("ee.V(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_11_0 != 0;
    }

    void a(pm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 < -81) {
              param0.a(true, (ee) this);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ee.D(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    void a(int param0, double param1) {
        try {
            int var4_int = -30 % ((-16 - param0) / 34);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ee.AA(" + param0 + ',' + param1 + ')');
        }
    }

    void a(int param0, ah param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 61 % ((14 - param0) / 53);
            param1.a(true, (ee) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ee.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    void a(int param0, vg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((ee) this).field_K = -0.3138488451216291;
                break L1;
              }
            }
            param1.a(true, (ee) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ee.DA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(kh param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 122) {
                break L1;
              } else {
                pm discarded$3 = ((ee) this).a(-1.6274644343931168, -0.5484616269360983, 0.8200691142147363, true);
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    double[] e(int param0) {
        RuntimeException var2 = null;
        double[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        double[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 3008) {
                break L1;
              } else {
                ((ee) this).a((pm) null, 22);
                break L1;
              }
            }
            stackOut_3_0 = new double[]{((ee) this).field_E, ((ee) this).field_t, ((ee) this).field_D, ((ee) this).field_K, ((ee) this).field_G, ((ee) this).field_L};
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "ee.R(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    abstract double a(int param0, boolean param1, double param2);

    ee(hn param0, double param1, double param2, double param3, double param4, double param5) {
        super(param0, param1, param2, param3, param4);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((ee) this).field_K = 0.0;
        ((ee) this).field_G = 0.0;
        ((ee) this).field_L = 0.0;
        try {
          L0: {
            ((ee) this).field_M = param5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ee.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3 = param0.e(3008);
              var4 = -((ee) this).field_E + var3[0];
              var6 = var3[1] - ((ee) this).field_t;
              if (param1 == 106) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            L2: {
              var8 = -((ee) this).field_D + var3[2];
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
              var12 = ((ee) this).field_K - var3[3];
              var14 = -var3[4] + ((ee) this).field_G;
              var16 = ((ee) this).field_L - var3[5];
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
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("ee.GA(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    void a(cl param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param0.a(true, (ee) this);
            var3_int = -86 / ((param1 - -35) / 60);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ee.I(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var5_double = -((ee) this).field_E + param0.field_E;
                var7 = -((ee) this).field_t + param0.field_t;
                var9 = param0.field_D - ((ee) this).field_D;
                var11 = var9 * var9 + (var5_double * var5_double + var7 * var7);
                if (var11 < 0.000001) {
                  break L2;
                } else {
                  var11 = Math.sqrt(var11);
                  var5_double = var5_double / var11;
                  var7 = var7 / var11;
                  var9 = var9 / var11;
                  if (!Confined.field_J) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var9 = 0.0;
              var5_double = 0.0;
              var7 = 1.0;
              break L1;
            }
            var13 = (((ee) this).field_M * ((ee) this).field_K + param0.field_M * param0.field_K) / (((ee) this).field_M + param0.field_M);
            var15 = (param0.field_M * param0.field_G + ((ee) this).field_G * ((ee) this).field_M) / (param0.field_M + ((ee) this).field_M);
            ((ee) this).field_K = ((ee) this).field_K - var13;
            var17 = (((ee) this).field_L * ((ee) this).field_M + param0.field_M * param0.field_L) / (((ee) this).field_M + param0.field_M);
            ((ee) this).field_G = ((ee) this).field_G - var15;
            ((ee) this).field_L = ((ee) this).field_L - var17;
            if (param2 < -51) {
              L3: {
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
                  break L3;
                } else {
                  break L3;
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
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ee.KA(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
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
        double stackIn_14_0 = 0.0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_13_0 = 0.0;
        double stackOut_11_0 = 0.0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              var3 = new double[12];
              param0.a((byte) 20, var3);
              var4 = var3[9];
              var6 = var3[10];
              var8 = var3[11];
              if (param1) {
                break L1;
              } else {
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
                    stackOut_13_0 = 0.02;
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    stackOut_11_0 = Math.asin(var16);
                    stackIn_14_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var24 = stackIn_14_0;
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
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("ee.HA(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
    }

    void a(int param0, hf param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -29) {
                break L1;
              } else {
                ((ee) this).a(19, 0.6826226506172444, 0.5623858788480278, 0.7056895288642552, -0.8758068971631948, -1.64897438613869, -1.046208021627717);
                break L1;
              }
            }
            param1.a(true, (ee) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ee.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    void a(int param0, mb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(boolean param0, double param1, int param2) {
        double var5_double = 0.0;
        RuntimeException var5 = null;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_double = ld.field_f;
              var7 = pa.field_a;
              var9 = tf.field_e;
              if (param2 == 27871) {
                break L1;
              } else {
                this.b((pm) null, 22);
                break L1;
              }
            }
            L2: {
              var11 = var9 * var9 + (var7 * var7 + var5_double * var5_double);
              if (var11 < param1 * param1) {
                break L2;
              } else {
                var11 = param1 / Math.sqrt(var11);
                var9 = var9 * var11;
                var5_double = var5_double * var11;
                var7 = var7 * var11;
                break L2;
              }
            }
            L3: {
              L4: {
                if (param0) {
                  break L4;
                } else {
                  ((ee) this).field_G = ((ee) this).field_G + var7;
                  ((ee) this).field_L = ((ee) this).field_L + var9;
                  ((ee) this).field_K = ((ee) this).field_K + var5_double;
                  if (!Confined.field_J) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var11 = Math.sqrt(((ee) this).field_K * ((ee) this).field_K + ((ee) this).field_G * ((ee) this).field_G + ((ee) this).field_L * ((ee) this).field_L);
              if (var11 >= 0.001) {
                ((ee) this).field_G = ((ee) this).field_G + var7;
                ((ee) this).field_L = ((ee) this).field_L + var9;
                ((ee) this).field_K = ((ee) this).field_K + var5_double;
                var11 = var11 / Math.sqrt(((ee) this).field_G * ((ee) this).field_G + ((ee) this).field_K * ((ee) this).field_K + ((ee) this).field_L * ((ee) this).field_L);
                ((ee) this).field_L = ((ee) this).field_L * var11;
                ((ee) this).field_K = ((ee) this).field_K * var11;
                ((ee) this).field_G = ((ee) this).field_G * var11;
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var5, "ee.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(mi param0, byte param1) {
        RuntimeException runtimeException = null;
        nf var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2 = new nf(param0.a(-75, "final_frame.jpg", ""), (java.awt.Component) (Object) fb.field_b);
              var3 = var2.field_u;
              var4 = var2.field_w;
              mk.b(param1 ^ 198);
              if (param1 == 70) {
                break L1;
              } else {
                ee.k(-74);
                break L1;
              }
            }
            ad.field_b = new nf(var3, var4 * 3 / 4);
            ad.field_b.d();
            var2.c(0, 0);
            ic.field_a = new nf(var3, var4 - ad.field_b.field_w);
            ic.field_a.d();
            var2.c(0, -ad.field_b.field_w);
            ic.field_a.field_v = ad.field_b.field_w;
            ib.b(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("ee.W(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
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
        Object stackIn_39_0 = null;
        pm stackIn_39_1 = null;
        Object stackIn_53_0 = null;
        pm stackIn_53_1 = null;
        Object stackIn_66_0 = null;
        pm stackIn_66_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        Object stackOut_38_0 = null;
        pm stackOut_38_1 = null;
        Object stackOut_52_0 = null;
        pm stackOut_52_1 = null;
        Object stackOut_65_0 = null;
        pm stackOut_65_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = Confined.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_ref = ((ee) this).field_A.field_w;
                        var4 = 0;
                        var5 = new double[param0.length];
                        var6_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (~param0.length >= ~var6_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0[var6_int] = null;
                        var5[var6_int] = 1.7976931348623157e+308;
                        var6_int++;
                        if (var18 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var18 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        rk discarded$5 = var3_ref.a((rk) this, 0);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = (pm) (Object) var3_ref.a(0);
                        rk discarded$6 = var3_ref.b((rk) this, 6);
                        var7 = (pm) (Object) var3_ref.b(122);
                        if (var6 == null) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((((ee) this).field_D - var6.field_D) * (-var6.field_D + ((ee) this).field_D) <= var5[var4]) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = null;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 == null) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5[var4] >= (var7.field_D - ((ee) this).field_D) * (-((ee) this).field_D + var7.field_D)) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!param1) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((ee) this).a((cl) null, (byte) -6);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var6 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (null == var7) {
                            statePc = 85;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var6 == null) {
                            statePc = 59;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var7 == null) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((ee) this).field_D - var6.field_D >= var7.field_D - ((ee) this).field_D) {
                            statePc = 59;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var8_ref_pm = var6;
                        if (var8_ref_pm.field_z) {
                            statePc = 52;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!var8_ref_pm.a(true, (pm) this)) {
                            statePc = 52;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9_double = -((ee) this).field_E + var8_ref_pm.field_E;
                        var11 = var8_ref_pm.field_t - ((ee) this).field_t;
                        var13 = -((ee) this).field_D + var8_ref_pm.field_D;
                        var15 = var13 * var13 + (var11 * var11 + var9_double * var9_double);
                        var17 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (param0.length <= var17) {
                            statePc = 52;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = null;
                        stackOut_38_1 = param0[var17];
                        stackIn_53_0 = stackOut_38_0;
                        stackIn_53_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (var18 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 == (Object) (Object) stackIn_39_1) {
                            statePc = 47;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5[var17] > var15) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        param0[var17] = var8_ref_pm;
                        var5[var17] = var15;
                        if (var4 != var17) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var4 = this.a(0, var5);
                        if (var18 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var17++;
                        if (var18 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        rk discarded$7 = var3_ref.a((rk) (Object) var6, 0);
                        var6 = (pm) (Object) var3_ref.a(0);
                        stackOut_52_0 = null;
                        stackOut_52_1 = (pm) var6;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 == (Object) (Object) stackIn_53_1) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((((ee) this).field_D - var6.field_D) * (((ee) this).field_D - var6.field_D) <= var5[var4]) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var6 = null;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var18 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var8_ref_pm = var7;
                        if (var8_ref_pm.field_z) {
                            statePc = 79;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (!var8_ref_pm.a(true, (pm) this)) {
                            statePc = 79;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var9_double = var8_ref_pm.field_E - ((ee) this).field_E;
                        var11 = var8_ref_pm.field_t - ((ee) this).field_t;
                        var13 = -((ee) this).field_D + var8_ref_pm.field_D;
                        var15 = var11 * var11 + var9_double * var9_double + var13 * var13;
                        var17 = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var17 >= param0.length) {
                            statePc = 79;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = null;
                        stackOut_65_1 = param0[var17];
                        stackIn_53_0 = stackOut_65_0;
                        stackIn_53_1 = stackOut_65_1;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        if (var18 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 == (Object) (Object) stackIn_66_1) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var5[var17] <= var15) {
                            statePc = 76;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        param0[var17] = var8_ref_pm;
                        var5[var17] = var15;
                        if (var17 == var4) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var4 = this.a(0, var5);
                        if (var18 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var17++;
                        if (var18 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        rk discarded$8 = var3_ref.b((rk) (Object) var7, 6);
                        var7 = (pm) (Object) var3_ref.b(-71);
                        if (var7 == null) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var5[var4] >= (-((ee) this).field_D + var7.field_D) * (-((ee) this).field_D + var7.field_D)) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var7 = null;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var18 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var8 = 0;
                        var9 = 1;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (param0.length <= var9) {
                            statePc = 100;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var18 != 0) {
                            statePc = 100;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (param0[var9] != null) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        int incrementValue$9 = var8;
                        var8++;
                        param0[var9] = param0[incrementValue$9];
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var9++;
                        if (var18 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    var3 = (RuntimeException) (Object) caughtException;
                    stackOut_95_0 = (RuntimeException) var3;
                    stackOut_95_1 = new StringBuilder().append("ee.BA(");
                    stackIn_98_0 = stackOut_95_0;
                    stackIn_98_1 = stackOut_95_1;
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    if (param0 == null) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
                    stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
                    stackOut_96_2 = "{...}";
                    stackIn_99_0 = stackOut_96_0;
                    stackIn_99_1 = stackOut_96_1;
                    stackIn_99_2 = stackOut_96_2;
                    statePc = 99;
                    continue stateLoop;
                }
                case 98: {
                    stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
                    stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
                    stackOut_98_2 = "null";
                    stackIn_99_0 = stackOut_98_0;
                    stackIn_99_1 = stackOut_98_1;
                    stackIn_99_2 = stackOut_98_2;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    throw sd.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + ',' + param1 + ')');
                }
                case 100: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(byte param0, sa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    void a(hm param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ee.U(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
    }

    boolean i(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 8) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "ee.JA(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    void a(boolean param0, il param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((ee) this).field_N = true;
                break L1;
              }
            }
            param1.a(true, (ee) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ee.L(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
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
