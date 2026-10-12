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

    final static hl a(String param0, int param1) {
        String var2 = null;
        hl var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        hl stackIn_14_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == bk.field_a) {
            stackIn_3_0 = null;
            return (hl) (stackIn_3_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = k.a(var6, false);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (hl) (bk.field_a.a((byte) -27, (long)var2.hashCode()));
          if (param1 > -40) {
            db.a(-88);
          }
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_Mb);
            var4 = k.a(var7, false);
            if (var4 == null) {
              var4 = var3.field_Mb;
            }
            if (!var4.equals(var2)) {
              var3 = (hl) (bk.field_a.d(-348));
              continue;
            }
            break;
          }
          stackIn_14_0 = var3;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("db.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
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
