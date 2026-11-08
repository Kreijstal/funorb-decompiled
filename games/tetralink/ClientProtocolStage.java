/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientProtocolStage {
    static String field_e;
    static Sprite field_c;
    static int[][] field_g;
    static String field_f;
    static String[] field_i;
    static float field_d;
    static int[] field_b;
    static int field_a;
    static int field_h;

    final boolean isPostRequestStage(byte param0) {
        int var2 = -7 % ((50 - param0) / 33);
        if (this == ProxySocketConnector.field_l) {
          return true;
        }
        if (RandomAccessCacheFile.field_f == this) {
          return true;
        }
        if (this != WhirlpoolHasher.field_a) {
          return false;
        }
        return true;
    }

    final static int beginLogin(ConditionalTextValue param0, ConditionalTextValue param1, byte param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -28) {
            stackIn_2_0 = -41;
            return stackIn_2_0;
          }
          var4 = (String) null;
          stackIn_4_0 = NumericDateInputWidget.performAccountServerRequest((byte) 98, (String) null, param1, 0, 0, false, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("a.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        field_g = (int[][]) null;
        field_e = null;
        field_i = null;
        if (param0 != 0) {
          field_f = (String) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_i = new String[]{"Turn time (seconds)"};
        field_f = "Your turn";
        field_e = "Name is available";
        field_a = 0;
    }
}
