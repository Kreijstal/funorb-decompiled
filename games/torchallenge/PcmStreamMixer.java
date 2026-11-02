/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_o;
    private IntrusiveDeque field_n;
    private int field_m;
    private int field_p;

    private final void e() {
        PcmScheduledEvent var1 = null;
        if (this.field_p > 0) {
          var1 = (PcmScheduledEvent) (this.field_n.first((byte) 111));
          while (var1 != null) {
            var1.time = var1.time - this.field_p;
            var1 = (PcmScheduledEvent) (this.field_n.next(-270));
          }
          this.field_m = this.field_m - this.field_p;
          this.field_p = 0;
        }
    }

    final int activity() {
        return 0;
    }

    private final void c(int param0) {
        PcmStream var2 = (PcmStream) (this.field_o.first((byte) 110));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_o.next(-270));
        }
    }

    final PcmStream firstSubstream() {
        return (PcmStream) (this.field_o.first((byte) -113));
    }

    private final void a(IntrusiveNode param0, PcmScheduledEvent param1) {
        while (true) {
          if (param0 == this.field_n.sentinel) {
            na.$cfr$intArgs$a$83744e1822f8(52, param0, param1);
            this.field_m = ((PcmScheduledEvent) (this.field_n.sentinel.next)).time;
            return;
          }
          if (((PcmScheduledEvent) (param0)).time <= param1.time) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        na.$cfr$intArgs$a$83744e1822f8(52, param0, param1);
        this.field_m = ((PcmScheduledEvent) (this.field_n.sentinel.next)).time;
        return;
    }

    final PcmStream nextSubstream() {
        return (PcmStream) (this.field_o.next(-270));
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_o.first((byte) 117));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (PcmStream) (this.field_o.next(-270));
        }
    }

    final synchronized void addSubstream(PcmStream param0) {
        this.field_o.addFirst((byte) 113, param0);
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmScheduledEvent var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_m < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_p + param2 < this.field_m) {
            this.field_p = this.field_p + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_m - this.field_p;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_p = this.field_p + var4;
          this.e();
          var5 = (PcmScheduledEvent) (this.field_n.first((byte) 107));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.time = var7;
              this.a(var5.next, var5);
            } else {
              var5.time = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void a(PcmScheduledEvent param0) {
        param0.unlink(true);
        param0.a();
        IntrusiveNode var2 = this.field_n.sentinel.next;
        if (var2 == this.field_n.sentinel) {
          this.field_m = -1;
        } else {
          this.field_m = ((PcmScheduledEvent) (var2)).time;
        }
    }

    final synchronized void skip(int param0) {
        int var2 = 0;
        PcmScheduledEvent var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_m < 0) {
            this.c(param0);
            return;
          }
          if (this.field_p + param0 < this.field_m) {
            this.field_p = this.field_p + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_m - this.field_p;
          this.c(var2);
          param0 = param0 - var2;
          this.field_p = this.field_p + var2;
          this.e();
          var3 = (PcmScheduledEvent) (this.field_n.first((byte) -4));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.time = var5;
              this.a(var3.next, var3);
            } else {
              var3.time = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void b(PcmStream param0) {
        param0.unlink(true);
    }

    public PcmStreamMixer() {
        this.field_o = new IntrusiveDeque();
        this.field_n = new IntrusiveDeque();
        this.field_p = 0;
        this.field_m = -1;
    }
}
