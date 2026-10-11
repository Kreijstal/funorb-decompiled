/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ms extends ck {
    static ik field_u;
    private int field_t;
    private int field_l;
    private int field_m;
    private boolean field_s;
    private int field_p;
    private int field_k;
    private boolean field_n;
    private long field_w;
    static String field_q;
    private boolean field_o;
    private int field_v;
    String field_r;

    public static void g(byte param0) {
        field_q = null;
        field_u = null;
        if (param0 <= 97) {
          field_u = (ik) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        try {
          try {
            if (!this.d((byte) 105)) {
              return;
            }
            this.field_r = this.getCodeBase().getHost();
            var12 = this.field_r.toLowerCase();
            stackIn_8_1 = (var12.equals("jagex.com")) || (var12.endsWith(".jagex.com"));
            this.field_o = stackIn_8_1;
            this.field_l = Integer.parseInt(this.getParameter("gameport1"));
            this.field_k = Integer.parseInt(this.getParameter("gameport2"));
            if (param3 != 11127) {
              var10 = (String) null;
              this.a(39, -37, -125, 68, (String) null);
            }
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_v = Integer.parseInt(var7);
            }
            this.field_t = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_w = Long.parseLong(this.getParameter("instanceid"));
            this.field_n = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_m = Integer.parseInt(var8);
            }
            if (this.field_m >= 5) {
              this.field_m = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_p = Integer.parseInt(var9);
            }
            vla.field_s = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param4, this.field_t, 32, (byte) -119, param0, param1, param2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            var11 = (String) null;
            cv.a(1, (String) null, (Throwable) ((Object) var6));
            this.a("crash", (byte) -48);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref;
          stackIn_25_1 = new StringBuilder().append("ms.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final int q(int param0) {
        int var2;
        String var3;
        if (this.field_g) {
          return -1;
        }
        if (param0 != 11) {
          var3 = (String) null;
          this.a(-35, 117, 41, -64, (String) null);
        }
        if (!er.d(11154)) {
          return -1;
        }
        if (qe.field_l) {
          return -1;
        }
        var2 = mma.a(this.field_o, wk.a(true), 28, true, waa.a(true), this.field_p);
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0) {
          if (11 == jv.field_j &&
            bp.field_x == 0) {
            laa.b(118);
          }
        } else {
          if (1 == var2) {
            if (11 == jv.field_j &&
              bp.field_x == 0) {
              laa.b(118);
            }
          } else {
            if (!lna.field_f) {
              this.a("reconnect", (byte) -48);
            }
            ih.e(param0 ^ 1);
            ns.a(vt.field_m, -11, var2);
            qe.field_l = true;
            sja.field_hb = f.b((byte) 73) + 15000L;
          }
        }
        return var2;
    }

    private final void e(byte param0) {
        if (param0 != 0) {
          this.a(true, -29);
        }
        cl.field_p[1] = true;
    }

    final void b(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        int stackIn_103_0 = 0;
        boolean stackIn_104_1 = false;
        boolean stackIn_107_2 = false;
        int stackIn_140_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = BachelorFridge.field_y;
        if (null != qt.field_l) {
          if (null == kga.field_c) {
            var6 = vw.a(-1334);
            var4 = var6.getSize();
            qt.field_l.a(false, var4.width, var4.height);
          }
          qt.field_l.b((byte) 106);
        }
        hi.a(116);
        qh.b((byte) 117);
        if (!sn.c(94) &&
          11 != jv.field_j) {
          cv.d(-1);
        }
        if (null != sd.field_c) {
          vc.field_a = sd.field_c.a((byte) -127);
        }
        if (cia.a(0)) {
          var3 = 1200 * fda.a(0);
          if (this.field_s ||
            !(sma.e(30) <= var3) &&
            !(var3 >= jfa.e(-124))) {
            this.field_s = false;
            vc.a((byte) -65);
            ih.e(10);
            ns.a(bja.field_m, -11, 2);
            eka.c((byte) -69);
            qe.field_l = true;
            sja.field_hb = f.b((byte) 73) + 15000L;
          }
        }
        if (bp.field_x == -1 ||
          0 == bp.field_x) {
          stackIn_24_0 = (-1 != bp.field_x) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          bp.field_x = dba.b((byte) 72);
          if (var3Lifetime1 != 0 &&
            bp.field_x == 0 &&
            jv.field_j == 11 &&
            !er.d(11154)) {
            laa.b(121);
          }
          if (bp.field_x != -1 &&
            bp.field_x != 0) {
            sja.field_hb = f.b((byte) 73) + 15000L;
          }
        }
        if (-1 != bp.field_x &&
          bp.field_x != 0) {
          if (lk.field_r < 10) {
            if (bp.field_x == 3) {
              this.a("js5crc", (byte) -48);
            } else {
              if (bp.field_x == 4) {
                this.a("js5io", (byte) -48);
              } else {
                if (bp.field_x == 2) {
                  this.a("js5connect_full", (byte) -48);
                } else {
                  if (bp.field_x != 5) {
                    this.a("js5connect", (byte) -48);
                  } else {
                    this.a("outofdate", (byte) -48);
                  }
                }
              }
            }
          } else {
            if (10 <= jv.field_j) {
              ih.e(10);
              if (3 != bp.field_x) {
                if (bp.field_x == 4) {
                  ns.a(dc.field_u, -11, 256);
                } else {
                  if (bp.field_x == 2) {
                    ns.a(ct.field_r, -11, 256);
                  } else {
                    if (bp.field_x != 5) {
                      ns.a(gfa.field_g, -11, 256);
                    } else {
                      ns.a(cl.field_o, -11, 5);
                    }
                  }
                }
              } else {
                ns.a(mw.field_i, -11, 256);
              }
              qe.field_l = true;
            }
          }
        }
        if ((bp.field_x != -1 &&
          bp.field_x != 0 ||
          er.d(11154)) &&
          f.b((byte) 73) >= sja.field_hb) {
          qe.field_l = false;
          if (-1 != bp.field_x &&
            0 != bp.field_x) {
            bp.field_x = -1;
            waa.b(false);
          }
        }
        if (bp.field_x == 0 &&
          !er.d(11154)) {
          wk.field_b = false;
        }
        if (lk.field_r == 0 &&
          uf.a(109)) {
          lk.field_r = 1;
        }
        if (1 == lk.field_r) {
          if (0 != kt.field_k) {
            lh.field_s = daa.c(68, gq.field_z);
          }
          bv.field_B = rs.a(1, false, 0, true, ct.field_q);
          fi.field_n = rs.a(1, false, 0, true, mj.field_j);
          em.field_T = rs.a(1, false, 0, true, vaa.field_d);
          lk.field_r = 2;
          vfa.field_p = fi.field_n;
          mt.field_p = bv.field_B;
        }
        if (lk.field_r == 2) {
          if (lh.field_s != null &&
            lh.field_s.a(0)) {
            if (!lh.field_s.b("", false)) {
              lh.field_s = null;
            } else {
              if (lh.field_s.a("", 20637)) {
                u.a(false, lh.field_s);
                lh.field_s = null;
                mia.b(32);
              }
            }
          }
          if (lh.field_s == null) {
            lk.field_r = 3;
          }
        }
        if (3 == lk.field_r &&
          us.a(fi.field_n, bv.field_B, em.field_T, 76) &&
          vd.a((byte) 89, em.field_T)) {
          sr.a(48);
          ut.d(-124);
          lia.field_i = false;
          mp.field_p = ema.field_Ab;
          aw.a(vs.field_c, -12472, em.field_T, bv.field_B, fi.field_n);
          if (ww.field_p ||
            nj.field_i != null) {
            stackIn_103_0 = -6;
            stackIn_104_1 = !(ww.field_p);
            stackIn_107_2 = !(ww.field_p);
            vma.$cfr$intArgs$a$842e35442ba4(stackIn_103_0, stackIn_104_1, stackIn_107_2, nj.field_i);
          }
          if (vla.field_s) {
            nt.e((byte) 88);
          }
          if (null == dla.field_l) {
            dla.field_l = cda.a(0);
            de.field_E = rma.b(1);
          }
          re.a(de.field_E, dla.field_l, em.field_T, false);
          em.field_T = null;
          bv.field_B = null;
          fi.field_n = null;
          rh.a(19007, (java.applet.Applet) (this));
          mia.b(32);
          lk.field_r = 10;
        }
        if (10 == lk.field_r) {
          if (kt.field_k != 0) {
            nha.field_c = daa.c(124, ov.field_c);
          }
          lk.field_r = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (lk.field_r == 11) {
          if (nha.field_c != null && (!nha.field_c.a(0) ||
            !nha.field_c.b((byte) 99))) {
            dea.a(kh.a(nha.field_c, (byte) -57, gq.field_G, rj.field_q), 0.0f, 120);
            decompiledFrameRemainder0 = false;
          }
          else {
            lk.field_r = 12;
            ed.field_a = true;
          }
        }
        if (lk.field_r == 12 &&
          !ed.field_a) {
          lk.field_r = 13;
        }
        if (param0 > -12) {
          this.k(10);
        }
        if (lk.field_r == 13) {
          var3Lifetime2 = 1;
          if (null != ql.field_t) {
            stackIn_140_0 = (!ql.field_t.a((byte) 49)) ? 0 : 1;
            var3Lifetime2 = stackIn_140_0;
            dea.a(ql.field_t.field_d, ql.field_t.field_b, 115);
          }
          if (var3Lifetime2 != 0) {
            lk.field_r = 20;
          }
        }
        if (!param1 &&
          daa.field_vb) {
          wd.a((byte) 70, dca.field_y);
          this.a(44);
          nl.a(dca.field_y, (byte) 106);
        }
        if (cl.field_p[8]) {
          qfa.i(8);
        }
    }

    private final void j(int param0) {
        String var2 = sm.e(-45);
        if (param0 != -1) {
          return;
        }
        jia.a(var2, param0 - 103, nia.d(param0 - 31767));
    }

    final static sna n(int param0) {
        if (param0 < 48) {
          return (sna) null;
        }
        return ae.a(true);
    }

    final void a(boolean param0) {
        int stackIn_31_0 = 0;
        boolean stackIn_32_1 = false;
        int var2;
        gs var3;
        int var4;
        var4 = BachelorFridge.field_y;
        var2 = ri.field_a;
        if (64 > var2 &&
          cl.field_p[var2]) {
          if (0 == var2) {
            return;
          }
          L1: {
            switch (var2) {
              case 7:
                this.j(-1);
                break;
              case 8:
                cda.a(dw.field_f, ig.field_m, ju.field_r, true);
                break;
              case 16:
                jja.b(-1048576);
                break;
              default:
                if (var2 != 11 &&
                  var2 != 12) {
                  switch (var2) {
                    case 13:
                      rd.c((byte) -111);
                      break L1;
                    case 17:
                      this.k(10);
                      break L1;
                    case 18:
                      nja.a(118);
                      break L1;
                    default:
                      cv.a(1, "MGS1: " + nia.d((byte) -113), (Throwable) null);
                      vc.a((byte) -72);
                      break L1;
                  }
                }
                stackIn_31_0 = -10183;
                stackIn_32_1 = (var2 == 12);
                var3 = via.a(stackIn_31_0, stackIn_32_1);
                fda.a(var3, 3100);
                break;
              case 6:
                wda.a((byte) 116);
                break;
              case 5:
                qfa.h(-63);
                break;
              case 4:
                eha.c(-64);
                break;
              case 3:
                sh.l(-71);
                break;
              case 2:
                ola.c((byte) -60);
                break;
              case 1:
                p.c(-84);
                break;
            }
          }
          if (!param0) {
            this.field_s = true;
          }
          return;
        }
        cv.a(1, "MGS2: " + nia.d((byte) -96), (Throwable) null);
        vc.a((byte) -70);
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.a(true, true);
        if (param6) {
          this.e((byte) 0);
        }
        if (param0) {
          this.p(-108);
        }
        if (param4) {
          this.m(4);
        }
        if (param5) {
          this.o(-25800);
        }
        if (param1 != 62) {
          this.field_l = -78;
        }
        if (param3) {
          this.h(123);
        }
        if (param2) {
          this.i(-2);
        }
    }

    private final void m(int param0) {
        cl.field_p[param0] = true;
    }

    private final void i(int param0) {
        if (param0 != -2) {
          return;
        }
        cl.field_p[13] = true;
        cl.field_p[12] = true;
        cl.field_p[11] = true;
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          Exception var6 = null;
          lu var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var5Lifetime2;
          int var5Lifetime3;
          var9 = BachelorFridge.field_y;
          var4 = vea.a(8192, vc.field_a, kt.field_k, param0);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5 = sp.a(kla.e(52), false, ti.a(-22));
            if (var5 != -1) {
              oha.a(vd.field_B, var5, 4, vt.field_m);
              vd.field_B = null;
              vt.field_m = null;
            }
            var12 = nma.b(true);
            if (var12 != null) {
              vq.a((byte) -64, var12.booleanValue());
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = dha.a(lha.a((byte) -89), (byte) 53, waa.a(true), jc.f(-24457), tt.e(21240), this.field_p, wk.a(true));
            if (var5Lifetime1 != -1) {
              fv.a(true, var5Lifetime1, vt.field_m, vd.field_B);
              vt.field_m = null;
              vd.field_B = null;
            }
          }
          if (var4 == 3) {
            if (-1 != bp.field_x &&
              0 != bp.field_x) {
              bp.field_x = -1;
              waa.b(false);
            }
            if (!param2) {
              var5Lifetime2 = mma.a(this.field_o, wk.a(true), 5, false, waa.a(true), this.field_p);
              if (var5Lifetime2 != -1) {
                if (var5Lifetime2 != 0) {
                  ns.a(vt.field_m, -11, var5Lifetime2);
                  vt.field_m = null;
                } else {
                  om.field_v = gha.field_a;
                  laa.b(-122);
                  qo.field_c = false;
                  jv.field_j = 10;
                }
              }
            } else {
              qe.field_l = false;
            }
          }
          if (var4 == 4) {
            if (vs.field_c) {
              dp.a(nia.d(-31768), -99);
            } else {
              jv.field_j = 10;
              qo.field_c = true;
            }
          }
          if (var4 == 5) {
            dh.a(nia.d(-31768), 56);
          }
          if (var4 == 6 &&
            lia.field_i) {
            jv.field_j = 10;
          }
          if (var4 == 7) {
            gma.a(nia.d(-31768), false);
          }
          if (var4 == 8) {
            dp.a(nia.d(-31768), -80);
          }
          if (var4 == 9) {
            lha.a(nia.d(-31768), -17672);
          }
          if (var4 == 10) {
            sja.field_fb.c(17, (byte) 127);
          }
          if (var4 == 11) {
            qfa.a(nia.d(-31768), -61);
          }
          if (var4 == 12) {
            eea.a((byte) 127, mg.d(320), nia.d(-31768));
          }
          var5Lifetime3 = 110 / ((-1 - param1) / 57);
          if (var4 == 13) {
            try {
              if (lf.field_d == null) {
                lf.field_d = new tca(ju.field_r, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (lf.field_d.b((byte) 126)) {
                var7 = lf.field_d.a(-11514);
                if (var7 == null) {
                  var10 = (String) null;
                  ana.a(-1, (String) null);
                } else {
                  var8 = gt.a(0, var7.field_h, (byte) 104, var7.field_g);
                  ana.a(-1, var8);
                }
                lf.field_d = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              cv.a(1, "S1", (Throwable) ((Object) var6));
              var11 = (String) null;
              ana.a(-1, (String) null);
              lf.field_d = null;
            }
          }
          if (var4 == 15) {
            jv.field_j = 10;
          }
          if (16 == var4) {
            return 1;
          }
          if (17 == var4) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h(int param0) {
        cl.field_p[6] = true;
        if (param0 <= 80) {
          this.a(true);
        }
    }

    final int g(int param0) {
        int var2 = this.q(11);
        if (var2 == 0 ||
          var2 == 1) {
          if (cl.field_p[1]) {
            kda.a(-85, 2);
          }
          if (cl.field_p[2]) {
            ub.a(3, 1);
          }
          if (cl.field_p[3]) {
            rg.a(35, 4);
          }
          if (cl.field_p[4]) {
            tc.a(5, -16482);
          }
          if (cl.field_p[5]) {
            fk.c(-60, 6);
          }
          if (cl.field_p[6]) {
            vr.a((byte) 75, 7);
          }
          if (cl.field_p[8]) {
            ct.c(true);
          }
        }
        if (param0 < -61) {
          return var2;
        }
        return -92;
    }

    private final void a(boolean param0, boolean param1) {
        cl.field_p[3] = true;
        cl.field_p[0] = true;
        cl.field_p[18] = param1;
        cl.field_p[8] = param0;
        cl.field_p[17] = true;
        cl.field_p[16] = true;
        cl.field_p[7] = true;
    }

    private final void f(byte param0) {
        mfa.field_b[18] = 1;
        mfa.field_b[17] = -1;
        mfa.field_b[6] = -2;
        mfa.field_b[8] = -2;
        mfa.field_b[1] = 16;
        mfa.field_b[11] = -1;
        mfa.field_b[10] = -1;
        mfa.field_b[7] = -1;
        mfa.field_b[16] = -1;
        if (param0 == -115) {
          mfa.field_b[5] = -1;
          mfa.field_b[2] = -2;
          mfa.field_b[12] = -1;
          mfa.field_b[9] = -1;
          mfa.field_b[13] = -1;
          mfa.field_b[3] = -1;
          mfa.field_b[4] = -1;
          return;
        }
    }

    private final void k(int param0) {
        int discarded$0 = 0;
        int var2 = ig.field_m.b(16711935);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = dw.field_f - 1;
        byte[] var5 = new byte[var4];
        ig.field_m.b(var5, var4, 0, param0 - 31918);
        gja.a(var3 != 0, nia.d(-31768), qq.a(var5, false), 38);
        if (param0 != 10) {
          discarded$0 = this.a(false, 81, false);
        }
    }

    private final void o(int param0) {
        if (param0 != -25800) {
          this.field_k = -74;
        }
        cl.field_p[5] = true;
    }

    protected ms() {
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        kt.field_k = this.field_m;
        sr.a(kt.field_k, (byte) 78);
        vda.a(this.field_w, this.field_v, 5000, param0, param5, this.field_n, 5000, 64, ju.field_r, this.field_k, kt.field_k, this.field_r, this.field_t, this.field_l);
        cc.a(param0, this.field_r, -1456477592, this.field_k, this.field_l, ju.field_r, kt.field_k, this.field_v, this.field_t);
        wma.c((byte) 69);
        sd.field_c = qq.b(-5368);
        nl.a(dca.field_y, (byte) 76);
        mj.field_j = param6;
        if (param4) {
          this.o(62);
        }
        gq.field_z = param2;
        ov.field_c = param1;
        vaa.field_d = param7;
        ct.field_q = param3;
        this.f((byte) -115);
        ih.d(15366);
    }

    final void a(int param0, String param1, int param2) {
        try {
          if (param0 != -8771) {
            this.field_w = -116L;
          }
          this.a(640, param2, 480, param0 + 19898, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ms.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void l(int param0) {
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int var3;
        boolean stackIn_10_1 = false;
        var3 = BachelorFridge.field_y;
        if (gw.a((byte) 110)) {
          stackIn_10_1 = (kga.field_c != null);
          discarded$7 = this.a(stackIn_10_1, -89, false);
        } else {
          if (lk.field_r >= 10) {
            if (ad.d((byte) 38)) {
              if (jv.field_j != 0) {
                aca.a((byte) -118, vc.field_a);
              } else {
                discarded$8 = this.a(false, 113, false);
              }
            } else {
              ei.a((byte) -34);
            }
          }
        }
        if (param0 != 10) {
          discarded$9 = this.q(18);
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 > -14) {
          String var4 = (String) null;
          this.a(-85, (String) null, -60);
        }
        return this.a(param0, 76, true);
    }

    private final void p(int param0) {
        int discarded$0 = 0;
        cl.field_p[2] = true;
        if (param0 > -107) {
          discarded$0 = this.q(108);
        }
    }

    static {
        field_q = "End Phase";
    }
}
