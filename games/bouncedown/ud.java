/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static int field_a;
    int field_p;
    double field_o;
    int field_n;
    int field_f;
    int field_t;
    double field_c;
    static bc field_k;
    int field_h;
    private int field_s;
    double field_d;
    int field_i;
    static String field_b;
    int field_l;
    private int field_m;
    double field_e;
    double field_u;
    private pi field_r;
    double field_j;
    private pi field_g;
    double field_q;

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        tg var6 = null;
        int var6_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        tg var12 = null;
        tg var13 = null;
        tg var14 = null;
        tg var15 = null;
        tg var16 = null;
        tg var17 = null;
        L0: {
          var10 = Bounce.field_N;
          var4 = 0;
          if (!param1) {
            break L0;
          } else {
            ((ud) this).a((dg[]) null, (rb) null, 62, (ue[]) null, -0.16860739722231136, (byte) 54);
            break L0;
          }
        }
        L1: {
          L2: {
            na.d();
            var5 = 0;
            if (u.field_g) {
              break L2;
            } else {
              if (ka.field_o == null) {
                break L1;
              } else {
                if (!ka.field_o.field_d) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            if (0 == param0) {
              var5 = 32 + param2 / 2;
              var4 = param2 / 2;
              na.e(2, -32 + (2 + var5), -4 + param2, 156, 0);
              ve.a(160, var5 - 32, cl.field_p, (byte) -99, param2, 0);
              gk.field_e.a(u.field_f, var4, var5 + 64, 16777215, -1);
              jh.field_s.a(gd.field_b[nj.field_m] + "<lt> <gt>" + gd.field_b[ee.field_a], var4, 24 + var5 + 64, 11579647, -1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param0 == 1) {
              var4 = -1 + (-(param2 / 2) + 640);
              var5 = param2 / 2 - -32;
              na.e(640 + -param2 - -2, var5 + -30, param2 - 4, 156, 0);
              ve.a(160, -32 + var5, cl.field_p, (byte) -116, param2, 640 + -param2);
              gk.field_e.a(c.field_a, var4, var5 - -64, 16777215, -1);
              if (2 != field_a) {
                jh.field_s.a(wa.field_a, var4, var5 + 88, 16744576, -1);
                jh.field_s.a(ka.field_k, var4, 20 + var5 + 88, 16744576, -1);
                break L4;
              } else {
                gk.field_e.a(wa.field_a, var4, 18 + (var5 - -64), 16744576, -1);
                gk.field_e.a(ka.field_k, var4, 14 + (var5 - -64) + 18, 16744576, -1);
                break L4;
              }
            } else {
              break L4;
            }
          }
          if (param0 == 2) {
            var5 = 32 + (param2 / 2 - -240);
            var4 = param2 / 2;
            na.e(2, 2 + (var5 + -32), param2 + -4, 156, 0);
            ve.a(160, -32 + var5, cl.field_p, (byte) -112, param2, 0);
            gk.field_e.a(bk.field_b, var4, var5 + 64, 16777215, -1);
            jh.field_s.a(gd.field_b[nb.field_g] + "<lt> <gt>" + gd.field_b[db.field_S], var4, var5 + 88, 8454016, -1);
            break L1;
          } else {
            break L1;
          }
        }
        L5: {
          na.e(param2, 0, 512 + param2, 446);
          if (((ud) this).field_p == 0) {
            L6: {
              var6 = new tg(100, 100);
              var8 = (int)((double)param2 + ((ud) this).field_u) - 50;
              var9 = -50 + (int)(((ud) this).field_j - ((ud) this).field_e / 2.0);
              var6.d();
              dg.field_a[param0].b(50, 0, -741572379, (int)((ud) this).field_o, 50);
              wj.field_d[param0].b((int)(-(1.3 * ((ud) this).field_c) + (50.0 + ((ud) this).field_e / 20.0)), 0, -741572379, (int)((ud) this).field_o, (int)(50.0 + ((ud) this).field_e / 4.0 - 0.5 * ((ud) this).field_q));
              if (((ud) this).field_d <= 0.0) {
                break L6;
              } else {
                se.field_A.b((int)(0.8 * ((ud) this).field_c + 50.0), 0, -741572379, (int)((ud) this).field_o + 10, (int)(-(1.0 * ((ud) this).field_e / 4.0) + 50.0 + ((ud) this).field_q * 0.6));
                break L6;
              }
            }
            L7: {
              if (2 == param0) {
                var16 = new tg(100, 100);
                var16.d();
                ge.field_b.b((int)(50.0 - ((ud) this).field_e / 6.0 + 0.8 * ((ud) this).field_c), 0, -741572379, 96, (int)(((ud) this).field_q * 0.6 + (50.0 - 1.0 * ((ud) this).field_e / 4.0)));
                ge.field_b.b((int)(50.0 + 0.8 * ((ud) this).field_c), 0, -741572379, 128, (int)(50.0 - 1.0 * ((ud) this).field_e / 4.0 + ((ud) this).field_q * 0.6));
                ge.field_b.b((int)(((ud) this).field_c * 0.8 + (((ud) this).field_e / 5.0 + 50.0)), 0, -741572379, 85, (int)(50.0 - ((ud) this).field_e * 1.0 / 4.0 + ((ud) this).field_q * 0.6));
                var6.d();
                var16.c(-1, 0, 0);
                var16.c(1, 0, 0);
                var16.c(0, -1, 0);
                var16.c(0, 1, 0);
                var16.a(0, 0);
                var12 = new tg(100, 100);
                var17 = var12;
                var12.d();
                hd.field_a[param0].b((int)(50.0 - ((ud) this).field_e / 6.0 + ((ud) this).field_c * 1.2), 0, -741572379, 96, (int)(((ud) this).field_q + (50.0 - ((ud) this).field_e * 1.0 / 4.0)));
                hd.field_a[param0].b((int)(1.2 * ((ud) this).field_c + 50.0), 0, -741572379, 128, (int)(50.0 - 1.0 * ((ud) this).field_e / 4.0 + ((ud) this).field_q));
                hd.field_a[param0].b((int)(((ud) this).field_c * 1.2 + (50.0 + ((ud) this).field_e / 5.0)), 0, -741572379, 85, (int)(((ud) this).field_q + (50.0 - 1.0 * ((ud) this).field_e / 4.0)));
                var6.d();
                var17.c(-1, 0, 0);
                var17.c(1, 0, 0);
                var17.c(0, -1, 0);
                var17.c(0, 1, 0);
                var17.a(0, 0);
                break L7;
              } else {
                var14 = new tg(100, 100);
                var14.d();
                ge.field_b.b((int)(-(((ud) this).field_e / 10.0) + 50.0 + ((ud) this).field_c * 0.8), 0, -741572379, 128, (int)(50.0 - ((ud) this).field_e * 1.0 / 4.0 + ((ud) this).field_q * 0.6));
                ge.field_b.b((int)(0.8 * ((ud) this).field_c + (((ud) this).field_e / 10.0 + 50.0)), 0, -741572379, 128, (int)(((ud) this).field_q * 0.6 + (50.0 - ((ud) this).field_e * 1.0 / 4.0)));
                var6.d();
                var14.c(-1, 0, 0);
                var14.c(1, 0, 0);
                var14.c(0, -1, 0);
                var14.c(0, 1, 0);
                var14.a(0, 0);
                var13 = new tg(100, 100);
                var15 = var13;
                var15.d();
                hd.field_a[param0].b((int)(50.0 - ((ud) this).field_e / 10.0 + ((ud) this).field_c * 1.2), 0, -741572379, 128, (int)(((ud) this).field_q + (-(1.0 * ((ud) this).field_e / 4.0) + 50.0)));
                hd.field_a[param0].b((int)(((ud) this).field_e / 10.0 + 50.0 + ((ud) this).field_c * 1.2), 0, -741572379, 128, (int)(-(((ud) this).field_e * 1.0 / 4.0) + 50.0 + ((ud) this).field_q));
                var6.d();
                var15.c(-1, 0, 0);
                var15.c(1, 0, 0);
                var15.c(0, -1, 0);
                var15.c(0, 1, 0);
                var15.a(0, 0);
                break L7;
              }
            }
            L8: {
              L9: {
                ca.field_d.c(64);
                var4 = var4 - var6.field_s / 2;
                var5 -= 32;
                var6.e();
                if (u.field_g) {
                  break L9;
                } else {
                  if (ka.field_o == null) {
                    break L8;
                  } else {
                    if (!ka.field_o.field_d) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              if (0 >= ((ud) this).field_n) {
                break L8;
              } else {
                var6.a(var4, var5);
                break L8;
              }
            }
            na.e(param2, 0, 512 + param2, 446);
            if (((ud) this).field_i / 5 % 2 != 0) {
              break L5;
            } else {
              if (((ud) this).field_n > 0) {
                var6.c(-1 + var8, var9, 0);
                var6.c(1 + var8, var9, 0);
                var6.c(var8, var9 - 1, 0);
                var6.c(var8, var9 - -1, 0);
                var6.a(var8, var9);
                break L5;
              } else {
                break L5;
              }
            }
          } else {
            L10: {
              if (((ud) this).field_p != 1) {
                break L10;
              } else {
                L11: {
                  var6_int = 8 * param0 + (-(8 * ((ud) this).field_f) + 400) / 50 % 8;
                  if ((param0 - -1) * 8 <= var6_int) {
                    break L11;
                  } else {
                    w.field_c[var6_int].b((int)((double)param2 + ((ud) this).field_u), 0, -741572379, (int)((ud) this).field_o, (int)(-34.0 + (480.0 - ((ud) this).field_e)));
                    break L11;
                  }
                }
                L12: {
                  if (u.field_g) {
                    break L12;
                  } else {
                    if (null == ka.field_o) {
                      break L10;
                    } else {
                      if (ka.field_o.field_d) {
                        break L12;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                var5 += 18;
                na.d();
                w.field_c[8 * param0 + 7].a(var4 + -25, var5 - 75);
                na.e(param2, 0, 512 + param2, 446);
                break L10;
              }
            }
            L13: {
              if (((ud) this).field_p == 2) {
                L14: {
                  var6_int = 0;
                  if (50 >= ((ud) this).field_f) {
                    var6_int = 3 * param0 + 2;
                    break L14;
                  } else {
                    var6_int = 3 * param0 + (100 - ((ud) this).field_f) * 3 / 50;
                    break L14;
                  }
                }
                L15: {
                  if (var6_int >= 3 * param0 + 3) {
                    break L15;
                  } else {
                    vb.field_m[var6_int].b((int)(((ud) this).field_u + (double)param2), 0, -741572379, (int)((ud) this).field_o, (int)(-(((ud) this).field_e / 2.0) + ((ud) this).field_j));
                    break L15;
                  }
                }
                L16: {
                  if (u.field_g) {
                    break L16;
                  } else {
                    if (ka.field_o == null) {
                      break L13;
                    } else {
                      if (!ka.field_o.field_d) {
                        break L13;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                var5 += 18;
                na.d();
                vb.field_m[2 - -(param0 * 3)].b(var4, 0, -741572379, (int)((ud) this).field_o, var5);
                na.e(param2, 0, 512 + param2, 446);
                break L13;
              } else {
                break L13;
              }
            }
            if (((ud) this).field_p == 3) {
              L17: {
                ci.field_G[param0].b((int)((double)param2 + ((ud) this).field_u), 0, -741572379, 100 + ((int)((ud) this).field_o + -(4 * ((ud) this).field_f)), (int)(((ud) this).field_j - ((ud) this).field_e / 2.0));
                if (u.field_g) {
                  break L17;
                } else {
                  if (ka.field_o == null) {
                    break L5;
                  } else {
                    if (ka.field_o.field_d) {
                      break L17;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              na.d();
              var5 += 18;
              ci.field_G[param0].b(var4, 0, -741572379, (int)((ud) this).field_o, var5);
              na.e(param2, 0, 512 + param2, 446);
              break L5;
            } else {
              break L5;
            }
          }
        }
    }

    final void a(dg[] param0, rb param1, int param2, ue[] param3, double param4, byte param5) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Bounce.field_N;
          ((ud) this).field_e = ((ud) this).field_o * 50.0 / 128.0;
          if (96.0 > ((ud) this).field_o) {
            ((ud) this).field_o = ((ud) this).field_o + 0.05;
            if (((ud) this).field_o > 96.0) {
              ((ud) this).field_o = 96.0;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (param5 == 90) {
          L1: {
            if (96.0 < ((ud) this).field_o) {
              ((ud) this).field_o = ((ud) this).field_o - 0.05;
              if (96.0 > ((ud) this).field_o) {
                ((ud) this).field_o = 96.0;
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          L2: {
            L3: {
              if (((ud) this).field_p == 0) {
                break L3;
              } else {
                if (((ud) this).field_p != 2) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var8_int = 0;
              if (((ud) this).field_d > 0.0) {
                ((ud) this).field_d = ((ud) this).field_d - 0.1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var9 = 0;
              if (((ud) this).field_p <= 0) {
                break L5;
              } else {
                ((ud) this).field_c = 0.99 * ((ud) this).field_c;
                break L5;
              }
            }
            L6: {
              if (((ud) this).field_i > 0) {
                ((ud) this).field_i = ((ud) this).field_i - 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((ud) this).field_c < -4.0) {
                ((ud) this).field_c = -4.0;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (4.0 < ((ud) this).field_c) {
                ((ud) this).field_c = 4.0;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((ud) this).field_c < 0.0) {
                ((ud) this).field_u = ((ud) this).field_u - (-((ud) this).field_c + 0.0) * 128.0 / ((ud) this).field_o;
                ((ud) this).field_c = ((ud) this).field_c + 0.1;
                if (((ud) this).field_c > 0.0) {
                  ((ud) this).field_c = 0.0;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (((ud) this).field_q != 0.0) {
                ((ud) this).field_t = -1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (((ud) this).field_c > 0.0) {
                ((ud) this).field_u = ((ud) this).field_u + ((ud) this).field_c * 128.0 / ((ud) this).field_o;
                ((ud) this).field_c = ((ud) this).field_c - 0.1;
                if (0.0 > ((ud) this).field_c) {
                  ((ud) this).field_c = 0.0;
                  break L11;
                } else {
                  break L11;
                }
              } else {
                break L11;
              }
            }
            L12: {
              if (((ud) this).field_t <= -1) {
                L13: {
                  if (0.0 >= ((ud) this).field_q) {
                    break L13;
                  } else {
                    var10 = 0;
                    L14: while (true) {
                      if (~param2 >= ~var10) {
                        break L13;
                      } else {
                        L15: {
                          if (((ud) this).field_u <= -(((ud) this).field_e / 2.0) + (param0[var10].field_c - 64.0)) {
                            break L15;
                          } else {
                            if (param0[var10].field_c + 64.0 + ((ud) this).field_e / 2.0 <= ((ud) this).field_u) {
                              break L15;
                            } else {
                              if (6 == param0[var10].field_d) {
                                break L15;
                              } else {
                                if (param0[var10].field_j <= ((ud) this).field_j) {
                                  break L15;
                                } else {
                                  if (param0[var10].field_j >= 1.0 + (((ud) this).field_q + ((ud) this).field_j + param4)) {
                                    break L15;
                                  } else {
                                    L16: {
                                      ((ud) this).field_t = var10;
                                      if (!wd.field_x) {
                                        break L16;
                                      } else {
                                        param1.a(param3[7], 100, md.field_w * 48 / 256);
                                        break L16;
                                      }
                                    }
                                    ((ud) this).field_j = param0[((ud) this).field_t].field_j;
                                    ((ud) this).field_q = 0.0;
                                    break L15;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L17: {
                          if (((ud) this).field_u <= -(((ud) this).field_e / 2.0) + (param0[var10].field_c - (double)param0[var10].field_b)) {
                            break L17;
                          } else {
                            if (param0[var10].field_c + (double)param0[var10].field_b + ((ud) this).field_e / 2.0 <= ((ud) this).field_u) {
                              break L17;
                            } else {
                              if (6 != param0[var10].field_d) {
                                break L17;
                              } else {
                                if (param0[var10].field_j <= ((ud) this).field_j) {
                                  break L17;
                                } else {
                                  if (((ud) this).field_j + ((ud) this).field_q + param4 + 1.0 > param0[var10].field_j) {
                                    L18: {
                                      ((ud) this).field_t = var10;
                                      if (wd.field_x) {
                                        param1.a(param3[14], 100, 96 * md.field_w / 256);
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    ((ud) this).field_j = param0[((ud) this).field_t].field_j;
                                    ((ud) this).field_q = 0.0;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var10++;
                        continue L14;
                      }
                    }
                  }
                }
                if (((ud) this).field_t == -1) {
                  ((ud) this).field_j = ((ud) this).field_j + ((ud) this).field_q;
                  ((ud) this).field_q = ((ud) this).field_q + 0.2;
                  break L12;
                } else {
                  ((ud) this).field_q = 0.0;
                  break L12;
                }
              } else {
                L19: {
                  if (param0[((ud) this).field_t].field_d != 1) {
                    break L19;
                  } else {
                    if (1 >= param0[((ud) this).field_t].field_b) {
                      L20: {
                        param0[((ud) this).field_t].field_b = 1;
                        ((ud) this).field_j = ((ud) this).field_j - 6.0;
                        ((ud) this).field_q = -(403.20000000000005 / ((ud) this).field_o) - ta.field_c;
                        ((ud) this).field_t = -1;
                        if (!wd.field_x) {
                          break L20;
                        } else {
                          if (91.0 <= ((ud) this).field_o) {
                            break L20;
                          } else {
                            param1.a(param3[5], 100, 96 * md.field_w / 256);
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (wd.field_x) {
                          if (91.0 > ((ud) this).field_o) {
                            break L21;
                          } else {
                            if (((ud) this).field_o > 101.0) {
                              break L21;
                            } else {
                              param1.a(param3[4], 100, md.field_w * 96 / 256);
                              break L21;
                            }
                          }
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (wd.field_x) {
                          if (((ud) this).field_o <= 101.0) {
                            break L22;
                          } else {
                            param1.a(param3[6], 100, 96 * md.field_w / 256);
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      if (vk.field_b != 1) {
                        break L19;
                      } else {
                        if (null != ka.field_o) {
                          break L19;
                        } else {
                          L23: {
                            if (nb.field_e >= 6) {
                              break L23;
                            } else {
                              nb.field_e = nb.field_e + 1;
                              qf.field_c = qf.field_c + 10000;
                              break L23;
                            }
                          }
                          if (nb.field_e != 5) {
                            break L19;
                          } else {
                            dk.a(false, 3, 252);
                            break L19;
                          }
                        }
                      }
                    } else {
                      break L19;
                    }
                  }
                }
                L24: {
                  if (-1 >= ((ud) this).field_t) {
                    break L24;
                  } else {
                    if (param0[((ud) this).field_t].field_d == 1) {
                      break L24;
                    } else {
                      qf.field_c = qf.field_c - nb.field_e * 10000;
                      nb.field_e = 0;
                      break L24;
                    }
                  }
                }
                L25: {
                  if (((ud) this).field_t > -1) {
                    if (param0[((ud) this).field_t].field_d != 2) {
                      break L25;
                    } else {
                      if (0 != param0[((ud) this).field_t].field_b) {
                        break L25;
                      } else {
                        if (91.0 >= ((ud) this).field_o) {
                          break L25;
                        } else {
                          L26: {
                            param0[((ud) this).field_t].field_b = 1;
                            if (!wd.field_x) {
                              break L26;
                            } else {
                              param1.a(param3[0], 100, 96 * md.field_w / 256);
                              break L26;
                            }
                          }
                          if (vk.field_b != 1) {
                            break L25;
                          } else {
                            if (ka.field_o == null) {
                              L27: {
                                if (k.field_C >= 6) {
                                  break L27;
                                } else {
                                  k.field_C = k.field_C + 1;
                                  qf.field_c = qf.field_c + 100000;
                                  break L27;
                                }
                              }
                              if (5 != k.field_C) {
                                break L25;
                              } else {
                                dk.a(false, 4, 251);
                                break L25;
                              }
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                L28: {
                  if (((ud) this).field_t <= -1) {
                    break L28;
                  } else {
                    if (param0[((ud) this).field_t].field_d != 2) {
                      qf.field_c = qf.field_c - 100000 * k.field_C;
                      k.field_C = 0;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                }
                L29: {
                  if (((ud) this).field_t <= -1) {
                    break L29;
                  } else {
                    if (param0[((ud) this).field_t].field_d != 2) {
                      break L29;
                    } else {
                      if (16 < param0[((ud) this).field_t].field_b) {
                        ((ud) this).field_t = -1;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                L30: {
                  if (((ud) this).field_t <= -1) {
                    break L30;
                  } else {
                    if (3 == param0[((ud) this).field_t].field_d) {
                      ((ud) this).field_c = ((ud) this).field_c + 0.2;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                }
                L31: {
                  if (((ud) this).field_t <= -1) {
                    break L31;
                  } else {
                    if (4 == param0[((ud) this).field_t].field_d) {
                      ((ud) this).field_c = ((ud) this).field_c - 0.2;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                }
                L32: {
                  if (-1 < ((ud) this).field_t) {
                    if (param0[((ud) this).field_t].field_d != 5) {
                      break L32;
                    } else {
                      if (param0[((ud) this).field_t].field_b != 0) {
                        break L32;
                      } else {
                        if (((ud) this).field_o <= 64.0) {
                          break L32;
                        } else {
                          L33: {
                            if (!wd.field_x) {
                              break L33;
                            } else {
                              L34: {
                                if (null == ((ud) this).field_r) {
                                  if (64.0 >= ((ud) this).field_o) {
                                    break L34;
                                  } else {
                                    L35: {
                                      ((ud) this).field_r = pi.a(param3[8], 100, 0);
                                      var10 = (int)(128.0 - ((ud) this).field_o);
                                      if (var10 < 0) {
                                        var10 = 0;
                                        break L35;
                                      } else {
                                        break L35;
                                      }
                                    }
                                    ((ud) this).field_r.d(var10 * param3[8].field_k / 50);
                                    ((ud) this).field_s = 10;
                                    ((ud) this).field_r.c(param3[8].field_k / 50, 10);
                                    if (!wd.field_x) {
                                      break L34;
                                    } else {
                                      param1.a((wf) (Object) ((ud) this).field_r);
                                      break L34;
                                    }
                                  }
                                } else {
                                  if (160 <= ((ud) this).field_s) {
                                    break L34;
                                  } else {
                                    ((ud) this).field_s = ((ud) this).field_s + 10;
                                    ((ud) this).field_r.c(param3[8].field_k / 50, md.field_w * ((ud) this).field_s / 256);
                                    break L34;
                                  }
                                }
                              }
                              var8_int = 1;
                              break L33;
                            }
                          }
                          ((ud) this).field_o = ((ud) this).field_o - 1.0;
                          break L32;
                        }
                      }
                    }
                  } else {
                    break L32;
                  }
                }
                L36: {
                  if (-1 >= ((ud) this).field_t) {
                    break L36;
                  } else {
                    if (param0[((ud) this).field_t].field_d != 5) {
                      break L36;
                    } else {
                      if (param0[((ud) this).field_t].field_b != 1) {
                        break L36;
                      } else {
                        if (((ud) this).field_o < 128.0) {
                          L37: {
                            if (wd.field_x) {
                              L38: {
                                if (((ud) this).field_g != null) {
                                  if (((ud) this).field_m < 160) {
                                    ((ud) this).field_m = ((ud) this).field_m + 10;
                                    ((ud) this).field_g.c(param3[3].field_k / 50, md.field_w * ((ud) this).field_m / 256);
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                } else {
                                  if (126.0 > ((ud) this).field_o) {
                                    L39: {
                                      ((ud) this).field_g = pi.a(param3[3], 100, 0);
                                      var10 = (int)(-32.0 + ((ud) this).field_o);
                                      if (var10 >= 0) {
                                        break L39;
                                      } else {
                                        var10 = 0;
                                        break L39;
                                      }
                                    }
                                    ((ud) this).field_g.d(var10 * param3[3].field_k / 50);
                                    ((ud) this).field_m = 10;
                                    ((ud) this).field_g.c(param3[3].field_k / 50, 10);
                                    if (wd.field_x) {
                                      param1.a((wf) (Object) ((ud) this).field_g);
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              var9 = 1;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          ((ud) this).field_o = ((ud) this).field_o + 1.0;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                }
                L40: {
                  if (((ud) this).field_t > -1) {
                    if (param0[((ud) this).field_t].field_d != 5) {
                      break L40;
                    } else {
                      if (2 != param0[((ud) this).field_t].field_b) {
                        break L40;
                      } else {
                        if (((ud) this).field_d >= 50.0) {
                          break L40;
                        } else {
                          L41: {
                            if (!wd.field_x) {
                              break L41;
                            } else {
                              if (((ud) this).field_d > 0.0) {
                                break L41;
                              } else {
                                param1.a(param3[13], 100, 96 * md.field_w / 256);
                                break L41;
                              }
                            }
                          }
                          L42: {
                            ((ud) this).field_d = ((ud) this).field_d + 1.0;
                            var10 = 0;
                            if (((ud) this).field_u - ((ud) this).field_e / 2.0 >= 5.0 + param0[((ud) this).field_t].field_c) {
                              break L42;
                            } else {
                              if (((ud) this).field_e / 2.0 + ((ud) this).field_u > -5.0 + param0[((ud) this).field_t].field_c) {
                                var10 = 1;
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                          }
                          if (var10 == 0) {
                            break L40;
                          } else {
                            ((ud) this).field_l = -1;
                            ((ud) this).field_q = -(576.0 / ((ud) this).field_o);
                            if (((ud) this).field_i > 0) {
                              if (!wd.field_x) {
                                break L40;
                              } else {
                                param1.a(param3[14], 100, 96 * md.field_w / 256);
                                break L40;
                              }
                            } else {
                              L43: {
                                if (!wd.field_x) {
                                  break L43;
                                } else {
                                  param1.a(param3[15], 100, md.field_w * 96 / 256);
                                  break L43;
                                }
                              }
                              ((ud) this).field_p = 3;
                              ((ud) this).field_f = 10;
                              break L40;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L40;
                  }
                }
                L44: {
                  if (((ud) this).field_t > -1) {
                    if (-10.0 + ((ud) this).field_j > param0[((ud) this).field_t].field_h) {
                      ((ud) this).field_t = -1;
                      break L44;
                    } else {
                      break L44;
                    }
                  } else {
                    break L44;
                  }
                }
                L45: {
                  if (((ud) this).field_t > -1) {
                    L46: {
                      if (-64.0 + param0[((ud) this).field_t].field_c - ((ud) this).field_e / 2.0 > ((ud) this).field_u) {
                        break L46;
                      } else {
                        if (((ud) this).field_u <= param0[((ud) this).field_t].field_c + 64.0 + ((ud) this).field_e / 2.0) {
                          break L45;
                        } else {
                          break L46;
                        }
                      }
                    }
                    ((ud) this).field_t = -1;
                    break L45;
                  } else {
                    break L45;
                  }
                }
                L47: {
                  if (((ud) this).field_t <= -1) {
                    break L47;
                  } else {
                    if (param0[((ud) this).field_t].field_d != 6) {
                      break L47;
                    } else {
                      L48: {
                        if (((ud) this).field_u < param0[((ud) this).field_t].field_c - (double)param0[((ud) this).field_t].field_b - ((ud) this).field_e / 2.0) {
                          break L48;
                        } else {
                          if (((ud) this).field_u <= ((ud) this).field_e / 2.0 + ((double)param0[((ud) this).field_t].field_b + param0[((ud) this).field_t].field_c)) {
                            break L47;
                          } else {
                            break L48;
                          }
                        }
                      }
                      ((ud) this).field_t = -1;
                      break L47;
                    }
                  }
                }
                if (((ud) this).field_t <= -1) {
                  break L12;
                } else {
                  ((ud) this).field_j = param0[((ud) this).field_t].field_j;
                  break L12;
                }
              }
            }
            L49: {
              if (((ud) this).field_u >= ((ud) this).field_e / 2.0) {
                break L49;
              } else {
                ((ud) this).field_u = ((ud) this).field_e / 2.0;
                break L49;
              }
            }
            L50: {
              if (-(((ud) this).field_e / 2.0) + 512.0 < ((ud) this).field_u) {
                ((ud) this).field_u = 512.0 - ((ud) this).field_e / 2.0;
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              if (25.0 + ((double)eg.field_n + ((ud) this).field_e) > ((ud) this).field_j) {
                ((ud) this).field_q = 1.0;
                ((ud) this).field_l = -1;
                ((ud) this).field_j = ((ud) this).field_e + (double)eg.field_n + 30.0;
                if (((ud) this).field_i > 0) {
                  if (!wd.field_x) {
                    break L51;
                  } else {
                    param1.a(param3[14], 100, 96 * md.field_w / 256);
                    break L51;
                  }
                } else {
                  L52: {
                    if (wd.field_x) {
                      param1.a(param3[15], 100, 96 * md.field_w / 256);
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  ((ud) this).field_p = 3;
                  ((ud) this).field_f = 10;
                  break L51;
                }
              } else {
                break L51;
              }
            }
            L53: {
              if (446.0 < ((ud) this).field_j) {
                ((ud) this).field_q = 0.0;
                ((ud) this).field_l = -1;
                ((ud) this).field_j = -10.0;
                if (((ud) this).field_i <= 0) {
                  L54: {
                    if (wd.field_x) {
                      param1.a(param3[12], 100, md.field_w * 96 / 256);
                      break L54;
                    } else {
                      break L54;
                    }
                  }
                  ((ud) this).field_f = 50;
                  ((ud) this).field_p = 1;
                  break L53;
                } else {
                  L55: {
                    if (!wd.field_x) {
                      break L55;
                    } else {
                      param1.a(param3[14], 100, md.field_w * 96 / 256);
                      break L55;
                    }
                  }
                  ((ud) this).field_p = 0;
                  break L53;
                }
              } else {
                break L53;
              }
            }
            L56: {
              if (var9 != 0) {
                break L56;
              } else {
                ((ud) this).a(param3, false);
                break L56;
              }
            }
            if (var8_int == 0) {
              ((ud) this).a(param3, (byte) 106);
              break L2;
            } else {
              break L2;
            }
          }
          L57: {
            if (((ud) this).field_p > 0) {
              ((ud) this).field_c = 0.0;
              ((ud) this).field_f = ((ud) this).field_f - 1;
              if (((ud) this).field_f <= 0) {
                L58: {
                  if (2 == ((ud) this).field_p) {
                    break L58;
                  } else {
                    ((ud) this).field_o = 96.0;
                    ((ud) this).field_d = 0.0;
                    break L58;
                  }
                }
                ((ud) this).field_p = 0;
                ((ud) this).field_f = 0;
                break L57;
              } else {
                break L57;
              }
            } else {
              break L57;
            }
          }
          L59: {
            if (((ud) this).field_p == 0) {
              ((ud) this).field_f = 0;
              break L59;
            } else {
              break L59;
            }
          }
          return;
        } else {
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final void a(boolean param0) {
        ((ud) this).field_c = 0.0;
        ((ud) this).field_o = 96.0;
        ((ud) this).field_d = 0.0;
        ((ud) this).field_j = 128.0;
        ((ud) this).field_e = 32.0;
        if (!param0) {
            ((ud) this).field_p = -117;
        }
        ((ud) this).field_u = 256.0;
        ((ud) this).field_t = -1;
        ((ud) this).field_i = 160;
        ((ud) this).field_n = 3;
        ((ud) this).field_l = 0;
        ((ud) this).field_q = 0.0;
        ((ud) this).field_h = (int)(2.0 * Math.random());
        ((ud) this).field_p = 0;
        ((ud) this).field_f = 0;
    }

    final void a(ue[] param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (((ud) this).field_g == null) {
                  break L1;
                } else {
                  L2: {
                    if (wd.field_x) {
                      ((ud) this).field_g.i(param0[3].field_k * ((ud) this).field_m / 1000);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((ud) this).field_g = null;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("ud.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static void b() {
        int var1 = 14;
    }

    public static void a() {
        field_k = null;
        field_b = null;
    }

    final void a(ue[] param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 106) {
                break L1;
              } else {
                ((ud) this).a((dg[]) null, (rb) null, -3, (ue[]) null, -0.052863935081619066, (byte) 41);
                break L1;
              }
            }
            L2: {
              if (((ud) this).field_r == null) {
                break L2;
              } else {
                L3: {
                  if (wd.field_x) {
                    ((ud) this).field_r.i(param0[8].field_k * ((ud) this).field_s / 1000);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((ud) this).field_r = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("ud.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    ud() {
        ((ud) this).a(true);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = Bounce.field_N;
          if (param13 < param9) {
            if (param9 < param10) {
              ek.a(param4, na.field_d, param11, param15, param6, param12, param1, param9, param5, false, param14, param0, param10, param13, param2, param8, param3);
              break L0;
            } else {
              if (param13 >= param10) {
                ek.a(param6, na.field_d, param1, param14, param8, param3, param2, param13, param12, false, param0, param15, param9, param10, param11, param4, param5);
                break L0;
              } else {
                ek.a(param8, na.field_d, param2, param14, param6, param3, param1, param10, param5, false, param15, param0, param9, param13, param11, param4, param12);
                break L0;
              }
            }
          } else {
            if (param13 < param10) {
              ek.a(param6, na.field_d, param1, param15, param4, param12, param11, param13, param3, false, param0, param14, param10, param9, param2, param8, param5);
              break L0;
            } else {
              if (param10 > param9) {
                ek.a(param8, na.field_d, param2, param0, param4, param5, param11, param10, param3, false, param15, param14, param13, param9, param1, param6, param12);
                break L0;
              } else {
                ek.a(param4, na.field_d, param11, param0, param8, param5, param2, param9, param12, false, param14, param15, param13, param10, param1, param6, param3);
                break L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Open in popup window";
        field_k = new bc();
    }
}
