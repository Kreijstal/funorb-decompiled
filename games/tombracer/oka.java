/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oka extends wv {
    private pfa field_x;
    private int field_r;
    static int field_z;
    private int field_v;
    private int field_u;
    static jea field_w;
    private int field_s;
    private int field_t;
    private vna field_q;
    static jea[] field_y;
    static String[] field_A;

    final void a(boolean param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2 ^ 0);
        if (param0) {
          stackIn_6_0 = (!this.d((byte) -124)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var4 = stackIn_6_0;
        if (param2 != 15283) {
          field_y = (jea[]) null;
        }
        if (0 >= this.field_u) {
          if (!this.d((byte) -124)) {
            stackIn_18_0 = (param0) ? 0 : -30;
            if (~stackIn_18_0 != ~this.field_s) {
              fieldTemp$0 = this.field_s + 1;
              this.field_s = this.field_s + 1;
              if (fieldTemp$0 == 30) {
                this.field_s = -30;
                this.f(-9);
              }
              if (this.field_s == 0) {
                if (var4 != 0) {
                  this.field_u = 64;
                } else {
                  this.field_u = 0;
                }
              }
            }
          } else {
            fieldTemp$0 = this.field_s + 1;
            this.field_s = this.field_s + 1;
            if (fieldTemp$0 == 30) {
              this.field_s = -30;
              this.f(-9);
            }
            if (this.field_s == 0) {
              if (var4 != 0) {
                this.field_u = 64;
              } else {
                this.field_u = 0;
              }
            }
          }
        } else {
          fieldTemp$1 = this.field_s + 1;
          this.field_s = this.field_s + 1;
          if (fieldTemp$1 == 15) {
            this.field_s = 0;
            if (var4 != 0) {
              this.field_u = this.field_u >> 2;
            } else {
              this.field_u = 0;
            }
          }
        }
        this.field_t = 0;
        this.field_r = this.e(-18796);
        this.field_x.a(true);
        if (hf.field_b == 1) {
          for (var5 = 0; jw.field_z.length > var5; var5++) {
            if (mca.a((byte) 6, var5) &&
              bma.d(100, var5)) {
              var6 = jw.field_z[var5] + (this.field_t + (uta.field_d.a() >> 1));
              var7 = this.field_r - (-hq.field_b[var5] - (uta.field_d.c() >> 1));
              var8 = 20;
              if (jba.field_j > var6 - var8 &&
                var8 + var6 > jba.field_j &&
                sta.field_B > -var8 + var7 &&
                var8 + var7 > sta.field_B) {
                this.field_v = var5;
                if (this.field_x.a((byte) 79, var5)) {
                  this.b(false);
                } else {
                  this.field_x.a(var5, (byte) -109);
                }
              }
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        if (param1 == 0) {
          return 10;
        }
        if (param0 < 111) {
          this.field_v = -113;
        }
        if (param1 == 1 &&
          this.field_m.length == 3) {
          return aaa.a(false) - this.field_m[param1].e(-163) >> 1;
        }
        return aaa.a(false) - this.field_m[param1].e(-163) - 10;
    }

    final void a(byte param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        nh var5_ref_nh;
        int var6;
        int var7;
        String var8;
        int var9;
        cc var10;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var7Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1);
        if (hb.field_t == rba.field_a) {
          return;
        }
        ik.field_h.a(this.field_t, this.field_r);
        dp.field_d.a(this.field_t, this.field_r);
        var10 = (cc) (this.field_q.f(-80));
        while (var10 != null) {
          var10.a(99, this.field_t, this.field_r);
          var10 = (cc) (this.field_q.e(121));
        }
        if (mq.field_e == null &&
          !vpa.a(param0 + 119)) {
          return;
        }
        var3 = 0;
        for (var4 = 0; var4 < cb.field_i.length; var4++) {
          if (mca.a((byte) 6, var4)) {
            if (rd.b(false) &&
              !dta.field_g[var4]) {
              var3 = 1;
              qf.field_k[var4].a(pha.field_ub[var4] + this.field_t, dba.field_b[var4] + this.field_r, 0, -1426063361, 1);
            } else {
              cb.field_i[var4].a(pha.field_ub[var4] + this.field_t, this.field_r + dba.field_b[var4]);
              var5_ref_nh = uta.field_d;
              if (null != mq.field_e) {
                if (mq.field_e.field_n[var4] == 3) {
                  var5_ref_nh = je.field_E;
                }
                if (mq.field_e.field_n[var4] == 2) {
                  var5_ref_nh = eu.field_a;
                }
                if (mq.field_e.field_n[var4] == 1) {
                  var5_ref_nh = pq.field_a;
                }
              }
              var5_ref_nh.a(jw.field_z[var4] + this.field_t, this.field_r + hq.field_b[var4]);
            }
          }
        }
        ura.a(-10985);
        this.field_x.b(this.field_r, 11327, this.field_t);
        se.f((byte) -6);
        var6 = aaa.a(false) >> 1;
        var5 = 40;
        var4Lifetime1 = 260;
        var7 = this.field_r - (100 - koa.b(param0 + 28));
        kq.field_a.a(var6 - (kq.field_a.a() >> 1), -(kq.field_a.c() >> 1) + var7);
        be.a(vj.field_d[this.field_v].toUpperCase(), 1, eda.field_f, 2431750, 8 + o.field_d.field_m, var5, 1, var7 - (var5 >> 1), var6 - (var4Lifetime1 >> 1), -1, (byte) 60, var4Lifetime1);
        if (rd.b(false) && (vpa.a(62) ||
          mq.field_e.field_a ||
          var3 != 0)) {
          var7Lifetime1 = koa.b(0) / 2 + this.field_r;
          var4Lifetime2 = 350;
          var5Lifetime1 = 100;
          tga.field_a.c(-1442774783, var6 - (var4Lifetime2 >> 1), var4Lifetime2, -(var5Lifetime1 >> 1) + var7Lifetime1, -22971, var5Lifetime1);
          tga.field_a.a(var7Lifetime1 - (var5Lifetime1 >> 1), -(var4Lifetime2 >> 1) + var6, var5Lifetime1, var4Lifetime2, -1442774783, (byte) -75);
          tga.field_a.a(var7Lifetime1 - (var5Lifetime1 >> 1) + 1, 1 - (var4Lifetime2 >> 1) + var6, -2 + var5Lifetime1, var4Lifetime2 - 2, -1426063361, (byte) -128);
          if (!vpa.a(42) &&
            var3 != 0) {
            var8 = qu.field_c;
          } else {
            if (!vpa.a(109)) {
              var8 = tna.field_d;
            } else {
              var8 = tc.field_f;
            }
          }
          be.a(var8, 1, kn.field_p, 16777215, 16, var5Lifetime1, 1, var7Lifetime1 - (var5Lifetime1 >> 1), 10 + (var6 - (var4Lifetime2 >> 1)), -1, (byte) 60, -20 + var4Lifetime2);
        }
        if (eq.c(0)) {
          oka.a("Unlock: Key 2-9", 16777215, kn.field_p, -1, this.field_r + koa.b(param0 + 28) - 100, -100 + aaa.a(false), -1);
          oka.a("Play All: Insert", 16777215, kn.field_p, -1, -80 + (this.field_r + koa.b(0)), aaa.a(false) - 100, -1);
        }
        return;
    }

    private final boolean d(byte param0) {
        if (param0 != -124) {
          this.f(-35);
        }
        return false;
    }

    final void a(byte param0) {
        super.a((byte) 85);
        this.field_s = -30;
        this.field_t = 0;
        this.field_r = this.e(-18796);
        this.field_x = new pfa(0, this.field_v);
        this.field_q = new vna();
        this.field_q.b((byte) -118, new cc(0, 1, 2));
        this.field_q.b((byte) -54, new cc(0, 2, 6));
        this.field_q.b((byte) -115, new cc(1, 3, 4));
        this.field_q.b((byte) -70, new cc(1, 4, ta.field_vb[0], go.field_m[0], 4, 2));
        this.field_q.b((byte) -97, new cc(2, 4, 4));
        this.field_q.b((byte) -80, new cc(4, 3, ta.field_vb[1], go.field_m[1], 2, 3));
        this.field_q.b((byte) -119, new cc(4, 5, ta.field_vb[5], go.field_m[5], 3, 2));
        this.field_q.b((byte) -88, new cc(3, 6, 4));
        this.field_q.b((byte) -92, new cc(5, 7, ta.field_vb[2], go.field_m[2], 3, 3));
        this.field_q.b((byte) -96, new cc(6, 8, 4));
        if (param0 <= 78) {
          this.b(true, false, 48);
        }
        this.field_q.b((byte) -107, new cc(6, 7, ta.field_vb[3], go.field_m[3], 3, 3));
        this.field_q.b((byte) -51, new cc(7, 8, ta.field_vb[4], go.field_m[4], 1, 2));
    }

    private final void b(boolean param0) {
        bja.a(this.field_v, (byte) -102, 1);
        if (param0) {
          this.a(-11, '￘', 77);
        }
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
          this.field_s = 3;
        }
        return koa.b(0) - 25;
    }

    final static void a(String param0, int param1, da param2, int param3, int param4, int param5, int param6) {
        try {
          param2.a(fm.a(false, param6), param3, param5, fm.a(false, param1), param4, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oka.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    oka(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_s = -30;
        try {
          this.field_o = false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oka.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          this.a((byte) 114, true);
        }
        return this.a((byte) 112, param0) + this.field_m[param0].e(-163);
    }

    private final void f(int param0) {
        if (param0 != -9) {
          this.field_u = -72;
        }
    }

    final void b(boolean param0, boolean param1, int param2) {
        if (param2 >= 0 &&
          param2 < this.field_m.length) {
          super.b(param0, param1, param2);
          if (this.field_k.a(param0) &&
            this.field_m[param2].field_g == 21) {
            this.b(false);
          }
          return;
        }
    }

    public static void d(int param0) {
        int var1 = -7 % ((param0 + 15) / 53);
        field_w = null;
        field_y = null;
        field_A = null;
    }

    final boolean a(int param0, char param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_43_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        cc var9;
        int var10;
        int var11;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param0 != 96) {
          stackIn_6_0 = (param0 == kda.field_hd) ? 1 : 0;
        } else {
          stackIn_6_0 = 1;
        }
        var4 = stackIn_6_0;
        if (97 != param0) {
          stackIn_12_0 = (param0 == mf.field_a) ? 1 : 0;
        } else {
          stackIn_12_0 = 1;
        }
        var5 = stackIn_12_0;
        if (param2 != 1) {
          this.field_t = 74;
        }
        if (param0 == 98) {
          stackIn_20_0 = 1;
        } else {
          stackIn_20_0 = (param0 == mi.field_k) ? 1 : 0;
        }
        var6 = stackIn_20_0;
        if (99 != param0) {
          stackIn_26_0 = (param0 == fp.field_a) ? 1 : 0;
        } else {
          stackIn_26_0 = 1;
        }
        var7 = stackIn_26_0;
        if (var4 == 0 &&
          var5 == 0 &&
          var6 == 0 &&
          var7 == 0 &&
          fp.field_a != param0 &&
          gsa.field_j != param0 &&
          param0 != 84) {
          return true;
        }
        if (!this.field_x.field_g) {
          var8 = this.field_v;
          var9 = (cc) (this.field_q.f(-80));
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var9 != null) {
              if (var9.a(this.field_x, param0, (byte) 116)) {
                if (this.field_v == var9.field_i) {
                  stackIn_43_0 = var9.field_g;
                } else {
                  stackIn_43_0 = var9.field_i;
                }
                var10 = stackIn_43_0;
                if (mca.a((byte) 6, var10) &&
                  bma.d(96, var10)) {
                  if (var9.b(true)) {
                    this.field_x.a(-28562, var9.field_k << 16, var9.field_j << 16);
                  }
                  var8 = var10;
                  decompiledFrameRemainder0 = false;
                }
              }
              if (decompiledFrameRemainder0) {
                var9 = (cc) (this.field_q.e(param2 + 115));
                continue;
              }
            }
            if (var8 != this.field_v) {
              this.field_v = var8;
              this.field_x.b((byte) 58, this.field_v);
            }
            if (param0 != 84 &&
              83 != param0) {
              break;
            }
            this.b(false);
            break;
          }
        }
        return true;
    }

    private final int e(int param0) {
        int var3 = 0;
        int var2 = koa.b(0);
        int var3Lifetime1;
        if (param0 != -18796) {
          this.field_r = -91;
        }
        if (0 <= this.field_s) {
          if (this.field_u > 0) {
            return this.field_s * ((-this.field_s + 15) * -this.field_u) / 225;
          }
          var3 = this.field_s;
          return var3 * var2 * var3 / 900;
        }
        var3Lifetime1 = 30 + this.field_s;
        return -var2 + var3Lifetime1 * var3Lifetime1 * var2 / 900;
    }

    final static void b(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = tl.field_r;
        if (5 <= var3) {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (var3 < 120) {
              var3 = 120 - var3;
              var2 = 8192 - 8192 * var3 * var3 / 3300;
            }
          }
        } else {
          var2 = 8192 * var3 * var3 / 1100;
        }
        var4 = 1;
        var5 = 0;
        if (param0 < 6) {
          oka.b((byte) 90, -70);
        }
        if (param1 == 1) {
          var5 = 1;
        }
        if (param1 == 3) {
          var4 = -1;
        }
        if (param1 == 4) {
          var5 = 1;
          var4 = 1;
        }
        if (param1 == 5) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 6) {
          var4 = 1;
          var5 = -1;
        }
        if (param1 == 7 ||
          param1 == 8) {
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 11) {
          var4 = -1;
        }
        if (12 == param1) {
          var4 = -1;
          var5 = -1;
        }
        if (param1 == 13) {
          var4 = 1;
          var5 = -1;
        }
        if (param1 == 14) {
          var5 = 1;
          var4 = -1;
        }
        if (15 == param1) {
          var4 = 1;
          var5 = 1;
        }
        nba.field_a = jl.a(var5 * var2, var2 * var4, 0);
    }

    static {
        field_z = -1;
        field_A = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
