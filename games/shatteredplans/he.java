/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends oh {
    static String field_l;
    static bi field_h;
    static String field_q;
    static String field_m;
    static String field_n;
    int field_k;
    static String field_j;
    static String field_o;
    static int[] field_i;
    static fb field_p;

    final static void a(int param0, String param1) {
        try {
            oo.a(param1, (byte) -70);
            fk.a(rg.field_c, 72, false);
            if (param0 != 8192) {
                String var3 = (String) null;
                he.a(62, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "he.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, long param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                Thread.sleep(param1);
                if (param0) {
                  break L0;
                } else {
                  field_i = (int[]) null;
                  return;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_m = null;
        field_p = null;
        if (param0 != 23811) {
          return;
        } else {
          field_n = null;
          field_l = null;
          field_j = null;
          field_i = null;
          field_h = null;
          field_o = null;
          return;
        }
    }

    he(int param0) {
        this.field_k = param0;
    }

    static {
        field_l = "Resigned";
        field_j = "Yes";
        field_n = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_o = "Type your password again to make sure it's correct";
        field_q = "<%0>'s game";
        field_m = "Only show game chat from my friends";
        field_i = new int[8192];
    }
}
