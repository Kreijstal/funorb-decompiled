/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jsa {
    final static ha a(asb param0, int param1, int param2, java.awt.Canvas param3, d param4) {
        try {
            Class var5 = null;
            RuntimeException var5_ref = null;
            Throwable var5_ref2 = null;
            java.lang.reflect.Method var6 = null;
            ha stackIn_8_0 = null;
            Throwable decompiledCaughtException = null;
            ha stackOut_7_0 = null;
            try {
              L0: {
                if (sab.e((byte) -118)) {
                  if (!gpb.a("jagdx", (byte) 114)) {
                    throw new RuntimeException("");
                  } else {
                    var5 = Class.forName("nla");
                    var6 = var5.getDeclaredMethod("createToolkit", new Class[4]);
                    stackOut_7_0 = (ha) var6.invoke((Object) null, new Object[4]);
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  }
                } else {
                  throw new RuntimeException("");
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref2 = decompiledCaughtException;
              throw new RuntimeException("");
            }
            return stackIn_8_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
