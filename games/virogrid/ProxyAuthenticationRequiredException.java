/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ProxyAuthenticationRequiredException extends IOException {
    static String field_g;
    static GzipDecompressor field_b;
    static IntrusiveDeque field_f;
    static AudioSetupHelpers field_d;
    static String field_c;
    static String[] field_e;
    static int field_i;
    static String field_a;
    static int field_h;

    public static void releaseStatics(byte param0) {
        field_f = null;
        field_b = null;
        field_a = null;
        if (param0 > 122) {
          field_g = null;
          field_d = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    ProxyAuthenticationRequiredException(String param0) {
        super(param0);
    }

    final static void sendStatSubmission(int param0, StatSubmission param1, int param2) {
        CipherPacketBuffer var5 = null;
        int var4 = 0;
        try {
          var5 = IterableNodeHashTable.field_g;
          var5.writeCipheredOpcode(param2, 8);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(param0, 98);
          var5.writeByte(param1.field_i, 88);
          var5.writeByte(param1.field_k, param0 - 124);
          var5.writeInt(param1.field_j, (byte) -42);
          var5.writeInt(param1.field_h, (byte) -42);
          var5.writeInt(param1.field_g, (byte) -42);
          var5.writeInt(param1.field_n, (byte) -42);
          var5.writeCrc32((byte) -111, var4);
          var5.backpatchByteLength(-var4 + var5.position, -1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "te.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void updateReportAbuseDialog(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != SpriteWidget.field_yb) {
          var3 = SpriteWidget.field_yb.updateAndPollReason(2105376, param0);
          if (var3 == -2) {
            if (param1 >= -118) {
              field_f = (IntrusiveDeque) null;
              return;
            }
            return;
          }
          if (var3 != -1) {
            var4 = SpriteWidget.field_yb.isMuteRequested(140) ? 1 : 0;
            DualLinkHashTable.sendAbuseReport(param2, var3, SpriteWidget.field_yb.field_Mb, 125, SpriteWidget.field_yb.getTargetName((byte) -72), var4 != 0);
          }
          SpriteWidget.field_yb = null;
          DisplayModeInfo.closeContextMenu(true);
        }
        if (param1 < -118) {
          return;
        }
        field_f = (IntrusiveDeque) null;
    }

    static {
        field_g = "Waiting for music";
        field_b = new GzipDecompressor();
        field_d = new AudioSetupHelpers();
        field_c = "Start Game";
        field_a = "Service unavailable";
        field_i = 0;
    }
}
