/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClock {
    static int field_d;
    static String field_h;
    static RgbSprite[] field_f;
    static RgbSprite halloweenFarSprite;
    static RgbSprite chocolateSmallNearSprite;
    static int textChoiceButtonGapY;
    static RectangleBody collisionBody;
    static int field_b;

    final int waitAndAdvance(long tickDurationNanos, byte obfuscationGuard) {
        long var4 = this.getSleepMillis((byte) 107);
        if (var4 > 0L) {
          BytePayloadRequest.sleepMillis(-124, var4);
          if (obfuscationGuard == -71) {
            return this.advanceCycles(15, tickDurationNanos);
          }
          return 106;
        }
        if (obfuscationGuard == -71) {
          return this.advanceCycles(15, tickDurationNanos);
        }
        return 106;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (0 == param0) {
          return 0;
        }
        if (0 >= param0) {
          var2 = 2;
          if (param0 < -65536) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (param0 < -256) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (param1 < ~param0) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (-4 > param0) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 < -2) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 1;
        if (param0 > 65535) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param0 > 255) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (15 < param0) {
          var2Lifetime1 += 4;
          param0 = param0 >> 4;
        }
        if (param0 > 3) {
          var2Lifetime1 += 2;
          param0 = param0 >> 2;
        }
        if (1 < param0) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    abstract void reset(int obfuscationGuard);

    final static boolean c(byte param0) {
        int var1 = 15 % ((81 - param0) / 36);
        LoginPanel.field_R = true;
        NanoGameClock.field_i = 15000L + MonotonicTime.nowMillis(false);
        return AchievementIcon.field_j == 11 ? true : false;
    }

    public static void a(byte param0) {
        chocolateSmallNearSprite = null;
        field_f = null;
        collisionBody = null;
        field_h = null;
        halloweenFarSprite = null;
        int var1 = 25 % ((param0 + 34) / 58);
    }

    abstract long getSleepMillis(byte obfuscationGuard);

    abstract int advanceCycles(int obfuscationGuard, long tickDurationNanos);

    final static String readSettingsCookie(boolean obfuscationGuard, java.applet.Applet applet) {
        try {
          int cookieIndex = 0;
          String settingsCookieName = null;
          String cookieText = null;
          String[] cookieParts = null;
          int equalsIndex = 0;
          int unusedGameFlag = 0;
          java.applet.Applet unusedApplet = null;
          String cookiePrefix = null;
          String cookieValue = null;
          String fallbackSettings = null;
          RuntimeException failureContext = null;
          StringBuilder contextBuilder = null;
          String appletSummary = null;
          Throwable caughtFailure = null;
          Throwable ignoredBrowserFailure = null;
          RuntimeException readFailure = null;
          unusedGameFlag = BrickABrac.field_J ? 1 : 0;
          try {
            try {
              cookiePrefix = applet.getParameter("cookieprefix");
              if (!obfuscationGuard) {
                unusedApplet = (java.applet.Applet) null;
                GameClock.readSettingsCookie(true, (java.applet.Applet) null);
              }
              settingsCookieName = cookiePrefix + "settings";
              cookieText = (String) (AppletJavaScriptBridge.callFunctionWithoutArguments("getcookies", -125, applet));
              cookieParts = FarmBackground.splitPreservingEmptyParts((byte) 123, cookieText, ';');
              for (cookieIndex = 0; cookieParts.length > cookieIndex; cookieIndex++) {
                equalsIndex = cookieParts[cookieIndex].indexOf('=');
                if (0 <= equalsIndex &&
                  cookieParts[cookieIndex].substring(0, equalsIndex).trim().equals(settingsCookieName)) {
                  cookieValue = cookieParts[cookieIndex].substring(1 + equalsIndex).trim();
                  return cookieValue;
                }
              }
            } catch (java.lang.Throwable caughtBrowserFailure) {
              caughtFailure = caughtBrowserFailure;
              ignoredBrowserFailure = caughtFailure;
            }
            if (SoundCache.clientSettings == null) {
              return applet.getParameter("settings");
            }
            fallbackSettings = SoundCache.clientSettings;
            return fallbackSettings;
          } catch (java.lang.RuntimeException caughtReadFailure) {
            caughtFailure = caughtReadFailure;
            readFailure = (RuntimeException) (Object) caughtFailure;
            failureContext = readFailure;
            contextBuilder = new StringBuilder().append("dj.G(").append(obfuscationGuard).append(',');
            if (applet == null) {
              appletSummary = "null";
            } else {
              appletSummary = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(appletSummary).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    final static void b(byte param0) {
        BackgroundSurfaceHelpers.field_d = new String[QuickChatPhraseRegistry.field_a];
        BackgroundSurfaceHelpers.field_d[18] = NineSliceFrame.field_c;
        BackgroundSurfaceHelpers.field_d[4] = BackgroundRegistry.field_a;
        BackgroundSurfaceHelpers.field_d[16] = RichTextLayout.field_o;
        BackgroundSurfaceHelpers.field_d[21] = ContextMenu.field_Rb;
        BackgroundSurfaceHelpers.field_d[5] = TextFieldValidator.field_i;
        BackgroundSurfaceHelpers.field_d[15] = DualLinkNode.field_i;
        BackgroundSurfaceHelpers.field_d[9] = IntegerValidationHelpers.field_b;
        BackgroundSurfaceHelpers.field_d[6] = DelayedPacket.field_i;
        BackgroundSurfaceHelpers.field_d[20] = GrowableIntList.field_n;
        BackgroundSurfaceHelpers.field_d[7] = AppletFlowHelpers.field_i;
        BackgroundSurfaceHelpers.field_d[17] = RasterCacheSurface.field_l;
        BackgroundSurfaceHelpers.field_d[19] = MeshAudioHelpers.field_g;
        BackgroundSurfaceHelpers.field_d[param0] = IntegerBitLengthHelpers.contactInformationReportReason;
        BackgroundSurfaceHelpers.field_d[11] = AchievementsScreen.field_I;
    }

    static {
        field_h = "Player names can be up to 12 letters, numbers and underscores";
    }
}
