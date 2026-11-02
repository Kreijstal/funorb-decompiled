/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_l;
    private IntrusiveDeque field_o;
    private int field_m;
    private int field_n;

    final PcmStream b() {
        return (PcmStream) (this.field_l.startForward(0));
    }

    private final void e() {
        PcmMixerListener var1 = null;
        if (this.field_n > 0) {
          var1 = (PcmMixerListener) (this.field_o.startForward(0));
          while (var1 != null) {
            var1.field_h = var1.field_h - this.field_n;
            var1 = (PcmMixerListener) (this.field_o.nextForward((byte) -71));
          }
          this.field_m = this.field_m - this.field_n;
          this.field_n = 0;
        }
    }

    final int a() {
        return 0;
    }

    private final void a(PcmMixerListener param0) {
        param0.unlink((byte) -122);
        param0.a();
        IntrusiveNode var2 = this.field_o.field_h.next;
        if (var2 == this.field_o.field_h) {
          this.field_m = -1;
        } else {
          this.field_m = ((PcmMixerListener) (var2)).field_h;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_m < 0) {
            this.d(param0);
            return;
          }
          if (this.field_n + param0 < this.field_m) {
            this.field_n = this.field_n + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_m - this.field_n;
          this.d(var2);
          param0 = param0 - var2;
          this.field_n = this.field_n + var2;
          this.e();
          var3 = (PcmMixerListener) (this.field_o.startForward(0));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_h = var5;
              this.a(var3.next, var3);
            } else {
              var3.field_h = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void a(PcmStream param0) {
        this.field_l.addFirst(param0, 0);
    }

    final PcmStream d() {
        return (PcmStream) (this.field_l.nextForward((byte) -71));
    }

    private final void a(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_o.field_h) {
            wp.$cfr$intArgs$a$2661ebe01e52(-128, param1, param0);
            this.field_m = ((PcmMixerListener) (this.field_o.field_h.next)).field_h;
            return;
          }
          if (((PcmMixerListener) (param0)).field_h <= param1.field_h) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        wp.$cfr$intArgs$a$2661ebe01e52(-128, param1, param0);
        this.field_m = ((PcmMixerListener) (this.field_o.field_h.next)).field_h;
        return;
    }

    private final void d(int param0) {
        PcmStream var2 = (PcmStream) (this.field_l.startForward(0));
        while (var2 != null) {
          var2.a(param0);
          var2 = (PcmStream) (this.field_l.nextForward((byte) -71));
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_l.startForward(0));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (PcmStream) (this.field_l.nextForward((byte) -71));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_m < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_n + param2 < this.field_m) {
            this.field_n = this.field_n + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_m - this.field_n;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_n = this.field_n + var4;
          this.e();
          var5 = (PcmMixerListener) (this.field_o.startForward(0));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_h = var7;
              this.a(var5.next, var5);
            } else {
              var5.field_h = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    public PcmStreamMixer() {
        this.field_l = new IntrusiveDeque();
        this.field_o = new IntrusiveDeque();
        this.field_m = -1;
        this.field_n = 0;
    }
}
