/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayPool {
    static int field_a;
    static int field_c;
    static int field_b;
    static int[] field_d;

    final static void drawDirectionalFrame(int width, int height, boolean enabled, int x, int y) {
        if (!enabled) {
          return;
        }
        LogoMaterial.drawNineSlice(TutorialFactory.field_b, (byte) -125, width, x, y, height);
        if (width > height) {
          TransformSupport.field_b.draw(x + (-TransformSupport.field_b.field_w + width >> 1), y);
          DisplayNamePanel.field_T.draw(x + (-DisplayNamePanel.field_T.field_w + width >> 1), -DisplayNamePanel.field_T.field_y + (height + y));
        } else {
          LoginPayloadFactory.field_a.draw(x, (height - LoginPayloadFactory.field_a.field_y >> 1) + y);
          MessageDialogContent.field_T.draw(x + width - MessageDialogContent.field_T.field_w, y + (-MessageDialogContent.field_T.field_y + height >> 1));
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 726237729) {
          ByteArrayPool.acquireByteArray(50, -94);
        }
        field_d = null;
    }

    final synchronized static byte[] acquireByteArray(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (100 == param0 &&
          PolarBallSkin.field_p > 0) {
          fieldTemp$0 = PolarBallSkin.field_p - 1;
          PolarBallSkin.field_p = PolarBallSkin.field_p - 1;
          var2_ref_byte__ = PoolMatchController.field_y[fieldTemp$0];
          PoolMatchController.field_y[PolarBallSkin.field_p] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          HighscoresScreen.field_I > 0) {
          fieldTemp$1 = HighscoresScreen.field_I - 1;
          HighscoresScreen.field_I = HighscoresScreen.field_I - 1;
          var2_ref_byte__Lifetime1 = ChatInputSupport.field_j[fieldTemp$1];
          ChatInputSupport.field_j[HighscoresScreen.field_I] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 == 30000 &&
          ProxyConnectorSupport.field_a > 0) {
          fieldTemp$2 = ProxyConnectorSupport.field_a - 1;
          ProxyConnectorSupport.field_a = ProxyConnectorSupport.field_a - 1;
          var2_ref_byte__Lifetime2 = BallDebugOverlay.field_g[fieldTemp$2];
          BallDebugOverlay.field_g[ProxyConnectorSupport.field_a] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param1 != -1) {
          field_c = 109;
        }
        if (null != TranslatedUiText.field_l) {
          for (var2 = 0; var2 < DisplayModeSupport.field_f.length; var2++) {
            if (DisplayModeSupport.field_f[var2] == param0 &&
              ReflectionCheck.field_l[var2] > 0) {
              dupTemp$3 = ReflectionCheck.field_l[var2] - 1;
              arrayValue$4 = TranslatedUiText.field_l[var2];
              ReflectionCheck.field_l[var2] = dupTemp$3;
              var3 = arrayValue$4[dupTemp$3];
              TranslatedUiText.field_l[var2][ReflectionCheck.field_l[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    final static void resetTooltipState(boolean clearText) {
        PauseMenuScreen.field_J = 0;
        MatchingTextValidator.field_n = -1;
        if (!clearText) {
          return;
        }
        BrowserCookieWriter.field_d = false;
        MouseWheelInput.field_b = -1;
        MessageScreen.field_I = null;
    }

    static {
        field_c = 0;
        field_d = new int[8192];
    }
}
