/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class HardwareCubeMapSource extends CubeMapSource {
    static IntrusiveDeque field_d;

    abstract CubeTexture cubeTexture(int guard);

    final static boolean isDisabledMeshFeature(boolean guard, int flags, int otherFlags) {
        if (guard) {
          field_d = (IntrusiveDeque) null;
          return false;
        }
        return false;
    }

    private HardwareCubeMapSource() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_d = (IntrusiveDeque) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_d = new IntrusiveDeque();
    }
}
