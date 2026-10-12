/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class VorbisSample extends IntrusiveNode {
    private int decodedSampleCount;
    private int previousRightWindowSize;
    private byte[][] packets;
    private boolean previousBlockSilent;
    private static float[] smallTrigA;
    private int previousBlockSize;
    private static int largeBlockSize;
    private int sampleCount;
    private boolean loopModeFlag;
    private int nextPacketIndex;
    private static int bitIndex;
    private int loopEnd;
    private static int[] largeBitReverse;
    private static int smallBlockSize;
    private static int byteIndex;
    private static float[] largeTrigB;
    private static int[] modeMappingIds;
    private static float[] smallTrigC;
    static VorbisCodebook[] codebooks;
    private static float[] smallTrigB;
    private static boolean setupInitialized;
    private static float[] largeTrigA;
    private static float[] transformScratch;
    private static int[] smallBitReverse;
    private static byte[] bitData;
    private static VorbisResidue[] residues;
    private static un[] floors;
    private static boolean[] modeUsesLargeBlock;
    private byte[] decodedSamples;
    private static VorbisMapping[] mappings;
    private int sampleRate;
    private int loopStart;
    private static float[] largeTrigC;
    private float[] previousBlock;

    final static int readBit() {
        int bit = bitData[byteIndex] >> bitIndex & 1;
        bitIndex = bitIndex + 1;
        byteIndex = byteIndex + (bitIndex >> 3);
        bitIndex = bitIndex & 7;
        return bit;
    }

    final static void decodeSetup(byte[] encodedSetup) {
        int var7_int = 0;
        int var8_int = 0;
        int var9_int = 0;
        int var11 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        boolean[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        boolean stackIn_42_2 = false;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        float[] var6_ref_float__;
        float[] var7;
        float[] var8;
        int[] var9;
        int var10;
        int var1Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        VorbisSample.setBitStream(encodedSetup, 0);
        smallBlockSize = 1 << VorbisSample.readBits(4);
        largeBlockSize = 1 << VorbisSample.readBits(4);
        transformScratch = new float[largeBlockSize];
        for (var1 = 0; var1 < 2; var1++) {
          if (var1 == 0) {
            stackIn_5_0 = smallBlockSize;
          } else {
            stackIn_5_0 = largeBlockSize;
          }
          var2 = stackIn_5_0;
          var3 = var2 >> 1;
          var4 = var2 >> 2;
          var5 = var2 >> 3;
          var6_ref_float__ = new float[var3];
          for (var7_int = 0; var7_int < var4; var7_int++) {
            var6_ref_float__[2 * var7_int] = (float)Math.cos((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
            var6_ref_float__[2 * var7_int + 1] = -(float)Math.sin((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
          }
          var7 = new float[var3];
          for (var8_int = 0; var8_int < var4; var8_int++) {
            var7[2 * var8_int] = (float)Math.cos((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
            var7[2 * var8_int + 1] = (float)Math.sin((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
          }
          var8 = new float[var4];
          for (var9_int = 0; var9_int < var5; var9_int++) {
            var8[2 * var9_int] = (float)Math.cos((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
            var8[2 * var9_int + 1] = -(float)Math.sin((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
          }
          var9 = new int[var5];
          var10 = wl.b(var5 - 1, -13337);
          for (var11 = 0; var11 < var5; var11++) {
            var9[var11] = qt.a(var11, var10, (byte) -114);
          }
          if (var1 == 0) {
            smallTrigA = var6_ref_float__;
            smallTrigB = var7;
            smallTrigC = var8;
            smallBitReverse = var9;
          } else {
            largeTrigA = var6_ref_float__;
            largeTrigB = var7;
            largeTrigC = var8;
            largeBitReverse = var9;
          }
        }
        var1Lifetime1 = VorbisSample.readBits(8) + 1;
        codebooks = new VorbisCodebook[var1Lifetime1];
        for (var2Lifetime1 = 0; var2Lifetime1 < var1Lifetime1; var2Lifetime1++) {
          codebooks[var2Lifetime1] = new VorbisCodebook();
        }
        var2Lifetime2 = VorbisSample.readBits(6) + 1;
        for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime2; var3Lifetime1++) {
          VorbisSample.readBits(16);
        }
        var2Lifetime3 = VorbisSample.readBits(6) + 1;
        floors = new un[var2Lifetime3];
        for (var3Lifetime2 = 0; var3Lifetime2 < var2Lifetime3; var3Lifetime2++) {
          floors[var3Lifetime2] = new un();
        }
        var3Lifetime3 = VorbisSample.readBits(6) + 1;
        residues = new VorbisResidue[var3Lifetime3];
        for (var4Lifetime1 = 0; var4Lifetime1 < var3Lifetime3; var4Lifetime1++) {
          residues[var4Lifetime1] = new VorbisResidue();
        }
        var4Lifetime2 = VorbisSample.readBits(6) + 1;
        mappings = new VorbisMapping[var4Lifetime2];
        for (var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime2; var5Lifetime1++) {
          mappings[var5Lifetime1] = new VorbisMapping();
        }
        var5Lifetime2 = VorbisSample.readBits(6) + 1;
        modeUsesLargeBlock = new boolean[var5Lifetime2];
        modeMappingIds = new int[var5Lifetime2];
        for (var6 = 0; var6 < var5Lifetime2; var6++) {
          stackIn_41_0 = (boolean[]) (modeUsesLargeBlock);
          stackIn_41_1 = var6;
          stackIn_42_2 = (VorbisSample.readBit() != 0);
          stackIn_41_0[stackIn_41_1] = stackIn_42_2;
          VorbisSample.readBits(16);
          VorbisSample.readBits(16);
          modeMappingIds[var6] = VorbisSample.readBits(8);
        }
        setupInitialized = true;
    }

    private final static void setBitStream(byte[] data, int byteOffset) {
        bitData = data;
        byteIndex = byteOffset;
        bitIndex = 0;
    }

    final static int readBits(int bitCount) {
        int byteMask = 0;
        int availableBits = 0;
        int value = 0;
        int valueShift = 0;
        int remainingMask;
        while (bitCount >= 8 - bitIndex) {
          availableBits = 8 - bitIndex;
          byteMask = (1 << availableBits) - 1;
          value = value + ((bitData[byteIndex] >> bitIndex & byteMask) << valueShift);
          bitIndex = 0;
          byteIndex = byteIndex + 1;
          valueShift = valueShift + availableBits;
          bitCount = bitCount - availableBits;
        }
        if (bitCount > 0) {
          remainingMask = (1 << bitCount) - 1;
          value = value + ((bitData[byteIndex] >> bitIndex & remainingMask) << valueShift);
          bitIndex = bitIndex + bitCount;
        }
        return value;
    }

    final PcmSample decodeToPcm(int[] sampleBudget) {
        int sampleIndex = 0;
        int writeIndex = 0;
        int outputPosition;
        int outputCount;
        int unsignedSample;
        float[] packetSamples;
        byte[] samples;
        if (sampleBudget != null &&
          sampleBudget[0] <= 0) {
          return null;
        }
        if (this.decodedSamples == null) {
          this.previousBlockSize = 0;
          this.previousBlock = new float[largeBlockSize];
          this.decodedSamples = new byte[this.sampleCount];
          this.decodedSampleCount = 0;
          this.nextPacketIndex = 0;
        }
        while (this.nextPacketIndex < this.packets.length) {
          if (sampleBudget != null &&
            sampleBudget[0] <= 0) {
            return null;
          }
          packetSamples = this.decodePacket(this.nextPacketIndex);
          if (packetSamples != null) {
            outputPosition = this.decodedSampleCount;
            outputCount = packetSamples.length;
            if (outputCount > this.sampleCount - outputPosition) {
              outputCount = this.sampleCount - outputPosition;
            }
            for (sampleIndex = 0; sampleIndex < outputCount; sampleIndex++) {
              unsignedSample = (int)(128.0f + packetSamples[sampleIndex] * 128.0f);
              if ((unsignedSample & -256) != 0) {
                unsignedSample = ~unsignedSample >> 31;
              }
              writeIndex = outputPosition;
              outputPosition++;
              this.decodedSamples[writeIndex] = (byte)(unsignedSample - 128);
            }
            if (sampleBudget != null) {
              sampleBudget[0] = sampleBudget[0] - (outputPosition - this.decodedSampleCount);
            }
            this.decodedSampleCount = outputPosition;
          }
          this.nextPacketIndex = this.nextPacketIndex + 1;
        }
        this.previousBlock = null;
        samples = this.decodedSamples;
        this.decodedSamples = null;
        return new PcmSample(this.sampleRate, samples, this.loopStart, this.loopEnd, this.loopModeFlag);
    }

    private final float[] decodePacket(int packetIndex) {
        int var32_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        float[] stackIn_40_0 = null;
        float[] stackIn_43_0 = null;
        float[] stackIn_46_0 = null;
        int[] stackIn_49_0 = null;
        boolean stackIn_113_1 = false;
        int modeId;
        int usesLargeBlock;
        int blockSize;
        int previousUsesLargeBlock;
        int nextUsesLargeBlock;
        int halfBlockSize;
        int leftWindowStart;
        int leftWindowEnd;
        int leftWindowSize;
        int rightWindowStart;
        int rightWindowEnd;
        int rightWindowSize;
        VorbisMapping mapping;
        int silent;
        int selectedSubmap;
        int var17_int;
        Object var17;
        int var18_int;
        float[] var18;
        int var19;
        float[] var20_ref_float__;
        int var20;
        int var21_int;
        float[] var21;
        float[] var22;
        float[] var23;
        int[] var24;
        int var25;
        int var26;
        float var26_float;
        float var27;
        int var27_int;
        float var28;
        int var28_int;
        float var29;
        int var29_int;
        float var30;
        int var30_int;
        float var31;
        int var31_int;
        float var32;
        float var33;
        int var33_int;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        float[] var40;
        int var41;
        VorbisResidue residue;
        int[] var44;
        float[] var45;
        float[] var46;
        int[] var48;
        float[] var49;
        float[] var50;
        float[] var52;
        int var16Lifetime1;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21_intLifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var26Lifetime3;
        int var26Lifetime4;
        int var26Lifetime5;
        int var26Lifetime6;
        int var26Lifetime7;
        int var26Lifetime8;
        int var26Lifetime9;
        int var26Lifetime10;
        int var26Lifetime11;
        float var26_floatLifetime1;
        float var27Lifetime1;
        float var27Lifetime2;
        float var27Lifetime3;
        float var27Lifetime4;
        int var27_intLifetime1;
        float var28Lifetime1;
        float var28Lifetime2;
        int var28_intLifetime1;
        float var29Lifetime1;
        float var29Lifetime2;
        int var29_intLifetime1;
        float var30Lifetime1;
        float var30Lifetime2;
        float var31Lifetime1;
        float var33Lifetime1;
        int var19Lifetime1Lifetime1;
        float var30Lifetime1Lifetime1;
        float var30Lifetime1Lifetime2;
        float var30Lifetime1Lifetime3;
        int var18_intLifetime1;
        int var18_intLifetime2;
        VorbisSample.setBitStream(this.packets[packetIndex], 0);
        VorbisSample.readBit();
        modeId = VorbisSample.readBits(wl.b(modeMappingIds.length - 1, -13337));
        usesLargeBlock = modeUsesLargeBlock[modeId] ? 1 : 0;
        if (usesLargeBlock == 0) {
          stackIn_3_0 = smallBlockSize;
        } else {
          stackIn_3_0 = largeBlockSize;
        }
        blockSize = stackIn_3_0;
        previousUsesLargeBlock = 0;
        nextUsesLargeBlock = 0;
        if (usesLargeBlock != 0) {
          stackIn_7_0 = (VorbisSample.readBit() == 0) ? 0 : 1;
          previousUsesLargeBlock = stackIn_7_0;
          stackIn_10_0 = (VorbisSample.readBit() == 0) ? 0 : 1;
          nextUsesLargeBlock = stackIn_10_0;
        }
        halfBlockSize = blockSize >> 1;
        if (usesLargeBlock != 0 &&
          previousUsesLargeBlock == 0) {
          leftWindowStart = (blockSize >> 2) - (smallBlockSize >> 2);
          leftWindowEnd = (blockSize >> 2) + (smallBlockSize >> 2);
          leftWindowSize = smallBlockSize >> 1;
        } else {
          leftWindowStart = 0;
          leftWindowEnd = halfBlockSize;
          leftWindowSize = blockSize >> 1;
        }
        if (usesLargeBlock != 0 &&
          nextUsesLargeBlock == 0) {
          rightWindowStart = blockSize - (blockSize >> 2) - (smallBlockSize >> 2);
          rightWindowEnd = blockSize - (blockSize >> 2) + (smallBlockSize >> 2);
          rightWindowSize = smallBlockSize >> 1;
        } else {
          rightWindowStart = halfBlockSize;
          rightWindowEnd = blockSize;
          rightWindowSize = blockSize >> 1;
        }
        mapping = mappings[modeMappingIds[modeId]];
        selectedSubmap = mapping.selectedSubmap;
        var17_int = mapping.floorIds[selectedSubmap];
        stackIn_22_0 = (floors[var17_int].b()) ? 0 : 1;
        silent = stackIn_22_0;
        var16Lifetime1 = silent;
        for (var17_intLifetime1 = 0; var17_intLifetime1 < mapping.submapCount; var17_intLifetime1++) {
          residue = residues[mapping.residueIds[var17_intLifetime1]];
          var52 = transformScratch;
          residue.decode(var52, blockSize >> 1, var16Lifetime1 != 0);
        }
        if (silent == 0) {
          var17_intLifetime2 = mapping.selectedSubmap;
          var18_int = mapping.floorIds[var17_intLifetime2];
          floors[var18_int].a(transformScratch, blockSize >> 1);
        }
        if (silent != 0) {
          for (var17_intLifetime3 = blockSize >> 1; var17_intLifetime3 < blockSize; var17_intLifetime3++) {
            transformScratch[var17_intLifetime3] = 0.0f;
          }
        } else {
          var17_intLifetime3 = blockSize >> 1;
          var18_intLifetime1 = blockSize >> 2;
          var19 = blockSize >> 3;
          var49 = transformScratch;
          var45 = var49;
          var20_ref_float__ = var45;
          for (var21_int = 0; var21_int < var17_intLifetime3; var21_int++) {
            var20_ref_float__[var21_int] = var20_ref_float__[var21_int] * 0.5f;
          }
          var41 = var17_intLifetime3;
          var21_intLifetime1 = var41;
          while (var41 < blockSize) {
            var20_ref_float__[var41] = -var20_ref_float__[blockSize - var41 - 1];
            var41++;
          }
          if (usesLargeBlock == 0) {
            stackIn_40_0 = (float[]) (smallTrigA);
          } else {
            stackIn_40_0 = (float[]) (largeTrigA);
          }
          var21 = stackIn_40_0;
          if (usesLargeBlock == 0) {
            stackIn_43_0 = (float[]) (smallTrigB);
          } else {
            stackIn_43_0 = (float[]) (largeTrigB);
          }
          var22 = stackIn_43_0;
          if (usesLargeBlock == 0) {
            stackIn_46_0 = (float[]) (smallTrigC);
          } else {
            stackIn_46_0 = (float[]) (largeTrigC);
          }
          var23 = stackIn_46_0;
          if (usesLargeBlock == 0) {
            stackIn_49_0 = (int[]) (smallBitReverse);
          } else {
            stackIn_49_0 = (int[]) (largeBitReverse);
          }
          var48 = stackIn_49_0;
          var44 = var48;
          var24 = var44;
          for (var25 = 0; var25 < var18_intLifetime1; var25++) {
            var26_float = var20_ref_float__[4 * var25] - var20_ref_float__[blockSize - 4 * var25 - 1];
            var27 = var20_ref_float__[4 * var25 + 2] - var20_ref_float__[blockSize - 4 * var25 - 3];
            var28 = var21[2 * var25];
            var29 = var21[2 * var25 + 1];
            var20_ref_float__[blockSize - 4 * var25 - 1] = var26_float * var28 - var27 * var29;
            var20_ref_float__[blockSize - 4 * var25 - 3] = var26_float * var29 + var27 * var28;
          }
          for (var25Lifetime1 = 0; var25Lifetime1 < var19; var25Lifetime1++) {
            var26_floatLifetime1 = var20_ref_float__[var17_intLifetime3 + 3 + 4 * var25Lifetime1];
            var27Lifetime1 = var20_ref_float__[var17_intLifetime3 + 1 + 4 * var25Lifetime1];
            var28Lifetime1 = var20_ref_float__[4 * var25Lifetime1 + 3];
            var29Lifetime1 = var20_ref_float__[4 * var25Lifetime1 + 1];
            var20_ref_float__[var17_intLifetime3 + 3 + 4 * var25Lifetime1] = var26_floatLifetime1 + var28Lifetime1;
            var20_ref_float__[var17_intLifetime3 + 1 + 4 * var25Lifetime1] = var27Lifetime1 + var29Lifetime1;
            var30 = var21[var17_intLifetime3 - 4 - 4 * var25Lifetime1];
            var31 = var21[var17_intLifetime3 - 3 - 4 * var25Lifetime1];
            var20_ref_float__[4 * var25Lifetime1 + 3] = (var26_floatLifetime1 - var28Lifetime1) * var30 - (var27Lifetime1 - var29Lifetime1) * var31;
            var20_ref_float__[4 * var25Lifetime1 + 1] = (var27Lifetime1 - var29Lifetime1) * var30 + (var26_floatLifetime1 - var28Lifetime1) * var31;
          }
          var25Lifetime2 = wl.b(blockSize - 1, -13337);
          for (var26 = 0; var26 < var25Lifetime2 - 3; var26++) {
            var27_int = blockSize >> var26 + 2;
            var28_int = 8 << var26;
            for (var29_int = 0; var29_int < 2 << var26; var29_int++) {
              var30_int = blockSize - var27_int * 2 * var29_int;
              var31_int = blockSize - var27_int * (2 * var29_int + 1);
              for (var32_int = 0; var32_int < blockSize >> var26 + 4; var32_int++) {
                var33_int = 4 * var32_int;
                var34 = var20_ref_float__[var30_int - 1 - var33_int];
                var35 = var20_ref_float__[var30_int - 3 - var33_int];
                var36 = var20_ref_float__[var31_int - 1 - var33_int];
                var37 = var20_ref_float__[var31_int - 3 - var33_int];
                var20_ref_float__[var30_int - 1 - var33_int] = var34 + var36;
                var20_ref_float__[var30_int - 3 - var33_int] = var35 + var37;
                var38 = var21[var32_int * var28_int];
                var39 = var21[var32_int * var28_int + 1];
                var20_ref_float__[var31_int - 1 - var33_int] = (var34 - var36) * var38 - (var35 - var37) * var39;
                var20_ref_float__[var31_int - 3 - var33_int] = (var35 - var37) * var38 + (var34 - var36) * var39;
              }
            }
          }
          for (var26Lifetime1 = 1; var26Lifetime1 < var19 - 1; var26Lifetime1++) {
            var27_intLifetime1 = var48[var26Lifetime1];
            if (var26Lifetime1 < var27_intLifetime1) {
              var28_intLifetime1 = 8 * var26Lifetime1;
              var29_intLifetime1 = 8 * var27_intLifetime1;
              var30Lifetime1 = var20_ref_float__[var28_intLifetime1 + 1];
              var20_ref_float__[var28_intLifetime1 + 1] = var20_ref_float__[var29_intLifetime1 + 1];
              var20_ref_float__[var29_intLifetime1 + 1] = var30Lifetime1;
              var30Lifetime1Lifetime1 = var20_ref_float__[var28_intLifetime1 + 3];
              var20_ref_float__[var28_intLifetime1 + 3] = var20_ref_float__[var29_intLifetime1 + 3];
              var20_ref_float__[var29_intLifetime1 + 3] = var30Lifetime1Lifetime1;
              var30Lifetime1Lifetime2 = var20_ref_float__[var28_intLifetime1 + 5];
              var20_ref_float__[var28_intLifetime1 + 5] = var20_ref_float__[var29_intLifetime1 + 5];
              var20_ref_float__[var29_intLifetime1 + 5] = var30Lifetime1Lifetime2;
              var30Lifetime1Lifetime3 = var20_ref_float__[var28_intLifetime1 + 7];
              var20_ref_float__[var28_intLifetime1 + 7] = var20_ref_float__[var29_intLifetime1 + 7];
              var20_ref_float__[var29_intLifetime1 + 7] = var30Lifetime1Lifetime3;
            }
          }
          for (var26Lifetime2 = 0; var26Lifetime2 < var17_intLifetime3; var26Lifetime2++) {
            var20_ref_float__[var26Lifetime2] = var20_ref_float__[2 * var26Lifetime2 + 1];
          }
          for (var26Lifetime3 = 0; var26Lifetime3 < var19; var26Lifetime3++) {
            var20_ref_float__[blockSize - 1 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3];
            var20_ref_float__[blockSize - 2 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 1];
            var20_ref_float__[blockSize - var18_intLifetime1 - 1 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 2];
            var20_ref_float__[blockSize - var18_intLifetime1 - 2 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 3];
          }
          for (var26Lifetime4 = 0; var26Lifetime4 < var19; var26Lifetime4++) {
            var27Lifetime2 = var23[2 * var26Lifetime4];
            var28Lifetime2 = var23[2 * var26Lifetime4 + 1];
            var29Lifetime2 = var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4];
            var30Lifetime2 = var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4 + 1];
            var31Lifetime1 = var20_ref_float__[blockSize - 2 - 2 * var26Lifetime4];
            var32 = var20_ref_float__[blockSize - 1 - 2 * var26Lifetime4];
            var33 = var28Lifetime2 * (var29Lifetime2 - var31Lifetime1) + var27Lifetime2 * (var30Lifetime2 + var32);
            var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 + var33) * 0.5f;
            var20_ref_float__[blockSize - 2 - 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 - var33) * 0.5f;
            var33Lifetime1 = var28Lifetime2 * (var30Lifetime2 + var32) - var27Lifetime2 * (var29Lifetime2 - var31Lifetime1);
            var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4 + 1] = (var30Lifetime2 - var32 + var33Lifetime1) * 0.5f;
            var20_ref_float__[blockSize - 1 - 2 * var26Lifetime4] = (-var30Lifetime2 + var32 + var33Lifetime1) * 0.5f;
          }
          for (var26Lifetime5 = 0; var26Lifetime5 < var18_intLifetime1; var26Lifetime5++) {
            var20_ref_float__[var26Lifetime5] = var20_ref_float__[2 * var26Lifetime5 + var17_intLifetime3] * var22[2 * var26Lifetime5] + var20_ref_float__[2 * var26Lifetime5 + 1 + var17_intLifetime3] * var22[2 * var26Lifetime5 + 1];
            var20_ref_float__[var17_intLifetime3 - 1 - var26Lifetime5] = var20_ref_float__[2 * var26Lifetime5 + var17_intLifetime3] * var22[2 * var26Lifetime5 + 1] - var20_ref_float__[2 * var26Lifetime5 + 1 + var17_intLifetime3] * var22[2 * var26Lifetime5];
          }
          for (var26Lifetime6 = 0; var26Lifetime6 < var18_intLifetime1; var26Lifetime6++) {
            var20_ref_float__[blockSize - var18_intLifetime1 + var26Lifetime6] = -var49[var26Lifetime6];
          }
          for (var26Lifetime7 = 0; var26Lifetime7 < var18_intLifetime1; var26Lifetime7++) {
            var20_ref_float__[var26Lifetime7] = var20_ref_float__[var18_intLifetime1 + var26Lifetime7];
          }
          for (var26Lifetime8 = 0; var26Lifetime8 < var18_intLifetime1; var26Lifetime8++) {
            var20_ref_float__[var18_intLifetime1 + var26Lifetime8] = -var20_ref_float__[var18_intLifetime1 - var26Lifetime8 - 1];
          }
          for (var26Lifetime9 = 0; var26Lifetime9 < var18_intLifetime1; var26Lifetime9++) {
            var20_ref_float__[var17_intLifetime3 + var26Lifetime9] = var20_ref_float__[blockSize - var26Lifetime9 - 1];
          }
          for (var26Lifetime10 = leftWindowStart; var26Lifetime10 < leftWindowEnd; var26Lifetime10++) {
            var27Lifetime3 = (float)Math.sin(((double)(var26Lifetime10 - leftWindowStart) + 0.5) / (double)leftWindowSize * 0.5 * 3.141592653589793);
            transformScratch[var26Lifetime10] = transformScratch[var26Lifetime10] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime3 * (double)var27Lifetime3);
          }
          for (var26Lifetime11 = rightWindowStart; var26Lifetime11 < rightWindowEnd; var26Lifetime11++) {
            var27Lifetime4 = (float)Math.sin(((double)(var26Lifetime11 - rightWindowStart) + 0.5) / (double)rightWindowSize * 0.5 * 3.141592653589793 + 1.5707963267948966);
            transformScratch[var26Lifetime11] = transformScratch[var26Lifetime11] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime4 * (double)var27Lifetime4);
          }
        }
        var17 = null;
        if (this.previousBlockSize > 0) {
          var18_intLifetime2 = this.previousBlockSize + blockSize >> 2;
          var50 = new float[var18_intLifetime2];
          var46 = var50;
          var40 = var46;
          var17 = var40;
          if (!this.previousBlockSilent) {
            for (var19Lifetime1 = 0; var19Lifetime1 < this.previousRightWindowSize; var19Lifetime1++) {
              var20 = (this.previousBlockSize >> 1) + var19Lifetime1;
              var40[var19Lifetime1] = var40[var19Lifetime1] + this.previousBlock[var20];
            }
          }
          if (silent == 0) {
            for (var19Lifetime1Lifetime1 = leftWindowStart; var19Lifetime1Lifetime1 < blockSize >> 1; var19Lifetime1Lifetime1++) {
              var20Lifetime1 = var50.length - (blockSize >> 1) + var19Lifetime1Lifetime1;
              var40[var20Lifetime1] = var40[var20Lifetime1] + transformScratch[var19Lifetime1Lifetime1];
            }
          }
        }
        var18 = this.previousBlock;
        this.previousBlock = transformScratch;
        transformScratch = var18;
        this.previousBlockSize = blockSize;
        this.previousRightWindowSize = rightWindowEnd - (blockSize >> 1);
        stackIn_113_1 = (silent != 0);
        this.previousBlockSilent = stackIn_113_1;
        return (float[]) (var17);
    }

    public static void releaseSetup() {
        bitData = null;
        codebooks = null;
        floors = null;
        residues = null;
        mappings = null;
        modeUsesLargeBlock = null;
        modeMappingIds = null;
        transformScratch = null;
        smallTrigA = null;
        smallTrigB = null;
        smallTrigC = null;
        largeTrigA = null;
        largeTrigB = null;
        largeTrigC = null;
        smallBitReverse = null;
        largeBitReverse = null;
    }

    private final static boolean ensureSetup(ResourceArchive archive) {
        byte[] var1 = null;
        if (!setupInitialized) {
          var1 = archive.getFile((byte) 49, 0, 0);
          if (var1 == null) {
            return false;
          }
          VorbisSample.decodeSetup(var1);
        }
        return true;
    }

    final PcmSample decodeAllToPcm() {
        int var3 = 0;
        int var6 = 0;
        int incrementValue$0 = 0;
        byte[] var1;
        int var2;
        float[] var4;
        int var5;
        int var7;
        this.previousBlockSize = 0;
        this.previousBlock = new float[largeBlockSize];
        var1 = new byte[this.sampleCount];
        var2 = 0;
        for (var3 = 0; var3 < this.packets.length; var3++) {
          var4 = this.decodePacket(var3);
          if (var4 != null) {
            var5 = var4.length;
            if (var5 > this.sampleCount - var2) {
              var5 = this.sampleCount - var2;
            }
            for (var6 = 0; var6 < var5; var6++) {
              var7 = (int)(128.0f + var4[var6] * 128.0f);
              if ((var7 & -256) != 0) {
                var7 = ~var7 >> 31;
              }
              incrementValue$0 = var2;
              var2++;
              var1[incrementValue$0] = (byte)(var7 - 128);
            }
          }
        }
        this.previousBlock = null;
        return new PcmSample(this.sampleRate, var1, this.loopStart, this.loopEnd, this.loopModeFlag);
    }

    final static VorbisSample loadByName(ResourceArchive archive, String groupName, String fileName) {
        try {
          VorbisSample var4_ref = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.ensureFileAvailableByName(-88, fileName, groupName);
            return null;
          }
          byte[] var3 = archive.getFileByName(fileName, 46, groupName);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new VorbisSample(var3);
          } catch (IOException iOException) {
            iOException.printStackTrace();
          }
          return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void decodePacketContainer(byte[] encodedSample) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        PacketBuffer var2 = new PacketBuffer(encodedSample);
        this.sampleRate = var2.readInt(1);
        this.sampleCount = var2.readInt(1);
        this.loopStart = var2.readInt(1);
        this.loopEnd = var2.readInt(1);
        if (this.loopEnd < 0) {
          this.loopEnd = ~this.loopEnd;
          this.loopModeFlag = true;
        }
        int var3 = var2.readInt(1);
        if (var3 < 0) {
          throw new IOException();
        }
        this.packets = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
          var5 = 0;
          do {
            var6_int = var2.readUnsignedByte(0);
            var5 = var5 + var6_int;
          } while (var6_int >= 255);
          var6 = new byte[var5];
          var2.readBytes(0, var5, 0, var6);
          this.packets[var4] = var6;
        }
    }

    final static VorbisSample load(ResourceArchive archive, int groupId, int fileId) {
        try {
          VorbisSample var4_ref = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.ensureFileAvailable(groupId, fileId, 0);
            return null;
          }
          byte[] var3 = archive.getFile((byte) 69, fileId, groupId);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new VorbisSample(var3);
          } catch (IOException iOException) {
            iOException.printStackTrace();
          }
          return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static float unpackFloat(int packedValue) {
        int mantissa = packedValue & 2097151;
        int signBit = packedValue & -2147483648;
        int exponent = (packedValue & 2145386496) >> 21;
        if (signBit != 0) {
          mantissa = -mantissa;
        }
        return (float)((double)mantissa * Math.pow(2.0, (double)(exponent - 788)));
    }

    private VorbisSample(byte[] encodedSample) throws IOException {
        this.decodePacketContainer(encodedSample);
    }

    static {
        setupInitialized = false;
    }
}
