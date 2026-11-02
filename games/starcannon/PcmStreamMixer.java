/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_k;
    private IntrusiveDeque field_j;
    private int field_m;
    private int field_l;

    final int b() {
        return 0;
    }

    final synchronized void a(PcmStream param0) {
        param0.unlink(4);
    }

    final void a(PcmSample param0, int param1, int param2, int param3) {
        this.a(PcmSampleStream.a(param0, param1, param2), param3);
    }

    private final void d(int param0) {
        PcmStream var2 = (PcmStream) (this.field_k.c(-3905));
        while (var2 != null) {
          var2.a(param0);
          var2 = (PcmStream) (this.field_k.a(-16913));
        }
    }

    private final void a(PcmStream param0, int param1) {
        if (param1 > 0) {
          param0 = (PcmStream) ((Object) eg.a(29723, param1, param0));
        }
        this.b(param0);
    }

    final synchronized void a(oa param0) {
        if (param0.field_g == null) {
          return;
        }
        if (param0.field_g == this) {
          this.e();
          this.c(param0);
          return;
        }
        throw new RuntimeException();
    }

    final void a(PcmSample param0, int param1, int param2) {
        this.b(PcmSampleStream.a(param0, param1, param2));
    }

    final PcmStream c() {
        return (PcmStream) (this.field_k.c(-3905));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        oa var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_l < 0) {
            this.d(param0);
            return;
          }
          if (this.field_m + param0 < this.field_l) {
            this.field_m = this.field_m + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_l - this.field_m;
          this.d(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.e();
          var3 = (oa) (this.field_j.c(-3905));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_f = var5;
              this.a(var3.next, var3);
            } else {
              var3.field_f = 0;
              this.c(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final PcmStream a() {
        return (PcmStream) (this.field_k.a(-16913));
    }

    final synchronized void b(PcmStream param0) {
        this.field_k.a(-97, param0);
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_k.c(-3905));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (PcmStream) (this.field_k.a(-16913));
        }
    }

    final synchronized void b(oa param0) {
        if (param0.field_g == null) {
          this.e();
          param0.field_g = this;
          param0.b();
          this.a(this.field_j.field_c.next, param0);
          return;
        }
        throw new RuntimeException();
    }

    private final void c(oa param0) {
        param0.unlink(4);
        param0.a();
        param0.field_g = null;
        IntrusiveNode var2 = this.field_j.field_c.next;
        if (var2 == this.field_j.field_c) {
          this.field_l = -1;
        } else {
          this.field_l = ((oa) (var2)).field_f;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        oa var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_l < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_l) {
            this.field_m = this.field_m + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_l - this.field_m;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.e();
          var5 = (oa) (this.field_j.c(-3905));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_f = var7;
              this.a(var5.next, var5);
            } else {
              var5.field_f = 0;
              this.c(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void e() {
        oa var1 = null;
        if (this.field_m > 0) {
          var1 = (oa) (this.field_j.c(-3905));
          while (var1 != null) {
            var1.field_f = var1.field_f - this.field_m;
            var1 = (oa) (this.field_j.a(-16913));
          }
          this.field_l = this.field_l - this.field_m;
          this.field_m = 0;
        }
    }

    private final void a(IntrusiveNode param0, oa param1) {
        while (true) {
          if (param0 == this.field_j.field_c) {
            fe.a(param0, param1, false);
            this.field_l = ((oa) (this.field_j.field_c.next)).field_f;
            return;
          }
          if (((oa) (param0)).field_f <= param1.field_f) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        fe.a(param0, param1, false);
        this.field_l = ((oa) (this.field_j.field_c.next)).field_f;
        return;
    }

    public PcmStreamMixer() {
        this.field_k = new IntrusiveDeque();
        this.field_j = new IntrusiveDeque();
        this.field_m = 0;
        this.field_l = -1;
    }
}
