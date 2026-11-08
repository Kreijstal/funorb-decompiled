/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SaveDataRequest extends IntrusiveNode {
    int field_m;
    static boolean field_l;
    byte[] field_k;
    static String field_n;

    final static boolean hasTuhstatbutCookie(byte param0) {
        int var1 = 82 % ((-28 - param0) / 42);
        return FloatingSquare.hasTuhstatbutCookie(true, AudioService.getApplet(13867));
    }

    final static Sprite[] buildBevelFrame(int param0, boolean param1, int param2, int param3, int param4) {
        if (param1) {
          return NineSliceSpriteFactory.buildNineSliceSprites(1, 1, param3, param0, 3, (byte) 126, param4, param2, 1);
        }
        SaveDataRequest.buildBevelFrame(65, true, -72, -125, 47);
        return NineSliceSpriteFactory.buildNineSliceSprites(1, 1, param3, param0, 3, (byte) 126, param4, param2, 1);
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        int var1 = 25 / ((param0 + 44) / 41);
    }

    SaveDataRequest(byte[] param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Game options";
    }
}
