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
          try {
            if (!mja.a(param2)) {
              throw new RuntimeException("");
            }
            if (!in.a("jagdx", 480)) {
              throw new RuntimeException("");
            }
            var5 = Class.forName("cta");
            var6 = var5.getDeclaredMethod("createToolkit", new Class[]{Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("cn"), Class.forName("java.lang.Integer")});
            stackIn_5_0 = (ha) (var6.invoke((Object) null, new Object[]{param4, param0, param3, new Integer(param1)}));
            return stackIn_5_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw var5_ref;
          } catch (java.lang.Throwable decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref2 = decompiledCaughtException;
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
