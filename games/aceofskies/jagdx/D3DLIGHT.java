/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class D3DLIGHT extends jaclib.peer.nd {
    public final native void SetDiffuse(float param0, float param1, float param2, float param3);

    public D3DLIGHT(jaclib.peer.qt param0) {
        super(param0);
        this.Init();
    }

    public final native void SetType(int param0);

    private final native void Init();

    public final native void SetRange(float param0);

    public final native void SetDirection(float param0, float param1, float param2);

    public final native void SetSpotParams(float param0, float param1, float param2);

    public final native void SetAmbient(float param0, float param1, float param2, float param3);

    public final native void SetSpecular(float param0, float param1, float param2, float param3);

    public final native void SetPosition(float param0, float param1, float param2);

    public final native void SetAttenuation(float param0, float param1, float param2);
}
