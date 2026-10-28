/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveKeyRequest extends IntrusiveNode {
    int archiveId;
    int[] key;
    int groupId;
    static String field_h;

    final static void a(int param0, int param1, boolean param2, int param3) {
        param1 = AccountChoicePanel.a(-8462, param1);
        CheckboxPainter.field_l = new ig(param1, param3);
        mj.field_d = param0;
        SelfDestructEffects.field_q = param1;
        di.field_d = new MenuInputState(CheckboxPainter.field_l.field_p);
        int var4 = LoginForm.a(param1, (byte) 121);
        di.field_d.initializeSelection(102, param2, CheckboxPainter.field_l.a(UiContainer.field_y, 12089, GzipDecoder.field_d), var4);
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
        nm.a(16);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = EscapeVector.obfuscationControl;
        if (param3 > 0) {
          if (!(30 <= param3)) {
            ResourceArchive.drawSpriteWithRowJitter(param1, 8, 60 - param3 * 2, SlidingSpriteTransition.field_f, param2 ^ -97);
          } else if (param3 <= 80) {
            SlidingSpriteTransition.field_f.drawTransparent(8, param1);
          } else if (param3 < 95) {
            ResourceArchive.drawSpriteWithRowJitter(param1, 8, (param3 - 80) * 4, SlidingSpriteTransition.field_f, param2 - 115);
          }
        }
        if (param2 != 8) {
          ArchiveKeyRequest.a(114, -28, -15, 125);
        }
        if (param3 <= 50) {
          return;
        }
        if (80 > param3) {
          ResourceArchive.drawSpriteWithRowJitter(param0, -ArchiveIndex.field_o.fullWidth + 632, 2 * (-param3 + 80), ArchiveIndex.field_o, param2 ^ -112);
          return;
        }
        if (param3 <= 80) {
          ArchiveIndex.field_o.drawTransparent(632 - ArchiveIndex.field_o.fullWidth, param0);
          return;
        }
        if (95 <= param3) {
          return;
        }
        ResourceArchive.drawSpriteWithRowJitter(param0, -ArchiveIndex.field_o.fullWidth + 632, (param3 - 80) * 4, ArchiveIndex.field_o, param2 ^ -108);
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
          ProgressRecord.field_k = sf.a(-101, var3);
          return;
        }
        field_h = (String) null;
        CharSequence var2 = (CharSequence) ((Object) ThreeSliceButtonPainter.field_r);
        ProgressRecord.field_k = sf.a(-101, var2);
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
