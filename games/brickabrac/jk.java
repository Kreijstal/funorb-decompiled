/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends ki {
    static String field_v;
    static int[] field_r;
    static RgbSprite field_t;
    static PcmPlayer field_w;
    static gb[] field_s;
    static RgbSprite field_u;

    final boolean b(byte param0) {
        if (param0 > -91) {
          field_r = (int[]) null;
          if (wm.field_b == null) {
            return false;
          }
          if (null == hk.field_Q) {
            return false;
          }
          if (null == n.field_c) {
            return false;
          }
          if (null == pk.field_a) {
            return false;
          }
          if (go.field_d == null) {
            return false;
          }
          if (null != sn.field_t) {
            return true;
          }
          return false;
        }
        if (wm.field_b == null) {
          return false;
        }
        if (null == hk.field_Q) {
          return false;
        }
        if (null == n.field_c) {
          return false;
        }
        if (null == pk.field_a) {
          return false;
        }
        if (go.field_d == null) {
          return false;
        }
        if (null != sn.field_t) {
          return true;
        }
        return false;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return true;
        }
        if (AchievementIcon.field_m.ensureGroupAvailableByName("water", -28138)) {
          go.field_d = pl.loadRgbSpriteByName("water", "water_rays", (byte) 116, AchievementIcon.field_m);
          wm.field_b = pl.loadRgbSpriteByName("water", "water_near", (byte) 105, AchievementIcon.field_m);
          hk.field_Q = pl.loadRgbSpriteByName("water", "water_mid", (byte) 109, AchievementIcon.field_m);
          n.field_c = pl.loadRgbSpriteByName("water", "water_far", (byte) -121, AchievementIcon.field_m);
          pk.field_a = pl.loadRgbSpriteByName("water", "water_small", (byte) 112, AchievementIcon.field_m);
          sn.field_t = pl.loadRgbSpriteByName("water", "water_character", (byte) -43, AchievementIcon.field_m);
          vj.field_b = new RgbSprite(n.field_c.canvasWidth, n.field_c.canvasHeight);
          IndexedSpriteGeometry.pushSpriteRaster(-49, vj.field_b);
          n.field_c.g(0, 0);
          sc.popRaster(-81);
          to.field_e = jh.a(0, wm.field_b);
          GameplayScreen.field_l = jh.a(0, hk.field_Q);
          jg.field_a = jh.a(0, n.field_c);
          ig.field_P = jh.a(0, vj.field_b);
          uo.field_d = new RgbSprite(go.field_d.canvasWidth / 2, go.field_d.canvasHeight);
          IndexedSpriteGeometry.pushSpriteRaster(-83, uo.field_d);
          go.field_d.a(0, 0, go.field_d.canvasWidth / 2, go.field_d.canvasHeight);
          sc.popRaster(-114);
          pl.a(n.field_c, 0);
          pl.a(vj.field_b, 0);
          pl.a(jg.field_a, 0);
          pl.a(ig.field_P, 0);
          pl.a(go.field_d, 0);
          pl.a(uo.field_d, 0);
          return true;
        }
        return false;
    }

    final RgbSprite c(byte param0) {
        if (param0 >= -74) {
          field_t = (RgbSprite) null;
          return sn.field_t;
        }
        return sn.field_t;
    }

    jk(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(int param0, byte param1) {
        BitPacketBuffer var2 = k.field_h;
        var2.writeCipheredOpcode(param1 ^ -13319, param0);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(6, 2);
        var2.writeBytes(rh.field_d, param1 - 99, 0, rh.field_d.length);
        var2.writeByte(-125, bb.field_e);
        var2.writeByte(param1 ^ -12, ResourceArchive.field_c);
        if (param1 == 98) {
          var2.writeBytes(lj.field_p, -1, 0, lj.field_p.length);
          var2.backfillByteLength((byte) 126, -var3 + var2.position);
          return;
        }
        jk.d((byte) 3);
        var2.writeBytes(lj.field_p, -1, 0, lj.field_p.length);
        var2.backfillByteLength((byte) 126, -var3 + var2.position);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        RasterCacheSurface var8 = null;
        if (param1 > -84) {
          this.a((byte) -90, 97, -35, 25);
          if (!this.b((byte) -95)) {
            Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, um.field_u[param3], 928072);
            return;
          }
          var8 = kd.a(this.field_m, param3, (byte) 106);
          if (!var8.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            hh.a(jg.field_a, -13, 2, var8, -8562, param3, ig.field_P);
            var8.setCacheKeys(this.field_m, param3, (byte) 78);
          }
          il.a(param4, to.field_e, var8.sprite, 2, 2, GameplayScreen.field_l, -13, param3, param0, param2, uo.field_d, 306);
          return;
        }
        if (!this.b((byte) -95)) {
          Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, um.field_u[param3], 928072);
          return;
        }
        RasterCacheSurface var9 = kd.a(this.field_m, param3, (byte) 106);
        if (!var9.matchesCacheKeys((byte) -84, param3, this.field_m)) {
          hh.a(jg.field_a, -13, 2, var9, -8562, param3, ig.field_P);
          var9.setCacheKeys(this.field_m, param3, (byte) 78);
        }
        il.a(param4, to.field_e, var9.sprite, 2, 2, GameplayScreen.field_l, -13, param3, param0, param2, uo.field_d, 306);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        RasterCacheSurface var7 = null;
        if (!param0) {
          field_w = (PcmPlayer) null;
          if (!this.b((byte) -112)) {
            Rasterizer2D.fillVerticalGradient(param4, param2, 640, 480, um.field_u[param3], 928072);
            return;
          }
          var7 = PowerUp.a(this.field_m, param3, -20777);
          if (!var7.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            hh.a(n.field_c, 0, 1, var7, -8562, param3, vj.field_b);
            var7.setCacheKeys(this.field_m, param3, (byte) 78);
          }
          il.a(param1, wm.field_b, var7.sprite, 1, 2, hk.field_Q, 0, param3, param2, param4, go.field_d, 640);
          return;
        }
        if (!this.b((byte) -112)) {
          Rasterizer2D.fillVerticalGradient(param4, param2, 640, 480, um.field_u[param3], 928072);
          return;
        }
        RasterCacheSurface var8 = PowerUp.a(this.field_m, param3, -20777);
        if (!var8.matchesCacheKeys((byte) -84, param3, this.field_m)) {
          hh.a(n.field_c, 0, 1, var8, -8562, param3, vj.field_b);
          var8.setCacheKeys(this.field_m, param3, (byte) 78);
        }
        il.a(param1, wm.field_b, var8.sprite, 1, 2, hk.field_Q, 0, param3, param2, param4, go.field_d, 640);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param1 <= -1) {
          Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, 16777215, 11184810);
          if (this.b((byte) -98)) {
            pk.field_a.drawTransparent(param2, param3);
            var5 = 14 / ((param0 + 28) / 43);
            return;
          }
          var5Lifetime3 = 14 / ((param0 + 28) / 43);
          return;
        }
        Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, um.field_u[param1], 928072);
        if (this.b((byte) -98)) {
          pk.field_a.drawTransparent(param2, param3);
          var5Lifetime1 = 14 / ((param0 + 28) / 43);
          return;
        }
        var5Lifetime2 = 14 / ((param0 + 28) / 43);
    }

    public static void d(byte param0) {
        field_u = null;
        field_v = null;
        if (param0 == -46) {
          field_r = null;
          field_t = null;
          field_w = null;
          field_s = null;
          return;
        }
        field_r = (int[]) null;
        field_r = null;
        field_t = null;
        field_w = null;
        field_s = null;
    }

    static {
        field_r = new int[8192];
        field_v = "New Game";
    }
}
