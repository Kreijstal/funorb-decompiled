/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static wk field_a;
    static String field_c;
    private v field_b;

    private final boolean a(byte param0, int param1) {
        this.field_b.a(1, param1);
        int var3 = this.field_b.field_e[0];
        int var4 = this.field_b.field_e[1];
        if (param0 > -77) {
            jd var7 = (jd) null;
            this.a(-96, -101, (jd) null);
        }
        int var5 = so.field_b.field_a;
        int var6 = so.field_b.field_g;
        if (var3 > var5) {
            return false;
        }
        if ((var3 ^ -1) > 179) {
            return false;
        }
        if (!(var6 >= var4)) {
            return false;
        }
        if (var4 < -10) {
            return false;
        }
        return true;
    }

    final static int b(int param0) {
        if (param0 != 1) {
            return 66;
        }
        return kl.field_a.field_p[1];
    }

    final boolean a(int param0, int param1, int param2, int param3, jd param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (param1 == -35) {
                  break L1;
                } else {
                  this.field_b = (v) null;
                  break L1;
                }
              }
              L2: {
                if (-1 >= param3) {
                  break L2;
                } else {
                  param4.field_fb = param3;
                  break L2;
                }
              }
              L3: {
                if (null != param4.field_x) {
                  break L3;
                } else {
                  L4: {
                    var6_int = param4.field_N;
                    if (-35 != (var6_int ^ -1)) {
                      break L4;
                    } else {
                      if (param4.field_W) {
                        var6_int = 75;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param4.field_x = new hr(param4.field_R, var6_int, param4.field_fb);
                  break L3;
                }
              }
              if (param4.field_x == null) {
                stackIn_20_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L5: {
                  if (param4.field_z == -1) {
                    param4.field_z = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackIn_18_0 = param4.field_x.a(param2, param4.field_U, param0, param3, param4.field_z, false);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("eo.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final void a(int param0, byte param1, int param2, ne[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = param2 * param0;
            var7 = 0;
            L1: while (true) {
              if (var5_int <= var7) {
                L2: {
                  if (param1 > 91) {
                    break L2;
                  } else {
                    field_c = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var6 = param3[var7].field_c;
                  if (var6 != null) {
                    if (var6.field_u) {
                      break L3;
                    } else {
                      this.a(79, var7, var6);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("eo.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, ru param3, int param4) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param2 <= -55) {
              var5_int = 0;
              param4 = param4 + param3.field_d;
              param0 = param0 + param3.field_i;
              var6 = 0;
              L1: while (true) {
                if (param3.field_h <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = 0;
                  L2: while (true) {
                    if (param3.field_e <= var7) {
                      var6++;
                      continue L1;
                    } else {
                      L3: {
                        var8 = param3.field_k[var5_int];
                        var5_int++;
                        if (-1 > (var8 ^ -1)) {
                          var9 = -3;
                          L4: while (true) {
                            if (4 <= var9) {
                              break L3;
                            } else {
                              var10 = -3;
                              L5: while (true) {
                                if (var10 >= 4) {
                                  var9++;
                                  continue L4;
                                } else {
                                  L6: {
                                    L7: {
                                      if (0 <= (var7 - -var9 ^ -1)) {
                                        break L7;
                                      } else {
                                        if (var9 + var7 >= param3.field_e) {
                                          break L7;
                                        } else {
                                          if (-1 >= var6 - -var10) {
                                            break L7;
                                          } else {
                                            if (param3.field_h <= var10 + var6) {
                                              break L7;
                                            } else {
                                              if (param3.field_k[(var10 + var6) * param3.field_e + (var7 + var9)] != 0) {
                                                break L6;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    qn.g(var7 + (param0 - -var9), var10 + param4 - -var6, param1, var9 * var9 - -(var10 * var10));
                                    break L6;
                                  }
                                  var10++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("eo.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            field_c = (String) null;
        }
    }

    private final void a(int param0, int param1, jd param2) {
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param2.field_U = this.a((byte) -81, param1);
                if (param0 > 42) {
                  break L1;
                } else {
                  var5 = (String) null;
                  eo.a(false, (kd) null, (String) null, (String) null, -91, (byte) -105, (String) null);
                  break L1;
                }
              }
              L2: {
                if (!param2.field_U) {
                  if (!param2.field_u) {
                    param2.field_x = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  this.a(param1, -35, -1, -1, param2);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("eo.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, kd param1, String param2, String param3, int param4, byte param5, String param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        oe var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (nb.field_i == oh.field_L) {
              L1: {
                var9 = new oe(rl.field_C, param1);
                rl.field_C.a(var9, 0);
                if (!ig.a(-8327)) {
                  L2: {
                    cd.field_e = param3;
                    p.field_a = null;
                    ue.field_a = param6;
                    nm.field_z = param4;
                    oh.field_L = du.field_d;
                    if (!param0) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                  ub.field_e = stackIn_8_0 != 0;
                  qk.field_b = param2;
                  break L1;
                } else {
                  var9.k((byte) -119);
                  break L1;
                }
              }
              var8 = 114 / ((21 - param5) / 52);
              stackIn_10_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var7);

            stackIn_13_1 = new StringBuilder().append("eo.G(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    eo(v param0) {
        j discarded$0 = null;
        try {
            discarded$0 = new j(240, param0);
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "eo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
