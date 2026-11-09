/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ProxyAuthenticationRequiredException extends IOException {
    static int field_f;
    static LoginCredentialType USERNAME_CREDENTIALS;
    static SpriteData[] field_a;
    static ToolkitSprite[] field_e;
    static String connectionLostText;
    static PcmStreamMixer field_d;

    final static void drawLoadingProgress(boolean guard, int percent, java.awt.Color barColor, boolean clearBackground, String message) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        try {
          try {
            var10 = qn.field_f.getGraphics();
            if (null == LegacyOpenGlSpriteTexture.field_s) {
              LegacyOpenGlSpriteTexture.field_s = new java.awt.Font("Helvetica", 1, 13);
            }
            if (clearBackground) {
              var10.setColor(java.awt.Color.black);
              var10.fillRect(0, 0, LegacyOpenGlRidgedWaterEffect.field_h, wq.field_b);
            }
            if (barColor == null) {
              barColor = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == ValidationStatus.field_a) {
                ValidationStatus.field_a = qn.field_f.createImage(304, 34);
              }
              var11 = ValidationStatus.field_a.getGraphics();
              var11.setColor(barColor);
              var11.drawRect(0, 0, 303, 33);
              var11.fillRect(2, 2, percent * 3, 30);
              var11.setColor(java.awt.Color.black);
              var11.drawRect(1, 1, 301, 31);
              var11.fillRect(percent * 3 + 2, 2, 300 - 3 * percent, 30);
              var11.setFont(LegacyOpenGlSpriteTexture.field_s);
              if (!guard) {
                var9 = (String) null;
                ProxyAuthenticationRequiredException.drawLoadingProgress(true, -9, (java.awt.Color) null, true, (String) null);
              }
              var11.setColor(java.awt.Color.white);
              var11.drawString(message, (-(message.length() * 6) + 304) / 2, 22);
              var10.drawImage(ValidationStatus.field_a, LegacyOpenGlRidgedWaterEffect.field_h / 2 - 152, -18 + wq.field_b / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + LegacyOpenGlRidgedWaterEffect.field_h / 2;
              var8 = wq.field_b / 2 - 18;
              var10.setColor(barColor);
              var10.drawRect(var7, var8, 303, 33);
              var10.fillRect(2 + var7, var8 + 2, 3 * percent, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(var7 + 1, 1 + var8, 301, 31);
              var10.fillRect(percent * 3 + (var7 + 2), var8 + 2, 300 - percent * 3, 30);
              var10.setFont(LegacyOpenGlSpriteTexture.field_s);
              var10.setColor(java.awt.Color.white);
              var10.drawString(message, var7 + (304 - message.length() * 6) / 2, 22 + var8);
            }
            if (LegacyOpenGlAssemblyProgram.field_d == null) {
              return;
            }
            var10.setFont(LegacyOpenGlSpriteTexture.field_s);
            var10.setColor(java.awt.Color.white);
            var10.drawString(LegacyOpenGlAssemblyProgram.field_d, LegacyOpenGlRidgedWaterEffect.field_h / 2 - LegacyOpenGlAssemblyProgram.field_d.length() * 6 / 2, wq.field_b / 2 - 26);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            qn.field_f.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("hh.B(").append(guard).append(',').append(percent).append(',');
          if (barColor == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(clearBackground).append(',');
          if (message == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    ProxyAuthenticationRequiredException(String authenticationScheme) {
        super(authenticationScheme);
    }

    public static void releaseStatics(int param0) {
        connectionLostText = null;
        field_a = null;
        field_d = null;
        int var1 = -11 % ((param0 - 24) / 60);
        field_e = null;
        USERNAME_CREDENTIALS = null;
    }

    static {
        USERNAME_CREDENTIALS = new LoginCredentialType(2);
        connectionLostText = "Connection lost. <%0>";
    }
}
