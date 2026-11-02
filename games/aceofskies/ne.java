/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends hh {
    private si field_j;
    private boolean field_d;
    static qr field_i;
    static String field_f;
    static String[] field_g;
    static String field_e;
    static String field_h;

    final boolean a(byte param0) {
        int var2 = 126 % ((param0 + 11) / 63);
        return true;
    }

    ne(OpenGlRenderer param0) {
        super(param0);
        this.field_d = false;
        try {
          if (param0.field_nc) {
            this.field_j = new si(param0, 2);
            this.field_j.a((byte) -105, 0);
            this.field_a.a(false, 1);
            this.field_a.a(34165, -26625, 7681);
            this.field_a.a(34168, 770, 34176, 2);
            this.field_a.a(770, 34167, 0, (byte) 106);
            jaggl.OpenGL.glTexGeni(8192, 9472, 34066);
            jaggl.OpenGL.glTexGeni(8193, 9472, 34066);
            jaggl.OpenGL.glTexGeni(8194, 9472, 34066);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glEnable(3170);
            this.field_a.a(false, 0);
            this.field_j.b(false);
            this.field_j.a((byte) 36, 1);
            this.field_a.a(false, 1);
            this.field_a.a(8448, -26625, 8448);
            this.field_a.a(34166, 770, 34176, 2);
            this.field_a.a(770, 5890, 0, (byte) 86);
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            this.field_a.a(false, 0);
            this.field_j.b(false);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        q var3 = this.field_a.c(true);
        if (param0) {
          return;
        }
        if (this.field_j == null) {
          this.field_a.a(770, 34168, 0, (byte) 120);
          return;
        }
        if (var3 == null) {
          this.field_a.a(770, 34168, 0, (byte) 120);
          return;
        }
        if (!param1) {
          this.field_a.a(770, 34168, 0, (byte) 120);
          return;
        }
        this.field_j.a(-23085, '\0');
        this.field_a.a(false, 1);
        this.field_a.a(var3, 1);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadMatrixf(this.field_a.field_H.a((byte) 105), 0);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_a.a(param0, 0);
        this.field_d = true;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != -65) {
          field_f = (String) null;
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_e = null;
        field_f = null;
        int var1 = 123 / ((-63 - param0) / 52);
        field_h = null;
    }

    final void b(byte param0) {
        if (this.field_d) {
          this.field_j.a(-23085, '\001');
          this.field_a.a(false, 1);
          this.field_a.a((rt) null, 1);
          this.field_a.a(false, 0);
          this.field_a.a(8448, -26625, 8448);
          this.field_d = false;
          if (param0 < 5) {
            this.a((byte) -2);
            return;
          }
          return;
        }
        this.field_a.a(770, 5890, 0, (byte) 113);
        this.field_a.a(8448, -26625, 8448);
        this.field_d = false;
        if (param0 < 5) {
          this.a((byte) -2);
          return;
        }
    }

    final void a(int param0, int param1, rt param2) {
        try {
          this.field_a.a(param2, 1);
          if (param1 != -1486691000) {
            this.a(29, true);
          }
          this.field_a.a(param0, (byte) -39);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ne.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 == 4096) {
          this.field_a.a(8448, -26625, 7681);
          return;
        }
        field_i = (qr) null;
        this.field_a.a(8448, -26625, 7681);
    }

    static {
        field_i = new qr();
        field_f = "Visit the Account Management section on the main site to view.";
        field_e = "Close";
        field_h = "Quit";
    }
}
