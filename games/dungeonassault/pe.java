/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends ne {
    static fd field_j;
    static String field_k;
    static String field_n;
    static String field_i;
    static rk field_l;
    static String field_o;
    static String[] field_m;

    public static void a(int param0) {
        if (param0 == 9) {
          field_n = null;
          field_i = null;
          field_l = null;
          field_o = null;
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        }
        pe.a(39);
        field_n = null;
        field_i = null;
        field_l = null;
        field_o = null;
        field_j = null;
        field_m = null;
        field_k = null;
    }

    final static cn[] a(int param0, int param1, int param2, int param3, int param4) {
        cn dupTemp$1 = null;
        cn[] var6 = new cn[9];
        cn[] var5 = var6;
        cn dupTemp$0 = bl.a(false, param0, param4);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        if (param2 <= 3) {
          field_l = (rk) null;
          dupTemp$1 = bl.a(false, param3, param4);
          var6[8] = dupTemp$1;
          var5[7] = dupTemp$1;
          var5[5] = dupTemp$1;
          if (param1 != 0) {
            var6[4] = bl.a(false, param1, 64);
            return var5;
          }
          return var5;
        }
        cn dupTemp$2 = bl.a(false, param3, param4);
        var6[8] = dupTemp$2;
        var5[7] = dupTemp$2;
        var5[5] = dupTemp$2;
        if (param1 == 0) {
          return var5;
        }
        var6[4] = bl.a(false, param1, 64);
        return var5;
    }

    final static boolean a(CharSequence param0, char param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!il.a(true, param1)) {
            return false;
          }
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int >= 12) {
            return false;
          }
          var4 = -116 % ((param2 - 21) / 53);
          if (!jc.a(param1, -101)) {
            return true;
          }
          if (0 != var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("pe.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private pe() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "A large, wolf-like creature with brown-black hair and horns.";
        field_j = new fd(3);
        field_n = "ACCEPT";
        field_i = "Select a raider to enchant with additional Defence";
    }
}
