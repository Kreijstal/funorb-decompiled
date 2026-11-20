/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hab extends GpuMaterialEffect {
    private boolean field_f;
    static int field_k;
    static int field_i;
    static String field_j;
    static int field_h;
    static ShipComponentDefinition[] field_g;
    static String field_e;

    final void applyRenderState(int param0, boolean param1) {
        if (param0 != 5) {
          return;
        }
        this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, OpenGlGlyphMask.field_a);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -18951) {
          return;
        }
        field_e = null;
        field_g = null;
        field_j = null;
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param2 != 5) {
          this.disable(88);
        }
    }

    hab(GpuToolkit param0) {
        super(param0);
        this.field_f = false;
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        try {
          this.toolkit.setTexture(param2, -121);
          if (param0 <= 42) {
            this.applyRenderState(-13, true);
          }
          this.toolkit.setTextureCombineMode(-126, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hab.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void enable(int param0, boolean param1) {
        GpuTransform3D var4 = null;
        if (param0 != 5) {
          return;
        }
        GpuCubeTexture var3 = this.toolkit.getEnvironmentCubeTexture(10);
        if (var3 == null) {
          this.toolkit.setAlphaCombineSource(0, (byte) -78, GetArmageddonLength.field_q);
          return;
        }
        if (param1) {
          this.toolkit.setActiveTextureUnit(1, -97);
          this.toolkit.setTexture(var3, param0 - 119);
          this.toolkit.setTextureCoordinateMode((byte) -111, GetArmageddonLength.field_p);
          this.toolkit.setActiveTextureUnit(1, param0 ^ -60);
          this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, SetThrusterBindingMoveAndTurnHasOppositeMove.field_o);
          this.toolkit.setRgbCombineSource(true, param0 ^ -21120, false, pja.field_l, 2);
          this.toolkit.setAlphaCombineSource(0, (byte) -97, GetArmageddonLength.field_q);
          var4 = this.toolkit.getTextureTransform((byte) -125);
          var4.copyRotationWithXTranslation(param0 ^ 5, this.toolkit.getInverseViewTransform((byte) 103));
          this.toolkit.setTextureTransformMode(LoadSettings.field_o, true);
          this.toolkit.setActiveTextureUnit(0, -71);
          this.field_f = true;
          return;
        }
        this.toolkit.setAlphaCombineSource(0, (byte) -78, GetArmageddonLength.field_q);
    }

    final boolean isSupported(byte param0) {
        int var2 = 26 / ((34 - param0) / 63);
        return true;
    }

    final void disable(int param0) {
        if (!this.field_f) {
          this.toolkit.setAlphaCombineSource(0, (byte) -97, SetGrapplingHookMaxExtension8Force.field_q);
          this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
          if (param0 != 2543) {
            field_i = -56;
            return;
          }
          return;
        }
        this.toolkit.setActiveTextureUnit(1, -43);
        this.toolkit.setTextureCoordinateMode((byte) -111, meb.field_d);
        this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
        this.toolkit.setRgbCombineSource(2, pea.field_d, param0 - 2536);
        this.toolkit.setAlphaCombineSource(0, (byte) -125, SetGrapplingHookMaxExtension8Force.field_q);
        this.toolkit.resetTextureTransform((byte) 116);
        this.toolkit.setTexture((GpuTexture) null, param0 - 2652);
        this.toolkit.setActiveTextureUnit(0, param0 ^ -2481);
        this.field_f = false;
        this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
        if (param0 != 2543) {
          field_i = -56;
          return;
        }
    }

    static {
        field_i = 100;
        field_j = null;
        field_e = "Add action (Add node info to custom variable)";
        field_h = 4;
    }
}
