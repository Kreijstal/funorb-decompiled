/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw extends qe {
    private tla field_g;
    static hea field_e;
    private uga field_d;
    private aaa field_c;
    private static String[] field_f;

    final void a(int param0, int param1, int param2) {
        int var5 = TombRacer.field_G ? 1 : 0;
        if ((param0 & 1) != 1) {
          if (this.field_c.field_g) {
            this.field_a.a(true, this.field_c.field_h);
            hba.field_a[3] = 0.0f;
            hba.field_a[2] = 0.0f;
            hba.field_a[0] = 0.0f;
            hba.field_a[1] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, hba.field_a, 0);
            if (param2 <= 117) {
              this.b(-10);
              return;
            }
            return;
          }
          this.field_a.a(true, this.field_c.field_f[0]);
          if (param2 <= 117) {
            this.b(-10);
            return;
          }
          return;
        }
        if (this.field_c.field_g) {
          this.field_a.a(true, this.field_c.field_h);
          hba.field_a[1] = 0.0f;
          hba.field_a[0] = 0.0f;
          hba.field_a[2] = 0.0f;
          hba.field_a[3] = (float)(this.field_a.field_Oc % 4000) / 4000.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, hba.field_a, 0);
          if (param2 > 117) {
            return;
          }
          this.b(-10);
          return;
        }
        int var4 = this.field_a.field_Oc % 4000 * 16 / 4000;
        this.field_a.a(true, this.field_c.field_f[var4]);
        if (param2 > 117) {
          return;
        }
        this.b(-10);
    }

    final static java.awt.Canvas b(byte param0) {
        if (param0 == -97) {
          return null != dq.field_f ? (java.awt.Canvas) ((Object) dq.field_f) : nma.field_l;
        }
        kw.a(76, true, 70);
        return null != dq.field_f ? (java.awt.Canvas) ((Object) dq.field_f) : nma.field_l;
    }

    private final void a(byte param0) {
        kl var3 = null;
        this.field_g = new tla(this.field_a, 2);
        this.field_g.a((byte) 6, 0);
        this.field_a.e(1, true);
        this.field_a.b(7681, 8960, 260);
        this.field_a.c(0, 0, 34168, 768);
        jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
        jaggl.OpenGL.glEnable(3168);
        this.field_a.e(0, true);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 2.0f);
        if (this.field_c.field_g) {
          jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
          jaggl.OpenGL.glTexGeni(8195, 9472, 9217);
          jaggl.OpenGL.glTexGenfv(8195, 9473, new float[]{0.0f, 0.0f, 0.0f, 1.0f}, 0);
          jaggl.OpenGL.glEnable(3170);
          jaggl.OpenGL.glEnable(3171);
        }
        this.field_g.b((byte) -119);
        this.field_g.a((byte) 6, 1);
        this.field_a.e(1, true);
        this.field_a.b(8448, 8960, 8448);
        this.field_a.c(0, 0, 5890, 768);
        jaggl.OpenGL.glDisable(3168);
        this.field_a.e(0, true);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
        if (this.field_c.field_g) {
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glDisable(3171);
        }
        if (param0 > -47) {
          var3 = (kl) null;
          this.a(73, 20, (kl) null);
        } else {
          this.field_g.b((byte) 89);
          return;
        }
        this.field_g.b((byte) 89);
    }

    kw(OpenGlToolkit param0, aaa param1) {
        super(param0);
        try {
          this.field_c = param1;
          this.a((byte) -122);
          this.field_d = new uga(this.field_a, 6406, 2, new byte[]{(byte) 0, (byte)-1}, 6406);
          this.field_d.a(76, false);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        BitPacketBuffer var3 = ql.field_k;
        var3.writeCipheredOpcode(param0, -2988);
        var3.writeByte(3, 0);
        var3.writeByte(10, 0);
        if (!param1) {
          var3.writeShort(-1477662136, param2);
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
          this.field_d = (uga) null;
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, kl param2) {
        try {
          if (param1 != 32221) {
            this.a(false);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kw.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        float var4 = 0.0f;
        int var3 = -115 % ((56 - param1) / 48);
        if (this.field_a.field_Kb > 0) {
          var4 = -0.5f / (float)this.field_a.field_Kb;
          this.field_a.e(1, true);
          hba.field_a[2] = var4;
          hba.field_a[0] = 0.0f;
          hba.field_a[3] = 0.25f + var4 * this.field_a.field_Uc;
          hba.field_a[1] = 0.0f;
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glTexGenfv(8192, 9474, hba.field_a, 0);
          jaggl.OpenGL.glPopMatrix();
          this.field_a.a((float)this.field_a.field_Kb, true, 0.5f);
          this.field_a.a(true, this.field_d);
          this.field_a.e(0, true);
        }
        this.field_g.a(4864, '\0');
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPushMatrix();
        jaggl.OpenGL.glScalef(0.25f, 0.25f, 1.0f);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 5888) {
          var2 = (param0 * param0 >> 12) * param0 >> 12;
          var3 = 6 * param0 - 61440;
          var4 = (var3 * param0 >> 12) + 40960;
          return var4 * var2 >> 12;
        }
        field_e = (hea) null;
        var2Lifetime1 = (param0 * param0 >> 12) * param0 >> 12;
        var3Lifetime1 = 6 * param0 - 61440;
        var4Lifetime1 = (var3Lifetime1 * param0 >> 12) + 40960;
        return var4Lifetime1 * var2Lifetime1 >> 12;
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_f = null;
        int var1 = -81 % ((param0 - 49) / 51);
    }

    final void a(boolean param0) {
        this.field_g.a(4864, '\001');
        if (!(this.field_a.field_Kb <= 0)) {
          this.field_a.e(1, true);
          this.field_a.a(true, (kl) null);
          this.field_a.a(0.0f, true, 1.0f);
          this.field_a.e(0, true);
        }
        this.field_a.b(8448, 8960, 8448);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPopMatrix();
        jaggl.OpenGL.glMatrixMode(5888);
        if (!param0) {
          return;
        }
        this.b(true, 64);
    }

    final void b(boolean param0, int param1) {
        this.field_a.b(260, 8960, 8448);
        if (param1 < 77) {
          kw.a(34, false, -44);
        }
    }

    static {
        field_f = new String[4];
        field_f[2] = "bigticktime";
        field_f[1] = "quickticktime";
        field_f[0] = "info";
        field_f[3] = "mainlooptime";
    }
}
