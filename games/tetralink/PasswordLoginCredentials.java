/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordLoginCredentials extends LoginCredentials {
    private String field_g;
    private String field_h;
    static SocialTabsPanel field_j;
    static UiComponent field_i;
    static java.awt.Font field_k;

    final LoginCredentialType getCredentialType(byte param0) {
        if (param0 > -77) {
          return (LoginCredentialType) null;
        }
        return ArchiveIndex.field_h;
    }

    final static void showLoginForm(int param0) {
        if (!QuickChatCategory.field_v) {
          throw new IllegalStateException();
        }
        if (param0 > -5) {
          return;
        }
        if (null != BufferedSocket.field_u) {
          BufferedSocket.field_u.closeDialog(-124);
        }
        String var1 = ConditionalTextValue.getLoginNameOrDefault(-8927);
        ChatReceiveHelpers.field_c = new LoginPanel(var1, (String) null, true, false, false);
        InsetTextPainter.field_s.pushLayer(PasswordValidator.field_u, false);
        PasswordValidator.field_u.transitionToContent(ChatReceiveHelpers.field_c, -27667);
        PasswordValidator.field_u.finishTransition(true);
    }

    final static void serviceAudio(byte param0) {
        PlayingSound var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        PlayingSound var1Lifetime1;
        var2 = TetraLink.field_J;
        try {
          PatchNoteUsage.field_q.serviceOutput();
          PacketDiagnosticsHelpers.field_v.serviceOutput();
          TransitionPhase.field_a = TransitionPhase.field_a - 1;
          if (TransitionPhase.field_a == 0) {
            TransitionPhase.field_a = 200;
            var1 = (PlayingSound) (MouseInputHandler.field_b.first(false));
            while (var1 != null) {
              if (!var1.field_q.isLinked((byte) 95)) {
                var1.unlink(false);
              }
              var1 = (PlayingSound) (MouseInputHandler.field_b.next((byte) -70));
            }
            if (InterfaceTextLoader.field_d != null) {
              var1Lifetime1 = (PlayingSound) (InterfaceTextLoader.field_d.first(false));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_q.isLinked((byte) 95)) {
                  var1Lifetime1.unlink(false);
                }
                var1Lifetime1 = (PlayingSound) (InterfaceTextLoader.field_d.next((byte) -70));
              }
            }
          }
          if (param0 > -77) {
            PasswordLoginCredentials.releaseStatics(true);
          }
          if (null != SharedPanelFactory.field_b &&
            !SharedPanelFactory.field_b.isReady((byte) 127)) {
            HighscoreQuery.field_B = null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1_ref), "gg.G(" + param0 + ')');
        }
    }

    final static void closePlayerContextMenu(byte param0) {
        if (param0 != 43) {
          return;
        }
        if (null != EmailAvailabilityValidator.field_s &&
          null != EmailAvailabilityValidator.field_s.field_h) {
          EmailAvailabilityValidator.field_s.field_h.field_zb = false;
        }
        EmailAvailabilityValidator.field_s = null;
        PendingMove.field_d = null;
    }

    final static void initializeSpecularTable(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = TetraLink.field_J;
        try {
          TriangleRasterizer.useRasterClip();
          CanvasAndErrorHelpers.field_g = new int[260];
          GameRoomPanelHelpers.field_a = 11;
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            CanvasAndErrorHelpers.field_g[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          if (param0 <= 87) {
            PasswordLoginCredentials.closePlayerContextMenu((byte) 127);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < CanvasAndErrorHelpers.field_g.length) {
            CanvasAndErrorHelpers.field_g[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "gg.D(" + param0 + ')');
        }
    }

    final static boolean hasPendingValidation(byte param0) {
        if (param0 != 87) {
          PasswordLoginCredentials.hasPendingValidation((byte) 24);
        }
        return TextWidgetPainter.field_i != null ? true : false;
    }

    final void writeTo(int param0, PacketBuffer param1) {
        try {
          if (param0 != -22017) {
            this.getCredentialType((byte) 84);
          }
          param1.writeZeroPrefixedString(this.field_g, (byte) 103);
          param1.writeBase38Name((byte) 124, this.field_h);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "gg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void sendRatedGameRequest(int param0, int param1) {
        BitPacketBuffer var2 = QuickChatHelpDialog.field_Lb;
        var2.writeCipheredByte(param0, (byte) -92);
        var2.writeByte(1, false);
        var2.writeByte(param1, false);
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_k = (java.awt.Font) null;
        }
        field_k = null;
        field_j = null;
        field_i = null;
    }

    PasswordLoginCredentials(String param0, String param1) {
        try {
          this.field_h = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
