/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class as extends bkb {
    static llb field_c;
    static int field_d;

    private as() throws Throwable {
        throw new Error();
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        field_c = null;
    }

    abstract GpuCubeTexture a(byte param0);

    static {
        field_d = 0;
    }
}
