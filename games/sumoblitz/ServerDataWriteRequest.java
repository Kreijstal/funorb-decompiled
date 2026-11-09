/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ServerDataWriteRequest extends IntrusiveNode {
    byte[] payload;
    static int droneSlotLimit;
    int requestCrc;

    final static void attachInputHandlers(boolean guard, java.awt.Canvas canvas) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard) {
            var3 = (java.awt.Canvas) null;
            ServerDataWriteRequest.attachInputHandlers(true, (java.awt.Canvas) null);
          }
          lq.attachKeyboardInput(0, (java.awt.Component) ((Object) canvas));
          MouseInputRegistration.attachMouseInput((java.awt.Component) ((Object) canvas), true);
          if (null == InwardSparkParticle.field_w) {
            return;
          }
          InwardSparkParticle.field_w.attach(true, (java.awt.Component) ((Object) canvas));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("db.A(").append(guard).append(',');
          if (canvas == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    ServerDataWriteRequest(byte[] bytes) {
        try {
          this.payload = bytes;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "db.<init>(" + (bytes != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
