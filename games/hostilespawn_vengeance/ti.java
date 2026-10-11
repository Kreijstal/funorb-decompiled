/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti implements nn {
    private int field_g;
    static oc field_f;
    static String field_d;
    private int field_e;
    private vm field_h;
    static bd field_c;
    static String[] field_a;
    static String field_i;
    static bd field_j;
    static fk field_b;

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        field_c = null;
        field_j = null;
        if (param0 == 70) {
          field_a = null;
          field_i = null;
          return;
        }
        ti.a((byte) -81);
        field_a = null;
        field_i = null;
    }

    public ti() {
        this.field_e = 1;
        this.field_g = 1;
        this.field_h = jd.field_s;
    }

    final static int a(byte param0) {
        if (param0 != -1) {
          return -63;
        }
        return wc.field_m;
    }

    final static void a(int param0, byte param1, int param2) {
        if (0 > param2) {
          return;
        }
        if (param2 >= 42) {
          return;
        }
        if (hb.a(param2, uk.field_c, false)) {
          return;
        }
        q.field_n = q.field_n + lg.field_m;
        fa.field_a = fa.field_a + 1;
        int[] var6 = uk.field_c;
        int[] var3 = var6;
        int var4 = param2;
        var6[var4 >> 5] = ll.a(var6[var4 >> 5], 1 << ua.a(31, var4));
        int[] var7 = bm.field_b;
        var3 = var7;
        var4 = param2;
        var7[var4 >> 5] = ll.a(var7[var4 >> 5], 1 << ua.a(var4, 31));
        int var5 = 20 / ((-70 - param1) / 40);
        ac.field_i.a(new t(param2), 90);
        if (!ta.p(3)) {
          ec.a(in.field_b, fa.field_a, true, 4, lg.field_m, param0, q.field_n, param2);
          sg.field_j = wk.a(4, -2178);
          return;
        }
        vl.field_c.a(new hm(param2, param0, q.field_n, in.field_b, lg.field_m, fa.field_a), 89);
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!param3.field_u &&
            !param3.g(-9015)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          if (param2 != 15430) {
            return;
          }
          this.field_h.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_n + "</u>", param1 + param3.field_v, param0 + param3.field_m, param3.field_s, param3.field_x, var6_int, -1, this.field_e, this.field_g, this.field_h.field_y + this.field_h.field_F);
          if (param3.g(param2 - 24445)) {
            var7 = this.field_h.a(param3.field_n);
            var8 = this.field_h.field_y + this.field_h.field_F;
            var9 = param1 + param3.field_v;
            var10 = param3.field_m + param0;
            if (this.field_e == 2) {
              var9 = var9 + (-var7 + param3.field_s);
            } else {
              if (this.field_e == 1) {
                var9 = var9 + (param3.field_s - var7 >> 1);
              }
            }
            if (this.field_g == 2) {
              var10 = var10 + (-var8 + param3.field_x);
            } else {
              if (this.field_g == 1) {
                var10 = var10 + (param3.field_x - var8 >> 1);
              }
            }
            bh.a(var8, 2 + var10, (byte) 65, var9 - 2, var7 + 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("ti.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    ti(vm param0, int param1, int param2) {
        try {
          this.field_h = param0;
          this.field_e = param1;
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static kb b(byte param0) {
        try {
          Throwable var1 = null;
          kb stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 > -50) {
            ti.a(109);
          }
          try {
            stackIn_3_0 = (kb) (Class.forName("ol").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = new oc();
        field_c = new bd(270, 70);
        field_i = "Invalid password.";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_b = new fk();
    }
}
