/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends wf {
    private bc field_n;
    private bc field_l;
    private int field_m;
    private int field_k;

    private final void d(int param0) {
        wf var2 = (wf) (this.field_n.a((byte) -83));
        while (var2 != null) {
          var2.a(param0);
          var2 = (wf) (this.field_n.d((byte) -102));
        }
    }

    final wf d() {
        return (wf) (this.field_n.a((byte) -99));
    }

    private final void e() {
        oi var1 = null;
        if (this.field_m > 0) {
          var1 = (oi) (this.field_l.a((byte) -50));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_m;
            var1 = (oi) (this.field_l.d((byte) -94));
          }
          this.field_k = this.field_k - this.field_m;
          this.field_m = 0;
        }
    }

    final wf c() {
        return (wf) (this.field_n.d((byte) -60));
    }

    final int b() {
        return 0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        oi var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_k < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_k) {
            this.field_m = this.field_m + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_k - this.field_m;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.e();
          var5 = (oi) (this.field_l.a((byte) -117));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.a(var5.field_c, var5);
            } else {
              var5.field_g = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void a(wf param0) {
        this.field_n.a((byte) 83, (ai) (param0));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        oi var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_k < 0) {
            this.d(param0);
            return;
          }
          if (this.field_m + param0 < this.field_k) {
            this.field_m = this.field_m + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_k - this.field_m;
          this.d(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.e();
          var3 = (oi) (this.field_l.a((byte) -84));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.a(var3.field_c, var3);
            } else {
              var3.field_g = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final void a(ue param0, int param1, int param2) {
        this.a(pi.a(param0, param1, param2));
    }

    private final void a(oi param0) {
        param0.c(2);
        param0.a();
        ai var2 = this.field_l.field_b.field_c;
        if (var2 == this.field_l.field_b) {
          this.field_k = -1;
        } else {
          this.field_k = ((oi) (var2)).field_g;
        }
    }

    private final void a(ai param0, oi param1) {
        while (true) {
          if (param0 == this.field_l.field_b) {
            lf.a(param0, param1, -17957);
            this.field_k = ((oi) (this.field_l.field_b.field_c)).field_g;
            return;
          }
          if (((oi) (param0)).field_g <= param1.field_g) {
            param0 = param0.field_c;
            continue;
          }
          break;
        }
        lf.a(param0, param1, -17957);
        this.field_k = ((oi) (this.field_l.field_b.field_c)).field_g;
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        wf var4 = (wf) (this.field_n.a((byte) -78));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (wf) (this.field_n.d((byte) -77));
        }
    }

    public rb() {
        this.field_n = new bc();
        this.field_l = new bc();
        this.field_m = 0;
        this.field_k = -1;
    }
}
