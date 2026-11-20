/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareFramebuffer implements Framebuffer {
    static gl field_f;
    int height;
    private SoftwareDepthBuffer depthBuffer;
    float[] depth;
    static String field_a;
    int[] pixels;
    int width;

    final static void a(int param0) {
        CharSequence var3 = null;
        if (param0 < -84) {
          kca.field_a = qga.field_b.readString(-1);
          var3 = (CharSequence) ((Object) kca.field_a);
          ffb.field_e = jwa.a(false, var3);
          return;
        }
        field_a = (String) null;
        kca.field_a = qga.field_b.readString(-1);
        CharSequence var2 = (CharSequence) ((Object) kca.field_a);
        ffb.field_e = jwa.a(false, var2);
    }

    final static void insertBefore(IntrusiveNode param0, IntrusiveNode param1, int param2) {
        try {
          if (param0.previous != null) {
            param0.unlink(-3846);
          }
          param0.previous = param1.previous;
          param0.next = param1;
          param0.previous.next = param0;
          if (param2 != 2) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            SoftwareFramebuffer.insertBefore((IntrusiveNode) null, (IntrusiveNode) null, 44);
          }
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "al.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    SoftwareFramebuffer(SoftwareToolkit param0, ToolkitSprite param1, SoftwareDepthBuffer param2) {
        SoftwareArgbSprite var6 = null;
        SoftwareRgbSprite var5 = null;
        try {
          if (param1 instanceof SoftwareRgbSprite) {
            var5 = (SoftwareRgbSprite) (param1);
            this.width = var5.width;
            this.height = var5.height;
            this.pixels = var5.pixels;
          } else {
            if (!(param1 instanceof SoftwareArgbSprite)) {
              throw new RuntimeException();
            }
            var6 = (SoftwareArgbSprite) (param1);
            this.pixels = var6.pixels;
            this.height = var6.height;
            this.width = var6.width;
          }
          if (param2 != null) {
            this.depthBuffer = param2;
            if (this.width != this.depthBuffer.width ||
              this.height != this.depthBuffer.height) {
              throw new RuntimeException();
            }
            this.depth = this.depthBuffer.depth;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          SoftwareFramebuffer.a(-57);
          field_f = null;
          field_a = null;
          return;
        }
        field_f = null;
        field_a = null;
    }

    static {
        field_f = new gl(2);
    }
}
