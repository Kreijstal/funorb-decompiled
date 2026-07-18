/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jla {
    static rca field_a;
    int field_b;
    private jd field_e;
    static ee field_d;
    static String field_c;
    static String field_f;

    private final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                if (nt.field_z == null) {
                  L3: {
                    if (null != pm.field_v) {
                      break L3;
                    } else {
                      nt.field_z = bla.a(29611, "basic", "fly_small", wha.field_a);
                      vla.field_r = new ee[2];
                      var2_int = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (nt.field_z.length <= var2_int) {
                              break L6;
                            } else {
                              vla.field_r[var2_int] = nt.field_z[var2_int].b();
                              var2_int++;
                              if (var11 != 0) {
                                break L5;
                              } else {
                                if (var11 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          bp.field_y = bla.a(29611, "basic", "maggot_small", wha.field_a);
                          vu.field_k = new ee[bp.field_y.length];
                          break L5;
                        }
                        var2_int = 0;
                        L7: while (true) {
                          L8: {
                            if (~var2_int <= ~bp.field_y.length) {
                              break L8;
                            } else {
                              vu.field_k[var2_int] = bp.field_y[var2_int].b();
                              var2_int++;
                              if (var11 != 0) {
                                break L1;
                              } else {
                                if (var11 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  bp.field_y = hha.field_y;
                  vla.field_r = hb.field_k;
                  vu.field_k = ik.field_h;
                  nt.field_z = pm.field_v;
                  break L2;
                } else {
                  break L2;
                }
              }
              var2_int = 590;
              break L1;
            }
            L9: {
              var3 = 0;
              aha.field_D.c(ana.field_o[0], 25, 30, uga.field_v, -1);
              var3++;
              var3 = var3 + g.field_g.a(ana.field_o[1], 25, 30 + g.field_g.field_u * var3, var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var3 += 2;
              aha.field_D.c(ana.field_o[2], 25, var3 * g.field_g.field_u + 40, uga.field_v, -1);
              var3 += 2;
              if (param0 == -56) {
                break L9;
              } else {
                field_d = null;
                break L9;
              }
            }
            L10: {
              L11: {
                g.field_g.c(ana.field_o[3], 25, 40 + g.field_g.field_u * var3, 3518976, -1);
                var3 += 2;
                g.field_g.c(ana.field_o[4], 25, 40 - -(g.field_g.field_u * var3), 3518976, -1);
                var3++;
                var2_int -= 90;
                var3 = var3 + g.field_g.a(ana.field_o[5], 25, (var3 - -1) * g.field_g.field_u + 40, var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
                var4 = 570;
                var5 = 20 + var3 * g.field_g.field_u;
                vw.field_a[2].field_b[102].a(-(vw.field_a[0].field_b[0].field_d / 2) + var4, 16 + var5);
                var6 = vr.field_b;
                var7 = (int)(Math.sin(0.5 * ((double)((var5 * var4 << 1471746946) + var6) / 40.0)) * 30.0);
                var8 = (int)(Math.cos((double)(var6 + (var4 * var5 << 607760674)) / 40.0 * 0.5) * 15.0);
                var3 += 7;
                if (var8 >= 0) {
                  break L11;
                } else {
                  nt.field_z[(var6 >> 1345695810) % 2].b(var7 + var4 - 7, var5 + var8, 16711680);
                  if (var11 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              vla.field_r[(var6 >> 995949122) % 2].b(-7 + var4 - -var7, var5 - -var8, 16711680);
              break L10;
            }
            L12: {
              L13: {
                var3 = var3 + g.field_g.a(ana.field_o[6], 25, g.field_g.field_u * var3 + 40, var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
                var5 = g.field_g.field_u * (-2 + var3) + 40;
                vw.field_a[1].field_b[102].a(-(vw.field_a[0].field_b[0].field_d / 2) + var4, var5 + -14);
                var7 = (int)(32.0 * Math.sin((double)(var6 + (var4 * var5 << -1057849950)) / 80.0 * 0.5));
                var8 = (int)(Math.cos(0.5 * ((double)((var5 * var4 << 1414470626) + var6) / 80.0)) * 15.0);
                var9 = 0.5 * ((double)(var6 - -(var4 * var5 << -499725822)) / 80.0) + 1.5707963267948966;
                if (var8 < 0) {
                  break L13;
                } else {
                  L14: {
                    if (2.0943951023931953 >= var9 % 3.141592653589793) {
                      break L14;
                    } else {
                      vu.field_k[5 + (var6 >> 1782309955) % 5].a(-(bp.field_y[0].field_a / 2) + (var7 + var4), var5 + var8);
                      if (var11 == 0) {
                        break L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var9 % 3.141592653589793 <= 1.0471975511965976) {
                      break L15;
                    } else {
                      vu.field_k[(var6 >> -496769277) % 5].a(-(bp.field_y[0].field_a / 2) + (var4 + var7), var5 + var8);
                      if (var11 == 0) {
                        break L12;
                      } else {
                        break L15;
                      }
                    }
                  }
                  vu.field_k[10 + (var6 >> 1400880899) % 5].a(-(bp.field_y[0].field_a / 2) + var7 + var4, var5 + var8);
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L16: {
                if (var9 % 3.141592653589793 <= 2.0943951023931953) {
                  break L16;
                } else {
                  bp.field_y[(var6 >> 1866250659) % 5 + 10].a(var4 + (var7 - bp.field_y[0].field_a / 2), var5 + var8);
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (1.0471975511965976 >= var9 % 3.141592653589793) {
                  break L17;
                } else {
                  bp.field_y[(var6 >> 1701099651) % 5].a(var7 + var4 - bp.field_y[0].field_a / 2, var8 + var5);
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L17;
                  }
                }
              }
              bp.field_y[(var6 >> -827649949) % 5 + 5].a(var4 + (var7 - bp.field_y[0].field_a / 2), var5 - -var8);
              break L12;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.FA(" + param0 + ')');
        }
    }

    final boolean d(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param1 == 26891) {
                break L1;
              } else {
                jla.b(false, -112);
                break L1;
              }
            }
            stackOut_3_0 = ((jla) this).c(param0, 19950);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "jla.KA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void c(byte param0) {
        int var2_int = 590;
        int var3 = 0;
        aha.field_D.c(ana.field_u[0], 25, 30, uga.field_v, -1);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_u[1], 25, g.field_g.field_u * var3 + 30, var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        if (param0 <= 103) {
            return;
        }
        try {
            var3 = var3 + g.field_g.a(ana.field_u[2], 25, 30 + g.field_g.field_u * var3, var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
            var3++;
            var3 = var3 + g.field_g.a(ana.field_u[3], 25, var3 * g.field_g.field_u + 30, var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jla.CA(" + param0 + ')');
        }
    }

    int a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            if (6 != ((jla) this).field_b) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  this.a(true);
                  break L1;
                }
              }
              stackOut_22_0 = pj.field_c[((jla) this).field_b];
              stackIn_23_0 = stackOut_22_0;
              break L0;
            } else {
              if (0 == param0) {
                stackOut_6_0 = de.field_I;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0 != 2) {
                  L2: {
                    if (ut.field_o == 0) {
                      break L2;
                    } else {
                      if (kaa.field_m != 0) {
                        stackOut_17_0 = pga.field_a;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_15_0 = gha.field_e;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  stackOut_9_0 = pd.field_d;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "jla.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    private final static void b(boolean param0, int param1) {
        RuntimeException var2 = null;
        uu var2_ref = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            qm.field_d.a(param1 + -8260, true);
            qm.field_d.a(vc.field_a * 32, false, 32, 105);
            ug.field_q.a(19842, true);
            ug.field_q.a(vc.field_a * 32, false, 32, 121);
            var2_ref = (uu) (Object) mda.field_b.field_z.b((byte) 90);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_ref == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~var2_ref.field_R;
                    stackOut_3_1 = -2;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_17_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != stackIn_4_1) {
                          break L4;
                        } else {
                          L5: {
                            if (dm.field_f > 0) {
                              break L5;
                            } else {
                              if (fw.field_h[var2_ref.field_Cb].field_e) {
                                break L5;
                              } else {
                                var2_ref = (uu) (Object) mda.field_b.field_z.c(0);
                                if (var3 == 0) {
                                  continue L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          uca.a(32, (byte) 121);
                          qm.a(7, param1 ^ 29576);
                          uka.a(param1 + -28204, var2_ref.field_Cb, 1);
                          break L4;
                        }
                      }
                      var2_ref = (uu) (Object) mda.field_b.field_z.c(0);
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_16_0 = param1;
                stackOut_16_1 = 28102;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              }
              if (stackIn_17_0 == stackIn_17_1) {
                L6: {
                  bw.field_a.a(19842, true);
                  if (bw.field_a.field_R != 1) {
                    break L6;
                  } else {
                    L7: {
                      L8: {
                        if (dea.field_n > mg.field_m.field_a) {
                          break L8;
                        } else {
                          if (gu.field_d <= 0) {
                            break L8;
                          } else {
                            if (lca.c(false)) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      qm.a(32, 7758);
                      if (var3 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                    L9: {
                      if (dga.field_a == 0) {
                        break L9;
                      } else {
                        L10: {
                          if (dga.field_a != 1) {
                            break L10;
                          } else {
                            if (~(1 + gs.field_f.field_d.field_c.field_n) == ~tp.field_v) {
                              gs.field_f.e((byte) 8);
                              tp.field_v = -1;
                              if (var3 == 0) {
                                break L6;
                              } else {
                                break L9;
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (dga.field_a != 1) {
                          break L6;
                        } else {
                          if (~(gs.field_f.field_d.field_c.field_n - -1) != ~tp.field_v) {
                            return;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L11: {
                      L12: {
                        qm.a(6, 7758);
                        if (af.field_a) {
                          break L12;
                        } else {
                          if (bp.e(-29919)) {
                            break L12;
                          } else {
                            gs.field_f.a(false, iea.field_d);
                            iea.field_d = new eaa();
                            mg.field_m.field_a = mg.field_m.field_a - dea.field_n;
                            gu.field_d = 0;
                            dea.field_n = 0;
                            if (var3 == 0) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      gs.field_f.a(iea.field_d, 50);
                      pka.a((byte) -107, true);
                      break L11;
                    }
                    uca.a(33, (byte) 98);
                    break L6;
                  }
                }
                L13: {
                  lfa.field_l.a(19842, true);
                  if (lfa.field_l.field_R == 1) {
                    rs.a(true);
                    sia.field_h = true;
                    lg.a(true, -3, true);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  rv.field_l.a(19842, true);
                  if (1 != rv.field_l.field_R) {
                    break L14;
                  } else {
                    qm.a(7, param1 ^ 29576);
                    tha.field_p = tha.field_p - 1;
                    if (tha.field_p < 0) {
                      tha.field_p = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                L15: {
                  hk.field_c.a(param1 + -8260, true);
                  if (hk.field_c.field_R != 1) {
                    break L15;
                  } else {
                    qm.a(7, 7758);
                    tha.field_p = tha.field_p + 1;
                    if (tha.field_p <= gu.field_d + -1) {
                      break L15;
                    } else {
                      tha.field_p = gu.field_d + -1;
                      break L15;
                    }
                  }
                }
                L16: {
                  mg.field_l.a(param1 + -8260, true);
                  if (mg.field_l.field_R != 1) {
                    break L16;
                  } else {
                    uca.a(31, (byte) -127);
                    qm.a(31, 7758);
                    baa.field_Q = 1;
                    lf.a(param1 ^ 28154);
                    break L16;
                  }
                }
                L17: {
                  qba.field_l.a(19842, true);
                  if (qba.field_l.field_R != 1) {
                    break L17;
                  } else {
                    uca.a(31, (byte) -87);
                    qm.a(31, 7758);
                    baa.field_Q = 2;
                    lf.a(106);
                    break L17;
                  }
                }
                L18: {
                  dt.field_b.a(19842, true);
                  if (dt.field_b.field_R != 1) {
                    break L18;
                  } else {
                    uca.a(31, (byte) -10);
                    qm.a(31, param1 ^ 29576);
                    baa.field_Q = 3;
                    lf.a(82);
                    break L18;
                  }
                }
                L19: {
                  bea.field_u.a(19842, true);
                  if (bea.field_u.field_R != 1) {
                    break L19;
                  } else {
                    uca.a(31, (byte) 105);
                    qm.a(31, 7758);
                    baa.field_Q = 4;
                    lf.a(97);
                    break L19;
                  }
                }
                L20: {
                  sea.field_k.a(19842, true);
                  if (sea.field_k.field_R == 1) {
                    uca.a(31, (byte) -91);
                    qm.a(31, param1 ^ 29576);
                    baa.field_Q = 5;
                    lf.a(76);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  mk.field_h.a(param1 ^ 8260, true);
                  if (1 != mk.field_h.field_R) {
                    break L21;
                  } else {
                    uca.a(31, (byte) -62);
                    qm.a(31, 7758);
                    baa.field_Q = 6;
                    lf.a(114);
                    break L21;
                  }
                }
                L22: {
                  mja.field_q.a(param1 ^ 8260, true);
                  if (mja.field_q.field_R != 1) {
                    break L22;
                  } else {
                    uca.a(31, (byte) -65);
                    qm.a(31, 7758);
                    baa.field_Q = 7;
                    lf.a(param1 ^ 28154);
                    break L22;
                  }
                }
                L23: {
                  rfa.field_b.a(19842, true);
                  if (1 != rfa.field_b.field_R) {
                    break L23;
                  } else {
                    uca.a(31, (byte) 120);
                    qm.a(31, param1 ^ 29576);
                    baa.field_Q = 8;
                    lf.a(103);
                    break L23;
                  }
                }
                wa.e((byte) -87);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
        try {
            dg.b(0, 0, 640, 480, 65280, 4227136);
            aha.field_D.a(hl.field_E, 320, 240, 16777215, -1);
            if (param0 >= -120) {
                ((jla) this).field_e = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jla.EA(" + param0 + ')');
        }
    }

    void i(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                ada.field_p.d(0, 0);
                gla.field_j.c(137, 0);
                ml.field_a.d(127, 0);
                var2_int = 137;
                bh.field_r.e(418 + var2_int, 41);
                if (!ku.field_q) {
                  break L2;
                } else {
                  if (!lp.field_u) {
                    break L2;
                  } else {
                    gca.field_g.e(var2_int + 410, 148);
                    if (BachelorFridge.field_y == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              cba.field_a.e(var2_int + 410, 148);
              break L1;
            }
            L3: {
              vj.field_p.e(154, 17);
              if (param0 == -12988) {
                break L3;
              } else {
                ((jla) this).j(-44);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "jla.O(" + param0 + ')');
        }
    }

    private final void g(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            var2_int = hs.a(false, nga.field_i) ? 1 : 0;
            var3 = nga.field_j;
            var3 = var3 + " " + jm.a((byte) 75, lga.a(true, new String[1], ja.a((byte) -48, false, false, var2_int != 0)), '#', "<br><br>");
            int discarded$2 = aha.field_D.a(var3, 80, 200, 480, 300, 3518976, -1, 1, 0, 30);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.LA(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (wl.field_yb == null) {
                L2: {
                  if (ve.field_m == null) {
                    break L2;
                  } else {
                    wl.field_yb = ve.field_m;
                    if (BachelorFridge.field_y == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                wl.field_yb = new kv[4][];
                wl.field_yb[0] = pi.a(wha.field_a, -8845, "basic", "powerup_hp");
                wl.field_yb[1] = pi.a(wha.field_a, -8845, "basic", "powerup_speed");
                wl.field_yb[2] = pi.a(wha.field_a, param0 + -9140, "basic", "powerup_attack");
                wl.field_yb[3] = pi.a(wha.field_a, param0 + -9140, "basic", "powerup_special");
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              var2_int = 590;
              aha.field_D.c(ana.field_s[0], 25, 30, uga.field_v, -1);
              var3 = 0;
              var3++;
              var3 = var3 + g.field_g.a(ana.field_s[1], 25, g.field_g.field_u * var3 + 30, var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var3 += 2;
              aha.field_D.c(ana.field_s[2], 25, 40 + var3 * g.field_g.field_u, uga.field_v, -1);
              var3++;
              var3 = var3 + g.field_g.a(ana.field_s[3], 25, 40 + var3 * g.field_g.field_u, var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var3++;
              var4 = vr.field_b % (wl.field_yb[0].length * 4);
              wl.field_yb[2][var4 / 4].e(25, 40 + g.field_g.field_u * var3);
              g.field_g.c(ana.field_s[4], wl.field_yb[0][0].field_q + 35, wl.field_yb[0][0].field_p / 2 + g.field_g.field_u * var3 + (40 + g.field_g.field_u / 4), 3518976, -1);
              var3 += 3;
              wl.field_yb[3][var4 / 4].e(25, g.field_g.field_u * var3 + 40);
              g.field_g.c(ana.field_s[5], 10 + (25 - -wl.field_yb[0][0].field_q), wl.field_yb[0][0].field_p / 2 + (g.field_g.field_u * var3 + 40) + g.field_g.field_u / 4, 3518976, -1);
              if (param0 == 295) {
                break L3;
              } else {
                ((jla) this).field_b = -24;
                break L3;
              }
            }
            var3 += 3;
            wl.field_yb[0][var4 / 4].e(25, 40 - -(var3 * g.field_g.field_u));
            g.field_g.c(ana.field_s[6], wl.field_yb[0][0].field_q + 25 - -10, wl.field_yb[0][0].field_p / 2 + g.field_g.field_u * var3 + 40 + g.field_g.field_u / 4, 3518976, -1);
            var3 += 3;
            wl.field_yb[1][var4 / 4].e(25, 40 + var3 * g.field_g.field_u);
            int discarded$1 = g.field_g.a(ana.field_s[7], 25 - (-wl.field_yb[0][0].field_q + -10), -(g.field_g.field_u * 5 / 4) + wl.field_yb[0][0].field_p / 2 + (var3 * g.field_g.field_u + 40), -10 + (var2_int - wl.field_yb[0][0].field_q), 430, 3518976, -1, 0, 0, g.field_g.field_u);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.PA(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == 25428) {
                break L1;
              } else {
                boolean discarded$1 = ((jla) this).c(-43, -128);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((jla) this).field_b == 15) {
                  break L3;
                } else {
                  if (((jla) this).field_b == 1) {
                    break L3;
                  } else {
                    if (((jla) this).field_b == 2) {
                      break L3;
                    } else {
                      if (((jla) this).field_b != 4) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L4: {
                var2_int = 255;
                if (~iba.field_s == ~kaa.field_m) {
                  break L4;
                } else {
                  var2_int = tma.field_v * 255 / 32;
                  if (~((jla) this).field_b == ~kaa.field_m) {
                    break L4;
                  } else {
                    var2_int = -var2_int + 255;
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  var3 = 2;
                  if (15 == ((jla) this).field_b) {
                    break L6;
                  } else {
                    if (((jla) this).field_b != 1) {
                      break L5;
                    } else {
                      var3 = (-wt.field_q.field_p + 480) / 2;
                      if (var4 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var3 = 180;
                break L5;
              }
              L7: {
                L8: {
                  if (var2_int == 255) {
                    break L8;
                  } else {
                    wt.field_q.a((640 - wt.field_q.field_q) / 2, var3, var2_int);
                    if (var4 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                wt.field_q.e((640 + -wt.field_q.field_q) / 2, var3);
                break L7;
              }
              L9: {
                if (((jla) this).field_b == 2) {
                  break L9;
                } else {
                  if (((jla) this).field_b == 4) {
                    break L9;
                  } else {
                    break L2;
                  }
                }
              }
              L10: {
                if (var2_int != 255) {
                  break L10;
                } else {
                  lp.field_q.e((-lp.field_q.field_q + 640) / 2, 480 - lp.field_q.field_p + -2);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L10;
                  }
                }
              }
              lp.field_q.a((-lp.field_q.field_q + 640) / 2, -2 + (-lp.field_q.field_p + 480), var2_int);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.W(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (iba.field_s == 12) {
            break L0;
          } else {
            L1: {
              if (((jla) this).field_e.field_b) {
                qm.a(17, 7758);
                break L1;
              } else {
                break L1;
              }
            }
            if (!((jla) this).field_e.e(0)) {
              break L0;
            } else {
              qm.a(18, param0 ^ -7788);
              break L0;
            }
          }
        }
        if (((jla) this).d(param1, 26891)) {
          if (hb.field_j) {
            return;
          } else {
            L2: {
              if (param0 == -38) {
                break L2;
              } else {
                field_c = null;
                break L2;
              }
            }
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            L11: {
                              L12: {
                                L13: {
                                  L14: {
                                    L15: {
                                      L16: {
                                        L17: {
                                          L18: {
                                            L19: {
                                              L20: {
                                                L21: {
                                                  L22: {
                                                    L23: {
                                                      L24: {
                                                        L25: {
                                                          L26: {
                                                            L27: {
                                                              L28: {
                                                                L29: {
                                                                  var4_int = pj.field_b[((jla) this).field_b][param1];
                                                                  var6 = var4_int;
                                                                  if (0 != var6) {
                                                                    break L29;
                                                                  } else {
                                                                    if (var9 == 0) {
                                                                      if (((jla) this).field_e.e(0)) {
                                                                        L30: {
                                                                          if (mg.field_m == null) {
                                                                            break L30;
                                                                          } else {
                                                                            if (mg.field_m.a((byte) 118)) {
                                                                              break L30;
                                                                            } else {
                                                                              L31: {
                                                                                if (bp.e(param0 ^ 29947)) {
                                                                                  break L31;
                                                                                } else {
                                                                                  h.c((byte) -69);
                                                                                  break L31;
                                                                                }
                                                                              }
                                                                              mg.field_m.b(27185);
                                                                              break L30;
                                                                            }
                                                                          }
                                                                        }
                                                                        kj.b((byte) -88);
                                                                        if (var9 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L28;
                                                                        }
                                                                      } else {
                                                                        break L3;
                                                                      }
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  }
                                                                }
                                                                L32: {
                                                                  if (var6 != 33) {
                                                                    break L32;
                                                                  } else {
                                                                    if (var9 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L32;
                                                                    }
                                                                  }
                                                                }
                                                                if (var6 == 1) {
                                                                  break L27;
                                                                } else {
                                                                  L33: {
                                                                    if (var6 != 2) {
                                                                      break L33;
                                                                    } else {
                                                                      if (var9 == 0) {
                                                                        break L26;
                                                                      } else {
                                                                        break L33;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var6 == 7) {
                                                                    break L25;
                                                                  } else {
                                                                    L34: {
                                                                      if (var6 != 24) {
                                                                        break L34;
                                                                      } else {
                                                                        if (var9 == 0) {
                                                                          break L24;
                                                                        } else {
                                                                          break L34;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (var6 == 22) {
                                                                      break L23;
                                                                    } else {
                                                                      L35: {
                                                                        if (var6 != 5) {
                                                                          break L35;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L22;
                                                                          } else {
                                                                            break L35;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var6 == 8) {
                                                                        break L21;
                                                                      } else {
                                                                        L36: {
                                                                          if (var6 != 4) {
                                                                            break L36;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L20;
                                                                            } else {
                                                                              break L36;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (var6 == 20) {
                                                                          break L19;
                                                                        } else {
                                                                          if (var6 == 21) {
                                                                            break L18;
                                                                          } else {
                                                                            if (6 == var6) {
                                                                              break L17;
                                                                            } else {
                                                                              L37: {
                                                                                if (var6 != 9) {
                                                                                  break L37;
                                                                                } else {
                                                                                  if (var9 == 0) {
                                                                                    break L16;
                                                                                  } else {
                                                                                    break L37;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L38: {
                                                                                if (var6 != 10) {
                                                                                  break L38;
                                                                                } else {
                                                                                  if (var9 == 0) {
                                                                                    break L15;
                                                                                  } else {
                                                                                    break L38;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (var6 == 11) {
                                                                                break L14;
                                                                              } else {
                                                                                L39: {
                                                                                  if (12 != var6) {
                                                                                    break L39;
                                                                                  } else {
                                                                                    if (var9 == 0) {
                                                                                      break L13;
                                                                                    } else {
                                                                                      break L39;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var6 == 13) {
                                                                                  break L12;
                                                                                } else {
                                                                                  if (34 == var6) {
                                                                                    break L11;
                                                                                  } else {
                                                                                    L40: {
                                                                                      if (17 != var6) {
                                                                                        break L40;
                                                                                      } else {
                                                                                        if (var9 == 0) {
                                                                                          break L10;
                                                                                        } else {
                                                                                          break L40;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L41: {
                                                                                      if (var6 != 18) {
                                                                                        break L41;
                                                                                      } else {
                                                                                        if (var9 == 0) {
                                                                                          break L9;
                                                                                        } else {
                                                                                          break L41;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if (var6 == 23) {
                                                                                      break L8;
                                                                                    } else {
                                                                                      L42: {
                                                                                        if (25 != var6) {
                                                                                          break L42;
                                                                                        } else {
                                                                                          if (var9 == 0) {
                                                                                            break L7;
                                                                                          } else {
                                                                                            break L42;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L43: {
                                                                                        if (var6 != 26) {
                                                                                          break L43;
                                                                                        } else {
                                                                                          if (var9 == 0) {
                                                                                            break L6;
                                                                                          } else {
                                                                                            break L43;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (var6 == 19) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (27 == var6) {
                                                                                          break L4;
                                                                                        } else {
                                                                                          if (28 == var6) {
                                                                                            if (((jla) this).field_e.e(0)) {
                                                                                              break L3;
                                                                                            } else {
                                                                                              break L3;
                                                                                            }
                                                                                          } else {
                                                                                            L44: {
                                                                                              if (var6 != 29) {
                                                                                                break L44;
                                                                                              } else {
                                                                                                if (var9 == 0) {
                                                                                                  if (!((jla) this).field_e.e(0)) {
                                                                                                    break L3;
                                                                                                  } else {
                                                                                                    break L3;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L44;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            L45: {
                                                                                              if (var6 != 30) {
                                                                                                break L45;
                                                                                              } else {
                                                                                                if (var9 == 0) {
                                                                                                  if (((jla) this).field_e.e(0)) {
                                                                                                    break L3;
                                                                                                  } else {
                                                                                                    break L3;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L45;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            if (var6 == 31) {
                                                                                              if (((jla) this).field_e.e(0)) {
                                                                                                break L3;
                                                                                              } else {
                                                                                                break L3;
                                                                                              }
                                                                                            } else {
                                                                                              if (32 == var6) {
                                                                                                if (((jla) this).field_e.e(0)) {
                                                                                                  if (((jla) this).field_e.e(0)) {
                                                                                                    lg.a(true, 14, param2);
                                                                                                    break L3;
                                                                                                  } else {
                                                                                                    break L3;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L3;
                                                                                                }
                                                                                              } else {
                                                                                                break L3;
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
                                                              if (!((jla) this).field_e.e(0)) {
                                                                break L3;
                                                              } else {
                                                                lg.a(true, 15, param2);
                                                                if (var9 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                            if (((jla) this).field_e.e(0)) {
                                                              if (null == mg.field_m) {
                                                                break L3;
                                                              } else {
                                                                if (!mg.field_m.a((byte) 122)) {
                                                                  break L3;
                                                                } else {
                                                                  if (mg.field_m.field_e.field_m.g(0) == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    L46: {
                                                                      if (!bp.e(-29919)) {
                                                                        break L46;
                                                                      } else {
                                                                        L47: {
                                                                          if (!bp.e(param0 + -29881)) {
                                                                            stackOut_133_0 = 1;
                                                                            stackIn_134_0 = stackOut_133_0;
                                                                            break L47;
                                                                          } else {
                                                                            stackOut_132_0 = 0;
                                                                            stackIn_134_0 = stackOut_132_0;
                                                                            break L47;
                                                                          }
                                                                        }
                                                                        var6 = stackIn_134_0;
                                                                        gu.a(8, param2, 6106, (po) (Object) aha.field_D, aha.field_D.field_B + aha.field_D.field_v, he.field_n, aha.field_D.field_v, true, (kv[]) null, 8, 240, 320, (kv[]) null, var6, 2);
                                                                        if (var9 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L46;
                                                                        }
                                                                      }
                                                                    }
                                                                    lg.a(true, -4, param2);
                                                                    if (var9 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L26;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                          if (!((jla) this).field_e.e(0)) {
                                                            break L3;
                                                          } else {
                                                            L48: {
                                                              if (dj.field_c != null) {
                                                                break L48;
                                                              } else {
                                                                if (sna.field_fb != null) {
                                                                  break L48;
                                                                } else {
                                                                  lg.a(true, -3, param2);
                                                                  if (var9 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L48;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            lg.a(true, -1, param2);
                                                            if (var9 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                        if (!((jla) this).field_e.e(0)) {
                                                          break L3;
                                                        } else {
                                                          lg.a(true, 0, param2);
                                                          if (var9 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      if (!((jla) this).field_e.e(0)) {
                                                        break L3;
                                                      } else {
                                                        lg.a(true, 11, param2);
                                                        ai.field_c = true;
                                                        if (var9 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    if (((jla) this).field_e.e(0)) {
                                                      lg.a(true, 7, param2);
                                                      if (var9 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L22;
                                                      }
                                                    } else {
                                                      break L3;
                                                    }
                                                  }
                                                  if (!((jla) this).field_e.e(param0 ^ -38)) {
                                                    break L3;
                                                  } else {
                                                    ie.field_a = 0;
                                                    lg.a(true, 6, param2);
                                                    if (var9 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                                if (!((jla) this).field_e.e(0)) {
                                                  break L3;
                                                } else {
                                                  lg.a(true, ut.field_o, param2);
                                                  if (var9 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              if (!((jla) this).field_e.e(param0 ^ -38)) {
                                                break L3;
                                              } else {
                                                lg.a(true, 5, param2);
                                                if (var9 == 0) {
                                                  break L3;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            L49: {
                                              var5 = 0;
                                              if (!((jla) this).field_e.d(param0 + -9869)) {
                                                break L49;
                                              } else {
                                                if (b.field_u <= 0) {
                                                  break L49;
                                                } else {
                                                  var5 = 1;
                                                  di.a(true, 0);
                                                  break L49;
                                                }
                                              }
                                            }
                                            L50: {
                                              if (!((jla) this).field_e.a(param0 ^ 37)) {
                                                break L50;
                                              } else {
                                                if (b.field_u < 256) {
                                                  di.a(true, 256);
                                                  var5 = 1;
                                                  break L50;
                                                } else {
                                                  break L50;
                                                }
                                              }
                                            }
                                            L51: {
                                              if (!((jla) this).field_e.b(0)) {
                                                break L51;
                                              } else {
                                                L52: {
                                                  L53: {
                                                    var6 = ((jla) this).a(param1, true) - -((jla) this).b(param1, 40) - (-mv.field_n - -89) >> -819516319;
                                                    var7 = mk.field_p - var6;
                                                    var8 = 256 * var7 / 89;
                                                    if (0 < var8) {
                                                      break L53;
                                                    } else {
                                                      di.a(true, 0);
                                                      if (var9 == 0) {
                                                        break L52;
                                                      } else {
                                                        break L53;
                                                      }
                                                    }
                                                  }
                                                  L54: {
                                                    if (256 <= var8) {
                                                      break L54;
                                                    } else {
                                                      di.a(true, var8);
                                                      if (var9 == 0) {
                                                        break L52;
                                                      } else {
                                                        break L54;
                                                      }
                                                    }
                                                  }
                                                  di.a(true, 256);
                                                  break L52;
                                                }
                                                var5 = 1;
                                                break L51;
                                              }
                                            }
                                            L55: {
                                              if (!((jla) this).field_e.c(-27)) {
                                                break L55;
                                              } else {
                                                if (b.field_u <= 0) {
                                                  break L55;
                                                } else {
                                                  var5 = 1;
                                                  gb.a(-9372);
                                                  break L55;
                                                }
                                              }
                                            }
                                            L56: {
                                              if (!((jla) this).field_e.b((byte) -73)) {
                                                break L56;
                                              } else {
                                                if (256 > b.field_u) {
                                                  var5 = 1;
                                                  ii.c((byte) 62);
                                                  break L56;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                            if (var5 == 0) {
                                              break L3;
                                            } else {
                                              L57: {
                                                if (!((jla) this).field_e.b(param0 ^ -38)) {
                                                  break L57;
                                                } else {
                                                  if (~fia.field_q <= ~vr.field_b) {
                                                    break L3;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                              }
                                              cq discarded$1 = ol.a(kea.field_r[0], true);
                                              fia.field_q = 20 + vr.field_b;
                                              if (var9 == 0) {
                                                break L3;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L58: {
                                            if (((jla) this).field_e.d(-9907)) {
                                              gka.a(-119, 0);
                                              break L58;
                                            } else {
                                              break L58;
                                            }
                                          }
                                          L59: {
                                            if (!((jla) this).field_e.a(param0 + 37)) {
                                              break L59;
                                            } else {
                                              gka.a(-52, 230);
                                              break L59;
                                            }
                                          }
                                          L60: {
                                            if (!((jla) this).field_e.b(param0 ^ -38)) {
                                              break L60;
                                            } else {
                                              L61: {
                                                var6 = -89 + (((jla) this).a(param1, true) + ((jla) this).b(param1, 40)) + mv.field_n >> -670901119;
                                                var7 = -var6 + mk.field_p;
                                                var8 = var7 * 230 / 89;
                                                if (var8 <= 0) {
                                                  break L61;
                                                } else {
                                                  L62: {
                                                    if (230 <= var8) {
                                                      break L62;
                                                    } else {
                                                      gka.a(81, var8);
                                                      if (var9 == 0) {
                                                        break L60;
                                                      } else {
                                                        break L62;
                                                      }
                                                    }
                                                  }
                                                  gka.a(param0 ^ -87, 230);
                                                  if (var9 == 0) {
                                                    break L60;
                                                  } else {
                                                    break L61;
                                                  }
                                                }
                                              }
                                              gka.a(-97, 0);
                                              break L60;
                                            }
                                          }
                                          L63: {
                                            if (((jla) this).field_e.c(param0 ^ 88)) {
                                              sr.a((byte) -107);
                                              break L63;
                                            } else {
                                              break L63;
                                            }
                                          }
                                          if (!((jla) this).field_e.b((byte) -73)) {
                                            break L3;
                                          } else {
                                            bv.b(16964);
                                            if (var9 == 0) {
                                              break L3;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        if (((jla) this).field_e.e(0)) {
                                          L64: {
                                            if (null != kga.field_c) {
                                              break L64;
                                            } else {
                                              oq.a(param2, false);
                                              if (var9 == 0) {
                                                break L3;
                                              } else {
                                                break L64;
                                              }
                                            }
                                          }
                                          lga.c((byte) 119);
                                          if (var9 == 0) {
                                            break L3;
                                          } else {
                                            break L16;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                      if (!((jla) this).field_e.e(0)) {
                                        break L3;
                                      } else {
                                        L65: {
                                          if (null != dj.field_c) {
                                            ((dfa) (Object) dj.field_c).a(8, param2);
                                            break L65;
                                          } else {
                                            break L65;
                                          }
                                        }
                                        L66: {
                                          if (gs.field_f == null) {
                                            break L66;
                                          } else {
                                            gs.field_f.b(param2, false);
                                            break L66;
                                          }
                                        }
                                        vs.field_d = false;
                                        sia.field_h = false;
                                        nu.field_b = true;
                                        if (!mg.field_m.a((byte) 102)) {
                                          L67: {
                                            if (!bp.e(param0 + -29881)) {
                                              h.c((byte) -69);
                                              break L67;
                                            } else {
                                              break L67;
                                            }
                                          }
                                          mg.field_m.b(param0 ^ -27157);
                                          if (var9 == 0) {
                                            break L3;
                                          } else {
                                            break L15;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    if (((jla) this).field_e.e(param0 + 38)) {
                                      dj.field_c.field_e.b(param0 + 97);
                                      lg.a(true, -1, param2);
                                      if (var9 == 0) {
                                        break L3;
                                      } else {
                                        break L14;
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                  if (((jla) this).field_e.e(0)) {
                                    dj.field_c.field_e.d(-111);
                                    lg.a(true, -1, param2);
                                    if (var9 == 0) {
                                      break L3;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                                if (!((jla) this).field_e.e(0)) {
                                  break L3;
                                } else {
                                  if (null != sna.field_fb) {
                                    break L3;
                                  } else {
                                    dj.field_c.field_e.b((byte) 27);
                                    lg.a(true, -1, param2);
                                    if (var9 == 0) {
                                      break L3;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              if (!((jla) this).field_e.e(0)) {
                                break L3;
                              } else {
                                if (((jla) this).d(param1, param0 ^ -26927)) {
                                  this.c(param2, param0 + -17769);
                                  if (var9 == 0) {
                                    break L3;
                                  } else {
                                    break L11;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L68: {
                              L69: {
                                if (null == sna.field_fb) {
                                  break L69;
                                } else {
                                  if (sna.field_fb.field_e.field_a) {
                                    break L68;
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                              L70: {
                                if (dj.field_c == null) {
                                  break L70;
                                } else {
                                  if (dj.field_c.field_e.field_a) {
                                    break L68;
                                  } else {
                                    break L70;
                                  }
                                }
                              }
                              if (!((jla) this).field_e.e(0)) {
                                break L3;
                              } else {
                                if (!((jla) this).d(param1, 26891)) {
                                  break L3;
                                } else {
                                  hp.field_c = -3;
                                  ((dfa) (Object) dj.field_c).a(8, param2);
                                  vs.field_d = false;
                                  uca.a(39, (byte) -97);
                                  if (var9 == 0) {
                                    break L3;
                                  } else {
                                    break L68;
                                  }
                                }
                              }
                            }
                            if (!((jla) this).field_e.e(0)) {
                              break L3;
                            } else {
                              if (((jla) this).d(param1, param0 ^ -26927)) {
                                this.c(param2, -17807);
                                if (var9 == 0) {
                                  break L3;
                                } else {
                                  break L10;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          if (((jla) this).field_e.e(param0 ^ -38)) {
                            ks.field_i = 0;
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L9;
                            }
                          } else {
                            break L3;
                          }
                        }
                        if (!((jla) this).field_e.e(0)) {
                          break L3;
                        } else {
                          ks.field_i = 1;
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (((jla) this).field_e.e(0)) {
                        L71: {
                          if (9 != ((jla) this).field_b) {
                            break L71;
                          } else {
                            au.a(8, (String) null, false);
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L71;
                            }
                          }
                        }
                        L72: {
                          if (7 == ((jla) this).field_b) {
                            break L72;
                          } else {
                            if (iba.field_s != 5) {
                              break L3;
                            } else {
                              break L72;
                            }
                          }
                        }
                        au.a(((jla) this).field_b, gba.field_Ib, false);
                        if (var9 == 0) {
                          break L3;
                        } else {
                          break L7;
                        }
                      } else {
                        break L3;
                      }
                    }
                    if (!((jla) this).field_e.e(0)) {
                      break L3;
                    } else {
                      if (((jla) this).d(param1, 26891)) {
                        ie.field_a = ie.field_a - 1;
                        if (var9 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (!((jla) this).field_e.e(param0 ^ -38)) {
                    break L3;
                  } else {
                    if (((jla) this).d(param1, param0 + 26929)) {
                      ie.field_a = ie.field_a + 1;
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (((jla) this).field_e.e(param0 + 38)) {
                  dh.a(nia.d(-31768), 124);
                  if (var9 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                } else {
                  break L3;
                }
              }
              if (((jla) this).field_e.e(param0 + 38)) {
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void c(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (vs.field_d) {
                lg.a(true, -5, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -17807) {
                break L2;
              } else {
                field_d = null;
                break L2;
              }
            }
            L3: {
              if (!gja.field_n) {
                break L3;
              } else {
                sfa.a(11, 0, false);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "jla.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((jla) this).field_b = 117;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~((jla) this).field_e.field_e >= ~var2_int) {
                    break L4;
                  } else {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (((jla) this).c(var2_int, 19950)) {
                          L6: {
                            stackOut_12_0 = this;
                            stackIn_15_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (~((jla) this).field_e.field_g != ~var2_int) {
                              stackOut_15_0 = this;
                              stackOut_15_1 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              stackIn_16_1 = stackOut_15_1;
                              break L6;
                            } else {
                              stackOut_13_0 = this;
                              stackOut_13_1 = 1;
                              stackIn_16_0 = stackOut_13_0;
                              stackIn_16_1 = stackOut_13_1;
                              break L6;
                            }
                          }
                          ((jla) this).b(stackIn_16_1 != 0, var2_int, 0);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.BA(" + param0 + ')');
        }
    }

    final String d(boolean param0, int param1) {
        RuntimeException var3 = null;
        String var3_ref = null;
        int var4 = 0;
        String stackIn_51_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_50_0 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_ref = lr.field_k[param1];
              if (!param0) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              if (param1 != 8) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (ut.field_o == 0) {
                      break L4;
                    } else {
                      if (kaa.field_m == 0) {
                        break L4;
                      } else {
                        if (11 == ut.field_o) {
                          break L4;
                        } else {
                          if (kaa.field_m != 11) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var3_ref = lr.field_k[7];
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (1 == ut.field_o) {
                    break L5;
                  } else {
                    if (kaa.field_m == 1) {
                      break L5;
                    } else {
                      L6: {
                        if (2 == ut.field_o) {
                          break L6;
                        } else {
                          if (kaa.field_m == 2) {
                            break L6;
                          } else {
                            if (ut.field_o == 3) {
                              break L6;
                            } else {
                              if (kaa.field_m == 3) {
                                break L6;
                              } else {
                                if (4 == ut.field_o) {
                                  break L6;
                                } else {
                                  if (kaa.field_m == 4) {
                                    break L6;
                                  } else {
                                    if (~kaa.field_m == ~ut.field_o) {
                                      var3_ref = lr.field_k[7];
                                      if (var4 == 0) {
                                        break L2;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var3_ref = mp.field_t;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var3_ref = baa.field_E;
                break L2;
              }
            }
            stackOut_50_0 = (String) var3_ref;
            stackIn_51_0 = stackOut_50_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "jla.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_51_0;
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != eea.field_a) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (null == wq.field_k) {
                      break L3;
                    } else {
                      eea.field_a = wq.field_k;
                      if (BachelorFridge.field_y == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  kv dupTemp$1 = wfa.a("creatureviewer_bg", wha.field_a, "basic", (byte) 58);
                  wq.field_k = dupTemp$1;
                  eea.field_a = dupTemp$1;
                  break L2;
                }
                jm.field_i = new lna(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                jm.field_i.a(false, 1, 1, true, 0);
                i.field_d = new lna(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                i.field_d.a(false, 1, 1, true, 0);
                break L1;
              }
            }
            var2_int = 590;
            aha.field_D.c(ana.field_k[0], 25, 30, uga.field_v, -1);
            var3 = 0;
            var3++;
            var3 = var3 + g.field_g.a(ana.field_k[1], 25, 30 - -(var3 * g.field_g.field_u), var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
            var4 = 35 + g.field_g.field_u * var3 + eea.field_a.field_p / 4;
            bh.field_r.e(25, var4 - bh.field_r.field_p / 2);
            jm.field_i.c(11);
            i.field_d.c(11);
            jm.field_i.a(false, false, 2048, 2048, 0, -121, 256, bh.field_r.field_q + 45, -(3 * bd.field_i.field_p / 8) + var4);
            eea.field_a.c(615 + -(eea.field_a.field_q / 2), -(eea.field_a.field_p / 4) + var4, eea.field_a.field_q / 2, eea.field_a.field_p / 2);
            i.field_d.a(false, false, 2048, 2048, 0, -46, 256, 615 + -(eea.field_a.field_q * 15 / 32), var4 - bd.field_i.field_p * 29 / 64);
            dg.c(45 + bh.field_r.field_q, var4 - 5, 20, 4, 3518976);
            dg.c(53 - -bh.field_r.field_q, var4 - 13, 4, 20, 3518976);
            dg.c(163 + bh.field_r.field_q, -8 + var4, 20, 4, 3518976);
            dg.c(bh.field_r.field_q + 163, var4 + -2, 20, 4, 3518976);
            var5 = -116 % ((-51 - param0) / 57);
            var3 += 16;
            aha.field_D.c(ana.field_k[2], 25, 40 + g.field_g.field_u * var3, uga.field_v, -1);
            var3++;
            var3 = var3 + g.field_g.a(ana.field_k[3], 25, 40 + g.field_g.field_u * var3, var2_int, 430, 3518976, -1, 0, 0, g.field_g.field_u);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.HA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == 89) {
                break L1;
              } else {
                this.n(57);
                break L1;
              }
            }
            L2: {
              if (!((jla) this).d(0, 26891)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_8_0;
              if (((jla) this).d(2, 26891)) {
                stackOut_11_0 = 2;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_9_0 = 1;
                stackIn_12_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var3 = stackIn_12_0;
              if (!((jla) this).field_e.b(0)) {
                L5: {
                  if (gf.field_k != 96) {
                    break L5;
                  } else {
                    L6: {
                      if (~((jla) this).field_e.field_g < ~var2_int) {
                        break L6;
                      } else {
                        ((jla) this).field_e.b(114, var3);
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ((jla) this).field_e.b(param0 ^ 56, -1 + ((jla) this).field_e.field_g);
                    break L5;
                  }
                }
                if (97 == gf.field_k) {
                  L7: {
                    L8: {
                      if (((jla) this).field_e.field_g < 0) {
                        break L8;
                      } else {
                        if (((jla) this).field_e.field_g < var3) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((jla) this).field_e.b(param0 ^ 2, var2_int);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L7;
                    }
                  }
                  ((jla) this).field_e.b(118, ((jla) this).field_e.field_g - -1);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            ((jla) this).field_e.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.OA(" + param0 + ')');
        }
    }

    int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            if (((jla) this).field_b != 6) {
              L1: {
                if (param1 < -38) {
                  break L1;
                } else {
                  ((jla) this).field_b = -66;
                  break L1;
                }
              }
              L2: {
                if (2 == ((jla) this).field_b) {
                  break L2;
                } else {
                  if (((jla) this).field_b == 4) {
                    break L2;
                  } else {
                    stackOut_30_0 = pj.field_h[((jla) this).field_b] - -(pj.field_o[((jla) this).field_b] * param0);
                    stackIn_31_0 = stackOut_30_0;
                    break L0;
                  }
                }
              }
              L3: {
                var3_int = pj.field_h[((jla) this).field_b] - -(param0 * pj.field_o[((jla) this).field_b]);
                if (ng.a((byte) -24)) {
                  stackOut_23_0 = 4;
                  stackIn_24_0 = stackOut_23_0;
                  break L3;
                } else {
                  stackOut_21_0 = 5;
                  stackIn_24_0 = stackOut_21_0;
                  break L3;
                }
              }
              L4: {
                var4 = stackIn_24_0;
                if (param0 >= var4) {
                  var3_int = pj.field_o[((jla) this).field_b] * (-var4 + param0) + 294;
                  break L4;
                } else {
                  break L4;
                }
              }
              stackOut_28_0 = var3_int;
              stackIn_29_0 = stackOut_28_0;
              return stackIn_29_0;
            } else {
              L5: {
                if (0 == param0) {
                  break L5;
                } else {
                  if (2 != param0) {
                    stackOut_9_0 = bb.field_F;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_7_0 = pj.field_h[((jla) this).field_b];
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "jla.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_31_0;
    }

    boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        try {
          L0: {
            L1: {
              if (((jla) this).field_b == 6) {
                L2: {
                  if (0 != param0) {
                    break L2;
                  } else {
                    if (ie.field_a != 0) {
                      break L2;
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
                if (param0 != 2) {
                  break L1;
                } else {
                  if (ie.field_a != 5) {
                    break L1;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 == 19950) {
                break L3;
              } else {
                field_d = null;
                break L3;
              }
            }
            L4: {
              if (((jla) this).field_b == 3) {
                if (param0 != 0) {
                  break L4;
                } else {
                  if (sna.field_fb == null) {
                    break L4;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0 != 0;
                  }
                }
              } else {
                break L4;
              }
            }
            stackOut_27_0 = 1;
            stackIn_28_0 = stackOut_27_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "jla.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_28_0 != 0;
    }

    private final void m(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 640) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (480 <= var3) {
                              break L6;
                            } else {
                              mr.field_f.e(var2_int, var3);
                              var3 = var3 + mr.field_f.field_p;
                              if (var4 != 0) {
                                break L5;
                              } else {
                                if (var4 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var2_int = var2_int + mr.field_f.field_q;
                          break L5;
                        }
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                dg.a(10, 10, 620, 460, 10, 0, 192);
                stackOut_12_0 = -124 % ((param0 - 65) / 33);
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              var2_int = stackIn_13_0;
              g.field_g.b(jm.a((byte) -117, ie.field_a), 600, 460, uga.field_v, -1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "jla.MA(" + param0 + ')');
        }
    }

    int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            if (((jla) this).field_b != 6) {
              L1: {
                if (param1 == 40) {
                  break L1;
                } else {
                  ((jla) this).field_e = null;
                  break L1;
                }
              }
              stackOut_22_0 = pj.field_l[((jla) this).field_b];
              stackIn_23_0 = stackOut_22_0;
              break L0;
            } else {
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  if (param0 == 2) {
                    break L2;
                  } else {
                    L3: {
                      if (ut.field_o == 0) {
                        break L3;
                      } else {
                        if (kaa.field_m == 0) {
                          break L3;
                        } else {
                          stackOut_13_0 = ((jla) this).a(param0, true) + 150;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0;
                        }
                      }
                    }
                    stackOut_15_0 = 60 + ((jla) this).a(param0, true);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                }
              }
              stackOut_17_0 = ((jla) this).a(param0, true) + sia.field_j.field_p / 2;
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "jla.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    public static void b(boolean param0) {
        field_d = null;
        field_f = null;
        if (!param0) {
            return;
        }
        try {
            field_a = null;
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jla.GA(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            this.m(116);
                            ((jla) this).c(true);
                            var2_int = ie.field_a;
                            if (0 != var2_int) {
                              break L8;
                            } else {
                              if (var3 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (var2_int == 1) {
                            break L6;
                          } else {
                            L9: {
                              if (var2_int != 2) {
                                break L9;
                              } else {
                                if (var3 == 0) {
                                  break L5;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var2_int != 3) {
                                break L10;
                              } else {
                                if (var3 == 0) {
                                  break L4;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (4 == var2_int) {
                              break L3;
                            } else {
                              if (var2_int != 5) {
                                break L1;
                              } else {
                                if (var3 == 0) {
                                  break L2;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        this.d(2);
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                      this.f(295);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                    this.a((byte) -124);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  this.b((byte) -56);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.b(-46);
                if (var3 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.c((byte) 110);
              break L1;
            }
            L11: {
              if (param0 == 4) {
                break L11;
              } else {
                ((jla) this).j(-58);
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "jla.NA(" + param0 + ')');
        }
    }

    void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 == 8456) {
              if (((jla) this).field_b != 11) {
                L1: {
                  if (12 != ((jla) this).field_b) {
                    break L1;
                  } else {
                    jla.b(true, param0 ^ 19662);
                    break L1;
                  }
                }
                L2: {
                  if (bka.field_h) {
                    break L2;
                  } else {
                    if (pha.field_a) {
                      break L2;
                    } else {
                      if (~((jla) this).field_b == ~kaa.field_m) {
                        L3: while (true) {
                          L4: {
                            L5: {
                              if (!kaa.b(127)) {
                                break L5;
                              } else {
                                L6: {
                                  if (13 != gf.field_k) {
                                    break L6;
                                  } else {
                                    if (((jla) this).field_b != 3) {
                                      L7: {
                                        L8: {
                                          L9: {
                                            if (((jla) this).field_b == 1) {
                                              break L9;
                                            } else {
                                              if (2 == ((jla) this).field_b) {
                                                break L9;
                                              } else {
                                                if (((jla) this).field_b == 4) {
                                                  break L9;
                                                } else {
                                                  if (((jla) this).field_b != 13) {
                                                    break L8;
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (kaa.field_m == 0) {
                                            break L8;
                                          } else {
                                            if (iba.field_s == 0) {
                                              break L8;
                                            } else {
                                              if (iba.field_s == 7) {
                                                break L8;
                                              } else {
                                                if (iba.field_s == 8) {
                                                  break L8;
                                                } else {
                                                  if (10 == iba.field_s) {
                                                    break L8;
                                                  } else {
                                                    if (iba.field_s != 3) {
                                                      break L7;
                                                    } else {
                                                      break L8;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (iba.field_s == 9) {
                                          continue L3;
                                        } else {
                                          if (iba.field_s == 0) {
                                            continue L3;
                                          } else {
                                            hb.a(2, ut.field_o, ut.field_o, false);
                                            if (var3 == 0) {
                                              continue L3;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                      L10: {
                                        if (null != dj.field_c) {
                                          break L10;
                                        } else {
                                          if (sna.field_fb != null) {
                                            break L10;
                                          } else {
                                            L11: {
                                              L12: {
                                                if (((jla) this).field_b != 13) {
                                                  break L12;
                                                } else {
                                                  if (gs.field_f == null) {
                                                    break L11;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              }
                                              lg.a(true, -3, false);
                                              if (var3 == 0) {
                                                continue L3;
                                              } else {
                                                break L11;
                                              }
                                            }
                                            hb.a(2, ut.field_o, ut.field_o, false);
                                            if (var3 == 0) {
                                              continue L3;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                      lg.a(true, -1, false);
                                      if (var3 == 0) {
                                        continue L3;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      continue L3;
                                    }
                                  }
                                }
                                this.d(false);
                                if (((jla) this).field_e.field_g == -1) {
                                  continue L3;
                                } else {
                                  this.a((byte) -38, ((jla) this).field_e.field_g, false);
                                  if (var3 != 0) {
                                    break L4;
                                  } else {
                                    if (var3 == 0) {
                                      continue L3;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            ((jla) this).field_e.a(this.a(false, nfa.field_a, jc.field_r), -128, this.a(false, mk.field_p, gd.field_m));
                            break L4;
                          }
                          if (-1 == ((jla) this).field_e.field_g) {
                            break L2;
                          } else {
                            this.a((byte) -38, ((jla) this).field_e.field_g, true);
                            break L2;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L13: {
                  if (nma.e(-8774)) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L13;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L13;
                  }
                }
                L14: {
                  var2_int = em.a(stackIn_10_0 != 0, param0 ^ 8456);
                  if (var2_int == 3) {
                    L15: {
                      if (null != kga.field_c) {
                        lga.c((byte) 119);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    rj.a(param0 + -38592, nia.d(-31768));
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (1 == var2_int) {
                    lg.a(true, 0, false);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var2_int == 2) {
                    lg.a(true, 0, true);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.C(" + param0 + ')');
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                jla.b(false);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (pj.field_b[((jla) this).field_b].length <= var4_int) {
                    break L4;
                  } else {
                    var5 = ((jla) this).a(var4_int, (byte) -115);
                    stackOut_6_0 = ((jla) this).c(var4_int, 19950);
                    stackIn_28_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (!stackIn_7_0) {
                          break L5;
                        } else {
                          if (~((jla) this).a(var4_int, true) < ~param1) {
                            break L5;
                          } else {
                            if (param1 >= ((jla) this).b(var4_int, 40)) {
                              break L5;
                            } else {
                              if (var5 > param2) {
                                break L5;
                              } else {
                                if (~param2 > ~(((jla) this).a(105, var4_int) + var5)) {
                                  stackOut_24_0 = var4_int;
                                  stackIn_25_0 = stackOut_24_0;
                                  return stackIn_25_0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_27_0 = -1;
                stackIn_28_0 = stackOut_27_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "jla.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_28_0;
    }

    private final void d(boolean param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                if (iba.field_s == 6) {
                  break L2;
                } else {
                  L3: {
                    if (iba.field_s != 5) {
                      break L3;
                    } else {
                      if (bp.e(-29919)) {
                        break L3;
                      } else {
                        this.a(true);
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  ((jla) this).field_e.b(true);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.k(89);
              break L1;
            }
            L4: {
              if (!param0) {
                break L4;
              } else {
                ((jla) this).field_b = 31;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.SA(" + param0 + ')');
        }
    }

    void j(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((jla) this).field_b != 5) {
                break L1;
              } else {
                ri.field_b = null;
                break L1;
              }
            }
            L2: {
              if (param0 == -5) {
                break L2;
              } else {
                field_c = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.M(" + param0 + ')');
        }
    }

    int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var3_int = -128 / ((param0 - -64) / 38);
            stackOut_0_0 = 36;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "jla.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    jla(int param0) {
        try {
            ((jla) this).field_b = param0;
            ((jla) this).field_e = new jd(pj.field_b[((jla) this).field_b].length);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jla.<init>(" + param0 + ')');
        }
    }

    void b(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int stackIn_65_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (((jla) this).field_b != 6) {
                break L1;
              } else {
                L2: {
                  if (param1 == 0) {
                    break L2;
                  } else {
                    if (param1 == 2) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var4_int = ((jla) this).a(param1, true) - -(sia.field_j.field_p / 4);
                  var5_int = ((jla) this).a(param1, (byte) -88) + sia.field_j.field_q / 4;
                  var6 = 16384;
                  if (2 != param1) {
                    break L3;
                  } else {
                    var6 = -16384;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (!param0) {
                      break L5;
                    } else {
                      et.field_p.a(var6, var5_int, var4_int, -1049413117, 2048);
                      if (var16 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  sia.field_j.a(var6, var5_int, var4_int, -1049413117, 2048);
                  break L4;
                }
                return;
              }
            }
            L6: {
              L7: {
                var4_int = pj.field_b[((jla) this).field_b][param1];
                var5 = ((jla) this).d(false, var4_int);
                var6 = dja.field_l.a(var5);
                var7 = ((jla) this).a(param1, true);
                var8 = ((jla) this).b(param1, 40);
                var9 = ((jla) this).a(param1, (byte) -121);
                if (var4_int == 20) {
                  break L7;
                } else {
                  if (var4_int != 21) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var6 = mv.field_n + 103;
              break L6;
            }
            L8: {
              L9: {
                var10 = -var6 + (var7 + var8) >> 301888225;
                var11 = ((jla) this).a(-22, param1);
                int discarded$1 = ((jla) this).a(param2 ^ param2, param1);
                var12 = 0;
                var13 = 0;
                if (((jla) this).field_b == 15) {
                  break L9;
                } else {
                  if (((jla) this).field_b == 1) {
                    break L9;
                  } else {
                    if (((jla) this).field_b == 2) {
                      break L9;
                    } else {
                      if (((jla) this).field_b == 4) {
                        break L9;
                      } else {
                        L10: {
                          if (1 != var4_int) {
                            break L10;
                          } else {
                            if (null == mg.field_m) {
                              break L10;
                            } else {
                              L11: {
                                if (!mg.field_m.a((byte) 103)) {
                                  break L11;
                                } else {
                                  if (mg.field_m.field_e.field_m.g(0) != 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var12 = 5921370;
                              var13 = 5921370;
                              if (var16 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        L12: {
                          if (!param0) {
                            break L12;
                          } else {
                            var13 = 4500243;
                            var12 = 6939164;
                            if (var16 == 0) {
                              break L8;
                            } else {
                              break L12;
                            }
                          }
                        }
                        var12 = 3260416;
                        var13 = 1789952;
                        if (var16 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
              }
              L13: {
                if (!param0) {
                  break L13;
                } else {
                  var13 = 15854080;
                  var12 = 15854080;
                  if (var16 == 0) {
                    break L8;
                  } else {
                    break L13;
                  }
                }
              }
              var12 = 16763392;
              var13 = 16763392;
              break L8;
            }
            L14: {
              L15: {
                var14 = a.a(var12, 32, param2 + 16763049, var13);
                gna.a(true, var14, var5, var10, false, var9 + aha.field_D.field_u);
                if (20 == var4_int) {
                  break L15;
                } else {
                  if (var4_int != 21) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              L16: {
                var10 = var10 + mv.field_n;
                ls.field_c.c(var10, var9);
                dg.a(dfa.field_c);
                if (var4_int != 20) {
                  stackOut_64_0 = 89 * bs.field_k / 230;
                  stackIn_65_0 = stackOut_64_0;
                  break L16;
                } else {
                  stackOut_62_0 = 89 * b.field_u / 256;
                  stackIn_65_0 = stackOut_62_0;
                  break L16;
                }
              }
              var15 = stackIn_65_0;
              var15 += 7;
              dg.a(var10, var9, var15 + var10, var9 - -var11);
              ni.field_j.c(var10, var9);
              dg.b(dfa.field_c);
              qw.field_c.e(-qw.field_c.field_q + 2 * var15 + 2 * var10 >> 320453569, -var11 + (2 * qw.field_c.field_p + var9 * 2) >> 1710533217);
              break L14;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "jla.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (gf.field_k != 96) {
                break L1;
              } else {
                L2: {
                  if (((jla) this).field_e.field_g > 0) {
                    break L2;
                  } else {
                    ((jla) this).field_e.b(105, 1);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((jla) this).field_e.field_g != 2) {
                  ((jla) this).field_e.b(115, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (97 != gf.field_k) {
                break L3;
              } else {
                L4: {
                  if (((jla) this).field_e.field_g == 1) {
                    break L4;
                  } else {
                    if (((jla) this).field_e.field_g == 2) {
                      break L3;
                    } else {
                      ((jla) this).field_e.b(109, 1);
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((jla) this).field_e.b(106, 0);
                break L3;
              }
            }
            L5: {
              if (gf.field_k != 99) {
                break L5;
              } else {
                L6: {
                  if (((jla) this).field_e.field_g < 0) {
                    break L6;
                  } else {
                    if (((jla) this).field_e.field_g > 1) {
                      break L6;
                    } else {
                      ((jla) this).field_e.b(89, 2);
                      if (var3 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                ((jla) this).field_e.b(108, ks.field_i);
                break L5;
              }
            }
            L7: {
              if (98 == gf.field_k) {
                L8: {
                  if (((jla) this).field_e.field_g == 2) {
                    break L8;
                  } else {
                    ((jla) this).field_e.b(91, 2);
                    if (var3 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                ((jla) this).field_e.b(100, ks.field_i);
                break L7;
              } else {
                break L7;
              }
            }
            ((jla) this).field_e.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.JA(" + param0 + ')');
        }
    }

    void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (11 == ((jla) this).field_b) {
                var3_int = -1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((jla) this).field_e.field_g == -1) {
                break L2;
              } else {
                var3_int = ((jla) this).field_e.field_g;
                break L2;
              }
            }
            L3: {
              ((jla) this).field_e.a(param0, 115, this.a(false, mk.field_p, gd.field_m), var3_int);
              fia.field_q = vr.field_b;
              if (param1 == 32) {
                break L3;
              } else {
                this.a((byte) -76);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "jla.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 590;
              aha.field_D.c(ana.field_t[0], 25, 30, uga.field_v, -1);
              var3 = 0;
              var3 += 2;
              g.field_g.c(ana.field_t[1], 25, 30 + g.field_g.field_u * var3, 3518976, -1);
              var3++;
              vw.field_a[0].field_b[80].a(25, 30 - -(var3 * g.field_g.field_u), 64, 32);
              var3 = var3 + g.field_g.a(ana.field_t[2], 99, var3 * g.field_g.field_u + 30, -64 + (var2_int + -10), 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var3++;
              vw.field_a[2].field_b[80].a(25, 30 + var3 * g.field_g.field_u, 64, 32);
              var3 = var3 + g.field_g.a(ana.field_t[3], 99, 30 + g.field_g.field_u * var3, -10 + var2_int + -64, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var3++;
              vw.field_a[1].field_b[80].a(25, var3 * g.field_g.field_u + 30, 64, 32);
              var3 = var3 + g.field_g.a(ana.field_t[4], 99, g.field_g.field_u * var3 + 30, var2_int + -64 + -10, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var3 += 4;
              if (param0 <= -20) {
                break L1;
              } else {
                this.c((byte) 26);
                break L1;
              }
            }
            aha.field_D.c(ana.field_t[5], 25, 30 - -(g.field_g.field_u * var3), uga.field_v, -1);
            var3++;
            vw.field_a[0].field_b[120].a(25, 30 - -(var3 * g.field_g.field_u), 64, 32);
            vw.field_a[2].field_b[120].a(89, g.field_g.field_u * var3 + 30, 64, 32);
            vw.field_a[1].field_b[120].a(153, 30 - -(g.field_g.field_u * var3), 64, 32);
            g.field_g.c(ana.field_t[6], 227, 30 + (g.field_g.field_u * (var3 + 1) - -(3 * g.field_g.field_u / 8)), 3518976, -1);
            var3 += 3;
            vw.field_a[0].field_b[88].a(25, 30 + g.field_g.field_u * var3, 64, 32);
            vw.field_a[2].field_b[88].a(89, g.field_g.field_u * var3 + 30, 64, 32);
            vw.field_a[1].field_b[88].a(153, 30 - -(g.field_g.field_u * var3), 64, 32);
            var3 = var3 + g.field_g.a(ana.field_t[7], 227, 30 + g.field_g.field_u * var3, -10 + (-192 + var2_int), 430, 3518976, -1, 0, 0, g.field_g.field_u);
            var3 += 2;
            vw.field_a[0].field_b[80].a(25, 30 - -(g.field_g.field_u * var3), 64, 32);
            vw.field_a[0].field_b[103].a(25, 30 + g.field_g.field_u * var3, 64, 32);
            vw.field_a[0].field_b[95].a(25, -32 + (30 - -(var3 * g.field_g.field_u)), 64, 32);
            vw.field_a[2].field_b[80].a(89, 30 - -(var3 * g.field_g.field_u), 64, 32);
            vw.field_a[2].field_b[103].a(89, var3 * g.field_g.field_u + 30, 64, 32);
            vw.field_a[2].field_b[95].a(89, var3 * g.field_g.field_u + 30 - 32, 64, 32);
            vw.field_a[1].field_b[80].a(153, g.field_g.field_u * var3 + 30, 64, 32);
            vw.field_a[1].field_b[103].a(153, 30 - -(g.field_g.field_u * var3), 64, 32);
            vw.field_a[1].field_b[95].a(153, 30 + var3 * g.field_g.field_u - 32, 64, 32);
            var3 = var3 + g.field_g.a(ana.field_t[8], 227, 30 + (var3 * g.field_g.field_u + -(g.field_g.field_u / 2)), -192 + var2_int + -10, 430, 3518976, -1, 0, 0, g.field_g.field_u);
            var3++;
            vw.field_a[0].field_b[80].a(25, 30 - -(g.field_g.field_u * var3), 64, 32);
            vw.field_a[0].field_b[109].a(25, 30 + var3 * g.field_g.field_u, 64, 32);
            vw.field_a[2].field_b[80].a(89, g.field_g.field_u * var3 + 30, 64, 32);
            vw.field_a[2].field_b[109].a(89, 30 - -(var3 * g.field_g.field_u), 64, 32);
            vw.field_a[1].field_b[80].a(153, 30 + var3 * g.field_g.field_u, 64, 32);
            vw.field_a[1].field_b[109].a(153, 30 + var3 * g.field_g.field_u, 64, 32);
            g.field_g.c(ana.field_t[9], 227, (1 + var3) * g.field_g.field_u + 30 + 3 * g.field_g.field_u / 8, 3518976, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.V(" + param0 + ')');
        }
    }

    void l(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            if (11 != ((jla) this).field_b) {
              if (((jla) this).field_b != 12) {
                L1: {
                  if (((jla) this).field_b == 6) {
                    break L1;
                  } else {
                    this.c(2);
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (iba.field_s == 0) {
                      break L3;
                    } else {
                      if (iba.field_s == 15) {
                        break L3;
                      } else {
                        if (kaa.field_m == 0) {
                          break L3;
                        } else {
                          if (kaa.field_m == 15) {
                            break L3;
                          } else {
                            if (kaa.field_m != 10) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  ((jla) this).i(-12988);
                  break L2;
                }
                this.a(25428);
                if (param0 == 9) {
                  L4: {
                    L5: {
                      ((jla) this).c(true);
                      if (((jla) this).field_b != 6) {
                        break L5;
                      } else {
                        this.n(4);
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (9 != ((jla) this).field_b) {
                        break L6;
                      } else {
                        this.g(10);
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (((jla) this).field_b != 14) {
                        break L7;
                      } else {
                        this.h(param0 + -137);
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (((jla) this).field_b != 10) {
                      break L4;
                    } else {
                      var2_int = aha.field_D.b(fia.field_s, 480);
                      hp.a(uma.field_J[0].field_n + 480 - -uma.field_J[2].field_n, -uma.field_J[0].field_n + 80, (byte) 113, 30 * var2_int + (uma.field_J[0].field_o + uma.field_J[6].field_o), uma.field_J, -uma.field_J[0].field_o + (200 + -aha.field_D.field_u));
                      int discarded$1 = aha.field_D.a(fia.field_s, 80, 188, 480, 1000, 3518976, -1, 0, 0, 30);
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              } else {
                eb.a(true, 36);
                return;
              }
            } else {
              L8: {
                if (!di.b(40)) {
                  break L8;
                } else {
                  aia.d((byte) -112);
                  break L8;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.K(" + param0 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              wl.field_yb = null;
              eea.field_a = null;
              if (param0 == 2) {
                break L1;
              } else {
                ((jla) this).field_e = null;
                break L1;
              }
            }
            vla.field_r = null;
            vu.field_k = null;
            jm.field_i = null;
            i.field_d = null;
            nt.field_z = null;
            bp.field_y = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.TA(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 0;
              aha.field_D.c(ana.field_j[0], 25, 30, uga.field_v, -1);
              var2_int++;
              var2_int = var2_int + g.field_g.a(ana.field_j[1], 25, -10 + (g.field_g.field_u * var2_int + 40), 590, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var2_int += 2;
              g.field_g.c(ana.field_j[2], 25, 40 - (-(var2_int * g.field_g.field_u) + 10), 3518976, -1);
              r.field_n.e(25, 40 + var2_int * g.field_g.field_u);
              var4 = 10 + (25 + r.field_n.field_q);
              var3 = -r.field_n.field_q + 590;
              var2_int = var2_int + g.field_g.a(ana.field_j[4], var4, 40 + g.field_g.field_u * var2_int, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              pt.a(315, 3518976, 145, true, var2_int * g.field_g.field_u + 40 - g.field_g.field_u / 2, 180, 5, (byte) 111, 350);
              var2_int++;
              qh.a(180, 270, -1271, 234, g.field_g.field_u * (1 + var2_int) + 40, 350, 5, 3518976);
              var2_int = var2_int + g.field_g.a(ana.field_j[5], var4, 40 + g.field_g.field_u * var2_int, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var2_int++;
              pt.a(283, 3518976, 215, true, (var2_int - -1) * g.field_g.field_u + 40, 280, 5, (byte) 53, 350);
              var2_int = var2_int + g.field_g.a(ana.field_j[6], var4, 40 + g.field_g.field_u * var2_int, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var2_int++;
              pt.a(322, 3518976, 295, true, 40 - -(g.field_g.field_u * (var2_int + 1)), 360, 10, (byte) 64, 350);
              var2_int = var2_int + g.field_g.a(ana.field_j[7], var4, var2_int * g.field_g.field_u + 40, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
              var3 = r.field_n.field_q;
              var5 = 1;
              if (kt.field_k == 0) {
                var5 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            int discarded$1 = g.field_g.a(ana.field_j[3], 125, -((var5 + 11) * g.field_g.field_u / param0) + 470, var3, 2 * g.field_g.field_u, 3518976, -1, 0, 0, g.field_g.field_u);
            qh.a(180, 198, -1271, 32, (-var5 + 3) * g.field_g.field_u / 2 + 385, 120, 10, 3518976);
            var3 = g.field_g.a(ana.field_j[8]);
            g.field_g.c(ana.field_j[8], 25, 470 + -(3 * g.field_g.field_u / 2), 3518976, -1);
            qh.a(362, 91, -1271, 45, 435, 68, 5, 3518976);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "jla.DA(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new rca(0, 0);
        field_c = "Wallet: ";
        field_f = "Welcome. Click the tooltips to continue.";
    }
}
