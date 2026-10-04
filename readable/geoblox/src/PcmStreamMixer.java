/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_m;
    private IntrusiveDeque field_j;
    private int field_k;
    private int field_l;

    private final void a(PcmMixerListener param0) {
        param0.unlinkNode(false);
        param0.a();
        IntrusiveNode var2 = this.field_j.sentinel.nextNode;
        if (var2 == this.field_j.sentinel) {
            this.field_k = -1;
        } else {
            this.field_k = ((PcmMixerListener) ((Object) var2)).field_f;
        }
    }

    final PcmStream c() {
        return (PcmStream) ((Object) this.field_m.nextForIteration(1));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        while (true) {
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
          var5 = (PcmMixerListener) ((Object) this.field_j.firstForIteration(0));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a((PcmStreamMixer) (this));
            if (var7 >= 0) {
              var5.field_f = var7;
              this.a(var5.nextNode, var5);
            } else {
              var5.field_f = 0;
              this.a(var5);
            }
          }
          if (param2 != 0) {
            continue;
          }
          return;
        }
    }

    private final void a(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_j.sentinel) {
            PointerInputListener.insertNodeBefore(param0, 93, param1);
            this.field_k = ((PcmMixerListener) ((Object) this.field_j.sentinel.nextNode)).field_f;
            return;
          }
          if (((PcmMixerListener) ((Object) param0)).field_f <= param1.field_f) {
            param0 = param0.nextNode;
            continue;
          }
          PointerInputListener.insertNodeBefore(param0, 93, param1);
          this.field_k = ((PcmMixerListener) ((Object) this.field_j.sentinel.nextNode)).field_f;
          return;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) ((Object) this.field_m.firstForIteration(0));
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (PcmStream) ((Object) this.field_m.nextForIteration(1));
        }
    }

    final int d() {
        return 0;
    }

    final synchronized void b(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        while (true) {
          if (this.field_k < 0) {
            this.c(param0);
            return;
          }
          if (this.field_l + param0 < this.field_k) {
            this.field_l = this.field_l + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_k - this.field_l;
          this.c(var2);
          param0 = param0 - var2;
          this.field_l = this.field_l + var2;
          this.e();
          var3 = (PcmMixerListener) ((Object) this.field_j.firstForIteration(0));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a((PcmStreamMixer) (this));
            if (var5 >= 0) {
              var3.field_f = var5;
              this.a(var3.nextNode, var3);
            } else {
              var3.field_f = 0;
              this.a(var3);
            }
          }
          if (param0 != 0) {
            continue;
          }
          return;
        }
    }

    private final void e() {
        PcmMixerListener var1 = null;
        if (this.field_l > 0) {
            var1 = (PcmMixerListener) ((Object) this.field_j.firstForIteration(0));
            while (var1 != null) {
                var1.field_f = var1.field_f - this.field_l;
                var1 = (PcmMixerListener) ((Object) this.field_j.nextForIteration(1));
            }
            this.field_k = this.field_k - this.field_l;
            this.field_l = 0;
        }
    }

    final PcmStream b() {
        return (PcmStream) ((Object) this.field_m.firstForIteration(0));
    }

    private final void c(int param0) {
        PcmStream var2 = (PcmStream) ((Object) this.field_m.firstForIteration(0));
        while (var2 != null) {
            var2.b(param0);
            var2 = (PcmStream) ((Object) this.field_m.nextForIteration(1));
        }
    }

    final synchronized void a(PcmStream param0) {
        this.field_m.addFirst(param0, false);
    }

    public PcmStreamMixer() {
        this.field_m = new IntrusiveDeque();
        this.field_j = new IntrusiveDeque();
        this.field_k = -1;
        this.field_l = 0;
    }
}
