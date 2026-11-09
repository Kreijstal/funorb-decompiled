/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static int field_a;
    static int field_c;
    static Js5Client field_b;

    final static RasterIndexedSprite a(int[] param0, RasterIndexedSprite param1, int param2) {
        RasterIndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        RasterIndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -53) {
            jk.releaseStatics((byte) 43);
          }
          var3 = new RasterIndexedSprite(0, 0, 0);
          var3.offsetY = param1.offsetY;
          var3.fullHeight = param1.fullHeight;
          var3.height = param1.height;
          var3.offsetX = param1.offsetX;
          var3.palette = param0;
          var3.indices = param1.indices;
          var3.width = param1.width;
          var3.fullWidth = param1.fullWidth;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("jk.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -104) {
          RasterIndexedSprite var2 = (RasterIndexedSprite) null;
          jk.a((int[]) null, (RasterIndexedSprite) null, -102);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
    }
}
