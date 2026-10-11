/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_b;
    static hl field_a;
    static int field_e;
    static String field_d;
    static boolean field_c;

    final static boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return nl.a((byte) 127, qj.field_a, vj.field_o);
    }

    final static int a(boolean param0, int param1) {
        int var3 = 0;
        int var2 = 0;
        int var3Lifetime1;
        if ((7 & param1) != 0) {
          var2 = 8 - (7 & param1);
        }
        if (!param0) {
          var3 = var2 + param1;
          return var3;
        }
        k.a(true, -38);
        var3Lifetime1 = var2 + param1;
        return var3Lifetime1;
    }

    final static String a(String param0, boolean param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TetraLink.field_J;
        try {
          var4_int = param3.length();
          var5 = param2.length();
          var6 = param0.length();
          if (0 == var5) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = -var5 + var6;
          if (var8 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param3.indexOf(param2, var9_int);
              if (var9_int < 0) {
                break;
              }
              var7 = var7 + var8;
              var9_int = var9_int + var5;
            }
          }
          var9 = new StringBuilder(var7);
          if (param1) {
            field_d = (String) null;
          }
          var10 = 0;
          while (true) {
            var11 = param3.indexOf(param2, var10);
            if (var11 < 0) {
              discarded$0 = var9.append(param3.substring(var10));
              stackIn_14_0 = var9.toString();
              return stackIn_14_0;
            }
            discarded$1 = var9.append(param3.substring(var10, var11));
            discarded$2 = var9.append(param0);
            var10 = var11 + var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("k.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        if (param0 == 0) {
          var1 = System.currentTimeMillis();
          if (!(var1 >= af.field_f)) {
            wd.field_f = wd.field_f + (af.field_f - var1);
          }
          af.field_f = var1;
          return var1 + wd.field_f;
        }
        return -61L;
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 == -14243) {
          field_a = null;
          return;
        }
        String var2 = (String) null;
        k.a((String) null, false, (String) null, (String) null);
        field_a = null;
    }

    static {
        field_b = "<%0> must play 1 more rated game before playing with the current options.";
        field_d = "Unfortunately we are unable to create an account for you at this time.";
    }
}
