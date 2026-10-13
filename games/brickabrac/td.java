/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends ki {
    static mh field_t;
    static String field_r;
    static String field_w;
    static int[] field_s;
    static int field_u;
    static mh field_v;

    final RgbSprite a(boolean param0, int param1) {
        if (!param0) {
          return (RgbSprite) null;
        }
        return LevelList.field_e[-1 + param1];
    }

    td(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
          LevelList.field_e = new RgbSprite[2];
          np.field_c = new RgbSprite[2][];
          kg.field_a = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "td.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 > -91) {
          return true;
        }
        if (RasterCacheSurface.field_j == null) {
          return false;
        }
        if (null == cp.field_I) {
          return false;
        }
        if (null == se.field_k) {
          return false;
        }
        if (mc.field_f == null) {
          return false;
        }
        return true;
    }

    final boolean a(boolean param0) {
        if (!AchievementIcon.field_m.ensureGroupAvailableByName("volcanic", -28138)) {
          return false;
        }
        RasterCacheSurface.field_j = pl.loadRgbSpriteByName("volcanic", "volcanic_near", (byte) -127, AchievementIcon.field_m);
        cp.field_I = pl.loadRgbSpriteByName("volcanic", "volcanic_mid", (byte) -73, AchievementIcon.field_m);
        se.field_k = pl.loadRgbSpriteByName("volcanic", "volcanic_far", (byte) -125, AchievementIcon.field_m);
        mc.field_f = pl.loadRgbSpriteByName("volcanic", "volcanic_small", (byte) -77, AchievementIcon.field_m);
        cg.field_q = jh.a(0, RasterCacheSurface.field_j);
        gq.field_Sb = jh.a(0, cp.field_I);
        RectangleBody.field_p = jh.a(0, se.field_k);
        kg.field_a[0] = cr.loadRgbSpritesByName("volcanic", AchievementIcon.field_m, "volcanic_caps", 2);
        np.field_c[0] = cr.loadRgbSpritesByName("volcanic", AchievementIcon.field_m, "volcanic_segs", 2);
        LevelList.field_e[0] = pl.loadRgbSpriteByName("volcanic", "volcanic_centre", (byte) -67, AchievementIcon.field_m);
        kg.field_a[1] = ig.a(kg.field_a[0], false);
        np.field_c[1] = ig.a(np.field_c[0], param0);
        LevelList.field_e[1] = pl.a(-16371, LevelList.field_e[0]);
        return true;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 9 / ((param0 + 28) / 43);
        if (param1 > -1) {
          Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, hh.field_c[param1], 10792131);
          if (this.b((byte) -125)) {
            mc.field_f.drawTransparent(param2, param3);
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, 16777215, 11184810);
        if (this.b((byte) -125)) {
          mc.field_f.drawTransparent(param2, param3);
        }
    }

    public static void f(int param0) {
        field_w = null;
        field_v = null;
        field_t = null;
        field_r = null;
        if (param0 != 0) {
          field_u = 41;
          field_s = null;
          return;
        }
        field_s = null;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        RasterCacheSurface var6 = null;
        if (!this.b((byte) -92)) {
          Rasterizer2D.fillVerticalGradient(param4, param2, 640, 480, hh.field_c[param3], 10792131);
        } else {
          var6 = PowerUp.a(this.field_m, param3, -20777);
          if (!var6.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            BitPacketBuffer.a(se.field_k, var6, param3, 1, (byte) 18, 0);
            var6.setCacheKeys(this.field_m, param3, (byte) 78);
          }
          ArchiveIndex.a(-91, -7, RasterCacheSurface.field_j, param1, var6.sprite, param3, 640, 1, param4, param2, cp.field_I);
        }
        if (!param0) {
          field_v = (mh) null;
          return;
        }
    }

    final static int decodeLevelBytes(NodeDeque[] brickGroups, byte[] data, IntNode levelState, NodeDeque motionPaths, ga unusedContext, int obfuscationGuard) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 10792131) {
            stackIn_4_0 = LevelDecoder.decodeLevel(brickGroups, true, new PacketBuffer(data), motionPaths, levelState, unusedContext);
            return stackIn_4_0;
          }
          stackIn_2_0 = 21;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("td.I(");
          if (brickGroups == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (data == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (levelState == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (motionPaths == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (unusedContext == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          return (RgbSprite[]) null;
        }
        return np.field_c[-1 + param0];
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = -91 / ((65 - param0) / 49);
        return kg.field_a[param1 - 1];
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        RasterCacheSurface var6 = null;
        if (!this.b((byte) -120)) {
          Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, hh.field_c[param3], 10792131);
        } else {
          var6 = kd.a(this.field_m, param3, (byte) -111);
          if (!var6.matchesCacheKeys((byte) -84, param3, this.field_m)) {
            BitPacketBuffer.a(RectangleBody.field_p, var6, param3, 2, (byte) 119, -14);
            var6.setCacheKeys(this.field_m, param3, (byte) 78);
          }
          ArchiveIndex.a(-113, -14, cg.field_q, param4, var6.sprite, param3, 306, 2, param2, param0, gq.field_Sb);
        }
        if (param1 >= -84) {
          field_v = (mh) null;
          return;
        }
    }

    final static void g(int param0) {
        int var2 = 0;
        IsaacGenerator var1 = null;
        int var3 = 0;
        IsaacGenerator var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = new IsaacGenerator(new int[]{(int)ue.a(false)});
          var1 = var4;
          for (var2 = param0; var2 < mh.field_F.length; var2++) {
            mh.field_F[var2] = var4.nextInt(101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1_ref), "td.M(" + param0 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              if (param0) {
                td.g(-95);
              }
              var3 = hg.a(param1, var4, -1).getFile();
              ne.a(new Object[]{"home", var3 + "home.ws"}, 111, param1, "updatelinks");
              ne.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, 76, param1, "updatelinks");
              ne.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, 88, param1, "updatelinks");
              ne.a(new Object[]{"options", var3 + "options.ws"}, 98, param1, "updatelinks");
              ne.a(new Object[]{"terms", var3 + "terms.ws"}, 109, param1, "updatelinks");
              ne.a(new Object[]{"privacy", var3 + "privacy.ws"}, 113, param1, "updatelinks");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("td.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw qb.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_s = new int[]{8, 23};
        field_r = "Owner";
        field_u = 83;
    }
}
