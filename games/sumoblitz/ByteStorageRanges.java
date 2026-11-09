/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteStorageRanges {
    final static byte[] copyRange(Object storage, int guard, int length, int offset) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        ByteArrayStorage var5 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (storage == null) {
            return null;
          }
          if (storage instanceof byte[]) {
            var4 = (byte[]) (storage);
            stackIn_6_0 = LegacyOpenGlGraphicsHeap.copyByteRange(var4, length, offset, (byte) 53);
            return stackIn_6_0;
          }
          if (storage instanceof ByteArrayStorage) {
            var5 = (ByteArrayStorage) (storage);
            stackIn_9_0 = var5.copyRange(offset, length, 15747);
            return stackIn_9_0;
          }
          if (guard == 14381) {
            throw new IllegalArgumentException();
          }
          stackIn_12_0 = (byte[]) null;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("iq.A(");
          if (storage == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(',').append(length).append(',').append(offset).append(')').toString());
        }
    }

    static {
    }
}
