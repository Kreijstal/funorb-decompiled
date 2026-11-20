/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GpuEnvironmentMapSource extends EnvironmentMapSource {
    static llb field_c;
    static int field_d;

    private GpuEnvironmentMapSource() throws Throwable {
        throw new Error();
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        field_c = null;
    }

    abstract GpuCubeTexture getCubeTexture(byte param0);

    static {
        field_d = 0;
    }
}
