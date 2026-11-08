/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends LegacyOpenGlEffect {
    static volatile int field_e;
    private tq field_f;
    private ch field_g;

    kj(LegacyOpenGlGraphicsToolkit param0, ch param1) {
        super(param0);
        try {
          this.field_g = param1;
          this.field_f = new tq(param0, 2);
          this.field_f.a(0, 4864);
          this.field_b.g(1, 98);
          if (this.field_g.field_g) {
            jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
            jaggl.OpenGL.glEnable(3170);
          }
          jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
          jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          this.field_b.g(0, 106);
          this.field_f.a(true);
          this.field_f.a(1, 4864);
          this.field_b.g(1, 127);
          if (this.field_g.field_g) {
            jaggl.OpenGL.glDisable(3170);
          }
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          this.field_b.g(0, 80);
          this.field_f.a(true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 > -30) {
          field_e = 34;
        }
    }

    final void b(int param0) {
        this.field_f.a((byte) 121, '\001');
        if (param0 <= -125) {
          this.field_b.g(1, 100);
          this.field_b.a(88, (ht) null);
          this.field_b.g(0, 110);
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        float var4 = (float)(1 + (3 & param1)) * -0.0005000000237487257f;
        float var5 = 0.0005000000237487257f * (float)(1 + ((26 & param1) >> 3));
        float var6 = (64 & param1) == 0 ? 0.00048828125f : 0.0009765625f;
        int var7 = (param1 & 128) != 0 ? 1 : 0;
        int var8Lifetime1;
        this.field_b.g(1, 109);
        if (var7 != 0) {
          GameApplet.field_e[1] = 0.0f;
          GameApplet.field_e[0] = var6;
          GameApplet.field_e[2] = 0.0f;
          GameApplet.field_e[3] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8192, 9474, GameApplet.field_e, 0);
          GameApplet.field_e[2] = 0.0f;
          GameApplet.field_e[3] = var4 * (float)this.field_b.field_Ac % 1.0f;
          GameApplet.field_e[1] = var6;
          GameApplet.field_e[0] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8193, 9474, GameApplet.field_e, 0);
          if (this.field_g.field_g) {
            GameApplet.field_e[2] = 0.0f;
            GameApplet.field_e[0] = 0.0f;
            GameApplet.field_e[1] = 0.0f;
            GameApplet.field_e[3] = (float)this.field_b.field_Ac * var5 % 1.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, GameApplet.field_e, 0);
          } else {
            var8 = (int)(16.0f * ((float)this.field_b.field_Ac * var5));
            this.field_b.a(90, this.field_g.field_a[var8 % 16]);
          }
          this.field_b.g(0, 90);
          if (param0 < 39) {
            field_e = 81;
            return;
          }
          return;
        }
        GameApplet.field_e[3] = 0.0f;
        GameApplet.field_e[0] = 0.0f;
        GameApplet.field_e[1] = 0.0f;
        GameApplet.field_e[2] = var6;
        jaggl.OpenGL.glTexGenfv(8192, 9474, GameApplet.field_e, 0);
        GameApplet.field_e[2] = 0.0f;
        GameApplet.field_e[3] = var4 * (float)this.field_b.field_Ac % 1.0f;
        GameApplet.field_e[1] = var6;
        GameApplet.field_e[0] = 0.0f;
        jaggl.OpenGL.glTexGenfv(8193, 9474, GameApplet.field_e, 0);
        if (this.field_g.field_g) {
          GameApplet.field_e[2] = 0.0f;
          GameApplet.field_e[0] = 0.0f;
          GameApplet.field_e[1] = 0.0f;
          GameApplet.field_e[3] = (float)this.field_b.field_Ac * var5 % 1.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, GameApplet.field_e, 0);
        } else {
          var8Lifetime1 = (int)(16.0f * ((float)this.field_b.field_Ac * var5));
          this.field_b.a(90, this.field_g.field_a[var8Lifetime1 % 16]);
        }
        this.field_b.g(0, 90);
        if (param0 < 39) {
          field_e = 81;
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 >= 33) {
          this.field_f.a((byte) 121, '\0');
          if (this.field_g.field_g) {
            this.field_b.g(1, 120);
            this.field_b.a(56, this.field_g.field_f);
            this.field_b.g(0, 110);
          }
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1, boolean param2, String param3) {
        try {
          RuntimeException var4 = null;
          String var5 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4_ref = null;
          try {
            if (PlatformTaskDispatcher.field_o.startsWith("win") &&
              rs.a(param3, -2528)) {
              return;
            }
            try {
              param1.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              IntrusiveNode.reportClientError("MGR1: " + param3, (Throwable) null, 0);
            }
            if (param0 == -23166) {
              return;
            }
            var5 = (String) null;
            kj.a(93, (java.applet.Applet) null, false, (String) null);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4;
            stackIn_12_1 = new StringBuilder().append("kj.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(byte param0) {
        if (param0 > -64) {
          this.field_f = (tq) null;
          return true;
        }
        return true;
    }

    final void a(byte param0, int param1, ht param2) {
        if (param0 != 35) {
          return;
        }
        try {
          this.field_b.a(46, param2);
          this.field_b.c(param1, true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kj.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
