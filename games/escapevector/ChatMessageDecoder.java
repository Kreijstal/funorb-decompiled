/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ChatMessageDecoder {
    static String[] field_c;
    static UiTheme field_d;
    static long field_a;
    static Sprite[][] field_b;

    public static void releaseStatics(int guard) {
        field_c = null;
        if (guard == 127) {
          field_b = (Sprite[][]) null;
          field_d = null;
          return;
        }
        ChatMessageDecoder.loadCampaignsByArchiveKind((ResourceArchive) null, (ResourceArchive) null, (int[]) null, (byte[][][]) null, -11, 8);
        field_b = (Sprite[][]) null;
        field_d = null;
    }

    final static byte[][][] loadCampaignsByArchiveKind(ResourceArchive memberArchive, ResourceArchive archive, int[] key, byte[][][] campaigns, int kind, int startMode) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var6_int = GzipDecoder.field_e.length;
          if (campaigns == null) {
            campaigns = new byte[var6_int][][];
          }
          int var7 = startMode;
          while (var7 < var6_int) {
            int var8 = GzipDecoder.field_e[var7];
            if ((kind == var8 ||
              var10 != 0) && (campaigns[var7] == null ||
              var10 != 0)) {
              byte[][] var12 = LegacyWidgetStyle.loadCampaignLevels(-51, archive, key, var7, memberArchive);
              campaigns[var7] = var12;
            }
            var7++;
            if (var10 == 0) {
              continue;
            }
            break;
          }
          byte[][][] stackIn_14_0 = (byte[][][]) (campaigns);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var6;
          StringBuilder stackIn_17_1 = new StringBuilder().append("sl.A(");
          if (memberArchive == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (archive == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (key == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (campaigns == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(kind).append(',').append(startMode).append(')').toString());
        }
    }

    final static ChatMessage decodeMessage(boolean quickChat, int guard) {
        int[] stackIn_26_0 = null;
        int var7 = EscapeVector.obfuscationControl;
        CipherPacketBuffer var2 = QuickChatDynamicCommand.incomingPackets;
        int var3 = var2.readUnsignedByte(0);
        DualLinkNode.field_o = var3 & 127;
        boolean stackIn_3_0 = (0 != (128 & var3));
        DualLinkDequeIterator.field_c = stackIn_3_0;
        MarkerSliderPainter.field_g = var2.readUnsignedByte(0);
        TextFieldValidator.field_e = var2.readLong(-800509813);
        if (DualLinkNode.field_o != 2) {
          ProxyAuthenticationException.field_a = 0;
          IntKeyLookup.field_d = 0;
        } else {
          IntKeyLookup.field_d = var2.readUnsignedShort(1952);
          ProxyAuthenticationException.field_a = var2.readUnsignedMedium((byte) -119);
          if (var7 != 0) {
            ProxyAuthenticationException.field_a = 0;
            IntKeyLookup.field_d = 0;
          }
        }
        boolean stackIn_11_0 = !(var2.readUnsignedByte(guard ^ guard) != 1);
        boolean var4 = stackIn_11_0;
        gm.field_e = var2.readString(false);
        if (var4) {
          DualLinkDequeIterator.field_g = var2.readString(false);
        } else {
          DualLinkDequeIterator.field_g = gm.field_e;
          if (var7 != 0) {
            DualLinkDequeIterator.field_g = var2.readString(false);
          }
        }
        if (1 == DualLinkNode.field_o) {
          var2.readUnsignedShort(1952);
          var2.readString(false);
        } else if (DualLinkNode.field_o == 4) {
          var2.readUnsignedShort(1952);
          var2.readString(false);
        }
        if (!quickChat) {
          SelfDestructEffects.field_d = SpriteOffset.a(var2, 10241, 80);
          Checkbox.field_H = null;
          return new ChatMessage(quickChat);
        }
        int var5 = var2.readUnsignedShort(1952);
        try {
          QuickChatPhraseDefinition var8 = EmailSyntaxValidator.field_s.phrase(var5, (byte) -126);
          SelfDestructEffects.field_d = var8.previewText(-4);
          if (DualLinkDequeIterator.field_g.equals(ThreeSliceButtonPainter.field_r)) {
            stackIn_26_0 = null;
          } else {
            stackIn_26_0 = var8.responseIds;
          }
          Checkbox.field_H = stackIn_26_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var6 = (Exception) (Object) decompiledCaughtException;
          GameModeSelectScreen.reportClientError(false, "CC1", (Throwable) ((Object) var6));
          Checkbox.field_H = null;
          SelfDestructEffects.field_d = null;
        }
        if (var7 == 0) {
          return new ChatMessage(quickChat);
        }
        SelfDestructEffects.field_d = SpriteOffset.a(var2, 10241, 80);
        Checkbox.field_H = null;
        return new ChatMessage(quickChat);
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          if (Js5ArchiveManager.field_d == null) {
            Js5ArchiveManager.field_d = MouseWheelInput.field_c.a(ej.field_b, 4, IntrusiveDeque.field_h);
          }
          if (param1 != 0) {
            field_b = (Sprite[][]) null;
          }
          if (Js5ArchiveManager.field_d.field_f == 0) {
            return false;
          }
          long dupTemp$1 = td.b(128);
          le.field_c = dupTemp$1;
          field_a = dupTemp$1;
          if (Js5ArchiveManager.field_d.field_f != 1) {
            AccountFormStage.field_d = HighscoresScreen.field_d;
          } else {
            try {
              TextLayout.field_c = new BufferedSocket((java.net.Socket) (Js5ArchiveManager.field_d.field_b), MouseWheelInput.field_c);
              QuickChatDynamicCommand.outgoingPackets.position = 0;
              CipherPacketBuffer var4 = QuickChatDynamicCommand.incomingPackets;
              CipherPacketBuffer var5 = var4;
              AccountFormStage.field_d = sf.field_d;
              var5.position = 0;
              int stackIn_11_0 = (!param0) ? -1 : -2;
              NetworkGameClient.field_q = stackIn_11_0;
              ArchiveIndex.field_t = stackIn_11_0;
              jj.field_b = stackIn_11_0;
              MenuInputState.writeAccountHandshake(rd.field_a, KeyboardStateSupport.field_b, true, DropTargetWidget.field_D, QuickChatDynamicCommand.outgoingPackets);
              ClientException.a(-1, 30785);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              IOException var2 = (IOException) (Object) decompiledCaughtException;
              AccountFormStage.field_d = HighscoresScreen.field_d;
              if (EscapeVector.obfuscationControl == 0) {
                Js5ArchiveManager.field_d = null;
                return true;
              }
              AccountFormStage.field_d = HighscoresScreen.field_d;
              Js5ArchiveManager.field_d = null;
              return true;
            }
          }
          Js5ArchiveManager.field_d = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_b = new Sprite[7][4];
    }
}
