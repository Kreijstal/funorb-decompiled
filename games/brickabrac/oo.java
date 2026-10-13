/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends ki {
    static String field_y;
    static IsaacGenerator field_w;
    static String field_t;
    static mh field_u;
    static String field_s;
    static boolean field_r;
    private static RgbSprite field_x;
    static int field_v;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        var5 = 100 % ((-28 - param0) / 43);
        if (!this.b((byte) -124)) {
          return;
        }
        if (-1 >= param1) {
          u.field_c.drawTransparent(param2, param3);
        } else {
          la.a(u.field_c, param2, param3, MatchCompleteScreen.field_C[param1]);
        }
        GameClock.field_a.drawTransparent(param2, param3);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        RasterCacheSurface var7 = null;
        if (param1 > -84) {
          this.b(33);
          if (!this.b((byte) -128)) {
            Rasterizer2D.fillRectangle(param2, param0, 306, 480, 16777215);
            return;
          }
          var7 = kd.a(this.field_m, param3, (byte) -50);
          if (!var7.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            SoundPlayback.a(-35, 26746, var7, param3, 2, rg.field_f);
            var7.setCacheKeys(this.field_m, param3, (byte) 78);
          } else {
            ua.a(th.field_i, param2, 306, param0, ek.field_hb, 79, var7.sprite, param4, param3, 2, up.field_w, -35);
            return;
          }
          ua.a(th.field_i, param2, 306, param0, ek.field_hb, 79, var7.sprite, param4, param3, 2, up.field_w, -35);
          return;
        }
        if (!this.b((byte) -128)) {
          Rasterizer2D.fillRectangle(param2, param0, 306, 480, 16777215);
          return;
        }
        RasterCacheSurface var8 = kd.a(this.field_m, param3, (byte) -50);
        if (!var8.matchesCacheKeys((byte) -84, param3, this.field_m)) {
          SoundPlayback.a(-35, 26746, var8, param3, 2, rg.field_f);
          var8.setCacheKeys(this.field_m, param3, (byte) 78);
        } else {
          ua.a(th.field_i, param2, 306, param0, ek.field_hb, 79, var8.sprite, param4, param3, 2, up.field_w, -35);
          return;
        }
        ua.a(th.field_i, param2, 306, param0, ek.field_hb, 79, var8.sprite, param4, param3, 2, up.field_w, -35);
    }

    final RgbSprite a(boolean param0, int param1) {
        if (param0) {
          return IntKeyIndex.field_e[param1 - 1];
        }
        java.applet.Applet var4 = (java.applet.Applet) null;
        oo.a((java.applet.Applet) null, 68);
        return IntKeyIndex.field_e[param1 - 1];
    }

    final boolean a(boolean param0) {
        if (!AchievementIcon.field_m.ensureGroupAvailableByName("chocolate", -28138)) {
          return false;
        }
        nl.field_d = pl.loadRgbSpriteByName("chocolate", "chocolate_near", (byte) 114, AchievementIcon.field_m);
        field_x = pl.loadRgbSpriteByName("chocolate", "chocolate_mid", (byte) 123, AchievementIcon.field_m);
        CappedUrlRequest.field_b = pl.loadRgbSpriteByName("chocolate", "chocolate_spires", (byte) -53, AchievementIcon.field_m);
        rg.field_f = pl.loadRgbSpriteByName("chocolate", "chocolate_far", (byte) 127, AchievementIcon.field_m);
        th.field_i = jh.a(0, nl.field_d);
        ek.field_hb = jh.a(0, field_x);
        up.field_w = jh.a(0, CappedUrlRequest.field_b);
        u.field_c = pl.loadRgbSpriteByName("chocolate", "chocolate_small_far", (byte) -36, AchievementIcon.field_m);
        GameClock.field_a = pl.loadRgbSpriteByName("chocolate", "chocolate_small_near", (byte) -69, AchievementIcon.field_m);
        dc.field_c = pl.loadRgbSpriteByName("chocolate", "chocolate_character", (byte) 101, AchievementIcon.field_m);
        Brick.field_I[0] = cr.loadRgbSpritesByName("chocolate", AchievementIcon.field_m, "choc_caps", 2);
        aj.field_a[0] = cr.loadRgbSpritesByName("chocolate", AchievementIcon.field_m, "choc_segs", 2);
        IntKeyIndex.field_e[0] = pl.loadRgbSpriteByName("chocolate", "choc_centre", (byte) -126, AchievementIcon.field_m);
        Brick.field_I[1] = ig.a(Brick.field_I[0], param0);
        aj.field_a[1] = ig.a(aj.field_a[0], param0);
        IntKeyIndex.field_e[1] = pl.a(-16371, IntKeyIndex.field_e[0]);
        gq.field_Ub = cr.loadRgbSpritesByName("chocolate", AchievementIcon.field_m, "choc_lever", 2);
        return true;
    }

    final RgbSprite c(byte param0) {
        if (param0 >= -74) {
          this.a(false, 35, 0, 38, 68);
          return dc.field_c;
        }
        return dc.field_c;
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          field_t = (String) null;
          return aj.field_a[-1 + param0];
        }
        return aj.field_a[-1 + param0];
    }

    final static m f(int param0) {
        String var1 = LevelSelectScreen.d(true);
        if (param0 < 68) {
          oo.d((byte) 97);
          if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
              var1 = "";
            }
            return new m(LevelSelectScreen.d(true), la.b((byte) 118));
          }
          return new m(LevelSelectScreen.d(true), la.b((byte) 118));
        }
        if (var1 == null) {
          return new m(LevelSelectScreen.d(true), la.b((byte) 118));
        }
        if (0 <= var1.indexOf('@')) {
          var1 = "";
          return new m(LevelSelectScreen.d(true), la.b((byte) 118));
        }
        return new m(LevelSelectScreen.d(true), la.b((byte) 118));
    }

    final RgbSprite[] b(int param0) {
        if (param0 >= -12) {
          field_r = false;
          return gq.field_Ub;
        }
        return gq.field_Ub;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        RasterCacheSurface var6 = null;
        if (this.b((byte) -112)) {
          var6 = PowerUp.a(this.field_m, param3, -20777);
          if (!var6.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            SoundPlayback.a(0, 26746, var6, param3, 1, rg.field_f);
            var6.setCacheKeys(this.field_m, param3, (byte) 78);
          }
          ua.a(nl.field_d, param4, 640, param2, field_x, 95, var6.sprite, param1, param3, 1, CappedUrlRequest.field_b, 0);
          if (!param0) {
            field_t = (String) null;
            return;
          }
          return;
        }
        Rasterizer2D.fillRectangle(param4, param2, 640, 480, 16777215);
        if (!param0) {
          field_t = (String) null;
          return;
        }
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = -63 % ((65 - param0) / 49);
        return Brick.field_I[-1 + param1];
    }

    oo(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
          aj.field_a = new RgbSprite[2][];
          IntKeyIndex.field_e = new RgbSprite[2];
          Brick.field_I = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "oo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 > -91) {
          field_y = (String) null;
          if (nl.field_d == null) {
            return false;
          }
          if (null == field_x) {
            return false;
          }
          if (rg.field_f == null) {
            return false;
          }
          if (CappedUrlRequest.field_b == null) {
            return false;
          }
          if (u.field_c == null) {
            return false;
          }
          if (null != GameClock.field_a) {
            return null != dc.field_c ? true : false;
          }
          return false;
        }
        if (nl.field_d == null) {
          return false;
        }
        if (null == field_x) {
          return false;
        }
        if (rg.field_f == null) {
          return false;
        }
        if (CappedUrlRequest.field_b == null) {
          return false;
        }
        if (u.field_c == null) {
          return false;
        }
        if (null != GameClock.field_a) {
          return null != dc.field_c ? true : false;
        }
        return false;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 != 0) {
                field_x = (RgbSprite) null;
              }
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              param0.getAppletContext().showDocument(hg.a(param0, var2, -1), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("oo.R(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw qb.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        if (param0 < -29) {
          field_t = null;
          field_x = null;
          field_y = null;
          field_w = null;
          field_u = null;
          field_s = null;
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        oo.a((java.applet.Applet) null, -87);
        field_t = null;
        field_x = null;
        field_y = null;
        field_w = null;
        field_u = null;
        field_s = null;
    }

    static {
        field_t = "This is <%0>'s RuneScape clan if they have one.";
        field_s = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_v = -1;
        field_y = "Remove friend";
    }
}
