/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerDrone extends Drone {
    static String[] reconnectStatusFrames;
    static int field_T;

    PlayerDrone(int xQ8, int yQ8) {
        super(0, 0, xQ8, yQ8);
    }

    final static dj a(int param0, PcmSample param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -12 % ((-31 - param0) / 63);
          stackIn_1_0 = qq.a(18416, PcmSampleStream.a(param1, 100, 96));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("fe.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -63) {
          PcmSample var2 = (PcmSample) null;
          PlayerDrone.a(44, (PcmSample) null);
          reconnectStatusFrames = null;
          return;
        }
        reconnectStatusFrames = null;
    }

    static {
        reconnectStatusFrames = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_T = 10;
    }
}
