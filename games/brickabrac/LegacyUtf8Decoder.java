/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyUtf8Decoder {
    static RgbSprite ninjaNearSprite;
    static UiComponent field_c;
    static String field_b;
    static String field_a;

    public static void clearStaticReferences(byte obfuscationGuard) {
        field_c = null;
        field_a = null;
        int var1 = -69 / ((obfuscationGuard - 66) / 57);
        field_b = null;
        ninjaNearSprite = null;
    }

    final static String decode(byte obfuscationGuard, int length, int offset, byte[] data) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        String stackIn_3_0 = null;
        String stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var13 = new char[length];
          var12 = var13;
          var11 = var12;
          var4 = var11;
          var5 = 0;
          if (obfuscationGuard >= -89) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var6 = offset;
          var7 = length + offset;
          while (var6 < var7) {
            boolean decompiledFrameRemainder0 = true;
            incrementValue$0 = var6;
            var6++;
            var8 = 255 & data[incrementValue$0];
            if (var8 >= 128) {
              if (var8 >= 192) {
                if (224 > var8) {
                  if (var6 < var7 &&
                    (data[var6] & 192) == 128) {
                    incrementValue$1 = var6;
                    var6++;
                    var9 = 63 & data[incrementValue$1] | 1984 & var8 << 6;
                    if (!(var9 >= 128)) {
                      var9 = 65533;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var9 = 65533;
                  }
                } else {
                  if (240 <= var8) {
                    if (var8 < 248) {
                      if (var7 > var6 + 2 &&
                        (data[var6] & 192) == 128 &&
                        (data[var6 + 1] & 192) == 128 &&
                        (192 & data[2 + var6]) == 128) {
                        incrementValue$2 = var6;
                        var6++;
                        incrementValue$3 = var6;
                        var6++;
                        incrementValue$4 = var6;
                        var6++;
                        var9 = data[incrementValue$2] << 12 & 258048 | 1835008 & var8 << 18 | 4032 & data[incrementValue$3] << 6 | data[incrementValue$4] & 63;
                        if (var9 >= 65536 &&
                          var9 <= 1114111) {
                          var9 = 65533;
                        } else {
                          var9 = 65533;
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var9 = 65533;
                      }
                    } else {
                      var9 = 65533;
                    }
                  } else {
                    if (var6 + 1 < var7 &&
                      (data[var6] & 192) == 128 &&
                      (192 & data[var6 + 1]) == 128) {
                      incrementValue$5 = var6;
                      var6++;
                      incrementValue$6 = var6;
                      var6++;
                      var9 = (data[incrementValue$5] & 63) << 6 | (15 & var8) << 12 | data[incrementValue$6] & 63;
                      if (!(var9 >= 2048)) {
                        var9 = 65533;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var9 = 65533;
                    }
                  }
                }
              } else {
                var9 = 65533;
              }
            } else {
              var9 = (var8 == 0) ? 65533 : var8;
            }
            incrementValue$7 = var5;
            var5++;
            var11[incrementValue$7] = (char)var9;
          }
          stackIn_42_0 = new String(var13, 0, var5);
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_45_0 = var4_ref;
          stackIn_45_1 = new StringBuilder().append("mj.B(").append(obfuscationGuard).append(',').append(length).append(',').append(offset).append(',');
          if (data == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        int var1 = 5 / ((41 - param0) / 62);
        return null == ua.field_d ? NinjaBackground.frameFocus : true;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        EmailLoginCredentials.field_n = param0;
        LevelCompleteScreen.field_A = param1;
        NewAchievementsScreen.field_H = param3;
        if (param2) {
          byte[] var5 = (byte[]) null;
          LegacyUtf8Decoder.decode((byte) 117, 3, -87, (byte[]) null);
        }
    }

    static {
        field_a = "Show all game chat";
        field_b = "Kick";
    }
}
