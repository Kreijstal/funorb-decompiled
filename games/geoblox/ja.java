/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends rc {
    int field_C;
    private int field_q;
    private int field_x;
    ja[] field_n;
    float field_o;
    boolean field_B;
    int field_L;
    float field_u;
    int field_r;
    tf field_K;
    int field_H;
    private int field_s;
    int field_M;
    int field_p;
    private int field_I;
    int field_z;
    boolean field_t;
    int field_m;
    int field_E;
    static tf field_A;
    dm field_J;
    int field_G;
    float field_F;
    float field_v;
    private int field_y;
    static d field_D;
    float field_w;
    int field_N;

    final void g(int param0) {
        float var2;
        float var3;
        int var4;
        int var5;
        int var6;
        var6 = Geoblox.field_C;
        var2 = this.field_o - 320.0f;
        var3 = this.field_v - 240.0f;
        var4 = (int)((double)var2 * Math.cos((double)el.field_o.field_J) - (double)var3 * Math.sin((double)el.field_o.field_J) + 320.0);
        if (param0 != -16096) {
          return;
        }
        var5 = (int)(Math.sin((double)el.field_o.field_J) * (double)var2 + (double)var3 * Math.cos((double)el.field_o.field_J) + 240.0);
        if ((this.field_z != 2) &&
            (1 != this.field_z)) {
          vf.field_L.e();
          vb.c();
          this.field_J.c(-this.field_J.field_s + vf.field_L.field_s >> 1, vf.field_L.field_o - this.field_J.field_o >> 1);
          k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
          sh.field_y.a(param0 + 16351);
          vf.field_L.a(vf.field_L.field_s << 3, vf.field_L.field_o << 3, var4 << 4, var5 << 4, (int)(65535.0 * ((double)(-el.field_o.field_J + this.field_u) / 6.283185307179586)), 4096);
        } else {
          if (1 == this.field_z) {
            vf.field_L.e();
            vb.c();
            this.field_J.b(-this.field_J.field_s + vf.field_L.field_s >> 1, vf.field_L.field_o - this.field_J.field_o >> 1, this.field_q);
            k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
            sh.field_y.a(param0 + 16351);
            vf.field_L.a(vf.field_L.field_s << 3, vf.field_L.field_o << 3, var4 << 4, var5 << 4, (int)(65535.0 * ((double)(-el.field_o.field_J + this.field_u) / 6.283185307179586)), 4096);
          } else {
            this.field_J.b(-(this.field_J.field_s >> 1) + var4, var5 - (this.field_J.field_o >> 1));
          }
        }
    }

    final void k(int param0) {
        vf.field_L.e();
        vb.c();
        this.field_J.a(this.field_J.field_s << 3, this.field_J.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)(65535.0 * ((double)this.field_u / 6.283185307179586)), 4096);
        bk.field_a.e();
        vf.field_L.a(-(vf.field_L.field_s / 2) + (int)this.field_o, (int)this.field_v - vf.field_L.field_o / param0, this.field_H + 1);
        sh.field_y.a(255);
        bk.field_a.e();
        i.field_a.a(320 + el.field_o.field_w, 240 + el.field_o.field_u, 16777215);
        sh.field_y.a(param0 + 253);
    }

    final void n(int param0) {
        float var2;
        float var3;
        float var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var11 = Geoblox.field_C;
        var2 = this.field_o - 320.0f;
        var3 = this.field_v - 240.0f;
        var4 = el.field_o.field_J;
        var5 = (int)(320.0 + ((double)var2 * Math.cos((double)var4) - Math.sin((double)var4) * (double)var3));
        var6 = (int)(240.0 + ((double)var2 * Math.sin((double)var4) + Math.cos((double)var4) * (double)var3));
        if ((this.field_z != 1) &&
            (2 != this.field_z)) {
          vf.field_L.e();
          vb.c();
          this.field_J.a(this.field_J.field_s << 3, this.field_J.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)(((double)this.field_u - (double)var4 / 6.283185307179586) * 65535.0), 4096);
        } else {
          if (this.field_z != 1) {
            vf.field_L.e();
            vb.c();
            this.field_J.b(-(this.field_J.field_s >> 1) + (vf.field_L.field_s >> 1), (vf.field_L.field_o >> 1) - (this.field_J.field_o >> 1));
          } else {
            wl.field_a.e();
            vb.c();
            this.field_J.b(-this.field_J.field_s + wl.field_a.field_s >> 1, -this.field_J.field_o + wl.field_a.field_o >> 1, this.field_q);
            vf.field_L.e();
            vb.c();
            wl.field_a.a(wl.field_a.field_s << 3, wl.field_a.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)(65535.0 * (-((double)var4 / 6.283185307179586) + (double)this.field_u)), 4096);
          }
        }
        var7 = 2 % ((-23 - param0) / 60);
        sh.field_y.a(255);
        var8 = var5 - (vf.field_L.field_s >> 1);
        var9 = var6 - (vf.field_L.field_o >> 1);
        var10 = (int)(0.5 + Math.sin((double)(this.field_r - this.field_p + this.field_p >> 4)) * (double)(100 * (this.field_p - this.field_r)) / (double)this.field_p) - (-(100 * (this.field_p - this.field_r) / this.field_p) - 56);
        if (var10 > 256) {
          var10 = 256;
        } else {
          if (var10 < 0) {
            var10 = 0;
          }
        }
        vf.field_L.d(var8, var9, var10);
    }

    final static void h(int param0) {
        af.field_c = 0;
        ul.field_a = null;
        gg.field_b = 0;
        g.field_j = 0;
        pa.field_g = 0;
        jf.field_j = 0;
        uf.field_b = param0;
        ha.field_g = 0;
        rj.field_c = 5167632;
        ka.field_h = 0;
        gi.field_e = 0;
        nd.field_a = 0;
        wa.field_a = 0;
    }

    public static void e(byte param0) {
        field_A = null;
        field_D = null;
        int var1 = 106 % ((33 - param0) / 39);
    }

    private final void m(int param0) {
        int var2 = -121 % ((-63 - param0) / 39);
        this.field_s = -(jg.field_h[c.field_ab][this.field_G] >> 16 & 255) + (255 & jg.field_h[c.field_ab][(this.field_G + 1) % 7] >> 16);
        this.field_x = -(jg.field_h[c.field_ab][this.field_G] >> 8 & 255) + ((jg.field_h[c.field_ab][(1 + this.field_G) % 7] & 65448) >> 8);
        this.field_y = -(jg.field_h[c.field_ab][this.field_G] & 255) + (jg.field_h[c.field_ab][(1 + this.field_G) % 7] & 255);
    }

    final void f(int param0) {
        int incrementValue$0 = 0;
        int var9 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var10;
        int[] var14;
        var10 = Geoblox.field_C;
        var2 = (int)this.field_o - ((vf.field_L.field_s >> 1) + 4);
        var3 = -4 - (vf.field_L.field_o >> 1) + (int)this.field_v;
        var4 = 8 + vf.field_L.field_s;
        var5 = 8 + vf.field_L.field_o;
        if (var2 < 0) {
          var4 = var4 + var2;
          var2 = 0;
        }
        if (var3 < 0) {
          var5 = var5 + var3;
          var3 = 0;
        }
        if (bk.field_a.field_r < var4 + var2) {
          var4 = -var2 + bk.field_a.field_r;
        }
        if (var5 + var3 > bk.field_a.field_m) {
          var5 = bk.field_a.field_m - var3;
        }
        if (param0 < 78) {
          return;
        }
        var6 = var2 + bk.field_a.field_r * var3;
        var7 = -var4 + bk.field_a.field_r;
        var14 = bk.field_a.field_v;
        while (true) {
          incrementValue$0 = var5;
          var5--;
          if (incrementValue$0 <= 0) {
            return;
          }
          for (var9 = -var4; var9 < 0; var9++) {
            if (~var14[var6] != ~(this.field_H + 1)) {
              var6++;
              continue;
            }
            var14[var6] = 0;
            var6++;
          }
          var6 = var6 + var7;
          continue;
        }
    }

    final void a(float param0, int param1) {
        double var5 = 0.0;
        if (param1 > -79) {
            this.a(0.2609390318393707f, 75);
        }
        float var3 = this.field_o - 320.0f;
        float var4 = this.field_v - 240.0f;
        this.field_o = (float)((double)var3 * Math.cos((double)param0) - Math.sin((double)param0) * (double)var4) + 320.0f;
        this.field_v = (float)(Math.sin((double)param0) * (double)var3 + (double)var4 * Math.cos((double)param0)) + 240.0f;
        this.field_F = 240.0f - this.field_v;
        this.field_w = 320.0f - this.field_o;
        if (this.field_w * this.field_w + this.field_F * this.field_F > og.field_r * og.field_r) {
            var5 = (double)og.field_r / Math.sqrt((double)(this.field_w * this.field_w + this.field_F * this.field_F));
            this.field_w = (float)((double)this.field_w * var5);
            this.field_F = (float)((double)this.field_F * var5);
        }
        if ((this.field_z != 2)) {
            this.field_u = this.field_u - param0;
        }
    }

    private final void g(byte param0) {
        int var3;
        var3 = Geoblox.field_C;
        if (param0 < 83) {
          this.g(18);
        }
        if (0 == this.field_z) {
          this.field_J = ke.field_a[c.field_ab][this.field_C][this.field_M];
        } else {
          if (this.field_z == 4) {
            this.field_M = -1;
            this.field_J = fc.field_g[0];
            this.field_C = -1;
          } else {
            if (this.field_z == 3) {
              this.field_C = -1;
              this.field_M = -1;
              this.field_J = hb.field_d[0];
            } else {
              if (1 == this.field_z) {
                this.field_J = s.field_G[c.field_ab][this.field_C];
                this.field_M = -1;
                this.field_q = jg.field_h[c.field_ab][this.field_G];
                this.m(53);
              } else {
                if (2 != this.field_z) {
                  if (8 == this.field_z) {
                    this.field_J = ej.field_a[this.field_G];
                    this.field_C = -1;
                  }
                } else {
                  this.field_J = ka.field_m[c.field_ab][this.field_M][this.field_G];
                  this.field_C = -1;
                }
              }
            }
          }
        }
    }

    final void h(byte param0) {
        vf.field_L.e();
        vb.c();
        this.field_J.a(this.field_J.field_s << 3, this.field_J.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)((double)(this.field_u - el.field_o.field_J) / 6.283185307179586 * 65535.0), 4096);
        if (param0 <= 46) {
            this.field_y = 17;
        }
        vf.field_L.g(this.field_H + 1);
        wd.field_b.e();
        vf.field_L.a(-wd.field_a - (vf.field_L.field_s >> 1) + ng.field_G, -(vf.field_L.field_o >> 1) + (td.field_E - wd.field_d), 1 + this.field_H);
        sh.field_y.a(255);
    }

    final void f(byte param0) {
        this.field_o = this.field_o + this.field_w;
        this.field_v = this.field_v + this.field_F;
        if (param0 != -59) {
            this.field_m = -29;
        }
    }

    private final void i(int param0) {
        this.field_K = null;
        this.field_I = 0;
        this.field_t = false;
        this.field_G = 0;
        this.g((byte) 99);
        this.field_B = false;
        this.field_E = 0;
        int var2 = 62 % ((param0 - 67) / 32);
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (((param1 & 7) != 0)) {
            var2 = -(param1 & 7) + 8;
        }
        if (param0 != 1221916132) {
            return 89;
        }
        int var3 = var2 + param1;
        return var3;
    }

    final void b(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        float var2;
        int var3;
        var3 = Geoblox.field_C;
        this.field_I = this.field_I + 1;
        this.field_r = this.field_r - 1;
        if (!param0) {
          this.field_v = -0.09870309382677078f;
        }
        if (this.field_z != 5) {
          if (this.field_z != 1) {
            if (this.field_z == 2) {
              if (this.field_I % 24 == 0) {
                fieldTemp$0 = this.field_G;
                this.field_G = this.field_G + 1;
                this.field_J = ka.field_m[c.field_ab][this.field_M][fieldTemp$0];
                this.field_G = this.field_G % 4;
              }
            } else {
              if ((8 == this.field_z) &&
                  (this.field_I % 24 == 0)) {
                fieldTemp$1 = this.field_G;
                this.field_G = this.field_G + 1;
                this.field_J = ej.field_a[fieldTemp$1];
                this.field_G = this.field_G % 4;
              }
            }
          } else {
            var2 = 0.019999999552965164f * (float)(this.field_I % 50);
            this.field_q = (int)((float)this.field_y * var2) + jg.field_h[c.field_ab][this.field_G] + (((int)(var2 * (float)this.field_s) << 16) + ((int)((float)this.field_x * var2) << 8));
            if (this.field_I % 50 == 49) {
              this.field_G = this.field_G + 1;
              this.field_G = this.field_G % 7;
              this.m(-107);
            }
          }
        } else {
          if (this.field_I % 20 == 0) {
            fieldTemp$2 = this.field_G;
            this.field_G = this.field_G + 1;
            this.field_J = mi.field_B[fieldTemp$2];
            this.field_G = this.field_G % 4;
          }
        }
        if (this.field_z != 4) {
          if (7 != this.field_z) {
            if (this.field_z != 3) {
              if (this.field_z == 6) {
                this.field_r = this.field_r - 1;
                if ((this.field_r < 0) &&
                    (this.field_I % 24 == 0) &&
                    (4 > this.field_G)) {
                  fieldTemp$3 = this.field_G;
                  this.field_G = this.field_G + 1;
                  this.field_J = vj.field_a[fieldTemp$3];
                }
              }
            } else {
              if ((this.field_I & 255) >= 49) {
                this.field_G = 0;
              } else {
                if ((this.field_I & 15) == 0) {
                  fieldTemp$4 = this.field_G;
                  this.field_G = this.field_G + 1;
                  this.field_J = hb.field_d[fieldTemp$4];
                  if (this.field_G == 4) {
                    this.field_G = 0;
                  }
                }
              }
            }
          } else {
            if (this.field_I % 20 == 0) {
              fieldTemp$5 = this.field_G;
              this.field_G = this.field_G + 1;
              this.field_J = hg.field_b[fieldTemp$5];
              this.field_G = this.field_G % 4;
            }
          }
        } else {
          if ((255 & this.field_I) < 49) {
            if ((15 & this.field_I) == 0) {
              fieldTemp$6 = this.field_G;
              this.field_G = this.field_G + 1;
              this.field_J = fc.field_g[fieldTemp$6];
              if (this.field_G == 4) {
                this.field_G = 0;
              }
            }
          } else {
            this.field_G = 0;
          }
        }
    }

    final void a(ja param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          for (var3_int = param1; var3_int < this.field_L; var3_int++) {
            if (this.field_n[var3_int] != param0) {
              continue;
            }
            this.field_n[var3_int] = null;
            if (this.field_M == param0.field_M) {
              this.field_m = this.field_m - 1;
            }
            this.field_L = this.field_L - 1;
            if (param0.field_C == this.field_C) {
              this.field_N = this.field_N - 1;
            }
            if (5 > var3_int) {
              sf.a(this.field_n, 1 + var3_int, this.field_n, var3_int, this.field_L - var3_int);
            }
            this.field_n[this.field_L] = null;
            break;
          }
          if ((this.field_m <= this.field_L) &&
              (this.field_L >= this.field_N)) {
            return;
          }
          throw new IllegalStateException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ja.HA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final void j(int param0) {
        int incrementValue$0 = 0;
        int var13 = 0;
        float var2;
        float var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var14;
        int[] var18;
        var14 = Geoblox.field_C;
        var2 = -320.0f + this.field_o;
        var3 = -240.0f + this.field_v;
        var4 = (int)(Math.cos((double)el.field_o.field_J) * (double)var2 - (double)var3 * Math.sin((double)el.field_o.field_J) + 320.0);
        var5 = (int)((double)var2 * Math.sin((double)el.field_o.field_J) + Math.cos((double)el.field_o.field_J) * (double)var3 + 240.0);
        var6 = -(vf.field_L.field_s / 2) + (var4 - 4 - wd.field_a);
        var7 = -wd.field_d - 4 + (var5 - vf.field_L.field_o / 2);
        var8 = vf.field_L.field_s + 8;
        if (var6 < 0) {
          var8 = var8 + var6;
          var6 = 0;
        }
        var9 = 8 + vf.field_L.field_o;
        if (wd.field_b.field_r < var6 + var8) {
          var8 = -var6 + wd.field_b.field_r;
        }
        if (var7 < 0) {
          var9 = var9 + var7;
          var7 = 0;
        }
        if (var7 + var9 > wd.field_b.field_m) {
          var9 = wd.field_b.field_m - var7;
        }
        var10 = wd.field_b.field_r * var7 + var6;
        if (param0 != 30383) {
          this.field_C = -47;
        }
        var11 = -var8 + wd.field_b.field_r;
        var18 = wd.field_b.field_v;
        while (true) {
          incrementValue$0 = var9;
          var9--;
          if (0 >= incrementValue$0) {
            return;
          }
          for (var13 = -var8; 0 > var13; var13++) {
            if (~(this.field_H + 1) != ~var18[var10]) {
              var10++;
              continue;
            }
            var18[var10] = 0;
            var10++;
          }
          var10 = var10 + var11;
          continue;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 != 320) {
            this.field_u = -1.9950387477874756f;
        }
        if ((this.field_z == 2)) {
            this.field_E = 60;
        }
        this.field_M = param2;
        this.field_z = param3;
        this.field_C = param1;
        this.g((byte) 84);
    }

    final void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, float param8, int param9, float param10) {
        this.field_r = param5;
        this.field_p = param5;
        this.field_o = param1;
        this.field_C = param9;
        this.field_v = param7;
        this.field_M = param4;
        this.field_F = param8;
        this.field_z = param2;
        this.field_w = param3;
        double var12 = (double)og.field_r / Math.sqrt((double)(param3 * param3 + param8 * param8));
        this.field_w = (float)((double)this.field_w * var12);
        this.field_F = (float)((double)this.field_F * var12);
        int var14 = -96 / ((param0 + 19) / 53);
        this.field_u = 0.0f;
        this.field_N = 0;
        this.field_m = 0;
        this.field_L = 0;
        this.i(103);
    }

    final static void a(boolean param0, kl param1) {
        try {
            qa.field_f.a(-74, new je(param1, param1));
            ge.field_d.a(param1);
            if (param0) {
                kl var3 = (kl) null;
                ja.a(false, (kl) null);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ja.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void e(int param0) {
        if (param0 != 1643839728) {
            this.field_H = -123;
        }
        if (this.field_z == 1) {
            vf.field_L.e();
            vb.c();
            this.field_J.b(vf.field_L.field_s - this.field_J.field_s >> 1, -this.field_J.field_o + vf.field_L.field_o >> 1, this.field_q);
            oc.field_d.e();
            vf.field_L.a(vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)this.field_o << 4, (int)this.field_v << 4, (int)((double)this.field_u / 6.283185307179586 * 65535.0), 4096);
        } else {
            oc.field_d.e();
            this.field_J.a(this.field_J.field_s << 3, this.field_J.field_o << 3, (int)this.field_o << 4, (int)this.field_v << 4, (int)((double)this.field_u / 6.283185307179586 * 65535.0), 4096);
        }
    }

    final void l(int param0) {
        if (param0 != 1915952803) {
            ja var3 = (ja) null;
            this.a((ja) null, -128);
        }
        this.field_J.a(this.field_J.field_s << 3, this.field_J.field_o << 3, (int)this.field_o << 4, (int)this.field_v << 4, (int)((double)this.field_u / 6.283185307179586 * 65535.0), 4096);
    }

    ja(int param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        this.field_n = new ja[6];
        this.field_q = 0;
        this.field_L = 0;
        this.field_K = null;
        this.field_I = 0;
        this.field_m = 0;
        this.field_u = 0.0f;
        this.field_G = 0;
        this.field_N = 0;
        this.field_v = param4;
        this.field_H = param9;
        this.field_w = param5;
        this.field_M = param0;
        this.field_F = param6;
        this.field_C = param1;
        this.field_z = param2;
        this.field_o = param3;
        this.i(99);
    }

    static {
        field_A = new tf();
    }
}
