/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DroneEscalationSupport {
    static int field_b;
    static String passwordsMustBeBetweenText;
    static ToolkitSprite[] field_a;

    final static boolean isAsciiAlphanumeric(int guard, char character) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (guard != 57) {
          passwordsMustBeBetweenText = (String) null;
          if (character < 48) {
            if (character >= 65 &&
              character <= 90) {
              return true;
            }
            if (character < 97) {
              return false;
            }
            if (122 < character) {
              return false;
            }
            return true;
          }
          if (57 >= character) {
            return true;
          }
          if (character < 65) {
            if (character < 97) {
              return false;
            }
            if (122 >= character) {
              return true;
            }
            return false;
          }
          if (character <= 90) {
            return true;
          }
          stackIn_28_0 = (character >= 97) && (122 >= character);
          return stackIn_28_0;
        }
        if (character < 48) {
          if (character < 65) {
            if (character < 97) {
              return false;
            }
            if (122 < character) {
              return false;
            }
            return true;
          }
          if (character <= 90) {
            return true;
          }
          stackIn_64_0 = (character >= 97) && (122 >= character);
          return stackIn_64_0;
        }
        if (57 >= character) {
          return true;
        }
        if (character < 65) {
          if (character < 97) {
            return false;
          }
          if (122 < character) {
            return false;
          }
          return true;
        }
        if (character <= 90) {
          return true;
        }
        stackIn_50_0 = (character >= 97) && (122 >= character);
        return stackIn_50_0;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 > -116) {
          return;
        }
        passwordsMustBeBetweenText = null;
    }

    final static void refreshDisplayPrompt(byte guard) {
        if (guard != 35) {
          field_b = 62;
          if (!DisplayPromptState.isDisplayPromptOpen((byte) 101)) {
            return;
          }
          ScreenNameValidator.a(false, 4, (byte) -24);
          return;
        }
        if (!DisplayPromptState.isDisplayPromptOpen((byte) 101)) {
          return;
        }
        ScreenNameValidator.a(false, 4, (byte) -24);
    }

    final static void spawnEscalatedEnemy(int guard, Drone source) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Drone var6 = null;
        Drone var7 = null;
        int var3Lifetime1;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard < 57) {
            return;
          }
          if (source.droneType == 0) {
            return;
          }
          if (AgeValidator.countEnemyDrones(true) > 20) {
            return;
          }
          var2_int = ExpandingRingEffect.nextRandomInt(2, HardwareGraphicsHeap.field_o, (byte) -96);
          if (1 == var2_int) {
            var3 = source.droneType + 1;
            if (6 <= var3) {
              var3 = 5;
            }
            var6 = EnemyDroneFactory.createEnemyDrone(var3, 26 + ExpandingRingEffect.nextRandomInt(588, ResourceArchive.field_b, (byte) -96) << 8, source.variant, (byte) 84, 26 + ExpandingRingEffect.nextRandomInt(428, ResourceArchive.field_b, (byte) -96) << 8);
            HardwareUnlitEffect.a(var6, false);
            return;
          }
          var3Lifetime1 = source.variant;
          var4 = var3Lifetime1;
          if (var4 == 4) {
            var3Lifetime1 = 0;
          } else {
            if (0 == var4) {
              var3Lifetime1 = 5;
            } else {
              if (var4 != 5) {
                if (var4 == 1) {
                  var3Lifetime1 = 2;
                } else {
                  if (2 == var4) {
                    var3Lifetime1 = 6;
                  }
                }
              } else {
                var3Lifetime1 = 1;
              }
            }
          }
          if (var3Lifetime1 >= 7) {
            var3Lifetime1 = 6;
          }
          var7 = EnemyDroneFactory.createEnemyDrone(source.droneType, 26 + ExpandingRingEffect.nextRandomInt(588, ResourceArchive.field_b, (byte) -96) << 8, var3Lifetime1, (byte) 84, 26 + ExpandingRingEffect.nextRandomInt(428, ResourceArchive.field_b, (byte) -96) << 8);
          HardwareUnlitEffect.a(var7, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("qw.B(").append(guard).append(',');
          if (source == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        passwordsMustBeBetweenText = "Passwords must be between 5 and 20 letters and numbers";
    }
}
