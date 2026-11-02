/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateValiditySupport {
    static int viewportHeight;
    static boolean[] field_d;
    static String field_c;
    static java.security.SecureRandom field_b;

    public static void releaseStatics(int obfuscationGuard) {
        field_b = null;
        field_d = null;
        if (obfuscationGuard != -1) {
          DateValiditySupport.releaseStatics(5);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static boolean isValidDate(int year, int obfuscationGuard, int monthIndex, int day) {
        if (monthIndex < 0) {
          return false;
        }
        if (monthIndex > 11) {
          return false;
        }
        if (obfuscationGuard != -24375) {
          return true;
        }
        if (1 <= day &&
          day <= CalendarSupport.getDaysInMonth((byte) -84, monthIndex, year)) {
          return true;
        }
        return false;
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 23678) {
            DateValiditySupport.releaseStatics(4);
          }
          ViewportManager.detachKeyboard((java.awt.Component) ((Object) param0), (byte) 35);
          dc.detachPointerInput((java.awt.Component) ((Object) param0), -37);
          if (CampaignMission.field_I == null) {
            return;
          }
          CampaignMission.field_I.detach((java.awt.Component) ((Object) param0), true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("dt.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "Quit to website";
    }
}
