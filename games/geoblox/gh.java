/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    float field_J;
    boolean field_B;
    boolean field_Y;
    private StringBuilder field_X;
    int field_w;
    int field_u;
    private boolean field_R;
    private boolean field_Q;
    boolean field_C;
    private boolean field_j;
    int field_T;
    boolean field_N;
    private int field_a;
    int field_q;
    static volatile int field_P;
    private boolean field_V;
    private int field_r;
    boolean field_K;
    int field_v;
    private int field_U;
    int field_o;
    private boolean field_s;
    private int field_k;
    boolean field_x;
    private boolean field_d;
    private boolean field_f;
    int field_y;
    private int field_G;
    private boolean field_b;
    private int field_t;
    static int[] field_m;
    private Geoblox field_I;
    private int field_p;
    static String field_z;
    private boolean field_h;
    private boolean field_i;
    private int field_l;
    private int field_A;
    private StringBuilder field_g;
    private int field_W;
    private int field_ab;
    boolean field_H;
    private int field_D;
    private boolean field_E;
    private boolean field_n;
    private boolean field_L;
    boolean field_F;
    private kl field_M;
    int field_e;
    private int field_S;
    private boolean field_Z;
    private int field_c;
    int field_bb;

    private final void c(int param0) {
        this.field_Y = false;
        this.field_H = true;
        if (param0 != 7000) {
            this.field_R = true;
        }
        this.field_f = false;
        this.field_C = false;
    }

    private final void g(int param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = Geoblox.field_C;
        if (0 != this.field_t) {
          return;
        }
        L0: {
          var8 = uk.a(this.field_p, 24146);
          var3 = fi.field_d.field_o - fi.field_d.field_q + param0;
          var4 = 460;
          var5 = 30 + fi.field_d.b(var8, var4) * var3;
          var6 = 300;
          if (this.field_p == 0) {
            var6 = 232;
            if (var7 == 0) {
              break L0;
            }
          }
          if (this.field_p != 3) {
            if (1 == this.field_p) {
              var6 = 280;
              if (var7 != 0) {
                var6 = 270;
              }
            }
          } else {
            var6 = 270;
          }
        }
        L3: {
          ma.a(var6, 70, 10 + var5, (byte) -92, 500, ll.field_h);
          fi.field_d.a(var8, 95, 15 + var6, var4, 300, 1, -1, 0, 0, var3);
          if (this.field_p == 5) {
            if (qa.field_a > 100 &&
                qa.field_a < 340 &&
                ue.field_e > 440 &&
                ue.field_e < 476) {
              dd.field_G.field_K[0][wf.field_p] = 15488514;
            }
            ma.a(440, 100, 36, (byte) -92, 240, eb.field_g);
            dd.field_G.b(cf.field_j, 220, 468, 0, -1);
            dd.field_G.field_K[0][wf.field_p] = 16689938;
            ma.a(440, 380, 36, (byte) -92, 160, eb.field_g);
            if (380 < qa.field_a &&
                540 > qa.field_a &&
                ue.field_e > 440 &&
                476 > ue.field_e) {
              dd.field_G.field_K[0][wf.field_p] = 15488514;
            }
            dd.field_G.b(nk.field_g, var4, 468, 0, -1);
            dd.field_G.field_K[0][wf.field_p] = 16689938;
            if (var7 == 0) {
              break L3;
            }
          }
          ma.a(440, 240, 36, (byte) -92, 160, eb.field_g);
          if (250 < qa.field_a &&
              qa.field_a < 389 &&
              ue.field_e > 440 &&
              476 > ue.field_e) {
            dd.field_G.field_K[0][wf.field_p] = 15488514;
          }
          dd.field_G.b(mi.field_y, 320, 468, 0, -1);
          dd.field_G.field_K[0][wf.field_p] = 16689938;
        }
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          try {
            if (!d.field_b.startsWith("win")) {
              return false;
            }
            if (param1) {
              return true;
            }
            if (!param0.startsWith("http://") &&
                !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (true) {
              if (!(param0.length() > var3)) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                stackIn_20_0 = 1;
                break;
              }
              stackIn_20_0 = var2.indexOf((int) param0.charAt(var3));
              if (var4 == 0) {
                if (stackIn_20_0 == -1) {
                  return false;
                }
                var3++;
                continue;
              }
              break;
            }
            return stackIn_20_0 != 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("gh.U(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        int stackIn_49_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        String var2_ref_String = null;
        int var2 = 0;
        int var3 = 0;
        String var3_ref_String = null;
        int var4 = 0;
        float var5_float = 0.0f;
        int var5 = 0;
        float var6_float = 0.0f;
        int var6 = 0;
        float var7_float = 0.0f;
        int var7_int = 0;
        tf var7 = null;
        int var8 = 0;
        ja var8_ref_ja = null;
        float var9_float = 0.0f;
        int var9 = 0;
        float var10_float = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        tf var15 = null;
        tf var16 = null;
        var14 = Geoblox.field_C;
        if (!ll.field_g[c.field_ab]) {
          var3 = c.field_ab;
          switch ((var14 == 0
              || var3 == 0
              || var3 == 2
            ) ? var3 : -1) {
            case 4:
              var2_ref_String = "baking";
              if (var14 == 0) {
                break;
              }
            case 6:
              var2_ref_String = "space";
              if (var14 == 0) {
                break;
              }
            case 5:
              var2_ref_String = "sports";
              if (var14 == 0) {
                break;
              }
            case 0:
              var2_ref_String = "jewels";
              if (var14 == 0) {
                break;
              }
            case 3:
              var2_ref_String = "germs";
              if (var14 == 0) {
                break;
              }
            case 2:
              var2_ref_String = "sweets";
              if (var14 == 0) {
                break;
              }
            default:
              var2_ref_String = "";
          }
          var3_ref_String = gf.a(ff.field_l, ll.field_f, var2_ref_String, wi.field_F, true);
          var4 = 30 + dd.field_G.a(var3_ref_String);
          ma.a(215, 320 - var4 / 2, 50, (byte) -92, var4, ll.field_h);
          dd.field_G.b(var3_ref_String, 320, 250, 0, -1);
          return;
        }
        if (ih.a(0) &&
            this.field_H &&
            this.field_i) {
          stackIn_49_0 = 1;
        } else {
          stackIn_49_0 = 0;
        }
        L13: {
          var2 = stackIn_49_0;
          if (var2 == 0) {
            if (!this.field_F) {
              oc.field_d.e();
              if (this.field_V) {
                break L13;
              }
              gj.f((byte) -63);
              if (var14 == 0) {
                break L13;
              }
            }
            oc.field_d.e();
            vb.c();
            if (!this.field_V) {
              dc.a(7838);
            }
            k.a(10, 90, 460, -27085, 460);
            this.field_F = false;
          }
        }
        sh.field_y.a(255);
        mf.field_a.b(0, 0);
        var3 = 4;
        var4 = 4;
        if (param0 >= -28) {
          this.a(-63);
        }
        if (this.field_L) {
          if (this.field_D <= 266) {
            var5_float = (float)this.field_D / 266.0f;
            var6_float = -var5_float + 1.0f;
            var7_float = var6_float * var6_float;
            var3 = (int)(0.5f + (70.0f * (2.0f * var5_float * var6_float) + 10.0f * var7_float + 220.0f * (var5_float * var5_float)));
            var4 = (int)(170.0f * (var5_float * var5_float) + (var7_float * 10.0f + 140.0f * (var5_float * 2.0f * var6_float)) + 0.5f);
            if (var14 != 0) {
              var3 = 220;
              var4 = 170;
            }
          } else {
            var3 = 220;
            var4 = 170;
          }
        }
        L19: {
          if (this.field_Y) {
            var5 = 176 - this.field_v / 2;
            if (10 > var5) {
              var5 = 10;
            }
            var6 = -fi.field_d.field_q + fi.field_d.field_o;
            var7_int = fi.field_d.c(v.field_n, 640) + 40;
            var8 = fi.field_d.b(v.field_n, 640) * var6 + 10;
            ma.a(var5, -(var7_int / 2) + 320, 20 + var8, (byte) -92, var7_int, ll.field_h);
            fi.field_d.b(v.field_n, 320, var5 + 28, 1, -1);
            fi.field_d.b(v.field_n, 319, 28 + var5, 1, -1);
            if (var14 == 0) {
              break L19;
            }
          }
          lj.field_d.b(var3, var4);
          if (0 != this.field_bb ||
              ih.a(0)) {
            vh.field_G.b(446, 410);
            if (var14 != 0) {
              g.field_i.b(468, 410);
            }
          } else {
            g.field_i.b(468, 410);
          }
        }
        if (!this.field_Y) {
          if (!ih.a(0) ||
              var2 != 0 &&
                (0 == this.field_bb ||
                this.field_bb == 1)) {
            this.e(-46);
          }
        }
        if (!this.field_V) {
          h.c(-1);
        }
        if (!this.field_V &&
            var2 == 0) {
          oc.field_d.b(0, 0);
        }
        ij.h((byte) 18);
        if (!this.field_V) {
          ni.f(484842465);
        }
        jf.field_a.e();
        vb.c();
        ec.field_c.b(ec.field_c.field_s << 3, ec.field_c.field_o << 3, jf.field_a.field_s << 3, jf.field_a.field_o << 3, (int)(65535.0 * ((double)(-this.field_J) / 6.283185307179586)), 4096);
        sh.field_y.a(255);
        w.a(jf.field_a, -(jf.field_a.field_s >> 1) + 320, -(jf.field_a.field_o >> 1) + 240);
        if (!this.field_V) {
          uh.d(4740);
        }
        if (this.field_s) {
          af.field_a.e();
          vb.a(0, 0, vb.field_f, vb.field_b, 1118481);
          var5 = 16777215;
          vb.f(160, 120, 115, 16711680);
          var6 = 20;
          var15 = wd.field_e;
          var8_ref_ja = (ja) ((Object) var15.a(false));
          while (true) {
            if (var8_ref_ja != null) {
              var9_float = -320.0f + var8_ref_ja.field_o;
              var10_float = -240.0f + var8_ref_ja.field_v;
              var11 = (int)(320.0 + (Math.cos((double)el.field_o.field_J) * (double)var9_float - Math.sin((double)el.field_o.field_J) * (double)var10_float));
              var12 = (int)(240.0 + ((double)var9_float * Math.sin((double)el.field_o.field_J) + (double)var10_float * Math.cos((double)el.field_o.field_J)));
              var13 = 255 - var8_ref_ja.field_r * 255 / var8_ref_ja.field_p;
              stackIn_168_0 = 11;
              stackIn_168_1 = var13;
              if (var14 == 0) {
                if (stackIn_168_0 > stackIn_168_1) {
                  var13 = 11;
                }
                if (var13 > 255) {
                  var13 = 255;
                }
                vb.d(var11 / 2, var12 / 2, var6, var13 << 8 | var13 << 16 | var13);
                var8_ref_ja = (ja) ((Object) var15.b(0));
                continue;
              }
            } else {
              var16 = ji.field_r;
              var7 = var16;
              var8_ref_ja = (ja) ((Object) var16.g(0));
              do {
                if (null == var8_ref_ja) {
                  var7 = a.field_d;
                  break;
                }
                var9_float = -320.0f + var8_ref_ja.field_o;
                var10_float = -240.0f + var8_ref_ja.field_v;
                var11 = (int)(Math.cos((double)el.field_o.field_J) * (double)var9_float - Math.sin((double)el.field_o.field_J) * (double)var10_float + 320.0);
                var12 = (int)(240.0 + ((double)var9_float * Math.sin((double)el.field_o.field_J) + (double)var10_float * Math.cos((double)el.field_o.field_J)));
                vb.d(var11 / 2, var12 / 2, var6, var5);
                var8_ref_ja = (ja) ((Object) var16.d(1));
              } while (var14 == 0);
              var8_ref_ja = (ja) ((Object) var7.g(0));
              do {
                if (var8_ref_ja == null) {
                  var7 = bh.field_c;
                  break;
                }
                vb.d((int)(var8_ref_ja.field_o / 2.0f), (int)(var8_ref_ja.field_v / 2.0f), var6, var5);
                var8_ref_ja = (ja) ((Object) var7.d(1));
              } while (var14 == 0);
              var8_ref_ja = (ja) ((Object) var7.g(0));
              L43: while (true) {
                if (var8_ref_ja != null) {
                  vb.d((int)(var8_ref_ja.field_o / 2.0f), (int)(var8_ref_ja.field_v / 2.0f), var6, var5);
                  var8_ref_ja = (ja) ((Object) var7.d(1));
                  if (var14 == 0) {
                    continue;
                  }
                } else {
                  if (this.field_Y) {
                    var8 = -(this.field_v / 2) + 176;
                    if (var8 < 10) {
                      var8 = 10;
                    }
                    var9 = fi.field_d.field_o - fi.field_d.field_q;
                    var10 = fi.field_d.c(v.field_n, 640) + 40;
                    var11 = fi.field_d.b(v.field_n, 640) * var9 + 10;
                    vb.a((320 - var10 / 2) / 2, var8 / 2, var10 / 2, (20 + var11) / 2, var5);
                    break L43;
                  }
                  lj.field_d.a(var3 / 2, var4 / 2, lj.field_d.field_s / 2, lj.field_d.field_o / 2, var5);
                }
                if (this.field_bb == 0 &&
                    !ih.a(0)) {
                  g.field_i.a(234, 205, g.field_i.field_s / 2, g.field_i.field_o / 2, var5);
                  if (var14 == 0) {
                    break L43;
                  }
                }
                vh.field_G.a(223, 205, vh.field_G.field_s / 2, vh.field_G.field_o / 2, var5);
                break;
              }
              vb.d(160, 120, 21, 16777215);
              vb.e(2, 2, 0, 0, vb.field_f, vb.field_b);
              sh.field_y.a(255);
              stackIn_168_0 = vb.field_b;
              stackIn_168_1 = 1;
            }
            break;
          }
          ek.a(stackIn_168_0, stackIn_168_1 != 0, af.field_a, 0, vb.field_f, 0);
        }
        if (!this.field_Y) {
          if (this.field_a > 0) {
            lj.field_d.b(-(lj.field_d.field_s >> 1) + 320, 60 - (lj.field_d.field_o >> 1) + 240);
            dd.field_G.b(wl.field_b, 320, 310, 0, -1);
          }
          eg.field_q[this.field_l].b(this.field_T, 4);
          if (640 > this.field_T &&
              0 < this.field_A) {
            dd.field_G.a(wj.a(ic.field_a, new String[]{this.field_g.toString()}, (byte) -79), this.field_T + 20, 34, 0, -1);
          }
          if (this.field_h) {
            dd.field_G.a(wj.a(sh.field_z, new String[]{Integer.toString(ec.field_b)}, (byte) -26), 400, 50, 0, -1);
            dd.field_G.a(wj.a(qg.field_e, new String[]{Integer.toString(ji.field_h)}, (byte) -71), 400, 80, 0, -1);
          }
          L53: {
            bd.a(-117);
            this.c((byte) 64);
            if (this.field_L) {
              lj.field_d.b(var3, var4);
              if (this.field_D < 266) {
                kh.field_h[6].b(0, (this.field_D >> 1) - 113);
                if (var14 == 0) {
                  break L53;
                }
              }
              kh.field_h[6].b(0, 20);
              kh.field_h[6].c(0, 20, (int)(Math.cos((double)(-266 + this.field_D) / 40.0) * -64.0 + 64.0));
            }
          }
          dd.field_G.a(wj.a(pa.field_a, new String[]{this.field_X.toString()}, (byte) -53), 15 + var3, 30 + var4, 0, -1);
          if (ih.a(0)) {
            if (0 == this.field_bb ||
                  this.field_bb == 1) {
              if (var2 != 0) {
                var5 = 35 + (6 * this.field_D - 480);
                sh.field_y.a(255);
                vb.e(0, var5, 640, 480);
                oc.field_d.b(0, 0);
                vb.e(0, 0, 640, 480);
                qj.field_c.b(0, -480 + 6 * this.field_D);
                if (var14 != 0) {
                  this.a(false);
                }
              }
            } else {
              this.a(false);
            }
          }
          vc.c(-1);
          if (var14 != 0) {
            this.g(2);
          }
        } else {
          this.g(2);
        }
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_233_0 = false;
        boolean stackIn_252_1 = false;
        boolean stackIn_304_1 = false;
        boolean stackIn_359_1 = false;
        boolean stackIn_388_1 = false;
        boolean stackIn_408_1 = false;
        boolean stackIn_416_1 = false;
        boolean stackIn_455_1 = false;
        int stackIn_464_0 = 0;
        int stackIn_464_1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        ja var4 = null;
        int var5 = 0;
        var5 = Geoblox.field_C;
        lh.a(param0 ^ 1578896222);
        fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        if ((fieldTemp$0 & 15) == 0) {
          this.field_l = this.field_l + this.field_k;
          if (7 != this.field_l) {
            if (this.field_l == 0) {
              this.field_k = 1;
              if (var5 != 0) {
                this.field_k = -1;
              }
            }
          } else {
            this.field_k = -1;
          }
        }
        L2: {
          if (0 == (this.field_v & 1)) {
            if (-1 != this.field_y ||
                  463 >= this.field_T) {
              if (this.field_y != 1 ||
                    this.field_T >= 640) {
                if (this.field_T != 463) {
                  break L2;
                }
                if (gf.field_f != 0) {
                  break L2;
                }
                this.field_y = 1;
                el.field_o.c(false);
                if (!(var5 == 0)) {
                  this.field_T = this.field_T + 1;
                  if (var5 != 0) {
                    this.field_T = this.field_T - 1;
                  }
                }
              } else {
                this.field_T = this.field_T + 1;
                if (var5 != 0) {
                  this.field_T = this.field_T - 1;
                }
              }
            } else {
              this.field_T = this.field_T - 1;
            }
          }
        }
        L7: {
          if (!this.field_x) {
            if ((ih.a(0) &&
                    !this.field_n ||
                  !this.field_f) &&
                this.b(true)) {
              if (0 == this.field_bb ||
                    this.field_bb == 5) {
                if (!this.field_H) {
                  break L7;
                }
                this.b((byte) -80);
                if (var5 == 0) {
                  break L7;
                }
              }
              this.f(10);
              if (var5 == 0) {
                break L7;
              }
            }
            if (!ll.field_g[c.field_ab]) {
              return;
            }
            if (!this.field_E && var5 == 0) {
              var2 = 96;
              var3 = 97;
            } else {
              var3 = 96;
              var2 = 97;
            }
            if (kj.field_o[var2]) {
              this.field_J = this.field_J - rc.field_h;
              me.a((byte) 38);
              var4_int = (ki.field_d + kd.field_c + qa.field_a + he.field_d) % 8;
              switch (var4_int) {
                case 0:
                  oa.field_a = oa.field_a + kb.field_d;
                  gb.field_g = gb.field_g - 1;
                  break;
                case 1:
                  oa.field_a = oa.field_a + gb.field_g;
                  kb.field_d = kb.field_d - 1;
                  break;
                case 3:
                  oa.field_a = oa.field_a - gb.field_g;
                  kb.field_d = kb.field_d + 1;
                  break;
                case 4:
                  ml.field_r = ml.field_r + kb.field_d;
                  gb.field_g = gb.field_g + 1;
                  break;
                case 5:
                  kb.field_d = kb.field_d + 1;
                  ml.field_r = ml.field_r + gb.field_g;
                  break;
                case 6:
                  ml.field_r = ml.field_r - kb.field_d;
                  gb.field_g = gb.field_g - 1;
                default:
                  break;
                case 7:
                  kb.field_d = kb.field_d - 1;
                  ml.field_r = ml.field_r - gb.field_g;
                  if (var5 == 0) {
                    break;
                  }
                case 2:
                  gb.field_g = gb.field_g + 1;
                  oa.field_a = oa.field_a - kb.field_d;
                  break;
              }
              var4_int = (kd.field_c + he.field_d + qa.field_a + ki.field_d) % 5;
              switch (var4_int) {
                case 0:
                  dc.field_a = dc.field_a | lb.field_b + el.field_g << 17;
                  break;
                case 3:
                  sc.field_f = sc.field_f + 1;
                  el.field_g = el.field_g + lb.field_b;
                default:
                  break;
                case 4:
                  sc.field_f = sc.field_f - 1;
                  el.field_g = el.field_g - lb.field_b;
                  if (var5 == 0) {
                    break;
                  }
                case 2:
                  lb.field_b = lb.field_b - 1;
                  el.field_g = el.field_g - sc.field_f;
                  if (var5 == 0) {
                    break;
                  }
                case 1:
                  el.field_g = el.field_g + sc.field_f;
                  lb.field_b = lb.field_b + 1;
                  break;
              }
              if (this.field_p == 0) {
                this.field_U = this.field_U + 1;
              }
            }
            if (kj.field_o[var3]) {
              this.field_J = this.field_J + rc.field_h;
              wd.a((byte) 74);
              if (this.field_p == 0) {
                this.field_U = this.field_U + 1;
              }
              var4_int = (he.field_d + (qa.field_a + kd.field_c) + ki.field_d) % 8;
              switch (var4_int) {
                case 3:
                  kb.field_d = kb.field_d + 1;
                  oa.field_a = oa.field_a - gb.field_g;
                  break;
                case 4:
                  gb.field_g = gb.field_g + 1;
                  ml.field_r = ml.field_r + kb.field_d;
                  break;
                case 5:
                  kb.field_d = kb.field_d + 1;
                  ml.field_r = ml.field_r + gb.field_g;
                  break;
                case 6:
                  ml.field_r = ml.field_r - kb.field_d;
                  gb.field_g = gb.field_g - 1;
                default:
                  break;
                case 7:
                  kb.field_d = kb.field_d - 1;
                  ml.field_r = ml.field_r - gb.field_g;
                  if (var5 == 0) {
                    break;
                  }
                case 2:
                  gb.field_g = gb.field_g + 1;
                  oa.field_a = oa.field_a - kb.field_d;
                  if (var5 == 0) {
                    break;
                  }
                case 1:
                  oa.field_a = oa.field_a + gb.field_g;
                  kb.field_d = kb.field_d - 1;
                  if (var5 == 0) {
                    break;
                  }
                case 0:
                  gb.field_g = gb.field_g - 1;
                  oa.field_a = oa.field_a + kb.field_d;
                  break;
              }
              var4_int = (kd.field_c + qa.field_a + he.field_d + ki.field_d) % 5;
              switch (var4_int) {
                case 3:
                  sc.field_f = sc.field_f + 1;
                  el.field_g = el.field_g + lb.field_b;
                  if (var5 == 0) {
                    break;
                  }
                default:
                  break;
                case 4:
                  el.field_g = el.field_g - lb.field_b;
                  sc.field_f = sc.field_f - 1;
                  if (var5 == 0) {
                    break;
                  }
                case 2:
                  lb.field_b = lb.field_b - 1;
                  el.field_g = el.field_g - sc.field_f;
                  if (var5 == 0) {
                    break;
                  }
                case 1:
                  lb.field_b = lb.field_b + 1;
                  el.field_g = el.field_g + sc.field_f;
                  if (var5 == 0) {
                    break;
                  }
                case 0:
                  dc.field_a = dc.field_a | el.field_g + lb.field_b << 17;
                  break;
              }
            }
            L44: {
              if (kj.field_o[99] &&
                  !this.field_C) {
                var4 = (ja) ((Object) ji.field_r.g(0));
                while (null != var4) {
                  stackIn_233_0 = var4.field_B;
                  if (var5 != 0) {
                    break L44;
                  }
                  if (!stackIn_233_0) {
                    var4.field_v = var4.field_v + 4.0f * var4.field_F;
                    var4.field_o = var4.field_o + 4.0f * var4.field_w;
                    break;
                  }
                  var4 = (ja) ((Object) ji.field_r.d(1));
                }
              }
              stackIn_233_0 = kj.field_o[var3];
            }
            if (!stackIn_233_0 &&
                !kj.field_o[var2]) {
              jj.b(-106);
            }
            this.field_a = this.field_a - 1;
            if (this.field_a == 0) {
              ld.a(310, 320, 123, 100 + 100 * ji.field_h);
            }
            stackIn_252_1 = (!fa.field_a) && (a.field_d.c(13519)) && (0 < ul.field_b);
            this.field_b = stackIn_252_1;
            if (this.field_b &&
                this.field_B) {
              this.field_B = false;
              this.field_a = 300;
              this.field_b = false;
              ra.a(le.field_a ^ 255, -88, le.field_a);
              if (var5 != 0) {
                this.field_B = false;
              }
            } else {
              this.field_B = false;
            }
            this.field_Z = ab.field_f;
            ef.b((byte) -15);
            kc.b(param0 + 1578896101);
            if (ab.field_f) {
              ul.b(-2);
            }
            this.field_n = ec.b(-18913);
            if (this.field_Z) {
              sk.a(param0 ^ 1578896190);
            }
            cf.d((byte) 27);
            f.o(600);
            if (this.field_Y) {
              this.b(109);
            }
            if (var5 == 0) {
              break L7;
            }
          }
          if (this.field_D == 0) {
            fi.a(param0 ^ -1578896191, pi.field_S);
          }
          if (pf.field_D &&
              od.a(-3) &&
              this.field_D > 1000) {
            this.d(28809);
          }
          fc.a(19);
          cf.d((byte) 24);
          f.o(600);
          this.field_D = this.field_D + 1;
          this.field_F = true;
        }
        if (param0 != -1578896191) {
          this.field_X = (StringBuilder) null;
        }
        while (true) {
          if (!hh.a(111)) {
            stackIn_464_0 = ~bi.field_g;
            stackIn_464_1 = -1;
            break;
          }
          if (te.field_a > 0) {
            pk.field_r = pk.field_r.substring(1) + te.field_a;
            if (pk.field_r.equalsIgnoreCase("fog")) {
              stackIn_304_1 = !(this.field_s);
              this.field_s = stackIn_304_1;
            }
            if (oc.field_f >= 2 &&
                pk.field_r.equalsIgnoreCase("brk")) {
              this.field_I.h((byte) 41);
            }
          }
          if (ki.field_d == 13) {
            if (!this.field_x) {
              ai.field_p = 1;
              if (var5 == 0) {
                return;
              }
            }
            this.d(28809);
            return;
          }
          if (ki.field_d == 83 &&
              this.field_Y) {
            this.c(7000);
          }
          L67: {
            if (ki.field_d == 84 &&
                this.field_t == 0) {
              this.field_t = 1;
              this.field_C = false;
              if (this.field_p != 0) {
                if (this.field_p != 1) {
                  if (this.field_p != 2) {
                    break L67;
                  }
                  this.field_U = dk.field_b;
                  if (var5 == 0) {
                    break L67;
                  }
                }
                this.field_U = dd.field_D;
                if (var5 != 0) {
                  this.field_U = 0;
                }
              } else {
                this.field_U = 0;
              }
            }
          }
          if (ki.field_d == 85 &&
              5 == this.field_p &&
              this.field_t == 0) {
            this.c(param0 ^ -1578897511);
            this.field_Y = true;
            this.field_p = 0;
            this.field_C = true;
          }
          if (jg.field_g == ki.field_d) {
            stackIn_359_1 = !(this.field_E);
            this.field_E = stackIn_359_1;
            jc.a(7, false);
          }
          if (2 > oc.field_f) {
            continue;
          }
          stackIn_464_0 = ki.field_d;
          stackIn_464_1 = 48;
          if (var5 == 0) {
            if (stackIn_464_0 == stackIn_464_1) {
              this.field_r = this.field_r - 1;
              if (this.field_r < 0) {
                this.field_r = 6;
              }
            }
            if (ki.field_d == 49) {
              this.field_r = this.field_r + 1;
              if (this.field_r == 7) {
                this.field_r = 0;
              }
            }
            if (ki.field_d == 64) {
              this.field_G = this.field_G - 1;
              if (this.field_G < 0) {
                this.field_G = 6;
              }
            }
            if (32 == ki.field_d) {
              stackIn_388_1 = !(this.field_Q);
              this.field_Q = stackIn_388_1;
            }
            if (ki.field_d == 65) {
              this.field_G = this.field_G + 1;
              if (this.field_G == 7) {
                this.field_G = 0;
              }
            }
            if (ki.field_d == 16) {
              this.field_d = true;
            }
            if (68 == ki.field_d) {
              this.field_bb = 1;
              this.field_K = true;
            }
            if (ki.field_d == 1) {
              this.field_K = true;
              stackIn_408_1 = !(this.field_j);
              this.field_j = stackIn_408_1;
            }
            if (2 == ki.field_d) {
              stackIn_416_1 = !(this.field_N);
              this.field_N = stackIn_416_1;
              this.field_K = true;
            }
            if (ki.field_d == 3) {
              ag.field_k = 7;
              f.field_qb = 7;
            }
            if (ki.field_d == 4) {
              hd.f(2);
              this.field_K = true;
            }
            if (ki.field_d == 5) {
              c.field_ab = 1;
              hf.a(param0 ^ 1578896207, c.field_ab);
              cd.a((byte) 110);
            }
            if (ki.field_d == 6) {
              c.field_ab = 0;
              hf.a(-126, c.field_ab);
              cd.a((byte) 126);
            }
            if (7 == ki.field_d) {
              c.field_ab = 6;
              hf.a(-99, c.field_ab);
              cd.a((byte) 113);
            }
            if (ki.field_d == 8) {
              c.field_ab = 5;
              hf.a(-124, c.field_ab);
              cd.a((byte) 115);
            }
            if (ki.field_d == 9) {
              c.field_ab = 3;
              hf.a(-98, c.field_ab);
              cd.a((byte) 122);
            }
            if (10 == ki.field_d) {
              c.field_ab = 4;
              hf.a(param0 ^ 1578896198, c.field_ab);
              cd.a((byte) 101);
            }
            if (ki.field_d == 11) {
              c.field_ab = 2;
              hf.a(-118, c.field_ab);
              cd.a((byte) 82);
            }
            if (ki.field_d == 12) {
              stackIn_455_1 = !(this.field_V);
              this.field_V = stackIn_455_1;
            }
            if (36 == ki.field_d) {
              c.field_ab = c.field_ab + 1;
              c.field_ab = c.field_ab % 7;
              cd.a((byte) 108);
            }
            if (ki.field_d != 39) {
              continue;
            }
            this.field_h = true;
            continue;
          }
          break;
        }
        if (stackIn_464_0 != stackIn_464_1) {
          if (this.field_j &&
              oc.field_f >= 2) {
            nb.a(-28195, mc.field_a, this.field_G, he.field_d, this.field_r, this.field_Q);
          }
          L100: {
            if (this.field_Y &&
                this.field_t == 0) {
              if (this.field_p != 5) {
                this.field_C = false;
                this.field_t = 1;
                if (this.field_p == 0) {
                  this.field_U = 0;
                  if (var5 == 0) {
                    break L100;
                  }
                }
                if (this.field_p == 1) {
                  this.field_U = dd.field_D;
                  if (var5 == 0) {
                    break L100;
                  }
                }
                if (this.field_p != 2) {
                  return;
                }
                this.field_U = dk.field_b;
                if (var5 == 0) {
                  break L100;
                }
              }
              if (mc.field_a > 100 &&
                  340 > mc.field_a &&
                  he.field_d > 440 &&
                  476 > he.field_d) {
                this.c(param0 ^ -1578897511);
                this.field_p = 0;
                this.field_Y = true;
                this.field_C = true;
              }
              if (mc.field_a > 380 &&
                  540 > mc.field_a &&
                  he.field_d > 440) {
                if (he.field_d >= 476) {
                  return;
                }
                this.field_C = false;
                this.field_t = 1;
              }
            }
          }
        }
        return;
    }

    final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        CharSequence var7;
        CharSequence var8;
        var6 = Geoblox.field_C;
        if (this.field_Y) {
          return;
        }
        L0: {
          this.field_o = this.field_o + param1;
          if (this.field_o > 9999999) {
            var7 = (CharSequence) ((Object) Integer.toString(9999999));
            td.a(var7, this.field_X, 0, 47);
            if (var6 == 0) {
              break L0;
            }
          }
          var8 = (CharSequence) ((Object) Integer.toString(this.field_o));
          td.a(var8, this.field_X, 0, 69);
        }
        var3 = param1;
        if (param0 != 127) {
          this.e(-17);
        }
        L3: {
          var4 = kd.field_c % 3;
          if (var4 != 0) {
            if (var4 == 1) {
              ml.field_r = ml.field_r - var3;
              if (var6 == 0) {
                break L3;
              }
            }
            var5 = var3 / 3;
            oa.field_a = oa.field_a + var5;
            ml.field_r = ml.field_r - (var3 - var5);
            if (var6 == 0) {
              break L3;
            }
          }
          oa.field_a = oa.field_a + var3;
        }
        if (da.a(0, -117) &&
            this.field_o >= 7000) {
          ra.a(239, -120, 16);
        }
        return;
    }

    public static void i(int param0) {
        field_m = null;
        field_z = null;
        if (param0 != -17199) {
          field_P = 53;
        }
    }

    final void d(byte param0) {
        if (param0 != 116) {
          this.field_o = -46;
        }
        if (!this.field_Y) {
          this.field_x = true;
          this.field_L = true;
          this.c(false);
          this.a((byte) 127, wa.a(-25866));
          this.e((byte) -70);
          if (Geoblox.field_C != 0) {
            this.field_p = 5;
            this.field_t = 0;
            this.field_C = true;
          }
        } else {
          this.field_p = 5;
          this.field_t = 0;
          this.field_C = true;
        }
    }

    final boolean b(boolean param0) {
        boolean stackIn_9_0 = false;
        if (!param0) {
          return true;
        }
        stackIn_9_0 = (this.field_H) || !(0 == this.field_bb);
        return stackIn_9_0;
    }

    private final void b(int param0) {
        int var3;
        L0: {
          var3 = Geoblox.field_C;
          if (this.field_t == 2) {
            this.field_p = this.field_p + 1;
            this.field_C = true;
            this.field_t = 0;
            if (var3 == 0) {
              break L0;
            }
          }
          if (1 == this.field_t) {
            if (this.field_p == 3 ||
                  this.field_p == 5) {
              this.c(7000);
            }
            if (this.field_d) {
              this.field_d = false;
              this.field_t = 2;
            }
            if (this.field_p == 0 &&
                this.field_U > 450) {
              this.field_t = 2;
              if (var3 == 0) {
                break L0;
              }
            }
            if (this.field_p != 1 ||
                  !(0 < dd.field_D - this.field_U)) {
              if (this.field_p == 2) {
                if (!(dk.field_b - this.field_U <= 0)) {
                  this.field_t = 2;
                  if (var3 != 0) {
                    this.field_t = 2;
                  }
                }
              }
            } else {
              this.field_t = 2;
            }
          }
        }
        if (param0 < 59) {
          this.field_N = true;
        }
    }

    private final void b(byte param0) {
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        if (this.field_D == 0) {
          if (!this.field_f) {
            this.h(122);
            if (var4 != 0) {
              this.j(867);
            }
          } else {
            this.j(867);
          }
          this.field_i = true;
          sf.a(sh.field_y.field_d, 0, oc.field_d.field_v, 0, sh.field_y.field_d.length);
          le.a((byte) -39);
          bk.field_a.e();
          vb.c();
          i.field_a.a(this.field_w + 320, this.field_u + 240, 16777215);
          sh.field_y.a(255);
        }
        int fieldTemp$0 = this.field_D + 1;
        this.field_D = this.field_D + 1;
        if (160 == fieldTemp$0) {
          if (this.field_f) {
            var2 = 0;
            var3 = 0;
            while (true) {
              L6: {
                L7: {
                  if (7 > var3) {
                    stackIn_27_0 = ~c.field_ab;
                    stackIn_27_1 = ~ee.field_B[var3];
                    if (var4 != 0) {
                      break L6;
                    }
                    if (stackIn_27_0 == stackIn_27_1) {
                      if (0 < var3) {
                        var2 = ee.field_B[var3 - 1];
                        break L7;
                      }
                      var2 = ee.field_B[6];
                      break L7;
                    }
                    var3++;
                    continue;
                  }
                }
                var3 = var2;
                stackIn_27_0 = 4;
                stackIn_27_1 = var3;
              }
              L10: {
                L11: {
                  L12: {
                    L13: {
                      L14: {
                        L15: {
                          L16: {
                            if (stackIn_27_0 != stackIn_27_1 ||
                                  var4 != 0) {
                              if (var3 == 1 &&
                                  var4 == 0) {
                                break L16;
                              }
                              if (var3 == 3 &&
                                  var4 == 0) {
                                break L15;
                              }
                              if (var3 == 0 &&
                                  var4 == 0) {
                                break L14;
                              }
                              if (var3 == 6) {
                                break L13;
                              }
                              if (5 == var3 &&
                                  var4 == 0) {
                                break L12;
                              }
                              if (2 != var3) {
                                break L10;
                              }
                              if (var4 == 0) {
                                break L11;
                              }
                            }
                            ra.a(fa.field_f ^ 255, -61, fa.field_f);
                            if (var4 == 0) {
                              break;
                            }
                          }
                          ra.a(255 ^ hj.field_b, -84, hj.field_b);
                          if (var4 == 0) {
                            break;
                          }
                        }
                        ra.a(255 ^ ac.field_u, -50, ac.field_u);
                        if (var4 == 0) {
                          break;
                        }
                      }
                      ra.a(255 ^ kf.field_d, -71, kf.field_d);
                      if (var4 == 0) {
                        break;
                      }
                    }
                    ra.a(255 ^ vi.field_E, -115, vi.field_E);
                    if (var4 == 0) {
                      break;
                    }
                  }
                  ra.a(255 ^ jj.field_g, -92, jj.field_g);
                  if (var4 == 0) {
                    break;
                  }
                }
                ra.a(255 ^ jg.field_a, -121, jg.field_a);
                if (var4 == 0) {
                  break;
                }
              }
              ra.a(hj.field_b ^ 255, -95, hj.field_b);
              break;
            }
          }
          this.field_B = false;
          this.field_F = true;
          this.field_i = false;
          this.field_f = true;
          this.field_H = false;
          this.field_D = 0;
          if (ji.field_h > 0) {
            qe.b(10);
            ld.b(false);
          }
        }
        if (param0 > -76) {
          this.field_h = true;
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var4;
        String var5;
        String var6;
        var4 = Geoblox.field_C;
        if (param0) {
          this.a((byte) 71, 49);
        }
        L1: {
          if (2 == this.field_bb) {
            pk.field_k.b(320 - (this.field_D >> 1), 240 - (this.field_D >> 1), this.field_D, this.field_D, 150);
            lj.field_d.b(this.field_ab, -(lj.field_d.field_o >> 1) + 240 + 60);
            dd.field_G.a(sg.field_f, 15 + this.field_ab, 312, 0, -1);
            if (var4 == 0) {
              break L1;
            }
          }
          var2 = -this.field_D + 460 + 460;
          if (this.field_bb == 3) {
            pk.field_k.b(-(var2 >> 1) + 320, 240 - (var2 >> 1), var2, var2, 150);
            lj.field_d.b(-(lj.field_d.field_s >> 1) + 320, -(lj.field_d.field_o >> 1) + 240 + 60);
            var5 = Integer.toString(this.field_q);
            dd.field_G.b(var5, 320, 312, 0, -1);
            if (this.field_R) {
              dd.field_G.b(ld.field_a, 320, 352, 0, -1);
            }
            if (var4 == 0) {
              break L1;
            }
          }
          k.field_a.d(-(k.field_a.field_s >> 1) + 320, 240 - (k.field_a.field_o >> 1), this.field_S - 150 + 150);
          lj.field_d.b(-(lj.field_d.field_s >> 1) + 320, 300 - (lj.field_d.field_o >> 1));
          var6 = Integer.toString(this.field_q);
          dd.field_G.b(var6, 320, 312, 0, -1);
          if (this.field_R) {
            dd.field_G.b(ld.field_a, 320, 352, 0, -1);
          }
        }
        dd.field_G.a(kd.field_d, 426, 404, 200, 100, 0, -1, 2, 0, 30);
    }

    private final void f(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_23_0 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ja var12 = null;
        var11 = Geoblox.field_C;
        if (0 == this.field_D) {
          gf.field_f = 0;
          if (sk.a(param0 - 11)) {
            this.field_y = 0;
            return;
          }
          L1: {
            L2: {
              this.field_q = this.field_q + 179;
              this.field_R = a.field_d.c(13519);
              this.field_S = 150;
              var12 = i.a((byte) -128);
              if (null == var12) {
                this.field_c = 29;
                if (var11 == 0) {
                  break L2;
                }
              }
              vf.field_L.e();
              vb.c();
              var12.field_J.a(var12.field_J.field_s << 3, var12.field_J.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)(65535.0 * ((double)var12.field_u / 6.283185307179586)), 4096);
              sh.field_y.a(255);
              var3 = 0;
              var4 = (int)(var12.field_o + 0.5f) + (-(vf.field_L.field_r >> 1) - 320);
              var5 = -240 + ((int)(var12.field_v + 0.5f) - (vf.field_L.field_m >> 1));
              var6 = 0;
              while (true) {
                stackIn_11_0 = var6;
                stackIn_11_1 = vf.field_L.field_r;
                if (stackIn_11_0 < stackIn_11_1) {
                  stackIn_23_0 = 0;
                  if (var11 != 0) {
                    break L1;
                  }
                  var7 = stackIn_23_0;
                  while (vf.field_L.field_m > var7) {
                    stackIn_11_0 = 0;
                    stackIn_11_1 = vf.field_L.field_v[vf.field_L.field_r * var7 + var6];
                    if (stackIn_11_0 != stackIn_11_1) {
                      var8 = var4 + var6;
                      var9 = var7 + var5;
                      var10 = var8 * var8 + var9 * var9;
                      if (var10 > var3) {
                        var3 = var10;
                      }
                    }
                    var7++;
                  }
                  var6++;
                  continue;
                }
                break;
              }
              this.field_c = (int)(0.5 + Math.sqrt((double)var3));
            }
            this.field_W = 920 + (-(2 * this.field_c) - 58 - 1);
            stackIn_23_0 = param0 ^ 10;
          }
          ra.a(stackIn_23_0, qf.field_bb);
        }
        L10: {
          fieldTemp$0 = this.field_D + 1;
          this.field_D = this.field_D + 1;
          if (fieldTemp$0 != 150 + this.field_W) {
            if (460 > this.field_D) {
              this.field_bb = 2;
              if (!(var11 == 0)) {
                if (~(460 - this.field_D + 460) > ~(this.field_c * 2)) {
                  this.field_bb = 4;
                  if (var11 != 0) {
                    this.field_bb = 3;
                  }
                } else {
                  this.field_bb = 3;
                }
              }
            } else {
              if (~(460 - this.field_D + 460) > ~(this.field_c * 2)) {
                this.field_bb = 4;
                if (var11 != 0) {
                  this.field_bb = 3;
                }
              } else {
                this.field_bb = 3;
              }
            }
            if (3 == this.field_bb) {
              this.field_q = this.field_q + 7;
              if (var11 == 0) {
                break L10;
              }
            }
            if (this.field_bb != 2) {
              if (this.field_S == 150) {
                td.a(-348, fl.field_c[28]);
              }
              this.field_S = this.field_S - 1;
              if (var11 == 0) {
                break L10;
              }
            }
            if (this.field_M == null ||
                  this.field_M.l()) {
              var2 = this.field_D * 100 / 460;
              this.field_M = kl.a(fl.field_c[28], 2 * var2 + 200, 45);
              ja.a(false, this.field_M);
            }
            if (this.field_ab <= 320 - (lj.field_d.field_s >> 1)) {
              break L10;
            }
            this.field_ab = this.field_ab - 1;
            if (var11 == 0) {
              break L10;
            }
          }
          this.field_H = true;
          this.field_D = 0;
          this.field_bb = 5;
          if (this.field_R) {
            ld.a(350, 320, 66, 2000);
            ra.a(eb.field_i ^ 255, param0 - 101, eb.field_i);
            this.field_B = false;
          }
          ld.a(310, 320, 90, this.field_q);
        }
        cf.d((byte) 33);
        f.o(600);
        if (param0 != 10) {
          gh.i(-70);
        }
    }

    final void e(byte param0) {
        if (param0 != -70) {
            return;
        }
        if (0 < this.field_o && !this.field_K &&
            !fh.c(-102)) {
            qf.a(oa.field_a, 22, kb.field_d, 25134, new int[]{this.field_o}, ml.field_r, 65513, 3, gb.field_g);
        }
        ca.field_f = null;
    }

    final void a(int param0, int param1) {
        int var3;
        CharSequence var4;
        CharSequence var5;
        if (this.field_Y) {
          return;
        }
        L0: {
          this.field_A = this.field_A + param0;
          if (this.field_A > 99999) {
            var4 = (CharSequence) ((Object) Integer.toString(99999));
            td.a(var4, this.field_g, 0, 26);
            if (Geoblox.field_C == 0) {
              break L0;
            }
          }
          var5 = (CharSequence) ((Object) Integer.toString(this.field_A));
          td.a(var5, this.field_g, 0, 73);
        }
        var3 = -83 % ((-19 - param1) / 54);
    }

    private final void e(int param0) {
        int var2;
        int var3;
        var3 = Geoblox.field_C;
        if (!this.field_f) {
          return;
        }
        L0: {
          if (this.field_bb != 0) {
            dd.field_G.a(tj.field_a, 426, 404, 200, 100, 0, -1, 2, 0, 30);
            if (var3 == 0) {
              break L0;
            }
          }
          var2 = -ul.field_b + fa.field_b;
          dd.field_G.field_K[0][wf.field_p] = 15488514;
          dd.field_G.c(w.field_e, 621, 441, 0, -1);
          dd.field_G.field_K[0][wf.field_p] = 16689938;
          dd.field_G.c(od.field_b, 621, 468, 0, -1);
          if (var2 <= 10) {
            dd.field_G.field_K[0][wf.field_p] = mk.field_k[var2 % 5];
            dd.field_G.c(Integer.toString(var2), 515, 468, 0, -1);
            dd.field_G.field_K[0][wf.field_p] = 16689938;
            if (var3 == 0) {
              break L0;
            }
          }
          if (var2 <= 99999) {
            dd.field_G.c(Integer.toString(var2), 515, 468, 0, -1);
            if (var3 == 0) {
              break L0;
            }
          }
          dd.field_G.c(Integer.toString(99999), 515, 468, 0, -1);
        }
        if (param0 >= -39) {
          this.field_q = 7;
        }
    }

    private final void d(int param0) {
        int var3;
        var3 = Geoblox.field_C;
        if (param0 != 28809) {
          this.field_j = true;
        }
        L1: {
          if (!fh.c(-93)) {
            if (this.field_e <= 0) {
              if (this.field_o > 0) {
                ai.field_p = 2;
                if (var3 == 0) {
                  break L1;
                }
              }
              ai.field_p = 0;
              if (var3 == 0) {
                break L1;
              }
            }
            ai.field_p = 6;
            if (var3 == 0) {
              break L1;
            }
          }
          if (this.field_o > 0 ||
                this.field_e > 0) {
            ai.field_p = 4;
            if (var3 == 0) {
              break L1;
            }
          }
          ai.field_p = 0;
        }
        fi.a(0, ll.field_d);
    }

    private final void h(int param0) {
        this.field_o = 0;
        this.field_A = 0;
        sc.field_f = 3382;
        el.field_g = 8801;
        ml.field_r = 1385;
        dc.field_a = 0;
        oa.field_a = 4703;
        gb.field_g = 5997;
        kb.field_d = 275;
        lb.field_b = 935;
        this.a((byte) 127, 0);
        this.a(0, -96);
        gf.field_f = 1;
        this.field_y = 1;
        this.field_T = 640;
        td.a((byte) -93);
        if (param0 < 104) {
          gh.i(-111);
        }
    }

    private final void c(byte param0) {
        if (param0 <= 40) {
          gh.i(100);
        }
    }

    private final void j(int param0) {
        this.field_bb = 0;
        this.field_ab = 640;
        this.field_q = 0;
        this.field_c = 0;
        if (param0 != 867) {
            this.g(20);
        }
        if (ji.field_h >= 41) {
            ra.a(255 ^ pk.field_m, -103, pk.field_m);
        }
        int var2 = uh.b(16);
        c.field_ab = var2;
        cd.a((byte) 116);
        hf.a(param0 ^ -796, var2);
    }

    final void c(boolean param0) {
        if (this.field_A == 0) {
            return;
        }
        if (param0) {
            this.field_K = true;
        }
        ld.a(34, 20 + (this.field_T + 60), 79, this.field_A);
        td.a(-348, fl.field_c[32]);
        this.field_A = 0;
    }

    gh(Geoblox param0, boolean param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_R = false;
        this.field_T = 640;
        this.field_a = 0;
        this.field_K = false;
        this.field_C = false;
        this.field_Q = false;
        this.field_k = 1;
        this.field_y = 0;
        this.field_N = false;
        this.field_b = false;
        this.field_o = 0;
        this.field_x = false;
        this.field_j = false;
        this.field_d = false;
        this.field_q = 0;
        this.field_f = true;
        this.field_p = 0;
        this.field_t = 0;
        this.field_B = false;
        this.field_h = false;
        this.field_i = false;
        this.field_X = new StringBuilder(5);
        this.field_A = 0;
        this.field_g = new StringBuilder(5);
        this.field_L = false;
        this.field_D = 0;
        this.field_F = false;
        this.field_H = false;
        this.field_ab = 640;
        this.field_S = 150;
        this.field_W = 0;
        this.field_c = 0;
        this.field_bb = 0;
        try {
          this.field_I = param0;
          ug.field_c = 0;
          pb.field_t.c((byte) -126);
          this.field_A = 0;
          this.field_w = -(i.field_a.field_r >> 1);
          this.field_Y = param1;
          this.field_C = param1;
          this.field_o = 0;
          this.field_u = -(i.field_a.field_m >> 1);
          this.field_J = 0.0f;
          bk.field_a.e();
          vb.c();
          i.field_a.a(320 + this.field_w, this.field_u + 240, 16777215);
          oc.field_d.e();
          vb.c();
          sh.field_y.a(255);
          this.field_H = false;
          this.field_D = 0;
          this.field_F = true;
          this.field_bb = 0;
          this.field_x = false;
          this.a((byte) 127, 0);
          if (da.a(0, 111)) {
            uf.field_h[0] = 14788623;
            uf.field_h[1] = 15439657;
          }
          td.a((byte) -93);
          ja.h(0);
          c.field_ab = ee.field_B[0];
          cd.a((byte) 104);
          this.field_j = false;
          this.field_K = false;
          this.field_N = false;
          this.field_L = false;
          hf.a(-116, 1);
          if (jf.field_a == null) {
            jf.field_a = new dm(ec.field_c.field_r, ec.field_c.field_m);
          }
          oa.field_a = 4703;
          kb.field_d = 275;
          lb.field_b = 935;
          dc.field_a = 0;
          ml.field_r = 1385;
          el.field_g = 8801;
          sc.field_f = 3382;
          gb.field_g = 5997;
          this.field_e = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gh.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_P = 0;
    }
}
