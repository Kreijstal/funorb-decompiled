/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OctaveNoiseMap extends TileableNoiseGenerator {
    private int noiseSum;
    private boolean normalizedOutput;
    private byte[] output;
    private int[] octaveAmplitudes;
    static int field_r;
    private int outputIndex;
    static String field_q;
    static String field_s;
    static int field_o;

    final static String e(int param0) {
        if (du.nameCheckPending == ChannelBaseVolumeConsoleCommand.field_L) {
          return cd.field_e;
        }
        if (param0 != 488997228) {
          field_s = (String) null;
          if (!se.emailCheckResult.isComplete((byte) 126)) {
            return se.emailCheckResult.getEmail(true);
          }
          if (du.nameCheckPending == mh.accountNameCheckState) {
            return se.emailCheckResult.getEmail(true);
          }
          return IsaacRandom.loginAccountIdentifier;
        }
        if (!se.emailCheckResult.isComplete((byte) 126)) {
          return se.emailCheckResult.getEmail(true);
        }
        if (du.nameCheckPending == mh.accountNameCheckState) {
          return se.emailCheckResult.getEmail(true);
        }
        return IsaacRandom.loginAccountIdentifier;
    }

    final void beginMap(int obfuscationGuard) {
        this.noiseSum = 0;
        if (obfuscationGuard != -30420) {
          this.generateMap(4, (byte) -104, -20);
          this.outputIndex = 0;
          return;
        }
        this.outputIndex = 0;
    }

    final void emitPixel(byte obfuscationGuard) {
        int lowClampWriteIndex = 0;
        int highClampWriteIndex = 0;
        if (this.noiseSum < -4096) {
          this.noiseSum = -4096;
          lowClampWriteIndex = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.output[lowClampWriteIndex] = (byte)((!this.normalizedOutput ? this.noiseSum : 2048 + (this.noiseSum >> 1)) >> 4);
          if (obfuscationGuard >= -101) {
            return;
          }
          this.noiseSum = 0;
          return;
        }
        if (this.noiseSum > 4096) {
          this.noiseSum = 4096;
          highClampWriteIndex = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.output[highClampWriteIndex] = (byte)((!this.normalizedOutput ? this.noiseSum : 2048 + (this.noiseSum >> 1)) >> 4);
          if (obfuscationGuard >= -101) {
            return;
          }
          this.noiseSum = 0;
          return;
        }
        int unclampedWriteIndex = this.outputIndex;
        this.outputIndex = this.outputIndex + 1;
        this.output[unclampedWriteIndex] = (byte)((!this.normalizedOutput ? this.noiseSum : 2048 + (this.noiseSum >> 1)) >> 4);
        if (obfuscationGuard >= -101) {
          return;
        }
        this.noiseSum = 0;
    }

    OctaveNoiseMap(int seed, int octaveCount, int repeatX, int repeatY, int unusedArgument, float persistence, boolean normalizedOutput) {
        super(seed, octaveCount, repeatX, repeatY, unusedArgument);
        int octave = 0;
        this.normalizedOutput = normalizedOutput ? true : false;
        this.octaveAmplitudes = new int[this.octaveCount];
        for (octave = 0; octave < this.octaveCount; octave++) {
          this.octaveAmplitudes[octave] = (short)(int)(4096.0 * Math.pow((double)persistence, (double)octave));
        }
    }

    final byte[] generateMap(int height, byte obfuscationGuard, int width) {
        this.output = new byte[width * height];
        if (obfuscationGuard < 80) {
          return (byte[]) null;
        }
        this.generateSamples(height, 1, width);
        return this.output;
    }

    final void accumulateOctave(int octave, int sample12, int obfuscationGuard) {
        this.noiseSum = this.noiseSum + (this.octaveAmplitudes[octave] * sample12 >> 12);
        if (obfuscationGuard != 19699) {
          this.octaveAmplitudes = (int[]) null;
        }
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 < 106) {
          OctaveNoiseMap.e(-21);
          field_s = null;
          return;
        }
        field_s = null;
    }

    static {
        field_r = -1;
        field_s = "Spells to heal groups of units.";
        field_q = "Spells to heal a single unit.";
    }
}
