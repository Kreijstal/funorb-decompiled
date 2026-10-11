/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static String field_b;
    static int field_d;
    static boolean[][] field_c;
    static String field_a;

    final static ge a(int param0, int param1, int param2, r param3, r param4) {
        RuntimeException var5 = null;
        ge stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!hq.a(124, param0, param1, param3)) {
            return null;
          }
          if (param2 != -1) {
            vg.a(-31, 13, -101, -83);
          }
          stackIn_6_0 = w.a(param4.a(param0, param1, (byte) -114), true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("vg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param0 != -4151) {
          vg.a(-8, 109, 103, -122);
          if (param1 < 0) {
            return false;
          }
          if (param1 > 11) {
            return false;
          }
          if (param2 < 1) {
            return false;
          }
          if (gf.b(param1, param3, param0 - 24480) >= param2) {
            return true;
          }
          return false;
        }
        if (param1 < 0) {
          return false;
        }
        if (param1 > 11) {
          return false;
        }
        if (param2 < 1) {
          return false;
        }
        if (gf.b(param1, param3, param0 - 24480) >= param2) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_c = (boolean[][]) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_c = (boolean[][]) null;
        field_c = (boolean[][]) null;
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Create a free account to start using this feature";
        field_c = new boolean[][]{new boolean[]{true, false}, new boolean[]{false, false, false, false, false, false, false, false}, new boolean[]{false, false, false, true}};
        field_a = "Off";
    }
}
