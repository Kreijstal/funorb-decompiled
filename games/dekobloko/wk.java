/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wk extends fm {
    static String field_k;
    static String field_n;
    static String field_j;
    static String field_g;
    static ji field_q;
    private String field_h;
    static boolean field_i;
    private long field_m;
    static String field_p;
    static ck field_l;
    static String field_o;

    final static void a(byte param0, tj param1) {
        tj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          param1.b((byte) 111);
          var2 = (tj) (i.field_b.c((byte) -61));
          while (var2 != null) {
            if (var2.a(-985, param1)) {
              var2 = (tj) (i.field_b.d(true));
              continue;
            }
            break;
          }
          if (param0 <= 3) {
            wk.c(31);
          }
          if (var2 != null) {
            fm.$cfr$intArgs$a$a7487eb591c0(114, param1, var2);
            return;
          }
          i.field_b.a(param1, 2777);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("wk.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int b(int param0) {
        if (param0 != 3) {
          field_k = (String) null;
          return -ad.field_a + fb.field_f;
        }
        return -ad.field_a + fb.field_f;
    }

    gh a(int param0) {
        if (param0 != 18) {
          ff var3 = (ff) null;
          wk.a(124, -86, (ff) null);
          return ui.field_t;
        }
        return ui.field_t;
    }

    final static void a(int param0, int param1, ff param2) {
        try {
          if (param0 != 3) {
            field_i = false;
          }
          cd.field_c.a(param2, 2777);
          mc.a(true, param2, param1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wk.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        var3 = -84 / ((param0 - 5) / 54);
        var4 = param1;
        if (0 == var4) {
          da.a(param2, true);
          return;
        }
        if (var4 == 1) {
          h.a(param2, false);
          return;
        }
        if (var4 == 2) {
          bl.b(param2, 12618);
          return;
        }
        if (3 != var4) {
          return;
        }
        uf.g(param2, -2093);
    }

    final void a(wl param0, byte param1) {
        param0.a(this.field_m, (byte) 0);
        if (param1 < 34) {
          return;
        }
        try {
          param0.a(this.field_h, true);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_g = null;
        if (param0 == 7751) {
          field_q = null;
          field_p = null;
          field_j = null;
          field_k = null;
          field_l = null;
          field_n = null;
          return;
        }
        ff var2 = (ff) null;
        wk.a(12, -125, (ff) null);
        field_q = null;
        field_p = null;
        field_j = null;
        field_k = null;
        field_l = null;
        field_n = null;
    }

    wk(long param0, String param1) {
        try {
          this.field_m = param0;
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "<%0> has entered a game.";
        field_n = "Send private message";
        field_o = "Remove name";
        field_k = "Offensive account name";
        field_j = "Searching for an opponent";
        field_p = "Message lobby";
    }
}
