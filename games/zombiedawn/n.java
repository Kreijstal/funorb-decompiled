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
        if (param0 != 128) {
          field_k = (int[]) null;
          field_r = null;
          return;
        }
        field_r = null;
    }

    final static uc c(byte param0) {
        try {
          Throwable var1 = null;
          uc stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 < 81) {
              n.a(8);
            }
            stackIn_3_0 = (uc) (Class.forName("ol").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    n() {
    }

    static {
        field_k = new int[]{128, 128, 128, 128};
    }
}
