/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ByteArrayPool {
    static int[] field_b;
    static Hashtable field_a;
    static int field_c;

    final static int highestOneBit(int value, boolean guard) {
        int var2 = value >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        if (guard) {
          field_c = -100;
        }
        var2 = var2 | var2 >>> 16;
        return value & ~var2;
    }

    final synchronized static byte[] allocate(int guard, int length) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (length == 100 &&
          0 < RotarySelectorRenderer.field_b) {
          fieldTemp$3 = RotarySelectorRenderer.field_b - 1;
          RotarySelectorRenderer.field_b = RotarySelectorRenderer.field_b - 1;
          var2_ref_byte__ = LoginIdentifierSupport.field_f[fieldTemp$3];
          LoginIdentifierSupport.field_f[RotarySelectorRenderer.field_b] = null;
          return var2_ref_byte__;
        }
        if (5000 == length &&
          ActiveCanvasProvider.field_a > 0) {
          fieldTemp$4 = ActiveCanvasProvider.field_a - 1;
          ActiveCanvasProvider.field_a = ActiveCanvasProvider.field_a - 1;
          var2_ref_byte__Lifetime1 = HuffmanDecoder.field_d[fieldTemp$4];
          HuffmanDecoder.field_d[ActiveCanvasProvider.field_a] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (30000 == length &&
          0 < ImageProducerRasterBuffer.field_k) {
          fieldTemp$5 = ImageProducerRasterBuffer.field_k - 1;
          ImageProducerRasterBuffer.field_k = ImageProducerRasterBuffer.field_k - 1;
          var2_ref_byte__Lifetime2 = ke.field_b[fieldTemp$5];
          ke.field_b[ImageProducerRasterBuffer.field_k] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (null != CompactMeshGeometry.field_w) {
          for (var2 = 0; var2 < RasterColorTables.bytePoolSizes.length; var2++) {
            if (length == RasterColorTables.bytePoolSizes[var2] &&
              IntroMeshMaterial.bytePoolCounts[var2] > 0) {
              dupTemp$6 = IntroMeshMaterial.bytePoolCounts[var2] - 1;
              arrayValue$7 = CompactMeshGeometry.field_w[var2];
              IntroMeshMaterial.bytePoolCounts[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              CompactMeshGeometry.field_w[var2][IntroMeshMaterial.bytePoolCounts[var2]] = null;
              return var3;
            }
          }
        }
        var2Lifetime1 = 26 % ((42 - guard) / 51);
        return new byte[length];
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        int var1 = -11 % ((-56 - param0) / 45);
        field_b = null;
    }

    static {
        field_a = new Hashtable();
        field_c = 0;
    }
}
