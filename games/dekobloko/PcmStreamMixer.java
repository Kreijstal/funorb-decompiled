/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private NodeDeque nodeDequeState0019;
    private NodeDeque nodeDequeState0020;
    private int integerState0512;
    private int integerState0513;

    private final void performAction1198() {
        AudioSupport005 audioSupport005Local1 = null;
        if (this.integerState0513 > 0) {
          audioSupport005Local1 = (AudioSupport005) (this.nodeDequeState0020.computeHashNode1970((byte) -59));
          while (audioSupport005Local1 != null) {
            audioSupport005Local1.integerState0698 = audioSupport005Local1.integerState0698 - this.integerState0513;
            audioSupport005Local1 = (AudioSupport005) (this.nodeDequeState0020.computeHashNode1974(true));
          }
          this.integerState0512 = this.integerState0512 - this.integerState0513;
          this.integerState0513 = 0;
        }
    }

    final synchronized void performAction0492(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        AudioSupport005 audioSupport005Local2 = null;
        int integerLocal3 = 0;
        Throwable caughtExceptionLocal4 = null;
        Object objectLocal5 = null;
        do {
          if (this.integerState0512 < 0) {
            this.performAction1197(integerArrayArgument1, integerArgument2, integerArgument3);
            return;
          }
          if (this.integerState0513 + integerArgument3 < this.integerState0512) {
            this.integerState0513 = this.integerState0513 + integerArgument3;
            this.performAction1197(integerArrayArgument1, integerArgument2, integerArgument3);
            return;
          }
          integerLocal1 = this.integerState0512 - this.integerState0513;
          this.performAction1197(integerArrayArgument1, integerArgument2, integerLocal1);
          integerArgument2 = integerArgument2 + integerLocal1;
          integerArgument3 = integerArgument3 - integerLocal1;
          this.integerState0513 = this.integerState0513 + integerLocal1;
          this.performAction1198();
          audioSupport005Local2 = (AudioSupport005) (this.nodeDequeState0020.computeHashNode1970((byte) -109));
          objectLocal5 = audioSupport005Local2;
          synchronized (objectLocal5) {
            integerLocal3 = audioSupport005Local2.computeInteger0772(this);
            if (integerLocal3 >= 0) {
              audioSupport005Local2.integerState0698 = integerLocal3;
              this.performAction1189(audioSupport005Local2.previous, audioSupport005Local2);
            } else {
              audioSupport005Local2.integerState0698 = 0;
              this.performAction1194(audioSupport005Local2);
            }
          }
        } while (integerArgument3 != 0);
        return;
    }

    private final void performAction1195(int integerArgument1) {
        PcmStream pcmStreamLocal1 = (PcmStream) (this.nodeDequeState0019.computeHashNode1970((byte) -69));
        while (pcmStreamLocal1 != null) {
          pcmStreamLocal1.performAction0469(integerArgument1);
          pcmStreamLocal1 = (PcmStream) (this.nodeDequeState0019.computeHashNode1974(true));
        }
    }

    final synchronized void performAction0469(int integerArgument1) {
        int integerLocal1 = 0;
        AudioSupport005 audioSupport005Local2 = null;
        int integerLocal3 = 0;
        Throwable caughtExceptionLocal4 = null;
        Object objectLocal5 = null;
        do {
          if (this.integerState0512 < 0) {
            this.performAction1195(integerArgument1);
            return;
          }
          if (this.integerState0513 + integerArgument1 < this.integerState0512) {
            this.integerState0513 = this.integerState0513 + integerArgument1;
            this.performAction1195(integerArgument1);
            return;
          }
          integerLocal1 = this.integerState0512 - this.integerState0513;
          this.performAction1195(integerLocal1);
          integerArgument1 = integerArgument1 - integerLocal1;
          this.integerState0513 = this.integerState0513 + integerLocal1;
          this.performAction1198();
          audioSupport005Local2 = (AudioSupport005) (this.nodeDequeState0020.computeHashNode1970((byte) -54));
          objectLocal5 = audioSupport005Local2;
          synchronized (objectLocal5) {
            integerLocal3 = audioSupport005Local2.computeInteger0772(this);
            if (integerLocal3 >= 0) {
              audioSupport005Local2.integerState0698 = integerLocal3;
              this.performAction1189(audioSupport005Local2.previous, audioSupport005Local2);
            } else {
              audioSupport005Local2.integerState0698 = 0;
              this.performAction1194(audioSupport005Local2);
            }
          }
        } while (integerArgument1 != 0);
        return;
    }

    final synchronized void performAction1193(PcmStream pcmStreamArgument1) {
        pcmStreamArgument1.performAction0161((byte) 108);
    }

    final PcmStream computePcmStream0494() {
        return (PcmStream) (this.nodeDequeState0019.computeHashNode1974(true));
    }

    final void performAction1192(RawSound rawSoundArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        this.performAction1190(RawPcmStream.computeRawPcmStream0476(rawSoundArgument1, integerArgument2, integerArgument3, integerArgument4));
    }

    final synchronized void performAction1190(PcmStream pcmStreamArgument1) {
        this.nodeDequeState0019.performAction1968(pcmStreamArgument1, 7143);
    }

    private final void performAction1194(AudioSupport005 audioSupport005Argument1) {
        audioSupport005Argument1.performAction0161((byte) 114);
        audioSupport005Argument1.performAction0768();
        audioSupport005Argument1.pcmStreamMixerState0003 = null;
        HashNode hashNodeLocal1 = this.nodeDequeState0020.hashNodeState0009.previous;
        if (hashNodeLocal1 == this.nodeDequeState0020.hashNodeState0009) {
          this.integerState0512 = -1;
        } else {
          this.integerState0512 = ((AudioSupport005) (hashNodeLocal1)).integerState0698;
        }
    }

    final synchronized void performAction1196(AudioSupport005 audioSupport005Argument1) {
        if (audioSupport005Argument1.pcmStreamMixerState0003 == null) {
          return;
        }
        if (audioSupport005Argument1.pcmStreamMixerState0003 == this) {
          this.performAction1198();
          this.performAction1194(audioSupport005Argument1);
          return;
        }
        throw new RuntimeException();
    }

    final int computeInteger0468() {
        return 0;
    }

    final synchronized void performAction1191(AudioSupport005 audioSupport005Argument1) {
        if (audioSupport005Argument1.pcmStreamMixerState0003 == null) {
          this.performAction1198();
          audioSupport005Argument1.pcmStreamMixerState0003 = this;
          audioSupport005Argument1.performAction0774();
          this.performAction1189(this.nodeDequeState0020.hashNodeState0009.previous, audioSupport005Argument1);
          return;
        }
        throw new RuntimeException();
    }

    private final void performAction1189(HashNode hashNodeArgument1, AudioSupport005 audioSupport005Argument2) {
        while (true) {
          if (hashNodeArgument1 == this.nodeDequeState0020.hashNodeState0009) {
            MixedSupport043.performAction0598(10, audioSupport005Argument2, hashNodeArgument1);
            this.integerState0512 = ((AudioSupport005) (this.nodeDequeState0020.hashNodeState0009.previous)).integerState0698;
            return;
          }
          if (((AudioSupport005) (hashNodeArgument1)).integerState0698 <= audioSupport005Argument2.integerState0698) {
            hashNodeArgument1 = hashNodeArgument1.previous;
            continue;
          }
          break;
        }
        MixedSupport043.performAction0598(10, audioSupport005Argument2, hashNodeArgument1);
        this.integerState0512 = ((AudioSupport005) (this.nodeDequeState0020.hashNodeState0009.previous)).integerState0698;
        return;
    }

    final PcmStream computePcmStream0499() {
        return (PcmStream) (this.nodeDequeState0019.computeHashNode1970((byte) 126));
    }

    private final void performAction1197(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        PcmStream pcmStreamLocal1 = (PcmStream) (this.nodeDequeState0019.computeHashNode1970((byte) -106));
        while (pcmStreamLocal1 != null) {
          pcmStreamLocal1.performAction1372(integerArrayArgument1, integerArgument2, integerArgument3);
          pcmStreamLocal1 = (PcmStream) (this.nodeDequeState0019.computeHashNode1974(true));
        }
    }

    public PcmStreamMixer() {
        this.nodeDequeState0019 = new NodeDeque();
        this.nodeDequeState0020 = new NodeDeque();
        this.integerState0512 = -1;
        this.integerState0513 = 0;
    }
}
