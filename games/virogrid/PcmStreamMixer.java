/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends AudioStream {
    private IntrusiveDeque field_m;
    private IntrusiveDeque field_l;
    private int field_k;
    private int field_n;

    final AudioStream firstSubStream() {
        return (AudioStream) (this.field_m.first((byte) -115));
    }

    final AudioStream nextSubStream() {
        return (AudioStream) (this.field_m.next(16213));
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        PcmStreamMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_k < 0) {
            this.skipSubstreams(param0);
            return;
          }
          if (this.field_n + param0 < this.field_k) {
            this.field_n = this.field_n + param0;
            this.skipSubstreams(param0);
            return;
          }
          var2 = this.field_k - this.field_n;
          this.skipSubstreams(var2);
          param0 = param0 - var2;
          this.field_n = this.field_n + var2;
          this.commitElapsed();
          var3 = (PcmStreamMixerListener) (this.field_l.first((byte) -124));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onMixerTick(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.insertListener(var3.previous, var3);
            } else {
              var3.field_g = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void skipSubstreams(int param0) {
        AudioStream var2 = (AudioStream) (this.field_m.first((byte) -106));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (AudioStream) (this.field_m.next(16213));
        }
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmStreamMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_k < 0) {
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          if (this.field_n + param2 < this.field_k) {
            this.field_n = this.field_n + param2;
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          var4 = this.field_k - this.field_n;
          this.mixSubstreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_n = this.field_n + var4;
          this.commitElapsed();
          var5 = (PcmStreamMixerListener) (this.field_l.first((byte) -74));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onMixerTick(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.insertListener(var5.previous, var5);
            } else {
              var5.field_g = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void removeListener(PcmStreamMixerListener param0) {
        param0.unlink(false);
        param0.onRemoved();
        IntrusiveNode var2 = this.field_l.field_i.previous;
        if (var2 == this.field_l.field_i) {
          this.field_k = -1;
        } else {
          this.field_k = ((PcmStreamMixerListener) (var2)).field_g;
        }
    }

    private final void insertListener(IntrusiveNode param0, PcmStreamMixerListener param1) {
        while (true) {
          if (param0 == this.field_l.field_i) {
            CanvasPresentHelpers.insertAfter(param0, (byte) 120, param1);
            this.field_k = ((PcmStreamMixerListener) (this.field_l.field_i.previous)).field_g;
            return;
          }
          if (((PcmStreamMixerListener) (param0)).field_g <= param1.field_g) {
            param0 = param0.previous;
            continue;
          }
          break;
        }
        CanvasPresentHelpers.insertAfter(param0, (byte) 120, param1);
        this.field_k = ((PcmStreamMixerListener) (this.field_l.field_i.previous)).field_g;
        return;
    }

    private final void mixSubstreams(int[] param0, int param1, int param2) {
        AudioStream var4 = (AudioStream) (this.field_m.first((byte) -44));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (AudioStream) (this.field_m.next(16213));
        }
    }

    final int activity() {
        return 0;
    }

    private final void commitElapsed() {
        PcmStreamMixerListener var1 = null;
        if (this.field_n > 0) {
          var1 = (PcmStreamMixerListener) (this.field_l.first((byte) -116));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_n;
            var1 = (PcmStreamMixerListener) (this.field_l.next(16213));
          }
          this.field_k = this.field_k - this.field_n;
          this.field_n = 0;
        }
    }

    final synchronized void addSubStream(AudioStream param0) {
        this.field_m.addLast(param0, (byte) -45);
    }

    public PcmStreamMixer() {
        this.field_m = new IntrusiveDeque();
        this.field_l = new IntrusiveDeque();
        this.field_n = 0;
        this.field_k = -1;
    }
}
