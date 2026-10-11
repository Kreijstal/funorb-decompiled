/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec extends ta implements ai {
    static int field_K;
    static String field_J;
    static int[] field_E;
    static String field_H;
    private kc field_I;
    private String field_A;
    private int field_D;
    private int[] field_C;
    private s[] field_B;
    static String field_F;
    private dh field_G;

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var5Lifetime1;
        if (this.field_D >= param0) {
          return;
        }
        s[] var7 = new s[param0];
        s[] var3 = var7;
        int[] var4 = new int[param0];
        if (param1 == 11339) {
          for (var5 = 0; this.field_D > var5; var5++) {
            var7[var5] = this.field_B[var5];
            var4[var5] = this.field_C[var5];
          }
          this.field_B = var3;
          this.field_C = var4;
          this.field_D = param0;
          return;
        }
        this.a(44, 28, 45, 89);
        for (var5Lifetime1 = 0; this.field_D > var5Lifetime1; var5Lifetime1++) {
          var7[var5Lifetime1] = this.field_B[var5Lifetime1];
          var4[var5Lifetime1] = this.field_C[var5Lifetime1];
        }
        this.field_B = var3;
        this.field_C = var4;
        this.field_D = param0;
    }

    ec(dh param0, kc param1, String param2) {
        super(0, 0, 288, 0, (td) null);
        int var4_int = 0;
        this.field_D = 0;
        try {
          this.field_G = param0;
          this.field_A = param2;
          this.field_I = param1;
          var4_int = null != this.field_A ? this.field_I.a(this.field_A, 260, this.field_I.field_H) : 0;
          this.a(0, 0, var4_int + 22, (byte) -90, 288);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final s a(String param0, int param1, ag param2) {
        s var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        s stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new s(param0, param2);
          var4.field_j = (td) ((Object) new vk());
          var5 = -2 + this.field_r;
          this.a(0, 0, this.field_r - param1, (byte) -90, this.field_m);
          var4.a(7, var5, 30, (byte) -90, -14 + this.field_m);
          this.a(var4, (byte) 74);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ec.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var7 = 0;
        int var6_int = 0;
        int var8 = OrbDefence.field_D ? 1 : 0;
        int var6_intLifetime1;
        try {
          for (var6_int = 0; this.field_D > var6_int; var6_int++) {
            if (param3 == this.field_B[var6_int]) {
              var7 = this.field_C[var6_int];
              if (-1 != var7) {
                il.a(this.field_C[var6_int], 0);
                break;
              }
              this.field_G.q(4210752);
              break;
            }
          }
          var6_intLifetime1 = -66 / ((param0 + 3) / 62);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ec.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = this.field_D;
          this.a(1 + var4_int, 11339);
          this.field_B[var4_int] = this.a(param0, gi.a(param2, 15824), (ag) (this));
          this.field_C[var4_int] = param1;
          if (param2 == -15858) {
            return;
          }
          ec.k(23);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("ec.Q(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6, int param7, int param8, long param9, int param10, be param11, int param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            cd.field_t = new se(param1);
            uk.field_b = new se(param7);
            gi.field_a = param12;
            j.field_e = param3;
            eg.field_v = param6;
            jl.field_e = param0;
            dk.field_a = param10;
            el.field_G = param9;
            ti.field_eb = param5;
            sj.field_x = param8;
            if (param13 <= 23) {
              return;
            }
            ef.field_i = param11;
            mg.field_g = param4;
            jc.field_b = param2;
            if (null == ef.field_i.field_v) {
              return;
            }
            try {
              s.field_y = new dj(ef.field_i.field_v, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("ec.O(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            if (param11 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void l(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          var6 = ji.field_a;
          var1 = var6;
          var2 = 0;
          var3 = -114 / ((4 - param0) / 42);
          var4 = var6.length;
          while (var2 < var4) {
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "ec.H(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_E = null;
        field_F = null;
        field_H = null;
        field_J = null;
        if (param0 != 122) {
          ec.l(20);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        this.field_I.a(this.field_A, param3 + this.field_s + 14, param0 + this.field_n + 10, -28 + this.field_m, this.field_r, 16777215, -1, 0, 0, this.field_I.field_H);
    }

    final static boolean k(int param0) {
        if (param0 == 783) {
          pc.field_Y = true;
          lm.field_c = ji.b(114) + 15000L;
          return hi.field_k == 11 ? true : false;
        }
        return false;
    }

    static {
        field_H = "Passwords can only contain letters and numbers";
        field_J = "Create your own free Jagex account";
        field_F = "Player";
    }
}
