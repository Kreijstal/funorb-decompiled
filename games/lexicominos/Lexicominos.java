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
        ke var4_ref = null;
        int var5_int = 0;
        eb[] var5 = null;
        db var6_ref = null;
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
                        if ((var3_array.length ^ -1) >= (var5_int ^ -1)) {
                          var4--;
                          var5 = new eb[var4];
                          var6 = var3_array.length + -1;
                          L4: while (true) {
                            if ((var6 ^ -1) > -1) {
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
                                  var4--;
                                  var5[var4] = var3_array[var6];
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
              var6_ref = new db(var4, var5_int);
              var6_ref.b();
              va.field_m.b(-104, -198);
              var3[4] = new db(var4 << 668183681, var5_int << -930153823);
              var3[4].b();
              var6_ref.b(0, 0);
              var6_ref.g(var4, 0);
              var6_ref.d();
              var6_ref.b(0, var5_int);
              var6_ref.g(var4, var5_int);
              nh.field_c = new db[9];
              qb.field_o = new db[9];
              var7_int = 0;
              L10: while (true) {
                if ((var7_int ^ -1) <= -10) {
                  var3 = td.a("", "frame2", dl.field_d, param0 + 22392);
                  jh.field_b = new db[9];
                  var7_int = 0;
                  L11: while (true) {
                    if (-10 >= (var7_int ^ -1)) {
                      ef.field_d = td.a("", "achievements_lrg", dl.field_d, 22306);
                      var7 = df.a("", "glass_case", dl.field_d, (byte) -54);
                      var7.e();
                      var8_ref_int__ = var7.field_y;
                      ef.field_d[10].e();
                      var9 = ef.field_d[10].field_y;
                      var10_int = 0;
                      L12: while (true) {
                        if ((var10_int ^ -1) <= -16385) {
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
                                    if ((var8 ^ -1) > -1) {
                                      fg.field_e = new db[ef.field_d.length];
                                      var7_int = 0;
                                      L16: while (true) {
                                        if ((var7_int ^ -1) <= (fg.field_e.length ^ -1)) {
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
                                          ij.field_n[3] = df.a("", "instleft", dl.field_d, (byte) -104);
                                          ij.field_n[12] = df.a("", "instleft", dl.field_d, (byte) -104);
                                          ij.field_n[5] = df.a("", "achleft", dl.field_d, (byte) -91);
                                          ij.field_n[7] = df.a("", "achgameleft", dl.field_d, (byte) -93);
                                          ij.field_n[6] = ij.field_n[0];
                                          na.field_a[3] = df.a("", "instright", dl.field_d, (byte) -40);
                                          na.field_a[12] = df.a("", "instright", dl.field_d, (byte) -40);
                                          var7_array2 = td.a("", "mmoutlined", dl.field_d, 22306);
                                          gg.field_a = new db[var7_array2.length];
                                          ej.field_b = new db[var7_array2.length];
                                          var8 = 0;
                                          L17: while (true) {
                                            if ((var8 ^ -1) <= (var7_array2.length ^ -1)) {
                                              var7_array2 = td.a("", "hsmodeconcise", dl.field_d, 22306);
                                              hi.field_b = new db[var7_array2.length];
                                              dc.field_z = new db[var7_array2.length];
                                              var8 = 0;
                                              L18: while (true) {
                                                if ((var7_array2.length ^ -1) >= (var8 ^ -1)) {
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
                                                    if (-1 < (var12 ^ -1)) {
                                                      hi.field_b[var8].f();
                                                      var8++;
                                                      continue L18;
                                                    } else {
                                                      L20: {
                                                        if ((var9[var12] ^ -1) != -16777216) {
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
                                                    if ((var9[var12] ^ -1) != -16777216) {
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
                              var12 = var11_int >> 462656835 & 31 | var11_int >> -2070198650 & 1020;
                              var13 = 256 + -var12;
                              var14 = var9[var10_int];
                              var15 = var14 & 16711935;
                              var16 = 65280 & var14;
                              var9[var10_int] = tb.a(vg.a(var13 * var15 + var12 * 16711935 >> 1286219176, 16711935), vg.a(65280, var13 * var16 + var12 * 65280 >> -2121242232));
                              break L26;
                            }
                          }
                          var10_int++;
                          continue L12;
                        }
                      }
                    } else {
                      L27: {
                        if (-5 != (var7_int ^ -1)) {
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
                    if (-5 != (var7_int ^ -1)) {
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
                    boolean discarded$1 = uh.field_n.field_A.a(0, aa.field_i[var3_int], (byte) 102, vb.field_r, ga.field_a);
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
                                                                              var4_ref = sd.a(gl.field_a, "", "score_increase_stop").c();
                                                                              kc.field_m[2] = aj.a((byte) -42, var4_ref, var3_ref);
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
          try {
            L0: {
              if (param1 > 57) {
                break L0;
              } else {
                Lexicominos.o(111);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          uh.field_D = param0;
          ij.field_p = param2;
        }
    }

    private final void a(int param0, db param1, db param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = lf.field_b;
                        var6 = lf.field_f;
                        var7 = lf.field_a;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param2.b();
                        pa.field_a.b(0, 0);
                        if ((param3 ^ -1) > -1) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vg.field_d[param3].d(48);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        el.field_c.d(param0 ^ 22018);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param1.b();
                        if (param0 == 22110) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_G = -106;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        va.field_m.b(0, 0);
                        if (0 <= param3) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        el.field_c.b((byte) 62);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        vg.field_d[param3].c(param0 + -22109);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        lf.a(var5, var6, var7);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    try {
                        stackOut_23_0 = (RuntimeException) var5_ref;
                        stackOut_23_1 = new StringBuilder().append("Lexicominos.KA(").append(param0).append(44);
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (param1 == null) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                        stackOut_24_2 = "{...}";
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_27_2 = stackOut_24_2;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 26: {
                    stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                    stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                    stackOut_26_2 = "null";
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                        stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        if (param2 == null) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                        stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                        stackOut_28_2 = "{...}";
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_31_2 = stackOut_28_2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 30: {
                    stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                    stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                    stackOut_30_2 = "null";
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw ld.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param3 + 41);
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_100_0 = 0;
        byte stackIn_118_0 = 0;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_136_2 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_99_0 = 0;
        byte stackOut_117_0 = 0;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        String stackOut_137_2 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-3 != (((Lexicominos) this).field_J ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = tj.field_i;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((stackIn_3_0 ^ -1) <= -21) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((Lexicominos) this).field_J = 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((Lexicominos) this).field_J == 1) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-13 >= (tj.field_i ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((Lexicominos) this).field_J = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (tj.field_i <= 28) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((Lexicominos) this).field_J = 2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (0 != ((Lexicominos) this).field_J) {
                            statePc = 28;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 16;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 < tj.field_i) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((Lexicominos) this).field_J = 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (0 == ((Lexicominos) this).field_J) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param5 = 307199;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (0 > param5) {
                            statePc = 43;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10_int = param6[param5];
                        if (0 == (var10_int ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param3 = 311 * ((2044 & var10_int) >> -1103444990) + (var10_int >> 375933229 & 511);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var10_int ^ -1) <= -1) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param4[param5] = param1[param3];
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        param4[param5] = param8[param3];
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        param5--;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return;
                }
                case 44: {
                    try {
                        if (((Lexicominos) this).field_J != 1) {
                            statePc = 68;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        param5 = 307199;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (0 > param5) {
                            statePc = 67;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var10_int = param6[param5];
                        if ((var10_int ^ -1) == 0) {
                            statePc = 66;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param2 = var10_int >> 2120236907 & 3;
                        param3 = 311 * ((var10_int & 2044) >> -636547966) + ((var10_int & 4193849) >> 1018580429);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (0 > var10_int) {
                            statePc = 58;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-1 == (param2 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11 = param8[param3];
                        var12 = param8[1 + param3];
                        var13 = param2 * (16711935 & var12) + (4 + -param2) * (var11 & 16711935) >> 1609487170;
                        var14 = (var11 & 65280) * (4 - param2) - -(param2 * (var12 & 65280)) >> 584790690;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        param4[param5] = tb.a(vg.a(var14, 65280), vg.a(16711935, var13));
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        param4[param5] = param8[param3];
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((param2 ^ -1) == -1) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var11 = param1[param3];
                        var12 = param1[1 + param3];
                        var13 = (4 + -param2) * (var11 & 16711935) - -((var12 & 16711935) * param2) >> -384903454;
                        var14 = (65280 & var12) * param2 + (4 - param2) * (var11 & 65280) >> -1599835070;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        param4[param5] = tb.a(vg.a(16711935, var13), vg.a(65280, var14));
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        param4[param5] = param1[param3];
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        param5--;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 67: {
                    return;
                }
                case 68: {
                    try {
                        param5 = 307199;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (param5 < 0) {
                            statePc = 117;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var10_int = param6[param5];
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((var10_int ^ -1) == 0) {
                            statePc = 116;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        param0 = 3 & var10_int;
                        param2 = var10_int >> 1824052683 & 3;
                        param3 = ((var10_int & 4186687) >> 190414509) + ((2044 & var10_int) >> 520261154) * 311;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((var10_int ^ -1) <= -1) {
                            statePc = 96;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (param2 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (param0 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var11 = param1[param3];
                        var12 = param1[param3 + 1];
                        var13 = param1[param3 + 311];
                        var14 = param1[312 + param3];
                        var15 = param0 * ((16711935 & var14) * param2 + (-param2 + 4) * (var13 & 16711935)) + ((16711935 & var11) * (4 + -param2) - -(param2 * (var12 & 16711935))) * (4 + -param0) >> -1389752412;
                        var16 = (4 - param0) * ((var11 & 65280) * (-param2 + 4) - -(param2 * (var12 & 65280))) - -(param0 * (param2 * (var14 & 65280) + (4 - param2) * (var13 & 65280))) >> 149256836;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        param4[param5] = tb.a(vg.a(65280, var16), vg.a(16711935, var15));
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-1 != (param2 ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (param0 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        param4[param5] = param1[param3];
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var11 = param1[param3];
                        var12 = param1[param3 + 311];
                        var13 = (16711935 & var11) * (-param0 + 4) + param0 * (var12 & 16711935) >> 901625026;
                        var14 = param0 * (var12 & 65280) + (65280 & var11) * (-param0 + 4) >> -1684271422;
                        param4[param5] = tb.a(vg.a(var14, 65280), vg.a(var13, 16711935));
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var11 = param1[param3];
                        var12 = param1[param3 + 1];
                        var13 = (16711935 & var12) * param2 + (4 + -param2) * (16711935 & var11) >> -575889438;
                        var14 = (65280 & var12) * param2 + (65280 & var11) * (4 + -param2) >> -62624510;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        param4[param5] = tb.a(vg.a(var13, 16711935), vg.a(var14, 65280));
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (param2 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = param0;
                        stackIn_100_0 = stackOut_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0 != 0) {
                            statePc = 115;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (-1 != (param2 ^ -1)) {
                            statePc = 114;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if ((param0 ^ -1) == -1) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var11 = param8[param3];
                        var12 = param8[311 + param3];
                        var13 = (16711935 & var11) * (4 + -param0) - -((var12 & 16711935) * param0) >> 1075790434;
                        var14 = (65280 & var11) * (-param0 + 4) - -(param0 * (65280 & var12)) >> -919400478;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        param4[param5] = tb.a(vg.a(65280, var14), vg.a(16711935, var13));
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        param4[param5] = param8[param3];
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var11 = param8[param3];
                        var12 = param8[1 + param3];
                        var13 = param2 * (var12 & 16711935) + (16711935 & var11) * (-param2 + 4) >> 1269091458;
                        var14 = (-param2 + 4) * (var11 & 65280) + param2 * (var12 & 65280) >> 1806435714;
                        param4[param5] = tb.a(vg.a(var14, 65280), vg.a(16711935, var13));
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var11 = param8[param3];
                        var12 = param8[param3 - -1];
                        var13 = param8[311 + param3];
                        var14 = param8[311 + param3 - -1];
                        var15 = (4 - param0) * (param2 * (16711935 & var12) + (4 - param2) * (var11 & 16711935)) + param0 * ((16711935 & var13) * (4 - param2) - -((16711935 & var14) * param2)) >> 899412868;
                        var16 = ((var13 & 65280) * (4 + -param2) + (65280 & var14) * param2) * param0 + ((4 - param2) * (65280 & var11) - -(param2 * (var12 & 65280))) * (-param0 + 4) >> 360688932;
                        param4[param5] = tb.a(vg.a(var16, 65280), vg.a(var15, 16711935));
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        param5--;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = param7;
                        stackIn_118_0 = stackOut_117_0;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (stackIn_118_0 > 109) {
                            statePc = 141;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        field_E = true;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 123: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    try {
                        stackOut_124_0 = (RuntimeException) var10;
                        stackOut_124_1 = new StringBuilder().append("Lexicominos.WA(").append(param0).append(44);
                        stackIn_127_0 = stackOut_124_0;
                        stackIn_127_1 = stackOut_124_1;
                        stackIn_125_0 = stackOut_124_0;
                        stackIn_125_1 = stackOut_124_1;
                        if (param1 == null) {
                            statePc = 127;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
                        stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
                        stackOut_125_2 = "{...}";
                        stackIn_128_0 = stackOut_125_0;
                        stackIn_128_1 = stackOut_125_1;
                        stackIn_128_2 = stackOut_125_2;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 126: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 127: {
                    stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
                    stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
                    stackOut_127_2 = "null";
                    stackIn_128_0 = stackOut_127_0;
                    stackIn_128_1 = stackOut_127_1;
                    stackIn_128_2 = stackOut_127_2;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    try {
                        stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
                        stackOut_128_1 = ((StringBuilder) (Object) stackIn_128_1).append(stackIn_128_2).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_131_0 = stackOut_128_0;
                        stackIn_131_1 = stackOut_128_1;
                        stackIn_129_0 = stackOut_128_0;
                        stackIn_129_1 = stackOut_128_1;
                        if (param4 == null) {
                            statePc = 131;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
                        stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
                        stackOut_129_2 = "{...}";
                        stackIn_132_0 = stackOut_129_0;
                        stackIn_132_1 = stackOut_129_1;
                        stackIn_132_2 = stackOut_129_2;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 130: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 131: {
                    stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
                    stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
                    stackOut_131_2 = "null";
                    stackIn_132_0 = stackOut_131_0;
                    stackIn_132_1 = stackOut_131_1;
                    stackIn_132_2 = stackOut_131_2;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    try {
                        stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
                        stackOut_132_1 = ((StringBuilder) (Object) stackIn_132_1).append(stackIn_132_2).append(44).append(param5).append(44);
                        stackIn_135_0 = stackOut_132_0;
                        stackIn_135_1 = stackOut_132_1;
                        stackIn_133_0 = stackOut_132_0;
                        stackIn_133_1 = stackOut_132_1;
                        if (param6 == null) {
                            statePc = 135;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
                        stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
                        stackOut_133_2 = "{...}";
                        stackIn_136_0 = stackOut_133_0;
                        stackIn_136_1 = stackOut_133_1;
                        stackIn_136_2 = stackOut_133_2;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 134: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 135: {
                    stackOut_135_0 = (RuntimeException) (Object) stackIn_135_0;
                    stackOut_135_1 = (StringBuilder) (Object) stackIn_135_1;
                    stackOut_135_2 = "null";
                    stackIn_136_0 = stackOut_135_0;
                    stackIn_136_1 = stackOut_135_1;
                    stackIn_136_2 = stackOut_135_2;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    try {
                        stackOut_136_0 = (RuntimeException) (Object) stackIn_136_0;
                        stackOut_136_1 = ((StringBuilder) (Object) stackIn_136_1).append(stackIn_136_2).append(44).append(param7).append(44);
                        stackIn_139_0 = stackOut_136_0;
                        stackIn_139_1 = stackOut_136_1;
                        stackIn_137_0 = stackOut_136_0;
                        stackIn_137_1 = stackOut_136_1;
                        if (param8 == null) {
                            statePc = 139;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
                        stackOut_137_1 = (StringBuilder) (Object) stackIn_137_1;
                        stackOut_137_2 = "{...}";
                        stackIn_140_0 = stackOut_137_0;
                        stackIn_140_1 = stackOut_137_1;
                        stackIn_140_2 = stackOut_137_2;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 138: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 139: {
                    stackOut_139_0 = (RuntimeException) (Object) stackIn_139_0;
                    stackOut_139_1 = (StringBuilder) (Object) stackIn_139_1;
                    stackOut_139_2 = "null";
                    stackIn_140_0 = stackOut_139_0;
                    stackIn_140_1 = stackOut_139_1;
                    stackIn_140_2 = stackOut_139_2;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    throw ld.a((Throwable) (Object) stackIn_140_0, stackIn_140_2 + 41);
                }
                case 141: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
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
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((Lexicominos) this).field_K = false;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "Lexicominos.I(" + param0 + 41);
                }
                case 8: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        nh.a(0, 1000000, 6, true);
                        if (ki.a((byte) -118)) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        vc.field_D = ce.a(4, 109);
                        hh.field_N = ud.a(1, -108, 10, 3, 9);
                        al.a(16, ef.field_c, 100.0f);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == -83) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((Lexicominos) this).b(true);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        fi.a(false);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "Lexicominos.PA(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        Object stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 1;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (ki.a((byte) -120)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!((Lexicominos) this).field_K) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 1;
                        stackIn_11_0 = stackOut_8_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "Lexicominos.TA(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(boolean param0) {
        vb var2 = null;
        RuntimeException var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ki.a((byte) -119)) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = (vb) (Object) rb.field_b.a((byte) 56);
                        if (var2 != null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        eh.a(var2, 4, (byte) -4);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!td.a(fg.field_f, param0)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((Lexicominos) this).m(-6721);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        kc.a(0, -1);
                        var2_int = param0 ? 1 : 0;
                        if (!d.a((byte) -56)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = ((Lexicominos) this).n(6);
                        if (var3 != 2) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var2_int != 0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        wi.a(12, bi.field_a.field_E * 3 >> -1883778623, (byte) -123, (le) (Object) bi.field_a, 4, 4, bi.field_a.field_E - -1, 240, 320, jh.field_b, nh.field_c);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2_ref, "Lexicominos.NA(" + param0 + 41);
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void h(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null == eg.field_C) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ce.a(false, eg.field_C);
                        eg.field_C = null;
                        dl.b(5);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        dl.field_d = oj.a(false, 1);
                        ci.field_a = oj.a(false, 2);
                        gl.field_a = oj.a(false, 3);
                        hh.field_L = oj.a(false, 5);
                        ga.field_a = oj.a(false, 6);
                        ec.field_b = oj.a(false, 7);
                        if (param0 > 77) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        boolean discarded$3 = this.p(71);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        hc.field_gb = oj.a(false, 8);
                        ci.field_e = oj.a(false, 9);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "Lexicominos.RA(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 40) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        boolean discarded$3 = this.p(56);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ce.field_b.a();
                        ik.field_h.a();
                        if (ff.field_b == null) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        af.a(-65);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ca.c(false);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "Lexicominos.K(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        java.awt.Canvas stackOut_2_0 = null;
        ra stackOut_4_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_10_1 = false;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_89_0 = 0;
        boolean stackOut_92_0 = false;
        int stackOut_94_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        var2_ref = null;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ff.field_b != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = ug.field_y;
                        stackIn_5_0 = (Object) (Object) stackOut_2_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = ff.field_b;
                        stackIn_5_0 = (Object) (Object) stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_ref = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (lh.b(-24921)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 57;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (ff.field_b != null) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = vi.field_j;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1 ? 1 : 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ga.a((byte) stackIn_13_0, stackIn_13_1 != 0, (java.awt.Canvas) var2_ref);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        uj.a(106, (java.awt.Canvas) var2_ref);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 100: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "Lexicominos.D(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int[] param0, int[] param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        this.a(0, param1, 0, 0, lf.field_b, 0, qb.field_b, (byte) 121, param0);
                        if (!param2) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_I = null;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("Lexicominos.MA(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        ra stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_134_0 = 0;
        fc stackIn_171_0 = null;
        fc stackIn_175_0 = null;
        int stackIn_183_0 = 0;
        sg[] stackIn_205_0 = null;
        fc stackIn_213_0 = null;
        sg[] stackIn_233_0 = null;
        int stackIn_241_0 = 0;
        int stackIn_287_0 = 0;
        int stackIn_296_0 = 0;
        fc stackIn_300_0 = null;
        fc stackIn_315_0 = null;
        PrintStream stackIn_319_0 = null;
        StringBuilder stackIn_319_1 = null;
        char stackIn_319_2 = 0;
        PrintStream stackIn_321_0 = null;
        StringBuilder stackIn_321_1 = null;
        char stackIn_321_2 = 0;
        PrintStream stackIn_323_0 = null;
        StringBuilder stackIn_323_1 = null;
        char stackIn_323_2 = 0;
        PrintStream stackIn_324_0 = null;
        StringBuilder stackIn_324_1 = null;
        char stackIn_324_2 = 0;
        int stackIn_324_3 = 0;
        int stackIn_336_0 = 0;
        char stackIn_344_0 = 0;
        char stackIn_352_0 = 0;
        fc stackIn_361_0 = null;
        fc stackIn_363_0 = null;
        fc stackIn_364_0 = null;
        int stackIn_364_1 = 0;
        int stackIn_366_0 = 0;
        int stackIn_366_1 = 0;
        ra stackOut_2_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        vi stackOut_38_0 = null;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_94_0 = null;
        int stackOut_97_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_133_0 = 0;
        fc stackOut_170_0 = null;
        fc stackOut_174_0 = null;
        int stackOut_182_0 = 0;
        sg[] stackOut_204_0 = null;
        fc stackOut_212_0 = null;
        sg[] stackOut_232_0 = null;
        int stackOut_240_0 = 0;
        int stackOut_284_0 = 0;
        int stackOut_286_0 = 0;
        int stackOut_295_0 = 0;
        fc stackOut_299_0 = null;
        fc stackOut_314_0 = null;
        PrintStream stackOut_318_0 = null;
        StringBuilder stackOut_318_1 = null;
        char stackOut_318_2 = 0;
        PrintStream stackOut_319_0 = null;
        StringBuilder stackOut_319_1 = null;
        char stackOut_319_2 = 0;
        PrintStream stackOut_321_0 = null;
        StringBuilder stackOut_321_1 = null;
        char stackOut_321_2 = 0;
        int stackOut_321_3 = 0;
        PrintStream stackOut_323_0 = null;
        StringBuilder stackOut_323_1 = null;
        char stackOut_323_2 = 0;
        int stackOut_323_3 = 0;
        int stackOut_335_0 = 0;
        char stackOut_343_0 = 0;
        char stackOut_351_0 = 0;
        fc stackOut_360_0 = null;
        fc stackOut_361_0 = null;
        int stackOut_361_1 = 0;
        fc stackOut_363_0 = null;
        int stackOut_363_1 = 0;
        int stackOut_365_0 = 0;
        int stackOut_365_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ce.field_b.e();
                        ik.field_h.e();
                        if (null == ff.field_b) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = ff.field_b;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0.field_d) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        af.a(-53);
                        ce.b(4);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (null == ff.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((Lexicominos) this).c(stackIn_13_1 != 0, -1);
                        if (ne.field_e) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.h((byte) 121);
                        ne.field_e = false;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!lh.b(-24921)) {
                            statePc = 30;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((Lexicominos) this).e((byte) 49);
                        if (lh.b(-24921)) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!ha.a(89)) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        boolean discarded$6 = this.a((byte) -86, false);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return;
                }
                case 30: {
                    try {
                        var2_int = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        hb.a(gd.field_l, true);
                        if (!this.a((byte) -86, true)) {
                            statePc = 135;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (param0) {
                            statePc = 133;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = 1;
                        stackIn_134_0 = stackOut_131_0;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackOut_133_0 = 0;
                        stackIn_134_0 = stackOut_133_0;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        kj.c(stackIn_134_0 != 0);
                        this.g((byte) -83);
                        dl.b(5);
                        oj.field_g = true;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (var2_int == 0) {
                            statePc = 370;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (-1 == (je.field_a ^ -1)) {
                            statePc = 198;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (-2 != (je.field_a ^ -1)) {
                            statePc = 155;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        ed.field_v = ed.field_v + 1;
                        if (-33 == (ed.field_v + 1 ^ -1)) {
                            statePc = 147;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (!ra.a(-17977)) {
                            statePc = 151;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        pl.a((byte) -85);
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        mk.a(14891);
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        je.field_a = 2;
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (2 == je.field_a) {
                            statePc = 164;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        ed.field_v = ed.field_v - 1;
                        if (-1 != (ed.field_v - 1 ^ -1)) {
                            statePc = 370;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        je.field_a = 0;
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (ki.a((byte) -115)) {
                            statePc = 190;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (el.field_c == null) {
                            statePc = 181;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackOut_170_0 = el.field_c;
                        stackIn_171_0 = stackOut_170_0;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (stackIn_171_0.field_J <= 0) {
                            statePc = 181;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackOut_174_0 = el.field_c;
                        stackIn_175_0 = stackOut_174_0;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        if (stackIn_175_0.field_h) {
                            statePc = 181;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        ki.field_d = gl.a(65526, 9, el.field_c.field_i, 3, el.field_c.field_f, (byte) 56, el.field_c.field_R, new int[1], el.field_c.field_a);
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        hh.field_N = ud.a(1, -118, 10, 3, 9);
                        aa.field_j = hf.field_a;
                        if (7 != aa.field_j) {
                            statePc = 189;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        stackOut_182_0 = -1;
                        stackIn_183_0 = stackOut_182_0;
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        if (stackIn_183_0 != (ee.field_a ^ -1)) {
                            statePc = 189;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        aa.field_j = 1;
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        al.a(16, ef.field_c, 100.0f);
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        aa.field_j = hc.field_db;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (2 != (aa.field_j ^ -1)) {
                            statePc = 197;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        aa.field_j = 0;
                        kl.a(3 * bi.field_a.field_E >> 1806035777, 4, 320, jh.field_b, 12, (le) (Object) bi.field_a, 4, (byte) 86, nh.field_c, false, 1 + bi.field_a.field_E, 240);
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        je.field_a = 3;
                        th.field_r = aa.field_j;
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        if ((th.field_r ^ -1) == (aa.field_j ^ -1)) {
                            statePc = 250;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        statePc = 201;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        ed.field_v = ed.field_v + cg.field_j;
                        if ((aa.field_j ^ -1) > -1) {
                            statePc = 211;
                        } else {
                            statePc = 202;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        stackOut_204_0 = vg.field_d;
                        stackIn_205_0 = stackOut_204_0;
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        if (stackIn_205_0[aa.field_j].field_m == null) {
                            statePc = 211;
                        } else {
                            statePc = 206;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        vg.field_d[aa.field_j].field_m.b(2);
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        if (-1 < (aa.field_j ^ -1)) {
                            statePc = 219;
                        } else {
                            statePc = 212;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        stackOut_212_0 = el.field_c;
                        stackIn_213_0 = stackOut_212_0;
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (stackIn_213_0 != null) {
                            statePc = 218;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        el.field_c.b(2);
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        if (((ed.field_v + -20) * cg.field_j ^ -1) > -21) {
                            statePc = 370;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        if (th.field_r != -2) {
                            statePc = 229;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        if (ed.field_v != 40) {
                            statePc = 370;
                        } else {
                            statePc = 224;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        ge.a(0, kk.c(-14047));
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        if (-1 < (aa.field_j ^ -1)) {
                            statePc = 239;
                        } else {
                            statePc = 230;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        stackOut_232_0 = vg.field_d;
                        stackIn_233_0 = stackOut_232_0;
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        if (stackIn_233_0[aa.field_j].field_m == null) {
                            statePc = 239;
                        } else {
                            statePc = 234;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        th.field_o[2].e(0);
                        vg.field_d[aa.field_j].field_m = null;
                        statePc = 237;
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        statePc = 239;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        if (6 != aa.field_j) {
                            statePc = 247;
                        } else {
                            statePc = 240;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        stackOut_240_0 = th.field_r;
                        stackIn_241_0 = stackOut_240_0;
                        statePc = 241;
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        if ((stackIn_241_0 ^ -1) == -1) {
                            statePc = 246;
                        } else {
                            statePc = 242;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        statePc = 244;
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        sc.field_g = 0;
                        ee.field_a = 0;
                        rb.field_b.g(-105);
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        aa.field_j = th.field_r;
                        if (aa.field_j == -1) {
                            statePc = 370;
                        } else {
                            statePc = 248;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        if (aa.field_j == -1) {
                            statePc = 257;
                        } else {
                            statePc = 251;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        vg.field_d[aa.field_j].a((byte) -88);
                        if (el.field_c != null) {
                            statePc = 256;
                        } else {
                            statePc = 252;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        statePc = 254;
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        el.field_c.b(2);
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        if (!ji.a((byte) -72)) {
                            statePc = 365;
                        } else {
                            statePc = 258;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        statePc = 260;
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        if ((da.field_b ^ -1) != -14) {
                            statePc = 268;
                        } else {
                            statePc = 261;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 263;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        if (-3 >= (vb.field_i ^ -1)) {
                            statePc = 266;
                        } else {
                            statePc = 262;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 265;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        statePc = 264;
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 265;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 265;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 265;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        StringBuilder discarded$7 = ob.a(0, sk.field_a, (byte) 22, ' ');
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        ((Lexicominos) this).a((byte) -77, false, 2, -1);
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        if (2 > vb.field_i) {
                            statePc = 257;
                        } else {
                            statePc = 269;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        if (da.field_b != 84) {
                            statePc = 275;
                        } else {
                            statePc = 270;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 271;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        statePc = 272;
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        StringBuilder discarded$8 = ob.a(0, sk.field_a, (byte) 22, ' ');
                        statePc = 294;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        if (!ci.a(true, pe.field_b)) {
                            statePc = 294;
                        } else {
                            statePc = 276;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        StringBuilder discarded$9 = sk.field_a.append(pe.field_b);
                        if (na.a(1048576, (CharSequence) (Object) sk.field_a) != -26658124) {
                            statePc = 288;
                        } else {
                            statePc = 279;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        statePc = 281;
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        if (mg.field_B) {
                            statePc = 286;
                        } else {
                            statePc = 282;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        statePc = 284;
                        continue stateLoop;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        stackOut_284_0 = 1;
                        stackIn_287_0 = stackOut_284_0;
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        stackOut_286_0 = 0;
                        stackIn_287_0 = stackOut_286_0;
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        mg.field_B = stackIn_287_0 != 0;
                        StringBuilder discarded$10 = ob.a(0, sk.field_a, (byte) 22, ' ');
                        statePc = 294;
                        continue stateLoop;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 290;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        if (1039745816 != (na.a(1048576, (CharSequence) (Object) sk.field_a) ^ -1)) {
                            statePc = 294;
                        } else {
                            statePc = 289;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        statePc = 291;
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        mg.field_B = false;
                        StringBuilder discarded$11 = ob.a(0, sk.field_a, (byte) 22, ' ');
                        statePc = 292;
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        statePc = 294;
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        if (null == el.field_c) {
                            statePc = 313;
                        } else {
                            statePc = 295;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        stackOut_295_0 = -51;
                        stackIn_296_0 = stackOut_295_0;
                        statePc = 296;
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        if (stackIn_296_0 != (da.field_b ^ -1)) {
                            statePc = 313;
                        } else {
                            statePc = 297;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 302;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        statePc = 299;
                        continue stateLoop;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 302;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_298) {
                        caughtException = stateCaught_298;
                        statePc = 302;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        stackOut_299_0 = el.field_c;
                        stackIn_300_0 = stackOut_299_0;
                        statePc = 300;
                        continue stateLoop;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 302;
                        continue stateLoop;
                    }
                }
                case 300: {
                    try {
                        if ((stackIn_300_0.field_d ^ -1) > -17) {
                            statePc = 305;
                        } else {
                            statePc = 301;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_300) {
                        caughtException = stateCaught_300;
                        statePc = 304;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        statePc = 303;
                        continue stateLoop;
                    } catch (Throwable stateCaught_301) {
                        caughtException = stateCaught_301;
                        statePc = 304;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_302) {
                        caughtException = stateCaught_302;
                        statePc = 304;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        statePc = 313;
                        continue stateLoop;
                    } catch (Throwable stateCaught_303) {
                        caughtException = stateCaught_303;
                        statePc = 304;
                        continue stateLoop;
                    }
                }
                case 304: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_304) {
                        caughtException = stateCaught_304;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 305: {
                    try {
                        el.field_c.field_t = el.field_c.field_t + 8;
                        var3 = (el.field_c.field_t >> 691519107) + 1;
                        statePc = 306;
                        continue stateLoop;
                    } catch (Throwable stateCaught_305) {
                        caughtException = stateCaught_305;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 306: {
                    try {
                        if (el.field_c.field_d < var3) {
                            statePc = 309;
                        } else {
                            statePc = 307;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_306) {
                        caughtException = stateCaught_306;
                        statePc = 308;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        statePc = 313;
                        continue stateLoop;
                    } catch (Throwable stateCaught_307) {
                        caughtException = stateCaught_307;
                        statePc = 308;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_308) {
                        caughtException = stateCaught_308;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 309: {
                    try {
                        el.field_c.field_d = el.field_c.field_d + 1;
                        el.field_c.field_s = 0;
                        if (1 == (el.field_c.field_d & 1)) {
                            statePc = 312;
                        } else {
                            statePc = 310;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 311;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        statePc = 313;
                        continue stateLoop;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 311;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 312: {
                    try {
                        ki.a(40000 * el.field_c.field_d + 960000, el.field_c.field_I, -127);
                        statePc = 313;
                        continue stateLoop;
                    } catch (Throwable stateCaught_312) {
                        caughtException = stateCaught_312;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        if (null == el.field_c) {
                            statePc = 342;
                        } else {
                            statePc = 314;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 317;
                        continue stateLoop;
                    }
                }
                case 314: {
                    try {
                        stackOut_314_0 = el.field_c;
                        stackIn_315_0 = stackOut_314_0;
                        statePc = 315;
                        continue stateLoop;
                    } catch (Throwable stateCaught_314) {
                        caughtException = stateCaught_314;
                        statePc = 317;
                        continue stateLoop;
                    }
                }
                case 315: {
                    try {
                        if (!stackIn_315_0.field_T) {
                            statePc = 342;
                        } else {
                            statePc = 316;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_315) {
                        caughtException = stateCaught_315;
                        statePc = 320;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        statePc = 318;
                        continue stateLoop;
                    } catch (Throwable stateCaught_316) {
                        caughtException = stateCaught_316;
                        statePc = 320;
                        continue stateLoop;
                    }
                }
                case 317: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_317) {
                        caughtException = stateCaught_317;
                        statePc = 320;
                        continue stateLoop;
                    }
                }
                case 318: {
                    try {
                        stackOut_318_0 = System.out;
                        stackOut_318_1 = new StringBuilder().append("keycode=").append(da.field_b).append("; keychar=");
                        stackOut_318_2 = pe.field_b;
                        stackIn_323_0 = stackOut_318_0;
                        stackIn_323_1 = stackOut_318_1;
                        stackIn_323_2 = stackOut_318_2;
                        stackIn_319_0 = stackOut_318_0;
                        stackIn_319_1 = stackOut_318_1;
                        stackIn_319_2 = stackOut_318_2;
                        if (param0) {
                            statePc = 323;
                        } else {
                            statePc = 319;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_318) {
                        caughtException = stateCaught_318;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 319: {
                    try {
                        stackOut_319_0 = (PrintStream) (Object) stackIn_319_0;
                        stackOut_319_1 = (StringBuilder) (Object) stackIn_319_1;
                        stackOut_319_2 = stackIn_319_2;
                        stackIn_321_0 = stackOut_319_0;
                        stackIn_321_1 = stackOut_319_1;
                        stackIn_321_2 = stackOut_319_2;
                        statePc = 321;
                        continue stateLoop;
                    } catch (Throwable stateCaught_319) {
                        caughtException = stateCaught_319;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 320: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_320) {
                        caughtException = stateCaught_320;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 321: {
                    try {
                        stackOut_321_0 = (PrintStream) (Object) stackIn_321_0;
                        stackOut_321_1 = (StringBuilder) (Object) stackIn_321_1;
                        stackOut_321_2 = stackIn_321_2;
                        stackOut_321_3 = 1;
                        stackIn_324_0 = stackOut_321_0;
                        stackIn_324_1 = stackOut_321_1;
                        stackIn_324_2 = stackOut_321_2;
                        stackIn_324_3 = stackOut_321_3;
                        statePc = 324;
                        continue stateLoop;
                    } catch (Throwable stateCaught_321) {
                        caughtException = stateCaught_321;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_322) {
                        caughtException = stateCaught_322;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 323: {
                    try {
                        stackOut_323_0 = (PrintStream) (Object) stackIn_323_0;
                        stackOut_323_1 = (StringBuilder) (Object) stackIn_323_1;
                        stackOut_323_2 = stackIn_323_2;
                        stackOut_323_3 = 0;
                        stackIn_324_0 = stackOut_323_0;
                        stackIn_324_1 = stackOut_323_1;
                        stackIn_324_2 = stackOut_323_2;
                        stackIn_324_3 = stackOut_323_3;
                        statePc = 324;
                        continue stateLoop;
                    } catch (Throwable stateCaught_323) {
                        caughtException = stateCaught_323;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 324: {
                    try {
                        ((PrintStream) (Object) stackIn_324_0).println(String.valueOf(va.a(stackIn_324_2, stackIn_324_3 != 0)));
                        if (65 > pe.field_b) {
                            statePc = 334;
                        } else {
                            statePc = 325;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_324) {
                        caughtException = stateCaught_324;
                        statePc = 327;
                        continue stateLoop;
                    }
                }
                case 325: {
                    try {
                        if ((pe.field_b ^ -1) < -91) {
                            statePc = 334;
                        } else {
                            statePc = 326;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_325) {
                        caughtException = stateCaught_325;
                        statePc = 327;
                        continue stateLoop;
                    }
                }
                case 326: {
                    try {
                        statePc = 328;
                        continue stateLoop;
                    } catch (Throwable stateCaught_326) {
                        caughtException = stateCaught_326;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 327: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_327) {
                        caughtException = stateCaught_327;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        var3 = 0;
                        statePc = 329;
                        continue stateLoop;
                    } catch (Throwable stateCaught_328) {
                        caughtException = stateCaught_328;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 329: {
                    try {
                        if ((var3 ^ -1) <= -5) {
                            statePc = 333;
                        } else {
                            statePc = 330;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_329) {
                        caughtException = stateCaught_329;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 330: {
                    try {
                        el.field_c.field_Q.field_h[var3] = pe.field_b;
                        var3++;
                        statePc = 329;
                        continue stateLoop;
                    } catch (Throwable stateCaught_330) {
                        caughtException = stateCaught_330;
                        statePc = 332;
                        continue stateLoop;
                    }
                }
                case 332: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_332) {
                        caughtException = stateCaught_332;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        el.field_c.field_h = true;
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_333) {
                        caughtException = stateCaught_333;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 334: {
                    try {
                        if (-50 < (pe.field_b ^ -1)) {
                            statePc = 342;
                        } else {
                            statePc = 335;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_334) {
                        caughtException = stateCaught_334;
                        statePc = 338;
                        continue stateLoop;
                    }
                }
                case 335: {
                    try {
                        stackOut_335_0 = 55;
                        stackIn_336_0 = stackOut_335_0;
                        statePc = 336;
                        continue stateLoop;
                    } catch (Throwable stateCaught_335) {
                        caughtException = stateCaught_335;
                        statePc = 338;
                        continue stateLoop;
                    }
                }
                case 336: {
                    try {
                        if (stackIn_336_0 >= pe.field_b) {
                            statePc = 341;
                        } else {
                            statePc = 337;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_336) {
                        caughtException = stateCaught_336;
                        statePc = 340;
                        continue stateLoop;
                    }
                }
                case 337: {
                    try {
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_337) {
                        caughtException = stateCaught_337;
                        statePc = 340;
                        continue stateLoop;
                    }
                }
                case 338: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_338) {
                        caughtException = stateCaught_338;
                        statePc = 340;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        statePc = 342;
                        continue stateLoop;
                    } catch (Throwable stateCaught_339) {
                        caughtException = stateCaught_339;
                        statePc = 340;
                        continue stateLoop;
                    }
                }
                case 340: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_340) {
                        caughtException = stateCaught_340;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 341: {
                    try {
                        el.field_c.field_Q = new ha(el.field_c, -49 + pe.field_b, el.field_c.field_Q.field_h);
                        el.field_c.field_h = true;
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_341) {
                        caughtException = stateCaught_341;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 342: {
                    try {
                        if (null == el.field_c) {
                            statePc = 350;
                        } else {
                            statePc = 343;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_342) {
                        caughtException = stateCaught_342;
                        statePc = 346;
                        continue stateLoop;
                    }
                }
                case 343: {
                    try {
                        stackOut_343_0 = pe.field_b;
                        stackIn_344_0 = stackOut_343_0;
                        statePc = 344;
                        continue stateLoop;
                    } catch (Throwable stateCaught_343) {
                        caughtException = stateCaught_343;
                        statePc = 346;
                        continue stateLoop;
                    }
                }
                case 344: {
                    try {
                        if ((stackIn_344_0 ^ -1) != -103) {
                            statePc = 350;
                        } else {
                            statePc = 345;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_344) {
                        caughtException = stateCaught_344;
                        statePc = 349;
                        continue stateLoop;
                    }
                }
                case 345: {
                    try {
                        statePc = 347;
                        continue stateLoop;
                    } catch (Throwable stateCaught_345) {
                        caughtException = stateCaught_345;
                        statePc = 349;
                        continue stateLoop;
                    }
                }
                case 346: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_346) {
                        caughtException = stateCaught_346;
                        statePc = 349;
                        continue stateLoop;
                    }
                }
                case 347: {
                    try {
                        el.field_c.field_T = true;
                        statePc = 348;
                        continue stateLoop;
                    } catch (Throwable stateCaught_347) {
                        caughtException = stateCaught_347;
                        statePc = 349;
                        continue stateLoop;
                    }
                }
                case 348: {
                    try {
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_348) {
                        caughtException = stateCaught_348;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 349: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_349) {
                        caughtException = stateCaught_349;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 350: {
                    try {
                        if (el.field_c == null) {
                            statePc = 358;
                        } else {
                            statePc = 351;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_350) {
                        caughtException = stateCaught_350;
                        statePc = 354;
                        continue stateLoop;
                    }
                }
                case 351: {
                    try {
                        stackOut_351_0 = pe.field_b;
                        stackIn_352_0 = stackOut_351_0;
                        statePc = 352;
                        continue stateLoop;
                    } catch (Throwable stateCaught_351) {
                        caughtException = stateCaught_351;
                        statePc = 354;
                        continue stateLoop;
                    }
                }
                case 352: {
                    try {
                        if ((stackIn_352_0 ^ -1) != -118) {
                            statePc = 358;
                        } else {
                            statePc = 353;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_352) {
                        caughtException = stateCaught_352;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 353: {
                    try {
                        statePc = 355;
                        continue stateLoop;
                    } catch (Throwable stateCaught_353) {
                        caughtException = stateCaught_353;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 354: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_354) {
                        caughtException = stateCaught_354;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 355: {
                    try {
                        el.field_c.field_T = false;
                        statePc = 356;
                        continue stateLoop;
                    } catch (Throwable stateCaught_355) {
                        caughtException = stateCaught_355;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 356: {
                    try {
                        statePc = 358;
                        continue stateLoop;
                    } catch (Throwable stateCaught_356) {
                        caughtException = stateCaught_356;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 357: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_357) {
                        caughtException = stateCaught_357;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 358: {
                    try {
                        if (el.field_c == null) {
                            statePc = 257;
                        } else {
                            statePc = 359;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_358) {
                        caughtException = stateCaught_358;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 359: {
                    try {
                        if (pe.field_b != 105) {
                            statePc = 257;
                        } else {
                            statePc = 360;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_359) {
                        caughtException = stateCaught_359;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 360: {
                    try {
                        stackOut_360_0 = el.field_c;
                        stackIn_363_0 = stackOut_360_0;
                        stackIn_361_0 = stackOut_360_0;
                        if (el.field_c.field_D) {
                            statePc = 363;
                        } else {
                            statePc = 361;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_360) {
                        caughtException = stateCaught_360;
                        statePc = 362;
                        continue stateLoop;
                    }
                }
                case 361: {
                    try {
                        stackOut_361_0 = (fc) (Object) stackIn_361_0;
                        stackOut_361_1 = 1;
                        stackIn_364_0 = stackOut_361_0;
                        stackIn_364_1 = stackOut_361_1;
                        statePc = 364;
                        continue stateLoop;
                    } catch (Throwable stateCaught_361) {
                        caughtException = stateCaught_361;
                        statePc = 362;
                        continue stateLoop;
                    }
                }
                case 362: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_362) {
                        caughtException = stateCaught_362;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 363: {
                    try {
                        stackOut_363_0 = (fc) (Object) stackIn_363_0;
                        stackOut_363_1 = 0;
                        stackIn_364_0 = stackOut_363_0;
                        stackIn_364_1 = stackOut_363_1;
                        statePc = 364;
                        continue stateLoop;
                    } catch (Throwable stateCaught_363) {
                        caughtException = stateCaught_363;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 364: {
                    try {
                        stackIn_364_0.field_D = stackIn_364_1 != 0;
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_364) {
                        caughtException = stateCaught_364;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 365: {
                    try {
                        stackOut_365_0 = aa.field_j;
                        stackOut_365_1 = -1;
                        stackIn_366_0 = stackOut_365_0;
                        stackIn_366_1 = stackOut_365_1;
                        statePc = 366;
                        continue stateLoop;
                    } catch (Throwable stateCaught_365) {
                        caughtException = stateCaught_365;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 366: {
                    try {
                        if ((stackIn_366_0 ^ stackIn_366_1) == 0) {
                            statePc = 369;
                        } else {
                            statePc = 367;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_366) {
                        caughtException = stateCaught_366;
                        statePc = 368;
                        continue stateLoop;
                    }
                }
                case 367: {
                    try {
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_367) {
                        caughtException = stateCaught_367;
                        statePc = 368;
                        continue stateLoop;
                    }
                }
                case 368: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_368) {
                        caughtException = stateCaught_368;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 369: {
                    try {
                        el.field_c.e(1);
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_369) {
                        caughtException = stateCaught_369;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 370: {
                    try {
                        this.c(param0);
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_370) {
                        caughtException = stateCaught_370;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 372: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "Lexicominos.M(" + param0 + 41);
                }
                case 373: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int stackIn_5_0 = 0;
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
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = param3[0];
                        var7 = param1[0];
                        var8 = 126 / ((param0 - -6) / 58);
                        var9 = param4[0];
                        var10 = 0;
                        var11 = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (10 <= var11) {
                            statePc = 42;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var12 = param3[var11];
                        var13 = param1[var11];
                        var14 = param4[var11];
                        var15 = ce.field_c[-1 + var11];
                        var16 = -var6_int + var12 + 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = var16;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 >= 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var17 = var12 - -1;
                        var18 = var10 << -941368812;
                        var19 = (var15 << -876279052) / var16;
                        var20 = var7 << -1813240812;
                        var21 = (var13 + -var7 << 436799476) / var16;
                        var22 = 1 + -var7 + var9 << -557216908;
                        var23 = (-var9 - (-var7 - (-var13 + var14)) << -1727712492) / var16;
                        var7 = var13;
                        var6_int = var12;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (0 >= var16) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var24 = var20 >> -153043628;
                        var25 = var22 >> 1205238292;
                        var26 = 0;
                        var27 = 471859200 / var25;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((lf.field_h ^ -1) <= (var24 + var25 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var25 = var25 - (-lf.field_h + (var24 - -var25));
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var28 = var17 - var16 - -(var24 * lf.field_f);
                        if (var24 >= lf.field_c) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var29 = lf.field_c + -var24;
                        var26 = var26 + var29 * var27;
                        var28 = var28 + lf.field_f * var29;
                        var25 = var25 - var29;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        hd.a(param2.field_y, var28, var26, var25, 0, lf.field_f, lf.field_b, var18 >> -1791734956, 311, var27);
                        var18 = var18 + var19;
                        var20 = var20 + var21;
                        var22 = var22 + var23;
                        var16--;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10 = var10 + var15;
                        var9 = var14;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) var6;
                        stackOut_25_1 = new StringBuilder().append("Lexicominos.UA(").append(param0).append(44);
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (param1 == null) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                        stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                        stackOut_26_2 = "{...}";
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_29_2 = stackOut_26_2;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                    stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                    stackOut_28_2 = "null";
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                        stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        if (param2 == null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                        stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                        stackOut_30_2 = "{...}";
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        stackIn_33_2 = stackOut_30_2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 32: {
                    stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                    stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
                    stackOut_32_2 = "null";
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    try {
                        stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                        stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(44);
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param3 == null) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                        stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                        stackOut_34_2 = "{...}";
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_37_1 = stackOut_34_1;
                        stackIn_37_2 = stackOut_34_2;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 36: {
                    stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                    stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                    stackOut_36_2 = "null";
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    stackIn_37_2 = stackOut_36_2;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    try {
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44);
                        stackIn_40_0 = stackOut_37_0;
                        stackIn_40_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (param4 == null) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                        stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                        stackOut_38_2 = "{...}";
                        stackIn_41_0 = stackOut_38_0;
                        stackIn_41_1 = stackOut_38_1;
                        stackIn_41_2 = stackOut_38_2;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 40: {
                    stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                    stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                    stackOut_40_2 = "null";
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    throw ld.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        db stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        db stackOut_29_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = param1.field_s;
                        var4 = param1.field_w;
                        var5 = new db(param1.field_p + 16, 16 + param1.field_u);
                        var5.field_s = -8 + var3_int;
                        var5.field_w = -8 + var4;
                        var5.b();
                        var6 = 0;
                        var7_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1.field_u <= var7_int) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1.field_p <= var8) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6++;
                        if (-1 != (param1.field_y[var6] ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        lf.c(8 + var8, var7_int - -8, 8, 16777215);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 0;
                        var7_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1.field_u <= var7_int) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8 >= param1.field_p) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6++;
                        if ((param1.field_y[var6] ^ -1) == -1) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        lf.c(var8 - -8, var7_int - -8, 4, 8421504);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = var5.field_y;
                        var8 = -1 + var7.length;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 < (var8 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((var7[var8] ^ -1) != -8421505) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7[var8] = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var8--;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8 = 34 % ((-42 - param0) / 44);
                        stackOut_29_0 = (db) var5;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0;
                }
                case 31: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    try {
                        stackOut_32_0 = (RuntimeException) var3;
                        stackOut_32_1 = new StringBuilder().append("Lexicominos.SA(").append(param0).append(44);
                        stackIn_35_0 = stackOut_32_0;
                        stackIn_35_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param1 == null) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                        stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                        stackOut_33_2 = "{...}";
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_36_2 = stackOut_33_2;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 35: {
                    stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                    stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                    stackOut_35_2 = "null";
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    throw ld.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void o(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == 2) {
                break L0;
              } else {
                field_F = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_I = null;
          field_H = null;
          field_F = null;
        }
    }

    final void a(byte param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_33_0 = 0;
        int stackIn_44_0 = 0;
        cd stackIn_44_1 = null;
        int stackIn_46_0 = 0;
        cd stackIn_46_1 = null;
        int stackIn_47_0 = 0;
        cd stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        int stackIn_48_0 = 0;
        cd stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        int stackIn_50_0 = 0;
        cd stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        int stackIn_51_0 = 0;
        cd stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackIn_51_5 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        cd stackIn_53_4 = null;
        int stackIn_53_5 = 0;
        int stackIn_53_6 = 0;
        int[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        cd stackIn_55_4 = null;
        int stackIn_55_5 = 0;
        int stackIn_55_6 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        cd stackIn_56_4 = null;
        int stackIn_56_5 = 0;
        int stackIn_56_6 = 0;
        int stackIn_56_7 = 0;
        int[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        cd stackIn_57_4 = null;
        int stackIn_57_5 = 0;
        int stackIn_57_6 = 0;
        int stackIn_57_7 = 0;
        int[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        cd stackIn_59_4 = null;
        int stackIn_59_5 = 0;
        int stackIn_59_6 = 0;
        int stackIn_59_7 = 0;
        int[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        cd stackIn_60_4 = null;
        int stackIn_60_5 = 0;
        int stackIn_60_6 = 0;
        int stackIn_60_7 = 0;
        int stackIn_60_8 = 0;
        int stackIn_62_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_43_0 = 0;
        cd stackOut_43_1 = null;
        int stackOut_44_0 = 0;
        cd stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_46_0 = 0;
        cd stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_47_0 = 0;
        cd stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        int stackOut_47_4 = 0;
        int stackOut_48_0 = 0;
        cd stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        int stackOut_50_0 = 0;
        cd stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        int stackOut_50_5 = 0;
        int[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        cd stackOut_52_4 = null;
        int stackOut_52_5 = 0;
        int stackOut_52_6 = 0;
        int[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        cd stackOut_53_4 = null;
        int stackOut_53_5 = 0;
        int stackOut_53_6 = 0;
        int stackOut_53_7 = 0;
        int[] stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        cd stackOut_55_4 = null;
        int stackOut_55_5 = 0;
        int stackOut_55_6 = 0;
        int stackOut_55_7 = 0;
        int[] stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        cd stackOut_56_4 = null;
        int stackOut_56_5 = 0;
        int stackOut_56_6 = 0;
        int stackOut_56_7 = 0;
        int[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        cd stackOut_57_4 = null;
        int stackOut_57_5 = 0;
        int stackOut_57_6 = 0;
        int stackOut_57_7 = 0;
        int stackOut_57_8 = 0;
        int[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        cd stackOut_59_4 = null;
        int stackOut_59_5 = 0;
        int stackOut_59_6 = 0;
        int stackOut_59_7 = 0;
        int stackOut_59_8 = 0;
        int stackOut_61_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 22 / ((16 - param0) / 59);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        th.field_r = param2;
                        if (-1 < (param2 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vg.field_d[param2].field_g = param3;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (ja.field_b[th.field_r - -2] <= ja.field_b[2 + aa.field_j]) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        cg.field_j = 1;
                        ed.field_v = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        cg.field_j = -1;
                        ed.field_v = 40;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (8 > th.field_r) {
                            statePc = 29;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (th.field_r > 11) {
                            statePc = 29;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var6 >= id.field_w.length) {
                            statePc = 28;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!ug.field_s.equals((Object) (Object) id.field_w[var6].field_k)) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        vg.field_d[th.field_r].field_m = new fc((Lexicominos) this, id.field_w[var6], new Random());
                        vg.field_d[th.field_r].field_m.b(-71, th.field_r + -8);
                        vg.field_d[th.field_r].field_m.field_M = -92;
                        vg.field_d[th.field_r].field_b = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((th.field_r ^ -1) != -2) {
                            statePc = 39;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = -127;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (ki.a((byte) stackIn_33_0)) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        hh.field_N = ud.a(1, -85, 10, 3, 9);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (th.field_r != 6) {
                            statePc = 61;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var6 = 50;
                        var7 = 4 + bi.field_a.field_t + bi.field_a.field_G;
                        var6 = var6 + bi.field_a.a(me.field_u, 254) * var7;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = var6;
                        stackOut_43_1 = bi.field_a;
                        stackIn_46_0 = stackOut_43_0;
                        stackIn_46_1 = stackOut_43_1;
                        stackIn_44_0 = stackOut_43_0;
                        stackIn_44_1 = stackOut_43_1;
                        if (0 == ee.field_a) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = stackIn_44_0;
                        stackOut_44_1 = (cd) (Object) stackIn_44_1;
                        stackOut_44_2 = 1;
                        stackIn_47_0 = stackOut_44_0;
                        stackIn_47_1 = stackOut_44_1;
                        stackIn_47_2 = stackOut_44_2;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = stackIn_46_0;
                        stackOut_46_1 = (cd) (Object) stackIn_46_1;
                        stackOut_46_2 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        stackIn_47_2 = stackOut_46_2;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = stackIn_47_0;
                        stackOut_47_1 = (cd) (Object) stackIn_47_1;
                        stackOut_47_2 = stackIn_47_2;
                        stackOut_47_3 = 0;
                        stackOut_47_4 = 52;
                        stackIn_50_0 = stackOut_47_0;
                        stackIn_50_1 = stackOut_47_1;
                        stackIn_50_2 = stackOut_47_2;
                        stackIn_50_3 = stackOut_47_3;
                        stackIn_50_4 = stackOut_47_4;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        stackIn_48_2 = stackOut_47_2;
                        stackIn_48_3 = stackOut_47_3;
                        stackIn_48_4 = stackOut_47_4;
                        if ((el.field_c.field_J ^ -1) == -1) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = stackIn_48_0;
                        stackOut_48_1 = (cd) (Object) stackIn_48_1;
                        stackOut_48_2 = stackIn_48_2;
                        stackOut_48_3 = stackIn_48_3;
                        stackOut_48_4 = stackIn_48_4;
                        stackOut_48_5 = 1;
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_51_1 = stackOut_48_1;
                        stackIn_51_2 = stackOut_48_2;
                        stackIn_51_3 = stackOut_48_3;
                        stackIn_51_4 = stackOut_48_4;
                        stackIn_51_5 = stackOut_48_5;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = stackIn_50_0;
                        stackOut_50_1 = (cd) (Object) stackIn_50_1;
                        stackOut_50_2 = stackIn_50_2;
                        stackOut_50_3 = stackIn_50_3;
                        stackOut_50_4 = stackIn_50_4;
                        stackOut_50_5 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        stackIn_51_2 = stackOut_50_2;
                        stackIn_51_3 = stackOut_50_3;
                        stackIn_51_4 = stackOut_50_4;
                        stackIn_51_5 = stackOut_50_5;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var6 = stackIn_51_0 + ((cd) (Object) stackIn_51_1).a(ii.a(stackIn_51_2 != 0, stackIn_51_3 != 0, stackIn_51_4, stackIn_51_5 != 0), 254) * var7;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        qc.field_c[6] = var6;
                        stackOut_52_0 = uk.field_U;
                        stackOut_52_1 = 6;
                        stackOut_52_2 = 2 * gg.field_a[0].field_x;
                        stackOut_52_3 = var7;
                        stackOut_52_4 = bi.field_a;
                        stackOut_52_5 = 0;
                        stackOut_52_6 = -95;
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_55_2 = stackOut_52_2;
                        stackIn_55_3 = stackOut_52_3;
                        stackIn_55_4 = stackOut_52_4;
                        stackIn_55_5 = stackOut_52_5;
                        stackIn_55_6 = stackOut_52_6;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        stackIn_53_2 = stackOut_52_2;
                        stackIn_53_3 = stackOut_52_3;
                        stackIn_53_4 = stackOut_52_4;
                        stackIn_53_5 = stackOut_52_5;
                        stackIn_53_6 = stackOut_52_6;
                        if (ee.field_a == 0) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = (int[]) (Object) stackIn_53_0;
                        stackOut_53_1 = stackIn_53_1;
                        stackOut_53_2 = stackIn_53_2;
                        stackOut_53_3 = stackIn_53_3;
                        stackOut_53_4 = (cd) (Object) stackIn_53_4;
                        stackOut_53_5 = stackIn_53_5;
                        stackOut_53_6 = stackIn_53_6;
                        stackOut_53_7 = 1;
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_56_2 = stackOut_53_2;
                        stackIn_56_3 = stackOut_53_3;
                        stackIn_56_4 = stackOut_53_4;
                        stackIn_56_5 = stackOut_53_5;
                        stackIn_56_6 = stackOut_53_6;
                        stackIn_56_7 = stackOut_53_7;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = (int[]) (Object) stackIn_55_0;
                        stackOut_55_1 = stackIn_55_1;
                        stackOut_55_2 = stackIn_55_2;
                        stackOut_55_3 = stackIn_55_3;
                        stackOut_55_4 = (cd) (Object) stackIn_55_4;
                        stackOut_55_5 = stackIn_55_5;
                        stackOut_55_6 = stackIn_55_6;
                        stackOut_55_7 = 0;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        stackIn_56_2 = stackOut_55_2;
                        stackIn_56_3 = stackOut_55_3;
                        stackIn_56_4 = stackOut_55_4;
                        stackIn_56_5 = stackOut_55_5;
                        stackIn_56_6 = stackOut_55_6;
                        stackIn_56_7 = stackOut_55_7;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = (int[]) (Object) stackIn_56_0;
                        stackOut_56_1 = stackIn_56_1;
                        stackOut_56_2 = stackIn_56_2;
                        stackOut_56_3 = stackIn_56_3;
                        stackOut_56_4 = (cd) (Object) stackIn_56_4;
                        stackOut_56_5 = stackIn_56_5;
                        stackOut_56_6 = stackIn_56_6;
                        stackOut_56_7 = stackIn_56_7;
                        stackIn_59_0 = stackOut_56_0;
                        stackIn_59_1 = stackOut_56_1;
                        stackIn_59_2 = stackOut_56_2;
                        stackIn_59_3 = stackOut_56_3;
                        stackIn_59_4 = stackOut_56_4;
                        stackIn_59_5 = stackOut_56_5;
                        stackIn_59_6 = stackOut_56_6;
                        stackIn_59_7 = stackOut_56_7;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        stackIn_57_3 = stackOut_56_3;
                        stackIn_57_4 = stackOut_56_4;
                        stackIn_57_5 = stackOut_56_5;
                        stackIn_57_6 = stackOut_56_6;
                        stackIn_57_7 = stackOut_56_7;
                        if (0 == el.field_c.field_J) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = (int[]) (Object) stackIn_57_0;
                        stackOut_57_1 = stackIn_57_1;
                        stackOut_57_2 = stackIn_57_2;
                        stackOut_57_3 = stackIn_57_3;
                        stackOut_57_4 = (cd) (Object) stackIn_57_4;
                        stackOut_57_5 = stackIn_57_5;
                        stackOut_57_6 = stackIn_57_6;
                        stackOut_57_7 = stackIn_57_7;
                        stackOut_57_8 = 1;
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_60_2 = stackOut_57_2;
                        stackIn_60_3 = stackOut_57_3;
                        stackIn_60_4 = stackOut_57_4;
                        stackIn_60_5 = stackOut_57_5;
                        stackIn_60_6 = stackOut_57_6;
                        stackIn_60_7 = stackOut_57_7;
                        stackIn_60_8 = stackOut_57_8;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackOut_59_0 = (int[]) (Object) stackIn_59_0;
                        stackOut_59_1 = stackIn_59_1;
                        stackOut_59_2 = stackIn_59_2;
                        stackOut_59_3 = stackIn_59_3;
                        stackOut_59_4 = (cd) (Object) stackIn_59_4;
                        stackOut_59_5 = stackIn_59_5;
                        stackOut_59_6 = stackIn_59_6;
                        stackOut_59_7 = stackIn_59_7;
                        stackOut_59_8 = 0;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        stackIn_60_2 = stackOut_59_2;
                        stackIn_60_3 = stackOut_59_3;
                        stackIn_60_4 = stackOut_59_4;
                        stackIn_60_5 = stackOut_59_5;
                        stackIn_60_6 = stackOut_59_6;
                        stackIn_60_7 = stackOut_59_7;
                        stackIn_60_8 = stackOut_59_8;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_60_0[stackIn_60_1] = stackIn_60_2 + (stackIn_60_3 - -(((cd) (Object) stackIn_60_4).a(ac.a(stackIn_60_5 != 0, stackIn_60_6, stackIn_60_7 != 0, stackIn_60_8 != 0), 254) * var7));
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = th.field_r ^ -1;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 <= -1) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        vg.field_d[th.field_r].a(param1, true);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var5, "Lexicominos.OA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, cg param1, int param2) {
        RuntimeException runtimeException = null;
        th var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = ed.field_q;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param0 == -17800) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_F = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3.h(param2, 0);
                        var3.c(param1.field_h, -1);
                        var3.e(96, param1.field_k);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) runtimeException;
                        stackOut_8_1 = new StringBuilder().append("Lexicominos.VA(").append(param0).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var29 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 34) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_G = -57;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5_int = og.field_f[param0][0];
                        var6 = we.field_b[param0][0];
                        var7 = bg.field_f[param0][0];
                        var8 = 0;
                        var9 = 1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-11 >= (var9 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = og.field_f[param0][var9];
                        var11 = we.field_b[param0][var9];
                        var12 = bg.field_f[param0][var9];
                        var13 = ce.field_c[var9 + -1];
                        var14 = 1 + (var10 - var5_int);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0 >= var14) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var15 = param3;
                        var18 = var6 << 279813204;
                        var16 = var10 + 1;
                        var20 = var7 << -1246929068;
                        var19 = (-var6 + var11 << 600342196) / var14;
                        var21 = (var12 + -var7 << -175862476) / var14;
                        var17 = var8 << 412633300;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var18 = var11 << 878980308;
                        var17 = -var8 + (311 + -var13) << -1573550252;
                        var14 = 1 + (var5_int - var10);
                        var16 = var5_int - -1;
                        var15 = param1;
                        var21 = (var7 - var12 << -1784577900) / var14;
                        var20 = var12 << -526181132;
                        var19 = (-var11 + var6 << 259594324) / var14;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var22 = (var13 << -919598828) / var14;
                        var7 = var12;
                        var8 = var8 + var13;
                        var6 = var11;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var14 ^ -1) >= -1) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var23 = var18 >> 1101679156;
                        var24 = -var23 + ((var20 >> 2128682900) + 1);
                        var25 = 0;
                        var26 = 471859200 / var24;
                        if ((lf.field_h ^ -1) <= (var24 + var23 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var24 = var24 - (var23 - -var24 + -lf.field_h);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var27 = lf.field_f * var23 + (-var14 + var16);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (lf.field_c > var23) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var28 = lf.field_c - var23;
                        var27 = var27 + lf.field_f * var28;
                        var24 = var24 - var28;
                        var25 = var25 + var26 * var28;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        hd.a(var15.field_y, var27, var25, var24, 0, lf.field_f, lf.field_b, var17 >> 1101871732, 311, var26);
                        var18 = var18 + var19;
                        var17 = var17 + var22;
                        var20 = var20 + var21;
                        var14--;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_int = var10;
                        var9++;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) var5;
                        stackOut_26_1 = new StringBuilder().append("Lexicominos.QA(").append(param0).append(44);
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        if (param1 == null) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                        stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                        stackOut_27_2 = "{...}";
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_30_2 = stackOut_27_2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 29: {
                    stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                    stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                    stackOut_29_2 = "null";
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    try {
                        stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                        stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44).append(param2).append(44);
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (param3 == null) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                        stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                        stackOut_31_2 = "{...}";
                        stackIn_34_0 = stackOut_31_0;
                        stackIn_34_1 = stackOut_31_1;
                        stackIn_34_2 = stackOut_31_2;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 33: {
                    stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                    stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                    stackOut_33_2 = "null";
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    throw ld.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
