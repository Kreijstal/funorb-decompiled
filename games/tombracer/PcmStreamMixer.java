/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_l;
    private IntrusiveDeque field_m;
    private int field_k;
    private int field_j;

    private final void b(int param0) {
        PcmStream var2 = (PcmStream) (this.field_l.first(-80));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_l.next(122));
        }
    }

    private final void normalizeListenerFrameOffsets() {
        jva var1 = null;
        if (this.field_k > 0) {
          var1 = (jva) (this.field_m.first(-80));
          while (var1 != null) {
            var1.field_f = var1.field_f - this.field_k;
            var1 = (jva) (this.field_m.next(119));
          }
          this.field_j = this.field_j - this.field_k;
          this.field_k = 0;
        }
    }

    private final void insertListener(IntrusiveNode param0, jva param1) {
        while (true) {
          if (param0 == this.field_m.sentinel) {
            PlatformComponent.a(param0, param1, (byte) -102);
            this.field_j = ((jva) (this.field_m.sentinel.next)).field_f;
            return;
          }
          if (((jva) (param0)).field_f <= param1.field_f) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        PlatformComponent.a(param0, param1, (byte) -102);
        this.field_j = ((jva) (this.field_m.sentinel.next)).field_f;
        return;
    }

    final PcmStream nextSubStream() {
        return (PcmStream) (this.field_l.next(126));
    }

    final synchronized void fill(int[] param0, int param1, int param2) {
        int var4 = 0;
        jva var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_j < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_k + param2 < this.field_j) {
            this.field_k = this.field_k + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_j - this.field_k;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_k = this.field_k + var4;
          this.normalizeListenerFrameOffsets();
          var5 = (jva) (this.field_m.first(-80));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_f = var7;
              this.insertListener(var5.next, var5);
            } else {
              var5.field_f = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final int a() {
        return 0;
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_l.first(-80));
        while (var4 != null) {
          var4.fillOrSkip(param0, param1, param2);
          var4 = (PcmStream) (this.field_l.next(119));
        }
    }

    final synchronized void b(PcmStream param0) {
        param0.unlink(80);
    }

    final synchronized void skip(int param0) {
        int var2 = 0;
        jva var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_j < 0) {
            this.b(param0);
            return;
          }
          if (this.field_k + param0 < this.field_j) {
            this.field_k = this.field_k + param0;
            this.b(param0);
            return;
          }
          var2 = this.field_j - this.field_k;
          this.b(var2);
          param0 = param0 - var2;
          this.field_k = this.field_k + var2;
          this.normalizeListenerFrameOffsets();
          var3 = (jva) (this.field_m.first(-80));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_f = var5;
              this.insertListener(var3.next, var3);
            } else {
              var3.field_f = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void removeListener(jva param0) {
        param0.unlink(54);
        param0.a();
        IntrusiveNode var2 = this.field_m.sentinel.next;
        if (var2 == this.field_m.sentinel) {
          this.field_j = -1;
        } else {
          this.field_j = ((jva) (var2)).field_f;
        }
    }

    final synchronized void a(PcmStream param0) {
        this.field_l.addFirst((byte) 110, (IntrusiveNode) (param0));
    }

    final PcmStream firstSubStream() {
        return (PcmStream) (this.field_l.first(-80));
    }

    public PcmStreamMixer() {
        this.field_l = new IntrusiveDeque();
        this.field_m = new IntrusiveDeque();
        this.field_j = -1;
        this.field_k = 0;
    }
}
