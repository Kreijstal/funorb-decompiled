/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TickClock {
    static Sprite field_c;
    static SpriteAsset field_a;
    static int field_b;

    final static void drawWhiteRecoloredSprite(int param0, Sprite param1, int param2, int param3, int param4) {
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        var13 = HoldTheLine.field_D;
        try {
          var5_int = param1.width;
          var6 = param1.height;
          var7 = 0;
          if (param4 < 0) {
            var7 = -param4;
            var5_int = var5_int + param4;
            param4 = 0;
          }
          var8 = 0;
          if (var5_int + param4 > 640) {
            var5_int = -param4 + 640;
          }
          if (param3 < 0) {
            var6 = var6 + param3;
            var8 = -param3;
            param3 = 0;
          }
          if (param3 + var6 > 480) {
            var6 = 480 - param3;
          }
          if (param2 <= 86) {
            field_b = 92;
          }
          var9 = var8 * param1.width + var7;
          var10 = param3 * SoftwareRasterizer.width + (param4 - 1);
          for (var11 = 0; var6 > var11; var11++) {
            for (var12 = 0; var12 < var5_int; var12++) {
              if (0 != param1.pixels[var9]) {
                if (param1.pixels[var9] != 16777215) {
                  var10++;
                  SoftwareRasterizer.pixels[var10] = param1.pixels[var9];
                } else {
                  var10++;
                  SoftwareRasterizer.pixels[var10] = param0;
                }
              } else {
                var10++;
              }
              var9++;
            }
            var9 = var9 + (param1.width - var5_int);
            var10 = var10 + (SoftwareRasterizer.width - param1.width);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("w.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    abstract int advanceTicks(long param0, int param1);

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 <= 68) {
          String[] var2 = (String[]) null;
          TickClock.parseTutorialTransition((String[]) null, (byte) -85);
        }
    }

    final static TutorialTransition parseTutorialTransition(String[] args, byte param1) {
        int var4 = 0;
        TutorialTransition var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        String var5 = null;
        String[] var6 = null;
        int var7 = 0;
        TutorialTransition stackIn_6_0 = null;
        TutorialTransition stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          var2 = new TutorialTransition();
          var3 = args;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var6 = ArchiveRequest.a((byte) -107, ' ', var5);
            var2.addCondition(BoundedRandomAccessFile.parseTutorialCondition(0, var6), param1 ^ 67);
          }
          if (param1 == 55) {
            stackIn_8_0 = var2;
            return stackIn_8_0;
          }
          stackIn_6_0 = (TutorialTransition) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("w.Q(");
          if (args == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract long getSleepMillis(int param0);

    abstract void reset(byte param0);

    final int waitForTicks(long param0, int param1) {
        long var4 = this.getSleepMillis(-123);
        if (0L < var4) {
          SocketConnector.sleepMillis(var4, (byte) 45);
        }
        if (param1 <= 38) {
          return 20;
        }
        return this.advanceTicks(param0, -35);
    }

    static {
    }
}
