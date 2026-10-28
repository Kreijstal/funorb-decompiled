/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class EmailCredentials extends LoginCredentials {
    private String password;
    private String email;
    static String field_e;

    final static void completeEmailAvailability(boolean available, int guard) {
        if (guard != -19503) {
          return;
        }
        di.field_g.complete((byte) -128, available);
    }

    final static void c(int param0) {
        int var1 = -59 / ((-15 - param0) / 40);
        if (SocketJs5Transport.field_r != null) {
          SocketJs5Transport.field_r.a((byte) 87);
        }
    }

    final void writeTo(PacketBuffer buffer, byte guard) {
        try {
          if (guard >= -15) {
            EmailCredentials.formatGmtTimestamp(29, -33L);
          }
          buffer.writeCircumfixedString((byte) 100, this.email);
          buffer.writeBase38Password(this.password, (byte) 111);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bh.G(" + (buffer != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 11) {
          return;
        }
        field_e = null;
    }

    final LoginCredentialType type(byte guard) {
        if (guard != 32) {
          EmailCredentials.completeEmailAvailability(true, 70);
          return AlphaContainer.field_E;
        }
        return AlphaContainer.field_E;
    }

    final static String formatGmtTimestamp(int guard, long epochMillis) {
        if (guard < -73) {
          StatefulTextPainter.field_s.setTime(new Date(epochMillis));
          int var3 = StatefulTextPainter.field_s.get(7);
          int var4 = StatefulTextPainter.field_s.get(5);
          int var5 = StatefulTextPainter.field_s.get(2);
          int var6 = StatefulTextPainter.field_s.get(1);
          int var7 = StatefulTextPainter.field_s.get(11);
          int var8 = StatefulTextPainter.field_s.get(12);
          int var9 = StatefulTextPainter.field_s.get(13);
          return SingleChildContainer.field_A[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + bg.field_g[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    EmailCredentials(String param0, String param1) {
        try {
          this.password = param1;
          this.email = param0;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Auto-shield deactivated";
    }
}
