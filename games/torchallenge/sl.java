/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static int field_b;
    static lj field_a;
    static int field_f;
    static String[] field_d;
    da field_e;
    private da field_c;

    final da a(byte param0) {
        int var2 = 0;
        da var3 = null;
        var2 = 46 / ((param0 - -1) / 60);
        var3 = this.field_e.field_f;
        if (var3 == this.field_e) {
          return null;
        } else {
          var3.a(true);
          return var3;
        }
    }

    final da c(int param0) {
        da var2 = null;
        var2 = this.field_c;
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        } else {
          L0: {
            if (param0 == -270) {
              break L0;
            } else {
              field_b = 98;
              break L0;
            }
          }
          this.field_c = var2.field_f;
          return var2;
        }
    }

    final void a(da param0, int param1) {
        try {
            if (!(param0.field_h == null)) {
                param0.a(true);
            }
            param0.field_h = this.field_e.field_h;
            param0.field_f = this.field_e;
            if (param1 > -34) {
                field_f = 42;
            }
            param0.field_h.field_f = param0;
            param0.field_f.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "sl.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void e(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 25840) {
            field_b = 58;
        }
    }

    final da c(byte param0) {
        da var2 = null;
        int var3 = 0;
        var3 = 29 / ((52 - param0) / 51);
        var2 = this.field_e.field_f;
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_f;
          return var2;
        }
    }

    final static void a(boolean param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        ka var1_ref = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ka var9 = null;
        int var10 = 0;
        ka var11 = null;
        ka var12 = null;
        String var14 = null;
        ka var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_59_0 = 0;
        int stackIn_68_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                sl.a(92, 123, -107);
                break L1;
              }
            }
            L2: {
              if (fd.field_c == null) {
                break L2;
              } else {
                if (!fd.field_c.b(-7957)) {
                  break L2;
                } else {
                  if (!fd.field_c.b(5, "benefits")) {
                    break L2;
                  } else {
                    if (null == sf.field_a) {
                      break L2;
                    } else {
                      if (!sf.field_a.b(-7957)) {
                        break L2;
                      } else {
                        if (sf.field_a.b(5, "benefits")) {
                          da.field_b = qk.a("benefits", "headline", fd.field_c, 0);
                          me.field_e = qk.a("benefits", "blurbpane", fd.field_c, 0);
                          md.field_b = qk.a("benefits", "button", fd.field_c, 0);
                          hd.field_b = qk.a("benefits", "signup_text", fd.field_c, 0);
                          gl.field_h = qk.a("benefits", "menu_text", fd.field_c, 0);
                          ub.field_e = qk.a("benefits", "button_frame", fd.field_c, 0);
                          le.field_e = qk.a("benefits", "arrow", fd.field_c, 0);
                          tk.field_R = (eg) ((Object) ad.a(fd.field_c, sf.field_a, "benefits", "large_font", false));
                          ek.field_G = (eg) ((Object) ad.a(fd.field_c, sf.field_a, "benefits", "small_font", false));
                          var28 = qg.field_i;
                          var2 = qg.field_g;
                          var3 = qg.field_f;
                          qg.a(ck.field_c);
                          var11 = new ka(4 + le.field_e.field_u, le.field_e.field_x + 4);
                          var11.d();
                          le.field_e.f(2, 2, vh.field_h);
                          ih.a(var11.field_u, 0, 4, var11.field_x, 2, var11, 0, 1);
                          le.field_e = var11;
                          dh.field_ab = le.field_e.i();
                          var12 = new ka(195, 221);
                          var6 = var12.field_u / 2;
                          var12.d();
                          tk.field_R.a(ni.a(new String[]{kg.field_db}, 0, gh.field_v), var6, 40, 16777215, -1);
                          ek.field_G.a(ni.a(new String[]{kg.field_db}, 0, jl.field_d), var6, 60, 16777215, -1);
                          tk.field_R.a(ni.a(new String[]{qe.field_J}, 0, kc.field_t), var6, 110, 16777215, -1);
                          ek.field_G.a(ni.a(new String[]{qe.field_J}, 0, di.field_n), var6, 130, 16777215, -1);
                          tk.field_R.a(ub.field_m, var6, 180, 16777215, -1);
                          ek.field_G.a(wi.field_b, var6, 200, 16777215, -1);
                          ih.a(var12.field_u, 0, 4, var12.field_x, 3, var12, 0, 1);
                          me.field_e.d();
                          var12.g(-me.field_e.field_s + 18, -me.field_e.field_p + 241);
                          var7 = 0;
                          L3: while (true) {
                            if (hb.field_g.length <= var7) {
                              hb.field_g = null;
                              dg.field_R = hd.field_b.c();
                              dg.field_R.d();
                              ii.a(qg.field_g, 2 * qg.field_f / 3, 64, 4, 0, 0);
                              qg.a(var28, var2, var3);
                              qg.b(ck.field_c);
                              ii.field_a = 390 + (-ub.field_e.field_x + md.field_b.field_x) / 2;
                              wc.field_b = (md.field_b.field_u + -ub.field_e.field_u) / 2 + 231;
                              fd.field_c = null;
                              pf.field_e = (-ub.field_e.field_u + md.field_b.field_u) / 2 + 434;
                              bi.field_i = 390 - -((md.field_b.field_x - ub.field_e.field_x) / 2);
                              break L2;
                            } else {
                              ak.field_i[var7].d();
                              discarded$3 = ek.field_G.a(hb.field_g[var7], 3, 3, ak.field_i[var7].field_u - 6, ak.field_i[var7].field_x - 6, vh.field_h, -1, 1, 1, ek.field_G.field_x + ek.field_G.field_K);
                              ih.a(ak.field_i[var7].field_u, 0, 4, ak.field_i[var7].field_x, 3, ak.field_i[var7], 0, 1);
                              var7++;
                              continue L3;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (lj.field_f != null) {
              L4: {
                if (vk.field_d == null) {
                  break L4;
                } else {
                  if (tk.field_R != null) {
                    L5: {
                      var29 = qg.field_i;
                      var2 = qg.field_g;
                      var3 = qg.field_f;
                      qg.a(ck.field_c);
                      var14 = ni.a(new String[]{nk.field_g[di.field_A]}, 0, jd.field_f);
                      var5 = tk.field_R.b(var14, fd.field_f);
                      var6 = tk.field_R.b(var14, fd.field_f, tk.field_R.field_K + tk.field_R.field_x);
                      var7 = (fd.field_f + -var5) / 2 + si.field_J;
                      var5 += 6;
                      var7 -= 3;
                      var8 = vk.field_k - -((pi.field_b + -var6) / 2);
                      if (-1 >= (var7 ^ -1)) {
                        break L5;
                      } else {
                        var9_int = -var7;
                        vk.field_d.field_q = vk.field_d.field_q + var9_int * 2;
                        vk.field_d.field_s = vk.field_d.field_s + var9_int;
                        var7 = var7 + var9_int;
                        var5 = var5 + var9_int * 2;
                        si.field_J = si.field_J + var9_int;
                        rl.field_f = rl.field_f - var9_int;
                        break L5;
                      }
                    }
                    L6: {
                      var8 -= 3;
                      var6 += 6;
                      if (vk.field_d.field_q >= var5 + var7) {
                        break L6;
                      } else {
                        var9_int = -vk.field_d.field_q + (var5 + var7);
                        rl.field_f = rl.field_f - var9_int;
                        vk.field_d.field_q = vk.field_d.field_q + 2 * var9_int;
                        var7 = var7 + var9_int;
                        si.field_J = si.field_J + var9_int;
                        vk.field_d.field_s = vk.field_d.field_s + var9_int;
                        var5 = var5 + var9_int * 2;
                        break L6;
                      }
                    }
                    L7: {
                      if ((var8 ^ -1) > -1) {
                        var9_int = -var8;
                        var6 = var6 + 2 * var9_int;
                        vk.field_d.field_p = vk.field_d.field_p + var9_int;
                        vk.field_d.field_v = vk.field_d.field_v + var9_int * 2;
                        vk.field_k = vk.field_k + var9_int;
                        var8 = var8 + var9_int;
                        bh.field_t = bh.field_t - var9_int;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (vk.field_d.field_v < var6 + var8) {
                        var9_int = var8 + (var6 - vk.field_d.field_v);
                        vk.field_d.field_p = vk.field_d.field_p + var9_int;
                        vk.field_d.field_v = vk.field_d.field_v + 2 * var9_int;
                        var8 = var8 + var9_int;
                        bh.field_t = bh.field_t - var9_int;
                        var6 = var6 + 2 * var9_int;
                        vk.field_k = vk.field_k + var9_int;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    vk.field_d.g();
                    var9 = new ka(vk.field_d.field_q, vk.field_d.field_v);
                    var9.d();
                    discarded$4 = tk.field_R.a(var14, si.field_J, vk.field_k, fd.field_f, pi.field_b, 16777215, -1, 1, 1, tk.field_R.field_x + tk.field_R.field_K);
                    ih.a(var9.field_q, 0, 4, var9.field_v, 3, var9, 0, 1);
                    vk.field_d.d();
                    var9.g(0, 0);
                    cf.field_c = new ka(640, 480);
                    cf.field_c.d();
                    vk.field_d.b(rl.field_f + (vk.field_d.field_q >> 569257313), (vk.field_d.field_v >> 473795169) + bh.field_t, dd.field_u, 4096);
                    vk.field_d = null;
                    cf.field_c.h();
                    qg.a(var29, var2, var3);
                    qg.b(ck.field_c);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L9: {
                if (null == ia.field_l) {
                  break L9;
                } else {
                  if (ek.field_G == null) {
                    break L9;
                  } else {
                    var30 = qg.field_i;
                    var2 = qg.field_g;
                    var3 = qg.field_f;
                    qg.a(ck.field_c);
                    var16 = new ka(412, 43);
                    var17 = ni.a(new String[]{ia.field_l}, 0, w.field_n);
                    ia.field_l = null;
                    var16.d();
                    discarded$5 = ek.field_G.a(var17, 3, 3, var16.field_u + -6, var16.field_x - 6, 16777215, -1, 0, 1, ek.field_G.field_K + ek.field_G.field_x);
                    ih.a(var16.field_u, 0, 4, var16.field_x, 3, var16, 0, 1);
                    lj.field_f.d();
                    var16.g(199 - lj.field_f.field_s, 83 - lj.field_f.field_p);
                    qg.a(var30, var2, var3);
                    qg.b(ck.field_c);
                    break L9;
                  }
                }
              }
              L10: {
                if (fc.field_m == null) {
                  break L10;
                } else {
                  if (null != ek.field_G) {
                    var31 = qg.field_i;
                    var2 = qg.field_g;
                    var3 = qg.field_f;
                    qg.a(ck.field_c);
                    var4 = ek.field_G.b(dd.field_r, 640) - -6;
                    var5 = var4 + (fc.field_m.field_q - -20);
                    var6 = -(var5 / 2) + 427;
                    var7 = 20 + (var6 - -fc.field_m.field_q);
                    lj.field_f.d();
                    ek.field_G.c(dd.field_r, -lj.field_f.field_s + var7, ek.field_G.field_x + (155 - lj.field_f.field_p + ek.field_G.field_K), 16777215, -1);
                    ih.a(var4, -lj.field_f.field_s + (var7 + -4), 4, 50, 3, lj.field_f, -lj.field_f.field_p + 155, 1);
                    var8 = -((fc.field_m.field_v - (3 + ek.field_G.field_x - -ek.field_G.field_K)) / 2) + (-lj.field_f.field_p + 155);
                    fc.field_m.g(var6 - lj.field_f.field_s, var8);
                    qg.a(var31, var2, var3);
                    qg.b(ck.field_c);
                    fc.field_m = null;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                qg.a(ck.field_c);
                qg.a(16, 16, 608, 112, 15, gf.field_u, ea.field_c);
                qg.a(231, 144, 393, 232, 15, gf.field_u, ea.field_c);
                if (da.field_b != null) {
                  da.field_b.g(0, 0);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (null == me.field_e) {
                  break L12;
                } else {
                  me.field_e.g(0, 0);
                  break L12;
                }
              }
              L13: {
                lj.field_f.g(0, 0);
                if (cf.field_c == null) {
                  break L13;
                } else {
                  cf.field_c.g(0, 0);
                  break L13;
                }
              }
              L14: {
                if (null == md.field_b) {
                  break L14;
                } else {
                  if (null != ub.field_e) {
                    L15: {
                      md.field_b.g(231, 390);
                      var1_ref = hd.field_b;
                      if (0 == of.field_c.field_j) {
                        var1_ref = dg.field_R;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      var1_ref.g(0, 0);
                      stackOut_50_0 = 40;
                      stackOut_50_1 = 124;
                      stackOut_50_2 = ub.field_h;
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_52_1 = stackOut_50_1;
                      stackIn_52_2 = stackOut_50_2;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      stackIn_51_2 = stackOut_50_2;
                      if (of.field_c.field_j != 0) {
                        stackOut_52_0 = stackIn_52_0;
                        stackOut_52_1 = stackIn_52_1;
                        stackOut_52_2 = stackIn_52_2;
                        stackOut_52_3 = 3;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        stackIn_53_2 = stackOut_52_2;
                        stackIn_53_3 = stackOut_52_3;
                        break L16;
                      } else {
                        stackOut_51_0 = stackIn_51_0;
                        stackOut_51_1 = stackIn_51_1;
                        stackOut_51_2 = stackIn_51_2;
                        stackOut_51_3 = 4;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_53_1 = stackOut_51_1;
                        stackIn_53_2 = stackOut_51_2;
                        stackIn_53_3 = stackOut_51_3;
                        break L16;
                      }
                    }
                    L17: {
                      var2 = (stackIn_53_0 * ga.a((byte) stackIn_53_1, stackIn_53_2 << stackIn_53_3) >> -1398383824) + 40;
                      if (-1 > (var2 ^ -1)) {
                        md.field_b.b(230, 389, var2);
                        md.field_b.b(232, 389, var2);
                        md.field_b.b(232, 391, var2);
                        md.field_b.b(230, 391, var2);
                        var1_ref.b(1, 1, var2);
                        var1_ref.b(-1, 1, var2);
                        var1_ref.b(1, -1, var2);
                        var1_ref.b(-1, -1, var2);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (-1 != (of.field_c.field_j ^ -1)) {
                        stackOut_58_0 = 0;
                        stackIn_59_0 = stackOut_58_0;
                        break L18;
                      } else {
                        stackOut_57_0 = 1;
                        stackIn_59_0 = stackOut_57_0;
                        break L18;
                      }
                    }
                    tj.a(stackIn_59_0 != 0, 5106, bi.field_i, wc.field_b);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
              L19: {
                if (null == md.field_b) {
                  break L19;
                } else {
                  if (ub.field_e != null) {
                    L20: {
                      md.field_b.g(434, 390);
                      gl.field_h.g(0, 0);
                      if (-2 != (of.field_c.field_j ^ -1)) {
                        break L20;
                      } else {
                        ii.a(md.field_b.field_u + -4, 7 * md.field_b.field_x / 12, 64, 4, 436, 392);
                        break L20;
                      }
                    }
                    L21: {
                      if (1 != of.field_c.field_j) {
                        stackOut_67_0 = 0;
                        stackIn_68_0 = stackOut_67_0;
                        break L21;
                      } else {
                        stackOut_66_0 = 1;
                        stackIn_68_0 = stackOut_66_0;
                        break L21;
                      }
                    }
                    tj.a(stackIn_68_0 != 0, 5106, ii.field_a, pf.field_e);
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
              L22: {
                if (le.field_e != null) {
                  L23: {
                    var1_int = 357 - le.field_e.field_v / 2;
                    le.field_e.g(-le.field_e.field_q + 269, var1_int);
                    dh.field_ab.g(586, var1_int);
                    if (var1_int >= ph.field_d) {
                      break L23;
                    } else {
                      if (ph.field_d >= le.field_e.field_x + var1_int) {
                        break L23;
                      } else {
                        var2 = (ga.a((byte) 5, ub.field_h << -1601320188) * 40 >> 101992944) + 40;
                        if (var2 <= 0) {
                          break L23;
                        } else {
                          L24: {
                            if (-le.field_e.field_u + 269 >= kc.field_u) {
                              break L24;
                            } else {
                              if (-270 >= (kc.field_u ^ -1)) {
                                break L24;
                              } else {
                                le.field_e.b(269 + (-le.field_e.field_q - 1), -1 + var1_int, var2);
                                le.field_e.b(1 + -le.field_e.field_q + 269, -1 + var1_int, var2);
                                le.field_e.b(268 - le.field_e.field_q, 1 + var1_int, var2);
                                le.field_e.b(1 + (-le.field_e.field_q + 269), var1_int + 1, var2);
                                break L23;
                              }
                            }
                          }
                          if (586 >= kc.field_u) {
                            break L23;
                          } else {
                            if (kc.field_u < le.field_e.field_u + 586) {
                              dh.field_ab.b(585, var1_int - 1, var2);
                              dh.field_ab.b(587, var1_int + -1, var2);
                              dh.field_ab.b(585, 1 + var1_int, var2);
                              dh.field_ab.b(587, 1 + var1_int, var2);
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                    }
                  }
                  w.c(-128);
                  ak.field_i[oi.field_j].g(269, 340);
                  break L22;
                } else {
                  w.c(-128);
                  ak.field_i[oi.field_j].g(269, 340);
                  break L22;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "sl.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static jk b(int param0) {
        if (param0 != -944) {
            return (jk) null;
        }
        return mj.field_a;
    }

    final da b(byte param0) {
        da discarded$2 = null;
        da var2 = null;
        L0: {
          if (param0 == 65) {
            break L0;
          } else {
            discarded$2 = this.d((byte) 1);
            break L0;
          }
        }
        var2 = this.field_e.field_h;
        if (this.field_e == var2) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_h;
          return var2;
        }
    }

    final void a(int param0) {
        da var2 = null;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        L0: while (true) {
          var2 = this.field_e.field_f;
          if (var2 != this.field_e) {
            var2.a(true);
            continue L0;
          } else {
            L1: {
              this.field_c = null;
              if (param0 == -14341) {
                break L1;
              } else {
                field_a = (lj) null;
                break L1;
              }
            }
            return;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 > -113) {
            return false;
        }
        return this.field_e == this.field_e.field_f ? true : false;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        if (0 == (param2 ^ -1)) {
          return false;
        } else {
          L0: {
            var4 = -1 & param2 >> 1786472368;
            param2 = param2 & 65535;
            if (-1 >= (var4 ^ -1)) {
              if ((var4 ^ -1) >= -2) {
                if (param2 >= 0) {
                  if (param2 < 3) {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L0;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_13_0 = stackOut_10_0;
                    break L0;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_13_0 = stackOut_8_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_13_0 = stackOut_6_0;
                break L0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_13_0 = stackOut_4_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_13_0;
            if (param3 == -22981) {
              break L1;
            } else {
              sl.a(false);
              break L1;
            }
          }
          if (var5 == 0) {
            return false;
          } else {
            L2: {
              if (param1 == var4) {
                if (param2 > param0) {
                  stackOut_20_0 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  break L2;
                } else {
                  stackOut_19_0 = 0;
                  stackIn_22_0 = stackOut_19_0;
                  break L2;
                }
              } else {
                stackOut_17_0 = 0;
                stackIn_22_0 = stackOut_17_0;
                break L2;
              }
            }
            var6 = stackIn_22_0;
            return var6 != 0;
          }
        }
    }

    final da d(byte param0) {
        da var2 = null;
        var2 = this.field_e.field_h;
        if (var2 == this.field_e) {
          return null;
        } else {
          L0: {
            if (param0 < -103) {
              break L0;
            } else {
              sl.a(false);
              break L0;
            }
          }
          var2.a(true);
          return var2;
        }
    }

    final static void a(int param0, int param1, int param2) {
        sd.field_b = param1;
        if (param2 != -6665) {
            field_d = (String[]) null;
        }
        kj.field_G = param0;
    }

    final void a(byte param0, da param1) {
        da discarded$0 = null;
        try {
            if (param0 < 76) {
                discarded$0 = this.b((byte) 15);
            }
            if (param1.field_h != null) {
                param1.a(true);
            }
            param1.field_h = this.field_e;
            param1.field_f = this.field_e.field_f;
            param1.field_h.field_f = param1;
            param1.field_f.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "sl.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final da e(byte param0) {
        da var2 = this.field_c;
        if (!(var2 != this.field_e)) {
            this.field_c = null;
            return null;
        }
        int var3 = 91 % ((param0 - -42) / 61);
        this.field_c = var2.field_h;
        return var2;
    }

    public sl() {
        this.field_e = new da();
        this.field_e.field_f = this.field_e;
        this.field_e.field_h = this.field_e;
    }

    static {
        field_d = new String[]{"Score and multiplier.", "Collected seals. Ordered from left to right by location on tower from bottom to top.", "Life force. The small growing hit point turns into a new hit point for every 5 seals that you collect.", "Lives remaining."};
        field_b = 0;
    }
}
