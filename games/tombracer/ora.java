/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ora {
    private cka field_a;
    jaclib.memory.Buffer field_b;

    final void a(byte[] param0, int param1) {
        if (((ora) this).field_b != null) {
            // if_icmpge L36
        }
        ((ora) this).field_b = (jaclib.memory.Buffer) (Object) ((ora) this).field_a.field_md.a(param1, false);
        ((ora) this).field_b.a(param0, 0, 0, param1);
    }

    ora(cka param0, byte[] param1, int param2) {
        ((ora) this).field_a = param0;
        ((ora) this).field_b = (jaclib.memory.Buffer) (Object) ((ora) this).field_a.field_md.a(param2, false);
        if (param1 != null) {
            ((ora) this).field_b.a(param1, 0, 0, param2);
        }
    }
}
