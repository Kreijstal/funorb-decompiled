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
        int var13 = 0;
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
          if (-2 != (bm.field_c ^ -1)) {
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
                if (-82 == ln.field_a.field_y[-param0 + -1 + (param4 - 2)]) {
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
                if (-30 == (ln.field_a.field_y[param0 * 2 + -param0 + (-1 + param4)] ^ -1)) {
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
                if ((param7.field_h ^ -1) != -3) {
                  if (3 != param7.field_h) {
                    if (param7.field_h != -5) {
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
          if (!param1) {
            break L10;
          } else {
            field_c = 26;
            break L10;
          }
        }
        L11: {
          if (param7.field_I <= 0) {
            break L11;
          } else {
            if (-6 == (param7.field_i ^ -1)) {
              param7.a(225, (double)(int)(64.0 * Math.random() + (double)var15 - 32.0), 5);
              break L11;
            } else {
              break L11;
            }
          }
        }
        L12: {
          if (-2 <= param7.field_F) {
            break L12;
          } else {
            param7.field_F = param7.field_F - 1;
            break L12;
          }
        }
        L13: {
          if (-201 >= param7.field_F) {
            break L13;
          } else {
            if (param7.field_I < -1) {
              L14: {
                if (-1 != (sg.field_i & 3)) {
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
                if (-1 <= (param7.field_e ^ -1)) {
                  break L15;
                } else {
                  param7.field_e = param7.field_e - 1;
                  break L15;
                }
              }
              if (param7.field_i != -6) {
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
                                    var25 = re.field_n[var21];
                                    if (0 == var25.field_i) {
                                      break L19;
                                    } else {
                                      if (var25.field_b) {
                                        if ((var25.field_i ^ -1) != -28) {
                                          break L19;
                                        } else {
                                          if (var25.field_s) {
                                            break L19;
                                          } else {
                                            var21++;
                                            continue L18;
                                          }
                                        }
                                      } else {
                                        var21++;
                                        continue L18;
                                      }
                                    }
                                  }
                                  if (var25.field_j.field_e >= var17) {
                                    if (var18 >= var25.field_j.field_e) {
                                      if (var25.field_j.field_g >= var19) {
                                        if (var20 >= var25.field_j.field_g) {
                                          param6.a((byte) 46, var25.field_j);
                                          var16 = 1;
                                          break L16;
                                        } else {
                                          var21++;
                                          continue L18;
                                        }
                                      } else {
                                        var21++;
                                        continue L18;
                                      }
                                    } else {
                                      var21++;
                                      continue L18;
                                    }
                                  } else {
                                    var21++;
                                    continue L18;
                                  }
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
                    L20: while (true) {
                      if (var21 >= rc.field_e) {
                        break L16;
                      } else {
                        L21: {
                          var26 = re.field_n[var21];
                          if (0 == var26.field_i) {
                            break L21;
                          } else {
                            if (var26.field_b) {
                              if ((var26.field_i ^ -1) != -28) {
                                break L21;
                              } else {
                                if (var26.field_s) {
                                  break L21;
                                } else {
                                  var21++;
                                  continue L20;
                                }
                              }
                            } else {
                              var21++;
                              continue L20;
                            }
                          }
                        }
                        if (var26.field_j.field_e >= var17) {
                          if (var18 >= var26.field_j.field_e) {
                            if (var26.field_j.field_g >= var19) {
                              if (var20 >= var26.field_j.field_g) {
                                param6.a((byte) 46, var26.field_j);
                                var16 = 1;
                                break L16;
                              } else {
                                var21++;
                                continue L20;
                              }
                            } else {
                              var21++;
                              continue L20;
                            }
                          } else {
                            var21++;
                            continue L20;
                          }
                        } else {
                          var21++;
                          continue L20;
                        }
                      }
                    }
                  }
                  L22: {
                    if (var16 == 0) {
                      L23: {
                        L24: {
                          var21 = 7 * param3.field_e - (-(3 * param3.field_g) - ng.field_u / 2) & 127;
                          if (var15 == 64) {
                            break L24;
                          } else {
                            if (var15 == 0) {
                              break L24;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var21 = 127 + -var21;
                        break L23;
                      }
                      L25: {
                        if ((var21 ^ -1) < -65) {
                          var21 = -var21 + 127;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        if (16 <= var21) {
                          break L26;
                        } else {
                          var21 = 16;
                          break L26;
                        }
                      }
                      L27: {
                        if (var21 > 48) {
                          var21 = 48;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      param7.a(225, (double)(var21 + (-32 + var15)), 2);
                      break L22;
                    } else {
                      L28: {
                        var21_double = el.a((double)param3.field_e, (double)param6.field_e, 16, (double)param3.field_g, (double)param6.field_g);
                        var23 = -var15 + (int)var21_double;
                        if (128 > var23) {
                          break L28;
                        } else {
                          // wide iinc 23 -256
                          break L28;
                        }
                      }
                      L29: {
                        if (127 > (var23 ^ -1)) {
                          break L29;
                        } else {
                          // wide iinc 23 256
                          break L29;
                        }
                      }
                      L30: {
                        if (var23 <= -32) {
                          var23 = -31;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if ((var23 ^ -1) <= -33) {
                          var23 = 31;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      param7.a(225, (double)(var15 - -var23), 5);
                      break L22;
                    }
                  }
                  if (param7.field_e <= 0) {
                    if (var16 != 0) {
                      param7.field_e = 32;
                      var21 = -10;
                      L32: while (true) {
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
                          if ((uj.field_l ^ -1) == -2) {
                            L33: {
                              var13 = (int)(((double)(-param3.field_e) + (param8 + (double)param10) - param7.field_l.field_f) * 24.0);
                              var14 = (int)(24.0 * ((double)(-param3.field_g) + (param5 + (double)param9) - param7.field_l.field_a));
                              var21 = -(int)Math.sqrt((double)(var14 * var14 + var13 * var13)) + 256;
                              if ((var21 ^ -1) >= -129) {
                                break L33;
                              } else {
                                var21 = 128;
                                break L33;
                              }
                            }
                            if (0 >= var21) {
                              break L13;
                            } else {
                              jh.a(uh.field_i * var21 / 128, (byte) 120, 41, sf.field_V, 5);
                              break L13;
                            }
                          } else {
                            break L13;
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
                          continue L32;
                        }
                      }
                    } else {
                      break L13;
                    }
                  } else {
                    param7.field_e = param7.field_e - 1;
                    break L13;
                  }
                }
              } else {
                if (-1 != param7.field_e % 5) {
                  break L13;
                } else {
                  L34: {
                    param7.field_e = 10;
                    if ((uj.field_l ^ -1) == -2) {
                      L35: {
                        var13 = (int)(24.0 * ((double)(-param3.field_e) + (param8 + (double)param10) - param7.field_l.field_f));
                        var14 = (int)((-param7.field_l.field_a + ((double)(-param3.field_g) + (param5 + (double)param9))) * 24.0);
                        var16 = 256 - (int)Math.sqrt((double)(var14 * var14 + var13 * var13));
                        if (-129 > (var16 ^ -1)) {
                          var16 = 128;
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                      if ((var16 ^ -1) >= -1) {
                        break L34;
                      } else {
                        jh.a(var16 * uh.field_i / 256, (byte) 51, 46, sf.field_V, 5);
                        break L34;
                      }
                    } else {
                      break L34;
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
                  break L13;
                }
              }
            } else {
              break L13;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -127) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, gb param1, gb param2, gb param3) {
        int var8 = 0;
        int var9 = 0;
        pg[] var14 = null;
        int var11_int = 0;
        int var13 = HostileSpawn.field_I ? 1 : 0;
        bh.field_a = jd.a((byte) 33, "commonui", param3, "frame_top");
        g.field_G = jd.a((byte) 33, "commonui", param3, "frame_bottom");
        sf.field_ab = ci.a("commonui", 116, "jagex_logo_grey", param3);
        km.field_y = jd.a((byte) 33, "commonui", param3, "button");
        cf.field_u = ei.a(param3, 113, "commonui", "validation");
        jn.field_G = (vm) (Object) th.a(param3, -107, "arezzo12", param1, "commonui");
        jd.field_s = (vm) (Object) th.a(param3, 25, "arezzo14", param1, "commonui");
        pe.field_eb = (vm) (Object) th.a(param3, 9, "arezzo14bold", param1, "commonui");
        bd var17 = new bd(param2.a("", "button.gif", param0 ^ 0), (java.awt.Component) (Object) se.field_h);
        pg discarded$0 = qm.a("commonui", 0, "dropdown", param3);
        pg[] var5 = sg.a(true, "commonui", param3, "screen_options");
        ak.field_h = new pg[4];
        nl.field_e = new pg[4];
        dd.field_n = new pg[4];
        pg[][] var6 = new pg[][]{nl.field_e, ak.field_h, dd.field_n};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_k;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_j[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var14 = var6[var9];
            pg[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = kb.a(var5[var9], var21[var11_int], (byte) 115);
            }
        }
        var9 = var17.field_A;
        pf.b(511);
        var17.a();
        si.g(0, 0, si.field_e, si.field_k);
        bd var15 = new bd(var9, var9);
        bd var18 = var15;
        var18.a();
        var17.c(0, 0);
        bd var11 = new bd(var9, var9);
        var11.a();
        var17.c(-var17.field_z + var9, 0);
        bd var12 = new bd(var17.field_z - var9 * 2, var9);
        var12.a();
        var17.c(-var9, param0);
        eh.b(false);
        km.field_y = new bd[]{var15, var12, var11};
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
