/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class TextureCombineSource {
    static Hashtable extractedNativeLibraryFiles;
    static int field_a;

    final static int reverseBits(byte guard, int value, int count) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 0;
          while (0 < count) {
            var3_int = var3_int << 1 | value & 1;
            count--;
            value = value >>> 1;
          }
          if (guard != 72) {
            field_a = 103;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "mi.B(" + guard + ',' + value + ',' + count + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(boolean param0) {
        extractedNativeLibraryFiles = null;
        if (param0) {
          TextureCombineSource.reverseBits((byte) 75, 50, 40);
        }
    }

    static {
        extractedNativeLibraryFiles = new Hashtable();
        field_a = 0;
    }
}
