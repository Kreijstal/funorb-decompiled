/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ql {
    private oj field_i;
    private int field_h;
    static int field_l;
    private v field_u;
    private oc field_k;
    private oc field_p;
    private oc field_r;
    private oc field_j;
    private oc field_q;
    static int field_f;
    private boolean field_s;
    private qm field_n;
    private oc field_t;
    private int field_e;
    private oc[] field_d;
    private qm field_o;
    private int field_g;
    private v field_m;

    final boolean a(byte param0) {
        int var2;
        if (!this.field_s &&
          ha.field_t == 3) {
          var2 = -24 % ((57 - param0) / 47);
          return true;
        }
        return false;
    }

    final void d(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        oc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_37_3;
        oc var3;
        int var4;
        int var5;
        oj var5_ref_oj;
        int var6;
        oj var7;
        int var8;
        oj var9;
        oj var10;
        oj var11;
        p var12;
        oc var13;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var4Lifetime1Lifetime1;
        int var4Lifetime5Lifetime1;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var11 = mm.field_m[0];
        var3 = var11.field_j;
        if (this.field_o != null) {
          this.field_o.field_j.a((byte) 46, var3);
          this.field_o.field_l.a(var11.field_l.field_a - 0.5, var11.field_l.field_f - 0.5, param0 + 2);
          this.field_o.field_c = var11.field_c;
          if (!(32.0 > var11.field_c) &&
            !(var11.field_c > 224.0)) {
            if (var11.field_c < 96.0) {
              this.field_o.field_c = 64.0;
            } else if (!(var11.field_c < 160.0)) {
              this.field_o.field_c = 192.0;
            } else {
              this.field_o.field_c = 128.0;
            }
          } else {
            this.field_o.field_c = 0.0;
          }
          this.field_o.field_l.a(25, (byte) 94, var11.field_c);
          this.field_o.b((byte) 117);
        }
        if (ha.field_t == 3 &&
          !this.field_s) {
          this.field_i.field_n = false;
          var4 = -this.field_k.field_e + var3.field_e;
          var5 = var3.field_g - this.field_k.field_g;
          if (var4 > -2 &&
            var4 < 2 &&
            var5 < 0) {
            this.field_s = true;
            this.field_i.field_n = true;
            nh.field_E.a(-1, 8360, -1);
            this.field_k.field_g = this.field_k.field_g + 1;
            var6 = this.field_k.b(-4);
            ln.field_a.field_c[var6] = 4;
            ln.field_a.field_c[var6 - 1] = 4;
            ln.field_a.field_c[var6 + 1] = 4;
            fieldTemp$0 = dk.field_o;
            dk.field_o = dk.field_o + 1;
            vj.field_w[fieldTemp$0] = new qm(ln.field_a, this.field_k, 145, rl.field_c, 0, false);
            tb.field_N = 150;
            tk.a(1, jc.field_c, 31, true);
          } else {
            nh.field_E.a((byte) 46, this.field_i.field_j);
          }
        }
        if (this.field_s) {
          if (0 == (15 & ng.field_u) &&
            null != this.field_d) {
            var4Lifetime1 = 3 & ng.field_u / 16;
            if (!kc.a((byte) -127, this.field_d[var4Lifetime1])) {
              var9 = new oj(this.field_d[var4Lifetime1], 18, rl.field_c);
              var5_ref_oj = var9;
              var5_ref_oj.field_M = 0;
              fieldTemp$1 = el.field_j;
              el.field_j = el.field_j + 1;
              mm.field_m[fieldTemp$1] = var9;
            }
          }
          if (!(this.field_i.field_I > 0) ||
            this.field_i.field_i != 8) {
            cm.a(this.field_k, false);
            var4Lifetime1Lifetime1 = this.field_k.b(-4);
            ln.field_a.field_c[var4Lifetime1Lifetime1] = 0;
            ln.field_a.field_c[var4Lifetime1Lifetime1 - 1] = 0;
            ln.field_a.field_c[1 + var4Lifetime1Lifetime1] = 0;
            if (0 < wa.field_p) {
              kd.a(16, 1);
              nh.field_E.a((byte) 46, this.field_p);
            } else {
              kd.a(17, param0 + 2);
              nh.field_E.a((byte) 46, this.field_r);
            }
            le.field_D = 9000;
            this.field_h = 500;
            tb.field_N = le.field_D;
            ti.a(235, (byte) 86, 20);
            this.field_s = false;
            if (pm.field_h &&
              this.field_j != null &&
              this.field_j.field_e > 18) {
              var5Lifetime1 = this.field_j.b(-4);
              ln.field_a.field_c[var5Lifetime1] = 0;
              ln.field_a.field_c[var5Lifetime1 + 1] = 0;
              stackIn_36_0 = this.field_j;
              stackIn_36_1 = 18;
              stackIn_36_2 = 8360;
              if (om.field_b) {
                stackIn_37_3 = 237;
              } else {
                stackIn_37_3 = -1;
              }
              ((oc) (Object) stackIn_36_0).a(stackIn_36_1, stackIn_36_2, stackIn_37_3);
            }
          }
        }
        if (ha.field_t == 16 &&
          null == this.field_o &&
          0 > this.field_g) {
          var4Lifetime2 = ih.a(var3, (byte) -90, this.field_p);
          if (4 > var4Lifetime2) {
            ca.a((double)(this.field_p.field_e + 1), 0, (double)(this.field_p.field_g + 3), true, 0);
            this.field_o = new qm(ln.field_a, var3, 230, rl.field_c, 0, false);
            this.field_o.field_c = var11.field_c;
            fieldTemp$2 = dk.field_o;
            dk.field_o = dk.field_o + 1;
            vj.field_w[fieldTemp$2] = this.field_o;
          }
        }
        if (null != this.field_o &&
          dn.field_i != of.field_d) {
          this.field_n = this.field_o;
          this.field_g = 1000;
          this.field_o = null;
          kd.a(17, param0 + 2);
          nh.field_E.a(-1, 8360, -1);
        }
        if (0 <= this.field_g) {
          this.field_g = this.field_g - 1;
          if (this.field_g == 0) {
            cm.a(this.field_p, false);
            this.field_n.field_u = null;
            this.field_n.field_i = -1;
            kd.a(14, 1);
            nh.field_E.a((byte) 46, this.field_q);
            var4Lifetime3 = this.field_p.b(-4);
            ln.field_a.field_c[var4Lifetime3] = 0;
            ln.field_a.field_c[var4Lifetime3 + 1] = 0;
            ln.field_a.field_c[var4Lifetime3 - ln.field_a.field_d] = 0;
            ln.field_a.field_c[-ln.field_a.field_d + var4Lifetime3 + 1] = 0;
            if (uj.field_l == 1 &&
              ej.d((byte) 86)) {
              eh.field_c.a(lm.field_A[17], 100, uh.field_i);
            }
            for (var5Lifetime2 = 1; var5Lifetime2 < 5; var5Lifetime2++) {
              for (var6Lifetime1 = 0; 256 >= var6Lifetime1; var6Lifetime1 += 16) {
                var12 = jn.field_F[ib.field_c];
                var12.field_c = (double)var6Lifetime1;
                var12.field_j.a((byte) 46, this.field_n.field_j);
                var12.field_l.a(0.0, 0.0, 1);
                var12.field_i = 8;
                var12.field_h = var5Lifetime2;
                var12.field_e = 0;
                var12.field_l.a(4 * var5Lifetime2, (byte) 94, var12.field_c);
                var12.a(225, -10.0 + (var12.field_c + Math.random() * 20.0), 50);
                ib.field_c = ib.field_c + 1;
              }
            }
          }
        }
        if (param0 != -1) {
          return;
        }
        if (ha.field_t == 17 &&
          var3.field_e >= this.field_r.field_e - 7 &&
          this.field_r.field_e + 4 > var3.field_e) {
          var4Lifetime4 = 24 * (this.field_r.field_g - 5);
          if (uj.field_p.field_g < var4Lifetime4) {
            uj.field_p.field_g = var4Lifetime4;
          }
          if (!dl.field_l &&
            var3.field_g <= 5 + this.field_r.field_g) {
            dl.field_l = true;
            nh.field_E.a(-1, param0 ^ -8361, -1);
            this.field_e = 300;
          }
          if (-10 + this.field_r.field_g > var3.field_g) {
            var3.field_g = this.field_r.field_g - 10;
          }
          if (dl.field_l &&
            var3.field_e < this.field_r.field_e) {
            var11.field_l.field_f = var11.field_l.field_f + 0.2;
          } else {
            if (dl.field_l &&
              this.field_r.field_e < var3.field_e) {
              var11.field_l.field_f = var11.field_l.field_f - 0.2;
            }
          }
          if (dl.field_l) {
            if (this.field_e <= 0) {
              mf.a(false, 3);
            } else {
              this.field_e = this.field_e - 1;
            }
          }
          if (dl.field_l &&
            (7 & 300 - this.field_e) == 0) {
            var13 = new oc(this.field_t);
            var13.field_e = var13.field_e + ((int)(4.0 * Math.random()) - 1);
            var13.field_g = var13.field_g + (-2 + (int)(4.0 * Math.random()));
            var6Lifetime2 = 18;
            if (this.field_e != 300) {
              if (Math.random() < 0.4) {
                var6Lifetime2 = 1;
              }
            } else {
              var13.a((byte) 46, this.field_t);
              var6Lifetime2 = 27;
              var13.field_g = var13.field_g - 4;
            }
            var10 = new oj(var13, var6Lifetime2, rl.field_c);
            var7 = var10;
            if (var6Lifetime2 == 1) {
              var7.field_B = 100;
            }
            fieldTemp$3 = el.field_j;
            el.field_j = el.field_j + 1;
            mm.field_m[fieldTemp$3] = var10;
          }
        }
        if (ha.field_t == 14) {
          if (var3.field_g < this.field_q.field_g + 7 &&
            this.field_q.field_e + 10 > var3.field_e) {
            var4Lifetime5 = -640 + 24 * (this.field_q.field_e + 10);
            if (uj.field_p.field_e > var4Lifetime5) {
              uj.field_p.field_e = var4Lifetime5;
            }
          }
          var4Lifetime5Lifetime1 = ih.a(this.field_q, (byte) -127, var3);
          if (var4Lifetime5Lifetime1 < 3) {
            ng.field_k = true;
            mf.a(false, 3);
            ti.a(225, (byte) -110, 30);
          }
        }
        if (0 < this.field_h) {
          this.field_h = this.field_h - 1;
        }
        if (pm.field_h &&
          om.field_b &&
          this.field_j != null &&
          ln.field_a.field_g[var3.b(-4)] == 2) {
          ti.a(this.field_j.field_g, (byte) -111, this.field_j.field_e);
          this.field_j = null;
          this.field_u.field_a = 1;
        }
    }

    final void b(byte param0) {
        if (17 == ha.field_t &&
          0 < this.field_h) {
          this.field_m.field_d = -this.field_m.field_h + (480 + uj.field_p.field_g - 50);
          this.field_m.field_l = (-this.field_m.field_m + 640) / 2 + uj.field_p.field_e;
          this.field_m.a((byte) -76);
        }
        if (this.field_u.field_a == 1) {
          this.field_u.a((byte) -127);
        }
        int var2 = 76 % ((-48 - param0) / 38);
    }

    final void e(int param0) {
        int[] var2;
        int var3;
        int var4;
        int[] var5;
        int var6;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var3Lifetime1;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var9 = ln.field_a.field_v;
        var7 = var9;
        var5 = var7;
        var10 = var5;
        var8 = var10;
        var2 = var8;
        this.field_i = vi.field_p[param0];
        if (var9.length < 12) {
          this.field_k = new oc();
          this.field_p = new oc();
          this.field_r = new oc();
          this.field_q = new oc();
          this.field_t = new oc();
        } else {
          this.field_k = new oc(var9[2], var9[3]);
          this.field_p = new oc(var9[4], var9[5]);
          this.field_r = new oc(var9[6], var9[7]);
          this.field_q = new oc(var9[8], var9[9]);
          this.field_t = new oc(var9[10], var9[11]);
        }
        if (var10.length >= 20) {
          for (var3 = 0; 4 > var3; var3++) {
            this.field_d[var3] = new oc(var2[2 * var3 + 12], var2[1 + 2 * var3 + 12]);
          }
        } else {
          this.field_d = null;
        }
        this.field_m = new v(je.field_b, 24 * this.field_k.field_e, 24 + this.field_k.field_g * 24);
        kd.a(3, 1);
        this.field_g = -1;
        this.field_s = false;
        if (pm.field_h &&
          var10.length > 20) {
          this.field_j = new oc(var10[20], var10[21]);
        }
        if (22 < var10.length) {
          this.field_u = new v(qh.field_c, 24 * var10[22], 24 * var10[23]);
        }
        if (!om.field_b) {
          var6 = 0;
          var3Lifetime1 = var6;
          while (ln.field_a.field_g.length > var6) {
            if (2 == ln.field_a.field_g[var6]) {
              if (4 != ln.field_a.field_c[var6]) {
                if (2 == ln.field_a.field_c[var6]) {
                  ln.field_a.field_c[var6] = 4;
                }
              } else {
                ln.field_a.field_c[var6] = 0;
              }
            }
            var6++;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5_int = param1 + param0;
          for (var6 = (param0 & 1) + param0; var6 < var5_int; var6 += 2) {
            si.e(param3, var6, param4, 65793, 96);
          }
          if (param2 != 11992) {
            fb.a(0.5819263259193922, (byte) 31, 0.515826981495636, 0.17239172967428718, 0.7326247205058647, 1.0288611625496324, -0.6530990291171533, 1.5894862770774536, 1.0324946007427929);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var5), "fb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
          return;
        }
        if (!om.field_b) {
          ti.a(224, (byte) 40, 31);
        } else {
          ti.a(214, (byte) -114, 41);
        }
    }

    final String a(boolean param0) {
        if (3 != ha.field_t) {
          return cj.field_K;
        }
        if (this.field_s) {
          return en.field_v;
        }
        if (param0) {
          this.b((byte) 80);
        }
        return o.field_l;
    }

    final boolean a(oc param0, boolean param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 109) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("fb.BA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(double param0, byte param1, double param2, double param3, double param4, double param5, double param6, double param7, double param8) {
        double var17 = -param8 + param3;
        double var19 = -param5 + param7;
        double var21 = -param4 + param3;
        double var23 = -param0 + param7;
        if (param1 != 43) {
          return false;
        }
        double var25 = -param6 + param3;
        double var27 = param7 - param2;
        if ((-(var25 * var19) + var27 * var17) * (-(var19 * var21) + var23 * var17) >= 0.0) {
          return false;
        }
        var21 = -param8 + param6;
        var27 = -param7 + param2;
        var23 = param2 - param5;
        var25 = -param3 + param6;
        var19 = -param0 + param2;
        var17 = -param4 + param6;
        if (0.0 <= (-(var25 * var19) + var27 * var17) * (var23 * var17 - var19 * var21)) {
          return false;
        }
        return true;
    }

    public fb() {
        this.field_d = new oc[4];
    }

    static {
        field_f = 480;
        field_l = 0;
    }
}
