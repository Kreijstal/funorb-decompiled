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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param0 > 74) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L2: while (true) {
              if (var8 >= var7) {
                if (-1 > (var5_int ^ -1)) {
                  stackIn_20_0 = (param1 + -param3 << 95664328) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_22_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param2.charAt(var8);
                  if (var9 != 60) {
                    if (var9 != 62) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var8++;
                        continue L2;
                      }
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
          L4: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("tb.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return stackIn_22_0;
        }
    }

    final static void a(int param0, ng param1) {
        int var2_int = 0;
        try {
            mc.field_q = param1.c((byte) -7) << 1680553477;
            if (param0 != -31416) {
                field_d = (tj) null;
            }
            var2_int = param1.h(255);
            jn.field_q = (7 & var2_int) << -2110429390;
            mc.field_q = mc.field_q + (var2_int >> 44083395);
            jn.field_q = jn.field_q + (param1.c((byte) -7) << -363648894);
            var2_int = param1.h(255);
            of.field_D = 2064384 & var2_int << -591551121;
            jn.field_q = jn.field_q + (var2_int >> 1284655814);
            of.field_D = of.field_D + (param1.h(255) << 1653045831);
            var2_int = param1.h(param0 ^ -31305);
            jd.field_I = var2_int << -998740464 & 65536;
            of.field_D = of.field_D + (var2_int >> -233736991);
            jd.field_I = jd.field_I + param1.c((byte) -7);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "tb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, hp param1, byte param2) {
        md var8 = null;
        md var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        try {
            if (param2 > -122) {
                String var7 = (String) null;
                tb.a(114, true, 91, -82, (String) null);
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
            for (var5 = 0; var5 < param1.field_p.length; var5++) {
                var8.a(param1.field_p[var5], -16384);
            }
            var9.b(var4, (byte) -75);
            var9.c((byte) 68, var9.field_f + -var4);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "tb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0) {
        int var2;
        bh[] var3;
        int var4;
        bh var5;
        int var7;
        int var6;
        L0: {
          var7 = CrazyCrystals.field_B;
          var2 = -1;
          if (null == this.field_h) {
            break L0;
          } else {
            var3 = this.field_h;
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
                tb.a(false);
            }
            an.field_q.a(param4, -1 + param3, param0, 0, -1);
            an.field_q.a(param4, param3 - -1, param0, 0, -1);
            an.field_q.a(param4, param3, param0 + -1, 0, -1);
            an.field_q.a(param4, param3, 1 + param0, 0, -1);
            an.field_q.a(param4, param3, param0, param2, -1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "tb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        bh var4 = null;
        int var5 = CrazyCrystals.field_B;
        if (param1 != 62) {
            hp var6 = (hp) null;
            tb.a(-55, (hp) null, (byte) 111);
        }
        for (var3 = 0; var3 < this.field_h.length; var3++) {
            var4 = this.field_h[var3];
            if (param0 < var4.field_e.length) {
                return var3;
            }
            param0 = param0 - (var4.field_e.length - 1);
        }
        return this.field_h.length;
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
        if (param0 != -2267) {
            field_f = (String) null;
        }
    }

    final int a(int param0, int param1) {
        bh var5 = null;
        int var6 = CrazyCrystals.field_B;
        bh[] var7 = this.field_h;
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
        String var3;
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == -90) {
            break L0;
          } else {
            var3 = (String) null;
            this.a((byte) 90, -21, (String) null, 101);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_h) {
              break L2;
            } else {
              if ((this.field_h.length ^ -1) < -1) {
                stackIn_7_0 = this.field_h[this.field_h.length - 1].field_b + -this.field_h[0].field_f;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        bh var6;
        int var7;
        int var8;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (this.field_h == null) {
            break L0;
          } else {
            if (this.field_h.length == 0) {
              break L0;
            } else {
              if (param0 < this.field_h[0].field_f) {
                break L0;
              } else {
                if (param0 <= this.field_h[this.field_h.length + -1].field_b) {
                  if (1 == this.field_h.length) {
                    return this.field_h[0].a(-64, param1);
                  } else {
                    L1: {
                      var4 = 0;
                      var5 = 0;
                      if (param2 == 51) {
                        break L1;
                      } else {
                        this.a(85, 75);
                        break L1;
                      }
                    }
                    L2: while (true) {
                      if (var5 >= this.field_h.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = this.field_h[var5];
                          if (param0 < var6.field_f) {
                            break L3;
                          } else {
                            if (var6.field_b < param0) {
                              break L3;
                            } else {
                              var7 = var6.a(param2 + -92, param1);
                              if (0 != (var7 ^ -1)) {
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
        int var2 = 0;
        int var3 = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        long var4 = 0L;
        int var6 = 0;
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
                      if (-1 < (lb.field_l.field_c ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          var3 = sn.field_a[lb.field_l.field_c];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if ((var3 ^ -1) == -6) {
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
                    if ((am.field_g ^ -1) == -3) {
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
                stackIn_26_0 = var3;
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
                if ((pj.field_q ^ -1) != -14) {
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
          throw dn.a((Throwable) ((Object) var1), "tb.H(" + param0 + ')');
        }
        return stackIn_26_0;
    }

    static {
        field_c = "Player Name: ";
        field_f = "Dig through the earth to let the rocks fall. Take your time; you can support the rocks!";
        field_b = new wb();
    }
}
