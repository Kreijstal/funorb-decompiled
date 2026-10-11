/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static char field_c;
    static tf field_a;
    static int field_g;
    static long field_f;
    static int field_b;
    static ut[] field_d;
    static String field_e;
    static int field_h;

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param1.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param1.equals("D")) {
            stackIn_25_0 = Double.TYPE;
            return stackIn_25_0;
          }
          if (param1.equals("C")) {
            stackIn_28_0 = Character.TYPE;
            return stackIn_28_0;
          }
          var2_int = 29 % ((param0 + 28) / 51);
          stackIn_30_0 = Class.forName(param1);
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("il.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 10) {
          return false;
        }
        return true;
    }

    final static String a(String param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        ml var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!ef.a(var6, -9907)) {
            stackIn_3_0 = kq.field_Ib;
            return stackIn_3_0;
          }
          if (hm.a((byte) 86, param0)) {
            stackIn_7_0 = ec.field_g;
            return stackIn_7_0;
          }
          if (ts.field_d != 2) {
            stackIn_10_0 = pu.field_Ab;
            return stackIn_10_0;
          }
          if (hi.a(0, param0)) {
            stackIn_13_0 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, of.field_b, new String[]{param0});
            return stackIn_13_0;
          }
          if (ou.field_y >= 100) {
            stackIn_17_0 = an.field_f;
            return stackIn_17_0;
          }
          if (lf.a(param0, 108)) {
            stackIn_20_0 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, pt.field_i, new String[]{param0});
            return stackIn_20_0;
          }
          var5 = or.field_d;
          var5.b(param1, (byte) 97);
          var5.field_n = var5.field_n + 1;
          if (param2 <= 124) {
            stackIn_23_0 = (String) null;
            return stackIn_23_0;
          }
          var4 = var5.field_n;
          var5.a(112, 2);
          var5.a(14190, param0);
          var5.c(62, var5.field_n - var4);
          stackIn_25_0 = null;
          return (String) (stackIn_25_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("il.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        int var1 = 89 / ((param0 - 12) / 60);
        field_e = null;
    }

    static {
        field_b = 640;
        field_a = new tf();
        field_e = "<%0> has not yet unlocked this option for use.";
        field_h = 66;
    }
}
