/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TransitionTimerHelpers {
    static SpriteFrame field_f;
    static boolean field_b;
    static boolean[] field_g;
    static SceneWidget field_d;
    static String[] field_e;
    static ScrollContainer field_a;
    static int field_h;
    static java.awt.Frame field_c;

    final static BinaryBitmapFont loadBinaryFontByName(ResourceArchive param0, String param1, ResourceArchive param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        BinaryBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.getGroupId(param1, 45);
          if (param3 != -1) {
            TransitionTimerHelpers.updateTransitionTimers((byte) 19);
          }
          var6 = param2.getFileId(var5_int, -32759, param4);
          stackIn_3_0 = SceneWidgetNode.loadBinaryFontById(var5_int, var6, param2, (byte) 126, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vd.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void updateTransitionTimers(byte param0) {
        int var2;
        var2 = SteelSentinels.obfuscationControl;
        boolean decompiledFrameRemainder0 = true;
        if (SentinelCommand.field_t > 0) {
          SentinelCommand.field_t = SentinelCommand.field_t - 1;
        } else {
          if (SolidSpriteHelpers.field_c > 0) {
            SolidSpriteHelpers.field_c = SolidSpriteHelpers.field_c - 1;
            if (SentinelCommand.field_t <= 0) {
              if (0 < SolidSpriteHelpers.field_c) {
                GzipDecoder.layoutSlidingSidePanels(112, SolidSpriteHelpers.field_c);
              }
              if (0 < PasswordRuleHelpers.field_f) {
                GzipDecoder.layoutSlidingSidePanels(84, PasswordRuleHelpers.field_f);
              }
            } else {
              SentinelCommandSimulator.layoutLobbySlidePanels(0);
              if (0 < SolidSpriteHelpers.field_c) {
                GzipDecoder.layoutSlidingSidePanels(112, SolidSpriteHelpers.field_c);
              }
              decompiledFrameRemainder0 = !(0 >= PasswordRuleHelpers.field_f);
              if (decompiledFrameRemainder0) {
                GzipDecoder.layoutSlidingSidePanels(84, PasswordRuleHelpers.field_f);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 != 63) {
                TransitionTimerHelpers.releaseStatics((byte) 112);
              }
              return;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (PasswordRuleHelpers.field_f > 0)) {
            PasswordRuleHelpers.field_f = PasswordRuleHelpers.field_f - 1;
            if (SentinelCommand.field_t > 0) {
              SentinelCommandSimulator.layoutLobbySlidePanels(0);
              if (0 < SolidSpriteHelpers.field_c) {
                GzipDecoder.layoutSlidingSidePanels(112, SolidSpriteHelpers.field_c);
              }
              if (0 < PasswordRuleHelpers.field_f) {
                GzipDecoder.layoutSlidingSidePanels(84, PasswordRuleHelpers.field_f);
              }
            } else {
              if (0 < SolidSpriteHelpers.field_c) {
                GzipDecoder.layoutSlidingSidePanels(112, SolidSpriteHelpers.field_c);
              }
              decompiledFrameRemainder0 = !(0 >= PasswordRuleHelpers.field_f);
              if (decompiledFrameRemainder0) {
                GzipDecoder.layoutSlidingSidePanels(84, PasswordRuleHelpers.field_f);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 != 63) {
                TransitionTimerHelpers.releaseStatics((byte) 112);
              }
              return;
            }
          }
        }
        if (decompiledFrameRemainder0) {
          if (SentinelCommand.field_t > 0) {
            SentinelCommandSimulator.layoutLobbySlidePanels(0);
          }
          if (0 < SolidSpriteHelpers.field_c) {
            GzipDecoder.layoutSlidingSidePanels(112, SolidSpriteHelpers.field_c);
          }
          if (0 < PasswordRuleHelpers.field_f) {
            GzipDecoder.layoutSlidingSidePanels(84, PasswordRuleHelpers.field_f);
          }
        }
        if (param0 == 63) {
          return;
        }
        TransitionTimerHelpers.releaseStatics((byte) 112);
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 56) {
          return;
        }
        field_a = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_g = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_e = new String[]{"Everyone is your enemy.", "Destroy the enemies, but don't attack your own team.", "Destroy as many waves of enemies as you can.", "Cooperate with your ally to destroy as many waves of enemies as you can."};
        field_b = false;
        field_a = null;
    }
}
