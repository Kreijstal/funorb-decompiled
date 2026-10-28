/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveKeyRequest extends IntrusiveNode {
    int archiveId;
    int[] key;
    int groupId;
    static String field_h;

    final static void showLevelSelect(int openingTick, int mode, boolean pointerDriven, int accountStateIndex) {
        mode = AccountChoicePanel.availableModeIndex(-8462, mode);
        CheckboxPainter.field_l = new LevelSelectScreen(mode, accountStateIndex);
        LoginHandshakeSupport.field_d = openingTick;
        SelfDestructEffects.field_q = mode;
        HighscorePlayerRecord.field_d = new MenuInputState(CheckboxPainter.field_l.actionCount);
        int var4 = LoginForm.initialLevelSelection(mode, (byte) 121);
        HighscorePlayerRecord.field_d.initializeSelection(102, pointerDriven, CheckboxPainter.field_l.hitTest(UiContainer.field_y, 12089, GzipDecoder.field_d), var4);
        ChatMessage.clearFrameOffsets((byte) -70);
    }

    final static void decodeArchiveKeyResponse(boolean guard) {
        ArchiveKeyRequest var1 = (ArchiveKeyRequest) (LegacyTextBlock.field_n.first(guard));
        if (var1 != null) {
          CipherPacketBuffer var2 = QuickChatDynamicCommand.incomingPackets;
          var1.key = new int[]{var2.readInt(-5053), var2.readInt(-5053), var2.readInt(-5053), var2.readInt(-5053)};
          var1.unlink((byte) -66);
          return;
        }
        ConnectionSupport.closeTransport(16);
    }

    final static void drawCornerTitles(int rightY, int leftY, int guard, int phase) {
        int var5 = EscapeVector.obfuscationControl;
        if (phase > 0) {
          if (!(30 <= phase)) {
            ResourceArchive.drawSpriteWithRowJitter(leftY, 8, 60 - phase * 2, SlidingSpriteTransition.field_f, guard ^ -97);
          } else if (phase <= 80) {
            SlidingSpriteTransition.field_f.drawTransparent(8, leftY);
          } else if (phase < 95) {
            ResourceArchive.drawSpriteWithRowJitter(leftY, 8, (phase - 80) * 4, SlidingSpriteTransition.field_f, guard - 115);
          }
        }
        if (guard != 8) {
          ArchiveKeyRequest.drawCornerTitles(114, -28, -15, 125);
        }
        if (phase <= 50) {
          return;
        }
        if (80 > phase) {
          ResourceArchive.drawSpriteWithRowJitter(rightY, -ArchiveIndex.field_o.fullWidth + 632, 2 * (-phase + 80), ArchiveIndex.field_o, guard ^ -112);
          return;
        }
        if (phase <= 80) {
          ArchiveIndex.field_o.drawTransparent(632 - ArchiveIndex.field_o.fullWidth, rightY);
          return;
        }
        if (95 <= phase) {
          return;
        }
        ResourceArchive.drawSpriteWithRowJitter(rightY, -ArchiveIndex.field_o.fullWidth + 632, (phase - 80) * 4, ArchiveIndex.field_o, guard ^ -108);
    }

    public static void releaseStatics(byte guard) {
        field_h = null;
        if (guard != -77) {
          field_h = (String) null;
        }
    }

    ArchiveKeyRequest() {
    }

    final static void decodeAccountName(boolean guard) {
        ThreeSliceButtonPainter.field_r = QuickChatDynamicCommand.incomingPackets.readString(!guard ? true : false);
        if (guard) {
          CharSequence var3 = (CharSequence) ((Object) ThreeSliceButtonPainter.field_r);
          ProgressRecord.field_k = SessionCounterState.normalizeAccountName(-101, var3);
          return;
        }
        field_h = (String) null;
        CharSequence var2 = (CharSequence) ((Object) ThreeSliceButtonPainter.field_r);
        ProgressRecord.field_k = SessionCounterState.normalizeAccountName(-101, var2);
    }

    final static boolean hasCompletePacket(int guard) {
        if (EmailSyntaxValidator.field_r == -1) {
          if (!Checkbox.readIncomingBytes(30000, 1)) {
            return false;
          }
          EmailSyntaxValidator.field_r = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(guard ^ 10550);
          QuickChatDynamicCommand.incomingPackets.position = 0;
        }
        if (EmailSyntaxValidator.field_r == -2) {
          if (!Checkbox.readIncomingBytes(30000, 2)) {
            return false;
          }
          EmailSyntaxValidator.field_r = QuickChatDynamicCommand.incomingPackets.readUnsignedShort(1952);
          QuickChatDynamicCommand.incomingPackets.position = 0;
        }
        if (guard == 10550) {
          return Checkbox.readIncomingBytes(30000, EmailSyntaxValidator.field_r);
        }
        field_h = (String) null;
        return Checkbox.readIncomingBytes(30000, EmailSyntaxValidator.field_r);
    }

    static {
        field_h = "ENTER or R or ALT";
    }
}
