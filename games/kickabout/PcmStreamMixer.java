/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_k;
    private IntrusiveDeque field_i;
    private int field_j;
    private int field_l;

    final PcmStream nextSubstream() {
        return (PcmStream) (this.field_k.c(33));
    }

    private final void skipChildStreams(int param0) {
        PcmStream var2 = (PcmStream) (this.field_k.g(24009));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_k.c(33));
        }
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_l < 0) {
            this.skipChildStreams(param0);
            return;
          }
          if (this.field_j + param0 < this.field_l) {
            this.field_j = this.field_j + param0;
            this.skipChildStreams(param0);
            return;
          }
          var2 = this.field_l - this.field_j;
          this.skipChildStreams(var2);
          param0 = param0 - var2;
          this.field_j = this.field_j + var2;
          this.normalizeListenerOffsets();
          var3 = (PcmMixerListener) (this.field_i.g(24009));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onTimer(this);
            if (var5 >= 0) {
              var3.frameOffset = var5;
              this.insertListenerByFrameOffset(var3.field_d, var3);
            } else {
              var3.frameOffset = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_k.g(24009));
        while (var4 != null) {
          var4.processFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_k.c(33));
        }
    }

    private final void removeListener(PcmMixerListener param0) {
        param0.c((byte) -109);
        param0.onRemoved();
        IntrusiveNode var2 = this.field_i.field_c.field_d;
        if (var2 == this.field_i.field_c) {
          this.field_l = -1;
        } else {
          this.field_l = ((PcmMixerListener) (var2)).frameOffset;
        }
    }

    final synchronized void removeSubstream(PcmStream param0) {
        param0.c((byte) -109);
    }

    private final void insertListenerByFrameOffset(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_i.field_c) {
            ug.a(param0, 16737894, param1);
            this.field_l = ((PcmMixerListener) (this.field_i.field_c.field_d)).frameOffset;
            return;
          }
          if (((PcmMixerListener) (param0)).frameOffset <= param1.frameOffset) {
            param0 = param0.field_d;
            continue;
          }
          break;
        }
        ug.a(param0, 16737894, param1);
        this.field_l = ((PcmMixerListener) (this.field_i.field_c.field_d)).frameOffset;
        return;
    }

    private final void normalizeListenerOffsets() {
        PcmMixerListener var1 = null;
        if (this.field_j > 0) {
          var1 = (PcmMixerListener) (this.field_i.g(24009));
          while (var1 != null) {
            var1.frameOffset = var1.frameOffset - this.field_j;
            var1 = (PcmMixerListener) (this.field_i.c(33));
          }
          this.field_l = this.field_l - this.field_j;
          this.field_j = 0;
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final PcmStream firstSubstream() {
        return (PcmStream) (this.field_k.g(24009));
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_l < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_j + param2 < this.field_l) {
            this.field_j = this.field_j + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_l - this.field_j;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_j = this.field_j + var4;
          this.normalizeListenerOffsets();
          var5 = (PcmMixerListener) (this.field_i.g(24009));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onTimer(this);
            if (var7 >= 0) {
              var5.frameOffset = var7;
              this.insertListenerByFrameOffset(var5.field_d, var5);
            } else {
              var5.frameOffset = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void addSubStream(PcmStream param0) {
        this.field_k.a(0, param0);
    }

    public PcmStreamMixer() {
        this.field_k = new IntrusiveDeque();
        this.field_i = new IntrusiveDeque();
        this.field_j = 0;
        this.field_l = -1;
    }
}
