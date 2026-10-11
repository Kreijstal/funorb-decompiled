/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static int field_c;
    static int field_g;
    static String field_f;
    static int field_h;
    static int[] field_j;
    static int[] field_i;
    static String[] field_d;
    static eb field_e;
    static String field_b;
    static qc field_a;

    final static boolean a(int param0, int param1) {
        if (param1 == -1) {
          return true;
        }
        if (param0 == -12663) {
          return (pl.field_U & 1 << param1) != 0 ? true : false;
        }
        field_f = (String) null;
        return (pl.field_U & 1 << param1) != 0 ? true : false;
    }

    final static void a(String param0, String[] param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        try {
          o.field_l = ta.field_m;
          var4_int = 63 / ((-39 - param3) / 62);
          if (255 == param2) {
            stackIn_5_0 = !(u.field_k >= 13);
            hi.field_d = dg.a(stackIn_5_0, 0);
            return;
          }
          if (param2 < 100) {
            hi.field_d = fb.a(param2, true, param0);
            return;
          }
          if (105 >= param2) {
            hi.field_d = gj.a(true, param1);
            return;
          }
          hi.field_d = fb.a(param2, true, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("pk.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (10 == eg.field_d) {
          ki.f(107);
          eg.field_d = 11;
        } else {
          if (!fa.a(-72)) {
            ki.f(107);
            eg.field_d = 11;
          }
        }
        if (param0 != 4) {
          pk.a(105, -118);
        }
        b.field_v = true;
    }

    public static void a(byte param0) {
        field_e = null;
        field_j = null;
        field_b = null;
        field_i = null;
        if (param0 > 25) {
          field_a = null;
          field_f = null;
          field_d = null;
          return;
        }
        pk.a(75);
        field_a = null;
        field_f = null;
        field_d = null;
    }

    static {
        field_f = "Passwords can only contain letters and numbers";
        field_h = 100;
        field_i = new int[4];
        field_e = new eb();
    }
}
