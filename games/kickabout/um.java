/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static ff field_c;
    static String field_f;
    static ap field_e;
    static boolean field_b;
    static String field_g;
    static String[][] field_a;
    static hd field_d;

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (pd.field_G != null) {
              try {
                L0: {
                  pd.field_G.a((byte) 4, 0L);
                  pd.field_G.a(un.field_e.field_n, 126, 24, un.field_e.field_f);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                un.field_e.field_n = un.field_e.field_n + 24;
                return;
              }
              un.field_e.field_n = un.field_e.field_n + 24;
              return;
            } else {
              un.field_e.field_n = un.field_e.field_n + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_f = null;
        field_a = null;
        field_e = null;
        if (param0 < 118) {
          um.a(75);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ff(2, 4, 4, 0);
        field_g = "Yes";
        field_f = "Buyout is off";
    }
}
