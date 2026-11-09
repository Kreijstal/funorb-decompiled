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
        wt.field_h[1] = LegacyOpenGlEffectManager.field_i;
        wt.field_h[0] = ResourceArchive.field_f;
        wt.field_h[2] = hc.field_f;
        pl.field_u = wt.field_h[1] + wt.field_h[0] - 2 + (wt.field_h[2] - 1);
        if (param0 < 100) {
          OpenGlIndexBuffer.b(46, -94);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (ig.field_a.position >= param1) {
            return true;
          }
          if (null == DisplayModeConfirmationDialog.field_O) {
            return false;
          }
          try {
            var2_int = DisplayModeConfirmationDialog.field_O.available(param0 ^ 36);
            if (0 >= var2_int) {
              if (~var2_int > param0) {
                kk.a((byte) -118);
                return false;
              }
              if (uc.b(26560) <= 30000L) {
                return false;
              }
              kk.a((byte) -118);
              return false;
            }
            if (-ig.field_a.position + param1 < var2_int) {
              var2_int = -ig.field_a.position + param1;
            }
            DisplayModeConfirmationDialog.field_O.readFully(param0 ^ 99, ig.field_a.position, var2_int, ig.field_a.payload);
            CacheReferenceNode.field_x = wq.a(-47);
            ig.field_a.position = ig.field_a.position + var2_int;
            if (ig.field_a.position < param1) {
              return false;
            }
            ig.field_a.position = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            kk.a((byte) -127);
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
