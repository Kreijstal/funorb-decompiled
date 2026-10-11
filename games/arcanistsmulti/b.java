/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class b {
    static vn field_a;
    static ri field_e;
    static String field_c;
    static int[] field_f;
    static String field_b;
    static String field_d;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 > 53) {
          field_e = null;
          return;
        }
        field_a = (vn) null;
        field_e = null;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        int var5;
        String var6;
        BufferedReader var7;
        String var8;
        String var9;
        int var10;
        int var11;
        String var12;
        int var14;
        p var15;
        StringWriter var16;
        String var17;
        String var18;
        String var19;
        String var20;
        int var13;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var12Lifetime1;
        String var12Lifetime2;
        String var12Lifetime3;
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
        String var12Lifetime3Lifetime1;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 instanceof p) {
          var15 = (p) ((Object) param1);
          param1 = var15.field_g;
          var2 = var15.field_i + " | ";
          var12 = var2;
        } else {
          var2 = "";
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var16));
        param1.printStackTrace(var4);
        var5 = -66 % ((32 - param0) / 52);
        var4.close();
        var6 = var16.toString();
        var2Lifetime1 = var6;
        var12Lifetime1 = var6;
        var7 = new BufferedReader((Reader) ((Object) new StringReader(var6)));
        var8 = var7.readLine();
        var2Lifetime2 = var8;
        var12Lifetime2 = var8;
        while (true) {
          var9 = var7.readLine();
          var2Lifetime3 = var9;
          var12Lifetime3 = var9;
          var2Lifetime3Lifetime1 = var12Lifetime3;
          if (var9 == null) {
            var2Lifetime3Lifetime2 = var12Lifetime3;
            var12Lifetime3 = var2Lifetime3Lifetime2;
            var2Lifetime3Lifetime2 = var12Lifetime3;
            var2Lifetime3Lifetime2 = var2Lifetime3Lifetime2 + "| " + var8;
            return var2Lifetime3Lifetime2;
          }
          var10 = var9.indexOf('(');
          var11 = var9.indexOf(')', 1 + var10);
          if (-1 == var10) {
            var12Lifetime3Lifetime1 = var9;
            var2Lifetime3Lifetime3 = var12Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var12Lifetime3Lifetime1;
          } else {
            var12Lifetime3Lifetime1 = var9.substring(0, var10);
          }
          var17 = var12Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(1 + var17.lastIndexOf(' '));
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var18.substring(var18.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var20 = var2Lifetime3Lifetime9 + var19;
          var2Lifetime3Lifetime10 = var20;
          var2Lifetime3Lifetime11 = var20;
          var2Lifetime3Lifetime12 = var20;
          if (var10 != -1) {
            if (var11 == -1) {
              var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
              continue;
            }
            var13 = var9.indexOf(".java:", var10);
            if (var13 >= 0) {
              var2Lifetime3Lifetime12 = var20 + var9.substring(var13 + 5, var11);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    static {
        field_a = new vn();
        field_e = new ri();
        field_f = new int[]{0, 2, 4, 6, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        field_b = "<%0> cannot join; the game is full.";
        field_c = "Mos Le'Harmless";
        field_d = "Red Team";
    }
}
