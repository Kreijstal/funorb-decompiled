/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplacedUnitMarker extends PreparedAction {
    static RgbSprite[] field_s;
    static String[] field_t;

    final static String setCampaignBaseChannelGain(int maximumGain, int gain) {
        String previousGainText = null;
        if (maximumGain < gain) {
          return "Please use a value from 0 to 256, inclusive.";
        }
        if (gain >= 0) {
          previousGainText = "old volume: " + gi.campaignBaseChannelGain;
          gi.campaignBaseChannelGain = gain;
          return previousGainText;
        }
        return "Please use a value from 0 to 256, inclusive.";
    }

    public static void e(int param0) {
        field_s = null;
        field_t = null;
        if (param0 != 1223) {
          DisplacedUnitMarker.e(41);
        }
    }

    final void applyToBattlefield(int obfuscationGuard, Battlefield battlefield) {
        try {
          if (obfuscationGuard != 64) {
            field_s = (RgbSprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "il.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    final static AccountRequestResult a(int param0, int param1, String param2) {
        AccountRequestResult var3 = null;
        RuntimeException var3_ref = null;
        AccountRequestResult stackIn_2_0 = null;
        AccountRequestResult stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            stackIn_2_0 = (AccountRequestResult) null;
            return stackIn_2_0;
          }
          var3 = new AccountRequestResult(false);
          var3.statusCode = param1;
          var3.errorText = param2;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("il.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    DisplacedUnitMarker(int suppliedX, int suppliedY, Unit unit, MapTile tile) {
        try {
          if (null != tile.occupant) {
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "il.<init>(" + suppliedX + ',' + suppliedY + ',' + (unit != null ? "{...}" : "null") + ',' + (tile != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          int var2_int = -78 / ((param1 + 46) / 57);
          param0.addMouseListener(BattleCharacter.pointerInputHandler);
          param0.addMouseMotionListener(BattleCharacter.pointerInputHandler);
          param0.addFocusListener(BattleCharacter.pointerInputHandler);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "il.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
