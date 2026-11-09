/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArenaDefinition {
    static String accountCreatedSuccessfullyText;
    IntrusiveDeque pads;
    static ToolkitSprite field_c;
    static int field_a;
    int levelId;

    final static String formatFraction(int numerator, boolean guard, int denominator) {
        if (guard) {
          return numerator + "/" + denominator;
        }
        ArenaDefinition.releaseStatics((byte) -39);
        return numerator + "/" + denominator;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 != 113) {
          return;
        }
        accountCreatedSuccessfullyText = null;
    }

    ArenaDefinition(IntrusiveDeque pads, int levelId) {
        try {
          this.pads = pads;
          this.levelId = levelId;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "vl.<init>(" + (pads != null ? "{...}" : "null") + ',' + levelId + ')');
        }
    }

    static {
        accountCreatedSuccessfullyText = "Account created successfully!";
    }
}
