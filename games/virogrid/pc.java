/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_d;
    static String field_a;
    static String field_c;
    static long field_b;
    static String field_e;

    final static vh a(eh param0, int param1, String param2, String param3, eh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        vh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.a(param1, param2);
          var6 = param0.a(-70, var5_int, param3);
          stackIn_1_0 = ie.a(false, var6, var5_int, param0, param4);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("pc.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(mg param0, byte param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ij var2 = null;
        RuntimeException var2_ref = null;
        rm[] var3 = null;
        rm var4 = null;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          pj.a(param0, 256);
          if (db.b((byte) 13, 0) &&
            sh.a(4712, 100) != 0) {
            df.b(0, 0, 200, 400, 0);
            ul.b((byte) 96);
            return;
          }
          df.b(0, 0, 200, 400, 8421504);
          if (param1 > -24) {
            pc.a(111);
          }
          var2 = (ij) (sk.field_a.a((byte) -98));
          while (var2 != null) {
            if (0 == var2.field_g) {
              var3 = tk.field_d;
            } else {
              if (1 != var2.field_g) {
                var3 = wh.field_b;
              } else {
                var3 = ic.field_y;
              }
            }
            var4 = var3[var2.field_o / 3];
            var4.field_m[1] = var2.field_l * 65793;
            if (!var2.field_p) {
              var4.b(-31, 200);
            } else {
              var4.a(-31, 200);
            }
            var2 = (ij) (sk.field_a.a(16213));
          }
          ul.b((byte) 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("pc.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        if (param0 != -30114) {
          field_b = -39L;
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_a = "Create a free account to";
        field_c = "Show all game chat";
        field_e = "Your opponent is <%0>.";
        field_d = "Email (Login):";
    }
}
