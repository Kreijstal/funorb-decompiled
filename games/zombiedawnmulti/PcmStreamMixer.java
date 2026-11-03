/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_l;
    private IntrusiveDeque field_k;
    private int field_j;
    private int field_m;

    final synchronized void skip(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_m < 0) {
            this.c(param0);
            return;
          }
          if (this.field_j + param0 < this.field_m) {
            this.field_j = this.field_j + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_m - this.field_j;
          this.c(var2);
          param0 = param0 - var2;
          this.field_j = this.field_j + var2;
          this.e();
          var3 = (PcmMixerListener) (this.field_k.c(126));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_f = var5;
              this.a(var3.previous, var3);
            } else {
              var3.field_f = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void a(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_k.sentinel) {
            vc.a(param0, param1, true);
            this.field_m = ((PcmMixerListener) (this.field_k.sentinel.previous)).field_f;
            return;
          }
          if (((PcmMixerListener) (param0)).field_f <= param1.field_f) {
            param0 = param0.previous;
            continue;
          }
          break;
        }
        vc.a(param0, param1, true);
        this.field_m = ((PcmMixerListener) (this.field_k.sentinel.previous)).field_f;
        return;
    }

    final PcmStream d() {
        return (PcmStream) (this.field_l.b(6));
    }

    private final void a(PcmMixerListener param0) {
        param0.unlink(true);
        param0.a();
        IntrusiveNode var2 = this.field_k.sentinel.previous;
        if (var2 == this.field_k.sentinel) {
          this.field_m = -1;
        } else {
          this.field_m = ((PcmMixerListener) (var2)).field_f;
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void b(PcmStream param0) {
        this.field_l.a(-25612, param0);
    }

    final PcmStream firstSubStream() {
        return (PcmStream) (this.field_l.c(44));
    }

    final synchronized void a(PcmStream param0) {
        param0.unlink(true);
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
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
          if (this.field_j + param2 < this.field_m) {
            this.field_j = this.field_j + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_m - this.field_j;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_j = this.field_j + var4;
          this.e();
          var5 = (PcmMixerListener) (this.field_k.c(84));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_f = var7;
              this.a(var5.previous, var5);
            } else {
              var5.field_f = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void e() {
        PcmMixerListener var1 = null;
        if (this.field_j > 0) {
          var1 = (PcmMixerListener) (this.field_k.c(39));
          while (var1 != null) {
            var1.field_f = var1.field_f - this.field_j;
            var1 = (PcmMixerListener) (this.field_k.b(6));
          }
          this.field_m = this.field_m - this.field_j;
          this.field_j = 0;
        }
    }

    private final void c(int param0) {
        PcmStream var2 = (PcmStream) (this.field_l.c(67));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_l.b(6));
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_l.c(97));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (PcmStream) (this.field_l.b(6));
        }
    }

    public PcmStreamMixer() {
        this.field_l = new IntrusiveDeque();
        this.field_k = new IntrusiveDeque();
        this.field_j = 0;
        this.field_m = -1;
    }
}
