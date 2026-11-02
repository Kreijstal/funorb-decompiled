/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends PcmStream {
    private jc field_o;
    private jc field_q;
    private int field_n;
    private int field_p;

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_o.g(-18110));
        while (var4 != null) {
          var4.mixOrSkip(param0, param1, param2);
          var4 = (PcmStream) (this.field_o.a((byte) -114));
        }
    }

    final PcmStream a() {
        return (PcmStream) (this.field_o.g(-18110));
    }

    private final void a(pl param0) {
        param0.unlink(-2193);
        param0.a();
        IntrusiveNode var2 = this.field_q.field_a.previous;
        if (var2 == this.field_q.field_a) {
          this.field_p = -1;
        } else {
          this.field_p = ((pl) (var2)).field_j;
        }
    }

    final PcmStream b() {
        return (PcmStream) (this.field_o.a((byte) -106));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        pl var5 = null;
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
          var5 = (pl) (this.field_q.g(-18110));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_j = var7;
              this.a(var5.previous, var5);
            } else {
              var5.field_j = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final int d() {
        return 0;
    }

    final synchronized void skip(int sampleCount) {
        int var2 = 0;
        pl var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_p < 0) {
            this.d(sampleCount);
            return;
          }
          if (this.field_n + sampleCount < this.field_p) {
            this.field_n = this.field_n + sampleCount;
            this.d(sampleCount);
            return;
          }
          var2 = this.field_p - this.field_n;
          this.d(var2);
          sampleCount = sampleCount - var2;
          this.field_n = this.field_n + var2;
          this.e();
          var3 = (pl) (this.field_q.g(-18110));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_j = var5;
              this.a(var3.previous, var3);
            } else {
              var3.field_j = 0;
              this.a(var3);
            }
          }
        } while (sampleCount != 0);
        return;
    }

    private final void e() {
        pl var1 = null;
        if (this.field_n > 0) {
          var1 = (pl) (this.field_q.g(-18110));
          while (var1 != null) {
            var1.field_j = var1.field_j - this.field_n;
            var1 = (pl) (this.field_q.a((byte) -116));
          }
          this.field_p = this.field_p - this.field_n;
          this.field_n = 0;
        }
    }

    private final void a(IntrusiveNode param0, pl param1) {
        while (true) {
          if (param0 == this.field_q.field_a) {
            he.a(param1, param0, true);
            this.field_p = ((pl) (this.field_q.field_a.previous)).field_j;
            return;
          }
          if (((pl) (param0)).field_j <= param1.field_j) {
            param0 = param0.previous;
            continue;
          }
          break;
        }
        he.a(param1, param0, true);
        this.field_p = ((pl) (this.field_q.field_a.previous)).field_j;
        return;
    }

    final synchronized void a(PcmStream param0) {
        this.field_o.a(param0, 69);
    }

    private final void d(int param0) {
        PcmStream var2 = (PcmStream) (this.field_o.g(-18110));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_o.a((byte) -127));
        }
    }

    public lb() {
        this.field_o = new jc();
        this.field_q = new jc();
        this.field_n = 0;
        this.field_p = -1;
    }
}
