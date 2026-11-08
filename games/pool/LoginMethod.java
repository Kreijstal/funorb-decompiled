/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethod {
    static String muGamelistElapsedTime;
    static int field_d;
    static String[] mustloginAlternate;
    static UiComponent field_e;
    static String wouldYouLikeToPlayOrPass;
    private String field_i;
    static int[] field_l;
    static char field_b;
    static int[] field_k;
    static int field_j;
    static String tutorialShow;
    static int[][] field_h;

    final static int getSharedPanelWidth(int param0) {
        if (param0 < 6) {
          tutorialShow = (String) null;
        }
        return -CacheEntry.field_z + AchievementProtocolSupport.field_c;
    }

    final boolean matchesName(String param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 46) {
            stackIn_4_0 = this.field_i.equals(param0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ml.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void saveLastLoginMethodCookie(java.applet.Applet param0, boolean param1) {
        try {
          if (!param1) {
            tutorialShow = (String) null;
          }
          BrowserCookieWriter.setBrowserCookie(31536000L, (byte) -120, param0, this.field_i, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ml.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        mustloginAlternate = null;
        tutorialShow = null;
        if (param0 != -26458) {
          LoginMethod.getSharedPanelWidth(65);
        }
        field_k = null;
        wouldYouLikeToPlayOrPass = null;
        field_e = null;
        field_h = (int[][]) null;
        muGamelistElapsedTime = null;
        field_l = null;
    }

    LoginMethod(String param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ml.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawSpriteWithHorizontalAlphaGradient(int leftAlpha, byte obfuscationGuard, int x, int y, Sprite sprite, int rightAlpha) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Sprite var21 = null;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = Pool.field_O;
        try {
          var6_int = (rightAlpha - leftAlpha << 8) / sprite.field_w;
          var7 = (leftAlpha << 8) + sprite.field_G * var6_int;
          x = x + sprite.field_G;
          y = y + sprite.field_B;
          var8 = x + SoftwareRasterizer.width * y;
          var9 = 0;
          var10 = sprite.field_A;
          var11 = sprite.field_z;
          var12 = SoftwareRasterizer.width - var11;
          var13 = 0;
          if (y < SoftwareRasterizer.clipTop) {
            var14 = -y + SoftwareRasterizer.clipTop;
            var8 = var8 + var14 * SoftwareRasterizer.width;
            var9 = var9 + var11 * var14;
            y = SoftwareRasterizer.clipTop;
            var10 = var10 - var14;
          }
          if (var10 + y > SoftwareRasterizer.clipBottom) {
            var10 = var10 - (-SoftwareRasterizer.clipBottom + (var10 + y));
          }
          if (x < SoftwareRasterizer.clipLeft) {
            var14Lifetime1 = -x + SoftwareRasterizer.clipLeft;
            x = SoftwareRasterizer.clipLeft;
            var8 = var8 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var7 = var7 + var6_int * var14Lifetime1;
            var12 = var12 + var14Lifetime1;
          }
          if (x + var11 > SoftwareRasterizer.clipRight) {
            var14Lifetime2 = x + (var11 - SoftwareRasterizer.clipRight);
            var12 = var12 + var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
          }
          if (0 < var11 &&
            var10 > 0) {
            if (obfuscationGuard < 44) {
              var21 = (Sprite) null;
              LoginMethod.drawSpriteWithHorizontalAlphaGradient(26, (byte) 106, -29, 66, (Sprite) null, 59);
            }
            for (y = -var10; y < 0; y++) {
              var14Lifetime3 = var7;
              for (x = -var11; x < 0; x++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = 256 - var15;
                if (var15 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = sprite.field_D[incrementValue$0];
                  if (0 != var17) {
                    if (var15 <= 255) {
                      var18 = SoftwareRasterizer.pixels[var8];
                      var19 = 16711935 & var16 * (var18 & 16711935) + (var17 & 16711935) * var15 >> 8;
                      SoftwareRasterizer.pixels[var8] = var19 + ArchiveLoadSequence.bitwiseAnd(65280, ArchiveLoadSequence.bitwiseAnd(var17, 65280) * var15 + var16 * ArchiveLoadSequence.bitwiseAnd(var18, 65280) >> 8);
                    } else {
                      SoftwareRasterizer.pixels[var8] = var17;
                    }
                  }
                  var8++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_36_0 = var6;
          stackIn_36_1 = new StringBuilder().append("ml.F(").append(leftAlpha).append(',').append(obfuscationGuard).append(',').append(x).append(',').append(y).append(',');
          if (sprite == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(rightAlpha).append(')').toString());
        }
    }

    final static void submitHighScore(int param0, HighScoreSubmission param1, int param2) {
        GradientPaletteSupport.field_i.addFirst((byte) -31, param1);
        if (param0 != 25756) {
          return;
        }
        try {
          WidgetContainer.sendHighScoreSubmission(false, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ml.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        muGamelistElapsedTime = "Elapsed time";
        mustloginAlternate = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        wouldYouLikeToPlayOrPass = "<%0>, would you like to <u>play</u> the next shot or <u>pass</u> and make your opponent play?";
        field_l = new int[12];
        field_k = new int[]{8};
        tutorialShow = "Show";
        field_h = new int[][]{new int[]{1, 1, 2, 1}, new int[]{1, 1, 2, 2}, new int[]{1, 1, 2, 3}, new int[]{1, 1, 2, 4}, new int[]{1, 1, 2, 5}, new int[]{-1, 3, 1, 0}, new int[]{-1, 5, 1, 0}, new int[]{-1, 6, 1, 0}, new int[]{-1, 7, 1, 0}, new int[]{-1, 8, 1, 0}, new int[]{-1, 3, 1, 1}, new int[]{-1, 4, 1, 1}, new int[]{-1, 5, 1, 1}, new int[]{-1, 6, 1, 1}, new int[]{-1, 7, 1, 1}, new int[]{-1, 8, 1, 1}};
    }
}
