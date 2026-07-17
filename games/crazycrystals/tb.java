/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tb {
    static dl[] field_e;
    static int field_g;
    bh[] field_h;
    static wb field_b;
    static tj field_d;
    static String field_f;
    static String field_c;
    static int field_a;

    final int a(byte param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param0 > 74) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L2: while (true) {
              if (var8 >= var7) {
                if (var5_int > 0) {
                  stackOut_15_0 = (param1 + -param3 << 8) / var5_int;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                L3: {
                  var9 = param2.charAt(var8);
                  if (var9 != 60) {
                    if (var9 != 62) {
                      L4: {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var8++;
                      continue L2;
                    } else {
                      var6 = 0;
                      break L3;
                    }
                  } else {
                    var6 = 1;
                    break L3;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("tb.N(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 41);
        }
        return stackIn_16_0;
    }

    final static void a(int param0, ng param1) {
        int var2_int = 0;
        try {
            mc.field_q = param1.c((byte) -7) << 5;
            var2_int = param1.h(255);
            jn.field_q = (7 & var2_int) << 18;
            mc.field_q = mc.field_q + (var2_int >> 3);
            jn.field_q = jn.field_q + (param1.c((byte) -7) << 2);
            var2_int = param1.h(255);
            of.field_D = 2064384 & var2_int << 15;
            jn.field_q = jn.field_q + (var2_int >> 6);
            of.field_D = of.field_D + (param1.h(255) << 7);
            var2_int = param1.h(255);
            jd.field_I = var2_int << 16 & 65536;
            of.field_D = of.field_D + (var2_int >> 1);
            jd.field_I = jd.field_I + param1.c((byte) -7);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "tb.F(" + -31416 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, hp param1, byte param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        md var8 = null;
        md var9 = null;
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
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param2 <= -122) {
                break L1;
              } else {
                var7 = null;
                tb.a(114, true, 91, -82, (String) null);
                break L1;
              }
            }
            var8 = tp.field_f;
            var9 = var8;
            var9.d(8, param0);
            var9.field_f = var9.field_f + 1;
            var4 = var9.field_f;
            var9.a(true, 1);
            var9.c(-161478600, param1.field_n);
            var9.c(-161478600, param1.field_k);
            var9.c(-161478600, param1.field_j);
            var9.a(param1.field_l, -16384);
            var9.a(param1.field_f, -16384);
            var9.a(param1.field_o, -16384);
            var9.a(param1.field_h, -16384);
            var9.a(true, param1.field_p.length);
            var5 = 0;
            L2: while (true) {
              if (var5 >= param1.field_p.length) {
                int discarded$1 = var9.b(var4, (byte) -75);
                var9.c((byte) 68, var9.field_f + -var4);
                break L0;
              } else {
                var8.a(param1.field_p[var5], -16384);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("tb.P(").append(param0).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    final int a(int param0) {
        int var2 = 0;
        bh[] var3 = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = CrazyCrystals.field_B;
          var2 = -1;
          if (null == ((tb) this).field_h) {
            break L0;
          } else {
            var3 = ((tb) this).field_h;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(-2288);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        if (param0 >= 78) {
          return var2;
        } else {
          return -8;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, String param4) {
        try {
            if (param1) {
                int discarded$0 = tb.a(false);
            }
            an.field_q.a(param4, -1 + param3, param0, 0, -1);
            an.field_q.a(param4, param3 - -1, param0, 0, -1);
            an.field_q.a(param4, param3, param0 + -1, 0, -1);
            an.field_q.a(param4, param3, 1 + param0, 0, -1);
            an.field_q.a(param4, param3, param0, param2, -1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "tb.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        bh var4 = null;
        int var5 = CrazyCrystals.field_B;
        if (param1 != 62) {
            Object var6 = null;
            tb.a(-55, (hp) null, (byte) 111);
        }
        for (var3 = 0; var3 < ((tb) this).field_h.length; var3++) {
            var4 = ((tb) this).field_h[var3];
            if (param0 < var4.field_e.length) {
                return var3;
            }
            param0 = param0 - (var4.field_e.length - 1);
        }
        return ((tb) this).field_h.length;
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
        if (param0 != -2267) {
            field_f = null;
        }
    }

    final int a(int param0, int param1) {
        bh var5 = null;
        int var6 = CrazyCrystals.field_B;
        bh[] var7 = ((tb) this).field_h;
        bh[] var3 = var7;
        int var4 = 0;
        if (param1 != 1) {
            return -125;
        }
        while (var7.length > var4) {
            var5 = var7[var4];
            if (!(param0 >= var5.field_e.length)) {
                return var5.field_e[param0];
            }
            param0 = param0 - (-1 + var5.field_e.length);
            var4++;
        }
        return 0;
    }

    final int a(byte param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -90) {
            break L0;
          } else {
            var3 = null;
            int discarded$2 = ((tb) this).a((byte) 90, -21, (String) null, 101);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((tb) this).field_h) {
              break L2;
            } else {
              if (((tb) this).field_h.length > 0) {
                stackOut_6_0 = ((tb) this).field_h[((tb) this).field_h.length - 1].field_b + -((tb) this).field_h[0].field_f;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        bh var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (((tb) this).field_h == null) {
            break L0;
          } else {
            if (((tb) this).field_h.length == 0) {
              break L0;
            } else {
              if (param0 < ((tb) this).field_h[0].field_f) {
                break L0;
              } else {
                if (param0 <= ((tb) this).field_h[((tb) this).field_h.length + -1].field_b) {
                  if (1 == ((tb) this).field_h.length) {
                    return ((tb) this).field_h[0].a(-64, param1);
                  } else {
                    L1: {
                      var4 = 0;
                      var5 = 0;
                      if (param2 == 51) {
                        break L1;
                      } else {
                        int discarded$2 = ((tb) this).a(85, 75);
                        break L1;
                      }
                    }
                    L2: while (true) {
                      if (var5 >= ((tb) this).field_h.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((tb) this).field_h[var5];
                          if (param0 < var6.field_f) {
                            break L3;
                          } else {
                            if (var6.field_b < param0) {
                              break L3;
                            } else {
                              var7 = var6.a(param2 + -92, param1);
                              if (var7 != -1) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            }
                          }
                        }
                        var4 = var4 + (var6.field_e.length + -1);
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!ge.b(-42)) {
                L2: {
                  lb.field_l.a(0, be.a(-1013410975, to.field_a, dp.field_h), be.a(-1013410975, qh.field_i, bm.field_h));
                  if (lb.field_l.a(param0)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (lb.field_l.field_c < 0) {
                        break L4;
                      } else {
                        L5: {
                          var3 = sn.field_a[lb.field_l.field_c];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (var3 == 5) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        gn.f(false);
                        break L3;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (am.field_g == 2) {
                      break L3;
                    } else {
                      gn.f(false);
                      break L3;
                    }
                  }
                }
                L6: {
                  if (0 != var3) {
                    break L6;
                  } else {
                    if (am.field_g == 2) {
                      var4 = lo.a((byte) -67) - wm.field_d;
                      var6 = (int)((10999L + -var4) / 1000L);
                      if (0 >= var6) {
                        var3 = 2;
                        a.a(108, 5, true);
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackOut_25_0 = var3;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                L7: {
                  lb.field_l.f(0);
                  if (!lb.field_l.a(true)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (pj.field_q != 13) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "tb.H(" + param0 + 41);
        }
        return stackIn_26_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Player Name: ";
        field_f = "Dig through the earth to let the rocks fall. Take your time; you can support the rocks!";
        field_b = new wb();
    }
}
