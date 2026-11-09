/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlVertexBuffer extends LegacyOpenGlBuffer implements LegacyVertexBuffer {
    static String field_k;
    static int field_j;

    public final int bufferId(int guard) {
        if (guard != 2721) {
          return 47;
        }
        return this.bufferHandle;
    }

    final void bind(int guard) {
        this.toolkit.bindVertexBuffer((LegacyVertexBuffer) (this), -127);
        if (guard != 1735490466) {
          this.bind(52);
        }
    }

    final static void requestPolicyPage(byte guard, String path) {
        try {
          ArchiveProvider.field_c = path;
          ReflectionCheck.setAccountDialogResult(12, -78);
          if (guard < 62) {
            field_k = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hn.B(" + guard + ',' + (path != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_k = null;
        if (!param0) {
          field_j = -101;
        }
    }

    LegacyOpenGlVertexBuffer(LegacyOpenGlGraphicsToolkit renderer, int unused, byte[] data, int size, boolean useStreaming) {
        super(renderer, 34962, data, size, useStreaming);
    }

    final static int nextPowerOfTwo(boolean guard, int value) {
        value--;
        if (!guard) {
          value = value | value >>> 1;
          value = value | value >>> 2;
          value = value | value >>> 4;
          value = value | value >>> 8;
          value = value | value >>> 16;
          return value + 1;
        }
        return -71;
    }

    static {
    }
}
