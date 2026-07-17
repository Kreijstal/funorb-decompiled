/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

public final class client extends bd {
    static byte[] field_D;
    static ud field_F;
    static String field_E;
    static String field_y;
    static ck[] field_x;
    static ck[] field_C;
    static String field_B;
    public static boolean field_A;

    private final void o() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != wk.field_q) {
                sh.a(false, wk.field_q);
                wk.field_q = null;
                vj.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            int discarded$1 = -81;
            tm.b();
            cl.field_y = vg.a(3, 21);
            vb.field_S = vg.a(4, 44);
            ii.field_t = vg.a(6, 39);
            eg.field_e = vg.a(11, 102);
            ph.field_Db = vg.a(7, 50);
            jj.field_c = vg.a(8, 113);
            ah.field_d = vg.a(9, 100);
            wg.field_h = vg.a(10, 45);
            sh.field_g = new cb(65);
            sh.field_g.a("basic", ah.field_i, bn.field_d, (byte) 95, ng.field_l);
            sh.field_g.a("arial13", ah.field_i, un.field_a, (byte) 112, ne.field_d);
            sh.field_g.a("arial13", qc.field_vb, un.field_a, (byte) 106, ne.field_d);
            sh.field_g.a("arialbold14", ah.field_i, un.field_a, (byte) -97, ne.field_d);
            sh.field_g.a("arialbold14", qc.field_vb, un.field_a, (byte) 94, ne.field_d);
            sh.field_g.a("lobby", ah.field_i, bn.field_d, (byte) -21, ng.field_l);
            sh.field_g.a("lobby", qc.field_vb, un.field_a, (byte) 87, ne.field_d);
            sh.field_g.a(sc.field_k, (byte) 122, jj.field_c, he.field_fb);
            sh.field_g.a(sc.field_k, (byte) -109, ah.field_d, he.field_fb);
            sh.field_g.a(tm.field_g, (byte) 51, wg.field_h, kd.field_q);
            sh.field_g.a("", ii.field_t, bn.field_d, (byte) 102, ng.field_l);
            sh.field_g.a("", ph.field_Db, un.field_a, (byte) -107, ne.field_d);
            sh.field_g.a(qa.field_w, (byte) -121, eg.field_e, ga.field_b);
            sh.field_g.a(bk.field_Ob, (byte) 114, cl.field_y, bg.field_c);
            sh.field_g.a(bk.field_Ob, (byte) -45, vb.field_S, bg.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "client.V(" + 24903 + 41);
        }
    }

    final static jc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        jc var5 = null;
        jc stackIn_5_0 = null;
        jc stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        jc stackIn_18_0 = null;
        jc stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        jc stackOut_9_0 = null;
        jc stackOut_17_0 = null;
        jc stackOut_19_0 = null;
        Object stackOut_12_0 = null;
        jc stackOut_4_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length()) {
                  var2_int = param0.indexOf('@');
                  if (-1 == var2_int) {
                    stackOut_9_0 = hm.field_a;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(1 + var2_int);
                    if (param1 == -12828) {
                      var5 = ng.a(param1 + 12827, var3);
                      if (null != var5) {
                        stackOut_17_0 = (jc) var5;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        int discarded$2 = -2734;
                        stackOut_19_0 = da.a(var4);
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      }
                    } else {
                      stackOut_12_0 = null;
                      stackIn_13_0 = stackOut_12_0;
                      return (jc) (Object) stackIn_13_0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = eh.field_b;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("client.R(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
        return stackIn_20_0;
    }

    private final void i(byte param0) {
        int var2_int = 0;
        Object var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var4_ref = null;
        int[] var4_ref_int__ = null;
        uf var5_ref_uf = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        lk var5_ref_lk = null;
        rf var5_ref_rf = null;
        int var6_int = 0;
        lk var6 = null;
        vm var6_ref = null;
        int var7 = 0;
        uf var7_ref_uf = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        rf var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String[] var16 = null;
        int var17 = 0;
        qc var18 = null;
        int var19 = 0;
        int var20 = 0;
        ui[] var21 = null;
        int var22 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_168_0 = 0;
        lk stackIn_222_0 = null;
        lk stackIn_223_0 = null;
        lk stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        int stackIn_337_0 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_70_0 = null;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_336_0 = 0;
        int stackOut_335_0 = 0;
        lk stackOut_221_0 = null;
        lk stackOut_223_0 = null;
        int stackOut_223_1 = 0;
        lk stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        L0: {
          var22 = field_A ? 1 : 0;
          var2_int = 0;
          if (kf.field_I == null) {
            break L0;
          } else {
            if (kf.field_I.field_g.field_i < 3) {
              break L0;
            } else {
              var2_int = 1;
              break L0;
            }
          }
        }
        L1: {
          if (null == ce.field_C) {
            break L1;
          } else {
            if (ce.field_C.field_g.field_i >= 3) {
              var2_int = 1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (var2_int == 0) {
            ak.field_d = 1;
            break L2;
          } else {
            L3: {
              if (of.field_e > 0) {
                of.field_e = of.field_e - 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (of.field_e != 0) {
              break L2;
            } else {
              L4: {
                if (kd.field_u >= 15) {
                  break L4;
                } else {
                  if (jf.field_c >= 15) {
                    break L4;
                  } else {
                    if (8 > ak.field_d) {
                      ak.field_d = ak.field_d + 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L5: {
                if (15 >= kd.field_u) {
                  break L5;
                } else {
                  if (jf.field_c <= 15) {
                    break L5;
                  } else {
                    if (ak.field_d > 1) {
                      ak.field_d = ak.field_d - 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              of.field_e = 50;
              kd.field_u = jf.field_c;
              break L2;
            }
          }
        }
        L6: {
          int discarded$21 = -108;
          int discarded$22 = fl.a();
          int discarded$23 = -40;
          pm.field_g = ne.b();
          if (!sa.field_x) {
            break L6;
          } else {
            if (null != wj.field_Ob) {
              wj.field_Ob.a(a.field_g * 50 / 128);
              sa.field_x = false;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (cl.field_v == null) {
            break L7;
          } else {
            if (!cl.field_v.field_e) {
              break L7;
            } else {
              sn.a(false);
              int discarded$24 = 54;
              nm.e();
              break L7;
            }
          }
        }
        L8: {
          stackOut_41_0 = this;
          stackIn_43_0 = stackOut_41_0;
          stackIn_42_0 = stackOut_41_0;
          if (null == cl.field_v) {
            stackOut_43_0 = this;
            stackOut_43_1 = 0;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            break L8;
          } else {
            stackOut_42_0 = this;
            stackOut_42_1 = 1;
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            break L8;
          }
        }
        L9: {
          ((client) this).b(stackIn_44_1 != 0, -11);
          if (!of.field_c) {
            break L9;
          } else {
            int discarded$25 = 24903;
            this.o();
            of.field_c = false;
            break L9;
          }
        }
        L10: {
          uf.field_A = uf.field_A + 1;
          if (ta.a((byte) -104)) {
            ((client) this).g(10);
            if (ta.a((byte) -93)) {
              return;
            } else {
              break L10;
            }
          } else {
            break L10;
          }
        }
        L11: {
          if (sh.field_j) {
            if (!se.i(-1)) {
              int discarded$26 = -60;
              dc.a();
              break L11;
            } else {
              if (ai.f((byte) -127)) {
                if (~gb.field_Vb == ~gb.field_Ob) {
                  L12: {
                    var3 = tm.a((byte) -117);
                    if (var3 != 2) {
                      if (var3 == 3) {
                        jk.a(2, true);
                        break L12;
                      } else {
                        if (var3 != 4) {
                          break L12;
                        } else {
                          og.a(true, 3, true);
                          break L12;
                        }
                      }
                    } else {
                      sn.a(false);
                      break L12;
                    }
                  }
                  this.b(30661, true);
                  break L11;
                } else {
                  this.b(30661, false);
                  break L11;
                }
              } else {
                if (pk.d(65)) {
                  L13: {
                    stackOut_70_0 = this;
                    stackIn_73_0 = stackOut_70_0;
                    stackIn_71_0 = stackOut_70_0;
                    if (null == cl.field_v) {
                      stackOut_73_0 = this;
                      stackOut_73_1 = 0;
                      stackIn_74_0 = stackOut_73_0;
                      stackIn_74_1 = stackOut_73_1;
                      break L13;
                    } else {
                      stackOut_71_0 = this;
                      stackIn_72_0 = stackOut_71_0;
                      stackOut_72_0 = this;
                      stackOut_72_1 = 1;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_74_1 = stackOut_72_1;
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      var3 = ((client) this).a(stackIn_74_1 != 0, (byte) 102);
                      if (1 == var3) {
                        break L15;
                      } else {
                        if (2 != var3) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (cl.field_v != null) {
                        sn.a(false);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (var3 != 2) {
                      break L14;
                    } else {
                      pk.a((byte) -17, se.h(25144));
                      break L14;
                    }
                  }
                  this.b(30661, true);
                  break L11;
                } else {
                  if (!cn.f((byte) 123)) {
                    this.b(30661, false);
                    break L11;
                  } else {
                    if (gb.field_Vb == gb.field_Ob) {
                      L17: {
                        var3 = we.a(false);
                        if (var3 != 1) {
                          break L17;
                        } else {
                          og.a(im.field_f, fe.field_b, true);
                          break L17;
                        }
                      }
                      this.b(30661, true);
                      break L11;
                    } else {
                      this.b(30661, false);
                      break L11;
                    }
                  }
                }
              }
            }
          } else {
            ql.a(jk.field_c, (byte) -115);
            int discarded$27 = 0;
            if (!this.n()) {
              break L11;
            } else {
              sh.field_j = true;
              break L11;
            }
          }
        }
        L18: {
          if (!ph.n(-30146)) {
            L19: while (true) {
              var3_ref = (Object) (Object) (ki) (Object) si.field_e.a(4);
              if (var3_ref == null) {
                L20: while (true) {
                  var3_ref = (Object) (Object) (ff) (Object) jm.field_r.a(4);
                  if (var3_ref != null) {
                    wk.a(3, 5, (ff) var3_ref);
                    continue L20;
                  } else {
                    break L18;
                  }
                }
              } else {
                int discarded$28 = -697;
                ce.a(4, (ki) var3_ref);
                continue L19;
              }
            }
          } else {
            break L18;
          }
        }
        L21: while (true) {
          int discarded$29 = 0;
          if (!vi.a(mk.field_c)) {
            L22: {
              wj.c(4792, 0);
              if (51 >= 49) {
                break L22;
              } else {
                jc discarded$30 = client.a((String) null, 33);
                break L22;
              }
            }
            L23: {
              L24: {
                if (null == hh.field_a) {
                  break L24;
                } else {
                  if (ef.field_N <= 0) {
                    stackOut_336_0 = 0;
                    stackIn_337_0 = stackOut_336_0;
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              stackOut_335_0 = 1;
              stackIn_337_0 = stackOut_335_0;
              break L23;
            }
            L25: {
              var3 = stackIn_337_0;
              if (fm.field_b) {
                var3 = nk.field_i ? 1 : 0;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (fa.field_n) {
                var3 = og.field_ib ? 1 : 0;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (var3 == 0) {
                break L27;
              } else {
                bg.field_b = 0;
                break L27;
              }
            }
            L28: {
              if (!ea.c((byte) -60)) {
                break L28;
              } else {
                L29: {
                  L30: {
                    var4 = ((client) this).g((byte) 125);
                    if (var4 == 0) {
                      break L30;
                    } else {
                      if (var4 == 1) {
                        break L30;
                      } else {
                        break L29;
                      }
                    }
                  }
                  if (1 == var4) {
                    wk.field_i = true;
                    mn.field_c = true;
                    break L29;
                  } else {
                    L31: {
                      if (!uh.field_b) {
                        break L31;
                      } else {
                        L32: {
                          un.a((byte) -123);
                          gd.field_f = true;
                          if (fm.field_b) {
                            wj.a(1, -99, false, 0, true, af.field_a);
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                        dc.a(false, 96);
                        uh.field_b = false;
                        fm.field_b = false;
                        fa.field_n = false;
                        jg.a(-100);
                        am.field_c = false;
                        break L31;
                      }
                    }
                    wk.field_i = false;
                    mn.field_c = false;
                    break L29;
                  }
                }
                L33: {
                  var5 = 0;
                  if (var4 != 2) {
                    break L33;
                  } else {
                    var5 = 1;
                    break L33;
                  }
                }
                L34: {
                  L35: {
                    if (uh.field_b) {
                      break L35;
                    } else {
                      if (mn.field_c) {
                        break L35;
                      } else {
                        if (wk.field_i) {
                          break L35;
                        } else {
                          break L34;
                        }
                      }
                    }
                  }
                  var5 = 1;
                  break L34;
                }
                L36: {
                  if (ea.c((byte) -88)) {
                    break L36;
                  } else {
                    var5 = 0;
                    break L36;
                  }
                }
                if (var5 == 0) {
                  break L28;
                } else {
                  gh.a(false);
                  break L28;
                }
              }
            }
            L37: {
              of.a(0);
              if (!sh.field_j) {
                break L37;
              } else {
                if (am.field_c) {
                  break L37;
                } else {
                  if (jg.field_a != rc.field_d) {
                    nn.a(256, jg.field_a, true);
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
            }
            return;
          } else {
            if (bh.field_k != 9) {
              if (77 != bh.field_k) {
                if (bh.field_k == 14) {
                  we.a((byte) 66);
                  cd.a(true);
                  int discarded$31 = 8192;
                  int discarded$32 = 117;
                  int discarded$33 = 1024;
                  nk.a(id.g(), rd.b(-95), 0, 5, oe.b(-10498, 2000), qi.e(), vl.field_A, 150, oe.b(-10498, 8));
                  int discarded$34 = 98;
                  int discarded$35 = -126;
                  dg.a(21014, tc.g(), l.a());
                  gk.field_Ib = true;
                  uh.field_b = true;
                  mn.field_c = false;
                  var3_ref = (Object) (Object) j.field_d;
                  var4 = 0;
                  L38: while (true) {
                    if (var4 >= 8) {
                      continue L21;
                    } else {
                      ((int[]) var3_ref)[var4] = 0;
                      var4++;
                      continue L38;
                    }
                  }
                } else {
                  if (bh.field_k != 15) {
                    L39: {
                      if (bh.field_k != 10) {
                        break L39;
                      } else {
                        if (uh.field_b) {
                          int discarded$36 = 113;
                          ke.a();
                          continue L21;
                        } else {
                          break L39;
                        }
                      }
                    }
                    if (bh.field_k == 75) {
                      var3_ref = (Object) (Object) b.h(-123);
                      var4_ref = (int[]) var3_ref;
                      var5_ref_uf = de.field_V;
                      var6_int = ((wl) (Object) var5_ref_uf).d((byte) -45);
                      var7 = 0;
                      L40: while (true) {
                        if (~var7 <= ~var6_int) {
                          L41: {
                            if (nm.field_Qb) {
                              var4_ref = (int[]) var3_ref;
                              var5_ref_int__ = o.field_g;
                              var6_int = 0;
                              L42: while (true) {
                                if (var6_int >= 8) {
                                  L43: {
                                    if (null == kf.field_I) {
                                      break L43;
                                    } else {
                                      if (kf.field_I.field_g.field_p[kf.field_I.field_P] == null) {
                                        break L43;
                                      } else {
                                        var4 = 0;
                                        L44: while (true) {
                                          if (var4 >= 31) {
                                            break L43;
                                          } else {
                                            L45: {
                                              if (!rb.a(-18, var4, (int[]) var3_ref)) {
                                                break L45;
                                              } else {
                                                kf.field_I.field_g.field_p[kf.field_I.field_P].field_cb.a((bh) (Object) new vd(var4), 2777);
                                                break L45;
                                              }
                                            }
                                            var4++;
                                            continue L44;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4_ref_int__ = j.field_d;
                                  var5_ref_int__ = (int[]) var3_ref;
                                  var6_int = 0;
                                  L46: while (true) {
                                    if (var6_int >= 8) {
                                      break L41;
                                    } else {
                                      var4_ref_int__[var6_int] = de.b(var4_ref_int__[var6_int], var5_ref_int__[var6_int]);
                                      var6_int++;
                                      continue L46;
                                    }
                                  }
                                } else {
                                  var4_ref[var6_int] = lb.a(var4_ref[var6_int], ~var5_ref_int__[var6_int]);
                                  var6_int++;
                                  continue L42;
                                }
                              }
                            } else {
                              break L41;
                            }
                          }
                          var4_ref_int__ = o.field_g;
                          var5_ref_int__ = (int[]) var3_ref;
                          var6_int = 0;
                          L47: while (true) {
                            if (var6_int >= 8) {
                              continue L21;
                            } else {
                              var4_ref_int__[var6_int] = de.b(var4_ref_int__[var6_int], var5_ref_int__[var6_int]);
                              var6_int++;
                              continue L47;
                            }
                          }
                        } else {
                          var4_ref[var7] = ((wl) (Object) var5_ref_uf).i(7553);
                          var7++;
                          continue L40;
                        }
                      }
                    } else {
                      L48: {
                        if (58 == bh.field_k) {
                          break L48;
                        } else {
                          if (bh.field_k != 59) {
                            if (bh.field_k == 60) {
                              L49: {
                                L50: {
                                  if (fm.field_b) {
                                    break L50;
                                  } else {
                                    if (fa.field_n) {
                                      break L50;
                                    } else {
                                      break L49;
                                    }
                                  }
                                }
                                fm.field_b = false;
                                am.field_c = false;
                                fa.field_n = false;
                                cd.a(true);
                                un.a((byte) -125);
                                jg.a(-111);
                                break L49;
                              }
                              wk.field_i = false;
                              continue L21;
                            } else {
                              L51: {
                                var3_ref = null;
                                if (!fm.field_b) {
                                  if (!fa.field_n) {
                                    break L51;
                                  } else {
                                    var3_ref = (Object) (Object) ce.field_C;
                                    break L51;
                                  }
                                } else {
                                  var3_ref = (Object) (Object) kf.field_I;
                                  break L51;
                                }
                              }
                              L52: {
                                if (null != var3_ref) {
                                  if (61 == bh.field_k) {
                                    L53: {
                                      var4 = de.field_V.d((byte) -92);
                                      var5_ref_lk = ((qc) var3_ref).field_g.field_p[var4];
                                      stackOut_221_0 = (lk) var5_ref_lk;
                                      stackIn_223_0 = stackOut_221_0;
                                      stackIn_222_0 = stackOut_221_0;
                                      if (~var4 != ~((qc) var3_ref).field_P) {
                                        stackOut_223_0 = (lk) (Object) stackIn_223_0;
                                        stackOut_223_1 = 0;
                                        stackIn_224_0 = stackOut_223_0;
                                        stackIn_224_1 = stackOut_223_1;
                                        break L53;
                                      } else {
                                        stackOut_222_0 = (lk) (Object) stackIn_222_0;
                                        stackOut_222_1 = 1;
                                        stackIn_224_0 = stackOut_222_0;
                                        stackIn_224_1 = stackOut_222_1;
                                        break L53;
                                      }
                                    }
                                    ((lk) (Object) stackIn_224_0).a(stackIn_224_1 != 0, (wl) (Object) de.field_V, (byte) 118);
                                    ((qc) var3_ref).a(true, var5_ref_lk, 600, 200, var5_ref_lk.field_jb, var4, false);
                                    if (((qc) var3_ref).field_P == var4) {
                                      we.field_b.f(59, -4);
                                      we.field_b.a(true, var5_ref_lk.field_U);
                                      ((qc) var3_ref).field_E = 7 * var5_ref_lk.field_yb - 4;
                                      continue L21;
                                    } else {
                                      continue L21;
                                    }
                                  } else {
                                    if (bh.field_k == 62) {
                                      L54: {
                                        var4 = de.field_V.d((byte) -124);
                                        var5 = de.field_V.d((byte) -116);
                                        if (~((qc) var3_ref).field_g.field_b >= ~var4) {
                                          break L54;
                                        } else {
                                          if (((qc) var3_ref).field_g.field_p[var4] == null) {
                                            break L54;
                                          } else {
                                            var6 = ((qc) var3_ref).field_g.field_p[var4];
                                            L55: while (true) {
                                              if (~var6.field_fb <= ~var6.field_gb) {
                                                L56: {
                                                  ((qc) var3_ref).a(18, var6, var4);
                                                  ((qc) var3_ref).field_g.field_p[var4] = null;
                                                  ((qc) var3_ref).field_g.field_d = ((qc) var3_ref).field_g.field_d & ~(1 << var4);
                                                  ((qc) var3_ref).field_g.field_i = ((qc) var3_ref).field_g.field_i - 1;
                                                  if (((qc) var3_ref).field_P == var4) {
                                                    cd.a(true);
                                                    ob.field_k = true;
                                                    ((qc) var3_ref).a(rm.field_b, 0);
                                                    break L56;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                                ((qc) var3_ref).field_r = false;
                                                ca.field_kb = 1;
                                                jb.field_a = false;
                                                rb.field_e = 0;
                                                ak.field_d = 1;
                                                ((qc) var3_ref).field_T = var5;
                                                continue L21;
                                              } else {
                                                var7 = ((qc) var3_ref).b(-117, var4) ? 1 : 0;
                                                if (var7 == 0) {
                                                  qb.a((Throwable) null, 16408, "T6");
                                                  si.a(79);
                                                  continue L21;
                                                } else {
                                                  continue L55;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      qb.a((Throwable) null, 16408, "T4: " + var4);
                                      si.a(85);
                                      continue L21;
                                    } else {
                                      if (bh.field_k == 63) {
                                        var4 = de.field_V.d((byte) -53);
                                        var5 = de.field_V.d((byte) -118);
                                        var6_int = sm.field_e + -de.field_V.field_n;
                                        if (0 <= var6_int) {
                                          var7_ref_uf = new uf(var6_int + 1);
                                          var7_ref_uf.a(true, var5);
                                          var7_ref_uf.a(false, var6_int, de.field_V.field_r, de.field_V.field_n);
                                          var7_ref_uf.field_n = 0;
                                          ((qc) var3_ref).field_v[var4].field_g.a((bh) (Object) var7_ref_uf, 2777);
                                          ((qc) var3_ref).field_v[var4].field_e = ((qc) var3_ref).field_v[var4].field_e + var5;
                                          continue L21;
                                        } else {
                                          qb.a((Throwable) null, 16408, "T8: " + var4 + " " + var5 + " " + var6_int);
                                          si.a(65);
                                          continue L21;
                                        }
                                      } else {
                                        if (bh.field_k != 64) {
                                          if (bh.field_k == 65) {
                                            var4 = de.field_V.d((byte) -60);
                                            var5_ref_lk = ((qc) var3_ref).field_g.field_p[var4];
                                            L57: while (true) {
                                              var6_int = ((qc) var3_ref).b(-116, var4) ? 1 : 0;
                                              if (var6_int != 0) {
                                                continue L57;
                                              } else {
                                                L58: {
                                                  if (~((qc) var3_ref).field_P == ~var4) {
                                                    var6_int = 0;
                                                    L59: while (true) {
                                                      if (~var5_ref_lk.field_jb >= ~var6_int) {
                                                        break L58;
                                                      } else {
                                                        fh.field_h = fh.field_h + 30000;
                                                        rk.field_cb = rk.field_cb + 30000;
                                                        var6_int++;
                                                        continue L59;
                                                      }
                                                    }
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                                var5_ref_lk.field_jb = 0;
                                                var5_ref_lk.k(-9897);
                                                ((qc) var3_ref).field_w = 0;
                                                if (~var4 == ~((qc) var3_ref).field_P) {
                                                  ((qc) var3_ref).field_p.a((bh) (Object) new in(cb.field_i, 13, true), 2777);
                                                  ((qc) var3_ref).field_ob = true;
                                                  continue L21;
                                                } else {
                                                  continue L21;
                                                }
                                              }
                                            }
                                          } else {
                                            if (bh.field_k == 66) {
                                              var4 = de.field_V.d((byte) -22);
                                              var5 = de.field_V.d((byte) -76);
                                              var6 = ((qc) var3_ref).field_g.field_p[var4];
                                              var7 = 0;
                                              L60: while (true) {
                                                if (var7 >= var5) {
                                                  continue L21;
                                                } else {
                                                  rf discarded$37 = var6.b(-19939);
                                                  var7++;
                                                  continue L60;
                                                }
                                              }
                                            } else {
                                              if (67 == bh.field_k) {
                                                var4 = de.field_V.d((byte) -50);
                                                var5_ref_rf = ((qc) var3_ref).field_db.a(true, true, de.field_V);
                                                ((qc) var3_ref).field_g.field_p[var4].a(var5_ref_rf, (byte) -121);
                                                continue L21;
                                              } else {
                                                if (bh.field_k != 68) {
                                                  if (bh.field_k == 69) {
                                                    ((qc) var3_ref).field_T = de.field_V.d((byte) -78);
                                                    ((qc) var3_ref).field_r = true;
                                                    ((qc) var3_ref).field_p.a((bh) (Object) new in(bn.field_c, 8, false), 2777);
                                                    continue L21;
                                                  } else {
                                                    if (bh.field_k == 76) {
                                                      ((qc) var3_ref).field_g.field_f[((qc) var3_ref).field_g.field_o] = de.field_V.g((byte) -89);
                                                      ((qc) var3_ref).field_g.field_o = ((qc) var3_ref).field_g.field_o + 1;
                                                      continue L21;
                                                    } else {
                                                      if (70 != bh.field_k) {
                                                        if (71 == bh.field_k) {
                                                          ((qc) var3_ref).field_g.field_d = de.field_V.d((byte) -45);
                                                          continue L21;
                                                        } else {
                                                          if (bh.field_k != 72) {
                                                            if (bh.field_k == 73) {
                                                              ((qc) var3_ref).field_g.field_a = de.field_V.d((byte) -77);
                                                              continue L21;
                                                            } else {
                                                              if (bh.field_k != 74) {
                                                                break L52;
                                                              } else {
                                                                ((qc) var3_ref).field_yb = de.field_V.d((byte) -31);
                                                                ((qc) var3_ref).field_g.field_d = ((qc) var3_ref).field_g.field_d & ~((qc) var3_ref).field_yb;
                                                                ((qc) var3_ref).field_g.field_a = ((qc) var3_ref).field_g.field_a & ~((qc) var3_ref).field_yb;
                                                                continue L21;
                                                              }
                                                            }
                                                          } else {
                                                            ((qc) var3_ref).field_g.field_h = de.field_V.d((byte) -19);
                                                            continue L21;
                                                          }
                                                        }
                                                      } else {
                                                        var4 = de.field_V.g((byte) -104);
                                                        var5 = 0;
                                                        L61: while (true) {
                                                          if (~var5 <= ~((qc) var3_ref).field_g.field_b) {
                                                            L62: {
                                                              ((qc) var3_ref).field_g.a(var4, (byte) -70);
                                                              ((qc) var3_ref).a(100);
                                                              if (((qc) var3_ref).field_P >= 0) {
                                                                cd.a(true);
                                                                break L62;
                                                              } else {
                                                                break L62;
                                                              }
                                                            }
                                                            L63: {
                                                              L64: {
                                                                if (var4 < 0) {
                                                                  break L64;
                                                                } else {
                                                                  if (!((qc) var3_ref).field_ob) {
                                                                    ((qc) var3_ref).a(hb.field_Ub, 0);
                                                                    break L63;
                                                                  } else {
                                                                    break L64;
                                                                  }
                                                                }
                                                              }
                                                              ((qc) var3_ref).a(rm.field_b, 0);
                                                              break L63;
                                                            }
                                                            ob.field_k = true;
                                                            continue L21;
                                                          } else {
                                                            L65: {
                                                              if (null == ((qc) var3_ref).field_g.field_p[var5]) {
                                                                break L65;
                                                              } else {
                                                                L66: while (true) {
                                                                  if (((qc) var3_ref).field_v[var5].field_g.b(-24)) {
                                                                    break L65;
                                                                  } else {
                                                                    boolean discarded$38 = ((qc) var3_ref).b(39, var5);
                                                                    continue L66;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var5++;
                                                            continue L61;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  ((qc) var3_ref).field_T = de.field_V.d((byte) -35);
                                                  ((qc) var3_ref).field_p.a((bh) (Object) new in(eb.field_c, 12, false), 2777);
                                                  continue L21;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L67: {
                                            var4 = de.field_V.d((byte) -127);
                                            var5_ref_lk = ((qc) var3_ref).field_g.field_p[var4];
                                            var6_ref = new vm();
                                            var6_ref.field_y = de.field_V.g((byte) -88);
                                            var6_ref.field_n = de.field_V.g((byte) -118);
                                            var6_ref.field_v = de.field_V.d((byte) -93);
                                            var6_ref.field_o = de.field_V.d((byte) -83);
                                            var6_ref.field_q = ((qc) var3_ref).field_db.a(true, true, de.field_V);
                                            var6_ref.field_t = de.field_V.d((byte) -64);
                                            ((qc) var3_ref).field_v[var4].field_g.a((bh) (Object) var6_ref, 2777);
                                            var7 = de.field_V.a(117);
                                            var8 = de.field_V.a(127) + var7;
                                            if (~var8 < ~var7) {
                                              var9 = var7;
                                              L68: while (true) {
                                                if (var8 <= var9) {
                                                  L69: while (true) {
                                                    if (~var5_ref_lk.field_fb <= ~var5_ref_lk.field_gb) {
                                                      var5_ref_lk.field_gb = var8;
                                                      var5_ref_lk.field_fb = var7;
                                                      break L67;
                                                    } else {
                                                      var9 = ((qc) var3_ref).b(-126, var4) ? 1 : 0;
                                                      if (var9 != 0) {
                                                        continue L69;
                                                      } else {
                                                        qb.a((Throwable) null, 16408, "T7");
                                                        si.a(97);
                                                        continue L69;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  L70: {
                                                    var10 = new rf(var9);
                                                    if (~var4 == ~((qc) var3_ref).field_P) {
                                                      var10.field_m = -var7 + var9;
                                                      break L70;
                                                    } else {
                                                      break L70;
                                                    }
                                                  }
                                                  ((qc) var3_ref).field_db.a(var10, 0);
                                                  var9++;
                                                  continue L68;
                                                }
                                              }
                                            } else {
                                              break L67;
                                            }
                                          }
                                          if (((qc) var3_ref).field_P == var4) {
                                            L71: while (true) {
                                              if (!var6_ref.a((byte) 58)) {
                                                we.field_b.f(59, -4);
                                                we.field_b.a(true, ((qc) var3_ref).field_g.field_p[var4].field_U);
                                                ((qc) var3_ref).field_w = 0;
                                                continue L21;
                                              } else {
                                                boolean discarded$39 = ((qc) var3_ref).b(-118, var4);
                                                continue L71;
                                              }
                                            }
                                          } else {
                                            continue L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L52;
                                }
                              }
                              ((client) this).f((byte) 126);
                              continue L21;
                            }
                          } else {
                            break L48;
                          }
                        }
                      }
                      L72: {
                        var3 = de.field_V.e(3);
                        var4 = var3 & 15;
                        var5 = 3 & var3 >> 4;
                        var6_int = var3 >> 6 & 7;
                        var7 = (var3 & 3812) >> 9;
                        if ((var3 & 4096) == 0) {
                          stackOut_158_0 = 0;
                          stackIn_159_0 = stackOut_158_0;
                          break L72;
                        } else {
                          stackOut_157_0 = 1;
                          stackIn_159_0 = stackOut_157_0;
                          break L72;
                        }
                      }
                      L73: {
                        var8 = stackIn_159_0;
                        if ((8192 & var3) == 0) {
                          stackOut_161_0 = 0;
                          stackIn_162_0 = stackOut_161_0;
                          break L73;
                        } else {
                          stackOut_160_0 = 1;
                          stackIn_162_0 = stackOut_160_0;
                          break L73;
                        }
                      }
                      L74: {
                        var9 = stackIn_162_0;
                        if ((var3 & 16384) == 0) {
                          stackOut_164_0 = 0;
                          stackIn_165_0 = stackOut_164_0;
                          break L74;
                        } else {
                          stackOut_163_0 = 1;
                          stackIn_165_0 = stackOut_163_0;
                          break L74;
                        }
                      }
                      L75: {
                        var10_int = stackIn_165_0;
                        if ((var3 & 32768) == 0) {
                          stackOut_167_0 = 0;
                          stackIn_168_0 = stackOut_167_0;
                          break L75;
                        } else {
                          stackOut_166_0 = 1;
                          stackIn_168_0 = stackOut_166_0;
                          break L75;
                        }
                      }
                      L76: {
                        var11 = stackIn_168_0;
                        var12 = de.field_V.e(3);
                        var13 = de.field_V.d((byte) -92);
                        var14 = de.field_V.d((byte) -116);
                        var15 = de.field_V.g((byte) -100);
                        if (var15 < 0) {
                          var15 = -2;
                          break L76;
                        } else {
                          break L76;
                        }
                      }
                      var16 = new String[var14];
                      var17 = 0;
                      L77: while (true) {
                        if (var17 >= var14) {
                          L78: {
                            var17 = de.field_V.d((byte) -27);
                            gh.field_e = null;
                            var18 = new qc(true, var13, var8 != 0, var4, var5, var6_int, var7, var16, var15, var9 != 0, false, false);
                            var18.field_R = var12;
                            var18.field_r = var10_int != 0;
                            if (var10_int != 0) {
                              var18.field_p.a((bh) (Object) new in(bn.field_c, 8, true), 2777);
                              break L78;
                            } else {
                              if (var11 != 0) {
                                var18.field_p.a((bh) (Object) new in(cf.field_e, 10, true), 2777);
                                break L78;
                              } else {
                                break L78;
                              }
                            }
                          }
                          var19 = 0;
                          var20 = 0;
                          L79: while (true) {
                            if (var20 >= var18.field_g.field_b) {
                              L80: {
                                if (var19 > 2) {
                                  var18.field_Ab = 100;
                                  break L80;
                                } else {
                                  break L80;
                                }
                              }
                              L81: {
                                var20 = var18.field_P;
                                if (var20 < 0) {
                                  var20 = 0;
                                  L82: while (true) {
                                    if (200 == var18.field_V[var20]) {
                                      break L81;
                                    } else {
                                      var20++;
                                      continue L82;
                                    }
                                  }
                                } else {
                                  break L81;
                                }
                              }
                              L83: {
                                if (2 != var19) {
                                  break L83;
                                } else {
                                  var20 = (var20 + 1) % var18.field_g.field_b;
                                  L84: while (true) {
                                    if (var18.field_V[var20] == 200) {
                                      break L83;
                                    } else {
                                      var20 = (var20 - -1) % var18.field_g.field_b;
                                      continue L84;
                                    }
                                  }
                                }
                              }
                              L85: {
                                var18.field_i = var20;
                                var18.field_D = var20;
                                var18.field_lb = var20;
                                if (bh.field_k == 58) {
                                  kf.field_I = var18;
                                  fm.field_b = true;
                                  int discarded$40 = 58;
                                  eb.a();
                                  break L85;
                                } else {
                                  ce.field_C = var18;
                                  fa.field_n = true;
                                  break L85;
                                }
                              }
                              L86: {
                                wk.field_i = false;
                                am.field_c = true;
                                if (var4 == 10) {
                                  var21 = ee.field_a;
                                  break L86;
                                } else {
                                  var21 = sb.field_u[var13];
                                  break L86;
                                }
                              }
                              nn.a(var18.b(true), var21[0], true);
                              continue L21;
                            } else {
                              L87: {
                                if ((var17 & 1 << var20) == 0) {
                                  break L87;
                                } else {
                                  var18.field_V[var20] = 200;
                                  var19++;
                                  break L87;
                                }
                              }
                              var20++;
                              continue L79;
                            }
                          }
                        } else {
                          var16[var17] = de.field_V.b(true);
                          var17++;
                          continue L77;
                        }
                      }
                    }
                  } else {
                    L88: {
                      if (uh.field_b) {
                        int discarded$41 = 1;
                        bb.b();
                        kh.a(true);
                        kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                        dc.a(false, 126);
                        un.a((byte) -124);
                        fm.field_b = false;
                        fa.field_n = false;
                        gd.field_f = true;
                        uh.field_b = false;
                        jg.a(-48);
                        break L88;
                      } else {
                        break L88;
                      }
                    }
                    mn.field_c = false;
                    wk.field_i = false;
                    continue L21;
                  }
                }
              } else {
                mn.field_c = false;
                pn.a(true, false, true);
                continue L21;
              }
            } else {
              mn.field_c = false;
              var3_ref = (Object) (Object) de.field_V.c((byte) -38);
              wj.a(1, -86, false, 0, true, (String) var3_ref);
              continue L21;
            }
          }
        }
    }

    public static void j(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_y = null;
              field_D = null;
              field_E = null;
              field_F = null;
              field_C = null;
              if (param0 == -56) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            field_x = null;
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "client.U(" + param0 + 41);
        }
    }

    public client() {
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (km.field_z == null) {
                break L1;
              } else {
                km.field_z.e();
                break L1;
              }
            }
            if (param0 == 0) {
              L2: {
                if (null != cj.field_b) {
                  cj.field_b.e();
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (null == cl.field_v) {
                  break L3;
                } else {
                  sn.a(false);
                  break L3;
                }
              }
              int discarded$2 = 88;
              s.h();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "client.I(" + param0 + 41);
        }
    }

    private final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ke stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        ke stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        ke stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        ke stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_157_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_294_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_154_0 = 0;
        int stackOut_156_0 = 0;
        ke stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        ke stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        ke stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        ke stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        int stackOut_204_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_293_0 = 0;
        int stackOut_291_0 = 0;
        var9 = field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gb.field_Vb == gb.field_Ob) {
                L2: {
                  var3_int = 0;
                  var4 = 0;
                  if (!param1) {
                    if (null == kf.field_G) {
                      if (!am.field_c) {
                        if (!uh.field_b) {
                          break L2;
                        } else {
                          var3_int = 1;
                          break L2;
                        }
                      } else {
                        if (!uh.field_b) {
                          var5 = kf.field_I.b(2, true) ? 1 : 0;
                          L3: while (true) {
                            L4: {
                              if (var5 != 0) {
                                break L4;
                              } else {
                                if (!ab.c((byte) 50)) {
                                  break L4;
                                } else {
                                  var5 = kf.field_I.e(false) ? 1 : 0;
                                  continue L3;
                                }
                              }
                            }
                            break L2;
                          }
                        } else {
                          L5: {
                            L6: {
                              var3_int = 1;
                              if (kf.field_G != null) {
                                break L6;
                              } else {
                                if (ea.d((byte) 92)) {
                                  break L6;
                                } else {
                                  stackOut_154_0 = 1;
                                  stackIn_157_0 = stackOut_154_0;
                                  break L5;
                                }
                              }
                            }
                            stackOut_156_0 = 0;
                            stackIn_157_0 = stackOut_156_0;
                            break L5;
                          }
                          var4 = stackIn_157_0;
                          break L2;
                        }
                      }
                    } else {
                      if (!ba.field_c) {
                        if (lk.field_F) {
                          h.field_d.j(-114);
                          break L2;
                        } else {
                          if (mg.field_Zb) {
                            cl.field_B.f((byte) -63);
                            break L2;
                          } else {
                            if (fm.field_e) {
                              am.field_a.l((byte) 101);
                              break L2;
                            } else {
                              if (ve.field_Hc) {
                                ca.field_wb.d(-8622);
                                break L2;
                              } else {
                                if (!nk.field_k) {
                                  if (gi.field_b) {
                                    L7: {
                                      L8: {
                                        int discarded$17 = 95;
                                        h.a((ke) null);
                                        boolean discarded$18 = wf.a(false);
                                        var5 = lg.a(0, true);
                                        if (1 == var5) {
                                          break L8;
                                        } else {
                                          if (var5 != 2) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        gi.field_b = false;
                                        stackOut_121_0 = kf.field_G;
                                        stackOut_121_1 = -1;
                                        stackIn_126_0 = stackOut_121_0;
                                        stackIn_126_1 = stackOut_121_1;
                                        stackIn_122_0 = stackOut_121_0;
                                        stackIn_122_1 = stackOut_121_1;
                                        if (var5 != 2) {
                                          stackOut_126_0 = (ke) (Object) stackIn_126_0;
                                          stackOut_126_1 = stackIn_126_1;
                                          stackOut_126_2 = 0;
                                          stackIn_127_0 = stackOut_126_0;
                                          stackIn_127_1 = stackOut_126_1;
                                          stackIn_127_2 = stackOut_126_2;
                                          break L9;
                                        } else {
                                          stackOut_122_0 = (ke) (Object) stackIn_122_0;
                                          stackOut_122_1 = stackIn_122_1;
                                          stackIn_124_0 = stackOut_122_0;
                                          stackIn_124_1 = stackOut_122_1;
                                          stackOut_124_0 = (ke) (Object) stackIn_124_0;
                                          stackOut_124_1 = stackIn_124_1;
                                          stackOut_124_2 = 1;
                                          stackIn_127_0 = stackOut_124_0;
                                          stackIn_127_1 = stackOut_124_1;
                                          stackIn_127_2 = stackOut_124_2;
                                          break L9;
                                        }
                                      }
                                      ((ke) (Object) stackIn_127_0).c(stackIn_127_1, stackIn_127_2 != 0);
                                      break L7;
                                    }
                                    L10: {
                                      if (3 != var5) {
                                        break L10;
                                      } else {
                                        sm.a((byte) -65, se.h(25144));
                                        break L10;
                                      }
                                    }
                                    break L2;
                                  } else {
                                    kf.field_G.k(128);
                                    break L2;
                                  }
                                } else {
                                  f.field_s.g(2824);
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        pd.field_d.g((byte) -96);
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L11: {
                  if (!uh.field_b) {
                    break L11;
                  } else {
                    if (mn.field_c) {
                      break L11;
                    } else {
                      if (!wk.field_i) {
                        L12: {
                          if (!fm.field_b) {
                            break L12;
                          } else {
                            if (!jg.field_i) {
                              break L12;
                            } else {
                              var3_int = 0;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          ka.a(var3_int != 0, -3051);
                          if (fa.field_n) {
                            boolean discarded$19 = ce.field_C.b(2, var4 != 0);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (fm.field_b) {
                            L15: {
                              ph.a(180, 320, false, var4 != 0);
                              if (jg.field_i) {
                                var4 = 0;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            boolean discarded$20 = kf.field_I.b(2, var4 != 0);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L16: while (true) {
                          if (!ab.c((byte) -123)) {
                            break L11;
                          } else {
                            L17: {
                              L18: {
                                if (null == hh.field_a) {
                                  break L18;
                                } else {
                                  if (ef.field_N <= 0) {
                                    stackOut_204_0 = 0;
                                    stackIn_205_0 = stackOut_204_0;
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              stackOut_202_0 = 1;
                              stackIn_205_0 = stackOut_202_0;
                              break L17;
                            }
                            L19: {
                              var5 = stackIn_205_0;
                              if (fm.field_b) {
                                var5 = nk.field_i ? 1 : 0;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (!fa.field_n) {
                                break L20;
                              } else {
                                var5 = og.field_ib ? 1 : 0;
                                break L20;
                              }
                            }
                            L21: {
                              if (param1) {
                                break L21;
                              } else {
                                if (!fm.field_b) {
                                  if (var5 == 0) {
                                    break L21;
                                  } else {
                                    int discarded$21 = 69;
                                    int discarded$22 = 13;
                                    int discarded$23 = 15;
                                    int discarded$24 = 12;
                                    boolean discarded$25 = ig.a();
                                    break L21;
                                  }
                                } else {
                                  if (!gd.a(13, 12, 15, (byte) -83)) {
                                    break L21;
                                  } else {
                                    continue L16;
                                  }
                                }
                              }
                            }
                            L22: {
                              if (!fa.field_n) {
                                break L22;
                              } else {
                                if (var4 == 0) {
                                  break L22;
                                } else {
                                  boolean discarded$26 = ce.field_C.e(false);
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              if (!fm.field_b) {
                                break L23;
                              } else {
                                if (var4 == 0) {
                                  break L23;
                                } else {
                                  boolean discarded$27 = kf.field_I.e(false);
                                  break L23;
                                }
                              }
                            }
                            continue L16;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                L24: {
                  if (!uh.field_b) {
                    int discarded$28 = -29550;
                    gn.b();
                    int discarded$29 = -28199;
                    if (ab.e() == 0) {
                      we.a((byte) 68);
                      break L24;
                    } else {
                      break L24;
                    }
                  } else {
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    if (hh.field_a == null) {
                      break L26;
                    } else {
                      if (ef.field_N <= 0) {
                        stackOut_250_0 = 0;
                        stackIn_251_0 = stackOut_250_0;
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  stackOut_248_0 = 1;
                  stackIn_251_0 = stackOut_248_0;
                  break L25;
                }
                L27: {
                  var5 = stackIn_251_0;
                  if (!fm.field_b) {
                    break L27;
                  } else {
                    var5 = nk.field_i ? 1 : 0;
                    break L27;
                  }
                }
                L28: {
                  if (fa.field_n) {
                    var5 = og.field_ib ? 1 : 0;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (var5 != 0) {
                    if (~ef.field_N > ~dl.field_M) {
                      ef.field_N = ef.field_N + 1;
                      break L29;
                    } else {
                      break L29;
                    }
                  } else {
                    if (ef.field_N > 0) {
                      ef.field_N = ef.field_N - 1;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                }
                L30: {
                  var6 = dl.field_M * dl.field_M;
                  var7 = -(ef.field_N * ef.field_N) + var6;
                  var8 = ea.field_p + 120 * var7 / var6;
                  ij.a(var8, -32);
                  if (ue.field_b != hh.field_a) {
                    break L30;
                  } else {
                    int discarded$30 = -28199;
                    if (ab.e() != 0) {
                      break L30;
                    } else {
                      if (!am.field_c) {
                        if (!uh.field_b) {
                          db.field_d = true;
                          ue.field_b = tc.field_Tb;
                          wg.field_f = true;
                          break L30;
                        } else {
                          db.field_d = false;
                          wg.field_f = false;
                          ue.field_b = null;
                          break L30;
                        }
                      } else {
                        L31: {
                          db.field_d = false;
                          if (kf.field_I == null) {
                            break L31;
                          } else {
                            if (kf.field_I.field_hb < 38) {
                              ue.field_b = dn.field_p[kf.field_I.field_g.field_l];
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L32: {
                          if (fa.field_n) {
                            ue.field_b = dn.field_p[ce.field_C.field_g.field_l];
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        L33: {
                          if (uh.field_b) {
                            stackOut_293_0 = 0;
                            stackIn_294_0 = stackOut_293_0;
                            break L33;
                          } else {
                            stackOut_291_0 = 1;
                            stackIn_294_0 = stackOut_291_0;
                            break L33;
                          }
                        }
                        wg.field_f = stackIn_294_0 != 0;
                        break L30;
                      }
                    }
                  }
                }
                if (ue.field_b != hh.field_a) {
                  vf.field_b = vf.field_b + 1;
                  if (30 > vf.field_b) {
                    break L1;
                  } else {
                    vf.field_b = 0;
                    hh.field_a = ue.field_b;
                    qd.field_Nb = wg.field_f;
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                if (ve.field_nc != gb.field_Ob) {
                  if (~gb.field_Ob == ~g.field_L) {
                    L34: {
                      if (!ph.n(-30146)) {
                        L35: {
                          if (null != gh.field_e) {
                            qb.a(3, (byte) 85, gh.field_e);
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        int discarded$31 = -1209;
                        ek.g();
                        if (1 == fe.field_b) {
                          vk.a(true, (byte) -53);
                          break L34;
                        } else {
                          if (2 == fe.field_b) {
                            jm.a(0, true);
                            break L34;
                          } else {
                            if (fe.field_b == 3) {
                              jk.a(2, true);
                              break L34;
                            } else {
                              if (fe.field_b != 4) {
                                if (fe.field_b == 5) {
                                  h.field_d = uh.a(o.field_g, false, 0, -111);
                                  break L34;
                                } else {
                                  if (fe.field_b != 6) {
                                    if (fe.field_b == 8) {
                                      am.field_a = ib.a((byte) 82, false);
                                      break L34;
                                    } else {
                                      if (7 == fe.field_b) {
                                        ca.field_wb = oj.a(false, 415);
                                        break L34;
                                      } else {
                                        throw new IllegalStateException(Integer.toString(fe.field_b));
                                      }
                                    }
                                  } else {
                                    cl.field_B = qj.a(-44, false);
                                    break L34;
                                  }
                                }
                              } else {
                                dc.a(false, 114);
                                break L34;
                              }
                            }
                          }
                        }
                      } else {
                        break L34;
                      }
                    }
                    gb.field_Ob = lk.field_I;
                    break L1;
                  } else {
                    rf.field_f = rf.field_f - 1;
                    if (rf.field_f != 0) {
                      break L1;
                    } else {
                      gb.field_Ob = gb.field_Vb;
                      break L1;
                    }
                  }
                } else {
                  rf.field_f = rf.field_f + 1;
                  if (rf.field_f == 16) {
                    L36: {
                      if (im.field_f) {
                        int discarded$32 = -126;
                        gf.a();
                        break L36;
                      } else {
                        int discarded$33 = 108;
                        ed.a();
                        break L36;
                      }
                    }
                    gb.field_Ob = g.field_L;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "client.O(" + 30661 + 44 + param1 + 41);
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            client.j((byte) -56);
            int discarded$209 = 101;
            vd.c();
            int discarded$210 = 79;
            vj.b();
            int discarded$211 = 112;
            bj.a();
            int discarded$212 = 710;
            km.c();
            int discarded$213 = 128;
            n.b();
            int discarded$214 = -33;
            ml.a();
            int discarded$215 = 1;
            wh.a();
            int discarded$216 = -9;
            jb.a();
            hn.b(6);
            int discarded$217 = 0;
            oh.b();
            int discarded$218 = 1;
            wg.a();
            int discarded$219 = 64;
            hm.b();
            hk.a();
            int discarded$220 = 127;
            ji.a();
            int discarded$221 = 122;
            th.a();
            bb.a(-117);
            wl.d(8);
            int discarded$222 = 78;
            ik.b();
            int discarded$223 = 0;
            jh.a();
            int discarded$224 = -108;
            fe.a();
            ge.a(true);
            dm.a(121);
            int discarded$225 = 82;
            hc.a();
            int discarded$226 = 0;
            o.a();
            int discarded$227 = 126;
            l.b();
            int discarded$228 = 23358;
            u.a();
            hl.a(-21128);
            int discarded$229 = -46;
            pc.a();
            int discarded$230 = -105;
            sh.a();
            int discarded$231 = 89;
            lj.a();
            int discarded$232 = -114;
            jf.a();
            int discarded$233 = -120;
            ie.a();
            eh.a(24744);
            cb.b(12623);
            int discarded$234 = -100;
            ql.b();
            int discarded$235 = -91;
            ri.a();
            int discarded$236 = 115;
            dd.b();
            int discarded$237 = 0;
            im.a();
            int discarded$238 = 0;
            ne.a();
            nh.a((byte) -73);
            int discarded$239 = -11657;
            qk.c();
            int discarded$240 = 113;
            pl.b();
            en.f();
            int discarded$241 = 31158;
            ui.b();
            ia.f();
            int discarded$242 = 126;
            ke.l();
            qc.a(false);
            int discarded$243 = 8;
            ah.a();
            int discarded$244 = 0;
            gn.a();
            int discarded$245 = -75;
            ul.b();
            int discarded$246 = 36;
            lk.g();
            bh.b(25189);
            int discarded$247 = 18;
            wa.a();
            int discarded$248 = 78;
            ch.a();
            int discarded$249 = 36;
            d.a();
            int discarded$250 = -120;
            rc.a();
            int discarded$251 = 103;
            tm.a();
            j.a(true);
            w.f((byte) 77);
            int discarded$252 = 116;
            ve.h();
            int discarded$253 = -121;
            nk.a();
            int discarded$254 = -18263;
            tj.e();
            gg.c(0);
            be.a(-106);
            vh.a(true);
            int discarded$255 = 110;
            p.a();
            int discarded$256 = -96;
            ed.b();
            int discarded$257 = -114;
            rg.a();
            ka.h((byte) 102);
            int discarded$258 = 0;
            wj.s();
            int discarded$259 = 89;
            qn.n();
            ph.m((byte) 24);
            int discarded$260 = 15;
            gk.p();
            int discarded$261 = 1;
            tf.b();
            int discarded$262 = 1;
            lg.f();
            int discarded$263 = 0;
            he.i();
            int discarded$264 = 3;
            cn.j();
            int discarded$265 = 101;
            jg.b();
            int discarded$266 = 23302;
            c.a();
            int discarded$267 = 0;
            mc.a();
            int discarded$268 = -61;
            ng.a();
            int discarded$269 = 23369;
            je.b();
            int discarded$270 = -1;
            oa.b();
            int discarded$271 = -67;
            ad.a();
            lf.a(-13495);
            int discarded$272 = 91;
            of.a();
            int discarded$273 = 119;
            am.a();
            lc.a(-27983);
            mm.a();
            int discarded$274 = -32;
            ub.b();
            int discarded$275 = 3;
            nd.a();
            int discarded$276 = -120;
            pd.a();
            int discarded$277 = -128;
            h.b();
            int discarded$278 = 1;
            uc.a();
            int discarded$279 = -117;
            rn.a();
            int discarded$280 = 108;
            ll.a();
            int discarded$281 = 77;
            qd.f();
            nm.g(48);
            ha.f(3);
            int discarded$282 = 32;
            jd.e();
            int discarded$283 = -2;
            gb.e();
            int discarded$284 = -94;
            s.i();
            int discarded$285 = -103;
            pf.a();
            mg.f(256);
            int discarded$286 = -112;
            ak.a();
            int discarded$287 = 102;
            ec.a();
            sk.e(-28610);
            int discarded$288 = -93;
            vk.a();
            int discarded$289 = -18551;
            ic.a();
            int discarded$290 = 27067;
            vf.a();
            int discarded$291 = 0;
            om.a();
            kb.a(-109);
            int discarded$292 = -91;
            jk.a();
            int discarded$293 = -9724;
            hh.a();
            int discarded$294 = -94;
            cc.a();
            int discarded$295 = -22811;
            e.a();
            int discarded$296 = -1;
            pe.a();
            int discarded$297 = 0;
            fh.b();
            int discarded$298 = 92;
            eb.b();
            int discarded$299 = 2;
            oi.a();
            sa.c((byte) -82);
            int discarded$300 = 127;
            uk.c();
            int discarded$301 = 110;
            sl.a();
            int discarded$302 = 120;
            uf.h();
            nn.a(14925);
            gf.a(2);
            int discarded$303 = -66;
            v.a();
            int discarded$304 = 98;
            gh.a();
            int discarded$305 = 1;
            fm.a();
            int discarded$306 = -78;
            ee.a();
            int discarded$307 = 126;
            hg.a();
            rf.a(false);
            int discarded$308 = 123;
            in.a();
            int discarded$309 = 121;
            vm.a();
            int discarded$310 = 10140;
            eg.a();
            int discarded$311 = 62;
            pm.a();
            int discarded$312 = -17690;
            mf.i();
            int discarded$313 = -118;
            gd.a();
            ok.d();
            int discarded$314 = 0;
            aj.b();
            bk.e(15338);
            int discarded$315 = 112;
            qb.d();
            int discarded$316 = 1;
            ab.d();
            int discarded$317 = 106;
            pj.h();
            kh.b(-1643605936);
            int discarded$318 = 1;
            el.b();
            int discarded$319 = 1;
            le.b();
            int discarded$320 = 12741;
            hf.b();
            int discarded$321 = -27513;
            ci.a();
            int discarded$322 = -126;
            sf.f();
            pg.a((byte) 126);
            ib.m(-30);
            int discarded$323 = -1;
            a.a();
            qg.a();
            va.c();
            int discarded$324 = 3805;
            oj.a();
            int discarded$325 = -68;
            dh.a();
            int discarded$326 = 91;
            vg.a();
            int discarded$327 = 2;
            rm.a();
            fc.a(38);
            int discarded$328 = 1;
            aa.a();
            int discarded$329 = 101;
            li.a();
            int discarded$330 = 16057;
            dk.b();
            int discarded$331 = 86;
            un.b();
            oc.a(true);
            int discarded$332 = 0;
            mk.a();
            if (param0 >= 75) {
              td.a();
              int discarded$333 = 1;
              vl.a();
              int discarded$334 = 1;
              kl.a();
              int discarded$335 = 111;
              uj.a();
              int discarded$336 = -117;
              mn.a();
              kk.a((byte) -117);
              bc.b((byte) -102);
              int discarded$337 = -100;
              al.a();
              int discarded$338 = 126;
              qj.b();
              int discarded$339 = 126;
              cf.a();
              int discarded$340 = 54;
              ce.c();
              int discarded$341 = -79;
              ma.e();
              t.l((byte) 94);
              int discarded$342 = 2;
              bl.i();
              kf.h(116);
              int discarded$343 = -119;
              rd.b();
              k.a(-5161);
              ih.b();
              int discarded$344 = -128;
              ue.a();
              fl.a(29047);
              int discarded$345 = -52;
              ga.a();
              int discarded$346 = -48;
              cj.a();
              int discarded$347 = 34;
              ig.g();
              em.a((byte) 82);
              int discarded$348 = 30553;
              sm.a();
              ac.g((byte) -17);
              me.c(0);
              int discarded$349 = 92;
              la.a();
              int discarded$350 = 117;
              fb.a();
              int discarded$351 = 0;
              jj.a();
              int discarded$352 = -37;
              we.b();
              int discarded$353 = 91;
              db.a();
              int discarded$354 = 72;
              dn.d();
              int discarded$355 = -119;
              wf.f();
              int discarded$356 = 79;
              gi.a();
              dc.a(true);
              int discarded$357 = -20007;
              qe.a();
              kj.a();
              fj.a(25988);
              int discarded$358 = 124;
              cg.a();
              int discarded$359 = 92;
              bn.a();
              int discarded$360 = 1;
              wd.a();
              int discarded$361 = -121;
              de.g();
              int discarded$362 = 109;
              og.i();
              int discarded$363 = 81;
              rk.j();
              int discarded$364 = 104;
              ca.l();
              df.a(1);
              int discarded$365 = 117;
              qi.f();
              g.a(-99);
              int discarded$366 = 47;
              pa.h();
              dl.b(false);
              int discarded$367 = 18966;
              wm.c();
              int discarded$368 = 22;
              bg.a();
              int discarded$369 = 106;
              md.f();
              int discarded$370 = -59;
              ai.a();
              int discarded$371 = -109;
              b.a();
              int discarded$372 = 105;
              tc.h();
              int discarded$373 = -102;
              hb.e();
              int discarded$374 = -121;
              da.a();
              int discarded$375 = 573767765;
              rb.a();
              qf.c(119);
              int discarded$376 = 33;
              pn.l();
              int discarded$377 = 1;
              oe.b();
              vb.j(-20);
              int discarded$378 = -37;
              ea.b();
              int discarded$379 = 0;
              fn.b();
              int discarded$380 = 0;
              mb.a();
              se.g(11344);
              id.c(true);
              int discarded$381 = 0;
              si.e();
              int discarded$382 = 73;
              uh.b();
              int discarded$383 = 46;
              vi.f();
              int discarded$384 = 2;
              qm.a();
              int discarded$385 = 8;
              ua.e();
              sc.b(false);
              hj.a();
              int discarded$386 = 0;
              wi.a();
              cm.a(1714134600);
              int discarded$387 = 8;
              dg.a();
              int discarded$388 = 93;
              kc.a();
              kn.a(-1);
              int discarded$389 = 3;
              sg.a();
              int discarded$390 = -21771;
              ug.a();
              fk.c(8);
              int discarded$391 = 6;
              on.a();
              int discarded$392 = 87;
              di.c();
              int discarded$393 = 38;
              gm.d();
              int discarded$394 = 0;
              tg.a();
              ef.g(0);
              int discarded$395 = -78;
              wb.e();
              int discarded$396 = -39;
              cl.c();
              pb.a((byte) 78);
              lb.a(-19893);
              int discarded$397 = 30061;
              f.c();
              ki.c((byte) 22);
              int discarded$398 = 13820388;
              sb.a();
              int discarded$399 = -45;
              ff.a();
              int discarded$400 = 0;
              ta.a();
              int discarded$401 = 0;
              um.a();
              int discarded$402 = -73;
              bf.a();
              int discarded$403 = -47;
              af.a();
              int discarded$404 = 121;
              cd.a();
              dj.b(true);
              int discarded$405 = 2;
              wc.a();
              ij.a(-85);
              wk.c(7751);
              qa.e(-30349);
              ob.a((byte) 121);
              int discarded$406 = -89;
              ln.a();
              int discarded$407 = 22771;
              hd.a();
              fa.c((byte) -74);
              int discarded$408 = 86;
              sn.a();
              nf.a(-120);
              int discarded$409 = 62;
              jm.e();
              int discarded$410 = 0;
              te.e();
              ii.e(9369);
              int discarded$411 = -68;
              tl.g();
              int discarded$412 = 127;
              kd.e();
              int discarded$413 = -112;
              re.g();
              int discarded$414 = 28180;
              i.b();
              int discarded$415 = -59;
              pk.c();
              int discarded$416 = 20908;
              tb.a();
              int discarded$417 = 127;
              ba.d();
              jc.a(true);
              ((client) this).field_m = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "client.J(" + param0 + 41);
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        int var3 = 0;
        ck var4_ref_ck = null;
        int var4 = 0;
        int var5_int = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int stackIn_27_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_144_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_149_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_147_0 = 0;
        boolean stackOut_147_1 = false;
        var9 = field_A ? 1 : 0;
        try {
          L0: {
            int discarded$11 = -86;
            var2_ref = ne.d();
            if (!ta.a((byte) -56)) {
              if (!sh.field_j) {
                cn.a(true, var2_ref);
                return;
              } else {
                if (!se.i(-1)) {
                  qi.a(100.0f, -81, bg.field_c);
                  cn.a(true, var2_ref);
                  return;
                } else {
                  L1: {
                    L2: {
                      qn.a(kd.field_t, qm.field_c, (byte) -109);
                      if (kf.field_G != null) {
                        break L2;
                      } else {
                        if (ea.d((byte) 111)) {
                          break L2;
                        } else {
                          L3: {
                            if (!fm.field_b) {
                              break L3;
                            } else {
                              if (jg.field_i) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_24_0 = 1;
                          stackIn_27_0 = stackOut_24_0;
                          break L1;
                        }
                      }
                    }
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    break L1;
                  }
                  L4: {
                    var3 = stackIn_27_0;
                    if (0 == rb.field_e) {
                      ca.field_kb = ak.field_d;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (ca.field_kb > 1) {
                      sg.field_b.a();
                      break L5;
                    } else {
                      jb.field_a = false;
                      break L5;
                    }
                  }
                  L6: while (true) {
                    L7: {
                      if (rb.field_e == 0) {
                        int discarded$12 = 84;
                        ai.e();
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (kf.field_I == null) {
                        break L8;
                      } else {
                        kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
                        break L8;
                      }
                    }
                    L9: {
                      if (null != ce.field_C) {
                        ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (1 < ca.field_kb) {
                        rb.field_e = rb.field_e + 1;
                        if (jb.field_a) {
                          break L10;
                        } else {
                          if (~ca.field_kb < ~rb.field_e) {
                            continue L6;
                          } else {
                            break L10;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 >= ca.field_kb) {
                        break L11;
                      } else {
                        L12: {
                          if (rb.field_e < ca.field_kb) {
                            break L12;
                          } else {
                            var4_ref_ck = pa.field_U;
                            pa.field_U = sg.field_b;
                            jb.field_a = true;
                            rb.field_e = 0;
                            sg.field_b = var4_ref_ck;
                            break L12;
                          }
                        }
                        le.field_m.a((byte) -113);
                        pa.field_U.e(0, 0);
                        break L11;
                      }
                    }
                    L13: {
                      if (null != kf.field_I) {
                        kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (ce.field_C != null) {
                        ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (am.field_c) {
                        break L15;
                      } else {
                        if (!uh.field_b) {
                          L16: {
                            kf.field_G.a(false);
                            var4 = 0;
                            if (null != pd.field_d) {
                              var4 = 1;
                              pd.field_d.c((byte) -75);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (h.field_d == null) {
                              break L17;
                            } else {
                              var4 = 1;
                              h.field_d.h((byte) 99);
                              break L17;
                            }
                          }
                          L18: {
                            if (null == cl.field_B) {
                              break L18;
                            } else {
                              cl.field_B.b((byte) -48);
                              var4 = 1;
                              break L18;
                            }
                          }
                          L19: {
                            if (null == am.field_a) {
                              break L19;
                            } else {
                              am.field_a.i(123);
                              var4 = 1;
                              break L19;
                            }
                          }
                          L20: {
                            if (null == ca.field_wb) {
                              break L20;
                            } else {
                              ca.field_wb.d((byte) 45);
                              var4 = 1;
                              break L20;
                            }
                          }
                          L21: {
                            if (f.field_s != null) {
                              f.field_s.c(2);
                              var4 = 1;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (!gi.field_b) {
                            break L15;
                          } else {
                            if (hh.field_a != ue.field_b) {
                              break L15;
                            } else {
                              if (var4 != 0) {
                                break L15;
                              } else {
                                int discarded$13 = 390;
                                pb.a();
                                break L15;
                              }
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L22: {
                      L23: {
                        if (!fm.field_b) {
                          break L23;
                        } else {
                          if (!jg.field_i) {
                            break L23;
                          } else {
                            stackOut_104_0 = 1;
                            stackIn_107_0 = stackOut_104_0;
                            break L22;
                          }
                        }
                      }
                      stackOut_106_0 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      break L22;
                    }
                    L24: {
                      L25: {
                        var4 = stackIn_107_0;
                        stackOut_107_0 = 88;
                        stackIn_116_0 = stackOut_107_0;
                        stackIn_108_0 = stackOut_107_0;
                        if (var4 != 0) {
                          break L25;
                        } else {
                          stackOut_108_0 = stackIn_108_0;
                          stackIn_116_0 = stackOut_108_0;
                          stackIn_109_0 = stackOut_108_0;
                          if (kf.field_G != null) {
                            break L25;
                          } else {
                            stackOut_109_0 = stackIn_109_0;
                            stackIn_111_0 = stackOut_109_0;
                            int discarded$14 = -128;
                            stackOut_111_0 = stackIn_111_0;
                            stackIn_116_0 = stackOut_111_0;
                            stackIn_112_0 = stackOut_111_0;
                            if (!cb.a()) {
                              break L25;
                            } else {
                              stackOut_112_0 = stackIn_112_0;
                              stackIn_114_0 = stackOut_112_0;
                              stackOut_114_0 = stackIn_114_0;
                              stackOut_114_1 = 1;
                              stackIn_117_0 = stackOut_114_0;
                              stackIn_117_1 = stackOut_114_1;
                              break L24;
                            }
                          }
                        }
                      }
                      stackOut_116_0 = stackIn_116_0;
                      stackOut_116_1 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      break L24;
                    }
                    L26: {
                      tf.a((byte) stackIn_117_0, stackIn_117_1 != 0);
                      if (var4 != 0) {
                        int discarded$15 = -128;
                        da.a(false, cb.a());
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (param0 == 320) {
                        break L27;
                      } else {
                        field_B = null;
                        break L27;
                      }
                    }
                    L28: {
                      L29: {
                        if (am.field_c) {
                          break L29;
                        } else {
                          if (!uh.field_b) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      if (kf.field_G != null) {
                        hk.d(0, 0, 640, 480);
                        kf.field_G.f(-26325);
                        if (f.field_s == null) {
                          break L28;
                        } else {
                          f.field_s.c(2);
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L30: {
                      if (cn.f((byte) 99)) {
                        int discarded$16 = 3;
                        int discarded$17 = 3;
                        hk.a(320 + -(wk.b() / 2) - 34, -(pj.d(20) / 2) + 216, wk.b() + 68, pj.d(126) - -48, 0, 200);
                        int discarded$18 = 3;
                        int discarded$19 = 3;
                        vk.a(pj.d(param0 + -356) - -60, (byte) 50, a.field_n, wk.b() + 80, 240 - pj.d(-5) / 2 + -30, 320 - wk.b() / 2 - 40);
                        uh.b(32659);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (ai.f((byte) 94)) {
                        hk.a(-34 + -(vd.a(480) / 2) + 320, -24 + (-(dj.a(110) / 2) + 240), 68 + vd.a(480), 48 + dj.a(110), 0, 200);
                        vk.a(dj.a(113) - -60, (byte) 50, a.field_n, 80 + vd.a(480), 210 + -(dj.a(108) / 2), 320 - (vd.a(param0 ^ 160) / 2 - -40));
                        int discarded$20 = 1;
                        cl.a();
                        break L31;
                      } else {
                        if (!pk.d(67)) {
                          break L31;
                        } else {
                          L32: {
                            stackOut_144_0 = 112;
                            stackIn_149_0 = stackOut_144_0;
                            stackIn_145_0 = stackOut_144_0;
                            if (cl.field_v != null) {
                              stackOut_149_0 = stackIn_149_0;
                              stackOut_149_1 = 1;
                              stackIn_150_0 = stackOut_149_0;
                              stackIn_150_1 = stackOut_149_1;
                              break L32;
                            } else {
                              stackOut_145_0 = stackIn_145_0;
                              stackIn_147_0 = stackOut_145_0;
                              stackOut_147_0 = stackIn_147_0;
                              stackOut_147_1 = qc.field_N;
                              stackIn_150_0 = stackOut_147_0;
                              stackIn_150_1 = stackOut_147_1 ? 1 : 0;
                              break L32;
                            }
                          }
                          t.a(stackIn_150_0, stackIn_150_1 != 0);
                          break L31;
                        }
                      }
                    }
                    L33: {
                      if (gb.field_Ob != gb.field_Vb) {
                        var5_int = 256 * rf.field_f / 16;
                        if (var5_int > 0) {
                          hk.a(0, 0, hk.field_j, hk.field_i, 0, var5_int);
                          break L33;
                        } else {
                          break L33;
                        }
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      if (2 <= te.field_p) {
                        var5 = Runtime.getRuntime().totalMemory() / 1024L;
                        var7 = -(Runtime.getRuntime().freeMemory() / 1024L) + var5;
                        se.field_S.a("FPS: " + jf.field_c, 12, 38, 16777215, 1);
                        se.field_S.a(var7 + "/" + var5 + " kB", 12, 52, 16777215, 1);
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    mf.a(1, 0, 0, var2_ref);
                    break L0;
                  }
                }
              }
            } else {
              int discarded$21 = -6351;
              jf.a(var2_ref, cd.a(param0 ^ 8512));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "client.F(" + param0 + 41);
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (8 <= var2_int) {
                this.i((byte) 51);
                var2_int = 0;
                if (param0 == 11978) {
                  L2: while (true) {
                    if (8 <= var2_int) {
                      break L0;
                    } else {
                      L3: {
                        if (pg.field_a[var2_int]) {
                          break L3;
                        } else {
                          if (wf.field_l[var2_int] != null) {
                            wf.field_l[var2_int].f(0);
                            if (wf.field_l[var2_int].a((byte) 78)) {
                              break L3;
                            } else {
                              wf.field_l[var2_int] = null;
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (ah.field_b[var2_int]) {
                          break L4;
                        } else {
                          if (null == ik.field_c[var2_int]) {
                            break L4;
                          } else {
                            ik.field_c[var2_int].g(en.field_o / 50);
                            ik.field_c[var2_int] = null;
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (sk.field_a[0][var2_int] == null) {
                          break L5;
                        } else {
                          var3 = kd.field_s[0][var2_int];
                          if (0 != var3) {
                            sk.field_a[0][var2_int].e(en.field_o / 50, pb.field_d * var3);
                            break L5;
                          } else {
                            sk.field_a[0][var2_int].g(en.field_o / 50);
                            sk.field_a[0][var2_int] = null;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (null != sk.field_a[1][var2_int]) {
                          var3 = kd.field_s[1][var2_int];
                          if (0 != var3) {
                            sk.field_a[1][var2_int].e(en.field_o / 50, var3 * pb.field_d);
                            break L6;
                          } else {
                            sk.field_a[1][var2_int].g(en.field_o / 50);
                            sk.field_a[1][var2_int] = null;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      var2_int++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                pg.field_a[var2_int] = false;
                ah.field_b[var2_int] = false;
                kd.field_s[0][var2_int] = 9 * kd.field_s[0][var2_int] / 10;
                kd.field_s[1][var2_int] = 9 * kd.field_s[1][var2_int] / 10;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "client.D(" + param0 + 41);
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((client) this).a(5, 94, 31, 0, 1, 12, 2, param0);
            en.a(22050, true, 10);
            km.field_z = en.a(lf.field_e, (java.awt.Component) (Object) jh.field_b, 0, 22050);
            cj.field_b = en.a(lf.field_e, (java.awt.Component) (Object) jh.field_b, 1, 1024);
            dg.field_c = new mi();
            cj.field_b.b((ol) (Object) dg.field_c);
            sh.field_a = new mi();
            km.field_z.b((ol) (Object) sh.field_a);
            ((client) this).a(false, true, true, false, true, true, false);
            mk.field_c[66] = 2;
            mk.field_c[74] = 1;
            mk.field_c[64] = -2;
            mk.field_c[68] = 1;
            mk.field_c[10] = -1;
            mk.field_c[70] = 1;
            mk.field_c[73] = 1;
            mk.field_c[58] = -2;
            mk.field_c[9] = -1;
            mk.field_c[62] = 2;
            mk.field_c[72] = 1;
            bc.field_D = hm.field_e;
            mk.field_c[71] = 1;
            mk.field_c[63] = -1;
            mk.field_c[59] = -2;
            mk.field_c[65] = 1;
            mk.field_c[75] = -1;
            mk.field_c[76] = 1;
            mk.field_c[69] = 1;
            ik.field_h = dj.field_T;
            uc.field_a = true;
            mg.field_Ob = fl.field_d;
            mk.field_c[61] = -2;
            mk.field_c[67] = -1;
            pa.field_U = new ck(640, 480);
            sg.field_b = new ck(640, 480);
            ak.field_d = 1;
            rb.field_e = 0;
            ca.field_kb = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "client.G(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5, byte param6) {
        int var7_int = 0;
        vj var8 = null;
        long var9 = 0L;
        Object var11 = null;
        ve var12 = null;
        int var13 = 0;
        int var14 = 0;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        w var18 = null;
        int var18_int = 0;
        w var19 = null;
        w var20 = null;
        w var21 = null;
        int var22_int = 0;
        w var22 = null;
        w var23 = null;
        w var24 = null;
        w var25 = null;
        w var26 = null;
        w var27 = null;
        w var28 = null;
        w var29 = null;
        w var30 = null;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        int var33_int = 0;
        int var34_int = 0;
        String var34 = null;
        ck var35 = null;
        String var35_ref = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        nm stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        nm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        nm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        ve stackIn_11_0 = null;
        w stackIn_11_1 = null;
        w stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        ve stackIn_12_0 = null;
        w stackIn_12_1 = null;
        w stackIn_12_2 = null;
        long stackIn_12_3 = 0L;
        ve stackIn_13_0 = null;
        w stackIn_13_1 = null;
        w stackIn_13_2 = null;
        long stackIn_13_3 = 0L;
        w stackIn_13_4 = null;
        ve stackIn_30_0 = null;
        w stackIn_30_1 = null;
        w stackIn_30_2 = null;
        long stackIn_30_3 = 0L;
        ve stackIn_31_0 = null;
        w stackIn_31_1 = null;
        w stackIn_31_2 = null;
        long stackIn_31_3 = 0L;
        ve stackIn_32_0 = null;
        w stackIn_32_1 = null;
        w stackIn_32_2 = null;
        long stackIn_32_3 = 0L;
        w stackIn_32_4 = null;
        int stackIn_36_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_89_0 = 0;
        ck[] stackIn_90_0 = null;
        ck[] stackIn_91_0 = null;
        ck[] stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        ck[] stackIn_98_0 = null;
        ck[] stackIn_99_0 = null;
        ck[] stackIn_100_0 = null;
        ck[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        String stackIn_152_0 = null;
        String stackIn_167_0 = null;
        String stackIn_177_0 = null;
        String stackIn_183_0 = null;
        nm stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        nm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        nm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        ve stackOut_10_0 = null;
        w stackOut_10_1 = null;
        w stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        ve stackOut_12_0 = null;
        w stackOut_12_1 = null;
        w stackOut_12_2 = null;
        long stackOut_12_3 = 0L;
        w stackOut_12_4 = null;
        ve stackOut_11_0 = null;
        w stackOut_11_1 = null;
        w stackOut_11_2 = null;
        long stackOut_11_3 = 0L;
        w stackOut_11_4 = null;
        ve stackOut_29_0 = null;
        w stackOut_29_1 = null;
        w stackOut_29_2 = null;
        long stackOut_29_3 = 0L;
        ve stackOut_31_0 = null;
        w stackOut_31_1 = null;
        w stackOut_31_2 = null;
        long stackOut_31_3 = 0L;
        w stackOut_31_4 = null;
        ve stackOut_30_0 = null;
        w stackOut_30_1 = null;
        w stackOut_30_2 = null;
        long stackOut_30_3 = 0L;
        w stackOut_30_4 = null;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        ck[] stackOut_89_0 = null;
        ck[] stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        ck[] stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        ck[] stackOut_97_0 = null;
        ck[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        ck[] stackOut_98_0 = null;
        ck[] stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        String stackOut_166_0 = null;
        String stackOut_165_0 = null;
        String stackOut_176_0 = null;
        String stackOut_175_0 = null;
        String stackOut_173_0 = null;
        String stackOut_182_0 = null;
        String stackOut_181_0 = null;
        Object stackOut_151_0 = null;
        String stackOut_150_0 = null;
        Object stackOut_148_0 = null;
        L0: {
          var41 = field_A ? 1 : 0;
          stackOut_0_0 = gf.field_c;
          stackOut_0_1 = 2 * (kf.field_O - -2);
          stackOut_0_2 = (kf.field_O * 4 + 8) * param0;
          stackOut_0_3 = -15230;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (ki.field_w != gf.field_c) {
            stackOut_2_0 = (nm) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (nm) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        L1: {
          var7_int = ((nm) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, 2, param2) ? 1 : 0;
          var8 = gf.field_c.field_Ob.field_M;
          if (param6 <= -48) {
            break L1;
          } else {
            client.j((byte) 82);
            break L1;
          }
        }
        var9 = ik.a(4);
        var11 = null;
        var12 = (ve) (Object) var8.c((byte) -101);
        L2: while (true) {
          if (null == var12) {
            return;
          } else {
            L3: {
              var13 = 0;
              if (null != var12.field_M) {
                break L3;
              } else {
                stackOut_9_0 = param3;
                stackOut_9_1 = param1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                L4: {
                  var14 = stackIn_10_0 | stackIn_10_1;
                  var12.field_Pb = new w(0L, fc.field_f);
                  var12.a(var12.field_Pb, -16834);
                  var12.field_Pb.field_X = 1;
                  var12.field_Bc = new w(0L, gg.field_G);
                  var12.a(var12.field_Bc, -16834);
                  var12.field_Dc = new w(0L, fc.field_f);
                  var12.a(var12.field_Dc, -16834);
                  var12.field_Dc.field_ub = 0;
                  var12.field_ec = new w(0L, fc.field_f);
                  var12.a(var12.field_ec, -16834);
                  var12.field_ec.field_ub = 0;
                  var12.field_jc = new w(0L, gg.field_G);
                  var12.a(var12.field_jc, -16834);
                  var12.field_jc.field_X = 2;
                  stackOut_10_0 = (ve) var12;
                  stackOut_10_1 = null;
                  stackOut_10_2 = null;
                  stackOut_10_3 = 0L;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  if (pd.field_a) {
                    stackOut_12_0 = (ve) (Object) stackIn_12_0;
                    stackOut_12_1 = null;
                    stackOut_12_2 = null;
                    stackOut_12_3 = stackIn_12_3;
                    stackOut_12_4 = fc.field_f;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    break L4;
                  } else {
                    stackOut_11_0 = (ve) (Object) stackIn_11_0;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = stackIn_11_3;
                    stackOut_11_4 = gg.field_G;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    break L4;
                  }
                }
                L5: {
                  stackIn_13_0.field_zc = new w(stackIn_13_3, stackIn_13_4);
                  var12.a(var12.field_zc, -16834);
                  var12.field_fc = new w[j.field_b];
                  var12.field_pc = new w(0L, (w) null);
                  if ((var14 & 1 << u.field_f) != 0) {
                    var12.field_zc.a(var12.field_pc, -16834);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var12.field_Ac = new w(0L, (w) null);
                  if ((var14 & 1 << u.field_b) != 0) {
                    var12.field_zc.a(var12.field_Ac, -16834);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var12.field_Tb = new w(0L, (w) null);
                  if ((1 << rf.field_a & var14) == 0) {
                    break L7;
                  } else {
                    var12.field_zc.a(var12.field_Tb, -16834);
                    break L7;
                  }
                }
                L8: {
                  var12.field_Fc = new w(0L, (w) null);
                  if ((1 << ul.field_f & var14) != 0) {
                    var12.field_zc.a(var12.field_Fc, -16834);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var15 = var12.field_pc;
                var16 = var12.field_Fc;
                var12.field_Tb.field_W = 1;
                var17 = var12.field_Ac;
                var17.field_W = 1;
                var16.field_W = 1;
                var15.field_W = 1;
                var18_int = 0;
                L9: while (true) {
                  if (~j.field_b >= ~var18_int) {
                    L10: {
                      stackOut_29_0 = (ve) var12;
                      stackOut_29_1 = null;
                      stackOut_29_2 = null;
                      stackOut_29_3 = 0L;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      stackIn_31_2 = stackOut_29_2;
                      stackIn_31_3 = stackOut_29_3;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      stackIn_30_2 = stackOut_29_2;
                      stackIn_30_3 = stackOut_29_3;
                      if (!pd.field_a) {
                        stackOut_31_0 = (ve) (Object) stackIn_31_0;
                        stackOut_31_1 = null;
                        stackOut_31_2 = null;
                        stackOut_31_3 = stackIn_31_3;
                        stackOut_31_4 = fc.field_f;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        stackIn_32_2 = stackOut_31_2;
                        stackIn_32_3 = stackOut_31_3;
                        stackIn_32_4 = stackOut_31_4;
                        break L10;
                      } else {
                        stackOut_30_0 = (ve) (Object) stackIn_30_0;
                        stackOut_30_1 = null;
                        stackOut_30_2 = null;
                        stackOut_30_3 = stackIn_30_3;
                        stackOut_30_4 = gg.field_G;
                        stackIn_32_0 = stackOut_30_0;
                        stackIn_32_1 = stackOut_30_1;
                        stackIn_32_2 = stackOut_30_2;
                        stackIn_32_3 = stackOut_30_3;
                        stackIn_32_4 = stackOut_30_4;
                        break L10;
                      }
                    }
                    stackIn_32_0.field_yc = new w(stackIn_32_3, stackIn_32_4);
                    var12.a(var12.field_yc, -16834);
                    var12.field_yc.field_X = 2;
                    var12.field_Sb = new w(0L, gg.field_G);
                    var12.a(var12.field_Sb, -16834);
                    var12.field_Ec = new w(0L, df.field_ab);
                    var12.a(var12.field_Ec, -16834);
                    var12.field_bc = new w(0L, df.field_ab);
                    var12.a(var12.field_bc, -16834);
                    var12.field_sc = new w(0L, ua.field_H);
                    var12.a(var12.field_sc, -16834);
                    var12.d(-69);
                    var12.field_Yb = new w(0L, lj.field_c);
                    var13 = 1;
                    var12.a(var12.field_Yb, -16834);
                    break L3;
                  } else {
                    L11: {
                      var12.field_fc[var18_int] = new w(0L, (w) null);
                      if ((1 << var18_int + um.field_a & var14) == 0) {
                        break L11;
                      } else {
                        var12.field_zc.a(var12.field_fc[var18_int], -16834);
                        break L11;
                      }
                    }
                    var12.field_fc[var18_int].field_W = 1;
                    var18_int++;
                    continue L9;
                  }
                }
              }
            }
            L12: {
              if (var12.field_lc) {
                stackOut_35_0 = param3;
                stackIn_36_0 = stackOut_35_0;
                break L12;
              } else {
                stackOut_34_0 = param1;
                stackIn_36_0 = stackOut_34_0;
                break L12;
              }
            }
            var14 = stackIn_36_0;
            var12.field_Pb.field_Y = null;
            var12.field_Pb.field_N = 0;
            var15 = var12.field_Pb;
            var15.field_mb = 0;
            var12.field_Yb.field_Y = null;
            var12.field_Yb.field_N = 0;
            var16 = var12.field_Yb;
            var16.field_mb = 0;
            var12.field_Bc.field_Y = null;
            var12.field_Bc.field_N = 0;
            var17 = var12.field_Bc;
            var17.field_mb = 0;
            var12.field_Dc.field_Y = null;
            var18 = var12.field_Dc;
            var12.field_Dc.field_N = 0;
            var18.field_mb = 0;
            var12.field_ec.field_Y = null;
            var19 = var12.field_ec;
            var12.field_ec.field_N = 0;
            var19.field_mb = 0;
            var12.field_jc.field_Y = null;
            var20 = var12.field_jc;
            var12.field_jc.field_N = 0;
            var12.field_zc.field_Y = null;
            var20.field_mb = 0;
            var12.field_zc.field_N = 0;
            var21 = var12.field_zc;
            var21.field_mb = 0;
            var22_int = 0;
            L13: while (true) {
              if (j.field_b <= var22_int) {
                L14: {
                  var12.field_pc.field_I = null;
                  var12.field_pc.field_N = 0;
                  var22 = var12.field_pc;
                  var22.field_mb = 0;
                  var12.field_Fc.field_I = null;
                  var23 = var12.field_Fc;
                  var12.field_Fc.field_N = 0;
                  var12.field_Ac.field_I = null;
                  var23.field_mb = 0;
                  var24 = var12.field_Ac;
                  var12.field_Ac.field_N = 0;
                  var24.field_mb = 0;
                  var12.field_Tb.field_I = null;
                  var12.field_Tb.field_N = 0;
                  var25 = var12.field_Tb;
                  var25.field_mb = 0;
                  var12.field_yc.field_Y = null;
                  var12.field_yc.field_N = 0;
                  var26 = var12.field_yc;
                  var26.field_mb = 0;
                  var12.field_Sb.field_Y = null;
                  var12.field_Sb.field_N = 0;
                  var27 = var12.field_Sb;
                  var12.field_Ec.field_Y = null;
                  var27.field_mb = 0;
                  var12.field_Ec.field_N = 0;
                  var28 = var12.field_Ec;
                  var28.field_mb = 0;
                  var12.field_bc.field_Y = null;
                  var12.field_bc.field_N = 0;
                  var29 = var12.field_bc;
                  var12.field_sc.field_Y = null;
                  var29.field_mb = 0;
                  var12.field_sc.field_N = 0;
                  var30 = var12.field_sc;
                  var30.field_mb = 0;
                  var12.field_mb = gf.field_c.field_Ob.field_mb;
                  var31 = 0;
                  var32 = var12.field_Vb;
                  if (var12.i((byte) 126)) {
                    break L14;
                  } else {
                    L15: {
                      if (!var12.field_lc) {
                        L16: {
                          if (var12.field_gc) {
                            break L16;
                          } else {
                            if (!var12.field_Zb) {
                              if (!var12.field_Cc) {
                                var12.field_Pb.field_Y = pc.field_d;
                                break L15;
                              } else {
                                var12.field_Pb.field_Y = cd.field_l;
                                break L15;
                              }
                            } else {
                              break L16;
                            }
                          }
                        }
                        var12.field_Yb.field_Y = gb.field_ac;
                        break L15;
                      } else {
                        if (var12.field_Nb < 0) {
                          L17: {
                            if (!var12.field_wc) {
                              break L17;
                            } else {
                              L18: {
                                if (var12.field_gc) {
                                  break L18;
                                } else {
                                  if (var12.field_Zb) {
                                    break L18;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              var12.field_Yb.field_Y = gb.field_ac;
                              break L15;
                            }
                          }
                          if (var12.field_qc != 2) {
                            var12.field_Pb.field_Y = ak.field_i;
                            break L15;
                          } else {
                            var12.field_Yb.field_Y = gd.field_h;
                            break L15;
                          }
                        } else {
                          var12.field_Pb.field_Y = uf.field_t;
                          break L15;
                        }
                      }
                    }
                    L19: {
                      if (null != var12.field_Yb.field_Y) {
                        var12.field_Yb.a(68, 0, var31, kf.field_O, 0);
                        break L19;
                      } else {
                        var12.field_Pb.a(68, 0, var31, kf.field_O, 0);
                        break L19;
                      }
                    }
                    L20: {
                      var12.field_Bc.field_Y = mm.a(var12.field_Bc.field_J, var32, 78);
                      var12.field_Bc.a(78, 0, var31, kf.field_O, 70);
                      if (!var12.field_Bc.field_jb) {
                        break L20;
                      } else {
                        if (!var12.field_Bc.field_Y.equals((Object) (Object) var32)) {
                          sl.field_g = var32;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      var12.field_Dc.field_Y = Integer.toString(var12.field_rc);
                      if (!var12.field_wc) {
                        var12.field_Dc.field_X = 1;
                        var12.field_Dc.a(48, 0, var31, kf.field_O, 150);
                        break L21;
                      } else {
                        var12.field_Dc.field_X = 2;
                        var12.field_ec.field_Y = "/" + var12.field_mc;
                        var33_int = (-var12.field_ec.field_J.a("/") + 348) / 2;
                        var12.field_Dc.a(var33_int - 150, 0, var31, kf.field_O, 150);
                        var12.field_ec.a(198 - var33_int, 0, var31, kf.field_O, var33_int);
                        break L21;
                      }
                    }
                    L22: {
                      var12.field_jc.field_Y = Integer.toString(var12.field_Ub);
                      var12.field_jc.a(48, 0, var31, kf.field_O, 200);
                      if (!pd.field_a) {
                        stackOut_78_0 = 200;
                        stackIn_79_0 = stackOut_78_0;
                        break L22;
                      } else {
                        stackOut_77_0 = 250;
                        stackIn_79_0 = stackOut_77_0;
                        break L22;
                      }
                    }
                    L23: {
                      var33_int = stackIn_79_0;
                      var12.field_zc.a(-2 + (-var33_int + 365), 0, var31, kf.field_O, var33_int);
                      var34_int = j.field_c;
                      if (0 != (var14 & 1 << u.field_f)) {
                        var35 = fj.field_a[var12.field_Wb];
                        var12.field_pc.field_I = var35;
                        var12.field_pc.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (var35.field_K - -j.field_c);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (0 != (var14 & 1 << u.field_b)) {
                        L25: {
                          L26: {
                            if (var12.field_gc) {
                              break L26;
                            } else {
                              if (!var12.field_Zb) {
                                stackOut_88_0 = 0;
                                stackIn_89_0 = stackOut_88_0;
                                break L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                          stackOut_87_0 = 1;
                          stackIn_89_0 = stackOut_87_0;
                          break L25;
                        }
                        L27: {
                          var36 = stackIn_89_0;
                          stackOut_89_0 = (ck[]) field_x;
                          stackIn_91_0 = stackOut_89_0;
                          stackIn_90_0 = stackOut_89_0;
                          if (var36 == 0) {
                            stackOut_91_0 = (ck[]) (Object) stackIn_91_0;
                            stackOut_91_1 = 0;
                            stackIn_92_0 = stackOut_91_0;
                            stackIn_92_1 = stackOut_91_1;
                            break L27;
                          } else {
                            stackOut_90_0 = (ck[]) (Object) stackIn_90_0;
                            stackOut_90_1 = 1;
                            stackIn_92_0 = stackOut_90_0;
                            stackIn_92_1 = stackOut_90_1;
                            break L27;
                          }
                        }
                        var35 = stackIn_92_0[stackIn_92_1];
                        var12.field_Ac.field_I = var35;
                        var12.field_Ac.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (var35.field_K - -j.field_c);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L28: {
                      if ((1 << rf.field_a & var14) != 0) {
                        var35 = bb.field_b[-1 + var12.field_qc];
                        var12.field_Tb.field_I = var35;
                        var12.field_Tb.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (j.field_c + var35.field_K);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if ((1 << ul.field_f & var14) == 0) {
                        break L29;
                      } else {
                        L30: {
                          stackOut_97_0 = si.field_d;
                          stackIn_100_0 = stackOut_97_0;
                          stackIn_98_0 = stackOut_97_0;
                          if (!var12.field_Ic) {
                            stackOut_100_0 = (ck[]) (Object) stackIn_100_0;
                            stackOut_100_1 = 0;
                            stackIn_101_0 = stackOut_100_0;
                            stackIn_101_1 = stackOut_100_1;
                            break L30;
                          } else {
                            stackOut_98_0 = (ck[]) (Object) stackIn_98_0;
                            stackIn_99_0 = stackOut_98_0;
                            stackOut_99_0 = (ck[]) (Object) stackIn_99_0;
                            stackOut_99_1 = 1;
                            stackIn_101_0 = stackOut_99_0;
                            stackIn_101_1 = stackOut_99_1;
                            break L30;
                          }
                        }
                        var35 = stackIn_101_0[stackIn_101_1];
                        var12.field_Fc.field_I = var35;
                        var12.field_Fc.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (j.field_c + var35.field_K);
                        break L29;
                      }
                    }
                    L31: {
                      if (null != be.field_u) {
                        var36 = 0;
                        L32: while (true) {
                          if (j.field_b <= var36) {
                            break L31;
                          } else {
                            L33: {
                              if (be.field_u[var36] == null) {
                                break L33;
                              } else {
                                if ((var14 & 1 << um.field_a - -var36) == 0) {
                                  break L33;
                                } else {
                                  var35 = be.field_u[var36][var12.field_kc[var36] & 255];
                                  var12.field_fc[var36].field_I = var35;
                                  var12.field_fc[var36].a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                                  var34_int = var34_int + (var35.field_K + j.field_c);
                                  break L33;
                                }
                              }
                            }
                            var36++;
                            continue L32;
                          }
                        }
                      } else {
                        break L31;
                      }
                    }
                    L34: {
                      var36 = (-var34_int + var12.field_zc.field_mb) / 2;
                      if (var36 > 0) {
                        var12.field_pc.field_vb = var12.field_pc.field_vb + var36;
                        var12.field_Ac.field_vb = var12.field_Ac.field_vb + var36;
                        var12.field_Tb.field_vb = var12.field_Tb.field_vb + var36;
                        var12.field_Fc.field_vb = var12.field_Fc.field_vb + var36;
                        var37_int = 0;
                        L35: while (true) {
                          if (~j.field_b >= ~var37_int) {
                            break L34;
                          } else {
                            var12.field_fc[var37_int].field_vb = var12.field_fc[var37_int].field_vb + var36;
                            var37_int++;
                            continue L35;
                          }
                        }
                      } else {
                        break L34;
                      }
                    }
                    L36: {
                      if (!var12.field_lc) {
                        break L36;
                      } else {
                        L37: {
                          var37_int = var12.field_Nb;
                          if (var37_int < 0) {
                            var37_int = (int)(var9 + -var12.field_tc);
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        var38_int = var37_int / 1000;
                        var39 = var38_int / 60;
                        var38_int = var38_int % 60;
                        if (var39 < 60) {
                          var12.field_yc.field_Y = var39 + ":" + var38_int / 10 + var38_int % 10;
                          break L36;
                        } else {
                          var40 = var39 / 60;
                          var39 = var39 % 60;
                          var12.field_yc.field_Y = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                          break L36;
                        }
                      }
                    }
                    L38: {
                      var12.field_yc.a(var12.field_mb + -365, 0, var31, kf.field_O, 365);
                      var31 = var31 + kf.field_O;
                      if (null == var12.field_xc) {
                        break L38;
                      } else {
                        var31 += 2;
                        var37 = new StringBuilder(64);
                        StringBuilder discarded$5 = var37.append(jg.field_c);
                        StringBuilder discarded$6 = var37.append(var12.field_xc[0]);
                        var38_int = 1;
                        L39: while (true) {
                          if (var38_int >= var12.field_rc) {
                            var38 = var37.toString();
                            var12.field_Sb.field_Y = var38;
                            var39 = var12.field_Sb.field_J.a(var38, var12.field_mb + -(2 * var12.field_Sb.field_ub));
                            var12.field_Sb.a(var12.field_mb, 0, var31, var39 * kf.field_O, 0);
                            var31 = var31 + kf.field_O * var39;
                            break L38;
                          } else {
                            StringBuilder discarded$7 = var37.append(", ");
                            StringBuilder discarded$8 = var37.append(var12.field_xc[var38_int]);
                            var38_int++;
                            continue L39;
                          }
                        }
                      }
                    }
                    L40: {
                      if (var12.field_Zb) {
                        var12.field_Ec.field_Y = cm.a((byte) 121, li.field_g, new String[1]);
                        var12.field_Ec.a(-(2 * nk.field_b) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                        var31 = var31 + kf.field_O;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    if (var12.field_Ob) {
                      var12.field_bc.field_Y = cm.a((byte) 106, qe.field_b, new String[1]);
                      var12.field_bc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                      var31 = var31 + kf.field_O;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                L41: {
                  int discarded$9 = 1;
                  var33 = vk.a(var32, var12.field_oc);
                  if (var33 != null) {
                    var34_int = var12.field_sc.field_J.a(var33, -nk.field_b + (var12.field_mb - nk.field_b));
                    var12.field_sc.field_wb = var12.field_Rb * 256 / oa.field_a;
                    var12.field_sc.field_Y = var33;
                    var12.field_sc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, var34_int * kf.field_O, nk.field_b);
                    var31 = var31 + kf.field_O * var34_int;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  if (var7_int != 0) {
                    break L42;
                  } else {
                    var12.field_F = var31 - var12.field_N;
                    break L42;
                  }
                }
                L43: {
                  if (var13 != 0) {
                    gf.field_c.field_Ob.a((w) var11, (w) (Object) var12, 2, 0);
                    break L43;
                  } else {
                    break L43;
                  }
                }
                var34_int = 0;
                L44: while (true) {
                  if (~var34_int <= ~j.field_b) {
                    L45: {
                      if (var12.field_pc.field_jb) {
                        L46: {
                          if (var12.field_Wb != 1) {
                            var34 = ed.field_b[var12.field_Wb];
                            break L46;
                          } else {
                            var34 = bh.field_j;
                            break L46;
                          }
                        }
                        sl.field_g = hl.field_c + " - " + var34;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L47: {
                      if (!var12.field_Fc.field_jb) {
                        break L47;
                      } else {
                        L48: {
                          if (var12.field_Ic) {
                            stackOut_166_0 = cl.field_s;
                            stackIn_167_0 = stackOut_166_0;
                            break L48;
                          } else {
                            stackOut_165_0 = si.field_k;
                            stackIn_167_0 = stackOut_165_0;
                            break L48;
                          }
                        }
                        sl.field_g = stackIn_167_0;
                        break L47;
                      }
                    }
                    L49: {
                      if (!var12.field_Ac.field_jb) {
                        break L49;
                      } else {
                        L50: {
                          L51: {
                            if (var12.field_gc) {
                              break L51;
                            } else {
                              if (!var12.field_Zb) {
                                if (!var12.field_wc) {
                                  stackOut_176_0 = ec.field_b;
                                  stackIn_177_0 = stackOut_176_0;
                                  break L50;
                                } else {
                                  stackOut_175_0 = bh.field_c;
                                  stackIn_177_0 = stackOut_175_0;
                                  break L50;
                                }
                              } else {
                                break L51;
                              }
                            }
                          }
                          stackOut_173_0 = wa.field_f;
                          stackIn_177_0 = stackOut_173_0;
                          break L50;
                        }
                        sl.field_g = stackIn_177_0;
                        break L49;
                      }
                    }
                    L52: {
                      if (var12.field_Tb.field_jb) {
                        L53: {
                          if (var12.field_qc != 2) {
                            stackOut_182_0 = bc.field_F;
                            stackIn_183_0 = stackOut_182_0;
                            break L53;
                          } else {
                            stackOut_181_0 = tl.field_r;
                            stackIn_183_0 = stackOut_181_0;
                            break L53;
                          }
                        }
                        sl.field_g = stackIn_183_0;
                        break L52;
                      } else {
                        break L52;
                      }
                    }
                    L54: {
                      if (var12.field_ob == 0) {
                        break L54;
                      } else {
                        if (!var12.i((byte) 100)) {
                          if (var12.field_Yb.field_ob == 0) {
                            hd.a(0, param4, var12, var32);
                            break L54;
                          } else {
                            L55: {
                              if (!var12.field_lc) {
                                break L55;
                              } else {
                                L56: {
                                  if (!var12.field_wc) {
                                    break L56;
                                  } else {
                                    if (var12.field_gc) {
                                      break L55;
                                    } else {
                                      if (!var12.field_Zb) {
                                        break L56;
                                      } else {
                                        break L55;
                                      }
                                    }
                                  }
                                }
                                ga.a(false, var12.e(-87), param5);
                                break L54;
                              }
                            }
                            cg.a(var12.e(-36), (byte) -9, param5);
                            break L54;
                          }
                        } else {
                          break L54;
                        }
                      }
                    }
                    var12 = (ve) (Object) var8.d(true);
                    continue L2;
                  } else {
                    L57: {
                      if (!var12.field_fc[var34_int].field_jb) {
                        break L57;
                      } else {
                        L58: {
                          if (hb.field_Qb != null) {
                            if (null == hb.field_Qb[var34_int]) {
                              stackOut_151_0 = null;
                              stackIn_152_0 = (String) (Object) stackOut_151_0;
                              break L58;
                            } else {
                              stackOut_150_0 = hb.field_Qb[var34_int][var12.field_kc[var34_int] & 255];
                              stackIn_152_0 = stackOut_150_0;
                              break L58;
                            }
                          } else {
                            stackOut_148_0 = null;
                            stackIn_152_0 = (String) (Object) stackOut_148_0;
                            break L58;
                          }
                        }
                        var35_ref = stackIn_152_0;
                        if (var35_ref == null) {
                          sl.field_g = pa.field_db[var34_int];
                          break L57;
                        } else {
                          sl.field_g = pa.field_db[var34_int] + " - " + var35_ref;
                          break L57;
                        }
                      }
                    }
                    var34_int++;
                    continue L44;
                  }
                }
              } else {
                var12.field_fc[var22_int].field_I = null;
                var23 = var12.field_fc[var22_int];
                var12.field_fc[var22_int].field_N = 0;
                var23.field_mb = 0;
                var22_int++;
                continue L13;
              }
            }
          }
        }
    }

    private final boolean n() {
        je var2 = null;
        pi[] var2_array = null;
        byte[] var3 = null;
        pi[] var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        ck var6 = null;
        pi var7 = null;
        ck[] var7_array = null;
        byte[] var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10_int = 0;
        ck[] var10 = null;
        ck var10_ref = null;
        int var11_int = 0;
        ck[][] var11 = null;
        int var12_int = 0;
        ck var12 = null;
        ck[][] var12_array = null;
        pi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = field_A ? 1 : 0;
        if (null != jj.field_c) {
          fh.b((byte) -123);
          qi.a(65.0f, 98, rf.field_p);
          ((client) this).d(320);
          ka.field_N = new pl(jj.field_c, ah.field_d);
          pg.field_d = ka.field_N.a("", "fruit_step", 0);
          field_F = ka.field_N.a("", "cooked_fruit_step", 0);
          ib.field_ob = ka.field_N.a("", "db_loose_shape_rotate", 0);
          bj.field_e = ka.field_N.a("", "db_loose_shape_land_squish", 0);
          fh.field_c = ka.field_N.a("", "db_group_shape_land", 0);
          hm.field_d = ka.field_N.a("", "fruit_move", 0);
          wd.field_c = ka.field_N.a("", "db_loose_tiles_pop", 0);
          sa.field_w = ka.field_N.a("", "db_solid_tiles_pop2", 0);
          jm.field_v[0] = ka.field_N.a("", "db_combo_1", 0);
          jm.field_v[1] = ka.field_N.a("", "db_combo_2", 0);
          jm.field_v[2] = ka.field_N.a("", "db_combo_3", qm.b(0, 0));
          jm.field_v[3] = ka.field_N.a("", "db_combo_4", qm.b(0, 0));
          bf.field_w = ka.field_N.a("", "db_simultaneous_bonus2", 0);
          ob.field_n = ka.field_N.a((byte) 101, "", "db_loose_drill");
          fj.field_k = ka.field_N.a((byte) 101, "", "db_bucket_water_capsule2");
          pk.field_q = ka.field_N.a("", "db_quake", 0);
          ee.field_g = ka.field_N.a("", "db_special_item_explode", 0);
          var2 = new je(22050, 11025);
          pk.field_q = pk.field_q.a(var2);
          ee.field_g = ee.field_g.a(var2);
          w.field_Eb = ka.field_N.a("", "db_poison", 0);
          qa.field_s = ka.field_N.a("", "db_glass_lower", 0);
          ha.field_Pb[2] = ka.field_N.a("", "db_bucket_glass_crack2_2", 0);
          ha.field_Pb[1] = ka.field_N.a("", "db_bucket_glass_crack3", 0);
          ha.field_Pb[0] = ka.field_N.a((byte) 101, "", "db_bucket_glass_explode");
          ie.field_e = ka.field_N.a("", "db_bucket_explode", 0);
          jg.field_j = ka.field_N.a("", "db_bucket_debris", 0);
          bf.field_u = ka.field_N.a("", "db_loose_shape_fall_looped", 0);
          rc.field_i = ka.field_N.a("", "db_loose_shape_fall_quake_looped", 0);
          ak.field_b = ka.field_N.a("", "db_suck_into_machine", 0);
          kf.field_P = ka.field_N.a("", "microwave_motor_2", 0);
          ul.field_i = ka.field_N.a("", "db_shape_out_of_machine2", 0);
          ig.field_ac = ka.field_N.a("", "db_last_shape_out", 0);
          jj.field_c = null;
          ah.field_d = null;
          vj.a(true);
          return false;
        } else {
          if (wg.field_h != null) {
            qi.a(75.0f, -96, v.field_b);
            ((client) this).d(320);
            jg.field_a = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Titlescreen");
            sb.field_u[0][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_NORMAL");
            sb.field_u[0][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_PANIC");
            sb.field_u[0][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_REALLY_PANIC");
            sb.field_u[0][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_FINISH_THEM");
            sb.field_u[1][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_NORMAL");
            sb.field_u[1][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_PANIC");
            sb.field_u[1][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_REALLY_PANIC");
            sb.field_u[1][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_FINISH_THEM");
            sb.field_u[2][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_NORMAL");
            sb.field_u[2][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_PANIC");
            sb.field_u[2][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_REALLY_PANIC");
            sb.field_u[2][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_FINISH_THEM");
            sb.field_u[6][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_NORMAL");
            sb.field_u[6][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_PANIC");
            sb.field_u[6][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_REALLY_PANIC");
            sb.field_u[6][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_FINISH_THEM");
            sb.field_u[7][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_NORMAL");
            sb.field_u[7][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_PANIC");
            sb.field_u[7][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_REALLY_PANIC");
            sb.field_u[7][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_FINISH_THEM");
            sb.field_u[4][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_NORMAL");
            sb.field_u[4][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_PANIC");
            sb.field_u[4][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_REALLY_PANIC");
            sb.field_u[4][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_FINISH_THEM");
            sb.field_u[3][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_NORMAL");
            sb.field_u[3][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_PANIC");
            sb.field_u[3][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_REALLY_PANIC");
            sb.field_u[3][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_FINISH_THEM");
            sb.field_u[5][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_NORMAL");
            sb.field_u[5][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_PANIC");
            sb.field_u[5][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_REALLY_PANIC");
            sb.field_u[5][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_FINISH_THEM");
            ee.field_a[0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_NORMAL");
            ee.field_a[1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_PANIC");
            ee.field_a[2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_REALLY_PANIC");
            ee.field_a[3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_FINISH_THEM");
            hb.field_Ub = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Game Win");
            rm.field_b = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Game Lose");
            wg.field_h = null;
            vj.a(true);
            return false;
          } else {
            if (null != ph.field_Db) {
              qi.a(90.0f, 96, vd.field_o);
              ((client) this).d(320);
              se.field_S = cd.a("", qc.field_vb, ah.field_i, (byte) 108, "arial13");
              var2_array = t.a("", ah.field_i, false, "arialbold14");
              var3 = qc.field_vb.a(0, "", "arialbold14");
              w.field_kb = gg.a(var2_array, 55, var3);
              int discarded$26 = 1;
              km.field_A = ge.a((byte) -49, 16777215, 1, var2_array, var3);
              var4 = t.a("tinybloko", ii.field_t, false, "");
              var5 = ph.field_Db.a(0, "tinybloko", "");
              in.field_n = gg.a(var4, 111, var5);
              var6_int = 0;
              L0: while (true) {
                if (~var4.length >= ~var6_int) {
                  var6_int = 0;
                  L1: while (true) {
                    if (~var6_int <= ~var5.length) {
                      a.field_t = gg.a(var4, 103, var5);
                      int discarded$27 = 1;
                      eh.field_j = ge.a((byte) 100, 16694016, 2, var4, var5);
                      eh.field_j.field_X[1] = new int[3];
                      var6_int = 0;
                      L2: while (true) {
                        if (~var6_int <= ~var4.length) {
                          var6_int = 0;
                          L3: while (true) {
                            if (~var5.length >= ~var6_int) {
                              hn.field_g = gg.a(var4, 121, var5);
                              a.field_n = db.a("ui_frame_vbrick", "ui_frame_hbrick", ii.field_t, true, "ui_frame_corner");
                              on.field_e = ek.a("ui_button_up", "", -95, ii.field_t);
                              im.field_i = ek.a("ui_button_highlight", "", -114, ii.field_t);
                              ce.field_s = bj.a(112, ii.field_t, "", "chat_toggle_button");
                              gd.field_g = bj.a(112, ii.field_t, "", "chat_toggle_button_highlight");
                              vg.field_h = id.a(ah.field_i, "unachieved", "basic", 8192);
                              wg.field_c = id.a(ah.field_i, "locked", "basic", 8192);
                              db.field_f = new ck(32, 32);
                              db.field_f.a();
                              vg.field_h.a(0, 0, 32, 32);
                              gf.field_a = new ck(32, 32);
                              gf.field_a.a();
                              wg.field_c.a(0, 0, 32, 32);
                              le.field_m.a((byte) -84);
                              var6 = id.a(ah.field_i, "orbcoin", "basic", 8192);
                              rn.field_c = new ck(20, 20);
                              rn.field_c.a();
                              var6.a(0, 0, 20, 20);
                              le.field_m.a((byte) -106);
                              var6 = null;
                              gf.field_f = t.a("solid_mask", ii.field_t, false, "");
                              oa.field_b = bj.a(112, ii.field_t, "", "pop");
                              qf.field_h = si.a(25972, false, bj.a(112, ii.field_t, "", "explode"), false);
                              qm.field_c = me.a(id.a(ii.field_t, "wildcard", "", 8192), false, (byte) -28, false);
                              kd.field_t = qm.field_c.c();
                              var7_array = bj.a(112, ii.field_t, "", "specialitems");
                              var8_int = 0;
                              L4: while (true) {
                                if (var8_int >= 6) {
                                  var8_int = 0;
                                  L5: while (true) {
                                    if (var8_int >= 8) {
                                      le.field_m.a((byte) -114);
                                      var8_int = 0;
                                      L6: while (true) {
                                        if (8 <= var8_int) {
                                          var8 = eg.field_e.a(0, "", "menu2.jpg");
                                          tc.field_Tb = new ck(var8, (java.awt.Component) (Object) jh.field_b);
                                          var9 = eg.field_e.a(0, "", "achievements.jpg");
                                          int discarded$28 = -10241;
                                          uf.field_y = fc.a(31, new ck(var9, (java.awt.Component) (Object) jh.field_b));
                                          var10 = bj.a(112, ii.field_t, "", "achievements");
                                          var11_int = 0;
                                          L7: while (true) {
                                            if (var11_int >= 31) {
                                              var10 = null;
                                              tl.field_w = new ck[31];
                                              var11_int = 0;
                                              L8: while (true) {
                                                if (var11_int >= 31) {
                                                  le.field_m.a((byte) -108);
                                                  pg.field_e = id.a(ii.field_t, "ui_clouds", "", 8192);
                                                  dk.field_h = id.a(ii.field_t, "ui_border_tl", "", 8192);
                                                  jh.field_d = id.a(ii.field_t, "ui_border_t", "", 8192);
                                                  sk.field_g = id.a(ii.field_t, "ui_border_tr", "", 8192);
                                                  fl.field_f = id.a(ii.field_t, "ui_border_l", "", 8192);
                                                  wm.field_n = id.a(ii.field_t, "ui_border_r", "", 8192);
                                                  vg.field_x = id.a(ii.field_t, "ui_border_bl", "", 8192);
                                                  pg.field_f = id.a(ii.field_t, "ui_border_b", "", 8192);
                                                  wc.field_r = id.a(ii.field_t, "ui_border_br", "", 8192);
                                                  wk.field_l = id.a(ii.field_t, "ui_menu_title", "", 8192);
                                                  ve.field_dc = id.a(ii.field_t, "ui_lobby_logo", "", 8192);
                                                  ij.field_d = mg.a(16776192, 16743168, ul.field_b, in.field_n, 6, 0, (byte) 107);
                                                  wh.field_f = mg.a(16776192, 16743168, ak.field_e, in.field_n, 6, 0, (byte) 120);
                                                  field_C[0] = mg.a(16776192, 16743168, mf.field_P, in.field_n, 6, 0, (byte) 120);
                                                  field_C[1] = mg.a(16776192, 16743168, qf.field_k, in.field_n, 6, 0, (byte) 114);
                                                  field_C[2] = mg.a(16776192, 16743168, ad.field_z, in.field_n, 6, 0, (byte) 104);
                                                  ng.field_b = mg.a(16776192, 16743168, de.field_P, in.field_n, 6, 0, (byte) 102);
                                                  l.field_j = mg.a(16776192, 16743168, im.field_g, in.field_n, 6, 0, (byte) 99);
                                                  ad.field_g = mg.a(16776192, 16743168, u.field_g, in.field_n, 6, 0, (byte) 88);
                                                  ve.field_uc[0] = bj.a(112, ii.field_t, "", "fruit_buckettop");
                                                  uj.field_d[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_lefttex"), true);
                                                  bb.field_a[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_leftsidetex"), true);
                                                  cc.field_f[0] = t.a("fruit_leftmask", ii.field_t, false, "");
                                                  rb.field_d[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_righttex"), true);
                                                  dg.field_d[0] = si.a(qm.b(0, 25972), true, bj.a(112, ii.field_t, "", "fruit_rightsidetex"), true);
                                                  sc.field_j[0] = t.a("fruit_rightmask", ii.field_t, false, "");
                                                  ad.field_j[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_bottomtex"), true);
                                                  fk.field_G[0] = t.a("fruit_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[1] = bj.a(112, ii.field_t, "", "animals_buckettop");
                                                  ck[] dupTemp$29 = si.a(25972, false, bj.a(112, ii.field_t, "", "animals_sidespr"), true);
                                                  rb.field_j[1] = dupTemp$29;
                                                  hf.field_e[1] = dupTemp$29;
                                                  bh.field_d[1] = si.a(25972, true, bj.a(112, ii.field_t, "", "animals_bottomspecial"), false);
                                                  fk.field_G[1] = t.a("animals_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[2] = bj.a(112, ii.field_t, "", "breakfast_buckettop");
                                                  uj.field_d[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_lefttex"), true);
                                                  bb.field_a[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_leftsidetex"), true);
                                                  cc.field_f[2] = t.a("breakfast_leftmask", ii.field_t, false, "");
                                                  rb.field_d[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_righttex"), true);
                                                  dg.field_d[2] = si.a(qm.b(0, 25972), true, bj.a(112, ii.field_t, "", "breakfast_rightsidetex"), true);
                                                  sc.field_j[2] = t.a("breakfast_rightmask", ii.field_t, false, "");
                                                  ad.field_j[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_bottomtex"), true);
                                                  fk.field_G[2] = t.a("breakfast_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[3] = bj.a(112, ii.field_t, "", "bugs_buckettop");
                                                  ck[] dupTemp$30 = si.a(25972, false, bj.a(112, ii.field_t, "", "bugs_sidespr"), true);
                                                  rb.field_j[3] = dupTemp$30;
                                                  hf.field_e[3] = dupTemp$30;
                                                  bh.field_d[3] = si.a(qm.b(0, 25972), true, bj.a(112, ii.field_t, "", "bugs_bottomspecial"), false);
                                                  fk.field_G[3] = t.a("bugs_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[4] = bj.a(qm.b(0, 112), ii.field_t, "", "flowers_buckettop");
                                                  uj.field_d[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_lefttex"), true);
                                                  bb.field_a[4] = si.a(25972, true, bj.a(qm.b(0, 112), ii.field_t, "", "flowers_leftsidetex"), true);
                                                  cc.field_f[4] = t.a("flowers_leftmask", ii.field_t, false, "");
                                                  rb.field_d[4] = si.a(qm.b(0, 25972), true, bj.a(112, ii.field_t, "", "flowers_righttex"), true);
                                                  dg.field_d[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_rightsidetex"), true);
                                                  sc.field_j[4] = t.a("flowers_rightmask", ii.field_t, false, "");
                                                  ad.field_j[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_bottomtex"), true);
                                                  fk.field_G[4] = t.a("flowers_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[5] = bj.a(112, ii.field_t, "", "undersea_buckettop");
                                                  ck[] dupTemp$31 = si.a(25972, false, bj.a(112, ii.field_t, "", "undersea_sidespr"), true);
                                                  rb.field_j[5] = dupTemp$31;
                                                  hf.field_e[5] = dupTemp$31;
                                                  bh.field_d[5] = si.a(qm.b(0, 25972), true, bj.a(112, ii.field_t, "", "undersea_bottomspecial"), false);
                                                  fk.field_G[5] = t.a("undersea_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[6] = bj.a(112, ii.field_t, "", "city_buckettop");
                                                  uj.field_d[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_lefttex"), true);
                                                  bb.field_a[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_leftsidetex"), true);
                                                  cc.field_f[6] = t.a("city_leftmask", ii.field_t, false, "");
                                                  rb.field_d[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_righttex"), true);
                                                  dg.field_d[6] = si.a(25972, true, bj.a(qm.b(0, 112), ii.field_t, "", "city_rightsidetex"), true);
                                                  sc.field_j[6] = t.a("city_rightmask", ii.field_t, false, "");
                                                  ad.field_j[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_bottomtex"), true);
                                                  fk.field_G[6] = t.a("city_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[7] = bj.a(112, ii.field_t, "", "eightbit_buckettop");
                                                  uj.field_d[7] = si.a(25972, true, bj.a(112, ii.field_t, "", "eightbit_lefttex"), true);
                                                  bb.field_a[7] = si.a(25972, true, bj.a(112, ii.field_t, "", "eightbit_leftsidetex"), true);
                                                  cc.field_f[7] = t.a("eightbit_leftmask", ii.field_t, false, "");
                                                  rb.field_d[7] = si.a(25972, true, bj.a(112, ii.field_t, "", "eightbit_righttex"), true);
                                                  dg.field_d[7] = si.a(qm.b(0, 25972), true, bj.a(qm.b(0, 112), ii.field_t, "", "eightbit_rightsidetex"), true);
                                                  sc.field_j[7] = t.a("eightbit_rightmask", ii.field_t, false, "");
                                                  ad.field_j[7] = si.a(qm.b(0, 25972), true, bj.a(112, ii.field_t, "", "eightbit_bottomtex"), true);
                                                  fk.field_G[7] = t.a("eightbit_bottommask", ii.field_t, false, "");
                                                  var11_int = 0;
                                                  L9: while (true) {
                                                    if (var11_int >= 8) {
                                                      uf.field_w = id.a(ii.field_t, "machine_buttons1", "", 8192);
                                                      bn.field_e = id.a(ii.field_t, "machine_front", "", 8192);
                                                      cd.field_k = id.a(ii.field_t, "machine_glass", "", 8192);
                                                      e.field_b = id.a(ii.field_t, "machine_glasslit", "", 8192);
                                                      ca.field_qb = id.a(ii.field_t, "machine_lights1", "", 8192);
                                                      ln.field_c = id.a(ii.field_t, "machine_mouth", "", 8192);
                                                      aa.field_e = id.a(ii.field_t, "machine_next", "", 8192);
                                                      jc.field_f = id.a(ii.field_t, "machine_nextlit", "", 8192);
                                                      bb.field_c = id.a(ii.field_t, "machine_pipe", "", 8192);
                                                      u.field_h = id.a(ii.field_t, "machine_portal", "", 8192);
                                                      bc.field_J = id.a(ii.field_t, "blobmatch_scorecols", "", 8192).field_D;
                                                      a.field_u = id.a(ii.field_t, "eliminatetile_scorecols", "", 8192).field_D;
                                                      jg.field_f = id.a(ii.field_t, "simultaneous_scorecols", "", 8192).field_D;
                                                      nf.field_f = id.a(ii.field_t, "chain_scorecols", "", 8192).field_D;
                                                      oh.field_c = id.a(ii.field_t, "bomb_scorecols", "", 8192).field_D;
                                                      vl.field_G = id.a(ii.field_t, "bombardmessagecols", "", 8192).field_D;
                                                      ph.field_yb = bj.a(112, ii.field_t, "", "instructions_keys");
                                                      ma.field_K = id.a(ii.field_t, "instructions_arrow", "", 8192);
                                                      aj.field_c = id.a(ii.field_t, "instructions_inmultiplayer", "", 8192);
                                                      li.field_i = id.a(ii.field_t, "instructions_insingleplayer", "", 8192);
                                                      var11 = new ck[5][];
                                                      var12_array = new ck[5][];
                                                      ck[] dupTemp$32 = bj.a(112, ii.field_t, "", "bucketsize_icons");
                                                      var12_array[0] = dupTemp$32;
                                                      var11[0] = dupTemp$32;
                                                      ck[] dupTemp$33 = bj.a(112, ii.field_t, "", "speed_icons");
                                                      var12_array[1] = dupTemp$33;
                                                      var11[1] = dupTemp$33;
                                                      ck[] dupTemp$34 = bj.a(112, ii.field_t, "", "shapefeedback_icons");
                                                      var12_array[4] = dupTemp$34;
                                                      var11[4] = dupTemp$34;
                                                      lf.field_h = dupTemp$34;
                                                      ck[] dupTemp$35 = bj.a(112, ii.field_t, "", "colours_icons");
                                                      var12_array[2] = dupTemp$35;
                                                      var11[2] = dupTemp$35;
                                                      ck[] dupTemp$36 = bj.a(112, ii.field_t, "", "specialitems_icons");
                                                      var12_array[3] = dupTemp$36;
                                                      var11[3] = dupTemp$36;
                                                      bg.a(vl.field_A, nd.field_a, si.field_f, pf.field_d, 8, qd.field_Pb, ah.field_i, 5, 25150, qc.field_vb, var11, var12_array, true, vb.field_S, tg.field_d);
                                                      gm.a(-3504, 200);
                                                      qf.a(ah.field_i, qc.field_vb, -96);
                                                      rf.a(ac.field_z, 0, 180, -94, 16694016, (java.applet.Applet) this);
                                                      qc.field_vb = null;
                                                      ph.field_Db = null;
                                                      vj.a(true);
                                                      return false;
                                                    } else {
                                                      int discarded$37 = 19264;
                                                      on.a(uj.field_d[var11_int]);
                                                      int discarded$38 = 19264;
                                                      on.a(rb.field_d[var11_int]);
                                                      int discarded$39 = 19264;
                                                      on.a(ad.field_j[var11_int]);
                                                      uh.a(cc.field_f[var11_int], (byte) 115);
                                                      uh.a(sc.field_j[var11_int], (byte) -118);
                                                      uh.a(fk.field_G[var11_int], (byte) 114);
                                                      var12_int = 0;
                                                      L10: while (true) {
                                                        if (~var12_int <= ~ve.field_uc[var11_int].length) {
                                                          var11_int++;
                                                          continue L9;
                                                        } else {
                                                          ve.field_uc[var11_int][var12_int].b();
                                                          var12_int++;
                                                          continue L10;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  tl.field_w[var11_int] = new ck(32, 32);
                                                  tl.field_w[var11_int].a();
                                                  uf.field_y[var11_int].a(0, 0, 32, 32);
                                                  var11_int++;
                                                  continue L8;
                                                }
                                              }
                                            } else {
                                              var10[var11_int].b();
                                              mg.a(0, var10[var11_int], uf.field_y[var11_int]);
                                              var10[var11_int] = null;
                                              var11_int++;
                                              continue L7;
                                            }
                                          }
                                        } else {
                                          var9 = eg.field_e.a(0, "", ri.field_f[var8_int] + ".jpg");
                                          dn.field_p[var8_int] = new ck(var9, (java.awt.Component) (Object) jh.field_b);
                                          var8_int++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      var7_array = bj.a(112, ii.field_t, "", ri.field_f[var8_int] + "_tiles");
                                      var9_int = 0;
                                      L11: while (true) {
                                        if (7 <= var9_int) {
                                          fb.field_c[var8_int][7] = kd.field_t;
                                          var9_int = 0;
                                          L12: while (true) {
                                            if (var9_int >= 7) {
                                              s.field_Qb[var8_int] = id.a(ii.field_t, ri.field_f[var8_int] + "_bucketback", "", 8192);
                                              s.field_Qb[var8_int].b();
                                              var8_int++;
                                              continue L5;
                                            } else {
                                              var10_ref = me.a(var7_array[var9_int + 7], true, (byte) -124, true);
                                              var11_int = 0;
                                              L13: while (true) {
                                                if (var11_int >= 16) {
                                                  var9_int++;
                                                  continue L12;
                                                } else {
                                                  var12 = var10_ref.c();
                                                  var12.a();
                                                  fb.field_c[var8_int][var9_int].b(6, 6, 24, 24);
                                                  var10_ref.c(0, 0, 128);
                                                  var13 = gf.field_f[var11_int];
                                                  var14 = 0;
                                                  L14: while (true) {
                                                    if (1296 <= var14) {
                                                      ob.field_j[var8_int][var9_int][var11_int] = var12;
                                                      var11_int++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        var15 = var13.field_l[var13.field_k[var14] & 255] & 255;
                                                        var16 = var12.field_D[var14];
                                                        if (var15 <= 128) {
                                                          var16 = ((var16 & 16711935) * var15 >> 7 & 16711935) + (((65280 & var16) * var15 & 8355876) >> 7);
                                                          break L15;
                                                        } else {
                                                          var17 = 131586 * (var15 - 128);
                                                          var18 = var16;
                                                          var19 = var18 + var17;
                                                          var17 = (16711935 & var18) + (16711935 & var17);
                                                          var18 = (-var17 + var19 & 65536) + (16777472 & var17);
                                                          var16 = var19 - var18 | var18 + -(var18 >>> 8);
                                                          break L15;
                                                        }
                                                      }
                                                      L16: {
                                                        if (var16 == 0) {
                                                          var16 = 1;
                                                          break L16;
                                                        } else {
                                                          break L16;
                                                        }
                                                      }
                                                      var12.field_D[var14] = var16;
                                                      var14++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          fb.field_c[var8_int][var9_int] = me.a(var7_array[var9_int], false, (byte) -63, false);
                                          var9_int++;
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var9_int = 0;
                                  L17: while (true) {
                                    if (4 <= var9_int) {
                                      var8_int++;
                                      continue L4;
                                    } else {
                                      ik.field_b[var8_int][var9_int] = me.a(var7_array[var8_int * 4 - -var9_int], false, (byte) -55, false);
                                      var9_int++;
                                      continue L17;
                                    }
                                  }
                                }
                              }
                            } else {
                              var5[var6_int] = (byte)(var5[var6_int] * 3 / 2);
                              var6_int++;
                              continue L3;
                            }
                          }
                        } else {
                          var7 = var4[var6_int];
                          var8 = new byte[var7.field_b * var7.field_i * 9 / 4];
                          var9_int = 0;
                          L18: while (true) {
                            if (~var7.field_i >= ~var9_int) {
                              var7.field_d = 3 * var7.field_d / 2;
                              var7.field_i = var7.field_i * 3 / 2;
                              var7.field_k = var8;
                              var7.field_c = var7.field_c * 3 / 2;
                              var7.field_g = var7.field_g * 3 / 2;
                              var7.field_b = var7.field_b * 3 / 2;
                              var7.field_a = var7.field_a * 3 / 2;
                              var6_int++;
                              continue L2;
                            } else {
                              var10_int = 0;
                              L19: while (true) {
                                if (var10_int >= var7.field_b) {
                                  var9_int += 2;
                                  continue L18;
                                } else {
                                  var11_int = var7.field_k[var10_int + var7.field_b * var9_int];
                                  var12_int = var7.field_b * (var9_int * 9) / 4 + 3 * var10_int / 2;
                                  var8[var12_int] = (byte) var11_int;
                                  var8[1 + var12_int] = (byte) var11_int;
                                  var8[2 + var12_int] = (byte) var11_int;
                                  var8[var12_int - -(3 * var7.field_b / 2)] = (byte) var11_int;
                                  var8[1 + var12_int + var7.field_b * 3 / 2] = (byte) var11_int;
                                  var8[2 + (var12_int - -(3 * var7.field_b / 2))] = (byte) var11_int;
                                  var8[var12_int + 3 * var7.field_b] = (byte) var11_int;
                                  var8[var12_int - -(3 * var7.field_b) - -1] = (byte) var11_int;
                                  var8[var12_int + (3 * var7.field_b + 2)] = (byte) var11_int;
                                  var10_int += 2;
                                  continue L19;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var5[var6_int] = (byte)(var5[var6_int] * 2);
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  var7 = var4[var6_int];
                  var8 = new byte[4 * (var7.field_i * var7.field_b)];
                  var9_int = 0;
                  L20: while (true) {
                    if (var9_int >= var7.field_i) {
                      var7.field_d = var7.field_d * 2;
                      var7.field_g = var7.field_g * 2;
                      var7.field_a = var7.field_a * 2;
                      var7.field_b = var7.field_b * 2;
                      var7.field_i = var7.field_i * 2;
                      var7.field_k = var8;
                      var7.field_c = var7.field_c * 2;
                      var6_int++;
                      continue L0;
                    } else {
                      var10_int = 0;
                      L21: while (true) {
                        if (var7.field_b <= var10_int) {
                          var9_int++;
                          continue L20;
                        } else {
                          var11_int = var7.field_k[var7.field_b * var9_int + var10_int];
                          var12_int = 2 * var10_int + 4 * var7.field_b * var9_int;
                          var8[var12_int] = (byte) var11_int;
                          var8[1 + var12_int] = (byte) var11_int;
                          var8[var12_int + 2 * var7.field_b] = (byte) var11_int;
                          var8[var7.field_b * 2 + var12_int - -1] = (byte) var11_int;
                          var10_int++;
                          continue L21;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              if (cl.field_y != null) {
                ge.a((byte) -93, new jk(cl.field_y.a(0, "huffman", "")));
                cl.field_y = null;
                vj.a(true);
                return false;
              } else {
                int discarded$40 = 5;
                int discarded$41 = 0;
                int discarded$42 = 16;
                int discarded$43 = 32;
                bj.a(320, on.field_e, (mm) (Object) eh.field_j, true, (mm) (Object) km.field_A, 20, 0, 4, 1, 20, 20, 20, a.field_n, 14, 480, 240, im.field_i);
                int discarded$44 = 20;
                int discarded$45 = 16;
                int discarded$46 = 0;
                int discarded$47 = 10406;
                int discarded$48 = 14;
                int discarded$49 = 1;
                ie.a(on.field_e, (mm) (Object) km.field_A, a.field_n, 320, 20, 0, 32, 20, 240, 4, 5, 20, (mm) (Object) eh.field_j, im.field_i);
                kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                int discarded$50 = -27096;
                int discarded$51 = 50;
                bd.a();
                le.a((byte) 86, 50);
                af.a(4, 50);
                nn.a(256, jg.field_a, true);
                vj.a(true);
                return true;
              }
            }
          }
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 79) {
                break L1;
              } else {
                jc discarded$2 = client.a((String) null, -100);
                break L1;
              }
            }
            L2: {
              if (null == param1) {
                break L2;
              } else {
                if (param1.length() < mc.field_f) {
                  break L2;
                } else {
                  if (param1.length() <= dn.field_r) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            return stackIn_11_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("client.P(").append(param0).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    public final void init() {
        try {
            ((client) this).a(-2990, 32, "dekobloko");
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "client.init()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new byte[65536];
        an.a(field_D, 0, 65536, (byte) -128);
        field_E = "Theme <%0> strategy";
        field_y = "Show all private chat";
        field_C = new ck[3];
        field_B = "Use this alternative as your account name";
    }
}
