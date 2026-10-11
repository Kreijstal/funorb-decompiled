/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends sh {
    static String field_N;
    private tk[][] field_D;
    private fd field_G;
    int[] field_q;
    private int[] field_L;
    private int[] field_y;
    private int field_W;
    static char[] field_m;
    private int[] field_I;
    private int[] field_x;
    static boolean[] field_H;
    private int[] field_R;
    private int[] field_K;
    int[] field_p;
    private int[] field_T;
    private tk[][] field_A;
    private hc field_S;
    static int field_M;
    private int[] field_o;
    private int[] field_z;
    int[] field_n;
    static String field_v;
    static int field_V;
    private int[] field_t;
    private int[] field_r;
    private int[] field_P;
    private int[] field_J;
    private int field_w;
    private gl field_O;
    private boolean field_B;
    private int field_U;
    private long field_C;
    private int field_u;
    private long field_E;
    private wk field_Q;
    private int field_F;
    private boolean field_s;

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var6 = fleas.field_A ? 1 : 0;
        if (this.field_G.c()) {
          var2 = this.field_w * this.field_G.field_a / la.field_a;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.field_C;
            if (this.field_E - var3 >= 0L) {
              this.field_C = var3;
            } else {
              var5 = (int)((-1L + ((long)var2 + this.field_E - this.field_C)) / (long)var2);
              this.field_C = this.field_C + (long)var2 * (long)var5;
              param0 = param0 - var5;
              this.field_O.a(var5);
              this.g(1);
              if (this.field_G.c()) {
                continue;
              }
            }
            break;
          }
          this.field_O.a(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_O.a(param0);
        }

    }

    private final int b(int param0, tk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 32) {
            var4 = (int[]) null;
            this.b((int[]) null, -128, 50);
          }
          var3_int = this.field_t[param1.field_o];
          if (var3_int < 8192) {
            stackIn_6_0 = 32 + var3_int * param1.field_l >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = 16384 - (32 + (16384 - var3_int) * (128 - param1.field_l) >> 6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ei.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized void b(int param0, int param1) {
        int var3 = 23 / ((-52 - param0) / 32);
        this.field_W = param1;
    }

    final synchronized void e(int param0) {
        this.a(param0 + 487, true);
        if (param0 != -398) {
          this.field_u = -75;
        }
    }

    final synchronized sh c() {
        return null;
    }

    final synchronized boolean d(int param0) {
        if (param0 != 31499) {
          int[] var3 = (int[]) null;
          this.b((int[]) null, -50, -87);
        }
        return this.field_G.c();
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          var3_int = 0;
          var4 = 78 / ((param0 + 2) / 63);
          var5 = param1.length();
          for (var6 = 0; var5 > var6; var6++) {
            if (param1.charAt(var6) == param2) {
              var3_int++;
            }
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ei.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, tk param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          var4_int = param1.field_z.field_l.length;
          if (param0 != -32730) {
            this.a(8, -23, -13, true);
          }
          if (param2 &&
            param1.field_z.field_n) {
            var6 = -param1.field_z.field_m + var4_int + var4_int;
            var4_int = var4_int << 8;
            var5 = (int)((long)var6 * (long)this.field_n[param1.field_o] >> 6);
            if (var5 >= var4_int) {
              var5 = var4_int + (var4_int - (1 + var5));
              param1.field_k.b(true);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_n[param1.field_o] >> 6);
          }
          param1.field_k.e(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ei.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != -16257) {
          this.field_R = (int[]) null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        if (param1 != -24344) {
          return;
        }
        this.field_y[param2] = param0;
        this.field_p[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param0 * 0.00054931640625));
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param2 != 238) {
          field_H = (boolean[]) null;
        }
        this.a(param0, (byte) -119, param1);
    }

    final synchronized sh d() {
        return (sh) ((Object) this.field_O);
    }

    private final void f(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = fleas.field_A ? 1 : 0;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = param1 & 15;
          var5 = 127 & param1 >> 8;
          var6 = 127 & param1 >> 16;
          this.b(param0 + 36, var5, var6, var4);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = (32699 & param1) >> 8;
          var6Lifetime1 = (8387488 & param1) >> 16;
          if (var6Lifetime1 <= 0) {
            this.b(param0 ^ 0, var5Lifetime1, 64, var4Lifetime1);
            return;
          }
          this.a(var5Lifetime1, var4Lifetime1, var6Lifetime1, false);
        } else {
          if (var3 == 160) {
            var4Lifetime1 = 15 & param1;
            var5Lifetime1 = (param1 & 32647) >> 8;
            var6Lifetime1 = param1 >> 16 & 127;
            this.a(-16257, var4Lifetime1, var5Lifetime1, var6Lifetime1);
            return;
          }
          if (var3 != 176) {
            if (var3 == 192) {
              var4Lifetime1 = param1 & 15;
              var5Lifetime1 = param1 >> 8 & 127;
              this.e(-126, this.field_L[var4Lifetime1] + var5Lifetime1, var4Lifetime1);
              return;
            }
            if (param0 != -128) {
              return;
            }
            if (var3 == 208) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = (32598 & param1) >> 8;
              this.a(param0 ^ -16512, var5Lifetime1, var4Lifetime1);
              return;
            }
            if (224 == var3) {
              var4Lifetime1 = param1 & 15;
              var5Lifetime1 = (param1 >> 8 & 127) + (16256 & param1 >> 9);
              this.c(var5Lifetime1, var4Lifetime1, 128);
              return;
            }
            var3 = 255 & param1;
            if (var3 != 255) {
              return;
            }
            this.b(-1, true);
            return;
          }
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = (32617 & param1) >> 8;
          var6Lifetime1 = 127 & param1 >> 16;
          if (var5Lifetime1 == 0) {
            this.field_L[var4Lifetime1] = (var6Lifetime1 << 14) + sc.a(-2080769, this.field_L[var4Lifetime1]);
          }
          if (var5Lifetime1 == 32) {
            this.field_L[var4Lifetime1] = sc.a(-16257, this.field_L[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 1) {
            this.field_x[var4Lifetime1] = (var6Lifetime1 << 7) + sc.a(-16257, this.field_x[var4Lifetime1]);
          }
          if (33 == var5Lifetime1) {
            this.field_x[var4Lifetime1] = sc.a(-128, this.field_x[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 5) {
            this.field_z[var4Lifetime1] = (var6Lifetime1 << 7) + sc.a(this.field_z[var4Lifetime1], -16257);
          }
          if (var5Lifetime1 == 37) {
            this.field_z[var4Lifetime1] = var6Lifetime1 + sc.a(-128, this.field_z[var4Lifetime1]);
          }
          if (var5Lifetime1 == 7) {
            this.field_o[var4Lifetime1] = sc.a(-16257, this.field_o[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (39 == var5Lifetime1) {
            this.field_o[var4Lifetime1] = sc.a(this.field_o[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (10 == var5Lifetime1) {
            this.field_t[var4Lifetime1] = (var6Lifetime1 << 7) + sc.a(-16257, this.field_t[var4Lifetime1]);
          }
          if (42 == var5Lifetime1) {
            this.field_t[var4Lifetime1] = sc.a(this.field_t[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (var5Lifetime1 == 11) {
            this.field_J[var4Lifetime1] = sc.a(-16257, this.field_J[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 43) {
            this.field_J[var4Lifetime1] = var6Lifetime1 + sc.a(this.field_J[var4Lifetime1], -128);
          }
          if (var5Lifetime1 == 64) {
            if (var6Lifetime1 >= 64) {
              this.field_q[var4Lifetime1] = ne.a(this.field_q[var4Lifetime1], 1);
            } else {
              this.field_q[var4Lifetime1] = sc.a(this.field_q[var4Lifetime1], -2);
            }
          }
          if (var5Lifetime1 == 65) {
            if (var6Lifetime1 >= 64) {
              this.field_q[var4Lifetime1] = ne.a(this.field_q[var4Lifetime1], 2);
            } else {
              this.d(var4Lifetime1, param0 ^ -31961);
              this.field_q[var4Lifetime1] = sc.a(this.field_q[var4Lifetime1], -3);
            }
          }
          if (var5Lifetime1 == 99) {
            this.field_K[var4Lifetime1] = sc.a(this.field_K[var4Lifetime1], 127) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 98) {
            this.field_K[var4Lifetime1] = var6Lifetime1 + sc.a(16256, this.field_K[var4Lifetime1]);
          }
          if (var5Lifetime1 == 101) {
            this.field_K[var4Lifetime1] = (var6Lifetime1 << 7) + sc.a(127, this.field_K[var4Lifetime1]) + 16384;
          }
          if (var5Lifetime1 == 100) {
            this.field_K[var4Lifetime1] = sc.a(this.field_K[var4Lifetime1], 16256) + (16384 + var6Lifetime1);
          }
          if (var5Lifetime1 == 120) {
            this.a(var4Lifetime1, (byte) -52);
          }
          if (var5Lifetime1 == 121) {
            this.e(var4Lifetime1, 15198);
          }
          if (var5Lifetime1 == 123) {
            this.a(param0 ^ 29, var4Lifetime1);
          }
          if (var5Lifetime1 == 6) {
            var7 = this.field_K[var4Lifetime1];
            if (16384 == var7) {
              this.field_R[var4Lifetime1] = sc.a(this.field_R[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
            }
          }
          if (var5Lifetime1 == 38) {
            var7Lifetime1 = this.field_K[var4Lifetime1];
            if (var7Lifetime1 == 16384) {
              this.field_R[var4Lifetime1] = var6Lifetime1 + sc.a(this.field_R[var4Lifetime1], -128);
            }
          }
          if (var5Lifetime1 == 16) {
            this.field_n[var4Lifetime1] = sc.a(-16257, this.field_n[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 48) {
            this.field_n[var4Lifetime1] = var6Lifetime1 + sc.a(this.field_n[var4Lifetime1], -128);
          }
          if (var5Lifetime1 == 81) {
            if (var6Lifetime1 < 64) {
              this.c(var4Lifetime1, -20403);
              this.field_q[var4Lifetime1] = sc.a(this.field_q[var4Lifetime1], -5);
            } else {
              this.field_q[var4Lifetime1] = ne.a(this.field_q[var4Lifetime1], 4);
            }
          }
          if (var5Lifetime1 == 17) {
            this.d((this.field_y[var4Lifetime1] & -16257) + (var6Lifetime1 << 7), -24344, var4Lifetime1);
          }
          if (var5Lifetime1 == 49) {
            this.d(var6Lifetime1 + (this.field_y[var4Lifetime1] & -128), -24344, var4Lifetime1);
            return;
          }
        }
    }

    final static void b(boolean param0) {
        v.field_R = new String[]{fj.field_a, pb.field_h, tb.field_b, mh.field_v, na.field_b, ec.field_d, vj.field_a};
        kb.field_k = new String[][]{new String[]{em.field_a, hf.field_f, oj.field_j}, new String[]{hc.field_f, db.a(si.field_o, new String[]{ti.field_a, ua.field_xb}, true), db.a(ia.field_o, new String[]{ti.field_a, ua.field_xb}, true), vg.field_v, qa.field_q, ea.field_c, cl.field_c, wa.field_d}, new String[]{gj.field_D, db.a(fl.field_d, new String[]{ti.field_a, ua.field_xb}, true), db.a(oc.field_d, new String[]{ti.field_a, ua.field_xb}, true), db.a(af.field_a, new String[]{ti.field_a, ua.field_xb}, true), db.a(dl.field_u, new String[]{ti.field_a, ua.field_xb}, param0), db.a(kl.field_d, new String[]{ti.field_a, ua.field_xb}, param0), db.a(w.field_i, new String[]{ti.field_a, ua.field_xb}, true)}, new String[]{gj.field_D, db.a(hc.field_c, new String[]{ti.field_a, ua.field_xb}, param0), db.a(pl.field_i, new String[]{ti.field_a, ua.field_xb}, true), db.a(oe.field_b, new String[]{ti.field_a, ua.field_xb}, true), db.a(em.field_h, new String[]{ti.field_a, ua.field_xb}, true), db.a(re.field_b, new String[]{ti.field_a, ua.field_xb}, param0), db.a(kf.field_j, new String[]{ti.field_a, ua.field_xb}, true), db.a(lg.field_a, new String[]{ti.field_a, ua.field_xb}, true)}, new String[]{gj.field_D, db.a(jg.field_c, new String[]{ti.field_a, ua.field_xb}, param0), db.a(hm.field_f, new String[]{ti.field_a, ua.field_xb}, true), db.a(ui.field_lb, new String[]{ti.field_a, ua.field_xb}, true), db.a(gm.field_ib, new String[]{ti.field_a, ua.field_xb}, param0), db.a(j.field_l, new String[]{ti.field_a, ua.field_xb}, param0), db.a(cj.field_a, new String[]{ti.field_a, ua.field_xb}, true)}, new String[]{jj.field_V, g.field_t, qj.field_E}, new String[]{ga.field_q, kb.field_n, vc.field_g, ai.field_o}};
        String var21 = db.a(jk.field_o, new String[]{ti.field_a, ua.field_xb}, true);
        String var1 = var21;
        String var2 = db.a(ak.field_g, new String[]{ti.field_a, ua.field_xb}, true);
        String var3 = db.a(qa.field_o, new String[]{ti.field_a, ua.field_xb}, true);
        String var4 = db.a(ta.field_s, new String[]{ti.field_a, ua.field_xb}, true);
        String var5 = db.a(wh.field_c, new String[]{ti.field_a, ua.field_xb}, true);
        String var6 = db.a(jk.field_q, new String[]{ti.field_a, ua.field_xb}, true);
        String var7 = db.a(ga.field_r, new String[]{ti.field_a, ua.field_xb}, param0);
        String var8 = db.a(wj.field_a, new String[]{ti.field_a, ua.field_xb}, true);
        String var9 = db.a(of.field_g, new String[]{ti.field_a, ua.field_xb}, true);
        String var10 = db.a(ca.field_O, new String[]{ti.field_a, ua.field_xb}, true);
        String var11 = db.a(fh.field_f, new String[]{ti.field_a, ua.field_xb}, true);
        String var12 = db.a(hd.field_d, new String[]{ti.field_a, ua.field_xb}, true);
        String var13 = db.a(qj.field_F, new String[]{ti.field_a, ua.field_xb}, true);
        String var14 = db.a(ti.field_b, new String[]{ti.field_a, ua.field_xb}, param0);
        String var15 = db.a(wa.field_p, new String[]{ti.field_a, ua.field_xb}, true);
        String var16 = db.a(gf.field_a, new String[]{ti.field_a, ua.field_xb}, true);
        String var17 = db.a(gg.field_d, new String[]{ti.field_a, ua.field_xb}, param0);
        String var18 = db.a(fi.field_k, new String[]{ti.field_a, ua.field_xb}, true);
        String var19 = db.a(ld.field_b, new String[]{ti.field_a, ua.field_xb}, true);
        String var20 = db.a(si.field_H, new String[]{ti.field_a, ua.field_xb}, true);
        pa.field_i = new String[23];
        qg.field_d = new String[]{"", var21, var2, var3, var3, var4, var20, var2, var5, var5, var10, var4, var6, var6, var7, var8, var9, var11, var12, var13, var14, var15, var16, var17, var18, var19, var16, var6, var7, var9, var8, var11, var6, var20};
        pa.field_i[21] = ib.field_e;
        pa.field_i[6] = hg.field_l;
        pa.field_i[5] = hg.field_l;
        pa.field_i[11] = bk.field_c;
        pa.field_i[13] = hd.field_e;
        pa.field_i[2] = uh.field_t;
        pa.field_i[12] = pj.field_z;
        pa.field_i[3] = ji.field_b;
        pa.field_i[16] = pj.field_y;
        pa.field_i[1] = uj.field_f;
        pa.field_i[15] = qh.field_C;
        pa.field_i[0] = ec.field_a;
        pa.field_i[14] = pc.field_d;
        pa.field_i[4] = mk.field_c;
        pa.field_i[7] = a.field_c;
        pa.field_i[20] = hg.field_o;
        pa.field_i[17] = rh.field_b;
        pa.field_i[18] = bb.field_I;
        pa.field_i[9] = q.field_b[1];
        pa.field_i[19] = kf.field_l;
        pa.field_i[8] = q.field_b[0];
        pa.field_i[22] = r.field_k;
        pa.field_i[10] = q.field_b[2];
    }

    final boolean a(int param0, int param1, int param2, tk param3, int[] param4) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        de var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          if (param2 != -30686) {
            this.field_K = (int[]) null;
          }
          param3.field_u = la.field_a / 100;
          if (param3.field_q >= 0 && (param3.field_k == null ||
            param3.field_k.e())) {
            param3.d(param2 + 30809);
            param3.c(-1);
            if (param3.field_B > 0) {
              if (param3 != this.field_A[param3.field_o][param3.field_B]) {
                return true;
              }
              this.field_A[param3.field_o][param3.field_B] = null;
            }
            return true;
          }
          var6_int = param3.field_r;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)this.field_z[param3.field_o]) * 16.0 + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_r = var6_int;
          }
          param3.field_k.d(this.a(param2 ^ 18525, param3));
          var7 = param3.field_i;
          var8 = 0;
          param3.field_p = param3.field_p + var7.field_g;
          param3.field_A = param3.field_A + 1;
          var9 = (double)((-60 + param3.field_F << 8) + (param3.field_C * param3.field_r >> 12)) * 0.000005086263020833333;
          if (var7.field_c > 0) {
            if (var7.field_e <= 0) {
              param3.field_v = param3.field_v + 128;
            } else {
              param3.field_v = param3.field_v + (int)(Math.pow(2.0, (double)var7.field_e * var9) * 128.0 + 0.5);
            }
            if (var7.field_c * param3.field_v >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_p != null) {
            if (0 < var7.field_d) {
              param3.field_t = param3.field_t + (int)(Math.pow(2.0, var9 * (double)var7.field_d) * 128.0 + 0.5);
            } else {
              param3.field_t = param3.field_t + 128;
            }
            while (param3.field_w < -2 + var7.field_p.length) {
              if (param3.field_t > ((255 & var7.field_p[param3.field_w + 2]) << 8)) {
                param3.field_w = param3.field_w + 2;
                continue;
              }
              break;
            }
            if (param3.field_w == var7.field_p.length - 2 &&
              var7.field_p[param3.field_w + 1] == 0) {
              var8 = 1;
            }
          }
          if (param3.field_q >= 0 &&
            var7.field_i != null &&
            (1 & this.field_q[param3.field_o]) == 0 && (!(param3.field_B >= 0) ||
            param3 != this.field_A[param3.field_o][param3.field_B])) {
            if (0 >= var7.field_l) {
              param3.field_q = param3.field_q + 128;
            } else {
              param3.field_q = param3.field_q + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
            }
            while (param3.field_n < var7.field_i.length - 2) {
              if (param3.field_q > (var7.field_i[param3.field_n + 2] & 255) << 8) {
                param3.field_n = param3.field_n + 2;
                continue;
              }
              break;
            }
            if (var7.field_i.length - 2 == param3.field_n) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param3.field_k.a(param3.field_u, this.a((byte) 65, param3), this.b(32, param3));
            return false;
          }
          param3.field_k.f(param3.field_u);
          if (param4 != null) {
            param3.field_k.b(param4, param1, param0);
          } else {
            param3.field_k.a(param0);
          }
          if (param3.field_k.i()) {
            this.field_O.field_o.a(param3.field_k);
          }
          param3.d(114);
          if (0 <= param3.field_q) {
            param3.c(-1);
            if (0 < param3.field_B &&
              param3 == this.field_A[param3.field_o][param3.field_B]) {
              this.field_A[param3.field_o][param3.field_B] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("ei.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final boolean a(tk param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_k) {
            if (param1 == -1) {
              return false;
            }
            return false;
          }
          if (param0.field_q >= 0) {
            param0.c(-1);
            if (param0.field_B > 0 &&
              param0 == this.field_A[param0.field_o][param0.field_B]) {
              this.field_A[param0.field_o][param0.field_B] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ei.IA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int discarded$0 = 0;
        int var5;
        tk var6;
        var5 = fleas.field_A ? 1 : 0;
        if (param2 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_P[var4] = param0;
          }
        } else {
          this.field_P[param2] = param0;
        }
        if (!param1) {
          var6 = (tk) null;
          discarded$0 = this.b(19, (tk) null);
        }
    }

    private final int a(byte param0, tk param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        de var9 = null;
        de var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_P[param1.field_o] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param1.field_i;
          var10 = var9;
          var4 = this.field_J[param1.field_o] * this.field_o[param1.field_o] + 4096 >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = var4 * param1.field_j + 16384 >> 15;
          var4 = 128 + this.field_W * var4 >> 8;
          var4 = 128 + var4 * this.field_P[param1.field_o] >> 8;
          if (0 < var10.field_c) {
            var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_v * (double)var10.field_c) * (double)var4);
          }
          if (null != var10.field_p) {
            var5 = param1.field_t;
            var6 = var10.field_p[param1.field_w + 1];
            if (var10.field_p.length - 2 > param1.field_w) {
              var7 = (var9.field_p[param1.field_w] & 255) << 8;
              var8 = var10.field_p[2 + param1.field_w] << 8 & 65280;
              var6 = var6 + (-var6 + var10.field_p[param1.field_w + 3]) * (var5 - var7) / (-var7 + var8);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (param0 < 7) {
            this.field_u = -64;
          }
          if (param1.field_q > 0 &&
            null != var10.field_i) {
            var5Lifetime1 = param1.field_q;
            var6Lifetime1 = var10.field_i[1 + param1.field_n];
            if (param1.field_n < -2 + var10.field_i.length) {
              var7Lifetime1 = (var9.field_i[param1.field_n] & 255) << 8;
              var8Lifetime1 = 65280 & var10.field_i[param1.field_n + 2] << 8;
              var6Lifetime1 = var6Lifetime1 + (-var7Lifetime1 + var5Lifetime1) * (-var6Lifetime1 + var10.field_i[3 + param1.field_n]) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = 32 + var6Lifetime1 * var4 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ei.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final synchronized void a(boolean param0, int param1, wk param2) {
        try {
          if (param1 < 53) {
            this.field_F = -83;
          }
          this.a((byte) 102, true, param0, param2);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ei.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int stackIn_15_1 = 0;
        tk stackIn_15_2 = null;
        Object stackIn_16_0;
        boolean stackIn_16_3;
        tk var5;
        int var6_int;
        sf var6;
        tk var7;
        tk var8;
        int var9;
        wc var10;
        wc var11;
        var9 = fleas.field_A ? 1 : 0;
        this.b(-106, param0, 64, param1);
        if ((2 & this.field_q[param1]) != 0) {
          var5 = (tk) (this.field_O.field_n.b(-61));
          while (var5 != null) {
            if (var5.field_o == param1 &&
              var5.field_q < 0) {
              this.field_D[param1][var5.field_F] = null;
              this.field_D[param1][param0] = var5;
              var6_int = var5.field_E + (var5.field_C * var5.field_r >> 12);
              var5.field_E = var5.field_E + (param0 - var5.field_F << 8);
              var5.field_C = var6_int - var5.field_E;
              var5.field_r = 4096;
              var5.field_F = param0;
              return;
            }
            var5 = (tk) (this.field_O.field_n.c(6));
          }
        }
        var10 = (wc) (this.field_S.a((long)this.field_T[param1], -1110));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_m[param0];
        if (var6 == null) {
          return;
        }
        var7 = new tk();
        var7.field_o = param1;
        var7.field_z = var6;
        var7.field_D = var10;
        var7.field_i = var10.field_j[param0];
        var7.field_B = var10.field_n[param0];
        var7.field_F = param0;
        var7.field_j = 1024 + var10.field_o[param0] * (param2 * (param2 * var11.field_k)) >> 11;
        var7.field_l = 255 & var10.field_r[param0];
        var7.field_E = -(var10.field_l[param0] & 32767) + (param0 << 8);
        var7.field_q = -1;
        var7.field_w = 0;
        var7.field_v = 0;
        var7.field_t = 0;
        var7.field_n = 0;
        if (this.field_n[param1] == 0) {
          var7.field_k = ie.a(var6, this.a(-16257, var7), this.a((byte) 97, var7), this.b(32, var7));
        } else {
          var7.field_k = ie.a(var6, this.a(-16257, var7), 0, this.b(32, var7));
          stackIn_15_1 = -32730;
          stackIn_15_2 = var7;
          if (0 <= var10.field_l[param0]) {
            stackIn_16_0 = this;
            stackIn_16_3 = false;
          } else {
            stackIn_16_0 = this;
            stackIn_16_3 = true;
          }
          this.a(stackIn_15_1, stackIn_15_2, stackIn_16_3);
        }
        if (0 > var10.field_l[param0]) {
          var7.field_k.g(-1);
        }
        if (var7.field_B >= 0) {
          var8 = this.field_A[param1][var7.field_B];
          if (var8 != null &&
            var8.field_q < 0) {
            this.field_D[param1][var8.field_F] = null;
            var8.field_q = 0;
          }
          this.field_A[param1][var7.field_B] = var7;
        }
        this.field_O.field_n.a(param3, var7);
        this.field_D[param1][param0] = var7;
        return;
    }

    private final void a(int param0, int param1) {
        int var4 = fleas.field_A ? 1 : 0;
        tk var3 = (tk) (this.field_O.field_n.c((byte) 47));
        while (var3 != null) {
          if ((param1 < 0 || var3.field_o == param1) &&
            0 > var3.field_q) {
            this.field_D[var3.field_o][var3.field_F] = null;
            var3.field_q = 0;
          }
          var3 = (tk) (this.field_O.field_n.b((byte) -105));
        }
        if (param0 > -87) {
          this.b(100, -119);
        }
    }

    final synchronized boolean a(ng param0, rh param1, int param2, int param3, wk param4) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        oj var8 = null;
        int var9 = 0;
        int var11 = 0;
        wc var12 = null;
        wc var13 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          param4.a();
          var6_int = 1;
          if (param2 != 11498) {
            this.c(-17, -22, -33);
          }
          var7 = null;
          if (param3 > 0) {
            var7 = new int[]{param3};
          }
          var8 = (oj) (param4.field_j.a(true));
          while (var8 != null) {
            var9 = (int)var8.field_c;
            var12 = (wc) (this.field_S.a((long)var9, -1110));
            if (var12 == null) {
              var13 = ub.a(var9, (byte) -95, param1);
              if (var13 != null) {
                this.field_S.a(var13, true, (long)var9);
                if (!var13.a(param0, var8.field_l, false, (int[]) (var7))) {
                  var6_int = 0;
                }
              } else {
                var6_int = 0;
              }
            } else {
              if (!var12.a(param0, var8.field_l, false, (int[]) (var7))) {
                var6_int = 0;
                var8 = (oj) (param4.field_j.b((byte) 107));
                continue;
              }
            }
            var8 = (oj) (param4.field_j.b((byte) 107));
          }
          if (var6_int != 0) {
            param4.b();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ei.JA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.a(-1, (byte) -104);
        } else {
          this.a(-109, -1);
        }
        this.e(param0, 15198);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_T[var3] = this.field_I[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_L[var5] = sc.a(this.field_I[var5], -128);
          var5++;
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        this.field_G.f();
        if (param0 < 31) {
          ei.b(false);
        }
        this.field_Q = null;
        this.b(-1, param1);
    }

    public static void f(int param0) {
        field_H = null;
        field_N = null;
        field_v = null;
        field_m = null;
        if (param0 != -16257) {
          field_v = (String) null;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (this.field_G.c()) {
            var4_int = this.field_G.field_a * this.field_w / la.field_a;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_C;
              if (-var5 + this.field_E >= 0L) {
                this.field_C = var5;
                break;
              }
              var7 = (int)((-1L - this.field_C + (this.field_E + (long)var4_int)) / (long)var4_int);
              this.field_C = this.field_C + (long)var4_int * (long)var7;
              this.field_O.b(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.g(1);
              if (!this.field_G.c()) {
                break;
              }
            }
          }
          this.field_O.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ei.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(byte param0, int param1) {
        this.field_w = param1;
        int var3 = 115 % ((61 - param0) / 35);
    }

    private final void g(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = fleas.field_A ? 1 : 0;
        var2 = this.field_u;
        var3 = this.field_U;
        var4 = this.field_E;
        if (this.field_Q != null &&
          var3 == this.field_F) {
          this.a((byte) 83, this.field_s, this.field_B, this.field_Q);
          this.g(1);
          return;
        }
        if (param0 != 1) {
          this.b(-26, 121, -49, -100);
        }
        while (true) {
          if (var3 != this.field_U) {
            this.field_E = var4;
            this.field_u = var2;
            this.field_U = var3;
            if (this.field_Q != null) {
              stackIn_24_0 = this.field_F;
              stackIn_24_1 = var3;
              if (stackIn_24_0 < stackIn_24_1) {
                this.field_U = this.field_F;
                this.field_u = -1;
                this.field_E = this.field_G.a(this.field_U);
              }
            }
            return;
          }
          while (~var3 == ~this.field_G.field_g[var2]) {
            this.field_G.f(var2);
            var6 = this.field_G.b(var2);
            if (1 != var6) {
              if ((128 & var6) != 0) {
                this.f(-128, var6);
              }
              this.field_G.e(var2);
              this.field_G.c(var2);
              continue;
            }
            this.field_G.d();
            this.field_G.c(var2);
            if (this.field_G.g()) {
              if (null != this.field_Q) {
                this.a(this.field_B, 75, this.field_Q);
                this.g(param0 + 0);
                return;
              }
              if (this.field_B &&
                var3 != 0) {
                this.field_G.a(var4);
              } else {
                this.b(param0 ^ -2, true);
                this.field_G.f();
                return;
              }
            }
            break;
          }
          var2 = this.field_G.b();
          var3 = this.field_G.field_g[var2];
          var4 = this.field_G.a(var3);
        }
    }

    private final void d(int param0, int param1) {
        int discarded$1 = 0;
        tk var3;
        int var4;
        tk var5;
        var4 = fleas.field_A ? 1 : 0;
        if (param1 != 31911) {
          var5 = (tk) null;
          discarded$1 = this.b(64, (tk) null);
        }
        if ((this.field_q[param0] & 2) != 0) {
          var3 = (tk) (this.field_O.field_n.c((byte) 47));
          while (var3 != null) {
            if (var3.field_o == param0) {
              if (null != this.field_D[param0][var3.field_F]) {
                var3 = (tk) (this.field_O.field_n.b((byte) -105));
                continue;
              }
              if (0 > var3.field_q) {
                var3.field_q = 0;
              }
            }
            var3 = (tk) (this.field_O.field_n.b((byte) -105));
          }
        }
    }

    private final void e(int param0, int param1) {
        int var4;
        tk var5;
        var4 = fleas.field_A ? 1 : 0;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.e(param0, 15198);
          }
        } else {
          this.field_o[param0] = 12800;
          this.field_t[param0] = 8192;
          this.field_J[param0] = 16383;
          this.field_r[param0] = 8192;
          this.field_x[param0] = 0;
          this.field_z[param0] = 8192;
          this.d(param0, param1 ^ 18425);
          this.c(param0, -20403);
          this.field_q[param0] = 0;
          this.field_K[param0] = 32767;
          this.field_R[param0] = 256;
          if (param1 != 15198) {
            var5 = (tk) null;
            this.a(-127, (tk) null, false);
          }
          this.field_n[param0] = 0;
          this.d(8192, -24344, param0);
        }
    }

    private final void a(int param0, byte param1) {
        tk var3;
        int var4;
        int var5;
        var5 = fleas.field_A ? 1 : 0;
        var4 = -69 / ((param1 - 56) / 55);
        var3 = (tk) (this.field_O.field_n.c((byte) 47));
        while (var3 != null) {
          if (param0 < 0 ||
            var3.field_o == param0) {
            if (var3.field_k != null) {
              var3.field_k.f(la.field_a / 100);
              if (var3.field_k.i()) {
                this.field_O.field_o.a(var3.field_k);
              }
              var3.d(-30);
            }
            if (var3.field_q < 0) {
              this.field_D[var3.field_o][var3.field_F] = null;
            }
            var3.c(-1);
          }
          var3 = (tk) (this.field_O.field_n.b((byte) -105));
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param2 != 128) {
          this.field_A = (tk[][]) null;
        }
        this.field_r[param1] = param0;
    }

    private final void c(int param0, int param1) {
        tk var3 = null;
        int var4 = fleas.field_A ? 1 : 0;
        if (param1 != -20403) {
          return;
        }
        if ((this.field_q[param0] & 4) != 0) {
          var3 = (tk) (this.field_O.field_n.c((byte) 47));
          while (var3 != null) {
            if (var3.field_o == param0) {
              var3.field_x = 0;
            }
            var3 = (tk) (this.field_O.field_n.b((byte) -105));
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var6;
        tk var7;
        int var8;
        tk var9;
        var8 = fleas.field_A ? 1 : 0;
        var9 = this.field_D[param3][param1];
        if (var9 == null) {
          return;
        }
        {
          var6 = 72 / ((9 - param0) / 45);
          this.field_D[param3][param1] = null;
          if (0 != (2 & this.field_q[param3])) {
            var7 = (tk) (this.field_O.field_n.c((byte) 47));
            while (var7 != null) {
              if (var7.field_o == var9.field_o &&
                var7.field_q < 0 &&
                var7 != var9) {
                var9.field_q = 0;
                break;
              }
              var7 = (tk) (this.field_O.field_n.b((byte) -105));
            }
          } else {
            var9.field_q = 0;
          }
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        if (param0 > -4) {
          ei.a(-11, (CharSequence) null, '�');
        }
        if (param1 != this.field_T[param2]) {
          this.field_T[param2] = param1;
          for (var4 = 0; 128 > var4; var4++) {
            this.field_A[param2][var4] = null;
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        this.field_I[param0] = param2;
        this.field_L[param0] = sc.a(-128, param2);
        this.e(-38, param2, param0);
        if (param1 >= -110) {
          field_v = (String) null;
        }
    }

    private final int a(int param0, tk param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        de var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_r * param1.field_C >> 12) + param1.field_E;
          var3_int = var3_int + (this.field_R[param1.field_o] * (-8192 + this.field_r[param1.field_o]) >> 12);
          var4 = param1.field_i;
          if (var4.field_g > 0 && (!(0 >= var4.field_f) ||
            this.field_x[param1.field_o] > 0)) {
            var5 = var4.field_f << 2;
            var6 = var4.field_m << 1;
            if (var6 > param1.field_A) {
              var5 = var5 * param1.field_A / var6;
            }
            var5 = var5 + (this.field_x[param1.field_o] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_p));
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          if (param0 != -16257) {
            this.field_U = -89;
          }
          var5Lifetime1 = (int)((double)(param1.field_z.field_k * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)la.field_a + 0.5);
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ei.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final synchronized void a(byte param0, boolean param1, boolean param2, wk param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = fleas.field_A ? 1 : 0;
        try {
          this.a(33, param1);
          this.field_G.a(param3.field_i);
          this.field_B = param2 ? true : false;
          this.field_C = 0L;
          var5_int = this.field_G.a();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_G.f(var6);
            this.field_G.e(var6);
            this.field_G.c(var6);
          }
          if (param0 < 82) {
            this.field_I = (int[]) null;
          }
          this.field_u = this.field_G.b();
          this.field_U = this.field_G.field_g[this.field_u];
          this.field_E = this.field_G.a(this.field_U);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ei.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized int a() {
        return 0;
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != 16384) {
          this.b(-127, 105, -38);
        }
    }

    public ei() {
        this.field_I = new int[16];
        this.field_y = new int[16];
        this.field_L = new int[16];
        this.field_D = new tk[16][128];
        this.field_p = new int[16];
        this.field_W = 256;
        this.field_R = new int[16];
        this.field_n = new int[16];
        this.field_T = new int[16];
        this.field_t = new int[16];
        this.field_z = new int[16];
        this.field_K = new int[16];
        this.field_q = new int[16];
        this.field_A = new tk[16][128];
        this.field_P = new int[16];
        this.field_o = new int[16];
        this.field_r = new int[16];
        this.field_J = new int[16];
        this.field_x = new int[16];
        this.field_w = 1000000;
        this.field_G = new fd();
        this.field_O = new gl(this);
        this.field_S = new hc(128);
        this.a(256, true, -1);
        this.b(-1, true);
    }

    static {
        field_N = "EXCLUSIVE";
        field_H = new boolean[112];
        field_v = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_m = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
