/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationIndicator extends TextButton {
    static int field_I;
    static int[] field_G;
    static WidgetTheme field_H;
    static String field_J;
    private int field_K;
    private Validator field_F;

    final void updateInput(int param0, int param1, int param2, UiWidget param3) {
        try {
          this.field_K = this.field_K + 1;
          super.updateInput(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "kc.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltip(boolean param0) {
        if (this.hovered) {
          return this.field_F.getMessage(-2864);
        }
        if (!param0) {
          return null;
        }
        this.field_K = -116;
        return null;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var12 = null;
        Sprite var21 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = wizardrun.field_H;
        int var9Lifetime1;
        int var10Lifetime1;
        super.drawLayer(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        int var5 = this.x + param0 + (this.width >> 1);
        int var6 = (this.height >> 1) + (param3 + this.y);
        ValidationState var8 = this.field_F.getState(true);
        if (AccountFormTextHelpers.field_c == var8) {
          var15 = AchievementStateRequest.field_k[0];
          var9 = var15.fullWidth << 1;
          var10 = var15.fullHeight << 1;
          if (null == SoundCache.field_d) {
            SoundCache.field_d = new Sprite(var9, var10);
            UrlPacketDownloader.a(SoundCache.field_d, false);
            var15.drawRotatedAboutPivot(112, 144, var15.fullWidth << 4, var15.fullHeight << 4, -this.field_K << 10, 4096);
            UsernameLoginCredentials.popRasterState(4);
            SoundCache.field_d.drawAdditive(var5 - var15.fullWidth, var6 - var15.fullHeight, 256);
            return;
          }
          if (SoundCache.field_d.width < var9) {
            SoundCache.field_d = new Sprite(var9, var10);
            UrlPacketDownloader.a(SoundCache.field_d, false);
            var15.drawRotatedAboutPivot(112, 144, var15.fullWidth << 4, var15.fullHeight << 4, -this.field_K << 10, 4096);
            UsernameLoginCredentials.popRasterState(4);
            SoundCache.field_d.drawAdditive(var5 - var15.fullWidth, var6 - var15.fullHeight, 256);
            return;
          }
          if (SoundCache.field_d.height >= var10) {
            UrlPacketDownloader.a(SoundCache.field_d, false);
            SoftwareRasterizer.clear();
            var15.drawRotatedAboutPivot(112, 144, var15.fullWidth << 4, var15.fullHeight << 4, -this.field_K << 10, 4096);
            UsernameLoginCredentials.popRasterState(4);
            SoundCache.field_d.drawAdditive(var5 - var15.fullWidth, var6 - var15.fullHeight, 256);
            return;
          }
          SoundCache.field_d = new Sprite(var9, var10);
          UrlPacketDownloader.a(SoundCache.field_d, false);
          var15.drawRotatedAboutPivot(112, 144, var15.fullWidth << 4, var15.fullHeight << 4, -this.field_K << 10, 4096);
          UsernameLoginCredentials.popRasterState(4);
          SoundCache.field_d.drawAdditive(var5 - var15.fullWidth, var6 - var15.fullHeight, 256);
          return;
        }
        if (ValidationHelpWidget.field_S == var8) {
          var18 = AchievementStateRequest.field_k[0];
          var9Lifetime1 = var18.fullWidth << 1;
          var10Lifetime1 = var18.fullHeight << 1;
          if (null == SoundCache.field_d) {
            SoundCache.field_d = new Sprite(var9Lifetime1, var10Lifetime1);
            UrlPacketDownloader.a(SoundCache.field_d, false);
            var18.drawRotatedAboutPivot(112, 144, var18.fullWidth << 4, var18.fullHeight << 4, -this.field_K << 10, 4096);
            UsernameLoginCredentials.popRasterState(4);
            SoundCache.field_d.drawAdditive(var5 - var18.fullWidth, var6 - var18.fullHeight, 256);
            return;
          }
          if (SoundCache.field_d.width < var9Lifetime1) {
            SoundCache.field_d = new Sprite(var9Lifetime1, var10Lifetime1);
            UrlPacketDownloader.a(SoundCache.field_d, false);
            var18.drawRotatedAboutPivot(112, 144, var18.fullWidth << 4, var18.fullHeight << 4, -this.field_K << 10, 4096);
            UsernameLoginCredentials.popRasterState(4);
            SoundCache.field_d.drawAdditive(var5 - var18.fullWidth, var6 - var18.fullHeight, 256);
            return;
          }
          if (SoundCache.field_d.height >= var10Lifetime1) {
            UrlPacketDownloader.a(SoundCache.field_d, false);
            SoftwareRasterizer.clear();
            var18.drawRotatedAboutPivot(112, 144, var18.fullWidth << 4, var18.fullHeight << 4, -this.field_K << 10, 4096);
            UsernameLoginCredentials.popRasterState(4);
            SoundCache.field_d.drawAdditive(var5 - var18.fullWidth, var6 - var18.fullHeight, 256);
            return;
          }
          SoundCache.field_d = new Sprite(var9Lifetime1, var10Lifetime1);
          UrlPacketDownloader.a(SoundCache.field_d, false);
          var18.drawRotatedAboutPivot(112, 144, var18.fullWidth << 4, var18.fullHeight << 4, -this.field_K << 10, 4096);
          UsernameLoginCredentials.popRasterState(4);
          SoundCache.field_d.drawAdditive(var5 - var18.fullWidth, var6 - var18.fullHeight, 256);
          return;
        }
        if (DisplayNameSyntaxHelpers.field_c == var8) {
          var12 = AchievementStateRequest.field_k[2];
          var12.drawAdditive(-(var12.width >> 1) + var5, -(var12.height >> 1) + var6, 256);
          return;
        }
        if (ContentTransitionDialog.field_V == var8) {
          var21 = AchievementStateRequest.field_k[1];
          var21.drawAdditive(-(var21.width >> 1) + var5, var6 - (var21.height >> 1), 256);
          return;
        }
    }

    final boolean requestFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kc.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == 112) {
          field_G = null;
          field_J = null;
          field_H = null;
          return;
        }
        field_G = (int[]) null;
        field_G = null;
        field_J = null;
        field_H = null;
    }

    ValidationIndicator(Validator param0) {
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "kc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_J = "Names should contain a maximum of 12 characters";
        field_G = new int[256];
    }
}
