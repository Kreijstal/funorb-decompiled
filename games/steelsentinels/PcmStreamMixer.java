/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private NodeDeque field_u;
    private NodeDeque field_s;
    private int field_t;
    private int field_v;

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        w var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_v < 0) {
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          if (this.field_t + param2 < this.field_v) {
            this.field_t = this.field_t + param2;
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          var4 = this.field_v - this.field_t;
          this.mixSubstreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_t = this.field_t + var4;
          this.commitElapsed();
          var5 = (w) (this.field_s.first(13058));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_o = var7;
              this.insertListener(var5.next, var5);
            } else {
              var5.field_o = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void addSubstream(PcmStream param0) {
        this.field_u.addLast(param0, -21459);
    }

    final PcmStream firstSubstream() {
        return (PcmStream) (this.field_u.first(13058));
    }

    private final void removeListener(w param0) {
        param0.unlink(4);
        param0.a();
        IntrusiveNode var2 = this.field_s.sentinel.next;
        if (var2 == this.field_s.sentinel) {
          this.field_v = -1;
        } else {
          this.field_v = ((w) (var2)).field_o;
        }
    }

    final PcmStream nextSubstream() {
        return (PcmStream) (this.field_u.next((byte) -25));
    }

    private final void insertListener(IntrusiveNode param0, w param1) {
        while (true) {
          if (param0 == this.field_s.sentinel) {
            IsaacRandom.insertNodeBefore(param0, 30, param1);
            this.field_v = ((w) (this.field_s.sentinel.next)).field_o;
            return;
          }
          if (((w) (param0)).field_o <= param1.field_o) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        IsaacRandom.insertNodeBefore(param0, 30, param1);
        this.field_v = ((w) (this.field_s.sentinel.next)).field_o;
        return;
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        w var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_v < 0) {
            this.skipSubstreams(param0);
            return;
          }
          if (this.field_t + param0 < this.field_v) {
            this.field_t = this.field_t + param0;
            this.skipSubstreams(param0);
            return;
          }
          var2 = this.field_v - this.field_t;
          this.skipSubstreams(var2);
          param0 = param0 - var2;
          this.field_t = this.field_t + var2;
          this.commitElapsed();
          var3 = (w) (this.field_s.first(13058));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_o = var5;
              this.insertListener(var3.next, var3);
            } else {
              var3.field_o = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void commitElapsed() {
        w var1 = null;
        if (this.field_t > 0) {
          var1 = (w) (this.field_s.first(13058));
          while (var1 != null) {
            var1.field_o = var1.field_o - this.field_t;
            var1 = (w) (this.field_s.next((byte) -75));
          }
          this.field_v = this.field_v - this.field_t;
          this.field_t = 0;
        }
    }

    final int activity() {
        return 0;
    }

    final synchronized void removeSubstream(PcmStream param0) {
        param0.unlink(4);
    }

    private final void skipSubstreams(int param0) {
        PcmStream var2 = (PcmStream) (this.field_u.first(13058));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_u.next((byte) -58));
        }
    }

    private final void mixSubstreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_u.first(13058));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (PcmStream) (this.field_u.next((byte) -29));
        }
    }

    public PcmStreamMixer() {
        this.field_u = new NodeDeque();
        this.field_s = new NodeDeque();
        this.field_t = 0;
        this.field_v = -1;
    }
}
