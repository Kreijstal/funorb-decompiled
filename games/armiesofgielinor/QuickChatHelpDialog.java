/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatHelpDialog extends ClientUiComponent {
    static String field_Ib;
    static int[] field_Jb;
    private ClientUiComponent closeButton;

    final boolean pollClose(byte obfuscationGuard, boolean unusedFlag) {
        if (obfuscationGuard != 102) {
          QuickChatHelpDialog.pumpAudioAndPruneSounds(-40);
          this.updateInput(true, true);
          if (DeployEvent.pointerPressButton == 0) {
            return this.closeButton.pressedButton != 0 ? true : false;
          }
          if (this.pressedButton != 0) {
            return this.closeButton.pressedButton != 0 ? true : false;
          }
          return true;
        }
        this.updateInput(true, true);
        if (DeployEvent.pointerPressButton != 0) {
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

    final static void pumpAudioAndPruneSounds(int obfuscationGuard) {
        SoundPlaybackHandle handle = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        SoundPlaybackHandle additionalHandle;
        try {
          l.musicPlayer.pump();
          TextCursor.effectsPlayer.pump();
          DelayedPacket.soundHandleCleanupCountdown = DelayedPacket.soundHandleCleanupCountdown - 1;
          if (obfuscationGuard != 128) {
            QuickChatHelpDialog.pumpAudioAndPruneSounds(94);
          }
          if (DelayedPacket.soundHandleCleanupCountdown == 0) {
            DelayedPacket.soundHandleCleanupCountdown = 200;
            handle = (SoundPlaybackHandle) (QuickChatCategoryRepository.soundHandles.first((byte) 118));
            while (handle != null) {
              if (!handle.lifetimeNode.isLinked(obfuscationGuard ^ 65408)) {
                handle.unlink(obfuscationGuard ^ 247);
              }
              handle = (SoundPlaybackHandle) (QuickChatCategoryRepository.soundHandles.next((byte) 123));
            }
            if (null != ts.additionalSoundHandles) {
              additionalHandle = (SoundPlaybackHandle) (ts.additionalSoundHandles.first((byte) 120));
              while (additionalHandle != null) {
                if (!additionalHandle.lifetimeNode.isLinked(65280)) {
                  additionalHandle.unlink(-126);
                }
                additionalHandle = (SoundPlaybackHandle) (ts.additionalSoundHandles.next((byte) 123));
              }
            }
          }
          if (LobbyRoom.directMusicSequencer != null &&
            !LobbyRoom.directMusicSequencer.isPlaying(obfuscationGuard + 11771)) {
            MapLayout.currentDirectMusicTrack = null;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hk.A(" + obfuscationGuard + ')');
        }
    }

    public static void l(int param0) {
        if (param0 >= -103) {
          return;
        }
        field_Jb = null;
        field_Ib = null;
    }

    QuickChatHelpDialog(ClientUiComponent unusedFrameStyle, ClientUiComponent headerStyle, ClientUiComponent closeButtonStyle, ClientUiComponent bodyStyle, ClientUiComponent unusedHighlightStyle, ClientUiComponent unusedFooterStyle) {
        int rowIndex = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String unusedFrameDescription = null;
        StringBuilder headerContext = null;
        String headerDescription = null;
        StringBuilder closeContext = null;
        String closeDescription = null;
        StringBuilder bodyContext = null;
        String bodyDescription = null;
        StringBuilder unusedHighlightContext = null;
        String unusedHighlightDescription = null;
        StringBuilder unusedFooterContext = null;
        String unusedFooterDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        ClientUiComponent body = null;
        ClientUiComponent subtitle = null;
        int rowY = 0;
        int maximumDescriptionWidth = 0;
        ClientUiComponent shortcutLabel = null;
        ClientUiComponent descriptionLabel = null;
        int descriptionWidth = 0;
        ClientUiComponent header = null;
        int unusedCenteredY;
        try {
          header = new ClientUiComponent(0L, headerStyle, GameEvent.quickChatHelpTitle.toUpperCase());
          header.horizontalAlignment = 1;
          this.closeButton = new ClientUiComponent(0L, closeButtonStyle);
          body = new ClientUiComponent(0L, bodyStyle);
          subtitle = new ClientUiComponent(0L, bodyStyle, BattlefieldTheme.quickChatHelpSubtitle);
          subtitle.horizontalAlignment = 1;
          rowY = 50;
          maximumDescriptionWidth = 0;
          for (rowIndex = 0; AiUnitPlanner.quickChatShortcutDescriptions.length > rowIndex; rowIndex++) {
            shortcutLabel = new ClientUiComponent(0L, bodyStyle, bt.quickChatShortcutLabels[rowIndex]);
            descriptionLabel = new ClientUiComponent(0L, bodyStyle, AiUnitPlanner.quickChatShortcutDescriptions[rowIndex]);
            descriptionWidth = bodyStyle.font.a(AiUnitPlanner.quickChatShortcutDescriptions[rowIndex]);
            if (maximumDescriptionWidth < descriptionWidth) {
              maximumDescriptionWidth = descriptionWidth;
            }
            shortcutLabel.setBounds(15, -20500, 65, rowY, 20);
            descriptionLabel.setBounds(15, -20500, 640, rowY, 90);
            body.addChild(shortcutLabel, 124);
            body.addChild(descriptionLabel, 122);
            rowY += 30;
          }
          rowY += 15;
          header.setBounds(24, -20500, maximumDescriptionWidth + 110, 0, 0);
          this.setBounds(rowY + header.height, -20500, header.width, 100, 100);
          this.closeButton.setBounds(15, -20500, 15, 5, -20 + header.width);
          body.setBounds(-header.height + this.height, -20500, this.width, header.height, 0);
          subtitle.setBounds(15, -20500, this.width, 20, 0);
          body.skinSprites = tq.a(11579568, false, body.height, 2105376, 3, 8421504);
          header.addChild(this.closeButton, 64);
          body.addChild(subtitle, 111);
          this.addChild(header, 98);
          this.addChild(body, 42);
          this.x = -(this.width >> 1) + 320;
          unusedCenteredY = 240 - (this.height >> 1);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("hk.<init>(");
          if (unusedFrameStyle == null) {
            unusedFrameDescription = "null";
          } else {
            unusedFrameDescription = "{...}";
          }
          headerContext = ((StringBuilder) (Object) errorContext).append(unusedFrameDescription).append(',');
          if (headerStyle == null) {
            headerDescription = "null";
          } else {
            headerDescription = "{...}";
          }
          closeContext = ((StringBuilder) (Object) headerContext).append(headerDescription).append(',');
          if (closeButtonStyle == null) {
            closeDescription = "null";
          } else {
            closeDescription = "{...}";
          }
          bodyContext = ((StringBuilder) (Object) closeContext).append(closeDescription).append(',');
          if (bodyStyle == null) {
            bodyDescription = "null";
          } else {
            bodyDescription = "{...}";
          }
          unusedHighlightContext = ((StringBuilder) (Object) bodyContext).append(bodyDescription).append(',');
          if (unusedHighlightStyle == null) {
            unusedHighlightDescription = "null";
          } else {
            unusedHighlightDescription = "{...}";
          }
          unusedFooterContext = ((StringBuilder) (Object) unusedHighlightContext).append(unusedHighlightDescription).append(',');
          if (unusedFooterStyle == null) {
            unusedFooterDescription = "null";
          } else {
            unusedFooterDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) unusedFooterContext).append(unusedFooterDescription).append(')').toString());
        }
    }

    static {
        field_Ib = "Email address is unavailable";
        field_Jb = new int[]{128, 128, 128, 128, 64, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 64, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 96, 128, 96, 128, 96, 96, 128, 96, 128, 128, 256, 128, 128, 128, 128, 128, 128, 128, 128, 96, 96, 96, 128, 96, 96, 128, 96, 64, 64, 160, 128, 96, 128, 128, 128, 128, 128, 128, 96, 64, 64, 64, 128, 0, 0, 0, 64, 128, 128, 128, 128, 128, 128, 96, 128};
    }
}
