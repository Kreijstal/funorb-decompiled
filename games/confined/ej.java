/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_c;
    static boolean field_b;
    static double[] field_a;
    static String field_d;

    final static l a(String param0, mi param1, mi param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        l stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.a(param4 ^ -37, param3);
          var6 = param1.a(var5_int, param0, -75);
          if (param4 != 0) {
            field_b = true;
          }
          stackIn_3_0 = te.a(param2, 10, var6, param1, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ej.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        ej.a((String) null, (mi) null, (mi) null, (String) null, -110);
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final boolean a(int param0) {
        if (param0 > -125) {
          String var3 = (String) null;
          ej.a((String) null, (mi) null, (mi) null, (String) null, 120);
          if (rh.field_ab == this) {
            return true;
          }
          if (this != fm.field_a) {
            return wd.field_f == this ? true : false;
          }
          return true;
        }
        if (rh.field_ab == this) {
          return true;
        }
        if (this == fm.field_a) {
          return true;
        }
        if (wd.field_f != this) {
          return false;
        }
        return true;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, String param1) {
        if (param0 == 0) {
          System.out.println("Error: " + pi.a("%0a", "\n", 22232, param1));
          return;
        }
        field_d = (String) null;
        System.out.println("Error: " + pi.a("%0a", "\n", 22232, param1));
    }

    static {
        field_b = true;
        field_c = "Create a free Account";
        field_a = new double[]{0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.3, 0.3, 0.1, 0.3, 0.1, 0.0, 0.0, 0.5, 0.2, 0.5, 0.2, 0.1, 0.2};
    }
}
