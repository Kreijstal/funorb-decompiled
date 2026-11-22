/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends IntrusiveNode {
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

    final static MouseWheelInput createMouseWheelInput(byte param0) {
        try {
          Throwable var1 = null;
          MouseWheelInput stackIn_2_0 = null;
          MouseWheelInput stackIn_4_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 == 65) {
              stackIn_4_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
              return stackIn_4_0;
            }
            stackIn_2_0 = (MouseWheelInput) null;
            return stackIn_2_0;
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

    vb() {
    }

    static {
        field_q = new sa(6, 0, 4, 2);
        field_l = 0;
        field_k = 200;
    }
}
