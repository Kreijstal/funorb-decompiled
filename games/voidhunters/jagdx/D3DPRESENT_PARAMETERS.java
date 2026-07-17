/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class D3DPRESENT_PARAMETERS {
    public boolean Windowed;
    public java.awt.Canvas DeviceWindow;
    public int FullScreen_RefreshRateInHz;
    public int BackBufferFormat;
    public int BackBufferCount;
    public int MultiSampleType;
    public int BackBufferWidth;
    public int MultiSampleQuality;
    public int PresentationInterval;
    public int Flags;
    public boolean EnableAutoDepthStencil;
    public int SwapEffect;
    public int BackBufferHeight;
    public int AutoDepthStencilFormat;

    public D3DPRESENT_PARAMETERS(java.awt.Canvas param0) {
        ((jagdx.D3DPRESENT_PARAMETERS) this).MultiSampleType = 0;
        ((jagdx.D3DPRESENT_PARAMETERS) this).PresentationInterval = 0;
        ((jagdx.D3DPRESENT_PARAMETERS) this).MultiSampleQuality = 0;
        ((jagdx.D3DPRESENT_PARAMETERS) this).SwapEffect = 1;
        ((jagdx.D3DPRESENT_PARAMETERS) this).AutoDepthStencilFormat = 0;
        ((jagdx.D3DPRESENT_PARAMETERS) this).BackBufferFormat = 0;
        ((jagdx.D3DPRESENT_PARAMETERS) this).BackBufferCount = 0;
        ((jagdx.D3DPRESENT_PARAMETERS) this).BackBufferHeight = 0;
        ((jagdx.D3DPRESENT_PARAMETERS) this).BackBufferWidth = 0;
        ((jagdx.D3DPRESENT_PARAMETERS) this).DeviceWindow = param0;
    }
}
