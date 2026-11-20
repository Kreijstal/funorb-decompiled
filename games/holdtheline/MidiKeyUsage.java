/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiKeyUsage extends IntrusiveNode {
    static ResourceArchive field_i;
    static LoadProgressDialog field_l;
    static IntrusiveDeque field_j;
    byte[] field_k;

    final static void a(int param0) {
        if (null != RoadControlPointSpec.field_c) {
          RoadControlPointSpec.field_c.h((byte) -80);
        }
        ZombiePedestrian.field_l = new DisplayNameForm();
        if (param0 == 17902) {
          sm.field_c.setContent((UiWidget) (ZombiePedestrian.field_l), (byte) -104);
          return;
        }
        field_j = (IntrusiveDeque) null;
        sm.field_c.setContent((UiWidget) (ZombiePedestrian.field_l), (byte) -104);
    }

    public static void clearSharedReferences(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != 5751) {
          field_l = (LoadProgressDialog) null;
          field_l = null;
          return;
        }
        field_l = null;
    }

    MidiKeyUsage(byte[] param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
