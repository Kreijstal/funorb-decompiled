/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KitStyleDefinition {
    static String field_a;
    int styleId;
    int unlockBitIndex;
    boolean requiresJagexModeratorRights;
    static LoginMethod field_h;
    static int field_i;
    static String field_c;
    int achievementBitIndex;
    static String field_d;
    static String field_b;
    boolean[][][] patternMasks;
    long requiredAccessKey;
    static String[] field_e;

    final static boolean isLeapYear(int param0, int param1) {
        if (param0 != -16143) {
          field_h = (LoginMethod) null;
          if (param1 < 0) {
            return 0 == (param1 + 1) % 4 ? true : false;
          }
          if (1582 > param1) {
            return param1 % 4 == 0 ? true : false;
          }
          if (param1 % 4 != 0) {
            return false;
          }
          if (0 != param1 % 100) {
            return true;
          }
          if (param1 % 400 == 0) {
            return true;
          }
          return false;
        }
        if (param1 < 0) {
          return 0 == (param1 + 1) % 4 ? true : false;
        }
        if (1582 > param1) {
          return param1 % 4 == 0 ? true : false;
        }
        if (param1 % 4 != 0) {
          return false;
        }
        if (0 != param1 % 100) {
          return true;
        }
        if (param1 % 400 == 0) {
          return true;
        }
        return false;
    }

    final boolean matchesAccessRequirements(long param0, int param1, int param2) {
        int var5 = 43 / ((25 - param1) / 53);
        if (!this.requiresJagexModeratorRights) {
          if (this.requiredAccessKey == -1L) {
            return true;
          }
          if (~this.requiredAccessKey != ~param0) {
            return false;
          }
          return true;
        }
        if (param2 < 2) {
          return false;
        }
        if (this.requiredAccessKey == -1L) {
          return true;
        }
        if (~this.requiredAccessKey != ~param0) {
          return false;
        }
        return true;
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
          field_e = null;
          field_c = null;
          field_h = null;
          field_d = null;
          return;
        }
        KitStyleDefinition.releaseStatics(true);
        field_e = null;
        field_c = null;
        field_h = null;
        field_d = null;
    }

    final boolean usesSecondColorForClashCheck(int param0) {
        if (param0 != -1) {
          return false;
        }
        if (this.styleId == 0) {
          return true;
        }
        if (this.styleId == 13) {
          return true;
        }
        if (this.styleId != 23) {
          return false;
        }
        return true;
    }

    final boolean isUnlockMaskLocked(int param0, byte[] param1, byte param2) {
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -8) {
            return true;
          }
          if (this.unlockBitIndex == -1) {
            return false;
          }
          stackIn_10_0 = !(ModelMaterial.testUnlockMask(param1, this.unlockBitIndex, param0, 3231));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("rd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean isAchievementLocked(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 54) {
            this.matchesAccessRequirements(93L, 123, -46);
          }
          if (param0 < 2 &&
            this.achievementBitIndex != -1) {
            stackIn_10_0 = !(ClientPacketFlushSupport.isBitSet(this.achievementBitIndex, 0, param2));
            return stackIn_10_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("rd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    KitStyleDefinition(int param0, int param1, boolean param2, long param3, String param4) {
        try {
          this.requiredAccessKey = param3;
          this.achievementBitIndex = param0;
          this.requiresJagexModeratorRights = param2 ? true : false;
          this.unlockBitIndex = param1;
          this.patternMasks = KitPatternMaskSupport.decodeKitPatternMask(21656, param4);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "rd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Hide game chat";
        field_i = 250;
        field_d = "tackles and kicks";
        field_b = "Select a home pitch to host games on.";
        field_h = new LoginMethod("");
    }
}
