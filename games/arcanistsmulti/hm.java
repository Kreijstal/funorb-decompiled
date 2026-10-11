/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_a;
    static String field_b;
    static String field_d;
    static boolean field_c;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param2 != -1) {
            return true;
          }
          var3 = pn.a(8671, param1);
          if (param0.indexOf(param1) == -1 &&
            param0.indexOf(var3) == -1) {
            stackIn_15_0 = (param0.startsWith(param1)) || (param0.startsWith(var3)) || (param0.endsWith(param1)) || (param0.endsWith(var3));
            return stackIn_15_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("hm.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
          hm.a((byte) 69, 72);
        }
    }

    final static char a(byte param0, int param1) {
        int var4 = 0;
        int var2 = -108 / ((-55 - param1) / 44);
        int var3 = param0 & 255;
        if (var3 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var3, 16));
        }
        if (128 <= var3 &&
          160 > var3) {
          var4 = oc.field_a[var3 - 128];
          if (var4 == 0) {
            var4 = 63;
          }
          var3 = var4;
        }
        return (char)var3;
    }

    public static void a(int param0) {
        int var1 = -47 / ((82 - param0) / 42);
        field_a = null;
        field_b = null;
        field_d = null;
    }

    static {
        field_d = "Storm spells focus on direct attacks and powerful wind effects.";
        field_a = "<shad><col=<%0>>STORM</col></shad>";
        field_b = "<br><br>You don't have enough health to transfer power to your familiar.";
    }
}
