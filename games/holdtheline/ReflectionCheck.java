/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheck extends IntrusiveNode {
    static int field_o;
    PlatformTask[] fieldTasks;
    int[] fieldWriteValues;
    static String[] field_i;
    int[] operations;
    int[] errors;
    int requestId;
    int operationCount;
    byte[][][] serializedArguments;
    PlatformTask[] methodTasks;

    final static boolean a(boolean param0) {
        RotatedSpriteAsset.field_n = true;
        AlternateUsernameLoginCredentials.field_k = 15000L + bb.monotonicTimeMillis(-1);
        if (!param0) {
          return DiskCacheRequest.field_w == 11 ? true : false;
        }
        ReflectionCheck.a(false);
        return DiskCacheRequest.field_w == 11 ? true : false;
    }

    public static void clearSharedReferences(boolean param0) {
        field_i = null;
        if (!param0) {
          field_i = (String[]) null;
        }
    }

    ReflectionCheck() {
    }

    static {
        field_o = 4;
    }
}
