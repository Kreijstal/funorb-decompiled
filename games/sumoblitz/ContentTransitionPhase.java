/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContentTransitionPhase {
    static IntrusiveDeque field_c;
    static int[] field_d;
    static int[] field_f;
    static int[] field_e;
    static String thisIsAHiddenText;
    static String waitingForInstrumentsText;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean isDecimalInteger(int guard, CharSequence text) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -13181) {
            ContentTransitionPhase.a(74, (byte) -66, -15);
          }
          stackIn_3_0 = LegacyOpenGlUnlitEffect.a(10, text, -46, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jf.B(").append(guard).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 > -85) {
          return true;
        }
        return 0 != (2048 & param0) ? true : false;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 > 78) {
          field_e = null;
          thisIsAHiddenText = null;
          field_d = null;
          waitingForInstrumentsText = null;
          field_f = null;
          return;
        }
        ContentTransitionPhase.releaseStatics((byte) 7);
        field_e = null;
        thisIsAHiddenText = null;
        field_d = null;
        waitingForInstrumentsText = null;
        field_f = null;
    }

    static {
        field_c = new IntrusiveDeque();
        field_d = new int[128];
        field_e = new int[8192];
        thisIsAHiddenText = "This is a hidden Achievement";
        waitingForInstrumentsText = "Waiting for instruments";
    }
}
