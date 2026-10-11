/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class BachelorFridge extends ms {
    private boolean field_x;
    public static int field_y;

    private final void a(boolean param0, byte param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_112_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = field_y;
        try {
          boolean decompiledFrameRemainder2 = true;
          if (~ha.field_l == ~ha.field_k) {
            boolean decompiledFrameRemainder1 = true;
            if (!kha.field_f) {
              lo.a(75);
              kha.field_f = this.i((byte) -120);
              if ((kha.field_f) &&
                (decompiledFrameRemainder1 = (mg.field_m == null))) {
                if (!bp.e(-29919)) {
                  me.d((byte) -123);
                  decompiledFrameRemainder1 = (var8 != 0);
                }
                if (decompiledFrameRemainder1) {
                  uq.g((byte) 67);
                  decompiledFrameRemainder1 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                return;
              }
            }
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameRemainder0 = true;
            var3_int = 0;
            var4 = 0;
            if (!param0) {
              if (kaa.field_m == iba.field_s) {
                if (-1 != iba.field_s) {
                  if (iba.field_s != -3) {
                    if ((iba.field_s != -2) &&
                      (decompiledFrameRemainder0 = !(!tn.a(iba.field_s, 124)))) {
                      eg.field_p[iba.field_s].e(8456);
                      decompiledFrameRemainder0 = (var8 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      var3_int = 1;
                      decompiledFrameRemainder0 = (var8 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    gs.field_f.a(false, true);
                    while (kaa.b(127)) {
                      gs.field_f.b((byte) 94);
                      if (var8 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                    }
                    decompiledFrameRemainder0 = !(decompiledFrameCompleted2);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted2)) {
                  if (!hm.field_b) {
                    dj.field_c.a(true, false);
                    while (kaa.b(127)) {
                      dj.field_c.h(480);
                      if (var8 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                    }
                    decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted1)) {
                    var4 = 1;
                    var3_int = 1;
                    if ((var8 != 0) &&
                      (this.k((byte) -55))) {
                      rs.a(true);
                    }
                  }
                }
              } else {
                if (this.k((byte) -55)) {
                  rs.a(true);
                }
              }
            }
            if ((decompiledFrameCompleted2) && (decompiledFrameCompleted1) && (hm.field_b &&
              !bka.field_h &&
              !pha.field_a)) {
              if (vs.field_d &&
                lna.field_q) {
                var3_int = 0;
              }
              pma.a((byte) 122, var3_int != 0);
              if (gja.field_n) {
                sna.field_fb.a(var4 != 0, false);
              }
              if (vs.field_d &&
                dj.field_c != null) {
                uda.b(var4 != 0, 180, 320, 110);
                dj.field_c.a(var4 != 0, false);
              }
              while (kaa.b(127)) {
                if (wj.field_g) {
                  if (!vs.field_d) {
                    wb.a(13, 15, false, 12);
                  } else {
                    if (aka.a(12, 13, 15, (byte) -125)) {
                      continue;
                    }
                  }
                }
                if (null != sna.field_fb &&
                  gja.field_n) {
                  sna.field_fb.h(480);
                }
                if (null == dj.field_c) {
                  continue;
                }
                stackIn_112_0 = vs.field_d;
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (!stackIn_112_0) {
                  continue;
                }
                dj.field_c.h(480);
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_112_0 = hm.field_b;
            }
            if (!stackIn_112_0) {
              eia.b((byte) -116);
            }
            if (!wj.field_g) {
              if (!(0 >= jaa.field_q)) {
                jaa.field_q = jaa.field_q - 1;
                if ((var8 != 0) &&
                  (saa.field_b > jaa.field_q)) {
                  jaa.field_q = jaa.field_q + 1;
                }
              }
            } else {
              if (saa.field_b > jaa.field_q) {
                jaa.field_q = jaa.field_q + 1;
              }
            }
            var5 = saa.field_b * saa.field_b;
            var6 = var5 - jaa.field_q * jaa.field_q;
            var7 = 360 + 120 * var6 / var5;
            bka.a(-14305, var7);
            if (mka.field_f.b((byte) 90) != null) {
              fieldTemp$0 = t.field_v + 1;
              t.field_v = t.field_v + 1;
              if (fieldTemp$0 == 335) {
                t.field_v = 0;
                mka.field_f.a(false);
              }
            }
            decompiledFrameRemainder2 = (var8 != 0);
          }
          if (decompiledFrameRemainder2) {
            if (bt.field_s != ha.field_k) {
              if (jba.field_x != ha.field_k) {
                nm.field_A = nm.field_A - 1;
                decompiledFrameRemainder2 = (0 == nm.field_A);
                if (decompiledFrameRemainder2) {
                  ha.field_k = ha.field_l;
                  decompiledFrameRemainder2 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder2) {
                if (!bp.e(-29919)) {
                  mg.field_m = null;
                  me.d((byte) -125);
                  nh.b(-122);
                  kaa.field_m = taa.field_l;
                  if (ge.field_L) {
                    oq.a(false, false);
                  }
                  if (jl.field_r) {
                    lg.a(true, -4, false);
                  }
                  if (tn.a(kaa.field_m, 127)) {
                    rs.a(true);
                  }
                }
                ha.field_k = mj.field_i;
                decompiledFrameRemainder2 = (var8 != 0);
              }
            }
            if (decompiledFrameRemainder2) {
              nm.field_A = nm.field_A + 1;
              if (nm.field_A == 16) {
                if (ge.field_L) {
                  ft.c((byte) -41);
                  if (var8 != 0) {
                    wg.a(false);
                  }
                } else {
                  wg.a(false);
                }
                ha.field_k = jba.field_x;
              }
            }
          }
          if (14 != kaa.field_m) {
          }
          if (-4 == kaa.field_m) {
            sja.field_fb.c(9, (byte) 118);
            bka.field_h = true;
            kaa.field_m = iba.field_s;
            jaa.field_q = saa.field_b;
          }
          if (param1 < 86) {
            return;
          }
          if (kaa.field_m == -5) {
            rja.a(11, pw.field_w.f((byte) -62), 1);
            kaa.field_m = iba.field_s;
            pha.field_a = true;
          }
          jja.c(20757);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "BachelorFridge.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean k(byte param0) {
        int fieldTemp$1 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_25_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -55) {
            this.field_x = false;
          }
          var2_int = 32;
          if (iba.field_s == 0 &&
            -3 == kaa.field_m) {
            var2_int = 64;
            gs.field_f.a(false, false);
          }
          if (null != gs.field_f && (-3 == iba.field_s ||
            1 == iba.field_s) && kaa.field_m == 0) {
            var2_int = 64;
            gs.field_f.a(false, false);
          }
          fieldTemp$1 = tma.field_v + 1;
          tma.field_v = tma.field_v + 1;
          stackIn_25_0 = !(var2_int >= fieldTemp$1);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "BachelorFridge.G(" + param0 + ')');
        }
    }

    private final void a(float param0, boolean param1) {
        try {
          fla.field_r = param0;
          if (!param1) {
            this.a((byte) 111);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "BachelorFridge.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        int stackIn_69_0 = 0;
        boolean stackIn_70_1 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        ji var3 = null;
        int var3_int = 0;
        Runtime var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = field_y;
        try {
          var2 = pha.a(109);
          if (sn.c(83)) {
            bn.a(0, var2, gja.b(-16103));
            return;
          }
          if (!sg.field_r) {
            jq.a(var2, -128);
            return;
          }
          if (!cj.b(true)) {
            dea.a(rla.field_i, 100.0f, 116);
            jq.a(var2, -128);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!kha.field_f) {
            bea.e(117);
            decompiledFrameRemainder0 = (var6 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (kaa.field_m != iba.field_s) {
              this.h((byte) 103);
              if (var6 != 0) {
                cf.a(true, iba.field_s, vla.field_w, (byte) 46);
              }
            } else {
              cf.a(true, iba.field_s, vla.field_w, (byte) 46);
            }
            if (!vla.field_w ||
              !sia.field_h) {
              ji.a(aja.e(11), 62);
            }
            var3 = (ji) (mka.field_f.b((byte) 90));
            if (var3 != null) {
              var5 = t.field_v;
              if (80 <= var5) {
                if (var5 >= 230) {
                  var4 = -(var5 / 2) + 123;
                  if (var6 != 0) {
                    var4 = 8;
                    var4 = var5 / 2 - 32;
                  }
                } else {
                  var4 = 8;
                  if (var6 != 0) {
                    var4 = var5 / 2 - 32;
                  }
                }
              } else {
                var4 = var5 / 2 - 32;
              }
              dg.a(4, 8 + var4, aha.field_D.a(pp.field_g[var3.field_h]) + 56, aha.field_D.field_B + aha.field_D.field_u, 5, 0, 128);
              og.field_a[var3.field_h].d(8, var4);
              aha.field_D.c(pp.field_g[var3.field_h], 48, -2 + (8 + var4) + aha.field_D.field_u, 12320512, -1);
            }
            if (vs.a(23864)) {
              dg.g(0, 0, dg.field_i, dg.field_c);
              gla.a(-101, uma.field_J[0].field_p, uma.field_J[0].field_q, uma.field_J);
            }
            if (nba.b((byte) -125) &&
              !vs.a(23864) &&
              !paa.a(15000)) {
              dg.g(0, 0, dg.field_i, dg.field_c);
              bla.a(uma.field_J[0].field_q, uma.field_J, (byte) 15, uma.field_J[0].field_p);
            }
          }
          if (param0 < 1) {
            this.field_x = true;
          }
          if (!vs.a(23864) &&
            paa.a(15000)) {
            stackIn_69_0 = -1;
            if (null != kga.field_c) {
              stackIn_70_1 = true;
            } else {
              stackIn_70_1 = kt.field_i;
            }
            rla.$cfr$intArgs$a$7ffe4b125357(stackIn_69_0, stackIn_70_1);
          }
          if (ha.field_l != ha.field_k) {
            var3_int = nm.field_A * 256 / 16;
            if (var3_int > 0) {
              dg.f(0, 0, dg.field_i, dg.field_c, 0, var3_int);
            }
          }
          if (aha.field_D != null &&
            hea.field_r >= 2) {
            var3_ref = Runtime.getRuntime();
            var4Lifetime1 = (int)(var3_ref.totalMemory() - var3_ref.freeMemory()) >> 10;
            aha.field_D.c(pr.field_i + " fps; " + var4Lifetime1 + "KiB", 20, 20, 16777215, 0);
          }
          if (kha.field_f &&
            mk.field_p != -1 &&
            -1 != gd.field_m) {
            vv.field_c[kr.field_vb].e(mk.field_p - vv.field_c[kr.field_vb].field_t, gd.field_m - vv.field_c[kr.field_vb].field_u);
          }
          av.a(0, -106, var2, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "BachelorFridge.B(" + param0 + ')');
        }
    }

    private final void r(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != nha.field_c) {
            aha.a((byte) 54, nha.field_c);
            nha.field_c = null;
            mia.b(32);
          }
          fga.field_h = daa.c(param0 + 98, 3);
          vb.field_j = ifa.a(5, false, false, -78, false);
          wia.field_b = daa.c(-94, 6);
          aka.field_w = daa.c(param0 + 103, 7);
          uga.field_B = daa.c(param0 + 96, 8);
          fda.field_l = daa.c(param0 ^ 73, 9);
          tca.field_m = daa.c(param0 ^ 52, 10);
          fda.field_k = daa.c(83, param0);
          ria.field_i = daa.c(103, 12);
          pr.field_j = daa.c(-60, 13);
          iga.field_d = ifa.a(14, false, false, 114, false);
          wba.field_f = daa.c(107, 15);
          wb.field_l = daa.c(-127, 16);
          vd.field_y = daa.c(80, 17);
          fw.field_j = daa.c(68, 18);
          uda.field_U = daa.c(69, 19);
          rt.a(dca.field_y, (byte) 120, ju.field_r);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "BachelorFridge.N(" + param0 + ')');
        }
    }

    final void d(int param0) {
        boolean discarded$1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 76) {
            discarded$1 = this.i((byte) 56);
          }
          eia.a((byte) -15);
          if (kga.field_c != null) {
            lga.c((byte) 116);
          }
          jea.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "BachelorFridge.A(" + param0 + ')');
        }
    }

    private final void a(vr param0, byte param1, float param2, float param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fla.field_r = (float)param0.a(true) * (-param2 + param3) / 100.0f + param2;
          var5_int = 12 % ((param1 - 57) / 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("BachelorFridge.F(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public BachelorFridge() {
        this.field_x = false;
    }

    public final void init() {
        try {
          this.a(-8771, "bachelorfridge", 21);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "BachelorFridge.init()");
        }
    }

    private final void a(float param0, vr param1, float param2, int param3, String param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fla.field_r = (param2 - param0) * (float)param1.a(0, param4) / 100.0f + param0;
          if (param3 > -109) {
            this.field_x = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("BachelorFridge.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean j(byte param0) {
        fea dupTemp$0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        ee[] var3 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          th.a(25);
          if (!this.field_x) {
            if (vb.field_j.a(param0 - 7) &&
              vb.field_j.a("minimal", 20637)) {
              if ((wia.field_b.a(0) &&
                wia.field_b.a("minimal", 20637)) &&
                (decompiledFrameRemainder0 = (!(ria.field_i.a(param0 ^ 7)) ||
                !(ria.field_i.b((byte) 95))))) {
                dea.a(kh.a(ria.field_i, (byte) -57, kj.field_a, iea.field_b), 80.0f, 115);
                return false;
              }
              if (decompiledFrameRemainder0) {
                dea.a(ej.a(vb.field_j, kj.field_a, (byte) -12, "minimal", iea.field_b), 75.0f, param0 + 111);
                return false;
              }
            }
            if (decompiledFrameRemainder0) {
              dea.a(ej.a(vb.field_j, kj.field_a, (byte) -12, "minimal", iea.field_b), 75.0f, 118);
              return false;
            }
          }
          this.field_x = true;
          var2 = wia.field_b.a((byte) 123, "smallfont", "minimal");
          var3 = bla.a(param0 ^ 29612, "minimal", "smallfont", vb.field_j);
          dupTemp$0 = qm.a(var3, var2, 0);
          aha.field_D = dupTemp$0;
          jha.field_g = dupTemp$0;
          hfa.field_z = ll.a(var2, -8659, var3);
          fn.field_n = qca.a(var2, 1, false, var3, 0, 0);
          fn.field_n.field_M = bfa.field_c;
          iu.a(-1638641311, ria.field_i);
          qha.a(124, vb.field_j);
          if (param0 != 7) {
            this.field_x = true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "BachelorFridge.H(" + param0 + ')');
        }
    }

    final void b(int param0) {
        mfa.b(0);
        jr.a(86);
        fo.a(-15135);
        ri.a(false);
        vc.a(-96);
        sv.a(24173);
        jb.b();
        wi.b(true);
        ji.a(125);
        eaa.b(7);
        ga.a((byte) -123);
        og.a((byte) 16);
        gj.p(-1);
        saa.d((byte) -128);
        us.b(12745);
        iw.a(-119);
        db.a(0);
        ml.a((byte) 63);
        vm.a((byte) -87);
        kb.a(92);
        v.a(-203);
        pj.a(96);
        vr.b(-19779);
        oja.a(-32341);
        dj.a((byte) -75);
        cba.a((byte) -44);
        ck.e(-12132);
        dl.d((byte) -39);
        pn.a((byte) -60);
        dg.a();
        gr.b(12653);
        pb.d();
        i.a((byte) -122);
        au.a(-31824);
        ms.g((byte) 109);
        gi.a(101);
        tca.a((byte) -84);
        nn.a(0);
        sca.b((byte) -33);
        po.a();
        vda.a((byte) -62);
        lu.d((byte) -19);
        f.a(true);
        um.a((byte) 106);
        vw.b(7130);
        rt.a((byte) -91);
        ka.a((byte) 40);
        dt.a((byte) -125);
        im.a((byte) -66);
        gs.a(0);
        jn.a(-22089);
        oma.a((byte) 51);
        tn.a(0);
        qm.a(0);
        qha.a(124);
        kg.a((byte) 36);
        qe.a((byte) 93);
        jla.b(true);
        da.a(-47);
        mu.a(9072);
        bw.b((byte) 127);
        dga.a((byte) -97);
        jd.a((byte) 89);
        lda.a((byte) -127);
        oaa.a(-3681);
        tb.a(-7778);
        fba.a(2);
        hi.a((byte) 97);
        sna.e((byte) -110);
        uha.g((byte) 110);
        ema.f(0);
        eu.a(false);
        rf.b(-67);
        vaa.a(-1);
        tja.a(8192);
        mba.a(-90);
        eo.c((byte) 114);
        st.a((byte) 120);
        rp.e((byte) 104);
        tea.q(10462);
        hga.o(8405024);
        sja.o(33);
        dka.a(26727);
        ph.j(31826);
        hh.b(-1);
        qh.a(23312);
        ed.a(69);
        lr.a(34);
        jca.a(-8270);
        ie.a(0);
        tw.a(97);
        to.a(53);
        is.a(12836);
        hs.a((byte) -127);
        pf.l(-6199);
        rk.c((byte) 114);
        tj.a((byte) -114);
        nha.a(-18307);
        it.d(119);
        jfa.c(false);
        m.a((byte) 113);
        w.a(66);
        vi.a(-117);
        gma.a(-5377);
        on.e(-29639);
        go.e(98);
        lt.b((byte) -104);
        ae.a(30317);
        ala.a(-84);
        cw.h(-41);
        pna.f(1);
        ok.f(7576);
        ik.a((byte) 38);
        uq.f(87);
        oda.b(14124);
        kca.a((byte) 32);
        lm.a((byte) -52);
        fja.a(6220);
        pga.a(470);
        rfa.a((byte) -101);
        ss.a();
        rba.a(-52);
        il.a(4);
        lf.b(123);
        ina.f((byte) -101);
        lna.a((byte) 126);
        qaa.b(false);
        ec.a(-29584);
        dma.a(false);
        mda.a(15);
        dq.a(-19100);
        wba.a(-96);
        iga.a(false);
        dn.a(-114);
        ko.a((byte) -73);
        we.a((byte) -124);
        ola.d((byte) -120);
        jna.a(30862);
        uf.a((byte) 24);
        d.d((byte) 7);
        op.e((byte) 53);
        bia.a(56);
        pja.a((byte) -120);
        dba.a((byte) 62);
        dfa.a(false);
        wia.b(788454);
        as.a((byte) 121);
        wo.c((byte) 96);
        pu.c((byte) 123);
        or.c((byte) -77);
        kj.a((byte) -110);
        vs.b(10530);
        aj.a(76);
        ng.c(-621);
        pfa.b(false);
        fs.c((byte) -59);
        ad.c(false);
        mk.a(1);
        ua.a(-9);
        cl.b(false);
        in.b(-1);
        qfa.g(97);
        ta.a(255);
        se.f(103);
        fp.d(12);
        fg.a((byte) 127);
        gg.a((byte) -106);
        cga.b(true);
        kn.b(50);
        id.b(35);
        fh.c((byte) 73);
        vga.b();
        jja.c((byte) -90);
        kc.a((byte) 94);
        rm.a(-101);
        ti.b(3);
        lc.c(false);
        jm.c((byte) 107);
        pp.c((byte) -75);
        bf.c((byte) -79);
        vg.c((byte) 97);
        rv.b(-4);
        ib.a(-102);
        paa.b(2);
        ve.d((byte) -45);
        rha.c(-62);
        lw.a(true);
        cia.c((byte) -96);
        vca.a(488250252);
        ii.b(-225);
        md.b(28075);
        sq.c();
        qi.a(10);
        jt.b(true);
        ula.a(0);
        nl.a(-85);
        pv.a(-15565);
        gba.i(2);
        wl.f(0);
        lha.a(1);
        mq.a(213);
        rma.c(1);
        en.a(-10132);
        ur.a(107);
        cr.a(21592);
        nu.a(76);
        pca.a();
        bv.a(98);
        rh.a(0);
        oe.a(false);
        nv.f(20038);
        cc.a((byte) -122);
        wk.a(-24);
        jc.e(127);
        hr.a(true);
        rda.a(true);
        g.c((byte) -124);
        eka.a(123);
        un.a(2);
        sda.a();
        dv.c();
        mga.b();
        hm.a(-123);
        em.o(-22799);
        gha.a((byte) -124);
        ai.a(22309);
        ma.a(0);
        iea.a(24166);
        cla.a(-60);
        eea.a((byte) -79);
        ls.a(-118);
        vl.a((byte) 91);
        fka.a(-2779);
        sd.a(0);
        nca.a((byte) 87);
        sea.a((byte) -78);
        wd.c(1);
        via.a(1);
        vv.b(0);
        wj.c(1023);
        hfa.g(-81);
        am.c(true);
        vf.j(-99);
        vd.i(20742);
        rna.a(7);
        gk.a(false);
        qw.a((byte) -119);
        pda.e(-3);
        pha.a(true);
        ru.b(42);
        uka.b((byte) 81);
        lba.a((byte) -68);
        bi.d((byte) -97);
        ge.e((byte) -111);
        vn.k(-9063);
        lka.g((byte) -127);
        uda.n(114);
        de.a(1);
        dd.a(0);
        aha.b(true);
        nf.d((byte) -127);
        dia.a(14213);
        bfa.a(true);
        iaa.a((byte) 93);
        jea.a(1);
        sr.b((byte) 127);
        eia.a(124);
        pr.a(-96);
        qb.d(124);
        kma.e(-1);
        qo.a(3);
        oa.f(116);
        qg.a(4096);
        co.a(true);
        faa.a((byte) -113);
        gl.d(-44);
        uma.m(-30829);
        lq.a(71);
        sh.e((byte) -92);
        lla.d((byte) 0);
        sha.b(3);
        sa.b(0);
        ena.b(false);
        qt.b(-29205);
        gca.c((byte) 113);
        oq.a((byte) -47);
        aa.b(-124);
        ld.b(true);
        qs.b(-5232);
        wm.b(false);
        ds.b(-1182);
        qba.b(2753);
        ll.d((byte) 63);
        gd.d((byte) -49);
        wv.b(-91);
        gn.d((byte) -66);
        ep.b(1);
        jf.b(0);
        di.d((byte) -53);
        vj.b(106);
        dja.b(-14190);
        hp.a(-107);
        oc.b(32586);
        sb.b(2630);
        sla.a((byte) 52);
        aq.a((byte) -125);
        kaa.d((byte) 114);
        he.d((byte) 119);
        rw.a((byte) -121);
        hv.a(false);
        bha.d((byte) 60);
        r.b(-1);
        mn.b(102);
        ij.d((byte) 123);
        fr.d((byte) 3);
        sn.b(-103);
        wja.d((byte) -106);
        jka.b(11178);
        nda.b(-110);
        ol.d((byte) -123);
        p.b(0);
        cp.a(64);
        uv.e((byte) -12);
        pe.d(-33);
        ig.d(0);
        jia.b(false);
        cd.d(0);
        ska.e((byte) 20);
        afa.d(103);
        ada.d(-15840);
        wq.d(110);
        et.d(-61);
        qa.b(false);
        jh.d(4096);
        bh.e((byte) -93);
        sk.d(-124);
        wt.d(19564);
        an.f((byte) 86);
        ag.d(108);
        jq.b(true);
        rc.d(-2);
        aea.d(106);
        sj.d(0);
        wla.d(1);
        hda.e(122);
        gt.d(-118);
        ama.e((byte) -118);
        ef.b(false);
        oj.e((byte) -116);
        fn.f((byte) 121);
        qna.e((byte) -106);
        dc.b(true);
        qea.a(-454605656);
        qk.d(89);
        lfa.e((byte) -128);
        qca.d(-98);
        dm.b((byte) -100);
        gla.a((byte) -62);
        wha.a(-1);
        ou.b(-124);
        ul.b(false);
        bc.a();
        tq.c(-15298);
        raa.h(2);
        re.h(-124);
        du.a(8192);
        oea.g(-8333);
        uca.a(false);
        kda.a(-1);
        ao.a((byte) -44);
        ca.c(-64);
        if (param0 <= 49) {
          return;
        }
        try {
          ov.c(-5);
          gb.b(-22615);
          ne.a(18072);
          cq.c((byte) 67);
          ff.c(16777215);
          pka.a(-8155);
          oka.b((byte) 115);
          cm.c(-75);
          pt.a(65);
          hl.h(2);
          gu.a(true);
          nea.f(18178);
          ap.a(54);
          kka.a(-1);
          n.a((byte) 103);
          qia.b(-127);
          bs.a(122);
          af.a(9680);
          eq.a(0);
          ft.d((byte) -73);
          ika.a(true);
          si.a(-28415);
          kga.a(15238);
          hja.a((byte) 124);
          rs.a(2);
          qc.a((byte) 80);
          oha.b(-256);
          t.c((byte) -107);
          tv.a(true);
          hd.d(1);
          a.c(16763049);
          gfa.a(17733);
          nla.a(false);
          dha.a(true);
          gw.a(25354);
          cea.a(65536);
          su.a(true);
          ho.a(82);
          mka.b(false);
          mc.a(-57);
          lga.b(-4);
          kha.a(-118);
          kr.f(-127);
          uu.f((byte) 20);
          fj.c((byte) 22);
          kja.b(1900);
          hk.a(true);
          ot.b((byte) -91);
          bd.c((byte) -124);
          jda.a(0);
          es.b(true);
          nq.c((byte) -115);
          at.a(5849);
          iha.d(111);
          cj.a(-51);
          ida.b(true);
          qf.d(28766);
          taa.d((byte) -41);
          fu.d((byte) 70);
          fha.d((byte) 9);
          wn.d(10);
          cb.d((byte) 106);
          iu.e(-15434);
          gm.b(false);
          df.c(15);
          td.b(false);
          bca.c(15);
          ew.d(16776);
          ana.d((byte) 127);
          ra.d(11919);
          hia.d((byte) -74);
          fl.b(false);
          ek.d(8);
          vla.f((byte) -103);
          mv.e((byte) 126);
          rea.c((byte) -108);
          fga.a(false);
          sia.c(10371);
          uea.c((byte) -113);
          bu.c(123);
          jha.c((byte) 126);
          eda.c(60);
          fa.c(117);
          ip.c((byte) -36);
          nd.a(false);
          nj.c(256);
          qla.c(-24);
          dw.a(false);
          bma.d((byte) -102);
          aca.c(-111);
          bn.c(109);
          pi.a(false);
          oia.c(126);
          mw.c(16);
          jj.b(false);
          hw.b(false);
          mj.b((byte) 87);
          gaa.d(350);
          ub.d(1);
          iia.a(1314859432);
          ej.b(0);
          oca.d((byte) -122);
          tga.a(-111);
          ow.a(-1);
          lv.d((byte) -47);
          wp.b(80);
          fi.d((byte) -80);
          bg.b(5);
          bja.a(-10744);
          ns.a(-11);
          iv.a(-124);
          lia.d((byte) 42);
          qq.a(5);
          cn.e((byte) 85);
          bj.d((byte) -13);
          rla.d((byte) 29);
          ela.d((byte) 80);
          sl.d((byte) 116);
          bm.d((byte) 3);
          ro.a(101);
          o.e((byte) -7);
          dh.d((byte) -78);
          fda.d((byte) 25);
          ic.b(false);
          kq.d((byte) -91);
          kt.a(-23401);
          mh.a(-15947);
          pea.e((byte) 116);
          jk.d((byte) -115);
          dla.a(1097);
          jma.d(24831);
          eg.c((byte) -72);
          fia.c(false);
          jw.d(32);
          c.a(-20330);
          wa.d((byte) -74);
          wb.d(10046);
          li.d(-46);
          dp.d(-114);
          nia.b(false);
          cha.d(-30518);
          bda.d(-18);
          dea.d(-35);
          iq.d((byte) -106);
          sc.d(-31258);
          lh.b(-12847);
          ha.c(true);
          jv.c((byte) 79);
          ut.b(-8696);
          gja.c(4177);
          hba.e((byte) 92);
          ba.f((byte) -45);
          ql.c((byte) -74);
          uj.d((byte) 20);
          jba.d(-128);
          kw.c((byte) 80);
          uaa.c((byte) -126);
          wda.a(4);
          kna.a(36);
          ona.f(1);
          aja.b(-50);
          ug.c((byte) 10);
          qd.c((byte) 81);
          laa.d(false);
          ni.b(-83);
          ia.c(300);
          uc.c((byte) -102);
          vma.b(-93);
          vu.c((byte) 106);
          lo.a((byte) -93);
          rg.a(0);
          gea.b(4096);
          fm.a(101);
          bga.b(false);
          mla.a((byte) 93);
          tt.e((byte) 84);
          wg.d(22753);
          el.f((byte) -24);
          hna.d(99);
          hka.d(-111);
          hb.d(-98);
          kf.b((byte) 110);
          aia.c((byte) -127);
          pk.c(-106);
          fw.a(-8668);
          uw.f(6144);
          tl.d((byte) -89);
          fv.e((byte) -35);
          gka.e(-3);
          mr.c(0);
          cu.d(32);
          mi.d((byte) -119);
          ak.d((byte) 52);
          pw.d(-124);
          tg.b(1);
          jl.d(-17509);
          maa.e((byte) 72);
          sw.c(true);
          mna.d((byte) 125);
          hha.g(0);
          ria.a(127);
          fla.c(-36);
          pba.d(-1);
          nna.f((byte) 121);
          io.b(-125);
          hla.d(-72);
          vea.e((byte) 65);
          ifa.b(80);
          ju.e((byte) -67);
          kla.d(119);
          vk.d((byte) 110);
          wf.e(2);
          dk.b(-19353);
          pm.e(-38);
          qn.c((byte) 108);
          h.d((byte) 45);
          bk.e(25);
          bt.d(-17811);
          gp.d(-13837);
          sm.d(-1);
          vq.e((byte) 123);
          eha.b(-1452);
          cma.b(false);
          nh.c((byte) 98);
          nt.e(4);
          fb.c((byte) -91);
          fna.c(false);
          ui.c(true);
          wfa.c(false);
          uga.f((byte) 21);
          dr.c(true);
          wga.d((byte) -69);
          lb.f((byte) 39);
          vfa.b(-14431);
          bea.d(true);
          lma.g(-1111);
          ts.c(true);
          lca.d((byte) -113);
          bna.d(-61);
          eb.c((byte) -48);
          tba.d(9);
          gf.a(false);
          mp.b(95);
          uk.d(-36);
          sg.c((byte) 113);
          ps.d((byte) -102);
          cka.d(-26);
          nw.c(false);
          cja.d(-23353);
          la.d(2);
          dca.e((byte) -87);
          te.c(35);
          tp.e((byte) -75);
          oga.d(-98);
          er.f((byte) -120);
          fq.c((byte) 127);
          fk.e((byte) 49);
          cf.a(0);
          aka.e((byte) -95);
          dda.a(false);
          hea.c(-116);
          rn.d(119);
          baa.g(-122);
          mja.b(78);
          oo.d((byte) -85);
          nm.e(25280);
          mg.e(-62);
          mt.b(1687);
          nb.d(-103);
          eja.e(101);
          kk.d(19691);
          bp.e((byte) 119);
          ud.c(false);
          ica.d((byte) -113);
          aw.e((byte) 26);
          hj.c((byte) -96);
          l.d((byte) -119);
          tma.c(false);
          ija.b(-4);
          rb.d((byte) -36);
          mea.f(121);
          ffa.c(22533);
          rl.b(0);
          me.d(100);
          od.b(false);
          wc.c((byte) 126);
          jaa.d(-100);
          cca.d(75);
          ch.c(14);
          vh.e((byte) -3);
          vt.b(0);
          b.b(5910);
          ja.b(0);
          oi.f(-6887);
          uba.b(0);
          ln.d(4);
          kea.b(-26857);
          tla.c(false);
          fd.d(0);
          rr.f(-13421);
          ci.b(-115);
          jga.d(0);
          ki.e(-1);
          wh.b(0);
          nma.d(-1);
          bla.b(42);
          pg.d(0);
          nr.e(1);
          vka.d((byte) -107);
          lp.d((byte) 84);
          sma.e((byte) -40);
          ob.c(0);
          qga.c((byte) -87);
          ct.d((byte) -118);
          gq.b(false);
          ce.e((byte) 120);
          vo.a((byte) -128);
          nga.a(-20804);
          rj.b((byte) -122);
          vb.a(-126);
          fe.a(-127);
          rga.a((byte) -84);
          this.field_r = null;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "BachelorFridge.D(" + param0 + ')');
        }
    }

    private final void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (iba.field_s == 0 &&
            kaa.field_m == -3) {
            gb.a(tma.field_v << 2, 16777215);
            return;
          }
          if (gs.field_f != null && (iba.field_s == -3 ||
            iba.field_s == 1) && kaa.field_m == 0) {
            gb.a(-(tma.field_v << 2) + 256, 16777215);
            return;
          }
          if (param0 < 26) {
            return;
          }
          if (16 <= tma.field_v) {
            cf.a(false, kaa.field_m, sia.field_h, (byte) 47);
            kp.a(3959817, -tma.field_v + 32);
            if (field_y == 0) {
              return;
            }
          }
          cf.a(false, iba.field_s, vla.field_w, (byte) 61);
          kp.b(3959817, tma.field_v);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "BachelorFridge.M(" + param0 + ')');
        }
    }

    private final boolean i(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        ee[] var3 = null;
        kv[][] var4 = null;
        kv[][] var5 = null;
        int var6_int = 0;
        String[][] var6 = null;
        int var7 = 0;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        ee[] var3Lifetime1;
        ee[] var3Lifetime2;
        var7 = field_y;
        try {
          iha.e(5);
          th.a(25);
          if (aka.field_w != null) {
            if (mt.field_p.a(0) &&
              mt.field_p.a("basic", 20637)) {
              waa.a(0, 0);
              if (mt.field_p.a(0) &&
                mt.field_p.a("lobby", 20637)) {
                waa.a(0, 1);
                if (vfa.field_p.a(0) &&
                  vfa.field_p.a("lobby", 20637)) {
                  waa.a(0, 2);
                  if (aka.field_w.a(0) &&
                    aka.field_w.b((byte) 120)) {
                    waa.a(0, 3);
                    if (uga.field_B.a(0) &&
                      uga.field_B.b((byte) 105)) {
                      waa.a(0, 4);
                      if (fda.field_l.a(0) &&
                        fda.field_l.b((byte) 113)) {
                        waa.a(0, 5);
                        if (tca.field_m.a(0) &&
                          tca.field_m.b((byte) 120)) {
                          waa.a(0, 6);
                          if (vb.field_j.a(0) &&
                            vb.field_j.a("basic", 20637)) {
                            waa.a(0, 7);
                            if (vb.field_j.a(0) &&
                              vb.field_j.a("bacteria_components", 20637)) {
                              waa.a(0, 8);
                              if (wia.field_b.a(0) &&
                                wia.field_b.a("basic", 20637)) {
                                waa.a(0, 9);
                                if (ria.field_i.a(0) &&
                                  ria.field_i.b((byte) 123)) {
                                  waa.a(0, 10);
                                  if (uda.field_U.a(0) &&
                                    uda.field_U.b((byte) 106)) {
                                    waa.a(0, 11);
                                    if (vd.field_y.a(0) &&
                                      vd.field_y.b((byte) 115)) {
                                      waa.a(0, 12);
                                      if (fw.field_j.a(0) &&
                                        fw.field_j.b((byte) 118)) {
                                        waa.a(0, 13);
                                        if (pr.field_j.a(0) &&
                                          pr.field_j.b((byte) 104)) {
                                          waa.a(0, 14);
                                          if (fga.field_h.a(0) &&
                                            fga.field_h.b((byte) 120)) {
                                            waa.a(0, 15);
                                            if (iga.field_d.a(0) &&
                                              iga.field_d.b((byte) 113)) {
                                              waa.a(0, 16);
                                              if (wba.field_f.a(0) &&
                                                wba.field_f.b((byte) 100)) {
                                                waa.a(0, 17);
                                                if (wb.field_l.a(0) &&
                                                  wb.field_l.b((byte) 99)) {
                                                  waa.a(0, 18);
                                                  if (fda.field_k.a(0) &&
                                                    fda.field_k.b((byte) 101)) {
                                                    waa.a(0, 19);
                                                    of.b(108);
                                                    this.a(78.5999984741211f, true);
                                                    this.a((byte) 50);
                                                    waa.a(0, 20);
                                                    pu.a(tca.field_m, fda.field_l, -21201, aka.field_w, uga.field_B);
                                                    oe.a(230, (byte) 108);
                                                    ke.b(34);
                                                    aka.field_w = null;
                                                    this.a(81.0999984741211f, true);
                                                    waa.a(0, 21);
                                                    return false;
                                                  }
                                                  this.a(fda.field_k, (byte) -6, 78.5f, 78.5999984741211f);
                                                  return false;
                                                }
                                                this.a(wb.field_l, (byte) 110, 78.0999984741211f, 78.5f);
                                                return false;
                                              }
                                              this.a(wba.field_f, (byte) -62, 78.0f, 78.0999984741211f);
                                              return false;
                                            }
                                            this.a(iga.field_d, (byte) 110, 60.79999923706055f, 78.0f);
                                            return false;
                                          }
                                          this.a(fga.field_h, (byte) -7, 60.70000076293945f, 60.79999923706055f);
                                          return false;
                                        }
                                        this.a(pr.field_j, (byte) -108, 60.5f, 60.70000076293945f);
                                        return false;
                                      }
                                      this.a(fw.field_j, (byte) -121, 60.400001525878906f, 60.5f);
                                      return false;
                                    }
                                    this.a(vd.field_y, (byte) 109, 60.29999923706055f, 60.400001525878906f);
                                    return false;
                                  }
                                  this.a(uda.field_U, (byte) 120, 60.0f, 60.29999923706055f);
                                  return false;
                                }
                                this.a(ria.field_i, (byte) 127, 60.0f, 60.0f);
                                return false;
                              }
                              this.a(59.79999923706055f, wia.field_b, 60.0f, -113, "basic");
                              return false;
                            }
                            this.a(55.5f, vb.field_j, 59.79999923706055f, -119, "bacteria_components");
                            return false;
                          }
                          this.a(25.399999618530273f, vb.field_j, 55.5f, -121, "basic");
                          return false;
                        }
                        this.a(tca.field_m, (byte) 115, 23.299999237060547f, 25.399999618530273f);
                        return false;
                      }
                      this.a(fda.field_l, (byte) -100, 23.299999237060547f, 23.299999237060547f);
                      return false;
                    }
                    this.a(uga.field_B, (byte) -91, 0.8999999761581421f, 23.299999237060547f);
                    return false;
                  }
                  this.a(aka.field_w, (byte) -102, 0.6000000238418579f, 0.8999999761581421f);
                  return false;
                }
                this.a(0.5f, vfa.field_p, 0.6000000238418579f, -119, "lobby");
                return false;
              }
              this.a(0.20000000298023224f, mt.field_p, 0.5f, -115, "lobby");
              return false;
            }
            this.a(0.0f, mt.field_p, 0.20000000298023224f, -116, "basic");
            return false;
          }
          this.a(84.5999984741211f, true);
          waa.a(0, 22);
          if (null != wba.field_f) {
            ce.a(wba.field_f, 15);
            wba.field_f = null;
            return false;
          }
          this.a(84.9000015258789f, true);
          waa.a(0, 23);
          if (wb.field_l != null) {
            qla.d(-64);
            nw.a(wb.field_l, (byte) 2);
            mea.e(0);
            wb.field_l = null;
          }
          this.a(85.30000305175781f, true);
          waa.a(0, 24);
          if (null != uga.field_B) {
            this.a((byte) 100);
            uga.field_B = null;
            mia.b(32);
            return false;
          }
          this.a(85.9000015258789f, true);
          waa.a(0, 25);
          if (null != tca.field_m) {
            this.a((byte) 125);
            if (lha.b(18)) {
              tca.field_m = null;
            }
            mia.b(32);
            return false;
          }
          this.a(94.0999984741211f, true);
          waa.a(0, 26);
          if (iga.field_d != null) {
            pj.a(true, iga.field_d);
            iga.field_d = null;
            return false;
          }
          this.a(94.30000305175781f, true);
          waa.a(0, 27);
          if (null == wia.field_b) {
            this.a(99.0f, true);
            waa.a(0, 30);
            if (null != ria.field_i) {
              bka.a(ria.field_i, true);
              ria.field_i = null;
              return false;
            }
            this.a(99.30000305175781f, true);
            waa.a(0, 31);
            if (pr.field_j != null) {
              iia.a(-167571320, pr.field_j);
              pr.field_j = null;
              return false;
            }
            this.a(99.5999984741211f, true);
            waa.a(0, 32);
            if (fga.field_h != null) {
              ika.a((byte) 18, new il(fga.field_h.a((byte) 123, "huffman", "")));
              fga.field_h = null;
              mia.b(32);
              return false;
            }
            this.a(99.69999694824219f, true);
            waa.a(0, 33);
            ek.d((byte) -19);
            uw.g(-128);
            ju.field_r.a((java.awt.Component) ((Object) dca.field_y), false, 123);
            var2_int = 0;
            if (param0 >= -117) {
              return false;
            }
            do {
              if (var2_int >= 16) {
                iba.field_s = 0;
                kaa.field_m = 0;
                jca.a(50, -14350);
                ala.a(26219, wc.field_p);
                mia.b(32);
                waa.a(0, 34);
                tia.b(false);
                break;
              }
              eg.field_p[var2_int] = vfa.a(19341, var2_int);
              var2_int++;
            } while (var7 == 0);
            return true;
          }
          this.a((byte) 3);
          var2 = wia.field_b.a((byte) 123, "menufont", "basic");
          var3 = bla.a(29611, "basic", "menufont", vb.field_j);
          p.a(2, var2, 256);
          taa.field_u = hla.a(4676, var3, var2);
          kca.field_c = qca.a(var2, 2, false, var3, 0, 0);
          kca.field_c.field_M = bfa.field_c;
          dja.field_l = jr.a("basic", (byte) 110, vb.field_j, "fridgefont", wia.field_b);
          la.a(3, dja.field_l);
          kla.field_w = jr.a("basic", (byte) 124, vb.field_j, "smallfridgefont", wia.field_b);
          iia.a(kla.field_w, 1);
          fha.field_j = new String[2][2];
          kla.field_w.a(fu.field_l[0], new int[]{60}, fha.field_j[0]);
          kla.field_w.a(fu.field_l[1], new int[]{60}, fha.field_j[1]);
          var2Lifetime1 = wia.field_b.a((byte) 123, "tinyfont", "basic");
          var3Lifetime1 = bla.a(29611, "basic", "tinyfont", vb.field_j);
          ad.field_h = hl.a(16777215, (byte) 107, var3Lifetime1, 65793, var2Lifetime1);
          ad.field_h.field_M = ce.field_w;
          wt.field_k = hla.a(4676, var3Lifetime1, var2Lifetime1);
          g.field_g = vfa.a("midfont", vb.field_j, -50, "basic", wia.field_b);
          var2Lifetime2 = wia.field_b.a((byte) 123, "arenafont", "basic");
          var3Lifetime2 = bla.a(29611, "basic", "arenafont", vb.field_j);
          b.field_t = hl.a(16777215, (byte) 107, var3Lifetime2, 65793, var2Lifetime2);
          b.field_t.field_M = ce.field_w;
          fu.a(vb.field_j, false);
          uq.field_zb = an.a((byte) -127, vb.field_j, "basic", "generic_frame");
          uma.field_J = an.a((byte) -123, vb.field_j, "basic", "generic_frame");
          og.field_a = pi.a(vb.field_j, -8845, "basic", "achievements_large");
          ona.field_yb = hca.a("basic", mt.field_p, 71, "unachieved");
          rc.field_l = hca.a("basic", mt.field_p, 84, "orbcoin");
          ui.a((byte) -33, ona.field_yb);
          ui.a((byte) -33, rc.field_l);
          jb.a(new wi(vd.field_y, fw.field_j, uda.field_U, 32, false));
          sw.field_p = new kv(32, 32);
          sw.field_p.b();
          rc.field_l.e(0, 0, 32, 32);
          hga.field_U.a((byte) -97);
          rc.field_l = null;
          var4 = new kv[1 + ena.field_o.length][];
          var5 = new kv[1 + ena.field_o.length][];
          var6_int = 0;
          while (ena.field_o.length > var6_int) {
            if (null != ena.field_o[var6_int]) {
              var4[var6_int] = gw.a("basic", ena.field_o[var6_int], vb.field_j, -113);
              var5[var6_int] = null;
              if (var7 != 0) {
                var4[var6_int] = null;
                var5[var6_int] = null;
              }
            } else {
              var4[var6_int] = null;
              var5[var6_int] = null;
            }
            var6_int++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          var6 = lna.field_y;
          r.a(cma.field_y, -1, mt.field_p, lna.field_y, tj.field_c, jha.field_j, pt.field_b, 4, fda.field_k, vfa.field_p, var6, var4, true, var5, 5);
          nda.field_l = hca.a("basic", vb.field_j, -99, "lobby_game_logo");
          iw.a(200, (byte) -89);
          bca.a(-114, mt.field_p, vfa.field_p);
          vh.a(0, lga.field_n, 0, 16777215, 0, (java.applet.Applet) (this));
          vb.field_j = null;
          wia.field_b = null;
          vfa.field_p = null;
          mia.b(32);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "BachelorFridge.J(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        boolean stackIn_74_1 = false;
        boolean stackIn_120_0 = false;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        cfa var3_ref_cfa = null;
        int[] var3_ref_int__ = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        jna[] var4_ref_jna__ = null;
        pf var5_ref_pf = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = field_y;
        try {
          sma.e(30);
          md.field_l = jfa.e(-93);
          if (null != kga.field_c &&
            kga.field_c.field_f) {
            lga.c((byte) 108);
            hea.b(4);
          }
          stackIn_11_1 = -30;
          stackIn_12_2 = (null != kga.field_c);
          this.b(stackIn_11_1, stackIn_12_2);
          if (ed.field_a) {
            this.r(11);
            ed.field_a = false;
          }
          vr.field_b = vr.field_b + 1;
          var2_int = 89 % ((40 - param0) / 49);
          if (sn.c(63)) {
            if (!pw.field_z) {
              ju.field_r.a((java.awt.Component) ((Object) dca.field_y), true, 124);
              pw.field_z = true;
            }
            this.l(10);
            if (sn.c(106)) {
              return;
            }
          }
          if (sg.field_r && (sia.field_i != dca.field_y ||
            pw.field_z)) {
            ju.field_r.a((java.awt.Component) ((Object) dca.field_y), false, 124);
            sia.field_i = dca.field_y;
            pw.field_z = false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (sg.field_r) {
            if (!cj.b(true)) {
              bs.c((byte) -117);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (vs.a(23864)) {
                if (ha.field_k == ha.field_l) {
                  var3 = ib.a(true);
                  switch (var3) {
                    case 2:
                      lga.c((byte) 109);
                    default:
                      break;
                    case 4:
                      ge.field_L = true;
                      au.a(0, im.field_a, false);
                      if (var8 == 0) {
                        break;
                      }
                    case 3:
                      oq.a(true, false);
                      break;
                  }
                  this.a(true, (byte) 91);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.a(false, (byte) 93);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (paa.a(15000)) {
                  stackIn_74_1 = (kga.field_c != null);
                  var3 = this.a(stackIn_74_1, -48);
                  if (1 == var3 ||
                    var3 == 2) {
                    if (null != kga.field_c) {
                      lga.c((byte) 118);
                    }
                    if (var3 == 2) {
                      dh.a((java.applet.Applet) (this), 59);
                    }
                  }
                  this.a(true, (byte) 115);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (nba.b((byte) -99)) {
                    if (ha.field_l == ha.field_k) {
                      var3 = jk.d(2);
                      if (var3 == 1) {
                        jl.field_r = true;
                        au.a(0, gba.field_Ib, false);
                      }
                      this.a(true, (byte) 126);
                      decompiledFrameRemainder0 = (var8 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      this.a(false, (byte) 98);
                      if (var8 != 0) {
                        this.a(false, (byte) 125);
                        aca.a((byte) -118, vc.field_a);
                        if (this.j((byte) 7)) {
                          sg.field_r = true;
                        }
                      }
                    }
                  } else {
                    this.a(false, (byte) 125);
                    if (var8 != 0) {
                      aca.a((byte) -118, vc.field_a);
                      if (this.j((byte) 7)) {
                        sg.field_r = true;
                      }
                    }
                  }
                }
              }
            }
          } else {
            aca.a((byte) -118, vc.field_a);
            if (this.j((byte) 7)) {
              sg.field_r = true;
            }
          }
          L23: {
            boolean decompiledFrameCompleted0 = true;
            if (!bp.e(-29919)) {
              while (true) {
                var3_ref_cfa = (cfa) (tla.field_q.a(false));
                if (var3_ref_cfa == null) {
                  break;
                }
                rm.a(4, 122, var3_ref_cfa);
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              while (true) {
                stackIn_120_0 = uv.a((byte) 122, mfa.field_b);
                if (stackIn_120_0) {
                  stackIn_223_0 = ri.field_a;
                  stackIn_223_1 = 9;
                  if (var8 == 0) {
                    if (stackIn_223_0 == stackIn_223_1) {
                      rs.a(true);
                      bka.field_h = false;
                      kaa.field_m = 10;
                      fia.field_s = ig.field_m.g(-84);
                      continue;
                    }
                    if (ri.field_a == 14) {
                      rs.a(true);
                      dfa.a(150, ul.a(-58, 4), ul.a(-51, 2000), 0, jha.field_j, cma.field_y.length, mia.d((byte) -104), efa.c(true), 1024, ms.n(96));
                      eka.a(vv.a(31185), -83, jha.c(-31068));
                      wj.field_g = true;
                      hm.field_b = true;
                      bka.field_h = false;
                      kaa.field_m = -2;
                      ip.a((byte) 22, kaa.field_m);
                      tla.d(-91);
                      continue;
                    }
                    if (ri.field_a == 15) {
                      if (hm.field_b) {
                        rs.a(true);
                        ih.d((byte) -83);
                        fu.d(13042);
                        if (hp.field_c == -3) {
                          kj.b((byte) -88);
                          hp.field_c = 0;
                        } else {
                          vs.field_d = false;
                          gja.field_n = false;
                          kaa.field_m = 0;
                          sia.field_h = false;
                          nu.field_b = true;
                          ge.field_D = true;
                        }
                        hm.field_b = false;
                        rf.a(-128);
                      }
                      pha.field_a = false;
                      bka.field_h = false;
                      continue;
                    }
                    if (10 == ri.field_a &&
                      hm.field_b) {
                      sa.d(-7);
                      continue;
                    }
                    if (68 == ri.field_a) {
                      var3_ref_int__ = vv.a((byte) 124);
                      var4_ref_int__ = var3_ref_int__;
                      var5_ref_pf = ig.field_m;
                      var6 = ((lu) ((Object) var5_ref_pf)).b(16711935);
                      var7 = 0;
                      while (var6 > var7) {
                        var4_ref_int__[var7] = ((lu) ((Object) var5_ref_pf)).f(-111);
                        var7++;
                      }
                      var4_ref_int__ = var3_ref_int__;
                      var5_ref_int__ = sg.field_q;
                      var6 = 0;
                      while (var6 < 8) {
                        var4_ref_int__[var6] = dda.a(var4_ref_int__[var6], ~var5_ref_int__[var6]);
                        var6++;
                      }
                      if (dma.field_a) {
                        var4 = 0;
                        while (!(pp.field_g.length <= var4)) {
                          stackIn_120_0 = hp.a(var4, (byte) -66, var3_ref_int__);
                          if (stackIn_120_0) {
                            mka.field_f.a(new ji(var4), true);
                          }
                          var4++;
                        }
                      }
                      var4_ref_int__ = sg.field_q;
                      var5_ref_int__ = var3_ref_int__;
                      var6 = 0;
                      while (var6 < 8) {
                        var4_ref_int__[var6] = mp.a(var4_ref_int__[var6], var5_ref_int__[var6]);
                        var6++;
                      }
                      var4_ref_int__ = nga.field_i;
                      var5_ref_int__ = var3_ref_int__;
                      var6 = 0;
                      while (var6 < 8) {
                        var4_ref_int__[var6] = mp.a(var4_ref_int__[var6], var5_ref_int__[var6]);
                        var6++;
                      }
                      continue;
                    }
                    if (69 == ri.field_a) {
                      if (!kha.field_f) {
                        continue;
                      }
                      mg.field_m = new mu(ig.field_m);
                      rba.a(mg.field_m, (byte) 125);
                      ep.field_m = ig.field_m.e((byte) 65);
                      continue;
                    }
                    if (ri.field_a == 76) {
                      ig.field_m.a(3);
                      ig.field_m.a(3);
                      var3 = ig.field_m.b(16711935);
                      var4_ref_jna__ = new jna[var3];
                      var5 = 0;
                      while (var5 < var3) {
                        var4_ref_jna__[var5] = ima.a(ig.field_m, true);
                        var5++;
                      }
                      continue;
                    }
                    if (ri.field_a == 59) {
                      if (vs.field_d ||
                        gja.field_n) {
                        rs.a(true);
                        vs.field_d = false;
                        wma.field_b = 0;
                        gja.field_n = false;
                        kaa.field_m = -2;
                        wj.field_g = true;
                        sia.field_h = false;
                        nu.field_b = true;
                        rf.a(-128);
                      }
                      pha.field_a = false;
                      continue;
                    }
                    if (lo.b((byte) -102)) {
                      continue;
                    }
                    if (lfa.d(-124)) {
                      continue;
                    }
                    this.a(true);
                    continue;
                  }
                } else {
                  stackIn_223_0 = 0;
                  stackIn_223_1 = 96;
                }
                hna.a(stackIn_223_0, stackIn_223_1);
                break;
              }
            }
          }
          if (wj.field_g) {
            wma.field_b = 0;
          }
          if (er.d(11154)) {
            var3 = this.g(-127);
            if (0 == var3 ||
              var3 == 1) {
              if (1 == var3) {
                bka.field_h = true;
                pha.field_a = true;
              }
              if (1 != var3 ||
                var8 != 0) {
                if (iba.field_s != -3 &&
                  iba.field_s != 12) {
                  if (hm.field_b) {
                    nu.field_b = true;
                    ge.field_D = true;
                    sia.field_h = false;
                    if (!vs.field_d) {
                      lg.a(true, 0, false);
                      if (var8 != 0) {
                        fia.field_s = ck.field_f;
                        hb.a(2, 10, 0, false);
                      }
                    } else {
                      fia.field_s = ck.field_f;
                      hb.a(2, 10, 0, false);
                    }
                    rs.a(true);
                    eg.field_p[iba.field_s].a(false, 32);
                    hm.field_b = false;
                    gja.field_n = false;
                    vs.field_d = false;
                    rf.a(-128);
                    if (var8 != 0) {
                      nu.field_b = true;
                      sia.field_h = false;
                      lg.a(true, 0, false);
                    }
                  }
                } else {
                  nu.field_b = true;
                  sia.field_h = false;
                  lg.a(true, 0, false);
                }
                bka.field_h = false;
                pha.field_a = false;
              }}
            var4 = 0;
            if (2 == var3) {
              var4 = 1;
            }
            if (gs.field_f != null ||
              hm.field_b ||
              bka.field_h ||
              pha.field_a) {
              var4 = 1;
            }
            if (!er.d(11154)) {
              var4 = 0;
            }
            if (var4 != 0) {
              ih.e(10);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "BachelorFridge.C(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.a(70, 4, 0, 1, false, false, 2, 20);
          nja.field_a = 16711935;
          jc.field_t = 2603264;
          fa.field_f = 16777215;
          mt.field_v = 2603264;
          ru.field_c = 16711935;
          wk.field_f = 16777215;
          this.a(false, (byte) 62, true, true, false, false, false);
          mfa.field_b[64] = 1;
          mfa.field_b[63] = 1;
          mfa.field_b[57] = -2;
          mfa.field_b[79] = -2;
          mfa.field_b[9] = -1;
          mfa.field_b[58] = -2;
          mfa.field_b[61] = 4;
          mfa.field_b[84] = 1;
          mfa.field_b[65] = 1;
          if (param0 < 50) {
            this.field_x = true;
          }
          mfa.field_b[66] = 1;
          mfa.field_b[69] = -2;
          mfa.field_b[60] = 7;
          mfa.field_b[68] = -1;
          mfa.field_b[78] = -2;
          mfa.field_b[70] = 8;
          mfa.field_b[73] = -2;
          mfa.field_b[62] = -1;
          mfa.field_b[67] = 1;
          mfa.field_b[82] = -2;
          mfa.field_b[59] = 0;
          mfa.field_b[10] = -1;
          mfa.field_b[80] = -2;
          mfa.field_b[76] = -2;
          mfa.field_b[75] = 2;
          mfa.field_b[74] = -2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "BachelorFridge.K(" + param0 + ')');
        }
    }

    static {
    }
}
