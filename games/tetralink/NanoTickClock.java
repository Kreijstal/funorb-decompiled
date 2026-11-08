/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NanoTickClock extends GameClock {
    private int field_j;
    static String field_l;
    private long[] field_g;
    static String field_o;
    private long field_h;
    private long field_i;
    private long field_p;
    private int field_m;
    static Sprite field_k;
    static boolean field_n;

    final static void drawLogoIntro(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var7Lifetime3;
        int var8Lifetime7;
        int var8Lifetime3Lifetime1;
        var9 = TetraLink.field_J;
        if (SingleChildWidget.field_K < 0) {
          return;
        }
        var3 = -135 + param0;
        var4 = -35 + param1;
        var5 = 256;
        if (SingleChildWidget.field_K < 75) {
          var5 = (SingleChildWidget.field_K << 8) / 75;
        }
        if (SingleChildWidget.field_K > 200) {
          var5 = (-SingleChildWidget.field_K + 250 << 8) / 50;
        }
        SectorCacheStore.setRasterTarget((byte) 115, MenuScreen.field_d);
        TriangleRasterizer.useRasterClip();
        SoftwareRasterizer.clear();
        Js5ArchiveManager.buildLogoModelFrame((byte) 71);
        if (var5 < 256) {
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_f, SoftwareRasterizer.field_e, 0, -var5 + 256);
        }
        var6 = -23 / ((param2 + 17) / 41);
        LruTextureCache.popRaster(-581);
        if (SingleChildWidget.field_K >= 150) {
          ClientProtocolStage.field_c.drawWithOpacity(var3 + 15, var4 + 10, var5);
          var7 = -125 + SingleChildWidget.field_K;
          if (0 < var7 &&
            var7 < 50) {
            if (var7 < 20) {
              var8 = var7 * 256 / 20;
              IndexedSpriteState.field_e.drawAdditive(var3, var4, var8);
            } else {
              if (var7 < 30) {
                IndexedSpriteState.field_e.drawAdditive(var3, var4, 256);
              } else {
                var8 = (12800 - var7 * 256) / 20;
                IndexedSpriteState.field_e.drawAdditive(var3, var4, var8);
              }
            }
          }
          var7Lifetime3 = SingleChildWidget.field_K - 140;
          if (var7Lifetime3 > 0) {
            var8Lifetime7 = 256;
            if (var7Lifetime3 < 20) {
              var8Lifetime7 = 256 * var7Lifetime3 / 20;
            }
            ChatPanelHelpers.field_c.drawWithOpacity(var3 + 15, var4 + 10, var8Lifetime7 * var5 >> 8);
          }
          return;
        }
        MenuScreen.field_d.drawHalfSize(var3, var4);
        var7Lifetime1 = -125 + SingleChildWidget.field_K;
        if (0 >= var7Lifetime1) {
          var7Lifetime1 = SingleChildWidget.field_K - 140;
          if (var7Lifetime1 > 0) {
            var8Lifetime1 = 256;
            if (var7Lifetime1 < 20) {
              var8Lifetime1 = 256 * var7Lifetime1 / 20;
            }
            ChatPanelHelpers.field_c.drawWithOpacity(var3 + 15, var4 + 10, var8Lifetime1 * var5 >> 8);
          }
          return;
        }
        if (var7Lifetime1 >= 50) {
          var7Lifetime1 = SingleChildWidget.field_K - 140;
          if (var7Lifetime1 > 0) {
            var8Lifetime2 = 256;
            if (var7Lifetime1 < 20) {
              var8Lifetime2 = 256 * var7Lifetime1 / 20;
            }
            ChatPanelHelpers.field_c.drawWithOpacity(var3 + 15, var4 + 10, var8Lifetime2 * var5 >> 8);
          }
          return;
        }
        if (var7Lifetime1 < 20) {
          var8Lifetime3 = var7Lifetime1 * 256 / 20;
          IndexedSpriteState.field_e.drawAdditive(var3, var4, var8Lifetime3);
          var7Lifetime1 = SingleChildWidget.field_K - 140;
          if (var7Lifetime1 > 0) {
            var8Lifetime3Lifetime1 = 256;
            if (var7Lifetime1 < 20) {
              var8Lifetime3Lifetime1 = 256 * var7Lifetime1 / 20;
            }
            ChatPanelHelpers.field_c.drawWithOpacity(var3 + 15, var4 + 10, var8Lifetime3Lifetime1 * var5 >> 8);
          }
          return;
        }
        if (var7Lifetime1 < 30) {
          IndexedSpriteState.field_e.drawAdditive(var3, var4, 256);
          var7Lifetime1 = SingleChildWidget.field_K - 140;
          if (var7Lifetime1 > 0) {
            var8Lifetime4 = 256;
            if (var7Lifetime1 < 20) {
              var8Lifetime4 = 256 * var7Lifetime1 / 20;
            }
            ChatPanelHelpers.field_c.drawWithOpacity(var3 + 15, var4 + 10, var8Lifetime4 * var5 >> 8);
          }
          return;
        }
        var8Lifetime5 = (12800 - var7Lifetime1 * 256) / 20;
        IndexedSpriteState.field_e.drawAdditive(var3, var4, var8Lifetime5);
        var7Lifetime2 = SingleChildWidget.field_K - 140;
        if (var7Lifetime2 > 0) {
          var8Lifetime6 = 256;
          if (var7Lifetime2 < 20) {
            var8Lifetime6 = 256 * var7Lifetime2 / 20;
          }
          ChatPanelHelpers.field_c.drawWithOpacity(var3 + 15, var4 + 10, var8Lifetime6 * var5 >> 8);
        }
        return;
    }

    final static String getJoinFailureMessage(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 == param2) {
            stackIn_2_0 = QuickChatMenu.field_Lb;
            return stackIn_2_0;
          }
          if (param2 == 6) {
            stackIn_5_0 = TextWidgetPainter.field_l;
            return stackIn_5_0;
          }
          if (param0 < 54) {
            stackIn_8_0 = (String) null;
            return stackIn_8_0;
          }
          if (param2 == 7) {
            stackIn_11_0 = UiWidget.field_q;
            return stackIn_11_0;
          }
          if (8 == param2) {
            stackIn_14_0 = BufferedSocket.field_h;
            return stackIn_14_0;
          }
          if (param2 == 9) {
            stackIn_18_0 = BufferedFile.field_c;
            return stackIn_18_0;
          }
          if (param2 == 10) {
            stackIn_22_0 = LobbyPlayerEntry.field_ec;
            return stackIn_22_0;
          }
          if (11 == param2) {
            stackIn_25_0 = BevelFrameSpriteFactory.field_a;
            return stackIn_25_0;
          }
          if (param2 != 14) {
            return null;
          }
          stackIn_29_0 = SectorCacheStore.formatTemplate(new String[]{param1}, TextLayoutLine.field_l, 127);
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("ef.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final int advanceTicks(long param0, byte param1) {
        int var4;
        int var5;
        var5 = TetraLink.field_J;
        if (param1 != 52) {
          return -121;
        }
        if (this.field_i > this.field_p) {
          this.field_h = this.field_h + (this.field_i - this.field_p);
          this.field_p = this.field_p + (-this.field_p + this.field_i);
          this.field_i = this.field_i + param0;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_i = this.field_i + param0;
        } while (var4 < 10 &&
          this.field_i < this.field_p);
        if (this.field_p <= this.field_i) {
          return var4;
        }
        this.field_i = this.field_p;
        return var4;
    }

    final long getMillisUntilNextTick(byte param0) {
        this.field_p = this.field_p + this.sampleElapsedNanos(true);
        if (param0 >= -13) {
          this.field_m = 57;
          if (this.field_p < this.field_i) {
            return (this.field_i - this.field_p) / 1000000L;
          }
          return 0L;
        }
        if (this.field_p < this.field_i) {
          return (this.field_i - this.field_p) / 1000000L;
        }
        return 0L;
    }

    private final long sampleElapsedNanos(boolean param0) {
        long var6 = 0L;
        int var8 = 0;
        int var9 = TetraLink.field_J;
        long var6Lifetime1;
        long var6Lifetime2;
        long var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (!param0) {
          return 35L;
        }
        long var2 = System.nanoTime();
        long var4 = -this.field_h + var2;
        this.field_h = var2;
        if (-5000000000L >= var4) {
          var6 = 0L;
          for (var8 = 1; this.field_m >= var8; var8++) {
            var6 = var6 + this.field_g[(10 + this.field_j - var8) % 10];
          }
          return var6 / (long)this.field_m;
        }
        if (5000000000L <= var4) {
          var6Lifetime1 = 0L;
          for (var8Lifetime1 = 1; this.field_m >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_g[(10 + this.field_j - var8Lifetime1) % 10];
          }
          return var6Lifetime1 / (long)this.field_m;
        }
        this.field_g[this.field_j] = var4;
        this.field_j = (1 + this.field_j) % 10;
        if (this.field_m >= 1) {
          var6Lifetime2 = 0L;
          for (var8Lifetime2 = 1; this.field_m >= var8Lifetime2; var8Lifetime2++) {
            var6Lifetime2 = var6Lifetime2 + this.field_g[(10 + this.field_j - var8Lifetime2) % 10];
          }
          return var6Lifetime2 / (long)this.field_m;
        }
        this.field_m = this.field_m + 1;
        var6Lifetime3 = 0L;
        for (var8Lifetime3 = 1; this.field_m >= var8Lifetime3; var8Lifetime3++) {
          var6Lifetime3 = var6Lifetime3 + this.field_g[(10 + this.field_j - var8Lifetime3) % 10];
        }
        return var6Lifetime3 / (long)this.field_m;
    }

    final void resetTiming(int param0) {
        if (param0 <= 87) {
          this.getMillisUntilNextTick((byte) 107);
          this.field_h = 0L;
          if (this.field_i > this.field_p) {
            this.field_p = this.field_p + (-this.field_p + this.field_i);
            return;
          }
          return;
        }
        this.field_h = 0L;
        if (this.field_i <= this.field_p) {
          return;
        }
        this.field_p = this.field_p + (-this.field_p + this.field_i);
    }

    public static void releaseStatics(int param0) {
        field_l = null;
        field_o = null;
        if (param0 > -14) {
          return;
        }
        field_k = null;
    }

    NanoTickClock() {
        this.field_j = 0;
        this.field_g = new long[10];
        this.field_h = 0L;
        this.field_m = 1;
        this.field_i = 0L;
        this.field_p = 0L;
        this.field_p = System.nanoTime();
        this.field_i = System.nanoTime();
    }

    static {
        field_o = "<%0>'s turn (<%1>)";
        field_l = "<%0>'s turn";
    }
}
