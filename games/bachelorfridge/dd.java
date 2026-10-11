/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends vd implements lja {
    private String[] field_F;
    static String field_G;
    private uja field_D;
    private hf[] field_E;
    static boolean field_H;

    dd(uja param0) {
        super(0, 0, 0, 0, (qda) null);
        try {
          this.field_D = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BachelorFridge.field_y;
        try {
          for (var6_int = 0; this.field_F.length > var6_int; var6_int++) {
            if (this.field_E[var6_int] == param1) {
              this.field_D.a(this.field_F[var6_int], (byte) -114);
            }
          }
          if (param1 == this.field_E[this.field_F.length]) {
            this.field_D.a(14322);
          }
          if (param3 > 50) {
            return;
          }
          this.a((byte) -38, -88, -30, 94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("dd.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void d(byte param0) {
        String var2 = (String) null;
        rt.a("", (String) null, 9);
        if (param0 >= -10) {
          field_H = true;
        }
    }

    final void a(String[] param0, byte param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        pka var4 = null;
        int var6 = 0;
        wj var7 = null;
        var6 = BachelorFridge.field_y;
        try {
          this.field_A.d(67);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_F = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_F[var4_int] = lu.a((CharSequence) ((Object) param0[var4_int]), 7995).replace(' ', ' ');
            }
            var4 = new pka(jca.field_a, 0, 1);
            this.field_E = new hf[1 + var3_int];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_E[var5] = new hf(this.field_F[var5], (pl) (this));
              this.field_E[var5].field_f = (qda) ((Object) var4);
              this.field_E[var5].field_h = a.field_p;
              this.field_E[var5].a(0, 15, (byte) 59, 80, 16 * var5 + 20);
              this.c(this.field_E[var5], -125);
            }
            this.field_E[var3_int] = new hf(mt.field_t, (pl) (this));
            this.field_E[var3_int].field_f = (qda) ((Object) var4);
            this.field_E[var3_int].a(0, 15, (byte) 59, 100, 20 + var3_int * 16 + 16);
            if (param1 >= -19) {
              var7 = (wj) null;
              this.a(28, 90, '￺', (wj) null);
            }
            this.c(this.field_E[var3_int], 112);
            return;
          }
          this.field_F = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("dd.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 0) {
          field_H = true;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) 108, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        int var6 = -102 / ((-20 - param0) / 54);
        po var5 = jca.field_a;
        if (this.field_F == null) {
          return;
        }
        var5.a(oja.field_b, this.field_s + param3, this.field_v + param1, this.field_p, 20, 16777215, -1, 0, 0, var5.field_u + var5.field_B);
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0 ^ 0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(-124, param3);
            return stackIn_6_0;
          }
          if (param0 != 10) {
            this.a((byte) 70, -46, 111, 92);
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.b(param3, 1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("dd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_H = false;
    }
}
