/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ee extends or {
    static int[] field_e;
    static int[] field_d;

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
          ee.c((byte) 111);
        }
    }

    private ee() throws Throwable {
        throw new Error();
    }

    final static void c(byte param0) {
        if (param0 == 14) {
          int var1 = BitmapFontMetrics.b(-99);
          int var2 = un.e(-121);
          qg.field_d.a(-652, var1 + (ku.field_h << 1), (po.field_j << 1) + var2, pt.field_a - po.field_j, -ku.field_h + ac.field_c);
          qa.b(-37);
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        String stackIn_7_2 = null;
        try {
          if (param1 != 0) {
            CharSequence var3 = (CharSequence) null;
            ee.a((CharSequence) null, -16);
          }
          String stackIn_3_0 = po.a(~param1, param0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ee.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String[] a(byte param0, char param1, String param2) {
        int var8 = 0;
        String stackIn_14_2 = null;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          CharSequence var10 = (CharSequence) ((Object) param2);
          int var3_int = vu.a(var10, (byte) 103, param1);
          String[] var4 = new String[var3_int + 1];
          int var5 = 0;
          int var6 = 0;
          if (param0 != 10) {
            ee.c((byte) -15);
          }
          for (int var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            int incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          String[] stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ee.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    abstract q b(byte param0);

    final static byte[] a(boolean param0, File param1) {
        String stackIn_7_2 = null;
        try {
          if (!param0) {
            File var3 = (File) null;
            ee.a(false, (File) null);
          }
          byte[] stackIn_3_0 = cn.a(param1, (int)param1.length(), false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ee.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_d = new int[2];
    }
}
