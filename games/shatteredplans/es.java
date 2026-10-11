/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es extends oh {
    static qr field_l;
    static int field_n;
    static bc field_j;
    static int field_m;
    int field_k;
    int field_h;
    ln field_p;
    fs field_i;
    int field_o;

    final static boolean a(int param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          if (sa.field_a.field_j >= param1) {
            return true;
          }
          if (null == wg.field_f) {
            return false;
          }
          try {
            var3 = 52 % ((param0 - 38) / 63);
            var2_int = wg.field_f.a(-1);
            if (var2_int <= 0) {
              if (var2_int < 0) {
                q.g(-114);
                return false;
              }
              if (wh.a(18) <= 30000L) {
                return false;
              }
              q.g(-114);
              return false;
            }
            if (var2_int > param1 - sa.field_a.field_j) {
              var2_int = param1 - sa.field_a.field_j;
            }
            wg.field_f.a(sa.field_a.field_h, var2_int, sa.field_a.field_j, (byte) 119);
            pf.field_e = pr.a(14274);
            sa.field_a.field_j = sa.field_a.field_j + var2_int;
            if (sa.field_a.field_j < param1) {
              return false;
            }
            sa.field_a.field_j = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            q.g(-117);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        rg var15 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        int var13 = 0;
        String var2 = null;
        String var12 = null;
        int var14 = ShatteredPlansClient.field_F ? 1 : 0;
        String var2Lifetime1;
        String var2Lifetime2;
        String var12Lifetime1;
        String var12Lifetime2;
        String var12Lifetime3;
        String var12Lifetime4;
        String var12Lifetime5;
        String var12Lifetime6;
        String var12Lifetime5Lifetime1;
        String var12Lifetime5Lifetime2;
        if (!(param0 instanceof rg)) {
          var2 = "";
        } else {
          var15 = (rg) ((Object) param0);
          param0 = var15.field_e;
          var2 = var15.field_b + " | ";
          var12 = var2;
          var2 = var12;
          var12Lifetime6 = var2;
        }
        StringWriter var16 = new StringWriter();
        PrintWriter var4 = new PrintWriter((Writer) ((Object) var16));
        param0.printStackTrace(var4);
        var4.close();
        String var5 = var16.toString();
        var12Lifetime1 = var5;
        var2Lifetime1 = var12Lifetime1;
        var12Lifetime2 = var5;
        int var8 = 30 % ((-57 - param1) / 33);
        BufferedReader var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        String var7 = var6.readLine();
        var12Lifetime3 = var7;
        var2Lifetime2 = var12Lifetime3;
        var12Lifetime4 = var7;
        while (true) {
          var9 = var6.readLine();
          var12Lifetime5 = var9;
          var2Lifetime2 = var12Lifetime5;
          var12Lifetime5Lifetime1 = var9;
          if (var9 == null) {
            break;
          }
          var10 = var9.indexOf('(');
          var11 = var9.indexOf(')', var10 + 1);
          if (var10 != -1) {
            var12Lifetime5Lifetime2 = var9.substring(0, var10);
          } else {
            var12Lifetime5Lifetime2 = var9;
            var2Lifetime2 = var12Lifetime5Lifetime2;
            var2Lifetime2 = var12Lifetime5Lifetime2;
          }
          var17 = var12Lifetime5Lifetime2.trim();
          var2Lifetime2 = var17;
          var2Lifetime2 = var17;
          var18 = var17.substring(var17.lastIndexOf(' ') + 1);
          var2Lifetime2 = var18;
          var2Lifetime2 = var18;
          var19 = var18.substring(var18.lastIndexOf('\t') + 1);
          var2Lifetime2 = var19;
          var2Lifetime2 = var19;
          var20 = var2Lifetime2 + var19;
          var2Lifetime2 = var20;
          var2Lifetime2 = var20;
          var2Lifetime2 = var20;
          if (var10 != -1 &&
            var11 != -1) {
            var13 = var9.indexOf(".java:", var10);
            if (var13 >= 0) {
              var2Lifetime2 = var20 + var9.substring(var13 + 5, var11);
            }
          }
          var2Lifetime2 = var2Lifetime2 + ' ';
        }
        var2Lifetime2 = var2Lifetime2 + "| " + var7;
        return var2Lifetime2;
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_j = null;
        field_l = null;
    }

    es(ln param0, fs param1, int param2, int param3) {
        try {
          this.field_o = param2;
          this.field_p = param0;
          this.field_i = param1;
          this.field_k = param3;
          this.field_h = 0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "es.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    es(ln param0, fs param1, int param2, int param3, int param4) {
        try {
          this.field_h = param3;
          this.field_p = param0;
          this.field_o = param2;
          this.field_k = param4;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "es.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
