/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerValidationHelpers {
    static String field_b;
    static String field_c;
    static int collisionFace;
    static UiComponent field_d;

    final static WidgetTheme getSharedWidgetTheme(byte obfuscationGuard) {
        int cachedGuardCalculation = 0;
        int createdGuardCalculation;
        if (null != MouseInput.sharedWidgetTheme) {
          cachedGuardCalculation = 89 / ((obfuscationGuard - 32) / 44);
          return MouseInput.sharedWidgetTheme;
        }
        MouseInput.sharedWidgetTheme = new WidgetTheme();
        MouseInput.sharedWidgetTheme.a(ArchiveNetworkClient.field_u, 13421772);
        MouseInput.sharedWidgetTheme.field_p = 2763306;
        MouseInput.sharedWidgetTheme.field_h = 6;
        MouseInput.sharedWidgetTheme.field_a = 4;
        MouseInput.sharedWidgetTheme.field_g = 0;
        MouseInput.sharedWidgetTheme.field_f = 5;
        MouseInput.sharedWidgetTheme.field_j = 7697781;
        MouseInput.sharedWidgetTheme.field_m = 14;
        MouseInput.sharedWidgetTheme.font = QuickChatMenu.field_Yb;
        createdGuardCalculation = 89 / ((obfuscationGuard - 32) / 44);
        return MouseInput.sharedWidgetTheme;
    }

    final static boolean isAsciiInt(boolean allowLeadingPlus, int obfuscationGuard, CharSequence text, int radix) {
        int characterIndex = 0;
        int hasDigitResult = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String textSummary = null;
        RuntimeException caughtFailure = null;
        int guardCalculation = 0;
        RuntimeException failure = null;
        int negativeFlag = 0;
        int hasDigitFlag = 0;
        int value = 0;
        int length = 0;
        int digit = 0;
        int nextValue = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          guardCalculation = -59 / ((obfuscationGuard - 40) / 63);
          if (radix >= 2 &&
            radix <= 36) {
            negativeFlag = 0;
            hasDigitFlag = 0;
            value = 0;
            length = text.length();
            for (characterIndex = 0; length > characterIndex; characterIndex++) {
              boolean processDigit = true;
              digit = text.charAt(characterIndex);
              if ((characterIndex == 0) &&
                (digit == 45)) {
                negativeFlag = 1;
                processDigit = false;
              }
              if ((processDigit) && (characterIndex != 0 || (digit != 43 ||
                !allowLeadingPlus))) {
                if (digit >= 48 &&
                  digit <= 57) {
                  digit -= 48;
                } else if (digit >= 65 &&
                  digit <= 90) {
                  digit -= 55;
                } else if (digit >= 97 &&
                  digit <= 122) {
                  digit -= 87;
                } else {
                  return false;
                }
                if (radix <= digit) {
                  return false;
                }
                if (negativeFlag != 0) {
                  digit = -digit;
                }
                nextValue = digit + value * radix;
                if (value != nextValue / radix) {
                  return false;
                }
                value = nextValue;
                hasDigitFlag = 1;
              }
            }
            hasDigitResult = hasDigitFlag;
            return hasDigitResult != 0;
          }
          throw new IllegalArgumentException("" + radix);
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("sh.C(").append(allowLeadingPlus).append(',').append(obfuscationGuard).append(',');
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(textSummary).append(',').append(radix).append(')').toString());
        }
    }

    final static void refreshReportedHeapLimit(int obfuscationGuard) {
        try {
          Throwable caughtFailure = null;
          java.lang.reflect.Method maxMemoryMethod = null;
          Exception lookupFailure = null;
          Runtime runtime = null;
          Throwable invocationFailure = null;
          Long maxMemoryBytes = null;
          Object[] unusedArguments = null;
          try {
            if (obfuscationGuard != 1) {
              field_b = (String) null;
            }
            maxMemoryMethod = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (maxMemoryMethod != null) {
              try {
                runtime = Runtime.getRuntime();
                unusedArguments = (Object[]) null;
                maxMemoryBytes = (Long) (maxMemoryMethod.invoke((Object) (runtime), (Object[]) null));
                ValidationStatus.reportedHeapLimitMiB = 1 + (int)(maxMemoryBytes.longValue() / 1048576L);
                return;
              } catch (java.lang.Throwable caughtInvocationFailure) {
                caughtFailure = caughtInvocationFailure;
                invocationFailure = caughtFailure;
              }
            }
          } catch (java.lang.Exception caughtLookupFailure) {
            caughtFailure = caughtLookupFailure;
            lookupFailure = (Exception) (Object) caughtFailure;
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 <= 110) {
          field_d = (UiComponent) null;
        }
    }

    static {
        field_c = "More suggestions";
        field_b = "Encouraging rule breaking";
    }
}
