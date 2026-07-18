/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class ZombieDawnMulti extends aq {
    static String field_M;
    static String[] field_K;
    private StringBuffer field_G;
    static ja[][] field_L;
    static int field_H;
    private StringBuffer field_J;
    static String field_F;
    static ja[] field_I;
    public static boolean field_E;

    final void g(int param0) {
        try {
            Object var2_ref = null;
            RuntimeException var2 = null;
            int var3_int = 0;
            int[][] var3 = null;
            Runtime var3_ref = null;
            int var4 = 0;
            nc var4_ref_nc = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object stackIn_5_0 = null;
            int stackIn_15_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_94_1 = 0;
            RuntimeException decompiledCaughtException = null;
            java.awt.Canvas stackOut_4_0 = null;
            ll stackOut_2_0 = null;
            int stackOut_14_0 = 0;
            boolean stackOut_12_0 = false;
            int stackOut_31_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_88_0 = 0;
            int stackOut_93_0 = 0;
            int stackOut_93_1 = 0;
            int stackOut_89_0 = 0;
            int stackOut_91_0 = 0;
            boolean stackOut_91_1 = false;
            var2_ref = null;
            var7 = field_E ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == rn.field_f) {
                    stackOut_4_0 = dk.field_Ib;
                    stackIn_5_0 = (Object) (Object) stackOut_4_0;
                    break L1;
                  } else {
                    stackOut_2_0 = rn.field_f;
                    stackIn_5_0 = (Object) (Object) stackOut_2_0;
                    break L1;
                  }
                }
                L2: {
                  var2_ref = stackIn_5_0;
                  if (he.field_a) {
                    if (uk.field_O) {
                      break L2;
                    } else {
                      return;
                    }
                  } else {
                    if (!vk.l((byte) -127)) {
                      if (uk.field_O) {
                        if (null == ke.field_g) {
                          break L2;
                        } else {
                          qm.a(100.0f, param0 ^ -30089, pd.field_a);
                          ra.a((java.awt.Canvas) var2_ref, -92);
                          return;
                        }
                      } else {
                        ra.a((java.awt.Canvas) var2_ref, -93);
                        return;
                      }
                    } else {
                      L3: {
                        if (null != rn.field_f) {
                          stackOut_14_0 = 1;
                          stackIn_15_0 = stackOut_14_0;
                          break L3;
                        } else {
                          stackOut_12_0 = ro.field_L;
                          stackIn_15_0 = stackOut_12_0 ? 1 : 0;
                          break L3;
                        }
                      }
                      tn.a(stackIn_15_0 != 0, param0 ^ -30144, (java.awt.Canvas) var2_ref);
                      return;
                    }
                  }
                }
                L4: {
                  if (pl.field_I == sp.field_g) {
                    tg.a((byte) -16, true, pl.field_I);
                    break L4;
                  } else {
                    L5: {
                      if (sp.field_g >= 0) {
                        stackOut_31_0 = sp.field_g;
                        stackIn_32_0 = stackOut_31_0;
                        break L5;
                      } else {
                        stackOut_29_0 = pl.field_I;
                        stackIn_32_0 = stackOut_29_0;
                        break L5;
                      }
                    }
                    L6: {
                      var3_int = stackIn_32_0;
                      if (var3_int >= 0) {
                        break L6;
                      } else {
                        var3_int = 11;
                        break L6;
                      }
                    }
                    L7: {
                      var4_ref_nc = gk.a(2, var3_int);
                      if (gk.field_b < 16) {
                        tg.a((byte) -11, false, pl.field_I);
                        if (null == var4_ref_nc) {
                          break L7;
                        } else {
                          var4_ref_nc.a(-109, gk.field_b << 4, false);
                          break L7;
                        }
                      } else {
                        tg.a((byte) -77, false, sp.field_g);
                        if (var4_ref_nc != null) {
                          var4_ref_nc.a(-128, 512 - (gk.field_b << 4), true);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    break L4;
                  }
                }
                L8: {
                  if (param0 == -30169) {
                    break L8;
                  } else {
                    field_L = null;
                    break L8;
                  }
                }
                L9: {
                  if (!n.a((byte) -50)) {
                    break L9;
                  } else {
                    oo.f(0, 0, oo.field_b, oo.field_l);
                    int discarded$3 = 0;
                    sc.a();
                    var3 = iq.a(45);
                    var4 = 0;
                    var5 = 0;
                    L10: while (true) {
                      if (~var3.length >= ~var5) {
                        if (var4 == 0) {
                          en.a(-1, 4);
                          break L9;
                        } else {
                          en.a(-1, 1);
                          break L9;
                        }
                      } else {
                        L11: {
                          if (null == var3[var5]) {
                            break L11;
                          } else {
                            if (~bd.field_g > ~var3[var5][0]) {
                              break L11;
                            } else {
                              if (~(var3[var5][2] + var3[var5][0]) > ~bd.field_g) {
                                break L11;
                              } else {
                                if (~bo.field_d > ~var3[var5][1]) {
                                  break L11;
                                } else {
                                  if (~bo.field_d < ~(var3[var5][0] + var3[var5][3])) {
                                    break L11;
                                  } else {
                                    var4 = 1;
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var5++;
                        continue L10;
                      }
                    }
                  }
                }
                L12: {
                  if (0 != er.field_i) {
                    var3_int = gk.field_b * 256 / 32;
                    if (0 < var3_int) {
                      oo.f(0, 0, oo.field_b, oo.field_l, 0, var3_int);
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  L14: {
                    if (!cq.a(15000)) {
                      break L14;
                    } else {
                      if (n.a((byte) -39)) {
                        break L14;
                      } else {
                        L15: {
                          stackOut_88_0 = 1;
                          stackIn_93_0 = stackOut_88_0;
                          stackIn_89_0 = stackOut_88_0;
                          if (rn.field_f != null) {
                            stackOut_93_0 = stackIn_93_0;
                            stackOut_93_1 = 1;
                            stackIn_94_0 = stackOut_93_0;
                            stackIn_94_1 = stackOut_93_1;
                            break L15;
                          } else {
                            stackOut_89_0 = stackIn_89_0;
                            stackIn_91_0 = stackOut_89_0;
                            stackOut_91_0 = stackIn_91_0;
                            stackOut_91_1 = ro.field_L;
                            stackIn_94_0 = stackOut_91_0;
                            stackIn_94_1 = stackOut_91_1 ? 1 : 0;
                            break L15;
                          }
                        }
                        qp.a(stackIn_94_0 != 0, stackIn_94_1 != 0);
                        break L13;
                      }
                    }
                  }
                  if (!wb.k((byte) 113)) {
                    break L13;
                  } else {
                    if (!n.a((byte) -39)) {
                      oo.f(0, 0, oo.field_b, oo.field_l);
                      int discarded$4 = -21;
                      oe.a(oi.field_h[0].field_x, oi.field_h[0].field_w, oi.field_h);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L16: {
                  if (kj.field_q < 2) {
                    break L16;
                  } else {
                    if (bf.field_m) {
                      L17: {
                        if (((ZombieDawnMulti) this).field_J == null) {
                          ((ZombieDawnMulti) this).field_J = new StringBuffer("Mem: 000000KiB");
                          ((ZombieDawnMulti) this).field_G = new StringBuffer("FPS: 00");
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (0 != wf.field_m % 50) {
                          break L18;
                        } else {
                          var3_ref = Runtime.getRuntime();
                          var4 = (int)(var3_ref.totalMemory() + -var3_ref.freeMemory()) >> 10;
                          var5 = ji.field_b;
                          var6 = 10;
                          L19: while (true) {
                            if (4 >= var6) {
                              var6 = 6;
                              L20: while (true) {
                                if (var6 <= 4) {
                                  break L18;
                                } else {
                                  ((ZombieDawnMulti) this).field_G.setCharAt(var6, (char)(48 + var5 % 10));
                                  var5 = var5 / 10;
                                  var6--;
                                  continue L20;
                                }
                              }
                            } else {
                              ((ZombieDawnMulti) this).field_J.setCharAt(var6, (char)(var4 % 10 + 48));
                              var4 = var4 / 10;
                              var6--;
                              continue L19;
                            }
                          }
                        }
                      }
                      qp.field_w.c(((ZombieDawnMulti) this).field_J.toString(), 5, 20, 16777215, 1);
                      qp.field_w.c(((ZombieDawnMulti) this).field_G.toString(), 5, 35, 16777215, 1);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
                int discarded$5 = 0;
                t.a(false, 0, (java.awt.Canvas) var2_ref);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              throw fa.a((Throwable) (Object) var2, "ZombieDawnMulti.IA(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        gd var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((ZombieDawnMulti) this).a(0, false, 9, 13, 1, 72, 10, (byte) -99);
            o.field_j = true;
            wf.field_m = 5000 * (int)Math.random();
            ll.field_k = new rp();
            df.field_H = true;
            var2 = new gd();
            var2.f(128, 15, 9);
            int discarded$2 = 1;
            int discarded$3 = 1024;
            db.a(pl.field_J, 22050, (java.awt.Component) (Object) dk.field_Ib, var2);
            ((ZombieDawnMulti) this).a(true, (byte) -27, false, true, true, false, true);
            sq.field_U[64] = 1;
            sq.field_U[79] = 14;
            sq.field_U[10] = -1;
            sq.field_U[9] = -1;
            sq.field_U[76] = 5;
            sq.field_U[66] = 1;
            sq.field_U[61] = 25;
            sq.field_U[65] = 1;
            sq.field_U[62] = -1;
            sq.field_U[77] = -1;
            sq.field_U[57] = -2;
            sq.field_U[81] = 25;
            sq.field_U[70] = 2;
            sq.field_U[71] = -1;
            sq.field_U[74] = 10;
            sq.field_U[param0] = 17;
            sq.field_U[80] = 11;
            sq.field_U[82] = 4;
            sq.field_U[69] = -1;
            sq.field_U[58] = -2;
            sq.field_U[78] = 5;
            sq.field_U[72] = 6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2_ref, "ZombieDawnMulti.JA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_113_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        var8 = field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (er.field_h != er.field_i) {
                if (~un.field_k == ~er.field_i) {
                  ub.field_yb = ub.field_yb + 1;
                  if (16 != ub.field_yb) {
                    break L1;
                  } else {
                    L2: {
                      if (bd.field_f) {
                        int discarded$13 = 0;
                        km.h();
                        break L2;
                      } else {
                        int discarded$14 = 0;
                        jg.a();
                        break L2;
                      }
                    }
                    er.field_i = cq.field_f;
                    break L1;
                  }
                } else {
                  if (cq.field_f == er.field_i) {
                    L3: {
                      if (!wc.j(124)) {
                        L4: {
                          mo.i(-109);
                          bm.a(true, 1, 127, 1);
                          if (!bd.field_f) {
                            break L4;
                          } else {
                            bd.field_f = false;
                            lp.a((byte) -59, false);
                            break L4;
                          }
                        }
                        if (lb.a((byte) 53, sp.field_g)) {
                          int discarded$15 = -9;
                          bl.a();
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    er.field_i = mn.field_m;
                    break L1;
                  } else {
                    ub.field_yb = ub.field_yb - 1;
                    if (ub.field_yb == 0) {
                      er.field_i = er.field_h;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                L5: {
                  var3_int = 0;
                  var4 = 0;
                  if (!param1) {
                    if (~sp.field_g == ~pl.field_I) {
                      if (pl.field_I == -7) {
                        L6: {
                          if (cf.field_s == null) {
                            break L6;
                          } else {
                            int discarded$16 = -50;
                            this.s();
                            break L6;
                          }
                        }
                        if (!ji.field_c) {
                          np.field_m.a((byte) 121, true);
                          break L5;
                        } else {
                          var4 = 1;
                          var3_int = 1;
                          break L5;
                        }
                      } else {
                        if (pl.field_I == -2) {
                          iq.field_f = true;
                          var3_int = 1;
                          break L5;
                        } else {
                          if (!lb.a((byte) 53, pl.field_I)) {
                            break L5;
                          } else {
                            gk.a(2, pl.field_I).a(0);
                            break L5;
                          }
                        }
                      }
                    } else {
                      gk.field_b = gk.field_b + 1;
                      if (gk.field_b == 32) {
                        int discarded$17 = -9;
                        bl.a();
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (bh.field_d.c(61) == null) {
                    break L7;
                  } else {
                    int fieldTemp$18 = er.field_k + 1;
                    er.field_k = er.field_k + 1;
                    if (fieldTemp$18 < 335) {
                      break L7;
                    } else {
                      er.field_k = 0;
                      br discarded$19 = bh.field_d.g(49);
                      break L7;
                    }
                  }
                }
                L8: {
                  if (!ji.field_c) {
                    break L8;
                  } else {
                    if (gh.field_g) {
                      break L8;
                    } else {
                      if (!vo.field_q) {
                        L9: {
                          if (!re.field_b) {
                            break L9;
                          } else {
                            if (!hh.field_b) {
                              break L9;
                            } else {
                              if (!sq.field_N) {
                                break L9;
                              } else {
                                var3_int = 0;
                                break L9;
                              }
                            }
                          }
                        }
                        L10: {
                          if (!am.a(-116)) {
                            break L10;
                          } else {
                            var3_int = 1;
                            break L10;
                          }
                        }
                        L11: {
                          wc.a(15, var3_int != 0);
                          if (cp.field_K) {
                            af.field_e.a((byte) 125, var4 != 0);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (hh.field_b) {
                            L13: {
                              if (re.field_b) {
                                int discarded$20 = 0;
                                ia.a(320, 180, var4 != 0);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            np.field_m.a((byte) 119, var4 != 0);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L14: while (true) {
                          if (!ba.c(-1)) {
                            break L8;
                          } else {
                            L15: {
                              if (!iq.field_f) {
                                break L15;
                              } else {
                                L16: {
                                  if (!re.field_b) {
                                    break L16;
                                  } else {
                                    if (!hh.field_b) {
                                      break L16;
                                    } else {
                                      int discarded$21 = 12;
                                      int discarded$22 = 15;
                                      int discarded$23 = -23936;
                                      int discarded$24 = 13;
                                      if (jm.a()) {
                                        continue L14;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                boolean discarded$25 = w.a(13, 15, 12, 18663);
                                break L15;
                              }
                            }
                            L17: {
                              if (cp.field_K) {
                                af.field_e.a(-59, sj.field_p);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (!hh.field_b) {
                              continue L14;
                            } else {
                              L18: {
                                if (!iq.field_f) {
                                  break L18;
                                } else {
                                  if (sq.field_N) {
                                    continue L14;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              np.field_m.a(-78, sj.field_p);
                              continue L14;
                            }
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                L19: {
                  if (ji.field_c) {
                    break L19;
                  } else {
                    if (am.a(-98)) {
                      L20: {
                        L21: {
                          stackOut_113_0 = 1;
                          stackIn_117_0 = stackOut_113_0;
                          stackIn_114_0 = stackOut_113_0;
                          if (hh.field_b) {
                            break L21;
                          } else {
                            stackOut_114_0 = stackIn_114_0;
                            stackIn_119_0 = stackOut_114_0;
                            stackIn_115_0 = stackOut_114_0;
                            if (!cp.field_K) {
                              stackOut_119_0 = stackIn_119_0;
                              stackOut_119_1 = 0;
                              stackIn_120_0 = stackOut_119_0;
                              stackIn_120_1 = stackOut_119_1;
                              break L20;
                            } else {
                              stackOut_115_0 = stackIn_115_0;
                              stackIn_117_0 = stackOut_115_0;
                              break L21;
                            }
                          }
                        }
                        stackOut_117_0 = stackIn_117_0;
                        stackOut_117_1 = 1;
                        stackIn_120_0 = stackOut_117_0;
                        stackIn_120_1 = stackOut_117_1;
                        break L20;
                      }
                      L22: {
                        stackOut_120_0 = stackIn_120_0;
                        stackOut_120_1 = stackIn_120_1;
                        stackIn_123_0 = stackOut_120_0;
                        stackIn_123_1 = stackOut_120_1;
                        stackIn_121_0 = stackOut_120_0;
                        stackIn_121_1 = stackOut_120_1;
                        if (ib.field_a <= 50) {
                          stackOut_123_0 = stackIn_123_0;
                          stackOut_123_1 = stackIn_123_1;
                          stackOut_123_2 = 0;
                          stackIn_124_0 = stackOut_123_0;
                          stackIn_124_1 = stackOut_123_1;
                          stackIn_124_2 = stackOut_123_2;
                          break L22;
                        } else {
                          stackOut_121_0 = stackIn_121_0;
                          stackOut_121_1 = stackIn_121_1;
                          stackOut_121_2 = 1;
                          stackIn_124_0 = stackOut_121_0;
                          stackIn_124_1 = stackOut_121_1;
                          stackIn_124_2 = stackOut_121_2;
                          break L22;
                        }
                      }
                      df.a(stackIn_124_0 != 0, stackIn_124_1 != 0, stackIn_124_2 != 0, -92, 15, 0, false, 11, 13, t.field_d, 14, true);
                      break L19;
                    } else {
                      oa.a(0);
                      L23: while (true) {
                        if (!ba.c(-1)) {
                          break L19;
                        } else {
                          if (!hh.field_b) {
                            continue L23;
                          } else {
                            L24: {
                              if (!iq.field_f) {
                                break L24;
                              } else {
                                if (!sq.field_N) {
                                  break L24;
                                } else {
                                  continue L23;
                                }
                              }
                            }
                            np.field_m.a(119, sj.field_p);
                            continue L23;
                          }
                        }
                      }
                    }
                  }
                }
                L25: {
                  if (iq.field_f) {
                    if (b.field_d <= dg.field_M) {
                      break L25;
                    } else {
                      dg.field_M = dg.field_M + 1;
                      break L25;
                    }
                  } else {
                    if (dg.field_M <= 0) {
                      break L25;
                    } else {
                      dg.field_M = dg.field_M - 1;
                      break L25;
                    }
                  }
                }
                var5 = b.field_d * b.field_d;
                var6 = -(dg.field_M * dg.field_M) + var5;
                var7 = var6 * 120 / var5 + kg.field_g;
                sk.a(false, var7);
                break L1;
              }
            }
            L26: {
              if (sp.field_g != -4) {
                break L26;
              } else {
                ma.field_a.b((byte) -35, 9);
                gh.field_g = true;
                sp.field_g = pl.field_I;
                dg.field_M = b.field_d;
                break L26;
              }
            }
            L27: {
              if (sp.field_g == -5) {
                if (mh.field_c == null) {
                  var3_int = vd.field_d;
                  bm.a(false, var3_int, 127, sp.field_g);
                  break L27;
                } else {
                  ml.a(mh.field_c.i(6), 11, -76);
                  vo.field_q = true;
                  sp.field_g = pl.field_I;
                  break L27;
                }
              } else {
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "ZombieDawnMulti.BA(" + true + ',' + param1 + ')');
        }
    }

    final void e(int param0) {
        int var2_int = 0;
        String[] var2 = null;
        int[] var2_array = null;
        so var2_ref = null;
        ae var2_ref2 = null;
        sj var2_ref3 = null;
        wf var2_ref4 = null;
        int var3 = 0;
        nc var3_ref_nc = null;
        int[] var3_ref_int__ = null;
        int var4 = 0;
        ga var4_ref_ga = null;
        int[] var4_ref_int__ = null;
        int var5 = 0;
        fc var6 = null;
        kb var7 = null;
        hk var8 = null;
        qd var9 = null;
        int var9_int = 0;
        int var10 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        L0: {
          var10 = field_E ? 1 : 0;
          ib.field_a = b.a(true);
          if (!uk.field_O) {
            break L0;
          } else {
            if (!vk.l((byte) -122)) {
              L1: {
                if (tk.field_q != dk.field_Ib) {
                  break L1;
                } else {
                  if (o.field_i) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              o.field_i = false;
              tk.field_q = dk.field_Ib;
              break L0;
            } else {
              if (!o.field_i) {
                o.field_i = true;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        if (param0 < -3) {
          L2: {
            int discarded$39 = 20;
            id.d();
            if (null == rn.field_f) {
              break L2;
            } else {
              if (!rn.field_f.field_e) {
                break L2;
              } else {
                rn.a(-110);
                int discarded$40 = -29507;
                vn.a();
                break L2;
              }
            }
          }
          L3: {
            stackOut_19_0 = this;
            stackOut_19_1 = 95;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (rn.field_f == null) {
              stackOut_21_0 = this;
              stackOut_21_1 = stackIn_21_1;
              stackOut_21_2 = 0;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = this;
              stackOut_20_1 = stackIn_20_1;
              stackOut_20_2 = 1;
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          L4: {
            ((ZombieDawnMulti) this).b((byte) stackIn_22_1, stackIn_22_2 != 0);
            if (kn.field_f) {
              int discarded$41 = -126;
              this.u();
              kn.field_f = false;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            wf.field_m = wf.field_m + 1;
            if (vk.l((byte) -123)) {
              ((ZombieDawnMulti) this).p(50);
              if (!vk.l((byte) -126)) {
                break L5;
              } else {
                L6: {
                  if (ge.p(-88)) {
                    boolean discarded$42 = this.c(false, 123);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              break L5;
            }
          }
          L7: {
            if (uk.field_O) {
              int discarded$43 = 107;
              if (n.c()) {
                if (n.a((byte) -68)) {
                  if (er.field_i != er.field_h) {
                    this.a(true, false);
                    break L7;
                  } else {
                    L8: {
                      int discarded$44 = -58;
                      var2_int = u.a();
                      if (2 != var2_int) {
                        if (var2_int != 3) {
                          if (var2_int == 4) {
                            bd.field_f = true;
                            rj.a(1, (byte) 124, ej.field_o);
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          bd.field_f = false;
                          lp.a((byte) -90, true);
                          break L8;
                        }
                      } else {
                        rn.a(-92);
                        break L8;
                      }
                    }
                    this.a(true, true);
                    break L7;
                  }
                } else {
                  if (!cq.a(15000)) {
                    if (!wb.k((byte) 115)) {
                      this.a(true, false);
                      break L7;
                    } else {
                      if (~er.field_i == ~er.field_h) {
                        L9: {
                          int discarded$45 = -85;
                          var2_int = wg.c();
                          if (var2_int == 1) {
                            rj.a(b.field_b, (byte) -72, mb.field_g);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        this.a(true, true);
                        break L7;
                      } else {
                        this.a(true, false);
                        break L7;
                      }
                    }
                  } else {
                    L10: {
                      stackOut_44_0 = this;
                      stackIn_47_0 = stackOut_44_0;
                      stackIn_45_0 = stackOut_44_0;
                      if (null == rn.field_f) {
                        stackOut_47_0 = this;
                        stackOut_47_1 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        break L10;
                      } else {
                        stackOut_45_0 = this;
                        stackIn_46_0 = stackOut_45_0;
                        stackOut_46_0 = this;
                        stackOut_46_1 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        var2_int = ((ZombieDawnMulti) this).a(stackIn_48_1 != 0, -124);
                        if (var2_int == 1) {
                          break L12;
                        } else {
                          if (2 == var2_int) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        if (null == rn.field_f) {
                          break L13;
                        } else {
                          rn.a(-96);
                          break L13;
                        }
                      }
                      if (var2_int == 2) {
                        int discarded$46 = 0;
                        cq.a((java.applet.Applet) this);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.a(true, true);
                    break L7;
                  }
                }
              } else {
                int discarded$47 = -123;
                this.r();
                break L7;
              }
            } else {
              ud.a(t.field_d, 1000);
              if (!this.c(true, 121)) {
                break L7;
              } else {
                uk.field_O = true;
                break L7;
              }
            }
          }
          L14: while (true) {
            int discarded$48 = -126;
            if (!dd.a(sq.field_U)) {
              L15: {
                cb.a(0, false);
                if (iq.field_f) {
                  id.field_D = 0;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (!gh.a(80)) {
                  break L16;
                } else {
                  L17: {
                    L18: {
                      var2_int = ((ZombieDawnMulti) this).m(10);
                      if (var2_int == 0) {
                        break L18;
                      } else {
                        if (var2_int != 1) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    of.b((byte) 119);
                    if (var2_int != 1) {
                      L19: {
                        if (!ji.field_c) {
                          break L19;
                        } else {
                          L20: {
                            ch.field_k = true;
                            bi.field_e = true;
                            if (!hh.field_b) {
                              bm.a(false, 1, 125, 1);
                              break L20;
                            } else {
                              vh.field_Fb = qd.field_V;
                              bm.a(false, 13, 127, 1);
                              break L20;
                            }
                          }
                          L21: {
                            int discarded$49 = -9;
                            bl.a();
                            var3_ref_nc = gk.a(2, pl.field_I);
                            if (var3_ref_nc != null) {
                              var3_ref_nc.a(0, false, 0);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          cp.field_K = false;
                          hh.field_b = false;
                          ji.field_c = false;
                          if (!re.field_b) {
                            break L19;
                          } else {
                            int discarded$50 = 16;
                            gk.a();
                            re.field_b = false;
                            break L19;
                          }
                        }
                      }
                      gh.field_g = false;
                      vo.field_q = false;
                      break L17;
                    } else {
                      vo.field_q = true;
                      gh.field_g = true;
                      break L17;
                    }
                  }
                  L22: {
                    var3 = 0;
                    if (var2_int == 2) {
                      var3 = 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    L24: {
                      if (ji.field_c) {
                        break L24;
                      } else {
                        if (gh.field_g) {
                          break L24;
                        } else {
                          if (!vo.field_q) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    var3 = 1;
                    break L23;
                  }
                  L25: {
                    if (gh.a(83)) {
                      break L25;
                    } else {
                      var3 = 0;
                      break L25;
                    }
                  }
                  if (var3 == 0) {
                    break L16;
                  } else {
                    ib.a(-101);
                    break L16;
                  }
                }
              }
              return;
            } else {
              if (9 == op.field_i) {
                int discarded$51 = -9;
                bl.a();
                sp.field_g = 13;
                gh.field_g = false;
                vh.field_Fb = s.field_e.f((byte) -48);
                continue L14;
              } else {
                if (op.field_i != 14) {
                  if (op.field_i == 15) {
                    L26: {
                      if (!ji.field_c) {
                        break L26;
                      } else {
                        int discarded$52 = -9;
                        bl.a();
                        int discarded$53 = 1481707568;
                        ld.j();
                        w.c(0);
                        hh.field_b = false;
                        ji.field_c = false;
                        cp.field_K = false;
                        bi.field_e = true;
                        sp.field_g = 1;
                        ch.field_k = true;
                        if (!re.field_b) {
                          break L26;
                        } else {
                          int discarded$54 = 16;
                          gk.a();
                          break L26;
                        }
                      }
                    }
                    vo.field_q = false;
                    gh.field_g = false;
                    continue L14;
                  } else {
                    L27: {
                      if (op.field_i != 10) {
                        break L27;
                      } else {
                        if (ji.field_c) {
                          int discarded$55 = -2061;
                          ck.a();
                          continue L14;
                        } else {
                          break L27;
                        }
                      }
                    }
                    L28: {
                      if (op.field_i == 57) {
                        break L28;
                      } else {
                        if (58 == op.field_i) {
                          break L28;
                        } else {
                          if (op.field_i == 59) {
                            L29: {
                              L30: {
                                if (hh.field_b) {
                                  break L30;
                                } else {
                                  if (cp.field_K) {
                                    break L30;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                              if (op.field_m.field_t != 1) {
                                L31: {
                                  int discarded$56 = -9;
                                  bl.a();
                                  if (hh.field_b) {
                                    np.field_m.a(false, 24295, false);
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                }
                                L32: {
                                  id.field_D = 0;
                                  bi.field_e = true;
                                  hh.field_b = false;
                                  cp.field_K = false;
                                  sp.field_g = -2;
                                  if (!re.field_b) {
                                    break L32;
                                  } else {
                                    int discarded$57 = 16;
                                    gk.a();
                                    break L32;
                                  }
                                }
                                qd.field_bb = false;
                                break L29;
                              } else {
                                continue L14;
                              }
                            }
                            vo.field_q = false;
                            continue L14;
                          } else {
                            if (71 != op.field_i) {
                              L33: {
                                if (op.field_i != 61) {
                                  break L33;
                                } else {
                                  if (wp.field_h != null) {
                                    break L33;
                                  } else {
                                    int discarded$58 = 0;
                                    bd.a("got MOVE without a game", (Throwable) null);
                                    continue L14;
                                  }
                                }
                              }
                              L34: {
                                if (wp.field_h != null) {
                                  if (70 != op.field_i) {
                                    if (62 == op.field_i) {
                                      var2_int = s.field_e.g(31365);
                                      var3_ref_int__ = new int[op.field_m.field_t];
                                      var4 = 0;
                                      L35: while (true) {
                                        if (op.field_m.field_t <= var4) {
                                          L36: {
                                            var4 = s.field_e.d((byte) 69);
                                            if (!re.field_b) {
                                              break L36;
                                            } else {
                                              int discarded$59 = 16;
                                              gk.a();
                                              re.field_b = false;
                                              break L36;
                                            }
                                          }
                                          wp.field_h.a(var2_int, var4, (byte) 121, var3_ref_int__);
                                          continue L14;
                                        } else {
                                          var3_ref_int__[var4] = s.field_e.d((byte) 69);
                                          op.field_m.field_v[var4] = s.field_e.d((byte) 69);
                                          op.field_m.field_o[var4] = s.field_e.d((byte) 69);
                                          var4++;
                                          continue L35;
                                        }
                                      }
                                    } else {
                                      if (61 != op.field_i) {
                                        if (op.field_i != 72) {
                                          if (op.field_i == 73) {
                                            var2_ref3 = dm.a((byte) 74, s.field_e);
                                            wp.field_h.a(false, (ae) (Object) var2_ref3);
                                            continue L14;
                                          } else {
                                            if (op.field_i != 79) {
                                              if (op.field_i == 81) {
                                                wp.field_h.a(false, (ae) (Object) li.a((byte) -119, s.field_e));
                                                continue L14;
                                              } else {
                                                if (op.field_i != 78) {
                                                  if (op.field_i != 74) {
                                                    if (op.field_i != 77) {
                                                      if (op.field_i != 76) {
                                                        if (op.field_i != 80) {
                                                          if (82 == op.field_i) {
                                                            wp.field_h.a(false, hc.a(0, s.field_e));
                                                            continue L14;
                                                          } else {
                                                            if (65 != op.field_i) {
                                                              if (op.field_i == 64) {
                                                                var2_int = s.field_e.g(31365);
                                                                System.out.println(" players resigned: " + Integer.toBinaryString(var2_int));
                                                                op.field_m.field_F = var2_int;
                                                                continue L14;
                                                              } else {
                                                                if (op.field_i == 66) {
                                                                  int discarded$60 = s.field_e.g(31365);
                                                                  continue L14;
                                                                } else {
                                                                  break L34;
                                                                }
                                                              }
                                                            } else {
                                                              op.field_m.field_j = s.field_e.g(31365);
                                                              if (null == np.field_m) {
                                                                continue L14;
                                                              } else {
                                                                ab.field_h.f(125);
                                                                continue L14;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          int discarded$61 = -128;
                                                          var2_ref4 = wq.a(s.field_e);
                                                          if (var2_ref4.field_q == 255) {
                                                            continue L14;
                                                          } else {
                                                            wp.field_h.a(false, (ae) (Object) var2_ref4);
                                                            continue L14;
                                                          }
                                                        }
                                                      } else {
                                                        wp.field_h.a(false, gn.a(-1, s.field_e));
                                                        continue L14;
                                                      }
                                                    } else {
                                                      int discarded$62 = -114;
                                                      wp.field_h.a(false, qk.a(s.field_e));
                                                      continue L14;
                                                    }
                                                  } else {
                                                    int discarded$63 = 1;
                                                    wp.field_h.a(false, qm.a(s.field_e));
                                                    continue L14;
                                                  }
                                                } else {
                                                  int discarded$64 = 14;
                                                  wp.field_h.a(false, (ae) (Object) oa.a(s.field_e));
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              wp.field_h.a(false, nk.a(20399, s.field_e));
                                              continue L14;
                                            }
                                          }
                                        } else {
                                          var2_ref2 = nq.a(22272, s.field_e);
                                          wp.field_h.a(false, var2_ref2);
                                          continue L14;
                                        }
                                      } else {
                                        var2_ref = kn.a((byte) 127, s.field_e);
                                        wp.field_h.a(false, (ae) (Object) var2_ref);
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    wp.field_h.field_W = s.field_e.c((byte) -18);
                                    wp.field_h.field_t = bl.a((byte) 107);
                                    continue L14;
                                  }
                                } else {
                                  break L34;
                                }
                              }
                              ((ZombieDawnMulti) this).j(-13);
                              continue L14;
                            } else {
                              var2_array = da.a(8);
                              var3_ref_int__ = var2_array;
                              var4_ref_ga = s.field_e;
                              var5 = 0;
                              L37: while (true) {
                                if (var5 >= 8) {
                                  var3_ref_int__ = var2_array;
                                  var4_ref_int__ = k.field_n;
                                  var5 = 0;
                                  L38: while (true) {
                                    if (var5 >= 8) {
                                      var3 = 0;
                                      L39: while (true) {
                                        if (256 <= var3) {
                                          continue L14;
                                        } else {
                                          L40: {
                                            if (fq.a(var3, 127, var2_array)) {
                                              bh.field_d.a((br) (Object) new er(var3), false);
                                              var4_ref_int__ = fc.field_m;
                                              var5 = var3;
                                              var4_ref_int__[var5 >> 5] = cr.b(var4_ref_int__[var5 >> 5], 1 << tq.b(31, var5));
                                              var4_ref_int__ = k.field_n;
                                              var5 = var3;
                                              var4_ref_int__[var5 >> 5] = cr.b(var4_ref_int__[var5 >> 5], 1 << tq.b(31, var5));
                                              break L40;
                                            } else {
                                              break L40;
                                            }
                                          }
                                          var3++;
                                          continue L39;
                                        }
                                      }
                                    } else {
                                      var3_ref_int__[var5] = tq.b(var3_ref_int__[var5], ~var4_ref_int__[var5]);
                                      var5++;
                                      continue L38;
                                    }
                                  }
                                } else {
                                  var3_ref_int__[var5] = ((k) (Object) var4_ref_ga).i(-1478490344);
                                  var5++;
                                  continue L37;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    int discarded$65 = -9;
                    bl.a();
                    int discarded$66 = s.field_e.g(31365);
                    var2 = new String[s.field_e.g(31365)];
                    var3 = -2;
                    var3 = s.field_e.g(31365);
                    var4 = 0;
                    L41: while (true) {
                      if (var4 >= var2.length) {
                        L42: {
                          if (var3 < 254) {
                            break L42;
                          } else {
                            var3 = -2;
                            break L42;
                          }
                        }
                        L43: {
                          var4 = s.field_e.g(31365);
                          var5 = 0;
                          if (var2.length > 2) {
                            var5 = 2;
                            break L43;
                          } else {
                            if (var2.length <= 1) {
                              break L43;
                            } else {
                              var5 = 1;
                              break L43;
                            }
                          }
                        }
                        L44: {
                          if (var5 == 0) {
                            var4 = 0;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        L45: {
                          var6 = wh.a(bn.field_d.a((byte) -85, var4), -86);
                          var7 = new kb(var2, var6);
                          var8 = new hk();
                          var7.a(2, (k) (Object) s.field_e);
                          var7.field_r = var4;
                          int discarded$67 = s.field_e.g(31365);
                          if (op.field_i != 57) {
                            break L45;
                          } else {
                            var9_int = 0;
                            L46: while (true) {
                              if (var9_int >= 5) {
                                var9_int = 0;
                                L47: while (true) {
                                  if (var9_int >= 5) {
                                    var9_int = 0;
                                    L48: while (true) {
                                      if (var9_int >= 3) {
                                        var8.a(7054, (k) (Object) s.field_e);
                                        break L45;
                                      } else {
                                        int dupTemp$68 = s.field_e.g(31365);
                                        ll.field_k.field_s[var9_int] = dupTemp$68;
                                        var8.field_c[var9_int] = dupTemp$68;
                                        var9_int++;
                                        continue L48;
                                      }
                                    }
                                  } else {
                                    int dupTemp$69 = s.field_e.g(31365);
                                    ll.field_k.field_g[var9_int] = dupTemp$69;
                                    var8.field_f[var9_int] = dupTemp$69;
                                    var9_int++;
                                    continue L47;
                                  }
                                }
                              } else {
                                int dupTemp$70 = s.field_e.g(31365);
                                ll.field_k.field_m[var9_int] = dupTemp$70;
                                var8.field_d[var9_int] = dupTemp$70;
                                var9_int++;
                                continue L46;
                              }
                            }
                          }
                        }
                        L49: {
                          var9 = new qd(var7, var8, var3);
                          if (57 == op.field_i) {
                            hh.field_b = true;
                            wp.field_h = var9;
                            np.field_m = var9;
                            int discarded$71 = 68;
                            wg.b();
                            re.field_b = true;
                            break L49;
                          } else {
                            af.field_e = var9;
                            cp.field_K = true;
                            wp.field_h = var9;
                            break L49;
                          }
                        }
                        sp.field_g = -7;
                        vo.field_q = false;
                        continue L14;
                      } else {
                        var2[var4] = s.field_e.c(0);
                        var4++;
                        continue L41;
                      }
                    }
                  }
                } else {
                  int discarded$72 = -9;
                  bl.a();
                  int discarded$73 = -11834;
                  int discarded$74 = 1024;
                  hl.a(eg.field_E, (byte) 75, k.f(23000), 150, pk.b(), cb.field_j.length, cb.b(-122, 4), en.a((byte) -110), cb.b(-123, 500));
                  tg.field_a[0] = (byte) 16;
                  int discarded$75 = -55;
                  int discarded$76 = 28579;
                  int discarded$77 = 1;
                  ma.a(aq.k(), rn.b());
                  gh.field_g = false;
                  sp.field_g = -2;
                  ji.field_c = true;
                  continue L14;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void t(int param0) {
        try {
            field_F = null;
            field_L = null;
            int var1_int = 127 % ((param0 - -76) / 45);
            field_I = null;
            field_K = null;
            field_M = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ZombieDawnMulti.EA(" + param0 + ')');
        }
    }

    private final void u() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (qc.field_s != null) {
                int discarded$3 = -65;
                h.a(qc.field_s);
                int discarded$4 = -6445;
                so.d();
                qc.field_s = null;
                int discarded$5 = 26673;
                o.d();
                break L1;
              } else {
                break L1;
              }
            }
            ii.field_a = u.a(5, 2);
            cg.field_n = u.a(5, 3);
            ki.field_m = u.a(5, 8);
            pf.field_b = u.a(5, 4);
            rn.field_e = u.a(5, 5);
            de.field_e = u.a(5, 6);
            df.field_M = u.a(5, 7);
            ha.field_g = u.a(5, 11);
            il.field_n = u.a(5, 12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ZombieDawnMulti.LA(" + -126 + ')');
        }
    }

    private final void s() {
        ae var2 = null;
        RuntimeException var2_ref = null;
        ae var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_E ? 1 : 0;
        try {
          L0: {
            cf.field_s.b(-198);
            if (bi.field_e) {
              return;
            } else {
              op.field_m.field_H = -50 + cf.field_s.field_m.field_H;
              var2 = (ae) (Object) cf.field_s.field_q.c(71);
              L1: while (true) {
                if (var2 == null) {
                  break L0;
                } else {
                  var3 = (ae) (Object) cf.field_s.field_q.b(6);
                  var2.a((byte) -123);
                  var2.field_f = var2.field_f + 50;
                  wp.field_h.a(false, var2);
                  var2 = var3;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2_ref, "ZombieDawnMulti.GA(" + -50 + ')');
        }
    }

    final static ca a(int param0, byte param1, ul param2, ul param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ca stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ca stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            int discarded$7 = -42;
            if (ud.a(param0, param3, param4)) {
              if (param1 == -19) {
                stackOut_6_0 = hc.a(true, param2.a(param0, true, param4));
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (ca) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ca) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ZombieDawnMulti.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_7_0;
    }

    private final boolean c(boolean param0, int param1) {
        int var3_int = 0;
        ja[][] var3 = null;
        ri[] var3_array = null;
        ja[][] var4_ref_ja____ = null;
        int var4 = 0;
        String[][] var5 = null;
        ri var5_ref = null;
        int var6 = 0;
        ja[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        ja[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        ja[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        ja[] stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        double stackIn_103_3 = 0.0;
        ja[] stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        ja[] stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        double stackOut_102_3 = 0.0;
        ja[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        ja[] stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        double stackOut_101_3 = 0.0;
        var6 = field_E ? 1 : 0;
        int discarded$40 = -6445;
        so.d();
        if (pf.field_b != null) {
          L0: {
            if (!al.field_eb.a((byte) -110)) {
              break L0;
            } else {
              if (al.field_eb.a(false, "basic")) {
                L1: {
                  if (!al.field_eb.a((byte) -124)) {
                    break L1;
                  } else {
                    if (!al.field_eb.a(false, "lobby")) {
                      break L1;
                    } else {
                      L2: {
                        if (!he.field_f.a((byte) -108)) {
                          break L2;
                        } else {
                          if (he.field_f.a(false, "lobby")) {
                            L3: {
                              if (!al.field_eb.a((byte) -120)) {
                                break L3;
                              } else {
                                if (al.field_eb.a(false, "arialish12")) {
                                  L4: {
                                    if (!he.field_f.a((byte) -128)) {
                                      break L4;
                                    } else {
                                      if (he.field_f.a(false, "arialish12")) {
                                        L5: {
                                          if (!pf.field_b.a((byte) -116)) {
                                            break L5;
                                          } else {
                                            if (!pf.field_b.a(0)) {
                                              break L5;
                                            } else {
                                              L6: {
                                                if (!ki.field_m.a((byte) -122)) {
                                                  break L6;
                                                } else {
                                                  if (!ki.field_m.a(0)) {
                                                    break L6;
                                                  } else {
                                                    L7: {
                                                      if (!rn.field_e.a((byte) -114)) {
                                                        break L7;
                                                      } else {
                                                        if (!rn.field_e.a(0)) {
                                                          break L7;
                                                        } else {
                                                          L8: {
                                                            if (!de.field_e.a((byte) -118)) {
                                                              break L8;
                                                            } else {
                                                              if (de.field_e.a(0)) {
                                                                L9: {
                                                                  if (!df.field_M.a((byte) -126)) {
                                                                    break L9;
                                                                  } else {
                                                                    if (df.field_M.a(0)) {
                                                                      L10: {
                                                                        if (!ii.field_a.a((byte) -115)) {
                                                                          break L10;
                                                                        } else {
                                                                          if (ii.field_a.a(0)) {
                                                                            L11: {
                                                                              if (!cg.field_n.a((byte) -124)) {
                                                                                break L11;
                                                                              } else {
                                                                                if (!cg.field_n.a(0)) {
                                                                                  break L11;
                                                                                } else {
                                                                                  L12: {
                                                                                    if (!ha.field_g.a((byte) -111)) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      if (!ha.field_g.a(0)) {
                                                                                        break L12;
                                                                                      } else {
                                                                                        L13: {
                                                                                          if (!il.field_n.a((byte) -121)) {
                                                                                            break L13;
                                                                                          } else {
                                                                                            if (!il.field_n.a(0)) {
                                                                                              break L13;
                                                                                            } else {
                                                                                              qm.a(65.0f, 80, dn.field_b);
                                                                                              if (param0) {
                                                                                                ub.m(-121);
                                                                                                ((ZombieDawnMulti) this).g(-30169);
                                                                                                gd.field_Q = new me(pf.field_b, rn.field_e);
                                                                                                ei.field_a[68] = jc.a(pf.field_b, "", "zombie_dawn_menu_button").a();
                                                                                                ei.field_a[69] = jc.a(pf.field_b, "", "zombie_dawn_menu_screen_mouseover").a();
                                                                                                ei.field_a[0] = jc.a(pf.field_b, "", "zombie_detonate").a();
                                                                                                ei.field_a[44] = jc.a(pf.field_b, "", "zombie_dawn_gunfire").a();
                                                                                                ei.field_a[45] = jc.a(pf.field_b, "", "zombie_dawn_shotgun_fire").a();
                                                                                                ei.field_a[8] = jc.a(pf.field_b, "", "zombie_dawn_machinegun_fire").a();
                                                                                                ei.field_a[20] = jc.a(pf.field_b, "", "zombie_dawn_click_mouse").a();
                                                                                                ei.field_a[30] = jc.a(pf.field_b, "", "zombie_dawn_thump_1").a();
                                                                                                ei.field_a[31] = jc.a(pf.field_b, "", "zombie_dawn_thump_2").a();
                                                                                                ei.field_a[32] = jc.a(pf.field_b, "", "zombie_dawn_swipe_1").a();
                                                                                                ei.field_a[33] = jc.a(pf.field_b, "", "zombie_dawn_swipe_2").a();
                                                                                                ei.field_a[34] = jc.a(pf.field_b, "", "zombie_dawn_slap_1").a();
                                                                                                ei.field_a[47] = jc.a(pf.field_b, "", "zombie_dawn_second_tick").a();
                                                                                                ei.field_a[53] = jc.a(pf.field_b, "", "zombie_dawn_reactor_ambience").a();
                                                                                                ei.field_a[54] = jc.a(pf.field_b, "", "zombie_dawn_score_10").a();
                                                                                                ei.field_a[55] = jc.a(pf.field_b, "", "zombie_dawn_score_20").a();
                                                                                                ei.field_a[56] = jc.a(pf.field_b, "", "zombie_dawn_score_30").a();
                                                                                                ei.field_a[57] = jc.a(pf.field_b, "", "zombie_dawn_countup_victims").a();
                                                                                                ei.field_a[58] = jc.a(pf.field_b, "", "zombie_dawn_countup_score").a();
                                                                                                ei.field_a[59] = jc.a(pf.field_b, "", "zombie_dawn_click_mouse_wrong").a();
                                                                                                ei.field_a[63] = jc.a(pf.field_b, "", "zombie_dawn_gun_empty").a();
                                                                                                ei.field_a[12] = jc.a(pf.field_b, "", "zombie_dawn_squelch_3").a();
                                                                                                ei.field_a[66] = jc.a(pf.field_b, "", "zombie_dawn_squelch_2_AND_3").a();
                                                                                                ei.field_a[64] = jc.a(pf.field_b, "", "zombie_dawn_smash_wood_and_glass_1").a();
                                                                                                ei.field_a[65] = jc.a(pf.field_b, "", "zombie_dawn_smash_wood_and_glass_2").a();
                                                                                                ei.field_a[67] = jc.a(pf.field_b, "", "zombie_dawn_use_powerup").a();
                                                                                                ei.field_a[36] = jc.a(pf.field_b, "", "zombie_dawn_bounce").a();
                                                                                                ei.field_a[35] = jc.a(pf.field_b, "", "zd_multi_hammer").a();
                                                                                                ei.field_a[81] = jc.a(pf.field_b, "", "zd_multi_barrier").a();
                                                                                                ei.field_a[82] = jc.a(pf.field_b, "", "zd_multi_bonefall").a();
                                                                                                ei.field_a[83] = jc.a(pf.field_b, "", "zd_multi_breach").a();
                                                                                                ei.field_a[84] = jc.a(pf.field_b, "", "zd_multi_charm").a();
                                                                                                ei.field_a[85] = jc.a(pf.field_b, "", "zd_multi_fireball").a();
                                                                                                ei.field_a[86] = jc.a(pf.field_b, "", "zd_multi_haze").a();
                                                                                                ei.field_a[87] = jc.a(pf.field_b, "", "zd_multi_place_ability").a();
                                                                                                ei.field_a[88] = jc.a(pf.field_b, "", "zd_multi_portal_ambience").a();
                                                                                                ei.field_a[89] = jc.a(pf.field_b, "", "zd_multi_quake").a();
                                                                                                ei.field_a[90] = jc.a(pf.field_b, "", "zd_multi_select_ability").a();
                                                                                                ei.field_a[91] = jc.a(pf.field_b, "", "zd_multi_select_tree").a();
                                                                                                pf.field_b = null;
                                                                                                int discarded$41 = 26673;
                                                                                                o.d();
                                                                                                return false;
                                                                                              } else {
                                                                                                return false;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        qm.a(80.0f, 80, jj.a(s.field_h, (byte) 113, il.field_n, pd.field_a));
                                                                                        return false;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  qm.a(75.0f, 80, ki.a(pd.field_a, "", ha.field_g, (byte) 76, s.field_h));
                                                                                  return false;
                                                                                }
                                                                              }
                                                                            }
                                                                            qm.a(60.0f, 80, ki.a(sm.field_b, "", cg.field_n, (byte) 76, bc.field_b));
                                                                            return false;
                                                                          } else {
                                                                            break L10;
                                                                          }
                                                                        }
                                                                      }
                                                                      qm.a(50.0f, 80, ki.a(bc.field_a, "", ii.field_a, (byte) 76, ei.field_e));
                                                                      return false;
                                                                    } else {
                                                                      break L9;
                                                                    }
                                                                  }
                                                                }
                                                                qm.a(40.0f, 80, ki.a(m.field_A, "", df.field_M, (byte) 76, i.field_d));
                                                                return false;
                                                              } else {
                                                                break L8;
                                                              }
                                                            }
                                                          }
                                                          qm.a(30.0f, 80, mo.a(bk.field_k, 0, -3, bb.field_o, de.field_e));
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    qm.a(20.0f, 80, ki.a(ko.field_i, "", rn.field_e, (byte) 76, hg.field_tb));
                                                    return false;
                                                  }
                                                }
                                              }
                                              qm.a(15.0f, 80, ki.a(sf.field_f, "", ki.field_m, (byte) 76, vf.field_c));
                                              return false;
                                            }
                                          }
                                        }
                                        qm.a(10.0f, 80, ki.a(ko.field_i, "", pf.field_b, (byte) 76, hg.field_tb));
                                        return false;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  qm.a(5.0f, 80, ki.a(bc.field_a, "arialish12", he.field_f, (byte) 76, ei.field_e));
                                  return false;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            qm.a(4.0f, 80, ki.a(bc.field_a, "arialish12", al.field_eb, (byte) 76, ei.field_e));
                            return false;
                          } else {
                            break L2;
                          }
                        }
                      }
                      qm.a(17.0f, 80, ki.a(sm.field_b, "lobby", he.field_f, (byte) 76, bc.field_b));
                      return false;
                    }
                  }
                }
                qm.a(3.0f, 80, ki.a(bc.field_a, "basic", al.field_eb, (byte) 76, ei.field_e));
                return false;
              } else {
                break L0;
              }
            }
          }
          qm.a(3.0f, 80, ki.a(bc.field_a, "basic", al.field_eb, (byte) 76, ei.field_e));
          return false;
        } else {
          if (rn.field_e == null) {
            if (null != df.field_M) {
              qm.a(75.0f, 80, me.field_e);
              ((ZombieDawnMulti) this).g(-30169);
              hl.field_d[0] = ug.a(df.field_M, "", "ZD_multi_TITLESCREEn");
              hl.field_d[10] = ug.a(df.field_M, "", "ZD_multi_laboratory");
              hl.field_d[12] = ug.a(df.field_M, "", "ZD_multi_PANIC_LOOP");
              hl.field_d[11] = ug.a(df.field_M, "", "ZD_multi_GAME_FINISH");
              hl.field_d[13] = ug.a(df.field_M, "", "ZD_multi_GAME_WIN");
              hl.field_d[14] = ug.a(df.field_M, "", "ZD_multi_GAME_LOSE");
              hl.field_d[1] = ug.a(df.field_M, "", "zombie dawn mall");
              hl.field_d[2] = ug.a(df.field_M, "", "zombie dawn powerplant");
              hl.field_d[3] = ug.a(df.field_M, "", "zombie dawn precinct");
              hl.field_d[4] = ug.a(df.field_M, "", "zombie dawn white house");
              hl.field_d[9] = ug.a(df.field_M, "", "zombie dawn instructions loop");
              df.field_M = null;
              int discarded$42 = 26673;
              o.d();
              return false;
            } else {
              if (param1 > 75) {
                if (null != de.field_e) {
                  qm.a(77.0f, 80, me.field_e);
                  ((ZombieDawnMulti) this).g(-30169);
                  var3_int = 0;
                  L14: while (true) {
                    if (var3_int >= 15) {
                      wd.field_L.d(125);
                      de.field_e = null;
                      gd.field_Q = null;
                      int discarded$43 = 26673;
                      o.d();
                      return false;
                    } else {
                      L15: {
                        if (hl.field_d[var3_int] == null) {
                          break L15;
                        } else {
                          if (wd.field_L.a(-10783, gd.field_Q, 176400, hl.field_d[var3_int], de.field_e)) {
                            break L15;
                          } else {
                            int discarded$44 = 26673;
                            o.d();
                            return false;
                          }
                        }
                      }
                      var3_int++;
                      continue L14;
                    }
                  }
                } else {
                  if (null == ki.field_m) {
                    L16: {
                      if (null == al.field_eb) {
                        break L16;
                      } else {
                        if (null == ii.field_a) {
                          break L16;
                        } else {
                          L17: {
                            qm.a(85.0f, 80, bn.field_c);
                            ((ZombieDawnMulti) this).g(-30169);
                            qp.field_w = pj.a(al.field_eb, 4, he.field_f, "", "arialish12");
                            if (!he.field_a) {
                              ri[] discarded$45 = da.a("locked", al.field_eb, (byte) 19, "basic");
                              wl.field_l = da.a("unachieved", al.field_eb, (byte) 19, "basic")[0];
                              of.field_k = fl.a("basic", "orbcoin", al.field_eb, 11091);
                              fj.a(100, of.field_k);
                              var3 = new ja[2][];
                              var3[0] = pb.a("", ii.field_a, -256, "levelstyle_iconssmall");
                              var3[1] = null;
                              var4_ref_ja____ = new ja[1][];
                              var4_ref_ja____[0] = pb.a("", ii.field_a, -256, "levelstyle_iconslarge");
                              var5 = tj.field_e;
                              ub.a(var5, he.field_f, true, (String[][]) null, field_K, al.field_eb, 4, da.field_b, il.field_n, 1, cb.field_j, eg.field_E, true, var3, var4_ref_ja____);
                              bo.field_e = true;
                              lp.a(200, -82);
                              int discarded$46 = 23;
                              ua.a(he.field_f, al.field_eb);
                              bo.a(16777215, 0, 0, uc.field_b, 0, (java.applet.Applet) this);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          he.field_f = null;
                          al.field_eb = null;
                          int discarded$47 = 26673;
                          o.d();
                          qm.a(90.0f, 80, bn.field_c);
                          ((ZombieDawnMulti) this).g(-30169);
                          ah.field_e = ap.a(ii.field_a, cg.field_n, "", 4, "font");
                          ff.field_r = vo.a((byte) -46, "", "font_title", cg.field_n, ii.field_a);
                          pb.field_e = pj.a(ii.field_a, 4, cg.field_n, "font_medium", "");
                          int discarded$48 = 0;
                          lf.a(pb.field_e);
                          vc.a(true);
                          a.field_a = new ri[7][];
                          a.field_a[0] = da.a("cursor_grab", ii.field_a, (byte) 19, "");
                          a.field_a[1] = da.a("cursor_point", ii.field_a, (byte) 19, "");
                          a.field_a[6] = da.a("cursor_point_forbidden", ii.field_a, (byte) 19, "");
                          a.field_a[2] = da.a("cursor_reticule", ii.field_a, (byte) 19, "");
                          a.field_a[3] = da.a("cursor_poweringup", ii.field_a, (byte) 19, "");
                          a.field_a[5] = da.a("cursor_targeting", ii.field_a, (byte) 19, "");
                          a.field_a[4] = da.a("cursor_idle", ii.field_a, (byte) 19, "");
                          wd.field_P = wq.a(-22, "", ii.field_a, "intro_1");
                          eq.field_c = wq.a(-127, "", ii.field_a, "intro_2");
                          bl.field_g = wq.a(88, "", ii.field_a, "intro_3");
                          vh.field_Lb = wq.a(47, "", ii.field_a, "menu_pipe1");
                          dm.field_Wb = wq.a(-122, "", ii.field_a, "menu_pipe2");
                          cc.field_c = wq.a(-126, "", ii.field_a, "menu_pipebox");
                          ri discarded$49 = wq.a(-121, "", ii.field_a, "menu_pipebox2");
                          no.field_Jb = wq.a(97, "", ii.field_a, "menu_title");
                          dd.field_g = wq.a(-118, "", ii.field_a, "menu_title_blank");
                          ao.field_b = new ja[sm.field_g.length];
                          var3_int = 0;
                          L18: while (true) {
                            if (~ao.field_b.length >= ~var3_int) {
                              L19: {
                                vm.field_lb = fl.a("", "lobby_game_logo", ii.field_a, 11091);
                                ip.field_e = wq.a(-117, "", ii.field_a, "help_arrow");
                                jl.field_u = wq.a(-119, "", ii.field_a, "info_help_button");
                                oi.field_k = ip.field_e.d();
                                oi.field_k.a();
                                lh.field_m = ip.field_e.d();
                                lh.field_m.c();
                                uo.field_n = ip.field_e.d();
                                uo.field_n.b();
                                jq.field_c = wq.a(-116, "", ii.field_a, "battery_small_empty");
                                dj.field_p = wq.a(-117, "", ii.field_a, "battery_big_empty");
                                ri discarded$50 = wq.a(-121, "", ii.field_a, "battery_big_full");
                                ol.field_n = fl.a("", "vat", ii.field_a, 11091);
                                ri discarded$51 = wq.a(70, "", ii.field_a, "vat_outline");
                                em.field_X = wq.a(47, "", ii.field_a, "lab_pipe");
                                nm.field_w = fl.a("", "lab_box_1", ii.field_a, 11091);
                                ri discarded$52 = wq.a(-122, "", ii.field_a, "lab_box_2");
                                ri discarded$53 = wq.a(-125, "", ii.field_a, "lab_box_3");
                                ri discarded$54 = wq.a(-123, "", ii.field_a, "lab_box_1_outline");
                                ri discarded$55 = wq.a(15, "", ii.field_a, "lab_box_2_outline");
                                ri discarded$56 = wq.a(-118, "", ii.field_a, "lab_box_3_outline");
                                fg.field_m = fl.a("", "lab_tree_frame_bw", ii.field_a, 11091);
                                v.field_e = wq.a(15, "", ii.field_a, "lab_menu_bg_center");
                                pi.field_f = wq.a(95, "", ii.field_a, "lab_menu_bg_bottom");
                                ri discarded$57 = wq.a(4, "", ii.field_a, "lab_tree_bg");
                                lm.field_eb = fl.a("", "slider", ii.field_a, 11091);
                                s.field_c = wq.a(14, "", ii.field_a, "research_trait_slot");
                                pf.field_a = wq.a(-119, "", ii.field_a, "research_powerup_modifier_slot");
                                el.field_E = wq.a(-120, "", ii.field_a, "forbidden_big");
                                nj.field_d = wq.a(-124, "", ii.field_a, "scrollbar_arrow_over");
                                fq.field_k = fl.a("", "scrollbar_arrow_off", ii.field_a, 11091);
                                df.field_Q = pb.a("", ii.field_a, -256, "scrollbar_block");
                                wc.field_M = pb.a("", ii.field_a, -256, "scrollbar_background");
                                kj.field_m = wq.a(102, "", ii.field_a, "scrollbar_bg");
                                ri discarded$58 = wq.a(-127, "", ii.field_a, "scrollbar_bar_h");
                                ri discarded$59 = wq.a(79, "", ii.field_a, "scrollbar_bar_v");
                                vl.field_f = nj.field_d.d();
                                ek.field_J = fq.field_k.c();
                                hp.field_t = kj.field_m.d();
                                vl.field_f.b();
                                ek.field_J.g();
                                hp.field_t.b();
                                qb.field_h = wq.a(-126, "", ii.field_a, "results_tube");
                                na.field_I = wq.a(0, "", ii.field_a, "crate_box");
                                qj.field_m = wq.a(-42, "", ii.field_a, "curve_tube");
                                wk.field_J = wq.a(24, "", ii.field_a, "curve_tube_empty");
                                hn.field_i = wq.a(93, "", ii.field_a, "empty_jar");
                                rg.field_C = wq.a(-124, "", ii.field_a, "main_tube");
                                ul.field_f = wq.a(-122, "", ii.field_a, "plug_01");
                                rq.field_l = wq.a(35, "", ii.field_a, "plug_02");
                                pq.field_o = wq.a(56, "", ii.field_a, "vert_tube");
                                tm.field_f = wq.a(109, "", ii.field_a, "vert_tube_empty");
                                pm.field_N = wq.a(31, "", ii.field_a, "curve_tube_mask");
                                w.field_z = wq.a(116, "", ii.field_a, "vert_tube_mask");
                                ri discarded$60 = wq.a(27, "", ii.field_a, "stars");
                                pp.field_q = da.a("engine_icons", ii.field_a, (byte) 19, "");
                                jq.field_e = wq.a(-126, "", ii.field_a, "pipe_frame");
                                jq.field_e.e();
                                bb.field_n = new ja(48, 48);
                                na.field_H[0] = da.a("portal2", ii.field_a, (byte) 19, "");
                                ud.field_Q = wq.a(-116, "", ii.field_a, "portal_foo_mask");
                                cp.field_X = pb.a("", ii.field_a, -256, "blood");
                                wa.field_b = pb.a("", ii.field_a, -256, "powerups");
                                td.field_c = pb.a("", ii.field_a, -256, "explosion");
                                od.field_Fb = pb.a("", ii.field_a, -256, "miasma");
                                no.field_Hb[0] = pb.a("", ii.field_a, -256, "character_zombie0");
                                no.field_Hb[1] = pb.a("", ii.field_a, -256, "character_zombie1");
                                wq.field_c[0] = pb.a("", ii.field_a, -256, "character_human0");
                                wq.field_c[1] = pb.a("", ii.field_a, -256, "character_human1");
                                wq.field_c[2] = pb.a("", ii.field_a, -256, "character_human2");
                                wq.field_c[3] = pb.a("", ii.field_a, -256, "character_human3");
                                wq.field_c[4] = pb.a("", ii.field_a, -256, "character_human4");
                                wq.field_c[5] = pb.a("", ii.field_a, -256, "character_human5");
                                wq.field_c[6] = pb.a("", ii.field_a, -256, "character_human6");
                                wq.field_c[7] = pb.a("", ii.field_a, -256, "character_human7");
                                wq.field_c[8] = pb.a("", ii.field_a, -256, "character_human8");
                                wq.field_c[9] = pb.a("", ii.field_a, -256, "character_human9");
                                wq.field_c[10] = pb.a("", ii.field_a, -256, "character_human10");
                                wq.field_c[11] = pb.a("", ii.field_a, -256, "character_human11");
                                wq.field_c[12] = pb.a("", ii.field_a, -256, "character_human12");
                                wq.field_c[13] = pb.a("", ii.field_a, -256, "character_human13");
                                wq.field_c[14] = pb.a("", ii.field_a, -256, "character_human14");
                                wq.field_c[15] = pb.a("", ii.field_a, -256, "character_human15");
                                wq.field_c[16] = pb.a("", ii.field_a, -256, "character_human16");
                                wq.field_c[17] = pb.a("", ii.field_a, -256, "character_human17");
                                wq.field_c[18] = pb.a("", ii.field_a, -256, "character_human18");
                                wq.field_c[19] = pb.a("", ii.field_a, -256, "character_human19");
                                wq.field_c[20] = pb.a("", ii.field_a, -256, "character_human20");
                                int discarded$61 = -70;
                                int discarded$62 = 0;
                                if (le.b()) {
                                  wq.field_c[21] = pb.a("halloween", ii.field_a, -256, "halloween_human1");
                                  wq.field_c[22] = pb.a("halloween", ii.field_a, -256, "halloween_human2");
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                pn.field_c = da.a("character_charming", ii.field_a, (byte) 19, "");
                                sh.field_N = da.a("character_charmed", ii.field_a, (byte) 19, "");
                                aa.field_h = da.a("character_stunned", ii.field_a, (byte) 19, "");
                                ig.field_d = pb.a("", ii.field_a, -256, "character_common");
                                ej.a(fl.a("", "zombie_counter_instructions", ii.field_a, 11091), (byte) -100, fl.a("", "hud", ii.field_a, 11091));
                                int discarded$63 = 16777215;
                                rq.a(pb.a("", ii.field_a, -256, "popup"));
                                int discarded$64 = 0;
                                sq.a(4, pb.a("", ii.field_a, -256, "carpark_floor"));
                                gd.a(false, 4, pb.a("", ii.field_a, -256, "carpark_tiles"));
                                int discarded$65 = 0;
                                sq.a(0, pb.a("", ii.field_a, -256, "mall_floor"));
                                gd.a(false, 0, pb.a("", ii.field_a, -256, "mall_tiles"));
                                int discarded$66 = 0;
                                sq.a(1, pb.a("", ii.field_a, -256, "powerplant_floor"));
                                gd.a(false, 1, pb.a("", ii.field_a, -256, "powerplant_tiles"));
                                int discarded$67 = 0;
                                sq.a(2, pb.a("", ii.field_a, -256, "precinct_floor"));
                                gd.a(false, 2, pb.a("", ii.field_a, -256, "precinct_tiles"));
                                int discarded$68 = 0;
                                sq.a(3, pb.a("", ii.field_a, -256, "whitehouse_floor"));
                                gd.a(false, 3, pb.a("", ii.field_a, -256, "whitehouse_tiles"));
                                pf.field_e[0] = pb.a("", ii.field_a, -256, "dimming0");
                                pf.field_e[1] = pb.a("", ii.field_a, -256, "dimming1");
                                pf.field_e[2] = pb.a("", ii.field_a, -256, "dimming2");
                                pf.field_e[3] = pb.a("", ii.field_a, -256, "dimming3");
                                pf.field_e[4] = pb.a("", ii.field_a, -256, "dimming4");
                                ig.field_b = fl.a("", "tutorial_arrow", ii.field_a, 11091);
                                o.field_h = fl.a("", "tutorial", ii.field_a, 11091);
                                sj.field_j = fl.a("", "frameh", ii.field_a, 11091);
                                lm.field_fb = fl.a("", "framev", ii.field_a, 11091);
                                rp.field_r = pb.a("", ii.field_a, -256, "framecorners");
                                tb.field_s = lm.field_fb.f();
                                vo.field_p = sj.field_j.c();
                                vo.field_p.i();
                                md.field_N = pb.a("", ii.field_a, -256, "instructions_controls");
                                ch.field_b = pb.a("", ii.field_a, -256, "instructions_survivors");
                                tf.field_Hb = pb.a("", ii.field_a, -256, "instructions_zombies");
                                cc.field_b = fj.a("frame", "", 3, ii.field_a);
                                field_I = fj.a("button_frame", "", 3, ii.field_a);
                                lf.field_c = fj.a("button_raised", "", 3, ii.field_a);
                                ja[] discarded$69 = fj.a("button_depressed", "", 3, ii.field_a);
                                oi.field_h = fj.a("frame_comp", "", 3, ii.field_a);
                                rl.field_a = fj.a("frame_comp_filled", "", 3, ii.field_a);
                                if (he.field_a) {
                                  break L20;
                                } else {
                                  la.field_l = da.a("achievements_large", ii.field_a, (byte) 19, "");
                                  var3_array = la.field_l;
                                  var4 = 0;
                                  L21: while (true) {
                                    if (~var4 <= ~var3_array.length) {
                                      e.a((byte) 48, wl.field_l);
                                      break L20;
                                    } else {
                                      var5_ref = var3_array[var4];
                                      e.a((byte) 48, var5_ref);
                                      var4++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                              dl.field_h.b((byte) 104);
                              ii.field_a = null;
                              cg.field_n = null;
                              int discarded$70 = 26673;
                              o.d();
                              return false;
                            } else {
                              L22: {
                                if (sm.field_g[var3_int].length() <= 0) {
                                  break L22;
                                } else {
                                  L23: {
                                    stackOut_99_0 = ao.field_b;
                                    stackOut_99_1 = var3_int;
                                    stackOut_99_2 = 113;
                                    stackIn_102_0 = stackOut_99_0;
                                    stackIn_102_1 = stackOut_99_1;
                                    stackIn_102_2 = stackOut_99_2;
                                    stackIn_100_0 = stackOut_99_0;
                                    stackIn_100_1 = stackOut_99_1;
                                    stackIn_100_2 = stackOut_99_2;
                                    if (var3_int != 15) {
                                      stackOut_102_0 = (ja[]) (Object) stackIn_102_0;
                                      stackOut_102_1 = stackIn_102_1;
                                      stackOut_102_2 = stackIn_102_2;
                                      stackOut_102_3 = 1.0;
                                      stackIn_103_0 = stackOut_102_0;
                                      stackIn_103_1 = stackOut_102_1;
                                      stackIn_103_2 = stackOut_102_2;
                                      stackIn_103_3 = stackOut_102_3;
                                      break L23;
                                    } else {
                                      stackOut_100_0 = (ja[]) (Object) stackIn_100_0;
                                      stackOut_100_1 = stackIn_100_1;
                                      stackOut_100_2 = stackIn_100_2;
                                      stackIn_101_0 = stackOut_100_0;
                                      stackIn_101_1 = stackOut_100_1;
                                      stackIn_101_2 = stackOut_100_2;
                                      stackOut_101_0 = (ja[]) (Object) stackIn_101_0;
                                      stackOut_101_1 = stackIn_101_1;
                                      stackOut_101_2 = stackIn_101_2;
                                      stackOut_101_3 = 0.65;
                                      stackIn_103_0 = stackOut_101_0;
                                      stackIn_103_1 = stackOut_101_1;
                                      stackIn_103_2 = stackOut_101_2;
                                      stackIn_103_3 = stackOut_101_3;
                                      break L23;
                                    }
                                  }
                                  stackIn_103_0[stackIn_103_1] = wh.a(stackIn_103_2, stackIn_103_3, var3_int);
                                  break L22;
                                }
                              }
                              var3_int++;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    if (ha.field_g == null) {
                      bc.a((byte) 76);
                      bc.a((byte) 15);
                      pl.field_I = 11;
                      sp.field_g = 12;
                      int discarded$71 = 50;
                      int discarded$72 = -127;
                      ip.a();
                      tj.a(3273, 224);
                      ff.a(200, 123);
                      cj.d(false, 0);
                      int discarded$73 = 26673;
                      o.d();
                      di discarded$74 = pl.field_J.a(true, (java.awt.Component) (Object) dk.field_Ib, -14697);
                      tk.field_q = dk.field_Ib;
                      kb.a(16777215, 5, field_I, 15, lf.field_c, (fm) (Object) pb.field_e, 65280, 240, 16711680, 320, oi.field_h, (byte) -128, 15, 20, 20);
                      kk.field_w = new h(10, 10, true);
                      e.field_e = new nm(100, 100);
                      return true;
                    } else {
                      int discarded$75 = -40;
                      dg.a(new eh(ha.field_g.a("", "huffman", false)));
                      ha.field_g = null;
                      int discarded$76 = 26673;
                      o.d();
                      return false;
                    }
                  } else {
                    qm.a(80.0f, 80, bl.field_b);
                    ((ZombieDawnMulti) this).g(-30169);
                    int discarded$77 = -2852;
                    bn.field_d = ed.a(ki.field_m);
                    of.field_e[0] = new ja(ki.field_m.a("", "background1.jpg", false), (java.awt.Component) (Object) dk.field_Ib);
                    jo.field_d = new ja(ki.field_m.a("", "panorama.jpg", false), (java.awt.Component) (Object) dk.field_Ib);
                    ki.field_m = null;
                    int discarded$78 = 26673;
                    o.d();
                    return false;
                  }
                }
              } else {
                return true;
              }
            }
          } else {
            qm.a(70.0f, 80, dn.field_b);
            ((ZombieDawnMulti) this).g(-30169);
            ei.field_a[37] = ac.a(rn.field_e, "", "zombie_dawn_human_female_ow").c();
            ei.field_a[38] = ac.a(rn.field_e, "", "zombie_dawn_human_female_eek").c();
            ei.field_a[39] = ac.a(rn.field_e, "", "zombie_dawn_human_female_oof").c();
            ei.field_a[40] = ac.a(rn.field_e, "", "zombie_dawn_human_male_oof").c();
            ei.field_a[41] = ac.a(rn.field_e, "", "zombie_dawn_human_male_argh").c();
            ei.field_a[42] = ac.a(rn.field_e, "", "zombie_dawn_human_male_urgh").c();
            ei.field_a[43] = ac.a(rn.field_e, "", "zombie_dawn_human_male_uuh").c();
            ei.field_a[46] = ac.a(rn.field_e, "", "zombie_dawn_use_powerup").c();
            ei.field_a[48] = ac.a(rn.field_e, "", "zombie_dawn_cinema_ambience").c();
            ei.field_a[26] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_1").c();
            ei.field_a[27] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_2").c();
            ei.field_a[28] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_4").c();
            ei.field_a[29] = ei.field_a[28];
            ei.field_a[49] = ac.a(rn.field_e, "", "zombie_dawn_male_scream_1").c();
            ei.field_a[50] = ac.a(rn.field_e, "", "zombie_dawn_male_scream_2").c();
            ei.field_a[51] = ac.a(rn.field_e, "", "zombie_dawn_male_scream_3").c();
            ei.field_a[52] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_3").c();
            ei.field_a[9] = ac.a(rn.field_e, "", "zombie_dawn_collect_powerup").c();
            ei.field_a[15] = ac.a(rn.field_e, "", "zombie_chase_human_male").c();
            ei.field_a[25] = ac.a(rn.field_e, "", "zombie_chase_human_female").c();
            ei.field_a[17] = ac.a(rn.field_e, "", "zombie_screech").c();
            ei.field_a[70] = ac.a(rn.field_e, "", "zombie_groan_short_1").c();
            ei.field_a[71] = ac.a(rn.field_e, "", "zombie_groan_short_2").c();
            ei.field_a[72] = ac.a(rn.field_e, "", "zombie_groan_female_3").c();
            ei.field_a[73] = ac.a(rn.field_e, "", "zombie_groan_female_4").c();
            ei.field_a[93] = ac.a(rn.field_e, "", "zd_multi_bird_twitter").c();
            ei.field_a[92] = ac.a(rn.field_e, "", "zd_multi_cloak_of_fear").c();
            ei.field_a[75] = ac.a(rn.field_e, "", "zd_multi_counter").c();
            ei.field_a[76] = ac.a(rn.field_e, "", "ZD_multi_human_into_portal_female").c();
            ei.field_a[77] = ac.a(rn.field_e, "", "ZD_multi_human_into_portal_male").c();
            ei.field_a[78] = ac.a(rn.field_e, "", "zd_multi_zombie_into_portal").c();
            ei.field_a[79] = ac.a(rn.field_e, "", "zd_multi_into_portal_opponent").c();
            ei.field_a[80] = ac.a(rn.field_e, "", "zd_multi_shackles").c();
            rn.field_e = null;
            int discarded$79 = 26673;
            o.d();
            return false;
          }
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              dg.h(-95);
              if (null == rn.field_f) {
                break L1;
              } else {
                rn.a(-92);
                break L1;
              }
            }
            L2: {
              int discarded$3 = 0;
              n.b();
              if (param0 == -18941) {
                break L2;
              } else {
                field_H = 24;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ZombieDawnMulti.HA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            ((ZombieDawnMulti) this).a("zombiedawnmulti", 14, (byte) 82);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ZombieDawnMulti.init()");
        }
    }

    private final void r() {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ia.field_r) {
                break L1;
              } else {
                L2: {
                  if (ke.field_g == null) {
                    int discarded$6 = 4;
                    int discarded$7 = -19300;
                    ke.field_g = aa.b();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (ke.field_g.field_k) {
                  var2_array = k.field_n;
                  var3 = ke.field_g.field_h;
                  var4 = 0;
                  L3: while (true) {
                    if (var4 >= 8) {
                      var2_array = fc.field_m;
                      var3 = ke.field_g.field_h;
                      var4 = 0;
                      L4: while (true) {
                        if (var4 >= 8) {
                          ia.field_r = true;
                          ke.field_g = null;
                          break L1;
                        } else {
                          var2_array[var4] = tq.b(var2_array[var4], ~var3[var4]);
                          var4++;
                          continue L4;
                        }
                      }
                    } else {
                      var2_array[var4] = cr.b(var2_array[var4], var3[var4]);
                      var4++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L5: {
              if (qd.field_bb) {
                break L5;
              } else {
                L6: {
                  if (null == ub.field_vb) {
                    int discarded$8 = 6;
                    int discarded$9 = -57;
                    ub.field_vb = ej.a();
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (ub.field_vb.field_h) {
                  L7: {
                    ll.field_k.a(0, ub.field_vb.field_f);
                    oq.c((byte) 120);
                    if ((ll.field_k.field_i & 2) != 0) {
                      break L7;
                    } else {
                      oq.c((byte) 119);
                      break L7;
                    }
                  }
                  L8: {
                    we.field_g[47] = vn.field_d[ll.field_k.b((byte) -1)];
                    if (fn.field_b) {
                      int discarded$10 = -61;
                      th.b();
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ub.field_vb = null;
                  qd.field_bb = true;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L9: {
              if (!ia.field_r) {
                break L9;
              } else {
                if (qd.field_bb) {
                  ub.m(116);
                  int discarded$11 = 103;
                  ii.a();
                  if (pl.field_I != 6) {
                    break L9;
                  } else {
                    if (!oa.a(-9, fc.field_m)) {
                      pl.field_I = 3;
                      bm.a(false, 3, 127, sp.field_g);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ZombieDawnMulti.FA(" + -123 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ZombieDawnMulti.t(-121);
              int discarded$221 = 103;
              gb.b();
              vc.b(10066329);
              int discarded$222 = -9162;
              oe.b();
              int discarded$223 = -116;
              rb.a();
              int discarded$224 = 4;
              er.c();
              int discarded$225 = 92;
              th.d();
              ul.b((byte) -35);
              int discarded$226 = 1;
              vd.a();
              pn.a(31);
              int discarded$227 = 8;
              jq.a();
              int discarded$228 = 5;
              p.a();
              int discarded$229 = 127;
              cm.a();
              int discarded$230 = 3732;
              oa.b();
              int discarded$231 = 0;
              kn.a();
              cj.c(false);
              int discarded$232 = 119;
              ti.g();
              int discarded$233 = -116;
              pb.a();
              qb.c((byte) -7);
              int discarded$234 = 127;
              ai.a();
              eq.a(0);
              of.a(-1);
              ej.b((byte) 16);
              int discarded$235 = 108;
              ih.b();
              aq.o(10);
              int discarded$236 = 26677;
              fn.a();
              ag.b(true);
              int discarded$237 = 17;
              mh.a();
              int discarded$238 = -1;
              bd.a();
              int discarded$239 = 54;
              mf.a();
              oo.a();
              int discarded$240 = 0;
              k.b();
              int discarded$241 = 0;
              bl.b();
              int discarded$242 = 1;
              v.a();
              gj.a((byte) 91);
              va.a(127);
              int discarded$243 = 43;
              lb.a();
              int discarded$244 = -98;
              jf.a();
              int discarded$245 = 118;
              ka.a();
              int discarded$246 = 6345;
              pf.b();
              int discarded$247 = 0;
              i.a();
              int discarded$248 = -26028;
              ii.c();
              l.a(64);
              int discarded$249 = -50;
              lh.a();
              int discarded$250 = -46;
              ll.a();
              ok.e(12);
              int discarded$251 = 256;
              qd.h();
              nn.b(112);
              int discarded$252 = 1475;
              ci.b();
              s.a(-96);
              h.b(false);
              int discarded$253 = 6;
              nm.a();
              int discarded$254 = 5;
              rp.a();
              int discarded$255 = 78;
              rl.c();
              br.b((byte) 48);
              nq.e(-119);
              qa.a((byte) 43);
              ep.c();
              pk.a(619119521);
              int discarded$256 = 241;
              qf.a();
              int discarded$257 = 2;
              jk.a();
              int discarded$258 = -5794;
              ei.a();
              int discarded$259 = 96;
              vn.b();
              int discarded$260 = 0;
              qo.b();
              int discarded$261 = 55;
              lj.a();
              int discarded$262 = 24461;
              gm.o();
              cg.c((byte) -87);
              pq.a((byte) 44);
              lc.a((byte) 87);
              id.e((byte) 107);
              ce.a(24);
              int discarded$263 = -45;
              wb.o();
              int discarded$264 = 1;
              jj.i();
              int discarded$265 = 0;
              ae.b();
              int discarded$266 = 1;
              fq.c();
              int discarded$267 = 0;
              nc.b();
              int discarded$268 = -88;
              tk.c();
              int discarded$269 = 1;
              si.d();
              hk.a((byte) 39);
              int discarded$270 = -6;
              kb.b();
              int discarded$271 = 1;
              fh.a();
              int discarded$272 = 7;
              qe.a();
              int discarded$273 = -66;
              ko.d();
              int discarded$274 = 16737894;
              uf.b();
              lq.c(110);
              if (param0 < -43) {
                break L1;
              } else {
                field_H = -75;
                break L1;
              }
            }
            fc.b(-1);
            int discarded$275 = 0;
            qk.b();
            int discarded$276 = -17;
            qi.b();
            me.a((byte) 119);
            gd.e(0);
            f.a((byte) -44);
            int discarded$277 = 0;
            mb.b();
            mm.d();
            ba.d(16652);
            gp.b();
            w.a((byte) -83);
            de.a(19091);
            int discarded$278 = -36;
            jh.h();
            sc.a(true);
            int discarded$279 = 0;
            dm.h();
            int discarded$280 = -123;
            so.a();
            int discarded$281 = -125;
            ga.j();
            int discarded$282 = 1;
            sj.c();
            fg.c(-125);
            int discarded$283 = 121;
            uo.c();
            jm.c((byte) 59);
            int discarded$284 = -9;
            op.c();
            int discarded$285 = 17;
            wf.c();
            int discarded$286 = 1;
            np.c();
            int discarded$287 = -110;
            aj.a();
            hb.a(false);
            int discarded$288 = 0;
            be.a();
            int discarded$289 = -95;
            da.a();
            ng.a(816);
            int discarded$290 = 22382;
            bc.c();
            ql.a(4);
            int discarded$291 = 95;
            vk.k();
            int discarded$292 = 101;
            tf.o();
            ta.k((byte) -66);
            int discarded$293 = 61;
            ub.o();
            int discarded$294 = 10;
            ne.n();
            fe.c(false);
            int discarded$295 = 84;
            dg.a();
            int discarded$296 = 64;
            qm.a();
            int discarded$297 = 1;
            cp.c();
            hf.b((byte) 45);
            sk.a(-1020346174);
            int discarded$298 = 26;
            wp.a();
            rh.a();
            ac.a();
            kl.a();
            int discarded$299 = -80;
            jp.b();
            int discarded$300 = 1;
            hh.a();
            int discarded$301 = -14680;
            vo.f();
            int discarded$302 = -120;
            ck.b();
            mq.e(22324);
            int discarded$303 = -79;
            ah.a();
            int discarded$304 = 16130;
            dn.a();
            int discarded$305 = 0;
            mi.d();
            int discarded$306 = -81;
            hi.c();
            sn.c((byte) 117);
            int discarded$307 = 0;
            cd.d();
            int discarded$308 = -2;
            jb.a();
            tq.h(0);
            int discarded$309 = 57;
            fa.j();
            int discarded$310 = 121;
            wq.b();
            lo.a(0);
            fm.a();
            int discarded$311 = 3;
            uq.a();
            int discarded$312 = 119;
            vi.a();
            int discarded$313 = -110;
            cq.a();
            bn.a(23376);
            int discarded$314 = 2;
            mo.h();
            qh.a(-22);
            sb.a(76);
            g.a();
            int discarded$315 = -1130232991;
            ff.e();
            rj.j(8784);
            lk.i(11041);
            ve.a((byte) 104);
            gk.a(125);
            ol.c((byte) -56);
            int discarded$316 = 9;
            vf.a();
            int discarded$317 = 87;
            eh.a();
            mc.a((byte) 124);
            int discarded$318 = -123;
            wg.a();
            int discarded$319 = 91;
            pd.a();
            vb.a(false);
            int discarded$320 = 1;
            pg.b();
            hc.a(0);
            int discarded$321 = 12814;
            ed.a();
            int discarded$322 = 0;
            ke.a();
            int discarded$323 = 0;
            jo.a();
            int discarded$324 = -19162;
            pi.a();
            int discarded$325 = 70;
            ic.a();
            int discarded$326 = -29690;
            kp.e();
            o.b(-13532);
            int discarded$327 = -12;
            ec.a();
            int discarded$328 = 82;
            dc.c();
            int discarded$329 = 92;
            dk.c();
            dp.a(0);
            int discarded$330 = 15;
            no.h();
            oj.h(16777215);
            tm.a(-125);
            cb.a(0);
            int discarded$331 = 7;
            jg.b();
            int discarded$332 = 125;
            eo.a();
            int discarded$333 = 0;
            lm.n();
            sh.b(true);
            int discarded$334 = -83;
            ek.f();
            int discarded$335 = -121;
            ge.r();
            ro.b((byte) 71);
            pa.i((byte) -86);
            int discarded$336 = 29919;
            bf.d();
            int discarded$337 = -119;
            og.g();
            c.a(-6);
            int discarded$338 = 16682;
            ap.h();
            int discarded$339 = 0;
            tn.g();
            int discarded$340 = 77;
            bq.a();
            int discarded$341 = 66;
            li.g();
            cn.d(-124);
            int discarded$342 = 16777215;
            hl.a();
            qc.c((byte) 109);
            int discarded$343 = 21;
            qq.a();
            int discarded$344 = 4;
            t.a();
            wo.a();
            eb.a(true);
            int discarded$345 = -97;
            lp.a();
            int discarded$346 = 27964;
            hj.a();
            a.a(false);
            int discarded$347 = -72;
            tg.a();
            int discarded$348 = -109;
            dl.a();
            en.a(20964);
            int discarded$349 = 1;
            wl.a();
            iq.a(true);
            dd.a(false);
            int discarded$350 = 1;
            r.a();
            int discarded$351 = -113;
            ld.h();
            int discarded$352 = 0;
            ig.a();
            ob.c((byte) -52);
            int discarded$353 = 49;
            ik.b();
            vm.k((byte) -29);
            hq.a((byte) 82);
            af.a(-128);
            int discarded$354 = 119;
            md.b();
            kc.a(-111);
            int discarded$355 = -7;
            am.b();
            int discarded$356 = 80;
            rm.a();
            int discarded$357 = 2791;
            kd.a();
            int discarded$358 = 60;
            kq.a();
            int discarded$359 = 4;
            sf.a();
            int discarded$360 = 109;
            fl.a();
            int discarded$361 = 1;
            ij.a();
            int discarded$362 = 0;
            jl.a();
            bg.a((byte) -104);
            wa.a(2);
            mp.a(12);
            int discarded$363 = -90;
            cf.e();
            gn.a(-118);
            rg.a((byte) -39);
            int discarded$364 = -92;
            al.i();
            df.g((byte) 84);
            se.b(false);
            ch.d(-1);
            bh.a((byte) -8);
            int discarded$365 = 13377;
            ji.a();
            int discarded$366 = 32768;
            tl.f();
            int discarded$367 = 8;
            io.a();
            int discarded$368 = 0;
            aa.f();
            int discarded$369 = -2;
            dq.b();
            sm.a(-12970);
            int discarded$370 = 97;
            fd.g();
            hn.a(0);
            int discarded$371 = -52;
            cc.a();
            int discarded$372 = -66;
            wc.g();
            int discarded$373 = 22767;
            mj.i();
            tj.a(false);
            int discarded$374 = -119;
            sa.a();
            nk.a((byte) -26);
            int discarded$375 = -3;
            dj.g();
            em.k(4);
            int discarded$376 = 114;
            pl.f();
            int discarded$377 = 88;
            rn.a();
            hg.c(true);
            ho.e(30833);
            int discarded$378 = 225;
            fk.e();
            vj.e(31592);
            int discarded$379 = -113;
            vh.c();
            int discarded$380 = 360;
            kg.a();
            int discarded$381 = -60;
            po.f();
            int discarded$382 = 78;
            nj.a();
            int discarded$383 = 3;
            el.h();
            on.l(29829);
            pm.d(false);
            int discarded$384 = 7181;
            ie.l();
            int discarded$385 = 0;
            le.a();
            int discarded$386 = 1;
            gl.c();
            int discarded$387 = 2;
            sq.f();
            int discarded$388 = -1562977759;
            uk.f();
            km.i(0);
            un.g(-1317848592);
            int discarded$389 = -109;
            q.a();
            int discarded$390 = 1;
            pj.c();
            ud.f(38);
            int discarded$391 = 107;
            wm.h();
            uh.a();
            bi.a(4302);
            nb.a((byte) 119);
            int discarded$392 = -127;
            wk.h();
            int discarded$393 = -50;
            od.o();
            int discarded$394 = 4912;
            bk.c();
            kf.c(3);
            int discarded$395 = 0;
            wh.a();
            int discarded$396 = 118;
            e.a();
            int discarded$397 = 1;
            kk.b();
            int discarded$398 = -113;
            la.a();
            int discarded$399 = -33;
            ua.g();
            int discarded$400 = -81;
            sd.g();
            int discarded$401 = -23;
            ao.a();
            int discarded$402 = 5;
            eg.c();
            int discarded$403 = 94;
            b.a();
            int discarded$404 = -30;
            up.a();
            ln.a(18358);
            int discarded$405 = 0;
            vl.a();
            int discarded$406 = 8220;
            vg.a();
            int discarded$407 = 103;
            we.a();
            int discarded$408 = -39;
            oq.d();
            he.a((byte) -122);
            tb.c((byte) 109);
            int discarded$409 = 0;
            m.a();
            int discarded$410 = -108;
            na.g();
            int discarded$411 = 48;
            nh.a();
            int discarded$412 = -2;
            kj.a();
            int discarded$413 = 5378;
            oi.b();
            int discarded$414 = -102;
            ml.c();
            int discarded$415 = -126;
            gg.a();
            int discarded$416 = 1;
            ra.b();
            int discarded$417 = 0;
            ab.a();
            int discarded$418 = -1569388056;
            gi.a();
            int discarded$419 = 1;
            cr.b();
            int discarded$420 = 0;
            qj.b();
            uc.c(118);
            int discarded$421 = 124;
            ip.c();
            int discarded$422 = -18535;
            bb.a();
            int discarded$423 = -98;
            um.a();
            int discarded$424 = 0;
            rq.b();
            ki.b(-23636);
            fb.d(-90);
            int discarded$425 = -6298;
            wj.a();
            int discarded$426 = -5937;
            ak.a();
            int discarded$427 = 106;
            gh.a();
            wd.a((byte) -84);
            int discarded$428 = 27467;
            il.a();
            bo.a(6);
            pp.a(false);
            int discarded$429 = 1;
            wn.b();
            mn.c(3);
            int discarded$430 = -48;
            ui.a();
            int discarded$431 = 26;
            db.a();
            u.a(-7406);
            hp.a(120);
            int discarded$432 = 53;
            mk.a();
            int discarded$433 = 94;
            td.a();
            ha.a(21342);
            int discarded$434 = 89;
            re.a();
            int discarded$435 = 1;
            gf.a();
            tp.h(66);
            int discarded$436 = 0;
            ia.h();
            hm.b(false);
            int discarded$437 = 11702;
            hd.h();
            int discarded$438 = -3;
            bp.h();
            int discarded$439 = 1;
            qp.h();
            int discarded$440 = 0;
            lf.a();
            int discarded$441 = 0;
            wi.a();
            ma.a(64);
            ((ZombieDawnMulti) this).field_v = null;
            ((ZombieDawnMulti) this).field_J = null;
            ((ZombieDawnMulti) this).field_G = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ZombieDawnMulti.KA(" + param0 + ')');
        }
    }

    public ZombieDawnMulti() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Annoying";
        field_K = new String[]{"Map type", "Map name"};
        field_F = "Test Chamber";
    }
}
