/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Transmogrify extends ig {
    static String field_B;
    static String field_E;
    static int field_D;
    public static boolean field_A;

    final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_E = (String) null;
                break L1;
              }
            }
            L2: {
              gl.j(param0 + 31107);
              if (ub.field_c != null) {
                qd.b(5);
                break L2;
              } else {
                break L2;
              }
            }
            lf.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.K(" + param0 + ')');
        }
    }

    public static void l(int param0) {
        try {
            field_B = null;
            field_E = null;
            if (param0 != 0) {
                Transmogrify.d(false);
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "Transmogrify.L(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        boolean discarded$0 = false;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_47_0 = 0;
        int stackIn_95_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        gd var5 = null;
        var4 = field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              sf.v(107);
              if (null == ub.field_c) {
                break L1;
              } else {
                if (!ub.field_c.field_c) {
                  break L1;
                } else {
                  qd.b(5);
                  wk.b((byte) -120);
                  break L1;
                }
              }
            }
            L2: {
              stackIn_7_0 = this;

              stackIn_7_1 = 10017;

              if (ub.field_c == null) {
                stackIn_8_0 = this;
                stackIn_8_1 = stackIn_7_1;
                stackIn_8_2 = 0;
                break L2;
              } else {
                stackIn_8_0 = this;
                stackIn_8_1 = stackIn_7_1;
                stackIn_8_2 = 1;
                break L2;
              }
            }
            L3: {
              this.a(stackIn_8_1, stackIn_8_2 != 0);
              if (!wf.field_a) {
                break L3;
              } else {
                this.j(-7632);
                wf.field_a = false;
                break L3;
              }
            }
            if (param0 <= -12) {
              L4: {
                if (!rd.b(63)) {
                  break L4;
                } else {
                  this.b(false);
                  if (!rd.b(72)) {
                    if (qj.b((byte) 99)) {
                      break L4;
                    } else {
                      sh.field_c = pj.a(29, (byte) -76, 3, 10, 1);
                      break L4;
                    }
                  } else {
                    L5: {
                      if (pa.b(-120)) {
                        discarded$0 = this.a((byte) -96, false);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L6: {
                if (!vi.field_h) {
                  gj.a(true, f.field_a);
                  if (this.a((byte) -96, true)) {
                    this.n(32198);
                    vi.field_h = true;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  L7: {
                    if (qj.b((byte) 95)) {
                      break L7;
                    } else {
                      if (ud.field_a) {
                        break L7;
                      } else {
                        if (lb.field_i != 2) {
                          L8: {
                            if (kb.field_n == null) {
                              break L8;
                            } else {
                              if (kb.field_n.field_i) {
                                hc.field_u = hc.field_u & (kb.field_n.field_k ^ -1);
                                rh.field_n = rh.field_n | kb.field_n.field_k;
                                kb.field_n = null;
                                cg.b((byte) -27);
                                qd.a(-117);
                                ud.field_a = true;
                                if ((be.field_q ^ -1) != -7) {
                                  break L6;
                                } else {
                                  if (0 == hc.field_u) {
                                    qf.field_d = 2;
                                    be.field_q = 2;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                          vf.a((byte) -123, 100.0f, gk.field_a);
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (!ll.c(true)) {
                    if (!dj.b(-1)) {
                      if (-170 < (tl.field_d ^ -1)) {
                        tl.field_d = tl.field_d + fa.field_f;
                        if (169 > tl.field_d) {
                          break L6;
                        } else {
                          wd.a(17099, true, bd.field_u[6]);
                          break L6;
                        }
                      } else {
                        this.o(11179);
                        break L6;
                      }
                    } else {
                      L9: {
                        if (ub.field_c == null) {
                          stackIn_47_0 = 0;
                          break L9;
                        } else {
                          stackIn_47_0 = 1;
                          break L9;
                        }
                      }
                      var2_int = pc.a(stackIn_47_0 != 0, (ig) (this), (byte) 120);
                      if ((var2_int ^ -1) != -2364825) {
                        if (var2_int == 1) {
                          qd.b(5);
                          break L6;
                        } else {
                          if (2 == var2_int) {
                            L10: {
                              if (null != ub.field_c) {
                                qd.b(5);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            vl.a((byte) 120, ha.b(85));
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        jd.a((byte) -77);
                        break L6;
                      }
                    }
                  } else {
                    if (lb.field_i != 0) {
                      this.o(11179);
                      break L6;
                    } else {
                      L11: {
                        var2_int = ll.s(120);
                        if ((var2_int ^ -1) != -4) {
                          if (var2_int != 2) {
                            if (-5 != (var2_int ^ -1)) {
                              break L11;
                            } else {
                              vb.a(-2, -2, (byte) 117);
                              break L11;
                            }
                          } else {
                            qd.b(5);
                            break L11;
                          }
                        } else {
                          dj.a(true, true);
                          break L11;
                        }
                      }
                      if (!ll.c(true)) {
                        ej.field_l[be.field_q].a(true, 256);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              L12: {
                if (!qj.b((byte) 122)) {
                  L13: while (true) {
                    var5 = (gd) ((Object) mc.field_c.c(-128));
                    if (var5 != null) {
                      te.a(var5, (byte) -10, 4);
                      continue L13;
                    } else {
                      break L12;
                    }
                  }
                } else {
                  break L12;
                }
              }
              L14: while (true) {
                if (!gj.a(ek.field_c, (byte) 114)) {
                  L15: {
                    rb.a(0, -377);
                    if (!vc.e(false)) {
                      stackIn_95_0 = 0;
                      break L15;
                    } else {
                      stackIn_95_0 = 1;
                      break L15;
                    }
                  }
                  L16: {
                    var2_int = stackIn_95_0;
                    if (var2_int != 0) {
                      var3 = this.f((byte) 102);
                      if ((var3 ^ -1) != -3) {
                        break L16;
                      } else {
                        jd.a(240, 10, eh.field_c, 3, wf.field_d.field_y, 320, wf.field_d, wf.field_d.field_y * 3 / 2, 3, pf.field_h, false);
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  this.g(-89);
                  continue L14;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static String k(int param0) {
        RuntimeException var1 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 72) {
                break L1;
              } else {
                field_D = -63;
                break L1;
              }
            }
            stackIn_3_0 = nf.field_l.g(12248);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "Transmogrify.M(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final static void m(int param0) {
        int fieldTemp$2 = 0;
        hj var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 85) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            var1 = ff.field_D;
            L2: while (true) {
              if (!cg.g(-5591)) {
                break L0;
              } else {
                var1.a(false, 8);
                fieldTemp$2 = var1.field_h + 1;
                var1.field_h = var1.field_h + 1;
                var2 = fieldTemp$2;
                lc.a((byte) 65, var1);
                ff.field_D.a((byte) -42, var1.field_h - var2);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "Transmogrify.I(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_39_0;
        int stackIn_39_1;
        mi stackIn_39_2;
        int stackIn_39_3;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        mi stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int stackIn_43_0;
        int stackIn_43_1;
        mi stackIn_43_2;
        int stackIn_43_3;
        int stackIn_43_4;
        int stackIn_43_5;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        mi stackIn_44_2 = null;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_44_6 = 0;
        int[] stackIn_47_0;
        int stackIn_47_1;
        int stackIn_47_2;
        int stackIn_47_3;
        mi stackIn_47_4;
        int stackIn_47_5;
        int stackIn_47_6;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        mi stackIn_48_4 = null;
        int stackIn_48_5 = 0;
        int stackIn_48_6 = 0;
        int stackIn_48_7 = 0;
        int[] stackIn_51_0;
        int stackIn_51_1;
        int stackIn_51_2;
        int stackIn_51_3;
        mi stackIn_51_4;
        int stackIn_51_5;
        int stackIn_51_6;
        int stackIn_51_7;
        int[] stackIn_52_0;
        int stackIn_52_1;
        int stackIn_52_2;
        int stackIn_52_3;
        mi stackIn_52_4;
        int stackIn_52_5;
        int stackIn_52_6;
        int stackIn_52_7;
        int stackIn_52_8;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (lb.field_i != 0) {
                if (1 != lb.field_i) {
                  if (2 == lb.field_i) {
                    L2: {
                      if (qj.b((byte) 104)) {
                        be.field_q = hf.field_i;
                        break L2;
                      } else {
                        kb.field_n = l.a((byte) 12, 4);
                        ug.b(true);
                        sh.field_c = pj.a(29, (byte) 114, 3, 10, 1);
                        be.field_q = vl.field_y;
                        break L2;
                      }
                    }
                    L3: {
                      if (be.field_q == -2) {
                        be.field_q = 0;
                        dj.a(true, true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    lb.field_i = 3;
                    qf.field_d = be.field_q;
                    break L1;
                  } else {
                    lc.field_q = lc.field_q - 1;
                    if ((lc.field_q ^ -1) != -1) {
                      break L1;
                    } else {
                      lb.field_i = 0;
                      break L1;
                    }
                  }
                } else {
                  lc.field_q = lc.field_q + 1;
                  if ((lc.field_q ^ -1) != -17) {
                    break L1;
                  } else {
                    L4: {
                      if (ll.c(true)) {
                        fg.d((byte) 91);
                        break L4;
                      } else {
                        qg.b(false);
                        break L4;
                      }
                    }
                    lb.field_i = 2;
                    break L1;
                  }
                }
              } else {
                if ((be.field_q ^ -1) == (qf.field_d ^ -1)) {
                  if (be.field_q == -1) {
                    ia.d(80);
                    if (-2 == (qf.field_d ^ -1)) {
                      oh.field_j = oh.field_j + 1;
                      g.field_z = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ej.field_l[be.field_q].c((byte) 122);
                    if (oh.field_j <= 2) {
                      break L1;
                    } else {
                      if (-11 < (n.field_a ^ -1)) {
                        wk.field_c = wk.field_c + 1;
                        dc.field_a = dc.field_a + 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  L5: {
                    fieldTemp$0 = lc.field_q + 1;
                    lc.field_q = lc.field_q + 1;
                    if (16 != fieldTemp$0) {
                      if ((lc.field_q ^ -1) != -2) {
                        break L5;
                      } else {
                        if ((qf.field_d ^ -1) <= -1) {
                          L6: {
                            if (-1 != be.field_q) {
                              ej.field_l[qf.field_d].a(ej.field_l[be.field_q].field_j.field_f, param0 ^ 10923);
                              break L6;
                            } else {
                              ej.field_l[qf.field_d].a(false, 256);
                              break L6;
                            }
                          }
                          if (qf.field_d == 5) {
                            L7: {
                              var2_int = 130;
                              var3 = wf.field_d.field_t + (wf.field_d.field_D + 4);
                              var2_int = var2_int + var3 * wf.field_d.b(sd.field_Q, 341);
                              stackIn_39_0 = var2_int;

                              stackIn_39_1 = var3;

                              stackIn_39_2 = wf.field_d;

                              stackIn_39_3 = 1;

                              if (-1 == (hc.field_u ^ -1)) {
                                stackIn_40_0 = stackIn_39_0;
                                stackIn_40_1 = stackIn_39_1;
                                stackIn_40_2 = (mi) ((Object) stackIn_39_2);
                                stackIn_40_3 = stackIn_39_3;
                                stackIn_40_4 = 0;
                                break L7;
                              } else {
                                stackIn_40_0 = stackIn_39_0;
                                stackIn_40_1 = stackIn_39_1;
                                stackIn_40_2 = (mi) ((Object) stackIn_39_2);
                                stackIn_40_3 = stackIn_39_3;
                                stackIn_40_4 = 1;
                                break L7;
                              }
                            }
                            L8: {
                              stackIn_43_0 = stackIn_40_0;

                              stackIn_43_1 = stackIn_40_1;

                              stackIn_43_2 = (mi) ((Object) stackIn_40_2);

                              stackIn_43_3 = stackIn_40_3;

                              stackIn_43_4 = stackIn_40_4;

                              stackIn_43_5 = 0;

                              if (0 == pf.field_g) {
                                stackIn_44_0 = stackIn_43_0;
                                stackIn_44_1 = stackIn_43_1;
                                stackIn_44_2 = (mi) ((Object) stackIn_43_2);
                                stackIn_44_3 = stackIn_43_3;
                                stackIn_44_4 = stackIn_43_4;
                                stackIn_44_5 = stackIn_43_5;
                                stackIn_44_6 = 0;
                                break L8;
                              } else {
                                stackIn_44_0 = stackIn_40_0;
                                stackIn_44_1 = stackIn_40_1;
                                stackIn_44_2 = (mi) ((Object) stackIn_40_2);
                                stackIn_44_3 = stackIn_40_3;
                                stackIn_44_4 = stackIn_40_4;
                                stackIn_44_5 = stackIn_43_5;
                                stackIn_44_6 = 1;
                                break L8;
                              }
                            }
                            L9: {
                              var2_int = stackIn_44_0 + stackIn_44_1 * ((mi) (Object) stackIn_44_2).b(aj.a(stackIn_44_3 != 0, stackIn_44_4 != 0, stackIn_44_5 != 0, stackIn_44_6 != 0), 341);
                              fd.field_a[5] = var2_int - -10;
                              stackIn_47_0 = fd.field_b;

                              stackIn_47_1 = 5;

                              stackIn_47_2 = var3 + jk.field_x.a(true);

                              stackIn_47_3 = var3;

                              stackIn_47_4 = wf.field_d;

                              stackIn_47_5 = -127;

                              stackIn_47_6 = 0;

                              if (0 == pf.field_g) {
                                stackIn_48_0 = (int[]) ((Object) stackIn_47_0);
                                stackIn_48_1 = stackIn_47_1;
                                stackIn_48_2 = stackIn_47_2;
                                stackIn_48_3 = stackIn_47_3;
                                stackIn_48_4 = (mi) ((Object) stackIn_47_4);
                                stackIn_48_5 = stackIn_47_5;
                                stackIn_48_6 = stackIn_47_6;
                                stackIn_48_7 = 0;
                                break L9;
                              } else {
                                stackIn_48_0 = (int[]) ((Object) stackIn_47_0);
                                stackIn_48_1 = stackIn_47_1;
                                stackIn_48_2 = stackIn_47_2;
                                stackIn_48_3 = stackIn_47_3;
                                stackIn_48_4 = (mi) ((Object) stackIn_47_4);
                                stackIn_48_5 = stackIn_47_5;
                                stackIn_48_6 = stackIn_47_6;
                                stackIn_48_7 = 1;
                                break L9;
                              }
                            }
                            L10: {
                              stackIn_51_0 = (int[]) ((Object) stackIn_48_0);

                              stackIn_51_1 = stackIn_48_1;

                              stackIn_51_2 = stackIn_48_2;

                              stackIn_51_3 = stackIn_48_3;

                              stackIn_51_4 = (mi) ((Object) stackIn_48_4);

                              stackIn_51_5 = stackIn_48_5;

                              stackIn_51_6 = stackIn_48_6;

                              stackIn_51_7 = stackIn_48_7;

                              if (-1 == (hc.field_u ^ -1)) {
                                stackIn_52_0 = (int[]) ((Object) stackIn_51_0);
                                stackIn_52_1 = stackIn_51_1;
                                stackIn_52_2 = stackIn_51_2;
                                stackIn_52_3 = stackIn_51_3;
                                stackIn_52_4 = (mi) ((Object) stackIn_51_4);
                                stackIn_52_5 = stackIn_51_5;
                                stackIn_52_6 = stackIn_51_6;
                                stackIn_52_7 = stackIn_51_7;
                                stackIn_52_8 = 0;
                                break L10;
                              } else {
                                stackIn_52_0 = (int[]) ((Object) stackIn_48_0);
                                stackIn_52_1 = stackIn_48_1;
                                stackIn_52_2 = stackIn_48_2;
                                stackIn_52_3 = stackIn_48_3;
                                stackIn_52_4 = (mi) ((Object) stackIn_48_4);
                                stackIn_52_5 = stackIn_48_5;
                                stackIn_52_6 = stackIn_48_6;
                                stackIn_52_7 = stackIn_48_7;
                                stackIn_52_8 = 1;
                                break L10;
                              }
                            }
                            stackIn_52_0[stackIn_52_1] = stackIn_52_2 + stackIn_52_3 * ((mi) (Object) stackIn_52_4).b(gd.a((byte) stackIn_52_5, stackIn_52_6 != 0, stackIn_52_7 != 0, stackIn_52_8 != 0), 341);
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      L11: {
                        if (2 != be.field_q) {
                          break L11;
                        } else {
                          sh.field_c = null;
                          break L11;
                        }
                      }
                      L12: {
                        if (-6 != (be.field_q ^ -1)) {
                          break L12;
                        } else {
                          if (qj.b((byte) 99)) {
                            rh.field_n = 0;
                            hc.field_u = 0;
                            mc.field_c.g(-1);
                            pf.field_g = 0;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      lc.field_q = 0;
                      be.field_q = qf.field_d;
                      if ((be.field_q ^ -1) == -1) {
                        wd.a(17099, true, bd.field_u[6]);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  eg.field_b = eg.field_b + 1;
                  if (oh.field_j <= 2) {
                    break L1;
                  } else {
                    if (10 > n.field_a) {
                      wk.field_c = wk.field_c + 1;
                      dc.field_a = dc.field_a + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L13: {
              if (param0 == 11179) {
                break L13;
              } else {
                this.a(60);
                break L13;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.H(" + param0 + ')');
        }
    }

    final void b(int param0) {
        Object stackIn_5_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_88_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        ti[] var3_ref_ti__ = null;
        int var3 = 0;
        int var4 = 0;
        ti var5_ref_ti = null;
        int var5 = 0;
        int var6 = 0;
        ti[] var7_ref_ti__ = null;
        int var7 = 0;
        int var8 = 0;
        ti var9 = null;
        int var10 = 0;
        Object var11 = null;
        var10 = field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ub.field_c == null) {
                stackIn_5_0 = gd.field_k;
                break L1;
              } else {
                stackIn_5_0 = ub.field_c;
                break L1;
              }
            }
            var11 = stackIn_5_0;
            var2 = var11;
            if (rd.b(65)) {
              L2: {
                if (null != ub.field_c) {
                  stackIn_12_0 = 1;
                  break L2;
                } else {
                  stackIn_12_0 = rj.field_b ? 1 : 0;
                  break L2;
                }
              }
              da.a(stackIn_12_0 != 0, (byte) 119, (java.awt.Canvas) (var11));
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!vi.field_h) {
                ng.a(false, (java.awt.Canvas) (var11));
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if (qj.b((byte) 119)) {
                    break L3;
                  } else {
                    if (ud.field_a) {
                      break L3;
                    } else {
                      ng.a(false, (java.awt.Canvas) (var11));
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                L4: {
                  if (be.field_q != qf.field_d) {
                    L5: {
                      if (qf.field_d == -1) {
                        kd.a(param0 ^ 15706, 0);
                        break L5;
                      } else {
                        ej.field_l[qf.field_d].d(param0 ^ 29608, 0);
                        break L5;
                      }
                    }
                    if ((be.field_q ^ -1) != 0) {
                      ej.field_l[be.field_q].d(param0 ^ 29608, (lc.field_q << -984032095) - (lc.field_q << 921441573));
                      break L4;
                    } else {
                      kd.a(98, (lc.field_q << -832957535) + -(lc.field_q << 1557856197));
                      break L4;
                    }
                  } else {
                    if (0 != (be.field_q ^ -1)) {
                      ej.field_l[be.field_q].d(param0 + 4456, 0);
                      if ((tl.field_d ^ -1) > -170) {
                        if (tl.field_d < 151) {
                          L6: {
                            jh.field_h.f(0, 0);
                            if (25 <= tl.field_d) {
                              var3_ref_ti__ = gk.field_c;
                              var4 = 0;
                              L7: while (true) {
                                if (var3_ref_ti__.length <= var4) {
                                  if ((tl.field_d ^ -1) <= -135) {
                                    break L6;
                                  } else {
                                    var3 = 3 * jl.field_l.field_r / 20;
                                    var4 = jl.field_l.field_s * 3 / 20;
                                    jl.field_l.b(320 - (var3 >> -1146190079), -(var4 >> -826029567) + 240, var3, var4);
                                    break L6;
                                  }
                                } else {
                                  var5_ref_ti = var3_ref_ti__[var4];
                                  var5_ref_ti.c(0, 0);
                                  var4++;
                                  continue L7;
                                }
                              }
                            } else {
                              var3 = tl.field_d * 640 / 25;
                              var4 = tl.field_d * 480 / 25;
                              var5 = -var3 + 640 >> -353365215;
                              var6 = -var4 + 480 >> 2118178113;
                              var7_ref_ti__ = gk.field_c;
                              var8 = 0;
                              L8: while (true) {
                                if (var8 >= var7_ref_ti__.length) {
                                  var7 = tl.field_d * 3 * jl.field_l.field_r / 500;
                                  var8 = jl.field_l.field_s * 3 * tl.field_d / 500;
                                  jl.field_l.b(-(var7 >> 52684673) + 320, -(var8 >> -253450431) + 240, var7, var8);
                                  break L6;
                                } else {
                                  var9 = var7_ref_ti__[var8];
                                  var9.b(var5, var6, var3, var4);
                                  var8++;
                                  continue L8;
                                }
                              }
                            }
                          }
                          L9: {
                            var3 = -10 + tl.field_d;
                            if ((var3 ^ -1) <= -1) {
                              rh.field_s.c(0, (int)(Math.exp((double)(-var3) * 0.06) * -160.0 * Math.cos((double)var3 * 0.12)));
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            var3 = tl.field_d + -50;
                            if ((var3 ^ -1) > -1) {
                              break L10;
                            } else {
                              L11: {
                                var4 = (var3 << -1746519036) + -ij.field_h.field_n;
                                if (var4 > 16) {
                                  var4 = 16;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              ij.field_h.c(var4, 159);
                              break L10;
                            }
                          }
                          L12: {
                            var3 = -84 + tl.field_d;
                            if ((var3 ^ -1) > -1) {
                              break L12;
                            } else {
                              L13: {
                                var4 = 640 + -(8 * var3);
                                if (var4 >= 406) {
                                  break L13;
                                } else {
                                  var4 = 406;
                                  break L13;
                                }
                              }
                              hc.field_r.c(var4, 112);
                              break L12;
                            }
                          }
                          var3 = -134 + tl.field_d;
                          if ((var3 ^ -1) > -1) {
                            break L4;
                          } else {
                            var4 = jl.field_l.field_r * (3 - -var3 - -(var3 * var3 / 2)) / 20;
                            var5 = jl.field_l.field_s * (3 - (-var3 - var3 * var3 / 2)) / 20;
                            jl.field_l.b(320 - (var4 >> 1279264961), 240 - (var5 >> 1991447073), var4, var5);
                            break L4;
                          }
                        } else {
                          L14: {
                            var3 = 166 - tl.field_d;
                            if ((var3 ^ -1) <= -1) {
                              var4 = (var3 + (3 - -(var3 * var3 / 2))) * jl.field_l.field_r / 20;
                              var5 = jl.field_l.field_s * (var3 * var3 / 2 + var3 + 3) / 20;
                              break L14;
                            } else {
                              if (2 >= (var3 ^ -1)) {
                                var4 = jl.field_l.field_r * (3 - -var3) / 20;
                                var5 = jl.field_l.field_s * (3 - -var3) / 20;
                                break L14;
                              } else {
                                var4 = 0;
                                var5 = 0;
                                break L14;
                              }
                            }
                          }
                          jl.field_l.b(320 - (var4 >> 756986817), 240 - (var5 >> 1911458401), var4, var5);
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      kd.a(param0 ^ 15706, 0);
                      break L4;
                    }
                  }
                }
                if (param0 == 15648) {
                  L15: {
                    if (!ll.c(true)) {
                      break L15;
                    } else {
                      sb.e(0, 0, 640, 480);
                      og.b(false);
                      break L15;
                    }
                  }
                  L16: {
                    if (0 == lb.field_i) {
                      break L16;
                    } else {
                      var3 = 256 * lc.field_q / 16;
                      if (-1 > (var3 ^ -1)) {
                        sb.c(0, 0, sb.field_c, sb.field_g, 0, var3);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if (!dj.b(-1)) {
                      break L17;
                    } else {
                      if (ll.c(true)) {
                        break L17;
                      } else {
                        L18: {
                          if (null != ub.field_c) {
                            stackIn_88_0 = 1;
                            break L18;
                          } else {
                            stackIn_88_0 = rj.field_b ? 1 : 0;
                            break L18;
                          }
                        }
                        cj.a(stackIn_88_0 != 0, 793);
                        break L17;
                      }
                    }
                  }
                  ah.a(0, 0, (byte) 119, (java.awt.Canvas) (var11));
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "Transmogrify.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public Transmogrify() {
    }

    private final boolean a(byte param0, boolean param1) {
        int incrementValue$0 = 0;
        sj dupTemp$1 = null;
        int incrementValue$2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_189_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        ad[] var5 = null;
        int var6_int = 0;
        nf var6 = null;
        sj var7 = null;
        int var7_int = 0;
        sj var8 = null;
        int var8_int = 0;
        sj var9 = null;
        int var9_int = 0;
        int var10 = 0;
        ti var12 = null;
        ti[] var13 = null;
        ti var14 = null;
        ad[] var15 = null;
        ad[] var16 = null;
        sj var17 = null;
        sj var18 = null;
        byte[] var21 = null;
        var10 = field_A ? 1 : 0;
        try {
          L0: {
            if (null != pc.field_a) {
              L1: {
                if (!li.field_k.a((byte) -116)) {
                  break L1;
                } else {
                  if (!li.field_k.a((byte) -98, "basic")) {
                    break L1;
                  } else {
                    L2: {
                      if (!pc.field_a.a((byte) -120)) {
                        break L2;
                      } else {
                        if (pc.field_a.c(param0 ^ -32065)) {
                          L3: {
                            if (!di.field_h.a((byte) -116)) {
                              break L3;
                            } else {
                              if (!di.field_h.c(32031)) {
                                break L3;
                              } else {
                                L4: {
                                  if (!be.field_n.a((byte) -117)) {
                                    break L4;
                                  } else {
                                    if (!be.field_n.c(32031)) {
                                      break L4;
                                    } else {
                                      L5: {
                                        if (!ta.field_d.a((byte) -115)) {
                                          break L5;
                                        } else {
                                          if (ta.field_d.c(32031)) {
                                            L6: {
                                              if (!oi.field_g.a((byte) -128)) {
                                                break L6;
                                              } else {
                                                if (oi.field_g.a((byte) 123, "")) {
                                                  L7: {
                                                    if (!wl.a(false, 0)) {
                                                      break L7;
                                                    } else {
                                                      L8: {
                                                        if (!oi.field_g.a((byte) -113)) {
                                                          break L8;
                                                        } else {
                                                          if (oi.field_g.a((byte) 121, "halloween")) {
                                                            break L7;
                                                          } else {
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                      vf.a((byte) 36, 50.0f, ee.a(q.field_e, (byte) 114, ih.field_c, oi.field_g, "halloween"));
                                                      stackIn_42_0 = 0;
                                                      decompiledRegionSelector0 = 6;
                                                      break L0;
                                                    }
                                                  }
                                                  L9: {
                                                    if (!kk.field_a.a((byte) -118)) {
                                                      break L9;
                                                    } else {
                                                      if (kk.field_a.c(32031)) {
                                                        if (li.field_k.a((byte) 126, "arialish12")) {
                                                          if (!ig.field_y.a((byte) 118, "arialish12")) {
                                                            vf.a((byte) -125, 52.0f, ee.a(dj.field_a, (byte) 106, i.field_c, li.field_k, "arialish12"));
                                                            stackIn_55_0 = 0;
                                                            decompiledRegionSelector0 = 9;
                                                            break L0;
                                                          } else {
                                                            if (li.field_k.a((byte) -13, "arialish20")) {
                                                              if (ig.field_y.a((byte) 117, "arialish20")) {
                                                                L10: {
                                                                  if (!l.field_a.a((byte) -124)) {
                                                                    break L10;
                                                                  } else {
                                                                    if (l.field_a.c(32031)) {
                                                                      vf.a((byte) 17, 73.0f, q.field_c);
                                                                      if (!param1) {
                                                                        stackIn_71_0 = 0;
                                                                        decompiledRegionSelector0 = 13;
                                                                        break L0;
                                                                      } else {
                                                                        cg.b((byte) -121);
                                                                        this.b(15648);
                                                                        rc.field_a = new bl(pc.field_a, di.field_h);
                                                                        dg.field_d[0] = r.a(pc.field_a, "", "trans16_button_click").a();
                                                                        dg.field_d[1] = r.a(pc.field_a, "", "trans01_submit_accept").a();
                                                                        dg.field_d[2] = r.a(pc.field_a, "", "trans02_submit_decline").a();
                                                                        dg.field_d[3] = r.a(pc.field_a, "", "trans03_place_tile_1").a();
                                                                        dg.field_d[4] = r.a(pc.field_a, "", "trans04_place_tile_2").a();
                                                                        dg.field_d[5] = r.a(pc.field_a, "", "trans05_place_tile_3").a();
                                                                        dg.field_d[6] = r.a(pc.field_a, "", "trans06_incorrect_letter").a();
                                                                        dg.field_d[7] = r.a(pc.field_a, "", "trans07_popup_warning").a();
                                                                        lj.field_u = bb.a(dg.field_d[1], 100, 255);
                                                                        pc.field_a = null;
                                                                        el.b(-6491);
                                                                        stackIn_73_0 = 0;
                                                                        decompiledRegionSelector0 = 14;
                                                                        break L0;
                                                                      }
                                                                    } else {
                                                                      break L10;
                                                                    }
                                                                  }
                                                                }
                                                                vf.a((byte) -4, 54.0f, rj.a(l.field_a, (byte) -38));
                                                                stackIn_66_0 = 0;
                                                                decompiledRegionSelector0 = 12;
                                                                break L0;
                                                              } else {
                                                                vf.a((byte) -123, 53.0f, ee.a(dj.field_a, (byte) 123, i.field_c, li.field_k, "arialish20"));
                                                                stackIn_61_0 = 0;
                                                                decompiledRegionSelector0 = 11;
                                                                break L0;
                                                              }
                                                            } else {
                                                              vf.a((byte) 83, 53.0f, ee.a(dj.field_a, (byte) 106, i.field_c, li.field_k, "arialish20"));
                                                              stackIn_58_0 = 0;
                                                              decompiledRegionSelector0 = 10;
                                                              break L0;
                                                            }
                                                          }
                                                        } else {
                                                          vf.a((byte) -128, 52.0f, ee.a(dj.field_a, (byte) 102, i.field_c, li.field_k, "arialish12"));
                                                          stackIn_50_0 = 0;
                                                          decompiledRegionSelector0 = 8;
                                                          break L0;
                                                        }
                                                      } else {
                                                        break L9;
                                                      }
                                                    }
                                                  }
                                                  vf.a((byte) 11, 51.0f, ee.a(dj.field_a, (byte) 75, i.field_c, kk.field_a, ""));
                                                  stackIn_47_0 = 0;
                                                  decompiledRegionSelector0 = 7;
                                                  break L0;
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                            vf.a((byte) -128, 50.0f, ee.a(vg.field_a, (byte) 73, aa.field_f, oi.field_g, ""));
                                            stackIn_36_0 = 0;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      vf.a((byte) -128, 49.0f, ee.a(i.field_d, (byte) 97, kh.field_e, ta.field_d, ""));
                                      stackIn_31_0 = 0;
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                                vf.a((byte) 25, 48.0f, fg.a(kh.field_e, be.field_n, 0, i.field_d, 32389));
                                stackIn_26_0 = 0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          vf.a((byte) -10, 2.0f, ee.a(i.field_d, (byte) 74, kh.field_e, di.field_h, ""));
                          stackIn_20_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    vf.a((byte) 90, 1.0f, ee.a(oc.field_H, (byte) 71, k.field_e, pc.field_a, ""));
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              vf.a((byte) -121, 0.0f, ee.a(vg.field_a, (byte) 100, aa.field_f, li.field_k, "basic"));
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null == di.field_h) {
                if (null != ta.field_d) {
                  vf.a((byte) -125, 75.0f, db.field_f);
                  this.b(15648);
                  bd.field_u = new pl[10];
                  bd.field_u[0] = pl.a(ta.field_d, "", "transmogrify intro jingle");
                  bd.field_u[1] = pl.a(ta.field_d, "", "transmogrify 1-3");
                  bd.field_u[2] = pl.a(ta.field_d, "", "transmogrify 4-6");
                  bd.field_u[3] = pl.a(ta.field_d, "", "transmogrify 7-9");
                  bd.field_u[4] = pl.a(ta.field_d, "", "transmogrify 10");
                  bd.field_u[5] = pl.a(ta.field_d, "", "transmogrify linking jingle");
                  bd.field_u[6] = pl.a(ta.field_d, "", "transmogrify title");
                  bd.field_u[7] = pl.a(ta.field_d, "", "transmogrify complete well jingle");
                  bd.field_u[8] = pl.a(ta.field_d, "", "transmogrify complete ok jingle");
                  bd.field_u[9] = pl.a(ta.field_d, "", "transmogrify complete poor jingle");
                  ta.field_d = null;
                  el.b(param0 + -6395);
                  stackIn_81_0 = 0;
                  decompiledRegionSelector0 = 16;
                  break L0;
                } else {
                  if (be.field_n == null) {
                    L11: {
                      if (null != gb.field_a) {
                        break L11;
                      } else {
                        if (null == wf.field_d) {
                          vf.a((byte) -125, 92.0f, ha.field_b);
                          this.b(param0 ^ -15744);
                          gb.field_a = ej.a((byte) -43, li.field_k, "", "arialish20");
                          el.b(-6491);
                          stackIn_99_0 = 0;
                          decompiledRegionSelector0 = 19;
                          break L0;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (le.field_A != null) {
                      L12: {
                        if (param0 == -96) {
                          break L12;
                        } else {
                          field_B = (String) null;
                          break L12;
                        }
                      }
                      if (null == rk.field_r[4]) {
                        a.field_R = pc.a("", "logo_highscores", oi.field_g, param0 ^ 118);
                        mk.field_y = pc.a("", "logo_achievements", oi.field_g, 58);
                        se.field_t = pc.a("", "logo_instructions", oi.field_g, -33);
                        uj.field_e = cf.a((byte) -122);
                        kk.field_d = kl.a(oi.field_g, (byte) 121, "", "frame_trans");
                        ck.field_C = kl.a(oi.field_g, (byte) 123, "", "frame_trans_inner");
                        pf.field_d = pc.a("", "banner", oi.field_g, 71);
                        rk.field_r[4] = new ti(640, 480);
                        var12 = new ti(640, 480);
                        var12.e();
                        dk.a(377, ck.field_C, -28018, 258, 72, 361);
                        mk.field_y.d(337, 14, 0);
                        var4 = 0;
                        L13: while (true) {
                          if (var4 >= sb.field_h.length) {
                            L14: {
                              rk.field_r[4].e();
                              uj.field_e.f(0, 0);
                              if (!wl.a(false, 0)) {
                                pc.a("", "achievementsbg_nobox", oi.field_g, -126).c(0, 0);
                                break L14;
                              } else {
                                pc.a("halloween", "achievementsbg_nobox", oi.field_g, 18).c(0, 0);
                                break L14;
                              }
                            }
                            L15: {
                              var12.e(0, 0, 166);
                              wf.a(kk.field_d, 377, 7, 258, 2363394, 361, 72);
                              mk.field_y.c(337, 14);
                              rk.field_r[6] = rk.field_r[4];
                              rk.field_r[1] = new ti(640, 480);
                              rk.field_r[1].e();
                              uj.field_e.f(0, 0);
                              if (!wl.a(false, 0)) {
                                pc.a("", "pausemenu_nobox", oi.field_g, param0 ^ -1).c(0, 0);
                                break L15;
                              } else {
                                pc.a("halloween", "pausemenu_nobox", oi.field_g, -127).c(0, 0);
                                break L15;
                              }
                            }
                            wf.a(kk.field_d, 347, param0 + 103, 140, 2363394, 361, 72);
                            wf.a(ck.field_C, 347, 7, 140, 16777215, 361, 72);
                            pf.field_d.c(219, 14);
                            ri.field_k.a(param0 ^ -47);
                            rk.field_r[7] = rk.field_r[1];
                            el.b(-6491);
                            stackIn_140_0 = 0;
                            decompiledRegionSelector0 = 21;
                            break L0;
                          } else {
                            L16: {
                              if ((sb.field_h[var4] ^ -1) != -1) {
                                sb.field_h[var4] = 16777215;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var4++;
                            continue L13;
                          }
                        }
                      } else {
                        if (rk.field_r[0] != null) {
                          if (l.field_a == null) {
                            var3_int = 0;
                            L17: while (true) {
                              if ((var3_int ^ -1) <= -9) {
                                be.field_q = 0;
                                ek.a(118);
                                el.b(-6491);
                                stackIn_189_0 = 1;
                                decompiledRegionSelector0 = 24;
                                break L0;
                              } else {
                                ej.field_l[var3_int] = new vg(var3_int);
                                var3_int++;
                                continue L17;
                              }
                            }
                          } else {
                            vf.a((byte) -11, 93.0f, vh.field_k);
                            this.b(param0 + 15744);
                            var15 = kl.b(param0 + 12, l.field_a);
                            var4 = 0;
                            var5_int = 0;
                            L18: while (true) {
                              if (var5_int >= var15.length) {
                                incrementValue$0 = var4;
                                var4--;
                                var16 = new ad[incrementValue$0];
                                var5 = var16;
                                var6_int = var15.length - 1;
                                L19: while (true) {
                                  if (-1 < (var6_int ^ -1)) {
                                    we.field_l = new nf[var16.length];
                                    var6_int = 0;
                                    L20: while (true) {
                                      if (var6_int >= we.field_l.length) {
                                        var6 = we.field_l[am.field_n];
                                        var17 = w.a(de.field_d, 1, var6, (byte) 60, var6.field_d.charAt(0));
                                        var17.field_g = 1000;
                                        var8 = var17;
                                        var8.field_j = 1000;
                                        ob.a(1, 1, var17, 0);
                                        ue.field_c[1].field_h = var6.field_c.field_D - -8;
                                        var17.d(1);
                                        dupTemp$1 = w.a(de.field_d, 1, var6, (byte) 88, var6.field_n.charAt(1));
                                        sg.field_p = dupTemp$1;
                                        var18 = dupTemp$1;
                                        var7 = var18;
                                        var7.field_g = 1000;
                                        var9 = var7;
                                        var9.field_j = 1000;
                                        var7.field_x = true;
                                        ob.a(1, 2, var18, 0);
                                        oi.field_g = null;
                                        l.field_a = null;
                                        ue.field_c[2].field_h = 8 + var6.field_c.field_D;
                                        kk.field_a = null;
                                        el.b(param0 ^ 6405);
                                        stackIn_183_0 = 0;
                                        decompiledRegionSelector0 = 23;
                                        break L0;
                                      } else {
                                        L21: {
                                          we.field_l[var6_int] = new nf(oi.field_g, kk.field_a, var16[var6_int]);
                                          if (we.field_l[var6_int].field_j.equals(hi.field_d)) {
                                            am.field_n = var6_int;
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        var6_int++;
                                        continue L20;
                                      }
                                    }
                                  } else {
                                    L22: {
                                      if (var15[var6_int] != null) {
                                        incrementValue$2 = var4;
                                        var4--;
                                        var5[incrementValue$2] = var15[var6_int];
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var6_int--;
                                    continue L19;
                                  }
                                }
                              } else {
                                L23: {
                                  if (var15[var5_int] != null) {
                                    var4++;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                var5_int++;
                                continue L18;
                              }
                            }
                          }
                        } else {
                          L24: {
                            if (wl.a(false, 0)) {
                              rk.field_r[0] = kf.a(pc.a("halloween", "mainmenu_packed", oi.field_g, -125), false, (byte) 101);
                              break L24;
                            } else {
                              rk.field_r[0] = kf.a(pc.a("", "mainmenu_packed", oi.field_g, -5), false, (byte) -93);
                              break L24;
                            }
                          }
                          L25: {
                            rk.field_r[0].e();
                            pf.field_d.c(219, 21);
                            rk.field_r[3] = pc.a("", "instructions_bg", oi.field_g, -128);
                            rk.field_r[5] = rk.field_r[1];
                            wl.field_K = pc.a("", "tile", oi.field_g, param0 + 149);
                            rj.field_a = kl.a(oi.field_g, (byte) 122, "", "sparkles");
                            hf.field_d = kl.a(oi.field_g, (byte) 122, "", "sparkle_array");
                            jh.field_h = new ti(640, 480);
                            jh.field_h.e();
                            uj.field_e.f(0, 0);
                            pc.a("", "spikes", oi.field_g, 45).c(0, 0);
                            rk.field_r[2] = new ti(640, 480);
                            rk.field_r[2].e();
                            jh.field_h.f(0, 0);
                            if (wl.a(false, 0)) {
                              pc.a("halloween", "highscorebg_nobox", oi.field_g, -127).c(0, 0);
                              break L25;
                            } else {
                              pc.a("", "highscorebg_nobox", oi.field_g, -126).c(0, 0);
                              break L25;
                            }
                          }
                          a.field_R.c(10, 10);
                          wf.a(kk.field_d, 377, 7, 217, 2363394, 361, 20);
                          wf.a(ck.field_C, 377, param0 + 103, 217, 16777215, 361, 20);
                          ri.field_k.a(117);
                          jl.field_l = pc.a("", "intro_bigstar", oi.field_g, param0 ^ -58);
                          gk.field_c = kl.a(oi.field_g, (byte) 124, "", "intro_stars");
                          ij.field_h = pc.a("", "intro_host", oi.field_g, -124);
                          hc.field_r = pc.a("", "intro_hostess", oi.field_g, 95);
                          rh.field_s = kf.a(pc.a("", "intro_logo_packed", oi.field_g, param0 + -31), false, (byte) 126);
                          rh.field_s.b();
                          kk.field_d = null;
                          ck.field_C = null;
                          pf.field_d = null;
                          uj.field_e = null;
                          fc.field_h = kl.a(oi.field_g, (byte) 126, "", "achievements");
                          var13 = fc.field_h;
                          var4 = 0;
                          L26: while (true) {
                            if (var13.length <= var4) {
                              L27: {
                                if (wl.a(false, 0)) {
                                  ij.field_h = pc.a("halloween", "intro_host", oi.field_g, -128);
                                  hc.field_r = pc.a("halloween", "intro_hostess", oi.field_g, 59);
                                  qe.field_F = kl.a(oi.field_g, (byte) 127, "halloween", "hostanims_uniq");
                                  rk.field_r[3] = pc.a("halloween", "instructions_bg", oi.field_g, -12);
                                  dh.field_B = pc.a("halloween", "background", oi.field_g, 19);
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                              hk.a(wf.field_d, param0 + 98, 400, wf.field_d);
                              ej.a(16, (byte) 108, 8, 2, new pg(pf.field_h), new pg(eh.field_c));
                              vf.a(new pg(mk.field_B), 10, 10, param0 + 211);
                              el.b(-6491);
                              stackIn_159_0 = 0;
                              decompiledRegionSelector0 = 22;
                              break L0;
                            } else {
                              var14 = var13[var4];
                              nh.a(var14, (byte) 110);
                              var4++;
                              continue L26;
                            }
                          }
                        }
                      }
                    } else {
                      L28: {
                        var21 = ig.field_y.a("", (byte) 92, "arialish20");
                        wf.field_d = jd.a(var21, 98, gb.field_a);
                        og.field_a = ua.a(oi.field_g, "", 32, kk.field_a, "arialish20narrow");
                        le.field_A = eh.a(gb.field_a, param0 ^ -96, var21, 255, 119);
                        le.field_A.field_K[1] = new int[]{0, 16777215, 7829367};
                        hk.field_a = am.a("", li.field_k, (byte) 72, ig.field_y, "arialish12");
                        gb.field_a = null;
                        wf.field_d.a(ue.field_c, (int[]) null);
                        hk.field_a.a(ue.field_c, (int[]) null);
                        ff.field_z = pc.a("basic", "unachieved", li.field_k, param0 ^ 33);
                        nh.a(ff.field_z, (byte) 59);
                        var4 = wf.field_d.field_t + wf.field_d.field_y;
                        c.field_a = pc.a("basic", "orbcoin", li.field_k, param0 ^ 33);
                        li.field_k = null;
                        ig.field_y = null;
                        og.field_b = new ti(var4, var4);
                        og.field_b.e();
                        c.field_a.a(0, 0, var4, var4);
                        c.field_a = null;
                        ri.field_k.a(115);
                        dh.field_B = pc.a("", "background", oi.field_g, param0 + -28);
                        qe.field_F = kl.a(oi.field_g, (byte) 127, "", "hostanims_uniq");
                        mk.field_B = kl.a(oi.field_g, (byte) 125, "", "dialog_frame");
                        pf.field_h = kl.a(oi.field_g, (byte) 125, "", "button_frame");
                        eh.field_c = kl.a(oi.field_g, (byte) 121, "", "button_frame_hi");
                        jk.field_x = new mg(ej.a((byte) -43, oi.field_g, "var_button", ""));
                        var5_int = wf.field_d.a(mc.field_a[0]);
                        var6_int = wf.field_d.a(mc.field_a[1]);
                        if (var5_int < var6_int) {
                          var5_int = var6_int;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        var6_int = wf.field_d.a(mc.field_a[2]);
                        tb.field_b = new ti[3];
                        if (var6_int <= var5_int) {
                          break L29;
                        } else {
                          var5_int = var6_int;
                          break L29;
                        }
                      }
                      var5_int += 16;
                      var7_int = 4 - -wf.field_d.field_y + wf.field_d.field_t;
                      var8_int = 0;
                      L30: while (true) {
                        if (var8_int >= 3) {
                          ri.field_k.a(param0 + 199);
                          el.b(-6491);
                          stackIn_118_0 = 0;
                          decompiledRegionSelector0 = 20;
                          break L0;
                        } else {
                          tb.field_b[var8_int] = new ti(var5_int, var7_int);
                          tb.field_b[var8_int].e();
                          dk.a(var7_int, mk.field_B, -28018, 0, 0, var5_int);
                          var9_int = 0;
                          L31: while (true) {
                            if (sb.field_h.length <= var9_int) {
                              wf.field_d.c(mc.field_a[var8_int], var5_int >> 828777697, wf.field_d.field_y + 2, 1, -1);
                              var8_int++;
                              continue L30;
                            } else {
                              if (-1 != (sb.field_h[var9_int] ^ -1)) {
                                if (7500402 > sb.field_h[var9_int]) {
                                  sb.field_h[var9_int] = 7500402;
                                  var9_int++;
                                  continue L31;
                                } else {
                                  var9_int++;
                                  continue L31;
                                }
                              } else {
                                var9_int++;
                                continue L31;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var3_int = 0;
                    L32: while (true) {
                      if (10 <= var3_int) {
                        jk.field_D.d(true);
                        rc.field_a = null;
                        be.field_n = null;
                        el.b(-6491);
                        stackIn_93_0 = 0;
                        decompiledRegionSelector0 = 18;
                        break L0;
                      } else {
                        L33: {
                          if (bd.field_u[var3_int] == null) {
                            break L33;
                          } else {
                            if (!jk.field_D.a(176400, false, rc.field_a, bd.field_u[var3_int], be.field_n)) {
                              stackIn_90_0 = 0;
                              decompiledRegionSelector0 = 17;
                              break L0;
                            } else {
                              break L33;
                            }
                          }
                        }
                        var3_int++;
                        continue L32;
                      }
                    }
                  }
                }
              } else {
                vf.a((byte) -121, 74.0f, q.field_c);
                this.b(15648);
                dg.field_d[10] = ml.a(di.field_h, "", "trans14_crowd_cheer_long").b();
                dg.field_d[11] = ml.a(di.field_h, "", "trans15_crowd_cheer_short").b();
                var3_int = 95190;
                var4 = 275371;
                dg.field_d[9] = ec.a(var4, 0, var3_int, dg.field_d[10]);
                dg.field_d[8] = ec.a(dg.field_d[10].field_l.length, 0, var4, dg.field_d[10]);
                dg.field_d[12] = ec.a(dg.field_d[10].field_l.length, 0, var3_int, dg.field_d[10]);
                di.field_h = null;
                el.b(-6491);
                stackIn_76_0 = 0;
                decompiledRegionSelector0 = 15;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "Transmogrify.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_36_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_42_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_47_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_50_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_55_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_58_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_61_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_66_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_71_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_73_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_76_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_81_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_90_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_93_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_99_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_118_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_140_0 != 0;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return stackIn_159_0 != 0;
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return stackIn_183_0 != 0;
                                                      } else {
                                                        return stackIn_189_0 != 0;
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

    final void a(int param0) {
        this.a(8, param0 ^ -10, 13, 9, 11, 0, false, 10);
        lc var2 = new lc();
        if (param0 != -9) {
            return;
        }
        try {
            var2.b(128, 9, -23780);
            uh.a((java.awt.Component) ((Object) gd.field_k), 22050, -21, lk.field_b, var2, true);
            uc.a(128, (byte) -119);
            u.field_b = 4473924;
            field_D = 128;
            pf.field_b = 255;
            this.a(true, false, false, false, (byte) 9);
            ue.field_c = new ii[3];
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "Transmogrify.F(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (qj.b((byte) 126)) {
                break L1;
              } else {
                if (kb.field_n == null) {
                  kb.field_n = l.a((byte) 12, 4);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              wd.a(param0 + -15099, false, bd.field_u[0]);
              if (param0 == 32198) {
                break L2;
              } else {
                this.c(9);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.A(" + param0 + ')');
        }
    }

    final static boolean d(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = 1;
              break L0;
            } else {
              field_E = (String) null;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "Transmogrify.C(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public final void init() {
        try {
            this.a("transmogrify", false, 12);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "Transmogrify.init()");
        }
    }

    private final void j(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == nk.field_d) {
                break L1;
              } else {
                dl.a(nk.field_d, (byte) 119);
                nk.field_d = null;
                el.b(-6491);
                break L1;
              }
            }
            L2: {
              oi.field_g = cg.a((byte) -82, 1);
              pc.field_a = cg.a((byte) -82, 2);
              di.field_h = cg.a((byte) -82, 3);
              be.field_n = cg.a((byte) -82, 4);
              ta.field_d = cg.a((byte) -82, 5);
              l.field_a = cg.a((byte) -82, 6);
              kk.field_a = cg.a((byte) -82, 7);
              of.b(22);
              if (param0 == -7632) {
                break L2;
              } else {
                Transmogrify.k(115);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.G(" + param0 + ')');
        }
    }

    final void c(int param0) {
        try {
            Transmogrify.l(0);
            qj.c((byte) -115);
            ai.a((byte) 67);
            kb.b(false);
            ub.a(-31455);
            i.c(true);
            uh.c(-21);
            cd.a(107);
            dk.a((byte) 127);
            we.a(-11509);
            gj.b(-102);
            ci.d(-120);
            ig.i((byte) -49);
            kl.a(6);
            fa.f(-121);
            qb.a((byte) -62);
            ce.a((byte) -127);
            qi.a(74);
            rj.a(false);
            sb.a();
            mh.a(0);
            gb.a(param0 + -5);
            oa.b((byte) -99);
            lk.a((byte) -124);
            bc.a(122);
            n.a(false);
            vf.a(true);
            ql.a(100);
            ne.a((byte) 68);
            aa.a(param0 ^ 3);
            sg.a((byte) -121);
            ok.a(42);
            af.a((byte) 22);
            of.a(-21068);
            td.b(0);
            cj.a((byte) 119);
            gg.c(127);
            dg.a(-1);
            ea.b((byte) 100);
            mg.a((byte) -28);
            bl.b(116);
            vg.a((byte) -60);
            nf.a((byte) -41);
            gk.a(9);
            wf.a(false);
            lc.e(-122);
            ul.b();
            ej.b(false);
            qh.f();
            oj.e(param0 ^ 111);
            ga.a(true);
            al.a(-84);
            pg.a((byte) -119);
            l.a((byte) 108);
            kg.a();
            tb.a(true);
            fj.a((byte) -101);
            el.a((byte) 99);
            qd.c(69);
            ih.a((byte) -46);
            ad.a(1);
            lb.a((byte) 103);
            il.a((byte) -24);
            da.i(param0 ^ param0);
            sf.c(true);
            sd.e((byte) 4);
            rf.r(param0 + -2394);
            ik.s(param0 ^ 107);
            wl.d((byte) 66);
            jk.m(486302657);
            ff.m(param0 + 124);
            ck.l(-123);
            hg.b((byte) -15);
            vd.a((byte) -126);
            jj.a(96);
            mj.a();
            ml.c();
            mb.a();
            hk.a((byte) 35);
            ri.a((byte) 18);
            k.a(false);
            se.c((byte) 99);
            id.a((byte) 92);
            ei.a((byte) -110);
            j.a((byte) -119);
            ld.a(102);
            sj.b((byte) -15);
            ua.a(-124);
            hj.m(param0 ^ 252);
            d.a(1);
            uc.a(0);
            eh.a((byte) 26);
            ic.a(param0 ^ 2);
            bh.a(126);
            nk.a((byte) -119);
            kk.a(false);
            ug.a((byte) 118);
            mc.a(true);
            ef.a(-106);
            nd.e(0);
            tj.d((byte) 107);
            bk.b(-123);
            pj.g(124);
            ak.a((byte) 116);
            be.c((byte) 113);
            di.b(54);
            eg.a((byte) 66);
            rh.b(true);
            ec.c(0);
            rl.b(7);
            db.a(8192);
            dj.a(48);
            gf.a();
            re.a((byte) -37);
            ch.a(807);
            ll.q(5);
            u.a((byte) 125);
            h.a(95);
            ka.a();
            hd.c((byte) -104);
            oe.a(-27273);
            e.b(62);
            f.a(false);
            qf.a(param0 ^ 3);
            uf.a(103);
            tg.a(false);
            de.a((byte) -79);
            th.a((byte) -42);
            ae.b(-116);
            bj.c((byte) -79);
            wb.b((byte) 83);
            ah.a(param0 ^ -23430);
            c.a(param0 + 18123);
            ba.d(param0 + -1);
            fd.a(127);
            wi.a(66);
            pa.a(122);
            ij.a(2);
            ue.a((byte) 18);
            lj.c(true);
            fi.h(param0 ^ 30382);
            bi.o(-31);
            mk.n(param0 + -116);
            aj.h(32);
            rd.a(param0 ^ 31);
            cc.a(true);
            rk.b(false);
            pc.c(1);
            wc.a(7);
            lf.a(66);
            vj.a((byte) 40);
            pe.a((byte) -102);
            rb.a(-53);
            ha.a(-19424);
            kf.e(123);
            fg.b((byte) 107);
            og.a(false);
            nb.a(param0 + 17);
            wd.a((byte) 126);
            si.a((byte) 106);
            nh.a(-33);
            oc.i(124);
            vc.p(93);
            rg.g((byte) -43);
            a.e((byte) -13);
            qe.i(-156630320);
            dh.l(-1);
            le.i(param0 + -4);
            ve.a((byte) -108);
            ob.k(-128);
            bf.a((byte) 16);
            me.a((byte) 122);
            v.a(17320);
            ge.n(1843);
            wh.h(43);
            fk.a((byte) 114);
            jg.a();
            pi.a((byte) -110);
            mf.a(true);
            nl.d(-114);
            hf.a((byte) 118);
            jh.c(-1);
            te.a((byte) 41);
            vl.i(2147483647);
            g.i(19224);
            vi.a(param0 + 62);
            pf.a(17205);
            dl.b(false);
            hc.d((byte) 105);
            je.a((byte) -128);
            w.b((byte) -117);
            wg.a(20738);
            o.d(0);
            am.a((byte) 5);
            ta.a(param0 + 4);
            od.b(true);
            ek.a((byte) -38);
            ni.b(param0 + 252);
            nc.c(94);
            kd.a(-73);
            gl.i(param0 ^ 2480);
            ng.a((byte) 122);
            qk.a((byte) -86);
            oh.a((byte) 104);
            gd.d(111);
            pd.b((byte) -74);
            uj.b(-1);
            fc.a(false);
            hi.a(false);
            b.d(-22826);
            ee.l(-31263);
            kh.a(0);
            wj.c(param0 ^ 483);
            bd.b(true);
            ac.a((byte) -114);
            sh.a(false);
            ia.a((byte) -4);
            oi.d(-97);
            jl.a((byte) 27);
            he.a((byte) 58);
            gh.e(58);
            ab.b(-2147483648);
            ol.a(false);
            li.h(param0 ^ 122);
            bg.b((byte) 54);
            vh.b((byte) 118);
            md.b(true);
            wk.a(-30254);
            nj.d(param0 ^ -115);
            rc.a(true);
            ca.d(param0 ^ -577295245);
            q.a(4);
            this.field_q = null;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "Transmogrify.J(" + param0 + ')');
        }
    }

    static {
        field_E = "OK";
    }
}
