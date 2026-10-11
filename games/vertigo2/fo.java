/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo {
    static cr field_f;
    private int field_b;
    static boolean field_d;
    static si field_e;
    private uj field_a;
    static cr field_c;

    final void c(int param0) {
        if (this.field_b == 19) {
          ue.field_J = null;
        }
        if (param0 != 20) {
          return;
        }
        if (this.field_b == 6) {
          wh.field_D = null;
        }
        if (this.field_b == 5) {
          as.field_e = null;
        }
    }

    private final void a(int param0, lj param1, int param2) {
        int var5 = 0;
        Object var4 = null;
        int var6 = 0;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          var4 = null;
          for (var5 = 0; param1.field_l.length > var5; var5++) {
            if ((1 << var5 & param1.field_u) != 0) {
              if (var5 == param0) {
                var4 = cd.field_c;
              } else {
                var4 = Vertigo2.a(new String[]{param1.field_w[var5]}, ca.field_e, param2 - 27609);
              }
            }
          }
          if (param2 != 27670) {
            field_d = false;
          }
          if (var4 != null) {
            va.field_s.a((String) (var4), 16777215, -1, 320, 380, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("fo.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) (stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final void e(byte param0) {
        int var3 = 0;
        boolean[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        boolean stackIn_58_2 = false;
        boolean[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        boolean stackIn_79_2 = false;
        int var2;
        int var4;
        String var5;
        int var2Lifetime1;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (!rg.field_b &&
          !kj.field_C) {
          while (gf.a(false)) {
            if (de.field_f != 13) {
              this.d((byte) 106);
              if (-1 == this.field_a.field_c) {
                continue;
              }
              this.b(this.field_a.field_c, false, 404);
              continue;
            }
            if (this.field_b == 0) {
              continue;
            }
            if ((1 != this.field_b ||
              ln.field_d == null) &&
              (this.field_b != 2 &&
              22 != this.field_b &&
              this.field_b != 3 &&
              this.field_b != 4)) {
              if (21 != this.field_b &&
                9 != this.field_b &&
                this.field_b != 11 &&
                this.field_b != 5) {
                if (this.field_b != 14 &&
                  this.field_b != 15 &&
                  this.field_b != 16) {
                  if (this.field_b != 18 &&
                    this.field_b != 7) {
                    if (10 == this.field_b) {
                      continue;
                    }
                    if (ue.field_O == 1) {
                      continue;
                    }
                    if (ue.field_O == 2) {
                      continue;
                    }
                    if (ue.field_O == 18) {
                      continue;
                    }
                    if (ue.field_O == 3) {
                      continue;
                    }
                    if (4 == ue.field_O) {
                      continue;
                    }
                    gj.a((byte) 116, false, ue.field_O, ue.field_O);
                    continue;
                  }
                  gj.a((byte) -65, false, ue.field_O, ue.field_O);
                  continue;
                }
                this.a(true, (byte) -66, false, 0);
                continue;
              }
              if (this.field_b == 11) {
                an.field_c = true;
                lc.field_d = false;
              }
              gj.a((byte) 116, false, am.field_n, 0);
              continue;
            }
            gj.a((byte) 116, false, am.field_n, -1);
          }
          this.field_a.a((byte) -29, this.a(31, ed.field_n, gb.field_d), this.a(121, sd.field_N, no.field_e));
          if (this.field_a.field_c != -1) {
            this.b(this.field_a.field_c, true, 404);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_b == 8) {
          this.a(false, (byte) -116);
        } else {
          if (this.field_b != 9 &&
            this.field_b != 10) {
            if (13 == this.field_b) {
              for (var2 = 0; var2 < qi.field_d.field_k.length; var2++) {
                stackIn_78_0 = qi.field_d.field_y;
                stackIn_78_1 = var2;
                stackIn_79_2 = !(t.field_l < var2);
                stackIn_78_0[stackIn_78_1] = stackIn_79_2;
              }
              if (0 <= qi.field_d.field_t) {
                if (t.field_l >= qi.field_d.field_t &&
                  wi.field_f != qi.field_d.field_t) {
                  lb.field_d.a((byte) 99, qi.field_d.field_t, kn.field_h[0][qi.field_d.field_t]);
                  wi.field_f = qi.field_d.field_t;
                  gm.a(29, (byte) -55);
                }
                if (tf.field_l != null &&
                  lb.field_d != null) {
                  tf.field_l.a(lb.field_d, 0, -88);
                }
              } else {
                if (tf.field_l != null &&
                  lb.field_d != null) {
                  tf.field_l.a(lb.field_d, 0, -88);
                }
              }
              qi.field_d.b(false);
              if (!(!qi.field_d.c(-71))) {
                this.a(true, (byte) -120, true, 1);
              }
            } else {
              if ((this.field_b == 19)) {
                if (!mh.field_a) {
                  uh.field_Wb.j(64, 123);
                  uh.field_Wb.f(1, 107);
                  uh.field_Wb.f(0, 101);
                  mh.field_a = true;
                }
                var2Lifetime1 = t.field_l;
                for (var3 = 0; var3 < ap.field_d.field_k.length; var3++) {
                  stackIn_57_0 = ap.field_d.field_y;
                  stackIn_57_1 = var3;
                  stackIn_58_2 = !(var2Lifetime1 < var3);
                  stackIn_57_0[stackIn_57_1] = stackIn_58_2;
                }
                if (ap.field_d.field_t >= 0) {
                  if (ap.field_d.field_t <= var2Lifetime1 &&
                    ap.field_d.field_t != wi.field_f) {
                    lq.field_b.a((byte) 74, ap.field_d.field_t, kn.field_h[0][ap.field_d.field_t]);
                    wi.field_f = ap.field_d.field_t;
                    gm.a(29, (byte) -55);
                  }
                  if (tf.field_l != null &&
                    lq.field_b != null) {
                    tf.field_l.a(lq.field_b, 0, -109);
                  }
                } else {
                  if (tf.field_l != null &&
                    lq.field_b != null) {
                    tf.field_l.a(lq.field_b, 0, -109);
                  }
                }
                ap.field_d.b(false);
                if (!(!ap.field_d.c(85))) {
                  this.a(true, (byte) -74, true, 1);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.a(true, (byte) 60);
          }
        }
        if (param0 > -120) {
          var5 = (String) null;
          this.a(30, 11, -49, (byte) -91, -84, -65, (String) null, -36, 99);
        }
    }

    private final void f(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (!am.field_b &&
          !ed.field_q) {
          return;
        }
        if (param0 != 380) {
          field_d = false;
        }
        lj var5 = am.field_b ? ln.field_d.field_D : oe.field_pb.field_D;
        lj var2 = var5;
        int var3 = am.field_b ? ln.field_d.field_B : -1;
        if (var5.b((byte) 115) < 0) {
          va.field_s.a(go.field_d, 16777215, -1, 320, 350, 2);
        } else {
          if (var5.b(-6133) >= kn.field_h[1].length - 1) {
            va.field_s.a(ia.field_I, 16777215, -1, 320, 380, param0 ^ 382);
          } else {
            va.field_s.a(Vertigo2.a(new String[]{Integer.toString(1 + var5.b(-6133))}, uh.field_lc, 105), 16777215, -1, 320, 380, 2);
          }
        }
        this.a(var3, var5, 27670);
        this.a((byte) 7, var5);
    }

    private final void c(byte param0) {
        if (param0 < 102) {
          this.a(false);
        }
    }

    private final int a(int param0, int param1) {
        int var3 = -115 / ((63 - param1) / 62);
        if (oj.field_Q[this.field_b]) {
          if ((this.field_b == 5 || this.field_b == 6) &&
            2 == this.field_a.field_b) {
            if (param0 == 0) {
              return 24 + (320 + va.field_s.a(1, sp.field_Q) / 2);
            }
            return this.b(param0, 26) + 160;
          }
          return this.b(param0, 31) + oj.field_H[this.field_b];
        }
        return oj.field_I[this.field_b];
    }

    private final void a(boolean param0, byte param1) {
        int var4 = 0;
        int var3 = 54 % ((param1 + 46) / 59);
        oa.field_q = this.a(param0, ed.field_n, (byte) 121, gb.field_d);
        if (kf.field_c == 1) {
          var4 = this.a(param0, sd.field_N, (byte) 119, no.field_e);
          if (qc.field_t == var4) {
            qc.field_t = -1;
          } else {
            if (-1 != var4) {
              qc.field_t = var4;
            }
          }
        }
    }

    private final void d(int param0) {
        jq.a(92, 20, 110, 360, 310);
        if (!ag.b(49)) {
          this.g(2);
        } else {
          this.c((byte) 109);
        }
        String var2 = !ag.b(49) ? tr.field_O : vg.field_b;
        rq.a(36, 32 + va.field_s.a(param0 - 11058, var2), 425, -(va.field_s.a(param0 - 11058, var2) / 2) - 16 + 320, 73, 100);
        va.field_s.a(var2, 16777215, -1, 320, 450, 2);
        if (param0 != 11059) {
          this.field_b = -90;
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        var3 = Vertigo2.field_L ? 1 : 0;
        jq.a(87, 160, 180, 320, 140);
        if (null == ig.field_c) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (fm.field_d < ig.field_c[cg.field_d]) {
          va.field_s.a(16777215, (byte) 120, -1, 180, Vertigo2.a(new String[]{Integer.toString(1 + cg.field_d)}, fa.field_r, -123), 210);
          tk.field_c.a(Vertigo2.a(new String[]{gl.a(-36, true, false, fm.field_d)}, wq.field_L, -121), 460, 240, 16777215, -1);
          tk.field_c.a(Vertigo2.a(new String[]{gl.a(-99, true, false, (int) ig.field_c[cg.field_d])}, or.field_g, -20), 460, 260, 16777215, -1);
          tk.field_c.a(Vertigo2.a(new String[]{gl.a(-65, true, false, -fm.field_d + ig.field_c[cg.field_d])}, to.field_f, -120), 460, 280, 65280, -1);
          if (te.field_B[cg.field_d] < fm.field_d) {
            if (fm.field_d <= sf.field_e[cg.field_d]) {
              if (ig.field_c[cg.field_d] > sf.field_e[cg.field_d]) {
                tk.field_c.b(hd.field_h, 180, 240, 16777215, -1);
                kq.field_Kb.c(208, 256);
                var2 = -24 % ((33 - param0) / 60);
              } else {
                tk.field_c.b(ke.field_c, 180, 240, 16777215, -1);
                kq.field_Kb.c(208, 256);
                var2Lifetime3 = -24 % ((33 - param0) / 60);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (bp.field_E[cg.field_d] < fm.field_d) {
                var2Lifetime2 = -24 % ((33 - param0) / 60);
                decompiledFrameRemainder0 = false;
              }
              else {
                if (ig.field_c[cg.field_d] <= bp.field_E[cg.field_d]) {
                  tk.field_c.b(ke.field_c, 180, 240, 16777215, -1);
                  hh.field_a.c(208, 256);
                } else {
                  tk.field_c.b(hd.field_h, 180, 240, 16777215, -1);
                  hh.field_a.c(208, 256);
                }
              }
            }
          } else {
            if (te.field_B[cg.field_d] < ig.field_c[cg.field_d]) {
              tk.field_c.b(hd.field_h, 180, 240, 16777215, -1);
              il.field_c.c(208, 256);
            } else {
              tk.field_c.b(ke.field_c, 180, 240, 16777215, -1);
              il.field_c.c(208, 256);
            }
          }
        } else {
          va.field_s.a(16777215, (byte) 124, -1, 180, Vertigo2.a(new String[]{Integer.toString(1 + cg.field_d)}, vq.field_k, -11), 210);
          tk.field_c.a(Vertigo2.a(new String[]{gl.a(-89, true, false, fm.field_d)}, wq.field_L, -127), 460, 240, 16777215, -1);
          tk.field_c.a(Vertigo2.a(new String[]{gl.a(-72, true, false, (int) ig.field_c[cg.field_d])}, he.field_t, 62), 460, 260, 16777215, -1);
          tk.field_c.a(Vertigo2.a(new String[]{gl.a(-48, true, false, fm.field_d - ig.field_c[cg.field_d])}, lr.field_K, 39), 460, 280, 16711680, -1);
          tk.field_c.b(ke.field_c, 180, 240, 16777215, -1);
          if (ig.field_c[cg.field_d] <= te.field_B[cg.field_d]) {
            il.field_c.c(208, 256);
          } else {
            if (sf.field_e[cg.field_d] < ig.field_c[cg.field_d]) {
              if (ig.field_c[cg.field_d] <= bp.field_E[cg.field_d]) {
                hh.field_a.c(208, 256);
              }
            } else {
              kq.field_Kb.c(208, 256);
            }
          }
        }
        if (decompiledFrameRemainder0) {
          var2Lifetime1 = -24 % ((33 - param0) / 60);
        }

    }

    private final void a(int param0, boolean param1) {
        int incrementValue$0 = 0;
        int var18 = 0;
        int stackIn_3_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_40_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        er var8_ref_er;
        int var9;
        int var10;
        int var11;
        int var12;
        String[] var13;
        String var14;
        int var15;
        int var16;
        int var17;
        int var19;
        int var7Lifetime1;
        int var8Lifetime1;
        int var16Lifetime1;
        var19 = Vertigo2.field_L ? 1 : 0;
        var3 = 84;
        var4 = 130;
        if (!param1) {
          stackIn_3_0 = ml.field_z;
        } else {
          stackIn_3_0 = jq.field_e;
        }
        var5 = stackIn_3_0;
        if (param0 != ~(4096 & var5) ||
          on.a((byte) -85, 0)) {
          var3 -= 20;
        }
        var6 = 0;
        rq.a(100, 600, 100, 20, 63, 150);
        rq.a(200, 600, 210, 20, 69, 150);
        for (var7 = 0; var7 < hi.field_i.length; var7++) {
          L14: {
            if (0 == (var5 & 1 << var7)) {
              if (param1) {
                break L14;
              }
              if (var7 == 12 &&
                !on.a((byte) -104, 0)) {
                break L14;
              }
              var8_ref_er = vp.field_b;
            } else {
              var8_ref_er = vj.field_b[var7];
            }
            if (qc.field_t == var7) {
              var8_ref_er.d(var3 + 4, -4 + var4);
            } else {
              if (var7 != oa.field_q) {
                var8_ref_er.d(var3, var4);
              } else {
                var8_ref_er.d(var3 + 2, -2 + var4);
              }
            }
            incrementValue$0 = var6;
            var6++;
            if (incrementValue$0 == 12) {
              var3 = 84;
              var4 += 40;
            } else {
              var3 += 40;
            }
          }
        }
        if (qc.field_t != -1) {
          stackIn_32_0 = qc.field_t;
        } else {
          stackIn_32_0 = oa.field_q;
        }
        var7Lifetime1 = stackIn_32_0;
        if (ag.b(49)) {
          var8 = 240 + oj.field_F[this.field_b] >> 1;
          va.field_s.a(vg.field_b, 16777215, -1, 320, var8, 2);
        }
        if (var7Lifetime1 != -1) {
          if (!ag.b(49)) {
            var8Lifetime1 = va.field_s.field_c + va.field_s.field_g;
            va.field_s.a(16777215, (byte) 115, -1, 250, hi.field_i[var7Lifetime1], 240);
            stackIn_40_0 = ((1 << var7Lifetime1 & var5) == 0) ? 0 : 1;
            var9 = stackIn_40_0;
            if (var9 != 0) {
              va.field_s.a(16725760, (byte) 84, -1, 250, wj.field_a, 10 + var8Lifetime1 + 240);
            } else {
              va.field_s.a(16725760, (byte) 91, -1, 250, cr.field_Z, 240 + var8Lifetime1 + 10);
            }
            var10 = 240;
            if (var9 == 0) {
              vp.field_b.e(80, var10);
            } else {
              ((fe) (vj.field_b[var7Lifetime1])).e(80, var10);
            }
            var10 = var10 + (va.field_s.field_j + var8Lifetime1);
            var11 = var10;
            var10 = var10 + va.field_s.field_j;
            var12 = 128 + var11 - va.field_s.field_j;
            var13 = new String[16];
            var14 = nj.field_i[var7Lifetime1];
            if (var9 == 0 &&
              var7Lifetime1 == 12) {
              var14 = iq.field_z;
            }
            var15 = tk.field_c.a(var14, new int[]{310}, var13);
            for (var16 = 0; var16 < var15; var16++) {
              tk.field_c.b(var13[var16], 250, var10, 16777215, -1);
              var10 = var10 + var8Lifetime1;
            }
            tk.field_c.b(pl.field_j + aq.field_d[var7Lifetime1], 250, -(k.field_c.field_t * 2) + var12 - tk.field_c.field_M, 16777215, -1);
            tk.field_c.b(vl.field_f, 250, -tk.field_c.field_M + var12, 16777215, -1);
            var16Lifetime1 = tk.field_c.c(vl.field_f) + 250;
            var17 = -((k.field_c.field_t + va.field_s.field_j) / 2) + (var12 - tk.field_c.field_M);
            for (var18 = 0; var18 < sa.field_d[var7Lifetime1]; var18++) {
              k.field_c.e(var16Lifetime1, var17);
              var16Lifetime1 = var16Lifetime1 + k.field_c.field_y / 3;
            }
          }
        } else {
          if (!ag.b(49)) {
            va.field_s.a(fj.field_hb, 16777215, -1, 320, 240, 2);
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, int param5, String param6, int param7, int param8) {
        String var15 = null;
        String var16 = null;
        String var17 = null;
        int var10_int = param8 + param2 + param0;
        if (-1 != param5) {
          tk.field_c.a(param5 + 1 + ". ", 60, param1, param7, -1);
        }
        if (var10_int != 0) {
          param0 = (param0 * 200 + var10_int) / (2 * var10_int);
          param2 = (var10_int + param2 * 200) / (2 * var10_int);
          param8 = (var10_int + param8 * 200) / (var10_int * 2);
        }
        String var12 = param6;
        tk.field_c.b(var12, 60, param1, param7, -1);
        String var13 = "" + param4;
        tk.field_c.c(var13, pn.field_K[0], param1, param7, -1);
        String var14 = var10_int < 50 ? Integer.toString(var10_int) : "50+";
        String var11 = var14;
        tk.field_c.c(var14, pn.field_K[1], param1, param7, -1);
        if (param3 <= 22) {
          return;
        }
        try {
          var15 = param8 + "%";
          tk.field_c.c(var15, pn.field_K[2], param1, param7, -1);
          var16 = param2 + "%";
          tk.field_c.c(var16, pn.field_K[3], param1, param7, -1);
          var17 = param0 + "%";
          tk.field_c.c(var17, pn.field_K[4], param1, param7, -1);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "fo.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void a(byte param0, lj param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          var3_int = 8;
          var4 = var3_int * 2 + 210;
          if (param0 != 7) {
            field_c = (cr) null;
          }
          var5 = 190;
          var6 = 180;
          var7 = var6;
          va.field_s.a(16777215, (byte) 64, -1, var4, fk.field_G, var6);
          va.field_s.a(var4 + var5, -43, 16777215, var6, -1, Integer.toString(1 + param1.field_e));
          var6 += 20;
          va.field_s.a(16777215, (byte) 62, -1, var4, le.field_a, var6);
          va.field_s.a(var5 + var4, -40, 16777215, var6, -1, Integer.toString(kn.field_h[param1.field_j].length > param1.field_e + param1.field_c ? param1.field_c + param1.field_e : kn.field_h[param1.field_j].length));
          var6 += 20;
          va.field_s.a(16777215, (byte) 103, -1, var4, we.field_H, var6);
          va.field_s.a(var5 + var4, param0 ^ -27, 16777215, var6, -1, Integer.toString(1 + param1.b(-6133)));
          var6 += 20;
          if (!ed.field_q) {
            va.field_s.a(16777215, (byte) 103, -1, var4, w.field_B, var6);
            va.field_s.a(var5 + var4, param0 - 25, 16777215, var6, -1, Integer.toString(param1.field_h));
            var6 += 20;
            va.field_s.a(16777215, (byte) 74, -1, var4, sg.field_c, var6);
            va.field_s.a(var4 + var5, -32, 16777215, var6, -1, Integer.toString(param1.a(-89)));
            var6 += 20;
            va.field_s.a(16777215, (byte) 90, -1, var4, km.field_u, var6);
            va.field_s.a(var5 + var4, param0 ^ -53, 16777215, var6, -1, Vertigo2.a(new String[]{gl.a(-39, false, false, param1.field_q)}, tn.field_g, param0 + 22));
            var6 += 20;
          } else {
            va.field_s.a(16777215, (byte) 67, -1, var4, bs.field_Vb, var6);
            va.field_s.a(var5 + var4, param0 ^ -72, 16777215, var6, -1, Vertigo2.a(new String[]{gl.a(-37, false, false, param1.field_q)}, tn.field_g, -117));
            var6 += 20;
          }
          rq.a(-var7 + var6 + (va.field_s.field_c + va.field_s.field_j), 220, var7 - (va.field_s.field_j + va.field_s.field_c + var3_int), var4 - var3_int * 2, -110, 200);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "fo.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(byte param0) {
        int discarded$0 = 0;
        int var3;
        bl stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        boolean decompiledFrameRemainder0 = true;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (13 == this.field_b) {
          if ((de.field_f != 96 &&
            de.field_f != 97) &&
            (decompiledFrameRemainder0 = !(!qi.field_d.field_e))) {
            return;
          }
          if (decompiledFrameRemainder0) {
            stackIn_7_0 = qi.field_d;
            stackIn_8_1 = !(qi.field_d.field_e);
            stackIn_7_0.field_e = stackIn_8_1;
          }
        }
        if (param0 <= 105) {
          discarded$0 = this.a(-63, 122);
        }
        if (oj.field_Q[this.field_b]) {
          this.field_a.a(1, true);
          if (this.field_a.field_c > -1 &&
            !this.b(this.field_a.field_c, (byte) 58)) {
            if (this.field_a.d(-98)) {
              this.field_a.field_c = this.field_a.field_c + 1;
            } else {
              this.field_a.field_c = this.field_a.field_c - 2;
              if (!(this.field_a.field_c >= 0)) {
                this.field_a.field_c = -1 + this.field_a.field_b;
              }
            }
          }
        } else {
          this.field_a.d((byte) 37);
        }

    }

    private final boolean b(int param0, byte param1) {
        if (param1 < 46) {
          this.g((byte) -76);
        }
        if (7 == this.field_b) {
          if (param0 == 0 &&
            0 == jq.field_b) {
            return false;
          }
          if (1 == param0 &&
            jq.field_b == 4) {
            return false;
          }
        }
        if (this.field_b != 1) {
          return true;
        }
        if (param0 == 1 &&
          (null == ln.field_d || ln.field_d.field_D.field_r.field_f[0].h((byte) 117))) {
          return false;
        }
        return true;
    }

    private final void a(int param0) {
        if (param0 != 3767) {
          field_c = (cr) null;
        }
        ie.field_Hb.e(-(ie.field_Hb.field_y / 2) + 320, 240 - ie.field_Hb.field_t / 2);
    }

    private final void b(int param0) {
        va.field_s.a(vg.field_b, 16777215, -1, 320, 220 + (va.field_s.field_j + 120), 2);
        if (param0 < 106) {
          this.d((byte) 58);
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 < 25) {
          this.a(true, (byte) 118, false, -99);
        }
        for (var4 = 0; oj.field_O[this.field_b].length > var4; var4++) {
          var5 = this.a(var4, (byte) -80);
          if (this.b(var4, (byte) 54) &&
            this.b(var4, 121) <= param1 &&
            this.a(var4, 127) > param1 &&
            var5 <= param2 &&
            param2 < this.c(var4, (byte) -116) + var5) {
            return var4;
          }
        }
        return -1;
    }

    private final void c(int param0, boolean param1, int param2) {
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0;
        int stackIn_66_1;
        int stackIn_66_2;
        int stackIn_66_3;
        int stackIn_67_4 = 0;
        int stackIn_69_0;
        int stackIn_69_1;
        int stackIn_69_2;
        int stackIn_69_3;
        int stackIn_70_4 = 0;
        int var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        er[] var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        er var19;
        int var20;
        String var21;
        int var17Lifetime1;
        var20 = Vertigo2.field_L ? 1 : 0;
        if (!this.b(param0, (byte) 98)) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var4 = oj.field_O[this.field_b][param0];
        var21 = sl.field_q[var4];
        var5 = var21;
        var5 = var21;
        var5 = var21;
        if (var4 == 8) {
          if (ue.field_O != 0 &&
            am.field_n != 0) {
            if (ue.field_O == 21) {
              var5 = sl.field_q[34];
            } else {
              if (ue.field_O != 1 &&
                am.field_n != 1) {
                if (2 != ue.field_O &&
                  am.field_n != 2 &&
                  ue.field_O != 3 &&
                  am.field_n != 3 &&
                  4 != ue.field_O &&
                  am.field_n != 4 &&
                  22 != ue.field_O &&
                  22 != am.field_n) {
                  var5 = j.field_o;
                } else {
                  var5 = po.field_d;
                }
              } else {
                var5 = po.field_d;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var5 = sl.field_q[7];
          }
        } else {
          if (var4 == 30) {
            var5 = var21 + te.field_H[m.field_B];
          }
        }
        var6 = va.field_s.a(1, var5);
        var7 = this.b(param0, 26);
        var8 = this.a(param0, -55);
        var9 = this.a(param0, (byte) -80) + this.c(param0, (byte) -116) / 2;
        if (var4 == 20 ||
          21 == var4) {
          var6 = kd.field_x + 120;
        }
        var10 = -var6 + var8 + var7 >> 1;
        var11 = -var7 + var8;
        var12 = mn.field_o;
        if (param1) {
          var12 = ln.field_b;
        }
        if (!this.b(param0, (byte) 111) ||
          (14 == var4 &&
          nf.field_v == 0 ||
          var4 == 15 &&
          nf.field_v == 1 ||
          var4 == 16 &&
          nf.field_v == 2 ||
          var4 == 36 &&
          nf.field_v == 4 ||
          var4 == 17 &&
          vl.field_k == 0) ||
          18 == var4 &&
          vl.field_k == 1) {
          var12 = sq.field_a;
        }
        var13 = var12[2].field_y + var12[0].field_y;
        var14 = (-var13 + var11) / var12[param2].field_y;
        var13 = var13 + var14 * var12[1].field_y;
        var15 = -(var12[0].field_t / 2) + var9;
        var16 = (-var13 + var11) / 2 + var7;
        var12[0].e(var16, var15);
        var16 = var16 + var12[0].field_y;
        for (var17 = 0; var14 > var17; var17++) {
          var12[1].e(var16, var15);
          var16 = var16 + var12[1].field_y;
        }
        var12[2].e(var16, var15);
        if (param1 &&
          this.b(param0, (byte) 68)) {
          stackIn_58_0 = 15637810;
        } else {
          stackIn_58_0 = 16777215;
        }
        var17Lifetime1 = stackIn_58_0;
        va.field_s.a(var17Lifetime1, (byte) 112, -1, var10, var5, var9 + (-va.field_s.field_c - (va.field_s.field_g - var12[1].field_t)) / 2);
        if (var4 != 20 &&
          var4 != 21) {
          return;
        }
        var10 = var10 + kd.field_x;
        if (var4 == 20) {
          stackIn_64_0 = tg.field_e * 120 / 256;
        } else {
          stackIn_64_0 = 120 * nd.field_k / 128;
        }
        var18 = stackIn_64_0;
        stackIn_66_0 = var10;
        stackIn_66_1 = -5 + var9;
        stackIn_66_2 = var18;
        stackIn_66_3 = 10;
        if (param1) {
          stackIn_67_4 = 9053858;
        } else {
          stackIn_67_4 = 8947850;
        }
        bi.b(stackIn_66_0, stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_67_4);
        stackIn_69_0 = var10 + var18;
        stackIn_69_1 = -5 + var9;
        stackIn_69_2 = 120 - var18;
        stackIn_69_3 = 10;
        if (param1) {
          stackIn_70_4 = 8947850;
        } else {
          stackIn_70_4 = 16777215;
        }
        bi.b(stackIn_69_0, stackIn_69_1, stackIn_69_2, stackIn_69_3, stackIn_70_4);
        bi.d(var10, -5 + var9, 121, 10, 2, 1);
        var19 = or.field_b;
        if (param1) {
          var19 = cd.field_b;
        }
        var19.e(var10 + var18 - 2, -2 + (-(var19.field_t / 2) + var9));
        return;
    }

    private final void b(int param0, boolean param1, int param2) {
        if (param2 != 404) {
          return;
        }
        this.a(false, (byte) -95, param1, param0);
    }

    private final void e(int param0) {
        int var8 = 0;
        int var2;
        String var3;
        String var4;
        String[] var5_ref_String__;
        int var5;
        int var7;
        int var9;
        int var10;
        int var11;
        int[] var15;
        String var3Lifetime1;
        String var3Lifetime2;
        String var4Lifetime1;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (null == ue.field_J) {
          ue.field_J = on.a(1, 3, 10, (byte) 71, 2);
        }
        var2 = 2;
        var4 = gl.a(-120, false, true, 1500000);
        var3 = var4;
        var4Lifetime1 = var3;
        var3Lifetime1 = var4Lifetime1;
        jq.a(63, 332, 270, 274, 150);
        va.field_s.a(16777215, (byte) 76, -1, 348, ni.field_c, va.field_s.field_j + 280);
        va.field_s.a(580, -34, 16777215, va.field_s.field_j + 280, -1, mo.field_f);
        if (ue.field_J.field_s) {
          if (ue.field_J.field_x != null) {
            var3Lifetime2 = qe.field_V;
            var4Lifetime1 = var3Lifetime2;
            var4Lifetime1 = var3Lifetime2;
            var5_ref_String__ = ue.field_J.field_x[var2];
            var15 = ue.field_J.field_n[var2];
            var7 = tk.field_c.field_z + 280 + 40;
            for (var8 = 0; var8 < 5; var8++) {
              if (var5_ref_String__[var8] != null &&
                var5_ref_String__[var8].equals("")) {
                var9 = 16777215;
                var10 = -var15[var8];
                tk.field_c.a(1 + var8 + ". ", 360, var7, var9, -1);
                tk.field_c.b(var5_ref_String__[var8], 360, var7, var9, -1);
                tk.field_c.a(gl.a(-53, false, true, var10), 580, var7, var9, -1);
                var4Lifetime1 = "";
                var3Lifetime2 = "";
              }
              var7 += 18;
            }
          } else {
            var3Lifetime2 = sd.field_G;
          }
        } else {
          var3Lifetime2 = b.field_f;
        }
        var5 = 35 + (280 + tk.field_c.field_z);
        if (param0 != -14189) {
          return;
        }
        tk.field_c.b(var3Lifetime2, 350, var5, 16777215, -1);
        tk.field_c.a(var4Lifetime1, 590, var5, 16777215, -1);
    }

    private final int b(int param0, int param1) {
        if (param1 < 1) {
          field_e = (si) null;
        }
        if (!oj.field_Q[this.field_b]) {
          return oj.field_M[this.field_b];
        }
        if (-1 + this.field_a.field_b == param0 && (this.field_b == 7 ||
          this.field_b == 9 ||
          8 == this.field_b ||
          this.field_b == 5 ||
          6 == this.field_b ||
          this.field_b == 17 ||
          this.field_b == 18)) {
          return 20;
        }
        if (this.field_b == 13 &&
          param0 == 2) {
          return oj.field_H[this.field_b] + oj.field_M[this.field_b];
        }
        if ((this.field_b == 5 ||
          this.field_b == 6) &&
          (this.field_a.field_b == 2 &&
          param0 == 0)) {
          return -24 - va.field_s.a(1, sp.field_Q) / 2 + 320;
        }
        return param0 * oj.field_H[this.field_b] + oj.field_M[this.field_b];
    }

    private final void g(byte param0) {
        lj stackIn_6_0 = null;
        int stackIn_9_0 = 0;
        lj var2;
        int var3;
        String var4;
        String var5;
        int var6;
        lj var7;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (!am.field_b &&
          !ed.field_q) {
          return;
        }
        if (am.field_b) {
          stackIn_6_0 = ln.field_d.field_D;
        } else {
          stackIn_6_0 = oe.field_pb.field_D;
        }
        var7 = stackIn_6_0;
        var2 = var7;
        if (!am.field_b) {
          stackIn_9_0 = -1;
        } else {
          stackIn_9_0 = ln.field_d.field_B;
        }
        var3 = stackIn_9_0;
        if (0 == var3) {
          if (0 == var7.b((byte) 116)) {
            ea.field_d[2].e(-(ea.field_d[2].field_x / 2) + 320, 0);
          } else {
            if (var7.b((byte) 116) != 1) {
              ea.field_d[4].e(320 - ea.field_d[4].field_x / 2, 0);
            } else {
              ea.field_d[3].e(-(ea.field_d[3].field_x / 2) + 320, 0);
            }
          }
        } else {
          if (var3 != 1) {
            ea.field_d[6].e(-(ea.field_d[6].field_x / 2) + 320, 0);
            var4 = var7.field_w[0];
            var5 = var7.field_w[1];
            if (var7.b((byte) 106) == 0) {
              va.field_s.a(Vertigo2.a(new String[]{var4}, Vertigo2.field_D, param0 ^ -124), 16777215, -1, 320, 340, 2);
            } else {
              if (var7.b((byte) 115) == 1) {
                va.field_s.a(Vertigo2.a(new String[]{var5}, Vertigo2.field_D, 1), 16777215, -1, 320, 340, 2);
              } else {
                va.field_s.a(1, -1, Vertigo2.a(new String[]{var4, var5}, jp.field_u, param0 ^ -17), 80, 340, 40, 1, 560, 0, 16777215);
              }
            }
          } else {
            if (var7.b((byte) 114) == 1) {
              ea.field_d[2].e(-(ea.field_d[2].field_x / 2) + 320, 0);
            } else {
              if (var7.b((byte) 123) == 0) {
                ea.field_d[3].e(320 - ea.field_d[3].field_x / 2, 0);
              } else {
                ea.field_d[4].e(-(ea.field_d[4].field_x / 2) + 320, 0);
              }
            }
          }
        }
        this.a(var3, var7, param0 ^ 27767);
        if (param0 != 97) {
          field_e = (si) null;
        }
        va.field_s.a(Vertigo2.a(new String[]{Integer.toString(var7.field_f), Integer.toString(var7.field_g)}, hd.field_c, -127), 16777215, -1, 320, 140, param0 - 95);
        this.a((byte) 7, var7);
    }

    private final int a(boolean param0, int param1, byte param2, int param3) {
        int var9 = 0;
        int incrementValue$0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int stackIn_3_0 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        var5 = 84;
        var6 = 130;
        if (!param0) {
          stackIn_3_0 = ml.field_z;
        } else {
          stackIn_3_0 = jq.field_e;
        }
        var7 = stackIn_3_0;
        if (param2 <= 118) {
          return 107;
        }
        if (0 != (4096 & var7) ||
          on.a((byte) -69, 0)) {
          var5 -= 20;
        }
        var8 = 0;
        for (var9 = 0; var9 < hi.field_i.length; var9++) {
          if (0 != (var7 & 1 << var9) ||
            !param0 &&
            (var9 != 12 ||
            on.a((byte) -71, 0))) {
            if (param1 >= var5 &&
              param1 <= 32 + var5 &&
              var6 <= param3 &&
              var6 + 32 >= param3) {
              return var9;
            }
            incrementValue$0 = var8;
            var8++;
            if (incrementValue$0 == 12) {
              var5 = 84;
              var6 += 40;
            } else {
              var5 += 40;
            }
          }
        }
        return -1;
    }

    fo(int param0) {
        this.field_b = param0;
        this.field_a = new uj(oj.field_O[this.field_b].length);
    }

    private final void g(int param0) {
        int stackIn_3_0 = 0;
        s stackIn_15_0 = null;
        wn stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        int stackIn_22_5;
        String stackIn_23_6;
        String var2;
        int var3;
        s var4;
        int var5;
        String[] var6_ref_String__;
        int var6;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        String var13;
        int var14;
        int[] var18;
        int var10Lifetime1;
        String var13Lifetime1;
        String var13Lifetime2;
        var14 = Vertigo2.field_L ? 1 : 0;
        stackIn_3_0 = (nf.field_v != 4) ? 0 : 1;
        var3 = stackIn_3_0;
        if (var3 == 0) {
          if (as.field_e == null) {
            as.field_e = on.a(1, 3, 10, (byte) 109, 0);
          }
          if (var3 != 0 &&
            null == ue.field_J) {
            ue.field_J = on.a(1, 3, 10, (byte) 120, 2);
          }
        } else {
          if (null == ue.field_J) {
            ue.field_J = on.a(1, 3, 10, (byte) 120, 2);
          }
        }
        if (var3 == 0) {
          stackIn_15_0 = as.field_e;
        } else {
          stackIn_15_0 = ue.field_J;
        }
        var4 = stackIn_15_0;
        var5 = nf.field_v;
        if (var3 != 0) {
          var5 = 2;
        }
        L5: {
          if (!var4.field_s) {
            var2 = b.field_f;
          } else {
            if (null != var4.field_x) {
              va.field_s.a(16777215, (byte) 95, -1, 48, ni.field_c, 120 + va.field_s.field_j);
              stackIn_22_0 = va.field_s;
              stackIn_22_1 = 360;
              stackIn_22_2 = -19;
              stackIn_22_3 = 16777215;
              stackIn_22_4 = va.field_s.field_j + 120;
              stackIn_22_5 = -1;
              if (var3 != 0) {
                stackIn_23_6 = mo.field_f;
              } else {
                stackIn_23_6 = dl.field_a;
              }
              ((wn) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4, stackIn_22_5, stackIn_23_6);
              var2 = ej.field_b;
              var13 = var2;
              var13Lifetime1 = var2;
              var6_ref_String__ = var4.field_x[var5];
              var18 = var4.field_n[var5];
              var8 = 50 + (tk.field_c.field_z + 110);
              var9 = iq.a(var5, var4, -1, uh.field_Xb);
              for (var10 = 0; 10 > var10; var10++) {
                if (var6_ref_String__[var10] != null) {
                  var11 = 16777215;
                  if (var10 == var9) {
                    var11 = 15637810;
                  }
                  var12 = var18[var10];
                  tk.field_c.a(var10 + 1 + ". ", 60, var8, var11, -1);
                  tk.field_c.b(var6_ref_String__[var10], 60, var8, var11, -1);
                  var13Lifetime2 = Integer.toString(var12);
                  if (var3 != 0) {
                    var13Lifetime2 = gl.a(-127, false, true, -var12);
                  }
                  tk.field_c.a(var13Lifetime2, 360, var8, var11, -1);
                  var2 = "";
                }
                var8 += 23;
              }
              if (((uh.field_Xb != null)) &&
                (!(0 <= var9)) &&
                ((var3 == 0))) {
                var8 += 4;
                var10Lifetime1 = uh.field_Xb.field_o[0];
                tk.field_c.b(qe.field_V, 60, var8, 15637810, -1);
                tk.field_c.a(Integer.toString(var10Lifetime1), 360, var8, 15637810, -1);
              }
              break L5;
            }
            var2 = sd.field_G;
          }
        }
        var6 = va.field_s.field_j + 225;
        va.field_s.a(var2, 16777215, -1, 210, var6, param0);
    }

    private final int a(int param0, byte param1) {
        if (param1 != -80) {
          this.d(-72);
        }
        if (!oj.field_Q[this.field_b]) {
          if (this.field_a.field_b - 1 == param0) {
            if (this.field_b == 7 ||
              this.field_b == 8 ||
              6 == this.field_b ||
              this.field_b == 17 ||
              this.field_b == 18 ||
              this.field_b == 21) {
              return 430;
            }
            if (5 == this.field_b) {
              return 380;
            }
          }
          return oj.field_F[this.field_b] + param0 * oj.field_H[this.field_b];
        }
        if (13 == this.field_b &&
          param0 == 2) {
          return oj.field_F[this.field_b] - 38;
        }
        return oj.field_F[this.field_b];
    }

    private final int c(int param0, byte param1) {
        if (param1 != -116) {
          this.field_b = -4;
        }
        return 30;
    }

    private final void a(boolean param0, byte param1, boolean param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_81_0 = 0;
        tr stackIn_201_0 = null;
        int var5;
        int var6;
        int var7;
        int var8;
        String var8_ref_String;
        tr var8_ref_tr;
        int var9;
        String var9_ref_String;
        int var10;
        int var11;
        String var12;
        tr var13;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime1Lifetime1;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (param1 > -56) {
          this.field_b = 20;
        }
        var5 = oj.field_O[this.field_b][param3];
        if (var5 != 21 &&
          var5 != 20 &&
          this.field_a.a(84)) {
          e.a(on.field_b[0][0], false);
        }
        if (qi.field_d.field_t >= 0) {
          stackIn_11_0 = qi.field_d.field_t;
        } else {
          stackIn_11_0 = 0;
        }
        L3: {
          var6 = stackIn_11_0;
          var8 = var5;
          if (0 != var8) {
            L4: {
              if (var8 == 28) {
                if (this.field_a.a(84)) {
                  var8 = param2 ? 1 : 0;
                  gj.a((byte) 79, var8 != 0, am.field_n, -3);
                }
              } else {
                if (35 == var8) {
                  if (!(!this.field_a.a(84))) {
                    var8 = param2 ? 1 : 0;
                    gj.a((byte) -60, var8 != 0, am.field_n, -7);
                  }
                  break L3;
                }
                if (32 == var8) {
                  if (!(!this.field_a.a(84))) {
                    if (ag.b(49)) {
                      id.a(23);
                    } else {
                      jm.field_E = new wo[1];
                      jm.field_E[0] = new wo(0, false, 0, false, false, false);
                      lq.field_b = new bh(3, jm.field_E, false, false);
                      if (ap.field_d.field_t < 0) {
                        stackIn_81_0 = 0;
                      } else {
                        stackIn_81_0 = ap.field_d.field_t;
                      }
                      var8 = stackIn_81_0;
                      lq.field_b.a((byte) 63, var8, kn.field_h[0][var8]);
                      if (!qe.field_V.equals("")) {
                        var9_ref_String = qe.field_V;
                      } else {
                        var9_ref_String = ed.field_o;
                      }
                      tf.field_l = new am(0, 1, new String[]{var9_ref_String});
                      mh.field_a = false;
                      var10 = param2 ? 1 : 0;
                      gj.a((byte) 55, var10 != 0, am.field_n, 19);
                    }
                  }
                  break L3;
                }
                if (33 == var8) {
                  if (!(!this.field_a.a(84))) {
                    var8 = param2 ? 1 : 0;
                    gj.a((byte) -51, var8 != 0, am.field_n, -6);
                  }
                  break L3;
                }
                if (var8 == 34) {
                  if (!(!this.field_a.a(84))) {
                    if (!ag.b(49)) {
                      var8 = param2 ? 1 : 0;
                      gj.a((byte) 124, var8 != 0, am.field_n, 21);
                    } else {
                      jm.field_E = new wo[1];
                      jm.field_E[0] = new wo(0, false, 0, false, false, false);
                      lb.field_d = new bh(0, jm.field_E, false, false);
                      lb.field_d.a((byte) -51, var6, kn.field_h[0][var6]);
                      if (null == qe.field_V) {
                        var8_ref_String = ed.field_o;
                      } else {
                        var8_ref_String = qe.field_V;
                      }
                      tf.field_l = new am(0, 1, new String[]{var8_ref_String});
                      var9 = param2 ? 1 : 0;
                      gj.a((byte) -87, var9 != 0, am.field_n, 13);
                    }
                  }
                  break L3;
                }
                if (var8 == 1) {
                  if (!(!this.field_a.a(84))) {
                    if (ag.b(49)) {
                      var8 = 0;
                      rq.a(true, (byte) 127, var8, param2, ke.field_g);
                    } else {
                      var8 = param2 ? 1 : 0;
                      gj.a((byte) 70, var8 != 0, am.field_n, -4);
                    }
                  }
                  break L3;
                }
                if (var8 == 2) {
                  if (!(!this.field_a.a(84))) {
                    var8 = param2 ? 1 : 0;
                    gj.a((byte) -90, var8 != 0, am.field_n, -1);
                  }
                  break L3;
                }
                if (7 == var8) {
                  if (!(!this.field_a.a(84))) {
                    if (this.field_b == 11) {
                      il.field_a = false;
                      an.field_c = true;
                      lc.field_d = false;
                    }
                    var8 = param2 ? 1 : 0;
                    gj.a((byte) -74, var8 != 0, am.field_n, 0);
                  }
                  break L3;
                }
                if (var8 == 24) {
                  if (this.field_a.a(84)) {
                    var8 = param2 ? 1 : 0;
                    gj.a((byte) 114, var8 != 0, am.field_n, 0);
                    qh.field_f = true;
                  }
                } else {
                  if (var8 != 22) {
                    if (5 == var8) {
                      if (!(!this.field_a.a(84))) {
                        jq.field_b = 0;
                        var8 = param2 ? 1 : 0;
                        gj.a((byte) 33, var8 != 0, am.field_n, 7);
                      }
                      break L3;
                    }
                    if (var8 == 8) {
                      if (this.field_a.a(84)) {
                        var8 = ue.field_O;
                        var9Lifetime1 = param2 ? 1 : 0;
                        gj.a((byte) 46, var9Lifetime1 != 0, am.field_n, var8);
                      }
                    } else {
                      if (var8 == 4) {
                        if (!(!this.field_a.a(84))) {
                          var8 = param2 ? 1 : 0;
                          gj.a((byte) -90, var8 != 0, am.field_n, 6);
                        }
                        break L3;
                      }
                      if (var8 == 3) {
                        if (!(!this.field_a.a(84))) {
                          if (9 != this.field_b) {
                            var8 = param2 ? 1 : 0;
                            gj.a((byte) -127, var8 != 0, am.field_n, 5);
                          } else {
                            var8 = param2 ? 1 : 0;
                            gj.a((byte) 92, var8 != 0, am.field_n, 5);
                          }
                        }
                        break L3;
                      }
                      if (var8 == 20) {
                        var7 = 0;
                        if (this.field_a.a((byte) 45) &&
                          0 < tg.field_e) {
                          var7 = 1;
                          pk.b(106, 0);
                        }
                        if (this.field_a.c(0) &&
                          tg.field_e < 256) {
                          var7 = 1;
                          pk.b(31, 256);
                        }
                        if (this.field_a.b((byte) 85)) {
                          var8 = this.b(param3, 26) - (-this.a(param3, 127) - kd.field_x) - 120 >> 1;
                          var9Lifetime1 = ed.field_n - var8;
                          var10Lifetime1 = var9Lifetime1 * 256 / 120;
                          var7 = 1;
                          if (var10Lifetime1 > 0) {
                            if (256 <= var10Lifetime1) {
                              pk.b(-79, 256);
                            } else {
                              pk.b(-73, var10Lifetime1);
                            }
                          } else {
                            pk.b(103, 0);
                          }
                        }
                        if (this.field_a.b(-101) &&
                          0 < tg.field_e) {
                          var7 = 1;
                          dk.d((byte) -94);
                        }
                        if (this.field_a.d(-98) &&
                          tg.field_e < 256) {
                          var7 = 1;
                          ti.b(10);
                        }
                        if ((var7 != 0)) {
                          if (this.field_a.b((byte) 85) &&
                            rg.field_f <= dc.field_O) {
                            break L4;
                          }
                          e.a(on.field_b[0][0], false);
                          dc.field_O = rg.field_f + 20;
                        }
                        break L3;
                      }
                      if (var8 == 21) {
                        if (this.field_a.a((byte) 45)) {
                          hj.a(0, (byte) 126);
                        }
                        if (this.field_a.c(0)) {
                          hj.a(128, (byte) 124);
                        }
                        if (this.field_a.b((byte) 85)) {
                          var8 = -120 + (this.b(param3, 49) + this.a(param3, 127)) + kd.field_x >> 1;
                          var9Lifetime1 = -var8 + ed.field_n;
                          var10Lifetime1Lifetime1 = var9Lifetime1 * 128 / 120;
                          if (0 >= var10Lifetime1Lifetime1) {
                            hj.a(0, (byte) 122);
                          } else {
                            if (var10Lifetime1Lifetime1 < 128) {
                              hj.a(var10Lifetime1Lifetime1, (byte) 122);
                            } else {
                              hj.a(128, (byte) 123);
                            }
                          }
                        }
                        if (this.field_a.b(-90)) {
                          hj.a(nd.field_k - 16, (byte) 125);
                        }
                        if (this.field_a.d(-98)) {
                          hj.a(nd.field_k + 16, (byte) 122);
                        }
                        if (nd.field_k >= 128) {
                          hj.a(128, (byte) 126);
                        }
                        if (!(nd.field_k > 0)) {
                          hj.a(0, (byte) 122);
                        }
                        break L3;
                      }
                      if (6 == var8) {
                        if (!(!this.field_a.a(84))) {
                          if (dc.field_L != null) {
                            cp.a((byte) 125);
                          } else {
                            ig.a(9790, param2);
                          }
                        }
                        break L3;
                      }
                      if (var8 == 30) {
                        if (!(!this.field_a.a(84))) {
                          var8 = m.field_B;
                          var8++;
                          if (te.field_H.length <= var8) {
                            var8 = 0;
                          }
                          mi.k(-32460, var8);
                        }
                        break L3;
                      }
                      if (var8 != 9) {
                        if (var8 == 10) {
                          if (!(!this.field_a.a(84))) {
                            ln.field_d.a(-101);
                            var8 = param2 ? 1 : 0;
                            gj.a((byte) 94, var8 != 0, am.field_n, -1);
                          }
                          break L3;
                        }
                        if (var8 != 11) {
                          if (12 != var8) {
                            if (27 == var8) {
                              if (this.field_a.a(84) ||
                                param0) {
                                if (null == ln.field_d) {
                                  stackIn_201_0 = oe.field_pb;
                                } else {
                                  stackIn_201_0 = ln.field_d;
                                }
                                var13 = stackIn_201_0;
                                var8_ref_tr = var13;
                                if (var13.field_D.field_j == 0) {
                                  var13.a(2, param2);
                                  an.field_c = true;
                                  lc.field_d = false;
                                  break L3;
                                }
                                if (var13.field_D.field_j == 3) {
                                  mh.field_a = false;
                                  var13.a(2, param2);
                                  lc.field_d = false;
                                  an.field_c = true;
                                  var9Lifetime1 = param2 ? 1 : 0;
                                  gj.a((byte) -124, var9Lifetime1 != 0, am.field_n, 19);
                                }
                              }
                            } else {
                              if (13 != var8) {
                                if (var8 == 14) {
                                  if (!this.field_a.a(84)) {
                                    break L4;
                                  }
                                  nf.field_v = 0;
                                  break L3;
                                }
                                if (var8 == 15) {
                                  if (!this.field_a.a(84)) {
                                    break L4;
                                  }
                                  nf.field_v = 1;
                                  break L3;
                                }
                                if (var8 == 16) {
                                  if (!this.field_a.a(84)) {
                                    break L4;
                                  }
                                  nf.field_v = 2;
                                  break L3;
                                }
                                if (var8 == 36) {
                                  if (!this.field_a.a(84)) {
                                    break L4;
                                  }
                                  nf.field_v = 4;
                                  break L3;
                                }
                                if (var8 == 17) {
                                  if (!(!this.field_a.a(84))) {
                                    vl.field_k = 0;
                                  }
                                  break L3;
                                }
                                if (var8 == 18) {
                                  if (!this.field_a.a(84)) {
                                    break L4;
                                  }
                                  vl.field_k = 1;
                                  break L3;
                                }
                                if (var8 == 23) {
                                  if (!(!this.field_a.a(84))) {
                                    if (this.field_b == 10) {
                                      var12 = (String) null;
                                      ip.a((byte) -91, (String) null, 9);
                                    } else {
                                      if (this.field_b != 8 &&
                                        5 != this.field_b &&
                                        this.field_b != 6 &&
                                        this.field_b != 13 &&
                                        this.field_b != 19) {
                                        break L4;
                                      }
                                      ip.a((byte) -99, oc.field_x, this.field_b);
                                    }
                                  }
                                  break L3;
                                }
                                if (var8 == 25) {
                                  if (!this.field_a.a(84)) {
                                    break L4;
                                  }
                                  if (!this.b(param3, (byte) 72)) {
                                    break L4;
                                  }
                                  jq.field_b = jq.field_b - 1;
                                  break L3;
                                }
                                if (var8 == 26) {
                                  if (!this.field_a.a(84)) {
                                    break L4;
                                  }
                                  if (!this.b(param3, (byte) 111)) {
                                    break L4;
                                  }
                                  jq.field_b = jq.field_b + 1;
                                  break L3;
                                }
                                if (var8 == 19) {
                                  if (!(!this.field_a.a(84))) {
                                    sf.a(ob.e((byte) -95), -115);
                                  }
                                  break L3;
                                }
                                if (var8 == 29) {
                                  if (!(!this.field_a.a(84))) {
                                    var8 = param2 ? 1 : 0;
                                    gj.a((byte) 54, var8 != 0, am.field_n, 17);
                                  }
                                  break L3;
                                }
                                if (var8 != 31) {
                                  break L3;
                                }
                                if (!this.field_a.a(84)) {
                                  break L3;
                                }
                                var8 = param2 ? 1 : 0;
                                gj.a((byte) -98, var8 != 0, am.field_n, 18);
                                break L4;
                              }
                            }
                            if ((this.field_a.a(84) ||
                              param0)) {
                              if (am.field_b) {
                                var8 = param2 ? 1 : 0;
                                gj.a((byte) 92, var8 != 0, am.field_n, -5);
                              }
                              if (!(!ed.field_q)) {
                                bs.a(11, (byte) -47, 0);
                              }
                            }
                            break L3;
                          }
                          if (this.field_a.a(84)) {
                            ln.field_d.b(-27588);
                            var8 = param2 ? 1 : 0;
                            gj.a((byte) -57, var8 != 0, am.field_n, -1);
                          }
                        } else {
                          if (this.field_a.a(84)) {
                            ln.field_d.b(true);
                            var8 = param2 ? 1 : 0;
                            gj.a((byte) -84, var8 != 0, am.field_n, -1);
                          }
                        }
                      } else {
                        if (this.field_a.a(84)) {
                          ln.field_d.a(2, param2);
                          an.field_c = true;
                          lc.field_d = false;
                        }
                      }
                    }
                  } else {
                    if (this.field_a.a(84)) {
                      var8 = param2 ? 1 : 0;
                      gj.a((byte) -84, var8 != 0, am.field_n, 8);
                    }
                  }
                }
              }
            }
          } else {
            if (this.field_a.a(84)) {
              jm.field_E = new wo[1];
              jm.field_E[0] = new wo(0, false, 0, false, false, false);
              lb.field_d = new bh(0, jm.field_E, false, false);
              lb.field_d.a((byte) 91, var6, kn.field_h[0][var6]);
              tf.field_l = new am(0, 1, new String[]{qe.field_V});
              var8 = param2 ? 1 : 0;
              gj.a((byte) 74, var8 != 0, am.field_n, 13);
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (param0 > -78) {
          this.c(67, true, -90);
        }
        if (0 < this.field_a.field_c) {
          param2 = this.field_a.field_c;
        }
        this.field_a.a(param1, this.a(110, ed.field_n, gb.field_d), param2, (byte) 80);
        qc.field_t = -1;
        dc.field_O = rg.field_f;
        oa.field_q = -1;
    }

    final void b(byte param0) {
        int discarded$0 = 0;
        wn stackIn_32_0 = null;
        boolean stackIn_32_1 = false;
        boolean stackIn_33_2 = false;
        wn stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        boolean stackIn_36_2 = false;
        wn stackIn_38_0 = null;
        boolean stackIn_39_1 = false;
        int stackIn_70_1 = 0;
        boolean stackIn_71_2 = false;
        Object stackIn_74_0;
        int stackIn_74_1;
        int stackIn_74_2;
        int stackIn_74_3;
        int var2;
        er var2_ref_er;
        int var3;
        er var4;
        L0: {
          var3 = Vertigo2.field_L ? 1 : 0;
          if (this.field_b == 0) {
            uq.field_a.e(-70, 480 - (uq.field_a.field_t + 20));
            eq.field_F.e(50, 10);
            rq.a(this.a(this.field_a.field_b - 1, (byte) -80) + (this.c(-1 + this.field_a.field_b, (byte) -116) - (this.a(0, (byte) -80) - 2 * li.field_f)), this.a(0, -99) + (-this.b(0, 24) + 2 * li.field_f), this.a(0, (byte) -80) - li.field_f, this.b(0, param0 ^ -17) - li.field_f, -101, 150);
          } else {
            if (this.field_b != 17 &&
              this.field_b != 18 &&
              this.field_b != 21) {
              if (1 != this.field_b &&
                this.field_b != 2 &&
                this.field_b != 22 &&
                this.field_b != 3 &&
                this.field_b != 4) {
                if (13 == this.field_b) {
                  if (tf.field_l != null &&
                    lb.field_d != null) {
                    oo.a(450, 240);
                    tf.field_l.a(0, param0 + 223, lb.field_d);
                  }
                  oo.b();
                  rq.a(320, 280, 100, 30, 86, 150);
                  qi.field_d.b(param0 + 116);
                } else {
                  if (19 == this.field_b) {
                    if (null != tf.field_l &&
                      null != lq.field_b) {
                      oo.a(545, 160);
                      tf.field_l.a(false, 0, lq.field_b, (byte) 119);
                    }
                    oo.b();
                    rq.a(320, 280, 100, 30, 75, 150);
                    ap.field_d.b(2);
                    rq.a(160, 148, 100, 330, 91, 150);
                    if (ig.field_c != null) {
                      var2 = ig.field_c[ap.field_d.field_t];
                      if (null != ig.field_c &&
                        ap.field_d.field_t >= 0 &&
                        ap.field_d.field_t < 50) {
                        tk.field_c.c(Vertigo2.a(new String[]{gl.a(-49, true, false, var2)}, wq.field_L, ~param0), 404, 125, 16777215, -1);
                      }
                      il.field_c.a(350, 140, 28, 26);
                      tk.field_c.b(gl.a(-42, false, false, te.field_B[ap.field_d.field_t]), 390, 160, 16777215, -1);
                      kq.field_Kb.a(350, 175, 28, 26);
                      tk.field_c.b(gl.a(param0 + 1, false, false, sf.field_e[ap.field_d.field_t]), 390, 195, 16777215, -1);
                      hh.field_a.a(350, 210, 28, 26);
                      tk.field_c.b(gl.a(-88, false, false, bp.field_E[ap.field_d.field_t]), 390, 230, 16777215, -1);
                    }
                    this.e(-14189);
                  } else {
                    if (10 != this.field_b) {
                      if (this.field_b == 5) {
                        this.d(11059);
                      } else {
                        if (this.field_b == 7) {
                          rc.a(-32163);
                        } else {
                          if (this.field_b == 8) {
                            this.a(-1, false);
                          } else {
                            if (this.field_b == 9) {
                              this.a(-1, true);
                            } else {
                              if (this.field_b == 14) {
                                this.a(3767);
                              } else {
                                if (this.field_b == 20) {
                                  this.a((byte) 122);
                                } else {
                                  if (this.field_b == 15) {
                                    this.f(380);
                                  } else {
                                    if (this.field_b == 16) {
                                      this.g((byte) 97);
                                    } else {
                                      if (this.field_b == 6) {
                                        this.a(true);
                                      } else {
                                        if ((11 == this.field_b)) {
                                          va.field_s.a(1, -1, ke.field_i, 480, 0, 100, 1, 440, 1, 16777215);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var2 = this.a(0, (byte) -80) - 95;
                      rq.a(280, 490, var2, 75, param0 ^ -10, 150);
                      var2 += 40;
                      va.field_s.a(jl.field_f, 16777215, -1, 320, var2, 2);
                      var2 += 40;
                      stackIn_32_0 = va.field_s;
                      stackIn_32_1 = true;
                      stackIn_33_2 = (jq.field_e != 0);
                      ((wn) (Object) stackIn_32_0).a(eb.a(stackIn_32_1, stackIn_33_2, 6337, true), 16777215, -1, 320, var2, 2);
                      var2 += 100;
                      stackIn_35_0 = va.field_s;
                      stackIn_35_1 = 116;
                      stackIn_36_2 = (0 != jq.field_e);
                      ((wn) (Object) stackIn_35_0).a(vi.$cfr$intArgs$a$c7de0d339b2a(stackIn_35_1, stackIn_36_2, true, true), 16777215, -1, 320, var2, 2);
                      var2 += 80;
                      stackIn_38_0 = va.field_s;
                      stackIn_39_1 = (jq.field_e != 0);
                      ((wn) (Object) stackIn_38_0).a(id.a(stackIn_39_1, 1342181375, true, true), 16777215, -1, 320, var2, 2);
                    }
                  }
                }
              } else {
                rq.a(this.a(-1 + this.field_a.field_b, (byte) -80) + this.c(this.field_a.field_b - 1, (byte) -116) - this.a(0, (byte) -80) + li.field_f * 2, this.a(0, 127) - this.b(0, 89) + 2 * li.field_f, this.a(0, (byte) -80) - li.field_f, this.b(0, 25) - li.field_f, -72, 150);
              }
              break L0;
            }
            rq.a(this.a(-2 + this.field_a.field_b, (byte) -80) - (-this.c(this.field_a.field_b - 2, (byte) -116) + this.a(0, (byte) -80)) + 2 * li.field_f, this.a(0, param0 + 239) - this.b(0, 119) + 2 * li.field_f, this.a(0, (byte) -80) - li.field_f, this.b(0, 17) - li.field_f, param0 + 51, 150);
          }
        }
        if (0 <= this.field_b &&
          th.field_f[this.field_b] != null) {
          var4 = th.field_f[this.field_b];
          var2_ref_er = var4;
          var2_ref_er.e(-(var4.field_y / 2) + 320, 50 - var4.field_t / 2);
        }
        for (var2 = 0; var2 < this.field_a.field_b; var2++) {
          stackIn_70_1 = var2;
          stackIn_71_2 = (~var2 == ~this.field_a.field_c);
          this.c(stackIn_70_1, stackIn_71_2, 1);
        }
        va.field_s.b(param0 ^ 72);
        if (param0 != -114) {
          stackIn_74_0 = this;
          stackIn_74_1 = 98;
          stackIn_74_2 = -113;
          stackIn_74_3 = 89;
          discarded$0 = this.a(stackIn_74_1, stackIn_74_2, stackIn_74_3);
        }
    }

    public static void f(byte param0) {
        field_f = null;
        field_e = null;
        int var1 = -61 / ((62 - param0) / 47);
        field_c = null;
    }

    private final void a(boolean param0) {
        int var8 = 0;
        int var2;
        int var3;
        String var4;
        String[] var5;
        int[] var6;
        int var7;
        int var9;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime1Lifetime1;
        var9 = Vertigo2.field_L ? 1 : 0;
        jq.a(78, 20, 100, 600, 320);
        if (ag.b(49)) {
          this.b(126);
          return;
        }
        if (wh.field_D == null) {
          wh.field_D = mb.a(0, 10, (byte) -89, 7);
        }
        var2 = 120 + va.field_s.field_j;
        if (!param0) {
          this.f(1);
        }
        L2: {
          var3 = 16777215;
          va.field_s.a(var3, (byte) 123, -1, 48, ni.field_c, var2 - 10);
          va.field_s.a(ej.field_e, var3, -1, pn.field_K[0], var2 - 10, 2);
          va.field_s.a(jl.field_h, var3, -1, pn.field_K[1], var2 - 10, 2);
          va.field_s.a(oq.field_D, var3, -1, pn.field_K[2], var2 - 10, 2);
          va.field_s.a(to.field_b, var3, -1, pn.field_K[3], -10 + var2, 2);
          va.field_s.a(sc.field_a, var3, -1, pn.field_K[4], -10 + var2, 2);
          var2 = 150 + tk.field_c.field_z;
          if (!wh.field_D.field_v) {
            var4 = b.field_f;
          } else {
            if (wh.field_D.field_t != null) {
              var4 = sq.field_d;
              var5 = wh.field_D.field_t[vl.field_k];
              var6 = wh.field_D.field_q[vl.field_k];
              var7 = 0;
              for (var8 = 0; var8 < 10; var8++) {
                if (null != var5[var8]) {
                  var3Lifetime1 = 16777215;
                  if (wc.a(var5[var8], param0)) {
                    var7 = 1;
                    var3Lifetime1 = 15637810;
                  }
                  this.a(var6[var8 * 4 + 2], var2, var6[4 * var8 + 3], (byte) 28, var6[var8 * 4], var8, var5[var8], var3Lifetime1, var6[var8 * 4 + 1]);
                  var4 = "";
                }
                var2 += 20;
              }
              if ((var7 == 0)) {
                var3Lifetime1Lifetime1 = 16777215;
                this.a(wh.field_D.field_u, var2, wh.field_D.field_p, (byte) 30, wh.field_D.field_y, -1, qe.field_V, var3Lifetime1Lifetime1, wh.field_D.field_s);
              }
              break L2;
            }
            var4 = sd.field_G;
          }
        }
        var2Lifetime1 = va.field_s.field_j + 365;
        va.field_s.a(var4, 16777215, -1, 335, var2Lifetime1, 2);
        return;
    }

    static {
    }
}
