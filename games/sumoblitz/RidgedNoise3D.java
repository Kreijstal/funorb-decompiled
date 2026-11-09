/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RidgedNoise3D extends FixedPointPerlinNoise3D {
    private int ridgeWeightQ12;
    static int field_l;
    private int ridgeSignalQ12;
    private int amplitudeQ12;
    static SpriteData field_p;
    private int amplitudeMultiplierQ12;
    static boolean field_u;
    private int ridgeGainQ12;
    private byte[] samples;
    private int accumulatedQ12;
    private int outputIndex;
    static ToolkitSprite[] field_w;
    private int ridgeOffsetQ12;

    final void resetOutput(int guard) {
        this.outputIndex = 0;
        if (guard >= -7) {
          this.amplitudeMultiplierQ12 = 119;
          this.accumulatedQ12 = 0;
          return;
        }
        this.accumulatedQ12 = 0;
    }

    void writeVoxel(byte value, int index, int guard) {
        if (guard != 4096) {
          return;
        }
        this.samples[index] = (byte)value;
    }

    final void accumulateOctave(int octave, int guard, int valueQ12) {
        int stackIn_5_1 = 0;
        int stackIn_13_1 = 0;
        int stackIn_20_1 = 0;
        int stackIn_24_1 = 0;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (octave == 0) {
          if (valueQ12 >= 0) {
            stackIn_24_1 = valueQ12;
          } else {
            stackIn_24_1 = -valueQ12;
          }
          this.ridgeSignalQ12 = -stackIn_24_1 + this.ridgeOffsetQ12;
          this.ridgeSignalQ12 = this.ridgeSignalQ12 * this.ridgeSignalQ12 >> 12;
          this.ridgeWeightQ12 = 4096;
          this.accumulatedQ12 = this.ridgeSignalQ12;
        } else {
          this.ridgeWeightQ12 = this.ridgeSignalQ12 * this.ridgeGainQ12 >> 12;
          if (this.ridgeWeightQ12 < 0) {
            this.ridgeWeightQ12 = 0;
            if (valueQ12 < 0) {
              stackIn_5_1 = -valueQ12;
            } else {
              stackIn_5_1 = valueQ12;
            }
            this.ridgeSignalQ12 = -stackIn_5_1 + this.ridgeOffsetQ12;
          } else {
            if (4096 >= this.ridgeWeightQ12) {
              if (valueQ12 < 0) {
                stackIn_13_1 = -valueQ12;
              } else {
                stackIn_13_1 = valueQ12;
              }
              this.ridgeSignalQ12 = -stackIn_13_1 + this.ridgeOffsetQ12;
            } else {
              this.ridgeWeightQ12 = 4096;
              if (valueQ12 < 0) {
                stackIn_20_1 = -valueQ12;
              } else {
                stackIn_20_1 = valueQ12;
              }
              this.ridgeSignalQ12 = -stackIn_20_1 + this.ridgeOffsetQ12;
            }
          }
          this.ridgeSignalQ12 = this.ridgeSignalQ12 * this.ridgeSignalQ12 >> 12;
          this.ridgeSignalQ12 = this.ridgeSignalQ12 * this.ridgeWeightQ12 >> 12;
          this.accumulatedQ12 = this.accumulatedQ12 + (this.amplitudeQ12 * this.ridgeSignalQ12 >> 12);
          this.amplitudeQ12 = this.amplitudeQ12 * this.amplitudeMultiplierQ12 >> 12;
        }
        if (guard == 1157) {
          return;
        }
        this.samples = (byte[]) null;
    }

    final void finishVoxel(boolean guard) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        this.accumulatedQ12 = this.accumulatedQ12 >> 4;
        this.amplitudeQ12 = this.amplitudeMultiplierQ12;
        if (this.accumulatedQ12 < 0) {
          this.accumulatedQ12 = 0;
          fieldTemp$0 = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.writeVoxel((byte)this.accumulatedQ12, fieldTemp$0, 4096);
          this.accumulatedQ12 = 0;
          if (guard) {
            this.writeVoxel((byte) -52, 1, -122);
            return;
          }
          return;
        }
        if (this.accumulatedQ12 > 255) {
          this.accumulatedQ12 = 255;
          fieldTemp$1 = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.writeVoxel((byte)this.accumulatedQ12, fieldTemp$1, 4096);
          this.accumulatedQ12 = 0;
          if (guard) {
            this.writeVoxel((byte) -52, 1, -122);
            return;
          }
          return;
        }
        int fieldTemp$2 = this.outputIndex;
        this.outputIndex = this.outputIndex + 1;
        this.writeVoxel((byte)this.accumulatedQ12, fieldTemp$2, 4096);
        this.accumulatedQ12 = 0;
        if (!guard) {
          return;
        }
        this.writeVoxel((byte) -52, 1, -122);
    }

    public static void releaseStatics(byte param0) {
        field_w = null;
        field_p = null;
        if (param0 != 30) {
          RidgedNoise3D.releaseStatics((byte) 34);
        }
    }

    RidgedNoise3D(int noiseSeed, int octaves, int xPeriod, int yPeriod, int zPeriod, float amplitudeExponent, float ridgeOffset, float ridgeGain) {
        super(noiseSeed, octaves, xPeriod, yPeriod, zPeriod);
        this.ridgeGainQ12 = (int)(4096.0f * ridgeGain);
        this.ridgeOffsetQ12 = (int)(ridgeOffset * 4096.0f);
        int dupTemp$0 = (int)(Math.pow(0.5, (double)(-amplitudeExponent)) * 4096.0);
        this.amplitudeMultiplierQ12 = dupTemp$0;
        this.amplitudeQ12 = dupTemp$0;
    }

    static {
        field_l = 0;
    }
}
