/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class i extends te {
    static mi field_r;
    private boolean field_m;
    private boolean field_x;
    private int field_A;
    private long field_s;
    static ej field_q;
    static long field_p;
    private int field_t;
    static int field_w;
    static int field_o;
    private int field_C;
    private boolean field_v;
    private int field_n;
    String field_y;
    private int field_B;
    static mi field_u;
    private int field_z;

    private final void n(int param0) {
        rb.field_a[4] = true;
        if (param0 != 20129) {
          this.m(2);
        }
    }

    private final void e(byte param0) {
        int var2 = -114 / ((28 - param0) / 54);
        rb.field_a[5] = true;
    }

    private final void d(byte param0) {
        rb.field_a[1] = true;
        if (param0 >= -96) {
          this.field_z = 30;
        }
    }

    final int l(int param0) {
        int var2;
        if (this.field_e) {
          return -1;
        }
        if (!rj.b(28404)) {
          return -1;
        }
        if (eg.field_l) {
          return -1;
        }
        if (param0 != -215) {
          this.l(63);
        }
        var2 = oi.a(true, this.field_v, wi.c(38), this.field_t, mc.a(param0 ^ -199), (byte) -91);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!ag.field_h) {
            this.a("reconnect", false);
          }
          vh.b(-4749);
          fh.a(var2, (byte) -1, gl.field_k);
          eg.field_l = true;
          ec.field_e = ri.a(-3) + 15000L;
          return var2;
        }
        if (rk.field_e == 11 &&
          ch.field_c == 0) {
          h.m(-31574);
        }
        return var2;
    }

    final void c(byte param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int var2;
        int var3;
        boolean stackIn_3_1 = false;
        boolean stackIn_4_2 = false;
        int var2Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var3 = Confined.field_J ? 1 : 0;
        if (!dc.f(-14)) {
          if (we.field_c < 10) {
            var2 = -4 % ((-48 - param0) / 60);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (hl.a((byte) 27)) {
              if (rk.field_e == 0) {
                discarded$5 = this.a(false, false, (byte) -106);
              } else {
                ca.a(il.field_cb, -1856653215);
              }
            } else {
              fa.g(0);
            }
          }
        } else {
          stackIn_3_1 = false;
          stackIn_4_2 = (dn.field_d != null);
          discarded$6 = this.a(stackIn_3_1, stackIn_4_2, (byte) -122);
        }
        if (decompiledFrameRemainder0) {
          var2Lifetime1 = -4 % ((-48 - param0) / 60);
        }

    }

    final void b(int param0, boolean param1) {
        int stackIn_25_0 = 0;
        boolean stackIn_100_0 = false;
        String stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        boolean stackIn_103_3;
        int stackIn_131_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Confined.field_J ? 1 : 0;
        if (null != gg.field_m) {
          if (null == dn.field_d) {
            var6 = wg.b((byte) -62);
            var4 = var6.getSize();
            gg.field_m.a(var4.width, (byte) 73, var4.height);
          }
          gg.field_m.d((byte) -44);
        }
        lf.c((byte) -84);
        nh.b(false);
        if (param0 != 110) {
          return;
        }
        if (!ga.g(15214) &&
          rk.field_e != 11) {
          ei.n(15102);
        }
        if (null != jc.field_c) {
          il.field_cb = jc.field_c.a(8);
        }
        if (kk.a(117)) {
          var3 = 1200 * bg.a(12398);
          if (this.field_m ||
            !(var3 >= eh.e(0)) &&
            !(qk.a((byte) -58) <= var3)) {
            this.field_m = false;
            dc.d(param0 ^ 6);
            vh.b(-4749);
            fh.a(2, (byte) -1, ii.field_g);
            sd.a((byte) -4);
            eg.field_l = true;
            ec.field_e = ri.a(-3) + 15000L;
          }
        }
        if (-1 == ch.field_c ||
          ch.field_c == 0) {
          stackIn_25_0 = (-1 != ch.field_c) ? 0 : 1;
          var3Lifetime1 = stackIn_25_0;
          ch.field_c = hn.g(18042);
          if (var3Lifetime1 != 0 &&
            ch.field_c == 0 &&
            rk.field_e == 11 &&
            !rj.b(28404)) {
            h.m(-31574);
          }
          if (ch.field_c != -1 &&
            ch.field_c != 0) {
            ec.field_e = ri.a(-3) + 15000L;
          }
        }
        if (-1 != ch.field_c &&
          0 != ch.field_c) {
          if (10 > we.field_c) {
            if (ch.field_c != 3) {
              if (ch.field_c != 4) {
                if (ch.field_c != 2) {
                  if (5 != ch.field_c) {
                    this.a("js5connect", false);
                  } else {
                    this.a("outofdate", false);
                  }
                } else {
                  this.a("js5connect_full", false);
                }
              } else {
                this.a("js5io", false);
              }
            } else {
              this.a("js5crc", false);
            }
          } else {
            if (rk.field_e >= 10) {
              vh.b(param0 ^ -4835);
              if (ch.field_c == 3) {
                fh.a(256, (byte) -1, jg.field_a);
              } else {
                if (ch.field_c == 4) {
                  fh.a(256, (byte) -1, wi.field_q);
                } else {
                  if (ch.field_c == 2) {
                    fh.a(256, (byte) -1, jc.field_a);
                  } else {
                    if (ch.field_c != 5) {
                      fh.a(256, (byte) -1, d.field_e);
                    } else {
                      fh.a(5, (byte) -1, bn.field_d);
                    }
                  }
                }
              }
              eg.field_l = true;
            }
          }
        }
        if ((ch.field_c != -1 &&
          0 != ch.field_c ||
          rj.b(28404)) &&
          ec.field_e <= ri.a(param0 - 113)) {
          eg.field_l = false;
          if (ch.field_c != -1 &&
            0 != ch.field_c) {
            ch.field_c = -1;
            a.a((byte) -26);
          }
        }
        if (ch.field_c == 0 &&
          !rj.b(28404)) {
          mk.field_o = false;
        }
        if (we.field_c == 0 &&
          cd.c((byte) 6)) {
          we.field_c = 1;
        }
        if (we.field_c == 1) {
          if (0 != hc.field_m) {
            o.field_f = cc.a(si.field_h, -14245);
          }
          wc.field_Wb = gi.a(gd.field_n, false, true, 1, true);
          field_r = gi.a(wg.field_e, false, true, 1, true);
          tf.field_k = gi.a(lc.field_z, false, true, 1, true);
          we.field_c = 2;
          pb.field_e = wc.field_Wb;
        }
        if (we.field_c == 2) {
          if (null != o.field_f &&
            o.field_f.b(0)) {
            if (o.field_f.b("", -4308)) {
              if (o.field_f.a("", 0)) {
                wb.a(param0 ^ 104, o.field_f);
                o.field_f = null;
                am.g(-4258);
              }
            } else {
              o.field_f = null;
            }
          }
          if (null == o.field_f) {
            we.field_c = 3;
          }
        }
        if (we.field_c == 3 &&
          nn.a(wc.field_Wb, tf.field_k, field_r, param0 ^ 117) &&
          qn.a(tf.field_k, -1)) {
          bd.b(param0 ^ -4585);
          lb.d(param0 - 228);
          qf.field_g = false;
          ui.field_b = ec.field_d;
          fi.a(tf.field_k, 0, d.field_d, wc.field_Wb, field_r);
          if (ad.field_d ||
            null != je.field_v) {
            stackIn_100_0 = !(ad.field_d);
            stackIn_102_1 = je.field_v;
            stackIn_102_2 = -120;
            stackIn_103_3 = !(ad.field_d);
            gk.$cfr$intArgs$a$c13c9cd76cbe(stackIn_100_0, stackIn_102_1, stackIn_102_2, stackIn_103_3);
          }
          if (ve.field_g) {
            bd.a(param0 ^ 1849965388);
          }
          if (vg.field_G == null) {
            vg.field_G = n.a(21146);
            la.field_O = hd.a(58);
          }
          og.a((byte) 122, tf.field_k, vg.field_G, la.field_O);
          tf.field_k = null;
          field_r = null;
          wc.field_Wb = null;
          ec.a((java.applet.Applet) (this), 3);
          am.g(-4258);
          we.field_c = 10;
        }
        if (we.field_c == 10) {
          if (hc.field_m != 0) {
            fj.field_u = cc.a(cf.field_ib, param0 ^ -14283);
          }
          we.field_c = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (we.field_c == 11) {
          if (fj.field_u != null && (!fj.field_u.b(param0 ^ 110) ||
            !fj.field_u.a(25057))) {
            jc.a(ka.a(fj.field_u, hc.field_s, -12, b.field_k), 10265, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            we.field_c = 12;
            pc.field_d = true;
          }
        }
        if (we.field_c == 12 &&
          !pc.field_d) {
          we.field_c = 13;
        }
        if (we.field_c == 13) {
          var3Lifetime2 = 1;
          if (null != dg.field_n) {
            stackIn_131_0 = (!dg.field_n.a(-1)) ? 0 : 1;
            var3Lifetime2 = stackIn_131_0;
            jc.a(dg.field_n.field_e, 10265, dg.field_n.field_g);
          }
          if (var3Lifetime2 != 0) {
            we.field_c = 20;
          }
        }
        if (!param1 &&
          ac.field_a) {
          fa.a(fb.field_b, 100);
          this.g(122);
          ac.a(fb.field_b, (byte) -102);
        }
        if (rb.field_a[8]) {
          og.a(false);
        }
    }

    final void a(int param0, String param1, int param2) {
        try {
          this.a(param2, 480, param1, (byte) -83, param0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "i.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(int param0) {
        int stackIn_28_0 = 0;
        boolean stackIn_29_1 = false;
        int var2;
        oc var3;
        int var4;
        var4 = Confined.field_J ? 1 : 0;
        var2 = Confined.field_F;
        if (64 > var2 &&
          rb.field_a[var2]) {
          if (var2 == 0) {
            return;
          }
          L1: {
            switch (var2) {
              case 2:
                md.b(-10964);
                break;
              case 3:
                md.a((byte) 105);
                break;
              case 4:
                ji.b((byte) 54);
                break;
              case 5:
                s.h(0);
                break;
              case 7:
                this.m(31819);
                break;
              case 16:
                rc.b(-22889);
                break;
              default:
                if (var2 != 11 &&
                  var2 != 12) {
                  switch (var2) {
                    case 13:
                      kg.i((byte) -52);
                      break L1;
                    case 17:
                      this.b(false);
                      break L1;
                    case 18:
                      sf.c(-52);
                      break L1;
                    default:
                      mb.a("MGS1: " + ui.a(10), true, (Throwable) null);
                      dc.d(124);
                      break L1;
                  }
                }
                stackIn_28_0 = 1;
                stackIn_29_1 = (var2 == 12);
                var3 = vm.a(stackIn_28_0, stackIn_29_1);
                vg.a(false, var3);
                break;
              case 8:
                b.a(ki.field_d, -85, e.field_c, ai.field_i);
                break;
              case 6:
                cc.b(0);
                break;
              case 1:
                hl.a(-251);
                break;
            }
          }
          if (param0 < 97) {
            field_w = 72;
          }
          return;
        }
        mb.a("MGS2: " + ui.a(10), true, (Throwable) null);
        dc.d(118);
    }

    private final void j(int param0) {
        ib.field_M[9] = -1;
        ib.field_M[13] = -1;
        ib.field_M[7] = -1;
        ib.field_M[17] = -1;
        ib.field_M[6] = -2;
        ib.field_M[12] = -1;
        ib.field_M[2] = -2;
        ib.field_M[10] = -1;
        ib.field_M[8] = -2;
        ib.field_M[11] = -1;
        ib.field_M[5] = -1;
        ib.field_M[4] = -1;
        ib.field_M[16] = param0;
        ib.field_M[3] = -1;
        ib.field_M[18] = 1;
        ib.field_M[1] = 16;
    }

    private final void k(int param0) {
        rb.field_a[param0] = true;
    }

    private final void a(int param0, int param1, String param2, byte param3, int param4) {
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
            if (!this.a(true)) {
              return;
            }
            this.field_y = this.getCodeBase().getHost();
            if (param3 > -16) {
              return;
            }
            var6 = this.field_y.toLowerCase();
            stackIn_10_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_v = stackIn_10_1;
            this.field_A = Integer.parseInt(this.getParameter("gameport1"));
            this.field_B = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_n = Integer.parseInt(var7);
            }
            this.field_C = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_s = Long.parseLong(this.getParameter("instanceid"));
            this.field_x = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_z = Integer.parseInt(var8);
            }
            if (this.field_z >= 5) {
              this.field_z = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_t = Integer.parseInt(var9);
            }
            ve.field_g = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param1, this.field_C, param0, 69, param4, 32, param2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            mb.a((String) null, true, (Throwable) ((Object) var6_ref));
            this.a("crash", false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("i.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, true);
        if (param1 != 111) {
          i.b((byte) -64);
        }
        if (param0) {
          this.d((byte) -106);
        }
        if (param4) {
          this.k(2);
        }
        if (param2) {
          this.n(20129);
        }
        if (param3) {
          this.e((byte) -35);
        }
    }

    public static void b(byte param0) {
        field_u = null;
        field_q = null;
        if (param0 <= 24) {
          i.a('￁', (byte) 35);
        }
        field_r = null;
    }

    final void a(byte param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param0 != 19) {
          i.b((byte) -65);
        }
        hc.field_m = this.field_z;
        fd.a(30177, hc.field_m);
        tl.a(this.field_C, this.field_y, 5000, hc.field_m, param0 + 9718, this.field_x, ki.field_d, this.field_n, param4, this.field_s, this.field_A, this.field_B, param1, 5000);
        ng.a(this.field_A, this.field_n, 24774, this.field_B, hc.field_m, this.field_C, ki.field_d, this.field_y, param1);
        kh.h(-66);
        jc.field_c = ba.h((byte) 110);
        ac.a(fb.field_b, (byte) -118);
        lc.field_z = param7;
        gd.field_n = param6;
        si.field_h = param5;
        wg.field_e = param3;
        cf.field_ib = param2;
        this.j(-1);
        eh.d(-117);
    }

    final int a(boolean param0, int param1) {
        if (param1 != 30116) {
          this.k(13);
        }
        return this.a(true, param0, (byte) -127);
    }

    private final void m(int param0) {
        if (param0 != 31819) {
          return;
        }
        String var2 = mh.a(true);
        ci.a(ii.b(false), var2, -77);
    }

    final static char a(char param0, byte param1) {
        int var2;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        if (param1 > -7) {
          return '\020';
        }
        var2 = param0;
        if (32 == var2) {
          return '_';
        }
        if (var2 == 160) {
          return '_';
        }
        if (var2 == 95) {
          return '_';
        }
        if (45 == var2) {
          return '_';
        }
        if (var2 != 91) {
          if (var2 == 93) {
            return param0;
          }
          if (var2 != 35) {
            if (var2 != 224 &&
              var2 != 225) {
              if (var2 == 226) {
                return 'a';
              }
              if (var2 == 228) {
                return 'a';
              }
              if (227 == var2) {
                return 'a';
              }
              if (var2 != 192) {
                if (var2 == 193) {
                  return 'a';
                }
                if (194 != var2) {
                  if (var2 == 196) {
                    return 'a';
                  }
                  if (var2 != 195) {
                    if (var2 != 232) {
                      if (var2 == 233) {
                        return 'e';
                      }
                      if (var2 == 234) {
                        return 'e';
                      }
                      if (var2 == 235) {
                        return 'e';
                      }
                      if (var2 != 200 &&
                        var2 != 201) {
                        if (var2 == 202) {
                          return 'e';
                        }
                        if (var2 != 203) {
                          if (237 == var2) {
                            return 'i';
                          }
                          if (238 != var2) {
                            if (var2 == 239) {
                              return 'i';
                            }
                            if (var2 == 205) {
                              return 'i';
                            }
                            if (var2 != 206 &&
                              207 != var2) {
                              if (var2 != 242) {
                                if (243 == var2) {
                                  return 'o';
                                }
                                if (var2 == 244) {
                                  return 'o';
                                }
                                if (var2 == 246) {
                                  return 'o';
                                }
                                if (var2 != 245 &&
                                  var2 != 210) {
                                  if (var2 == 211) {
                                    return 'o';
                                  }
                                  if (212 == var2) {
                                    return 'o';
                                  }
                                  if (var2 == 214) {
                                    return 'o';
                                  }
                                  if (var2 == 213) {
                                    return 'o';
                                  }
                                  if (249 != var2) {
                                    if (var2 == 250) {
                                      return 'u';
                                    }
                                    if (var2 != 251 &&
                                      252 != var2 &&
                                      var2 != 217 &&
                                      218 != var2 &&
                                      var2 != 219 &&
                                      var2 != 220) {
                                      if (231 != var2 &&
                                        var2 != 199) {
                                        if (var2 != 255 &&
                                          376 != var2) {
                                          if (241 != var2 &&
                                            var2 != 209) {
                                            if (var2 != 223) {
                                              return Character.toLowerCase(param0);
                                            }
                                            return 'b';
                                          }
                                          return 'n';
                                        }
                                        return 'y';
                                      }
                                      return 'c';
                                    }
                                  }
                                  return 'u';
                                }
                              }
                              return 'o';
                            }
                          }
                          return 'i';
                        }
                      }
                    }
                    return 'e';
                  }
                }
              }
            }
            return 'a';
          }
        }
        return param0;
    }

    private final int a(boolean param0, boolean param1, byte param2) {
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
          kg var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Confined.field_J ? 1 : 0;
          var4 = cc.a(param1, (byte) -111, hc.field_m, il.field_cb);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5_int = s.a(aa.a((byte) -115), md.c(97), (byte) -87);
            if (-1 != var5_int) {
              gj.a(gl.field_k, true, sc.field_g, var5_int);
              gl.field_k = null;
              sc.field_g = null;
            }
            var11 = dj.i((byte) 118);
            if (var11 != null) {
              qj.a(-72, var11.booleanValue());
            }
          }
          if (2 == var4) {
            var5_intLifetime1 = rd.a(mc.a(16), this.field_t, 28406, qj.a(1), va.b(8), wi.c(22), hk.a(-1));
            if (var5_intLifetime1 != -1) {
              ud.a(false, var5_intLifetime1, gl.field_k, sc.field_g);
              gl.field_k = null;
              sc.field_g = null;
            }
          }
          if (3 == var4) {
            if (ch.field_c != -1 &&
              ch.field_c != 0) {
              ch.field_c = -1;
              a.a((byte) -26);
            }
            if (!param0) {
              var5_intLifetime2 = oi.a(false, this.field_v, wi.c(-123), this.field_t, mc.a(16), (byte) -89);
              if (-1 != var5_intLifetime2) {
                if (var5_intLifetime2 != 0) {
                  fh.a(var5_intLifetime2, (byte) -1, gl.field_k);
                  gl.field_k = null;
                } else {
                  field_p = vb.field_d;
                  h.m(-31574);
                  fd.field_j = false;
                  rk.field_e = 10;
                }
              }
            } else {
              eg.field_l = false;
            }
          }
          if (var4 == 4) {
            if (!d.field_d) {
              fd.field_j = true;
              rk.field_e = 10;
            } else {
              pe.a(ii.b(false), (byte) 11);
            }
          }
          if (param2 >= -76) {
            i.a('ﾵ', (byte) -116);
          }
          if (var4 == 5) {
            jn.a(false, ii.b(false));
          }
          if (var4 == 6 &&
            qf.field_g) {
            rk.field_e = 10;
          }
          if (var4 == 7) {
            ci.a(ii.b(false), true);
          }
          if (var4 == 8) {
            pe.a(ii.b(false), (byte) 11);
          }
          if (9 == var4) {
            pe.a(-59, ii.b(false));
          }
          if (var4 == 10) {
            vh.field_a.b(true, 17);
          }
          if (var4 == 11) {
            me.a((byte) 102, ii.b(false));
          }
          if (var4 == 12) {
            li.a(ii.b(false), 104, ci.a((byte) -102));
          }
          if (var4 == 13) {
            try {
              if (cg.field_e == null) {
                cg.field_e = new pk(ki.field_d, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (cg.field_e.b(1)) {
                var12 = cg.field_e.a(-4);
                if (var12 == null) {
                  var9 = (String) null;
                  tk.a(13, (String) null);
                } else {
                  var7 = kh.a(var12.field_m, var12.field_n, 0, 0);
                  tk.a(13, var7);
                }
                cg.field_e = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              mb.a("S1", true, (Throwable) ((Object) var5));
              var10 = (String) null;
              tk.a(13, (String) null);
              cg.field_e = null;
            }
          }
          if (var4 == 15) {
            rk.field_e = 10;
          }
          if (var4 == 16) {
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

    private final void b(boolean param0) {
        int var2 = e.field_c.c(32);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = ai.field_i - 1;
        byte[] var5 = new byte[var4];
        e.field_c.a(var5, 0, var4, 0);
        pk.a(var3 != 0, va.a(0, var5), ii.b(param0), (byte) 73);
    }

    private final void a(boolean param0, boolean param1) {
        rb.field_a[8] = param0;
        rb.field_a[0] = param1;
        rb.field_a[16] = true;
        rb.field_a[18] = true;
        rb.field_a[17] = true;
        rb.field_a[7] = true;
        rb.field_a[3] = true;
    }

    protected i() {
    }

    static {
        field_w = 0;
        field_q = new ej();
    }
}
