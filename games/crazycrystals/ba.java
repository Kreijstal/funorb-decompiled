/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ln {
    static dl field_j;
    static String field_l;
    static vc field_i;
    static dl[] field_g;
    static db field_k;
    static java.awt.Image field_h;

    final int a(int param0, byte param1) {
        int var3 = 75 / ((param1 - 55) / 50);
        return (1 << param0 & qg.field_q) != 0 ? 1 : 0;
    }

    final static void b(byte param0) {
        int var1 = 4 / ((84 - param0) / 42);
        ab.f((byte) -49);
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_5_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          var4 = 0;
          if (param0 != 48) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          while (var2_int > var4) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 + 32);
            } else if ((var5 < 97 ||
              122 < var5) &&
              (48 > var5 ||
              57 < var5)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
            var4++;
          }
          stackIn_22_0 = new String(var8);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ba.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1) {
        try {
          ng.a(param1, 21815);
          ke.a(no.field_i, false, -13);
          int var2_int = 119 % ((param0 - 6) / 49);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ba.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(byte param0) {
        jm.field_d.a((qm) (new ae()), (byte) -50);
        if (param0 == 93) {
          return;
        }
        field_h = (java.awt.Image) null;
    }

    final static tj a(int param0) {
        if (param0 != -29513) {
          return (tj) null;
        }
        return hb.field_l;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_l = null;
        if (param0 == 48) {
          field_h = null;
          field_k = null;
          field_j = null;
          return;
        }
        ba.c((byte) -100);
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, int param1, hp param2) {
        try {
          if (param1 <= 37) {
            field_h = (java.awt.Image) null;
          }
          cf.field_c.b(0, param2);
          tb.a(param0, param2, (byte) -123);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ba.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ba(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_l = "Retry";
    }
}
