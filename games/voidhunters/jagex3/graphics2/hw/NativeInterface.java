/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagex3.graphics2.hw;

public class NativeInterface {
    long peer;

    final native void copyPositions(int[] param0, int[] param1, int[] param2, short[] param3, int param4, int param5, int param6, long param7);

    public final native void initTextureMetrics(int param0, byte param1, byte param2);

    public final native void setSunColour(float param0, float param1, float param2, float param3, float param4);

    public final native void release();

    public final native void setSunDirection(float param0, float param1, float param2);

    final native void copyNormals(short[] param0, short[] param1, short[] param2, byte[] param3, float param4, float param5, int param6, int param7, int param8, long param9);

    final native void copyColours(short[] param0, byte[] param1, short[] param2, int param3, short[] param4, int param5, int param6, int param7, long param8);

    public final native void setAmbient(float param0);

    public NativeInterface(int param0, int param1) {
        this.init(param0, param1);
    }

    private final native void init(int param0, int param1);

    final native void copyLighting(short[] param0, byte[] param1, short[] param2, short[] param3, short[] param4, short[] param5, byte[] param6, int param7, int param8, short[] param9, int param10, int param11, int param12, long param13);

    final native void copyTexCoords(float[] param0, float[] param1, int param2, int param3, int param4, long param5);
}
