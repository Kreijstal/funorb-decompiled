/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ZombieDropView extends SceneObject {
    static int field_F;
    private int field_G;
    static int field_H;
    static double field_J;
    private int field_I;

    final static int performAccountServerRequest(boolean param0, ConditionalTextValue param1, int param2, ConditionalTextValue param3, String param4, int param5, byte param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        PacketBuffer stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        PacketBuffer stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_19_2 = null;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var14 = param1.getText((byte) 99);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param3.getText((byte) 99);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (SpriteHotspot.field_h == null &&
            !LobbyScreenHelpers.pollStatusSocket(false, false)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (IntroScreen.field_l == DialSelectorWidget.field_cb) {
            TextValidationFailure.field_a.position = 0;
            DefaultQuickChatContext.field_d = null;
            if (param4 == null) {
              TextInputWidget.field_R.position = 0;
              TextInputWidget.field_R.writeInt(125, TertiaryLinkDeque.field_c.nextInt());
              TextInputWidget.field_R.writeInt(-114, TertiaryLinkDeque.field_c.nextInt());
              stackIn_15_0 = TextInputWidget.field_R;
              stackIn_15_1 = -16171;
              if (param1.isSelected((byte) 105)) {
                stackIn_16_2 = var14;
              } else {
                stackIn_16_2 = "";
              }
              ((PacketBuffer) (Object) stackIn_15_0).writeVersionedString(stackIn_15_1, stackIn_16_2);
              stackIn_18_0 = TextInputWidget.field_R;
              stackIn_18_1 = -16171;
              if (param3.isSelected((byte) 57)) {
                stackIn_19_2 = var8;
              } else {
                stackIn_19_2 = "";
              }
              ((PacketBuffer) (Object) stackIn_18_0).writeVersionedString(stackIn_18_1, stackIn_19_2);
              TextValidationFailure.field_a.writeByte(-99, 16);
              TextValidationFailure.field_a.position = TextValidationFailure.field_a.position + 1;
              var9 = TextValidationFailure.field_a.position;
              EmailAvailabilityValidator.writeEncryptedPayload(ButtonWidget.field_L, (byte) 110, UsernameAvailabilityValidator.field_v, TextInputWidget.field_R, TextValidationFailure.field_a);
              TextValidationFailure.field_a.backpatchByteLength(param6 + 173, -var9 + TextValidationFailure.field_a.position);
            } else {
              var9 = 0;
              TextInputWidget.field_R.position = 0;
              if (param0) {
                var9 = var9 | 1;
              }
              TextInputWidget.field_R.writeInt(-11, TertiaryLinkDeque.field_c.nextInt());
              TextInputWidget.field_R.writeInt(90, TertiaryLinkDeque.field_c.nextInt());
              TextInputWidget.field_R.writeVersionedString(-16171, var14);
              TextInputWidget.field_R.writeVersionedString(-16171, var8);
              var15 = (CharSequence) ((Object) param4);
              TextInputWidget.field_R.writeVersionedString(-16171, SpriteState.normalizeAccountName(-50, var15));
              TextInputWidget.field_R.writeShort(param5, (byte) -91);
              TextInputWidget.field_R.writeByte(param6 ^ 37, param2);
              TextInputWidget.field_R.writeByte(param6 ^ 19, var9);
              TextValidationFailure.field_a.writeByte(120, 18);
              TextValidationFailure.field_a.position = TextValidationFailure.field_a.position + 2;
              var10 = TextValidationFailure.field_a.position;
              var11_ref_StringLifetime4 = SettingsCookieHelpers.readSettingsCookie(0, StatefulTextPainter.getHostApplet(param6 + 92));
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              TextValidationFailure.field_a.writeString(var11_ref_StringLifetime4, (byte) 105);
              EmailAvailabilityValidator.writeEncryptedPayload(ButtonWidget.field_L, (byte) -123, UsernameAvailabilityValidator.field_v, TextInputWidget.field_R, TextValidationFailure.field_a);
              TextValidationFailure.field_a.backpatchShortLength(false, TextValidationFailure.field_a.position - var10);
            }
            PowerupProgressCard.flushPackets(-1, false);
            IntroScreen.field_l = MouseWheelInput.field_c;
          }
          if (MouseWheelInput.field_c == IntroScreen.field_l &&
            ReportAbuseDialog.fillIncomingBuffer(10, 1)) {
            var9Lifetime1 = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
            StatusAndMeshHelpers.field_e.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ContainerUnpackHelpers.field_b = new String[var9Lifetime1 - 100];
              IntroScreen.field_l = ScreechAura.field_n;
            } else {
              if (248 == var9Lifetime1) {
                ZombieDrop.clearStatusCookie(param6 ^ -92, StatefulTextPainter.getHostApplet(0));
                InstructionsScreen.field_q = SimUnit.field_Y;
                ClientShellHelpers.closeGameSocket((byte) -115);
                UiTheme.field_j = false;
                stackIn_31_0 = var9Lifetime1;
                return stackIn_31_0;
              }
              if (var9Lifetime1 == 99) {
                ReportAbuseDialog.fillIncomingBuffer(10, MarkerSliderWidget.getProtocolConstant(1));
                DefaultQuickChatContext.field_d = new Boolean(PhaseChangeEvent.readBooleanByte(StatusAndMeshHelpers.field_e, (byte) -114));
                StatusAndMeshHelpers.field_e.position = 0;
              } else {
                IntroScreen.field_l = PowerupAuraEffect.field_p;
                PortalEntryEvent.field_i = var9Lifetime1;
                EmailAvailabilityValidator.field_q = -1;
              }
            }
          }
          if (ScreechAura.field_n == IntroScreen.field_l) {
            var9Lifetime2 = 2;
            if (ReportAbuseDialog.fillIncomingBuffer(param6 ^ -82, var9Lifetime2)) {
              var10Lifetime1 = StatusAndMeshHelpers.field_e.readUnsignedShort((byte) 69);
              StatusAndMeshHelpers.field_e.position = 0;
              if (ReportAbuseDialog.fillIncomingBuffer(10, var10Lifetime1)) {
                var11 = ContainerUnpackHelpers.field_b.length;
                for (var12 = 0; var12 < var11; var12++) {
                  ContainerUnpackHelpers.field_b[var12] = StatusAndMeshHelpers.field_e.readVersionedString(0);
                }
                ClientShellHelpers.closeGameSocket((byte) -123);
                UiTheme.field_j = false;
                stackIn_41_0 = var11 + 100;
                return stackIn_41_0;
              }
            }
          }
          if (PowerupAuraEffect.field_p == IntroScreen.field_l &&
            DefaultQuickChatContext.isPacketPayloadReady(param6 ^ -92)) {
            if (PortalEntryEvent.field_i == 255) {
              var9_ref_String = StatusAndMeshHelpers.field_e.readNullableString((byte) -89);
              if (var9_ref_String != null) {
                LobbyGame.setSettingsCookie(StatefulTextPainter.getHostApplet(0), -1, var9_ref_String);
              }
            } else {
              InstructionsScreen.field_q = StatusAndMeshHelpers.field_e.readString((byte) -71);
            }
            ClientShellHelpers.closeGameSocket((byte) -118);
            UiTheme.field_j = false;
            stackIn_50_0 = PortalEntryEvent.field_i;
            return stackIn_50_0;
          }
          if (param6 != -92) {
            field_F = 21;
          }
          if (SpriteHotspot.field_h == null) {
            if (UiTheme.field_j) {
              if (LinkButtonPainter.millisSinceLastReceive((byte) -22) > 30000L) {
                InstructionsScreen.field_q = EffectResistedEvent.field_l;
              } else {
                InstructionsScreen.field_q = CipherPacketBuffer.field_w;
              }
              UiTheme.field_j = false;
              stackIn_60_0 = 249;
              return stackIn_60_0;
            }
            var9Lifetime3 = FeatureSupportHelpers.field_b;
            FeatureSupportHelpers.field_b = TertiaryLinkNode.field_s;
            UiTheme.field_j = true;
            TertiaryLinkNode.field_s = var9Lifetime3;
          }
          stackIn_62_0 = -1;
          return stackIn_62_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_65_0 = var7;
          stackIn_65_1 = new StringBuilder().append("mg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param4 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ZombieDropView(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_I = RandomHelpers.nextBoundedInt((byte) 44, RasterEffectHelpers.field_a, 5);
    }

    final void tick(byte param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2_ref_br;
        double var2;
        GameCharacter var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_G = this.field_G + 1;
        if (120 <= this.field_G) {
          this.field_G = 0;
        }
        fieldTemp$0 = this.field_I;
        this.field_I = this.field_I + 1;
        if (fieldTemp$0 > 5) {
          this.field_I = 0;
          var2_ref_br = PowerupButton.field_e.sceneObjects.last(109);
          while (var2_ref_br instanceof SceneObject) {
            if (var2_ref_br instanceof GameCharacter) {
              var3 = (GameCharacter) (var2_ref_br);
              var4 = var3.getX(-116) - this.getX(-34) - 12;
              var5 = var3.getY(122) - this.getY(-70);
              if (var4 * var4 + var5 * var5 < 576 &&
                PowerupButton.field_e.field_I.addPowerupButton(69, this.field_C, 255)) {
                Camera.createMixerStream(-127, 9);
                TutorialAndMenuHelpers.handleTutorialEvent(this.field_C, (byte) 99);
                this.unlink(true);
                return;
              }
            }
            var2_ref_br = var2_ref_br.previous;
          }
        }
        RandomHelpers.field_l = new int[120];
        RandomHelpers.field_g = new int[120];
        RandomHelpers.field_j = new int[8][16];
        if (param0 >= -79) {
          return;
        }
        var2 = 0.05235987755982988;
        for (var4Lifetime1 = 0; 120 > var4Lifetime1; var4Lifetime1++) {
          RandomHelpers.field_l[var4Lifetime1] = (int)(24.0 * Math.cos((double)var4Lifetime1 * var2));
          RandomHelpers.field_g[var4Lifetime1] = (int)(24.0 * Math.sin(var2 * (double)var4Lifetime1));
        }
        for (var4Lifetime2 = 0; RandomHelpers.field_j[0].length > var4Lifetime2; var4Lifetime2++) {
          var5Lifetime1 = 16 * var4Lifetime2;
          RandomHelpers.field_j[0][var4Lifetime2] = PendingStatusRequest.bitOr(ScrollPane.bitAnd(65410, var5Lifetime1 << 8), ScrollPane.bitAnd(var5Lifetime1, 255));
          RandomHelpers.field_j[1][var4Lifetime2] = PendingStatusRequest.bitOr(var5Lifetime1 << 8, var5Lifetime1 << 16);
          RandomHelpers.field_j[2][var4Lifetime2] = PendingStatusRequest.bitOr(ScrollPane.bitAnd(65493, var5Lifetime1 << 8), ScrollPane.bitAnd(255, var5Lifetime1 / 2));
          RandomHelpers.field_j[3][var4Lifetime2] = var5Lifetime1 * 65793;
          RandomHelpers.field_j[4][var4Lifetime2] = PendingStatusRequest.bitOr(ScrollPane.bitAnd(var5Lifetime1, 771752446) << 7, var5Lifetime1 << 16);
          RandomHelpers.field_j[5][var4Lifetime2] = var5Lifetime1 << 16;
          RandomHelpers.field_j[6][var4Lifetime2] = var5Lifetime1 << 16;
          RandomHelpers.field_j[7][var4Lifetime2] = PendingStatusRequest.bitOr(var5Lifetime1, PendingStatusRequest.bitOr(ScrollPane.bitAnd(var5Lifetime1 << 6, 65326), ScrollPane.bitAnd(var5Lifetime1, 1477444604) << 14));
        }
        return;
    }

    final static void drawAbilitySlot(int param0, int param1, byte param2, int param3, PlayerProfile param4, int param5, int param6) {
        BinaryBitmapFont var8 = null;
        try {
          int var7_int = 73 % ((param2 + 45) / 36);
          var8 = MatchingTextValidator.field_w;
          Camera.field_w.drawBlended(param6, param3, param5);
          MarkerSliderPainter.field_b[param0].drawBlended(param6 + 17, param3 + 21, param5);
          PowerGaugeHelpers.drawPowerGauge(PendingStatusRequest.getMaxResearchLevel(param0, -83), 33 + param3, (byte) 2, param4.field_t[param0], param5, -16 + param6);
          if (param1 != 255) {
            PowerGaugeHelpers.drawPowerGauge(PendingStatusRequest.getMaxResearchLevel(param1, -100), param3 + 21, (byte) 2, param4.field_t[param1], param5, param6 - 39);
            ((BitmapFont) ((Object) var8)).drawCenteredAlpha(AccountServerResult.field_f[param1], param6 + 29, 48 + param3, 16777215, 1, param5);
          }
          ((BitmapFont) ((Object) var8)).drawCenteredAlpha(AccountServerResult.field_f[param0], param6 + 29, 58 + param3, 16777215, 1, param5);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mg.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void selectPublicChat(boolean param0) {
        if (param0) {
          PlayerProfile var2 = (PlayerProfile) null;
          ZombieDropView.drawAbilitySlot(-13, 21, (byte) 127, 95, (PlayerProfile) null, 24, -18);
        }
        HotspotTextWidget.field_N = true;
        UrlLaunchHelpers.field_a = 0;
    }

    final void draw(int param0, Camera param1) {
        int var11 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = this.field_G % 30;
          if (var3_int > 15) {
            var3_int = -var3_int + 30;
          }
          if (var3_int > 8) {
            var3_int = 4;
          } else {
            if (var3_int <= 3) {
              var3_int = (var3_int <= 1) ? 1 : 2;
            } else {
              var3_int = 3;
            }
          }
          if (param0 != -10136) {
            return;
          }
          var4 = param1.worldToScreenX(this.getX(74), -20126);
          var5 = param1.worldToScreenY(-var3_int + this.getY(93), 117) - 24;
          if (var4 >= -48 &&
            var5 >= -48 &&
            var4 <= 640 &&
            var5 <= 480) {
            var6 = 12 + var4 - 1;
            var7 = 12 + var5 - 1;
            var9 = 10;
            var10 = 2;
            for (var11 = 0; var11 < 6; var11++) {
              var8 = (6 * var11 + this.field_G) % 120;
              SoftwareRasterizer.fillCircleAlpha(RandomHelpers.field_l[var8] + var6, var7 + RandomHelpers.field_g[var8], 6, 0, var11 * var9);
              SoftwareRasterizer.fillRadialGlow(RandomHelpers.field_l[var8] + var6 << 4, var7 + RandomHelpers.field_g[var8] << 4, 96, var11 * var10, RandomHelpers.field_j[this.field_C]);
              var8 = (60 + var8) % 120;
              SoftwareRasterizer.fillCircleAlpha(RandomHelpers.field_l[var8] + var6, RandomHelpers.field_g[var8] + var7, 6, 0, var11 * var9);
              SoftwareRasterizer.fillRadialGlow(RandomHelpers.field_l[var8] + var6 << 4, var7 + RandomHelpers.field_g[var8] << 4, 96, var10 * var11, RandomHelpers.field_j[this.field_C]);
            }
            MarkerSliderPainter.field_b[this.field_C].drawTransparent(var4, var5);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("mg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_F = 68;
        field_J = Math.atan2(1.0, 0.0);
    }
}
