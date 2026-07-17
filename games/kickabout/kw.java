/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

final class kw {
    static int field_i;
    static ut field_f;
    static int field_h;
    private String field_d;
    static String field_a;
    static String field_g;
    static String[] field_c;
    static em field_b;
    private boolean field_j;
    private boolean field_e;

    final boolean b(byte param0) {
        if (param0 != -90) {
            return false;
        }
        return ((kw) this).field_e;
    }

    final static int c(byte param0) {
        if (!ju.field_T) {
          if (bo.field_Cb.a(false, "stadium")) {
            eb.field_i = new ot[4];
            ju.field_T = true;
            eb.field_i[0] = (ot) (Object) bg.a("stadium", bo.field_Cb, (byte) 74, "top_left_seats");
            eb.field_i[1] = (ot) (Object) bg.a("stadium", bo.field_Cb, (byte) 86, "top_right_seats");
            eb.field_i[2] = (ot) (Object) bg.a("stadium", bo.field_Cb, (byte) 46, "bot_left_seats");
            eb.field_i[3] = (ot) (Object) bg.a("stadium", bo.field_Cb, (byte) 115, "bot_right_seats");
            ph.field_e = new kg[4][3];
            ph.field_e[0][0] = fw.a(bo.field_Cb, "stadium", true, "left_seats_1");
            ph.field_e[0][1] = fw.a(bo.field_Cb, "stadium", true, "left_seats_2");
            ph.field_e[0][2] = fw.a(bo.field_Cb, "stadium", true, "left_seats_3");
            ge.field_k = bg.a("stadium", bo.field_Cb, (byte) 68, "ad_top");
            da.field_m = bg.a("stadium", bo.field_Cb, (byte) 83, "ad_right");
            hn.field_f = bg.a("stadium", bo.field_Cb, (byte) 108, "ad_left");
            ph.field_e[1][0] = fw.a(bo.field_Cb, "stadium", true, "top_seats_1");
            ph.field_e[1][1] = fw.a(bo.field_Cb, "stadium", true, "top_seats_2");
            ph.field_e[1][2] = fw.a(bo.field_Cb, "stadium", true, "top_seats_3");
            ph.field_e[3][0] = fw.a(bo.field_Cb, "stadium", true, "bot_seats_1");
            if (param0 == 28) {
              ph.field_e[3][1] = fw.a(bo.field_Cb, "stadium", true, "bot_seats_2");
              ph.field_e[3][2] = fw.a(bo.field_Cb, "stadium", true, "bot_seats_3");
              ph.field_e[2][0] = fw.a(bo.field_Cb, "stadium", true, "right_seats_1");
              ph.field_e[2][1] = fw.a(bo.field_Cb, "stadium", true, "right_seats_2");
              ph.field_e[2][2] = fw.a(bo.field_Cb, "stadium", true, "right_seats_3");
              bf.field_s = new kg[3][];
              bf.field_s[0] = jo.a(bo.field_Cb, ek.b((int) param0, 17349), "stadium", "top_seats_1_mask");
              bf.field_s[1] = jo.a(bo.field_Cb, 17369, "stadium", "top_seats_2_mask");
              bf.field_s[2] = jo.a(bo.field_Cb, 17369, "stadium", "top_seats_3_mask");
              ps.field_c = new kg[3][];
              ps.field_c[0] = jo.a(bo.field_Cb, 17369, "stadium", "bot_seats_1_mask");
              ps.field_c[1] = jo.a(bo.field_Cb, 17369, "stadium", "bot_seats_2_mask");
              ps.field_c[2] = jo.a(bo.field_Cb, 17369, "stadium", "bot_seats_3_mask");
              return -1;
            } else {
              return -11;
            }
          } else {
            return bo.field_Cb.a("stadium", -16248);
          }
        } else {
          return -1;
        }
    }

    final void a(boolean param0, byte param1) {
        ((kw) this).field_j = true;
        int var3 = -109 % ((param1 - 48) / 55);
        ((kw) this).field_e = param0 ? true : false;
    }

    final static void b(int param0) {
        if (!nb.field_f) {
            throw new IllegalStateException();
        }
        aw.field_H = true;
        hm.a(true, -91);
        vj.field_c = 0;
    }

    final boolean a(byte param0) {
        if (param0 != -80) {
            int discarded$0 = kw.c((byte) -18);
            return ((kw) this).field_j;
        }
        return ((kw) this).field_j;
    }

    final static void a(int param0, int param1) {
        hn var2 = null;
        int var3 = Kickabout.field_G;
        try {
            var2 = (hn) (Object) da.field_h.g(24009);
            if (param0 < 104) {
                field_i = -30;
            }
            while (var2 != null) {
                if (!(5 != var2.field_i)) {
                    var2.c((byte) -109);
                }
                var2 = (hn) (Object) da.field_h.c(33);
            }
            var2 = new hn(5, new int[1]);
            ii.a(var2, 118);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "kw.B(" + param0 + 44 + param1 + 41);
        }
    }

    public static void d(byte param0) {
        field_b = null;
        field_a = null;
        field_g = null;
        field_f = null;
        if (param0 != -122) {
            field_a = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final String a(int param0) {
        if (param0 != 3) {
            ((kw) this).field_j = true;
            return ((kw) this).field_d;
        }
        return ((kw) this).field_d;
    }

    final static void b(boolean param0, byte param1) {
        int var2 = 0;
        Object var2_ref = null;
        int var3 = 0;
        int stackIn_8_0 = 0;
        Object stackIn_18_0 = null;
        int stackIn_22_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_61_0 = null;
        int stackIn_65_0 = 0;
        int stackIn_76_0 = 0;
        Object stackIn_91_0 = null;
        int stackIn_97_0 = 0;
        Object stackIn_111_0 = null;
        int stackIn_117_0 = 0;
        Object stackIn_129_0 = null;
        int stackIn_133_0 = 0;
        int stackIn_145_0 = 0;
        Object stackIn_155_0 = null;
        int stackIn_159_0 = 0;
        int stackIn_177_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_175_0 = 0;
        java.awt.Canvas stackOut_154_0 = null;
        vq stackOut_153_0 = null;
        int stackOut_157_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_144_0 = 0;
        java.awt.Canvas stackOut_128_0 = null;
        vq stackOut_127_0 = null;
        int stackOut_131_0 = 0;
        int stackOut_132_0 = 0;
        java.awt.Canvas stackOut_110_0 = null;
        vq stackOut_109_0 = null;
        int stackOut_115_0 = 0;
        int stackOut_116_0 = 0;
        java.awt.Canvas stackOut_90_0 = null;
        vq stackOut_89_0 = null;
        int stackOut_95_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        java.awt.Canvas stackOut_60_0 = null;
        vq stackOut_59_0 = null;
        int stackOut_63_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        java.awt.Canvas stackOut_17_0 = null;
        vq stackOut_16_0 = null;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        var3 = Kickabout.field_G;
        if (qo.c((byte) -42)) {
          L0: {
            if (!param0) {
              break L0;
            } else {
              if (!dr.field_a) {
                rm.a(false);
                if (!dr.field_a) {
                  wt.field_x = el.field_A;
                  us.field_j = n.field_m;
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (dr.field_a) {
                    L1: {
                      if (1 != vd.field_c) {
                        stackOut_176_0 = 0;
                        stackIn_177_0 = stackOut_176_0;
                        break L1;
                      } else {
                        stackOut_175_0 = 1;
                        stackIn_177_0 = stackOut_175_0;
                        break L1;
                      }
                    }
                    var2 = stackIn_177_0;
                    if (var2 != 0) {
                      if (us.field_k < 6) {
                        L2: {
                          us.field_k = us.field_k + 2;
                          if (var2 != 0) {
                            break L2;
                          } else {
                            if (us.field_k <= 0) {
                              break L2;
                            } else {
                              us.field_k = us.field_k - 2;
                              break L2;
                            }
                          }
                        }
                        return;
                      } else {
                        L3: {
                          if (var2 != 0) {
                            break L3;
                          } else {
                            if (us.field_k <= 0) {
                              break L3;
                            } else {
                              us.field_k = us.field_k - 2;
                              return;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L4: {
                        if (var2 != 0) {
                          break L4;
                        } else {
                          if (us.field_k <= 0) {
                            break L4;
                          } else {
                            us.field_k = us.field_k - 2;
                            return;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L5: {
                      var2 = 0;
                      if (var2 == 0) {
                        break L5;
                      } else {
                        if (us.field_k >= 6) {
                          break L5;
                        } else {
                          us.field_k = us.field_k + 2;
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var2 != 0) {
                        break L6;
                      } else {
                        if (us.field_k <= 0) {
                          break L6;
                        } else {
                          us.field_k = us.field_k - 2;
                          break L6;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (320 == el.field_A) {
                    if (n.field_m != 240) {
                      L7: {
                        wt.field_x = wt.field_x + (el.field_A - 320);
                        us.field_j = us.field_j + (-240 + n.field_m);
                        wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                        us.field_j = Math.max(0, Math.min(479, us.field_j));
                        if (e.field_m == null) {
                          stackOut_154_0 = ic.field_d;
                          stackIn_155_0 = (Object) (Object) stackOut_154_0;
                          break L7;
                        } else {
                          stackOut_153_0 = e.field_m;
                          stackIn_155_0 = (Object) (Object) stackOut_153_0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          var2_ref = stackIn_155_0;
                          wu discarded$12 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                          vd.field_c = nl.field_p;
                          dn.field_yb = sm.field_q;
                          ip.field_a = wj.field_A;
                          kf.field_Eb = vc.field_y;
                          if (!dr.field_a) {
                            break L9;
                          } else {
                            if (1 != vd.field_c) {
                              break L9;
                            } else {
                              stackOut_157_0 = 1;
                              stackIn_159_0 = stackOut_157_0;
                              break L8;
                            }
                          }
                        }
                        stackOut_158_0 = 0;
                        stackIn_159_0 = stackOut_158_0;
                        break L8;
                      }
                      L10: {
                        var2 = stackIn_159_0;
                        if (var2 == 0) {
                          break L10;
                        } else {
                          if (us.field_k >= 6) {
                            break L10;
                          } else {
                            us.field_k = us.field_k + 2;
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var2 != 0) {
                          break L11;
                        } else {
                          if (us.field_k <= 0) {
                            break L11;
                          } else {
                            us.field_k = us.field_k - 2;
                            break L11;
                          }
                        }
                      }
                      return;
                    } else {
                      L12: {
                        L13: {
                          vd.field_c = nl.field_p;
                          dn.field_yb = sm.field_q;
                          ip.field_a = wj.field_A;
                          kf.field_Eb = vc.field_y;
                          if (!dr.field_a) {
                            break L13;
                          } else {
                            if (1 != vd.field_c) {
                              break L13;
                            } else {
                              stackOut_143_0 = 1;
                              stackIn_145_0 = stackOut_143_0;
                              break L12;
                            }
                          }
                        }
                        stackOut_144_0 = 0;
                        stackIn_145_0 = stackOut_144_0;
                        break L12;
                      }
                      L14: {
                        var2 = stackIn_145_0;
                        if (var2 == 0) {
                          break L14;
                        } else {
                          if (us.field_k >= 6) {
                            break L14;
                          } else {
                            us.field_k = us.field_k + 2;
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (var2 != 0) {
                          break L15;
                        } else {
                          if (us.field_k <= 0) {
                            break L15;
                          } else {
                            us.field_k = us.field_k - 2;
                            break L15;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      wt.field_x = wt.field_x + (el.field_A - 320);
                      us.field_j = us.field_j + (-240 + n.field_m);
                      wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                      us.field_j = Math.max(0, Math.min(479, us.field_j));
                      if (e.field_m == null) {
                        stackOut_128_0 = ic.field_d;
                        stackIn_129_0 = (Object) (Object) stackOut_128_0;
                        break L16;
                      } else {
                        stackOut_127_0 = e.field_m;
                        stackIn_129_0 = (Object) (Object) stackOut_127_0;
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        var2_ref = stackIn_129_0;
                        wu discarded$13 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                        vd.field_c = nl.field_p;
                        dn.field_yb = sm.field_q;
                        ip.field_a = wj.field_A;
                        kf.field_Eb = vc.field_y;
                        if (!dr.field_a) {
                          break L18;
                        } else {
                          if (1 != vd.field_c) {
                            break L18;
                          } else {
                            stackOut_131_0 = 1;
                            stackIn_133_0 = stackOut_131_0;
                            break L17;
                          }
                        }
                      }
                      stackOut_132_0 = 0;
                      stackIn_133_0 = stackOut_132_0;
                      break L17;
                    }
                    L19: {
                      var2 = stackIn_133_0;
                      if (var2 == 0) {
                        break L19;
                      } else {
                        if (us.field_k >= 6) {
                          break L19;
                        } else {
                          us.field_k = us.field_k + 2;
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (var2 != 0) {
                        break L20;
                      } else {
                        if (us.field_k <= 0) {
                          break L20;
                        } else {
                          us.field_k = us.field_k - 2;
                          break L20;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          if (!param0) {
            if (dr.field_a) {
              L21: {
                im.h(634588072);
                if (!dr.field_a) {
                  wt.field_x = el.field_A;
                  us.field_j = n.field_m;
                  break L21;
                } else {
                  L22: {
                    if (320 != el.field_A) {
                      break L22;
                    } else {
                      if (n.field_m != 240) {
                        break L22;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L23: {
                    wt.field_x = wt.field_x + (el.field_A - 320);
                    us.field_j = us.field_j + (-240 + n.field_m);
                    wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                    us.field_j = Math.max(0, Math.min(479, us.field_j));
                    if (e.field_m == null) {
                      stackOut_110_0 = ic.field_d;
                      stackIn_111_0 = (Object) (Object) stackOut_110_0;
                      break L23;
                    } else {
                      stackOut_109_0 = e.field_m;
                      stackIn_111_0 = (Object) (Object) stackOut_109_0;
                      break L23;
                    }
                  }
                  var2_ref = stackIn_111_0;
                  wu discarded$14 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                  break L21;
                }
              }
              L24: {
                L25: {
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (!dr.field_a) {
                    break L25;
                  } else {
                    if (1 != vd.field_c) {
                      break L25;
                    } else {
                      stackOut_115_0 = 1;
                      stackIn_117_0 = stackOut_115_0;
                      break L24;
                    }
                  }
                }
                stackOut_116_0 = 0;
                stackIn_117_0 = stackOut_116_0;
                break L24;
              }
              L26: {
                var2 = stackIn_117_0;
                if (var2 == 0) {
                  break L26;
                } else {
                  if (us.field_k >= 6) {
                    break L26;
                  } else {
                    us.field_k = us.field_k + 2;
                    break L26;
                  }
                }
              }
              L27: {
                if (var2 != 0) {
                  break L27;
                } else {
                  if (us.field_k <= 0) {
                    break L27;
                  } else {
                    us.field_k = us.field_k - 2;
                    break L27;
                  }
                }
              }
              return;
            } else {
              L28: {
                if (!dr.field_a) {
                  wt.field_x = el.field_A;
                  us.field_j = n.field_m;
                  break L28;
                } else {
                  L29: {
                    if (320 != el.field_A) {
                      break L29;
                    } else {
                      if (n.field_m != 240) {
                        break L29;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L30: {
                    wt.field_x = wt.field_x + (el.field_A - 320);
                    us.field_j = us.field_j + (-240 + n.field_m);
                    wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                    us.field_j = Math.max(0, Math.min(479, us.field_j));
                    if (e.field_m == null) {
                      stackOut_90_0 = ic.field_d;
                      stackIn_91_0 = (Object) (Object) stackOut_90_0;
                      break L30;
                    } else {
                      stackOut_89_0 = e.field_m;
                      stackIn_91_0 = (Object) (Object) stackOut_89_0;
                      break L30;
                    }
                  }
                  var2_ref = stackIn_91_0;
                  wu discarded$15 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                  break L28;
                }
              }
              L31: {
                L32: {
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (!dr.field_a) {
                    break L32;
                  } else {
                    if (1 != vd.field_c) {
                      break L32;
                    } else {
                      stackOut_95_0 = 1;
                      stackIn_97_0 = stackOut_95_0;
                      break L31;
                    }
                  }
                }
                stackOut_96_0 = 0;
                stackIn_97_0 = stackOut_96_0;
                break L31;
              }
              L33: {
                var2 = stackIn_97_0;
                if (var2 == 0) {
                  break L33;
                } else {
                  if (us.field_k >= 6) {
                    break L33;
                  } else {
                    us.field_k = us.field_k + 2;
                    break L33;
                  }
                }
              }
              L34: {
                if (var2 != 0) {
                  break L34;
                } else {
                  if (us.field_k <= 0) {
                    break L34;
                  } else {
                    us.field_k = us.field_k - 2;
                    break L34;
                  }
                }
              }
              return;
            }
          } else {
            if (!dr.field_a) {
              L35: {
                L36: {
                  wt.field_x = el.field_A;
                  us.field_j = n.field_m;
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (!dr.field_a) {
                    break L36;
                  } else {
                    if (1 != vd.field_c) {
                      break L36;
                    } else {
                      stackOut_74_0 = 1;
                      stackIn_76_0 = stackOut_74_0;
                      break L35;
                    }
                  }
                }
                stackOut_75_0 = 0;
                stackIn_76_0 = stackOut_75_0;
                break L35;
              }
              L37: {
                var2 = stackIn_76_0;
                if (var2 == 0) {
                  break L37;
                } else {
                  if (us.field_k >= 6) {
                    break L37;
                  } else {
                    us.field_k = us.field_k + 2;
                    break L37;
                  }
                }
              }
              L38: {
                if (var2 != 0) {
                  break L38;
                } else {
                  if (us.field_k <= 0) {
                    break L38;
                  } else {
                    us.field_k = us.field_k - 2;
                    break L38;
                  }
                }
              }
              return;
            } else {
              L39: {
                if (320 != el.field_A) {
                  break L39;
                } else {
                  if (n.field_m != 240) {
                    break L39;
                  } else {
                    L40: {
                      L41: {
                        vd.field_c = nl.field_p;
                        dn.field_yb = sm.field_q;
                        ip.field_a = wj.field_A;
                        kf.field_Eb = vc.field_y;
                        if (!dr.field_a) {
                          break L41;
                        } else {
                          if (1 != vd.field_c) {
                            break L41;
                          } else {
                            stackOut_49_0 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            break L40;
                          }
                        }
                      }
                      stackOut_50_0 = 0;
                      stackIn_51_0 = stackOut_50_0;
                      break L40;
                    }
                    L42: {
                      var2 = stackIn_51_0;
                      if (var2 == 0) {
                        break L42;
                      } else {
                        if (us.field_k >= 6) {
                          break L42;
                        } else {
                          us.field_k = us.field_k + 2;
                          break L42;
                        }
                      }
                    }
                    L43: {
                      if (var2 != 0) {
                        break L43;
                      } else {
                        if (us.field_k <= 0) {
                          break L43;
                        } else {
                          us.field_k = us.field_k - 2;
                          break L43;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L44: {
                wt.field_x = wt.field_x + (el.field_A - 320);
                us.field_j = us.field_j + (-240 + n.field_m);
                wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                us.field_j = Math.max(0, Math.min(479, us.field_j));
                if (e.field_m == null) {
                  stackOut_60_0 = ic.field_d;
                  stackIn_61_0 = (Object) (Object) stackOut_60_0;
                  break L44;
                } else {
                  stackOut_59_0 = e.field_m;
                  stackIn_61_0 = (Object) (Object) stackOut_59_0;
                  break L44;
                }
              }
              L45: {
                L46: {
                  var2_ref = stackIn_61_0;
                  wu discarded$16 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (!dr.field_a) {
                    break L46;
                  } else {
                    if (1 != vd.field_c) {
                      break L46;
                    } else {
                      stackOut_63_0 = 1;
                      stackIn_65_0 = stackOut_63_0;
                      break L45;
                    }
                  }
                }
                stackOut_64_0 = 0;
                stackIn_65_0 = stackOut_64_0;
                break L45;
              }
              L47: {
                var2 = stackIn_65_0;
                if (var2 == 0) {
                  break L47;
                } else {
                  if (us.field_k >= 6) {
                    break L47;
                  } else {
                    us.field_k = us.field_k + 2;
                    break L47;
                  }
                }
              }
              L48: {
                if (var2 != 0) {
                  break L48;
                } else {
                  if (us.field_k <= 0) {
                    break L48;
                  } else {
                    us.field_k = us.field_k - 2;
                    break L48;
                  }
                }
              }
              return;
            }
          }
        } else {
          if (!dr.field_a) {
            L49: {
              L50: {
                wt.field_x = el.field_A;
                us.field_j = n.field_m;
                vd.field_c = nl.field_p;
                dn.field_yb = sm.field_q;
                ip.field_a = wj.field_A;
                kf.field_Eb = vc.field_y;
                if (!dr.field_a) {
                  break L50;
                } else {
                  if (1 != vd.field_c) {
                    break L50;
                  } else {
                    stackOut_31_0 = 1;
                    stackIn_33_0 = stackOut_31_0;
                    break L49;
                  }
                }
              }
              stackOut_32_0 = 0;
              stackIn_33_0 = stackOut_32_0;
              break L49;
            }
            L51: {
              var2 = stackIn_33_0;
              if (var2 == 0) {
                break L51;
              } else {
                if (us.field_k >= 6) {
                  break L51;
                } else {
                  us.field_k = us.field_k + 2;
                  break L51;
                }
              }
            }
            L52: {
              if (var2 != 0) {
                break L52;
              } else {
                if (us.field_k <= 0) {
                  break L52;
                } else {
                  us.field_k = us.field_k - 2;
                  break L52;
                }
              }
            }
            return;
          } else {
            L53: {
              if (320 != el.field_A) {
                break L53;
              } else {
                if (n.field_m != 240) {
                  break L53;
                } else {
                  L54: {
                    L55: {
                      vd.field_c = nl.field_p;
                      dn.field_yb = sm.field_q;
                      ip.field_a = wj.field_A;
                      kf.field_Eb = vc.field_y;
                      if (!dr.field_a) {
                        break L55;
                      } else {
                        if (1 != vd.field_c) {
                          break L55;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          break L54;
                        }
                      }
                    }
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L54;
                  }
                  L56: {
                    var2 = stackIn_8_0;
                    if (var2 == 0) {
                      break L56;
                    } else {
                      if (us.field_k >= 6) {
                        break L56;
                      } else {
                        us.field_k = us.field_k + 2;
                        break L56;
                      }
                    }
                  }
                  L57: {
                    if (var2 != 0) {
                      break L57;
                    } else {
                      if (us.field_k <= 0) {
                        break L57;
                      } else {
                        us.field_k = us.field_k - 2;
                        break L57;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L58: {
              wt.field_x = wt.field_x + (el.field_A - 320);
              us.field_j = us.field_j + (-240 + n.field_m);
              wt.field_x = Math.max(0, Math.min(639, wt.field_x));
              us.field_j = Math.max(0, Math.min(479, us.field_j));
              if (e.field_m == null) {
                stackOut_17_0 = ic.field_d;
                stackIn_18_0 = (Object) (Object) stackOut_17_0;
                break L58;
              } else {
                stackOut_16_0 = e.field_m;
                stackIn_18_0 = (Object) (Object) stackOut_16_0;
                break L58;
              }
            }
            L59: {
              L60: {
                var2_ref = stackIn_18_0;
                wu discarded$17 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                vd.field_c = nl.field_p;
                dn.field_yb = sm.field_q;
                ip.field_a = wj.field_A;
                kf.field_Eb = vc.field_y;
                if (!dr.field_a) {
                  break L60;
                } else {
                  if (1 != vd.field_c) {
                    break L60;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L59;
                  }
                }
              }
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L59;
            }
            L61: {
              var2 = stackIn_22_0;
              if (var2 == 0) {
                break L61;
              } else {
                if (us.field_k >= 6) {
                  break L61;
                } else {
                  us.field_k = us.field_k + 2;
                  break L61;
                }
              }
            }
            L62: {
              if (var2 != 0) {
                break L62;
              } else {
                if (us.field_k <= 0) {
                  break L62;
                } else {
                  us.field_k = us.field_k - 2;
                  break L62;
                }
              }
            }
            return;
          }
        }
    }

    kw(String param0) {
        ((kw) this).field_e = false;
        ((kw) this).field_j = false;
        try {
            ((kw) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "kw.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"The Ultimate", "Grass Roots", "Muddying Your Knees", "In the Big Leagues", "Hot on the Heels", "Rising Star", "League of Their Own", "We are the Champions", "Notching up the Goals", "Team Player", "All Kitted Out", "World in Motion", "Aggregate Win", "A Decent Margin", "They Think It's All Over", "Globetrotter", "Beat Your Maker", "The Head of God", "The Untouchables", "Cinq Without a Trace", "A-Team", "Coach's Playbook", "Goldenballs", "Team Goldenballs", "Pinpoint Accuracy", "Blink and You'll Miss It", "Comeback Kid", "All Four One", "Pass and Move", "Don't Stop Me Now", "Save the Day", "Route-One", "Hallowe'en", "One for the Cabinet", "There can be Only One", "Undisputed", "Impenetrable", "I Got a Touch!", "Owned", "Pwned", "Slipping Away", "Holding On", "Never Gonna Give You Up", "Mod Off!", "Trapped", "Trampled", "Stomped", "Grounded", "Flattened", "Splatted", "On a Roll", "Hot Potato", "Brutal Contender", "Slow and Steady Wins the Race", "Diamonds Aren't Forever", "Blitzkrieg!", "Queen's Park", "Topper Harley", "Pacifist", "Slow Coach", "Tactically Superior", "Frontier", "The Wall", "By the Skin of Their Teeth", "It's a Funny Old Game", "Flair for Finishing", "The Veterans", "Slip 'n' Slide", "Keepy-uppy", "Longshot", "Wonder Goal", "Man of the Match", "Up, Under, and In"};
        field_a = "Accept";
        field_g = "Loading extra data (1/2)";
        field_f = new ut(256, 256);
    }
}
