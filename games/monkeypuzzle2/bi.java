/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi extends fc {
    String field_u;
    private boolean field_t;
    static char[] field_s;
    private int field_r;
    private int field_o;
    private boolean field_q;
    private int field_v;
    private long field_w;
    private boolean field_y;
    static int[] field_B;
    static long field_z;
    private int field_x;
    private int field_p;
    private int field_n;

    private final void g(int param0) {
        ok.field_c[8] = -2;
        ok.field_c[5] = -1;
        ok.field_c[2] = -2;
        ok.field_c[4] = -1;
        if (param0 >= -48) {
          this.a(true, 104);
        }
        ok.field_c[12] = -1;
        ok.field_c[7] = -1;
        ok.field_c[13] = -1;
        ok.field_c[1] = 16;
        ok.field_c[11] = -1;
        ok.field_c[10] = -1;
        ok.field_c[9] = -1;
        ok.field_c[16] = -1;
        ok.field_c[6] = -2;
        ok.field_c[17] = -1;
        ok.field_c[3] = -1;
        ok.field_c[18] = 1;
    }

    public static void d(byte param0) {
        field_B = null;
        int var1 = 73 / ((param0 - 41) / 55);
        field_s = null;
    }

    final static am a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        am stackIn_3_0 = null;
        am stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 != 5000) {
            stackIn_3_0 = (am) null;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (57 < var4) {
              return null;
            }
          }
          stackIn_13_0 = lh.field_c;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("bi.R(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final int f(int param0) {
        int var2;
        var2 = this.j(param0 ^ 8214);
        if (var2 == 0 ||
          1 == var2) {
          if (eg.field_k[1]) {
            wi.a(2, param0 ^ 1198);
          }
          if (eg.field_k[2]) {
            db.a(3, 126);
          }
          if (eg.field_k[3]) {
            d.a(4, param0 + 2);
          }
          if (eg.field_k[4]) {
            qi.a(false, 5);
          }
          if (eg.field_k[5]) {
            wd.a(6, true);
          }
          if (eg.field_k[6]) {
            sl.a(7, (byte) 63);
          }
          if (eg.field_k[8]) {
            df.f((byte) -98);
          }
        }
        if (param0 != 3) {
          this.field_w = -33L;
        }
        return var2;
    }

    final int a(boolean param0, int param1) {
        if (param1 != 4) {
          this.a(34, true);
        }
        return this.a(true, true, param0);
    }

    private final void d(boolean param0) {
        eg.field_k[4] = true;
        if (param0) {
          field_s = (char[]) null;
        }
    }

    private final void e(byte param0) {
        eg.field_k[2] = true;
        if (param0 > -79) {
          this.field_u = (String) null;
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = pl.a((byte) 100, param0);
            if (param1 != 20558) {
              field_B = (int[]) null;
            }
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (!ok.a(-121, var4.charAt(0)) &&
              !ok.a(-77, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              for (var6 = 0; var6 < param0.length(); var6++) {
                var7 = param0.charAt(var6);
                if (ok.a(-113, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("bi.P(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        eg.field_k[18] = true;
        eg.field_k[7] = true;
        eg.field_k[8] = param1;
        eg.field_k[16] = true;
        if (param0 != -2) {
          return;
        }
        eg.field_k[3] = true;
        eg.field_k[17] = true;
        eg.field_k[0] = true;
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        if (param1 != 4472) {
          return;
        }
        this.a(-2, false);
        if (param0) {
          this.e(19887);
        }
        if (param2) {
          this.e((byte) -121);
        }
        if (param3) {
          this.d(false);
        }
        if (param4) {
          this.h(9);
        }
    }

    private final void f(byte param0) {
        int var3 = 83 / ((param0 - 76) / 33);
        String var2 = lh.a((byte) -110);
        mk.a(var2, (byte) -5, ii.a(false));
    }

    final void i(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 250) {
          return;
        }
        if (vg.c(false)) {
          discarded$1 = this.a(false, true, null != ba.field_f ? true : false);
        } else {
          if (mc.field_a < 10) {
          } else {
            if (!ub.b(true)) {
              ak.a((byte) 99);
            } else {
              if (k.field_g == 0) {
                discarded$3 = this.a(false, true, false);
              } else {
                b.a(-21342, ab.field_d);
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, String param2, boolean param3, int param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
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
            if (!this.b((byte) -66)) {
              return;
            }
            this.field_u = this.getCodeBase().getHost();
            var6 = this.field_u.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_y = stackIn_7_1;
            if (!param3) {
              this.i(-89);
            }
            this.field_r = Integer.parseInt(this.getParameter("gameport1"));
            this.field_x = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_v = Integer.parseInt(var7);
            }
            this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_w = Long.parseLong(this.getParameter("instanceid"));
            this.field_t = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_o = Integer.parseInt(var8);
            }
            if (this.field_o >= 5) {
              this.field_o = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_n = Integer.parseInt(var9);
            }
            la.field_o = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param0, param4, this.field_p, param1, 32, param2, (byte) -48);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            kk.a((String) null, (byte) 110, (Throwable) ((Object) var6_ref));
            this.a((byte) 87, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var6_ref2;
          stackIn_24_1 = new StringBuilder().append("bi.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, boolean param1) {
        int stackIn_27_0 = 0;
        boolean stackIn_110_0 = false;
        int stackIn_112_1 = 0;
        boolean stackIn_113_2 = false;
        int stackIn_143_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (ci.field_a != null) {
          if (ba.field_f == null) {
            var6 = hd.b(true);
            var4 = var6.getSize();
            ci.field_a.a(-124, var4.width, var4.height);
          }
          ci.field_a.b(param0 ^ -73);
        }
        kc.a((byte) 93);
        db.a(param0 - 99);
        if (!wj.d(-106) &&
          k.field_g != 11) {
          cd.b(110);
        }
        if (eb.field_A != null) {
          ab.field_d = eb.field_A.a(true);
        }
        if (param0 != 99) {
          this.field_v = -121;
        }
        if (cb.a(false)) {
          var3 = 1200 * gg.c(0);
          if (this.field_q ||
            !(var3 >= qa.b(125)) &&
            !(var3 >= rh.a(1))) {
            this.field_q = false;
            gk.a(-1);
            cf.a((byte) 108);
            pc.a((byte) -46, 2, dc.field_b);
            dd.a(0);
            qj.field_J = true;
            ha.field_ab = 15000L + pf.a(0);
          }
        }
        if (bl.field_m == -1 ||
          bl.field_m == 0) {
          stackIn_27_0 = (bl.field_m != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_27_0;
          bl.field_m = kh.a((byte) -93);
          if (var3Lifetime1 != 0 &&
            bl.field_m == 0 &&
            11 == k.field_g &&
            !ld.b(true)) {
            db.a(false);
          }
          if (bl.field_m != -1 &&
            bl.field_m != 0) {
            ha.field_ab = pf.a(param0 - 99) + 15000L;
          }
        }
        if (bl.field_m != -1 &&
          0 != bl.field_m) {
          if (mc.field_a < 10) {
            if (bl.field_m != 3) {
              if (bl.field_m != 4) {
                if (bl.field_m != 2) {
                  if (bl.field_m != 5) {
                    this.a((byte) 105, "js5connect");
                  } else {
                    this.a((byte) 58, "outofdate");
                  }
                } else {
                  this.a((byte) 82, "js5connect_full");
                }
              } else {
                this.a((byte) 123, "js5io");
              }
            } else {
              this.a((byte) 62, "js5crc");
            }
          } else {
            if (10 <= k.field_g) {
              cf.a((byte) 92);
              if (bl.field_m == 3) {
                pc.a((byte) -46, 256, qi.field_A);
              } else {
                if (bl.field_m != 4) {
                  if (bl.field_m != 2) {
                    if (5 != bl.field_m) {
                      pc.a((byte) -46, 256, me.field_h);
                    } else {
                      pc.a((byte) -46, 5, sc.field_b);
                    }
                  } else {
                    pc.a((byte) -46, 256, vi.field_a);
                  }
                } else {
                  pc.a((byte) -46, 256, ia.field_c);
                }
              }
              qj.field_J = true;
            }
          }
        }
        if ((bl.field_m != -1 &&
          0 != bl.field_m ||
          ld.b(true)) &&
          pf.a(param0 - 99) >= ha.field_ab) {
          qj.field_J = false;
          if (-1 != bl.field_m &&
            bl.field_m != 0) {
            bl.field_m = -1;
            ff.a(64);
          }
        }
        if (bl.field_m == 0 &&
          !ld.b(true)) {
          lh.field_e = false;
        }
        if (mc.field_a == 0 &&
          gh.a(false)) {
          mc.field_a = 1;
        }
        if (mc.field_a == 1) {
          if (fe.field_h != 0) {
            ec.field_a = ol.a(-107, pl.field_g);
          }
          fj.field_B = b.a(false, 1, true, ph.field_c, (byte) 125);
          hf.field_a = b.a(false, 1, true, nd.field_e, (byte) -118);
          ii.field_m = b.a(false, 1, true, uk.field_q, (byte) -51);
          mc.field_a = 2;
          wj.field_j = fj.field_B;
          ri.field_a = hf.field_a;
        }
        if (mc.field_a == 2) {
          if (ec.field_a != null &&
            ec.field_a.a(73)) {
            if (!ec.field_a.b("", (byte) -111)) {
              ec.field_a = null;
            } else {
              if (ec.field_a.a(0, "")) {
                ll.a(2, ec.field_a);
                ec.field_a = null;
                oe.a((byte) 119);
              }
            }
          }
          if (ec.field_a == null) {
            mc.field_a = 3;
          }
        }
        if (mc.field_a == 3 &&
          di.a(fj.field_B, hf.field_a, ii.field_m, (byte) 104) &&
          al.a(ii.field_m, (byte) 39)) {
          pb.a(false);
          dj.b(param0 ^ -25469);
          cf.field_c = false;
          be.field_d = j.field_h;
          lc.a(fj.field_B, mb.field_c, hf.field_a, param0 + 3249773, ii.field_m);
          if (sd.field_d ||
            kg.field_d != null) {
            stackIn_110_0 = !(sd.field_d);
            stackIn_112_1 = 98;
            stackIn_113_2 = !(sd.field_d);
            bd.$cfr$intArgs$a$b1efba5c64a3(stackIn_110_0, stackIn_112_1, stackIn_113_2, kg.field_d);
          }
          if (la.field_o) {
            il.a(true);
          }
          if (null == dk.field_e) {
            dk.field_e = vd.a(false);
            fa.field_p = ne.a(param0 ^ -100);
          }
          fc.a(dk.field_e, (byte) 111, ii.field_m, fa.field_p);
          ii.field_m = null;
          fj.field_B = null;
          hf.field_a = null;
          uc.a((java.applet.Applet) (this), 0);
          oe.a((byte) 112);
          mc.field_a = 10;
        }
        if (mc.field_a == 10) {
          if (fe.field_h != 0) {
            ch.field_j = ol.a(-102, r.field_e);
          }
          mc.field_a = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (mc.field_a == 11) {
          if (ch.field_j != null && (!ch.field_j.a(-124) ||
            !ch.field_j.b(0))) {
            ad.a(ec.a(ch.field_j, ug.field_b, tk.field_a, 0), param0 ^ -24150, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            mc.field_a = 12;
            pl.field_d = true;
          }
        }
        if (mc.field_a == 12 &&
          !pl.field_d) {
          mc.field_a = 13;
        }
        if (13 == mc.field_a) {
          var3Lifetime2 = 1;
          if (lb.field_C != null) {
            stackIn_143_0 = (!lb.field_C.a(28296)) ? 0 : 1;
            var3Lifetime2 = stackIn_143_0;
            ad.a(lb.field_C.field_g, -24119, lb.field_C.field_b);
          }
          if (var3Lifetime2 != 0) {
            mc.field_a = 20;
          }
        }
        if (!param1 &&
          aj.field_c) {
          vh.a(ie.field_e, (byte) -115);
          this.a(false);
          af.a(20, ie.field_e);
        }
        if (eg.field_k[8]) {
          ei.b(param0 - 91);
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
          this.a(param0, 480, param2, true, 640);
          if (param1 < 124) {
            this.field_o = 99;
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "bi.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void h(int param0) {
        if (param0 != 9) {
          return;
        }
        eg.field_k[5] = true;
    }

    final static boolean a(byte param0, gk param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 18 / ((46 - param0) / 57);
          var3 = param1.a((byte) 114);
          stackIn_3_0 = (var3 == 1) ? 1 : 0;
          var4 = stackIn_3_0;
          stackIn_4_0 = var4;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("bi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param4 != -25172) {
          this.field_x = -97;
        }
        fe.field_h = this.field_o;
        jg.a(3860, fe.field_h);
        kj.a(fe.field_h, this.field_x, this.field_t, 5000, param0, this.field_p, this.field_u, this.field_w, param5, 5000, this.field_v, (byte) -111, this.field_r, rc.field_k);
        ii.a(rc.field_k, this.field_u, this.field_x, fe.field_h, this.field_r, param0, this.field_p, this.field_v, -2045);
        sj.a(92);
        eb.field_A = cf.a(param4 + 25427);
        af.a(20, ie.field_e);
        pl.field_g = param3;
        r.field_e = param1;
        nd.field_e = param7;
        uk.field_q = param6;
        ph.field_c = param2;
        this.g(param4 ^ 25184);
        re.b(75);
    }

    final void k(int param0) {
        boolean stackIn_32_0 = false;
        int var2;
        hl var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = wk.field_a;
        if (var2 < 64 &&
          eg.field_k[var2]) {
          if (param0 != -28710) {
            this.g(-13);
          }
          if (0 == var2) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              p.b(-79);
            } else {
              if (var2 == 3) {
                hh.c(true);
              } else {
                if (4 == var2) {
                  gd.a((byte) 8);
                } else {
                  if (var2 == 5) {
                    sc.a(false);
                  } else {
                    if (var2 != 6) {
                      if (var2 == 7) {
                        this.f((byte) 115);
                      } else {
                        if (8 != var2) {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                rh.l(78);
                                return;
                              }
                              if (var2 == 17) {
                                this.l(15);
                                return;
                              }
                              if (var2 == 18) {
                                uc.a(62);
                                return;
                              }
                              kk.a("MGS1: " + bh.a((byte) -49), (byte) 120, (Throwable) null);
                              gk.a(-1);
                              return;
                            }
                            stackIn_32_0 = (var2 == 12);
                            var3 = si.a(stackIn_32_0, 0);
                            cd.a(var3, (byte) 20);
                          } else {
                            lg.a((byte) 122);
                          }
                        } else {
                          hk.a(MonkeyPuzzle2.field_D, rc.field_k, -1, rc.field_f);
                        }
                      }
                    } else {
                      m.a((byte) -106);
                    }
                  }
                }
              }
            }
          } else {
            t.i(-118);
          }
          return;
        }
        kk.a("MGS2: " + bh.a((byte) -38), (byte) 66, (Throwable) null);
        gk.a(param0 + 28709);
    }

    private final int j(int param0) {
        if (this.field_l) {
          return -1;
        }
        if (!ld.b(true)) {
          return -1;
        }
        if (qj.field_J) {
          return -1;
        }
        if (param0 != 8213) {
          this.field_p = -31;
        }
        int var2 = ad.a(this.field_n, 650, this.field_y, true, mk.e(0), lb.d((byte) -56));
        if (var2 == -1) {
          return -1;
        }
        if (0 == var2 ||
          var2 == 1) {
          if (k.field_g == 11 &&
            bl.field_m == 0) {
            db.a(false);
          }
          return var2;
        }
        if (!nd.field_a) {
          this.a((byte) 77, "reconnect");
        }
        cf.a((byte) 3);
        pc.a((byte) -46, var2, sl.field_n);
        qj.field_J = true;
        ha.field_ab = pf.a(0) + 15000L;
        return var2;
    }

    private final void l(int param0) {
        if (param0 <= 10) {
          return;
        }
        int var2 = MonkeyPuzzle2.field_D.a((byte) 114);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        int var4 = rc.field_f - 1;
        byte[] var5 = new byte[var4];
        MonkeyPuzzle2.field_D.a((byte) 118, 0, var4, var5);
        pl.a(var3 != 0, 12430, ii.a(false), be.a(var5, (byte) -49));
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
          boolean stackIn_38_0 = false;
          boolean stackIn_39_1 = false;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          gk var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          var4 = sg.a(fe.field_h, param2, -128, ab.field_d);
          if (!param1) {
            bi.d((byte) -64);
          }
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = hb.a(-7468, qj.l(111), wc.a((byte) 112));
            if (var5_int != -1) {
              p.a(sl.field_n, (byte) 121, var5_int, cm.field_E);
              sl.field_n = null;
              cm.field_E = null;
            }
            var11 = na.a(55);
            if (var11 != null) {
              ti.a(0, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = nj.a(ci.a((byte) 78), gh.a(12035), mk.e(0), lb.d((byte) -56), true, this.field_n, pl.a((byte) -69));
            if (var5_intLifetime1 != -1) {
              fj.a(cm.field_E, sl.field_n, -27967, var5_intLifetime1);
              cm.field_E = null;
              sl.field_n = null;
            }
          }
          if (var4 == 3) {
            if (bl.field_m != -1 &&
              bl.field_m != 0) {
              bl.field_m = -1;
              ff.a(95);
            }
            if (!param0) {
              var5_intLifetime2 = ad.a(this.field_n, 650, this.field_y, false, mk.e(0), lb.d((byte) -56));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  pc.a((byte) -46, var5_intLifetime2, sl.field_n);
                  sl.field_n = null;
                } else {
                  cc.field_b = ia.field_f;
                  db.a(false);
                  ha.field_db = false;
                  k.field_g = 10;
                }
              }
            } else {
              qj.field_J = false;
            }
          }
          if (4 == var4) {
            if (mb.field_c) {
              ad.a(ii.a(!param1), true);
            } else {
              ha.field_db = true;
              k.field_g = 10;
            }
          }
          if (var4 == 5) {
            stackIn_38_0 = true;
            stackIn_39_1 = (param1) ? false : true;
            hd.a(stackIn_38_0, ii.a(stackIn_39_1));
          }
          if (var4 == 6 &&
            cf.field_c) {
            k.field_g = 10;
          }
          if (7 == var4) {
            aa.a(-126, ii.a(false));
          }
          if (var4 == 8) {
            ad.a(ii.a(false), true);
          }
          if (var4 == 9) {
            m.a((byte) -79, ii.a(false));
          }
          if (var4 == 10) {
            gf.field_c.b(true, 17);
          }
          if (var4 == 11) {
            l.a(ii.a(false), -120);
          }
          if (12 == var4) {
            k.a(ii.a(false), (byte) 91, pj.b(true));
          }
          if (13 == var4) {
            try {
              if (null == ec.field_e) {
                ec.field_e = new qa(rc.field_k, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ec.field_e.c(90)) {
                var12 = ec.field_e.a(18);
                if (var12 != null) {
                  var7 = sc.a(var12.field_g, var12.field_h, 78, 0);
                  ki.a(-125, var7);
                } else {
                  var9 = (String) null;
                  ki.a(44, (String) null);
                }
                ec.field_e = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              kk.a("S1", (byte) 67, (Throwable) ((Object) var5));
              var10 = (String) null;
              ki.a(67, (String) null);
              ec.field_e = null;
            }
          }
          if (var4 == 15) {
            k.field_g = 10;
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

    private final void e(int param0) {
        if (param0 != 19887) {
          this.f((byte) 17);
        }
        eg.field_k[1] = true;
    }

    protected bi() {
    }

    static {
        field_s = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
