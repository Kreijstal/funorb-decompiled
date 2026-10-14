/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidationSource implements ValidationSource {
    static int[] rankingWinRateThousandths;
    static String field_e;
    private long lastEditMillis;
    static so field_c;
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
        field_c = null;
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
          return m.validationDebouncing;
        }
        if (MonotonicTime.nowMillis(false) >= this.lastEditMillis + 350L) {
          return this.computeValidationStatus(4);
        }
        return m.validationDebouncing;
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param0.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param0.equals("S")) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (param0.equals("J")) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (!param1) {
            stackIn_18_0 = (Class) null;
            return stackIn_18_0;
          }
          if (param0.equals("Z")) {
            stackIn_22_0 = Boolean.TYPE;
            return stackIn_22_0;
          }
          if (param0.equals("F")) {
            stackIn_25_0 = Float.TYPE;
            return stackIn_25_0;
          }
          if (param0.equals("D")) {
            stackIn_29_0 = Double.TYPE;
            return stackIn_29_0;
          }
          if (!param0.equals("C")) {
            return Class.forName(param0);
          }
          stackIn_33_0 = Character.TYPE;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("pj.J(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "Score";
        field_e = "Return to game";
    }
}
