/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aa {
    static RgbSprite field_b;
    static NodeDeque achievementIconPool;
    static String field_c;

    public static void b(int param0) {
        field_b = null;
        if (param0 < 64) {
          aa.a((byte) 28);
          achievementIconPool = null;
          field_c = null;
          return;
        }
        achievementIconPool = null;
        field_c = null;
    }

    final static int a(int param0) {
        if (param0 != 480) {
          return 109;
        }
        return Paddle.field_x;
    }

    final static void a(int param0, RgbSprite param1, boolean param2, int param3, RasterCacheSurface param4, int param5) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_6_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-109, param4.sprite);
          Rasterizer2D.fillVerticalGradient(0, 0, param4.width, param4.height, VerticalScrollbar.ninjaBackgroundColors[param3], 0);
          stackIn_2_0 = -120;
          if (param5 == 1) {
            stackIn_3_1 = 13;
          } else {
            stackIn_3_1 = 0;
          }
          if (param5 == 1) {
            stackIn_6_2 = 13;
          } else {
            stackIn_6_2 = 20;
          }
          QuickChatMenu.a(stackIn_2_0, stackIn_3_1, stackIn_6_2, param1, 16777215, (param4.width - param1.canvasWidth) / 2, 10 / param5 - param1.canvasHeight + (480 + param0));
          sc.popRaster(-86);
          if (param2) {
            return;
          }
          field_c = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("aa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(byte param0) {
        RasterCacheSurface var2;
        if (param0 >= 23) {
          if (hc.field_f > 0) {
            hc.field_f = hc.field_f - 1;
          }
          if (BallPulseEffect.framebuffer.height != StrongCacheEntry.field_O) {
            BoundedFile.field_h = BoundedFile.field_h + (BallPulseEffect.framebuffer.height - StrongCacheEntry.field_O);
            StrongCacheEntry.field_O = BallPulseEffect.framebuffer.height;
          }
          if (hc.field_f > 0) {
            ProxyAuthenticationRequiredException.a(-83);
          }
          return;
        }
        var2 = (RasterCacheSurface) null;
        aa.a(90, (RgbSprite) null, false, 114, (RasterCacheSurface) null, 94);
        if (hc.field_f > 0) {
          hc.field_f = hc.field_f - 1;
        }
        if (BallPulseEffect.framebuffer.height != StrongCacheEntry.field_O) {
          BoundedFile.field_h = BoundedFile.field_h + (BallPulseEffect.framebuffer.height - StrongCacheEntry.field_O);
          StrongCacheEntry.field_O = BallPulseEffect.framebuffer.height;
        }
        if (hc.field_f > 0) {
          ProxyAuthenticationRequiredException.a(-83);
        }
        return;
    }

    final static int nextBoundedJavaRandom(int bound, Random random, boolean obfuscationGuard) {
        int rejectionThreshold = 0;
        RuntimeException failure = null;
        int word = 0;
        int powerOfTwoResult = 0;
        int remainderResult = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String randomSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (bound <= 0) {
            throw new IllegalArgumentException();
          }
          if (!obfuscationGuard) {
            field_b = (RgbSprite) null;
          }
          if (FriendListUi.a(bound, (byte) -6)) {
            powerOfTwoResult = (int)((long)bound * ((long)random.nextInt() & 4294967295L) >> 32);
            return powerOfTwoResult;
          }
          rejectionThreshold = -2147483648 - (int)(4294967296L % (long)bound);
          do {
            word = random.nextInt();
          } while (rejectionThreshold <= word);
          remainderResult = er.nonnegativeRemainder(-1560508993, bound, word);
          return remainderResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("aa.D(").append(bound).append(',');
          if (random == null) {
            randomSummary = "null";
          } else {
            randomSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(randomSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_b = new RgbSprite(270, 70);
        field_c = "Use this alternative as your account name";
        achievementIconPool = new NodeDeque();
    }
}
