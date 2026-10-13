/*
 * Decompiled by CFR-JS 0.4.0.
 */
class CircleBody extends MovingBody {
    static volatile boolean liveFocus;
    static String field_q;
    static String field_s;
    static RgbSprite[][] field_t;
    int radius256;
    static ReportAbuseDialog reportAbuseDialog;

    CircleBody(int x256, int y256, int velocityX256, int velocityY256, int radius256, int typeId) {
        super(x256, y256, velocityX256, velocityY256, typeId);
        this.radius256 = radius256;
    }

    public static void d(byte param0) {
        field_s = null;
        field_t = (RgbSprite[][]) null;
        int var1 = -78 % ((-14 - param0) / 61);
        field_q = null;
        reportAbuseDialog = null;
    }

    int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 79) {
            reportAbuseDialog = (ReportAbuseDialog) null;
          }
          stackIn_3_0 = this.radius256 + 1365 << 6 ^ super.computeSyncChecksum(89, diagnostics);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("no.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        liveFocus = true;
        field_q = "Unfortunately you are not eligible to create an account.";
        field_s = "Chat is currently disabled.";
    }
}
