/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchEnvelope {
    static String muChatPmShowAll;
    byte[] field_l;
    static int[][] field_i;
    int field_g;
    int field_b;
    int field_k;
    static int field_f;
    byte[] field_a;
    static int field_d;
    int field_o;
    int field_e;
    int field_n;
    int field_j;
    static int field_m;
    static MeshBuilder field_h;

    final static void setChatHuffmanCodec(HuffmanCodec codec, byte obfuscationGuard) {
        try {
          int var2_int = 75 % ((0 - obfuscationGuard) / 57);
          Pool.field_J = codec;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kp.C(" + (codec != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void releaseStatics(int param0) {
        muChatPmShowAll = null;
        field_i = (int[][]) null;
        int var1 = 9 % ((-61 - param0) / 35);
        field_h = null;
    }

    final static PlayingSound playSoundEffect(int obfuscationGuard, PcmSample sample, int pan, int volume) {
        RuntimeException var4 = null;
        PlayingSound stackIn_2_0 = null;
        PlayingSound stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 100) {
            stackIn_4_0 = DualLinkDequeIterator.registerSoundEffectStream(-24296, PcmSampleStream.createAtRatePercentQ6(sample, 100, volume, pan));
            return stackIn_4_0;
          }
          stackIn_2_0 = (PlayingSound) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kp.D(").append(obfuscationGuard).append(',');
          if (sample == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(pan).append(',').append(volume).append(')').toString());
        }
    }

    final static void sendAccountStateQuery(int packetLength, int opcode) {
        CipherPacketBuffer var2 = JaggrabDownloader.field_j;
        var2.writeCipheredOpcode(false, opcode);
        var2.writeByte(packetLength, false);
        var2.writeByte(2, false);
    }

    static {
        muChatPmShowAll = "Show all private chat";
        field_m = 128;
    }
}
