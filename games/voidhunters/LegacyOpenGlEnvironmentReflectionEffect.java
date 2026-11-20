/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlEnvironmentReflectionEffect extends LegacyOpenGlMaterialEffect {
    private boolean active;
    static String field_f;
    static boolean field_e;
    private OpenGlDisplayLists displayLists;
    static int[][] field_g;

    LegacyOpenGlEnvironmentReflectionEffect(OpenGlToolkit param0) {
        super(param0);
        this.active = false;
        try {
          if (param0.field_S) {
            this.displayLists = new OpenGlDisplayLists(param0, 2);
            this.displayLists.beginList(-97, 0);
            this.toolkit.setActiveTextureUnit(33984, 1);
            this.toolkit.setTextureCombineOperations(34165, 7681, false);
            this.toolkit.setRgbCombineArgument(2, 34192, 770, 34168);
            this.toolkit.setAlphaCombineArgument(0, 770, 34167, 34184);
            jaggl.OpenGL.glTexGeni(8192, 9472, 34066);
            jaggl.OpenGL.glTexGeni(8193, 9472, 34066);
            jaggl.OpenGL.glTexGeni(8194, 9472, 34066);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glEnable(3170);
            this.toolkit.setActiveTextureUnit(33984, 0);
            this.displayLists.endList(4864);
            this.displayLists.beginList(-95, 1);
            this.toolkit.setActiveTextureUnit(33984, 1);
            this.toolkit.setTextureCombineOperations(8448, 8448, false);
            this.toolkit.setRgbCombineArgument(2, 34192, 770, 34166);
            this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            this.toolkit.setActiveTextureUnit(33984, 0);
            this.displayLists.endList(4864);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "uob.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isSupported(int param0) {
        if (param0 > -87) {
          this.disable(63);
          return true;
        }
        return true;
    }

    final void setTexture(int param0, byte param1, OpenGlTexture param2) {
        try {
          this.toolkit.bindTexture(param1 - 67, param2);
          this.toolkit.setTextureCombineMode(0, param0);
          if (param1 != 125) {
            field_f = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "uob.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_f = null;
        if (param0 != 3168) {
          LegacyOpenGlEnvironmentReflectionEffect.clearSharedReferences(71);
          field_g = (int[][]) null;
          return;
        }
        field_g = (int[][]) null;
    }

    final void enable(boolean param0, int param1) {
        OpenGlCubeTexture var3 = this.toolkit.getEnvironmentCubeTexture(false);
        if (param1 < 18) {
          field_f = (String) null;
          if (this.displayLists == null) {
            this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
            return;
          }
          if (var3 == null) {
            this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
            return;
          }
          if (!param0) {
            this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
            return;
          }
          this.displayLists.callList(true, '\0');
          this.toolkit.setActiveTextureUnit(33984, 1);
          this.toolkit.bindTexture(83, var3);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadMatrixf(this.toolkit.field_Bb.getRotationMatrix((byte) 43), 0);
          jaggl.OpenGL.glMatrixMode(5888);
          this.toolkit.setActiveTextureUnit(33984, 0);
          this.active = true;
          return;
        }
        if (this.displayLists == null) {
          this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
          return;
        }
        if (var3 == null) {
          this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
          return;
        }
        if (!param0) {
          this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
          return;
        }
        this.displayLists.callList(true, '\0');
        this.toolkit.setActiveTextureUnit(33984, 1);
        this.toolkit.bindTexture(83, var3);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadMatrixf(this.toolkit.field_Bb.getRotationMatrix((byte) 43), 0);
        jaggl.OpenGL.glMatrixMode(5888);
        this.toolkit.setActiveTextureUnit(33984, 0);
        this.active = true;
    }

    final static void updateProgressDialog(boolean param0, byte param1, String param2, float param3) {
        if (null == MatchingFieldValidator.field_i) {
          MatchingFieldValidator.field_i = new ProgressDialog(GetLagStandardDeviationIn.modalStack, EnvironmentReflectionGpuMaterialEffect.field_j);
          GetLagStandardDeviationIn.modalStack.pushPanel(false, MatchingFieldValidator.field_i);
        }
        MatchingFieldValidator.field_i.updateProgress(param0, param2, param3, (byte) -89);
        SoftwareRasterizer2D.clear();
        if (param1 < 26) {
          return;
        }
        try {
          GetPointDefenceLaserProjectileDamage.drawModalPanels(true, -114);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "uob.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param1 != -25139) {
          field_e = true;
        }
    }

    final void applyRenderState(boolean param0, boolean param1) {
        if (param0) {
          this.toolkit.setTextureCombineOperations(8448, 7681, false);
          return;
        }
        this.disable(-110);
        this.toolkit.setTextureCombineOperations(8448, 7681, false);
    }

    final void disable(int param0) {
        if (param0 != 5890) {
          this.enable(false, 47);
        }
        if (!this.active) {
          this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
          this.toolkit.setTextureCombineOperations(8448, 8448, false);
          this.active = false;
          return;
        }
        this.displayLists.callList(true, '\001');
        this.toolkit.setActiveTextureUnit(33984, 1);
        this.toolkit.bindTexture(69, (OpenGlTexture) null);
        this.toolkit.setActiveTextureUnit(33984, 0);
        this.toolkit.setTextureCombineOperations(8448, 8448, false);
        this.active = false;
    }

    static {
        field_f = "Invite only";
        field_g = new int[1][0];
    }
}
