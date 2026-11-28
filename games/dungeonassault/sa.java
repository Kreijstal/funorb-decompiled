/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    private int field_m;
    static cf[] field_v;
    private int field_d;
    private int field_s;
    static String field_h;
    private int field_q;
    private int field_j;
    int field_k;
    private RgbSprite field_a;
    private int field_p;
    static String field_w;
    private RgbSprite field_u;
    static BufferedRandomAccessFile field_x;
    private RgbSprite field_g;
    private RgbSprite field_c;
    int field_b;
    private int field_l;
    static int field_f;
    private int field_o;
    static String field_t;
    private RgbSprite field_r;
    private int field_n;
    private int field_i;
    int field_y;
    static String field_e;

    final void a(RgbSprite param0, int param1, boolean param2, int param3, int param4) {
        RgbSprite var7 = null;
        try {
          this.field_i = this.field_l;
          this.field_n = this.field_p;
          int var6_int = 14 % ((58 - param3) / 52);
          this.field_a = this.field_r;
          this.field_c = this.field_u;
          this.field_p = param1;
          this.field_l = param4;
          if (param2) {
            this.field_q = param4;
            this.field_g = param0;
            this.field_d = param1;
          } else {
            this.field_s = 32;
          }
          this.field_u = param0;
          this.field_r = new RgbSprite(this.field_u.field_y + 4, 4 + this.field_u.field_v);
          jh.a(this.field_r);
          this.field_u.drawSilhouette(2, 2, 12690143);
          SoftwareRasterizer.blurRectangle(2, 2, 0, 0, this.field_r.field_y, this.field_r.field_v);
          jh.b();
          var7 = this.field_r;
          this.field_r.field_A = -2;
          var7.field_w = -2;
          this.field_o = 384;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "sa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_x = null;
        if (param0) {
          field_x = (BufferedRandomAccessFile) null;
        }
        field_h = null;
        field_e = null;
        field_t = null;
        field_v = null;
        field_w = null;
    }

    private final void a(int param0) {
        if (param0 != 384) {
          RgbSprite var3 = (RgbSprite) null;
          this.a(33, false, (RgbSprite) null);
        }
        this.a(this.field_g, this.field_d, true, -89, this.field_q);
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = DungeonAssault.field_K;
        var2 = (-this.field_u.field_y + this.field_b >> 1) + this.field_m;
        var3 = this.field_j + this.field_l;
        if (0 == this.field_o) {
          this.a(var2, var3, this.field_u, (byte) -66);
        } else {
          if (this.field_o <= 256) {
            if (this.field_o <= 128) {
              this.a(var3, (byte) -28, var2, this.field_o << 1, this.field_r);
              this.a(var3, (byte) 105, var2, 128 - this.field_o << 1, this.field_u);
            } else {
              if (this.field_c != null) {
                var4 = this.field_m + (this.field_b - this.field_c.field_y >> 1);
                var5 = this.field_i + this.field_j;
                this.a(var5, (byte) 62, var4, this.field_o - 128 << 1, this.field_a);
              }
              this.a(var3, (byte) 107, var2, -this.field_o + 256 << 1, this.field_r);
            }
          } else {
            if (null != this.field_c) {
              var4 = this.field_m + (this.field_b - this.field_c.field_y >> 1);
              var5 = this.field_i + this.field_j;
              this.a(var5, (byte) 80, var4, -256 + this.field_o << 1, this.field_c);
              this.a(var5, (byte) -35, var4, -this.field_o + 384 << 1, this.field_a);
            }
          }
        }
        if (param0 >= -20) {
          field_h = (String) null;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, RgbSprite param4) {
        int[] var13 = null;
        int[] var11 = null;
        int[] var10 = null;
        int[] var16 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = DungeonAssault.field_K;
        int var8Lifetime1;
        try {
          var13 = new int[4];
          var11 = var13;
          var10 = var11;
          var16 = var10;
          SoftwareRasterizer.saveClip(var13);
          for (var7 = 1; var7 < this.field_k; var7++) {
            var8 = var7 * param3 / this.field_k;
            SoftwareRasterizer.setClip(this.field_m, var7 + this.field_j, this.field_m + this.field_b, 1 + (this.field_j + var7));
            param4.drawAdditive(param2, param0, var8);
            SoftwareRasterizer.setClip(this.field_m, this.field_y + (this.field_j - 1) - var7, this.field_b + this.field_m, -var7 + (this.field_j + this.field_y));
            param4.drawAdditive(param2, param0, var8);
          }
          var8Lifetime1 = -112 / ((param1 - 27) / 32);
          SoftwareRasterizer.setClip(this.field_m, this.field_k + this.field_j, this.field_m + this.field_b, this.field_j + this.field_y - this.field_k);
          param4.drawAdditive(param2, param0, param3);
          SoftwareRasterizer.restoreClip(var16);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "sa.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, RgbSprite param2, byte param3) {
        int[] var12 = null;
        int[] var10 = null;
        int[] var9 = null;
        int[] var15 = null;
        int var7 = 0;
        int var6 = 0;
        int var8 = DungeonAssault.field_K;
        int var6Lifetime1;
        try {
          var12 = new int[4];
          var10 = var12;
          var9 = var10;
          var15 = var9;
          SoftwareRasterizer.saveClip(var12);
          for (var6 = 1; this.field_k > var6; var6++) {
            var7 = (var6 << 8) / this.field_k;
            SoftwareRasterizer.setClip(this.field_m, this.field_j + var6, this.field_m + this.field_b, var6 + (this.field_j + 1));
            param2.drawWithOpacity(param0, param1, var7);
            SoftwareRasterizer.setClip(this.field_m, -var6 + (-1 + (this.field_y + this.field_j)), this.field_b + this.field_m, this.field_y + this.field_j - var6);
            param2.drawWithOpacity(param0, param1, var7);
          }
          var6Lifetime1 = -73 / ((param3 + 20) / 35);
          SoftwareRasterizer.setClip(this.field_m, this.field_j + this.field_k, this.field_b + this.field_m, this.field_j + (this.field_y - this.field_k));
          param2.draw(param0, param1);
          SoftwareRasterizer.restoreClip(var15);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "sa.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, boolean param1, RgbSprite param2) {
        try {
          this.a(param2, 0, param1, 118, this.field_y - param2.field_v >> 1);
          if (param0 != 1929) {
            this.a(false);
          }
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "sa.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, String param1, byte param2, String param3, int param4) {
        int var13 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        String[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RgbSprite var11 = null;
        String[] var12 = null;
        String var14 = null;
        int var15 = 0;
        int[] var16 = null;
        var15 = DungeonAssault.field_K;
        try {
          jh.c();
          var6_int = -40 + this.field_b;
          var7 = jn.a(param3, new int[]{var6_int}, -121, la.field_b);
          var8 = var7.length;
          var9 = la.field_b.field_E + var8 * la.field_b.field_H;
          if (param1 != null) {
            var9 = var9 + 2 * la.field_b.field_H;
          }
          var10 = la.field_b.field_H;
          var11 = new RgbSprite(var6_int, var9);
          var11.bindAsRenderTarget();
          if (param1 != null) {
            db.field_v.drawCentred(param1, var6_int >> 1, var10, param4, -1);
            var10 = var10 + 2 * la.field_b.field_H;
          }
          var12 = var7;
          for (var13 = 0; var13 < var12.length; var13++) {
            var14 = var12[var13];
            la.field_b.drawCentred(var14, var6_int >> 1, var10, param4, -1);
            var10 = var10 + la.field_b.field_H;
          }
          jh.b();
          this.a(1929, param0, var11);
          if (param2 != 91) {
            var16 = (int[]) null;
            sa.a((byte) -10, -54, -25, -114, (int[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("sa.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        this.field_o = this.field_o - 12;
        if (this.field_o < 0) {
          this.field_o = 0;
        }
        if ((mo.field_a & 3) == 0) {
          if (this.field_o == 0) {
            fieldTemp$4 = this.field_p - 1;
            this.field_p = this.field_p - 1;
            if (fieldTemp$4 >= 0) {
              this.field_l = this.field_l - 1;
              if (this.field_p == 16) {
                this.a(384);
              }
            } else {
              if (this.field_g != this.field_u) {
                fieldTemp$5 = this.field_s - 1;
                this.field_s = this.field_s - 1;
                if (fieldTemp$5 <= 0) {
                  this.a(384);
                }
              }
            }
          }
          fieldTemp$6 = this.field_n - 1;
          this.field_n = this.field_n - 1;
          if (fieldTemp$6 >= 0) {
            this.field_i = this.field_i - 1;
          }
        }
        if (param0) {
          this.a(true);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = DungeonAssault.field_K;
        try {
          while (true) {
            param1--;
            if (param1 < 0) {
              if (param0 != 45) {
                var9 = (int[]) null;
                sa.a((byte) 65, 42, 56, 44, (int[]) null);
              }
              return;
            }
            var10 = param4;
            var5 = var10;
            var6 = param2;
            var7 = param3;
            var10[var6] = var7 + (nb.a(var10[var6], 16711422) >> 1);
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("sa.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    sa(int param0, int param1, int param2, int param3) {
        this.field_k = 16;
        this.field_b = param2;
        this.field_y = param3;
        this.field_j = param1;
        this.field_m = param0;
    }

    static {
        field_h = "Updates will sent to the email address you've given";
        field_w = "Loading graphics";
        field_e = "REVIVE";
    }
}
