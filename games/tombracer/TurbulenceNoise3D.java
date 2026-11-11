/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TurbulenceNoise3D extends FixedPointPerlinNoise3D {
    private byte[] samples;
    private int[] octaveWeightsQ12;
    static String[] fallingObjectDeathMessages;
    private int outputIndex;
    static nt field_j;
    private int accumulatedQ12;

    final void accumulateOctave(int param0, byte param1, int param2) {
        if (param1 <= -37) {
          this.accumulatedQ12 = this.accumulatedQ12 + (param0 * this.octaveWeightsQ12[param2] >> 12);
          return;
        }
        this.finishVoxel(-100);
        this.accumulatedQ12 = this.accumulatedQ12 + (param0 * this.octaveWeightsQ12[param2] >> 12);
    }

    void writeVoxel(int param0, boolean param1, byte param2) {
        int fieldTemp$0 = this.outputIndex;
        this.outputIndex = this.outputIndex + 1;
        this.samples[fieldTemp$0] = (byte)(127 + SnakePitBehaviour.bitwiseAnd(127, param2 >> 1));
        if (param1) {
          fallingObjectDeathMessages = (String[]) null;
        }
    }

    TurbulenceNoise3D(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        this.octaveWeightsQ12 = new int[this.octaveCount];
        for (var7 = 0; this.octaveCount > var7; var7++) {
          this.octaveWeightsQ12[var7] = (short)(int)(Math.pow((double)param5, (double)var7) * 4096.0);
        }
    }

    final void finishVoxel(int param0) {
        int fieldTemp$0 = 0;
        this.accumulatedQ12 = Math.abs(this.accumulatedQ12);
        if (param0 == 32164) {
          if (this.accumulatedQ12 >= 4096) {
            this.accumulatedQ12 = 4095;
          }
          fieldTemp$0 = this.outputIndex;
          this.outputIndex = this.outputIndex + 1;
          this.writeVoxel(fieldTemp$0, false, (byte)(this.accumulatedQ12 >> 4));
          this.accumulatedQ12 = 0;
          return;
        }
        this.accumulatedQ12 = 78;
        if (this.accumulatedQ12 >= 4096) {
          this.accumulatedQ12 = 4095;
        }
        int fieldTemp$1 = this.outputIndex;
        this.outputIndex = this.outputIndex + 1;
        this.writeVoxel(fieldTemp$1, false, (byte)(this.accumulatedQ12 >> 4));
        this.accumulatedQ12 = 0;
    }

    final static void d(int param0) {
        int var1 = qd.a((byte) 82);
        int var2 = TimingPattern.a(-62);
        NetworkArchiveRequest.field_t.drawFrame((byte) 57, var1 + (PathMoveLocomotor.field_p << 1), -lsa.field_b + jua.field_d, FurnitureModel.field_o - PathMoveLocomotor.field_p, (lsa.field_b << 1) + var2);
        if (param0 == -1226152383) {
          TextureCombineSource.a((byte) -83);
          return;
        }
        TurbulenceNoise3D.d(-112);
        TextureCombineSource.a((byte) -83);
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        if (param0 != 24451) {
          return;
        }
        fallingObjectDeathMessages = null;
    }

    final void resetOutput(byte param0) {
        if (param0 == 50) {
          this.accumulatedQ12 = 0;
          this.outputIndex = 0;
          return;
        }
        this.samples = (byte[]) null;
        this.accumulatedQ12 = 0;
        this.outputIndex = 0;
    }

    static {
        fallingObjectDeathMessages = new String[]{"<%0> was pancaked", "<%0> forgot to bring the hard hat", "<%0> entered the land of Moin", "<%0> is quite a bit shorter now", "<%0> should have looked up", "<%0> could not shoulder the burden", "<%0> became pate"};
        field_j = new nt();
    }
}
