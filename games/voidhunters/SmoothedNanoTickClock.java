/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SmoothedNanoTickClock extends TickClock {
    private long[] deltaSamples;
    private long nextTickNanos;
    private long lastSampleNanos;
    private long elapsedNanos;
    private int sampleWriteIndex;
    private int sampleCount;

    final int advanceTicks(int param0, long param1) {
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        if (param0 != 0) {
          return 1;
        }
        if (this.elapsedNanos < this.nextTickNanos) {
          this.lastSampleNanos = this.lastSampleNanos + (-this.elapsedNanos + this.nextTickNanos);
          this.elapsedNanos = this.elapsedNanos + (-this.elapsedNanos + this.nextTickNanos);
          this.nextTickNanos = this.nextTickNanos + param1;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.nextTickNanos = this.nextTickNanos + param1;
        } while (var4 < 10 &&
          this.elapsedNanos > this.nextTickNanos);
        if (this.nextTickNanos < this.elapsedNanos) {
          this.nextTickNanos = this.elapsedNanos;
        }
        return var4;
    }

    final static void clearKeyboardHandlerReference(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 > -57) {
          return;
        }
        if (GetMomentOfInertiaPerpointCalcDownshift.field_q != null) {
          var1 = GetMomentOfInertiaPerpointCalcDownshift.field_q;
          synchronized (var1) {
            GetMomentOfInertiaPerpointCalcDownshift.field_q = null;
          }
        }
    }

    final long getSleepMillis(byte param0) {
        this.elapsedNanos = this.elapsedNanos + this.sampleAverageDeltaNanos(-110);
        if (param0 != -81) {
          this.sampleCount = 67;
        }
        if (this.elapsedNanos < this.nextTickNanos) {
          return (-this.elapsedNanos + this.nextTickNanos) / 1000000L;
        }
        return 0L;
    }

    final static void stopPlayback(byte param0, SoundPlayback param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          MaskedPasswordTextStyle.field_q.removeSubStream(param1.stream);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("nmb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static boolean isLocalLobbyOwner(int param0) {
        int var1 = 99 / ((param0 - 30) / 45);
        return BodyInZoneConditionFactory.field_a == SetSpinningBladeSpindamageMultiplier.field_o.field_Nb ? true : false;
    }

    SmoothedNanoTickClock() {
        this.deltaSamples = new long[10];
        this.elapsedNanos = 0L;
        this.lastSampleNanos = 0L;
        this.nextTickNanos = 0L;
        this.sampleWriteIndex = 0;
        this.sampleCount = 1;
        this.elapsedNanos = System.nanoTime();
        this.nextTickNanos = System.nanoTime();
    }

    final void reset(int param0) {
        if (this.elapsedNanos < this.nextTickNanos) {
          this.elapsedNanos = this.elapsedNanos + (-this.elapsedNanos + this.nextTickNanos);
        }
        this.lastSampleNanos = 0L;
        if (param0 >= -78) {
          SmoothedNanoTickClock.clearKeyboardHandlerReference(13);
        }
    }

    private final long sampleAverageDeltaNanos(int param0) {
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        long var2 = System.nanoTime();
        long var4 = var2 - this.lastSampleNanos;
        this.lastSampleNanos = var2;
        if (-5000000000L < var4 &&
          var4 < 5000000000L) {
          this.deltaSamples[this.sampleWriteIndex] = var4;
          this.sampleWriteIndex = (this.sampleWriteIndex + 1) % 10;
          if (this.sampleCount < 1) {
            this.sampleCount = this.sampleCount + 1;
          }
        }
        if (param0 >= -71) {
          this.elapsedNanos = 79L;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.sampleCount; var8++) {
          var6 = var6 + this.deltaSamples[(10 + this.sampleWriteIndex - var8) % 10];
        }
        return var6 / (long)this.sampleCount;
    }

    static {
    }
}
