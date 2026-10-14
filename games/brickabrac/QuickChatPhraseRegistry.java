/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseRegistry {
    private ResourceArchive extendedArchive;
    static FullscreenFailureKind fullscreenTimeout;
    static String[] field_b;
    private to definitions;
    static String[] field_k;
    static int field_a;
    static UiComponent field_e;
    private ResourceArchive standardArchive;
    static RgbSprite chocolateFarSprite;
    static int[] field_g;
    static UiComponent field_c;

    final QuickChatPhraseDefinition getDefinition(int phraseId, boolean obfuscationGuard) {
        byte[] data = null;
        QuickChatPhraseDefinition definition = (QuickChatPhraseDefinition) (this.definitions.a((long)phraseId, obfuscationGuard));
        if (definition != null) {
          return definition;
        }
        if (phraseId < 32768) {
          data = this.standardArchive.takeFile(phraseId, 1, 4);
        } else {
          data = this.extendedArchive.takeFile(phraseId & 32767, 1, 4);
        }
        definition = new QuickChatPhraseDefinition();
        if (data != null) {
          definition.decode(new PacketBuffer(data), -3);
        }
        if (phraseId >= 32768) {
          definition.markExtendedLinks(-126);
          this.definitions.a(84, definition, (long)phraseId);
          if (!obfuscationGuard) {
            this.getDefinition(120, false);
            return definition;
          }
          return definition;
        }
        this.definitions.a(84, definition, (long)phraseId);
        if (obfuscationGuard) {
          return definition;
        }
        this.getDefinition(120, false);
        return definition;
    }

    final static boolean a(ResourceArchive param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 45) {
            fullscreenTimeout = (FullscreenFailureKind) null;
          }
          stackIn_3_0 = param0.ensureAllGroupsAvailable(96);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rg.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        fullscreenTimeout = null;
        field_e = null;
        field_c = null;
        chocolateFarSprite = null;
        field_b = null;
        field_k = null;
        if (param0 != 64) {
          QuickChatPhraseRegistry.a(-104);
        }
    }

    QuickChatPhraseRegistry(int unusedOption, ResourceArchive standardArchive, ResourceArchive extendedArchive, bp unusedContext) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.definitions = new to(64);
        try {
          this.standardArchive = standardArchive;
          this.extendedArchive = extendedArchive;
          if (this.standardArchive != null) {
            this.standardArchive.getFileCapacity(-123, 1);
          }
          if (this.extendedArchive == null) {
            return;
          }
          this.extendedArchive.getFileCapacity(-124, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rg.<init>(").append(unusedOption).append(',');
          if (standardArchive == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (extendedArchive == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (unusedContext == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_a = 22;
        fullscreenTimeout = new FullscreenFailureKind();
        field_g = new int[4];
    }
}
