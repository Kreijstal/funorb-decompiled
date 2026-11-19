/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static DialogLayer field_a;
    static int field_c;
    static int field_b;
    static PacketBuffer field_d;

    public static void clearSharedReferences(int param0) {
        if (param0 != -14078) {
          r.clearSharedReferences(-16);
          field_a = null;
          field_d = null;
          return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0) {
        if (param0 != -28036) {
          return;
        }
        if (null != IterableSecondaryNodeDeque.field_h) {
          IterableSecondaryNodeDeque.field_h.close(param0 + 49171);
          IterableSecondaryNodeDeque.field_h = null;
        }
    }

    static {
    }
}
