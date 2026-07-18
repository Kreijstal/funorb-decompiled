/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class fn extends kc {
    private int field_r;
    private int field_w;
    private int field_E;
    static int field_t;
    private int field_v;
    static int field_s;
    private boolean field_q;
    private boolean field_z;
    static String field_A;
    private long field_y;
    private int field_C;
    private int field_x;
    static String[] field_u;
    String field_D;
    private boolean field_B;

    private final void p(int param0) {
        try {
            ov.field_e[1] = 16;
            ov.field_e[13] = -1;
            ov.field_e[16] = -1;
            ov.field_e[4] = -1;
            ov.field_e[9] = param0;
            ov.field_e[6] = -2;
            ov.field_e[12] = -1;
            ov.field_e[10] = -1;
            ov.field_e[11] = -1;
            ov.field_e[5] = -1;
            ov.field_e[17] = -1;
            ov.field_e[18] = 1;
            ov.field_e[3] = -1;
            ov.field_e[7] = -1;
            ov.field_e[2] = -2;
            ov.field_e[8] = -2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fn.LA(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        if (param0 != 68) {
            return;
        }
        try {
            wp.field_z[5] = true;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fn.HA(" + param0 + ')');
        }
    }

    final void b(boolean param0, int param1) {
        RuntimeException var3 = null;
        java.awt.Container var3_ref = null;
        int var3_int = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        int stackIn_45_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_207_0 = 0;
        int stackIn_207_1 = 0;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        String stackIn_208_2 = null;
        int stackIn_210_0 = 0;
        int stackIn_210_1 = 0;
        String stackIn_210_2 = null;
        int stackIn_211_0 = 0;
        int stackIn_211_1 = 0;
        String stackIn_211_2 = null;
        int stackIn_211_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_206_1 = 0;
        int stackOut_204_0 = 0;
        int stackOut_204_1 = 0;
        int stackOut_207_0 = 0;
        int stackOut_207_1 = 0;
        String stackOut_207_2 = null;
        int stackOut_210_0 = 0;
        int stackOut_210_1 = 0;
        String stackOut_210_2 = null;
        int stackOut_210_3 = 0;
        int stackOut_208_0 = 0;
        int stackOut_208_1 = 0;
        String stackOut_208_2 = null;
        int stackOut_208_3 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (vv.field_b != null) {
                L2: {
                  if (null == gk.field_o) {
                    var3_ref = km.c(false);
                    var4 = var3_ref.getSize();
                    vv.field_b.a(var4.height, var4.width, (byte) -123);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                vv.field_b.d(2);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              c.a((byte) 124);
              au.d(123);
              if (in.g(-66)) {
                break L3;
              } else {
                if (11 == jv.field_a) {
                  break L3;
                } else {
                  ip.d(1886067877);
                  break L3;
                }
              }
            }
            L4: {
              if (null != as.field_w) {
                pn.field_r = as.field_w.a(-88);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1 < -97) {
                break L5;
              } else {
                ((fn) this).field_D = null;
                break L5;
              }
            }
            L6: {
              if (nt.a((byte) 90)) {
                L7: {
                  var3_int = 1200 * vm.a(-79);
                  if (((fn) this).field_B) {
                    break L7;
                  } else {
                    if (~var3_int <= ~df.a((byte) 114)) {
                      break L6;
                    } else {
                      if (~za.c(false) < ~var3_int) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                ((fn) this).field_B = false;
                kk.a((byte) -112);
                we.a((byte) 16);
                rj.a((byte) 87, 2, ab.field_d);
                ha.a(-36);
                ts.field_d = true;
                sj.field_a = 15000L + wq.a(-96);
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              L9: {
                if (gr.field_l == -1) {
                  break L9;
                } else {
                  if (gr.field_l != 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (gr.field_l != -1) {
                  stackOut_44_0 = 0;
                  stackIn_45_0 = stackOut_44_0;
                  break L10;
                } else {
                  stackOut_42_0 = 1;
                  stackIn_45_0 = stackOut_42_0;
                  break L10;
                }
              }
              L11: {
                var3_int = stackIn_45_0;
                gr.field_l = cs.g(-5);
                if (var3_int == 0) {
                  break L11;
                } else {
                  if (gr.field_l != 0) {
                    break L11;
                  } else {
                    if (11 != jv.field_a) {
                      break L11;
                    } else {
                      if (!en.a(-23517)) {
                        ov.b(2);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
              if (gr.field_l == -1) {
                break L8;
              } else {
                if (0 == gr.field_l) {
                  break L8;
                } else {
                  sj.field_a = wq.a(-47) + 15000L;
                  break L8;
                }
              }
            }
            L12: {
              if (gr.field_l == -1) {
                break L12;
              } else {
                if (gr.field_l != 0) {
                  L13: {
                    if (mp.field_a < 10) {
                      break L13;
                    } else {
                      if (10 <= jv.field_a) {
                        L14: {
                          L15: {
                            we.a((byte) 70);
                            if (gr.field_l == 3) {
                              break L15;
                            } else {
                              L16: {
                                if (gr.field_l == 4) {
                                  break L16;
                                } else {
                                  L17: {
                                    if (gr.field_l == 2) {
                                      break L17;
                                    } else {
                                      L18: {
                                        if (gr.field_l == 5) {
                                          break L18;
                                        } else {
                                          rj.a((byte) -97, 256, ao.field_z);
                                          if (var5 == 0) {
                                            break L14;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      rj.a((byte) -113, 5, s.field_k);
                                      if (var5 == 0) {
                                        break L14;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  rj.a((byte) 90, 256, bn.field_O);
                                  if (var5 == 0) {
                                    break L14;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              rj.a((byte) 61, 256, eg.field_n);
                              if (var5 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          rj.a((byte) -97, 256, o.field_a);
                          break L14;
                        }
                        ts.field_d = true;
                        if (var5 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  L19: {
                    if (3 != gr.field_l) {
                      break L19;
                    } else {
                      ((fn) this).a("js5crc", 21253);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L19;
                      }
                    }
                  }
                  L20: {
                    if (gr.field_l != 4) {
                      break L20;
                    } else {
                      ((fn) this).a("js5io", 21253);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (gr.field_l != 2) {
                      break L21;
                    } else {
                      ((fn) this).a("js5connect_full", 21253);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if (gr.field_l != 5) {
                      break L22;
                    } else {
                      ((fn) this).a("outofdate", 21253);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L22;
                      }
                    }
                  }
                  ((fn) this).a("js5connect", 21253);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L23: {
              L24: {
                L25: {
                  if (gr.field_l == -1) {
                    break L25;
                  } else {
                    if (gr.field_l != 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                if (en.a(-23517)) {
                  break L24;
                } else {
                  break L23;
                }
              }
              if (~wq.a(-87) <= ~sj.field_a) {
                ts.field_d = false;
                if (-1 == gr.field_l) {
                  break L23;
                } else {
                  if (0 != gr.field_l) {
                    gr.field_l = -1;
                    ic.a(4);
                    break L23;
                  } else {
                    break L23;
                  }
                }
              } else {
                break L23;
              }
            }
            L26: {
              if (gr.field_l != 0) {
                break L26;
              } else {
                if (!en.a(-23517)) {
                  ch.field_h = false;
                  break L26;
                } else {
                  break L26;
                }
              }
            }
            L27: {
              if (mp.field_a != 0) {
                break L27;
              } else {
                if (f.d((byte) 63)) {
                  mp.field_a = 1;
                  break L27;
                } else {
                  break L27;
                }
              }
            }
            L28: {
              if (mp.field_a == 1) {
                L29: {
                  if (dk.field_c == 0) {
                    break L29;
                  } else {
                    hd.field_H = wd.a(u.field_P, (byte) 125);
                    break L29;
                  }
                }
                wd.field_j = ve.a(11880, true, pn.field_i, 1, false);
                eb.field_f = ve.a(11880, true, pp.field_h, 1, false);
                hw.field_a = ve.a(11880, true, ra.field_f, 1, false);
                pi.field_c = wd.field_j;
                mp.field_a = 2;
                vb.field_J = eb.field_f;
                break L28;
              } else {
                break L28;
              }
            }
            L30: {
              if (mp.field_a == 2) {
                L31: {
                  if (null != hd.field_H) {
                    if (!hd.field_H.b((byte) 127)) {
                      break L31;
                    } else {
                      L32: {
                        if (!hd.field_H.b((byte) -99, "")) {
                          break L32;
                        } else {
                          if (!hd.field_H.a("", 100)) {
                            break L31;
                          } else {
                            ni.a(7, hd.field_H);
                            hd.field_H = null;
                            ls.b(0);
                            if (var5 == 0) {
                              break L31;
                            } else {
                              break L32;
                            }
                          }
                        }
                      }
                      hd.field_H = null;
                      break L31;
                    }
                  } else {
                    break L31;
                  }
                }
                if (hd.field_H != null) {
                  break L30;
                } else {
                  mp.field_a = 3;
                  break L30;
                }
              } else {
                break L30;
              }
            }
            L33: {
              if (3 == mp.field_a) {
                if (!rd.a(eb.field_f, (byte) 124, hw.field_a, wd.field_j)) {
                  break L33;
                } else {
                  if (wc.a(hw.field_a, 40)) {
                    L34: {
                      L35: {
                        ph.a((byte) -93);
                        th.e(true);
                        pu.field_m = false;
                        hn.field_k = li.field_y;
                        ea.a(hw.field_a, qn.field_a, (byte) 40, eb.field_f, wd.field_j);
                        if (hv.field_c) {
                          break L35;
                        } else {
                          if (st.field_B != null) {
                            break L35;
                          } else {
                            break L34;
                          }
                        }
                      }
                      L36: {
                        stackOut_203_0 = 1;
                        stackIn_206_0 = stackOut_203_0;
                        stackIn_204_0 = stackOut_203_0;
                        if (hv.field_c) {
                          stackOut_206_0 = stackIn_206_0;
                          stackOut_206_1 = 0;
                          stackIn_207_0 = stackOut_206_0;
                          stackIn_207_1 = stackOut_206_1;
                          break L36;
                        } else {
                          stackOut_204_0 = stackIn_204_0;
                          stackOut_204_1 = 1;
                          stackIn_207_0 = stackOut_204_0;
                          stackIn_207_1 = stackOut_204_1;
                          break L36;
                        }
                      }
                      L37: {
                        stackOut_207_0 = stackIn_207_0;
                        stackOut_207_1 = stackIn_207_1;
                        stackOut_207_2 = st.field_B;
                        stackIn_210_0 = stackOut_207_0;
                        stackIn_210_1 = stackOut_207_1;
                        stackIn_210_2 = stackOut_207_2;
                        stackIn_208_0 = stackOut_207_0;
                        stackIn_208_1 = stackOut_207_1;
                        stackIn_208_2 = stackOut_207_2;
                        if (hv.field_c) {
                          stackOut_210_0 = stackIn_210_0;
                          stackOut_210_1 = stackIn_210_1;
                          stackOut_210_2 = (String) (Object) stackIn_210_2;
                          stackOut_210_3 = 0;
                          stackIn_211_0 = stackOut_210_0;
                          stackIn_211_1 = stackOut_210_1;
                          stackIn_211_2 = stackOut_210_2;
                          stackIn_211_3 = stackOut_210_3;
                          break L37;
                        } else {
                          stackOut_208_0 = stackIn_208_0;
                          stackOut_208_1 = stackIn_208_1;
                          stackOut_208_2 = (String) (Object) stackIn_208_2;
                          stackOut_208_3 = 1;
                          stackIn_211_0 = stackOut_208_0;
                          stackIn_211_1 = stackOut_208_1;
                          stackIn_211_2 = stackOut_208_2;
                          stackIn_211_3 = stackOut_208_3;
                          break L37;
                        }
                      }
                      ea.a(stackIn_211_0, stackIn_211_1 != 0, stackIn_211_2, stackIn_211_3 != 0);
                      break L34;
                    }
                    L38: {
                      if (!gn.field_b) {
                        break L38;
                      } else {
                        vi.e(4);
                        break L38;
                      }
                    }
                    L39: {
                      if (hh.field_d != null) {
                        break L39;
                      } else {
                        hh.field_d = ea.a(14263);
                        ur.field_O = cv.e(false);
                        break L39;
                      }
                    }
                    ss.a(hh.field_d, (byte) 127, hw.field_a, ur.field_O);
                    hw.field_a = null;
                    eb.field_f = null;
                    wd.field_j = null;
                    si.a((java.applet.Applet) this, (byte) -96);
                    ls.b(0);
                    mp.field_a = 10;
                    break L33;
                  } else {
                    break L33;
                  }
                }
              } else {
                break L33;
              }
            }
            L40: {
              if (mp.field_a != 10) {
                break L40;
              } else {
                L41: {
                  if (0 == dk.field_c) {
                    break L41;
                  } else {
                    vf.field_a = wd.a(ak.field_f, (byte) 125);
                    break L41;
                  }
                }
                mp.field_a = 11;
                break L40;
              }
            }
            L42: {
              if (mp.field_a != 11) {
                break L42;
              } else {
                L43: {
                  if (vf.field_a == null) {
                    break L43;
                  } else {
                    L44: {
                      if (!vf.field_a.b((byte) 127)) {
                        break L44;
                      } else {
                        if (vf.field_a.a(true)) {
                          break L43;
                        } else {
                          break L44;
                        }
                      }
                    }
                    pe.a(20, 0.0f, lq.a(117, mm.field_c, ek.field_k, vf.field_a));
                    if (var5 == 0) {
                      break L42;
                    } else {
                      break L43;
                    }
                  }
                }
                ml.field_u = true;
                mp.field_a = 12;
                break L42;
              }
            }
            L45: {
              if (mp.field_a == 12) {
                if (!ml.field_u) {
                  mp.field_a = 13;
                  break L45;
                } else {
                  break L45;
                }
              } else {
                break L45;
              }
            }
            L46: {
              if (mp.field_a == 13) {
                L47: {
                  var3_int = 1;
                  if (ih.field_a == null) {
                    break L47;
                  } else {
                    var3_int = ih.field_a.a(100) ? 1 : 0;
                    pe.a(20, ih.field_a.field_d, ih.field_a.field_f);
                    break L47;
                  }
                }
                if (var3_int == 0) {
                  break L46;
                } else {
                  mp.field_a = 20;
                  break L46;
                }
              } else {
                break L46;
              }
            }
            L48: {
              if (param0) {
                break L48;
              } else {
                if (aj.field_A) {
                  wr.a(true, qn.field_f);
                  ((fn) this).e(1000);
                  db.a(false, qn.field_f);
                  break L48;
                } else {
                  break L48;
                }
              }
            }
            L49: {
              if (wp.field_z[8]) {
                qi.a(8);
                break L49;
              } else {
                break L49;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "fn.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (((fn) this).field_d) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (en.a(-23517)) {
                if (!ts.field_d) {
                  var2_int = jb.a(gi.c((byte) -2), ((fn) this).field_z, (byte) 56, true, ((fn) this).field_w, rw.c((byte) -97));
                  if (-1 == var2_int) {
                    stackOut_14_0 = -1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    if (param0 < -38) {
                      L1: {
                        if (0 == var2_int) {
                          break L1;
                        } else {
                          if (var2_int == 1) {
                            break L1;
                          } else {
                            L2: {
                              if (nl.field_o) {
                                break L2;
                              } else {
                                ((fn) this).a("reconnect", 21253);
                                break L2;
                              }
                            }
                            we.a((byte) 63);
                            rj.a((byte) 114, var2_int, ns.field_c);
                            ts.field_d = true;
                            sj.field_a = 15000L + wq.a(-50);
                            stackOut_37_0 = var2_int;
                            stackIn_38_0 = stackOut_37_0;
                            break L0;
                          }
                        }
                      }
                      L3: {
                        if (jv.field_a != 11) {
                          break L3;
                        } else {
                          if (gr.field_l == 0) {
                            ov.b(2);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_32_0 = var2_int;
                      stackIn_33_0 = stackOut_32_0;
                      return stackIn_33_0;
                    } else {
                      stackOut_17_0 = 99;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                } else {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "fn.DA(" + param0 + ')');
        }
        return stackIn_38_0;
    }

    private final void n(int param0) {
        try {
            wp.field_z[param0] = true;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fn.R(" + param0 + ')');
        }
    }

    final void m(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 94) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (we.g(-1)) {
                  break L3;
                } else {
                  if (mp.field_a < 10) {
                    break L2;
                  } else {
                    L4: {
                      if (!lf.b(-251)) {
                        break L4;
                      } else {
                        L5: {
                          if (jv.field_a != 0) {
                            break L5;
                          } else {
                            int discarded$4 = this.a(16981, false, false);
                            if (var3 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                        rg.a((byte) 55, pn.field_r);
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    rm.a((byte) 126);
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L6: {
                stackOut_23_0 = this;
                stackOut_23_1 = 16981;
                stackIn_28_0 = stackOut_23_0;
                stackIn_28_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (gk.field_o == null) {
                  stackOut_28_0 = this;
                  stackOut_28_1 = stackIn_28_1;
                  stackOut_28_2 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  break L6;
                } else {
                  stackOut_24_0 = this;
                  stackOut_24_1 = stackIn_24_1;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackOut_26_0 = this;
                  stackOut_26_1 = stackIn_26_1;
                  stackOut_26_2 = 1;
                  stackIn_29_0 = stackOut_26_0;
                  stackIn_29_1 = stackOut_26_1;
                  stackIn_29_2 = stackOut_26_2;
                  break L6;
                }
              }
              int discarded$5 = this.a(stackIn_29_1, stackIn_29_2 != 0, false);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "fn.W(" + param0 + ')');
        }
    }

    final void q(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        br var3 = null;
        int var4 = 0;
        int stackIn_67_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 9289) {
              L1: {
                var2_int = iw.field_a;
                if (var2_int >= 64) {
                  break L1;
                } else {
                  if (wp.field_z[var2_int]) {
                    L2: {
                      if (0 == var2_int) {
                        break L2;
                      } else {
                        L3: {
                          L4: {
                            if (var2_int != 1) {
                              break L4;
                            } else {
                              uu.c(false);
                              if (var4 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L5: {
                            if (var2_int == 2) {
                              break L5;
                            } else {
                              L6: {
                                if (var2_int == 3) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (var2_int != 4) {
                                      break L7;
                                    } else {
                                      pt.a(-22683);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  L8: {
                                    if (var2_int != 5) {
                                      break L8;
                                    } else {
                                      ar.e((byte) -93);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (var2_int != 6) {
                                      break L9;
                                    } else {
                                      vi.c((byte) -77);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (var2_int != 7) {
                                      break L10;
                                    } else {
                                      this.o(-1);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var2_int != 8) {
                                      break L11;
                                    } else {
                                      ro.a((byte) 127, (fs) (Object) ig.field_a, lt.field_m, gu.field_d);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var2_int == 16) {
                                      break L12;
                                    } else {
                                      L13: {
                                        L14: {
                                          if (11 == var2_int) {
                                            break L14;
                                          } else {
                                            if (var2_int != 12) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L15: {
                                          if (var2_int != 12) {
                                            stackOut_66_0 = 0;
                                            stackIn_67_0 = stackOut_66_0;
                                            break L15;
                                          } else {
                                            stackOut_64_0 = 1;
                                            stackIn_67_0 = stackOut_64_0;
                                            break L15;
                                          }
                                        }
                                        var3 = r.a(stackIn_67_0 != 0, (byte) -62);
                                        nn.a(var3, (byte) 60);
                                        if (var4 == 0) {
                                          break L3;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      L16: {
                                        if (var2_int != 13) {
                                          break L16;
                                        } else {
                                          js.f((byte) 117);
                                          if (var4 == 0) {
                                            break L3;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L17: {
                                        if (var2_int == 17) {
                                          break L17;
                                        } else {
                                          L18: {
                                            if (var2_int == 18) {
                                              break L18;
                                            } else {
                                              ms.a("MGS1: " + di.b((byte) -22), (Throwable) null, 0);
                                              kk.a((byte) -128);
                                              if (var4 == 0) {
                                                break L3;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          bq.a(8192);
                                          if (var4 == 0) {
                                            break L3;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      this.f((byte) -76);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  we.e((byte) -93);
                                  if (var4 == 0) {
                                    break L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              b.a(-30084);
                              if (var4 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ue.a((byte) -70);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              ms.a("MGS2: " + di.b((byte) 86), (Throwable) null, 0);
              kk.a((byte) -112);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "fn.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        try {
            this.a(false, param0, (byte) 111, param3, param5, param2, param4, param1);
            if (!param6) {
                ((fn) this).m(-95);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fn.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -1) {
              stackOut_3_0 = this.a(16981, param1, true);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 50;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "fn.KA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void o(int param0) {
        String var2 = ls.a((byte) -62);
        if (param0 != -1) {
            return;
        }
        try {
            ie.a(61, var2, ra.c(2));
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fn.NA(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        try {
            wp.field_z[2] = true;
            if (param0 != 8) {
                ((fn) this).field_E = 114;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fn.T(" + param0 + ')');
        }
    }

    final int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var2_int = this.c((byte) -99);
            if (param0) {
              L1: {
                L2: {
                  if (var2_int == 0) {
                    break L2;
                  } else {
                    if (var2_int != 1) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!wp.field_z[1]) {
                    break L3;
                  } else {
                    dq.a((byte) 115, 2);
                    break L3;
                  }
                }
                L4: {
                  if (!wp.field_z[2]) {
                    break L4;
                  } else {
                    vi.a(3, (byte) -73);
                    break L4;
                  }
                }
                L5: {
                  if (!wp.field_z[3]) {
                    break L5;
                  } else {
                    ko.a(0, 4);
                    break L5;
                  }
                }
                L6: {
                  if (!wp.field_z[4]) {
                    break L6;
                  } else {
                    dd.a(28778, 5);
                    break L6;
                  }
                }
                L7: {
                  if (!wp.field_z[5]) {
                    break L7;
                  } else {
                    wm.a(false, 6);
                    break L7;
                  }
                }
                L8: {
                  if (wp.field_z[6]) {
                    jl.a(7, param0);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (wp.field_z[8]) {
                  vk.a(-58);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_32_0 = var2_int;
              stackIn_33_0 = stackOut_32_0;
              break L0;
            } else {
              stackOut_1_0 = -127;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "fn.GA(" + param0 + ')');
        }
        return stackIn_33_0;
    }

    private final void f(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = ig.field_a.e(-31302);
              if ((var2_int & 1) == 0) {
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
              var3 = stackIn_4_0;
              var4 = -1 + gu.field_d;
              var5 = new byte[var4];
              ig.field_a.a(var5, 0, 0, var4);
              if (param0 <= -55) {
                break L2;
              } else {
                ((fn) this).field_w = -30;
                break L2;
              }
            }
            kj.a(-23166, ra.c(2), var3 != 0, uu.a(0, var5));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "fn.AA(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 60) {
              L1: {
                this.c(false, -12605);
                if (!param1) {
                  break L1;
                } else {
                  this.n(1);
                  break L1;
                }
              }
              L2: {
                if (param3) {
                  this.l(8);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param4) {
                  this.e((byte) 30);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param0) {
                  this.d((byte) 68);
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var6, "fn.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void k(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 79) {
                break L1;
              } else {
                field_t = -119;
                break L1;
              }
            }
            field_u = null;
            field_A = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "fn.U(" + param0 + ')');
        }
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.a(param0, param2 ^ 480, 640, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fn.CA(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          try {
            L0: {
              if (!((fn) this).i(-1)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((fn) this).field_D = ((fn) this).getCodeBase().getHost();
                    var6_ref2 = ((fn) this).field_D.toLowerCase();
                    stackOut_3_0 = this;
                    stackIn_7_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackIn_9_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L1;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_7_0 = stackOut_5_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  break L1;
                }
                L3: {
                  ((fn) this).field_z = stackIn_10_1 != 0;
                  if (param1 == 0) {
                    break L3;
                  } else {
                    this.o(-5);
                    break L3;
                  }
                }
                L4: {
                  ((fn) this).field_r = Integer.parseInt(((fn) this).getParameter("gameport1"));
                  ((fn) this).field_E = Integer.parseInt(((fn) this).getParameter("gameport2"));
                  var7 = ((fn) this).getParameter("servernum");
                  if (var7 == null) {
                    break L4;
                  } else {
                    ((fn) this).field_x = Integer.parseInt(var7);
                    break L4;
                  }
                }
                L5: {
                  ((fn) this).field_C = Integer.parseInt(((fn) this).getParameter("gamecrc"));
                  ((fn) this).field_y = Long.parseLong(((fn) this).getParameter("instanceid"));
                  ((fn) this).field_q = ((fn) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((fn) this).getParameter("lang");
                  if (var8 == null) {
                    break L5;
                  } else {
                    ((fn) this).field_v = Integer.parseInt(var8);
                    break L5;
                  }
                }
                L6: {
                  if (((fn) this).field_v < 5) {
                    break L6;
                  } else {
                    ((fn) this).field_v = 0;
                    break L6;
                  }
                }
                L7: {
                  var9 = ((fn) this).getParameter("affid");
                  if (null != var9) {
                    ((fn) this).field_w = Integer.parseInt(var9);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                gn.field_b = Boolean.valueOf(((fn) this).getParameter("simplemode")).booleanValue();
                ((fn) this).a(32, param4, (byte) 44, param2, ((fn) this).field_C, param3, param0);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L8: {
              var6 = (Exception) (Object) decompiledCaughtException;
              ms.a((String) null, (Throwable) (Object) var6, param1);
              ((fn) this).a("crash", 21253);
              break L8;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6_ref;
            stackOut_30_1 = new StringBuilder().append("fn.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param4 + ')');
        }
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            RuntimeException var4 = null;
            int var4_int = 0;
            Exception var5 = null;
            int var5_int = 0;
            Boolean var6 = null;
            fs var6_ref = null;
            String var7 = null;
            int var8 = 0;
            int stackIn_111_0 = 0;
            int stackIn_114_0 = 0;
            int stackIn_116_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_110_0 = 0;
            int stackOut_115_0 = 0;
            int stackOut_113_0 = 0;
            var8 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                var4_int = sb.a(param1, pn.field_r, dk.field_c, (byte) 81);
                if (var4_int != 0) {
                  L1: {
                    if (param0 == 16981) {
                      break L1;
                    } else {
                      ((fn) this).field_w = 90;
                      break L1;
                    }
                  }
                  L2: {
                    if (var4_int != 1) {
                      break L2;
                    } else {
                      L3: {
                        var5_int = tn.a(ht.c(true), 0, qt.a((byte) 21));
                        if (var5_int != -1) {
                          jv.a(var5_int, mn.field_g, ns.field_c, true);
                          ns.field_c = null;
                          mn.field_g = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var6 = li.c(82);
                      if (var6 == null) {
                        break L2;
                      } else {
                        kd.a(var6.booleanValue(), -80);
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (var4_int == 2) {
                      var5_int = rs.a(oj.b(-98), gi.c((byte) -2), eu.a((byte) -97), of.c(-86), ((fn) this).field_w, 119, rw.c((byte) -109));
                      if (var5_int != -1) {
                        Sumoblitz.a(mn.field_g, param0 ^ 16984, var5_int, ns.field_c);
                        ns.field_c = null;
                        mn.field_g = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (3 != var4_int) {
                      break L5;
                    } else {
                      L6: {
                        if (gr.field_l == -1) {
                          break L6;
                        } else {
                          if (gr.field_l != 0) {
                            gr.field_l = -1;
                            ic.a(4);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (param2) {
                          break L7;
                        } else {
                          L8: {
                            var5_int = jb.a(gi.c((byte) -2), ((fn) this).field_z, (byte) 21, false, ((fn) this).field_w, rw.c((byte) -124));
                            if (-1 != var5_int) {
                              L9: {
                                if (var5_int == 0) {
                                  break L9;
                                } else {
                                  rj.a((byte) -118, var5_int, ns.field_c);
                                  ns.field_c = null;
                                  if (var8 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              km.field_k = lb.field_a;
                              ov.b(2);
                              jv.field_a = 10;
                              ms.field_a = false;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          if (var8 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ts.field_d = false;
                      break L5;
                    }
                  }
                  L10: {
                    if (var4_int == 4) {
                      L11: {
                        if (qn.field_a) {
                          break L11;
                        } else {
                          ms.field_a = true;
                          jv.field_a = 10;
                          if (var8 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      gt.a(-1540, ra.c(param0 ^ 16983));
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L12: {
                    if (var4_int == 5) {
                      jl.a(ra.c(param0 + -16979), false);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var4_int == 6) {
                      if (pu.field_m) {
                        jv.field_a = 10;
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (var4_int == 7) {
                      ic.a(false, ra.c(2));
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (8 == var4_int) {
                      gt.a(-1540, ra.c(param0 + -16979));
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (9 == var4_int) {
                      us.a(ra.c(2), (byte) -124);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var4_int != 10) {
                      break L17;
                    } else {
                      as.field_v.g(17, param0 ^ 16989);
                      break L17;
                    }
                  }
                  L18: {
                    if (var4_int != 11) {
                      break L18;
                    } else {
                      of.a(8192, ra.c(2));
                      break L18;
                    }
                  }
                  L19: {
                    if (var4_int != 12) {
                      break L19;
                    } else {
                      cn.a(f.e(false), ra.c(2), (byte) -103);
                      break L19;
                    }
                  }
                  L20: {
                    if (var4_int == 13) {
                      try {
                        L21: {
                          L22: {
                            if (null != ms.field_e) {
                              break L22;
                            } else {
                              ms.field_e = new cc(lt.field_m, new java.net.URL(((fn) this).getCodeBase(), "countrylist.ws"), 5000);
                              break L22;
                            }
                          }
                          L23: {
                            var5_int = ms.field_e.a((byte) -110) ? 1 : 0;
                            if (var5_int != 0) {
                              L24: {
                                L25: {
                                  var6_ref = ms.field_e.b((byte) 126);
                                  if (null != var6_ref) {
                                    break L25;
                                  } else {
                                    ha.a((byte) 122, (String) null);
                                    if (var8 == 0) {
                                      break L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                var7 = sd.a(var6_ref.field_n, 0, var6_ref.field_p, 26564);
                                ha.a((byte) 115, var7);
                                break L24;
                              }
                              ms.field_e = null;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          break L21;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L26: {
                          var5 = (Exception) (Object) decompiledCaughtException;
                          ms.a("S1", (Throwable) (Object) var5, 0);
                          ha.a((byte) 111, (String) null);
                          ms.field_e = null;
                          break L26;
                        }
                      }
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L27: {
                    if (15 == var4_int) {
                      jv.field_a = 10;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (var4_int == 16) {
                    stackOut_110_0 = 1;
                    stackIn_111_0 = stackOut_110_0;
                    return stackIn_111_0;
                  } else {
                    if (var4_int != 17) {
                      stackOut_115_0 = 0;
                      stackIn_116_0 = stackOut_115_0;
                      break L0;
                    } else {
                      stackOut_113_0 = 2;
                      stackIn_114_0 = stackOut_113_0;
                      return stackIn_114_0;
                    }
                  }
                } else {
                  throw new IllegalStateException();
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (RuntimeException) (Object) decompiledCaughtException;
              throw qo.a((Throwable) (Object) var4, "fn.V(" + param0 + ',' + param1 + ',' + param2 + ')');
            }
            return stackIn_116_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(byte param0) {
        try {
            int var2_int = 76 / ((param0 - -76) / 48);
            wp.field_z[4] = true;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fn.EA(" + param0 + ')');
        }
    }

    private final void c(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              wp.field_z[0] = true;
              wp.field_z[7] = true;
              wp.field_z[18] = true;
              if (param1 == -12605) {
                break L1;
              } else {
                ((fn) this).q(112);
                break L1;
              }
            }
            wp.field_z[3] = true;
            wp.field_z[8] = param0;
            wp.field_z[17] = true;
            wp.field_z[16] = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "fn.IA(" + param0 + ',' + param1 + ')');
        }
    }

    protected fn() {
    }

    private final void a(boolean param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new java.awt.Frame("Jagex");
            var9.pack();
            var9.dispose();
            ((fn) this).setBackground(java.awt.Color.black);
            dk.field_c = ((fn) this).field_v;
            jq.a(dk.field_c, 13586);
            tm.a(param0, (byte) 84, lt.field_m, 5000, ((fn) this).field_E, param1, ((fn) this).field_C, ((fn) this).field_r, 5000, ((fn) this).field_D, ((fn) this).field_q, ((fn) this).field_x, dk.field_c, ((fn) this).field_y);
            fs.a(lt.field_m, ((fn) this).field_r, ((fn) this).field_E, ((fn) this).field_D, (byte) -56, ((fn) this).field_C, ((fn) this).field_x, param1, dk.field_c);
            rp.a(false);
            as.field_w = dk.a((byte) -126);
            var10 = -116 / ((2 - param2) / 36);
            db.a(false, qn.field_f);
            ak.field_f = param7;
            u.field_P = param4;
            pn.field_i = param5;
            ra.field_f = param3;
            pp.field_h = param6;
            this.p(-1);
            wt.c(8193);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var9_ref, "fn.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 50;
        field_A = "Waiting for sound effects";
    }
}
