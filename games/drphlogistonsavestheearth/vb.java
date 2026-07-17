/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends gi {
    long[][] field_j;
    static sa field_q;
    static int field_k;
    int field_m;
    String[][] field_p;
    boolean field_r;
    static int field_l;
    static nh field_s;
    int field_i;
    static int field_n;
    int field_h;
    int[][] field_t;
    static int field_o;

    public static void d() {
        field_q = null;
        field_s = null;
    }

    final static oi a() {
        try {
            Throwable var1 = null;
            oi stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            oi stackOut_2_0 = null;
            try {
              L0: {
                stackOut_2_0 = (oi) Class.forName("mc").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L0;
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

    vb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new sa(6, 0, 4, 2);
        field_l = 0;
        field_k = 200;
    }
}
