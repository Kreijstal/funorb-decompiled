/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends tm {
    lm() {
    }

    final static void i() {
        dd var1 = null;
        dd var3 = null;
        int var4 = 0;
        try {
            var1 = new dd(540, 140);
            int var2 = -31;
            kj.a(62, var1);
            fb.a();
            qh.d();
            im.field_fc = 0;
            int discarded$0 = -21818;
            gi.a();
            var3 = var1.d();
            for (var4 = 0; 15 > var4; var4++) {
                var3.f(-2, -2, 16777215);
                int discarded$1 = 140;
                int discarded$2 = 540;
                int discarded$3 = 0;
                int discarded$4 = 0;
                int discarded$5 = 4;
                int discarded$6 = 4;
                qh.e();
            }
            ci.field_h.e();
            var1.b(0, 0);
            oc.a(126);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "lm.E(" + 23 + 41);
        }
    }

    final void a(int param0, di param1) {
        if (param0 != 198123656) {
            return;
        }
        try {
            ((lm) this).field_e = aj.a(0, "", param1, "top_bar_balls_space");
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "lm.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void c() {
        oq var2 = ej.field_j;
        var2.b(false, 11);
        var2.field_v = var2.field_v + 1;
        int var3 = var2.field_v;
        var2.a(5, false);
        var2.a(em.field_L.field_Nb, false);
        int var4 = em.field_L.field_ac + (em.field_L.field_Yb << 6);
        var2.a(var4, false);
        var2.a(em.field_L.field_tc, (byte) 0, 0, em.field_L.field_tc.length);
        var2.b(-var3 + var2.field_v, true);
    }

    final void a(di param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (null == ((lm) this).field_a) {
              ((lm) this).field_a = new eg[16];
              ((lm) this).field_a[0] = eg.a(param0, "", "balls/SPACE/space_ball_white");
              if (param1 == 117) {
                eg dupTemp$2 = eg.a(param0, "", "balls/SPACE/space_ball_01");
                ((lm) this).field_a[7] = dupTemp$2;
                ((lm) this).field_a[6] = dupTemp$2;
                ((lm) this).field_a[5] = dupTemp$2;
                ((lm) this).field_a[4] = dupTemp$2;
                ((lm) this).field_a[3] = dupTemp$2;
                ((lm) this).field_a[2] = dupTemp$2;
                ((lm) this).field_a[1] = dupTemp$2;
                ((lm) this).field_a[8] = eg.a(param0, "", "balls/SPACE/space_ball_black");
                eg dupTemp$3 = eg.a(param0, "", "balls/SPACE/space_ball_02");
                ((lm) this).field_a[15] = dupTemp$3;
                ((lm) this).field_a[14] = dupTemp$3;
                ((lm) this).field_a[13] = dupTemp$3;
                ((lm) this).field_a[12] = dupTemp$3;
                ((lm) this).field_a[11] = dupTemp$3;
                ((lm) this).field_a[10] = dupTemp$3;
                ((lm) this).field_a[9] = dupTemp$3;
                ((lm) this).field_a[0].a(8, 8, 8, 8);
                ((lm) this).field_a[1].a(8, 8, 8, 8);
                ((lm) this).field_a[8].a(8, 8, 8, 8);
                ((lm) this).field_a[9].a(8, 8, 8, 8);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("lm.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
            Object var4 = null;
            lm.a(-24, 10, -99, 68, -80, 113, (String) null, 109, 92);
            return param1 == 0 ? sn.field_j : dq.field_g;
        }
        return param1 == 0 ? sn.field_j : dq.field_g;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              ma.field_e.field_nb = param6;
              if (hn.field_b == 2) {
                wn.field_g.field_nb = li.field_g;
                break L1;
              } else {
                wn.field_g.field_nb = ff.field_j;
                break L1;
              }
            }
            if (param3 == 4) {
              var9_int = 495;
              var10 = 5;
              vi.field_c.b(var10, param3 ^ 2147483643, 5, var9_int + -10, param7);
              pa.field_J.b(0, param3 + 2147483643, 0, -fj.field_j.field_gb + vi.field_c.field_gb, param7);
              var10 = var10 + (param1 + param7);
              fj.field_j.b(0, 2147483647, pa.field_J.field_gb, fj.field_j.field_gb, param7);
              be.field_L.b(var10, 2147483647, 5, be.field_L.b(true), param8);
              var11 = wn.field_g.b(true);
              wn.field_g.b(var10, 2147483647, -var11 + var9_int - 5, var11, param8);
              var12 = param8 + var10 + 5;
              ma.field_e.b(0, param3 ^ 2147483643, 0, var9_int, param2);
              ml.field_e.b(param2, param3 ^ 2147483643, 0, var9_int, var12);
              var12 = var12 + param2;
              ml.field_e.field_F = rp.a(32450, 3, 2105376, ml.field_e.field_Db, 11579568, 8421504);
              uq.field_D.b(-(var12 / 2) + param4, 2147483647, param5 - var9_int / 2, var9_int, var12);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var9;
            stackOut_7_1 = new StringBuilder().append("lm.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static hj[] a() {
        return new hj[]{gr.field_G, lb.field_N, nk.field_g, kk.field_A, en.field_c, jk.field_i, no.field_g, of.field_Tb, mj.field_d, pf.field_e, pq.field_J, ch.field_K, bq.field_r, pn.field_k};
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Pool.field_O;
        if (!param1) {
          var5 = null;
          ((lm) this).a((di) null, (byte) -106);
          var3 = param0;
          if (var3 != 0) {
            if (var3 != 1) {
              if (var3 != 2) {
                if (var3 != 3) {
                  if (4 != var3) {
                    if (var3 == 5) {
                      return this.b(0, (byte) -108);
                    } else {
                      if (var3 != 6) {
                        if (7 != var3) {
                          if (var3 != 8) {
                            L0: {
                              if (9 == var3) {
                                break L0;
                              } else {
                                if (var3 == 10) {
                                  break L0;
                                } else {
                                  if (var3 == 11) {
                                    break L0;
                                  } else {
                                    if (var3 == 12) {
                                      break L0;
                                    } else {
                                      if (13 != var3) {
                                        if (var3 != 14) {
                                          if (var3 != 15) {
                                            return 16711935;
                                          } else {
                                            return this.b(1, (byte) -108);
                                          }
                                        } else {
                                          return this.b(1, (byte) -108);
                                        }
                                      } else {
                                        return this.b(1, (byte) -108);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            return this.b(1, (byte) -108);
                          } else {
                            return 3355443;
                          }
                        } else {
                          return this.b(0, (byte) -108);
                        }
                      } else {
                        return this.b(0, (byte) -108);
                      }
                    }
                  } else {
                    return this.b(0, (byte) -108);
                  }
                } else {
                  return this.b(0, (byte) -108);
                }
              } else {
                return this.b(0, (byte) -108);
              }
            } else {
              return this.b(0, (byte) -108);
            }
          } else {
            return 13421772;
          }
        } else {
          var3 = param0;
          if (var3 != 0) {
            if (var3 != 1) {
              L1: {
                if (var3 == 2) {
                  break L1;
                } else {
                  if (var3 != 3) {
                    if (4 != var3) {
                      if (var3 == 5) {
                        break L1;
                      } else {
                        if (var3 != 6) {
                          if (7 != var3) {
                            if (var3 != 8) {
                              L2: {
                                if (9 == var3) {
                                  break L2;
                                } else {
                                  if (var3 == 10) {
                                    break L2;
                                  } else {
                                    if (var3 == 11) {
                                      break L2;
                                    } else {
                                      if (var3 == 12) {
                                        break L2;
                                      } else {
                                        if (13 != var3) {
                                          if (var3 != 14) {
                                            if (var3 != 15) {
                                              return 16711935;
                                            } else {
                                              return this.b(1, (byte) -108);
                                            }
                                          } else {
                                            return this.b(1, (byte) -108);
                                          }
                                        } else {
                                          return this.b(1, (byte) -108);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              return this.b(1, (byte) -108);
                            } else {
                              return 3355443;
                            }
                          } else {
                            return this.b(0, (byte) -108);
                          }
                        } else {
                          return this.b(0, (byte) -108);
                        }
                      }
                    } else {
                      return this.b(0, (byte) -108);
                    }
                  } else {
                    return this.b(0, (byte) -108);
                  }
                }
              }
              return this.b(0, (byte) -108);
            } else {
              return this.b(0, (byte) -108);
            }
          } else {
            return 13421772;
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            return true;
        }
        return false;
    }

    private final int b(int param0, byte param1) {
        if (param0 != 0) {
            if (param0 == 1) {
                return 10066329;
            }
            return 16777215;
        }
        return 6697745;
    }

    static {
    }
}
