/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ThemeAssetSupport {
    static PcmSampleStream field_b;
    static String field_c;
    static String field_a;

    final static boolean updateLoginOrDiscardPrompt(int guard) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          if (LoginHandshakeSupport.field_d == 0) {
            StringNode.playFrameAppearSound(8192, (byte) 51);
          }
          boolean var1_int = false;
          IntValueNode.field_j = true;
          if (guard > -13) {
            field_a = (String) null;
          }
          if (0 == LoginHandshakeSupport.field_d) {
            ObjectSpriteSet.field_e.playSampleWithPan(ModeProgressSupport.field_a, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
          }
          if (10 == LoginHandshakeSupport.field_d) {
            ObjectSpriteSet.field_e.playSampleWithPan(ModeProgressSupport.field_a, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
          }
          if (LoginHandshakeSupport.field_d < 1000) {
            LoginHandshakeSupport.field_d = LoginHandshakeSupport.field_d + 1;
          }
          do {
            if (!AccountRequestDialog.pollKeyEvent(-126)) {
              HighscorePlayerRecord.field_d.updatePointer(TransitionPoint.hitLoginOrDiscardPrompt(SessionCounterState.field_c, LoginDialog.field_ob, 8158), (byte) 126, TransitionPoint.hitLoginOrDiscardPrompt(GzipDecoder.field_d, UiContainer.field_y, 8158));
              if (!SpriteOffset.a(true, 0)) {
                return (var1_int);
              }
              var1_int = true;
              boolean stackIn_21_0 = var1_int;
              return (stackIn_21_0);
            }
            HighscorePlayerRecord.field_d.handleKeyEvent((byte) 6);
          } while (!SpriteOffset.a(false, 0));
          var1_int = true;
          boolean stackIn_17_0 = var1_int;
          return (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "mm.F(" + guard + ')');
        }
    }

    final static void setLegacyMenuFontMetrics(int guard, int textLineHeight, int buttonLineHeight, int textAscent, int buttonFullHeight) {
        StatefulTextPainter.field_x = buttonLineHeight;
        int var5 = -76 % ((-35 - guard) / 47);
        IntroFrameRenderer.field_a = buttonFullHeight;
        SpriteFactorySupport.field_b = textLineHeight;
        StrongCacheEntry.field_t = textAscent;
    }

    final static int serviceAccountInput(int guard, boolean unusedFlag, int unusedFirst, int unusedSecond) {
        if (guard != 64) {
          field_b = (PcmSampleStream) null;
          return AccountPanelInputSupport.serviceAccountPanelInput(guard + 6381);
        }
        return AccountPanelInputSupport.serviceAccountPanelInput(guard + 6381);
    }

    final static boolean loadTheme(int guard, int theme) {
        int var3 = EscapeVector.obfuscationControl;
        if (guard != 4) {
          return false;
        }
        if (WeightedLruCache.field_c[theme]) {
          return true;
        }
        ResourceArchive var4 = IndexedSpriteState.field_j;
        if (5 == theme) {
          AchievementTracker.loadTutorialSprites(var4, 5);
          SpriteOffset.a((byte) 53);
          return true;
        }
        if (theme != 4) {
          if (var4.tryLoadNamedGroup(guard - 4, SessionMenuSupport.field_d[theme])) {
            EmailValidationError.field_a[theme] = MembershipPromotionScreen.loadNamedSprite(SessionMenuSupport.field_d[theme], var4, "texture", true);
            PcmResampler.field_a[theme] = MembershipPromotionScreen.loadNamedSprite(SessionMenuSupport.field_d[theme], var4, "frosting", true);
            PcmResampler.field_a[theme].expandToFullSize();
            DelayedServerPacket.loadSkyLayers(var4, theme, false);
            WeightedLruCache.field_c[theme] = true;
            SpriteOffset.a((byte) 53);
            return true;
          }
          return false;
        }
        if (FrameCadenceSupport.field_b != null) {
          ChatMessageDecoder.field_b[theme] = FrameCadenceSupport.field_b.sprites;
          GameModeSelectScreen.field_g[theme] = FrameCadenceSupport.field_b.texture;
          WeightedLruCache.field_c[theme] = true;
          SpriteOffset.a((byte) 53);
          return true;
        }
        SpriteOffset.a((byte) 53);
        return true;
    }

    final static String normalizeAsciiName(int startIndex, CharSequence text) {
        String stackIn_23_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var2_int = text.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          char[] var8 = new char[var2_int];
          char[] var7 = var8;
          char[] var3 = var7;
          for (int var4 = startIndex; var2_int > var4; var4++) {
            int var5 = text.charAt(var4);
            if (var5 >= 65 &&
              90 >= var5) {
              var3[var4] = (char)(-65 + var5 + 97);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          String stackIn_19_0 = new String(var8);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var2;
          StringBuilder stackIn_22_1 = new StringBuilder().append("mm.B(").append(startIndex).append(',');
          if (text == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        int var1 = -15 % ((guard + 35) / 55);
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_a = "Logging in...";
        field_c = "Create your own free Jagex account";
    }
}
