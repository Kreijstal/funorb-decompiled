/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends ki {
    static int field_u;
    static String field_s;
    static boolean field_r;
    static boolean field_t;

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        RasterCacheSurface var8 = null;
        if (param0) {
          if (!this.b((byte) -102)) {
            Rasterizer2D.fillRectangle(param4, param2, 640, 480, 0);
          } else {
            var8 = PowerUp.a(this.field_m, param3, -20777);
            if (!var8.matchesCacheKeys((byte) -84, param3, this.field_m)) {
              dp.a(1, 0, !param0 ? true : false, param3, ng.field_a, var8);
              var8.setCacheKeys(this.field_m, param3, (byte) 78);
            }
            AchievementBrowserScreen.a(om.field_fc, param4, param1, param3, 640, 0, 0, var8.sprite, 1, pn.field_m, param2);
          }
          return;
        }
        this.c((byte) 70);
        if (!this.b((byte) -102)) {
          Rasterizer2D.fillRectangle(param4, param2, 640, 480, 0);
          return;
        }
        RasterCacheSurface var7 = PowerUp.a(this.field_m, param3, -20777);
        if (!var7.matchesCacheKeys((byte) -84, param3, this.field_m)) {
          dp.a(1, 0, !param0 ? true : false, param3, ng.field_a, var7);
          var7.setCacheKeys(this.field_m, param3, (byte) 78);
        }
        AchievementBrowserScreen.a(om.field_fc, param4, param1, param3, 640, 0, 0, var7.sprite, 1, pn.field_m, param2);
    }

    final RgbSprite[] b(int param0) {
        if (param0 > -12) {
          this.b((byte) 4);
          return b.field_b;
        }
        return b.field_b;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        RasterCacheSurface var8 = null;
        RasterCacheSurface var7 = null;
        if (param1 <= -84) {
          if (!this.b((byte) -101)) {
            Rasterizer2D.fillRectangle(param2, param0, 306, 480, 0);
          } else {
            var8 = kd.a(this.field_m, param3, (byte) 125);
            if (!var8.matchesCacheKeys((byte) -84, param3, this.field_m)) {
              dp.a(2, 0, false, param3, kh.field_b, var8);
              var8.setCacheKeys(this.field_m, param3, (byte) 78);
            }
            AchievementBrowserScreen.a(jh.field_d, param2, param4, param3, 306, 0, 0, var8.sprite, 2, lk.field_t, param0);
          }
          return;
        }
        field_s = (String) null;
        if (!this.b((byte) -101)) {
          Rasterizer2D.fillRectangle(param2, param0, 306, 480, 0);
        } else {
          var7 = kd.a(this.field_m, param3, (byte) 125);
          if (!var7.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            dp.a(2, 0, false, param3, kh.field_b, var7);
            var7.setCacheKeys(this.field_m, param3, (byte) 78);
          }
          AchievementBrowserScreen.a(jh.field_d, param2, param4, param3, 306, 0, 0, var7.sprite, 2, lk.field_t, param0);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (param1 <= -1) {
          Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, 7829367, 11184810);
          if (this.b((byte) -103)) {
            rf.field_a.drawTransparent(param2, param3);
          }
          var5 = -77 % ((-28 - param0) / 43);
          return;
        }
        la.a(param2, param3, 153, 238, 0, nj.field_G[param1], 96);
        if (this.b((byte) -103)) {
          rf.field_a.drawTransparent(param2, param3);
        }
        var5Lifetime1 = -77 % ((-28 - param0) / 43);
    }

    final boolean a(boolean param0) {
        if (!AchievementIcon.field_m.a("space", -28138)) {
          return false;
        }
        om.field_fc = pl.loadRgbSpriteByName("space", "space_near", (byte) -91, AchievementIcon.field_m);
        pn.field_m = pl.loadRgbSpriteByName("space", "space_mid", (byte) 115, AchievementIcon.field_m);
        ng.field_a = pl.loadRgbSpriteByName("space", "space_far", (byte) -98, AchievementIcon.field_m);
        rf.field_a = pl.loadRgbSpriteByName("space", "space_small", (byte) -90, AchievementIcon.field_m);
        ng.field_a.bindRasterTarget();
        Rasterizer2D.a(7136, 6592, 1600, 128, sq.field_b);
        if (!param0) {
          kc.field_q.a((byte) 100);
          pk.field_f = pl.loadRgbSpriteByName("space", "space_character", (byte) -50, AchievementIcon.field_m);
          jh.field_d = jh.a(0, om.field_fc);
          lk.field_t = jh.a(0, pn.field_m);
          kh.field_b = jh.a(0, ng.field_a);
          b.field_b = cr.loadRgbSpritesByName("space", AchievementIcon.field_m, "space_lever", 2);
          return true;
        }
        return false;
    }

    ci(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final RgbSprite c(byte param0) {
        if (param0 > -74) {
          String var3 = (String) null;
          ci.a((String) null, -110);
          return pk.field_f;
        }
        return pk.field_f;
    }

    final boolean b(byte param0) {
        if (param0 > -91) {
          field_t = false;
          if (om.field_fc == null) {
            return false;
          }
          if (null == pn.field_m) {
            return false;
          }
          if (null == ng.field_a) {
            return false;
          }
          if (rf.field_a != null) {
            return null != pk.field_f ? true : false;
          }
          return false;
        }
        if (om.field_fc == null) {
          return false;
        }
        if (null == pn.field_m) {
          return false;
        }
        if (null == ng.field_a) {
          return false;
        }
        if (rf.field_a != null) {
          return null != pk.field_f ? true : false;
        }
        return false;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -6) {
            field_u = -69;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = ih.field_d.equals(gb.a(var3, 92));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ci.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_s = null;
        if (param0 <= 1) {
          ci.d((byte) 54);
        }
    }

    static {
        field_s = "Game over";
    }
}
