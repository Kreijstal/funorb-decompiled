/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ih extends hl {
    static int field_p;
    static ah field_n;
    static ah field_j;
    static int field_o;
    int field_r;
    int field_l;
    static int field_m;
    int field_k;
    static hj[] field_t;
    int field_s;
    int field_u;
    int field_q;
    static long field_i;

    final static void a(int param0, int param1, int param2, int param3) {
        hg.field_I = param3;
        sd.field_c = param2;
        if (param0 != 14893) {
          ih.a(-62, -61, 42, 74);
        }
        ge.field_b = param1;
    }

    public static void a(byte param0) {
        field_n = null;
        field_j = null;
        if (param0 < 116) {
          field_n = (ah) null;
        }
        field_t = null;
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
        ii var14;
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
        var13 = HoldTheLine.field_D;
        if (param1 != -12895) {
          field_m = -46;
        }
        if (param0 instanceof ii) {
          var14 = (ii) ((Object) param0);
          param0 = var14.field_f;
          var2 = var14.field_a + " | ";
          var11 = var2;
        } else {
          var2 = "";
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
          var17 = var16.substring(1 + var16.lastIndexOf(' '));
          var2Lifetime3Lifetime6 = var17;
          var2Lifetime3Lifetime7 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime8 = var18;
          var2Lifetime3Lifetime9 = var18;
          var19 = var2Lifetime3Lifetime9 + var18;
          var2Lifetime3Lifetime10 = var19;
          var2Lifetime3Lifetime11 = var19;
          var2Lifetime3Lifetime12 = var19;
          if (-1 != var9 &&
            var10 != -1) {
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime12 = var19 + var8.substring(5 + var12, var10);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    final static String a(int param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        StringBuilder var2 = new StringBuilder(param1);
        for (var3 = 0; var3 < param0; var3++) {
          discarded$0 = var2.append('‘');
        }
        while (var3 < 5) {
          discarded$1 = var2.append('’');
          var3++;
        }
        return var2.toString();
    }

    ih(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_r = param0;
        this.field_s = param1;
        this.field_q = param3;
        this.field_l = param2;
        this.field_u = param5;
        this.field_k = param4;
    }

    static {
        field_j = new ah();
    }
}
