/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    private int field_h;
    private int field_g;
    private hf[] field_f;
    private int field_b;
    static int[] field_a;
    float field_i;
    static ci field_c;
    static String[] field_e;
    String field_d;

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, byte param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          var3 = null;
          if (null != wg.field_p &&
            !wg.field_p.equals(param1.getParameter("settings"))) {
            var3 = wg.field_p;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (null != qn.field_R &&
            !qn.field_R.equals(param1.getParameter("session"))) {
            var4Lifetime1 = qn.field_R;
          }
          if (param2 == -87) {
            stackIn_11_0 = va.a((String) (var3), -148, param0, -1, (String) (var4Lifetime1));
            return stackIn_11_0;
          }
          stackIn_9_0 = (java.net.URL) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("rh.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        hf var2;
        int var3;
        hf var4;
        var3 = Chess.field_G;
        while (this.field_b < this.field_h) {
          var4 = this.field_f[this.field_b];
          var2 = var4;
          if (!var4.field_c.c((byte) 123)) {
            this.a(var4, 0, param0 ^ 48);
            return false;
          }
          if (var4.field_f >= 0 &&
            !var4.field_c.a(var4.field_f, (byte) -72)) {
            this.a(var2, var4.field_c.c(var4.field_f, -85), 118);
            return false;
          }
          if (var4.field_e != null &&
            !var4.field_c.b(var4.field_e, param0 ^ -101)) {
            this.a(var2, var4.field_c.c(var4.field_e, 0), param0 ^ 25);
            return false;
          }
          if (var4.field_f < 0 &&
            null == var4.field_e &&
            var4.field_d != null &&
            !var4.field_c.b((byte) -40)) {
            this.a(var2, var4.field_c.a((byte) -72), 119);
            return false;
          }
          this.field_b = this.field_b + 1;
        }
        if (param0 == -1) {
        }
        return true;
    }

    final static void a(int param0, int param1) {
        nk var2 = qn.field_U;
        var2.f(param1, param0 ^ -117);
        var2.c(1, (byte) 86);
        var2.c(param0, (byte) 45);
    }

    private final void a(hf param0, int param1, int param2) {
        float var4_float = 0.0f;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var5 = -39 % ((57 - param2) / 57);
          var4_float = (float)(1 + this.field_b) + (float)param1 / 100.0f;
          this.field_i = (float)this.field_g * var4_float / (float)(1 + this.field_h);
          if (param1 == 0) {
            this.field_d = param0.field_b;
          } else {
            this.field_d = param0.field_d + " - " + param1 + "%";
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("rh.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static km[] a(km[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        km var3 = null;
        int var4 = 0;
        lh var5 = null;
        km[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            var3 = param0[var2_int];
            param0[var2_int].field_r = 0;
            var3.field_s = 0;
            param0[var2_int].field_v = param0[var2_int].field_w;
            param0[var2_int].field_u = param0[var2_int].field_t;
          }
          if (param1 != -9568) {
            var5 = (lh) null;
            rh.a(-18, 113, (lh) null, -30, 5, -1, -31, -128, (le) null, 37, (le) null, (le) null, 40, 88, 107, (lh) null, -119, (byte) -45, 84, -5);
          }
          stackIn_7_0 = (km[]) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("rh.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        if (param0 <= 95) {
          lh var2 = (lh) null;
          rh.a(32, 87, (lh) null, 23, -22, -34, -8, 31, (le) null, 115, (le) null, (le) null, 85, -66, 50, (lh) null, 94, (byte) 105, 6, 74);
        }
    }

    private rh() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, lh param2, int param3, int param4, int param5, int param6, int param7, le param8, int param9, le param10, le param11, int param12, int param13, int param14, lh param15, int param16, byte param17, int param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          if (param17 >= -122) {
            return;
          }
          vl.field_M = param15;
          sj.field_d = param2;
          ql.a(param13, param3, param5, param9, (byte) 66);
          r.a(param19, (byte) -87, param7, param10);
          eg.a(param4, param12, param1, param8, param11, 4);
          ed.a(param6, param18, (byte) -79);
          ca.a(param16, (byte) 107, param14, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("rh.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param11 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(')').toString());
        }
    }

    static {
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = new int[]{6523921, 3419144};
    }
}
