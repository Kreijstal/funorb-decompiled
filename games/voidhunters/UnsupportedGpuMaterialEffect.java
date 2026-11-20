/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnsupportedGpuMaterialEffect extends GpuMaterialEffect {
    static java.math.BigInteger field_g;
    static String field_e;
    static int field_f;

    final void enable(int param0, boolean param1) {
        if (param0 != 5) {
          field_f = -59;
        }
    }

    final boolean isSupported(byte param0) {
        int var2 = -37 % ((param0 - 34) / 63);
        return false;
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        try {
          this.toolkit.setTexture(param2, -123);
          if (param0 <= 42) {
            field_g = (java.math.BigInteger) null;
          }
          this.toolkit.setTextureCombineMode(54, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bib.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void disable(int param0) {
        if (param0 != 2543) {
          field_g = (java.math.BigInteger) null;
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_g = null;
        field_e = null;
        if (param0) {
          field_g = (java.math.BigInteger) null;
        }
    }

    final void applyRenderState(int param0, boolean param1) {
        if (param0 != 5) {
          field_f = -43;
        }
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param2 != 5) {
          field_f = -9;
        }
    }

    UnsupportedGpuMaterialEffect(GpuToolkit param0) {
        super(param0);
    }

    static {
        field_g = new java.math.BigInteger("65537");
        field_e = "Lobby";
        field_f = 50;
    }
}
