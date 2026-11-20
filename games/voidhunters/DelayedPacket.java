/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPacket extends IntrusiveNode {
    long releaseTimeMillis;
    byte[] payload;
    int opcodeOrLength;

    final static void drawLine(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (OpenGlTexture1D.field_i) {
          SetMassDriverProjectileLife.a(-16777216 | param5, (byte) 103, param3, param2, param0, param1);
          return;
        }
        SoftwareRasterizer2D.drawLine(param2, param3, param1, param0, param5);
        if (param4 == -16777216) {
          return;
        }
    }

    DelayedPacket(long param0, int param1, byte[] param2) {
        try {
          this.opcodeOrLength = param1;
          this.releaseTimeMillis = param0;
          this.payload = param2;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "c.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
