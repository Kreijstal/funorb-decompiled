/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class FixedPointPerlinNoise3D {
    private int periodY;
    int octaveCount;
    static String field_h;
    private short[] octaveFrequencies;
    private int seed;
    private int periodZ;
    private short[] permutation;
    static String field_d;
    static EmailValidationError EMPTY_EMAIL;
    private int periodX;

    abstract void finishVoxel(boolean guard);

    final void generateVolume(int depth, int guard, int height, int width) {
        int var37 = 0;
        int var36 = 0;
        int var35 = 0;
        int var38 = 0;
        int var6 = 0;
        int var8 = 0;
        int var5 = 0;
        int var7 = 0;
        int var10 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var21 = 0;
        int var22 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        int var23 = 0;
        int var19 = 0;
        int var24 = 0;
        int var27 = 0;
        int var25 = 0;
        int var28 = 0;
        int var26 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var42 = 0;
        int var43 = Sumoblitz.field_L ? 1 : 0;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var30Lifetime1;
        int var30Lifetime2;
        int var30Lifetime3;
        int var31Lifetime1;
        int var32Lifetime1;
        int var42Lifetime1;
        int var42Lifetime2;
        int var42Lifetime3;
        if (guard != 206) {
          this.permutation = (short[]) null;
        }
        int[] var48 = new int[width];
        int[] var45 = var48;
        int[] var39 = var45;
        int[] var47 = new int[height];
        int[] var44 = var47;
        int[] var40 = var44;
        int[] var49 = new int[depth];
        int[] var46 = var49;
        int[] var41 = var46;
        for (var42 = 0; width > var42; var42++) {
          var39[var42] = (var42 << 12) / width;
        }
        for (var42Lifetime1 = 0; height > var42Lifetime1; var42Lifetime1++) {
          var40[var42Lifetime1] = (var42Lifetime1 << 12) / height;
        }
        for (var42Lifetime2 = 0; depth > var42Lifetime2; var42Lifetime2++) {
          var41[var42Lifetime2] = (var42Lifetime2 << 12) / depth;
        }
        this.resetOutput(-21);
        for (var37 = 0; var37 < depth; var37++) {
          for (var36 = 0; height > var36; var36++) {
            for (var35 = 0; width > var35; var35++) {
              for (var38 = 0; this.octaveCount > var38; var38++) {
                var42Lifetime3 = this.octaveFrequencies[var38] << 12;
                var6 = var47[var36] * var42Lifetime3 >> 12;
                var8 = this.periodX * var42Lifetime3 >> 12;
                var5 = var48[var35] * var42Lifetime3 >> 12;
                var7 = var42Lifetime3 * var49[var37] >> 12;
                var10 = this.periodZ * var42Lifetime3 >> 12;
                var9 = this.periodY * var42Lifetime3 >> 12;
                var7 = var7 * this.periodZ;
                var6 = var6 * this.periodY;
                var5 = var5 * this.periodX;
                var11 = var5 >> 12;
                var12 = 1 + var11;
                var13 = var6 >> 12;
                var11 = var11 & 255;
                var14 = 1 + var13;
                var13 = var13 & 255;
                var15 = var7 >> 12;
                var16 = var15 + 1;
                if (var16 < var10) {
                  var16 = var16 & 255;
                } else {
                  var16 = 0;
                }
                if (var12 >= var8) {
                  var12 = 0;
                } else {
                  var12 = var12 & 255;
                }
                if (var14 < var9) {
                  var14 = var14 & 255;
                } else {
                  var14 = 0;
                }
                var6 = var6 & 4095;
                var15 = var15 & 255;
                var7 = var7 & 4095;
                var5 = var5 & 4095;
                var21 = var6 - 4096;
                var22 = var7 - 4096;
                var17 = SpriteState.noiseFadeQ12[var5];
                var18 = SpriteState.noiseFadeQ12[var6];
                var20 = var5 - 4096;
                var23 = this.permutation[var15];
                var19 = SpriteState.noiseFadeQ12[var7];
                var24 = this.permutation[var16];
                var27 = this.permutation[var13 + var24];
                var25 = this.permutation[var23 + var13];
                var28 = this.permutation[var24 + var14];
                var26 = this.permutation[var14 + var23];
                var29 = qf.perlinGradientDot(var6, var7, 8, (int) this.permutation[var11 + var25], var5);
                var30 = qf.perlinGradientDot(var6, var7, 8, (int) this.permutation[var12 + var25], var20);
                var31 = var29 + ((-var29 + var30) * var17 >> 12);
                var29Lifetime1 = qf.perlinGradientDot(var21, var7, guard - 198, (int) this.permutation[var11 + var26], var5);
                var30Lifetime1 = qf.perlinGradientDot(var21, var7, guard ^ 198, (int) this.permutation[var26 + var12], var20);
                var32 = var29Lifetime1 + (var17 * (var30Lifetime1 - var29Lifetime1) >> 12);
                var33 = var31 + (var18 * (var32 - var31) >> 12);
                var29Lifetime2 = qf.perlinGradientDot(var6, var22, guard ^ 198, (int) this.permutation[var11 + var27], var5);
                var30Lifetime2 = qf.perlinGradientDot(var6, var22, 8, (int) this.permutation[var27 + var12], var20);
                var31Lifetime1 = ((-var29Lifetime2 + var30Lifetime2) * var17 >> 12) + var29Lifetime2;
                var29Lifetime3 = qf.perlinGradientDot(var21, var22, 8, (int) this.permutation[var28 + var11], var5);
                var30Lifetime3 = qf.perlinGradientDot(var21, var22, guard ^ 198, (int) this.permutation[var28 + var12], var20);
                var32Lifetime1 = ((-var29Lifetime3 + var30Lifetime3) * var17 >> 12) + var29Lifetime3;
                var34 = ((var32Lifetime1 - var31Lifetime1) * var18 >> 12) + var31Lifetime1;
                this.accumulateOctave(var38, guard + 951, (var19 * (var34 - var33) >> 12) + var33);
              }
              this.finishVoxel(false);
            }
          }
        }
    }

    private final void initializePermutation(int shuffleStart) {
        Random var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = new Random((long)this.seed);
        for (var3 = 0; var3 < 255; var3++) {
          this.permutation[var3] = (short)var3;
        }
        for (var3Lifetime1 = shuffleStart; var3Lifetime1 < 255; var3Lifetime1++) {
          var4 = 255 - var3Lifetime1;
          var5 = ExpandingRingEffect.nextRandomInt(var4, var2, (byte) -96);
          var6 = this.permutation[var5];
          this.permutation[var5] = this.permutation[var4];
          this.permutation[var4 + 256] = (short) var6;
          this.permutation[var4] = (short) var6;
        }
    }

    final static void a(byte param0, int param1) {
        PasswordInputRenderer.field_s = 3 & param1 >> 4;
        if (!(PasswordInputRenderer.field_s <= 2)) {
          PasswordInputRenderer.field_s = 2;
        }
        if (param0 < 24) {
          FixedPointPerlinNoise3D.releaseStatics((byte) 45);
        }
        EmailSyntaxValidator.field_f = (param1 & 15) >> 2;
        if (!(EmailSyntaxValidator.field_f <= 2)) {
          EmailSyntaxValidator.field_f = 2;
        }
        IntList.field_g = param1 & 3;
        if (IntList.field_g > 2) {
          IntList.field_g = 2;
        }
    }

    abstract void resetOutput(int guard);

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -23517) {
          field_h = (String) null;
        }
        stackIn_7_0 = (10 <= jv.field_a) && (!IntrusiveNode.field_a) && (!TimedSceneEffect.a((byte) 116));
        return stackIn_7_0;
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        EMPTY_EMAIL = null;
        if (param0 < 30) {
          return;
        }
        field_h = null;
    }

    private final void initializeOctaveFrequencies(byte guard) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        this.octaveFrequencies = new short[this.octaveCount];
        for (var2 = 0; this.octaveCount > var2; var2++) {
          this.octaveFrequencies[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
        if (guard <= 43) {
          this.initializePermutation(-19);
        }
    }

    abstract void accumulateOctave(int octave, int guard, int valueQ12);

    FixedPointPerlinNoise3D(int noiseSeed, int octaves, int xPeriod, int yPeriod, int zPeriod) {
        this.periodY = 4;
        this.seed = 0;
        this.periodZ = 4;
        this.permutation = new short[512];
        this.octaveCount = 4;
        this.periodX = 4;
        this.periodX = xPeriod;
        this.periodY = yPeriod;
        this.octaveCount = octaves;
        this.periodZ = zPeriod;
        this.seed = noiseSeed;
        this.initializeOctaveFrequencies((byte) 99);
        this.initializePermutation(0);
    }

    static {
        String var0 = "Unknown";
        try {
          var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_h = var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_d = var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "~/";
        try {
          var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$0 = new File(var0);
        EMPTY_EMAIL = new EmailValidationError();
    }
}
