/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iib extends qg {
    static int[] field_e;
    private bt field_d;
    private jjb field_c;

    final void a(int param0) {
        this.field_d.a(true, '\001');
        this.field_b.h(33984, 1);
        if (param0 == 5890) {
          this.field_b.a(54, (pib) null);
          this.field_b.h(33984, 0);
          return;
        }
    }

    final void a(int param0, byte param1, pib param2) {
        if (param1 != 125) {
          return;
        }
        try {
          this.field_b.a(param1 ^ 77, param2);
          this.field_b.c(0, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "iib.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
          this.field_c = (jjb) null;
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
          iib.d(-53);
          field_e = null;
          return;
        }
        field_e = null;
    }

    iib(OpenGlToolkit param0, jjb param1) {
        super(param0);
        try {
          this.field_c = param1;
          this.field_d = new bt(param0, 2);
          this.field_d.a(-109, 0);
          this.field_b.h(33984, 1);
          if (this.field_c.field_d) {
            jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
            jaggl.OpenGL.glEnable(3170);
          }
          jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
          jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          this.field_b.h(33984, 0);
          this.field_d.b(4864);
          this.field_d.a(-89, 1);
          this.field_b.h(33984, 1);
          if (this.field_c.field_d) {
            jaggl.OpenGL.glDisable(3170);
          }
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          this.field_b.h(33984, 0);
          this.field_d.b(4864);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "iib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 > -87) {
          this.a(42);
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        float var4 = -0.0005000000237487257f * (float)(1 + (param0 & 3));
        float var5 = (float)(1 + ((24 & param0) >> 3)) * 0.0005000000237487257f;
        float var6 = (64 & param0) != 0 ? 0.0009765625f : 0.00048828125f;
        int var7 = (param0 & 128) != 0 ? 1 : 0;
        int var8Lifetime1;
        this.field_b.h(33984, 1);
        if (var7 != 0) {
          wk.field_b[2] = 0.0f;
          wk.field_b[1] = 0.0f;
          wk.field_b[3] = 0.0f;
          wk.field_b[0] = var6;
          jaggl.OpenGL.glTexGenfv(8192, 9474, wk.field_b, 0);
          wk.field_b[3] = (float)this.field_b.field_Mc * var4 % 1.0f;
          wk.field_b[2] = 0.0f;
          if (param1 == -25139) {
            wk.field_b[0] = 0.0f;
            wk.field_b[1] = var6;
            jaggl.OpenGL.glTexGenfv(8193, 9474, wk.field_b, 0);
            if (this.field_c.field_d) {
              wk.field_b[3] = (float)this.field_b.field_Mc * var5 % 1.0f;
              wk.field_b[1] = 0.0f;
              wk.field_b[2] = 0.0f;
              wk.field_b[0] = 0.0f;
              jaggl.OpenGL.glTexGenfv(8194, 9473, wk.field_b, 0);
            } else {
              var8 = (int)((float)this.field_b.field_Mc * var5 * 16.0f);
              this.field_b.a(25, this.field_c.field_c[var8 % 16]);
            }
            this.field_b.h(33984, 0);
            return;
          }
          return;
        }
        wk.field_b[1] = 0.0f;
        wk.field_b[2] = var6;
        wk.field_b[3] = 0.0f;
        wk.field_b[0] = 0.0f;
        jaggl.OpenGL.glTexGenfv(8192, 9474, wk.field_b, 0);
        wk.field_b[3] = (float)this.field_b.field_Mc * var4 % 1.0f;
        wk.field_b[2] = 0.0f;
        if (param1 == -25139) {
          wk.field_b[0] = 0.0f;
          wk.field_b[1] = var6;
          jaggl.OpenGL.glTexGenfv(8193, 9474, wk.field_b, 0);
          if (this.field_c.field_d) {
            wk.field_b[3] = (float)this.field_b.field_Mc * var5 % 1.0f;
            wk.field_b[1] = 0.0f;
            wk.field_b[2] = 0.0f;
            wk.field_b[0] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, wk.field_b, 0);
          } else {
            var8Lifetime1 = (int)((float)this.field_b.field_Mc * var5 * 16.0f);
            this.field_b.a(25, this.field_c.field_c[var8Lifetime1 % 16]);
          }
          this.field_b.h(33984, 0);
          return;
        }
    }

    final void a(boolean param0, int param1) {
        this.field_d.a(true, '\0');
        if (param1 < 18) {
          this.b(31);
          if (this.field_c.field_d) {
            this.field_b.h(33984, 1);
            this.field_b.a(58, this.field_c.field_g);
            this.field_b.h(33984, 0);
            return;
          }
          return;
        }
        if (!this.field_c.field_d) {
          return;
        }
        this.field_b.h(33984, 1);
        this.field_b.a(58, this.field_c.field_g);
        this.field_b.h(33984, 0);
    }

    static {
    }
}
