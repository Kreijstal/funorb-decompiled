/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static String field_c;
    static boolean[][] field_b;
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 96 / ((-42 - param0) / 60);
        field_b = (boolean[][]) null;
        field_c = null;
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != -14) {
            field_a = (String) null;
          }
          un.field_Hb = oe.field_qb;
          if (param3 != 255) {
            if (param3 < 100) {
              mp.field_f = fn.a(param3, true, param2);
              return;
            }
            if (param3 <= 105) {
              mp.field_f = oq.a(param0 ^ 7, param1);
              return;
            }
            mp.field_f = fn.a(param3, true, param2);
            return;
          }
          stackIn_6_0 = -2956;
          stackIn_7_1 = !(ea.field_e >= 13);
          mp.field_f = gi.a(stackIn_6_0, stackIn_7_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("dl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(double param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 > -100) {
            return;
          }
          if (ob.field_F == param0) {
            return;
          }
          for (var3_int = 0; 256 > var3_int; var3_int++) {
            var4 = (int)(Math.pow((double)var3_int / 255.0, param0) * 255.0);
            stackIn_9_0 = li.field_l;
            stackIn_9_1 = var3_int;
            if (var4 <= 255) {
              stackIn_10_2 = var4;
            } else {
              stackIn_10_2 = 255;
            }
            stackIn_9_0[stackIn_9_1] = stackIn_10_2;
          }
          ob.field_F = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "dl.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ri var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != -5996) {
            dl.a((byte) -91);
          }
          var4 = (ri) (ob.field_M.a((byte) 100));
          while (var4 != null) {
            tg.a(param1, var4, param0 + 5996);
            var4 = (ri) (ob.field_M.b(42));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "dl.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean b(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (-1 == ca.field_b) {
          if (!c.a(1, (byte) -104)) {
            return false;
          }
          ca.field_b = id.field_f.h(-11);
          id.field_f.field_u = 0;
        }
        if (ca.field_b != -2) {
          var1 = -112 % ((param0 - 11) / 52);
          return c.a(ca.field_b, (byte) -104);
        }
        if (!c.a(2, (byte) -104)) {
          return false;
        }
        ca.field_b = id.field_f.a((byte) -11);
        id.field_f.field_u = 0;
        var1Lifetime1 = -112 % ((param0 - 11) / 52);
        return c.a(ca.field_b, (byte) -104);
    }

    static {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_a = "Score";
    }
}
