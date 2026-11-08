/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static String accountCreatedSuccessfullyText;
    IntrusiveDeque field_d;
    static ToolkitSprite field_c;
    static int field_a;
    int field_e;

    final static String a(int param0, boolean param1, int param2) {
        if (param1) {
          return param0 + "/" + param2;
        }
        vl.releaseStatics((byte) -39);
        return param0 + "/" + param2;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 != 113) {
          return;
        }
        accountCreatedSuccessfullyText = null;
    }

    vl(IntrusiveDeque param0, int param1) {
        try {
          this.field_d = param0;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "vl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        accountCreatedSuccessfullyText = "Account created successfully!";
    }
}
