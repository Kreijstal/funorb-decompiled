/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static String field_h;
    static hk field_k;
    static PcmPlayer field_f;
    static java.awt.Font field_g;
    static volatile int livePointerX;
    static String field_e;
    private java.nio.ByteBuffer buffer;
    static String field_l;

    final static boolean a(boolean param0, BitPacketBuffer param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            DirectByteStorage.c(-28);
          }
          stackIn_5_0 = (1 == param1.readBits(1, (byte) 127));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("eo.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param3 == param0 &&
          InstructionsScreen.field_r != param2) {
          LevelSequence.field_d = true;
          InstructionsScreen.field_r = param2;
          eh.a(true, param1);
        }
        if (param3 == 1 &&
          InstructionsScreen.field_v != param2) {
          InstructionsScreen.field_v = param2;
          LevelSequence.field_d = true;
          eh.a(true, param1);
        }
        if (2 != param3) {
          return;
        }
        if (param2 == to.field_a) {
          return;
        }
        LevelSequence.field_d = true;
        to.field_a = param2;
        eh.a(true, param1);
    }

    final void store(int obfuscationGuard, byte[] data) {
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(data.length);
          if (obfuscationGuard < 63) {
            field_g = (java.awt.Font) null;
          }
          this.buffer.position(0);
          this.buffer.put(data);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "eo.B(" + obfuscationGuard + ',' + (data != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] toByteArray(int obfuscationGuard) {
        byte[] var3 = new byte[this.buffer.capacity()];
        byte[] var2 = var3;
        this.buffer.position(0);
        if (obfuscationGuard == 16616) {
          this.buffer.get(var3);
          return var3;
        }
        return (byte[]) null;
    }

    final static boolean isBitSet(int[] words, int bitIndex, byte obfuscationGuard) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == -75) {
            stackIn_6_0 = ((words[bitIndex >> 5] & 1 << (bitIndex & 31)) != 0);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("eo.C(");
          if (words == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(bitIndex).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_l = null;
        if (param0 != 7301) {
          return;
        }
        field_g = null;
        field_f = null;
        field_k = null;
        field_h = null;
        field_e = null;
    }

    DirectByteStorage() {
    }

    static {
        field_h = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_l = "Show lobby chat from my friends";
        livePointerX = -1;
    }
}
