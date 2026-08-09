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
        int var1;
        int var2;
        if (param0 != 14) {
          return;
        } else {
          var1 = vs.b(-99);
          var2 = un.e(-121);
          qg.field_d.a(-652, var1 + (ku.field_h << -175031135), (po.field_j << 2028753953) + var2, pt.field_a + -po.field_j, -ku.field_h + ac.field_c);
          qa.b(-37);
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                ee.a((CharSequence) null, -16);
                break L1;
              }
            }
            stackIn_3_0 = po.a(param1 ^ -1, param0, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ee.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static String[] a(byte param0, char param1, String param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = (CharSequence) ((Object) param2);
              var3_int = vu.a(var10, (byte) 103, param1);
              var4 = new String[var3_int - -1];
              var5 = 0;
              var6 = 0;
              if (param0 == 10) {
                break L1;
              } else {
                ee.c((byte) -15);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var3_int <= var7) {
                var4[var3_int] = param2.substring(var6);
                stackIn_10_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param1 == param2.charAt(var8)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param2.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ee.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    abstract q b(byte param0);

    final static byte[] a(boolean param0, File param1) {
        RuntimeException var2 = null;
        File var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var3 = (File) null;
                ee.a(false, (File) null);
                break L1;
              }
            }
            stackIn_3_0 = cn.a(param1, (int)param1.length(), false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ee.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_d = new int[2];
    }
}
