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

    public static void h(int param0) {
        field_E = null;
        field_L = null;
        field_y = null;
        field_H = null;
        field_K = null;
        field_N = null;
        if (param0 != -185837884) {
          return;
        } else {
          field_C = null;
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        wk[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var6_array = pd.field_Q;
              if (qd.field_g <= 0) {
                break L1;
              } else {
                var6_array = bg.field_C;
                break L1;
              }
            }
            L2: {
              var7 = 8 * a.field_c / 50 % var6_array.length;
              de.a(-param1 + param4, param3 + -param1, vh.field_b, param0 + 2 * param1, 160, (byte) -31, param1 * 2 - -param5);
              var6_array[var7].e(param4, param3, 2254472);
              pb.d(16, 4, -4 + param4, param3 - 4, 8 + param0, param5 + 8);
              if (param2 >= 26) {
                break L2;
              } else {
                var12 = null;
                qb.a(112, -62, (String) null, 84, (String) null);
                break L2;
              }
            }
            var6_array[var7].e(param4, param3, 17561);
            pb.d(8, 2, -4 + param4, param3 + -4, 8 + param0, param5 - -8);
            var6_array[var7].a(param4, param3, 255);
            var8 = param0 + 2 * param1;
            var9 = 2 * param1 + param5;
            var10 = a.field_c / 10 % 2;
            L3: while (true) {
              L4: {
                if (var10 >= var8) {
                  break L4;
                } else {
                  pb.f(param4 + (-param1 + var10), param3 - param1, var9, 0, 100);
                  var10 += 2;
                  if (var11 != 0) {
                    break L4;
                  } else {
                    continue L3;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var6, "qb.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
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
                    L4: {
                      if (((qb) this).field_M == 0) {
                        break L4;
                      } else {
                        L5: {
                          if (((qb) this).field_M == 1) {
                            break L5;
                          } else {
                            L6: {
                              if (((qb) this).field_M == 3) {
                                break L6;
                              } else {
                                L7: {
                                  if (((qb) this).field_M != 2) {
                                    break L7;
                                  } else {
                                    if (!param2) {
                                      break L3;
                                    } else {
                                      var8 = Math.max(0, Math.min(15, 16 * ((qb) this).field_I / ((qb) this).field_D));
                                      var9 = 2;
                                      cc.field_pc[var8].c(-var9 + var5, -var9 + var7, 2 * var9, 2 * var9);
                                      if (var10 == 0) {
                                        break L3;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                L8: {
                                  if (((qb) this).field_M != 4) {
                                    break L8;
                                  } else {
                                    if (param2) {
                                      break L3;
                                    } else {
                                      var9 = 16;
                                      bm.field_S[var8].d(-var9 + var5, -var9 + var7, var9 * 2, 2 * var9, 128);
                                      if (var10 == 0) {
                                        break L3;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                L9: {
                                  if (((qb) this).field_M == 5) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if (((qb) this).field_M != 6) {
                                        break L10;
                                      } else {
                                        if (param2) {
                                          break L3;
                                        } else {
                                          var9 = 2;
                                          bm.field_S[var8].d(-var9 + var5, var7 + -var9, var9 * 2, 2 * var9, 128);
                                          if (var10 == 0) {
                                            break L3;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      if (7 != ((qb) this).field_M) {
                                        break L11;
                                      } else {
                                        if (!param2) {
                                          var9 = 1;
                                          vi.field_gb[var8].d(-var9 + var5, var7 + -var9, 2 * var9, var9 * 2, 128);
                                          if (var10 == 0) {
                                            break L3;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (((qb) this).field_M == 8) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (((qb) this).field_M != 9) {
                                            break L13;
                                          } else {
                                            if (param2) {
                                              break L3;
                                            } else {
                                              var9 = 4;
                                              vi.field_gb[7 + -var8].a(-var9 + var5, -var9 + var7, var9 * 2, var9 * 2, 200 + -(((qb) this).field_I * 200 / ((qb) this).field_D));
                                              if (var10 == 0) {
                                                break L3;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                        L14: {
                                          if (12 != ((qb) this).field_M) {
                                            break L14;
                                          } else {
                                            if (!param2) {
                                              var9 = 2;
                                              bm.field_S[2 & var8].d(var5 - var9, -var9 + var7, 2 * var9, 2 * var9, -(((qb) this).field_I * 250 / ((qb) this).field_D) + 250);
                                              if (var10 == 0) {
                                                break L3;
                                              } else {
                                                break L14;
                                              }
                                            } else {
                                              break L3;
                                            }
                                          }
                                        }
                                        L15: {
                                          if (((qb) this).field_M == 13) {
                                            break L15;
                                          } else {
                                            if (((qb) this).field_M != 14) {
                                              break L3;
                                            } else {
                                              if (param2) {
                                                break L3;
                                              } else {
                                                var9 = (500 + -(2 * ((qb) this).field_I)) / 125;
                                                pb.a(var5 << 4, var7 << 4, var9 << 4, 31, hc.field_W);
                                                if (var10 == 0) {
                                                  break L3;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (!param2) {
                                          var9 = 16;
                                          pb.a(var5 << 4, var7 << 4, var9 << 4, 249, hc.field_X);
                                          if (var10 == 0) {
                                            break L3;
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    if (!param2) {
                                      var8 = Math.max(0, Math.min(15, 16 * ((qb) this).field_I / ((qb) this).field_D));
                                      var9 = 4;
                                      cc.field_pc[var8].c(var5 - var9, var7 - var9, var9 * 2, 2 * var9);
                                      if (var10 == 0) {
                                        break L3;
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                if (param2) {
                                  break L3;
                                } else {
                                  var9 = 4;
                                  bm.field_S[var8].d(-var9 + var5, -var9 + var7, 2 * var9, 2 * var9, 128);
                                  if (var10 == 0) {
                                    break L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            if (param2) {
                              break L3;
                            } else {
                              var9 = 2;
                              vi.field_gb[var8].d(var5 - var9, var7 - var9, var9 * 2, 2 * var9, 128);
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        if (param2) {
                          break L3;
                        } else {
                          var9 = 16;
                          vi.field_gb[var8].d(var5 + -var9, var7 + -var9, var9 * 2, 2 * var9, 128);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (!param2) {
                      break L3;
                    } else {
                      L16: {
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
                          break L16;
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
                          break L16;
                        }
                      }
                      ((ek) (Object) stackIn_57_0).a(stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4, stackIn_57_5);
                      break L3;
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

    final static boolean g(int param0) {
        if (param0 != 2) {
            qb.a(-13, 21, (byte) 84, -39, 29, 95);
        }
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
                L4: {
                  if (((qb) this).field_G) {
                    break L4;
                  } else {
                    if (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4) > -(((qb) this).field_B >> 4)) {
                      L5: {
                        L6: {
                          if (((qb) this).field_z.field_ab.b(51) != 2) {
                            break L6;
                          } else {
                            if (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4) > 2048) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          L8: {
                            if (((qb) this).field_M == 2) {
                              break L8;
                            } else {
                              if (3 == ((qb) this).field_M) {
                                break L8;
                              } else {
                                if (((qb) this).field_M == 9) {
                                  break L8;
                                } else {
                                  if (10 == ((qb) this).field_M) {
                                    break L8;
                                  } else {
                                    if (((qb) this).field_M != 6) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (~((qb) this).field_z.field_ab.b((byte) 126, ((qb) this).field_F >> 4) == ~((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4)) {
                            break L3;
                          } else {
                            break L7;
                          }
                        }
                        ((qb) this).field_B = -(((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4) << 4);
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                      ((qb) this).field_F = ((qb) this).field_F - ((qb) this).field_A;
                      ((qb) this).field_A = 0;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (((qb) this).field_z.field_ab.b((byte) 122, ((qb) this).field_F >> 4) >= -(((qb) this).field_B >> 4)) {
                  break L3;
                } else {
                  L9: {
                    L10: {
                      L11: {
                        if (((qb) this).field_M == 2) {
                          break L11;
                        } else {
                          if (((qb) this).field_M == 3) {
                            break L11;
                          } else {
                            if (((qb) this).field_M == 9) {
                              break L11;
                            } else {
                              if (((qb) this).field_M == 10) {
                                break L11;
                              } else {
                                if (((qb) this).field_M != 6) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (((qb) this).field_z.field_ab.b((byte) 127, ((qb) this).field_F >> 4) == ((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4)) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                    ((qb) this).field_B = -(((qb) this).field_z.field_ab.b((byte) 118, ((qb) this).field_F >> 4) << 4);
                    break L9;
                  }
                  if (~((qb) this).field_z.field_ab.b((byte) 120, ((qb) this).field_F >> 4) == ~((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 4)) {
                    ((qb) this).field_G = false;
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
          L12: {
            L13: {
              if (((qb) this).field_M == 10) {
                break L13;
              } else {
                ((qb) this).field_A = ((qb) this).field_A * 9 / 10;
                ((qb) this).field_O = ((qb) this).field_O * 9 / 10;
                if (var3 == 0) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            ((qb) this).field_O = ((qb) this).field_O + ((qb) this).field_z.field_z;
            var2 = nk.a(9, 0, ((qb) this).field_z, 105, ((qb) this).field_B, ((qb) this).field_G, 100, 0, ((qb) this).field_F, ((qb) this).field_P);
            ((qb) this).field_z.field_O.a(3, (ck) (Object) var2);
            break L12;
          }
          L14: {
            ((qb) this).field_I = ((qb) this).field_I + 1;
            if (~((qb) this).field_I < ~((qb) this).field_D) {
              ((qb) this).field_z.field_J.a((byte) 110, (kd) this);
              break L14;
            } else {
              break L14;
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
            throw ci.a((Throwable) (Object) runtimeException, "qb.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
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
        Object stackIn_303_0 = null;
        StringBuilder stackIn_303_1 = null;
        Object stackIn_304_0 = null;
        StringBuilder stackIn_304_1 = null;
        Object stackIn_305_0 = null;
        StringBuilder stackIn_305_1 = null;
        String stackIn_305_2 = null;
        Object stackIn_306_0 = null;
        StringBuilder stackIn_306_1 = null;
        Object stackIn_307_0 = null;
        StringBuilder stackIn_307_1 = null;
        Object stackIn_308_0 = null;
        StringBuilder stackIn_308_1 = null;
        String stackIn_308_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_302_0 = null;
        StringBuilder stackOut_302_1 = null;
        Object stackOut_304_0 = null;
        StringBuilder stackOut_304_1 = null;
        String stackOut_304_2 = null;
        Object stackOut_303_0 = null;
        StringBuilder stackOut_303_1 = null;
        String stackOut_303_2 = null;
        Object stackOut_305_0 = null;
        StringBuilder stackOut_305_1 = null;
        Object stackOut_307_0 = null;
        StringBuilder stackOut_307_1 = null;
        String stackOut_307_2 = null;
        Object stackOut_306_0 = null;
        StringBuilder stackOut_306_1 = null;
        String stackOut_306_2 = null;
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
              if (param2 == -93) {
                break L4;
              } else {
                field_C = null;
                break L4;
              }
            }
            L5: {
              L6: {
                param1.field_Pb.d();
                if (param0.field_Q == 1) {
                  break L6;
                } else {
                  L7: {
                    var8 = param4 / 2;
                    var9 = param5 / 2;
                    if (param0.field_Q != 16) {
                      break L7;
                    } else {
                      var8 -= 10;
                      break L7;
                    }
                  }
                  L8: {
                    var10 = hj.field_w;
                    if (param0.field_N == 31) {
                      var8 -= 20;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (64 == param0.field_Q) {
                      var8 -= 20;
                      var9 += 7;
                      hj.field_w = 2048;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param0.field_Q == 128) {
                      var8 += 5;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param0.field_Q == 256) {
                      var8 += 10;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (param0.field_Q != 2) {
                      break L12;
                    } else {
                      var8 -= 10;
                      var9 += 10;
                      break L12;
                    }
                  }
                  L13: {
                    if (param0.field_N != 95) {
                      break L13;
                    } else {
                      var8 -= 20;
                      break L13;
                    }
                  }
                  L14: {
                    if (4 != param0.field_Q) {
                      break L14;
                    } else {
                      var9 -= 20;
                      hj.field_w = 3072;
                      break L14;
                    }
                  }
                  L15: {
                    if (param0.field_N == 76) {
                      var8 -= 20;
                      param0 = ul.a(102, (byte) 67);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (66 == param0.field_N) {
                      var8 -= 20;
                      param0 = ul.a(99, (byte) 67);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (param0.field_Q != 2048) {
                      break L17;
                    } else {
                      var9 -= 20;
                      hj.field_w = 2048;
                      break L17;
                    }
                  }
                  L18: {
                    if (param0.field_N != 80) {
                      break L18;
                    } else {
                      var8 -= 10;
                      var9 += 10;
                      break L18;
                    }
                  }
                  L19: {
                    if (param0.field_Q == 8) {
                      var9 += 20;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (param0.field_N == 59) {
                      var9 -= 25;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (param0.field_N == 71) {
                      var9 -= 15;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (77 != param0.field_N) {
                      break L22;
                    } else {
                      var9 -= 10;
                      break L22;
                    }
                  }
                  L23: {
                    L24: {
                      L25: {
                        L26: {
                          L27: {
                            L28: {
                              L29: {
                                L30: {
                                  L31: {
                                    L32: {
                                      L33: {
                                        L34: {
                                          L35: {
                                            L36: {
                                              L37: {
                                                L38: {
                                                  L39: {
                                                    L40: {
                                                      L41: {
                                                        L42: {
                                                          L43: {
                                                            L44: {
                                                              L45: {
                                                                L46: {
                                                                  L47: {
                                                                    L48: {
                                                                      L49: {
                                                                        L50: {
                                                                          L51: {
                                                                            L52: {
                                                                              L53: {
                                                                                L54: {
                                                                                  L55: {
                                                                                    L56: {
                                                                                      L57: {
                                                                                        L58: {
                                                                                          L59: {
                                                                                            L60: {
                                                                                              L61: {
                                                                                                L62: {
                                                                                                  L63: {
                                                                                                    L64: {
                                                                                                      L65: {
                                                                                                        L66: {
                                                                                                          L67: {
                                                                                                            L68: {
                                                                                                              L69: {
                                                                                                                L70: {
                                                                                                                  L71: {
                                                                                                                    L72: {
                                                                                                                      L73: {
                                                                                                                        L74: {
                                                                                                                          L75: {
                                                                                                                            var11 = param0.field_N;
                                                                                                                            if (1 == var11) {
                                                                                                                              break L75;
                                                                                                                            } else {
                                                                                                                              L76: {
                                                                                                                                if (53 != var11) {
                                                                                                                                  break L76;
                                                                                                                                } else {
                                                                                                                                  if (var12 == 0) {
                                                                                                                                    break L74;
                                                                                                                                  } else {
                                                                                                                                    break L76;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              L77: {
                                                                                                                                if (60 != var11) {
                                                                                                                                  break L77;
                                                                                                                                } else {
                                                                                                                                  if (var12 == 0) {
                                                                                                                                    break L73;
                                                                                                                                  } else {
                                                                                                                                    break L77;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              if (var11 == 61) {
                                                                                                                                break L72;
                                                                                                                              } else {
                                                                                                                                L78: {
                                                                                                                                  if (var11 != 64) {
                                                                                                                                    break L78;
                                                                                                                                  } else {
                                                                                                                                    if (var12 == 0) {
                                                                                                                                      break L71;
                                                                                                                                    } else {
                                                                                                                                      break L78;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                if (68 == var11) {
                                                                                                                                  break L70;
                                                                                                                                } else {
                                                                                                                                  L79: {
                                                                                                                                    if (var11 != 74) {
                                                                                                                                      break L79;
                                                                                                                                    } else {
                                                                                                                                      if (var12 == 0) {
                                                                                                                                        break L69;
                                                                                                                                      } else {
                                                                                                                                        break L79;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  if (var11 == 78) {
                                                                                                                                    break L68;
                                                                                                                                  } else {
                                                                                                                                    L80: {
                                                                                                                                      if (var11 != 82) {
                                                                                                                                        break L80;
                                                                                                                                      } else {
                                                                                                                                        if (var12 == 0) {
                                                                                                                                          break L67;
                                                                                                                                        } else {
                                                                                                                                          break L80;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    if (var11 == 87) {
                                                                                                                                      break L66;
                                                                                                                                    } else {
                                                                                                                                      L81: {
                                                                                                                                        if (var11 != 91) {
                                                                                                                                          break L81;
                                                                                                                                        } else {
                                                                                                                                          if (var12 == 0) {
                                                                                                                                            break L65;
                                                                                                                                          } else {
                                                                                                                                            break L81;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      L82: {
                                                                                                                                        if (95 != var11) {
                                                                                                                                          break L82;
                                                                                                                                        } else {
                                                                                                                                          if (var12 == 0) {
                                                                                                                                            break L64;
                                                                                                                                          } else {
                                                                                                                                            break L82;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      if (var11 == 2) {
                                                                                                                                        break L63;
                                                                                                                                      } else {
                                                                                                                                        if (var11 == 56) {
                                                                                                                                          break L62;
                                                                                                                                        } else {
                                                                                                                                          L83: {
                                                                                                                                            if (var11 != 66) {
                                                                                                                                              break L83;
                                                                                                                                            } else {
                                                                                                                                              if (var12 == 0) {
                                                                                                                                                break L61;
                                                                                                                                              } else {
                                                                                                                                                break L83;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          if (var11 == 99) {
                                                                                                                                            break L61;
                                                                                                                                          } else {
                                                                                                                                            L84: {
                                                                                                                                              if (var11 != 70) {
                                                                                                                                                break L84;
                                                                                                                                              } else {
                                                                                                                                                if (var12 == 0) {
                                                                                                                                                  break L60;
                                                                                                                                                } else {
                                                                                                                                                  break L84;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                            if (var11 == 76) {
                                                                                                                                              break L59;
                                                                                                                                            } else {
                                                                                                                                              if (var11 == 102) {
                                                                                                                                                break L59;
                                                                                                                                              } else {
                                                                                                                                                if (var11 == 85) {
                                                                                                                                                  break L58;
                                                                                                                                                } else {
                                                                                                                                                  L85: {
                                                                                                                                                    if (80 != var11) {
                                                                                                                                                      break L85;
                                                                                                                                                    } else {
                                                                                                                                                      if (var12 == 0) {
                                                                                                                                                        break L57;
                                                                                                                                                      } else {
                                                                                                                                                        break L85;
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                  if (89 == var11) {
                                                                                                                                                    break L56;
                                                                                                                                                  } else {
                                                                                                                                                    if (var11 == 93) {
                                                                                                                                                      break L55;
                                                                                                                                                    } else {
                                                                                                                                                      L86: {
                                                                                                                                                        if (var11 != 3) {
                                                                                                                                                          break L86;
                                                                                                                                                        } else {
                                                                                                                                                          if (var12 == 0) {
                                                                                                                                                            break L54;
                                                                                                                                                          } else {
                                                                                                                                                            break L86;
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                      if (54 == var11) {
                                                                                                                                                        break L53;
                                                                                                                                                      } else {
                                                                                                                                                        if (var11 == 67) {
                                                                                                                                                          break L52;
                                                                                                                                                        } else {
                                                                                                                                                          L87: {
                                                                                                                                                            if (var11 != 71) {
                                                                                                                                                              break L87;
                                                                                                                                                            } else {
                                                                                                                                                              if (var12 == 0) {
                                                                                                                                                                break L51;
                                                                                                                                                              } else {
                                                                                                                                                                break L87;
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                          if (var11 == 73) {
                                                                                                                                                            break L50;
                                                                                                                                                          } else {
                                                                                                                                                            L88: {
                                                                                                                                                              if (var11 != 77) {
                                                                                                                                                                break L88;
                                                                                                                                                              } else {
                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                  break L49;
                                                                                                                                                                } else {
                                                                                                                                                                  break L88;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            L89: {
                                                                                                                                                              if (81 != var11) {
                                                                                                                                                                break L89;
                                                                                                                                                              } else {
                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                  break L48;
                                                                                                                                                                } else {
                                                                                                                                                                  break L89;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            if (86 == var11) {
                                                                                                                                                              break L47;
                                                                                                                                                            } else {
                                                                                                                                                              if (var11 == 90) {
                                                                                                                                                                break L46;
                                                                                                                                                              } else {
                                                                                                                                                                L90: {
                                                                                                                                                                  if (var11 != 83) {
                                                                                                                                                                    break L90;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (var12 == 0) {
                                                                                                                                                                      break L45;
                                                                                                                                                                    } else {
                                                                                                                                                                      break L90;
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                                L91: {
                                                                                                                                                                  if (var11 != 28) {
                                                                                                                                                                    break L91;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (var12 == 0) {
                                                                                                                                                                      break L44;
                                                                                                                                                                    } else {
                                                                                                                                                                      break L91;
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                                L92: {
                                                                                                                                                                  if (var11 != 29) {
                                                                                                                                                                    break L92;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (var12 == 0) {
                                                                                                                                                                      break L43;
                                                                                                                                                                    } else {
                                                                                                                                                                      break L92;
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                                if (var11 == 30) {
                                                                                                                                                                  break L42;
                                                                                                                                                                } else {
                                                                                                                                                                  L93: {
                                                                                                                                                                    if (var11 != 31) {
                                                                                                                                                                      break L93;
                                                                                                                                                                    } else {
                                                                                                                                                                      if (var12 == 0) {
                                                                                                                                                                        break L41;
                                                                                                                                                                      } else {
                                                                                                                                                                        break L93;
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                  if (var11 == 35) {
                                                                                                                                                                    break L40;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (var11 == 32) {
                                                                                                                                                                      break L39;
                                                                                                                                                                    } else {
                                                                                                                                                                      L94: {
                                                                                                                                                                        if (var11 != 33) {
                                                                                                                                                                          break L94;
                                                                                                                                                                        } else {
                                                                                                                                                                          if (var12 == 0) {
                                                                                                                                                                            break L38;
                                                                                                                                                                          } else {
                                                                                                                                                                            break L94;
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                      if (34 == var11) {
                                                                                                                                                                        break L37;
                                                                                                                                                                      } else {
                                                                                                                                                                        L95: {
                                                                                                                                                                          if (var11 != 38) {
                                                                                                                                                                            break L95;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (var12 == 0) {
                                                                                                                                                                              break L36;
                                                                                                                                                                            } else {
                                                                                                                                                                              break L95;
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                        L96: {
                                                                                                                                                                          if (43 != var11) {
                                                                                                                                                                            break L96;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (var12 == 0) {
                                                                                                                                                                              break L35;
                                                                                                                                                                            } else {
                                                                                                                                                                              break L96;
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                        if (var11 == 48) {
                                                                                                                                                                          break L34;
                                                                                                                                                                        } else {
                                                                                                                                                                          if (var11 == 52) {
                                                                                                                                                                            break L33;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (var11 == 46) {
                                                                                                                                                                              break L32;
                                                                                                                                                                            } else {
                                                                                                                                                                              L97: {
                                                                                                                                                                                if (var11 != 45) {
                                                                                                                                                                                  break L97;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (var12 == 0) {
                                                                                                                                                                                    break L31;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    break L97;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                              if (var11 == 44) {
                                                                                                                                                                                break L30;
                                                                                                                                                                              } else {
                                                                                                                                                                                L98: {
                                                                                                                                                                                  if (47 != var11) {
                                                                                                                                                                                    break L98;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (var12 == 0) {
                                                                                                                                                                                      break L29;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      break L98;
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                                L99: {
                                                                                                                                                                                  if (var11 != 36) {
                                                                                                                                                                                    break L99;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (var12 == 0) {
                                                                                                                                                                                      break L28;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      break L99;
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                                if (37 == var11) {
                                                                                                                                                                                  break L27;
                                                                                                                                                                                } else {
                                                                                                                                                                                  L100: {
                                                                                                                                                                                    if (51 != var11) {
                                                                                                                                                                                      break L100;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (var12 == 0) {
                                                                                                                                                                                        break L26;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        break L100;
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                  L101: {
                                                                                                                                                                                    if (var11 != 50) {
                                                                                                                                                                                      break L101;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (var12 == 0) {
                                                                                                                                                                                        break L25;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        break L101;
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                  if (var11 != 49) {
                                                                                                                                                                                    break L23;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (var12 == 0) {
                                                                                                                                                                                      break L24;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      break L75;
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          var8 += 5;
                                                                                                                          var9 -= 8;
                                                                                                                          if (var12 == 0) {
                                                                                                                            break L23;
                                                                                                                          } else {
                                                                                                                            break L74;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        var9 += 2;
                                                                                                                        var8 -= 7;
                                                                                                                        if (var12 == 0) {
                                                                                                                          break L23;
                                                                                                                        } else {
                                                                                                                          break L73;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      var9 -= 4;
                                                                                                                      var8 += 10;
                                                                                                                      if (var12 == 0) {
                                                                                                                        break L23;
                                                                                                                      } else {
                                                                                                                        break L72;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    var9 -= 5;
                                                                                                                    var8 -= 4;
                                                                                                                    if (var12 == 0) {
                                                                                                                      break L23;
                                                                                                                    } else {
                                                                                                                      break L71;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  var9 -= 6;
                                                                                                                  if (var12 == 0) {
                                                                                                                    break L23;
                                                                                                                  } else {
                                                                                                                    break L70;
                                                                                                                  }
                                                                                                                }
                                                                                                                var8 += 4;
                                                                                                                var9 -= 10;
                                                                                                                if (var12 == 0) {
                                                                                                                  break L23;
                                                                                                                } else {
                                                                                                                  break L69;
                                                                                                                }
                                                                                                              }
                                                                                                              var9 -= 10;
                                                                                                              var8 -= 8;
                                                                                                              if (var12 == 0) {
                                                                                                                break L23;
                                                                                                              } else {
                                                                                                                break L68;
                                                                                                              }
                                                                                                            }
                                                                                                            var9 -= 2;
                                                                                                            if (var12 == 0) {
                                                                                                              break L23;
                                                                                                            } else {
                                                                                                              break L67;
                                                                                                            }
                                                                                                          }
                                                                                                          var8 -= 4;
                                                                                                          var9 += 9;
                                                                                                          if (var12 == 0) {
                                                                                                            break L23;
                                                                                                          } else {
                                                                                                            break L66;
                                                                                                          }
                                                                                                        }
                                                                                                        var9 -= 3;
                                                                                                        if (var12 == 0) {
                                                                                                          break L23;
                                                                                                        } else {
                                                                                                          break L65;
                                                                                                        }
                                                                                                      }
                                                                                                      hj.field_w = 3000;
                                                                                                      var8 += 8;
                                                                                                      if (var12 == 0) {
                                                                                                        break L23;
                                                                                                      } else {
                                                                                                        break L64;
                                                                                                      }
                                                                                                    }
                                                                                                    var9 += 10;
                                                                                                    hj.field_w = 3300;
                                                                                                    var8 += 4;
                                                                                                    if (var12 == 0) {
                                                                                                      break L23;
                                                                                                    } else {
                                                                                                      break L63;
                                                                                                    }
                                                                                                  }
                                                                                                  var8 -= 7;
                                                                                                  var9 += 8;
                                                                                                  if (var12 == 0) {
                                                                                                    break L23;
                                                                                                  } else {
                                                                                                    break L62;
                                                                                                  }
                                                                                                }
                                                                                                var9--;
                                                                                                hj.field_w = 2500;
                                                                                                if (var12 == 0) {
                                                                                                  break L23;
                                                                                                } else {
                                                                                                  break L61;
                                                                                                }
                                                                                              }
                                                                                              var9 += 4;
                                                                                              hj.field_w = 2500;
                                                                                              if (var12 == 0) {
                                                                                                break L23;
                                                                                              } else {
                                                                                                break L60;
                                                                                              }
                                                                                            }
                                                                                            var9 += 4;
                                                                                            var8 -= 4;
                                                                                            if (var12 == 0) {
                                                                                              break L23;
                                                                                            } else {
                                                                                              break L59;
                                                                                            }
                                                                                          }
                                                                                          hj.field_w = 2700;
                                                                                          if (var12 == 0) {
                                                                                            break L23;
                                                                                          } else {
                                                                                            break L58;
                                                                                          }
                                                                                        }
                                                                                        var9 += 10;
                                                                                        if (var12 == 0) {
                                                                                          break L23;
                                                                                        } else {
                                                                                          break L57;
                                                                                        }
                                                                                      }
                                                                                      var8 += 4;
                                                                                      var9 += 2;
                                                                                      if (var12 == 0) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        break L56;
                                                                                      }
                                                                                    }
                                                                                    var9 += 8;
                                                                                    var8 += 6;
                                                                                    hj.field_w = 1600;
                                                                                    if (var12 == 0) {
                                                                                      break L23;
                                                                                    } else {
                                                                                      break L55;
                                                                                    }
                                                                                  }
                                                                                  var9 += 2;
                                                                                  hj.field_w = 1024;
                                                                                  var8 -= 2;
                                                                                  if (var12 == 0) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    break L54;
                                                                                  }
                                                                                }
                                                                                var8 += 12;
                                                                                var9 -= 4;
                                                                                if (var12 == 0) {
                                                                                  break L23;
                                                                                } else {
                                                                                  break L53;
                                                                                }
                                                                              }
                                                                              var9 -= 14;
                                                                              if (var12 == 0) {
                                                                                break L23;
                                                                              } else {
                                                                                break L52;
                                                                              }
                                                                            }
                                                                            var9 -= 10;
                                                                            var8 += 12;
                                                                            if (var12 == 0) {
                                                                              break L23;
                                                                            } else {
                                                                              break L51;
                                                                            }
                                                                          }
                                                                          var9 -= 8;
                                                                          var8 -= 15;
                                                                          if (var12 == 0) {
                                                                            break L23;
                                                                          } else {
                                                                            break L50;
                                                                          }
                                                                        }
                                                                        hj.field_w = 2900;
                                                                        if (var12 == 0) {
                                                                          break L23;
                                                                        } else {
                                                                          break L49;
                                                                        }
                                                                      }
                                                                      var9 -= 4;
                                                                      var8 += 13;
                                                                      if (var12 == 0) {
                                                                        break L23;
                                                                      } else {
                                                                        break L48;
                                                                      }
                                                                    }
                                                                    hj.field_w = 3000;
                                                                    var9 -= 2;
                                                                    if (var12 == 0) {
                                                                      break L23;
                                                                    } else {
                                                                      break L47;
                                                                    }
                                                                  }
                                                                  hj.field_w = 2300;
                                                                  var8 += 25;
                                                                  if (var12 == 0) {
                                                                    break L23;
                                                                  } else {
                                                                    break L46;
                                                                  }
                                                                }
                                                                var9 -= 6;
                                                                if (var12 == 0) {
                                                                  break L23;
                                                                } else {
                                                                  break L45;
                                                                }
                                                              }
                                                              var8 += 8;
                                                              if (var12 == 0) {
                                                                break L23;
                                                              } else {
                                                                break L44;
                                                              }
                                                            }
                                                            var8 += 4;
                                                            if (var12 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L43;
                                                            }
                                                          }
                                                          var8 += 3;
                                                          if (var12 == 0) {
                                                            break L23;
                                                          } else {
                                                            break L42;
                                                          }
                                                        }
                                                        var8 += 3;
                                                        var9 -= 4;
                                                        if (var12 == 0) {
                                                          break L23;
                                                        } else {
                                                          break L41;
                                                        }
                                                      }
                                                      var8 -= 3;
                                                      hj.field_w = 2800;
                                                      if (var12 == 0) {
                                                        break L23;
                                                      } else {
                                                        break L40;
                                                      }
                                                    }
                                                    hj.field_w = 3500;
                                                    var8 -= 2;
                                                    if (var12 == 0) {
                                                      break L23;
                                                    } else {
                                                      break L39;
                                                    }
                                                  }
                                                  hj.field_w = 2800;
                                                  var8 -= 10;
                                                  if (var12 == 0) {
                                                    break L23;
                                                  } else {
                                                    break L38;
                                                  }
                                                }
                                                var8 -= 3;
                                                hj.field_w = 3800;
                                                if (var12 == 0) {
                                                  break L23;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                              var8 -= 4;
                                              hj.field_w = 3800;
                                              if (var12 == 0) {
                                                break L23;
                                              } else {
                                                break L36;
                                              }
                                            }
                                            hj.field_w = 3900;
                                            var8 -= 2;
                                            if (var12 == 0) {
                                              break L23;
                                            } else {
                                              break L35;
                                            }
                                          }
                                          var8 += 8;
                                          if (var12 == 0) {
                                            break L23;
                                          } else {
                                            break L34;
                                          }
                                        }
                                        var9--;
                                        var8 += 4;
                                        if (var12 == 0) {
                                          break L23;
                                        } else {
                                          break L33;
                                        }
                                      }
                                      var8 += 3;
                                      hj.field_w = 1800;
                                      if (var12 == 0) {
                                        break L23;
                                      } else {
                                        break L32;
                                      }
                                    }
                                    var8 += 4;
                                    hj.field_w = 1800;
                                    if (var12 == 0) {
                                      break L23;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  var8 += 2;
                                  hj.field_w = 1550;
                                  if (var12 == 0) {
                                    break L23;
                                  } else {
                                    break L30;
                                  }
                                }
                                var9 -= 2;
                                var8 += 7;
                                if (var12 == 0) {
                                  break L23;
                                } else {
                                  break L29;
                                }
                              }
                              var8 += 4;
                              if (var12 == 0) {
                                break L23;
                              } else {
                                break L28;
                              }
                            }
                            hj.field_w = 3600;
                            if (var12 == 0) {
                              break L23;
                            } else {
                              break L27;
                            }
                          }
                          hj.field_w = 3600;
                          if (var12 == 0) {
                            break L23;
                          } else {
                            break L26;
                          }
                        }
                        hj.field_w = 3600;
                        if (var12 == 0) {
                          break L23;
                        } else {
                          break L25;
                        }
                      }
                      hj.field_w = 3600;
                      if (var12 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                    var8 += 3;
                    hj.field_w = 2200;
                    break L23;
                  }
                  L102: {
                    if ((3086 & param0.field_Q) == 0) {
                      break L102;
                    } else {
                      if (param4 <= 100) {
                        break L102;
                      } else {
                        var8 -= 5;
                        break L102;
                      }
                    }
                  }
                  param0.a(0, false, var8, var9, (byte) 49, 16384);
                  hj.field_w = var10;
                  if (var12 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L103: {
                var8 = hj.field_w;
                if (param0.field_N != 0) {
                  break L103;
                } else {
                  hj.field_w = 1200;
                  break L103;
                }
              }
              L104: {
                if (55 != param0.field_N) {
                  break L104;
                } else {
                  hj.field_w = 1200;
                  break L104;
                }
              }
              L105: {
                if (57 == param0.field_N) {
                  hj.field_w = 1300;
                  break L105;
                } else {
                  break L105;
                }
              }
              L106: {
                if (param0.field_N != 62) {
                  break L106;
                } else {
                  hj.field_w = 1400;
                  break L106;
                }
              }
              L107: {
                if (65 != param0.field_N) {
                  break L107;
                } else {
                  hj.field_w = 1000;
                  break L107;
                }
              }
              L108: {
                if (param0.field_N != 69) {
                  break L108;
                } else {
                  hj.field_w = 1400;
                  break L108;
                }
              }
              L109: {
                if (72 != param0.field_N) {
                  break L109;
                } else {
                  hj.field_w = 1000;
                  break L109;
                }
              }
              L110: {
                if (param0.field_N == 75) {
                  hj.field_w = 1000;
                  break L110;
                } else {
                  break L110;
                }
              }
              L111: {
                if (param0.field_N != 79) {
                  break L111;
                } else {
                  hj.field_w = 1000;
                  break L111;
                }
              }
              L112: {
                if (param0.field_N != 84) {
                  break L112;
                } else {
                  hj.field_w = 1000;
                  break L112;
                }
              }
              L113: {
                if (param0.field_N != 88) {
                  break L113;
                } else {
                  hj.field_w = 1000;
                  break L113;
                }
              }
              L114: {
                if (param0.field_N == 92) {
                  hj.field_w = 700;
                  break L114;
                } else {
                  break L114;
                }
              }
              param0.a(0, false, param4 / 2, param5, (byte) 49, 0);
              hj.field_w = var8;
              break L5;
            }
            sb.field_bb.b((byte) 123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L115: {
            var6 = (Object) (Object) decompiledCaughtException;
            stackOut_302_0 = var6;
            stackOut_302_1 = new StringBuilder().append("qb.D(");
            stackIn_304_0 = stackOut_302_0;
            stackIn_304_1 = stackOut_302_1;
            stackIn_303_0 = stackOut_302_0;
            stackIn_303_1 = stackOut_302_1;
            if (param0 == null) {
              stackOut_304_0 = stackIn_304_0;
              stackOut_304_1 = (StringBuilder) (Object) stackIn_304_1;
              stackOut_304_2 = "null";
              stackIn_305_0 = stackOut_304_0;
              stackIn_305_1 = stackOut_304_1;
              stackIn_305_2 = stackOut_304_2;
              break L115;
            } else {
              stackOut_303_0 = stackIn_303_0;
              stackOut_303_1 = (StringBuilder) (Object) stackIn_303_1;
              stackOut_303_2 = "{...}";
              stackIn_305_0 = stackOut_303_0;
              stackIn_305_1 = stackOut_303_1;
              stackIn_305_2 = stackOut_303_2;
              break L115;
            }
          }
          L116: {
            stackOut_305_0 = stackIn_305_0;
            stackOut_305_1 = ((StringBuilder) (Object) stackIn_305_1).append(stackIn_305_2).append(44);
            stackIn_307_0 = stackOut_305_0;
            stackIn_307_1 = stackOut_305_1;
            stackIn_306_0 = stackOut_305_0;
            stackIn_306_1 = stackOut_305_1;
            if (param1 == null) {
              stackOut_307_0 = stackIn_307_0;
              stackOut_307_1 = (StringBuilder) (Object) stackIn_307_1;
              stackOut_307_2 = "null";
              stackIn_308_0 = stackOut_307_0;
              stackIn_308_1 = stackOut_307_1;
              stackIn_308_2 = stackOut_307_2;
              break L116;
            } else {
              stackOut_306_0 = stackIn_306_0;
              stackOut_306_1 = (StringBuilder) (Object) stackIn_306_1;
              stackOut_306_2 = "{...}";
              stackIn_308_0 = stackOut_306_0;
              stackIn_308_1 = stackOut_306_1;
              stackIn_308_2 = stackOut_306_2;
              break L116;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_308_0, stackIn_308_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
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
