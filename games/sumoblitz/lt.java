/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lt extends IntrusiveNode {
    int field_n;
    int field_k;
    int field_o;
    int field_q;
    int field_l;
    static PlatformTaskDispatcher field_m;
    int field_p;

    final static boolean a(byte param0) {
        if (param0 != 119) {
          lt.c((byte) -70);
          if (-1 == HardwareBufferSet.field_d) {
            if (!OpenGlIndexBuffer.b(-1, 1)) {
              return false;
            }
            HardwareBufferSet.field_d = NativeLibraryExtractor.field_a.readUnsignedByte(-31302);
            NativeLibraryExtractor.field_a.position = 0;
          }
          if (HardwareBufferSet.field_d == -2) {
            if (!OpenGlIndexBuffer.b(-1, 2)) {
              return false;
            }
            HardwareBufferSet.field_d = NativeLibraryExtractor.field_a.readUnsignedShort(255);
            NativeLibraryExtractor.field_a.position = 0;
          }
          return OpenGlIndexBuffer.b(-1, HardwareBufferSet.field_d);
        }
        if (-1 == HardwareBufferSet.field_d) {
          if (!OpenGlIndexBuffer.b(-1, 1)) {
            return false;
          }
          HardwareBufferSet.field_d = NativeLibraryExtractor.field_a.readUnsignedByte(-31302);
          NativeLibraryExtractor.field_a.position = 0;
        }
        if (HardwareBufferSet.field_d == -2) {
          if (!OpenGlIndexBuffer.b(-1, 2)) {
            return false;
          }
          HardwareBufferSet.field_d = NativeLibraryExtractor.field_a.readUnsignedShort(255);
          NativeLibraryExtractor.field_a.position = 0;
        }
        return OpenGlIndexBuffer.b(-1, HardwareBufferSet.field_d);
    }

    final static void c(byte param0) {
        lf.setSoundVolume(0, (byte) -58);
        if (param0 != 53) {
          field_m = (PlatformTaskDispatcher) null;
        }
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        if (param0 != 1) {
          field_m = (PlatformTaskDispatcher) null;
        }
    }

    private lt() throws Throwable {
        throw new Error();
    }

    static {
    }
}
