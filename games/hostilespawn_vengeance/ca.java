/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca {
    static int field_a;
    static bd field_b;
    static int field_c;
    static int field_d;

    public static void a(int param0) {
        if (param0 == 1) {
          field_b = null;
          return;
        }
        gb var2 = (gb) null;
        ca.a((gb) null, (gb) null, (gb) null, 106);
        field_b = null;
    }

    final static boolean a(gb param0, gb param1, gb param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.a(-15879)) {
            return false;
          }
          if (!param2.a(param3 ^ -8088, "commonui")) {
            return false;
          }
          if (param3 != 0) {
            ca.a(-34);
          }
          if (param1.a(-15879) &&
            param1.a(-8088, "commonui")) {
            if (param0.a(param3 - 15879) &&
              param0.a(-8088, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ca.K(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(double param0, int param1, double param2, boolean param3, int param4) {
        if (param3) {
          dn.field_b = 0;
          bc.field_i = param2;
          of.field_d = dn.field_i;
          vi.field_h = param0;
          qi.field_N = param4;
          eh.field_c.a(lm.field_A[23], 100, wj.field_O);
          HostileSpawn.field_F = 1 == param1 ? true : false;
          return;
        }
        ca.a(-0.43438423387122027, 123, -0.7999001328488745, true, -39);
        dn.field_b = 0;
        bc.field_i = param2;
        of.field_d = dn.field_i;
        vi.field_h = param0;
        qi.field_N = param4;
        eh.field_c.a(lm.field_A[23], 100, wj.field_O);
        HostileSpawn.field_F = 1 == param1 ? true : false;
    }

    abstract void a(vi param0, int param1);

    abstract bl a(boolean param0);

    static {
        field_c = 0;
        field_d = 64;
    }
}
