/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv extends hn {
    private NodeDeque field_r;
    private NodeDeque field_q;
    private int field_o;
    private int field_p;

    final int c() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        bf var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_p < 0) {
            this.e(param0);
            return;
          }
          if (this.field_o + param0 < this.field_p) {
            this.field_o = this.field_o + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_p - this.field_o;
          this.e(var2);
          param0 = param0 - var2;
          this.field_o = this.field_o + var2;
          this.e();
          var3 = (bf) (this.field_q.first((byte) 110));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_k = var5;
              this.a(var3.next, var3);
            } else {
              var3.field_k = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void a(hn param0) {
        this.field_r.addFirst(750, param0);
    }

    private final void a(bf param0) {
        param0.unlink(103);
        param0.a();
        IntrusiveNode var2 = this.field_q.sentinel.next;
        if (var2 == this.field_q.sentinel) {
          this.field_p = -1;
        } else {
          this.field_p = ((bf) (var2)).field_k;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        bf var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_p < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_o + param2 < this.field_p) {
            this.field_o = this.field_o + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_p - this.field_o;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_o = this.field_o + var4;
          this.e();
          var5 = (bf) (this.field_q.first((byte) 127));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_k = var7;
              this.a(var5.next, var5);
            } else {
              var5.field_k = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        hn var4 = (hn) (this.field_r.first((byte) 118));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (hn) (this.field_r.next((byte) 123));
        }
    }

    final hn b() {
        return (hn) (this.field_r.next((byte) 123));
    }

    final hn a() {
        return (hn) (this.field_r.first((byte) 126));
    }

    private final void e(int param0) {
        hn var2 = (hn) (this.field_r.first((byte) 103));
        while (var2 != null) {
          var2.a(param0);
          var2 = (hn) (this.field_r.next((byte) 123));
        }
    }

    private final void e() {
        bf var1 = null;
        if (this.field_o > 0) {
          var1 = (bf) (this.field_q.first((byte) 111));
          while (var1 != null) {
            var1.field_k = var1.field_k - this.field_o;
            var1 = (bf) (this.field_q.next((byte) 123));
          }
          this.field_p = this.field_p - this.field_o;
          this.field_o = 0;
        }
    }

    private final void a(IntrusiveNode param0, bf param1) {
        while (true) {
          if (param0 == this.field_q.sentinel) {
            fj.$cfr$intArgs$a$f94c566f195c(-123, param1, param0);
            this.field_p = ((bf) (this.field_q.sentinel.next)).field_k;
            return;
          }
          if (((bf) (param0)).field_k <= param1.field_k) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        fj.$cfr$intArgs$a$f94c566f195c(-123, param1, param0);
        this.field_p = ((bf) (this.field_q.sentinel.next)).field_k;
        return;
    }

    public uv() {
        this.field_r = new NodeDeque();
        this.field_q = new NodeDeque();
        this.field_o = 0;
        this.field_p = -1;
    }
}
