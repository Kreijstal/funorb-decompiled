/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureTransformMode {
    static String field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 == -2626) {
          return 0 != (2048 & param2) ? true : false;
        }
        TextureTransformMode.releaseStatics((byte) -118);
        return 0 != (2048 & param2) ? true : false;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static LegacyAlphaFont loadAlphaFont(ResourceArchive fontArchive, byte guard, int fileId, int groupId, ResourceArchive spriteArchive) {
        RuntimeException var5 = null;
        LegacyAlphaFont stackIn_5_0 = null;
        LegacyAlphaFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!SpriteSheetSupport.decodeSpriteSheet(spriteArchive, groupId, fileId, -23046)) {
            return null;
          }
          if (guard < -11) {
            stackIn_7_0 = ScrollControl.a(false, fontArchive.fetchFile((byte) 94, groupId, fileId));
            return stackIn_7_0;
          }
          stackIn_5_0 = (LegacyAlphaFont) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("tf.C(");
          if (fontArchive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(',').append(fileId).append(',').append(groupId).append(',');
          if (spriteArchive == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 != 17) {
          TextureTransformMode.a(-5, -49, 114);
        }
    }

    static {
        field_a = "OK";
    }
}
