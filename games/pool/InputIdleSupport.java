/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputIdleSupport {
    static int[] field_d;
    static ResourceArchive field_a;
    static ScrollPaneWithFooter field_c;
    static String mbExclusive2;

    final static boolean isCaretBlinkOn(byte obfuscationGuard) {
        if (obfuscationGuard <= 72) {
          mbExclusive2 = (String) null;
          if (!AccountCreationDialog.m(0)) {
            return false;
          }
          if ((SocialListEntry.field_Tb & 8) == 0) {
            return true;
          }
          return false;
        }
        if (!AccountCreationDialog.m(0)) {
          return false;
        }
        if ((SocialListEntry.field_Tb & 8) == 0) {
          return true;
        }
        return false;
    }

    final static void resetInputIdleTimer(boolean param0) {
        VerticalScrollbar.field_Pb = MonotonicClock.monotonicTimeMillis((byte) -121);
        CachedArchiveSource.field_j = 0;
        if (param0) {
          field_a = (ResourceArchive) null;
        }
    }

    final static long crc64(byte[] param0, byte param1, int param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        long stackIn_3_0 = 0L;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -83) {
            var4 = (byte[]) null;
            InputIdleSupport.crc64((byte[]) null, (byte) 105, 91);
          }
          stackIn_3_0 = ProxyConnectorSupport.crc64(param0, param2, 0, 154302664);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cp.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        mbExclusive2 = null;
        if (!param0) {
          field_c = (ScrollPaneWithFooter) null;
        }
    }

    static {
        mbExclusive2 = "members-only content";
    }
}
