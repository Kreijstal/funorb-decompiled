/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_s;
    private IntrusiveDeque field_q;
    private int field_p;
    private int field_r;

    private final void insertListener(IntrusiveNode param0, rd param1) {
        while (true) {
          if (param0 == this.field_q.field_e) {
            TextLineLayout.insertAfter(param1, (byte) -119, param0);
            this.field_p = ((rd) (this.field_q.field_e.previous)).field_l;
            return;
          }
          if (((rd) (param0)).field_l <= param1.field_l) {
            param0 = param0.previous;
            continue;
          }
          break;
        }
        TextLineLayout.insertAfter(param1, (byte) -119, param0);
        this.field_p = ((rd) (this.field_q.field_e.previous)).field_l;
        return;
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        rd var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_p < 0) {
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          if (this.field_r + param2 < this.field_p) {
            this.field_r = this.field_r + param2;
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          var4 = this.field_p - this.field_r;
          this.mixSubstreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_r = this.field_r + var4;
          this.e();
          var5 = (rd) (this.field_q.last((byte) 74));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_l = var7;
              this.insertListener(var5.previous, var5);
            } else {
              var5.field_l = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void removeListener(rd param0) {
        param0.unlink((byte) -117);
        param0.a();
        IntrusiveNode var2 = this.field_q.field_e.previous;
        if (var2 == this.field_q.field_e) {
          this.field_p = -1;
        } else {
          this.field_p = ((rd) (var2)).field_l;
        }
    }

    private final void e() {
        rd var1 = null;
        if (this.field_r > 0) {
          var1 = (rd) (this.field_q.last((byte) -83));
          while (var1 != null) {
            var1.field_l = var1.field_l - this.field_r;
            var1 = (rd) (this.field_q.previous((byte) -5));
          }
          this.field_p = this.field_p - this.field_r;
          this.field_r = 0;
        }
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_s.last((byte) 102));
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_s.previous((byte) -5));
    }

    final synchronized void a(PcmStream param0) {
        param0.unlink((byte) -117);
    }

    private final void mixSubstreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_s.last((byte) -90));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (PcmStream) (this.field_s.previous((byte) -5));
        }
    }

    final synchronized void skip(int length) {
        int var2 = 0;
        rd var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_p < 0) {
            this.skipSubstreams(length);
            return;
          }
          if (this.field_r + length < this.field_p) {
            this.field_r = this.field_r + length;
            this.skipSubstreams(length);
            return;
          }
          var2 = this.field_p - this.field_r;
          this.skipSubstreams(var2);
          length = length - var2;
          this.field_r = this.field_r + var2;
          this.e();
          var3 = (rd) (this.field_q.last((byte) -51));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_l = var5;
              this.insertListener(var3.previous, var3);
            } else {
              var3.field_l = 0;
              this.removeListener(var3);
            }
          }
        } while (length != 0);
        return;
    }

    final synchronized void b(PcmStream param0) {
        this.field_s.addLast((byte) -84, param0);
    }

    final int getSchedulingCost() {
        return 0;
    }

    private final void skipSubstreams(int param0) {
        PcmStream var2 = (PcmStream) (this.field_s.last((byte) -30));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_s.previous((byte) -5));
        }
    }

    public PcmStreamMixer() {
        this.field_s = new IntrusiveDeque();
        this.field_q = new IntrusiveDeque();
        this.field_p = -1;
        this.field_r = 0;
    }
}
