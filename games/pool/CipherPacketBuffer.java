/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CipherPacketBuffer extends PacketBuffer {
    static java.util.zip.CRC32 field_B;
    static String targetBlackBall;
    private IsaacCipher opcodeCipher;
    private int bitPosition;
    static String multiconstOpen;
    static UiComponent field_z;

    final static ResourceArchive a(boolean param0, int param1, int param2, int param3, boolean param4) {
        if (param1 >= -2) {
          CipherPacketBuffer.a(true, 72, 4, -38, true);
        }
        return ParticleTrail.a(param2, param4, (byte) -56, param3, false, param0);
    }

    final void endBitReading(int param0) {
        this.position = (this.bitPosition + 7) / param0;
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final void readCipheredBytes(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        byte[] var6 = null;
        try {
          if (param1 >= -102) {
            var6 = (byte[]) null;
            this.readCipheredBytes(33, -53, (byte[]) null, -26);
          }
          for (var5_int = 0; var5_int < param3; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param2[var5_int + param0] = (byte)(this.payload[fieldTemp$0] - this.opcodeCipher.a((byte) 7));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("oq.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void beginBitReading(int param0) {
        this.bitPosition = this.position * param0;
    }

    final void writeCipheredOpcode(boolean param0, int param1) {
        if (param0) {
          byte[] var4 = (byte[]) null;
          this.readCipheredBytes(-89, -96, (byte[]) null, 98);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(this.opcodeCipher.a((byte) 7) + param1);
    }

    final static void n(int param0) {
        int var1 = 0;
        if (TranslatedUiText.field_h >= 224) {
          QuickChatPhraseDefinition.setMusicVolume(256, 3815994);
        } else {
          var1 = TranslatedUiText.field_h % 32;
          QuickChatPhraseDefinition.setMusicVolume(32 + (TranslatedUiText.field_h - var1), param0 ^ -3807027);
        }
        if (param0 != -11529) {
          CipherPacketBuffer.a(true, -4, 116, -60, false);
        }
    }

    final int readCipheredOpcode(int param0) {
        int var2 = -125 % ((14 - param0) / 47);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0] - this.opcodeCipher.a((byte) 7);
    }

    final int readBits(int param0, int param1) {
        int incrementValue$0 = 0;
        int var3 = this.bitPosition >> 3;
        int var4 = 8 - (7 & this.bitPosition);
        this.bitPosition = this.bitPosition + param0;
        int var5 = 0;
        while (param0 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((BirthDateInputWidget.field_ab[var4] & this.payload[incrementValue$0]) << -var4 + param0);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (param0 == var4) {
          var5 = var5 + (BirthDateInputWidget.field_ab[var4] & this.payload[var3]);
        } else {
          var5 = var5 + (this.payload[var3] >> -param0 + var4 & BirthDateInputWidget.field_ab[param0]);
        }
        if (param1 <= 15) {
          targetBlackBall = (String) null;
        }
        return var5;
    }

    final void initializeCipher(int param0, int[] param1) {
        if (param0 != 32) {
          return;
        }
        try {
          this.opcodeCipher = new IsaacCipher(param1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oq.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    public static void releaseStatics(boolean param0) {
        targetBlackBall = null;
        if (!param0) {
          targetBlackBall = (String) null;
        }
        field_B = null;
        field_z = null;
        multiconstOpen = null;
    }

    static {
        field_B = new java.util.zip.CRC32();
        targetBlackBall = "Black ball";
        multiconstOpen = "Open";
    }
}
