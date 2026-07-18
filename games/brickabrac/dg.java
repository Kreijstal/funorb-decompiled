/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg implements ub {
    private dh field_j;
    static String field_k;
    private int field_i;
    private int field_h;
    static jp field_e;
    private int field_c;
    private int field_a;
    static jp field_g;
    static jp[] field_b;
    private int field_f;
    static int field_d;
    private int field_l;

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        field_k = null;
        if (param0 != -51) {
            field_k = null;
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qi var12 = null;
        oc stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        oc stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 instanceof qi) {
                stackOut_3_0 = (oc) param3;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (oc) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (qi) (Object) stackIn_4_0;
              lb.g(param3.field_o + param2, param3.field_w + param4, param3.field_t, param3.field_s, ((dg) this).field_i);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = param3.field_t - 2 * var12.field_L;
            var8 = param2 - (-param3.field_o - var12.field_L);
            var9 = var12.field_M + param3.field_w + param4;
            lb.d(var8, var9, var7 + var8, var9, ((dg) this).field_l);
            var10 = var12.c(false) - 1;
            L3: while (true) {
              if (var10 < 0) {
                L4: {
                  if (param1 == -20618) {
                    break L4;
                  } else {
                    dg.a(46);
                    break L4;
                  }
                }
                L5: {
                  if (((dg) this).field_j == null) {
                    break L5;
                  } else {
                    ((dg) this).field_j.b(var12.field_A, var7 / 2 + var8, var9 + ((dg) this).field_j.field_N - -var12.field_M, ((dg) this).field_h, ((dg) this).field_f);
                    break L5;
                  }
                }
                break L0;
              } else {
                lb.f(var8 - -(var12.a(var10, false) * var7 / var12.h(-119)), var9, ((dg) this).field_c, ((dg) this).field_a);
                var10--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("dg.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ')');
        }
    }

    final static String b() {
        if (null == tb.field_cb) {
            return "";
        }
        int var1 = 0;
        return tb.field_cb;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (0 > ld.field_t) {
          return;
        } else {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (ld.field_t >= 75) {
              break L0;
            } else {
              var5 = (ld.field_t << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (ld.field_t > 200) {
              var5 = (-ld.field_t + 250 << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            fc.a(-90, me.field_b);
            mg.c();
            lb.d();
            jl.b(-120);
            if (256 > var5) {
              lb.d(0, 0, lb.field_c, lb.field_d, 0, 256 + -var5);
              break L2;
            } else {
              break L2;
            }
          }
          sc.b(-96);
          if (ld.field_t < 150) {
            me.field_b.a(var3, var4);
            var6 = -125 + ld.field_t;
            if (var6 > 0) {
              if (var6 < 50) {
                if (20 <= var6) {
                  if (30 <= var6) {
                    L3: {
                      var7 = (-var6 + 50) * 256 / 20;
                      aa.field_b.f(var3, var4, var7);
                      var6 = -140 + ld.field_t;
                      if (var6 > 0) {
                        L4: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L4;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L4;
                          }
                        }
                        pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L5: {
                      aa.field_b.f(var3, var4, 256);
                      var6 = -140 + ld.field_t;
                      if (var6 > 0) {
                        L6: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L6;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L6;
                          }
                        }
                        pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L7: {
                    var7 = var6 * 256 / 20;
                    aa.field_b.f(var3, var4, var7);
                    var6 = -140 + ld.field_t;
                    if (var6 > 0) {
                      L8: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L8;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L8;
                        }
                      }
                      pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  var6 = -140 + ld.field_t;
                  if (var6 > 0) {
                    L10: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L10;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L10;
                      }
                    }
                    pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              }
            } else {
              L11: {
                var6 = -140 + ld.field_t;
                if (var6 > 0) {
                  L12: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L12;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L12;
                    }
                  }
                  pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            }
          } else {
            vq.field_I.b(var3 + 15, 10 + var4, var5);
            var6 = -125 + ld.field_t;
            if (var6 > 0) {
              if (var6 < 50) {
                if (20 <= var6) {
                  if (30 <= var6) {
                    L13: {
                      var7 = (-var6 + 50) * 256 / 20;
                      aa.field_b.f(var3, var4, var7);
                      var6 = -140 + ld.field_t;
                      if (var6 > 0) {
                        L14: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L14;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L14;
                          }
                        }
                        pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    return;
                  } else {
                    L15: {
                      aa.field_b.f(var3, var4, 256);
                      var6 = -140 + ld.field_t;
                      if (var6 > 0) {
                        L16: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L16;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L16;
                          }
                        }
                        pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    var7 = var6 * 256 / 20;
                    aa.field_b.f(var3, var4, var7);
                    var6 = -140 + ld.field_t;
                    if (var6 > 0) {
                      L18: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L18;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L18;
                        }
                      }
                      pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  var6 = -140 + ld.field_t;
                  if (var6 > 0) {
                    L20: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L20;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L20;
                      }
                    }
                    pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return;
              }
            } else {
              L21: {
                var6 = -140 + ld.field_t;
                if (var6 > 0) {
                  L22: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L22;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L22;
                    }
                  }
                  pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 8);
                  break L21;
                } else {
                  break L21;
                }
              }
              return;
            }
          }
        }
    }

    final static om a(int param0, byte param1) {
        return null == pn.field_i ? null : (om) (Object) pn.field_i.a((long)param0, -1);
    }

    final static void a() {
        int discarded$0 = 1;
        bd.a(17);
    }

    final static void a(int param0, int param1, int param2, jp param3, jp param4, int param5, int param6, jp param7, int param8, int param9) {
        RuntimeException var10 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            param4.d((param8 * 5 >> 16) + param2 + (param1 - param4.field_x) / 2, param5);
            param7.c((-param7.field_x + param1) / 2 + (param2 - -(10 * param8 >> 16)), -param7.field_z + 480 + (param9 + param5));
            param3.c((20 * param8 >> 16) + (param1 - param3.field_x) / 2 + param2, -param3.field_z + (480 + param5) - -param9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var10 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var10;
            stackOut_2_1 = new StringBuilder().append("dg.A(").append(-899814320).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param7 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    dg(dh param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((dg) this).field_j = param0;
            ((dg) this).field_h = param1;
            ((dg) this).field_i = param4;
            ((dg) this).field_a = param6;
            ((dg) this).field_f = param2;
            ((dg) this).field_c = param5;
            ((dg) this).field_l = param3;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "dg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Click";
    }
}
