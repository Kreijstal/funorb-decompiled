/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_o;
    private IntrusiveDeque field_q;
    private int field_n;
    private int field_p;

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_o.beginBackward(-18110));
        while (var4 != null) {
          var4.mixOrSkip(param0, param1, param2);
          var4 = (PcmStream) (this.field_o.nextBackward((byte) -114));
        }
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_o.beginBackward(-18110));
    }

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(-2193);
        param0.onRemovedFromMixer();
        IntrusiveNode var2 = this.field_q.sentinel.previous;
        if (var2 == this.field_q.sentinel) {
          this.field_p = -1;
        } else {
          this.field_p = ((PcmMixerListener) (var2)).field_j;
        }
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_o.nextBackward((byte) -106));
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_p < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_n + param2 < this.field_p) {
            this.field_n = this.field_n + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_p - this.field_n;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_n = this.field_n + var4;
          this.normalizeListenerDeadlines();
          var5 = (PcmMixerListener) (this.field_q.beginBackward(-18110));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_j = var7;
              this.insertListenerByDeadline(var5.previous, var5);
            } else {
              var5.field_j = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void skip(int sampleCount) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_p < 0) {
            this.skipChildFrames(sampleCount);
            return;
          }
          if (this.field_n + sampleCount < this.field_p) {
            this.field_n = this.field_n + sampleCount;
            this.skipChildFrames(sampleCount);
            return;
          }
          var2 = this.field_p - this.field_n;
          this.skipChildFrames(var2);
          sampleCount = sampleCount - var2;
          this.field_n = this.field_n + var2;
          this.normalizeListenerDeadlines();
          var3 = (PcmMixerListener) (this.field_q.beginBackward(-18110));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_j = var5;
              this.insertListenerByDeadline(var3.previous, var3);
            } else {
              var3.field_j = 0;
              this.removeListener(var3);
            }
          }
        } while (sampleCount != 0);
        return;
    }

    private final void normalizeListenerDeadlines() {
        PcmMixerListener var1 = null;
        if (this.field_n > 0) {
          var1 = (PcmMixerListener) (this.field_q.beginBackward(-18110));
          while (var1 != null) {
            var1.field_j = var1.field_j - this.field_n;
            var1 = (PcmMixerListener) (this.field_q.nextBackward((byte) -116));
          }
          this.field_p = this.field_p - this.field_n;
          this.field_n = 0;
        }
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_q.sentinel) {
            he.a(param1, param0, true);
            this.field_p = ((PcmMixerListener) (this.field_q.sentinel.previous)).field_j;
            return;
          }
          if (((PcmMixerListener) (param0)).field_j <= param1.field_j) {
            param0 = param0.previous;
            continue;
          }
          break;
        }
        he.a(param1, param0, true);
        this.field_p = ((PcmMixerListener) (this.field_q.sentinel.previous)).field_j;
        return;
    }

    final synchronized void addChildStream(PcmStream param0) {
        this.field_o.addLast(param0, 69);
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_o.beginBackward(-18110));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_o.nextBackward((byte) -127));
        }
    }

    public PcmStreamMixer() {
        this.field_o = new IntrusiveDeque();
        this.field_q = new IntrusiveDeque();
        this.field_n = 0;
        this.field_p = -1;
    }
}
