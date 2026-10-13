/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static IndexedSprite[] field_f;
    static int[] pendingAchievementMask;
    static String field_e;
    static String[] field_c;
    static RgbSprite parisSmallSprite;
    static int keyChangeWriteIndex;

    final static RgbSprite a(int param0, RgbSprite param1) {
        RgbSprite var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        RgbSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new RgbSprite(param1.canvasWidth / 2, param1.canvasHeight / 2);
          if (param0 != -16371) {
            var3 = (byte[]) null;
            pl.a(-81, (byte[]) null, 117, false, 81, (byte) 40);
          }
          var2.bindRasterTarget();
          param1.a(0, 0);
          BallPulseEffect.framebuffer.bindRaster((byte) 103);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("pl.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, byte[] param1, int param2, boolean param3, int param4, byte param5) {
        BitPacketBuffer var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          var6 = k.outgoingPackets;
          var6.writeCipheredOpcode(-13413, param0);
          var6.position = var6.position + 1;
          var7 = var6.position;
          var6.writeByte(15, 4);
          var6.writeByte(81, param2);
          if (param5 >= -55) {
            pendingAchievementMask = (int[]) null;
          }
          var8 = param4;
          if (param3) {
            var8 += 128;
          }
          var6.writeByte(46, var8);
          var6.writeBytes(param1, -1, 0, param1.length);
          var6.backfillByteLength((byte) 123, -var7 + var6.position);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
          ResourceArchive var2 = (ResourceArchive) null;
          pl.loadRgbSpriteByName((String) null, (String) null, (byte) -53, (ResourceArchive) null);
        }
        field_c = null;
        parisSmallSprite = null;
        field_e = null;
        pendingAchievementMask = null;
    }

    final static void a(RgbSprite param0, int param1) {
        int var5_int = 0;
        int var8 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var3Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var13 = new int[param0.height];
          var12 = var13;
          var11 = var12;
          var2 = var11;
          var3 = 0;
          var4 = 0;
          for (var5_int = param1; var5_int < param0.height; var5_int++) {
            var11[var5_int] = var4 + param0.height;
            var6 = 0;
            var7 = 0;
            for (var8 = 0; param0.width > var8; var8++) {
              incrementValue$2 = var3;
              var3++;
              var9 = param0.pixels[incrementValue$2];
              if (var9 == 0) {
                if (0 < var6) {
                  var6 = 0;
                  var4++;
                }
                var7++;
                param0.pixels[var4] = -var7;
              } else {
                if (0 < var7) {
                  var4++;
                  var7 = 0;
                }
                var6++;
                param0.pixels[var4] = var6;
              }
            }
            var4++;
          }
          var3Lifetime1 = 0;
          var5 = new int[var4 + param0.height];
          for (var6Lifetime1 = 0; param0.height > var6Lifetime1; var6Lifetime1++) {
            incrementValue$1 = var3Lifetime1;
            var3Lifetime1++;
            var5[incrementValue$1] = var13[var6Lifetime1];
          }
          for (var6Lifetime2 = 0; var4 > var6Lifetime2; var6Lifetime2++) {
            incrementValue$0 = var3Lifetime1;
            var3Lifetime1++;
            var5[incrementValue$0] = param0.pixels[var6Lifetime2];
          }
          param0.pixels = var5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("pl.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.addMouseListener(PowerUpWarning.mouseInput);
          param0.addMouseMotionListener(PowerUpWarning.mouseInput);
          if (param1 != 7282) {
            ResourceArchive var3 = (ResourceArchive) null;
            pl.loadRgbSpriteByName((String) null, (String) null, (byte) 8, (ResourceArchive) null);
          }
          param0.addFocusListener(PowerUpWarning.mouseInput);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            pl.a(-94);
          }
          if (!param2) {
            stackIn_6_0 = oc.field_m.measureText(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = PowerUpWarning.field_r.measureText(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pl.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static RgbSprite loadRgbSpriteByName(String groupName, String fileName, byte obfuscationGuard, ResourceArchive archive) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RgbSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = archive.getGroupId(groupName, false);
          var5 = archive.getFileId(var4_int, -108, fileName);
          var6 = 116 % ((40 - obfuscationGuard) / 57);
          stackIn_1_0 = dk.loadRgbSprite(-873, archive, var4_int, var5);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("pl.D(");
          if (groupName == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (fileName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_e = "Ignore";
        pendingAchievementMask = Ball.createAchievementMask(8);
        keyChangeWriteIndex = 0;
        field_c = new String[]{"All scores", "My scores", "Best each"};
    }
}
