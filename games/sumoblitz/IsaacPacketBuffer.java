/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IsaacPacketBuffer extends PacketBuffer {
    static int field_u;
    static String changeDisplayNameText;
    private int bitPosition;
    static String[] field_r;
    static IntrusiveDeque field_v;
    private IsaacCipher cipher;
    static int field_y;
    static String levelText;
    static String enterAPasswordForText;

    final void writeCipherByte(int value, int guard) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value + this.cipher.nextInt(GzipDecompressor.bitwiseXor(guard, 264)));
        if (guard != 8) {
          this.beginBitAccess((byte) 39);
        }
    }

    IsaacPacketBuffer(byte[] bytes) {
        super(bytes);
    }

    final int readBits(int count, byte guard) {
        int var5 = 0;
        int incrementValue$0 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var3 = this.bitPosition >> 3;
        int var4 = 8 - (7 & this.bitPosition);
        if (guard < -85) {
          var5 = 0;
          this.bitPosition = this.bitPosition + count;
          while (var4 < count) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.payload[incrementValue$0] & CachedArchiveProvider.field_z[var4]) << count - var4);
            count = count - var4;
            var4 = 8;
          }
          if (var4 == count) {
            var5 = var5 + (CachedArchiveProvider.field_z[var4] & this.payload[var3]);
          } else {
            var5 = var5 + (this.payload[var3] >> var4 - count & CachedArchiveProvider.field_z[count]);
          }
          return var5;
        }
        return 116;
    }

    final void readCipherBytes(byte[] destination, int start, int destinationOffset, int end) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var5_int = start; end > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            destination[var5_int + destinationOffset] = (byte)(this.payload[fieldTemp$0] - this.cipher.nextInt(256));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pl.I(");
          if (destination == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(start).append(',').append(destinationOffset).append(',').append(end).append(')').toString());
        }
    }

    final void beginBitAccess(byte guard) {
        int var2 = -18 / ((-28 - guard) / 59);
        this.bitPosition = 8 * this.position;
    }

    final void endBitAccess(byte guard) {
        if (guard != -63) {
          return;
        }
        this.position = (this.bitPosition + 7) / 8;
    }

    final static void detachMouseInput(java.awt.Component component, int guard) {
        try {
          if (guard != 7) {
            java.awt.Component var3 = (java.awt.Component) null;
            IsaacPacketBuffer.detachMouseInput((java.awt.Component) null, 93);
          }
          component.removeMouseListener(ConfirmedEmailValidator.field_h);
          component.removeMouseMotionListener(ConfirmedEmailValidator.field_h);
          component.removeFocusListener(ConfirmedEmailValidator.field_h);
          LegacyOpenGlNormalMapGenerator.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pl.B(" + (component != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void initializeCipher(byte guard, int[] seed) {
        try {
          this.cipher = new IsaacCipher(seed);
          int var3_int = 41 % ((guard - 21) / 39);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pl.C(" + guard + ',' + (seed != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        changeDisplayNameText = null;
        if (param0 == 24599) {
          enterAPasswordForText = null;
          levelText = null;
          field_v = null;
          field_r = null;
          return;
        }
        field_y = 91;
        enterAPasswordForText = null;
        levelText = null;
        field_v = null;
        field_r = null;
    }

    IsaacPacketBuffer(int capacity) {
        super(capacity);
    }

    final int readCipherByte(int guard) {
        int fieldTemp$0 = 0;
        if (guard == 255) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.cipher.nextInt(256) & 255;
        }
        this.bitPosition = 51;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.cipher.nextInt(256) & 255;
    }

    static {
        field_r = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        changeDisplayNameText = "Change display name";
        field_v = new IntrusiveDeque();
        levelText = "level: ";
        enterAPasswordForText = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
