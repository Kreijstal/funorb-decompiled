/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlShader {
    private HardwareOpenGlToolkit toolkit;
    long handle;
    private static String[] field_b;

    final static boolean requiresTexCoordBufferCopy(int param0, int param1, int param2) {
        if (param1 == -23611) {
          return MovingSawComponent.hasMutableTexCoords(param2, (byte) -128, param0) & S2CRoundDeadlinePacket.hasFlag2048(param0, param2, 0);
        }
        field_b = (String[]) null;
        return MovingSawComponent.hasMutableTexCoords(param2, (byte) -128, param0) & S2CRoundDeadlinePacket.hasFlag2048(param0, param2, 0);
    }

    protected final void finalize() throws Throwable {
        this.toolkit.queueShaderObjectDeletion(this.handle, -6115);
        super.finalize();
    }

    final static void showLoginForm(int param0, String param1, String param2) {
        try {
          if (TextureOperator.field_l != null) {
            TextureOperator.field_l.dismiss((byte) 20);
          }
          if (param0 != 0) {
            field_b = (String[]) null;
          }
          MessageDialogs.field_b = new LoginForm(param1, param2, false, true, true);
          UiComponentNodeBase.field_l.transitionToContent(101, MessageDialogs.field_b);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pr.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 28122) {
          OpenGlShader.requiresTexCoordBufferCopy(-61, 4, -35);
        }
    }

    OpenGlShader(HardwareOpenGlToolkit param0, long param1, int param2) {
        try {
          this.toolkit = param0;
          this.handle = param1;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new String[2];
        field_b[0] = "2x2";
        field_b[1] = "3x3";
    }
}
