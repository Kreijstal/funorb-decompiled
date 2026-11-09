/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyTurbulentWaterNoise extends TurbulenceNoise3D {
    private byte[] pixels;

    final void writeVoxel(int index, byte value, int bias) {
        int var4 = 2 * index;
        value = (byte)(bias + ((255 & value) >> 1));
        int incrementValue$0 = var4;
        var4++;
        this.pixels[incrementValue$0] = (byte)value;
        this.pixels[var4] = (byte)value;
    }

    final byte[] generate(int depth, byte guard, int width, int height) {
        this.pixels = new byte[2 * (width * (height * depth))];
        this.generateVolume(depth, guard + 214, height, width);
        if (guard == -8) {
          return this.pixels;
        }
        return (byte[]) null;
    }

    LegacyTurbulentWaterNoise() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final static void advanceToNextLevel(int guard) {
        il.field_a = FadingWidget.score;
        OpenGlShaderProgram.levelIndex = OpenGlShaderProgram.levelIndex + 1;
        kr.field_e = 3;
        uk.field_ob = true;
        if (!jl.a(-89)) {
          return;
        }
        ke.a(false);
        nv.field_a = 0;
        pd.field_p = un.field_a[0];
        FadingWidget.score = 0;
        CacheReferenceNode.field_u = 0;
        gn.a(guard, true);
        TextLayout.a(0, 1 + OpenGlShaderProgram.levelIndex % 5);
    }

    static {
    }
}
