/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ua implements ql {
    private String[] field_C;
    static String[] field_E;
    static le[] field_F;
    private t[] field_A;
    static te field_D;
    static String[] field_z;
    private sh field_H;
    static String field_B;
    static String field_G;

    final static void k(int param0) {
        if (!ad.a(false)) {
          return;
        }
        jk.a(-95, false, param0);
    }

    final static void a(int param0, byte param1) {
        hi.field_c = param0 >> 4 & 3;
        int var2 = 51 / ((param1 + 78) / 35);
        if (!(hi.field_c <= 2)) {
          hi.field_c = 2;
        }
        o.field_a = (14 & param0) >> 2;
        if (2 < o.field_a) {
          o.field_a = 2;
        }
        ak.field_v = param0 & 3;
        if (!(ak.field_v <= 2)) {
          ak.field_v = 2;
        }
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        lc var4 = null;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          this.field_u.b((byte) 121);
          if (param0 != null &&
            0 != param0.length) {
            var3_int = param0.length;
            this.field_C = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_C[var4_int] = pj.a((byte) 83, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
            }
            var4 = new lc(t.field_z, 0, 1);
            this.field_A = new t[var3_int + 1];
            if (param1 != 560186724) {
              return;
            }
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_A[var5] = new t(this.field_C[var5], (of) (this));
              this.field_A[var5].field_h = (ml) ((Object) var4);
              this.field_A[var5].field_m = ad.field_j;
              this.field_A[var5].a(15, 13361, 0, 80, 20 + var5 * 16);
              this.b((byte) -104, this.field_A[var5]);
            }
            this.field_A[var3_int] = new t(lf.field_b, (of) (this));
            this.field_A[var3_int].field_h = (ml) ((Object) var4);
            this.field_A[var3_int].a(15, 13361, 0, 100, var3_int * 16 + 36);
            this.b((byte) -89, this.field_A[var3_int]);
            return;
          }
          this.field_C = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("cm.J(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    cm(sh param0) {
        super(0, 0, 0, 0, (ml) null);
        try {
          this.field_H = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_F = null;
        field_E = null;
        field_G = null;
        if (param0 < 104) {
          field_G = (String) null;
        }
        field_B = null;
        field_z = null;
        field_D = null;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, -20)) {
            return true;
          }
          if (98 == param2) {
            stackIn_5_0 = this.a((byte) 88, param0);
            return stackIn_5_0;
          }
          if (99 == param2) {
            stackIn_8_0 = this.b(param0, false);
            return stackIn_8_0;
          }
          var5_int = -16 % ((param3 - 37) / 50);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("cm.V(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        ta var5 = t.field_z;
        if (this.field_C != null) {
          var5.a(dh.field_a, this.field_r + param3, param2 + this.field_e, this.field_l, 20, 16777215, -1, 0, 0, var5.field_C + var5.field_D);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param3 != 7) {
            cm.d((byte) 77);
          }
          for (var6_int = 0; this.field_C.length > var6_int; var6_int++) {
            if (param4 == this.field_A[var6_int]) {
              this.field_H.a(this.field_C[var6_int], -94);
            }
          }
          if (param4 == this.field_A[this.field_C.length]) {
            this.field_H.a(param3 ^ 207);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("cm.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        le var1 = null;
        le var2 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1 = new le(540, 140);
          mc.a(param0 - 8512, var1);
          ig.b();
          ge.d();
          uj.field_i = 0;
          ec.b(-128);
          var2 = var1.d();
          for (var3 = 0; var3 < 15; var3++) {
            var2.e(-2, -2, 16777215);
            ge.b(4, 4, 0, 0, 540, 140);
          }
          ca.field_f.e();
          var1.e(0, 0);
          tj.b(653);
          if (param0 != 15) {
            field_E = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "cm.B(" + param0 + ')');
        }
    }

    static {
        field_z = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_D = new te(4, 1, 1, 1);
        field_B = "Names should contain a maximum of 12 characters";
    }
}
