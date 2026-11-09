/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends PacketBuffer {
    static int field_u;
    static String changeDisplayNameText;
    private int field_w;
    static String[] field_r;
    static IntrusiveDeque field_v;
    private ok field_t;
    static int field_y;
    static String levelText;
    static String enterAPasswordForText;

    final void g(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 + this.field_t.a(GzipDecompressor.bitwiseXor(param1, 264)));
        if (param1 != 8) {
          this.i((byte) 39);
        }
    }

    pl(byte[] param0) {
        super(param0);
    }

    final int b(int param0, byte param1) {
        int var5 = 0;
        int incrementValue$0 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var3 = this.field_w >> 3;
        int var4 = 8 - (7 & this.field_w);
        if (param1 < -85) {
          var5 = 0;
          this.field_w = this.field_w + param0;
          while (var4 < param0) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.payload[incrementValue$0] & CachedArchiveProvider.field_z[var4]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
          }
          if (var4 == param0) {
            var5 = var5 + (CachedArchiveProvider.field_z[var4] & this.payload[var3]);
          } else {
            var5 = var5 + (this.payload[var3] >> var4 - param0 & CachedArchiveProvider.field_z[param0]);
          }
          return var5;
        }
        return 116;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
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
          for (var5_int = param1; param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[var5_int + param2] = (byte)(this.payload[fieldTemp$0] - this.field_t.a(256));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pl.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void i(byte param0) {
        int var2 = -18 / ((-28 - param0) / 59);
        this.field_w = 8 * this.position;
    }

    final void h(byte param0) {
        if (param0 != -63) {
          return;
        }
        this.position = (this.field_w + 7) / 8;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          if (param1 != 7) {
            java.awt.Component var3 = (java.awt.Component) null;
            pl.a((java.awt.Component) null, 93);
          }
          param0.removeMouseListener(ConfirmedEmailValidator.field_h);
          param0.removeMouseMotionListener(ConfirmedEmailValidator.field_h);
          param0.removeFocusListener(ConfirmedEmailValidator.field_h);
          LegacyOpenGlNormalMapGenerator.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int[] param1) {
        try {
          this.field_t = new ok(param1);
          int var3_int = 41 % ((param0 - 21) / 39);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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

    pl(int param0) {
        super(param0);
    }

    final int i(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == 255) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.field_t.a(256) & 255;
        }
        this.field_w = 51;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.field_t.a(256) & 255;
    }

    static {
        field_r = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        changeDisplayNameText = "Change display name";
        field_v = new IntrusiveDeque();
        levelText = "level: ";
        enterAPasswordForText = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
