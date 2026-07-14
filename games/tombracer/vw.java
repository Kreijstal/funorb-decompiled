/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vw {
    static nl field_a;
    static jea field_b;
    eo field_c;

    abstract void a(int param0, boolean param1);

    void c(boolean param0) {
        if (!param0) {
            field_a = null;
        }
    }

    abstract void a(int param0);

    abstract void a(int param0, iva param1, int param2);

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != 101) {
            Object var2 = null;
            q discarded$0 = vw.a(-92, (ffa) null, -43, true);
        }
    }

    final static q a(int param0, ffa param1, int param2, boolean param3) {
        q var4 = null;
        q var4_ref = null;
        L0: {
          var4 = (q) (Object) vga.field_n.c(27);
          if (var4 == null) {
            var4_ref = new q(param1, param0, param2);
            break L0;
          } else {
            var4.a(param0, param1, (byte) 116, param2);
            break L0;
          }
        }
        if (!param3) {
          return null;
        } else {
          return var4_ref;
        }
    }

    void b(byte param0) {
        if (param0 != 107) {
            ((vw) this).b((byte) 23);
        }
    }

    void a(boolean param0) {
        if (!param0) {
            ((vw) this).a(false);
        }
    }

    void b(int param0) {
        if (param0 <= 64) {
            ((vw) this).a((byte) 45, -125, -56);
        }
    }

    vw(eo param0) {
        ((vw) this).field_c = param0;
    }

    abstract void a(boolean param0, int param1);

    abstract void a(byte param0, int param1, int param2);

    void b(boolean param0) {
        if (!param0) {
            field_b = null;
        }
    }

    abstract boolean c(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nl("email");
    }
}
