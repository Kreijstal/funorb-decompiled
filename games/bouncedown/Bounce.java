/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Bounce extends kk {
    static tg field_G;
    private int field_I;
    private boolean field_E;
    private int field_J;
    private boolean field_L;
    private int field_K;
    static String[] field_A;
    private int field_M;
    static int field_F;
    private int field_H;
    public static int field_N;

    private final void k(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (sd.field_pb == null) {
                break L1;
              } else {
                ij.a(sd.field_pb, (byte) -123);
                sd.field_pb = null;
                vc.e((byte) -44);
                break L1;
              }
            }
            L2: {
              pa.field_c = fa.a((byte) -76, 1);
              ai.field_e = fa.a((byte) -76, 2);
              if (param0 == -16) {
                break L2;
              } else {
                this.e(-122);
                break L2;
              }
            }
            pk.field_D = fa.a((byte) -76, 5);
            ca.field_e = fa.a((byte) -76, 3);
            ub.field_a = fa.a((byte) -76, 4);
            va.field_c = fa.a((byte) -76, 6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "Bounce.MA(" + param0 + ')');
        }
    }

    private final boolean a(String param0, boolean param1, int param2, boolean param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_20_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            L1: {
              var8_int = od.field_f.b(param0);
              param2 = param2 - var8_int / 2;
              if (param2 + -8 >= uc.field_C) {
                break L1;
              } else {
                if (param2 - -16 - -var8_int < uc.field_C) {
                  break L1;
                } else {
                  if ((ll.field_y ^ -1) >= (-od.field_f.field_s + (param4 - 8) ^ -1)) {
                    break L1;
                  } else {
                    if ((param4 - -16 ^ -1) > (ll.field_y ^ -1)) {
                      break L1;
                    } else {
                      if (!param1) {
                        break L1;
                      } else {
                        param6 = 16777215;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L2: {
              if (param3) {
                param6 = 16777215;
                break L2;
              } else {
                break L2;
              }
            }
            if (param5 == 93) {
              L3: {
                od.field_f.b(param0, param2, param4, param6, -1);
                if ((param6 ^ -1) != -16777216) {
                  break L3;
                } else {
                  if ((this.field_K ^ -1) == -1) {
                    break L3;
                  } else {
                    if (!param1) {
                      break L3;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              L4: {
                if (16777215 != param6) {
                  break L4;
                } else {
                  if (!ng.field_a[84]) {
                    break L4;
                  } else {
                    if (param3) {
                      stackOut_39_0 = 1;
                      stackIn_40_0 = stackOut_39_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              stackOut_41_0 = 0;
              stackIn_42_0 = stackOut_41_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var8);
            stackOut_43_1 = new StringBuilder().append("Bounce.QA(");
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L5;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_40_0 != 0;
            } else {
              return stackIn_42_0 != 0;
            }
          }
        }
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_N;
        try {
          L0: {
            L1: {
              Bounce.k((byte) -99);
              kc.a(17345);
              nf.a(-60);
              ab.b((byte) -104);
              hi.a(false);
              ua.a(-24750);
              jl.a(87);
              kk.g((byte) 115);
              ga.a((byte) 72);
              fj.e((byte) 118);
              ha.a(false);
              kf.a((byte) 53);
              na.c();
              gk.b(false);
              ob.a(640);
              wi.c((byte) -127);
              of.a(true);
              dk.a(true);
              je.a(-23556);
              mc.a((byte) 47);
              pd.a((byte) -119);
              nc.a(119);
              b.a(76);
              bl.a(37);
              va.c(2);
              ej.a(-64);
              bb.a((byte) 25);
              pg.a(false);
              sg.a((byte) -112);
              ef.b(-10);
              gi.b(72);
              jb.a(false);
              pb.a(-19);
              pk.d(-112);
              v.b(-8217);
              vi.a((byte) 74);
              jf.e(-18695);
              pc.c(-14582);
              dg.a((byte) 64);
              ud.a(100);
              qf.b(-107);
              i.a(118);
              e.h();
              mj.c(4);
              ai.a((byte) 110);
              ii.l(0);
              og.a((byte) 106);
              f.a(-7355);
              uk.c(113);
              kl.a(0);
              oe.g();
              ka.d(0);
              nl.b((byte) 94);
              hf.a((byte) 124);
              c.a((byte) 56);
              l.a(3);
              pf.j(-1);
              sd.b(false);
              db.n(260);
              ec.n(101);
              sh.o(5);
              gh.b(true);
              k.e((byte) -81);
              ci.a(false);
              q.f((byte) -117);
              ve.d((byte) 85);
              fk.a((byte) 118);
              g.a(6623);
              qj.a(-112);
              u.a(0);
              gg.a();
              te.c();
              fg.a();
              wa.a(-13268);
              ub.a((byte) -104);
              mi.b((byte) -122);
              fd.a(false);
              oh.a((byte) -59);
              oc.a(false);
              tj.a();
              ug.b((byte) 115);
              li.a(111);
              nk.a(-74);
              bk.a(-23);
              ag.a(-1);
              hd.b(233);
              le.a((byte) 90);
              gd.a(255);
              ng.b(2);
              ma.d(65);
              qb.a((byte) -30);
              tb.e((byte) 68);
              ml.c(-1);
              lf.a(false);
              vh.b(11826);
              md.d(-94);
              ce.c((byte) -49);
              ok.c(114);
              wb.a((byte) 65);
              cf.a(1);
              nh.j((byte) -102);
              il.a((byte) 126);
              qk.b();
              ig.b(1);
              a.a(249);
              jk.a(-19800);
              if (param0 < -98) {
                break L1;
              } else {
                this.field_H = 17;
                break L1;
              }
            }
            wj.a(0);
            ij.a(true);
            ca.a((byte) -86);
            ge.a(-120);
            pe.a(0);
            ih.d((byte) -58);
            hc.a(true);
            th.a((byte) -83);
            fi.a(-14935);
            da.a(-87);
            ad.a();
            uj.a((byte) 105);
            hh.a(false);
            jj.a(true);
            dl.b((byte) 94);
            vb.a(119);
            qi.b(0);
            sj.a((byte) 42);
            vg.a(8);
            ed.a(19599);
            lk.b((byte) 122);
            ak.h(127);
            wk.g((byte) 38);
            ri.a(-11673);
            lc.i(36368);
            ea.b(17695);
            vk.a(3);
            re.a(false);
            ne.c((byte) 100);
            od.a(0);
            vd.b(1567641170);
            ae.a((byte) -119);
            fl.a(8192);
            ta.a(0);
            oa.a(22085);
            tk.b(8191);
            ib.a(true);
            lb.a((byte) -83);
            kj.a(false);
            rj.d(0);
            ch.a(false);
            pa.b(37);
            hb.e((byte) 123);
            ba.d((byte) 94);
            mh.m(-16167);
            ll.e((byte) -83);
            nd.a(true);
            vc.f((byte) -6);
            la.d((byte) -59);
            ff.a(-22756);
            al.c(24562);
            nb.a(120);
            eb.b(true);
            fh.a(false);
            d.f((byte) -112);
            cd.a();
            kb.a(-9192);
            mb.c(60);
            de.b(11041);
            aj.a(false);
            bj.k(-119);
            se.a(true);
            eh.a((byte) 106);
            m.a(-1);
            wh.a((byte) -53);
            eg.d(54);
            t.f(-32504);
            ra.b((byte) 120);
            ja.a(false);
            dh.b(8832);
            di.a(true);
            sa.a(true);
            he.b((byte) -53);
            w.b(62771140);
            qa.a(19108);
            jh.c(-1);
            r.a((byte) 51);
            tc.a(false);
            wg.b(13922);
            pj.a(-4);
            jg.j(-32572);
            fb.d(4);
            qg.b((byte) 57);
            ld.a(false);
            ke.a(-196);
            mf.a((byte) -114);
            rg.a((byte) -75);
            qh.b((byte) -101);
            uf.a(32578);
            j.b((byte) -87);
            uc.e((byte) 28);
            ph.a(0);
            ji.c((byte) 11);
            qe.c((byte) -86);
            lg.a(-65);
            bi.a(false);
            gf.a(false);
            id.b((byte) -72);
            jc.a(true);
            kg.a((byte) -64);
            bh.b((byte) 120);
            mg.e(0);
            bf.d(0);
            nj.d(22382);
            cl.a(false);
            hg.d(-1);
            bd.h((byte) -110);
            qc.b(-96);
            ui.a(true);
            vf.a(0);
            ck.f((byte) -126);
            lj.a(0);
            this.field_r = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "Bounce.HA(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        int fieldTemp$2 = 0;
        ai discarded$3 = null;
        RuntimeException var2 = null;
        ie var2_ref = null;
        int var2_int = 0;
        Object var2_ref2 = null;
        int var3_int = 0;
        double var3 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        Throwable var9 = null;
        int var10 = 0;
        int stackIn_225_0 = 0;
        int stackIn_233_0 = 0;
        pk stackIn_237_0 = null;
        pk stackIn_239_0 = null;
        pk stackIn_241_0 = null;
        pk stackIn_242_0 = null;
        be stackIn_242_1 = null;
        int stackIn_463_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        Throwable decompiledCaughtException = null;
        int stackOut_461_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_230_0 = 0;
        pk stackOut_236_0 = null;
        pk stackOut_241_0 = null;
        be stackOut_241_1 = null;
        pk stackOut_237_0 = null;
        pk stackOut_239_0 = null;
        be stackOut_239_1 = null;
        var10 = field_N;
        try {
          L0: {
            L1: {
              L2: {
                if ((this.field_J ^ -1) != (uc.field_C ^ -1)) {
                  break L2;
                } else {
                  if (ll.field_y != this.field_M) {
                    break L2;
                  } else {
                    if (0 != vh.field_e) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              this.field_J = uc.field_C;
              qf.field_b = -1;
              this.field_M = ll.field_y;
              this.field_L = true;
              break L1;
            }
            L3: {
              if (-1 == (vh.field_e ^ -1)) {
                this.field_K = 0;
                break L3;
              } else {
                this.field_K = 1;
                break L3;
              }
            }
            L4: {
              if (!ng.field_a[98]) {
                break L4;
              } else {
                this.field_L = false;
                qf.field_b = 0;
                break L4;
              }
            }
            L5: {
              if (!ng.field_a[99]) {
                break L5;
              } else {
                this.field_L = false;
                qf.field_b = 1;
                break L5;
              }
            }
            jd.field_e = jd.field_e - 1;
            if (param0 < -120) {
              L6: {
                if (ng.field_a[84]) {
                  this.field_L = false;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                ec.field_cb = ec.field_cb + vd.field_a;
                if (hi.field_c < 2) {
                  break L7;
                } else {
                  L8: {
                    if (!ng.field_a[32]) {
                      break L8;
                    } else {
                      if (-6001 >= (fa.field_c ^ -1)) {
                        break L8;
                      } else {
                        he.field_n[0].field_j = 300.0;
                        he.field_n[0].field_q = 0.0;
                        fa.field_c = fa.field_c + 10;
                        ta.field_c = ta.field_c + 0.01;
                        break L8;
                      }
                    }
                  }
                  if (!ng.field_a[33]) {
                    break L7;
                  } else {
                    if (-1 > (fa.field_c ^ -1)) {
                      he.field_n[0].field_q = 0.0;
                      fa.field_c = fa.field_c - 10;
                      he.field_n[0].field_j = 300.0;
                      ta.field_c = ta.field_c - 0.01;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L9: {
                if (vh.field_e == 0) {
                  break L9;
                } else {
                  l.field_c = l.field_c - jd.field_e;
                  vd.field_a = vd.field_a + 1;
                  break L9;
                }
              }
              L10: {
                if (!fb.field_nb) {
                  break L10;
                } else {
                  L11: {
                    if (!vc.d((byte) -18)) {
                      break L11;
                    } else {
                      mg.d(30432);
                      break L11;
                    }
                  }
                  fb.field_nb = false;
                  break L10;
                }
              }
              L12: {
                if (ci.field_F.a((byte) -75) == null) {
                  break L12;
                } else {
                  fieldTemp$2 = this.field_H + 1;
                  this.field_H = this.field_H + 1;
                  if (-336 != (fieldTemp$2 ^ -1)) {
                    break L12;
                  } else {
                    this.field_H = 0;
                    discarded$3 = ci.field_F.c((byte) -52);
                    break L12;
                  }
                }
              }
              L13: {
                ae.field_f = ae.field_f + 1;
                if (-257 < (ae.field_f ^ -1)) {
                  break L13;
                } else {
                  ae.field_f = ae.field_f - 256;
                  break L13;
                }
              }
              L14: {
                ff.field_C = ff.field_C + 0.1;
                if (256.0 > ff.field_C) {
                  break L14;
                } else {
                  ff.field_C = ff.field_C - 256.0;
                  break L14;
                }
              }
              L15: {
                eg.field_n = -16 + (int)(16.0 * Math.sin(ff.field_C));
                i.field_a = i.field_a + 1;
                qa.field_h = qa.field_h + 1;
                if (i.field_a < 256) {
                  break L15;
                } else {
                  i.field_a = i.field_a - 256;
                  break L15;
                }
              }
              L16: {
                if (256 < qa.field_h) {
                  qa.field_h = 0;
                  ne.field_w = ne.field_w + 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (1 != vk.field_b) {
                  break L17;
                } else {
                  ta.field_c = ta.field_c + 0.001;
                  if ((he.field_n[0].field_n ^ -1) >= -1) {
                    break L17;
                  } else {
                    L18: {
                      L19: {
                        if (null == ka.field_o) {
                          break L19;
                        } else {
                          if (0 < fa.field_c) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      qf.field_c = qf.field_c + 1;
                      fa.field_c = fa.field_c + 1;
                      if (3.0 > 5.0 * Math.random()) {
                        ec.field_cb = ec.field_cb + 1;
                        break L18;
                      } else {
                        l.field_c = l.field_c - (vd.field_a + -1);
                        jd.field_e = jd.field_e + 1;
                        break L18;
                      }
                    }
                    if (ka.field_o != null) {
                      break L17;
                    } else {
                      L20: {
                        if (-1001 != (fa.field_c ^ -1)) {
                          break L20;
                        } else {
                          dk.a(false, 0, 255);
                          break L20;
                        }
                      }
                      L21: {
                        if (fa.field_c == 2500) {
                          dk.a(false, 1, 254);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if ((fa.field_c ^ -1) == -4001) {
                          dk.a(false, 2, 253);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      L23: {
                        if (5000 != fa.field_c) {
                          break L23;
                        } else {
                          if (!vh.a(0, (byte) 88)) {
                            break L23;
                          } else {
                            dk.a(false, 9, 246);
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (he.field_n[0].field_o >= 95.0) {
                          break L24;
                        } else {
                          if (kg.field_f >= 1000) {
                            break L24;
                          } else {
                            kg.field_f = kg.field_f + 1;
                            vg.field_j = vg.field_j + 1;
                            break L24;
                          }
                        }
                      }
                      L25: {
                        if (he.field_n[0].field_o <= 97.0) {
                          break L25;
                        } else {
                          if (1000 <= hg.field_l) {
                            break L25;
                          } else {
                            hg.field_l = hg.field_l + 1;
                            nb.field_a = nb.field_a + 1;
                            break L25;
                          }
                        }
                      }
                      L26: {
                        if (he.field_n[0].field_d <= 0.0) {
                          break L26;
                        } else {
                          if (-1001 >= (qe.field_f ^ -1)) {
                            break L26;
                          } else {
                            qe.field_f = qe.field_f + 1;
                            ve.field_a = ve.field_a + 1;
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (-1001 != (kg.field_f ^ -1)) {
                          break L27;
                        } else {
                          kg.field_f = 1001;
                          dk.a(false, 6, 249);
                          break L27;
                        }
                      }
                      L28: {
                        if ((hg.field_l ^ -1) != -1001) {
                          break L28;
                        } else {
                          hg.field_l = 1001;
                          dk.a(false, 5, 250);
                          break L28;
                        }
                      }
                      L29: {
                        if ((qe.field_f ^ -1) != -1001) {
                          break L29;
                        } else {
                          qe.field_f = 1001;
                          dk.a(false, 7, 248);
                          break L29;
                        }
                      }
                      if ((kg.field_f ^ -1) != -1002) {
                        break L17;
                      } else {
                        if (-1002 != (hg.field_l ^ -1)) {
                          break L17;
                        } else {
                          if ((qe.field_f ^ -1) != -1002) {
                            break L17;
                          } else {
                            kg.field_f = 1002;
                            dk.a(false, 8, 247);
                            break L17;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L30: {
                if (!u.field_g) {
                  break L30;
                } else {
                  this.field_E = false;
                  break L30;
                }
              }
              L31: {
                if (!this.field_E) {
                  this.field_I = this.field_I * 9 / 10;
                  if (0 < this.field_I) {
                    this.field_I = this.field_I - 1;
                    break L31;
                  } else {
                    break L31;
                  }
                } else {
                  this.field_I = (9 * this.field_I - -100) / 10;
                  if ((this.field_I ^ -1) <= -101) {
                    break L31;
                  } else {
                    this.field_I = this.field_I + 1;
                    break L31;
                  }
                }
              }
              L32: {
                if (null == ka.field_o) {
                  break L32;
                } else {
                  if (rj.field_j != -1) {
                    break L32;
                  } else {
                    ka.field_o = ka.field_o.a((byte) -77);
                    break L32;
                  }
                }
              }
              L33: {
                if (0 == (rj.field_j ^ -1)) {
                  break L33;
                } else {
                  if ((rj.field_j ^ -1) == -1) {
                    L34: {
                      var2_ref = gk.field_e;
                      var3_int = var2_ref.field_s + 200;
                      var4 = 4 + var2_ref.field_x + var2_ref.field_F;
                      var5 = gk.field_e.b(qe.field_c);
                      var6 = 320 + -(var5 / 2);
                      var7 = 3 * var4 + var3_int;
                      if ((var6 + -8 ^ -1) <= (uc.field_C ^ -1)) {
                        break L34;
                      } else {
                        if ((uc.field_C ^ -1) < (var6 - (-16 - var5) ^ -1)) {
                          break L34;
                        } else {
                          if ((var7 - 8 + -gk.field_e.field_s ^ -1) <= (ll.field_y ^ -1)) {
                            break L34;
                          } else {
                            if (ll.field_y > 16 + var7) {
                              break L34;
                            } else {
                              if (!this.field_L) {
                                break L34;
                              } else {
                                if (1 != vh.field_e) {
                                  break L34;
                                } else {
                                  tk.d(-6144);
                                  rj.field_j = 2;
                                  break L34;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var5 = gk.field_e.b(db.field_T);
                    var6 = -(var5 / 2) + 320;
                    var7 = var4 / 2 + 4 * var4 + var3_int - -32;
                    if ((var6 + -8 ^ -1) <= (uc.field_C ^ -1)) {
                      break L33;
                    } else {
                      if (var5 + var6 + 16 < uc.field_C) {
                        break L33;
                      } else {
                        if ((-8 + var7 + -gk.field_e.field_s ^ -1) <= (ll.field_y ^ -1)) {
                          break L33;
                        } else {
                          if (ll.field_y > var7 + 16) {
                            break L33;
                          } else {
                            if (this.field_L) {
                              if ((vh.field_e ^ -1) == -2) {
                                L35: {
                                  ka.field_o.field_l = false;
                                  if (!this.field_L) {
                                    ka.field_o.field_n = 0;
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                rj.field_j = -1;
                                kb.field_a = 0;
                                ka.field_o.field_e = false;
                                break L33;
                              } else {
                                break L33;
                              }
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L33;
                  }
                }
              }
              L36: while (true) {
                if (!q.g((byte) -15)) {
                  L37: {
                    L38: {
                      if (0 < fa.field_c) {
                        break L38;
                      } else {
                        if (vk.field_b <= 1) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if (ng.field_a[13]) {
                        break L39;
                      } else {
                        if (jk.field_q == -1) {
                          break L37;
                        } else {
                          if ((vh.field_e ^ -1) != -1) {
                            break L39;
                          } else {
                            if (ng.field_a[83]) {
                              break L39;
                            } else {
                              if (!ng.field_a[84]) {
                                break L37;
                              } else {
                                break L39;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (!u.field_g) {
                      break L37;
                    } else {
                      if (ka.field_o != null) {
                        break L37;
                      } else {
                        L40: {
                          u.field_g = false;
                          if (null != ka.field_o) {
                            ka.field_o.field_b = true;
                            break L40;
                          } else {
                            ka.field_o = new mj();
                            break L40;
                          }
                        }
                        L41: {
                          ka.field_o.field_n = -1 + vk.field_b;
                          if ((vk.field_b ^ -1) != -2) {
                            break L41;
                          } else {
                            L42: {
                              he.field_n[0].field_n = 0;
                              this.c(false, fa.field_c);
                              if ((kb.field_a ^ -1) < -1) {
                                ka.field_o.field_l = true;
                                break L42;
                              } else {
                                ka.field_o.field_n = 11;
                                ka.field_o.field_e = true;
                                break L42;
                              }
                            }
                            jk.field_q = -1;
                            break L41;
                          }
                        }
                        ta.field_c = 1.0;
                        vk.field_b = 3;
                        if (rd.field_a) {
                          var2_ref2 = jl.field_d;
                          synchronized (var2_ref2) {
                            L43: {
                              ld.field_l.a(sd.field_mb, true, 124);
                              jl.field_d.d();
                              break L43;
                            }
                          }
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                    }
                  }
                  L44: {
                    if (!u.field_g) {
                      break L44;
                    } else {
                      L45: {
                        if ((vk.field_b ^ -1) == -2) {
                          L46: {
                            L47: {
                              if (ng.field_a[96]) {
                                break L47;
                              } else {
                                if (!ng.field_a[nj.field_m]) {
                                  break L46;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            he.field_n[0].field_c = he.field_n[0].field_c - 0.35;
                            break L46;
                          }
                          L48: {
                            if (ng.field_a[97]) {
                              break L48;
                            } else {
                              if (ng.field_a[ee.field_a]) {
                                break L48;
                              } else {
                                break L45;
                              }
                            }
                          }
                          he.field_n[0].field_c = he.field_n[0].field_c + 0.35;
                          break L45;
                        } else {
                          break L45;
                        }
                      }
                      L49: {
                        if (vk.field_b != 2) {
                          break L49;
                        } else {
                          L50: {
                            if (ng.field_a[nj.field_m]) {
                              he.field_n[0].field_c = he.field_n[0].field_c - 0.35;
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                          L51: {
                            if (!ng.field_a[ee.field_a]) {
                              break L51;
                            } else {
                              he.field_n[0].field_c = he.field_n[0].field_c + 0.35;
                              break L51;
                            }
                          }
                          L52: {
                            if (!ng.field_a[96]) {
                              break L52;
                            } else {
                              he.field_n[1].field_c = he.field_n[1].field_c - 0.35;
                              break L52;
                            }
                          }
                          if (ng.field_a[97]) {
                            he.field_n[1].field_c = he.field_n[1].field_c + 0.35;
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                      }
                      if (3 <= vk.field_b) {
                        L53: {
                          if (ng.field_a[nj.field_m]) {
                            he.field_n[0].field_c = he.field_n[0].field_c - 0.35;
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                        L54: {
                          if (!ng.field_a[ee.field_a]) {
                            break L54;
                          } else {
                            he.field_n[0].field_c = he.field_n[0].field_c + 0.35;
                            break L54;
                          }
                        }
                        L55: {
                          if (ng.field_a[nb.field_g]) {
                            he.field_n[2].field_c = he.field_n[2].field_c - 0.35;
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                        L56: {
                          if (ng.field_a[db.field_S]) {
                            he.field_n[2].field_c = he.field_n[2].field_c + 0.35;
                            break L56;
                          } else {
                            break L56;
                          }
                        }
                        L57: {
                          if (ng.field_a[96]) {
                            he.field_n[1].field_c = he.field_n[1].field_c - 0.35;
                            break L57;
                          } else {
                            break L57;
                          }
                        }
                        if (!ng.field_a[97]) {
                          break L44;
                        } else {
                          he.field_n[1].field_c = he.field_n[1].field_c + 0.35;
                          break L44;
                        }
                      } else {
                        break L44;
                      }
                    }
                  }
                  L58: {
                    L59: {
                      ua.field_c[ua.field_b + -1].field_d = 6;
                      ua.field_c[-2 + ua.field_b].field_d = 6;
                      ua.field_c[ua.field_b - 3].field_d = 6;
                      if (null == ka.field_o) {
                        break L59;
                      } else {
                        if (u.field_g) {
                          break L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                    ca.a(false);
                    break L58;
                  }
                  var2_int = 0;
                  L60: while (true) {
                    if (var2_int >= vk.field_b) {
                      var2_int = 0;
                      L61: while (true) {
                        if ((ua.field_b ^ -1) >= (var2_int ^ -1)) {
                          L62: {
                            if (0 >= wj.field_e) {
                              break L62;
                            } else {
                              wj.field_e = wj.field_e + 1;
                              break L62;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          ua.field_c[var2_int].field_h = ua.field_c[var2_int].field_h - ta.field_c;
                          stackOut_461_0 = (-16.0 < ua.field_c[var2_int].field_h ? -1 : (-16.0 == ua.field_c[var2_int].field_h ? 0 : 1));
                          stackIn_463_0 = stackOut_461_0;
                          L63: {
                            if (stackIn_463_0 > 0) {
                              ua.field_c[var2_int].a(116, qb.a(true), (double)(int)(Math.random() * 384.0 + 64.0));
                              var3 = Math.random() * 32.0;
                              if (ua.field_c[(-4 + ua.field_b + var2_int) % (-3 + ua.field_b)].field_h + 32.0 + var3 > ua.field_c[var2_int].field_h) {
                                ua.field_c[var2_int].field_h = ua.field_c[(var2_int - (-ua.field_b - -4)) % (-3 + ua.field_b)].field_h + 32.0 + var3;
                                break L63;
                              } else {
                                break L63;
                              }
                            } else {
                              break L63;
                            }
                          }
                          ua.field_c[var2_int].a(-64);
                          var2_int++;
                          continue L61;
                        }
                      }
                    } else {
                      L64: {
                        L65: {
                          if ((he.field_n[var2_int].field_n ^ -1) < -1) {
                            break L65;
                          } else {
                            if ((he.field_n[var2_int].field_p ^ -1) < -1) {
                              break L65;
                            } else {
                              he.field_n[var2_int].a(il.field_a, false);
                              he.field_n[var2_int].a(il.field_a, (byte) 106);
                              break L64;
                            }
                          }
                        }
                        L66: {
                          L67: {
                            if (null == ka.field_o) {
                              break L67;
                            } else {
                              if (!u.field_g) {
                                break L67;
                              } else {
                                break L66;
                              }
                            }
                          }
                          he.field_n[var2_int].a(ua.field_c, nj.field_l, ua.field_b, il.field_a, ta.field_c, (byte) 90);
                          break L66;
                        }
                        if (u.field_g) {
                          break L64;
                        } else {
                          L68: {
                            if (-1 == (he.field_n[var2_int].field_h ^ -1)) {
                              he.field_n[var2_int].field_c = he.field_n[var2_int].field_c + 0.35;
                              break L68;
                            } else {
                              he.field_n[var2_int].field_c = he.field_n[var2_int].field_c - 0.35;
                              break L68;
                            }
                          }
                          L69: {
                            if (50.0 <= he.field_n[var2_int].field_u) {
                              break L69;
                            } else {
                              he.field_n[var2_int].field_h = 0;
                              break L69;
                            }
                          }
                          if (462.0 >= he.field_n[var2_int].field_u) {
                            break L64;
                          } else {
                            he.field_n[var2_int].field_h = 1;
                            break L64;
                          }
                        }
                      }
                      var2_int++;
                      continue L60;
                    }
                  }
                } else {
                  L70: {
                    if ((lh.field_f ^ -1) == -50) {
                      L71: {
                        if (wd.field_x) {
                          stackOut_224_0 = 0;
                          stackIn_225_0 = stackOut_224_0;
                          break L71;
                        } else {
                          stackOut_222_0 = 1;
                          stackIn_225_0 = stackOut_222_0;
                          break L71;
                        }
                      }
                      wd.field_x = stackIn_225_0 != 0;
                      break L70;
                    } else {
                      break L70;
                    }
                  }
                  L72: {
                    if (-71 != (lh.field_f ^ -1)) {
                      break L72;
                    } else {
                      L73: {
                        if (rd.field_a) {
                          stackOut_232_0 = 0;
                          stackIn_233_0 = stackOut_232_0;
                          break L73;
                        } else {
                          stackOut_230_0 = 1;
                          stackIn_233_0 = stackOut_230_0;
                          break L73;
                        }
                      }
                      rd.field_a = stackIn_233_0 != 0;
                      var2_ref2 = jl.field_d;
                      synchronized (var2_ref2) {
                        L74: {
                          L75: {
                            if (rd.field_a) {
                              L76: {
                                stackOut_236_0 = ld.field_l;
                                stackIn_241_0 = stackOut_236_0;
                                stackIn_237_0 = stackOut_236_0;
                                if (!u.field_g) {
                                  stackOut_241_0 = (pk) ((Object) stackIn_241_0);
                                  stackOut_241_1 = sd.field_mb;
                                  stackIn_242_0 = stackOut_241_0;
                                  stackIn_242_1 = stackOut_241_1;
                                  break L76;
                                } else {
                                  stackOut_237_0 = (pk) ((Object) stackIn_237_0);
                                  stackIn_239_0 = stackOut_237_0;
                                  stackOut_239_0 = (pk) ((Object) stackIn_239_0);
                                  stackOut_239_1 = wj.field_c;
                                  stackIn_242_0 = stackOut_239_0;
                                  stackIn_242_1 = stackOut_239_1;
                                  break L76;
                                }
                              }
                              ((pk) (Object) stackIn_242_0).a(stackIn_242_1, true, 54);
                              break L75;
                            } else {
                              ld.field_l.f(-22719);
                              break L75;
                            }
                          }
                          jl.field_d.d();
                          break L74;
                        }
                      }
                      break L72;
                    }
                  }
                  L77: {
                    if (ka.field_o == null) {
                      break L77;
                    } else {
                      if ((rj.field_j ^ -1) == 0) {
                        L78: {
                          if (-1 == (n.field_m ^ -1)) {
                            L79: {
                              if (-99 != (lh.field_f ^ -1)) {
                                break L79;
                              } else {
                                ka.field_o.a(-1, 12011);
                                break L79;
                              }
                            }
                            L80: {
                              if (lh.field_f == 99) {
                                ka.field_o.a(1, 12011);
                                break L80;
                              } else {
                                break L80;
                              }
                            }
                            L81: {
                              if (lh.field_f != 96) {
                                break L81;
                              } else {
                                ka.field_o.a(false, -31729, -1);
                                break L81;
                              }
                            }
                            L82: {
                              if (-98 == (lh.field_f ^ -1)) {
                                ka.field_o.a(false, -31729, 1);
                                break L82;
                              } else {
                                break L82;
                              }
                            }
                            L83: {
                              if (lh.field_f != 102) {
                                break L83;
                              } else {
                                if (ka.field_o.field_e) {
                                  break L83;
                                } else {
                                  ka.field_o.a(false, -31729, -16);
                                  break L83;
                                }
                              }
                            }
                            L84: {
                              if (-104 != (lh.field_f ^ -1)) {
                                break L84;
                              } else {
                                if (!ka.field_o.field_e) {
                                  ka.field_o.a(false, -31729, 16);
                                  break L84;
                                } else {
                                  break L84;
                                }
                              }
                            }
                            if (-85 != (lh.field_f ^ -1)) {
                              break L78;
                            } else {
                              ka.field_o.a(false, -31729, 0);
                              break L78;
                            }
                          } else {
                            break L78;
                          }
                        }
                        if (lh.field_f != 13) {
                          break L77;
                        } else {
                          ka.field_o.b(-1);
                          break L77;
                        }
                      } else {
                        break L77;
                      }
                    }
                  }
                  if (84 == lh.field_f) {
                    if (rj.field_j != 0) {
                      continue L36;
                    } else {
                      L85: {
                        if (0 == qf.field_b) {
                          tk.d(-6144);
                          rj.field_j = 2;
                          break L85;
                        } else {
                          break L85;
                        }
                      }
                      if ((qf.field_b ^ -1) == -2) {
                        ka.field_o.field_l = false;
                        kb.field_a = 0;
                        ka.field_o.field_e = false;
                        rj.field_j = -1;
                        if (!this.field_L) {
                          ka.field_o.field_n = 0;
                          continue L36;
                        } else {
                          continue L36;
                        }
                      } else {
                        continue L36;
                      }
                    }
                  } else {
                    continue L36;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "Bounce.OA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ke var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        var3 = field_N;
        try {
          L0: {
            L1: {
              f.field_a.e();
              jl.field_d.e();
              stackOut_1_0 = this;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (sj.field_f == null) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              this.a(stackIn_5_1 != 0, -73);
              if (!ri.field_z) {
                break L2;
              } else {
                this.k(-16);
                ri.field_z = false;
                break L2;
              }
            }
            if (param0 == 37) {
              L3: {
                if (sj.field_f == null) {
                  break L3;
                } else {
                  if (sj.field_f.field_f) {
                    v.d((byte) 121);
                    mh.a(sj.field_f, (byte) 80);
                    sj.field_f.a((byte) -121, ck.field_e);
                    sj.field_f = null;
                    ch.field_h.requestFocus();
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!ci.k(-31077)) {
                  L5: {
                    if (!ef.field_c) {
                      this.b(true, 3134);
                      break L5;
                    } else {
                      if (bh.field_d == null) {
                        if (!vc.d((byte) 122)) {
                          if (g.a(false)) {
                            L6: {
                              stackOut_65_0 = this;
                              stackOut_65_1 = -119;
                              stackIn_70_0 = stackOut_65_0;
                              stackIn_70_1 = stackOut_65_1;
                              stackIn_66_0 = stackOut_65_0;
                              stackIn_66_1 = stackOut_65_1;
                              if (null == sj.field_f) {
                                stackOut_70_0 = this;
                                stackOut_70_1 = stackIn_70_1;
                                stackOut_70_2 = 0;
                                stackIn_71_0 = stackOut_70_0;
                                stackIn_71_1 = stackOut_70_1;
                                stackIn_71_2 = stackOut_70_2;
                                break L6;
                              } else {
                                stackOut_66_0 = this;
                                stackOut_66_1 = stackIn_66_1;
                                stackIn_68_0 = stackOut_66_0;
                                stackIn_68_1 = stackOut_66_1;
                                stackOut_68_0 = this;
                                stackOut_68_1 = stackIn_68_1;
                                stackOut_68_2 = 1;
                                stackIn_71_0 = stackOut_68_0;
                                stackIn_71_1 = stackOut_68_1;
                                stackIn_71_2 = stackOut_68_2;
                                break L6;
                              }
                            }
                            L7: {
                              var2_int = oj.a((kk) (this), stackIn_71_1, stackIn_71_2 != 0);
                              if (1 == var2_int) {
                                if (null != sj.field_f) {
                                  mh.a(sj.field_f, (byte) 121);
                                  sj.field_f.a((byte) -127, ck.field_e);
                                  sj.field_f = null;
                                  ch.field_h.requestFocus();
                                  break L7;
                                } else {
                                  break L7;
                                }
                              } else {
                                if (2 != var2_int) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (null == sj.field_f) {
                                      break L8;
                                    } else {
                                      mh.a(sj.field_f, (byte) 103);
                                      sj.field_f.a((byte) -115, ck.field_e);
                                      sj.field_f = null;
                                      ch.field_h.requestFocus();
                                      break L8;
                                    }
                                  }
                                  tc.a(vi.b(param0 ^ 37), 6091);
                                  break L7;
                                }
                              }
                            }
                            break L5;
                          } else {
                            this.l(-124);
                            break L5;
                          }
                        } else {
                          L9: {
                            var2_int = vi.c(param0 + 88);
                            if ((var2_int ^ -1) != -3) {
                              break L9;
                            } else {
                              if (sj.field_f == null) {
                                break L9;
                              } else {
                                mh.a(sj.field_f, (byte) 111);
                                sj.field_f.a((byte) -121, ck.field_e);
                                sj.field_f = null;
                                ch.field_h.requestFocus();
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var2_int == 3) {
                              mg.d(30432);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if (4 != var2_int) {
                              break L11;
                            } else {
                              nl.a((byte) 122);
                              fb.field_nb = true;
                              break L11;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        if (!bh.field_d.field_g) {
                          break L5;
                        } else {
                          L12: {
                            ui.field_g = ui.field_g | bh.field_d.field_k;
                            kb.field_a = kb.field_a & (bh.field_d.field_k ^ -1);
                            bh.field_d = null;
                            if (0 >= kb.field_a) {
                              break L12;
                            } else {
                              ka.field_o.field_e = false;
                              ka.field_o.field_l = true;
                              break L12;
                            }
                          }
                          ed.a((byte) -127);
                          var2_ref = (ke) ((Object) m.field_c.a((byte) -104));
                          L13: while (true) {
                            if (null == var2_ref) {
                              break L5;
                            } else {
                              re.a((byte) 109, var2_ref, 4);
                              var2_ref = (ke) ((Object) m.field_c.d((byte) 70));
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                  }
                  L14: while (true) {
                    if (!s.a(true, ce.field_n)) {
                      jj.a(0, true);
                      if (tb.e(-11)) {
                        L15: {
                          L16: {
                            var2_int = this.h(param0 ^ 36);
                            if (var2_int == 0) {
                              break L16;
                            } else {
                              if ((var2_int ^ -1) == -2) {
                                break L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                          rk.a(3, (byte) -29);
                          ih.a(4, -1);
                          break L15;
                        }
                        if (-3 != (var2_int ^ -1)) {
                          break L4;
                        } else {
                          vk.a(240, (tg[]) null, 320, gk.field_e.field_s, cl.field_p[0].field_o, od.field_f.field_s, gk.field_e.field_s, 3, 2, gk.field_e, od.field_f, (tg[]) null, cl.field_p[0].field_t, od.field_f.field_s);
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      this.j(-4);
                      continue L14;
                    }
                  }
                } else {
                  this.g(0);
                  if (hi.a((byte) -118)) {
                    this.b(false, param0 + 3097);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "Bounce.V(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        var14 = field_N;
        try {
          L0: {
            if (param5 <= param3) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) < (1 + param3 ^ -1)) {
                L1: {
                  if ((param1 ^ -1) >= (5 + param3 ^ -1)) {
                    break L1;
                  } else {
                    if ((param0 ^ -1) != (param4 ^ -1)) {
                      var7_int = (param4 & param0 & 1) + (param4 >> -1616669407) + (param0 >> -845565151);
                      var8 = param3;
                      var9 = param4;
                      var10 = param0;
                      var11 = param3;
                      L2: while (true) {
                        if (var11 >= param1) {
                          Bounce.a(var9, var8, 22668, param3, param4, param5, param6);
                          Bounce.a(param0, param1, param2, var8, var10, param5, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = w.field_f[var11];
                            if (param6) {
                              stackOut_27_0 = sj.field_j[var12];
                              stackIn_28_0 = stackOut_27_0;
                              break L3;
                            } else {
                              stackOut_25_0 = ij.field_b[var12];
                              stackIn_28_0 = stackOut_25_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_28_0;
                            if (var7_int >= var13) {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              w.field_f[var11] = w.field_f[var8];
                              incrementValue$1 = var8;
                              var8++;
                              w.field_f[incrementValue$1] = var12;
                              if ((var13 ^ -1) <= (var9 ^ -1)) {
                                break L4;
                              } else {
                                var9 = var13;
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param1;
                L5: while (true) {
                  if ((var7_int ^ -1) >= (param3 ^ -1)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param3;
                    L6: while (true) {
                      if ((var7_int ^ -1) >= (var8 ^ -1)) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = w.field_f[var8];
                          var10 = w.field_f[1 + var8];
                          if (!hc.a(var9, param6, var10, (byte) 97)) {
                            break L7;
                          } else {
                            w.field_f[var8] = var10;
                            w.field_f[1 + var8] = var9;
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var7), "Bounce.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public final void init() {
        try {
            this.a(11, (byte) 122, "bouncedown");
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "Bounce.init()");
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == f.field_a) {
                break L1;
              } else {
                f.field_a.a();
                break L1;
              }
            }
            L2: {
              if (jl.field_d != null) {
                jl.field_d.a();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == -111) {
                break L3;
              } else {
                this.field_E = true;
                break L3;
              }
            }
            L4: {
              if (sj.field_f != null) {
                mh.a(sj.field_f, (byte) 101);
                sj.field_f.a((byte) -122, ck.field_e);
                sj.field_f = null;
                ch.field_h.requestFocus();
                break L4;
              } else {
                break L4;
              }
            }
            td.a((byte) 18);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "Bounce.CA(" + param0 + ')');
        }
    }

    public static void k(byte param0) {
        try {
            field_A = null;
            field_G = null;
            int var1_int = -98 / ((-25 - param0) / 60);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "Bounce.SA(" + param0 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        tg discarded$16 = null;
        tg discarded$17 = null;
        tg discarded$18 = null;
        tg discarded$19 = null;
        tg discarded$20 = null;
        tg discarded$21 = null;
        tg discarded$22 = null;
        tg discarded$23 = null;
        tg[] discarded$24 = null;
        tg discarded$25 = null;
        tg discarded$26 = null;
        tg discarded$27 = null;
        tg discarded$28 = null;
        tg discarded$29 = null;
        tg discarded$30 = null;
        tg discarded$31 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        u var3_ref = null;
        Object var3_ref2 = null;
        Throwable var4 = null;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        Throwable decompiledCaughtException = null;
        var5 = field_N;
        try {
          L0: {
            vh.a(32459);
            qe.a((byte) -37, va.field_a);
            if (ca.field_e != null) {
              L1: {
                if (null == pa.field_c) {
                  break L1;
                } else {
                  L2: {
                    if (!pa.field_c.c(-79)) {
                      break L2;
                    } else {
                      if (pa.field_c.a((byte) -41)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  hg.a(hg.a(nl.field_a, pa.field_c, 130, fj.field_k), -99, 10.0f);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              L3: {
                if (ai.field_e == null) {
                  break L3;
                } else {
                  L4: {
                    if (!ai.field_e.c(51)) {
                      break L4;
                    } else {
                      if (ai.field_e.a((byte) -109)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  hg.a(hg.a(nl.field_a, ai.field_e, 130, fj.field_k), -114, 20.0f);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L5: {
                if (null == pk.field_D) {
                  break L5;
                } else {
                  L6: {
                    if (!pk.field_D.c(67)) {
                      break L6;
                    } else {
                      if (pk.field_D.a((byte) -43)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  hg.a(hg.a(ke.field_n, pk.field_D, param1 ^ 3260, vk.field_e), -120, 30.0f);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
              L7: {
                if (ca.field_e == null) {
                  break L7;
                } else {
                  L8: {
                    if (!ca.field_e.c(param1 + -3027)) {
                      break L8;
                    } else {
                      if (!ca.field_e.a((byte) -113)) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  hg.a(hg.a(ke.field_n, ca.field_e, 130, vk.field_e), param1 + -3156, 40.0f);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
              L9: {
                if (null == ub.field_a) {
                  break L9;
                } else {
                  L10: {
                    if (!ub.field_a.c(94)) {
                      break L10;
                    } else {
                      if (ub.field_a.a((byte) -101)) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  hg.a(hg.a(dk.field_b, ub.field_a, 130, fi.field_a), -86, 50.0f);
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
              L11: {
                if (j.field_j == null) {
                  break L11;
                } else {
                  L12: {
                    if (!j.field_j.c(param1 + -3219)) {
                      break L12;
                    } else {
                      if (j.field_j.b("basic", false)) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  hg.a(fb.a((byte) -67, dk.field_b, fi.field_a, j.field_j, "basic"), -39, 60.0f);
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              }
              L13: {
                if (va.field_c == null) {
                  break L13;
                } else {
                  L14: {
                    if (!va.field_c.c(param1 + -3244)) {
                      break L14;
                    } else {
                      if (!va.field_c.a((byte) -46)) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  hg.a(fb.a((byte) -92, mg.field_k, vc.field_B, va.field_c, ""), param1 ^ -3159, 80.0f);
                  decompiledRegionSelector0 = 6;
                  break L0;
                }
              }
              if (param0) {
                ed.a((byte) -127);
                hg.a(di.field_a, param1 + -3248, 85.0f);
                this.e(4);
                var3_ref = new u(22050, e.field_r);
                il.field_a[0] = ei.a(pa.field_c, "", "dissolve1").b().a(var3_ref);
                il.field_a[3] = ei.a(pa.field_c, "", "slime_grows").b().a(var3_ref);
                il.field_a[4] = ei.a(pa.field_c, "", "slime_jump").b().a(var3_ref);
                il.field_a[5] = ei.a(pa.field_c, "", "slime_jump_large").b().a(var3_ref);
                il.field_a[6] = ei.a(pa.field_c, "", "slime_jump_small").b().a(var3_ref);
                il.field_a[7] = ei.a(pa.field_c, "", "slime_land").b().a(var3_ref);
                il.field_a[8] = ei.a(pa.field_c, "", "slime_reduces").b().a(var3_ref);
                il.field_a[9] = ei.a(pa.field_c, "", "squish").b().a(var3_ref);
                hg.a(di.field_a, -21, 90.0f);
                this.e(4);
                il.field_a[11] = te.a(ai.field_e, "", "slime_eek").a().a(var3_ref);
                il.field_a[12] = te.a(ai.field_e, "", "slime_falls").a().a(var3_ref);
                il.field_a[13] = te.a(ai.field_e, "", "slime_laughs").a().a(var3_ref);
                il.field_a[14] = te.a(ai.field_e, "", "slime_ooh").a().a(var3_ref);
                il.field_a[15] = te.a(ai.field_e, "", "slime_ow").a().a(var3_ref);
                hg.a(va.field_g, -125, 95.0f);
                var3_ref = null;
                this.e(4);
                sd.field_mb = be.a(ca.field_e, "", "bounce down title screen");
                wj.field_c = be.a(ca.field_e, "", "bounce");
                ca.field_e = null;
                cf.field_d = new i(pa.field_c, ai.field_e);
                ai.field_e = null;
                pa.field_c = null;
                vc.e((byte) -44);
                decompiledRegionSelector0 = 8;
                break L0;
              } else {
                decompiledRegionSelector0 = 7;
                break L0;
              }
            } else {
              if (pk.field_D == null) {
                if (null == ub.field_a) {
                  u.field_g = false;
                  var3_int = 0;
                  L15: while (true) {
                    if (var3_int >= ua.field_b) {
                      ua.field_b = 0;
                      var3_int = 0;
                      L16: while (true) {
                        if (var3_int >= 480) {
                          L17: {
                            ua.field_c[ua.field_b].a(81, 6, (double)(int)(64.0 + Math.random() * 384.0));
                            ua.field_b = ua.field_b + 1;
                            ua.field_c[ua.field_b].a(89, 6, (double)(int)(Math.random() * 384.0 + 64.0));
                            ua.field_b = ua.field_b + 1;
                            ua.field_c[ua.field_b].a(60, 6, (double)(int)(384.0 * Math.random() + 64.0));
                            ua.field_b = ua.field_b + 1;
                            he.field_n[0] = new ud();
                            he.field_n[1] = new ud();
                            he.field_n[2] = new ud();
                            ui.a(50, (byte) 127);
                            jl.field_h = (Bounce) (this);
                            if (param1 == 3134) {
                              break L17;
                            } else {
                              this.field_E = true;
                              break L17;
                            }
                          }
                          ka.field_o = new mj();
                          var3_ref2 = jl.field_d;
                          synchronized (var3_ref2) {
                            L18: {
                              ld.field_l.g(jd.field_a / 2, 100);
                              ld.field_l.a(sd.field_mb, true, 85);
                              jl.field_d.d();
                              break L18;
                            }
                          }
                          L19: {
                            if (!jh.b(767564065)) {
                              bh.field_d = lf.a(-97, 4);
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          ef.field_c = true;
                          vc.e((byte) -44);
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          ua.field_c[ua.field_b].a(42, 0, (double)(int)(Math.random() * 384.0 + 64.0));
                          ua.field_c[ua.field_b].field_h = (double)var3_int;
                          ua.field_b = ua.field_b + 1;
                          var3_int += 64;
                          continue L16;
                        }
                      }
                    } else {
                      ua.field_c[var3_int] = new dg();
                      var3_int++;
                      continue L15;
                    }
                  }
                } else {
                  L20: {
                    hg.a(he.field_i, -75, 99.0f);
                    this.e(4);
                    gk.field_e = q.a(param1 ^ -3135, va.field_c, "b12", ub.field_a, "");
                    jh.field_s = q.a(-1, va.field_c, "comic20", ub.field_a, "");
                    od.field_f = q.a(-1, va.field_c, "newfont", ub.field_a, "");
                    l.field_e = nc.a("title", ub.field_a, "", 0);
                    ej.field_a = nc.a("title_achievements", ub.field_a, "", param1 + -3134);
                    mf.field_b = nc.a("title_highscores", ub.field_a, "", 0);
                    mi.field_k = nc.a("title_instructions", ub.field_a, "", 0);
                    cl.field_p = vh.a(ub.field_a, "", (byte) -13, "frame");
                    ig.field_d = vh.a(ub.field_a, "", (byte) 117, "frame_50");
                    jc.field_n = nc.a("welldone", ub.field_a, "", param1 ^ 3134);
                    ph.field_b = nc.a("betterluck", ub.field_a, "", 0);
                    if (!vh.a(0, (byte) 88)) {
                      mb.field_q = nc.a("background", ub.field_a, "", 0);
                      break L20;
                    } else {
                      mb.field_q = nc.a("bg_halloween", ub.field_a, "", 0);
                      uk.field_f = vh.a(ub.field_a, "", (byte) 118, "bats");
                      break L20;
                    }
                  }
                  pc.field_o = nc.a("wall", ub.field_a, "", param1 + -3134);
                  wi.field_j = nc.a("topspikes", ub.field_a, "", param1 ^ 3134);
                  vb.field_m = vh.a(ub.field_a, "", (byte) -68, "squish");
                  se.field_A = nc.a("spikes", ub.field_a, "", param1 ^ 3134);
                  discarded$16 = nc.a("scorebox", ub.field_a, "", 0);
                  hd.field_a = vh.a(ub.field_a, "", (byte) -115, "pupils");
                  ci.field_G = vh.a(ub.field_a, "", (byte) 111, "pops");
                  dg.field_a = vh.a(ub.field_a, "", (byte) 119, "players");
                  va.field_d = vh.a(ub.field_a, "", (byte) -38, "newhighscore");
                  re.field_a = nc.a("plat1", ub.field_a, "", 0);
                  a.field_f = nc.a("plat1b", ub.field_a, "", 0);
                  q.field_F = nc.a("plat2", ub.field_a, "", 0);
                  ge.field_b = nc.a("eye", ub.field_a, "", 0);
                  wj.field_d = vh.a(ub.field_a, "", (byte) -63, "mouths");
                  ld.field_h = vh.a(ub.field_a, "", (byte) -116, "fire");
                  w.field_c = vh.a(ub.field_a, "", (byte) -81, "burns");
                  kc.field_c = nc.a("plat0", ub.field_a, "", 0);
                  fd.field_n = vh.a(ub.field_a, "", (byte) 125, "plat3");
                  nk.field_h = vh.a(ub.field_a, "", (byte) 117, "plat4");
                  bd.field_j = vh.a(ub.field_a, "", (byte) 120, "plat4grw");
                  wb.field_e = vh.a(ub.field_a, "", (byte) 10, "plat4shr");
                  nl.field_d = vh.a(ub.field_a, "", (byte) -15, "plat4spi");
                  discarded$17 = nc.a("clickme", ub.field_a, "", param1 + -3134);
                  ug.field_h = vh.a(ub.field_a, "", (byte) 108, "achievements");
                  cf.field_c = nc.a("unachieved", j.field_j, "basic", 0);
                  discarded$18 = nc.a("orbcoin", j.field_j, "basic", 0);
                  pe.field_a = vh.a(ub.field_a, "", (byte) 114, "wins");
                  mc.field_b = vh.a(ub.field_a, "", (byte) -94, "draw");
                  discarded$19 = nc.a("instructions", ub.field_a, "", 0);
                  discarded$20 = nc.a("highscorebutton", ub.field_a, "", 0);
                  discarded$21 = nc.a("1player", ub.field_a, "", 0);
                  discarded$22 = nc.a("2player", ub.field_a, "", param1 + -3134);
                  discarded$23 = nc.a("3player", ub.field_a, "", param1 + -3134);
                  discarded$24 = vh.a(ub.field_a, "", (byte) 114, "arrows");
                  discarded$25 = nc.a("fullscreen", ub.field_a, "", param1 ^ 3134);
                  discarded$26 = nc.a("musicon", ub.field_a, "", 0);
                  discarded$27 = nc.a("musicoff", ub.field_a, "", 0);
                  discarded$28 = nc.a("soundon", ub.field_a, "", 0);
                  discarded$29 = nc.a("soundoff", ub.field_a, "", param1 ^ 3134);
                  discarded$30 = nc.a("quitgame", ub.field_a, "", 0);
                  discarded$31 = nc.a("instruct", ub.field_a, "", 0);
                  ec.a(gk.field_e, 4, 16777215, 0, od.field_f, 240, (tg[]) null, 8, 320, 20, -35, 20, (tg[]) null, 320, 16741888, 14, (tg[]) null, 8, 20, 16697912, 0);
                  ag.field_c = 16777215;
                  ub.field_a = null;
                  de.field_f = 16697912;
                  bc.field_a = 16741888;
                  vc.e((byte) -44);
                  decompiledRegionSelector0 = 12;
                  break L0;
                }
              } else {
                if (!ld.field_l.a((byte) -122, cf.field_d, pk.field_D, sd.field_mb, 176400)) {
                  decompiledRegionSelector0 = 9;
                  break L0;
                } else {
                  if (!ld.field_l.a((byte) -124, cf.field_d, pk.field_D, wj.field_c, 176400)) {
                    decompiledRegionSelector0 = 10;
                    break L0;
                  } else {
                    ld.field_l.e(param1 ^ 3118);
                    pk.field_D = null;
                    cf.field_d = null;
                    vc.e((byte) -44);
                    decompiledRegionSelector0 = 11;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "Bounce.PA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return;
                                } else {
                                  return;
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
            }
          }
        }
    }

    final void c(byte param0) {
        this.a(9, 0, 10, 3, 7, 8764, false, 8);
        e.a(22050, true, 10);
        f.field_a = e.a(ck.field_e, (java.awt.Component) ((Object) ch.field_h), 0, 512);
        jl.field_d = e.a(ck.field_e, (java.awt.Component) ((Object) ch.field_h), 1, 22050);
        nj.field_l = new rb();
        f.field_a.a(nj.field_l);
        bk.field_c = 1;
        ca.field_a = new int[1];
        eh.field_b = null;
        ld.field_l = new pk();
        if (param0 != -6) {
            return;
        }
        try {
            ld.field_l.b((byte) 114, 128, 9);
            jl.field_d.a(ld.field_l);
            ff.field_C = 0.0;
            eg.field_n = 0;
            this.a(true, false, 22422, false, false);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "Bounce.EA(" + param0 + ')');
        }
    }

    private final void c(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.c((byte) -116);
                break L1;
              }
            }
            L2: {
              if (0 >= param1) {
                break L2;
              } else {
                if (!jh.b(767564065)) {
                  ti.field_O = param1;
                  qc.field_a = pb.a(new int[]{param1}, l.field_c, jd.field_e, vd.field_a, ec.field_cb, 3, 13, 65522, (byte) 98);
                  pe.field_f = pe.a(3, 10, 1, -16947, 13);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (!jh.b(767564065)) {
                break L3;
              } else {
                qf.field_b = 0;
                rj.field_j = 0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "Bounce.NA(" + param0 + ',' + param1 + ')');
        }
    }

    final void e(int param0) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        ab var5 = null;
        Object var5_ref = null;
        Throwable var6 = null;
        int var6_int = 0;
        ie var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        RuntimeException stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ie stackIn_308_0 = null;
        int stackIn_308_1 = 0;
        int stackIn_308_2 = 0;
        ie stackIn_310_0 = null;
        int stackIn_310_1 = 0;
        int stackIn_310_2 = 0;
        ie stackIn_311_0 = null;
        int stackIn_311_1 = 0;
        int stackIn_311_2 = 0;
        int stackIn_311_3 = 0;
        ie stackIn_312_0 = null;
        int stackIn_312_1 = 0;
        int stackIn_312_2 = 0;
        int stackIn_312_3 = 0;
        ie stackIn_314_0 = null;
        int stackIn_314_1 = 0;
        int stackIn_314_2 = 0;
        int stackIn_314_3 = 0;
        ie stackIn_315_0 = null;
        int stackIn_315_1 = 0;
        int stackIn_315_2 = 0;
        int stackIn_315_3 = 0;
        int stackIn_315_4 = 0;
        Object stackIn_316_0 = null;
        String stackIn_316_1 = null;
        boolean stackIn_316_2 = false;
        int stackIn_316_3 = 0;
        Object stackIn_318_0 = null;
        String stackIn_318_1 = null;
        boolean stackIn_318_2 = false;
        int stackIn_318_3 = 0;
        Object stackIn_319_0 = null;
        String stackIn_319_1 = null;
        boolean stackIn_319_2 = false;
        int stackIn_319_3 = 0;
        int stackIn_319_4 = 0;
        ie stackIn_320_0 = null;
        int stackIn_320_1 = 0;
        int stackIn_320_2 = 0;
        ie stackIn_322_0 = null;
        int stackIn_322_1 = 0;
        int stackIn_322_2 = 0;
        ie stackIn_323_0 = null;
        int stackIn_323_1 = 0;
        int stackIn_323_2 = 0;
        int stackIn_323_3 = 0;
        ie stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        int stackIn_324_2 = 0;
        int stackIn_324_3 = 0;
        ie stackIn_326_0 = null;
        int stackIn_326_1 = 0;
        int stackIn_326_2 = 0;
        int stackIn_326_3 = 0;
        ie stackIn_327_0 = null;
        int stackIn_327_1 = 0;
        int stackIn_327_2 = 0;
        int stackIn_327_3 = 0;
        int stackIn_327_4 = 0;
        Object stackIn_328_0 = null;
        String stackIn_328_1 = null;
        boolean stackIn_328_2 = false;
        int stackIn_328_3 = 0;
        Object stackIn_330_0 = null;
        String stackIn_330_1 = null;
        boolean stackIn_330_2 = false;
        int stackIn_330_3 = 0;
        Object stackIn_331_0 = null;
        String stackIn_331_1 = null;
        boolean stackIn_331_2 = false;
        int stackIn_331_3 = 0;
        int stackIn_331_4 = 0;
        ie stackIn_332_0 = null;
        ie stackIn_334_0 = null;
        ie stackIn_335_0 = null;
        int stackIn_335_1 = 0;
        ie stackIn_336_0 = null;
        int stackIn_336_1 = 0;
        ie stackIn_338_0 = null;
        int stackIn_338_1 = 0;
        ie stackIn_339_0 = null;
        int stackIn_339_1 = 0;
        int stackIn_339_2 = 0;
        int stackIn_350_0 = 0;
        int stackIn_352_0 = 0;
        int stackIn_353_0 = 0;
        int stackIn_353_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        Throwable decompiledCaughtException = null;
        jb stackOut_4_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_9_0 = null;
        boolean stackOut_9_1 = false;
        ie stackOut_307_0 = null;
        int stackOut_307_1 = 0;
        int stackOut_307_2 = 0;
        ie stackOut_310_0 = null;
        int stackOut_310_1 = 0;
        int stackOut_310_2 = 0;
        int stackOut_310_3 = 0;
        ie stackOut_308_0 = null;
        int stackOut_308_1 = 0;
        int stackOut_308_2 = 0;
        int stackOut_308_3 = 0;
        ie stackOut_311_0 = null;
        int stackOut_311_1 = 0;
        int stackOut_311_2 = 0;
        int stackOut_311_3 = 0;
        ie stackOut_314_0 = null;
        int stackOut_314_1 = 0;
        int stackOut_314_2 = 0;
        int stackOut_314_3 = 0;
        int stackOut_314_4 = 0;
        ie stackOut_312_0 = null;
        int stackOut_312_1 = 0;
        int stackOut_312_2 = 0;
        int stackOut_312_3 = 0;
        int stackOut_312_4 = 0;
        Object stackOut_315_0 = null;
        String stackOut_315_1 = null;
        boolean stackOut_315_2 = false;
        int stackOut_315_3 = 0;
        Object stackOut_318_0 = null;
        String stackOut_318_1 = null;
        boolean stackOut_318_2 = false;
        int stackOut_318_3 = 0;
        int stackOut_318_4 = 0;
        Object stackOut_316_0 = null;
        String stackOut_316_1 = null;
        boolean stackOut_316_2 = false;
        int stackOut_316_3 = 0;
        int stackOut_316_4 = 0;
        ie stackOut_319_0 = null;
        int stackOut_319_1 = 0;
        int stackOut_319_2 = 0;
        ie stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        int stackOut_322_2 = 0;
        int stackOut_322_3 = 0;
        ie stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        int stackOut_320_2 = 0;
        int stackOut_320_3 = 0;
        ie stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        int stackOut_323_2 = 0;
        int stackOut_323_3 = 0;
        ie stackOut_326_0 = null;
        int stackOut_326_1 = 0;
        int stackOut_326_2 = 0;
        int stackOut_326_3 = 0;
        int stackOut_326_4 = 0;
        ie stackOut_324_0 = null;
        int stackOut_324_1 = 0;
        int stackOut_324_2 = 0;
        int stackOut_324_3 = 0;
        int stackOut_324_4 = 0;
        Object stackOut_327_0 = null;
        String stackOut_327_1 = null;
        boolean stackOut_327_2 = false;
        int stackOut_327_3 = 0;
        Object stackOut_330_0 = null;
        String stackOut_330_1 = null;
        boolean stackOut_330_2 = false;
        int stackOut_330_3 = 0;
        int stackOut_330_4 = 0;
        Object stackOut_328_0 = null;
        String stackOut_328_1 = null;
        boolean stackOut_328_2 = false;
        int stackOut_328_3 = 0;
        int stackOut_328_4 = 0;
        ie stackOut_331_0 = null;
        ie stackOut_334_0 = null;
        int stackOut_334_1 = 0;
        ie stackOut_332_0 = null;
        int stackOut_332_1 = 0;
        ie stackOut_335_0 = null;
        int stackOut_335_1 = 0;
        ie stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        int stackOut_338_2 = 0;
        ie stackOut_336_0 = null;
        int stackOut_336_1 = 0;
        int stackOut_336_2 = 0;
        int stackOut_349_0 = 0;
        int stackOut_352_0 = 0;
        int stackOut_352_1 = 0;
        int stackOut_350_0 = 0;
        int stackOut_350_1 = 0;
        Object var2_ref = null;
        var9 = field_N;
        try {
          L0: {
            L1: {
              if (sj.field_f != null) {
                stackOut_4_0 = sj.field_f;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = ch.field_h;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            var2_ref = stackIn_5_0;
            if (ci.k(-31077)) {
              L2: {
                stackOut_8_0 = var2_ref;
                stackIn_11_0 = (RuntimeException) ((Object) stackOut_8_0);
                stackIn_9_0 = (RuntimeException) ((Object) stackOut_8_0);
                if (null != sj.field_f) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L2;
                } else {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = gk.field_f;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1 ? 1 : 0;
                  break L2;
                }
              }
              ke.a((java.awt.Canvas) ((Object) stackIn_12_0), stackIn_12_1 != 0, true);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ef.field_c) {
                if (null != bh.field_d) {
                  i.a((java.awt.Canvas) (var2_ref), 0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (param0 == 4) {
                      break L3;
                    } else {
                      this.field_K = 119;
                      break L3;
                    }
                  }
                  var3 = 64;
                  mb.field_q.b(0, 0);
                  na.e(var3, 0, var3 - -512, 446);
                  wi.field_j.a(var3, eg.field_n);
                  wi.field_j.a(128 + var3, eg.field_n);
                  wi.field_j.a(var3 - -256, eg.field_n);
                  wi.field_j.a(384 + var3, eg.field_n);
                  var4 = i.field_a / 8 % 8;
                  var5_int = 0;
                  L4: while (true) {
                    if (640 <= var5_int) {
                      na.d();
                      pc.field_o.a(-pc.field_o.field_s + 640, 0);
                      pc.field_o.d(0, 0);
                      na.e(var3, 0, var3 + 512, 446);
                      var5_int = 0;
                      L5: while (true) {
                        if ((ua.field_b ^ -1) >= (var5_int ^ -1)) {
                          var5_int = 0;
                          L6: while (true) {
                            if ((vk.field_b ^ -1) >= (var5_int ^ -1)) {
                              L7: {
                                if (ka.field_o != null) {
                                  he.field_n[0].field_n = 3;
                                  he.field_n[1].field_n = 3;
                                  he.field_n[2].field_n = 3;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (null == ka.field_o) {
                                  break L8;
                                } else {
                                  if (ka.field_o.field_d) {
                                    vk.field_b = 3;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                na.d();
                                if (u.field_g) {
                                  L10: {
                                    if (vk.field_b != 1) {
                                      break L10;
                                    } else {
                                      if (-2 <= (he.field_n[0].field_n ^ -1)) {
                                        break L10;
                                      } else {
                                        he.field_n[0].field_n = 1;
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (-1 <= (vk.field_b ^ -1)) {
                                      break L11;
                                    } else {
                                      var5_int = 1;
                                      L12: while (true) {
                                        if ((he.field_n[0].field_n ^ -1) >= (var5_int ^ -1)) {
                                          break L11;
                                        } else {
                                          dg.field_a[0].b(8 * (var5_int * 2 - he.field_n[0].field_n) + var3 / 2, 0, param0 + -741572383, 32, var3 / 2 - -16);
                                          var5_int++;
                                          continue L12;
                                        }
                                      }
                                    }
                                  }
                                  L13: {
                                    if (-2 <= (vk.field_b ^ -1)) {
                                      break L13;
                                    } else {
                                      var5_int = 1;
                                      L14: while (true) {
                                        if (var5_int >= he.field_n[1].field_n) {
                                          break L13;
                                        } else {
                                          dg.field_a[1].b(640 + -(var3 / 2) + (-he.field_n[1].field_n + 2 * var5_int) * 8, 0, -741572379, 32, var3 / 2 - -16);
                                          var5_int++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  }
                                  if (2 >= vk.field_b) {
                                    break L9;
                                  } else {
                                    var5_int = 1;
                                    L15: while (true) {
                                      if ((he.field_n[2].field_n ^ -1) >= (var5_int ^ -1)) {
                                        break L9;
                                      } else {
                                        dg.field_a[2].b(8 * (var5_int * 2 - he.field_n[2].field_n) + var3 / 2, 0, -741572379, 32, 16 + var3 / 2 + 240);
                                        var5_int++;
                                        continue L15;
                                      }
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              L16: {
                                L17: {
                                  if (he.field_n[0].field_n <= 0) {
                                    break L17;
                                  } else {
                                    if (he.field_n[1].field_n <= 0) {
                                      break L17;
                                    } else {
                                      if ((he.field_n[2].field_n ^ -1) >= -1) {
                                        break L17;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                if (-1 != jk.field_q) {
                                  if (wj.field_e <= 255) {
                                    break L16;
                                  } else {
                                    L18: {
                                      L19: {
                                        if (4 == jk.field_q) {
                                          break L19;
                                        } else {
                                          if (5 == jk.field_q) {
                                            break L19;
                                          } else {
                                            if (6 != jk.field_q) {
                                              break L18;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                      eh.field_b = null;
                                      this.c(false, fa.field_c);
                                      break L18;
                                    }
                                    jk.field_q = -1;
                                    var5_int = 0;
                                    L20: while (true) {
                                      if (3 <= var5_int) {
                                        L21: {
                                          if (u.field_g) {
                                            L22: {
                                              u.field_g = false;
                                              if (null == ka.field_o) {
                                                ka.field_o = new mj();
                                                break L22;
                                              } else {
                                                ka.field_o.field_b = true;
                                                break L22;
                                              }
                                            }
                                            L23: {
                                              if (vk.field_b != 1) {
                                                break L23;
                                              } else {
                                                if ((kb.field_a ^ -1) < -1) {
                                                  ka.field_o.field_l = true;
                                                  break L23;
                                                } else {
                                                  ka.field_o.field_n = 11;
                                                  ka.field_o.field_e = true;
                                                  break L23;
                                                }
                                              }
                                            }
                                            if (rd.field_a) {
                                              var5_ref = jl.field_d;
                                              synchronized (var5_ref) {
                                                L24: {
                                                  ld.field_l.a(sd.field_mb, true, param0 ^ 98);
                                                  jl.field_d.d();
                                                  break L24;
                                                }
                                              }
                                              break L21;
                                            } else {
                                              break L21;
                                            }
                                          } else {
                                            break L21;
                                          }
                                        }
                                        vk.field_b = 3;
                                        ta.field_c = 1.0;
                                        break L16;
                                      } else {
                                        he.field_n[var5_int].a(true);
                                        var5_int++;
                                        continue L20;
                                      }
                                    }
                                  }
                                } else {
                                  L25: {
                                    var5_int = -1;
                                    if ((he.field_n[0].field_n ^ -1) < -1) {
                                      var5_int = 0;
                                      break L25;
                                    } else {
                                      break L25;
                                    }
                                  }
                                  L26: {
                                    if (-2 <= (vk.field_b ^ -1)) {
                                      break L26;
                                    } else {
                                      L27: {
                                        if (he.field_n[1].field_n <= 0) {
                                          break L27;
                                        } else {
                                          if (var5_int == -1) {
                                            var5_int = 1;
                                            break L27;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      if (-1 <= (he.field_n[1].field_n ^ -1)) {
                                        break L26;
                                      } else {
                                        if ((var5_int ^ -1) != -2) {
                                          var5_int = -1;
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  L28: {
                                    if (-3 <= (vk.field_b ^ -1)) {
                                      break L28;
                                    } else {
                                      L29: {
                                        if ((he.field_n[2].field_n ^ -1) >= -1) {
                                          break L29;
                                        } else {
                                          if ((var5_int ^ -1) != 0) {
                                            break L29;
                                          } else {
                                            var5_int = 2;
                                            break L29;
                                          }
                                        }
                                      }
                                      if ((he.field_n[2].field_n ^ -1) >= -1) {
                                        break L28;
                                      } else {
                                        if (-3 == (var5_int ^ -1)) {
                                          break L28;
                                        } else {
                                          var5_int = -1;
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                  L30: {
                                    if ((var5_int ^ -1) == 0) {
                                      break L30;
                                    } else {
                                      wj.field_e = 1;
                                      jk.field_q = var5_int;
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (3 != vk.field_b) {
                                      break L31;
                                    } else {
                                      if (-1 > (he.field_n[0].field_n ^ -1)) {
                                        break L31;
                                      } else {
                                        if (-1 > (he.field_n[1].field_n ^ -1)) {
                                          break L31;
                                        } else {
                                          if (he.field_n[2].field_n <= 0) {
                                            wj.field_e = 1;
                                            jk.field_q = 3;
                                            break L31;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L32: {
                                    if (2 != vk.field_b) {
                                      break L32;
                                    } else {
                                      if (-1 > (he.field_n[0].field_n ^ -1)) {
                                        break L32;
                                      } else {
                                        if (-1 <= (he.field_n[1].field_n ^ -1)) {
                                          jk.field_q = 3;
                                          wj.field_e = 1;
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                  }
                                  L33: {
                                    if (-2 != (vk.field_b ^ -1)) {
                                      break L33;
                                    } else {
                                      if (0 < he.field_n[0].field_n) {
                                        break L33;
                                      } else {
                                        L34: {
                                          wj.field_e = 1;
                                          jk.field_q = 4;
                                          if (ca.field_a[0] / 2 <= fa.field_c) {
                                            break L34;
                                          } else {
                                            jk.field_q = 6;
                                            break L34;
                                          }
                                        }
                                        if ((ca.field_a[0] ^ -1) > (fa.field_c ^ -1)) {
                                          jk.field_q = 5;
                                          break L33;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                  }
                                  break L16;
                                }
                              }
                              L35: {
                                if (-1 == jk.field_q) {
                                  break L35;
                                } else {
                                  if (!u.field_g) {
                                    break L35;
                                  } else {
                                    L36: {
                                      L37: {
                                        na.a(64, 0, 512, 480, 0, 64);
                                        if (-1 == (jk.field_q ^ -1)) {
                                          break L37;
                                        } else {
                                          if (jk.field_q == 1) {
                                            break L37;
                                          } else {
                                            if ((jk.field_q ^ -1) != -3) {
                                              break L36;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                      }
                                      var5_int = wj.field_e / 5 % 5 + jk.field_q * 6;
                                      pe.field_a[var5_int].b(320, 0, -741572379, 128, 240);
                                      break L36;
                                    }
                                    L38: {
                                      if ((jk.field_q ^ -1) != -4) {
                                        break L38;
                                      } else {
                                        var5_int = wj.field_e / 20 % 8;
                                        mc.field_b[var5_int].b(320, 0, -741572379, 128, 240);
                                        break L38;
                                      }
                                    }
                                    L39: {
                                      if (-5 != (jk.field_q ^ -1)) {
                                        break L39;
                                      } else {
                                        jc.field_n.b(320, 0, -741572379, 128, 240);
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      if (jk.field_q != 5) {
                                        break L40;
                                      } else {
                                        var5_int = wj.field_e / 5 % 5;
                                        va.field_d[var5_int].b(320, 0, -741572379, 128, 240);
                                        break L40;
                                      }
                                    }
                                    if (6 != jk.field_q) {
                                      break L35;
                                    } else {
                                      ph.field_b.b(320, 0, -741572379, 128, 240);
                                      break L35;
                                    }
                                  }
                                }
                              }
                              L41: {
                                if (!u.field_g) {
                                  L42: {
                                    na.a(var3, 0, 512, 480, 0, 112);
                                    if ((bk.field_c ^ -1) == -2) {
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                  L43: {
                                    if (3 != bk.field_c) {
                                      break L43;
                                    } else {
                                      break L43;
                                    }
                                  }
                                  L44: {
                                    if (bk.field_c == 2) {
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                  na.d();
                                  if (null == ka.field_o) {
                                    break L41;
                                  } else {
                                    if ((rj.field_j ^ -1) != 0) {
                                      break L41;
                                    } else {
                                      ka.field_o.a(23417);
                                      break L41;
                                    }
                                  }
                                } else {
                                  if (null == ka.field_o) {
                                    break L41;
                                  } else {
                                    if (0 != (rj.field_j ^ -1)) {
                                      break L41;
                                    } else {
                                      ka.field_o.a(23417);
                                      break L41;
                                    }
                                  }
                                }
                              }
                              L45: {
                                L46: {
                                  if (-2 == (vk.field_b ^ -1)) {
                                    break L46;
                                  } else {
                                    if (u.field_g) {
                                      break L45;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                                L47: {
                                  if ((he.field_n[0].field_n ^ -1) < -2) {
                                    he.field_n[0].field_n = 1;
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                }
                                if (u.field_g) {
                                  var5_int = od.field_f.b(ui.field_j + "100000");
                                  na.e(-4 + -(var5_int / 2) + 322, 451, 8 + (var5_int - 4), 26, 0);
                                  ve.a(30, 449, ig.field_d, (byte) -100, var5_int + 8, -(var5_int / 2) + 316);
                                  var6_int = od.field_f.b(ui.field_j + fa.field_c);
                                  var7 = od.field_f.b(ui.field_j);
                                  od.field_f.b(ui.field_j, 320 + -(var6_int / 2), 471, 16777215, -1);
                                  od.field_f.b(Integer.toString(fa.field_c), var7 + (320 + -(var6_int / 2)), 473, 16777215, -1);
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              L48: {
                                var5 = (ab) ((Object) ci.field_F.a((byte) -48));
                                if (var5 != null) {
                                  L49: {
                                    var7 = this.field_H;
                                    if ((var7 ^ -1) <= -81) {
                                      if (var7 < 230) {
                                        var6_int = 8;
                                        break L49;
                                      } else {
                                        var6_int = 123 - var7 / 2;
                                        break L49;
                                      }
                                    } else {
                                      var6_int = var7 / 2 - 32;
                                      break L49;
                                    }
                                  }
                                  na.b(4, var6_int - 4, 56 - -od.field_f.b(lj.field_b[var5.field_h]), 40, 0);
                                  na.b(5, var6_int + -3, od.field_f.b(lj.field_b[var5.field_h]) + 54, 38, 16741888);
                                  na.b(6, var6_int + -2, 52 + od.field_f.b(lj.field_b[var5.field_h]), 36, 0);
                                  ug.field_h[var5.field_h].b(8, var6_int, 32, 32);
                                  od.field_f.b(lj.field_b[var5.field_h], 47, var6_int + od.field_f.field_s, 0, 0);
                                  od.field_f.b(lj.field_b[var5.field_h], 48, od.field_f.field_s + (-1 + var6_int), 0, 0);
                                  od.field_f.b(lj.field_b[var5.field_h], 48, od.field_f.field_s + var6_int, 16746496, -1);
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                              L50: {
                                if (-1 == rj.field_j) {
                                  break L50;
                                } else {
                                  L51: {
                                    if ((rj.field_j ^ -1) == -3) {
                                      break L51;
                                    } else {
                                      if (-4 != (rj.field_j ^ -1)) {
                                        if ((rj.field_j ^ -1) == -1) {
                                          L52: {
                                            var6_ref = gk.field_e;
                                            var7 = 200 - -var6_ref.field_s;
                                            var8 = var6_ref.field_F - -var6_ref.field_x + 4;
                                            na.e(112, 190, 416, 64 + 5 * var8 + 20, 0);
                                            ve.a(84 + (5 * var8 - -6), 187, ig.field_d, (byte) -94, 422, 109);
                                            var6_ref.a(tc.field_q, 320, var7, 16777088, -1);
                                            stackOut_307_0 = (ie) (var6_ref);
                                            stackOut_307_1 = param0 ^ 0;
                                            stackOut_307_2 = 0;
                                            stackIn_310_0 = stackOut_307_0;
                                            stackIn_310_1 = stackOut_307_1;
                                            stackIn_310_2 = stackOut_307_2;
                                            stackIn_308_0 = stackOut_307_0;
                                            stackIn_308_1 = stackOut_307_1;
                                            stackIn_308_2 = stackOut_307_2;
                                            if (kb.field_a == 0) {
                                              stackOut_310_0 = (ie) ((Object) stackIn_310_0);
                                              stackOut_310_1 = stackIn_310_1;
                                              stackOut_310_2 = stackIn_310_2;
                                              stackOut_310_3 = 0;
                                              stackIn_311_0 = stackOut_310_0;
                                              stackIn_311_1 = stackOut_310_1;
                                              stackIn_311_2 = stackOut_310_2;
                                              stackIn_311_3 = stackOut_310_3;
                                              break L52;
                                            } else {
                                              stackOut_308_0 = (ie) ((Object) stackIn_308_0);
                                              stackOut_308_1 = stackIn_308_1;
                                              stackOut_308_2 = stackIn_308_2;
                                              stackOut_308_3 = 1;
                                              stackIn_311_0 = stackOut_308_0;
                                              stackIn_311_1 = stackOut_308_1;
                                              stackIn_311_2 = stackOut_308_2;
                                              stackIn_311_3 = stackOut_308_3;
                                              break L52;
                                            }
                                          }
                                          L53: {
                                            stackOut_311_0 = (ie) ((Object) stackIn_311_0);
                                            stackOut_311_1 = stackIn_311_1;
                                            stackOut_311_2 = stackIn_311_2;
                                            stackOut_311_3 = stackIn_311_3;
                                            stackIn_314_0 = stackOut_311_0;
                                            stackIn_314_1 = stackOut_311_1;
                                            stackIn_314_2 = stackOut_311_2;
                                            stackIn_314_3 = stackOut_311_3;
                                            stackIn_312_0 = stackOut_311_0;
                                            stackIn_312_1 = stackOut_311_1;
                                            stackIn_312_2 = stackOut_311_2;
                                            stackIn_312_3 = stackOut_311_3;
                                            if (fa.field_c == 0) {
                                              stackOut_314_0 = (ie) ((Object) stackIn_314_0);
                                              stackOut_314_1 = stackIn_314_1;
                                              stackOut_314_2 = stackIn_314_2;
                                              stackOut_314_3 = stackIn_314_3;
                                              stackOut_314_4 = 0;
                                              stackIn_315_0 = stackOut_314_0;
                                              stackIn_315_1 = stackOut_314_1;
                                              stackIn_315_2 = stackOut_314_2;
                                              stackIn_315_3 = stackOut_314_3;
                                              stackIn_315_4 = stackOut_314_4;
                                              break L53;
                                            } else {
                                              stackOut_312_0 = (ie) ((Object) stackIn_312_0);
                                              stackOut_312_1 = stackIn_312_1;
                                              stackOut_312_2 = stackIn_312_2;
                                              stackOut_312_3 = stackIn_312_3;
                                              stackOut_312_4 = 1;
                                              stackIn_315_0 = stackOut_312_0;
                                              stackIn_315_1 = stackOut_312_1;
                                              stackIn_315_2 = stackOut_312_2;
                                              stackIn_315_3 = stackOut_312_3;
                                              stackIn_315_4 = stackOut_312_4;
                                              break L53;
                                            }
                                          }
                                          L54: {
                                            ((ie) (Object) stackIn_315_0).a(he.a(stackIn_315_1, stackIn_315_2 != 0, stackIn_315_3 != 0, stackIn_315_4 != 0), 320, var7 + var8, 16777088, -1);
                                            stackOut_315_0 = this;
                                            stackOut_315_1 = qe.field_c;
                                            stackOut_315_2 = this.field_L;
                                            stackOut_315_3 = 320;
                                            stackIn_318_0 = stackOut_315_0;
                                            stackIn_318_1 = stackOut_315_1;
                                            stackIn_318_2 = stackOut_315_2;
                                            stackIn_318_3 = stackOut_315_3;
                                            stackIn_316_0 = stackOut_315_0;
                                            stackIn_316_1 = stackOut_315_1;
                                            stackIn_316_2 = stackOut_315_2;
                                            stackIn_316_3 = stackOut_315_3;
                                            if (-1 != (qf.field_b ^ -1)) {
                                              stackOut_318_0 = this;
                                              stackOut_318_1 = (String) ((Object) stackIn_318_1);
                                              stackOut_318_2 = stackIn_318_2;
                                              stackOut_318_3 = stackIn_318_3;
                                              stackOut_318_4 = 0;
                                              stackIn_319_0 = stackOut_318_0;
                                              stackIn_319_1 = stackOut_318_1;
                                              stackIn_319_2 = stackOut_318_2;
                                              stackIn_319_3 = stackOut_318_3;
                                              stackIn_319_4 = stackOut_318_4;
                                              break L54;
                                            } else {
                                              stackOut_316_0 = this;
                                              stackOut_316_1 = (String) ((Object) stackIn_316_1);
                                              stackOut_316_2 = stackIn_316_2;
                                              stackOut_316_3 = stackIn_316_3;
                                              stackOut_316_4 = 1;
                                              stackIn_319_0 = stackOut_316_0;
                                              stackIn_319_1 = stackOut_316_1;
                                              stackIn_319_2 = stackOut_316_2;
                                              stackIn_319_3 = stackOut_316_3;
                                              stackIn_319_4 = stackOut_316_4;
                                              break L54;
                                            }
                                          }
                                          L55: {
                                            discarded$2 = this.a(stackIn_319_1, stackIn_319_2, stackIn_319_3, stackIn_319_4 != 0, var7 - -(var8 * 3), (byte) 93, 13535232);
                                            stackOut_319_0 = (ie) (var6_ref);
                                            stackOut_319_1 = 59;
                                            stackOut_319_2 = 0;
                                            stackIn_322_0 = stackOut_319_0;
                                            stackIn_322_1 = stackOut_319_1;
                                            stackIn_322_2 = stackOut_319_2;
                                            stackIn_320_0 = stackOut_319_0;
                                            stackIn_320_1 = stackOut_319_1;
                                            stackIn_320_2 = stackOut_319_2;
                                            if (kb.field_a == 0) {
                                              stackOut_322_0 = (ie) ((Object) stackIn_322_0);
                                              stackOut_322_1 = stackIn_322_1;
                                              stackOut_322_2 = stackIn_322_2;
                                              stackOut_322_3 = 0;
                                              stackIn_323_0 = stackOut_322_0;
                                              stackIn_323_1 = stackOut_322_1;
                                              stackIn_323_2 = stackOut_322_2;
                                              stackIn_323_3 = stackOut_322_3;
                                              break L55;
                                            } else {
                                              stackOut_320_0 = (ie) ((Object) stackIn_320_0);
                                              stackOut_320_1 = stackIn_320_1;
                                              stackOut_320_2 = stackIn_320_2;
                                              stackOut_320_3 = 1;
                                              stackIn_323_0 = stackOut_320_0;
                                              stackIn_323_1 = stackOut_320_1;
                                              stackIn_323_2 = stackOut_320_2;
                                              stackIn_323_3 = stackOut_320_3;
                                              break L55;
                                            }
                                          }
                                          L56: {
                                            stackOut_323_0 = (ie) ((Object) stackIn_323_0);
                                            stackOut_323_1 = stackIn_323_1;
                                            stackOut_323_2 = stackIn_323_2;
                                            stackOut_323_3 = stackIn_323_3;
                                            stackIn_326_0 = stackOut_323_0;
                                            stackIn_326_1 = stackOut_323_1;
                                            stackIn_326_2 = stackOut_323_2;
                                            stackIn_326_3 = stackOut_323_3;
                                            stackIn_324_0 = stackOut_323_0;
                                            stackIn_324_1 = stackOut_323_1;
                                            stackIn_324_2 = stackOut_323_2;
                                            stackIn_324_3 = stackOut_323_3;
                                            if (0 == fa.field_c) {
                                              stackOut_326_0 = (ie) ((Object) stackIn_326_0);
                                              stackOut_326_1 = stackIn_326_1;
                                              stackOut_326_2 = stackIn_326_2;
                                              stackOut_326_3 = stackIn_326_3;
                                              stackOut_326_4 = 0;
                                              stackIn_327_0 = stackOut_326_0;
                                              stackIn_327_1 = stackOut_326_1;
                                              stackIn_327_2 = stackOut_326_2;
                                              stackIn_327_3 = stackOut_326_3;
                                              stackIn_327_4 = stackOut_326_4;
                                              break L56;
                                            } else {
                                              stackOut_324_0 = (ie) ((Object) stackIn_324_0);
                                              stackOut_324_1 = stackIn_324_1;
                                              stackOut_324_2 = stackIn_324_2;
                                              stackOut_324_3 = stackIn_324_3;
                                              stackOut_324_4 = 1;
                                              stackIn_327_0 = stackOut_324_0;
                                              stackIn_327_1 = stackOut_324_1;
                                              stackIn_327_2 = stackOut_324_2;
                                              stackIn_327_3 = stackOut_324_3;
                                              stackIn_327_4 = stackOut_324_4;
                                              break L56;
                                            }
                                          }
                                          L57: {
                                            ((ie) (Object) stackIn_327_0).a(ld.a((byte) stackIn_327_1, stackIn_327_2 != 0, stackIn_327_3 != 0, stackIn_327_4 != 0), 320, 32 + (var7 - -(3 * var8)), 16777088, -1);
                                            stackOut_327_0 = this;
                                            stackOut_327_1 = db.field_T;
                                            stackOut_327_2 = this.field_L;
                                            stackOut_327_3 = 320;
                                            stackIn_330_0 = stackOut_327_0;
                                            stackIn_330_1 = stackOut_327_1;
                                            stackIn_330_2 = stackOut_327_2;
                                            stackIn_330_3 = stackOut_327_3;
                                            stackIn_328_0 = stackOut_327_0;
                                            stackIn_328_1 = stackOut_327_1;
                                            stackIn_328_2 = stackOut_327_2;
                                            stackIn_328_3 = stackOut_327_3;
                                            if (qf.field_b != 1) {
                                              stackOut_330_0 = this;
                                              stackOut_330_1 = (String) ((Object) stackIn_330_1);
                                              stackOut_330_2 = stackIn_330_2;
                                              stackOut_330_3 = stackIn_330_3;
                                              stackOut_330_4 = 0;
                                              stackIn_331_0 = stackOut_330_0;
                                              stackIn_331_1 = stackOut_330_1;
                                              stackIn_331_2 = stackOut_330_2;
                                              stackIn_331_3 = stackOut_330_3;
                                              stackIn_331_4 = stackOut_330_4;
                                              break L57;
                                            } else {
                                              stackOut_328_0 = this;
                                              stackOut_328_1 = (String) ((Object) stackIn_328_1);
                                              stackOut_328_2 = stackIn_328_2;
                                              stackOut_328_3 = stackIn_328_3;
                                              stackOut_328_4 = 1;
                                              stackIn_331_0 = stackOut_328_0;
                                              stackIn_331_1 = stackOut_328_1;
                                              stackIn_331_2 = stackOut_328_2;
                                              stackIn_331_3 = stackOut_328_3;
                                              stackIn_331_4 = stackOut_328_4;
                                              break L57;
                                            }
                                          }
                                          L58: {
                                            discarded$3 = this.a(stackIn_331_1, stackIn_331_2, stackIn_331_3, stackIn_331_4 != 0, var8 / 2 + var7 - -(var8 * 4) - -32, (byte) 93, 13535232);
                                            stackOut_331_0 = (ie) (var6_ref);
                                            stackIn_334_0 = stackOut_331_0;
                                            stackIn_332_0 = stackOut_331_0;
                                            if ((fa.field_c ^ -1) == -1) {
                                              stackOut_334_0 = (ie) ((Object) stackIn_334_0);
                                              stackOut_334_1 = 0;
                                              stackIn_335_0 = stackOut_334_0;
                                              stackIn_335_1 = stackOut_334_1;
                                              break L58;
                                            } else {
                                              stackOut_332_0 = (ie) ((Object) stackIn_332_0);
                                              stackOut_332_1 = 1;
                                              stackIn_335_0 = stackOut_332_0;
                                              stackIn_335_1 = stackOut_332_1;
                                              break L58;
                                            }
                                          }
                                          L59: {
                                            stackOut_335_0 = (ie) ((Object) stackIn_335_0);
                                            stackOut_335_1 = stackIn_335_1;
                                            stackIn_338_0 = stackOut_335_0;
                                            stackIn_338_1 = stackOut_335_1;
                                            stackIn_336_0 = stackOut_335_0;
                                            stackIn_336_1 = stackOut_335_1;
                                            if ((kb.field_a ^ -1) == -1) {
                                              stackOut_338_0 = (ie) ((Object) stackIn_338_0);
                                              stackOut_338_1 = stackIn_338_1;
                                              stackOut_338_2 = 0;
                                              stackIn_339_0 = stackOut_338_0;
                                              stackIn_339_1 = stackOut_338_1;
                                              stackIn_339_2 = stackOut_338_2;
                                              break L59;
                                            } else {
                                              stackOut_336_0 = (ie) ((Object) stackIn_336_0);
                                              stackOut_336_1 = stackIn_336_1;
                                              stackOut_336_2 = 1;
                                              stackIn_339_0 = stackOut_336_0;
                                              stackIn_339_1 = stackOut_336_1;
                                              stackIn_339_2 = stackOut_336_2;
                                              break L59;
                                            }
                                          }
                                          ((ie) (Object) stackIn_339_0).a(rk.a(stackIn_339_1 != 0, stackIn_339_2 != 0, 4, false), 320, 64 + (var8 * 4 + var7), 16777088, -1);
                                          break L50;
                                        } else {
                                          break L50;
                                        }
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                  if (!jh.b(767564065)) {
                                    bh.field_d = lf.a(-77, 4);
                                    rj.field_j = -1;
                                    this.c(false, fa.field_c);
                                    break L50;
                                  } else {
                                    if (rj.field_j != 3) {
                                      this.field_K = 0;
                                      rj.field_j = 0;
                                      break L50;
                                    } else {
                                      rj.field_j = -1;
                                      break L50;
                                    }
                                  }
                                }
                              }
                              L60: {
                                if (!vc.d((byte) 119)) {
                                  if (g.a(false)) {
                                    L61: {
                                      stackOut_349_0 = 125;
                                      stackIn_352_0 = stackOut_349_0;
                                      stackIn_350_0 = stackOut_349_0;
                                      if (null == sj.field_f) {
                                        stackOut_352_0 = stackIn_352_0;
                                        stackOut_352_1 = 0;
                                        stackIn_353_0 = stackOut_352_0;
                                        stackIn_353_1 = stackOut_352_1;
                                        break L61;
                                      } else {
                                        stackOut_350_0 = stackIn_350_0;
                                        stackOut_350_1 = 1;
                                        stackIn_353_0 = stackOut_350_0;
                                        stackIn_353_1 = stackOut_350_1;
                                        break L61;
                                      }
                                    }
                                    ha.a(stackIn_353_0, stackIn_353_1 != 0);
                                    break L60;
                                  } else {
                                    break L60;
                                  }
                                } else {
                                  na.a(0, 0, 640, 480, 0, 128);
                                  na.e(-7 + -(hj.a(24777) / 2) + 320, 240 - (nd.a(-21065) / 2 + 8), 14 - -hj.a(24777), 16 + nd.a(-21065), 0);
                                  wi.a(ig.field_d, 12, 12, (byte) -126);
                                  break L60;
                                }
                              }
                              qi.a((java.awt.Canvas) (var2_ref), 0, 0, -25971);
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              he.field_n[var5_int].a(var5_int, false, var3);
                              var5_int++;
                              continue L6;
                            }
                          }
                        } else {
                          ua.field_c[var5_int].a(1, var3);
                          var5_int++;
                          continue L5;
                        }
                      }
                    } else {
                      var4 = (3 + var4) % 8;
                      ld.field_h[var4].b(var5_int, 0, -741572379, var5_int % 20 + 128, 414);
                      var5_int += 32;
                      continue L4;
                    }
                  }
                }
              } else {
                i.a((java.awt.Canvas) (var2_ref), 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "Bounce.U(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public Bounce() {
        this.field_K = 0;
        this.field_H = 0;
    }

    static {
        field_G = new tg(270, 70);
        field_A = new String[]{"INSTRUCTIONS", "Stay alive for as long as possible by avoiding the ceiling above and the furnace below.", "Press the escape key to leave the game.", "The movement keys are shown at the sides of the screen.", "Normal Platform", "Bouncy Platform", "Pushes you into the air. The height you bounce depends on your size.", "Cloudy Platform", "Vanishes from under you unless you are small.", "Moving Platform", "Rolls you in the direction shown.", "Growth Platform", "Makes you expand letting you squish other players, <br>but you move slower.", "Shrinking Platform", "Shrinks you letting you slide faster.", "Spikey Platform", "Gives you horns to attack with.", "Watch out for Spike the spike!", "<gt> ", "", "", " Volume ", "", "ACHIEVEMENTS", "New Achievements this game", "Achievements for all time"};
        field_F = 0;
    }
}
