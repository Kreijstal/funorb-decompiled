/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FourIntUpdateRequest extends IntrusiveNode {
    int firstValue;
    int byteKey;
    int smartKey;
    int thirdValue;
    int fourthValue;
    static PlatformTaskDispatcher platformDispatcher;
    int secondValue;

    final static boolean readAccountPacketBody(byte guard) {
        if (guard != 119) {
          FourIntUpdateRequest.muteSoundEffects((byte) -70);
          if (-1 == HardwareBufferSet.accountPacketLength) {
            if (!OpenGlIndexBuffer.readAccountBytes(-1, 1)) {
              return false;
            }
            HardwareBufferSet.accountPacketLength = NativeLibraryExtractor.incomingPacket.readUnsignedByte(-31302);
            NativeLibraryExtractor.incomingPacket.position = 0;
          }
          if (HardwareBufferSet.accountPacketLength == -2) {
            if (!OpenGlIndexBuffer.readAccountBytes(-1, 2)) {
              return false;
            }
            HardwareBufferSet.accountPacketLength = NativeLibraryExtractor.incomingPacket.readUnsignedShort(255);
            NativeLibraryExtractor.incomingPacket.position = 0;
          }
          return OpenGlIndexBuffer.readAccountBytes(-1, HardwareBufferSet.accountPacketLength);
        }
        if (-1 == HardwareBufferSet.accountPacketLength) {
          if (!OpenGlIndexBuffer.readAccountBytes(-1, 1)) {
            return false;
          }
          HardwareBufferSet.accountPacketLength = NativeLibraryExtractor.incomingPacket.readUnsignedByte(-31302);
          NativeLibraryExtractor.incomingPacket.position = 0;
        }
        if (HardwareBufferSet.accountPacketLength == -2) {
          if (!OpenGlIndexBuffer.readAccountBytes(-1, 2)) {
            return false;
          }
          HardwareBufferSet.accountPacketLength = NativeLibraryExtractor.incomingPacket.readUnsignedShort(255);
          NativeLibraryExtractor.incomingPacket.position = 0;
        }
        return OpenGlIndexBuffer.readAccountBytes(-1, HardwareBufferSet.accountPacketLength);
    }

    final static void muteSoundEffects(byte guard) {
        LegacyOpenGlRenderBufferSet.setSoundVolume(0, (byte) -58);
        if (guard != 53) {
          platformDispatcher = (PlatformTaskDispatcher) null;
        }
    }

    public static void releaseStatics(int param0) {
        platformDispatcher = null;
        if (param0 != 1) {
          platformDispatcher = (PlatformTaskDispatcher) null;
        }
    }

    private FourIntUpdateRequest() throws Throwable {
        throw new Error();
    }

    static {
    }
}
