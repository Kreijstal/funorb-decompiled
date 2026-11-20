/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlDisplayLists {
    static String field_b;
    private int baseListId;
    static PacketBuffer field_a;

    final void endList(int param0) {
        jaggl.OpenGL.glEndList();
        if (param0 != 4864) {
          this.endList(30);
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -4509) {
          field_b = (String) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final void callList(boolean param0, char param1) {
        if (param0) {
          jaggl.OpenGL.glCallList(this.baseListId + param1);
          return;
        }
        this.baseListId = 21;
        jaggl.OpenGL.glCallList(this.baseListId + param1);
    }

    OpenGlDisplayLists(OpenGlToolkit param0, int param1) {
        try {
          this.baseListId = jaggl.OpenGL.glGenLists(param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void beginList(int param0, int param1) {
        jaggl.OpenGL.glNewList(this.baseListId + param1, 4864);
        if (param0 >= -79) {
          field_a = (PacketBuffer) null;
        }
    }

    static {
        field_b = "Armageddon in <%0>...";
    }
}
