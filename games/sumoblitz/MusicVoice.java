/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicVoice extends IntrusiveNode {
    PcmSampleStream stream;
    int pan;
    int channel;
    static AccountConnectionPhase WAIT_LOGIN_DETAILS;
    int exclusiveGroup;
    int vibratoPhase;
    MusicPatchEnvelope envelope;
    int releaseTime;
    PcmSample sample;
    MusicPatch patch;
    int ageTicks;
    static String field_s;
    int decayTime;
    int basePitchQ8;
    int portamentoDelta;
    int gainEnvelopeIndex;
    int retriggerPhase;
    int portamentoScaleQ12;
    static SpriteData field_o;
    int gainEnvelopeTime;
    int samplesUntilUpdate;
    int velocityGain;
    int note;
    int releaseEnvelopeIndex;

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            MusicVoice.releaseStatics((byte) -101);
          }
          stackIn_3_0 = SoftLruCache.decodeCp1252(param1, 0, param1.length, 26564);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("uu.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_o = null;
        WAIT_LOGIN_DETAILS = null;
        field_s = null;
        if (param0 <= 70) {
          MusicVoice.releaseStatics((byte) 17);
        }
    }

    final void clearReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        this.sample = null;
        this.envelope = null;
        this.stream = null;
        this.patch = null;
    }

    final static void readFourIntResponse(boolean guard) {
        IsaacPacketBuffer var2 = null;
        if (guard) {
          return;
        }
        FourIntReadRequest var1 = (FourIntReadRequest) (PerlinNoiseSliceGenerator.field_g.first(103));
        if (var1 != null) {
          var2 = NativeLibraryExtractor.incomingPacket;
          var2.readInt(true);
          var2.readInt(true);
          var2.readInt(true);
          var2.readInt(true);
          var1.unlink(guard);
          return;
        }
        LegacyOpenGlTextureCache.closeAccountSocket((byte) -110);
    }

    MusicVoice() {
    }

    static {
        WAIT_LOGIN_DETAILS = new AccountConnectionPhase();
        field_s = "???";
    }
}
