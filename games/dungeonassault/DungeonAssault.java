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
        try {
            field_I = null;
            field_H = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "DungeonAssault.E(" + param0 + ')');
        }
    }

    private final void c(boolean param0, byte param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        int stackIn_17_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_131_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Random var4_ref_Random = null;
        int var5 = 0;
        int var6 = 0;
        pj var9 = null;
        pj var10 = null;
        var6 = field_K;
        try {
          L0: {
            L1: {
              if ((fm.field_e ^ -1) == (fm.field_a ^ -1)) {
                L2: {
                  if (!param0) {
                    if (co.field_G == null) {
                      if (mn.field_b == -1) {
                        if (ik.field_e == null) {
                          break L2;
                        } else {
                          ik.field_e.c(true);
                          L3: while (true) {
                            if (!ha.b((byte) 47)) {
                              break L2;
                            } else {
                              ik.field_e.f();
                              continue L3;
                            }
                          }
                        }
                      } else {
                        if (fc.a(mn.field_b, (byte) -120)) {
                          bf.field_f[mn.field_b].c(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      bd.field_f = bd.field_f + 1;
                      if ((bd.field_f ^ -1) == -65) {
                        af.a((byte) 40);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                if (null == wl.field_a.e(-24172)) {
                  break L1;
                } else {
                  fieldTemp$0 = ke.field_e + 1;
                  ke.field_e = ke.field_e + 1;
                  if (fieldTemp$0 != 335) {
                    break L1;
                  } else {
                    wl.field_a.b((byte) -124);
                    sl.field_b = null;
                    pa.field_a = null;
                    ri.field_g = null;
                    break L1;
                  }
                }
              } else {
                if (fm.field_a == dg.field_H) {
                  pk.field_t = pk.field_t + 1;
                  if (pk.field_t != 16) {
                    break L1;
                  } else {
                    L4: {
                      if (tl.field_d) {
                        dn.b(false);
                        break L4;
                      } else {
                        bj.i(81);
                        break L4;
                      }
                    }
                    gm.field_d = null;
                    fm.field_a = bn.field_n;
                    break L1;
                  }
                } else {
                  if ((bn.field_n ^ -1) != (fm.field_a ^ -1)) {
                    pk.field_t = pk.field_t - 1;
                    if ((pk.field_t ^ -1) == -1) {
                      fm.field_a = fm.field_e;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (ed.c(true)) {
                        break L5;
                      } else {
                        L6: {
                          vk.a((byte) -31);
                          gd.a(g.field_Hb, 0, sa.field_f, false);
                          stackIn_16_0 = ll.field_k;

                          if ((nh.field_k ^ -1) > -3) {
                            stackIn_17_0 = stackIn_16_0;
                            stackIn_17_1 = 0;
                            break L6;
                          } else {

                            stackIn_17_0 = stackIn_16_0;
                            stackIn_17_1 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          ll.field_k = stackIn_17_0 | stackIn_17_1 != 0;
                          if (!tl.field_d) {
                            break L7;
                          } else {
                            tl.field_d = false;
                            a.a(320, ne.field_c.field_N, ne.field_c, true, false, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                            if (cm.field_R != null) {
                              i.field_A.a((java.awt.Component) ((Object) cm.field_R), (byte) 51, false);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (fc.a(dc.field_z, (byte) -120)) {
                          af.a((byte) 114);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    fm.field_a = ii.field_F;
                    break L1;
                  }
                }
              }
            }
            L8: {
              if (ik.field_e == null) {
                break L8;
              } else {
                if (0 != (mn.field_b ^ -1)) {
                  ik.field_e.a(false, 251569954);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (param1 == -69) {
                break L9;
              } else {
                this.c(true, (byte) -64);
                break L9;
              }
            }
            L10: {
              L11: {
                if (dc.field_z == -2) {
                  var9 = new pj();
                  var9.field_v = uk.a(0, new Random());
                  var4 = 0;
                  L12: while (true) {
                    if (49 <= var4) {
                      L13: {
                        if (null == gm.field_d) {
                          stackIn_106_0 = 10000;
                          break L13;
                        } else {
                          stackIn_106_0 = gm.field_d.field_N;
                          break L13;
                        }
                      }
                      L14: {
                        var4 = stackIn_106_0;
                        var9.field_y = var4;
                        var9.field_o = var4 / 10;
                        var9.field_A[0] = new hb(0, 25);
                        var9.field_A[1] = new hb(1, 27);
                        var9.field_A[2] = new hb(2, 18);
                        var9.field_A[3] = new hb(3, 19);
                        var9.a(false, 4);
                        ik.field_e = new go(false, var9);
                        var5 = cm.field_Q ? 1 : 0;
                        if (!ve.a(false)) {
                          stackIn_110_0 = 0;
                          break L14;
                        } else {
                          stackIn_110_0 = 12;
                          break L14;
                        }
                      }
                      gd.a(stackIn_110_0, 0, -1, var5 != 0);
                      break L11;
                    } else {
                      stackIn_112_0 = 0;

                      stackIn_112_1 = oi.b(0, 5);

                      L15: {
                        if (stackIn_112_0 == stackIn_112_1) {
                          if (var9.field_h[var4].field_a == 0) {
                            var9.field_h[var4] = new ai(ji.a(37, false, 4));
                            break L15;
                          } else {
                            break L15;
                          }
                        } else {
                          break L15;
                        }
                      }
                      var4++;
                      continue L12;
                    }
                  }
                } else {
                  break L11;
                }
              }
              stackIn_112_0 = 2;
              stackIn_112_1 = dc.field_z ^ -1;
              break L10;
            }
            L16: {
              if (stackIn_112_0 == stackIn_112_1) {
                L17: {
                  L18: {
                    var10 = new pj();
                    if (ed.c(true)) {
                      break L18;
                    } else {
                      if (0 == (gm.field_d.field_q ^ -1)) {
                        var10.field_v = new wm(gm.field_d.field_k);
                        var10.field_h = gm.field_d.field_L;
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  var4_ref_Random = new Random();
                  var10.field_v = uk.a(0, var4_ref_Random);
                  var10.field_h = da.a(var10.field_v, (byte) 71, var4_ref_Random);
                  if (!ed.c(true)) {
                    break L17;
                  } else {
                    gm.field_d = new lb();
                    gm.field_d.field_L = var10.field_h;
                    gm.field_d.field_k = var10.field_v;
                    break L17;
                  }
                }
                L19: {
                  var10.field_o = 1000;
                  var10.field_A[0] = new hb(0, 1);
                  var10.field_A[1] = new hb(1, 3);
                  var10.field_A[2] = new hb(2, 4);
                  var10.field_A[3] = new hb(3, 2);
                  var10.a(false, 4);
                  ha.d(1);
                  ik.field_e = new go(false, var10);
                  if (!cm.field_Q) {
                    stackIn_127_0 = 0;
                    break L19;
                  } else {
                    stackIn_127_0 = 1;
                    break L19;
                  }
                }
                L20: {
                  var4 = stackIn_127_0;
                  if (!ve.a(false)) {
                    stackIn_131_0 = 0;
                    break L20;
                  } else {
                    stackIn_131_0 = 12;
                    break L20;
                  }
                }
                gd.a(stackIn_131_0, 0, -1, var4 != 0);
                break L16;
              } else {
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "DungeonAssault.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_99_0 = null;
        Object stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        Object stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        boolean stackIn_139_0 = false;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        int stackIn_208_2 = 0;
        int stackIn_209_0;
        int stackIn_209_1;
        int stackIn_209_2;
        int stackIn_209_3;
        int stackIn_220_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
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
        ak var17_ref = null;
        int[] var18 = null;
        lb var19 = null;
        String var20 = null;
        pj var21 = null;
        int[] var22 = null;
        var17 = null;
        var7 = field_K;
        try {
          L0: {
            L1: {
              ib.b((byte) 31);
              mn.a((byte) -42);
              if (ef.field_h) {
                L2: {
                  if (kj.field_n == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (5 * kh.field_m.length / 2 > kj.field_n) {
                        break L3;
                      } else {
                        if (0 == la.field_g) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    fieldTemp$0 = kj.field_n + 1;
                    kj.field_n = kj.field_n + 1;
                    if (fieldTemp$0 >= 5 * kh.field_m.length) {
                      kj.field_n = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (0 != no.field_d) {
                    kj.field_n = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (ao.a((byte) 79)) {
                  if (!di.field_e) {
                    i.field_A.a((java.awt.Component) ((Object) c.field_h), (byte) 61, true);
                    di.field_e = true;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L5: {
                    if (c.field_h != gi.field_R) {
                      break L5;
                    } else {
                      if (!di.field_e) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  i.field_A.a((java.awt.Component) ((Object) c.field_h), (byte) 116, false);
                  di.field_e = false;
                  gi.field_R = c.field_h;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L6: {
              go.b((byte) 14);
              if (cm.field_R == null) {
                break L6;
              } else {
                if (cm.field_R.field_g) {
                  ib.a(930);
                  hh.a((byte) -128);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              stackIn_43_0 = this;

              if (cm.field_R == null) {
                stackIn_44_0 = this;
                stackIn_44_1 = 0;
                break L7;
              } else {
                stackIn_44_0 = this;
                stackIn_44_1 = 1;
                break L7;
              }
            }
            L8: {
              this.a(stackIn_44_1 != 0, (byte) -74);
              if (ld.field_i) {
                bo.h(78);
                ld.field_i = false;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              mo.field_a = mo.field_a + 1;
              if (!ao.a((byte) -123)) {
                break L9;
              } else {
                this.g((byte) 2);
                if (ao.a((byte) 121)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (param0 < -89) {
                break L10;
              } else {
                this.c(false, (byte) -112);
                break L10;
              }
            }
            L11: {
              if (ef.field_h) {
                if (hc.b(1)) {
                  if (!ib.a((byte) 84)) {
                    if (!sl.b(15000)) {
                      if (!ue.b((byte) -93)) {
                        this.c(false, (byte) -69);
                        break L11;
                      } else {
                        if ((fm.field_a ^ -1) == (fm.field_e ^ -1)) {
                          L12: {
                            var2_int = l.d(4570);
                            if (-2 == (var2_int ^ -1)) {
                              ik.a(bh.field_Q, 53, 0);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          this.c(true, (byte) -69);
                          break L11;
                        } else {
                          this.c(false, (byte) -69);
                          break L11;
                        }
                      }
                    } else {
                      L13: {
                        stackIn_101_0 = this;

                        stackIn_101_1 = 82;

                        if (null == cm.field_R) {
                          stackIn_102_0 = this;
                          stackIn_102_1 = stackIn_101_1;
                          stackIn_102_2 = 0;
                          break L13;
                        } else {
                          stackIn_99_0 = this;

                          stackIn_102_0 = this;
                          stackIn_102_1 = stackIn_101_1;
                          stackIn_102_2 = 1;
                          break L13;
                        }
                      }
                      L14: {
                        L15: {
                          var2_int = this.b((byte) stackIn_102_1, stackIn_102_2 != 0);
                          if (1 == var2_int) {
                            break L15;
                          } else {
                            if (2 != var2_int) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (null != cm.field_R) {
                            ib.a(930);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        if ((var2_int ^ -1) != -3) {
                          break L14;
                        } else {
                          eg.a((byte) 120, m.c(true));
                          break L14;
                        }
                      }
                      this.c(true, (byte) -69);
                      break L11;
                    }
                  } else {
                    up.c((byte) 126);
                    if ((fm.field_e ^ -1) == (fm.field_a ^ -1)) {
                      L17: {
                        var2_int = mf.b(12210);
                        if (var2_int == 2) {
                          ib.a(930);
                          break L17;
                        } else {
                          if (var2_int == 3) {
                            tl.field_d = false;
                            a.a(320, ne.field_c.field_N, ne.field_c, true, true, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                            if (cm.field_R == null) {
                              break L17;
                            } else {
                              i.field_A.a((java.awt.Component) ((Object) cm.field_R), (byte) 86, false);
                              break L17;
                            }
                          } else {
                            if (4 == var2_int) {
                              tl.field_d = true;
                              ik.a(ve.field_c, 86, 0);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      this.c(true, (byte) -69);
                      break L11;
                    } else {
                      this.c(false, (byte) -69);
                      break L11;
                    }
                  }
                } else {
                  nb.a(22);
                  break L11;
                }
              } else {
                td.a(pj.field_r, 121);
                if (!this.h(0)) {
                  break L11;
                } else {
                  ef.field_h = true;
                  break L11;
                }
              }
            }
            L18: {
              if (!ed.c(true)) {
                L19: while (true) {
                  var17_ref = (ak) ((Object) ll.field_i.b((byte) -124));
                  if (var17_ref != null) {
                    vb.a(4, (byte) 84, var17_ref);
                    continue L19;
                  } else {
                    break L18;
                  }
                }
              } else {
                break L18;
              }
            }
            L20: while (true) {
              stackIn_139_0 = di.a(uo.field_c, -1);
              L21: while (true) {
                L22: {
                  if (!stackIn_139_0) {
                    stackIn_254_0 = 0;
                    stackIn_254_1 = 0;
                    break L22;
                  } else {
                    stackIn_254_0 = -55;

                    stackIn_254_1 = hc.field_c ^ -1;

                    if (stackIn_254_0 == stackIn_254_1) {
                      var22 = wa.b(-1);
                      var18 = var22;
                      var2 = var18;
                      var10 = var2;
                      var4_ref_wj = ra.field_c;
                      var5 = ((ec) ((Object) var4_ref_wj)).c(true);
                      var6 = 0;
                      L23: while (true) {
                        if (var6 >= var5) {
                          L24: {
                            if (wh.field_d) {
                              var11 = var2;
                              var12 = gj.field_c;
                              var4_ref_int__ = gj.field_c;
                              var5 = 0;
                              L25: while (true) {
                                if (8 <= var5) {
                                  var3 = 0;
                                  L26: while (true) {
                                    if (var3 >= ce.field_o.length) {
                                      break L24;
                                    } else {
                                      stackIn_139_0 = vl.a(var3, -67, var22);

                                      L27: {
                                        if (!stackIn_139_0) {
                                          break L27;
                                        } else {
                                          wl.field_a.a(new a(var3), false);
                                          break L27;
                                        }
                                      }
                                      var3++;
                                      continue L26;
                                    }
                                  }
                                } else {
                                  var11[var5] = nb.a(var11[var5], var12[var5] ^ -1);
                                  var5++;
                                  continue L25;
                                }
                              }
                            } else {
                              break L24;
                            }
                          }
                          var13 = gj.field_c;
                          var14 = var2;
                          var4_ref_int__ = var2;
                          var5 = 0;
                          L28: while (true) {
                            if (8 <= var5) {
                              var15 = bp.field_e;
                              var16 = var2;
                              var4_ref_int__ = var2;
                              var5 = 0;
                              L29: while (true) {
                                if (var5 >= 8) {
                                  rf.field_S = true;
                                  continue L20;
                                } else {
                                  var15[var5] = mp.a(var15[var5], var16[var5]);
                                  var5++;
                                  continue L29;
                                }
                              }
                            } else {
                              var13[var5] = mp.a(var13[var5], var14[var5]);
                              var5++;
                              continue L28;
                            }
                          }
                        } else {
                          var10[var6] = ((ec) ((Object) var4_ref_wj)).h(-48);
                          var6++;
                          continue L23;
                        }
                      }
                    } else {
                      if (-56 == (hc.field_c ^ -1)) {
                        L30: {
                          L31: {
                            var19 = gm.field_d;
                            gm.field_d = new lb(ra.field_c, 19);
                            if (mn.field_b == 4) {
                              break L31;
                            } else {
                              if ((dc.field_z ^ -1) == -5) {
                                break L31;
                              } else {
                                break L30;
                              }
                            }
                          }
                          jk.j((byte) 59);
                          break L30;
                        }
                        L32: {
                          L33: {
                            if (5 == mn.field_b) {
                              break L33;
                            } else {
                              if (-6 != (dc.field_z ^ -1)) {
                                break L32;
                              } else {
                                break L33;
                              }
                            }
                          }
                          u.a(1, var19);
                          break L32;
                        }
                        L34: {
                          L35: {
                            if (-3 == (mn.field_b ^ -1)) {
                              break L35;
                            } else {
                              if (-3 != (dc.field_z ^ -1)) {
                                break L34;
                              } else {
                                break L35;
                              }
                            }
                          }
                          sh.a(27886, var19);
                          break L34;
                        }
                        L36: {
                          if (mn.field_b == 3) {
                            break L36;
                          } else {
                            if (dc.field_z != 3) {
                              continue L20;
                            } else {
                              break L36;
                            }
                          }
                        }
                        hi.b(1);
                        continue L20;
                      } else {
                        L37: {
                          if (56 == hc.field_c) {
                            break L37;
                          } else {
                            if (57 != hc.field_c) {
                              if (-59 != (hc.field_c ^ -1)) {
                                if (61 == hc.field_c) {
                                  L38: {
                                    var20 = ra.field_c.a(-21030);
                                    var3 = ra.field_c.k(0);
                                    var4 = ra.field_c.c(true);
                                    var5 = ra.field_c.h(-111);
                                    if (ra.field_c.c(true) != 1) {
                                      stackIn_220_0 = 0;
                                      break L38;
                                    } else {
                                      stackIn_220_0 = 1;
                                      break L38;
                                    }
                                  }
                                  var6 = stackIn_220_0;
                                  if (2 != dc.field_z) {
                                    continue L20;
                                  } else {
                                    ((bg) ((Object) bf.field_f[2])).a(var6 != 0, var4, 0, var5, var3, var20);
                                    continue L20;
                                  }
                                } else {
                                  if ((hc.field_c ^ -1) == -63) {
                                    L39: {
                                      L40: {
                                        af.a((byte) 9);
                                        var21 = new pj(ra.field_c, true);
                                        if (null == ik.field_e) {
                                          break L40;
                                        } else {
                                          if (ik.field_e.field_Y.field_f == var21.field_f) {
                                            ik.field_e = new go(true, var21, ik.field_e);
                                            break L39;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                      ik.field_e = new go(true, var21);
                                      break L39;
                                    }
                                    gd.a(dc.field_z, 0, -1, false);
                                    kh.field_s = false;
                                    nf.field_A = true;
                                    continue L20;
                                  } else {
                                    if (-73 != (hc.field_c ^ -1)) {
                                      L41: {
                                        if (!nf.field_A) {
                                          break L41;
                                        } else {
                                          if (null == ik.field_e) {
                                            break L41;
                                          } else {
                                            if (!ik.field_e.j(0)) {
                                              break L41;
                                            } else {
                                              continue L20;
                                            }
                                          }
                                        }
                                      }
                                      this.d(true);
                                      continue L20;
                                    } else {
                                      L42: {
                                        if (nf.field_A) {
                                          af.a((byte) 14);
                                          if (nf.field_A) {
                                            nf.field_A = false;
                                            ik.field_e.a(17158, false);
                                            gh.field_f = true;
                                            break L42;
                                          } else {
                                            break L42;
                                          }
                                        } else {
                                          break L42;
                                        }
                                      }
                                      kh.field_s = false;
                                      continue L20;
                                    }
                                  }
                                }
                              } else {
                                hm.a(0);
                                continue L20;
                              }
                            } else {
                              break L37;
                            }
                          }
                        }
                        var2_int = ra.field_c.f(-123);
                        var3 = ra.field_c.f(-124);
                        var4 = ra.field_c.c(true);
                        var5_ref_di__ = new di[var4];
                        var6 = 0;
                        L43: while (true) {
                          if ((var4 ^ -1) >= (var6 ^ -1)) {
                            L44: {
                              stackIn_208_0 = var2_int;

                              stackIn_208_1 = var3;

                              stackIn_208_2 = 22;

                              if (hc.field_c != 57) {
                                stackIn_209_0 = stackIn_208_0;
                                stackIn_209_1 = stackIn_208_1;
                                stackIn_209_2 = stackIn_208_2;
                                stackIn_209_3 = 0;
                                break L44;
                              } else {
                                stackIn_209_0 = stackIn_208_0;
                                stackIn_209_1 = stackIn_208_1;
                                stackIn_209_2 = stackIn_208_2;
                                stackIn_209_3 = 1;
                                break L44;
                              }
                            }
                            ja.a(stackIn_209_0, stackIn_209_1, (byte) stackIn_209_2, stackIn_209_3 != 0, var5_ref_di__);
                            continue L20;
                          } else {
                            var5_ref_di__[var6] = mm.a(ra.field_c, false);
                            var6++;
                            continue L43;
                          }
                        }
                      }
                    }
                  }
                }
                L45: {
                  L46: {
                    op.a(stackIn_254_0, stackIn_254_1);
                    if (!dm.c(81)) {
                      break L46;
                    } else {
                      L47: {
                        L48: {
                          var2_int = this.f((byte) 101);
                          if (-1 == (var2_int ^ -1)) {
                            break L48;
                          } else {
                            if (var2_int != 1) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        L49: {
                          if (!ed.c(true)) {
                            gm.field_d = null;
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        if (-2 == (var2_int ^ -1)) {
                          kh.field_s = true;
                          break L47;
                        } else {
                          L50: {
                            if (!nf.field_A) {
                              break L50;
                            } else {
                              gh.field_f = true;
                              gd.a(0, 0, 0, false);
                              break L50;
                            }
                          }
                          kh.field_s = false;
                          break L47;
                        }
                      }
                      L51: {
                        var3 = 0;
                        if (-3 == (var2_int ^ -1)) {
                          var3 = 1;
                          break L51;
                        } else {
                          break L51;
                        }
                      }
                      L52: {
                        if (kh.field_s) {
                          var3 = 1;
                          break L52;
                        } else {
                          break L52;
                        }
                      }
                      L53: {
                        if (dm.c(71)) {
                          break L53;
                        } else {
                          var3 = 0;
                          break L53;
                        }
                      }
                      if (var3 == 0) {
                        break L46;
                      } else {
                        l.a(-1);
                        break L45;
                      }
                    }
                  }
                  break L45;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2_ref), "DungeonAssault.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        tc var3 = null;
        int stackIn_6_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.a(false, 32, 8, 2, 17, 0, 5000, 1);
            var3 = new tc();
            var3.field_A.c((byte) 7, 128, 9);
            var3.field_B.c((byte) -120, 128, 9);
            af.a(true, var3, 22050, 22050, (java.awt.Component) ((Object) c.field_h), -126, 2048, i.field_A);
            cm.a(1.600000023841858f, 0.9200000166893005f, -7788, 0.10000000149011612f, 25.0f);
            he.field_p = 16711680;
            dc.field_l = 128;
            ui.field_b = 4473924;
            il.field_a = 255;
            om.field_a = 16777215;
            sm.field_c = 16776960;
            j.f((byte) -4);
            kd.b(0);
            this.b(true, (byte) -67);
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
              L1: {
                if (2 > nh.field_k) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              ll.field_k = stackIn_6_0 != 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void init() {
        try {
            this.a(32, "dungeonassault", 0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "DungeonAssault.init()");
        }
    }

    final void b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
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
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              f.a(stackIn_4_0 != 0);
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
                stackIn_8_0 = 0;
                break L2;
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            L3: {
              p.d(stackIn_8_0 != 0);
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
                stackIn_12_0 = 0;
                break L3;
              } else {
                stackIn_12_0 = 1;
                break L3;
              }
            }
            L4: {
              ia.b(stackIn_12_0 != 0);
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
                stackIn_16_0 = 0;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            L5: {
              ck.b(stackIn_16_0 != 0);
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
                stackIn_20_0 = 0;
                break L5;
              } else {
                stackIn_20_0 = 1;
                break L5;
              }
            }
            jf.a(stackIn_20_0 != 0);
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
            this.field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.B(" + param0 + ')');
        }
    }

    public DungeonAssault() {
    }

    private final boolean h(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_K;
        try {
          L0: {
            he.e(param0 + -23487);
            if (!tf.a((java.applet.Applet) (this), 1041792321)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              ai.a(param0 + -78);
              var2_int = param0;
              L1: while (true) {
                L2: {
                  if (-15 >= (var2_int ^ -1)) {
                    L3: {
                      mn.field_b = 13;
                      dc.field_z = 13;
                      bf.field_f[13].b(false);
                      if (!ed.c(true)) {
                        break L3;
                      } else {
                        gm.field_d = null;
                        break L3;
                      }
                    }
                    ag.a(50, 55);
                    nf.d(param0 + 0);
                    i.field_A.a((java.awt.Component) ((Object) c.field_h), (byte) 25, false);
                    gi.field_R = c.field_h;
                    ll.a(-26);
                    stackIn_46_0 = nh.field_k;
                    stackIn_46_1 = 2;
                    break L2;
                  } else {
                    stackIn_46_0 = var2_int ^ -1;

                    stackIn_46_1 = -5;

                    L4: {
                      if (stackIn_46_0 == stackIn_46_1) {
                        bf.field_f[var2_int] = (qe) ((Object) new p());
                        break L4;
                      } else {
                        if (var2_int == 5) {
                          bf.field_f[var2_int] = (qe) ((Object) new ih());
                          break L4;
                        } else {
                          if (var2_int == 2) {
                            bf.field_f[var2_int] = (qe) ((Object) new bg());
                            break L4;
                          } else {
                            if (-4 != (var2_int ^ -1)) {
                              if (var2_int == 13) {
                                bf.field_f[var2_int] = (qe) ((Object) new ud());
                                break L4;
                              } else {
                                if (var2_int == 7) {
                                  bf.field_f[var2_int] = (qe) ((Object) new fi());
                                  break L4;
                                } else {
                                  bf.field_f[var2_int] = (qe) ((Object) new qc(var2_int));
                                  break L4;
                                }
                              }
                            } else {
                              bf.field_f[var2_int] = (qe) ((Object) new db());
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L1;
                  }
                }
                L5: {
                  if (stackIn_46_0 < stackIn_46_1) {
                    stackIn_50_0 = 0;
                    break L5;
                  } else {
                    stackIn_50_0 = 1;
                    break L5;
                  }
                }
                ll.field_k = stackIn_50_0 != 0;
                stackIn_51_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_51_0 != 0;
        }
    }

    final void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              wh.a(96);
              if (null != cm.field_R) {
                ib.a(930);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              kp.a(1);
              if (param0) {
                break L2;
              } else {
                field_G = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.F(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        int stackIn_37_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var3 = null;
        int var3_int = 0;
        a var3_ref = null;
        int var4_int = 0;
        long var4_long = 0L;
        cn var4 = null;
        int var5_int = 0;
        cn var5 = null;
        long var6_long = 0L;
        int var6 = 0;
        long var8 = 0L;
        int var10 = 0;
        java.awt.Canvas var11 = null;
        var3 = null;
        var10 = field_K;
        try {
          L0: {
            var11 = fi.d(false);
            if (ao.a((byte) 72)) {
              mf.a((byte) -101, md.f(20), var11);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ef.field_h) {
                L1: {
                  if (param0 == 38) {
                    break L1;
                  } else {
                    this.c(true, (byte) -98);
                    break L1;
                  }
                }
                if (!hc.b(1)) {
                  tp.a(10, 100.0f, kj.field_m);
                  g.a(var11, param0 + 18093);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    li.field_k = li.field_k + 1;
                    if ((fm.field_a ^ -1) != (bn.field_n ^ -1)) {
                      qp.a((byte) -24, mn.field_b, true);
                      if (co.field_G == null) {
                        break L2;
                      } else {
                        co.field_G.a(true, bd.field_f);
                        bd.field_f = bd.field_f + 1;
                        if ((bd.field_f ^ -1) == -65) {
                          af.a((byte) 127);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (ib.a((byte) 35)) {
                      gf.g(0, 0, gf.field_i, gf.field_c);
                      var3_int = 15 + la.a((byte) -105);
                      var4_int = 30 + og.b(4);
                      fm.a(ea.a((byte) 13), var3_int, var4_int, (byte) -127);
                      ci.a((byte) -119);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!sl.b(15000)) {
                      if (!ue.b((byte) -112)) {
                        break L4;
                      } else {
                        if (ib.a((byte) 109)) {
                          break L4;
                        } else {
                          gf.g(0, 0, gf.field_i, gf.field_c);
                          rc.a(-126);
                          break L4;
                        }
                      }
                    } else {
                      L5: {
                        if (cm.field_R == null) {
                          stackIn_37_0 = rj.field_o ? 1 : 0;
                          break L5;
                        } else {
                          stackIn_37_0 = 1;
                          break L5;
                        }
                      }
                      fl.a(stackIn_37_0 != 0, (byte) 120);
                      break L4;
                    }
                  }
                  L6: {
                    if ((fm.field_a ^ -1) != (fm.field_e ^ -1)) {
                      var3_int = pk.field_t * 256 / 16;
                      if (-1 <= (var3_int ^ -1)) {
                        break L6;
                      } else {
                        gf.b(0, 0, gf.field_i, gf.field_c, 0, var3_int);
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var3_ref = (a) ((Object) wl.field_a.e(-24172));
                    if (var3_ref != null) {
                      L8: {
                        if (null != sl.field_b) {
                          break L8;
                        } else {
                          ah.a(true, var3_ref.field_j);
                          break L8;
                        }
                      }
                      L9: {
                        var4_int = 0;
                        if (40 <= ke.field_e) {
                          if (80 > ke.field_e) {
                            var5_int = (ke.field_e - 40 << -1181835704) / 40;
                            ri.field_g.d(8, 0, 32, 32, var5_int);
                            break L9;
                          } else {
                            if (230 <= ke.field_e) {
                              if ((ke.field_e ^ -1) <= -271) {
                                var4_int = 1;
                                break L9;
                              } else {
                                var5_int = (-ke.field_e + 270 << 1242091112) / 40;
                                var4_int = 1;
                                ri.field_g.d(8, 0, 32, 32, var5_int);
                                break L9;
                              }
                            } else {
                              ec.field_j[var3_ref.field_j].a(8, 0, 32, 32);
                              break L9;
                            }
                          }
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if ((1 & li.field_k) != 0) {
                          sl.field_b.a();
                          break L10;
                        } else {
                          if (var4_int == 0) {
                            sl.field_b.a(pa.field_a, 0, 0);
                            break L10;
                          } else {
                            sl.field_b.b();
                            break L10;
                          }
                        }
                      }
                      if (40 > ke.field_e) {
                        break L7;
                      } else {
                        if (80 <= ke.field_e) {
                          if (ke.field_e < 230) {
                            ne.field_c.a(ce.field_o[var3_ref.field_j], 48, 32 + ne.field_c.field_H >> -1332287519, 0, -1, 128);
                            break L7;
                          } else {
                            if (270 > ke.field_e) {
                              var5_int = (-ke.field_e + 270 << -1383847032) / 40;
                              ne.field_c.a(ce.field_o[var3_ref.field_j], 48, 32 - -ne.field_c.field_H >> -1769618047, 0, -1, var5_int >> -144553759);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          var5_int = (-40 + ke.field_e << -775969368) / 40;
                          ne.field_c.a(ce.field_o[var3_ref.field_j], 48, 32 - -ne.field_c.field_H >> 353864929, 0, -1, var5_int >> -1411473855);
                          break L7;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                  L11: {
                    if ((nh.field_k ^ -1) > -3) {
                      break L11;
                    } else {
                      if (!ld.field_b) {
                        break L11;
                      } else {
                        ne.field_c.b(Integer.toString(bc.field_a), 20, 20, 16777215, 1);
                        var4_long = Runtime.getRuntime().totalMemory();
                        var6_long = Runtime.getRuntime().freeMemory();
                        var8 = var4_long - var6_long;
                        ne.field_c.b((int)(var8 >> 319390474) + "kb", 4, ne.field_c.field_H * 2 + 8, 16777215, -1);
                        ne.field_c.b(tc.field_u, 20, 80, 16777215, 1);
                        break L11;
                      }
                    }
                  }
                  L12: {
                    var4 = kh.field_m[kj.field_n / 5];
                    var5 = jg.field_c[kj.field_n / 5];
                    if (0 != (hj.field_S ^ -1)) {
                      var6 = (int)((3.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 64.0);
                      var5.b(hj.field_S, eh.field_h, var6);
                      var4.h(hj.field_S, eh.field_h);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  ob.a(0, param0 + -161, var11, 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                g.a(var11, 18131);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.D(" + param0 + ')');
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

    static {
        field_J = "Beastman";
        field_G = "<col=E5A634>Your title, </col><%0><col=E5A634>, will appear in the Dragons of Renown table.";
        field_H = "Trap";
    }
}
