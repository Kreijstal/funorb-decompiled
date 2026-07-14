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
        if (param0 != -126) {
          mn.c((byte) -27);
          ke.field_s.b((ag) (Object) new nb(), (byte) 110);
          return;
        } else {
          ke.field_s.b((ag) (Object) new nb(), (byte) 110);
          return;
        }
    }

    final static void c(byte param0) {
        if (param0 == 67) {
          if (!md.field_k) {
            throw new IllegalStateException();
          } else {
            ka.field_r = true;
            w.b(true, -23960);
            fa.field_c = 0;
            return;
          }
        } else {
          field_b = null;
          if (!md.field_k) {
            throw new IllegalStateException();
          } else {
            ka.field_r = true;
            w.b(true, -23960);
            fa.field_c = 0;
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = -20 % ((-5 - param0) / 55);
        field_b = null;
        field_e = null;
    }

    public mn() {
        ((mn) this).field_d = new int[16];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = new int[1024];
    }
}
