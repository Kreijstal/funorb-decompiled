/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    int badgeId;
    static int receivedChatKeyHigh16;
    static int[] field_i;
    int contextId;
    int messageKeyLow24;
    UiComponent component;
    int[] suggestedPhraseIds;
    static UiComponent[] field_l;
    String senderDisplayName;
    String senderName;
    int channel;
    String contextLabel;
    String text;
    long senderId;
    int messageKeyHigh16;
    static int backgroundVariant;
    boolean systemMessage;

    final static String normalizePlayerName(CharSequence name, int obfuscationGuard) {
        int characterIndex = 0;
        StringBuilder ignoredCharacterAppend = null;
        Object nullNameResult = null;
        Object invalidLengthResult = null;
        Object emptyResult = null;
        String result = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int startIndex = 0;
        RuntimeException var2 = null;
        int endIndex = 0;
        int trimmedLength = 0;
        StringBuilder normalized = null;
        int character = 0;
        int foldedCharacter = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (name == null) {
            nullNameResult = null;
            return (String) (nullNameResult);
          }
          startIndex = 0;
          endIndex = name.length();
          while (startIndex < endIndex) {
            if (IntrusiveHashIterator.isNameSeparator((byte) -9, name.charAt(startIndex))) {
              startIndex++;
              continue;
            }
            break;
          }
          while (endIndex > startIndex) {
            if (IntrusiveHashIterator.isNameSeparator((byte) -9, name.charAt(endIndex - 1))) {
              endIndex--;
              continue;
            }
            break;
          }
          trimmedLength = -startIndex + endIndex;
          if (trimmedLength < 1) {
            return null;
          }
          if (trimmedLength > 12) {
            invalidLengthResult = null;
            return (String) (invalidLengthResult);
          }
          normalized = new StringBuilder(trimmedLength);
          if (obfuscationGuard < 46) {
            ChatMessage.a(-114);
          }
          for (characterIndex = startIndex; characterIndex < endIndex; characterIndex++) {
            character = name.charAt(characterIndex);
            if (ConditionalTextValue.isNameCharacter(true, (char) character)) {
              foldedCharacter = HighscoresScreen.foldPlayerNameCharacter(207, (char) character);
              if (0 != foldedCharacter) {
                ignoredCharacterAppend = normalized.append((char) foldedCharacter);
              }
            }
          }
          if (0 != normalized.length()) {
            result = normalized.toString();
            return result;
          }
          emptyResult = null;
          return (String) (emptyResult);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("gb.C(");
          if (name == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getRetentionCategory(boolean obfuscationGuard) {
        CharSequence var3;
        if (!obfuscationGuard) {
          var3 = (CharSequence) null;
          ChatMessage.normalizePlayerName((CharSequence) null, -7);
        }
        if (!this.systemMessage && (this.channel != 2 ||
          this.badgeId <= 0)) {
          if (this.senderId == Widget.field_p) {
            return 1;
          }
          if (LevelMetadata.field_m == 2 &&
            LevelPack.isFriend(0, this.senderName)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != 0) {
          receivedChatKeyHigh16 = -77;
        }
        field_i = null;
    }

    ChatMessage(boolean includeSuggestedPhrases) {
        this.contextId = MusicVoice.receivedChatContextId;
        this.messageKeyHigh16 = receivedChatKeyHigh16;
        if (includeSuggestedPhrases) {
          this.suggestedPhraseIds = BoundedFile.receivedChatSuggestions;
        } else {
          this.suggestedPhraseIds = null;
        }
        this.senderDisplayName = HalloweenBackground.receivedChatDisplayName;
        this.contextLabel = CacheEntry.receivedChatContextLabel;
        this.badgeId = LobbyUiHelpers.receivedChatBadge;
        this.senderId = BirthDateValidator.receivedChatSenderId;
        this.senderName = RankingSocketHelpers.receivedChatSenderName;
        this.systemMessage = IterableIntrusiveHashTable.receivedChatSystem;
        this.text = ByteArrayPoolHelpers.receivedChatText;
        this.channel = TableQuickChatHelpers.receivedChatChannel;
        this.messageKeyLow24 = LevelCompleteScreen.receivedChatKeyLow24;
    }

    ChatMessage(int channel, String senderName, int contextId, String contextLabel, String text) {
        try {
          this.senderId = 0L;
          this.messageKeyHigh16 = 0;
          this.senderDisplayName = senderName;
          this.suggestedPhraseIds = null;
          this.systemMessage = true;
          this.messageKeyLow24 = 0;
          this.contextLabel = contextLabel;
          this.text = text;
          this.channel = channel;
          this.senderName = senderName;
          this.contextId = contextId;
          this.badgeId = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "gb.<init>(" + channel + ',' + (senderName != null ? "{...}" : "null") + ',' + contextId + ',' + (contextLabel != null ? "{...}" : "null") + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = new int[]{33, 34, 35};
    }
}
