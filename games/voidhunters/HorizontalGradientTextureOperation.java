/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HorizontalGradientTextureOperation extends TextureOperation {
    private static String field_z;

    final int[] getMonochromeRow(int param0, boolean param1) {
        if (!param1) {
          return (int[]) null;
        }
        return BoxBlurTextureOperation.textureXCoordinates;
    }

    public HorizontalGradientTextureOperation() {
        super(0, true);
    }

    static {
        field_z = "cdb.A(";
    }
}
