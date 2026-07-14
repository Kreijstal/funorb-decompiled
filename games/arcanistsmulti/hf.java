/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static kc field_f;
    static String field_m;
    static qb field_o;
    private int field_p;
    private String field_j;
    private int field_n;
    private qb field_k;
    static kc field_q;
    static int field_r;
    private int field_l;
    static String field_b;
    private int field_c;
    private int field_u;
    private boolean field_h;
    static kc field_t;
    private String[] field_a;
    private qb field_e;
    private int field_s;
    private qb field_g;
    private ll[] field_i;
    private so field_d;

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            hf.a(91, (int[]) null, -18, -89, -119, 34, 118);
        }
        field_m = null;
        field_o = null;
        field_t = null;
        field_b = null;
        field_f = null;
        field_q = null;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6) {
        wl.field_L[param3] = param1;
        lm.field_e[param3] = param6;
        eo.field_b[param3] = param5;
        if (param2 != 0) {
            Object var8 = null;
            int discarded$0 = hf.a((String[]) null, (String) null, -76, (dj) null, 57);
        }
        tg.field_f[param3] = param4;
        sc.field_U[param3] = param0;
    }

    private final int a(byte param0) {
        if (param0 >= -61) {
            ((hf) this).field_i = null;
        }
        ((hf) this).field_d.a((byte) -76);
        if (!(!((hf) this).field_d.b(true))) {
            if (!(-1 != (((hf) this).field_d.field_h ^ -1))) {
                this.a(127);
                return 3;
            }
            if (((hf) this).field_d.field_h == 1) {
                return 1;
            }
        }
        if (vn.field_d == 13) {
            return 1;
        }
        return 0;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2_ref_char__ = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 <= 0) {
            break L0;
          } else {
            if (param0 < 128) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 < 160) {
            break L1;
          } else {
            if (param0 > 255) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          if (param0 != 0) {
            var6 = oc.field_a;
            var2_ref_char__ = var6;
            var3 = 0;
            L3: while (true) {
              if (var3 >= var6.length) {
                break L2;
              } else {
                var4 = var6[var3];
                if (var4 != param0) {
                  var3++;
                  continue L3;
                } else {
                  return true;
                }
              }
            }
          } else {
            break L2;
          }
        }
        var2 = -85 / ((21 - param1) / 39);
        return false;
    }

    final static void c(int param0) {
        wh.field_g = false;
        ld.field_p = -1 == (df.field_z.e((byte) 88) ^ -1) ? true : false;
        if (param0 < 15) {
            hf.a(true);
        }
    }

    private final void a(int param0, int param1, int param2, dj param3, String param4, int param5, int[] param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = ArcanistsMulti.field_G ? 1 : 0;
        ec.a(65280);
        for (var9 = param7; var9 < param0; var9++) {
            de.h(param2, var9, param1, 1 + var9);
            var10 = var9 * param6.length / param0;
            var11 = param6[-var10 + param6.length + -1];
            int discarded$0 = param3.a(param4, param2, param7, param1, param0, var11, -1, 1, 1, 0);
        }
        oo.c(-15405);
        if (param5 != 23146) {
            ((hf) this).field_u = 61;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        de.c(9, 9, 622, 47, 4540749, 65793);
        de.d(9, 257, 622, 33, 2585);
        de.c(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            var3 = 299;
            L1: while (true) {
              if (var2 >= 2) {
                L2: {
                  this.c((byte) -101);
                  if (null == an.field_o) {
                    break L2;
                  } else {
                    if (!an.field_o.c(-10923)) {
                      break L2;
                    } else {
                      if (!an.field_o.a("members_expansion_screen", -24417)) {
                        break L2;
                      } else {
                        if (!an.field_o.a("arialish12", -24417)) {
                          break L2;
                        } else {
                          if (!an.field_o.a("pump32", -24417)) {
                            break L2;
                          } else {
                            if (bb.field_a == null) {
                              break L2;
                            } else {
                              if (!bb.field_a.c(-10923)) {
                                break L2;
                              } else {
                                if (!bb.field_a.a("arialish12", -24417)) {
                                  break L2;
                                } else {
                                  if (!bb.field_a.a("pump32", -24417)) {
                                    break L2;
                                  } else {
                                    be.field_j = af.a("frame", "members_expansion_screen", 19412, an.field_o);
                                    cg.field_Ib = fj.a("members_expansion_screen", -22612, an.field_o, "arrow");
                                    li.field_F = rc.a(bb.field_a, -24755, "arialish12", "", an.field_o);
                                    fd.field_b = rm.a("", bb.field_a, "pump32", -119, an.field_o);
                                    fd.field_f = cg.a("benefit_orbs", (byte) 113, an.field_o, "members_expansion_screen");
                                    qf.field_b = cg.a("button_text", (byte) 116, an.field_o, "members_expansion_screen");
                                    ji.field_c = nl.a((byte) 31, an.field_o, "button_highlights", "members_expansion_screen");
                                    an.field_o = null;
                                    bb.field_a = null;
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
                this.b(16180917);
                if (null != be.field_j) {
                  L3: {
                    ((hf) this).field_e.c(376, 339);
                    ((hf) this).field_k.c(9, 9);
                    be.field_j.a(0, 0);
                    if (cg.field_Ib == null) {
                      break L3;
                    } else {
                      cg.field_Ib.c(9, 257);
                      cg.field_Ib.e(558, 257);
                      if (-258 <= (me.field_I ^ -1)) {
                        break L3;
                      } else {
                        if (290 > me.field_I) {
                          var2 = 40 + (40 * hg.a(((hf) this).field_p << 1415725956, -52) >> -544527184);
                          if (-1 > var2) {
                            L4: {
                              if (-10 >= an.field_g) {
                                break L4;
                              } else {
                                if (an.field_g >= 82) {
                                  break L4;
                                } else {
                                  cg.field_Ib.b(8, 256, var2);
                                  cg.field_Ib.b(10, 256, var2);
                                  cg.field_Ib.b(8, 258, var2);
                                  cg.field_Ib.b(10, 258, var2);
                                  break L3;
                                }
                              }
                            }
                            if (an.field_g <= 558) {
                              break L3;
                            } else {
                              if (631 > an.field_g) {
                                cg.field_Ib.d();
                                cg.field_Ib.b(557, 256, var2);
                                cg.field_Ib.b(559, 256, var2);
                                cg.field_Ib.b(557, 258, var2);
                                cg.field_Ib.b(559, 258, var2);
                                cg.field_Ib.d();
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    var2 = 89 % ((-46 - param0) / 43);
                    ((hf) this).field_g.c(16, 302);
                    int discarded$4 = li.field_F.a(((hf) this).field_a[((hf) this).field_l], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                    fd.field_f.c(30, 330);
                    int discarded$5 = li.field_F.a(nf.field_qb[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    int discarded$6 = li.field_F.a(nf.field_qb[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    int discarded$7 = li.field_F.a(nf.field_qb[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    qf.field_b.c(508 + (127 - qf.field_b.field_n) / 2, 315);
                    if (0 != ((hf) this).field_d.field_h) {
                      if ((((hf) this).field_d.field_h ^ -1) == -2) {
                        ji.field_c[1].c(508, 387);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      ji.field_c[0].c(508, 299);
                      break L5;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                de.c(508, var3, 127, 42, 1130115, 3365268);
                de.d(508, 42 + var3, 127, 42, 12410);
                var3 += 91;
                var2++;
                continue L1;
              }
            }
          } else {
            de.c(var3, 331, 117, 90, 460551, 3881787);
            var2++;
            var3 += 121;
            continue L0;
          }
        }
    }

    final static String a(String param0, String param1, int param2, int param3) {
        CharSequence var8 = (CharSequence) (Object) param0;
        if (!vn.a(var8, 0)) {
            return fn.field_h;
        }
        if ((jb.field_t ^ -1) != -3) {
            return rk.field_L;
        }
        wa var7 = mf.a(-1, param1);
        if (!(var7 != null)) {
            return tj.a(param3 ^ 10068676, new String[1], k.field_f);
        }
        var7.a(true);
        var7.a((byte) 88);
        pc.field_b = pc.field_b - 1;
        ab var5 = he.field_e;
        var5.b((byte) -50, param2);
        var5.field_g = var5.field_g + 1;
        int var6 = var5.field_g;
        var5.f(3, (byte) -99);
        if (param3 != 10068666) {
            field_t = null;
        }
        var5.a(param0, 23333);
        var5.b(-var6 + var5.field_g, (byte) 43);
        return null;
    }

    private final void a(int param0) {
        if (param0 != 127) {
            return;
        }
        try {
            ko.a(cd.e(124), (byte) -108);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private final void a(ll[] param0, int param1, String param2, java.applet.Applet param3, boolean param4, String[] param5) {
        String var7 = null;
        L0: {
          L1: {
            var7 = param3.getParameter("currency");
            if (var7 == null) {
              break L1;
            } else {
              if (fi.a((CharSequence) (Object) var7, 10)) {
                ((hf) this).field_u = dc.a((CharSequence) (Object) var7, 126);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((hf) this).field_u = 2;
          break L0;
        }
        L2: {
          ((hf) this).field_j = param2;
          ((hf) this).field_d = new so(2);
          ((hf) this).field_i = param0;
          ((hf) this).field_a = param5;
          if (param1 < -99) {
            break L2;
          } else {
            ((hf) this).field_h = false;
            break L2;
          }
        }
        L3: {
          if (null == ((hf) this).field_i) {
            break L3;
          } else {
            if (3 > ((hf) this).field_i.length) {
              break L3;
            } else {
              v.field_t = param4;
              return;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        qb var5 = null;
        String var6 = null;
        String var7 = null;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        if (((hf) this).field_k != null) {
          return;
        } else {
          if (fd.field_b == null) {
            return;
          } else {
            ((hf) this).field_k = new qb(622, 47);
            fk.a(((hf) this).field_k, -23095);
            de.c(0, 0, 622, 47, 4540749, 65793);
            var2 = 16448250;
            var3 = 10068666;
            var16 = kb.a(var3, var2, param0 ^ 16128330);
            this.a(47, 622, 0, (dj) (Object) fd.field_b, ((hf) this).field_j, 23146, var16, 0);
            oo.c(-15405);
            ((hf) this).field_g = new qb(475, 24);
            this.a(((hf) this).field_g, 0.75f, 0, 127, 24, var16, -4, (dj) (Object) fd.field_b, mm.field_r, 475);
            var17 = kb.a(526344, 526344, 65535);
            var15 = var17;
            var13 = var15;
            var11 = var13;
            var9 = var11;
            var5 = new qb(121, 122);
            fk.a(var5, param0 ^ -16170116);
            de.c(0, 0, var5.field_q, var5.field_y / 2, param0, 16306250);
            de.c(0, var5.field_y / 2, var5.field_q, var5.field_y, 16306250, 15568919);
            var6 = vc.field_l;
            var7 = ph.field_b;
            this.a(var5, 0.5f, 0, 127, var5.field_y, var17, -16, (dj) (Object) fd.field_b, var6, var5.field_q);
            this.a(var5, 0.5f, 0, 127, var5.field_y, var17, 20, (dj) (Object) fd.field_b, var7, var5.field_q);
            this.a(var5, 0.699999988079071f, 0, 127, var5.field_y / 3, var9, 12 + (var5.field_y / 2 + -fd.field_b.field_C), (dj) (Object) fd.field_b, gk.field_f[((hf) this).field_u], var5.field_q);
            oo.c(-15405);
            ((hf) this).field_e = new qb(121, 122);
            fk.a(((hf) this).field_e, param0 + -16204012);
            var5.a(((hf) this).field_e.field_q / 2, ((hf) this).field_e.field_y / 2, -2048, 4096);
            oo.c(param0 + -16196322);
            return;
          }
        }
    }

    private final void a(qb param0, float param1, int param2, int param3, int param4, int[] param5, int param6, dj param7, String param8, int param9) {
        int var11 = (int)((float)param9 / param1);
        int var12 = (int)((float)param4 / param1);
        if (param3 != 127) {
            return;
        }
        qb var13 = new qb(var11, var12);
        fk.a(var13, -23095);
        param0.c((int)((float)(-param2) / param1), (int)((float)(-param6) / param1), (int)((float)param0.field_q / param1), (int)((float)param0.field_y / param1));
        this.a(var12, var11, 0, param7, param8, param3 ^ 23061, param5, 0);
        oo.c(param3 + -15532);
        fk.a(param0, -23095);
        var13.d(param2, param6, param9, param4);
        oo.c(param3 ^ -15444);
    }

    private final void c(byte param0) {
        ll var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ll var6 = null;
        ll var7 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != ((hf) this).field_i) {
          L0: {
            if (param0 == -101) {
              break L0;
            } else {
              int discarded$3 = ((hf) this).a(true, false);
              break L0;
            }
          }
          L1: {
            var6 = ((hf) this).field_i[((hf) this).field_l];
            var2 = var6;
            if (var2 != null) {
              var6.a(9, 58);
              break L1;
            } else {
              if (null != li.field_F) {
                int discarded$4 = li.field_F.a(hn.field_l, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (vf.field_o > ((hf) this).field_s) {
              var7 = ((hf) this).field_i[((hf) this).field_n];
              var2 = var7;
              if (var2 != null) {
                var3 = (60 + var7.field_g) * ((hf) this).field_s / vf.field_o;
                var4 = var3 - 30;
                if (!((hf) this).field_h) {
                  td.a(-256 * var4 / 30, (byte) -115, (-var4 + var7.field_g) * 256 / 30, var7, 9, 58);
                  break L2;
                } else {
                  td.a(256 * (-var4 + var7.field_g) / 30, (byte) 70, var4 * -256 / 30, var7, 9, 58);
                  break L2;
                }
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (li.field_F != null) {
              int discarded$5 = li.field_F.a(hn.field_l, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        ((hf) this).field_c = ((hf) this).field_c + 65536;
        if (param1) {
          L0: while (true) {
            if (65536 > gh.a(vf.field_q, (byte) 96, ((hf) this).field_c)) {
              L1: {
                var3 = -1;
                if (((hf) this).field_i == null) {
                  break L1;
                } else {
                  var3 = ((hf) this).field_i.length;
                  break L1;
                }
              }
              L2: {
                if (-1 == var3) {
                  break L2;
                } else {
                  L3: {
                    if (((hf) this).field_s < vf.field_m) {
                      ((hf) this).field_s = ((hf) this).field_s + 1;
                      if (((hf) this).field_s > vf.field_o) {
                        L4: {
                          if (((hf) this).field_i == null) {
                            break L4;
                          } else {
                            if (((hf) this).field_i[((hf) this).field_l] == null) {
                              break L4;
                            } else {
                              if (((hf) this).field_s < vf.field_m) {
                                break L3;
                              } else {
                                if (((hf) this).field_i[(((hf) this).field_l - -1) % var3] != null) {
                                  break L3;
                                } else {
                                  ((hf) this).field_s = ((hf) this).field_s - 1;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        ((hf) this).field_s = ((hf) this).field_s - 1;
                        break L3;
                      } else {
                        if (((hf) this).field_s < vf.field_m) {
                          break L3;
                        } else {
                          if (((hf) this).field_i[(((hf) this).field_l - -1) % var3] != null) {
                            break L3;
                          } else {
                            ((hf) this).field_s = ((hf) this).field_s - 1;
                            break L3;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (vf.field_m <= ((hf) this).field_s) {
                      L6: {
                        ((hf) this).field_n = ((hf) this).field_l;
                        if (!((hf) this).field_h) {
                          ((hf) this).field_l = ((hf) this).field_l - 1;
                          if ((((hf) this).field_l ^ -1) <= -1) {
                            break L6;
                          } else {
                            ((hf) this).field_l = ((hf) this).field_l + var3;
                            break L6;
                          }
                        } else {
                          ((hf) this).field_l = ((hf) this).field_l + 1;
                          if (var3 > ((hf) this).field_l) {
                            break L6;
                          } else {
                            ((hf) this).field_l = ((hf) this).field_l - var3;
                            break L6;
                          }
                        }
                      }
                      ((hf) this).field_s = ((hf) this).field_s - vf.field_m;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (((hf) this).field_s <= vf.field_o) {
                    break L2;
                  } else {
                    ((hf) this).field_h = true;
                    break L2;
                  }
                }
              }
              L7: {
                if (cg.field_Ib != null) {
                  L8: {
                    var4 = 0;
                    if (re.field_r == 0) {
                      break L8;
                    } else {
                      if (-258 <= (ja.field_s ^ -1)) {
                        break L8;
                      } else {
                        if (290 > ja.field_s) {
                          L9: {
                            if ((pb.field_h ^ -1) >= -10) {
                              break L9;
                            } else {
                              if (82 > pb.field_h) {
                                var4 = 1;
                                ((hf) this).field_h = false;
                                ((hf) this).field_s = vf.field_m;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (558 >= pb.field_h) {
                            break L8;
                          } else {
                            if (-632 < (pb.field_h ^ -1)) {
                              ((hf) this).field_h = true;
                              ((hf) this).field_s = vf.field_m;
                              var4 = 1;
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
                  if (var4 != 0) {
                    break L7;
                  } else {
                    if (vf.field_o >= ((hf) this).field_s) {
                      break L7;
                    } else {
                      if (-258 <= ja.field_s) {
                        break L7;
                      } else {
                        if (-291 > ja.field_s) {
                          if (an.field_g <= 9) {
                            if (558 < an.field_g) {
                              if (an.field_g >= 631) {
                                break L7;
                              } else {
                                ((hf) this).field_s = vf.field_o;
                                break L7;
                              }
                            } else {
                              if (558 >= an.field_g) {
                                break L7;
                              } else {
                                if (an.field_g >= 631) {
                                  break L7;
                                } else {
                                  ((hf) this).field_s = vf.field_o;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            if (558 >= an.field_g) {
                              break L7;
                            } else {
                              if (an.field_g >= 631) {
                                break L7;
                              } else {
                                ((hf) this).field_s = vf.field_o;
                                break L7;
                              }
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              L10: {
                if (!param0) {
                  break L10;
                } else {
                  L11: {
                    ((hf) this).field_d.a(this.a(an.field_g, 112, me.field_I), this.a(pb.field_h, 76, ja.field_s), -97);
                    var4 = 0;
                    if (!((hf) this).field_d.b(true)) {
                      break L11;
                    } else {
                      L12: {
                        if (((hf) this).field_d.field_h != 0) {
                          break L12;
                        } else {
                          var4 = 1;
                          break L12;
                        }
                      }
                      if (((hf) this).field_d.field_h != 1) {
                        break L11;
                      } else {
                        return 2;
                      }
                    }
                  }
                  L13: {
                    if (!v.field_t) {
                      break L13;
                    } else {
                      L14: while (true) {
                        if (!ib.b(false)) {
                          break L13;
                        } else {
                          var5 = this.a((byte) -73);
                          if (0 == var5) {
                            continue L14;
                          } else {
                            return var5;
                          }
                        }
                      }
                    }
                  }
                  if (var4 == 0) {
                    break L10;
                  } else {
                    this.a(127);
                    return 3;
                  }
                }
              }
              return 0;
            } else {
              ((hf) this).field_p = ((hf) this).field_p + 1;
              ((hf) this).field_c = ((hf) this).field_c - vf.field_q;
              continue L0;
            }
          }
        } else {
          return -60;
        }
    }

    private final int a(int param0, int param1, int param2) {
        if (!(be.field_j != null)) {
            return -1;
        }
        if (param1 <= 72) {
            ((hf) this).field_j = null;
        }
        if (-509 >= (param0 ^ -1)) {
            if (635 > param0) {
                if (param2 <= -300) {
                    if (386 > param2) {
                        return 0;
                    }
                }
            }
        }
        if (-509 <= param0) {
            if ((param0 ^ -1) > -636) {
                if ((param2 ^ -1) <= -391) {
                    if (param2 < 475) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    final static int a(String[] args, String param1, int param2, dj param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = ArcanistsMulti.field_G ? 1 : 0;
          var5 = param3.b(param1);
          if (param4 == 21230) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          if (param2 < var5) {
            break L1;
          } else {
            if ((param1.indexOf("<br>") ^ -1) != 0) {
              break L1;
            } else {
              args[0] = (String) (Object) args;
              return 1;
            }
          }
        }
        var6 = (param2 + var5 - 1) / param2;
        param2 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param1.length();
        var9 = 0;
        L2: while (true) {
          if (var8 <= var9) {
            L3: {
              if (var7 >= var8) {
                break L3;
              } else {
                var6++;
                args[var6] = param1.substring(var7, var8).trim();
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param1.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 != 45) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11 = param1.substring(var7, 1 + var9).trim();
              var12 = param3.b(var11);
              if (param2 <= var12) {
                var7 = 1 + var9;
                var6++;
                args[var6] = var11;
                break L4;
              } else {
                break L4;
              }
            }
            if (var10 == 62) {
              if (param1.regionMatches(var9 + -3, "<br>", 0, 4)) {
                var6++;
                args[var6] = param1.substring(var7, var9 - 3).trim();
                var7 = var9 - -1;
                var9++;
                continue L2;
              } else {
                var9++;
                continue L2;
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
    }

    hf(java.applet.Applet param0, String param1, ll[] param2, String[] param3) {
        ((hf) this).field_p = 0;
        ((hf) this).field_c = 0;
        ((hf) this).field_h = true;
        this.a(param2, -126, param1, param0, true, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_b = "Offering rematch";
    }
}
