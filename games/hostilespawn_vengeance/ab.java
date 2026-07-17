/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ab extends IOException {
    static int field_c;
    static String field_d;
    static int field_b;
    static bd field_a;

    final static void a(int param0, boolean param1, oc param2, oc param3, int param4, double param5, oc param6, oj param7, double param8, int param9, int param10) {
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var16_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        double var18_double = 0.0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        double var21_double = 0.0;
        int var23 = 0;
        int var24 = 0;
        oj var25 = null;
        oj var26 = null;
        L0: {
          var24 = HostileSpawn.field_I ? 1 : 0;
          if (bm.field_c != 1) {
            break L0;
          } else {
            if (3 != rl.field_c) {
              break L0;
            } else {
              if (0 != r.field_a) {
                break L0;
              } else {
                return;
              }
            }
          }
        }
        L1: {
          var15 = 0;
          if (param7.field_I > 0) {
            if (param7.field_h == 0) {
              L2: {
                if (ln.field_a.field_y[-param0 + -1 + (param4 - 2)] == 81) {
                  var15 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (81 != ln.field_a.field_y[param4 + (-1 + -param0) + param0 * 2]) {
                  break L3;
                } else {
                  var15 = 64;
                  break L3;
                }
              }
              L4: {
                if (81 != ln.field_a.field_y[2 + (-param0 + param4) - 1]) {
                  break L4;
                } else {
                  var15 = 128;
                  break L4;
                }
              }
              L5: {
                if (81 == ln.field_a.field_y[-(param0 * 2) + param4 + (-1 - param0)]) {
                  var15 = 192;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (ln.field_a.field_y[-2 + -param0 + (-1 + param4)] == 29) {
                  var15 = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (ln.field_a.field_y[param0 * 2 + -param0 + (-1 + param4)] == 29) {
                  var15 = 64;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (ln.field_a.field_y[-param0 + -1 + param4 - -2] == 29) {
                  var15 = 128;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (ln.field_a.field_y[-param0 + param4 + (-1 + -(2 * param0))] == 29) {
                  var15 = 192;
                  break L9;
                } else {
                  break L9;
                }
              }
              var15 += 64;
              break L1;
            } else {
              if (1 != param7.field_h) {
                if (param7.field_h != 2) {
                  if (3 != param7.field_h) {
                    if (param7.field_h != 4) {
                      break L1;
                    } else {
                      var15 = 64;
                      break L1;
                    }
                  } else {
                    var15 = 128;
                    break L1;
                  }
                } else {
                  var15 = 192;
                  break L1;
                }
              } else {
                var15 = 0;
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        L10: {
          if (param7.field_I <= 0) {
            break L10;
          } else {
            if (param7.field_i == 5) {
              param7.a(225, (double)(int)(64.0 * Math.random() + (double)var15 - 32.0), 5);
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if (param7.field_F <= 1) {
            break L11;
          } else {
            param7.field_F = param7.field_F - 1;
            break L11;
          }
        }
        L12: {
          L13: {
            if (param7.field_F <= 200) {
              break L13;
            } else {
              if (param7.field_I > 0) {
                L14: {
                  if ((sg.field_i & 3) != 0) {
                    break L14;
                  } else {
                    if (20 <= param7.field_I) {
                      break L14;
                    } else {
                      param7.field_I = param7.field_I + 1;
                      break L14;
                    }
                  }
                }
                L15: {
                  param6.a((byte) 46, param2);
                  param6.b(param3, 24161);
                  if (param7.field_e <= 0) {
                    break L15;
                  } else {
                    param7.field_e = param7.field_e - 1;
                    break L15;
                  }
                }
                if (param7.field_i != 5) {
                  if (param7.field_i != 22) {
                    break L13;
                  } else {
                    L16: {
                      L17: {
                        var16 = 0;
                        var17 = param3.field_e;
                        var18 = param3.field_e;
                        var19 = param3.field_g;
                        var20 = param3.field_g;
                        var21 = var15;
                        if (var21 == 0) {
                          var18 += 2;
                          var19 -= 4;
                          var17 -= 3;
                          break L17;
                        } else {
                          if (var21 != 64) {
                            if (128 == var21) {
                              var20 += 4;
                              var17 -= 2;
                              var18 += 3;
                              break L17;
                            } else {
                              if (var21 == 192) {
                                var20 += 3;
                                var19 -= 2;
                                var18 += 4;
                                break L17;
                              } else {
                                var21 = 0;
                                L18: while (true) {
                                  if (var21 >= rc.field_e) {
                                    break L16;
                                  } else {
                                    L19: {
                                      L20: {
                                        var25 = re.field_n[var21];
                                        if (0 == var25.field_i) {
                                          break L20;
                                        } else {
                                          if (!var25.field_b) {
                                            break L19;
                                          } else {
                                            if (var25.field_i != 27) {
                                              break L20;
                                            } else {
                                              if (var25.field_s) {
                                                break L20;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var25.field_j.field_e < var17) {
                                        break L19;
                                      } else {
                                        if (var18 < var25.field_j.field_e) {
                                          break L19;
                                        } else {
                                          if (var25.field_j.field_g < var19) {
                                            break L19;
                                          } else {
                                            if (~var20 > ~var25.field_j.field_g) {
                                              break L19;
                                            } else {
                                              param6.a((byte) 46, var25.field_j);
                                              var16 = 1;
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var21++;
                                    continue L18;
                                  }
                                }
                              }
                            }
                          } else {
                            var20 += 2;
                            var17 -= 4;
                            var19 -= 3;
                            break L17;
                          }
                        }
                      }
                      var21 = 0;
                      L21: while (true) {
                        if (var21 >= rc.field_e) {
                          break L16;
                        } else {
                          L22: {
                            L23: {
                              var26 = re.field_n[var21];
                              if (0 == var26.field_i) {
                                break L23;
                              } else {
                                if (!var26.field_b) {
                                  break L22;
                                } else {
                                  if (var26.field_i != 27) {
                                    break L23;
                                  } else {
                                    if (var26.field_s) {
                                      break L23;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                            }
                            if (var26.field_j.field_e < var17) {
                              break L22;
                            } else {
                              if (var18 < var26.field_j.field_e) {
                                break L22;
                              } else {
                                if (var26.field_j.field_g < var19) {
                                  break L22;
                                } else {
                                  if (~var20 > ~var26.field_j.field_g) {
                                    break L22;
                                  } else {
                                    param6.a((byte) 46, var26.field_j);
                                    var16 = 1;
                                    break L16;
                                  }
                                }
                              }
                            }
                          }
                          var21++;
                          continue L21;
                        }
                      }
                    }
                    L24: {
                      if (var16 == 0) {
                        L25: {
                          L26: {
                            var21 = 7 * param3.field_e - (-(3 * param3.field_g) - ng.field_u / 2) & 127;
                            if (var15 == 64) {
                              break L26;
                            } else {
                              if (var15 == 0) {
                                break L26;
                              } else {
                                break L25;
                              }
                            }
                          }
                          var21 = 127 + -var21;
                          break L25;
                        }
                        L27: {
                          if (var21 > 64) {
                            var21 = -var21 + 127;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if (16 <= var21) {
                            break L28;
                          } else {
                            var21 = 16;
                            break L28;
                          }
                        }
                        L29: {
                          if (var21 > 48) {
                            var21 = 48;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        param7.a(225, (double)(var21 + (-32 + var15)), 2);
                        break L24;
                      } else {
                        L30: {
                          var21_double = el.a((double)param3.field_e, (double)param6.field_e, 16, (double)param3.field_g, (double)param6.field_g);
                          var23 = -var15 + (int)var21_double;
                          if (128 > var23) {
                            break L30;
                          } else {
                            var23 -= 256;
                            break L30;
                          }
                        }
                        L31: {
                          if (var23 > -128) {
                            break L31;
                          } else {
                            var23 += 256;
                            break L31;
                          }
                        }
                        L32: {
                          if (var23 <= -32) {
                            var23 = -31;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        L33: {
                          if (var23 >= 32) {
                            var23 = 31;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        param7.a(225, (double)(var15 - -var23), 5);
                        break L24;
                      }
                    }
                    if (param7.field_e <= 0) {
                      if (var16 != 0) {
                        param7.field_e = 32;
                        var21 = -10;
                        L34: while (true) {
                          if (var21 > 10) {
                            jn.field_F[ib.field_c].field_c = param7.field_c;
                            jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                            jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                            jn.field_F[ib.field_c].field_e = 1;
                            jn.field_F[ib.field_c].field_h = 0;
                            jn.field_F[ib.field_c].field_i = 21;
                            jn.field_F[ib.field_c].field_l.a(6, (byte) 94, 64.0 + jn.field_F[ib.field_c].field_c);
                            jn.field_F[ib.field_c].field_l.a(60, (byte) 94, jn.field_F[ib.field_c].field_c);
                            ib.field_c = ib.field_c + 1;
                            jn.field_F[ib.field_c].field_c = param7.field_c;
                            jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                            jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                            jn.field_F[ib.field_c].field_e = 1;
                            jn.field_F[ib.field_c].field_h = 0;
                            jn.field_F[ib.field_c].field_i = 21;
                            jn.field_F[ib.field_c].field_l.a(6, (byte) 94, jn.field_F[ib.field_c].field_c + 192.0);
                            jn.field_F[ib.field_c].field_l.a(60, (byte) 94, jn.field_F[ib.field_c].field_c);
                            ib.field_c = ib.field_c + 1;
                            if (uj.field_l == 1) {
                              L35: {
                                var13_int = (int)(((double)(-param3.field_e) + (param8 + (double)param10) - param7.field_l.field_f) * 24.0);
                                var14 = (int)(24.0 * ((double)(-param3.field_g) + (param5 + (double)param9) - param7.field_l.field_a));
                                var21 = -(int)Math.sqrt((double)(var14 * var14 + var13_int * var13_int)) + 256;
                                if (var21 <= 128) {
                                  break L35;
                                } else {
                                  var21 = 128;
                                  break L35;
                                }
                              }
                              if (0 >= var21) {
                                break L13;
                              } else {
                                jh.a(uh.field_i * var21 / 128, (byte) 120, 41, sf.field_V, 5);
                                break L12;
                              }
                            } else {
                              break L12;
                            }
                          } else {
                            jn.field_F[ib.field_c].field_c = param7.field_c + 1.5 * (double)var21;
                            jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                            jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                            jn.field_F[ib.field_c].field_e = 0;
                            jn.field_F[ib.field_c].field_h = 0;
                            jn.field_F[ib.field_c].field_i = 9;
                            jn.field_F[ib.field_c].field_l.a(20, (byte) 94, jn.field_F[ib.field_c].field_c);
                            ib.field_c = ib.field_c + 1;
                            var21 += 2;
                            continue L34;
                          }
                        }
                      } else {
                        break L12;
                      }
                    } else {
                      param7.field_e = param7.field_e - 1;
                      break L12;
                    }
                  }
                } else {
                  if (param7.field_e % 5 != 0) {
                    break L13;
                  } else {
                    L36: {
                      param7.field_e = 10;
                      if (uj.field_l == 1) {
                        L37: {
                          var13_int = (int)(24.0 * ((double)(-param3.field_e) + (param8 + (double)param10) - param7.field_l.field_f));
                          var14 = (int)((-param7.field_l.field_a + ((double)(-param3.field_g) + (param5 + (double)param9))) * 24.0);
                          var16 = 256 - (int)Math.sqrt((double)(var14 * var14 + var13_int * var13_int));
                          if (var16 > 128) {
                            var16 = 128;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        if (var16 <= 0) {
                          break L36;
                        } else {
                          jh.a(var16 * uh.field_i / 256, (byte) 51, 46, sf.field_V, 5);
                          break L36;
                        }
                      } else {
                        break L36;
                      }
                    }
                    var16_double = 1.25;
                    var18_double = 1.0;
                    jn.field_F[ib.field_c].field_c = param7.field_c;
                    var20 = 48;
                    jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                    jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                    jn.field_F[ib.field_c].field_l.field_f = jn.field_F[ib.field_c].field_l.field_f + var16_double;
                    jn.field_F[ib.field_c].field_l.field_a = jn.field_F[ib.field_c].field_l.field_a + var18_double;
                    jn.field_F[ib.field_c].field_e = 0;
                    jn.field_F[ib.field_c].field_h = 0;
                    jn.field_F[ib.field_c].field_i = 9;
                    jn.field_F[ib.field_c].field_l.a(var20, (byte) 94, jn.field_F[ib.field_c].field_c);
                    jn.field_F[ib.field_c].a(225, jn.field_F[ib.field_c].field_c + 5.0 * Math.random() - 2.5, 50);
                    ib.field_c = ib.field_c + 1;
                    jn.field_F[ib.field_c].field_c = param7.field_c;
                    jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                    jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                    jn.field_F[ib.field_c].field_l.field_f = jn.field_F[ib.field_c].field_l.field_f + var16_double;
                    jn.field_F[ib.field_c].field_l.field_a = jn.field_F[ib.field_c].field_l.field_a + var18_double;
                    jn.field_F[ib.field_c].field_e = 1;
                    jn.field_F[ib.field_c].field_h = 0;
                    jn.field_F[ib.field_c].field_i = 1;
                    jn.field_F[ib.field_c].field_l.a(6, (byte) 94, 64.0 + jn.field_F[ib.field_c].field_c);
                    jn.field_F[ib.field_c].field_l.a(var20, (byte) 94, jn.field_F[ib.field_c].field_c);
                    ib.field_c = ib.field_c + 1;
                    jn.field_F[ib.field_c].field_c = param7.field_c;
                    jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                    jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                    jn.field_F[ib.field_c].field_l.field_f = jn.field_F[ib.field_c].field_l.field_f + var16_double;
                    jn.field_F[ib.field_c].field_l.field_a = jn.field_F[ib.field_c].field_l.field_a + var18_double;
                    jn.field_F[ib.field_c].field_e = 1;
                    jn.field_F[ib.field_c].field_h = 0;
                    jn.field_F[ib.field_c].field_i = 1;
                    jn.field_F[ib.field_c].field_l.a(6, (byte) 94, jn.field_F[ib.field_c].field_c + 192.0);
                    jn.field_F[ib.field_c].field_l.a(var20, (byte) 94, jn.field_F[ib.field_c].field_c);
                    ib.field_c = ib.field_c + 1;
                    break L12;
                  }
                }
              } else {
                break L12;
              }
            }
          }
          break L12;
        }
    }

    public static void a() {
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, gb param1, gb param2, gb param3) {
        RuntimeException var4 = null;
        pg[] var5 = null;
        pg[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        pg[] var10 = null;
        bd var11 = null;
        int var11_int = 0;
        bd var12 = null;
        int var13 = 0;
        pg[] var14 = null;
        bd var15 = null;
        int[][] var16 = null;
        bd var17 = null;
        bd var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            bh.field_a = jd.a((byte) 33, "commonui", param3, "frame_top");
            g.field_G = jd.a((byte) 33, "commonui", param3, "frame_bottom");
            sf.field_ab = ci.a("commonui", 116, "jagex_logo_grey", param3);
            km.field_y = jd.a((byte) 33, "commonui", param3, "button");
            cf.field_u = ei.a(param3, 113, "commonui", "validation");
            jn.field_G = (vm) (Object) th.a(param3, -107, "arezzo12", param1, "commonui");
            jd.field_s = (vm) (Object) th.a(param3, 25, "arezzo14", param1, "commonui");
            pe.field_eb = (vm) (Object) th.a(param3, 9, "arezzo14bold", param1, "commonui");
            var17 = new bd(param2.a("", "button.gif", 0), (java.awt.Component) (Object) se.field_h);
            pg discarded$3 = qm.a("commonui", 0, "dropdown", param3);
            var5 = sg.a(true, "commonui", param3, "screen_options");
            ak.field_h = new pg[4];
            nl.field_e = new pg[4];
            dd.field_n = new pg[4];
            var6 = new pg[][]{nl.field_e, ak.field_h, dd.field_n};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_k;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var21.length) {
                var8 = var5[0].field_j[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var17.field_A;
                    pf.b(511);
                    var17.a();
                    si.g(0, 0, si.field_e, si.field_k);
                    var15 = new bd(var9, var9);
                    var18 = var15;
                    var18.a();
                    var17.c(0, 0);
                    var11 = new bd(var9, var9);
                    var11.a();
                    var17.c(-var17.field_z + var9, 0);
                    var12 = new bd(var17.field_z - var9 * 2, var9);
                    var12.a();
                    var17.c(-var9, 0);
                    int discarded$4 = 0;
                    eh.b();
                    km.field_y = new bd[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var14.length <= var11_int) {
                        var9++;
                        continue L2;
                      } else {
                        int discarded$5 = 115;
                        var14[var11_int] = kb.a(var5[var9], var21[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ab.A(").append(0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    ab(String param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "These grenades should be able to take out any locked doors.";
    }
}
