/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class beb implements dja {
    static int field_a;

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
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
          if (param0.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1 != 99) {
            stackIn_13_0 = (Class) null;
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
            stackIn_23_0 = Float.TYPE;
            return stackIn_23_0;
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
          stackIn_35_1 = new StringBuilder().append("beb.D(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    public final tv a(byte param0) {
        int var2 = 66 % ((param0 + 64) / 50);
        return (tv) ((Object) new tj());
    }

    final static tv a(byte[] param0, int param1, dja param2) {
        faa var3 = null;
        RuntimeException var3_ref = null;
        tv var4 = null;
        tv stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var3 = new faa(param0);
          if (param1 != 6429) {
            field_a = 26;
          }
          var4 = param2.a((byte) 52);
          var3.p(-23497);
          var4.a(var3, false);
          var3.f((byte) -87);
          stackIn_6_0 = var4;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("beb.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (tv[]) null;
        }
        return (tv[]) ((Object) new tj[param1]);
    }

    static {
    }
}
