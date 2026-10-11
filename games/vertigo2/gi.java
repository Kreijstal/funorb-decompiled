/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ah {
    static ve field_t;
    static jj field_s;
    static r field_p;
    static int field_m;
    static boolean field_r;
    static boolean field_o;
    static String field_q;
    static int[] field_n;
    static nj field_v;
    static int field_u;

    public static void b(boolean param0) {
        field_q = null;
        field_t = null;
        if (param0) {
          return;
        }
        field_p = null;
        field_s = null;
        field_n = null;
        field_v = null;
    }

    final static boolean a(CharSequence param0, char param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cp.a((byte) 64, param1)) {
            return false;
          }
          if (param0 == null) {
            return false;
          }
          if (param2 != 31) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int >= 12) {
            return false;
          }
          if (!jq.a(param1, param2 - 127)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("gi.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static ch a(int param0, boolean param1) {
        ch var2 = null;
        ch var2Lifetime1;
        if (param0 == -2956) {
          var2 = new ch(true);
          var2.field_i = param1 ? true : false;
          return var2;
        }
        CharSequence var3 = (CharSequence) null;
        gi.a((CharSequence) null, '￸', (byte) -37);
        var2Lifetime1 = new ch(true);
        var2Lifetime1.field_i = param1 ? true : false;
        return var2Lifetime1;
    }

    static {
        field_t = new ve(2, 4, 4, 0);
        field_r = false;
        field_m = 640;
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_v = new nj();
    }
}
