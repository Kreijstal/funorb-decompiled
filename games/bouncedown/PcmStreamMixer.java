/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_n;
    private IntrusiveDeque field_l;
    private int field_m;
    private int field_k;

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_n.beginForward((byte) -83));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_n.nextForward((byte) -102));
        }
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_n.beginForward((byte) -99));
    }

    private final void normalizeListenerDeadlines() {
        oi var1 = null;
        if (this.field_m > 0) {
          var1 = (oi) (this.field_l.beginForward((byte) -50));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_m;
            var1 = (oi) (this.field_l.nextForward((byte) -94));
          }
          this.field_k = this.field_k - this.field_m;
          this.field_m = 0;
        }
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_n.nextForward((byte) -60));
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        oi var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_k < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_k) {
            this.field_m = this.field_m + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_k - this.field_m;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.normalizeListenerDeadlines();
          var5 = (oi) (this.field_l.beginForward((byte) -117));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.insertListenerByDeadline(var5.field_c, var5);
            } else {
              var5.field_g = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void a(PcmStream param0) {
        this.field_n.addFirst((byte) 83, (IntrusiveNode) (param0));
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        oi var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_k < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_m + param0 < this.field_k) {
            this.field_m = this.field_m + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_k - this.field_m;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.normalizeListenerDeadlines();
          var3 = (oi) (this.field_l.beginForward((byte) -84));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.insertListenerByDeadline(var3.field_c, var3);
            } else {
              var3.field_g = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final void a(PcmSample param0, int param1, int param2) {
        this.a(RawPcmStream.createForPlaybackRate(param0, param1, param2));
    }

    private final void removeListener(oi param0) {
        param0.unlink(2);
        param0.a();
        IntrusiveNode var2 = this.field_l.sentinel.field_c;
        if (var2 == this.field_l.sentinel) {
          this.field_k = -1;
        } else {
          this.field_k = ((oi) (var2)).field_g;
        }
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, oi param1) {
        while (true) {
          if (param0 == this.field_l.sentinel) {
            NetworkArchiveRequest.a(param0, param1, -17957);
            this.field_k = ((oi) (this.field_l.sentinel.field_c)).field_g;
            return;
          }
          if (((oi) (param0)).field_g <= param1.field_g) {
            param0 = param0.field_c;
            continue;
          }
          break;
        }
        NetworkArchiveRequest.a(param0, param1, -17957);
        this.field_k = ((oi) (this.field_l.sentinel.field_c)).field_g;
        return;
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_n.beginForward((byte) -78));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_n.nextForward((byte) -77));
        }
    }

    public PcmStreamMixer() {
        this.field_n = new IntrusiveDeque();
        this.field_l = new IntrusiveDeque();
        this.field_m = 0;
        this.field_k = -1;
    }
}
