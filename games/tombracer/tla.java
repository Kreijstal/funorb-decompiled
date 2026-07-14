/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tla {
    static boolean field_b;
    static jpa field_g;
    static String field_d;
    static boolean field_e;
    static String field_j;
    static fp field_c;
    static String field_f;
    private int field_i;
    static String field_h;
    static String field_a;

    final void a(byte param0, int param1) {
        jaggl.OpenGL.glNewList(((tla) this).field_i + param1, 4864);
        if (param0 != 6) {
            ((tla) this).a(-22, '~');
        }
    }

    final void a(int param0, char param1) {
        if (param0 != 4864) {
            return;
        }
        jaggl.OpenGL.glCallList(((tla) this).field_i - -param1);
    }

    final void b(byte param0) {
        jaggl.OpenGL.glEndList();
        int var2 = -28 / ((-44 - param0) / 48);
    }

    tla(cka param0, int param1) {
        ((tla) this).field_i = jaggl.OpenGL.glGenLists(param1);
    }

    public static void a(byte param0) {
        if (param0 < 76) {
          field_h = null;
          field_d = null;
          field_c = null;
          field_h = null;
          field_g = null;
          field_a = null;
          field_f = null;
          field_j = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_h = null;
          field_g = null;
          field_a = null;
          field_f = null;
          field_j = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_j = "This game has started.";
        field_d = "Your rating is <%0>";
        field_h = "You have <%0> second(s) left...";
        field_a = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
        field_c = new fp();
    }
}
