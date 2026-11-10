/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    static String field_g;
    private boolean field_h;
    int[] field_e;
    private int field_l;
    static Js5Archive field_f;
    int field_i;
    int field_b;
    int field_j;
    String field_k;
    private String field_c;
    static int[] field_a;
    private long field_d;

    final int getDisplayPriority(byte param0) {
        if (param0 > -64) {
          this.field_e = (int[]) null;
        }
        if (this.field_h) {
          return 2;
        }
        if (this.field_j == 2 &&
          this.field_l > 0) {
          return 2;
        }
        if (this.field_d == ScreenBlurHelpers.field_b) {
          return 1;
        }
        if (ArchiveProvider.field_b != 2) {
          return 0;
        }
        if (EmailSyntaxValidator.isKnownPlayerName(this.field_c, true)) {
          return 1;
        }
        return 0;
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_g = null;
        field_a = null;
        if (param0 != -2008296413) {
          PacketBuffer var2 = (PacketBuffer) null;
          ChatMessage.readPackedRankingValues((PacketBuffer) null, -30);
        }
    }

    final static void readPackedRankingValues(PacketBuffer param0, int param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          LoginMethod.field_e = param0.readUnsignedShort(2) << 5;
          var2_int = param0.readUnsignedByte((byte) -119);
          MidiPcmStream.field_E = (7 & var2_int) << 18;
          LoginMethod.field_e = LoginMethod.field_e + (var2_int >> 3);
          if (param1 > -93) {
            field_g = (String) null;
          }
          MidiPcmStream.field_E = MidiPcmStream.field_E + (param0.readUnsignedShort(2) << 2);
          var2_intLifetime1 = param0.readUnsignedByte((byte) -117);
          SecondaryNodeDeque.field_d = (var2_intLifetime1 & 63) << 15;
          MidiPcmStream.field_E = MidiPcmStream.field_E + (var2_intLifetime1 >> 6);
          SecondaryNodeDeque.field_d = SecondaryNodeDeque.field_d + (param0.readUnsignedByte((byte) -127) << 7);
          var2_intLifetime2 = param0.readUnsignedByte((byte) -120);
          MessageDialogContent.field_H = (1 & var2_intLifetime2) << 16;
          SecondaryNodeDeque.field_d = SecondaryNodeDeque.field_d + (var2_intLifetime2 >> 1);
          MessageDialogContent.field_H = MessageDialogContent.field_H + param0.readUnsignedShort(2);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "aa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static TrackedSoundStream playSampleStream(int param0, PcmSampleStream param1) {
        TrackedSoundStream var2 = null;
        RuntimeException var2_ref = null;
        TrackedSoundStream stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 4) {
            ChatMessage.releaseStatics(31);
          }
          var2 = new TrackedSoundStream(param1, param1);
          MatchingTextValidator.field_i.addFirst(0, var2);
          DialWidgetPainter.field_i.addSubstream(param1);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("aa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String decodeBase37Name(long param0, int param1) {
        StringBuilder var13 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = ZombieDawn.field_J;
        long var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        int var3 = 0;
        long var4 = param0;
        if (param1 != -27513) {
          ChatMessage.decodeBase37Name(59L, 23);
          while (0L != var4) {
            var3++;
            var4 = var4 / 37L;
          }
          var13 = new StringBuilder(var3);
          while (0L != param0) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = PatrollingGuard.field_Nb[(int)(-(param0 * 37L) + var7)];
            if (var9 == 95) {
              var10 = var13.length() - 1;
              var9 = 160;
              var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
            }
            discarded$0 = var13.append((char) var9);
          }
          var13.reverse();
          var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
          return var13.toString();
        }
        while (0L != var4) {
          var3++;
          var4 = var4 / 37L;
        }
        StringBuilder var12 = new StringBuilder(var3);
        while (0L != param0) {
          var7Lifetime1 = param0;
          param0 = param0 / 37L;
          var9Lifetime1 = PatrollingGuard.field_Nb[(int)(-(param0 * 37L) + var7Lifetime1)];
          if (var9Lifetime1 == 95) {
            var10Lifetime1 = var12.length() - 1;
            var9Lifetime1 = 160;
            var12.setCharAt(var10Lifetime1, Character.toUpperCase(var12.charAt(var10Lifetime1)));
          }
          discarded$1 = var12.append((char) var9Lifetime1);
        }
        var12.reverse();
        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
        return var12.toString();
    }

    ChatMessage(boolean param0) {
        this.field_k = AddressHintGlobals.field_a;
        this.field_d = VisualPropertyNode.field_s;
        this.field_b = OfflineLoginHelpers.field_a;
        this.field_l = FadingModalPanel.field_J;
        this.field_h = NameCharacterHelpers.field_d;
        if (param0) {
          this.field_e = InputValidationResult.field_d;
        } else {
          this.field_e = null;
        }
        this.field_c = ClientProtocolStage.field_a;
        this.field_j = QuickChatCommandType.field_e;
        this.field_i = PendingBytePayloadRequest.field_i;
    }

    static {
        field_a = new int[]{128, 128, 128, 128};
        field_g = "Confirm Email:";
    }
}
