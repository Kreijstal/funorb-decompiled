/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameSuggestionHelpers {
    static Sprite field_b;
    static MatchController field_e;
    static boolean field_d;
    static int field_a;
    static int field_c;
    static String field_f;

    final static void sendChatFilterSettings(int param0, boolean param1) {
        CipherPacketBuffer var2 = ChatMessage.field_f;
        var2.writeOpcode(param0, 15514);
        var2.writeByte(160, 2);
        var2.writeByte(160, 4);
        if (param1) {
          var2.writeByte(160, DelegatingCanvas.packChatFilterSettings((byte) -102));
          return;
        }
        NameSuggestionHelpers.advanceSlideshow(16, true);
        var2.writeByte(160, DelegatingCanvas.packChatFilterSettings((byte) -102));
    }

    public static void releaseStatics(boolean param0) {
        field_f = null;
        field_e = null;
        if (param0) {
          field_b = (Sprite) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void sendStatsRequest(int param0, int param1) {
        CipherPacketBuffer var2 = ChatMessage.field_f;
        var2.writeOpcode(param1, 15514);
        if (param0 > 124) {
          var2.writeByte(160, 1);
          var2.writeByte(160, 2);
          return;
        }
    }

    final static void setNameSuggestions(String[] args, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ResourceArchive.field_b != null) {
            ResourceArchive.field_b.field_W.setSuggestions((byte) -98, args);
          }
          if (param1 != 2) {
            return;
          }
          if (ChatMessage.field_c == null) {
            return;
          }
          ChatMessage.field_c.field_S.setSuggestions((byte) -90, args);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ro.F(");
          if (args == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void initializeLobbyUi(boolean param0, Sprite[][] param1, int param2, int param3, ResourceArchive param4, String[] param5, int[] param6, String[][] param7, IndexedSprite[] param8, int param9, int[] param10, byte[] param11, String[][] param12, ResourceArchive param13, Sprite[][] param14, byte[] param15, ResourceArchive param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        String[] var19 = null;
        try {
          var19 = (String[]) null;
          LobbyStartupHelpers.initializeLobbyUi(param16, param13, true, param11, param7, param2, param8, param6, (String[]) null, 1, param0, param12, param9, param10, param1, param4, param5, param15, param14);
          if (param3 != -15690) {
            var18 = (String[]) null;
            NameSuggestionHelpers.setNameSuggestions((String[]) null, -104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("ro.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param7 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param8 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param11 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param12 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param13 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param15 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param16 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static int advanceSlideshow(int param0, boolean param1) {
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_84_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          ReportAbuseDialog.field_Sb = ReportAbuseDialog.field_Sb + 65536;
          while (NoticeKind.multiplyQ16(true, Cp1252DecodeHelpers.field_j, ReportAbuseDialog.field_Sb) >= 65536) {
            ReportAbuseDialog.field_Sb = ReportAbuseDialog.field_Sb - Cp1252DecodeHelpers.field_j;
            RetroBlock.field_e = RetroBlock.field_e + 1;
          }
          var2_int = -1;
          if (Matrix3.field_g != null) {
            var2_int = Matrix3.field_g.length;
          } else {
            if (FireworkDisplay.field_a != null) {
              var2_int = FireworkDisplay.field_a.length;
            }
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (Cp1252DecodeHelpers.field_a > TwistedLogicCube.field_q) {
              TwistedLogicCube.field_q = TwistedLogicCube.field_q + 1;
              if (Cp1252DecodeHelpers.field_k < TwistedLogicCube.field_q && (null == Matrix3.field_g ||
                null == Matrix3.field_g[Vector3.field_b])) {
                TwistedLogicCube.field_q = TwistedLogicCube.field_q - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (TwistedLogicCube.field_q >= Cp1252DecodeHelpers.field_a &&
                  Matrix3.field_g[(Vector3.field_b + 1) % var2_int] == null) {
                  TwistedLogicCube.field_q = TwistedLogicCube.field_q - 1;
                }
              }
            }
            if (Cp1252DecodeHelpers.field_a <= TwistedLogicCube.field_q) {
              SpriteCheckboxPainter.field_b = Vector3.field_b;
              if (!Match.field_e) {
                Vector3.field_b = Vector3.field_b - 1;
                if (Vector3.field_b < 0) {
                  Vector3.field_b = Vector3.field_b + var2_int;
                }
              } else {
                Vector3.field_b = Vector3.field_b + 1;
                if (Vector3.field_b >= var2_int) {
                  Vector3.field_b = Vector3.field_b - var2_int;
                }
              }
              TwistedLogicCube.field_q = TwistedLogicCube.field_q - Cp1252DecodeHelpers.field_a;
            }
            if (TwistedLogicCube.field_q > Cp1252DecodeHelpers.field_k) {
              Match.field_e = true;
            }
          }
          if (param0 >= -21) {
            field_c = 69;
          }
          if (ScrollContainer.field_Kb != null) {
            var3 = 357 - ScrollContainer.field_Kb.field_B / 2;
            var4 = 0;
            if (IntrusiveDequeCursor.field_c != 0 &&
              FriendCaptionGlobals.field_c > var3 &&
              FriendCaptionGlobals.field_c < ScrollContainer.field_Kb.field_E + var3) {
              if (-ScrollContainer.field_Kb.field_F + 269 < BufferedRandomAccessFile.field_a &&
                269 > BufferedRandomAccessFile.field_a) {
                TwistedLogicCube.field_q = Cp1252DecodeHelpers.field_a;
                Match.field_e = false;
                var4 = 1;
              }
              if (586 < BufferedRandomAccessFile.field_a &&
                BufferedRandomAccessFile.field_a < 586 + ScrollContainer.field_Kb.field_F) {
                var4 = 1;
                Match.field_e = true;
                TwistedLogicCube.field_q = Cp1252DecodeHelpers.field_a;
              }
            }
            if (var4 == 0 &&
              TwistedLogicCube.field_q > Cp1252DecodeHelpers.field_k &&
              StatusBar.field_k > var3 &&
              var3 + ScrollContainer.field_Kb.field_E > StatusBar.field_k) {
              if (ProxyAuthenticationException.field_d > -ScrollContainer.field_Kb.field_F + 269 &&
                269 > ProxyAuthenticationException.field_d) {
                TwistedLogicCube.field_q = Cp1252DecodeHelpers.field_k;
              }
              if (ProxyAuthenticationException.field_d > 586 &&
                ProxyAuthenticationException.field_d < ScrollContainer.field_Kb.field_F + 586) {
                TwistedLogicCube.field_q = Cp1252DecodeHelpers.field_k;
              }
            }
          }
          if (param1) {
            NameSuggestionsPanel.field_I.updatePointer(EmailValidationState.hitTestChoiceIcons(FriendCaptionGlobals.field_c, (byte) 126, BufferedRandomAccessFile.field_a), EmailValidationState.hitTestChoiceIcons(StatusBar.field_k, (byte) -77, ProxyAuthenticationException.field_d), -1);
            if (NameSuggestionsPanel.field_I.isActivated(19)) {
              if (NameSuggestionsPanel.field_I.selectedIndex == 0) {
                stackIn_63_0 = 3;
                return stackIn_63_0;
              }
              if (NameSuggestionsPanel.field_I.selectedIndex == 1) {
                stackIn_67_0 = 2;
                return stackIn_67_0;
              }
            }
            stackIn_70_0 = 116;
            while (DirectByteStorage.pollKeyEvent(stackIn_70_0)) {
              NameSuggestionsPanel.field_I.handleHorizontalNavigation(99, 0);
              if (NameSuggestionsPanel.field_I.isActivated(57)) {
                if (NameSuggestionsPanel.field_I.selectedIndex == 0) {
                  stackIn_75_0 = 3;
                  return stackIn_75_0;
                }
                if (NameSuggestionsPanel.field_I.selectedIndex == 1) {
                  stackIn_79_0 = 1;
                  return stackIn_79_0;
                }
              }
              if (KeyEventGlobals.field_a != 13) {
                stackIn_70_0 = 116;
                continue;
              }
              stackIn_82_0 = 1;
              return stackIn_82_0;
            }
          }
          stackIn_84_0 = 0;
          return stackIn_84_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var2), "ro.D(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_f = "Twisted Logic";
    }
}
