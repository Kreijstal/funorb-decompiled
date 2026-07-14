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
        if (param1 == 23) {
          if (48 <= param0) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          fl.a(-17);
          if (48 <= param0) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 29047) {
          field_c = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var5 = 255 & param3 >> 1441470864;
        var6 = 255 & param3 >> 625963720;
        var7 = 255 & param3;
        var8 = param0 >> 2103927024 & 255;
        var9 = (param0 & 65512) >> 869977736;
        var10 = param0 & 255;
        if (param4 <= 100) {
          return 39;
        } else {
          L0: {
            if ((param2 ^ -1) == -257) {
              var12 = param1 * var9 + var6 * (256 + -param1) >> -1790237528;
              var13 = (256 - param1) * var7 + param1 * var10 >> -785939032;
              var11 = param1 * var8 + var5 * (-param1 + 256) >> 1045223560;
              break L0;
            } else {
              var11 = param2 * ((-param1 + 256) * var5 + var8 * param1) >> -58785616;
              var13 = (var10 * param1 + (-param1 + 256) * var7) * param2 >> 1520454800;
              var12 = param2 * (var9 * param1 + var6 * (256 + -param1)) >> 1169540304;
              break L0;
            }
          }
          return var11 << 757731664 | var12 << 364164456 | var13;
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 32140) {
          int discarded$2 = fl.a(-57, -94, 1, 10, -127);
          return ce.a(1, -109, param0, param2, param1);
        } else {
          return ce.a(1, -109, param0, param2, param1);
        }
    }

    final static void a(int param0, tj param1, nm param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pf var12 = null;
        sl.a(param1.field_Rb, (int[]) null, (byte) 89, param2, (w) (Object) param1, param1.field_Yb, param1.field_cc, -1, -1);
        w.field_H.a(true, 29072);
        w.field_H.a(0, (byte) -43, (int[]) null);
        if (param5 >= -53) {
          int discarded$1 = fl.a((byte) 105);
          w.field_H.a(17);
          var12 = w.field_H;
          var8 = param3;
          var9 = param6;
          var10 = param4;
          var11 = param0;
          var12.field_h.b(var9, var8, 101, var11, var10);
          return;
        } else {
          w.field_H.a(17);
          var12 = w.field_H;
          var8 = param3;
          var9 = param6;
          var10 = param4;
          var11 = param0;
          var12.field_h.b(var9, var8, 101, var11, var10);
          return;
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
        int var6 = 0;
        L0: {
          var6 = 2;
          if ((Object) (Object) se.field_S == (Object) (Object) param5) {
            var6 = 1;
            break L0;
          } else {
            break L0;
          }
        }
        param5.a(param3, -var6 + param4, param0 - var6, 0, -1);
        param5.a(param3, -var6 + param4, param0, 0, -1);
        param5.a(param3, -var6 + param4, param0 + var6, 0, -1);
        param5.a(param3, param4, param0 + -var6, 0, -1);
        param5.a(param3, param4, param0 - -var6, 0, -1);
        if (param1 == 256) {
          param5.a(param3, param4 - -var6, -var6 + param0, 0, -1);
          param5.a(param3, var6 + param4, param0, 0, -1);
          param5.a(param3, param4 + var6, param0 - -var6, 0, -1);
          if ((Object) (Object) w.field_kb != (Object) (Object) param5) {
            param5.a(param3, param4, param0, param2, -1);
            return;
          } else {
            param5.a(param3, param4 + 1, -var6 + param0, 0, -1);
            param5.a(param3, -1 + param4, -var6 + param0, 0, -1);
            param5.a(param3, param4 - -var6, param0 + -1, 0, -1);
            param5.a(param3, param4 + -var6, -1 + param0, 0, -1);
            param5.a(param3, param4 + var6, param0 + 1, 0, -1);
            param5.a(param3, param4 + -var6, param0 + 1, 0, -1);
            param5.a(param3, param4 - -1, var6 + param0, 0, -1);
            param5.a(param3, -1 + param4, var6 + param0, 0, -1);
            param5.a(param3, param4, param0, param2, -1);
            return;
          }
        } else {
          return;
        }
    }

    final static int a(byte param0) {
        if (param0 != -108) {
            int discarded$0 = fl.a(29, -113, -26, -55, -110);
            return om.field_d;
        }
        return om.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "(<%0> players want to join)";
        field_d = new int[][]{null, new int[5], null, null, null};
        field_c = "Join <%0>'s game";
        field_e = "Remove friend";
    }
}
