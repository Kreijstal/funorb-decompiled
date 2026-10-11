/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CodecSupport001 {
    static RgbSprite[] rgbSpriteArrayState0018;
    private java.util.zip.Inflater inflaterState0001;
    static String stringState0327;
    static int integerState0436;
    static boolean booleanState0102;
    static RgbSprite rgbSpriteState0031;
    static PlatformService platformServiceState0002;
    static PlatformService platformServiceState0003;
    static String stringState0328;

    final void performAction1076(byte byteArgument1, PacketBuffer packetBufferArgument2, byte[] byteArrayArgument3) {
        try {
          try {
            if (packetBufferArgument2.payload[packetBufferArgument2.position] != 31 ||
              -117 != packetBufferArgument2.payload[1 + packetBufferArgument2.position]) {
              throw new RuntimeException("");
            }
            if (this.inflaterState0001 == null) {
              this.inflaterState0001 = new java.util.zip.Inflater(true);
            }
            if (byteArgument1 < 105) {
              CodecSupport001.performAction1077(-120);
            }
            try {
              this.inflaterState0001.setInput(packetBufferArgument2.payload, 10 + packetBufferArgument2.position, -10 - packetBufferArgument2.position - 8 + packetBufferArgument2.payload.length);
              this.inflaterState0001.inflate(byteArrayArgument3);
            } catch (Exception exception) {
              this.inflaterState0001.reset();
              throw new RuntimeException("");
            }
            this.inflaterState0001.reset();
          } catch (RuntimeException runtimeException) {
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "lf.B(" + byteArgument1 + ',' + (packetBufferArgument2 != null ? "{...}" : "null") + ',' + (byteArrayArgument3 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal3) {
          throw uncheckedExceptionLocal3;
        } catch (Throwable checkedExceptionLocal4) {
          throw new RuntimeException(checkedExceptionLocal4);
        }
    }

    private CodecSupport001(int integerArgument1, int integerArgument2, int integerArgument3) {
    }

    public static void performAction1077(int integerArgument1) {
        rgbSpriteArrayState0018 = null;
        platformServiceState0003 = null;
        if (integerArgument1 != -13495) {
          return;
        }
        platformServiceState0002 = null;
        rgbSpriteState0031 = null;
        stringState0328 = null;
        stringState0327 = null;
    }

    public CodecSupport001() {
        this(-1, 1000000, 1000000);
    }

    static {
        stringState0327 = "Create a free account to start using this feature";
        stringState0328 = "This password contains repeated characters, and would be easy to guess";
    }
}
