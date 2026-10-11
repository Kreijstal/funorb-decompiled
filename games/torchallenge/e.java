/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class e extends da {
    nc field_n;
    int field_l;
    static int[][] field_p;
    da field_k;
    static int field_m;
    static String field_i;
    static volatile int field_o;
    static String field_j;

    final static int b(byte param0, int param1) {
        if (param0 != 57) {
          e.b((byte) -85);
        }
        return oa.a((byte) -126, param1, pl.field_d);
    }

    final static ka a(int param0, int param1, byte param2) {
        int var5 = TorChallenge.field_F ? 1 : 0;
        ka var3 = new ka(param1, param1);
        int var4 = 0;
        if (param2 > -44) {
          e.b((byte) -104, 50);
        }
        while (var4 < var3.field_y.length) {
          var3.field_y[var4] = param0;
          var4++;
        }
        return var3;
    }

    final static void a(byte param0, int param1) {
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          vj.field_d = new ka[3];
          if (param0 > -20) {
            e.b((byte) 64);
          }
          var2_int = 0;
          var3 = 0;
          for (var4 = 0; var4 < 3; var4++) {
            vj.field_d[var4] = new ka(we.field_m[1 + var4].field_q + param1 * 2, 2 * param1 + we.field_m[var4 + 1].field_v);
            if (we.field_m[1 + var4].field_q > var2_int) {
              var2_int = we.field_m[var4 + 1].field_q;
            }
            if (var3 < we.field_m[var4 + 1].field_v) {
              var3 = we.field_m[1 + var4].field_v;
            }
            vj.field_d[var4].d();
            if (0 == var4) {
              qg.a(ui.field_f);
              qg.a(0, 0, -(2 * param1) + qg.field_g, qg.field_f);
            }
            we.field_m[1 + var4].a(param1, param1, 16777215);
            if (var4 == 0) {
              qg.b(ui.field_f);
            }
            qg.d(param1, param1, 0, 0, qg.field_g, qg.field_f);
            la.field_f.a(-32);
            vj.field_d[var4].h();
          }
          cg.field_g = new ka(var2_int, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "e.C(" + param0 + ',' + param1 + ')');
        }
    }

    e(nc param0, da param1) {
        try {
          this.field_n = param0;
          this.field_l = param0.f();
          this.field_k = param1;
          this.field_n.f(128 + this.field_l * sh.field_r >> 8);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ue var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != -1) {
            field_j = (String) null;
          }
          var4 = (ue) (wl.field_b.c((byte) -29));
          while (var4 != null) {
            ji.a((byte) 92, param1, var4);
            var4 = (ue) (wl.field_b.c(-270));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "e.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static ka[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        ka[] var10;
        ka[] var11_ref_ka__;
        int var11;
        int var12;
        ka var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = TorChallenge.field_F ? 1 : 0;
        var9 = param4 + param2 + param8;
        var10 = new ka[]{new ka(var9, var9), new ka(param0, var9), new ka(var9, var9), new ka(var9, param0), new ka(64, 64), new ka(var9, param0), new ka(var9, var9), new ka(param0, var9), new ka(var9, var9)};
        var11_ref_ka__ = var10;
        for (var12 = 0; var11_ref_ka__.length > var12; var12++) {
          var13 = var11_ref_ka__[var12];
          for (var14 = 0; var13.field_y.length > var14; var14++) {
            var13.field_y[var14] = param5;
          }
        }
        for (var11 = 0; var11 < param2; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_y[var12Lifetime1 + (-1 + var9 - var11) * var9] = param6;
            var10[8].field_y[var12Lifetime1 + (-var11 + (var9 - 1)) * var9] = param6;
            var10[2].field_y[-var11 + (var9 + (-1 + var12Lifetime1 * var9))] = param6;
            var10[8].field_y[var9 * var12Lifetime1 - (var11 + 1 - var9)] = param6;
          }
        }
        for (var11Lifetime1 = 0; param2 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_y[var12Lifetime2 + var9 * var11Lifetime1] = param1;
            var10[0].field_y[var11Lifetime1 + var9 * var12Lifetime2] = param1;
            if (var9 - var11Lifetime1 > var12Lifetime2) {
              var10[2].field_y[var12Lifetime2 + var9 * var11Lifetime1] = param1;
              var10[6].field_y[var11Lifetime1 + var12Lifetime2 * var9] = param1;
            }
          }
        }
        if (param3 != 1065) {
          e.a(32, -20, -114, -96, -32, 54, -99, -97, 73);
        }
        for (var11Lifetime2 = 0; param0 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param2; var12Lifetime3++) {
            var10[7].field_y[var11Lifetime2 + param0 * (-1 + (-var12Lifetime3 + var9))] = param6;
            var10[5].field_y[-1 + (var9 - (var12Lifetime3 - var11Lifetime2 * var9))] = param6;
            var10[1].field_y[param0 * var12Lifetime3 + var11Lifetime2] = param1;
            var10[3].field_y[var11Lifetime2 * var9 + var12Lifetime3] = param1;
          }
        }
        for (var11Lifetime3 = 0; param0 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param8; var12Lifetime4++) {
            var10[1].field_y[var11Lifetime3 + (-1 + var9 - var12Lifetime4) * param0] = param7;
            var10[3].field_y[var9 * var11Lifetime3 + (-1 + (var9 - var12Lifetime4))] = param7;
            var10[7].field_y[param0 * var12Lifetime4 + var11Lifetime3] = param7;
            var10[5].field_y[var9 * var11Lifetime3 + var12Lifetime4] = param7;
          }
        }
        return var10;
    }

    public static void b(byte param0) {
        field_p = (int[][]) null;
        if (param0 != -83) {
          e.a(-61, 114, -62, 9, 74, -72, 46, -127, -48);
        }
        field_j = null;
        field_i = null;
    }

    static {
        field_j = "Friends can be added in multiplayer<nbsp>games";
        field_o = 0;
    }
}
