/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends le {
    int[] field_q;
    op[] field_m;
    static java.awt.Frame field_p;
    int[] field_h;
    static int[] field_k;
    int field_l;
    int[] field_j;
    static String[] field_r;
    byte[][][] field_i;
    op[] field_n;
    int field_o;

    public static void a(int param0) {
        field_k = null;
        field_p = null;
        field_r = null;
    }

    final static uc c(byte param0) {
        try {
            Throwable var1 = null;
            uc stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            uc stackOut_0_0 = null;
            try {
              L0: {
                stackOut_0_0 = (uc) Class.forName("ol").newInstance();
                stackIn_1_0 = stackOut_0_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_1_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    n() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[]{128, 128, 128, 128};
    }
}
