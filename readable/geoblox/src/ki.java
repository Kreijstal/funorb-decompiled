/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static Sprite field_c;
    static ResourceArchive basicUiGraphicsArchive;
    static int currentKeyboardEventCode;
    static String fullscreenNonmemberText;
    static String js5ConnectErrorText;

    final static void a(ClientSessionSnapshot param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.clientControlFlowFlag;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            AchievementSubmission.field_o[var2_int] = 0;
          }
          for (var2_int = 0; var2_int < ByteStorage.field_b; var2_int++) {
            if (MatchingTextValidator.field_k[var2_int].field_f == param0.field_f) {
              dupTemp$3 = MatchingTextValidator.field_k[var2_int].c(124);
              AchievementSubmission.field_o[dupTemp$3] = AchievementSubmission.field_o[dupTemp$3] + 1;
            }
          }
          if (param1 != 31274) {
            return;
          }
          dupTemp$0 = param0.c(125);
          AchievementSubmission.field_o[dupTemp$0] = AchievementSubmission.field_o[dupTemp$0] + 1;
          var2_int = 0;
          for (var3 = 0; ByteStorage.field_b > var3; var3++) {
            L3: {
              if (param0.field_f == MatchingTextValidator.field_k[var3].field_f) {
                var4 = MatchingTextValidator.field_k[var3].c(124);
                if (AchievementSubmission.field_o[var4] > MidiNote.field_v) {
                  AchievementSubmission.field_o[var4] = AchievementSubmission.field_o[var4] - 1;
                  break L3;
                }
              }
              incrementValue$2 = var2_int;
              var2_int++;
              MatchingTextValidator.field_k[incrementValue$2] = MatchingTextValidator.field_k[var3];
            }
          }
          ByteStorage.field_b = var2_int;
          fieldTemp$1 = ByteStorage.field_b;
          ByteStorage.field_b = ByteStorage.field_b + 1;
          MatchingTextValidator.field_k[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("ki.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        js5ConnectErrorText = null;
        field_c = null;
        fullscreenNonmemberText = null;
        basicUiGraphicsArchive = null;
        if (param0 != -64) {
            ClientSessionSnapshot var2 = (ClientSessionSnapshot) null;
            ki.a((ClientSessionSnapshot) null, -13);
        }
    }

    final static void a(int param0) {
        AccountCreationDialog.a(ResourceArchive.field_i, (byte) -61, true, ByteStorage.field_a);
        int var1 = -30 % ((param0 + 30) / 36);
        mi.field_I = true;
    }

    static {
        field_c = new Sprite(540, 140);
        fullscreenNonmemberText = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        js5ConnectErrorText = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
