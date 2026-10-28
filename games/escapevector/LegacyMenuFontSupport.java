/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyMenuFontSupport {
    static volatile boolean mouseInputChanged;
    static int field_b;
    static BitmapFont field_c;

    final static void configureFonts(BitmapFont textFont, int horizontalDivisor, int wrapWidth, BitmapFont buttonFont) {
        try {
          MembershipAssetSupport.field_a = textFont;
          Js5Transport.field_h = wrapWidth;
          MenuTitleRenderSupport.field_e = buttonFont;
          ObjectSpriteSet.setLegacyMenuAnchors(SoftwareRasterizer.height / 2, SoftwareRasterizer.width / horizontalDivisor, 11710);
          ThemeAssetSupport.setLegacyMenuFontMetrics(horizontalDivisor + 97, textFont.maxDescent + textFont.capHeight, buttonFont.capHeight, textFont.capHeight, buttonFont.capHeight + buttonFont.maxDescent);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ke.B(" + (textFont != null ? "{...}" : "null") + ',' + horizontalDivisor + ',' + wrapWidth + ',' + (buttonFont != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        if (guard >= -13) {
          BitmapFont var2 = (BitmapFont) null;
          LegacyMenuFontSupport.configureFonts((BitmapFont) null, -2, 75, (BitmapFont) null);
        }
    }

    final static boolean isRatingRowAfter(int left, int guard, int right, boolean primaryKeyFirst) {
        if (guard != 2) {
          BitmapFont var6 = (BitmapFont) null;
          LegacyMenuFontSupport.configureFonts((BitmapFont) null, 4, 22, (BitmapFont) null);
          if (primaryKeyFirst) {
            if (DualLinkNode.field_k[right] > DualLinkNode.field_k[left]) {
              return true;
            }
            if (DualLinkNode.field_k[left] > DualLinkNode.field_k[right]) {
              return false;
            }
            if (Bzip2State.field_v[right] > Bzip2State.field_v[left]) {
              return true;
            }
            if (Bzip2State.field_v[right] < Bzip2State.field_v[left]) {
              return false;
            }
          } else {
            if (Bzip2State.field_v[left] < Bzip2State.field_v[right]) {
              return true;
            }
            if (Bzip2State.field_v[right] < Bzip2State.field_v[left]) {
              return false;
            }
            if (DualLinkNode.field_k[left] < DualLinkNode.field_k[right]) {
              return true;
            }
            if (DualLinkNode.field_k[left] > DualLinkNode.field_k[right]) {
              return false;
            }
          }
          int var4 = AccountNoticeDialog.field_fb[left] + (ModeProgressSupport.field_c[left] + RasterSnapshot.field_k[left]);
          int var5 = ModeProgressSupport.field_c[right] - (-RasterSnapshot.field_k[right] - AccountNoticeDialog.field_fb[right]);
          if (var4 < var5) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(left >= right);
        }
        if (!primaryKeyFirst) {
          if (Bzip2State.field_v[left] < Bzip2State.field_v[right]) {
            return true;
          }
          if (Bzip2State.field_v[right] < Bzip2State.field_v[left]) {
            return false;
          }
          if (DualLinkNode.field_k[left] < DualLinkNode.field_k[right]) {
            return true;
          }
          if (DualLinkNode.field_k[left] > DualLinkNode.field_k[right]) {
            return false;
          }
          int var4Lifetime1 = AccountNoticeDialog.field_fb[left] + (ModeProgressSupport.field_c[left] + RasterSnapshot.field_k[left]);
          int var5Lifetime1 = ModeProgressSupport.field_c[right] - (-RasterSnapshot.field_k[right] - AccountNoticeDialog.field_fb[right]);
          if (var4Lifetime1 < var5Lifetime1) {
            return true;
          }
          if (var4Lifetime1 > var5Lifetime1) {
            return false;
          }
          return !(left >= right);
        }
        if (DualLinkNode.field_k[right] > DualLinkNode.field_k[left]) {
          return true;
        }
        if (DualLinkNode.field_k[left] > DualLinkNode.field_k[right]) {
          return false;
        }
        if (Bzip2State.field_v[right] > Bzip2State.field_v[left]) {
          return true;
        }
        if (Bzip2State.field_v[right] < Bzip2State.field_v[left]) {
          return false;
        }
        int var4Lifetime2 = AccountNoticeDialog.field_fb[left] + (ModeProgressSupport.field_c[left] + RasterSnapshot.field_k[left]);
        int var5Lifetime2 = ModeProgressSupport.field_c[right] - (-RasterSnapshot.field_k[right] - AccountNoticeDialog.field_fb[right]);
        if (var4Lifetime2 < var5Lifetime2) {
          return true;
        }
        if (var4Lifetime2 > var5Lifetime2) {
          return false;
        }
        if (left >= right) {
          return false;
        }
        return true;
    }

    static {
        mouseInputChanged = false;
    }
}
