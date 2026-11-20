/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientDataWriteRequest extends IntrusiveNode {
    int payloadCrc;
    byte[] data;

    final static CarouselSlot readCarouselState(byte param0) {
        UiViewport.serializedStateBuffer.position = 0;
        if (param0 != -39) {
          return (CarouselSlot) null;
        }
        UiViewport.serializedStateBuffer.beginBitRead(-23497);
        CarouselSlot var1 = (CarouselSlot) (ConsoleEvaluationException.field_a.create((byte) 69));
        if (!(var1 instanceof CompactGameState)) {
          var1.readState(UiViewport.serializedStateBuffer, false);
          UiViewport.serializedStateBuffer.endBitRead((byte) -92);
          return var1;
        }
        ((CompactGameState) ((Object) var1)).readCompactState(UiViewport.serializedStateBuffer, 32);
        UiViewport.serializedStateBuffer.endBitRead((byte) -92);
        return var1;
    }

    ClientDataWriteRequest(byte[] param0) {
        try {
          this.data = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "dnb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
