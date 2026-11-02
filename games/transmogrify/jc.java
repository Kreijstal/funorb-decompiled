/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends PcmStream {
    private IntrusiveDeque field_n;
    private IntrusiveDeque field_m;
    private int field_l;
    private int field_k;

    private final void a(gi param0) {
        param0.c(5);
        param0.a();
        IntrusiveNode var2 = this.field_m.field_d.next;
        if (var2 == this.field_m.field_d) {
          this.field_k = -1;
        } else {
          this.field_k = ((gi) (var2)).field_g;
        }
    }

    private final void e() {
        gi var1 = null;
        if (this.field_l > 0) {
          var1 = (gi) (this.field_m.a((byte) -95));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_l;
            var1 = (gi) (this.field_m.a(true));
          }
          this.field_k = this.field_k - this.field_l;
          this.field_l = 0;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_n.a((byte) -95));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (PcmStream) (this.field_n.a(true));
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        gi var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_k < 0) {
            this.e(param0);
            return;
          }
          if (this.field_l + param0 < this.field_k) {
            this.field_l = this.field_l + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_k - this.field_l;
          this.e(var2);
          param0 = param0 - var2;
          this.field_l = this.field_l + var2;
          this.e();
          var3 = (gi) (this.field_m.a((byte) -95));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.a(var3.next, var3);
            } else {
              var3.field_g = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void a(IntrusiveNode param0, gi param1) {
        while (true) {
          if (param0 == this.field_m.field_d) {
            td.a(param0, (byte) 125, param1);
            this.field_k = ((gi) (this.field_m.field_d.next)).field_g;
            return;
          }
          if (((gi) (param0)).field_g <= param1.field_g) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        td.a(param0, (byte) 125, param1);
        this.field_k = ((gi) (this.field_m.field_d.next)).field_g;
        return;
    }

    final PcmStream d() {
        return (PcmStream) (this.field_n.a((byte) -95));
    }

    final synchronized void a(PcmStream param0) {
        this.field_n.a((IntrusiveNode) (param0), (byte) 33);
    }

    private final void e(int param0) {
        PcmStream var2 = (PcmStream) (this.field_n.a((byte) -95));
        while (var2 != null) {
          var2.d(param0);
          var2 = (PcmStream) (this.field_n.a(true));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        gi var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_k < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_l + param2 < this.field_k) {
            this.field_l = this.field_l + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_k - this.field_l;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_l = this.field_l + var4;
          this.e();
          var5 = (gi) (this.field_m.a((byte) -95));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.a(var5.next, var5);
            } else {
              var5.field_g = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final PcmStream a() {
        return (PcmStream) (this.field_n.a(true));
    }

    final int b() {
        return 0;
    }

    public jc() {
        this.field_n = new IntrusiveDeque();
        this.field_m = new IntrusiveDeque();
        this.field_l = 0;
        this.field_k = -1;
    }
}
