/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidationSource implements ValidationSource {
    static int[] rankingWinRateThousandths;
    static String field_e;
    private long lastEditMillis;
    static QuickChatCategoryRegistry quickChatCategories;
    static String field_d;
    static int field_a;

    public final String getValidationMessage(int obfuscationGuard) {
        int var2 = -4 / ((-23 - obfuscationGuard) / 56);
        if (this.isIncomplete((byte) -119)) {
          return null;
        }
        if (MonotonicTime.nowMillis(false) >= (350L + this.lastEditMillis)) {
          return this.computeValidationMessage(28600);
        }
        return null;
    }

    public final void markEdited(boolean obfuscationGuard) {
        this.lastEditMillis = MonotonicTime.nowMillis(obfuscationGuard);
    }

    public static void d(int param0) {
        quickChatCategories = null;
        field_e = null;
        rankingWinRateThousandths = null;
        field_d = null;
        if (param0 != 31366) {
          DebouncedValidationSource.d(-12);
        }
    }

    abstract ValidationStatus computeValidationStatus(int obfuscationGuard);

    abstract String computeValidationMessage(int obfuscationGuard);

    public final ValidationStatus getValidationStatus(byte obfuscationGuard) {
        if (this.isIncomplete((byte) -44)) {
          return uo.validationEmpty;
        }
        if (obfuscationGuard != -31) {
          DebouncedValidationSource.d(100);
          if (MonotonicTime.nowMillis(false) >= this.lastEditMillis + 350L) {
            return this.computeValidationStatus(4);
          }
          return ConditionalTextValue.validationDebouncing;
        }
        if (MonotonicTime.nowMillis(false) >= this.lastEditMillis + 350L) {
          return this.computeValidationStatus(4);
        }
        return ConditionalTextValue.validationDebouncing;
    }

    final static Class resolveReflectionType(String typeName, boolean obfuscationGuard) throws ClassNotFoundException {
        RuntimeException failure = null;
        Class byteType = null;
        Class intType = null;
        Class shortType = null;
        Class longType = null;
        Class disabledResult = null;
        Class booleanType = null;
        Class floatType = null;
        Class doubleType = null;
        Class charType = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String typeSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (typeName.equals("B")) {
            byteType = Byte.TYPE;
            return byteType;
          }
          if (typeName.equals("I")) {
            intType = Integer.TYPE;
            return intType;
          }
          if (typeName.equals("S")) {
            shortType = Short.TYPE;
            return shortType;
          }
          if (typeName.equals("J")) {
            longType = Long.TYPE;
            return longType;
          }
          if (!obfuscationGuard) {
            disabledResult = (Class) null;
            return disabledResult;
          }
          if (typeName.equals("Z")) {
            booleanType = Boolean.TYPE;
            return booleanType;
          }
          if (typeName.equals("F")) {
            floatType = Float.TYPE;
            return floatType;
          }
          if (typeName.equals("D")) {
            doubleType = Double.TYPE;
            return doubleType;
          }
          if (!typeName.equals("C")) {
            return Class.forName(typeName);
          }
          charType = Character.TYPE;
          return charType;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("pj.J(");
          if (typeName == null) {
            typeSummary = "null";
          } else {
            typeSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(typeSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_d = "Score";
        field_e = "Return to game";
    }
}
