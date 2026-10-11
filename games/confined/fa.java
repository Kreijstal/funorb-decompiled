/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends rg {
    static int field_P;
    static String field_T;
    static ok field_Q;
    static int field_S;
    static double field_R;
    static nf field_U;

    private fa(String param0, fe param1, uk param2) {
        super(param0, param1, param2);
        try {
          this.field_n = bg.field_d.field_j;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        field_U = null;
        field_T = null;
        field_Q = null;
        if (param0 < 7) {
          fa.a(-85, -40, -71, -35, 20, -50, -67, 114, (byte) -55);
        }
    }

    final static void g(int param0) {
        if (param0 - mg.field_g != tg.field_H &&
          tg.field_H != 250 - mg.field_g) {
        }
        tg.field_H = tg.field_H + 1;
    }

    fa(String param0, uk param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_O = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static nf[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        int var14 = 0;
        int var9;
        nf[] var10;
        nf[] var11_ref_nf__;
        int var11;
        int var12;
        nf var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = Confined.field_J ? 1 : 0;
        var9 = param1 + param7 + param5;
        var10 = new nf[]{new nf(var9, var9), new nf(param0, var9), new nf(var9, var9), new nf(var9, param0), new nf(64, 64), new nf(var9, param0), new nf(var9, var9), new nf(param0, var9), new nf(var9, var9)};
        var11_ref_nf__ = var10;
        for (var12 = 0; var12 < var11_ref_nf__.length; var12++) {
          var13 = var11_ref_nf__[var12];
          for (var14 = 0; var14 < var13.field_z.length; var14++) {
            var13.field_z[var14] = param6;
          }
        }
        if (param8 >= -91) {
          field_T = (String) null;
        }
        for (var11 = 0; var11 < param1; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_z[var12Lifetime1 + (var9 - var11 - 1) * var9] = param2;
            var10[8].field_z[var12Lifetime1 + var9 * (-1 + var9 - var11)] = param2;
            var10[2].field_z[var12Lifetime1 * var9 - var11 - (1 - var9)] = param2;
            var10[8].field_z[var9 * var12Lifetime1 - var11 - (-var9 + 1)] = param2;
          }
        }
        for (var11Lifetime1 = 0; param1 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10[0].field_z[var12Lifetime2 + var11Lifetime1 * var9] = param3;
            var10[0].field_z[var11Lifetime1 + var9 * var12Lifetime2] = param3;
            if ((-var11Lifetime1 + var9) > var12Lifetime2) {
              var10[2].field_z[var12Lifetime2 + var9 * var11Lifetime1] = param3;
              var10[6].field_z[var9 * var12Lifetime2 + var11Lifetime1] = param3;
            }
          }
        }
        for (var11Lifetime2 = 0; param0 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param1; var12Lifetime3++) {
            var10[7].field_z[param0 * (var9 - (var12Lifetime3 + 1)) + var11Lifetime2] = param2;
            var10[5].field_z[var9 + (-1 - var12Lifetime3 + var11Lifetime2 * var9)] = param2;
            var10[1].field_z[var11Lifetime2 + var12Lifetime3 * param0] = param3;
            var10[3].field_z[var9 * var11Lifetime2 + var12Lifetime3] = param3;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param0 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param5; var12Lifetime4++) {
            var10[1].field_z[param0 * (-1 + var9 - var12Lifetime4) + var11Lifetime3] = param4;
            var10[3].field_z[-var12Lifetime4 + (-1 + var9) + var11Lifetime3 * var9] = param4;
            var10[7].field_z[var11Lifetime3 + var12Lifetime4 * param0] = param4;
            var10[5].field_z[var12Lifetime4 + var11Lifetime3 * var9] = param4;
          }
        }
        return var10;
    }

    private fa(String param0, uk param1) {
        this(param0, bg.field_d.field_h, param1);
        try {
          this.field_n = bg.field_d.field_j;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        int var2_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = -20 / ((-7 - param1) / 57);
          dl.a((java.awt.Component) ((Object) param0), (byte) -112);
          ak.a(0, (java.awt.Component) ((Object) param0));
          if (null != jc.field_c) {
            jc.field_c.a((java.awt.Component) ((Object) param0), (byte) -30);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 > -29) {
          field_Q = (ok) null;
        }
        return !fb.field_a.c(17237) ? true : false;
    }

    final static void a(boolean param0, java.awt.Component param1) {
        try {
          param1.addMouseListener(tf.field_a);
          param1.addMouseMotionListener(tf.field_a);
          param1.addFocusListener(tf.field_a);
          if (param0) {
            field_U = (nf) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_O = !this.field_O ? true : false;
        if (param0 != 25124) {
          fa.f(-89);
        }
        super.a(param0 ^ 0, param1, param2, param3);
    }

    static {
        field_S = 128;
        field_T = "Disruption cannon";
    }
}
