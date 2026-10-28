/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    int messageIdLow24;
    String text;
    int messageType;
    static IndexedSprite effectOutlineSprite;
    private static int field_d;
    int[] quickChatResponses;
    static IndexedSprite effectSprite;
    private long senderId;
    private int senderRank;
    private String senderName;
    private boolean priorityOverride;
    static int[] spriteOffsetYs;
    int messageIdHigh16;
    static int field_l;

    final int displayPriority(int guard) {
        if (!this.priorityOverride && (2 != this.messageType ||
          this.senderRank <= 0)) {
          if (this.senderId == AchievementTracker.field_l) {
            return 1;
          }
          if (RasterSnapshot.field_g == 2 &&
            AgeValidator.a(this.senderName, 0)) {
            return 1;
          }
          if (guard >= 40) {
            return 0;
          }
          return 89;
        }
        return 2;
    }

    final static void initializeAchievementRules(int start) {
        try {
          int var1_int = ProxySocketConnector.achievementModes.length;
          ProxySocketConnector.achievementRules = new AchievementGrantRule[var1_int];
          for (int var2 = start; var2 < var1_int; var2++) {
            int var3 = ProxySocketConnector.achievementModes[var2];
            int var4 = ProxySocketConnector.achievementMasks[var2];
            int var5 = ProxySocketConnector.achievementCategories[var2];
            AchievementGrantRule var6 = new AchievementGrantRule(var3, var4, var5);
            ProxySocketConnector.achievementRules[var2] = var6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "gi.A(" + start + ')');
        }
    }

    final static void sortIntPairs(int right, int[] values, int guard, int left, int[] keys) {
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          if (guard != 1) {
            int[] var14 = (int[]) null;
            ChatMessage.sortIntPairs(-43, (int[]) null, -42, 84, (int[]) null);
          }
          if (left < right) {
            int var5_int = (right + left) / 2;
            int var6 = left;
            int var7 = keys[var5_int];
            keys[var5_int] = keys[right];
            keys[right] = var7;
            int var8 = values[var5_int];
            values[var5_int] = values[right];
            values[right] = var8;
            int stackIn_7_0 = (var7 != 2147483647) ? 1 : 0;
            int var9 = stackIn_7_0;
            for (int var10 = left; var10 < right; var10++) {
              if (keys[var10] < (var7 + (var9 & var10))) {
                int var11 = keys[var10];
                keys[var10] = keys[var6];
                keys[var6] = var11;
                int var12 = values[var10];
                values[var10] = values[var6];
                values[var6++] = var12;
              }
            }
            keys[right] = keys[var6];
            keys[var6] = var7;
            values[right] = values[var6];
            values[var6] = var8;
            ChatMessage.sortIntPairs(-1 + var6, values, guard ^ 0, left, keys);
            ChatMessage.sortIntPairs(right, values, guard ^ 0, var6 + 1, keys);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var5;
          StringBuilder stackIn_18_1 = new StringBuilder().append("gi.B(").append(right).append(',');
          if (values == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(',').append(left).append(',');
          if (keys == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static int maximumTwentyCharacterWidth(byte guard, BinaryBitmapFont font) {
        String stackIn_8_2 = null;
        try {
          int var2_int = InputGlyphSupport.widestInputGlyph(font, (byte) -127);
          String var3 = ReflectionCheck.repeatChar(guard ^ 16, (char) var2_int, 20);
          if (guard == -96) {
            int stackIn_4_0 = font.stringWidth(var3);
            return stackIn_4_0;
          }
          int stackIn_2_0 = 21;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2;
          StringBuilder stackIn_7_1 = new StringBuilder().append("gi.D(").append(guard).append(',');
          if (font == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        effectSprite = null;
        if (guard != -13885) {
          return;
        }
        effectOutlineSprite = null;
        spriteOffsetYs = null;
    }

    final static void clearFrameOffsets(byte guard) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          if (guard >= -49) {
            return;
          }
          for (int var1_int = 0; var1_int < LoginIdentifierSupport.frameOffsets.length; var1_int++) {
            LoginIdentifierSupport.frameOffsets[var1_int] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "gi.E(" + guard + ')');
        }
    }

    ChatMessage(boolean param0) {
        this.senderName = DualLinkDequeIterator.field_g;
        this.priorityOverride = DualLinkDequeIterator.field_c;
        this.messageIdLow24 = ProxyAuthenticationException.field_a;
        this.messageIdHigh16 = IntKeyLookup.field_d;
        this.senderRank = MarkerSliderPainter.field_g;
        this.text = SelfDestructEffects.field_d;
        this.messageType = DualLinkNode.field_o;
        this.senderId = TextFieldValidator.field_e;
        if (param0) {
          this.quickChatResponses = Checkbox.field_H;
        } else {
          this.quickChatResponses = null;
        }
    }

    static {
        field_d = 398339;
        effectSprite = new IndexedSprite(1, 1, 256);
        for (int var0 = 0; var0 < 256; var0++) {
          effectSprite.field_l[var0] = field_d;
        }
        effectSprite.field_l[0] = 0;
        effectOutlineSprite = new IndexedSprite(3, 3, 256);
        effectOutlineSprite.field_l[1] = 2917671;
    }
}
