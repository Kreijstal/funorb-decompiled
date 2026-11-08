/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionSeedHelpers {
    static String field_d;
    static TypeCode field_e;
    static String field_a;
    static int field_f;
    static String field_c;
    static IconTextComponent[][] field_b;

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 == 0) {
          field_b = (IconTextComponent[][]) null;
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        }
        field_b = (IconTextComponent[][]) null;
        field_b = (IconTextComponent[][]) null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    final static void persistSessionSeedBytes(int param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 0) {
            return;
          }
          if (null != SocialListEntry.field_Ib) {
            try {
              SocialListEntry.field_Ib.seek(0L, 0);
              SocialListEntry.field_Ib.write(ProgressMessageDialog.field_qb.position, ProgressMessageDialog.field_qb.payload, 24, param0 ^ 0);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
            }
          }
          ProgressMessageDialog.field_qb.position = ProgressMessageDialog.field_qb.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static AsyncCheckResult createEmailCheckResult(String param0, boolean param1) {
        RuntimeException var2 = null;
        String var3 = null;
        AsyncCheckResult stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var3 = (String) null;
            SessionSeedHelpers.createEmailCheckResult((String) null, false);
          }
          stackIn_3_0 = new AsyncCheckResult(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("oe.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "All players have left <%0>'s game.";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_c = "Reject <%0> from this game";
        field_e = new TypeCode(15, 0, 1, 0);
    }
}
