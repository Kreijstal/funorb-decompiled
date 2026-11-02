/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private Sprite field_a;
    private Sprite field_r;
    static sna field_h;
    private int field_x;
    private Sprite field_g;
    private boolean field_l;
    private int[] field_k;
    private int field_t;
    private sna field_u;
    static qia field_o;
    private mj field_m;
    private int field_e;
    private int[] field_d;
    private int[] field_n;
    private Sprite field_c;
    static int field_p;
    private int[] field_w;
    private Sprite field_q;
    private Sprite field_i;
    static String field_y;
    static String field_f;
    private lna field_s;
    private Sprite field_b;
    private String field_v;
    private Sprite field_j;

    private final boolean a(int[] param0, int param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0.length != param2.length) {
            return false;
          }
          for (var4_int = param1; var4_int < param0.length; var4_int++) {
            if (param0[var4_int] != param2[var4_int]) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("mk.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int[] param1, int param2) {
        int var5 = 0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          if (param2 >= -120) {
            return true;
          }
          var8 = param1;
          var4 = var8;
          for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            if (param0 == var6) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("mk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = BachelorFridge.field_y;
        this.field_s.c(11);
        this.field_u.a(19842, param0);
        if (this.field_u.field_R == 1 &&
          ClientException.field_a) {
          if (!this.a(true)) {
            this.field_m = new mj(100, 150, 440, 160, wja.field_n);
            return;
          }
          RasterBuffer.a(14, 7758);
          if (!this.a(this.field_k, 0, BananarangEvent.field_s.field_g.field_m)) {
            ep.a((byte) 42, BananarangEvent.field_s, this.field_l, this.field_e, BananarangEvent.field_s.field_g.field_m);
          }
          if (this.field_l) {
            BananarangEvent.field_s.field_v.a(false, 0, 0, true, -1);
          }
          BananarangEvent.field_s.field_g.field_i = 0;
          gs.field_f.field_i = false;
          gs.field_f.field_p = false;
          uca.a(18, (byte) -19);
        }
        if (this.field_m != null) {
          if (this.field_m.b(0) == 0) {
            this.field_m = null;
          }
          return;
        }
        this.field_x = -1;
        var2 = bf.field_g.length;
        if (ProxySocketConnector.field_f <= 0) {
          var2 = 6;
        }
        for (var3 = 0; var2 > var3; var3++) {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          bf.field_g[var3].a(19842, true);
          if (bf.field_g[var3].field_T) {
            if (2 > var3 ||
              BananarangEvent.field_s.field_g.field_g[-2 + var3]) {
              this.field_x = var3;
            }
            if (bf.field_g[var3].field_R == 1) {
              if (!this.a(this.field_x, BananarangEvent.field_s.field_g.field_m, -125) && (this.field_x < 2 ||
                BananarangEvent.field_s.field_g.field_g[-2 + this.field_x])) {
                var6 = 0;
                var4 = var6;
                while (true) {
                  if (var6 >= BananarangEvent.field_s.field_g.field_m.length) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (-1 != BananarangEvent.field_s.field_g.field_m[var6]) {
                    var6++;
                    continue;
                  }
                  break;
                }
                if (decompiledFrameCompleted0) {
                  RasterBuffer.a(8, 7758);
                  uca.a(17, (byte) 105);
                  BananarangEvent.field_s.field_g.field_m[var6] = this.field_x;
                  decompiledFrameRemainder0 = false;
                }
              }
              if ((decompiledFrameRemainder0) && (decompiledFrameCompleted0) && (-1 != this.field_x &&
                this.a(this.field_x, BananarangEvent.field_s.field_g.field_m, -126) && (this.field_x < 2 ||
                BananarangEvent.field_s.field_g.field_g[-2 + this.field_x]))) {
                RasterBuffer.a(9, 7758);
                var4Lifetime1 = this.a(BananarangEvent.field_s.field_g.field_m, 0, this.field_x);
                if (var4Lifetime1 != -1) {
                  BananarangEvent.field_s.field_g.field_m[var4Lifetime1] = -1;
                }
              }
            }
          }
        }
        this.field_t = -1;
        var7 = 0;
        var3Lifetime1 = var7;
        while (var7 < SleepAnimation.field_w.length) {
          SleepAnimation.field_w[var7].a(19842, true);
          if (SleepAnimation.field_w[var7].field_T) {
            this.field_t = var7;
            if (SleepAnimation.field_w[var7].field_R == 1) {
              RasterBuffer.a(9, 7758);
              BananarangEvent.field_s.field_g.field_m[this.field_t] = -1;
            }
          }
          var7++;
        }
        return;
    }

    private final boolean a(boolean param0) {
        int var5 = 0;
        int var2;
        int var3;
        int var4;
        int var7;
        boolean stackIn_21_0 = false;
        oha var6;
        var7 = BachelorFridge.field_y;
        var2 = 0;
        var3 = 0;
        var4 = param0 ? 1 : 0;
        for (var5 = 0; var5 < BananarangEvent.field_s.field_g.field_m.length; var5++) {
          if (BananarangEvent.field_s.field_g.field_m[var5] != -1) {
            if (ProxySocketConnector.field_f <= 0 &&
              BananarangEvent.field_s.field_g.field_m[var5] > 6) {
              var4 = 0;
            }
            var6 = ur.field_e[IsaacRandom.field_f.field_b[BananarangEvent.field_s.field_g.field_m[var5]]];
            if (var6 instanceof t) {
              var3 = 1;
            }
            if (var6 instanceof tv) {
              var2 = 1;
            }
          }
        }
        stackIn_21_0 = (var3 != 0) && (var2 != 0) && (var4 != 0);
        return stackIn_21_0;
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          var4_int = -1;
          for (var5 = param1; var5 < param3; var5++) {
            var4_int = var4_int >>> 8 ^ uca.field_d[(param0[var5] ^ var4_int) & 255];
          }
          if (param2 > -110) {
            field_y = (String) null;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("mk.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1) {
        int var3;
        ho var4;
        int var5;
        int var11;
        BinaryBitmapFont stackIn_7_0;
        String stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_8_4;
        int stackIn_42_0 = 0;
        oha var6;
        int var6_int;
        int var7;
        int var8;
        oha var8_ref_oha;
        int var9;
        int var10;
        int var5Lifetime1;
        int var7Lifetime1;
        var11 = BachelorFridge.field_y;
        wq.field_k.draw(0, 0);
        InsanoSauceEvent.a(this.field_v, 34, 16762880, true, 444, false);
        wt.field_k.drawParagraph(BananarangEvent.field_s.field_g.field_o.field_a, 350, 40, 240, 100, 16777215, -1, 0, 1, 14);
        jha.field_g.a(hl.field_G[2], 414, 178, 15204352, -1);
        hfa.field_z.a(hl.field_G[2], 414, 178, 65793, -1);
        jha.field_g.a(hl.field_G[3], 412, 206, 818659, -1);
        hfa.field_z.a(hl.field_G[3], 412, 206, 65793, -1);
        jha.field_g.a(hl.field_G[0], 414, 232, 16769792, -1);
        hfa.field_z.a(hl.field_G[0], 414, 232, 65793, -1);
        var3 = 11 / ((65 - param1) / 50);
        jha.field_g.a(hl.field_G[1], 408, 259, 51233, -1);
        hfa.field_z.a(hl.field_G[1], 408, 259, 65793, -1);
        jha.field_g.a(DelegatingCanvas.field_a, 180, 428, 16776960, -1);
        hfa.field_z.a(DelegatingCanvas.field_a, 180, 428, 65793, -1);
        jha.field_g.a(ida.field_o, 180, 32, 16776960, -1);
        hfa.field_z.a(ida.field_o, 180, 32, 65793, -1);
        if (!this.field_s.field_A) {
          this.field_s.a(8);
        }
        this.field_s.a(false, false, 2048, 2048, 0, -60, 256, 110, 100);
        var4 = (ho) (BananarangEvent.field_s.field_g.field_h.b((byte) 90));
        while (var4 != null) {
          var4 = (ho) (BananarangEvent.field_s.field_g.field_h.c(0));
        }
        this.a((byte) 21, this.field_d[2], dt.field_a, 154, 472, 2);
        this.a((byte) 21, this.field_d[3], DualLinkDeque.field_b, 184, 472, 3);
        this.a((byte) 21, this.field_d[0], HomingMissileEvent.field_s, 216, 472, 0);
        this.a((byte) 21, this.field_d[1], vaa.field_b, 243, 472, 1);
        this.c(false);
        SnowAnimation.field_y.draw(470, 320);
        stackIn_7_0 = jha.field_g;
        stackIn_7_1 = di.field_l;
        stackIn_7_2 = 522;
        stackIn_7_3 = 342;
        stackIn_8_4 = (!this.field_u.field_T) ? 16777215 : 16776960;
        ((BinaryBitmapFont) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_8_4, -1);
        hfa.field_z.a(di.field_l, 522, 342, 65793, -1);
        for (var5 = 0; var5 < BananarangEvent.field_s.field_g.field_m.length; var5++) {
          if (BananarangEvent.field_s.field_g.field_m[var5] != -1) {
            regionExit1: {
              var6_int = BuffVendorAnimation.field_A[var5][0];
              var7 = BuffVendorAnimation.field_A[var5][1];
              OneAnimation.field_E.a(0, var7, var6_int, -1049413117, 4096);
              var8_ref_oha = ur.field_e[IsaacRandom.field_f.field_b[BananarangEvent.field_s.field_g.field_m[var5]]];
              if (!(var8_ref_oha instanceof tv)) {
                if (var8_ref_oha instanceof hd) {
                  nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) - 1 + var6_int, -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) - 1 + var7, 14971949);
                } else {
                  if (var8_ref_oha instanceof a) {
                    if (var8_ref_oha.field_b == 3) {
                      nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + (-1 + var6_int), -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) - 1 + var7, 16769792);
                    } else {
                      if (var8_ref_oha.field_b != 4) {
                        if (2 == var8_ref_oha.field_b) {
                          nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + (var6_int - 1), -1 + (var7 - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1)), 15204352);
                        } else {
                          if (var8_ref_oha.field_b == 1) {
                            nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + var6_int - 1, -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) + var7 - 1, 818659);
                          }
                        }
                      } else {
                        nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) - 1 + var6_int, -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) + (var7 - 1), 51233);
                      }
                    }
                  } else {
                    if (var8_ref_oha instanceof t) {
                      if (((t) (var8_ref_oha)).field_p != 1 &&
                        ((t) (var8_ref_oha)).field_p != 2) {
                        if (((t) (var8_ref_oha)).field_p == 4) {
                          nia.field_l[var8_ref_oha.field_b].e(-1 + var6_int - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1), -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1) + (-1 + var7), 16769792);
                        } else {
                          nia.field_l[var8_ref_oha.field_b].e(-1 + (var6_int - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1)), var7 - (1 + (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1)), 15204352);
                        }
                        break regionExit1;
                      }
                      nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + (var6_int - 1), var7 - 1 - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1), 818659);
                    }
                  }
                }
              } else {
                nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1) + (-1 + var6_int), var7 - 1 - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1), 51233);
              }
            }
            CreatureType.a(true, -15 + BuffVendorAnimation.field_A[var5][1], -15 + BuffVendorAnimation.field_A[var5][0], IsaacRandom.field_f.field_b[BananarangEvent.field_s.field_g.field_m[var5]], 78);
          }
        }
        if (-1 != this.field_x ||
          this.field_t != -1) {
          if (this.field_x == -1) {
            stackIn_42_0 = BananarangEvent.field_s.field_g.field_m[this.field_t];
          } else {
            stackIn_42_0 = this.field_x;
          }
          var5Lifetime1 = stackIn_42_0;
          if (-1 == var5Lifetime1) {
            return;
          }
          var6 = al.a(-111, IsaacRandom.field_f.field_b[var5Lifetime1]);
          if (this.field_x != -1) {
          }
          var7Lifetime1 = 640;
          var8 = 480;
          var9 = field_p + 4;
          var10 = 4 + gd.field_m;
          if (param0) {
            sd.a(BananarangEvent.field_s.field_g.a(var6, -5313), var9, var6, (byte) 74, var10, var7Lifetime1, var8);
          }
        }
        if (this.field_m != null) {
          SoftwareRasterizer.darkenRectangle(0, 0, 640, 480);
          this.field_m.a((byte) 85);
        }
    }

    private final void c(boolean param0) {
        int var3 = 0;
        int stackIn_20_0 = 0;
        int var2;
        int var4;
        int var5;
        int var6;
        oha var7;
        int var8;
        oha var9;
        oha var10;
        var8 = BachelorFridge.field_y;
        if (param0) {
          this.field_i = (Sprite) null;
        }
        var2 = 15;
        if (ProxySocketConnector.field_f <= 0) {
          var2 = 6;
        }
        for (var3 = 0; 15 > var3; var3++) {
          boolean decompiledFrameRemainder0 = true;
          var4 = SauceOfFlameEvent.field_r[var3][0];
          var5 = SauceOfFlameEvent.field_r[var3][1];
          if (var2 > var3 && (var3 < 3 ||
            BananarangEvent.field_s.field_g.b(8, var3 / 3))) {
            if (var3 == BananarangEvent.field_s.field_g.field_i &&
              BananarangEvent.field_s.field_g.field_i != 0) {
              this.field_r.drawAdditive(-13 + var4, var5 - 13, 255);
            }
            if (var3 >= 2) {
              stackIn_20_0 = (BananarangEvent.field_s.field_g.field_g[var3 - 2]) ? 1 : 0;
            } else {
              stackIn_20_0 = 1;
            }
            var6 = stackIn_20_0;
            if (var6 != 0) {
              var10 = ur.field_e[bf.field_g[var3].field_vb];
              var7 = var10;
              if (BananarangEvent.field_s.field_g.a(bf.field_g[var3].field_vb, 9)) {
                a.field_o.rotateNearest(a.field_o.field_n << 3, a.field_o.field_o << 3, (1 + var4) * 16, 16 * var5 + 16, 0, 4096);
              }
              boolean decompiledFrameRemainder2 = true;
              OneAnimation.field_E.a(0, var5, var4, -1049413117, 4096);
              if (!(var7 instanceof tv)) {
                if (!(var7 instanceof hd)) {
                  if (!(var7 instanceof a)) {
                    if (var7 instanceof t) {
                      if (((t) (var10)).field_p != 1 &&
                        ((t) (var10)).field_p != 2) {
                        if (((t) (var10)).field_p == 4) {
                          nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(var4 - 1 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + var5 - 1, 16769792);
                        } else {
                          nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-1 + (var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), -1 + (var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 15204352);
                        }
                        decompiledFrameRemainder2 = false;
                      }
                      else {
                        nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + var4 - 1, -1 + var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1), 818659);
                      }
                    }
                  } else {
                    if (var10.field_b == 3) {
                      nia.field_l[var10.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + (var4 - 1), -1 + var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1), 16769792);
                    } else {
                      if (var10.field_b == 4) {
                        nia.field_l[var10.field_b].e(-1 + var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1), var5 - (1 + (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 51233);
                      } else {
                        if (var10.field_b != 2) {
                          if (1 == var10.field_b) {
                            nia.field_l[var10.field_b].e(-1 + (var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), var5 - (1 + (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 818659);
                          }
                        } else {
                          nia.field_l[var10.field_b].e(var4 - 1 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) - 1 + var5, 15204352);
                        }
                      }
                    }
                  }
                } else {
                  nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-1 + (var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) - 1 + var5, 14971949);
                }
              } else {
                nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + var4 - 1, -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + var5 - 1, 51233);
              }
              CreatureType.a(true, bf.field_g[var3].field_rb, bf.field_g[var3].field_kb + 1, bf.field_g[var3].field_vb, 106);
            } else {
              if (var3 >= var2 && (2 > var3 ||
                BananarangEvent.field_s.field_g.field_g[var3 - 2])) {
                var9 = ur.field_e[bf.field_g[var3].field_vb];
                var7 = var9;
                if (BananarangEvent.field_s.field_g.a(bf.field_g[var3].field_vb, 9)) {
                  a.field_o.rotateNearest(a.field_o.field_n << 3, a.field_o.field_o << 3, var4 * 16 + 16, (1 + var5) * 16, 0, 4096);
                }
                boolean decompiledFrameRemainder1 = true;
                OneAnimation.field_E.a(0, var5, var4, -1049413117, 4096);
                if (var7 instanceof tv) {
                  nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(var4 - (1 + (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), -1 + (var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 51233);
                } else {
                  if (!(var7 instanceof hd)) {
                    if (var7 instanceof a) {
                      if (var9.field_b != 3) {
                        if (4 != var9.field_b) {
                          if (var9.field_b == 2) {
                            nia.field_l[var9.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) - 1 + var4, -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + var5 - 1, 15204352);
                          } else {
                            if (var9.field_b == 1) {
                              nia.field_l[var9.field_b].e(-1 + (var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1)), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + (var5 - 1), 818659);
                            }
                          }
                        } else {
                          nia.field_l[var9.field_b].e(-1 + var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1), -1 + var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1), 51233);
                        }
                      } else {
                        nia.field_l[var9.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + (var4 - 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + (var5 - 1), 16769792);
                      }
                    } else {
                      if (var7 instanceof t) {
                        if (((t) (var9)).field_p != 1 &&
                          2 != ((t) (var9)).field_p) {
                          if (((t) (var9)).field_p == 4) {
                            nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + (var4 - 1), var5 - 1 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1), 16769792);
                          } else {
                            nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + (var4 - 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + (var5 - 1), 15204352);
                          }
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) - 1 + var4, var5 + (-1 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1)), 818659);
                        }
                      }
                    }
                  } else {
                    nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1) + var4 - 1, -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1) + (var5 - 1), 14971949);
                  }
                }
                CreatureType.a(true, bf.field_g[var3].field_rb, 1 + bf.field_g[var3].field_kb, bf.field_g[var3].field_vb, 106);
                RefreshingAnimation.field_v.rotateNearest(RefreshingAnimation.field_v.field_n << 3, RefreshingAnimation.field_v.field_o << 3, 16 * var4, var5 * 16, 0, 4096);
              } else {
                hp.field_b[ur.field_e[bf.field_g[var3].field_vb].field_b].rotateNearest(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_n << 3, nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_o << 3, 16 * var4, 16 * var5, 0, 4096);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            RefreshingAnimation.field_v.rotateNearest(RefreshingAnimation.field_v.field_n << 3, RefreshingAnimation.field_v.field_o << 3, 16 * var4, var5 * 16, 0, 4096);
          }
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          BuffVendorEvent.field_t = new IntrusiveNodeHashTable(16);
          for (var1_int = 0; var1_int < gb.field_f.length; var1_int++) {
            BuffVendorEvent.field_t.a((long)gb.field_f[var1_int].toLowerCase().hashCode(), (byte) 78, new ji(var1_int));
          }
          if (param0 != -43) {
            field_f = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var1), "mk.J(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, Sprite param2, int param3, int param4, int param5) {
        boolean discarded$0 = false;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          if (param5 == 0 &&
            BananarangEvent.field_s.field_g.a(84, 0, BananarangEvent.field_s.field_g.field_m)) {
            param1++;
          }
          if (1 == param5 &&
            BananarangEvent.field_s.field_g.a(85, 0, BananarangEvent.field_s.field_g.field_m)) {
            param1++;
          }
          if (param5 == 2 &&
            BananarangEvent.field_s.field_g.a(86, 0, BananarangEvent.field_s.field_g.field_m)) {
            param1++;
          }
          if (param5 == 3 &&
            BananarangEvent.field_s.field_g.a(87, 0, BananarangEvent.field_s.field_g.field_m)) {
            param1++;
          }
          var7_int = 0;
          if (param0 != 21) {
            discarded$0 = this.a(true);
          }
          for (var8 = 0; param1 > var8; var8++) {
            var7_int = var7_int + ad.field_m[var8];
          }
          SoftwareRasterizer.setClip(param4, param3, param4 + var7_int, 28 + param3);
          param2.draw(param4, param3);
          SoftwareRasterizer.c();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("mk.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param1 >= -71) {
          field_p = 32;
        }
        if (param0 == -1) {
          return;
        }
        PcmSample var2 = PizzaPartyAnimation.field_y[param0];
        if (var2 != null) {
          ol.a(var2, true);
        }
    }

    private final int a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var4_int = param1;
          while (true) {
            if (var4_int >= param0.length) {
              stackIn_8_0 = -1;
              return stackIn_8_0;
            }
            if (param0[var4_int] != param2) {
              var4_int++;
              continue;
            }
            break;
          }
          stackIn_5_0 = var4_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("mk.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 1) {
          return;
        }
        field_o = null;
        field_f = null;
        field_y = null;
    }

    mk(jfa param0, boolean param1, int param2) {
        Sprite var8 = null;
        Sprite var9 = null;
        Sprite var10 = null;
        Sprite var11 = null;
        int var7 = 0;
        int var5 = 0;
        int var5Lifetime1;
        if (param0 == null) {
          return;
        }
        try {
          this.field_l = param1 ? true : false;
          this.field_e = param2;
          BananarangEvent.field_s = param0;
          IsaacRandom.field_f = BananarangEvent.field_s.field_g.field_o.field_g;
          this.field_v = BananarangEvent.field_s.field_g.field_n;
          this.field_k = new int[BananarangEvent.field_s.field_g.field_m.length];
          ArrayOperations.copy(BananarangEvent.field_s.field_g.field_m, 0, this.field_k, 0, this.field_k.length);
          this.field_d = BananarangEvent.field_s.field_g.field_k;
          this.field_s = BananarangEvent.field_s.field_g.e((byte) -121);
          BananarangEvent.field_v = mka.a(13558251, 13558251, 13558251, (byte) -123, jha.field_g, 13558251, 16777215, 13558251);
          BananarangEvent.field_v.field_eb = wd.field_w;
          BananarangEvent.field_v.field_A = RageSpecial.field_p;
          BananarangEvent.field_v.field_db = BattleState.field_I;
          BananarangEvent.field_v.field_N = 1;
          this.field_u = new sna("confirm", BananarangEvent.field_v, 470, 320, jha.field_g.a(di.field_l) + 40, 40, di.field_l);
          SleepAnimation.field_w = new hw[5];
          bf.field_g = new hw[15];
          uma.n(1);
          var8 = new Sprite(350, 80);
          var8.b();
          SoftwareRasterizer.fillRectangle(0, 0, 330, 30, 5667119);
          hp.a(330, 0, (byte) -65, 30, de.field_A, 0);
          this.field_i = new Sprite(340, 60);
          this.field_i.b();
          var8.d(180, 60, 100, 4096);
          var9 = new Sprite(112, 30);
          var9.b();
          SoftwareRasterizer.clear();
          SoftwareRasterizer.fillRectangle(0, 0, 112, 30, 6127926);
          hp.a(112, 0, (byte) -42, 30, de.field_A, 0);
          this.field_j = new Sprite(120, 60);
          this.field_j.b();
          var9.d(60, 30, 0, 4096);
          this.field_b = new Sprite(120, 60);
          this.field_b.b();
          var9.d(60, 30, -100, 4096);
          var10 = new Sprite(120, 30);
          var10.b();
          SoftwareRasterizer.clear();
          SoftwareRasterizer.fillRectangle(0, 0, 100, 30, 6127926);
          hp.a(100, 0, (byte) 106, 30, de.field_A, 0);
          this.field_c = new Sprite(120, 60);
          this.field_c.b();
          var10.d(60, 30, 200, 4096);
          this.field_a = new Sprite(120, 60);
          this.field_a.b();
          var10.d(60, 30, -200, 4096);
          var11 = new Sprite(180, 30);
          var11.b();
          SoftwareRasterizer.fillRectangle(0, 0, 180, 30, 6127926);
          hp.a(180, 0, (byte) -23, 30, de.field_A, 0);
          this.field_g = new Sprite(200, 60);
          this.field_g.b();
          var11.d(100, 30, 200, 4096);
          hga.field_U.a((byte) 21);
          this.field_n = new int[256];
          for (var5 = 0; var5 < 256; var5++) {
            this.field_n[var5] = var5 * 65793;
          }
          this.field_w = new int[256];
          var7 = 0;
          var5Lifetime1 = var7;
          while (var7 < 256) {
            this.field_w[var7] = 257 * var7;
            var7++;
          }
          this.field_q = new Sprite(25, 25);
          this.field_q.b();
          SoftwareRasterizer.a(208, 208, 192, 255, this.field_n);
          this.field_r = new Sprite(25, 25);
          this.field_r.b();
          SoftwareRasterizer.a(208, 208, 192, 255, this.field_w);
          hga.field_U.a((byte) 125);
          this.field_s.a((byte) 65, BananarangEvent.field_s.field_g.field_o.field_b, 0);
          BananarangEvent.field_s.field_g.field_f = -1;
          RasterBuffer.a(13, 7758);
          OneEvent.c(0, -121);
          a.a(15843842, 32, 16763049, 16435458);
          uca.a(16, (byte) -61);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_o = new qia();
        field_y = "(<%0> players want to join)";
        field_f = "Invalid name";
        field_p = 0;
    }
}
