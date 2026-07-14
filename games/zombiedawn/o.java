/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    private String[] field_k;
    private int field_c;
    private jp field_a;
    private int field_i;
    static byte[] field_l;
    private vn field_p;
    private int field_q;
    private boolean field_f;
    private vn field_g;
    private String field_j;
    private v[] field_m;
    private int field_h;
    private vn field_b;
    private int field_e;
    private int field_o;
    static vn[] field_d;
    static String field_n;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        vn var6 = null;
        String var7 = null;
        String var8 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        if (null != ((o) this).field_b) {
          return;
        } else {
          if (null != ui.field_b) {
            ((o) this).field_b = new vn(622, 47);
            ki.a((byte) -84, ((o) this).field_b);
            var2 = 76 % ((param0 - -45) / 48);
            bi.f(0, 0, 622, 47, 4540749, 65793);
            var3 = 16448250;
            var4 = 10068666;
            var17 = gk.a(var4, -107, var3);
            this.a(-1, 0, 622, 0, 47, (rb) (Object) ui.field_b, var17, ((o) this).field_j);
            pa.a(-21189);
            ((o) this).field_g = new vn(475, 24);
            this.a(ag.field_e, 0, (byte) 112, ((o) this).field_g, var17, -4, (rb) (Object) ui.field_b, 475, 0.75f, 24);
            var18 = gk.a(526344, -116, 526344);
            var16 = var18;
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var6 = new vn(121, 122);
            ki.a((byte) -127, var6);
            bi.f(0, 0, var6.field_w, var6.field_t / 2, 16180917, 16306250);
            bi.f(0, var6.field_t / 2, var6.field_w, var6.field_t, 16306250, 15568919);
            var7 = an.field_y;
            var8 = se.field_i;
            this.a(var7, 0, (byte) 63, var6, var18, -16, (rb) (Object) ui.field_b, var6.field_w, 0.5f, var6.field_t);
            this.a(var8, 0, (byte) 42, var6, var18, 20, (rb) (Object) ui.field_b, var6.field_w, 0.5f, var6.field_t);
            this.a(ui.field_e[((o) this).field_h], 0, (byte) 99, var6, var10, var6.field_t / 2 + (-ui.field_b.field_I - -12), (rb) (Object) ui.field_b, var6.field_w, 0.699999988079071f, var6.field_t / 3);
            pa.a(-21189);
            ((o) this).field_p = new vn(121, 122);
            ki.a((byte) -121, ((o) this).field_p);
            var6.e(((o) this).field_p.field_w / 2, ((o) this).field_p.field_t / 2, -2048, 4096);
            pa.a(-21189);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0) {
        v var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        v var6 = null;
        v var7 = null;
        var5 = ZombieDawn.field_J;
        if (((o) this).field_m != null) {
          L0: {
            var6 = ((o) this).field_m[((o) this).field_c];
            var2 = var6;
            if (var2 != null) {
              var6.a(9, 58);
              break L0;
            } else {
              if (tc.field_r != null) {
                int discarded$2 = tc.field_r.a(ql.field_f, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (((o) this).field_i >= ij.field_I) {
              break L1;
            } else {
              var7 = ((o) this).field_m[((o) this).field_e];
              var2 = var7;
              if (var2 == null) {
                break L1;
              } else {
                var3 = (60 + var7.field_a) * ((o) this).field_i / ij.field_I;
                var4 = -30 + var3;
                if (!((o) this).field_f) {
                  vh.a(var2, (var7.field_a + -var4) * 256 / 30, -256 * var4 / 30, 9, 58, (byte) 84);
                  break L1;
                } else {
                  vh.a(var2, -256 * var4 / 30, 256 * (-var4 + var7.field_a) / 30, 9, 58, (byte) 84);
                  break L1;
                }
              }
            }
          }
          L2: {
            if (param0 == 9) {
              break L2;
            } else {
              ((o) this).field_h = -111;
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (tc.field_r != null) {
              int discarded$3 = tc.field_r.a(ql.field_f, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    private final void a(boolean param0, java.applet.Applet param1, int param2, String[] param3, String param4, v[] param5) {
        String var7 = null;
        L0: {
          L1: {
            var7 = param1.getParameter("currency");
            if (var7 == null) {
              break L1;
            } else {
              if (sj.a((byte) -117, (CharSequence) (Object) var7)) {
                ((o) this).field_h = ra.a((CharSequence) (Object) var7, 115);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((o) this).field_h = 2;
          break L0;
        }
        L2: {
          ((o) this).field_j = param4;
          ((o) this).field_a = new jp(param2);
          ((o) this).field_m = param5;
          ((o) this).field_k = param3;
          if (((o) this).field_m == null) {
            break L2;
          } else {
            if ((((o) this).field_m.length ^ -1) > -4) {
              break L2;
            } else {
              bd.field_r = param0;
              return;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final int b(int param0) {
        ((o) this).field_a.a(param0 + 17875);
        if (param0 != 3782) {
            return 58;
        }
        if (((o) this).field_a.d(param0 ^ -3772)) {
            if (((o) this).field_a.field_d == -1) {
                this.c(1);
                return 3;
            }
            if (-2 == ((o) this).field_a.field_d) {
                return 1;
            }
        }
        if ((kg.field_i ^ -1) == -14) {
            return 1;
        }
        return 0;
    }

    private final void a(String param0, int param1, byte param2, vn param3, int[] param4, int param5, rb param6, int param7, float param8, int param9) {
        int var11 = (int)((float)param7 / param8);
        int var12 = (int)((float)param9 / param8);
        vn var13 = new vn(var11, var12);
        if (param2 < 6) {
            ((o) this).field_m = null;
        }
        ki.a((byte) -83, var13);
        param3.a((int)((float)(-param1) / param8), (int)((float)(-param5) / param8), (int)((float)param3.field_w / param8), (int)((float)param3.field_t / param8));
        this.a(-1, 0, var11, 0, var12, param6, param4, param0);
        pa.a(-21189);
        ki.a((byte) -91, param3);
        var13.d(param1, param5, param7, param9);
        pa.a(-21189);
    }

    final void a(boolean param0, int param1) {
        ((o) this).field_q = 0;
        ((o) this).field_i = ij.field_I;
        ((o) this).field_o = 0;
        ((o) this).field_c = 0;
        ((o) this).field_a.a(param0, (byte) -120, this.a(ei.field_K, ha.field_b, -33), -1);
        if (param1 != 1) {
            field_l = null;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = ZombieDawn.field_J;
        bi.f(9, 9, 622, 47, 4540749, 65793);
        bi.b(9, 257, 622, 33, 2585);
        bi.f(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        L0: while (true) {
          if (-5 >= (var2 ^ -1)) {
            L1: {
              if (param0 >= 102) {
                break L1;
              } else {
                var5 = null;
                this.a(15, -22, 123, 21, -97, (rb) null, (int[]) null, (String) null);
                break L1;
              }
            }
            var2 = 0;
            var3 = 299;
            L2: while (true) {
              if (var2 >= 2) {
                L3: {
                  this.a(9);
                  if (null == nl.field_t) {
                    break L3;
                  } else {
                    if (!nl.field_t.a((byte) 73)) {
                      break L3;
                    } else {
                      if (!nl.field_t.a(-1, "members_expansion_screen")) {
                        break L3;
                      } else {
                        if (!nl.field_t.a(-1, "arialish12")) {
                          break L3;
                        } else {
                          if (!nl.field_t.a(-1, "pump32")) {
                            break L3;
                          } else {
                            if (ge.field_b == null) {
                              break L3;
                            } else {
                              if (!ge.field_b.a((byte) 73)) {
                                break L3;
                              } else {
                                if (!ge.field_b.a(-1, "arialish12")) {
                                  break L3;
                                } else {
                                  if (ge.field_b.a(-1, "pump32")) {
                                    li.field_i = vj.a(nl.field_t, "frame", "members_expansion_screen", 4424743);
                                    nl.field_r = gf.a(nl.field_t, "arrow", 8, "members_expansion_screen");
                                    tc.field_r = gb.a("", -1, ge.field_b, "arialish12", nl.field_t);
                                    ui.field_b = ra.a(ge.field_b, "pump32", "", 0, nl.field_t);
                                    ck.field_i = bn.a("benefit_orbs", nl.field_t, "members_expansion_screen", 1);
                                    bb.field_c = bn.a("button_text", nl.field_t, "members_expansion_screen", 1);
                                    ng.field_c = df.a((byte) 24, "members_expansion_screen", "button_highlights", nl.field_t);
                                    nl.field_t = null;
                                    ge.field_b = null;
                                    break L3;
                                  } else {
                                    break L3;
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
                this.a((byte) -127);
                if (null != li.field_i) {
                  L4: {
                    ((o) this).field_p.b(376, 339);
                    ((o) this).field_b.b(9, 9);
                    li.field_i.a(0, 0);
                    if (null != nl.field_r) {
                      nl.field_r.b(9, 257);
                      nl.field_r.c(558, 257);
                      if (257 >= ei.field_K) {
                        break L4;
                      } else {
                        if (-291 >= (ei.field_K ^ -1)) {
                          break L4;
                        } else {
                          var2 = 40 + (40 * ig.f(2047, ((o) this).field_o << -1208358364) >> -1062753616);
                          if (var2 > 0) {
                            L5: {
                              if (-10 <= (ha.field_b ^ -1)) {
                                break L5;
                              } else {
                                if ((ha.field_b ^ -1) > -83) {
                                  nl.field_r.b(8, 256, var2);
                                  nl.field_r.b(10, 256, var2);
                                  nl.field_r.b(8, 258, var2);
                                  nl.field_r.b(10, 258, var2);
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (558 >= ha.field_b) {
                              break L4;
                            } else {
                              if (ha.field_b < 631) {
                                nl.field_r.c();
                                nl.field_r.b(557, 256, var2);
                                nl.field_r.b(559, 256, var2);
                                nl.field_r.b(557, 258, var2);
                                nl.field_r.b(559, 258, var2);
                                nl.field_r.c();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    ((o) this).field_g.b(16, 302);
                    int discarded$4 = tc.field_r.a(((o) this).field_k[((o) this).field_c], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                    ck.field_i.b(30, 330);
                    int discarded$5 = tc.field_r.a(dl.field_a[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    int discarded$6 = tc.field_r.a(dl.field_a[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    int discarded$7 = tc.field_r.a(dl.field_a[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    bb.field_c.b(508 + (127 + -bb.field_c.field_r) / 2, 315);
                    if (-1 == (((o) this).field_a.field_d ^ -1)) {
                      ng.field_c[0].b(508, 299);
                      break L6;
                    } else {
                      if ((((o) this).field_a.field_d ^ -1) == -2) {
                        ng.field_c[1].b(508, 387);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                bi.f(508, var3, 127, 42, 1130115, 3365268);
                bi.b(508, var3 + 42, 127, 42, 12410);
                var3 += 91;
                var2++;
                continue L2;
              }
            }
          } else {
            bi.f(var3, 331, 117, 90, 460551, 3881787);
            var2++;
            var3 += 121;
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_n = null;
        field_d = null;
        if (!param0) {
            field_d = null;
        }
    }

    private final void c(int param0) {
        try {
            hi.a(hc.a(param0 ^ param0), 124);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = -72 / ((83 - param2) / 41);
        if (!(null != li.field_i)) {
            return -1;
        }
        if (-509 >= (param1 ^ -1)) {
            if ((param1 ^ -1) > -636) {
                if (299 <= param0) {
                    if (param0 > -387) {
                        return 0;
                    }
                }
            }
        }
        if (508 <= param1) {
            if (param1 < 635) {
                if (-391 <= param0) {
                    if (!((param0 ^ -1) <= -476)) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    o(java.applet.Applet param0, String param1, v[] param2, boolean param3, String[] param4) {
        ((o) this).field_q = 0;
        ((o) this).field_f = true;
        ((o) this).field_o = 0;
        this.a(param3, param0, 2, param4, param1, param2);
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        if (param1 == 257) {
          ((o) this).field_q = ((o) this).field_q + 65536;
          L0: while (true) {
            if (65536 > wb.a(108, ij.field_E, ((o) this).field_q)) {
              L1: {
                var3 = -1;
                if (((o) this).field_m != null) {
                  var3 = ((o) this).field_m.length;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var3 != -1) {
                  L3: {
                    if (ij.field_P > ((o) this).field_i) {
                      L4: {
                        ((o) this).field_i = ((o) this).field_i + 1;
                        if (ij.field_I >= ((o) this).field_i) {
                          break L4;
                        } else {
                          L5: {
                            if (null == ((o) this).field_m) {
                              break L5;
                            } else {
                              if (null == ((o) this).field_m[((o) this).field_c]) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          ((o) this).field_i = ((o) this).field_i - 1;
                          break L3;
                        }
                      }
                      if (ij.field_P > ((o) this).field_i) {
                        break L3;
                      } else {
                        if (null != ((o) this).field_m[(((o) this).field_c - -1) % var3]) {
                          break L3;
                        } else {
                          ((o) this).field_i = ((o) this).field_i - 1;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L6: {
                    if (ij.field_P > ((o) this).field_i) {
                      break L6;
                    } else {
                      L7: {
                        ((o) this).field_e = ((o) this).field_c;
                        if (!((o) this).field_f) {
                          ((o) this).field_c = ((o) this).field_c - 1;
                          if (0 <= ((o) this).field_c) {
                            break L7;
                          } else {
                            ((o) this).field_c = ((o) this).field_c + var3;
                            break L7;
                          }
                        } else {
                          ((o) this).field_c = ((o) this).field_c + 1;
                          if (((o) this).field_c >= var3) {
                            ((o) this).field_c = ((o) this).field_c - var3;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ((o) this).field_i = ((o) this).field_i - ij.field_P;
                      break L6;
                    }
                  }
                  if (ij.field_I >= ((o) this).field_i) {
                    break L2;
                  } else {
                    ((o) this).field_f = true;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L8: {
                if (nl.field_r != null) {
                  L9: {
                    var4 = 0;
                    if (ci.field_d == -1) {
                      break L9;
                    } else {
                      if (257 >= hp.field_D) {
                        break L9;
                      } else {
                        if (-291 > hp.field_D) {
                          L10: {
                            if (nc.field_j <= 9) {
                              break L10;
                            } else {
                              if (82 <= nc.field_j) {
                                break L10;
                              } else {
                                ((o) this).field_i = ij.field_P;
                                ((o) this).field_f = false;
                                var4 = 1;
                                break L10;
                              }
                            }
                          }
                          if (nc.field_j <= 558) {
                            break L9;
                          } else {
                            if (631 > nc.field_j) {
                              ((o) this).field_i = ij.field_P;
                              ((o) this).field_f = true;
                              var4 = 1;
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
                  }
                  if (var4 != 0) {
                    break L8;
                  } else {
                    if (ij.field_I >= ((o) this).field_i) {
                      break L8;
                    } else {
                      if (hp.field_D <= 257) {
                        break L8;
                      } else {
                        if (hp.field_D > -291) {
                          L11: {
                            if (-10 >= ha.field_b) {
                              break L11;
                            } else {
                              if ((ha.field_b ^ -1) > -83) {
                                ((o) this).field_i = ij.field_I;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (558 >= ha.field_b) {
                            break L8;
                          } else {
                            if (ha.field_b < 631) {
                              ((o) this).field_i = ij.field_I;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
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
              if (param0) {
                L12: {
                  ((o) this).field_a.a((byte) -35, this.a(ei.field_K, ha.field_b, 125), this.a(hp.field_D, nc.field_j, 126));
                  var4 = 0;
                  if (!((o) this).field_a.d(-125)) {
                    break L12;
                  } else {
                    L13: {
                      if (0 != ((o) this).field_a.field_d) {
                        break L13;
                      } else {
                        var4 = 1;
                        break L13;
                      }
                    }
                    if (1 != ((o) this).field_a.field_d) {
                      break L12;
                    } else {
                      return 2;
                    }
                  }
                }
                L14: {
                  if (bd.field_r) {
                    L15: while (true) {
                      if (!on.b(param1 + -146)) {
                        break L14;
                      } else {
                        var5 = ((o) this).b(param1 + 3525);
                        if (var5 != 0) {
                          return var5;
                        } else {
                          continue L15;
                        }
                      }
                    }
                  } else {
                    break L14;
                  }
                }
                if (var4 != 0) {
                  this.c(1);
                  return 3;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              ((o) this).field_o = ((o) this).field_o + 1;
              ((o) this).field_q = ((o) this).field_q - ij.field_E;
              continue L0;
            }
          }
        } else {
          return 122;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, rb param5, int[] param6, String param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = ZombieDawn.field_J;
        hk.i(1584);
        if (param0 != -1) {
            ((o) this).field_p = null;
        }
        for (var9 = param1; var9 < param4; var9++) {
            bi.f(param3, var9, param2, var9 + 1);
            var10 = var9 * param6.length / param4;
            var11 = param6[param6.length + (-var10 + -1)];
            int discarded$0 = param5.a(param7, param3, param1, param2, param4, var11, -1, 1, 1, 0);
        }
        pa.a(-21189);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "??????";
    }
}
