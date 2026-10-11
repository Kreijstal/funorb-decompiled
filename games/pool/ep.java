/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ep extends kq {
    private int field_q;
    static ko field_A;
    private int field_E;
    static di field_F;
    static String field_v;
    private int field_B;
    static String field_G;
    String field_t;
    private long field_o;
    private int field_w;
    private boolean field_x;
    private int field_u;
    static dd field_s;
    private boolean field_r;
    static boolean field_z;
    private boolean field_C;
    private int field_D;
    static String field_p;
    static int[] field_H;
    static String field_y;

    private final void c(int param0) {
        int var2 = -25 / ((param0 - 25) / 53);
        fe.field_H[12] = true;
        fe.field_H[11] = true;
        fe.field_H[13] = true;
    }

    final void a(int param0, String param1, int param2, int param3, int param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          try {
            if (!this.b(param3 ^ -26164)) {
              return;
            }
            this.field_t = this.getCodeBase().getHost();
            var10 = this.field_t.toLowerCase();
            stackIn_7_1 = (var10.equals("jagex.com")) || (var10.endsWith(".jagex.com"));
            this.field_x = stackIn_7_1;
            this.field_u = Integer.parseInt(this.getParameter("gameport1"));
            this.field_B = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_q = Integer.parseInt(var7);
            }
            this.field_D = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_o = Long.parseLong(this.getParameter("instanceid"));
            this.field_r = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_E = Integer.parseInt(var8);
            }
            if (this.field_E >= 5) {
              this.field_E = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_w = Integer.parseInt(var9);
            }
            sd.field_T = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(this.field_D, param2, param1, (byte) 115, 32, param4, param0);
            if (param3 != 0) {
              this.a(-57, 27, 54, 110, 115, false, -63, 23);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            tc.a((Throwable) ((Object) var6), (String) null, param3 - 8555);
            this.a((byte) 100, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var6_ref;
          stackIn_24_1 = new StringBuilder().append("ep.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.b(0, true);
        if (param3) {
          this.j(param0 ^ -42);
        }
        if (param6) {
          this.i(7);
        }
        if (param1) {
          this.g(-22045);
        }
        if (param0 == -1) {
          if (param5) {
            this.j((byte) -98);
          }
          if (param4) {
            this.b(true);
          }
          if (param2) {
            this.c(-55);
          }
          return;
        }
    }

    private final void b(boolean param0) {
        fe.field_H[6] = param0;
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          ge var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Pool.field_O;
          var4 = ek.a((byte) -88, param1, wp.field_d, gj.field_S);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = kb.a(9539, lg.c(5), eh.c(8388));
            if (-1 != var5_int) {
              sq.a(bi.field_b, false, var5_int, ke.field_g);
              bi.field_b = null;
              ke.field_g = null;
            }
            var11 = sb.a(118);
            if (var11 != null) {
              cq.a(var11.booleanValue(), 68);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = fn.a(gd.a(true), this.field_w, sa.a(false), 50, cn.a((byte) 108), kg.c((byte) 64), ng.c(12854));
            if (-1 != var5_intLifetime1) {
              ke.a(ke.field_g, var5_intLifetime1, bi.field_b, (byte) -16);
              bi.field_b = null;
              ke.field_g = null;
            }
          }
          if (var4 == 3) {
            if (sk.field_a != -1 &&
              0 != sk.field_a) {
              sk.field_a = -1;
              wa.i((byte) 72);
            }
            if (!param0) {
              var5_intLifetime2 = np.a(false, sa.a(false), false, this.field_x, this.field_w, kg.c((byte) 54));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 == 0) {
                  hf.field_e = hm.field_a;
                  kh.f((byte) 121);
                  gk.field_kb = false;
                  fk.field_ab = 10;
                } else {
                  re.a(true, ke.field_g, var5_intLifetime2);
                  ke.field_g = null;
                }
              }
            } else {
              rg.field_v = false;
            }
          }
          if (4 == var4) {
            if (bf.field_g) {
              wb.a(false, hk.d(76));
            } else {
              fk.field_ab = 10;
              gk.field_kb = true;
            }
          }
          if (5 == var4) {
            tk.a(-1, hk.d(79));
          }
          if (var4 == 6 &&
            mf.field_o) {
            fk.field_ab = 10;
          }
          if (var4 == 7) {
            nl.a((byte) 112, hk.d(99));
          }
          if (8 == var4) {
            wb.a(false, hk.d(104));
          }
          if (var4 == 9) {
            hp.a((byte) 83, hk.d(60));
          }
          if (var4 == 10) {
            ej.field_j.b(false, 17);
          }
          if (var4 == 11) {
            gg.a(hk.d(114), (byte) -121);
          }
          if (param2 >= -96) {
            this.f(91);
          }
          if (var4 == 12) {
            ui.a(rc.b(true), hk.d(109), false);
          }
          if (13 == var4) {
            try {
              if (null == l.field_d) {
                l.field_d = new ej(lg.field_s, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (l.field_d.a((byte) -118)) {
                var12 = l.field_d.a(-25955);
                if (var12 != null) {
                  var7 = tl.a(var12.field_v, -7510, var12.field_t, 0);
                  hg.a(var7, true);
                } else {
                  var9 = (String) null;
                  hg.a((String) null, true);
                }
                l.field_d = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              tc.a((Throwable) ((Object) var5), "S1", -8555);
              var10 = (String) null;
              hg.a((String) null, true);
              l.field_d = null;
            }
          }
          if (var4 == 15) {
            fk.field_ab = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 != 17) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          ep.a(false);
        }
        field_p = null;
        field_H = null;
        field_v = null;
        field_F = null;
        field_y = null;
        field_A = null;
        field_G = null;
        field_s = null;
    }

    private final void j(byte param0) {
        fe.field_H[5] = true;
        if (param0 != -98) {
          this.j((byte) -122);
        }
    }

    final void f(int param0) {
        int stackIn_29_0 = 0;
        boolean stackIn_30_1 = false;
        int var2;
        pn var3;
        int var4;
        var4 = Pool.field_O;
        var2 = uq.field_c;
        if (var2 < 64 &&
          fe.field_H[var2]) {
          if (var2 == 0) {
            return;
          }
          L1: {
            switch (var2) {
              case 1:
                cm.f(80);
                break;
              case 2:
                id.c(param0 - 14873);
                break;
              case 4:
                wi.a(199);
                break;
              case 6:
                da.a((byte) 106);
                break;
              case 8:
                vn.a((byte) 34, of.field_Pb, lg.field_s, kn.field_e);
                break;
              default:
                if (var2 != 11 &&
                  var2 != 12) {
                  switch (var2) {
                    case 13:
                      ga.n(29769);
                      break L1;
                    case 17:
                      this.d(70);
                      break L1;
                    case 18:
                      ul.i(3);
                      break L1;
                    default:
                      tc.a((Throwable) null, "MGS1: " + t.a(127), param0 - 23555);
                      dn.c(-75);
                      break L1;
                  }
                }
                stackIn_29_0 = -31;
                stackIn_30_1 = (var2 == 12);
                var3 = ee.$cfr$intArgs$a$9af18640dc82(stackIn_29_0, stackIn_30_1);
                ee.a(var3, 101);
                break;
              case 16:
                ea.c((byte) -56);
                break;
              case 7:
                this.h(6);
                break;
              case 5:
                nk.a(param0 - 14874);
                break;
              case 3:
                uo.f(-104);
                break;
            }
          }
          if (param0 != 15000) {
            this.a(true, true);
          }
          return;
        }
        tc.a((Throwable) null, "MGS2: " + t.a(param0 - 14914), -8555);
        dn.c(-108);
    }

    private final void i(int param0) {
        if (param0 != 7) {
          field_F = (di) null;
        }
        fe.field_H[2] = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        gj.field_S = this.field_E;
        th.a((byte) -94, gj.field_S);
        vp.a(this.field_u, this.field_D, (byte) 86, this.field_r, gj.field_S, this.field_B, param5, this.field_t, lg.field_s, 5000, this.field_q, 5000, param6, this.field_o);
        je.a(lg.field_s, param6, this.field_D, this.field_B, this.field_t, (byte) -96, this.field_u, gj.field_S, this.field_q);
        fl.a(true);
        oa.field_a = nn.b(96);
        kc.a(pa.field_K, param4 + param4);
        jd.field_d = param2;
        mk.field_c = param0;
        pp.field_a = param7;
        cj.field_eb = param1;
        ie.field_g = param3;
        this.i((byte) -81);
        ao.c(false);
    }

    final static void a(byte param0, uf param1) {
        ij dupTemp$0 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        ij var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        uf var5 = null;
        ij var6 = null;
        var4 = Pool.field_O;
        try {
          if (!nd.field_i.c(0)) {
            kg.field_m = kg.field_m + 1;
            if (kq.field_l != null) {
              kq.field_l.a(false, 50, kg.field_m);
            }
            if (null != nl.field_b) {
              nl.field_b.a(false, 50, kg.field_m);
            }
            var6 = (ij) (nd.field_i.c((byte) 80));
            var2 = var6;
            if (var6.field_H + var6.field_B + var6.field_y <= kg.field_m) {
              dupTemp$0 = (ij) (nd.field_i.e((byte) -41));
              var2 = dupTemp$0;
              stackIn_14_0 = (dupTemp$0 != null) ? 0 : -1;
              kg.field_m = stackIn_14_0;
              var2 = (ij) (nd.field_i.c((byte) -27));
            }
            if (var2 == null) {
              return;
            }
            if (var2.field_I != null) {
              var2.field_L[1] = (var2.field_I.field_Db >> 1) + var2.field_I.field_ib;
              var2.field_L[0] = (var2.field_I.field_gb >> 1) + var2.field_I.field_sb;
            }
            if (null != var2.field_l) {
              var2.field_z[0] = (var2.field_l.field_gb >> 1) + var2.field_l.field_sb;
              var2.field_z[1] = (var2.field_l.field_Db >> 1) + var2.field_l.field_ib;
            }
            if (null != var2.field_q) {
              var2.field_x[1] = var2.field_q.field_ib + (var2.field_q.field_Db >> 1);
              var2.field_x[0] = var2.field_q.field_sb + (var2.field_q.field_gb >> 1);
            }
            if (null != var2.field_p) {
              uj.a(param1, var2, var2.field_L, var2.field_p, 1);
            }
            if (var2.field_F != null) {
              uj.a(param1, var2, var2.field_z, var2.field_F, 1);
            }
            if (var2.field_D != null) {
              uj.a(param1, var2, var2.field_x, var2.field_D, 1);
            }
            if (kg.field_m < var2.field_H) {
              if ((1 & var2.field_v) != 0) {
                var2.field_J = var2.field_L[0] + bc.a(-var2.field_L[0] + var2.field_z[0], kg.field_m, var2.field_H, param0 + 13849);
                var2.field_C = var2.field_L[1] + bc.a(-var2.field_L[1] + var2.field_z[1], kg.field_m, var2.field_H, 13776);
              } else {
                var2.field_J = var2.field_z[0];
                var2.field_C = var2.field_z[1];
              }
              if (0 != (var2.field_v & 8)) {
                var2.field_w = bc.a(256, kg.field_m, var2.field_H, 13776);
              } else {
                var2.field_w = 256;
              }
              if ((4 & var2.field_v) != 0) {
                var2.field_E = ck.a((byte) -127, 4000, var2.field_y, kg.field_m) + 96;
              } else {
                if (0 != (var2.field_v & 2)) {
                  var2.field_E = 4096 + bc.a(2048, kg.field_m, var2.field_H, 13776);
                } else {
                  var2.field_E = 0;
                }
              }
            } else {
              if (kg.field_m >= var2.field_H + var2.field_B) {
                if (var2.field_y + var2.field_H + var2.field_B > kg.field_m) {
                  var3 = -var2.field_B - var2.field_H + kg.field_m;
                  if ((var2.field_r & 1) != 0) {
                    var2.field_J = var2.field_z[0] + bc.a(-var2.field_z[0] + var2.field_x[0], var3, var2.field_y, 13776);
                    var2.field_C = var2.field_z[1] + bc.a(-var2.field_z[1] + var2.field_x[1], var3, var2.field_y, 13776);
                  } else {
                    var2.field_C = var2.field_x[1];
                    var2.field_J = var2.field_x[0];
                  }
                  if ((8 & var2.field_r) != 0) {
                    var2.field_w = ec.a(32635, var2.field_y, -var3 + var2.field_y, 256);
                  } else {
                    var2.field_w = 256;
                  }
                  if ((4 & var2.field_r) == 0) {
                    if ((var2.field_r & 2) == 0) {
                      var2.field_E = 0;
                    } else {
                      var2.field_E = bc.a(2048, var3, var2.field_y, param0 + 13849) + 4096;
                    }
                  } else {
                    var2.field_E = 96 + ck.a((byte) -126, 4000, var2.field_y, -var3 + var2.field_y);
                  }
                }
              } else {
                var2.field_E = 0;
                var2.field_J = var2.field_z[0];
                var2.field_C = var2.field_z[1];
              }
            }
          } else {
            if (-1 != kg.field_m) {
              kg.field_m = -1;
            }
          }
          if (param0 != -73) {
            var5 = (uf) null;
            ep.a((byte) -7, (uf) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_63_0 = var2_ref;
          stackIn_63_1 = new StringBuilder().append("ep.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        fe.field_H[4] = true;
        if (param0 != -22045) {
          this.field_D = 101;
        }
    }

    final void l(byte param0) {
        int discarded$42 = 0;
        int discarded$43 = 0;
        int var3;
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        var3 = Pool.field_O;
        if (param0 > -64) {
          return;
        }
        if (gg.a(true)) {
          stackIn_10_1 = false;
          stackIn_11_2 = (ne.field_u != null);
          discarded$42 = this.a(stackIn_10_1, stackIn_11_2, -114);
        } else {
          if (sf.field_y >= 10) {
            if (!u.a(77)) {
              un.b(121);
            } else {
              if (fk.field_ab != 0) {
                ln.a(0, wp.field_d);
              } else {
                discarded$43 = this.a(false, false, -124);
              }
            }
          }
        }
    }

    private final void h(int param0) {
        if (param0 != 6) {
          this.l((byte) -16);
        }
        String var2 = ec.a(false);
        aj.a(hk.d(115), -18788, var2);
    }

    final int a(boolean param0, boolean param1) {
        if (param1) {
          return -1;
        }
        return this.a(true, param0, -105);
    }

    private final void d(int param0) {
        int var4 = 122 % ((-11 - param0) / 50);
        int var2 = kn.field_e.g(-74);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var5 = -1 + of.field_Pb;
        byte[] var6 = new byte[var5];
        kn.field_e.a(0, -109, var6, var5);
        jc.a(-10553, hk.d(70), a.a(var6, -99), var3 != 0);
    }

    private final int e(int param0) {
        int var2;
        if (this.field_n) {
          return -1;
        }
        if (!pk.b((byte) 109)) {
          return -1;
        }
        if (rg.field_v) {
          return -1;
        }
        var2 = np.a(false, sa.a(false), true, this.field_x, this.field_w, kg.c((byte) 121));
        if (param0 == ~var2) {
          return -1;
        }
        if (var2 == 0) {
          if (fk.field_ab == 11 &&
            0 == sk.field_a) {
            kh.f((byte) -50);
          }
        } else {
          if (1 == var2) {
            if (fk.field_ab == 11 &&
              0 == sk.field_a) {
              kh.f((byte) -50);
            }
          } else {
            if (!bi.field_f) {
              this.a((byte) 22, "reconnect");
            }
            de.c(param0 + 11);
            re.a(true, ke.field_g, var2);
            rg.field_v = true;
            ia.field_k = rl.a((byte) -93) + 15000L;
          }
        }
        return var2;
    }

    private final void j(int param0) {
        if (param0 < 27) {
          field_s = (dd) null;
        }
        fe.field_H[1] = true;
    }

    final void c(int param0, boolean param1) {
        int stackIn_26_0 = 0;
        int stackIn_102_0 = 0;
        boolean stackIn_103_1 = false;
        boolean stackIn_106_2 = false;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Pool.field_O;
        if (fk.field_gb != null) {
          if (ne.field_u == null) {
            var6 = hg.a(false);
            var4 = var6.getSize();
            fk.field_gb.a(var4.width, 51, var4.height);
          }
          fk.field_gb.a(true);
        }
        id.a(127);
        bo.a((byte) 123);
        if (!ue.a((byte) -124) &&
          fk.field_ab != 11) {
          t.b(-11);
        }
        if (null != oa.field_a) {
          wp.field_d = oa.field_a.b(2);
        }
        if (mg.a(-66)) {
          var3 = up.a(-21282) * 1200;
          if (this.field_C ||
            !(var3 >= nj.a(-21055)) &&
            !(sk.a((byte) 119) <= var3)) {
            this.field_C = false;
            dn.c(-80);
            de.c(param0 + 15);
            re.a(true, bm.field_l, 2);
            qr.c(640);
            rg.field_v = true;
            ia.field_k = 15000L + rl.a((byte) -101);
          }
        }
        if (param0 != -4) {
          this.a(true, false);
        }
        if (sk.field_a == -1 ||
          sk.field_a == 0) {
          stackIn_26_0 = (sk.field_a != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          sk.field_a = dp.b(-69);
          if (var3Lifetime1 != 0 &&
            sk.field_a == 0 &&
            11 == fk.field_ab &&
            !pk.b((byte) 109)) {
            kh.f((byte) 124);
          }
          if (-1 != sk.field_a &&
            sk.field_a != 0) {
            ia.field_k = rl.a((byte) -99) + 15000L;
          }
        }
        if (sk.field_a != -1 &&
          sk.field_a != 0) {
          if (10 <= sf.field_y) {
            if (fk.field_ab >= 10) {
              de.c(11);
              if (3 != sk.field_a) {
                if (sk.field_a != 4) {
                  if (sk.field_a == 2) {
                    re.a(true, hh.field_b, 256);
                  } else {
                    if (sk.field_a == 5) {
                      re.a(true, dk.field_h, 5);
                    } else {
                      re.a(true, bc.field_e, 256);
                    }
                  }
                } else {
                  re.a(true, cm.field_I, 256);
                }
              } else {
                re.a(true, br.field_L, 256);
              }
              rg.field_v = true;
            }
          } else {
            if (sk.field_a != 3) {
              if (sk.field_a != 4) {
                if (sk.field_a != 2) {
                  if (5 != sk.field_a) {
                    this.a((byte) -93, "js5connect");
                  } else {
                    this.a((byte) 103, "outofdate");
                  }
                } else {
                  this.a((byte) -30, "js5connect_full");
                }
              } else {
                this.a((byte) -2, "js5io");
              }
            } else {
              this.a((byte) -117, "js5crc");
            }
          }
        }
        if ((-1 != sk.field_a &&
          sk.field_a != 0 ||
          pk.b((byte) 109)) &&
          ia.field_k <= rl.a((byte) -126)) {
          rg.field_v = false;
          if (-1 != sk.field_a &&
            0 != sk.field_a) {
            sk.field_a = -1;
            wa.i((byte) 72);
          }
        }
        if (sk.field_a == 0 &&
          !pk.b((byte) 109)) {
          uh.field_o = false;
        }
        if (sf.field_y == 0 &&
          hi.e(-11071)) {
          sf.field_y = 1;
        }
        if (1 == sf.field_y) {
          if (gj.field_S != 0) {
            wh.field_a = fh.a(jd.field_d, (byte) 103);
          }
          uj.field_d = oq.a(false, -4, 1, pp.field_a, true);
          vf.field_nb = oq.a(false, -49, 1, ie.field_g, true);
          rg.field_r = oq.a(false, -40, 1, cj.field_eb, true);
          qp.field_Zb = vf.field_nb;
          sf.field_y = 2;
          sd.field_R = uj.field_d;
        }
        if (sf.field_y == 2) {
          if (wh.field_a != null &&
            wh.field_a.d(85)) {
            if (!wh.field_a.a((byte) -122, "")) {
              wh.field_a = null;
            } else {
              if (wh.field_a.a("", param0 ^ -4)) {
                nk.a(wh.field_a, -21013);
                wh.field_a = null;
                fm.a(0);
              }
            }
          }
          if (wh.field_a == null) {
            sf.field_y = 3;
          }
        }
        if (sf.field_y == 3 &&
          k.a(uj.field_d, vf.field_nb, rg.field_r, true) &&
          ab.a(rg.field_r, true)) {
          dn.d(8192);
          ia.a((byte) 98);
          am.field_n = o.field_A;
          mf.field_o = false;
          uf.a(param0 ^ 11934, bf.field_g, uj.field_d, rg.field_r, vf.field_nb);
          if (pd.field_g ||
            null != b.field_J) {
            stackIn_102_0 = -122;
            stackIn_103_1 = !(pd.field_g);
            stackIn_106_2 = !(pd.field_g);
            tg.a(stackIn_102_0, stackIn_103_1, stackIn_106_2, b.field_J);
          }
          if (sd.field_T) {
            al.m(4);
          }
          if (null == oh.field_c) {
            oh.field_c = vb.b(105);
            u.field_a = sq.g(108);
          }
          wj.a(rg.field_r, u.field_a, false, oh.field_c);
          rg.field_r = null;
          vf.field_nb = null;
          uj.field_d = null;
          pr.a(-23989, (java.applet.Applet) (this));
          fm.a(0);
          sf.field_y = 10;
        }
        if (sf.field_y == 10) {
          if (gj.field_S != 0) {
            kq.field_m = fh.a(mk.field_c, (byte) 103);
          }
          sf.field_y = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (sf.field_y == 11) {
          if (kq.field_m != null && (!kq.field_m.d(param0 ^ -52) ||
            !kq.field_m.c(param0 ^ 61))) {
            fo.a(hp.a(kq.field_m, ir.field_b, -641, ud.field_F), 0.0f, false);
            decompiledFrameRemainder0 = false;
          }
          else {
            od.field_c = true;
            sf.field_y = 12;
          }
        }
        if (sf.field_y == 12 &&
          !od.field_c) {
          sf.field_y = 13;
        }
        if (sf.field_y == 13) {
          var3Lifetime2 = 1;
          if (jl.field_e != null) {
            stackIn_138_0 = (!jl.field_e.b((byte) -51)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            fo.a(jl.field_e.field_m, jl.field_e.field_c, false);
          }
          if (var3Lifetime2 != 0) {
            sf.field_y = 20;
          }
        }
        if (!param1 &&
          wd.field_Sb) {
          he.a(pa.field_K, 0);
          this.f((byte) 86);
          kc.a(pa.field_K, 2);
        }
        if (fe.field_H[8]) {
          fd.h(119);
        }
    }

    private final void b(int param0, boolean param1) {
        fe.field_H[18] = true;
        fe.field_H[3] = true;
        fe.field_H[17] = true;
        fe.field_H[param0] = true;
        fe.field_H[7] = true;
        fe.field_H[16] = true;
        fe.field_H[8] = param1;
    }

    private final void i(byte param0) {
        r.field_m[4] = -1;
        r.field_m[2] = -2;
        r.field_m[16] = -1;
        r.field_m[8] = -2;
        r.field_m[13] = -1;
        r.field_m[3] = -1;
        r.field_m[9] = -1;
        r.field_m[18] = 1;
        r.field_m[12] = -1;
        r.field_m[17] = -1;
        r.field_m[1] = 16;
        r.field_m[6] = -2;
        r.field_m[5] = -1;
        r.field_m[7] = -1;
        r.field_m[10] = -1;
        r.field_m[11] = -1;
        if (param0 != -81) {
          this.field_u = 93;
        }
    }

    final static dd[] a(int param0, di param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uf var6 = null;
        dd[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 36) {
            var6 = (uf) null;
            ep.a((byte) -107, (uf) null);
          }
          var4_int = param1.b(param3, -1);
          var5 = param1.a(var4_int, 0, param2);
          stackIn_3_0 = im.a(var4_int, var5, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ep.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    protected ep() {
    }

    final int k(byte param0) {
        int var2;
        int var3;
        var2 = -86 % ((param0 + 81) / 39);
        var3 = this.e(0);
        if (var3 == 0 ||
          var3 == 1) {
          if (fe.field_H[1]) {
            tp.a(true, 2);
          }
          if (fe.field_H[2]) {
            eh.a(3, true);
          }
          if (fe.field_H[3]) {
            db.a((byte) 58, 4);
          }
          if (fe.field_H[4]) {
            af.a(5, true);
          }
          if (fe.field_H[5]) {
            um.a(10, 6);
          }
          if (fe.field_H[6]) {
            nk.a(7, (byte) -91);
          }
          if (fe.field_H[8]) {
            rq.c(946);
          }
        }
        return var3;
    }

    static {
        field_G = "Nine-ball Tutorial";
        field_v = "This is <%0>'s RuneScape clan if they have one.";
        field_z = false;
        field_p = "Report <%0> for abuse";
        field_s = new dd(360, 240);
        field_y = "Log in / Create account";
    }
}
