/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareFramebuffer implements Framebuffer {
    NativeSoftwareDepthBuffer field_b;
    NativeSoftwareRenderSprite field_a;

    NativeSoftwareFramebuffer(NativeSoftwareRenderer param0, NativeSoftwareRenderSprite param1, NativeSoftwareDepthBuffer param2) {
        this.field_a = param1;
        this.field_b = param2;
    }
}
