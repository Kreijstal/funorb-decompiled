/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ii {
    static String field_a;
    static int field_b;

    final static boolean a(int param0, char param1) {
        boolean stackIn_27_0 = false;
        if (param0 != 1) {
          return false;
        }
        if (param1 < 48) {
          if (param1 < 65) {
            if (param1 >= 97 &&
              122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_27_0 = (param1 >= 97) && (122 >= param1);
          return stackIn_27_0;
        }
        if (57 >= param1) {
          return true;
        }
        if (param1 >= 65 &&
          param1 <= 90) {
          return true;
        }
        if (param1 < 97) {
          return false;
        }
        if (122 < param1) {
          return false;
        }
        return true;
    }

    final static String a(int param0, Throwable param1) throws IOException {
        h var14 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        int var12 = 0;
        String var2 = null;
        String var11 = null;
        int var13 = fleas.field_A ? 1 : 0;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var2Lifetime4;
        if (!(param1 instanceof h)) {
          var2 = "";
        } else {
          var14 = (h) ((Object) param1);
          param1 = var14.field_e;
          var2 = var14.field_f + " | ";
        }
        StringWriter var15 = new StringWriter();
        PrintWriter var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        String var5 = var15.toString();
        var2Lifetime1 = var5;
        var2Lifetime2 = var5;
        BufferedReader var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        String var7 = var6.readLine();
        var2Lifetime3 = var7;
        var2Lifetime4 = var7;
        while (true) {
          var8 = var6.readLine();
          var2Lifetime4 = var8;
          var2Lifetime4 = var8;
          if (var8 == null) {
            break;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 == -1) {
            var11 = var8;
          } else {
            var11 = var8.substring(0, var9);
            var2Lifetime4 = var11;
            var2Lifetime4 = var11;
          }
          var16 = var11.trim();
          var2Lifetime4 = var16;
          var2Lifetime4 = var16;
          var17 = var16.substring(var16.lastIndexOf(' ') + 1);
          var2Lifetime4 = var17;
          var2Lifetime4 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime4 = var18;
          var2Lifetime4 = var18;
          var19 = var2Lifetime4 + var18;
          var2Lifetime4 = var19;
          var2Lifetime4 = var19;
          var2Lifetime4 = var19;
          if (var9 != -1 &&
            var10 != -1) {
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime4 = var19 + var8.substring(5 + var12, var10);
            }
          }
          var2Lifetime4 = var2Lifetime4 + ' ';
        }
        if (param0 > 18) {
          var2Lifetime4 = var2Lifetime4 + "| " + var7;
          return var2Lifetime4;
        }
        field_b = 46;
        var2Lifetime4 = var2Lifetime4 + "| " + var7;
        return var2Lifetime4;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 5) {
          field_b = -53;
        }
    }

    final static void b(int param0) {
        if (param0 <= 111) {
          ii.a(11, '\002');
          bj.a(14, rl.a((byte) -54));
          return;
        }
        bj.a(14, rl.a((byte) -54));
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12969) {
            ii.a(77);
          }
          stackIn_3_0 = gi.a(param1, true, 0, 10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ii.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1;
        int var2;
        var2 = fleas.field_A ? 1 : 0;
        rh.field_e = null;
        ah.field_c = false;
        if (!jg.field_d) {
          var1 = nb.field_h;
          if (var1 > 0) {
            if (var1 == 1) {
              rh.field_e = ri.field_q;
            } else {
              rh.field_e = db.a(rg.field_r, new String[]{Integer.toString(var1)}, true);
            }
            rh.field_e = gj.a(0, new CharSequence[]{(CharSequence) ((Object) rh.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) jk.field_p)});
            ok.field_x.n(-22645);
            ic.n(-128);
            if (param0 == -88) {
              return;
            }
            ii.a(-2, 'D');
            return;
          }
          ok.field_x.n(-22645);
          ic.n(-128);
        } else {
          ok.field_x.e(true);
        }
        if (param0 == -88) {
          return;
        }
        ii.a(-2, 'D');
    }

    static {
        field_a = "Orb points: <%0>";
        field_b = 24;
    }
}
