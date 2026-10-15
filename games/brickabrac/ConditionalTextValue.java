/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConditionalTextValue {
    private String text;
    static boolean field_a;
    static int field_j;
    static String field_k;
    static int specialMusicPreparationStage;
    static int field_b;
    static int field_h;
    private boolean included;
    static String field_d;
    static ValidationStatus validationDebouncing;
    static MidiSynthesizer musicSynthesizer;
    static String field_e;

    final static boolean a(int param0) {
        if (param0 != 2) {
          field_h = 108;
          if (ParallaxMusicHelpers.field_b == null) {
            return false;
          }
          if (null != ParallaxMusicHelpers.field_b.getTopVisibleLayer(-113)) {
            return true;
          }
          return false;
        }
        if (ParallaxMusicHelpers.field_b == null) {
          return false;
        }
        if (null != ParallaxMusicHelpers.field_b.getTopVisibleLayer(-113)) {
          return true;
        }
        return false;
    }

    final static boolean isNameCharacter(boolean obfuscationGuard, char character) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (Character.isISOControl(character)) {
            return false;
          }
          if (AlignedIconLabel.isAsciiAlphanumeric((byte) -125, character)) {
            return true;
          }
          if (!obfuscationGuard) {
            ConditionalTextValue.a(-100);
          }
          var6 = ce.nameCharacterExtensions;
          var2 = var6;
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (~character == ~var4) {
              return true;
            }
          }
          var2Lifetime1 = IntrusiveHashTable.nameSyntaxCharacters;
          var3Lifetime1 = 0;
          while (true) {
            if (var2Lifetime1.length <= var3Lifetime1) {
              return false;
            }
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 != character) {
              var3Lifetime1++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "m.D(" + obfuscationGuard + ',' + character + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!MatchResultScreen.field_s) {
            return false;
          }
          if (ng.quickChatChannel == 2 &&
            QuickChatHelpDialog.field_Qb != null) {
            var3 = (CharSequence) ((Object) param1);
            if (QuickChatHelpDialog.field_Qb.equals(ChatMessage.normalizePlayerName(var3, param0 - 13073))) {
              if (param0 == 13134) {
                return true;
              }
              field_e = (String) null;
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("m.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ConditionalTextValue(String text) {
        this(text, false);
    }

    public static void c(int param0) {
        field_d = null;
        field_k = null;
        if (param0 == 2) {
          musicSynthesizer = null;
          field_e = null;
          validationDebouncing = null;
          return;
        }
        ConditionalTextValue.c(1);
        musicSynthesizer = null;
        field_e = null;
        validationDebouncing = null;
    }

    final String getText(int obfuscationGuard) {
        if (obfuscationGuard != 2) {
          field_k = (String) null;
          return this.text;
        }
        return this.text;
    }

    final boolean isIncluded(byte obfuscationGuard) {
        if (obfuscationGuard <= 24) {
          field_k = (String) null;
          return this.included;
        }
        return this.included;
    }

    ConditionalTextValue(String text, boolean included) {
        RuntimeException constructorFailure = null;
        boolean includedValue = false;
        RuntimeException contextFailure = null;
        StringBuilder contextPrefix = null;
        String textArgumentSummary = null;
        RuntimeException caughtFailure = null;
        try {
          this.text = text;
          if (null == this.text) {
            this.text = "";
          }
          includedValue = (included);
          this.included = includedValue;
          if (this.text.length() != 0) {
            return;
          }
          this.included = false;
          return;
        } catch (java.lang.RuntimeException caughtConstructorFailure) {
          caughtFailure = caughtConstructorFailure;
          constructorFailure = caughtFailure;
          contextFailure = constructorFailure;
          contextPrefix = new StringBuilder().append("m.<init>(");
          if (text == null) {
            textArgumentSummary = "null";
          } else {
            textArgumentSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) contextFailure), ((StringBuilder) (Object) contextPrefix).append(textArgumentSummary).append(',').append(included).append(')').toString());
        }
    }

    static {
        specialMusicPreparationStage = 0;
        field_k = "Loading fonts";
        field_d = "Unfortunately we are unable to create an account for you at this time.";
        field_e = "Visit the Account Management section on the main site to view.";
        validationDebouncing = new ValidationStatus();
    }
}
