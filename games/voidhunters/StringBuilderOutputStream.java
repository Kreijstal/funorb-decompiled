/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class StringBuilderOutputStream extends OutputStream {
    static Widget field_b;
    private StringBuilder buffer;

    public final void write(int param0) {
        StringBuilder discarded$0 = this.buffer.append((char)param0);
    }

    final static void layoutQuickChatMenuArea(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        GetGrapplingHookFireForce.field_o.setBounds(param5, -6, param0, param6, param1);
        if (null != MidiNote.field_m) {
          MidiNote.field_m.layoutMenu(12, param1, -GetLaserAimspeed.field_p + param2, param2, param1, param4);
          if (param3) {
            StringBuilderOutputStream.layoutQuickChatMenuArea(-122, 15, -4, false, -81, -103, -22);
            return;
          }
          return;
        }
        if (!param3) {
          return;
        }
        StringBuilderOutputStream.layoutQuickChatMenuArea(-122, 15, -4, false, -81, -103, -22);
    }

    public static void clearSharedReferences(boolean param0) {
        field_b = null;
        if (param0) {
          StringBuilderOutputStream.clearSharedReferences(true);
        }
    }

    StringBuilderOutputStream(StringBuilder param0) {
        try {
          this.buffer = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
