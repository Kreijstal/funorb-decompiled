/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends ua implements ql {
    static int field_G;
    private t[] field_B;
    private int[] field_z;
    private String field_E;
    private ha field_H;
    private int field_C;
    private ta field_A;
    static int[] field_D;
    static String field_F;

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param3 != 7) {
            this.a(-78, -17, -121, 56);
          }
          for (var6_int = 0; var6_int < this.field_C; var6_int++) {
            if (this.field_B[var6_int] != param4) {
              continue;
            }
            var7 = this.field_z[var6_int];
            if (var7 == -1) {
              this.field_H.g((byte) -75);
            } else {
              qh.a(this.field_z[var6_int], true);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("sk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, String param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_C;
          this.a(var4_int + 1, -101);
          int var5 = -96 / ((param0 - 55) / 36);
          this.field_B[var4_int] = this.a(0, (of) (this), param2);
          this.field_z[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "sk.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(boolean param0) {
        field_D = null;
        if (param0) {
          return;
        }
        field_F = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        this.field_A.a(this.field_E, 14 + param3 + this.field_r, 10 + param2 + this.field_e, this.field_l - 28, this.field_p, 16777215, -1, 0, 0, this.field_A.field_C);
    }

    final static kc a(String param0, long param1, boolean param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        od stackIn_8_0 = null;
        rc stackIn_10_0 = null;
        f stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            sk.b(true);
          }
          if (param1 == 0L &&
            param4 != null) {
            stackIn_10_0 = new rc(param4, param0);
            return (kc) ((Object) stackIn_10_0);
          }
          if (param2) {
            stackIn_8_0 = new od(param1, param0);
            return (kc) ((Object) stackIn_8_0);
          }
          stackIn_12_0 = new f(param1, param0);
          return (kc) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("sk.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          field_D = (int[]) null;
        }
        if (!ha.field_db) {
          throw new IllegalStateException();
        }
        cf.field_c = true;
        hl.a((byte) -60, true);
        k.field_g = 0;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_C >= param0) {
          return;
        }
        t[] var8 = new t[param0];
        t[] var3 = var8;
        if (param1 > -67) {
          t var7 = (t) null;
          this.a(-89, -86, -14, 112, (t) null);
        }
        int[] var4 = new int[param0];
        for (var5 = 0; this.field_C > var5; var5++) {
          var8[var5] = this.field_B[var5];
          var4[var5] = this.field_z[var5];
        }
        this.field_C = param0;
        this.field_z = var4;
        this.field_B = var3;
    }

    sk(ha param0, ta param1, String param2) {
        super(0, 0, 288, 0, (ml) null);
        int var4_int = 0;
        this.field_C = 0;
        try {
          this.field_H = param0;
          this.field_E = param2;
          this.field_A = param1;
          var4_int = null != this.field_E ? this.field_A.a(this.field_E, 260, this.field_A.field_C) : 0;
          this.a(22 + var4_int, 13361, 0, 288, 0);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "sk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final t a(int param0, of param1, String param2) {
        t var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        t stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new t(param2, param1);
          var4.field_h = (ml) ((Object) new hd());
          var5 = -2 + this.field_p;
          this.a(this.field_p + 34, 13361, 0, this.field_l, param0);
          var4.a(30, 13361, 7, this.field_l - 14, var5);
          this.b((byte) -78, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("sk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_G = 0;
        field_D = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
          var1 = 3 * var0;
          if (var1 > 255) {
            var1 = 255;
          }
          field_D[var0] = bd.a(bd.a(ch.a(var1, 251723775) << 8, ch.a(var1 << 16, 16738534)), ch.a(var1, 16777215));
        }
        field_F = "to return to the normal view.";
    }
}
