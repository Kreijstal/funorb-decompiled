/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    final static ha a(byte param0, int param1, java.awt.Canvas param2, gk param3, d param4) {
        try {
            ha discarded$2 = null;
            Class var5 = null;
            RuntimeException var5_ref = null;
            Throwable var5_ref2 = null;
            java.lang.reflect.Method var6 = null;
            d var7 = null;
            ha stackIn_8_0 = null;
            Throwable decompiledCaughtException = null;
            ha stackOut_7_0 = null;
            try {
              L0: {
                if (tq.c(true)) {
                  if (!ei.a("jagdx", (byte) -16)) {
                    throw new RuntimeException("");
                  } else {
                    L1: {
                      var5 = Class.forName("kr");
                      if (param0 == 1) {
                        break L1;
                      } else {
                        var7 = (d) null;
                        discarded$2 = mn.a((byte) 32, -121, (java.awt.Canvas) null, (gk) null, (d) null);
                        break L1;
                      }
                    }
                    var6 = var5.getDeclaredMethod("createToolkit", new Class[]{Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("gk"), Class.forName("java.lang.Integer")});
                    stackOut_7_0 = (ha) (var6.invoke((Object) null, new Object[]{param2, param4, param3, new Integer(param1)}));
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  }
                } else {
                  throw new RuntimeException("");
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw var5_ref;
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
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
