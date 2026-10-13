/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayNode extends IntrusiveNode {
    static int[] field_j;
    static String field_l;
    byte[] bytes;
    static RgbSprite volcanicFarSprite;

    final static RgbSprite[] a(int param0, byte param1, int param2) {
        if (param1 == -18) {
          return hn.a(param2, param0, 1, param1 ^ 24);
        }
        CharSequence var4 = (CharSequence) null;
        ByteArrayNode.a(21, (CharSequence) null);
        return hn.a(param2, param0, 1, param1 ^ 24);
    }

    public static void a(int param0) {
        field_j = null;
        int var1 = 10 / ((param0 + 33) / 35);
        volcanicFarSprite = null;
        field_l = null;
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17165) {
            ByteArrayNode.a(-74, (byte) 25, 127);
          }
          stackIn_3_0 = jd.a((byte) 122, false, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("se.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    ByteArrayNode(byte[] bytes) {
        try {
          this.bytes = bytes;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "se.<init>(" + (bytes != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new int[]{17, 18, 8};
        field_l = "Go Back";
    }
}
