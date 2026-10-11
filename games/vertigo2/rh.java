/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends cj implements ij {
    static int[] field_O;
    static cr field_I;
    private int field_N;
    private d[] field_P;
    private cc field_M;
    static int field_H;
    private int[] field_J;
    static String field_E;
    static int field_F;
    static String field_G;
    private String field_K;
    private fj field_L;

    private final void c(int param0, int param1) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (this.field_N >= param1) {
          return;
        }
        d[] var7 = new d[param1];
        d[] var3 = var7;
        int[] var4 = new int[param1];
        if (param0 != 27812) {
          this.field_J = (int[]) null;
        }
        for (var5 = 0; this.field_N > var5; var5++) {
          var7[var5] = this.field_P[var5];
          var4[var5] = this.field_J[var5];
        }
        this.field_J = var4;
        this.field_P = var3;
        this.field_N = param1;
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = this.field_N;
          this.c(27812, var4_int + 1);
          this.field_P[var4_int] = this.a(param0, (uf) (this), -121);
          this.field_J[var4_int] = param1;
          if (param2 >= -24) {
            field_I = (cr) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("rh.J(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        this.field_M.a(this.field_K, 14 + (param2 + this.field_o), 10 + (param3 + this.field_t), this.field_n - 28, this.field_s, 16777215, -1, 0, 0, this.field_M.field_z);
        if (param0) {
          rh.b(81, -4);
        }
    }

    rh(fj param0, cc param1, String param2) {
        super(0, 0, 288, 0, (ur) null);
        int var4_int = 0;
        this.field_N = 0;
        try {
          this.field_L = param0;
          this.field_M = param1;
          this.field_K = param2;
          var4_int = this.field_K != null ? this.field_M.a(this.field_K, 260, this.field_M.field_z) : 0;
          this.a(false, 0, 0, 22 + var4_int, 288);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -98 % ((param0 - 48) / 47);
        field_I = null;
        field_G = null;
        field_O = null;
        field_E = null;
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param1.charAt(0);
          for (var3 = 1; var3 < param1.length(); var3++) {
            if (~var2_int != ~param1.charAt(var3)) {
              return false;
            }
          }
          if (param0 != 288) {
            field_G = (String) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("rh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(byte param0, int param1, char param2) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        if (param0 >= -93) {
          return (String) null;
        }
        for (var4 = 0; param1 > var4; var4++) {
          var6[var4] = param2;
        }
        return new String(var6);
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          var7 = 86 / ((-63 - param2) / 51);
          for (var6_int = 0; this.field_N > var6_int; var6_int++) {
            if (this.field_P[var6_int] != param1) {
              continue;
            }
            var8 = this.field_J[var6_int];
            if (var8 != -1) {
              rh.b(-14, this.field_J[var6_int]);
            } else {
              this.field_L.h((byte) 56);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("rh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean e(byte param0) {
        if (param0 != 99) {
          field_I = (cr) null;
        }
        return ii.field_z;
    }

    final d a(String param0, uf param1, int param2) {
        d var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        d stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -99) {
            this.field_N = 47;
          }
          var4 = new d(param0, param1);
          var4.field_B = (ur) ((Object) new vo());
          var5 = -2 + this.field_s;
          this.a(false, 0, 0, this.field_s + 34, this.field_n);
          var4.a(false, 7, var5, 30, -14 + this.field_n);
          this.c((byte) 116, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("rh.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        if (param0 != -14) {
          rh.b(-7, 112);
        }
        nm.field_F = param1;
    }

    final static er[] a(er param0, int param1) {
        er[] var2 = null;
        RuntimeException var2_ref = null;
        er[] var3 = null;
        er[] stackIn_2_0 = null;
        er[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new er[9];
          var2 = var3;
          if (param1 != -27140) {
            stackIn_2_0 = (er[]) null;
            return stackIn_2_0;
          }
          var3[4] = param0;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("rh.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_E = "Standard Game";
        field_H = 0;
        field_G = "blue died";
    }
}
