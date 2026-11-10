/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextDecodeHelpers {
    static int field_b;
    static char[] field_a;

    final static String decodeText(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 56) {
            TextDecodeHelpers.releaseStatics((byte) -92);
          }
          stackIn_3_0 = SpatialObject.decodeSingleByteText(param0, param0.length, 0, -73);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gg.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void refreshMinimapPassability(int param0) {
        TextLayout.field_a = Js5Archive.field_e.navigation.field_A.field_p;
        TextFieldValidator.createSelectionCircleSprites((byte) 36);
        if (param0 != 128) {
          byte[] var2 = (byte[]) null;
          TextDecodeHelpers.decodeText((byte[]) null, (byte) 70);
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 >= -85) {
          field_a = (char[]) null;
        }
    }

    static {
        field_b = 20;
        field_a = new char[128];
    }
}
