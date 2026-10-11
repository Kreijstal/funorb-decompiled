/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    private di field_e;
    static String field_a;
    private di field_c;
    static int[] field_b;
    private fg field_d;

    final static void a(int param0, int param1) {
        if (param1 > -37) {
          field_a = (String) null;
        }
        oh.field_e = 1000000000L / (long)param0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -66) {
          field_b = (int[]) null;
        }
        field_b = null;
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
        oa var13;
        StringWriter var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
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
        String var2Lifetime3Lifetime11;
        String var2Lifetime3Lifetime12;
        String var11Lifetime3Lifetime1;
        if (!(param1 instanceof oa)) {
          var2 = "";
          var11 = var2;
        } else {
          var13 = (oa) ((Object) param1);
          var2 = var13.field_i + " | ";
          param1 = var13.field_c;
        }
        var14 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var14));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var14.toString();
        var2Lifetime1 = var5;
        var11Lifetime1 = var5;
        if (param0 != 5) {
          field_b = (int[]) null;
        }
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2Lifetime2 = var7;
        var11Lifetime2 = var7;
        while (true) {
          var8 = var6.readLine();
          var2Lifetime3 = var8;
          var11Lifetime3 = var8;
          var2Lifetime3Lifetime1 = var11Lifetime3;
          if (var8 == null) {
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var11Lifetime3 = var2Lifetime3Lifetime2;
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var2Lifetime3Lifetime2 = var2Lifetime3Lifetime2 + "| " + var7;
            return var2Lifetime3Lifetime2;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 == -1) {
            var11Lifetime3Lifetime1 = var8;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
          } else {
            var11Lifetime3Lifetime1 = var8.substring(0, var9);
          }
          var15 = var11Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var15;
          var2Lifetime3Lifetime5 = var15;
          var16 = var15.substring(var15.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime6 = var16;
          var2Lifetime3Lifetime7 = var16;
          var17 = var16.substring(var16.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime8 = var17;
          var2Lifetime3Lifetime9 = var17;
          var18 = var2Lifetime3Lifetime9 + var17;
          var2Lifetime3Lifetime10 = var18;
          var2Lifetime3Lifetime11 = var18;
          var2Lifetime3Lifetime12 = var18;
          if (var9 != -1 &&
            -1 != var10) {
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime12 = var18 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    final static int b(byte param0) {
        if (param0 >= -51) {
          field_b = (int[]) null;
        }
        return -fk.field_Z + ah.field_i;
    }

    final static void a(pn param0, int param1) {
        int var2_int = 0;
        pn var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Pool.field_O;
        try {
          if (param1 <= 64) {
            return;
          }
          if (param0.field_f == null) {
            return;
          }
          if (param0.field_m != 0 ||
            param0.field_e != 0) {
            for (var2_int = 0; var2_int < aa.field_e; var2_int++) {
              var3 = wb.field_e[var2_int];
              if (var3.field_p == 2 &&
                param0.field_m == var3.field_m &&
                param0.field_e == var3.field_e) {
                return;
              }
            }
          }
          if (param0.field_d != null) {
            hp.field_a = param0.field_b;
            ro.field_s = param0.field_q;
            rn.field_g = param0.field_d;
            hg.field_a = param0.field_p;
          }
          oa.a(-114, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("ee.F(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static pn a(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        oq var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        oq var8 = null;
        ap var9 = null;
        var7 = Pool.field_O;
        var8 = kn.field_e;
        var2 = var8;
        var3 = var8.g(-111);
        stackIn_3_0 = ((var3 & 128) != 0);
        qg.field_d = stackIn_3_0;
        um.field_d = var3 & 127;
        df.field_e = var8.g(-105);
        qg.field_c = var8.h(-412303328);
        if (2 != um.field_d) {
          m.field_e = 0;
          wq.field_a = 0;
        } else {
          wq.field_a = var8.d(-1034);
          m.field_e = var8.f(98);
        }
        stackIn_9_0 = (var8.g(param0 ^ 94) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        n.field_S = var8.j(-105);
        if (param0 != -31) {
          ee.b((byte) -81);
        }
        if (var4 == 0) {
          lh.field_f = n.field_S;
        } else {
          lh.field_f = var8.j(param0 ^ 82);
        }
        if (um.field_d == 1) {
          pp.field_b = var8.d(-1034);
          tp.field_g = var8.j(-49);
        } else {
          if (4 == um.field_d) {
            pp.field_b = var8.d(-1034);
            tp.field_g = var8.j(-49);
          } else {
            pp.field_b = 0;
            tp.field_g = null;
          }
        }
        if (param1) {
          var5 = var8.d(-1034);
          try {
            var9 = o.field_x.a(127, var5);
            np.field_a = var9.e(param0 ^ -31);
            if (lh.field_f.equals(di.field_j)) {
              stackIn_25_0 = null;
            } else {
              stackIn_25_0 = var9.field_C;
            }
            ci.field_p = stackIn_25_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            tc.a((Throwable) ((Object) var6), "CC1", param0 ^ 8564);
            np.field_a = null;
            ci.field_p = null;
          }
        } else {
          np.field_a = s.a(var8, 80, true);
          ci.field_p = null;
        }
        return new pn(param1);
    }

    final sf a(byte param0, int param1) {
        byte[] var4 = null;
        sf var3 = (sf) (this.field_d.a((long)param1, true));
        if (param0 != -55) {
          return (sf) null;
        }
        if (var3 != null) {
          return var3;
        }
        if (32768 > param1) {
          var4 = this.field_c.a(82, param1, 0);
        } else {
          var4 = this.field_e.a(112, param1 & 32767, 0);
        }
        var3 = new sf();
        if (var4 != null) {
          var3.a((byte) -123, new ge(var4));
        }
        if (32768 <= param1) {
          var3.f(0);
        }
        this.field_d.a(121, var3, (long)param1);
        return var3;
    }

    ee(int param0, di param1, di param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_d = new fg(64);
        try {
          this.field_e = param2;
          this.field_c = param1;
          if (this.field_c != null) {
            this.field_c.a(false, 0);
          }
          if (null != this.field_e) {
            this.field_e.a(false, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ee.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_a = "<%0> are all offering a rematch.";
        field_b = new int[128];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static pn $cfr$intArgs$a$9af18640dc82(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        oq var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        oq var8 = null;
        ap var9 = null;
        var7 = Pool.field_O;
        var8 = kn.field_e;
        var2 = var8;
        var3 = var8.g(-111);
        stackIn_3_0 = ((var3 & 128) != 0);
        qg.field_d = stackIn_3_0;
        um.field_d = var3 & 127;
        df.field_e = var8.g(-105);
        qg.field_c = var8.h(-412303328);
        if (2 != um.field_d) {
          m.field_e = 0;
          wq.field_a = 0;
        } else {
          wq.field_a = var8.d(-1034);
          m.field_e = var8.f(98);
        }
        stackIn_9_0 = (var8.g(param0 ^ 94) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        n.field_S = var8.j(-105);
        if (param0 != -31) {
          ee.b((byte) -81);
        }
        if (var4 == 0) {
          lh.field_f = n.field_S;
        } else {
          lh.field_f = var8.j(param0 ^ 82);
        }
        if (um.field_d == 1) {
          pp.field_b = var8.d(-1034);
          tp.field_g = var8.j(-49);
        } else {
          if (4 == um.field_d) {
            pp.field_b = var8.d(-1034);
            tp.field_g = var8.j(-49);
          } else {
            pp.field_b = 0;
            tp.field_g = null;
          }
        }
        if (param1) {
          var5 = var8.d(-1034);
          try {
            var9 = o.field_x.a(127, var5);
            np.field_a = var9.e(param0 ^ -31);
            if (lh.field_f.equals(di.field_j)) {
              stackIn_25_0 = null;
            } else {
              stackIn_25_0 = var9.field_C;
            }
            ci.field_p = stackIn_25_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            tc.a((Throwable) ((Object) var6), "CC1", param0 ^ 8564);
            np.field_a = null;
            ci.field_p = null;
          }
        } else {
          np.field_a = s.a(var8, 80, true);
          ci.field_p = null;
        }
        return new pn(param1);
    }
}
