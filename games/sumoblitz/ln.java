/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ln {
    private fr field_a;
    private jaclib.memory.Buffer field_b;

    ln(fr param0, byte[] param1, int param2) {
        this.field_a = param0;
        this.field_b = (jaclib.memory.Buffer) ((Object) this.field_a.field_pb.a(param2, false));
        if (param1 != null) {
            this.field_b.a(param1, 0, 0, param2);
        }
    }
}
