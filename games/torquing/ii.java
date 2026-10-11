/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ii extends q {
    static String[] field_j;
    static boolean field_n;
    static String field_m;
    static String field_o;
    long[] field_l;
    static int field_k;

    final static void a(int param0, int param1, qk param2) {
        int var4 = 0;
        df var5 = wa.field_d;
        var5.f(95, param1);
        if (param0 != 32) {
          return;
        }
        try {
          var5.field_n = var5.field_n + 1;
          var4 = var5.field_n;
          var5.b(90, 1);
          var5.b(90, param2.field_k);
          var5.a(param2.field_o, (byte) 106);
          var5.b((byte) 60, param2.field_n);
          var5.b((byte) 60, param2.field_m);
          var5.b((byte) 60, param2.field_s);
          var5.b((byte) 60, param2.field_j);
          var5.a(var4, true);
          var5.c((byte) 48, var5.field_n - var4);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ii.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          if (param2 != -19) {
            ii.a(125);
          }
          if (10 > b.field_x) {
            var3_int = 0;
            if (cf.field_c) {
              var3_int = 1;
              cf.field_c = false;
            }
            sc.a(kg.a((byte) 49), rd.field_A, var3_int != 0, (byte) 21, ro.b(-126));
            return;
          }
          if (!pl.b(-109)) {
            ph.b();
            jf.a(param2 ^ -527, 320, 240);
            ni.a(param0, 0, 0, -109);
            return;
          }
          if (op.field_i != 0) {
            ji.a((byte) -99, param0);
            return;
          }
          re.a(true, false, param1);
          ni.a(param0, 0, 0, param2 - 50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ii.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        field_j = null;
        if (param0 != -28455) {
          qk var2 = (qk) null;
          ii.a(-84, 11, (qk) null);
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
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
        ga var14;
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
        var13 = Torquing.field_u;
        if (param1 != 0) {
          return (String) null;
        }
        if (!(param0 instanceof ga)) {
          var2 = "";
          var11 = var2;
        } else {
          var14 = (ga) ((Object) param0);
          param0 = var14.field_a;
          var2 = var14.field_b + " | ";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2Lifetime1 = var5;
        var11Lifetime1 = var5;
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
          var10 = var8.indexOf(')', var9 + 1);
          if (var9 == -1) {
            var11Lifetime3Lifetime1 = var8;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
          } else {
            var11Lifetime3Lifetime1 = var8.substring(0, var9);
          }
          var16 = var11Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var16;
          var2Lifetime3Lifetime5 = var16;
          var17 = var16.substring(var16.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime6 = var17;
          var2Lifetime3Lifetime7 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime8 = var18;
          var2Lifetime3Lifetime9 = var18;
          var19 = var2Lifetime3Lifetime9 + var18;
          var2Lifetime3Lifetime10 = var19;
          var2Lifetime3Lifetime11 = var19;
          var2Lifetime3Lifetime12 = var19;
          if (var9 != -1 &&
            var10 != -1) {
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime12 = var19 + var8.substring(5 + var12, var10);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param5 != 2124) {
          field_k = -109;
          if (param4 < kn.field_e) {
            ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
            return;
          }
          if (param1 > qg.field_z) {
            ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
            return;
          }
          if (j.field_q > param0) {
            ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
            return;
          }
          if (param2 <= qk.field_p) {
            qm.a(param2, (byte) 54, param0, param7, param1, param3, param4, param6);
            return;
          }
          ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
          return;
        }
        if (param4 < kn.field_e) {
          ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
          return;
        }
        if (param1 > qg.field_z) {
          ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
          return;
        }
        if (j.field_q > param0) {
          ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
          return;
        }
        if (param2 <= qk.field_p) {
          qm.a(param2, (byte) 54, param0, param7, param1, param3, param4, param6);
          return;
        }
        ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
    }

    ii() {
    }

    static {
        field_m = "Logging in...";
        field_j = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_o = "members-only content";
    }
}
