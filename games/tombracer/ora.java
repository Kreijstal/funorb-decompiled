/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ora {
    private cka field_a;
    jaclib.memory.Buffer field_b;

    final void a(byte[] param0, int param1) {
        L0: {
          L1: {
            if (((ora) this).field_b == null) {
              break L1;
            } else {
              if (((ora) this).field_b.getSize() >= param1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((ora) this).field_b = (jaclib.memory.Buffer) (Object) ((ora) this).field_a.field_md.a(param1, false);
          break L0;
        }
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
