/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class DungeonAssault extends in {
    static String field_H;
    static cn field_I;
    static String field_G;
    static String field_J;
    public static int field_K;

    public static void h(byte param0) {
        field_G = null;
        field_J = null;
        if (param0 != 114) {
            return;
        }
        field_I = null;
        field_H = null;
    }

    private final void c(boolean param0, byte param1) {
        pj var3 = null;
        int var4 = 0;
        Random var4_ref_Random = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        int stackIn_7_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        boolean stackOut_4_0 = false;
        boolean stackOut_6_0 = false;
        int stackOut_6_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        L0: {
          L1: {
            L2: {
              var6 = field_K;
              if (~fm.field_e == ~fm.field_a) {
                if (!param0) {
                  L3: {
                    if (co.field_G == null) {
                      if (mn.field_b == -1) {
                        if (ik.field_e == null) {
                          break L3;
                        } else {
                          ik.field_e.c(true);
                          L4: while (true) {
                            if (!ha.b((byte) 47)) {
                              break L3;
                            } else {
                              ik.field_e.f();
                              continue L4;
                            }
                          }
                        }
                      } else {
                        if (fc.a(mn.field_b, (byte) -120)) {
                          bf.field_f[mn.field_b].c(true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      bd.field_f = bd.field_f + 1;
                      if (bd.field_f == 64) {
                        af.a((byte) 40);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (null == wl.field_a.e(-24172)) {
                    break L2;
                  } else {
                    int fieldTemp$5 = ke.field_e + 1;
                    ke.field_e = ke.field_e + 1;
                    if (fieldTemp$5 != 335) {
                      break L2;
                    } else {
                      ne discarded$6 = wl.field_a.b((byte) -124);
                      sl.field_b = null;
                      pa.field_a = null;
                      ri.field_g = null;
                      break L2;
                    }
                  }
                } else {
                  L5: {
                    if (null == wl.field_a.e(-24172)) {
                      break L5;
                    } else {
                      int fieldTemp$7 = ke.field_e + 1;
                      ke.field_e = ke.field_e + 1;
                      if (fieldTemp$7 != 335) {
                        break L5;
                      } else {
                        ne discarded$8 = wl.field_a.b((byte) -124);
                        sl.field_b = null;
                        pa.field_a = null;
                        ri.field_g = null;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (ik.field_e == null) {
                      break L6;
                    } else {
                      if (mn.field_b != -1) {
                        ik.field_e.a(false, 251569954);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (param1 == -69) {
                      break L7;
                    } else {
                      this.c(true, (byte) -64);
                      break L7;
                    }
                  }
                  if (dc.field_z == -2) {
                    var3 = new pj();
                    var3.field_v = uk.a(0, new Random());
                    var4 = 0;
                    L8: while (true) {
                      if (49 <= var4) {
                        break L1;
                      } else {
                        L9: {
                          if (0 == oi.b(0, 5)) {
                            if (var3.field_h[var4].field_a == 0) {
                              var3.field_h[var4] = new ai(ji.a(37, false, 4));
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var4++;
                        continue L8;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              } else {
                if (fm.field_a == dg.field_H) {
                  pk.field_t = pk.field_t + 1;
                  if (pk.field_t != 16) {
                    break L2;
                  } else {
                    L10: {
                      if (tl.field_d) {
                        dn.b(false);
                        break L10;
                      } else {
                        bj.i(81);
                        break L10;
                      }
                    }
                    gm.field_d = null;
                    fm.field_a = bn.field_n;
                    break L2;
                  }
                } else {
                  if (~bn.field_n != ~fm.field_a) {
                    pk.field_t = pk.field_t - 1;
                    if (pk.field_t == 0) {
                      fm.field_a = fm.field_e;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    L11: {
                      if (ed.c(true)) {
                        break L11;
                      } else {
                        L12: {
                          vk.a((byte) -31);
                          gd.a(g.field_Hb, 0, sa.field_f, false);
                          stackOut_4_0 = ll.field_k;
                          stackIn_6_0 = stackOut_4_0;
                          stackIn_5_0 = stackOut_4_0;
                          if (nh.field_k < 2) {
                            stackOut_6_0 = stackIn_6_0;
                            stackOut_6_1 = 0;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            break L12;
                          } else {
                            stackOut_5_0 = stackIn_5_0;
                            stackOut_5_1 = 1;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            break L12;
                          }
                        }
                        L13: {
                          ll.field_k = stackIn_7_0 | stackIn_7_1 != 0;
                          if (!tl.field_d) {
                            break L13;
                          } else {
                            tl.field_d = false;
                            a.a(320, ne.field_c.field_N, (se) (Object) ne.field_c, true, false, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                            if (cm.field_R != null) {
                              pn discarded$9 = i.field_A.a((java.awt.Component) (Object) cm.field_R, (byte) 51, false);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (fc.a(dc.field_z, (byte) -120)) {
                          af.a((byte) 114);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    fm.field_a = ii.field_F;
                    break L2;
                  }
                }
              }
            }
            L14: {
              if (ik.field_e == null) {
                break L14;
              } else {
                if (mn.field_b != -1) {
                  ik.field_e.a(false, 251569954);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (param1 == -69) {
                break L15;
              } else {
                this.c(true, (byte) -64);
                break L15;
              }
            }
            if (dc.field_z == -2) {
              var3 = new pj();
              var3.field_v = uk.a(0, new Random());
              var4 = 0;
              L16: while (true) {
                if (49 <= var4) {
                  break L1;
                } else {
                  L17: {
                    if (0 == oi.b(0, 5)) {
                      if (var3.field_h[var4].field_a == 0) {
                        var3.field_h[var4] = new ai(ji.a(37, false, 4));
                        break L17;
                      } else {
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  var4++;
                  continue L16;
                }
              }
            } else {
              break L0;
            }
          }
          L18: {
            if (null == gm.field_d) {
              stackOut_76_0 = 10000;
              stackIn_77_0 = stackOut_76_0;
              break L18;
            } else {
              stackOut_75_0 = gm.field_d.field_N;
              stackIn_77_0 = stackOut_75_0;
              break L18;
            }
          }
          L19: {
            var4 = stackIn_77_0;
            var3.field_y = var4;
            var3.field_o = var4 / 10;
            var3.field_A[0] = new hb(0, 25);
            var3.field_A[1] = new hb(1, 27);
            var3.field_A[2] = new hb(2, 18);
            var3.field_A[3] = new hb(3, 19);
            var3.a(false, 4);
            ik.field_e = new go(false, var3);
            var5 = cm.field_Q ? 1 : 0;
            if (!ve.a(false)) {
              stackOut_79_0 = 0;
              stackIn_80_0 = stackOut_79_0;
              break L19;
            } else {
              stackOut_78_0 = 12;
              stackIn_80_0 = stackOut_78_0;
              break L19;
            }
          }
          gd.a(stackIn_80_0, 0, -1, var5 != 0);
          break L0;
        }
        L20: {
          if (dc.field_z == -3) {
            L21: {
              L22: {
                var3 = new pj();
                if (ed.c(true)) {
                  break L22;
                } else {
                  if (gm.field_d.field_q == -1) {
                    var3.field_v = new wm(gm.field_d.field_k);
                    var3.field_h = gm.field_d.field_L;
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              var4_ref_Random = new Random();
              var3.field_v = uk.a(0, var4_ref_Random);
              var3.field_h = da.a(var3.field_v, (byte) 71, var4_ref_Random);
              if (!ed.c(true)) {
                break L21;
              } else {
                gm.field_d = new lb();
                gm.field_d.field_L = var3.field_h;
                gm.field_d.field_k = var3.field_v;
                break L21;
              }
            }
            L23: {
              var3.field_o = 1000;
              var3.field_A[0] = new hb(0, 1);
              var3.field_A[1] = new hb(1, 3);
              var3.field_A[2] = new hb(2, 4);
              var3.field_A[3] = new hb(3, 2);
              var3.a(false, 4);
              ha.d(1);
              ik.field_e = new go(false, var3);
              if (!cm.field_Q) {
                stackOut_91_0 = 0;
                stackIn_92_0 = stackOut_91_0;
                break L23;
              } else {
                stackOut_90_0 = 1;
                stackIn_92_0 = stackOut_90_0;
                break L23;
              }
            }
            L24: {
              var4 = stackIn_92_0;
              if (!ve.a(false)) {
                stackOut_94_0 = 0;
                stackIn_95_0 = stackOut_94_0;
                break L24;
              } else {
                stackOut_93_0 = 12;
                stackIn_95_0 = stackOut_93_0;
                break L24;
              }
            }
            gd.a(stackIn_95_0, 0, -1, var4 != 0);
            break L20;
          } else {
            break L20;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int[] var2_ref_int__ = null;
        lb var2_ref_lb = null;
        String var2_ref_String = null;
        pj var2_ref_pj = null;
        int var3 = 0;
        wj var4_ref_wj = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        di[] var5_ref_di__ = null;
        int var6 = 0;
        int var7 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        Object var17 = null;
        ak var18 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_128_2 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_129_2 = 0;
        int stackIn_129_3 = 0;
        int stackIn_137_0 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_128_2 = 0;
        int stackOut_128_3 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_127_2 = 0;
        int stackOut_127_3 = 0;
        L0: {
          var17 = null;
          var7 = field_K;
          int discarded$6 = ib.b((byte) 31);
          int discarded$7 = mn.a((byte) -42);
          if (ef.field_h) {
            L1: {
              if (kj.field_n == 0) {
                break L1;
              } else {
                L2: {
                  if (5 * kh.field_m.length / 2 > kj.field_n) {
                    break L2;
                  } else {
                    if (0 == la.field_g) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                int fieldTemp$8 = kj.field_n + 1;
                kj.field_n = kj.field_n + 1;
                if (fieldTemp$8 >= 5 * kh.field_m.length) {
                  kj.field_n = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (0 != no.field_d) {
                kj.field_n = 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (ao.a((byte) 79)) {
              if (!di.field_e) {
                pn discarded$9 = i.field_A.a((java.awt.Component) (Object) c.field_h, (byte) 61, true);
                di.field_e = true;
                break L0;
              } else {
                break L0;
              }
            } else {
              L4: {
                if (c.field_h != gi.field_R) {
                  break L4;
                } else {
                  if (!di.field_e) {
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
              pn discarded$10 = i.field_A.a((java.awt.Component) (Object) c.field_h, (byte) 116, false);
              di.field_e = false;
              gi.field_R = c.field_h;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L5: {
          go.b((byte) 14);
          if (cm.field_R == null) {
            break L5;
          } else {
            if (cm.field_R.field_g) {
              ib.a(930);
              hh.a((byte) -128);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          stackOut_24_0 = this;
          stackIn_26_0 = stackOut_24_0;
          stackIn_25_0 = stackOut_24_0;
          if (cm.field_R == null) {
            stackOut_26_0 = this;
            stackOut_26_1 = 0;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            break L6;
          } else {
            stackOut_25_0 = this;
            stackOut_25_1 = 1;
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            break L6;
          }
        }
        L7: {
          ((DungeonAssault) this).a(stackIn_27_1 != 0, (byte) -74);
          if (ld.field_i) {
            bo.h(78);
            ld.field_i = false;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          mo.field_a = mo.field_a + 1;
          if (!ao.a((byte) -123)) {
            break L8;
          } else {
            ((DungeonAssault) this).g((byte) 2);
            if (ao.a((byte) 121)) {
              return;
            } else {
              break L8;
            }
          }
        }
        L9: {
          if (param0 < -89) {
            break L9;
          } else {
            this.c(false, (byte) -112);
            break L9;
          }
        }
        L10: {
          if (ef.field_h) {
            if (hc.b(1)) {
              if (!ib.a((byte) 84)) {
                if (!sl.b(15000)) {
                  if (!ue.b((byte) -93)) {
                    this.c(false, (byte) -69);
                    break L10;
                  } else {
                    if (~fm.field_a == ~fm.field_e) {
                      L11: {
                        var2 = l.d(4570);
                        if (var2 == 1) {
                          ik.a(bh.field_Q, 53, 0);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      this.c(true, (byte) -69);
                      break L10;
                    } else {
                      this.c(false, (byte) -69);
                      break L10;
                    }
                  }
                } else {
                  L12: {
                    stackOut_54_0 = this;
                    stackOut_54_1 = 82;
                    stackIn_56_0 = stackOut_54_0;
                    stackIn_56_1 = stackOut_54_1;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    if (null == cm.field_R) {
                      stackOut_56_0 = this;
                      stackOut_56_1 = stackIn_56_1;
                      stackOut_56_2 = 0;
                      stackIn_57_0 = stackOut_56_0;
                      stackIn_57_1 = stackOut_56_1;
                      stackIn_57_2 = stackOut_56_2;
                      break L12;
                    } else {
                      stackOut_55_0 = this;
                      stackOut_55_1 = stackIn_55_1;
                      stackOut_55_2 = 1;
                      stackIn_57_0 = stackOut_55_0;
                      stackIn_57_1 = stackOut_55_1;
                      stackIn_57_2 = stackOut_55_2;
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      var2 = ((DungeonAssault) this).b((byte) stackIn_57_1, stackIn_57_2 != 0);
                      if (1 == var2) {
                        break L14;
                      } else {
                        if (2 != var2) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (null != cm.field_R) {
                        ib.a(930);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    if (var2 != 2) {
                      break L13;
                    } else {
                      eg.a((byte) 120, m.c(true));
                      break L13;
                    }
                  }
                  this.c(true, (byte) -69);
                  break L10;
                }
              } else {
                up.c((byte) 126);
                if (~fm.field_e == ~fm.field_a) {
                  L16: {
                    var2 = mf.b(12210);
                    if (var2 == 2) {
                      ib.a(930);
                      break L16;
                    } else {
                      if (var2 == 3) {
                        tl.field_d = false;
                        a.a(320, ne.field_c.field_N, (se) (Object) ne.field_c, true, true, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                        if (cm.field_R == null) {
                          break L16;
                        } else {
                          pn discarded$11 = i.field_A.a((java.awt.Component) (Object) cm.field_R, (byte) 86, false);
                          break L16;
                        }
                      } else {
                        if (4 == var2) {
                          tl.field_d = true;
                          ik.a(ve.field_c, 86, 0);
                          break L16;
                        } else {
                          this.c(true, (byte) -69);
                          break L10;
                        }
                      }
                    }
                  }
                  this.c(true, (byte) -69);
                  break L10;
                } else {
                  this.c(false, (byte) -69);
                  break L10;
                }
              }
            } else {
              nb.a(22);
              break L10;
            }
          } else {
            td.a(pj.field_r, 121);
            if (!this.h(0)) {
              break L10;
            } else {
              ef.field_h = true;
              break L10;
            }
          }
        }
        L17: {
          if (!ed.c(true)) {
            L18: while (true) {
              var18 = (ak) (Object) ll.field_i.b((byte) -124);
              if (var18 != null) {
                vb.a(4, (byte) 84, var18);
                continue L18;
              } else {
                break L17;
              }
            }
          } else {
            break L17;
          }
        }
        L19: while (true) {
          if (!di.a(uo.field_c, -1)) {
            L20: {
              op.a(0, 0);
              if (!dm.c(81)) {
                break L20;
              } else {
                L21: {
                  L22: {
                    var2 = ((DungeonAssault) this).f((byte) 101);
                    if (var2 == 0) {
                      break L22;
                    } else {
                      if (var2 != 1) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (!ed.c(true)) {
                      gm.field_d = null;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  if (var2 == 1) {
                    kh.field_s = true;
                    break L21;
                  } else {
                    L24: {
                      if (!nf.field_A) {
                        break L24;
                      } else {
                        gh.field_f = true;
                        gd.a(0, 0, 0, false);
                        break L24;
                      }
                    }
                    kh.field_s = false;
                    break L21;
                  }
                }
                L25: {
                  var3 = 0;
                  if (var2 == 2) {
                    var3 = 1;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (kh.field_s) {
                    var3 = 1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (dm.c(71)) {
                    break L27;
                  } else {
                    var3 = 0;
                    break L27;
                  }
                }
                if (var3 == 0) {
                  break L20;
                } else {
                  l.a(-1);
                  break L20;
                }
              }
            }
            return;
          } else {
            if (hc.field_c == 54) {
              var2_ref_int__ = wa.b(-1);
              var10 = var2_ref_int__;
              var4_ref_wj = ra.field_c;
              var5 = ((ec) (Object) var4_ref_wj).c(true);
              var6 = 0;
              L28: while (true) {
                if (var6 >= var5) {
                  L29: {
                    if (wh.field_d) {
                      var11 = var2_ref_int__;
                      var12 = gj.field_c;
                      var4_ref_int__ = gj.field_c;
                      var5 = 0;
                      L30: while (true) {
                        if (8 <= var5) {
                          var3 = 0;
                          L31: while (true) {
                            if (var3 >= ce.field_o.length) {
                              break L29;
                            } else {
                              L32: {
                                if (!vl.a(var3, -67, var2_ref_int__)) {
                                  break L32;
                                } else {
                                  wl.field_a.a((ne) (Object) new a(var3), false);
                                  break L32;
                                }
                              }
                              var3++;
                              continue L31;
                            }
                          }
                        } else {
                          var11[var5] = nb.a(var11[var5], ~var12[var5]);
                          var5++;
                          continue L30;
                        }
                      }
                    } else {
                      break L29;
                    }
                  }
                  var13 = gj.field_c;
                  var14 = var2_ref_int__;
                  var4_ref_int__ = var2_ref_int__;
                  var5 = 0;
                  L33: while (true) {
                    if (8 <= var5) {
                      var15 = bp.field_e;
                      var16 = var2_ref_int__;
                      var4_ref_int__ = var2_ref_int__;
                      var5 = 0;
                      L34: while (true) {
                        if (var5 >= 8) {
                          rf.field_S = true;
                          continue L19;
                        } else {
                          var15[var5] = mp.a(var15[var5], var16[var5]);
                          var5++;
                          continue L34;
                        }
                      }
                    } else {
                      var13[var5] = mp.a(var13[var5], var14[var5]);
                      var5++;
                      continue L33;
                    }
                  }
                } else {
                  var10[var6] = ((ec) (Object) var4_ref_wj).h(-48);
                  var6++;
                  continue L28;
                }
              }
            } else {
              if (hc.field_c == 55) {
                L35: {
                  L36: {
                    var2_ref_lb = gm.field_d;
                    gm.field_d = new lb((ec) (Object) ra.field_c, 19);
                    if (mn.field_b == 4) {
                      break L36;
                    } else {
                      if (dc.field_z == 4) {
                        break L36;
                      } else {
                        break L35;
                      }
                    }
                  }
                  jk.j((byte) 59);
                  break L35;
                }
                L37: {
                  L38: {
                    if (5 == mn.field_b) {
                      break L38;
                    } else {
                      if (dc.field_z != 5) {
                        break L37;
                      } else {
                        break L38;
                      }
                    }
                  }
                  u.a(1, var2_ref_lb);
                  break L37;
                }
                L39: {
                  L40: {
                    if (mn.field_b == 2) {
                      break L40;
                    } else {
                      if (dc.field_z != 2) {
                        break L39;
                      } else {
                        break L40;
                      }
                    }
                  }
                  sh.a(27886, var2_ref_lb);
                  break L39;
                }
                L41: {
                  if (mn.field_b == 3) {
                    break L41;
                  } else {
                    if (dc.field_z != 3) {
                      continue L19;
                    } else {
                      break L41;
                    }
                  }
                }
                hi.b(1);
                continue L19;
              } else {
                L42: {
                  if (56 == hc.field_c) {
                    break L42;
                  } else {
                    if (57 != hc.field_c) {
                      if (hc.field_c != 58) {
                        if (61 == hc.field_c) {
                          L43: {
                            var2_ref_String = ra.field_c.a(-21030);
                            var3 = ra.field_c.k(0);
                            var4 = ra.field_c.c(true);
                            var5 = ra.field_c.h(-111);
                            if (ra.field_c.c(true) != 1) {
                              stackOut_136_0 = 0;
                              stackIn_137_0 = stackOut_136_0;
                              break L43;
                            } else {
                              stackOut_135_0 = 1;
                              stackIn_137_0 = stackOut_135_0;
                              break L43;
                            }
                          }
                          var6 = stackIn_137_0;
                          if (2 != dc.field_z) {
                            continue L19;
                          } else {
                            ((bg) (Object) bf.field_f[2]).a(var6 != 0, var4, 0, var5, var3, var2_ref_String);
                            continue L19;
                          }
                        } else {
                          if (hc.field_c == 62) {
                            L44: {
                              L45: {
                                af.a((byte) 9);
                                var2_ref_pj = new pj((ec) (Object) ra.field_c, true);
                                if (null == ik.field_e) {
                                  break L45;
                                } else {
                                  if (ik.field_e.field_Y.field_f == var2_ref_pj.field_f) {
                                    ik.field_e = new go(true, var2_ref_pj, ik.field_e);
                                    break L44;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              ik.field_e = new go(true, var2_ref_pj);
                              break L44;
                            }
                            gd.a(dc.field_z, 0, -1, false);
                            kh.field_s = false;
                            nf.field_A = true;
                            continue L19;
                          } else {
                            if (hc.field_c != 72) {
                              L46: {
                                if (!nf.field_A) {
                                  break L46;
                                } else {
                                  if (null == ik.field_e) {
                                    break L46;
                                  } else {
                                    if (!ik.field_e.j(0)) {
                                      break L46;
                                    } else {
                                      continue L19;
                                    }
                                  }
                                }
                              }
                              ((DungeonAssault) this).d(true);
                              continue L19;
                            } else {
                              L47: {
                                if (nf.field_A) {
                                  af.a((byte) 14);
                                  if (nf.field_A) {
                                    nf.field_A = false;
                                    ik.field_e.a(17158, false);
                                    gh.field_f = true;
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                } else {
                                  break L47;
                                }
                              }
                              kh.field_s = false;
                              continue L19;
                            }
                          }
                        }
                      } else {
                        hm.a(0);
                        continue L19;
                      }
                    } else {
                      break L42;
                    }
                  }
                }
                var2 = ra.field_c.f(-123);
                var3 = ra.field_c.f(-124);
                var4 = ra.field_c.c(true);
                var5_ref_di__ = new di[var4];
                var6 = 0;
                L48: while (true) {
                  if (~var4 >= ~var6) {
                    L49: {
                      stackOut_126_0 = var2;
                      stackOut_126_1 = var3;
                      stackOut_126_2 = 22;
                      stackIn_128_0 = stackOut_126_0;
                      stackIn_128_1 = stackOut_126_1;
                      stackIn_128_2 = stackOut_126_2;
                      stackIn_127_0 = stackOut_126_0;
                      stackIn_127_1 = stackOut_126_1;
                      stackIn_127_2 = stackOut_126_2;
                      if (hc.field_c != 57) {
                        stackOut_128_0 = stackIn_128_0;
                        stackOut_128_1 = stackIn_128_1;
                        stackOut_128_2 = stackIn_128_2;
                        stackOut_128_3 = 0;
                        stackIn_129_0 = stackOut_128_0;
                        stackIn_129_1 = stackOut_128_1;
                        stackIn_129_2 = stackOut_128_2;
                        stackIn_129_3 = stackOut_128_3;
                        break L49;
                      } else {
                        stackOut_127_0 = stackIn_127_0;
                        stackOut_127_1 = stackIn_127_1;
                        stackOut_127_2 = stackIn_127_2;
                        stackOut_127_3 = 1;
                        stackIn_129_0 = stackOut_127_0;
                        stackIn_129_1 = stackOut_127_1;
                        stackIn_129_2 = stackOut_127_2;
                        stackIn_129_3 = stackOut_127_3;
                        break L49;
                      }
                    }
                    ja.a(stackIn_129_0, stackIn_129_1, (byte) stackIn_129_2, stackIn_129_3 != 0, var5_ref_di__);
                    continue L19;
                  } else {
                    var5_ref_di__[var6] = mm.a((ec) (Object) ra.field_c, false);
                    var6++;
                    continue L48;
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0) {
        tc var2 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        ((DungeonAssault) this).a(false, 32, 8, 2, 17, 0, 5000, 1);
        var2 = new tc();
        var2.field_A.c((byte) 7, 128, 9);
        var2.field_B.c((byte) -120, 128, 9);
        af.a(true, var2, 22050, 22050, (java.awt.Component) (Object) c.field_h, -126, 2048, i.field_A);
        cm.a(1.600000023841858f, 0.9200000166893005f, -7788, 0.10000000149011612f, 25.0f);
        he.field_p = 16711680;
        dc.field_l = 128;
        ui.field_b = 4473924;
        il.field_a = 255;
        om.field_a = 16777215;
        sm.field_c = 16776960;
        j.f((byte) -4);
        kd.b(0);
        ((DungeonAssault) this).b(true, (byte) -67);
        uo.field_c[70] = 0;
        uo.field_c[55] = 704;
        uo.field_c[57] = -2;
        uo.field_c[66] = 2;
        uo.field_c[54] = -1;
        uo.field_c[67] = 9;
        uo.field_c[62] = -2;
        uo.field_c[59] = 8;
        uo.field_c[56] = -2;
        uo.field_c[72] = 0;
        uo.field_c[65] = -1;
        kj.field_n = 0;
        uo.field_c[58] = 0;
        uo.field_c[61] = -1;
        uo.field_c[68] = 3;
        uo.field_c[63] = 10;
        if (param0 <= -15) {
          L0: {
            if (2 > nh.field_k) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          ll.field_k = stackIn_5_0 != 0;
          return;
        } else {
          return;
        }
    }

    public final void init() {
        ((DungeonAssault) this).a(32, "dungeonassault", 0);
    }

    final void b(boolean param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          DungeonAssault.h((byte) 114);
          a.a(23779);
          md.h(-4);
          tc.a((byte) -86);
          rl.a((byte) 75);
          vj.a(24243);
          nb.a((byte) 109);
          td.a(23);
          qe.a();
          te.a();
          gh.a(7);
          og.a(-129);
          sb.a((byte) -88);
          fo.a((byte) -73);
          t.a(-11353);
          jh.a();
          in.e(-1);
          b.b(-30719);
          kg.a(false);
          tl.a((byte) 50);
          mh.a(16);
          nl.a((byte) -109);
          gf.c();
          nh.a(param0);
          se.a();
          ig.a(-2898);
          dm.b(0);
          ec.i(25);
          kd.a((byte) -101);
          sp.a(true);
          ml.a((byte) 63);
          ri.a(105);
          sn.a(5);
          ib.d(507);
          ta.a(-84);
          to.a(0);
          kp.b(0);
          cg.a((byte) -117);
          la.c((byte) -97);
          op.a((byte) -120);
          mp.a((byte) 112);
          sl.a(105);
          gj.a((byte) 80);
          c.a(-9431);
          wk.b(false);
          ek.a((byte) -115);
          bn.a((byte) -122);
          go.f(10);
          lb.a((byte) 119);
          hi.a(-113);
          ea.a(0);
          ke.a(-123);
          n.a(3554);
          hb.a((byte) 3);
          ai.a((byte) 106);
          jc.a(0);
          ua.a((byte) 103);
          ne.b(-18880);
          qj.a(-2418);
          bc.a(24740);
          lc.a(true);
          ja.a(param0);
          lg.a(true);
          eh.a(73);
          sg.a((byte) -88);
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          f.a(stackIn_3_0 != 0);
          fp.a(-4126);
          pp.e(73);
          gd.e(0);
          nn.b((byte) -80);
          kl.a(117);
          rj.b(false);
          sa.b(false);
          ug.e(0);
          wa.c(23413);
          lp.a((byte) 16);
          vm.d();
          hg.d(26609);
          vn.e();
          cb.a(27525);
          ae.a((byte) -4);
          ko.d(-125);
          qk.a((byte) 127);
          uf.b(0);
          gm.a(-94);
          pj.e(126);
          mo.a(2);
          ul.a(true);
          jg.a((byte) -126);
          hd.b((byte) 117);
          uj.a(37);
          cd.a(-1);
          vc.a(-6058);
          mi.c(-128);
          fd.a((byte) 65);
          hl.a(50);
          rk.a(true);
          wj.n(7);
          qc.a(0);
          dd.c((byte) -40);
          en.a(0);
          d.a(0);
          if (param0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          p.d(stackIn_6_0 != 0);
          ed.f((byte) -89);
          ih.e(-2431);
          bg.b(41);
          pd.c((byte) 71);
          le.a(103);
          di.a((byte) -78);
          db.c((byte) 127);
          wo.a((byte) 100);
          jm.a((byte) -123);
          ud.a((byte) -124);
          tk.b((byte) 10);
          ob.g(16);
          fi.a((byte) -106);
          qp.b((byte) 56);
          qd.a(true);
          ji.f((byte) -98);
          jb.p(-71);
          wi.i((byte) -97);
          jk.n(-18554);
          nk.n(2121792);
          rg.h((byte) -53);
          if (param0) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          ia.b(stackIn_9_0 != 0);
          dn.f((byte) -108);
          gk.b(param0);
          lh.a(-107);
          so.a((byte) 95);
          df.a(255);
          fj.a((byte) -75);
          ff.c(-103);
          hj.f(16744448);
          lo.a(114);
          ll.a((byte) 92);
          rd.b(true);
          s.a(-55);
          pa.a(2601);
          ka.a((byte) -67);
          bk.a(param0);
          il.a((byte) 111);
          bb.a((byte) 127);
          cc.b(-86);
          je.a(true);
          tm.a(-107);
          uk.a(0);
          qa.b(-2544);
          ld.a(false);
          hc.a(32);
          nm.n(38);
          vd.a((byte) -96);
          hh.b(1);
          re.c();
          jp.a();
          sm.a((byte) -118);
          qh.b((byte) 75);
          jj.a((byte) 80);
          rn.b(64);
          om.a(63);
          mn.b((byte) 94);
          jl.a((byte) -113);
          li.a(false);
          ok.f(-16218);
          tb.b((byte) -47);
          ql.b((byte) 20);
          ik.a(0);
          ra.a((byte) -114);
          un.a((byte) 23);
          ej.a();
          dc.a((byte) 108);
          oe.a(0);
          kn.a(0);
          nj.a((byte) 84);
          oh.a(37);
          an.c(-13023);
          jn.a(1);
          im.a(-1);
          l.a((byte) -24);
          lm.d((byte) -123);
          if (param0) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          ck.b(stackIn_12_0 != 0);
          da.a(6);
          sj.g((byte) -10);
          rf.b(param0);
          ii.e((byte) -21);
          dj.a((byte) 113);
          am.a(30111);
          nd.b();
          vb.a((byte) -69);
          nf.e((byte) 93);
          hk.a(-73);
          gb.a(32767);
          eg.d(-23658);
          hp.a(35);
          no.a((byte) -126);
          um.a(false);
          wl.a(98);
          fg.d(-102);
          kf.b(false);
          ag.a(16760896);
          ki.a((byte) -35);
          sf.c((byte) 114);
          lj.d(77);
          ro.f((byte) -88);
          oj.a((byte) -29);
          uo.a(-90);
          gl.c((byte) -105);
          oc.e(4296);
          dl.a(51);
          tp.h(35);
          up.a(false);
          em.c(true);
          ln.b(1148357992);
          co.e(96);
          ti.a(true);
          sh.a(false);
          vf.d(21);
          dg.b(false);
          uh.i((byte) -41);
          rm.m(4);
          hf.m(0);
          uc.c(false);
          gi.f((byte) -32);
          bh.f((byte) -106);
          ng.f((byte) 124);
          tn.h((byte) -89);
          rb.a(4935);
          ip.c((byte) 19);
          mf.a(5);
          cm.j(-119);
          mk.b(false);
          wg.a();
          kk.a(0);
          of.a((byte) 65);
          ah.a(-37);
          np.c((byte) -74);
          fk.d(67);
          j.g((byte) -7);
          eb.f((byte) 86);
          ol.a((byte) -96);
          fe.b((byte) -34);
          ep.a(124);
          bp.a(-1);
          oi.h(119);
          bj.h(31029);
          ad.a(1);
          qi.a(true);
          dh.a(20);
          wf.d((byte) -28);
          pb.e((byte) -78);
          ha.c(64);
          rc.a((byte) -127);
          rp.b((byte) -68);
          g.g(-101);
          oo.a(13054);
          bi.a();
          ho.a(0);
          id.a((byte) -90);
          fa.a(-28822);
          wm.a((byte) 112);
          gg.a(0);
          hm.d(269);
          tf.a(-1);
          k.a(true);
          fm.a(param0);
          cf.a(30);
          o.d(0);
          wh.b(96);
          na.c(-91);
          oa.a((byte) 126);
          mc.c(24);
          ic.d(4741);
          dk.a((byte) -107);
          sd.b(false);
          al.a((byte) 17);
          fn.d(1);
          mj.a(127);
          bo.c((byte) -36);
          pm.a(112);
          bl.d((byte) -128);
          jd.a(1);
          h.a((byte) 16);
          ac.a(19757);
          af.a(0);
          vk.b((byte) 75);
          wd.a(115);
          fl.a((byte) 63);
          gn.a(194);
          ie.d(-102);
          lf.d(-121);
          pk.e(88);
          ce.d((byte) 58);
          bf.a((byte) 85);
          me.a(36);
          ef.a((byte) 111);
          ao.d(10625);
          ba.a((byte) 117);
          ch.c(0);
          sc.b((byte) -94);
          vl.a((byte) -115);
          e.c((byte) 29);
          qf.b(-21);
          if (param0) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        jf.a(stackIn_15_0 != 0);
        fc.b(18677);
        bd.b(76);
        cp.c((byte) -66);
        u.c((byte) 96);
        lk.h(25161);
        kc.a(0);
        pe.a(9);
        ak.a(-120);
        ve.a(-125);
        r.a(-113);
        i.a((byte) 122);
        kj.a(-109);
        mm.a(127);
        ub.a((byte) 123);
        ue.a((byte) 36);
        pi.a(11877);
        tg.a(400);
        kh.e((byte) 102);
        vo.e(1);
        qm.d(false);
        ga.d((byte) 75);
        he.d((byte) 117);
        be.e(-15818);
        fb.a(25);
        ci.a(116);
        od.b((byte) 106);
        m.d(-1);
        ab.b(1781937827);
        ((DungeonAssault) this).field_p = null;
    }

    public DungeonAssault() {
    }

    private final boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var3 = field_K;
        he.e(-23487);
        if (!tf.a((java.applet.Applet) this, 1041792321)) {
          return false;
        } else {
          ai.a(-78);
          var2 = 0;
          L0: while (true) {
            if (var2 >= 14) {
              L1: {
                mn.field_b = 13;
                dc.field_z = 13;
                bf.field_f[13].b(false);
                if (!ed.c(true)) {
                  break L1;
                } else {
                  gm.field_d = null;
                  break L1;
                }
              }
              L2: {
                ag.a(50, 55);
                nf.d(0);
                pn discarded$1 = i.field_A.a((java.awt.Component) (Object) c.field_h, (byte) 25, false);
                gi.field_R = c.field_h;
                ll.a(-26);
                if (nh.field_k < 2) {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L2;
                } else {
                  stackOut_22_0 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  break L2;
                }
              }
              ll.field_k = stackIn_24_0 != 0;
              return true;
            } else {
              L3: {
                if (var2 == 4) {
                  bf.field_f[var2] = (qe) (Object) new p();
                  break L3;
                } else {
                  if (var2 == 5) {
                    bf.field_f[var2] = (qe) (Object) new ih();
                    break L3;
                  } else {
                    if (var2 == 2) {
                      bf.field_f[var2] = (qe) (Object) new bg();
                      break L3;
                    } else {
                      if (var2 != 3) {
                        if (var2 == 13) {
                          bf.field_f[var2] = (qe) (Object) new ud();
                          break L3;
                        } else {
                          if (var2 == 7) {
                            bf.field_f[var2] = (qe) (Object) new fi();
                            break L3;
                          } else {
                            bf.field_f[var2] = (qe) (Object) new qc(var2);
                            break L3;
                          }
                        }
                      } else {
                        bf.field_f[var2] = (qe) (Object) new db();
                        break L3;
                      }
                    }
                  }
                }
              }
              var2++;
              continue L0;
            }
          }
        }
    }

    final void c(boolean param0) {
        wh.a(96);
        if (!(null == cm.field_R)) {
            ib.a(930);
        }
        kp.a(1);
        if (!param0) {
            field_G = null;
        }
    }

    final void b(byte param0) {
        java.awt.Canvas var2 = null;
        int var3_int = 0;
        a var3 = null;
        int var4_int = 0;
        cn var4 = null;
        long var4_long = 0L;
        cn var5 = null;
        int var5_int = 0;
        int var6 = 0;
        long var6_long = 0L;
        long var8 = 0L;
        int var10 = 0;
        int stackIn_23_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_21_0 = 0;
        var10 = field_K;
        var2 = fi.d(false);
        if (ao.a((byte) 72)) {
          mf.a((byte) -101, md.f(20), var2);
          return;
        } else {
          if (ef.field_h) {
            L0: {
              if (param0 == 38) {
                break L0;
              } else {
                this.c(true, (byte) -98);
                break L0;
              }
            }
            if (!hc.b(1)) {
              tp.a(10, 100.0f, kj.field_m);
              g.a(var2, param0 + 18093);
              return;
            } else {
              L1: {
                li.field_k = li.field_k + 1;
                if (~fm.field_a != ~bn.field_n) {
                  qp.a((byte) -24, mn.field_b, true);
                  if (co.field_G == null) {
                    break L1;
                  } else {
                    co.field_G.a(true, bd.field_f);
                    bd.field_f = bd.field_f + 1;
                    if (bd.field_f == 64) {
                      af.a((byte) 127);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (ib.a((byte) 35)) {
                  gf.g(0, 0, gf.field_i, gf.field_c);
                  var3_int = 15 + la.a((byte) -105);
                  var4_int = 30 + og.b(4);
                  fm.a(ea.a((byte) 13), var3_int, var4_int, (byte) -127);
                  ci.a((byte) -119);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!sl.b(15000)) {
                  if (!ue.b((byte) -112)) {
                    break L3;
                  } else {
                    if (ib.a((byte) 109)) {
                      break L3;
                    } else {
                      gf.g(0, 0, gf.field_i, gf.field_c);
                      rc.a(-126);
                      break L3;
                    }
                  }
                } else {
                  L4: {
                    if (cm.field_R == null) {
                      stackOut_22_0 = rj.field_o;
                      stackIn_23_0 = stackOut_22_0 ? 1 : 0;
                      break L4;
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      break L4;
                    }
                  }
                  fl.a(stackIn_23_0 != 0, (byte) 120);
                  break L3;
                }
              }
              L5: {
                if (~fm.field_a != ~fm.field_e) {
                  var3_int = pk.field_t * 256 / 16;
                  if (var3_int <= 0) {
                    break L5;
                  } else {
                    gf.b(0, 0, gf.field_i, gf.field_c, 0, var3_int);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                var3 = (a) (Object) wl.field_a.e(-24172);
                if (var3 != null) {
                  L7: {
                    if (null != sl.field_b) {
                      break L7;
                    } else {
                      ah.a(true, var3.field_j);
                      break L7;
                    }
                  }
                  L8: {
                    var4_int = 0;
                    if (40 <= ke.field_e) {
                      if (80 > ke.field_e) {
                        var5_int = (ke.field_e - 40 << 8) / 40;
                        ri.field_g.d(8, 0, 32, 32, var5_int);
                        break L8;
                      } else {
                        if (230 <= ke.field_e) {
                          if (ke.field_e >= 270) {
                            var4_int = 1;
                            break L8;
                          } else {
                            var5_int = (-ke.field_e + 270 << 8) / 40;
                            var4_int = 1;
                            ri.field_g.d(8, 0, 32, 32, var5_int);
                            break L8;
                          }
                        } else {
                          ec.field_j[var3.field_j].a(8, 0, 32, 32);
                          break L8;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((1 & li.field_k) != 0) {
                      sl.field_b.a();
                      break L9;
                    } else {
                      if (var4_int == 0) {
                        sl.field_b.a(pa.field_a, 0, 0);
                        break L9;
                      } else {
                        sl.field_b.b();
                        break L9;
                      }
                    }
                  }
                  if (40 > ke.field_e) {
                    break L6;
                  } else {
                    if (80 <= ke.field_e) {
                      if (ke.field_e < 230) {
                        ne.field_c.a(ce.field_o[var3.field_j], 48, 32 + ne.field_c.field_H >> 1, 0, -1, 128);
                        break L6;
                      } else {
                        if (270 > ke.field_e) {
                          var5_int = (-ke.field_e + 270 << 8) / 40;
                          ne.field_c.a(ce.field_o[var3.field_j], 48, 32 - -ne.field_c.field_H >> 1, 0, -1, var5_int >> 1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      var5_int = (-40 + ke.field_e << 8) / 40;
                      ne.field_c.a(ce.field_o[var3.field_j], 48, 32 - -ne.field_c.field_H >> 1, 0, -1, var5_int >> 1);
                      break L6;
                    }
                  }
                } else {
                  break L6;
                }
              }
              L10: {
                if (nh.field_k < 2) {
                  break L10;
                } else {
                  if (!ld.field_b) {
                    break L10;
                  } else {
                    ne.field_c.b(Integer.toString(bc.field_a), 20, 20, 16777215, 1);
                    var4_long = Runtime.getRuntime().totalMemory();
                    var6_long = Runtime.getRuntime().freeMemory();
                    var8 = var4_long - var6_long;
                    ne.field_c.b((int)(var8 >> 10) + "kb", 4, ne.field_c.field_H * 2 + 8, 16777215, -1);
                    ne.field_c.b(tc.field_u, 20, 80, 16777215, 1);
                    break L10;
                  }
                }
              }
              L11: {
                var4 = kh.field_m[kj.field_n / 5];
                var5 = jg.field_c[kj.field_n / 5];
                if (hj.field_S != -1) {
                  var6 = (int)((3.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 64.0);
                  var5.b(hj.field_S, eh.field_h, var6);
                  var4.h(hj.field_S, eh.field_h);
                  break L11;
                } else {
                  break L11;
                }
              }
              ob.a(0, param0 + -161, var2, 0);
              return;
            }
          } else {
            g.a(var2, 18131);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Beastman";
        field_G = "<col=E5A634>Your title, </col><%0><col=E5A634>, will appear in the Dragons of Renown table.";
        field_H = "Trap";
    }
}
