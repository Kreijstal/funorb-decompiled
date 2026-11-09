/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PerlinNoise2D extends TextureGeneratorNode {
    boolean normalizeOutput;
    int repeatX;
    private short[] amplitudesQ12;
    static ProjectionMode ORTHOGRAPHIC;
    private byte[] permutation;
    private int seed;
    int octaveCount;
    static String[] membershipBenefitLines;
    int persistenceQ12;
    int repeatY;
    static int[] field_t;
    private short[] frequencies;
    static float[] transformMatrixScratch;

    final void fillRow(int guard, int row, int[] output) {
        int var7 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var4_intLifetime3;
        int var6Lifetime3;
        int var10Lifetime3;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = this.repeatY * SpriteOptionRenderer.field_o[row];
          if (guard != -28696) {
            return;
          }
          if (1 == this.octaveCount) {
            var9 = this.amplitudesQ12[0];
            var8 = this.frequencies[0] << 12;
            var13 = var8 * this.repeatY >> 12;
            var11 = var5 * var8 >> 12;
            var12 = var8 * this.repeatX >> 12;
            var15 = var11 >> 12;
            var16 = 1 + var15;
            if (var16 >= var13) {
              var16 = 0;
            }
            var11 = var11 & 4095;
            var17 = this.permutation[255 & var15] & 255;
            var18 = this.permutation[var16 & 255] & 255;
            var14 = SpriteState.noiseFadeQ12[var11];
            if (!this.normalizeOutput) {
              for (var10 = 0; ClientStackTraceFormatter.field_b > var10; var10++) {
                var4_int = MouseInputRegistration.field_b[var10] * this.repeatX;
                var6 = this.interpolateCell(var18, var14, 3, var12, var11, var4_int * var8 >> 12, var17);
                output[var10] = var6 * var9 >> 12;
              }
              return;
            }
            for (var10Lifetime3 = 0; var10Lifetime3 < ClientStackTraceFormatter.field_b; var10Lifetime3++) {
              var4_intLifetime3 = this.repeatX * MouseInputRegistration.field_b[var10Lifetime3];
              var6Lifetime3 = this.interpolateCell(var18, var14, 3, var12, var11, var8 * var4_intLifetime3 >> 12, var17);
              var6Lifetime3 = var6Lifetime3 * var9 >> 12;
              output[var10Lifetime3] = (var6Lifetime3 >> 1) + 2048;
            }
            return;
          }
          var9Lifetime1 = this.amplitudesQ12[0];
          if (8 < var9Lifetime1 ||
            -8 > var9Lifetime1) {
            var8Lifetime1 = this.frequencies[0] << 12;
            var12Lifetime1 = var8Lifetime1 * this.repeatX >> 12;
            var13Lifetime1 = this.repeatY * var8Lifetime1 >> 12;
            var11Lifetime1 = var5 * var8Lifetime1 >> 12;
            var15Lifetime1 = var11Lifetime1 >> 12;
            var16Lifetime1 = var15Lifetime1 + 1;
            if (var13Lifetime1 <= var16Lifetime1) {
              var16Lifetime1 = 0;
            }
            var11Lifetime1 = var11Lifetime1 & 4095;
            var18Lifetime1 = 255 & this.permutation[255 & var16Lifetime1];
            var17Lifetime1 = 255 & this.permutation[255 & var15Lifetime1];
            var14Lifetime1 = SpriteState.noiseFadeQ12[var11Lifetime1];
            for (var10Lifetime1 = 0; ClientStackTraceFormatter.field_b > var10Lifetime1; var10Lifetime1++) {
              var4_intLifetime1 = MouseInputRegistration.field_b[var10Lifetime1] * this.repeatX;
              var6Lifetime1 = this.interpolateCell(var18Lifetime1, var14Lifetime1, guard + 28699, var12Lifetime1, var11Lifetime1, var8Lifetime1 * var4_intLifetime1 >> 12, var17Lifetime1);
              output[var10Lifetime1] = var9Lifetime1 * var6Lifetime1 >> 12;
            }
          }
          for (var7 = 1; var7 < this.octaveCount; var7++) {
            var9Lifetime2 = this.amplitudesQ12[var7];
            if (var9Lifetime2 > 8 ||
              var9Lifetime2 < -8) {
              var8Lifetime2 = this.frequencies[var7] << 12;
              var12Lifetime2 = this.repeatX * var8Lifetime2 >> 12;
              var13Lifetime2 = var8Lifetime2 * this.repeatY >> 12;
              var11Lifetime2 = var5 * var8Lifetime2 >> 12;
              var15Lifetime2 = var11Lifetime2 >> 12;
              var16Lifetime2 = 1 + var15Lifetime2;
              if (var16Lifetime2 >= var13Lifetime2) {
                var16Lifetime2 = 0;
              }
              var11Lifetime2 = var11Lifetime2 & 4095;
              var17Lifetime2 = 255 & this.permutation[var15Lifetime2 & 255];
              var14Lifetime2 = SpriteState.noiseFadeQ12[var11Lifetime2];
              var18Lifetime2 = 255 & this.permutation[255 & var16Lifetime2];
              if (this.normalizeOutput &&
                this.octaveCount - 1 == var7) {
                for (var10Lifetime2 = 0; ClientStackTraceFormatter.field_b > var10Lifetime2; var10Lifetime2++) {
                  var4_intLifetime2 = MouseInputRegistration.field_b[var10Lifetime2] * this.repeatX;
                  var6Lifetime2 = this.interpolateCell(var18Lifetime2, var14Lifetime2, 3, var12Lifetime2, var11Lifetime2, var4_intLifetime2 * var8Lifetime2 >> 12, var17Lifetime2);
                  var6Lifetime2 = output[var10Lifetime2] + (var9Lifetime2 * var6Lifetime2 >> 12);
                  output[var10Lifetime2] = 2048 + (var6Lifetime2 >> 1);
                }
              } else {
                for (var10Lifetime2 = 0; var10Lifetime2 < ClientStackTraceFormatter.field_b; var10Lifetime2++) {
                  var4_intLifetime2 = this.repeatX * MouseInputRegistration.field_b[var10Lifetime2];
                  var6Lifetime2 = this.interpolateCell(var18Lifetime2, var14Lifetime2, 3, var12Lifetime2, var11Lifetime2, var8Lifetime2 * var4_intLifetime2 >> 12, var17Lifetime2);
                  output[var10Lifetime2] = output[var10Lifetime2] + (var9Lifetime2 * var6Lifetime2 >> 12);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("mo.A(").append(guard).append(',').append(row).append(',');
          if (output == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static void playGameMusic(int guard, int trackId) {
        VertexBufferReference.playLoopedMusic(TimedSceneEffect.field_m[trackId], (byte) 56);
        int var2 = 29 % ((guard + 73) / 48);
    }

    final void initialize(int guard) {
        int var2 = 0;
        int var3;
        int var4;
        int[] var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.permutation = MusicPatch.noisePermutation(this.seed, -50);
        this.buildOctaves(guard + 126);
        for (var2 = this.octaveCount - 1; var2 >= 1; var2--) {
          var3 = this.amplitudesQ12[var2];
          if (var3 <= 8 &&
            var3 >= -8) {
            this.octaveCount = this.octaveCount - 1;
            continue;
          }
          break;
        }
        if (guard != -8) {
          var5 = (int[]) null;
          this.fillRow(14, 34, (int[]) null);
        }
    }

    PerlinNoise2D() {
        super(0, true);
        this.permutation = new byte[512];
        this.repeatX = 4;
        this.persistenceQ12 = 1638;
        this.seed = 0;
        this.normalizeOutput = true;
        this.repeatY = 4;
        this.octaveCount = 4;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 30643) {
          return false;
        }
        return EmailAvailabilityRequest.a(param1, (byte) -113, param0) & (((8192 & param1) != 0 ? true : false) | ResetStatsConfirmationOverlay.a(param1, param2 ^ -30697, param0) | GameInstructions.a(true, param0, param1));
    }

    private final int interpolateCell(int nextYHash, int yFade, int gradientMask, int repeatX, int yFractionQ12, int xQ12, int yHash) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var8Lifetime1;
        int var9Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var18 = Sumoblitz.field_L ? 1 : 0;
        var13 = xQ12 >> 12;
        var12 = var13 + 1;
        xQ12 = xQ12 & 4095;
        var13 = var13 & 255;
        if (repeatX <= var12) {
          var12 = 0;
        }
        var12 = var12 & 255;
        var10 = -4096 + yFractionQ12;
        var11 = -4096 + xQ12;
        var15 = SpriteState.noiseFadeQ12[xQ12];
        var14 = 3 & this.permutation[yHash + var13];
        if (var14 > 1) {
          if (var14 == 2) {
            stackIn_10_0 = xQ12 - yFractionQ12;
          } else {
            stackIn_10_0 = -xQ12 - yFractionQ12;
          }
          var8 = stackIn_10_0;
        } else {
          if (var14 == 0) {
            stackIn_6_0 = yFractionQ12 + xQ12;
          } else {
            stackIn_6_0 = -xQ12 + yFractionQ12;
          }
          var8 = stackIn_6_0;
        }
        var14Lifetime1 = this.permutation[yHash + var12] & 3;
        if (var14Lifetime1 <= 1) {
          if (var14Lifetime1 == 0) {
            stackIn_19_0 = yFractionQ12 + var11;
          } else {
            stackIn_19_0 = yFractionQ12 - var11;
          }
          var9 = stackIn_19_0;
        } else {
          if (2 != var14Lifetime1) {
            stackIn_15_0 = -var11 - yFractionQ12;
          } else {
            stackIn_15_0 = -yFractionQ12 + var11;
          }
          var9 = stackIn_15_0;
        }
        var16 = var8 + ((-var8 + var9) * var15 >> 12);
        var14Lifetime2 = gradientMask & this.permutation[var13 + nextYHash];
        if (var14Lifetime2 > 1) {
          if (var14Lifetime2 != 2) {
            stackIn_28_0 = -xQ12 - var10;
          } else {
            stackIn_28_0 = -var10 + xQ12;
          }
          var8Lifetime1 = stackIn_28_0;
        } else {
          if (var14Lifetime2 != 0) {
            stackIn_24_0 = var10 - xQ12;
          } else {
            stackIn_24_0 = var10 + xQ12;
          }
          var8Lifetime1 = stackIn_24_0;
        }
        var14Lifetime3 = this.permutation[nextYHash + var12] & 3;
        if (var14Lifetime3 <= 1) {
          if (0 != var14Lifetime3) {
            stackIn_37_0 = -var11 + var10;
          } else {
            stackIn_37_0 = var10 + var11;
          }
          var9Lifetime1 = stackIn_37_0;
        } else {
          if (var14Lifetime3 == 2) {
            stackIn_33_0 = var11 - var10;
          } else {
            stackIn_33_0 = -var11 - var10;
          }
          var9Lifetime1 = stackIn_33_0;
        }
        var17 = var8Lifetime1 + ((var9Lifetime1 - var8Lifetime1) * var15 >> 12);
        return (yFade * (-var16 + var17) >> 12) + var16;
    }

    public static void releaseStatics(int param0) {
        ORTHOGRAPHIC = null;
        field_t = null;
        transformMatrixScratch = null;
        if (param0 != 2) {
          membershipBenefitLines = (String[]) null;
        }
        membershipBenefitLines = null;
    }

    private final void buildOctaves(int guard) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.persistenceQ12 > 0) {
          this.frequencies = new short[this.octaveCount];
          this.amplitudesQ12 = new short[this.octaveCount];
          for (var2 = 0; var2 < this.octaveCount; var2++) {
            this.amplitudesQ12[var2] = (short)(int)(Math.pow((double)((float)this.persistenceQ12 / 4096.0f), (double)var2) * 4096.0);
            this.frequencies[var2] = (short)(int)Math.pow(2.0, (double)var2);
          }
        } else {
          if (this.amplitudesQ12 != null &&
            this.amplitudesQ12.length == this.octaveCount) {
            this.frequencies = new short[this.octaveCount];
            for (var2 = 0; this.octaveCount > var2; var2++) {
              this.frequencies[var2] = (short)(int)Math.pow(2.0, (double)var2);
            }
          }
        }
        if (guard <= 81) {
          PerlinNoise2D.playGameMusic(57, -58);
        }
    }

    static {
        membershipBenefitLines = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        ORTHOGRAPHIC = new ProjectionMode();
        field_t = new int[4];
        transformMatrixScratch = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
