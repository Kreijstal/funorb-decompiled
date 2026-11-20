/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareFramebuffer implements Framebuffer {
    NativeSoftwareSprite field_a;
    NativeSoftwareDepthBuffer field_b;

    NativeSoftwareFramebuffer(NativeSoftwareToolkit param0, NativeSoftwareSprite param1, NativeSoftwareDepthBuffer param2) {
        this.field_a = param1;
        this.field_b = param2;
    }
}
