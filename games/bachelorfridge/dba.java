/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dba {
    static ws field_a;

    public static void clearStaticReferences(byte param0) {
        if (param0 < 38) {
          dba.clearStaticReferences((byte) 90);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static int b(byte param0) {
        ga.field_c.pollArchiveSources((byte) 102);
        if (!HomingMissileAnimation.field_G.pollNetwork((byte) 69)) {
          return MouseWheelInput.a(param0 ^ 72);
        }
        if (param0 == 72) {
          return 0;
        }
        field_a = (ws) null;
        return 0;
    }

    static {
        field_a = new ws();
    }
}
