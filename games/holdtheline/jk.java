/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jk extends hl {
    private int field_n;
    private int field_s;
    int field_i;
    static kg field_p;
    int field_o;
    static String field_r;
    private int field_m;
    int field_q;
    private int field_j;
    int field_t;
    int field_u;
    int field_k;
    static int[] field_l;

    final void a(byte param0) {
        if (param0 >= -4) {
          this.field_i = -41;
          this.d(0);
          mm.field_e.a((byte) -112, (hl) (this));
          return;
        }
        this.d(0);
        mm.field_e.a((byte) -112, (hl) (this));
    }

    final static void a(int param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = HoldTheLine.field_D;
          try {
            if (ce.field_n != null) {
              ce.field_n.e(param0 ^ 27371);
            }
            if (null != lk.field_d) {
              lk.field_d.a(true);
            }
            if (null != td.field_g) {
              try {
                td.field_g.d(param0 ^ -27371);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (vb.field_a != null) {
              for (var1_int = 0; vb.field_a.length > var1_int; var1_int++) {
                if (null != vb.field_a[var1_int]) {
                  try {
                    vb.field_a[var1_int].d(-1);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
            }
            if (param0 != 27370) {
              jk.a((gn) null, -66);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw kk.a((Throwable) ((Object) var1_ref), "jk.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void f(int param0) {
        this.field_u = this.field_u + this.field_m;
        this.field_t = this.field_t + this.field_j;
        this.field_i = this.field_i - 1;
        this.field_k = this.field_k + this.field_n;
        this.field_q = this.field_q + this.field_s;
        if (param0 >= -56) {
          this.field_k = 46;
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_r = null;
        if (param0 != 1288) {
          jk.a(27);
          field_l = null;
          return;
        }
        field_l = null;
    }

    final static void a(gn param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        qk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        da var8 = null;
        int var9 = 0;
        da var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = HoldTheLine.field_D;
        try {
          var8 = new da(param0.a("", false, "logo.fo3d"));
          var10 = var8;
          var3 = var10.f((byte) -16);
          var10.e(true);
          kl.field_s = va.a(11658, var10);
          ej.field_c = new qk[var3];
          gd.field_e = new int[var3][];
          var4 = 0;
          var5_int = -65 / ((58 - param1) / 41);
          while (var3 > var4) {
            ej.field_c[var4] = wg.a(6, var8);
            var4++;
          }
          var10.l(-71);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5 = ej.field_c[var9];
            var5.a(6, 6, 6, 2, 1);
            var5.c(0);
            var6 = new int[]{var5.field_F + var5.field_L >> 1, var5.field_H + var5.field_d >> 1, var5.field_p + var5.field_n >> 1};
            gd.field_e[var9] = var6;
            var5.a(-var6[1], -var6[0], -26608, -var6[2]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("jk.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10) {
        this.field_k = param2 << 10;
        this.field_u = param8 << 10;
        this.field_m = param0;
        int var12 = 105 / ((-81 - param5) / 39);
        this.field_t = param6 << 10;
        this.field_i = param1;
        this.field_s = param10;
        this.field_o = param7;
        this.field_n = param3;
        this.field_j = param4;
        this.field_q = param9 << 2;
    }

    jk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.a(param7, param4, param1, param3, param2, (byte) 79, param0, param5, param6, param8, param9);
    }

    static {
        field_l = new int[]{4, 4, 2};
    }
}
