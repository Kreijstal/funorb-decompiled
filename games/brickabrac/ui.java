/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int[] field_a;
    static String field_b;

    final static void a(String param0, PaletteFont param1, int param2, IndexedSprite[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int dupTemp$0 = 0;
        int var17 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        String[] var19 = null;
        String[] var20 = null;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        var18 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param3 != null) {
            param1.setInlineSprites(param3, SocialTabbedPanel.field_f);
          }
          if (param6 != 1729) {
            field_a = (int[]) null;
          }
          var19 = new String[16];
          var20 = var19;
          var11 = new int[]{param8};
          var12 = param1.wrapText(param0, var11, var20);
          if (param1 == ContextActionController.field_g) {
            stackIn_8_0 = param1.capHeight;
          } else {
            stackIn_8_0 = param1.descent + param1.ascent;
          }
          var13 = stackIn_8_0;
          var14 = param8;
          var15 = 0;
          for (var16 = 0; var16 < var12; var16++) {
            dupTemp$0 = param1.measureText(var19[var16]);
            var15Lifetime1 = dupTemp$0;
            if (dupTemp$0 > var14) {
              var14 = var15Lifetime1;
            }
          }
          var15Lifetime2 = var13 * var12;
          if (var13 * var12 > param4) {
            param4 = var15Lifetime2;
          }
          if (param8 < var14) {
            param8 = var14;
          }
          LobbyUiHelpers.paintNineSliceFrame(param8 + 18, param4 + 18, -40, -9 + (param5 - param8), MultiValueSliderWidget.field_K, -param4 - 9 + param7);
          ap.field_a.drawTransparent(-(param8 * 0) + (param5 - 30), 6 + (param4 + (param7 - param4)));
          var16Lifetime1 = param7 + (-(var12 * var13) + param4 + 18) / 2;
          for (var17 = 0; var12 > var17; var17++) {
            if (param9 == 0) {
              param1.drawLeft(var20[var17], -param8 + param5 + param8 * 0 / 2, param1.ascent / 3 + (var16Lifetime1 - param4), param2, -1);
            } else {
              param1.drawCentered(var20[var17], -2 + param5 - param8 / 2, var16Lifetime1 + (-param4 + param1.ascent / 3), param2, -1);
            }
            var16Lifetime1 = var16Lifetime1 + var13;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_30_0 = var10;
          stackIn_30_1 = new StringBuilder().append("ui.A(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        LevelResultSubmission var4 = null;
        IntArrayRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = (LevelResultSubmission) (NinjaBackground.pendingLevelResults.first(-14));
          while (var4 != null) {
            kp.sendLevelResult(param0, (byte) 112, var4);
            var4 = (LevelResultSubmission) (NinjaBackground.pendingLevelResults.next((byte) 116));
          }
          var5 = (IntArrayRequest) (PasswordFieldRenderer.pendingIntArrayRequests.first(-61));
          while (var5 != null) {
            AchievementIcon.sendIntArrayRequest(param0, var5, 61);
            var5 = (IntArrayRequest) (PasswordFieldRenderer.pendingIntArrayRequests.next((byte) 116));
          }
          if (param1 != 115) {
            ui.a(-72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "ui.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != 384920353) {
          ui.a(false);
        }
        RichTextLayout.field_r = null;
        DirectByteStorage.field_g = null;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            SoundCache.field_d = param2;
            try {
              var6 = param1.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param2.length() != 0) {
                var5Lifetime6 = var7 + "; Expires=" + AppletGameShell.a((byte) -75, 94608000000L + MonotonicTime.nowMillis(false)) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ne.a(param1, "document.cookie=\"" + var5Lifetime6 + "\"", 5797);
            } catch (Throwable throwable) {
            }
            VolcanicBackground.a(false, param1);
            int var3_int = -23 / ((0 - param0) / 43);
          } catch (RuntimeException runtimeException) {
            throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ui.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0) {
        boolean stackIn_7_0 = false;
        if (param0) {
          field_b = (String) null;
        }
        stackIn_7_0 = (AchievementIcon.field_j >= 10) && (!LevelPackSelectScreen.field_s) && (!IntrusiveHashIterator.a(false));
        return stackIn_7_0;
    }

    public static void b(int param0) {
        if (param0 != 1516) {
          field_b = (String) null;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "The power-up gauges above fill as you destroy their picture bricks. When a gauge is filled it releases a power-up.<br><br>Power-up charge earned on one level carries over to the next.";
        field_a = new int[]{29, 31, 30, 8, 23};
    }
}
