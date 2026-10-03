/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntList {
    static IntrusiveDeque field_g;
    private boolean multiplicativeGrowth;
    private int lastIndex;
    private int[] values;
    static String fullscreenUnavailableText;
    static String createMismatchAlertText;
    private int growthFactor;

    final static void submitAchievementRecord(AchievementSubmission submission, int methodGuard, int packetOpcode) {
        try {
            ResourceArchive.unacknowledgedAchievementSubmissions.addLast(-81, submission);
            MultiHandleSliderWidget.writeAchievementSubmissionPacket(packetOpcode, submission, 30175);
            int guardRemainder = -18 % ((methodGuard - 3) / 40);
        } catch (RuntimeException submissionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) submissionFailure), "sj.A(" + (submission != null ? "{...}" : "null") + ',' + methodGuard + ',' + packetOpcode + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        fullscreenUnavailableText = null;
        createMismatchAlertText = null;
        int var1 = -116 / ((param0 - 72) / 36);
    }

    final void removeAt(int minimumIndex, int index) {
        if (minimumIndex > index) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (index > this.lastIndex) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (index == this.lastIndex) {
            this.lastIndex = this.lastIndex - 1;
            return;
        }
        sf.a(this.values, 1 + index, this.values, index, -index + this.lastIndex);
        this.lastIndex = this.lastIndex - 1;
    }

    private final int capacityFor(int index, int methodGuard) {
        int var3;
        int var4;
        var4 = Geoblox.clientControlFlowFlag;
        if (methodGuard != 1) {
          return 80;
        }
        var3 = this.values.length;
        while (index >= var3) {
          if (!this.multiplicativeGrowth) {
            var3 = var3 + this.growthFactor;
            continue;
          }
          if (0 == var3) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.growthFactor;
        }
        return var3;
    }

    final int get(int index, byte methodGuard) {
        if (methodGuard != 94) {
            createMismatchAlertText = (String) null;
            if (!(index <= this.lastIndex)) {
                throw new ArrayIndexOutOfBoundsException(index);
            }
            return this.values[index];
        }
        if (!(index <= this.lastIndex)) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return this.values[index];
    }

    final int size(byte methodGuard) {
        if (methodGuard <= 28) {
            this.ensureCapacity(-55, 84);
            return this.lastIndex + 1;
        }
        return this.lastIndex + 1;
    }

    private final void set(int value, int methodGuard, int index) {
        if (methodGuard == 1) {
            if (!(this.lastIndex >= index)) {
                this.lastIndex = index;
            }
            if (!(this.values.length > index)) {
                this.ensureCapacity(index, methodGuard ^ 25176);
            }
            this.values[index] = value;
            return;
        }
    }

    private final void ensureCapacity(int index, int methodGuard) {
        int[] var4 = new int[this.capacityFor(index, 1)];
        int[] var3 = var4;
        if (methodGuard == 25177) {
            sf.a(this.values, 0, var4, 0, this.values.length);
            this.values = var4;
            return;
        }
        this.values = (int[]) null;
        sf.a(this.values, 0, var4, 0, this.values.length);
        this.values = var4;
    }

    final void add(int value, byte methodGuard) {
        this.set(value, 1, 1 + this.lastIndex);
        int var3 = -48 % ((-39 - methodGuard) / 50);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        ValidationIconWidget.field_H = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        if (param1 <= 98) {
            return;
        }
        try {
            ea.a((byte) 115, var4, param0, var2, var3);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "sj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private GrowableIntList() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new IntrusiveDeque();
        fullscreenUnavailableText = "Unfortunately your configuration doesn't support fullscreen mode.";
        createMismatchAlertText = "This entry doesn't match";
    }
}
