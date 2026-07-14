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
        int var1 = 0;
        int var2 = 0;
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
        CharSequence var3 = null;
        if (param1 != 0) {
          var3 = (CharSequence) null;
          String discarded$2 = ee.a((CharSequence) null, -16);
          return po.a(param1 ^ -1, param0, false);
        } else {
          return po.a(param1 ^ -1, param0, false);
        }
    }

    final static String[] a(byte param0, char param1, String param2) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        var10 = (CharSequence) param2;
        var3 = vu.a(var10, (byte) 103, param1);
        var4 = new String[var3 - -1];
        var5 = 0;
        var6 = 0;
        if (param0 != 10) {
          ee.c((byte) -15);
          var7 = 0;
          L0: while (true) {
            if (var3 <= var7) {
              var4[var3] = param2.substring(var6);
              return var4;
            } else {
              var8 = var6;
              L1: while (true) {
                if (param1 == param2.charAt(var8)) {
                  var5++;
                  var4[var5] = param2.substring(var6, var8);
                  var6 = var8 - -1;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } else {
          var7 = 0;
          L2: while (true) {
            if (var3 <= var7) {
              var4[var3] = param2.substring(var6);
              return var4;
            } else {
              var8 = var6;
              L3: while (true) {
                if (param1 == param2.charAt(var8)) {
                  var5++;
                  var4[var5] = param2.substring(var6, var8);
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
    }

    abstract q b(byte param0);

    final static byte[] a(boolean param0, File param1) {
        File var3 = null;
        if (!param0) {
          var3 = (File) null;
          byte[] discarded$2 = ee.a(false, (File) null);
          return cn.a(param1, (int)param1.length(), false);
        } else {
          return cn.a(param1, (int)param1.length(), false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[2];
    }
}
