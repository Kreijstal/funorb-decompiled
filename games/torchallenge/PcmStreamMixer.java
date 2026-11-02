/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_o;
    private IntrusiveDeque field_n;
    private int field_m;
    private int field_p;

    private final void e() {
        jb var1 = null;
        if (this.field_p > 0) {
          var1 = (jb) (this.field_n.first((byte) 111));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_p;
            var1 = (jb) (this.field_n.next(-270));
          }
          this.field_m = this.field_m - this.field_p;
          this.field_p = 0;
        }
    }

    final int a() {
        return 0;
    }

    private final void c(int param0) {
        PcmStream var2 = (PcmStream) (this.field_o.first((byte) 110));
        while (var2 != null) {
          var2.a(param0);
          var2 = (PcmStream) (this.field_o.next(-270));
        }
    }

    final PcmStream c() {
        return (PcmStream) (this.field_o.first((byte) -113));
    }

    private final void a(IntrusiveNode param0, jb param1) {
        while (true) {
          if (param0 == this.field_n.sentinel) {
            na.$cfr$intArgs$a$83744e1822f8(52, param0, param1);
            this.field_m = ((jb) (this.field_n.sentinel.next)).field_i;
            return;
          }
          if (((jb) (param0)).field_i <= param1.field_i) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        na.$cfr$intArgs$a$83744e1822f8(52, param0, param1);
        this.field_m = ((jb) (this.field_n.sentinel.next)).field_i;
        return;
    }

    final PcmStream b() {
        return (PcmStream) (this.field_o.next(-270));
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_o.first((byte) 117));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (PcmStream) (this.field_o.next(-270));
        }
    }

    final synchronized void a(PcmStream param0) {
        this.field_o.a((byte) 113, param0);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        jb var5 = null;
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
          var5 = (jb) (this.field_n.first((byte) 107));
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

    private final void a(jb param0) {
        param0.unlink(true);
        param0.a();
        IntrusiveNode var2 = this.field_n.sentinel.next;
        if (var2 == this.field_n.sentinel) {
          this.field_m = -1;
        } else {
          this.field_m = ((jb) (var2)).field_i;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        jb var3 = null;
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
          var3 = (jb) (this.field_n.first((byte) -4));
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
        param0.unlink(true);
    }

    public PcmStreamMixer() {
        this.field_o = new IntrusiveDeque();
        this.field_n = new IntrusiveDeque();
        this.field_p = 0;
        this.field_m = -1;
    }
}
