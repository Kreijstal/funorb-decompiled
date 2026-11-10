/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SessionSocketHelpers {
    static Random field_b;
    static long field_a;
    static int field_d;
    static String field_c;

    final static void notifyBrowserResize(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (param1 != 27102) {
            SessionSocketHelpers.notifyBrowserResize(-112, 62);
          }
          try {
            JavaScriptBridge.callWindowFunctionWithArguments(new Object[]{new Integer(param0)}, "resizing", 29674, AppletHostHelpers.getHostApplet(0));
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void sendByteRequest(int param0, int param1) {
        BitPacketBuffer var2 = LinkTextPainter.field_e;
        var2.writeCipheredByte(11, param1);
        var2.writeByte(1, 101);
        var2.writeByte(param0, 45);
    }

    public static void releaseStatics(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
          field_b = (Random) null;
        }
    }

    final static void closeSessionSocket(int param0) {
        if (param0 == 1) {
          if (LoginMethod.field_c != null) {
            LoginMethod.field_c.close(-126);
            LoginMethod.field_c = null;
          }
          return;
        }
        SessionSocketHelpers.releaseStatics(true);
        if (LoginMethod.field_c != null) {
          LoginMethod.field_c.close(-126);
          LoginMethod.field_c = null;
        }
    }

    static {
        field_b = new Random();
        field_c = "Highscores";
    }
}
