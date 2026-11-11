/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlReflectionEffect extends LegacyOpenGlEffect {
    private OpenGlDisplayLists field_d;
    private boolean field_c;
    static int field_e;
    static int[] field_f;
    static int field_g;

    final void bindTexture(int param0, int param1, LegacyOpenGlTexture param2) {
        try {
          if (param1 != 32221) {
            this.refreshState(true, -91);
          }
          this.toolkit.bindTexture(true, param2);
          this.toolkit.setTextureCombineMode(1, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ma.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void enable(boolean param0, int param1) {
        int var3 = 33 % ((56 - param1) / 48);
        LegacyOpenGlCubeTexture var4 = this.toolkit.environmentCubeTexture(16664);
        if (this.field_d == null) {
          this.toolkit.setAlphaCombineArgument(34168, 3, 0, 770);
          return;
        }
        if (var4 == null) {
          this.toolkit.setAlphaCombineArgument(34168, 3, 0, 770);
          return;
        }
        if (param0) {
          this.field_d.callList(4864, '\0');
          this.toolkit.setActiveTextureUnit(1, true);
          this.toolkit.bindTexture(true, var4);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadMatrixf(this.toolkit.field_Tc.rotationMatrix((byte) 57), 0);
          jaggl.OpenGL.glMatrixMode(5888);
          this.toolkit.setActiveTextureUnit(0, true);
          this.field_c = true;
          return;
        }
        this.toolkit.setAlphaCombineArgument(34168, 3, 0, 770);
    }

    final void disable(boolean param0) {
        if (!this.field_c) {
          this.toolkit.setAlphaCombineArgument(5890, 3, 0, 770);
        } else {
          this.field_d.callList(4864, '\001');
          this.toolkit.setActiveTextureUnit(1, true);
          this.toolkit.bindTexture(!param0 ? true : false, (LegacyOpenGlTexture) null);
          this.toolkit.setActiveTextureUnit(0, true);
        }
        this.toolkit.setTextureCombineOperations(8448, 8960, 8448);
        this.field_c = param0 ? true : false;
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param2 < 117) {
          this.field_d = (OpenGlDisplayLists) null;
        }
    }

    LegacyOpenGlReflectionEffect(OpenGlToolkit param0) {
        super(param0);
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = false;
        try {
          if (!param0.field_Kc) {
            return;
          }
          this.field_d = new OpenGlDisplayLists(param0, 2);
          this.field_d.beginList((byte) 6, 0);
          this.toolkit.setActiveTextureUnit(1, true);
          this.toolkit.setTextureCombineOperations(34165, 8960, 7681);
          this.toolkit.setTextureCombineOperands(2, 0, 34168, 770);
          this.toolkit.setAlphaCombineArgument(34167, 3, 0, 770);
          jaggl.OpenGL.glTexGeni(8192, 9472, 34066);
          jaggl.OpenGL.glTexGeni(8193, 9472, 34066);
          jaggl.OpenGL.glTexGeni(8194, 9472, 34066);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          jaggl.OpenGL.glEnable(3170);
          this.toolkit.setActiveTextureUnit(0, true);
          this.field_d.endList((byte) 5);
          this.field_d.beginList((byte) 6, 1);
          this.toolkit.setActiveTextureUnit(1, true);
          this.toolkit.setTextureCombineOperations(8448, 8960, 8448);
          this.toolkit.setTextureCombineOperands(2, 0, 34166, 770);
          this.toolkit.setAlphaCombineArgument(5890, 3, 0, 770);
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glMatrixMode(5888);
          this.toolkit.setActiveTextureUnit(0, true);
          this.field_d.endList((byte) 22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ma.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 9681) {
          LegacyOpenGlReflectionEffect.releaseStatics(37);
          field_f = null;
          return;
        }
        field_f = null;
    }

    final boolean isSupported(int param0) {
        if (param0 != -11921) {
          LegacyOpenGlReflectionEffect.releaseStatics(-2);
          return true;
        }
        return true;
    }

    final void refreshState(boolean param0, int param1) {
        if (param1 < 77) {
          return;
        }
        this.toolkit.setTextureCombineOperations(8448, 8960, 7681);
    }

    static {
        field_e = 4;
        field_f = new int[]{15, 12, 18, 41, 16};
    }
}
