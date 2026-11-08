/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static byte[] field_b;
    static SceneWidget field_a;

    final static void exitFullscreenFrame(byte param0, java.awt.Frame param1, PlatformTaskDispatcher param2) {
        PlatformTask var3 = null;
        int var4 = 0;
        PlatformTaskDispatcher var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != -124) {
            var5 = (PlatformTaskDispatcher) null;
            dc.exitFullscreenFrame((byte) 3, (java.awt.Frame) null, (PlatformTaskDispatcher) null);
          }
          while (true) {
            var3 = param2.requestExitFullscreen(param1, -84);
            while (var3.field_b == 0) {
              SecondaryNodeHashTable.sleepMillis(10L, (byte) 23);
            }
            if (var3.field_b != 1) {
              SecondaryNodeHashTable.sleepMillis(100L, (byte) 23);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("dc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 == -1) {
          return;
        }
        field_a = (SceneWidget) null;
    }

    static {
    }
}
