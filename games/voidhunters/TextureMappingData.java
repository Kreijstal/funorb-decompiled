/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureMappingData {
    int[] originY;
    static Sprite field_a;
    static boolean field_e;
    int[] originZ;
    float[][] transforms;
    int[] originX;

    final static int packChatFilters(byte param0) {
        if (param0 == 75) {
          return (ActivateSelfDestructOrderDefinition.field_d << 4) + ((GetThrusterSmallForce.field_p << 2) + GzipCodec.field_h);
        }
        TextureMappingData.clearSharedReferences(108);
        return (ActivateSelfDestructOrderDefinition.field_d << 4) + ((GetThrusterSmallForce.field_p << 2) + GzipCodec.field_h);
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != 181765988) {
          field_e = false;
        }
    }

    TextureMappingData(int[] param0, int[] param1, int[] param2, float[][] param3) {
        try {
          this.originY = param1;
          this.originZ = param2;
          this.transforms = param3;
          this.originX = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "kua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
