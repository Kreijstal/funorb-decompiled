/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNote extends IntrusiveNode {
    int portamentoProgress;
    int amplitudeEnvelopeIndex;
    int decayProgress;
    MusicPatchEnvelope envelope;
    MusicPatch patch;
    PcmSampleStream sampleStream;
    int releaseEnvelopeIndex;
    int portamentoPitchDelta;
    int keyPan;
    int amplitudeEnvelopeTime;
    int channel;
    int exclusiveGroup;
    int samplesUntilUpdate;
    int velocityGain;
    PcmSample sample;
    int basePitch;
    int age;
    int releaseTime;
    int vibratoPhase;
    int key;
    int retriggerPhase;

    final static boolean overlapsExpandedRectangle(int param0, boolean param1, int param2, Point2i param3, Point2i param4, int param5, Vector2f param6) {
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        java.awt.Canvas var10 = null;
        Vector2f var11 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new Vector2f(param4, param3);
          var8 = param6.dot(var11, (byte) -10);
          if (var8 < (float)(-(param0 + param5))) {
            return false;
          }
          if ((float)(param0 + param5) < var8) {
            return false;
          }
          if (!param1) {
            var10 = (java.awt.Canvas) null;
            MidiNote.drawAccountScreen((byte) 85, (java.awt.Canvas) null);
          }
          var9 = param6.cross(var11, param1);
          if (var9 < (float)(-(param0 + param2))) {
            return false;
          }
          if (var9 > (float)(param0 + param2)) {
            return false;
          }
          SecondaryNodeDequeIterator.field_c = var11;
          SecondaryNodeDequeIterator.field_c.normalize(-1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_19_0 = var7;
          stackIn_19_1 = new StringBuilder().append("ck.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static boolean isMarketingConsentSelected(byte param0) {
        int var1 = -52 % ((29 - param0) / 54);
        return ArchiveProvider.field_b;
    }

    final void clearVoiceReferences(byte param0) {
        this.patch = null;
        this.envelope = null;
        this.sample = null;
        this.sampleStream = null;
        int var2 = -104 % ((24 - param0) / 52);
    }

    final static void drawAccountScreen(byte param0, java.awt.Canvas param1) {
        try {
          if (param0 != -97) {
            MidiNote.isMarketingConsentSelected((byte) 32);
          }
          if (DiskCacheRequest.field_w == 11) {
            BufferedSocket.onAccountScreenComplete(false);
          }
          CheckboxWidget.drawLoadProgress(DisplayNameForm.field_K, DelayedServerPacket.field_m, LayeredWidgetStyle.field_e, -115);
          InheritedWidgetStyle.paintRasterBuffer(param1, 0, true, 0);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ck.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    MidiNote() {
    }

    static {
    }
}
