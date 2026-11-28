/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusIcon extends InteractiveWidget {
    private int field_F;
    private FieldValidator field_E;
    static String field_G;

    public static void clearDeclaredStaticReferences(int param0) {
        field_G = null;
        if (param0 != 6977) {
          field_G = (String) null;
        }
    }

    final boolean takeFocus(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 44) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ld.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final String getTooltipText(int param0) {
        if (param0 <= 121) {
          ValidationStatusIcon.i(55);
          if (this.field_m) {
            return this.field_E.getValidationMessage((byte) 102);
          }
          return null;
        }
        if (this.field_m) {
          return this.field_E.getValidationMessage((byte) 102);
        }
        return null;
    }

    final static byte[] copyBytes(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        String var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          var3 = new byte[var2_int];
          if (param0 < 70) {
            var4 = (String) null;
            ValidationStatusIcon.wrapClientException((Throwable) null, (String) null);
          }
          ArrayBlockSupport.copyByteRange(param1, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ld.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void i(int param0) {
        if (param0 != -29115) {
          return;
        }
        ni.a(-125, 4);
    }

    final void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        try {
          this.field_F = this.field_F + 1;
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "ld.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    ValidationStatusIcon(FieldValidator param0) {
        try {
          this.field_E = param0;
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawWidget(byte param0, int param1, int param2, int param3) {
        RgbSprite var15 = null;
        RgbSprite var16 = null;
        RgbSprite var14 = null;
        RgbSprite var13 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = Lexicominos.field_L ? 1 : 0;
        int var9Lifetime1;
        int var10Lifetime1;
        super.drawWidget(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        int var5 = (this.field_j >> 1) + this.field_t + param2;
        int var6 = this.field_o + (param1 + (this.field_v >> 1));
        sc var8 = this.field_E.getValidationStatus((byte) 116);
        if (jj.field_e == var8) {
          var15 = BufferedRandomAccessFile.field_b[0];
          var9 = var15.field_r << 1;
          var10 = var15.field_x << 1;
          if (AwtRasterBuffer.field_f == null) {
            AwtRasterBuffer.field_f = new RgbSprite(var9, var10);
            de.a(AwtRasterBuffer.field_f, param0 ^ -117);
            var15.drawRotatedAbout(112, 144, var15.field_r << 4, var15.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            AwtRasterBuffer.field_f.drawAdditive(-var15.field_r + var5, -var15.field_x + var6, 256);
            return;
          }
          if (var9 > AwtRasterBuffer.field_f.field_p) {
            AwtRasterBuffer.field_f = new RgbSprite(var9, var10);
            de.a(AwtRasterBuffer.field_f, param0 ^ -117);
            var15.drawRotatedAbout(112, 144, var15.field_r << 4, var15.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            AwtRasterBuffer.field_f.drawAdditive(-var15.field_r + var5, -var15.field_x + var6, 256);
            return;
          }
          if (AwtRasterBuffer.field_f.field_u >= var10) {
            de.a(AwtRasterBuffer.field_f, 6);
            SoftwareRasterizer.clearRaster();
            var15.drawRotatedAbout(112, 144, var15.field_r << 4, var15.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            AwtRasterBuffer.field_f.drawAdditive(-var15.field_r + var5, -var15.field_x + var6, 256);
            return;
          }
          AwtRasterBuffer.field_f = new RgbSprite(var9, var10);
          de.a(AwtRasterBuffer.field_f, param0 ^ -117);
          var15.drawRotatedAbout(112, 144, var15.field_r << 4, var15.field_x << 4, -this.field_F << 10, 4096);
          pd.a(-22949);
          AwtRasterBuffer.field_f.drawAdditive(-var15.field_r + var5, -var15.field_x + var6, 256);
          return;
        }
        if (BufferedRandomAccessFile.field_q == var8) {
          var16 = BufferedRandomAccessFile.field_b[0];
          var9Lifetime1 = var16.field_r << 1;
          var10Lifetime1 = var16.field_x << 1;
          if (AwtRasterBuffer.field_f == null) {
            AwtRasterBuffer.field_f = new RgbSprite(var9Lifetime1, var10Lifetime1);
            de.a(AwtRasterBuffer.field_f, param0 ^ -117);
            var16.drawRotatedAbout(112, 144, var16.field_r << 4, var16.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            AwtRasterBuffer.field_f.drawAdditive(-var16.field_r + var5, -var16.field_x + var6, 256);
            return;
          }
          if (var9Lifetime1 > AwtRasterBuffer.field_f.field_p) {
            AwtRasterBuffer.field_f = new RgbSprite(var9Lifetime1, var10Lifetime1);
            de.a(AwtRasterBuffer.field_f, param0 ^ -117);
            var16.drawRotatedAbout(112, 144, var16.field_r << 4, var16.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            AwtRasterBuffer.field_f.drawAdditive(-var16.field_r + var5, -var16.field_x + var6, 256);
            return;
          }
          if (AwtRasterBuffer.field_f.field_u >= var10Lifetime1) {
            de.a(AwtRasterBuffer.field_f, 6);
            SoftwareRasterizer.clearRaster();
            var16.drawRotatedAbout(112, 144, var16.field_r << 4, var16.field_x << 4, -this.field_F << 10, 4096);
            pd.a(-22949);
            AwtRasterBuffer.field_f.drawAdditive(-var16.field_r + var5, -var16.field_x + var6, 256);
            return;
          }
          AwtRasterBuffer.field_f = new RgbSprite(var9Lifetime1, var10Lifetime1);
          de.a(AwtRasterBuffer.field_f, param0 ^ -117);
          var16.drawRotatedAbout(112, 144, var16.field_r << 4, var16.field_x << 4, -this.field_F << 10, 4096);
          pd.a(-22949);
          AwtRasterBuffer.field_f.drawAdditive(-var16.field_r + var5, -var16.field_x + var6, 256);
          return;
        }
        if (ni.field_b == var8) {
          var14 = BufferedRandomAccessFile.field_b[2];
          var14.drawAdditive(var5 - (var14.field_p >> 1), var6 - (var14.field_u >> 1), 256);
          return;
        }
        if (rh.field_p == var8) {
          var13 = BufferedRandomAccessFile.field_b[1];
          var13.drawAdditive(-(var13.field_p >> 1) + var5, var6 - (var13.field_u >> 1), 256);
          return;
        }
    }

    final static de wrapClientException(Throwable param0, String param1) {
        de var2 = null;
        if (!(param0 instanceof de)) {
          var2 = new de(param0, param1);
        } else {
          var2 = (de) ((Object) param0);
          var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    static {
        field_G = "Player";
    }
}
