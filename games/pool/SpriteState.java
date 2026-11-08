/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    static String field_x;
    int field_z;
    int field_w;
    int field_B;
    int field_A;
    int field_y;
    static String create;
    static MusicCrossfadeStream field_C;
    static UiComponent field_F;
    int field_G;

    abstract void rotateNearest(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void setMenuTextColors(byte obfuscationGuard, int selectedColor, int headingColor, int unselectedColor) {
        DialogLayer.field_V = headingColor;
        if (obfuscationGuard != -82) {
          return;
        }
        SocketConnector.field_d = selectedColor;
        MembershipBenefitsScreen.field_H = unselectedColor;
    }

    public static void releaseStatics(byte param0) {
        field_C = null;
        if (param0 != 11) {
          field_F = (UiComponent) null;
        }
        create = null;
        field_x = null;
        field_F = null;
    }

    final void drawRotatedCentered(int angle, int centerY, int scale, byte obfuscationGuard, int centerX) {
        if (obfuscationGuard < 97) {
          return;
        }
        int var6 = this.field_w << 3;
        centerX = (var6 & 15) + (centerX << 4);
        int var7 = this.field_y << 3;
        centerY = (centerY << 4) + (15 & var7);
        this.rotateNearest(var6, var7, centerX, centerY, angle, scale);
    }

    final static void initializeLobbyInterface(byte param0, boolean param1, byte[] param2, ResourceArchive param3, ResourceArchive param4, int param5, String[][] param6, int param7, ResourceArchive param8, String[] param9, Sprite[][] param10, String[][] param11, int[] param12, byte[] param13, Sprite[][] param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        try {
          if (param0 != -72) {
            return;
          }
          SceneNodeEntry.initializeLobbyInterface(param13, param2, param11, param8, param14, param5, (IndexedSprite[]) null, (int[]) null, param10, param7, param9, param4, param1, param12, param3, param6, param0 ^ 6033);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_6_0 = var15;
          stackIn_6_1 = new StringBuilder().append("qo.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param9 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param10 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param11 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param12 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param13 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param14 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static int crc32Prefix(int length, byte[] bytes, int obfuscationGuard) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 0) {
            stackIn_4_0 = ClientException.crc32(0, length, ~obfuscationGuard, bytes);
            return stackIn_4_0;
          }
          stackIn_2_0 = -30;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qo.B(").append(length).append(',');
          if (bytes == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static long hashText31(int obfuscationGuard, CharSequence text) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        long stackIn_6_0 = 0L;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 92) {
            field_C = (MusicCrossfadeStream) null;
          }
          var2_int = text.length();
          var3 = 0L;
          for (var5 = 0; var5 < var2_int; var5++) {
            var3 = (var3 << 5) - (var3 - (long)text.charAt(var5));
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("qo.A(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    SpriteState() {
    }

    static {
        create = "Create";
    }
}
