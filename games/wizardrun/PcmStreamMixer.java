/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_n;
    private IntrusiveDeque field_p;
    private int field_o;
    private int field_m;

    private final void normalizeListenerDeadlines() {
        PcmMixerListener var1 = null;
        if (this.field_m > 0) {
          var1 = (PcmMixerListener) (this.field_p.first((byte) 84));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_m;
            var1 = (PcmMixerListener) (this.field_p.next(8192));
          }
          this.field_o = this.field_o - this.field_m;
          this.field_m = 0;
        }
    }

    final PcmStream firstSubstream() {
        return (PcmStream) (this.field_n.first((byte) 106));
    }

    final void addSample(PcmSample param0, int param1, int param2) {
        this.addStream(PcmSampleStream.createAtRatePercent(param0, param1, param2));
    }

    final synchronized void addStream(PcmStream param0) {
        this.field_n.addFirst(param0, -5441);
    }

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(false);
        param0.a();
        IntrusiveNode var2 = this.field_p.field_a.next;
        if (var2 == this.field_p.field_a) {
          this.field_o = -1;
        } else {
          this.field_o = ((PcmMixerListener) (var2)).field_i;
        }
    }

    final int mixingCost() {
        return 0;
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_o < 0) {
            this.skipSubstreams(param0);
            return;
          }
          if (this.field_m + param0 < this.field_o) {
            this.field_m = this.field_m + param0;
            this.skipSubstreams(param0);
            return;
          }
          var2 = this.field_o - this.field_m;
          this.skipSubstreams(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.normalizeListenerDeadlines();
          var3 = (PcmMixerListener) (this.field_p.first((byte) 106));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_i = var5;
              this.insertListener(var3.next, var3);
            } else {
              var3.field_i = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void insertListener(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_p.field_a) {
            GameShell.insertNodeBeforeWithIntGuard(74, param0, param1);
            this.field_o = ((PcmMixerListener) (this.field_p.field_a.next)).field_i;
            return;
          }
          if (((PcmMixerListener) (param0)).field_i <= param1.field_i) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        GameShell.insertNodeBeforeWithIntGuard(74, param0, param1);
        this.field_o = ((PcmMixerListener) (this.field_p.field_a.next)).field_i;
        return;
    }

    final PcmStream nextSubstream() {
        return (PcmStream) (this.field_n.next(8192));
    }

    private final void mixSubstreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_n.first((byte) 87));
        while (var4 != null) {
          var4.update(param0, param1, param2);
          var4 = (PcmStream) (this.field_n.next(8192));
        }
    }

    private final void skipSubstreams(int param0) {
        PcmStream var2 = (PcmStream) (this.field_n.first((byte) 98));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_n.next(8192));
        }
    }

    final synchronized void fill(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_o < 0) {
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_o) {
            this.field_m = this.field_m + param2;
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          var4 = this.field_o - this.field_m;
          this.mixSubstreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.normalizeListenerDeadlines();
          var5 = (PcmMixerListener) (this.field_p.first((byte) 99));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_i = var7;
              this.insertListener(var5.next, var5);
            } else {
              var5.field_i = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    public PcmStreamMixer() {
        this.field_n = new IntrusiveDeque();
        this.field_p = new IntrusiveDeque();
        this.field_o = -1;
        this.field_m = 0;
    }
}
