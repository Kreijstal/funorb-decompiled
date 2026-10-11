/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ph extends tf {
    static int[] field_x;
    private boolean field_z;
    private int field_y;
    private int field_p;
    private int field_A;
    private static boolean field_v;
    private boolean field_r;
    static int field_u;
    private int field_o;
    String field_n;
    private int field_s;
    private int field_q;
    private long field_w;
    private boolean field_t;

    private final void c(int param0, boolean param1) {
        vk.field_w[16] = true;
        vk.field_w[7] = true;
        vk.field_w[3] = true;
        vk.field_w[param0] = true;
        vk.field_w[8] = param1;
        vk.field_w[0] = true;
        vk.field_w[17] = true;
    }

    private final void i(int param0) {
        String var2 = fb.c(-128);
        lh.a(uj.b((byte) -120), var2, false);
        int var3 = -120 / ((54 - param0) / 43);
    }

    private final void k(int param0) {
        if (param0 != 3) {
          this.field_r = true;
        }
        vk.field_w[2] = true;
    }

    final void a(boolean param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        if (param1 <= 41) {
          String var10 = (String) null;
          this.a(114, (String) null, (byte) 126);
        }
        wj.field_m = this.field_A;
        wg.a(wj.field_m, (byte) -108);
        ec.a(this.field_n, 5000, this.field_t, this.field_s, param0, param7, this.field_q, 5000, this.field_p, this.field_w, wj.field_m, wc.field_c, this.field_y, 49);
        nc.a(wj.field_m, this.field_y, param7, this.field_n, (byte) 93, this.field_q, this.field_s, wc.field_c, this.field_p);
        k.a(0);
        mj.field_i = de.a((byte) -112);
        l.a(tf.field_f, 59);
        pj.field_p = param3;
        cb.field_e = param5;
        ve.field_Q = param6;
        oc.field_V = param4;
        nl.field_b = param2;
        this.f((byte) 56);
        tl.b(103);
    }

    private final void l(int param0) {
        int var2 = cd.field_t.b((byte) 90);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        if (param0 >= -108) {
          this.i(-72);
        }
        int var4 = tf.field_c - 1;
        byte[] var5 = new byte[var4];
        cd.field_t.a(-29, 0, var5, var4);
        ke.a(bk.a(var5, -12465), var3 != 0, (byte) -94, uj.b((byte) -120));
    }

    final void a(int param0, String param1, byte param2) {
        try {
          int var4_int = 68 % ((-44 - param2) / 62);
          this.a(480, 73, 640, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ph.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          Boolean var11 = null;
          mg var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = OrbDefence.field_D ? 1 : 0;
          var4 = tl.a(of.field_K, wj.field_m, param2, (byte) -67);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = ik.a(lm.c(32018), fb.b((byte) -128), ~param1);
            if (var5_int != -1) {
              i.a(-35, kk.field_Y, vd.field_e, var5_int);
              vd.field_e = null;
              kk.field_Y = null;
            }
            var11 = k.b((byte) 126);
            if (var11 != null) {
              sd.a(var11.booleanValue(), 63);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = kg.a(am.b(-28), uh.b(param1 ^ -5), this.field_o, na.a((byte) -105), qh.a(-42), 200, jf.j(989270945));
            if (-1 != var5_intLifetime1) {
              fa.a(-111, var5_intLifetime1, vd.field_e, kk.field_Y);
              kk.field_Y = null;
              vd.field_e = null;
            }
          }
          if (param1 != -1) {
            this.field_w = 13L;
          }
          if (var4 == 3) {
            if (o.field_j != -1 &&
              o.field_j != 0) {
              o.field_j = -1;
              hh.c(param1 ^ -24061);
            }
            if (param0) {
              fa.field_a = false;
            } else {
              var5_intLifetime2 = vc.a(this.field_z, this.field_o, param1 ^ 77, am.b(param1 ^ 60), false, uh.b(4));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  se.a(kk.field_Y, (byte) -115, var5_intLifetime2);
                  kk.field_Y = null;
                } else {
                  el.field_F = p.field_c;
                  id.a(false);
                  d.field_k = false;
                  hi.field_k = 10;
                }
              }
            }
          }
          if (var4 == 4) {
            if (jc.field_b) {
              ad.a(0, uj.b((byte) -120));
            } else {
              hi.field_k = 10;
              d.field_k = true;
            }
          }
          if (var4 == 5) {
            ja.a(param1 ^ 104, uj.b((byte) -120));
          }
          if (6 == var4 &&
            pa.field_b) {
            hi.field_k = 10;
          }
          if (var4 == 7) {
            tf.a(uj.b((byte) -120), -6407);
          }
          if (var4 == 8) {
            ad.a(~param1, uj.b((byte) -120));
          }
          if (var4 == 9) {
            ka.a(uj.b((byte) -120), 1);
          }
          if (var4 == 10) {
            uk.field_b.i(17, 89);
          }
          if (var4 == 11) {
            bm.a(param1 + 12980, uj.b((byte) -120));
          }
          if (var4 == 12) {
            jj.a(da.a(-103), (byte) 53, uj.b((byte) -120));
          }
          if (var4 == 13) {
            try {
              if (null == ml.field_e) {
                ml.field_e = new uj(wc.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ml.field_e.b(param1 - 3)) {
                var12 = ml.field_e.a(5);
                if (var12 == null) {
                  var9 = (String) null;
                  li.a(-1, (String) null);
                } else {
                  var7 = tj.a(var12.field_i, 0, 0, var12.field_j);
                  li.a(param1 + 0, var7);
                }
                ml.field_e = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              pe.a((byte) -13, (Throwable) ((Object) var5), "S1");
              li.a(param1 + 0, (String) null);
              ml.field_e = null;
            }
          }
          if (var4 == 15) {
            hi.field_k = 10;
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

    private final void n(int param0) {
        vk.field_w[4] = true;
        if (param0 != 18495) {
          this.field_z = false;
        }
    }

    private final void m(int param0) {
        if (param0 > -61) {
          this.field_y = 25;
        }
        vk.field_w[1] = true;
    }

    final static void b(boolean param0) {
        int var1 = 0;
        if (ck.field_f >= 224) {
          ce.a(256, (byte) -118);
        } else {
          var1 = ck.field_f % 32;
          ce.a(-var1 + ck.field_f + 32, (byte) -127);
        }
        if (!param0) {
          field_x = (int[]) null;
        }
    }

    final void e(byte param0) {
        int discarded$0 = 0;
        boolean stackIn_34_0 = false;
        int var2;
        og var3;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        var2 = ab.field_l;
        if (var2 < 64 &&
          vk.field_w[var2]) {
          if (param0 > -108) {
            discarded$0 = this.a(false, 60, true);
          }
          if (var2 == 0) {
            return;
          }
          if (1 != var2) {
            if (2 == var2) {
              uk.a((byte) 68);
            } else {
              if (var2 == 3) {
                lb.c(122);
              } else {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      ad.a(90);
                    } else {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (16 != var2) {
                            if (11 != var2 &&
                              12 != var2) {
                              if (var2 == 13) {
                                vc.b(-48);
                                return;
                              }
                              if (var2 == 17) {
                                this.l(-119);
                                return;
                              }
                              if (var2 == 18) {
                                ek.c(117);
                                return;
                              }
                              pe.a((byte) -13, (Throwable) null, "MGS1: " + sj.b(true));
                              th.a(104);
                              return;
                            }
                            stackIn_34_0 = (var2 == 12);
                            var3 = oe.a(stackIn_34_0, (byte) -53);
                            fm.a(var3, (byte) 126);
                          } else {
                            gb.b(-122);
                          }
                        } else {
                          fb.a(cd.field_t, tf.field_c, -31, wc.field_c);
                        }
                      } else {
                        this.i(-22);
                      }
                    }
                  } else {
                    pc.f(false);
                  }
                } else {
                  hb.b(554553416);
                }
              }
            }
          } else {
            tc.a(-51);
          }
          return;
        }
        pe.a((byte) -13, (Throwable) null, "MGS2: " + sj.b(true));
        th.a(102);
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        try {
          try {
            if (!this.c(1)) {
              return;
            }
            this.field_n = this.getCodeBase().getHost();
            var6 = this.field_n.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_z = stackIn_8_1;
            this.field_q = Integer.parseInt(this.getParameter("gameport1"));
            this.field_p = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_y = Integer.parseInt(var7);
            }
            this.field_s = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_w = Long.parseLong(this.getParameter("instanceid"));
            this.field_t = this.getParameter("member").equals("yes");
            var9 = 66 % ((param1 + 49) / 55);
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_A = Integer.parseInt(var8);
            }
            if (this.field_A >= 5) {
              this.field_A = 0;
            }
            var10 = this.getParameter("affid");
            if (var10 != null) {
              this.field_o = Integer.parseInt(var10);
            }
            field_v = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(-10291, this.field_s, param4, param2, param0, param3, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var11 = (String) null;
            pe.a((byte) -13, (Throwable) ((Object) var6_ref), (String) null);
            this.a(110, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var6_ref2;
          stackIn_23_1 = new StringBuilder().append("ph.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    final int j(int param0) {
        int var2;
        if (param0 != 7) {
          return -15;
        }
        var2 = this.h(-10125);
        if (var2 == 0 ||
          var2 == 1) {
          if (vk.field_w[1]) {
            ij.a((byte) -34, 2);
          }
          if (vk.field_w[2]) {
            qj.a(3, 7287);
          }
          if (vk.field_w[3]) {
            am.a(4, 113);
          }
          if (vk.field_w[4]) {
            ql.a(5, (byte) 21);
          }
          if (vk.field_w[5]) {
            ik.a((byte) -74, 6);
          }
          if (vk.field_w[6]) {
            nh.a(param0 + 15961, 7);
          }
          if (vk.field_w[8]) {
            vk.a(0);
          }
        }
        return var2;
    }

    final void b(int param0, boolean param1) {
        int stackIn_23_0 = 0;
        String stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        boolean stackIn_104_2 = false;
        boolean stackIn_107_3;
        int stackIn_135_0 = 0;
        int var3;
        java.awt.Dimension var4_ref_java_awt_Dimension;
        int var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (null != ne.field_b) {
          if (mg.field_k == null) {
            var6 = ob.l(4);
            var4_ref_java_awt_Dimension = var6.getSize();
            ne.field_b.a(14592, var4_ref_java_awt_Dimension.height, var4_ref_java_awt_Dimension.width);
          }
          ne.field_b.d((byte) 112);
        }
        ab.a(-128);
        mg.d((byte) -107);
        if (!eg.c((byte) -126) &&
          11 != hi.field_k) {
          cf.a((byte) 109);
        }
        if (null != mj.field_i) {
          of.field_K = mj.field_i.a(1);
        }
        if (p.a(23236)) {
          var3 = 1200 * ok.a((byte) 84);
          if (this.field_r ||
            !(var3 >= f.c((byte) 8)) &&
            !(var3 >= pb.a(-16733))) {
            this.field_r = false;
            th.a(111);
            md.b((byte) 42);
            se.a(oe.field_m, (byte) -79, 2);
            ke.a(-92);
            fa.field_a = true;
            lm.field_c = 15000L + ji.b(-103);
          }
        }
        if (-1 == o.field_j ||
          o.field_j == 0) {
          stackIn_23_0 = (-1 != o.field_j) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          o.field_j = bh.a((byte) 117);
          if (var3Lifetime1 != 0 &&
            o.field_j == 0 &&
            hi.field_k == 11 &&
            !sg.c(true)) {
            id.a(false);
          }
          if (-1 != o.field_j &&
            o.field_j != 0) {
            lm.field_c = ji.b(123) + 15000L;
          }
        }
        if (-1 != o.field_j &&
          o.field_j != 0) {
          if (10 <= vh.field_n) {
            if (hi.field_k >= 10) {
              md.b((byte) -86);
              if (o.field_j != 3) {
                if (o.field_j == 4) {
                  se.a(cg.field_h, (byte) 109, 256);
                } else {
                  if (o.field_j == 2) {
                    se.a(ql.field_a, (byte) -118, 256);
                  } else {
                    if (o.field_j != 5) {
                      se.a(pl.field_h, (byte) 63, 256);
                    } else {
                      se.a(nf.field_k, (byte) -82, 5);
                    }
                  }
                }
              } else {
                se.a(o.field_i, (byte) -127, 256);
              }
              fa.field_a = true;
            }
          } else {
            if (o.field_j != 3) {
              if (o.field_j != 4) {
                if (o.field_j != 2) {
                  if (5 != o.field_j) {
                    this.a(119, "js5connect");
                  } else {
                    this.a(99, "outofdate");
                  }
                } else {
                  this.a(124, "js5connect_full");
                }
              } else {
                this.a(125, "js5io");
              }
            } else {
              this.a(101, "js5crc");
            }
          }
        }
        if ((-1 != o.field_j &&
          o.field_j != 0 ||
          sg.c(true)) &&
          ji.b(-125) >= lm.field_c) {
          fa.field_a = false;
          if (o.field_j != -1 &&
            0 != o.field_j) {
            o.field_j = -1;
            hh.c(24060);
          }
        }
        if (0 == o.field_j &&
          !sg.c(true)) {
          mf.field_d = false;
        }
        if (vh.field_n == 0 &&
          lg.a((byte) -2)) {
          vh.field_n = 1;
        }
        if (vh.field_n == 1) {
          if (wj.field_m != 0) {
            lf.field_a = qk.a(cb.field_e, -32585);
          }
          og.field_g = hm.a(48, true, false, oc.field_V, 1);
          am.field_b = hm.a(48, true, false, ve.field_Q, 1);
          wb.field_b = hm.a(48, true, false, nl.field_b, 1);
          j.field_b = og.field_g;
          vh.field_n = 2;
          tf.field_d = am.field_b;
        }
        if (vh.field_n == 2) {
          if (null != lf.field_a &&
            lf.field_a.b(-1)) {
            if (!lf.field_a.c((byte) -84, "")) {
              lf.field_a = null;
            } else {
              if (lf.field_a.b((byte) -61, "")) {
                lm.a((byte) 116, lf.field_a);
                lf.field_a = null;
                vd.a(42);
              }
            }
          }
          if (null == lf.field_a) {
            vh.field_n = 3;
          }
        }
        if (vh.field_n == 3 &&
          dk.a(1, og.field_g, wb.field_b, am.field_b) &&
          tk.a(wb.field_b, 26810)) {
          ak.b(22176);
          ek.a(-96);
          tl.field_e = cj.field_c;
          pa.field_b = false;
          gj.a(am.field_b, (byte) 33, wb.field_b, jc.field_b, og.field_g);
          if (gj.field_k ||
            null != lg.field_b) {
            stackIn_103_0 = lg.field_b;
            stackIn_103_1 = 33;
            stackIn_104_2 = !(gj.field_k);
            stackIn_107_3 = !(gj.field_k);
            hm.$cfr$intArgs$a$e5d4dced95c1(stackIn_103_0, stackIn_103_1, stackIn_104_2, stackIn_107_3);
          }
          if (field_v) {
            kj.j(4);
          }
          if (null == de.field_a) {
            de.field_a = fb.c(false);
            cf.field_d = te.j(2);
          }
          hf.a(de.field_a, wb.field_b, cf.field_d, 1000);
          og.field_g = null;
          wb.field_b = null;
          am.field_b = null;
          pj.a(127, (java.applet.Applet) (this));
          vd.a(99);
          vh.field_n = 10;
        }
        if (vh.field_n == 10) {
          if (wj.field_m != 0) {
            eg.field_x = qk.a(pj.field_p, -32585);
          }
          vh.field_n = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (vh.field_n == 11) {
          if (null != eg.field_x && (!eg.field_x.b(-1) ||
            !eg.field_x.c(7715))) {
            j.a(0.0f, ql.a(eg.field_x, mi.field_e, de.field_b, (byte) 32), (byte) 105);
            decompiledFrameRemainder0 = false;
          }
          else {
            gi.field_b = true;
            vh.field_n = 12;
          }
        }
        if (vh.field_n == 12 &&
          !gi.field_b) {
          vh.field_n = 13;
        }
        var3Lifetime2 = 81 % ((55 - param0) / 43);
        if (vh.field_n == 13) {
          var4 = 1;
          if (sd.field_b != null) {
            stackIn_135_0 = (!sd.field_b.a(false)) ? 0 : 1;
            var4 = stackIn_135_0;
            j.a(sd.field_b.field_h, sd.field_b.field_d, (byte) 106);
          }
          if (var4 != 0) {
            vh.field_n = 20;
          }
        }
        if (!param1 &&
          vc.field_a) {
          hl.a(tf.field_f, 118);
          this.e(99);
          l.a(tf.field_f, -123);
        }
        if (vk.field_w[8]) {
          od.a(192);
        }
    }

    private final void f(int param0) {
        int discarded$0 = 0;
        if (param0 != -2) {
          discarded$0 = this.h(122);
        }
        vk.field_w[5] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.c(18, param3);
        if (param1) {
          this.m(-109);
        }
        if (param2) {
          this.k(3);
        }
        if (param4) {
          this.n(18495);
        }
        if (param0) {
          this.f(-2);
        }
    }

    private final void f(byte param0) {
        tg.field_b[13] = -1;
        tg.field_b[10] = -1;
        tg.field_b[8] = -2;
        tg.field_b[6] = -2;
        tg.field_b[1] = 16;
        tg.field_b[7] = -1;
        tg.field_b[5] = -1;
        tg.field_b[11] = -1;
        tg.field_b[17] = -1;
        if (param0 <= 26) {
          this.l(-120);
        }
        tg.field_b[2] = -2;
        tg.field_b[12] = -1;
        tg.field_b[3] = -1;
        tg.field_b[18] = 1;
        tg.field_b[9] = -1;
        tg.field_b[16] = -1;
        tg.field_b[4] = -1;
    }

    final int a(boolean param0, boolean param1) {
        if (param1) {
          return -18;
        }
        return this.a(true, -1, param0);
    }

    final void c(boolean param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3;
        boolean stackIn_11_1 = false;
        int stackIn_11_2 = 0;
        Object stackIn_12_0;
        boolean stackIn_12_3;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0) {
          this.field_y = 12;
        }
        if (fe.c((byte) -123)) {
          stackIn_11_1 = false;
          stackIn_11_2 = -1;
          if (mg.field_k == null) {
            stackIn_12_0 = this;
            stackIn_12_3 = false;
          } else {
            stackIn_12_0 = this;
            stackIn_12_3 = true;
          }
          discarded$4 = this.a(stackIn_11_1, stackIn_11_2, stackIn_12_3);
        } else {
          if (10 <= vh.field_n) {
            if (rf.l(-108)) {
              if (hi.field_k != 0) {
                vi.a(false, of.field_K);
              } else {
                discarded$5 = this.a(false, -1, false);
              }
            } else {
              id.b(false);
            }
          }
        }
    }

    private final int h(int param0) {
        int var2;
        if (this.field_h) {
          return -1;
        }
        if (!sg.c(true)) {
          return -1;
        }
        if (fa.field_a) {
          return -1;
        }
        var2 = vc.a(this.field_z, this.field_o, -114, am.b(-70), true, uh.b(4));
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0) {
          if (hi.field_k == 11 &&
            o.field_j == 0) {
            id.a(false);
          }
        } else {
          if (1 == var2) {
            if (hi.field_k == 11 &&
              o.field_j == 0) {
              id.a(false);
            }
          } else {
            if (!pc.field_Y) {
              this.a(111, "reconnect");
            }
            md.b((byte) -111);
            se.a(kk.field_Y, (byte) -81, var2);
            fa.field_a = true;
            if (param0 != -10125) {
              this.n(-13);
            }
            lm.field_c = ji.b(param0 ^ 10203) + 15000L;
          }
        }
        return var2;
    }

    public static void g(int param0) {
        int var1 = -4 % ((param0 - 1) / 49);
        field_x = null;
    }

    protected ph() {
    }

    static {
        field_x = new int[8192];
    }
}
