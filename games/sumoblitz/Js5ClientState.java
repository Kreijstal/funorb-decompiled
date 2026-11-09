/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Js5ClientState {
    static int field_a;
    static int field_c;
    static Js5Client field_b;

    final static RasterIndexedSprite withPalette(int[] palette, RasterIndexedSprite sprite, int guard) {
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
          if (guard >= -53) {
            Js5ClientState.releaseStatics((byte) 43);
          }
          var3 = new RasterIndexedSprite(0, 0, 0);
          var3.offsetY = sprite.offsetY;
          var3.fullHeight = sprite.fullHeight;
          var3.height = sprite.height;
          var3.offsetX = sprite.offsetX;
          var3.palette = palette;
          var3.indices = sprite.indices;
          var3.width = sprite.width;
          var3.fullWidth = sprite.fullWidth;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("jk.B(");
          if (palette == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (sprite == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -104) {
          RasterIndexedSprite var2 = (RasterIndexedSprite) null;
          Js5ClientState.withPalette((int[]) null, (RasterIndexedSprite) null, -102);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
    }
}
