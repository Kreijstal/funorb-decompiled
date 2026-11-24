/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_l;
    private IntrusiveDeque field_n;
    private int field_m;
    private int field_o;

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        ag var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_o < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_o) {
            this.field_m = this.field_m + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_o - this.field_m;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.normalizeListenerDeadlines();
          var5 = (ag) (this.field_n.beginBackward((byte) 51));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_h = var7;
              this.insertListenerByDeadline(var5.previous, var5);
            } else {
              var5.field_h = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_l.beginBackward((byte) 51));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_l.nextBackward(-79));
        }
    }

    final synchronized void a(PcmStream param0) {
        this.field_l.addLast(-3024, param0);
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_l.beginBackward((byte) 51));
    }

    private final void removeListener(ag param0) {
        param0.unlink(10);
        param0.a();
        IntrusiveNode var2 = this.field_n.sentinel.previous;
        if (var2 == this.field_n.sentinel) {
          this.field_o = -1;
        } else {
          this.field_o = ((ag) (var2)).field_h;
        }
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        ag var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_o < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_m + param0 < this.field_o) {
            this.field_m = this.field_m + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_o - this.field_m;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.normalizeListenerDeadlines();
          var3 = (ag) (this.field_n.beginBackward((byte) 51));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_h = var5;
              this.insertListenerByDeadline(var3.previous, var3);
            } else {
              var3.field_h = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_l.nextBackward(-51));
    }

    final int getSchedulingCost() {
        return 0;
    }

    private final void normalizeListenerDeadlines() {
        ag var1 = null;
        if (this.field_m > 0) {
          var1 = (ag) (this.field_n.beginBackward((byte) 51));
          while (var1 != null) {
            var1.field_h = var1.field_h - this.field_m;
            var1 = (ag) (this.field_n.nextBackward(-31));
          }
          this.field_o = this.field_o - this.field_m;
          this.field_m = 0;
        }
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, ag param1) {
        while (true) {
          if (param0 == this.field_n.sentinel) {
            ArchiveIndex.a(param1, (byte) 93, param0);
            this.field_o = ((ag) (this.field_n.sentinel.previous)).field_h;
            return;
          }
          if (((ag) (param0)).field_h <= param1.field_h) {
            param0 = param0.previous;
            continue;
          }
          break;
        }
        ArchiveIndex.a(param1, (byte) 93, param0);
        this.field_o = ((ag) (this.field_n.sentinel.previous)).field_h;
        return;
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_l.beginBackward((byte) 51));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_l.nextBackward(-27));
        }
    }

    public PcmStreamMixer() {
        this.field_l = new IntrusiveDeque();
        this.field_n = new IntrusiveDeque();
        this.field_m = 0;
        this.field_o = -1;
    }
}
