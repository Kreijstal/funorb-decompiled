/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kb {
    fr field_g;
    static se field_d;
    private boolean field_b;
    static volatile int field_i;
    static int field_a;
    private boolean field_e;
    private int field_h;
    static is field_c;
    int field_f;

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        if (!param0) {
            field_a = 19;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(((kb) this).field_b)) {
            ((kb) this).field_g.a(((kb) this).field_f, true, ((kb) this).field_h);
            ((kb) this).field_b = true;
        }
        super.finalize();
    }

    abstract void b(int param0);

    final static wb[] a(String param0, ki param1, boolean param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param1.a(0, param3);
        if (!param2) {
          return null;
        } else {
          var5 = param1.a(var4, param0, (byte) 126);
          return tt.a((byte) -100, var5, param1, var4);
        }
    }

    kb(fr param0, int param1, byte[] param2, int param3, boolean param4) {
        ((kb) this).field_b = false;
        ((kb) this).field_g = param0;
        ((kb) this).field_e = param4 ? true : false;
        ((kb) this).field_h = param3;
        jaggl.OpenGL.glGenBuffersARB(1, nq.field_j, 0);
        ((kb) this).field_f = nq.field_j[0];
        ((kb) this).b(1735490466);
        jaggl.OpenGL.glBufferDataARBub(param1, ((kb) this).field_h, param2, 0, ((kb) this).field_e ? 35040 : 35044);
        ((kb) this).field_g.field_Xb = ((kb) this).field_g.field_Xb + ((kb) this).field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
        field_i = 0;
    }
}
