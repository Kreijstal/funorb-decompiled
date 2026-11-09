/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class OpenGlIndexBuffer extends OpenGlBuffer implements IndexBuffer {
    static ToolkitSprite[] field_p;
    private GpuDataType indexType;

    public final void close(int guard) {
        if (guard == 12001) {
          super.close(guard + 0);
          return;
        }
        this.unmap(-31);
        super.close(guard + 0);
    }

    public final boolean unmap(int guard) {
        if (guard == -28833) {
          return super.unmap(this.toolkit.field_Qc, (byte) 92);
        }
        field_p = (ToolkitSprite[]) null;
        return super.unmap(this.toolkit.field_Qc, (byte) 92);
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_p = null;
    }

    final static void g(int param0) {
        LegacyOpenGlSpecularEffect.field_h[1] = LegacyOpenGlEffectManager.selectedTractionLevel;
        LegacyOpenGlSpecularEffect.field_h[0] = ResourceArchive.selectedSpeedLevel;
        LegacyOpenGlSpecularEffect.field_h[2] = AccountStatusDialogState.selectedBounceLevel;
        IsaacPacketBuffer.field_u = LegacyOpenGlSpecularEffect.field_h[1] + LegacyOpenGlSpecularEffect.field_h[0] - 2 + (LegacyOpenGlSpecularEffect.field_h[2] - 1);
        if (param0 < 100) {
          OpenGlIndexBuffer.b(46, -94);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (NativeLibraryExtractor.incomingPacket.position >= param1) {
            return true;
          }
          if (null == DisplayModeConfirmationDialog.accountSocket) {
            return false;
          }
          try {
            var2_int = DisplayModeConfirmationDialog.accountSocket.available(param0 ^ 36);
            if (0 >= var2_int) {
              if (~var2_int > param0) {
                LegacyOpenGlTextureCache.closeAccountSocket((byte) -118);
                return false;
              }
              if (IntroductionOverlaySupport.millisSinceServerRead(26560) <= 30000L) {
                return false;
              }
              LegacyOpenGlTextureCache.closeAccountSocket((byte) -118);
              return false;
            }
            if (-NativeLibraryExtractor.incomingPacket.position + param1 < var2_int) {
              var2_int = -NativeLibraryExtractor.incomingPacket.position + param1;
            }
            DisplayModeConfirmationDialog.accountSocket.readFully(param0 ^ 99, NativeLibraryExtractor.incomingPacket.position, var2_int, NativeLibraryExtractor.incomingPacket.payload);
            CacheReferenceNode.lastServerReadMillis = IntroMeshResources.monotonicTimeMillis(-47);
            NativeLibraryExtractor.incomingPacket.position = NativeLibraryExtractor.incomingPacket.position + var2_int;
            if (NativeLibraryExtractor.incomingPacket.position < param1) {
              return false;
            }
            NativeLibraryExtractor.incomingPacket.position = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            LegacyOpenGlTextureCache.closeAccountSocket((byte) -127);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void allocate(byte guard, int indexCount) {
        if (guard < -67) {
          super.allocate((byte) -87, this.indexType.bytesPerComponent * indexCount);
          return;
        }
        this.unmap(61);
        super.allocate((byte) -87, this.indexType.bytesPerComponent * indexCount);
    }

    OpenGlIndexBuffer(OpenGlGraphicsToolkit param0, GpuDataType param1, boolean param2) {
        super(param0, 34963, param2);
        try {
          this.indexType = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ju.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final jaclib.memory.Buffer map(boolean discard, int guard) {
        if (guard == 10081) {
          return super.map(discard, guard ^ 10083, this.toolkit.field_Qc);
        }
        field_p = (ToolkitSprite[]) null;
        return super.map(discard, guard ^ 10083, this.toolkit.field_Qc);
    }

    static {
    }
}
