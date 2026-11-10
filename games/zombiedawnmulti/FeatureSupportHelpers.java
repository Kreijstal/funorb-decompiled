/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FeatureSupportHelpers {
    static TextValidationFailure field_e;
    static String field_c;
    static int field_f;
    static Sprite field_d;
    static String field_a;
    static int field_b;

    final static void resetFeatureMask(byte param0) {
        EffectAudioHelpers.field_d = 0;
        if (param0 <= 29) {
          FeatureSupportHelpers.resetFeatureMask((byte) -128);
        }
    }

    final static boolean hasPlatformFullscreenSupport(ResourceArchive param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_f = -48;
          }
          stackIn_3_0 = param0.areAllGroupsAvailable(0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jo.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_e = null;
        if (param0) {
          return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        field_e = new TextValidationFailure();
        field_a = "";
        field_c = "Join <%0>'s game";
    }
}
