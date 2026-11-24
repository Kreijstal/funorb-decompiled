/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_n;
    private IntrusiveDeque field_p;
    private int field_o;
    private int field_m;

    private final void insertListenerByDeadline(IntrusiveNode param0, vl param1) {
        while (true) {
          if (param0 == this.field_p.sentinel) {
            nl.a(100, param0, param1);
            this.field_m = ((vl) (this.field_p.sentinel.field_h)).field_i;
            return;
          }
          if (((vl) (param0)).field_i <= param1.field_i) {
            param0 = param0.field_h;
            continue;
          }
          break;
        }
        nl.a(100, param0, param1);
        this.field_m = ((vl) (this.field_p.sentinel.field_h)).field_i;
        return;
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_n.beginForward((byte) 47));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_n.nextForward((byte) -105));
        }
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        vl var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_m < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_o + param0 < this.field_m) {
            this.field_o = this.field_o + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_m - this.field_o;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_o = this.field_o + var2;
          this.normalizeListenerDeadlines();
          var3 = (vl) (this.field_p.beginForward((byte) 47));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_i = var5;
              this.insertListenerByDeadline(var3.field_h, var3);
            } else {
              var3.field_i = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_n.beginForward((byte) 47));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_n.nextForward((byte) -105));
        }
    }

    final synchronized void a(PcmStream param0) {
        this.field_n.addFirst(true, param0);
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_n.beginForward((byte) 47));
    }

    final int getSchedulingCost() {
        return 0;
    }

    private final void normalizeListenerDeadlines() {
        vl var1 = null;
        if (this.field_o > 0) {
          var1 = (vl) (this.field_p.beginForward((byte) 47));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_o;
            var1 = (vl) (this.field_p.nextForward((byte) -105));
          }
          this.field_m = this.field_m - this.field_o;
          this.field_o = 0;
        }
    }

    private final void removeListener(vl param0) {
        param0.unlink(-1);
        param0.a();
        IntrusiveNode var2 = this.field_p.sentinel.field_h;
        if (var2 == this.field_p.sentinel) {
          this.field_m = -1;
        } else {
          this.field_m = ((vl) (var2)).field_i;
        }
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_n.nextForward((byte) -105));
    }

    public PcmStreamMixer() {
        this.field_n = new IntrusiveDeque();
        this.field_p = new IntrusiveDeque();
        this.field_o = 0;
        this.field_m = -1;
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        vl var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_m < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_o + param2 < this.field_m) {
            this.field_o = this.field_o + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_m - this.field_o;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_o = this.field_o + var4;
          this.normalizeListenerDeadlines();
          var5 = (vl) (this.field_p.beginForward((byte) 47));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_i = var7;
              this.insertListenerByDeadline(var5.field_h, var5);
            } else {
              var5.field_i = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }
}
