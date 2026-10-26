/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    final static GraphicsRenderer a(byte param0, int param1, java.awt.Canvas param2, ResourceArchive param3, d param4) {
        try {
          Throwable decompiledCaughtException = null;
          try {
            if (!tq.c(true)) {
              throw new RuntimeException("");
            }
            if (!ei.a("jagdx", (byte) -16)) {
              throw new RuntimeException("");
            }
            Class var5 = Class.forName("kr");
            if (param0 != 1) {
              d var7 = (d) null;
              mn.a((byte) 32, -121, (java.awt.Canvas) null, (ResourceArchive) null, (d) null);
            }
            java.lang.reflect.Method var6 = var5.getDeclaredMethod("createToolkit", new Class[]{Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("ResourceArchive"), Class.forName("java.lang.Integer")});
            GraphicsRenderer stackIn_8_0 = (GraphicsRenderer) (var6.invoke((Object) null, new Object[]{param2, param4, param3, new Integer(param1)}));
            return stackIn_8_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw var5_ref;
          } catch (java.lang.Throwable decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            Throwable var5_ref2 = decompiledCaughtException;
            throw new RuntimeException("");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
