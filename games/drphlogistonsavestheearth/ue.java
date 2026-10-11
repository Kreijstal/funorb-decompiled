/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue implements cg {
    static String field_d;
    static int field_b;
    static gk field_a;
    static String field_c;

    final static boolean a(char param0, byte param1) {
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
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (de.a(param0, -17321)) {
            return true;
          }
          var11 = oj.field_h;
          var9 = var11;
          var6 = var9;
          var2 = var6;
          for (var3 = 0; var11.length > var3; var3++) {
            var4 = var11[var3];
            if (~param0 == ~var4) {
              return true;
            }
          }
          if (param1 <= 63) {
            field_d = (String) null;
          }
          var12 = cm.field_S;
          var10 = var12;
          var7 = var10;
          var2Lifetime1 = var7;
          var8 = 0;
          var3Lifetime1 = var8;
          while (var8 < var12.length) {
            var4Lifetime1 = var12[var8];
            if (param0 == var4Lifetime1) {
              return true;
            }
            var8++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "ue.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          ue.a(19);
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 <= 102) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        nh var8 = null;
        try {
          if (param1 < 94) {
            field_d = (String) null;
          }
          var6_int = param2.field_o + param4;
          var7 = param2.field_m + param3;
          aj.a(param2.field_w, var6_int, var7, param2.field_k, 106);
          var8 = ja.field_n[1];
          if (param2 instanceof hf &&
            ((hf) (param2)).field_A) {
            var8.a(1 + var6_int + (-var8.field_z + param2.field_w >> 1), var7 - (-1 - (param2.field_k - var8.field_C >> 1)), 256);
          }
          if (param2.a(true)) {
            ce.a(-4 + param2.field_k, 2 + var6_int, -16579, param2.field_w - 4, 2 + var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ue.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        var3 = vb.field_n;
        if (var3 >= 5) {
          if (105 > var3) {
            var2 = (var3 * 16384 - 40960) / 220;
          } else {
            if (120 > var3) {
              var3 = 120 - var3;
              var2 = -(8192 * (var3 * var3) / 3300) + 8192;
            }
          }
        } else {
          var2 = var3 * var3 * 8192 / 1100;
        }
        var4 = 1;
        if (param1 < 56) {
          ue.a(-50, (byte) 118);
        }
        var5 = 0;
        if (param0 == 3) {
          var4 = -1;
        }
        if (param0 == 1) {
          var5 = 1;
        }
        if (param0 == 4) {
          var5 = 1;
          var4 = 1;
        }
        if (5 == param0) {
          var4 = -1;
          var5 = 1;
        }
        if (param0 == 6) {
          var4 = 1;
          var5 = -1;
        }
        if (param0 == 7 ||
          8 == param0) {
          var5 = -1;
          var4 = -1;
        }
        if (param0 == 11) {
          var4 = -1;
        }
        if (param0 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (param0 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (14 == param0) {
          var4 = -1;
          var5 = 1;
        }
        if (15 == param0) {
          var4 = 1;
          var5 = 1;
        }
        lc.field_u = ja.a(var4 * var2, var5 * var2, 32767);
    }

    static {
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
