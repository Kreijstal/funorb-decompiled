/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MissionBuilderFactory implements GameStateFactory {
    static String field_a;

    public static void clearSharedReferences(byte param0) {
        if (param0 != 124) {
          return;
        }
        field_a = null;
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 49 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new MissionBuilder());
    }

    final static DisplayMode[] listDisplayModesBlocking(PlatformService param0, int param1) {
        int var5 = 0;
        DisplayMode[] stackIn_4_0 = null;
        DisplayMode[] stackIn_10_0 = null;
        DisplayMode[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        DisplayMode[] var4 = null;
        DisplayMode var6 = null;
        int var7 = 0;
        PlatformRequest var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = VoidHunters.field_G;
        try {
          if (!param0.isFullscreenSupported(0)) {
            stackIn_4_0 = new DisplayMode[]{};
            return stackIn_4_0;
          }
          var8 = param0.listDisplayModes(85);
          while (var8.status == 0) {
            BufferedFile.sleep(127, 10L);
          }
          if (2 == var8.status) {
            stackIn_10_0 = new DisplayMode[]{};
            return stackIn_10_0;
          }
          if (param1 != -30334) {
            field_a = (String) null;
          }
          var10 = (int[]) (var8.result);
          var9 = var10;
          var3 = var9;
          var4 = new DisplayMode[var10.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new DisplayMode();
            var4[var5] = var6;
            var6.width = var3[var5 << 2];
            var6.height = var3[1 + (var5 << 2)];
            var6.bitDepth = var3[2 + (var5 << 2)];
            var6.refreshRate = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("dtb.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          CharSequence var4 = (CharSequence) null;
          MissionBuilderFactory.a('￸', 101, (CharSequence) null);
        }
        return (SerializableGameState[]) ((Object) new MissionBuilder[param1]);
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 18) {
            return true;
          }
          if (!GetAngularVelocitySustainMax.isNormalizableNameCharacter((byte) -35, param0)) {
            return false;
          }
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (12 <= var3_int) {
            return false;
          }
          if (MouseWheelInput.isNameSeparator(param0, 70) &&
            var3_int == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("dtb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_a = "Keep the tech in your spawn to deplete the enemy's score";
    }
}
