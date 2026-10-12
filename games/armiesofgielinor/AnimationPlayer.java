/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimationPlayer {
    static int chatHistoryCategoryLimit;
    static int pendingJoinRequestCount;
    private int completedLoops;
    private AnimationSequence[] scheduledSequences;
    private int[] scheduledDelays;
    private int scheduledSlot;
    static String field_n;
    boolean frameChanged;
    int frameId;
    static NodeDeque delayedPackets;
    int frameIndex;
    private int ticksRemaining;
    private AnimationSequence sequence;
    static byte[][] field_j;

    public static void b(int param0) {
        field_n = null;
        delayedPackets = null;
        field_j = (byte[][]) null;
        int var1 = 20 % ((param0 + 44) / 51);
    }

    final boolean advance(int obfuscationGuard) {
        int dupTemp$0 = 0;
        int var2;
        this.frameChanged = false;
        if (null == this.scheduledSequences) {
          if (this.sequence == null) {
            return true;
          }
          this.ticksRemaining = this.ticksRemaining - 1;
          if (obfuscationGuard < -72) {
            if (this.ticksRemaining <= 0) {
              return this.advanceFrame((byte) -33);
            }
            return false;
          }
          this.sequence = (AnimationSequence) null;
          if (this.ticksRemaining > 0) {
            return false;
          }
          return this.advanceFrame((byte) -33);
        }
        if (0 > this.scheduledSlot) {
          if (this.sequence == null) {
            return true;
          }
          this.ticksRemaining = this.ticksRemaining - 1;
          if (obfuscationGuard >= -72) {
            this.sequence = (AnimationSequence) null;
          }
          if (this.ticksRemaining <= 0) {
            return this.advanceFrame((byte) -33);
          }
          return false;
        }
        dupTemp$0 = this.scheduledDelays[this.scheduledSlot];
        this.scheduledDelays[this.scheduledSlot] = dupTemp$0 - 1;
        if (0 <= dupTemp$0) {
          if (this.sequence == null) {
            return true;
          }
          this.ticksRemaining = this.ticksRemaining - 1;
          if (obfuscationGuard >= -72) {
            this.sequence = (AnimationSequence) null;
          }
          if (this.ticksRemaining <= 0) {
            return this.advanceFrame((byte) -33);
          }
          return false;
        }
        var2 = this.scheduledSlot;
        this.selectSequence(-1, this.scheduledSequences[this.scheduledSlot]);
        this.scheduledSlot = var2;
        this.scheduledSequences[this.scheduledSlot] = null;
        this.scheduledSlot = this.scheduledSlot + 1;
        if (this.scheduledSequences.length == this.scheduledSlot) {
          this.scheduledSlot = 0;
        }
        if (this.scheduledSequences[this.scheduledSlot] == null) {
          this.scheduledSlot = -1;
        }
        if (this.sequence == null) {
          return true;
        }
        this.ticksRemaining = this.ticksRemaining - 1;
        if (obfuscationGuard >= -72) {
          this.sequence = (AnimationSequence) null;
        }
        if (this.ticksRemaining <= 0) {
          return this.advanceFrame((byte) -33);
        }
        return false;
    }

    private final void resetFrameState(boolean frameChanged) {
        this.frameChanged = frameChanged ? true : false;
        this.frameIndex = 0;
        this.frameId = 0;
        this.completedLoops = 0;
        this.ticksRemaining = 0;
    }

    final ModelMeshBase applyCurrentFrame(boolean copyVariant, boolean obfuscationGuard, boolean frameVariant, ModelMeshBase model) {
        ModelMeshBase var5 = null;
        RuntimeException var5_ref = null;
        ModelMeshBase stackIn_2_0 = null;
        ModelMeshBase stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        boolean stackIn_5_2 = false;
        boolean stackIn_6_3;
        ModelMeshBase stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            stackIn_2_0 = (ModelMeshBase) null;
            return stackIn_2_0;
          }
          stackIn_5_0 = (ModelMeshBase) (model);
          stackIn_5_1 = copyVariant;
          stackIn_5_2 = false;
          stackIn_6_3 = !(frameVariant);
          var5 = ((ModelMeshBase) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_6_3);
          var5.applyAnimationFrame(IntPair.field_q, this.frameId, (AnimationFrameSet) null, -1, 0, 0, frameVariant);
          stackIn_7_0 = var5;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("vj.A(").append(copyVariant).append(',').append(obfuscationGuard).append(',').append(frameVariant).append(',');
          if (model == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean advanceFrame(byte obfuscationGuard) {
        this.frameIndex = this.frameIndex + 1;
        this.frameChanged = true;
        if (this.sequence.frameIds.length <= this.frameIndex) {
          this.completedLoops = this.completedLoops + 1;
          if (!this.sequence.unlimitedLoops &&
            this.sequence.maximumLoops <= this.completedLoops) {
            return true;
          }
          if (0 > this.sequence.loopStartFrame) {
            this.frameIndex = 0;
          } else {
            if (this.sequence.frameIds.length <= this.sequence.loopStartFrame) {
              this.frameIndex = 0;
            } else {
              this.frameIndex = this.sequence.loopStartFrame;
            }
          }
        }
        this.frameId = this.sequence.frameIds[this.frameIndex];
        this.ticksRemaining = this.sequence.frameDurations[this.frameIndex];
        if (obfuscationGuard == -33) {
          return false;
        }
        this.advance(-91);
        return false;
    }

    final void selectSequence(int scheduledSlot, AnimationSequence sequence) {
        try {
          this.resetFrameState(false);
          this.sequence = sequence;
          this.frameId = this.sequence.frameIds[this.frameIndex];
          this.ticksRemaining = this.sequence.frameDurations[this.frameIndex];
          this.scheduledSlot = scheduledSlot;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vj.C(" + scheduledSlot + ',' + (sequence != null ? "{...}" : "null") + ')');
        }
    }

    public AnimationPlayer() {
        this.frameChanged = false;
    }

    AnimationPlayer(int scheduledCapacity) {
        this.frameChanged = false;
        this.scheduledSlot = -1;
        this.scheduledDelays = new int[scheduledCapacity];
        this.scheduledSequences = new AnimationSequence[scheduledCapacity];
    }

    static {
        field_n = "Red_Team";
    }
}
