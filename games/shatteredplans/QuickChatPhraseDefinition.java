/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseDefinition extends DualLinkNode {
    static String field_w;
    static boolean field_v;
    boolean field_y;
    char[] field_s;
    static String field_q;
    static int field_u;
    char[] field_p;
    static String[] field_o;
    int[] field_x;
    String field_t;
    int[] field_r;

    final static void f(byte param0) {
        if (!BirthDateConfirmationForm.field_P) {
          throw new IllegalStateException();
        }
        UiTextSupport.field_a = true;
        WidgetStateStyle.a(false, true);
        SoundPlayback.field_i = 0;
        if (param0 != -91) {
          PlatformTaskDispatcher var2 = (PlatformTaskDispatcher) null;
          QuickChatPhraseDefinition.a(-82, (PlatformTaskDispatcher) null, -122, (byte) -43, -19, -109);
        }
    }

    final static int a(int param0, int param1, AccountFieldValue param2, AccountFieldValue param3, int param4, String param5, boolean param6) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        PacketBuffer stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_22_2 = null;
        PacketBuffer stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_25_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var14 = param3.text((byte) -126);
          var8 = param2.text((byte) 77);
          if (param4 < 116) {
            stackIn_3_0 = 63;
            return stackIn_3_0;
          }
          if (wg.field_f == null &&
            !TextHotspotWidget.a(false, -2)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (Wormhole.field_j == LegacyAi.field_r) {
            LobbyOptionSupport.field_f.position = 0;
            SpriteWipeSupport.field_d = null;
            if (param5 == null) {
              ProgressDialog.field_cb.position = 0;
              ProgressDialog.field_cb.writeInt(11135, Bzip2State.field_u.nextInt());
              ProgressDialog.field_cb.writeInt(11135, Bzip2State.field_u.nextInt());
              stackIn_21_0 = ProgressDialog.field_cb;
              stackIn_21_1 = 95;
              if (!param3.shouldSubmitText(2)) {
                stackIn_22_2 = "";
              } else {
                stackIn_22_2 = var14;
              }
              ((PacketBuffer) (Object) stackIn_21_0).writeMarkedString((byte) stackIn_21_1, stackIn_22_2);
              stackIn_24_0 = ProgressDialog.field_cb;
              stackIn_24_1 = 95;
              if (!param2.shouldSubmitText(2)) {
                stackIn_25_2 = "";
              } else {
                stackIn_25_2 = var8;
              }
              ((PacketBuffer) (Object) stackIn_24_0).writeMarkedString((byte) stackIn_24_1, stackIn_25_2);
              LobbyOptionSupport.field_f.writeByte(16, (byte) -69);
              LobbyOptionSupport.field_f.position = LobbyOptionSupport.field_f.position + 1;
              var9 = LobbyOptionSupport.field_f.position;
              GarrisonTask.a(25050, LobbyOptionSupport.field_f, ChatPanelLayoutSupport.field_a, ProgressDialog.field_cb, ResizingDialog.field_V);
              LobbyOptionSupport.field_f.patchLengthByte(LobbyOptionSupport.field_f.position - var9, (byte) 119);
            } else {
              var9 = 0;
              ProgressDialog.field_cb.position = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              ProgressDialog.field_cb.writeInt(11135, Bzip2State.field_u.nextInt());
              ProgressDialog.field_cb.writeInt(11135, Bzip2State.field_u.nextInt());
              ProgressDialog.field_cb.writeMarkedString((byte) 95, var14);
              ProgressDialog.field_cb.writeMarkedString((byte) 95, var8);
              var15 = (CharSequence) ((Object) param5);
              ProgressDialog.field_cb.writeMarkedString((byte) 95, QuaternaryLinkNode.a(var15, (byte) 53));
              ProgressDialog.field_cb.writeShort(param0, 255);
              ProgressDialog.field_cb.writeByte(param1, (byte) -108);
              ProgressDialog.field_cb.writeByte(var9, (byte) -60);
              LobbyOptionSupport.field_f.writeByte(18, (byte) -76);
              LobbyOptionSupport.field_f.position = LobbyOptionSupport.field_f.position + 2;
              var10 = LobbyOptionSupport.field_f.position;
              var11_ref_String = GameAssetSetupSupport.readSettingsCookie((byte) -128, GameScreen.getHostApplet((byte) 124));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              LobbyOptionSupport.field_f.writeString(var11_ref_String, (byte) 0);
              GarrisonTask.a(25050, LobbyOptionSupport.field_f, ChatPanelLayoutSupport.field_a, ProgressDialog.field_cb, ResizingDialog.field_V);
              LobbyOptionSupport.field_f.patchLengthShort(-549342136, -var10 + LobbyOptionSupport.field_f.position);
            }
            ClientPacketFlushSupport.flushOutboundPacketsFullInts(-1, 82);
            Wormhole.field_j = StarSoundState.field_k;
          }
          if (Wormhole.field_j == StarSoundState.field_k &&
            StarAnnotation.a(110, 1)) {
            var9Lifetime1 = SpriteWipeSupport.field_a.readUnsignedByte(-83);
            SpriteWipeSupport.field_a.position = 0;
            if (100 <= var9Lifetime1 &&
              105 >= var9Lifetime1) {
              Wormhole.field_j = TurnEventLog.field_h;
              HighscoreResponseSupport.field_e = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                PasswordInputPainter.setLegacyStatusFlag(GameScreen.getHostApplet((byte) 125), true);
                DiplomacyRowSupport.field_c = ClientCapabilitySupport.field_b;
                TabbedPanel.closeClientSocket(-125);
                BufferedSocket.field_j = false;
                stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (99 != var9Lifetime1) {
                Wormhole.field_j = StarAbandonedEvent.field_m;
                BufferedCacheFile.field_e = var9Lifetime1;
                TextInputPainter.field_t = -1;
              } else {
                StarAnnotation.a(119, CandidateLink.a(-85));
                SpriteWipeSupport.field_d = new Boolean(EmailValidationError.readBooleanByte((byte) -24, SpriteWipeSupport.field_a));
                SpriteWipeSupport.field_a.position = 0;
              }
            }
          }
          if (TurnEventLog.field_h == Wormhole.field_j) {
            var9Lifetime2 = 2;
            if (StarAnnotation.a(-87, var9Lifetime2)) {
              var10Lifetime1 = SpriteWipeSupport.field_a.readUnsignedShort(-20976);
              SpriteWipeSupport.field_a.position = 0;
              if (StarAnnotation.a(126, var10Lifetime1)) {
                var11 = HighscoreResponseSupport.field_e.length;
                for (var12 = 0; var11 > var12; var12++) {
                  HighscoreResponseSupport.field_e[var12] = SpriteWipeSupport.field_a.readMarkedString((byte) -126);
                }
                TabbedPanel.closeClientSocket(-113);
                BufferedSocket.field_j = false;
                stackIn_47_0 = 100 + var11;
                return stackIn_47_0;
              }
            }
          }
          if (StarAbandonedEvent.field_m == Wormhole.field_j &&
            uc.d((byte) -28)) {
            if (BufferedCacheFile.field_e == 255) {
              var9_ref_String = SpriteWipeSupport.field_a.readNullableString(1910283844);
              if (var9_ref_String != null) {
                SettingsCookieSupport.writeSettingsCookie(-25602, var9_ref_String, GameScreen.getHostApplet((byte) 125));
              }
            } else {
              DiplomacyRowSupport.field_c = SpriteWipeSupport.field_a.readString(-1);
            }
            TabbedPanel.closeClientSocket(-99);
            BufferedSocket.field_j = false;
            stackIn_56_0 = BufferedCacheFile.field_e;
            return stackIn_56_0;
          }
          if (null == wg.field_f) {
            if (BufferedSocket.field_j) {
              if (wh.a(18) > 30000L) {
                DiplomacyRowSupport.field_c = QuickChatParameterType.field_f;
              } else {
                DiplomacyRowSupport.field_c = QuaternaryNodeList.field_d;
              }
              BufferedSocket.field_j = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = AccountInputSupport.field_f;
            AccountInputSupport.field_f = LobbyRoomControlsSupport.field_c;
            LobbyRoomControlsSupport.field_c = var9Lifetime3;
            BufferedSocket.field_j = true;
          }
          stackIn_66_0 = -1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("si.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void clearStatics(byte param0) {
        field_w = null;
        field_o = null;
        if (param0 != -117) {
          return;
        }
        field_q = null;
    }

    final void e(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2Lifetime1;
        if (this.field_x != null) {
          for (var2 = 0; var2 < this.field_x.length; var2++) {
            this.field_x[var2] = PrivateChatMessage.intOr(this.field_x[var2], 32768);
          }
        }
        var2Lifetime1 = 123 % ((-18 - param0) / 55);
        if (this.field_r != null) {
          for (var3 = 0; this.field_r.length > var3; var3++) {
            this.field_r[var3] = PrivateChatMessage.intOr(this.field_r[var3], 32768);
          }
        }
    }

    private final void decodeOpcode(PacketBuffer param0, byte param1, int param2) {
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (1 == param2) {
            this.field_t = param0.readString(-1);
          } else {
            if (param2 == 2) {
              var4_int = param0.readUnsignedByte(-100);
              this.field_p = new char[var4_int];
              this.field_r = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_r[var5] = param0.readUnsignedShort(-20976);
                var6 = param0.readSignedByte(-2852);
                stackIn_17_0 = this.field_p;
                stackIn_17_1 = var5;
                if (var6 != 0) {
                  stackIn_18_2 = ContentTransitionPhase.cp1252ToChar(-12541, (byte) var6);
                } else {
                  stackIn_18_2 = 0;
                }
                stackIn_17_0[stackIn_17_1] = (char) stackIn_18_2;
              }
            } else {
              if (3 == param2) {
                var4_int = param0.readUnsignedByte(-81);
                this.field_s = new char[var4_int];
                this.field_x = new int[var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  this.field_x[var5] = param0.readUnsignedShort(-20976);
                  var6 = param0.readSignedByte(-2852);
                  stackIn_8_0 = this.field_s;
                  stackIn_8_1 = var5;
                  if (var6 != 0) {
                    stackIn_9_2 = ContentTransitionPhase.cp1252ToChar(-12541, (byte) var6);
                  } else {
                    stackIn_9_2 = 0;
                  }
                  stackIn_8_0[stackIn_8_1] = (char) stackIn_9_2;
                }
              } else {
                if (param2 == 4) {
                  this.field_y = true;
                }
              }
            }
          }
          if (param1 >= -58) {
            this.field_t = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("si.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static FullscreenFocusCanvas a(int param0, PlatformTaskDispatcher param1, int param2, byte param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenFocusCanvas var7 = null;
        int var8 = 0;
        java.awt.Frame var9 = null;
        FullscreenFocusCanvas stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = GameClientShell.a(true, param1, param4, param2, param5, param0);
          var6 = var9;
          if (var9 == null) {
            return null;
          }
          var7 = new FullscreenFocusCanvas();
          var8 = -69 % ((44 - param3) / 49);
          var7.field_d = var9;
          var7.field_d.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("si.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void decode(PacketBuffer param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          while (true) {
            var3_int = param0.readUnsignedByte(param1 ^ 109);
            if (var3_int != 0) {
              this.decodeOpcode(param0, (byte) -67, var3_int);
              continue;
            }
            break;
          }
          if (param1 != -1) {
            this.field_y = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("si.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    QuickChatPhraseDefinition() {
        this.field_y = false;
    }

    static {
        field_w = "Total fleets produced in this territory this turn.";
        field_q = "Open";
    }
}
