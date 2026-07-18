/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    static java.awt.Frame field_d;
    private int field_a;
    static volatile boolean field_b;
    static int field_c;

    final void a(int param0, char param1) {
        jaggl.OpenGL.glCallList(((si) this).field_a - -param1);
        if (param0 != -23085) {
            ((si) this).a((byte) -107, -7);
        }
    }

    final void b(boolean param0) {
        jaggl.OpenGL.glEndList();
        if (param0) {
            ((si) this).field_a = -37;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        return (param2 & 2048) != 0;
    }

    final static void a(boolean param0, int param1) {
        vn.field_f.a(0, 0, 0);
    }

    public static void a() {
        field_d = null;
    }

    final static void c() {
        kh.field_a = true;
        za.a(34, new int[7], 220, 210, 0, 430, (byte) -67);
        aa.field_b[0] = new nk(0);
    }

    final void a(byte param0, int param1) {
        jaggl.OpenGL.glNewList(param1 + ((si) this).field_a, 4864);
        int var3 = 89 / ((-23 - param0) / 54);
    }

    si(wl param0, int param1) {
        try {
            ((si) this).field_a = jaggl.OpenGL.glGenLists(param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "si.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
