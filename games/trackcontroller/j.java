/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j {
    static qj[] field_b;
    static int field_a;
    private boolean field_g;
    static int[] field_f;
    static kk field_h;
    private String field_e;
    static String field_d;
    private boolean field_i;
    static int field_c;

    final boolean b(byte param0) {
        if (param0 < 73) {
          return false;
        }
        return this.field_g;
    }

    final boolean c(byte param0) {
        if (param0 > -71) {
          return true;
        }
        return this.field_i;
    }

    final String a(byte param0) {
        if (param0 != 63) {
          return (String) null;
        }
        return this.field_e;
    }

    final static String a(boolean param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        int var9;
        int var10;
        String var11;
        int var13;
        nl var14;
        StringWriter var15;
        String var20;
        BufferedReader var21;
        String var22;
        String var23;
        String var24;
        String var25;
        String var26;
        String var27;
        BufferedReader var6;
        String var7;
        int var12;
        String var28;
        BufferedReader var29;
        String var30;
        String var31;
        String var32;
        String var33;
        String var34;
        String var35;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
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
        String var2Lifetime1Lifetime1;
        String var2Lifetime1Lifetime2;
        String var2Lifetime5Lifetime1;
        String var2Lifetime5Lifetime2;
        String var2Lifetime5Lifetime3;
        String var2Lifetime5Lifetime4;
        String var2Lifetime5Lifetime5;
        String var2Lifetime5Lifetime6;
        String var2Lifetime5Lifetime7;
        String var2Lifetime5Lifetime8;
        String var2Lifetime5Lifetime9;
        String var2Lifetime5Lifetime10;
        String var11Lifetime1Lifetime1;
        String var11Lifetime1Lifetime2;
        String var11Lifetime1Lifetime3;
        String var11Lifetime1Lifetime4;
        String var11Lifetime8Lifetime1;
        String var11Lifetime8Lifetime2;
        String var11Lifetime8Lifetime3;
        var13 = TrackController.field_F ? 1 : 0;
        if (!(param1 instanceof nl)) {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11Lifetime9 = var2;
        } else {
          var14 = (nl) ((Object) param1);
          var2 = var14.field_a + " | ";
          param1 = var14.field_d;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        if (!param0) {
          var20 = var15.toString();
          var11Lifetime1 = var20;
          var2Lifetime1 = var11Lifetime1;
          var11Lifetime1Lifetime1 = var20;
          var21 = new BufferedReader((Reader) ((Object) new StringReader(var20)));
          var27 = var21.readLine();
          var11Lifetime1Lifetime2 = var27;
          var2Lifetime1Lifetime1 = var11Lifetime1Lifetime2;
          var11Lifetime1Lifetime3 = var27;
          while (true) {
            var22 = var21.readLine();
            var11Lifetime1Lifetime4 = var22;
            var2Lifetime1Lifetime2 = var11Lifetime1Lifetime4;
            var11Lifetime1Lifetime4 = var22;
            if (var22 == null) {
              var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + "| " + var27;
              var11Lifetime1Lifetime4 = var2Lifetime1Lifetime2;
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime4;
              var11Lifetime1Lifetime4 = var2Lifetime1Lifetime2;
              return var2Lifetime1Lifetime2;
            }
            var9 = var22.indexOf('(');
            var10 = var22.indexOf(')', 1 + var9);
            if (-1 != var9) {
              var11Lifetime1Lifetime4 = var22.substring(0, var9);
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime4;
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime4;
            } else {
              var11Lifetime1Lifetime4 = var22;
            }
            var23 = var11Lifetime1Lifetime4.trim();
            var2Lifetime1Lifetime2 = var23;
            var2Lifetime1Lifetime2 = var23;
            var24 = var23.substring(var23.lastIndexOf(' ') + 1);
            var2Lifetime1Lifetime2 = var24;
            var2Lifetime1Lifetime2 = var24;
            var25 = var24.substring(1 + var24.lastIndexOf('\t'));
            var2Lifetime1Lifetime2 = var25;
            var2Lifetime1Lifetime2 = var25;
            var26 = var2Lifetime1Lifetime2 + var25;
            var2Lifetime1Lifetime2 = var26;
            var2Lifetime1Lifetime2 = var26;
            var2Lifetime1Lifetime2 = var26;
            if (var9 != -1) {
              if (var10 == -1) {
                var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + ' ';
                continue;
              }
              var12 = var22.indexOf(".java:", var9);
              if (0 <= var12) {
                var2Lifetime1Lifetime2 = var26 + var22.substring(var12 + 5, var10);
              }
            }
            var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + ' ';
          }
        }
        field_a = 20;
        var28 = var15.toString();
        var11Lifetime2 = var28;
        var2Lifetime2 = var11Lifetime2;
        var11Lifetime3 = var28;
        var29 = new BufferedReader((Reader) ((Object) new StringReader(var28)));
        var6 = var29;
        var35 = var29.readLine();
        var11Lifetime4 = var35;
        var2Lifetime3 = var11Lifetime4;
        var11Lifetime5 = var35;
        var7 = var35;
        var11Lifetime6 = var7;
        var2Lifetime4 = var11Lifetime6;
        var11Lifetime7 = var7;
        while (true) {
          var30 = var29.readLine();
          var11Lifetime8 = var30;
          var2Lifetime5 = var11Lifetime8;
          var11Lifetime8Lifetime1 = var30;
          if (var30 == null) {
            var2Lifetime5 = var2Lifetime5 + "| " + var35;
            var11Lifetime8Lifetime2 = var2Lifetime5;
            var2Lifetime5 = var11Lifetime8Lifetime2;
            var11Lifetime8Lifetime2 = var2Lifetime5;
            return var2Lifetime5;
          }
          var9Lifetime1 = var30.indexOf('(');
          var10Lifetime1 = var30.indexOf(')', 1 + var9Lifetime1);
          if (-1 != var9Lifetime1) {
            var11Lifetime8Lifetime3 = var30.substring(0, var9Lifetime1);
            var2Lifetime5Lifetime1 = var11Lifetime8Lifetime3;
            var2Lifetime5Lifetime1 = var11Lifetime8Lifetime3;
          } else {
            var11Lifetime8Lifetime3 = var30;
          }
          var31 = var11Lifetime8Lifetime3.trim();
          var2Lifetime5Lifetime2 = var31;
          var2Lifetime5Lifetime3 = var31;
          var32 = var31.substring(var31.lastIndexOf(' ') + 1);
          var2Lifetime5Lifetime4 = var32;
          var2Lifetime5Lifetime5 = var32;
          var33 = var32.substring(1 + var32.lastIndexOf('\t'));
          var2Lifetime5Lifetime6 = var33;
          var2Lifetime5Lifetime7 = var33;
          var34 = var2Lifetime5Lifetime7 + var33;
          var2Lifetime5Lifetime8 = var34;
          var2Lifetime5Lifetime9 = var34;
          var2Lifetime5Lifetime10 = var34;
          if (var9Lifetime1 != -1) {
            if (var10Lifetime1 == -1) {
              var2Lifetime5Lifetime10 = var2Lifetime5Lifetime10 + ' ';
              continue;
            }
            var12Lifetime1 = var30.indexOf(".java:", var9Lifetime1);
            if (0 <= var12Lifetime1) {
              var2Lifetime5Lifetime10 = var34 + var30.substring(var12Lifetime1 + 5, var10Lifetime1);
            }
          }
          var2Lifetime5Lifetime10 = var2Lifetime5Lifetime10 + ' ';
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_i = param0 ? true : false;
        this.field_g = param1 ? true : false;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeKeyListener(cj.field_o);
          param0.removeFocusListener(cj.field_o);
          mg.field_f = -1;
          if (param1 <= 55) {
            field_c = -8;
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "j.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 <= -71) {
          field_f = null;
          field_d = null;
          field_h = null;
          return;
        }
        field_b = (qj[]) null;
        field_f = null;
        field_d = null;
        field_h = null;
    }

    j(String param0) {
        this.field_g = false;
        this.field_i = false;
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "j.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "More suggestions";
        field_c = -1;
    }
}
