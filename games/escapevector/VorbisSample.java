/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class VorbisSample extends IntrusiveNode {
    private static int byteOffset;
    private static byte[] bitstream;
    private float[] previousBlock;
    private int outputPosition;
    private static int[] modeMappings;
    private int sampleRate;
    private static VorbisResidue[] residues;
    private static float[] longTrigA;
    static VorbisCodebook[] codebooks;
    private static boolean[] longBlockModes;
    private int sampleCount;
    private static boolean setupLoaded;
    private int loopStart;
    private static float[] shortTrigA;
    private static float[] longTrigB;
    private static float[] shortTrigC;
    private int previousBlockSize;
    private boolean previousSilent;
    private static int bitOffset;
    private int packetPosition;
    private static int[] longBitReverse;
    private static VorbisMapping[] mappings;
    private static VorbisFloor[] floors;
    private byte[] pcmBytes;
    private static int longBlockSize;
    private static float[] longTrigC;
    private boolean pingPongLoop;
    private static int[] shortBitReverse;
    private static float[] transformBuffer;
    private static float[] shortTrigB;
    private static int shortBlockSize;
    private int previousTailSamples;
    private int loopEnd;
    private byte[][] packets;

    final PcmSample decodeToPcm(int[] budget) {
        if (budget != null &&
          budget[0] <= 0) {
          return null;
        }
        if (this.pcmBytes == null) {
          this.previousBlockSize = 0;
          this.previousBlock = new float[longBlockSize];
          this.pcmBytes = new byte[this.sampleCount];
          this.outputPosition = 0;
          this.packetPosition = 0;
        }
        while (this.packetPosition < this.packets.length) {
          if (budget != null &&
            budget[0] <= 0) {
            return null;
          }
          float[] var7 = this.decodePacket(this.packetPosition);
          if (var7 != null) {
            int var3 = this.outputPosition;
            int var4 = var7.length;
            if (var4 > this.sampleCount - var3) {
              var4 = this.sampleCount - var3;
            }
            for (int var5 = 0; var5 < var4; var5++) {
              int var6 = (int)(128.0f + var7[var5] * 128.0f);
              if ((var6 & -256) != 0) {
                var6 = ~var6 >> 31;
              }
              int incrementValue$0 = var3;
              var3++;
              this.pcmBytes[incrementValue$0] = (byte)(var6 - 128);
            }
            if (budget != null) {
              budget[0] = budget[0] - (var3 - this.outputPosition);
            }
            this.outputPosition = var3;
          }
          this.packetPosition = this.packetPosition + 1;
        }
        this.previousBlock = null;
        byte[] var12 = this.pcmBytes;
        this.pcmBytes = null;
        return new PcmSample(this.sampleRate, var12, this.loopStart, this.loopEnd, this.pingPongLoop);
    }

    final PcmSample decodeToPcm() {
        this.previousBlockSize = 0;
        this.previousBlock = new float[longBlockSize];
        byte[] var1 = new byte[this.sampleCount];
        int var2 = 0;
        for (int var3 = 0; var3 < this.packets.length; var3++) {
          float[] var4 = this.decodePacket(var3);
          if (var4 != null) {
            int var5 = var4.length;
            if (var5 > this.sampleCount - var2) {
              var5 = this.sampleCount - var2;
            }
            for (int var6 = 0; var6 < var5; var6++) {
              int var7 = (int)(128.0f + var4[var6] * 128.0f);
              if ((var7 & -256) != 0) {
                var7 = ~var7 >> 31;
              }
              int incrementValue$0 = var2;
              var2++;
              var1[incrementValue$0] = (byte)(var7 - 128);
            }
          }
        }
        this.previousBlock = null;
        return new PcmSample(this.sampleRate, var1, this.loopStart, this.loopEnd, this.pingPongLoop);
    }

    private final static void setBitstream(byte[] bytes, int offset) {
        bitstream = bytes;
        byteOffset = offset;
        bitOffset = 0;
    }

    final static VorbisSample load(ResourceArchive archive, int groupId, int fileId) {
        try {
          VorbisSample var4_ref = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.tryLoadFile(true, groupId, fileId);
            return null;
          }
          byte[] var3 = archive.getFile(groupId, (byte) -97, fileId);
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

    final static int readBit() {
        int var0 = bitstream[byteOffset] >> bitOffset & 1;
        bitOffset = bitOffset + 1;
        byteOffset = byteOffset + (bitOffset >> 3);
        bitOffset = bitOffset & 7;
        return var0;
    }

    final static VorbisSample loadNamed(ResourceArchive archive, String groupName, String fileName) {
        try {
          VorbisSample var4_ref = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.tryLoadNamedFile(fileName, groupName, (byte) 98);
            return null;
          }
          byte[] var3 = archive.getNamedFile(-4, fileName, groupName);
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

    final static float unpackFloat(int packed) {
        int var1 = packed & 2097151;
        int var2 = packed & -2147483648;
        int var3 = (packed & 2145386496) >> 21;
        if (var2 != 0) {
          var1 = -var1;
        }
        return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
    }

    private final static boolean ensureSetup(ResourceArchive archive) {
        if (!setupLoaded) {
          byte[] var1 = archive.getFile(0, (byte) -97, 0);
          if (var1 == null) {
            return false;
          }
          VorbisSample.decodeSetup(var1);
        }
        return true;
    }

    public static void releaseStatics() {
        bitstream = null;
        codebooks = null;
        floors = null;
        residues = null;
        mappings = null;
        longBlockModes = null;
        modeMappings = null;
        transformBuffer = null;
        shortTrigA = null;
        shortTrigB = null;
        shortTrigC = null;
        longTrigA = null;
        longTrigB = null;
        longTrigC = null;
        shortBitReverse = null;
        longBitReverse = null;
    }

    private final void decodeHeader(byte[] bytes) throws IOException {
        int var6_int = 0;
        PacketBuffer var2 = new PacketBuffer(bytes);
        this.sampleRate = var2.readInt(-5053);
        this.sampleCount = var2.readInt(-5053);
        this.loopStart = var2.readInt(-5053);
        this.loopEnd = var2.readInt(-5053);
        if (this.loopEnd < 0) {
          this.loopEnd = ~this.loopEnd;
          this.pingPongLoop = true;
        }
        int var3 = var2.readInt(-5053);
        if (var3 < 0) {
          throw new IOException();
        }
        this.packets = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
          int var5 = 0;
          do {
            var6_int = var2.readUnsignedByte(0);
            var5 = var5 + var6_int;
          } while (var6_int >= 255);
          byte[] var6 = new byte[var5];
          var2.readBytes(var6, (byte) -96, 0, var5);
          this.packets[var4] = var6;
        }
    }

    final static void decodeSetup(byte[] bytes) {
        int stackIn_5_0 = 0;
        VorbisSample.setBitstream(bytes, 0);
        shortBlockSize = 1 << VorbisSample.readBits(4);
        longBlockSize = 1 << VorbisSample.readBits(4);
        transformBuffer = new float[longBlockSize];
        for (int var1 = 0; var1 < 2; var1++) {
          if (var1 == 0) {
            stackIn_5_0 = shortBlockSize;
          } else {
            stackIn_5_0 = longBlockSize;
          }
          int var2 = stackIn_5_0;
          int var3 = var2 >> 1;
          int var4 = var2 >> 2;
          int var5 = var2 >> 3;
          float[] var6_ref_float__ = new float[var3];
          for (int var7_int = 0; var7_int < var4; var7_int++) {
            var6_ref_float__[2 * var7_int] = (float)Math.cos((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
            var6_ref_float__[2 * var7_int + 1] = -(float)Math.sin((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
          }
          float[] var7 = new float[var3];
          for (int var8_int = 0; var8_int < var4; var8_int++) {
            var7[2 * var8_int] = (float)Math.cos((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
            var7[2 * var8_int + 1] = (float)Math.sin((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
          }
          float[] var8 = new float[var4];
          for (int var9_int = 0; var9_int < var5; var9_int++) {
            var8[2 * var9_int] = (float)Math.cos((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
            var8[2 * var9_int + 1] = -(float)Math.sin((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
          }
          int[] var9 = new int[var5];
          int var10 = ConnectionSupport.bitLength(var5 - 1, (byte) 78);
          for (int var11 = 0; var11 < var5; var11++) {
            var9[var11] = DiskCacheRequest.a(var11, var10, (byte) 96);
          }
          if (var1 == 0) {
            shortTrigA = var6_ref_float__;
            shortTrigB = var7;
            shortTrigC = var8;
            shortBitReverse = var9;
          } else {
            longTrigA = var6_ref_float__;
            longTrigB = var7;
            longTrigC = var8;
            longBitReverse = var9;
          }
        }
        int var1Lifetime1 = VorbisSample.readBits(8) + 1;
        codebooks = new VorbisCodebook[var1Lifetime1];
        for (int var2Lifetime1 = 0; var2Lifetime1 < var1Lifetime1; var2Lifetime1++) {
          codebooks[var2Lifetime1] = new VorbisCodebook();
        }
        int var2Lifetime2 = VorbisSample.readBits(6) + 1;
        for (int var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime2; var3Lifetime1++) {
          VorbisSample.readBits(16);
        }
        int var2Lifetime3 = VorbisSample.readBits(6) + 1;
        floors = new VorbisFloor[var2Lifetime3];
        for (int var3Lifetime2 = 0; var3Lifetime2 < var2Lifetime3; var3Lifetime2++) {
          floors[var3Lifetime2] = new VorbisFloor();
        }
        int var3Lifetime3 = VorbisSample.readBits(6) + 1;
        residues = new VorbisResidue[var3Lifetime3];
        for (int var4Lifetime1 = 0; var4Lifetime1 < var3Lifetime3; var4Lifetime1++) {
          residues[var4Lifetime1] = new VorbisResidue();
        }
        int var4Lifetime2 = VorbisSample.readBits(6) + 1;
        mappings = new VorbisMapping[var4Lifetime2];
        for (int var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime2; var5Lifetime1++) {
          mappings[var5Lifetime1] = new VorbisMapping();
        }
        int var5Lifetime2 = VorbisSample.readBits(6) + 1;
        longBlockModes = new boolean[var5Lifetime2];
        modeMappings = new int[var5Lifetime2];
        for (int var6 = 0; var6 < var5Lifetime2; var6++) {
          boolean[] stackIn_41_0 = (boolean[]) (longBlockModes);
          int stackIn_41_1 = var6;
          boolean stackIn_42_2 = (VorbisSample.readBit() != 0);
          stackIn_41_0[stackIn_41_1] = stackIn_42_2;
          VorbisSample.readBits(16);
          VorbisSample.readBits(16);
          modeMappings[var6] = VorbisSample.readBits(8);
        }
        setupLoaded = true;
    }

    final static int readBits(int count) {
        int var1 = 0;
        int var2 = 0;
        while (count >= 8 - bitOffset) {
          int var3 = 8 - bitOffset;
          int var4 = (1 << var3) - 1;
          var1 = var1 + ((bitstream[byteOffset] >> bitOffset & var4) << var2);
          bitOffset = 0;
          byteOffset = byteOffset + 1;
          var2 = var2 + var3;
          count = count - var3;
        }
        if (count > 0) {
          int var3Lifetime1 = (1 << count) - 1;
          var1 = var1 + ((bitstream[byteOffset] >> bitOffset & var3Lifetime1) << var2);
          bitOffset = bitOffset + count;
        }
        return var1;
    }

    private final float[] decodePacket(int packetIndex) {
        int stackIn_3_0 = 0;
        float[] stackIn_40_0 = null;
        float[] stackIn_43_0 = null;
        float[] stackIn_46_0 = null;
        int[] stackIn_49_0 = null;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var17_intLifetime3;
        VorbisSample.setBitstream(this.packets[packetIndex], 0);
        VorbisSample.readBit();
        int var2 = VorbisSample.readBits(ConnectionSupport.bitLength(modeMappings.length - 1, (byte) 78));
        boolean var3 = (longBlockModes[var2]);
        if (!var3) {
          stackIn_3_0 = shortBlockSize;
        } else {
          stackIn_3_0 = longBlockSize;
        }
        int var4 = stackIn_3_0;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
          boolean stackIn_7_0 = !(VorbisSample.readBit() == 0);
          var5 = stackIn_7_0;
          boolean stackIn_10_0 = !(VorbisSample.readBit() == 0);
          var6 = stackIn_10_0;
        }
        int var7 = var4 >> 1;
        if (var3 &&
          !var5) {
          var8 = (var4 >> 2) - (shortBlockSize >> 2);
          var9 = (var4 >> 2) + (shortBlockSize >> 2);
          var10 = shortBlockSize >> 1;
        } else {
          var8 = 0;
          var9 = var7;
          var10 = var4 >> 1;
        }
        if (var3 &&
          !var6) {
          var11 = var4 - (var4 >> 2) - (shortBlockSize >> 2);
          var12 = var4 - (var4 >> 2) + (shortBlockSize >> 2);
          var13 = shortBlockSize >> 1;
        } else {
          var11 = var7;
          var12 = var4;
          var13 = var4 >> 1;
        }
        VorbisMapping var14 = mappings[modeMappings[var2]];
        int var16 = var14.mux;
        int var17_int = var14.submapFloors[var16];
        boolean stackIn_22_0 = !(floors[var17_int].decodeFloor());
        boolean var15 = stackIn_22_0;
        boolean var16Lifetime1 = var15;
        for (int var17_intLifetime1 = 0; var17_intLifetime1 < var14.submaps; var17_intLifetime1++) {
          VorbisResidue var42 = residues[var14.submapResidues[var17_intLifetime1]];
          float[] var52 = transformBuffer;
          var42.decode(var52, var4 >> 1, (var16Lifetime1));
        }
        if (!var15) {
          int var17_intLifetime2 = var14.mux;
          int var18_int = var14.submapFloors[var17_intLifetime2];
          floors[var18_int].applyCurve(transformBuffer, var4 >> 1);
        }
        if (var15) {
          for (var17_intLifetime3 = var4 >> 1; var17_intLifetime3 < var4; var17_intLifetime3++) {
            transformBuffer[var17_intLifetime3] = 0.0f;
          }
        } else {
          var17_intLifetime3 = var4 >> 1;
          int var18_intLifetime1 = var4 >> 2;
          int var19 = var4 >> 3;
          float[] var49 = transformBuffer;
          float[] var45 = var49;
          float[] var20_ref_float__ = var45;
          for (int var21_int = 0; var21_int < var17_intLifetime3; var21_int++) {
            var20_ref_float__[var21_int] = var20_ref_float__[var21_int] * 0.5f;
          }
          int var41 = var17_intLifetime3;
          int var21_intLifetime1 = var41;
          while (var41 < var4) {
            var20_ref_float__[var41] = -var20_ref_float__[var4 - var41 - 1];
            var41++;
          }
          if (!var3) {
            stackIn_40_0 = (float[]) (shortTrigA);
          } else {
            stackIn_40_0 = (float[]) (longTrigA);
          }
          float[] var21 = stackIn_40_0;
          if (!var3) {
            stackIn_43_0 = (float[]) (shortTrigB);
          } else {
            stackIn_43_0 = (float[]) (longTrigB);
          }
          float[] var22 = stackIn_43_0;
          if (!var3) {
            stackIn_46_0 = (float[]) (shortTrigC);
          } else {
            stackIn_46_0 = (float[]) (longTrigC);
          }
          float[] var23 = stackIn_46_0;
          if (!var3) {
            stackIn_49_0 = (int[]) (shortBitReverse);
          } else {
            stackIn_49_0 = (int[]) (longBitReverse);
          }
          int[] var48 = stackIn_49_0;
          int[] var44 = var48;
          int[] var24 = var44;
          for (int var25 = 0; var25 < var18_intLifetime1; var25++) {
            float var26_float = var20_ref_float__[4 * var25] - var20_ref_float__[var4 - 4 * var25 - 1];
            float var27 = var20_ref_float__[4 * var25 + 2] - var20_ref_float__[var4 - 4 * var25 - 3];
            float var28 = var21[2 * var25];
            float var29 = var21[2 * var25 + 1];
            var20_ref_float__[var4 - 4 * var25 - 1] = var26_float * var28 - var27 * var29;
            var20_ref_float__[var4 - 4 * var25 - 3] = var26_float * var29 + var27 * var28;
          }
          for (int var25Lifetime1 = 0; var25Lifetime1 < var19; var25Lifetime1++) {
            float var26_floatLifetime1 = var20_ref_float__[var17_intLifetime3 + 3 + 4 * var25Lifetime1];
            float var27Lifetime1 = var20_ref_float__[var17_intLifetime3 + 1 + 4 * var25Lifetime1];
            float var28Lifetime1 = var20_ref_float__[4 * var25Lifetime1 + 3];
            float var29Lifetime1 = var20_ref_float__[4 * var25Lifetime1 + 1];
            var20_ref_float__[var17_intLifetime3 + 3 + 4 * var25Lifetime1] = var26_floatLifetime1 + var28Lifetime1;
            var20_ref_float__[var17_intLifetime3 + 1 + 4 * var25Lifetime1] = var27Lifetime1 + var29Lifetime1;
            float var30 = var21[var17_intLifetime3 - 4 - 4 * var25Lifetime1];
            float var31 = var21[var17_intLifetime3 - 3 - 4 * var25Lifetime1];
            var20_ref_float__[4 * var25Lifetime1 + 3] = (var26_floatLifetime1 - var28Lifetime1) * var30 - (var27Lifetime1 - var29Lifetime1) * var31;
            var20_ref_float__[4 * var25Lifetime1 + 1] = (var27Lifetime1 - var29Lifetime1) * var30 + (var26_floatLifetime1 - var28Lifetime1) * var31;
          }
          int var25Lifetime2 = ConnectionSupport.bitLength(var4 - 1, (byte) 78);
          for (int var26 = 0; var26 < var25Lifetime2 - 3; var26++) {
            int var27_int = var4 >> var26 + 2;
            int var28_int = 8 << var26;
            for (int var29_int = 0; var29_int < 2 << var26; var29_int++) {
              int var30_int = var4 - var27_int * 2 * var29_int;
              int var31_int = var4 - var27_int * (2 * var29_int + 1);
              for (int var32_int = 0; var32_int < var4 >> var26 + 4; var32_int++) {
                int var33_int = 4 * var32_int;
                float var34 = var20_ref_float__[var30_int - 1 - var33_int];
                float var35 = var20_ref_float__[var30_int - 3 - var33_int];
                float var36 = var20_ref_float__[var31_int - 1 - var33_int];
                float var37 = var20_ref_float__[var31_int - 3 - var33_int];
                var20_ref_float__[var30_int - 1 - var33_int] = var34 + var36;
                var20_ref_float__[var30_int - 3 - var33_int] = var35 + var37;
                float var38 = var21[var32_int * var28_int];
                float var39 = var21[var32_int * var28_int + 1];
                var20_ref_float__[var31_int - 1 - var33_int] = (var34 - var36) * var38 - (var35 - var37) * var39;
                var20_ref_float__[var31_int - 3 - var33_int] = (var35 - var37) * var38 + (var34 - var36) * var39;
              }
            }
          }
          for (int var26Lifetime1 = 1; var26Lifetime1 < var19 - 1; var26Lifetime1++) {
            int var27_intLifetime1 = var48[var26Lifetime1];
            if (var26Lifetime1 < var27_intLifetime1) {
              int var28_intLifetime1 = 8 * var26Lifetime1;
              int var29_intLifetime1 = 8 * var27_intLifetime1;
              float var30Lifetime1 = var20_ref_float__[var28_intLifetime1 + 1];
              var20_ref_float__[var28_intLifetime1 + 1] = var20_ref_float__[var29_intLifetime1 + 1];
              var20_ref_float__[var29_intLifetime1 + 1] = var30Lifetime1;
              float var30Lifetime1Lifetime1 = var20_ref_float__[var28_intLifetime1 + 3];
              var20_ref_float__[var28_intLifetime1 + 3] = var20_ref_float__[var29_intLifetime1 + 3];
              var20_ref_float__[var29_intLifetime1 + 3] = var30Lifetime1Lifetime1;
              float var30Lifetime1Lifetime2 = var20_ref_float__[var28_intLifetime1 + 5];
              var20_ref_float__[var28_intLifetime1 + 5] = var20_ref_float__[var29_intLifetime1 + 5];
              var20_ref_float__[var29_intLifetime1 + 5] = var30Lifetime1Lifetime2;
              float var30Lifetime1Lifetime3 = var20_ref_float__[var28_intLifetime1 + 7];
              var20_ref_float__[var28_intLifetime1 + 7] = var20_ref_float__[var29_intLifetime1 + 7];
              var20_ref_float__[var29_intLifetime1 + 7] = var30Lifetime1Lifetime3;
            }
          }
          for (int var26Lifetime2 = 0; var26Lifetime2 < var17_intLifetime3; var26Lifetime2++) {
            var20_ref_float__[var26Lifetime2] = var20_ref_float__[2 * var26Lifetime2 + 1];
          }
          for (int var26Lifetime3 = 0; var26Lifetime3 < var19; var26Lifetime3++) {
            var20_ref_float__[var4 - 1 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3];
            var20_ref_float__[var4 - 2 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 1];
            var20_ref_float__[var4 - var18_intLifetime1 - 1 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 2];
            var20_ref_float__[var4 - var18_intLifetime1 - 2 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 3];
          }
          for (int var26Lifetime4 = 0; var26Lifetime4 < var19; var26Lifetime4++) {
            float var27Lifetime2 = var23[2 * var26Lifetime4];
            float var28Lifetime2 = var23[2 * var26Lifetime4 + 1];
            float var29Lifetime2 = var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4];
            float var30Lifetime2 = var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4 + 1];
            float var31Lifetime1 = var20_ref_float__[var4 - 2 - 2 * var26Lifetime4];
            float var32 = var20_ref_float__[var4 - 1 - 2 * var26Lifetime4];
            float var33 = var28Lifetime2 * (var29Lifetime2 - var31Lifetime1) + var27Lifetime2 * (var30Lifetime2 + var32);
            var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 + var33) * 0.5f;
            var20_ref_float__[var4 - 2 - 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 - var33) * 0.5f;
            float var33Lifetime1 = var28Lifetime2 * (var30Lifetime2 + var32) - var27Lifetime2 * (var29Lifetime2 - var31Lifetime1);
            var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4 + 1] = (var30Lifetime2 - var32 + var33Lifetime1) * 0.5f;
            var20_ref_float__[var4 - 1 - 2 * var26Lifetime4] = (-var30Lifetime2 + var32 + var33Lifetime1) * 0.5f;
          }
          for (int var26Lifetime5 = 0; var26Lifetime5 < var18_intLifetime1; var26Lifetime5++) {
            var20_ref_float__[var26Lifetime5] = var20_ref_float__[2 * var26Lifetime5 + var17_intLifetime3] * var22[2 * var26Lifetime5] + var20_ref_float__[2 * var26Lifetime5 + 1 + var17_intLifetime3] * var22[2 * var26Lifetime5 + 1];
            var20_ref_float__[var17_intLifetime3 - 1 - var26Lifetime5] = var20_ref_float__[2 * var26Lifetime5 + var17_intLifetime3] * var22[2 * var26Lifetime5 + 1] - var20_ref_float__[2 * var26Lifetime5 + 1 + var17_intLifetime3] * var22[2 * var26Lifetime5];
          }
          for (int var26Lifetime6 = 0; var26Lifetime6 < var18_intLifetime1; var26Lifetime6++) {
            var20_ref_float__[var4 - var18_intLifetime1 + var26Lifetime6] = -var49[var26Lifetime6];
          }
          for (int var26Lifetime7 = 0; var26Lifetime7 < var18_intLifetime1; var26Lifetime7++) {
            var20_ref_float__[var26Lifetime7] = var20_ref_float__[var18_intLifetime1 + var26Lifetime7];
          }
          for (int var26Lifetime8 = 0; var26Lifetime8 < var18_intLifetime1; var26Lifetime8++) {
            var20_ref_float__[var18_intLifetime1 + var26Lifetime8] = -var20_ref_float__[var18_intLifetime1 - var26Lifetime8 - 1];
          }
          for (int var26Lifetime9 = 0; var26Lifetime9 < var18_intLifetime1; var26Lifetime9++) {
            var20_ref_float__[var17_intLifetime3 + var26Lifetime9] = var20_ref_float__[var4 - var26Lifetime9 - 1];
          }
          for (int var26Lifetime10 = var8; var26Lifetime10 < var9; var26Lifetime10++) {
            float var27Lifetime3 = (float)Math.sin(((double)(var26Lifetime10 - var8) + 0.5) / (double)var10 * 0.5 * 3.141592653589793);
            transformBuffer[var26Lifetime10] = transformBuffer[var26Lifetime10] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime3 * (double)var27Lifetime3);
          }
          for (int var26Lifetime11 = var11; var26Lifetime11 < var12; var26Lifetime11++) {
            float var27Lifetime4 = (float)Math.sin(((double)(var26Lifetime11 - var11) + 0.5) / (double)var13 * 0.5 * 3.141592653589793 + 1.5707963267948966);
            transformBuffer[var26Lifetime11] = transformBuffer[var26Lifetime11] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime4 * (double)var27Lifetime4);
          }
        }
        Object var17 = null;
        if (this.previousBlockSize > 0) {
          int var18_intLifetime2 = this.previousBlockSize + var4 >> 2;
          float[] var50 = new float[var18_intLifetime2];
          float[] var46 = var50;
          float[] var40 = var46;
          var17 = var40;
          if (!this.previousSilent) {
            for (int var19Lifetime1 = 0; var19Lifetime1 < this.previousTailSamples; var19Lifetime1++) {
              int var20 = (this.previousBlockSize >> 1) + var19Lifetime1;
              var40[var19Lifetime1] = var40[var19Lifetime1] + this.previousBlock[var20];
            }
          }
          if (!var15) {
            for (int var19Lifetime1Lifetime1 = var8; var19Lifetime1Lifetime1 < var4 >> 1; var19Lifetime1Lifetime1++) {
              int var20Lifetime1 = var50.length - (var4 >> 1) + var19Lifetime1Lifetime1;
              var40[var20Lifetime1] = var40[var20Lifetime1] + transformBuffer[var19Lifetime1Lifetime1];
            }
          }
        }
        float[] var18 = this.previousBlock;
        this.previousBlock = transformBuffer;
        transformBuffer = var18;
        this.previousBlockSize = var4;
        this.previousTailSamples = var12 - (var4 >> 1);
        boolean stackIn_113_1 = ((var15));
        this.previousSilent = stackIn_113_1;
        return (float[]) (var17);
    }

    private VorbisSample(byte[] param0) throws IOException {
        this.decodeHeader(param0);
    }

    static {
        setupLoaded = false;
    }
}
