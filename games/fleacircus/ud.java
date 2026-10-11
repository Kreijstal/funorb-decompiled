/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ud {
    static ih field_b;
    static boolean field_c;
    static String field_a;

    final static dd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        dd[] var10;
        dd[] var11_ref_dd__;
        int var11;
        int var12;
        dd var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        dd[] var10Lifetime1;
        var15 = fleas.field_A ? 1 : 0;
        var9 = param3 + (param4 + param7);
        var10 = new dd[]{new dd(var9, var9), new dd(param1, var9), new dd(var9, var9), new dd(var9, param1), new dd(64, 64), new dd(var9, param1), new dd(var9, var9), new dd(param1, var9), new dd(var9, var9)};
        var11_ref_dd__ = var10;
        for (var12 = 0; var11_ref_dd__.length > var12; var12++) {
          var13 = var11_ref_dd__[var12];
          for (var14 = 0; var14 < var13.field_B.length; var14++) {
            var13.field_B[var14] = param0;
          }
        }
        var10Lifetime1 = var11_ref_dd__;
        for (var11 = 0; var11 < param3; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10Lifetime1[6].field_B[var12Lifetime1 + var9 * (var9 - (var11 + 1))] = param5;
            var10Lifetime1[8].field_B[var9 * (var9 - var11 - 1) + var12Lifetime1] = param5;
            var10Lifetime1[2].field_B[var12Lifetime1 * var9 - var11 - (1 - var9)] = param5;
            var10Lifetime1[8].field_B[-var11 + var9 - 1 + var12Lifetime1 * var9] = param5;
          }
        }
        var11Lifetime1 = 0;
        if (param2 != 4715) {
          ud.a((byte) 104);
        }
        while (param3 > var11Lifetime1) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10Lifetime1[0].field_B[var12Lifetime2 + var9 * var11Lifetime1] = param8;
            var10Lifetime1[0].field_B[var12Lifetime2 * var9 + var11Lifetime1] = param8;
            if (var12Lifetime2 < (-var11Lifetime1 + var9)) {
              var10Lifetime1[2].field_B[var9 * var11Lifetime1 + var12Lifetime2] = param8;
              var10Lifetime1[6].field_B[var9 * var12Lifetime2 + var11Lifetime1] = param8;
            }
          }
          var11Lifetime1++;
        }
        for (var11Lifetime2 = 0; param1 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param3 > var12Lifetime3; var12Lifetime3++) {
            var10Lifetime1[7].field_B[(var9 + (-var12Lifetime3 - 1)) * param1 + var11Lifetime2] = param5;
            var10Lifetime1[5].field_B[var9 * var11Lifetime2 - (-var9 + 1 + var12Lifetime3)] = param5;
            var10Lifetime1[1].field_B[param1 * var12Lifetime3 + var11Lifetime2] = param8;
            var10Lifetime1[3].field_B[var11Lifetime2 * var9 + var12Lifetime3] = param8;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param1 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param7; var12Lifetime4++) {
            var10Lifetime1[1].field_B[(-var12Lifetime4 + (var9 - 1)) * param1 + var11Lifetime3] = param6;
            var10Lifetime1[3].field_B[var11Lifetime3 * var9 - 1 + (var9 - var12Lifetime4)] = param6;
            var10Lifetime1[7].field_B[var11Lifetime3 + param1 * var12Lifetime4] = param6;
            var10Lifetime1[5].field_B[var11Lifetime3 * var9 + var12Lifetime4] = param6;
          }
        }
        return var10Lifetime1;
    }

    public static void a(byte param0) {
        if (param0 != 85) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
          ce stackIn_13_0;
          java.net.URL stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          StringBuilder stackIn_13_4;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          String stackIn_14_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          od var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = fleas.field_A ? 1 : 0;
          try {
            var3 = "";
            if (param1 != null) {
              var3 = ii.a(41, param1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            sk.a(param2 ^ param2, var3);
            var7 = tj.a(":", var3, "%3a", (byte) -66);
            var8 = tj.a("@", var7, "%40", (byte) -66);
            var9 = tj.a("&", var8, "%26", (byte) -66);
            var10 = tj.a("#", var9, "%23", (byte) -66);
            if (tb.field_d == null) {
              return;
            }
            stackIn_13_0 = fg.field_i;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = tb.field_d.getCodeBase();
            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(rc.field_a).append("&u=");
            if (s.field_b == null) {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = "" + of.field_c;
            } else {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = s.field_b;
            }
            var4 = ((ce) (Object) stackIn_13_0).a(new java.net.URL(stackIn_13_3, ((StringBuilder) (Object) stackIn_13_4).append(stackIn_14_5).append("&v1=").append(ce.field_r).append("&v2=").append(ce.field_n).append("&e=").append(var10).toString()), -34);
            while (0 == var4.field_b) {
              vh.a(1L, param2 - 100);
            }
            if (var4.field_b == 1) {
              var5 = (DataInputStream) (var4.field_e);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1560) {
            field_c = true;
          }
          stackIn_3_0 = tc.a((byte) 82, param1, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ud.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fa var7 = null;
        fa var8 = null;
        int var3Lifetime1;
        var5 = fleas.field_A ? 1 : 0;
        try {
          var7 = tl.field_p;
          var8 = var7;
          sd.field_f = var8.b(pa.field_i[12]);
          var2 = var8.b(pa.field_i[13]);
          if (var2 > sd.field_f) {
            sd.field_f = var2;
          }
          h.field_g = new dd[b.field_d.length];
          ua.field_tb = new dd[b.field_d.length];
          var3 = -15 % ((-48 - param0) / 60);
          var4 = 0;
          while (var4 < h.field_g.length) {
            h.field_g[var4] = je.field_O[db.a((byte) -115, new Random(), je.field_O.length)];
            {
              while ((null == ua.field_tb[var4] ||
                ua.field_tb[var4] == h.field_g[var4])) {
                ua.field_tb[var4] = je.field_O[db.a((byte) -115, new Random(), je.field_O.length)];
              }
              {
                var4++;
              }
            }
          }
          gj.field_A = new rk(320, 420, gl.field_m, qa.field_l, bb.field_H, lh.field_b);
          gj.field_A.field_t = fl.field_f;
          gj.field_A.field_y = 1;
          gj.field_A.field_z = -1;
          ca.field_L = new mf(3, 1560);
          mg.field_b = new mf(6, 165);
          fb.field_a = new mf(3, 4715);
          cm.field_i = new mf(3, 1560);
          mf.field_e = new mf(6, 165);
          th.field_z = new mf(3, 4715);
          for (var3Lifetime1 = 0; ca.field_L.field_d.length > var3Lifetime1; var3Lifetime1++) {
            ca.field_L.field_d[var3Lifetime1] = var3Lifetime1 * 65536;
            cm.field_i.field_d[var3Lifetime1] = var3Lifetime1 * 65536;
            fb.field_a.field_d[var3Lifetime1] = 65792 * var3Lifetime1;
            th.field_z.field_d[var3Lifetime1] = 65792 * var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "ud.C(" + param0 + ')');
        }
    }

    static {
        field_c = false;
        field_a = "Connection lost. <%0>";
    }
}
