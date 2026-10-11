/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tk extends o {
    static String field_l;
    int field_p;
    int field_k;
    int field_t;
    static int field_m;
    int field_s;
    static double field_q;
    int field_o;
    int field_u;
    static int field_n;
    static String[] field_r;

    final static boolean a(ki param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26810) {
            tk.e(4);
          }
          stackIn_3_0 = param0.c(7715);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tk.GB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static boolean a(boolean param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          try {
            if (!be.field_c.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (!param0) {
              field_q = -0.3493091103426665;
            }
            for (var3 = 0; var3 < param1.length(); var3++) {
              if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("tk.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 != -31028) {
          return;
        }
        field_r = null;
        field_l = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_s << 3;
        if (param0 > -84) {
          return;
        }
        int var7 = this.field_t << 3;
        param1 = (param1 << 4) + (var6 & 15);
        param2 = (param2 << 4) + (var7 & 15);
        this.a(var6, var7, param1, param2, param3, param4);
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10) {
            tk.e(8);
          }
          stackIn_3_0 = we.a(10, 87, param1, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tk.OB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 2093920872) {
          String var7 = (String) null;
          tk.a(false, (String) null);
        }
        this.a(-102, param3, param4, param1 << 8, param2 << 5);
    }

    tk() {
    }

    static {
        field_l = "Retry";
        field_q = 0.0;
        field_r = new String[]{"Access the new turrets!", "Challenging levels!", "Diabolical bosses!"};
        field_n = 0;
    }
}
