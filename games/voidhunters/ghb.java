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
          try {
            if (param0 != -127) {
              ghb.c((byte) 73);
            }
            stackIn_3_0 = (fg) (Class.forName("an").newInstance());
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

    ghb(byte[] param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ghb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
