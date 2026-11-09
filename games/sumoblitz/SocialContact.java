/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialContact extends UiStyle {
    static String byClickingCreateYouText;
    static EmailValidationError EMAIL_COMPONENT_TOO_LONG;
    String worldName;
    String displayName;
    int insertionOrder;
    static String theAccountNameYouText;

    final static void openAppletPage(String path, java.applet.Applet applet, byte guard) {
        try {
          java.net.URL var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              if (guard != -103) {
                return;
              }
              var3 = new java.net.URL(applet.getCodeBase(), path);
              var3 = MusicPatch.updateAppletStateUrl((byte) 125, applet, var3);
              LegacyOpenGlFlowingWaterEffect.openExternalUrl(guard ^ 23067, applet, true, var3.toString());
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("cn.F(");
            if (path == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (applet == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          byClickingCreateYouText = (String) null;
          EMAIL_COMPONENT_TOO_LONG = null;
          theAccountNameYouText = null;
          byClickingCreateYouText = null;
          return;
        }
        EMAIL_COMPONENT_TOO_LONG = null;
        theAccountNameYouText = null;
        byClickingCreateYouText = null;
    }

    final static void fillNoiseVolume(float frequencyZ, NoiseSliceGenerator generator, int outputOffset, byte[] output, int octaves, float amplitude, float frequencyX, float persistence, int guard, float frequencyY, int height, int depth, int width) {
        int var13_int = 0;
        int var14 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 24046) {
            return;
          }
          for (var13_int = 0; var13_int < depth; var13_int++) {
            VertexAttribute.fillNoiseSlice(frequencyZ, frequencyX, outputOffset, height, output, var13_int, persistence, depth, -95, width, octaves, frequencyY, generator, amplitude);
            outputOffset = outputOffset + height * width;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_9_0 = var13;
          stackIn_9_1 = new StringBuilder().append("cn.H(").append(frequencyZ).append(',');
          if (generator == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(outputOffset).append(',');
          if (output == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(octaves).append(',').append(amplitude).append(',').append(frequencyX).append(',').append(persistence).append(',').append(guard).append(',').append(frequencyY).append(',').append(height).append(',').append(depth).append(',').append(width).append(')').toString());
        }
    }

    SocialContact() {
        super(0L, (UiStyle) null);
    }

    final static String[] split(char delimiter, String text, int guard) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) text);
          var3_int = AccountPacketReader.countCharacter((byte) -117, var10, delimiter);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          if (guard != -27224) {
            SocialContact.cosQ16(39, 126);
          }
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; delimiter != text.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = text.substring(var6, var8);
            var6 = 1 + var8;
          }
          var4[var3_int] = text.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("cn.G(").append(delimiter).append(',');
          if (text == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    final static int cosQ16(int guard, int angle) {
        if (guard != 0) {
          theAccountNameYouText = (String) null;
          angle = angle & 8191;
          if (angle >= 4096) {
            return 6144 <= angle ? ToolkitRasterBuffer.field_p[angle - 6144] : -ToolkitRasterBuffer.field_p[-angle + 6144];
          }
          return 2048 > angle ? ToolkitRasterBuffer.field_p[-angle + 2048] : -ToolkitRasterBuffer.field_p[-2048 + angle];
        }
        angle = angle & 8191;
        if (angle >= 4096) {
          return 6144 <= angle ? ToolkitRasterBuffer.field_p[angle - 6144] : -ToolkitRasterBuffer.field_p[-angle + 6144];
        }
        return 2048 > angle ? ToolkitRasterBuffer.field_p[-angle + 2048] : -ToolkitRasterBuffer.field_p[-2048 + angle];
    }

    static {
        byClickingCreateYouText = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        EMAIL_COMPONENT_TOO_LONG = new EmailValidationError();
        theAccountNameYouText = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
