/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static String field_c;
    static int field_b;
    static int field_d;
    static String field_a;

    final static int a(int param0, byte param1, int param2) {
        int var3 = param0 >>> 31;
        if (param1 <= 118) {
          return 121;
        }
        return -var3 + (var3 + param0) / param2;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 > -108) {
          bn.a(-84, (byte) 74, -123);
        }
    }

    final static boolean a(int param0, char param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          var2_int = 70 / ((0 - param0) / 60);
          if (kn.a(param1, (byte) -69)) {
            return true;
          }
          var7 = va.field_e;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (~param1 == ~var5) {
              return true;
            }
          }
          var3Lifetime1 = li.field_f;
          var4Lifetime1 = 0;
          while (true) {
            if (var4Lifetime1 >= var3Lifetime1.length) {
              return false;
            }
            var5Lifetime1 = var3Lifetime1[var4Lifetime1];
            if (var5Lifetime1 != param1) {
              var4Lifetime1++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "bn.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Please enter your date of birth to enable chat:";
        field_a = "Logging in...";
    }
}
