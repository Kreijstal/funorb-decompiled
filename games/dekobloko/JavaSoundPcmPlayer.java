/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaSoundPcmPlayer extends PcmPlayer {
    private int integerState0355;
    private boolean booleanState0090;
    private javax.sound.sampled.SourceDataLine sourceDataLineState0001;
    private javax.sound.sampled.AudioFormat audioFormatState0001;
    private byte[] byteArrayState0010;
    private static String stringState0292;

    final void performAction0538() {
        if (this.sourceDataLineState0001 != null) {
          this.sourceDataLineState0001.close();
          this.sourceDataLineState0001 = null;
        }
    }

    final void performAction0534() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 256;
        if (booleanState0038) {
          integerLocal3 = integerLocal3 << 1;
        }
        for (integerLocal1 = 0; integerLocal1 < integerLocal3; integerLocal1++) {
          integerLocal2 = this.integerArrayState0041[integerLocal1];
          if ((integerLocal2 + 8388608 & -16777216) != 0) {
            integerLocal2 = 8388607 ^ integerLocal2 >> 31;
          }
          this.byteArrayState0010[integerLocal1 * 2] = (byte)(integerLocal2 >> 8);
          this.byteArrayState0010[integerLocal1 * 2 + 1] = (byte)(integerLocal2 >> 16);
        }
        this.sourceDataLineState0001.write(this.byteArrayState0010, 0, integerLocal3 << 1);
    }

    final int computeInteger0537() {
        return this.integerState0355 - (this.sourceDataLineState0001.available() >> (booleanState0038 ? 2 : 1));
    }

    JavaSoundPcmPlayer() {
        this.booleanState0090 = false;
    }

    final void performAction0527(int integerArgument1) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info infoLocal1 = null;
        try {
          infoLocal1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.audioFormatState0001, integerArgument1 << (booleanState0038 ? 2 : 1));
          this.sourceDataLineState0001 = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) infoLocal1)));
          this.sourceDataLineState0001.open();
          this.sourceDataLineState0001.start();
          this.integerState0355 = integerArgument1;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
          if (MixedSupport051.computeInteger0667(integerArgument1, 101) != 1) {
            this.performAction0527(UiComponentPart020.computeInteger1328(-10498, integerArgument1));
            return;
          }
          this.sourceDataLineState0001 = null;
          throw lineUnavailableException;
        }
    }

    final void performAction0542() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info infoLocal1 = null;
        this.sourceDataLineState0001.flush();
        if (this.booleanState0090) {
          this.sourceDataLineState0001.close();
          this.sourceDataLineState0001 = null;
          infoLocal1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.audioFormatState0001, this.integerState0355 << (booleanState0038 ? 2 : 1));
          this.sourceDataLineState0001 = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) infoLocal1)));
          this.sourceDataLineState0001.open();
          this.sourceDataLineState0001.start();
        }
    }

    final void performAction0530(java.awt.Component componentArgument1) {
        int integerLocal1 = 0;
        javax.sound.sampled.Mixer.Info[] infoArrayLocal2;
        javax.sound.sampled.Mixer.Info[] infoArrayLocal3;
        javax.sound.sampled.Mixer.Info infoLocal4;
        Object stackObjectLocal5;
        javax.sound.sampled.AudioFormat stackAudioFormatLocal6;
        javax.sound.sampled.AudioFormat stackAudioFormatLocal7;
        float stackFloatLocal8;
        int stackIntegerLocal9;
        javax.sound.sampled.AudioFormat stackAudioFormatLocal10 = null;
        javax.sound.sampled.AudioFormat stackAudioFormatLocal11 = null;
        int stackIntegerLocal12 = 0;
        int stackIntegerLocal13 = 0;
        int stackIntegerLocal14 = 0;
        String stringLocal15;
        infoArrayLocal2 = javax.sound.sampled.AudioSystem.getMixerInfo();
        if (infoArrayLocal2 != null) {
          infoArrayLocal3 = infoArrayLocal2;
          for (integerLocal1 = 0; integerLocal1 < infoArrayLocal3.length; integerLocal1++) {
            infoLocal4 = infoArrayLocal3[integerLocal1];
            if (infoLocal4 != null) {
              stringLocal15 = infoLocal4.getName();
              if (stringLocal15 != null &&
                stringLocal15.toLowerCase().indexOf(stringState0292) >= 0) {
                this.booleanState0090 = true;
              }
            }
          }
        }
        stackObjectLocal5 = this;
        stackAudioFormatLocal6 = null;
        stackAudioFormatLocal7 = null;
        stackFloatLocal8 = (float)integerState0209;
        stackIntegerLocal9 = 16;
        if (!booleanState0038) {
          stackAudioFormatLocal10 = null;
          stackAudioFormatLocal11 = null;
          stackIntegerLocal12 = 1;
        } else {
          stackAudioFormatLocal10 = null;
          stackAudioFormatLocal11 = null;
          stackIntegerLocal12 = 2;
        }
        this.audioFormatState0001 = new javax.sound.sampled.AudioFormat(stackFloatLocal8, stackIntegerLocal9, stackIntegerLocal12, true, false);
        stackIntegerLocal13 = 256;
        if (!booleanState0038) {
          stackIntegerLocal14 = 1;
        } else {
          stackIntegerLocal14 = 2;
        }
        this.byteArrayState0010 = new byte[stackIntegerLocal13 << stackIntegerLocal14];
    }

    static {
        stringState0292 = "soundmax";
    }
}
