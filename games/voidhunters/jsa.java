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
            ha stackIn_7_0 = null;
            ha stackIn_9_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ha stackOut_8_0 = null;
            ha stackOut_6_0 = null;
            try {
              L0: {
                if (sab.e((byte) -118)) {
                  if (!gpb.a("jagdx", (byte) 114)) {
                    throw new RuntimeException("");
                  } else {
                    var5 = Class.forName("nla");
                    if (param2 == 27908) {
                      var6 = var5.getDeclaredMethod("createToolkit", new Class[]{Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("asb"), Class.forName("java.lang.Integer")});
                      stackOut_8_0 = (ha) (var6.invoke((Object) null, new Object[]{param3, param4, param0, new Integer(param1)}));
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackOut_6_0 = (ha) null;
                      stackIn_7_0 = stackOut_6_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
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
            if (decompiledRegionSelector0 == 0) {
              return stackIn_7_0;
            } else {
              return stackIn_9_0;
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
