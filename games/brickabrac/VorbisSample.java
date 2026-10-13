/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class VorbisSample extends IntrusiveNode {
    private static int[] shortBitReverse;
    private static int bytePosition;
    private static int longBlockSize;
    private static int bitOffset;
    private static boolean setupReady;
    private static VorbisFloor1[] floors;
    private static float[] shortTrigA;
    private int previousBlockSize;
    private static VorbisResidue[] residues;
    private boolean pingPong;
    private int previousRightWindowCount;
    private static VorbisMapping[] mappings;
    private static float[] longTrigC;
    private static int[] longBitReverse;
    private static float[] shortTrigC;
    private static float[] shortTrigB;
    private static byte[] bitData;
    private float[] previousBlock;
    private static float[] blockScratch;
    private int nextPacket;
    private static int shortBlockSize;
    private boolean previousSilent;
    private static float[] longTrigA;
    private static boolean[] longBlockModes;
    private int sampleCount;
    private int outputPosition;
    static VorbisCodebook[] codebooks;
    private int loopStart;
    private int loopEnd;
    private static int[] modeMappings;
    private static float[] longTrigB;
    private int sampleRate;
    private byte[][] packets;
    private byte[] outputSamples;

    final static int readBit() {
        int bit = bitData[bytePosition] >> bitOffset & 1;
        bitOffset = bitOffset + 1;
        bytePosition = bytePosition + (bitOffset >> 3);
        bitOffset = bitOffset & 7;
        return bit;
    }

    private final static boolean ensureSetup(ResourceArchive archive) {
        byte[] setupData = null;
        if (!setupReady) {
          setupData = archive.takeFile(0, 0, 4);
          if (setupData == null) {
            return false;
          }
          VorbisSample.decodeSetup(setupData);
        }
        return true;
    }

    final static VorbisSample load(ResourceArchive archive, int groupId, int fileId) {
        try {
          VorbisSample var4_ref = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.ensureFileAvailable(fileId, groupId, (byte) 102);
            return null;
          }
          byte[] var3 = archive.takeFile(fileId, groupId, 4);
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

    final static int readBits(int count) {
        int mask = 0;
        int availableBits = 0;
        int value = 0;
        int outputShift = 0;
        int tailMask;
        while (count >= 8 - bitOffset) {
          availableBits = 8 - bitOffset;
          mask = (1 << availableBits) - 1;
          value = value + ((bitData[bytePosition] >> bitOffset & mask) << outputShift);
          bitOffset = 0;
          bytePosition = bytePosition + 1;
          outputShift = outputShift + availableBits;
          count = count - availableBits;
        }
        if (count > 0) {
          tailMask = (1 << count) - 1;
          value = value + ((bitData[bytePosition] >> bitOffset & tailMask) << outputShift);
          bitOffset = bitOffset + count;
        }
        return value;
    }

    private final static void setBitInput(byte[] data, int offset) {
        bitData = data;
        bytePosition = offset;
        bitOffset = 0;
    }

    final static float unpackFloat(int packed) {
        int mantissa = packed & 2097151;
        int sign = packed & -2147483648;
        int exponent = (packed & 2145386496) >> 21;
        if (sign != 0) {
          mantissa = -mantissa;
        }
        return (float)((double)mantissa * Math.pow(2.0, (double)(exponent - 788)));
    }

    private final void decodeContainer(byte[] data) throws IOException {
        int packetIndex = 0;
        int packetLength = 0;
        int lengthChunk = 0;
        byte[] packetData = null;
        PacketBuffer packet = new PacketBuffer(data);
        this.sampleRate = packet.readInt(255);
        this.sampleCount = packet.readInt(255);
        this.loopStart = packet.readInt(255);
        this.loopEnd = packet.readInt(255);
        if (this.loopEnd < 0) {
          this.loopEnd = ~this.loopEnd;
          this.pingPong = true;
        }
        int packetCount = packet.readInt(255);
        if (packetCount < 0) {
          throw new IOException();
        }
        this.packets = new byte[packetCount][];
        for (packetIndex = 0; packetIndex < packetCount; packetIndex++) {
          packetLength = 0;
          do {
            lengthChunk = packet.readUnsignedByte(255);
            packetLength = packetLength + lengthChunk;
          } while (lengthChunk >= 255);
          packetData = new byte[packetLength];
          packet.readBytes(0, packetData, 115, packetLength);
          this.packets[packetIndex] = packetData;
        }
    }

    final PcmSound toPcmSound() {
        int packetIndex = 0;
        int sampleIndex = 0;
        int writeIndex = 0;
        byte[] samples;
        int position;
        float[] overlapSamples;
        int availableSamples;
        int unsignedSample;
        this.previousBlockSize = 0;
        this.previousBlock = new float[longBlockSize];
        samples = new byte[this.sampleCount];
        position = 0;
        for (packetIndex = 0; packetIndex < this.packets.length; packetIndex++) {
          overlapSamples = this.decodePacket(packetIndex);
          if (overlapSamples != null) {
            availableSamples = overlapSamples.length;
            if (availableSamples > this.sampleCount - position) {
              availableSamples = this.sampleCount - position;
            }
            for (sampleIndex = 0; sampleIndex < availableSamples; sampleIndex++) {
              unsignedSample = (int)(128.0f + overlapSamples[sampleIndex] * 128.0f);
              if ((unsignedSample & -256) != 0) {
                unsignedSample = ~unsignedSample >> 31;
              }
              writeIndex = position;
              position++;
              samples[writeIndex] = (byte)(unsignedSample - 128);
            }
          }
        }
        this.previousBlock = null;
        return new PcmSound(this.sampleRate, samples, this.loopStart, this.loopEnd, this.pingPong);
    }

    final static void decodeSetup(byte[] data) {
        int trigAIndex = 0;
        int trigBIndex = 0;
        int trigCIndex = 0;
        int permutationIndex = 0;
        int modeIndex = 0;
        int selectedBlockSize = 0;
        boolean[] modeFlagTarget = null;
        int modeFlagIndex = 0;
        boolean longBlockFlag = false;
        int blockKind;
        int blockSize;
        int halfBlock;
        int quarterBlock;
        int eighthBlock;
        float[] trigA;
        float[] trigB;
        float[] trigC;
        int[] bitReverse;
        int permutationBits;
        int codebookCount;
        int codebookIndex;
        int timeCount;
        int floorCount;
        int timeIndex;
        int floorIndex;
        int residueCount;
        int residueIndex;
        int mappingCount;
        int mappingIndex;
        int modeCount;
        VorbisSample.setBitInput(data, 0);
        shortBlockSize = 1 << VorbisSample.readBits(4);
        longBlockSize = 1 << VorbisSample.readBits(4);
        blockScratch = new float[longBlockSize];
        for (blockKind = 0; blockKind < 2; blockKind++) {
          if (blockKind == 0) {
            selectedBlockSize = shortBlockSize;
          } else {
            selectedBlockSize = longBlockSize;
          }
          blockSize = selectedBlockSize;
          halfBlock = blockSize >> 1;
          quarterBlock = blockSize >> 2;
          eighthBlock = blockSize >> 3;
          trigA = new float[halfBlock];
          for (trigAIndex = 0; trigAIndex < quarterBlock; trigAIndex++) {
            trigA[2 * trigAIndex] = (float)Math.cos((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSize);
            trigA[2 * trigAIndex + 1] = -(float)Math.sin((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSize);
          }
          trigB = new float[halfBlock];
          for (trigBIndex = 0; trigBIndex < quarterBlock; trigBIndex++) {
            trigB[2 * trigBIndex] = (float)Math.cos((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSize));
            trigB[2 * trigBIndex + 1] = (float)Math.sin((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSize));
          }
          trigC = new float[quarterBlock];
          for (trigCIndex = 0; trigCIndex < eighthBlock; trigCIndex++) {
            trigC[2 * trigCIndex] = (float)Math.cos((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSize);
            trigC[2 * trigCIndex + 1] = -(float)Math.sin((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSize);
          }
          bitReverse = new int[eighthBlock];
          permutationBits = ed.b(9, eighthBlock - 1);
          for (permutationIndex = 0; permutationIndex < eighthBlock; permutationIndex++) {
            bitReverse[permutationIndex] = KeyboardInput.a(permutationBits, permutationIndex, -1);
          }
          if (blockKind == 0) {
            shortTrigA = trigA;
            shortTrigB = trigB;
            shortTrigC = trigC;
            shortBitReverse = bitReverse;
          } else {
            longTrigA = trigA;
            longTrigB = trigB;
            longTrigC = trigC;
            longBitReverse = bitReverse;
          }
        }
        codebookCount = VorbisSample.readBits(8) + 1;
        codebooks = new VorbisCodebook[codebookCount];
        for (codebookIndex = 0; codebookIndex < codebookCount; codebookIndex++) {
          codebooks[codebookIndex] = new VorbisCodebook();
        }
        timeCount = VorbisSample.readBits(6) + 1;
        for (timeIndex = 0; timeIndex < timeCount; timeIndex++) {
          VorbisSample.readBits(16);
        }
        floorCount = VorbisSample.readBits(6) + 1;
        floors = new VorbisFloor1[floorCount];
        for (floorIndex = 0; floorIndex < floorCount; floorIndex++) {
          floors[floorIndex] = new VorbisFloor1();
        }
        residueCount = VorbisSample.readBits(6) + 1;
        residues = new VorbisResidue[residueCount];
        for (residueIndex = 0; residueIndex < residueCount; residueIndex++) {
          residues[residueIndex] = new VorbisResidue();
        }
        mappingCount = VorbisSample.readBits(6) + 1;
        mappings = new VorbisMapping[mappingCount];
        for (mappingIndex = 0; mappingIndex < mappingCount; mappingIndex++) {
          mappings[mappingIndex] = new VorbisMapping();
        }
        modeCount = VorbisSample.readBits(6) + 1;
        longBlockModes = new boolean[modeCount];
        modeMappings = new int[modeCount];
        for (modeIndex = 0; modeIndex < modeCount; modeIndex++) {
          modeFlagTarget = (boolean[]) (longBlockModes);
          modeFlagIndex = modeIndex;
          longBlockFlag = (VorbisSample.readBit() != 0);
          modeFlagTarget[modeFlagIndex] = longBlockFlag;
          VorbisSample.readBits(16);
          VorbisSample.readBits(16);
          modeMappings[modeIndex] = VorbisSample.readBits(8);
        }
        setupReady = true;
    }

    final PcmSound toPcmSoundBudgeted(int[] budget) {
        int sampleIndex = 0;
        int writeIndex = 0;
        int position;
        int availableSamples;
        int unsignedSample;
        float[] overlapSamples;
        byte[] completedOutput;
        if (budget != null &&
          budget[0] <= 0) {
          return null;
        }
        if (this.outputSamples == null) {
          this.previousBlockSize = 0;
          this.previousBlock = new float[longBlockSize];
          this.outputSamples = new byte[this.sampleCount];
          this.outputPosition = 0;
          this.nextPacket = 0;
        }
        while (this.nextPacket < this.packets.length) {
          if (budget != null &&
            budget[0] <= 0) {
            return null;
          }
          overlapSamples = this.decodePacket(this.nextPacket);
          if (overlapSamples != null) {
            position = this.outputPosition;
            availableSamples = overlapSamples.length;
            if (availableSamples > this.sampleCount - position) {
              availableSamples = this.sampleCount - position;
            }
            for (sampleIndex = 0; sampleIndex < availableSamples; sampleIndex++) {
              unsignedSample = (int)(128.0f + overlapSamples[sampleIndex] * 128.0f);
              if ((unsignedSample & -256) != 0) {
                unsignedSample = ~unsignedSample >> 31;
              }
              writeIndex = position;
              position++;
              this.outputSamples[writeIndex] = (byte)(unsignedSample - 128);
            }
            if (budget != null) {
              budget[0] = budget[0] - (position - this.outputPosition);
            }
            this.outputPosition = position;
          }
          this.nextPacket = this.nextPacket + 1;
        }
        this.previousBlock = null;
        completedOutput = this.outputSamples;
        this.outputSamples = null;
        return new PcmSound(this.sampleRate, completedOutput, this.loopStart, this.loopEnd, this.pingPong);
    }

    public static void releaseScratch() {
        bitData = null;
        codebooks = null;
        floors = null;
        residues = null;
        mappings = null;
        longBlockModes = null;
        modeMappings = null;
        blockScratch = null;
        shortTrigA = null;
        shortTrigB = null;
        shortTrigC = null;
        longTrigA = null;
        longTrigB = null;
        longTrigC = null;
        shortBitReverse = null;
        longBitReverse = null;
    }

    final static VorbisSample loadByName(ResourceArchive archive, String groupName, String fileName) {
        try {
          VorbisSample var4_ref = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.ensureFileAvailableByName(fileName, groupName, 0);
            return null;
          }
          byte[] var3 = archive.takeFileByName(85, groupName, fileName);
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

    private final float[] decodePacket(int packetIndex) {
        int var32_int = 0;
        int selectedBlockSize = 0;
        int previousLongFlag = 0;
        int nextLongFlag = 0;
        int absentFloorFlag = 0;
        float[] selectedTrigA = null;
        float[] selectedTrigB = null;
        float[] selectedTrigC = null;
        int[] selectedBitReverse = null;
        boolean completedSilentFlag = false;
        int mode;
        int longBlock;
        int blockSize;
        int previousLong;
        int nextLong;
        int windowHalf;
        int leftWindowStart;
        int leftWindowEnd;
        int leftWindowLength;
        int rightWindowStart;
        int rightWindowEnd;
        int rightWindowLength;
        VorbisMapping mapping;
        int silent;
        int selectedSubmap;
        int selectedFloor;
        Object overlapResult;
        int appliedFloor;
        float[] swappedBlock;
        int eighthBlock;
        float[] transformBlock;
        int previousTailIndex;
        int prescaleIndex;
        float[] trigA;
        float[] trigB;
        float[] trigC;
        int[] bitReverse;
        int blockBits;
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
        float[] overlapSamples;
        int mirrorIndex;
        VorbisResidue residue;
        int[] bitReverseStorage;
        float[] transformAlias;
        float[] overlapAlias;
        int[] bitReverseAlias;
        float[] transformStorage;
        float[] overlapStorage;
        float[] residueTarget;
        int skipResidue;
        int submapIndex;
        int appliedSubmap;
        int var17_intLifetime3;
        int previousTailSample;
        int currentOverlapIndex;
        int unusedMirrorIndex;
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
        int leftWindowSample;
        int rightWindowSample;
        float var26_floatLifetime1;
        float var27Lifetime1;
        float var27Lifetime2;
        float leftWindowSine;
        float rightWindowSine;
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
        int currentHeadSample;
        float var30Lifetime1Lifetime1;
        float var30Lifetime1Lifetime2;
        float var30Lifetime1Lifetime3;
        int quarterBlock;
        int overlapLength;
        VorbisSample.setBitInput(this.packets[packetIndex], 0);
        VorbisSample.readBit();
        mode = VorbisSample.readBits(ed.b(9, modeMappings.length - 1));
        longBlock = longBlockModes[mode] ? 1 : 0;
        if (longBlock == 0) {
          selectedBlockSize = shortBlockSize;
        } else {
          selectedBlockSize = longBlockSize;
        }
        blockSize = selectedBlockSize;
        previousLong = 0;
        nextLong = 0;
        if (longBlock != 0) {
          previousLongFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          previousLong = previousLongFlag;
          nextLongFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          nextLong = nextLongFlag;
        }
        windowHalf = blockSize >> 1;
        if (longBlock != 0 &&
          previousLong == 0) {
          leftWindowStart = (blockSize >> 2) - (shortBlockSize >> 2);
          leftWindowEnd = (blockSize >> 2) + (shortBlockSize >> 2);
          leftWindowLength = shortBlockSize >> 1;
        } else {
          leftWindowStart = 0;
          leftWindowEnd = windowHalf;
          leftWindowLength = blockSize >> 1;
        }
        if (longBlock != 0 &&
          nextLong == 0) {
          rightWindowStart = blockSize - (blockSize >> 2) - (shortBlockSize >> 2);
          rightWindowEnd = blockSize - (blockSize >> 2) + (shortBlockSize >> 2);
          rightWindowLength = shortBlockSize >> 1;
        } else {
          rightWindowStart = windowHalf;
          rightWindowEnd = blockSize;
          rightWindowLength = blockSize >> 1;
        }
        mapping = mappings[modeMappings[mode]];
        selectedSubmap = mapping.mux;
        selectedFloor = mapping.submapFloors[selectedSubmap];
        absentFloorFlag = (floors[selectedFloor].decode()) ? 0 : 1;
        silent = absentFloorFlag;
        skipResidue = silent;
        for (submapIndex = 0; submapIndex < mapping.submapCount; submapIndex++) {
          residue = residues[mapping.submapResidues[submapIndex]];
          residueTarget = blockScratch;
          residue.decode(residueTarget, blockSize >> 1, skipResidue != 0);
        }
        if (silent == 0) {
          appliedSubmap = mapping.mux;
          appliedFloor = mapping.submapFloors[appliedSubmap];
          floors[appliedFloor].apply(blockScratch, blockSize >> 1);
        }
        if (silent != 0) {
          for (var17_intLifetime3 = blockSize >> 1; var17_intLifetime3 < blockSize; var17_intLifetime3++) {
            blockScratch[var17_intLifetime3] = 0.0f;
          }
        } else {
          var17_intLifetime3 = blockSize >> 1;
          quarterBlock = blockSize >> 2;
          eighthBlock = blockSize >> 3;
          transformStorage = blockScratch;
          transformAlias = transformStorage;
          transformBlock = transformAlias;
          for (prescaleIndex = 0; prescaleIndex < var17_intLifetime3; prescaleIndex++) {
            transformBlock[prescaleIndex] = transformBlock[prescaleIndex] * 0.5f;
          }
          mirrorIndex = var17_intLifetime3;
          unusedMirrorIndex = mirrorIndex;
          while (mirrorIndex < blockSize) {
            transformBlock[mirrorIndex] = -transformBlock[blockSize - mirrorIndex - 1];
            mirrorIndex++;
          }
          if (longBlock == 0) {
            selectedTrigA = (float[]) (shortTrigA);
          } else {
            selectedTrigA = (float[]) (longTrigA);
          }
          trigA = selectedTrigA;
          if (longBlock == 0) {
            selectedTrigB = (float[]) (shortTrigB);
          } else {
            selectedTrigB = (float[]) (longTrigB);
          }
          trigB = selectedTrigB;
          if (longBlock == 0) {
            selectedTrigC = (float[]) (shortTrigC);
          } else {
            selectedTrigC = (float[]) (longTrigC);
          }
          trigC = selectedTrigC;
          if (longBlock == 0) {
            selectedBitReverse = (int[]) (shortBitReverse);
          } else {
            selectedBitReverse = (int[]) (longBitReverse);
          }
          bitReverseAlias = selectedBitReverse;
          bitReverseStorage = bitReverseAlias;
          bitReverse = bitReverseStorage;
          for (blockBits = 0; blockBits < quarterBlock; blockBits++) {
            var26_float = transformBlock[4 * blockBits] - transformBlock[blockSize - 4 * blockBits - 1];
            var27 = transformBlock[4 * blockBits + 2] - transformBlock[blockSize - 4 * blockBits - 3];
            var28 = trigA[2 * blockBits];
            var29 = trigA[2 * blockBits + 1];
            transformBlock[blockSize - 4 * blockBits - 1] = var26_float * var28 - var27 * var29;
            transformBlock[blockSize - 4 * blockBits - 3] = var26_float * var29 + var27 * var28;
          }
          for (var25Lifetime1 = 0; var25Lifetime1 < eighthBlock; var25Lifetime1++) {
            var26_floatLifetime1 = transformBlock[var17_intLifetime3 + 3 + 4 * var25Lifetime1];
            var27Lifetime1 = transformBlock[var17_intLifetime3 + 1 + 4 * var25Lifetime1];
            var28Lifetime1 = transformBlock[4 * var25Lifetime1 + 3];
            var29Lifetime1 = transformBlock[4 * var25Lifetime1 + 1];
            transformBlock[var17_intLifetime3 + 3 + 4 * var25Lifetime1] = var26_floatLifetime1 + var28Lifetime1;
            transformBlock[var17_intLifetime3 + 1 + 4 * var25Lifetime1] = var27Lifetime1 + var29Lifetime1;
            var30 = trigA[var17_intLifetime3 - 4 - 4 * var25Lifetime1];
            var31 = trigA[var17_intLifetime3 - 3 - 4 * var25Lifetime1];
            transformBlock[4 * var25Lifetime1 + 3] = (var26_floatLifetime1 - var28Lifetime1) * var30 - (var27Lifetime1 - var29Lifetime1) * var31;
            transformBlock[4 * var25Lifetime1 + 1] = (var27Lifetime1 - var29Lifetime1) * var30 + (var26_floatLifetime1 - var28Lifetime1) * var31;
          }
          var25Lifetime2 = ed.b(9, blockSize - 1);
          for (var26 = 0; var26 < var25Lifetime2 - 3; var26++) {
            var27_int = blockSize >> var26 + 2;
            var28_int = 8 << var26;
            for (var29_int = 0; var29_int < 2 << var26; var29_int++) {
              var30_int = blockSize - var27_int * 2 * var29_int;
              var31_int = blockSize - var27_int * (2 * var29_int + 1);
              for (var32_int = 0; var32_int < blockSize >> var26 + 4; var32_int++) {
                var33_int = 4 * var32_int;
                var34 = transformBlock[var30_int - 1 - var33_int];
                var35 = transformBlock[var30_int - 3 - var33_int];
                var36 = transformBlock[var31_int - 1 - var33_int];
                var37 = transformBlock[var31_int - 3 - var33_int];
                transformBlock[var30_int - 1 - var33_int] = var34 + var36;
                transformBlock[var30_int - 3 - var33_int] = var35 + var37;
                var38 = trigA[var32_int * var28_int];
                var39 = trigA[var32_int * var28_int + 1];
                transformBlock[var31_int - 1 - var33_int] = (var34 - var36) * var38 - (var35 - var37) * var39;
                transformBlock[var31_int - 3 - var33_int] = (var35 - var37) * var38 + (var34 - var36) * var39;
              }
            }
          }
          for (var26Lifetime1 = 1; var26Lifetime1 < eighthBlock - 1; var26Lifetime1++) {
            var27_intLifetime1 = bitReverseAlias[var26Lifetime1];
            if (var26Lifetime1 < var27_intLifetime1) {
              var28_intLifetime1 = 8 * var26Lifetime1;
              var29_intLifetime1 = 8 * var27_intLifetime1;
              var30Lifetime1 = transformBlock[var28_intLifetime1 + 1];
              transformBlock[var28_intLifetime1 + 1] = transformBlock[var29_intLifetime1 + 1];
              transformBlock[var29_intLifetime1 + 1] = var30Lifetime1;
              var30Lifetime1Lifetime1 = transformBlock[var28_intLifetime1 + 3];
              transformBlock[var28_intLifetime1 + 3] = transformBlock[var29_intLifetime1 + 3];
              transformBlock[var29_intLifetime1 + 3] = var30Lifetime1Lifetime1;
              var30Lifetime1Lifetime2 = transformBlock[var28_intLifetime1 + 5];
              transformBlock[var28_intLifetime1 + 5] = transformBlock[var29_intLifetime1 + 5];
              transformBlock[var29_intLifetime1 + 5] = var30Lifetime1Lifetime2;
              var30Lifetime1Lifetime3 = transformBlock[var28_intLifetime1 + 7];
              transformBlock[var28_intLifetime1 + 7] = transformBlock[var29_intLifetime1 + 7];
              transformBlock[var29_intLifetime1 + 7] = var30Lifetime1Lifetime3;
            }
          }
          for (var26Lifetime2 = 0; var26Lifetime2 < var17_intLifetime3; var26Lifetime2++) {
            transformBlock[var26Lifetime2] = transformBlock[2 * var26Lifetime2 + 1];
          }
          for (var26Lifetime3 = 0; var26Lifetime3 < eighthBlock; var26Lifetime3++) {
            transformBlock[blockSize - 1 - 2 * var26Lifetime3] = transformBlock[4 * var26Lifetime3];
            transformBlock[blockSize - 2 - 2 * var26Lifetime3] = transformBlock[4 * var26Lifetime3 + 1];
            transformBlock[blockSize - quarterBlock - 1 - 2 * var26Lifetime3] = transformBlock[4 * var26Lifetime3 + 2];
            transformBlock[blockSize - quarterBlock - 2 - 2 * var26Lifetime3] = transformBlock[4 * var26Lifetime3 + 3];
          }
          for (var26Lifetime4 = 0; var26Lifetime4 < eighthBlock; var26Lifetime4++) {
            var27Lifetime2 = trigC[2 * var26Lifetime4];
            var28Lifetime2 = trigC[2 * var26Lifetime4 + 1];
            var29Lifetime2 = transformBlock[var17_intLifetime3 + 2 * var26Lifetime4];
            var30Lifetime2 = transformBlock[var17_intLifetime3 + 2 * var26Lifetime4 + 1];
            var31Lifetime1 = transformBlock[blockSize - 2 - 2 * var26Lifetime4];
            var32 = transformBlock[blockSize - 1 - 2 * var26Lifetime4];
            var33 = var28Lifetime2 * (var29Lifetime2 - var31Lifetime1) + var27Lifetime2 * (var30Lifetime2 + var32);
            transformBlock[var17_intLifetime3 + 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 + var33) * 0.5f;
            transformBlock[blockSize - 2 - 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 - var33) * 0.5f;
            var33Lifetime1 = var28Lifetime2 * (var30Lifetime2 + var32) - var27Lifetime2 * (var29Lifetime2 - var31Lifetime1);
            transformBlock[var17_intLifetime3 + 2 * var26Lifetime4 + 1] = (var30Lifetime2 - var32 + var33Lifetime1) * 0.5f;
            transformBlock[blockSize - 1 - 2 * var26Lifetime4] = (-var30Lifetime2 + var32 + var33Lifetime1) * 0.5f;
          }
          for (var26Lifetime5 = 0; var26Lifetime5 < quarterBlock; var26Lifetime5++) {
            transformBlock[var26Lifetime5] = transformBlock[2 * var26Lifetime5 + var17_intLifetime3] * trigB[2 * var26Lifetime5] + transformBlock[2 * var26Lifetime5 + 1 + var17_intLifetime3] * trigB[2 * var26Lifetime5 + 1];
            transformBlock[var17_intLifetime3 - 1 - var26Lifetime5] = transformBlock[2 * var26Lifetime5 + var17_intLifetime3] * trigB[2 * var26Lifetime5 + 1] - transformBlock[2 * var26Lifetime5 + 1 + var17_intLifetime3] * trigB[2 * var26Lifetime5];
          }
          for (var26Lifetime6 = 0; var26Lifetime6 < quarterBlock; var26Lifetime6++) {
            transformBlock[blockSize - quarterBlock + var26Lifetime6] = -transformStorage[var26Lifetime6];
          }
          for (var26Lifetime7 = 0; var26Lifetime7 < quarterBlock; var26Lifetime7++) {
            transformBlock[var26Lifetime7] = transformBlock[quarterBlock + var26Lifetime7];
          }
          for (var26Lifetime8 = 0; var26Lifetime8 < quarterBlock; var26Lifetime8++) {
            transformBlock[quarterBlock + var26Lifetime8] = -transformBlock[quarterBlock - var26Lifetime8 - 1];
          }
          for (var26Lifetime9 = 0; var26Lifetime9 < quarterBlock; var26Lifetime9++) {
            transformBlock[var17_intLifetime3 + var26Lifetime9] = transformBlock[blockSize - var26Lifetime9 - 1];
          }
          for (leftWindowSample = leftWindowStart; leftWindowSample < leftWindowEnd; leftWindowSample++) {
            leftWindowSine = (float)Math.sin(((double)(leftWindowSample - leftWindowStart) + 0.5) / (double)leftWindowLength * 0.5 * 3.141592653589793);
            blockScratch[leftWindowSample] = blockScratch[leftWindowSample] * (float)Math.sin(1.5707963267948966 * (double)leftWindowSine * (double)leftWindowSine);
          }
          for (rightWindowSample = rightWindowStart; rightWindowSample < rightWindowEnd; rightWindowSample++) {
            rightWindowSine = (float)Math.sin(((double)(rightWindowSample - rightWindowStart) + 0.5) / (double)rightWindowLength * 0.5 * 3.141592653589793 + 1.5707963267948966);
            blockScratch[rightWindowSample] = blockScratch[rightWindowSample] * (float)Math.sin(1.5707963267948966 * (double)rightWindowSine * (double)rightWindowSine);
          }
        }
        overlapResult = null;
        if (this.previousBlockSize > 0) {
          overlapLength = this.previousBlockSize + blockSize >> 2;
          overlapStorage = new float[overlapLength];
          overlapAlias = overlapStorage;
          overlapSamples = overlapAlias;
          overlapResult = overlapSamples;
          if (!this.previousSilent) {
            for (previousTailSample = 0; previousTailSample < this.previousRightWindowCount; previousTailSample++) {
              previousTailIndex = (this.previousBlockSize >> 1) + previousTailSample;
              overlapSamples[previousTailSample] = overlapSamples[previousTailSample] + this.previousBlock[previousTailIndex];
            }
          }
          if (silent == 0) {
            for (currentHeadSample = leftWindowStart; currentHeadSample < blockSize >> 1; currentHeadSample++) {
              currentOverlapIndex = overlapStorage.length - (blockSize >> 1) + currentHeadSample;
              overlapSamples[currentOverlapIndex] = overlapSamples[currentOverlapIndex] + blockScratch[currentHeadSample];
            }
          }
        }
        swappedBlock = this.previousBlock;
        this.previousBlock = blockScratch;
        blockScratch = swappedBlock;
        this.previousBlockSize = blockSize;
        this.previousRightWindowCount = rightWindowEnd - (blockSize >> 1);
        completedSilentFlag = (silent != 0);
        this.previousSilent = completedSilentFlag;
        return (float[]) (overlapResult);
    }

    private VorbisSample(byte[] data) throws IOException {
        this.decodeContainer(data);
    }

    static {
        setupReady = false;
    }
}
