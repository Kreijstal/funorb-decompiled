/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hg extends gm {
    static da field_wb;
    static int field_rb;
    static String field_tb;
    static int field_ub;
    static String field_sb;
    static String field_vb;

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
        fn var14;
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
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(param1 instanceof fn)) {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
        } else {
          var14 = (fn) ((Object) param1);
          param1 = var14.field_f;
          var2 = var14.field_k + " | ";
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
            if (param0 > -58) {
              return (String) null;
            }
            var2Lifetime3 = var2Lifetime3 + "| " + var7;
            return var2Lifetime3;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 == -1) {
            var11Lifetime5Lifetime2 = var8;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
          } else {
            var11Lifetime5Lifetime2 = var8.substring(0, var9);
          }
          var16 = var11Lifetime5Lifetime2.trim();
          var2Lifetime3Lifetime2 = var16;
          var2Lifetime3Lifetime3 = var16;
          var17 = var16.substring(var16.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var2Lifetime3Lifetime7 + var18;
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var2Lifetime3Lifetime10 = var19;
          if (var9 != -1 &&
            var10 != -1) {
            var12 = var8.indexOf(".java:", var9);
            if (0 <= var12) {
              var2Lifetime3Lifetime10 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        int var4Lifetime1;
        if (param0 == 40) {
          for (var4 = 0; param2 > var4; var4++) {
            var6[var4] = param1;
          }
          return new String(var6);
        }
        hg.c(false);
        for (var4Lifetime1 = 0; param2 > var4Lifetime1; var4Lifetime1++) {
          var6[var4Lifetime1] = param1;
        }
        return new String(var6);
    }

    final void a(nm param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          oo.c(param0.c(this.g(58), -20126), param0.d(this.h(102), 109), this.field_kb, 16711680);
          for (var3_int = 0; this.field_fb > var3_int; var3_int++) {
            var4 = param0.c(this.field_cb[var3_int], -20126);
            var5 = param0.d(this.field_hb[var3_int], 126);
            oo.e(-1 + var4, -1 + var5, 3, 3, 0);
            oo.a(var4, var5, 65280);
          }
          if (param1 > 58) {
            return;
          }
          hg.a(-91, '\033', 11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hg.J(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_tb = null;
        field_vb = null;
        if (param0) {
          field_sb = null;
          field_wb = null;
          return;
        }
        field_wb = (da) null;
        field_sb = null;
        field_wb = null;
    }

    final static void h(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = on.field_Z;
        synchronized (var1) {
          pq.field_f = hh.field_e;
          gi.field_m = gi.field_m + 1;
          bd.field_g = pb.field_a;
          bo.field_d = da.field_e;
          wc.field_J = vj.field_m;
          vj.field_m = false;
          kd.field_b = s.field_f;
          vb.field_f = de.field_g;
          ka.field_t = s.field_b;
          s.field_f = 0;
          if (param0 >= -82) {
            field_sb = (String) null;
          }
          jf.field_e = ak.field_b;
        }
    }

    hg(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        if (this.field_C == 2 ||
          this.field_C == 4 ||
          this.field_C == 6) {
          this.field_fb = 21;
          this.field_bb = 143360;
        }
    }

    static {
        field_wb = new da();
        field_tb = "Loading sound effects";
        field_sb = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_vb = "Player";
    }
}
