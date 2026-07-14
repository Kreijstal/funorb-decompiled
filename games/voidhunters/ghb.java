/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ghb extends ksa {
    byte[] field_d;

    final static fg c(byte param0) {
        try {
            Throwable var1 = null;
            fg stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            fg stackOut_2_0 = null;
            try {
              L0: {
                if (param0 == -127) {
                  break L0;
                } else {
                  fg discarded$2 = ghb.c((byte) 73);
                  break L0;
                }
              }
              stackOut_2_0 = (fg) Class.forName("an").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    ghb(byte[] param0) {
        ((ghb) this).field_d = param0;
    }

    static {
    }
}
