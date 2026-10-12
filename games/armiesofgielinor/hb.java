/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hb {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -1) {
          field_b = (String) null;
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, boolean param8, int param9, boolean param10, boolean param11, boolean param12, int param13) {
        ad.field_I = null;
        oh.e((byte) -128);
        param11 = wq.a(param11, param9, param6, param2, param7, param13, (byte) -83);
        qh.a(param11, param4, param1, param3, param5, param9, param0, -1, param12, param10);
        la.a(param3, param4, -1);
        if (!param8) {
          field_b = (String) null;
        } else {
          UiSelectionState.a(param13, param4, 0, param11);
          return;
        }
        UiSelectionState.a(param13, param4, 0, param11);
    }

    final static void a(byte param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          boolean decompiledFrameRemainder0 = true;
          if (null != MoveAttackRequest.field_z) {
            if (param1 >= 0) {
              decompiledFrameRemainder0 = (kl.field_k == ov.field_g);
              if ((decompiledFrameRemainder0) && (0 == vl.outgoingPacket.position &&
                (10000L + SummonEvent.field_G) < vi.b(-60))) {
                vl.outgoingPacket.writeCipheredOpcode(32161, param1);
              }
            } else {
              if (0 == vl.outgoingPacket.position &&
                (10000L + SummonEvent.field_G) < vi.b(-60)) {
                vl.outgoingPacket.writeCipheredOpcode(32161, param1);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 < 8) {
                return;
              }
              if (vl.outgoingPacket.position > 0) {
                try {
                  MoveAttackRequest.field_z.write(vl.outgoingPacket.payload, (byte) 20, 0, vl.outgoingPacket.position);
                  SummonEvent.field_G = vi.b(51);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  dj.a((byte) -127);
                }
                vl.outgoingPacket.position = 0;
              }
              return;
            }
          }
          vl.outgoingPacket.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Create your own free Jagex account";
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$e9dea5688aa5(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          boolean decompiledFrameRemainder0 = true;
          if (null != MoveAttackRequest.field_z) {
            if (param1 >= 0) {
              decompiledFrameRemainder0 = (kl.field_k == ov.field_g);
              if ((decompiledFrameRemainder0) && (0 == vl.outgoingPacket.position &&
                (10000L + SummonEvent.field_G) < vi.b(-60))) {
                vl.outgoingPacket.writeCipheredOpcode(32161, param1);
              }
            } else {
              if (0 == vl.outgoingPacket.position &&
                (10000L + SummonEvent.field_G) < vi.b(-60)) {
                vl.outgoingPacket.writeCipheredOpcode(32161, param1);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 < 8) {
                return;
              }
              if (vl.outgoingPacket.position > 0) {
                try {
                  MoveAttackRequest.field_z.write(vl.outgoingPacket.payload, (byte) 20, 0, vl.outgoingPacket.position);
                  SummonEvent.field_G = vi.b(51);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  dj.a((byte) -127);
                }
                vl.outgoingPacket.position = 0;
              }
              return;
            }
          }
          vl.outgoingPacket.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }
}
