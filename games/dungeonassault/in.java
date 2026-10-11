/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class in extends kg {
    private int field_r;
    String field_p;
    private int field_q;
    static og field_C;
    private int field_z;
    private boolean field_u;
    private int field_F;
    static boolean field_E;
    private int field_x;
    private boolean field_s;
    private long field_A;
    static pp field_y;
    private boolean field_v;
    private int field_w;
    static cn field_D;
    static int[] field_B;
    static String field_t;

    private final void a(String param0, int param1, boolean param2, int param3, int param4) {
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
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
            if (!this.b(-126)) {
              return;
            }
            this.field_p = this.getCodeBase().getHost();
            var11 = this.field_p.toLowerCase();
            if (!param2) {
              return;
            }
            stackIn_10_1 = (var11.equals("jagex.com")) || (var11.endsWith(".jagex.com"));
            this.field_u = stackIn_10_1;
            this.field_z = Integer.parseInt(this.getParameter("gameport1"));
            this.field_F = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_r = Integer.parseInt(var7);
            }
            this.field_w = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_A = Long.parseLong(this.getParameter("instanceid"));
            this.field_s = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_x = Integer.parseInt(var8);
            }
            if (this.field_x >= 5) {
              this.field_x = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_q = Integer.parseInt(var9);
            }
            f.field_d = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, (byte) 107, param0, param4, param1, param3, this.field_w);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            sm.a((Throwable) ((Object) var6), 1, (String) null);
            this.a((byte) -112, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref;
          stackIn_27_1 = new StringBuilder().append("in.Q(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void g(byte param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_5_2 = false;
        int var3;
        var3 = DungeonAssault.field_K;
        if (param0 != 2) {
          return;
        }
        if (!vk.a(22084)) {
          if (dk.field_c >= 10) {
            if (!l.a(true)) {
              dh.b(-128);
            } else {
              if (kh.field_n != 0) {
                td.a(pj.field_r, param0 + 119);
              } else {
                discarded$0 = this.a(false, false, false);
              }
            }
          }
        } else {
          stackIn_4_1 = false;
          stackIn_5_2 = (null != cm.field_R);
          discarded$1 = this.a(stackIn_4_1, stackIn_5_2, false);
        }
    }

    public static void e(int param0) {
        field_C = null;
        field_t = null;
        field_D = null;
        field_y = null;
        field_B = null;
        if (param0 != -1) {
          in.e(-36);
        }
    }

    final static int a(int param0, int param1) {
        param0 = (1431655765 & param0 >>> 1) + (param0 & 1431655765);
        if (param1 != 8) {
          in.e(-51);
        }
        param0 = (param0 >>> 2 & -1288490189) + (param0 & 858993459);
        param0 = param0 + (param0 >>> 4) & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final int b(byte param0, boolean param1) {
        int discarded$0 = 0;
        if (param0 != 82) {
          discarded$0 = this.g(12);
        }
        return this.a(false, param1, true);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        hc.field_d = this.field_x;
        ae.a(hc.field_d, -5);
        dj.a(param1, 5000, this.field_A, this.field_z, this.field_p, this.field_w, hc.field_d, this.field_F, this.field_r, this.field_s, param6, param0, (byte) -27, i.field_A);
        an.a(this.field_r, this.field_F, -69, this.field_z, this.field_p, hc.field_d, this.field_w, param1, i.field_A);
        uf.a(param6 ^ 5031);
        bn.field_j = pm.a((byte) 109);
        uk.a(c.field_h, (byte) -126);
        mh.field_a = param5;
        s.field_a = param7;
        bh.field_P = param2;
        pm.field_m = param3;
        sp.field_h = param4;
        this.e((byte) 68);
        ch.a((byte) -110);
    }

    final int f(byte param0) {
        int discarded$0 = 0;
        int var2 = this.g(11);
        if (param0 < 86) {
          discarded$0 = this.g(-68);
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (pj.field_w[1]) {
            f.a(2, (byte) -50);
          }
          if (pj.field_w[2]) {
            fl.a((byte) -93, 3);
          }
          if (pj.field_w[3]) {
            ep.a((byte) 127, 4);
          }
          if (pj.field_w[4]) {
            ko.a(true, 5);
          }
          if (pj.field_w[5]) {
            ol.a(8, 6);
          }
          if (pj.field_w[6]) {
            tc.a(7, (byte) -112);
          }
          if (pj.field_w[8]) {
            hj.g(-59);
          }
        }
        return var2;
    }

    private final void e(byte param0) {
        uo.field_c[2] = -2;
        uo.field_c[13] = -1;
        uo.field_c[5] = -1;
        uo.field_c[7] = -1;
        uo.field_c[11] = -1;
        uo.field_c[10] = -1;
        uo.field_c[12] = -1;
        uo.field_c[16] = -1;
        uo.field_c[1] = 16;
        uo.field_c[9] = -1;
        uo.field_c[18] = 1;
        if (param0 != 68) {
          this.field_A = -61L;
        }
        uo.field_c[17] = -1;
        uo.field_c[8] = -2;
        uo.field_c[6] = -2;
        uo.field_c[3] = -1;
        uo.field_c[4] = -1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = DungeonAssault.field_K;
        try {
          var5_int = param2 + param0;
          var6 = param3 + param1;
          if (gf.field_j >= param0) {
            stackIn_4_0 = gf.field_j;
          } else {
            stackIn_4_0 = param0;
          }
          var7 = stackIn_4_0;
          if (param3 > gf.field_f) {
            stackIn_7_0 = param3;
          } else {
            stackIn_7_0 = gf.field_f;
          }
          var8 = stackIn_7_0;
          if (gf.field_h > var5_int) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = gf.field_h;
          }
          var9 = stackIn_10_0;
          if (var6 >= gf.field_e) {
            stackIn_13_0 = gf.field_e;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (gf.field_j <= param0 &&
            gf.field_h > param0) {
            var11 = var8 * gf.field_i + param0;
            var12 = var10 + (1 - var8) >> 1;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              gf.field_b[var11] = 16777215;
              var11 = var11 + 2 * gf.field_i;
            }
          }
          if (param4 != 1) {
            return;
          }
          if (gf.field_f <= param3 &&
            gf.field_e > var6) {
            var11Lifetime1 = param3 * gf.field_i + var7;
            var12Lifetime1 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              gf.field_b[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (gf.field_j <= var5_int &&
            var5_int < gf.field_h) {
            var11Lifetime2 = (var8 + (1 & var5_int - param0)) * gf.field_i + var5_int;
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              gf.field_b[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * gf.field_i;
            }
          }
          if (gf.field_f <= param3 &&
            gf.field_e > var6) {
            var11Lifetime3 = var7 + var6 * gf.field_i + (-param3 + var6 & 1);
            var12Lifetime3 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              gf.field_b[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var5), "in.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void d(boolean param0) {
        boolean stackIn_32_0 = false;
        int var2;
        la var3;
        int var4;
        var4 = DungeonAssault.field_K;
        var2 = hc.field_c;
        if (var2 < 64 &&
          pj.field_w[var2]) {
          if (!param0) {
            this.field_s = false;
          }
          if (0 == var2) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              ui.a(30592);
            } else {
              if (var2 != 3) {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (6 == var2) {
                      bf.b(19664);
                    } else {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                lf.d((byte) 123);
                                return;
                              }
                              if (17 == var2) {
                                this.d(-28859);
                                return;
                              }
                              if (18 == var2) {
                                rc.c(16777215);
                                return;
                              }
                              sm.a((Throwable) null, 1, "MGS1: " + sj.l(192));
                              tl.a(124);
                              return;
                            }
                            stackIn_32_0 = (var2 == 12);
                            var3 = d.a(stackIn_32_0, (byte) 118);
                            jm.a(var3, (byte) 116);
                          } else {
                            ih.a((byte) 59);
                          }
                        } else {
                          hb.a(-5, ra.field_c, i.field_A, nj.field_b);
                        }
                      } else {
                        this.f(8);
                      }
                    }
                  } else {
                    rm.q(-5705);
                  }
                } else {
                  hd.a(!param0);
                }
              } else {
                pk.d(126);
              }
            }
          } else {
            lg.a(72);
          }
          return;
        }
        sm.a((Throwable) null, 1, "MGS2: " + sj.l(192));
        tl.a(-48);
    }

    private final void d(int param0) {
        if (param0 != -28859) {
          this.f((byte) 39);
        }
        int var2 = ra.field_c.c(true);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = nj.field_b - 1;
        byte[] var5 = new byte[var4];
        ra.field_c.a(0, (byte) 95, var4, var5);
        oe.a((byte) 121, var3 != 0, m.c(true), dj.a(var5, false));
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
          int discarded$0 = 0;
          boolean stackIn_7_0 = false;
          cd stackIn_7_1 = null;
          boolean stackIn_8_2 = false;
          int stackIn_47_0 = 0;
          boolean stackIn_48_1 = false;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          ec var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = DungeonAssault.field_K;
          if (param0) {
            discarded$0 = this.a(false, false, false);
          }
          var4 = o.a(16711680, hc.field_d, param1, pj.field_r);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            stackIn_7_0 = param0;
            stackIn_7_1 = ln.a((byte) -120);
            stackIn_8_2 = (param0) ? false : true;
            var5_int = qh.a(stackIn_7_0, stackIn_7_1, om.a(stackIn_8_2));
            if (-1 != var5_int) {
              ri.a(tp.field_v, mf.field_c, var5_int, -15);
              mf.field_c = null;
              tp.field_v = null;
            }
            var11 = fb.a((byte) 92);
            if (var11 != null) {
              ig.a(-99, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = qm.a(this.field_q, rn.a(-87), tp.c((byte) -73), em.e(7142), vl.c(-29455), 57, co.e((byte) 57));
            if (-1 != var5_intLifetime1) {
              gj.a(var5_intLifetime1, 29120, mf.field_c, tp.field_v);
              tp.field_v = null;
              mf.field_c = null;
            }
          }
          if (3 == var4) {
            if (gm.field_c != -1 &&
              gm.field_c != 0) {
              gm.field_c = -1;
              en.a((byte) -54);
            }
            if (param2) {
              hh.field_c = false;
            } else {
              var5_intLifetime2 = bh.a(this.field_u, em.e(7142), 106, this.field_q, false, vl.c(-29455));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 == 0) {
                  ne.field_g = hg.field_s;
                  bl.b((byte) -97);
                  kh.field_n = 10;
                  tl.field_l = false;
                } else {
                  nf.a(var5_intLifetime2, true, tp.field_v);
                  tp.field_v = null;
                }
              }
            }
          }
          if (4 == var4) {
            if (!ld.field_g) {
              tl.field_l = true;
              kh.field_n = 10;
            } else {
              pd.a(5189, m.c(true));
            }
          }
          if (var4 == 5) {
            eg.a((byte) -37, m.c(true));
          }
          if (6 == var4 &&
            oj.field_b) {
            kh.field_n = 10;
          }
          if (var4 == 7) {
            pa.a(123, m.c(true));
          }
          if (8 == var4) {
            stackIn_47_0 = 5189;
            stackIn_48_1 = (param0) ? false : true;
            pd.a(stackIn_47_0, m.c(stackIn_48_1));
          }
          if (9 == var4) {
            jl.a(m.c(true), false);
          }
          if (10 == var4) {
            ac.field_B.d((byte) -90, 17);
          }
          if (var4 == 11) {
            fk.a(84, m.c(true));
          }
          if (var4 == 12) {
            oe.a(ao.a(-21), m.c(true), (byte) 94);
          }
          if (13 == var4) {
            try {
              if (null == hl.field_i) {
                hl.field_i = new tl(i.field_A, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (hl.field_i.d(34)) {
                var12 = hl.field_i.c(3);
                if (var12 == null) {
                  var9 = (String) null;
                  rg.a(15, (String) null);
                } else {
                  var7 = mk.a((byte) -24, var12.field_m, var12.field_o, 0);
                  rg.a(15, var7);
                }
                hl.field_i = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              sm.a((Throwable) ((Object) var5), 1, "S1");
              var10 = (String) null;
              rg.a(15, (String) null);
              hl.field_i = null;
            }
          }
          if (var4 == 15) {
            kh.field_n = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (17 != var4) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(int param0) {
        if (param0 != 8) {
          return;
        }
        String var2 = eg.a(-96);
        sm.a(m.c(true), 31500, var2);
    }

    final void a(int param0, String param1, int param2) {
        if (param2 != 0) {
          return;
        }
        try {
          this.a(param1, 640, true, param0, 480);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "in.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected in() {
    }

    final void a(boolean param0, byte param1) {
        int stackIn_26_0 = 0;
        int stackIn_102_0 = 0;
        boolean stackIn_103_1 = false;
        String stackIn_105_2 = null;
        boolean stackIn_106_3;
        int stackIn_135_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = DungeonAssault.field_K;
        if (null != il.field_c) {
          if (cm.field_R == null) {
            var6 = ua.a(0);
            var4 = var6.getSize();
            il.field_c.a(var4.height, true, var4.width);
          }
          il.field_c.e(6731);
        }
        bp.b(94);
        ke.b(param1 + 74);
        if (param1 != -74) {
          this.field_q = -128;
        }
        if (!ao.a((byte) -116) &&
          kh.field_n != 11) {
          cp.f(-30208);
        }
        if (bn.field_j != null) {
          pj.field_r = bn.field_j.a(6);
        }
        if (dh.a((byte) -120)) {
          var3 = 1200 * eg.c(1);
          if (this.field_v ||
            !(ib.b((byte) 31) <= var3) &&
            !(var3 >= mn.a((byte) 106))) {
            this.field_v = false;
            tl.a(122);
            l.a(param1 + 73);
            nf.a(2, true, sj.field_V);
            ql.a((byte) -105);
            hh.field_c = true;
            ab.field_a = 15000L + kd.c(-2456);
          }
        }
        if (gm.field_c == -1 ||
          gm.field_c == 0) {
          stackIn_26_0 = (gm.field_c != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          gm.field_c = fp.a((byte) 70);
          if (var3Lifetime1 != 0 &&
            0 == gm.field_c &&
            11 == kh.field_n &&
            !dm.c(param1 - 7)) {
            bl.b((byte) -97);
          }
          if (gm.field_c != -1 &&
            gm.field_c != 0) {
            ab.field_a = 15000L + kd.c(param1 ^ 2526);
          }
        }
        if (-1 != gm.field_c &&
          gm.field_c != 0) {
          if (10 <= dk.field_c) {
            if (kh.field_n >= 10) {
              l.a(param1 + 73);
              if (3 != gm.field_c) {
                if (gm.field_c == 4) {
                  nf.a(256, true, sf.field_e);
                } else {
                  if (gm.field_c == 2) {
                    nf.a(256, true, ul.field_b);
                  } else {
                    if (gm.field_c != 5) {
                      nf.a(256, true, b.field_b);
                    } else {
                      nf.a(5, true, ed.field_W);
                    }
                  }
                }
              } else {
                nf.a(256, true, ck.field_D);
              }
              hh.field_c = true;
            }
          } else {
            if (3 == gm.field_c) {
              this.a((byte) -112, "js5crc");
            } else {
              if (gm.field_c == 4) {
                this.a((byte) -112, "js5io");
              } else {
                if (2 != gm.field_c) {
                  if (gm.field_c != 5) {
                    this.a((byte) -112, "js5connect");
                  } else {
                    this.a((byte) -112, "outofdate");
                  }
                } else {
                  this.a((byte) -112, "js5connect_full");
                }
              }
            }
          }
        }
        if ((gm.field_c != -1 &&
          0 != gm.field_c ||
          dm.c(param1 - 43)) &&
          kd.c(param1 - 2382) >= ab.field_a) {
          hh.field_c = false;
          if (gm.field_c != -1 &&
            0 != gm.field_c) {
            gm.field_c = -1;
            en.a((byte) -124);
          }
        }
        if (gm.field_c == 0 &&
          !dm.c(-125)) {
          u.field_O = false;
        }
        if (0 == dk.field_c &&
          ln.a(255)) {
          dk.field_c = 1;
        }
        if (dk.field_c == 1) {
          if (hc.field_d != 0) {
            ia.field_U = mk.a(mh.field_a, (byte) 34);
          }
          fi.field_u = qd.a(false, true, s.field_a, (byte) -31, 1);
          kg.field_b = qd.a(false, true, pm.field_m, (byte) -31, 1);
          ib.field_b = qd.a(false, true, sp.field_h, (byte) -31, 1);
          dk.field_c = 2;
          gh.field_c = kg.field_b;
          uc.field_I = fi.field_u;
        }
        if (dk.field_c == 2) {
          if (null != ia.field_U &&
            ia.field_U.a(param1 - 14280)) {
            if (ia.field_U.c("", param1 ^ -74)) {
              if (ia.field_U.a(false, "")) {
                ng.a(param1 ^ 27014, ia.field_U);
                ia.field_U = null;
                nf.d(0);
              }
            } else {
              ia.field_U = null;
            }
          }
          if (ia.field_U == null) {
            dk.field_c = 3;
          }
        }
        if (dk.field_c == 3 &&
          ql.a(kg.field_b, ib.field_b, (byte) 61, fi.field_u) &&
          fl.a(-43, ib.field_b)) {
          jm.a(false);
          am.b(112);
          lj.field_e = bg.field_t;
          oj.field_b = false;
          h.a(param1 ^ -8099, fi.field_u, ib.field_b, ld.field_g, kg.field_b);
          if (np.field_D ||
            null != mi.field_d) {
            stackIn_102_0 = 8192;
            stackIn_103_1 = !(np.field_D);
            stackIn_105_2 = mi.field_d;
            stackIn_106_3 = !(np.field_D);
            hd.a(stackIn_102_0, stackIn_103_1, stackIn_105_2, stackIn_106_3);
          }
          if (f.field_d) {
            kd.a(4);
          }
          if (je.field_c == null) {
            je.field_c = fb.b((byte) 127);
            tb.field_g = ab.a((byte) -97);
          }
          nh.a((byte) -96, ib.field_b, je.field_c, tb.field_g);
          ib.field_b = null;
          fi.field_u = null;
          kg.field_b = null;
          qj.a((java.applet.Applet) (this), (byte) 89);
          nf.d(0);
          dk.field_c = 10;
        }
        if (dk.field_c == 10) {
          if (hc.field_d != 0) {
            ec.field_k = mk.a(bh.field_P, (byte) 34);
          }
          dk.field_c = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (dk.field_c == 11) {
          if (null != ec.field_k && (!ec.field_k.a(-14354) ||
            !ec.field_k.a((byte) 59))) {
            tp.a(10, 0.0f, lk.a(ki.field_c, ec.field_k, ec.field_r, (byte) -125));
            decompiledFrameRemainder0 = false;
          }
          else {
            ld.field_i = true;
            dk.field_c = 12;
          }
        }
        if (dk.field_c == 12 &&
          !ld.field_i) {
          dk.field_c = 13;
        }
        if (dk.field_c == 13) {
          var3Lifetime2 = 1;
          if (be.field_s != null) {
            stackIn_135_0 = (!be.field_s.a(false)) ? 0 : 1;
            var3Lifetime2 = stackIn_135_0;
            tp.a(10, be.field_s.field_j, be.field_s.field_b);
          }
          if (var3Lifetime2 != 0) {
            dk.field_c = 20;
          }
        }
        if (!param0 &&
          ve.field_a) {
          pd.a(c.field_h, -32);
          this.d((byte) 121);
          uk.a(c.field_h, (byte) -124);
        }
        if (pj.field_w[8]) {
          ta.b(12841);
        }
    }

    private final int g(int param0) {
        int var2;
        if (param0 != 11) {
          return 24;
        }
        if (this.field_i) {
          return -1;
        }
        if (!dm.c(-118)) {
          return -1;
        }
        if (hh.field_c) {
          return -1;
        }
        var2 = bh.a(this.field_u, em.e(7142), 116, this.field_q, true, vl.c(-29455));
        if (var2 == -1) {
          return -1;
        }
        if (0 != var2 &&
          var2 != 1) {
          if (!rm.field_P) {
            this.a((byte) -112, "reconnect");
          }
          l.a(-1);
          nf.a(var2, true, tp.field_v);
          hh.field_c = true;
          ab.field_a = 15000L + kd.c(-2456);
          return var2;
        }
        if (kh.field_n == 11 &&
          gm.field_c == 0) {
          bl.b((byte) -97);
        }
        return var2;
    }

    final void b(boolean param0, byte param1) {
        pj.field_w[16] = true;
        if (param1 >= -33) {
          this.field_F = 36;
        }
        pj.field_w[7] = true;
        pj.field_w[18] = true;
        pj.field_w[3] = true;
        pj.field_w[8] = param0;
        pj.field_w[17] = true;
        pj.field_w[0] = true;
    }

    static {
        field_C = new og();
        field_B = new int[]{2, 13, 14, 8, 28, 7, 11};
        field_t = "Nimble even by the standards of his dexterous race, the saurus slink can dodge traps and attacks with equal ease.";
    }
}
