/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vra implements bo {
    private int field_b;
    static int field_a;
    static String field_c;
    private int field_d;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 4) {
            vra.a(22);
        }
    }

    public final void a(int param0, kh param1) {
        param1.i(8);
        param1.a((byte) -128, ((vra) this).field_b, 3);
        param1.a((byte) -126, ((vra) this).field_d, 4);
        param1.k(param0 ^ -1826190742);
        if (param0 != 200) {
            vra.a(79);
        }
    }

    final void a(qh param0, byte param1, v param2) {
        if (param1 >= -81) {
          vra.a(-117);
          param0.c(((vra) this).field_d, 112, ((vra) this).field_b);
          return;
        } else {
          param0.c(((vra) this).field_d, 112, ((vra) this).field_b);
          return;
        }
    }

    public final void a(kh param0, byte param1) {
        param0.h((byte) 126);
        if (param1 != -19) {
          return;
        } else {
          ((vra) this).field_b = param0.b((byte) 44, 3);
          ((vra) this).field_d = param0.b((byte) 44, 4);
          param0.i((byte) 98);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please remove <%0> from your ignore list first.";
    }
}
