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
        }
        try {
            field_C = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "qb.E(" + param0 + ')');
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
                L5: {
                  if (var10 >= var8) {
                    break L5;
                  } else {
                    pb.f(param4 + (-param1 + var10), param3 - param1, var9, 0, 100);
                    var10 += 2;
                    if (var11 != 0) {
                      break L4;
                    } else {
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var6, "qb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ek stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        int stackIn_119_4 = 0;
        ek stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        int stackIn_121_4 = 0;
        ek stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        int stackIn_122_3 = 0;
        int stackIn_122_4 = 0;
        int stackIn_122_5 = 0;
        RuntimeException decompiledCaughtException = null;
        ek stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        int stackOut_118_4 = 0;
        ek stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_121_3 = 0;
        int stackOut_121_4 = 0;
        int stackOut_121_5 = 0;
        ek stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        int stackOut_119_4 = 0;
        int stackOut_119_5 = 0;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var5_int = (((qb) this).field_F >> -510533528) + param0;
              var6 = -124 / ((-25 - param3) / 54);
              var7 = (((qb) this).field_B >> 333824392) + param1;
              if (var5_int < -32) {
                break L1;
              } else {
                if (var5_int > 672) {
                  break L1;
                } else {
                  if (var7 < -32) {
                    break L1;
                  } else {
                    if (var7 > 672) {
                      break L1;
                    } else {
                      L2: {
                        var8 = ((qb) this).field_I * 8 / ((qb) this).field_D;
                        if (var8 < 0) {
                          var8 = 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (var8 > 7) {
                          var8 = 7;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (((qb) this).field_M == 0) {
                            break L5;
                          } else {
                            L6: {
                              if (((qb) this).field_M == 1) {
                                break L6;
                              } else {
                                L7: {
                                  if (((qb) this).field_M == 3) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (((qb) this).field_M != 2) {
                                        break L8;
                                      } else {
                                        if (!param2) {
                                          break L4;
                                        } else {
                                          var8 = Math.max(0, Math.min(15, 16 * ((qb) this).field_I / ((qb) this).field_D));
                                          var9 = 2;
                                          cc.field_pc[var8].c(-var9 + var5_int, -var9 + var7, 2 * var9, 2 * var9);
                                          if (var10 == 0) {
                                            break L4;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                    L9: {
                                      if (((qb) this).field_M != 4) {
                                        break L9;
                                      } else {
                                        if (param2) {
                                          break L4;
                                        } else {
                                          var9 = 16;
                                          bm.field_S[var8].d(-var9 + var5_int, -var9 + var7, var9 * 2, 2 * var9, 128);
                                          if (var10 == 0) {
                                            break L4;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    L10: {
                                      if (((qb) this).field_M == 5) {
                                        break L10;
                                      } else {
                                        L11: {
                                          if (((qb) this).field_M != 6) {
                                            break L11;
                                          } else {
                                            if (param2) {
                                              break L4;
                                            } else {
                                              var9 = 2;
                                              bm.field_S[var8].d(-var9 + var5_int, var7 + -var9, var9 * 2, 2 * var9, 128);
                                              if (var10 == 0) {
                                                break L4;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                        L12: {
                                          if (7 != ((qb) this).field_M) {
                                            break L12;
                                          } else {
                                            if (!param2) {
                                              var9 = 1;
                                              vi.field_gb[var8].d(-var9 + var5_int, var7 + -var9, 2 * var9, var9 * 2, 128);
                                              if (var10 == 0) {
                                                break L4;
                                              } else {
                                                break L12;
                                              }
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                        L13: {
                                          if (((qb) this).field_M == 8) {
                                            break L13;
                                          } else {
                                            L14: {
                                              if (((qb) this).field_M != 9) {
                                                break L14;
                                              } else {
                                                if (param2) {
                                                  break L4;
                                                } else {
                                                  var9 = 4;
                                                  vi.field_gb[7 + -var8].a(-var9 + var5_int, -var9 + var7, var9 * 2, var9 * 2, 200 + -(((qb) this).field_I * 200 / ((qb) this).field_D));
                                                  if (var10 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                            }
                                            L15: {
                                              if (12 != ((qb) this).field_M) {
                                                break L15;
                                              } else {
                                                if (!param2) {
                                                  var9 = 2;
                                                  bm.field_S[2 & var8].d(var5_int - var9, -var9 + var7, 2 * var9, 2 * var9, -(((qb) this).field_I * 250 / ((qb) this).field_D) + 250);
                                                  if (var10 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L15;
                                                  }
                                                } else {
                                                  break L4;
                                                }
                                              }
                                            }
                                            L16: {
                                              if (((qb) this).field_M == 13) {
                                                break L16;
                                              } else {
                                                if (((qb) this).field_M != 14) {
                                                  break L4;
                                                } else {
                                                  if (param2) {
                                                    break L4;
                                                  } else {
                                                    var9 = (500 + -(2 * ((qb) this).field_I)) / 125;
                                                    pb.a(var5_int << 759095524, var7 << -2109422300, var9 << 1724654468, 31, hc.field_W);
                                                    if (var10 == 0) {
                                                      break L4;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (!param2) {
                                              var9 = 16;
                                              pb.a(var5_int << 833743716, var7 << -865814940, var9 << -1094477020, 249, hc.field_X);
                                              if (var10 == 0) {
                                                break L4;
                                              } else {
                                                break L13;
                                              }
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                        if (!param2) {
                                          var8 = Math.max(0, Math.min(15, 16 * ((qb) this).field_I / ((qb) this).field_D));
                                          var9 = 4;
                                          cc.field_pc[var8].c(var5_int - var9, var7 - var9, var9 * 2, 2 * var9);
                                          if (var10 == 0) {
                                            break L4;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                    if (param2) {
                                      break L4;
                                    } else {
                                      var9 = 4;
                                      bm.field_S[var8].d(-var9 + var5_int, -var9 + var7, 2 * var9, 2 * var9, 128);
                                      if (var10 == 0) {
                                        break L4;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                if (param2) {
                                  break L4;
                                } else {
                                  var9 = 2;
                                  vi.field_gb[var8].d(var5_int - var9, var7 - var9, var9 * 2, 2 * var9, 128);
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            if (param2) {
                              break L4;
                            } else {
                              var9 = 16;
                              vi.field_gb[var8].d(var5_int + -var9, var7 + -var9, var9 * 2, 2 * var9, 128);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        if (!param2) {
                          break L4;
                        } else {
                          L17: {
                            var8 = Math.max(0, Math.min(15, ((qb) this).field_I * 16 / ((qb) this).field_D));
                            var9 = 17;
                            stackOut_118_0 = cc.field_pc[var8];
                            stackOut_118_1 = -var9 + var5_int;
                            stackOut_118_2 = -var9 + var7;
                            stackOut_118_3 = 2 * var9;
                            stackOut_118_4 = var9 * 2;
                            stackIn_121_0 = stackOut_118_0;
                            stackIn_121_1 = stackOut_118_1;
                            stackIn_121_2 = stackOut_118_2;
                            stackIn_121_3 = stackOut_118_3;
                            stackIn_121_4 = stackOut_118_4;
                            stackIn_119_0 = stackOut_118_0;
                            stackIn_119_1 = stackOut_118_1;
                            stackIn_119_2 = stackOut_118_2;
                            stackIn_119_3 = stackOut_118_3;
                            stackIn_119_4 = stackOut_118_4;
                            if (((qb) this).field_D / 2 > ((qb) this).field_I) {
                              stackOut_121_0 = (ek) (Object) stackIn_121_0;
                              stackOut_121_1 = stackIn_121_1;
                              stackOut_121_2 = stackIn_121_2;
                              stackOut_121_3 = stackIn_121_3;
                              stackOut_121_4 = stackIn_121_4;
                              stackOut_121_5 = 255;
                              stackIn_122_0 = stackOut_121_0;
                              stackIn_122_1 = stackOut_121_1;
                              stackIn_122_2 = stackOut_121_2;
                              stackIn_122_3 = stackOut_121_3;
                              stackIn_122_4 = stackOut_121_4;
                              stackIn_122_5 = stackOut_121_5;
                              break L17;
                            } else {
                              stackOut_119_0 = (ek) (Object) stackIn_119_0;
                              stackOut_119_1 = stackIn_119_1;
                              stackOut_119_2 = stackIn_119_2;
                              stackOut_119_3 = stackIn_119_3;
                              stackOut_119_4 = stackIn_119_4;
                              stackOut_119_5 = 505 - ((qb) this).field_I * 500 / ((qb) this).field_D;
                              stackIn_122_0 = stackOut_119_0;
                              stackIn_122_1 = stackOut_119_1;
                              stackIn_122_2 = stackOut_119_2;
                              stackIn_122_3 = stackOut_119_3;
                              stackIn_122_4 = stackOut_119_4;
                              stackIn_122_5 = stackOut_119_5;
                              break L17;
                            }
                          }
                          ((ek) (Object) stackIn_122_0).a(stackIn_122_1, stackIn_122_2, stackIn_122_3, stackIn_122_4, stackIn_122_5);
                          break L4;
                        }
                      }
                      break L0;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "qb.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void i(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -15809) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            ((qb) this).field_z = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "qb.A(" + param0 + ')');
        }
    }

    final static boolean g(int param0) {
        RuntimeException var1 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_4_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                qb.a(-13, 21, (byte) 84, -39, 29, 95);
                break L1;
              }
            }
            L2: {
              if (wb.field_c != null) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = kc.field_q;
                stackIn_7_0 = stackOut_4_0 ? 1 : 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "qb.C(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        qb var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            if (((qb) this).field_z == null) {
              return;
            } else {
              L1: {
                ((qb) this).field_F = ((qb) this).field_F + ((qb) this).field_A;
                ((qb) this).field_B = ((qb) this).field_B + ((qb) this).field_O;
                if (param0 >= 1) {
                  break L1;
                } else {
                  qb.a(-116, -34, (String) null, -4, (String) null);
                  break L1;
                }
              }
              L2: {
                if (200 > ((qb) this).field_I) {
                  ((qb) this).field_I = ((qb) this).field_I + (int)(Math.random() * 4.0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((qb) this).field_z.field_ab.b(110) != 4) {
                  L4: {
                    L5: {
                      if (((qb) this).field_G) {
                        break L5;
                      } else {
                        if (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> -1931591708) > -(((qb) this).field_B >> 1824617828)) {
                          L6: {
                            L7: {
                              if (((qb) this).field_z.field_ab.b(51) != 2) {
                                break L7;
                              } else {
                                if (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> -924936188) > 2048) {
                                  break L6;
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
                              if (~((qb) this).field_z.field_ab.b((byte) 126, ((qb) this).field_F >> -1768096412) == ~((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 1781033092)) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                            ((qb) this).field_B = -(((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> -2046493820) << -185837884);
                            if (var3 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                          ((qb) this).field_F = ((qb) this).field_F - ((qb) this).field_A;
                          ((qb) this).field_A = 0;
                          if (var3 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (((qb) this).field_z.field_ab.b((byte) 122, ((qb) this).field_F >> 895258980) >= -(((qb) this).field_B >> -860137116)) {
                      break L4;
                    } else {
                      L10: {
                        L11: {
                          L12: {
                            if (((qb) this).field_M == 2) {
                              break L12;
                            } else {
                              if (((qb) this).field_M == 3) {
                                break L12;
                              } else {
                                if (((qb) this).field_M == 9) {
                                  break L12;
                                } else {
                                  if (((qb) this).field_M == 10) {
                                    break L12;
                                  } else {
                                    if (((qb) this).field_M != 6) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (((qb) this).field_z.field_ab.b((byte) 127, ((qb) this).field_F >> -1797909084) == ((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 1775051620)) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                        ((qb) this).field_B = -(((qb) this).field_z.field_ab.b((byte) 118, ((qb) this).field_F >> -952125852) << 929856708);
                        break L10;
                      }
                      if (~((qb) this).field_z.field_ab.b((byte) 120, ((qb) this).field_F >> -1277612988) == ~((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 1627761636)) {
                        ((qb) this).field_G = false;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (((qb) this).field_z.field_ab.a((byte) -96, ((qb) this).field_F >> 1213464132) <= -(((qb) this).field_B >> 456330820)) {
                    break L3;
                  } else {
                    ((qb) this).field_B = -(((qb) this).field_z.field_ab.a((byte) -128, ((qb) this).field_F >> 2126624996) << -2138205980);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L13: {
                L14: {
                  if (((qb) this).field_M == 10) {
                    break L14;
                  } else {
                    ((qb) this).field_A = ((qb) this).field_A * 9 / 10;
                    ((qb) this).field_O = ((qb) this).field_O * 9 / 10;
                    if (var3 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                ((qb) this).field_O = ((qb) this).field_O + ((qb) this).field_z.field_z;
                var2_ref = nk.a(9, 0, ((qb) this).field_z, 105, ((qb) this).field_B, ((qb) this).field_G, 100, 0, ((qb) this).field_F, ((qb) this).field_P);
                ((qb) this).field_z.field_O.a(3, (ck) (Object) var2_ref);
                break L13;
              }
              L15: {
                ((qb) this).field_I = ((qb) this).field_I + 1;
                if (~((qb) this).field_I < ~((qb) this).field_D) {
                  ((qb) this).field_z.field_J.a((byte) 110, (kd) this);
                  break L15;
                } else {
                  break L15;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "qb.G(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, String param2, int param3, String param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            vd.field_d.field_zb = vd.field_d.field_zb + wh.field_e.field_zb;
            vd.field_d.field_Db = param4;
            vd.field_d.field_S = param2;
            vd.field_d.field_nb = param1;
            var5_int = -48 % ((-12 - param0) / 61);
            wh.field_e.field_Y = wh.field_e.field_Y + wh.field_e.field_zb;
            wh.field_e.field_zb = param3;
            vd.field_d.field_zb = vd.field_d.field_zb - wh.field_e.field_zb;
            wh.field_e.field_Y = wh.field_e.field_Y - wh.field_e.field_zb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("qb.F(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
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
        L0: {
          var12 = SteelSentinels.field_G;
          var6 = null;
          if (!param3) {
            break L0;
          } else {
            if (param0.field_N < 0) {
              break L0;
            } else {
              if (param0.field_Q == 1) {
                break L0;
              } else {
                var6 = (Object) (Object) hl.field_p;
                if (~((Object[]) var6).length < ~param0.field_N) {
                  break L0;
                } else {
                  var6 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var6 == null) {
            break L1;
          } else {
            if (null == ((Object[]) var6)[param0.field_N]) {
              break L1;
            } else {
              param1.field_Pb = (wk) ((Object[]) var6)[param0.field_N];
              return;
            }
          }
        }
        L2: {
          var7 = new wk(param4, param5);
          param1.field_Pb = var7;
          if (null != var6) {
            ((Object[]) var6)[param0.field_N] = (Object) (Object) var7;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param2 == -93) {
            break L3;
          } else {
            field_C = null;
            break L3;
          }
        }
        L4: {
          L5: {
            param1.field_Pb.d();
            if (param0.field_Q == 1) {
              break L5;
            } else {
              L6: {
                var8 = param4 / 2;
                var9 = param5 / 2;
                if (param0.field_Q != 16) {
                  break L6;
                } else {
                  var8 -= 10;
                  break L6;
                }
              }
              L7: {
                var10 = hj.field_w;
                if (param0.field_N == 31) {
                  var8 -= 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (64 == param0.field_Q) {
                  var8 -= 20;
                  var9 += 7;
                  hj.field_w = 2048;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param0.field_Q == 128) {
                  var8 += 5;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (param0.field_Q == 256) {
                  var8 += 10;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (param0.field_Q != 2) {
                  break L11;
                } else {
                  var8 -= 10;
                  var9 += 10;
                  break L11;
                }
              }
              L12: {
                if (param0.field_N != 95) {
                  break L12;
                } else {
                  var8 -= 20;
                  break L12;
                }
              }
              L13: {
                if (4 != param0.field_Q) {
                  break L13;
                } else {
                  var9 -= 20;
                  hj.field_w = 3072;
                  break L13;
                }
              }
              L14: {
                if (param0.field_N == 76) {
                  var8 -= 20;
                  param0 = ul.a(102, (byte) 67);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (66 == param0.field_N) {
                  var8 -= 20;
                  param0 = ul.a(99, (byte) 67);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (param0.field_Q != 2048) {
                  break L16;
                } else {
                  var9 -= 20;
                  hj.field_w = 2048;
                  break L16;
                }
              }
              L17: {
                if (param0.field_N != 80) {
                  break L17;
                } else {
                  var8 -= 10;
                  var9 += 10;
                  break L17;
                }
              }
              L18: {
                if (param0.field_Q == 8) {
                  var9 += 20;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (param0.field_N == 59) {
                  var9 -= 25;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (param0.field_N == 71) {
                  var9 -= 15;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (77 != param0.field_N) {
                  break L21;
                } else {
                  var9 -= 10;
                  break L21;
                }
              }
              L22: {
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
                                                                                                                        var11 = param0.field_N;
                                                                                                                        if (1 == var11) {
                                                                                                                          break L74;
                                                                                                                        } else {
                                                                                                                          L75: {
                                                                                                                            if (53 != var11) {
                                                                                                                              break L75;
                                                                                                                            } else {
                                                                                                                              if (var12 == 0) {
                                                                                                                                break L73;
                                                                                                                              } else {
                                                                                                                                break L75;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          L76: {
                                                                                                                            if (60 != var11) {
                                                                                                                              break L76;
                                                                                                                            } else {
                                                                                                                              if (var12 == 0) {
                                                                                                                                break L72;
                                                                                                                              } else {
                                                                                                                                break L76;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          if (var11 == 61) {
                                                                                                                            break L71;
                                                                                                                          } else {
                                                                                                                            L77: {
                                                                                                                              if (var11 != 64) {
                                                                                                                                break L77;
                                                                                                                              } else {
                                                                                                                                if (var12 == 0) {
                                                                                                                                  break L70;
                                                                                                                                } else {
                                                                                                                                  break L77;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            if (68 == var11) {
                                                                                                                              break L69;
                                                                                                                            } else {
                                                                                                                              L78: {
                                                                                                                                if (var11 != 74) {
                                                                                                                                  break L78;
                                                                                                                                } else {
                                                                                                                                  if (var12 == 0) {
                                                                                                                                    break L68;
                                                                                                                                  } else {
                                                                                                                                    break L78;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              if (var11 == 78) {
                                                                                                                                break L67;
                                                                                                                              } else {
                                                                                                                                L79: {
                                                                                                                                  if (var11 != 82) {
                                                                                                                                    break L79;
                                                                                                                                  } else {
                                                                                                                                    if (var12 == 0) {
                                                                                                                                      break L66;
                                                                                                                                    } else {
                                                                                                                                      break L79;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                if (var11 == 87) {
                                                                                                                                  break L65;
                                                                                                                                } else {
                                                                                                                                  L80: {
                                                                                                                                    if (var11 != 91) {
                                                                                                                                      break L80;
                                                                                                                                    } else {
                                                                                                                                      if (var12 == 0) {
                                                                                                                                        break L64;
                                                                                                                                      } else {
                                                                                                                                        break L80;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  L81: {
                                                                                                                                    if (95 != var11) {
                                                                                                                                      break L81;
                                                                                                                                    } else {
                                                                                                                                      if (var12 == 0) {
                                                                                                                                        break L63;
                                                                                                                                      } else {
                                                                                                                                        break L81;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  if (var11 == 2) {
                                                                                                                                    break L62;
                                                                                                                                  } else {
                                                                                                                                    if (var11 == 56) {
                                                                                                                                      break L61;
                                                                                                                                    } else {
                                                                                                                                      L82: {
                                                                                                                                        if (var11 != 66) {
                                                                                                                                          break L82;
                                                                                                                                        } else {
                                                                                                                                          if (var12 == 0) {
                                                                                                                                            break L60;
                                                                                                                                          } else {
                                                                                                                                            break L82;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      if (var11 == 99) {
                                                                                                                                        break L60;
                                                                                                                                      } else {
                                                                                                                                        L83: {
                                                                                                                                          if (var11 != 70) {
                                                                                                                                            break L83;
                                                                                                                                          } else {
                                                                                                                                            if (var12 == 0) {
                                                                                                                                              break L59;
                                                                                                                                            } else {
                                                                                                                                              break L83;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        if (var11 == 76) {
                                                                                                                                          break L58;
                                                                                                                                        } else {
                                                                                                                                          if (var11 == 102) {
                                                                                                                                            break L58;
                                                                                                                                          } else {
                                                                                                                                            if (var11 == 85) {
                                                                                                                                              break L57;
                                                                                                                                            } else {
                                                                                                                                              L84: {
                                                                                                                                                if (80 != var11) {
                                                                                                                                                  break L84;
                                                                                                                                                } else {
                                                                                                                                                  if (var12 == 0) {
                                                                                                                                                    break L56;
                                                                                                                                                  } else {
                                                                                                                                                    break L84;
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                              if (89 == var11) {
                                                                                                                                                break L55;
                                                                                                                                              } else {
                                                                                                                                                if (var11 == 93) {
                                                                                                                                                  break L54;
                                                                                                                                                } else {
                                                                                                                                                  L85: {
                                                                                                                                                    if (var11 != 3) {
                                                                                                                                                      break L85;
                                                                                                                                                    } else {
                                                                                                                                                      if (var12 == 0) {
                                                                                                                                                        break L53;
                                                                                                                                                      } else {
                                                                                                                                                        break L85;
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                  if (54 == var11) {
                                                                                                                                                    break L52;
                                                                                                                                                  } else {
                                                                                                                                                    if (var11 == 67) {
                                                                                                                                                      break L51;
                                                                                                                                                    } else {
                                                                                                                                                      L86: {
                                                                                                                                                        if (var11 != 71) {
                                                                                                                                                          break L86;
                                                                                                                                                        } else {
                                                                                                                                                          if (var12 == 0) {
                                                                                                                                                            break L50;
                                                                                                                                                          } else {
                                                                                                                                                            break L86;
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                      if (var11 == 73) {
                                                                                                                                                        break L49;
                                                                                                                                                      } else {
                                                                                                                                                        L87: {
                                                                                                                                                          if (var11 != 77) {
                                                                                                                                                            break L87;
                                                                                                                                                          } else {
                                                                                                                                                            if (var12 == 0) {
                                                                                                                                                              break L48;
                                                                                                                                                            } else {
                                                                                                                                                              break L87;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                        L88: {
                                                                                                                                                          if (81 != var11) {
                                                                                                                                                            break L88;
                                                                                                                                                          } else {
                                                                                                                                                            if (var12 == 0) {
                                                                                                                                                              break L47;
                                                                                                                                                            } else {
                                                                                                                                                              break L88;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                        if (86 == var11) {
                                                                                                                                                          break L46;
                                                                                                                                                        } else {
                                                                                                                                                          if (var11 == 90) {
                                                                                                                                                            break L45;
                                                                                                                                                          } else {
                                                                                                                                                            L89: {
                                                                                                                                                              if (var11 != 83) {
                                                                                                                                                                break L89;
                                                                                                                                                              } else {
                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                  break L44;
                                                                                                                                                                } else {
                                                                                                                                                                  break L89;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            L90: {
                                                                                                                                                              if (var11 != 28) {
                                                                                                                                                                break L90;
                                                                                                                                                              } else {
                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                  break L43;
                                                                                                                                                                } else {
                                                                                                                                                                  break L90;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            L91: {
                                                                                                                                                              if (var11 != 29) {
                                                                                                                                                                break L91;
                                                                                                                                                              } else {
                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                  break L42;
                                                                                                                                                                } else {
                                                                                                                                                                  break L91;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            if (var11 == 30) {
                                                                                                                                                              break L41;
                                                                                                                                                            } else {
                                                                                                                                                              L92: {
                                                                                                                                                                if (var11 != 31) {
                                                                                                                                                                  break L92;
                                                                                                                                                                } else {
                                                                                                                                                                  if (var12 == 0) {
                                                                                                                                                                    break L40;
                                                                                                                                                                  } else {
                                                                                                                                                                    break L92;
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                              if (var11 == 35) {
                                                                                                                                                                break L39;
                                                                                                                                                              } else {
                                                                                                                                                                if (var11 == 32) {
                                                                                                                                                                  break L38;
                                                                                                                                                                } else {
                                                                                                                                                                  L93: {
                                                                                                                                                                    if (var11 != 33) {
                                                                                                                                                                      break L93;
                                                                                                                                                                    } else {
                                                                                                                                                                      if (var12 == 0) {
                                                                                                                                                                        break L37;
                                                                                                                                                                      } else {
                                                                                                                                                                        break L93;
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                  if (34 == var11) {
                                                                                                                                                                    break L36;
                                                                                                                                                                  } else {
                                                                                                                                                                    L94: {
                                                                                                                                                                      if (var11 != 38) {
                                                                                                                                                                        break L94;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (var12 == 0) {
                                                                                                                                                                          break L35;
                                                                                                                                                                        } else {
                                                                                                                                                                          break L94;
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                    L95: {
                                                                                                                                                                      if (43 != var11) {
                                                                                                                                                                        break L95;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (var12 == 0) {
                                                                                                                                                                          break L34;
                                                                                                                                                                        } else {
                                                                                                                                                                          break L95;
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                    if (var11 == 48) {
                                                                                                                                                                      break L33;
                                                                                                                                                                    } else {
                                                                                                                                                                      if (var11 == 52) {
                                                                                                                                                                        break L32;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (var11 == 46) {
                                                                                                                                                                          break L31;
                                                                                                                                                                        } else {
                                                                                                                                                                          L96: {
                                                                                                                                                                            if (var11 != 45) {
                                                                                                                                                                              break L96;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (var12 == 0) {
                                                                                                                                                                                break L30;
                                                                                                                                                                              } else {
                                                                                                                                                                                break L96;
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                          if (var11 == 44) {
                                                                                                                                                                            break L29;
                                                                                                                                                                          } else {
                                                                                                                                                                            L97: {
                                                                                                                                                                              if (47 != var11) {
                                                                                                                                                                                break L97;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                                  break L28;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L97;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            L98: {
                                                                                                                                                                              if (var11 != 36) {
                                                                                                                                                                                break L98;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                                  break L27;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L98;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            if (37 == var11) {
                                                                                                                                                                              break L26;
                                                                                                                                                                            } else {
                                                                                                                                                                              L99: {
                                                                                                                                                                                if (51 != var11) {
                                                                                                                                                                                  break L99;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (var12 == 0) {
                                                                                                                                                                                    break L25;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    break L99;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                              L100: {
                                                                                                                                                                                if (var11 != 50) {
                                                                                                                                                                                  break L100;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (var12 == 0) {
                                                                                                                                                                                    break L24;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    break L100;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                              if (var11 != 49) {
                                                                                                                                                                                break L22;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                                  break L23;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L74;
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
                                                                                                                        break L22;
                                                                                                                      } else {
                                                                                                                        break L73;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    var9 += 2;
                                                                                                                    var8 -= 7;
                                                                                                                    if (var12 == 0) {
                                                                                                                      break L22;
                                                                                                                    } else {
                                                                                                                      break L72;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  var9 -= 4;
                                                                                                                  var8 += 10;
                                                                                                                  if (var12 == 0) {
                                                                                                                    break L22;
                                                                                                                  } else {
                                                                                                                    break L71;
                                                                                                                  }
                                                                                                                }
                                                                                                                var9 -= 5;
                                                                                                                var8 -= 4;
                                                                                                                if (var12 == 0) {
                                                                                                                  break L22;
                                                                                                                } else {
                                                                                                                  break L70;
                                                                                                                }
                                                                                                              }
                                                                                                              var9 -= 6;
                                                                                                              if (var12 == 0) {
                                                                                                                break L22;
                                                                                                              } else {
                                                                                                                break L69;
                                                                                                              }
                                                                                                            }
                                                                                                            var8 += 4;
                                                                                                            var9 -= 10;
                                                                                                            if (var12 == 0) {
                                                                                                              break L22;
                                                                                                            } else {
                                                                                                              break L68;
                                                                                                            }
                                                                                                          }
                                                                                                          var9 -= 10;
                                                                                                          var8 -= 8;
                                                                                                          if (var12 == 0) {
                                                                                                            break L22;
                                                                                                          } else {
                                                                                                            break L67;
                                                                                                          }
                                                                                                        }
                                                                                                        var9 -= 2;
                                                                                                        if (var12 == 0) {
                                                                                                          break L22;
                                                                                                        } else {
                                                                                                          break L66;
                                                                                                        }
                                                                                                      }
                                                                                                      var8 -= 4;
                                                                                                      var9 += 9;
                                                                                                      if (var12 == 0) {
                                                                                                        break L22;
                                                                                                      } else {
                                                                                                        break L65;
                                                                                                      }
                                                                                                    }
                                                                                                    var9 -= 3;
                                                                                                    if (var12 == 0) {
                                                                                                      break L22;
                                                                                                    } else {
                                                                                                      break L64;
                                                                                                    }
                                                                                                  }
                                                                                                  hj.field_w = 3000;
                                                                                                  var8 += 8;
                                                                                                  if (var12 == 0) {
                                                                                                    break L22;
                                                                                                  } else {
                                                                                                    break L63;
                                                                                                  }
                                                                                                }
                                                                                                var9 += 10;
                                                                                                hj.field_w = 3300;
                                                                                                var8 += 4;
                                                                                                if (var12 == 0) {
                                                                                                  break L22;
                                                                                                } else {
                                                                                                  break L62;
                                                                                                }
                                                                                              }
                                                                                              var8 -= 7;
                                                                                              var9 += 8;
                                                                                              if (var12 == 0) {
                                                                                                break L22;
                                                                                              } else {
                                                                                                break L61;
                                                                                              }
                                                                                            }
                                                                                            var9--;
                                                                                            hj.field_w = 2500;
                                                                                            if (var12 == 0) {
                                                                                              break L22;
                                                                                            } else {
                                                                                              break L60;
                                                                                            }
                                                                                          }
                                                                                          var9 += 4;
                                                                                          hj.field_w = 2500;
                                                                                          if (var12 == 0) {
                                                                                            break L22;
                                                                                          } else {
                                                                                            break L59;
                                                                                          }
                                                                                        }
                                                                                        var9 += 4;
                                                                                        var8 -= 4;
                                                                                        if (var12 == 0) {
                                                                                          break L22;
                                                                                        } else {
                                                                                          break L58;
                                                                                        }
                                                                                      }
                                                                                      hj.field_w = 2700;
                                                                                      if (var12 == 0) {
                                                                                        break L22;
                                                                                      } else {
                                                                                        break L57;
                                                                                      }
                                                                                    }
                                                                                    var9 += 10;
                                                                                    if (var12 == 0) {
                                                                                      break L22;
                                                                                    } else {
                                                                                      break L56;
                                                                                    }
                                                                                  }
                                                                                  var8 += 4;
                                                                                  var9 += 2;
                                                                                  if (var12 == 0) {
                                                                                    break L22;
                                                                                  } else {
                                                                                    break L55;
                                                                                  }
                                                                                }
                                                                                var9 += 8;
                                                                                var8 += 6;
                                                                                hj.field_w = 1600;
                                                                                if (var12 == 0) {
                                                                                  break L22;
                                                                                } else {
                                                                                  break L54;
                                                                                }
                                                                              }
                                                                              var9 += 2;
                                                                              hj.field_w = 1024;
                                                                              var8 -= 2;
                                                                              if (var12 == 0) {
                                                                                break L22;
                                                                              } else {
                                                                                break L53;
                                                                              }
                                                                            }
                                                                            var8 += 12;
                                                                            var9 -= 4;
                                                                            if (var12 == 0) {
                                                                              break L22;
                                                                            } else {
                                                                              break L52;
                                                                            }
                                                                          }
                                                                          var9 -= 14;
                                                                          if (var12 == 0) {
                                                                            break L22;
                                                                          } else {
                                                                            break L51;
                                                                          }
                                                                        }
                                                                        var9 -= 10;
                                                                        var8 += 12;
                                                                        if (var12 == 0) {
                                                                          break L22;
                                                                        } else {
                                                                          break L50;
                                                                        }
                                                                      }
                                                                      var9 -= 8;
                                                                      var8 -= 15;
                                                                      if (var12 == 0) {
                                                                        break L22;
                                                                      } else {
                                                                        break L49;
                                                                      }
                                                                    }
                                                                    hj.field_w = 2900;
                                                                    if (var12 == 0) {
                                                                      break L22;
                                                                    } else {
                                                                      break L48;
                                                                    }
                                                                  }
                                                                  var9 -= 4;
                                                                  var8 += 13;
                                                                  if (var12 == 0) {
                                                                    break L22;
                                                                  } else {
                                                                    break L47;
                                                                  }
                                                                }
                                                                hj.field_w = 3000;
                                                                var9 -= 2;
                                                                if (var12 == 0) {
                                                                  break L22;
                                                                } else {
                                                                  break L46;
                                                                }
                                                              }
                                                              hj.field_w = 2300;
                                                              var8 += 25;
                                                              if (var12 == 0) {
                                                                break L22;
                                                              } else {
                                                                break L45;
                                                              }
                                                            }
                                                            var9 -= 6;
                                                            if (var12 == 0) {
                                                              break L22;
                                                            } else {
                                                              break L44;
                                                            }
                                                          }
                                                          var8 += 8;
                                                          if (var12 == 0) {
                                                            break L22;
                                                          } else {
                                                            break L43;
                                                          }
                                                        }
                                                        var8 += 4;
                                                        if (var12 == 0) {
                                                          break L22;
                                                        } else {
                                                          break L42;
                                                        }
                                                      }
                                                      var8 += 3;
                                                      if (var12 == 0) {
                                                        break L22;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                    var8 += 3;
                                                    var9 -= 4;
                                                    if (var12 == 0) {
                                                      break L22;
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                  var8 -= 3;
                                                  hj.field_w = 2800;
                                                  if (var12 == 0) {
                                                    break L22;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                                hj.field_w = 3500;
                                                var8 -= 2;
                                                if (var12 == 0) {
                                                  break L22;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                              hj.field_w = 2800;
                                              var8 -= 10;
                                              if (var12 == 0) {
                                                break L22;
                                              } else {
                                                break L37;
                                              }
                                            }
                                            var8 -= 3;
                                            hj.field_w = 3800;
                                            if (var12 == 0) {
                                              break L22;
                                            } else {
                                              break L36;
                                            }
                                          }
                                          var8 -= 4;
                                          hj.field_w = 3800;
                                          if (var12 == 0) {
                                            break L22;
                                          } else {
                                            break L35;
                                          }
                                        }
                                        hj.field_w = 3900;
                                        var8 -= 2;
                                        if (var12 == 0) {
                                          break L22;
                                        } else {
                                          break L34;
                                        }
                                      }
                                      var8 += 8;
                                      if (var12 == 0) {
                                        break L22;
                                      } else {
                                        break L33;
                                      }
                                    }
                                    var9--;
                                    var8 += 4;
                                    if (var12 == 0) {
                                      break L22;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  var8 += 3;
                                  hj.field_w = 1800;
                                  if (var12 == 0) {
                                    break L22;
                                  } else {
                                    break L31;
                                  }
                                }
                                var8 += 4;
                                hj.field_w = 1800;
                                if (var12 == 0) {
                                  break L22;
                                } else {
                                  break L30;
                                }
                              }
                              var8 += 2;
                              hj.field_w = 1550;
                              if (var12 == 0) {
                                break L22;
                              } else {
                                break L29;
                              }
                            }
                            var9 -= 2;
                            var8 += 7;
                            if (var12 == 0) {
                              break L22;
                            } else {
                              break L28;
                            }
                          }
                          var8 += 4;
                          if (var12 == 0) {
                            break L22;
                          } else {
                            break L27;
                          }
                        }
                        hj.field_w = 3600;
                        if (var12 == 0) {
                          break L22;
                        } else {
                          break L26;
                        }
                      }
                      hj.field_w = 3600;
                      if (var12 == 0) {
                        break L22;
                      } else {
                        break L25;
                      }
                    }
                    hj.field_w = 3600;
                    if (var12 == 0) {
                      break L22;
                    } else {
                      break L24;
                    }
                  }
                  hj.field_w = 3600;
                  if (var12 == 0) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
                var8 += 3;
                hj.field_w = 2200;
                break L22;
              }
              L101: {
                if ((3086 & param0.field_Q) == 0) {
                  break L101;
                } else {
                  if (param4 <= 100) {
                    break L101;
                  } else {
                    var8 -= 5;
                    break L101;
                  }
                }
              }
              param0.a(0, false, var8, var9, (byte) 49, 16384);
              hj.field_w = var10;
              if (var12 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          L102: {
            var8 = hj.field_w;
            if (param0.field_N != 0) {
              break L102;
            } else {
              hj.field_w = 1200;
              break L102;
            }
          }
          L103: {
            if (55 != param0.field_N) {
              break L103;
            } else {
              hj.field_w = 1200;
              break L103;
            }
          }
          L104: {
            if (57 == param0.field_N) {
              hj.field_w = 1300;
              break L104;
            } else {
              break L104;
            }
          }
          L105: {
            if (param0.field_N != 62) {
              break L105;
            } else {
              hj.field_w = 1400;
              break L105;
            }
          }
          L106: {
            if (65 != param0.field_N) {
              break L106;
            } else {
              hj.field_w = 1000;
              break L106;
            }
          }
          L107: {
            if (param0.field_N != 69) {
              break L107;
            } else {
              hj.field_w = 1400;
              break L107;
            }
          }
          L108: {
            if (72 != param0.field_N) {
              break L108;
            } else {
              hj.field_w = 1000;
              break L108;
            }
          }
          L109: {
            if (param0.field_N == 75) {
              hj.field_w = 1000;
              break L109;
            } else {
              break L109;
            }
          }
          L110: {
            if (param0.field_N != 79) {
              break L110;
            } else {
              hj.field_w = 1000;
              break L110;
            }
          }
          L111: {
            if (param0.field_N != 84) {
              break L111;
            } else {
              hj.field_w = 1000;
              break L111;
            }
          }
          L112: {
            if (param0.field_N != 88) {
              break L112;
            } else {
              hj.field_w = 1000;
              break L112;
            }
          }
          L113: {
            if (param0.field_N == 92) {
              hj.field_w = 700;
              break L113;
            } else {
              break L113;
            }
          }
          param0.a(0, false, param4 / 2, param5, (byte) 49, 0);
          hj.field_w = var8;
          break L4;
        }
        sb.field_bb.b((byte) 123);
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
