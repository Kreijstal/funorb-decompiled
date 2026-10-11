/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static sd field_c;
    static String field_b;
    static int field_a;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 < 66) {
          field_a = -92;
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 65 &&
              90 >= var5) {
              var3[var4] = (char)(var5 + 32);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param1 != 20) {
            field_b = (String) null;
          }
          stackIn_23_0 = new String(var8);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("q.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            q.a(111, (byte) -112, -29);
          }
          stackIn_3_0 = rj.a(false, param0, (byte) 20);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("q.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var3_int = 0;
          if (param1 != -36) {
            field_c = (sd) null;
          }
          var4 = fb.field_k;
          while (pl.field_k.length > var3_int) {
            var5 = gh.field_a[var3_int];
            if (var5 >= 0) {
              var6 = hh.$cfr$intArgs$a$590e95718a07(74, pl.field_k[var3_int], true);
              var7 = jc.field_b - (var6 >> 1);
              var4 = var4 + ud.field_a;
              if (lf.a(param1 - 19828, param2, param0, hb.field_n + (vf.field_b << 1), (pl.field_h << 1) + var6, -pl.field_h + var7, var4)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (hb.field_n + ud.field_a + (vf.field_b << 1));
            } else {
              var4 = var4 + gi.field_a;
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), "q.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = new sd();
        field_b = "Unpacking levels";
        field_a = 0;
    }
}
