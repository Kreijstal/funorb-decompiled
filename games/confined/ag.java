/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ag {
    private int field_c;
    static String[] field_d;
    static String field_e;
    private int field_i;
    private gh field_f;
    static String field_j;
    static double[] field_a;
    static int[] field_g;
    private lm field_b;
    static boolean field_h;

    private final void a(int param0, nd param1) {
        try {
          if (param1 != null) {
            param1.a(true);
            param1.b(true);
            this.field_i = this.field_i + param1.field_t;
          }
          int var3_int = 55 / ((-2 - param0) / 52);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ag.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        if (param0 == 10) {
          field_j = null;
          field_g = null;
          field_a = null;
          return;
        }
        field_j = (String) null;
        field_j = null;
        field_g = null;
        field_a = null;
    }

    final static String a(int param0, Throwable param1) throws IOException {
        ec var14 = null;
        String var20 = null;
        BufferedReader var21 = null;
        String var27 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var2 = null;
        String var11 = null;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = Confined.field_J ? 1 : 0;
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
        String var2Lifetime1Lifetime1;
        String var2Lifetime1Lifetime2;
        String var11Lifetime1Lifetime1;
        String var11Lifetime1Lifetime2;
        String var11Lifetime1Lifetime3;
        String var11Lifetime1Lifetime4;
        String var11Lifetime1Lifetime5;
        String var11Lifetime1Lifetime6;
        String var11Lifetime8Lifetime1;
        String var11Lifetime8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        if (!(param1 instanceof ec)) {
          var2 = "";
        } else {
          var14 = (ec) ((Object) param1);
          var2 = var14.field_c + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime11 = var2;
          param1 = var14.field_b;
        }
        StringWriter var15 = new StringWriter();
        PrintWriter var4 = new PrintWriter((Writer) ((Object) var15));
        if (param0 != -19080) {
          ag.a(36);
        } else {
          param1.printStackTrace(var4);
          var4.close();
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
            var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
            var11Lifetime1Lifetime4 = var22;
            if (var22 == null) {
              break;
            }
            var9 = var22.indexOf('(');
            var10 = var22.indexOf(')', 1 + var9);
            if (var9 != -1) {
              var11Lifetime1Lifetime4 = var22.substring(0, var9);
            } else {
              var11Lifetime1Lifetime4 = var22;
              var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
              var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
            }
            var23 = var11Lifetime1Lifetime4.trim();
            var2Lifetime1Lifetime1 = var23;
            var2Lifetime1Lifetime1 = var23;
            var24 = var23.substring(var23.lastIndexOf(' ') + 1);
            var2Lifetime1Lifetime1 = var24;
            var2Lifetime1Lifetime1 = var24;
            var25 = var24.substring(var24.lastIndexOf('\t') + 1);
            var2Lifetime1Lifetime1 = var25;
            var2Lifetime1Lifetime1 = var25;
            var26 = var2Lifetime1Lifetime1 + var25;
            var2Lifetime1Lifetime1 = var26;
            var2Lifetime1Lifetime1 = var26;
            var2Lifetime1Lifetime1 = var26;
            if (-1 != var9 &&
              var10 != -1) {
              var12 = var22.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime1Lifetime1 = var26 + var22.substring(var12 + 5, var10);
              }
            }
            var2Lifetime1Lifetime1 = var2Lifetime1Lifetime1 + ' ';
          }
          var2Lifetime1Lifetime1 = var2Lifetime1Lifetime1 + "| " + var27;
          var11Lifetime1Lifetime5 = var2Lifetime1Lifetime1;
          var2Lifetime1Lifetime2 = var11Lifetime1Lifetime5;
          var11Lifetime1Lifetime6 = var2Lifetime1Lifetime2;
          return var2Lifetime1Lifetime2;
        }
        param1.printStackTrace(var4);
        var4.close();
        String var28 = var15.toString();
        var11Lifetime2 = var28;
        var2Lifetime2 = var11Lifetime2;
        var11Lifetime3 = var28;
        BufferedReader var29 = new BufferedReader((Reader) ((Object) new StringReader(var28)));
        BufferedReader var6 = var29;
        String var35 = var29.readLine();
        var11Lifetime4 = var35;
        var2Lifetime3 = var11Lifetime4;
        var11Lifetime5 = var35;
        String var7 = var35;
        var11Lifetime6 = var7;
        var2Lifetime4 = var11Lifetime6;
        var11Lifetime7 = var7;
        while (true) {
          var30 = var29.readLine();
          var11Lifetime8 = var30;
          var2Lifetime4 = var11Lifetime8;
          var11Lifetime8Lifetime1 = var30;
          if (var30 == null) {
            break;
          }
          var9Lifetime1 = var30.indexOf('(');
          var10Lifetime1 = var30.indexOf(')', 1 + var9Lifetime1);
          if (var9Lifetime1 != -1) {
            var11Lifetime8Lifetime2 = var30.substring(0, var9Lifetime1);
          } else {
            var11Lifetime8Lifetime2 = var30;
            var2Lifetime4 = var11Lifetime8Lifetime2;
            var2Lifetime4 = var11Lifetime8Lifetime2;
          }
          var31 = var11Lifetime8Lifetime2.trim();
          var2Lifetime4 = var31;
          var2Lifetime4 = var31;
          var32 = var31.substring(var31.lastIndexOf(' ') + 1);
          var2Lifetime4 = var32;
          var2Lifetime4 = var32;
          var33 = var32.substring(var32.lastIndexOf('\t') + 1);
          var2Lifetime4 = var33;
          var2Lifetime4 = var33;
          var34 = var2Lifetime4 + var33;
          var2Lifetime4 = var34;
          var2Lifetime4 = var34;
          var2Lifetime4 = var34;
          if (-1 != var9Lifetime1 &&
            var10Lifetime1 != -1) {
            var12Lifetime1 = var30.indexOf(".java:", var9Lifetime1);
            if (var12Lifetime1 >= 0) {
              var2Lifetime4 = var34 + var30.substring(var12Lifetime1 + 5, var10Lifetime1);
            }
          }
          var2Lifetime4 = var2Lifetime4 + ' ';
        }
        var2Lifetime4 = var2Lifetime4 + "| " + var35;
        var11Lifetime9 = var2Lifetime4;
        var2Lifetime5 = var11Lifetime9;
        var11Lifetime10 = var2Lifetime5;
        return var2Lifetime5;
    }

    private final void b(int param0, long param1) {
        nd var5 = null;
        Object var4 = null;
        nd var5Lifetime1;
        if (param0 < -76) {
          var5 = (nd) (this.field_f.a(1, param1));
          this.a(83, var5);
          return;
        }
        this.b(64, 29L);
        var5Lifetime1 = (nd) (this.field_f.a(1, param1));
        this.a(83, var5Lifetime1);
    }

    private ag() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, long param1, Object param2, int param3) {
        nd var6 = null;
        oj var6_ref = null;
        int var7 = Confined.field_J ? 1 : 0;
        try {
          if (this.field_c < param0) {
            throw new IllegalStateException();
          }
          this.b(-110, param1);
          this.field_i = this.field_i - param0;
          while (this.field_i < 0) {
            var6 = (nd) (this.field_b.a(-29870));
            this.a(param3 ^ -96, var6);
          }
          var6_ref = new oj(param2, param0);
          this.field_f.a(var6_ref, param1, ~param3);
          this.field_b.a(var6_ref, 18425);
          ((nd) ((Object) var6_ref)).field_r = (long)param3;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ag.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final Object a(int param0, long param1) {
        nd var7 = (nd) (this.field_f.a(1, param1));
        if (param0 != 0) {
          return (Object) null;
        }
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.d(param0 - 4);
        if (var5 == null) {
          var7.a(true);
          var7.b(true);
          this.field_i = this.field_i + var7.field_t;
          return null;
        }
        if (!var7.f((byte) -102)) {
          this.field_b.a(var7, 18425);
          var7.field_r = 0L;
          return var5;
        }
        oj var6 = new oj(var5, var7.field_t);
        this.field_f.a(var6, var7.field_i, param0 - 1);
        this.field_b.a(var6, param0 + 18425);
        ((nd) ((Object) var6)).field_r = 0L;
        var7.a(true);
        var7.b(true);
        return var5;
    }

    final void a(byte param0, long param1, Object param2) {
        try {
          if (param0 != -2) {
            this.field_i = -88;
          }
          this.a(1, param1, param2, param0 + 2);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ag.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = new double[]{0.0, 0.0, 0.0, 0.0, 10.0, 0.1, 10.0, 0.07, 0.4, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 20.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 15.0, 0.07, 15.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, 0.17, 7.0, 0.13, 0.4, 0.2, 0.0, 0.0, 0.0, 0.0, 5.0, 0.2, 5.0, 0.17, 0.3, 0.07, 0.0, 0.0, 0.0, 0.0, 3.0, 0.3, 3.0, 0.27, 0.4, 0.12, 0.0, 0.0, 0.0, 0.0, 2.0, 0.4, 2.0, 0.37, 0.5, 0.17, 0.0, 0.0, 0.0, 0.0, 10.0, 0.07, 10.0, 0.1, 0.2, 0.07, 0.0, 0.0, 0.2, 0.1, 10.0, 0.07, 10.0, 0.1, 0.2, 0.17, 0.0, 0.0, 0.4, 0.1, 10.0, 0.07, 10.0, 0.1, 0.3, 0.17, 0.0, 0.0, 0.0, 0.0, 10.0, 0.07, 10.0, 0.1, 0.4, 0.17, 0.0, 0.0, 0.2, 0.1, 10.0, 0.07, 10.0, 0.1, 0.4, 0.17, 0.4, 0.2, 0.0, 0.0, 2.0, 0.4, 2.0, 0.33, 0.4, 0.17, 0.3, 0.3, 0.4, 0.2, 6.0, 0.23, 10.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.2, 0.2, 10.0, 0.07, 10.0, 0.1, 0.4, 0.17, 0.0, 0.0, 0.0, 0.0, 10.0, 0.07, 10.0, 0.1, 0.4, 0.17, 0.0, 0.0, 0.4, 0.4, 2.0, 0.4, 10.0, 0.1, 0.4, 0.17, 0.4, 0.4, 0.0, 0.0, 2.0, 0.4, 10.0, 0.1, 0.4, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.17, 0.3, 0.4, 0.3, 0.3, 0.0, 0.0, 0.0, 0.0, 0.4, 0.17, 0.3, 0.4, 0.3, 0.3, 10.0, 0.07, 10.0, 0.13, 0.4, 0.17, 0.4, 0.3, 0.4, 0.4, 10.0, 0.07, 10.0, 0.13, 0.4, 0.17, 0.3, 0.1, 0.3, 0.7, 10.0, 0.07, 10.0, 0.13, 0.4, 0.17, 0.0, 0.0, 0.0, 0.0, 10.0, 0.17, 10.0, 0.13, 0.4, 0.23};
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_g = new int[]{4, 4, 4, 4, 7, 5, 5, 5, 7, 4, 5, 4, 7, 7, 6, 7, 5, 3, 3, 6, 7, 7, 5, 6, 7};
    }
}
