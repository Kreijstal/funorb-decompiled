/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends GraphicsRenderer {
    private boolean field_y;
    private IntrusiveNodeHashTable field_g;
    private int field_q;
    private int field_B;
    private int field_n;
    private oe field_p;
    private java.awt.Canvas field_l;
    private boolean field_h;
    private int field_t;
    private gq field_u;
    private int field_m;
    private gq field_F;
    private int field_d;
    int field_w;
    int field_z;
    private int field_j;
    private it[] field_e;
    int field_f;
    private int field_v;
    int field_k;
    int field_D;
    private int field_i;
    private int field_A;
    private int field_G;
    private int field_o;
    int[] field_E;
    private int field_r;
    private lb field_C;
    private int field_x;
    private int field_s;
    private static String field_H;

    private final it a(Runnable param0) {
        int var2 = 0;
        for (var2 = 0; var2 < this.field_A; var2++) {
          if (this.field_e[var2].field_a == param0) {
            return this.field_e[var2];
          }
        }
        return null;
    }

    final int i() {
        return this.field_d;
    }

    final void e() {
    }

    private final void b(java.awt.Canvas param0, int param1, int param2) {
        oe var4;
        var4 = (oe) (this.field_g.findByKey((byte) 106, (long)param0.hashCode()));
        if (var4 != null) {
          if (var4.field_g == param1 &&
            var4.field_h == param2) {
            return;
          }
          this.a(param0, param1, param2);
        } else {
          var4 = oi.a(param0, -30, param1, param2);
          this.field_g.put(123, (long)param0.hashCode(), var4);
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
          var9 = (param1 + var8) * this.field_f + param0;
          for (var10 = 0; var10 < param2; var10++) {
            incrementValue$0 = param5;
            param5++;
            this.field_E[var9 + var10] = param4[incrementValue$0];
          }
          param5 = param5 + param6;
        }
    }

    final int[] Y() {
        return new int[]{this.field_G, this.field_i, this.field_r, this.field_j};
    }

    private final void f() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        int var1Lifetime1;
        for (var1 = 0; var1 < this.field_A; var1++) {
        }
        var1Lifetime1 = this.field_w * this.field_f + this.field_z;
        for (var2 = this.field_w; var2 < this.field_D; var2++) {
          for (var3 = 0; var3 < this.field_A; var3++) {
            this.field_e[var3].field_d.field_a[var2 - this.field_w] = var1Lifetime1;
          }
          var1Lifetime1 = var1Lifetime1 + this.field_f;
        }
    }

    final void b(int param0) {
        ui var4 = null;
        int var5 = 0;
        uh var6 = null;
        int var2 = param0 - this.field_B;
        Object var3 = this.field_F.a((byte) -16);
        while (var3 != null) {
          var4 = (ui) (var3);
          if (var4.field_e) {
            var4.field_i = var4.field_i + var2;
            var5 = var4.field_i / 20;
            if (var5 > 0) {
              var6 = this.field_a.a(false, var4.field_h);
              var4.a(var6.field_n * var2 * 50 / 1000, var6.field_j * var2 * 50 / 1000);
              var4.field_i = var4.field_i - var5 * 20;
            }
            var4.field_e = false;
          }
          var3 = this.field_F.b(6408);
        }
        this.field_B = param0;
        this.field_u.a((byte) -46, 5);
        this.field_F.a((byte) -35, 5);
    }

    final void a(sm param0) {
        lb var2 = (lb) (param0);
        this.field_f = var2.field_c;
        this.field_v = var2.field_b;
        this.field_E = var2.field_d;
        this.field_C = var2;
        this.field_x = var2.field_c;
        this.field_m = var2.field_b;
        this.g();
    }

    final RenderSprite a(vd param0, boolean param1) {
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        int[] var3;
        byte[] var4;
        int var5;
        int var6;
        Object var7;
        int[] var8;
        byte[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        byte[] var14;
        int[] var15;
        int[] var16;
        byte[] var17;
        int[] var18;
        int[] var19;
        int[] var20;
        byte[] var21;
        int[] var22;
        int[] var23;
        var20 = param0.field_f;
        var16 = var20;
        var3 = var16;
        var4 = param0.field_d;
        var5 = param0.field_h;
        var6 = param0.field_c;
        if (param1 &&
          param0.field_e == null) {
          var22 = new int[var20.length];
          var18 = var22;
          var8 = var18;
          var21 = new byte[var5 * var6];
          var17 = var21;
          var14 = var17;
          var9 = var14;
          for (var10 = 0; var10 < var6; var10++) {
            var11 = var10 * var5;
            for (var12 = 0; var12 < var5; var12++) {
              var14[var11 + var12] = var4[var11 + var12];
            }
          }
          for (var10 = 0; var10 < var20.length; var10++) {
            var8[var10] = var20[var10];
          }
          var7 = new mt(this, var21, var22, var5, var6);
        } else {
          var23 = new int[var5 * var6];
          var19 = var23;
          var15 = var19;
          var9 = param0.field_e;
          if (var9 != null) {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                var15[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
              }
            }
            var7 = new jg(this, var23, var5, var6);
          } else {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                var13 = var3[var4[var11 + var12] & 255];
                stackIn_26_0 = var15;
                stackIn_26_1 = var11 + var12;
                if (var13 == 0) {
                  stackIn_27_2 = 0;
                } else {
                  stackIn_27_2 = -16777216 | var13;
                }
                stackIn_26_0[stackIn_26_1] = stackIn_27_2;
              }
            }
            var7 = new vh(this, var23, var5, var6);
          }
        }
        ((RenderSprite) (var7)).a(param0.field_a, param0.field_i, param0.field_g, param0.field_b);
        return (RenderSprite) (var7);
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var13Lifetime1;
        if (param0 < this.field_z) {
          param2 = param2 - (this.field_z - param0);
          param0 = this.field_z;
        }
        if (param1 < this.field_w) {
          param3 = param3 - (this.field_w - param1);
          param1 = this.field_w;
        }
        if (param0 + param2 > this.field_k) {
          param2 = this.field_k - param0;
        }
        if (param1 + param3 > this.field_D) {
          param3 = this.field_D - param1;
        }
        if (param2 > 0) {
          if (param3 > 0 &&
            param0 <= this.field_k &&
            param1 <= this.field_D) {
            var7 = this.field_f - param2;
            var8 = param0 + param1 * this.field_f;
            var9 = param4 >>> 24;
            if (param5 != 0 && (param5 != 1 ||
              var9 != 255)) {
              if (param5 == 1) {
                param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                var10 = 256 - var9;
                for (var11 = 0; var11 < param3; var11++) {
                  for (var12 = -param2; var12 < 0; var12++) {
                    var13 = this.field_E[var8];
                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                    incrementValue$1 = var8;
                    var8++;
                    this.field_E[incrementValue$1] = param4 + var13;
                  }
                  var8 = var8 + var7;
                }
                return;
              }
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              for (var10 = 0; var10 < param3; var10++) {
                for (var11 = -param2; var11 < 0; var11++) {
                  var12 = this.field_E[var8];
                  var13Lifetime1 = param4 + var12;
                  var14 = (param4 & 16711935) + (var12 & 16711935);
                  var12 = (var14 & 16777472) + (var13Lifetime1 - var14 & 65536);
                  incrementValue$0 = var8;
                  var8++;
                  this.field_E[incrementValue$0] = var13Lifetime1 - var12 | var12 - (var12 >>> 8);
                }
                var8 = var8 + var7;
              }
              return;
            }
            var10 = param2 >> 3;
            var11 = param2 & 7;
            param2 = var8 - 1;
            for (var12 = -param3; var12 < 0; var12++) {
              if (var10 > 0) {
                param0 = var10;
                do {
                  param2++;
                  this.field_E[param2] = param4;
                  param2++;
                  this.field_E[param2] = param4;
                  param2++;
                  this.field_E[param2] = param4;
                  param2++;
                  this.field_E[param2] = param4;
                  param2++;
                  this.field_E[param2] = param4;
                  param2++;
                  this.field_E[param2] = param4;
                  param2++;
                  this.field_E[param2] = param4;
                  param2++;
                  this.field_E[param2] = param4;
                  param0--;
                } while (param0 > 0);
              }
              if (var11 > 0) {
                param0 = var11;
                do {
                  param2++;
                  this.field_E[param2] = param4;
                  param0--;
                } while (param0 > 0);
              }
              param2 = param2 + var7;
            }
          } else {
            return;
          }
        }
    }

    private kj(d param0) {
        super(param0);
        iu discarded$0 = null;
        this.field_h = false;
        this.field_y = false;
        this.field_g = new IntrusiveNodeHashTable(4);
        this.field_d = 50;
        this.field_z = 0;
        this.field_w = 0;
        this.field_o = 3500;
        this.field_j = 512;
        this.field_k = 0;
        this.field_D = 0;
        this.field_r = 512;
        this.field_u = new gq(16);
        try {
          this.field_F = new gq(256);
          discarded$0 = new iu();
          this.f(1);
          this.d(0);
          fr.a(true, 0, true);
          this.field_h = true;
          this.field_B = (int)kh.a(-61);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.a(-9);
          throw new RuntimeException("");
        }
    }

    private final void j() {
        this.field_z = 0;
        this.field_w = 0;
        this.field_k = this.field_f;
        this.field_D = this.field_v;
        this.f();
    }

    final void a(za param0) {
    }

    final za c(int param0) {
        return null;
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var9Lifetime3;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        int var9Lifetime4;
        int var11Lifetime2Lifetime1;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 == 0) {
          if (param2 < 0) {
            this.U(param0 + param2, param1, -param2 + 1, param4, param5);
          } else {
            this.U(param0, param1, param2 + 1, param4, param5);
          }
          return;
        }
        if (param2 == 0) {
          if (param3 < 0) {
            this.b(param0, param1 + param3, -param3 + 1, param4, param5);
          } else {
            this.b(param0, param1, param3 + 1, param4, param5);
          }
          return;
        }
        if (param2 + param3 < 0) {
          param0 = param0 + param2;
          param2 = -param2;
          param1 = param1 + param3;
          param3 = -param3;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param2 <= param3) {
          param0 = param0 << 16;
          param0 = param0 + 32768;
          param2 = param2 << 16;
          var7 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
          param3 = param3 + param1;
          if (param1 < this.field_w) {
            param0 = param0 + var7 * (this.field_w - param1);
            param1 = this.field_w;
          }
          if (param3 >= this.field_D) {
            param3 = this.field_D - 1;
          }
          var8 = param4 >>> 24;
          if (param5 != 0 && (param5 != 1 ||
            var8 != 255)) {
            if (param5 == 1) {
              param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
              var9 = 256 - var8;
              while (param1 <= param3) {
                var10 = param0 >> 16;
                if (var10 >= this.field_z &&
                  var10 < this.field_k) {
                  var11 = var10 + param1 * this.field_f;
                  var12 = this.field_E[var11];
                  var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field_E[var10 + param1 * this.field_f] = param4 + var12;
                }
                param0 = param0 + var7;
                param1++;
              }
            } else {
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              while (param1 <= param3) {
                var9Lifetime4 = param0 >> 16;
                if (var9Lifetime4 >= this.field_z &&
                  var9Lifetime4 < this.field_k) {
                  var10Lifetime2 = var9Lifetime4 + param1 * this.field_f;
                  var11Lifetime2 = this.field_E[var10Lifetime2];
                  var12Lifetime2 = param4 + var11Lifetime2;
                  var13 = (param4 & 16711935) + (var11Lifetime2 & 16711935);
                  var11Lifetime2Lifetime1 = (var13 & 16777472) + (var12Lifetime2 - var13 & 65536);
                  this.field_E[var10Lifetime2] = var12Lifetime2 - var11Lifetime2Lifetime1 | var11Lifetime2Lifetime1 - (var11Lifetime2Lifetime1 >>> 8);
                }
                param0 = param0 + var7;
                param1++;
              }
            }
          } else {
            while (param1 <= param3) {
              var9Lifetime3 = param0 >> 16;
              if (var9Lifetime3 >= this.field_z &&
                var9Lifetime3 < this.field_k) {
                this.field_E[var9Lifetime3 + param1 * this.field_f] = param4;
              }
              param0 = param0 + var7;
              param1++;
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          param1 = param1 << 16;
          param1 = param1 + 32768;
          param3 = param3 << 16;
          var7Lifetime1 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
          param2 = param2 + param0;
          if (param0 < this.field_z) {
            param1 = param1 + var7Lifetime1 * (this.field_z - param0);
            param0 = this.field_z;
          }
          if (param2 >= this.field_k) {
            param2 = this.field_k - 1;
          }
          var8Lifetime1 = param4 >>> 24;
          if (param5 != 0 && (param5 != 1 ||
            var8Lifetime1 != 255)) {
            if (param5 == 1) {
              param4 = ((param4 & 16711935) * var8Lifetime1 >> 8 & 16711935) + ((param4 & 65280) * var8Lifetime1 >> 8 & 65280) + (var8Lifetime1 << 24);
              var9Lifetime1 = 256 - var8Lifetime1;
              while (param0 <= param2) {
                var10Lifetime1 = param1 >> 16;
                if (var10Lifetime1 >= this.field_w &&
                  var10Lifetime1 < this.field_D) {
                  var11Lifetime1 = param0 + var10Lifetime1 * this.field_f;
                  var12Lifetime1 = this.field_E[var11Lifetime1];
                  var12Lifetime1 = ((var12Lifetime1 & 16711935) * var9Lifetime1 >> 8 & 16711935) + ((var12Lifetime1 & 65280) * var9Lifetime1 >> 8 & 65280);
                  this.field_E[var11Lifetime1] = param4 + var12Lifetime1;
                }
                param1 = param1 + var7Lifetime1;
                param0++;
              }
            } else {
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              while (param0 <= param2) {
                var9Lifetime1 = param1 >> 16;
                if (var9Lifetime1 >= this.field_w &&
                  var9Lifetime1 < this.field_D) {
                  var10Lifetime1 = param0 + var9Lifetime1 * this.field_f;
                  var11Lifetime1 = this.field_E[var10Lifetime1];
                  var12Lifetime1 = param4 + var11Lifetime1;
                  var13Lifetime1 = (param4 & 16711935) + (var11Lifetime1 & 16711935);
                  var11Lifetime1 = (var13Lifetime1 & 16777472) + (var12Lifetime1 - var13Lifetime1 & 65536);
                  this.field_E[var10Lifetime1] = var12Lifetime1 - var11Lifetime1 | var11Lifetime1 - (var11Lifetime1 >>> 8);
                }
                param1 = param1 + var7Lifetime1;
                param0++;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            while (param0 <= param2) {
              var9Lifetime2 = param1 >> 16;
              if (var9Lifetime2 >= this.field_w &&
                var9Lifetime2 < this.field_D) {
                this.field_E[param0 + var9Lifetime2 * this.field_f] = param4;
              }
              param1 = param1 + var7Lifetime1;
              param0++;
            }
          }
        }

    }

    final RendererBitmapFont a(BitmapFontMetrics param0, vd[] param1, boolean param2) {
        int var7 = 0;
        int[] var4;
        int[] var5;
        int var6;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        for (var7 = 0; var7 < param1.length; var7++) {
          var4[var7] = param1[var7].field_h;
          var5[var7] = param1[var7].field_c;
          if (param1[var7].field_e != null) {
            var6 = 1;
          }
        }
        if (!param2) {
          if (var6 == 0) {
            return (RendererBitmapFont) ((Object) new be(this, param0, param1, var4, var5));
          }
          throw new IllegalArgumentException("");
        }
        if (var6 == 0) {
          return (RendererBitmapFont) ((Object) new tu(this, param0, param1, var4, var5));
        }
        return (RendererBitmapFont) ((Object) new ts(this, param0, param1, var4, var5));
    }

    private final void f(int param0) {
        int var2 = 0;
        this.field_A = param0;
        this.field_e = new it[this.field_A];
        for (var2 = 0; var2 < this.field_A; var2++) {
          this.field_e[var2] = new it(this);
        }
    }

    final void b(int param0, int param1) throws lp {
        java.awt.Graphics var3 = null;
        if (this.field_l == null ||
          this.field_p == null) {
          throw new IllegalStateException(field_H);
        }
        try {
          var3 = this.field_l.getGraphics();
          this.field_p.a(this.field_q, param1, 0, this.field_n, -57, var3, param0, 0);
        } catch (Exception exception) {
          this.field_l.repaint();
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        if (param2 > this.field_f) {
          param2 = this.field_f;
        }
        if (param3 > this.field_v) {
          param3 = this.field_v;
        }
        this.field_z = param0;
        this.field_k = param2;
        this.field_w = param1;
        this.field_D = param3;
        this.f();
    }

    final boolean b() {
        return false;
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1Lifetime1;
        if (param1 >= this.field_w) {
          if (param1 >= this.field_D) {
            return;
          }
          if (param0 < this.field_z) {
            param2 = param2 - (this.field_z - param0);
            param0 = this.field_z;
          }
          if (param0 + param2 > this.field_k) {
            param2 = this.field_k - param0;
          }
          var6 = param0 + param1 * this.field_f;
          var7 = param3 >>> 24;
          if (param4 != 0 && (param4 != 1 ||
            var7 != 255)) {
            if (param4 == 1) {
              param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < param2; var9++) {
                var10 = this.field_E[var6 + var9];
                var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                this.field_E[var6 + var9] = param3 + var10;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < param2; var8Lifetime2++) {
              var9Lifetime1 = this.field_E[var6 + var8Lifetime2];
              var10Lifetime1 = param3 + var9Lifetime1;
              var11 = (param3 & 16711935) + (var9Lifetime1 & 16711935);
              var9Lifetime1Lifetime1 = (var11 & 16777472) + (var10Lifetime1 - var11 & 65536);
              this.field_E[var6 + var8Lifetime2] = var10Lifetime1 - var9Lifetime1Lifetime1 | var9Lifetime1Lifetime1 - (var9Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < param2; var8Lifetime1++) {
            this.field_E[var6 + var8Lifetime1] = param3;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.U(param0, param1, param2, param4, param5);
        this.U(param0, param1 + param3 - 1, param2, param4, param5);
        this.b(param0, param1 + 1, param3 - 2, param4, param5);
        this.b(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
    }

    final gd a(int param0, int param1) {
        return (gd) ((Object) new ac(param0, param1));
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        java.awt.Dimension var5 = null;
        oe var4 = (oe) (this.field_g.findByKey((byte) 106, (long)param0.hashCode()));
        if (var4 != null) {
          var4.unlink(-128);
          var4 = oi.a(param0, -43, param1, param2);
          this.field_g.put(-32, (long)param0.hashCode(), var4);
          if (this.field_l == param0 &&
            this.field_C == null) {
            var5 = param0.getSize();
            this.field_q = var5.width;
            this.field_n = var5.height;
            this.field_p = var4;
            this.field_E = var4.field_e;
            this.field_f = var4.field_g;
            this.field_v = var4.field_h;
            if (this.field_f != this.field_x ||
              this.field_v != this.field_m) {
              this.field_x = this.field_f;
              this.field_s = this.field_f;
              this.field_m = this.field_v;
              this.field_t = this.field_v;
            }
            this.g();
          }
          return;
        }
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_G = param0;
        this.field_i = param1;
        this.field_r = param2;
        this.field_j = param3;
        this.f();
    }

    final void f(int param0, int param1) {
        it discarded$0 = this.a((Runnable) ((Object) Thread.currentThread()));
        this.field_d = param0;
        this.field_o = param1;
    }

    private final void a(java.awt.Canvas param0) {
        oe var2;
        java.awt.Dimension var3;
        if (param0 == null) {
          this.field_l = null;
          this.field_p = null;
          if (this.field_C == null) {
            this.field_E = null;
            this.field_v = 1;
            this.field_f = 1;
            this.field_m = 1;
            this.field_x = 1;
            this.g();
          }
        } else {
          var2 = (oe) (this.field_g.findByKey((byte) 106, (long)param0.hashCode()));
          if (var2 != null) {
            this.field_l = param0;
            var3 = param0.getSize();
            this.field_q = var3.width;
            this.field_n = var3.height;
            this.field_p = var2;
            if (this.field_C == null) {
              this.field_E = var2.field_e;
              this.field_f = var2.field_g;
              this.field_v = var2.field_h;
              if (this.field_f != this.field_x ||
                this.field_v != this.field_m) {
                this.field_x = this.field_f;
                this.field_s = this.field_f;
                this.field_m = this.field_v;
                this.field_t = this.field_v;
              }
              this.g();
            }
          }
        }
    }

    final RenderSprite a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var10 = 0;
        int incrementValue$4 = 0;
        int var7;
        int var8;
        int var9;
        int var11;
        var7 = 0;
        var8 = param1;
        var9 = 0;
        scanLoop1: while (true) {
          if (var9 < param4) {
            for (var10 = 0; var10 < param3; var10++) {
              incrementValue$4 = var8;
              var8++;
              var11 = param0[incrementValue$4] >>> 24;
              if (var11 != 0 &&
                var11 != 255) {
                var7 = 1;
                break scanLoop1;
              }
            }
            var9++;
            continue;
          }
          break;
        }
        if (var7 == 0) {
          return (RenderSprite) ((Object) new vh(this, param0, param1, param2, param3, param4, param5));
        }
        return (RenderSprite) ((Object) new jg(this, param0, param1, param2, param3, param4, param5));
    }

    final void a() {
        if (this.field_l != null) {
          this.field_E = this.field_p.field_e;
          this.field_f = this.field_p.field_g;
          this.field_v = this.field_p.field_h;
          this.field_x = this.field_s;
          this.field_m = this.field_t;
        } else {
          this.field_f = 1;
          this.field_v = 1;
          this.field_E = null;
          this.field_x = 1;
          this.field_m = 1;
        }
        this.field_C = null;
        this.g();
    }

    private final void g() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_A; var1++) {
          this.field_e[var1].a(false);
        }
        this.j();
    }

    private final void d(int param0) {
        this.field_e[param0].a((Runnable) ((Object) Thread.currentThread()), 6);
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (this.field_z < param0) {
          this.field_z = param0;
        }
        if (this.field_w < param1) {
          this.field_w = param1;
        }
        if (this.field_k > param2) {
          this.field_k = param2;
        }
        if (this.field_D > param3) {
          this.field_D = param3;
        }
        this.f();
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1Lifetime1;
        if (param0 >= this.field_z) {
          if (param0 >= this.field_k) {
            return;
          }
          if (param1 < this.field_w) {
            param2 = param2 - (this.field_w - param1);
            param1 = this.field_w;
          }
          if (param1 + param2 > this.field_D) {
            param2 = this.field_D - param1;
          }
          var6 = param0 + param1 * this.field_f;
          var7 = param3 >>> 24;
          if (param4 != 0 && (param4 != 1 ||
            var7 != 255)) {
            if (param4 == 1) {
              param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < param2; var9++) {
                var10 = var6 + var9 * this.field_f;
                var11 = this.field_E[var10];
                var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                this.field_E[var10] = param3 + var11;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < param2; var8Lifetime2++) {
              var9Lifetime1 = var6 + var8Lifetime2 * this.field_f;
              var10Lifetime1 = this.field_E[var9Lifetime1];
              var11Lifetime1 = param3 + var10Lifetime1;
              var12 = (param3 & 16711935) + (var10Lifetime1 & 16711935);
              var10Lifetime1Lifetime1 = (var12 & 16777472) + (var11Lifetime1 - var12 & 65536);
              this.field_E[var9Lifetime1] = var11Lifetime1 - var10Lifetime1Lifetime1 | var10Lifetime1Lifetime1 - (var10Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < param2; var8Lifetime1++) {
            this.field_E[var6 + var8Lifetime1 * this.field_f] = param3;
          }
        }
    }

    final int XA() {
        return this.field_o;
    }

    kj(java.awt.Canvas param0, d param1, int param2, int param3) {
        this(param1);
        try {
          this.b(param0, param2, param3);
          this.a(param0);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.a(-9);
          throw new RuntimeException("");
        }
    }

    final boolean d() {
        return false;
    }

    final boolean h() {
        return this.field_y;
    }

    final void K(int[] param0) {
        param0[0] = this.field_z;
        param0[1] = this.field_w;
        param0[2] = this.field_k;
        param0[3] = this.field_D;
    }

    final void c() {
        if (this.field_h) {
          RendererBitmapFont.a(121, false, true);
          this.field_h = false;
        }
        this.field_p = null;
        this.field_l = null;
        this.field_q = 0;
        this.field_n = 0;
        this.field_g = null;
        this.field_y = true;
    }

    final sm a(ra param0, gd param1) {
        return (sm) ((Object) new lb(this, (RenderSprite) (param0), (ac) (param1)));
    }

    static {
        field_H = "off";
    }
}
