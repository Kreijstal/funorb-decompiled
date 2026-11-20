/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class OpenGlEnvironmentMapSource extends EnvironmentMapSource {
    private static String field_z;

    abstract OpenGlCubeTexture getCubeTexture(byte param0);

    private OpenGlEnvironmentMapSource() throws Throwable {
        throw new Error();
    }

    static {
        field_z = "bu.<init>()";
    }
}
