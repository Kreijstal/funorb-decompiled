/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlPbuffer extends DualLinkNode {
    static String field_l;
    static GameStateFactory field_o;
    private long handle;
    int pixelCount;
    private OpenGlToolkit toolkit;

    final static boolean isChatInputDialogInitialized(int param0) {
        if (param0 != 0) {
          field_l = (String) null;
          return PendingRequest.savedChatInputWidget != null ? true : false;
        }
        return PendingRequest.savedChatInputWidget != null ? true : false;
    }

    protected final void finalize() throws Throwable {
        this.release(0);
        super.finalize();
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        field_l = null;
        int var1 = 112 / ((param0 - 32) / 56);
    }

    private final void release(int param0) {
        if (this.handle > (long)param0) {
          this.toolkit.field_c.releasePbuffer(this.handle);
          this.handle = 0L;
        }
    }

    final long getHandle(int param0) {
        if (param0 >= -122) {
          field_l = (String) null;
          return this.handle;
        }
        return this.handle;
    }

    OpenGlPbuffer(OpenGlToolkit param0, int param1, int param2) {
        try {
          this.pixelCount = param1 * param2;
          this.toolkit = param0;
          this.handle = this.toolkit.field_c.createPbuffer(param1, param2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "More special weapons";
        field_o = (GameStateFactory) ((Object) new AsteroidFactory());
    }
}
