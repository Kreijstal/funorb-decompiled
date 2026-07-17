/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu {
    final static ha a(int param0, ki param1, d param2, java.awt.Canvas param3, int param4) {
        try {
            Class var5 = null;
            RuntimeException var5_ref = null;
            Throwable var5_ref2 = null;
            java.lang.reflect.Method var6 = null;
            Object stackIn_7_0 = null;
            ha stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            ha stackOut_8_0 = null;
            Object stackOut_6_0 = null;
            try {
              L0: {
                if (!of.c((byte) 124)) {
                  throw new RuntimeException("");
                } else {
                  if (mc.b((byte) 125, "jagdx")) {
                    if (param0 == 7023) {
                      var5 = Class.forName("ir");
                      var6 = var5.getDeclaredMethod("createToolkit", new Class[4]);
                      stackOut_8_0 = (ha) var6.invoke((Object) null, new Object[4]);
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      stackOut_6_0 = null;
                      stackIn_7_0 = stackOut_6_0;
                      return (ha) (Object) stackIn_7_0;
                    }
                  } else {
                    throw new RuntimeException("");
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref2 = decompiledCaughtException;
              throw new RuntimeException("");
            }
            return stackIn_9_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
