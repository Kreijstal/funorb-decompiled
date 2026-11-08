/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_l;
    private IntrusiveDeque field_m;
    private int field_k;
    private int field_n;

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(true);
        param0.onRemoved();
        IntrusiveNode var2 = this.field_m.sentinel.next;
        if (var2 == this.field_m.sentinel) {
          this.field_k = -1;
        } else {
          this.field_k = ((PcmMixerListener) (var2)).field_g;
        }
    }

    final synchronized void removeSubStream(PcmStream param0) {
        param0.unlink(true);
    }

    final synchronized void addSubStream(PcmStream param0) {
        this.field_l.addFirst((IntrusiveNode) (param0), (byte) -58);
    }

    private final void mixSubstreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_l.first(12623));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (PcmStream) (this.field_l.next(0));
        }
    }

    final PcmStream firstSubStream() {
        return (PcmStream) (this.field_l.first(12623));
    }

    private final void skipSubstreams(int param0) {
        PcmStream var2 = (PcmStream) (this.field_l.first(12623));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_l.next(0));
        }
    }

    final PcmStream nextSubStream() {
        return (PcmStream) (this.field_l.next(0));
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
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
          this.normalizeListenerDeadlines();
          var5 = (PcmMixerListener) (this.field_m.first(12623));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.update(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.insertListener(var5.next, var5);
            } else {
              var5.field_g = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final int activity() {
        return 0;
    }

    private final void normalizeListenerDeadlines() {
        PcmMixerListener var1 = null;
        if (this.field_n > 0) {
          var1 = (PcmMixerListener) (this.field_m.first(12623));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_n;
            var1 = (PcmMixerListener) (this.field_m.next(0));
          }
          this.field_k = this.field_k - this.field_n;
          this.field_n = 0;
        }
    }

    final synchronized void skip(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
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
          this.normalizeListenerDeadlines();
          var3 = (PcmMixerListener) (this.field_m.first(12623));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.update(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.insertListener(var3.next, var3);
            } else {
              var3.field_g = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void insertListener(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_m.sentinel) {
            da.insertBefore(param0, 20, param1);
            this.field_k = ((PcmMixerListener) (this.field_m.sentinel.next)).field_g;
            return;
          }
          if (((PcmMixerListener) (param0)).field_g <= param1.field_g) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        da.insertBefore(param0, 20, param1);
        this.field_k = ((PcmMixerListener) (this.field_m.sentinel.next)).field_g;
        return;
    }

    public PcmStreamMixer() {
        this.field_l = new IntrusiveDeque();
        this.field_m = new IntrusiveDeque();
        this.field_k = -1;
        this.field_n = 0;
    }
}
