/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends oh {
    static int field_h;
    static bi field_k;
    static long field_l;
    static String field_i;
    byte[] field_j;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= param6) {
                break L1;
              } else {
                var10 = param6;
                param6 = param2;
                param2 = var10;
                var10 = param4;
                param4 = param7;
                param7 = var10;
                param1 = param8 + -param1;
                break L1;
              }
            }
            L2: {
              var9_int = 0;
              if (gf.field_i > param2) {
                break L2;
              } else {
                if (param6 <= gf.field_l) {
                  L3: {
                    if (param4 > param7) {
                      var10 = param6;
                      param6 = param2;
                      param2 = var10;
                      var10 = param4;
                      param4 = param7;
                      param7 = var10;
                      param1 = param8 + -param1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (param7 < gf.field_a) {
                      break L4;
                    } else {
                      if (param4 > gf.field_f) {
                        break L4;
                      } else {
                        L5: {
                          var9_int = var9_int + param1 / param8;
                          param1 = param1 % param8;
                          if ((param1 ^ -1) <= -1) {
                            break L5;
                          } else {
                            param1 = param1 + param8;
                            var9_int--;
                            break L5;
                          }
                        }
                        var10 = (int)Math.sqrt((double)((-param6 + param2) * (param2 - param6) + (param7 - param4) * (param7 + -param4))) - -1;
                        if (param0 > 27) {
                          var11 = param6;
                          var12 = param4;
                          L6: while (true) {
                            if (param1 >= var10) {
                              L7: {
                                stackOut_24_0 = var11;
                                stackOut_24_1 = var12;
                                stackOut_24_2 = param2;
                                stackOut_24_3 = param7;
                                stackIn_26_0 = stackOut_24_0;
                                stackIn_26_1 = stackOut_24_1;
                                stackIn_26_2 = stackOut_24_2;
                                stackIn_26_3 = stackOut_24_3;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                stackIn_25_2 = stackOut_24_2;
                                stackIn_25_3 = stackOut_24_3;
                                if ((var9_int & 1) == 0) {
                                  stackOut_26_0 = stackIn_26_0;
                                  stackOut_26_1 = stackIn_26_1;
                                  stackOut_26_2 = stackIn_26_2;
                                  stackOut_26_3 = stackIn_26_3;
                                  stackOut_26_4 = param3;
                                  stackIn_27_0 = stackOut_26_0;
                                  stackIn_27_1 = stackOut_26_1;
                                  stackIn_27_2 = stackOut_26_2;
                                  stackIn_27_3 = stackOut_26_3;
                                  stackIn_27_4 = stackOut_26_4;
                                  break L7;
                                } else {
                                  stackOut_25_0 = stackIn_25_0;
                                  stackOut_25_1 = stackIn_25_1;
                                  stackOut_25_2 = stackIn_25_2;
                                  stackOut_25_3 = stackIn_25_3;
                                  stackOut_25_4 = param5;
                                  stackIn_27_0 = stackOut_25_0;
                                  stackIn_27_1 = stackOut_25_1;
                                  stackIn_27_2 = stackOut_25_2;
                                  stackIn_27_3 = stackOut_25_3;
                                  stackIn_27_4 = stackOut_25_4;
                                  break L7;
                                }
                              }
                              gf.g(stackIn_27_0, stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4);
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              L8: {
                                var13 = (param2 + -param6) * param1 / var10 + param6;
                                var14 = param4 - -((-param4 + param7) * param1 / var10);
                                stackOut_20_0 = var11;
                                stackOut_20_1 = var12;
                                stackOut_20_2 = var13;
                                stackOut_20_3 = var14;
                                stackIn_22_0 = stackOut_20_0;
                                stackIn_22_1 = stackOut_20_1;
                                stackIn_22_2 = stackOut_20_2;
                                stackIn_22_3 = stackOut_20_3;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                stackIn_21_2 = stackOut_20_2;
                                stackIn_21_3 = stackOut_20_3;
                                if ((var9_int & 1) != 0) {
                                  stackOut_22_0 = stackIn_22_0;
                                  stackOut_22_1 = stackIn_22_1;
                                  stackOut_22_2 = stackIn_22_2;
                                  stackOut_22_3 = stackIn_22_3;
                                  stackOut_22_4 = param5;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackIn_23_1 = stackOut_22_1;
                                  stackIn_23_2 = stackOut_22_2;
                                  stackIn_23_3 = stackOut_22_3;
                                  stackIn_23_4 = stackOut_22_4;
                                  break L8;
                                } else {
                                  stackOut_21_0 = stackIn_21_0;
                                  stackOut_21_1 = stackIn_21_1;
                                  stackOut_21_2 = stackIn_21_2;
                                  stackOut_21_3 = stackIn_21_3;
                                  stackOut_21_4 = param3;
                                  stackIn_23_0 = stackOut_21_0;
                                  stackIn_23_1 = stackOut_21_1;
                                  stackIn_23_2 = stackOut_21_2;
                                  stackIn_23_3 = stackOut_21_3;
                                  stackIn_23_4 = stackOut_21_4;
                                  break L8;
                                }
                              }
                              gf.g(stackIn_23_0, stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4);
                              var12 = var14;
                              var11 = var13;
                              var9_int++;
                              param1 = param1 + param8;
                              continue L6;
                            }
                          }
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var9), "be.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(qr param0, int param1, qr param2, int param3, int param4, byte param5, int param6, qr param7, byte[] param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param5 == -122) {
              sb.field_h = param6;
              ks.field_e = param8;
              ec.field_p = -1L;
              em.field_k = param8.length;
              he.field_p = null;
              np.field_a = null;
              id.field_c = new byte[(sb.field_h - -7) / 8];
              k.field_i = false;
              var10_int = 0;
              var11 = 0;
              L1: while (true) {
                if (var11 >= ks.field_e.length) {
                  L2: {
                    var10_int = (7 + var10_int) / 8;
                    qj.field_f = new byte[var10_int];
                    if (null == param7.field_M) {
                      param7.field_M = new pf();
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    gr.field_p = param7.field_M;
                    gr.field_p.a(0);
                    ShatteredPlansClient.field_H = new in(param1);
                    a.field_j = -1;
                    bh.field_h = -1;
                    ah.field_X = 0;
                    kf.field_g = 0;
                    if (param0.field_M == null) {
                      param0.field_M = new pf();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    kj.field_a = param0.field_M;
                    kj.field_a.a(0);
                    ea.field_b = new in(param3);
                    if (param2.field_M == null) {
                      param2.field_M = new pf();
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  uo.field_a = param2.field_M;
                  uo.field_a.a(0);
                  qp.field_w = new in(param4);
                  sf.field_e = 0L;
                  ks.field_i = param9;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var10_int = var10_int + (ks.field_e[var11] & 255);
                  var11++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var10);
            stackOut_17_1 = new StringBuilder().append("be.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param7 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param8 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 < 67) {
            be.a((byte) -90, 116, 111, -79, -48, 35, -128, -23, -56);
        }
        field_i = null;
    }

    be(byte[] param0) {
        try {
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Total number of players in game will not exceed 6.";
    }
}
