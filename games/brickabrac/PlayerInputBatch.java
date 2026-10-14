/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerInputBatch extends IntrusiveNode {
    private int readIndex;
    static String field_p;
    boolean hasChecksum;
    static String field_j;
    int[] controlMasks;
    int positionWord;
    static RgbSprite field_i;
    int maskedChecksum;

    final boolean isConsumed(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return true;
        }
        return this.controlMasks.length == this.readIndex ? true : false;
    }

    final int nextControlMask(byte obfuscationGuard) {
        int fieldTemp$0 = 0;
        if (obfuscationGuard == -104) {
          fieldTemp$0 = this.readIndex;
          this.readIndex = this.readIndex + 1;
          return this.controlMasks[fieldTemp$0];
        }
        PlayerInputBatch.b(true);
        int fieldTemp$1 = this.readIndex;
        this.readIndex = this.readIndex + 1;
        return this.controlMasks[fieldTemp$1];
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param3 < 0) {
          return false;
        }
        if (param3 > 11) {
          return false;
        }
        if (param1 < 1) {
          return false;
        }
        if (bg.a(param2, 29, param3) < param1) {
          return false;
        }
        if (param0 == -49) {
          return true;
        }
        field_j = (String) null;
        return true;
    }

    final static String a(int param0) {
        String var1 = "";
        if (null != DirectByteStorage.field_k) {
          var1 = DirectByteStorage.field_k.getAccount((byte) -76);
        }
        if (param0 < -98) {
          if (0 == var1.length()) {
            var1 = dg.b(100);
          }
          if (var1.length() == 0) {
            var1 = LevelSelectScreen.field_t;
          }
          return var1;
        }
        field_i = (RgbSprite) null;
        if (0 == var1.length()) {
          var1 = dg.b(100);
        }
        if (var1.length() == 0) {
          var1 = LevelSelectScreen.field_t;
        }
        return var1;
    }

    public static void b(boolean param0) {
        field_j = null;
        field_i = null;
        field_p = null;
        if (param0) {
          PlayerInputBatch.b(true);
        }
    }

    final static RgbSprite a(int param0, RgbSprite param1, int param2, int param3) {
        int var5 = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        RgbSprite var7 = null;
        RgbSprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var7 = new RgbSprite(param1.width + param2 * 2, param1.height + param2 * 2);
          var7.bindRasterTarget();
          for (var5 = 0; param2 > var5; var5++) {
            param1.d(param2 - param1.offsetX, -param1.offsetY + param2, param3);
            Rasterizer2D.e(1, 1, 0, 0, var7.width, var7.height);
          }
          BallPulseEffect.framebuffer.bindRaster((byte) 104);
          var7.offsetY = -param2 + param1.offsetY;
          if (param0 != -12) {
            field_j = (String) null;
          }
          var7.offsetX = param1.offsetX - param2;
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("p.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public PlayerInputBatch() {
        this.controlMasks = new int[5];
        this.readIndex = 0;
    }

    static {
        field_p = "Login: ";
        field_j = "Allow spectators?";
    }
}
