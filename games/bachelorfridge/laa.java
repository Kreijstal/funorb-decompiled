/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class laa extends pv {
    static Random field_n;
    private int field_o;
    static int field_j;
    static int field_m;
    private int field_k;
    private double field_l;

    public static void d(boolean param0) {
        if (param0) {
          field_j = 34;
        }
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = BachelorFridge.field_y;
        try {
          if (param6 >= param0) {
            return;
          }
          if (1 + param6 >= param2) {
            return;
          }
          if (param6 + 5 < param2 &&
            param1 != param4) {
            var7_int = (1 & (param4 & param1)) + ((param4 >> 1) + (param1 >> 1));
            var8 = param6;
            var9 = param1;
            var10 = param4;
            for (var11 = param6; param2 > var11; var11++) {
              var12 = fn.field_k[var11];
              if (!param3) {
                stackIn_23_0 = uc.field_k[var12];
              } else {
                stackIn_23_0 = gk.field_a[var12];
              }
              var13 = stackIn_23_0;
              if (var7_int >= var13) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                fn.field_k[var11] = fn.field_k[var8];
                incrementValue$0 = var8;
                var8++;
                fn.field_k[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              }
            }
            laa.a(param0, param1, var8, param3, var9, 6374, param6);
            laa.a(param0, var10, param2, param3, param4, param5, var8);
            return;
          }
          for (var7_intLifetime1 = param2 - 1; param6 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = fn.field_k[var8Lifetime1];
              var10Lifetime1 = fn.field_k[1 + var8Lifetime1];
              if (un.a(param3, var10Lifetime1, -17596, var9Lifetime1)) {
                fn.field_k[var8Lifetime1] = var10Lifetime1;
                fn.field_k[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var7), "laa.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final int c(boolean param0) {
        int discarded$0 = 0;
        if (!param0) {
          discarded$0 = this.c(false);
        }
        return (int)((double)this.field_g * this.field_l) + this.field_k;
    }

    final boolean b(boolean param0) {
        int fieldTemp$1 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$1 <= this.c((byte) 68) &&
          this.field_o != 0) {
          if (this.field_g == 1) {
            this.field_f.field_l = this.field_f.field_l + this.field_o / 39;
            this.field_f.field_v.a((byte) 108, this.field_f.field_g.field_o.field_b, -1);
          }
          if (!param0) {
            field_n = (Random) null;
          }
          this.field_f.field_k = this.c(param0);
          return false;
        }
        this.c(39);
        return true;
    }

    private final void c(int param0) {
        if (param0 != 39) {
          field_n = (Random) null;
        }
        this.field_f.field_n = this.field_f.c((byte) -120);
        this.field_f.field_k = this.field_f.b(true);
    }

    final static void a(int param0, byte param1, int param2, int param3, String param4, int param5) {
        try {
          param2 = param2 - (hfa.field_z.a(param4) >> 1);
          if (param1 > -44) {
            laa.a(123, -54, -39, true, -63, -89, -61);
          }
          hfa.field_z.c(param4, param2, param0, param5, -1);
          jha.field_g.c(param4, param2, param0, param3, -1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "laa.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void b(int param0) {
        int var1;
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        eea.field_b = false;
        var1 = 92 / ((0 - param0) / 52);
        at.field_i = null;
        if (gfa.field_i) {
          oq.field_b.o(2113632);
        } else {
          var2 = rja.field_o;
          if (0 < var2) {
            if (var2 != 1) {
              at.field_i = lga.a(true, new String[]{Integer.toString(var2)}, ra.field_j);
            } else {
              at.field_i = qw.field_a;
            }
            at.field_i = rca.a(0, new CharSequence[]{(CharSequence) ((Object) at.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) eo.field_j)});
          }
          oq.field_b.p(-97);
          bi.o(2);
        }
    }

    private final int c(byte param0) {
        int var2 = -128 / ((-37 - param0) / 58);
        return (int)((double)Math.abs(this.field_o) * 20.0) / 39;
    }

    laa(jfa param0, int param1) {
        try {
          this.field_o = param1;
          this.field_f = param0;
          this.field_k = this.field_f.field_k;
          this.field_l = (double)this.field_o / (double)this.c((byte) 107);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "laa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_n = new Random(3L);
    }
}
