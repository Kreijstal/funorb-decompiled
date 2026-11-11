/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_b;
    static int field_a;

    final static int pollKeyEvents(boolean param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          var1_int = 0;
          while (NanoTickClock.pollKeyEvent(true)) {
            lp.field_h.handleVerticalNavigation(18);
            if (!lp.field_h.isActivated(false)) {
              continue;
            }
            var1_int = 1;
          }
          if (!param0) {
            stackIn_8_0 = -17;
            return stackIn_8_0;
          }
          lp.field_h.updatePointer(ColourRowCache.a(PasswordValidator.field_m, (byte) -113, RidgedNoise3D.field_p), 35, ColourRowCache.a(AgeValidator.field_j, (byte) -113, GridWidgetContainer.field_B));
          if (lp.field_h.isActivated(false)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            lp.field_h.selectedIndex >= 0) {
            var2 = rga.field_b[lp.field_h.selectedIndex];
            if (var2 == 2) {
              qfa.a(-103);
            }
          }
          stackIn_18_0 = var2;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var1), "kc.B(" + param0 + ')');
        }
    }

    final static String a(String param0, int param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        BitPacketBuffer var5 = null;
        int var6 = 0;
        mu var7 = null;
        CharSequence var8 = null;
        boolean stackIn_3_0 = false;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = !param2;
          var8 = (CharSequence) ((Object) param0);
          if (!CurveOperator.isValidAccountName(stackIn_3_0, var8)) {
            stackIn_6_0 = HiscoresScreen.field_v;
            return stackIn_6_0;
          }
          if (UiWidget.field_g != 2) {
            stackIn_9_0 = LegacyOpenGlTexture2D.field_n;
            return stackIn_9_0;
          }
          var7 = LightSource.a(param3, 115);
          if (var7 == null) {
            stackIn_12_0 = LegacyOpenGlFlowingWaterEffect.formatText(119, ConstrainToCircleLocomotor.field_A, new String[]{param3});
            return stackIn_12_0;
          }
          var7.unlink(105);
          var7.unlinkSecondary(-7975);
          MonochromeRowCacheEntry.field_k = MonochromeRowCacheEntry.field_k - 1;
          var5 = ql.field_k;
          var5.writeCipheredOpcode(param1, -2988);
          var5.position = var5.position + 1;
          var6 = var5.position;
          var5.writeByte(3, 0);
          var5.writeString(param0, param2);
          var5.backpatchByteLength(-var6 + var5.position, (byte) 117);
          stackIn_14_0 = null;
          return (String) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("kc.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
    }
}
