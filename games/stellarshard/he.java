/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends gg {
    static String field_k;
    static String field_o;
    static String field_l;
    boolean field_n;
    int[] field_m;

    public static void a(byte param0) {
        field_k = null;
        field_o = null;
        int var1 = -67 / ((param0 - 35) / 55);
        field_l = null;
    }

    final static Class b(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
        Class stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1 >= -52) {
            stackIn_6_0 = (Class) null;
            return stackIn_6_0;
          }
          if (param0.equals("I")) {
            stackIn_10_0 = Integer.TYPE;
            return stackIn_10_0;
          }
          if (param0.equals("S")) {
            stackIn_13_0 = Short.TYPE;
            return stackIn_13_0;
          }
          if (param0.equals("J")) {
            stackIn_16_0 = Long.TYPE;
            return stackIn_16_0;
          }
          if (param0.equals("Z")) {
            stackIn_20_0 = Boolean.TYPE;
            return stackIn_20_0;
          }
          if (param0.equals("F")) {
            stackIn_24_0 = Float.TYPE;
            return stackIn_24_0;
          }
          if (param0.equals("D")) {
            stackIn_27_0 = Double.TYPE;
            return stackIn_27_0;
          }
          if (!param0.equals("C")) {
            stackIn_32_0 = Class.forName(param0);
            return stackIn_32_0;
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("he.B(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    final static pb[] a(byte param0, int param1) {
        pb[] var3 = null;
        pb[] var2 = null;
        pb[] var3Lifetime1;
        pb[] var2Lifetime1;
        if (param0 <= -107) {
          var3 = new pb[9];
          var2 = var3;
          var3[4] = cl.a(param1, 1, 64);
          return var2;
        }
        field_k = (String) null;
        var3Lifetime1 = new pb[9];
        var2Lifetime1 = var3Lifetime1;
        var3Lifetime1[4] = cl.a(param1, 1, 64);
        return var2Lifetime1;
    }

    he() {
        this.field_n = false;
    }

    static {
        field_k = "Shoots all round";
        field_o = "Waiting for models";
        field_l = "Heavy cannon";
    }
}
