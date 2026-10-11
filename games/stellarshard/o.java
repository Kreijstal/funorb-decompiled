/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class o {
    static String field_c;
    int field_d;
    int field_i;
    static bd field_h;
    int field_k;
    static String[] field_g;
    int field_a;
    int field_e;
    static uc field_l;
    static int field_j;
    static int field_f;
    int field_b;

    abstract void a(int param0, int param1, int param2);

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        ha var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = stellarshard.field_B;
        try {
          if (param0 != -10834) {
            field_h = (bd) null;
          }
          var1 = pg.field_fb;
          while (wk.b(1816)) {
            var1.f(8, param0 + 11784);
            fieldTemp$0 = var1.field_k + 1;
            var1.field_k = var1.field_k + 1;
            var2 = fieldTemp$0;
            qh.a(124, var1);
            pg.field_fb.a(var1.field_k - var2, (byte) -75);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "o.F(" + param0 + ')');
        }
    }

    final static pf a(int param0, int param1, int param2, boolean param3, boolean param4) {
        if (param1 != 2) {
          field_c = (String) null;
        }
        return na.a(param0, 255, param2, param3, false, param4);
    }

    public static void a(int param0) {
        if (param0 != 1) {
          o.a(-28, -120, 48, false, false);
        }
        field_l = null;
        field_g = null;
        field_h = null;
        field_c = null;
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        wg var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var11Lifetime5Lifetime1;
        String var11Lifetime5Lifetime2;
        var13 = stellarshard.field_B;
        if (param1 instanceof wg) {
          var14 = (wg) ((Object) param1);
          param1 = var14.field_a;
          var2 = var14.field_f + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
        } else {
          var2 = "";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11Lifetime3 = var7;
        var2Lifetime2 = var11Lifetime3;
        var11Lifetime4 = var7;
        while (true) {
          var8 = var6.readLine();
          var11Lifetime5 = var8;
          var2Lifetime3 = var11Lifetime5;
          var11Lifetime5Lifetime1 = var8;
          if (var8 == null) {
            if (param0 != 1) {
              return (String) null;
            }
            var2Lifetime3 = var2Lifetime3 + "| " + var7;
            return var2Lifetime3;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 != -1) {
            var11Lifetime5Lifetime2 = var8.substring(0, var9);
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
          } else {
            var11Lifetime5Lifetime2 = var8;
          }
          var16 = var11Lifetime5Lifetime2.trim();
          var2Lifetime3Lifetime2 = var16;
          var2Lifetime3Lifetime3 = var16;
          var17 = var16.substring(1 + var16.lastIndexOf(' '));
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(1 + var17.lastIndexOf('\t'));
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var2Lifetime3Lifetime7 + var18;
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var2Lifetime3Lifetime10 = var19;
          if (var9 != -1) {
            if (var10 == -1) {
              var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime10 = var19 + var8.substring(5 + var12, var10);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    abstract void a(int param0, int param1);

    final static void a(qe param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var5 = 0;
        vl var6 = null;
        sd var7 = null;
        vl var8 = null;
        var5 = stellarshard.field_B;
        try {
          var2_int = param0.field_c;
          if ((param0.field_c >= 0 &&
            7 >= param0.field_c ||
            !(param0.field_c < 13) &&
            !(param0.field_c >= 16)) && fe.field_e) {
            ll.field_c.a(sb.field_e[32], 100, 2 * pk.field_h);
          }
          b.a(param0.field_c, 6);
          if (0 <= e.field_e &&
            qe.field_e < 2047) {
            qe.field_e = qe.field_e | 1 << e.field_e;
            if (qe.field_e == 2047) {
              hj.a(250, 5, 1);
            }
          }
          if (param0.field_c == 8) {
            nf.field_r = false;
            if (gh.field_b >= 5 &&
              nc.field_H != 3) {
              gh.field_b = gh.field_b + 1;
            } else {
              gh.field_b = 5;
            }
            nc.field_H = 1;
            stellarshard.field_U[10] = stellarshard.field_U[10] + 1;
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[31], 100, pk.field_h * 2);
            }
          }
          if (9 == param0.field_c) {
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[28], 100, 2 * pk.field_h);
            }
            ig.field_D = 255;
            for (var4 = 0; var4 < 256; var4++) {
              var6 = new vl(0, a.field_h[0]);
              var8 = var6;
              var8.field_j = var8.field_j - 8.0 * Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0);
              var8.field_a = var8.field_a - Math.cos(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 8.0;
              var6.field_c = a.field_h[0].field_a + var8.field_j * 4.0;
              var8.field_k = var6.field_a * 4.0 + a.field_h[0].field_l;
              var6.field_j = var6.field_j + a.field_h[0].field_d;
              var6.field_a = var6.field_a + a.field_h[0].field_k;
              var8.field_p = 10;
              var8.field_n = -3;
              var8.field_q = 16777215;
              var6.field_d = 65280;
              wk.field_b[eg.a(-30)] = var6;
            }
            stellarshard.field_U[12] = stellarshard.field_U[12] + 1;
          }
          if (param1) {
            return;
          }
          if (param0.field_c == 10) {
            gh.field_b = 500;
            nf.field_r = false;
            nc.field_H = 2;
            stellarshard.field_U[11] = stellarshard.field_U[11] + 1;
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[30], 100, pk.field_h * 2);
            }
          }
          if (11 == param0.field_c) {
            nf.field_r = false;
            gh.field_b = 1500;
            nc.field_H = 3;
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[29], 100, 2 * pk.field_h);
            }
          }
          if (12 == param0.field_c) {
            gh.field_b = 500;
            nf.field_r = false;
            nc.field_H = 4;
            stellarshard.field_U[13] = stellarshard.field_U[13] + 1;
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[0], 100, pk.field_h * 2);
            }
          }
          if (param0.field_c == 13) {
            e.field_e = 8;
          }
          if (14 == param0.field_c) {
            e.field_e = 9;
            stellarshard.field_U[15] = stellarshard.field_U[15] + 1;
          }
          if (param0.field_c == 15) {
            e.field_e = 10;
          }
          if (param0.field_c == 16) {
            ag.field_a = 0;
            ml.field_h = ml.field_h + 1;
            gf.field_c = 0;
            if (ml.field_h == 20 &&
              pk.a(-12663, 0)) {
              hj.a(242, 13, 1);
            }
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[41], 100, 3 * pk.field_h);
            }
          }
          var7 = new sd(-var2_int, param0, 16777215);
          hf.field_e[ha.k(-1001)] = var7;
          param0.field_g = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_64_0 = var2;
          stackIn_64_1 = new StringBuilder().append("o.G(");
          if (param0 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "Just play";
        field_j = 0;
        field_f = 0;
    }
}
