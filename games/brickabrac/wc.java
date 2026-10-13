/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static boolean uiPressClaimed;
    static int field_e;
    static boolean field_b;
    static String field_a;
    static String field_c;

    final static void blendHalfRgbSpan(int[] target, int length, int halfRgb, int offset, int obfuscationGuard) {
        int[] targetAlias = null;
        RuntimeException failure = null;
        int pixelIndex = 0;
        int sourceHalfRgb = 0;
        int unusedGameFlag = 0;
        int[] targetStorage = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String targetSummary = null;
        RuntimeException caughtFailure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          while (true) {
            length--;
            if (length < 0) {
              if (obfuscationGuard == -1) {
                return;
              }
              field_a = (String) null;
              return;
            }
            targetStorage = target;
            targetAlias = targetStorage;
            pixelIndex = offset;
            sourceHalfRgb = halfRgb;
            targetStorage[pixelIndex] = sourceHalfRgb + (ik.a(targetStorage[pixelIndex], 16711422) >> 1);
            offset++;
          }
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("wc.C(");
          if (target == null) {
            targetSummary = "null";
          } else {
            targetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(targetSummary).append(',').append(length).append(',').append(halfRgb).append(',').append(offset).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 == -1) {
          ResourceArchive.field_f.a(0, 0, param1 + 1);
          return;
        }
        uiPressClaimed = false;
        ResourceArchive.field_f.a(0, 0, param1 + 1);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 62) {
          field_e = 120;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_a = "Quit to website";
        field_c = "Password: ";
    }
}
