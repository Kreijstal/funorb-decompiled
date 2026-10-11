/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static cc field_c;
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 != 9000) {
          mf.b(-34);
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static er a(r param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        er stackIn_5_0 = null;
        er stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!hq.a(124, param3, param1, param0)) {
            stackIn_2_0 = null;
            return (er) (stackIn_2_0);
          }
          if (param2 <= -72) {
            stackIn_7_0 = td.a(4205);
            return stackIn_7_0;
          }
          stackIn_5_0 = (er) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("mf.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        long var1Lifetime1;
        long var3Lifetime1;
        int var5Lifetime1;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -6390) {
          var1 = gk.a(param0 ^ -6287);
          var3 = -id.field_a + var1;
          if (var3 > 30000L) {
            nj.field_d = 0;
            id.field_a = var1;
            return true;
          }
          var5 = 3000;
          if (nj.field_d >= 7) {
            var5 = 12000;
          } else {
            if (nj.field_d >= 5) {
              var5 = 9000;
            } else {
              if (nj.field_d >= 3) {
                var5 = 6000;
              }
            }
          }
          if ((long)var5 >= var3) {
            return false;
          }
          id.field_a = var1;
          nj.field_d = nj.field_d + 1;
          return true;
        }
        field_b = -111;
        var1Lifetime1 = gk.a(param0 ^ -6287);
        var3Lifetime1 = -id.field_a + var1Lifetime1;
        if (var3Lifetime1 > 30000L) {
          nj.field_d = 0;
          id.field_a = var1Lifetime1;
          return true;
        }
        var5Lifetime1 = 3000;
        if (nj.field_d >= 7) {
          var5Lifetime1 = 12000;
        } else {
          if (nj.field_d >= 5) {
            var5Lifetime1 = 9000;
          } else {
            if (nj.field_d >= 3) {
              var5Lifetime1 = 6000;
            }
          }
        }
        if ((long)var5Lifetime1 >= var3Lifetime1) {
          return false;
        }
        id.field_a = var1Lifetime1;
        nj.field_d = nj.field_d + 1;
        return true;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != 126) {
          return false;
        }
        return (param1 & mb.field_s) != 0 ? true : false;
    }

    static {
        field_b = 2;
        field_a = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
