/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmResampler {
    private int field_i;
    static ArchiveKeyRequest field_h;
    static LoginForm field_d;
    static PcmSample field_g;
    static volatile int pendingClickY;
    static String field_b;
    private int field_f;
    static Sprite[] field_a;
    private int[][] field_e;

    public static void releaseStatics(int guard) {
        field_h = null;
        field_g = null;
        if (guard < 88) {
          field_a = (Sprite[]) null;
        }
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final int scaleSampleRate(int sampleRate, byte guard) {
        if (this.field_e != null) {
          sampleRate = (int)((long)this.field_f * (long)sampleRate / (long)this.field_i);
        }
        if (guard != -87) {
          field_a = (Sprite[]) null;
        }
        return sampleRate;
    }

    final int scalePosition(boolean guard, int position) {
        if (this.field_e != null) {
          position = 6 + (int)((long)position * (long)this.field_f / (long)this.field_i);
        }
        if (guard) {
          PcmResampler.releaseStatics(-23);
        }
        return position;
    }

    final byte[] resample(int guard, byte[] samples) {
        String stackIn_25_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (null != this.field_e) {
            int var3_int = (int)((long)this.field_f * (long)samples.length / (long)this.field_i) + 14;
            int[] var16 = new int[var3_int];
            int[] var14 = var16;
            int[] var4 = var14;
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < samples.length; var7++) {
              int var8 = samples[var7];
              int[] var18 = this.field_e[var6];
              for (int var10 = 0; var10 < 14; var10++) {
                var4[var5 + var10] = var4[var5 + var10] + var8 * var18[var10];
              }
              var6 = var6 + this.field_f;
              int var10Lifetime1 = var6 / this.field_i;
              var5 = var5 + var10Lifetime1;
              var6 = var6 - var10Lifetime1 * this.field_i;
            }
            samples = new byte[var3_int];
            int var12 = 0;
            int var7Lifetime1 = var12;
            while (var12 < var3_int) {
              int var8Lifetime1 = 32768 + var16[var12] >> 16;
              if (!(var8Lifetime1 >= -128)) {
                samples[var12] = (byte)-128;
              } else if (var8Lifetime1 > 127) {
                samples[var12] = (byte)127;
              } else {
                samples[var12] = (byte)var8Lifetime1;
              }
              var12++;
            }
          }
          if (guard != -128) {
            field_g = (PcmSample) null;
          }
          byte[] stackIn_21_0 = (byte[]) (samples);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var3;
          StringBuilder stackIn_24_1 = new StringBuilder().append("dd.F(").append(guard).append(',');
          if (samples == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    PcmResampler(int param0, int param1) {
        if (param1 == param0) {
          return;
        }
        int var3 = ProxyAuthenticationException.greatestCommonDivisor(param1, param0, 62);
        param1 = param1 / var3;
        param0 = param0 / var3;
        this.field_f = param1;
        this.field_e = new int[param0][14];
        this.field_i = param0;
        for (int var4 = 0; var4 < param0; var4++) {
          int[] var5 = this.field_e[var4];
          double var6 = (double)var4 / (double)param0 + 6.0;
          int var8 = (int)Math.floor(-7.0 + var6 + 1.0);
          if (var8 < 0) {
            var8 = 0;
          }
          int var9 = (int)Math.ceil(var6 + 7.0);
          if (var9 > 14) {
            var9 = 14;
          }
          double var10 = (double)param1 / (double)param0;
          while (var9 > var8) {
            double var12 = ((double)var8 - var6) * 3.141592653589793;
            double var14 = var10;
            if (var12 < -0.0001 ||
              var12 > 0.0001) {
              var14 = var14 * (Math.sin(var12) / var12);
            }
            var14 = var14 * (Math.cos(0.2243994752564138 * (-var6 + (double)var8)) * 0.46 + 0.54);
            var5[var8] = (int)Math.floor(var14 * 65536.0 + 0.5);
            var8++;
          }
        }
        return;
    }

    final static RasterBuffer createRasterBuffer(java.awt.Component component, int height, byte guard, int width) {
        try {
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (guard != 125) {
                RasterBuffer stackIn_2_0 = (RasterBuffer) null;
                return stackIn_2_0;
              }
              Class var4 = Class.forName("BufferedImageRasterBuffer");
              RasterBuffer var5 = (RasterBuffer) (var4.newInstance());
              var5.a(1018, width, component, height);
              RasterBuffer stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var4_ref = decompiledCaughtException;
              ImageProducerRasterBuffer var5_ref = new ImageProducerRasterBuffer();
              ((RasterBuffer) ((Object) var5_ref)).a(1018, width, component, height);
              ImageProducerRasterBuffer stackIn_6_0 = var5_ref;
              return (RasterBuffer) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_9_0 = var4_ref2;
            StringBuilder stackIn_9_1 = new StringBuilder().append("dd.B(");
            if (component == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(height).append(',').append(guard).append(',').append(width).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = param4;
        int var6 = 1 + param3;
        int var7 = -param0 + param2;
        int var8 = var7 - param4 * var6;
        var5 = var5 + var8 / 2;
        var8 = -(var8 / 2 * 2) + (-(var6 * param4) + var7);
        if (param1 <= 75) {
          return 19;
        }
        var5 = var5 + var8;
        return var5;
    }

    static {
        field_b = "Five rock busters -  'ENTER' or 'R' or 'ALT' to fire";
        field_a = new Sprite[7];
        pendingClickY = 0;
    }
}
