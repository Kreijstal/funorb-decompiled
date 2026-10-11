/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static int field_a;
    static int[] field_b;
    static boolean field_c;
    static int[][] field_d;

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = tc.a((byte) -114, param1, param1.length, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ll.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        vi.field_q = 0;
        vi.field_p = ke.field_c;
        el.field_e = 0;
        uj.field_d = 0;
        si.field_ob = new sd(2);
        if (param0 == 49) {
          si.field_ob.a(-1, param1, kk.a(param0 + 10423, ef.field_j, jb.field_b), param0 - 134);
          return;
        }
    }

    public static void b(int param0) {
        field_d = (int[][]) null;
        field_b = null;
        if (param0 != 1000) {
          ll.a((byte) -104, false);
        }
    }

    final static void a(String param0, long param1, byte param2, java.applet.Applet param3, String param4) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          String var8Lifetime1;
          String var8Lifetime2;
          String var8Lifetime3;
          String var8Lifetime4;
          try {
            try {
              var9 = param3.getParameter("cookiehost");
              var8 = var9;
              var8Lifetime1 = var9;
              var7 = 27 % ((param2 - 35) / 56);
              var10 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var9;
              var8Lifetime2 = var10;
              var8Lifetime3 = var10;
              if (param1 >= 0L) {
                var8Lifetime4 = var10 + "; Expires=" + wc.a(1000L * param1 + ll.a(1000), -1) + "; Max-Age=" + param1;
              } else {
                var8Lifetime4 = var10 + "; Discard;";
              }
              cd.a(param3, 13162, "document.cookie=\"" + var8Lifetime4 + "\"");
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var6_ref;
            stackIn_9_1 = new StringBuilder().append("ll.B(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param4 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (var1 < sh.field_n) {
          ba.field_i = ba.field_i + (sh.field_n - var1);
          if (param0 != 1000) {
            ll.a(101);
            sh.field_n = var1;
            return var1 + ba.field_i;
          }
          sh.field_n = var1;
          return var1 + ba.field_i;
        }
        if (param0 == 1000) {
          sh.field_n = var1;
          return var1 + ba.field_i;
        }
        ll.a(101);
        sh.field_n = var1;
        return var1 + ba.field_i;
    }

    static {
        field_a = -1;
        field_c = true;
        field_b = new int[128];
    }
}
