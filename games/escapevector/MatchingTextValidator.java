/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingTextValidator extends TextFieldValidator {
    static String[] field_n;
    private EditableTextWidget matchingField;

    public static void releaseStatics(int guard) {
        if (guard != -17318) {
          return;
        }
        field_n = null;
    }

    final String messageForText(byte guard, String text) {
        String stackIn_18_2 = null;
        try {
          if (this.matchingField instanceof ValidationProvider) {
            ValidationSource var3 = ((ValidationProvider) ((Object) this.matchingField)).validator((byte) -89);
            if (var3 != null) {
              if (var3.validationState(17124) == IsaacRandom.field_h &&
                !text.equals(this.matchingField.text)) {
                String stackIn_7_0 = LegacyMenuColumn.field_n;
                return stackIn_7_0;
              }
              String stackIn_9_0 = var3.validationMessage(54);
              return stackIn_9_0;
            }
          }
          int var3_int = 126 % ((10 - guard) / 51);
          if (text.equals(this.matchingField.text)) {
            return null;
          }
          String stackIn_13_0 = LegacyMenuColumn.field_n;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var3_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("lb.L(").append(guard).append(',');
          if (text == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final ValidationState validateText(int guard, String text) {
        ValidationState stackIn_10_0 = null;
        String stackIn_14_2 = null;
        try {
          if (guard != -1) {
            field_n = (String[]) null;
          }
          if (this.matchingField instanceof ValidationProvider) {
            ValidationSource var3 = ((ValidationProvider) ((Object) this.matchingField)).validator((byte) -89);
            if (var3 != null &&
              var3.validationState(17124) != IsaacRandom.field_h) {
              ValidationState stackIn_6_0 = ArchiveProvider.field_a;
              return stackIn_6_0;
            }
          }
          if (text.equals(this.matchingField.text)) {
            stackIn_10_0 = IsaacRandom.field_h;
          } else {
            stackIn_10_0 = ArchiveProvider.field_a;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("lb.G(").append(guard).append(',');
          if (text == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static int bitwiseOr(int left, int right) {
        return left | right;
    }

    final static boolean containsNonAsciiAlphanumeric(byte guard, String text) {
        String stackIn_16_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (guard > -1) {
            field_n = (String[]) null;
          }
          for (int var2_int = 0; var2_int < text.length(); var2_int++) {
            int var3 = text.charAt(var2_int);
            if (!SpriteDecodeSupport.isAsciiLetter((char) var3, (byte) 103) &&
              !IntroAudioSupport.isAsciiDigit((char) var3, false)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var2;
          StringBuilder stackIn_15_1 = new StringBuilder().append("lb.K(").append(guard).append(',');
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    MatchingTextValidator(EditableTextWidget field, EditableTextWidget matchingField) {
        super(field);
        try {
          this.matchingField = matchingField;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "lb.<init>(" + (field != null ? "{...}" : "null") + ',' + (matchingField != null ? "{...}" : "null") + ')');
        }
    }

    final static void releaseMouseHandler(boolean guard) {
        Throwable decompiledCaughtException = null;
        if (QuickChatDynamicCommand.mouseHandler != null) {
          Object var1 = QuickChatDynamicCommand.mouseHandler;
          synchronized (var1) {
            QuickChatDynamicCommand.mouseHandler = null;
          }
        }
        if (!guard) {
          field_n = (String[]) null;
        }
    }

    final static void setPendingDisplayName(int guard, String displayName) {
        try {
          SimulatorSpriteAssets.pendingDisplayName = displayName;
          if (guard != -10002) {
            field_n = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "lb.F(" + guard + ',' + (displayName != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawOutlinedTitle(int y, String text, int color, int guard, int x) {
        LoginHandshakeSupport.field_b.bindAsFramebuffer();
        SoftwareRasterizer.clearFramebuffer();
        ByteStorage.gameFont.drawCentered(text, 160, 22, color, -1);
        AlphaContainer.field_D.bindRaster(122);
        MeshProjectionSupport.markSpriteEdges(LoginHandshakeSupport.field_b, true, 1);
        if (guard > -109) {
          return;
        }
        try {
          LoginHandshakeSupport.field_b.addOutline(5267536);
          LoginHandshakeSupport.field_b.drawTransparent(x - 160, -22 + y);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "lb.I(" + y + ',' + (text != null ? "{...}" : "null") + ',' + color + ',' + guard + ',' + x + ')');
        }
    }

    static {
        field_n = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
