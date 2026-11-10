/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TickClock {
    static int[] field_c;
    static String[] field_a;
    static int field_b;

    final int waitAndAdvanceTicks(long param0, int param1) {
        long var4 = this.delayMillis((byte) -112);
        if (var4 <= (long)param1) {
          return this.advanceTicks(-99, param0);
        }
        AlternateLongAndNameCredentials.sleepMillis(var4, (byte) 122);
        return this.advanceTicks(-99, param0);
    }

    final static ChatMessage readChatMessage(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        BitPacketBuffer var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        QuickChatPhraseDefinition var9 = null;
        var8 = ZombieDawn.field_J;
        var2 = -59 / ((param1 + 17) / 52);
        var3 = MatchingTextValidator.field_g;
        var4 = var3.readUnsignedByte((byte) -128);
        QuickChatCommandType.field_e = 127 & var4;
        stackIn_3_0 = ((var4 & 128) != 0);
        NameCharacterHelpers.field_d = stackIn_3_0;
        FadingModalPanel.field_J = var3.readUnsignedByte((byte) -125);
        VisualPropertyNode.field_s = var3.readLong(true);
        if (QuickChatCommandType.field_e != 2) {
          OfflineLoginHelpers.field_a = 0;
          PendingBytePayloadRequest.field_i = 0;
        } else {
          PendingBytePayloadRequest.field_i = var3.readUnsignedShort(2);
          OfflineLoginHelpers.field_a = var3.readUnsignedMedium(-1875);
        }
        stackIn_9_0 = (1 != var3.readUnsignedByte((byte) -115)) ? 0 : 1;
        var5 = stackIn_9_0;
        KeyHandlerHolder.field_b = var3.readNullTerminatedString(true);
        if (var5 != 0) {
          ClientProtocolStage.field_a = var3.readNullTerminatedString(true);
        } else {
          ClientProtocolStage.field_a = KeyHandlerHolder.field_b;
        }
        if (QuickChatCommandType.field_e == 1) {
          var3.readUnsignedShort(2);
          var3.readNullTerminatedString(true);
        } else {
          if (QuickChatCommandType.field_e == 4) {
            var3.readUnsignedShort(2);
            var3.readNullTerminatedString(true);
          }
        }
        if (!param0) {
          AddressHintGlobals.field_a = SweepingSpotlight.readCompressedString(80, -23171, var3);
          InputValidationResult.field_d = null;
          return new ChatMessage(param0);
        }
        var6 = var3.readUnsignedShort(2);
        try {
          var9 = SingleChildWidget.field_y.getPhrase(75, var6);
          AddressHintGlobals.field_a = var9.getPreview(80);
          if (!ClientProtocolStage.field_a.equals(VisualPropertyNode.field_r)) {
            stackIn_22_0 = var9.field_u;
          } else {
            stackIn_22_0 = null;
          }
          InputValidationResult.field_d = stackIn_22_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (Exception) (Object) decompiledCaughtException;
          ErrorReportHelpers.reportClientError((Throwable) ((Object) var7), 10331, "CC1");
          InputValidationResult.field_d = null;
          AddressHintGlobals.field_a = null;
          return new ChatMessage(param0);
        }
        return new ChatMessage(param0);
    }

    abstract void resetTiming(boolean param0);

    public static void releaseStatics(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -5) {
          field_b = -64;
        }
    }

    abstract long delayMillis(byte param0);

    abstract int advanceTicks(int param0, long param1);

    final static void setAccountCreationResultMessage(int param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ZombieDawn.field_J;
        try {
          AccountCreationForm.field_F = HotspotTextWidget.field_H;
          if (param0 != 255) {
            if (param0 < 100) {
              RankingRowHelpers.field_f = Alien.createResponseWithMessage(param2, -13466, param0);
            } else {
              if (param0 <= 105) {
                RankingRowHelpers.field_f = ScorePopup.createResponseWithLines(param3, -91);
              } else {
                RankingRowHelpers.field_f = Alien.createResponseWithMessage(param2, -13466, param0);
              }
            }
          } else {
            stackIn_4_0 = 5;
            stackIn_5_1 = !(ErrorReportHelpers.field_a >= 13);
            RankingRowHelpers.field_f = AccountResultHelpers.createFlagResult(stackIn_4_0, stackIn_5_1);
          }
          if (param1 == -14) {
            return;
          }
          field_c = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ln.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_c = new int[]{};
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
