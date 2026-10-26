/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr {
    static String field_a;
    static int[] field_b;

    final static boolean a(char param0, int param1) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 2004352972) {
            mr.a(23);
          }
          if ((0 >= param0 ||
            128 <= param0) &&
            (160 > param0 ||
            param0 > 255)) {
            if (param0 == 0) {
              return false;
            }
            char[] var6 = te.field_e;
            char[] var2 = var6;
            int var3 = 0;
            while (true) {
              if (var3 >= var6.length) {
                return false;
              }
              int var4 = var6[var3];
              if (param0 != var4) {
                var3++;
                continue;
              }
              break;
            }
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "mr.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
    }

    static {
        field_a = "This password contains your Player Name, and would be easy to guess";
        field_b = new int[]{587202559, 587202559, 872415231, 1439485183, 2006555084, 2002081177, -2013265886, 2013265919, 872402005, 872380211, -16777216, 1996488704, 587202559, 587202559, 587202559, 587202559, 587202559, 587202559, 587202559, 587202559, 2004352972, 2004352972};
    }
}
