/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RidgedNoise3D extends FixedPointPerlinNoise3D {
    private int ridgeWeightQ12;
    private int amplitudeQ12;
    private int ridgeGainQ12;
    static int field_p;
    private int accumulatedQ12;
    private int amplitudeMultiplierQ12;
    private int outputIndex;
    private byte[] samples;
    private int ridgeSignalQ12;
    static ina field_r;
    private int ridgeOffsetQ12;

    final void accumulateOctave(int param0, byte param1, int param2) {
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param1 >= -37) {
          RidgedNoise3D.releaseStatics(-7);
        }
        if (0 == param2) {
          this.ridgeSignalQ12 = this.ridgeOffsetQ12 - (param0 >= 0 ? param0 : -param0);
          this.ridgeSignalQ12 = this.ridgeSignalQ12 * this.ridgeSignalQ12 >> 12;
          this.ridgeWeightQ12 = 4096;
          this.accumulatedQ12 = this.ridgeSignalQ12;
        } else {
          this.ridgeWeightQ12 = this.ridgeSignalQ12 * this.ridgeGainQ12 >> 12;
          this.ridgeSignalQ12 = this.ridgeOffsetQ12 - (param0 >= 0 ? param0 : -param0);
          if (this.ridgeWeightQ12 < 0) {
            this.ridgeWeightQ12 = 0;
            this.ridgeSignalQ12 = this.ridgeSignalQ12 * this.ridgeSignalQ12 >> 12;
            this.ridgeSignalQ12 = this.ridgeWeightQ12 * this.ridgeSignalQ12 >> 12;
            this.accumulatedQ12 = this.accumulatedQ12 + (this.amplitudeQ12 * this.ridgeSignalQ12 >> 12);
            this.amplitudeQ12 = this.amplitudeMultiplierQ12 * this.amplitudeQ12 >> 12;
            return;
          }
          if (4096 < this.ridgeWeightQ12) {
            this.ridgeWeightQ12 = 4096;
            this.ridgeSignalQ12 = this.ridgeSignalQ12 * this.ridgeSignalQ12 >> 12;
            this.ridgeSignalQ12 = this.ridgeWeightQ12 * this.ridgeSignalQ12 >> 12;
            this.accumulatedQ12 = this.accumulatedQ12 + (this.amplitudeQ12 * this.ridgeSignalQ12 >> 12);
            this.amplitudeQ12 = this.amplitudeMultiplierQ12 * this.amplitudeQ12 >> 12;
            return;
          }
          this.ridgeSignalQ12 = this.ridgeSignalQ12 * this.ridgeSignalQ12 >> 12;
          this.ridgeSignalQ12 = this.ridgeWeightQ12 * this.ridgeSignalQ12 >> 12;
          this.accumulatedQ12 = this.accumulatedQ12 + (this.amplitudeQ12 * this.ridgeSignalQ12 >> 12);
          this.amplitudeQ12 = this.amplitudeMultiplierQ12 * this.amplitudeQ12 >> 12;
          return;
        }
    }

    final static void a(int param0, int param1, ResourceArchive param2, boolean param3, Sprite[][] param4, int[] param5, String[][] param6, ResourceArchive param7, int[] param8, String[] param9, IndexedSprite[] param10, String[][] param11, String[] param12, Sprite[][] param13, ResourceArchive param14, int param15, int param16, byte[] param17, byte[] param18) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          var20 = (String[]) null;
          bba.a(param12, param9, param3, param0, param17, (String[]) null, 95, param15, param13, param5, param6, param7, param18, param2, param14, param4, param8, param16, param10, param11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_4_0 = var19;
          stackIn_4_1 = new StringBuilder().append("lba.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param7 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param8 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param9 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param10 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param11 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param12 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param13 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param14 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param18 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, byte param3, int param4, int param5, String param6, int param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 53) {
            field_p = -69;
          }
          if (0 != RotaterMountComponent.field_K.field_y &&
            !fua.field_g) {
            if (!PowerDownItemBehaviour.field_s) {
              ni.field_c = true;
            } else {
              ContextMenu.e((byte) 112);
            }
          }
          if (!ni.field_c) {
            return;
          }
          av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
          SimpleMoveLocomotor.field_s.c(-73, param0);
          if (!param0) {
            return;
          }
          if (lra.field_d.field_y != 0) {
            ni.field_c = false;
          }
          if (0 == qpa.field_b.field_y) {
            return;
          }
          PlayerProfile.a(true);
          ni.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("lba.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param7).append(')').toString());
        }
    }

    final void resetOutput(byte param0) {
        if (param0 == 50) {
          this.accumulatedQ12 = 0;
          this.outputIndex = 0;
          return;
        }
        IsaacCipher var3 = (IsaacCipher) null;
        RidgedNoise3D.createMazeGenerator((byte) 11, (IsaacCipher) null, 6);
        this.accumulatedQ12 = 0;
        this.outputIndex = 0;
    }

    final static MazeGenerator createMazeGenerator(byte param0, IsaacCipher param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        MazeGenerator stackIn_3_0 = null;
        RecursiveBacktrackerMazeGenerator stackIn_12_0 = null;
        StripedMazeGenerator stackIn_14_0 = null;
        PrimMazeGenerator stackIn_16_0 = null;
        DivisionMazeGenerator stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 27) {
            stackIn_3_0 = (MazeGenerator) null;
            return stackIn_3_0;
          }
          var3_int = param2;
          if (var3_int == 0) {
            stackIn_12_0 = new RecursiveBacktrackerMazeGenerator(param1);
            return (MazeGenerator) ((Object) stackIn_12_0);
          }
          if (var3_int == 1) {
            stackIn_14_0 = new StripedMazeGenerator(param1);
            return (MazeGenerator) ((Object) stackIn_14_0);
          }
          if (2 == var3_int) {
            stackIn_16_0 = new PrimMazeGenerator(param1);
            return (MazeGenerator) ((Object) stackIn_16_0);
          }
          if (var3_int != 3) {
            throw new IllegalStateException("Unrecognised maze gen type: " + param2);
          }
          stackIn_18_0 = new DivisionMazeGenerator(param1);
          return (MazeGenerator) ((Object) stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("lba.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        if (param0 != 1713718860) {
          RidgedNoise3D.releaseStatics(-50);
        }
    }

    void writeVoxel(boolean param0, byte param1, int param2) {
        this.samples[param2] = (byte)param1;
        if (param0) {
          this.ridgeWeightQ12 = 34;
        }
    }

    final void finishVoxel(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        this.amplitudeQ12 = this.amplitudeMultiplierQ12;
        if (param0 != 32164) {
          this.amplitudeQ12 = -4;
          this.accumulatedQ12 = this.accumulatedQ12 >> 4;
          if (this.accumulatedQ12 < 0) {
            this.accumulatedQ12 = 0;
            fieldTemp$0 = this.outputIndex;
            this.outputIndex = this.outputIndex + 1;
            this.writeVoxel(false, (byte)this.accumulatedQ12, fieldTemp$0);
            this.accumulatedQ12 = 0;
            return;
          }
          if (255 < this.accumulatedQ12) {
            this.accumulatedQ12 = 255;
            fieldTemp$1 = this.outputIndex;
            this.outputIndex = this.outputIndex + 1;
            this.writeVoxel(false, (byte)this.accumulatedQ12, fieldTemp$1);
            this.accumulatedQ12 = 0;
            return;
          }
          fieldTemp$2 = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.writeVoxel(false, (byte)this.accumulatedQ12, fieldTemp$2);
          this.accumulatedQ12 = 0;
          return;
        }
        this.accumulatedQ12 = this.accumulatedQ12 >> 4;
        if (this.accumulatedQ12 < 0) {
          this.accumulatedQ12 = 0;
          fieldTemp$3 = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.writeVoxel(false, (byte)this.accumulatedQ12, fieldTemp$3);
          this.accumulatedQ12 = 0;
          return;
        }
        if (255 >= this.accumulatedQ12) {
          fieldTemp$4 = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.writeVoxel(false, (byte)this.accumulatedQ12, fieldTemp$4);
          this.accumulatedQ12 = 0;
          return;
        }
        this.accumulatedQ12 = 255;
        int fieldTemp$5 = this.outputIndex;
        this.outputIndex = this.outputIndex + 1;
        this.writeVoxel(false, (byte)this.accumulatedQ12, fieldTemp$5);
        this.accumulatedQ12 = 0;
    }

    RidgedNoise3D(int param0, int param1, int param2, int param3, int param4, float param5, float param6, float param7) {
        super(param0, param1, param2, param3, param4);
        this.ridgeOffsetQ12 = (int)(param6 * 4096.0f);
        this.ridgeGainQ12 = (int)(param7 * 4096.0f);
        int dupTemp$0 = (int)(4096.0 * Math.pow(0.5, (double)(-param5)));
        this.amplitudeMultiplierQ12 = dupTemp$0;
        this.amplitudeQ12 = dupTemp$0;
    }

    static {
        field_p = 0;
    }
}
