/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc {
    static boolean[][] field_b;
    static ci field_d;
    static bg field_e;
    static long field_a;
    int field_f;
    static bg[] field_c;

    final static int a(int param0, int param1, int param2) {
        if (param0 > -10) {
          return 69;
        }
        int var3 = param2 >>> 31;
        return -var3 + (var3 + param2) / param1;
    }

    final static void a(ci param0, int param1) {
        try {
          vi.field_h = param0;
          if (param1 != 40) {
            field_c = (bg[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "pc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
        el var14 = null;
        String var25 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String var2 = null;
        String var11 = null;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = Terraphoenix.field_V;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var2Lifetime4;
        String var2Lifetime5;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var11Lifetime7;
        String var11Lifetime8;
        String var11Lifetime9;
        String var11Lifetime10;
        String var11Lifetime11;
        String var2Lifetime2Lifetime1;
        String var11Lifetime3Lifetime1;
        String var11Lifetime3Lifetime2;
        String var11Lifetime3Lifetime3;
        String var11Lifetime3Lifetime4;
        String var11Lifetime8Lifetime1;
        String var11Lifetime8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        if (!(param0 instanceof el)) {
          var2 = "";
        } else {
          var14 = (el) ((Object) param0);
          param0 = var14.field_a;
          var2 = var14.field_b + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime11 = var2;
        }
        StringWriter var15 = new StringWriter();
        PrintWriter var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        String var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        BufferedReader var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        if (param1 != 0) {
          pc.a(51, -88, -81);
        } else {
          var25 = var6.readLine();
          var11Lifetime3 = var25;
          var2Lifetime2 = var11Lifetime3;
          var11Lifetime3Lifetime1 = var25;
          while (true) {
            var20 = var6.readLine();
            var11Lifetime3Lifetime2 = var20;
            var2Lifetime2 = var11Lifetime3Lifetime2;
            var11Lifetime3Lifetime2 = var20;
            if (var20 == null) {
              break;
            }
            var9 = var20.indexOf('(');
            var10 = var20.indexOf(')', 1 + var9);
            if (var9 != -1) {
              var11Lifetime3Lifetime2 = var20.substring(0, var9);
            } else {
              var11Lifetime3Lifetime2 = var20;
              var2Lifetime2 = var11Lifetime3Lifetime2;
              var2Lifetime2 = var11Lifetime3Lifetime2;
            }
            var21 = var11Lifetime3Lifetime2.trim();
            var2Lifetime2 = var21;
            var2Lifetime2 = var21;
            var22 = var21.substring(var21.lastIndexOf(' ') + 1);
            var2Lifetime2 = var22;
            var2Lifetime2 = var22;
            var23 = var22.substring(1 + var22.lastIndexOf('\t'));
            var2Lifetime2 = var23;
            var2Lifetime2 = var23;
            var24 = var2Lifetime2 + var23;
            var2Lifetime2 = var24;
            var2Lifetime2 = var24;
            var2Lifetime2 = var24;
            if (var9 != -1 &&
              var10 != -1) {
              var12 = var20.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime2 = var24 + var20.substring(5 + var12, var10);
              }
            }
            var2Lifetime2 = var2Lifetime2 + ' ';
          }
          var2Lifetime2 = var2Lifetime2 + "| " + var25;
          var11Lifetime3Lifetime3 = var2Lifetime2;
          var2Lifetime2Lifetime1 = var11Lifetime3Lifetime3;
          var11Lifetime3Lifetime4 = var2Lifetime2Lifetime1;
          return var2Lifetime2Lifetime1;
        }
        String var31 = var6.readLine();
        var11Lifetime4 = var31;
        var2Lifetime3 = var11Lifetime4;
        var11Lifetime5 = var31;
        String var7 = var31;
        var11Lifetime6 = var7;
        var2Lifetime4 = var11Lifetime6;
        var11Lifetime7 = var7;
        while (true) {
          var26 = var6.readLine();
          var11Lifetime8 = var26;
          var2Lifetime4 = var11Lifetime8;
          var11Lifetime8Lifetime1 = var26;
          if (var26 == null) {
            break;
          }
          var9Lifetime1 = var26.indexOf('(');
          var10Lifetime1 = var26.indexOf(')', 1 + var9Lifetime1);
          if (var9Lifetime1 != -1) {
            var11Lifetime8Lifetime2 = var26.substring(0, var9Lifetime1);
          } else {
            var11Lifetime8Lifetime2 = var26;
            var2Lifetime4 = var11Lifetime8Lifetime2;
            var2Lifetime4 = var11Lifetime8Lifetime2;
          }
          var27 = var11Lifetime8Lifetime2.trim();
          var2Lifetime4 = var27;
          var2Lifetime4 = var27;
          var28 = var27.substring(var27.lastIndexOf(' ') + 1);
          var2Lifetime4 = var28;
          var2Lifetime4 = var28;
          var29 = var28.substring(1 + var28.lastIndexOf('\t'));
          var2Lifetime4 = var29;
          var2Lifetime4 = var29;
          var30 = var2Lifetime4 + var29;
          var2Lifetime4 = var30;
          var2Lifetime4 = var30;
          var2Lifetime4 = var30;
          if (var9Lifetime1 != -1 &&
            var10Lifetime1 != -1) {
            var12Lifetime1 = var26.indexOf(".java:", var9Lifetime1);
            if (var12Lifetime1 >= 0) {
              var2Lifetime4 = var30 + var26.substring(5 + var12Lifetime1, var10Lifetime1);
            }
          }
          var2Lifetime4 = var2Lifetime4 + ' ';
        }
        var2Lifetime4 = var2Lifetime4 + "| " + var31;
        var11Lifetime9 = var2Lifetime4;
        var2Lifetime5 = var11Lifetime9;
        var11Lifetime10 = var2Lifetime5;
        return var2Lifetime5;
    }

    pc() {
        this.field_f = 0;
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = (boolean[][]) null;
        if (param0 != 12653) {
          pc.a(53);
          field_e = null;
          return;
        }
        field_e = null;
    }

    static {
        field_b = new boolean[640][480];
    }
}
