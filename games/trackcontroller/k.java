/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends PcmStream {
    private IntrusiveDeque field_p;
    private IntrusiveDeque field_o;
    private int field_n;
    private int field_m;

    final synchronized void a(PcmStream param0) {
        this.field_p.addFirst(param0, (byte) 36);
    }

    private final void a(i param0) {
        param0.unlink(-110);
        param0.a();
        IntrusiveNode var2 = this.field_o.field_d.next;
        if (var2 == this.field_o.field_d) {
          this.field_n = -1;
        } else {
          this.field_n = ((i) (var2)).field_i;
        }
    }

    final synchronized void mix(int[] param0, int param1, int param2) {
        int var4 = 0;
        i var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_n < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_n) {
            this.field_m = this.field_m + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_n - this.field_m;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.e();
          var5 = (i) (this.field_o.first(2));
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

    final int c() {
        return 0;
    }

    private final void e() {
        i var1 = null;
        if (this.field_m > 0) {
          var1 = (i) (this.field_o.first(2));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_m;
            var1 = (i) (this.field_o.next(10));
          }
          this.field_n = this.field_n - this.field_m;
          this.field_m = 0;
        }
    }

    private final void e(int param0) {
        PcmStream var2 = (PcmStream) (this.field_p.first(2));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_p.next(10));
        }
    }

    private final void a(IntrusiveNode param0, i param1) {
        while (true) {
          if (param0 == this.field_o.field_d) {
            GameKeyHandler.a(param0, param1, -126);
            this.field_n = ((i) (this.field_o.field_d.next)).field_i;
            return;
          }
          if (((i) (param0)).field_i <= param1.field_i) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        GameKeyHandler.a(param0, param1, -126);
        this.field_n = ((i) (this.field_o.field_d.next)).field_i;
        return;
    }

    final synchronized void skip(int param0) {
        int var2 = 0;
        i var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_n < 0) {
            this.e(param0);
            return;
          }
          if (this.field_m + param0 < this.field_n) {
            this.field_m = this.field_m + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_n - this.field_m;
          this.e(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.e();
          var3 = (i) (this.field_o.first(2));
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

    final synchronized void b(PcmStream param0) {
        param0.unlink(-58);
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_p.first(2));
        while (var4 != null) {
          var4.mixIfActive(param0, param1, param2);
          var4 = (PcmStream) (this.field_p.next(10));
        }
    }

    final PcmStream b() {
        return (PcmStream) (this.field_p.first(2));
    }

    final PcmStream a() {
        return (PcmStream) (this.field_p.next(10));
    }

    public k() {
        this.field_p = new IntrusiveDeque();
        this.field_o = new IntrusiveDeque();
        this.field_m = 0;
        this.field_n = -1;
    }
}
