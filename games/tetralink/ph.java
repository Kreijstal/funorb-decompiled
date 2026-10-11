/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ph extends bg {
    static boolean field_s;
    static String field_A;
    private int field_q;
    private boolean field_H;
    private int field_B;
    private int field_u;
    private boolean field_o;
    private int field_p;
    String field_y;
    private int field_G;
    private boolean field_r;
    private int field_v;
    private long field_E;
    static je field_F;
    static int field_z;
    static String field_D;
    static rb field_t;
    static String field_w;
    static String field_x;
    static String[] field_C;

    private final void a(int param0, String param1, int param2, int param3, int param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        try {
          try {
            if (!this.a((byte) -128)) {
              return;
            }
            this.field_y = this.getCodeBase().getHost();
            var11 = this.field_y.toLowerCase();
            stackIn_8_1 = (var11.equals("jagex.com")) || (var11.endsWith(".jagex.com"));
            this.field_r = stackIn_8_1;
            this.field_v = Integer.parseInt(this.getParameter("gameport1"));
            this.field_G = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_B = Integer.parseInt(var7);
            }
            this.field_q = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_E = Long.parseLong(this.getParameter("instanceid"));
            this.field_H = this.getParameter("member").equals("yes");
            if (param4 <= 41) {
              this.field_E = 51L;
            }
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_u = Integer.parseInt(var8);
            }
            if (this.field_u >= 5) {
              this.field_u = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_p = Integer.parseInt(var9);
            }
            i.field_w = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param3, (byte) 124, param1, param0, 32, param2, this.field_q);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            fk.a(-95, (Throwable) ((Object) var6), (String) null);
            this.a(24044, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref;
          stackIn_26_1 = new StringBuilder().append("ph.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        int var2 = kb.field_q.d((byte) -99);
        if (param0) {
          this.field_o = true;
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = rl.field_d - 1;
        byte[] var5 = new byte[var4];
        kb.field_q.a(116, var5, 0, var4);
        oi.a((byte) -60, ud.a(var5, -107), var3 != 0, lk.q(13));
    }

    final void a(String param0, int param1, int param2) {
        try {
          this.a(param1, param0, 480, param2, 124);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ph.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(boolean param0) {
        hc.field_u[2] = param0;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, byte param6) {
        this.c(param6 + 24, true);
        if (param2) {
          this.k(-7);
        }
        if (param6 != -6) {
          this.i(-86);
        }
        if (param4) {
          this.c(true);
        }
        if (param5) {
          this.j(29668);
        }
        if (param0) {
          this.e(true);
        }
        if (param3) {
          this.m(27840);
        }
        if (param1) {
          this.d((byte) 30);
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        th.field_l = this.field_u;
        wa.a(th.field_l, true);
        t.a(this.field_H, nd.field_Pb, this.field_E, th.field_l, 5000, this.field_G, this.field_B, 5000, this.field_v, (byte) 118, param0, this.field_y, param4, this.field_q);
        gi.a(this.field_B, this.field_q, 1, th.field_l, nd.field_Pb, this.field_v, this.field_y, this.field_G, param0);
        wd.a(false);
        qf.field_k = ed.e((byte) 124);
        da.a((byte) -70, uh.field_b);
        jg.field_a = param1;
        kd.field_l = param7;
        il.field_R = param2;
        fl.field_g = param6;
        ai.field_b = param5;
        this.l(-6848);
        l.a(param3 ^ param3);
    }

    private final void d(byte param0) {
        hc.field_u[11] = true;
        int var2 = 22 / ((param0 + 56) / 55);
        hc.field_u[13] = true;
        hc.field_u[12] = true;
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          Exception var6 = null;
          bh var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var5Lifetime2;
          int var5Lifetime3;
          var9 = TetraLink.field_J;
          var4 = wk.a(15658734, param1, hc.field_p, th.field_l);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5 = a.a(cf.a(113), fl.e(1), (byte) -62);
            if (var5 != -1) {
              g.a(og.field_h, tg.field_d, var5, (byte) 3);
              tg.field_d = null;
              og.field_h = null;
            }
            var12 = gh.a((byte) 116);
            if (var12 != null) {
              ec.a(var12.booleanValue(), 124);
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = nd.a(this.field_p, rb.c(false), sa.a((byte) -68), i.e(122), ka.c((byte) -114), qa.c((byte) -97), -8769);
            if (var5Lifetime1 != -1) {
              ki.a(var5Lifetime1, tg.field_d, og.field_h, -106);
              tg.field_d = null;
              og.field_h = null;
            }
          }
          if (3 == var4) {
            if (a.field_h != -1 &&
              a.field_h != 0) {
              a.field_h = -1;
              ml.o(0);
            }
            if (param2) {
              jm.field_b = false;
            } else {
              var5Lifetime2 = hn.a(this.field_r, ka.c((byte) 22), -2472, false, this.field_p, sa.a((byte) -107));
              if (var5Lifetime2 != -1) {
                if (var5Lifetime2 == 0) {
                  kk.field_U = ua.field_g;
                  bk.a(1);
                  bh.field_r = false;
                  fn.field_R = 10;
                } else {
                  fi.a(tg.field_d, var5Lifetime2, (byte) 20);
                  tg.field_d = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (pg.field_m) {
              ia.a(lk.q(13), false);
            } else {
              fn.field_R = 10;
              bh.field_r = true;
            }
          }
          if (var4 == 5) {
            ma.a(lk.q(13), (byte) 34);
          }
          if (var4 == 6 &&
            k.field_c) {
            fn.field_R = 10;
          }
          if (var4 == 7) {
            jd.a(lk.q(13), (byte) -126);
          }
          var5Lifetime3 = 77 / ((81 - param0) / 34);
          if (var4 == 8) {
            ia.a(lk.q(13), false);
          }
          if (var4 == 9) {
            el.a(16, lk.q(13));
          }
          if (var4 == 10) {
            nd.field_Lb.f(17, (byte) -92);
          }
          if (11 == var4) {
            in.a(lk.q(13), 63);
          }
          if (12 == var4) {
            ha.a(-119, sn.b(11137), lk.q(13));
          }
          if (var4 == 13) {
            try {
              if (null == af.field_g) {
                af.field_g = new un(nd.field_Pb, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (af.field_g.b((byte) -75)) {
                var7 = af.field_g.a((byte) 79);
                if (var7 != null) {
                  var8 = cl.a(-1095, var7.field_t, var7.field_u, 0);
                  ci.a(var8, -14710);
                } else {
                  var10 = (String) null;
                  ci.a((String) null, -14710);
                }
                af.field_g = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              fk.a(-54, (Throwable) ((Object) var6), "S1");
              var11 = (String) null;
              ci.a((String) null, -14710);
              af.field_g = null;
            }
          }
          if (var4 == 15) {
            fn.field_R = 10;
          }
          if (var4 == 16) {
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

    public static void o(int param0) {
        field_D = null;
        field_t = null;
        field_C = null;
        field_w = null;
        if (param0 != -6) {
          field_w = (String) null;
        }
        field_A = null;
        field_x = null;
        field_F = null;
    }

    final int n(int param0) {
        int var2;
        if (this.field_b) {
          return -1;
        }
        if (!ca.c(-25945)) {
          return -1;
        }
        if (jm.field_b) {
          return -1;
        }
        var2 = hn.a(this.field_r, ka.c((byte) -80), -2472, true, this.field_p, sa.a((byte) -94));
        if (var2 == -1) {
          return -1;
        }
        if (param0 != ~var2 &&
          var2 != 1) {
          if (!fa.field_e) {
            this.a(24044, "reconnect");
          }
          sd.q(param0 + 27113);
          fi.a(tg.field_d, var2, (byte) 20);
          jm.field_b = true;
          hk.field_c = 15000L + k.a(0);
          return var2;
        }
        if (fn.field_R != 11) {
          return var2;
        }
        if (a.field_h != 0) {
          return var2;
        }
        bk.a(1);
        return var2;
    }

    final int a(boolean param0, byte param1) {
        if (param1 != -108) {
          this.b(-79, true);
        }
        return this.a(param1 + 111, param0, true);
    }

    private final void m(int param0) {
        hc.field_u[6] = true;
        if (param0 != 27840) {
          this.k(63);
        }
    }

    private final void e(boolean param0) {
        hc.field_u[5] = param0;
    }

    final void c(byte param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var3;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        var3 = TetraLink.field_J;
        if (!ac.a(-19403)) {
          if (vd.field_a >= 10) {
            if (!me.a((byte) -99)) {
              vh.b(-57);
            } else {
              if (fn.field_R == 0) {
                discarded$6 = this.a(-37, false, false);
              } else {
                t.b(hc.field_p, -21901);
              }
            }
          }
        } else {
          stackIn_3_1 = 116;
          stackIn_4_2 = (null != hd.field_u);
          discarded$7 = this.a(stackIn_3_1, stackIn_4_2, false);
        }
        if (param0 > -19) {
          this.n(2);
        }
    }

    private final void j(int param0) {
        hc.field_u[4] = true;
        if (param0 != 29668) {
          this.field_G = -48;
        }
    }

    private final void l(int param0) {
        if (param0 == -6848) {
          je.field_b[18] = 1;
          je.field_b[8] = -2;
          je.field_b[3] = -1;
          je.field_b[9] = -1;
          je.field_b[2] = -2;
          je.field_b[5] = -1;
          je.field_b[17] = -1;
          je.field_b[4] = -1;
          je.field_b[1] = 16;
          je.field_b[11] = -1;
          je.field_b[12] = -1;
          je.field_b[13] = -1;
          je.field_b[7] = -1;
          je.field_b[6] = -2;
          je.field_b[10] = -1;
          je.field_b[16] = -1;
          return;
        }
    }

    final void d(boolean param0) {
        boolean stackIn_26_1 = false;
        int stackIn_30_0 = 0;
        Object stackIn_30_1 = null;
        StringBuilder stackIn_30_2 = null;
        boolean stackIn_31_3;
        int stackIn_36_0 = 0;
        boolean stackIn_37_1 = false;
        int var2;
        fj var3;
        int var4;
        var4 = TetraLink.field_J;
        var2 = ua.field_c;
        if (var2 < 64 &&
          hc.field_u[var2]) {
          if (var2 == 0) {
            return;
          }
          L1: {
            switch (var2) {
              case 1:
                fn.h(-1);
                break;
              case 2:
                i.c(1);
                break;
              case 3:
                dg.d(-1);
                break;
              case 8:
                qf.a(rl.field_d, 4, kb.field_q, nd.field_Pb);
                break;
              default:
                if (var2 != 11 &&
                  var2 != 12) {
                  switch (var2) {
                    case 13:
                      wc.h(1);
                      break L1;
                    case 17:
                      stackIn_26_1 = !(param0);
                      this.b(stackIn_26_1);
                      break L1;
                    case 18:
                      ua.a(-1);
                      break L1;
                    default:
                      stackIn_30_0 = -111;
                      stackIn_30_1 = null;
                      stackIn_30_2 = new StringBuilder().append("MGS1: ");
                      stackIn_31_3 = !(param0);
                      fk.a(stackIn_30_0, (Throwable) (stackIn_30_1), ((StringBuilder) (Object) stackIn_30_2).append(hc.a(stackIn_31_3)).toString());
                      mk.a(false);
                      break L1;
                  }
                }
                stackIn_36_0 = 85;
                stackIn_37_1 = (var2 == 12);
                var3 = wg.$cfr$intArgs$a$b26581e72faf(stackIn_36_0, stackIn_37_1);
                ao.a(var3, -127);
                break;
              case 16:
                pe.a((byte) 58);
                break;
              case 7:
                this.i(92);
                break;
              case 6:
                oj.b((byte) -122);
                break;
              case 5:
                se.a(false);
                break;
              case 4:
                vg.d((byte) 78);
                break;
            }
          }
          if (!param0) {
            field_A = (String) null;
          }
          return;
        }
        fk.a(-72, (Throwable) null, "MGS2: " + hc.a(false));
        mk.a(false);
    }

    protected ph() {
    }

    private final void i(int param0) {
        String var2 = ll.f(0);
        ld.a(var2, lk.q(13), -1);
        if (param0 < 40) {
          this.a(false, true, false, true, false, true, (byte) 49);
        }
    }

    final void b(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        boolean stackIn_105_0 = false;
        String stackIn_107_1 = null;
        int stackIn_107_2 = 0;
        boolean stackIn_108_3;
        int stackIn_139_0 = 0;
        int var3;
        java.awt.Dimension var4_ref_java_awt_Dimension;
        int var4;
        int var5;
        java.awt.Container var6;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = TetraLink.field_J;
        if (null != hn.field_M) {
          if (hd.field_u == null) {
            var6 = pj.a((byte) -26);
            var4_ref_java_awt_Dimension = var6.getSize();
            hn.field_M.a(var4_ref_java_awt_Dimension.height, var4_ref_java_awt_Dimension.width, (byte) 37);
          }
          hn.field_M.b(29768);
        }
        je.a(13397);
        qb.a(false);
        var3 = -117 / ((param0 - 84) / 32);
        if (!rm.a(false) &&
          11 != fn.field_R) {
          mf.a(0);
        }
        if (qf.field_k != null) {
          hc.field_p = qf.field_k.a(12224);
        }
        if (r.d(0)) {
          var4 = va.a(-1) * 1200;
          if (this.field_o ||
            !(var4 >= pm.a((byte) 26)) &&
            !(nn.i(78) <= var4)) {
            this.field_o = false;
            mk.a(false);
            sd.q(27112);
            fi.a(dh.field_c, 2, (byte) 20);
            dl.a(18278);
            jm.field_b = true;
            hk.field_c = 15000L + k.a(0);
          }
        }
        boolean decompiledFrameRemainder1 = true;
        if (a.field_h == -1 ||
          a.field_h == 0) {
          stackIn_24_0 = (a.field_h != -1) ? 0 : 1;
          var4Lifetime1 = stackIn_24_0;
          a.field_h = pb.a(true);
          if (var4Lifetime1 != 0) {
            if (0 == a.field_h) {
              if (fn.field_R != 11) {
                if (((-1 != a.field_h)) &&
                  ((a.field_h != 0))) {
                  hk.field_c = k.a(0) + 15000L;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (!ca.c(-25945)) {
                  bk.a(1);
                }
              }
            }
            if ((decompiledFrameRemainder1) && (-1 != a.field_h &&
              a.field_h != 0)) {
              hk.field_c = k.a(0) + 15000L;
            }
          } else {
            if (-1 != a.field_h &&
              a.field_h != 0) {
              hk.field_c = k.a(0) + 15000L;
            }
          }
        }
        if (-1 != a.field_h &&
          a.field_h != 0) {
          if (vd.field_a < 10) {
            if (a.field_h != 3) {
              if (4 != a.field_h) {
                if (a.field_h != 2) {
                  if (5 == a.field_h) {
                    this.a(24044, "outofdate");
                  } else {
                    this.a(24044, "js5connect");
                  }
                } else {
                  this.a(24044, "js5connect_full");
                }
              } else {
                this.a(24044, "js5io");
              }
            } else {
              this.a(24044, "js5crc");
            }
          } else {
            if (fn.field_R >= 10) {
              sd.q(27112);
              if (a.field_h != 3) {
                if (4 != a.field_h) {
                  if (a.field_h == 2) {
                    fi.a(je.field_g, 256, (byte) 20);
                  } else {
                    if (a.field_h != 5) {
                      fi.a(ul.field_a, 256, (byte) 20);
                    } else {
                      fi.a(ia.field_O, 5, (byte) 20);
                    }
                  }
                } else {
                  fi.a(ej.field_p, 256, (byte) 20);
                }
              } else {
                fi.a(ea.field_c, 256, (byte) 20);
              }
              jm.field_b = true;
            }
          }
        }
        if ((-1 != a.field_h &&
          a.field_h != 0 ||
          ca.c(-25945)) &&
          k.a(0) >= hk.field_c) {
          jm.field_b = false;
          if (a.field_h != -1 &&
            0 != a.field_h) {
            a.field_h = -1;
            ml.o(0);
          }
        }
        if (a.field_h == 0 &&
          !ca.c(-25945)) {
          n.field_Q = false;
        }
        if (vd.field_a == 0 &&
          bn.a(21747)) {
          vd.field_a = 1;
        }
        if (1 == vd.field_a) {
          if (th.field_l != 0) {
            d.field_i = ve.b(57, il.field_R);
          }
          rm.field_i = pl.a(fl.field_g, true, false, 1, (byte) -85);
          ib.field_a = pl.a(jg.field_a, true, false, 1, (byte) -100);
          q.field_b = pl.a(kd.field_l, true, false, 1, (byte) -93);
          sb.field_a = ib.field_a;
          v.field_v = rm.field_i;
          vd.field_a = 2;
        }
        if (2 == vd.field_a) {
          if (d.field_i != null &&
            d.field_i.c(120)) {
            if (!d.field_i.a("", 0)) {
              d.field_i = null;
            } else {
              if (d.field_i.a("", (byte) -76)) {
                gi.a(1, d.field_i);
                d.field_i = null;
                rk.c(-8243);
              }
            }
          }
          if (d.field_i == null) {
            vd.field_a = 3;
          }
        }
        if (vd.field_a == 3 &&
          da.a(rm.field_i, ib.field_a, 97, q.field_b) &&
          sd.a((byte) -68, q.field_b)) {
          rn.a(1);
          bg.c(67);
          bn.field_a = kl.field_f;
          k.field_c = false;
          fa.a(rm.field_i, pg.field_m, q.field_b, ib.field_a, (byte) 91);
          if (nl.field_j ||
            null != vg.field_Pb) {
            stackIn_105_0 = !(nl.field_j);
            stackIn_107_1 = vg.field_Pb;
            stackIn_107_2 = 93;
            stackIn_108_3 = !(nl.field_j);
            hn.a(stackIn_105_0, stackIn_107_1, stackIn_107_2, stackIn_108_3);
          }
          if (i.field_w) {
            vg.i(5959);
          }
          if (null == rl.field_f) {
            rl.field_f = im.a(28357);
            ci.field_z = fa.a(-116);
          }
          ni.a(q.field_b, rl.field_f, ci.field_z, (byte) -5);
          rm.field_i = null;
          q.field_b = null;
          ib.field_a = null;
          pk.a(-73, (java.applet.Applet) (this));
          rk.c(-8243);
          vd.field_a = 10;
        }
        if (10 == vd.field_a) {
          if (0 != th.field_l) {
            um.field_k = ve.b(118, ai.field_b);
          }
          vd.field_a = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == vd.field_a) {
          if (null != um.field_k && (!um.field_k.c(124) ||
            !um.field_k.a(false))) {
            ak.a(0, fn.a(0, um.field_k, eg.field_N, nj.field_e), 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            oa.field_w = true;
            vd.field_a = 12;
          }
        }
        if (vd.field_a == 12 &&
          !oa.field_w) {
          vd.field_a = 13;
        }
        if (vd.field_a == 13) {
          var4Lifetime2 = 1;
          if (en.field_L != null) {
            stackIn_139_0 = (!en.field_L.a(-1210)) ? 0 : 1;
            var4Lifetime2 = stackIn_139_0;
            ak.a(0, en.field_L.field_e, en.field_L.field_f);
          }
          if (var4Lifetime2 != 0) {
            vd.field_a = 20;
          }
        }
        if (!param1 &&
          ha.field_h) {
          oa.a((byte) -117, uh.field_b);
          this.d(-66);
          da.a((byte) -118, uh.field_b);
        }
        if (hc.field_u[8]) {
          dh.a(true);
        }
    }

    private final void c(int param0, boolean param1) {
        hc.field_u[16] = true;
        hc.field_u[8] = param1;
        hc.field_u[17] = true;
        hc.field_u[7] = true;
        hc.field_u[0] = true;
        hc.field_u[3] = true;
        hc.field_u[param0] = true;
    }

    private final void k(int param0) {
        if (param0 != -7) {
          return;
        }
        hc.field_u[1] = true;
    }

    static {
        field_A = "Wins";
        field_F = new je();
        field_D = "Not yet achieved";
        field_z = -1;
        field_x = "Achievements";
        field_C = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
