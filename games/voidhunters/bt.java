/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bt {
    static String field_b;
    private int field_c;
    static ds field_a;

    final void b(int param0) {
        jaggl.OpenGL.glEndList();
        if (param0 != 4864) {
            ((bt) this).b(30);
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final void a(boolean param0, char param1) {
        if (!param0) {
          ((bt) this).field_c = 21;
          jaggl.OpenGL.glCallList(((bt) this).field_c - -param1);
          return;
        } else {
          jaggl.OpenGL.glCallList(((bt) this).field_c - -param1);
          return;
        }
    }

    bt(qfa param0, int param1) {
        try {
            ((bt) this).field_c = jaggl.OpenGL.glGenLists(param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        jaggl.OpenGL.glNewList(((bt) this).field_c - -param1, 4864);
        if (param0 >= -79) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Armageddon in <%0>...";
    }
}
