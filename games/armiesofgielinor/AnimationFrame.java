/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimationFrame {
    private static short[] scratchTransformSlots;
    AnimationSkeleton skeleton;
    short[] transformSlots;
    private static short[] scratchTransformZ;
    private static short[] scratchPivotSlots;
    short[] transformY;
    short[] transformZ;
    private static byte[] scratchInterpolationFlags;
    int transformCount;
    byte[] interpolationFlags;
    private static short[] scratchTransformX;
    short[] transformX;
    private static short[] scratchTransformY;
    short[] precedingPivotSlots;

    AnimationFrame(byte[] encodedFrame, AnimationSkeleton skeleton) {
        Throwable decompiledCaughtException = null;
        Exception decodeFailure = null;
        PacketBuffer componentPacket = null;
        int encodedSlotCount = 0;
        int decodedTransformCount = 0;
        int latestPivotSlot = 0;
        int lastEmittedPivotSlot = 0;
        int slot = 0;
        int transformType = 0;
        int componentFlags = 0;
        int defaultComponent = 0;
        int copiedTransform = 0;
        PacketBuffer flagsPacket = null;
        int initialCopyCursor;
        this.transformCount = -1;
        this.skeleton = null;
        this.skeleton = skeleton;
        try {
          flagsPacket = new PacketBuffer(encodedFrame);
          componentPacket = new PacketBuffer(encodedFrame);
          flagsPacket.readUnsignedByte(0);
          flagsPacket.position = flagsPacket.position + 2;
          encodedSlotCount = flagsPacket.readUnsignedByte(0);
          decodedTransformCount = 0;
          latestPivotSlot = -1;
          lastEmittedPivotSlot = -1;
          componentPacket.position = flagsPacket.position + encodedSlotCount;
          for (slot = 0; slot < encodedSlotCount; slot++) {
            transformType = this.skeleton.transformTypes[slot];
            if (transformType == 0) {
              latestPivotSlot = slot;
            }
            componentFlags = flagsPacket.readUnsignedByte(0);
            if (componentFlags > 0) {
              if (transformType == 0) {
                lastEmittedPivotSlot = slot;
              }
              scratchTransformSlots[decodedTransformCount] = (short)slot;
              defaultComponent = 0;
              if (transformType == 3) {
                defaultComponent = 128;
              }
              if ((componentFlags & 1) == 0) {
                scratchTransformX[decodedTransformCount] = (short)defaultComponent;
              } else {
                scratchTransformX[decodedTransformCount] = (short)componentPacket.readSignedSmart(114);
              }
              if ((componentFlags & 2) == 0) {
                scratchTransformY[decodedTransformCount] = (short)defaultComponent;
              } else {
                scratchTransformY[decodedTransformCount] = (short)componentPacket.readSignedSmart(95);
              }
              if ((componentFlags & 4) == 0) {
                scratchTransformZ[decodedTransformCount] = (short)defaultComponent;
              } else {
                scratchTransformZ[decodedTransformCount] = (short)componentPacket.readSignedSmart(55);
              }
              scratchInterpolationFlags[decodedTransformCount] = (byte)(componentFlags >>> 3 & 3);
              if (transformType == 2) {
                scratchTransformX[decodedTransformCount] = (short)(((scratchTransformX[decodedTransformCount] & 255) << 3) + (scratchTransformX[decodedTransformCount] >> 8 & 7));
                scratchTransformY[decodedTransformCount] = (short)(((scratchTransformY[decodedTransformCount] & 255) << 3) + (scratchTransformY[decodedTransformCount] >> 8 & 7));
                scratchTransformZ[decodedTransformCount] = (short)(((scratchTransformZ[decodedTransformCount] & 255) << 3) + (scratchTransformZ[decodedTransformCount] >> 8 & 7));
              }
              scratchPivotSlots[decodedTransformCount] = (short)-1;
              if (transformType != 1 &&
                transformType != 2 &&
                transformType != 3) {
                if (transformType != 5 &&
                  transformType != 7) {
                }
              } else {
                if (latestPivotSlot > lastEmittedPivotSlot) {
                  scratchPivotSlots[decodedTransformCount] = (short)latestPivotSlot;
                  lastEmittedPivotSlot = latestPivotSlot;
                }
              }
              decodedTransformCount++;
            }
          }
          if (componentPacket.position != encodedFrame.length) {
            throw new RuntimeException();
          }
          this.transformCount = decodedTransformCount;
          this.transformSlots = new short[decodedTransformCount];
          this.transformX = new short[decodedTransformCount];
          this.transformY = new short[decodedTransformCount];
          this.transformZ = new short[decodedTransformCount];
          this.precedingPivotSlots = new short[decodedTransformCount];
          this.interpolationFlags = new byte[decodedTransformCount];
          copiedTransform = 0;
          initialCopyCursor = copiedTransform;
          while (copiedTransform < decodedTransformCount) {
            this.transformSlots[copiedTransform] = scratchTransformSlots[copiedTransform];
            this.transformX[copiedTransform] = scratchTransformX[copiedTransform];
            this.transformY[copiedTransform] = scratchTransformY[copiedTransform];
            this.transformZ[copiedTransform] = scratchTransformZ[copiedTransform];
            this.precedingPivotSlots[copiedTransform] = scratchPivotSlots[copiedTransform];
            this.interpolationFlags[copiedTransform] = scratchInterpolationFlags[copiedTransform];
            copiedTransform++;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          decodeFailure = (Exception) (Object) decompiledCaughtException;
          this.transformCount = 0;
        }
    }

    public static void releaseDecoderScratch() {
        scratchTransformSlots = null;
        scratchTransformX = null;
        scratchTransformY = null;
        scratchTransformZ = null;
        scratchPivotSlots = null;
        scratchInterpolationFlags = null;
    }

    static {
        scratchTransformSlots = new short[500];
        scratchTransformZ = new short[500];
        scratchPivotSlots = new short[500];
        scratchTransformX = new short[500];
        scratchInterpolationFlags = new byte[500];
        scratchTransformY = new short[500];
    }
}
