/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static uf field_e;
    static int field_b;
    static String field_c;
    static String field_d;
    static int field_a;

    final static void a(byte param0) {
        hj var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        hj var9 = null;
        int var10 = 0;
        hj var11 = null;
        hj var12 = null;
        String var14 = null;
        hj var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        boolean stackIn_61_3;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        boolean stackIn_70_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = HoldTheLine.field_D;
        try {
          if (be.field_i != null &&
            be.field_i.b((byte) -123) &&
            be.field_i.b("benefits", 108) &&
            null != n.field_w &&
            n.field_w.b((byte) -95) &&
            n.field_w.b("benefits", -114)) {
            oa.field_s = dl.a(be.field_i, "benefits", false, "headline");
            im.field_k = dl.a(be.field_i, "benefits", false, "blurbpane");
            eg.field_c = dl.a(be.field_i, "benefits", false, "button");
            hl.field_d = dl.a(be.field_i, "benefits", false, "signup_text");
            mn.field_c = dl.a(be.field_i, "benefits", false, "menu_text");
            nc.field_h = dl.a(be.field_i, "benefits", false, "button_frame");
            nl.field_i = dl.a(be.field_i, "benefits", false, "arrow");
            tk.field_a = (qi) ((Object) ch.a("benefits", n.field_w, 14819, be.field_i, "large_font"));
            an.field_e = (qi) ((Object) ch.a("benefits", n.field_w, 14819, be.field_i, "small_font"));
            var28 = tc.field_b;
            var2 = tc.field_j;
            var3 = tc.field_c;
            tc.b(bd.field_R);
            var11 = new hj(nl.field_i.field_s + 4, 4 + nl.field_i.field_y);
            var11.f();
            nl.field_i.c(2, 2, t.field_n);
            fh.a(2, var11.field_y, var11.field_s, var11, 0, 0, 1, -24983);
            nl.field_i = var11;
            oh.field_m = nl.field_i.d();
            var12 = new hj(195, 221);
            var6 = var12.field_s / 2;
            var12.f();
            tk.field_a.b(sd.a(cc.field_v, new String[]{ec.field_z}, true), var6, 40, 16777215, -1);
            an.field_e.b(sd.a(fb.field_l, new String[]{ec.field_z}, true), var6, 60, 16777215, -1);
            tk.field_a.b(sd.a(jd.field_I, new String[]{jk.field_r}, true), var6, 110, 16777215, -1);
            an.field_e.b(sd.a(va.field_b, new String[]{jk.field_r}, true), var6, 130, 16777215, -1);
            tk.field_a.b(jg.field_q, var6, 180, 16777215, -1);
            an.field_e.b(fi.field_jb, var6, 200, 16777215, -1);
            fh.a(3, var12.field_y, var12.field_s, var12, 0, 0, 1, -24983);
            im.field_k.f();
            var12.a(-im.field_k.field_u + 18, 241 - im.field_k.field_x);
            for (var7 = 0; qh.field_b.length > var7; var7++) {
              lf.field_a[var7].f();
              an.field_e.a(qh.field_b[var7], 3, 3, lf.field_a[var7].field_s - 6, -6 + lf.field_a[var7].field_y, t.field_n, -1, 1, 1, an.field_e.field_I + an.field_e.field_G);
              fh.a(3, lf.field_a[var7].field_y, lf.field_a[var7].field_s, lf.field_a[var7], 0, 0, 1, -24983);
            }
            qh.field_b = null;
            ek.field_m = hl.field_d.e();
            ek.field_m.f();
            mk.a(255, tc.field_j, 2 * tc.field_c / 3, 0, 0, 64);
            tc.a(var28, var2, var3);
            tc.a(bd.field_R);
            qm.field_b = (eg.field_c.field_s - nc.field_h.field_s) / 2 + 231;
            pk.field_L = 390 + (eg.field_c.field_y - nc.field_h.field_y) / 2;
            vg.field_J = 434 + (-nc.field_h.field_s + eg.field_c.field_s) / 2;
            be.field_i = null;
            le.field_t = (eg.field_c.field_y - nc.field_h.field_y) / 2 + 390;
          }
          if (lf.field_e == null) {
            return;
          }
          if (null != wn.field_a &&
            null != tk.field_a) {
            var29 = tc.field_b;
            var2Lifetime1 = tc.field_j;
            var3Lifetime1 = tc.field_c;
            tc.b(bd.field_R);
            var14 = sd.a(ek.field_d, new String[]{lf.field_i[le.field_r]}, true);
            var5 = tk.field_a.b(var14, vb.field_d);
            var6Lifetime1 = tk.field_a.b(var14, vb.field_d, tk.field_a.field_G + tk.field_a.field_I);
            var7Lifetime1 = ih.field_m + (vb.field_d - var5) / 2;
            var8 = cd.field_b + (-var6Lifetime1 + mj.field_a) / 2;
            var7Lifetime1 -= 3;
            var5 += 6;
            var6Lifetime1 += 6;
            if (var7Lifetime1 < 0) {
              var9_int = -var7Lifetime1;
              ih.field_m = ih.field_m + var9_int;
              fh.field_e = fh.field_e - var9_int;
              var5 = var5 + 2 * var9_int;
              wn.field_a.field_u = wn.field_a.field_u + var9_int;
              wn.field_a.field_o = wn.field_a.field_o + var9_int * 2;
              var7Lifetime1 = var7Lifetime1 + var9_int;
            }
            var8 -= 3;
            if (wn.field_a.field_o < var7Lifetime1 + var5) {
              var9_intLifetime1 = var5 + var7Lifetime1 - wn.field_a.field_o;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              fh.field_e = fh.field_e - var9_intLifetime1;
              var5 = var5 + 2 * var9_intLifetime1;
              ih.field_m = ih.field_m + var9_intLifetime1;
              wn.field_a.field_u = wn.field_a.field_u + var9_intLifetime1;
              wn.field_a.field_o = wn.field_a.field_o + var9_intLifetime1 * 2;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              bj.field_G = bj.field_G - var9_intLifetime2;
              var8 = var8 + var9_intLifetime2;
              wn.field_a.field_x = wn.field_a.field_x + var9_intLifetime2;
              wn.field_a.field_v = wn.field_a.field_v + 2 * var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime2 * 2;
              cd.field_b = cd.field_b + var9_intLifetime2;
            }
            if (wn.field_a.field_v < var8 + var6Lifetime1) {
              var9_intLifetime3 = var8 + var6Lifetime1 - wn.field_a.field_v;
              bj.field_G = bj.field_G - var9_intLifetime3;
              cd.field_b = cd.field_b + var9_intLifetime3;
              wn.field_a.field_v = wn.field_a.field_v + 2 * var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              wn.field_a.field_x = wn.field_a.field_x + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime3 * 2;
            }
            wn.field_a.a();
            var9 = new hj(wn.field_a.field_o, wn.field_a.field_v);
            var9.f();
            tk.field_a.a(var14, ih.field_m, cd.field_b, vb.field_d, mj.field_a, 16777215, -1, 1, 1, tk.field_a.field_I + tk.field_a.field_G);
            fh.a(3, var9.field_v, var9.field_o, var9, 0, 0, 1, -24983);
            wn.field_a.f();
            var9.a(0, 0);
            na.field_t = new hj(640, 480);
            na.field_t.f();
            wn.field_a.b((wn.field_a.field_o >> 1) + fh.field_e, bj.field_G + (wn.field_a.field_v >> 1), bd.field_W, 4096);
            wn.field_a = null;
            na.field_t.c();
            tc.a(var29, var2Lifetime1, var3Lifetime1);
            tc.a(bd.field_R);
          }
          if (dl.field_j != null &&
            an.field_e != null) {
            var30 = tc.field_b;
            var2Lifetime2 = tc.field_j;
            var3Lifetime2 = tc.field_c;
            tc.b(bd.field_R);
            var16 = new hj(412, 43);
            var17 = sd.a(gk.field_a, new String[]{dl.field_j}, true);
            dl.field_j = null;
            var16.f();
            an.field_e.a(var17, 3, 3, var16.field_s - 6, -6 + var16.field_y, 16777215, -1, 0, 1, an.field_e.field_G + an.field_e.field_I);
            fh.a(3, var16.field_y, var16.field_s, var16, 0, 0, 1, -24983);
            lf.field_e.f();
            var16.a(199 - lf.field_e.field_u, 83 - lf.field_e.field_x);
            tc.a(var30, var2Lifetime2, var3Lifetime2);
            tc.a(bd.field_R);
          }
          if (gm.field_b != null &&
            null != an.field_e) {
            var31 = tc.field_b;
            var2Lifetime3 = tc.field_j;
            var3Lifetime3 = tc.field_c;
            tc.b(bd.field_R);
            var4 = an.field_e.b(jb.field_S, 640) + 6;
            var5Lifetime1 = gm.field_b.field_o + var4 + 20;
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = var6Lifetime2 + (gm.field_b.field_o + 20);
            lf.field_e.f();
            an.field_e.a(jb.field_S, -lf.field_e.field_u + var7Lifetime2, an.field_e.field_I + (an.field_e.field_G + 155 - lf.field_e.field_x), 16777215, -1);
            fh.a(3, 50, var4, lf.field_e, 155 - lf.field_e.field_x, -lf.field_e.field_u + (var7Lifetime2 - 4), 1, -24983);
            var8Lifetime1 = -((-3 + gm.field_b.field_v + (-an.field_e.field_G - an.field_e.field_I)) / 2) - lf.field_e.field_x + 155;
            gm.field_b.a(-lf.field_e.field_u + var6Lifetime2, var8Lifetime1);
            tc.a(var31, var2Lifetime3, var3Lifetime3);
            tc.a(bd.field_R);
            gm.field_b = null;
          }
          tc.b(bd.field_R);
          tc.a(16, 16, 608, 112, 15, ol.field_g, qe.field_b);
          tc.a(231, 144, 393, 232, 15, ol.field_g, qe.field_b);
          if (param0 <= 25) {
            en.a((byte) -48);
          }
          if (oa.field_s != null) {
            oa.field_s.a(0, 0);
          }
          if (null != im.field_k) {
            im.field_k.a(0, 0);
          }
          lf.field_e.a(0, 0);
          if (null != na.field_t) {
            na.field_t.a(0, 0);
          }
          if (null != eg.field_c &&
            nc.field_h != null) {
            eg.field_c.a(231, 390);
            var1 = hl.field_d;
            if (ln.field_k.field_g == 0) {
              var1 = ek.field_m;
            }
            var1.a(0, 0);
            stackIn_54_0 = io.field_b;
            if (ln.field_k.field_g == 0) {
              stackIn_55_1 = 4;
            } else {
              stackIn_55_1 = 3;
            }
            var2Lifetime4 = (oe.a(stackIn_54_0 << stackIn_55_1, 2) * 40 >> 16) + 40;
            if (var2Lifetime4 > 0) {
              eg.field_c.b(230, 389, var2Lifetime4);
              eg.field_c.b(232, 389, var2Lifetime4);
              eg.field_c.b(232, 391, var2Lifetime4);
              eg.field_c.b(230, 391, var2Lifetime4);
              var1.b(1, 1, var2Lifetime4);
              var1.b(-1, 1, var2Lifetime4);
              var1.b(1, -1, var2Lifetime4);
              var1.b(-1, -1, var2Lifetime4);
            }
            stackIn_60_0 = 80;
            stackIn_60_1 = qm.field_b;
            stackIn_60_2 = pk.field_L;
            stackIn_61_3 = (ln.field_k.field_g == 0);
            b.a(stackIn_60_0, stackIn_60_1, stackIn_60_2, stackIn_61_3);
          }
          if (eg.field_c != null &&
            null != nc.field_h) {
            eg.field_c.a(434, 390);
            mn.field_c.a(0, 0);
            if (1 == ln.field_k.field_g) {
              mk.a(255, eg.field_c.field_s - 4, 7 * eg.field_c.field_y / 12, 392, 436, 64);
            }
            stackIn_69_0 = 80;
            stackIn_69_1 = vg.field_J;
            stackIn_69_2 = le.field_t;
            stackIn_70_3 = (ln.field_k.field_g == 1);
            b.a(stackIn_69_0, stackIn_69_1, stackIn_69_2, stackIn_70_3);
          }
          if (nl.field_i != null) {
            var1_int = 357 - nl.field_i.field_v / 2;
            nl.field_i.a(269 - nl.field_i.field_o, var1_int);
            oh.field_m.a(586, var1_int);
            if (rf.field_X > var1_int &&
              nl.field_i.field_y + var1_int > rf.field_X) {
              var2Lifetime5 = (oe.a(io.field_b << 4, 2) * 40 >> 16) + 40;
              if (var2Lifetime5 > 0) {
                if (nc.field_g > 269 - nl.field_i.field_s &&
                  nc.field_g < 269) {
                  nl.field_i.b(-1 + (269 - nl.field_i.field_o), -1 + var1_int, var2Lifetime5);
                  nl.field_i.b(1 + (269 - nl.field_i.field_o), var1_int - 1, var2Lifetime5);
                  nl.field_i.b(-1 + (269 - nl.field_i.field_o), 1 + var1_int, var2Lifetime5);
                  nl.field_i.b(269 + (-nl.field_i.field_o + 1), 1 + var1_int, var2Lifetime5);
                } else {
                  if (nc.field_g > 586) {
                    if (nc.field_g >= 586 + nl.field_i.field_s) {
                      uk.a(3979);
                      lf.field_a[va.field_e].a(269, 340);
                      return;
                    }
                    oh.field_m.b(585, -1 + var1_int, var2Lifetime5);
                    oh.field_m.b(587, -1 + var1_int, var2Lifetime5);
                    oh.field_m.b(585, 1 + var1_int, var2Lifetime5);
                    oh.field_m.b(587, var1_int + 1, var2Lifetime5);
                  }
                }
              }
            }
          }
          uk.a(3979);
          lf.field_a[va.field_e].a(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "en.C(" + param0 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (tf.field_n != null) {
            jd.field_J = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("en.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (tf.field_n != null) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && 65535 != var2_int &&
              um.a(0, (char) var2_int)) {
              var3 = 1 + lj.field_b & 127;
              if (var3 != vj.field_l) {
                p.field_a[lj.field_b] = -1;
                d.field_b[lj.field_b] = (char)var2_int;
                lj.field_b = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "en.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12260) {
            field_e = (uf) null;
          }
          stackIn_3_0 = cf.a(param1, (byte) -28, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("en.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != -1) {
          field_b = -90;
        }
        field_e = null;
        field_d = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (tf.field_n != null) {
            cb.field_j = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              qj.field_N.length > var2_int) {
              var2_int = qj.field_N[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (jd.field_J >= 0 &&
              var2_int >= 0) {
              na.field_r[jd.field_J] = var2_int;
              jd.field_J = 1 + jd.field_J & 127;
              if (jd.field_J == th.field_j) {
                jd.field_J = -1;
              }
            }
            if (0 <= var2_int) {
              var3 = 127 & 1 + lj.field_b;
              if (var3 != vj.field_l) {
                p.field_a[lj.field_b] = var2_int;
                d.field_b[lj.field_b] = (char)0;
                lj.field_b = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) != 0 ||
              var2_int == 85 ||
              10 == var2_int) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("en.keyPressed(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        tm.field_c = 1000000000L / (long)param1;
        if (param0 >= -54) {
          field_e = (uf) null;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tf.field_n != null) {
            cb.field_j = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < qj.field_N.length) {
              var2_int = -129 & qj.field_N[var2_int];
            } else {
              var2_int = -1;
            }
            if (jd.field_J >= 0 &&
              var2_int >= 0) {
              na.field_r[jd.field_J] = ~var2_int;
              jd.field_J = jd.field_J + 1 & 127;
              if (jd.field_J == th.field_j) {
                jd.field_J = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("en.keyReleased(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static java.applet.Applet a(int param0) {
        if (null != ne.field_b) {
          return ne.field_b;
        }
        if (param0 < 72) {
          field_e = (uf) null;
        }
        return (java.applet.Applet) ((Object) vf.field_j);
    }

    final static void a(int param0, hd[] param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param0 != 5433) {
            field_c = (String) null;
          }
          for (var3_int = 1; var3_int < param2; var3_int++) {
            b.a(param1, (byte) 96, var3_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("en.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = "<img=2>";
        field_d = "Type your password again to make sure it's correct";
    }
}
