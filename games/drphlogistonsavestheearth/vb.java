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

    public static void d(int param0) {
        if (param0 != 4) {
            field_o = 127;
            field_q = null;
            field_s = null;
            return;
        }
        field_q = null;
        field_s = null;
    }

    final static oi a(byte param0) {
        try {
            Throwable var1 = null;
            Object stackIn_2_0 = null;
            oi stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            oi stackOut_3_0 = null;
            try {
              if (param0 == 65) {
                return (oi) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              stackOut_3_0 = (oi) Class.forName("mc").newInstance();
              stackIn_4_0 = stackOut_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
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
