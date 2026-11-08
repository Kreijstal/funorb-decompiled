/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundStreamHandle extends IntrusiveNode {
    static int field_h;
    PcmSampleStream stream;
    static String field_l;
    static MouseWheelInput field_f;
    static int field_e;
    int baseVolume;
    static int field_g;
    IntrusiveNode owner;

    final static UiLayoutNode a(int param0, int param1) {
        UiLayoutNode var2 = new UiLayoutNode((long)param1, (UiLayoutNode) null);
        var2.field_R = ShopPlayerSlot.a((byte) 26, param0);
        return var2;
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        field_l = null;
        if (param0 < 66) {
          SoundStreamHandle.releaseStatics((byte) 34);
        }
    }

    SoundStreamHandle(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.stream = param0;
          this.baseVolume = param0.getTargetVolume();
          this.owner = param1;
          this.stream.setInternalVolume(128 + IconButtonPainter.field_a * this.baseVolume >> 8);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ag.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "<%0>: Show Chat";
    }
}
