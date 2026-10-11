/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class di extends af implements pa {
    static String[] field_h;
    static ci field_k;
    private ej field_j;
    static fa field_i;
    static int field_e;
    static String field_g;
    static uc field_l;
    static bg[] field_f;

    final static vg f(int param0) {
        if (param0 != -25177) {
          return (vg) null;
        }
        return cf.field_a;
    }

    abstract String a(String param0, int param1);

    public final boolean a(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 117) {
          this.e(-90);
        }
        stackIn_7_0 = (null == this.field_j.field_o) || (this.field_j.field_o.length() == 0);
        return stackIn_7_0;
    }

    public final void a(ej param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 83) {
            di.f(-63);
            this.c((byte) 106);
          } else {
            this.c((byte) 106);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("di.N(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final im e(int param0) {
        if (param0 != 0) {
          field_e = 120;
        }
        return this.b(this.field_j.field_o, 0);
    }

    public static void d(byte param0) {
        int var1 = -109 % ((72 - param0) / 50);
        field_h = null;
        field_i = null;
        field_g = null;
        field_f = null;
        field_k = null;
        field_l = null;
    }

    abstract im b(String param0, int param1);

    final static rh a(byte param0, int param1) {
        rh[] var2;
        int var3;
        int var4;
        rh[] var5;
        var4 = Terraphoenix.field_V;
        var5 = ch.c(param0 ^ -71);
        var2 = var5;
        var3 = 0;
        if (param0 != 33) {
          return (rh) null;
        }
        while (var3 < var5.length) {
          if (param1 == var5[var3].field_e) {
            return var5[var3];
          }
          var3++;
        }
        return null;
    }

    di(ej param0) {
        try {
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(int param0) {
        if (param0 != 0) {
          field_h = (String[]) null;
        }
        return this.a(this.field_j.field_o, -81);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ja.c((byte) -120);
        if (param2 != 16105) {
          field_k = (ci) null;
        }
        l.i(param4, param1, param0, param3);
    }

    public final void a(ej param0, boolean param1) {
        try {
          if (param1) {
            field_h = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "di.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = new String[]{"RoF: Best", "RoF: High", "RoF: Normal", "RoF: Slow", "RoF: Very Slow"};
        field_g = "Move to level ";
    }
}
