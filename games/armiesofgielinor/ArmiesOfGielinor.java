/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class ArmiesOfGielinor extends wf {
    static String[] field_N;
    static int field_K;
    static vh field_L;
    static String field_H;
    static ka field_J;
    static int[] field_I;
    public static boolean field_M;

    final void a(byte param0) {
        int discarded$2 = 0;
        boolean discarded$3 = false;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        bv var3_ref_bv = null;
        int[] var3_ref_int__ = null;
        int var4 = 0;
        int[] var4_ref_int__ = null;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        ic var10 = null;
        int var11 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_176_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_183_1 = 0;
        ic stackIn_192_0 = null;
        ic stackIn_192_1 = null;
        int stackIn_192_2 = 0;
        int stackIn_192_3 = 0;
        String[] stackIn_192_4 = null;
        int stackIn_192_5 = 0;
        int stackIn_192_6 = 0;
        dg stackIn_192_7 = null;
        int stackIn_192_8 = 0;
        int stackIn_192_9 = 0;
        int stackIn_192_10 = 0;
        int stackIn_192_11 = 0;
        int stackIn_192_12 = 0;
        int stackIn_192_13 = 0;
        ic stackIn_194_0 = null;
        ic stackIn_194_1 = null;
        int stackIn_194_2 = 0;
        int stackIn_194_3 = 0;
        String[] stackIn_194_4 = null;
        int stackIn_194_5 = 0;
        int stackIn_194_6 = 0;
        dg stackIn_194_7 = null;
        int stackIn_194_8 = 0;
        int stackIn_194_9 = 0;
        int stackIn_194_10 = 0;
        int stackIn_194_11 = 0;
        int stackIn_194_12 = 0;
        int stackIn_194_13 = 0;
        ic stackIn_195_0 = null;
        ic stackIn_195_1 = null;
        int stackIn_195_2 = 0;
        int stackIn_195_3 = 0;
        String[] stackIn_195_4 = null;
        int stackIn_195_5 = 0;
        int stackIn_195_6 = 0;
        dg stackIn_195_7 = null;
        int stackIn_195_8 = 0;
        int stackIn_195_9 = 0;
        int stackIn_195_10 = 0;
        int stackIn_195_11 = 0;
        int stackIn_195_12 = 0;
        int stackIn_195_13 = 0;
        int stackIn_195_14 = 0;
        int stackIn_256_0 = 0;
        int stackIn_337_0 = 0;
        int stackIn_337_1 = 0;
        int stackIn_348_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_175_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_182_1 = 0;
        ic stackOut_191_0 = null;
        ic stackOut_191_1 = null;
        int stackOut_191_2 = 0;
        int stackOut_191_3 = 0;
        String[] stackOut_191_4 = null;
        int stackOut_191_5 = 0;
        int stackOut_191_6 = 0;
        dg stackOut_191_7 = null;
        int stackOut_191_8 = 0;
        int stackOut_191_9 = 0;
        int stackOut_191_10 = 0;
        int stackOut_191_11 = 0;
        int stackOut_191_12 = 0;
        int stackOut_191_13 = 0;
        ic stackOut_194_0 = null;
        ic stackOut_194_1 = null;
        int stackOut_194_2 = 0;
        int stackOut_194_3 = 0;
        String[] stackOut_194_4 = null;
        int stackOut_194_5 = 0;
        int stackOut_194_6 = 0;
        dg stackOut_194_7 = null;
        int stackOut_194_8 = 0;
        int stackOut_194_9 = 0;
        int stackOut_194_10 = 0;
        int stackOut_194_11 = 0;
        int stackOut_194_12 = 0;
        int stackOut_194_13 = 0;
        int stackOut_194_14 = 0;
        ic stackOut_192_0 = null;
        ic stackOut_192_1 = null;
        int stackOut_192_2 = 0;
        int stackOut_192_3 = 0;
        String[] stackOut_192_4 = null;
        int stackOut_192_5 = 0;
        int stackOut_192_6 = 0;
        dg stackOut_192_7 = null;
        int stackOut_192_8 = 0;
        int stackOut_192_9 = 0;
        int stackOut_192_10 = 0;
        int stackOut_192_11 = 0;
        int stackOut_192_12 = 0;
        int stackOut_192_13 = 0;
        int stackOut_192_14 = 0;
        int stackOut_255_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_336_0 = 0;
        int stackOut_336_1 = 0;
        int stackOut_345_0 = 0;
        int stackOut_347_0 = 0;
        var11 = field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$2 = bs.a((byte) -127);
              r.field_u = os.g(4);
              hk.k(128);
              if (wq.field_a == null) {
                break L1;
              } else {
                if (!wq.field_a.field_k) {
                  break L1;
                } else {
                  ck.b(-127);
                  oi.a(false);
                  break L1;
                }
              }
            }
            L2: {
              stackOut_7_0 = this;
              stackOut_7_1 = 127;
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (wq.field_a == null) {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L2;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 1;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                stackIn_11_2 = stackOut_8_2;
                break L2;
              }
            }
            L3: {
              this.a(stackIn_11_1, stackIn_11_2 != 0);
              if (!ts.field_l) {
                break L3;
              } else {
                this.p(17);
                ts.field_l = false;
                break L3;
              }
            }
            uk.field_n = uk.field_n + 1;
            if (param0 <= -111) {
              L4: {
                if (ql.h(31337)) {
                  this.g((byte) 4);
                  if (ql.h(31337)) {
                    L5: {
                      if (wd.a((byte) 105)) {
                        discarded$3 = this.c(-100, false);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                L7: {
                  if (qu.field_q) {
                    break L7;
                  } else {
                    ii.a(el.field_d, (byte) -73);
                    if (!this.c(102, true)) {
                      break L6;
                    } else {
                      this.r(-66);
                      qu.field_q = true;
                      if (var11 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  if (!dl.d(95)) {
                    break L8;
                  } else {
                    L9: {
                      if (ed.a(-83)) {
                        break L9;
                      } else {
                        L10: {
                          if (!an.e((byte) 89)) {
                            break L10;
                          } else {
                            L11: {
                              if ((pg.field_f ^ -1) == (pg.field_e ^ -1)) {
                                break L11;
                              } else {
                                this.d(0, false);
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              var2_int = ba.h(-124);
                              if (1 != var2_int) {
                                break L12;
                              } else {
                                vf.a(0, 0);
                                break L12;
                              }
                            }
                            this.d(0, true);
                            if (var11 == 0) {
                              break L6;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.d(0, false);
                        if (var11 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L13: {
                      stackOut_56_0 = this;
                      stackOut_56_1 = 42;
                      stackIn_61_0 = stackOut_56_0;
                      stackIn_61_1 = stackOut_56_1;
                      stackIn_57_0 = stackOut_56_0;
                      stackIn_57_1 = stackOut_56_1;
                      if (null == wq.field_a) {
                        stackOut_61_0 = this;
                        stackOut_61_1 = stackIn_61_1;
                        stackOut_61_2 = 0;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        stackIn_62_2 = stackOut_61_2;
                        break L13;
                      } else {
                        stackOut_57_0 = this;
                        stackOut_57_1 = stackIn_57_1;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_59_1 = stackOut_57_1;
                        stackOut_59_0 = this;
                        stackOut_59_1 = stackIn_59_1;
                        stackOut_59_2 = 1;
                        stackIn_62_0 = stackOut_59_0;
                        stackIn_62_1 = stackOut_59_1;
                        stackIn_62_2 = stackOut_59_2;
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var2_int = this.a((byte) stackIn_62_1, stackIn_62_2 != 0);
                        if (1 == var2_int) {
                          break L15;
                        } else {
                          if (-3 == (var2_int ^ -1)) {
                            break L15;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L16: {
                        if (null == wq.field_a) {
                          break L16;
                        } else {
                          ck.b(-104);
                          break L16;
                        }
                      }
                      if (var2_int != 2) {
                        break L14;
                      } else {
                        ho.a((java.applet.Applet) (this), (byte) -3);
                        break L14;
                      }
                    }
                    this.d(0, true);
                    if (var11 == 0) {
                      break L6;
                    } else {
                      break L8;
                    }
                  }
                }
                gh.f((byte) -67);
                break L6;
              }
              L17: {
                L18: {
                  if (nw.g(100)) {
                    break L18;
                  } else {
                    L19: while (true) {
                      var2 = (iw) ((Object) fi.field_u.a(0));
                      if (var2 == null) {
                        break L18;
                      } else {
                        nl.a(0, 4, (iw) (var2));
                        if (var11 != 0) {
                          break L17;
                        } else {
                          if (var11 == 0) {
                            continue L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                  }
                }
                L20: while (true) {
                  L21: {
                    L22: {
                      if (!gs.a((byte) 42, sh.field_a)) {
                        break L22;
                      } else {
                        stackOut_84_0 = nm.field_o;
                        stackOut_84_1 = 9;
                        stackIn_337_0 = stackOut_84_0;
                        stackIn_337_1 = stackOut_84_1;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        if (var11 != 0) {
                          break L21;
                        } else {
                          L23: {
                            if (stackIn_85_0 != stackIn_85_1) {
                              break L23;
                            } else {
                              ut.i((byte) 123);
                              ua.field_t = false;
                              bv.a(false, 11, 1, jt.field_a);
                              pr.field_i = mg.field_e.g(1);
                              if (var11 == 0) {
                                continue L20;
                              } else {
                                break L23;
                              }
                            }
                          }
                          L24: {
                            if (-15 != (nm.field_o ^ -1)) {
                              break L24;
                            } else {
                              jr.a(rs.a((byte) 76, 8), sp.b((byte) -90), 150, bv.field_A, rs.a((byte) 95, 1000), et.b(-1), 1024, 6, -84, sh.d((byte) 81));
                              ep.a(lp.b(-126), -72, km.c(0));
                              s.field_d = 0;
                              ma.field_Z = true;
                              ua.field_t = false;
                              kg.field_d = true;
                              jt.field_a = -2;
                              hh.a(-16147, 50, jc.field_B, true);
                              if (var11 == 0) {
                                continue L20;
                              } else {
                                break L24;
                              }
                            }
                          }
                          L25: {
                            if ((nm.field_o ^ -1) == -16) {
                              L26: {
                                if (kg.field_d) {
                                  ut.i((byte) 124);
                                  vh.i((byte) 109);
                                  uk.b(22963);
                                  qn.b();
                                  bv.a(false, 0, 1, 0);
                                  cl.field_t = true;
                                  du.field_h = false;
                                  kg.field_d = false;
                                  gk.field_H = false;
                                  fj.field_c = false;
                                  vs.field_j = true;
                                  uc.a(0);
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              hh.a(-16147, 50, mp.field_Ob, true);
                              dn.field_Qb = false;
                              ua.field_t = false;
                              if (var11 == 0) {
                                continue L20;
                              } else {
                                break L25;
                              }
                            } else {
                              break L25;
                            }
                          }
                          L27: {
                            if (nm.field_o != 10) {
                              break L27;
                            } else {
                              if (!kg.field_d) {
                                break L27;
                              } else {
                                bl.a((byte) -105);
                                if (var11 == 0) {
                                  continue L20;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                          L28: {
                            L29: {
                              if ((nm.field_o ^ -1) == -12) {
                                break L29;
                              } else {
                                if (nm.field_o == 12) {
                                  break L29;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            L30: {
                              stackOut_116_0 = 96;
                              stackIn_119_0 = stackOut_116_0;
                              stackIn_117_0 = stackOut_116_0;
                              if (12 != nm.field_o) {
                                stackOut_119_0 = stackIn_119_0;
                                stackOut_119_1 = 0;
                                stackIn_120_0 = stackOut_119_0;
                                stackIn_120_1 = stackOut_119_1;
                                break L30;
                              } else {
                                stackOut_117_0 = stackIn_117_0;
                                stackOut_117_1 = 1;
                                stackIn_120_0 = stackOut_117_0;
                                stackIn_120_1 = stackOut_117_1;
                                break L30;
                              }
                            }
                            L31: {
                              var2 = ea.a((byte) stackIn_120_0, stackIn_120_1 != 0);
                              if (((mo) (var2)).field_b != 4) {
                                break L31;
                              } else {
                                L32: {
                                  if (null == rd.field_j) {
                                    break L32;
                                  } else {
                                    bg.a(-1, rd.field_j.field_xb.a(((mo) (var2)).field_q, (byte) -64));
                                    break L32;
                                  }
                                }
                                if (bc.field_a != null) {
                                  bg.a(-1, bc.field_a.field_xb.a(((mo) (var2)).field_q, (byte) -64));
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            lo.a((mo) (var2), -1);
                            if (var11 == 0) {
                              continue L20;
                            } else {
                              break L28;
                            }
                          }
                          L33: {
                            if (nm.field_o != 74) {
                              break L33;
                            } else {
                              var2 = rq.field_n;
                              var3_ref_bv = mg.field_e;
                              var4 = ((vh) ((Object) var3_ref_bv)).k(0);
                              var5_int = 0;
                              L34: while (true) {
                                L35: {
                                  L36: {
                                    if ((var5_int ^ -1) <= (var4 ^ -1)) {
                                      break L36;
                                    } else {
                                      ((int[]) (var2))[var5_int] = ((vh) ((Object) var3_ref_bv)).i(1);
                                      var5_int++;
                                      if (var11 != 0) {
                                        break L35;
                                      } else {
                                        if (var11 == 0) {
                                          continue L34;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                  }
                                  jd.m(13);
                                  break L35;
                                }
                                if (var11 == 0) {
                                  continue L20;
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                          L37: {
                            if (-76 == (nm.field_o ^ -1)) {
                              var2 = mg.field_e;
                              tb.a(ah.field_a.field_a, (vh) (var2), false, ah.field_a.field_b);
                              im.field_w = true;
                              if (var11 == 0) {
                                continue L20;
                              } else {
                                break L37;
                              }
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (81 == nm.field_o) {
                              L39: {
                                var2_int = mg.field_e.k(0);
                                if ((var2_int ^ -1) == -1) {
                                  break L39;
                                } else {
                                  bu.field_b = new sl(mg.field_e, 9, true);
                                  if (var11 == 0) {
                                    continue L20;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              bu.field_b = null;
                              mv.field_b = true;
                              if (var11 == 0) {
                                continue L20;
                              } else {
                                break L38;
                              }
                            } else {
                              break L38;
                            }
                          }
                          L40: {
                            if (nm.field_o != 82) {
                              break L40;
                            } else {
                              if (!bu.field_b.a(fk.field_b, -1, mg.field_e)) {
                                continue L20;
                              } else {
                                mv.field_b = true;
                                if (var11 == 0) {
                                  continue L20;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                          L41: {
                            if ((nm.field_o ^ -1) != -81) {
                              break L41;
                            } else {
                              pg.field_d = new hm(mg.field_e, true);
                              ve.field_b = true;
                              if (var11 == 0) {
                                continue L20;
                              } else {
                                break L41;
                              }
                            }
                          }
                          L42: {
                            if (79 != nm.field_o) {
                              break L42;
                            } else {
                              if (null != rd.field_j) {
                                rd.field_j.field_Bb = mg.field_e.i(1);
                                if (var11 == 0) {
                                  continue L20;
                                } else {
                                  break L42;
                                }
                              } else {
                                continue L20;
                              }
                            }
                          }
                          L43: {
                            L44: {
                              if (-65 == (nm.field_o ^ -1)) {
                                break L44;
                              } else {
                                if ((nm.field_o ^ -1) != -66) {
                                  break L43;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            L45: {
                              ut.i((byte) 123);
                              var2_int = mg.field_e.k(0);
                              var3 = mg.field_e.k(0);
                              if (-1 == (1 & var3 ^ -1)) {
                                stackOut_175_0 = 0;
                                stackIn_176_0 = stackOut_175_0;
                                break L45;
                              } else {
                                stackOut_173_0 = 1;
                                stackIn_176_0 = stackOut_173_0;
                                break L45;
                              }
                            }
                            L46: {
                              var4 = stackIn_176_0;
                              if (-1 == (var3 & 2 ^ -1)) {
                                stackOut_179_0 = 0;
                                stackIn_180_0 = stackOut_179_0;
                                break L46;
                              } else {
                                stackOut_177_0 = 1;
                                stackIn_180_0 = stackOut_177_0;
                                break L46;
                              }
                            }
                            var5_int = stackIn_180_0;
                            var6 = (var3 & 30) >> 1941313538;
                            var7 = 1 & var3 >> -573950906;
                            var8 = new String[mg.field_e.k(0)];
                            var9 = mg.field_e.a((byte) 123);
                            var10_int = 0;
                            L47: while (true) {
                              L48: {
                                if (var8.length <= var10_int) {
                                  break L48;
                                } else {
                                  var8[var10_int] = mg.field_e.h((byte) 121);
                                  stackOut_182_0 = nm.field_o ^ -1;
                                  stackOut_182_1 = -65;
                                  stackIn_337_0 = stackOut_182_0;
                                  stackIn_337_1 = stackOut_182_1;
                                  stackIn_183_0 = stackOut_182_0;
                                  stackIn_183_1 = stackOut_182_1;
                                  if (var11 != 0) {
                                    break L21;
                                  } else {
                                    L49: {
                                      if (stackIn_183_0 != stackIn_183_1) {
                                        break L49;
                                      } else {
                                        if (!gt.a(var8[var10_int], (byte) 121)) {
                                          break L49;
                                        } else {
                                          var9 = var10_int;
                                          break L49;
                                        }
                                      }
                                    }
                                    var10_int++;
                                    if (var11 == 0) {
                                      continue L47;
                                    } else {
                                      break L48;
                                    }
                                  }
                                }
                              }
                              L50: {
                                l.field_c = null;
                                qa.field_F = false;
                                pq.field_f = null;
                                stackOut_191_0 = null;
                                stackOut_191_1 = null;
                                stackOut_191_2 = 1;
                                stackOut_191_3 = var2_int;
                                stackOut_191_4 = (String[]) (var8);
                                stackOut_191_5 = var9;
                                stackOut_191_6 = var4;
                                stackOut_191_7 = td.field_f;
                                stackOut_191_8 = -1;
                                stackOut_191_9 = 0;
                                stackOut_191_10 = -1;
                                stackOut_191_11 = var5_int;
                                stackOut_191_12 = var6;
                                stackOut_191_13 = var7;
                                stackIn_194_0 = stackOut_191_0;
                                stackIn_194_1 = stackOut_191_1;
                                stackIn_194_2 = stackOut_191_2;
                                stackIn_194_3 = stackOut_191_3;
                                stackIn_194_4 = stackOut_191_4;
                                stackIn_194_5 = stackOut_191_5;
                                stackIn_194_6 = stackOut_191_6;
                                stackIn_194_7 = stackOut_191_7;
                                stackIn_194_8 = stackOut_191_8;
                                stackIn_194_9 = stackOut_191_9;
                                stackIn_194_10 = stackOut_191_10;
                                stackIn_194_11 = stackOut_191_11;
                                stackIn_194_12 = stackOut_191_12;
                                stackIn_194_13 = stackOut_191_13;
                                stackIn_192_0 = stackOut_191_0;
                                stackIn_192_1 = stackOut_191_1;
                                stackIn_192_2 = stackOut_191_2;
                                stackIn_192_3 = stackOut_191_3;
                                stackIn_192_4 = stackOut_191_4;
                                stackIn_192_5 = stackOut_191_5;
                                stackIn_192_6 = stackOut_191_6;
                                stackIn_192_7 = stackOut_191_7;
                                stackIn_192_8 = stackOut_191_8;
                                stackIn_192_9 = stackOut_191_9;
                                stackIn_192_10 = stackOut_191_10;
                                stackIn_192_11 = stackOut_191_11;
                                stackIn_192_12 = stackOut_191_12;
                                stackIn_192_13 = stackOut_191_13;
                                if (2 > hi.field_j) {
                                  stackOut_194_0 = null;
                                  stackOut_194_1 = null;
                                  stackOut_194_2 = stackIn_194_2;
                                  stackOut_194_3 = stackIn_194_3;
                                  stackOut_194_4 = (String[]) ((Object) stackIn_194_4);
                                  stackOut_194_5 = stackIn_194_5;
                                  stackOut_194_6 = stackIn_194_6;
                                  stackOut_194_7 = (dg) ((Object) stackIn_194_7);
                                  stackOut_194_8 = stackIn_194_8;
                                  stackOut_194_9 = stackIn_194_9;
                                  stackOut_194_10 = stackIn_194_10;
                                  stackOut_194_11 = stackIn_194_11;
                                  stackOut_194_12 = stackIn_194_12;
                                  stackOut_194_13 = stackIn_194_13;
                                  stackOut_194_14 = 0;
                                  stackIn_195_0 = stackOut_194_0;
                                  stackIn_195_1 = stackOut_194_1;
                                  stackIn_195_2 = stackOut_194_2;
                                  stackIn_195_3 = stackOut_194_3;
                                  stackIn_195_4 = stackOut_194_4;
                                  stackIn_195_5 = stackOut_194_5;
                                  stackIn_195_6 = stackOut_194_6;
                                  stackIn_195_7 = stackOut_194_7;
                                  stackIn_195_8 = stackOut_194_8;
                                  stackIn_195_9 = stackOut_194_9;
                                  stackIn_195_10 = stackOut_194_10;
                                  stackIn_195_11 = stackOut_194_11;
                                  stackIn_195_12 = stackOut_194_12;
                                  stackIn_195_13 = stackOut_194_13;
                                  stackIn_195_14 = stackOut_194_14;
                                  break L50;
                                } else {
                                  stackOut_192_0 = null;
                                  stackOut_192_1 = null;
                                  stackOut_192_2 = stackIn_192_2;
                                  stackOut_192_3 = stackIn_192_3;
                                  stackOut_192_4 = (String[]) ((Object) stackIn_192_4);
                                  stackOut_192_5 = stackIn_192_5;
                                  stackOut_192_6 = stackIn_192_6;
                                  stackOut_192_7 = (dg) ((Object) stackIn_192_7);
                                  stackOut_192_8 = stackIn_192_8;
                                  stackOut_192_9 = stackIn_192_9;
                                  stackOut_192_10 = stackIn_192_10;
                                  stackOut_192_11 = stackIn_192_11;
                                  stackOut_192_12 = stackIn_192_12;
                                  stackOut_192_13 = stackIn_192_13;
                                  stackOut_192_14 = 1;
                                  stackIn_195_0 = stackOut_192_0;
                                  stackIn_195_1 = stackOut_192_1;
                                  stackIn_195_2 = stackOut_192_2;
                                  stackIn_195_3 = stackOut_192_3;
                                  stackIn_195_4 = stackOut_192_4;
                                  stackIn_195_5 = stackOut_192_5;
                                  stackIn_195_6 = stackOut_192_6;
                                  stackIn_195_7 = stackOut_192_7;
                                  stackIn_195_8 = stackOut_192_8;
                                  stackIn_195_9 = stackOut_192_9;
                                  stackIn_195_10 = stackOut_192_10;
                                  stackIn_195_11 = stackOut_192_11;
                                  stackIn_195_12 = stackOut_192_12;
                                  stackIn_195_13 = stackOut_192_13;
                                  stackIn_195_14 = stackOut_192_14;
                                  break L50;
                                }
                              }
                              L51: {
                                L52: {
                                  var10 = new ic(stackIn_195_2 != 0, stackIn_195_3, stackIn_195_4, stackIn_195_5, stackIn_195_6 != 0, stackIn_195_7, stackIn_195_8, stackIn_195_9, stackIn_195_10, stackIn_195_11 != 0, stackIn_195_12, stackIn_195_13, stackIn_195_14 != 0, (om) null);
                                  if (-65 == (nm.field_o ^ -1)) {
                                    break L52;
                                  } else {
                                    bc.field_a = var10;
                                    gk.field_H = true;
                                    if (var11 == 0) {
                                      break L51;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                fj.field_c = true;
                                rd.field_j = var10;
                                dv.a(true);
                                bw.d(7242);
                                pc.b((byte) 16);
                                break L51;
                              }
                              qn.b();
                              bv.a(false, -1, 1, jt.field_a);
                              dn.field_Qb = false;
                              io.field_w = true;
                              if (var11 == 0) {
                                continue L20;
                              } else {
                                break L43;
                              }
                            }
                          }
                          L53: {
                            if (66 == nm.field_o) {
                              L54: {
                                L55: {
                                  if (fj.field_c) {
                                    break L55;
                                  } else {
                                    if (gk.field_H) {
                                      break L55;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                                L56: {
                                  if (!fj.field_c) {
                                    break L56;
                                  } else {
                                    if (null != rd.field_j) {
                                      rd.field_j.d(127, false);
                                      break L56;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                                ma.field_Z = true;
                                vs.field_j = true;
                                s.field_d = 0;
                                du.field_h = false;
                                bv.a(false, -2, 1, jt.field_a);
                                fj.field_c = false;
                                gk.field_H = false;
                                uc.a(0);
                                break L54;
                              }
                              dn.field_Qb = false;
                              if (var11 == 0) {
                                continue L20;
                              } else {
                                break L53;
                              }
                            } else {
                              break L53;
                            }
                          }
                          L57: {
                            var2 = null;
                            if (!fj.field_c) {
                              if (gk.field_H) {
                                var2 = bc.field_a;
                                break L57;
                              } else {
                                break L57;
                              }
                            } else {
                              var2 = rd.field_j;
                              break L57;
                            }
                          }
                          L58: {
                            if (var2 == null) {
                              break L58;
                            } else {
                              L59: {
                                if (-78 != (nm.field_o ^ -1)) {
                                  break L59;
                                } else {
                                  ((ic) (var2)).field_xb.a(fk.field_b, mg.field_e, (byte) -81);
                                  if (var11 == 0) {
                                    continue L20;
                                  } else {
                                    break L59;
                                  }
                                }
                              }
                              L60: {
                                if (-68 == (nm.field_o ^ -1)) {
                                  L61: {
                                    if (((ic) (var2)).field_xb.field_Ab) {
                                      break L61;
                                    } else {
                                      L62: {
                                        ((ic) (var2)).field_xb.field_Z.field_q = 0;
                                        ((ic) (var2)).field_xb.b(0, ((ic) (var2)).field_xb.field_Z);
                                        ((ic) (var2)).field_xb.field_Z = null;
                                        mu.field_a = new cg();
                                        ((ic) (var2)).field_Ib.a(((ic) (var2)).field_xb.field_hb, 0);
                                        ((ic) (var2)).field_d = mc.field_d[((ic) (var2)).field_xb.field_hb].field_n;
                                        oo.e(-387);
                                        if ((((ic) (var2)).field_xb.field_D ^ -1) == -4) {
                                          ((ic) (var2)).f(true);
                                          break L62;
                                        } else {
                                          break L62;
                                        }
                                      }
                                      L63: {
                                        ((ic) (var2)).h(true);
                                        hc.a(((ic) (var2)).field_q, false);
                                        ((ic) (var2)).field_xb.field_Ab = true;
                                        if (((ic) (var2)).field_q > -1) {
                                          break L63;
                                        } else {
                                          bg.a(-1, op.field_c[0][0]);
                                          if (var11 == 0) {
                                            break L61;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                      bg.a(-1, op.field_c[0][((ic) (var2)).field_xb.o(((ic) (var2)).field_q, -1)]);
                                      break L61;
                                    }
                                  }
                                  L64: {
                                    L65: {
                                      var3 = mg.field_e.k(0);
                                      var4 = mg.field_e.k(0);
                                      var5_int = mg.field_e.e((byte) -104);
                                      if (((ic) (var2)).field_xb.field_gb != var3) {
                                        break L65;
                                      } else {
                                        if (var4 == ((ic) (var2)).field_xb.field_Gb) {
                                          stackOut_255_0 = 0;
                                          stackIn_256_0 = stackOut_255_0;
                                          break L64;
                                        } else {
                                          break L65;
                                        }
                                      }
                                    }
                                    stackOut_253_0 = 1;
                                    stackIn_256_0 = stackOut_253_0;
                                    break L64;
                                  }
                                  L66: {
                                    var6 = stackIn_256_0;
                                    if (var6 == 0) {
                                      break L66;
                                    } else {
                                      ((ic) (var2)).field_Hb = uk.field_n;
                                      if (!((ic) (var2)).field_xb.field_X) {
                                        ((ic) (var2)).field_xb.field_l.a((byte) -119, (tc) (new kc(var4, var3)));
                                        if (var11 == 0) {
                                          continue L20;
                                        } else {
                                          break L66;
                                        }
                                      } else {
                                        continue L20;
                                      }
                                    }
                                  }
                                  ((ic) (var2)).field_ub = null;
                                  ((ic) (var2)).field_p = var5_int;
                                  ((ic) (var2)).field_Tb = false;
                                  if (var11 == 0) {
                                    continue L20;
                                  } else {
                                    break L60;
                                  }
                                } else {
                                  break L60;
                                }
                              }
                              L67: {
                                if (68 != nm.field_o) {
                                  break L67;
                                } else {
                                  ((ic) (var2)).field_xb.a((vh) (mg.field_e), (byte) -67);
                                  if (((ic) (var2)).field_xb.field_gb != ((ic) (var2)).field_xb.field_sb) {
                                    continue L20;
                                  } else {
                                    if (-1 == (1 << ((ic) (var2)).field_xb.field_sb & ((ic) (var2)).field_xb.field_e ^ -1)) {
                                      continue L20;
                                    } else {
                                      ((ic) (var2)).i(0);
                                      if (var11 == 0) {
                                        continue L20;
                                      } else {
                                        break L67;
                                      }
                                    }
                                  }
                                }
                              }
                              L68: {
                                if ((nm.field_o ^ -1) == -79) {
                                  ub.field_d = mg.field_e.i(1);
                                  if (var11 == 0) {
                                    continue L20;
                                  } else {
                                    break L68;
                                  }
                                } else {
                                  break L68;
                                }
                              }
                              L69: {
                                if (76 != nm.field_o) {
                                  break L69;
                                } else {
                                  L70: {
                                    L71: {
                                      var3 = mg.field_e.k(0);
                                      if ((var3 ^ -1) == -1) {
                                        break L71;
                                      } else {
                                        ((ic) (var2)).field_Tb = true;
                                        if (var11 == 0) {
                                          break L70;
                                        } else {
                                          break L71;
                                        }
                                      }
                                    }
                                    ((ic) (var2)).field_Tb = false;
                                    break L70;
                                  }
                                  ((ic) (var2)).field_Vb = mg.field_e.e((byte) -104);
                                  if (var11 == 0) {
                                    continue L20;
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                              L72: {
                                if (-70 != (nm.field_o ^ -1)) {
                                  break L72;
                                } else {
                                  var3_ref_int__ = new int[((ic) (var2)).field_xb.field_tb];
                                  var4_ref_int__ = new int[((ic) (var2)).field_xb.field_W];
                                  var5 = new int[((ic) (var2)).field_xb.field_W];
                                  var6 = mg.field_e.k(0);
                                  var7 = 0;
                                  L73: while (true) {
                                    L74: {
                                      L75: {
                                        if (((ic) (var2)).field_xb.field_tb <= var7) {
                                          break L75;
                                        } else {
                                          var3_ref_int__[var7] = mg.field_e.k(0);
                                          var7++;
                                          if (var11 != 0) {
                                            break L74;
                                          } else {
                                            if (var11 == 0) {
                                              continue L73;
                                            } else {
                                              break L75;
                                            }
                                          }
                                        }
                                      }
                                      var7 = 0;
                                      break L74;
                                    }
                                    L76: while (true) {
                                      L77: {
                                        L78: {
                                          if ((var7 ^ -1) <= (((ic) (var2)).field_xb.field_W ^ -1)) {
                                            break L78;
                                          } else {
                                            var5[var7] = mg.field_e.k(0);
                                            var4_ref_int__[var7] = mg.field_e.e((byte) -104);
                                            var7++;
                                            if (var11 != 0) {
                                              break L77;
                                            } else {
                                              if (var11 == 0) {
                                                continue L76;
                                              } else {
                                                break L78;
                                              }
                                            }
                                          }
                                        }
                                        ((ic) (var2)).field_xb.a(var6, true, var3_ref_int__);
                                        ((ic) (var2)).field_xb.field_rb = var5;
                                        ((ic) (var2)).field_xb.field_G = var4_ref_int__;
                                        break L77;
                                      }
                                      L79: {
                                        L80: {
                                          if (0 > ((ic) (var2)).field_q) {
                                            break L80;
                                          } else {
                                            ((ic) (var2)).field_Gb = ((ic) (var2)).field_xb.field_rb[((ic) (var2)).field_q] * 768 >> 1433793256;
                                            if ((((ic) (var2)).field_Gb ^ -1) >= (pg.field_d.field_j ^ -1)) {
                                              break L79;
                                            } else {
                                              ((ic) (var2)).field_Gb = pg.field_d.field_j;
                                              if (var11 == 0) {
                                                break L79;
                                              } else {
                                                break L80;
                                              }
                                            }
                                          }
                                        }
                                        ((ic) (var2)).field_Gb = 0;
                                        break L79;
                                      }
                                      ((ic) (var2)).d(true);
                                      if (var11 == 0) {
                                        continue L20;
                                      } else {
                                        break L72;
                                      }
                                    }
                                  }
                                }
                              }
                              L81: {
                                if (nm.field_o == 70) {
                                  ((ic) (var2)).field_xb.field_C = mg.field_e.k(0);
                                  if (null == rd.field_j) {
                                    continue L20;
                                  } else {
                                    dv.a(true);
                                    if (var11 == 0) {
                                      continue L20;
                                    } else {
                                      break L81;
                                    }
                                  }
                                } else {
                                  break L81;
                                }
                              }
                              L82: {
                                if ((nm.field_o ^ -1) != -72) {
                                  break L82;
                                } else {
                                  ((ic) (var2)).field_xb.a(0, mg.field_e.k(0));
                                  if (rd.field_j == null) {
                                    continue L20;
                                  } else {
                                    dv.a(true);
                                    if (var11 == 0) {
                                      continue L20;
                                    } else {
                                      break L82;
                                    }
                                  }
                                }
                              }
                              L83: {
                                if ((nm.field_o ^ -1) == -74) {
                                  ((ic) (var2)).field_xb.g(mg.field_e.k(0), -119);
                                  if (null != rd.field_j) {
                                    dv.a(true);
                                    if (var11 == 0) {
                                      continue L20;
                                    } else {
                                      break L83;
                                    }
                                  } else {
                                    continue L20;
                                  }
                                } else {
                                  break L83;
                                }
                              }
                              L84: {
                                if (-73 == (nm.field_o ^ -1)) {
                                  ((ic) (var2)).field_xb.field_i = mg.field_e.k(0);
                                  if (null == rd.field_j) {
                                    continue L20;
                                  } else {
                                    bw.d(7242);
                                    if (var11 == 0) {
                                      continue L20;
                                    } else {
                                      break L84;
                                    }
                                  }
                                } else {
                                  break L84;
                                }
                              }
                              if (-74 != (nm.field_o ^ -1)) {
                                break L58;
                              } else {
                                ((ic) (var2)).field_hb = mg.field_e.k(0);
                                if (null == rd.field_j) {
                                  continue L20;
                                } else {
                                  bw.d(7242);
                                  if (var11 == 0) {
                                    continue L20;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                            }
                          }
                          this.j(12);
                          if (var11 == 0) {
                            continue L20;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    stackOut_336_0 = 30;
                    stackOut_336_1 = 0;
                    stackIn_337_0 = stackOut_336_0;
                    stackIn_337_1 = stackOut_336_1;
                    break L21;
                  }
                  hb.a((byte) stackIn_337_0, stackIn_337_1);
                  break L17;
                }
              }
              L85: {
                if (!ma.field_Z) {
                  break L85;
                } else {
                  s.field_d = 0;
                  break L85;
                }
              }
              L86: {
                L87: {
                  if (!br.field_f[82]) {
                    break L87;
                  } else {
                    if (!br.field_f[74]) {
                      break L87;
                    } else {
                      stackOut_345_0 = 1;
                      stackIn_348_0 = stackOut_345_0;
                      break L86;
                    }
                  }
                }
                stackOut_347_0 = 0;
                stackIn_348_0 = stackOut_347_0;
                break L86;
              }
              L88: {
                var2_int = stackIn_348_0;
                if (qv.j(-11)) {
                  L89: {
                    L90: {
                      var3 = this.h((byte) -116);
                      if ((var3 ^ -1) == -1) {
                        break L90;
                      } else {
                        if ((var3 ^ -1) != -2) {
                          break L89;
                        } else {
                          break L90;
                        }
                      }
                    }
                    L91: {
                      ee.a(2, (byte) 37);
                      bw.a(127, 3);
                      ah.a((byte) 33, 4);
                      op.a(5, true);
                      pj.b(6, -32666);
                      aw.a(7, 1742);
                      bo.a(true);
                      if (var3 == 1) {
                        break L91;
                      } else {
                        L92: {
                          if (kg.field_d) {
                            L93: {
                              L94: {
                                du.field_h = false;
                                cl.field_t = true;
                                vs.field_j = true;
                                if (fj.field_c) {
                                  break L94;
                                } else {
                                  bv.a(false, 0, 1, 0);
                                  if (var11 == 0) {
                                    break L93;
                                  } else {
                                    break L94;
                                  }
                                }
                              }
                              pr.field_i = g.field_d;
                              bv.a(false, 11, 1, 0);
                              break L93;
                            }
                            ut.i((byte) 126);
                            rq.field_p[jt.field_a].a(100, false, 0);
                            gk.field_H = false;
                            fj.field_c = false;
                            kg.field_d = false;
                            uc.a(0);
                            break L92;
                          } else {
                            break L92;
                          }
                        }
                        dn.field_Qb = false;
                        ua.field_t = false;
                        if (var11 == 0) {
                          break L89;
                        } else {
                          break L91;
                        }
                      }
                    }
                    dn.field_Qb = true;
                    ua.field_t = true;
                    break L89;
                  }
                  L95: {
                    var4 = 0;
                    if (2 == var3) {
                      var4 = 1;
                      break L95;
                    } else {
                      break L95;
                    }
                  }
                  L96: {
                    if (var2_int == 0) {
                      break L96;
                    } else {
                      var4 = 1;
                      break L96;
                    }
                  }
                  L97: {
                    L98: {
                      if (kg.field_d) {
                        break L98;
                      } else {
                        if (ua.field_t) {
                          break L98;
                        } else {
                          if (dn.field_Qb) {
                            break L98;
                          } else {
                            break L97;
                          }
                        }
                      }
                    }
                    var4 = 1;
                    break L97;
                  }
                  L99: {
                    if (!qv.j(-11)) {
                      var4 = 0;
                      break L99;
                    } else {
                      break L99;
                    }
                  }
                  if (var4 == 0) {
                    break L88;
                  } else {
                    er.b(-11);
                    break L88;
                  }
                } else {
                  break L88;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (var2), "ArmiesOfGielinor.QA(" + param0 + ')');
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

    public ArmiesOfGielinor() {
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              mj.b((byte) -82);
              if (null != wq.field_a) {
                ck.b(-116);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              pg.a(false);
              if (param0 == 103) {
                break L2;
              } else {
                this.a(true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ArmiesOfGielinor.OA(" + param0 + ')');
        }
    }

    private final boolean q(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (!ki.field_b.a((byte) 82)) {
                break L1;
              } else {
                if (!ki.field_b.d(-27927)) {
                  break L1;
                } else {
                  L2: {
                    if (!i.field_Lb.a((byte) 82)) {
                      break L2;
                    } else {
                      if (!i.field_Lb.d(-27927)) {
                        break L2;
                      } else {
                        if (param0 <= -18) {
                          L3: {
                            if (!op.field_b.a((byte) 82)) {
                              break L3;
                            } else {
                              if (op.field_b.d(-27927)) {
                                L4: {
                                  if (!bi.field_f.a((byte) 82)) {
                                    break L4;
                                  } else {
                                    if (!bi.field_f.d(-27927)) {
                                      break L4;
                                    } else {
                                      L5: {
                                        if (!nm.field_s.a((byte) 82)) {
                                          break L5;
                                        } else {
                                          if (nm.field_s.d(-27927)) {
                                            stackOut_39_0 = 1;
                                            stackIn_40_0 = stackOut_39_0;
                                            decompiledRegionSelector0 = 6;
                                            break L0;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      bn.a((byte) -24, 67.0f, ao.a(cr.field_eb, true, en.field_G, nm.field_s));
                                      stackOut_37_0 = 0;
                                      stackIn_38_0 = stackOut_37_0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    }
                                  }
                                }
                                bn.a((byte) -24, 67.0f, ao.a(cr.field_eb, true, en.field_G, bi.field_f));
                                stackOut_31_0 = 0;
                                stackIn_32_0 = stackOut_31_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                break L3;
                              }
                            }
                          }
                          bn.a((byte) -24, 67.0f, vl.a(op.field_b, 0, en.field_G, "", cr.field_eb));
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  bn.a((byte) -24, 67.0f, ao.a(cr.field_eb, true, en.field_G, i.field_Lb));
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            bn.a((byte) -24, 67.0f, ao.a(cr.field_eb, true, en.field_G, ki.field_b));
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ArmiesOfGielinor.KA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_38_0 != 0;
                  } else {
                    return stackIn_40_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    public final void init() {
        try {
            this.a((byte) 31, 25, "armiesofgielinor");
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.init()");
        }
    }

    private final void d(int param0, boolean param1) {
        boolean discarded$3 = false;
        int fieldTemp$4 = 0;
        tc discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        om stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        om stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        om stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        om stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        sl stackIn_197_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_92_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        om stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        om stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        Object stackOut_196_2 = null;
        om stackOut_192_0 = null;
        int stackOut_192_1 = 0;
        om stackOut_194_0 = null;
        int stackOut_194_1 = 0;
        sl stackOut_194_2 = null;
        var8 = field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((pg.field_f ^ -1) != (pg.field_e ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 0;
                    if (null != oa.field_I) {
                      oa.field_I.a((byte) -120, true);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var4 = 0;
                    if (param1) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            if ((jt.field_a ^ -1) != 0) {
                              break L7;
                            } else {
                              L8: {
                                if (kg.field_d) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (rd.field_j != null) {
                                      break L9;
                                    } else {
                                      bv.a(false, 0, 1, jt.field_a);
                                      if (var8 == 0) {
                                        break L6;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  rd.field_j.a(112, true);
                                  L10: while (true) {
                                    if (!jd.i((byte) -89)) {
                                      break L6;
                                    } else {
                                      if (gu.a(param0 + 56)) {
                                        continue L10;
                                      } else {
                                        rd.field_j.g(false);
                                        if (var8 != 0) {
                                          break L5;
                                        } else {
                                          if (var8 == 0) {
                                            continue L10;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var3_int = 1;
                              var4 = 1;
                              if (var8 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L11: {
                            if (-2 == jt.field_a) {
                              break L11;
                            } else {
                              L12: {
                                if (jt.field_a == -6) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (-7 != jt.field_a) {
                                      break L13;
                                    } else {
                                      dm.c((byte) 61);
                                      if (var8 == 0) {
                                        break L6;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  if (!nm.a(jt.field_a, true)) {
                                    break L6;
                                  } else {
                                    rq.field_p[jt.field_a].d((byte) -109);
                                    if (var8 == 0) {
                                      break L6;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              kl.c(-20193);
                              if (var8 == 0) {
                                break L6;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var3_int = 1;
                          break L6;
                        }
                        if (mu.field_a != null) {
                          qc.field_j = qc.field_j + 1;
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                      if (50 != qc.field_j) {
                        break L4;
                      } else {
                        ut.i((byte) 127);
                        break L4;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (!kg.field_d) {
                          break L16;
                        } else {
                          if (ua.field_t) {
                            break L16;
                          } else {
                            if (!dn.field_Qb) {
                              L17: {
                                if (!fj.field_c) {
                                  break L17;
                                } else {
                                  if (hf.field_c) {
                                    var3_int = 0;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                wt.a(73, var3_int != 0);
                                if (!gk.field_H) {
                                  break L18;
                                } else {
                                  bc.field_a.a(109, var4 != 0);
                                  break L18;
                                }
                              }
                              L19: {
                                if (fj.field_c) {
                                  pr.a(320, 180, var4 != 0, 0);
                                  rd.field_j.a(param0 + 119, var4 != 0);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: while (true) {
                                if (!jd.i((byte) -127)) {
                                  break L16;
                                } else {
                                  L21: {
                                    if (!gu.a(param0 + -126)) {
                                      break L21;
                                    } else {
                                      if (var8 == 0) {
                                        continue L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  L22: {
                                    if (!ma.field_Z) {
                                      break L22;
                                    } else {
                                      L23: {
                                        if (fj.field_c) {
                                          break L23;
                                        } else {
                                          discarded$3 = bb.a(12, 15, 13, param0 + 50);
                                          if (var8 == 0) {
                                            break L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      L24: {
                                        stackOut_92_0 = -66;
                                        stackIn_97_0 = stackOut_92_0;
                                        stackIn_93_0 = stackOut_92_0;
                                        if (qa.field_F) {
                                          stackOut_97_0 = stackIn_97_0;
                                          stackOut_97_1 = 77;
                                          stackIn_98_0 = stackOut_97_0;
                                          stackIn_98_1 = stackOut_97_1;
                                          break L24;
                                        } else {
                                          stackOut_93_0 = stackIn_93_0;
                                          stackIn_95_0 = stackOut_93_0;
                                          stackOut_95_0 = stackIn_95_0;
                                          stackOut_95_1 = 12;
                                          stackIn_98_0 = stackOut_95_0;
                                          stackIn_98_1 = stackOut_95_1;
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        stackOut_98_0 = stackIn_98_0;
                                        stackOut_98_1 = stackIn_98_1;
                                        stackIn_101_0 = stackOut_98_0;
                                        stackIn_101_1 = stackOut_98_1;
                                        stackIn_99_0 = stackOut_98_0;
                                        stackIn_99_1 = stackOut_98_1;
                                        if (qa.field_F) {
                                          stackOut_101_0 = stackIn_101_0;
                                          stackOut_101_1 = stackIn_101_1;
                                          stackOut_101_2 = 78;
                                          stackIn_102_0 = stackOut_101_0;
                                          stackIn_102_1 = stackOut_101_1;
                                          stackIn_102_2 = stackOut_101_2;
                                          break L25;
                                        } else {
                                          stackOut_99_0 = stackIn_99_0;
                                          stackOut_99_1 = stackIn_99_1;
                                          stackOut_99_2 = 15;
                                          stackIn_102_0 = stackOut_99_0;
                                          stackIn_102_1 = stackOut_99_1;
                                          stackIn_102_2 = stackOut_99_2;
                                          break L25;
                                        }
                                      }
                                      if (!ja.a((byte) stackIn_102_0, stackIn_102_1, stackIn_102_2, 13)) {
                                        break L22;
                                      } else {
                                        if (var8 == 0) {
                                          continue L20;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                  L26: {
                                    if (!gk.field_H) {
                                      break L26;
                                    } else {
                                      bc.field_a.g(false);
                                      break L26;
                                    }
                                  }
                                  if (!fj.field_c) {
                                    continue L20;
                                  } else {
                                    rd.field_j.g(false);
                                    if (var8 != 0) {
                                      break L15;
                                    } else {
                                      if (var8 == 0) {
                                        continue L20;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      if (!kg.field_d) {
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                    br.a((byte) -97);
                    break L14;
                  }
                  L27: {
                    L28: {
                      if (!ma.field_Z) {
                        break L28;
                      } else {
                        if ((mj.field_c ^ -1) < (q.field_F ^ -1)) {
                          q.field_F = q.field_F + 1;
                          if (var8 == 0) {
                            break L27;
                          } else {
                            break L28;
                          }
                        } else {
                          break L27;
                        }
                      }
                    }
                    if (0 < q.field_F) {
                      q.field_F = q.field_F - 1;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L29: {
                    var5 = mj.field_c * mj.field_c;
                    var6 = -(q.field_F * q.field_F) + var5;
                    var7 = qn.field_g - (120 + -(var6 * 120 / var5));
                    ua.b(8, var7);
                    if (null == ai.field_P.e((byte) 111)) {
                      break L29;
                    } else {
                      fieldTemp$4 = lq.field_b + 1;
                      lq.field_b = lq.field_b + 1;
                      if ((fieldTemp$4 ^ -1) != -336) {
                        break L29;
                      } else {
                        lq.field_b = 0;
                        discarded$5 = ai.field_P.a(0);
                        break L29;
                      }
                    }
                  }
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L30: {
                if ((cj.field_h ^ -1) != (pg.field_f ^ -1)) {
                  break L30;
                } else {
                  pk.field_X = pk.field_X + 1;
                  if (pk.field_X != 16) {
                    break L1;
                  } else {
                    L31: {
                      L32: {
                        if (ke.field_a) {
                          break L32;
                        } else {
                          ed.a(false);
                          if (var8 == 0) {
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                      iq.b(-20267);
                      break L31;
                    }
                    pg.field_f = or.field_c;
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L30;
                    }
                  }
                }
              }
              L33: {
                if (or.field_c == pg.field_f) {
                  break L33;
                } else {
                  pk.field_X = pk.field_X - 1;
                  if ((pk.field_X ^ -1) == -1) {
                    pg.field_f = pg.field_e;
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L33;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L34: {
                if (!nw.g(119)) {
                  L35: {
                    if (pq.field_f == null) {
                      break L35;
                    } else {
                      wa.a(3, 1, pq.field_f);
                      break L35;
                    }
                  }
                  L36: {
                    sk.n(param0 ^ -110);
                    bv.a(false, tg.field_a, 1, 0);
                    if (!ke.field_a) {
                      break L36;
                    } else {
                      ke.field_a = false;
                      sm.a(false, 8028);
                      break L36;
                    }
                  }
                  L37: {
                    if (!tv.field_a) {
                      break L37;
                    } else {
                      bv.a(false, -4, 1, jt.field_a);
                      break L37;
                    }
                  }
                  if (!nm.a(jt.field_a, true)) {
                    break L34;
                  } else {
                    ut.i((byte) 125);
                    break L34;
                  }
                } else {
                  break L34;
                }
              }
              pg.field_f = mq.field_Wb;
              break L1;
            }
            L38: {
              if (param0 == 0) {
                break L38;
              } else {
                this.a((byte) -98);
                break L38;
              }
            }
            L39: {
              if (2 == (jt.field_a ^ -1)) {
                this.a(false, (byte) -62);
                rd.field_j.h(true);
                var3_int = r.field_s ? 1 : 0;
                bv.a(var3_int != 0, -1, 1, 0);
                du.field_h = true;
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              L41: {
                if (9 == (jt.field_a ^ -1)) {
                  break L41;
                } else {
                  if (jt.field_a != -11) {
                    break L40;
                  } else {
                    break L41;
                  }
                }
              }
              L42: {
                stackOut_191_0 = l.field_c;
                stackOut_191_1 = -1;
                stackIn_196_0 = stackOut_191_0;
                stackIn_196_1 = stackOut_191_1;
                stackIn_192_0 = stackOut_191_0;
                stackIn_192_1 = stackOut_191_1;
                if ((jt.field_a ^ -1) != 10) {
                  stackOut_196_0 = (om) ((Object) stackIn_196_0);
                  stackOut_196_1 = stackIn_196_1;
                  stackOut_196_2 = null;
                  stackIn_197_0 = stackOut_196_0;
                  stackIn_197_1 = stackOut_196_1;
                  stackIn_197_2 = (sl) ((Object) stackOut_196_2);
                  break L42;
                } else {
                  stackOut_192_0 = (om) ((Object) stackIn_192_0);
                  stackOut_192_1 = stackIn_192_1;
                  stackIn_194_0 = stackOut_192_0;
                  stackIn_194_1 = stackOut_192_1;
                  stackOut_194_0 = (om) ((Object) stackIn_194_0);
                  stackOut_194_1 = stackIn_194_1;
                  stackOut_194_2 = ku.j(127);
                  stackIn_197_0 = stackOut_194_0;
                  stackIn_197_1 = stackOut_194_1;
                  stackIn_197_2 = stackOut_194_2;
                  break L42;
                }
              }
              L43: {
                ts.a(stackIn_197_0, stackIn_197_1, stackIn_197_2);
                if ((jt.field_a ^ -1) != 9) {
                  break L43;
                } else {
                  qh.b((byte) 27);
                  break L43;
                }
              }
              rd.field_j.h(true);
              var3_int = r.field_s ? 1 : 0;
              bv.a(var3_int != 0, -1, 1, 0);
              du.field_h = true;
              break L40;
            }
            L44: {
              if ((jt.field_a ^ -1) != 7) {
                break L44;
              } else {
                this.a(true, (byte) -67);
                rd.field_j.k((byte) -113);
                rd.field_j.h(true);
                var3_int = r.field_s ? 1 : 0;
                bv.a(var3_int != 0, -1, 1, 0);
                du.field_h = true;
                break L44;
              }
            }
            L45: {
              if ((jt.field_a ^ -1) == 8) {
                this.a(true, (byte) -90);
                rd.field_j.t((byte) 60);
                rd.field_j.h(true);
                var3_int = r.field_s ? 1 : 0;
                bv.a(var3_int != 0, -1, 1, 0);
                du.field_h = true;
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              if (-4 == jt.field_a) {
                vl.field_n.h(32161, 9);
                ua.field_t = true;
                q.field_F = mj.field_c;
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              if ((jt.field_a ^ -1) == 4) {
                L48: {
                  L49: {
                    if (!gk.field_H) {
                      break L49;
                    } else {
                      ov.a(11, 3, 0);
                      if (var8 == 0) {
                        break L48;
                      } else {
                        break L49;
                      }
                    }
                  }
                  if (!fj.field_c) {
                    break L48;
                  } else {
                    pq.a(-81, vu.field_M.d((byte) 117), 11);
                    break L48;
                  }
                }
                dn.field_Qb = true;
                break L47;
              } else {
                break L47;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ArmiesOfGielinor.EA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        ic var3 = null;
        int var4 = 0;
        int stackIn_21_0 = 0;
        int stackIn_65_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_64_0 = false;
        int stackOut_62_0 = 0;
        try {
          L0: {
            var2 = ll.p(0);
            if (!ql.h(param0 ^ 31337)) {
              if (!qu.field_q) {
                pr.a((byte) 121, var2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (dl.d(param0 + 95)) {
                  L1: {
                    L2: {
                      L3: {
                        if (rd.field_j != null) {
                          break L3;
                        } else {
                          if (null == bc.field_a) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if ((jt.field_a ^ -1) != -8) {
                        break L2;
                      } else {
                        stackOut_18_0 = 1;
                        stackIn_21_0 = stackOut_18_0;
                        break L1;
                      }
                    }
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L1;
                  }
                  L4: {
                    io.field_w = stackIn_21_0 != 0;
                    if (param0 <= (sm.field_d ^ -1)) {
                      break L4;
                    } else {
                      if (-1 < ko.field_b) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    ei.a(jt.field_a, true, io.field_w, false);
                    if (null == mu.field_a) {
                      break L5;
                    } else {
                      mu.field_a.a(param0 ^ 8, qc.field_j);
                      qc.field_j = qc.field_j + 1;
                      if (50 == qc.field_j) {
                        ut.i((byte) 126);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (!io.field_w) {
                        break L7;
                      } else {
                        if (du.field_h) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    tq.a(sq.c((byte) 54), false);
                    break L6;
                  }
                  L8: {
                    var3 = rd.field_j;
                    if (gk.field_H) {
                      var3 = bc.field_a;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (var3 == null) {
                      break L9;
                    } else {
                      if (null != var3.field_vb) {
                        break L9;
                      } else {
                        ig.field_t.a(0, 0);
                        fe.c(vp.field_A, 320, 200, nd.field_b, false);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    this.c(false);
                    if (null != oa.field_I) {
                      oa.field_I.b(89);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      if (ed.a(-89)) {
                        break L12;
                      } else {
                        if (!an.e((byte) 93)) {
                          break L11;
                        } else {
                          qn.d(0, 0, qn.field_l, qn.field_g);
                          an.h(1976460609);
                          if (!field_M) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      if (wq.field_a == null) {
                        stackOut_64_0 = ph.field_f;
                        stackIn_65_0 = stackOut_64_0 ? 1 : 0;
                        break L13;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_65_0 = stackOut_62_0;
                        break L13;
                      }
                    }
                    bl.a(stackIn_65_0 != 0, -5);
                    break L11;
                  }
                  L14: {
                    if ((pg.field_f ^ -1) == (pg.field_e ^ -1)) {
                      break L14;
                    } else {
                      var4 = pk.field_X * 256 / 16;
                      if (-1 <= (var4 ^ -1)) {
                        break L14;
                      } else {
                        qn.b(0, 0, qn.field_l, qn.field_g, 0, var4);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (hi.field_j < 2) {
                      break L15;
                    } else {
                      if (ln.field_e) {
                        rs.field_n.b(Integer.toString(hr.field_i), 8, 23, 16777215, 1);
                        rs.field_n.a((Runtime.getRuntime().totalMemory() + -Runtime.getRuntime().freeMemory()) / 1024L + "kB", 500, 100, 16777215, 1);
                        rs.field_n.a(Runtime.getRuntime().totalMemory() / 1024L + "kB", 500, 120, 16777215, 1);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  oa.h(2);
                  pt.a(0, 12, var2, 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  bn.a((byte) -24, 100.0f, en.field_G);
                  pr.a((byte) 122, var2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              iv.a(false, fs.a(false), var2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "ArmiesOfGielinor.DA(" + param0 + ')');
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
              return;
            }
          }
        }
    }

    public static void s(int param0) {
        tu discarded$2 = null;
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_L = null;
              field_H = null;
              field_J = null;
              if (param0 == 3) {
                break L1;
              } else {
                discarded$2 = ArmiesOfGielinor.a((byte[]) null, false);
                break L1;
              }
            }
            field_I = null;
            field_N = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "ArmiesOfGielinor.MA(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ArmiesOfGielinor.s(3);
            jg.a(-112);
            at.c(param0 + 322);
            kl.b(param0 + 71);
            rr.a(-114);
            et.c(13626);
            ed.b(15000);
            gi.a(180);
            wn.c((byte) 52);
            nm.e(256);
            gp.a((byte) 115);
            us.a(param0 ^ 30);
            cv.d((byte) 44);
            dg.a((byte) -12);
            ve.a(1);
            vn.a((byte) -8);
            hc.b(1017);
            qt.a((byte) 93);
            s.a(53);
            ik.b(param0 + -1700635368);
            hg.a(true);
            t.a(0);
            cd.a(false);
            bt.c(0);
            gv.b(93);
            fe.b();
            vi.a(true);
            wf.h(71);
            g.c(1);
            iv.d(105);
            fa.a((byte) 100);
            pq.a((byte) -79);
            el.b(-8834);
            qn.d();
            ah.a((byte) 32);
            vh.f(115);
            l.a(true);
            pv.a(213);
            hb.a(param0 ^ 71);
            dt.a(-1);
            qk.a(50);
            ov.a((byte) 50);
            mo.a(0);
            er.a(-3);
            ds.a(2);
            qc.a((byte) -108);
            bi.b(0);
            jp.a((byte) -82);
            rd.a(param0 ^ -20000072);
            fj.b((byte) -67);
            ln.a(false);
            co.a((byte) -117);
            ep.a((byte) 11);
            hm.b(0);
            sl.a(param0 + 157);
            p.a((byte) -58);
            ci.h(param0 + 71);
            cg.a((byte) -109);
            ic.d(param0 ^ 49);
            vd.a(256);
            lb.a(param0 + 13988);
            om.f(0);
            ij.c(param0 ^ 3);
            bp.c((byte) 35);
            vo.a(true);
            dd.b(-56);
            ue.b((byte) 78);
            hi.b((byte) 99);
            jd.q(-9480);
            ha.c(-1);
            ka.a();
            ke.a(param0 + 156);
            tc.b((byte) 4);
            wh.b(0);
            ji.a(0);
            ih.f(-128);
            lt.b(-51);
            ev.a(960112080);
            rc.g();
            bg.a(-83);
            mi.a(9480);
            dw.c();
            os.f(1048575);
            dj.b((byte) 116);
            it.a(param0 + 76);
            je.h(-117);
            au.e((byte) -58);
            tp.a(-116);
            of.e((byte) 20);
            ii.a((byte) -1);
            jm.a(param0 + 2);
            lg.a((byte) 126);
            ew.a(false);
            aq.a((byte) -22);
            hq.a((byte) -73);
            wl.f((byte) 97);
            gk.l(17);
            oe.j((byte) 126);
            cr.n(260);
            lw.j((byte) 49);
            ro.n(0);
            kd.f((byte) 19);
            ce.k(param0 ^ -11944);
            df.b(true);
            na.f((byte) -117);
            gl.a(true);
            fl.a((byte) 82);
            uu.a((byte) 30);
            ne.g(-107);
            am.e(-1);
            eb.a(1);
            da.a(false);
            fm.a(95);
            cm.a(false);
            lo.a(0);
            db.a(-3);
            pr.a(param0 + 7814);
            tm.b();
            dm.g(256);
            rk.q(-114);
            la.b((byte) -111);
            sg.a((byte) 93);
            ft.a(-10);
            rg.a(-84);
            bo.a(param0 ^ -4368117);
            oo.b(-8616);
            dl.c((byte) 110);
            fs.a(-1);
            ua.e(-4541);
            ej.a(-27464);
            su.a(true);
            fu.a(126);
            ag.e((byte) -127);
            vp.g(-829);
            kr.g(param0 ^ -29395);
            mb.d((byte) 113);
            st.a(true);
            jc.a((byte) 44);
            ee.f(-27538);
            hw.a((byte) -58);
            al.a((byte) 103);
            wa.c(6);
            hr.b(param0 ^ 298276648);
            uf.a(param0 + 173);
            nn.b(-104);
            ub.a((byte) -122);
            eu.a((byte) -55);
            v.d((byte) 55);
            eo.a(0);
            sj.a((byte) -95);
            iu.b(1);
            vb.f(-126);
            oj.a((byte) -103);
            fi.a(param0 ^ 101);
            ra.a(false);
            mn.a(100);
            bv.k((byte) -97);
            km.e(param0 + 77);
            sk.c(-128);
            vj.b(-106);
            gd.c();
            ms.f(param0 ^ 71);
            ac.a((byte) 71);
            ql.d((byte) 109);
            po.a(true);
            nw.d((byte) -26);
            qq.d((byte) 35);
            as.g(-19269);
            pj.a(true);
            qj.g(10);
            cn.f(123);
            ab.a((byte) 32);
            vv.b((byte) 82);
            bu.a(-128);
            mh.a((byte) -119);
            nf.k(param0 ^ -72);
            dn.k(0);
            fp.k(21755);
            ll.k(-1);
            im.g(31343);
            np.e((byte) 5);
            mp.l(-8291);
            tg.a(-97);
            i.m(73);
            ea.a(-47);
            bn.a(29022);
            lm.a(1638);
            ki.a((byte) 117);
            ck.a(14);
            th.a((byte) 73);
            h.a(-25764);
            af.b((byte) -120);
            uh.a(param0 + 20115);
            ui.d(125);
            dv.c((byte) -109);
            rq.a(-22823);
            cp.a(false);
            dp.f((byte) -123);
            si.a(18347);
            hf.a((byte) 19);
            dq.a(-1);
            ou.a(4116);
            bb.a((byte) -121);
            vs.a(param0 ^ 21);
            nr.a((byte) -119);
            so.b(param0 ^ -328);
            jn.a(param0 + -29);
            op.a(true);
            ga.b(-119);
            pg.a(20);
            ml.k(2);
            oc.k(param0 ^ -72);
            tt.a(true);
            gm.e(25931);
            mc.d(param0 + 196);
            up.d(-12428);
            ul.b(param0 ^ -90);
            wp.e((byte) -74);
            ca.a(23582);
            fd.a(-30097);
            qb.a(param0 ^ 125);
            qf.a((byte) 31);
            pn.b((byte) -90);
            r.d((byte) -11);
            sh.b((byte) 40);
            pd.a((byte) 95);
            hk.l(param0 ^ 55);
            jk.a(param0 ^ -28);
            cl.a(-31116);
            hp.g(-81);
            rt.e((byte) 91);
            kn.g(-75);
            ti.a((byte) 29);
            lq.a(-31320);
            hh.b(16);
            em.a(1);
            ud.n(12213);
            se.a(0);
            mg.b(9892);
            pb.a();
            nk.b((byte) 75);
            dc.a(540);
            ei.a(-98);
            tk.a((byte) -100);
            ao.b((byte) -120);
            or.a(false);
            kp.a(2);
            lk.a((byte) 58);
            kb.c((byte) -124);
            nl.i(-98);
            ju.a(param0 + -51);
            ut.p(0);
            ls.a(-121);
            vq.a((byte) 107);
            sf.h((byte) 58);
            gh.a(param0 + -11763);
            fw.i(0);
            ob.e((byte) 68);
            tj.d((byte) -89);
            hs.i(0);
            vr.a((byte) -37);
            jj.a((byte) -112);
            rh.a(-74);
            sc.a(-91);
            tf.a(false);
            lf.c(-1);
            sr.b((byte) 120);
            br.a(111);
            vt.a(false);
            ng.w(0);
            ni.a(-66);
            kg.a((byte) -101);
            wi.a(param0 + -14619);
            ig.e(77);
            mv.a((byte) -48);
            ht.a();
            rv.a(param0 ^ -72);
            bd.a(28038);
            pe.a((byte) 119);
            ld.e(param0 + 4);
            ur.a(false);
            ae.e(param0 + -4024);
            jf.h(param0 ^ 29322);
            bc.b(1);
            nh.h(param0 ^ -61);
            bm.e(param0 + -56);
            ek.a(236611664);
            ks.e((byte) -126);
            is.a((byte) -5);
            qs.b();
            bq.a(30156);
            pu.a((byte) -114);
            uc.a((byte) -39);
            gt.a(494);
            de.a((byte) -116);
            le.a(79);
            bk.a(true);
            od.a(param0 ^ 71);
            cw.a((byte) -118);
            un.a();
            mj.c((byte) -82);
            lp.a(param0 ^ -13095008);
            cu.a((byte) -121);
            e.b((byte) -13);
            mq.k(85);
            bl.a(40);
            rf.a((byte) -110);
            va.h(-97);
            ar.e((byte) -74);
            ri.a((byte) -57);
            du.b(16);
            ug.a(16);
            uk.d(0);
            dh.c(-117);
            hu.a();
            vc.a(-119);
            ir.a(61);
            sm.a(-1);
            ja.e(-93);
            j.b((byte) 125);
            jr.b(76);
            sq.a(false);
            pl.a(true);
            c.a(param0 + 157);
            be.a((byte) 113);
            k.a(param0 ^ 75);
            bw.a(-28911);
            ss.a((byte) -3);
            il.e(1223);
            tr.g(-125);
            dk.a(true);
            kj.a(false);
            md.d((byte) 46);
            rl.g(-43);
            q.g(param0 + -9);
            kf.g(-74);
            io.a((byte) 52);
            fq.a((byte) 99);
            ta.j(-12819);
            ma.g((byte) -127);
            fn.m(32);
            pt.i(param0);
            rj.a((byte) -85);
            kv.b(true);
            hv.b(true);
            kw.b(true);
            pk.c(false);
            vu.a(58);
            mk.f(-1);
            qd.k(-15);
            ws.a(param0 + 197);
            pi.a((byte) -63);
            ns.a(false);
            jv.a((byte) 36);
            aw.c((byte) 110);
            jb.f(param0 ^ -123);
            ge.c(-104);
            vf.c(param0 ^ 18);
            wq.a((byte) -57);
            qv.g(67);
            tb.c(param0 ^ 40);
            ph.a((byte) -54);
            sb.b(false);
            no.c(false);
            wb.a(false);
            bs.a(true);
            tq.a((byte) -84);
            en.n(0);
            ai.b(false);
            nb.d((byte) 68);
            cj.c(1);
            fh.a((byte) -28);
            ak.c(true);
            wc.j(0);
            ku.k(param0 ^ -36);
            cs.b(true);
            tn.n(param0 + 72);
            qm.j(param0 + 150);
            nv.l(-24061);
            m.a(false);
            wg.a(19345);
            uq.g(param0 ^ 91);
            me.a((byte) -36);
            f.c(true);
            pc.d(35);
            lc.a();
            mu.a(0);
            tl.a((byte) 100);
            sp.a((byte) -121);
            wj.a(true);
            aj.a(param0 + 155);
            ko.a(false);
            nt.a((byte) 97);
            vk.a(-4740);
            te.a((byte) -75);
            cf.a((byte) 9);
            sd.a((byte) -95);
            id.a(param0 ^ -10);
            iq.c(param0 ^ -72);
            cq.a(-101);
            bj.a(param0 ^ -72);
            nu.a(-26601);
            td.a(-127);
            lu.a(1);
            ol.b((byte) 117);
            oi.b(true);
            bh.c(false);
            ps.c(false);
            hl.k(param0 + -4103);
            we.a((byte) 120);
            b.a(true);
            iw.a(-25771);
            vg.a((byte) 89);
            li.a((byte) 74);
            og.a(true);
            nd.a((byte) -114);
            dr.d((byte) 126);
            ef.a(0);
            cb.a(125);
            mt.a(param0 + -51);
            es.b(-119);
            go.b(-51);
            fo.a(true);
            sa.a((byte) 96);
            qu.a(param0 + 1);
            wm.a(-10743);
            wd.a(200);
            ad.a((byte) 63);
            fg.a(-22856);
            ho.a((byte) -116);
            a.a(true);
            pf.b((byte) -49);
            wv.c((byte) -3);
            oq.a(120);
            eq.a(true);
            re.g(-90);
            ba.i(113);
            jq.g(-5);
            qa.g(1);
            oh.g(param0 + 21408);
            mw.g(12600);
            wt.e((byte) 120);
            qp.g(123);
            an.g(param0 ^ -1746174247);
            oa.g(-128);
            gg.g(-2260);
            ot.e((byte) -97);
            u.a((byte) -127);
            on.a(-7);
            rs.a((byte) -121);
            jl.a(-125);
            ip.a(param0 ^ 36);
            ts.b(param0 ^ 26972);
            gs.a((byte) 86);
            fc.a(param0 ^ 43);
            fk.a(true);
            kq.a(param0 ^ -3);
            pp.b(false);
            uj.h(29151);
            vl.b(true);
            kt.g(param0 ^ -55);
            jh.h(-117);
            di.g(49);
            tv.a((byte) -126);
            ct.a(135);
            gu.b(-16356);
            rb.d(65280);
            rn.a(false);
            this.field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ArmiesOfGielinor.GA(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        wn var2_ref = null;
        wn var3 = null;
        nm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        boolean stackOut_25_0 = false;
        var7 = field_M ? 1 : 0;
        try {
          L0: {
            li.field_n = new Random(vi.b(-108));
            this.a(4, 68, 24, 2, -119, 0, 1);
            wa.a(52, new lt());
            var2_ref = new wn();
            var3 = new wn(var2_ref);
            var4 = new nm(var2_ref, var3);
            var4.field_w.a(-1, 128, 9);
            var4.field_D.a(-1, 128, 9);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((dk.field_u.field_a.length ^ -1) >= (var5 ^ -1)) {
                    break L3;
                  } else {
                    dk.field_u.field_a[var5] = 256;
                    var5++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                lk.a(ft.field_m, 22050, var4, (byte) 68, true, (java.awt.Component) ((Object) si.field_b));
                kb.field_o = new int[7];
                break L2;
              }
              var5 = 0;
              L4: while (true) {
                stackOut_9_0 = var5;
                stackOut_9_1 = 7;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (stackIn_10_0 >= stackIn_10_1) {
                        break L7;
                      } else {
                        kb.field_o[var5] = 0;
                        stackOut_11_0 = var5 ^ -1;
                        stackIn_26_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var7 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (stackIn_12_0 > -5) {
                              var6 = 0;
                              L9: while (true) {
                                if ((var6 ^ -1) <= (wp.field_H[var5].length ^ -1)) {
                                  break L8;
                                } else {
                                  stackOut_19_0 = bw.field_m[wp.field_H[var5][var6]][11] ^ -1;
                                  stackOut_19_1 = -1;
                                  stackIn_10_0 = stackOut_19_0;
                                  stackIn_10_1 = stackOut_19_1;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  if (var7 != 0) {
                                    continue L5;
                                  } else {
                                    L10: {
                                      if (stackIn_20_0 == stackIn_20_1) {
                                        kb.field_o[var5] = oe.c(kb.field_o[var5], 1 << var6);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    var6++;
                                    if (var7 == 0) {
                                      continue L9;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    mc.field_d = ur.e(-10128);
                    this.a(true, false, true, true, 55, false, true);
                    jv.field_d = pi.field_M;
                    sh.field_a[65] = -2;
                    stackOut_25_0 = param0;
                    stackIn_26_0 = stackOut_25_0 ? 1 : 0;
                    break L6;
                  }
                  bj.field_k = stackIn_26_0 != 0;
                  sh.field_a[80] = -2;
                  sh.field_a[77] = -2;
                  sh.field_a[68] = -1;
                  sh.field_a[9] = -1;
                  sh.field_a[81] = -1;
                  sh.field_a[72] = 1;
                  sh.field_a[78] = 4;
                  sh.field_a[82] = -2;
                  sh.field_a[79] = 4;
                  ke.field_b = m.field_f;
                  sh.field_a[73] = 1;
                  sh.field_a[75] = 12;
                  sh.field_a[74] = -1;
                  iv.field_e = tr.field_C;
                  sh.field_a[76] = 3;
                  sh.field_a[70] = 1;
                  sh.field_a[64] = -2;
                  sh.field_a[10] = -1;
                  sh.field_a[71] = 1;
                  sh.field_a[67] = 4;
                  fs.field_d = hc.field_o;
                  sh.field_a[69] = -1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ArmiesOfGielinor.FA(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == a.field_o) {
                break L1;
              } else {
                em.a(a.field_o, 10207);
                lr.a(mc.field_d, (byte) 62);
                a.field_o = null;
                wl.a(0);
                break L1;
              }
            }
            bt.field_e = nu.a(3, true);
            iw.field_l = nw.a(0, 5, (byte) 102, false, false);
            sh.field_j = nu.a(6, true);
            br.field_d = nu.a(7, true);
            uf.field_f = nu.a(8, true);
            ep.field_b = nu.a(9, true);
            be.field_w = nu.a(10, true);
            dk.field_w = nu.a(11, true);
            ki.field_b = nu.a(12, true);
            op.field_b = nu.a(15, true);
            bi.field_f = nu.a(14, true);
            nm.field_s = nu.a(param0, true);
            i.field_Lb = nu.a(18, true);
            ce.field_M = nu.a(19, true);
            oh.field_M = nu.a(20, true);
            fw.field_F = nu.a(22, true);
            vc.field_m = nw.a(0, 21, (byte) 127, false, false);
            ir.field_f = nu.a(23, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ArmiesOfGielinor.JA(" + param0 + ')');
        }
    }

    final static tu a(byte[] param0, boolean param1) {
        tu var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        tu stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tu stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_K = 125;
                break L1;
              }
            }
            if (param0 != null) {
              var2 = new tu(param0, j.field_e, iq.field_g, qm.field_K, c.field_e, vj.field_j);
              rj.d((byte) 124);
              stackOut_6_0 = (tu) (var2);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("ArmiesOfGielinor.NA(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tu) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    private final void a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        String[] var3_array = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ic stackIn_18_0 = null;
        ic stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        byte stackIn_18_3 = 0;
        String[] stackIn_18_4 = null;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        dg stackIn_18_7 = null;
        ic stackIn_20_0 = null;
        ic stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        byte stackIn_20_3 = 0;
        String[] stackIn_20_4 = null;
        int stackIn_20_5 = 0;
        int stackIn_20_6 = 0;
        dg stackIn_20_7 = null;
        ic stackIn_21_0 = null;
        ic stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        byte stackIn_21_3 = 0;
        String[] stackIn_21_4 = null;
        int stackIn_21_5 = 0;
        int stackIn_21_6 = 0;
        dg stackIn_21_7 = null;
        int stackIn_21_8 = 0;
        ic stackIn_22_0 = null;
        ic stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        byte stackIn_22_3 = 0;
        String[] stackIn_22_4 = null;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        dg stackIn_22_7 = null;
        int stackIn_22_8 = 0;
        int stackIn_22_9 = 0;
        int stackIn_22_10 = 0;
        int stackIn_22_11 = 0;
        int stackIn_22_12 = 0;
        int stackIn_22_13 = 0;
        ic stackIn_23_0 = null;
        ic stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        byte stackIn_23_3 = 0;
        String[] stackIn_23_4 = null;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        dg stackIn_23_7 = null;
        int stackIn_23_8 = 0;
        int stackIn_23_9 = 0;
        int stackIn_23_10 = 0;
        int stackIn_23_11 = 0;
        int stackIn_23_12 = 0;
        int stackIn_23_13 = 0;
        ic stackIn_24_0 = null;
        ic stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        byte stackIn_24_3 = 0;
        String[] stackIn_24_4 = null;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        dg stackIn_24_7 = null;
        int stackIn_24_8 = 0;
        int stackIn_24_9 = 0;
        int stackIn_24_10 = 0;
        int stackIn_24_11 = 0;
        int stackIn_24_12 = 0;
        int stackIn_24_13 = 0;
        ic stackIn_25_0 = null;
        ic stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        byte stackIn_25_3 = 0;
        String[] stackIn_25_4 = null;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        dg stackIn_25_7 = null;
        int stackIn_25_8 = 0;
        int stackIn_25_9 = 0;
        int stackIn_25_10 = 0;
        int stackIn_25_11 = 0;
        int stackIn_25_12 = 0;
        int stackIn_25_13 = 0;
        int stackIn_25_14 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_17_0 = null;
        ic stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        byte stackOut_17_3 = 0;
        String[] stackOut_17_4 = null;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        dg stackOut_17_7 = null;
        ic stackOut_20_0 = null;
        ic stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        byte stackOut_20_3 = 0;
        String[] stackOut_20_4 = null;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        dg stackOut_20_7 = null;
        int stackOut_20_8 = 0;
        ic stackOut_18_0 = null;
        ic stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        byte stackOut_18_3 = 0;
        String[] stackOut_18_4 = null;
        int stackOut_18_5 = 0;
        int stackOut_18_6 = 0;
        dg stackOut_18_7 = null;
        int stackOut_18_8 = 0;
        ic stackOut_21_0 = null;
        ic stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        byte stackOut_21_3 = 0;
        String[] stackOut_21_4 = null;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        dg stackOut_21_7 = null;
        int stackOut_21_8 = 0;
        int stackOut_21_9 = 0;
        int stackOut_21_10 = 0;
        int stackOut_21_11 = 0;
        int stackOut_21_12 = 0;
        int stackOut_21_13 = 0;
        ic stackOut_22_0 = null;
        ic stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        byte stackOut_22_3 = 0;
        String[] stackOut_22_4 = null;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        dg stackOut_22_7 = null;
        int stackOut_22_8 = 0;
        int stackOut_22_9 = 0;
        int stackOut_22_10 = 0;
        int stackOut_22_11 = 0;
        int stackOut_22_12 = 0;
        int stackOut_22_13 = 0;
        ic stackOut_23_0 = null;
        ic stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        byte stackOut_23_3 = 0;
        String[] stackOut_23_4 = null;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        dg stackOut_23_7 = null;
        int stackOut_23_8 = 0;
        int stackOut_23_9 = 0;
        int stackOut_23_10 = 0;
        int stackOut_23_11 = 0;
        int stackOut_23_12 = 0;
        int stackOut_23_13 = 0;
        int stackOut_23_14 = 0;
        ic stackOut_24_0 = null;
        ic stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        byte stackOut_24_3 = 0;
        String[] stackOut_24_4 = null;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        dg stackOut_24_7 = null;
        int stackOut_24_8 = 0;
        int stackOut_24_9 = 0;
        int stackOut_24_10 = 0;
        int stackOut_24_11 = 0;
        int stackOut_24_12 = 0;
        int stackOut_24_13 = 0;
        int stackOut_24_14 = 0;
        var6 = field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  l.field_c = null;
                  pq.field_f = null;
                  if (param0) {
                    break L3;
                  } else {
                    var3_array = new String[r.field_B];
                    var4 = 0;
                    L4: while (true) {
                      L5: {
                        if (var4 >= r.field_B) {
                          break L5;
                        } else {
                          var3_array[var4] = jm.field_w[var4];
                          var4++;
                          if (var6 != 0) {
                            break L1;
                          } else {
                            if (var6 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L6: {
                  var4_ref_String = mv.field_d;
                  var3_array = new String[2];
                  if (var4_ref_String == null) {
                    var4_ref_String = ei.field_i;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var3_array[1] = vs.field_b;
                var3_array[0] = var4_ref_String;
                break L2;
              }
              td.field_f.a(wf.field_D, 0);
              qa.field_F = false;
              var4 = 0;
              break L1;
            }
            if (param1 <= -48) {
              L7: {
                stackOut_17_0 = null;
                stackOut_17_1 = null;
                stackOut_17_2 = 0;
                stackOut_17_3 = am.field_B[0];
                stackOut_17_4 = (String[]) (var3_array);
                stackOut_17_5 = 0;
                stackOut_17_6 = 0;
                stackOut_17_7 = td.field_f;
                stackIn_20_0 = stackOut_17_0;
                stackIn_20_1 = stackOut_17_1;
                stackIn_20_2 = stackOut_17_2;
                stackIn_20_3 = stackOut_17_3;
                stackIn_20_4 = stackOut_17_4;
                stackIn_20_5 = stackOut_17_5;
                stackIn_20_6 = stackOut_17_6;
                stackIn_20_7 = stackOut_17_7;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                stackIn_18_4 = stackOut_17_4;
                stackIn_18_5 = stackOut_17_5;
                stackIn_18_6 = stackOut_17_6;
                stackIn_18_7 = stackOut_17_7;
                if (!tc.field_h) {
                  stackOut_20_0 = null;
                  stackOut_20_1 = null;
                  stackOut_20_2 = stackIn_20_2;
                  stackOut_20_3 = stackIn_20_3;
                  stackOut_20_4 = (String[]) ((Object) stackIn_20_4);
                  stackOut_20_5 = stackIn_20_5;
                  stackOut_20_6 = stackIn_20_6;
                  stackOut_20_7 = (dg) ((Object) stackIn_20_7);
                  stackOut_20_8 = t.field_e;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  stackIn_21_3 = stackOut_20_3;
                  stackIn_21_4 = stackOut_20_4;
                  stackIn_21_5 = stackOut_20_5;
                  stackIn_21_6 = stackOut_20_6;
                  stackIn_21_7 = stackOut_20_7;
                  stackIn_21_8 = stackOut_20_8;
                  break L7;
                } else {
                  stackOut_18_0 = null;
                  stackOut_18_1 = null;
                  stackOut_18_2 = stackIn_18_2;
                  stackOut_18_3 = stackIn_18_3;
                  stackOut_18_4 = (String[]) ((Object) stackIn_18_4);
                  stackOut_18_5 = stackIn_18_5;
                  stackOut_18_6 = stackIn_18_6;
                  stackOut_18_7 = (dg) ((Object) stackIn_18_7);
                  stackOut_18_8 = 4;
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_21_1 = stackOut_18_1;
                  stackIn_21_2 = stackOut_18_2;
                  stackIn_21_3 = stackOut_18_3;
                  stackIn_21_4 = stackOut_18_4;
                  stackIn_21_5 = stackOut_18_5;
                  stackIn_21_6 = stackOut_18_6;
                  stackIn_21_7 = stackOut_18_7;
                  stackIn_21_8 = stackOut_18_8;
                  break L7;
                }
              }
              L8: {
                L9: {
                  stackOut_21_0 = null;
                  stackOut_21_1 = null;
                  stackOut_21_2 = stackIn_21_2;
                  stackOut_21_3 = stackIn_21_3;
                  stackOut_21_4 = (String[]) ((Object) stackIn_21_4);
                  stackOut_21_5 = stackIn_21_5;
                  stackOut_21_6 = stackIn_21_6;
                  stackOut_21_7 = (dg) ((Object) stackIn_21_7);
                  stackOut_21_8 = stackIn_21_8;
                  stackOut_21_9 = field_K;
                  stackOut_21_10 = wf.field_D;
                  stackOut_21_11 = 0;
                  stackOut_21_12 = 4;
                  stackOut_21_13 = var4;
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_24_1 = stackOut_21_1;
                  stackIn_24_2 = stackOut_21_2;
                  stackIn_24_3 = stackOut_21_3;
                  stackIn_24_4 = stackOut_21_4;
                  stackIn_24_5 = stackOut_21_5;
                  stackIn_24_6 = stackOut_21_6;
                  stackIn_24_7 = stackOut_21_7;
                  stackIn_24_8 = stackOut_21_8;
                  stackIn_24_9 = stackOut_21_9;
                  stackIn_24_10 = stackOut_21_10;
                  stackIn_24_11 = stackOut_21_11;
                  stackIn_24_12 = stackOut_21_12;
                  stackIn_24_13 = stackOut_21_13;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  stackIn_22_3 = stackOut_21_3;
                  stackIn_22_4 = stackOut_21_4;
                  stackIn_22_5 = stackOut_21_5;
                  stackIn_22_6 = stackOut_21_6;
                  stackIn_22_7 = stackOut_21_7;
                  stackIn_22_8 = stackOut_21_8;
                  stackIn_22_9 = stackOut_21_9;
                  stackIn_22_10 = stackOut_21_10;
                  stackIn_22_11 = stackOut_21_11;
                  stackIn_22_12 = stackOut_21_12;
                  stackIn_22_13 = stackOut_21_13;
                  if (rf.a(27875)) {
                    break L9;
                  } else {
                    stackOut_22_0 = null;
                    stackOut_22_1 = null;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = stackIn_22_3;
                    stackOut_22_4 = (String[]) ((Object) stackIn_22_4);
                    stackOut_22_5 = stackIn_22_5;
                    stackOut_22_6 = stackIn_22_6;
                    stackOut_22_7 = (dg) ((Object) stackIn_22_7);
                    stackOut_22_8 = stackIn_22_8;
                    stackOut_22_9 = stackIn_22_9;
                    stackOut_22_10 = stackIn_22_10;
                    stackOut_22_11 = stackIn_22_11;
                    stackOut_22_12 = stackIn_22_12;
                    stackOut_22_13 = stackIn_22_13;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    stackIn_24_5 = stackOut_22_5;
                    stackIn_24_6 = stackOut_22_6;
                    stackIn_24_7 = stackOut_22_7;
                    stackIn_24_8 = stackOut_22_8;
                    stackIn_24_9 = stackOut_22_9;
                    stackIn_24_10 = stackOut_22_10;
                    stackIn_24_11 = stackOut_22_11;
                    stackIn_24_12 = stackOut_22_12;
                    stackIn_24_13 = stackOut_22_13;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    stackIn_23_4 = stackOut_22_4;
                    stackIn_23_5 = stackOut_22_5;
                    stackIn_23_6 = stackOut_22_6;
                    stackIn_23_7 = stackOut_22_7;
                    stackIn_23_8 = stackOut_22_8;
                    stackIn_23_9 = stackOut_22_9;
                    stackIn_23_10 = stackOut_22_10;
                    stackIn_23_11 = stackOut_22_11;
                    stackIn_23_12 = stackOut_22_12;
                    stackIn_23_13 = stackOut_22_13;
                    if (-3 < (hi.field_j ^ -1)) {
                      break L9;
                    } else {
                      stackOut_23_0 = null;
                      stackOut_23_1 = null;
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = stackIn_23_3;
                      stackOut_23_4 = (String[]) ((Object) stackIn_23_4);
                      stackOut_23_5 = stackIn_23_5;
                      stackOut_23_6 = stackIn_23_6;
                      stackOut_23_7 = (dg) ((Object) stackIn_23_7);
                      stackOut_23_8 = stackIn_23_8;
                      stackOut_23_9 = stackIn_23_9;
                      stackOut_23_10 = stackIn_23_10;
                      stackOut_23_11 = stackIn_23_11;
                      stackOut_23_12 = stackIn_23_12;
                      stackOut_23_13 = stackIn_23_13;
                      stackOut_23_14 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_25_3 = stackOut_23_3;
                      stackIn_25_4 = stackOut_23_4;
                      stackIn_25_5 = stackOut_23_5;
                      stackIn_25_6 = stackOut_23_6;
                      stackIn_25_7 = stackOut_23_7;
                      stackIn_25_8 = stackOut_23_8;
                      stackIn_25_9 = stackOut_23_9;
                      stackIn_25_10 = stackOut_23_10;
                      stackIn_25_11 = stackOut_23_11;
                      stackIn_25_12 = stackOut_23_12;
                      stackIn_25_13 = stackOut_23_13;
                      stackIn_25_14 = stackOut_23_14;
                      break L8;
                    }
                  }
                }
                stackOut_24_0 = null;
                stackOut_24_1 = null;
                stackOut_24_2 = stackIn_24_2;
                stackOut_24_3 = stackIn_24_3;
                stackOut_24_4 = (String[]) ((Object) stackIn_24_4);
                stackOut_24_5 = stackIn_24_5;
                stackOut_24_6 = stackIn_24_6;
                stackOut_24_7 = (dg) ((Object) stackIn_24_7);
                stackOut_24_8 = stackIn_24_8;
                stackOut_24_9 = stackIn_24_9;
                stackOut_24_10 = stackIn_24_10;
                stackOut_24_11 = stackIn_24_11;
                stackOut_24_12 = stackIn_24_12;
                stackOut_24_13 = stackIn_24_13;
                stackOut_24_14 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                stackIn_25_3 = stackOut_24_3;
                stackIn_25_4 = stackOut_24_4;
                stackIn_25_5 = stackOut_24_5;
                stackIn_25_6 = stackOut_24_6;
                stackIn_25_7 = stackOut_24_7;
                stackIn_25_8 = stackOut_24_8;
                stackIn_25_9 = stackOut_24_9;
                stackIn_25_10 = stackOut_24_10;
                stackIn_25_11 = stackOut_24_11;
                stackIn_25_12 = stackOut_24_12;
                stackIn_25_13 = stackOut_24_13;
                stackIn_25_14 = stackOut_24_14;
                break L8;
              }
              rd.field_j = new ic(stackIn_25_2 != 0, (int) stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6 != 0, stackIn_25_7, stackIn_25_8, stackIn_25_9, stackIn_25_10, stackIn_25_11 != 0, stackIn_25_12, stackIn_25_13, stackIn_25_14 != 0, (om) null);
              rd.field_j.field_xb.field_T = new ln[r.field_B];
              rd.field_j.field_xb.field_F = true;
              var5 = 0;
              L10: while (true) {
                L11: {
                  L12: {
                    if (r.field_B <= var5) {
                      break L12;
                    } else {
                      rd.field_j.field_xb.field_T[var5] = ah.field_a;
                      var5++;
                      if (var6 != 0) {
                        break L11;
                      } else {
                        if (var6 == 0) {
                          continue L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  oo.e(-387);
                  break L11;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ArmiesOfGielinor.HA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean c(int param0, boolean param1) {
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        boolean discarded$14 = false;
        ru[] discarded$15 = null;
        wk discarded$16 = null;
        wk[] discarded$17 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5_int = 0;
        ru[] var5 = null;
        ih var5_ref = null;
        co[] var5_array = null;
        um[] var6 = null;
        co[] var6_array = null;
        int[] var6_array2 = null;
        int var6_int = 0;
        int var7_int = 0;
        int[] var7 = null;
        co var7_ref = null;
        um var8 = null;
        co var8_ref = null;
        int[] var8_array = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        wk[][] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_253_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_167_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_252_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var18 = field_M ? 1 : 0;
        try {
          L0: {
            if (!qu.field_q) {
              var3_int = -78 / ((param0 - -45) / 46);
              j.a((byte) 119);
              var4 = "basicfont12";
              if (null == br.field_d) {
                if (null != uf.field_f) {
                  bn.a((byte) -24, 71.0f, ph.field_a);
                  this.a(0);
                  uf.field_f = null;
                  wl.a(0);
                  stackOut_167_0 = 0;
                  stackIn_168_0 = stackOut_167_0;
                  decompiledRegionSelector0 = 22;
                  break L0;
                } else {
                  if (null != be.field_w) {
                    bn.a((byte) -24, 75.0f, ta.field_M);
                    this.a(0);
                    mp.field_Ob = um.a(be.field_w, "", "Runewars Titlescreen");
                    jc.field_B = um.a(be.field_w, "", "legion");
                    oh.field_K = um.a(be.field_w, "", "Runewars win");
                    se.field_h = um.a(be.field_w, "", "Runewars lose");
                    var5_int = 0;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var5_int >= cb.field_a.length) {
                            break L3;
                          } else {
                            cb.field_a[var5_int] = um.a(be.field_w, "", "attack" + (var5_int - -1));
                            var5_int++;
                            if (var18 != 0) {
                              break L2;
                            } else {
                              if (var18 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        fh.field_b = new um[9];
                        fh.field_b[0] = um.a(be.field_w, "", "the terrible tower");
                        fh.field_b[1] = um.a(be.field_w, "", "venture2");
                        fh.field_b[2] = um.a(be.field_w, "", "the other side");
                        fh.field_b[3] = um.a(be.field_w, "", "the shadow");
                        fh.field_b[4] = um.a(be.field_w, "", "faithless");
                        fh.field_b[5] = um.a(be.field_w, "", "kingdom");
                        fh.field_b[6] = um.a(be.field_w, "", "fight or flight");
                        fh.field_b[7] = um.a(be.field_w, "", "soul wars");
                        fh.field_b[8] = um.a(be.field_w, "", "brain_barrelchest_battle");
                        qf.field_f = um.a(be.field_w, "", "AoG_interface_guthix");
                        break L2;
                      }
                      var5_ref = lk.field_e.field_w;
                      discarded$9 = var5_ref.a(jl.field_d, ep.field_b, 0, mp.field_Ob, (byte) 86);
                      discarded$10 = var5_ref.a(jl.field_d, ep.field_b, 0, jc.field_B, (byte) 86);
                      discarded$11 = var5_ref.a(jl.field_d, ep.field_b, 0, oh.field_K, (byte) 86);
                      discarded$12 = var5_ref.a(jl.field_d, ep.field_b, 0, se.field_h, (byte) 86);
                      var6 = cb.field_a;
                      var7_int = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var7_int >= var6.length) {
                              break L6;
                            } else {
                              var8 = var6[var7_int];
                              discarded$13 = var5_ref.a(jl.field_d, ep.field_b, 0, var8, (byte) 86);
                              var7_int++;
                              if (var18 != 0) {
                                break L5;
                              } else {
                                if (var18 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          discarded$14 = var5_ref.a(jl.field_d, ep.field_b, 0, qf.field_f, (byte) 86);
                          break L5;
                        }
                        var6_array = mc.field_d;
                        var7_int = 0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if ((var6_array.length ^ -1) >= (var7_int ^ -1)) {
                                break L9;
                              } else {
                                var8_ref = var6_array[var7_int];
                                var8_ref.a(jl.field_d, ep.field_b, be.field_w, 0, var5_ref);
                                var7_int++;
                                if (var18 != 0) {
                                  break L8;
                                } else {
                                  if (var18 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var5_ref.h(-117);
                            be.field_w = null;
                            ep.field_b = null;
                            jl.field_d = null;
                            wl.a(0);
                            break L8;
                          }
                          stackOut_193_0 = 0;
                          stackIn_194_0 = stackOut_193_0;
                          decompiledRegionSelector0 = 23;
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (sh.field_j != null) {
                      L10: {
                        bn.a((byte) -24, 90.0f, bc.field_i);
                        this.a(0);
                        rs.field_n = gs.a(var4, gg.field_K, ks.field_A, (byte) -53, "");
                        en.field_E = gs.a("basic", iw.field_l, sh.field_j, (byte) -53, "smallfont");
                        hh.field_i = it.a("introfont", iw.field_l, sh.field_j, (byte) -87, "basic");
                        nr.field_e = st.a("runewarsfont", sh.field_j, iw.field_l, "basic", -2088);
                        fe.a(nr.field_e);
                        fe.field_l = fk.a("textshadow", (byte) -127, iw.field_l, "basic");
                        var5 = lo.a("members_benefits_screenshots", -28106, "basic", iw.field_l);
                        if (var5 != null) {
                          ul.a(var5, (byte) 110, (ArmiesOfGielinor) (this));
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      u.field_n = pv.a("basic", "background", iw.field_l, 24914);
                      cp.field_e = lo.a("statusicons", -28106, "basic", iw.field_l);
                      discarded$15 = lo.a("armouricons", -28106, "basic", iw.field_l);
                      lb.field_e = lo.a("special_icons", -28106, "basic", iw.field_l);
                      hh.field_d = ic.a("godspark", (byte) 51, "basic", iw.field_l);
                      gh.field_M = nh.a("mapbutton", "basic", iw.field_l, false);
                      discarded$16 = nh.a("endturnbutton", "basic", iw.field_l, false);
                      ul.field_g = nh.a("buttonring", "basic", iw.field_l, false);
                      e.field_b = ac.a(iw.field_l, "lozenge", (byte) -4, "basic");
                      bu.field_c = fk.a("endturnlozenge", (byte) -127, iw.field_l, "basic");
                      jh.field_l = ac.a(iw.field_l, "summonframe", (byte) -4, "basic");
                      vb.field_t = nh.a("bubblepoint", "basic", iw.field_l, false);
                      ii.field_a = ac.a(iw.field_l, "actionbuttons", (byte) -4, "basic");
                      od.field_a = ac.a(iw.field_l, "info_icons", (byte) -4, "basic");
                      ro.field_rb = lo.a("trait_icons", -28106, "basic", iw.field_l);
                      lp.field_b = lo.a("terrain_icons", -28106, "basic", iw.field_l);
                      sg.field_b = lo.a("compare_icons", -28106, "basic", iw.field_l);
                      fu.field_e = nh.a("mapf", "basic", iw.field_l, false);
                      io.field_z = nh.a("mapi", "basic", iw.field_l, false);
                      ig.field_t = pv.a("basic", "turn", iw.field_l, 24914);
                      ns.field_y = fk.a("mapsquares", (byte) -127, iw.field_l, "basic");
                      kj.field_s = fk.a("isomapsquares", (byte) -127, iw.field_l, "basic");
                      rg.field_h = fk.a("maprotbutton", (byte) -128, iw.field_l, "basic");
                      ur.field_w = fk.a("placeicons", (byte) -124, iw.field_l, "basic");
                      mp.field_Jb = nh.a("slider", "basic", iw.field_l, false);
                      kr.field_z = ic.a("bcarrow", (byte) 51, "basic", iw.field_l);
                      aw.field_m = ic.a("goldiv", (byte) 51, "basic", iw.field_l);
                      wc.field_Q = fk.a("silverbar", (byte) -125, iw.field_l, "basic");
                      sc.field_f = fk.a("pathfinder", (byte) -125, iw.field_l, "basic");
                      pl.field_x = ac.a(iw.field_l, "unitheads", (byte) -4, "basic");
                      lt.field_i = fk.a("theme_icons", (byte) -127, iw.field_l, "basic");
                      qj.a(iw.field_l, 116);
                      hs.field_F = fk.a("fireball", (byte) -128, iw.field_l, "basic");
                      tt.field_d = fk.a("fortcontrols", (byte) -124, iw.field_l, "basic");
                      lw.field_ob = nh.a("smallorb", "basic", iw.field_l, false);
                      wc.field_J = nh.a("bigorb", "basic", iw.field_l, false);
                      pg.field_c = nh.a("bigorbring", "basic", iw.field_l, false);
                      hr.field_d = ac.a(iw.field_l, "godorbs", (byte) -4, "basic");
                      gt.field_c = ac.a(iw.field_l, "godframes", (byte) -4, "basic");
                      ce.field_F = ac.a(iw.field_l, "godglows", (byte) -4, "basic");
                      ue.field_k = ac.a(iw.field_l, "godframeglows", (byte) -4, "basic");
                      tn.a((byte) 80, hr.field_d);
                      hf.a(128, ce.field_F, 0);
                      go.field_e = new wk(71, 71);
                      fn.a(8678, 256, 15, go.field_e);
                      tn.a((byte) 105, ce.field_F);
                      tn.a((byte) 124, ue.field_k);
                      ol.field_y = nh.a("logo", "basic", iw.field_l, false);
                      km.field_h = ac.a(iw.field_l, "summonrings", (byte) -4, "basic");
                      jv.field_b = fk.a("chatbubbles", (byte) -128, iw.field_l, "basic");
                      ns.field_O = ic.a("results_award_badge", (byte) 51, "basic", iw.field_l);
                      ih.field_H = (nj) ((Object) nh.a("shine", "basic", iw.field_l, false));
                      cf.field_t = pv.a("basic", "statboxbg", iw.field_l, 24914);
                      qt.field_e = pv.a("basic", "popupbg", iw.field_l, 24914);
                      vq.field_b = pv.a("basic", "gameinfobg", iw.field_l, 24914);
                      vc.field_k = fk.a("manastars", (byte) -127, iw.field_l, "basic");
                      hh.field_f = ic.a("manaicon", (byte) 51, "basic", iw.field_l);
                      od.field_d = fk.a("overlayicons", (byte) -125, iw.field_l, "basic");
                      mv.field_a = fk.a("bloodsplat", (byte) -126, iw.field_l, "basic");
                      it.field_a = ic.a("results_rune_icon", (byte) 51, "basic", iw.field_l);
                      rq.field_k = fk.a("results_mini_button_silver", (byte) -124, iw.field_l, "basic");
                      ga.field_a = fk.a("results_mini_button_gold", (byte) -127, iw.field_l, "basic");
                      lf.field_h = ac.a(iw.field_l, "trinketicons", (byte) -4, "basic");
                      ns.field_E = nh.a("eye", "basic", iw.field_l, false);
                      cu.field_d = ac.a(iw.field_l, "trinketbuttons", (byte) -4, "basic");
                      mo.field_s = ic.a("wait_icon", (byte) 51, "basic", iw.field_l);
                      mo.field_s.a();
                      kt.field_o = fk.a("diamondscale", (byte) -128, iw.field_l, "basic");
                      jg.field_m = new wk(vc.field_m.a("menu_background.jpg", -123, ""), (java.awt.Component) ((Object) ll.p(0)));
                      var6_array = mc.field_d;
                      var7_int = 0;
                      L11: while (true) {
                        L12: {
                          L13: {
                            if ((var6_array.length ^ -1) >= (var7_int ^ -1)) {
                              break L13;
                            } else {
                              var8_ref = var6_array[var7_int];
                              var8_ref.a(vc.field_m, 0, iw.field_l);
                              var7_int++;
                              if (var18 != 0) {
                                break L12;
                              } else {
                                if (var18 == 0) {
                                  continue L11;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          hi.field_i = new ep(vc.field_m);
                          dq.field_i = om.a((byte) -125, "frame_outer", "basic", iw.field_l);
                          io.field_m = om.a((byte) 83, "frame_inner", "basic", iw.field_l);
                          oh.field_J = om.a((byte) 83, "frame_ingame", "basic", iw.field_l);
                          tb.field_j = om.a((byte) -108, "frame_boxes", "basic", iw.field_l);
                          il.field_s = om.a((byte) 89, "frame_button", "basic", iw.field_l);
                          break L12;
                        }
                        var6_array2 = new int[]{13615618, 10121728};
                        var7 = new int[]{16184190, 16707943};
                        nd.field_b = jk.a(50, var7, 127, var6_array2);
                        var8_array = new int[]{13619151, 10132122};
                        var9 = new int[]{16185078, 16711422};
                        ci.field_e = jk.a(100, var9, 123, var8_array);
                        var10 = new int[]{13421772};
                        var11 = new int[]{4473924};
                        jh.field_k = jk.a(100, var11, 125, var10);
                        var12 = new int[]{13565952, 10092544};
                        var13 = new int[]{16121856, 16646144};
                        ld.field_x = jk.a(100, var13, 125, var12);
                        var14 = new int[]{13369344};
                        var15 = new int[]{4456448};
                        dh.field_l = jk.a(100, var15, 123, var14);
                        discarded$17 = fe.a(0, 0, 640, 480, oh.field_J, nd.field_b);
                        ae.a((byte) 125, ac.a(iw.field_l, "dials", (byte) -4, "basic"), ic.a("hand", (byte) 51, "basic", iw.field_l));
                        ga.field_k = fk.a("arrows", (byte) -124, iw.field_l, "basic");
                        pi.field_T = ic.a("isocrosshair", (byte) 51, "basic", iw.field_l);
                        ng.a(ic.a("glowray", (byte) 51, "basic", iw.field_l), 0, ic.a("glowspark", (byte) 51, "basic", iw.field_l));
                        am.field_C = fk.a("medals", (byte) -127, iw.field_l, "campaign");
                        ps.field_w[0] = nh.a("campaign_1_glow", "campaign", iw.field_l, false);
                        ps.field_w[1] = nh.a("campaign_2_glow", "campaign", iw.field_l, false);
                        ps.field_w[2] = nh.a("campaign_3_glow", "campaign", iw.field_l, false);
                        qu.field_k = lo.a("achievements_large", -28106, "basic", iw.field_l);
                        am.field_A = ic.a("unachieved", (byte) 51, "basic", gg.field_K);
                        hp.field_A = ic.a("locked", (byte) 51, "basic", gg.field_K);
                        mo.field_t = ic.a("orbcoin", (byte) 51, "basic", gg.field_K);
                        id.a(300, am.field_A);
                        id.a(300, mo.field_t);
                        dk.field_v = new wk(32, 32);
                        dk.field_v.b();
                        mo.field_t.d(0, 0, 32, 32);
                        so.field_b.a(5605);
                        mo.field_t = null;
                        var16 = new wk[hs.field_E.length][];
                        var17 = 0;
                        L14: while (true) {
                          L15: {
                            L16: {
                              if ((hs.field_E.length ^ -1) >= (var17 ^ -1)) {
                                break L16;
                              } else {
                                var16[var17] = fk.a(hs.field_E[var17], (byte) -127, iw.field_l, "basic");
                                var17++;
                                if (var18 != 0) {
                                  break L15;
                                } else {
                                  if (var18 == 0) {
                                    continue L14;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            km.field_c = lo.a("prestigeicons", -28106, "basic", iw.field_l);
                            break L15;
                          }
                          L17: {
                            if (ta.field_L) {
                              break L17;
                            } else {
                              dh.field_k = ic.a("lobby_game_logo", (byte) 51, "basic", iw.field_l);
                              ar.a(var16, bs.field_b, (byte) 53, am.field_B, 4, gg.field_K, ks.field_A, bv.field_A, pf.field_a, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, true, pf.field_a.length, ku.field_L, km.field_c, dk.field_w, ki.field_d, var16);
                              la.b((byte) 30, 200);
                              ps.a(124, ks.field_A, gg.field_K);
                              break L17;
                            }
                          }
                          sh.field_j = null;
                          ks.field_A = null;
                          wl.a(0);
                          fe.field_o = new int[7][64];
                          var17 = 0;
                          L18: while (true) {
                            L19: {
                              L20: {
                                if (var17 >= 64) {
                                  break L20;
                                } else {
                                  fe.field_o[1][var17] = fe.a(bo.field_g[1], var17 << -1877863549);
                                  fe.field_o[2][var17] = fe.a(bo.field_g[2], var17 << 1985611363);
                                  fe.field_o[3][var17] = fe.a(bo.field_g[3], var17 << 844675555);
                                  fe.field_o[4][var17] = fe.a(bo.field_g[4], var17 << -1154970461);
                                  fe.field_o[5][var17] = fe.a(bo.field_g[5], var17 << 699683683);
                                  fe.field_o[6][var17] = fe.a(bo.field_g[6], var17 << 300524675);
                                  fe.field_o[0][var17] = (var17 << 1490888770) + (var17 << -1378545110) - -(var17 << -64409454);
                                  var17++;
                                  if (var18 != 0) {
                                    break L19;
                                  } else {
                                    if (var18 == 0) {
                                      continue L18;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              if (hi.field_j < 2) {
                                break L19;
                              } else {
                                oa.field_I = new ij(hg.a(101), rs.field_n, ft.field_m);
                                break L19;
                              }
                            }
                            stackOut_228_0 = 0;
                            stackIn_229_0 = stackOut_228_0;
                            decompiledRegionSelector0 = 24;
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (bt.field_e == null) {
                        L21: {
                          if (null == ce.field_M) {
                            break L21;
                          } else {
                            if (oh.field_M != null) {
                              ew.field_e = new ou(ce.field_M, oh.field_M, false);
                              ce.field_M = null;
                              oh.field_M = null;
                              stackOut_239_0 = 0;
                              stackIn_240_0 = stackOut_239_0;
                              decompiledRegionSelector0 = 26;
                              break L0;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (null == fw.field_F) {
                          if (ir.field_f == null) {
                            if (!this.o(11672)) {
                              stackOut_250_0 = 0;
                              stackIn_251_0 = stackOut_250_0;
                              decompiledRegionSelector0 = 29;
                              break L0;
                            } else {
                              wl.a(0);
                              stackOut_252_0 = 1;
                              stackIn_253_0 = stackOut_252_0;
                              decompiledRegionSelector0 = 30;
                              break L0;
                            }
                          } else {
                            cv.a(ir.field_f, 1, -85);
                            ir.field_f = null;
                            stackOut_245_0 = 0;
                            stackIn_246_0 = stackOut_245_0;
                            decompiledRegionSelector0 = 28;
                            break L0;
                          }
                        } else {
                          cv.a(fw.field_F, 0, 28);
                          fw.field_F = null;
                          stackOut_242_0 = 0;
                          stackIn_243_0 = stackOut_242_0;
                          decompiledRegionSelector0 = 27;
                          break L0;
                        }
                      } else {
                        uc.a(new dq(bt.field_e.a("huffman", -105, "")), 4);
                        bt.field_e = null;
                        wl.a(0);
                        stackOut_231_0 = 0;
                        stackIn_232_0 = stackOut_231_0;
                        decompiledRegionSelector0 = 25;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                L22: {
                  if (!gg.field_K.a((byte) 82)) {
                    break L22;
                  } else {
                    if (!gg.field_K.a(28979, "basic")) {
                      break L22;
                    } else {
                      L23: {
                        if (!gg.field_K.a((byte) 82)) {
                          break L23;
                        } else {
                          if (gg.field_K.a(28979, var4)) {
                            L24: {
                              if (!ks.field_A.a((byte) 82)) {
                                break L24;
                              } else {
                                if (!ks.field_A.a(28979, var4)) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (!gg.field_K.a((byte) 82)) {
                                      break L25;
                                    } else {
                                      if (!gg.field_K.a(28979, "lobby")) {
                                        break L25;
                                      } else {
                                        L26: {
                                          if (!ks.field_A.a((byte) 82)) {
                                            break L26;
                                          } else {
                                            if (ks.field_A.a(28979, "lobby")) {
                                              L27: {
                                                if (!br.field_d.a((byte) 82)) {
                                                  break L27;
                                                } else {
                                                  if (br.field_d.d(-27927)) {
                                                    L28: {
                                                      if (!uf.field_f.a((byte) 82)) {
                                                        break L28;
                                                      } else {
                                                        if (!uf.field_f.d(-27927)) {
                                                          break L28;
                                                        } else {
                                                          L29: {
                                                            if (!ep.field_b.a((byte) 82)) {
                                                              break L29;
                                                            } else {
                                                              if (ep.field_b.d(-27927)) {
                                                                L30: {
                                                                  if (!be.field_w.a((byte) 82)) {
                                                                    break L30;
                                                                  } else {
                                                                    if (!be.field_w.d(-27927)) {
                                                                      break L30;
                                                                    } else {
                                                                      L31: {
                                                                        if (!iw.field_l.a((byte) 82)) {
                                                                          break L31;
                                                                        } else {
                                                                          if (!iw.field_l.a(28979, "basic")) {
                                                                            break L31;
                                                                          } else {
                                                                            if (!iw.field_l.a(28979, "campaign")) {
                                                                              break L31;
                                                                            } else {
                                                                              L32: {
                                                                                if (!sh.field_j.a((byte) 82)) {
                                                                                  break L32;
                                                                                } else {
                                                                                  if (sh.field_j.a(28979, "basic")) {
                                                                                    L33: {
                                                                                      if (!bt.field_e.a((byte) 82)) {
                                                                                        break L33;
                                                                                      } else {
                                                                                        if (bt.field_e.d(-27927)) {
                                                                                          L34: {
                                                                                            if (!dk.field_w.a((byte) 82)) {
                                                                                              break L34;
                                                                                            } else {
                                                                                              if (dk.field_w.d(-27927)) {
                                                                                                L35: {
                                                                                                  if (!ce.field_M.a((byte) 82)) {
                                                                                                    break L35;
                                                                                                  } else {
                                                                                                    if (!ce.field_M.d(-27927)) {
                                                                                                      break L35;
                                                                                                    } else {
                                                                                                      L36: {
                                                                                                        if (!oh.field_M.a((byte) 82)) {
                                                                                                          break L36;
                                                                                                        } else {
                                                                                                          if (!oh.field_M.d(-27927)) {
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L37: {
                                                                                                              if (!fw.field_F.a((byte) 82)) {
                                                                                                                break L37;
                                                                                                              } else {
                                                                                                                if (fw.field_F.d(-27927)) {
                                                                                                                  L38: {
                                                                                                                    if (!ir.field_f.a((byte) 82)) {
                                                                                                                      break L38;
                                                                                                                    } else {
                                                                                                                      if (!ir.field_f.d(-27927)) {
                                                                                                                        break L38;
                                                                                                                      } else {
                                                                                                                        L39: {
                                                                                                                          if (!vc.field_m.a((byte) 82)) {
                                                                                                                            break L39;
                                                                                                                          } else {
                                                                                                                            if (!vc.field_m.d(-27927)) {
                                                                                                                              break L39;
                                                                                                                            } else {
                                                                                                                              if (!this.q(-46)) {
                                                                                                                                stackOut_141_0 = 0;
                                                                                                                                stackIn_142_0 = stackOut_141_0;
                                                                                                                                decompiledRegionSelector0 = 19;
                                                                                                                                break L0;
                                                                                                                              } else {
                                                                                                                                if (!param1) {
                                                                                                                                  stackOut_146_0 = 0;
                                                                                                                                  stackIn_147_0 = stackOut_146_0;
                                                                                                                                  decompiledRegionSelector0 = 20;
                                                                                                                                  break L0;
                                                                                                                                } else {
                                                                                                                                  qj.h(65);
                                                                                                                                  bn.a((byte) -24, 70.0f, ph.field_a);
                                                                                                                                  this.a(0);
                                                                                                                                  jl.field_d = new p(br.field_d, uf.field_f);
                                                                                                                                  im.field_v[0] = jl.field_d.a("sword_slash_4", (byte) -97, "");
                                                                                                                                  im.field_v[1] = jl.field_d.a("runewars_menu_mouseover", (byte) -97, "");
                                                                                                                                  im.field_v[2] = jl.field_d.a("runewars_select_menu_item", (byte) -97, "");
                                                                                                                                  im.field_v[3] = jl.field_d.a("runewars_select_unit", (byte) -97, "");
                                                                                                                                  im.field_v[4] = jl.field_d.a("runewars_select_position", (byte) -97, "");
                                                                                                                                  im.field_v[5] = jl.field_d.a("runewars_errorsound", (byte) -97, "");
                                                                                                                                  im.field_v[6] = jl.field_d.a("runewars_teleport_all", (byte) -97, "");
                                                                                                                                  im.field_v[8] = jl.field_d.a((byte) -128, "", "runewars_capture_fanfare");
                                                                                                                                  im.field_v[9] = jl.field_d.a("runewars_select_flag", (byte) -97, "");
                                                                                                                                  im.field_v[10] = jl.field_d.a("runewars_paint_flag", (byte) -97, "");
                                                                                                                                  im.field_v[11] = jl.field_d.a("runewars_swap_spellbook", (byte) -97, "");
                                                                                                                                  im.field_v[12] = jl.field_d.a("runewars_select_spell", (byte) -97, "");
                                                                                                                                  im.field_v[13] = jl.field_d.a("runewars_transition", (byte) -97, "");
                                                                                                                                  im.field_v[14] = jl.field_d.a("runewars_purchase_unit", (byte) -97, "");
                                                                                                                                  im.field_v[15] = jl.field_d.a("runewars_choose_alignment", (byte) -97, "");
                                                                                                                                  im.field_v[16] = jl.field_d.a("runewars_clock_tick", (byte) -97, "");
                                                                                                                                  im.field_v[17] = jl.field_d.a("runewars_time_over_dong", (byte) -97, "");
                                                                                                                                  im.field_v[18] = jl.field_d.a("runewars_turnover_page_map", (byte) -97, "");
                                                                                                                                  var5_array = mc.field_d;
                                                                                                                                  var6_int = 0;
                                                                                                                                  L40: while (true) {
                                                                                                                                    L41: {
                                                                                                                                      L42: {
                                                                                                                                        if ((var6_int ^ -1) <= (var5_array.length ^ -1)) {
                                                                                                                                          break L42;
                                                                                                                                        } else {
                                                                                                                                          var7_ref = var5_array[var6_int];
                                                                                                                                          var7_ref.a(17952, jl.field_d);
                                                                                                                                          var6_int++;
                                                                                                                                          if (var18 != 0) {
                                                                                                                                            break L41;
                                                                                                                                          } else {
                                                                                                                                            if (var18 == 0) {
                                                                                                                                              continue L40;
                                                                                                                                            } else {
                                                                                                                                              break L42;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      el.field_b[0] = jl.field_d.a("runewars_mana_whoosh", (byte) -97, "");
                                                                                                                                      break L41;
                                                                                                                                    }
                                                                                                                                    var5_int = 0;
                                                                                                                                    L43: while (true) {
                                                                                                                                      L44: {
                                                                                                                                        L45: {
                                                                                                                                          if (var5_int >= 8) {
                                                                                                                                            break L45;
                                                                                                                                          } else {
                                                                                                                                            el.field_b[var5_int - -1] = jl.field_d.a("runewars_mana_stars_" + (1 + var5_int), (byte) -97, "");
                                                                                                                                            var5_int++;
                                                                                                                                            if (var18 != 0) {
                                                                                                                                              break L44;
                                                                                                                                            } else {
                                                                                                                                              if (var18 == 0) {
                                                                                                                                                continue L43;
                                                                                                                                              } else {
                                                                                                                                                break L45;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        sj.a(126, jl.field_d);
                                                                                                                                        ml.a(jl.field_d, (byte) 123);
                                                                                                                                        br.field_d = null;
                                                                                                                                        wl.a(0);
                                                                                                                                        break L44;
                                                                                                                                      }
                                                                                                                                      stackOut_162_0 = 0;
                                                                                                                                      stackIn_163_0 = stackOut_162_0;
                                                                                                                                      decompiledRegionSelector0 = 21;
                                                                                                                                      break L0;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        bn.a((byte) -24, 69.0f, ao.a(cr.field_eb, true, en.field_G, vc.field_m));
                                                                                                                        stackOut_136_0 = 0;
                                                                                                                        stackIn_137_0 = stackOut_136_0;
                                                                                                                        decompiledRegionSelector0 = 18;
                                                                                                                        break L0;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  bn.a((byte) -24, 66.0f, ao.a(cr.field_eb, true, en.field_G, ir.field_f));
                                                                                                                  stackOut_128_0 = 0;
                                                                                                                  stackIn_129_0 = stackOut_128_0;
                                                                                                                  decompiledRegionSelector0 = 17;
                                                                                                                  break L0;
                                                                                                                } else {
                                                                                                                  break L37;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            bn.a((byte) -24, 63.0f, ao.a(cr.field_eb, true, en.field_G, fw.field_F));
                                                                                                            stackOut_120_0 = 0;
                                                                                                            stackIn_121_0 = stackOut_120_0;
                                                                                                            decompiledRegionSelector0 = 16;
                                                                                                            break L0;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      bn.a((byte) -24, 61.0f, ao.a(cr.field_eb, true, en.field_G, oh.field_M));
                                                                                                      stackOut_114_0 = 0;
                                                                                                      stackIn_115_0 = stackOut_114_0;
                                                                                                      decompiledRegionSelector0 = 15;
                                                                                                      break L0;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                bn.a((byte) -24, 58.0f, ao.a(cr.field_eb, true, en.field_G, ce.field_M));
                                                                                                stackOut_106_0 = 0;
                                                                                                stackIn_107_0 = stackOut_106_0;
                                                                                                decompiledRegionSelector0 = 14;
                                                                                                break L0;
                                                                                              } else {
                                                                                                break L34;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          bn.a((byte) -24, 56.0f, ao.a(cr.field_eb, true, en.field_G, dk.field_w));
                                                                                          stackOut_98_0 = 0;
                                                                                          stackIn_99_0 = stackOut_98_0;
                                                                                          decompiledRegionSelector0 = 13;
                                                                                          break L0;
                                                                                        } else {
                                                                                          break L33;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    bn.a((byte) -24, 54.0f, vl.a(bt.field_e, 0, en.field_G, "", cr.field_eb));
                                                                                    stackOut_92_0 = 0;
                                                                                    stackIn_93_0 = stackOut_92_0;
                                                                                    decompiledRegionSelector0 = 12;
                                                                                    break L0;
                                                                                  } else {
                                                                                    break L32;
                                                                                  }
                                                                                }
                                                                              }
                                                                              bn.a((byte) -24, 52.0f, vl.a(sh.field_j, 0, rf.field_a, "basic", is.field_f));
                                                                              stackOut_86_0 = 0;
                                                                              stackIn_87_0 = stackOut_86_0;
                                                                              decompiledRegionSelector0 = 11;
                                                                              break L0;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      bn.a((byte) -24, 41.0f, vl.a(iw.field_l, 0, ha.field_nb, "basic", ca.field_i));
                                                                      stackOut_80_0 = 0;
                                                                      stackIn_81_0 = stackOut_80_0;
                                                                      decompiledRegionSelector0 = 10;
                                                                      break L0;
                                                                    }
                                                                  }
                                                                }
                                                                bn.a((byte) -24, 38.0f, vl.a(be.field_w, 0, is.field_d, "", vh.field_m));
                                                                stackOut_69_0 = 0;
                                                                stackIn_70_0 = stackOut_69_0;
                                                                decompiledRegionSelector0 = 9;
                                                                break L0;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          bn.a((byte) -24, 33.0f, df.a(is.field_d, 0, ep.field_b, -27638, vh.field_m));
                                                          stackOut_61_0 = 0;
                                                          stackIn_62_0 = stackOut_61_0;
                                                          decompiledRegionSelector0 = 8;
                                                          break L0;
                                                        }
                                                      }
                                                    }
                                                    bn.a((byte) -24, 28.0f, vl.a(uf.field_f, 0, ds.field_b, "", bp.field_k));
                                                    stackOut_55_0 = 0;
                                                    stackIn_56_0 = stackOut_55_0;
                                                    decompiledRegionSelector0 = 7;
                                                    break L0;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                              bn.a((byte) -24, 23.0f, vl.a(br.field_d, 0, ds.field_b, "", bp.field_k));
                                              stackOut_47_0 = 0;
                                              stackIn_48_0 = stackOut_47_0;
                                              decompiledRegionSelector0 = 6;
                                              break L0;
                                            } else {
                                              break L26;
                                            }
                                          }
                                        }
                                        bn.a((byte) -24, 21.0f, vl.a(ks.field_A, 0, rf.field_a, "lobby", is.field_f));
                                        stackOut_41_0 = 0;
                                        stackIn_42_0 = stackOut_41_0;
                                        decompiledRegionSelector0 = 5;
                                        break L0;
                                      }
                                    }
                                  }
                                  bn.a((byte) -24, 18.0f, vl.a(gg.field_K, 0, ha.field_nb, "lobby", ca.field_i));
                                  stackOut_35_0 = 0;
                                  stackIn_36_0 = stackOut_35_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                            bn.a((byte) -24, 16.0f, vl.a(ks.field_A, 0, rf.field_a, var4, is.field_f));
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L23;
                          }
                        }
                      }
                      bn.a((byte) -24, 13.0f, vl.a(gg.field_K, 0, ha.field_nb, var4, ca.field_i));
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                bn.a((byte) -24, 10.0f, vl.a(gg.field_K, 0, ha.field_nb, "basic", ca.field_i));
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ArmiesOfGielinor.IA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_48_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_56_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_62_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_70_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_81_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_87_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_93_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_99_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_107_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_115_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_121_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_129_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_137_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_142_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_147_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_163_0 != 0;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return stackIn_168_0 != 0;
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return stackIn_194_0 != 0;
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return stackIn_229_0 != 0;
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return stackIn_232_0 != 0;
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return stackIn_240_0 != 0;
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return stackIn_243_0 != 0;
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return stackIn_246_0 != 0;
                                                                } else {
                                                                  if (decompiledRegionSelector0 == 29) {
                                                                    return stackIn_251_0 != 0;
                                                                  } else {
                                                                    return stackIn_253_0 != 0;
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
    }

    private final void r(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_M ? 1 : 0;
        try {
          L0: {
            ul.a(17);
            qq.g(1);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 29) {
                    break L3;
                  } else {
                    rq.field_p[var2_int] = new ci(var2_int);
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 == -66) {
                    break L4;
                  } else {
                    field_J = (ka) null;
                    break L4;
                  }
                }
                jt.field_a = 16;
                sa.a(50, true);
                ar.a(param0 ^ -68, mp.field_Ob);
                gh.a(128, 8, rs.field_n.field_z, rs.field_n.field_L + rs.field_n.field_z, rs.field_n, io.field_m[0].field_v, 8, 2, 16777215, 240, rs.field_n.field_z, -99, new pn(il.field_s, nd.field_b, 0, 128, true), 255, new pn(il.field_s, nd.field_b, 0, 128, true), 320, io.field_m[0].field_y, rs.field_n.field_z + rs.field_n.field_L, new pn(io.field_m, nd.field_b, 0, 224, false), rs.field_n);
                wm.a(320, 128, 240, 16777215, rs.field_n.field_z - -rs.field_n.field_L, rs.field_n.field_z, new pn(il.field_s, nd.field_b, 0, 128, true), 8, (byte) 90, 480, 8, rs.field_n.field_L + rs.field_n.field_z, new pn(il.field_s, nd.field_b, 0, 128, true), io.field_m[0].field_v, rs.field_n, 2, io.field_m[0].field_y, rs.field_n, 255, rs.field_n.field_z, new pn(io.field_m, nd.field_b, 0, 224, false));
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ArmiesOfGielinor.PA(" + param0 + ')');
        }
    }

    final static void b(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        wr var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ag.field_I.b(param1, param0 ^ 20);
              var2 = aw.field_i;
              if (null == var2) {
                break L1;
              } else {
                var2.a(ag.field_I.field_V, -125, ag.field_I.field_D);
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                field_H = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.BA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean o(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        try {
          L0: {
            L1: {
              if (null == ki.field_b) {
                break L1;
              } else {
                if (null == i.field_Lb) {
                  bn.a((byte) -24, 97.0f, ej.field_R);
                  this.a(param0 ^ 11672);
                  bl.a(0, ki.field_b);
                  ki.field_b = null;
                  wl.a(0);
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == i.field_Lb) {
                break L2;
              } else {
                if (iw.field_l == null) {
                  break L2;
                } else {
                  bn.a((byte) -24, 98.0f, ej.field_R);
                  this.a(0);
                  i.field_Lb = null;
                  wl.a(param0 ^ 11672);
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L3: {
              if (param0 == 11672) {
                break L3;
              } else {
                this.b((byte) -74);
                break L3;
              }
            }
            L4: {
              if (op.field_b == null) {
                break L4;
              } else {
                if (null == bi.field_f) {
                  break L4;
                } else {
                  if (nm.field_s == null) {
                    break L4;
                  } else {
                    if (ki.field_b != null) {
                      break L4;
                    } else {
                      bn.a((byte) -24, 99.0f, ej.field_R);
                      this.a(0);
                      ln.a(nm.field_s, bi.field_f, op.field_b, 0);
                      op.field_b = null;
                      bi.field_f = null;
                      nm.field_s = null;
                      wl.a(0);
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_29_0 = 1;
            stackIn_30_0 = stackOut_29_0;
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ArmiesOfGielinor.CA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_28_0 != 0;
            } else {
              return stackIn_30_0 != 0;
            }
          }
        }
    }

    private final void c(boolean param0) {
        jg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_L = (vh) null;
                break L1;
              }
            }
            L2: {
              var2 = (jg) ((Object) ai.field_P.e((byte) 97));
              if (null == var2) {
                break L2;
              } else {
                L3: {
                  L4: {
                    var4 = lq.field_b;
                    if ((var4 ^ -1) <= -81) {
                      break L4;
                    } else {
                      var3 = -32 + var4 / 2;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var4 < 230) {
                      break L5;
                    } else {
                      var3 = -(var4 / 2) + 123;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 = 8;
                  break L3;
                }
                fe.b(-5, var3 + -10, rs.field_n.a(so.field_a[var2.field_l]) + 62, 48, io.field_m, nd.field_b, 0, 128);
                qu.field_k[var2.field_l].c(8, var3);
                rs.field_n.b(so.field_a[var2.field_l], 42, var3 - (-5 + -rs.field_n.field_H), 15658734, -1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "ArmiesOfGielinor.LA(" + param0 + ')');
        }
    }

    static {
        field_N = new String[]{"proj_aviansie_axe", null, null, null, null, "proj_rock", "spear"};
        field_I = new int[8192];
        field_K = 0;
        field_H = "Please check if address is correct";
    }
}
