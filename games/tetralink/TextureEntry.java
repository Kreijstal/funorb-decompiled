/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureEntry {
    float field_f;
    int[] field_c;
    static String field_d;
    int field_b;
    static String field_a;
    int field_e;

    final static void setSharedArchives(Archive param0, boolean param1, Archive param2) {
        NodeHashTableIterator.field_c = param2;
        if (!param1) {
          return;
        }
        try {
          EditableTextWidget.field_T = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "jn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 != 122) {
          field_a = (String) null;
        }
    }

    TextureEntry(PacketBuffer param0) {
        int var2_int = 0;
        try {
          this.field_b = param0.readUnsignedShort(127);
          param0.readUnsignedByte((byte) -99);
          var2_int = param0.readUnsignedByte((byte) -99);
          if (var2_int != 1) {
            throw new RuntimeException();
          }
          this.field_e = param0.readUnsignedShort(127);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Your game";
        field_a = "Only show private chat from my friends and opponents";
    }
}
