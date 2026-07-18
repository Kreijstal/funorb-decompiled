/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends kd {
    static boolean field_J;
    int field_D;
    int field_A;
    boolean field_G;
    int field_B;
    int field_P;
    static gh field_K;
    int field_M;
    int field_O;
    static String[][] field_y;
    static fm field_H;
    ee field_z;
    int field_I;
    int field_F;
    static gh field_E;
    static String field_C;
    static gk[] field_L;
    static String field_N;

    public static void h() {
        field_E = null;
        field_L = null;
        field_y = null;
        field_H = null;
        field_K = null;
        field_N = null;
        field_C = null;
    }

    final static void a() {
        wk[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var6 = pd.field_Q;
              if (qd.field_g <= 0) {
                break L1;
              } else {
                var6 = bg.field_C;
                break L1;
              }
            }
            var7 = 8 * a.field_c / 50 % var6.length;
            int discarded$8 = 104;
            int discarded$9 = -31;
            int discarded$10 = 160;
            int discarded$11 = 104;
            de.a(4, 4, vh.field_b);
            var6[var7].e(8, 8, 2254472);
            pb.d(16, 4, 4, 4, 104, 104);
            var6[var7].e(8, 8, 17561);
            pb.d(8, 2, 4, 4, 104, 104);
            var6[var7].a(8, 8, 255);
            var8 = 104;
            var9 = 104;
            var10 = a.field_c / 10 % 2;
            L2: while (true) {
              if (var10 >= var8) {
                break L0;
              } else {
                pb.f(8 + (-4 + var10), 4, var9, 0, 100);
                var10 += 2;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var6_ref, "qb.B(" + 96 + ',' + 4 + ',' + 50 + ',' + 8 + ',' + 8 + ',' + 96 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ek stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        int stackIn_55_4 = 0;
        ek stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        ek stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        int stackIn_57_4 = 0;
        int stackIn_57_5 = 0;
        ek stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        ek stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        int stackOut_56_4 = 0;
        int stackOut_56_5 = 0;
        ek stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        int stackOut_55_5 = 0;
        L0: {
          var10 = SteelSentinels.field_G;
          var5 = (((qb) this).field_F >> 8) + param0;
          var6 = -124 / ((-25 - param3) / 54);
          var7 = (((qb) this).field_B >> 8) + param1;
          if (var5 < -32) {
            break L0;
          } else {
            if (var5 > 672) {
              break L0;
            } else {
              if (var7 < -32) {
                break L0;
              } else {
                if (var7 > 672) {
                  break L0;
                } else {
                  L1: {
                    var8 = ((qb) this).field_I * 8 / ((qb) this).field_D;
                    if (var8 < 0) {
                      var8 = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (var8 > 7) {
                      var8 = 7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (((qb) this).field_M == 0) {
                      if (!param2) {
                        break L3;
                      } else {
                        L4: {
                          var8 = Math.max(0, Math.min(15, ((qb) this).field_I * 16 / ((qb) this).field_D));
                          var9 = 17;
                          stackOut_54_0 = cc.field_pc[var8];
                          stackOut_54_1 = -var9 + var5;
                          stackOut_54_2 = -var9 + var7;
                          stackOut_54_3 = 2 * var9;
                          stackOut_54_4 = var9 * 2;
                          stackIn_56_0 = stackOut_54_0;
                          stackIn_56_1 = stackOut_54_1;
                          stackIn_56_2 = stackOut_54_2;
                          stackIn_56_3 = stackOut_54_3;
                          stackIn_56_4 = stackOut_54_4;
                          stackIn_55_0 = stackOut_54_0;
                          stackIn_55_1 = stackOut_54_1;
                          stackIn_55_2 = stackOut_54_2;
                          stackIn_55_3 = stackOut_54_3;
                          stackIn_55_4 = stackOut_54_4;
                          if (((qb) this).field_D / 2 > ((qb) this).field_I) {
                            stackOut_56_0 = (ek) (Object) stackIn_56_0;
                            stackOut_56_1 = stackIn_56_1;
                            stackOut_56_2 = stackIn_56_2;
                            stackOut_56_3 = stackIn_56_3;
                            stackOut_56_4 = stackIn_56_4;
                            stackOut_56_5 = 255;
                            stackIn_57_0 = stackOut_56_0;
                            stackIn_57_1 = stackOut_56_1;
                            stackIn_57_2 = stackOut_56_2;
                            stackIn_57_3 = stackOut_56_3;
                            stackIn_57_4 = stackOut_56_4;
                            stackIn_57_5 = stackOut_56_5;
                            break L4;
                          } else {
                            stackOut_55_0 = (ek) (Object) stackIn_55_0;
                            stackOut_55_1 = stackIn_55_1;
                            stackOut_55_2 = stackIn_55_2;
                            stackOut_55_3 = stackIn_55_3;
                            stackOut_55_4 = stackIn_55_4;
                            stackOut_55_5 = 505 - ((qb) this).field_I * 500 / ((qb) this).field_D;
                            stackIn_57_0 = stackOut_55_0;
                            stackIn_57_1 = stackOut_55_1;
                            stackIn_57_2 = stackOut_55_2;
                            stackIn_57_3 = stackOut_55_3;
                            stackIn_57_4 = stackOut_55_4;
                            stackIn_57_5 = stackOut_55_5;
                            break L4;
                          }
                        }
                        ((ek) (Object) stackIn_57_0).a(stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4, stackIn_57_5);
                        break L3;
                      }
                    } else {
                      if (((qb) this).field_M == 1) {
                        if (param2) {
                          break L3;
                        } else {
                          var9 = 16;
                          vi.field_gb[var8].d(var5 + -var9, var7 + -var9, var9 * 2, 2 * var9, 128);
                          break L3;
                        }
                      } else {
                        if (((qb) this).field_M == 3) {
                          if (param2) {
                            break L3;
                          } else {
                            var9 = 2;
                            vi.field_gb[var8].d(var5 - var9, var7 - var9, var9 * 2, 2 * var9, 128);
                            break L3;
                          }
                        } else {
                          if (((qb) this).field_M != 2) {
                            if (((qb) this).field_M != 4) {
                              if (((qb) this).field_M == 5) {
                                if (param2) {
                                  break L3;
                                } else {
                                  var9 = 4;
                                  bm.field_S[var8].d(-var9 + var5, -var9 + var7, 2 * var9, 2 * var9, 128);
                                  break L3;
                                }
                              } else {
                                if (((qb) this).field_M != 6) {
                                  if (7 != ((qb) this).field_M) {
                                    if (((qb) this).field_M == 8) {
                                      if (!param2) {
                                        var8 = Math.max(0, Math.min(15, 16 * ((qb) this).field_I / ((qb) this).field_D));
                                        var9 = 4;
                                        cc.field_pc[var8].c(var5 - var9, var7 - var9, var9 * 2, 2 * var9);
                                        break L3;
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      if (((qb) this).field_M != 9) {
                                        if (12 != ((qb) this).field_M) {
                                          if (((qb) this).field_M == 13) {
                                            if (!param2) {
                                              var9 = 16;
                                              pb.a(var5 << 4, var7 << 4, var9 << 4, 249, hc.field_X);
                                              break L3;
                                            } else {
                                              break L3;
                                            }
                                          } else {
                                            if (((qb) this).field_M != 14) {
                                              break L3;
                                            } else {
                                              if (param2) {
                                                break L3;
                                              } else {
                                                var9 = (500 + -(2 * ((qb) this).field_I)) / 125;
                                                pb.a(var5 << 4, var7 << 4, var9 << 4, 31, hc.field_W);
                                                break L3;
                                              }
                                            }
                                          }
                                        } else {
                                          if (!param2) {
                                            var9 = 2;
                                            bm.field_S[2 & var8].d(var5 - var9, -var9 + var7, 2 * var9, 2 * var9, -(((qb) this).field_I * 250 / ((qb) this).field_D) + 250);
                                            break L3;
                                          } else {
                                            break L3;
                                          }
                                        }
                                      } else {
                                        if (param2) {
                                          break L3;
                                        } else {
                                          var9 = 4;
                                          vi.field_gb[7 + -var8].a(-var9 + var5, -var9 + var7, var9 * 2, var9 * 2, 200 + -(((qb) this).field_I * 200 / ((qb) this).field_D));
                                          break L3;
                                        }
                                      }
                                    }
                                  } else {
                                    if (!param2) {
                                      var9 = 1;
                                      vi.field_gb[var8].d(-var9 + var5, var7 + -var9, 2 * var9, var9 * 2, 128);
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                } else {
                                  if (param2) {
                                    break L3;
                                  } else {
                                    var9 = 2;
                                    bm.field_S[var8].d(-var9 + var5, var7 + -var9, var9 * 2, 2 * var9, 128);
                                    break L3;
                                  }
                                }
                              }
                            } else {
                              if (param2) {
                                break L3;
                              } else {
                                var9 = 16;
                                bm.field_S[var8].d(-var9 + var5, -var9 + var7, var9 * 2, 2 * var9, 128);
                                break L3;
                              }
                            }
                          } else {
                            if (!param2) {
                              break L3;
                            } else {
                              var8 = Math.max(0, Math.min(15, 16 * ((qb) this).field_I / ((qb) this).field_D));
                              var9 = 2;
                              cc.field_pc[var8].c(-var9 + var5, -var9 + var7, 2 * var9, 2 * var9);
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    final void i(int param0) {
        if (param0 != -15809) {
            field_H = null;
        }
        ((qb) this).field_z = null;
    }

    final static boolean g() {
        return wb.field_c == null ? kc.field_q : true;
    }

    final void c(byte param0) {
        qb var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = SteelSentinels.field_G;
        if (((qb) this).field_z == null) {
          return;
        } else {
          L0: {
            ((qb) this).field_F = ((qb) this).field_F + ((qb) this).field_A;
            ((qb) this).field_B = ((qb) this).field_B + ((qb) this).field_O;
            if (param0 >= 1) {
              break L0;
            } else {
              var4 = null;
              qb.a(-116, -34, (String) null, -4, (String) null);
              break L0;
            }
          }
          L1: {
            if (200 > ((qb) this).field_I) {
              ((qb) this).field_I = ((qb) this).field_I + (int)(Math.random() * 4.0);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((qb) this).field_z.field_ab.b(110) != 4) {
              L3: {
                if (((qb) this).field_G) {
                  if (((qb) this).field_z.field_ab.b((byte) 122, ((qb) this).field_F >> 4) >= -(((qb) this).field_B >> 4)) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        L6: {
                          if (((qb) this).field_M == 2) {
                            break L6;
                          } else {
                            if (((qb) this).field_M == 3) {
                              break L6;
                            } else {
                              if (((qb) this).field_M == 9) {
                                break L6;
                              } else {
                                if (((qb) this).field_M == 10) {
                                  break L6;
                                } else {
                                  if (((qb) this).field_M != 6) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (((qb) this).field_z.field_ab.b((byte) 127, ((qb) this).field_F >> 4) == ((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                      ((qb) this).field_B = -(((qb) this).field_z.field_ab.b((byte) 118, ((qb) this).field_F >> 4) << 4);
                      break L4;
                    }
                    if (~((qb) this).field_z.field_ab.b((byte) 120, ((qb) this).field_F >> 4) == ~((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4)) {
                      ((qb) this).field_G = false;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  if (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4) > -(((qb) this).field_B >> 4)) {
                    L7: {
                      if (((qb) this).field_z.field_ab.b(51) != 2) {
                        break L7;
                      } else {
                        if (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4) > 2048) {
                          ((qb) this).field_F = ((qb) this).field_F - ((qb) this).field_A;
                          ((qb) this).field_A = 0;
                          break L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      L9: {
                        if (((qb) this).field_M == 2) {
                          break L9;
                        } else {
                          if (3 == ((qb) this).field_M) {
                            break L9;
                          } else {
                            if (((qb) this).field_M == 9) {
                              break L9;
                            } else {
                              if (10 == ((qb) this).field_M) {
                                break L9;
                              } else {
                                if (((qb) this).field_M != 6) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (~((qb) this).field_z.field_ab.b((byte) 126, ((qb) this).field_F >> 4) == ~((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4)) {
                        break L3;
                      } else {
                        break L8;
                      }
                    }
                    ((qb) this).field_B = -(((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4) << 4);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (((qb) this).field_z.field_ab.a((byte) -96, ((qb) this).field_F >> 4) <= -(((qb) this).field_B >> 4)) {
                break L2;
              } else {
                ((qb) this).field_B = -(((qb) this).field_z.field_ab.a((byte) -128, ((qb) this).field_F >> 4) << 4);
                break L2;
              }
            } else {
              break L2;
            }
          }
          L10: {
            if (((qb) this).field_M == 10) {
              ((qb) this).field_O = ((qb) this).field_O + ((qb) this).field_z.field_z;
              var2 = nk.a(9, 0, ((qb) this).field_z, 105, ((qb) this).field_B, ((qb) this).field_G, 100, 0, ((qb) this).field_F, ((qb) this).field_P);
              ((qb) this).field_z.field_O.a(3, (ck) (Object) var2);
              break L10;
            } else {
              ((qb) this).field_A = ((qb) this).field_A * 9 / 10;
              ((qb) this).field_O = ((qb) this).field_O * 9 / 10;
              break L10;
            }
          }
          L11: {
            ((qb) this).field_I = ((qb) this).field_I + 1;
            if (~((qb) this).field_I < ~((qb) this).field_D) {
              ((qb) this).field_z.field_J.a((byte) 110, (kd) this);
              break L11;
            } else {
              break L11;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, String param2, int param3, String param4) {
        try {
            vd.field_d.field_zb = vd.field_d.field_zb + wh.field_e.field_zb;
            vd.field_d.field_Db = param4;
            vd.field_d.field_S = param2;
            vd.field_d.field_nb = param1;
            int var5_int = -48 % ((-12 - param0) / 61);
            wh.field_e.field_Y = wh.field_e.field_Y + wh.field_e.field_zb;
            wh.field_e.field_zb = param3;
            vd.field_d.field_zb = vd.field_d.field_zb - wh.field_e.field_zb;
            wh.field_e.field_Y = wh.field_e.field_Y - wh.field_e.field_zb;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "qb.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    qb() {
    }

    final static void a(nk param0, gh param1, byte param2, boolean param3, int param4, int param5) {
        Object var6 = null;
        wk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wk[] var13 = null;
        Object stackIn_223_0 = null;
        StringBuilder stackIn_223_1 = null;
        Object stackIn_224_0 = null;
        StringBuilder stackIn_224_1 = null;
        Object stackIn_225_0 = null;
        StringBuilder stackIn_225_1 = null;
        String stackIn_225_2 = null;
        Object stackIn_226_0 = null;
        StringBuilder stackIn_226_1 = null;
        Object stackIn_227_0 = null;
        StringBuilder stackIn_227_1 = null;
        Object stackIn_228_0 = null;
        StringBuilder stackIn_228_1 = null;
        String stackIn_228_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_222_0 = null;
        StringBuilder stackOut_222_1 = null;
        Object stackOut_224_0 = null;
        StringBuilder stackOut_224_1 = null;
        String stackOut_224_2 = null;
        Object stackOut_223_0 = null;
        StringBuilder stackOut_223_1 = null;
        String stackOut_223_2 = null;
        Object stackOut_225_0 = null;
        StringBuilder stackOut_225_1 = null;
        Object stackOut_227_0 = null;
        StringBuilder stackOut_227_1 = null;
        String stackOut_227_2 = null;
        Object stackOut_226_0 = null;
        StringBuilder stackOut_226_1 = null;
        String stackOut_226_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var6 = null;
              if (!param3) {
                break L1;
              } else {
                if (param0.field_N < 0) {
                  break L1;
                } else {
                  if (param0.field_Q == 1) {
                    break L1;
                  } else {
                    var13 = hl.field_p;
                    var6 = (Object) (Object) var13;
                    if (~var13.length < ~param0.field_N) {
                      break L1;
                    } else {
                      var6 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var6 == null) {
                break L2;
              } else {
                if (null == ((Object[]) var6)[param0.field_N]) {
                  break L2;
                } else {
                  param1.field_Pb = (wk) ((Object[]) var6)[param0.field_N];
                  return;
                }
              }
            }
            L3: {
              var7 = new wk(param4, param5);
              param1.field_Pb = var7;
              if (var6 != null) {
                ((Object[]) var6)[param0.field_N] = (Object) (Object) var7;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              param1.field_Pb.d();
              if (param0.field_Q == 1) {
                L5: {
                  var8 = hj.field_w;
                  if (param0.field_N != 0) {
                    break L5;
                  } else {
                    hj.field_w = 1200;
                    break L5;
                  }
                }
                L6: {
                  if (55 != param0.field_N) {
                    break L6;
                  } else {
                    hj.field_w = 1200;
                    break L6;
                  }
                }
                L7: {
                  if (57 == param0.field_N) {
                    hj.field_w = 1300;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param0.field_N != 62) {
                    break L8;
                  } else {
                    hj.field_w = 1400;
                    break L8;
                  }
                }
                L9: {
                  if (65 != param0.field_N) {
                    break L9;
                  } else {
                    hj.field_w = 1000;
                    break L9;
                  }
                }
                L10: {
                  if (param0.field_N != 69) {
                    break L10;
                  } else {
                    hj.field_w = 1400;
                    break L10;
                  }
                }
                L11: {
                  if (72 != param0.field_N) {
                    break L11;
                  } else {
                    hj.field_w = 1000;
                    break L11;
                  }
                }
                L12: {
                  if (param0.field_N == 75) {
                    hj.field_w = 1000;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (param0.field_N != 79) {
                    break L13;
                  } else {
                    hj.field_w = 1000;
                    break L13;
                  }
                }
                L14: {
                  if (param0.field_N != 84) {
                    break L14;
                  } else {
                    hj.field_w = 1000;
                    break L14;
                  }
                }
                L15: {
                  if (param0.field_N != 88) {
                    break L15;
                  } else {
                    hj.field_w = 1000;
                    break L15;
                  }
                }
                L16: {
                  if (param0.field_N == 92) {
                    hj.field_w = 700;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                param0.a(0, false, param4 / 2, param5, (byte) 49, 0);
                hj.field_w = var8;
                break L4;
              } else {
                L17: {
                  var8 = param4 / 2;
                  var9 = param5 / 2;
                  if (param0.field_Q != 16) {
                    break L17;
                  } else {
                    var8 -= 10;
                    break L17;
                  }
                }
                L18: {
                  var10 = hj.field_w;
                  if (param0.field_N == 31) {
                    var8 -= 20;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (64 == param0.field_Q) {
                    var8 -= 20;
                    var9 += 7;
                    hj.field_w = 2048;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (param0.field_Q == 128) {
                    var8 += 5;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (param0.field_Q == 256) {
                    var8 += 10;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (param0.field_Q != 2) {
                    break L22;
                  } else {
                    var8 -= 10;
                    var9 += 10;
                    break L22;
                  }
                }
                L23: {
                  if (param0.field_N != 95) {
                    break L23;
                  } else {
                    var8 -= 20;
                    break L23;
                  }
                }
                L24: {
                  if (4 != param0.field_Q) {
                    break L24;
                  } else {
                    var9 -= 20;
                    hj.field_w = 3072;
                    break L24;
                  }
                }
                L25: {
                  if (param0.field_N == 76) {
                    var8 -= 20;
                    param0 = ul.a(102, (byte) 67);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (66 == param0.field_N) {
                    var8 -= 20;
                    param0 = ul.a(99, (byte) 67);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (param0.field_Q != 2048) {
                    break L27;
                  } else {
                    var9 -= 20;
                    hj.field_w = 2048;
                    break L27;
                  }
                }
                L28: {
                  if (param0.field_N != 80) {
                    break L28;
                  } else {
                    var8 -= 10;
                    var9 += 10;
                    break L28;
                  }
                }
                L29: {
                  if (param0.field_Q == 8) {
                    var9 += 20;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (param0.field_N == 59) {
                    var9 -= 25;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (param0.field_N == 71) {
                    var9 -= 15;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (77 != param0.field_N) {
                    break L32;
                  } else {
                    var9 -= 10;
                    break L32;
                  }
                }
                L33: {
                  var11 = param0.field_N;
                  if (1 == var11) {
                    var8 += 5;
                    var9 -= 8;
                    break L33;
                  } else {
                    if (53 != var11) {
                      if (60 != var11) {
                        if (var11 == 61) {
                          var9 -= 5;
                          var8 -= 4;
                          break L33;
                        } else {
                          if (var11 != 64) {
                            if (68 == var11) {
                              var8 += 4;
                              var9 -= 10;
                              break L33;
                            } else {
                              if (var11 != 74) {
                                if (var11 == 78) {
                                  var9 -= 2;
                                  break L33;
                                } else {
                                  if (var11 != 82) {
                                    if (var11 == 87) {
                                      var9 -= 3;
                                      break L33;
                                    } else {
                                      if (var11 != 91) {
                                        if (95 != var11) {
                                          if (var11 == 2) {
                                            var8 -= 7;
                                            var9 += 8;
                                            break L33;
                                          } else {
                                            if (var11 == 56) {
                                              var9--;
                                              hj.field_w = 2500;
                                              break L33;
                                            } else {
                                              L34: {
                                                if (var11 != 66) {
                                                  if (var11 == 99) {
                                                    break L34;
                                                  } else {
                                                    if (var11 != 70) {
                                                      L35: {
                                                        if (var11 == 76) {
                                                          break L35;
                                                        } else {
                                                          if (var11 == 102) {
                                                            break L35;
                                                          } else {
                                                            if (var11 == 85) {
                                                              var9 += 10;
                                                              break L33;
                                                            } else {
                                                              if (80 != var11) {
                                                                if (89 == var11) {
                                                                  var9 += 8;
                                                                  var8 += 6;
                                                                  hj.field_w = 1600;
                                                                  break L33;
                                                                } else {
                                                                  if (var11 == 93) {
                                                                    var9 += 2;
                                                                    hj.field_w = 1024;
                                                                    var8 -= 2;
                                                                    break L33;
                                                                  } else {
                                                                    if (var11 != 3) {
                                                                      if (54 == var11) {
                                                                        var9 -= 14;
                                                                        break L33;
                                                                      } else {
                                                                        if (var11 == 67) {
                                                                          var9 -= 10;
                                                                          var8 += 12;
                                                                          break L33;
                                                                        } else {
                                                                          if (var11 != 71) {
                                                                            if (var11 == 73) {
                                                                              hj.field_w = 2900;
                                                                              break L33;
                                                                            } else {
                                                                              if (var11 != 77) {
                                                                                if (81 != var11) {
                                                                                  if (86 == var11) {
                                                                                    hj.field_w = 2300;
                                                                                    var8 += 25;
                                                                                    break L33;
                                                                                  } else {
                                                                                    if (var11 == 90) {
                                                                                      var9 -= 6;
                                                                                      break L33;
                                                                                    } else {
                                                                                      if (var11 != 83) {
                                                                                        if (var11 != 28) {
                                                                                          if (var11 != 29) {
                                                                                            if (var11 == 30) {
                                                                                              var8 += 3;
                                                                                              var9 -= 4;
                                                                                              break L33;
                                                                                            } else {
                                                                                              if (var11 != 31) {
                                                                                                if (var11 == 35) {
                                                                                                  hj.field_w = 3500;
                                                                                                  var8 -= 2;
                                                                                                  break L33;
                                                                                                } else {
                                                                                                  if (var11 == 32) {
                                                                                                    hj.field_w = 2800;
                                                                                                    var8 -= 10;
                                                                                                    break L33;
                                                                                                  } else {
                                                                                                    if (var11 != 33) {
                                                                                                      if (34 == var11) {
                                                                                                        var8 -= 4;
                                                                                                        hj.field_w = 3800;
                                                                                                        break L33;
                                                                                                      } else {
                                                                                                        if (var11 != 38) {
                                                                                                          if (43 != var11) {
                                                                                                            if (var11 == 48) {
                                                                                                              var9--;
                                                                                                              var8 += 4;
                                                                                                              break L33;
                                                                                                            } else {
                                                                                                              if (var11 == 52) {
                                                                                                                var8 += 3;
                                                                                                                hj.field_w = 1800;
                                                                                                                break L33;
                                                                                                              } else {
                                                                                                                if (var11 == 46) {
                                                                                                                  var8 += 4;
                                                                                                                  hj.field_w = 1800;
                                                                                                                  break L33;
                                                                                                                } else {
                                                                                                                  if (var11 != 45) {
                                                                                                                    if (var11 == 44) {
                                                                                                                      var9 -= 2;
                                                                                                                      var8 += 7;
                                                                                                                      break L33;
                                                                                                                    } else {
                                                                                                                      if (47 != var11) {
                                                                                                                        if (var11 != 36) {
                                                                                                                          if (37 == var11) {
                                                                                                                            hj.field_w = 3600;
                                                                                                                            break L33;
                                                                                                                          } else {
                                                                                                                            if (51 != var11) {
                                                                                                                              if (var11 != 50) {
                                                                                                                                if (var11 != 49) {
                                                                                                                                  break L33;
                                                                                                                                } else {
                                                                                                                                  var8 += 3;
                                                                                                                                  hj.field_w = 2200;
                                                                                                                                  break L33;
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                hj.field_w = 3600;
                                                                                                                                break L33;
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              hj.field_w = 3600;
                                                                                                                              break L33;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          hj.field_w = 3600;
                                                                                                                          break L33;
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        var8 += 4;
                                                                                                                        break L33;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    var8 += 2;
                                                                                                                    hj.field_w = 1550;
                                                                                                                    break L33;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            var8 += 8;
                                                                                                            break L33;
                                                                                                          }
                                                                                                        } else {
                                                                                                          hj.field_w = 3900;
                                                                                                          var8 -= 2;
                                                                                                          break L33;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var8 -= 3;
                                                                                                      hj.field_w = 3800;
                                                                                                      break L33;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var8 -= 3;
                                                                                                hj.field_w = 2800;
                                                                                                break L33;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var8 += 3;
                                                                                            break L33;
                                                                                          }
                                                                                        } else {
                                                                                          var8 += 4;
                                                                                          break L33;
                                                                                        }
                                                                                      } else {
                                                                                        var8 += 8;
                                                                                        break L33;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  hj.field_w = 3000;
                                                                                  var9 -= 2;
                                                                                  break L33;
                                                                                }
                                                                              } else {
                                                                                var9 -= 4;
                                                                                var8 += 13;
                                                                                break L33;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var9 -= 8;
                                                                            var8 -= 15;
                                                                            break L33;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var8 += 12;
                                                                      var9 -= 4;
                                                                      break L33;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var8 += 4;
                                                                var9 += 2;
                                                                break L33;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      hj.field_w = 2700;
                                                      break L33;
                                                    } else {
                                                      var9 += 4;
                                                      var8 -= 4;
                                                      break L33;
                                                    }
                                                  }
                                                } else {
                                                  break L34;
                                                }
                                              }
                                              var9 += 4;
                                              hj.field_w = 2500;
                                              break L33;
                                            }
                                          }
                                        } else {
                                          var9 += 10;
                                          hj.field_w = 3300;
                                          var8 += 4;
                                          break L33;
                                        }
                                      } else {
                                        hj.field_w = 3000;
                                        var8 += 8;
                                        break L33;
                                      }
                                    }
                                  } else {
                                    var8 -= 4;
                                    var9 += 9;
                                    break L33;
                                  }
                                }
                              } else {
                                var9 -= 10;
                                var8 -= 8;
                                break L33;
                              }
                            }
                          } else {
                            var9 -= 6;
                            break L33;
                          }
                        }
                      } else {
                        var9 -= 4;
                        var8 += 10;
                        break L33;
                      }
                    } else {
                      var9 += 2;
                      var8 -= 7;
                      break L33;
                    }
                  }
                }
                L36: {
                  if ((3086 & param0.field_Q) == 0) {
                    break L36;
                  } else {
                    if (param4 <= 100) {
                      break L36;
                    } else {
                      var8 -= 5;
                      break L36;
                    }
                  }
                }
                param0.a(0, false, var8, var9, (byte) 49, 16384);
                hj.field_w = var10;
                break L4;
              }
            }
            sb.field_bb.b((byte) 123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var6 = (Object) (Object) decompiledCaughtException;
            stackOut_222_0 = var6;
            stackOut_222_1 = new StringBuilder().append("qb.D(");
            stackIn_224_0 = stackOut_222_0;
            stackIn_224_1 = stackOut_222_1;
            stackIn_223_0 = stackOut_222_0;
            stackIn_223_1 = stackOut_222_1;
            if (param0 == null) {
              stackOut_224_0 = stackIn_224_0;
              stackOut_224_1 = (StringBuilder) (Object) stackIn_224_1;
              stackOut_224_2 = "null";
              stackIn_225_0 = stackOut_224_0;
              stackIn_225_1 = stackOut_224_1;
              stackIn_225_2 = stackOut_224_2;
              break L37;
            } else {
              stackOut_223_0 = stackIn_223_0;
              stackOut_223_1 = (StringBuilder) (Object) stackIn_223_1;
              stackOut_223_2 = "{...}";
              stackIn_225_0 = stackOut_223_0;
              stackIn_225_1 = stackOut_223_1;
              stackIn_225_2 = stackOut_223_2;
              break L37;
            }
          }
          L38: {
            stackOut_225_0 = stackIn_225_0;
            stackOut_225_1 = ((StringBuilder) (Object) stackIn_225_1).append(stackIn_225_2).append(',');
            stackIn_227_0 = stackOut_225_0;
            stackIn_227_1 = stackOut_225_1;
            stackIn_226_0 = stackOut_225_0;
            stackIn_226_1 = stackOut_225_1;
            if (param1 == null) {
              stackOut_227_0 = stackIn_227_0;
              stackOut_227_1 = (StringBuilder) (Object) stackIn_227_1;
              stackOut_227_2 = "null";
              stackIn_228_0 = stackOut_227_0;
              stackIn_228_1 = stackOut_227_1;
              stackIn_228_2 = stackOut_227_2;
              break L38;
            } else {
              stackOut_226_0 = stackIn_226_0;
              stackOut_226_1 = (StringBuilder) (Object) stackIn_226_1;
              stackOut_226_2 = "{...}";
              stackIn_228_0 = stackOut_226_0;
              stackIn_228_1 = stackOut_226_1;
              stackIn_228_2 = stackOut_226_2;
              break L38;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_228_0, stackIn_228_2 + ',' + -93 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[][]{new String[2], new String[5], new String[6]};
        field_H = new fm(10, 2, 2, 0);
        field_C = "Enter multiplayer lobby";
        field_N = "Confirm Password: ";
    }
}
