/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedFieldValidator implements FieldValidator {
    static FullscreenNoticeType field_c;
    private long field_a;
    static String field_f;
    static RgbSprite field_b;
    static String field_d;
    static int field_e;

    public final sc getValidationStatus(byte param0) {
        if (this.hasMissingInput(-104)) {
          return rc.field_a;
        }
        if (!(rf.correctedCurrentTimeMillis(0) >= this.field_a + 350L)) {
          return jj.field_e;
        }
        if (param0 > 114) {
          return this.evaluateValidationStatus(true);
        }
        this.evaluateValidationMessage(34);
        return this.evaluateValidationStatus(true);
    }

    public final void recordInputChange(boolean param0) {
        this.field_a = rf.correctedCurrentTimeMillis(0);
        if (!param0) {
          byte[] var3 = (byte[]) null;
          DebouncedFieldValidator.storeBytes(123, (byte[]) null, true);
        }
    }

    final static Object storeBytes(int param0, byte[] param1, boolean param2) {
        DirectByteStorage var3 = null;
        RuntimeException var3_ref = null;
        DirectByteStorage stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0 < param1.length) {
            var3 = new DirectByteStorage();
            ((ByteStorage) ((Object) var3)).setBytes(param1, true);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (!param2) {
            stackIn_11_0 = (byte[]) (param1);
            return stackIn_11_0;
          }
          stackIn_9_0 = ld.copyBytes(param0 - 30, param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ri.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_d = null;
        if (param0 == 117) {
          field_b = null;
          field_f = null;
          field_c = null;
          return;
        }
        DebouncedFieldValidator.clearDeclaredStaticReferences((byte) 46);
        field_b = null;
        field_f = null;
        field_c = null;
    }

    public final String getValidationMessage(byte param0) {
        int var2 = 6 / ((34 - param0) / 42);
        if (this.hasMissingInput(110)) {
          return null;
        }
        if (rf.correctedCurrentTimeMillis(0) >= this.field_a + 350L) {
          return this.evaluateValidationMessage(66);
        }
        return null;
    }

    final static void a(boolean param0, boolean param1, kb param2, byte param3, int param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          DropTargetWidgetContainer.field_F[0] = q.field_a.nextInt();
          DropTargetWidgetContainer.field_F[1] = q.field_a.nextInt();
          DropTargetWidgetContainer.field_F[2] = (int)(LoginPanel.field_M >> 32);
          of.field_a.position = 0;
          DropTargetWidgetContainer.field_F[3] = (int)LoginPanel.field_M;
          of.field_a.writeInt(DropTargetWidgetContainer.field_F[0], param3 ^ 32335);
          of.field_a.writeInt(DropTargetWidgetContainer.field_F[1], -32287);
          of.field_a.writeInt(DropTargetWidgetContainer.field_F[2], -32287);
          of.field_a.writeInt(DropTargetWidgetContainer.field_F[3], -32287);
          SpriteGeometry.a(93, of.field_a);
          of.field_a.writeShort(89, param4);
          param2.a(of.field_a, 7895);
          SpriteGeometry.field_q.position = 0;
          if (param1) {
            SpriteGeometry.field_q.writeByte(18, -1);
          } else {
            SpriteGeometry.field_q.writeByte(16, -1);
          }
          SpriteGeometry.field_q.position = SpriteGeometry.field_q.position + 2;
          var5_int = SpriteGeometry.field_q.position;
          SpriteGeometry.field_q.writeInt(bk.field_a, -32287);
          SpriteGeometry.field_q.writeLong(fa.field_a, (byte) 37);
          var6 = 0;
          if (MidiPcmStream.field_F) {
            var6 = var6 | 1;
          }
          if (GameAppletShell.field_c) {
            var6 = var6 | 4;
          }
          if (param0) {
            var6 = var6 | 8;
          }
          if (null != og.field_b) {
            var6 = var6 | 16;
          }
          SpriteGeometry.field_q.writeByte(var6, -1);
          var7 = pg.a(RichTextLayout.c(-14047), (byte) -28);
          if (var7 == null) {
            var7 = "";
          }
          SpriteGeometry.field_q.writeTerminatedString(var7, (byte) 0);
          if (null != og.field_b) {
            SpriteGeometry.field_q.writePrefixedString((byte) -38, og.field_b);
          }
          wc.a(wb.field_m, SpriteGeometry.field_q, ContentTransitionDialog.field_T, (byte) 111, of.field_a);
          SpriteGeometry.field_q.backpatchShortLength(-var5_int + SpriteGeometry.field_q.position, (byte) 26);
          if (param3 != -82) {
            field_f = (String) null;
          }
          kc.a(-1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("ri.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    abstract sc evaluateValidationStatus(boolean param0);

    abstract String evaluateValidationMessage(int param0);

    static {
        field_f = "This game has been updated! Please reload this page.";
        field_c = new FullscreenNoticeType();
        field_d = "Create a free Account";
    }
}
