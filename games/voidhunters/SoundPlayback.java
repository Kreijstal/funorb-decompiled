/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SoundPlayback extends IntrusiveNode {
    static int field_f;
    PcmSampleStream stream;
    int baseGain;
    IntrusiveNode lifetimeNode;

    final static byte[] readFile(File param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 48) {
            stackIn_4_0 = SoundPlayback.readFilePrefix((byte) -123, (int)param0.length(), param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ana.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void checkArithmeticGuard(byte param0) {
        int var1 = -34 / ((param0 - 16) / 54);
    }

    private final static byte[] readFilePrefix(byte param0, int param1, File param2) {
        try {
          byte[] var3 = null;
          IOException var3_ref = null;
          RuntimeException var3_ref2 = null;
          byte[] var4 = null;
          byte[] stackIn_3_0 = null;
          Object stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 > -89) {
                SoundPlayback.checkArithmeticGuard((byte) 117);
              }
              var4 = new byte[param1];
              var3 = var4;
              TextureRectangleShape.readFileInto(param2, param1, var4, (byte) 119);
              stackIn_3_0 = var4;
              return stackIn_3_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (IOException) (Object) decompiledCaughtException;
              stackIn_5_0 = null;
              return (byte[]) (stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ana.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    SoundPlayback(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.stream = param0;
          this.baseGain = param0.getTargetGain();
          this.lifetimeNode = param1;
          this.stream.setGain(128 + this.baseGain * kt.soundEffectVolume >> 8);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ana.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setGainAndPan(int param0, int param1, int param2) {
        param2 = param2 << 6;
        param1 = param1 << 6;
        this.baseGain = param1;
        this.stream.setGainAndPan(param0 + param1 * kt.soundEffectVolume >> 8, param2);
    }

    static {
        field_f = 192;
    }
}
