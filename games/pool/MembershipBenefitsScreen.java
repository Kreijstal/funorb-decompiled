/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MembershipBenefitsScreen extends MenuScreen {
    static int field_J;
    static int field_H;
    static String rulePillar2;
    static int field_I;

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        rulePillar2 = null;
    }

    final void drawScreen(int param0) {
        int var2 = 0;
        int var3;
        Sprite var4;
        var3 = Pool.field_O;
        ChatMessage.field_l.drawAt(0, 0);
        if (LocalGameSetupScreen.loadMembershipBenefitsAssets((byte) 109)) {
          MembershipBenefitsLoader.loadBenefitsScreenAssets(-2);
          if (!RankingsRequest.field_l) {
            for (var2 = 0; var2 < PotEvent.field_m.field_D.length; var2++) {
              if ((PotEvent.field_m.field_D[var2] & -16777216) == 0 &&
                0 != (PotEvent.field_m.field_D[var2] & 16777215)) {
                PotEvent.field_m.field_D[var2] = RenderingInitializationSupport.bitwiseOr(PotEvent.field_m.field_D[var2], -16777216);
              }
            }
            RankingsRequest.field_l = true;
            MembershipBenefitsLoader.loadBenefitsScreenAssets(-2);
          }
        }
        if (param0 <= 36) {
          var4 = (Sprite) null;
          MembershipBenefitsScreen.expandSpriteOutline(-122, -16, 103, (Sprite) null, 91, -103, -122, -85);
        }
    }

    final static void transformVerticesInPlace(int endIndex, int startIndex, boolean enabled, int[] x, int[] z, int[] y, int[] transform) {
        int var7_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pool.field_O;
        try {
          if (!enabled) {
            return;
          }
          for (var7_int = startIndex; endIndex > var7_int; var7_int++) {
            var8 = x[var7_int];
            var9 = y[var7_int];
            var10 = z[var7_int];
            x[var7_int] = (var8 * transform[3] - (-(transform[4] * var9) - var10 * transform[5]) >> 16) + transform[0];
            y[var7_int] = (transform[6] * var8 + transform[7] * var9 + var10 * transform[8] >> 16) + transform[1];
            z[var7_int] = transform[2] + (transform[11] * var10 + (var9 * transform[10] + var8 * transform[9]) >> 16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("hd.E(").append(endIndex).append(',').append(startIndex).append(',').append(enabled).append(',');
          if (x == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (z == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (y == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (transform == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    MembershipBenefitsScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((Sprite) null, param0, param1, param2, param3, param4, param5);
    }

    final void advanceScreen(int param0) {
        int var2 = 0;
        if (param0 == -1) {
          var2 = StrongCacheEntry.advanceMembershipSlideshow(!StartupInterfaceSupport.a(11) ? true : false, (byte) 65);
        } else {
          MembershipBenefitsScreen.releaseStatics(false);
          var2 = StrongCacheEntry.advanceMembershipSlideshow(!StartupInterfaceSupport.a(11) ? true : false, (byte) 65);
        }
        if (3 == var2) {
          if (MatchingTextValidator.field_u != null) {
            AccountStateQuery.d((byte) -106);
          }
          DisplayModeSupport.openSubscribePage(NanoTickClock.getApplet(58), 2056898529);
        }
        if (var2 == 1) {
          AccountCreationDialog.switchScreen(-3405, 0, GameRules.field_b, false);
        }
        if (var2 == 2) {
          AccountCreationDialog.switchScreen(-3405, 0, GameRules.field_b, true);
        }
    }

    final static void expandSpriteOutline(int color, int radius, int height, Sprite sprite, int clipArraySize, int width, int x, int y) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        Sprite var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = Pool.field_O;
        try {
          if (SoftwareRasterizer.clipLeft > x) {
            width = width - (-x + SoftwareRasterizer.clipLeft);
            x = SoftwareRasterizer.clipLeft;
          }
          if (SoftwareRasterizer.clipRight < x + width) {
            width = SoftwareRasterizer.clipRight - x;
          }
          if (y < SoftwareRasterizer.clipTop) {
            height = height - (SoftwareRasterizer.clipTop - y);
            y = SoftwareRasterizer.clipTop;
          }
          if (height + y > SoftwareRasterizer.clipBottom) {
            height = SoftwareRasterizer.clipBottom - y;
          }
          if (width > 0 &&
            0 < height) {
            var21 = sprite.copy();
            var30 = SoftwareRasterizer.pixels;
            var10 = SoftwareRasterizer.width;
            var11 = SoftwareRasterizer.height;
            var29 = new int[clipArraySize];
            SoftwareRasterizer.saveClip(var29);
            sprite.bindAsRenderTarget();
            SoftwareRasterizer.intersectClip(var29[0], var29[1], var29[2], var29[3]);
            var13 = x + sprite.field_z * y;
            var14 = sprite.field_z - width;
            var25 = var21.field_D;
            var22 = var25;
            var15 = var22;
            for (var16 = y; var16 < y + height; var16++) {
              for (var17 = x; var17 < width + x; var17++) {
                var18 = var25[var13];
                if (var18 != 0) {
                  if (var17 > 0 &&
                    0 == var15[-1 + var13]) {
                    SoftwareRasterizer.fillCircle(var17, var16, radius, color);
                  } else {
                    if (var16 > 0 &&
                      var15[var13 - sprite.field_z] == 0) {
                      SoftwareRasterizer.fillCircle(var17, var16, radius, color);
                    } else {
                      if (var17 < sprite.field_z - 1 &&
                        0 == var15[1 + var13]) {
                        SoftwareRasterizer.fillCircle(var17, var16, radius, color);
                      } else {
                        if (var16 < sprite.field_A - 1 &&
                          0 == var15[sprite.field_z + var13]) {
                          SoftwareRasterizer.fillCircle(var17, var16, radius, color);
                        }
                      }
                    }
                  }
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.draw(-sprite.field_G, -sprite.field_B);
            SoftwareRasterizer.setTarget(var30, var10, var11);
            SoftwareRasterizer.restoreClip(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_42_0 = var8;
          stackIn_42_1 = new StringBuilder().append("hd.B(").append(color).append(',').append(radius).append(',').append(height).append(',');
          if (sprite == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(clipArraySize).append(',').append(width).append(',').append(x).append(',').append(y).append(')').toString());
        }
    }

    static {
        rulePillar2 = "Security";
    }
}
