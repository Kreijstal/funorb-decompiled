/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String field_f;
    static int field_b;
    static String field_c;
    static String field_h;
    static cj field_g;
    static int[] field_j;
    static String field_e;
    static String field_i;
    static ri[] field_a;
    static int field_d;

    final static short[] a(int param0, short[] param1, ga param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4_int = param2.h(param0, 14862);
          if (0 == var4_int) {
            return null;
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new short[var4_int];
          }
          var5 = param2.h(4, 14862);
          if (param3 >= -96) {
            stackIn_10_0 = (short[]) null;
            return stackIn_10_0;
          }
          var6 = (short)param2.h(16, 14862);
          if (0 < var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)(var6 + param2.h(var5, 14862));
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)var6;
            }
          }
          stackIn_19_0 = (short[]) (param1);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("lo.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        field_h = null;
        field_j = null;
        field_c = null;
        if (param0 != 0) {
          return;
        }
        field_g = null;
        field_f = null;
        field_e = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (gn.a(param1, 16413)) {
            return true;
          }
          var11 = af.field_d;
          var9 = var11;
          var6 = var9;
          var2 = var6;
          for (var3 = 0; var11.length > var3; var3++) {
            var4 = var11[var3];
            if (param1 == var4) {
              return true;
            }
          }
          if (param0 != 8192) {
            lo.a(50);
          }
          var12 = ln.field_d;
          var10 = var12;
          var7 = var10;
          var2Lifetime1 = var7;
          var8 = 0;
          var3Lifetime1 = var8;
          while (var8 < var12.length) {
            var4Lifetime1 = var12[var8];
            if (param1 == var4Lifetime1) {
              return true;
            }
            var8++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "lo.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_h = "Please remove <%0> from your friend list first.";
        field_c = "Private";
        field_e = "Your zombie will become tougher, able to take more damage before dying...again.";
        field_i = "<%0> is already on your ignore list.";
        field_j = new int[8192];
        field_d = 0;
    }
}
