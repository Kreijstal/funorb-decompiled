/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qh extends hk {
    private int field_m;
    static hj field_h;
    static boolean field_f;
    static String field_g;
    private int field_l;
    static Vector field_o;
    private int field_n;
    private int field_j;
    private int field_p;
    static int field_k;
    static int field_i;

    final pb b(byte param0) {
        if (param0 <= -127) {
          return null;
        }
        return (pb) null;
    }

    final static boolean a(int param0, int param1, int param2, db param3) {
        dl[] array$0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          if (param2 == 0) {
            if (null != vj.field_a) {
              return false;
            }
            vj.field_a = new dl[23][];
          }
          var4_int = 23 * param2 >> 2;
          if (vj.field_a[var4_int] != null) {
            return false;
          }
          td.a((float)param1, oi.field_b, false);
          fe.field_g.a(param0 - 9384);
          while (var4_int < 23 * (1 + param2) >> 2) {
            array$0 = new dl[bp.field_c[var4_int]];
            vj.field_a[var4_int] = array$0;
            if (wk.field_c[var4_int] == null) {
              for (var5 = 0; var5 < bp.field_c[var4_int]; var5++) {
                vj.field_a[var4_int][var5] = vj.field_a[var4_int - 1][var5].c();
              }
            } else {
              if (wk.field_c[var4_int] != "") {
                sd.field_R = bf.a(-1, "sprites_player_" + wk.field_c[var4_int], "", param3);
              }
              for (var5 = 0; var5 < fg.field_j[var4_int]; var5++) {
                vj.field_a[var4_int][var5] = sd.field_R[vf.field_a[var4_int] + var5];
              }
              while (bp.field_c[var4_int] > var5) {
                vj.field_a[var4_int][var5] = sd.field_R[var5 + (vf.field_a[var4_int] + oe.field_c[var4_int])];
                var5++;
              }
            }
            var4_int++;
          }
          if (param0 != 9260) {
            qh.c((byte) 33);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_32_0 = var4;
          stackIn_32_1 = new StringBuilder().append("qh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, ta param2) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ta var8 = null;
        ln var9 = null;
        try {
          var9 = (ln) (vm.field_j[param0].elementAt(ib.field_l[param0]));
          var5 = (18 + (16384 * m.field_l[param0] + 73728)) / 37;
          if (var9.field_e < 0) {
            this.field_l = this.field_l + 1;
            this.field_j = this.field_j + var5;
          } else {
            this.field_m = this.field_m + var5;
            this.field_n = this.field_n + 1;
          }
          if (var9.field_e == 0) {
            stackIn_6_0 = pd.field_g[param0];
          } else {
            stackIn_6_0 = var9.field_e;
          }
          var6 = stackIn_6_0;
          if (param1 != 23041505) {
            var8 = (ta) null;
            this.a(32, -26, (ta) null);
          }
          var7 = var6;
          mb.field_g = mb.field_g - var7;
          pd.field_g[param0] = pd.field_g[param0] + var6;
          ib.field_l[param0] = ib.field_l[param0] + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("qh.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        if (this.field_n > 0) {
          tb.field_d.a(oj.field_L[this.field_p], 100, gi.field_m * 128, this.field_m / this.field_n);
          this.field_m = 0;
          this.field_n = 0;
          this.field_p = this.field_p + 1;
        }
        if (this.field_l > 0) {
          tb.field_d.a(bp.field_a, 100, gi.field_m * 128, this.field_j / this.field_l);
          this.field_l = 0;
          this.field_j = 0;
        }
        int var2 = -9 / ((param0 - 29) / 42);
    }

    public static void c(byte param0) {
        if (param0 <= 6) {
          return;
        }
        field_o = null;
        field_g = null;
        field_h = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        for (var5 = 0; param2 > var5; var5++) {
          this.a(param1, 23041505, (ta) null);
        }
        if (!param0) {
          this.a(true, -42, 29, 122);
        }
    }

    qh() {
        this.field_n = 0;
        this.field_m = 0;
        this.field_j = 0;
        this.field_l = 0;
        this.field_p = 0;
    }

    static {
        field_g = "Safe";
        field_i = 0;
    }
}
