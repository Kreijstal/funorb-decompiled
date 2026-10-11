/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le {
    static byte[][][] field_e;
    static tf field_d;
    static String field_b;
    static String field_a;
    static String field_c;

    final static String a(boolean param0, Throwable param1) throws IOException {
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
        Object var14;
        bs var14_ref;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        int var12;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var2Lifetime4;
        PrintWriter var4Lifetime1;
        String var5Lifetime1;
        BufferedReader var6Lifetime1;
        String var7Lifetime1;
        String var8Lifetime1;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        bs var14_refLifetime1;
        StringWriter var15Lifetime1;
        String var16Lifetime1;
        String var17Lifetime1;
        String var18Lifetime1;
        String var19Lifetime1;
        String var2Lifetime5;
        String var2Lifetime6;
        String var2Lifetime7;
        String var11Lifetime5;
        String var11Lifetime6;
        String var11Lifetime7;
        String var2Lifetime4Lifetime1;
        String var2Lifetime4Lifetime2;
        String var2Lifetime4Lifetime3;
        String var2Lifetime4Lifetime4;
        String var2Lifetime4Lifetime5;
        String var2Lifetime4Lifetime6;
        String var2Lifetime4Lifetime7;
        String var2Lifetime4Lifetime8;
        String var2Lifetime4Lifetime9;
        String var2Lifetime4Lifetime10;
        String var2Lifetime4Lifetime11;
        String var2Lifetime4Lifetime12;
        String var11Lifetime4Lifetime1;
        var14 = null;
        var13 = Kickabout.field_G;
        if (param0) {
          if (param1 instanceof bs) {
            var14_ref = (bs) ((Object) param1);
            var2 = var14_ref.field_d + " | ";
            var11 = var2;
            param1 = var14_ref.field_e;
          } else {
            var2 = "";
          }
          var15 = new StringWriter();
          var4 = new PrintWriter((Writer) ((Object) var15));
          param1.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var2Lifetime5 = var5;
          var11Lifetime5 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var7 = var6.readLine();
          var2Lifetime6 = var7;
          var11Lifetime6 = var7;
          while (true) {
            var8 = var6.readLine();
            var2Lifetime7 = var8;
            var11Lifetime7 = var8;
            var2Lifetime7 = var11Lifetime7;
            if (var8 == null) {
              var2Lifetime7 = var11Lifetime7;
              var11Lifetime7 = var2Lifetime7;
              var2Lifetime7 = var11Lifetime7;
              var2Lifetime7 = var2Lifetime7 + "| " + var7;
              return var2Lifetime7;
            }
            var9 = var8.indexOf('(');
            var10 = var8.indexOf(')', var9 + 1);
            if (var9 == -1) {
              var11Lifetime7 = var8;
              var2Lifetime7 = var11Lifetime7;
              var2Lifetime7 = var11Lifetime7;
            } else {
              var11Lifetime7 = var8.substring(0, var9);
            }
            var16 = var11Lifetime7.trim();
            var2Lifetime7 = var16;
            var2Lifetime7 = var16;
            var17 = var16.substring(1 + var16.lastIndexOf(' '));
            var2Lifetime7 = var17;
            var2Lifetime7 = var17;
            var18 = var17.substring(var17.lastIndexOf('\t') + 1);
            var2Lifetime7 = var18;
            var2Lifetime7 = var18;
            var19 = var2Lifetime7 + var18;
            var2Lifetime7 = var19;
            var2Lifetime7 = var19;
            var2Lifetime7 = var19;
            if (var9 != -1) {
              if (-1 == var10) {
                var2Lifetime7 = var2Lifetime7 + ' ';
                continue;
              }
              var12 = var8.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime7 = var19 + var8.substring(5 + var12, var10);
              }
            }
            var2Lifetime7 = var2Lifetime7 + ' ';
          }
        }
        field_a = (String) null;
        if (param1 instanceof bs) {
          var14_refLifetime1 = (bs) ((Object) param1);
          var2Lifetime1 = var14_refLifetime1.field_d + " | ";
          var11Lifetime1 = var2Lifetime1;
          param1 = var14_refLifetime1.field_e;
        } else {
          var2Lifetime1 = "";
        }
        var15Lifetime1 = new StringWriter();
        var4Lifetime1 = new PrintWriter((Writer) ((Object) var15Lifetime1));
        param1.printStackTrace(var4Lifetime1);
        var4Lifetime1.close();
        var5Lifetime1 = var15Lifetime1.toString();
        var2Lifetime2 = var5Lifetime1;
        var11Lifetime2 = var5Lifetime1;
        var6Lifetime1 = new BufferedReader((Reader) ((Object) new StringReader(var5Lifetime1)));
        var7Lifetime1 = var6Lifetime1.readLine();
        var2Lifetime3 = var7Lifetime1;
        var11Lifetime3 = var7Lifetime1;
        while (true) {
          var8Lifetime1 = var6Lifetime1.readLine();
          var2Lifetime4 = var8Lifetime1;
          var11Lifetime4 = var8Lifetime1;
          var2Lifetime4Lifetime1 = var11Lifetime4;
          if (var8Lifetime1 == null) {
            var2Lifetime4Lifetime2 = var11Lifetime4;
            var11Lifetime4 = var2Lifetime4Lifetime2;
            var2Lifetime4Lifetime2 = var11Lifetime4;
            var2Lifetime4Lifetime2 = var2Lifetime4Lifetime2 + "| " + var7Lifetime1;
            return var2Lifetime4Lifetime2;
          }
          var9Lifetime1 = var8Lifetime1.indexOf('(');
          var10Lifetime1 = var8Lifetime1.indexOf(')', var9Lifetime1 + 1);
          if (var9Lifetime1 == -1) {
            var11Lifetime4Lifetime1 = var8Lifetime1;
            var2Lifetime4Lifetime3 = var11Lifetime4Lifetime1;
            var2Lifetime4Lifetime3 = var11Lifetime4Lifetime1;
          } else {
            var11Lifetime4Lifetime1 = var8Lifetime1.substring(0, var9Lifetime1);
          }
          var16Lifetime1 = var11Lifetime4Lifetime1.trim();
          var2Lifetime4Lifetime4 = var16Lifetime1;
          var2Lifetime4Lifetime5 = var16Lifetime1;
          var17Lifetime1 = var16Lifetime1.substring(1 + var16Lifetime1.lastIndexOf(' '));
          var2Lifetime4Lifetime6 = var17Lifetime1;
          var2Lifetime4Lifetime7 = var17Lifetime1;
          var18Lifetime1 = var17Lifetime1.substring(var17Lifetime1.lastIndexOf('\t') + 1);
          var2Lifetime4Lifetime8 = var18Lifetime1;
          var2Lifetime4Lifetime9 = var18Lifetime1;
          var19Lifetime1 = var2Lifetime4Lifetime9 + var18Lifetime1;
          var2Lifetime4Lifetime10 = var19Lifetime1;
          var2Lifetime4Lifetime11 = var19Lifetime1;
          var2Lifetime4Lifetime12 = var19Lifetime1;
          if (var9Lifetime1 != -1) {
            if (-1 == var10Lifetime1) {
              var2Lifetime4Lifetime12 = var2Lifetime4Lifetime12 + ' ';
              continue;
            }
            var12Lifetime1 = var8Lifetime1.indexOf(".java:", var9Lifetime1);
            if (var12Lifetime1 >= 0) {
              var2Lifetime4Lifetime12 = var19Lifetime1 + var8Lifetime1.substring(5 + var12Lifetime1, var10Lifetime1);
            }
          }
          var2Lifetime4Lifetime12 = var2Lifetime4Lifetime12 + ' ';
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          field_b = null;
          field_d = null;
          field_e = (byte[][][]) null;
          field_a = null;
          return;
        }
        field_e = (byte[][][]) null;
        field_b = null;
        field_d = null;
        field_e = (byte[][][]) null;
        field_a = null;
    }

    static {
        field_d = new tf();
        field_b = "Updates will sent to the email address you've given";
        field_c = "kit style";
        field_a = "Add friend";
    }
}
