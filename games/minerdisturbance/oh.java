/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends bl {
    static int field_E;
    static String field_A;
    private Object field_B;
    static bj field_C;
    static boolean field_F;

    final boolean h(int param0) {
        if (param0 != 0) {
          oh.c((byte) 92);
          return false;
        }
        return false;
    }

    oh(Object param0, int param1) {
        super(param1);
        try {
          this.field_B = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = MinerDisturbance.field_ab;
        if (param1 != 95) {
          return (String) null;
        }
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L != 0L) {
          var3 = 0;
          var4 = param0;
          while (0L != var4) {
            var3++;
            var4 = var4 / 37L;
          }
          var6 = new StringBuilder(var3);
          while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = bh.field_db[(int)(-(param0 * 37L) + var7)];
            if (var9 == 95) {
              var10 = var6.length() - 1;
              var9 = 160;
              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            discarded$0 = var6.append((char) var9);
          }
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        return null;
    }

    public static void i(int param0) {
        field_A = null;
        int var1 = -128 % ((54 - param0) / 48);
        field_C = null;
    }

    final Object f(int param0) {
        int var2 = 32 % ((5 - param0) / 45);
        return this.field_B;
    }

    final static vc a(int param0, int param1, bj param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        bj var4 = null;
        byte[] var5 = null;
        vc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -86) {
            var4 = (bj) null;
            oh.a(-87, 94, (bj) null);
          }
          var5 = param2.e(param1, 1);
          var3 = var5;
          if (var5 == null) {
            return null;
          }
          stackIn_6_0 = new vc(var5);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("oh.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static oe c(byte param0) {
        try {
          Throwable var1 = null;
          oe stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 <= 53) {
            return (oe) null;
          }
          try {
            stackIn_3_0 = (oe) (Class.forName("na").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_E = 10;
        field_F = false;
        field_A = "Continue";
    }
}
