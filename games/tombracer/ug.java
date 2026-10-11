/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug extends jna {
    private long field_w;
    private boolean field_A;
    private boolean field_y;
    private boolean field_q;
    private int field_s;
    String field_x;
    private int field_z;
    private int field_t;
    private static String[] field_r;
    private int field_u;
    private int field_p;
    private int field_v;

    final int t(int param0) {
        int var2;
        if (param0 != 8) {
          return 102;
        }
        var2 = this.e((byte) -46);
        if (var2 == 0 ||
          var2 == 1) {
          if (hd.field_a[1]) {
            ql.a(2, -28521);
          }
          if (hd.field_a[2]) {
            ki.b(false, 3);
          }
          if (hd.field_a[3]) {
            ua.b(4, 2);
          }
          if (hd.field_a[4]) {
            qda.a(5, -21);
          }
          if (hd.field_a[5]) {
            gw.b(param0 ^ -109, 6);
          }
          if (hd.field_a[6]) {
            mda.b(7, (byte) -105);
          }
          if (hd.field_a[8]) {
            nf.a((byte) 5);
          }
        }
        return var2;
    }

    private final void k(int param0) {
        if (param0 <= 95) {
          this.field_v = 64;
        }
        String var2 = dca.f(12);
        cc.a(55, di.a(78), var2);
    }

    private final void f(byte param0) {
        int var2 = vc.field_q.h(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = uca.field_d - 1;
        if (param0 != -15) {
          ug.n(39);
        }
        byte[] var5 = new byte[var4];
        vc.field_q.a(0, param0 - 103, var5, var4);
        eq.a(param0 ^ -16, di.a(param0 + 82), jaa.a((byte) 64, var5), var3 != 0);
    }

    final static boolean q(int param0) {
        if (param0 != -1) {
          ug.q(12);
        }
        return !ok.field_s ? true : false;
    }

    final void p(int param0) {
        int var2 = -114 / ((param0 - 66) / 34);
        hd.field_a[6] = true;
    }

    private final int a(byte param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          Exception var6 = null;
          uia var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var5Lifetime2;
          int var5Lifetime3;
          var9 = TombRacer.field_G ? 1 : 0;
          var4 = si.a(bg.field_t, pg.field_y, 103, param2);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5 = cha.a(pla.a(-1), sua.A(49), 2);
            if (-1 != var5) {
              ifa.a(dja.field_s, var5, io.field_b, (byte) 100);
              io.field_b = null;
              dja.field_s = null;
            }
            var12 = nw.e((byte) 78);
            if (var12 != null) {
              kb.a(2753, var12.booleanValue());
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = pe.a(vk.b(69), toa.a(false), hha.a(false), this.field_u, cs.a((byte) 105), cja.a(0), (byte) 53);
            if (var5Lifetime1 != -1) {
              ura.a(var5Lifetime1, dja.field_s, (byte) -103, io.field_b);
              dja.field_s = null;
              io.field_b = null;
            }
          }
          if (var4 == 3) {
            if (-1 != fsa.field_m &&
              fsa.field_m != 0) {
              fsa.field_m = -1;
              vja.b(true);
            }
            if (param1) {
              wta.field_G = false;
            } else {
              var5Lifetime2 = ila.a(this.field_q, cja.a(0), 50, this.field_u, cs.a((byte) 81), false);
              if (var5Lifetime2 != -1) {
                if (var5Lifetime2 == 0) {
                  ic.field_b = tr.field_g;
                  ak.g(0);
                  gda.field_c = 10;
                  qga.field_m = false;
                } else {
                  epa.a(var5Lifetime2, (byte) -84, io.field_b);
                  io.field_b = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (!ft.field_a) {
              qga.field_m = true;
              gda.field_c = 10;
            } else {
              cua.a((byte) -26, di.a(118));
            }
          }
          if (5 == var4) {
            hha.a(di.a(104), (byte) -117);
          }
          if (var4 == 6 &&
            sra.field_t) {
            gda.field_c = 10;
          }
          if (var4 == 7) {
            ft.a(89, di.a(113));
          }
          if (8 == var4) {
            cua.a((byte) -65, di.a(37));
          }
          if (9 == var4) {
            qea.a(di.a(104), -87);
          }
          if (var4 == 10) {
            ql.field_k.k(17, -2988);
          }
          if (11 == var4) {
            nt.a(di.a(41), -1978);
          }
          var5Lifetime3 = 70 / ((param0 + 35) / 35);
          if (var4 == 12) {
            jc.a(mn.g(-128), di.a(28), (byte) -74);
          }
          if (13 == var4) {
            try {
              if (ana.field_o == null) {
                ana.field_o = new caa(dsa.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ana.field_o.a(false)) {
                var7 = ana.field_o.b((byte) -123);
                if (var7 != null) {
                  var8 = nia.a(var7.field_g, 0, var7.field_h, 255);
                  nd.a(var8, -1);
                } else {
                  var10 = (String) null;
                  nd.a((String) null, -1);
                }
                ana.field_o = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              ssa.a("S1", (byte) 121, (Throwable) ((Object) var6));
              var11 = (String) null;
              nd.a((String) null, -1);
              ana.field_o = null;
            }
          }
          if (var4 == 15) {
            gda.field_c = 10;
          }
          if (16 == var4) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        this.a(rd.field_r.field_c, wla.field_Eb.field_c, gfa.field_l.field_c, dba.field_d.field_c, 5000, param1, rm.field_d.field_c, param2);
        if (param0 >= -25) {
          this.field_w = 116L;
        }
    }

    final void m(int param0) {
        int stackIn_24_0 = 0;
        boolean stackIn_25_1 = false;
        int var2;
        gqa var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = oka.field_z;
        if (param0 != -5) {
          this.field_z = 113;
        }
        if (var2 < 64 &&
          hd.field_a[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            bma.d((byte) 82);
          } else {
            if (var2 == 2) {
              voa.d(-95);
            } else {
              if (var2 == 3) {
                au.a(3);
              } else {
                if (var2 == 4) {
                  iv.f(0);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      vh.a((byte) -44);
                    } else {
                      if (var2 != 7) {
                        if (8 == var2) {
                          kq.a(uca.field_d, dsa.field_c, (byte) 72, vc.field_q);
                        } else {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                ri.e(14180);
                                return;
                              }
                              if (var2 == 17) {
                                this.f((byte) -15);
                                return;
                              }
                              if (var2 == 18) {
                                vta.c((byte) 101);
                                return;
                              }
                              ssa.a("MGS1: " + kk.a(32), (byte) 123, (Throwable) null);
                              dea.a(60);
                              return;
                            }
                            stackIn_24_0 = -18787;
                            stackIn_25_1 = (var2 == 12);
                            var3 = ila.a(stackIn_24_0, stackIn_25_1);
                            k.a((byte) 113, var3);
                          } else {
                            fq.a((byte) -68);
                          }
                        }
                      } else {
                        this.k(116);
                      }
                    }
                  } else {
                    rj.a(param0 + 9);
                  }
                }
              }
            }
          }
          return;
        }
        ssa.a("MGS2: " + kk.a(32), (byte) 120, (Throwable) null);
        dea.a(60);
    }

    private final int e(byte param0) {
        if (this.field_b) {
          return -1;
        }
        if (!uma.b(-1)) {
          return -1;
        }
        if (wta.field_G) {
          return -1;
        }
        int var2 = ila.a(this.field_q, cja.a(0), 50, this.field_u, cs.a((byte) -118), true);
        if (var2 == -1) {
          return -1;
        }
        if (0 == var2) {
          if (gda.field_c != 11) {
            return var2;
          }
          if (0 != fsa.field_m) {
            return var2;
          }
          ak.g(param0 + 46);
        } else {
          if (var2 != 1) {
            if (!fpa.field_c) {
              this.a(-6738, "reconnect");
            }
            dw.b(param0);
            epa.a(var2, (byte) -84, io.field_b);
            wta.field_G = true;
            oga.field_f = bva.b((byte) -107) + 15000L;
            return var2;
          }
          if (gda.field_c == 11 &&
            0 == fsa.field_m) {
            ak.g(param0 + 46);
          }
        }
        return var2;
    }

    final int a(int param0, boolean param1) {
        if (param0 > -26) {
          return 16;
        }
        return this.a((byte) 73, true, param1);
    }

    final void o(int param0) {
        hd.field_a[5] = true;
        if (param0 != 9822) {
          this.field_A = false;
        }
    }

    final void j(int param0) {
        hd.field_a[2] = true;
        if (param0 != -13) {
          this.field_t = -50;
        }
    }

    final void a(int param0, int param1) {
        this.a((byte) -86, param1, false);
        int var3 = 53 % ((param0 - 38) / 36);
    }

    public static void l(int param0) {
        field_r = null;
        if (param0 != -1) {
          field_r = (String[]) null;
        }
    }

    private final void i(int param0) {
        vca.field_c[11] = -1;
        vca.field_c[9] = -1;
        vca.field_c[5] = -1;
        vca.field_c[10] = -1;
        vca.field_c[6] = -2;
        vca.field_c[7] = -1;
        vca.field_c[4] = -1;
        vca.field_c[3] = -1;
        vca.field_c[12] = -1;
        vca.field_c[18] = 1;
        vca.field_c[1] = param0;
        vca.field_c[17] = -1;
        vca.field_c[16] = -1;
        vca.field_c[2] = -2;
        vca.field_c[8] = -2;
        vca.field_c[13] = -1;
    }

    final void d(byte param0) {
        hd.field_a[11] = true;
        hd.field_a[13] = true;
        hd.field_a[12] = true;
        if (param0 != 87) {
          this.field_u = 29;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        bg.field_t = this.field_z;
        pt.b(bg.field_t, (byte) 65);
        qea.a(this.field_s, this.field_v, dsa.field_c, this.field_p, this.field_x, this.field_t, 5000, param4, -1367135824, param7, this.field_A, bg.field_t, param5, this.field_w);
        av.a(bg.field_t, dsa.field_c, 103, this.field_x, this.field_v, param5, this.field_p, this.field_s, this.field_t);
        wka.b(520);
        tja.field_q = dka.a((byte) -86);
        fpa.a(nma.field_l, (byte) 75);
        bi.field_c = param2;
        nga.field_p = param3;
        tj.field_c = param6;
        fq.field_g = param1;
        fm.field_j = param0;
        this.i(16);
        ws.f(29320);
    }

    final void g(byte param0) {
        hd.field_a[4] = true;
        if (param0 >= -45) {
          this.s(120);
        }
    }

    final void a(int param0, int param1, int param2, String param3, int param4) {
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          try {
            if (!this.a((byte) 51)) {
              return;
            }
            this.field_x = this.getCodeBase().getHost();
            var6 = this.field_x.toLowerCase();
            if (param4 != 20575) {
              this.s(118);
            }
            stackIn_10_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_q = stackIn_10_1;
            this.field_p = Integer.parseInt(this.getParameter("gameport1"));
            this.field_t = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_s = Integer.parseInt(var7);
            }
            this.field_v = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_w = Long.parseLong(this.getParameter("instanceid"));
            this.field_A = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_z = Integer.parseInt(var8);
            }
            if (this.field_z >= 5) {
              this.field_z = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_u = Integer.parseInt(var9);
            }
            vv.field_r = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(false, param2, param1, param0, this.field_v, 32, param3);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            ssa.a((String) null, (byte) 126, (Throwable) ((Object) var6_ref));
            this.a(-6738, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("ug.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void n(int param0) {
        qoa.field_a = false;
        if (param0 != -18) {
          return;
        }
        wr.field_o = null;
        cia.field_a = null;
        ea.field_k = null;
        pm.field_d = null;
    }

    final void r(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 89) {
          ug.n(-80);
        }
        if (wua.c((byte) 49)) {
          discarded$1 = this.a((byte) -72, false, null != dq.field_f ? true : false);
        } else {
          if (cga.field_f < 10) {
          } else {
            if (!qk.i(250)) {
              pw.C(-5);
            } else {
              if (0 == gda.field_c) {
                discarded$3 = this.a((byte) -111, false, false);
              } else {
                tc.a(pg.field_y, -2886);
              }
            }
          }
        }
    }

    final void c(byte param0, boolean param1) {
        int stackIn_26_0 = 0;
        boolean stackIn_101_0 = false;
        boolean stackIn_104_1 = false;
        int stackIn_133_0 = 0;
        int var3;
        java.awt.Dimension var4_ref_java_awt_Dimension;
        int var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = TombRacer.field_G ? 1 : 0;
        if (null != wba.field_o) {
          if (null == dq.field_f) {
            var6 = tj.b(25128);
            var4_ref_java_awt_Dimension = var6.getSize();
            wba.field_o.a(var4_ref_java_awt_Dimension.width, false, var4_ref_java_awt_Dimension.height);
          }
          wba.field_o.a(false);
        }
        at.j(3321);
        uka.s((byte) -44);
        if (!wna.c(-112) &&
          gda.field_c != 11) {
          sw.h(100);
        }
        if (null != tja.field_q) {
          pg.field_y = tja.field_q.b(65);
        }
        if (o.e(540800)) {
          var3 = aqa.a(1188664449) * 1200;
          if (this.field_y ||
            !(rg.g((byte) 118) <= var3) &&
            !(var3 >= ada.b(false))) {
            this.field_y = false;
            dea.a(60);
            dw.b((byte) -84);
            epa.a(2, (byte) -84, th.field_n);
            bk.c(9033);
            wta.field_G = true;
            oga.field_f = 15000L + bva.b((byte) -107);
          }
        }
        if (fsa.field_m == -1 ||
          0 == fsa.field_m) {
          stackIn_26_0 = (fsa.field_m != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          fsa.field_m = si.A(61);
          if (var3Lifetime1 != 0 &&
            fsa.field_m == 0 &&
            gda.field_c == 11 &&
            !uma.b(-1)) {
            ak.g(0);
          }
          if (fsa.field_m != -1 &&
            fsa.field_m != 0) {
            oga.field_f = bva.b((byte) -107) + 15000L;
          }
        }
        if (-1 != fsa.field_m &&
          fsa.field_m != 0) {
          if (cga.field_f < 10) {
            if (fsa.field_m != 3) {
              if (fsa.field_m == 4) {
                this.a(-6738, "js5io");
              } else {
                if (fsa.field_m == 2) {
                  this.a(-6738, "js5connect_full");
                } else {
                  if (fsa.field_m != 5) {
                    this.a(-6738, "js5connect");
                  } else {
                    this.a(-6738, "outofdate");
                  }
                }
              }
            } else {
              this.a(-6738, "js5crc");
            }
          } else {
            if (gda.field_c >= 10) {
              dw.b((byte) -123);
              if (fsa.field_m != 3) {
                if (fsa.field_m != 4) {
                  if (fsa.field_m != 2) {
                    if (fsa.field_m != 5) {
                      epa.a(256, (byte) -84, wqa.field_H);
                    } else {
                      epa.a(5, (byte) -84, wq.field_a);
                    }
                  } else {
                    epa.a(256, (byte) -84, kka.field_r);
                  }
                } else {
                  epa.a(256, (byte) -84, uta.field_e);
                }
              } else {
                epa.a(256, (byte) -84, oe.field_l);
              }
              wta.field_G = true;
            }
          }
        }
        if ((fsa.field_m != -1 &&
          fsa.field_m != 0 ||
          uma.b(-1)) &&
          oga.field_f <= bva.b((byte) -107)) {
          wta.field_G = false;
          if (-1 != fsa.field_m &&
            fsa.field_m != 0) {
            fsa.field_m = -1;
            vja.b(true);
          }
        }
        if (fsa.field_m == 0 &&
          !uma.b(-1)) {
          rca.field_l = false;
        }
        if (cga.field_f == 0 &&
          ula.k((byte) -117)) {
          cga.field_f = 1;
        }
        if (cga.field_f == 1) {
          if (0 != bg.field_t) {
            nja.field_J = dd.a(nga.field_p, 1);
          }
          tk.field_b = sa.a(true, fq.field_g, false, 1, (byte) -95);
          hm.field_n = sa.a(true, bi.field_c, false, 1, (byte) -109);
          vc.field_p = sa.a(true, fm.field_j, false, 1, (byte) -79);
          cga.field_f = 2;
          oma.field_G = tk.field_b;
          ota.field_b = hm.field_n;
        }
        if (cga.field_f == 2) {
          if (null != nja.field_J &&
            nja.field_J.b(-79)) {
            if (nja.field_J.a("", 108)) {
              if (nja.field_J.c("", -127)) {
                jga.a((byte) -45, nja.field_J);
                nja.field_J = null;
                ea.a(-33);
              }
            } else {
              nja.field_J = null;
            }
          }
          if (null == nja.field_J) {
            cga.field_f = 3;
          }
        }
        if (cga.field_f == 3 &&
          esa.a(vc.field_p, tk.field_b, -128, hm.field_n) &&
          tt.a(vc.field_p, (byte) -53)) {
          ee.a(-1);
          eha.a((byte) -27);
          ura.field_b = nl.field_c;
          sra.field_t = false;
          cra.a(tk.field_b, hm.field_n, 1, ft.field_a, vc.field_p);
          if (ofa.field_I ||
            null != bma.field_s) {
            stackIn_101_0 = !(ofa.field_I);
            stackIn_104_1 = !(ofa.field_I);
            ag.a(stackIn_101_0, stackIn_104_1, false, bma.field_s);
          }
          if (vv.field_r) {
            aoa.b(true);
          }
          if (null == sma.field_c) {
            sma.field_c = epa.d((byte) -91);
            ci.field_k = fta.c(-93);
          }
          wk.a(sma.field_c, ci.field_k, 11861, vc.field_p);
          hm.field_n = null;
          tk.field_b = null;
          vc.field_p = null;
          vga.a((java.applet.Applet) (this), (byte) -128);
          ea.a(-33);
          cga.field_f = 10;
        }
        if (10 == cga.field_f) {
          if (bg.field_t != 0) {
            oqa.field_v = dd.a(tj.field_c, 1);
          }
          cga.field_f = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        var3Lifetime2 = 69 % ((param0 + 63) / 62);
        if (cga.field_f == 11) {
          if (oqa.field_v != null && (!oqa.field_v.b(-100) ||
            !oqa.field_v.a(0))) {
            ima.a(0.0f, vca.a(voa.field_s, hra.field_c, oqa.field_v, (byte) 92), -80);
            decompiledFrameRemainder0 = false;
          }
          else {
            lpa.field_w = true;
            cga.field_f = 12;
          }
        }
        if (12 == cga.field_f &&
          !lpa.field_w) {
          cga.field_f = 13;
        }
        if (cga.field_f == 13) {
          var4 = 1;
          if (null != lba.field_r) {
            stackIn_133_0 = (!lba.field_r.a((byte) 37)) ? 0 : 1;
            var4 = stackIn_133_0;
            ima.a(lba.field_r.field_i, lba.field_r.field_b, -65);
          }
          if (var4 != 0) {
            cga.field_f = 20;
          }
        }
        if (!param1 &&
          wla.field_Cb) {
          pq.a(nma.field_l, false);
          this.b((byte) 14);
          fpa.a(nma.field_l, (byte) 75);
        }
        if (hd.field_a[8]) {
          dra.a(true);
        }
    }

    final void b(byte param0, boolean param1) {
        hd.field_a[3] = true;
        if (param0 < 101) {
          this.d((byte) 96);
        }
        hd.field_a[8] = param1;
        hd.field_a[7] = true;
        hd.field_a[16] = true;
        hd.field_a[0] = true;
        hd.field_a[17] = true;
        hd.field_a[18] = true;
    }

    ug() {
    }

    final void s(int param0) {
        hd.field_a[1] = true;
        if (param0 != -1) {
          this.field_t = -30;
        }
    }

    static {
        field_r = new String[4];
        field_r[2] = "Prim's Algorithm";
        field_r[0] = "Recursive Backtracker";
        field_r[1] = "Striped";
        field_r[3] = "Division";
    }
}
