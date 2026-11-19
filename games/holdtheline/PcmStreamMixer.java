/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_m;
    private IntrusiveDeque field_o;
    private int field_p;
    private int field_n;

    private final void a(PcmMixerListener param0) {
        param0.unlink(0);
        param0.a();
        IntrusiveNode var2 = this.field_o.sentinel.next;
        if (var2 == this.field_o.sentinel) {
          this.field_p = -1;
        } else {
          this.field_p = ((PcmMixerListener) (var2)).field_i;
        }
    }

    private final void e(int param0) {
        PcmStream var2 = (PcmStream) (this.field_m.first((byte) 114));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_m.next((byte) 90));
        }
    }

    final PcmStream firstSubStream() {
        return (PcmStream) (this.field_m.first((byte) 118));
    }

    final synchronized void b(PcmStream param0) {
        param0.unlink(0);
    }

    final synchronized void skip(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_p < 0) {
            this.e(param0);
            return;
          }
          if (this.field_n + param0 < this.field_p) {
            this.field_n = this.field_n + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_p - this.field_n;
          this.e(var2);
          param0 = param0 - var2;
          this.field_n = this.field_n + var2;
          this.e();
          var3 = (PcmMixerListener) (this.field_o.first((byte) 119));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_i = var5;
              this.a(var3.next, var3);
            } else {
              var3.field_i = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void mix(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_p < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_n + param2 < this.field_p) {
            this.field_n = this.field_n + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_p - this.field_n;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_n = this.field_n + var4;
          this.e();
          var5 = (PcmMixerListener) (this.field_o.first((byte) 91));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_i = var7;
              this.a(var5.next, var5);
            } else {
              var5.field_i = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void a(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_o.sentinel) {
            IntrusiveDeque.insertBefore(param0, 0, param1);
            this.field_p = ((PcmMixerListener) (this.field_o.sentinel.next)).field_i;
            return;
          }
          if (((PcmMixerListener) (param0)).field_i <= param1.field_i) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        IntrusiveDeque.insertBefore(param0, 0, param1);
        this.field_p = ((PcmMixerListener) (this.field_o.sentinel.next)).field_i;
        return;
    }

    private final void e() {
        PcmMixerListener var1 = null;
        if (this.field_n > 0) {
          var1 = (PcmMixerListener) (this.field_o.first((byte) 86));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_n;
            var1 = (PcmMixerListener) (this.field_o.next((byte) -52));
          }
          this.field_p = this.field_p - this.field_n;
          this.field_n = 0;
        }
    }

    final PcmStream nextSubStream() {
        return (PcmStream) (this.field_m.next((byte) -114));
    }

    final synchronized void a(PcmStream param0) {
        this.field_m.addFirst(param0, false);
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_m.first((byte) 115));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (PcmStream) (this.field_m.next((byte) 120));
        }
    }

    final int getActivityWeight() {
        return 0;
    }

    public PcmStreamMixer() {
        this.field_m = new IntrusiveDeque();
        this.field_o = new IntrusiveDeque();
        this.field_n = 0;
        this.field_p = -1;
    }
}
