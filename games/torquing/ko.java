/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ko extends IOException {
    static int[] field_c;
    static String[] field_a;
    static boolean field_b;

    ko(String param0) {
        super(param0);
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4;
        int var4Lifetime1;
        if (param1 == 100) {
          var4 = 0;
          if (param3) {
            var4 += 4;
          }
          if (param0) {
            var4 += 2;
          }
          if (!param2) {
            return qa.field_k[var4];
          }
          var4++;
          return qa.field_k[var4];
        }
        field_a = (String[]) null;
        var4Lifetime1 = 0;
        if (param3) {
          var4Lifetime1 += 4;
        }
        if (param0) {
          var4Lifetime1 += 2;
        }
        if (!param2) {
          return qa.field_k[var4Lifetime1];
        }
        var4Lifetime1++;
        return qa.field_k[var4Lifetime1];
    }

    public static void a(byte param0) {
        if (param0 > -97) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8;
        var8 = Torquing.field_u;
        if (kn.field_e <= param6 &&
          qg.field_z >= param3 &&
          j.field_q <= param4 &&
          param1 <= qk.field_p) {
          if (1 == param2) {
            wo.a(param6, param0, param1, param3, true, param4);
          } else {
            w.a((byte) 72, param6, param2, param3, param4, param1, param0);
          }
        } else {
          if (param2 != 1) {
            jg.a(param0, param3, (byte) -115, param2, param4, param6, param1);
          } else {
            vd.a(param4, (byte) -89, param3, param0, param6, param1);
          }
        }
        if (param5 == -2910) {
          return;
        }
        ko.a(-31, 127, 39, -54, 93, 41, 35);
    }

    static {
        field_c = new int[25];
        dk.a(field_c, 0, 25, -1);
        field_c[1] = 0;
        field_c[16] = 6;
        field_c[3] = 2;
        field_b = false;
        field_a = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$feb7e63b59d8(boolean param0, int param1, boolean param2, boolean param3) {
        int var4;
        int var4Lifetime1;
        if (param1 == 100) {
          var4 = 0;
          if (param3) {
            var4 += 4;
          }
          if (param0) {
            var4 += 2;
          }
          if (!param2) {
            return qa.field_k[var4];
          }
          var4++;
          return qa.field_k[var4];
        }
        field_a = (String[]) null;
        var4Lifetime1 = 0;
        if (param3) {
          var4Lifetime1 += 4;
        }
        if (param0) {
          var4Lifetime1 += 2;
        }
        if (!param2) {
          return qa.field_k[var4Lifetime1];
        }
        var4Lifetime1++;
        return qa.field_k[var4Lifetime1];
    }
}
