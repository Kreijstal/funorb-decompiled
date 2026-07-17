/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.awt.Canvas;
import java.io.PrintStream;

public final class Lexicominos extends nk {
    static db field_I;
    static String field_H;
    private boolean field_K;
    static boolean field_M;
    static int field_G;
    static boolean field_E;
    static String field_F;
    private int field_J;
    public static boolean field_L;

    private final boolean a(byte param0, boolean param1) {
        int var3_int = 0;
        db[] var3 = null;
        eb[] var3_array = null;
        ke var3_ref = null;
        int var4 = 0;
        ke var4_ref_ke = null;
        int var5_int = 0;
        eb[] var5 = null;
        db var6_ref_db = null;
        int var6 = 0;
        int var7_int = 0;
        db var7 = null;
        int[] var7_array = null;
        db[] var7_array2 = null;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int[] var9 = null;
        int var9_int = 0;
        int var10_int = 0;
        int[] var10 = null;
        int var11_int = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = field_L ? 1 : 0;
        if (kc.field_m[0] != null) {
          if (ec.field_b == null) {
            L0: {
              if (null == th.field_p) {
                break L0;
              } else {
                ob.field_e = df.a("basic", "orbcoin", th.field_p, (byte) -70);
                e.field_u = df.a("basic", "unachieved", th.field_p, (byte) -41);
                bi.field_a = hb.a(gg.field_d, 246, "roman20", "", th.field_p);
                mk.field_h = hb.a(gg.field_d, 246, "roman12", "", th.field_p);
                tb.field_a = hb.a(dl.field_d, "scorefont", "", ci.field_e, -2569);
                jh.field_d = hb.a(ci.field_e, 246, "", "lexfont", dl.field_d);
                th.field_p = null;
                gg.field_d = null;
                break L0;
              }
            }
            if (jj.field_f != null) {
              if (param0 == -86) {
                L1: {
                  if (hh.field_L == null) {
                    break L1;
                  } else {
                    al.a(16, qa.field_b, 93.0f);
                    ((Lexicominos) this).d(param0 + 18466);
                    ib.field_a = ig.a(hh.field_L.a((byte) 127, "introanim.acp", ""), -66);
                    hh.field_L = null;
                    break L1;
                  }
                }
                if (ci.field_a != null) {
                  L2: {
                    al.a(16, we.field_j, 99.0f);
                    ((Lexicominos) this).d(param0 ^ -18330);
                    if (id.field_w != null) {
                      break L2;
                    } else {
                      var3_array = ed.a(ci.field_a, true);
                      var4 = 0;
                      var5_int = 0;
                      L3: while (true) {
                        if (~var3_array.length >= ~var5_int) {
                          int incrementValue$5 = var4;
                          var4--;
                          var5 = new eb[incrementValue$5];
                          var6 = var3_array.length + -1;
                          L4: while (true) {
                            if (var6 < 0) {
                              id.field_w = new oj[var5.length];
                              var6 = 0;
                              L5: while (true) {
                                if (id.field_w.length <= var6) {
                                  break L2;
                                } else {
                                  L6: {
                                    id.field_w[var6] = new oj(dl.field_d, ci.field_e, var5[var6]);
                                    if (!ug.field_s.equals((Object) (Object) id.field_w[var6].field_k)) {
                                      break L6;
                                    } else {
                                      rg.field_b = var6;
                                      break L6;
                                    }
                                  }
                                  var6++;
                                  continue L5;
                                }
                              }
                            } else {
                              L7: {
                                if (var3_array[var6] == null) {
                                  break L7;
                                } else {
                                  int incrementValue$6 = var4;
                                  var4--;
                                  var5[incrementValue$6] = var3_array[var6];
                                  break L7;
                                }
                              }
                              var6--;
                              continue L4;
                            }
                          }
                        } else {
                          L8: {
                            if (var3_array[var5_int] != null) {
                              var4++;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var5_int++;
                          continue L3;
                        }
                      }
                    }
                  }
                  dl.field_d = null;
                  ci.field_a = null;
                  ci.field_e = null;
                  dl.b(5);
                  return false;
                } else {
                  if (qc.field_d == null) {
                    qc.field_d = el.a(0, ia.field_H);
                    v.field_B.b(1);
                    dl.b(5);
                    return false;
                  } else {
                    if (null != ne.field_b) {
                      var3_int = 0;
                      L9: while (true) {
                        if (var3_int >= 15) {
                          th.field_r = 0;
                          ed.field_v = 90;
                          cg.field_j = -1;
                          aa.field_j = -2;
                          return true;
                        } else {
                          vg.field_d[var3_int] = new sg((Lexicominos) this, var3_int);
                          var3_int++;
                          continue L9;
                        }
                      }
                    } else {
                      ne.field_b = el.a(0, lg.field_c);
                      v.field_B.b(1);
                      dl.b(param0 ^ -81);
                      return false;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              al.a(param0 ^ -70, gf.field_q, 92.0f);
              ((Lexicominos) this).d(18380);
              cb.field_n = df.a("", "bookbg", dl.field_d, (byte) -69);
              pa.field_a = df.a("", "leftpage", dl.field_d, (byte) -83);
              va.field_m = df.a("", "rightpage", dl.field_d, (byte) -64);
              var3 = td.a("", "frame", dl.field_d, 22306);
              var4 = 150;
              var5_int = 100;
              var6_ref_db = new db(var4, var5_int);
              var6_ref_db.b();
              va.field_m.b(-104, -198);
              var3[4] = new db(var4 << 1, var5_int << 1);
              var3[4].b();
              var6_ref_db.b(0, 0);
              var6_ref_db.g(var4, 0);
              var6_ref_db.d();
              var6_ref_db.b(0, var5_int);
              var6_ref_db.g(var4, var5_int);
              nh.field_c = new db[9];
              qb.field_o = new db[9];
              var7_int = 0;
              L10: while (true) {
                if (var7_int >= 9) {
                  var3 = td.a("", "frame2", dl.field_d, param0 + 22392);
                  jh.field_b = new db[9];
                  var7_int = 0;
                  L11: while (true) {
                    if (var7_int >= 9) {
                      ef.field_d = td.a("", "achievements_lrg", dl.field_d, 22306);
                      var7 = df.a("", "glass_case", dl.field_d, (byte) -54);
                      var7.e();
                      var8_ref_int__ = var7.field_y;
                      ef.field_d[10].e();
                      var9 = ef.field_d[10].field_y;
                      var10_int = 0;
                      L12: while (true) {
                        if (var10_int >= 16384) {
                          ef.field_d[10].f();
                          var7_int = 0;
                          L13: while (true) {
                            if (ef.field_d.length <= var7_int) {
                              ee.a((byte) -102, e.field_u);
                              fc.field_e = new db[ef.field_d.length];
                              md.field_A = new db[ef.field_d.length];
                              var7_int = 0;
                              L14: while (true) {
                                if (var7_int >= fc.field_e.length) {
                                  ri.field_b = this.a(param0 ^ -62, e.field_u);
                                  fl.field_c = ri.field_b.c();
                                  var7_array = fl.field_c.field_y;
                                  var8 = -1 + var7_array.length;
                                  L15: while (true) {
                                    if (var8 < 0) {
                                      fg.field_e = new db[ef.field_d.length];
                                      var7_int = 0;
                                      L16: while (true) {
                                        if (~var7_int <= ~fg.field_e.length) {
                                          v.field_B.b(1);
                                          ia.field_H = df.a("", "letterBkgnd", dl.field_d, (byte) -47);
                                          lg.field_c = df.a("", "letterBkgndGrey", dl.field_d, (byte) -56);
                                          jj.field_f = td.a("", "highlight", dl.field_d, 22306);
                                          th.field_l = td.a("", "multipliers", dl.field_d, 22306);
                                          ob.field_d = df.a("", "ingameleft", dl.field_d, (byte) -108);
                                          kf.field_A = td.a("", "ingameright", dl.field_d, 22306);
                                          wc.field_c = td.a("", "deleasy", dl.field_d, 22306);
                                          ij.field_n[0] = df.a("", "mmleft", dl.field_d, (byte) -53);
                                          ij.field_n[2] = df.a("", "pauseleft", dl.field_d, (byte) -97);
                                          ij.field_n[14] = ij.field_n[2];
                                          ij.field_n[1] = df.a("", "hsleft", dl.field_d, (byte) -117);
                                          db dupTemp$7 = df.a("", "instleft", dl.field_d, (byte) -104);
                                          ij.field_n[3] = dupTemp$7;
                                          ij.field_n[12] = dupTemp$7;
                                          ij.field_n[5] = df.a("", "achleft", dl.field_d, (byte) -91);
                                          ij.field_n[7] = df.a("", "achgameleft", dl.field_d, (byte) -93);
                                          ij.field_n[6] = ij.field_n[0];
                                          db dupTemp$8 = df.a("", "instright", dl.field_d, (byte) -40);
                                          na.field_a[3] = dupTemp$8;
                                          na.field_a[12] = dupTemp$8;
                                          var7_array2 = td.a("", "mmoutlined", dl.field_d, 22306);
                                          gg.field_a = new db[var7_array2.length];
                                          ej.field_b = new db[var7_array2.length];
                                          var8 = 0;
                                          L17: while (true) {
                                            if (~var8 <= ~var7_array2.length) {
                                              var7_array2 = td.a("", "hsmodeconcise", dl.field_d, 22306);
                                              hi.field_b = new db[var7_array2.length];
                                              dc.field_z = new db[var7_array2.length];
                                              var8 = 0;
                                              L18: while (true) {
                                                if (~var7_array2.length >= ~var8) {
                                                  jf.field_N = df.a("", "slider", dl.field_d, (byte) -121);
                                                  ia.field_G = df.a("", "cursors", dl.field_d, (byte) -43);
                                                  dl.b(5);
                                                  return false;
                                                } else {
                                                  hi.field_b[var8] = var7_array2[var8].c();
                                                  dc.field_z[var8] = var7_array2[var8].c();
                                                  var9 = var7_array2[var8].field_y;
                                                  var10 = hi.field_b[var8].field_y;
                                                  var11 = dc.field_z[var8].field_y;
                                                  var12 = var9.length - 1;
                                                  L19: while (true) {
                                                    if (var12 < 0) {
                                                      hi.field_b[var8].f();
                                                      var8++;
                                                      continue L18;
                                                    } else {
                                                      L20: {
                                                        if (var9[var12] != 16777215) {
                                                          var11[var12] = 0;
                                                          break L20;
                                                        } else {
                                                          var10[var12] = 0;
                                                          break L20;
                                                        }
                                                      }
                                                      var12--;
                                                      continue L19;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              gg.field_a[var8] = var7_array2[var8].c();
                                              ej.field_b[var8] = var7_array2[var8].c();
                                              var9 = var7_array2[var8].field_y;
                                              var10 = gg.field_a[var8].field_y;
                                              var11 = ej.field_b[var8].field_y;
                                              var12 = -1 + var9.length;
                                              L21: while (true) {
                                                if (var12 < 0) {
                                                  gg.field_a[var8].f();
                                                  var8++;
                                                  continue L17;
                                                } else {
                                                  L22: {
                                                    if (var9[var12] != 16777215) {
                                                      var11[var12] = 0;
                                                      break L22;
                                                    } else {
                                                      var10[var12] = 0;
                                                      break L22;
                                                    }
                                                  }
                                                  var12--;
                                                  continue L21;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          fg.field_e[var7_int] = new db(32, 32);
                                          fg.field_e[var7_int].b();
                                          ef.field_d[var7_int].b(0, 0, 32, 32);
                                          fg.field_e[var7_int].f();
                                          var7_int++;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      L23: {
                                        if (var7_array[var8] != 16777215) {
                                          break L23;
                                        } else {
                                          var7_array[var8] = 9639960;
                                          break L23;
                                        }
                                      }
                                      var8--;
                                      continue L15;
                                    }
                                  }
                                } else {
                                  fc.field_e[var7_int] = this.a(-128, ef.field_d[var7_int]);
                                  md.field_A[var7_int] = fc.field_e[var7_int].c();
                                  var8_ref_int__ = md.field_A[var7_int].field_y;
                                  var9_int = var8_ref_int__.length + -1;
                                  L24: while (true) {
                                    if (0 > var9_int) {
                                      var7_int++;
                                      continue L14;
                                    } else {
                                      L25: {
                                        if (var8_ref_int__[var9_int] == 16777215) {
                                          var8_ref_int__[var9_int] = 9639960;
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var9_int--;
                                      continue L24;
                                    }
                                  }
                                }
                              }
                            } else {
                              ee.a((byte) -102, ef.field_d[var7_int]);
                              var7_int++;
                              continue L13;
                            }
                          }
                        } else {
                          L26: {
                            var11_int = var8_ref_int__[var10_int];
                            if (0 == var11_int) {
                              break L26;
                            } else {
                              var12 = var11_int >> 3 & 31 | var11_int >> 6 & 1020;
                              var13 = 256 + -var12;
                              var14 = var9[var10_int];
                              var15 = var14 & 16711935;
                              var16 = 65280 & var14;
                              var9[var10_int] = tb.a(vg.a(var13 * var15 + var12 * 16711935 >> 8, 16711935), vg.a(65280, var13 * var16 + var12 * 65280 >> 8));
                              break L26;
                            }
                          }
                          var10_int++;
                          continue L12;
                        }
                      }
                    } else {
                      L27: {
                        if (var7_int != 4) {
                          jh.field_b[var7_int] = new db(var3[var7_int].field_p, var3[var7_int].field_u);
                          jh.field_b[var7_int].b();
                          var3[var7_int].e(0, 0, 13343019);
                          break L27;
                        } else {
                          jh.field_b[var7_int] = null;
                          break L27;
                        }
                      }
                      var7_int++;
                      continue L11;
                    }
                  }
                } else {
                  L28: {
                    if (var7_int != 4) {
                      qb.field_o[var7_int] = new db(var3[var7_int].field_p, var3[var7_int].field_u);
                      qb.field_o[var7_int].b();
                      var3[var7_int].e(0, 0, 11345438);
                      nh.field_c[var7_int] = new db(var3[var7_int].field_p, var3[var7_int].field_u);
                      nh.field_c[var7_int].b();
                      var3[var7_int].e(0, 0, 13343019);
                      break L28;
                    } else {
                      qb.field_o[var7_int] = var3[var7_int];
                      nh.field_c[var7_int] = null;
                      break L28;
                    }
                  }
                  var7_int++;
                  continue L10;
                }
              }
            }
          } else {
            al.a(16, pl.field_b, 91.0f);
            ((Lexicominos) this).d(param0 + 18466);
            hc.field_gb = null;
            gl.field_a = null;
            aa.field_i[0] = ih.a(ec.field_b, "", "game");
            aa.field_i[1] = ih.a(ec.field_b, "", "game2");
            aa.field_i[2] = ih.a(ec.field_b, "", "game3");
            aa.field_i[3] = ih.a(ec.field_b, "", "game4");
            aa.field_i[4] = ih.a(ec.field_b, "", "game5");
            aa.field_i[5] = ih.a(ec.field_b, "", "panic");
            aa.field_i[6] = ih.a(ec.field_b, "", "titlescreen");
            aa.field_i[7] = ih.a(ec.field_b, "", "gameover");
            var3_int = 0;
            L29: while (true) {
              if (aa.field_i.length <= var3_int) {
                uh.field_n.field_A.c(-94);
                ga.field_a = null;
                vb.field_r = null;
                ec.field_b = null;
                dl.b(5);
                return false;
              } else {
                L30: {
                  if (aa.field_i[var3_int] == null) {
                    break L30;
                  } else {
                    boolean discarded$9 = uh.field_n.field_A.a(0, aa.field_i[var3_int], (byte) 102, vb.field_r, ga.field_a);
                    break L30;
                  }
                }
                var3_int++;
                continue L29;
              }
            }
          }
        } else {
          L31: {
            if (!th.field_p.c(-61)) {
              break L31;
            } else {
              if (th.field_p.a("basic", 10762)) {
                if (!th.field_p.a("roman20", param0 + 10848)) {
                  al.a(16, rh.a(th.field_p, (byte) 68, "roman20", v.field_t, li.field_P), 0.0f);
                  return false;
                } else {
                  if (!th.field_p.a("roman12", 10762)) {
                    al.a(16, rh.a(th.field_p, (byte) 94, "roman12", v.field_t, li.field_P), 0.0f);
                    return false;
                  } else {
                    L32: {
                      if (!gg.field_d.c(106)) {
                        break L32;
                      } else {
                        if (!gg.field_d.a("roman20", 10762)) {
                          break L32;
                        } else {
                          if (gg.field_d.a("roman12", param0 ^ -10848)) {
                            L33: {
                              if (!gl.field_a.c(81)) {
                                break L33;
                              } else {
                                if (gl.field_a.a((byte) -124)) {
                                  L34: {
                                    if (!hc.field_gb.c(79)) {
                                      break L34;
                                    } else {
                                      if (!hc.field_gb.a((byte) 120)) {
                                        break L34;
                                      } else {
                                        L35: {
                                          if (!ga.field_a.c(-114)) {
                                            break L35;
                                          } else {
                                            if (!ga.field_a.a((byte) -118)) {
                                              break L35;
                                            } else {
                                              L36: {
                                                if (!ec.field_b.c(113)) {
                                                  break L36;
                                                } else {
                                                  if (!ec.field_b.a((byte) 70)) {
                                                    break L36;
                                                  } else {
                                                    L37: {
                                                      if (!dl.field_d.c(87)) {
                                                        break L37;
                                                      } else {
                                                        if (!dl.field_d.a((byte) -118)) {
                                                          break L37;
                                                        } else {
                                                          L38: {
                                                            if (!ci.field_e.c(param0 ^ -5)) {
                                                              break L38;
                                                            } else {
                                                              if (ci.field_e.a((byte) 55)) {
                                                                L39: {
                                                                  if (!hh.field_L.c(99)) {
                                                                    break L39;
                                                                  } else {
                                                                    if (!hh.field_L.a((byte) -127)) {
                                                                      break L39;
                                                                    } else {
                                                                      L40: {
                                                                        if (!ci.field_a.c(118)) {
                                                                          break L40;
                                                                        } else {
                                                                          if (ci.field_a.a((byte) 15)) {
                                                                            al.a(param0 + 102, qk.field_b, 90.0f);
                                                                            ((Lexicominos) this).d(18380);
                                                                            if (!param1) {
                                                                              return false;
                                                                            } else {
                                                                              kj.c(true);
                                                                              kc.field_m[0] = sd.a(gl.field_a, "", "turnover_page").c();
                                                                              kc.field_m[1] = sd.a(gl.field_a, "", "drop_book").c();
                                                                              kc.field_m[4] = sd.a(gl.field_a, "", "x2").c();
                                                                              kc.field_m[5] = sd.a(gl.field_a, "", "x3").c();
                                                                              kc.field_m[6] = sd.a(gl.field_a, "", "x4").c();
                                                                              kc.field_m[7] = sd.a(gl.field_a, "", "x5").c();
                                                                              var3_ref = sd.a(gl.field_a, "", "score_increase_loop").c();
                                                                              var4_ref_ke = sd.a(gl.field_a, "", "score_increase_stop").c();
                                                                              kc.field_m[2] = aj.a((byte) -42, var4_ref_ke, var3_ref);
                                                                              th.field_o[2] = cc.a(kc.field_m[2], 100, 128);
                                                                              kc.field_m[8] = ba.a(hc.field_gb, "", "lexi_block_stop").a();
                                                                              vb.field_r = new ja(hc.field_gb, gl.field_a);
                                                                              kc.field_m[9] = vb.field_r.a((byte) -80, "drum_075_claves");
                                                                              th.field_o[9] = cc.a(kc.field_m[9], 100, 128);
                                                                              dl.b(5);
                                                                              return false;
                                                                            }
                                                                          } else {
                                                                            break L40;
                                                                          }
                                                                        }
                                                                      }
                                                                      al.a(16, rh.a(ci.field_a, (byte) 97, "index", fg.field_a, sg.field_f), 86.0f);
                                                                      return false;
                                                                    }
                                                                  }
                                                                }
                                                                al.a(16, rh.a(hh.field_L, (byte) 119, "", ia.field_F, ee.field_e), (float)(10 + hh.field_L.b("", (byte) 112) * 76 / 100));
                                                                return false;
                                                              } else {
                                                                break L38;
                                                              }
                                                            }
                                                          }
                                                          al.a(16, rh.a(ci.field_e, (byte) 113, "", v.field_t, li.field_P), 10.0f);
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    al.a(16, rh.a(dl.field_d, (byte) 98, "", pe.field_e, qf.field_s), 9.0f);
                                                    return false;
                                                  }
                                                }
                                              }
                                              al.a(16, rh.a(ec.field_b, (byte) 42, "", ni.field_d, fj.field_y), 6.0f);
                                              return false;
                                            }
                                          }
                                        }
                                        al.a(16, qg.a((byte) 100, ga.field_a, ni.field_d, 0, fj.field_y), 5.0f);
                                        return false;
                                      }
                                    }
                                  }
                                  al.a(param0 + 102, rh.a(hc.field_gb, (byte) 37, "", kj.field_p, e.field_h), 4.0f);
                                  return false;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            al.a(param0 + 102, rh.a(gl.field_a, (byte) 122, "", kj.field_p, e.field_h), 1.0f);
                            return false;
                          } else {
                            al.a(16, rh.a(gg.field_d, (byte) 124, "roman12", v.field_t, li.field_P), 0.0f);
                            return false;
                          }
                        }
                      }
                    }
                    al.a(16, rh.a(gg.field_d, (byte) 37, "roman20", v.field_t, li.field_P), 0.0f);
                    return false;
                  }
                }
              } else {
                break L31;
              }
            }
          }
          al.a(16, rh.a(th.field_p, (byte) 55, "basic", pe.field_e, qf.field_s), 0.0f);
          return false;
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 57) {
                break L1;
              } else {
                Lexicominos.o(111);
                break L1;
              }
            }
            uh.field_D = param0;
            ij.field_p = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "Lexicominos.AB(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, db param1, db param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = lf.field_b;
              var6 = lf.field_f;
              var7 = lf.field_a;
              param2.b();
              pa.field_a.b(0, 0);
              if (param3 < 0) {
                el.field_c.d(param0 ^ 22018);
                break L1;
              } else {
                vg.field_d[param3].d(48);
                break L1;
              }
            }
            L2: {
              param1.b();
              if (param0 == 22110) {
                break L2;
              } else {
                field_G = -106;
                break L2;
              }
            }
            L3: {
              va.field_m.b(0, 0);
              if (0 <= param3) {
                vg.field_d[param3].c(param0 + -22109);
                break L3;
              } else {
                el.field_c.b((byte) 62);
                break L3;
              }
            }
            lf.a(var5, var6, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("Lexicominos.KA(").append(param0).append(44);
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, int[] param1, int param2, int param3, int[] param4, int param5, int[] param6, byte param7, int[] param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        var17 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((Lexicominos) this).field_J != 2) {
                break L1;
              } else {
                if (tj.field_i >= 20) {
                  break L1;
                } else {
                  ((Lexicominos) this).field_J = 1;
                  break L1;
                }
              }
            }
            L2: {
              if (((Lexicominos) this).field_J == 1) {
                L3: {
                  if (tj.field_i >= 12) {
                    break L3;
                  } else {
                    ((Lexicominos) this).field_J = 0;
                    break L3;
                  }
                }
                if (tj.field_i <= 28) {
                  break L2;
                } else {
                  ((Lexicominos) this).field_J = 2;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (0 != ((Lexicominos) this).field_J) {
                break L4;
              } else {
                if (16 < tj.field_i) {
                  ((Lexicominos) this).field_J = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (0 == ((Lexicominos) this).field_J) {
              param5 = 307199;
              L5: while (true) {
                if (0 > param5) {
                  return;
                } else {
                  L6: {
                    var10_int = param6[param5];
                    if (var10_int == -1) {
                      break L6;
                    } else {
                      param3 = 311 * ((2044 & var10_int) >> 2) + (var10_int >> 13 & 511);
                      if (var10_int >= 0) {
                        param4[param5] = param8[param3];
                        break L6;
                      } else {
                        param4[param5] = param1[param3];
                        break L6;
                      }
                    }
                  }
                  param5--;
                  continue L5;
                }
              }
            } else {
              if (((Lexicominos) this).field_J != 1) {
                param5 = 307199;
                L7: while (true) {
                  if (param5 < 0) {
                    L8: {
                      if (param7 > 109) {
                        break L8;
                      } else {
                        field_E = true;
                        break L8;
                      }
                    }
                    break L0;
                  } else {
                    L9: {
                      var10_int = param6[param5];
                      if (var10_int == -1) {
                        break L9;
                      } else {
                        param0 = 3 & var10_int;
                        param2 = var10_int >> 11 & 3;
                        param3 = ((var10_int & 4186687) >> 13) + ((2044 & var10_int) >> 2) * 311;
                        if (var10_int >= 0) {
                          L10: {
                            if (param2 == 0) {
                              break L10;
                            } else {
                              if (param0 != 0) {
                                var11 = param8[param3];
                                var12 = param8[param3 - -1];
                                var13 = param8[311 + param3];
                                var14 = param8[311 + param3 - -1];
                                var15 = (4 - param0) * (param2 * (16711935 & var12) + (4 - param2) * (var11 & 16711935)) + param0 * ((16711935 & var13) * (4 - param2) - -((16711935 & var14) * param2)) >> 4;
                                var16 = ((var13 & 65280) * (4 + -param2) + (65280 & var14) * param2) * param0 + ((4 - param2) * (65280 & var11) - -(param2 * (var12 & 65280))) * (-param0 + 4) >> 4;
                                param4[param5] = tb.a(vg.a(var16, 65280), vg.a(var15, 16711935));
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (param2 != 0) {
                            var11 = param8[param3];
                            var12 = param8[1 + param3];
                            var13 = param2 * (var12 & 16711935) + (16711935 & var11) * (-param2 + 4) >> 2;
                            var14 = (-param2 + 4) * (var11 & 65280) + param2 * (var12 & 65280) >> 2;
                            param4[param5] = tb.a(vg.a(var14, 65280), vg.a(16711935, var13));
                            break L9;
                          } else {
                            if (param0 == 0) {
                              param4[param5] = param8[param3];
                              break L9;
                            } else {
                              var11 = param8[param3];
                              var12 = param8[311 + param3];
                              var13 = (16711935 & var11) * (4 + -param0) - -((var12 & 16711935) * param0) >> 2;
                              var14 = (65280 & var11) * (-param0 + 4) - -(param0 * (65280 & var12)) >> 2;
                              param4[param5] = tb.a(vg.a(65280, var14), vg.a(16711935, var13));
                              break L9;
                            }
                          }
                        } else {
                          L11: {
                            if (param2 == 0) {
                              break L11;
                            } else {
                              if (param0 == 0) {
                                break L11;
                              } else {
                                var11 = param1[param3];
                                var12 = param1[param3 + 1];
                                var13 = param1[param3 + 311];
                                var14 = param1[312 + param3];
                                var15 = param0 * ((16711935 & var14) * param2 + (-param2 + 4) * (var13 & 16711935)) + ((16711935 & var11) * (4 + -param2) - -(param2 * (var12 & 16711935))) * (4 + -param0) >> 4;
                                var16 = (4 - param0) * ((var11 & 65280) * (-param2 + 4) - -(param2 * (var12 & 65280))) - -(param0 * (param2 * (var14 & 65280) + (4 - param2) * (var13 & 65280))) >> 4;
                                param4[param5] = tb.a(vg.a(65280, var16), vg.a(16711935, var15));
                                break L9;
                              }
                            }
                          }
                          if (param2 != 0) {
                            var11 = param1[param3];
                            var12 = param1[param3 + 1];
                            var13 = (16711935 & var12) * param2 + (4 + -param2) * (16711935 & var11) >> 2;
                            var14 = (65280 & var12) * param2 + (65280 & var11) * (4 + -param2) >> 2;
                            param4[param5] = tb.a(vg.a(var13, 16711935), vg.a(var14, 65280));
                            break L9;
                          } else {
                            if (param0 != 0) {
                              var11 = param1[param3];
                              var12 = param1[param3 + 311];
                              var13 = (16711935 & var11) * (-param0 + 4) + param0 * (var12 & 16711935) >> 2;
                              var14 = param0 * (var12 & 65280) + (65280 & var11) * (-param0 + 4) >> 2;
                              param4[param5] = tb.a(vg.a(var14, 65280), vg.a(var13, 16711935));
                              break L9;
                            } else {
                              param4[param5] = param1[param3];
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    param5--;
                    continue L7;
                  }
                }
              } else {
                param5 = 307199;
                L12: while (true) {
                  if (0 > param5) {
                    return;
                  } else {
                    L13: {
                      var10_int = param6[param5];
                      if (var10_int == -1) {
                        break L13;
                      } else {
                        param2 = var10_int >> 11 & 3;
                        param3 = 311 * ((var10_int & 2044) >> 2) + ((var10_int & 4193849) >> 13);
                        if (0 > var10_int) {
                          if (param2 == 0) {
                            param4[param5] = param1[param3];
                            break L13;
                          } else {
                            var11 = param1[param3];
                            var12 = param1[1 + param3];
                            var13 = (4 + -param2) * (var11 & 16711935) - -((var12 & 16711935) * param2) >> 2;
                            var14 = (65280 & var12) * param2 + (4 - param2) * (var11 & 65280) >> 2;
                            param4[param5] = tb.a(vg.a(16711935, var13), vg.a(65280, var14));
                            break L13;
                          }
                        } else {
                          if (param2 == 0) {
                            param4[param5] = param8[param3];
                            break L13;
                          } else {
                            var11 = param8[param3];
                            var12 = param8[1 + param3];
                            var13 = param2 * (16711935 & var12) + (4 + -param2) * (var11 & 16711935) >> 2;
                            var14 = (var11 & 65280) * (4 - param2) - -(param2 * (var12 & 65280)) >> 2;
                            param4[param5] = tb.a(vg.a(var14, 65280), vg.a(16711935, var13));
                            break L13;
                          }
                        }
                      }
                    }
                    param5--;
                    continue L12;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var10 = decompiledCaughtException;
            stackOut_104_0 = (RuntimeException) var10;
            stackOut_104_1 = new StringBuilder().append("Lexicominos.WA(").append(param0).append(44);
            stackIn_107_0 = stackOut_104_0;
            stackIn_107_1 = stackOut_104_1;
            stackIn_105_0 = stackOut_104_0;
            stackIn_105_1 = stackOut_104_1;
            if (param1 == null) {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L14;
            } else {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "{...}";
              stackIn_108_0 = stackOut_105_0;
              stackIn_108_1 = stackOut_105_1;
              stackIn_108_2 = stackOut_105_2;
              break L14;
            }
          }
          L15: {
            stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
            stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_111_0 = stackOut_108_0;
            stackIn_111_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param4 == null) {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L15;
            } else {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "{...}";
              stackIn_112_0 = stackOut_109_0;
              stackIn_112_1 = stackOut_109_1;
              stackIn_112_2 = stackOut_109_2;
              break L15;
            }
          }
          L16: {
            stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
            stackOut_112_1 = ((StringBuilder) (Object) stackIn_112_1).append(stackIn_112_2).append(44).append(param5).append(44);
            stackIn_115_0 = stackOut_112_0;
            stackIn_115_1 = stackOut_112_1;
            stackIn_113_0 = stackOut_112_0;
            stackIn_113_1 = stackOut_112_1;
            if (param6 == null) {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "null";
              stackIn_116_0 = stackOut_115_0;
              stackIn_116_1 = stackOut_115_1;
              stackIn_116_2 = stackOut_115_2;
              break L16;
            } else {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "{...}";
              stackIn_116_0 = stackOut_113_0;
              stackIn_116_1 = stackOut_113_1;
              stackIn_116_2 = stackOut_113_2;
              break L16;
            }
          }
          L17: {
            stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
            stackOut_116_1 = ((StringBuilder) (Object) stackIn_116_1).append(stackIn_116_2).append(44).append(param7).append(44);
            stackIn_119_0 = stackOut_116_0;
            stackIn_119_1 = stackOut_116_1;
            stackIn_117_0 = stackOut_116_0;
            stackIn_117_1 = stackOut_116_1;
            if (param8 == null) {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L17;
            } else {
              stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
              stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
              stackOut_117_2 = "{...}";
              stackIn_120_0 = stackOut_117_0;
              stackIn_120_1 = stackOut_117_1;
              stackIn_120_2 = stackOut_117_2;
              break L17;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_120_0, stackIn_120_2 + 41);
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              Lexicominos.o(2);
              ff.a(param0 ^ -43);
              bl.a((byte) 111);
              eb.b((byte) -100);
              hb.a((byte) 76);
              uh.a((byte) 120);
              bi.a(-1);
              of.a(param0 ^ -80);
              ka.a((byte) -81);
              nk.c((byte) 89);
              de.a(param0 ^ 73);
              qb.e(439);
              wg.c(param0 + 37);
              da.a((byte) 123);
              ee.a(param0 + 35);
              lf.c();
              sh.a(1);
              le.a();
              wd.a((byte) 11);
              qd.b(false);
              rf.b(0);
              qc.a(225);
              ga.a(param0 + -79);
              t.a(12307);
              jh.a(false);
              ah.b((byte) -95);
              il.a(0);
              df.a(true);
              af.b(param0 ^ 25);
              hi.a(5);
              ig.a(-71);
              tb.a(255);
              dd.a(1);
              td.b(0);
              ra.b(20);
              gf.b(-78);
              qk.a(false);
              b.b();
              ja.a((byte) -36);
              oj.b((byte) -26);
              fc.a(-265);
              sg.b(0);
              wb.d(5);
              pg.c(-8413);
              be.b((byte) -116);
              ge.a((byte) -59);
              ed.c(-43);
              ca.a(param0 + -163);
              kd.b(true);
              vg.b(0);
              fd.a((byte) -61);
              hl.c(true);
              na.a(true);
              cb.a(param0 + 29073);
              ek.b();
              kj.c((byte) 37);
              fg.a(param0 + -55);
              wh.a(param0 + -167);
              bk.a((byte) 98);
              ob.b(122);
              e.a(param0 + -78);
              gk.b(11);
              hf.a(param0 + -16006);
              jl.a(-15699);
              fl.a(false);
              jj.a(100);
              eg.i(-102);
              u.j((byte) -50);
              uk.i(78);
              qj.g(true);
              uc.h(param0 + 11252);
              pj.e((byte) 71);
              mh.a((byte) 119);
              ti.e(false);
              r.h(param0 ^ -45);
              sd.b();
              mf.a();
              ak.a();
              oh.a(param0 + -204);
              p.a(-127);
              bd.a(84);
              gd.e((byte) -62);
              th.j((byte) 120);
              ej.a(param0 ^ -77);
              if (param0 == 79) {
                break L1;
              } else {
                ((Lexicominos) this).field_K = false;
                break L1;
              }
            }
            ad.a((byte) -108);
            nh.a(60);
            gg.a(true);
            qg.a((byte) 105);
            bj.a(true);
            kb.a(false);
            q.a((byte) 70);
            ph.a(87);
            pe.a((byte) -81);
            qf.e((byte) -15);
            ci.b((byte) -127);
            dc.f((byte) -63);
            dl.a(param0 ^ 72);
            fj.f((byte) -12);
            ug.d(64);
            vh.a((byte) 119);
            si.e(false);
            ce.a(-5602);
            ef.a(param0 ^ 79);
            ik.b((byte) -108);
            k.a();
            ne.a(338);
            nj.a((byte) -5);
            pk.a(15569);
            eh.a((byte) 99);
            rg.c(0);
            pa.b(param0 + -77);
            wc.a((byte) -50);
            dj.a(-45);
            ui.e(-1);
            he.a(-1);
            jc.a(-63);
            el.a(true);
            nl.b((byte) -125);
            ic.a();
            ok.a((byte) 28);
            pd.b(118);
            lj.a(0);
            fb.a(2);
            ib.a(false);
            og.a((byte) 124);
            ve.a(true);
            w.c(false);
            kf.e(-85);
            mg.d(false);
            ql.g((byte) 42);
            al.d((byte) 102);
            nb.d(false);
            ta.f(0);
            sk.a(82);
            oe.a(param0 + 32034);
            me.d(80);
            lb.a(-128);
            ll.a((byte) 114);
            bf.a((byte) -118);
            fa.a(param0 + 829);
            qa.a(param0 + 48);
            vl.a(96);
            ni.a((byte) 65);
            lg.c(21745);
            ck.a((byte) -18);
            rk.a(true);
            aa.b((byte) -126);
            jd.a((byte) -118);
            we.a((byte) -128);
            vf.a((byte) -53);
            ac.a(param0 + -75);
            kc.a(0);
            wj.c(false);
            rc.a(870040769);
            jf.h(-127);
            cl.o(-60);
            rl.g((byte) 93);
            re.i((byte) -27);
            md.e(344066273);
            bb.a((byte) -26);
            bc.e(false);
            ld.j(6977);
            li.a((byte) 81);
            te.a((byte) -122);
            tj.d(0);
            pl.a(0);
            kg.i(300);
            ae.j(-126);
            gi.a();
            hd.a(-115);
            kk.d(param0 + -159);
            gl.a(-116);
            hh.h(225);
            l.h(4);
            ji.b((byte) -70);
            bg.a((byte) 70);
            rh.c(-119);
            gj.d(-8601);
            ch.d(-123);
            sb.b(16478);
            vk.a(param0 ^ -30299);
            ec.a(true);
            sj.a((byte) 5);
            nc.a((byte) 88);
            d.a(false);
            cg.a((byte) -119);
            v.b(-13714);
            uj.a(true);
            id.c((byte) 96);
            di.a(false);
            ia.h(0);
            hc.g(-1);
            f.a((byte) 69);
            sa.a(0);
            vi.a(112);
            vb.a(109);
            ki.a(-119);
            mb.b(-26);
            la.a((byte) 122);
            c.a(117);
            vc.g(-16531);
            tl.a(3);
            m.a(1000);
            fk.b(false);
            pf.c(false);
            a.b(true);
            oc.a(-123);
            mc.a(29407);
            wa.a((byte) 102);
            pb.a((byte) -48);
            tg.a(0);
            n.b(23887);
            rj.b((byte) 88);
            ij.a((byte) 66);
            mk.a((byte) -101);
            ol.c(false);
            va.d((byte) -113);
            pc.d((byte) -82);
            jg.e(param0 + -25127);
            uf.c(false);
            g.e(-17779);
            rb.a((byte) 50);
            sc.a(-70);
            ri.c((byte) 117);
            tf.a(-3082);
            ((Lexicominos) this).field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "Lexicominos.I(" + param0 + 41);
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              nh.a(0, 1000000, 6, true);
              if (ki.a((byte) -118)) {
                break L1;
              } else {
                vc.field_D = ce.a(4, 109);
                hh.field_N = ud.a(1, -108, 10, 3, 9);
                al.a(16, ef.field_c, 100.0f);
                break L1;
              }
            }
            L2: {
              if (param0 == -83) {
                break L2;
              } else {
                ((Lexicominos) this).b(true);
                break L2;
              }
            }
            fi.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "Lexicominos.PA(" + param0 + 41);
        }
    }

    final void b(boolean param0) {
        try {
            ((Lexicominos) this).a(12, 13, false, 10, 5000, 0, 11, 2);
            b.a(22050, true, 10);
            ce.field_b = b.a(jh.field_a, (java.awt.Component) (Object) ug.field_y, 0, 4096);
            ik.field_h = b.a(jh.field_a, (java.awt.Component) (Object) ug.field_y, 1, 2048);
            wj.field_j = new hk();
            ik.field_h.b((lk) (Object) wj.field_j);
            uh.field_n = new uh();
            uh.field_n.field_s = new hl(uh.field_n.field_A);
            uh.field_n.field_A.a(128, true, 9);
            uh.field_n.field_s.a(128, true, 9);
            ce.field_b.b((lk) (Object) uh.field_n);
            ((Lexicominos) this).a(false, param0, true, (byte) 18, false);
            ea.field_b = 0;
            g.field_n = 10640990;
            ec.field_c = 3941155;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "Lexicominos.F(" + param0 + 41);
        }
    }

    private final boolean p(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                L2: {
                  if (ki.a((byte) -120)) {
                    break L2;
                  } else {
                    if (!((Lexicominos) this).field_K) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = 1;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "Lexicominos.TA(" + param0 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private final void c(boolean param0) {
        vb var2 = null;
        RuntimeException var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ki.a((byte) -119)) {
                break L1;
              } else {
                L2: while (true) {
                  var2 = (vb) (Object) rb.field_b.a((byte) 56);
                  if (var2 != null) {
                    eh.a(var2, 4, (byte) -4);
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: while (true) {
              if (!td.a(fg.field_f, param0)) {
                L4: {
                  kc.a(0, -1);
                  var2_int = param0 ? 1 : 0;
                  if (!d.a((byte) -56)) {
                    break L4;
                  } else {
                    var3 = ((Lexicominos) this).n(6);
                    if (var3 != 2) {
                      break L4;
                    } else {
                      var2_int = 1;
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var2_int != 0) {
                    wi.a(12, bi.field_a.field_E * 3 >> 1, (byte) -123, (le) (Object) bi.field_a, 4, 4, bi.field_a.field_E - -1, 240, 320, jh.field_b, nh.field_c);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                break L0;
              } else {
                ((Lexicominos) this).m(-6721);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2_ref, "Lexicominos.NA(" + param0 + 41);
        }
    }

    private final void h(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == eg.field_C) {
                break L1;
              } else {
                ce.a(false, eg.field_C);
                eg.field_C = null;
                dl.b(5);
                break L1;
              }
            }
            L2: {
              dl.field_d = oj.a(false, 1);
              ci.field_a = oj.a(false, 2);
              gl.field_a = oj.a(false, 3);
              hh.field_L = oj.a(false, 5);
              ga.field_a = oj.a(false, 6);
              ec.field_b = oj.a(false, 7);
              if (param0 > 77) {
                break L2;
              } else {
                boolean discarded$2 = this.p(71);
                break L2;
              }
            }
            hc.field_gb = oj.a(false, 8);
            ci.field_e = oj.a(false, 9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "Lexicominos.RA(" + param0 + 41);
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 40) {
                break L1;
              } else {
                boolean discarded$2 = this.p(56);
                break L1;
              }
            }
            L2: {
              ce.field_b.a();
              ik.field_h.a();
              if (ff.field_b == null) {
                break L2;
              } else {
                af.a(-65);
                break L2;
              }
            }
            ca.c(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "Lexicominos.K(" + param0 + 41);
        }
    }

    public final void init() {
        try {
            ((Lexicominos) this).a(14, "lexicominos", (byte) -107);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "Lexicominos.init()");
        }
    }

    final void d(int param0) {
        Object var2_ref = null;
        RuntimeException var2 = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ra stackOut_4_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_9_1 = false;
        var2_ref = null;
        var4 = field_L ? 1 : 0;
        try {
          L0: {
            if (ff.field_b != null) {
              stackOut_4_0 = ff.field_b;
              stackIn_5_0 = (Object) (Object) stackOut_4_0;
              break L0;
            } else {
              stackOut_2_0 = ug.field_y;
              stackIn_5_0 = (Object) (Object) stackOut_2_0;
              break L0;
            }
          }
          var2_ref = stackIn_5_0;
          if (lh.b(-24921)) {
            L1: {
              stackOut_8_0 = 57;
              stackIn_11_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (ff.field_b != null) {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L1;
              } else {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = vi.field_j;
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1 ? 1 : 0;
                break L1;
              }
            }
            ga.a((byte) stackIn_12_0, stackIn_12_1 != 0, (java.awt.Canvas) var2_ref);
            return;
          } else {
            uj.a(106, (java.awt.Canvas) var2_ref);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "Lexicominos.D(" + param0 + 41);
        }
    }

    private final void a(int[] param0, int[] param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              this.a(0, param1, 0, 0, lf.field_b, 0, qb.field_b, (byte) 121, param0);
              if (!param2) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("Lexicominos.MA(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_263_0 = 0;
        PrintStream stackIn_290_0 = null;
        StringBuilder stackIn_290_1 = null;
        char stackIn_290_2 = 0;
        PrintStream stackIn_292_0 = null;
        StringBuilder stackIn_292_1 = null;
        char stackIn_292_2 = 0;
        PrintStream stackIn_294_0 = null;
        StringBuilder stackIn_294_1 = null;
        char stackIn_294_2 = 0;
        PrintStream stackIn_295_0 = null;
        StringBuilder stackIn_295_1 = null;
        char stackIn_295_2 = 0;
        int stackIn_295_3 = 0;
        fc stackIn_327_0 = null;
        fc stackIn_329_0 = null;
        fc stackIn_330_0 = null;
        int stackIn_330_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_260_0 = 0;
        PrintStream stackOut_289_0 = null;
        StringBuilder stackOut_289_1 = null;
        char stackOut_289_2 = 0;
        PrintStream stackOut_294_0 = null;
        StringBuilder stackOut_294_1 = null;
        char stackOut_294_2 = 0;
        int stackOut_294_3 = 0;
        PrintStream stackOut_290_0 = null;
        StringBuilder stackOut_290_1 = null;
        char stackOut_290_2 = 0;
        PrintStream stackOut_292_0 = null;
        StringBuilder stackOut_292_1 = null;
        char stackOut_292_2 = 0;
        int stackOut_292_3 = 0;
        fc stackOut_326_0 = null;
        fc stackOut_329_0 = null;
        int stackOut_329_1 = 0;
        fc stackOut_327_0 = null;
        int stackOut_327_1 = 0;
        var4 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ce.field_b.e();
              ik.field_h.e();
              if (null == ff.field_b) {
                break L1;
              } else {
                if (ff.field_b.field_d) {
                  af.a(-53);
                  ce.b(4);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              stackOut_8_0 = this;
              stackIn_11_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (null == ff.field_b) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1;
                break L2;
              }
            }
            L3: {
              ((Lexicominos) this).c(stackIn_12_1 != 0, -1);
              if (ne.field_e) {
                this.h((byte) 121);
                ne.field_e = false;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!lh.b(-24921)) {
                break L4;
              } else {
                ((Lexicominos) this).e((byte) 49);
                if (lh.b(-24921)) {
                  L5: {
                    if (!ha.a(89)) {
                      break L5;
                    } else {
                      boolean discarded$8 = this.a((byte) -86, false);
                      break L5;
                    }
                  }
                  return;
                } else {
                  break L4;
                }
              }
            }
            var2_int = 0;
            L6: {
              hb.a(gd.field_l, true);
              if (!this.a((byte) -86, true)) {
                break L6;
              } else {
                L7: {
                  if (param0) {
                    stackOut_123_0 = 0;
                    stackIn_124_0 = stackOut_123_0;
                    break L7;
                  } else {
                    stackOut_121_0 = 1;
                    stackIn_124_0 = stackOut_121_0;
                    break L7;
                  }
                }
                kj.c(stackIn_124_0 != 0);
                this.g((byte) -83);
                dl.b(5);
                oj.field_g = true;
                break L6;
              }
            }
            L8: {
              if (var2_int == 0) {
                break L8;
              } else {
                if (je.field_a == 0) {
                  if (~th.field_r == ~aa.field_j) {
                    if (aa.field_j == -1) {
                      L9: while (true) {
                        if (!ji.a((byte) -72)) {
                          if (aa.field_j == -1) {
                            el.field_c.e(1);
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          if (da.field_b != 13) {
                            if (2 > vb.field_i) {
                              continue L9;
                            } else {
                              L10: {
                                if (da.field_b != 84) {
                                  if (!ci.a(true, pe.field_b)) {
                                    break L10;
                                  } else {
                                    StringBuilder discarded$9 = sk.field_a.append(pe.field_b);
                                    if (na.a(1048576, (CharSequence) (Object) sk.field_a) != -26658124) {
                                      if (na.a(1048576, (CharSequence) (Object) sk.field_a) != -1039745817) {
                                        break L10;
                                      } else {
                                        mg.field_B = false;
                                        StringBuilder discarded$10 = ob.a(0, sk.field_a, (byte) 22, ' ');
                                        break L10;
                                      }
                                    } else {
                                      L11: {
                                        if (mg.field_B) {
                                          stackOut_262_0 = 0;
                                          stackIn_263_0 = stackOut_262_0;
                                          break L11;
                                        } else {
                                          stackOut_260_0 = 1;
                                          stackIn_263_0 = stackOut_260_0;
                                          break L11;
                                        }
                                      }
                                      mg.field_B = stackIn_263_0 != 0;
                                      StringBuilder discarded$11 = ob.a(0, sk.field_a, (byte) 22, ' ');
                                      break L10;
                                    }
                                  }
                                } else {
                                  StringBuilder discarded$12 = ob.a(0, sk.field_a, (byte) 22, ' ');
                                  break L10;
                                }
                              }
                              L12: {
                                if (null == el.field_c) {
                                  break L12;
                                } else {
                                  if (da.field_b != 50) {
                                    break L12;
                                  } else {
                                    if (el.field_c.field_d < 16) {
                                      el.field_c.field_t = el.field_c.field_t + 8;
                                      var3 = (el.field_c.field_t >> 3) + 1;
                                      if (el.field_c.field_d < var3) {
                                        el.field_c.field_d = el.field_c.field_d + 1;
                                        el.field_c.field_s = 0;
                                        if (1 == (el.field_c.field_d & 1)) {
                                          ki.a(40000 * el.field_c.field_d + 960000, el.field_c.field_I, -127);
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        break L12;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              L13: {
                                if (null == el.field_c) {
                                  break L13;
                                } else {
                                  if (!el.field_c.field_T) {
                                    break L13;
                                  } else {
                                    L14: {
                                      stackOut_289_0 = System.out;
                                      stackOut_289_1 = new StringBuilder().append("keycode=").append(da.field_b).append("; keychar=");
                                      stackOut_289_2 = pe.field_b;
                                      stackIn_294_0 = stackOut_289_0;
                                      stackIn_294_1 = stackOut_289_1;
                                      stackIn_294_2 = stackOut_289_2;
                                      stackIn_290_0 = stackOut_289_0;
                                      stackIn_290_1 = stackOut_289_1;
                                      stackIn_290_2 = stackOut_289_2;
                                      if (param0) {
                                        stackOut_294_0 = (PrintStream) (Object) stackIn_294_0;
                                        stackOut_294_1 = (StringBuilder) (Object) stackIn_294_1;
                                        stackOut_294_2 = stackIn_294_2;
                                        stackOut_294_3 = 0;
                                        stackIn_295_0 = stackOut_294_0;
                                        stackIn_295_1 = stackOut_294_1;
                                        stackIn_295_2 = stackOut_294_2;
                                        stackIn_295_3 = stackOut_294_3;
                                        break L14;
                                      } else {
                                        stackOut_290_0 = (PrintStream) (Object) stackIn_290_0;
                                        stackOut_290_1 = (StringBuilder) (Object) stackIn_290_1;
                                        stackOut_290_2 = stackIn_290_2;
                                        stackIn_292_0 = stackOut_290_0;
                                        stackIn_292_1 = stackOut_290_1;
                                        stackIn_292_2 = stackOut_290_2;
                                        stackOut_292_0 = (PrintStream) (Object) stackIn_292_0;
                                        stackOut_292_1 = (StringBuilder) (Object) stackIn_292_1;
                                        stackOut_292_2 = stackIn_292_2;
                                        stackOut_292_3 = 1;
                                        stackIn_295_0 = stackOut_292_0;
                                        stackIn_295_1 = stackOut_292_1;
                                        stackIn_295_2 = stackOut_292_2;
                                        stackIn_295_3 = stackOut_292_3;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      ((PrintStream) (Object) stackIn_295_0).println(String.valueOf(va.a(stackIn_295_2, stackIn_295_3 != 0)));
                                      if (65 > pe.field_b) {
                                        break L15;
                                      } else {
                                        if (pe.field_b > 90) {
                                          break L15;
                                        } else {
                                          var3 = 0;
                                          L16: while (true) {
                                            if (var3 >= 4) {
                                              el.field_c.field_h = true;
                                              continue L9;
                                            } else {
                                              el.field_c.field_Q.field_h[var3] = pe.field_b;
                                              var3++;
                                              continue L16;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (pe.field_b < 49) {
                                      break L13;
                                    } else {
                                      if (55 >= pe.field_b) {
                                        el.field_c.field_Q = new ha(el.field_c, -49 + pe.field_b, el.field_c.field_Q.field_h);
                                        el.field_c.field_h = true;
                                        continue L9;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              L17: {
                                if (null == el.field_c) {
                                  break L17;
                                } else {
                                  if (pe.field_b != 102) {
                                    break L17;
                                  } else {
                                    el.field_c.field_T = true;
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (el.field_c == null) {
                                  break L18;
                                } else {
                                  if (pe.field_b != 117) {
                                    break L18;
                                  } else {
                                    el.field_c.field_T = false;
                                    break L18;
                                  }
                                }
                              }
                              if (el.field_c == null) {
                                continue L9;
                              } else {
                                if (pe.field_b != 105) {
                                  continue L9;
                                } else {
                                  L19: {
                                    stackOut_326_0 = el.field_c;
                                    stackIn_329_0 = stackOut_326_0;
                                    stackIn_327_0 = stackOut_326_0;
                                    if (el.field_c.field_D) {
                                      stackOut_329_0 = (fc) (Object) stackIn_329_0;
                                      stackOut_329_1 = 0;
                                      stackIn_330_0 = stackOut_329_0;
                                      stackIn_330_1 = stackOut_329_1;
                                      break L19;
                                    } else {
                                      stackOut_327_0 = (fc) (Object) stackIn_327_0;
                                      stackOut_327_1 = 1;
                                      stackIn_330_0 = stackOut_327_0;
                                      stackIn_330_1 = stackOut_327_1;
                                      break L19;
                                    }
                                  }
                                  stackIn_330_0.field_D = stackIn_330_1 != 0;
                                  continue L9;
                                }
                              }
                            }
                          } else {
                            L20: {
                              if (vb.field_i >= 2) {
                                StringBuilder discarded$13 = ob.a(0, sk.field_a, (byte) 22, ' ');
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            ((Lexicominos) this).a((byte) -77, false, 2, -1);
                            continue L9;
                          }
                        }
                      }
                    } else {
                      vg.field_d[aa.field_j].a((byte) -88);
                      if (el.field_c != null) {
                        el.field_c.b(2);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    L21: {
                      ed.field_v = ed.field_v + cg.field_j;
                      if (aa.field_j < 0) {
                        break L21;
                      } else {
                        if (vg.field_d[aa.field_j].field_m == null) {
                          break L21;
                        } else {
                          vg.field_d[aa.field_j].field_m.b(2);
                          break L21;
                        }
                      }
                    }
                    L22: {
                      if (aa.field_j < 0) {
                        break L22;
                      } else {
                        if (el.field_c != null) {
                          el.field_c.b(2);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    if ((ed.field_v + -20) * cg.field_j < 20) {
                      break L8;
                    } else {
                      if (th.field_r != -2) {
                        L23: {
                          if (aa.field_j < 0) {
                            break L23;
                          } else {
                            if (vg.field_d[aa.field_j].field_m == null) {
                              break L23;
                            } else {
                              th.field_o[2].e(0);
                              vg.field_d[aa.field_j].field_m = null;
                              break L23;
                            }
                          }
                        }
                        L24: {
                          if (6 != aa.field_j) {
                            break L24;
                          } else {
                            if (th.field_r == 0) {
                              sc.field_g = 0;
                              ee.field_a = 0;
                              rb.field_b.g(-105);
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                        aa.field_j = th.field_r;
                        if (aa.field_j == -1) {
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        if (ed.field_v != 40) {
                          break L8;
                        } else {
                          ge.a(0, kk.c(-14047));
                          break L8;
                        }
                      }
                    }
                  }
                } else {
                  if (je.field_a != 1) {
                    if (2 == je.field_a) {
                      L25: {
                        if (ki.a((byte) -115)) {
                          aa.field_j = hc.field_db;
                          break L25;
                        } else {
                          L26: {
                            if (el.field_c == null) {
                              break L26;
                            } else {
                              if (el.field_c.field_J <= 0) {
                                break L26;
                              } else {
                                if (el.field_c.field_h) {
                                  break L26;
                                } else {
                                  ki.field_d = gl.a(65526, 9, el.field_c.field_i, 3, el.field_c.field_f, (byte) 56, el.field_c.field_R, new int[1], el.field_c.field_a);
                                  break L26;
                                }
                              }
                            }
                          }
                          L27: {
                            hh.field_N = ud.a(1, -118, 10, 3, 9);
                            aa.field_j = hf.field_a;
                            if (7 != aa.field_j) {
                              break L27;
                            } else {
                              if (ee.field_a != 0) {
                                break L27;
                              } else {
                                aa.field_j = 1;
                                break L27;
                              }
                            }
                          }
                          al.a(16, ef.field_c, 100.0f);
                          break L25;
                        }
                      }
                      L28: {
                        if (aa.field_j != -3) {
                          break L28;
                        } else {
                          aa.field_j = 0;
                          kl.a(3 * bi.field_a.field_E >> 1, 4, 320, jh.field_b, 12, (le) (Object) bi.field_a, 4, (byte) 86, nh.field_c, false, 1 + bi.field_a.field_E, 240);
                          break L28;
                        }
                      }
                      je.field_a = 3;
                      th.field_r = aa.field_j;
                      break L8;
                    } else {
                      int fieldTemp$14 = ed.field_v - 1;
                      ed.field_v = ed.field_v - 1;
                      if (fieldTemp$14 != 0) {
                        break L8;
                      } else {
                        je.field_a = 0;
                        break L8;
                      }
                    }
                  } else {
                    int fieldTemp$15 = ed.field_v + 1;
                    ed.field_v = ed.field_v + 1;
                    if (fieldTemp$15 == 32) {
                      L29: {
                        if (!ra.a(-17977)) {
                          mk.a(14891);
                          break L29;
                        } else {
                          pl.a((byte) -85);
                          break L29;
                        }
                      }
                      je.field_a = 2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            this.c(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "Lexicominos.M(" + param0 + 41);
        }
    }

    private final void a(int param0, int[] param1, db param2, int[] param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var30 = field_L ? 1 : 0;
        try {
          L0: {
            var6_int = param3[0];
            var7 = param1[0];
            var8 = 126 / ((param0 - -6) / 58);
            var9 = param4[0];
            var10 = 0;
            var11 = 1;
            L1: while (true) {
              if (10 <= var11) {
                break L0;
              } else {
                L2: {
                  var12 = param3[var11];
                  var13 = param1[var11];
                  var14 = param4[var11];
                  var15 = ce.field_c[-1 + var11];
                  var16 = -var6_int + var12 + 1;
                  if (var16 >= 0) {
                    var17 = var12 - -1;
                    var18 = var10 << 20;
                    var19 = (var15 << 20) / var16;
                    var20 = var7 << 20;
                    var21 = (var13 + -var7 << 20) / var16;
                    var22 = 1 + -var7 + var9 << 20;
                    var23 = (-var9 - (-var7 - (-var13 + var14)) << 20) / var16;
                    var7 = var13;
                    var6_int = var12;
                    L3: while (true) {
                      if (0 >= var16) {
                        var10 = var10 + var15;
                        var9 = var14;
                        break L2;
                      } else {
                        L4: {
                          var24 = var20 >> 20;
                          var25 = var22 >> 20;
                          var26 = 0;
                          var27 = 471859200 / var25;
                          if (~lf.field_h <= ~(var24 + var25)) {
                            break L4;
                          } else {
                            var25 = var25 - (-lf.field_h + (var24 - -var25));
                            break L4;
                          }
                        }
                        L5: {
                          var28 = var17 - var16 - -(var24 * lf.field_f);
                          if (var24 >= lf.field_c) {
                            break L5;
                          } else {
                            var29 = lf.field_c + -var24;
                            var26 = var26 + var29 * var27;
                            var28 = var28 + lf.field_f * var29;
                            var25 = var25 - var29;
                            break L5;
                          }
                        }
                        hd.a(param2.field_y, var28, var26, var25, 0, lf.field_f, lf.field_b, var18 >> 20, 311, var27);
                        var18 = var18 + var19;
                        var20 = var20 + var21;
                        var22 = var22 + var23;
                        var16--;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("Lexicominos.UA(").append(param0).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          L8: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L8;
            }
          }
          L9: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(44);
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L9;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
        }
    }

    private final db a(int param0, db param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        db var5 = null;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        db stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        db stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = field_L ? 1 : 0;
        try {
          L0: {
            var3_int = param1.field_s;
            var4 = param1.field_w;
            var5 = new db(param1.field_p + 16, 16 + param1.field_u);
            var5.field_s = -8 + var3_int;
            var5.field_w = -8 + var4;
            var5.b();
            var6 = 0;
            var7_int = 0;
            L1: while (true) {
              if (param1.field_u <= var7_int) {
                var6 = 0;
                var7_int = 0;
                L2: while (true) {
                  if (param1.field_u <= var7_int) {
                    var7 = var5.field_y;
                    var8 = -1 + var7.length;
                    L3: while (true) {
                      if (var8 < 0) {
                        var8 = 34 % ((-42 - param0) / 44);
                        stackOut_27_0 = (db) var5;
                        stackIn_28_0 = stackOut_27_0;
                        break L0;
                      } else {
                        L4: {
                          if (var7[var8] != 8421504) {
                            break L4;
                          } else {
                            var7[var8] = 0;
                            break L4;
                          }
                        }
                        var8--;
                        continue L3;
                      }
                    }
                  } else {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= param1.field_p) {
                        var7_int++;
                        continue L2;
                      } else {
                        L6: {
                          int incrementValue$2 = var6;
                          var6++;
                          if (param1.field_y[incrementValue$2] == 0) {
                            break L6;
                          } else {
                            lf.c(var8 - -8, var7_int - -8, 4, 8421504);
                            break L6;
                          }
                        }
                        var8++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var8 = 0;
                L7: while (true) {
                  if (param1.field_p <= var8) {
                    var7_int++;
                    continue L1;
                  } else {
                    L8: {
                      int incrementValue$3 = var6;
                      var6++;
                      if (param1.field_y[incrementValue$3] != 0) {
                        lf.c(8 + var8, var7_int - -8, 8, 16777215);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var8++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("Lexicominos.SA(").append(param0).append(44);
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L9;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_28_0;
    }

    public static void o(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            field_I = null;
            field_H = null;
            field_F = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "Lexicominos.LA(" + param0 + 41);
        }
    }

    final void a(byte param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_39_0 = 0;
        cd stackIn_39_1 = null;
        int stackIn_41_0 = 0;
        cd stackIn_41_1 = null;
        int stackIn_42_0 = 0;
        cd stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_43_0 = 0;
        cd stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_45_0 = 0;
        cd stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        int stackIn_46_0 = 0;
        cd stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        cd stackIn_47_4 = null;
        int stackIn_47_5 = 0;
        int stackIn_47_6 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        cd stackIn_49_4 = null;
        int stackIn_49_5 = 0;
        int stackIn_49_6 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        cd stackIn_50_4 = null;
        int stackIn_50_5 = 0;
        int stackIn_50_6 = 0;
        int stackIn_50_7 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        cd stackIn_51_4 = null;
        int stackIn_51_5 = 0;
        int stackIn_51_6 = 0;
        int stackIn_51_7 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        cd stackIn_53_4 = null;
        int stackIn_53_5 = 0;
        int stackIn_53_6 = 0;
        int stackIn_53_7 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        cd stackIn_54_4 = null;
        int stackIn_54_5 = 0;
        int stackIn_54_6 = 0;
        int stackIn_54_7 = 0;
        int stackIn_54_8 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        cd stackOut_38_1 = null;
        int stackOut_41_0 = 0;
        cd stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_39_0 = 0;
        cd stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_42_0 = 0;
        cd stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        int stackOut_45_0 = 0;
        cd stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_43_0 = 0;
        cd stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        cd stackOut_46_4 = null;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        cd stackOut_49_4 = null;
        int stackOut_49_5 = 0;
        int stackOut_49_6 = 0;
        int stackOut_49_7 = 0;
        int[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        cd stackOut_47_4 = null;
        int stackOut_47_5 = 0;
        int stackOut_47_6 = 0;
        int stackOut_47_7 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        cd stackOut_50_4 = null;
        int stackOut_50_5 = 0;
        int stackOut_50_6 = 0;
        int stackOut_50_7 = 0;
        int[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        cd stackOut_53_4 = null;
        int stackOut_53_5 = 0;
        int stackOut_53_6 = 0;
        int stackOut_53_7 = 0;
        int stackOut_53_8 = 0;
        int[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        cd stackOut_51_4 = null;
        int stackOut_51_5 = 0;
        int stackOut_51_6 = 0;
        int stackOut_51_7 = 0;
        int stackOut_51_8 = 0;
        var8 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 22 / ((16 - param0) / 59);
              th.field_r = param2;
              if (param2 < 0) {
                break L1;
              } else {
                vg.field_d[param2].field_g = param3;
                break L1;
              }
            }
            L2: {
              if (ja.field_b[th.field_r - -2] <= ja.field_b[2 + aa.field_j]) {
                cg.field_j = -1;
                ed.field_v = 40;
                break L2;
              } else {
                cg.field_j = 1;
                ed.field_v = 0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (8 > th.field_r) {
                  break L4;
                } else {
                  if (th.field_r > 11) {
                    break L4;
                  } else {
                    var6 = 0;
                    L5: while (true) {
                      L6: {
                        if (var6 >= id.field_w.length) {
                          break L6;
                        } else {
                          if (!ug.field_s.equals((Object) (Object) id.field_w[var6].field_k)) {
                            var6++;
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      vg.field_d[th.field_r].field_m = new fc((Lexicominos) this, id.field_w[var6], new Random());
                      vg.field_d[th.field_r].field_m.b(-71, th.field_r + -8);
                      vg.field_d[th.field_r].field_m.field_M = -92;
                      vg.field_d[th.field_r].field_b = 0;
                      break L3;
                    }
                  }
                }
              }
              L7: {
                if (th.field_r != 1) {
                  break L7;
                } else {
                  if (ki.a((byte) -127)) {
                    break L7;
                  } else {
                    hh.field_N = ud.a(1, -85, 10, 3, 9);
                    break L3;
                  }
                }
              }
              if (th.field_r != 6) {
                break L3;
              } else {
                L8: {
                  var6 = 50;
                  var7 = 4 + bi.field_a.field_t + bi.field_a.field_G;
                  var6 = var6 + bi.field_a.a(me.field_u, 254) * var7;
                  stackOut_38_0 = var6;
                  stackOut_38_1 = bi.field_a;
                  stackIn_41_0 = stackOut_38_0;
                  stackIn_41_1 = stackOut_38_1;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  if (0 == ee.field_a) {
                    stackOut_41_0 = stackIn_41_0;
                    stackOut_41_1 = (cd) (Object) stackIn_41_1;
                    stackOut_41_2 = 0;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    stackIn_42_2 = stackOut_41_2;
                    break L8;
                  } else {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = (cd) (Object) stackIn_39_1;
                    stackOut_39_2 = 1;
                    stackIn_42_0 = stackOut_39_0;
                    stackIn_42_1 = stackOut_39_1;
                    stackIn_42_2 = stackOut_39_2;
                    break L8;
                  }
                }
                L9: {
                  stackOut_42_0 = stackIn_42_0;
                  stackOut_42_1 = (cd) (Object) stackIn_42_1;
                  stackOut_42_2 = stackIn_42_2;
                  stackOut_42_3 = 0;
                  stackOut_42_4 = 52;
                  stackIn_45_0 = stackOut_42_0;
                  stackIn_45_1 = stackOut_42_1;
                  stackIn_45_2 = stackOut_42_2;
                  stackIn_45_3 = stackOut_42_3;
                  stackIn_45_4 = stackOut_42_4;
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  stackIn_43_2 = stackOut_42_2;
                  stackIn_43_3 = stackOut_42_3;
                  stackIn_43_4 = stackOut_42_4;
                  if (el.field_c.field_J == 0) {
                    stackOut_45_0 = stackIn_45_0;
                    stackOut_45_1 = (cd) (Object) stackIn_45_1;
                    stackOut_45_2 = stackIn_45_2;
                    stackOut_45_3 = stackIn_45_3;
                    stackOut_45_4 = stackIn_45_4;
                    stackOut_45_5 = 0;
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    stackIn_46_2 = stackOut_45_2;
                    stackIn_46_3 = stackOut_45_3;
                    stackIn_46_4 = stackOut_45_4;
                    stackIn_46_5 = stackOut_45_5;
                    break L9;
                  } else {
                    stackOut_43_0 = stackIn_43_0;
                    stackOut_43_1 = (cd) (Object) stackIn_43_1;
                    stackOut_43_2 = stackIn_43_2;
                    stackOut_43_3 = stackIn_43_3;
                    stackOut_43_4 = stackIn_43_4;
                    stackOut_43_5 = 1;
                    stackIn_46_0 = stackOut_43_0;
                    stackIn_46_1 = stackOut_43_1;
                    stackIn_46_2 = stackOut_43_2;
                    stackIn_46_3 = stackOut_43_3;
                    stackIn_46_4 = stackOut_43_4;
                    stackIn_46_5 = stackOut_43_5;
                    break L9;
                  }
                }
                L10: {
                  var6 = stackIn_46_0 + ((cd) (Object) stackIn_46_1).a(ii.a(stackIn_46_2 != 0, stackIn_46_3 != 0, stackIn_46_4, stackIn_46_5 != 0), 254) * var7;
                  qc.field_c[6] = var6;
                  stackOut_46_0 = uk.field_U;
                  stackOut_46_1 = 6;
                  stackOut_46_2 = 2 * gg.field_a[0].field_x;
                  stackOut_46_3 = var7;
                  stackOut_46_4 = bi.field_a;
                  stackOut_46_5 = 0;
                  stackOut_46_6 = -95;
                  stackIn_49_0 = stackOut_46_0;
                  stackIn_49_1 = stackOut_46_1;
                  stackIn_49_2 = stackOut_46_2;
                  stackIn_49_3 = stackOut_46_3;
                  stackIn_49_4 = stackOut_46_4;
                  stackIn_49_5 = stackOut_46_5;
                  stackIn_49_6 = stackOut_46_6;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  stackIn_47_3 = stackOut_46_3;
                  stackIn_47_4 = stackOut_46_4;
                  stackIn_47_5 = stackOut_46_5;
                  stackIn_47_6 = stackOut_46_6;
                  if (ee.field_a == 0) {
                    stackOut_49_0 = (int[]) (Object) stackIn_49_0;
                    stackOut_49_1 = stackIn_49_1;
                    stackOut_49_2 = stackIn_49_2;
                    stackOut_49_3 = stackIn_49_3;
                    stackOut_49_4 = (cd) (Object) stackIn_49_4;
                    stackOut_49_5 = stackIn_49_5;
                    stackOut_49_6 = stackIn_49_6;
                    stackOut_49_7 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    stackIn_50_2 = stackOut_49_2;
                    stackIn_50_3 = stackOut_49_3;
                    stackIn_50_4 = stackOut_49_4;
                    stackIn_50_5 = stackOut_49_5;
                    stackIn_50_6 = stackOut_49_6;
                    stackIn_50_7 = stackOut_49_7;
                    break L10;
                  } else {
                    stackOut_47_0 = (int[]) (Object) stackIn_47_0;
                    stackOut_47_1 = stackIn_47_1;
                    stackOut_47_2 = stackIn_47_2;
                    stackOut_47_3 = stackIn_47_3;
                    stackOut_47_4 = (cd) (Object) stackIn_47_4;
                    stackOut_47_5 = stackIn_47_5;
                    stackOut_47_6 = stackIn_47_6;
                    stackOut_47_7 = 1;
                    stackIn_50_0 = stackOut_47_0;
                    stackIn_50_1 = stackOut_47_1;
                    stackIn_50_2 = stackOut_47_2;
                    stackIn_50_3 = stackOut_47_3;
                    stackIn_50_4 = stackOut_47_4;
                    stackIn_50_5 = stackOut_47_5;
                    stackIn_50_6 = stackOut_47_6;
                    stackIn_50_7 = stackOut_47_7;
                    break L10;
                  }
                }
                L11: {
                  stackOut_50_0 = (int[]) (Object) stackIn_50_0;
                  stackOut_50_1 = stackIn_50_1;
                  stackOut_50_2 = stackIn_50_2;
                  stackOut_50_3 = stackIn_50_3;
                  stackOut_50_4 = (cd) (Object) stackIn_50_4;
                  stackOut_50_5 = stackIn_50_5;
                  stackOut_50_6 = stackIn_50_6;
                  stackOut_50_7 = stackIn_50_7;
                  stackIn_53_0 = stackOut_50_0;
                  stackIn_53_1 = stackOut_50_1;
                  stackIn_53_2 = stackOut_50_2;
                  stackIn_53_3 = stackOut_50_3;
                  stackIn_53_4 = stackOut_50_4;
                  stackIn_53_5 = stackOut_50_5;
                  stackIn_53_6 = stackOut_50_6;
                  stackIn_53_7 = stackOut_50_7;
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  stackIn_51_3 = stackOut_50_3;
                  stackIn_51_4 = stackOut_50_4;
                  stackIn_51_5 = stackOut_50_5;
                  stackIn_51_6 = stackOut_50_6;
                  stackIn_51_7 = stackOut_50_7;
                  if (0 == el.field_c.field_J) {
                    stackOut_53_0 = (int[]) (Object) stackIn_53_0;
                    stackOut_53_1 = stackIn_53_1;
                    stackOut_53_2 = stackIn_53_2;
                    stackOut_53_3 = stackIn_53_3;
                    stackOut_53_4 = (cd) (Object) stackIn_53_4;
                    stackOut_53_5 = stackIn_53_5;
                    stackOut_53_6 = stackIn_53_6;
                    stackOut_53_7 = stackIn_53_7;
                    stackOut_53_8 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    stackIn_54_2 = stackOut_53_2;
                    stackIn_54_3 = stackOut_53_3;
                    stackIn_54_4 = stackOut_53_4;
                    stackIn_54_5 = stackOut_53_5;
                    stackIn_54_6 = stackOut_53_6;
                    stackIn_54_7 = stackOut_53_7;
                    stackIn_54_8 = stackOut_53_8;
                    break L11;
                  } else {
                    stackOut_51_0 = (int[]) (Object) stackIn_51_0;
                    stackOut_51_1 = stackIn_51_1;
                    stackOut_51_2 = stackIn_51_2;
                    stackOut_51_3 = stackIn_51_3;
                    stackOut_51_4 = (cd) (Object) stackIn_51_4;
                    stackOut_51_5 = stackIn_51_5;
                    stackOut_51_6 = stackIn_51_6;
                    stackOut_51_7 = stackIn_51_7;
                    stackOut_51_8 = 1;
                    stackIn_54_0 = stackOut_51_0;
                    stackIn_54_1 = stackOut_51_1;
                    stackIn_54_2 = stackOut_51_2;
                    stackIn_54_3 = stackOut_51_3;
                    stackIn_54_4 = stackOut_51_4;
                    stackIn_54_5 = stackOut_51_5;
                    stackIn_54_6 = stackOut_51_6;
                    stackIn_54_7 = stackOut_51_7;
                    stackIn_54_8 = stackOut_51_8;
                    break L11;
                  }
                }
                stackIn_54_0[stackIn_54_1] = stackIn_54_2 + (stackIn_54_3 - -(((cd) (Object) stackIn_54_4).a(ac.a(stackIn_54_5 != 0, stackIn_54_6, stackIn_54_7 != 0, stackIn_54_8 != 0), 254) * var7));
                break L3;
              }
            }
            L12: {
              if (th.field_r >= 0) {
                vg.field_d[th.field_r].a(param1, true);
                break L12;
              } else {
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var5, "Lexicominos.OA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, cg param1, int param2) {
        RuntimeException runtimeException = null;
        th var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = ed.field_q;
              if (param0 == -17800) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            var3.h(param2, 0);
            var3.c(param1.field_h, -1);
            var3.e(96, param1.field_k);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("Lexicominos.VA(").append(param0).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, db param1, byte param2, db param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        db var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var29 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 34) {
                break L1;
              } else {
                field_G = -57;
                break L1;
              }
            }
            var5_int = og.field_f[param0][0];
            var6 = we.field_b[param0][0];
            var7 = bg.field_f[param0][0];
            var8 = 0;
            var9 = 1;
            L2: while (true) {
              if (var9 >= 10) {
                break L0;
              } else {
                L3: {
                  var10 = og.field_f[param0][var9];
                  var11 = we.field_b[param0][var9];
                  var12 = bg.field_f[param0][var9];
                  var13 = ce.field_c[var9 + -1];
                  var14 = 1 + (var10 - var5_int);
                  if (0 >= var14) {
                    var18 = var11 << 20;
                    var17 = -var8 + (311 + -var13) << 20;
                    var14 = 1 + (var5_int - var10);
                    var16 = var5_int - -1;
                    var15 = param1;
                    var21 = (var7 - var12 << 20) / var14;
                    var20 = var12 << 20;
                    var19 = (-var11 + var6 << 20) / var14;
                    break L3;
                  } else {
                    var15 = param3;
                    var18 = var6 << 20;
                    var16 = var10 + 1;
                    var20 = var7 << 20;
                    var19 = (-var6 + var11 << 20) / var14;
                    var21 = (var12 + -var7 << 20) / var14;
                    var17 = var8 << 20;
                    break L3;
                  }
                }
                var22 = (var13 << 20) / var14;
                var7 = var12;
                var8 = var8 + var13;
                var6 = var11;
                L4: while (true) {
                  if (var14 <= 0) {
                    var5_int = var10;
                    var9++;
                    continue L2;
                  } else {
                    L5: {
                      var23 = var18 >> 20;
                      var24 = -var23 + ((var20 >> 20) + 1);
                      var25 = 0;
                      var26 = 471859200 / var24;
                      if (~lf.field_h <= ~(var24 + var23)) {
                        break L5;
                      } else {
                        var24 = var24 - (var23 - -var24 + -lf.field_h);
                        break L5;
                      }
                    }
                    L6: {
                      var27 = lf.field_f * var23 + (-var14 + var16);
                      if (lf.field_c > var23) {
                        var28 = lf.field_c - var23;
                        var27 = var27 + lf.field_f * var28;
                        var24 = var24 - var28;
                        var25 = var25 + var26 * var28;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    hd.a(var15.field_y, var27, var25, var24, 0, lf.field_f, lf.field_b, var17 >> 20, 311, var26);
                    var18 = var18 + var19;
                    var17 = var17 + var22;
                    var20 = var20 + var21;
                    var14--;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("Lexicominos.QA(").append(param0).append(44);
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44).append(param2).append(44);
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    public Lexicominos() {
        ((Lexicominos) this).field_J = 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 0;
        field_F = "Connection lost. <%0>";
    }
}
