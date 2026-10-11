/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static int field_c;
    static fn field_e;
    static bd field_b;
    static int[] field_a;
    int[] field_d;

    final static void a(byte param0) {
        if (param0 == -126) {
          ke.field_s.b(new nb(), (byte) 110);
          return;
        }
        mn.c((byte) -27);
        ke.field_s.b(new nb(), (byte) 110);
    }

    final static void c(byte param0) {
        if (param0 != 67) {
          field_b = (bd) null;
          if (md.field_k) {
            ka.field_r = true;
            w.b(true, -23960);
            fa.field_c = 0;
            return;
          }
          throw new IllegalStateException();
        }
        if (md.field_k) {
          ka.field_r = true;
          w.b(true, -23960);
          fa.field_c = 0;
          return;
        }
        throw new IllegalStateException();
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = -20 % ((-5 - param0) / 55);
        field_b = null;
        field_e = null;
    }

    public mn() {
        this.field_d = new int[16];
    }

    static {
        field_c = 0;
        field_a = new int[1024];
    }
}
