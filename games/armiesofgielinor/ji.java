/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String field_a;
    static String field_b;
    static int[] field_c;

    final static AccountNameCheckResult pollAccountNameCheck(int obfuscationGuard, String name) {
        RuntimeException failure = null;
        Object pendingResult = null;
        Object queuedResult = null;
        AccountNameCheckResult completedResult = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 0) {
            field_c = (int[]) null;
          }
          if (mh.accountNameCheckState == du.nameCheckPending) {
            pendingResult = null;
            return (AccountNameCheckResult) (pendingResult);
          }
          if (mh.accountNameCheckState == lm.nameCheckComplete &&
            name.equals(AgeValidator.requestedAccountName)) {
            mh.accountNameCheckState = nb.nameCheckResultConsumed;
            completedResult = EmailValidator.accountNameCheckResult;
            return completedResult;
          }
          AgeValidator.requestedAccountName = name;
          mh.accountNameCheckState = du.nameCheckPending;
          EmailValidator.accountNameCheckResult = null;
          queuedResult = null;
          return (AccountNameCheckResult) (queuedResult);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_14_0 = failure;
          stackIn_14_1 = new StringBuilder().append("ji.B(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static BitmapTextWidgetPainter a(boolean param0) {
        if (param0) {
          if (VertexNormal.field_f == null) {
            VertexNormal.field_f = new BitmapTextWidgetPainter(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.maxAscent, -1, 2147483647, true);
          }
          return VertexNormal.field_f;
        }
        ji.a(false);
        if (VertexNormal.field_f == null) {
          VertexNormal.field_f = new BitmapTextWidgetPainter(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.maxAscent, -1, 2147483647, true);
        }
        return VertexNormal.field_f;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          field_b = (String) null;
        }
    }

    static {
        field_a = "This item can only be used on your own units.";
        field_b = "Set up new game";
        field_c = new int[8192];
    }
}
