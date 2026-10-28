/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatHistorySupport {
    static PcmSample field_c;
    static int field_g;
    static int[] field_e;
    static int field_b;
    static int field_f;
    static int field_a;
    static PcmSampleStream field_d;

    public static void releaseStatics(int guard) {
        field_d = null;
        if (guard < 115) {
          ChatMessage var2 = (ChatMessage) null;
          ChatHistorySupport.appendMessage((ChatMessage) null, 47);
        }
        field_c = null;
        field_e = null;
    }

    final static void appendMessage(ChatMessage message, int guard) {
        String stackIn_24_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (guard != 3) {
            return;
          }
          for (int var2_int = 0; var2_int < 3; var2_int++) {
            ResourceArchive.field_l[var2_int] = 0;
          }
          for (int var2_intLifetime1 = 0; var2_intLifetime1 < LoginStage.field_b; var2_intLifetime1++) {
            if (IterableNodeHashTable.field_d[var2_intLifetime1].messageType == message.messageType) {
              int dupTemp$3 = IterableNodeHashTable.field_d[var2_intLifetime1].displayPriority(guard ^ 83);
              ResourceArchive.field_l[dupTemp$3] = ResourceArchive.field_l[dupTemp$3] + 1;
            }
          }
          int dupTemp$0 = message.displayPriority(108);
          ResourceArchive.field_l[dupTemp$0] = ResourceArchive.field_l[dupTemp$0] + 1;
          int var2_intLifetime2 = 0;
          for (int var3 = 0; LoginStage.field_b > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (IterableNodeHashTable.field_d[var3].messageType == message.messageType) {
              int var4 = IterableNodeHashTable.field_d[var3].displayPriority(47);
              if (ResourceArchive.field_l[var4] > ReflectionCheck.field_k) {
                ResourceArchive.field_l[var4] = ResourceArchive.field_l[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              int incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              IterableNodeHashTable.field_d[incrementValue$2] = IterableNodeHashTable.field_d[var3];
            }
          }
          LoginStage.field_b = var2_intLifetime2;
          int fieldTemp$1 = LoginStage.field_b;
          LoginStage.field_b = LoginStage.field_b + 1;
          IterableNodeHashTable.field_d[fieldTemp$1] = message;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var2;
          StringBuilder stackIn_23_1 = new StringBuilder().append("vi.A(");
          if (message == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void fillJustifiedInsertionPositions(int extraSpaceQ8, String text, TextLayoutLine line, BitmapFont font, boolean guard) {
        String stackIn_23_2 = null;
        String stackIn_26_2 = null;
        String stackIn_29_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (guard) {
            ChatHistorySupport.releaseStatics(-80);
          }
          int var5_int = 0;
          int var6 = -1;
          for (int var7 = 1; text.length() > var7; var7++) {
            int var8 = text.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + line.insertionX[0] + font.stringWidth(text.substring(0, var7));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + extraSpaceQ8;
              }
              line.insertionX[var7] = line.insertionX[0] + ((var5_int >> 8) + font.stringWidth(text.substring(0, 1 + var7))) - font.charAdvance((char) var8);
            } else {
              line.insertionX[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var5;
          StringBuilder stackIn_22_1 = new StringBuilder().append("vi.C(").append(extraSpaceQ8).append(',');
          if (text == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (line == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          StringBuilder stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (font == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_f = 2;
    }
}
