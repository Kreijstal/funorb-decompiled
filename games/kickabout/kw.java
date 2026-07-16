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
        vj.field_c = param0;
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
        int var3 = 0;
        hn var4 = null;
        hn var5 = null;
        var3 = Kickabout.field_G;
        var2 = (hn) (Object) da.field_h.g(24009);
        if (param0 < 104) {
          field_i = -30;
          L0: while (true) {
            if (var2 == null) {
              var5 = new hn(5, new int[1]);
              var2 = var5;
              ii.a(var5, 118);
              return;
            } else {
              L1: {
                if (5 == var2.field_i) {
                  var2.c((byte) -109);
                  break L1;
                } else {
                  break L1;
                }
              }
              var2 = (hn) (Object) da.field_h.c(33);
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (var2 == null) {
              var4 = new hn(5, new int[1]);
              var2 = var4;
              ii.a(var4, 118);
              return;
            } else {
              L3: {
                if (5 == var2.field_i) {
                  var2.c((byte) -109);
                  break L3;
                } else {
                  break L3;
                }
              }
              var2 = (hn) (Object) da.field_h.c(33);
              continue L2;
            }
          }
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
        int stackIn_10_0 = 0;
        Object stackIn_20_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_59_0 = 0;
        Object stackIn_69_0 = null;
        int stackIn_75_0 = 0;
        int stackIn_88_0 = 0;
        Object stackIn_104_0 = null;
        int stackIn_112_0 = 0;
        Object stackIn_126_0 = null;
        int stackIn_134_0 = 0;
        Object stackIn_146_0 = null;
        int stackIn_152_0 = 0;
        Object stackIn_163_0 = null;
        int stackIn_169_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_195_0 = 0;
        java.awt.Canvas stackOut_125_0 = null;
        vq stackOut_124_0 = null;
        int stackOut_132_0 = 0;
        int stackOut_133_0 = 0;
        java.awt.Canvas stackOut_103_0 = null;
        vq stackOut_102_0 = null;
        int stackOut_110_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_181_0 = 0;
        java.awt.Canvas stackOut_162_0 = null;
        vq stackOut_161_0 = null;
        int stackOut_167_0 = 0;
        int stackOut_168_0 = 0;
        java.awt.Canvas stackOut_145_0 = null;
        vq stackOut_144_0 = null;
        int stackOut_150_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        java.awt.Canvas stackOut_68_0 = null;
        vq stackOut_67_0 = null;
        int stackOut_73_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        java.awt.Canvas stackOut_19_0 = null;
        vq stackOut_18_0 = null;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        var3 = Kickabout.field_G;
        if (qo.c((byte) -42)) {
          L0: {
            if (!param0) {
              break L0;
            } else {
              if (!dr.field_a) {
                L1: {
                  rm.a(false);
                  if (!dr.field_a) {
                    wt.field_x = el.field_A;
                    us.field_j = n.field_m;
                    break L1;
                  } else {
                    L2: {
                      if (320 != el.field_A) {
                        break L2;
                      } else {
                        if (-241 != (n.field_m ^ -1)) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L3: {
                      wt.field_x = wt.field_x + (el.field_A - 320);
                      us.field_j = us.field_j + (-240 + n.field_m);
                      wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                      us.field_j = Math.max(0, Math.min(479, us.field_j));
                      if (e.field_m == null) {
                        stackOut_125_0 = ic.field_d;
                        stackIn_126_0 = (Object) (Object) stackOut_125_0;
                        break L3;
                      } else {
                        stackOut_124_0 = e.field_m;
                        stackIn_126_0 = (Object) (Object) stackOut_124_0;
                        break L3;
                      }
                    }
                    var2_ref = stackIn_126_0;
                    wu discarded$12 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                    break L1;
                  }
                }
                L4: {
                  if (param1 < -99) {
                    break L4;
                  } else {
                    kw.d((byte) -40);
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    vd.field_c = nl.field_p;
                    dn.field_yb = sm.field_q;
                    ip.field_a = wj.field_A;
                    kf.field_Eb = vc.field_y;
                    if (!dr.field_a) {
                      break L6;
                    } else {
                      if (1 != vd.field_c) {
                        break L6;
                      } else {
                        stackOut_132_0 = 1;
                        stackIn_134_0 = stackOut_132_0;
                        break L5;
                      }
                    }
                  }
                  stackOut_133_0 = 0;
                  stackIn_134_0 = stackOut_133_0;
                  break L5;
                }
                L7: {
                  var2 = stackIn_134_0;
                  if (var2 == 0) {
                    break L7;
                  } else {
                    if (-7 >= (us.field_k ^ -1)) {
                      break L7;
                    } else {
                      us.field_k = us.field_k + 2;
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var2 != 0) {
                    break L8;
                  } else {
                    if (-1 <= (us.field_k ^ -1)) {
                      break L8;
                    } else {
                      us.field_k = us.field_k - 2;
                      break L8;
                    }
                  }
                }
                return;
              } else {
                break L0;
              }
            }
          }
          if (!param0) {
            if (dr.field_a) {
              L9: {
                im.h(634588072);
                if (!dr.field_a) {
                  wt.field_x = el.field_A;
                  us.field_j = n.field_m;
                  break L9;
                } else {
                  L10: {
                    if (320 != el.field_A) {
                      break L10;
                    } else {
                      if (-241 != (n.field_m ^ -1)) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    wt.field_x = wt.field_x + (el.field_A - 320);
                    us.field_j = us.field_j + (-240 + n.field_m);
                    wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                    us.field_j = Math.max(0, Math.min(479, us.field_j));
                    if (e.field_m == null) {
                      stackOut_103_0 = ic.field_d;
                      stackIn_104_0 = (Object) (Object) stackOut_103_0;
                      break L11;
                    } else {
                      stackOut_102_0 = e.field_m;
                      stackIn_104_0 = (Object) (Object) stackOut_102_0;
                      break L11;
                    }
                  }
                  var2_ref = stackIn_104_0;
                  wu discarded$13 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                  break L9;
                }
              }
              L12: {
                if (param1 < -99) {
                  break L12;
                } else {
                  kw.d((byte) -40);
                  break L12;
                }
              }
              L13: {
                L14: {
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (!dr.field_a) {
                    break L14;
                  } else {
                    if (1 != vd.field_c) {
                      break L14;
                    } else {
                      stackOut_110_0 = 1;
                      stackIn_112_0 = stackOut_110_0;
                      break L13;
                    }
                  }
                }
                stackOut_111_0 = 0;
                stackIn_112_0 = stackOut_111_0;
                break L13;
              }
              L15: {
                var2 = stackIn_112_0;
                if (var2 == 0) {
                  break L15;
                } else {
                  if (-7 >= (us.field_k ^ -1)) {
                    break L15;
                  } else {
                    us.field_k = us.field_k + 2;
                    break L15;
                  }
                }
              }
              L16: {
                if (var2 != 0) {
                  break L16;
                } else {
                  if (-1 <= (us.field_k ^ -1)) {
                    break L16;
                  } else {
                    us.field_k = us.field_k - 2;
                    break L16;
                  }
                }
              }
              return;
            } else {
              if (!dr.field_a) {
                L17: {
                  wt.field_x = el.field_A;
                  us.field_j = n.field_m;
                  if (param1 < -99) {
                    break L17;
                  } else {
                    kw.d((byte) -40);
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    vd.field_c = nl.field_p;
                    dn.field_yb = sm.field_q;
                    ip.field_a = wj.field_A;
                    kf.field_Eb = vc.field_y;
                    if (!dr.field_a) {
                      break L19;
                    } else {
                      if (1 != vd.field_c) {
                        break L19;
                      } else {
                        stackOut_193_0 = 1;
                        stackIn_195_0 = stackOut_193_0;
                        break L18;
                      }
                    }
                  }
                  stackOut_194_0 = 0;
                  stackIn_195_0 = stackOut_194_0;
                  break L18;
                }
                var2 = stackIn_195_0;
                if (var2 != 0) {
                  if (-7 < (us.field_k ^ -1)) {
                    L20: {
                      us.field_k = us.field_k + 2;
                      if (var2 != 0) {
                        break L20;
                      } else {
                        if (-1 <= (us.field_k ^ -1)) {
                          break L20;
                        } else {
                          us.field_k = us.field_k - 2;
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    L21: {
                      if (var2 != 0) {
                        break L21;
                      } else {
                        if (-1 <= (us.field_k ^ -1)) {
                          break L21;
                        } else {
                          us.field_k = us.field_k - 2;
                          return;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L22: {
                    if (var2 != 0) {
                      break L22;
                    } else {
                      if (-1 <= (us.field_k ^ -1)) {
                        break L22;
                      } else {
                        us.field_k = us.field_k - 2;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (320 == el.field_A) {
                  if (-241 == (n.field_m ^ -1)) {
                    L23: {
                      if (param1 < -99) {
                        break L23;
                      } else {
                        kw.d((byte) -40);
                        break L23;
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
                            stackOut_180_0 = 1;
                            stackIn_182_0 = stackOut_180_0;
                            break L24;
                          }
                        }
                      }
                      stackOut_181_0 = 0;
                      stackIn_182_0 = stackOut_181_0;
                      break L24;
                    }
                    L26: {
                      var2 = stackIn_182_0;
                      if (var2 == 0) {
                        break L26;
                      } else {
                        if (-7 >= (us.field_k ^ -1)) {
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
                        if (-1 <= (us.field_k ^ -1)) {
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
                      wt.field_x = wt.field_x + (el.field_A - 320);
                      us.field_j = us.field_j + (-240 + n.field_m);
                      wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                      us.field_j = Math.max(0, Math.min(479, us.field_j));
                      if (e.field_m == null) {
                        stackOut_162_0 = ic.field_d;
                        stackIn_163_0 = (Object) (Object) stackOut_162_0;
                        break L28;
                      } else {
                        stackOut_161_0 = e.field_m;
                        stackIn_163_0 = (Object) (Object) stackOut_161_0;
                        break L28;
                      }
                    }
                    L29: {
                      var2_ref = stackIn_163_0;
                      wu discarded$14 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                      if (param1 < -99) {
                        break L29;
                      } else {
                        kw.d((byte) -40);
                        break L29;
                      }
                    }
                    L30: {
                      L31: {
                        vd.field_c = nl.field_p;
                        dn.field_yb = sm.field_q;
                        ip.field_a = wj.field_A;
                        kf.field_Eb = vc.field_y;
                        if (!dr.field_a) {
                          break L31;
                        } else {
                          if (1 != vd.field_c) {
                            break L31;
                          } else {
                            stackOut_167_0 = 1;
                            stackIn_169_0 = stackOut_167_0;
                            break L30;
                          }
                        }
                      }
                      stackOut_168_0 = 0;
                      stackIn_169_0 = stackOut_168_0;
                      break L30;
                    }
                    L32: {
                      var2 = stackIn_169_0;
                      if (var2 == 0) {
                        break L32;
                      } else {
                        if (-7 >= (us.field_k ^ -1)) {
                          break L32;
                        } else {
                          us.field_k = us.field_k + 2;
                          break L32;
                        }
                      }
                    }
                    L33: {
                      if (var2 != 0) {
                        break L33;
                      } else {
                        if (-1 <= (us.field_k ^ -1)) {
                          break L33;
                        } else {
                          us.field_k = us.field_k - 2;
                          break L33;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L34: {
                    wt.field_x = wt.field_x + (el.field_A - 320);
                    us.field_j = us.field_j + (-240 + n.field_m);
                    wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                    us.field_j = Math.max(0, Math.min(479, us.field_j));
                    if (e.field_m == null) {
                      stackOut_145_0 = ic.field_d;
                      stackIn_146_0 = (Object) (Object) stackOut_145_0;
                      break L34;
                    } else {
                      stackOut_144_0 = e.field_m;
                      stackIn_146_0 = (Object) (Object) stackOut_144_0;
                      break L34;
                    }
                  }
                  L35: {
                    var2_ref = stackIn_146_0;
                    wu discarded$15 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                    if (param1 < -99) {
                      break L35;
                    } else {
                      kw.d((byte) -40);
                      break L35;
                    }
                  }
                  L36: {
                    L37: {
                      vd.field_c = nl.field_p;
                      dn.field_yb = sm.field_q;
                      ip.field_a = wj.field_A;
                      kf.field_Eb = vc.field_y;
                      if (!dr.field_a) {
                        break L37;
                      } else {
                        if (1 != vd.field_c) {
                          break L37;
                        } else {
                          stackOut_150_0 = 1;
                          stackIn_152_0 = stackOut_150_0;
                          break L36;
                        }
                      }
                    }
                    stackOut_151_0 = 0;
                    stackIn_152_0 = stackOut_151_0;
                    break L36;
                  }
                  L38: {
                    var2 = stackIn_152_0;
                    if (var2 == 0) {
                      break L38;
                    } else {
                      if (-7 >= (us.field_k ^ -1)) {
                        break L38;
                      } else {
                        us.field_k = us.field_k + 2;
                        break L38;
                      }
                    }
                  }
                  L39: {
                    if (var2 != 0) {
                      break L39;
                    } else {
                      if (-1 <= (us.field_k ^ -1)) {
                        break L39;
                      } else {
                        us.field_k = us.field_k - 2;
                        break L39;
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            if (!dr.field_a) {
              L40: {
                wt.field_x = el.field_A;
                us.field_j = n.field_m;
                if (param1 < -99) {
                  break L40;
                } else {
                  kw.d((byte) -40);
                  break L40;
                }
              }
              L41: {
                L42: {
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (!dr.field_a) {
                    break L42;
                  } else {
                    if (1 != vd.field_c) {
                      break L42;
                    } else {
                      stackOut_86_0 = 1;
                      stackIn_88_0 = stackOut_86_0;
                      break L41;
                    }
                  }
                }
                stackOut_87_0 = 0;
                stackIn_88_0 = stackOut_87_0;
                break L41;
              }
              L43: {
                var2 = stackIn_88_0;
                if (var2 == 0) {
                  break L43;
                } else {
                  if (-7 >= (us.field_k ^ -1)) {
                    break L43;
                  } else {
                    us.field_k = us.field_k + 2;
                    break L43;
                  }
                }
              }
              L44: {
                if (var2 != 0) {
                  break L44;
                } else {
                  if (-1 <= (us.field_k ^ -1)) {
                    break L44;
                  } else {
                    us.field_k = us.field_k - 2;
                    break L44;
                  }
                }
              }
              return;
            } else {
              L45: {
                if (320 != el.field_A) {
                  break L45;
                } else {
                  if (-241 != (n.field_m ^ -1)) {
                    break L45;
                  } else {
                    L46: {
                      if (param1 < -99) {
                        break L46;
                      } else {
                        kw.d((byte) -40);
                        break L46;
                      }
                    }
                    L47: {
                      L48: {
                        vd.field_c = nl.field_p;
                        dn.field_yb = sm.field_q;
                        ip.field_a = wj.field_A;
                        kf.field_Eb = vc.field_y;
                        if (!dr.field_a) {
                          break L48;
                        } else {
                          if (1 != vd.field_c) {
                            break L48;
                          } else {
                            stackOut_57_0 = 1;
                            stackIn_59_0 = stackOut_57_0;
                            break L47;
                          }
                        }
                      }
                      stackOut_58_0 = 0;
                      stackIn_59_0 = stackOut_58_0;
                      break L47;
                    }
                    L49: {
                      var2 = stackIn_59_0;
                      if (var2 == 0) {
                        break L49;
                      } else {
                        if (-7 >= (us.field_k ^ -1)) {
                          break L49;
                        } else {
                          us.field_k = us.field_k + 2;
                          break L49;
                        }
                      }
                    }
                    L50: {
                      if (var2 != 0) {
                        break L50;
                      } else {
                        if (-1 <= (us.field_k ^ -1)) {
                          break L50;
                        } else {
                          us.field_k = us.field_k - 2;
                          break L50;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L51: {
                wt.field_x = wt.field_x + (el.field_A - 320);
                us.field_j = us.field_j + (-240 + n.field_m);
                wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                us.field_j = Math.max(0, Math.min(479, us.field_j));
                if (e.field_m == null) {
                  stackOut_68_0 = ic.field_d;
                  stackIn_69_0 = (Object) (Object) stackOut_68_0;
                  break L51;
                } else {
                  stackOut_67_0 = e.field_m;
                  stackIn_69_0 = (Object) (Object) stackOut_67_0;
                  break L51;
                }
              }
              L52: {
                var2_ref = stackIn_69_0;
                wu discarded$16 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
                if (param1 < -99) {
                  break L52;
                } else {
                  kw.d((byte) -40);
                  break L52;
                }
              }
              L53: {
                L54: {
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (!dr.field_a) {
                    break L54;
                  } else {
                    if (1 != vd.field_c) {
                      break L54;
                    } else {
                      stackOut_73_0 = 1;
                      stackIn_75_0 = stackOut_73_0;
                      break L53;
                    }
                  }
                }
                stackOut_74_0 = 0;
                stackIn_75_0 = stackOut_74_0;
                break L53;
              }
              L55: {
                var2 = stackIn_75_0;
                if (var2 == 0) {
                  break L55;
                } else {
                  if (-7 >= (us.field_k ^ -1)) {
                    break L55;
                  } else {
                    us.field_k = us.field_k + 2;
                    break L55;
                  }
                }
              }
              L56: {
                if (var2 != 0) {
                  break L56;
                } else {
                  if (-1 <= (us.field_k ^ -1)) {
                    break L56;
                  } else {
                    us.field_k = us.field_k - 2;
                    break L56;
                  }
                }
              }
              return;
            }
          }
        } else {
          if (!dr.field_a) {
            L57: {
              wt.field_x = el.field_A;
              us.field_j = n.field_m;
              if (param1 < -99) {
                break L57;
              } else {
                kw.d((byte) -40);
                break L57;
              }
            }
            L58: {
              L59: {
                vd.field_c = nl.field_p;
                dn.field_yb = sm.field_q;
                ip.field_a = wj.field_A;
                kf.field_Eb = vc.field_y;
                if (!dr.field_a) {
                  break L59;
                } else {
                  if (1 != vd.field_c) {
                    break L59;
                  } else {
                    stackOut_37_0 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    break L58;
                  }
                }
              }
              stackOut_38_0 = 0;
              stackIn_39_0 = stackOut_38_0;
              break L58;
            }
            L60: {
              var2 = stackIn_39_0;
              if (var2 == 0) {
                break L60;
              } else {
                if (-7 >= (us.field_k ^ -1)) {
                  break L60;
                } else {
                  us.field_k = us.field_k + 2;
                  break L60;
                }
              }
            }
            L61: {
              if (var2 != 0) {
                break L61;
              } else {
                if (-1 <= (us.field_k ^ -1)) {
                  break L61;
                } else {
                  us.field_k = us.field_k - 2;
                  break L61;
                }
              }
            }
            return;
          } else {
            L62: {
              if (320 != el.field_A) {
                break L62;
              } else {
                if (-241 != (n.field_m ^ -1)) {
                  break L62;
                } else {
                  L63: {
                    if (param1 < -99) {
                      break L63;
                    } else {
                      kw.d((byte) -40);
                      break L63;
                    }
                  }
                  L64: {
                    L65: {
                      vd.field_c = nl.field_p;
                      dn.field_yb = sm.field_q;
                      ip.field_a = wj.field_A;
                      kf.field_Eb = vc.field_y;
                      if (!dr.field_a) {
                        break L65;
                      } else {
                        if (1 != vd.field_c) {
                          break L65;
                        } else {
                          stackOut_8_0 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          break L64;
                        }
                      }
                    }
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L64;
                  }
                  L66: {
                    var2 = stackIn_10_0;
                    if (var2 == 0) {
                      break L66;
                    } else {
                      if (-7 >= (us.field_k ^ -1)) {
                        break L66;
                      } else {
                        us.field_k = us.field_k + 2;
                        break L66;
                      }
                    }
                  }
                  L67: {
                    if (var2 != 0) {
                      break L67;
                    } else {
                      if (-1 <= (us.field_k ^ -1)) {
                        break L67;
                      } else {
                        us.field_k = us.field_k - 2;
                        break L67;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L68: {
              wt.field_x = wt.field_x + (el.field_A - 320);
              us.field_j = us.field_j + (-240 + n.field_m);
              wt.field_x = Math.max(0, Math.min(639, wt.field_x));
              us.field_j = Math.max(0, Math.min(479, us.field_j));
              if (e.field_m == null) {
                stackOut_19_0 = ic.field_d;
                stackIn_20_0 = (Object) (Object) stackOut_19_0;
                break L68;
              } else {
                stackOut_18_0 = e.field_m;
                stackIn_20_0 = (Object) (Object) stackOut_18_0;
                break L68;
              }
            }
            L69: {
              var2_ref = stackIn_20_0;
              wu discarded$17 = oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) var2_ref);
              if (param1 < -99) {
                break L69;
              } else {
                kw.d((byte) -40);
                break L69;
              }
            }
            L70: {
              L71: {
                vd.field_c = nl.field_p;
                dn.field_yb = sm.field_q;
                ip.field_a = wj.field_A;
                kf.field_Eb = vc.field_y;
                if (!dr.field_a) {
                  break L71;
                } else {
                  if (1 != vd.field_c) {
                    break L71;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L70;
                  }
                }
              }
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L70;
            }
            L72: {
              var2 = stackIn_26_0;
              if (var2 == 0) {
                break L72;
              } else {
                if (-7 >= (us.field_k ^ -1)) {
                  break L72;
                } else {
                  us.field_k = us.field_k + 2;
                  break L72;
                }
              }
            }
            L73: {
              if (var2 != 0) {
                break L73;
              } else {
                if (-1 <= (us.field_k ^ -1)) {
                  break L73;
                } else {
                  us.field_k = us.field_k - 2;
                  break L73;
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
        ((kw) this).field_d = param0;
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
