/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NanoFrameClock extends FrameClock {
    static String field_m;
    private int field_r;
    static String[][] field_o;
    static SceneWidget field_t;
    static int[] field_u;
    private long[] field_h;
    static int field_k;
    private long field_f;
    private long field_i;
    private long field_s;
    static int[] field_g;
    static SceneWidget field_j;
    static String field_q;
    private int field_l;
    static int[] field_n;
    static String field_p;

    final static void a(int param0, ec param1, int param2, int param3) {
        try {
          if (param3 < 60) {
            NanoFrameClock.b(false);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "lj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final long nanosUntilNextTick(byte param0) {
        this.field_f = this.field_f + this.measureElapsedNanos((byte) 10);
        if (this.field_i > this.field_f) {
          return (-this.field_f + this.field_i) / 1000000L;
        }
        int var2 = -7 / ((-43 - param0) / 58);
        return 0L;
    }

    final void reset(int param0) {
        if (param0 != -12619) {
          field_u = (int[]) null;
        }
        this.field_s = 0L;
        if (this.field_i > this.field_f) {
          this.field_f = this.field_f + (-this.field_f + this.field_i);
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          NanoFrameClock.releaseStatics(-97);
        }
        return MusicPatchPcmStream.field_s;
    }

    final int waitForTicks(long param0, byte param1) {
        int var4;
        int var5;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 >= -15) {
          return 40;
        }
        if (this.field_f < this.field_i) {
          this.field_s = this.field_s + (-this.field_f + this.field_i);
          this.field_f = this.field_f + (this.field_i - this.field_f);
          this.field_i = this.field_i + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_i = this.field_i + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_i < this.field_f);
        if (this.field_f > this.field_i) {
          this.field_i = this.field_f;
        }
        return var4;
    }

    final static void renderThemeBackground(boolean param0, int param1) {
        int var2;
        int var3;
        Sprite var4;
        Sprite var5;
        int var6;
        Sprite var8;
        Sprite var9;
        Sprite var10;
        Sprite var11;
        Sprite var12;
        Sprite var13;
        Sprite var14;
        Sprite var15;
        Sprite var16;
        Sprite var17;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = param1;
        IntrusiveDeque.field_b = DiskCacheRequest.field_E[var2];
        wm.field_H[var2] = null;
        wm.field_H[var2] = new Sprite(640, 480);
        wm.field_H[var2].makeRasterTarget();
        if (5 != param1 &&
          param1 != 3 &&
          param1 != 2 &&
          4 != param1 &&
          param1 != 1 && (param1 != 7 ||
          null == SpriteState.field_z &&
          null == r.field_b)) {
          LoginMethod.a(640, 480, 0);
        }
        if (param1 == 0) {
          var8 = new Sprite(640, 480);
          var9 = var8;
          var9.makeRasterTarget();
          ArcanistsMulti.a(param1, (byte) -26);
          wm.field_H[var2].makeRasterTarget();
          var9.drawAdditive(0, 0, 128);
        }
        if (param1 == 0) {
          var3 = ValidationHelpWidget.field_U[param1] * NumericDateInputWidget.field_L[param1].length + tg.field_f[param1];
          var4 = new Sprite(640, 480);
          var4.makeRasterTarget();
          MusicPatchNode.field_F.drawTransparent(-64 + lm.field_e[param1], var3 - 80);
          BevelBoxPainter.field_a.drawTransparent(eo.field_b[param1] - 110, -70 + var3);
          pe.field_Ib.drawTransparent(lm.field_e[param1] - 39, tg.field_f[param1] - 66);
          TextTableInitializer.field_a.drawTransparent(-150 + eo.field_b[param1], -80 + tg.field_f[param1]);
          var5 = fj.loadSprite(ec.field_c, -22612, ue.field_d, "");
          if (ec.field_c.equals("underdark")) {
            var5.drawSilhouette(0, -8 + (-var5.field_y + 480), 16777215);
          } else {
            if (!ec.field_c.equals("clockwork")) {
              var5.drawSilhouette(0, -var5.field_y + 480, 16777215);
            } else {
              var5.drawSilhouette(0, 434 - var5.field_y, 16777215);
            }
          }
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].makeRasterTarget();
          var4.drawAdditive(0, 0, 255);
          MusicPatchNode.field_F.drawTransparent(lm.field_e[param1] - 64, var3 - 80);
          BevelBoxPainter.field_a.drawTransparent(eo.field_b[param1] - 110, -70 + var3);
          pe.field_Ib.drawTransparent(lm.field_e[param1] - 39, -66 + tg.field_f[param1]);
          TextTableInitializer.field_a.drawTransparent(-150 + eo.field_b[param1], tg.field_f[param1] - 80);
          if (!ec.field_c.equals("underdark")) {
            if (ec.field_c.equals("clockwork")) {
              var5.drawTransparent(0, 480 - var5.field_y - 46);
            } else {
              var5.drawTransparent(0, -var5.field_y + 480);
            }
          } else {
            var5.drawTransparent(0, -8 - var5.field_y + 480);
          }
        }
        if (param1 != 3) {
        }
        if (5 == param1) {
        }
        if (param1 == 6) {
          var10 = new Sprite(640, 480);
          var10.makeRasterTarget();
          gl.drawNineSliceFrame(371, 32, -27327, 576, kf.field_b, 63);
          wm.field_H[var2].makeRasterTarget();
          var10.drawAdditive(0, 0, 128);
          bj.clearInts(var10.field_A, 0);
          var10.makeRasterTarget();
          LoadingProgressDialog.field_mb.drawTransparent(-(LoadingProgressDialog.field_mb.field_n / 2) + 320, -5);
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].makeRasterTarget();
          var10.drawAdditive(0, 0, 255);
          LoadingProgressDialog.field_mb.drawTransparent(-(LoadingProgressDialog.field_mb.field_n / 2) + 320, -5);
        }
        if (7 == param1) {
          var11 = new Sprite(640, 480);
          var11.makeRasterTarget();
          gl.drawNineSliceFrame(385, 32, -27327, 576, kf.field_b, 63);
          wm.field_H[var2].makeRasterTarget();
          var11.drawAdditive(0, 0, 128);
          bj.clearInts(var11.field_A, 0);
          var11.makeRasterTarget();
          LoadingProgressDialog.field_mb.drawTransparent(320 - LoadingProgressDialog.field_mb.field_n / 2, -5);
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].makeRasterTarget();
          var11.drawAdditive(0, 0, 255);
          LoadingProgressDialog.field_mb.drawTransparent(320 - LoadingProgressDialog.field_mb.field_n / 2, -5);
        }
        if (param1 == 9) {
          var12 = new Sprite(640, 480);
          var12.makeRasterTarget();
          gl.drawNineSliceFrame(330, 32, -27327, 576, kf.field_b, 63);
          wm.field_H[var2].makeRasterTarget();
          var12.drawAdditive(0, 0, 128);
          var13 = new Sprite(640, 480);
          var13.makeRasterTarget();
          LoadingProgressDialog.field_mb.drawTransparent(320 - LoadingProgressDialog.field_mb.field_n / 2, 35);
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].makeRasterTarget();
          var13.drawAdditive(0, 0, 255);
          LoadingProgressDialog.field_mb.drawTransparent(-(LoadingProgressDialog.field_mb.field_n / 2) + 320, 35);
        }
        if (!param0) {
          NanoFrameClock.renderThemeBackground(true, -39);
        }
        if (param1 == 8) {
          var14 = new Sprite(640, 480);
          var14.makeRasterTarget();
          fe.field_o.drawSilhouette(0, 0, 16777215);
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].makeRasterTarget();
          var14.drawAdditive(0, 0, 255);
          fe.field_o.drawTransparent(0, 0);
          var15 = new Sprite(640, 480);
          var15.makeRasterTarget();
          MusicPatchNode.field_F.drawTransparent(343, -2);
          BevelBoxPainter.field_a.drawTransparent(108, 6);
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].makeRasterTarget();
          var15.drawAdditive(0, 0, 255);
          MusicPatchNode.field_F.drawTransparent(343, -2);
          BevelBoxPainter.field_a.drawTransparent(108, 6);
        }
        if (param1 == 11) {
          var16 = new Sprite(640, 480);
          var16.makeRasterTarget();
          LoadingProgressDialog.field_mb.drawTransparent(320 - LoadingProgressDialog.field_mb.field_n / 2 - 72, 10);
          LoadingProgressDialog.field_mb.drawTransparent(72 + (-(LoadingProgressDialog.field_mb.field_n / 2) + 320), 10);
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].makeRasterTarget();
          var16.drawAdditive(0, 0, 255);
          LoadingProgressDialog.field_mb.drawTransparent(248 - LoadingProgressDialog.field_mb.field_n / 2, 10);
          LoadingProgressDialog.field_mb.drawTransparent(72 - LoadingProgressDialog.field_mb.field_n / 2 + 320, 10);
        }
        if (param1 == 12) {
          var17 = new Sprite(640, 480);
          var17.makeRasterTarget();
          LoadingProgressDialog.field_mb.drawTransparent(248 - LoadingProgressDialog.field_mb.field_n / 2, 0);
          LoadingProgressDialog.field_mb.drawTransparent(72 + (320 - LoadingProgressDialog.field_mb.field_n / 2), 0);
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].makeRasterTarget();
          var17.drawAdditive(0, 0, 255);
          LoadingProgressDialog.field_mb.drawTransparent(320 - (LoadingProgressDialog.field_mb.field_n / 2 + 72), 0);
          LoadingProgressDialog.field_mb.drawTransparent(72 + (320 - LoadingProgressDialog.field_mb.field_n / 2), 0);
        }
        rk.g(491697968);
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        field_m = null;
        field_n = null;
        field_g = null;
        field_u = null;
        field_o = (String[][]) null;
        field_t = null;
        field_p = null;
        field_q = null;
        if (param0 != -80) {
          ec var2 = (ec) null;
          NanoFrameClock.a(-21, (ec) null, -125, -127);
        }
    }

    private final long measureElapsedNanos(byte param0) {
        int var9 = 0;
        int var10 = ArcanistsMulti.field_G ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -this.field_s + var2;
        this.field_s = var2;
        if (-5000000000L < var4 &&
          var4 < 5000000000L) {
          this.field_h[this.field_r] = var4;
          this.field_r = (this.field_r + 1) % 10;
          if (this.field_l < 1) {
            this.field_l = this.field_l + 1;
          }
        }
        long var6 = 0L;
        int var8 = 82 % ((51 - param0) / 35);
        for (var9 = 1; this.field_l >= var9; var9++) {
          var6 = var6 + this.field_h[(-var9 + this.field_r + 10) % 10];
        }
        return var6 / (long)this.field_l;
    }

    NanoFrameClock() {
        this.field_r = 0;
        this.field_h = new long[10];
        this.field_i = 0L;
        this.field_f = 0L;
        this.field_s = 0L;
        this.field_l = 1;
        this.field_f = System.nanoTime();
        this.field_i = System.nanoTime();
    }

    static {
        field_m = "Similar rating";
        field_u = new int[]{62};
        field_q = "ZOMBIE MONKEY KILLER - ";
        field_g = new int[]{12, 13, 14};
        field_n = new int[]{36, 37, 38};
        field_p = "Lobby";
    }
}
