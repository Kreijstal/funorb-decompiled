/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bn {
    private wl field_a;
    private jaclib.memory.Buffer field_b;

    bn(wl param0, byte[] param1, int param2) {
        ((bn) this).field_a = param0;
        ((bn) this).field_b = (jaclib.memory.Buffer) (Object) ((bn) this).field_a.field_mb.a(param2, false);
        if (param1 != null) {
            ((bn) this).field_b.a(param1, 0, 0, param2);
        }
    }
}
