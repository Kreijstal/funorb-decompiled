/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static String[] field_d;
    static mf field_a;
    static int[] field_e;
    static fc field_g;
    static volatile int field_b;
    static int field_c;
    static String field_f;

    final static int b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_intLifetime1;
        var2 = fleas.field_A ? 1 : 0;
        try {
          nb.field_a.a(gh.field_p, 91, true, mk.field_h);
          nb.field_a.d(true);
          while (wf.b(-111)) {
            nb.field_a.a(id.field_b, (byte) -37, ji.field_a);
          }
          if (-1 != cl.field_b) {
            var1_int = cl.field_b;
            cg.a((byte) -105, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (ah.field_c) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (wi.field_f == ui.field_kb) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!uc.field_c.a(-45)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          var1_intLifetime1 = -26 / ((75 - param0) / 48);
          if (wi.field_f != cb.field_v) {
            return -1;
          }
          stackIn_22_0 = 2;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "fb.D(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, ih param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 98) {
            stackIn_6_0 = (1 == param1.b(1, (byte) -87));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("fb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_e = null;
        field_g = null;
        field_d = null;
        int var1 = 101 % ((param0 + 55) / 52);
    }

    final static bi[] a(rh param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bi[] stackIn_2_0 = null;
        bi[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(param2, (byte) -100);
          if (param1 != 45) {
            stackIn_2_0 = (bi[]) null;
            return stackIn_2_0;
          }
          var5 = param0.a(param3, (byte) -15, var4_int);
          stackIn_4_0 = be.a(var5, var4_int, -1, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("fb.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_g = new fc();
        field_f = "Fleas: <%0>/<%1>";
    }
}
