/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEffect {
    private int loopStartMillis;
    private int loopEndMillis;
    private SynthInstrument[] instruments;

    private final byte[] mixSamples() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
          if (this.instruments[var2] != null &&
            this.instruments[var2].durationMillis + this.instruments[var2].offsetMillis > var1) {
            var1 = this.instruments[var2].durationMillis + this.instruments[var2].offsetMillis;
          }
        }
        if (var1 == 0) {
          return new byte[]{};
        }
        int var2Lifetime1 = 22050 * var1 / 1000;
        byte[] var3 = new byte[var2Lifetime1];
        for (int var4 = 0; var4 < 10; var4++) {
          if (this.instruments[var4] != null) {
            int var5 = this.instruments[var4].durationMillis * 22050 / 1000;
            int var6 = this.instruments[var4].offsetMillis * 22050 / 1000;
            int[] var13 = this.instruments[var4].synthesize(var5, this.instruments[var4].durationMillis);
            for (int var8 = 0; var8 < var5; var8++) {
              int var9 = var3[var8 + var6] + (var13[var8] >> 8);
              if ((var9 + 128 & -256) != 0) {
                var9 = var9 >> 31 ^ 127;
              }
              var3[var8 + var6] = (byte)var9;
            }
          }
        }
        return var3;
    }

    final static SoundEffect loadNamed(ResourceArchive archive, String groupName, String fileName) {
        byte[] var3 = archive.a(-4, fileName, groupName);
        if (var3 == null) {
          return null;
        }
        return new SoundEffect(new PacketBuffer(var3));
    }

    final static SoundEffect load(ResourceArchive archive, int groupId, int fileId) {
        byte[] var3 = archive.a(groupId, (byte) -97, fileId);
        if (var3 == null) {
          return null;
        }
        return new SoundEffect(new PacketBuffer(var3));
    }

    final PcmSample toPcmSample() {
        byte[] var1 = this.mixSamples();
        return new PcmSample(22050, var1, 22050 * this.loopStartMillis / 1000, 22050 * this.loopEndMillis / 1000);
    }

    private SoundEffect(PacketBuffer param0) {
        this.instruments = new SynthInstrument[10];
        for (int var2 = 0; var2 < 10; var2++) {
          int var3 = param0.readUnsignedByte(0);
          if (var3 != 0) {
            param0.position = param0.position - 1;
            this.instruments[var2] = new SynthInstrument();
            this.instruments[var2].decode(param0);
          }
        }
        this.loopStartMillis = param0.readUnsignedShort(1952);
        this.loopEndMillis = param0.readUnsignedShort(1952);
    }
}
