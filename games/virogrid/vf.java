/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_d;
    static on field_b;
    static aj field_f;
    static String field_a;
    static km field_e;
    static int field_c;

    final static void a(int param0) {
        if (param0 == -64) {
          gk.field_g.g(62, 8);
          gk.field_g.a(123, 117);
          return;
        }
        vf.a(true);
        gk.field_g.g(62, 8);
        gk.field_g.a(123, 117);
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_f = null;
        if (!param0) {
          field_e = null;
          field_a = null;
          return;
        }
        field_d = (String) null;
        field_e = null;
        field_a = null;
    }

    final static hh a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        hh stackIn_6_0 = null;
        hh stackIn_10_0 = null;
        hh stackIn_19_0 = null;
        hh stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 != 8286) {
            field_d = (String) null;
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = a.field_H;
            return stackIn_6_0;
          }
          if (var2_int > 63) {
            stackIn_10_0 = cb.field_a;
            return stackIn_10_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var3 == -1 + var2_int) {
                stackIn_19_0 = jj.field_f;
                return stackIn_19_0;
              }
            } else {
              if (ae.field_f.indexOf(var4) == -1) {
                stackIn_22_0 = jj.field_f;
                return stackIn_22_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("vf.A(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "Both players have the same number of pieces";
        field_b = new on();
        field_a = "Try again";
        field_c = 360;
    }
}
