/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ExpandingRingEffect extends TimedSceneEffect {
    private boolean expanding;

    ExpandingRingEffect(int xQ8, int yQ8, int color) {
        super(100, xQ8, yQ8, color);
        this.expanding = true;
    }

    final static int nextRandomInt(int bound, Random random, byte guard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -96) {
            stackIn_3_0 = 54;
            return stackIn_3_0;
          }
          if (bound <= 0) {
            throw new IllegalArgumentException();
          }
          if (rm.a(bound, guard ^ 55)) {
            stackIn_8_0 = (int)(((long)random.nextInt() & 4294967295L) * (long)bound >> 32);
            return stackIn_8_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)bound);
          do {
            var4 = random.nextInt();
          } while (var3_int <= var4);
          stackIn_12_0 = LegacyOpenGlPostProcessManager.a(bound, guard ^ -44, var4);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("fi.D(").append(bound).append(',');
          if (random == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        int var3_int = 0;
        if (guard >= -121) {
          return;
        }
        try {
          if (!this.expanding) {
            var3_int = (int)(4096.0 * ((double)this.remainingTicks / 100.0));
          } else {
            var3_int = (int)((double)(100 - this.remainingTicks) / 100.0 * 4096.0);
          }
          var3_int = var3_int * (-this.remainingTicks + 100);
          kw.field_a.drawRotated((float)(this.x >> 8), (float)(this.y >> 8), var3_int, 0, 1, this.color, 2);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fi.C(" + (toolkit != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    static long bitwiseOr(long left, long right) {
        return left | right;
    }

    final static String formatCookieDate(long timestampMillis, boolean guard) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        DroneDebris.field_y.setTime(new Date(timestampMillis));
        int var3 = DroneDebris.field_y.get(7);
        int var4 = DroneDebris.field_y.get(5);
        int var5 = DroneDebris.field_y.get(2);
        int var6 = DroneDebris.field_y.get(1);
        if (guard) {
          var7 = DroneDebris.field_y.get(11);
          var8 = DroneDebris.field_y.get(12);
          var9 = DroneDebris.field_y.get(13);
          return dk.weekdayShortNames[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + LegacyOpenGlEffect.monthShortNames[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    static {
    }
}
