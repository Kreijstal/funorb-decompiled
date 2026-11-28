/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEffect {
    private AudioSupport001[] audioSupport001ArrayState0001;
    private int integerState0071;
    private int integerState0072;

    private final byte[] computeByteArray0151() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        byte[] byteArrayLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int[] integerArrayLocal9;
        int integerLocal10;
        integerLocal3 = 0;
        for (integerLocal4 = 0; integerLocal4 < 10; integerLocal4++) {
          if (this.audioSupport001ArrayState0001[integerLocal4] != null &&
            this.audioSupport001ArrayState0001[integerLocal4].integerState0388 + this.audioSupport001ArrayState0001[integerLocal4].integerState0389 > integerLocal3) {
            integerLocal3 = this.audioSupport001ArrayState0001[integerLocal4].integerState0388 + this.audioSupport001ArrayState0001[integerLocal4].integerState0389;
          }
        }
        if (integerLocal3 == 0) {
          return new byte[]{};
        }
        integerLocal10 = 22050 * integerLocal3 / 1000;
        byteArrayLocal5 = new byte[integerLocal10];
        for (integerLocal1 = 0; integerLocal1 < 10; integerLocal1++) {
          if (this.audioSupport001ArrayState0001[integerLocal1] != null) {
            integerLocal6 = this.audioSupport001ArrayState0001[integerLocal1].integerState0388 * 22050 / 1000;
            integerLocal7 = this.audioSupport001ArrayState0001[integerLocal1].integerState0389 * 22050 / 1000;
            integerArrayLocal9 = this.audioSupport001ArrayState0001[integerLocal1].computeIntegerArray0909(integerLocal6, this.audioSupport001ArrayState0001[integerLocal1].integerState0388);
            for (integerLocal2 = 0; integerLocal2 < integerLocal6; integerLocal2++) {
              integerLocal8 = byteArrayLocal5[integerLocal2 + integerLocal7] + (integerArrayLocal9[integerLocal2] >> 8);
              if ((integerLocal8 + 128 & -256) != 0) {
                integerLocal8 = integerLocal8 >> 31 ^ 127;
              }
              byteArrayLocal5[integerLocal2 + integerLocal7] = (byte)integerLocal8;
            }
          }
        }
        return byteArrayLocal5;
    }

    final RawSound computeRawSound0153() {
        byte[] byteArrayLocal1 = this.computeByteArray0151();
        return new RawSound(22050, byteArrayLocal1, 22050 * this.integerState0071 / 1000, 22050 * this.integerState0072 / 1000);
    }

    private SoundEffect(PacketBuffer packetBufferArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        this.audioSupport001ArrayState0001 = new AudioSupport001[10];
        for (integerLocal1 = 0; integerLocal1 < 10; integerLocal1++) {
          integerLocal2 = packetBufferArgument1.readUnsignedByte((byte) -82);
          if (integerLocal2 != 0) {
            packetBufferArgument1.position = packetBufferArgument1.position - 1;
            this.audioSupport001ArrayState0001[integerLocal1] = new AudioSupport001();
            this.audioSupport001ArrayState0001[integerLocal1].performAction0911(packetBufferArgument1);
          }
        }
        this.integerState0071 = packetBufferArgument1.readUnsignedShort(3);
        this.integerState0072 = packetBufferArgument1.readUnsignedShort(3);
    }

    final static SoundEffect computeSoundEffect0152(ResourceArchive resourceArchiveArgument1, int integerArgument2, int integerArgument3) {
        byte[] byteArrayLocal1 = resourceArchiveArgument1.getFile(integerArgument3, 76, integerArgument2);
        if (byteArrayLocal1 == null) {
          return null;
        }
        return new SoundEffect(new PacketBuffer(byteArrayLocal1));
    }
}
