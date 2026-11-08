/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ClientPacketFlushSupport {
    static String field_h;
    static Sprite[] field_f;
    static Sprite field_e;
    static StringBuilder field_a;
    static Sprite field_b;
    static String field_d;
    static boolean field_g;
    static int field_c;

    final static void a(int param0, int param1, int param2, int param3) {
        PasswordValidator.a(0, param1, param2, false, (byte) -55);
        if (param0 != 31) {
          ClientPacketFlushSupport.a(28, -64, 64, 35);
        }
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_h = null;
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 == 114) {
          field_e = null;
          return;
        }
        field_b = (Sprite) null;
        field_e = null;
    }

    final static void flushPackets(int param0, boolean param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (SpriteButtonPainter.field_y != null && (param0 < 0 ||
            ByteArrayPool.field_c == RegistrationRequestDialog.field_rb)) {
            if (0 == FootballerAiOverlaySupport.field_d.field_n &&
              (BlobSubmission.field_i + 10000L) < MonotonicClock.monotonicMillis(86)) {
              FootballerAiOverlaySupport.field_d.writeIsaacByte(param0, (byte) 101);
            }
            if (param1) {
              return;
            }
            if (FootballerAiOverlaySupport.field_d.field_n > 0) {
              try {
                SpriteButtonPainter.field_y.write(FootballerAiOverlaySupport.field_d.field_n, (byte) -127, 0, FootballerAiOverlaySupport.field_d.field_f);
                BlobSubmission.field_i = MonotonicClock.monotonicMillis(-117);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                FormationView.b((byte) -116);
              }
              FootballerAiOverlaySupport.field_d.field_n = 0;
            }
            return;
          }
          FootballerAiOverlaySupport.field_d.field_n = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean isBitSet(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            ClientPacketFlushSupport.flushPackets(-46, true);
          }
          stackIn_5_0 = ((param2[param0 >> 5] & 1 << (31 & param0)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("c.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_h = "Auction Settings";
        field_a = new StringBuilder(100);
        field_b = new Sprite(190, 190);
        field_d = "Game";
        field_c = 360;
    }
}
