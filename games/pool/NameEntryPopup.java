/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameEntryPopup extends UiComponent {
    private int completionState;
    private UiComponent inputText;
    private StringBuilder nameBuffer;
    private UiComponent prompt;
    static int[][][] field_Ob;
    static String tutorialNext;
    static String gameoptBadnumplayers;
    static ScrollPaneWithFooter field_Mb;
    static String waitingforMusic;

    final static Sprite createDecodedSprite(byte obfuscationGuard) {
        int var4_int = 0;
        int var5 = Pool.field_O;
        int var1 = AccountTextSupport.field_f[0] * LinkButtonPainter.field_a[0];
        byte[] var2 = LimitedRandomAccessFile.field_b[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = IntrusiveNode.field_h[ArchiveLoadSequence.bitwiseAnd((int) var2[var4_int], 255)];
        }
        Sprite var4 = new Sprite(DialRenderer.field_c, AccountStateQuery.field_r, AchievementsScreen.field_I[0], LoginRequestSupport.field_d[0], LinkButtonPainter.field_a[0], AccountTextSupport.field_f[0], var3);
        if (obfuscationGuard != 89) {
          NameEntryPopup.createDecodedSprite((byte) 30);
        }
        OpacityWidget.releaseSpriteDecoderArrays(-1);
        return var4;
    }

    NameEntryPopup(int param0, int param1, int param2, int param3, String param4, UiComponent param5, UiComponent param6, UiComponent param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.completionState = 0;
        try {
          this.prompt = new UiComponent(0L, param6, param4);
          this.addChild(117, this.prompt);
          this.inputText = new UiComponent(0L, param7);
          this.inputText.textColor = 16764006;
          this.addChild(-126, this.inputText);
          this.inputText.textSuffix = "|";
          this.nameBuffer = new StringBuilder(12);
          var9_int = this.prompt.getContentWidth(true);
          this.prompt.setBounds(3, 2147483647, 5, var9_int, ArchiveIndex.field_x);
          this.inputText.setBounds(ArchiveIndex.field_x + 3, 2147483647, 5, var9_int, ArchiveIndex.field_x);
          var10 = 5 + (5 + var9_int);
          var11 = 3 + (2 * ArchiveIndex.field_x + 3);
          var12 = DebugTuningSupport.adjustWidthForRightEdge(var10, param2, param0, 0);
          var13 = OpacityWidget.placePopupVertically(var11, param1, -1, param3);
          this.setBounds(var13, 2147483647, var12, var10, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("aj.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_Ob = (int[][][]) null;
        waitingforMusic = null;
        field_Mb = null;
        gameoptBadnumplayers = null;
        tutorialNext = null;
    }

    final static int floorModPositiveDivisor(boolean obfuscationGuard, int divisor, int value) {
        if (!obfuscationGuard) {
          return -93;
        }
        int var3 = value >> 31 & -1 + divisor;
        return (value + (value >>> 31)) % divisor + var3;
    }

    final static Sprite[] loadSpritesByName(int obfuscationGuard, String groupName, ResourceArchive archive, String fileName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = archive.getGroupId(groupName, obfuscationGuard - 1);
          var5 = archive.getFileId(var4_int, obfuscationGuard, fileName);
          stackIn_1_0 = ModelOriginSupport.loadSpriteSheet(var4_int, (byte) 110, archive, var5);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("aj.E(").append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (archive == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (fileName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void setSessionCookie(java.applet.Applet applet, int obfuscationGuard, String session) {
        try {
          String var3 = null;
          String var5 = null;
          String var4 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            TextInputPainter.field_y = session;
            try {
              if (obfuscationGuard != -18788) {
                waitingforMusic = (String) null;
              }
              var3 = applet.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = applet.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + session + "; version=1; path=/; domain=" + var4;
              if (session.length() == 0) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              JavaScriptBridge.evaluateScript("document.cookie=\"" + var5Lifetime4 + "\"", applet, (byte) 35);
            } catch (Throwable throwable) {
            }
            IntrusiveNodeHashTable.updateBrowserNavigationLinks(558370049, applet);
          } catch (RuntimeException runtimeException) {
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "aj.D(" + (applet != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (session != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean handleNormalizedNameKey(int param0) {
        int var2 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        if (this.completionState != 0) {
          return false;
        }
        if (param0 != 20628) {
          java.applet.Applet var3 = (java.applet.Applet) null;
          NameEntryPopup.readLastLoginMethod((java.applet.Applet) null, 1);
        }
        if (85 == IterableDualLinkDeque.field_a &&
          !(this.nameBuffer.length() <= 0)) {
          TikiTableScene.resizeStringBuilder(' ', this.nameBuffer.length() - 1, -2790, this.nameBuffer);
        }
        if (this.nameBuffer.length() < 12) {
          var2 = Character.toLowerCase(LoginMethod.field_b);
          if (var2 == 32) {
            var2 = 95;
          }
          if (var2 == 95 &&
            !(this.nameBuffer.length() <= 0)) {
            discarded$0 = this.nameBuffer.append((char) var2);
          }
          if (ContextMenu.isAsciiLetter((char) var2, 22987) ||
            LobbyGame.isAsciiDigit((char) var2, (byte) 85)) {
            discarded$1 = this.nameBuffer.append((char) var2);
          }
        }
        if (IterableDualLinkDeque.field_a == 84) {
          if (this.nameBuffer.length() > 0) {
            this.text = this.nameBuffer.toString();
            this.completionState = 2;
          } else {
            this.completionState = 1;
          }
        }
        if (13 != IterableDualLinkDeque.field_a) {
          return true;
        }
        this.completionState = 1;
        return true;
    }

    final static LoginMethod readLastLoginMethod(java.applet.Applet applet, int obfuscationGuard) {
        String var2 = null;
        RuntimeException var2_ref = null;
        LoginMethod[] var3 = null;
        int var4 = 0;
        LoginMethod var5 = null;
        LoginMethod stackIn_4_0 = null;
        LoginMethod stackIn_9_0 = null;
        LoginMethod stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = LoginPayload.readCookie(-21721, "jagex-last-login-method", applet);
          if (obfuscationGuard != 5137) {
            NameEntryPopup.multiplyFixed16(-103, false, 80);
          }
          if (var2 == null) {
            stackIn_4_0 = BitmapTextLayout.field_l;
            return stackIn_4_0;
          }
          var3 = PolarBallSkin.getLoginMethods((byte) -66);
          var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              stackIn_12_0 = BitmapTextLayout.field_l;
              return stackIn_12_0;
            }
            var5 = var3[var4];
            if (!var5.matchesName(var2, (byte) 49)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var5;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("aj.B(");
          if (applet == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int multiplyFixed16(int left, boolean obfuscationGuard, int right) {
        long var3;
        String var5;
        var3 = (long)right * (long)left;
        if ((255L & var3 >> 47) != 0L &&
          255L != (255L & var3 >> 47)) {
          var3 = ((long)right >> 8) * ((long)left >> 8);
        } else {
          var3 = var3 >> 16;
        }
        if (obfuscationGuard) {
          var5 = (String) null;
          NameEntryPopup.loadSpritesByName(23, (String) null, (ResourceArchive) null, (String) null);
        }
        if (0 > right &&
          0 > left &&
          var3 < 0L) {
          throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + right + "[" + WidgetStyleLayer.fixed16ToFloat(126, right) + ", " + Integer.toString(right, 16) + "], " + left + "[" + WidgetStyleLayer.fixed16ToFloat(126, left) + ", " + Integer.toString(left, 16) + "]) and got a negative number: " + var3 + "[" + PotEvent.fixed16ToDouble((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
        }
        if ((0 < right &&
          0 > left ||
          right < 0 &&
          left > 0) && var3 > 0L) {
          throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + right + "[" + WidgetStyleLayer.fixed16ToFloat(127, right) + ", " + Integer.toString(right, 16) + "], " + left + "[" + WidgetStyleLayer.fixed16ToFloat(126, left) + ", " + Integer.toString(left, 16) + "]) and got a positive number: " + var3 + "[" + PotEvent.fixed16ToDouble((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
        }
        if (right > 0 &&
          0 < left &&
          var3 < 0L) {
          throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + right + "[" + WidgetStyleLayer.fixed16ToFloat(126, right) + ", " + Integer.toString(right, 16) + "], " + left + "[" + WidgetStyleLayer.fixed16ToFloat(127, left) + ", " + Integer.toString(left, 16) + "]) and got a negative number: " + var3 + "[" + PotEvent.fixed16ToDouble((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
        }
        return (int)var3;
    }

    final int updateAndPollNameInput(boolean param0, byte param1) {
        StringBuilder discarded$2 = null;
        int var4;
        var4 = Pool.field_O;
        this.updateRoot(param0, false);
        if (param1 >= -74) {
          return -46;
        }
        if (param0) {
          while (LabeledChildWidget.pollKeyEvent(127)) {
            if (85 == IterableDualLinkDeque.field_a &&
              this.nameBuffer.length() > 0) {
              TikiTableScene.resizeStringBuilder(' ', -1 + this.nameBuffer.length(), -2790, this.nameBuffer);
            }
            if (CanvasInputSupport.canAppendNameCharacter(LoginMethod.field_b, (CharSequence) ((Object) this.nameBuffer), 15692) ||
              (this.nameBuffer.length() == 0 &&
              LoginMethod.field_b == 91 ||
              1 == this.nameBuffer.length() &&
              LoginMethod.field_b == 35) ||
              LoginMethod.field_b == 93) {
              discarded$2 = this.nameBuffer.append(LoginMethod.field_b);
            }
            if (IterableDualLinkDeque.field_a != 84) {
              if (13 != IterableDualLinkDeque.field_a) {
                continue;
              }
              return 1;
            }
            if (this.nameBuffer.length() <= 0) {
              return 1;
            }
            this.text = this.nameBuffer.toString();
            return 2;
          }
        }
        this.inputText.text = this.nameBuffer.toString();
        if (param0 &&
          0 != MatchingTextValidator.field_s &&
          this.pressedButton == 0) {
          this.completionState = 1;
        }
        return this.completionState;
    }

    static {
        int var0 = 0;
        tutorialNext = "Next";
        gameoptBadnumplayers = "You do not have a suitable number of players for the current options.";
        field_Ob = new int[5][][];
        field_Ob[0] = new int[][]{new int[]{16}, new int[]{23}, new int[]{16, 16, 16, 16, 23, 16, 16, 16, 16}, new int[]{16}, new int[]{16}, new int[]{16, 16, 16, 23, 16, 16, 16, 23, 16}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{23, 16}, new int[]{16, 23, 16, 23, 16, 23, 23, 23}};
        field_Ob[1] = new int[][]{new int[]{16}, new int[]{23, 23, 16, 23, 23, 23, 23, 23, 23}, new int[]{16, 16, 16, 16, 23, 16, 16, 16, 16}, new int[]{16}, new int[]{16}, new int[]{16, 16, 16, 23, 16, 16, 16, 23, 16}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{23, 16}, new int[]{16, 23, 16, 23, 16, 23, 23, 23}};
        field_Ob[3] = new int[][]{new int[]{16}, new int[]{23}, new int[]{16, 16, 16, 16, 23, 16, 16, 16, 16}, new int[]{16}, new int[]{16}, new int[]{16, 16, 16, 23, 16, 16, 16, 23, 16}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{22, 22, 16, 16, 16, 22, 22, 22, 22, 22}, new int[]{23, 16}, new int[]{15, 20, 15, 20, 15, 20, 15, 20}};
        field_Ob[2] = new int[][]{new int[]{16}, new int[]{23}, new int[]{16, 16, 16, 16, 23, 16, 16, 16, 16}, new int[]{16}, new int[]{16}, new int[]{16, 16, 16, 23, 16, 16, 16, 23, 16}, new int[]{23, 23, 16, 16, 23, 23, 23, 23, 23}, new int[]{22, 22, 16, 16, 16, 22, 22, 22, 22, 22}, new int[]{23, 16}, new int[]{16, 23, 16, 23, 16, 23, 23, 23}};
        for (var0 = 0; var0 < 5; var0++) {
          if (field_Ob[var0] == null) {
            field_Ob[var0] = field_Ob[0];
          }
        }
        waitingforMusic = "Waiting for music";
    }
}
