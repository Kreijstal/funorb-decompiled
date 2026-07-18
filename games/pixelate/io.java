/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static fm field_g;
    static ak field_f;
    static long field_d;
    static int field_e;
    static String field_a;
    static eq field_c;
    private String field_b;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        m var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4 = (m) (Object) on.field_nb.c(1504642273);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                jc.a((byte) -31, 2, var4);
                var4 = (m) (Object) on.field_nb.f(1504642273);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "io.A(" + 2 + ',' + -20304 + ')');
        }
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        lc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        pc var16 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var16 = vi.field_o;
            var2 = var16.f(255);
            var3 = (lc) (Object) rg.field_c.c(1504642273);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_k) {
                    var3 = (lc) (Object) rg.field_c.f(1504642273);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                na.a(true);
                return;
              } else {
                L3: {
                  var5 = 106;
                  var4 = var16.f(255);
                  if (var4 == 0) {
                    break L3;
                  } else {
                    lg.field_b[0] = kn.field_J;
                    var6 = var3.field_s;
                    var7_int = 1;
                    L4: while (true) {
                      if (var4 <= var7_int) {
                        lo.a(2147483647, var6, var4);
                        var7_int = 0;
                        L5: while (true) {
                          if (var4 <= var7_int) {
                            bc.a(var6, (byte) 31);
                            String[][] dupTemp$2 = new String[2][var6];
                            var3.field_o = dupTemp$2;
                            var7 = dupTemp$2;
                            int[][] dupTemp$3 = new int[2][var6 * 4];
                            var3.field_r = dupTemp$3;
                            var8 = dupTemp$3;
                            var9 = pg.field_e;
                            var10 = 0;
                            var11 = 0;
                            L6: while (true) {
                              if (var9 <= var10) {
                                var14 = 0;
                                var10 = var14;
                                var15 = 0;
                                var11 = var15;
                                L7: while (true) {
                                  if (var14 >= var9) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var12 = gn.field_A[var14 + var6];
                                      var7[1][var15] = lg.field_b[var12];
                                      var8[1][4 * var15] = ep.field_c[var12];
                                      var8[1][1 + 4 * var15] = uc.field_b[var12];
                                      var8[1][4 * var15 + 2] = vp.field_Fb[var12];
                                      var8[1][4 * var15 + 3] = gh.field_q[var12];
                                      if (sm.a(lg.field_b[var12], -1)) {
                                        if (uc.field_b[var12] + (vp.field_Fb[var12] - -gh.field_q[var12]) != 0) {
                                          break L8;
                                        } else {
                                          var7[1][var15] = null;
                                          var15--;
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var15++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var12 = gn.field_A[var10];
                                  var7[0][var11] = lg.field_b[var12];
                                  var8[0][var11 * 4] = ep.field_c[var12];
                                  var8[0][1 + var11 * 4] = uc.field_b[var12];
                                  var8[0][4 * var11 + 2] = vp.field_Fb[var12];
                                  var8[0][3 + var11 * 4] = gh.field_q[var12];
                                  if (!sm.a(lg.field_b[var12], -1)) {
                                    break L9;
                                  } else {
                                    if (gh.field_q[var12] + uc.field_b[var12] + vp.field_Fb[var12] != 0) {
                                      break L9;
                                    } else {
                                      var7[0][var11] = null;
                                      var11--;
                                      break L9;
                                    }
                                  }
                                }
                                var11++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              rd.a(-112, (we) (Object) var16);
                              if (var7_int != 0) {
                                ui.a(aj.field_n, 0, of.field_g, of.field_b, var7_int, bq.field_c);
                                break L10;
                              } else {
                                var3.field_v = aj.field_n;
                                var3.field_n = bq.field_c;
                                var3.field_m = of.field_g;
                                var3.field_p = of.field_b;
                                ui.a(aj.field_n, 0, of.field_g, of.field_b, var7_int, bq.field_c);
                                var7_int++;
                                break L10;
                              }
                            }
                            var7_int++;
                            continue L5;
                          }
                        }
                      } else {
                        lg.field_b[var7_int] = var16.h(5);
                        var7_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var3.field_u = true;
                var3.c(2779);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "io.B(" + -123 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        if (ga.field_f >= 0) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (ga.field_f >= 75) {
              break L0;
            } else {
              var5 = (ga.field_f << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (ga.field_f <= 200) {
              break L1;
            } else {
              var5 = (250 - ga.field_f << 8) / 50;
              break L1;
            }
          }
          h.a(-113, re.field_b);
          ja.a();
          t.d();
          int discarded$3 = 106;
          ma.d();
          if (256 <= var5) {
            int discarded$4 = 92;
            ia.a();
            if (ga.field_f >= 150) {
              th.field_b.a(var3 - -15, var4 - -10, var5);
              var6 = ga.field_f + -125;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (var6 < 30) {
                      L2: {
                        bd.field_a.b(var3, var4, 256);
                        var6 = ga.field_f + -140;
                        if (var6 <= 0) {
                          break L2;
                        } else {
                          L3: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L3;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L3;
                            }
                          }
                          in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        var7 = (12800 + -(var6 * 256)) / 20;
                        bd.field_a.b(var3, var4, var7);
                        var6 = ga.field_f + -140;
                        if (var6 <= 0) {
                          break L4;
                        } else {
                          L5: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L5;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L5;
                            }
                          }
                          in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      var7 = 256 * var6 / 20;
                      bd.field_a.b(var3, var4, var7);
                      var6 = ga.field_f + -140;
                      if (var6 <= 0) {
                        break L6;
                      } else {
                        L7: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L7;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L7;
                          }
                        }
                        in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  var6 = ga.field_f + -140;
                  if (var6 > 0) {
                    L8: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L8;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L8;
                      }
                    }
                    in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L9: {
                  var6 = ga.field_f + -140;
                  if (var6 <= 0) {
                    break L9;
                  } else {
                    L10: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L10;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L10;
                      }
                    }
                    in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                    break L9;
                  }
                }
                return;
              }
            } else {
              re.field_b.d(var3, var4);
              var6 = ga.field_f + -125;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (var6 < 30) {
                      L11: {
                        bd.field_a.b(var3, var4, 256);
                        var6 = ga.field_f + -140;
                        if (var6 <= 0) {
                          break L11;
                        } else {
                          L12: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L12;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L12;
                            }
                          }
                          in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                          break L11;
                        }
                      }
                      return;
                    } else {
                      L13: {
                        var7 = (12800 + -(var6 * 256)) / 20;
                        bd.field_a.b(var3, var4, var7);
                        var6 = ga.field_f + -140;
                        if (var6 <= 0) {
                          break L13;
                        } else {
                          L14: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L14;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L14;
                            }
                          }
                          in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                          break L13;
                        }
                      }
                      return;
                    }
                  } else {
                    L15: {
                      var7 = 256 * var6 / 20;
                      bd.field_a.b(var3, var4, var7);
                      var6 = ga.field_f + -140;
                      if (var6 <= 0) {
                        break L15;
                      } else {
                        L16: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L16;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L16;
                          }
                        }
                        in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                        break L15;
                      }
                    }
                    return;
                  }
                } else {
                  var6 = ga.field_f + -140;
                  if (var6 > 0) {
                    L17: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L17;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L17;
                      }
                    }
                    in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L18: {
                  var6 = ga.field_f + -140;
                  if (var6 <= 0) {
                    break L18;
                  } else {
                    L19: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L19;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L19;
                      }
                    }
                    in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                    break L18;
                  }
                }
                return;
              }
            }
          } else {
            L20: {
              t.a(0, 0, t.field_j, t.field_d, 0, -var5 + 256);
              int discarded$5 = 92;
              ia.a();
              if (ga.field_f >= 150) {
                th.field_b.a(var3 - -15, var4 - -10, var5);
                break L20;
              } else {
                re.field_b.d(var3, var4);
                break L20;
              }
            }
            var6 = ga.field_f + -125;
            if (var6 <= 0) {
              L21: {
                var6 = ga.field_f + -140;
                if (var6 <= 0) {
                  break L21;
                } else {
                  L22: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L22;
                    } else {
                      var7 = var6 * 256 / 20;
                      break L22;
                    }
                  }
                  in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                  break L21;
                }
              }
              return;
            } else {
              L23: {
                if (var6 < 50) {
                  L24: {
                    if (var6 >= 20) {
                      if (var6 >= 30) {
                        var7 = (12800 + -(var6 * 256)) / 20;
                        bd.field_a.b(var3, var4, var7);
                        break L24;
                      } else {
                        bd.field_a.b(var3, var4, 256);
                        break L24;
                      }
                    } else {
                      var7 = 256 * var6 / 20;
                      bd.field_a.b(var3, var4, var7);
                      break L24;
                    }
                  }
                  var6 = ga.field_f + -140;
                  if (var6 <= 0) {
                    break L23;
                  } else {
                    L25: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L25;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L25;
                      }
                    }
                    in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                    break L23;
                  }
                } else {
                  var6 = ga.field_f + -140;
                  if (var6 <= 0) {
                    break L23;
                  } else {
                    L26: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L26;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L26;
                      }
                    }
                    in.field_s.a(15 + var3, 10 + var4, var7 * var5 >> 8);
                    break L23;
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -87 / ((-14 - param1) / 39);
            stackOut_0_0 = ((io) this).field_b.equals((Object) (Object) param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("io.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(boolean param0, int param1, rg param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              ud.field_L[0] = ai.field_d.nextInt();
              ud.field_L[1] = ai.field_d.nextInt();
              uk.field_v.field_m = 0;
              ud.field_L[3] = (int)gj.field_P;
              ud.field_L[2] = (int)(gj.field_P >> 32);
              uk.field_v.d(ud.field_L[0], -55);
              uk.field_v.d(ud.field_L[1], -71);
              uk.field_v.d(ud.field_L[2], -68);
              uk.field_v.d(ud.field_L[3], -48);
              wf.a(1, uk.field_v);
              uk.field_v.b(1276387944, param3);
              param2.a((byte) -12, uk.field_v);
              aa.field_f.field_m = 0;
              if (param0) {
                aa.field_f.e(160, 18);
                break L1;
              } else {
                aa.field_f.e(160, 16);
                break L1;
              }
            }
            L2: {
              aa.field_f.field_m = aa.field_f.field_m + 2;
              var5_int = aa.field_f.field_m;
              aa.field_f.d(ra.field_c, -118);
              aa.field_f.a(false, hf.field_t);
              var6 = 0;
              if (uj.field_Lb) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (vm.field_d) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param4) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (sc.field_a != null) {
                var6 = var6 | 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              aa.field_f.e(160, var6);
              int discarded$2 = -85;
              var7 = ln.a(ao.a(13867));
              if (var7 != null) {
                break L6;
              } else {
                var7 = "";
                break L6;
              }
            }
            L7: {
              aa.field_f.b((byte) -41, var7);
              if (sc.field_a == null) {
                break L7;
              } else {
                aa.field_f.a((byte) -66, sc.field_a);
                break L7;
              }
            }
            int discarded$3 = 12556;
            wh.a(ag.field_m, (we) (Object) aa.field_f, tp.field_t, uk.field_v);
            aa.field_f.c(7519, aa.field_f.field_m - var5_int);
            vg.b(-1, 10000);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("io.H(").append(param0).append(',').append(-67).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(tc param0) {
        try {
            hk.field_d = param0;
            pe.field_c = hk.field_d.field_z + hk.field_d.field_w;
            int var2_int = -38;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "io.F(" + (param0 != null ? "{...}" : "null") + ',' + -108 + ')');
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        try {
            if (param1 != -80419032) {
                Object var4 = null;
                ((io) this).a((java.applet.Applet) null, 6);
            }
            nn.a(param0, -75, ((io) this).field_b, "jagex-last-login-method", 31536000L);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "io.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a() {
        field_f = null;
        field_a = null;
        field_c = null;
        field_g = null;
    }

    io(String param0) {
        try {
            ((io) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "io.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Use this alternative as your account name";
    }
}
