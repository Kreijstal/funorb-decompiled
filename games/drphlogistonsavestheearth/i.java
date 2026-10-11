/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static bb field_b;
    static int field_a;
    static int[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 < -54) {
          return;
        }
        field_b = (bb) null;
    }

    final static void a(od param0, od param1, java.math.BigInteger param2, java.math.BigInteger param3, int param4) {
        try {
          hb.a(param1.field_h, param3, param2, (byte) -41, param1.field_j, param4, param0);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "i.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        gi var2 = null;
        int var3 = 0;
        je var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4 = (je) (aa.field_e.h(-11151));
          if (param1 != 0) {
            field_c = (int[]) null;
          }
          while (var4 != null) {
            hl.a(var4, 122, param0);
            var4 = (je) (aa.field_e.e(param1 ^ 0));
          }
          var2 = ql.field_i.h(-11151);
          while (var2 != null) {
            bj.a(param1 ^ 2591, param0);
            var2 = ql.field_i.e(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "i.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        java.math.BigInteger var3 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_22_0 = null;
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
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param1.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param1.equals("Z")) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (param0 != -32512) {
            var3 = (java.math.BigInteger) null;
            i.a((od) null, (od) null, (java.math.BigInteger) null, (java.math.BigInteger) null, -76);
          }
          if (param1.equals("F")) {
            stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (param1.equals("D")) {
            stackIn_25_0 = Double.TYPE;
            return stackIn_25_0;
          }
          if (!param1.equals("C")) {
            stackIn_30_0 = Class.forName(param1);
            return stackIn_30_0;
          }
          stackIn_28_0 = Character.TYPE;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("i.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    static {
        field_a = 0;
        field_b = new bb();
        field_c = new int[64];
    }
}
