/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends PcmStream {
    private IntrusiveDeque field_m;
    private IntrusiveDeque field_l;
    private int field_j;
    private int field_k;

    private final void a(rk param0) {
        param0.unlink(57);
        param0.a();
        IntrusiveNode var2 = this.field_l.sentinel.field_e;
        if (var2 == this.field_l.sentinel) {
          this.field_k = -1;
        } else {
          this.field_k = ((rk) (var2)).field_f;
        }
    }

    final synchronized void a(PcmStream param0) {
        this.field_m.addFirst(param0, 9);
    }

    private final void e() {
        rk var1 = null;
        if (this.field_j > 0) {
          var1 = (rk) (this.field_l.beginForward((byte) -68));
          while (var1 != null) {
            var1.field_f = var1.field_f - this.field_j;
            var1 = (rk) (this.field_l.nextForward(853));
          }
          this.field_k = this.field_k - this.field_j;
          this.field_j = 0;
        }
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        rk var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_k < 0) {
            this.d(param0);
            return;
          }
          if (this.field_j + param0 < this.field_k) {
            this.field_j = this.field_j + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_k - this.field_j;
          this.d(var2);
          param0 = param0 - var2;
          this.field_j = this.field_j + var2;
          this.e();
          var3 = (rk) (this.field_l.beginForward((byte) 114));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_f = var5;
              this.a(var3.field_e, var3);
            } else {
              var3.field_f = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_m.beginForward((byte) 120));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_m.nextForward(853));
        }
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_m.nextForward(853));
    }

    private final void a(IntrusiveNode param0, rk param1) {
        while (true) {
          if (param0 == this.field_l.sentinel) {
            vk.$cfr$intArgs$a$0b89e0d19fbb(param1, -65, param0);
            this.field_k = ((rk) (this.field_l.sentinel.field_e)).field_f;
            return;
          }
          if (((rk) (param0)).field_f <= param1.field_f) {
            param0 = param0.field_e;
            continue;
          }
          break;
        }
        vk.$cfr$intArgs$a$0b89e0d19fbb(param1, -65, param0);
        this.field_k = ((rk) (this.field_l.sentinel.field_e)).field_f;
        return;
    }

    final int getSchedulingCost() {
        return 0;
    }

    private final void d(int param0) {
        PcmStream var2 = (PcmStream) (this.field_m.beginForward((byte) 118));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_m.nextForward(853));
        }
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        rk var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_k < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_j + param2 < this.field_k) {
            this.field_j = this.field_j + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_k - this.field_j;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_j = this.field_j + var4;
          this.e();
          var5 = (rk) (this.field_l.beginForward((byte) 126));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_f = var7;
              this.a(var5.field_e, var5);
            } else {
              var5.field_f = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_m.beginForward((byte) 127));
    }

    public v() {
        this.field_m = new IntrusiveDeque();
        this.field_l = new IntrusiveDeque();
        this.field_j = 0;
        this.field_k = -1;
    }
}
