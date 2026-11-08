/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordLoginCredentials extends LoginCredentials {
    private String field_f;
    static int[] field_g;
    private String field_h;
    static int field_i;

    final LoginKind getLoginKind(byte param0) {
        if (param0 > -77) {
          PacketBuffer var3 = (PacketBuffer) null;
          this.writeCredentials((PacketBuffer) null, -96);
        }
        return LoginRequiredDialog.field_K;
    }

    public static void releaseStatics(int param0) {
        int var1 = -123 % ((param0 + 53) / 59);
        field_g = null;
    }

    final static void serviceAudioOutputs(byte param0) {
        SoundStreamHandle var1 = null;
        int var2 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        SoundStreamHandle var1Lifetime1;
        var2 = Kickabout.field_G;
        try {
          PitchPurchaseSupport.field_d.serviceOutput();
          if (param0 != -28) {
            PasswordLoginCredentials.releaseStatics(-80);
          }
          SharedPanelFactory.field_d.serviceOutput();
          BeveledTextPainter.field_r = BeveledTextPainter.field_r - 1;
          if (BeveledTextPainter.field_r == 0) {
            BeveledTextPainter.field_r = 200;
            var1 = (SoundStreamHandle) (LoginCredentials.field_a.first(param0 + 24037));
            while (var1 != null) {
              if (!var1.owner.isLinked((byte) -113)) {
                var1.c((byte) -109);
              }
              var1 = (SoundStreamHandle) (LoginCredentials.field_a.next(param0 ^ -59));
            }
            if (null == IndexedSpriteState.field_c) {
              return;
            }
            var1Lifetime1 = (SoundStreamHandle) (IndexedSpriteState.field_c.first(24009));
            while (var1Lifetime1 != null) {
              stackIn_15_0 = var1Lifetime1.owner.isLinked((byte) -113);
              if (!stackIn_15_0) {
                var1Lifetime1.c((byte) -109);
              }
              var1Lifetime1 = (SoundStreamHandle) (IndexedSpriteState.field_c.next(33));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1_ref), "gp.M(" + param0 + ')');
        }
    }

    final static void drawSharedTextPanel(boolean param0, byte param1) {
        GrayscalePaletteSupport.field_a.draw(97, param0);
        DateOfBirthPanel var2 = PlayArea.field_a;
        if (param1 >= -27) {
          PasswordLoginCredentials.serviceAudioOutputs((byte) 111);
        }
        if (var2 != null) {
          var2.renderWidgetPassesAndTooltip(GrayscalePaletteSupport.field_a.field_T, GrayscalePaletteSupport.field_a.field_F, (byte) -120);
        }
    }

    final static AccountInputValidationResult validateEmailLocalPart(byte param0, String param1) {
        AccountInputValidationResult stackIn_4_0 = null;
        AccountInputValidationResult stackIn_8_0 = null;
        AccountInputValidationResult stackIn_14_0 = null;
        int stackIn_22_0 = 0;
        AccountInputValidationResult stackIn_26_0 = null;
        AccountInputValidationResult stackIn_39_0 = null;
        AccountInputValidationResult stackIn_44_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = Kickabout.field_G;
        try {
          var3 = -34 % ((param0 - 38) / 57);
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_4_0 = AccountInputValidationResult.field_b;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_8_0 = CachedTextLayout.field_j;
            return stackIn_8_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(-1 + var2_int) != 34) {
              stackIn_14_0 = TournamentLobbyScreen.field_F;
              return stackIn_14_0;
            }
            var4 = 0;
            for (var5 = 1; var5 < -1 + var2_int; var5++) {
              var6 = param1.charAt(var5);
              if (var6 != 92) {
                if (var6 == 34 &&
                  var4 == 0) {
                  stackIn_26_0 = TournamentLobbyScreen.field_F;
                  return stackIn_26_0;
                }
                var4 = 0;
              } else {
                stackIn_22_0 = (var4 != 0) ? 0 : 1;
                var4 = stackIn_22_0;
              }
            }
            return null;
          }
          var4Lifetime1 = 0;
          for (var5Lifetime1 = 0; var2_int > var5Lifetime1; var5Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var6Lifetime1 = param1.charAt(var5Lifetime1);
            if (var6Lifetime1 == 46) {
              if (var5Lifetime1 != 0 &&
                var5Lifetime1 != var2_int - 1 &&
                var4Lifetime1 == 0) {
                var4Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_39_0 = TournamentLobbyScreen.field_F;
                return stackIn_39_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (GoalStateAgent.field_i.indexOf(var6Lifetime1) == -1) {
                stackIn_44_0 = TournamentLobbyScreen.field_F;
                return stackIn_44_0;
              }
              var4Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_50_0 = var2;
          stackIn_50_1 = new StringBuilder().append("gp.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
        }
    }

    final static boolean beginAccountRegistration(byte param0, String param1, boolean param2, String param3, AccountRegistrationPanel param4, int param5, String param6) {
        RuntimeException var7 = null;
        RegistrationRequestDialog var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ClubStateFactory.field_f != RasterGlowSupport.field_a) {
            return false;
          }
          var8 = new RegistrationRequestDialog(RankingsRequest.field_l, param4);
          RankingsRequest.field_l.pushModal(var8, false);
          if (!DiagnosticsOverlaySupport.c((byte) 59)) {
            ArchiveIndex.field_a = null;
            ArchiveManager.field_c = param2;
            SocialUiState.field_b = param5;
            AccountRegistrationResponse.field_i = param6;
            ClubStateFactory.field_f = PlayerModelPreview.field_f;
            AccountInputValidationResult.field_a = param1;
            SessionUrlSupport.field_f = param3;
          } else {
            var8.t(17);
          }
          if (param0 >= 98) {
            return true;
          }
          field_g = (int[]) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("gp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
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
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void sendChatPacket(int param0, int param1, int param2, int param3, String param4, String param5) {
        CipherPacketBuffer var9 = null;
        int var7 = 0;
        try {
          var9 = FootballerAiOverlaySupport.field_d;
          CipherPacketBuffer var6 = var9;
          var9.writeIsaacByte(param3, (byte) 104);
          var9.field_n = var9.field_n + 1;
          int var8 = 39 / ((param1 - 14) / 61);
          var7 = var9.field_n;
          var9.writeByte(113, param2);
          if (param2 == 2) {
            var9.writeString(14190, param4);
          }
          if (param5 == null) {
            var9.writeShort(-1207444472, param0);
          } else {
            RankingRowFactory.writeHuffmanString((byte) 104, param5, var9);
          }
          var9.backpatchByteLength(62, -var7 + var9.field_n);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gp.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeCredentials(PacketBuffer param0, int param1) {
        param0.writeCircumfixedString(this.field_f, (byte) -126);
        if (param1 != 17053) {
          return;
        }
        try {
          param0.writeBase38Password((byte) 124, this.field_h);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gp.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int calculatePlayerValue(PlayerStats param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Trinket var5 = null;
        int var6 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        var6 = Kickabout.field_G;
        try {
          var2_int = 0;
          if (param1 != -576054046) {
            field_i = 81;
          }
          for (var3 = 0; param0.trinketIds.length > var3; var3++) {
            var2_int = var2_int + (GeneratedPanelPainter.field_g[param0.trinketIds[var3]].field_e >> 1);
          }
          var3Lifetime1 = LoggedPossession.a(param1 + 576054974, param0);
          if (15 <= var3Lifetime1) {
            var2_int = (452 * ((var3Lifetime1 - 15) * (var3Lifetime1 - 15)) >> 5) + 10;
            for (var4 = 0; param0.trinketIds.length > var4; var4++) {
              var5 = GeneratedPanelPainter.field_g[param0.trinketIds[var4]];
              var2_int = var2_int + Trinket.field_g[var5.field_k];
              var2_int = var2_int + (var5.field_e >> 2);
            }
          }
          stackIn_11_0 = var2_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("gp.K(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    PasswordLoginCredentials(String param0, String param1) {
        try {
          this.field_h = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[8192];
    }
}
