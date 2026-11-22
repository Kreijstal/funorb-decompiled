/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private NodeDeque nodeDequeState0019;
    private NodeDeque nodeDequeState0020;
    private int integerState0512;
    private int integerState0513;

    private final void normalizeListenerDelays() {
        PcmMixerListener pcmMixerListenerLocal1 = null;
        if (this.integerState0513 > 0) {
          pcmMixerListenerLocal1 = (PcmMixerListener) (this.nodeDequeState0020.computeHashNode1741((byte) -59));
          while (pcmMixerListenerLocal1 != null) {
            pcmMixerListenerLocal1.integerState0698 = pcmMixerListenerLocal1.integerState0698 - this.integerState0513;
            pcmMixerListenerLocal1 = (PcmMixerListener) (this.nodeDequeState0020.computeHashNode1745(true));
          }
          this.integerState0512 = this.integerState0512 - this.integerState0513;
          this.integerState0513 = 0;
        }
    }

    final synchronized void fill(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        PcmMixerListener pcmMixerListenerLocal2 = null;
        int integerLocal3 = 0;
        Throwable caughtExceptionLocal4 = null;
        Object objectLocal5 = null;
        do {
          if (this.integerState0512 < 0) {
            this.fillSubStreams(integerArrayArgument1, integerArgument2, integerArgument3);
            return;
          }
          if (this.integerState0513 + integerArgument3 < this.integerState0512) {
            this.integerState0513 = this.integerState0513 + integerArgument3;
            this.fillSubStreams(integerArrayArgument1, integerArgument2, integerArgument3);
            return;
          }
          integerLocal1 = this.integerState0512 - this.integerState0513;
          this.fillSubStreams(integerArrayArgument1, integerArgument2, integerLocal1);
          integerArgument2 = integerArgument2 + integerLocal1;
          integerArgument3 = integerArgument3 - integerLocal1;
          this.integerState0513 = this.integerState0513 + integerLocal1;
          this.normalizeListenerDelays();
          pcmMixerListenerLocal2 = (PcmMixerListener) (this.nodeDequeState0020.computeHashNode1741((byte) -109));
          objectLocal5 = pcmMixerListenerLocal2;
          synchronized (objectLocal5) {
            integerLocal3 = pcmMixerListenerLocal2.onMixerTick(this);
            if (integerLocal3 >= 0) {
              pcmMixerListenerLocal2.integerState0698 = integerLocal3;
              this.insertListenerSorted(pcmMixerListenerLocal2.previous, pcmMixerListenerLocal2);
            } else {
              pcmMixerListenerLocal2.integerState0698 = 0;
              this.removeListener(pcmMixerListenerLocal2);
            }
          }
        } while (integerArgument3 != 0);
        return;
    }

    private final void skipSubStreams(int integerArgument1) {
        PcmStream pcmStreamLocal1 = (PcmStream) (this.nodeDequeState0019.computeHashNode1741((byte) -69));
        while (pcmStreamLocal1 != null) {
          pcmStreamLocal1.skip(integerArgument1);
          pcmStreamLocal1 = (PcmStream) (this.nodeDequeState0019.computeHashNode1745(true));
        }
    }

    final synchronized void skip(int integerArgument1) {
        int integerLocal1 = 0;
        PcmMixerListener pcmMixerListenerLocal2 = null;
        int integerLocal3 = 0;
        Throwable caughtExceptionLocal4 = null;
        Object objectLocal5 = null;
        do {
          if (this.integerState0512 < 0) {
            this.skipSubStreams(integerArgument1);
            return;
          }
          if (this.integerState0513 + integerArgument1 < this.integerState0512) {
            this.integerState0513 = this.integerState0513 + integerArgument1;
            this.skipSubStreams(integerArgument1);
            return;
          }
          integerLocal1 = this.integerState0512 - this.integerState0513;
          this.skipSubStreams(integerLocal1);
          integerArgument1 = integerArgument1 - integerLocal1;
          this.integerState0513 = this.integerState0513 + integerLocal1;
          this.normalizeListenerDelays();
          pcmMixerListenerLocal2 = (PcmMixerListener) (this.nodeDequeState0020.computeHashNode1741((byte) -54));
          objectLocal5 = pcmMixerListenerLocal2;
          synchronized (objectLocal5) {
            integerLocal3 = pcmMixerListenerLocal2.onMixerTick(this);
            if (integerLocal3 >= 0) {
              pcmMixerListenerLocal2.integerState0698 = integerLocal3;
              this.insertListenerSorted(pcmMixerListenerLocal2.previous, pcmMixerListenerLocal2);
            } else {
              pcmMixerListenerLocal2.integerState0698 = 0;
              this.removeListener(pcmMixerListenerLocal2);
            }
          }
        } while (integerArgument1 != 0);
        return;
    }

    final synchronized void removeSubStream(PcmStream pcmStreamArgument1) {
        pcmStreamArgument1.unlink((byte) 108);
    }

    final PcmStream nextSubStream() {
        return (PcmStream) (this.nodeDequeState0019.computeHashNode1745(true));
    }

    final void addSampleStream(RawSound rawSoundArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        this.addSubStream(RawPcmStream.computeRawPcmStream0431(rawSoundArgument1, integerArgument2, integerArgument3, integerArgument4));
    }

    final synchronized void addSubStream(PcmStream pcmStreamArgument1) {
        this.nodeDequeState0019.performAction1739(pcmStreamArgument1, 7143);
    }

    private final void removeListener(PcmMixerListener pcmMixerListenerArgument1) {
        pcmMixerListenerArgument1.unlink((byte) 114);
        pcmMixerListenerArgument1.onRemovedFromMixer();
        pcmMixerListenerArgument1.pcmStreamMixerState0003 = null;
        HashNode hashNodeLocal1 = this.nodeDequeState0020.hashNodeState0009.previous;
        if (hashNodeLocal1 == this.nodeDequeState0020.hashNodeState0009) {
          this.integerState0512 = -1;
        } else {
          this.integerState0512 = ((PcmMixerListener) (hashNodeLocal1)).integerState0698;
        }
    }

    final synchronized void removeOwnedListener(PcmMixerListener pcmMixerListenerArgument1) {
        if (pcmMixerListenerArgument1.pcmStreamMixerState0003 == null) {
          return;
        }
        if (pcmMixerListenerArgument1.pcmStreamMixerState0003 == this) {
          this.normalizeListenerDelays();
          this.removeListener(pcmMixerListenerArgument1);
          return;
        }
        throw new RuntimeException();
    }

    final int getStreamCost() {
        return 0;
    }

    final synchronized void addListener(PcmMixerListener pcmMixerListenerArgument1) {
        if (pcmMixerListenerArgument1.pcmStreamMixerState0003 == null) {
          this.normalizeListenerDelays();
          pcmMixerListenerArgument1.pcmStreamMixerState0003 = this;
          pcmMixerListenerArgument1.onAddedToMixer();
          this.insertListenerSorted(this.nodeDequeState0020.hashNodeState0009.previous, pcmMixerListenerArgument1);
          return;
        }
        throw new RuntimeException();
    }

    private final void insertListenerSorted(HashNode hashNodeArgument1, PcmMixerListener pcmMixerListenerArgument2) {
        while (true) {
          if (hashNodeArgument1 == this.nodeDequeState0020.hashNodeState0009) {
            MixedSupport043.performAction0540(10, pcmMixerListenerArgument2, hashNodeArgument1);
            this.integerState0512 = ((PcmMixerListener) (this.nodeDequeState0020.hashNodeState0009.previous)).integerState0698;
            return;
          }
          if (((PcmMixerListener) (hashNodeArgument1)).integerState0698 <= pcmMixerListenerArgument2.integerState0698) {
            hashNodeArgument1 = hashNodeArgument1.previous;
            continue;
          }
          break;
        }
        MixedSupport043.performAction0540(10, pcmMixerListenerArgument2, hashNodeArgument1);
        this.integerState0512 = ((PcmMixerListener) (this.nodeDequeState0020.hashNodeState0009.previous)).integerState0698;
        return;
    }

    final PcmStream firstSubStream() {
        return (PcmStream) (this.nodeDequeState0019.computeHashNode1741((byte) 126));
    }

    private final void fillSubStreams(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        PcmStream pcmStreamLocal1 = (PcmStream) (this.nodeDequeState0019.computeHashNode1741((byte) -106));
        while (pcmStreamLocal1 != null) {
          pcmStreamLocal1.fillOrSkip(integerArrayArgument1, integerArgument2, integerArgument3);
          pcmStreamLocal1 = (PcmStream) (this.nodeDequeState0019.computeHashNode1745(true));
        }
    }

    public PcmStreamMixer() {
        this.nodeDequeState0019 = new NodeDeque();
        this.nodeDequeState0020 = new NodeDeque();
        this.integerState0512 = -1;
        this.integerState0513 = 0;
    }
}
