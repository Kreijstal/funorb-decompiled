/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class D3DPRESENT_PARAMETERS {
    public boolean EnableAutoDepthStencil;
    public int SwapEffect;
    public int AutoDepthStencilFormat;
    public int BackBufferHeight;
    public int BackBufferCount;
    public int BackBufferFormat;
    public int PresentationInterval;
    public int BackBufferWidth;
    public java.awt.Canvas DeviceWindow;
    public boolean Windowed;
    public int FullScreen_RefreshRateInHz;
    public int Flags;
    public int MultiSampleQuality;
    public int MultiSampleType;

    public D3DPRESENT_PARAMETERS(java.awt.Canvas param0) {
        this.SwapEffect = 1;
        this.BackBufferHeight = 0;
        this.AutoDepthStencilFormat = 0;
        this.BackBufferCount = 0;
        this.BackBufferFormat = 0;
        this.BackBufferWidth = 0;
        this.MultiSampleType = 0;
        this.MultiSampleQuality = 0;
        this.PresentationInterval = 0;
        this.DeviceWindow = param0;
    }
}
