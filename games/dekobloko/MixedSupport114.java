/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport114 {
    private int integerState0733;
    private int[] integerArrayState0203;
    private int[] integerArrayState0204;
    private int integerState0734;
    private int integerState0735;
    private int integerState0736;
    int integerState0737;
    private int integerState0738;
    int integerState0739;
    private int integerState0740;
    int integerState0741;

    final int computeInteger1480(int integerArgument1) {
        int integerLocal1 = 0;
        if (this.integerState0734 >= this.integerState0733) {
          integerLocal1 = this.integerState0738;
          this.integerState0738 = this.integerState0738 + 1;
          this.integerState0736 = this.integerArrayState0204[integerLocal1] << 15;
          if (this.integerState0738 >= this.integerState0735) {
            this.integerState0738 = this.integerState0735 - 1;
          }
          this.integerState0733 = (int)((double)this.integerArrayState0203[this.integerState0738] / 65536.0 * (double)integerArgument1);
          if (this.integerState0733 > this.integerState0734) {
            this.integerState0740 = ((this.integerArrayState0204[this.integerState0738] << 15) - this.integerState0736) / (this.integerState0733 - this.integerState0734);
          }
        }
        this.integerState0736 = this.integerState0736 + this.integerState0740;
        this.integerState0734 = this.integerState0734 + 1;
        return this.integerState0736 - this.integerState0740 >> 15;
    }

    final void performAction1479() {
        this.integerState0733 = 0;
        this.integerState0738 = 0;
        this.integerState0740 = 0;
        this.integerState0736 = 0;
        this.integerState0734 = 0;
    }

    final void performAction1482(PacketBuffer packetBufferArgument1) {
        this.integerState0739 = packetBufferArgument1.readUnsignedByte((byte) -28);
        this.integerState0737 = packetBufferArgument1.readInt(7553);
        this.integerState0741 = packetBufferArgument1.readInt(7553);
        this.performAction1481(packetBufferArgument1);
    }

    final void performAction1481(PacketBuffer packetBufferArgument1) {
        int integerLocal1 = 0;
        this.integerState0735 = packetBufferArgument1.readUnsignedByte((byte) -69);
        this.integerArrayState0203 = new int[this.integerState0735];
        this.integerArrayState0204 = new int[this.integerState0735];
        for (integerLocal1 = 0; integerLocal1 < this.integerState0735; integerLocal1++) {
          this.integerArrayState0203[integerLocal1] = packetBufferArgument1.readUnsignedShort(3);
          this.integerArrayState0204[integerLocal1] = packetBufferArgument1.readUnsignedShort(3);
        }
    }

    MixedSupport114() {
        this.integerState0735 = 2;
        this.integerArrayState0203 = new int[2];
        this.integerArrayState0204 = new int[2];
        this.integerArrayState0203[0] = 0;
        this.integerArrayState0203[1] = 65535;
        this.integerArrayState0204[0] = 0;
        this.integerArrayState0204[1] = 65535;
    }
}
