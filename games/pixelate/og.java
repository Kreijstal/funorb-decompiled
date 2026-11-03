/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends IntrusiveNode {
    int field_m;
    static boolean field_l;
    byte[] field_k;
    static String field_n;

    final static boolean a(byte param0) {
        int var1 = 82 % ((-28 - param0) / 42);
        return ck.a(true, AudioService.a(13867));
    }

    final static Sprite[] a(int param0, boolean param1, int param2, int param3, int param4) {
        if (param1) {
          return ra.buildNineSliceSprites(1, 1, param3, param0, 3, (byte) 126, param4, param2, 1);
        }
        og.a(65, true, -72, -125, 47);
        return ra.buildNineSliceSprites(1, 1, param3, param0, 3, (byte) 126, param4, param2, 1);
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        int var1 = 25 / ((param0 + 44) / 41);
    }

    og(byte[] param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Game options";
    }
}
