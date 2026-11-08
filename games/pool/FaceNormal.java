/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FaceNormal {
    static String rmXFromFriends;
    int field_d;
    int field_a;
    int field_b;
    static UiComponent field_c;

    final static String highlightGlossaryTerms(String suffix, String text, byte obfuscationGuard, String prefix) {
        int var6 = 0;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        String stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        String[] var7 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        StringBuilder var13 = null;
        try {
          var4 = text.toLowerCase();
          var5 = null;
          for (var6 = 0; var6 < DimmedPauseMenu.field_P.length; var6++) {
            var7 = DimmedPauseMenu.field_P[var6];
            for (var8 = 0; var8 < var7.length; var8++) {
              var9 = var7[var8];
              if (var9 != null) {
                var10 = var9.length();
                if (var10 != 0) {
                  var13 = new StringBuilder(text.length());
                  var5 = var13;
                  var11 = 0;
                  while (true) {
                    var12 = var4.indexOf(var9, var11);
                    if (var12 == -1) {
                      if (var11 != 0) {
                        discarded$8 = ((StringBuilder) (var5)).append(text.substring(var11, text.length()));
                      } else {
                        var5 = new StringBuilder(text);
                      }
                      text = ((StringBuilder) (var5)).toString();
                      var4 = text.toLowerCase();
                      break;
                    }
                    if (var12 > 0 && (ContextMenu.isAsciiLetter(var4.charAt(var12 - 1), obfuscationGuard ^ 22991) ||
                      var4.charAt(var12 - 1) == 35)) {
                      if (var4.charAt(var12 - 1) != 35) {
                        discarded$0 = ((StringBuilder) (var5)).append(text.substring(var11, 1 + var12));
                      } else {
                        discarded$1 = ((StringBuilder) (var5)).append(text.substring(var11, -1 + var12));
                        discarded$2 = ((StringBuilder) (var5)).append(text.charAt(var12));
                      }
                      var11 = 1 + var12;
                      continue;
                    }
                    if (var4.length() > var12 + var10 &&
                      ContextMenu.isAsciiLetter(var4.charAt(var12 + var10), 22987)) {
                      discarded$3 = ((StringBuilder) (var5)).append(text.substring(var11, var12 + 1));
                      var11 = 1 + var12;
                      continue;
                    }
                    discarded$4 = ((StringBuilder) (var5)).append(text.substring(var11, var12));
                    if (prefix != null) {
                      discarded$5 = var13.append(prefix);
                    }
                    discarded$6 = ((StringBuilder) (var5)).append(text.substring(var12, var12 + var10));
                    var11 = var10 + var12;
                    if (suffix == null) {
                      continue;
                    }
                    discarded$7 = var13.append(suffix);
                  }
                }
              }
            }
          }
          if (obfuscationGuard != 4) {
            field_c = (UiComponent) null;
          }
          if (var5 == null) {
            stackIn_38_0 = (String) (text);
          } else {
            stackIn_38_0 = ((StringBuilder) (var5)).toString();
          }
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_41_0 = var4_ref;
          stackIn_41_1 = new StringBuilder().append("ef.D(");
          if (suffix == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (text == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(obfuscationGuard).append(',');
          if (prefix == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(')').toString());
        }
    }

    final static void initializeRuleDescriptions(int obfuscationGuard) {
        LocalGameSetupScreen.field_L = new String[ClientInputResetSupport.field_a];
        LocalGameSetupScreen.field_L[11] = LoginResponse.rule22;
        LocalGameSetupScreen.field_L[18] = ContextMenu.rule12;
        LocalGameSetupScreen.field_L[15] = Atan2Support.rule04;
        LocalGameSetupScreen.field_L[9] = ArchiveAvailabilitySupport.rule01;
        LocalGameSetupScreen.field_L[20] = ModelInstance.rule14;
        LocalGameSetupScreen.field_L[4] = PlayingSound.rule05;
        if (obfuscationGuard >= -12) {
          String var2 = (String) null;
          FaceNormal.configureMembershipBenefitsBackground(20, (Sprite) null, (String) null);
        }
        LocalGameSetupScreen.field_L[6] = DateInputWidget.rule00;
        LocalGameSetupScreen.field_L[21] = BeveledFrameSpriteFactory.rule21;
        LocalGameSetupScreen.field_L[7] = CheckboxWidget.rule03;
        LocalGameSetupScreen.field_L[13] = NineSliceFrame.rule20;
        LocalGameSetupScreen.field_L[16] = MouseHandler.rule10;
        LocalGameSetupScreen.field_L[19] = Under13NoticePanel.rule13;
        LocalGameSetupScreen.field_L[5] = UiComponentNode.rule02;
        LocalGameSetupScreen.field_L[17] = NanoTickClock.rule11;
    }

    final static void configureMembershipBenefitsBackground(int obfuscationGuard, Sprite background, String title) {
        try {
          AccountWelcomePanel.field_N = title;
          if (obfuscationGuard != -2107) {
            FaceNormal.sendSpectateRequest(3, 47, -112);
          }
          ProgressDialog.field_gb = background;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ef.B(" + obfuscationGuard + ',' + (background != null ? "{...}" : "null") + ',' + (title != null ? "{...}" : "null") + ')');
        }
    }

    final static void sendSpectateRequest(int gameId, int packetLength, int opcode) {
        CipherPacketBuffer var3 = JaggrabDownloader.field_j;
        var3.writeCipheredOpcode(false, opcode);
        var3.writeByte(packetLength, false);
        var3.writeByte(10, false);
        var3.writeShort((byte) -81, gameId);
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 != 1) {
          rmXFromFriends = (String) null;
        }
        rmXFromFriends = null;
    }

    static {
        rmXFromFriends = "Remove <%0> from friend list";
    }
}
