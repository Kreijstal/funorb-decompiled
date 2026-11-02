/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uob extends qg {
    private boolean field_d;
    static String field_f;
    static boolean field_e;
    private bt field_c;
    static int[][] field_g;

    uob(OpenGlToolkit param0) {
        super(param0);
        this.field_d = false;
        try {
          if (param0.field_S) {
            this.field_c = new bt(param0, 2);
            this.field_c.a(-97, 0);
            this.field_b.h(33984, 1);
            this.field_b.b(34165, 7681, false);
            this.field_b.c(2, 34192, 770, 34168);
            this.field_b.b(0, 770, 34167, 34184);
            jaggl.OpenGL.glTexGeni(8192, 9472, 34066);
            jaggl.OpenGL.glTexGeni(8193, 9472, 34066);
            jaggl.OpenGL.glTexGeni(8194, 9472, 34066);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glEnable(3170);
            this.field_b.h(33984, 0);
            this.field_c.b(4864);
            this.field_c.a(-95, 1);
            this.field_b.h(33984, 1);
            this.field_b.b(8448, 8448, false);
            this.field_b.c(2, 34192, 770, 34166);
            this.field_b.b(0, 770, 5890, 34184);
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            this.field_b.h(33984, 0);
            this.field_c.b(4864);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uob.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 > -87) {
          this.a(63);
          return true;
        }
        return true;
    }

    final void a(int param0, byte param1, pib param2) {
        try {
          this.field_b.a(param1 - 67, param2);
          this.field_b.c(0, param0);
          if (param1 != 125) {
            field_f = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uob.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 3168) {
          uob.d(71);
          field_g = (int[][]) null;
          return;
        }
        field_g = (int[][]) null;
    }

    final void a(boolean param0, int param1) {
        rtb var3 = this.field_b.a(false);
        if (param1 < 18) {
          field_f = (String) null;
          if (this.field_c == null) {
            this.field_b.b(0, 770, 34168, 34184);
            return;
          }
          if (var3 == null) {
            this.field_b.b(0, 770, 34168, 34184);
            return;
          }
          if (!param0) {
            this.field_b.b(0, 770, 34168, 34184);
            return;
          }
          this.field_c.a(true, '\0');
          this.field_b.h(33984, 1);
          this.field_b.a(83, var3);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadMatrixf(this.field_b.field_Bb.b((byte) 43), 0);
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_b.h(33984, 0);
          this.field_d = true;
          return;
        }
        if (this.field_c == null) {
          this.field_b.b(0, 770, 34168, 34184);
          return;
        }
        if (var3 == null) {
          this.field_b.b(0, 770, 34168, 34184);
          return;
        }
        if (!param0) {
          this.field_b.b(0, 770, 34168, 34184);
          return;
        }
        this.field_c.a(true, '\0');
        this.field_b.h(33984, 1);
        this.field_b.a(83, var3);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadMatrixf(this.field_b.field_Bb.b((byte) 43), 0);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_b.h(33984, 0);
        this.field_d = true;
    }

    final static void a(boolean param0, byte param1, String param2, float param3) {
        if (null == vqa.field_i) {
          vqa.field_i = new goa(GetLagStandardDeviationIn.field_r, hab.field_j);
          GetLagStandardDeviationIn.field_r.a(false, vqa.field_i);
        }
        vqa.field_i.a(param0, param2, param3, (byte) -89);
        dma.a();
        if (param1 < 26) {
          return;
        }
        try {
          GetPointDefenceLaserProjectileDamage.a(true, -114);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uob.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != -25139) {
          field_e = true;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
          this.field_b.b(8448, 7681, false);
          return;
        }
        this.a(-110);
        this.field_b.b(8448, 7681, false);
    }

    final void a(int param0) {
        if (param0 != 5890) {
          this.a(false, 47);
        }
        if (!this.field_d) {
          this.field_b.b(0, 770, 5890, 34184);
          this.field_b.b(8448, 8448, false);
          this.field_d = false;
          return;
        }
        this.field_c.a(true, '\001');
        this.field_b.h(33984, 1);
        this.field_b.a(69, (pib) null);
        this.field_b.h(33984, 0);
        this.field_b.b(8448, 8448, false);
        this.field_d = false;
    }

    static {
        field_f = "Invite only";
        field_g = new int[1][0];
    }
}
