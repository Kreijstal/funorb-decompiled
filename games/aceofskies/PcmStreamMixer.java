/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_k;
    private IntrusiveDeque field_j;
    private int field_l;
    private int field_i;

    private final void a(va param0) {
        param0.unlink(-126);
        param0.a();
        IntrusiveNode var2 = this.field_j.sentinel.next;
        if (var2 == this.field_j.sentinel) {
          this.field_i = -1;
        } else {
          this.field_i = ((va) (var2)).field_e;
        }
    }

    private final void a(IntrusiveNode param0, va param1) {
        while (true) {
          if (param0 == this.field_j.sentinel) {
            ml.$cfr$intArgs$a$9910ad98b3f5(-20, param0, param1);
            this.field_i = ((va) (this.field_j.sentinel.next)).field_e;
            return;
          }
          if (((va) (param0)).field_e <= param1.field_e) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        ml.$cfr$intArgs$a$9910ad98b3f5(-20, param0, param1);
        this.field_i = ((va) (this.field_j.sentinel.next)).field_e;
        return;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        va var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_i < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_l + param2 < this.field_i) {
            this.field_l = this.field_l + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_i - this.field_l;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_l = this.field_l + var4;
          this.e();
          var5 = (va) (this.field_j.first(268435455));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_e = var7;
              this.a(var5.next, var5);
            } else {
              var5.field_e = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void e() {
        va var1 = null;
        if (this.field_l > 0) {
          var1 = (va) (this.field_j.first(268435455));
          while (var1 != null) {
            var1.field_e = var1.field_e - this.field_l;
            var1 = (va) (this.field_j.next((byte) 103));
          }
          this.field_i = this.field_i - this.field_l;
          this.field_l = 0;
        }
    }

    final synchronized void addSubstream(PcmStream stream) {
        this.field_k.addFirst(stream, 25611);
    }

    private final void d(int param0) {
        PcmStream var2 = (PcmStream) (this.field_k.first(268435455));
        while (var2 != null) {
          var2.a(param0);
          var2 = (PcmStream) (this.field_k.next((byte) 103));
        }
    }

    final PcmStream a() {
        return (PcmStream) (this.field_k.next((byte) 103));
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_k.first(268435455));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (PcmStream) (this.field_k.next((byte) 103));
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        va var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_i < 0) {
            this.d(param0);
            return;
          }
          if (this.field_l + param0 < this.field_i) {
            this.field_l = this.field_l + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_i - this.field_l;
          this.d(var2);
          param0 = param0 - var2;
          this.field_l = this.field_l + var2;
          this.e();
          var3 = (va) (this.field_j.first(268435455));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_e = var5;
              this.a(var3.next, var3);
            } else {
              var3.field_e = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void removeSubstream(PcmStream stream) {
        stream.unlink(-126);
    }

    final PcmStream b() {
        return (PcmStream) (this.field_k.first(268435455));
    }

    final int d() {
        return 0;
    }

    public PcmStreamMixer() {
        this.field_k = new IntrusiveDeque();
        this.field_j = new IntrusiveDeque();
        this.field_i = -1;
        this.field_l = 0;
    }
}
