/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    String field_d;
    static int field_e;
    static String field_a;
    static String field_f;
    int field_b;
    static String field_g;
    static int field_c;

    final java.net.Socket connectDirect(boolean param0) throws IOException {
        if (!param0) {
          return new java.net.Socket(this.field_d, this.field_b);
        }
        field_a = (String) null;
        return new java.net.Socket(this.field_d, this.field_b);
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        if (param0 != -38) {
          SocketConnector.releaseStatics((byte) 51);
          field_a = null;
          field_g = null;
          return;
        }
        field_a = null;
        field_g = null;
    }

    final static void drawQuickChatOverlay(int param0) {
        if (ChatPanelUpdateHelpers.field_e) {
          Rasterizer.darkenRectangle(Rasterizer.field_i, Rasterizer.field_g, Rasterizer.field_k - Rasterizer.field_i, -Rasterizer.field_g + Rasterizer.field_h);
          LogoRenderHelpers.field_h.drawRoot(false, 24960);
        }
        if (param0 == -26808) {
          return;
        }
        field_g = (String) null;
    }

    abstract java.net.Socket connect(int param0) throws IOException;

    static {
        field_f = "Type your email address again to make sure it's correct";
        field_a = "You need to play <%0> more rated games to unlock this option.";
        field_g = "Reload game";
    }
}
