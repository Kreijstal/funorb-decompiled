/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ki {
    static String field_r;
    static String field_s;
    static String field_u;
    static String field_t;

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        RasterCacheSurface var6 = null;
        if (this.b((byte) -127)) {
          var6 = PowerUp.a(this.field_m, param3, -20777);
          if (!var6.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            RankingsScreen.a(var6, 1, 0, OptionsScreen.field_B, param3, 100);
            var6.setCacheKeys(this.field_m, param3, (byte) 78);
            sa.a((byte) 119, wn.field_b, param2, 1, lj.field_q, var6.sprite, param1, 640, 0, param4);
            if (!param0) {
              field_u = (String) null;
              return;
            }
            return;
          }
          sa.a((byte) 119, wn.field_b, param2, 1, lj.field_q, var6.sprite, param1, 640, 0, param4);
          if (!param0) {
            field_u = (String) null;
            return;
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(param4, param2, 640, 480, kg.field_i[param3], 16777215);
        if (param0) {
          return;
        }
        field_u = (String) null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (-1 >= param1) {
          Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, 16777215, 11184810);
          var5 = 52 % ((param0 + 28) / 43);
          if (this.b((byte) -106)) {
            ce.field_c.drawTransparent(param2, param3);
            return;
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, kg.field_i[param1], 16777215);
        var5Lifetime1 = 52 % ((param0 + 28) / 43);
        if (this.b((byte) -106)) {
          ce.field_c.drawTransparent(param2, param3);
          return;
        }
    }

    final boolean a(boolean param0) {
        if (AchievementIcon.field_m.ensureGroupAvailableByName("desert", -28138)) {
          wn.field_b = pl.loadRgbSpriteByName("desert", "desert_near", (byte) 107, AchievementIcon.field_m);
          lj.field_q = pl.loadRgbSpriteByName("desert", "desert_mid", (byte) -121, AchievementIcon.field_m);
          OptionsScreen.field_B = pl.loadRgbSpriteByName("desert", "desert_far", (byte) 122, AchievementIcon.field_m);
          ce.field_c = pl.loadRgbSpriteByName("desert", "desert_small", (byte) 99, AchievementIcon.field_m);
          lq.field_d = jh.a(0, wn.field_b);
          oc.field_x = jh.a(0, lj.field_q);
          pp.field_b = jh.a(0, OptionsScreen.field_B);
          GzipInflater.field_f[0] = cr.loadRgbSpritesByName("desert", AchievementIcon.field_m, "desert_caps", 2);
          pk.field_e[0] = cr.loadRgbSpritesByName("desert", AchievementIcon.field_m, "desert_segs", 2);
          um.field_l[0] = pl.loadRgbSpriteByName("desert", "desert_centre", (byte) 110, AchievementIcon.field_m);
          GzipInflater.field_f[1] = ig.a(GzipInflater.field_f[0], param0);
          pk.field_e[1] = ig.a(pk.field_e[0], false);
          um.field_l[1] = pl.a(-16371, um.field_l[0]);
          return true;
        }
        return false;
    }

    final RgbSprite a(boolean param0, int param1) {
        if (param0) {
          return um.field_l[-1 + param1];
        }
        this.a((byte) 65, 25, -62, -115);
        return um.field_l[-1 + param1];
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = 105 % ((param0 - 65) / 49);
        return GzipInflater.field_f[param1 - 1];
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          field_u = (String) null;
          return pk.field_e[param0 - 1];
        }
        return pk.field_e[param0 - 1];
    }

    public static void f(int param0) {
        field_u = null;
        field_t = null;
        field_r = null;
        field_s = null;
        if (param0 != -417029247) {
          gi.g(-5);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        RasterCacheSurface var7 = null;
        if (param1 >= -84) {
          field_u = (String) null;
          if (!this.b((byte) -123)) {
            Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, kg.field_i[param3], 16777215);
            return;
          }
          var7 = kd.a(this.field_m, param3, (byte) -74);
          if (!var7.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            RankingsScreen.a(var7, 2, -13, pp.field_b, param3, 102);
            var7.setCacheKeys(this.field_m, param3, (byte) 78);
          } else {
            sa.a((byte) 86, lq.field_d, param0, 2, oc.field_x, var7.sprite, param4, 306, -13, param2);
            return;
          }
          sa.a((byte) 86, lq.field_d, param0, 2, oc.field_x, var7.sprite, param4, 306, -13, param2);
          return;
        }
        if (!this.b((byte) -123)) {
          Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, kg.field_i[param3], 16777215);
          return;
        }
        RasterCacheSurface var8 = kd.a(this.field_m, param3, (byte) -74);
        if (!var8.matchesCacheKeys((byte) -84, param3, this.field_m)) {
          RankingsScreen.a(var8, 2, -13, pp.field_b, param3, 102);
          var8.setCacheKeys(this.field_m, param3, (byte) 78);
        } else {
          sa.a((byte) 86, lq.field_d, param0, 2, oc.field_x, var8.sprite, param4, 306, -13, param2);
          return;
        }
        sa.a((byte) 86, lq.field_d, param0, 2, oc.field_x, var8.sprite, param4, 306, -13, param2);
    }

    gi(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
          GzipInflater.field_f = new RgbSprite[2][];
          um.field_l = new RgbSprite[2];
          pk.field_e = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "gi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -91) {
          field_s = (String) null;
          if (wn.field_b == null) {
            return false;
          }
          if (null == lj.field_q) {
            return false;
          }
          if (null == OptionsScreen.field_B) {
            return false;
          }
          if (ce.field_c == null) {
            return false;
          }
          if (GzipInflater.field_f == null) {
            return false;
          }
          if (pk.field_e != null) {
            return um.field_l != null ? true : false;
          }
          return false;
        }
        if (wn.field_b == null) {
          return false;
        }
        if (null == lj.field_q) {
          return false;
        }
        if (null == OptionsScreen.field_B) {
          return false;
        }
        if (ce.field_c == null) {
          return false;
        }
        if (GzipInflater.field_f == null) {
          return false;
        }
        if (pk.field_e != null) {
          return um.field_l != null ? true : false;
        }
        return false;
    }

    final static void g(int param0) {
        int var1 = co.a((byte) -53);
        int var2 = ba.b(true);
        vg.field_c.a(var1 + (un.field_a << 1), var2 + (Paddle.field_A << 1), LevelPack.field_k - un.field_a, false, mi.field_d - Paddle.field_A);
        jq.d(-16085);
        if (param0 == 11184810) {
          return;
        }
        field_t = (String) null;
    }

    static {
        field_r = "Discard";
        field_t = "Report <%0> for abuse";
        field_u = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_s = "Achieved";
    }
}
