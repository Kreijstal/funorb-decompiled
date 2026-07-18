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
                L1: {
                  if (param0 == -127) {
                    break L1;
                  } else {
                    fg discarded$2 = ghb.c((byte) 73);
                    break L1;
                  }
                }
                stackOut_2_0 = (fg) Class.forName("an").newInstance();
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

    ghb(byte[] param0) {
        try {
            ((ghb) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ghb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
