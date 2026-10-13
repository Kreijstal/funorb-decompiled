/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap {
    static UiComponent field_e;
    static RgbSprite[] halloweenCentreSprites;
    static RgbSprite field_a;
    static RgbSprite ninjaMidSprite;
    static String field_d;
    static vj field_b;

    final static void a(int param0, int param1, byte param2) {
        ll.field_b = param1;
        ChocolateBackground.field_v = param0;
        if (param2 < 72) {
          field_e = (UiComponent) null;
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            ap.a(-35, 121, (byte) -8);
          }
          var2 = GameplayAudioEvent.a(HighscoresScreen.a(!param0, param1), (byte) 3);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_8_0 = var2;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("ap.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        var2 = -102 / ((-11 - param1) / 37);
        if ((long)param0 < 65536L) {
          if ((long)param0 < 256L) {
            if (param0 >= 0) {
              return PowerUpWarning.field_l[param0] >> 12;
            }
            return -1;
          }
          if ((long)param0 < 4096L) {
            if ((long)param0 < 1024L) {
              return PowerUpWarning.field_l[param0 >> 2] >> 11;
            }
            return PowerUpWarning.field_l[param0 >> 4] >> 10;
          }
          if (16384L > (long)param0) {
            return PowerUpWarning.field_l[param0 >> 6] >> 9;
          }
          return PowerUpWarning.field_l[param0 >> 8] >> 8;
        }
        if ((long)param0 >= 16777216L) {
          if ((long)param0 < 268435456L) {
            if ((long)param0 < 67108864L) {
              return PowerUpWarning.field_l[param0 >> 18] >> 3;
            }
            return PowerUpWarning.field_l[param0 >> 20] >> 2;
          }
          if (1073741824L <= (long)param0) {
            return PowerUpWarning.field_l[param0 >> 24];
          }
          return PowerUpWarning.field_l[param0 >> 22] >> 1;
        }
        if ((long)param0 < 1048576L) {
          if ((long)param0 < 262144L) {
            return PowerUpWarning.field_l[param0 >> 10] >> 7;
          }
          return PowerUpWarning.field_l[param0 >> 12] >> 6;
        }
        if ((long)param0 < 4194304L) {
          return PowerUpWarning.field_l[param0 >> 14] >> 5;
        }
        return PowerUpWarning.field_l[param0 >> 16] >> 4;
    }

    public static void a(boolean param0) {
        halloweenCentreSprites = null;
        ninjaMidSprite = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        if (param0) {
          ap.a(true);
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 117) {
            ap.a(32, 14);
          }
          InstructionsScreen.attachKeyboardInput(-118, (java.awt.Component) ((Object) param1));
          pl.a((java.awt.Component) ((Object) param1), 7282);
          if (null == NinjaBackground.mouseWheelSource) {
            return;
          }
          NinjaBackground.mouseWheelSource.attach((byte) 44, (java.awt.Component) ((Object) param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ap.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_d = "Your ignore list is full. Max of 100 hit.";
    }
}
