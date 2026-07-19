/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm extends ne {
    int field_i;
    int field_j;
    static ad field_l;
    static int field_p;
    static String field_o;
    static String[] field_k;
    static int field_m;
    static String field_n;

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_n = null;
        if (param0 < 104) {
            return;
        }
        field_o = null;
    }

    final static nl a(byte param0) {
        try {
            Throwable var1 = null;
            nl stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            nl stackOut_2_0 = null;
            L0: {
              if (param0 > 83) {
                break L0;
              } else {
                field_l = (ad) null;
                break L0;
              }
            }
            try {
              L1: {
                stackOut_2_0 = (nl) (Class.forName("sk").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private pm() throws Throwable {
        throw new Error();
    }

    static {
        field_l = new ad(12, 0, 1, 0);
        field_p = 0;
        field_k = new String[]{"Fickle", "The <%0> will allow himself to be bound only to the greatest souls. Should you prove your inadequacy by failing any raid, he will abandon you and advance the power of chaos with one of your more worthy rivals."};
        field_n = "Dodge";
        field_o = "Return to the main menu without saving changes";
    }
}
