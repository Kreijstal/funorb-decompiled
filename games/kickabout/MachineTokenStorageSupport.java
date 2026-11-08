/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MachineTokenStorageSupport {
    static QuickChatCommandType field_c;
    static String field_f;
    static MatchScreen field_e;
    static boolean field_b;
    static String field_g;
    static String[][] field_a;
    static UiLayoutNode field_d;

    final static void storeMachineToken(byte param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 114) {
            field_a = (String[][]) null;
          }
          if (LoginForm.field_G != null) {
            try {
              LoginForm.field_G.a((byte) 4, 0L);
              LoginForm.field_G.a(ByteArrayPool.field_e.field_n, param0 + 12, 24, ByteArrayPool.field_e.field_f);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              ByteArrayPool.field_e.field_n = ByteArrayPool.field_e.field_n + 24;
              return;
            }
          }
          ByteArrayPool.field_e.field_n = ByteArrayPool.field_e.field_n + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_g = null;
        field_f = null;
        field_a = (String[][]) null;
        field_e = null;
        if (param0 >= 118) {
          field_c = null;
          return;
        }
        MachineTokenStorageSupport.releaseStatics(75);
        field_c = null;
    }

    static {
        field_c = new QuickChatCommandType(2, 4, 4, 0);
        field_g = "Yes";
        field_f = "Buyout is off";
    }
}
