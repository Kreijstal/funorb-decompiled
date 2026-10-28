/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TetherHumStream extends PcmStream {
    volatile int field_l;
    static int field_k;
    static String field_n;
    volatile int field_o;
    private int field_m;
    static int field_q;
    private int field_p;

    final int activity() {
        int var1 = (this.field_l >> 8) * this.field_o >> 16;
        if (var1 != 0) {
          return 1;
        }
        return 0;
    }

    final PcmStream nextSubstream() {
        return null;
    }

    public static void releaseStatics(int guard) {
        field_n = null;
        if (guard != -1600199832) {
          TetherHumStream.releaseStatics(1);
        }
    }

    private final int waveformValue(int phase, int amplitude, int waveform, int guard) {
        if (waveform == 2) {
          return amplitude * LegacyButton.field_h[phase & 32767] >> 3;
        }
        if (guard > -6) {
          return 63;
        }
        if (waveform != 3) {
          return 0;
        }
        return -amplitude + (amplitude * (32767 & phase) >> 14);
    }

    final static LegacyButton findLegacyButton(LegacyButton[] buttons, int actionId, int startIndex) {
        String stackIn_13_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          LegacyButton[] var7 = buttons;
          LegacyButton[] var3 = var7;
          for (int var4 = startIndex; var4 < var7.length; var4++) {
            LegacyButton var5 = var7[var4];
            if (actionId == var5.actionId) {
              LegacyButton stackIn_7_0 = var5;
              return stackIn_7_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("m.J(");
          if (buttons == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(actionId).append(',').append(startIndex).append(')').toString());
        }
    }

    final void skip(int length) {
    }

    final PcmStream firstSubstream() {
        return null;
    }

    final void mixInto(int[] samples, int offset, int length) {
        String stackIn_16_2 = null;
        int var18 = EscapeVector.obfuscationControl;
        try {
          int var4_int = this.field_o;
          int var5 = (this.field_l >> 8) * var4_int >> 16;
          if (0 == var5) {
            return;
          }
          double var6 = (double)AudioOutput.sampleRate / 1000.0;
          int var8 = (int)(25460.736 / var6);
          int var9 = var5;
          int var10 = (int)(196509.696 / var6);
          length = length + offset;
          int var11 = (int)(98.304 / var6);
          if (AudioOutput.stereo) {
            length = length << 1;
            offset = offset << 1;
          }
          int var12 = offset;
          while (length > var12) {
            int var13 = 16384 + (var4_int >> 1);
            int var14 = var9;
            int var15 = 32768;
            int var16 = 65536 - var13;
            var13 = var13 + (this.waveformValue(this.field_m, var16, 3, -60) >> 1);
            this.field_m = this.field_m + (var15 * var8 >> 16);
            int var17 = this.waveformValue(this.field_p, var14, 2, -68);
            int incrementValue$0 = var12;
            var12++;
            samples[incrementValue$0] = samples[incrementValue$0] + var17;
            if (AudioOutput.stereo) {
              int incrementValue$1 = var12;
              var12++;
              samples[incrementValue$1] = samples[incrementValue$1] + var17;
            }
            this.field_p = this.field_p + (var11 + (var13 * var10 >> 16));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("m.C(");
          if (samples == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(offset).append(',').append(length).append(')').toString());
        }
    }

    TetherHumStream() {
        this.field_m = 0;
        this.field_p = 0;
    }

    static {
        field_n = "Press M to see the mini-map";
        field_k = 0;
        field_q = 0;
    }
}
