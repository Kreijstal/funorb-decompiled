/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static RgbSprite[] field_a;
    static String field_c;
    static int field_g;
    static String field_f;
    static String field_h;
    static String[] field_e;
    static String field_d;
    static String field_b;

    public static void a(int param0) {
        if (param0 == -3) {
          field_h = null;
          field_c = null;
          field_a = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        }
        field_b = (String) null;
        field_h = null;
        field_c = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
    }

    final static String a(boolean param0, char param1) {
        if (!param0) {
          db.a(false, '!');
          return String.valueOf(param1);
        }
        return String.valueOf(param1);
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_15_0 = false;
        boolean stackIn_33_0 = false;
        boolean stackIn_37_0 = false;
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        if (param3 == 1661761121) {
          if (AiPlanningStrategy.pointerX < param4) {
            return false;
          }
          if (param2 < AiPlanningStrategy.pointerX) {
            return false;
          }
          if (ko.pointerY < param1) {
            return false;
          }
          if (ko.pointerY > param0) {
            return false;
          }
          var5 = param2 + param4 >> 1;
          var6 = param0 + param1 >> 1;
          var7 = -param4 + param2 >> 1;
          var8 = -param1 + param0 >> 1;
          if (var8 < var7) {
            stackIn_33_0 = !(Math.abs(var5 - AiPlanningStrategy.pointerX) + Math.abs(var6 - ko.pointerY) * var7 / var8 > var7);
            return stackIn_33_0;
          }
          stackIn_37_0 = !(Math.abs(var6 - ko.pointerY) + Math.abs(var5 - AiPlanningStrategy.pointerX) * var8 / var7 > var8);
          return stackIn_37_0;
        }
        field_e = (String[]) null;
        if (AiPlanningStrategy.pointerX < param4) {
          return false;
        }
        if (param2 < AiPlanningStrategy.pointerX) {
          return false;
        }
        if (ko.pointerY < param1) {
          return false;
        }
        if (ko.pointerY > param0) {
          return false;
        }
        var5Lifetime1 = param2 + param4 >> 1;
        var6Lifetime1 = param0 + param1 >> 1;
        var7Lifetime1 = -param4 + param2 >> 1;
        var8Lifetime1 = -param1 + param0 >> 1;
        if (var8Lifetime1 < var7Lifetime1) {
          stackIn_15_0 = !(Math.abs(var5Lifetime1 - AiPlanningStrategy.pointerX) + Math.abs(var6Lifetime1 - ko.pointerY) * var7Lifetime1 / var8Lifetime1 > var7Lifetime1);
          return stackIn_15_0;
        }
        if (Math.abs(var6Lifetime1 - ko.pointerY) + Math.abs(var5Lifetime1 - AiPlanningStrategy.pointerX) * var8Lifetime1 / var7Lifetime1 > var8Lifetime1) {
          return false;
        }
        return true;
    }

    final static SocialListEntry findIgnoredAccount(String name, int obfuscationGuard) {
        String nameKey = null;
        SocialListEntry ignoredAccount = null;
        String candidateNameKey = null;
        int obfuscationControl = 0;
        CharSequence nameCharacters = null;
        CharSequence candidateCharacters = null;
        Object stackIn_3_0 = null;
        SocialListEntry stackIn_14_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == bk.ignoredAccountsByName) {
            stackIn_3_0 = null;
            return (SocialListEntry) (stackIn_3_0);
          }
          nameCharacters = (CharSequence) ((Object) name);
          nameKey = AccountNameNormalizer.normalize(nameCharacters, false);
          if (nameKey == null) {
            nameKey = name;
          }
          ignoredAccount = (SocialListEntry) (bk.ignoredAccountsByName.get((byte) -27, (long)nameKey.hashCode()));
          if (obfuscationGuard > -40) {
            db.a(-88);
          }
          while (true) {
            if (ignoredAccount == null) {
              return null;
            }
            candidateCharacters = (CharSequence) ((Object) ignoredAccount.displayName);
            candidateNameKey = AccountNameNormalizer.normalize(candidateCharacters, false);
            if (candidateNameKey == null) {
              candidateNameKey = ignoredAccount.displayName;
            }
            if (!candidateNameKey.equals(nameKey)) {
              ignoredAccount = (SocialListEntry) (bk.ignoredAccountsByName.getNextMatch(-348));
              continue;
            }
            break;
          }
          stackIn_14_0 = ignoredAccount;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("db.D(");
          if (name == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1) {
        if (!param0) {
          return -83;
        }
        return param1 + (so.field_b.field_a - rs.field_k >> 1);
    }

    static {
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
        field_e = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_h = "Offer rematch";
        field_g = 20;
        field_d = "AnimateBattle";
    }
}
