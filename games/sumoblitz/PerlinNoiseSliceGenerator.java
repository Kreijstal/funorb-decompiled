/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PerlinNoiseSliceGenerator extends NoiseSliceGenerator {
    private int[] permutation;
    static IntrusiveDeque field_g;
    static hv field_h;
    static String[] powerupEffectNames;

    PerlinNoiseSliceGenerator(int seed) {
        int dupTemp$0 = 0;
        Random var2;
        int var3;
        int var4;
        int var5;
        Random var7;
        int var8;
        int var3Lifetime1;
        this.permutation = new int[512];
        var7 = new Random((long)seed);
        var2 = var7;
        for (var3 = 0; var3 < 256; var3++) {
          this.permutation[var3 + 256] = var3;
          this.permutation[var3] = var3;
        }
        var8 = 0;
        var3Lifetime1 = var8;
        while (var8 < 256) {
          var4 = 255 & var7.nextInt();
          var5 = this.permutation[var4];
          dupTemp$0 = this.permutation[var8];
          this.permutation[256 + var4] = dupTemp$0;
          this.permutation[var4] = dupTemp$0;
          this.permutation[var8 + 256] = var5;
          this.permutation[var8] = var5;
          var8++;
        }
    }

    final void generateSlice(float stepX, int outputOffset, float stepY, float stepZ, int slice, int depth, int latticeStep, float[] output, int width, float amplitude, int height) {
        int var23 = 0;
        int var34 = 0;
        int incrementValue$1 = 0;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var21 = 0;
        int var22 = 0;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        float var35 = 0.0f;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var40 = 0.0f;
        int var41 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var12 = null;
        var41 = Sumoblitz.field_L ? 1 : 0;
        try {
          var12_int = (int)(-1.0f + stepX * (float)width);
          var12_int = var12_int & 255;
          var13 = (int)(stepY * (float)height - 1.0f);
          var13 = var13 & 255;
          var14 = (int)(-1.0f + stepZ * (float)depth);
          var14 = var14 & 255;
          var15 = (float)slice * stepZ;
          var16 = (int)var15;
          var17 = latticeStep + var16;
          var18 = (float)(-var16) + var15;
          var19 = 1.0f - var18;
          var17 = var17 & var14;
          var20 = PacketBuffer.quinticSmoothStep((byte) 124, var18);
          var16 = var16 & var14;
          var21 = this.permutation[var16];
          var22 = this.permutation[var17];
          for (var23 = 0; var23 < height; var23++) {
            var24 = stepY * (float)var23;
            var25 = (int)var24;
            var26 = var25 + 1;
            var27 = var24 - (float)var25;
            var28 = 1.0f - var27;
            var26 = var26 & var13;
            var29 = PacketBuffer.quinticSmoothStep((byte) 124, var27);
            var25 = var25 & var13;
            var30 = this.permutation[var21 + var25];
            var31 = this.permutation[var21 + var26];
            var32 = this.permutation[var22 + var25];
            var33 = this.permutation[var26 + var22];
            for (var34 = 0; var34 < width; var34++) {
              var35 = (float)var34 * stepX;
              var36 = (int)var35;
              var37 = var36 + 1;
              var38 = (float)(-var36) + var35;
              var39 = -var38 + 1.0f;
              var40 = PacketBuffer.quinticSmoothStep((byte) 124, var38);
              var37 = var37 & var12_int;
              var36 = var36 & var12_int;
              incrementValue$1 = outputOffset;
              outputOffset++;
              output[incrementValue$1] = amplitude * ProxySocketConnector.lerp(1050, ProxySocketConnector.lerp(1050, ProxySocketConnector.lerp(GzipDecompressor.bitwiseXor(latticeStep, 1051), an.noiseGradientDot(var28, var19, LegacyOpenGlPostProcessManager.bitwiseAnd(7, this.permutation[var30 + var36]), var39, 2), an.noiseGradientDot(var28, var19, LegacyOpenGlPostProcessManager.bitwiseAnd(7, this.permutation[var37 + var30]), var38, GzipDecompressor.bitwiseXor(latticeStep, 3)), var40), ProxySocketConnector.lerp(1050, an.noiseGradientDot(var27, var19, LegacyOpenGlPostProcessManager.bitwiseAnd(7, this.permutation[var31 + var36]), var39, latticeStep + 1), an.noiseGradientDot(var27, var19, LegacyOpenGlPostProcessManager.bitwiseAnd(7, this.permutation[var37 + var31]), var38, 2), var40), var29), ProxySocketConnector.lerp(1050, ProxySocketConnector.lerp(1050, an.noiseGradientDot(var28, var18, LegacyOpenGlPostProcessManager.bitwiseAnd(7, this.permutation[var32 + var36]), var39, 2), an.noiseGradientDot(var28, var18, LegacyOpenGlPostProcessManager.bitwiseAnd(this.permutation[var32 + var37], 7), var38, latticeStep + 1), var40), ProxySocketConnector.lerp(1050, an.noiseGradientDot(var27, var18, LegacyOpenGlPostProcessManager.bitwiseAnd(this.permutation[var36 + var33], 7), var39, 2), an.noiseGradientDot(var27, var18, LegacyOpenGlPostProcessManager.bitwiseAnd(7, this.permutation[var33 + var37]), var38, 2), var40), var29), var20);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_10_0 = var12;
          stackIn_10_1 = new StringBuilder().append("vu.B(").append(stepX).append(',').append(outputOffset).append(',').append(stepY).append(',').append(stepZ).append(',').append(slice).append(',').append(depth).append(',').append(latticeStep).append(',');
          if (output == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(width).append(',').append(amplitude).append(',').append(height).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_g = null;
        if (param0 != -69) {
          PerlinNoiseSliceGenerator.releaseStatics((byte) 1);
        }
        field_h = null;
        powerupEffectNames = null;
    }

    static {
        field_g = new IntrusiveDeque();
        field_h = new hv();
        powerupEffectNames = new String[]{"None", "Permanent speed up", "Permanent bounce up", "Permanent traction up", "Temporary speed up", "Temporary bounce up", "Temporary traction up"};
    }
}
