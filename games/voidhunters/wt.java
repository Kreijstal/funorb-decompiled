/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt {
    static String field_b;
    static String field_c;
    static volatile int field_a;

    final synchronized static long a(boolean param0) {
        long var1 = System.currentTimeMillis();
        if (dfb.field_q > var1) {
          eib.field_p = eib.field_p + (-var1 + dfb.field_q);
          dfb.field_q = var1;
          if (param0) {
            field_b = (String) null;
            return var1 + eib.field_p;
          }
          return var1 + eib.field_p;
        }
        dfb.field_q = var1;
        if (!param0) {
          return var1 + eib.field_p;
        }
        field_b = (String) null;
        return var1 + eib.field_p;
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          dn.field_r = gka.field_o;
          if (param0 == 255) {
            stackIn_11_0 = !(iua.field_p >= 13);
            cjb.field_b = rv.a(stackIn_11_0, param1 ^ -19341);
          } else {
            if (param0 < 100) {
              cjb.field_b = tma.a(param0, param3, (byte) -124);
            } else {
              if (param0 <= 105) {
                cjb.field_b = wm.a(param2, (byte) -122);
              } else {
                cjb.field_b = tma.a(param0, param3, (byte) -124);
              }
            }
          }
          if (param1 == -19342) {
            return;
          }
          field_c = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("wt.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 > -97) {
          wt.a(-106);
        }
    }

    static {
        bcb discarded$0 = new bcb();
        field_b = "<%0>'s game";
        field_c = "Full";
        field_a = -1;
    }
}
