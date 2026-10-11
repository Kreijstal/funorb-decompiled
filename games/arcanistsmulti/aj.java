/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static String[] field_a;
    int field_e;
    static String field_b;
    static kc field_d;
    static String field_i;
    int field_c;
    static String field_f;
    static int field_g;
    static i field_h;

    final static mi a(nf param0, int param1) {
        mi var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        mi stackIn_3_0 = null;
        mi stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = (mi) (uh.field_n.c(true));
          if (var2 == null) {
            stackIn_3_0 = new mi(param0);
            return stackIn_3_0;
          }
          var3 = -18 / ((param1 - 64) / 43);
          var2.a(-117, param0);
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("aj.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, int param1) {
        if (param0 == 28139) {
          return param1 >= 2 ? true : false;
        }
        aj.a(120);
        return param1 >= 2 ? true : false;
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        if (param0 != 20028) {
          return;
        }
        field_i = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static mi a(ml param0, int param1, boolean param2, int param3, nf param4, int param5) {
        RuntimeException var6 = null;
        mi stackIn_2_0 = null;
        mi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            stackIn_4_0 = j.a(param0, param1, (byte) -116, param4, -1, param5, param3);
            return stackIn_4_0;
          }
          stackIn_2_0 = (mi) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("aj.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    aj(int param0, int param1, int param2, int param3) {
        this.field_c = param0;
        this.field_e = param3;
    }

    static {
        field_b = "Wands to buy:<nbsp>5";
        field_i = "Press TAB to chat or F10 to open Quick Chat.";
        field_a = new String[]{"Turn time (seconds)", "Map style", "Game mode"};
        field_f = "Fire 101";
        field_g = 22;
    }
}
