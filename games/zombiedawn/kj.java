/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static String field_d;
    static String field_e;
    static String field_a;
    static int field_c;
    static int[] field_b;

    final static vn[] a(int param0, int param1, int param2, int param3, int param4) {
        vn[] var6 = new vn[9];
        vn[] var5 = var6;
        vn dupTemp$0 = qk.c(param4, (byte) -71, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        vn dupTemp$1 = qk.c(param3, (byte) -71, param0);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param2 != 12692) {
          field_a = (String) null;
          if (param1 != 0) {
            var6[4] = qk.c(param1, (byte) -71, 64);
            return var5;
          }
          return var5;
        }
        if (param1 == 0) {
          return var5;
        }
        var6[4] = qk.c(param1, (byte) -71, 64);
        return var5;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 <= 57) {
          field_d = (String) null;
        }
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        String var2 = null;
        int var4 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        var4 = ZombieDawn.field_J;
        try {
          try {
            if (!ec.field_n.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param0.length() > var3; var3++) {
              if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                return false;
              }
            }
            if (param1 != 27994) {
              field_a = (String) null;
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2_ref2;
          stackIn_26_1 = new StringBuilder().append("kj.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Screen Size";
        field_d = "Orb coins: ";
        field_a = "Connection restored.";
        field_b = new int[8192];
    }
}
