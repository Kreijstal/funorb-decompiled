/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TimingGraph {
    private int writeIndex;
    static ResourceArchive field_e;
    private long[] samplesNanos;
    static int[][] field_d;
    static int field_b;

    public static void clearSharedReferences(int param0) {
        if (param0 != -1) {
          return;
        }
        field_d = (int[][]) null;
        field_e = null;
    }

    final void addSample(long param0, byte param1) {
        int fieldTemp$0 = this.writeIndex;
        this.writeIndex = this.writeIndex + 1;
        this.samplesNanos[fieldTemp$0] = param0;
        if (param1 == -115) {
          if (this.writeIndex >= this.samplesNanos.length) {
            this.writeIndex = 0;
          }
          return;
        }
    }

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        int var12 = 0;
        int var6;
        long var7;
        int var9;
        int var10;
        int var11;
        int var13;
        long var14;
        int var16;
        int var17;
        var17 = VoidHunters.field_G;
        var6 = 500;
        if (var6 != this.samplesNanos.length) {
          this.samplesNanos = new long[var6];
          if (this.samplesNanos.length <= this.writeIndex) {
            this.writeIndex = 0;
          }
        }
        param3 = param3 + param0;
        var7 = 40000000L;
        var9 = param4;
        var10 = param3;
        var11 = 16711935;
        for (var12 = 0; this.samplesNanos.length > var12; var12++) {
          var13 = param2 * var12 / this.samplesNanos.length + param4;
          var14 = this.samplesNanos[var12];
          var16 = -(int)(var14 * (long)param0 / var7) + param3;
          if (~var12 == ~this.writeIndex) {
            DelayedPacket.drawLine(10 + param3, var13, var13, param3, -16777216, 16711680);
          }
          if (var12 > 0) {
            DelayedPacket.drawLine(var16, var13, var9, var10, -16777216, var11);
          }
          var10 = var16;
          var9 = var13;
        }
        if (param1 < 88) {
          this.addSample(13L, (byte) 97);
        }
        GetLagStandardDeviationOut.drawTextWithDefaultFont(-1, "Currentval=" + this.samplesNanos[(-1 + (this.samplesNanos.length + this.writeIndex)) % this.samplesNanos.length] / 1000L, var11, -(param0 / 2) + param3, param2 + param4, 4266);
        GetLagStandardDeviationOut.drawTextWithDefaultFont(-1, "Maxval=" + var7 / 1000L, var11, 20 - param0 / 2 + param3, param2 + param4, 4266);
    }

    TimingGraph() {
        this.writeIndex = 0;
        this.samplesNanos = new long[500];
    }

    static {
        field_d = new int[1][0];
        field_b = 0;
    }
}
