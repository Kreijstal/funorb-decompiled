/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[][] field_d;
    static String field_c;
    static ck field_f;
    static String field_a;
    static w field_b;
    static String field_e;

    final static boolean a(char param0, byte param1) {
        if (param1 != 23) {
          fl.a(-17);
          if (48 > param0) {
            return false;
          }
          if (param0 <= 57) {
            return true;
          }
          return false;
        }
        if (48 > param0) {
          return false;
        }
        if (param0 <= 57) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_d = (int[][]) null;
        if (param0 == 29047) {
          field_c = null;
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          return;
        }
        field_c = (String) null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var11 = 0;
        int var13 = 0;
        int var12 = 0;
        int var5 = 255 & param3 >> 16;
        int var6 = 255 & param3 >> 8;
        int var7 = 255 & param3;
        int var8 = param0 >> 16 & 255;
        int var9 = (param0 & 65512) >> 8;
        int var10 = param0 & 255;
        if (param4 > 100) {
          if (param2 != 256) {
            var11 = param2 * ((-param1 + 256) * var5 + var8 * param1) >> 16;
            var13 = (var10 * param1 + (-param1 + 256) * var7) * param2 >> 16;
            var12 = param2 * (var9 * param1 + var6 * (256 - param1)) >> 16;
          } else {
            var12 = param1 * var9 + var6 * (256 - param1) >> 8;
            var13 = (256 - param1) * var7 + param1 * var10 >> 8;
            var11 = param1 * var8 + var5 * (-param1 + 256) >> 8;
          }
          return var11 << 16 | var12 << 8 | var13;
        }
        return 39;
    }

    final static ck[] a(int param0, int param1, int param2, int param3) {
        if (param3 == 32140) {
          return ce.a(1, -109, param0, param2, param1);
        }
        fl.a(-57, -94, 1, 10, -127);
        return ce.a(1, -109, param0, param2, param1);
    }

    final static void a(int param0, tj param1, nm param2, int param3, int param4, int param5, int param6) {
        pf var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          sl.$cfr$intArgs$a$2862dfd4c01c(param1.field_Rb, (int[]) null, 89, param2, param1, param1.field_Yb, param1.field_cc, -1, -1);
          w.field_H.a(true, 29072);
          w.field_H.a(0, (byte) -43, (int[]) null);
          if (param5 >= -53) {
            fl.a((byte) 105);
          }
          w.field_H.a(17);
          var12 = w.field_H;
          var8 = param3;
          var9 = param6;
          var10 = param4;
          var11 = param0;
          var12.field_h.b(var9, var8, 101, var11, var10);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "fl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
          return;
        }
        vb.field_V = param1;
        hb.field_Wb = param0;
        pa.field_fb = param4;
        ma.field_I = param2;
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, mm param5) {
        int var6_int = 2;
        if (se.field_S == param5) {
          var6_int = 1;
        }
        param5.a(param3, -var6_int + param4, param0 - var6_int, 0, -1);
        param5.a(param3, -var6_int + param4, param0, 0, -1);
        param5.a(param3, -var6_int + param4, param0 + var6_int, 0, -1);
        param5.a(param3, param4, param0 - var6_int, 0, -1);
        param5.a(param3, param4, param0 + var6_int, 0, -1);
        if (param1 != 256) {
          return;
        }
        try {
          param5.a(param3, param4 + var6_int, -var6_int + param0, 0, -1);
          param5.a(param3, var6_int + param4, param0, 0, -1);
          param5.a(param3, param4 + var6_int, param0 + var6_int, 0, -1);
          if (w.field_kb == param5) {
            param5.a(param3, param4 + 1, -var6_int + param0, 0, -1);
            param5.a(param3, -1 + param4, -var6_int + param0, 0, -1);
            param5.a(param3, param4 + var6_int, param0 - 1, 0, -1);
            param5.a(param3, param4 - var6_int, -1 + param0, 0, -1);
            param5.a(param3, param4 + var6_int, param0 + 1, 0, -1);
            param5.a(param3, param4 - var6_int, param0 + 1, 0, -1);
            param5.a(param3, param4 + 1, var6_int + param0, 0, -1);
            param5.a(param3, -1 + param4, var6_int + param0, 0, -1);
          }
          param5.a(param3, param4, param0, param2, -1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "fl.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0) {
        if (param0 != -108) {
          fl.a(29, -113, -26, -55, -110);
          return om.field_d;
        }
        return om.field_d;
    }

    static {
        field_a = "(<%0> players want to join)";
        field_d = new int[][]{null, new int[]{0, 0, 0, 1500, 2000}, null, null, null};
        field_c = "Join <%0>'s game";
        field_e = "Remove friend";
    }
}
