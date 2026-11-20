/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ssb extends qg {
    private OpenGlTexture1D field_c;
    private bt field_d;
    private jjb field_e;

    final void a(boolean param0, boolean param1) {
        if (!param0) {
          return;
        }
        this.field_b.setTextureCombineOperations(260, 8448, !param0 ? true : false);
    }

    ssb(OpenGlToolkit param0, jjb param1) {
        super(param0);
        try {
          this.field_e = param1;
          this.d(34163);
          this.field_c = new OpenGlTexture1D(this.field_b, 6406, 2, new byte[]{(byte) 0, (byte)-1}, 6406);
          this.field_c.setWrap(false, true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ssb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, OpenGlTexture param2) {
        try {
          if (param1 != 125) {
            this.field_c = (OpenGlTexture1D) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ssb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        this.field_d.a(true, '\001');
        if (0 >= this.field_b.field_jc) {
          this.field_b.setTextureCombineOperations(8448, 8448, false);
          jaggl.OpenGL.glMatrixMode(param0);
          jaggl.OpenGL.glPopMatrix();
          jaggl.OpenGL.glMatrixMode(5888);
          return;
        }
        this.field_b.setActiveTextureUnit(33984, 1);
        this.field_b.bindTexture(61, (OpenGlTexture) null);
        this.field_b.setFogRangeAdjustments(0.0f, 1.0f, param0 - 5890);
        this.field_b.setActiveTextureUnit(33984, 0);
        this.field_b.setTextureCombineOperations(8448, 8448, false);
        jaggl.OpenGL.glMatrixMode(param0);
        jaggl.OpenGL.glPopMatrix();
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void a(boolean param0, int param1) {
        float var3 = 0.0f;
        if (!(this.field_b.field_jc <= 0)) {
          var3 = -0.5f / (float)this.field_b.field_jc;
          this.field_b.setActiveTextureUnit(33984, 1);
          GetSniperCannonRandomness.field_p[2] = var3;
          GetSniperCannonRandomness.field_p[3] = var3 * this.field_b.field_wb + 0.25f;
          GetSniperCannonRandomness.field_p[0] = 0.0f;
          GetSniperCannonRandomness.field_p[1] = 0.0f;
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glTexGenfv(8192, 9474, GetSniperCannonRandomness.field_p, 0);
          jaggl.OpenGL.glPopMatrix();
          this.field_b.setFogRangeAdjustments((float)this.field_b.field_jc, 0.5f, 0);
          this.field_b.bindTexture(68, this.field_c);
          this.field_b.setActiveTextureUnit(33984, 0);
        }
        this.field_d.a(true, '\0');
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPushMatrix();
        jaggl.OpenGL.glScalef(0.25f, 0.25f, 1.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        if (param1 >= 18) {
          return;
        }
        this.field_d = (bt) null;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var4Lifetime1;
        if (param1 != -25139) {
          this.field_e = (jjb) null;
          if ((param0 & 1) == 1) {
            if (!this.field_e.field_d) {
              var4 = 16 * (this.field_b.field_Mc % 4000) / 4000;
              this.field_b.bindTexture(66, this.field_e.field_e[var4]);
              return;
            }
            this.field_b.bindTexture(35, this.field_e.field_b);
            GetSniperCannonRandomness.field_p[2] = 0.0f;
            GetSniperCannonRandomness.field_p[3] = (float)(this.field_b.field_Mc % 4000) / 4000.0f;
            GetSniperCannonRandomness.field_p[1] = 0.0f;
            GetSniperCannonRandomness.field_p[0] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, GetSniperCannonRandomness.field_p, 0);
            return;
          }
          if (this.field_e.field_d) {
            this.field_b.bindTexture(123, this.field_e.field_b);
            GetSniperCannonRandomness.field_p[1] = 0.0f;
            GetSniperCannonRandomness.field_p[2] = 0.0f;
            GetSniperCannonRandomness.field_p[0] = 0.0f;
            GetSniperCannonRandomness.field_p[3] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, GetSniperCannonRandomness.field_p, 0);
            return;
          }
          this.field_b.bindTexture(93, this.field_e.field_e[0]);
          return;
        }
        if ((param0 & 1) == 1) {
          if (!this.field_e.field_d) {
            var4Lifetime1 = 16 * (this.field_b.field_Mc % 4000) / 4000;
            this.field_b.bindTexture(66, this.field_e.field_e[var4Lifetime1]);
            return;
          }
          this.field_b.bindTexture(35, this.field_e.field_b);
          GetSniperCannonRandomness.field_p[2] = 0.0f;
          GetSniperCannonRandomness.field_p[3] = (float)(this.field_b.field_Mc % 4000) / 4000.0f;
          GetSniperCannonRandomness.field_p[1] = 0.0f;
          GetSniperCannonRandomness.field_p[0] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, GetSniperCannonRandomness.field_p, 0);
          return;
        }
        if (this.field_e.field_d) {
          this.field_b.bindTexture(123, this.field_e.field_b);
          GetSniperCannonRandomness.field_p[1] = 0.0f;
          GetSniperCannonRandomness.field_p[2] = 0.0f;
          GetSniperCannonRandomness.field_p[0] = 0.0f;
          GetSniperCannonRandomness.field_p[3] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, GetSniperCannonRandomness.field_p, 0);
          return;
        }
        this.field_b.bindTexture(93, this.field_e.field_e[0]);
    }

    private final void d(int param0) {
        this.field_d = new bt(this.field_b, 2);
        this.field_d.a(-105, 0);
        this.field_b.setActiveTextureUnit(33984, 1);
        this.field_b.setTextureCombineOperations(7681, 260, false);
        this.field_b.setRgbCombineArgument(0, 34192, 768, 34168);
        jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
        jaggl.OpenGL.glEnable(3168);
        this.field_b.setActiveTextureUnit(33984, 0);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 2.0f);
        if (this.field_e.field_d) {
          jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
          jaggl.OpenGL.glTexGeni(8195, 9472, 9217);
          jaggl.OpenGL.glTexGenfv(8195, 9473, new float[]{0.0f, 0.0f, 0.0f, 1.0f}, 0);
          jaggl.OpenGL.glEnable(3170);
          jaggl.OpenGL.glEnable(3171);
        }
        this.field_d.b(4864);
        this.field_d.a(-115, 1);
        this.field_b.setActiveTextureUnit(33984, 1);
        this.field_b.setTextureCombineOperations(8448, 8448, false);
        this.field_b.setRgbCombineArgument(0, 34192, 768, 5890);
        jaggl.OpenGL.glDisable(3168);
        this.field_b.setActiveTextureUnit(param0 ^ 435, 0);
        jaggl.OpenGL.glTexEnvf(8960, param0, 1.0f);
        if (!this.field_e.field_d) {
          this.field_d.b(param0 - 29299);
          return;
        }
        jaggl.OpenGL.glDisable(3170);
        jaggl.OpenGL.glDisable(3171);
        this.field_d.b(param0 - 29299);
    }

    final boolean b(int param0) {
        if (param0 >= -87) {
          this.field_d = (bt) null;
          return true;
        }
        return true;
    }

    static {
    }
}
