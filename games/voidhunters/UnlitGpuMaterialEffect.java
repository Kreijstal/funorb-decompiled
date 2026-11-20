/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnlitGpuMaterialEffect extends GpuMaterialEffect {
    static int[] field_f;
    static int field_e;

    final void enable(int param0, boolean param1) {
        if (param0 == 5) {
          this.toolkit.setLightingSuppressed(true, 44);
          return;
        }
        this.enable(91, false);
        this.toolkit.setLightingSuppressed(true, 44);
    }

    final boolean isSupported(byte param0) {
        int var2 = -118 % ((34 - param0) / 63);
        return true;
    }

    UnlitGpuMaterialEffect(GpuToolkit param0) {
        super(param0);
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param2 != 5) {
          UnlitGpuMaterialEffect.clearSharedReferences(80);
        }
    }

    final void disable(int param0) {
        this.toolkit.setLightingSuppressed(false, 75);
        if (param0 != 2543) {
          field_e = 30;
        }
    }

    final void applyRenderState(int param0, boolean param1) {
        if (param0 != 5) {
          GpuTexture var4 = (GpuTexture) null;
          this.setTexture((byte) 1, -18, (GpuTexture) null);
        }
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        if (param0 < 42) {
          return;
        }
        try {
          this.toolkit.setTexture(param2, -119);
          this.toolkit.setTextureCombineMode(-127, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sv.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_f = null;
        if (param0 != 0) {
          field_e = -79;
        }
    }

    static {
        field_e = 0;
    }
}
