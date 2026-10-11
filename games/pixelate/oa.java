/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oa extends hn implements hi, mb {
    static int field_j;
    static String field_h;
    kb field_g;
    static boolean field_i;

    public final void a(int param0, c param1) {
        try {
          int var3_int = -49 / ((-30 - param0) / 60);
          this.b(2048);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "oa.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          oa.a(-73, -28);
          field_h = null;
          return;
        }
        field_h = null;
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        qa var14 = null;
        String var8_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        int var12 = 0;
        String var2 = null;
        String var11 = null;
        int var13 = Pixelate.field_H ? 1 : 0;
        String var2Lifetime1;
        String var2Lifetime2;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var11Lifetime5Lifetime1;
        String var11Lifetime5Lifetime2;
        if (!(param0 instanceof qa)) {
          var2 = "";
        } else {
          var14 = (qa) ((Object) param0);
          param0 = var14.field_c;
          var2 = var14.field_d + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
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
        String var7 = var6.readLine();
        var11Lifetime3 = var7;
        var2Lifetime2 = var11Lifetime3;
        var11Lifetime4 = var7;
        while (true) {
          var8_ref_String = var6.readLine();
          var11Lifetime5 = var8_ref_String;
          var2Lifetime2 = var11Lifetime5;
          var11Lifetime5Lifetime1 = var8_ref_String;
          if (var8_ref_String == null) {
            break;
          }
          var9 = var8_ref_String.indexOf('(');
          var10 = var8_ref_String.indexOf(')', 1 + var9);
          if (var9 != -1) {
            var11Lifetime5Lifetime2 = var8_ref_String.substring(0, var9);
          } else {
            var11Lifetime5Lifetime2 = var8_ref_String;
            var2Lifetime2 = var11Lifetime5Lifetime2;
            var2Lifetime2 = var11Lifetime5Lifetime2;
          }
          var16 = var11Lifetime5Lifetime2.trim();
          var2Lifetime2 = var16;
          var2Lifetime2 = var16;
          var17 = var16.substring(var16.lastIndexOf(' ') + 1);
          var2Lifetime2 = var17;
          var2Lifetime2 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime2 = var18;
          var2Lifetime2 = var18;
          var19 = var2Lifetime2 + var18;
          var2Lifetime2 = var19;
          var2Lifetime2 = var19;
          var2Lifetime2 = var19;
          if (var9 != -1 &&
            var10 != -1) {
            var12 = var8_ref_String.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime2 = var19 + var8_ref_String.substring(5 + var12, var10);
            }
          }
          var2Lifetime2 = var2Lifetime2 + ' ';
        }
        int var8 = 25 % ((47 - param1) / 56);
        var2Lifetime2 = var2Lifetime2 + "| " + var7;
        return var2Lifetime2;
    }

    final static boolean a(int param0, int param1) {
        if (param1 == 1890) {
          return (-param0 & param0) == param0 ? true : false;
        }
        field_i = false;
        return (-param0 & param0) == param0 ? true : false;
    }

    final dj a(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dj stackIn_3_0 = null;
        dj stackIn_7_0 = null;
        dj stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_g.e((byte) 90);
          var3 = this.field_g.l(25);
          var4 = this.field_g.c(param0);
          var5 = wa.b(-80);
          if (1890 > var4) {
            stackIn_3_0 = sk.field_a;
            return stackIn_3_0;
          }
          if (-3 + var5 < var4) {
            stackIn_7_0 = sk.field_a;
            return stackIn_7_0;
          }
          if (!dq.a(var2_int, var3, -2, var4)) {
            stackIn_10_0 = sk.field_a;
            return stackIn_10_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return sk.field_a;
        }
        return qk.field_g;
    }

    public final void a(c param0, int param1) {
        try {
          if (param1 != 4) {
            this.field_g = (kb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "oa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(int param0) {
        if (param0 != -22265) {
          field_i = false;
          return this.field_g.m(-1);
        }
        return this.field_g.m(-1);
    }

    final String c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_g.e((byte) -84);
          var3 = this.field_g.l(25);
          var4 = this.field_g.c(true);
          var5 = wa.b(-127);
          if (var4 >= 1890 &&
            var5 - 3 >= var4) {
            if (dq.a(var2_int, var3, param0 + param0, var4)) {
              return null;
            }
          } else {
            stackIn_4_0 = sd.a(kd.field_d, 120, new String[]{"1890", Integer.toString(-3 + var5)});
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return ue.field_p;
    }

    public oa() {
    }

    static {
        field_j = 0;
        field_h = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
