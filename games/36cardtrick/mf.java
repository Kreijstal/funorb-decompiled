/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mf extends qb {
    static int field_g;
    int field_k;
    int field_h;
    static int field_i;
    static long field_j;

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var13;
        ac var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        int var12;
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
        var13 = Main.field_T;
        if (!(param0 instanceof ac)) {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
        } else {
          var14 = (ac) ((Object) param0);
          param0 = var14.field_b;
          var2 = var14.field_a + " | ";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        if (param1 != -3) {
          return (String) null;
        }
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
            var2Lifetime3 = var2Lifetime3 + "| " + var7;
            return var2Lifetime3;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (-1 != var9) {
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
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var2Lifetime3Lifetime7 + var18;
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var2Lifetime3Lifetime10 = var19;
          if (-1 != var9) {
            if (var10 == -1) {
              var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (0 <= var12) {
              var2Lifetime3Lifetime10 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    private mf() throws Throwable {
        throw new Error();
    }

    static {
        field_i = 80;
    }
}
