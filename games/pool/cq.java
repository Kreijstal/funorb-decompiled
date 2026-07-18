/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    static String field_e;
    static int field_a;
    static dd[] field_b;
    static vh field_d;
    static ko field_g;
    static int field_c;
    static String field_f;

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -90) {
                break L1;
              } else {
                cq.a(-5);
                break L1;
              }
            }
            field_g = null;
            field_d = null;
            field_f = null;
            field_b = null;
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "cq.C(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        try {
            ig.field_j.a(param0, (byte) 118);
            if (param1 < 27) {
                field_a = -63;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cq.G(" + param0 + ',' + param1 + ')');
        }
    }

    static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = param0 ^ param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "cq.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static dd[] a(int param0, int param1, int param2, int param3) {
        dd[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        dd[] stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        dd[] stackOut_10_0 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              var4 = new dd[9];
              var4[0] = ad.a(param2, param0, 7);
              var5 = 1;
              if (param1 == 4578) {
                break L1;
              } else {
                cq.a(true, -89);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 >= 9) {
                    break L4;
                  } else {
                    var4[var5] = var4[0];
                    var5++;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var4[4] = ad.a(param3, 64, param1 + -4571);
                break L3;
              }
              stackOut_10_0 = (dd[]) var4;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4_ref, "cq.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        try {
          L0: {
            if (param8 == 0) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var11 = lh.a(param8, (byte) -75, (long)(param0 + ((param1 << -490510896) + -param3)));
                var12 = lh.a(param8, (byte) -81, (long)(-param3 + (-(param1 << 412671888) + param0)));
                if (0 >= var11) {
                  break L1;
                } else {
                  if (-param6 + 65536 < var11) {
                    break L1;
                  } else {
                    if (~var12 < ~var11) {
                      L2: {
                        var10_int = param5 - -aj.a(var11, false, param4);
                        if (param7 < param9) {
                          if (param7 > var10_int) {
                            break L1;
                          } else {
                            if (~var10_int < ~param9) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          if (~var10_int > ~param9) {
                            break L1;
                          } else {
                            if (var10_int > param7) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      stackOut_27_0 = param6 + var11;
                      stackIn_28_0 = stackOut_27_0;
                      return stackIn_28_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                if (var12 <= 0) {
                  break L3;
                } else {
                  if (~(65536 + -param6) > ~var12) {
                    break L3;
                  } else {
                    L4: {
                      var10_int = param5 - -aj.a(var12, false, param4);
                      if (param7 >= param9) {
                        if (~var10_int > ~param9) {
                          break L3;
                        } else {
                          if (param7 < var10_int) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        if (~var10_int > ~param7) {
                          break L3;
                        } else {
                          if (param9 < var10_int) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackOut_46_0 = var12 + param6;
                    stackIn_47_0 = stackOut_46_0;
                    return stackIn_47_0;
                  }
                }
              }
              if (param2 <= -61) {
                stackOut_51_0 = -1;
                stackIn_52_0 = stackOut_51_0;
                break L0;
              } else {
                stackOut_49_0 = -43;
                stackIn_50_0 = stackOut_49_0;
                return stackIn_50_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var10, "cq.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        return stackIn_52_0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            al.i(-27397);
            so.field_g = new hq[3];
            so.field_g[0] = new hq(jj.field_Q, -1, 3);
            so.field_g[0].field_d.b((byte) 110, (ma) (Object) new bk(fn.field_Ob, 100, 0));
            so.field_g[0].field_d.b((byte) -114, (ma) (Object) new bk(tj.field_eb, 50, 1, so.field_g[0].field_d));
            so.field_g[0].field_d.b((byte) -80, (ma) (Object) new bk(ie.field_i, 3, 2, so.field_g[0].field_d));
            so.field_g[0].field_d.b((byte) -50, (ma) (Object) new bk(je.field_a, 1, 3, so.field_g[0].field_d));
            so.field_g[0].field_d.b((byte) 91, (ma) (Object) new bk(en.field_d, 300, 4, so.field_g[0].field_d));
            so.field_g[0].field_d.b((byte) 88, (ma) (Object) new bk(na.field_b, 150, 5, so.field_g[0].field_d));
            so.field_g[0].field_d.b((byte) -78, (ma) (Object) new bk(el.field_L, 1, 7, so.field_g[0].field_d));
            so.field_g[0].field_d.b((byte) -110, (ma) (Object) new bk(om.field_t, 1, 6, so.field_g[0].field_d));
            so.field_g[0].field_d.b((byte) -74, (ma) (Object) new bk(vj.field_f, 1, -1, so.field_g[0].field_d));
            so.field_g[0].a(false);
            hq dupTemp$1 = new hq(fc.field_e, 2, 0);
            so.field_g[1] = dupTemp$1;
            so.field_g[0].field_j = dupTemp$1;
            if (param0 == 4313) {
              so.field_g[1].field_d.b((byte) -59, (ma) (Object) new bk(qq.field_yb, 40, 13, 128));
              so.field_g[1].field_d.b((byte) -43, (ma) (Object) new bk(dr.field_e, 1, 8, 0));
              so.field_g[1].field_d.b((byte) 99, (ma) (Object) new bk(ea.field_m, 1, 9, 0));
              so.field_g[1].field_d.b((byte) 87, (ma) (Object) new bk(gn.field_a, 7, 11, 0));
              so.field_g[1].field_d.b((byte) 99, (ma) (Object) new bk(lk.field_r, 1, 12, 0));
              so.field_g[1].field_d.b((byte) -6, (ma) (Object) new bk(g.field_w, 1, -1, 0));
              so.field_g[1].a(false);
              so.field_g[2] = new hq(ep.field_G, 2, 1);
              so.field_g[2].field_d.b((byte) -90, (ma) (Object) new bk(ca.field_m, 40, 13, 128));
              so.field_g[2].field_d.b((byte) -99, (ma) (Object) new bk(cf.field_i, 1, 8, 0));
              so.field_g[2].field_d.b((byte) -21, (ma) (Object) new bk(eq.field_N, 1, 14, 0));
              so.field_g[2].field_d.b((byte) -9, (ma) (Object) new bk(pl.field_c, 1, 15, 0));
              so.field_g[2].field_d.b((byte) -62, (ma) (Object) new bk(ui.field_N, 1, 16, 0));
              so.field_g[2].field_d.b((byte) 92, (ma) (Object) new bk(rc.field_a, 1, -1, 0));
              so.field_g[2].a(false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "cq.A(" + param0 + ')');
        }
    }

    final static eg a(int param0, int param1, int param2, eg param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        eg stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_26_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            var5_int = 0;
            if (param1 > 53) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5_int >= param3.field_g.length) {
                      break L3;
                    } else {
                      param3.field_g[var5_int] = param3.field_g[var5_int] - param0;
                      var5_int++;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var5_int = 0;
                  break L2;
                }
                L4: while (true) {
                  L5: {
                    L6: {
                      if (param3.field_Y.length <= var5_int) {
                        break L6;
                      } else {
                        param3.field_Y[var5_int] = param3.field_Y[var5_int] - param4;
                        var5_int++;
                        if (var6 != 0) {
                          break L5;
                        } else {
                          if (var6 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var5_int = 0;
                    break L5;
                  }
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var5_int >= param3.field_q.length) {
                          break L9;
                        } else {
                          param3.field_q[var5_int] = param3.field_q[var5_int] - param2;
                          var5_int++;
                          if (var6 != 0) {
                            break L8;
                          } else {
                            if (var6 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      param3.a();
                      break L8;
                    }
                    stackOut_26_0 = (eg) param3;
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (eg) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("cq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L10;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param4 + ')');
        }
        return stackIn_27_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Unpacking sound effects";
        field_g = new ko();
        field_f = "Enter name of friend to add to list";
    }
}
