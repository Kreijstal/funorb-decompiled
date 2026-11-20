/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dnb extends IntrusiveNode {
    int field_d;
    byte[] field_e;

    final static CarouselSlot c(byte param0) {
        UiViewport.field_w.position = 0;
        if (param0 != -39) {
          return (CarouselSlot) null;
        }
        UiViewport.field_w.beginBitRead(-23497);
        CarouselSlot var1 = (CarouselSlot) (ConsoleEvaluationException.field_a.create((byte) 69));
        if (!(var1 instanceof CompactGameState)) {
          var1.readState(UiViewport.field_w, false);
          UiViewport.field_w.endBitRead((byte) -92);
          return var1;
        }
        ((CompactGameState) ((Object) var1)).readCompactState(UiViewport.field_w, 32);
        UiViewport.field_w.endBitRead((byte) -92);
        return var1;
    }

    dnb(byte[] param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dnb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
