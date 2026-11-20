/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GpuMaterialEffect {
    static String field_c;
    static int field_b;
    GpuToolkit toolkit;
    static String field_a;

    abstract void setParameters(int param0, int param1, int param2);

    void onProjectionChanged(boolean param0) {
        if (!param0) {
          this.onTextureTransformChanged(-18);
        }
    }

    abstract void applyRenderState(int param0, boolean param1);

    final static void buildToolkitFonts(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          if (!GetFighterBayAimarc.field_o) {
            return;
          }
          PlayerReadyFactory.field_b = new ToolkitFont[5];
          for (var1_int = 0; PlayerReadyFactory.field_b.length > var1_int; var1_int++) {
            PlayerReadyFactory.field_b[var1_int] = GetDebrisGroupColour.field_r.createFont(ShipBodyFactory.field_b[var1_int], CommandConsole.field_s[var1_int], DirectionalLightingTextureOperation.a((byte) -26, var1_int));
          }
          GetDebrisThrowable.a(false, "Finished building fonts");
          if (param0 == -2283) {
            return;
          }
          GpuMaterialEffect.clearSharedReferences((byte) 81);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "uda.L(" + param0 + ')');
        }
    }

    abstract void enable(int param0, boolean param1);

    void onModelTransformChanged(int param0) {
        if (param0 != 5) {
          this.disable(-37);
        }
    }

    abstract void disable(int param0);

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        if (param0 > -6) {
          GpuMaterialEffect.buildToolkitFonts(-56);
          field_c = null;
          return;
        }
        field_c = null;
    }

    void onDepthRangeChanged(boolean param0) {
        if (!param0) {
          field_b = -18;
        }
    }

    void onViewTransformChanged(byte param0) {
        if (param0 != 15) {
          field_c = (String) null;
        }
    }

    abstract boolean isSupported(byte param0);

    abstract void setTexture(byte param0, int param1, GpuTexture param2);

    GpuMaterialEffect(GpuToolkit param0) {
        try {
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uda.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    void onTextureTransformChanged(int param0) {
        if (param0 != 8) {
          this.setParameters(-80, -4, -126);
        }
    }

    static {
        field_b = 8;
        field_a = "Players";
        field_c = "Add <%0> to ignore list";
    }
}
