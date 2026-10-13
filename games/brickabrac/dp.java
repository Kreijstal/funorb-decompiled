/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends ki {
    static mh field_x;
    static String field_s;
    static int[] field_r;
    static String field_t;
    private static RgbSprite field_u;
    static mh[] field_w;
    static boolean field_y;
    static co field_v;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (param1 <= -1) {
          Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, 7829367, 22953);
          if (this.b((byte) -115)) {
            LevelPackLoader.field_f.drawTransparent(param2, param3);
          }
          var5 = 36 % ((param0 + 28) / 43);
          return;
        }
        Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, kg.field_d[param1], 22953);
        if (this.b((byte) -115)) {
          LevelPackLoader.field_f.drawTransparent(param2, param3);
        }
        var5Lifetime1 = 36 % ((param0 + 28) / 43);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        RasterCacheSurface var7 = null;
        if (!param0) {
          this.a(-127, false);
          if (!this.b((byte) -106)) {
            Rasterizer2D.fillVerticalGradient(param4, param2, 640, 480, kg.field_d[param3], 22953);
            return;
          }
          var7 = PowerUp.a(this.field_m, param3, -20777);
          if (!var7.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            s.a(ch.field_m, 1, param3, th.field_j, var7, 0, (byte) -86, va.field_b);
            var7.setCacheKeys(this.field_m, param3, (byte) 78);
          }
          qh.a(1, 0, ni.field_Ub, param1, nf.field_U, 67, 640, param4, var7.sprite, param2);
          return;
        }
        if (!this.b((byte) -106)) {
          Rasterizer2D.fillVerticalGradient(param4, param2, 640, 480, kg.field_d[param3], 22953);
          return;
        }
        RasterCacheSurface var8 = PowerUp.a(this.field_m, param3, -20777);
        if (!var8.matchesCacheKeys((byte) -84, param3, this.field_m)) {
          s.a(ch.field_m, 1, param3, th.field_j, var8, 0, (byte) -86, va.field_b);
          var8.setCacheKeys(this.field_m, param3, (byte) 78);
        }
        qh.a(1, 0, ni.field_Ub, param1, nf.field_U, 67, 640, param4, var8.sprite, param2);
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          return (RgbSprite[]) null;
        }
        return qg.field_r[param0 - 1];
    }

    final boolean a(boolean param0) {
        if (!AchievementIcon.field_m.a("halloween", -28138)) {
          return false;
        }
        nf.field_U = pl.loadRgbSpriteByName("halloween", "halloween_near", (byte) -116, AchievementIcon.field_m);
        ni.field_Ub = pl.loadRgbSpriteByName("halloween", "halloween_mid", (byte) 116, AchievementIcon.field_m);
        dj.field_e = pl.loadRgbSpriteByName("halloween", "halloween_far", (byte) 120, AchievementIcon.field_m);
        LevelPackLoader.field_f = pl.loadRgbSpriteByName("halloween", "halloween_small", (byte) 105, AchievementIcon.field_m);
        MotionWaypoint.field_p = pl.loadRgbSpriteByName("halloween", "halloween_moon", (byte) 102, AchievementIcon.field_m);
        va.field_b = jh.a(0, nf.field_U);
        field_u = jh.a(0, ni.field_Ub);
        ch.field_m = jh.a(0, dj.field_e);
        th.field_j = jh.a(0, MotionWaypoint.field_p);
        ba.field_A = pl.loadRgbSpriteByName("halloween", "halloween_character", (byte) -106, AchievementIcon.field_m);
        ej.field_L[0] = cr.loadRgbSpritesByName("halloween", AchievementIcon.field_m, "halloween_caps", 2);
        qg.field_r[0] = cr.loadRgbSpritesByName("halloween", AchievementIcon.field_m, "halloween_segs", 2);
        ap.field_c[0] = pl.loadRgbSpriteByName("halloween", "halloween_centre", (byte) -118, AchievementIcon.field_m);
        ej.field_L[1] = ig.a(ej.field_L[0], param0);
        qg.field_r[1] = ig.a(qg.field_r[0], param0);
        ap.field_c[1] = pl.a(-16371, ap.field_c[0]);
        return true;
    }

    final int c(int param0) {
        if (param0 >= -72) {
          return 2;
        }
        return 128;
    }

    final static void a(int param0, int param1, boolean param2, int param3, RgbSprite param4, RasterCacheSurface param5) {
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-95, param5.sprite);
          Rasterizer2D.clear();
          param4.b(-(60 / param0) + (-param4.canvasWidth + param5.width) / 2, -param4.canvasHeight + param1 - (-param5.height + 130 / param0), 0, 208);
          la.a(0, 0, param5.width, param5.height, 0, nj.field_G[param3], 96);
          if (param2) {
            RasterCacheSurface var7 = (RasterCacheSurface) null;
            dp.a(82, 29, true, -26, (RgbSprite) null, (RasterCacheSurface) null);
          }
          sc.popRaster(-80);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "dp.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(byte param0) {
        boolean stackIn_19_0 = false;
        boolean stackIn_40_0 = false;
        RasterCacheSurface var3;
        if (param0 <= -91) {
          if (nf.field_U == null) {
            return false;
          }
          if (null == ni.field_Ub) {
            return false;
          }
          if (dj.field_e == null) {
            return false;
          }
          if (LevelPackLoader.field_f == null) {
            return false;
          }
          if (null == MotionWaypoint.field_p) {
            return false;
          }
          if (null == ba.field_A) {
            return false;
          }
          if (null == ej.field_L) {
            return false;
          }
          if (null == qg.field_r) {
            return false;
          }
          stackIn_40_0 = (ap.field_c != null);
          return stackIn_40_0;
        }
        var3 = (RasterCacheSurface) null;
        dp.a(62, -82, true, -61, (RgbSprite) null, (RasterCacheSurface) null);
        if (nf.field_U == null) {
          return false;
        }
        if (null == ni.field_Ub) {
          return false;
        }
        if (dj.field_e == null) {
          return false;
        }
        if (LevelPackLoader.field_f == null) {
          return false;
        }
        if (null == MotionWaypoint.field_p) {
          return false;
        }
        if (null == ba.field_A) {
          return false;
        }
        if (null == ej.field_L) {
          return false;
        }
        if (null == qg.field_r) {
          return false;
        }
        stackIn_19_0 = (ap.field_c != null);
        return stackIn_19_0;
    }

    dp(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
          qg.field_r = new RgbSprite[2][];
          ej.field_L = new RgbSprite[2][];
          ap.field_c = new RgbSprite[2];
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "dp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        RasterCacheSurface var7 = null;
        if (param1 >= -84) {
          this.a(true);
          if (!this.b((byte) -126)) {
            Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, kg.field_d[param3], 22953);
            return;
          }
          var7 = kd.a(this.field_m, param3, (byte) 116);
          if (!var7.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            s.a(ch.field_m, 2, param3, th.field_j, var7, -13, (byte) -96, va.field_b);
            var7.setCacheKeys(this.field_m, param3, (byte) 78);
            qh.a(2, -13, field_u, param4, va.field_b, 62, 306, param2, var7.sprite, param0);
            return;
          }
          qh.a(2, -13, field_u, param4, va.field_b, 62, 306, param2, var7.sprite, param0);
          return;
        }
        if (!this.b((byte) -126)) {
          Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, kg.field_d[param3], 22953);
          return;
        }
        RasterCacheSurface var8 = kd.a(this.field_m, param3, (byte) 116);
        if (var8.matchesCacheKeys((byte) -84, param3, this.field_m)) {
          qh.a(2, -13, field_u, param4, va.field_b, 62, 306, param2, var8.sprite, param0);
          return;
        }
        s.a(ch.field_m, 2, param3, th.field_j, var8, -13, (byte) -96, va.field_b);
        var8.setCacheKeys(this.field_m, param3, (byte) 78);
        qh.a(2, -13, field_u, param4, va.field_b, 62, 306, param2, var8.sprite, param0);
    }

    final RgbSprite a(boolean param0, int param1) {
        if (!param0) {
          field_u = (RgbSprite) null;
          return ap.field_c[-1 + param1];
        }
        return ap.field_c[-1 + param1];
    }

    final RgbSprite c(byte param0) {
        if (param0 > -74) {
          field_y = false;
          return ba.field_A;
        }
        return ba.field_A;
    }

    public static void f(int param0) {
        field_r = null;
        field_t = null;
        field_s = null;
        field_w = null;
        field_u = null;
        field_v = null;
        field_x = null;
        if (param0 != 1) {
          field_w = (mh[]) null;
        }
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = -12 % ((65 - param0) / 49);
        return ej.field_L[-1 + param1];
    }

    static {
        field_s = "Back";
        field_r = new int[]{100, 350, 750, 10, 25, 15, 30, 30000, 60000, 30, 60, 10, 10, 25, 5, 10, 1, 1, 3, 10, 20, 30, 7, 1, 2, 3, 1, 1, 1, 10, 5, 10, 5, 10, 100, 500, 2500, 5000, 15000, 1000, 135000, 5};
    }
}
