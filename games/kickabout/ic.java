/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static String field_b;
    static boolean field_f;
    static gr field_h;
    static String field_e;
    static hd field_a;
    static boolean field_i;
    static String field_c;
    static String field_g;
    static String field_j;
    static java.awt.Canvas field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, String param1, boolean param2, String param3, int param4, boolean param5, boolean param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Kickabout.field_G;
          var8 = param0 - 30;
          var9 = 16 + pb.field_C.c(param1, var8, 16);
          if (param6) {
            param4 = param4 - (var9 >> -315094239);
            break L0;
          } else {
            break L0;
          }
        }
        var10 = 15 + param7;
        if (!param5) {
          L1: {
            var11 = 8 + param4;
            if (param3 != null) {
              var9 += 34;
              var11 += 30;
              break L1;
            } else {
              break L1;
            }
          }
          var12 = 10;
          L2: while (true) {
            if (var9 > var12 << 787792417) {
              on.a(param7, param4, param0, var9, var12, 65793, 140);
              int discarded$2 = pb.field_C.a(param1, var10, var11, var8, var9, 16777215, -1, 0, 0, 16);
              if (param3 != null) {
                if (param2) {
                  un.field_d.d(param3, var10 + (var8 >> 382797409), var11 + -10, 16777215, -1);
                  return;
                } else {
                  un.field_d.a(param3, var10, -10 + var11, 16777215, -1);
                  return;
                }
              } else {
                return;
              }
            } else {
              var12 = var12 >> 1;
              continue L2;
            }
          }
        } else {
          L3: {
            ic.a(0.2927350103855133f, 0.23789334297180176f, 0.7446646690368652f, -0.029778925701975822f, -2.126020908355713f, (byte) -27, -1.3001068830490112f);
            var11 = 8 + param4;
            if (param3 != null) {
              var9 += 34;
              var11 += 30;
              break L3;
            } else {
              break L3;
            }
          }
          var12 = 10;
          L4: while (true) {
            if (var9 > var12 << 787792417) {
              on.a(param7, param4, param0, var9, var12, 65793, 140);
              int discarded$3 = pb.field_C.a(param1, var10, var11, var8, var9, 16777215, -1, 0, 0, 16);
              if (param3 != null) {
                if (param2) {
                  un.field_d.d(param3, var10 + (var8 >> 382797409), var11 + -10, 16777215, -1);
                  return;
                } else {
                  un.field_d.a(param3, var10, -10 + var11, 16777215, -1);
                  return;
                }
              } else {
                return;
              }
            } else {
              var12 = var12 >> 1;
              continue L4;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_h = null;
        field_c = null;
        if (param0 < 67) {
          field_h = null;
          field_a = null;
          field_e = null;
          field_j = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_j = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(float param0, float param1, float param2, float param3, float param4, byte param5, float param6) {
        jj var7 = null;
        if (param5 != -113) {
          return;
        } else {
          L0: {
            if (nm.field_k == null) {
              var7 = sk.field_d;
              nm.field_k = new dp((lq) (Object) var7);
              cb.field_d.a((lq) (Object) nm.field_k);
              break L0;
            } else {
              break L0;
            }
          }
          nm.field_k.a(param3);
          nm.field_k.f(param6);
          nm.field_k.c(param4);
          nm.field_k.b(param2);
          nm.field_k.e(param0);
          nm.field_k.d(param1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "League Point Thresholds";
        field_e = "Error connecting to server. Please try using a different server.";
        field_i = false;
        field_g = "Return to Main Menu";
        field_c = "You need a rating of <%1> to play with the current options.";
        field_j = "search";
        field_h = new gr();
    }
}
