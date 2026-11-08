/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HotspotRectangle extends IntrusiveNode {
    int field_s;
    static String reject;
    HotspotRectangle field_l;
    static BitmapFont field_t;
    int field_p;
    static String rulePillar1;
    int field_q;
    static UiComponent field_v;
    int field_n;
    int field_w;
    static int field_r;
    static String playersXOfY;

    final static void advanceBallPhysicsFrame(int[][] points, CushionSegment[] segments, Ball[] balls, int obfuscationGuard) {
        int dupTemp$1 = 0;
        Ball[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Ball[] var6 = null;
        Ball[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        Ball[] var4Lifetime1;
        int var5Lifetime1;
        try {
          NodeHashTableIterator.field_s = -1;
          Base37Support.field_b = 0;
          BallEvent.field_l = 0;
          var6 = balls;
          var4 = var6;
          for (var5 = 0; var6.length > var5; var5++) {
            var6[var5].lastAdvanceTime = 0;
          }
          var4_int = 0;
          do {
            dupTemp$1 = FadingDialog.detectAndApplyBallCollisions(segments, var4_int, balls, points, obfuscationGuard + 0);
            var4_int = dupTemp$1;
          } while (dupTemp$1 != -1);
          var7 = balls;
          var4Lifetime1 = var7;
          var8 = obfuscationGuard;
          var5Lifetime1 = var8;
          while (var8 < var7.length) {
            if (var7[var8].inPlay) {
              var7[var8].updateFrictionAndSpin(false);
            }
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("qa.F(");
          if (points == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (segments == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (balls == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        playersXOfY = null;
        field_t = null;
        rulePillar1 = null;
        reject = null;
        field_v = null;
        if (param0 < 4) {
          reject = (String) null;
        }
    }

    final static void beginLoginWithCredentials(boolean active, String username, int obfuscationGuard, String password) {
        try {
          SpriteState.field_x = username;
          VertexTransformSupport.field_a = password;
          PacketAvailabilitySupport.showLoginProgressDialog(active, DebouncedValidationProvider.loggingIn, -126);
          int var4_int = -110 % ((obfuscationGuard + 30) / 57);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qa.E(" + active + ',' + (username != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (password != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean containsNonAlphanumeric(int obfuscationGuard, String text) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          if (obfuscationGuard != 1) {
            return false;
          }
          for (var2_int = 0; var2_int < text.length(); var2_int++) {
            var3 = text.charAt(var2_int);
            if (!ContextMenu.isAsciiLetter((char) var3, 22987) &&
              !LobbyGame.isAsciiDigit((char) var3, (byte) 120)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("qa.B(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void drawLobbyAndGameOverlays(byte obfuscationGuard, boolean active) {
        ClientException.drawLobbyPanels(active, (byte) 80);
        if (obfuscationGuard != 55) {
          String var3 = (String) null;
          HotspotRectangle.reverseString((String) null, 95);
        }
        Quaternion.drawGameOverlays(active, obfuscationGuard - 19268);
    }

    final static String reverseString(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = param1; var2_int > var4; var4++) {
            var3[var2_int + (-1 - var4)] = param0.charAt(var4);
          }
          stackIn_4_0 = new String(var3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qa.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void drawWrappedPointerTooltip(byte obfuscationGuard, int wrapWidth, BitmapFont font, String text, int foreground, int background) {
        int var11 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Pool.field_O;
        try {
          var6_int = font.stringWidth(text);
          var7 = font.maxDescent + font.maxAscent;
          var8 = 1;
          if (var6_int > wrapWidth) {
            var9 = var6_int / wrapWidth;
            var10 = 2 * ((-1 + (var6_int % wrapWidth + var9)) / var9) + wrapWidth;
            if (null == StateIconLabel.field_Mb) {
              StateIconLabel.field_Mb = new String[16];
            }
            var8Lifetime1 = font.wrapText(text, new int[]{var10}, StateIconLabel.field_Mb);
            var7 = var7 * var8Lifetime1;
            var6_int = 0;
            for (var11 = 0; var11 < var8Lifetime1; var11++) {
              var12 = font.stringWidth(StateIconLabel.field_Mb[var11]);
              if (var12 > var6_int) {
                var6_int = var12;
              }
            }
          }
          if (obfuscationGuard != 71) {
            return;
          }
          var9Lifetime1 = TimeTrialSelectScreen.field_H;
          if (var9Lifetime1 + var6_int + 6 > SoftwareRasterizer.width) {
            var9Lifetime1 = -6 - var6_int + SoftwareRasterizer.width;
          }
          var10 = -font.field_L + (SceneNodeEntry.field_p + 32);
          if (SoftwareRasterizer.height < var7 + (var10 + 6)) {
            var10 = SceneNodeEntry.field_p + (-var7 - 6);
          }
          SoftwareRasterizer.drawRectangle(var9Lifetime1, var10, 6 + var6_int, 6 + var7, foreground);
          SoftwareRasterizer.fillRectangle(1 + var9Lifetime1, 1 + var10, var6_int + 4, 4 + var7, background);
          font.drawParagraph(text, 3 + var9Lifetime1, var10 + 3, var6_int, var7, foreground, -1, 0, 0, font.maxDescent + font.maxAscent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("qa.A(").append(obfuscationGuard).append(',').append(wrapWidth).append(',');
          if (font == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (text == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(foreground).append(',').append(background).append(')').toString());
        }
    }

    HotspotRectangle(int param0, int param1, int param2, int param3, int param4) {
        this.field_s = param0;
        this.field_q = param4;
        this.field_p = param2;
        this.field_n = param1;
        this.field_w = param3;
    }

    static {
        reject = "Reject";
        rulePillar1 = "Respect";
        playersXOfY = "Players: <%0>/<%1>";
    }
}
