/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dg {
    static java.util.zip.CRC32 field_b;
    static String field_f;
    static boolean field_a;
    private ut[] field_d;
    static boolean field_e;
    static String field_c;

    void a(int param0, int param1, int param2, int param3, int param4) {
        ea.a(param2, param1, param0, (byte) 22, this.field_d, param3);
        if (param4 != 3) {
          up var7 = (up) null;
          dg.a((byte) -66, -25, -85, (up) null);
        }
    }

    final static void a(byte param0, int param1, int param2, up param3) {
        try {
          np.field_Jb.a(new rt(param2, param1, param3), 3);
          if (param0 != -120) {
            up var5 = (up) null;
            dg.a((byte) 119, -53, 107, (up) null);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte param0, int param1, long param2, boolean param3, int param4) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        String var7;
        String var8;
        String var9;
        StringBuilder var10;
        int var11;
        int var12_int;
        StringBuilder var12;
        int var13;
        StringBuilder var14;
        int var11Lifetime1;
        String var9Lifetime1;
        String var9Lifetime2;
        String var9Lifetime1Lifetime1;
        String var9Lifetime1Lifetime2;
        String var9Lifetime1Lifetime3;
        var13 = Kickabout.field_G;
        var14 = new StringBuilder(0);
        if (0L > param2) {
          discarded$0 = var14.append("-");
          param2 = -param2;
        }
        var7 = ".";
        var8 = ",";
        if (param4 == 1) {
          var8 = ".";
          var7 = ",";
        }
        if (2 == param4) {
          var8 = hp.field_a;
          var7 = ",";
        }
        if (3 == param4) {
          var8 = ".";
          var7 = var8;
          var9 = var7;
          var7 = var8;
          var7 = ",";
        }
        if (param4 == 4) {
          var7 = ",";
          var9Lifetime1 = var7;
          var9Lifetime1Lifetime1 = var7;
          var8 = ".";
          var9Lifetime1Lifetime2 = var8;
          var9Lifetime1Lifetime3 = var8;
        }
        var10 = new StringBuilder(0);
        for (var11 = 0; param1 > var11; var11++) {
          discarded$4 = var10.append(Integer.toString((int)(param2 % 10L)));
          param2 = param2 / 10L;
        }
        var12_int = 40 / ((param0 + 70) / 34);
        var11Lifetime1 = 0;
        if (param2 != 0L) {
          var12 = new StringBuilder(0);
          while (param2 > 0L) {
            if (param3 &&
              0 != var11Lifetime1 &&
              var11Lifetime1 % 3 == 0) {
              discarded$1 = var12.append(var8);
            }
            discarded$2 = var12.append(Integer.toString((int)(param2 % 10L)));
            param2 = param2 / 10L;
            var11Lifetime1++;
          }
          var9Lifetime2 = var12.toString();
        } else {
          var9Lifetime2 = "0";
        }
        if (0 >= var10.length()) {
          return var14.toString() + bo.a(-1, var9Lifetime2) + bo.a(-1, var10.toString());
        }
        discarded$3 = var10.append(var7);
        return var14.toString() + bo.a(-1, var9Lifetime2) + bo.a(-1, var10.toString());
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 64 % ((-24 - param0) / 57);
        field_f = null;
    }

    static {
        field_f = "Please log in to access this feature.";
        field_e = true;
        field_a = true;
        field_b = new java.util.zip.CRC32();
    }
}
