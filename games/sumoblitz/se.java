/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se {
    static String field_b;
    static String field_c;
    static int field_d;
    static String field_a;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Sumoblitz.field_L ? 1 : 0;
        try {
          rf.field_a.a(wr.field_F, ha.field_b, true, param0 - 19887);
          rf.field_a.h(-90);
          while (wd.c(param0 ^ -19954)) {
            rf.field_a.a(np.field_c, tg.field_a, true);
          }
          if (iu.field_e != -1) {
            var1_int = iu.field_e;
            rd.a(-1, param0 ^ -19873);
            stackIn_6_0 = var1_int;
            return stackIn_6_0;
          }
          if (lc.field_A) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (param0 != 19886) {
            field_d = -49;
          }
          if (vm.field_c == ad.field_p) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!ut.field_o.a(true)) {
            stackIn_19_0 = 1;
            return stackIn_19_0;
          }
          if (nw.field_e != ad.field_p) {
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_22_0 = 2;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "se.K(" + param0 + ')');
        }
    }

    abstract nb a(byte param0);

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param3 != 14156) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (0 == param2) {
            stackIn_7_0 = "";
            return stackIn_7_0;
          }
          if (param2 == 1) {
            var10 = param0[param1];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_13_0 = "null";
            return stackIn_13_0;
          }
          var4_int = param2 + param1;
          var5 = 0;
          for (var6_int = param1; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var7 < var4_int; var7++) {
            var8 = param0[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_27_0 = var6.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("se.M(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void a(fs param0, byte param1);

    final static boolean a(int param0, int param1, int param2) {
        int var3 = -24 % ((-63 - param0) / 40);
        if (!oj.a(param1, 13836, param2)) {
          return false;
        }
        if (((param1 & 36864) != 0 ? true : false) | dk.a(param1, (byte) -107, param2) | tq.a(param2, true, param1)) {
          return true;
        }
        return (lg.a(param1, -22, param2) | ((8192 & param1) != 0 ? true : false) | mb.a(true, param2, param1)) & ((param2 & 55) == 0 ? true : false);
    }

    public static void b(int param0) {
        if (param0 != 8192) {
          field_d = 19;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_c = "Please try again in a few minutes.";
        field_a = "Score";
    }
}
