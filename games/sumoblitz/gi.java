/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends LegacyOpenGlEffect {
    private ch field_e;
    private LegacyOpenGlTexture1D field_l;
    static qr field_g;
    private tq field_j;
    static int[] field_k;
    static int field_h;
    static int field_i;
    static String notYetAchievedText;

    final void b(int param0) {
        if (param0 > -125) {
          return;
        }
        this.field_j.a((byte) 121, '\001');
        if (this.field_b.field_kc <= 0) {
          this.field_b.a(20685, 8448, 8448);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glPopMatrix();
          jaggl.OpenGL.glMatrixMode(5888);
          return;
        }
        this.field_b.g(1, 94);
        this.field_b.bindTexture(24, (LegacyOpenGlTexture) null);
        this.field_b.a(1.0f, 15, 0.0f);
        this.field_b.g(0, 100);
        this.field_b.a(20685, 8448, 8448);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPopMatrix();
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final boolean b(byte param0) {
        if (param0 >= -64) {
          field_i = -33;
          return true;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        if (param0 == 8192) {
          field_g = null;
          field_k = null;
          notYetAchievedText = null;
          return;
        }
        notYetAchievedText = (String) null;
        field_g = null;
        field_k = null;
        notYetAchievedText = null;
    }

    final static String c(byte param0) {
        if (ProxySocketConnector.field_e == LegacyOpenGlGraphicsHeap.field_p) {
          return vr.field_G;
        }
        if (vm.field_c == LegacyOpenGlGraphicsHeap.field_p) {
          return PowerupPickup.field_s;
        }
        if (param0 != -2) {
          return (String) null;
        }
        if (!AffineTransform3D.field_o.a(true)) {
          return PowerupPickup.field_s;
        }
        return FocusProxyWidget.field_F;
    }

    final void a(int param0, boolean param1) {
        this.field_b.a(20685, 8448, 260);
        if (param0 > -30) {
          notYetAchievedText = (String) null;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if ((1 & param1) != 1) {
          if (!this.field_e.field_g) {
            this.field_b.bindTexture(108, this.field_e.field_i[0]);
            if (param0 <= 39) {
              this.d(2);
              return;
            }
            return;
          }
          this.field_b.bindTexture(82, this.field_e.field_b);
          GpuDataType.field_a[1] = 0.0f;
          GpuDataType.field_a[2] = 0.0f;
          GpuDataType.field_a[3] = 0.0f;
          GpuDataType.field_a[0] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, GpuDataType.field_a, 0);
          if (param0 <= 39) {
            this.d(2);
            return;
          }
          return;
        }
        if (!this.field_e.field_g) {
          var4 = this.field_b.field_Ac % 4000 * 16 / 4000;
          this.field_b.bindTexture(39, this.field_e.field_i[var4]);
          if (param0 > 39) {
            return;
          }
          this.d(2);
          return;
        }
        this.field_b.bindTexture(80, this.field_e.field_b);
        GpuDataType.field_a[3] = (float)(this.field_b.field_Ac % 4000) / 4000.0f;
        GpuDataType.field_a[2] = 0.0f;
        GpuDataType.field_a[0] = 0.0f;
        GpuDataType.field_a[1] = 0.0f;
        jaggl.OpenGL.glTexGenfv(8194, 9473, GpuDataType.field_a, 0);
        if (param0 > 39) {
          return;
        }
        this.d(2);
    }

    final void a(byte param0, boolean param1) {
        float var3 = 0.0f;
        if (this.field_b.field_kc > 0) {
          var3 = -0.5f / (float)this.field_b.field_kc;
          this.field_b.g(1, 92);
          GpuDataType.field_a[1] = 0.0f;
          GpuDataType.field_a[3] = 0.25f + var3 * this.field_b.field_bc;
          GpuDataType.field_a[2] = var3;
          GpuDataType.field_a[0] = 0.0f;
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glTexGenfv(8192, 9474, GpuDataType.field_a, 0);
          jaggl.OpenGL.glPopMatrix();
          this.field_b.a(0.5f, 15, (float)this.field_b.field_kc);
          this.field_b.bindTexture(11, this.field_l);
          this.field_b.g(0, 115);
        }
        this.field_j.a((byte) 121, '\0');
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPushMatrix();
        if (param0 < 33) {
          this.a((byte) -60, 117, -110);
        } else {
          jaggl.OpenGL.glScalef(0.25f, 0.25f, 1.0f);
          jaggl.OpenGL.glMatrixMode(5888);
          return;
        }
        jaggl.OpenGL.glScalef(0.25f, 0.25f, 1.0f);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    gi(LegacyOpenGlGraphicsToolkit param0, ch param1) {
        super(param0);
        try {
          this.field_e = param1;
          this.d(-53);
          this.field_l = new LegacyOpenGlTexture1D(this.field_b, 6406, 2, new byte[]{(byte) 0, (byte)-1}, 6406);
          this.field_l.setRepeat(false, (byte) 126);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        this.field_j = new tq(this.field_b, 2);
        this.field_j.a(0, 4864);
        this.field_b.g(1, 100);
        this.field_b.a(20685, 260, 7681);
        this.field_b.b(34168, 768, 0, 104);
        jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
        jaggl.OpenGL.glEnable(3168);
        this.field_b.g(0, 123);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 2.0f);
        if (this.field_e.field_g) {
          jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
          jaggl.OpenGL.glTexGeni(8195, 9472, 9217);
          jaggl.OpenGL.glTexGenfv(8195, 9473, new float[]{0.0f, 0.0f, 0.0f, 1.0f}, 0);
          jaggl.OpenGL.glEnable(3170);
          jaggl.OpenGL.glEnable(3171);
        }
        this.field_j.a(true);
        this.field_j.a(1, 4864);
        if (param0 >= -38) {
          field_k = (int[]) null;
          this.field_b.g(1, 110);
          this.field_b.a(20685, 8448, 8448);
          this.field_b.b(5890, 768, 0, -118);
          jaggl.OpenGL.glDisable(3168);
          this.field_b.g(0, 95);
          jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
          if (this.field_e.field_g) {
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glDisable(3171);
          } else {
            this.field_j.a(true);
            return;
          }
          this.field_j.a(true);
          return;
        }
        this.field_b.g(1, 110);
        this.field_b.a(20685, 8448, 8448);
        this.field_b.b(5890, 768, 0, -118);
        jaggl.OpenGL.glDisable(3168);
        this.field_b.g(0, 95);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
        if (this.field_e.field_g) {
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glDisable(3171);
        } else {
          this.field_j.a(true);
          return;
        }
        this.field_j.a(true);
    }

    final void a(byte param0, int param1, LegacyOpenGlTexture param2) {
        try {
          if (param0 != 35) {
            this.field_l = (LegacyOpenGlTexture1D) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gi.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        ScanlineSpriteMask.field_e = param0;
        tm.field_d = param1;
        if (param2 > -75) {
          gi.releaseStatics(48);
        }
    }

    static {
        field_g = new qr();
        field_k = new int[8192];
        notYetAchievedText = "Not yet achieved";
    }
}
