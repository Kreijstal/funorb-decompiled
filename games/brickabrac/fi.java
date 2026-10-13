/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends ki {
    static MenuSelection field_r;
    static String field_u;
    static int[] field_w;
    static mh field_s;
    static int field_t;
    static String field_v;

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        RasterCacheSurface var8 = null;
        if (param1 >= -84) {
          this.a(false, 56, -90, -99, 75);
          if (!this.b((byte) -111)) {
            Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, pf.field_b[param3], 16777215);
            return;
          }
          var8 = kd.a(this.field_m, param3, (byte) 107);
          if (!var8.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            dk.a(2, param3, var8, -35, 23275, Brick.field_K);
            var8.setCacheKeys(this.field_m, param3, (byte) 78);
            SpriteGeometry.a(var8.sprite, 306, param0, param2, param3, param4, un.field_d, 2, jl.field_d, 1, -35);
            return;
          }
          SpriteGeometry.a(var8.sprite, 306, param0, param2, param3, param4, un.field_d, 2, jl.field_d, 1, -35);
          return;
        }
        if (!this.b((byte) -111)) {
          Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, pf.field_b[param3], 16777215);
          return;
        }
        RasterCacheSurface var9 = kd.a(this.field_m, param3, (byte) 107);
        if (var9.matchesCacheKeys((byte) -84, param3, this.field_m)) {
          SpriteGeometry.a(var9.sprite, 306, param0, param2, param3, param4, un.field_d, 2, jl.field_d, 1, -35);
          return;
        }
        dk.a(2, param3, var9, -35, 23275, Brick.field_K);
        var9.setCacheKeys(this.field_m, param3, (byte) 78);
        SpriteGeometry.a(var9.sprite, 306, param0, param2, param3, param4, un.field_d, 2, jl.field_d, 1, -35);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 22 % ((param0 + 28) / 43);
        if (param1 > -1) {
          Rasterizer2D.fillVerticalGradient(param2, param3, 160, 238, pf.field_b[param1], 16777215);
          if (this.b((byte) -107)) {
            be.field_d.drawTransparent(param2, param3);
            return;
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(param2, param3, 153, 240, 16777215, 11184810);
        if (this.b((byte) -107)) {
          be.field_d.drawTransparent(param2, param3);
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 > -91) {
          field_v = (String) null;
          if (null == s.field_d) {
            return false;
          }
          if (kc.field_r == null) {
            return false;
          }
          if (null == hk.field_I) {
            return false;
          }
          if (be.field_d != null) {
            return true;
          }
          return false;
        }
        if (null == s.field_d) {
          return false;
        }
        if (kc.field_r == null) {
          return false;
        }
        if (null == hk.field_I) {
          return false;
        }
        if (be.field_d != null) {
          return true;
        }
        return false;
    }

    fi(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
          ga.field_k = new RgbSprite[2];
          ObjectHistoryBuffer.field_o = new RgbSprite[2][];
          ja.field_a = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "fi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void d(byte param0) {
        field_v = null;
        if (param0 != -31) {
          return;
        }
        field_u = null;
        field_r = null;
        field_s = null;
        field_w = null;
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          field_u = (String) null;
          return ja.field_a[param0 - 1];
        }
        return ja.field_a[param0 - 1];
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = 84 % ((65 - param0) / 49);
        return ObjectHistoryBuffer.field_o[-1 + param1];
    }

    final RgbSprite a(boolean param0, int param1) {
        if (param0) {
          return ga.field_k[-1 + param1];
        }
        this.a(true, -66, 69, -83, 51);
        return ga.field_k[-1 + param1];
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!this.b((byte) -125)) {
          Rasterizer2D.fillVerticalGradient(param4, param2, 640, 480, pf.field_b[param3], 16777215);
          if (!param0) {
            this.a(false);
            return;
          }
          return;
        }
        RasterCacheSurface var6 = PowerUp.a(this.field_m, param3, -20777);
        if (!var6.matchesCacheKeys((byte) -84, param3, this.field_m)) {
          dk.a(1, param3, var6, 0, 23275, hk.field_I);
          var6.setCacheKeys(this.field_m, param3, (byte) 78);
        } else {
          SpriteGeometry.a(var6.sprite, 640, param2, param4, param3, param1, s.field_d, 1, kc.field_r, 1, 0);
          if (!param0) {
            this.a(false);
            return;
          }
          return;
        }
        SpriteGeometry.a(var6.sprite, 640, param2, param4, param3, param1, s.field_d, 1, kc.field_r, 1, 0);
        if (param0) {
          return;
        }
        this.a(false);
    }

    final boolean a(boolean param0) {
        if (AchievementIcon.field_m.ensureGroupAvailableByName("arctic", -28138)) {
          s.field_d = pl.loadRgbSpriteByName("arctic", "arctic_near", (byte) 117, AchievementIcon.field_m);
          kc.field_r = pl.loadRgbSpriteByName("arctic", "arctic_mid", (byte) -79, AchievementIcon.field_m);
          hk.field_I = pl.loadRgbSpriteByName("arctic", "arctic_far", (byte) 112, AchievementIcon.field_m);
          be.field_d = pl.loadRgbSpriteByName("arctic", "arctic_small", (byte) -44, AchievementIcon.field_m);
          un.field_d = jh.a(0, s.field_d);
          jl.field_d = jh.a(0, kc.field_r);
          Brick.field_K = jh.a(0, hk.field_I);
          ObjectHistoryBuffer.field_o[0] = cr.loadRgbSpritesByName("arctic", AchievementIcon.field_m, "arctic_caps", 2);
          ja.field_a[0] = cr.loadRgbSpritesByName("arctic", AchievementIcon.field_m, "arctic_segs", 2);
          ga.field_k[0] = pl.loadRgbSpriteByName("arctic", "arctic_centre", (byte) -115, AchievementIcon.field_m);
          ObjectHistoryBuffer.field_o[1] = ig.a(ObjectHistoryBuffer.field_o[0], param0);
          ja.field_a[1] = ig.a(ja.field_a[0], false);
          ga.field_k[1] = pl.a(-16371, ga.field_k[0]);
          return true;
        }
        return false;
    }

    static {
        field_r = new MenuSelection(1);
        field_w = new int[1024];
        field_u = "Lobby";
        field_v = "<%0> has left the lobby.";
    }
}
