/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static long[] field_b;
    static String field_a;
    static String field_c;
    static int field_d;

    final static int a(boolean param0) {
        if (!param0) {
          mi.a(-77);
          return 3;
        }
        return 3;
    }

    final static int a(int param0, lk[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (param2 != 1) {
            stackIn_3_0 = -33;
            return stackIn_3_0;
          }
          var3_int = 0;
          while (true) {
            if (-1 + param1.length <= var3_int) {
              stackIn_11_0 = param1.length - 1;
              return stackIn_11_0;
            }
            if (param1[1 + var3_int].field_f <= -1 + param0) {
              var3_int++;
              continue;
            }
            break;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("mi.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_c = (String) null;
          field_c = null;
          field_a = null;
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static boolean a(long param0, String param1, byte param2, int param3, int[] param4) {
        bb var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cb.a(param3, param1, (byte) -75, param4, param0)) {
            return false;
          }
          if (1 == param3) {
            param3 = 0;
          }
          at.field_Kb = param1;
          ov.field_b = param3;
          var7 = (CharSequence) ((Object) param1);
          qi.field_o = mo.a(0, var7);
          if (param2 < 114) {
            field_d = -66;
          }
          ik.field_A = param0;
          var6 = te.a(-94, fr.field_E, param4, ic.field_a, ve.field_S);
          ad.a(var6, (byte) -115);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("mi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_b = new long[32];
        field_a = "Who can join";
        field_c = "Try again";
    }
}
