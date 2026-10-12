/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    String field_f;
    static int field_e;
    boolean field_d;
    String field_c;
    static RgbSprite field_g;
    static int pointerY;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        field_g = null;
        if (param0) {
          Object var2 = (Object) null;
          ko.getStoredBytes(false, -124, (Object) null);
        }
    }

    final static byte[] getStoredBytes(boolean copyByteArrays, int obfuscationGuard, Object storedData) {
        byte[] byteArray = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        ByteStorage byteStorage = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (storedData == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (storedData instanceof byte[]) {
            byteArray = (byte[]) (storedData);
            if (copyByteArrays) {
              stackIn_8_0 = SkeletonLimitMarker.a(byteArray, 31732);
              return stackIn_8_0;
            }
            stackIn_6_0 = byteArray;
            return stackIn_6_0;
          }
          if (storedData instanceof ByteStorage) {
            byteStorage = (ByteStorage) (storedData);
            stackIn_12_0 = byteStorage.getBytes(0);
            return stackIn_12_0;
          }
          if (obfuscationGuard < 30) {
            var4 = (Object) null;
            ko.getStoredBytes(false, 22, (Object) null);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ko.A(").append(copyByteArrays).append(',').append(obfuscationGuard).append(',');
          if (storedData == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_g = new RgbSprite(56, 56);
        pointerY = 0;
        field_a = "Player";
    }
}
