/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jla {
    static rca field_a;
    int field_b;
    private jd field_e;
    static ee field_d;
    static String field_c;
    static String field_f;

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var5Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        boolean decompiledFrameCompleted0 = true;
        var11 = BachelorFridge.field_y;
        if (nt.field_z == null) {
          if (null == pm.field_v) {
            nt.field_z = bla.a(29611, "basic", "fly_small", wha.field_a);
            vla.field_r = new ee[2];
            var2 = 0;
            while (true) {
              if (nt.field_z.length > var2) {
                vla.field_r[var2] = nt.field_z[var2].b();
                var2++;
                if (var11 == 0) {
                  continue;
                }
              } else {
                bp.field_y = bla.a(29611, "basic", "maggot_small", wha.field_a);
                vu.field_k = new ee[bp.field_y.length];
              }
              break;
            }
            var2 = 0;
            while (var2 < bp.field_y.length) {
              vu.field_k[var2] = bp.field_y[var2].b();
              var2++;
              if (var11 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var11 != 0)) {
              bp.field_y = hha.field_y;
              vla.field_r = hb.field_k;
              vu.field_k = ik.field_h;
              nt.field_z = pm.field_v;
            }
          } else {
            bp.field_y = hha.field_y;
            vla.field_r = hb.field_k;
            vu.field_k = ik.field_h;
            nt.field_z = pm.field_v;
          }
        }
        if (decompiledFrameCompleted0) {
          var2 = 590;
        }
        var3 = 0;
        aha.field_D.c(ana.field_o[0], 25, 30, uga.field_v, -1);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_o[1], 25, 30 + g.field_g.field_u * var3, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3 += 2;
        aha.field_D.c(ana.field_o[2], 25, var3 * g.field_g.field_u + 40, uga.field_v, -1);
        var3 += 2;
        if (param0 != -56) {
          field_d = (ee) null;
        }
        g.field_g.c(ana.field_o[3], 25, 40 + g.field_g.field_u * var3, 3518976, -1);
        var3 += 2;
        g.field_g.c(ana.field_o[4], 25, 40 + g.field_g.field_u * var3, 3518976, -1);
        var3++;
        var2 -= 90;
        var3 = var3 + g.field_g.a(ana.field_o[5], 25, (var3 + 1) * g.field_g.field_u + 40, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var4 = 570;
        var5 = 20 + var3 * g.field_g.field_u;
        vw.field_a[2].field_b[102].a(-(vw.field_a[0].field_b[0].field_d / 2) + var4, 16 + var5);
        var6 = vr.field_b;
        var7 = (int)(Math.sin(0.5 * ((double)((var5 * var4 << 2) + var6) / 40.0)) * 30.0);
        var8 = (int)(Math.cos((double)(var6 + (var4 * var5 << 2)) / 40.0 * 0.5) * 15.0);
        var3 += 7;
        if (var8 < 0) {
          nt.field_z[(var6 >> 2) % 2].b(var7 + var4 - 7, var5 + var8, 16711680);
        }
        if (var8 >= 0 ||
          var11 != 0) {
          vla.field_r[(var6 >> 2) % 2].b(-7 + var4 + var7, var5 + var8, 16711680);
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        var3 = var3 + g.field_g.a(ana.field_o[6], 25, g.field_g.field_u * var3 + 40, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var5Lifetime1 = g.field_g.field_u * (-2 + var3) + 40;
        vw.field_a[1].field_b[102].a(-(vw.field_a[0].field_b[0].field_d / 2) + var4, var5Lifetime1 - 14);
        var7Lifetime1 = (int)(32.0 * Math.sin((double)(var6 + (var4 * var5Lifetime1 << 2)) / 80.0 * 0.5));
        var8Lifetime1 = (int)(Math.cos(0.5 * ((double)((var5Lifetime1 * var4 << 2) + var6) / 80.0)) * 15.0);
        var9 = 0.5 * ((double)(var6 + (var4 * var5Lifetime1 << 2)) / 80.0) + 1.5707963267948966;
        if (var8Lifetime1 >= 0) {
          if (2.0943951023931953 < var9 % 3.141592653589793) {
            vu.field_k[5 + (var6 >> 3) % 5].a(-(bp.field_y[0].field_a / 2) + (var7Lifetime1 + var4), var5Lifetime1 + var8Lifetime1);
            decompiledFrameRemainder1 = (var11 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (var9 % 3.141592653589793 > 1.0471975511965976) {
              vu.field_k[(var6 >> 3) % 5].a(-(bp.field_y[0].field_a / 2) + (var4 + var7Lifetime1), var5Lifetime1 + var8Lifetime1);
              decompiledFrameRemainder0 = (var11 != 0);
            }
            if (decompiledFrameRemainder0) {
              vu.field_k[10 + (var6 >> 3) % 5].a(-(bp.field_y[0].field_a / 2) + var7Lifetime1 + var4, var5Lifetime1 + var8Lifetime1);
            }
          }
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0) &&
          (!(var8Lifetime1 >= 0) ||
          var11 != 0)) {
          if (var9 % 3.141592653589793 > 2.0943951023931953) {
            bp.field_y[(var6 >> 3) % 5 + 10].a(var4 + (var7Lifetime1 - bp.field_y[0].field_a / 2), var5Lifetime1 + var8Lifetime1);
            if (var11 != 0) {
              if (1.0471975511965976 < var9 % 3.141592653589793) {
                bp.field_y[(var6 >> 3) % 5].a(var7Lifetime1 + var4 - bp.field_y[0].field_a / 2, var8Lifetime1 + var5Lifetime1);
                bp.field_y[(var6 >> 3) % 5 + 5].a(var4 + (var7Lifetime1 - bp.field_y[0].field_a / 2), var5Lifetime1 + var8Lifetime1);
              } else {
                bp.field_y[(var6 >> 3) % 5 + 5].a(var4 + (var7Lifetime1 - bp.field_y[0].field_a / 2), var5Lifetime1 + var8Lifetime1);
              }
            }
          } else {
            if (1.0471975511965976 < var9 % 3.141592653589793) {
              bp.field_y[(var6 >> 3) % 5].a(var7Lifetime1 + var4 - bp.field_y[0].field_a / 2, var8Lifetime1 + var5Lifetime1);
              if (var11 != 0) {
                bp.field_y[(var6 >> 3) % 5 + 5].a(var4 + (var7Lifetime1 - bp.field_y[0].field_a / 2), var5Lifetime1 + var8Lifetime1);
              }
            } else {
              bp.field_y[(var6 >> 3) % 5 + 5].a(var4 + (var7Lifetime1 - bp.field_y[0].field_a / 2), var5Lifetime1 + var8Lifetime1);
            }
          }
        }

    }

    final boolean d(int param0, int param1) {
        if (param1 != 26891) {
          jla.b(false, -112);
        }
        return this.c(param0, 19950);
    }

    private final void c(byte param0) {
        int var2 = 590;
        int var3 = 0;
        aha.field_D.c(ana.field_u[0], 25, 30, uga.field_v, -1);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_u[1], 25, g.field_g.field_u * var3 + 30, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        if (param0 <= 103) {
          return;
        }
        var3 = var3 + g.field_g.a(ana.field_u[2], 25, 30 + g.field_g.field_u * var3, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_u[3], 25, var3 * g.field_g.field_u + 30, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
    }

    int a(int param0, boolean param1) {
        if (6 == this.field_b) {
          if (0 == param0) {
            return de.field_I;
          }
          if (param0 == 2) {
            return pd.field_d;
          }
          if (ut.field_o == 0 ||
            kaa.field_m == 0) {
            return gha.field_e;
          }
          return pga.field_a;
        }
        if (!param1) {
          this.a(true);
        }
        return pj.field_c[this.field_b];
    }

    private final static void b(boolean param0, int param1) {
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException decompiledCaughtException = null;
        uu var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        try {
          qm.field_d.a(param1 - 8260, true);
          qm.field_d.a(vc.field_a * 32, false, 32, 105);
          ug.field_q.a(19842, true);
          ug.field_q.a(vc.field_a * 32, false, 32, 121);
          var2 = (uu) (mda.field_b.field_z.b((byte) 90));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2 == null))) {
            stackIn_11_0 = ~var2.field_R;
            stackIn_11_1 = -2;
            if (var3 == 0) {
              if (stackIn_11_0 == stackIn_11_1) {
                if (dm.field_f <= 0 &&
                  !fw.field_h[var2.field_Cb].field_e) {
                  var2 = (uu) (mda.field_b.field_z.c(0));
                  continue;
                }
                uca.a(32, (byte) 121);
                qm.a(7, param1 ^ 29576);
                uka.a(param1 - 28204, var2.field_Cb, 1);
              }
              var2 = (uu) (mda.field_b.field_z.c(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = param1;
            stackIn_11_1 = 28102;
          }
          if (stackIn_11_0 != stackIn_11_1) {
            return;
          }
          L5: {
            bw.field_a.a(19842, true);
            if (bw.field_a.field_R == 1) {
              if (!(dea.field_n <= mg.field_m.field_a) ||
                !(gu.field_d > 0) ||
                !lca.c(false)) {
                qm.a(32, 7758);
                if (var3 == 0) {
                  break L5;
                }
              }
              if (dga.field_a != 0) {
                if (dga.field_a == 1 &&
                  ~(1 + gs.field_f.field_d.field_c.field_n) == ~tp.field_v) {
                  gs.field_f.e((byte) 8);
                  tp.field_v = -1;
                  if (var3 == 0) {
                    break L5;
                  }
                } else {
                  if (((dga.field_a == 1)) &&
                    (~(gs.field_f.field_d.field_c.field_n + 1) != ~tp.field_v)) {
                    return;
                  }
                  break L5;
                }
              }
              qm.a(6, 7758);
              boolean decompiledSharedTail0 = (af.field_a ||
                bp.e(-29919));
              if (!decompiledSharedTail0) {
                gs.field_f.a(false, iea.field_d);
                iea.field_d = new eaa();
                mg.field_m.field_a = mg.field_m.field_a - dea.field_n;
                gu.field_d = 0;
                dea.field_n = 0;
                decompiledSharedTail0 = (var3 != 0);
              }
              if (decompiledSharedTail0) {
                gs.field_f.a(iea.field_d, 50);
                pka.a((byte) -107, true);
              }
              uca.a(33, (byte) 98);
            }
          }
          lfa.field_l.a(19842, true);
          if (lfa.field_l.field_R == 1) {
            rs.a(true);
            sia.field_h = true;
            lg.a(true, -3, true);
          }
          rv.field_l.a(19842, true);
          if (1 == rv.field_l.field_R) {
            qm.a(7, param1 ^ 29576);
            tha.field_p = tha.field_p - 1;
            if (tha.field_p < 0) {
              tha.field_p = 0;
            }
          }
          hk.field_c.a(param1 - 8260, true);
          if (hk.field_c.field_R == 1) {
            qm.a(7, 7758);
            tha.field_p = tha.field_p + 1;
            if (tha.field_p > gu.field_d - 1) {
              tha.field_p = gu.field_d - 1;
            }
          }
          mg.field_l.a(param1 - 8260, true);
          if (mg.field_l.field_R == 1) {
            uca.a(31, (byte) -127);
            qm.a(31, 7758);
            baa.field_Q = 1;
            lf.a(param1 ^ 28154);
          }
          qba.field_l.a(19842, true);
          if (qba.field_l.field_R == 1) {
            uca.a(31, (byte) -87);
            qm.a(31, 7758);
            baa.field_Q = 2;
            lf.a(106);
          }
          dt.field_b.a(19842, true);
          if (dt.field_b.field_R == 1) {
            uca.a(31, (byte) -10);
            qm.a(31, param1 ^ 29576);
            baa.field_Q = 3;
            lf.a(82);
          }
          bea.field_u.a(19842, true);
          if (bea.field_u.field_R == 1) {
            uca.a(31, (byte) 105);
            qm.a(31, 7758);
            baa.field_Q = 4;
            lf.a(97);
          }
          sea.field_k.a(19842, true);
          if (sea.field_k.field_R == 1) {
            uca.a(31, (byte) -91);
            qm.a(31, param1 ^ 29576);
            baa.field_Q = 5;
            lf.a(76);
          }
          mk.field_h.a(param1 ^ 8260, true);
          if (1 == mk.field_h.field_R) {
            uca.a(31, (byte) -62);
            qm.a(31, 7758);
            baa.field_Q = 6;
            lf.a(114);
          }
          mja.field_q.a(param1 ^ 8260, true);
          if (mja.field_q.field_R == 1) {
            uca.a(31, (byte) -65);
            qm.a(31, 7758);
            baa.field_Q = 7;
            lf.a(param1 ^ 28154);
          }
          rfa.field_b.a(19842, true);
          if (1 == rfa.field_b.field_R) {
            uca.a(31, (byte) 120);
            qm.a(31, param1 ^ 29576);
            baa.field_Q = 8;
            lf.a(103);
          }
          wa.e((byte) -87);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "jla.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
        dg.b(0, 0, 640, 480, 65280, 4227136);
        aha.field_D.a(hl.field_E, 320, 240, 16777215, -1);
        if (param0 >= -120) {
          this.field_e = (jd) null;
        }
    }

    void i(int param0) {
        int var2;
        ada.field_p.d(0, 0);
        gla.field_j.c(137, 0);
        ml.field_a.d(127, 0);
        var2 = 137;
        bh.field_r.e(418 + var2, 41);
        if (ku.field_q &&
          lp.field_u) {
          gca.field_g.e(var2 + 410, 148);
          if (BachelorFridge.field_y != 0) {
            cba.field_a.e(var2 + 410, 148);
          }
        } else {
          cba.field_a.e(var2 + 410, 148);
        }
        vj.field_p.e(154, 17);
        if (param0 != -12988) {
          this.j(-44);
        }
    }

    private final void g(int param0) {
        if (param0 != 10) {
          field_f = (String) null;
        }
        int var2 = hs.a(false, nga.field_i) ? 1 : 0;
        String var3 = nga.field_j;
        var3 = var3 + " " + jm.a((byte) 75, lga.a(true, new String[]{nla.field_c}, ja.a((byte) -48, false, false, var2 != 0)), '#', "<br><br>");
        aha.field_D.a(var3, 80, 200, 480, 300, 3518976, -1, 1, 0, 30);
    }

    private final void f(int param0) {
        int var2;
        int var3;
        int var4;
        if (wl.field_yb == null) {
          boolean decompiledSharedTail0 = (ve.field_m == null);
          if (!decompiledSharedTail0) {
            wl.field_yb = ve.field_m;
            decompiledSharedTail0 = (BachelorFridge.field_y != 0);
          }
          if (decompiledSharedTail0) {
            wl.field_yb = new kv[4][];
            wl.field_yb[0] = pi.a(wha.field_a, -8845, "basic", "powerup_hp");
            wl.field_yb[1] = pi.a(wha.field_a, -8845, "basic", "powerup_speed");
            wl.field_yb[2] = pi.a(wha.field_a, param0 - 9140, "basic", "powerup_attack");
            wl.field_yb[3] = pi.a(wha.field_a, param0 - 9140, "basic", "powerup_special");
          }
        }
        var2 = 590;
        aha.field_D.c(ana.field_s[0], 25, 30, uga.field_v, -1);
        var3 = 0;
        var3++;
        var3 = var3 + g.field_g.a(ana.field_s[1], 25, g.field_g.field_u * var3 + 30, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3 += 2;
        aha.field_D.c(ana.field_s[2], 25, 40 + var3 * g.field_g.field_u, uga.field_v, -1);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_s[3], 25, 40 + var3 * g.field_g.field_u, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        var4 = vr.field_b % (wl.field_yb[0].length * 4);
        wl.field_yb[2][var4 / 4].e(25, 40 + g.field_g.field_u * var3);
        g.field_g.c(ana.field_s[4], wl.field_yb[0][0].field_q + 35, wl.field_yb[0][0].field_p / 2 + g.field_g.field_u * var3 + (40 + g.field_g.field_u / 4), 3518976, -1);
        var3 += 3;
        wl.field_yb[3][var4 / 4].e(25, g.field_g.field_u * var3 + 40);
        g.field_g.c(ana.field_s[5], 10 + (25 + wl.field_yb[0][0].field_q), wl.field_yb[0][0].field_p / 2 + (g.field_g.field_u * var3 + 40) + g.field_g.field_u / 4, 3518976, -1);
        if (param0 != 295) {
          this.field_b = -24;
        }
        var3 += 3;
        wl.field_yb[0][var4 / 4].e(25, 40 + var3 * g.field_g.field_u);
        g.field_g.c(ana.field_s[6], wl.field_yb[0][0].field_q + 25 + 10, wl.field_yb[0][0].field_p / 2 + g.field_g.field_u * var3 + 40 + g.field_g.field_u / 4, 3518976, -1);
        var3 += 3;
        wl.field_yb[1][var4 / 4].e(25, 40 + var3 * g.field_g.field_u);
        g.field_g.a(ana.field_s[7], 25 - (-wl.field_yb[0][0].field_q - 10), -(g.field_g.field_u * 5 / 4) + wl.field_yb[0][0].field_p / 2 + (var3 * g.field_g.field_u + 40), -10 + (var2 - wl.field_yb[0][0].field_q), 430, 3518976, -1, 0, 0, g.field_g.field_u);
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param0 != 25428) {
          this.c(-43, -128);
        }
        if (this.field_b == 15 ||
          this.field_b == 1 ||
          this.field_b == 2 ||
          this.field_b == 4) {
          var2 = 255;
          if (~iba.field_s != ~kaa.field_m) {
            var2 = tma.field_v * 255 / 32;
            if (~this.field_b != ~kaa.field_m) {
              var2 = -var2 + 255;
            }
          }
          var3 = 2;
          if (15 != this.field_b) {
            if (this.field_b == 1) {
              var3 = (-wt.field_q.field_p + 480) / 2;
              if (var4 != 0) {
                var3 = 180;
              }
            }
          } else {
            var3 = 180;
          }
          if (var2 != 255) {
            wt.field_q.a((640 - wt.field_q.field_q) / 2, var3, var2);
          }
          if (var2 == 255 ||
            var4 != 0) {
            wt.field_q.e((640 - wt.field_q.field_q) / 2, var3);
          }
          if (this.field_b == 2 ||
            this.field_b == 4) {
            if (var2 == 255) {
              lp.field_q.e((-lp.field_q.field_q + 640) / 2, 480 - lp.field_q.field_p - 2);
              if (var4 != 0) {
                lp.field_q.a((-lp.field_q.field_q + 640) / 2, -2 + (-lp.field_q.field_p + 480), var2);
              }
            } else {
              lp.field_q.a((-lp.field_q.field_q + 640) / 2, -2 + (-lp.field_q.field_p + 480), var2);
            }
          }
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        int stackIn_95_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        String var12;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var9 = BachelorFridge.field_y;
        if (iba.field_s != 12) {
          if (this.field_e.field_b) {
            qm.a(17, 7758);
          }
          if (this.field_e.e(0)) {
            qm.a(18, param0 ^ -7788);
          }
        }
        if (!this.d(param1, 26891)) {
          return;
        }
        if (hb.field_j) {
          return;
        }
        if (param0 != -38) {
          field_c = (String) null;
        }
        L3: {
          L4: {
            boolean decompiledFrameRemainder23 = true;
            boolean decompiledFrameRemainder22 = true;
            boolean decompiledFrameRemainder21 = true;
            boolean decompiledFrameRemainder20 = true;
            boolean decompiledFrameRemainder19 = true;
            boolean decompiledFrameRemainder18 = true;
            boolean decompiledFrameRemainder17 = true;
            boolean decompiledFrameRemainder16 = true;
            boolean decompiledFrameRemainder15 = true;
            boolean decompiledFrameRemainder14 = true;
            boolean decompiledFrameRemainder13 = true;
            boolean decompiledFrameRemainder12 = true;
            boolean decompiledFrameRemainder11 = true;
            boolean decompiledFrameRemainder10 = true;
            boolean decompiledFrameRemainder9 = true;
            boolean decompiledFrameRemainder8 = true;
            boolean decompiledFrameRemainder7 = true;
            boolean decompiledFrameRemainder6 = true;
            boolean decompiledFrameRemainder5 = true;
            boolean decompiledFrameRemainder4 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var4 = pj.field_b[this.field_b][param1];
            var6 = var4;
            if (0 == var6 &&
              var9 == 0) {
              if (!(!this.field_e.e(0))) {
                if (mg.field_m != null &&
                  !mg.field_m.a((byte) 118)) {
                  if (!bp.e(param0 ^ 29947)) {
                    h.c((byte) -69);
                  }
                  mg.field_m.b(27185);
                }
                kj.b((byte) -88);
              }
              break L3;
            } else if (var6 != 33 ||
              var9 != 0) {
              decompiledFrameRemainder0 = (var6 != 1);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder1 = (var6 != 2 ||
                var9 != 0)) &&
                (decompiledFrameRemainder2 = (var6 != 7)) &&
                (decompiledFrameRemainder3 = (var6 != 24 ||
                var9 != 0)) &&
                (decompiledFrameRemainder4 = (var6 != 22)) &&
                (decompiledFrameRemainder5 = (var6 != 5 ||
                var9 != 0)) &&
                (decompiledFrameRemainder6 = (var6 != 8)) &&
                (decompiledFrameRemainder7 = (var6 != 4 ||
                var9 != 0)) &&
                (decompiledFrameRemainder8 = (var6 != 20)) &&
                (decompiledFrameRemainder9 = (var6 != 21)) &&
                (decompiledFrameRemainder10 = (6 != var6)) &&
                (decompiledFrameRemainder11 = (var6 != 9 ||
                var9 != 0)) &&
                (decompiledFrameRemainder12 = (var6 != 10 ||
                var9 != 0)) &&
                (decompiledFrameRemainder13 = (var6 != 11)) &&
                (decompiledFrameRemainder14 = (12 != var6 ||
                var9 != 0)) &&
                (decompiledFrameRemainder15 = (var6 != 13)) &&
                (decompiledFrameRemainder16 = (34 != var6)) &&
                (decompiledFrameRemainder17 = (17 != var6 ||
                var9 != 0)) &&
                (decompiledFrameRemainder18 = (var6 != 18 ||
                var9 != 0)) &&
                (decompiledFrameRemainder19 = (var6 != 23)) &&
                (decompiledFrameRemainder20 = (25 != var6 ||
                var9 != 0)) &&
                (decompiledFrameRemainder21 = (var6 != 26 ||
                var9 != 0)) &&
                (decompiledFrameRemainder22 = (var6 != 19)) &&
                (decompiledFrameRemainder23 = (27 != var6))) {
                if (28 == var6) {
                  if (this.field_e.e(0)) {
                    break L4;
                  }
                  break L3;
                }
                if (var6 == 29 &&
                  var9 == 0) {
                  if (!this.field_e.e(0)) {
                    break L4;
                  }
                  break L3;
                }
                if (var6 == 30 &&
                  var9 == 0) {
                  if (this.field_e.e(0)) {
                    break L4;
                  }
                  break L3;
                }
                if (var6 == 31) {
                  if (this.field_e.e(0)) {
                    break L4;
                  }
                  break L3;
                }
                if (32 != var6) {
                  break L3;
                }
                if (!this.field_e.e(0)) {
                  break L3;
                }
                if (!this.field_e.e(0)) {
                  break L3;
                }
                lg.a(true, 14, param2);
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8) &&
              (decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              if (!(!this.field_e.e(0))) {
                lg.a(true, 15, param2);
              }
              break L4;
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8) &&
              (decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              if (!this.field_e.e(0)) {
                break L3;
              }
              if (null == mg.field_m) {
                break L4;
              }
              if (!mg.field_m.a((byte) 122)) {
                break L4;
              }
              if (mg.field_m.field_e.field_m.g(0) == 0) {
                break L4;
              }
              if (bp.e(-29919)) {
                stackIn_95_0 = (!bp.e(param0 - 29881)) ? 1 : 0;
                var6Lifetime3 = stackIn_95_0;
                gu.a(8, param2, 6106, aha.field_D, aha.field_D.field_B + aha.field_D.field_v, he.field_n, aha.field_D.field_v, true, (kv[]) null, 8, 240, 320, (kv[]) null, var6Lifetime3, 2);
                if (var9 == 0) {
                  break L4;
                }
              }
              lg.a(true, -4, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8) &&
              (decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2)) {
              if (!this.field_e.e(0)) {
                break L4;
              }
              if (dj.field_c == null &&
                sna.field_fb == null) {
                lg.a(true, -3, param2);
                if (var9 == 0) {
                  break L4;
                }
              }
              lg.a(true, -1, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8) &&
              (decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3)) {
              if (!this.field_e.e(0)) {
                break L4;
              }
              lg.a(true, 0, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8) &&
              (decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4)) {
              if (!this.field_e.e(0)) {
                break L4;
              }
              lg.a(true, 11, param2);
              ai.field_c = true;
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8) &&
              (decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5)) {
              if (!this.field_e.e(0)) {
                break L3;
              }
              lg.a(true, 7, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8) &&
              (decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6)) {
              if (!this.field_e.e(param0 ^ -38)) {
                break L4;
              }
              ie.field_a = 0;
              lg.a(true, 6, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8) &&
              (decompiledFrameRemainder7)) {
              if (!this.field_e.e(0)) {
                break L4;
              }
              lg.a(true, ut.field_o, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8)) {
              if (!this.field_e.e(param0 ^ -38)) {
                break L4;
              }
              lg.a(true, 5, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9)) {
              var5 = 0;
              if (this.field_e.d(param0 - 9869) &&
                b.field_u > 0) {
                var5 = 1;
                di.a(true, 0);
              }
              if (this.field_e.a(param0 ^ 37) &&
                b.field_u < 256) {
                di.a(true, 256);
                var5 = 1;
              }
              if (this.field_e.b(0)) {
                var6Lifetime2 = this.a(param1, true) + this.b(param1, 40) - (-mv.field_n + 89) >> 1;
                var7 = mk.field_p - var6Lifetime2;
                var8 = 256 * var7 / 89;
                if (0 >= var8) {
                  di.a(true, 0);
                  if (var9 != 0) {
                    if (256 > var8) {
                      di.a(true, var8);
                      di.a(true, 256);
                    } else {
                      di.a(true, 256);
                    }
                  }
                } else {
                  if (256 > var8) {
                    di.a(true, var8);
                    if (var9 != 0) {
                      di.a(true, 256);
                    }
                  } else {
                    di.a(true, 256);
                  }
                }
                var5 = 1;
              }
              if (this.field_e.c(-27) &&
                b.field_u > 0) {
                var5 = 1;
                gb.a(-9372);
              }
              if (this.field_e.b((byte) -73) &&
                256 > b.field_u) {
                var5 = 1;
                ii.c((byte) 62);
              }
              if (var5 == 0) {
                break L4;
              }
              if (this.field_e.b(param0 ^ -38) &&
                fia.field_q >= vr.field_b) {
                break L4;
              }
              ol.a(kea.field_r[0], true);
              fia.field_q = 20 + vr.field_b;
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10)) {
              if (this.field_e.d(-9907)) {
                gka.a(-119, 0);
              }
              if (this.field_e.a(param0 + 37)) {
                gka.a(-52, 230);
              }
              if (this.field_e.b(param0 ^ -38)) {
                var6Lifetime1 = -89 + (this.a(param1, true) + this.b(param1, 40)) + mv.field_n >> 1;
                var7Lifetime1 = -var6Lifetime1 + mk.field_p;
                var8Lifetime1 = var7Lifetime1 * 230 / 89;
                if (var8Lifetime1 > 0) {
                  if (230 > var8Lifetime1) {
                    gka.a(81, var8Lifetime1);
                    if (var9 != 0) {
                      gka.a(param0 ^ -87, 230);
                      gka.a(-97, 0);
                    }
                  } else {
                    gka.a(param0 ^ -87, 230);
                    if (var9 != 0) {
                      gka.a(-97, 0);
                    }
                  }
                } else {
                  gka.a(-97, 0);
                }
              }
              if (this.field_e.c(param0 ^ 88)) {
                sr.a((byte) -107);
              }
              if (!this.field_e.b((byte) -73)) {
                break L4;
              }
              bv.b(16964);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11)) {
              if (!this.field_e.e(0)) {
                break L3;
              }
              if (null == kga.field_c) {
                oq.a(param2, false);
                if (var9 == 0) {
                  break L4;
                }
              }
              lga.c((byte) 119);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13) &&
              (decompiledFrameRemainder12)) {
              if (!this.field_e.e(0)) {
                break L4;
              }
              if (null != dj.field_c) {
                ((dfa) ((Object) dj.field_c)).a(8, param2);
              }
              if (gs.field_f != null) {
                gs.field_f.b(param2, false);
              }
              vs.field_d = false;
              sia.field_h = false;
              nu.field_b = true;
              if (mg.field_m.a((byte) 102)) {
                break L3;
              }
              if (!bp.e(param0 - 29881)) {
                h.c((byte) -69);
              }
              mg.field_m.b(param0 ^ -27157);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14) &&
              (decompiledFrameRemainder13)) {
              if (!this.field_e.e(param0 + 38)) {
                break L3;
              }
              dj.field_c.field_e.b(param0 + 97);
              lg.a(true, -1, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15) &&
              (decompiledFrameRemainder14)) {
              if (!this.field_e.e(0)) {
                break L3;
              }
              dj.field_c.field_e.d(-111);
              lg.a(true, -1, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16) &&
              (decompiledFrameRemainder15)) {
              if (!this.field_e.e(0)) {
                break L4;
              }
              if (null != sna.field_fb) {
                break L4;
              }
              dj.field_c.field_e.b((byte) 27);
              lg.a(true, -1, param2);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17) &&
              (decompiledFrameRemainder16)) {
              if (!this.field_e.e(0)) {
                break L4;
              }
              if (!this.d(param1, param0 ^ -26927)) {
                break L3;
              }
              this.c(param2, param0 - 17769);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder17)) {
              if ((null == sna.field_fb ||
                !sna.field_fb.field_e.field_a) &&
                (dj.field_c == null ||
                !dj.field_c.field_e.field_a)) {
                if (!this.field_e.e(0)) {
                  break L4;
                }
                if (!this.d(param1, 26891)) {
                  break L4;
                }
                hp.field_c = -3;
                ((dfa) ((Object) dj.field_c)).a(8, param2);
                vs.field_d = false;
                uca.a(39, (byte) -97);
                if (var9 == 0) {
                  break L4;
                }
              }
              if (!this.field_e.e(0)) {
                break L4;
              }
              if (!this.d(param1, param0 ^ -26927)) {
                break L3;
              }
              this.c(param2, -17807);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18)) {
              if (!this.field_e.e(param0 ^ -38)) {
                break L3;
              }
              ks.field_i = 0;
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19)) {
              if (!this.field_e.e(0)) {
                break L4;
              }
              ks.field_i = 1;
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20)) {
              if (!this.field_e.e(0)) {
                break L3;
              }
              if (9 == this.field_b) {
                var12 = (String) null;
                au.a(8, (String) null, false);
                if (var9 == 0) {
                  break L4;
                }
              }
              if (7 != this.field_b &&
                iba.field_s != 5) {
                break L4;
              }
              au.a(this.field_b, gba.field_Ib, false);
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21)) {
              if (!this.field_e.e(0)) {
                break L4;
              }
              if (!this.d(param1, 26891)) {
                break L3;
              }
              ie.field_a = ie.field_a - 1;
              if (var9 == 0) {
                break L4;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22)) {
              if (!this.field_e.e(param0 ^ -38)) {
                break L4;
              }
              if (!this.d(param1, param0 + 26929)) {
                break L3;
              }
              ie.field_a = ie.field_a + 1;
              if (var9 == 0) {
                break L4;
              }
            }
            if (decompiledFrameRemainder23) {
              if (!this.field_e.e(param0 + 38)) {
                break L3;
              }
              dh.a(nia.d(-31768), 124);
              if (var9 == 0) {
                break L4;
              }
            }
            if (!this.field_e.e(param0 + 38)) {
            }
          }
        }
    }

    private final void c(boolean param0, int param1) {
        if (vs.field_d) {
          lg.a(true, -5, param0);
        }
        if (param1 != -17807) {
          field_d = (ee) null;
        }
        if (gja.field_n) {
          sfa.a(11, 0, false);
        }
    }

    final void c(boolean param0) {
        int var2;
        int var3;
        boolean stackIn_10_1 = false;
        var3 = BachelorFridge.field_y;
        if (!param0) {
          this.field_b = 117;
        }
        var2 = 0;
        while (this.field_e.field_e > var2) {
          if (var3 == 0) {
            if (this.c(var2, 19950)) {
              stackIn_10_1 = (~this.field_e.field_g == ~var2);
              this.b(stackIn_10_1, var2, 0);
            }
            var2++;
            continue;
          }
          break;
        }
    }

    final String d(boolean param0, int param1) {
        String var3;
        int var4;
        var4 = BachelorFridge.field_y;
        var3 = lr.field_k[param1];
        if (param0) {
          field_d = (ee) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 == 8) {
          if (ut.field_o == 0 ||
            kaa.field_m == 0 ||
            11 == ut.field_o ||
            kaa.field_m == 11) {
            var3 = lr.field_k[7];
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (1 != ut.field_o &&
              kaa.field_m != 1) {
              if (2 != ut.field_o &&
                kaa.field_m != 2 &&
                ut.field_o != 3 &&
                kaa.field_m != 3 &&
                4 != ut.field_o &&
                kaa.field_m != 4) {
                if (~kaa.field_m == ~ut.field_o) {
                  var3 = lr.field_k[7];
                  if (var4 != 0) {
                    var3 = mp.field_t;
                    var3 = baa.field_E;
                  }
                }
              } else {
                var3 = mp.field_t;
                if (var4 != 0) {
                  var3 = baa.field_E;
                }
              }
            } else {
              var3 = baa.field_E;
            }
          }
        }
        return var3;
    }

    private final void a(byte param0) {
        kv dupTemp$1 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        if (null == eea.field_a) {
          boolean decompiledSharedTail0 = (null == wq.field_k);
          if (!decompiledSharedTail0) {
            eea.field_a = wq.field_k;
            decompiledSharedTail0 = (BachelorFridge.field_y != 0);
          }
          if (decompiledSharedTail0) {
            dupTemp$1 = wfa.a("creatureviewer_bg", wha.field_a, "basic", (byte) 58);
            wq.field_k = dupTemp$1;
            eea.field_a = dupTemp$1;
          }
          jm.field_i = new lna(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
          jm.field_i.a(false, 1, 1, true, 0);
          i.field_d = new lna(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
          i.field_d.a(false, 1, 1, true, 0);
        }
        var2 = 590;
        aha.field_D.c(ana.field_k[0], 25, 30, uga.field_v, -1);
        var3 = 0;
        var3++;
        var3 = var3 + g.field_g.a(ana.field_k[1], 25, 30 + var3 * g.field_g.field_u, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var4 = 35 + g.field_g.field_u * var3 + eea.field_a.field_p / 4;
        bh.field_r.e(25, var4 - bh.field_r.field_p / 2);
        jm.field_i.c(11);
        i.field_d.c(11);
        jm.field_i.a(false, false, 2048, 2048, 0, -121, 256, bh.field_r.field_q + 45, -(3 * bd.field_i.field_p / 8) + var4);
        eea.field_a.c(615 - eea.field_a.field_q / 2, -(eea.field_a.field_p / 4) + var4, eea.field_a.field_q / 2, eea.field_a.field_p / 2);
        i.field_d.a(false, false, 2048, 2048, 0, -46, 256, 615 - eea.field_a.field_q * 15 / 32, var4 - bd.field_i.field_p * 29 / 64);
        dg.c(45 + bh.field_r.field_q, var4 - 5, 20, 4, 3518976);
        dg.c(53 + bh.field_r.field_q, var4 - 13, 4, 20, 3518976);
        dg.c(163 + bh.field_r.field_q, -8 + var4, 20, 4, 3518976);
        dg.c(bh.field_r.field_q + 163, var4 - 2, 20, 4, 3518976);
        var5 = -116 % ((-51 - param0) / 57);
        var3 += 16;
        aha.field_D.c(ana.field_k[2], 25, 40 + g.field_g.field_u * var3, uga.field_v, -1);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_k[3], 25, 40 + g.field_g.field_u * var3, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
    }

    private final void k(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 != 89) {
          this.n(57);
        }
        stackIn_5_0 = (!this.d(0, 26891)) ? 1 : 0;
        var2 = stackIn_5_0;
        stackIn_8_0 = (this.d(2, 26891)) ? 2 : 1;
        boolean decompiledFrameRemainder0 = true;
        var3 = stackIn_8_0;
        if (!this.field_e.b(0)) {
          if (gf.field_k == 96) {
            if (this.field_e.field_g <= var2) {
              this.field_e.b(114, var3);
              if (var4 != 0) {
                this.field_e.b(param0 ^ 56, -1 + this.field_e.field_g);
              }
            } else {
              this.field_e.b(param0 ^ 56, -1 + this.field_e.field_g);
            }
          }
          if (97 != gf.field_k) {
            this.field_e.a(true);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (!(this.field_e.field_g >= 0) ||
              !(this.field_e.field_g < var3)) {
              this.field_e.b(param0 ^ 2, var2);
              if (var4 != 0) {
                this.field_e.b(118, this.field_e.field_g + 1);
              }
            } else {
              this.field_e.b(118, this.field_e.field_g + 1);
            }
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_e.a(true);
        }

    }

    int a(int param0, byte param1) {
        int var3;
        int var4;
        int stackIn_14_0 = 0;
        if (this.field_b == 6) {
          if (0 != param0 &&
            2 != param0) {
            return bb.field_F;
          }
          return pj.field_h[this.field_b];
        }
        if (param1 >= -38) {
          this.field_b = -66;
        }
        if (2 != this.field_b &&
          this.field_b != 4) {
          return pj.field_h[this.field_b] + pj.field_o[this.field_b] * param0;
        }
        var3 = pj.field_h[this.field_b] + param0 * pj.field_o[this.field_b];
        stackIn_14_0 = (ng.a((byte) -24)) ? 4 : 5;
        var4 = stackIn_14_0;
        if (param0 >= var4) {
          var3 = pj.field_o[this.field_b] * (-var4 + param0) + 294;
        }
        return var3;
    }

    boolean c(int param0, int param1) {
        if (this.field_b == 6) {
          if (0 == param0 &&
            ie.field_a == 0) {
            return false;
          }
          if (param0 == 2 &&
            ie.field_a == 5) {
            return false;
          }
        }
        if (param1 != 19950) {
          field_d = (ee) null;
        }
        if (this.field_b != 3) {
          return true;
        }
        if (param0 == 0 &&
          sna.field_fb != null) {
          return false;
        }
        return true;
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int var2Lifetime1;
        var4 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (var2 < 640) {
            stackIn_11_0 = 0;
            if (var4 != 0) {
              break L0;
            }
            var3 = stackIn_11_0;
            while (480 > var3) {
              mr.field_f.e(var2, var3);
              var3 = var3 + mr.field_f.field_p;
            }
            var2 = var2 + mr.field_f.field_q;
            continue L0;
          }
          dg.a(10, 10, 620, 460, 10, 0, 192);
          stackIn_11_0 = -124 % ((param0 - 65) / 33);
          break;
        }
        var2Lifetime1 = stackIn_11_0;
        g.field_g.b(jm.a((byte) -117, ie.field_a), 600, 460, uga.field_v, -1);
        return;
    }

    int b(int param0, int param1) {
        if (this.field_b == 6) {
          if (param0 != 0 &&
            param0 != 2) {
            if (ut.field_o != 0 &&
              kaa.field_m != 0) {
              return this.a(param0, true) + 150;
            }
            return 60 + this.a(param0, true);
          }
          return this.a(param0, true) + sia.field_j.field_p / 2;
        }
        if (param1 != 40) {
          this.field_e = (jd) null;
        }
        return pj.field_l[this.field_b];
    }

    public static void b(boolean param0) {
        field_d = null;
        field_f = null;
        if (!param0) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    private final void n(int param0) {
        int var2;
        int var3;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  boolean decompiledFrameRemainder0 = true;
                  var3 = BachelorFridge.field_y;
                  this.m(116);
                  this.c(true);
                  var2 = ie.field_a;
                  if ((0 != var2 ||
                    var3 != 0) &&
                    (decompiledFrameRemainder0 = (var2 != 1))) {
                    if (var2 == 2 &&
                      var3 == 0) {
                      break L4;
                    }
                    if (var2 == 3 &&
                      var3 == 0) {
                      break L3;
                    }
                    if (4 == var2) {
                      break L2;
                    }
                    if (var2 != 5) {
                      break L0;
                    }
                    if (var3 == 0) {
                      break L1;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    this.d(2);
                    if (var3 == 0) {
                      break L0;
                    }
                  }
                  this.f(295);
                  if (var3 == 0) {
                    break L0;
                  }
                }
                this.a((byte) -124);
                if (var3 == 0) {
                  break L0;
                }
              }
              this.b((byte) -56);
              if (var3 == 0) {
                break L0;
              }
            }
            this.b(-46);
            if (var3 == 0) {
              break L0;
            }
          }
          this.c((byte) 110);
        }
        if (param0 != 4) {
          this.j(-58);
        }
    }

    void e(int param0) {
        boolean stackIn_6_0 = false;
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 != 8456) {
          return;
        }
        if (this.field_b == 11) {
          stackIn_6_0 = !(nma.e(-8774));
          var2 = em.a(stackIn_6_0, param0 ^ 8456);
          if (var2 == 3) {
            if (null != kga.field_c) {
              lga.c((byte) 119);
            }
            rj.a(param0 - 38592, nia.d(-31768));
          }
          if (1 == var2) {
            lg.a(true, 0, false);
          }
          if (var2 == 2) {
            lg.a(true, 0, true);
          }
          return;
        }
        if (12 == this.field_b) {
          jla.b(true, param0 ^ 19662);
        }
        if (!bka.field_h &&
          !pha.field_a &&
          ~this.field_b == ~kaa.field_m) {
          while (true) {
            if (kaa.b(127)) {
              if (13 == gf.field_k) {
                if (this.field_b == 3) {
                  continue;
                }
                if (this.field_b != 1 &&
                  2 != this.field_b &&
                  this.field_b != 4 &&
                  this.field_b != 13 ||
                  (kaa.field_m == 0 ||
                  iba.field_s == 0 ||
                  iba.field_s == 7 ||
                  iba.field_s == 8 ||
                  10 == iba.field_s ||
                  iba.field_s == 3)) {
                  if (iba.field_s == 9) {
                    continue;
                  }
                  if (iba.field_s == 0) {
                    continue;
                  }
                  hb.a(2, ut.field_o, ut.field_o, false);
                  if (var3 == 0) {
                    continue;
                  }
                }
                if (null == dj.field_c &&
                  sna.field_fb == null) {
                  if (this.field_b != 13 ||
                    gs.field_f != null) {
                    lg.a(true, -3, false);
                    if (var3 == 0) {
                      continue;
                    }
                  }
                  hb.a(2, ut.field_o, ut.field_o, false);
                  if (var3 == 0) {
                    continue;
                  }
                }
                lg.a(true, -1, false);
                if (var3 == 0) {
                  continue;
                }
              }
              this.d(false);
              if (this.field_e.field_g == -1) {
                continue;
              }
              this.a((byte) -38, this.field_e.field_g, false);
              if (var3 == 0) {
                continue;
              }
            } else {
              this.field_e.a(this.a(false, nfa.field_a, jc.field_r), -128, this.a(false, mk.field_p, gd.field_m));
            }
            if (-1 == this.field_e.field_g) {
              break;
            }
            this.a((byte) -38, this.field_e.field_g, true);
            break;
          }
        }

    }

    private final int a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        boolean stackIn_14_0 = false;
        var6 = BachelorFridge.field_y;
        if (param0) {
          jla.b(false);
        }
        var4 = 0;
        while (pj.field_b[this.field_b].length > var4) {
          var5 = this.a(var4, (byte) -115);
          stackIn_14_0 = this.c(var4, 19950);
          if (var6 != 0) {
            return stackIn_14_0 ? 1 : 0;
          }
          if (stackIn_14_0 &&
            this.a(var4, true) <= param1 &&
            param1 < this.b(var4, 40) &&
            var5 <= param2 &&
            param2 < (this.a(105, var4) + var5)) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    private final void d(boolean param0) {
        int var3;
        var3 = BachelorFridge.field_y;
        if (iba.field_s != 6) {
          if (iba.field_s == 5 &&
            !bp.e(-29919)) {
            this.a(true);
            if (var3 != 0) {
              this.field_e.b(true);
              this.k(89);
            }
          } else {
            this.field_e.b(true);
            if (var3 != 0) {
              this.k(89);
            }
          }
        } else {
          this.k(89);
        }
        if (param0) {
          this.field_b = 31;
        }
    }

    void j(int param0) {
        if (this.field_b == 5) {
          ri.field_b = null;
        }
        if (param0 != -5) {
          field_c = (String) null;
        }
    }

    int a(int param0, int param1) {
        int var3 = -128 / ((param0 + 64) / 38);
        return 36;
    }

    jla(int param0) {
        this.field_b = param0;
        this.field_e = new jd(pj.field_b[this.field_b].length);
    }

    void b(boolean param0, int param1, int param2) {
        int stackIn_36_0 = 0;
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int[] var20;
        int var4Lifetime1;
        int var6Lifetime1;
        var16 = BachelorFridge.field_y;
        if (this.field_b == 6 && (param1 == 0 ||
          param1 == 2)) {
          var4 = this.a(param1, true) + sia.field_j.field_p / 4;
          var5_int = this.a(param1, (byte) -88) + sia.field_j.field_q / 4;
          var6 = 16384;
          if (2 == param1) {
            var6 = -16384;
          }
          if (param0) {
            et.field_p.a(var6, var5_int, var4, -1049413117, 2048);
            if (var16 == 0) {
              return;
            }
          }
          sia.field_j.a(var6, var5_int, var4, -1049413117, 2048);
          return;
        }
        var4Lifetime1 = pj.field_b[this.field_b][param1];
        var5 = this.d(false, var4Lifetime1);
        var6Lifetime1 = dja.field_l.a(var5);
        var7 = this.a(param1, true);
        var8 = this.b(param1, 40);
        var9 = this.a(param1, (byte) -121);
        if (var4Lifetime1 == 20 ||
          var4Lifetime1 == 21) {
          var6Lifetime1 = mv.field_n + 103;
        }
        boolean decompiledFrameRemainder0 = true;
        var10 = -var6Lifetime1 + (var7 + var8) >> 1;
        var11 = this.a(-22, param1);
        this.a(param2 ^ param2, param1);
        var12 = 0;
        var13 = 0;
        if (this.field_b != 15 &&
          this.field_b != 1 &&
          this.field_b != 2 &&
          this.field_b != 4) {
          if (1 == var4Lifetime1 &&
            null != mg.field_m && (!mg.field_m.a((byte) 103) ||
            mg.field_m.field_e.field_m.g(0) == 0)) {
            var12 = 5921370;
            var13 = 5921370;
            decompiledFrameRemainder0 = (var16 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (param0) {
              var13 = 4500243;
              var12 = 6939164;
              decompiledFrameRemainder0 = (var16 != 0);
            }
            if (decompiledFrameRemainder0) {
              var12 = 3260416;
              var13 = 1789952;
              if (var16 != 0) {
                if (param0) {
                  var13 = 15854080;
                  var12 = 15854080;
                  var12 = 16763392;
                  var13 = 16763392;
                } else {
                  var12 = 16763392;
                  var13 = 16763392;
                }
              }
            }
          }
        } else {
          if (param0) {
            var13 = 15854080;
            var12 = 15854080;
            if (var16 != 0) {
              var12 = 16763392;
              var13 = 16763392;
            }
          } else {
            var12 = 16763392;
            var13 = 16763392;
          }
        }
        var20 = a.a(var12, 32, param2 + 16763049, var13);
        gna.a(true, var20, var5, var10, false, var9 + aha.field_D.field_u);
        if (20 == var4Lifetime1 ||
          var4Lifetime1 == 21) {
          var10 = var10 + mv.field_n;
          ls.field_c.c(var10, var9);
          dg.a(dfa.field_c);
          if (var4Lifetime1 != 20) {
            stackIn_36_0 = 89 * bs.field_k / 230;
          } else {
            stackIn_36_0 = 89 * b.field_u / 256;
          }
          var15 = stackIn_36_0;
          var15 += 7;
          dg.a(var10, var9, var15 + var10, var9 + var11);
          ni.field_j.c(var10, var9);
          dg.b(dfa.field_c);
          qw.field_c.e(-qw.field_c.field_q + 2 * var15 + 2 * var10 >> 1, -var11 + (2 * qw.field_c.field_p + var9 * 2) >> 1);
        }
    }

    private final void a(boolean param0) {
        int var3;
        var3 = BachelorFridge.field_y;
        if (gf.field_k == 96) {
          if (this.field_e.field_g <= 0) {
            this.field_e.b(105, 1);
            if ((var3 != 0) &&
              (this.field_e.field_g != 2)) {
              this.field_e.b(115, 0);
            }
          } else {
            if (this.field_e.field_g != 2) {
              this.field_e.b(115, 0);
            }
          }
        }
        if (97 == gf.field_k) {
          if (this.field_e.field_g != 1) {
            if (this.field_e.field_g != 2) {
              this.field_e.b(109, 1);
              if (var3 != 0) {
                this.field_e.b(106, 0);
              }
            }
          } else {
            this.field_e.b(106, 0);
          }
        }
        if (gf.field_k == 99) {
          if (this.field_e.field_g >= 0 &&
            this.field_e.field_g <= 1) {
            this.field_e.b(89, 2);
            if (var3 != 0) {
              this.field_e.b(108, ks.field_i);
            }
          } else {
            this.field_e.b(108, ks.field_i);
          }
        }
        if (98 == gf.field_k) {
          if (this.field_e.field_g != 2) {
            this.field_e.b(91, 2);
            if (var3 != 0) {
              this.field_e.b(100, ks.field_i);
            }
          } else {
            this.field_e.b(100, ks.field_i);
          }
        }
        this.field_e.a(param0);
    }

    void a(boolean param0, int param1) {
        int var3 = 0;
        if (11 == this.field_b) {
          var3 = -1;
        }
        if (this.field_e.field_g != -1) {
          var3 = this.field_e.field_g;
        }
        this.field_e.a(param0, 115, this.a(false, mk.field_p, gd.field_m), var3);
        fia.field_q = vr.field_b;
        if (param1 != 32) {
          this.a((byte) -76);
        }
    }

    private final void b(int param0) {
        int var2 = 590;
        aha.field_D.c(ana.field_t[0], 25, 30, uga.field_v, -1);
        int var3 = 0;
        var3 += 2;
        g.field_g.c(ana.field_t[1], 25, 30 + g.field_g.field_u * var3, 3518976, -1);
        var3++;
        vw.field_a[0].field_b[80].a(25, 30 + var3 * g.field_g.field_u, 64, 32);
        var3 = var3 + g.field_g.a(ana.field_t[2], 99, var3 * g.field_g.field_u + 30, -64 + (var2 - 10), 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        vw.field_a[2].field_b[80].a(25, 30 + var3 * g.field_g.field_u, 64, 32);
        var3 = var3 + g.field_g.a(ana.field_t[3], 99, 30 + g.field_g.field_u * var3, -10 + var2 - 64, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        vw.field_a[1].field_b[80].a(25, var3 * g.field_g.field_u + 30, 64, 32);
        var3 = var3 + g.field_g.a(ana.field_t[4], 99, g.field_g.field_u * var3 + 30, var2 - 64 - 10, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3 += 4;
        if (param0 > -20) {
          this.c((byte) 26);
        }
        aha.field_D.c(ana.field_t[5], 25, 30 + g.field_g.field_u * var3, uga.field_v, -1);
        var3++;
        vw.field_a[0].field_b[120].a(25, 30 + var3 * g.field_g.field_u, 64, 32);
        vw.field_a[2].field_b[120].a(89, g.field_g.field_u * var3 + 30, 64, 32);
        vw.field_a[1].field_b[120].a(153, 30 + g.field_g.field_u * var3, 64, 32);
        g.field_g.c(ana.field_t[6], 227, 30 + (g.field_g.field_u * (var3 + 1) + 3 * g.field_g.field_u / 8), 3518976, -1);
        var3 += 3;
        vw.field_a[0].field_b[88].a(25, 30 + g.field_g.field_u * var3, 64, 32);
        vw.field_a[2].field_b[88].a(89, g.field_g.field_u * var3 + 30, 64, 32);
        vw.field_a[1].field_b[88].a(153, 30 + g.field_g.field_u * var3, 64, 32);
        var3 = var3 + g.field_g.a(ana.field_t[7], 227, 30 + g.field_g.field_u * var3, -10 + (-192 + var2), 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3 += 2;
        vw.field_a[0].field_b[80].a(25, 30 + g.field_g.field_u * var3, 64, 32);
        vw.field_a[0].field_b[103].a(25, 30 + g.field_g.field_u * var3, 64, 32);
        vw.field_a[0].field_b[95].a(25, -32 + (30 + var3 * g.field_g.field_u), 64, 32);
        vw.field_a[2].field_b[80].a(89, 30 + var3 * g.field_g.field_u, 64, 32);
        vw.field_a[2].field_b[103].a(89, var3 * g.field_g.field_u + 30, 64, 32);
        vw.field_a[2].field_b[95].a(89, var3 * g.field_g.field_u + 30 - 32, 64, 32);
        vw.field_a[1].field_b[80].a(153, g.field_g.field_u * var3 + 30, 64, 32);
        vw.field_a[1].field_b[103].a(153, 30 + g.field_g.field_u * var3, 64, 32);
        vw.field_a[1].field_b[95].a(153, 30 + var3 * g.field_g.field_u - 32, 64, 32);
        var3 = var3 + g.field_g.a(ana.field_t[8], 227, 30 + (var3 * g.field_g.field_u - g.field_g.field_u / 2), -192 + var2 - 10, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        vw.field_a[0].field_b[80].a(25, 30 + g.field_g.field_u * var3, 64, 32);
        vw.field_a[0].field_b[109].a(25, 30 + var3 * g.field_g.field_u, 64, 32);
        vw.field_a[2].field_b[80].a(89, g.field_g.field_u * var3 + 30, 64, 32);
        vw.field_a[2].field_b[109].a(89, 30 + var3 * g.field_g.field_u, 64, 32);
        vw.field_a[1].field_b[80].a(153, 30 + var3 * g.field_g.field_u, 64, 32);
        vw.field_a[1].field_b[109].a(153, 30 + var3 * g.field_g.field_u, 64, 32);
        g.field_g.c(ana.field_t[9], 227, (1 + var3) * g.field_g.field_u + 30 + 3 * g.field_g.field_u / 8, 3518976, -1);
    }

    void l(int param0) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        if (11 == this.field_b) {
          if (!di.b(40)) {
            return;
          }
          aia.d((byte) -112);
          return;
        }
        if (this.field_b == 12) {
          eb.a(true, 36);
          return;
        }
        if (this.field_b != 6) {
          this.c(2);
        }
        if (iba.field_s == 0 ||
          iba.field_s == 15 ||
          kaa.field_m == 0 ||
          kaa.field_m == 15 ||
          kaa.field_m == 10) {
          this.i(-12988);
        }
        this.a(25428);
        if (param0 != 9) {
          return;
        }
        boolean decompiledFrameRemainder1 = true;
        this.c(true);
        if (this.field_b == 6) {
          this.n(4);
          decompiledFrameRemainder1 = (var3 != 0);
        }
        if (decompiledFrameRemainder1) {
          boolean decompiledFrameRemainder0 = true;
          if (9 == this.field_b) {
            this.g(10);
            decompiledFrameRemainder0 = (var3 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_b == 14) {
              this.h(param0 - 137);
              if ((var3 != 0) &&
                (this.field_b == 10)) {
                var2 = aha.field_D.b(fia.field_s, 480);
                hp.a(uma.field_J[0].field_n + 480 + uma.field_J[2].field_n, -uma.field_J[0].field_n + 80, (byte) 113, 30 * var2 + (uma.field_J[0].field_o + uma.field_J[6].field_o), uma.field_J, -uma.field_J[0].field_o + (200 - aha.field_D.field_u));
                aha.field_D.a(fia.field_s, 80, 188, 480, 1000, 3518976, -1, 0, 0, 30);
              }
            } else {
              if (this.field_b == 10) {
                var2 = aha.field_D.b(fia.field_s, 480);
                hp.a(uma.field_J[0].field_n + 480 + uma.field_J[2].field_n, -uma.field_J[0].field_n + 80, (byte) 113, 30 * var2 + (uma.field_J[0].field_o + uma.field_J[6].field_o), uma.field_J, -uma.field_J[0].field_o + (200 - aha.field_D.field_u));
                aha.field_D.a(fia.field_s, 80, 188, 480, 1000, 3518976, -1, 0, 0, 30);
              }
            }
          }
        }

    }

    private final void c(int param0) {
        wl.field_yb = (kv[][]) null;
        eea.field_a = null;
        if (param0 != 2) {
          this.field_e = (jd) null;
        }
        vla.field_r = null;
        vu.field_k = null;
        jm.field_i = null;
        i.field_d = null;
        nt.field_z = null;
        bp.field_y = null;
    }

    private final void d(int param0) {
        int var2 = 0;
        aha.field_D.c(ana.field_j[0], 25, 30, uga.field_v, -1);
        var2++;
        var2 = var2 + g.field_g.a(ana.field_j[1], 25, -10 + (g.field_g.field_u * var2 + 40), 590, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var2 += 2;
        g.field_g.c(ana.field_j[2], 25, 40 - (-(var2 * g.field_g.field_u) + 10), 3518976, -1);
        r.field_n.e(25, 40 + var2 * g.field_g.field_u);
        int var4 = 10 + (25 + r.field_n.field_q);
        int var3 = -r.field_n.field_q + 590;
        var2 = var2 + g.field_g.a(ana.field_j[4], var4, 40 + g.field_g.field_u * var2, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        pt.a(315, 3518976, 145, true, var2 * g.field_g.field_u + 40 - g.field_g.field_u / 2, 180, 5, (byte) 111, 350);
        var2++;
        qh.a(180, 270, -1271, 234, g.field_g.field_u * (1 + var2) + 40, 350, 5, 3518976);
        var2 = var2 + g.field_g.a(ana.field_j[5], var4, 40 + g.field_g.field_u * var2, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var2++;
        pt.a(283, 3518976, 215, true, (var2 + 1) * g.field_g.field_u + 40, 280, 5, (byte) 53, 350);
        var2 = var2 + g.field_g.a(ana.field_j[6], var4, 40 + g.field_g.field_u * var2, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var2++;
        pt.a(322, 3518976, 295, true, 40 + g.field_g.field_u * (var2 + 1), 360, 10, (byte) 64, 350);
        var2 = var2 + g.field_g.a(ana.field_j[7], var4, var2 * g.field_g.field_u + 40, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3 = r.field_n.field_q;
        int var5 = 1;
        if (kt.field_k == 0) {
          var5 = 0;
        }
        g.field_g.a(ana.field_j[3], 125, -((var5 + 11) * g.field_g.field_u / param0) + 470, var3, 2 * g.field_g.field_u, 3518976, -1, 0, 0, g.field_g.field_u);
        qh.a(180, 198, -1271, 32, (-var5 + 3) * g.field_g.field_u / 2 + 385, 120, 10, 3518976);
        var3 = g.field_g.a(ana.field_j[8]);
        g.field_g.c(ana.field_j[8], 25, 470 - 3 * g.field_g.field_u / 2, 3518976, -1);
        qh.a(362, 91, -1271, 45, 435, 68, 5, 3518976);
    }

    static {
        field_a = new rca(0, 0);
        field_c = "Wallet: ";
        field_f = "Welcome. Click the tooltips to continue.";
    }
}
