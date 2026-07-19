/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dg {
    private jaclib.memory.Buffer field_a;
    private qfa field_b;

    dg(qfa param0, byte[] param1, int param2) {
        this.field_b = param0;
        this.field_a = (jaclib.memory.Buffer) ((Object) this.field_b.field_Kb.a(param2, false));
        if (param1 != null) {
            this.field_a.a(param1, 0, 0, param2);
        }
    }
}
