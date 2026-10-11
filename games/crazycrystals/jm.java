/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jm {
    static ko field_k;
    static int[] field_a;
    static boolean field_j;
    static int field_g;
    static dl field_i;
    static String[] field_e;
    static ck field_d;
    static int field_c;
    static int field_b;
    static String field_f;
    static ke field_h;

    final static jp a(String param0, boolean param1) {
        jp stackIn_3_0 = null;
        jp stackIn_7_0 = null;
        jp stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        jp stackIn_25_0 = null;
        jp stackIn_41_0 = null;
        jp stackIn_45_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = CrazyCrystals.field_B;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = ma.field_m;
            return stackIn_3_0;
          }
          if (64 < var2_int) {
            stackIn_7_0 = hk.field_d;
            return stackIn_7_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_11_0 = sl.field_m;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; var2_int - 1 > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_25_0 = sl.field_m;
                  return stackIn_25_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          if (!param1) {
            field_j = true;
          }
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_41_0 = sl.field_m;
                return stackIn_41_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (fm.field_r.indexOf(var5Lifetime1) == -1) {
                stackIn_45_0 = sl.field_m;
                return stackIn_45_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("jm.E(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        if (param0 < -120) {
          field_k = null;
          field_e = null;
          field_f = null;
          field_d = null;
          field_h = null;
          return;
        }
        field_i = (dl) null;
        field_k = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_h = null;
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract int a(boolean param0);

    abstract void a(int param0, java.awt.Component param1);

    static {
        field_g = 48;
        field_j = true;
        field_e = new String[]{"Crystal Nabber", "Crystal Keeper", "Crystal Collector", "Crystal Connoisseur", "Crystal Monarch", "Desperate Dodger", "Crazy Dodger", "Jammy Dodger", "Humble Collector", "Dabbling Jeweller", "Accomplished Artisan", "Prince of Gems", "Spider Stomper", "Ball Blaster", "Speed Diamond", "Flawless Performer", "Creepy Crystals"};
        field_f = "Connection timed out. Please try using a different server.";
    }
}
