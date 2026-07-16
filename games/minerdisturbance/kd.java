/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    private int field_d;
    private int field_n;
    static ea field_r;
    static String[][] field_b;
    static String field_e;
    private String field_h;
    private int field_s;
    private ln[] field_l;
    static boolean field_i;
    static bd field_p;
    private int field_f;
    private int field_m;
    private ea field_q;
    private String[] field_j;
    private ea field_g;
    private ea field_a;
    private nn field_c;
    private boolean field_o;
    static String[] field_k;
    private int field_t;

    final static void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
            field_k = null;
        }
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener((java.awt.event.KeyListener) (Object) di.field_O);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) di.field_O);
    }

    final static void a(int param0, byte param1) {
        nb.field_i[2].a((byte) 7, param0);
        if (param1 >= -77) {
            field_b = null;
        }
    }

    private final int b(int param0) {
        ((kd) this).field_c.b((byte) -34);
        if (param0 != 1) {
            Object var3 = null;
            this.a((byte) -68, -0.07744473218917847f, (ea) null, (int[]) null, (we) null, -71, 72, (String) null, -74, -38);
        }
        if (((kd) this).field_c.b(true)) {
            if (((kd) this).field_c.field_e == 0) {
                this.c((byte) -127);
                return 3;
            }
            if (!(((kd) this).field_c.field_e != 1)) {
                return 1;
            }
        }
        if ((lj.field_t ^ -1) == -14) {
            return 1;
        }
        return 0;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        ea var5 = null;
        String var6 = null;
        String var7 = null;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        if (null != ((kd) this).field_q) {
          return;
        } else {
          if (null != al.field_r) {
            L0: {
              ((kd) this).field_q = new ea(622, 47);
              vb.a(((kd) this).field_q, 125);
              eh.c(0, 0, 622, 47, 4540749, 65793);
              if (param0 <= -69) {
                break L0;
              } else {
                kd.a(28, (byte) 95);
                break L0;
              }
            }
            var2 = 16448250;
            var3 = 10068666;
            var16 = vk.a(var3, var2, (byte) 105);
            this.a(622, ((kd) this).field_h, (we) (Object) al.field_r, (byte) 120, var16, 0, 47, 0);
            tk.b(true);
            ((kd) this).field_a = new ea(475, 24);
            this.a((byte) 99, 0.75f, ((kd) this).field_a, var16, (we) (Object) al.field_r, -4, 475, on.field_z, 24, 0);
            var17 = vk.a(526344, 526344, (byte) 105);
            var15 = var17;
            var13 = var15;
            var11 = var13;
            var9 = var11;
            var5 = new ea(121, 122);
            vb.a(var5, 127);
            eh.c(0, 0, var5.field_y, var5.field_C / 2, 16180917, 16306250);
            eh.c(0, var5.field_C / 2, var5.field_y, var5.field_C, 16306250, 15568919);
            var6 = dn.field_s;
            var7 = sn.field_e;
            this.a((byte) 116, 0.5f, var5, var17, (we) (Object) al.field_r, -16, var5.field_y, var6, var5.field_C, 0);
            this.a((byte) 113, 0.5f, var5, var17, (we) (Object) al.field_r, 20, var5.field_y, var7, var5.field_C, 0);
            this.a((byte) 100, 0.699999988079071f, var5, var9, (we) (Object) al.field_r, 12 + (-al.field_r.field_I + var5.field_C / 2), var5.field_y, ub.field_a[((kd) this).field_m], var5.field_C / 3, 0);
            tk.b(true);
            ((kd) this).field_g = new ea(121, 122);
            vb.a(((kd) this).field_g, 127);
            var5.a(((kd) this).field_g.field_y / 2, ((kd) this).field_g.field_C / 2, -2048, 4096);
            tk.b(true);
            return;
          } else {
            return;
          }
        }
    }

    private final void b(byte param0) {
        ln var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ln var6 = null;
        ln var7 = null;
        var5 = MinerDisturbance.field_ab;
        if (null == ((kd) this).field_l) {
          if (null == ql.field_m) {
            return;
          } else {
            int discarded$2 = ql.field_m.a(ll.field_e, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
            return;
          }
        } else {
          L0: {
            var6 = ((kd) this).field_l[((kd) this).field_s];
            var2 = var6;
            if (param0 == 72) {
              break L0;
            } else {
              field_b = null;
              break L0;
            }
          }
          L1: {
            if (var2 != null) {
              var6.a(9, 58);
              break L1;
            } else {
              if (null == ql.field_m) {
                break L1;
              } else {
                int discarded$3 = ql.field_m.a(ll.field_e, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                break L1;
              }
            }
          }
          L2: {
            if (tg.field_g > ((kd) this).field_n) {
              var7 = ((kd) this).field_l[((kd) this).field_d];
              var2 = var7;
              if (var2 == null) {
                break L2;
              } else {
                var3 = ((kd) this).field_n * (var7.field_j - -60) / tg.field_g;
                var4 = var3 + -30;
                if (((kd) this).field_o) {
                  qf.a(-256 * var4 / 30, (var7.field_j - var4) * 256 / 30, var7, 58, param0 + -72, 9);
                  break L2;
                } else {
                  qf.a((-var4 + var7.field_j) * 256 / 30, -256 * var4 / 30, var7, 58, param0 + -72, 9);
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        ((kd) this).field_t = 0;
        ((kd) this).field_n = tg.field_g;
        ((kd) this).field_s = 0;
        ((kd) this).field_f = 0;
        ((kd) this).field_c.a(0, -1, this.a(nk.field_w, 11852, gb.field_e), param0);
        if (!param1) {
            kd.a(-19, (byte) -79);
        }
    }

    private final void c(byte param0) {
        try {
            g.a(bm.c(-119), 88);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        if (param0 >= -27) {
            ((kd) this).field_q = null;
        }
    }

    private final void a(boolean param0, String param1, java.applet.Applet param2, boolean param3, ln[] param4, String[] param5) {
        String var7 = null;
        L0: {
          L1: {
            var7 = param2.getParameter("currency");
            if (var7 == null) {
              break L1;
            } else {
              if (!oi.a(-19804, (CharSequence) (Object) var7)) {
                break L1;
              } else {
                ((kd) this).field_m = md.a((CharSequence) (Object) var7, param3);
                break L0;
              }
            }
          }
          ((kd) this).field_m = 2;
          break L0;
        }
        ((kd) this).field_h = param1;
        ((kd) this).field_c = new nn(2);
        if (param3) {
          L2: {
            ((kd) this).field_l = param4;
            ((kd) this).field_j = param5;
            if (null == ((kd) this).field_l) {
              break L2;
            } else {
              if (-4 < (((kd) this).field_l.length ^ -1)) {
                break L2;
              } else {
                db.field_e = param0;
                return;
              }
            }
          }
          throw new IllegalArgumentException("");
        } else {
          return;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        eh.c(9, 9, 622, 47, 4540749, 65793);
        eh.e(9, 257, 622, 33, 2585);
        eh.c(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            var3 = 299;
            L1: while (true) {
              if (var2 >= 2) {
                L2: {
                  this.b((byte) 72);
                  if (wk.field_c == null) {
                    break L2;
                  } else {
                    if (!wk.field_c.a((byte) 105)) {
                      break L2;
                    } else {
                      if (!wk.field_c.a(false, "members_expansion_screen")) {
                        break L2;
                      } else {
                        if (!wk.field_c.a(false, "arialish12")) {
                          break L2;
                        } else {
                          if (!wk.field_c.a(false, "pump32")) {
                            break L2;
                          } else {
                            if (null == uk.field_xb) {
                              break L2;
                            } else {
                              if (!uk.field_xb.a((byte) 95)) {
                                break L2;
                              } else {
                                if (!uk.field_xb.a(false, "arialish12")) {
                                  break L2;
                                } else {
                                  if (!uk.field_xb.a(false, "pump32")) {
                                    break L2;
                                  } else {
                                    ba.field_K = pb.a("members_expansion_screen", wk.field_c, "frame", (byte) -77);
                                    ah.field_d = jn.a("arrow", -29553, "members_expansion_screen", wk.field_c);
                                    ql.field_m = rd.a("arialish12", -102, uk.field_xb, wk.field_c, "");
                                    al.field_r = oc.a(uk.field_xb, (byte) 125, "pump32", "", wk.field_c);
                                    pk.field_c = bb.a("benefit_orbs", wk.field_c, -115, "members_expansion_screen");
                                    db.field_f = bb.a("button_text", wk.field_c, param0 + -235, "members_expansion_screen");
                                    wm.field_g = md.a("button_highlights", wk.field_c, 10, "members_expansion_screen");
                                    wk.field_c = null;
                                    uk.field_xb = null;
                                    break L2;
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
                this.a(param0 ^ -27);
                if (null == ba.field_K) {
                  return;
                } else {
                  L3: {
                    ((kd) this).field_g.f(376, 339);
                    ((kd) this).field_q.f(9, 9);
                    ba.field_K.a(0, 0);
                    if (null == ah.field_d) {
                      break L3;
                    } else {
                      ah.field_d.f(9, 257);
                      ah.field_d.h(558, 257);
                      if (257 >= gb.field_e) {
                        break L3;
                      } else {
                        if (-291 < (gb.field_e ^ -1)) {
                          var2 = 40 + (40 * ml.a(((kd) this).field_t << -362525052, (byte) -114) >> 1527322800);
                          if (0 >= var2) {
                            break L3;
                          } else {
                            L4: {
                              if (-10 <= (nk.field_w ^ -1)) {
                                break L4;
                              } else {
                                if (82 <= nk.field_w) {
                                  break L4;
                                } else {
                                  ah.field_d.g(8, 256, var2);
                                  ah.field_d.g(10, 256, var2);
                                  ah.field_d.g(8, 258, var2);
                                  ah.field_d.g(10, 258, var2);
                                  break L3;
                                }
                              }
                            }
                            if ((nk.field_w ^ -1) >= -559) {
                              break L3;
                            } else {
                              if ((nk.field_w ^ -1) <= -632) {
                                break L3;
                              } else {
                                ah.field_d.a();
                                ah.field_d.g(557, 256, var2);
                                ah.field_d.g(559, 256, var2);
                                ah.field_d.g(557, 258, var2);
                                ah.field_d.g(559, 258, var2);
                                ah.field_d.a();
                                break L3;
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    ((kd) this).field_a.f(16, 302);
                    int discarded$4 = ql.field_m.a(((kd) this).field_j[((kd) this).field_s], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                    pk.field_c.f(30, 330);
                    int discarded$5 = ql.field_m.a(af.field_o[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    int discarded$6 = ql.field_m.a(af.field_o[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    int discarded$7 = ql.field_m.a(af.field_o[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    db.field_f.f(508 - -((127 - db.field_f.field_x) / 2), 315);
                    if (0 == ((kd) this).field_c.field_e) {
                      wm.field_g[0].f(508, 299);
                      break L5;
                    } else {
                      if (((kd) this).field_c.field_e == 1) {
                        wm.field_g[1].f(508, 387);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (param0 == 117) {
                      break L6;
                    } else {
                      ((kd) this).field_f = -44;
                      break L6;
                    }
                  }
                  return;
                }
              } else {
                eh.c(508, var3, 127, 42, 1130115, 3365268);
                eh.e(508, 42 + var3, 127, 42, 12410);
                var2++;
                var3 += 91;
                continue L1;
              }
            }
          } else {
            eh.c(var3, 331, 117, 90, 460551, 3881787);
            var3 += 121;
            var2++;
            continue L0;
          }
        }
    }

    private final int a(int param0, int param1, int param2) {
        if (ba.field_K == null) {
            return -1;
        }
        if (-509 >= (param0 ^ -1)) {
            if (param0 < 635) {
                if ((param2 ^ -1) <= -300) {
                    if (!(-387 >= (param2 ^ -1))) {
                        return 0;
                    }
                }
            }
        }
        if (param0 >= 508) {
            if ((param0 ^ -1) > -636) {
                if (-391 >= (param2 ^ -1)) {
                    if (!(param2 >= 475)) {
                        return 1;
                    }
                }
            }
        }
        if (param1 != 11852) {
            field_k = null;
        }
        return -1;
    }

    private final void a(int param0, String param1, we param2, byte param3, int[] param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = MinerDisturbance.field_ab;
        ti.a((byte) 127);
        for (var9 = param5; param6 > var9; var9++) {
            eh.a(param7, var9, param0, 1 + var9);
            var10 = param4.length * var9 / param6;
            var11 = param4[-1 + param4.length - var10];
            int discarded$0 = param2.a(param1, param7, param5, param0, param6, var11, -1, 1, 1, 0);
        }
        tk.b(true);
        if (param3 <= 113) {
            Object var13 = null;
            kd.a((java.awt.Component) null, true);
        }
    }

    final static void a(byte param0) {
        pj.field_c = new th();
        if (param0 < 22) {
            kd.a((byte) 62);
        }
    }

    private final void a(byte param0, float param1, ea param2, int[] param3, we param4, int param5, int param6, String param7, int param8, int param9) {
        int var11 = (int)((float)param6 / param1);
        int var12 = (int)((float)param8 / param1);
        int var14 = 84 % ((42 - param0) / 57);
        ea var13 = new ea(var11, var12);
        vb.a(var13, 126);
        param2.c((int)((float)(-param9) / param1), (int)((float)(-param5) / param1), (int)((float)param2.field_y / param1), (int)((float)param2.field_C / param1));
        this.a(var11, param7, param4, (byte) 116, param3, 0, var12, 0);
        tk.b(true);
        vb.a(param2, 127);
        var13.b(param9, param5, param6, param8);
        tk.b(true);
    }

    public static void c(int param0) {
        field_p = null;
        field_b = null;
        field_k = null;
        if (param0 <= 67) {
            Object var2 = null;
            kd.a((java.awt.Component) null, true);
        }
        field_r = null;
        field_e = null;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        ((kd) this).field_f = ((kd) this).field_f + 65536;
        L0: while (true) {
          if (-65537 < (ce.a(4316, ((kd) this).field_f, tg.field_d) ^ -1)) {
            var3 = -1;
            if (param1 == 1) {
              L1: {
                if (null != ((kd) this).field_l) {
                  var3 = ((kd) this).field_l.length;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 == (var3 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (((kd) this).field_n >= tg.field_i) {
                      break L3;
                    } else {
                      L4: {
                        ((kd) this).field_n = ((kd) this).field_n + 1;
                        if ((tg.field_g ^ -1) <= (((kd) this).field_n ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            if (null == ((kd) this).field_l) {
                              break L5;
                            } else {
                              if (((kd) this).field_l[((kd) this).field_s] != null) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ((kd) this).field_n = ((kd) this).field_n - 1;
                          break L3;
                        }
                      }
                      if (((kd) this).field_n < tg.field_i) {
                        break L3;
                      } else {
                        if (((kd) this).field_l[(1 + ((kd) this).field_s) % var3] == null) {
                          ((kd) this).field_n = ((kd) this).field_n - 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L6: {
                    if (((kd) this).field_n < tg.field_i) {
                      break L6;
                    } else {
                      L7: {
                        ((kd) this).field_d = ((kd) this).field_s;
                        if (((kd) this).field_o) {
                          ((kd) this).field_s = ((kd) this).field_s + 1;
                          if ((((kd) this).field_s ^ -1) > (var3 ^ -1)) {
                            break L7;
                          } else {
                            ((kd) this).field_s = ((kd) this).field_s - var3;
                            break L7;
                          }
                        } else {
                          ((kd) this).field_s = ((kd) this).field_s - 1;
                          if (0 > ((kd) this).field_s) {
                            ((kd) this).field_s = ((kd) this).field_s + var3;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ((kd) this).field_n = ((kd) this).field_n - tg.field_i;
                      break L6;
                    }
                  }
                  if ((tg.field_g ^ -1) <= (((kd) this).field_n ^ -1)) {
                    break L2;
                  } else {
                    ((kd) this).field_o = true;
                    break L2;
                  }
                }
              }
              L8: {
                if (ah.field_d != null) {
                  L9: {
                    var4 = 0;
                    if ((jk.field_ab ^ -1) == -1) {
                      break L9;
                    } else {
                      if (257 >= m.field_e) {
                        break L9;
                      } else {
                        if (-291 >= (m.field_e ^ -1)) {
                          break L9;
                        } else {
                          L10: {
                            if ((wi.field_w ^ -1) >= -10) {
                              break L10;
                            } else {
                              if (82 <= wi.field_w) {
                                break L10;
                              } else {
                                var4 = 1;
                                ((kd) this).field_o = false;
                                ((kd) this).field_n = tg.field_i;
                                break L10;
                              }
                            }
                          }
                          if (-559 <= (wi.field_w ^ -1)) {
                            break L9;
                          } else {
                            if (wi.field_w >= 631) {
                              break L9;
                            } else {
                              ((kd) this).field_o = true;
                              ((kd) this).field_n = tg.field_i;
                              var4 = 1;
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L8;
                  } else {
                    if (tg.field_g >= ((kd) this).field_n) {
                      break L8;
                    } else {
                      if (m.field_e <= 257) {
                        break L8;
                      } else {
                        if (290 <= m.field_e) {
                          break L8;
                        } else {
                          L11: {
                            if ((nk.field_w ^ -1) >= -10) {
                              break L11;
                            } else {
                              if (82 <= nk.field_w) {
                                break L11;
                              } else {
                                ((kd) this).field_n = tg.field_g;
                                break L11;
                              }
                            }
                          }
                          if (558 >= nk.field_w) {
                            break L8;
                          } else {
                            if (631 <= nk.field_w) {
                              break L8;
                            } else {
                              ((kd) this).field_n = tg.field_g;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              if (param0) {
                L12: {
                  ((kd) this).field_c.a(this.a(nk.field_w, 11852, gb.field_e), this.a(wi.field_w, 11852, m.field_e), param1 ^ -2);
                  var4 = 0;
                  if (((kd) this).field_c.b(true)) {
                    L13: {
                      if ((((kd) this).field_c.field_e ^ -1) != -1) {
                        break L13;
                      } else {
                        var4 = 1;
                        break L13;
                      }
                    }
                    if (-2 != (((kd) this).field_c.field_e ^ -1)) {
                      break L12;
                    } else {
                      return 2;
                    }
                  } else {
                    break L12;
                  }
                }
                L14: {
                  if (db.field_e) {
                    L15: while (true) {
                      if (!mm.b((byte) 38)) {
                        break L14;
                      } else {
                        var5 = this.b(param1 + 0);
                        if (var5 == 0) {
                          continue L15;
                        } else {
                          return var5;
                        }
                      }
                    }
                  } else {
                    break L14;
                  }
                }
                if (var4 == 0) {
                  return 0;
                } else {
                  this.c((byte) -72);
                  return 3;
                }
              } else {
                return 0;
              }
            } else {
              return 78;
            }
          } else {
            ((kd) this).field_t = ((kd) this).field_t + 1;
            ((kd) this).field_f = ((kd) this).field_f - tg.field_d;
            continue L0;
          }
        }
    }

    kd(java.applet.Applet param0, String param1, ln[] param2, String[] param3) {
        ((kd) this).field_f = 0;
        ((kd) this).field_o = true;
        ((kd) this).field_t = 0;
        this.a(true, param1, param0, true, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[][]{new String[1]};
        field_e = "Play free version";
        field_p = new bd();
        field_k = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
