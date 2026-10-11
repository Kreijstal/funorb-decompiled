/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kea extends td {
    static be[] field_r;
    static byte[] field_q;
    static int[] field_s;
    static String field_p;

    final static fea a(byte param0, byte[] param1) {
        fea var2 = null;
        RuntimeException var2_ref = null;
        fea stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var2 = new fea(param1, fl.field_j, fd.field_D, lq.field_A, eha.field_s, baa.field_P);
          al.b(-18073);
          if (param0 != -3) {
            kea.b(5);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("kea.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, vr param1) {
        sna var5 = null;
        sna var6 = null;
        sna var3 = null;
        try {
          ln.field_x = hca.a("basic", param1, param0 + 12213, "display_name_changed");
          rba.field_a = new ok(0L, ob.field_g, baa.field_A, cd.field_p);
          nr.field_w = new ok(0L, ob.field_g, lma.field_z, mna.field_r);
          ov.field_d = new sna(0L, (sna) null);
          kg.field_d = new sna(0L, qs.field_m);
          kg.field_d.field_N = 1;
          eda.field_k = new sna(0L, iia.field_m, bs.field_j);
          vl.field_d = new sna(0L, vda.field_a, te.field_f);
          if (param0 != -12238) {
            field_s = (int[]) null;
          }
          fa.field_k = new sna(0L, dla.field_k);
          ov.field_d.a(param0 ^ 12237, kg.field_d);
          ov.field_d.a(-1, eda.field_k);
          ov.field_d.a(-1, vl.field_d);
          ov.field_d.a(param0 ^ 12237, rba.field_a);
          ov.field_d.a(-1, fa.field_k);
          rba.field_a.field_xb.field_wb.a(qs.field_m, 80);
          rba.field_a.field_xb.field_wb.field_Y = 1;
          var5 = rba.field_a.field_xb.field_wb;
          var6 = var5;
          var6.field_N = 1;
          nr.field_w.field_xb.field_wb.a(qs.field_m, 88);
          var3 = nr.field_w.field_xb.field_wb;
          nr.field_w.field_xb.field_wb.field_Y = 1;
          var3.field_N = 1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "kea.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    kea(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_n = param3;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "kea.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ii a(op param0, int param1) {
        int incrementValue$1 = 0;
        int fieldTemp$0 = 0;
        tla stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        tla var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        aj[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        aj var14_ref_aj = null;
        int var14 = 0;
        wia var15 = null;
        int var15_int = 0;
        aga var16 = null;
        iv var17 = null;
        bm var17_ref = null;
        int var18 = 0;
        aga var19 = null;
        int[][] var23 = null;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var10Lifetime1;
        var18 = BachelorFridge.field_y;
        try {
          var19 = this.field_h.a(41, param0);
          var4 = new tla(this.field_g, new nq(var19));
          var4.field_v = this.field_k;
          var4.field_r = this.field_n;
          var23 = var4.d(false);
          var6 = 17;
          var7 = 17;
          var8 = -1 + var6 >> 1;
          var9 = var7 - 1 >> 1;
          var10 = 0;
          var11_int = 0;
          if (param1 != 3) {
            field_s = (int[]) null;
          }
          while (var6 > var11_int) {
            for (var12 = 0; var12 < var7; var12++) {
              if (var23[var11_int][var12] == 1) {
                var10++;
              }
            }
            var11_int++;
          }
          var11 = new aj[var10];
          var10Lifetime1 = 0;
          for (var12Lifetime1 = 0; var12Lifetime1 < var6; var12Lifetime1++) {
            for (var13 = 0; var13 < var7; var13++) {
              if (var23[var12Lifetime1][var13] == 1) {
                var14 = this.field_k - (var8 - var12Lifetime1);
                var15_int = this.field_n - var9 + var13;
                if (param0.a(var14, var15_int, (byte) -127)) {
                  incrementValue$1 = var10Lifetime1;
                  var10Lifetime1++;
                  var11[incrementValue$1] = new aj(var14, var15_int);
                }
              }
            }
          }
          for (var12Lifetime2 = 0; var12Lifetime2 < var10Lifetime1 - 1; var12Lifetime2++) {
            if (6 > var12Lifetime2) {
              var13Lifetime1 = kla.a(-var12Lifetime2 + var10Lifetime1, param0.field_w, -2147483648) + var12Lifetime2;
              if (var13Lifetime1 != var12Lifetime2) {
                var14_ref_aj = var11[var12Lifetime2];
                var11[var12Lifetime2] = var11[var13Lifetime1];
                var11[var13Lifetime1] = var14_ref_aj;
              }
              continue;
            }
            break;
          }
          for (var12Lifetime3 = 0; var12Lifetime3 < var10Lifetime1; var12Lifetime3++) {
            if (var12Lifetime3 < 6) {
              var13Lifetime2 = var11[var12Lifetime3].field_c;
              var14Lifetime1 = var11[var12Lifetime3].field_a;
              var15 = param0.field_a[var13Lifetime2][var14Lifetime1];
              var16 = var15.field_l;
              if (var16 != null) {
                var17 = new iv(new nq(var16), false, 1, 50, 0);
                var4.field_o.a(var17, true);
              } else {
                var17_ref = new bm(21, var13Lifetime2, var14Lifetime1);
                var4.field_o.a(var17_ref, true);
              }
              fieldTemp$0 = var4.field_u;
              var4.field_u = var4.field_u + 1;
              var4.field_t[fieldTemp$0] = var11[var12Lifetime3];
              continue;
            }
            break;
          }
          stackIn_37_0 = var4;
          return (ii) ((Object) stackIn_37_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("kea.A(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        try {
          if (dg.field_f > param5) {
            param0 = param0 - (dg.field_f - param5);
            param5 = dg.field_f;
          }
          if (param4 < dg.field_j) {
            param1 = param1 - (dg.field_j - param4);
            param4 = dg.field_j;
          }
          if (param0 + param5 > dg.field_h) {
            param0 = dg.field_h - param5;
          }
          if (param4 + param1 > dg.field_k) {
            param1 = dg.field_k - param4;
          }
          if (param0 > 0 &&
            param1 > 0) {
            var6_int = param5 + dg.field_i * param4;
            if (param2 != 16711680) {
              return;
            }
            var7 = dg.field_i - param0;
            for (param4 = -param1; param4 < 0; param4++) {
              for (param5 = -param0; 0 > param5; param5++) {
                var8 = dg.field_e[var6_int];
                if (param3 < (255 & var8 >> 8) &&
                  (var8 & 16711680) >> 16 <= (var8 & 65280) >> 8) {
                  var9 = ((var8 & 16711680) >> 15) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = (var10 >> 1) - (var10 >> 5) & 65280;
                  var11 = 31 & var8 >> 3;
                  dg.field_e[var6_int] = mp.a(var11, mp.a(var10, var9 << 16));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "kea.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(int param0) {
        field_r = null;
        field_p = null;
        field_q = null;
        if (param0 != -26857) {
          return;
        }
        field_s = null;
    }

    static {
        field_r = new be[1];
        field_s = new int[8192];
        field_p = "Waiting for extra data";
    }
}
