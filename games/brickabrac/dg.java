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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qi var12 = null;
        oc stackIn_3_0 = null;
        oc stackOut_2_0;
        Object stackOut_1_0;
        L0: {
          var11 = BrickABrac.field_J ? 1 : 0;
          if (param3 instanceof qi) {
            stackOut_2_0 = (oc) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (oc) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (qi) (Object) stackIn_3_0;
          lb.g(param3.field_o + param2, param3.field_w + param4, param3.field_t, param3.field_s, ((dg) this).field_i);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = param3.field_t - 2 * var12.field_L;
        var8 = param2 - (-param3.field_o - var12.field_L);
        var9 = var12.field_M + param3.field_w + param4;
        lb.d(var8, var9, var7 + var8, var9, ((dg) this).field_l);
        var10 = var12.c(false) - 1;
        L2: while (true) {
          if (-1 < (var10 ^ -1)) {
            if (param1 == -20618) {
              if (((dg) this).field_j != null) {
                ((dg) this).field_j.b(var12.field_A, var7 / 2 + var8, var9 + ((dg) this).field_j.field_N - -var12.field_M, ((dg) this).field_h, ((dg) this).field_f);
                return;
              } else {
                return;
              }
            } else {
              dg.a(46);
              if (((dg) this).field_j == null) {
                return;
              } else {
                ((dg) this).field_j.b(var12.field_A, var7 / 2 + var8, var9 + ((dg) this).field_j.field_N - -var12.field_M, ((dg) this).field_h, ((dg) this).field_f);
                return;
              }
            }
          } else {
            lb.f(var8 - -(var12.a(var10, false) * var7 / var12.h(-119)), var9, ((dg) this).field_c, ((dg) this).field_a);
            var10--;
            continue L2;
          }
        }
    }

    final static String b(int param0) {
        if (null == tb.field_cb) {
            return "";
        }
        int var1 = 90 % ((-28 - param0) / 48);
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
            var3 = param2 + -135;
            var4 = param1 + -35;
            var5 = 256;
            if ((ld.field_t ^ -1) <= -76) {
              break L0;
            } else {
              var5 = (ld.field_t << -493454584) / 75;
              break L0;
            }
          }
          L1: {
            if (ld.field_t > 200) {
              var5 = (-ld.field_t + 250 << -877390008) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            fc.a(-90, me.field_b);
            mg.c();
            if (!param0) {
              lb.d();
              break L2;
            } else {
              dg.a(-70);
              break L2;
            }
          }
          L3: {
            lb.d();
            lb.d();
            jl.b(-120);
            if (256 > var5) {
              lb.d(0, 0, lb.field_c, lb.field_d, 0, 256 + -var5);
              break L3;
            } else {
              break L3;
            }
          }
          sc.b(-96);
          if ((ld.field_t ^ -1) > -151) {
            me.field_b.a(var3, var4);
            var6 = -125 + ld.field_t;
            if (var6 < -1) {
              if (var6 > -51) {
                if (20 <= var6) {
                  if (30 > var6) {
                    L4: {
                      aa.field_b.f(var3, var4, 256);
                      var6 = -140 + ld.field_t;
                      if (-1 > (var6 ^ -1)) {
                        L5: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L5;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L5;
                          }
                        }
                        pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return;
                  } else {
                    L6: {
                      var7 = (-var6 + 50) * 256 / 20;
                      aa.field_b.f(var3, var4, var7);
                      var6 = -140 + ld.field_t;
                      if (-1 > (var6 ^ -1)) {
                        L7: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L7;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L7;
                          }
                        }
                        pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    var7 = var6 * 256 / 20;
                    aa.field_b.f(var3, var4, var7);
                    var6 = -140 + ld.field_t;
                    if (-1 > (var6 ^ -1)) {
                      L9: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L9;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L9;
                        }
                      }
                      pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  var6 = -140 + ld.field_t;
                  if (-1 < var6) {
                    L11: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L11;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L11;
                      }
                    }
                    pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                return;
              }
            } else {
              L12: {
                var6 = -140 + ld.field_t;
                if (-1 < var6) {
                  L13: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L13;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L13;
                    }
                  }
                  pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            }
          } else {
            vq.field_I.b(var3 + 15, 10 + var4, var5);
            var6 = -125 + ld.field_t;
            if (var6 < -1) {
              if (var6 > -51) {
                if (20 <= var6) {
                  if (30 > var6) {
                    L14: {
                      aa.field_b.f(var3, var4, 256);
                      var6 = -140 + ld.field_t;
                      if (-1 > (var6 ^ -1)) {
                        L15: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L15;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L15;
                          }
                        }
                        pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    return;
                  } else {
                    L16: {
                      var7 = (-var6 + 50) * 256 / 20;
                      aa.field_b.f(var3, var4, var7);
                      var6 = -140 + ld.field_t;
                      if (-1 > (var6 ^ -1)) {
                        L17: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L17;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L17;
                          }
                        }
                        pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L18: {
                    var7 = var6 * 256 / 20;
                    aa.field_b.f(var3, var4, var7);
                    var6 = -140 + ld.field_t;
                    if (-1 > (var6 ^ -1)) {
                      L19: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L19;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L19;
                        }
                      }
                      pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  var6 = -140 + ld.field_t;
                  if (-1 < var6) {
                    L21: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L21;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L21;
                      }
                    }
                    pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                return;
              }
            } else {
              L22: {
                var6 = -140 + ld.field_t;
                if (-1 < var6) {
                  L23: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L23;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L23;
                    }
                  }
                  pi.field_t.b(15 + var3, 10 + var4, var5 * var7 >> 739786120);
                  break L22;
                } else {
                  break L22;
                }
              }
              return;
            }
          }
        }
    }

    final static om a(int param0, byte param1) {
        tk stackIn_4_0 = null;
        tk stackOut_3_0;
        Object stackOut_2_0;
        if (param1 != 61) {
          return null;
        } else {
          L0: {
            if (null != pn.field_i) {
              stackOut_3_0 = pn.field_i.a((long)param0, -1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (tk) (Object) stackOut_2_0;
              break L0;
            }
          }
          return (om) (Object) stackIn_4_0;
        }
    }

    final static void a(boolean param0) {
        bd.a(17, param0);
    }

    final static void a(int param0, int param1, int param2, jp param3, jp param4, int param5, int param6, jp param7, int param8, int param9) {
        param4.d((param8 * 5 >> -1408853168) + param2 + (param1 - param4.field_x) / 2, param5);
        param7.c((-param7.field_x + param1) / 2 + (param2 - -(10 * param8 >> -899814320)), -param7.field_z + 480 + (param9 + param5));
        param3.c((20 * param8 >> 1889200048) + (param1 - param3.field_x) / 2 + param2, -param3.field_z + (480 + param5) - -param9);
        if (param0 != -899814320) {
            dg.a(-80);
        }
    }

    dg(dh param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((dg) this).field_j = param0;
        ((dg) this).field_h = param1;
        ((dg) this).field_i = param4;
        ((dg) this).field_a = param6;
        ((dg) this).field_f = param2;
        ((dg) this).field_c = param5;
        ((dg) this).field_l = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Click";
    }
}
