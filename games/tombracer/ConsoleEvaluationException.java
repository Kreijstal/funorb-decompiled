/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleEvaluationException extends Exception {
    String field_b;
    static int field_a;
    static UiComponent field_c;

    public static void releaseStatics(int param0) {
        if (param0 != -31950) {
          field_c = (UiComponent) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    ConsoleEvaluationException(String param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "rv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
