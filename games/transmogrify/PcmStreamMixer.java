/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_n;
    private IntrusiveDeque field_m;
    private int field_l;
    private int field_k;

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(5);
        param0.onRemovedFromMixer();
        IntrusiveNode var2 = this.field_m.sentinel.next;
        if (var2 == this.field_m.sentinel) {
          this.field_k = -1;
        } else {
          this.field_k = ((PcmMixerListener) (var2)).field_g;
        }
    }

    private final void normalizeListenerDeadlines() {
        PcmMixerListener var1 = null;
        if (this.field_l > 0) {
          var1 = (PcmMixerListener) (this.field_m.beginForward((byte) -95));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_l;
            var1 = (PcmMixerListener) (this.field_m.nextForward(true));
          }
          this.field_k = this.field_k - this.field_l;
          this.field_l = 0;
        }
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_n.beginForward((byte) -95));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_n.nextForward(true));
        }
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_k < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_l + param0 < this.field_k) {
            this.field_l = this.field_l + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_k - this.field_l;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_l = this.field_l + var2;
          this.normalizeListenerDeadlines();
          var3 = (PcmMixerListener) (this.field_m.beginForward((byte) -95));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.insertListenerByDeadline(var3.next, var3);
            } else {
              var3.field_g = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_m.sentinel) {
            FrameTimer.a(param0, (byte) 125, param1);
            this.field_k = ((PcmMixerListener) (this.field_m.sentinel.next)).field_g;
            return;
          }
          if (((PcmMixerListener) (param0)).field_g <= param1.field_g) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        FrameTimer.a(param0, (byte) 125, param1);
        this.field_k = ((PcmMixerListener) (this.field_m.sentinel.next)).field_g;
        return;
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_n.beginForward((byte) -95));
    }

    final synchronized void addChildStream(PcmStream param0) {
        this.field_n.addFirst((IntrusiveNode) (param0), (byte) 33);
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_n.beginForward((byte) -95));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_n.nextForward(true));
        }
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_k < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_l + param2 < this.field_k) {
            this.field_l = this.field_l + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_k - this.field_l;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_l = this.field_l + var4;
          this.normalizeListenerDeadlines();
          var5 = (PcmMixerListener) (this.field_m.beginForward((byte) -95));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.insertListenerByDeadline(var5.next, var5);
            } else {
              var5.field_g = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_n.nextForward(true));
    }

    final int getSchedulingCost() {
        return 0;
    }

    public PcmStreamMixer() {
        this.field_n = new IntrusiveDeque();
        this.field_m = new IntrusiveDeque();
        this.field_l = 0;
        this.field_k = -1;
    }
}
