/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oua {
    final static ha a(d param0, int param1, byte param2, cn param3, java.awt.Canvas param4) {
        try {
            Class var5 = null;
            RuntimeException var5_ref = null;
            Throwable var5_ref2 = null;
            java.lang.reflect.Method var6 = null;
            ha stackIn_5_0 = null;
            Throwable decompiledCaughtException = null;
            ha stackOut_4_0 = null;
            try {
              L0: {
                if (mja.a((byte) -50)) {
                  if (in.a("jagdx", 480)) {
                    var5 = Class.forName("cta");
                    var6 = var5.getDeclaredMethod("createToolkit", new Class[4]);
                    stackOut_4_0 = (ha) var6.invoke((Object) null, new Object[4]);
                    stackIn_5_0 = stackOut_4_0;
                    break L0;
                  } else {
                    throw new RuntimeException("");
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
            return stackIn_5_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
