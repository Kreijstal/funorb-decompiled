/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_r;
    private IntrusiveDeque listeners;
    private int processedSamples;
    private int field_q;

    final synchronized void a(PcmStream param0) {
        this.field_r.addLast(1392503105, param0);
    }

    final PcmStream nextSubStream() {
        return (PcmStream) (this.field_r.last(1504642273));
    }

    final PcmStream firstSubStream() {
        return (PcmStream) (this.field_r.c(1504642273));
    }

    final synchronized void skip(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_q < 0) {
            this.skipSubstreams(param0);
            return;
          }
          if (this.processedSamples + param0 < this.field_q) {
            this.processedSamples = this.processedSamples + param0;
            this.skipSubstreams(param0);
            return;
          }
          var2 = this.field_q - this.processedSamples;
          this.skipSubstreams(var2);
          param0 = param0 - var2;
          this.processedSamples = this.processedSamples + var2;
          this.normalizeListenerDeadlines();
          var3 = (PcmMixerListener) (this.listeners.c(1504642273));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_k = var5;
              this.insertListener(var3.field_a, var3);
            } else {
              var3.field_k = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_q < 0) {
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          if (this.processedSamples + param2 < this.field_q) {
            this.processedSamples = this.processedSamples + param2;
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          var4 = this.field_q - this.processedSamples;
          this.mixSubstreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.processedSamples = this.processedSamples + var4;
          this.normalizeListenerDeadlines();
          var5 = (PcmMixerListener) (this.listeners.c(1504642273));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_k = var7;
              this.insertListener(var5.field_a, var5);
            } else {
              var5.field_k = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void normalizeListenerDeadlines() {
        PcmMixerListener var1 = null;
        if (this.processedSamples > 0) {
          var1 = (PcmMixerListener) (this.listeners.c(1504642273));
          while (var1 != null) {
            var1.field_k = var1.field_k - this.processedSamples;
            var1 = (PcmMixerListener) (this.listeners.last(1504642273));
          }
          this.field_q = this.field_q - this.processedSamples;
          this.processedSamples = 0;
        }
    }

    private final void skipSubstreams(int param0) {
        PcmStream var2 = (PcmStream) (this.field_r.c(1504642273));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_r.last(1504642273));
        }
    }

    final int activity() {
        return 0;
    }

    private final void insertListener(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.listeners.sentinel) {
            BackgroundScene.$cfr$intArgs$a$2d0b7bdf67eb(98, param0, param1);
            this.field_q = ((PcmMixerListener) (this.listeners.sentinel.field_a)).field_k;
            return;
          }
          if (((PcmMixerListener) (param0)).field_k <= param1.field_k) {
            param0 = param0.field_a;
            continue;
          }
          break;
        }
        BackgroundScene.$cfr$intArgs$a$2d0b7bdf67eb(98, param0, param1);
        this.field_q = ((PcmMixerListener) (this.listeners.sentinel.field_a)).field_k;
        return;
    }

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(2779);
        param0.a();
        IntrusiveNode var2 = this.listeners.sentinel.field_a;
        if (var2 == this.listeners.sentinel) {
          this.field_q = -1;
        } else {
          this.field_q = ((PcmMixerListener) (var2)).field_k;
        }
    }

    public PcmStreamMixer() {
        this.field_r = new IntrusiveDeque();
        this.listeners = new IntrusiveDeque();
        this.processedSamples = 0;
        this.field_q = -1;
    }

    private final void mixSubstreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_r.c(1504642273));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (PcmStream) (this.field_r.last(1504642273));
        }
    }
}
