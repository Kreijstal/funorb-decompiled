/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkArchiveRequest extends ArchiveRequest {
    int blockOffset;
    static int field_B;
    static int field_A;
    PacketBuffer packet;
    static volatile int field_w;
    static String field_v;
    static int field_x;
    static IntegerSyntaxHelpers field_y;
    byte padding;

    final static String normalizeAccountName(CharSequence param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = wizardrun.field_H;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var9 = new char[var2_int];
          var8 = var9;
          var3 = var8;
          var4 = 103 % ((param1 + 14) / 61);
          for (var5 = 0; var5 < var2_int; var5++) {
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var3[var5] = (char)(var6 - 65 + 97);
            } else if ((97 > var6 ||
              var6 > 122) &&
              (48 > var6 ||
              var6 > 57)) {
              var3[var5] = (char)95;
            } else {
              var3[var5] = (char)var6;
            }
          }
          stackIn_20_0 = new String(var9);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("fi.M(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void storeRandomSeed(int param0) {
        try {
          if (UiWidget.randomSeedFile != null) {
            try {
              UiWidget.randomSeedFile.seek(0L, (byte) -64);
              UiWidget.randomSeedFile.write(18729, AccountCreationForm.field_N.payload, 24, AccountCreationForm.field_N.position);
            } catch (Exception exception) {
            }
          }
          AccountCreationForm.field_N.position = AccountCreationForm.field_N.position + 24;
          if (param0 != 95) {
            field_A = 49;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        field_y = null;
        int var1 = -107 % ((-44 - param0) / 44);
        field_v = null;
    }

    final int getProgress(boolean param0) {
        if (param0) {
          this.getData(123);
        }
        if (null == this.packet) {
          return 0;
        }
        return this.packet.position * 100 / (-this.padding + this.packet.payload.length);
    }

    final byte[] getData(int param0) {
        if (this.pending ||
          this.packet.position < -this.padding + this.packet.payload.length) {
          throw new RuntimeException();
        }
        if (param0 != 95) {
          this.getData(-58);
        }
        return this.packet.payload;
    }

    NetworkArchiveRequest() {
    }

    static {
        field_B = 0;
        field_w = 0;
        field_v = "This password contains your Player Name, and would be easy to guess";
    }
}
