/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bka {
    private vna field_a;

    final void a(byte param0, int param1) {
        if (param0 >= -112) {
          ((bka) this).field_a = null;
          ((bka) this).field_a.b((byte) -69, (vg) (Object) new al(param1));
          return;
        } else {
          ((bka) this).field_a.b((byte) -69, (vg) (Object) new al(param1));
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 != -26) {
            return false;
        }
        return ((bka) this).field_a.d((byte) 14);
    }

    final static void a(byte param0) {
        int var1 = -1 / ((param0 - -58) / 37);
        ds.a((byte) 57, true);
    }

    final int a(int param0) {
        if (!(!((bka) this).field_a.d((byte) 14))) {
            return 0;
        }
        int var2 = -7 / ((32 - param0) / 55);
        return ((al) (Object) ((bka) this).field_a.c(72)).field_i;
    }

    final void c(int param0) {
        ((bka) this).field_a.d(8);
        if (param0 > -63) {
            ((bka) this).field_a = null;
        }
    }

    final int b(int param0) {
        if (param0 != 0) {
            return -61;
        }
        return ((bka) this).field_a.a((byte) -16);
    }

    public bka() {
        ((bka) this).field_a = new vna();
    }

    static {
    }
}
