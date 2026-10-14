/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiplayerExitScreen extends MatchResultScreen {
    static long wallRollbackMillis;
    static int[] field_x;
    static String field_A;
    static RgbSprite farmSmallSprite;
    static String[] savePrompts;
    static String field_y;
    static long repeatRecipientId;

    public static void i(int param0) {
        field_y = null;
        int var1 = 63 % ((-67 - param0) / 54);
        field_A = null;
        field_x = null;
        farmSmallSprite = null;
        savePrompts = null;
    }

    final static void sendRankingsRequest(int obfuscationGuard, RankingsRequest request, int opcode) {
        BitPacketBuffer var3 = TextFieldValidator.outgoingPackets;
        if (obfuscationGuard != -21167) {
          return;
        }
        try {
          var3.writeCipheredOpcode(-13413, opcode);
          var3.writeByte(-113, request.rankingKind);
          var3.writeByte(obfuscationGuard ^ 21215, request.rowLimit);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "gn.C(" + obfuscationGuard + ',' + (request != null ? "{...}" : "null") + ',' + opcode + ')');
        }
    }

    final boolean isButtonEnabled(byte obfuscationGuard, int buttonIndex) {
        int var3 = this.buttons[buttonIndex].actionId;
        if (obfuscationGuard < 80) {
          wallRollbackMillis = -10L;
          if (TableDataRequest.field_k) {
            return var3 != 12 ? true : false;
          }
          return true;
        }
        if (!TableDataRequest.field_k) {
          return true;
        }
        if (var3 == 12) {
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1, ln param2) {
        BitPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        BitPacketBuffer var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = TextFieldValidator.outgoingPackets;
          var3 = var5;
          var5.writeCipheredOpcode(-13413, param0);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(-125, 1);
          if (null == param2.field_i) {
            var5.writeByte(-11, 0);
          } else {
            var5.writeByte(-108, param2.field_i.length);
            var5.writeBytes(param2.field_i, -1, 0, param2.field_i.length);
          }
          var5.appendCrc32(3, var4);
          var5.position = var5.position - 4;
          param2.field_m = var5.readInt(255);
          var5.backfillByteLength((byte) 121, -var4 + var5.position);
          if (param1 > 113) {
            return;
          }
          MultiplayerExitScreen.i(-46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("gn.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(boolean param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3, int param4) {
        try {
          LabeledWidget.emailAvailabilityRequest = rm.createEmailAvailabilityRequest("", 16711935);
          LabeledWidget.emailAvailabilityRequest.complete(false, 20892);
          if (param4 <= 11) {
            savePrompts = (String[]) null;
          }
          TooltipSprite.a(param3, param1, (byte) -59, param2);
          np.b(false);
          MusicVoice.field_l = StrongCacheEntry.field_P;
          IntrusiveHashIterator.field_g = StrongCacheEntry.field_P;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "gn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final int getResultBottom(int obfuscationGuard) {
        if (obfuscationGuard == -6) {
          return DualLinkDeque.field_d.screenY;
        }
        ResourceArchive var3 = (ResourceArchive) null;
        MultiplayerExitScreen.a(false, (ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null, 63);
        return DualLinkDeque.field_d.screenY;
    }

    final void navigateBack(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          MultiplayerExitScreen.i(-22);
          ArchiveNetworkRequest.f((byte) 122);
          return;
        }
        ArchiveNetworkRequest.f((byte) 122);
    }

    MultiplayerExitScreen() {
        super(19, LoginCredentials.field_h);
    }

    static {
        savePrompts = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_y = "Quick Chat game";
        field_A = "Enter name of player to delete from list";
    }
}
