/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NanoGameClock extends GameClock {
    static int field_n;
    private int sampleCount;
    private long accumulatedNanos;
    static int field_q;
    static BitmapFont field_s;
    private int sampleIndex;
    private long nextTickNanos;
    private long lastSampleNanos;
    static String field_l;
    private long[] sampleDeltasNanos;
    static String field_k;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 22963) {
            NanoGameClock.d(-122);
          }
          for (var1_int = 0; var1_int < BitmapTextWidgetPainter.chatHistorySize; var1_int++) {
            DefeatPlayerConsoleCommand.chatHistory[var1_int] = null;
          }
          BitmapTextWidgetPainter.chatHistorySize = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "uk.B(" + param0 + ')');
        }
    }

    final long getDelayMillis(byte obfuscationGuard) {
        this.accumulatedNanos = this.accumulatedNanos + this.sampleElapsedNanos(obfuscationGuard ^ 28722);
        if (this.accumulatedNanos < this.nextTickNanos) {
          return (-this.accumulatedNanos + this.nextTickNanos) / 1000000L;
        }
        if (obfuscationGuard != -103) {
          return 42L;
        }
        return 0L;
    }

    private final long sampleElapsedNanos(int obfuscationGuard) {
        int sampleOffset = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -28757) {
          this.resetClock(122);
        }
        long nowNanos = System.nanoTime();
        long elapsedNanos = nowNanos - this.lastSampleNanos;
        this.lastSampleNanos = nowNanos;
        if (elapsedNanos > -5000000000L &&
          5000000000L > elapsedNanos) {
          this.sampleDeltasNanos[this.sampleIndex] = elapsedNanos;
          this.sampleIndex = (1 + this.sampleIndex) % 10;
          if (1 > this.sampleCount) {
            this.sampleCount = this.sampleCount + 1;
          }
        }
        long sampleSumNanos = 0L;
        for (sampleOffset = 1; sampleOffset <= this.sampleCount; sampleOffset++) {
          sampleSumNanos = sampleSumNanos + this.sampleDeltasNanos[(10 + (this.sampleIndex - sampleOffset)) % 10];
        }
        return sampleSumNanos / (long)this.sampleCount;
    }

    final int advanceTicks(long tickDurationNanos, int obfuscationGuard) {
        int tickCount;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 0) {
          NanoGameClock.d(98);
        }
        if (this.accumulatedNanos < this.nextTickNanos) {
          this.lastSampleNanos = this.lastSampleNanos + (this.nextTickNanos - this.accumulatedNanos);
          this.accumulatedNanos = this.accumulatedNanos + (-this.accumulatedNanos + this.nextTickNanos);
          this.nextTickNanos = this.nextTickNanos + tickDurationNanos;
          return 1;
        }
        tickCount = 0;
        do {
          this.nextTickNanos = this.nextTickNanos + tickDurationNanos;
          tickCount++;
        } while (tickCount < 10 &&
          this.nextTickNanos < this.accumulatedNanos);
        if (this.nextTickNanos < this.accumulatedNanos) {
          this.nextTickNanos = this.accumulatedNanos;
        }
        return tickCount;
    }

    final void resetClock(int obfuscationGuard) {
        if (this.nextTickNanos > this.accumulatedNanos) {
          this.accumulatedNanos = this.accumulatedNanos + (this.nextTickNanos - this.accumulatedNanos);
        }
        this.lastSampleNanos = (long)obfuscationGuard;
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 != 0) {
          return;
        }
        field_l = null;
        field_k = null;
    }

    NanoGameClock() {
        this.accumulatedNanos = 0L;
        this.lastSampleNanos = 0L;
        this.nextTickNanos = 0L;
        this.sampleIndex = 0;
        this.sampleCount = 1;
        this.sampleDeltasNanos = new long[10];
        this.accumulatedNanos = System.nanoTime();
        this.nextTickNanos = System.nanoTime();
    }

    static {
        field_q = -1;
        field_k = "Low";
    }
}
