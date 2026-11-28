/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends InteractiveWidget {
    static UrlRequest field_G;
    private int field_H;
    private FieldValidator field_F;
    static int field_E;
    static int field_C;
    static int[] field_D;

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        cd var8;
        int var9;
        int var10;
        int var11;
        Sprite var13;
        Sprite var14;
        Sprite var15;
        Sprite var16;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = Torquing.field_u;
        super.a(param0, (byte) -126, param2, param3);
        if (0 != param0) {
          return;
        }
        if (param1 > -7) {
          return;
        }
        var5 = (this.width >> 1) + this.x + param3;
        var6 = this.y + param2 + (this.height >> 1);
        var8 = this.field_F.getValidationStatus((byte) -87);
        if (var8 == IntrusiveNode.field_a) {
          var16 = wj.field_h[0];
          var9 = var16.field_w << 1;
          var10 = var16.field_u << 1;
          if (ByteStorage.field_b == null) {
            ByteStorage.field_b = new Sprite(var9, var10);
            GzipDecompressor.a((byte) 99, ByteStorage.field_b);
          } else {
            if (ByteStorage.field_b.field_s < var9) {
              ByteStorage.field_b = new Sprite(var9, var10);
              GzipDecompressor.a((byte) 99, ByteStorage.field_b);
            } else {
              if (var10 > ByteStorage.field_b.field_t) {
                ByteStorage.field_b = new Sprite(var9, var10);
                GzipDecompressor.a((byte) 99, ByteStorage.field_b);
              } else {
                GzipDecompressor.a((byte) -105, ByteStorage.field_b);
                SoftwareRasterizer.clearRaster();
              }
            }
          }
          var16.drawRotatedAbout(112, 144, var16.field_w << 4, var16.field_u << 4, -this.field_H << 10, 4096);
          r.a(123);
          ByteStorage.field_b.drawAdditive(-var16.field_w + var5, -var16.field_u + var6, 256);
          return;
        }
        if (IsaacCipher.field_h != var8) {
          if (var8 == so.field_u) {
            var14 = wj.field_h[2];
            var14.drawAdditive(-(var14.field_s >> 1) + var5, var6 - (var14.field_t >> 1), 256);
            return;
          }
          if (so.field_s != var8) {
            return;
          }
          var13 = wj.field_h[1];
          var13.drawAdditive(var5 - (var13.field_s >> 1), -(var13.field_t >> 1) + var6, 256);
          return;
        }
        var15 = wj.field_h[0];
        var9Lifetime1 = var15.field_w << 1;
        var10Lifetime1 = var15.field_u << 1;
        if (ByteStorage.field_b == null) {
          ByteStorage.field_b = new Sprite(var9Lifetime1, var10Lifetime1);
          GzipDecompressor.a((byte) 99, ByteStorage.field_b);
        } else {
          if (ByteStorage.field_b.field_s < var9Lifetime1) {
            ByteStorage.field_b = new Sprite(var9Lifetime1, var10Lifetime1);
            GzipDecompressor.a((byte) 99, ByteStorage.field_b);
          } else {
            if (var10Lifetime1 > ByteStorage.field_b.field_t) {
              ByteStorage.field_b = new Sprite(var9Lifetime1, var10Lifetime1);
              GzipDecompressor.a((byte) 99, ByteStorage.field_b);
            } else {
              GzipDecompressor.a((byte) -105, ByteStorage.field_b);
              SoftwareRasterizer.clearRaster();
            }
          }
        }
        var15.drawRotatedAbout(112, 144, var15.field_w << 4, var15.field_u << 4, -this.field_H << 10, 4096);
        r.a(123);
        ByteStorage.field_b.drawAdditive(-var15.field_w + var5, -var15.field_u + var6, 256);
    }

    final static void sleepMillis(int param0, long param1) {
        if (param0 != 1976) {
          ub.sleepMillis(-53, -74L);
          if (0L >= param1) {
            return;
          }
          if (param1 % 10L != 0L) {
            op.sleepIgnoringInterrupts(param1, param0 - 1897);
            return;
          }
          op.sleepIgnoringInterrupts(-1L + param1, 112);
          op.sleepIgnoringInterrupts(1L, 93);
          return;
        }
        if (0L >= param1) {
          return;
        }
        if (param1 % 10L != 0L) {
          op.sleepIgnoringInterrupts(param1, param0 - 1897);
          return;
        }
        op.sleepIgnoringInterrupts(-1L + param1, 112);
        op.sleepIgnoringInterrupts(1L, 93);
    }

    public static void clearStaticReferences(byte param0) {
        field_G = null;
        field_D = null;
        if (param0 != -19) {
          ub.clearStaticReferences((byte) -112);
        }
    }

    final boolean a(UiWidget param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ub.JA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, UiWidget param1, int param2, int param3) {
        try {
          this.field_H = this.field_H + 1;
          int var5_int = -105 % ((param0 + 28) / 43);
          super.a(-84, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "ub.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String getTooltipText(int param0) {
        if (this.field_s) {
          return this.field_F.getValidationMessage(param0 ^ 124);
        }
        if (param0 == 0) {
          return null;
        }
        ub.clearStaticReferences((byte) 125);
        return null;
    }

    ub(FieldValidator param0) {
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_D = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
    }
}
