/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatHelpDialog extends UiComponent {
    static String gameoptPlayersdontqualify;
    static String addXToFriends;
    static String tutorialCameraRotate;
    static String musicColon;
    static String cannotAddYourself;
    private UiComponent closeButton;

    final static boolean f(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          if (param0 != -13164) {
            QuickChatHelpDialog.f(89);
          }
          UiComponentNode.field_y = UiComponentNode.field_y + 1;
          if (Ball.field_B.length <= UiComponentNode.field_y) {
            return false;
          }
          for (var1_int = 0; pc.field_a.length > var1_int; var1_int++) {
            Ball.field_B[UiComponentNode.field_y][var1_int].copyFrom(pc.field_a[var1_int], (byte) -12);
          }
          pc.field_a = Ball.field_B[UiComponentNode.field_y];
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "fn.G(" + param0 + ')');
        }
    }

    final static LobbyPlayer b(long param0, int param1) {
        if (param1 == 0) {
          return (LobbyPlayer) (LobbyPlayer.field_Qb.findFirst(param0, false));
        }
        String var4 = (String) null;
        QuickChatHelpDialog.a((String) null, -19, (String) null, -83, true, (String) null, -49);
        return (LobbyPlayer) (LobbyPlayer.field_Qb.findFirst(param0, false));
    }

    final boolean updateAndPollDismissal(byte param0, boolean param1) {
        if (param0 != -52) {
          return true;
        }
        this.updateRoot(true, false);
        if (MatchingTextValidator.field_s != 0) {
          if (this.pressedButton == 0) {
            return true;
          }
          return this.closeButton.pressedButton != 0 ? true : false;
        }
        if (this.closeButton.pressedButton == 0) {
          return false;
        }
        return true;
    }

    final static BinaryBitmapFont a(byte param0, byte[] param1) {
        BinaryBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        BinaryBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (BinaryBitmapFont) (stackIn_2_0);
          }
          var2 = new BinaryBitmapFont(param1, AchievementsScreen.field_I, ih.field_d, LinkButtonPainter.field_a, rc.field_f, LimitedRandomAccessFile.field_b);
          OpacityWidget.h(-1);
          if (param0 < 119) {
            QuickChatHelpDialog.f(-82);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("fn.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(pn param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        pn var4 = null;
        int var2_intLifetime1;
        var3 = Pool.field_O;
        try {
          var2_int = FreePlayRules.field_g;
          if (param0.field_p == 2) {
            if (param0.field_g) {
              var2_intLifetime1 = FreePlayRules.field_g;
            } else {
              if (param0.field_m == 0 &&
                param0.field_e == 0) {
                var2_intLifetime1 = Ball.field_F[param0.field_p];
              } else {
                var2_intLifetime1 = ThreeSliceButtonPainter.field_A[param0.field_p];
              }
            }
          } else {
            if (param0.field_p != 4) {
              if (~BitmapTextLayout.field_m == ~param0.field_b) {
                var2_intLifetime1 = Ball.field_F[param0.field_p];
              } else {
                var2_intLifetime1 = ThreeSliceButtonPainter.field_A[param0.field_p];
              }
            } else {
              var2_intLifetime1 = ThreeSliceButtonPainter.field_A[param0.field_p];
            }
          }
          if (param1 > -30) {
            var4 = (pn) null;
            QuickChatHelpDialog.a((pn) null, 64);
          }
          stackIn_16_0 = var2_intLifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("fn.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        int var2 = BufferedFile.field_h * BufferedFile.field_h;
        int var3 = -(param1 * param1) + var2;
        ff.a(-24, SoftwareRasterizer.height - 120 + var3 * 120 / var2);
        if (param0 == 5938) {
          return;
        }
        musicColon = (String) null;
    }

    public static void releaseStatics(int param0) {
        musicColon = null;
        if (param0 <= 12) {
          String var2 = (String) null;
          QuickChatHelpDialog.a((String) null, -57, (String) null, 61, false, (String) null, 44);
          gameoptPlayersdontqualify = null;
          cannotAddYourself = null;
          tutorialCameraRotate = null;
          addXToFriends = null;
          return;
        }
        gameoptPlayersdontqualify = null;
        cannotAddYourself = null;
        tutorialCameraRotate = null;
        addXToFriends = null;
    }

    final static int a(String param0, int param1, String param2, int param3, boolean param4, String param5, int param6) {
        LoginTextValue var7 = null;
        RuntimeException var7_ref = null;
        LoginTextValue var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 50) {
            addXToFriends = (String) null;
          }
          var7 = new LoginTextValue(param2);
          var8 = new LoginTextValue(param0);
          stackIn_3_0 = ih.a(param5, (byte) 87, param1, param4, var7, var8, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("fn.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    QuickChatHelpDialog(UiComponent param0, UiComponent param1, UiComponent param2, UiComponent param3, UiComponent param4, UiComponent param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        UiComponent var8 = null;
        UiComponent var9 = null;
        int var10 = 0;
        int var11 = 0;
        UiComponent var13 = null;
        UiComponent var14 = null;
        int var15 = 0;
        UiComponent var16 = null;
        int var10Lifetime1;
        try {
          var16 = new UiComponent(0L, param1, w.quickchatHelp.toUpperCase());
          var16.horizontalAlignment = 1;
          this.closeButton = new UiComponent(0L, param2);
          var8 = new UiComponent(0L, param3);
          var9 = new UiComponent(0L, param3, jd.quickchatHelpTitle);
          var9.horizontalAlignment = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; bj.quickchatShortcutHelp.length > var12; var12++) {
            var13 = new UiComponent(0L, param3, ck.quickchatShortcutKeys[var12]);
            var14 = new UiComponent(0L, param3, bj.quickchatShortcutHelp[var12]);
            var15 = param3.font.b(bj.quickchatShortcutHelp[var12]);
            var13.setBounds(var10, 2147483647, 20, 65, 15);
            if (var11 < var15) {
              var11 = var15;
            }
            var14.setBounds(var10, 2147483647, 90, 640, 15);
            var8.addChild(-126, var13);
            var10 += 30;
            var8.addChild(-98, var14);
          }
          var16.setBounds(0, 2147483647, 0, 20 + var11 + 90, 24);
          var10 += 15;
          this.setBounds(100, 2147483647, 100, var16.width, var10 + var16.height);
          this.closeButton.setBounds(5, 2147483647, -20 + var16.width, 15, 15);
          var8.setBounds(var16.height, 2147483647, 0, this.width, this.height - var16.height);
          var9.setBounds(20, 2147483647, 0, this.width, 15);
          var8.frameSprites = rp.buildNineSliceFrameSprites(32450, 3, 2105376, var8.height, 11579568, 8421504);
          var16.addChild(-115, this.closeButton);
          var8.addChild(-122, var9);
          this.addChild(-95, var16);
          this.addChild(-110, var8);
          this.localX = -(this.width >> 1) + 320;
          var10Lifetime1 = 240 - (this.height >> 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("fn.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        gameoptPlayersdontqualify = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        addXToFriends = "Add <%0> to friend list";
        tutorialCameraRotate = "To <u=ffffff>rotate</u> around the table: <col=99ff99>Hold</col> the <img=2> <col=99ff99>right mouse button</col> (or <img=9>+<img=0> left mouse button) and move the mouse. Try it now to move on.";
        musicColon = "Music: ";
        cannotAddYourself = "You cannot add yourself!";
    }
}
