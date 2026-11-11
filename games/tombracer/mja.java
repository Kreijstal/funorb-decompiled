/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mja {
    final static boolean loadDirect3DLibraries(byte param0) {
        if (!StringCursor.loadNativeLibrary("jaclib", param0 + 530)) {
          return false;
        }
        if (param0 == -50) {
          return StringCursor.loadNativeLibrary("hw3d", param0 + 530);
        }
        return true;
    }

    static {
    }
}
