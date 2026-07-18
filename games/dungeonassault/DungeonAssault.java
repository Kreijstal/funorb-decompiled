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
            throw vk.a((Throwable) (Object) runtimeException, "DungeonAssault.E(" + param0 + ')');
        }
    }

    private final void c(boolean param0, byte param1) {
        RuntimeException var3 = null;
        pj var3_ref = null;
        int var4 = 0;
        Random var4_ref_Random = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        int stackIn_17_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_141_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        boolean stackOut_12_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_118_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_140_0 = 0;
        int stackOut_138_0 = 0;
        var6 = field_K;
        try {
          L0: {
            L1: {
              L2: {
                if (~fm.field_e == ~fm.field_a) {
                  break L2;
                } else {
                  L3: {
                    if (fm.field_a == dg.field_H) {
                      break L3;
                    } else {
                      L4: {
                        if (~bn.field_n != ~fm.field_a) {
                          break L4;
                        } else {
                          L5: {
                            if (ed.c(true)) {
                              break L5;
                            } else {
                              L6: {
                                vk.a((byte) -31);
                                gd.a(g.field_Hb, 0, sa.field_f, false);
                                stackOut_11_0 = ll.field_k;
                                stackIn_16_0 = stackOut_11_0;
                                stackIn_12_0 = stackOut_11_0;
                                if (nh.field_k < 2) {
                                  stackOut_16_0 = stackIn_16_0;
                                  stackOut_16_1 = 0;
                                  stackIn_17_0 = stackOut_16_0;
                                  stackIn_17_1 = stackOut_16_1;
                                  break L6;
                                } else {
                                  stackOut_12_0 = stackIn_12_0;
                                  stackIn_14_0 = stackOut_12_0;
                                  stackOut_14_0 = stackIn_14_0;
                                  stackOut_14_1 = 1;
                                  stackIn_17_0 = stackOut_14_0;
                                  stackIn_17_1 = stackOut_14_1;
                                  break L6;
                                }
                              }
                              L7: {
                                ll.field_k = stackIn_17_0 | stackIn_17_1 != 0;
                                if (!tl.field_d) {
                                  break L7;
                                } else {
                                  tl.field_d = false;
                                  a.a(320, ne.field_c.field_N, (se) (Object) ne.field_c, true, false, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                                  if (cm.field_R != null) {
                                    pn discarded$3 = i.field_A.a((java.awt.Component) (Object) cm.field_R, (byte) 51, false);
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
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      pk.field_t = pk.field_t - 1;
                      if (pk.field_t == 0) {
                        fm.field_a = fm.field_e;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  pk.field_t = pk.field_t + 1;
                  if (pk.field_t != 16) {
                    break L1;
                  } else {
                    L8: {
                      L9: {
                        if (tl.field_d) {
                          break L9;
                        } else {
                          bj.i(81);
                          if (var6 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      dn.b(false);
                      break L8;
                    }
                    gm.field_d = null;
                    fm.field_a = bn.field_n;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L10: {
                if (!param0) {
                  L11: {
                    if (co.field_G == null) {
                      break L11;
                    } else {
                      bd.field_f = bd.field_f + 1;
                      if (bd.field_f == 64) {
                        af.a((byte) 40);
                        if (var6 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (mn.field_b == -1) {
                      break L12;
                    } else {
                      if (fc.a(mn.field_b, (byte) -120)) {
                        bf.field_f[mn.field_b].c(true);
                        if (var6 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (ik.field_e == null) {
                    break L10;
                  } else {
                    ik.field_e.c(true);
                    L13: while (true) {
                      if (!ha.b((byte) 47)) {
                        break L10;
                      } else {
                        ik.field_e.f();
                        if (var6 != 0) {
                          break L1;
                        } else {
                          if (var6 == 0) {
                            continue L13;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L10;
                }
              }
              if (null == wl.field_a.e(-24172)) {
                break L1;
              } else {
                int fieldTemp$4 = ke.field_e + 1;
                ke.field_e = ke.field_e + 1;
                if (fieldTemp$4 != 335) {
                  break L1;
                } else {
                  ne discarded$5 = wl.field_a.b((byte) -124);
                  sl.field_b = null;
                  pa.field_a = null;
                  ri.field_g = null;
                  break L1;
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
            L16: {
              L17: {
                if (dc.field_z == -2) {
                  var3_ref = new pj();
                  var3_ref.field_v = uk.a(0, new Random());
                  var4 = 0;
                  L18: while (true) {
                    L19: {
                      if (49 <= var4) {
                        break L19;
                      } else {
                        stackOut_99_0 = 0;
                        stackOut_99_1 = oi.b(0, 5);
                        stackIn_125_0 = stackOut_99_0;
                        stackIn_125_1 = stackOut_99_1;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        if (var6 != 0) {
                          break L16;
                        } else {
                          L20: {
                            L21: {
                              if (stackIn_100_0 == stackIn_100_1) {
                                break L21;
                              } else {
                                if (var6 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            L22: {
                              if (var3_ref.field_h[var4].field_a == 0) {
                                break L22;
                              } else {
                                if (var6 == 0) {
                                  break L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            var3_ref.field_h[var4] = new ai(ji.a(37, false, 4));
                            break L20;
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    L23: {
                      if (null == gm.field_d) {
                        stackOut_118_0 = 10000;
                        stackIn_119_0 = stackOut_118_0;
                        break L23;
                      } else {
                        stackOut_116_0 = gm.field_d.field_N;
                        stackIn_119_0 = stackOut_116_0;
                        break L23;
                      }
                    }
                    L24: {
                      var4 = stackIn_119_0;
                      var3_ref.field_y = var4;
                      var3_ref.field_o = var4 / 10;
                      var3_ref.field_A[0] = new hb(0, 25);
                      var3_ref.field_A[1] = new hb(1, 27);
                      var3_ref.field_A[2] = new hb(2, 18);
                      var3_ref.field_A[3] = new hb(3, 19);
                      var3_ref.a(false, 4);
                      ik.field_e = new go(false, var3_ref);
                      var5 = cm.field_Q ? 1 : 0;
                      if (!ve.a(false)) {
                        stackOut_122_0 = 0;
                        stackIn_123_0 = stackOut_122_0;
                        break L24;
                      } else {
                        stackOut_120_0 = 12;
                        stackIn_123_0 = stackOut_120_0;
                        break L24;
                      }
                    }
                    gd.a(stackIn_123_0, 0, -1, var5 != 0);
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              stackOut_124_0 = 2;
              stackOut_124_1 = ~dc.field_z;
              stackIn_125_0 = stackOut_124_0;
              stackIn_125_1 = stackOut_124_1;
              break L16;
            }
            L25: {
              if (stackIn_125_0 == stackIn_125_1) {
                L26: {
                  L27: {
                    L28: {
                      var3_ref = new pj();
                      if (ed.c(true)) {
                        break L28;
                      } else {
                        if (gm.field_d.field_q == -1) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    L29: {
                      var4_ref_Random = new Random();
                      var3_ref.field_v = uk.a(0, var4_ref_Random);
                      var3_ref.field_h = da.a(var3_ref.field_v, (byte) 71, var4_ref_Random);
                      if (!ed.c(true)) {
                        break L29;
                      } else {
                        gm.field_d = new lb();
                        gm.field_d.field_L = var3_ref.field_h;
                        gm.field_d.field_k = var3_ref.field_v;
                        break L29;
                      }
                    }
                    if (var6 == 0) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                  var3_ref.field_v = new wm(gm.field_d.field_k);
                  var3_ref.field_h = gm.field_d.field_L;
                  break L26;
                }
                L30: {
                  var3_ref.field_o = 1000;
                  var3_ref.field_A[0] = new hb(0, 1);
                  var3_ref.field_A[1] = new hb(1, 3);
                  var3_ref.field_A[2] = new hb(2, 4);
                  var3_ref.field_A[3] = new hb(3, 2);
                  var3_ref.a(false, 4);
                  ha.d(1);
                  ik.field_e = new go(false, var3_ref);
                  var4 = cm.field_Q ? 1 : 0;
                  if (!ve.a(false)) {
                    stackOut_140_0 = 0;
                    stackIn_141_0 = stackOut_140_0;
                    break L30;
                  } else {
                    stackOut_138_0 = 12;
                    stackIn_141_0 = stackOut_138_0;
                    break L30;
                  }
                }
                gd.a(stackIn_141_0, 0, -1, var4 != 0);
                break L25;
              } else {
                break L25;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "DungeonAssault.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        ak var2_ref = null;
        int var2_int = 0;
        int[] var2_array = null;
        lb var2_ref2 = null;
        String var2_ref3 = null;
        pj var2_ref4 = null;
        int[] var3_ref_int__ = null;
        int var3 = 0;
        wj var4_ref_wj = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        di[] var5_ref_di__ = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        boolean stackIn_154_0 = false;
        int stackIn_156_0 = 0;
        int stackIn_156_1 = 0;
        boolean stackIn_179_0 = false;
        int stackIn_237_0 = 0;
        int stackIn_237_1 = 0;
        int stackIn_237_2 = 0;
        int stackIn_239_0 = 0;
        int stackIn_239_1 = 0;
        int stackIn_239_2 = 0;
        int stackIn_240_0 = 0;
        int stackIn_240_1 = 0;
        int stackIn_240_2 = 0;
        int stackIn_240_3 = 0;
        int stackIn_253_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_291_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_44_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        Object stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        Object stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        boolean stackOut_153_0 = false;
        int stackOut_155_0 = 0;
        int stackOut_155_1 = 0;
        boolean stackOut_178_0 = false;
        int stackOut_236_0 = 0;
        int stackOut_236_1 = 0;
        int stackOut_236_2 = 0;
        int stackOut_239_0 = 0;
        int stackOut_239_1 = 0;
        int stackOut_239_2 = 0;
        int stackOut_239_3 = 0;
        int stackOut_237_0 = 0;
        int stackOut_237_1 = 0;
        int stackOut_237_2 = 0;
        int stackOut_237_3 = 0;
        int stackOut_252_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_290_1 = 0;
        var7 = field_K;
        try {
          L0: {
            L1: {
              int discarded$6 = ib.b((byte) 31);
              int discarded$7 = mn.a((byte) -42);
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
                    int fieldTemp$8 = kj.field_n + 1;
                    kj.field_n = kj.field_n + 1;
                    if (fieldTemp$8 >= 5 * kh.field_m.length) {
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
                L5: {
                  if (ao.a((byte) 79)) {
                    break L5;
                  } else {
                    L6: {
                      if (c.field_h != gi.field_R) {
                        break L6;
                      } else {
                        if (!di.field_e) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                    }
                    pn discarded$9 = i.field_A.a((java.awt.Component) (Object) c.field_h, (byte) 116, false);
                    di.field_e = false;
                    gi.field_R = c.field_h;
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                if (!di.field_e) {
                  pn discarded$10 = i.field_A.a((java.awt.Component) (Object) c.field_h, (byte) 61, true);
                  di.field_e = true;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L7: {
              go.b((byte) 14);
              if (cm.field_R == null) {
                break L7;
              } else {
                if (cm.field_R.field_g) {
                  ib.a(930);
                  hh.a((byte) -128);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              stackOut_44_0 = this;
              stackIn_47_0 = stackOut_44_0;
              stackIn_45_0 = stackOut_44_0;
              if (cm.field_R == null) {
                stackOut_47_0 = this;
                stackOut_47_1 = 0;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                break L8;
              } else {
                stackOut_45_0 = this;
                stackOut_45_1 = 1;
                stackIn_48_0 = stackOut_45_0;
                stackIn_48_1 = stackOut_45_1;
                break L8;
              }
            }
            L9: {
              ((DungeonAssault) this).a(stackIn_48_1 != 0, (byte) -74);
              if (ld.field_i) {
                bo.h(78);
                ld.field_i = false;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              mo.field_a = mo.field_a + 1;
              if (!ao.a((byte) -123)) {
                break L10;
              } else {
                ((DungeonAssault) this).g((byte) 2);
                if (ao.a((byte) 121)) {
                  return;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if (param0 < -89) {
                break L11;
              } else {
                this.c(false, (byte) -112);
                break L11;
              }
            }
            L12: {
              L13: {
                if (ef.field_h) {
                  break L13;
                } else {
                  td.a(pj.field_r, 121);
                  if (!this.h(0)) {
                    break L12;
                  } else {
                    ef.field_h = true;
                    if (var7 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              L14: {
                if (hc.b(1)) {
                  break L14;
                } else {
                  nb.a(22);
                  if (var7 == 0) {
                    break L12;
                  } else {
                    break L14;
                  }
                }
              }
              L15: {
                if (!ib.a((byte) 84)) {
                  break L15;
                } else {
                  L16: {
                    up.c((byte) 126);
                    if (~fm.field_e == ~fm.field_a) {
                      break L16;
                    } else {
                      this.c(false, (byte) -69);
                      if (var7 == 0) {
                        break L12;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: {
                    L18: {
                      var2_int = mf.b(12210);
                      if (var2_int == 2) {
                        break L18;
                      } else {
                        L19: {
                          if (var2_int == 3) {
                            break L19;
                          } else {
                            if (4 == var2_int) {
                              tl.field_d = true;
                              ik.a(ve.field_c, 86, 0);
                              if (var7 == 0) {
                                break L17;
                              } else {
                                break L19;
                              }
                            } else {
                              break L17;
                            }
                          }
                        }
                        tl.field_d = false;
                        a.a(320, ne.field_c.field_N, (se) (Object) ne.field_c, true, true, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                        if (cm.field_R == null) {
                          break L17;
                        } else {
                          pn discarded$11 = i.field_A.a((java.awt.Component) (Object) cm.field_R, (byte) 86, false);
                          if (var7 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    ib.a(930);
                    break L17;
                  }
                  this.c(true, (byte) -69);
                  if (var7 == 0) {
                    break L12;
                  } else {
                    break L15;
                  }
                }
              }
              L20: {
                if (!sl.b(15000)) {
                  break L20;
                } else {
                  L21: {
                    stackOut_106_0 = this;
                    stackOut_106_1 = 82;
                    stackIn_111_0 = stackOut_106_0;
                    stackIn_111_1 = stackOut_106_1;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    if (null == cm.field_R) {
                      stackOut_111_0 = this;
                      stackOut_111_1 = stackIn_111_1;
                      stackOut_111_2 = 0;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      stackIn_112_2 = stackOut_111_2;
                      break L21;
                    } else {
                      stackOut_107_0 = this;
                      stackOut_107_1 = stackIn_107_1;
                      stackIn_109_0 = stackOut_107_0;
                      stackIn_109_1 = stackOut_107_1;
                      stackOut_109_0 = this;
                      stackOut_109_1 = stackIn_109_1;
                      stackOut_109_2 = 1;
                      stackIn_112_0 = stackOut_109_0;
                      stackIn_112_1 = stackOut_109_1;
                      stackIn_112_2 = stackOut_109_2;
                      break L21;
                    }
                  }
                  L22: {
                    L23: {
                      var2_int = ((DungeonAssault) this).b((byte) stackIn_112_1, stackIn_112_2 != 0);
                      if (1 == var2_int) {
                        break L23;
                      } else {
                        if (2 != var2_int) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (null != cm.field_R) {
                        ib.a(930);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    if (var2_int != 2) {
                      break L22;
                    } else {
                      eg.a((byte) 120, m.c(true));
                      break L22;
                    }
                  }
                  this.c(true, (byte) -69);
                  if (var7 == 0) {
                    break L12;
                  } else {
                    break L20;
                  }
                }
              }
              L25: {
                if (!ue.b((byte) -93)) {
                  break L25;
                } else {
                  L26: {
                    if (~fm.field_a == ~fm.field_e) {
                      break L26;
                    } else {
                      this.c(false, (byte) -69);
                      if (var7 == 0) {
                        break L12;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    var2_int = l.d(4570);
                    if (var2_int == 1) {
                      ik.a(bh.field_Q, 53, 0);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  this.c(true, (byte) -69);
                  if (var7 == 0) {
                    break L12;
                  } else {
                    break L25;
                  }
                }
              }
              this.c(false, (byte) -69);
              break L12;
            }
            L28: {
              if (!ed.c(true)) {
                L29: while (true) {
                  L30: {
                    L31: {
                      var2_ref = (ak) (Object) ll.field_i.b((byte) -124);
                      if (null != var2_ref) {
                        break L31;
                      } else {
                        if (var7 != 0) {
                          break L30;
                        } else {
                          if (var7 == 0) {
                            break L28;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    vb.a(4, (byte) 84, var2_ref);
                    break L30;
                  }
                  if (var7 == 0) {
                    continue L29;
                  } else {
                    break L28;
                  }
                }
              } else {
                break L28;
              }
            }
            L32: while (true) {
              stackOut_153_0 = di.a(uo.field_c, -1);
              stackIn_154_0 = stackOut_153_0;
              L33: while (true) {
                L34: {
                  L35: {
                    if (!stackIn_154_0) {
                      break L35;
                    } else {
                      stackOut_155_0 = -55;
                      stackOut_155_1 = ~hc.field_c;
                      stackIn_291_0 = stackOut_155_0;
                      stackIn_291_1 = stackOut_155_1;
                      stackIn_156_0 = stackOut_155_0;
                      stackIn_156_1 = stackOut_155_1;
                      if (var7 != 0) {
                        break L34;
                      } else {
                        L36: {
                          if (stackIn_156_0 == stackIn_156_1) {
                            var2_array = wa.b(-1);
                            var3_ref_int__ = var2_array;
                            var4_ref_wj = ra.field_c;
                            var5 = ((ec) (Object) var4_ref_wj).c(true);
                            var6 = 0;
                            L37: while (true) {
                              L38: {
                                L39: {
                                  L40: {
                                    L41: {
                                      if (var6 >= var5) {
                                        break L41;
                                      } else {
                                        var3_ref_int__[var6] = ((ec) (Object) var4_ref_wj).h(-48);
                                        var6++;
                                        if (var7 != 0) {
                                          break L40;
                                        } else {
                                          if (var7 == 0) {
                                            continue L37;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                    if (wh.field_d) {
                                      var3_ref_int__ = var2_array;
                                      break L40;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  var4_ref_int__ = gj.field_c;
                                  var5 = 0;
                                  L42: while (true) {
                                    L43: {
                                      if (8 <= var5) {
                                        break L43;
                                      } else {
                                        var3_ref_int__[var5] = nb.a(var3_ref_int__[var5], ~var4_ref_int__[var5]);
                                        var5++;
                                        if (var7 != 0) {
                                          break L38;
                                        } else {
                                          if (var7 == 0) {
                                            continue L42;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                    }
                                    var3 = 0;
                                    L44: while (true) {
                                      if (var3 >= ce.field_o.length) {
                                        break L39;
                                      } else {
                                        stackOut_178_0 = vl.a(var3, -67, var2_array);
                                        stackIn_154_0 = stackOut_178_0;
                                        stackIn_179_0 = stackOut_178_0;
                                        if (var7 != 0) {
                                          continue L33;
                                        } else {
                                          L45: {
                                            if (!stackIn_179_0) {
                                              break L45;
                                            } else {
                                              wl.field_a.a((ne) (Object) new a(var3), false);
                                              break L45;
                                            }
                                          }
                                          var3++;
                                          if (var7 == 0) {
                                            continue L44;
                                          } else {
                                            break L39;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var3_ref_int__ = gj.field_c;
                                var4_ref_int__ = var2_array;
                                break L38;
                              }
                              var5 = 0;
                              L46: while (true) {
                                L47: {
                                  L48: {
                                    if (8 <= var5) {
                                      break L48;
                                    } else {
                                      var3_ref_int__[var5] = mp.a(var3_ref_int__[var5], var4_ref_int__[var5]);
                                      var5++;
                                      if (var7 != 0) {
                                        break L47;
                                      } else {
                                        if (var7 == 0) {
                                          continue L46;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                  var3_ref_int__ = bp.field_e;
                                  var4_ref_int__ = var2_array;
                                  break L47;
                                }
                                var5 = 0;
                                L49: while (true) {
                                  L50: {
                                    L51: {
                                      if (var5 >= 8) {
                                        break L51;
                                      } else {
                                        var3_ref_int__[var5] = mp.a(var3_ref_int__[var5], var4_ref_int__[var5]);
                                        var5++;
                                        if (var7 != 0) {
                                          break L50;
                                        } else {
                                          if (var7 == 0) {
                                            continue L49;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                    }
                                    rf.field_S = true;
                                    break L50;
                                  }
                                  if (var7 == 0) {
                                    continue L32;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                            }
                          } else {
                            break L36;
                          }
                        }
                        L52: {
                          if (hc.field_c == 55) {
                            L53: {
                              L54: {
                                var2_ref2 = gm.field_d;
                                gm.field_d = new lb((ec) (Object) ra.field_c, 19);
                                if (mn.field_b == 4) {
                                  break L54;
                                } else {
                                  if (dc.field_z == 4) {
                                    break L54;
                                  } else {
                                    break L53;
                                  }
                                }
                              }
                              jk.j((byte) 59);
                              break L53;
                            }
                            L55: {
                              L56: {
                                if (5 == mn.field_b) {
                                  break L56;
                                } else {
                                  if (dc.field_z != 5) {
                                    break L55;
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                              u.a(1, var2_ref2);
                              break L55;
                            }
                            L57: {
                              L58: {
                                if (mn.field_b == 2) {
                                  break L58;
                                } else {
                                  if (dc.field_z != 2) {
                                    break L57;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                              sh.a(27886, var2_ref2);
                              break L57;
                            }
                            L59: {
                              if (mn.field_b == 3) {
                                break L59;
                              } else {
                                if (dc.field_z != 3) {
                                  continue L32;
                                } else {
                                  break L59;
                                }
                              }
                            }
                            hi.b(1);
                            if (var7 == 0) {
                              continue L32;
                            } else {
                              break L52;
                            }
                          } else {
                            break L52;
                          }
                        }
                        L60: {
                          L61: {
                            if (56 == hc.field_c) {
                              break L61;
                            } else {
                              if (57 != hc.field_c) {
                                break L60;
                              } else {
                                break L61;
                              }
                            }
                          }
                          var2_int = ra.field_c.f(-123);
                          var3 = ra.field_c.f(-124);
                          var4 = ra.field_c.c(true);
                          var5_ref_di__ = new di[var4];
                          var6 = 0;
                          L62: while (true) {
                            L63: {
                              L64: {
                                if (~var4 >= ~var6) {
                                  break L64;
                                } else {
                                  var5_ref_di__[var6] = mm.a((ec) (Object) ra.field_c, false);
                                  var6++;
                                  if (var7 != 0) {
                                    break L63;
                                  } else {
                                    if (var7 == 0) {
                                      continue L62;
                                    } else {
                                      break L64;
                                    }
                                  }
                                }
                              }
                              L65: {
                                stackOut_236_0 = var2_int;
                                stackOut_236_1 = var3;
                                stackOut_236_2 = 22;
                                stackIn_239_0 = stackOut_236_0;
                                stackIn_239_1 = stackOut_236_1;
                                stackIn_239_2 = stackOut_236_2;
                                stackIn_237_0 = stackOut_236_0;
                                stackIn_237_1 = stackOut_236_1;
                                stackIn_237_2 = stackOut_236_2;
                                if (hc.field_c != 57) {
                                  stackOut_239_0 = stackIn_239_0;
                                  stackOut_239_1 = stackIn_239_1;
                                  stackOut_239_2 = stackIn_239_2;
                                  stackOut_239_3 = 0;
                                  stackIn_240_0 = stackOut_239_0;
                                  stackIn_240_1 = stackOut_239_1;
                                  stackIn_240_2 = stackOut_239_2;
                                  stackIn_240_3 = stackOut_239_3;
                                  break L65;
                                } else {
                                  stackOut_237_0 = stackIn_237_0;
                                  stackOut_237_1 = stackIn_237_1;
                                  stackOut_237_2 = stackIn_237_2;
                                  stackOut_237_3 = 1;
                                  stackIn_240_0 = stackOut_237_0;
                                  stackIn_240_1 = stackOut_237_1;
                                  stackIn_240_2 = stackOut_237_2;
                                  stackIn_240_3 = stackOut_237_3;
                                  break L65;
                                }
                              }
                              ja.a(stackIn_240_0, stackIn_240_1, (byte) stackIn_240_2, stackIn_240_3 != 0, var5_ref_di__);
                              break L63;
                            }
                            if (var7 == 0) {
                              continue L32;
                            } else {
                              break L60;
                            }
                          }
                        }
                        L66: {
                          if (hc.field_c != 58) {
                            break L66;
                          } else {
                            hm.a(0);
                            if (var7 == 0) {
                              continue L32;
                            } else {
                              break L66;
                            }
                          }
                        }
                        L67: {
                          if (61 == hc.field_c) {
                            L68: {
                              var2_ref3 = ra.field_c.a(-21030);
                              var3 = ra.field_c.k(0);
                              var4 = ra.field_c.c(true);
                              var5 = ra.field_c.h(-111);
                              if (ra.field_c.c(true) != 1) {
                                stackOut_252_0 = 0;
                                stackIn_253_0 = stackOut_252_0;
                                break L68;
                              } else {
                                stackOut_250_0 = 1;
                                stackIn_253_0 = stackOut_250_0;
                                break L68;
                              }
                            }
                            var6 = stackIn_253_0;
                            if (2 != dc.field_z) {
                              continue L32;
                            } else {
                              ((bg) (Object) bf.field_f[2]).a(var6 != 0, var4, 0, var5, var3, var2_ref3);
                              if (var7 == 0) {
                                continue L32;
                              } else {
                                break L67;
                              }
                            }
                          } else {
                            break L67;
                          }
                        }
                        L69: {
                          if (hc.field_c == 62) {
                            L70: {
                              L71: {
                                L72: {
                                  af.a((byte) 9);
                                  var2_ref4 = new pj((ec) (Object) ra.field_c, true);
                                  if (null == ik.field_e) {
                                    break L72;
                                  } else {
                                    if (ik.field_e.field_Y.field_f == var2_ref4.field_f) {
                                      break L71;
                                    } else {
                                      break L72;
                                    }
                                  }
                                }
                                ik.field_e = new go(true, var2_ref4);
                                if (var7 == 0) {
                                  break L70;
                                } else {
                                  break L71;
                                }
                              }
                              ik.field_e = new go(true, var2_ref4, ik.field_e);
                              break L70;
                            }
                            gd.a(dc.field_z, 0, -1, false);
                            kh.field_s = false;
                            nf.field_A = true;
                            if (var7 == 0) {
                              continue L32;
                            } else {
                              break L69;
                            }
                          } else {
                            break L69;
                          }
                        }
                        L73: {
                          if (hc.field_c != 72) {
                            break L73;
                          } else {
                            L74: {
                              if (nf.field_A) {
                                af.a((byte) 14);
                                if (nf.field_A) {
                                  nf.field_A = false;
                                  ik.field_e.a(17158, false);
                                  gh.field_f = true;
                                  break L74;
                                } else {
                                  break L74;
                                }
                              } else {
                                break L74;
                              }
                            }
                            kh.field_s = false;
                            if (var7 == 0) {
                              continue L32;
                            } else {
                              break L73;
                            }
                          }
                        }
                        L75: {
                          if (!nf.field_A) {
                            break L75;
                          } else {
                            if (null == ik.field_e) {
                              break L75;
                            } else {
                              if (!ik.field_e.j(0)) {
                                break L75;
                              } else {
                                if (var7 == 0) {
                                  continue L32;
                                } else {
                                  break L75;
                                }
                              }
                            }
                          }
                        }
                        ((DungeonAssault) this).d(true);
                        if (var7 == 0) {
                          continue L32;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                  stackOut_290_0 = 0;
                  stackOut_290_1 = 0;
                  stackIn_291_0 = stackOut_290_0;
                  stackIn_291_1 = stackOut_290_1;
                  break L34;
                }
                L76: {
                  op.a(stackIn_291_0, stackIn_291_1);
                  if (!dm.c(81)) {
                    break L76;
                  } else {
                    L77: {
                      L78: {
                        var2_int = ((DungeonAssault) this).f((byte) 101);
                        if (var2_int == 0) {
                          break L78;
                        } else {
                          if (var2_int != 1) {
                            break L77;
                          } else {
                            break L78;
                          }
                        }
                      }
                      L79: {
                        if (!ed.c(true)) {
                          gm.field_d = null;
                          break L79;
                        } else {
                          break L79;
                        }
                      }
                      L80: {
                        if (var2_int == 1) {
                          break L80;
                        } else {
                          L81: {
                            if (!nf.field_A) {
                              break L81;
                            } else {
                              gh.field_f = true;
                              gd.a(0, 0, 0, false);
                              break L81;
                            }
                          }
                          kh.field_s = false;
                          if (var7 == 0) {
                            break L77;
                          } else {
                            break L80;
                          }
                        }
                      }
                      kh.field_s = true;
                      break L77;
                    }
                    L82: {
                      var3 = 0;
                      if (var2_int == 2) {
                        var3 = 1;
                        break L82;
                      } else {
                        break L82;
                      }
                    }
                    L83: {
                      if (kh.field_s) {
                        var3 = 1;
                        break L83;
                      } else {
                        break L83;
                      }
                    }
                    L84: {
                      if (dm.c(71)) {
                        break L84;
                      } else {
                        var3 = 0;
                        break L84;
                      }
                    }
                    if (var3 == 0) {
                      break L76;
                    } else {
                      l.a(-1);
                      break L76;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "DungeonAssault.C(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        tc var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        try {
          L0: {
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
              L1: {
                if (2 > nh.field_k) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              }
              ll.field_k = stackIn_6_0 != 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2_ref, "DungeonAssault.A(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            ((DungeonAssault) this).a(32, "dungeonassault", 0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "DungeonAssault.init()");
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
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
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
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
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_8_0 = stackOut_5_0;
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
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_9_0 = 1;
                stackIn_12_0 = stackOut_9_0;
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
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_16_0 = stackOut_13_0;
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
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L5;
              } else {
                stackOut_17_0 = 1;
                stackIn_20_0 = stackOut_17_0;
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
            ((DungeonAssault) this).field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "DungeonAssault.B(" + param0 + ')');
        }
    }

    public DungeonAssault() {
    }

    private final boolean h(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_56_0 = 0;
        var3 = field_K;
        try {
          L0: {
            he.e(param0 + -23487);
            if (!tf.a((java.applet.Applet) this, 1041792321)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              ai.a(param0 + -78);
              var2_int = param0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= 14) {
                      break L3;
                    } else {
                      stackOut_8_0 = ~var2_int;
                      stackOut_8_1 = -5;
                      stackIn_52_0 = stackOut_8_0;
                      stackIn_52_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_9_0 == stackIn_9_1) {
                              break L5;
                            } else {
                              L6: {
                                if (var2_int == 5) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (var2_int == 2) {
                                      break L7;
                                    } else {
                                      L8: {
                                        if (var2_int != 3) {
                                          break L8;
                                        } else {
                                          bf.field_f[var2_int] = (qe) (Object) new db();
                                          if (var3 == 0) {
                                            break L4;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (var2_int == 13) {
                                          break L9;
                                        } else {
                                          L10: {
                                            if (var2_int == 7) {
                                              break L10;
                                            } else {
                                              bf.field_f[var2_int] = (qe) (Object) new qc(var2_int);
                                              if (var3 == 0) {
                                                break L4;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          bf.field_f[var2_int] = (qe) (Object) new fi();
                                          if (var3 == 0) {
                                            break L4;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      bf.field_f[var2_int] = (qe) (Object) new ud();
                                      if (var3 == 0) {
                                        break L4;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  bf.field_f[var2_int] = (qe) (Object) new bg();
                                  if (var3 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              bf.field_f[var2_int] = (qe) (Object) new ih();
                              if (var3 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          bf.field_f[var2_int] = (qe) (Object) new p();
                          break L4;
                        }
                        var2_int++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L11: {
                    mn.field_b = 13;
                    dc.field_z = 13;
                    bf.field_f[13].b(false);
                    if (!ed.c(true)) {
                      break L11;
                    } else {
                      gm.field_d = null;
                      break L11;
                    }
                  }
                  ag.a(50, 55);
                  nf.d(param0);
                  pn discarded$1 = i.field_A.a((java.awt.Component) (Object) c.field_h, (byte) 25, false);
                  gi.field_R = c.field_h;
                  ll.a(-26);
                  stackOut_51_0 = nh.field_k;
                  stackOut_51_1 = 2;
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  break L2;
                }
                L12: {
                  if (stackIn_52_0 < stackIn_52_1) {
                    stackOut_55_0 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    break L12;
                  } else {
                    stackOut_53_0 = 1;
                    stackIn_56_0 = stackOut_53_0;
                    break L12;
                  }
                }
                ll.field_k = stackIn_56_0 != 0;
                stackOut_56_0 = 1;
                stackIn_57_0 = stackOut_56_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "DungeonAssault.G(" + param0 + ')');
        }
        return stackIn_57_0 != 0;
    }

    final void c(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
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
                field_G = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "DungeonAssault.F(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
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
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_37_0 = false;
        int stackOut_35_0 = 0;
        var10 = field_K;
        try {
          L0: {
            var2_ref = fi.d(false);
            if (ao.a((byte) 72)) {
              mf.a((byte) -101, md.f(20), var2_ref);
              return;
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
                  g.a(var2_ref, param0 + 18093);
                  return;
                } else {
                  L2: {
                    li.field_k = li.field_k + 1;
                    if (~fm.field_a != ~bn.field_n) {
                      qp.a((byte) -24, mn.field_b, true);
                      if (co.field_G == null) {
                        break L2;
                      } else {
                        co.field_G.a(true, bd.field_f);
                        bd.field_f = bd.field_f + 1;
                        if (bd.field_f == 64) {
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
                    L5: {
                      if (!sl.b(15000)) {
                        break L5;
                      } else {
                        L6: {
                          if (cm.field_R == null) {
                            stackOut_37_0 = rj.field_o;
                            stackIn_38_0 = stackOut_37_0 ? 1 : 0;
                            break L6;
                          } else {
                            stackOut_35_0 = 1;
                            stackIn_38_0 = stackOut_35_0;
                            break L6;
                          }
                        }
                        fl.a(stackIn_38_0 != 0, (byte) 120);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
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
                  }
                  L7: {
                    if (~fm.field_a != ~fm.field_e) {
                      var3_int = pk.field_t * 256 / 16;
                      if (var3_int <= 0) {
                        break L7;
                      } else {
                        gf.b(0, 0, gf.field_i, gf.field_c, 0, var3_int);
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var3 = (a) (Object) wl.field_a.e(-24172);
                    if (var3 != null) {
                      L9: {
                        if (null != sl.field_b) {
                          break L9;
                        } else {
                          ah.a(true, var3.field_j);
                          break L9;
                        }
                      }
                      L10: {
                        var4_int = 0;
                        if (40 <= ke.field_e) {
                          L11: {
                            if (80 > ke.field_e) {
                              break L11;
                            } else {
                              L12: {
                                if (230 <= ke.field_e) {
                                  break L12;
                                } else {
                                  ec.field_j[var3.field_j].a(8, 0, 32, 32);
                                  if (var10 == 0) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (ke.field_e >= 270) {
                                  break L13;
                                } else {
                                  var5_int = (-ke.field_e + 270 << 1242091112) / 40;
                                  var4_int = 1;
                                  ri.field_g.d(8, 0, 32, 32, var5_int);
                                  if (var10 == 0) {
                                    break L10;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var4_int = 1;
                              if (var10 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var5_int = (ke.field_e - 40 << -1181835704) / 40;
                          ri.field_g.d(8, 0, 32, 32, var5_int);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L14: {
                        L15: {
                          if ((1 & li.field_k) != 0) {
                            break L15;
                          } else {
                            L16: {
                              if (var4_int == 0) {
                                break L16;
                              } else {
                                sl.field_b.b();
                                if (var10 == 0) {
                                  break L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            sl.field_b.a(pa.field_a, 0, 0);
                            if (var10 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        sl.field_b.a();
                        break L14;
                      }
                      if (40 > ke.field_e) {
                        break L8;
                      } else {
                        L17: {
                          if (80 <= ke.field_e) {
                            break L17;
                          } else {
                            var5_int = (-40 + ke.field_e << -775969368) / 40;
                            ne.field_c.a(ce.field_o[var3.field_j], 48, 32 - -ne.field_c.field_H >> 353864929, 0, -1, var5_int >> -1411473855);
                            if (var10 == 0) {
                              break L8;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (ke.field_e < 230) {
                            break L18;
                          } else {
                            if (270 > ke.field_e) {
                              var5_int = (-ke.field_e + 270 << -1383847032) / 40;
                              ne.field_c.a(ce.field_o[var3.field_j], 48, 32 - -ne.field_c.field_H >> -1769618047, 0, -1, var5_int >> -144553759);
                              if (var10 == 0) {
                                break L8;
                              } else {
                                break L18;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        ne.field_c.a(ce.field_o[var3.field_j], 48, 32 + ne.field_c.field_H >> -1332287519, 0, -1, 128);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L19: {
                    if (nh.field_k < 2) {
                      break L19;
                    } else {
                      if (!ld.field_b) {
                        break L19;
                      } else {
                        ne.field_c.b(Integer.toString(bc.field_a), 20, 20, 16777215, 1);
                        var4_long = Runtime.getRuntime().totalMemory();
                        var6_long = Runtime.getRuntime().freeMemory();
                        var8 = var4_long - var6_long;
                        ne.field_c.b((int)(var8 >> 319390474) + "kb", 4, ne.field_c.field_H * 2 + 8, 16777215, -1);
                        ne.field_c.b(tc.field_u, 20, 80, 16777215, 1);
                        break L19;
                      }
                    }
                  }
                  L20: {
                    var4 = kh.field_m[kj.field_n / 5];
                    var5 = jg.field_c[kj.field_n / 5];
                    if (hj.field_S != -1) {
                      var6 = (int)((3.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 64.0);
                      var5.b(hj.field_S, eh.field_h, var6);
                      var4.h(hj.field_S, eh.field_h);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  ob.a(0, param0 + -161, var2_ref, 0);
                  break L0;
                }
              } else {
                g.a(var2_ref, 18131);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "DungeonAssault.D(" + param0 + ')');
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
